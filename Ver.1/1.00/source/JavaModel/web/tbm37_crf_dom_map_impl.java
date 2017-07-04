/*
               File: tbm37_crf_dom_map_impl
        Description: CRF-ドメインマッピングマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:10.19
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
      Form.getMeta().addItem("Description", "CRF-ドメインマッピングマスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRF-ドメインマッピングマスタ"+"</legend>") ;
         wb_table3_27_0N22( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0N22e( boolean wbgen )
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

   public void wb_table3_27_0N22( boolean wbgen )
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
         wb_table4_33_0N22( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0N22e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM37_CRF_DOM_MAP.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM37_CRF_DOM_MAP.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0N22e( true) ;
      }
      else
      {
         wb_table3_27_0N22e( false) ;
      }
   }

   public void wb_table4_33_0N22( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_study_id_Internalname, "試験ID", "", "", lblTextblocktbm37_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A271TBM37_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM37_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A271TBM37_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A271TBM37_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM37_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crf_id_Internalname, "CRFID", "", "", lblTextblocktbm37_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A272TBM37_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBM37_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A272TBM37_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A272TBM37_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM37_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crf_item_grp_div_Internalname, "項目・グループ識別区分", "", "", lblTextblocktbm37_crf_item_grp_div_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A372TBM37_CRF_ITEM_GRP_DIV", A372TBM37_CRF_ITEM_GRP_DIV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRF_ITEM_GRP_DIV_Internalname, GXutil.rtrim( A372TBM37_CRF_ITEM_GRP_DIV), GXutil.rtrim( localUtil.format( A372TBM37_CRF_ITEM_GRP_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM37_CRF_ITEM_GRP_DIV_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_CRF_ITEM_GRP_DIV_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crf_item_grp_cd_Internalname, "CRF項目コード", "", "", lblTextblocktbm37_crf_item_grp_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A273TBM37_CRF_ITEM_GRP_CD", A273TBM37_CRF_ITEM_GRP_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRF_ITEM_GRP_CD_Internalname, GXutil.rtrim( A273TBM37_CRF_ITEM_GRP_CD), GXutil.rtrim( localUtil.format( A273TBM37_CRF_ITEM_GRP_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM37_CRF_ITEM_GRP_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_CRF_ITEM_GRP_CD_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_visit_no_Internalname, "VISIT番号", "", "", lblTextblocktbm37_visit_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A373TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A373TBM37_VISIT_NO, 3, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_VISIT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A373TBM37_VISIT_NO, (byte)(3), (byte)(0), ".", "")), ((edtTBM37_VISIT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A373TBM37_VISIT_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A373TBM37_VISIT_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM37_VISIT_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_VISIT_NO_Enabled, 0, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbm37_dom_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A374TBM37_DOM_CD", A374TBM37_DOM_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DOM_CD_Internalname, GXutil.rtrim( A374TBM37_DOM_CD), GXutil.rtrim( localUtil.format( A374TBM37_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM37_DOM_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_DOM_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_dom_var_nm_Internalname, "ドメイン変数名", "", "", lblTextblocktbm37_dom_var_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A375TBM37_DOM_VAR_NM", A375TBM37_DOM_VAR_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DOM_VAR_NM_Internalname, GXutil.rtrim( A375TBM37_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A375TBM37_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM37_DOM_VAR_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_DOM_VAR_NM_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_dom_itm_grp_oid_Internalname, "OID", "", "", lblTextblocktbm37_dom_itm_grp_oid_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A376TBM37_DOM_ITM_GRP_OID", A376TBM37_DOM_ITM_GRP_OID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DOM_ITM_GRP_OID_Internalname, GXutil.rtrim( A376TBM37_DOM_ITM_GRP_OID), GXutil.rtrim( localUtil.format( A376TBM37_DOM_ITM_GRP_OID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM37_DOM_ITM_GRP_OID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_DOM_ITM_GRP_OID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_dom_itm_grp_attr_seq_Internalname, "ドメイン内項目グループ内連番", "", "", lblTextblocktbm37_dom_itm_grp_attr_seq_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A377TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname, GXutil.ltrim( localUtil.ntoc( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")), ((edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A377TBM37_DOM_ITM_GRP_ATTR_SEQ), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A377TBM37_DOM_ITM_GRP_ATTR_SEQ), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_dom_itm_grp_rowno_Internalname, "項目グループ行番号", "", "", lblTextblocktbm37_dom_itm_grp_rowno_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A612TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A612TBM37_DOM_ITM_GRP_ROWNO, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DOM_ITM_GRP_ROWNO_Internalname, GXutil.ltrim( localUtil.ntoc( A612TBM37_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")), ((edtTBM37_DOM_ITM_GRP_ROWNO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A612TBM37_DOM_ITM_GRP_ROWNO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A612TBM37_DOM_ITM_GRP_ROWNO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM37_DOM_ITM_GRP_ROWNO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_DOM_ITM_GRP_ROWNO_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm37_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A274TBM37_DEL_FLG", A274TBM37_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_DEL_FLG_Internalname, GXutil.rtrim( A274TBM37_DEL_FLG), GXutil.rtrim( localUtil.format( A274TBM37_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM37_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm37_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A275TBM37_CRT_DATETIME", localUtil.ttoc( A275TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM37_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRT_DATETIME_Internalname, localUtil.format(A275TBM37_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A275TBM37_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM37_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM37_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM37_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm37_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A276TBM37_CRT_USER_ID", A276TBM37_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRT_USER_ID_Internalname, GXutil.rtrim( A276TBM37_CRT_USER_ID), GXutil.rtrim( localUtil.format( A276TBM37_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTBM37_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm37_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A277TBM37_CRT_PROG_NM", A277TBM37_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_CRT_PROG_NM_Internalname, GXutil.rtrim( A277TBM37_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A277TBM37_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtTBM37_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm37_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A278TBM37_UPD_DATETIME", localUtil.ttoc( A278TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM37_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_UPD_DATETIME_Internalname, localUtil.format(A278TBM37_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A278TBM37_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(108);\"", "", "", "", "", edtTBM37_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM37_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM37_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm37_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A279TBM37_UPD_USER_ID", A279TBM37_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_UPD_USER_ID_Internalname, GXutil.rtrim( A279TBM37_UPD_USER_ID), GXutil.rtrim( localUtil.format( A279TBM37_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(113);\"", "", "", "", "", edtTBM37_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm37_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A280TBM37_UPD_PROG_NM", A280TBM37_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_UPD_PROG_NM_Internalname, GXutil.rtrim( A280TBM37_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A280TBM37_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(118);\"", "", "", "", "", edtTBM37_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm37_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm37_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A281TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM37_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A281TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM37_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A281TBM37_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A281TBM37_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(123);\"", "", "", "", "", edtTBM37_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM37_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM37_CRF_DOM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0N22e( true) ;
      }
      else
      {
         wb_table4_33_0N22e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM37_CRF_DOM_MAP.htm");
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
               A271TBM37_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
            }
            else
            {
               A271TBM37_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM37_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM37_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A272TBM37_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
            }
            else
            {
               A272TBM37_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM37_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
            }
            A372TBM37_CRF_ITEM_GRP_DIV = httpContext.cgiGet( edtTBM37_CRF_ITEM_GRP_DIV_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A372TBM37_CRF_ITEM_GRP_DIV", A372TBM37_CRF_ITEM_GRP_DIV);
            A273TBM37_CRF_ITEM_GRP_CD = httpContext.cgiGet( edtTBM37_CRF_ITEM_GRP_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A273TBM37_CRF_ITEM_GRP_CD", A273TBM37_CRF_ITEM_GRP_CD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_VISIT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_VISIT_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM37_VISIT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_VISIT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A373TBM37_VISIT_NO = (short)(0) ;
               n373TBM37_VISIT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A373TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A373TBM37_VISIT_NO, 3, 0)));
            }
            else
            {
               A373TBM37_VISIT_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM37_VISIT_NO_Internalname), ".", ",")) ;
               n373TBM37_VISIT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A373TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A373TBM37_VISIT_NO, 3, 0)));
            }
            n373TBM37_VISIT_NO = ((0==A373TBM37_VISIT_NO) ? true : false) ;
            A374TBM37_DOM_CD = httpContext.cgiGet( edtTBM37_DOM_CD_Internalname) ;
            n374TBM37_DOM_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A374TBM37_DOM_CD", A374TBM37_DOM_CD);
            n374TBM37_DOM_CD = ((GXutil.strcmp("", A374TBM37_DOM_CD)==0) ? true : false) ;
            A375TBM37_DOM_VAR_NM = httpContext.cgiGet( edtTBM37_DOM_VAR_NM_Internalname) ;
            n375TBM37_DOM_VAR_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A375TBM37_DOM_VAR_NM", A375TBM37_DOM_VAR_NM);
            n375TBM37_DOM_VAR_NM = ((GXutil.strcmp("", A375TBM37_DOM_VAR_NM)==0) ? true : false) ;
            A376TBM37_DOM_ITM_GRP_OID = httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_OID_Internalname) ;
            n376TBM37_DOM_ITM_GRP_OID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A376TBM37_DOM_ITM_GRP_OID", A376TBM37_DOM_ITM_GRP_OID);
            n376TBM37_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A376TBM37_DOM_ITM_GRP_OID)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM37_DOM_ITM_GRP_ATTR_SEQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A377TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
               n377TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A377TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
            }
            else
            {
               A377TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",")) ;
               n377TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A377TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
            }
            n377TBM37_DOM_ITM_GRP_ATTR_SEQ = ((0==A377TBM37_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM37_DOM_ITM_GRP_ROWNO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_DOM_ITM_GRP_ROWNO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A612TBM37_DOM_ITM_GRP_ROWNO = (short)(0) ;
               n612TBM37_DOM_ITM_GRP_ROWNO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A612TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A612TBM37_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            else
            {
               A612TBM37_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM37_DOM_ITM_GRP_ROWNO_Internalname), ".", ",")) ;
               n612TBM37_DOM_ITM_GRP_ROWNO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A612TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A612TBM37_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            n612TBM37_DOM_ITM_GRP_ROWNO = ((0==A612TBM37_DOM_ITM_GRP_ROWNO) ? true : false) ;
            A274TBM37_DEL_FLG = httpContext.cgiGet( edtTBM37_DEL_FLG_Internalname) ;
            n274TBM37_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A274TBM37_DEL_FLG", A274TBM37_DEL_FLG);
            n274TBM37_DEL_FLG = ((GXutil.strcmp("", A274TBM37_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM37_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM37_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A275TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n275TBM37_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A275TBM37_CRT_DATETIME", localUtil.ttoc( A275TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A275TBM37_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM37_CRT_DATETIME_Internalname)) ;
               n275TBM37_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A275TBM37_CRT_DATETIME", localUtil.ttoc( A275TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n275TBM37_CRT_DATETIME = (GXutil.nullDate().equals(A275TBM37_CRT_DATETIME) ? true : false) ;
            A276TBM37_CRT_USER_ID = httpContext.cgiGet( edtTBM37_CRT_USER_ID_Internalname) ;
            n276TBM37_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A276TBM37_CRT_USER_ID", A276TBM37_CRT_USER_ID);
            n276TBM37_CRT_USER_ID = ((GXutil.strcmp("", A276TBM37_CRT_USER_ID)==0) ? true : false) ;
            A277TBM37_CRT_PROG_NM = httpContext.cgiGet( edtTBM37_CRT_PROG_NM_Internalname) ;
            n277TBM37_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A277TBM37_CRT_PROG_NM", A277TBM37_CRT_PROG_NM);
            n277TBM37_CRT_PROG_NM = ((GXutil.strcmp("", A277TBM37_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM37_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM37_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A278TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n278TBM37_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A278TBM37_UPD_DATETIME", localUtil.ttoc( A278TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A278TBM37_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM37_UPD_DATETIME_Internalname)) ;
               n278TBM37_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A278TBM37_UPD_DATETIME", localUtil.ttoc( A278TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n278TBM37_UPD_DATETIME = (GXutil.nullDate().equals(A278TBM37_UPD_DATETIME) ? true : false) ;
            A279TBM37_UPD_USER_ID = httpContext.cgiGet( edtTBM37_UPD_USER_ID_Internalname) ;
            n279TBM37_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A279TBM37_UPD_USER_ID", A279TBM37_UPD_USER_ID);
            n279TBM37_UPD_USER_ID = ((GXutil.strcmp("", A279TBM37_UPD_USER_ID)==0) ? true : false) ;
            A280TBM37_UPD_PROG_NM = httpContext.cgiGet( edtTBM37_UPD_PROG_NM_Internalname) ;
            n280TBM37_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A280TBM37_UPD_PROG_NM", A280TBM37_UPD_PROG_NM);
            n280TBM37_UPD_PROG_NM = ((GXutil.strcmp("", A280TBM37_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM37_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM37_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM37_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A281TBM37_UPD_CNT = 0 ;
               n281TBM37_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A281TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)));
            }
            else
            {
               A281TBM37_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM37_UPD_CNT_Internalname), ".", ",") ;
               n281TBM37_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A281TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)));
            }
            n281TBM37_UPD_CNT = ((0==A281TBM37_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z271TBM37_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z271TBM37_STUDY_ID"), ".", ",") ;
            Z272TBM37_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z272TBM37_CRF_ID"), ".", ",")) ;
            Z372TBM37_CRF_ITEM_GRP_DIV = httpContext.cgiGet( "Z372TBM37_CRF_ITEM_GRP_DIV") ;
            Z273TBM37_CRF_ITEM_GRP_CD = httpContext.cgiGet( "Z273TBM37_CRF_ITEM_GRP_CD") ;
            Z275TBM37_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z275TBM37_CRT_DATETIME"), 0) ;
            n275TBM37_CRT_DATETIME = (GXutil.nullDate().equals(A275TBM37_CRT_DATETIME) ? true : false) ;
            Z276TBM37_CRT_USER_ID = httpContext.cgiGet( "Z276TBM37_CRT_USER_ID") ;
            n276TBM37_CRT_USER_ID = ((GXutil.strcmp("", A276TBM37_CRT_USER_ID)==0) ? true : false) ;
            Z278TBM37_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z278TBM37_UPD_DATETIME"), 0) ;
            n278TBM37_UPD_DATETIME = (GXutil.nullDate().equals(A278TBM37_UPD_DATETIME) ? true : false) ;
            Z279TBM37_UPD_USER_ID = httpContext.cgiGet( "Z279TBM37_UPD_USER_ID") ;
            n279TBM37_UPD_USER_ID = ((GXutil.strcmp("", A279TBM37_UPD_USER_ID)==0) ? true : false) ;
            Z281TBM37_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z281TBM37_UPD_CNT"), ".", ",") ;
            n281TBM37_UPD_CNT = ((0==A281TBM37_UPD_CNT) ? true : false) ;
            Z373TBM37_VISIT_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z373TBM37_VISIT_NO"), ".", ",")) ;
            n373TBM37_VISIT_NO = ((0==A373TBM37_VISIT_NO) ? true : false) ;
            Z374TBM37_DOM_CD = httpContext.cgiGet( "Z374TBM37_DOM_CD") ;
            n374TBM37_DOM_CD = ((GXutil.strcmp("", A374TBM37_DOM_CD)==0) ? true : false) ;
            Z375TBM37_DOM_VAR_NM = httpContext.cgiGet( "Z375TBM37_DOM_VAR_NM") ;
            n375TBM37_DOM_VAR_NM = ((GXutil.strcmp("", A375TBM37_DOM_VAR_NM)==0) ? true : false) ;
            Z376TBM37_DOM_ITM_GRP_OID = httpContext.cgiGet( "Z376TBM37_DOM_ITM_GRP_OID") ;
            n376TBM37_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A376TBM37_DOM_ITM_GRP_OID)==0) ? true : false) ;
            Z377TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( "Z377TBM37_DOM_ITM_GRP_ATTR_SEQ"), ".", ",")) ;
            n377TBM37_DOM_ITM_GRP_ATTR_SEQ = ((0==A377TBM37_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
            Z612TBM37_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( "Z612TBM37_DOM_ITM_GRP_ROWNO"), ".", ",")) ;
            n612TBM37_DOM_ITM_GRP_ROWNO = ((0==A612TBM37_DOM_ITM_GRP_ROWNO) ? true : false) ;
            Z274TBM37_DEL_FLG = httpContext.cgiGet( "Z274TBM37_DEL_FLG") ;
            n274TBM37_DEL_FLG = ((GXutil.strcmp("", A274TBM37_DEL_FLG)==0) ? true : false) ;
            Z277TBM37_CRT_PROG_NM = httpContext.cgiGet( "Z277TBM37_CRT_PROG_NM") ;
            n277TBM37_CRT_PROG_NM = ((GXutil.strcmp("", A277TBM37_CRT_PROG_NM)==0) ? true : false) ;
            Z280TBM37_UPD_PROG_NM = httpContext.cgiGet( "Z280TBM37_UPD_PROG_NM") ;
            n280TBM37_UPD_PROG_NM = ((GXutil.strcmp("", A280TBM37_UPD_PROG_NM)==0) ? true : false) ;
            O281TBM37_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O281TBM37_UPD_CNT"), ".", ",") ;
            n281TBM37_UPD_CNT = ((0==A281TBM37_UPD_CNT) ? true : false) ;
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
               A271TBM37_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
               A272TBM37_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
               A372TBM37_CRF_ITEM_GRP_DIV = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A372TBM37_CRF_ITEM_GRP_DIV", A372TBM37_CRF_ITEM_GRP_DIV);
               A273TBM37_CRF_ITEM_GRP_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A273TBM37_CRF_ITEM_GRP_CD", A273TBM37_CRF_ITEM_GRP_CD);
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120N2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A272TBM37_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A372TBM37_CRF_ITEM_GRP_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A273TBM37_CRF_ITEM_GRP_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A373TBM37_VISIT_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A374TBM37_DOM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A375TBM37_DOM_VAR_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A376TBM37_DOM_ITM_GRP_OID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A612TBM37_DOM_ITM_GRP_ROWNO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A274TBM37_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A275TBM37_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm37_crf_dom_map_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A275TBM37_CRT_DATETIME", localUtil.ttoc( A275TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A276TBM37_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A277TBM37_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A278TBM37_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm37_crf_dom_map_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A278TBM37_UPD_DATETIME", localUtil.ttoc( A278TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A279TBM37_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A280TBM37_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0N22( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z275TBM37_CRT_DATETIME = T000N3_A275TBM37_CRT_DATETIME[0] ;
            Z276TBM37_CRT_USER_ID = T000N3_A276TBM37_CRT_USER_ID[0] ;
            Z278TBM37_UPD_DATETIME = T000N3_A278TBM37_UPD_DATETIME[0] ;
            Z279TBM37_UPD_USER_ID = T000N3_A279TBM37_UPD_USER_ID[0] ;
            Z281TBM37_UPD_CNT = T000N3_A281TBM37_UPD_CNT[0] ;
            Z373TBM37_VISIT_NO = T000N3_A373TBM37_VISIT_NO[0] ;
            Z374TBM37_DOM_CD = T000N3_A374TBM37_DOM_CD[0] ;
            Z375TBM37_DOM_VAR_NM = T000N3_A375TBM37_DOM_VAR_NM[0] ;
            Z376TBM37_DOM_ITM_GRP_OID = T000N3_A376TBM37_DOM_ITM_GRP_OID[0] ;
            Z377TBM37_DOM_ITM_GRP_ATTR_SEQ = T000N3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
            Z612TBM37_DOM_ITM_GRP_ROWNO = T000N3_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
            Z274TBM37_DEL_FLG = T000N3_A274TBM37_DEL_FLG[0] ;
            Z277TBM37_CRT_PROG_NM = T000N3_A277TBM37_CRT_PROG_NM[0] ;
            Z280TBM37_UPD_PROG_NM = T000N3_A280TBM37_UPD_PROG_NM[0] ;
         }
         else
         {
            Z275TBM37_CRT_DATETIME = A275TBM37_CRT_DATETIME ;
            Z276TBM37_CRT_USER_ID = A276TBM37_CRT_USER_ID ;
            Z278TBM37_UPD_DATETIME = A278TBM37_UPD_DATETIME ;
            Z279TBM37_UPD_USER_ID = A279TBM37_UPD_USER_ID ;
            Z281TBM37_UPD_CNT = A281TBM37_UPD_CNT ;
            Z373TBM37_VISIT_NO = A373TBM37_VISIT_NO ;
            Z374TBM37_DOM_CD = A374TBM37_DOM_CD ;
            Z375TBM37_DOM_VAR_NM = A375TBM37_DOM_VAR_NM ;
            Z376TBM37_DOM_ITM_GRP_OID = A376TBM37_DOM_ITM_GRP_OID ;
            Z377TBM37_DOM_ITM_GRP_ATTR_SEQ = A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
            Z612TBM37_DOM_ITM_GRP_ROWNO = A612TBM37_DOM_ITM_GRP_ROWNO ;
            Z274TBM37_DEL_FLG = A274TBM37_DEL_FLG ;
            Z277TBM37_CRT_PROG_NM = A277TBM37_CRT_PROG_NM ;
            Z280TBM37_UPD_PROG_NM = A280TBM37_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z271TBM37_STUDY_ID = A271TBM37_STUDY_ID ;
         Z272TBM37_CRF_ID = A272TBM37_CRF_ID ;
         Z372TBM37_CRF_ITEM_GRP_DIV = A372TBM37_CRF_ITEM_GRP_DIV ;
         Z273TBM37_CRF_ITEM_GRP_CD = A273TBM37_CRF_ITEM_GRP_CD ;
         Z275TBM37_CRT_DATETIME = A275TBM37_CRT_DATETIME ;
         Z276TBM37_CRT_USER_ID = A276TBM37_CRT_USER_ID ;
         Z278TBM37_UPD_DATETIME = A278TBM37_UPD_DATETIME ;
         Z279TBM37_UPD_USER_ID = A279TBM37_UPD_USER_ID ;
         Z281TBM37_UPD_CNT = A281TBM37_UPD_CNT ;
         Z373TBM37_VISIT_NO = A373TBM37_VISIT_NO ;
         Z374TBM37_DOM_CD = A374TBM37_DOM_CD ;
         Z375TBM37_DOM_VAR_NM = A375TBM37_DOM_VAR_NM ;
         Z376TBM37_DOM_ITM_GRP_OID = A376TBM37_DOM_ITM_GRP_OID ;
         Z377TBM37_DOM_ITM_GRP_ATTR_SEQ = A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
         Z612TBM37_DOM_ITM_GRP_ROWNO = A612TBM37_DOM_ITM_GRP_ROWNO ;
         Z274TBM37_DEL_FLG = A274TBM37_DEL_FLG ;
         Z277TBM37_CRT_PROG_NM = A277TBM37_CRT_PROG_NM ;
         Z280TBM37_UPD_PROG_NM = A280TBM37_UPD_PROG_NM ;
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
      pr_default.execute(2, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A275TBM37_CRT_DATETIME = T000N4_A275TBM37_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A275TBM37_CRT_DATETIME", localUtil.ttoc( A275TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n275TBM37_CRT_DATETIME = T000N4_n275TBM37_CRT_DATETIME[0] ;
         A276TBM37_CRT_USER_ID = T000N4_A276TBM37_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A276TBM37_CRT_USER_ID", A276TBM37_CRT_USER_ID);
         n276TBM37_CRT_USER_ID = T000N4_n276TBM37_CRT_USER_ID[0] ;
         A278TBM37_UPD_DATETIME = T000N4_A278TBM37_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A278TBM37_UPD_DATETIME", localUtil.ttoc( A278TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n278TBM37_UPD_DATETIME = T000N4_n278TBM37_UPD_DATETIME[0] ;
         A279TBM37_UPD_USER_ID = T000N4_A279TBM37_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279TBM37_UPD_USER_ID", A279TBM37_UPD_USER_ID);
         n279TBM37_UPD_USER_ID = T000N4_n279TBM37_UPD_USER_ID[0] ;
         A281TBM37_UPD_CNT = T000N4_A281TBM37_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A281TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)));
         n281TBM37_UPD_CNT = T000N4_n281TBM37_UPD_CNT[0] ;
         A373TBM37_VISIT_NO = T000N4_A373TBM37_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A373TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A373TBM37_VISIT_NO, 3, 0)));
         n373TBM37_VISIT_NO = T000N4_n373TBM37_VISIT_NO[0] ;
         A374TBM37_DOM_CD = T000N4_A374TBM37_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374TBM37_DOM_CD", A374TBM37_DOM_CD);
         n374TBM37_DOM_CD = T000N4_n374TBM37_DOM_CD[0] ;
         A375TBM37_DOM_VAR_NM = T000N4_A375TBM37_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A375TBM37_DOM_VAR_NM", A375TBM37_DOM_VAR_NM);
         n375TBM37_DOM_VAR_NM = T000N4_n375TBM37_DOM_VAR_NM[0] ;
         A376TBM37_DOM_ITM_GRP_OID = T000N4_A376TBM37_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A376TBM37_DOM_ITM_GRP_OID", A376TBM37_DOM_ITM_GRP_OID);
         n376TBM37_DOM_ITM_GRP_OID = T000N4_n376TBM37_DOM_ITM_GRP_OID[0] ;
         A377TBM37_DOM_ITM_GRP_ATTR_SEQ = T000N4_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A377TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         n377TBM37_DOM_ITM_GRP_ATTR_SEQ = T000N4_n377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A612TBM37_DOM_ITM_GRP_ROWNO = T000N4_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A612TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A612TBM37_DOM_ITM_GRP_ROWNO, 4, 0)));
         n612TBM37_DOM_ITM_GRP_ROWNO = T000N4_n612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A274TBM37_DEL_FLG = T000N4_A274TBM37_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A274TBM37_DEL_FLG", A274TBM37_DEL_FLG);
         n274TBM37_DEL_FLG = T000N4_n274TBM37_DEL_FLG[0] ;
         A277TBM37_CRT_PROG_NM = T000N4_A277TBM37_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A277TBM37_CRT_PROG_NM", A277TBM37_CRT_PROG_NM);
         n277TBM37_CRT_PROG_NM = T000N4_n277TBM37_CRT_PROG_NM[0] ;
         A280TBM37_UPD_PROG_NM = T000N4_A280TBM37_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A280TBM37_UPD_PROG_NM", A280TBM37_UPD_PROG_NM);
         n280TBM37_UPD_PROG_NM = T000N4_n280TBM37_UPD_PROG_NM[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A275TBM37_CRT_DATETIME) || (( A275TBM37_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A275TBM37_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A278TBM37_UPD_DATETIME) || (( A278TBM37_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A278TBM37_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
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
      pr_default.execute(3, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
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
      pr_default.execute(1, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0N22( 8) ;
         RcdFound22 = (short)(1) ;
         A271TBM37_STUDY_ID = T000N3_A271TBM37_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
         A272TBM37_CRF_ID = T000N3_A272TBM37_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
         A372TBM37_CRF_ITEM_GRP_DIV = T000N3_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A372TBM37_CRF_ITEM_GRP_DIV", A372TBM37_CRF_ITEM_GRP_DIV);
         A273TBM37_CRF_ITEM_GRP_CD = T000N3_A273TBM37_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A273TBM37_CRF_ITEM_GRP_CD", A273TBM37_CRF_ITEM_GRP_CD);
         A275TBM37_CRT_DATETIME = T000N3_A275TBM37_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A275TBM37_CRT_DATETIME", localUtil.ttoc( A275TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n275TBM37_CRT_DATETIME = T000N3_n275TBM37_CRT_DATETIME[0] ;
         A276TBM37_CRT_USER_ID = T000N3_A276TBM37_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A276TBM37_CRT_USER_ID", A276TBM37_CRT_USER_ID);
         n276TBM37_CRT_USER_ID = T000N3_n276TBM37_CRT_USER_ID[0] ;
         A278TBM37_UPD_DATETIME = T000N3_A278TBM37_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A278TBM37_UPD_DATETIME", localUtil.ttoc( A278TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n278TBM37_UPD_DATETIME = T000N3_n278TBM37_UPD_DATETIME[0] ;
         A279TBM37_UPD_USER_ID = T000N3_A279TBM37_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A279TBM37_UPD_USER_ID", A279TBM37_UPD_USER_ID);
         n279TBM37_UPD_USER_ID = T000N3_n279TBM37_UPD_USER_ID[0] ;
         A281TBM37_UPD_CNT = T000N3_A281TBM37_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A281TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)));
         n281TBM37_UPD_CNT = T000N3_n281TBM37_UPD_CNT[0] ;
         A373TBM37_VISIT_NO = T000N3_A373TBM37_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A373TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A373TBM37_VISIT_NO, 3, 0)));
         n373TBM37_VISIT_NO = T000N3_n373TBM37_VISIT_NO[0] ;
         A374TBM37_DOM_CD = T000N3_A374TBM37_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374TBM37_DOM_CD", A374TBM37_DOM_CD);
         n374TBM37_DOM_CD = T000N3_n374TBM37_DOM_CD[0] ;
         A375TBM37_DOM_VAR_NM = T000N3_A375TBM37_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A375TBM37_DOM_VAR_NM", A375TBM37_DOM_VAR_NM);
         n375TBM37_DOM_VAR_NM = T000N3_n375TBM37_DOM_VAR_NM[0] ;
         A376TBM37_DOM_ITM_GRP_OID = T000N3_A376TBM37_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A376TBM37_DOM_ITM_GRP_OID", A376TBM37_DOM_ITM_GRP_OID);
         n376TBM37_DOM_ITM_GRP_OID = T000N3_n376TBM37_DOM_ITM_GRP_OID[0] ;
         A377TBM37_DOM_ITM_GRP_ATTR_SEQ = T000N3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A377TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         n377TBM37_DOM_ITM_GRP_ATTR_SEQ = T000N3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A612TBM37_DOM_ITM_GRP_ROWNO = T000N3_A612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A612TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A612TBM37_DOM_ITM_GRP_ROWNO, 4, 0)));
         n612TBM37_DOM_ITM_GRP_ROWNO = T000N3_n612TBM37_DOM_ITM_GRP_ROWNO[0] ;
         A274TBM37_DEL_FLG = T000N3_A274TBM37_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A274TBM37_DEL_FLG", A274TBM37_DEL_FLG);
         n274TBM37_DEL_FLG = T000N3_n274TBM37_DEL_FLG[0] ;
         A277TBM37_CRT_PROG_NM = T000N3_A277TBM37_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A277TBM37_CRT_PROG_NM", A277TBM37_CRT_PROG_NM);
         n277TBM37_CRT_PROG_NM = T000N3_n277TBM37_CRT_PROG_NM[0] ;
         A280TBM37_UPD_PROG_NM = T000N3_A280TBM37_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A280TBM37_UPD_PROG_NM", A280TBM37_UPD_PROG_NM);
         n280TBM37_UPD_PROG_NM = T000N3_n280TBM37_UPD_PROG_NM[0] ;
         O281TBM37_UPD_CNT = A281TBM37_UPD_CNT ;
         n281TBM37_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A281TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)));
         Z271TBM37_STUDY_ID = A271TBM37_STUDY_ID ;
         Z272TBM37_CRF_ID = A272TBM37_CRF_ID ;
         Z372TBM37_CRF_ITEM_GRP_DIV = A372TBM37_CRF_ITEM_GRP_DIV ;
         Z273TBM37_CRF_ITEM_GRP_CD = A273TBM37_CRF_ITEM_GRP_CD ;
         sMode22 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0N22( ) ;
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
      pr_default.execute(4, new Object[] {new Long(A271TBM37_STUDY_ID), new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), new Short(A272TBM37_CRF_ID), new Long(A271TBM37_STUDY_ID), A372TBM37_CRF_ITEM_GRP_DIV, A372TBM37_CRF_ITEM_GRP_DIV, new Short(A272TBM37_CRF_ID), new Long(A271TBM37_STUDY_ID), A273TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000N6_A271TBM37_STUDY_ID[0] < A271TBM37_STUDY_ID ) || ( T000N6_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( T000N6_A272TBM37_CRF_ID[0] < A272TBM37_CRF_ID ) || ( T000N6_A272TBM37_CRF_ID[0] == A272TBM37_CRF_ID ) && ( T000N6_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N6_A372TBM37_CRF_ITEM_GRP_DIV[0], A372TBM37_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T000N6_A372TBM37_CRF_ITEM_GRP_DIV[0], A372TBM37_CRF_ITEM_GRP_DIV) == 0 ) && ( T000N6_A272TBM37_CRF_ID[0] == A272TBM37_CRF_ID ) && ( T000N6_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N6_A273TBM37_CRF_ITEM_GRP_CD[0], A273TBM37_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000N6_A271TBM37_STUDY_ID[0] > A271TBM37_STUDY_ID ) || ( T000N6_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( T000N6_A272TBM37_CRF_ID[0] > A272TBM37_CRF_ID ) || ( T000N6_A272TBM37_CRF_ID[0] == A272TBM37_CRF_ID ) && ( T000N6_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N6_A372TBM37_CRF_ITEM_GRP_DIV[0], A372TBM37_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T000N6_A372TBM37_CRF_ITEM_GRP_DIV[0], A372TBM37_CRF_ITEM_GRP_DIV) == 0 ) && ( T000N6_A272TBM37_CRF_ID[0] == A272TBM37_CRF_ID ) && ( T000N6_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N6_A273TBM37_CRF_ITEM_GRP_CD[0], A273TBM37_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            A271TBM37_STUDY_ID = T000N6_A271TBM37_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
            A272TBM37_CRF_ID = T000N6_A272TBM37_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
            A372TBM37_CRF_ITEM_GRP_DIV = T000N6_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A372TBM37_CRF_ITEM_GRP_DIV", A372TBM37_CRF_ITEM_GRP_DIV);
            A273TBM37_CRF_ITEM_GRP_CD = T000N6_A273TBM37_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A273TBM37_CRF_ITEM_GRP_CD", A273TBM37_CRF_ITEM_GRP_CD);
            RcdFound22 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound22 = (short)(0) ;
      /* Using cursor T000N7 */
      pr_default.execute(5, new Object[] {new Long(A271TBM37_STUDY_ID), new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), new Short(A272TBM37_CRF_ID), new Long(A271TBM37_STUDY_ID), A372TBM37_CRF_ITEM_GRP_DIV, A372TBM37_CRF_ITEM_GRP_DIV, new Short(A272TBM37_CRF_ID), new Long(A271TBM37_STUDY_ID), A273TBM37_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000N7_A271TBM37_STUDY_ID[0] > A271TBM37_STUDY_ID ) || ( T000N7_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( T000N7_A272TBM37_CRF_ID[0] > A272TBM37_CRF_ID ) || ( T000N7_A272TBM37_CRF_ID[0] == A272TBM37_CRF_ID ) && ( T000N7_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N7_A372TBM37_CRF_ITEM_GRP_DIV[0], A372TBM37_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T000N7_A372TBM37_CRF_ITEM_GRP_DIV[0], A372TBM37_CRF_ITEM_GRP_DIV) == 0 ) && ( T000N7_A272TBM37_CRF_ID[0] == A272TBM37_CRF_ID ) && ( T000N7_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N7_A273TBM37_CRF_ITEM_GRP_CD[0], A273TBM37_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000N7_A271TBM37_STUDY_ID[0] < A271TBM37_STUDY_ID ) || ( T000N7_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( T000N7_A272TBM37_CRF_ID[0] < A272TBM37_CRF_ID ) || ( T000N7_A272TBM37_CRF_ID[0] == A272TBM37_CRF_ID ) && ( T000N7_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N7_A372TBM37_CRF_ITEM_GRP_DIV[0], A372TBM37_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T000N7_A372TBM37_CRF_ITEM_GRP_DIV[0], A372TBM37_CRF_ITEM_GRP_DIV) == 0 ) && ( T000N7_A272TBM37_CRF_ID[0] == A272TBM37_CRF_ID ) && ( T000N7_A271TBM37_STUDY_ID[0] == A271TBM37_STUDY_ID ) && ( GXutil.strcmp(T000N7_A273TBM37_CRF_ITEM_GRP_CD[0], A273TBM37_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            A271TBM37_STUDY_ID = T000N7_A271TBM37_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
            A272TBM37_CRF_ID = T000N7_A272TBM37_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
            A372TBM37_CRF_ITEM_GRP_DIV = T000N7_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A372TBM37_CRF_ITEM_GRP_DIV", A372TBM37_CRF_ITEM_GRP_DIV);
            A273TBM37_CRF_ITEM_GRP_CD = T000N7_A273TBM37_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A273TBM37_CRF_ITEM_GRP_CD", A273TBM37_CRF_ITEM_GRP_CD);
            RcdFound22 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0N22( ) ;
      if ( RcdFound22 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM37_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM37_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A271TBM37_STUDY_ID != Z271TBM37_STUDY_ID ) || ( A272TBM37_CRF_ID != Z272TBM37_CRF_ID ) || ( GXutil.strcmp(A372TBM37_CRF_ITEM_GRP_DIV, Z372TBM37_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A273TBM37_CRF_ITEM_GRP_CD, Z273TBM37_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A271TBM37_STUDY_ID = Z271TBM37_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
            A272TBM37_CRF_ID = Z272TBM37_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
            A372TBM37_CRF_ITEM_GRP_DIV = Z372TBM37_CRF_ITEM_GRP_DIV ;
            httpContext.ajax_rsp_assign_attri("", false, "A372TBM37_CRF_ITEM_GRP_DIV", A372TBM37_CRF_ITEM_GRP_DIV);
            A273TBM37_CRF_ITEM_GRP_CD = Z273TBM37_CRF_ITEM_GRP_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A273TBM37_CRF_ITEM_GRP_CD", A273TBM37_CRF_ITEM_GRP_CD);
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
         if ( ( A271TBM37_STUDY_ID != Z271TBM37_STUDY_ID ) || ( A272TBM37_CRF_ID != Z272TBM37_CRF_ID ) || ( GXutil.strcmp(A372TBM37_CRF_ITEM_GRP_DIV, Z372TBM37_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A273TBM37_CRF_ITEM_GRP_CD, Z273TBM37_CRF_ITEM_GRP_CD) != 0 ) )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( A271TBM37_STUDY_ID != Z271TBM37_STUDY_ID ) || ( A272TBM37_CRF_ID != Z272TBM37_CRF_ID ) || ( GXutil.strcmp(A372TBM37_CRF_ITEM_GRP_DIV, Z372TBM37_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A273TBM37_CRF_ITEM_GRP_CD, Z273TBM37_CRF_ITEM_GRP_CD) != 0 ) )
      {
         A271TBM37_STUDY_ID = Z271TBM37_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
         A272TBM37_CRF_ID = Z272TBM37_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
         A372TBM37_CRF_ITEM_GRP_DIV = Z372TBM37_CRF_ITEM_GRP_DIV ;
         httpContext.ajax_rsp_assign_attri("", false, "A372TBM37_CRF_ITEM_GRP_DIV", A372TBM37_CRF_ITEM_GRP_DIV);
         A273TBM37_CRF_ITEM_GRP_CD = Z273TBM37_CRF_ITEM_GRP_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A273TBM37_CRF_ITEM_GRP_CD", A273TBM37_CRF_ITEM_GRP_CD);
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound22 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM37_STUDY_ID");
         AnyError = (short)(1) ;
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
      scanStart0N22( ) ;
      if ( RcdFound22 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound22 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound22 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart0N22( ) ;
      if ( RcdFound22 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(0, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM37_CRF_DOM_MAP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z275TBM37_CRT_DATETIME.equals( T000N2_A275TBM37_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z276TBM37_CRT_USER_ID, T000N2_A276TBM37_CRT_USER_ID[0]) != 0 ) || !( Z278TBM37_UPD_DATETIME.equals( T000N2_A278TBM37_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z279TBM37_UPD_USER_ID, T000N2_A279TBM37_UPD_USER_ID[0]) != 0 ) || ( Z281TBM37_UPD_CNT != T000N2_A281TBM37_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z373TBM37_VISIT_NO != T000N2_A373TBM37_VISIT_NO[0] ) || ( GXutil.strcmp(Z374TBM37_DOM_CD, T000N2_A374TBM37_DOM_CD[0]) != 0 ) || ( GXutil.strcmp(Z375TBM37_DOM_VAR_NM, T000N2_A375TBM37_DOM_VAR_NM[0]) != 0 ) || ( GXutil.strcmp(Z376TBM37_DOM_ITM_GRP_OID, T000N2_A376TBM37_DOM_ITM_GRP_OID[0]) != 0 ) || ( Z377TBM37_DOM_ITM_GRP_ATTR_SEQ != T000N2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z612TBM37_DOM_ITM_GRP_ROWNO != T000N2_A612TBM37_DOM_ITM_GRP_ROWNO[0] ) || ( GXutil.strcmp(Z274TBM37_DEL_FLG, T000N2_A274TBM37_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z277TBM37_CRT_PROG_NM, T000N2_A277TBM37_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z280TBM37_UPD_PROG_NM, T000N2_A280TBM37_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(6, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD, new Boolean(n275TBM37_CRT_DATETIME), A275TBM37_CRT_DATETIME, new Boolean(n276TBM37_CRT_USER_ID), A276TBM37_CRT_USER_ID, new Boolean(n278TBM37_UPD_DATETIME), A278TBM37_UPD_DATETIME, new Boolean(n279TBM37_UPD_USER_ID), A279TBM37_UPD_USER_ID, new Boolean(n281TBM37_UPD_CNT), new Long(A281TBM37_UPD_CNT), new Boolean(n373TBM37_VISIT_NO), new Short(A373TBM37_VISIT_NO), new Boolean(n374TBM37_DOM_CD), A374TBM37_DOM_CD, new Boolean(n375TBM37_DOM_VAR_NM), A375TBM37_DOM_VAR_NM, new Boolean(n376TBM37_DOM_ITM_GRP_OID), A376TBM37_DOM_ITM_GRP_OID, new Boolean(n377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Short(A377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n612TBM37_DOM_ITM_GRP_ROWNO), new Short(A612TBM37_DOM_ITM_GRP_ROWNO), new Boolean(n274TBM37_DEL_FLG), A274TBM37_DEL_FLG, new Boolean(n277TBM37_CRT_PROG_NM), A277TBM37_CRT_PROG_NM, new Boolean(n280TBM37_UPD_PROG_NM), A280TBM37_UPD_PROG_NM});
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
                  pr_default.execute(7, new Object[] {new Boolean(n275TBM37_CRT_DATETIME), A275TBM37_CRT_DATETIME, new Boolean(n276TBM37_CRT_USER_ID), A276TBM37_CRT_USER_ID, new Boolean(n278TBM37_UPD_DATETIME), A278TBM37_UPD_DATETIME, new Boolean(n279TBM37_UPD_USER_ID), A279TBM37_UPD_USER_ID, new Boolean(n281TBM37_UPD_CNT), new Long(A281TBM37_UPD_CNT), new Boolean(n373TBM37_VISIT_NO), new Short(A373TBM37_VISIT_NO), new Boolean(n374TBM37_DOM_CD), A374TBM37_DOM_CD, new Boolean(n375TBM37_DOM_VAR_NM), A375TBM37_DOM_VAR_NM, new Boolean(n376TBM37_DOM_ITM_GRP_OID), A376TBM37_DOM_ITM_GRP_OID, new Boolean(n377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Short(A377TBM37_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n612TBM37_DOM_ITM_GRP_ROWNO), new Short(A612TBM37_DOM_ITM_GRP_ROWNO), new Boolean(n274TBM37_DEL_FLG), A274TBM37_DEL_FLG, new Boolean(n277TBM37_CRT_PROG_NM), A277TBM37_CRT_PROG_NM, new Boolean(n280TBM37_UPD_PROG_NM), A280TBM37_UPD_PROG_NM, new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               pr_default.execute(8, new Object[] {new Long(A271TBM37_STUDY_ID), new Short(A272TBM37_CRF_ID), A372TBM37_CRF_ITEM_GRP_DIV, A273TBM37_CRF_ITEM_GRP_CD});
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
      /* Using cursor T000N11 */
      pr_default.execute(9);
      RcdFound22 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A271TBM37_STUDY_ID = T000N11_A271TBM37_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
         A272TBM37_CRF_ID = T000N11_A272TBM37_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
         A372TBM37_CRF_ITEM_GRP_DIV = T000N11_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A372TBM37_CRF_ITEM_GRP_DIV", A372TBM37_CRF_ITEM_GRP_DIV);
         A273TBM37_CRF_ITEM_GRP_CD = T000N11_A273TBM37_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A273TBM37_CRF_ITEM_GRP_CD", A273TBM37_CRF_ITEM_GRP_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0N22( )
   {
      pr_default.readNext(9);
      RcdFound22 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound22 = (short)(1) ;
         A271TBM37_STUDY_ID = T000N11_A271TBM37_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
         A272TBM37_CRF_ID = T000N11_A272TBM37_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
         A372TBM37_CRF_ITEM_GRP_DIV = T000N11_A372TBM37_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A372TBM37_CRF_ITEM_GRP_DIV", A372TBM37_CRF_ITEM_GRP_DIV);
         A273TBM37_CRF_ITEM_GRP_CD = T000N11_A273TBM37_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A273TBM37_CRF_ITEM_GRP_CD", A273TBM37_CRF_ITEM_GRP_CD);
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
      A275TBM37_CRT_DATETIME = GXutil.now( ) ;
      n275TBM37_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A275TBM37_CRT_DATETIME", localUtil.ttoc( A275TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A276TBM37_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm37_crf_dom_map_impl.this.GXt_char3 = GXv_char4[0] ;
      A276TBM37_CRT_USER_ID = GXt_char3 ;
      n276TBM37_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A276TBM37_CRT_USER_ID", A276TBM37_CRT_USER_ID);
      A278TBM37_UPD_DATETIME = GXutil.now( ) ;
      n278TBM37_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A278TBM37_UPD_DATETIME", localUtil.ttoc( A278TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A279TBM37_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm37_crf_dom_map_impl.this.GXt_char3 = GXv_char4[0] ;
      A279TBM37_UPD_USER_ID = GXt_char3 ;
      n279TBM37_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A279TBM37_UPD_USER_ID", A279TBM37_UPD_USER_ID);
      A281TBM37_UPD_CNT = (long)(O281TBM37_UPD_CNT+1) ;
      n281TBM37_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A281TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0N22( )
   {
      /* Before Update Rules */
      A278TBM37_UPD_DATETIME = GXutil.now( ) ;
      n278TBM37_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A278TBM37_UPD_DATETIME", localUtil.ttoc( A278TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A279TBM37_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm37_crf_dom_map_impl.this.GXt_char3 = GXv_char4[0] ;
      A279TBM37_UPD_USER_ID = GXt_char3 ;
      n279TBM37_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A279TBM37_UPD_USER_ID", A279TBM37_UPD_USER_ID);
      A281TBM37_UPD_CNT = (long)(O281TBM37_UPD_CNT+1) ;
      n281TBM37_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A281TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRF-ドメインマッピングマスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm37_crf_dom_map") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0N22( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z271TBM37_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z271TBM37_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z272TBM37_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z272TBM37_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z372TBM37_CRF_ITEM_GRP_DIV", GXutil.rtrim( Z372TBM37_CRF_ITEM_GRP_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z273TBM37_CRF_ITEM_GRP_CD", GXutil.rtrim( Z273TBM37_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z275TBM37_CRT_DATETIME", localUtil.ttoc( Z275TBM37_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z276TBM37_CRT_USER_ID", GXutil.rtrim( Z276TBM37_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z278TBM37_UPD_DATETIME", localUtil.ttoc( Z278TBM37_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z279TBM37_UPD_USER_ID", GXutil.rtrim( Z279TBM37_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z281TBM37_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z281TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z373TBM37_VISIT_NO", GXutil.ltrim( localUtil.ntoc( Z373TBM37_VISIT_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z374TBM37_DOM_CD", GXutil.rtrim( Z374TBM37_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z375TBM37_DOM_VAR_NM", GXutil.rtrim( Z375TBM37_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z376TBM37_DOM_ITM_GRP_OID", GXutil.rtrim( Z376TBM37_DOM_ITM_GRP_OID));
      GxWebStd.gx_hidden_field( httpContext, "Z377TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( localUtil.ntoc( Z377TBM37_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z612TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( localUtil.ntoc( Z612TBM37_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z274TBM37_DEL_FLG", GXutil.rtrim( Z274TBM37_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z277TBM37_CRT_PROG_NM", GXutil.rtrim( Z277TBM37_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z280TBM37_UPD_PROG_NM", GXutil.rtrim( Z280TBM37_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O281TBM37_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O281TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0N22( )
   {
      A275TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n275TBM37_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A275TBM37_CRT_DATETIME", localUtil.ttoc( A275TBM37_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n275TBM37_CRT_DATETIME = (GXutil.nullDate().equals(A275TBM37_CRT_DATETIME) ? true : false) ;
      A276TBM37_CRT_USER_ID = "" ;
      n276TBM37_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A276TBM37_CRT_USER_ID", A276TBM37_CRT_USER_ID);
      n276TBM37_CRT_USER_ID = ((GXutil.strcmp("", A276TBM37_CRT_USER_ID)==0) ? true : false) ;
      A278TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n278TBM37_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A278TBM37_UPD_DATETIME", localUtil.ttoc( A278TBM37_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n278TBM37_UPD_DATETIME = (GXutil.nullDate().equals(A278TBM37_UPD_DATETIME) ? true : false) ;
      A279TBM37_UPD_USER_ID = "" ;
      n279TBM37_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A279TBM37_UPD_USER_ID", A279TBM37_UPD_USER_ID);
      n279TBM37_UPD_USER_ID = ((GXutil.strcmp("", A279TBM37_UPD_USER_ID)==0) ? true : false) ;
      A281TBM37_UPD_CNT = 0 ;
      n281TBM37_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A281TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)));
      n281TBM37_UPD_CNT = ((0==A281TBM37_UPD_CNT) ? true : false) ;
      A373TBM37_VISIT_NO = (short)(0) ;
      n373TBM37_VISIT_NO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A373TBM37_VISIT_NO", GXutil.ltrim( GXutil.str( A373TBM37_VISIT_NO, 3, 0)));
      n373TBM37_VISIT_NO = ((0==A373TBM37_VISIT_NO) ? true : false) ;
      A374TBM37_DOM_CD = "" ;
      n374TBM37_DOM_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A374TBM37_DOM_CD", A374TBM37_DOM_CD);
      n374TBM37_DOM_CD = ((GXutil.strcmp("", A374TBM37_DOM_CD)==0) ? true : false) ;
      A375TBM37_DOM_VAR_NM = "" ;
      n375TBM37_DOM_VAR_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A375TBM37_DOM_VAR_NM", A375TBM37_DOM_VAR_NM);
      n375TBM37_DOM_VAR_NM = ((GXutil.strcmp("", A375TBM37_DOM_VAR_NM)==0) ? true : false) ;
      A376TBM37_DOM_ITM_GRP_OID = "" ;
      n376TBM37_DOM_ITM_GRP_OID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A376TBM37_DOM_ITM_GRP_OID", A376TBM37_DOM_ITM_GRP_OID);
      n376TBM37_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A376TBM37_DOM_ITM_GRP_OID)==0) ? true : false) ;
      A377TBM37_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
      n377TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A377TBM37_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
      n377TBM37_DOM_ITM_GRP_ATTR_SEQ = ((0==A377TBM37_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
      A612TBM37_DOM_ITM_GRP_ROWNO = (short)(0) ;
      n612TBM37_DOM_ITM_GRP_ROWNO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A612TBM37_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A612TBM37_DOM_ITM_GRP_ROWNO, 4, 0)));
      n612TBM37_DOM_ITM_GRP_ROWNO = ((0==A612TBM37_DOM_ITM_GRP_ROWNO) ? true : false) ;
      A274TBM37_DEL_FLG = "" ;
      n274TBM37_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A274TBM37_DEL_FLG", A274TBM37_DEL_FLG);
      n274TBM37_DEL_FLG = ((GXutil.strcmp("", A274TBM37_DEL_FLG)==0) ? true : false) ;
      A277TBM37_CRT_PROG_NM = "" ;
      n277TBM37_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A277TBM37_CRT_PROG_NM", A277TBM37_CRT_PROG_NM);
      n277TBM37_CRT_PROG_NM = ((GXutil.strcmp("", A277TBM37_CRT_PROG_NM)==0) ? true : false) ;
      A280TBM37_UPD_PROG_NM = "" ;
      n280TBM37_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A280TBM37_UPD_PROG_NM", A280TBM37_UPD_PROG_NM);
      n280TBM37_UPD_PROG_NM = ((GXutil.strcmp("", A280TBM37_UPD_PROG_NM)==0) ? true : false) ;
      O281TBM37_UPD_CNT = A281TBM37_UPD_CNT ;
      n281TBM37_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A281TBM37_UPD_CNT", GXutil.ltrim( GXutil.str( A281TBM37_UPD_CNT, 10, 0)));
   }

   public void initAll0N22( )
   {
      A271TBM37_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A271TBM37_STUDY_ID", GXutil.ltrim( GXutil.str( A271TBM37_STUDY_ID, 10, 0)));
      A272TBM37_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A272TBM37_CRF_ID", GXutil.ltrim( GXutil.str( A272TBM37_CRF_ID, 4, 0)));
      A372TBM37_CRF_ITEM_GRP_DIV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A372TBM37_CRF_ITEM_GRP_DIV", A372TBM37_CRF_ITEM_GRP_DIV);
      A273TBM37_CRF_ITEM_GRP_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A273TBM37_CRF_ITEM_GRP_CD", A273TBM37_CRF_ITEM_GRP_CD);
      initializeNonKey0N22( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14551224");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm37_crf_dom_map.js", "?14551224");
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
      GXt_char3 = A276TBM37_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm37_crf_dom_map_impl.this.GXt_char3 = GXv_char4[0] ;
      A276TBM37_CRT_USER_ID = GXt_char3 ;
      n276TBM37_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A276TBM37_CRT_USER_ID", A276TBM37_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A276TBM37_CRT_USER_ID))+"\"");
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
      GXt_char3 = A279TBM37_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm37_crf_dom_map_impl.this.GXt_char3 = GXv_char4[0] ;
      A279TBM37_UPD_USER_ID = GXt_char3 ;
      n279TBM37_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A279TBM37_UPD_USER_ID", A279TBM37_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A279TBM37_UPD_USER_ID))+"\"");
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
                                            short GX_Parm10 ,
                                            String GX_Parm11 ,
                                            String GX_Parm12 ,
                                            String GX_Parm13 ,
                                            short GX_Parm14 ,
                                            short GX_Parm15 ,
                                            String GX_Parm16 ,
                                            String GX_Parm17 ,
                                            String GX_Parm18 )
   {
      A271TBM37_STUDY_ID = GX_Parm1 ;
      A272TBM37_CRF_ID = GX_Parm2 ;
      A372TBM37_CRF_ITEM_GRP_DIV = GX_Parm3 ;
      A273TBM37_CRF_ITEM_GRP_CD = GX_Parm4 ;
      A275TBM37_CRT_DATETIME = GX_Parm5 ;
      n275TBM37_CRT_DATETIME = false ;
      A276TBM37_CRT_USER_ID = GX_Parm6 ;
      n276TBM37_CRT_USER_ID = false ;
      A278TBM37_UPD_DATETIME = GX_Parm7 ;
      n278TBM37_UPD_DATETIME = false ;
      A279TBM37_UPD_USER_ID = GX_Parm8 ;
      n279TBM37_UPD_USER_ID = false ;
      A281TBM37_UPD_CNT = GX_Parm9 ;
      n281TBM37_UPD_CNT = false ;
      A373TBM37_VISIT_NO = GX_Parm10 ;
      n373TBM37_VISIT_NO = false ;
      A374TBM37_DOM_CD = GX_Parm11 ;
      n374TBM37_DOM_CD = false ;
      A375TBM37_DOM_VAR_NM = GX_Parm12 ;
      n375TBM37_DOM_VAR_NM = false ;
      A376TBM37_DOM_ITM_GRP_OID = GX_Parm13 ;
      n376TBM37_DOM_ITM_GRP_OID = false ;
      A377TBM37_DOM_ITM_GRP_ATTR_SEQ = GX_Parm14 ;
      n377TBM37_DOM_ITM_GRP_ATTR_SEQ = false ;
      A612TBM37_DOM_ITM_GRP_ROWNO = GX_Parm15 ;
      n612TBM37_DOM_ITM_GRP_ROWNO = false ;
      A274TBM37_DEL_FLG = GX_Parm16 ;
      n274TBM37_DEL_FLG = false ;
      A277TBM37_CRT_PROG_NM = GX_Parm17 ;
      n277TBM37_CRT_PROG_NM = false ;
      A280TBM37_UPD_PROG_NM = GX_Parm18 ;
      n280TBM37_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A275TBM37_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A276TBM37_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A278TBM37_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A279TBM37_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A281TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A373TBM37_VISIT_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A374TBM37_DOM_CD));
      isValidOutput.add(GXutil.rtrim( A375TBM37_DOM_VAR_NM));
      isValidOutput.add(GXutil.rtrim( A376TBM37_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A377TBM37_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A612TBM37_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A274TBM37_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A277TBM37_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A280TBM37_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z271TBM37_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z272TBM37_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z372TBM37_CRF_ITEM_GRP_DIV));
      isValidOutput.add(GXutil.rtrim( Z273TBM37_CRF_ITEM_GRP_CD));
      isValidOutput.add(localUtil.ttoc( Z275TBM37_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z276TBM37_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z278TBM37_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z279TBM37_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z281TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z373TBM37_VISIT_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z374TBM37_DOM_CD));
      isValidOutput.add(GXutil.rtrim( Z375TBM37_DOM_VAR_NM));
      isValidOutput.add(GXutil.rtrim( Z376TBM37_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z377TBM37_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z612TBM37_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z274TBM37_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z277TBM37_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z280TBM37_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O281TBM37_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      A372TBM37_CRF_ITEM_GRP_DIV = "" ;
      lblTextblocktbm37_crf_item_grp_cd_Jsonclick = "" ;
      A273TBM37_CRF_ITEM_GRP_CD = "" ;
      lblTextblocktbm37_visit_no_Jsonclick = "" ;
      lblTextblocktbm37_dom_cd_Jsonclick = "" ;
      A374TBM37_DOM_CD = "" ;
      lblTextblocktbm37_dom_var_nm_Jsonclick = "" ;
      A375TBM37_DOM_VAR_NM = "" ;
      lblTextblocktbm37_dom_itm_grp_oid_Jsonclick = "" ;
      A376TBM37_DOM_ITM_GRP_OID = "" ;
      lblTextblocktbm37_dom_itm_grp_attr_seq_Jsonclick = "" ;
      lblTextblocktbm37_dom_itm_grp_rowno_Jsonclick = "" ;
      lblTextblocktbm37_del_flg_Jsonclick = "" ;
      A274TBM37_DEL_FLG = "" ;
      lblTextblocktbm37_crt_datetime_Jsonclick = "" ;
      A275TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm37_crt_user_id_Jsonclick = "" ;
      A276TBM37_CRT_USER_ID = "" ;
      lblTextblocktbm37_crt_prog_nm_Jsonclick = "" ;
      A277TBM37_CRT_PROG_NM = "" ;
      lblTextblocktbm37_upd_datetime_Jsonclick = "" ;
      A278TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm37_upd_user_id_Jsonclick = "" ;
      A279TBM37_UPD_USER_ID = "" ;
      lblTextblocktbm37_upd_prog_nm_Jsonclick = "" ;
      A280TBM37_UPD_PROG_NM = "" ;
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
      Z372TBM37_CRF_ITEM_GRP_DIV = "" ;
      Z273TBM37_CRF_ITEM_GRP_CD = "" ;
      Z275TBM37_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z276TBM37_CRT_USER_ID = "" ;
      Z278TBM37_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z279TBM37_UPD_USER_ID = "" ;
      Z374TBM37_DOM_CD = "" ;
      Z375TBM37_DOM_VAR_NM = "" ;
      Z376TBM37_DOM_ITM_GRP_OID = "" ;
      Z274TBM37_DEL_FLG = "" ;
      Z277TBM37_CRT_PROG_NM = "" ;
      Z280TBM37_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000N4_A271TBM37_STUDY_ID = new long[1] ;
      T000N4_A272TBM37_CRF_ID = new short[1] ;
      T000N4_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N4_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N4_A275TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N4_n275TBM37_CRT_DATETIME = new boolean[] {false} ;
      T000N4_A276TBM37_CRT_USER_ID = new String[] {""} ;
      T000N4_n276TBM37_CRT_USER_ID = new boolean[] {false} ;
      T000N4_A278TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N4_n278TBM37_UPD_DATETIME = new boolean[] {false} ;
      T000N4_A279TBM37_UPD_USER_ID = new String[] {""} ;
      T000N4_n279TBM37_UPD_USER_ID = new boolean[] {false} ;
      T000N4_A281TBM37_UPD_CNT = new long[1] ;
      T000N4_n281TBM37_UPD_CNT = new boolean[] {false} ;
      T000N4_A373TBM37_VISIT_NO = new short[1] ;
      T000N4_n373TBM37_VISIT_NO = new boolean[] {false} ;
      T000N4_A374TBM37_DOM_CD = new String[] {""} ;
      T000N4_n374TBM37_DOM_CD = new boolean[] {false} ;
      T000N4_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      T000N4_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      T000N4_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      T000N4_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000N4_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000N4_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000N4_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000N4_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000N4_A274TBM37_DEL_FLG = new String[] {""} ;
      T000N4_n274TBM37_DEL_FLG = new boolean[] {false} ;
      T000N4_A277TBM37_CRT_PROG_NM = new String[] {""} ;
      T000N4_n277TBM37_CRT_PROG_NM = new boolean[] {false} ;
      T000N4_A280TBM37_UPD_PROG_NM = new String[] {""} ;
      T000N4_n280TBM37_UPD_PROG_NM = new boolean[] {false} ;
      T000N5_A271TBM37_STUDY_ID = new long[1] ;
      T000N5_A272TBM37_CRF_ID = new short[1] ;
      T000N5_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N5_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N3_A271TBM37_STUDY_ID = new long[1] ;
      T000N3_A272TBM37_CRF_ID = new short[1] ;
      T000N3_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N3_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N3_A275TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N3_n275TBM37_CRT_DATETIME = new boolean[] {false} ;
      T000N3_A276TBM37_CRT_USER_ID = new String[] {""} ;
      T000N3_n276TBM37_CRT_USER_ID = new boolean[] {false} ;
      T000N3_A278TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N3_n278TBM37_UPD_DATETIME = new boolean[] {false} ;
      T000N3_A279TBM37_UPD_USER_ID = new String[] {""} ;
      T000N3_n279TBM37_UPD_USER_ID = new boolean[] {false} ;
      T000N3_A281TBM37_UPD_CNT = new long[1] ;
      T000N3_n281TBM37_UPD_CNT = new boolean[] {false} ;
      T000N3_A373TBM37_VISIT_NO = new short[1] ;
      T000N3_n373TBM37_VISIT_NO = new boolean[] {false} ;
      T000N3_A374TBM37_DOM_CD = new String[] {""} ;
      T000N3_n374TBM37_DOM_CD = new boolean[] {false} ;
      T000N3_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      T000N3_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      T000N3_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      T000N3_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000N3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000N3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000N3_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000N3_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000N3_A274TBM37_DEL_FLG = new String[] {""} ;
      T000N3_n274TBM37_DEL_FLG = new boolean[] {false} ;
      T000N3_A277TBM37_CRT_PROG_NM = new String[] {""} ;
      T000N3_n277TBM37_CRT_PROG_NM = new boolean[] {false} ;
      T000N3_A280TBM37_UPD_PROG_NM = new String[] {""} ;
      T000N3_n280TBM37_UPD_PROG_NM = new boolean[] {false} ;
      sMode22 = "" ;
      T000N6_A271TBM37_STUDY_ID = new long[1] ;
      T000N6_A272TBM37_CRF_ID = new short[1] ;
      T000N6_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N6_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N7_A271TBM37_STUDY_ID = new long[1] ;
      T000N7_A272TBM37_CRF_ID = new short[1] ;
      T000N7_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N7_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N2_A271TBM37_STUDY_ID = new long[1] ;
      T000N2_A272TBM37_CRF_ID = new short[1] ;
      T000N2_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N2_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000N2_A275TBM37_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N2_n275TBM37_CRT_DATETIME = new boolean[] {false} ;
      T000N2_A276TBM37_CRT_USER_ID = new String[] {""} ;
      T000N2_n276TBM37_CRT_USER_ID = new boolean[] {false} ;
      T000N2_A278TBM37_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000N2_n278TBM37_UPD_DATETIME = new boolean[] {false} ;
      T000N2_A279TBM37_UPD_USER_ID = new String[] {""} ;
      T000N2_n279TBM37_UPD_USER_ID = new boolean[] {false} ;
      T000N2_A281TBM37_UPD_CNT = new long[1] ;
      T000N2_n281TBM37_UPD_CNT = new boolean[] {false} ;
      T000N2_A373TBM37_VISIT_NO = new short[1] ;
      T000N2_n373TBM37_VISIT_NO = new boolean[] {false} ;
      T000N2_A374TBM37_DOM_CD = new String[] {""} ;
      T000N2_n374TBM37_DOM_CD = new boolean[] {false} ;
      T000N2_A375TBM37_DOM_VAR_NM = new String[] {""} ;
      T000N2_n375TBM37_DOM_VAR_NM = new boolean[] {false} ;
      T000N2_A376TBM37_DOM_ITM_GRP_OID = new String[] {""} ;
      T000N2_n376TBM37_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T000N2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T000N2_n377TBM37_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T000N2_A612TBM37_DOM_ITM_GRP_ROWNO = new short[1] ;
      T000N2_n612TBM37_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T000N2_A274TBM37_DEL_FLG = new String[] {""} ;
      T000N2_n274TBM37_DEL_FLG = new boolean[] {false} ;
      T000N2_A277TBM37_CRT_PROG_NM = new String[] {""} ;
      T000N2_n277TBM37_CRT_PROG_NM = new boolean[] {false} ;
      T000N2_A280TBM37_UPD_PROG_NM = new String[] {""} ;
      T000N2_n280TBM37_UPD_PROG_NM = new boolean[] {false} ;
      T000N11_A271TBM37_STUDY_ID = new long[1] ;
      T000N11_A272TBM37_CRF_ID = new short[1] ;
      T000N11_A372TBM37_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000N11_A273TBM37_CRF_ITEM_GRP_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm37_crf_dom_map__default(),
         new Object[] {
             new Object[] {
            T000N2_A271TBM37_STUDY_ID, T000N2_A272TBM37_CRF_ID, T000N2_A372TBM37_CRF_ITEM_GRP_DIV, T000N2_A273TBM37_CRF_ITEM_GRP_CD, T000N2_A275TBM37_CRT_DATETIME, T000N2_n275TBM37_CRT_DATETIME, T000N2_A276TBM37_CRT_USER_ID, T000N2_n276TBM37_CRT_USER_ID, T000N2_A278TBM37_UPD_DATETIME, T000N2_n278TBM37_UPD_DATETIME,
            T000N2_A279TBM37_UPD_USER_ID, T000N2_n279TBM37_UPD_USER_ID, T000N2_A281TBM37_UPD_CNT, T000N2_n281TBM37_UPD_CNT, T000N2_A373TBM37_VISIT_NO, T000N2_n373TBM37_VISIT_NO, T000N2_A374TBM37_DOM_CD, T000N2_n374TBM37_DOM_CD, T000N2_A375TBM37_DOM_VAR_NM, T000N2_n375TBM37_DOM_VAR_NM,
            T000N2_A376TBM37_DOM_ITM_GRP_OID, T000N2_n376TBM37_DOM_ITM_GRP_OID, T000N2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N2_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N2_A612TBM37_DOM_ITM_GRP_ROWNO, T000N2_n612TBM37_DOM_ITM_GRP_ROWNO, T000N2_A274TBM37_DEL_FLG, T000N2_n274TBM37_DEL_FLG, T000N2_A277TBM37_CRT_PROG_NM, T000N2_n277TBM37_CRT_PROG_NM,
            T000N2_A280TBM37_UPD_PROG_NM, T000N2_n280TBM37_UPD_PROG_NM
            }
            , new Object[] {
            T000N3_A271TBM37_STUDY_ID, T000N3_A272TBM37_CRF_ID, T000N3_A372TBM37_CRF_ITEM_GRP_DIV, T000N3_A273TBM37_CRF_ITEM_GRP_CD, T000N3_A275TBM37_CRT_DATETIME, T000N3_n275TBM37_CRT_DATETIME, T000N3_A276TBM37_CRT_USER_ID, T000N3_n276TBM37_CRT_USER_ID, T000N3_A278TBM37_UPD_DATETIME, T000N3_n278TBM37_UPD_DATETIME,
            T000N3_A279TBM37_UPD_USER_ID, T000N3_n279TBM37_UPD_USER_ID, T000N3_A281TBM37_UPD_CNT, T000N3_n281TBM37_UPD_CNT, T000N3_A373TBM37_VISIT_NO, T000N3_n373TBM37_VISIT_NO, T000N3_A374TBM37_DOM_CD, T000N3_n374TBM37_DOM_CD, T000N3_A375TBM37_DOM_VAR_NM, T000N3_n375TBM37_DOM_VAR_NM,
            T000N3_A376TBM37_DOM_ITM_GRP_OID, T000N3_n376TBM37_DOM_ITM_GRP_OID, T000N3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N3_A612TBM37_DOM_ITM_GRP_ROWNO, T000N3_n612TBM37_DOM_ITM_GRP_ROWNO, T000N3_A274TBM37_DEL_FLG, T000N3_n274TBM37_DEL_FLG, T000N3_A277TBM37_CRT_PROG_NM, T000N3_n277TBM37_CRT_PROG_NM,
            T000N3_A280TBM37_UPD_PROG_NM, T000N3_n280TBM37_UPD_PROG_NM
            }
            , new Object[] {
            T000N4_A271TBM37_STUDY_ID, T000N4_A272TBM37_CRF_ID, T000N4_A372TBM37_CRF_ITEM_GRP_DIV, T000N4_A273TBM37_CRF_ITEM_GRP_CD, T000N4_A275TBM37_CRT_DATETIME, T000N4_n275TBM37_CRT_DATETIME, T000N4_A276TBM37_CRT_USER_ID, T000N4_n276TBM37_CRT_USER_ID, T000N4_A278TBM37_UPD_DATETIME, T000N4_n278TBM37_UPD_DATETIME,
            T000N4_A279TBM37_UPD_USER_ID, T000N4_n279TBM37_UPD_USER_ID, T000N4_A281TBM37_UPD_CNT, T000N4_n281TBM37_UPD_CNT, T000N4_A373TBM37_VISIT_NO, T000N4_n373TBM37_VISIT_NO, T000N4_A374TBM37_DOM_CD, T000N4_n374TBM37_DOM_CD, T000N4_A375TBM37_DOM_VAR_NM, T000N4_n375TBM37_DOM_VAR_NM,
            T000N4_A376TBM37_DOM_ITM_GRP_OID, T000N4_n376TBM37_DOM_ITM_GRP_OID, T000N4_A377TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N4_n377TBM37_DOM_ITM_GRP_ATTR_SEQ, T000N4_A612TBM37_DOM_ITM_GRP_ROWNO, T000N4_n612TBM37_DOM_ITM_GRP_ROWNO, T000N4_A274TBM37_DEL_FLG, T000N4_n274TBM37_DEL_FLG, T000N4_A277TBM37_CRT_PROG_NM, T000N4_n277TBM37_CRT_PROG_NM,
            T000N4_A280TBM37_UPD_PROG_NM, T000N4_n280TBM37_UPD_PROG_NM
            }
            , new Object[] {
            T000N5_A271TBM37_STUDY_ID, T000N5_A272TBM37_CRF_ID, T000N5_A372TBM37_CRF_ITEM_GRP_DIV, T000N5_A273TBM37_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T000N6_A271TBM37_STUDY_ID, T000N6_A272TBM37_CRF_ID, T000N6_A372TBM37_CRF_ITEM_GRP_DIV, T000N6_A273TBM37_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T000N7_A271TBM37_STUDY_ID, T000N7_A272TBM37_CRF_ID, T000N7_A372TBM37_CRF_ITEM_GRP_DIV, T000N7_A273TBM37_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000N11_A271TBM37_STUDY_ID, T000N11_A272TBM37_CRF_ID, T000N11_A372TBM37_CRF_ITEM_GRP_DIV, T000N11_A273TBM37_CRF_ITEM_GRP_CD
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
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A272TBM37_CRF_ID ;
   private short A373TBM37_VISIT_NO ;
   private short A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short A612TBM37_DOM_ITM_GRP_ROWNO ;
   private short Z272TBM37_CRF_ID ;
   private short Z373TBM37_VISIT_NO ;
   private short Z377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short Z612TBM37_DOM_ITM_GRP_ROWNO ;
   private short RcdFound22 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM37_STUDY_ID_Enabled ;
   private int edtTBM37_CRF_ID_Enabled ;
   private int edtTBM37_CRF_ITEM_GRP_DIV_Enabled ;
   private int edtTBM37_CRF_ITEM_GRP_CD_Enabled ;
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
   private long A271TBM37_STUDY_ID ;
   private long A281TBM37_UPD_CNT ;
   private long Z271TBM37_STUDY_ID ;
   private long Z281TBM37_UPD_CNT ;
   private long O281TBM37_UPD_CNT ;
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
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A275TBM37_CRT_DATETIME ;
   private java.util.Date A278TBM37_UPD_DATETIME ;
   private java.util.Date Z275TBM37_CRT_DATETIME ;
   private java.util.Date Z278TBM37_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n373TBM37_VISIT_NO ;
   private boolean n374TBM37_DOM_CD ;
   private boolean n375TBM37_DOM_VAR_NM ;
   private boolean n376TBM37_DOM_ITM_GRP_OID ;
   private boolean n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean n274TBM37_DEL_FLG ;
   private boolean n275TBM37_CRT_DATETIME ;
   private boolean n276TBM37_CRT_USER_ID ;
   private boolean n277TBM37_CRT_PROG_NM ;
   private boolean n278TBM37_UPD_DATETIME ;
   private boolean n279TBM37_UPD_USER_ID ;
   private boolean n280TBM37_UPD_PROG_NM ;
   private boolean n281TBM37_UPD_CNT ;
   private boolean Gx_longc ;
   private String A372TBM37_CRF_ITEM_GRP_DIV ;
   private String A273TBM37_CRF_ITEM_GRP_CD ;
   private String A374TBM37_DOM_CD ;
   private String A375TBM37_DOM_VAR_NM ;
   private String A376TBM37_DOM_ITM_GRP_OID ;
   private String A274TBM37_DEL_FLG ;
   private String A276TBM37_CRT_USER_ID ;
   private String A277TBM37_CRT_PROG_NM ;
   private String A279TBM37_UPD_USER_ID ;
   private String A280TBM37_UPD_PROG_NM ;
   private String Z372TBM37_CRF_ITEM_GRP_DIV ;
   private String Z273TBM37_CRF_ITEM_GRP_CD ;
   private String Z276TBM37_CRT_USER_ID ;
   private String Z279TBM37_UPD_USER_ID ;
   private String Z374TBM37_DOM_CD ;
   private String Z375TBM37_DOM_VAR_NM ;
   private String Z376TBM37_DOM_ITM_GRP_OID ;
   private String Z274TBM37_DEL_FLG ;
   private String Z277TBM37_CRT_PROG_NM ;
   private String Z280TBM37_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000N4_A271TBM37_STUDY_ID ;
   private short[] T000N4_A272TBM37_CRF_ID ;
   private String[] T000N4_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N4_A273TBM37_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000N4_A275TBM37_CRT_DATETIME ;
   private boolean[] T000N4_n275TBM37_CRT_DATETIME ;
   private String[] T000N4_A276TBM37_CRT_USER_ID ;
   private boolean[] T000N4_n276TBM37_CRT_USER_ID ;
   private java.util.Date[] T000N4_A278TBM37_UPD_DATETIME ;
   private boolean[] T000N4_n278TBM37_UPD_DATETIME ;
   private String[] T000N4_A279TBM37_UPD_USER_ID ;
   private boolean[] T000N4_n279TBM37_UPD_USER_ID ;
   private long[] T000N4_A281TBM37_UPD_CNT ;
   private boolean[] T000N4_n281TBM37_UPD_CNT ;
   private short[] T000N4_A373TBM37_VISIT_NO ;
   private boolean[] T000N4_n373TBM37_VISIT_NO ;
   private String[] T000N4_A374TBM37_DOM_CD ;
   private boolean[] T000N4_n374TBM37_DOM_CD ;
   private String[] T000N4_A375TBM37_DOM_VAR_NM ;
   private boolean[] T000N4_n375TBM37_DOM_VAR_NM ;
   private String[] T000N4_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] T000N4_n376TBM37_DOM_ITM_GRP_OID ;
   private short[] T000N4_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000N4_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000N4_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000N4_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] T000N4_A274TBM37_DEL_FLG ;
   private boolean[] T000N4_n274TBM37_DEL_FLG ;
   private String[] T000N4_A277TBM37_CRT_PROG_NM ;
   private boolean[] T000N4_n277TBM37_CRT_PROG_NM ;
   private String[] T000N4_A280TBM37_UPD_PROG_NM ;
   private boolean[] T000N4_n280TBM37_UPD_PROG_NM ;
   private long[] T000N5_A271TBM37_STUDY_ID ;
   private short[] T000N5_A272TBM37_CRF_ID ;
   private String[] T000N5_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N5_A273TBM37_CRF_ITEM_GRP_CD ;
   private long[] T000N3_A271TBM37_STUDY_ID ;
   private short[] T000N3_A272TBM37_CRF_ID ;
   private String[] T000N3_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N3_A273TBM37_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000N3_A275TBM37_CRT_DATETIME ;
   private boolean[] T000N3_n275TBM37_CRT_DATETIME ;
   private String[] T000N3_A276TBM37_CRT_USER_ID ;
   private boolean[] T000N3_n276TBM37_CRT_USER_ID ;
   private java.util.Date[] T000N3_A278TBM37_UPD_DATETIME ;
   private boolean[] T000N3_n278TBM37_UPD_DATETIME ;
   private String[] T000N3_A279TBM37_UPD_USER_ID ;
   private boolean[] T000N3_n279TBM37_UPD_USER_ID ;
   private long[] T000N3_A281TBM37_UPD_CNT ;
   private boolean[] T000N3_n281TBM37_UPD_CNT ;
   private short[] T000N3_A373TBM37_VISIT_NO ;
   private boolean[] T000N3_n373TBM37_VISIT_NO ;
   private String[] T000N3_A374TBM37_DOM_CD ;
   private boolean[] T000N3_n374TBM37_DOM_CD ;
   private String[] T000N3_A375TBM37_DOM_VAR_NM ;
   private boolean[] T000N3_n375TBM37_DOM_VAR_NM ;
   private String[] T000N3_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] T000N3_n376TBM37_DOM_ITM_GRP_OID ;
   private short[] T000N3_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000N3_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000N3_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000N3_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] T000N3_A274TBM37_DEL_FLG ;
   private boolean[] T000N3_n274TBM37_DEL_FLG ;
   private String[] T000N3_A277TBM37_CRT_PROG_NM ;
   private boolean[] T000N3_n277TBM37_CRT_PROG_NM ;
   private String[] T000N3_A280TBM37_UPD_PROG_NM ;
   private boolean[] T000N3_n280TBM37_UPD_PROG_NM ;
   private long[] T000N6_A271TBM37_STUDY_ID ;
   private short[] T000N6_A272TBM37_CRF_ID ;
   private String[] T000N6_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N6_A273TBM37_CRF_ITEM_GRP_CD ;
   private long[] T000N7_A271TBM37_STUDY_ID ;
   private short[] T000N7_A272TBM37_CRF_ID ;
   private String[] T000N7_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N7_A273TBM37_CRF_ITEM_GRP_CD ;
   private long[] T000N2_A271TBM37_STUDY_ID ;
   private short[] T000N2_A272TBM37_CRF_ID ;
   private String[] T000N2_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N2_A273TBM37_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000N2_A275TBM37_CRT_DATETIME ;
   private boolean[] T000N2_n275TBM37_CRT_DATETIME ;
   private String[] T000N2_A276TBM37_CRT_USER_ID ;
   private boolean[] T000N2_n276TBM37_CRT_USER_ID ;
   private java.util.Date[] T000N2_A278TBM37_UPD_DATETIME ;
   private boolean[] T000N2_n278TBM37_UPD_DATETIME ;
   private String[] T000N2_A279TBM37_UPD_USER_ID ;
   private boolean[] T000N2_n279TBM37_UPD_USER_ID ;
   private long[] T000N2_A281TBM37_UPD_CNT ;
   private boolean[] T000N2_n281TBM37_UPD_CNT ;
   private short[] T000N2_A373TBM37_VISIT_NO ;
   private boolean[] T000N2_n373TBM37_VISIT_NO ;
   private String[] T000N2_A374TBM37_DOM_CD ;
   private boolean[] T000N2_n374TBM37_DOM_CD ;
   private String[] T000N2_A375TBM37_DOM_VAR_NM ;
   private boolean[] T000N2_n375TBM37_DOM_VAR_NM ;
   private String[] T000N2_A376TBM37_DOM_ITM_GRP_OID ;
   private boolean[] T000N2_n376TBM37_DOM_ITM_GRP_OID ;
   private short[] T000N2_A377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T000N2_n377TBM37_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T000N2_A612TBM37_DOM_ITM_GRP_ROWNO ;
   private boolean[] T000N2_n612TBM37_DOM_ITM_GRP_ROWNO ;
   private String[] T000N2_A274TBM37_DEL_FLG ;
   private boolean[] T000N2_n274TBM37_DEL_FLG ;
   private String[] T000N2_A277TBM37_CRT_PROG_NM ;
   private boolean[] T000N2_n277TBM37_CRT_PROG_NM ;
   private String[] T000N2_A280TBM37_UPD_PROG_NM ;
   private boolean[] T000N2_n280TBM37_UPD_PROG_NM ;
   private long[] T000N11_A271TBM37_STUDY_ID ;
   private short[] T000N11_A272TBM37_CRF_ID ;
   private String[] T000N11_A372TBM37_CRF_ITEM_GRP_DIV ;
   private String[] T000N11_A273TBM37_CRF_ITEM_GRP_CD ;
}

final  class tbm37_crf_dom_map__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000N2", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_CNT`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N3", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_CNT`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N4", "SELECT TM1.`TBM37_STUDY_ID`, TM1.`TBM37_CRF_ID`, TM1.`TBM37_CRF_ITEM_GRP_DIV`, TM1.`TBM37_CRF_ITEM_GRP_CD`, TM1.`TBM37_CRT_DATETIME`, TM1.`TBM37_CRT_USER_ID`, TM1.`TBM37_UPD_DATETIME`, TM1.`TBM37_UPD_USER_ID`, TM1.`TBM37_UPD_CNT`, TM1.`TBM37_VISIT_NO`, TM1.`TBM37_DOM_CD`, TM1.`TBM37_DOM_VAR_NM`, TM1.`TBM37_DOM_ITM_GRP_OID`, TM1.`TBM37_DOM_ITM_GRP_ATTR_SEQ`, TM1.`TBM37_DOM_ITM_GRP_ROWNO`, TM1.`TBM37_DEL_FLG`, TM1.`TBM37_CRT_PROG_NM`, TM1.`TBM37_UPD_PROG_NM` FROM `TBM37_CRF_DOM_MAP` TM1 WHERE TM1.`TBM37_STUDY_ID` = ? and TM1.`TBM37_CRF_ID` = ? and TM1.`TBM37_CRF_ITEM_GRP_DIV` = ? and TM1.`TBM37_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBM37_STUDY_ID`, TM1.`TBM37_CRF_ID`, TM1.`TBM37_CRF_ITEM_GRP_DIV`, TM1.`TBM37_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000N5", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000N6", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` WHERE ( `TBM37_STUDY_ID` > ? or `TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` > ? or `TBM37_CRF_ID` = ? and `TBM37_STUDY_ID` = ? and `TBM37_CRF_ITEM_GRP_DIV` > ? or `TBM37_CRF_ITEM_GRP_DIV` = ? and `TBM37_CRF_ID` = ? and `TBM37_STUDY_ID` = ? and `TBM37_CRF_ITEM_GRP_CD` > ?) ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000N7", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` WHERE ( `TBM37_STUDY_ID` < ? or `TBM37_STUDY_ID` = ? and `TBM37_CRF_ID` < ? or `TBM37_CRF_ID` = ? and `TBM37_STUDY_ID` = ? and `TBM37_CRF_ITEM_GRP_DIV` < ? or `TBM37_CRF_ITEM_GRP_DIV` = ? and `TBM37_CRF_ID` = ? and `TBM37_STUDY_ID` = ? and `TBM37_CRF_ITEM_GRP_CD` < ?) ORDER BY `TBM37_STUDY_ID` DESC, `TBM37_CRF_ID` DESC, `TBM37_CRF_ITEM_GRP_DIV` DESC, `TBM37_CRF_ITEM_GRP_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000N8", "INSERT INTO `TBM37_CRF_DOM_MAP` (`TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD`, `TBM37_CRT_DATETIME`, `TBM37_CRT_USER_ID`, `TBM37_UPD_DATETIME`, `TBM37_UPD_USER_ID`, `TBM37_UPD_CNT`, `TBM37_VISIT_NO`, `TBM37_DOM_CD`, `TBM37_DOM_VAR_NM`, `TBM37_DOM_ITM_GRP_OID`, `TBM37_DOM_ITM_GRP_ATTR_SEQ`, `TBM37_DOM_ITM_GRP_ROWNO`, `TBM37_DEL_FLG`, `TBM37_CRT_PROG_NM`, `TBM37_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000N9", "UPDATE `TBM37_CRF_DOM_MAP` SET `TBM37_CRT_DATETIME`=?, `TBM37_CRT_USER_ID`=?, `TBM37_UPD_DATETIME`=?, `TBM37_UPD_USER_ID`=?, `TBM37_UPD_CNT`=?, `TBM37_VISIT_NO`=?, `TBM37_DOM_CD`=?, `TBM37_DOM_VAR_NM`=?, `TBM37_DOM_ITM_GRP_OID`=?, `TBM37_DOM_ITM_GRP_ATTR_SEQ`=?, `TBM37_DOM_ITM_GRP_ROWNO`=?, `TBM37_DEL_FLG`=?, `TBM37_CRT_PROG_NM`=?, `TBM37_UPD_PROG_NM`=?  WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000N10", "DELETE FROM `TBM37_CRF_DOM_MAP`  WHERE `TBM37_STUDY_ID` = ? AND `TBM37_CRF_ID` = ? AND `TBM37_CRF_ITEM_GRP_DIV` = ? AND `TBM37_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000N11", "SELECT `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` FROM `TBM37_CRF_DOM_MAP` ORDER BY `TBM37_STUDY_ID`, `TBM37_CRF_ID`, `TBM37_CRF_ITEM_GRP_DIV`, `TBM37_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((short[]) buf[14])[0] = rslt.getShort(10) ;
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
               break;
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
               ((short[]) buf[14])[0] = rslt.getShort(10) ;
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
               break;
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
               ((short[]) buf[14])[0] = rslt.getShort(10) ;
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
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
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
               break;
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
               break;
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
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
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
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
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
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
      }
   }

}

