/*
               File: tbm24_map_item_impl
        Description: マッピング済部品マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:53.68
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
         A422TBM24_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A422TBM24_STUDY_ID) ;
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
      Form.getMeta().addItem("Description", "マッピング済部品マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"マッピング済部品マスタ"+"</legend>") ;
         wb_table3_27_0W31( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0W31e( boolean wbgen )
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

   public void wb_table3_27_0W31( boolean wbgen )
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
         wb_table4_33_0W31( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0W31e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM24_MAP_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM24_MAP_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0W31e( true) ;
      }
      else
      {
         wb_table3_27_0W31e( false) ;
      }
   }

   public void wb_table4_33_0W31( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_study_id_Internalname, "試験ID", "", "", lblTextblocktbm24_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A422TBM24_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM24_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A422TBM24_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A422TBM24_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM24_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbm24_dom_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A423TBM24_DOM_CD", A423TBM24_DOM_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DOM_CD_Internalname, GXutil.rtrim( A423TBM24_DOM_CD), GXutil.rtrim( localUtil.format( A423TBM24_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM24_DOM_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_DOM_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_dom_var_nm_Internalname, "ドメイン変数名", "", "", lblTextblocktbm24_dom_var_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A424TBM24_DOM_VAR_NM", A424TBM24_DOM_VAR_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DOM_VAR_NM_Internalname, GXutil.rtrim( A424TBM24_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A424TBM24_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM24_DOM_VAR_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_DOM_VAR_NM_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_dom_itm_grp_oid_Internalname, "OID", "", "", lblTextblocktbm24_dom_itm_grp_oid_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A617TBM24_DOM_ITM_GRP_OID", A617TBM24_DOM_ITM_GRP_OID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DOM_ITM_GRP_OID_Internalname, GXutil.rtrim( A617TBM24_DOM_ITM_GRP_OID), GXutil.rtrim( localUtil.format( A617TBM24_DOM_ITM_GRP_OID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM24_DOM_ITM_GRP_OID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_DOM_ITM_GRP_OID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_dom_itm_grp_attr_seq_Internalname, "ドメイン内項目グループ内連番", "", "", lblTextblocktbm24_dom_itm_grp_attr_seq_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A618TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A618TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname, GXutil.ltrim( localUtil.ntoc( A618TBM24_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")), ((edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A618TBM24_DOM_ITM_GRP_ATTR_SEQ), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A618TBM24_DOM_ITM_GRP_ATTR_SEQ), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_dom_itm_grp_rowno_Internalname, "項目グループ行番号", "", "", lblTextblocktbm24_dom_itm_grp_rowno_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A619TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A619TBM24_DOM_ITM_GRP_ROWNO, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DOM_ITM_GRP_ROWNO_Internalname, GXutil.ltrim( localUtil.ntoc( A619TBM24_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")), ((edtTBM24_DOM_ITM_GRP_ROWNO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A619TBM24_DOM_ITM_GRP_ROWNO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A619TBM24_DOM_ITM_GRP_ROWNO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM24_DOM_ITM_GRP_ROWNO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_DOM_ITM_GRP_ROWNO_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_crf_item_nm_Internalname, "CRF項目名", "", "", lblTextblocktbm24_crf_item_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A620TBM24_CRF_ITEM_NM", A620TBM24_CRF_ITEM_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM24_CRF_ITEM_NM_Internalname, GXutil.rtrim( A620TBM24_CRF_ITEM_NM), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", (short)(0), 1, edtTBM24_CRF_ITEM_NM_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "200", -1, "", true, "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_crf_item_div_Internalname, "CRF項目区分", "", "", lblTextblocktbm24_crf_item_div_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A425TBM24_CRF_ITEM_DIV", A425TBM24_CRF_ITEM_DIV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_CRF_ITEM_DIV_Internalname, GXutil.rtrim( A425TBM24_CRF_ITEM_DIV), GXutil.rtrim( localUtil.format( A425TBM24_CRF_ITEM_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM24_CRF_ITEM_DIV_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_CRF_ITEM_DIV_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_identification_cd_Internalname, "識別・選択リストコード", "", "", lblTextblocktbm24_identification_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A543TBM24_IDENTIFICATION_CD", A543TBM24_IDENTIFICATION_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_IDENTIFICATION_CD_Internalname, GXutil.rtrim( A543TBM24_IDENTIFICATION_CD), GXutil.rtrim( localUtil.format( A543TBM24_IDENTIFICATION_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM24_IDENTIFICATION_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_IDENTIFICATION_CD_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_text_maxlength_Internalname, "テキスト最大文字数", "", "", lblTextblocktbm24_text_maxlength_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A544TBM24_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A544TBM24_TEXT_MAXLENGTH, 3, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_TEXT_MAXLENGTH_Internalname, GXutil.ltrim( localUtil.ntoc( A544TBM24_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")), ((edtTBM24_TEXT_MAXLENGTH_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A544TBM24_TEXT_MAXLENGTH), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A544TBM24_TEXT_MAXLENGTH), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM24_TEXT_MAXLENGTH_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_TEXT_MAXLENGTH_Enabled, 0, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_text_maxrows_Internalname, "テキスト最大行数", "", "", lblTextblocktbm24_text_maxrows_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A545TBM24_TEXT_MAXROWS, 2, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_TEXT_MAXROWS_Internalname, GXutil.ltrim( localUtil.ntoc( A545TBM24_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")), ((edtTBM24_TEXT_MAXROWS_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A545TBM24_TEXT_MAXROWS), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A545TBM24_TEXT_MAXROWS), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM24_TEXT_MAXROWS_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_TEXT_MAXROWS_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_decimal_digits_Internalname, "小数点以下桁数", "", "", lblTextblocktbm24_decimal_digits_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A546TBM24_DECIMAL_DIGITS, 2, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DECIMAL_DIGITS_Internalname, GXutil.ltrim( localUtil.ntoc( A546TBM24_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")), ((edtTBM24_DECIMAL_DIGITS_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A546TBM24_DECIMAL_DIGITS), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A546TBM24_DECIMAL_DIGITS), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM24_DECIMAL_DIGITS_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_DECIMAL_DIGITS_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_text_Internalname, "表示テキスト", "", "", lblTextblocktbm24_text_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A547TBM24_TEXT", A547TBM24_TEXT);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM24_TEXT_Internalname, GXutil.rtrim( A547TBM24_TEXT), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", (short)(0), 1, edtTBM24_TEXT_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "200", -1, "", true, "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_fixed_value_Internalname, "固定値", "", "", lblTextblocktbm24_fixed_value_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_FIXED_VALUE", A548TBM24_FIXED_VALUE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_FIXED_VALUE_Internalname, GXutil.rtrim( A548TBM24_FIXED_VALUE), GXutil.rtrim( localUtil.format( A548TBM24_FIXED_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtTBM24_FIXED_VALUE_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_FIXED_VALUE_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_chk_false_inner_value_Internalname, "チェックボックスfalse時内部値", "", "", lblTextblocktbm24_chk_false_inner_value_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_CHK_FALSE_INNER_VALUE", A549TBM24_CHK_FALSE_INNER_VALUE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_CHK_FALSE_INNER_VALUE_Internalname, GXutil.rtrim( A549TBM24_CHK_FALSE_INNER_VALUE), GXutil.rtrim( localUtil.format( A549TBM24_CHK_FALSE_INNER_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(108);\"", "", "", "", "", edtTBM24_CHK_FALSE_INNER_VALUE_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_CHK_FALSE_INNER_VALUE_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_required_input_flg_Internalname, "必須入力フラグ", "", "", lblTextblocktbm24_required_input_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A621TBM24_REQUIRED_INPUT_FLG", A621TBM24_REQUIRED_INPUT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_REQUIRED_INPUT_FLG_Internalname, GXutil.rtrim( A621TBM24_REQUIRED_INPUT_FLG), GXutil.rtrim( localUtil.format( A621TBM24_REQUIRED_INPUT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(113);\"", "", "", "", "", edtTBM24_REQUIRED_INPUT_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_REQUIRED_INPUT_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_min_value_Internalname, "入力下限値", "", "", lblTextblocktbm24_min_value_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A622TBM24_MIN_VALUE", A622TBM24_MIN_VALUE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_MIN_VALUE_Internalname, GXutil.rtrim( A622TBM24_MIN_VALUE), GXutil.rtrim( localUtil.format( A622TBM24_MIN_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(118);\"", "", "", "", "", edtTBM24_MIN_VALUE_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_MIN_VALUE_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_max_value_Internalname, "入力上限値", "", "", lblTextblocktbm24_max_value_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A623TBM24_MAX_VALUE", A623TBM24_MAX_VALUE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_MAX_VALUE_Internalname, GXutil.rtrim( A623TBM24_MAX_VALUE), GXutil.rtrim( localUtil.format( A623TBM24_MAX_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(123);\"", "", "", "", "", edtTBM24_MAX_VALUE_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_MAX_VALUE_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_order_Internalname, "表示順", "", "", lblTextblocktbm24_order_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A426TBM24_ORDER", GXutil.ltrim( GXutil.str( A426TBM24_ORDER, 5, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A426TBM24_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBM24_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A426TBM24_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A426TBM24_ORDER), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(128);\"", "", "", "", "", edtTBM24_ORDER_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_ORDER_Enabled, 0, 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm24_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A427TBM24_DEL_FLG", A427TBM24_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_DEL_FLG_Internalname, GXutil.rtrim( A427TBM24_DEL_FLG), GXutil.rtrim( localUtil.format( A427TBM24_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(133);\"", "", "", "", "", edtTBM24_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm24_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A428TBM24_CRT_DATETIME", localUtil.ttoc( A428TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM24_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_CRT_DATETIME_Internalname, localUtil.format(A428TBM24_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A428TBM24_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(138);\"", "", "", "", "", edtTBM24_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM24_MAP_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM24_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM24_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm24_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A429TBM24_CRT_USER_ID", A429TBM24_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_CRT_USER_ID_Internalname, GXutil.rtrim( A429TBM24_CRT_USER_ID), GXutil.rtrim( localUtil.format( A429TBM24_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(143);\"", "", "", "", "", edtTBM24_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm24_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A430TBM24_CRT_PROG_NM", A430TBM24_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_CRT_PROG_NM_Internalname, GXutil.rtrim( A430TBM24_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A430TBM24_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(148);\"", "", "", "", "", edtTBM24_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm24_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A431TBM24_UPD_DATETIME", localUtil.ttoc( A431TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM24_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_UPD_DATETIME_Internalname, localUtil.format(A431TBM24_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A431TBM24_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(153);\"", "", "", "", "", edtTBM24_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM24_MAP_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM24_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM24_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm24_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A432TBM24_UPD_USER_ID", A432TBM24_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_UPD_USER_ID_Internalname, GXutil.rtrim( A432TBM24_UPD_USER_ID), GXutil.rtrim( localUtil.format( A432TBM24_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(158);\"", "", "", "", "", edtTBM24_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm24_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A433TBM24_UPD_PROG_NM", A433TBM24_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_UPD_PROG_NM_Internalname, GXutil.rtrim( A433TBM24_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A433TBM24_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(163);\"", "", "", "", "", edtTBM24_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm24_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm24_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A434TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM24_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A434TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM24_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A434TBM24_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A434TBM24_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(168);\"", "", "", "", "", edtTBM24_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM24_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM24_MAP_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0W31e( true) ;
      }
      else
      {
         wb_table4_33_0W31e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM24_MAP_ITEM.htm");
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
               A422TBM24_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
            }
            else
            {
               A422TBM24_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM24_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
            }
            A423TBM24_DOM_CD = httpContext.cgiGet( edtTBM24_DOM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A423TBM24_DOM_CD", A423TBM24_DOM_CD);
            A424TBM24_DOM_VAR_NM = httpContext.cgiGet( edtTBM24_DOM_VAR_NM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A424TBM24_DOM_VAR_NM", A424TBM24_DOM_VAR_NM);
            A617TBM24_DOM_ITM_GRP_OID = httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_OID_Internalname) ;
            n617TBM24_DOM_ITM_GRP_OID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A617TBM24_DOM_ITM_GRP_OID", A617TBM24_DOM_ITM_GRP_OID);
            n617TBM24_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A617TBM24_DOM_ITM_GRP_OID)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_DOM_ITM_GRP_ATTR_SEQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A618TBM24_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
               n618TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A618TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A618TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
            }
            else
            {
               A618TBM24_DOM_ITM_GRP_ATTR_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",")) ;
               n618TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A618TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A618TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
            }
            n618TBM24_DOM_ITM_GRP_ATTR_SEQ = ((0==A618TBM24_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_DOM_ITM_GRP_ROWNO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_DOM_ITM_GRP_ROWNO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A619TBM24_DOM_ITM_GRP_ROWNO = (short)(0) ;
               n619TBM24_DOM_ITM_GRP_ROWNO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A619TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A619TBM24_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            else
            {
               A619TBM24_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM24_DOM_ITM_GRP_ROWNO_Internalname), ".", ",")) ;
               n619TBM24_DOM_ITM_GRP_ROWNO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A619TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A619TBM24_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            n619TBM24_DOM_ITM_GRP_ROWNO = ((0==A619TBM24_DOM_ITM_GRP_ROWNO) ? true : false) ;
            A620TBM24_CRF_ITEM_NM = httpContext.cgiGet( edtTBM24_CRF_ITEM_NM_Internalname) ;
            n620TBM24_CRF_ITEM_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A620TBM24_CRF_ITEM_NM", A620TBM24_CRF_ITEM_NM);
            n620TBM24_CRF_ITEM_NM = ((GXutil.strcmp("", A620TBM24_CRF_ITEM_NM)==0) ? true : false) ;
            A425TBM24_CRF_ITEM_DIV = httpContext.cgiGet( edtTBM24_CRF_ITEM_DIV_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A425TBM24_CRF_ITEM_DIV", A425TBM24_CRF_ITEM_DIV);
            A543TBM24_IDENTIFICATION_CD = httpContext.cgiGet( edtTBM24_IDENTIFICATION_CD_Internalname) ;
            n543TBM24_IDENTIFICATION_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A543TBM24_IDENTIFICATION_CD", A543TBM24_IDENTIFICATION_CD);
            n543TBM24_IDENTIFICATION_CD = ((GXutil.strcmp("", A543TBM24_IDENTIFICATION_CD)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXLENGTH_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXLENGTH_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_TEXT_MAXLENGTH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_TEXT_MAXLENGTH_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A544TBM24_TEXT_MAXLENGTH = (short)(0) ;
               n544TBM24_TEXT_MAXLENGTH = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A544TBM24_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A544TBM24_TEXT_MAXLENGTH, 3, 0)));
            }
            else
            {
               A544TBM24_TEXT_MAXLENGTH = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXLENGTH_Internalname), ".", ",")) ;
               n544TBM24_TEXT_MAXLENGTH = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A544TBM24_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A544TBM24_TEXT_MAXLENGTH, 3, 0)));
            }
            n544TBM24_TEXT_MAXLENGTH = ((0==A544TBM24_TEXT_MAXLENGTH) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXROWS_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXROWS_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_TEXT_MAXROWS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_TEXT_MAXROWS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A545TBM24_TEXT_MAXROWS = (byte)(0) ;
               n545TBM24_TEXT_MAXROWS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A545TBM24_TEXT_MAXROWS, 2, 0)));
            }
            else
            {
               A545TBM24_TEXT_MAXROWS = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM24_TEXT_MAXROWS_Internalname), ".", ",")) ;
               n545TBM24_TEXT_MAXROWS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A545TBM24_TEXT_MAXROWS, 2, 0)));
            }
            n545TBM24_TEXT_MAXROWS = ((0==A545TBM24_TEXT_MAXROWS) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DECIMAL_DIGITS_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_DECIMAL_DIGITS_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_DECIMAL_DIGITS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_DECIMAL_DIGITS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A546TBM24_DECIMAL_DIGITS = (byte)(0) ;
               n546TBM24_DECIMAL_DIGITS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A546TBM24_DECIMAL_DIGITS, 2, 0)));
            }
            else
            {
               A546TBM24_DECIMAL_DIGITS = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM24_DECIMAL_DIGITS_Internalname), ".", ",")) ;
               n546TBM24_DECIMAL_DIGITS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A546TBM24_DECIMAL_DIGITS, 2, 0)));
            }
            n546TBM24_DECIMAL_DIGITS = ((0==A546TBM24_DECIMAL_DIGITS) ? true : false) ;
            A547TBM24_TEXT = httpContext.cgiGet( edtTBM24_TEXT_Internalname) ;
            n547TBM24_TEXT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A547TBM24_TEXT", A547TBM24_TEXT);
            n547TBM24_TEXT = ((GXutil.strcmp("", A547TBM24_TEXT)==0) ? true : false) ;
            A548TBM24_FIXED_VALUE = httpContext.cgiGet( edtTBM24_FIXED_VALUE_Internalname) ;
            n548TBM24_FIXED_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_FIXED_VALUE", A548TBM24_FIXED_VALUE);
            n548TBM24_FIXED_VALUE = ((GXutil.strcmp("", A548TBM24_FIXED_VALUE)==0) ? true : false) ;
            A549TBM24_CHK_FALSE_INNER_VALUE = httpContext.cgiGet( edtTBM24_CHK_FALSE_INNER_VALUE_Internalname) ;
            n549TBM24_CHK_FALSE_INNER_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_CHK_FALSE_INNER_VALUE", A549TBM24_CHK_FALSE_INNER_VALUE);
            n549TBM24_CHK_FALSE_INNER_VALUE = ((GXutil.strcmp("", A549TBM24_CHK_FALSE_INNER_VALUE)==0) ? true : false) ;
            A621TBM24_REQUIRED_INPUT_FLG = httpContext.cgiGet( edtTBM24_REQUIRED_INPUT_FLG_Internalname) ;
            n621TBM24_REQUIRED_INPUT_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A621TBM24_REQUIRED_INPUT_FLG", A621TBM24_REQUIRED_INPUT_FLG);
            n621TBM24_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A621TBM24_REQUIRED_INPUT_FLG)==0) ? true : false) ;
            A622TBM24_MIN_VALUE = httpContext.cgiGet( edtTBM24_MIN_VALUE_Internalname) ;
            n622TBM24_MIN_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A622TBM24_MIN_VALUE", A622TBM24_MIN_VALUE);
            n622TBM24_MIN_VALUE = ((GXutil.strcmp("", A622TBM24_MIN_VALUE)==0) ? true : false) ;
            A623TBM24_MAX_VALUE = httpContext.cgiGet( edtTBM24_MAX_VALUE_Internalname) ;
            n623TBM24_MAX_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A623TBM24_MAX_VALUE", A623TBM24_MAX_VALUE);
            n623TBM24_MAX_VALUE = ((GXutil.strcmp("", A623TBM24_MAX_VALUE)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_ORDER_Internalname), ".", ",") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A426TBM24_ORDER = 0 ;
               n426TBM24_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A426TBM24_ORDER", GXutil.ltrim( GXutil.str( A426TBM24_ORDER, 5, 0)));
            }
            else
            {
               A426TBM24_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM24_ORDER_Internalname), ".", ",")) ;
               n426TBM24_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A426TBM24_ORDER", GXutil.ltrim( GXutil.str( A426TBM24_ORDER, 5, 0)));
            }
            n426TBM24_ORDER = ((0==A426TBM24_ORDER) ? true : false) ;
            A427TBM24_DEL_FLG = httpContext.cgiGet( edtTBM24_DEL_FLG_Internalname) ;
            n427TBM24_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A427TBM24_DEL_FLG", A427TBM24_DEL_FLG);
            n427TBM24_DEL_FLG = ((GXutil.strcmp("", A427TBM24_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM24_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM24_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A428TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n428TBM24_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A428TBM24_CRT_DATETIME", localUtil.ttoc( A428TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A428TBM24_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM24_CRT_DATETIME_Internalname)) ;
               n428TBM24_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A428TBM24_CRT_DATETIME", localUtil.ttoc( A428TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n428TBM24_CRT_DATETIME = (GXutil.nullDate().equals(A428TBM24_CRT_DATETIME) ? true : false) ;
            A429TBM24_CRT_USER_ID = httpContext.cgiGet( edtTBM24_CRT_USER_ID_Internalname) ;
            n429TBM24_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A429TBM24_CRT_USER_ID", A429TBM24_CRT_USER_ID);
            n429TBM24_CRT_USER_ID = ((GXutil.strcmp("", A429TBM24_CRT_USER_ID)==0) ? true : false) ;
            A430TBM24_CRT_PROG_NM = httpContext.cgiGet( edtTBM24_CRT_PROG_NM_Internalname) ;
            n430TBM24_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A430TBM24_CRT_PROG_NM", A430TBM24_CRT_PROG_NM);
            n430TBM24_CRT_PROG_NM = ((GXutil.strcmp("", A430TBM24_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM24_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM24_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A431TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n431TBM24_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A431TBM24_UPD_DATETIME", localUtil.ttoc( A431TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A431TBM24_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM24_UPD_DATETIME_Internalname)) ;
               n431TBM24_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A431TBM24_UPD_DATETIME", localUtil.ttoc( A431TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n431TBM24_UPD_DATETIME = (GXutil.nullDate().equals(A431TBM24_UPD_DATETIME) ? true : false) ;
            A432TBM24_UPD_USER_ID = httpContext.cgiGet( edtTBM24_UPD_USER_ID_Internalname) ;
            n432TBM24_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A432TBM24_UPD_USER_ID", A432TBM24_UPD_USER_ID);
            n432TBM24_UPD_USER_ID = ((GXutil.strcmp("", A432TBM24_UPD_USER_ID)==0) ? true : false) ;
            A433TBM24_UPD_PROG_NM = httpContext.cgiGet( edtTBM24_UPD_PROG_NM_Internalname) ;
            n433TBM24_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A433TBM24_UPD_PROG_NM", A433TBM24_UPD_PROG_NM);
            n433TBM24_UPD_PROG_NM = ((GXutil.strcmp("", A433TBM24_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM24_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM24_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM24_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A434TBM24_UPD_CNT = 0 ;
               n434TBM24_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A434TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)));
            }
            else
            {
               A434TBM24_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM24_UPD_CNT_Internalname), ".", ",") ;
               n434TBM24_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A434TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)));
            }
            n434TBM24_UPD_CNT = ((0==A434TBM24_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z422TBM24_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z422TBM24_STUDY_ID"), ".", ",") ;
            Z423TBM24_DOM_CD = httpContext.cgiGet( "Z423TBM24_DOM_CD") ;
            Z424TBM24_DOM_VAR_NM = httpContext.cgiGet( "Z424TBM24_DOM_VAR_NM") ;
            Z425TBM24_CRF_ITEM_DIV = httpContext.cgiGet( "Z425TBM24_CRF_ITEM_DIV") ;
            Z428TBM24_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z428TBM24_CRT_DATETIME"), 0) ;
            n428TBM24_CRT_DATETIME = (GXutil.nullDate().equals(A428TBM24_CRT_DATETIME) ? true : false) ;
            Z429TBM24_CRT_USER_ID = httpContext.cgiGet( "Z429TBM24_CRT_USER_ID") ;
            n429TBM24_CRT_USER_ID = ((GXutil.strcmp("", A429TBM24_CRT_USER_ID)==0) ? true : false) ;
            Z431TBM24_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z431TBM24_UPD_DATETIME"), 0) ;
            n431TBM24_UPD_DATETIME = (GXutil.nullDate().equals(A431TBM24_UPD_DATETIME) ? true : false) ;
            Z432TBM24_UPD_USER_ID = httpContext.cgiGet( "Z432TBM24_UPD_USER_ID") ;
            n432TBM24_UPD_USER_ID = ((GXutil.strcmp("", A432TBM24_UPD_USER_ID)==0) ? true : false) ;
            Z434TBM24_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z434TBM24_UPD_CNT"), ".", ",") ;
            n434TBM24_UPD_CNT = ((0==A434TBM24_UPD_CNT) ? true : false) ;
            Z617TBM24_DOM_ITM_GRP_OID = httpContext.cgiGet( "Z617TBM24_DOM_ITM_GRP_OID") ;
            n617TBM24_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A617TBM24_DOM_ITM_GRP_OID)==0) ? true : false) ;
            Z618TBM24_DOM_ITM_GRP_ATTR_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( "Z618TBM24_DOM_ITM_GRP_ATTR_SEQ"), ".", ",")) ;
            n618TBM24_DOM_ITM_GRP_ATTR_SEQ = ((0==A618TBM24_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
            Z619TBM24_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( "Z619TBM24_DOM_ITM_GRP_ROWNO"), ".", ",")) ;
            n619TBM24_DOM_ITM_GRP_ROWNO = ((0==A619TBM24_DOM_ITM_GRP_ROWNO) ? true : false) ;
            Z620TBM24_CRF_ITEM_NM = httpContext.cgiGet( "Z620TBM24_CRF_ITEM_NM") ;
            n620TBM24_CRF_ITEM_NM = ((GXutil.strcmp("", A620TBM24_CRF_ITEM_NM)==0) ? true : false) ;
            Z543TBM24_IDENTIFICATION_CD = httpContext.cgiGet( "Z543TBM24_IDENTIFICATION_CD") ;
            n543TBM24_IDENTIFICATION_CD = ((GXutil.strcmp("", A543TBM24_IDENTIFICATION_CD)==0) ? true : false) ;
            Z544TBM24_TEXT_MAXLENGTH = (short)(localUtil.ctol( httpContext.cgiGet( "Z544TBM24_TEXT_MAXLENGTH"), ".", ",")) ;
            n544TBM24_TEXT_MAXLENGTH = ((0==A544TBM24_TEXT_MAXLENGTH) ? true : false) ;
            Z545TBM24_TEXT_MAXROWS = (byte)(localUtil.ctol( httpContext.cgiGet( "Z545TBM24_TEXT_MAXROWS"), ".", ",")) ;
            n545TBM24_TEXT_MAXROWS = ((0==A545TBM24_TEXT_MAXROWS) ? true : false) ;
            Z546TBM24_DECIMAL_DIGITS = (byte)(localUtil.ctol( httpContext.cgiGet( "Z546TBM24_DECIMAL_DIGITS"), ".", ",")) ;
            n546TBM24_DECIMAL_DIGITS = ((0==A546TBM24_DECIMAL_DIGITS) ? true : false) ;
            Z547TBM24_TEXT = httpContext.cgiGet( "Z547TBM24_TEXT") ;
            n547TBM24_TEXT = ((GXutil.strcmp("", A547TBM24_TEXT)==0) ? true : false) ;
            Z548TBM24_FIXED_VALUE = httpContext.cgiGet( "Z548TBM24_FIXED_VALUE") ;
            n548TBM24_FIXED_VALUE = ((GXutil.strcmp("", A548TBM24_FIXED_VALUE)==0) ? true : false) ;
            Z549TBM24_CHK_FALSE_INNER_VALUE = httpContext.cgiGet( "Z549TBM24_CHK_FALSE_INNER_VALUE") ;
            n549TBM24_CHK_FALSE_INNER_VALUE = ((GXutil.strcmp("", A549TBM24_CHK_FALSE_INNER_VALUE)==0) ? true : false) ;
            Z621TBM24_REQUIRED_INPUT_FLG = httpContext.cgiGet( "Z621TBM24_REQUIRED_INPUT_FLG") ;
            n621TBM24_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A621TBM24_REQUIRED_INPUT_FLG)==0) ? true : false) ;
            Z622TBM24_MIN_VALUE = httpContext.cgiGet( "Z622TBM24_MIN_VALUE") ;
            n622TBM24_MIN_VALUE = ((GXutil.strcmp("", A622TBM24_MIN_VALUE)==0) ? true : false) ;
            Z623TBM24_MAX_VALUE = httpContext.cgiGet( "Z623TBM24_MAX_VALUE") ;
            n623TBM24_MAX_VALUE = ((GXutil.strcmp("", A623TBM24_MAX_VALUE)==0) ? true : false) ;
            Z426TBM24_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( "Z426TBM24_ORDER"), ".", ",")) ;
            n426TBM24_ORDER = ((0==A426TBM24_ORDER) ? true : false) ;
            Z427TBM24_DEL_FLG = httpContext.cgiGet( "Z427TBM24_DEL_FLG") ;
            n427TBM24_DEL_FLG = ((GXutil.strcmp("", A427TBM24_DEL_FLG)==0) ? true : false) ;
            Z430TBM24_CRT_PROG_NM = httpContext.cgiGet( "Z430TBM24_CRT_PROG_NM") ;
            n430TBM24_CRT_PROG_NM = ((GXutil.strcmp("", A430TBM24_CRT_PROG_NM)==0) ? true : false) ;
            Z433TBM24_UPD_PROG_NM = httpContext.cgiGet( "Z433TBM24_UPD_PROG_NM") ;
            n433TBM24_UPD_PROG_NM = ((GXutil.strcmp("", A433TBM24_UPD_PROG_NM)==0) ? true : false) ;
            O434TBM24_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O434TBM24_UPD_CNT"), ".", ",") ;
            n434TBM24_UPD_CNT = ((0==A434TBM24_UPD_CNT) ? true : false) ;
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
               A422TBM24_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
               A423TBM24_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A423TBM24_DOM_CD", A423TBM24_DOM_CD);
               A424TBM24_DOM_VAR_NM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A424TBM24_DOM_VAR_NM", A424TBM24_DOM_VAR_NM);
               A425TBM24_CRF_ITEM_DIV = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A425TBM24_CRF_ITEM_DIV", A425TBM24_CRF_ITEM_DIV);
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120W2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A423TBM24_DOM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A424TBM24_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A617TBM24_DOM_ITM_GRP_OID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A618TBM24_DOM_ITM_GRP_ATTR_SEQ, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A619TBM24_DOM_ITM_GRP_ROWNO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A620TBM24_CRF_ITEM_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A425TBM24_CRF_ITEM_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A543TBM24_IDENTIFICATION_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A544TBM24_TEXT_MAXLENGTH, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A545TBM24_TEXT_MAXROWS, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A546TBM24_DECIMAL_DIGITS, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A547TBM24_TEXT + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A548TBM24_FIXED_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A549TBM24_CHK_FALSE_INNER_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A621TBM24_REQUIRED_INPUT_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A622TBM24_MIN_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A623TBM24_MAX_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A426TBM24_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A427TBM24_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A428TBM24_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm24_map_item_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A428TBM24_CRT_DATETIME", localUtil.ttoc( A428TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A429TBM24_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A430TBM24_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A431TBM24_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm24_map_item_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A431TBM24_UPD_DATETIME", localUtil.ttoc( A431TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A432TBM24_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A433TBM24_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1180( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0W31( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z428TBM24_CRT_DATETIME = T000W3_A428TBM24_CRT_DATETIME[0] ;
            Z429TBM24_CRT_USER_ID = T000W3_A429TBM24_CRT_USER_ID[0] ;
            Z431TBM24_UPD_DATETIME = T000W3_A431TBM24_UPD_DATETIME[0] ;
            Z432TBM24_UPD_USER_ID = T000W3_A432TBM24_UPD_USER_ID[0] ;
            Z434TBM24_UPD_CNT = T000W3_A434TBM24_UPD_CNT[0] ;
            Z617TBM24_DOM_ITM_GRP_OID = T000W3_A617TBM24_DOM_ITM_GRP_OID[0] ;
            Z618TBM24_DOM_ITM_GRP_ATTR_SEQ = T000W3_A618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
            Z619TBM24_DOM_ITM_GRP_ROWNO = T000W3_A619TBM24_DOM_ITM_GRP_ROWNO[0] ;
            Z620TBM24_CRF_ITEM_NM = T000W3_A620TBM24_CRF_ITEM_NM[0] ;
            Z543TBM24_IDENTIFICATION_CD = T000W3_A543TBM24_IDENTIFICATION_CD[0] ;
            Z544TBM24_TEXT_MAXLENGTH = T000W3_A544TBM24_TEXT_MAXLENGTH[0] ;
            Z545TBM24_TEXT_MAXROWS = T000W3_A545TBM24_TEXT_MAXROWS[0] ;
            Z546TBM24_DECIMAL_DIGITS = T000W3_A546TBM24_DECIMAL_DIGITS[0] ;
            Z547TBM24_TEXT = T000W3_A547TBM24_TEXT[0] ;
            Z548TBM24_FIXED_VALUE = T000W3_A548TBM24_FIXED_VALUE[0] ;
            Z549TBM24_CHK_FALSE_INNER_VALUE = T000W3_A549TBM24_CHK_FALSE_INNER_VALUE[0] ;
            Z621TBM24_REQUIRED_INPUT_FLG = T000W3_A621TBM24_REQUIRED_INPUT_FLG[0] ;
            Z622TBM24_MIN_VALUE = T000W3_A622TBM24_MIN_VALUE[0] ;
            Z623TBM24_MAX_VALUE = T000W3_A623TBM24_MAX_VALUE[0] ;
            Z426TBM24_ORDER = T000W3_A426TBM24_ORDER[0] ;
            Z427TBM24_DEL_FLG = T000W3_A427TBM24_DEL_FLG[0] ;
            Z430TBM24_CRT_PROG_NM = T000W3_A430TBM24_CRT_PROG_NM[0] ;
            Z433TBM24_UPD_PROG_NM = T000W3_A433TBM24_UPD_PROG_NM[0] ;
         }
         else
         {
            Z428TBM24_CRT_DATETIME = A428TBM24_CRT_DATETIME ;
            Z429TBM24_CRT_USER_ID = A429TBM24_CRT_USER_ID ;
            Z431TBM24_UPD_DATETIME = A431TBM24_UPD_DATETIME ;
            Z432TBM24_UPD_USER_ID = A432TBM24_UPD_USER_ID ;
            Z434TBM24_UPD_CNT = A434TBM24_UPD_CNT ;
            Z617TBM24_DOM_ITM_GRP_OID = A617TBM24_DOM_ITM_GRP_OID ;
            Z618TBM24_DOM_ITM_GRP_ATTR_SEQ = A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
            Z619TBM24_DOM_ITM_GRP_ROWNO = A619TBM24_DOM_ITM_GRP_ROWNO ;
            Z620TBM24_CRF_ITEM_NM = A620TBM24_CRF_ITEM_NM ;
            Z543TBM24_IDENTIFICATION_CD = A543TBM24_IDENTIFICATION_CD ;
            Z544TBM24_TEXT_MAXLENGTH = A544TBM24_TEXT_MAXLENGTH ;
            Z545TBM24_TEXT_MAXROWS = A545TBM24_TEXT_MAXROWS ;
            Z546TBM24_DECIMAL_DIGITS = A546TBM24_DECIMAL_DIGITS ;
            Z547TBM24_TEXT = A547TBM24_TEXT ;
            Z548TBM24_FIXED_VALUE = A548TBM24_FIXED_VALUE ;
            Z549TBM24_CHK_FALSE_INNER_VALUE = A549TBM24_CHK_FALSE_INNER_VALUE ;
            Z621TBM24_REQUIRED_INPUT_FLG = A621TBM24_REQUIRED_INPUT_FLG ;
            Z622TBM24_MIN_VALUE = A622TBM24_MIN_VALUE ;
            Z623TBM24_MAX_VALUE = A623TBM24_MAX_VALUE ;
            Z426TBM24_ORDER = A426TBM24_ORDER ;
            Z427TBM24_DEL_FLG = A427TBM24_DEL_FLG ;
            Z430TBM24_CRT_PROG_NM = A430TBM24_CRT_PROG_NM ;
            Z433TBM24_UPD_PROG_NM = A433TBM24_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z423TBM24_DOM_CD = A423TBM24_DOM_CD ;
         Z424TBM24_DOM_VAR_NM = A424TBM24_DOM_VAR_NM ;
         Z425TBM24_CRF_ITEM_DIV = A425TBM24_CRF_ITEM_DIV ;
         Z428TBM24_CRT_DATETIME = A428TBM24_CRT_DATETIME ;
         Z429TBM24_CRT_USER_ID = A429TBM24_CRT_USER_ID ;
         Z431TBM24_UPD_DATETIME = A431TBM24_UPD_DATETIME ;
         Z432TBM24_UPD_USER_ID = A432TBM24_UPD_USER_ID ;
         Z434TBM24_UPD_CNT = A434TBM24_UPD_CNT ;
         Z617TBM24_DOM_ITM_GRP_OID = A617TBM24_DOM_ITM_GRP_OID ;
         Z618TBM24_DOM_ITM_GRP_ATTR_SEQ = A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
         Z619TBM24_DOM_ITM_GRP_ROWNO = A619TBM24_DOM_ITM_GRP_ROWNO ;
         Z620TBM24_CRF_ITEM_NM = A620TBM24_CRF_ITEM_NM ;
         Z543TBM24_IDENTIFICATION_CD = A543TBM24_IDENTIFICATION_CD ;
         Z544TBM24_TEXT_MAXLENGTH = A544TBM24_TEXT_MAXLENGTH ;
         Z545TBM24_TEXT_MAXROWS = A545TBM24_TEXT_MAXROWS ;
         Z546TBM24_DECIMAL_DIGITS = A546TBM24_DECIMAL_DIGITS ;
         Z547TBM24_TEXT = A547TBM24_TEXT ;
         Z548TBM24_FIXED_VALUE = A548TBM24_FIXED_VALUE ;
         Z549TBM24_CHK_FALSE_INNER_VALUE = A549TBM24_CHK_FALSE_INNER_VALUE ;
         Z621TBM24_REQUIRED_INPUT_FLG = A621TBM24_REQUIRED_INPUT_FLG ;
         Z622TBM24_MIN_VALUE = A622TBM24_MIN_VALUE ;
         Z623TBM24_MAX_VALUE = A623TBM24_MAX_VALUE ;
         Z426TBM24_ORDER = A426TBM24_ORDER ;
         Z427TBM24_DEL_FLG = A427TBM24_DEL_FLG ;
         Z430TBM24_CRT_PROG_NM = A430TBM24_CRT_PROG_NM ;
         Z433TBM24_UPD_PROG_NM = A433TBM24_UPD_PROG_NM ;
         Z422TBM24_STUDY_ID = A422TBM24_STUDY_ID ;
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
      pr_default.execute(3, new Object[] {new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A428TBM24_CRT_DATETIME = T000W5_A428TBM24_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A428TBM24_CRT_DATETIME", localUtil.ttoc( A428TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n428TBM24_CRT_DATETIME = T000W5_n428TBM24_CRT_DATETIME[0] ;
         A429TBM24_CRT_USER_ID = T000W5_A429TBM24_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A429TBM24_CRT_USER_ID", A429TBM24_CRT_USER_ID);
         n429TBM24_CRT_USER_ID = T000W5_n429TBM24_CRT_USER_ID[0] ;
         A431TBM24_UPD_DATETIME = T000W5_A431TBM24_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A431TBM24_UPD_DATETIME", localUtil.ttoc( A431TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n431TBM24_UPD_DATETIME = T000W5_n431TBM24_UPD_DATETIME[0] ;
         A432TBM24_UPD_USER_ID = T000W5_A432TBM24_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A432TBM24_UPD_USER_ID", A432TBM24_UPD_USER_ID);
         n432TBM24_UPD_USER_ID = T000W5_n432TBM24_UPD_USER_ID[0] ;
         A434TBM24_UPD_CNT = T000W5_A434TBM24_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A434TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)));
         n434TBM24_UPD_CNT = T000W5_n434TBM24_UPD_CNT[0] ;
         A617TBM24_DOM_ITM_GRP_OID = T000W5_A617TBM24_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A617TBM24_DOM_ITM_GRP_OID", A617TBM24_DOM_ITM_GRP_OID);
         n617TBM24_DOM_ITM_GRP_OID = T000W5_n617TBM24_DOM_ITM_GRP_OID[0] ;
         A618TBM24_DOM_ITM_GRP_ATTR_SEQ = T000W5_A618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A618TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A618TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         n618TBM24_DOM_ITM_GRP_ATTR_SEQ = T000W5_n618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A619TBM24_DOM_ITM_GRP_ROWNO = T000W5_A619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A619TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A619TBM24_DOM_ITM_GRP_ROWNO, 4, 0)));
         n619TBM24_DOM_ITM_GRP_ROWNO = T000W5_n619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A620TBM24_CRF_ITEM_NM = T000W5_A620TBM24_CRF_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A620TBM24_CRF_ITEM_NM", A620TBM24_CRF_ITEM_NM);
         n620TBM24_CRF_ITEM_NM = T000W5_n620TBM24_CRF_ITEM_NM[0] ;
         A543TBM24_IDENTIFICATION_CD = T000W5_A543TBM24_IDENTIFICATION_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A543TBM24_IDENTIFICATION_CD", A543TBM24_IDENTIFICATION_CD);
         n543TBM24_IDENTIFICATION_CD = T000W5_n543TBM24_IDENTIFICATION_CD[0] ;
         A544TBM24_TEXT_MAXLENGTH = T000W5_A544TBM24_TEXT_MAXLENGTH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A544TBM24_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A544TBM24_TEXT_MAXLENGTH, 3, 0)));
         n544TBM24_TEXT_MAXLENGTH = T000W5_n544TBM24_TEXT_MAXLENGTH[0] ;
         A545TBM24_TEXT_MAXROWS = T000W5_A545TBM24_TEXT_MAXROWS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A545TBM24_TEXT_MAXROWS, 2, 0)));
         n545TBM24_TEXT_MAXROWS = T000W5_n545TBM24_TEXT_MAXROWS[0] ;
         A546TBM24_DECIMAL_DIGITS = T000W5_A546TBM24_DECIMAL_DIGITS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A546TBM24_DECIMAL_DIGITS, 2, 0)));
         n546TBM24_DECIMAL_DIGITS = T000W5_n546TBM24_DECIMAL_DIGITS[0] ;
         A547TBM24_TEXT = T000W5_A547TBM24_TEXT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A547TBM24_TEXT", A547TBM24_TEXT);
         n547TBM24_TEXT = T000W5_n547TBM24_TEXT[0] ;
         A548TBM24_FIXED_VALUE = T000W5_A548TBM24_FIXED_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_FIXED_VALUE", A548TBM24_FIXED_VALUE);
         n548TBM24_FIXED_VALUE = T000W5_n548TBM24_FIXED_VALUE[0] ;
         A549TBM24_CHK_FALSE_INNER_VALUE = T000W5_A549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_CHK_FALSE_INNER_VALUE", A549TBM24_CHK_FALSE_INNER_VALUE);
         n549TBM24_CHK_FALSE_INNER_VALUE = T000W5_n549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A621TBM24_REQUIRED_INPUT_FLG = T000W5_A621TBM24_REQUIRED_INPUT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A621TBM24_REQUIRED_INPUT_FLG", A621TBM24_REQUIRED_INPUT_FLG);
         n621TBM24_REQUIRED_INPUT_FLG = T000W5_n621TBM24_REQUIRED_INPUT_FLG[0] ;
         A622TBM24_MIN_VALUE = T000W5_A622TBM24_MIN_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A622TBM24_MIN_VALUE", A622TBM24_MIN_VALUE);
         n622TBM24_MIN_VALUE = T000W5_n622TBM24_MIN_VALUE[0] ;
         A623TBM24_MAX_VALUE = T000W5_A623TBM24_MAX_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A623TBM24_MAX_VALUE", A623TBM24_MAX_VALUE);
         n623TBM24_MAX_VALUE = T000W5_n623TBM24_MAX_VALUE[0] ;
         A426TBM24_ORDER = T000W5_A426TBM24_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A426TBM24_ORDER", GXutil.ltrim( GXutil.str( A426TBM24_ORDER, 5, 0)));
         n426TBM24_ORDER = T000W5_n426TBM24_ORDER[0] ;
         A427TBM24_DEL_FLG = T000W5_A427TBM24_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A427TBM24_DEL_FLG", A427TBM24_DEL_FLG);
         n427TBM24_DEL_FLG = T000W5_n427TBM24_DEL_FLG[0] ;
         A430TBM24_CRT_PROG_NM = T000W5_A430TBM24_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430TBM24_CRT_PROG_NM", A430TBM24_CRT_PROG_NM);
         n430TBM24_CRT_PROG_NM = T000W5_n430TBM24_CRT_PROG_NM[0] ;
         A433TBM24_UPD_PROG_NM = T000W5_A433TBM24_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A433TBM24_UPD_PROG_NM", A433TBM24_UPD_PROG_NM);
         n433TBM24_UPD_PROG_NM = T000W5_n433TBM24_UPD_PROG_NM[0] ;
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
      pr_default.execute(2, new Object[] {new Long(A422TBM24_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError422 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'マッピング済部品マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError422 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A428TBM24_CRT_DATETIME) || (( A428TBM24_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A428TBM24_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A431TBM24_UPD_DATETIME) || (( A431TBM24_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A431TBM24_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0W31( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A422TBM24_STUDY_ID )
   {
      /* Using cursor T000W6 */
      pr_default.execute(4, new Object[] {new Long(A422TBM24_STUDY_ID)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         AnyError422 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'マッピング済部品マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError422 == 0 )
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

   public void getKey0W31( )
   {
      /* Using cursor T000W7 */
      pr_default.execute(5, new Object[] {new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound31 = (short)(1) ;
      }
      else
      {
         RcdFound31 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000W3 */
      pr_default.execute(1, new Object[] {new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0W31( 8) ;
         RcdFound31 = (short)(1) ;
         A423TBM24_DOM_CD = T000W3_A423TBM24_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A423TBM24_DOM_CD", A423TBM24_DOM_CD);
         A424TBM24_DOM_VAR_NM = T000W3_A424TBM24_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A424TBM24_DOM_VAR_NM", A424TBM24_DOM_VAR_NM);
         A425TBM24_CRF_ITEM_DIV = T000W3_A425TBM24_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A425TBM24_CRF_ITEM_DIV", A425TBM24_CRF_ITEM_DIV);
         A428TBM24_CRT_DATETIME = T000W3_A428TBM24_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A428TBM24_CRT_DATETIME", localUtil.ttoc( A428TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n428TBM24_CRT_DATETIME = T000W3_n428TBM24_CRT_DATETIME[0] ;
         A429TBM24_CRT_USER_ID = T000W3_A429TBM24_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A429TBM24_CRT_USER_ID", A429TBM24_CRT_USER_ID);
         n429TBM24_CRT_USER_ID = T000W3_n429TBM24_CRT_USER_ID[0] ;
         A431TBM24_UPD_DATETIME = T000W3_A431TBM24_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A431TBM24_UPD_DATETIME", localUtil.ttoc( A431TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n431TBM24_UPD_DATETIME = T000W3_n431TBM24_UPD_DATETIME[0] ;
         A432TBM24_UPD_USER_ID = T000W3_A432TBM24_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A432TBM24_UPD_USER_ID", A432TBM24_UPD_USER_ID);
         n432TBM24_UPD_USER_ID = T000W3_n432TBM24_UPD_USER_ID[0] ;
         A434TBM24_UPD_CNT = T000W3_A434TBM24_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A434TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)));
         n434TBM24_UPD_CNT = T000W3_n434TBM24_UPD_CNT[0] ;
         A617TBM24_DOM_ITM_GRP_OID = T000W3_A617TBM24_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A617TBM24_DOM_ITM_GRP_OID", A617TBM24_DOM_ITM_GRP_OID);
         n617TBM24_DOM_ITM_GRP_OID = T000W3_n617TBM24_DOM_ITM_GRP_OID[0] ;
         A618TBM24_DOM_ITM_GRP_ATTR_SEQ = T000W3_A618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A618TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A618TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         n618TBM24_DOM_ITM_GRP_ATTR_SEQ = T000W3_n618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A619TBM24_DOM_ITM_GRP_ROWNO = T000W3_A619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A619TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A619TBM24_DOM_ITM_GRP_ROWNO, 4, 0)));
         n619TBM24_DOM_ITM_GRP_ROWNO = T000W3_n619TBM24_DOM_ITM_GRP_ROWNO[0] ;
         A620TBM24_CRF_ITEM_NM = T000W3_A620TBM24_CRF_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A620TBM24_CRF_ITEM_NM", A620TBM24_CRF_ITEM_NM);
         n620TBM24_CRF_ITEM_NM = T000W3_n620TBM24_CRF_ITEM_NM[0] ;
         A543TBM24_IDENTIFICATION_CD = T000W3_A543TBM24_IDENTIFICATION_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A543TBM24_IDENTIFICATION_CD", A543TBM24_IDENTIFICATION_CD);
         n543TBM24_IDENTIFICATION_CD = T000W3_n543TBM24_IDENTIFICATION_CD[0] ;
         A544TBM24_TEXT_MAXLENGTH = T000W3_A544TBM24_TEXT_MAXLENGTH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A544TBM24_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A544TBM24_TEXT_MAXLENGTH, 3, 0)));
         n544TBM24_TEXT_MAXLENGTH = T000W3_n544TBM24_TEXT_MAXLENGTH[0] ;
         A545TBM24_TEXT_MAXROWS = T000W3_A545TBM24_TEXT_MAXROWS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A545TBM24_TEXT_MAXROWS, 2, 0)));
         n545TBM24_TEXT_MAXROWS = T000W3_n545TBM24_TEXT_MAXROWS[0] ;
         A546TBM24_DECIMAL_DIGITS = T000W3_A546TBM24_DECIMAL_DIGITS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A546TBM24_DECIMAL_DIGITS, 2, 0)));
         n546TBM24_DECIMAL_DIGITS = T000W3_n546TBM24_DECIMAL_DIGITS[0] ;
         A547TBM24_TEXT = T000W3_A547TBM24_TEXT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A547TBM24_TEXT", A547TBM24_TEXT);
         n547TBM24_TEXT = T000W3_n547TBM24_TEXT[0] ;
         A548TBM24_FIXED_VALUE = T000W3_A548TBM24_FIXED_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_FIXED_VALUE", A548TBM24_FIXED_VALUE);
         n548TBM24_FIXED_VALUE = T000W3_n548TBM24_FIXED_VALUE[0] ;
         A549TBM24_CHK_FALSE_INNER_VALUE = T000W3_A549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_CHK_FALSE_INNER_VALUE", A549TBM24_CHK_FALSE_INNER_VALUE);
         n549TBM24_CHK_FALSE_INNER_VALUE = T000W3_n549TBM24_CHK_FALSE_INNER_VALUE[0] ;
         A621TBM24_REQUIRED_INPUT_FLG = T000W3_A621TBM24_REQUIRED_INPUT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A621TBM24_REQUIRED_INPUT_FLG", A621TBM24_REQUIRED_INPUT_FLG);
         n621TBM24_REQUIRED_INPUT_FLG = T000W3_n621TBM24_REQUIRED_INPUT_FLG[0] ;
         A622TBM24_MIN_VALUE = T000W3_A622TBM24_MIN_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A622TBM24_MIN_VALUE", A622TBM24_MIN_VALUE);
         n622TBM24_MIN_VALUE = T000W3_n622TBM24_MIN_VALUE[0] ;
         A623TBM24_MAX_VALUE = T000W3_A623TBM24_MAX_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A623TBM24_MAX_VALUE", A623TBM24_MAX_VALUE);
         n623TBM24_MAX_VALUE = T000W3_n623TBM24_MAX_VALUE[0] ;
         A426TBM24_ORDER = T000W3_A426TBM24_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A426TBM24_ORDER", GXutil.ltrim( GXutil.str( A426TBM24_ORDER, 5, 0)));
         n426TBM24_ORDER = T000W3_n426TBM24_ORDER[0] ;
         A427TBM24_DEL_FLG = T000W3_A427TBM24_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A427TBM24_DEL_FLG", A427TBM24_DEL_FLG);
         n427TBM24_DEL_FLG = T000W3_n427TBM24_DEL_FLG[0] ;
         A430TBM24_CRT_PROG_NM = T000W3_A430TBM24_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A430TBM24_CRT_PROG_NM", A430TBM24_CRT_PROG_NM);
         n430TBM24_CRT_PROG_NM = T000W3_n430TBM24_CRT_PROG_NM[0] ;
         A433TBM24_UPD_PROG_NM = T000W3_A433TBM24_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A433TBM24_UPD_PROG_NM", A433TBM24_UPD_PROG_NM);
         n433TBM24_UPD_PROG_NM = T000W3_n433TBM24_UPD_PROG_NM[0] ;
         A422TBM24_STUDY_ID = T000W3_A422TBM24_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
         O434TBM24_UPD_CNT = A434TBM24_UPD_CNT ;
         n434TBM24_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A434TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)));
         Z422TBM24_STUDY_ID = A422TBM24_STUDY_ID ;
         Z423TBM24_DOM_CD = A423TBM24_DOM_CD ;
         Z424TBM24_DOM_VAR_NM = A424TBM24_DOM_VAR_NM ;
         Z425TBM24_CRF_ITEM_DIV = A425TBM24_CRF_ITEM_DIV ;
         sMode31 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0W31( ) ;
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
      /* Using cursor T000W8 */
      pr_default.execute(6, new Object[] {new Long(A422TBM24_STUDY_ID), new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A423TBM24_DOM_CD, new Long(A422TBM24_STUDY_ID), A424TBM24_DOM_VAR_NM, A424TBM24_DOM_VAR_NM, A423TBM24_DOM_CD, new Long(A422TBM24_STUDY_ID), A425TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000W8_A422TBM24_STUDY_ID[0] < A422TBM24_STUDY_ID ) || ( T000W8_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) < 0 ) || ( GXutil.strcmp(T000W8_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) == 0 ) && ( T000W8_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A424TBM24_DOM_VAR_NM[0], A424TBM24_DOM_VAR_NM) < 0 ) || ( GXutil.strcmp(T000W8_A424TBM24_DOM_VAR_NM[0], A424TBM24_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T000W8_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) == 0 ) && ( T000W8_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A425TBM24_CRF_ITEM_DIV[0], A425TBM24_CRF_ITEM_DIV) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000W8_A422TBM24_STUDY_ID[0] > A422TBM24_STUDY_ID ) || ( T000W8_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) > 0 ) || ( GXutil.strcmp(T000W8_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) == 0 ) && ( T000W8_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A424TBM24_DOM_VAR_NM[0], A424TBM24_DOM_VAR_NM) > 0 ) || ( GXutil.strcmp(T000W8_A424TBM24_DOM_VAR_NM[0], A424TBM24_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T000W8_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) == 0 ) && ( T000W8_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W8_A425TBM24_CRF_ITEM_DIV[0], A425TBM24_CRF_ITEM_DIV) > 0 ) ) )
         {
            A422TBM24_STUDY_ID = T000W8_A422TBM24_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
            A423TBM24_DOM_CD = T000W8_A423TBM24_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A423TBM24_DOM_CD", A423TBM24_DOM_CD);
            A424TBM24_DOM_VAR_NM = T000W8_A424TBM24_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A424TBM24_DOM_VAR_NM", A424TBM24_DOM_VAR_NM);
            A425TBM24_CRF_ITEM_DIV = T000W8_A425TBM24_CRF_ITEM_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A425TBM24_CRF_ITEM_DIV", A425TBM24_CRF_ITEM_DIV);
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound31 = (short)(0) ;
      /* Using cursor T000W9 */
      pr_default.execute(7, new Object[] {new Long(A422TBM24_STUDY_ID), new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A423TBM24_DOM_CD, new Long(A422TBM24_STUDY_ID), A424TBM24_DOM_VAR_NM, A424TBM24_DOM_VAR_NM, A423TBM24_DOM_CD, new Long(A422TBM24_STUDY_ID), A425TBM24_CRF_ITEM_DIV});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000W9_A422TBM24_STUDY_ID[0] > A422TBM24_STUDY_ID ) || ( T000W9_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W9_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) > 0 ) || ( GXutil.strcmp(T000W9_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) == 0 ) && ( T000W9_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W9_A424TBM24_DOM_VAR_NM[0], A424TBM24_DOM_VAR_NM) > 0 ) || ( GXutil.strcmp(T000W9_A424TBM24_DOM_VAR_NM[0], A424TBM24_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T000W9_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) == 0 ) && ( T000W9_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W9_A425TBM24_CRF_ITEM_DIV[0], A425TBM24_CRF_ITEM_DIV) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000W9_A422TBM24_STUDY_ID[0] < A422TBM24_STUDY_ID ) || ( T000W9_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W9_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) < 0 ) || ( GXutil.strcmp(T000W9_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) == 0 ) && ( T000W9_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W9_A424TBM24_DOM_VAR_NM[0], A424TBM24_DOM_VAR_NM) < 0 ) || ( GXutil.strcmp(T000W9_A424TBM24_DOM_VAR_NM[0], A424TBM24_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T000W9_A423TBM24_DOM_CD[0], A423TBM24_DOM_CD) == 0 ) && ( T000W9_A422TBM24_STUDY_ID[0] == A422TBM24_STUDY_ID ) && ( GXutil.strcmp(T000W9_A425TBM24_CRF_ITEM_DIV[0], A425TBM24_CRF_ITEM_DIV) < 0 ) ) )
         {
            A422TBM24_STUDY_ID = T000W9_A422TBM24_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
            A423TBM24_DOM_CD = T000W9_A423TBM24_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A423TBM24_DOM_CD", A423TBM24_DOM_CD);
            A424TBM24_DOM_VAR_NM = T000W9_A424TBM24_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A424TBM24_DOM_VAR_NM", A424TBM24_DOM_VAR_NM);
            A425TBM24_CRF_ITEM_DIV = T000W9_A425TBM24_CRF_ITEM_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A425TBM24_CRF_ITEM_DIV", A425TBM24_CRF_ITEM_DIV);
            RcdFound31 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0W31( ) ;
      if ( RcdFound31 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM24_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A422TBM24_STUDY_ID != Z422TBM24_STUDY_ID ) || ( GXutil.strcmp(A423TBM24_DOM_CD, Z423TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A424TBM24_DOM_VAR_NM, Z424TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A425TBM24_CRF_ITEM_DIV, Z425TBM24_CRF_ITEM_DIV) != 0 ) )
         {
            A422TBM24_STUDY_ID = Z422TBM24_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
            A423TBM24_DOM_CD = Z423TBM24_DOM_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A423TBM24_DOM_CD", A423TBM24_DOM_CD);
            A424TBM24_DOM_VAR_NM = Z424TBM24_DOM_VAR_NM ;
            httpContext.ajax_rsp_assign_attri("", false, "A424TBM24_DOM_VAR_NM", A424TBM24_DOM_VAR_NM);
            A425TBM24_CRF_ITEM_DIV = Z425TBM24_CRF_ITEM_DIV ;
            httpContext.ajax_rsp_assign_attri("", false, "A425TBM24_CRF_ITEM_DIV", A425TBM24_CRF_ITEM_DIV);
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
         if ( ( A422TBM24_STUDY_ID != Z422TBM24_STUDY_ID ) || ( GXutil.strcmp(A423TBM24_DOM_CD, Z423TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A424TBM24_DOM_VAR_NM, Z424TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A425TBM24_CRF_ITEM_DIV, Z425TBM24_CRF_ITEM_DIV) != 0 ) )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( A422TBM24_STUDY_ID != Z422TBM24_STUDY_ID ) || ( GXutil.strcmp(A423TBM24_DOM_CD, Z423TBM24_DOM_CD) != 0 ) || ( GXutil.strcmp(A424TBM24_DOM_VAR_NM, Z424TBM24_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A425TBM24_CRF_ITEM_DIV, Z425TBM24_CRF_ITEM_DIV) != 0 ) )
      {
         A422TBM24_STUDY_ID = Z422TBM24_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
         A423TBM24_DOM_CD = Z423TBM24_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A423TBM24_DOM_CD", A423TBM24_DOM_CD);
         A424TBM24_DOM_VAR_NM = Z424TBM24_DOM_VAR_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "A424TBM24_DOM_VAR_NM", A424TBM24_DOM_VAR_NM);
         A425TBM24_CRF_ITEM_DIV = Z425TBM24_CRF_ITEM_DIV ;
         httpContext.ajax_rsp_assign_attri("", false, "A425TBM24_CRF_ITEM_DIV", A425TBM24_CRF_ITEM_DIV);
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
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
      scanStart0W31( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart0W31( ) ;
      if ( RcdFound31 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(0, new Object[] {new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM24_MAP_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z428TBM24_CRT_DATETIME.equals( T000W2_A428TBM24_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z429TBM24_CRT_USER_ID, T000W2_A429TBM24_CRT_USER_ID[0]) != 0 ) || !( Z431TBM24_UPD_DATETIME.equals( T000W2_A431TBM24_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z432TBM24_UPD_USER_ID, T000W2_A432TBM24_UPD_USER_ID[0]) != 0 ) || ( Z434TBM24_UPD_CNT != T000W2_A434TBM24_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z617TBM24_DOM_ITM_GRP_OID, T000W2_A617TBM24_DOM_ITM_GRP_OID[0]) != 0 ) || ( Z618TBM24_DOM_ITM_GRP_ATTR_SEQ != T000W2_A618TBM24_DOM_ITM_GRP_ATTR_SEQ[0] ) || ( Z619TBM24_DOM_ITM_GRP_ROWNO != T000W2_A619TBM24_DOM_ITM_GRP_ROWNO[0] ) || ( GXutil.strcmp(Z620TBM24_CRF_ITEM_NM, T000W2_A620TBM24_CRF_ITEM_NM[0]) != 0 ) || ( GXutil.strcmp(Z543TBM24_IDENTIFICATION_CD, T000W2_A543TBM24_IDENTIFICATION_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z544TBM24_TEXT_MAXLENGTH != T000W2_A544TBM24_TEXT_MAXLENGTH[0] ) || ( Z545TBM24_TEXT_MAXROWS != T000W2_A545TBM24_TEXT_MAXROWS[0] ) || ( Z546TBM24_DECIMAL_DIGITS != T000W2_A546TBM24_DECIMAL_DIGITS[0] ) || ( GXutil.strcmp(Z547TBM24_TEXT, T000W2_A547TBM24_TEXT[0]) != 0 ) || ( GXutil.strcmp(Z548TBM24_FIXED_VALUE, T000W2_A548TBM24_FIXED_VALUE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z549TBM24_CHK_FALSE_INNER_VALUE, T000W2_A549TBM24_CHK_FALSE_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z621TBM24_REQUIRED_INPUT_FLG, T000W2_A621TBM24_REQUIRED_INPUT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z622TBM24_MIN_VALUE, T000W2_A622TBM24_MIN_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z623TBM24_MAX_VALUE, T000W2_A623TBM24_MAX_VALUE[0]) != 0 ) || ( Z426TBM24_ORDER != T000W2_A426TBM24_ORDER[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z427TBM24_DEL_FLG, T000W2_A427TBM24_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z430TBM24_CRT_PROG_NM, T000W2_A430TBM24_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z433TBM24_UPD_PROG_NM, T000W2_A433TBM24_UPD_PROG_NM[0]) != 0 ) )
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
                  /* Using cursor T000W10 */
                  pr_default.execute(8, new Object[] {A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV, new Boolean(n428TBM24_CRT_DATETIME), A428TBM24_CRT_DATETIME, new Boolean(n429TBM24_CRT_USER_ID), A429TBM24_CRT_USER_ID, new Boolean(n431TBM24_UPD_DATETIME), A431TBM24_UPD_DATETIME, new Boolean(n432TBM24_UPD_USER_ID), A432TBM24_UPD_USER_ID, new Boolean(n434TBM24_UPD_CNT), new Long(A434TBM24_UPD_CNT), new Boolean(n617TBM24_DOM_ITM_GRP_OID), A617TBM24_DOM_ITM_GRP_OID, new Boolean(n618TBM24_DOM_ITM_GRP_ATTR_SEQ), new Short(A618TBM24_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n619TBM24_DOM_ITM_GRP_ROWNO), new Short(A619TBM24_DOM_ITM_GRP_ROWNO), new Boolean(n620TBM24_CRF_ITEM_NM), A620TBM24_CRF_ITEM_NM, new Boolean(n543TBM24_IDENTIFICATION_CD), A543TBM24_IDENTIFICATION_CD, new Boolean(n544TBM24_TEXT_MAXLENGTH), new Short(A544TBM24_TEXT_MAXLENGTH), new Boolean(n545TBM24_TEXT_MAXROWS), new Byte(A545TBM24_TEXT_MAXROWS), new Boolean(n546TBM24_DECIMAL_DIGITS), new Byte(A546TBM24_DECIMAL_DIGITS), new Boolean(n547TBM24_TEXT), A547TBM24_TEXT, new Boolean(n548TBM24_FIXED_VALUE), A548TBM24_FIXED_VALUE, new Boolean(n549TBM24_CHK_FALSE_INNER_VALUE), A549TBM24_CHK_FALSE_INNER_VALUE, new Boolean(n621TBM24_REQUIRED_INPUT_FLG), A621TBM24_REQUIRED_INPUT_FLG, new Boolean(n622TBM24_MIN_VALUE), A622TBM24_MIN_VALUE, new Boolean(n623TBM24_MAX_VALUE), A623TBM24_MAX_VALUE, new Boolean(n426TBM24_ORDER), new Integer(A426TBM24_ORDER), new Boolean(n427TBM24_DEL_FLG), A427TBM24_DEL_FLG, new Boolean(n430TBM24_CRT_PROG_NM), A430TBM24_CRT_PROG_NM, new Boolean(n433TBM24_UPD_PROG_NM), A433TBM24_UPD_PROG_NM, new Long(A422TBM24_STUDY_ID)});
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
                  /* Using cursor T000W11 */
                  pr_default.execute(9, new Object[] {new Boolean(n428TBM24_CRT_DATETIME), A428TBM24_CRT_DATETIME, new Boolean(n429TBM24_CRT_USER_ID), A429TBM24_CRT_USER_ID, new Boolean(n431TBM24_UPD_DATETIME), A431TBM24_UPD_DATETIME, new Boolean(n432TBM24_UPD_USER_ID), A432TBM24_UPD_USER_ID, new Boolean(n434TBM24_UPD_CNT), new Long(A434TBM24_UPD_CNT), new Boolean(n617TBM24_DOM_ITM_GRP_OID), A617TBM24_DOM_ITM_GRP_OID, new Boolean(n618TBM24_DOM_ITM_GRP_ATTR_SEQ), new Short(A618TBM24_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n619TBM24_DOM_ITM_GRP_ROWNO), new Short(A619TBM24_DOM_ITM_GRP_ROWNO), new Boolean(n620TBM24_CRF_ITEM_NM), A620TBM24_CRF_ITEM_NM, new Boolean(n543TBM24_IDENTIFICATION_CD), A543TBM24_IDENTIFICATION_CD, new Boolean(n544TBM24_TEXT_MAXLENGTH), new Short(A544TBM24_TEXT_MAXLENGTH), new Boolean(n545TBM24_TEXT_MAXROWS), new Byte(A545TBM24_TEXT_MAXROWS), new Boolean(n546TBM24_DECIMAL_DIGITS), new Byte(A546TBM24_DECIMAL_DIGITS), new Boolean(n547TBM24_TEXT), A547TBM24_TEXT, new Boolean(n548TBM24_FIXED_VALUE), A548TBM24_FIXED_VALUE, new Boolean(n549TBM24_CHK_FALSE_INNER_VALUE), A549TBM24_CHK_FALSE_INNER_VALUE, new Boolean(n621TBM24_REQUIRED_INPUT_FLG), A621TBM24_REQUIRED_INPUT_FLG, new Boolean(n622TBM24_MIN_VALUE), A622TBM24_MIN_VALUE, new Boolean(n623TBM24_MAX_VALUE), A623TBM24_MAX_VALUE, new Boolean(n426TBM24_ORDER), new Integer(A426TBM24_ORDER), new Boolean(n427TBM24_DEL_FLG), A427TBM24_DEL_FLG, new Boolean(n430TBM24_CRT_PROG_NM), A430TBM24_CRT_PROG_NM, new Boolean(n433TBM24_UPD_PROG_NM), A433TBM24_UPD_PROG_NM, new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
                  if ( (pr_default.getStatus(9) == 103) )
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               /* Using cursor T000W12 */
               pr_default.execute(10, new Object[] {new Long(A422TBM24_STUDY_ID), A423TBM24_DOM_CD, A424TBM24_DOM_VAR_NM, A425TBM24_CRF_ITEM_DIV});
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
      /* Using cursor T000W13 */
      pr_default.execute(11);
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A422TBM24_STUDY_ID = T000W13_A422TBM24_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
         A423TBM24_DOM_CD = T000W13_A423TBM24_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A423TBM24_DOM_CD", A423TBM24_DOM_CD);
         A424TBM24_DOM_VAR_NM = T000W13_A424TBM24_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A424TBM24_DOM_VAR_NM", A424TBM24_DOM_VAR_NM);
         A425TBM24_CRF_ITEM_DIV = T000W13_A425TBM24_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A425TBM24_CRF_ITEM_DIV", A425TBM24_CRF_ITEM_DIV);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0W31( )
   {
      pr_default.readNext(11);
      RcdFound31 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound31 = (short)(1) ;
         A422TBM24_STUDY_ID = T000W13_A422TBM24_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
         A423TBM24_DOM_CD = T000W13_A423TBM24_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A423TBM24_DOM_CD", A423TBM24_DOM_CD);
         A424TBM24_DOM_VAR_NM = T000W13_A424TBM24_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A424TBM24_DOM_VAR_NM", A424TBM24_DOM_VAR_NM);
         A425TBM24_CRF_ITEM_DIV = T000W13_A425TBM24_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A425TBM24_CRF_ITEM_DIV", A425TBM24_CRF_ITEM_DIV);
      }
   }

   public void scanEnd0W31( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0W31( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0W31( )
   {
      /* Before Insert Rules */
      A428TBM24_CRT_DATETIME = GXutil.now( ) ;
      n428TBM24_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A428TBM24_CRT_DATETIME", localUtil.ttoc( A428TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A429TBM24_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm24_map_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A429TBM24_CRT_USER_ID = GXt_char3 ;
      n429TBM24_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A429TBM24_CRT_USER_ID", A429TBM24_CRT_USER_ID);
      A431TBM24_UPD_DATETIME = GXutil.now( ) ;
      n431TBM24_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A431TBM24_UPD_DATETIME", localUtil.ttoc( A431TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A432TBM24_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm24_map_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A432TBM24_UPD_USER_ID = GXt_char3 ;
      n432TBM24_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A432TBM24_UPD_USER_ID", A432TBM24_UPD_USER_ID);
      A434TBM24_UPD_CNT = (long)(O434TBM24_UPD_CNT+1) ;
      n434TBM24_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A434TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0W31( )
   {
      /* Before Update Rules */
      A431TBM24_UPD_DATETIME = GXutil.now( ) ;
      n431TBM24_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A431TBM24_UPD_DATETIME", localUtil.ttoc( A431TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A432TBM24_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm24_map_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A432TBM24_UPD_USER_ID = GXt_char3 ;
      n432TBM24_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A432TBM24_UPD_USER_ID", A432TBM24_UPD_USER_ID);
      A434TBM24_UPD_CNT = (long)(O434TBM24_UPD_CNT+1) ;
      n434TBM24_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A434TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "マッピング済部品マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm24_map_item") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0W31( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z422TBM24_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z422TBM24_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z423TBM24_DOM_CD", GXutil.rtrim( Z423TBM24_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z424TBM24_DOM_VAR_NM", GXutil.rtrim( Z424TBM24_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z425TBM24_CRF_ITEM_DIV", GXutil.rtrim( Z425TBM24_CRF_ITEM_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z428TBM24_CRT_DATETIME", localUtil.ttoc( Z428TBM24_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z429TBM24_CRT_USER_ID", GXutil.rtrim( Z429TBM24_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z431TBM24_UPD_DATETIME", localUtil.ttoc( Z431TBM24_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z432TBM24_UPD_USER_ID", GXutil.rtrim( Z432TBM24_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z434TBM24_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z434TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z617TBM24_DOM_ITM_GRP_OID", GXutil.rtrim( Z617TBM24_DOM_ITM_GRP_OID));
      GxWebStd.gx_hidden_field( httpContext, "Z618TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( localUtil.ntoc( Z618TBM24_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z619TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( localUtil.ntoc( Z619TBM24_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z620TBM24_CRF_ITEM_NM", GXutil.rtrim( Z620TBM24_CRF_ITEM_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z543TBM24_IDENTIFICATION_CD", GXutil.rtrim( Z543TBM24_IDENTIFICATION_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z544TBM24_TEXT_MAXLENGTH", GXutil.ltrim( localUtil.ntoc( Z544TBM24_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z545TBM24_TEXT_MAXROWS", GXutil.ltrim( localUtil.ntoc( Z545TBM24_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z546TBM24_DECIMAL_DIGITS", GXutil.ltrim( localUtil.ntoc( Z546TBM24_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z547TBM24_TEXT", GXutil.rtrim( Z547TBM24_TEXT));
      GxWebStd.gx_hidden_field( httpContext, "Z548TBM24_FIXED_VALUE", GXutil.rtrim( Z548TBM24_FIXED_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z549TBM24_CHK_FALSE_INNER_VALUE", GXutil.rtrim( Z549TBM24_CHK_FALSE_INNER_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z621TBM24_REQUIRED_INPUT_FLG", GXutil.rtrim( Z621TBM24_REQUIRED_INPUT_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z622TBM24_MIN_VALUE", GXutil.rtrim( Z622TBM24_MIN_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z623TBM24_MAX_VALUE", GXutil.rtrim( Z623TBM24_MAX_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z426TBM24_ORDER", GXutil.ltrim( localUtil.ntoc( Z426TBM24_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z427TBM24_DEL_FLG", GXutil.rtrim( Z427TBM24_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z430TBM24_CRT_PROG_NM", GXutil.rtrim( Z430TBM24_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z433TBM24_UPD_PROG_NM", GXutil.rtrim( Z433TBM24_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O434TBM24_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O434TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0W31( )
   {
      A428TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n428TBM24_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A428TBM24_CRT_DATETIME", localUtil.ttoc( A428TBM24_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n428TBM24_CRT_DATETIME = (GXutil.nullDate().equals(A428TBM24_CRT_DATETIME) ? true : false) ;
      A429TBM24_CRT_USER_ID = "" ;
      n429TBM24_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A429TBM24_CRT_USER_ID", A429TBM24_CRT_USER_ID);
      n429TBM24_CRT_USER_ID = ((GXutil.strcmp("", A429TBM24_CRT_USER_ID)==0) ? true : false) ;
      A431TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n431TBM24_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A431TBM24_UPD_DATETIME", localUtil.ttoc( A431TBM24_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n431TBM24_UPD_DATETIME = (GXutil.nullDate().equals(A431TBM24_UPD_DATETIME) ? true : false) ;
      A432TBM24_UPD_USER_ID = "" ;
      n432TBM24_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A432TBM24_UPD_USER_ID", A432TBM24_UPD_USER_ID);
      n432TBM24_UPD_USER_ID = ((GXutil.strcmp("", A432TBM24_UPD_USER_ID)==0) ? true : false) ;
      A434TBM24_UPD_CNT = 0 ;
      n434TBM24_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A434TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)));
      n434TBM24_UPD_CNT = ((0==A434TBM24_UPD_CNT) ? true : false) ;
      A617TBM24_DOM_ITM_GRP_OID = "" ;
      n617TBM24_DOM_ITM_GRP_OID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A617TBM24_DOM_ITM_GRP_OID", A617TBM24_DOM_ITM_GRP_OID);
      n617TBM24_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A617TBM24_DOM_ITM_GRP_OID)==0) ? true : false) ;
      A618TBM24_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
      n618TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A618TBM24_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A618TBM24_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
      n618TBM24_DOM_ITM_GRP_ATTR_SEQ = ((0==A618TBM24_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
      A619TBM24_DOM_ITM_GRP_ROWNO = (short)(0) ;
      n619TBM24_DOM_ITM_GRP_ROWNO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A619TBM24_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A619TBM24_DOM_ITM_GRP_ROWNO, 4, 0)));
      n619TBM24_DOM_ITM_GRP_ROWNO = ((0==A619TBM24_DOM_ITM_GRP_ROWNO) ? true : false) ;
      A620TBM24_CRF_ITEM_NM = "" ;
      n620TBM24_CRF_ITEM_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A620TBM24_CRF_ITEM_NM", A620TBM24_CRF_ITEM_NM);
      n620TBM24_CRF_ITEM_NM = ((GXutil.strcmp("", A620TBM24_CRF_ITEM_NM)==0) ? true : false) ;
      A543TBM24_IDENTIFICATION_CD = "" ;
      n543TBM24_IDENTIFICATION_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A543TBM24_IDENTIFICATION_CD", A543TBM24_IDENTIFICATION_CD);
      n543TBM24_IDENTIFICATION_CD = ((GXutil.strcmp("", A543TBM24_IDENTIFICATION_CD)==0) ? true : false) ;
      A544TBM24_TEXT_MAXLENGTH = (short)(0) ;
      n544TBM24_TEXT_MAXLENGTH = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A544TBM24_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A544TBM24_TEXT_MAXLENGTH, 3, 0)));
      n544TBM24_TEXT_MAXLENGTH = ((0==A544TBM24_TEXT_MAXLENGTH) ? true : false) ;
      A545TBM24_TEXT_MAXROWS = (byte)(0) ;
      n545TBM24_TEXT_MAXROWS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A545TBM24_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A545TBM24_TEXT_MAXROWS, 2, 0)));
      n545TBM24_TEXT_MAXROWS = ((0==A545TBM24_TEXT_MAXROWS) ? true : false) ;
      A546TBM24_DECIMAL_DIGITS = (byte)(0) ;
      n546TBM24_DECIMAL_DIGITS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A546TBM24_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A546TBM24_DECIMAL_DIGITS, 2, 0)));
      n546TBM24_DECIMAL_DIGITS = ((0==A546TBM24_DECIMAL_DIGITS) ? true : false) ;
      A547TBM24_TEXT = "" ;
      n547TBM24_TEXT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A547TBM24_TEXT", A547TBM24_TEXT);
      n547TBM24_TEXT = ((GXutil.strcmp("", A547TBM24_TEXT)==0) ? true : false) ;
      A548TBM24_FIXED_VALUE = "" ;
      n548TBM24_FIXED_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A548TBM24_FIXED_VALUE", A548TBM24_FIXED_VALUE);
      n548TBM24_FIXED_VALUE = ((GXutil.strcmp("", A548TBM24_FIXED_VALUE)==0) ? true : false) ;
      A549TBM24_CHK_FALSE_INNER_VALUE = "" ;
      n549TBM24_CHK_FALSE_INNER_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A549TBM24_CHK_FALSE_INNER_VALUE", A549TBM24_CHK_FALSE_INNER_VALUE);
      n549TBM24_CHK_FALSE_INNER_VALUE = ((GXutil.strcmp("", A549TBM24_CHK_FALSE_INNER_VALUE)==0) ? true : false) ;
      A621TBM24_REQUIRED_INPUT_FLG = "" ;
      n621TBM24_REQUIRED_INPUT_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A621TBM24_REQUIRED_INPUT_FLG", A621TBM24_REQUIRED_INPUT_FLG);
      n621TBM24_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A621TBM24_REQUIRED_INPUT_FLG)==0) ? true : false) ;
      A622TBM24_MIN_VALUE = "" ;
      n622TBM24_MIN_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A622TBM24_MIN_VALUE", A622TBM24_MIN_VALUE);
      n622TBM24_MIN_VALUE = ((GXutil.strcmp("", A622TBM24_MIN_VALUE)==0) ? true : false) ;
      A623TBM24_MAX_VALUE = "" ;
      n623TBM24_MAX_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A623TBM24_MAX_VALUE", A623TBM24_MAX_VALUE);
      n623TBM24_MAX_VALUE = ((GXutil.strcmp("", A623TBM24_MAX_VALUE)==0) ? true : false) ;
      A426TBM24_ORDER = 0 ;
      n426TBM24_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A426TBM24_ORDER", GXutil.ltrim( GXutil.str( A426TBM24_ORDER, 5, 0)));
      n426TBM24_ORDER = ((0==A426TBM24_ORDER) ? true : false) ;
      A427TBM24_DEL_FLG = "" ;
      n427TBM24_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A427TBM24_DEL_FLG", A427TBM24_DEL_FLG);
      n427TBM24_DEL_FLG = ((GXutil.strcmp("", A427TBM24_DEL_FLG)==0) ? true : false) ;
      A430TBM24_CRT_PROG_NM = "" ;
      n430TBM24_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A430TBM24_CRT_PROG_NM", A430TBM24_CRT_PROG_NM);
      n430TBM24_CRT_PROG_NM = ((GXutil.strcmp("", A430TBM24_CRT_PROG_NM)==0) ? true : false) ;
      A433TBM24_UPD_PROG_NM = "" ;
      n433TBM24_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A433TBM24_UPD_PROG_NM", A433TBM24_UPD_PROG_NM);
      n433TBM24_UPD_PROG_NM = ((GXutil.strcmp("", A433TBM24_UPD_PROG_NM)==0) ? true : false) ;
      O434TBM24_UPD_CNT = A434TBM24_UPD_CNT ;
      n434TBM24_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A434TBM24_UPD_CNT", GXutil.ltrim( GXutil.str( A434TBM24_UPD_CNT, 10, 0)));
   }

   public void initAll0W31( )
   {
      A422TBM24_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A422TBM24_STUDY_ID", GXutil.ltrim( GXutil.str( A422TBM24_STUDY_ID, 10, 0)));
      A423TBM24_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A423TBM24_DOM_CD", A423TBM24_DOM_CD);
      A424TBM24_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A424TBM24_DOM_VAR_NM", A424TBM24_DOM_VAR_NM);
      A425TBM24_CRF_ITEM_DIV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A425TBM24_CRF_ITEM_DIV", A425TBM24_CRF_ITEM_DIV);
      initializeNonKey0W31( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14555650");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm24_map_item.js", "?14555650");
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
      GXt_char3 = A429TBM24_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm24_map_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A429TBM24_CRT_USER_ID = GXt_char3 ;
      n429TBM24_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A429TBM24_CRT_USER_ID", A429TBM24_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A429TBM24_CRT_USER_ID))+"\"");
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
      GXt_char3 = A432TBM24_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm24_map_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A432TBM24_UPD_USER_ID = GXt_char3 ;
      n432TBM24_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A432TBM24_UPD_USER_ID", A432TBM24_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A432TBM24_UPD_USER_ID))+"\"");
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
      /* Using cursor T000W14 */
      pr_default.execute(12, new Object[] {new Long(A422TBM24_STUDY_ID)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         AnyError422 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'マッピング済部品マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError422 == 0 )
      {
      }
      pr_default.close(12);
      GX_FocusControl = edtTBM24_DOM_ITM_GRP_OID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm24_study_id( long GX_Parm1 )
   {
      A422TBM24_STUDY_ID = GX_Parm1 ;
      /* Using cursor T000W14 */
      pr_default.execute(12, new Object[] {new Long(A422TBM24_STUDY_ID)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         AnyError422 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'マッピング済部品マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM24_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM24_STUDY_ID_Internalname ;
      }
      if ( AnyError422 == 0 )
      {
      }
      pr_default.close(12);
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
      A422TBM24_STUDY_ID = GX_Parm1 ;
      A423TBM24_DOM_CD = GX_Parm2 ;
      A424TBM24_DOM_VAR_NM = GX_Parm3 ;
      A425TBM24_CRF_ITEM_DIV = GX_Parm4 ;
      A428TBM24_CRT_DATETIME = GX_Parm5 ;
      n428TBM24_CRT_DATETIME = false ;
      A429TBM24_CRT_USER_ID = GX_Parm6 ;
      n429TBM24_CRT_USER_ID = false ;
      A431TBM24_UPD_DATETIME = GX_Parm7 ;
      n431TBM24_UPD_DATETIME = false ;
      A432TBM24_UPD_USER_ID = GX_Parm8 ;
      n432TBM24_UPD_USER_ID = false ;
      A434TBM24_UPD_CNT = GX_Parm9 ;
      n434TBM24_UPD_CNT = false ;
      A617TBM24_DOM_ITM_GRP_OID = GX_Parm10 ;
      n617TBM24_DOM_ITM_GRP_OID = false ;
      A618TBM24_DOM_ITM_GRP_ATTR_SEQ = GX_Parm11 ;
      n618TBM24_DOM_ITM_GRP_ATTR_SEQ = false ;
      A619TBM24_DOM_ITM_GRP_ROWNO = GX_Parm12 ;
      n619TBM24_DOM_ITM_GRP_ROWNO = false ;
      A620TBM24_CRF_ITEM_NM = GX_Parm13 ;
      n620TBM24_CRF_ITEM_NM = false ;
      A543TBM24_IDENTIFICATION_CD = GX_Parm14 ;
      n543TBM24_IDENTIFICATION_CD = false ;
      A544TBM24_TEXT_MAXLENGTH = GX_Parm15 ;
      n544TBM24_TEXT_MAXLENGTH = false ;
      A545TBM24_TEXT_MAXROWS = GX_Parm16 ;
      n545TBM24_TEXT_MAXROWS = false ;
      A546TBM24_DECIMAL_DIGITS = GX_Parm17 ;
      n546TBM24_DECIMAL_DIGITS = false ;
      A547TBM24_TEXT = GX_Parm18 ;
      n547TBM24_TEXT = false ;
      A548TBM24_FIXED_VALUE = GX_Parm19 ;
      n548TBM24_FIXED_VALUE = false ;
      A549TBM24_CHK_FALSE_INNER_VALUE = GX_Parm20 ;
      n549TBM24_CHK_FALSE_INNER_VALUE = false ;
      A621TBM24_REQUIRED_INPUT_FLG = GX_Parm21 ;
      n621TBM24_REQUIRED_INPUT_FLG = false ;
      A622TBM24_MIN_VALUE = GX_Parm22 ;
      n622TBM24_MIN_VALUE = false ;
      A623TBM24_MAX_VALUE = GX_Parm23 ;
      n623TBM24_MAX_VALUE = false ;
      A426TBM24_ORDER = GX_Parm24 ;
      n426TBM24_ORDER = false ;
      A427TBM24_DEL_FLG = GX_Parm25 ;
      n427TBM24_DEL_FLG = false ;
      A430TBM24_CRT_PROG_NM = GX_Parm26 ;
      n430TBM24_CRT_PROG_NM = false ;
      A433TBM24_UPD_PROG_NM = GX_Parm27 ;
      n433TBM24_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A428TBM24_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A429TBM24_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A431TBM24_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A432TBM24_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A434TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A617TBM24_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A618TBM24_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A619TBM24_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A620TBM24_CRF_ITEM_NM));
      isValidOutput.add(GXutil.rtrim( A543TBM24_IDENTIFICATION_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A544TBM24_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A545TBM24_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A546TBM24_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A547TBM24_TEXT));
      isValidOutput.add(GXutil.rtrim( A548TBM24_FIXED_VALUE));
      isValidOutput.add(GXutil.rtrim( A549TBM24_CHK_FALSE_INNER_VALUE));
      isValidOutput.add(GXutil.rtrim( A621TBM24_REQUIRED_INPUT_FLG));
      isValidOutput.add(GXutil.rtrim( A622TBM24_MIN_VALUE));
      isValidOutput.add(GXutil.rtrim( A623TBM24_MAX_VALUE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A426TBM24_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A427TBM24_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A430TBM24_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A433TBM24_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z422TBM24_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z423TBM24_DOM_CD));
      isValidOutput.add(GXutil.rtrim( Z424TBM24_DOM_VAR_NM));
      isValidOutput.add(GXutil.rtrim( Z425TBM24_CRF_ITEM_DIV));
      isValidOutput.add(localUtil.ttoc( Z428TBM24_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z429TBM24_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z431TBM24_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z432TBM24_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z434TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z617TBM24_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z618TBM24_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z619TBM24_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z620TBM24_CRF_ITEM_NM));
      isValidOutput.add(GXutil.rtrim( Z543TBM24_IDENTIFICATION_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z544TBM24_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z545TBM24_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z546TBM24_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z547TBM24_TEXT));
      isValidOutput.add(GXutil.rtrim( Z548TBM24_FIXED_VALUE));
      isValidOutput.add(GXutil.rtrim( Z549TBM24_CHK_FALSE_INNER_VALUE));
      isValidOutput.add(GXutil.rtrim( Z621TBM24_REQUIRED_INPUT_FLG));
      isValidOutput.add(GXutil.rtrim( Z622TBM24_MIN_VALUE));
      isValidOutput.add(GXutil.rtrim( Z623TBM24_MAX_VALUE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z426TBM24_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z427TBM24_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z430TBM24_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z433TBM24_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O434TBM24_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1180 */
                  S1180 ();
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
      lblTextblocktbm24_study_id_Jsonclick = "" ;
      lblTextblocktbm24_dom_cd_Jsonclick = "" ;
      A423TBM24_DOM_CD = "" ;
      lblTextblocktbm24_dom_var_nm_Jsonclick = "" ;
      A424TBM24_DOM_VAR_NM = "" ;
      lblTextblocktbm24_dom_itm_grp_oid_Jsonclick = "" ;
      A617TBM24_DOM_ITM_GRP_OID = "" ;
      lblTextblocktbm24_dom_itm_grp_attr_seq_Jsonclick = "" ;
      lblTextblocktbm24_dom_itm_grp_rowno_Jsonclick = "" ;
      lblTextblocktbm24_crf_item_nm_Jsonclick = "" ;
      A620TBM24_CRF_ITEM_NM = "" ;
      lblTextblocktbm24_crf_item_div_Jsonclick = "" ;
      A425TBM24_CRF_ITEM_DIV = "" ;
      lblTextblocktbm24_identification_cd_Jsonclick = "" ;
      A543TBM24_IDENTIFICATION_CD = "" ;
      lblTextblocktbm24_text_maxlength_Jsonclick = "" ;
      lblTextblocktbm24_text_maxrows_Jsonclick = "" ;
      lblTextblocktbm24_decimal_digits_Jsonclick = "" ;
      lblTextblocktbm24_text_Jsonclick = "" ;
      A547TBM24_TEXT = "" ;
      lblTextblocktbm24_fixed_value_Jsonclick = "" ;
      A548TBM24_FIXED_VALUE = "" ;
      lblTextblocktbm24_chk_false_inner_value_Jsonclick = "" ;
      A549TBM24_CHK_FALSE_INNER_VALUE = "" ;
      lblTextblocktbm24_required_input_flg_Jsonclick = "" ;
      A621TBM24_REQUIRED_INPUT_FLG = "" ;
      lblTextblocktbm24_min_value_Jsonclick = "" ;
      A622TBM24_MIN_VALUE = "" ;
      lblTextblocktbm24_max_value_Jsonclick = "" ;
      A623TBM24_MAX_VALUE = "" ;
      lblTextblocktbm24_order_Jsonclick = "" ;
      lblTextblocktbm24_del_flg_Jsonclick = "" ;
      A427TBM24_DEL_FLG = "" ;
      lblTextblocktbm24_crt_datetime_Jsonclick = "" ;
      A428TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm24_crt_user_id_Jsonclick = "" ;
      A429TBM24_CRT_USER_ID = "" ;
      lblTextblocktbm24_crt_prog_nm_Jsonclick = "" ;
      A430TBM24_CRT_PROG_NM = "" ;
      lblTextblocktbm24_upd_datetime_Jsonclick = "" ;
      A431TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm24_upd_user_id_Jsonclick = "" ;
      A432TBM24_UPD_USER_ID = "" ;
      lblTextblocktbm24_upd_prog_nm_Jsonclick = "" ;
      A433TBM24_UPD_PROG_NM = "" ;
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
      Z423TBM24_DOM_CD = "" ;
      Z424TBM24_DOM_VAR_NM = "" ;
      Z425TBM24_CRF_ITEM_DIV = "" ;
      Z428TBM24_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z429TBM24_CRT_USER_ID = "" ;
      Z431TBM24_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z432TBM24_UPD_USER_ID = "" ;
      Z617TBM24_DOM_ITM_GRP_OID = "" ;
      Z620TBM24_CRF_ITEM_NM = "" ;
      Z543TBM24_IDENTIFICATION_CD = "" ;
      Z547TBM24_TEXT = "" ;
      Z548TBM24_FIXED_VALUE = "" ;
      Z549TBM24_CHK_FALSE_INNER_VALUE = "" ;
      Z621TBM24_REQUIRED_INPUT_FLG = "" ;
      Z622TBM24_MIN_VALUE = "" ;
      Z623TBM24_MAX_VALUE = "" ;
      Z427TBM24_DEL_FLG = "" ;
      Z430TBM24_CRT_PROG_NM = "" ;
      Z433TBM24_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000W5_A423TBM24_DOM_CD = new String[] {""} ;
      T000W5_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W5_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W5_A428TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W5_n428TBM24_CRT_DATETIME = new boolean[] {false} ;
      T000W5_A429TBM24_CRT_USER_ID = new String[] {""} ;
      T000W5_n429TBM24_CRT_USER_ID = new boolean[] {false} ;
      T000W5_A431TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W5_n431TBM24_UPD_DATETIME = new boolean[] {false} ;
      T000W5_A432TBM24_UPD_USER_ID = new String[] {""} ;
      T000W5_n432TBM24_UPD_USER_ID = new boolean[] {false} ;
      T000W5_A434TBM24_UPD_CNT = new long[1] ;
      T000W5_n434TBM24_UPD_CNT = new boolean[] {false} ;
      T000W5_A617TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      T000W5_n617TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000W5_A618TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000W5_n618TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000W5_A619TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000W5_n619TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000W5_A620TBM24_CRF_ITEM_NM = new String[] {""} ;
      T000W5_n620TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      T000W5_A543TBM24_IDENTIFICATION_CD = new String[] {""} ;
      T000W5_n543TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      T000W5_A544TBM24_TEXT_MAXLENGTH = new short[1] ;
      T000W5_n544TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      T000W5_A545TBM24_TEXT_MAXROWS = new byte[1] ;
      T000W5_n545TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      T000W5_A546TBM24_DECIMAL_DIGITS = new byte[1] ;
      T000W5_n546TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      T000W5_A547TBM24_TEXT = new String[] {""} ;
      T000W5_n547TBM24_TEXT = new boolean[] {false} ;
      T000W5_A548TBM24_FIXED_VALUE = new String[] {""} ;
      T000W5_n548TBM24_FIXED_VALUE = new boolean[] {false} ;
      T000W5_A549TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      T000W5_n549TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      T000W5_A621TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000W5_n621TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000W5_A622TBM24_MIN_VALUE = new String[] {""} ;
      T000W5_n622TBM24_MIN_VALUE = new boolean[] {false} ;
      T000W5_A623TBM24_MAX_VALUE = new String[] {""} ;
      T000W5_n623TBM24_MAX_VALUE = new boolean[] {false} ;
      T000W5_A426TBM24_ORDER = new int[1] ;
      T000W5_n426TBM24_ORDER = new boolean[] {false} ;
      T000W5_A427TBM24_DEL_FLG = new String[] {""} ;
      T000W5_n427TBM24_DEL_FLG = new boolean[] {false} ;
      T000W5_A430TBM24_CRT_PROG_NM = new String[] {""} ;
      T000W5_n430TBM24_CRT_PROG_NM = new boolean[] {false} ;
      T000W5_A433TBM24_UPD_PROG_NM = new String[] {""} ;
      T000W5_n433TBM24_UPD_PROG_NM = new boolean[] {false} ;
      T000W5_A422TBM24_STUDY_ID = new long[1] ;
      T000W4_A422TBM24_STUDY_ID = new long[1] ;
      T000W6_A422TBM24_STUDY_ID = new long[1] ;
      T000W7_A422TBM24_STUDY_ID = new long[1] ;
      T000W7_A423TBM24_DOM_CD = new String[] {""} ;
      T000W7_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W7_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W3_A423TBM24_DOM_CD = new String[] {""} ;
      T000W3_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W3_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W3_A428TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W3_n428TBM24_CRT_DATETIME = new boolean[] {false} ;
      T000W3_A429TBM24_CRT_USER_ID = new String[] {""} ;
      T000W3_n429TBM24_CRT_USER_ID = new boolean[] {false} ;
      T000W3_A431TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W3_n431TBM24_UPD_DATETIME = new boolean[] {false} ;
      T000W3_A432TBM24_UPD_USER_ID = new String[] {""} ;
      T000W3_n432TBM24_UPD_USER_ID = new boolean[] {false} ;
      T000W3_A434TBM24_UPD_CNT = new long[1] ;
      T000W3_n434TBM24_UPD_CNT = new boolean[] {false} ;
      T000W3_A617TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      T000W3_n617TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000W3_A618TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000W3_n618TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000W3_A619TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000W3_n619TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000W3_A620TBM24_CRF_ITEM_NM = new String[] {""} ;
      T000W3_n620TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      T000W3_A543TBM24_IDENTIFICATION_CD = new String[] {""} ;
      T000W3_n543TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      T000W3_A544TBM24_TEXT_MAXLENGTH = new short[1] ;
      T000W3_n544TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      T000W3_A545TBM24_TEXT_MAXROWS = new byte[1] ;
      T000W3_n545TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      T000W3_A546TBM24_DECIMAL_DIGITS = new byte[1] ;
      T000W3_n546TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      T000W3_A547TBM24_TEXT = new String[] {""} ;
      T000W3_n547TBM24_TEXT = new boolean[] {false} ;
      T000W3_A548TBM24_FIXED_VALUE = new String[] {""} ;
      T000W3_n548TBM24_FIXED_VALUE = new boolean[] {false} ;
      T000W3_A549TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      T000W3_n549TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      T000W3_A621TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000W3_n621TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000W3_A622TBM24_MIN_VALUE = new String[] {""} ;
      T000W3_n622TBM24_MIN_VALUE = new boolean[] {false} ;
      T000W3_A623TBM24_MAX_VALUE = new String[] {""} ;
      T000W3_n623TBM24_MAX_VALUE = new boolean[] {false} ;
      T000W3_A426TBM24_ORDER = new int[1] ;
      T000W3_n426TBM24_ORDER = new boolean[] {false} ;
      T000W3_A427TBM24_DEL_FLG = new String[] {""} ;
      T000W3_n427TBM24_DEL_FLG = new boolean[] {false} ;
      T000W3_A430TBM24_CRT_PROG_NM = new String[] {""} ;
      T000W3_n430TBM24_CRT_PROG_NM = new boolean[] {false} ;
      T000W3_A433TBM24_UPD_PROG_NM = new String[] {""} ;
      T000W3_n433TBM24_UPD_PROG_NM = new boolean[] {false} ;
      T000W3_A422TBM24_STUDY_ID = new long[1] ;
      sMode31 = "" ;
      T000W8_A422TBM24_STUDY_ID = new long[1] ;
      T000W8_A423TBM24_DOM_CD = new String[] {""} ;
      T000W8_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W8_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W9_A422TBM24_STUDY_ID = new long[1] ;
      T000W9_A423TBM24_DOM_CD = new String[] {""} ;
      T000W9_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W9_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W2_A423TBM24_DOM_CD = new String[] {""} ;
      T000W2_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W2_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000W2_A428TBM24_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W2_n428TBM24_CRT_DATETIME = new boolean[] {false} ;
      T000W2_A429TBM24_CRT_USER_ID = new String[] {""} ;
      T000W2_n429TBM24_CRT_USER_ID = new boolean[] {false} ;
      T000W2_A431TBM24_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000W2_n431TBM24_UPD_DATETIME = new boolean[] {false} ;
      T000W2_A432TBM24_UPD_USER_ID = new String[] {""} ;
      T000W2_n432TBM24_UPD_USER_ID = new boolean[] {false} ;
      T000W2_A434TBM24_UPD_CNT = new long[1] ;
      T000W2_n434TBM24_UPD_CNT = new boolean[] {false} ;
      T000W2_A617TBM24_DOM_ITM_GRP_OID = new String[] {""} ;
      T000W2_n617TBM24_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000W2_A618TBM24_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000W2_n618TBM24_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000W2_A619TBM24_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000W2_n619TBM24_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000W2_A620TBM24_CRF_ITEM_NM = new String[] {""} ;
      T000W2_n620TBM24_CRF_ITEM_NM = new boolean[] {false} ;
      T000W2_A543TBM24_IDENTIFICATION_CD = new String[] {""} ;
      T000W2_n543TBM24_IDENTIFICATION_CD = new boolean[] {false} ;
      T000W2_A544TBM24_TEXT_MAXLENGTH = new short[1] ;
      T000W2_n544TBM24_TEXT_MAXLENGTH = new boolean[] {false} ;
      T000W2_A545TBM24_TEXT_MAXROWS = new byte[1] ;
      T000W2_n545TBM24_TEXT_MAXROWS = new boolean[] {false} ;
      T000W2_A546TBM24_DECIMAL_DIGITS = new byte[1] ;
      T000W2_n546TBM24_DECIMAL_DIGITS = new boolean[] {false} ;
      T000W2_A547TBM24_TEXT = new String[] {""} ;
      T000W2_n547TBM24_TEXT = new boolean[] {false} ;
      T000W2_A548TBM24_FIXED_VALUE = new String[] {""} ;
      T000W2_n548TBM24_FIXED_VALUE = new boolean[] {false} ;
      T000W2_A549TBM24_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      T000W2_n549TBM24_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      T000W2_A621TBM24_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000W2_n621TBM24_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000W2_A622TBM24_MIN_VALUE = new String[] {""} ;
      T000W2_n622TBM24_MIN_VALUE = new boolean[] {false} ;
      T000W2_A623TBM24_MAX_VALUE = new String[] {""} ;
      T000W2_n623TBM24_MAX_VALUE = new boolean[] {false} ;
      T000W2_A426TBM24_ORDER = new int[1] ;
      T000W2_n426TBM24_ORDER = new boolean[] {false} ;
      T000W2_A427TBM24_DEL_FLG = new String[] {""} ;
      T000W2_n427TBM24_DEL_FLG = new boolean[] {false} ;
      T000W2_A430TBM24_CRT_PROG_NM = new String[] {""} ;
      T000W2_n430TBM24_CRT_PROG_NM = new boolean[] {false} ;
      T000W2_A433TBM24_UPD_PROG_NM = new String[] {""} ;
      T000W2_n433TBM24_UPD_PROG_NM = new boolean[] {false} ;
      T000W2_A422TBM24_STUDY_ID = new long[1] ;
      T000W13_A422TBM24_STUDY_ID = new long[1] ;
      T000W13_A423TBM24_DOM_CD = new String[] {""} ;
      T000W13_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      T000W13_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      T000W14_A422TBM24_STUDY_ID = new long[1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm24_map_item__default(),
         new Object[] {
             new Object[] {
            T000W2_A423TBM24_DOM_CD, T000W2_A424TBM24_DOM_VAR_NM, T000W2_A425TBM24_CRF_ITEM_DIV, T000W2_A428TBM24_CRT_DATETIME, T000W2_n428TBM24_CRT_DATETIME, T000W2_A429TBM24_CRT_USER_ID, T000W2_n429TBM24_CRT_USER_ID, T000W2_A431TBM24_UPD_DATETIME, T000W2_n431TBM24_UPD_DATETIME, T000W2_A432TBM24_UPD_USER_ID,
            T000W2_n432TBM24_UPD_USER_ID, T000W2_A434TBM24_UPD_CNT, T000W2_n434TBM24_UPD_CNT, T000W2_A617TBM24_DOM_ITM_GRP_OID, T000W2_n617TBM24_DOM_ITM_GRP_OID, T000W2_A618TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W2_n618TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W2_A619TBM24_DOM_ITM_GRP_ROWNO, T000W2_n619TBM24_DOM_ITM_GRP_ROWNO, T000W2_A620TBM24_CRF_ITEM_NM,
            T000W2_n620TBM24_CRF_ITEM_NM, T000W2_A543TBM24_IDENTIFICATION_CD, T000W2_n543TBM24_IDENTIFICATION_CD, T000W2_A544TBM24_TEXT_MAXLENGTH, T000W2_n544TBM24_TEXT_MAXLENGTH, T000W2_A545TBM24_TEXT_MAXROWS, T000W2_n545TBM24_TEXT_MAXROWS, T000W2_A546TBM24_DECIMAL_DIGITS, T000W2_n546TBM24_DECIMAL_DIGITS, T000W2_A547TBM24_TEXT,
            T000W2_n547TBM24_TEXT, T000W2_A548TBM24_FIXED_VALUE, T000W2_n548TBM24_FIXED_VALUE, T000W2_A549TBM24_CHK_FALSE_INNER_VALUE, T000W2_n549TBM24_CHK_FALSE_INNER_VALUE, T000W2_A621TBM24_REQUIRED_INPUT_FLG, T000W2_n621TBM24_REQUIRED_INPUT_FLG, T000W2_A622TBM24_MIN_VALUE, T000W2_n622TBM24_MIN_VALUE, T000W2_A623TBM24_MAX_VALUE,
            T000W2_n623TBM24_MAX_VALUE, T000W2_A426TBM24_ORDER, T000W2_n426TBM24_ORDER, T000W2_A427TBM24_DEL_FLG, T000W2_n427TBM24_DEL_FLG, T000W2_A430TBM24_CRT_PROG_NM, T000W2_n430TBM24_CRT_PROG_NM, T000W2_A433TBM24_UPD_PROG_NM, T000W2_n433TBM24_UPD_PROG_NM, T000W2_A422TBM24_STUDY_ID
            }
            , new Object[] {
            T000W3_A423TBM24_DOM_CD, T000W3_A424TBM24_DOM_VAR_NM, T000W3_A425TBM24_CRF_ITEM_DIV, T000W3_A428TBM24_CRT_DATETIME, T000W3_n428TBM24_CRT_DATETIME, T000W3_A429TBM24_CRT_USER_ID, T000W3_n429TBM24_CRT_USER_ID, T000W3_A431TBM24_UPD_DATETIME, T000W3_n431TBM24_UPD_DATETIME, T000W3_A432TBM24_UPD_USER_ID,
            T000W3_n432TBM24_UPD_USER_ID, T000W3_A434TBM24_UPD_CNT, T000W3_n434TBM24_UPD_CNT, T000W3_A617TBM24_DOM_ITM_GRP_OID, T000W3_n617TBM24_DOM_ITM_GRP_OID, T000W3_A618TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W3_n618TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W3_A619TBM24_DOM_ITM_GRP_ROWNO, T000W3_n619TBM24_DOM_ITM_GRP_ROWNO, T000W3_A620TBM24_CRF_ITEM_NM,
            T000W3_n620TBM24_CRF_ITEM_NM, T000W3_A543TBM24_IDENTIFICATION_CD, T000W3_n543TBM24_IDENTIFICATION_CD, T000W3_A544TBM24_TEXT_MAXLENGTH, T000W3_n544TBM24_TEXT_MAXLENGTH, T000W3_A545TBM24_TEXT_MAXROWS, T000W3_n545TBM24_TEXT_MAXROWS, T000W3_A546TBM24_DECIMAL_DIGITS, T000W3_n546TBM24_DECIMAL_DIGITS, T000W3_A547TBM24_TEXT,
            T000W3_n547TBM24_TEXT, T000W3_A548TBM24_FIXED_VALUE, T000W3_n548TBM24_FIXED_VALUE, T000W3_A549TBM24_CHK_FALSE_INNER_VALUE, T000W3_n549TBM24_CHK_FALSE_INNER_VALUE, T000W3_A621TBM24_REQUIRED_INPUT_FLG, T000W3_n621TBM24_REQUIRED_INPUT_FLG, T000W3_A622TBM24_MIN_VALUE, T000W3_n622TBM24_MIN_VALUE, T000W3_A623TBM24_MAX_VALUE,
            T000W3_n623TBM24_MAX_VALUE, T000W3_A426TBM24_ORDER, T000W3_n426TBM24_ORDER, T000W3_A427TBM24_DEL_FLG, T000W3_n427TBM24_DEL_FLG, T000W3_A430TBM24_CRT_PROG_NM, T000W3_n430TBM24_CRT_PROG_NM, T000W3_A433TBM24_UPD_PROG_NM, T000W3_n433TBM24_UPD_PROG_NM, T000W3_A422TBM24_STUDY_ID
            }
            , new Object[] {
            T000W4_A422TBM24_STUDY_ID
            }
            , new Object[] {
            T000W5_A423TBM24_DOM_CD, T000W5_A424TBM24_DOM_VAR_NM, T000W5_A425TBM24_CRF_ITEM_DIV, T000W5_A428TBM24_CRT_DATETIME, T000W5_n428TBM24_CRT_DATETIME, T000W5_A429TBM24_CRT_USER_ID, T000W5_n429TBM24_CRT_USER_ID, T000W5_A431TBM24_UPD_DATETIME, T000W5_n431TBM24_UPD_DATETIME, T000W5_A432TBM24_UPD_USER_ID,
            T000W5_n432TBM24_UPD_USER_ID, T000W5_A434TBM24_UPD_CNT, T000W5_n434TBM24_UPD_CNT, T000W5_A617TBM24_DOM_ITM_GRP_OID, T000W5_n617TBM24_DOM_ITM_GRP_OID, T000W5_A618TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W5_n618TBM24_DOM_ITM_GRP_ATTR_SEQ, T000W5_A619TBM24_DOM_ITM_GRP_ROWNO, T000W5_n619TBM24_DOM_ITM_GRP_ROWNO, T000W5_A620TBM24_CRF_ITEM_NM,
            T000W5_n620TBM24_CRF_ITEM_NM, T000W5_A543TBM24_IDENTIFICATION_CD, T000W5_n543TBM24_IDENTIFICATION_CD, T000W5_A544TBM24_TEXT_MAXLENGTH, T000W5_n544TBM24_TEXT_MAXLENGTH, T000W5_A545TBM24_TEXT_MAXROWS, T000W5_n545TBM24_TEXT_MAXROWS, T000W5_A546TBM24_DECIMAL_DIGITS, T000W5_n546TBM24_DECIMAL_DIGITS, T000W5_A547TBM24_TEXT,
            T000W5_n547TBM24_TEXT, T000W5_A548TBM24_FIXED_VALUE, T000W5_n548TBM24_FIXED_VALUE, T000W5_A549TBM24_CHK_FALSE_INNER_VALUE, T000W5_n549TBM24_CHK_FALSE_INNER_VALUE, T000W5_A621TBM24_REQUIRED_INPUT_FLG, T000W5_n621TBM24_REQUIRED_INPUT_FLG, T000W5_A622TBM24_MIN_VALUE, T000W5_n622TBM24_MIN_VALUE, T000W5_A623TBM24_MAX_VALUE,
            T000W5_n623TBM24_MAX_VALUE, T000W5_A426TBM24_ORDER, T000W5_n426TBM24_ORDER, T000W5_A427TBM24_DEL_FLG, T000W5_n427TBM24_DEL_FLG, T000W5_A430TBM24_CRT_PROG_NM, T000W5_n430TBM24_CRT_PROG_NM, T000W5_A433TBM24_UPD_PROG_NM, T000W5_n433TBM24_UPD_PROG_NM, T000W5_A422TBM24_STUDY_ID
            }
            , new Object[] {
            T000W6_A422TBM24_STUDY_ID
            }
            , new Object[] {
            T000W7_A422TBM24_STUDY_ID, T000W7_A423TBM24_DOM_CD, T000W7_A424TBM24_DOM_VAR_NM, T000W7_A425TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            T000W8_A422TBM24_STUDY_ID, T000W8_A423TBM24_DOM_CD, T000W8_A424TBM24_DOM_VAR_NM, T000W8_A425TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            T000W9_A422TBM24_STUDY_ID, T000W9_A423TBM24_DOM_CD, T000W9_A424TBM24_DOM_VAR_NM, T000W9_A425TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000W13_A422TBM24_STUDY_ID, T000W13_A423TBM24_DOM_CD, T000W13_A424TBM24_DOM_VAR_NM, T000W13_A425TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            T000W14_A422TBM24_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM24_MAP_ITEM" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A545TBM24_TEXT_MAXROWS ;
   private byte A546TBM24_DECIMAL_DIGITS ;
   private byte Z545TBM24_TEXT_MAXROWS ;
   private byte Z546TBM24_DECIMAL_DIGITS ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short A619TBM24_DOM_ITM_GRP_ROWNO ;
   private short A544TBM24_TEXT_MAXLENGTH ;
   private short Z618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short Z619TBM24_DOM_ITM_GRP_ROWNO ;
   private short Z544TBM24_TEXT_MAXLENGTH ;
   private short RcdFound31 ;
   private short Gx_err ;
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
   private int A426TBM24_ORDER ;
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
   private int Z426TBM24_ORDER ;
   private int GX_JID ;
   private int AnyError422 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A422TBM24_STUDY_ID ;
   private long A434TBM24_UPD_CNT ;
   private long Z422TBM24_STUDY_ID ;
   private long Z434TBM24_UPD_CNT ;
   private long O434TBM24_UPD_CNT ;
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
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A428TBM24_CRT_DATETIME ;
   private java.util.Date A431TBM24_UPD_DATETIME ;
   private java.util.Date Z428TBM24_CRT_DATETIME ;
   private java.util.Date Z431TBM24_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n617TBM24_DOM_ITM_GRP_OID ;
   private boolean n618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n619TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean n620TBM24_CRF_ITEM_NM ;
   private boolean n543TBM24_IDENTIFICATION_CD ;
   private boolean n544TBM24_TEXT_MAXLENGTH ;
   private boolean n545TBM24_TEXT_MAXROWS ;
   private boolean n546TBM24_DECIMAL_DIGITS ;
   private boolean n547TBM24_TEXT ;
   private boolean n548TBM24_FIXED_VALUE ;
   private boolean n549TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean n621TBM24_REQUIRED_INPUT_FLG ;
   private boolean n622TBM24_MIN_VALUE ;
   private boolean n623TBM24_MAX_VALUE ;
   private boolean n426TBM24_ORDER ;
   private boolean n427TBM24_DEL_FLG ;
   private boolean n428TBM24_CRT_DATETIME ;
   private boolean n429TBM24_CRT_USER_ID ;
   private boolean n430TBM24_CRT_PROG_NM ;
   private boolean n431TBM24_UPD_DATETIME ;
   private boolean n432TBM24_UPD_USER_ID ;
   private boolean n433TBM24_UPD_PROG_NM ;
   private boolean n434TBM24_UPD_CNT ;
   private boolean Gx_longc ;
   private String A423TBM24_DOM_CD ;
   private String A424TBM24_DOM_VAR_NM ;
   private String A617TBM24_DOM_ITM_GRP_OID ;
   private String A620TBM24_CRF_ITEM_NM ;
   private String A425TBM24_CRF_ITEM_DIV ;
   private String A543TBM24_IDENTIFICATION_CD ;
   private String A547TBM24_TEXT ;
   private String A548TBM24_FIXED_VALUE ;
   private String A549TBM24_CHK_FALSE_INNER_VALUE ;
   private String A621TBM24_REQUIRED_INPUT_FLG ;
   private String A622TBM24_MIN_VALUE ;
   private String A623TBM24_MAX_VALUE ;
   private String A427TBM24_DEL_FLG ;
   private String A429TBM24_CRT_USER_ID ;
   private String A430TBM24_CRT_PROG_NM ;
   private String A432TBM24_UPD_USER_ID ;
   private String A433TBM24_UPD_PROG_NM ;
   private String Z423TBM24_DOM_CD ;
   private String Z424TBM24_DOM_VAR_NM ;
   private String Z425TBM24_CRF_ITEM_DIV ;
   private String Z429TBM24_CRT_USER_ID ;
   private String Z432TBM24_UPD_USER_ID ;
   private String Z617TBM24_DOM_ITM_GRP_OID ;
   private String Z620TBM24_CRF_ITEM_NM ;
   private String Z543TBM24_IDENTIFICATION_CD ;
   private String Z547TBM24_TEXT ;
   private String Z548TBM24_FIXED_VALUE ;
   private String Z549TBM24_CHK_FALSE_INNER_VALUE ;
   private String Z621TBM24_REQUIRED_INPUT_FLG ;
   private String Z622TBM24_MIN_VALUE ;
   private String Z623TBM24_MAX_VALUE ;
   private String Z427TBM24_DEL_FLG ;
   private String Z430TBM24_CRT_PROG_NM ;
   private String Z433TBM24_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000W5_A423TBM24_DOM_CD ;
   private String[] T000W5_A424TBM24_DOM_VAR_NM ;
   private String[] T000W5_A425TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] T000W5_A428TBM24_CRT_DATETIME ;
   private boolean[] T000W5_n428TBM24_CRT_DATETIME ;
   private String[] T000W5_A429TBM24_CRT_USER_ID ;
   private boolean[] T000W5_n429TBM24_CRT_USER_ID ;
   private java.util.Date[] T000W5_A431TBM24_UPD_DATETIME ;
   private boolean[] T000W5_n431TBM24_UPD_DATETIME ;
   private String[] T000W5_A432TBM24_UPD_USER_ID ;
   private boolean[] T000W5_n432TBM24_UPD_USER_ID ;
   private long[] T000W5_A434TBM24_UPD_CNT ;
   private boolean[] T000W5_n434TBM24_UPD_CNT ;
   private String[] T000W5_A617TBM24_DOM_ITM_GRP_OID ;
   private boolean[] T000W5_n617TBM24_DOM_ITM_GRP_OID ;
   private short[] T000W5_A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000W5_n618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000W5_A619TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000W5_n619TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] T000W5_A620TBM24_CRF_ITEM_NM ;
   private boolean[] T000W5_n620TBM24_CRF_ITEM_NM ;
   private String[] T000W5_A543TBM24_IDENTIFICATION_CD ;
   private boolean[] T000W5_n543TBM24_IDENTIFICATION_CD ;
   private short[] T000W5_A544TBM24_TEXT_MAXLENGTH ;
   private boolean[] T000W5_n544TBM24_TEXT_MAXLENGTH ;
   private byte[] T000W5_A545TBM24_TEXT_MAXROWS ;
   private boolean[] T000W5_n545TBM24_TEXT_MAXROWS ;
   private byte[] T000W5_A546TBM24_DECIMAL_DIGITS ;
   private boolean[] T000W5_n546TBM24_DECIMAL_DIGITS ;
   private String[] T000W5_A547TBM24_TEXT ;
   private boolean[] T000W5_n547TBM24_TEXT ;
   private String[] T000W5_A548TBM24_FIXED_VALUE ;
   private boolean[] T000W5_n548TBM24_FIXED_VALUE ;
   private String[] T000W5_A549TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] T000W5_n549TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] T000W5_A621TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] T000W5_n621TBM24_REQUIRED_INPUT_FLG ;
   private String[] T000W5_A622TBM24_MIN_VALUE ;
   private boolean[] T000W5_n622TBM24_MIN_VALUE ;
   private String[] T000W5_A623TBM24_MAX_VALUE ;
   private boolean[] T000W5_n623TBM24_MAX_VALUE ;
   private int[] T000W5_A426TBM24_ORDER ;
   private boolean[] T000W5_n426TBM24_ORDER ;
   private String[] T000W5_A427TBM24_DEL_FLG ;
   private boolean[] T000W5_n427TBM24_DEL_FLG ;
   private String[] T000W5_A430TBM24_CRT_PROG_NM ;
   private boolean[] T000W5_n430TBM24_CRT_PROG_NM ;
   private String[] T000W5_A433TBM24_UPD_PROG_NM ;
   private boolean[] T000W5_n433TBM24_UPD_PROG_NM ;
   private long[] T000W5_A422TBM24_STUDY_ID ;
   private long[] T000W4_A422TBM24_STUDY_ID ;
   private long[] T000W6_A422TBM24_STUDY_ID ;
   private long[] T000W7_A422TBM24_STUDY_ID ;
   private String[] T000W7_A423TBM24_DOM_CD ;
   private String[] T000W7_A424TBM24_DOM_VAR_NM ;
   private String[] T000W7_A425TBM24_CRF_ITEM_DIV ;
   private String[] T000W3_A423TBM24_DOM_CD ;
   private String[] T000W3_A424TBM24_DOM_VAR_NM ;
   private String[] T000W3_A425TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] T000W3_A428TBM24_CRT_DATETIME ;
   private boolean[] T000W3_n428TBM24_CRT_DATETIME ;
   private String[] T000W3_A429TBM24_CRT_USER_ID ;
   private boolean[] T000W3_n429TBM24_CRT_USER_ID ;
   private java.util.Date[] T000W3_A431TBM24_UPD_DATETIME ;
   private boolean[] T000W3_n431TBM24_UPD_DATETIME ;
   private String[] T000W3_A432TBM24_UPD_USER_ID ;
   private boolean[] T000W3_n432TBM24_UPD_USER_ID ;
   private long[] T000W3_A434TBM24_UPD_CNT ;
   private boolean[] T000W3_n434TBM24_UPD_CNT ;
   private String[] T000W3_A617TBM24_DOM_ITM_GRP_OID ;
   private boolean[] T000W3_n617TBM24_DOM_ITM_GRP_OID ;
   private short[] T000W3_A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000W3_n618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000W3_A619TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000W3_n619TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] T000W3_A620TBM24_CRF_ITEM_NM ;
   private boolean[] T000W3_n620TBM24_CRF_ITEM_NM ;
   private String[] T000W3_A543TBM24_IDENTIFICATION_CD ;
   private boolean[] T000W3_n543TBM24_IDENTIFICATION_CD ;
   private short[] T000W3_A544TBM24_TEXT_MAXLENGTH ;
   private boolean[] T000W3_n544TBM24_TEXT_MAXLENGTH ;
   private byte[] T000W3_A545TBM24_TEXT_MAXROWS ;
   private boolean[] T000W3_n545TBM24_TEXT_MAXROWS ;
   private byte[] T000W3_A546TBM24_DECIMAL_DIGITS ;
   private boolean[] T000W3_n546TBM24_DECIMAL_DIGITS ;
   private String[] T000W3_A547TBM24_TEXT ;
   private boolean[] T000W3_n547TBM24_TEXT ;
   private String[] T000W3_A548TBM24_FIXED_VALUE ;
   private boolean[] T000W3_n548TBM24_FIXED_VALUE ;
   private String[] T000W3_A549TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] T000W3_n549TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] T000W3_A621TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] T000W3_n621TBM24_REQUIRED_INPUT_FLG ;
   private String[] T000W3_A622TBM24_MIN_VALUE ;
   private boolean[] T000W3_n622TBM24_MIN_VALUE ;
   private String[] T000W3_A623TBM24_MAX_VALUE ;
   private boolean[] T000W3_n623TBM24_MAX_VALUE ;
   private int[] T000W3_A426TBM24_ORDER ;
   private boolean[] T000W3_n426TBM24_ORDER ;
   private String[] T000W3_A427TBM24_DEL_FLG ;
   private boolean[] T000W3_n427TBM24_DEL_FLG ;
   private String[] T000W3_A430TBM24_CRT_PROG_NM ;
   private boolean[] T000W3_n430TBM24_CRT_PROG_NM ;
   private String[] T000W3_A433TBM24_UPD_PROG_NM ;
   private boolean[] T000W3_n433TBM24_UPD_PROG_NM ;
   private long[] T000W3_A422TBM24_STUDY_ID ;
   private long[] T000W8_A422TBM24_STUDY_ID ;
   private String[] T000W8_A423TBM24_DOM_CD ;
   private String[] T000W8_A424TBM24_DOM_VAR_NM ;
   private String[] T000W8_A425TBM24_CRF_ITEM_DIV ;
   private long[] T000W9_A422TBM24_STUDY_ID ;
   private String[] T000W9_A423TBM24_DOM_CD ;
   private String[] T000W9_A424TBM24_DOM_VAR_NM ;
   private String[] T000W9_A425TBM24_CRF_ITEM_DIV ;
   private String[] T000W2_A423TBM24_DOM_CD ;
   private String[] T000W2_A424TBM24_DOM_VAR_NM ;
   private String[] T000W2_A425TBM24_CRF_ITEM_DIV ;
   private java.util.Date[] T000W2_A428TBM24_CRT_DATETIME ;
   private boolean[] T000W2_n428TBM24_CRT_DATETIME ;
   private String[] T000W2_A429TBM24_CRT_USER_ID ;
   private boolean[] T000W2_n429TBM24_CRT_USER_ID ;
   private java.util.Date[] T000W2_A431TBM24_UPD_DATETIME ;
   private boolean[] T000W2_n431TBM24_UPD_DATETIME ;
   private String[] T000W2_A432TBM24_UPD_USER_ID ;
   private boolean[] T000W2_n432TBM24_UPD_USER_ID ;
   private long[] T000W2_A434TBM24_UPD_CNT ;
   private boolean[] T000W2_n434TBM24_UPD_CNT ;
   private String[] T000W2_A617TBM24_DOM_ITM_GRP_OID ;
   private boolean[] T000W2_n617TBM24_DOM_ITM_GRP_OID ;
   private short[] T000W2_A618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000W2_n618TBM24_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000W2_A619TBM24_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000W2_n619TBM24_DOM_ITM_GRP_ROWNO ;
   private String[] T000W2_A620TBM24_CRF_ITEM_NM ;
   private boolean[] T000W2_n620TBM24_CRF_ITEM_NM ;
   private String[] T000W2_A543TBM24_IDENTIFICATION_CD ;
   private boolean[] T000W2_n543TBM24_IDENTIFICATION_CD ;
   private short[] T000W2_A544TBM24_TEXT_MAXLENGTH ;
   private boolean[] T000W2_n544TBM24_TEXT_MAXLENGTH ;
   private byte[] T000W2_A545TBM24_TEXT_MAXROWS ;
   private boolean[] T000W2_n545TBM24_TEXT_MAXROWS ;
   private byte[] T000W2_A546TBM24_DECIMAL_DIGITS ;
   private boolean[] T000W2_n546TBM24_DECIMAL_DIGITS ;
   private String[] T000W2_A547TBM24_TEXT ;
   private boolean[] T000W2_n547TBM24_TEXT ;
   private String[] T000W2_A548TBM24_FIXED_VALUE ;
   private boolean[] T000W2_n548TBM24_FIXED_VALUE ;
   private String[] T000W2_A549TBM24_CHK_FALSE_INNER_VALUE ;
   private boolean[] T000W2_n549TBM24_CHK_FALSE_INNER_VALUE ;
   private String[] T000W2_A621TBM24_REQUIRED_INPUT_FLG ;
   private boolean[] T000W2_n621TBM24_REQUIRED_INPUT_FLG ;
   private String[] T000W2_A622TBM24_MIN_VALUE ;
   private boolean[] T000W2_n622TBM24_MIN_VALUE ;
   private String[] T000W2_A623TBM24_MAX_VALUE ;
   private boolean[] T000W2_n623TBM24_MAX_VALUE ;
   private int[] T000W2_A426TBM24_ORDER ;
   private boolean[] T000W2_n426TBM24_ORDER ;
   private String[] T000W2_A427TBM24_DEL_FLG ;
   private boolean[] T000W2_n427TBM24_DEL_FLG ;
   private String[] T000W2_A430TBM24_CRT_PROG_NM ;
   private boolean[] T000W2_n430TBM24_CRT_PROG_NM ;
   private String[] T000W2_A433TBM24_UPD_PROG_NM ;
   private boolean[] T000W2_n433TBM24_UPD_PROG_NM ;
   private long[] T000W2_A422TBM24_STUDY_ID ;
   private long[] T000W13_A422TBM24_STUDY_ID ;
   private String[] T000W13_A423TBM24_DOM_CD ;
   private String[] T000W13_A424TBM24_DOM_VAR_NM ;
   private String[] T000W13_A425TBM24_CRF_ITEM_DIV ;
   private long[] T000W14_A422TBM24_STUDY_ID ;
}

final  class tbm24_map_item__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000W2", "SELECT `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W3", "SELECT `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W4", "SELECT `TBM21_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W5", "SELECT TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV`, TM1.`TBM24_CRT_DATETIME`, TM1.`TBM24_CRT_USER_ID`, TM1.`TBM24_UPD_DATETIME`, TM1.`TBM24_UPD_USER_ID`, TM1.`TBM24_UPD_CNT`, TM1.`TBM24_DOM_ITM_GRP_OID`, TM1.`TBM24_DOM_ITM_GRP_ATTR_SEQ`, TM1.`TBM24_DOM_ITM_GRP_ROWNO`, TM1.`TBM24_CRF_ITEM_NM`, TM1.`TBM24_IDENTIFICATION_CD`, TM1.`TBM24_TEXT_MAXLENGTH`, TM1.`TBM24_TEXT_MAXROWS`, TM1.`TBM24_DECIMAL_DIGITS`, TM1.`TBM24_TEXT`, TM1.`TBM24_FIXED_VALUE`, TM1.`TBM24_CHK_FALSE_INNER_VALUE`, TM1.`TBM24_REQUIRED_INPUT_FLG`, TM1.`TBM24_MIN_VALUE`, TM1.`TBM24_MAX_VALUE`, TM1.`TBM24_ORDER`, TM1.`TBM24_DEL_FLG`, TM1.`TBM24_CRT_PROG_NM`, TM1.`TBM24_UPD_PROG_NM`, TM1.`TBM24_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM24_MAP_ITEM` TM1 WHERE TM1.`TBM24_STUDY_ID` = ? and TM1.`TBM24_DOM_CD` = ? and TM1.`TBM24_DOM_VAR_NM` = ? and TM1.`TBM24_CRF_ITEM_DIV` = ? ORDER BY TM1.`TBM24_STUDY_ID`, TM1.`TBM24_DOM_CD`, TM1.`TBM24_DOM_VAR_NM`, TM1.`TBM24_CRF_ITEM_DIV` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000W6", "SELECT `TBM21_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W7", "SELECT `TBM24_STUDY_ID` AS TBM24_STUDY_ID, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000W8", "SELECT `TBM24_STUDY_ID` AS TBM24_STUDY_ID, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE ( `TBM24_STUDY_ID` > ? or `TBM24_STUDY_ID` = ? and `TBM24_DOM_CD` > ? or `TBM24_DOM_CD` = ? and `TBM24_STUDY_ID` = ? and `TBM24_DOM_VAR_NM` > ? or `TBM24_DOM_VAR_NM` = ? and `TBM24_DOM_CD` = ? and `TBM24_STUDY_ID` = ? and `TBM24_CRF_ITEM_DIV` > ?) ORDER BY `TBM24_STUDY_ID`, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000W9", "SELECT `TBM24_STUDY_ID` AS TBM24_STUDY_ID, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE ( `TBM24_STUDY_ID` < ? or `TBM24_STUDY_ID` = ? and `TBM24_DOM_CD` < ? or `TBM24_DOM_CD` = ? and `TBM24_STUDY_ID` = ? and `TBM24_DOM_VAR_NM` < ? or `TBM24_DOM_VAR_NM` = ? and `TBM24_DOM_CD` = ? and `TBM24_STUDY_ID` = ? and `TBM24_CRF_ITEM_DIV` < ?) ORDER BY `TBM24_STUDY_ID` DESC, `TBM24_DOM_CD` DESC, `TBM24_DOM_VAR_NM` DESC, `TBM24_CRF_ITEM_DIV` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000W10", "INSERT INTO `TBM24_MAP_ITEM` (`TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV`, `TBM24_CRT_DATETIME`, `TBM24_CRT_USER_ID`, `TBM24_UPD_DATETIME`, `TBM24_UPD_USER_ID`, `TBM24_UPD_CNT`, `TBM24_DOM_ITM_GRP_OID`, `TBM24_DOM_ITM_GRP_ATTR_SEQ`, `TBM24_DOM_ITM_GRP_ROWNO`, `TBM24_CRF_ITEM_NM`, `TBM24_IDENTIFICATION_CD`, `TBM24_TEXT_MAXLENGTH`, `TBM24_TEXT_MAXROWS`, `TBM24_DECIMAL_DIGITS`, `TBM24_TEXT`, `TBM24_FIXED_VALUE`, `TBM24_CHK_FALSE_INNER_VALUE`, `TBM24_REQUIRED_INPUT_FLG`, `TBM24_MIN_VALUE`, `TBM24_MAX_VALUE`, `TBM24_ORDER`, `TBM24_DEL_FLG`, `TBM24_CRT_PROG_NM`, `TBM24_UPD_PROG_NM`, `TBM24_STUDY_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000W11", "UPDATE `TBM24_MAP_ITEM` SET `TBM24_CRT_DATETIME`=?, `TBM24_CRT_USER_ID`=?, `TBM24_UPD_DATETIME`=?, `TBM24_UPD_USER_ID`=?, `TBM24_UPD_CNT`=?, `TBM24_DOM_ITM_GRP_OID`=?, `TBM24_DOM_ITM_GRP_ATTR_SEQ`=?, `TBM24_DOM_ITM_GRP_ROWNO`=?, `TBM24_CRF_ITEM_NM`=?, `TBM24_IDENTIFICATION_CD`=?, `TBM24_TEXT_MAXLENGTH`=?, `TBM24_TEXT_MAXROWS`=?, `TBM24_DECIMAL_DIGITS`=?, `TBM24_TEXT`=?, `TBM24_FIXED_VALUE`=?, `TBM24_CHK_FALSE_INNER_VALUE`=?, `TBM24_REQUIRED_INPUT_FLG`=?, `TBM24_MIN_VALUE`=?, `TBM24_MAX_VALUE`=?, `TBM24_ORDER`=?, `TBM24_DEL_FLG`=?, `TBM24_CRT_PROG_NM`=?, `TBM24_UPD_PROG_NM`=?  WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?", GX_NOMASK)
         ,new UpdateCursor("T000W12", "DELETE FROM `TBM24_MAP_ITEM`  WHERE `TBM24_STUDY_ID` = ? AND `TBM24_DOM_CD` = ? AND `TBM24_DOM_VAR_NM` = ? AND `TBM24_CRF_ITEM_DIV` = ?", GX_NOMASK)
         ,new ForEachCursor("T000W13", "SELECT `TBM24_STUDY_ID` AS TBM24_STUDY_ID, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` ORDER BY `TBM24_STUDY_ID`, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000W14", "SELECT `TBM21_STUDY_ID` AS TBM24_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               break;
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
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
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
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setVarchar(4, (String)parms[3], 20, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               break;
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
               break;
            case 7 :
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
               break;
            case 8 :
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
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               break;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

