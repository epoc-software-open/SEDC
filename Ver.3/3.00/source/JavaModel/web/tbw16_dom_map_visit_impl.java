/*
               File: tbw16_dom_map_visit_impl
        Description: CRFドメインマッピングVISIT番号参照ワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:21.93
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw16_dom_map_visit_impl extends GXWebPanel
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
         Form.getMeta().addItem("description", "CRFドメインマッピングVISIT番号参照ワーク", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW16_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbw16_dom_map_visit_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw16_dom_map_visit_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw16_dom_map_visit_impl.class ));
   }

   public tbw16_dom_map_visit_impl( int remoteHandle ,
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
         wb_table1_2_1M64( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1M64e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1M64( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1M64( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1M64( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1M64e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRFドメインマッピングVISIT番号参照ワーク", 1, 0, "px", 0, "px", "Group", "", "HLP_TBW16_DOM_MAP_VISIT.htm");
         wb_table3_28_1M64( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1M64e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1M64e( true) ;
      }
      else
      {
         wb_table1_2_1M64e( false) ;
      }
   }

   public void wb_table3_28_1M64( boolean wbgen )
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
         wb_table4_34_1M64( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1M64e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW16_DOM_MAP_VISIT.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW16_DOM_MAP_VISIT.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1M64e( true) ;
      }
      else
      {
         wb_table3_28_1M64e( false) ;
      }
   }

   public void wb_table4_34_1M64( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_session_id_Internalname, "ID", "", "", lblTextblocktbw16_session_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_SESSION_ID_Internalname, GXutil.rtrim( A963TBW16_SESSION_ID), GXutil.rtrim( localUtil.format( A963TBW16_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_SESSION_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_SESSION_ID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SESSION_ID", "left", "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_datetime_Internalname, "実行日時", "", "", lblTextblocktbw16_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBW16_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_DATETIME_Internalname, localUtil.format(A964TBW16_DATETIME, "99/99/99 99:99"), localUtil.format( A964TBW16_DATETIME, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'YMD',5,24,'jap',false,0);"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_DATETIME_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW16_DOM_MAP_VISIT.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW16_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBW16_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_study_id_Internalname, "ID", "", "", lblTextblocktbw16_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A965TBW16_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW16_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A965TBW16_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A965TBW16_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_crf_id_Internalname, "CRFID", "", "", lblTextblocktbw16_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A966TBW16_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW16_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A966TBW16_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A966TBW16_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_crf_eda_no_Internalname, "CRF枝番", "", "", lblTextblocktbw16_crf_eda_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_CRF_EDA_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A967TBW16_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")), ((edtTBW16_CRF_EDA_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A967TBW16_CRF_EDA_NO), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A967TBW16_CRF_EDA_NO), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_CRF_EDA_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_CRF_EDA_NO_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_EDA_NO", "right", "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_crf_item_grp_cd_Internalname, "CRF項目グループコード", "", "", lblTextblocktbw16_crf_item_grp_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_CRF_ITEM_GRP_CD_Internalname, GXutil.rtrim( A969TBW16_CRF_ITEM_GRP_CD), GXutil.rtrim( localUtil.format( A969TBW16_CRF_ITEM_GRP_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_CRF_ITEM_GRP_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_CRF_ITEM_GRP_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_CD", "left", "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_visit_no_Internalname, "VISIT番号", "", "", lblTextblocktbw16_visit_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_VISIT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A968TBW16_VISIT_NO, (byte)(6), (byte)(0), ".", "")), ((edtTBW16_VISIT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A968TBW16_VISIT_NO), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A968TBW16_VISIT_NO), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_VISIT_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_VISIT_NO_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_VISIT_NO", "right", "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbw16_dom_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_DOM_CD_Internalname, GXutil.rtrim( A970TBW16_DOM_CD), GXutil.rtrim( localUtil.format( A970TBW16_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_DOM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_DOM_CD_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_CD", "left", "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_dom_var_nm_Internalname, "ドメイン変数名", "", "", lblTextblocktbw16_dom_var_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_DOM_VAR_NM_Internalname, GXutil.rtrim( A971TBW16_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A971TBW16_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_DOM_VAR_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_DOM_VAR_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_VAR_NM", "left", "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_dom_itm_grp_oid_Internalname, "CRF項目・項目グループコード", "", "", lblTextblocktbw16_dom_itm_grp_oid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_DOM_ITM_GRP_OID_Internalname, GXutil.rtrim( A972TBW16_DOM_ITM_GRP_OID), GXutil.rtrim( localUtil.format( A972TBW16_DOM_ITM_GRP_OID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_DOM_ITM_GRP_OID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_DOM_ITM_GRP_OID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_dom_itm_grp_attr_seq_Internalname, "ドメイン内項目グループ内連番", "", "", lblTextblocktbw16_dom_itm_grp_attr_seq_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Internalname, GXutil.ltrim( localUtil.ntoc( A973TBW16_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")), ((edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A973TBW16_DOM_ITM_GRP_ATTR_SEQ), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A973TBW16_DOM_ITM_GRP_ATTR_SEQ), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw16_dom_itm_grp_rowno_Internalname, "項目グループ行番号", "", "", lblTextblocktbw16_dom_itm_grp_rowno_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW16_DOM_ITM_GRP_ROWNO_Internalname, GXutil.ltrim( localUtil.ntoc( A974TBW16_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")), ((edtTBW16_DOM_ITM_GRP_ROWNO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A974TBW16_DOM_ITM_GRP_ROWNO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A974TBW16_DOM_ITM_GRP_ROWNO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW16_DOM_ITM_GRP_ROWNO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW16_DOM_ITM_GRP_ROWNO_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW16_DOM_MAP_VISIT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1M64e( true) ;
      }
      else
      {
         wb_table4_34_1M64e( false) ;
      }
   }

   public void wb_table2_5_1M64( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW16_DOM_MAP_VISIT.htm");
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
         wb_table2_5_1M64e( true) ;
      }
      else
      {
         wb_table2_5_1M64e( false) ;
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A963TBW16_SESSION_ID = httpContext.cgiGet( edtTBW16_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A963TBW16_SESSION_ID", A963TBW16_SESSION_ID);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW16_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBW16_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW16_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A964TBW16_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A964TBW16_DATETIME", localUtil.ttoc( A964TBW16_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            else
            {
               A964TBW16_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW16_DATETIME_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A964TBW16_DATETIME", localUtil.ttoc( A964TBW16_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW16_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW16_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A965TBW16_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A965TBW16_STUDY_ID", GXutil.ltrim( GXutil.str( A965TBW16_STUDY_ID, 10, 0)));
            }
            else
            {
               A965TBW16_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW16_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A965TBW16_STUDY_ID", GXutil.ltrim( GXutil.str( A965TBW16_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW16_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW16_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A966TBW16_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A966TBW16_CRF_ID", GXutil.ltrim( GXutil.str( A966TBW16_CRF_ID, 4, 0)));
            }
            else
            {
               A966TBW16_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW16_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A966TBW16_CRF_ID", GXutil.ltrim( GXutil.str( A966TBW16_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_CRF_EDA_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_CRF_EDA_NO_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW16_CRF_EDA_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW16_CRF_EDA_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A967TBW16_CRF_EDA_NO = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A967TBW16_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A967TBW16_CRF_EDA_NO, 2, 0)));
            }
            else
            {
               A967TBW16_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBW16_CRF_EDA_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A967TBW16_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A967TBW16_CRF_EDA_NO, 2, 0)));
            }
            A969TBW16_CRF_ITEM_GRP_CD = httpContext.cgiGet( edtTBW16_CRF_ITEM_GRP_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A969TBW16_CRF_ITEM_GRP_CD", A969TBW16_CRF_ITEM_GRP_CD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_VISIT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_VISIT_NO_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW16_VISIT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW16_VISIT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A968TBW16_VISIT_NO = 0 ;
               n968TBW16_VISIT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A968TBW16_VISIT_NO", GXutil.ltrim( GXutil.str( A968TBW16_VISIT_NO, 6, 0)));
            }
            else
            {
               A968TBW16_VISIT_NO = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW16_VISIT_NO_Internalname), ".", ",")) ;
               n968TBW16_VISIT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A968TBW16_VISIT_NO", GXutil.ltrim( GXutil.str( A968TBW16_VISIT_NO, 6, 0)));
            }
            n968TBW16_VISIT_NO = ((0==A968TBW16_VISIT_NO) ? true : false) ;
            A970TBW16_DOM_CD = httpContext.cgiGet( edtTBW16_DOM_CD_Internalname) ;
            n970TBW16_DOM_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A970TBW16_DOM_CD", A970TBW16_DOM_CD);
            n970TBW16_DOM_CD = ((GXutil.strcmp("", A970TBW16_DOM_CD)==0) ? true : false) ;
            A971TBW16_DOM_VAR_NM = httpContext.cgiGet( edtTBW16_DOM_VAR_NM_Internalname) ;
            n971TBW16_DOM_VAR_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A971TBW16_DOM_VAR_NM", A971TBW16_DOM_VAR_NM);
            n971TBW16_DOM_VAR_NM = ((GXutil.strcmp("", A971TBW16_DOM_VAR_NM)==0) ? true : false) ;
            A972TBW16_DOM_ITM_GRP_OID = httpContext.cgiGet( edtTBW16_DOM_ITM_GRP_OID_Internalname) ;
            n972TBW16_DOM_ITM_GRP_OID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A972TBW16_DOM_ITM_GRP_OID", A972TBW16_DOM_ITM_GRP_OID);
            n972TBW16_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A972TBW16_DOM_ITM_GRP_OID)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW16_DOM_ITM_GRP_ATTR_SEQ");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A973TBW16_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
               n973TBW16_DOM_ITM_GRP_ATTR_SEQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A973TBW16_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A973TBW16_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
            }
            else
            {
               A973TBW16_DOM_ITM_GRP_ATTR_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Internalname), ".", ",")) ;
               n973TBW16_DOM_ITM_GRP_ATTR_SEQ = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A973TBW16_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A973TBW16_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
            }
            n973TBW16_DOM_ITM_GRP_ATTR_SEQ = ((0==A973TBW16_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW16_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW16_DOM_ITM_GRP_ROWNO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW16_DOM_ITM_GRP_ROWNO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A974TBW16_DOM_ITM_GRP_ROWNO = (short)(0) ;
               n974TBW16_DOM_ITM_GRP_ROWNO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A974TBW16_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A974TBW16_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            else
            {
               A974TBW16_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW16_DOM_ITM_GRP_ROWNO_Internalname), ".", ",")) ;
               n974TBW16_DOM_ITM_GRP_ROWNO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A974TBW16_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A974TBW16_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            n974TBW16_DOM_ITM_GRP_ROWNO = ((0==A974TBW16_DOM_ITM_GRP_ROWNO) ? true : false) ;
            /* Read saved values. */
            Z963TBW16_SESSION_ID = httpContext.cgiGet( "Z963TBW16_SESSION_ID") ;
            Z964TBW16_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z964TBW16_DATETIME"), 0) ;
            Z965TBW16_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z965TBW16_STUDY_ID"), ".", ",") ;
            Z966TBW16_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z966TBW16_CRF_ID"), ".", ",")) ;
            Z967TBW16_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z967TBW16_CRF_EDA_NO"), ".", ",")) ;
            Z969TBW16_CRF_ITEM_GRP_CD = httpContext.cgiGet( "Z969TBW16_CRF_ITEM_GRP_CD") ;
            Z968TBW16_VISIT_NO = (int)(localUtil.ctol( httpContext.cgiGet( "Z968TBW16_VISIT_NO"), ".", ",")) ;
            n968TBW16_VISIT_NO = ((0==A968TBW16_VISIT_NO) ? true : false) ;
            Z970TBW16_DOM_CD = httpContext.cgiGet( "Z970TBW16_DOM_CD") ;
            n970TBW16_DOM_CD = ((GXutil.strcmp("", A970TBW16_DOM_CD)==0) ? true : false) ;
            Z971TBW16_DOM_VAR_NM = httpContext.cgiGet( "Z971TBW16_DOM_VAR_NM") ;
            n971TBW16_DOM_VAR_NM = ((GXutil.strcmp("", A971TBW16_DOM_VAR_NM)==0) ? true : false) ;
            Z972TBW16_DOM_ITM_GRP_OID = httpContext.cgiGet( "Z972TBW16_DOM_ITM_GRP_OID") ;
            n972TBW16_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A972TBW16_DOM_ITM_GRP_OID)==0) ? true : false) ;
            Z973TBW16_DOM_ITM_GRP_ATTR_SEQ = (short)(localUtil.ctol( httpContext.cgiGet( "Z973TBW16_DOM_ITM_GRP_ATTR_SEQ"), ".", ",")) ;
            n973TBW16_DOM_ITM_GRP_ATTR_SEQ = ((0==A973TBW16_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
            Z974TBW16_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( "Z974TBW16_DOM_ITM_GRP_ROWNO"), ".", ",")) ;
            n974TBW16_DOM_ITM_GRP_ROWNO = ((0==A974TBW16_DOM_ITM_GRP_ROWNO) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
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
               A963TBW16_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A963TBW16_SESSION_ID", A963TBW16_SESSION_ID);
               A964TBW16_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A964TBW16_DATETIME", localUtil.ttoc( A964TBW16_DATETIME, 8, 5, 0, 1, "/", ":", " "));
               A965TBW16_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A965TBW16_STUDY_ID", GXutil.ltrim( GXutil.str( A965TBW16_STUDY_ID, 10, 0)));
               A966TBW16_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A966TBW16_CRF_ID", GXutil.ltrim( GXutil.str( A966TBW16_CRF_ID, 4, 0)));
               A967TBW16_CRF_EDA_NO = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A967TBW16_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A967TBW16_CRF_EDA_NO, 2, 0)));
               A969TBW16_CRF_ITEM_GRP_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A969TBW16_CRF_ITEM_GRP_CD", A969TBW16_CRF_ITEM_GRP_CD);
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
                  if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1M64( ) ;
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
      disableAttributes1M64( ) ;
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

   public void resetCaption1M0( )
   {
   }

   public void zm1M64( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z968TBW16_VISIT_NO = T001M3_A968TBW16_VISIT_NO[0] ;
            Z970TBW16_DOM_CD = T001M3_A970TBW16_DOM_CD[0] ;
            Z971TBW16_DOM_VAR_NM = T001M3_A971TBW16_DOM_VAR_NM[0] ;
            Z972TBW16_DOM_ITM_GRP_OID = T001M3_A972TBW16_DOM_ITM_GRP_OID[0] ;
            Z973TBW16_DOM_ITM_GRP_ATTR_SEQ = T001M3_A973TBW16_DOM_ITM_GRP_ATTR_SEQ[0] ;
            Z974TBW16_DOM_ITM_GRP_ROWNO = T001M3_A974TBW16_DOM_ITM_GRP_ROWNO[0] ;
         }
         else
         {
            Z968TBW16_VISIT_NO = A968TBW16_VISIT_NO ;
            Z970TBW16_DOM_CD = A970TBW16_DOM_CD ;
            Z971TBW16_DOM_VAR_NM = A971TBW16_DOM_VAR_NM ;
            Z972TBW16_DOM_ITM_GRP_OID = A972TBW16_DOM_ITM_GRP_OID ;
            Z973TBW16_DOM_ITM_GRP_ATTR_SEQ = A973TBW16_DOM_ITM_GRP_ATTR_SEQ ;
            Z974TBW16_DOM_ITM_GRP_ROWNO = A974TBW16_DOM_ITM_GRP_ROWNO ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z963TBW16_SESSION_ID = A963TBW16_SESSION_ID ;
         Z964TBW16_DATETIME = A964TBW16_DATETIME ;
         Z965TBW16_STUDY_ID = A965TBW16_STUDY_ID ;
         Z966TBW16_CRF_ID = A966TBW16_CRF_ID ;
         Z967TBW16_CRF_EDA_NO = A967TBW16_CRF_EDA_NO ;
         Z969TBW16_CRF_ITEM_GRP_CD = A969TBW16_CRF_ITEM_GRP_CD ;
         Z968TBW16_VISIT_NO = A968TBW16_VISIT_NO ;
         Z970TBW16_DOM_CD = A970TBW16_DOM_CD ;
         Z971TBW16_DOM_VAR_NM = A971TBW16_DOM_VAR_NM ;
         Z972TBW16_DOM_ITM_GRP_OID = A972TBW16_DOM_ITM_GRP_OID ;
         Z973TBW16_DOM_ITM_GRP_ATTR_SEQ = A973TBW16_DOM_ITM_GRP_ATTR_SEQ ;
         Z974TBW16_DOM_ITM_GRP_ROWNO = A974TBW16_DOM_ITM_GRP_ROWNO ;
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

   public void load1M64( )
   {
      /* Using cursor T001M4 */
      pr_default.execute(2, new Object[] {A963TBW16_SESSION_ID, A964TBW16_DATETIME, new Long(A965TBW16_STUDY_ID), new Short(A966TBW16_CRF_ID), new Byte(A967TBW16_CRF_EDA_NO), A969TBW16_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A968TBW16_VISIT_NO = T001M4_A968TBW16_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A968TBW16_VISIT_NO", GXutil.ltrim( GXutil.str( A968TBW16_VISIT_NO, 6, 0)));
         n968TBW16_VISIT_NO = T001M4_n968TBW16_VISIT_NO[0] ;
         A970TBW16_DOM_CD = T001M4_A970TBW16_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970TBW16_DOM_CD", A970TBW16_DOM_CD);
         n970TBW16_DOM_CD = T001M4_n970TBW16_DOM_CD[0] ;
         A971TBW16_DOM_VAR_NM = T001M4_A971TBW16_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971TBW16_DOM_VAR_NM", A971TBW16_DOM_VAR_NM);
         n971TBW16_DOM_VAR_NM = T001M4_n971TBW16_DOM_VAR_NM[0] ;
         A972TBW16_DOM_ITM_GRP_OID = T001M4_A972TBW16_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A972TBW16_DOM_ITM_GRP_OID", A972TBW16_DOM_ITM_GRP_OID);
         n972TBW16_DOM_ITM_GRP_OID = T001M4_n972TBW16_DOM_ITM_GRP_OID[0] ;
         A973TBW16_DOM_ITM_GRP_ATTR_SEQ = T001M4_A973TBW16_DOM_ITM_GRP_ATTR_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A973TBW16_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A973TBW16_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         n973TBW16_DOM_ITM_GRP_ATTR_SEQ = T001M4_n973TBW16_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A974TBW16_DOM_ITM_GRP_ROWNO = T001M4_A974TBW16_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A974TBW16_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A974TBW16_DOM_ITM_GRP_ROWNO, 4, 0)));
         n974TBW16_DOM_ITM_GRP_ROWNO = T001M4_n974TBW16_DOM_ITM_GRP_ROWNO[0] ;
         zm1M64( -2) ;
      }
      pr_default.close(2);
      onLoadActions1M64( ) ;
   }

   public void onLoadActions1M64( )
   {
   }

   public void checkExtendedTable1M64( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.nullDate().equals(A964TBW16_DATETIME) || (( A964TBW16_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A964TBW16_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　実行日時 は範囲外です", "OutOfRange", 1, "TBW16_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW16_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1M64( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1M64( )
   {
      /* Using cursor T001M5 */
      pr_default.execute(3, new Object[] {A963TBW16_SESSION_ID, A964TBW16_DATETIME, new Long(A965TBW16_STUDY_ID), new Short(A966TBW16_CRF_ID), new Byte(A967TBW16_CRF_EDA_NO), A969TBW16_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound64 = (short)(1) ;
      }
      else
      {
         RcdFound64 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001M3 */
      pr_default.execute(1, new Object[] {A963TBW16_SESSION_ID, A964TBW16_DATETIME, new Long(A965TBW16_STUDY_ID), new Short(A966TBW16_CRF_ID), new Byte(A967TBW16_CRF_EDA_NO), A969TBW16_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1M64( 2) ;
         RcdFound64 = (short)(1) ;
         A963TBW16_SESSION_ID = T001M3_A963TBW16_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A963TBW16_SESSION_ID", A963TBW16_SESSION_ID);
         A964TBW16_DATETIME = T001M3_A964TBW16_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A964TBW16_DATETIME", localUtil.ttoc( A964TBW16_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A965TBW16_STUDY_ID = T001M3_A965TBW16_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A965TBW16_STUDY_ID", GXutil.ltrim( GXutil.str( A965TBW16_STUDY_ID, 10, 0)));
         A966TBW16_CRF_ID = T001M3_A966TBW16_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A966TBW16_CRF_ID", GXutil.ltrim( GXutil.str( A966TBW16_CRF_ID, 4, 0)));
         A967TBW16_CRF_EDA_NO = T001M3_A967TBW16_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A967TBW16_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A967TBW16_CRF_EDA_NO, 2, 0)));
         A969TBW16_CRF_ITEM_GRP_CD = T001M3_A969TBW16_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A969TBW16_CRF_ITEM_GRP_CD", A969TBW16_CRF_ITEM_GRP_CD);
         A968TBW16_VISIT_NO = T001M3_A968TBW16_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A968TBW16_VISIT_NO", GXutil.ltrim( GXutil.str( A968TBW16_VISIT_NO, 6, 0)));
         n968TBW16_VISIT_NO = T001M3_n968TBW16_VISIT_NO[0] ;
         A970TBW16_DOM_CD = T001M3_A970TBW16_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A970TBW16_DOM_CD", A970TBW16_DOM_CD);
         n970TBW16_DOM_CD = T001M3_n970TBW16_DOM_CD[0] ;
         A971TBW16_DOM_VAR_NM = T001M3_A971TBW16_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A971TBW16_DOM_VAR_NM", A971TBW16_DOM_VAR_NM);
         n971TBW16_DOM_VAR_NM = T001M3_n971TBW16_DOM_VAR_NM[0] ;
         A972TBW16_DOM_ITM_GRP_OID = T001M3_A972TBW16_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A972TBW16_DOM_ITM_GRP_OID", A972TBW16_DOM_ITM_GRP_OID);
         n972TBW16_DOM_ITM_GRP_OID = T001M3_n972TBW16_DOM_ITM_GRP_OID[0] ;
         A973TBW16_DOM_ITM_GRP_ATTR_SEQ = T001M3_A973TBW16_DOM_ITM_GRP_ATTR_SEQ[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A973TBW16_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A973TBW16_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
         n973TBW16_DOM_ITM_GRP_ATTR_SEQ = T001M3_n973TBW16_DOM_ITM_GRP_ATTR_SEQ[0] ;
         A974TBW16_DOM_ITM_GRP_ROWNO = T001M3_A974TBW16_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A974TBW16_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A974TBW16_DOM_ITM_GRP_ROWNO, 4, 0)));
         n974TBW16_DOM_ITM_GRP_ROWNO = T001M3_n974TBW16_DOM_ITM_GRP_ROWNO[0] ;
         Z963TBW16_SESSION_ID = A963TBW16_SESSION_ID ;
         Z964TBW16_DATETIME = A964TBW16_DATETIME ;
         Z965TBW16_STUDY_ID = A965TBW16_STUDY_ID ;
         Z966TBW16_CRF_ID = A966TBW16_CRF_ID ;
         Z967TBW16_CRF_EDA_NO = A967TBW16_CRF_EDA_NO ;
         Z969TBW16_CRF_ITEM_GRP_CD = A969TBW16_CRF_ITEM_GRP_CD ;
         sMode64 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1M64( ) ;
         if ( AnyError == 1 )
         {
            RcdFound64 = (short)(0) ;
            initializeNonKey1M64( ) ;
         }
         Gx_mode = sMode64 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound64 = (short)(0) ;
         initializeNonKey1M64( ) ;
         sMode64 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode64 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1M64( ) ;
      if ( RcdFound64 == 0 )
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
      RcdFound64 = (short)(0) ;
      /* Using cursor T001M6 */
      pr_default.execute(4, new Object[] {A963TBW16_SESSION_ID, A963TBW16_SESSION_ID, A964TBW16_DATETIME, A964TBW16_DATETIME, A963TBW16_SESSION_ID, new Long(A965TBW16_STUDY_ID), new Long(A965TBW16_STUDY_ID), A964TBW16_DATETIME, A963TBW16_SESSION_ID, new Short(A966TBW16_CRF_ID), new Short(A966TBW16_CRF_ID), new Long(A965TBW16_STUDY_ID), A964TBW16_DATETIME, A963TBW16_SESSION_ID, new Byte(A967TBW16_CRF_EDA_NO), new Byte(A967TBW16_CRF_EDA_NO), new Short(A966TBW16_CRF_ID), new Long(A965TBW16_STUDY_ID), A964TBW16_DATETIME, A963TBW16_SESSION_ID, A969TBW16_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && T001M6_A964TBW16_DATETIME[0].before( A964TBW16_DATETIME ) || T001M6_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M6_A965TBW16_STUDY_ID[0] < A965TBW16_STUDY_ID ) || ( T001M6_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M6_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M6_A966TBW16_CRF_ID[0] < A966TBW16_CRF_ID ) || ( T001M6_A966TBW16_CRF_ID[0] == A966TBW16_CRF_ID ) && ( T001M6_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M6_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M6_A967TBW16_CRF_EDA_NO[0] < A967TBW16_CRF_EDA_NO ) || ( T001M6_A967TBW16_CRF_EDA_NO[0] == A967TBW16_CRF_EDA_NO ) && ( T001M6_A966TBW16_CRF_ID[0] == A966TBW16_CRF_ID ) && ( T001M6_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M6_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001M6_A969TBW16_CRF_ITEM_GRP_CD[0], A969TBW16_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && T001M6_A964TBW16_DATETIME[0].after( A964TBW16_DATETIME ) || T001M6_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M6_A965TBW16_STUDY_ID[0] > A965TBW16_STUDY_ID ) || ( T001M6_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M6_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M6_A966TBW16_CRF_ID[0] > A966TBW16_CRF_ID ) || ( T001M6_A966TBW16_CRF_ID[0] == A966TBW16_CRF_ID ) && ( T001M6_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M6_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M6_A967TBW16_CRF_EDA_NO[0] > A967TBW16_CRF_EDA_NO ) || ( T001M6_A967TBW16_CRF_EDA_NO[0] == A967TBW16_CRF_EDA_NO ) && ( T001M6_A966TBW16_CRF_ID[0] == A966TBW16_CRF_ID ) && ( T001M6_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M6_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M6_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001M6_A969TBW16_CRF_ITEM_GRP_CD[0], A969TBW16_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            A963TBW16_SESSION_ID = T001M6_A963TBW16_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A963TBW16_SESSION_ID", A963TBW16_SESSION_ID);
            A964TBW16_DATETIME = T001M6_A964TBW16_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A964TBW16_DATETIME", localUtil.ttoc( A964TBW16_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A965TBW16_STUDY_ID = T001M6_A965TBW16_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A965TBW16_STUDY_ID", GXutil.ltrim( GXutil.str( A965TBW16_STUDY_ID, 10, 0)));
            A966TBW16_CRF_ID = T001M6_A966TBW16_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A966TBW16_CRF_ID", GXutil.ltrim( GXutil.str( A966TBW16_CRF_ID, 4, 0)));
            A967TBW16_CRF_EDA_NO = T001M6_A967TBW16_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A967TBW16_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A967TBW16_CRF_EDA_NO, 2, 0)));
            A969TBW16_CRF_ITEM_GRP_CD = T001M6_A969TBW16_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A969TBW16_CRF_ITEM_GRP_CD", A969TBW16_CRF_ITEM_GRP_CD);
            RcdFound64 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound64 = (short)(0) ;
      /* Using cursor T001M7 */
      pr_default.execute(5, new Object[] {A963TBW16_SESSION_ID, A963TBW16_SESSION_ID, A964TBW16_DATETIME, A964TBW16_DATETIME, A963TBW16_SESSION_ID, new Long(A965TBW16_STUDY_ID), new Long(A965TBW16_STUDY_ID), A964TBW16_DATETIME, A963TBW16_SESSION_ID, new Short(A966TBW16_CRF_ID), new Short(A966TBW16_CRF_ID), new Long(A965TBW16_STUDY_ID), A964TBW16_DATETIME, A963TBW16_SESSION_ID, new Byte(A967TBW16_CRF_EDA_NO), new Byte(A967TBW16_CRF_EDA_NO), new Short(A966TBW16_CRF_ID), new Long(A965TBW16_STUDY_ID), A964TBW16_DATETIME, A963TBW16_SESSION_ID, A969TBW16_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && T001M7_A964TBW16_DATETIME[0].after( A964TBW16_DATETIME ) || T001M7_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M7_A965TBW16_STUDY_ID[0] > A965TBW16_STUDY_ID ) || ( T001M7_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M7_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M7_A966TBW16_CRF_ID[0] > A966TBW16_CRF_ID ) || ( T001M7_A966TBW16_CRF_ID[0] == A966TBW16_CRF_ID ) && ( T001M7_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M7_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M7_A967TBW16_CRF_EDA_NO[0] > A967TBW16_CRF_EDA_NO ) || ( T001M7_A967TBW16_CRF_EDA_NO[0] == A967TBW16_CRF_EDA_NO ) && ( T001M7_A966TBW16_CRF_ID[0] == A966TBW16_CRF_ID ) && ( T001M7_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M7_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001M7_A969TBW16_CRF_ITEM_GRP_CD[0], A969TBW16_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && T001M7_A964TBW16_DATETIME[0].before( A964TBW16_DATETIME ) || T001M7_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M7_A965TBW16_STUDY_ID[0] < A965TBW16_STUDY_ID ) || ( T001M7_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M7_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M7_A966TBW16_CRF_ID[0] < A966TBW16_CRF_ID ) || ( T001M7_A966TBW16_CRF_ID[0] == A966TBW16_CRF_ID ) && ( T001M7_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M7_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( T001M7_A967TBW16_CRF_EDA_NO[0] < A967TBW16_CRF_EDA_NO ) || ( T001M7_A967TBW16_CRF_EDA_NO[0] == A967TBW16_CRF_EDA_NO ) && ( T001M7_A966TBW16_CRF_ID[0] == A966TBW16_CRF_ID ) && ( T001M7_A965TBW16_STUDY_ID[0] == A965TBW16_STUDY_ID ) && T001M7_A964TBW16_DATETIME[0].equals( A964TBW16_DATETIME ) && ( GXutil.strcmp(T001M7_A963TBW16_SESSION_ID[0], A963TBW16_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001M7_A969TBW16_CRF_ITEM_GRP_CD[0], A969TBW16_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            A963TBW16_SESSION_ID = T001M7_A963TBW16_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A963TBW16_SESSION_ID", A963TBW16_SESSION_ID);
            A964TBW16_DATETIME = T001M7_A964TBW16_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A964TBW16_DATETIME", localUtil.ttoc( A964TBW16_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A965TBW16_STUDY_ID = T001M7_A965TBW16_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A965TBW16_STUDY_ID", GXutil.ltrim( GXutil.str( A965TBW16_STUDY_ID, 10, 0)));
            A966TBW16_CRF_ID = T001M7_A966TBW16_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A966TBW16_CRF_ID", GXutil.ltrim( GXutil.str( A966TBW16_CRF_ID, 4, 0)));
            A967TBW16_CRF_EDA_NO = T001M7_A967TBW16_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A967TBW16_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A967TBW16_CRF_EDA_NO, 2, 0)));
            A969TBW16_CRF_ITEM_GRP_CD = T001M7_A969TBW16_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A969TBW16_CRF_ITEM_GRP_CD", A969TBW16_CRF_ITEM_GRP_CD);
            RcdFound64 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1M64( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBW16_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1M64( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound64 == 1 )
         {
            if ( ( GXutil.strcmp(A963TBW16_SESSION_ID, Z963TBW16_SESSION_ID) != 0 ) || !( A964TBW16_DATETIME.equals( Z964TBW16_DATETIME ) ) || ( A965TBW16_STUDY_ID != Z965TBW16_STUDY_ID ) || ( A966TBW16_CRF_ID != Z966TBW16_CRF_ID ) || ( A967TBW16_CRF_EDA_NO != Z967TBW16_CRF_EDA_NO ) || ( GXutil.strcmp(A969TBW16_CRF_ITEM_GRP_CD, Z969TBW16_CRF_ITEM_GRP_CD) != 0 ) )
            {
               A963TBW16_SESSION_ID = Z963TBW16_SESSION_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A963TBW16_SESSION_ID", A963TBW16_SESSION_ID);
               A964TBW16_DATETIME = Z964TBW16_DATETIME ;
               httpContext.ajax_rsp_assign_attri("", false, "A964TBW16_DATETIME", localUtil.ttoc( A964TBW16_DATETIME, 8, 5, 0, 1, "/", ":", " "));
               A965TBW16_STUDY_ID = Z965TBW16_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A965TBW16_STUDY_ID", GXutil.ltrim( GXutil.str( A965TBW16_STUDY_ID, 10, 0)));
               A966TBW16_CRF_ID = Z966TBW16_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A966TBW16_CRF_ID", GXutil.ltrim( GXutil.str( A966TBW16_CRF_ID, 4, 0)));
               A967TBW16_CRF_EDA_NO = Z967TBW16_CRF_EDA_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A967TBW16_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A967TBW16_CRF_EDA_NO, 2, 0)));
               A969TBW16_CRF_ITEM_GRP_CD = Z969TBW16_CRF_ITEM_GRP_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A969TBW16_CRF_ITEM_GRP_CD", A969TBW16_CRF_ITEM_GRP_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW16_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW16_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBW16_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1M64( ) ;
               GX_FocusControl = edtTBW16_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A963TBW16_SESSION_ID, Z963TBW16_SESSION_ID) != 0 ) || !( A964TBW16_DATETIME.equals( Z964TBW16_DATETIME ) ) || ( A965TBW16_STUDY_ID != Z965TBW16_STUDY_ID ) || ( A966TBW16_CRF_ID != Z966TBW16_CRF_ID ) || ( A967TBW16_CRF_EDA_NO != Z967TBW16_CRF_EDA_NO ) || ( GXutil.strcmp(A969TBW16_CRF_ITEM_GRP_CD, Z969TBW16_CRF_ITEM_GRP_CD) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW16_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1M64( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW16_SESSION_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBW16_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBW16_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1M64( ) ;
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
      if ( ( GXutil.strcmp(A963TBW16_SESSION_ID, Z963TBW16_SESSION_ID) != 0 ) || !( A964TBW16_DATETIME.equals( Z964TBW16_DATETIME ) ) || ( A965TBW16_STUDY_ID != Z965TBW16_STUDY_ID ) || ( A966TBW16_CRF_ID != Z966TBW16_CRF_ID ) || ( A967TBW16_CRF_EDA_NO != Z967TBW16_CRF_EDA_NO ) || ( GXutil.strcmp(A969TBW16_CRF_ITEM_GRP_CD, Z969TBW16_CRF_ITEM_GRP_CD) != 0 ) )
      {
         A963TBW16_SESSION_ID = Z963TBW16_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A963TBW16_SESSION_ID", A963TBW16_SESSION_ID);
         A964TBW16_DATETIME = Z964TBW16_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A964TBW16_DATETIME", localUtil.ttoc( A964TBW16_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A965TBW16_STUDY_ID = Z965TBW16_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A965TBW16_STUDY_ID", GXutil.ltrim( GXutil.str( A965TBW16_STUDY_ID, 10, 0)));
         A966TBW16_CRF_ID = Z966TBW16_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A966TBW16_CRF_ID", GXutil.ltrim( GXutil.str( A966TBW16_CRF_ID, 4, 0)));
         A967TBW16_CRF_EDA_NO = Z967TBW16_CRF_EDA_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A967TBW16_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A967TBW16_CRF_EDA_NO, 2, 0)));
         A969TBW16_CRF_ITEM_GRP_CD = Z969TBW16_CRF_ITEM_GRP_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A969TBW16_CRF_ITEM_GRP_CD", A969TBW16_CRF_ITEM_GRP_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW16_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW16_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW16_SESSION_ID_Internalname ;
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
      if ( RcdFound64 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW16_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW16_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBW16_VISIT_NO_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1M64( ) ;
      if ( RcdFound64 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW16_VISIT_NO_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M64( ) ;
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
      if ( RcdFound64 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW16_VISIT_NO_Internalname ;
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
      if ( RcdFound64 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW16_VISIT_NO_Internalname ;
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
      scanStart1M64( ) ;
      if ( RcdFound64 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound64 != 0 )
         {
            scanNext1M64( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW16_VISIT_NO_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1M64( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1M64( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001M2 */
         pr_default.execute(0, new Object[] {A963TBW16_SESSION_ID, A964TBW16_DATETIME, new Long(A965TBW16_STUDY_ID), new Short(A966TBW16_CRF_ID), new Byte(A967TBW16_CRF_EDA_NO), A969TBW16_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW16_DOM_MAP_VISIT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z968TBW16_VISIT_NO != T001M2_A968TBW16_VISIT_NO[0] ) || ( GXutil.strcmp(Z970TBW16_DOM_CD, T001M2_A970TBW16_DOM_CD[0]) != 0 ) || ( GXutil.strcmp(Z971TBW16_DOM_VAR_NM, T001M2_A971TBW16_DOM_VAR_NM[0]) != 0 ) || ( GXutil.strcmp(Z972TBW16_DOM_ITM_GRP_OID, T001M2_A972TBW16_DOM_ITM_GRP_OID[0]) != 0 ) || ( Z973TBW16_DOM_ITM_GRP_ATTR_SEQ != T001M2_A973TBW16_DOM_ITM_GRP_ATTR_SEQ[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z974TBW16_DOM_ITM_GRP_ROWNO != T001M2_A974TBW16_DOM_ITM_GRP_ROWNO[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW16_DOM_MAP_VISIT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1M64( )
   {
      beforeValidate1M64( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M64( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1M64( 0) ;
         checkOptimisticConcurrency1M64( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M64( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1M64( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001M8 */
                  pr_default.execute(6, new Object[] {A963TBW16_SESSION_ID, A964TBW16_DATETIME, new Long(A965TBW16_STUDY_ID), new Short(A966TBW16_CRF_ID), new Byte(A967TBW16_CRF_EDA_NO), A969TBW16_CRF_ITEM_GRP_CD, new Boolean(n968TBW16_VISIT_NO), new Integer(A968TBW16_VISIT_NO), new Boolean(n970TBW16_DOM_CD), A970TBW16_DOM_CD, new Boolean(n971TBW16_DOM_VAR_NM), A971TBW16_DOM_VAR_NM, new Boolean(n972TBW16_DOM_ITM_GRP_OID), A972TBW16_DOM_ITM_GRP_OID, new Boolean(n973TBW16_DOM_ITM_GRP_ATTR_SEQ), new Short(A973TBW16_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n974TBW16_DOM_ITM_GRP_ROWNO), new Short(A974TBW16_DOM_ITM_GRP_ROWNO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW16_DOM_MAP_VISIT") ;
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
                        resetCaption1M0( ) ;
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
            load1M64( ) ;
         }
         endLevel1M64( ) ;
      }
      closeExtendedTableCursors1M64( ) ;
   }

   public void update1M64( )
   {
      beforeValidate1M64( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1M64( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M64( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1M64( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1M64( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001M9 */
                  pr_default.execute(7, new Object[] {new Boolean(n968TBW16_VISIT_NO), new Integer(A968TBW16_VISIT_NO), new Boolean(n970TBW16_DOM_CD), A970TBW16_DOM_CD, new Boolean(n971TBW16_DOM_VAR_NM), A971TBW16_DOM_VAR_NM, new Boolean(n972TBW16_DOM_ITM_GRP_OID), A972TBW16_DOM_ITM_GRP_OID, new Boolean(n973TBW16_DOM_ITM_GRP_ATTR_SEQ), new Short(A973TBW16_DOM_ITM_GRP_ATTR_SEQ), new Boolean(n974TBW16_DOM_ITM_GRP_ROWNO), new Short(A974TBW16_DOM_ITM_GRP_ROWNO), A963TBW16_SESSION_ID, A964TBW16_DATETIME, new Long(A965TBW16_STUDY_ID), new Short(A966TBW16_CRF_ID), new Byte(A967TBW16_CRF_EDA_NO), A969TBW16_CRF_ITEM_GRP_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW16_DOM_MAP_VISIT") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW16_DOM_MAP_VISIT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1M64( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption1M0( ) ;
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
         endLevel1M64( ) ;
      }
      closeExtendedTableCursors1M64( ) ;
   }

   public void deferredUpdate1M64( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1M64( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1M64( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1M64( ) ;
         afterConfirm1M64( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1M64( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001M10 */
               pr_default.execute(8, new Object[] {A963TBW16_SESSION_ID, A964TBW16_DATETIME, new Long(A965TBW16_STUDY_ID), new Short(A966TBW16_CRF_ID), new Byte(A967TBW16_CRF_EDA_NO), A969TBW16_CRF_ITEM_GRP_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW16_DOM_MAP_VISIT") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound64 == 0 )
                     {
                        initAll1M64( ) ;
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
                     resetCaption1M0( ) ;
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
      sMode64 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1M64( ) ;
      Gx_mode = sMode64 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1M64( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1M64( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1M64( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw16_dom_map_visit");
         if ( AnyError == 0 )
         {
            confirmValues1M0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw16_dom_map_visit");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1M64( )
   {
      /* Using cursor T001M11 */
      pr_default.execute(9);
      RcdFound64 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A963TBW16_SESSION_ID = T001M11_A963TBW16_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A963TBW16_SESSION_ID", A963TBW16_SESSION_ID);
         A964TBW16_DATETIME = T001M11_A964TBW16_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A964TBW16_DATETIME", localUtil.ttoc( A964TBW16_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A965TBW16_STUDY_ID = T001M11_A965TBW16_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A965TBW16_STUDY_ID", GXutil.ltrim( GXutil.str( A965TBW16_STUDY_ID, 10, 0)));
         A966TBW16_CRF_ID = T001M11_A966TBW16_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A966TBW16_CRF_ID", GXutil.ltrim( GXutil.str( A966TBW16_CRF_ID, 4, 0)));
         A967TBW16_CRF_EDA_NO = T001M11_A967TBW16_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A967TBW16_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A967TBW16_CRF_EDA_NO, 2, 0)));
         A969TBW16_CRF_ITEM_GRP_CD = T001M11_A969TBW16_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A969TBW16_CRF_ITEM_GRP_CD", A969TBW16_CRF_ITEM_GRP_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1M64( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound64 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound64 = (short)(1) ;
         A963TBW16_SESSION_ID = T001M11_A963TBW16_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A963TBW16_SESSION_ID", A963TBW16_SESSION_ID);
         A964TBW16_DATETIME = T001M11_A964TBW16_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A964TBW16_DATETIME", localUtil.ttoc( A964TBW16_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A965TBW16_STUDY_ID = T001M11_A965TBW16_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A965TBW16_STUDY_ID", GXutil.ltrim( GXutil.str( A965TBW16_STUDY_ID, 10, 0)));
         A966TBW16_CRF_ID = T001M11_A966TBW16_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A966TBW16_CRF_ID", GXutil.ltrim( GXutil.str( A966TBW16_CRF_ID, 4, 0)));
         A967TBW16_CRF_EDA_NO = T001M11_A967TBW16_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A967TBW16_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A967TBW16_CRF_EDA_NO, 2, 0)));
         A969TBW16_CRF_ITEM_GRP_CD = T001M11_A969TBW16_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A969TBW16_CRF_ITEM_GRP_CD", A969TBW16_CRF_ITEM_GRP_CD);
      }
   }

   public void scanEnd1M64( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1M64( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1M64( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1M64( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1M64( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1M64( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1M64( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1M64( )
   {
      edtTBW16_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_SESSION_ID_Enabled, 5, 0)));
      edtTBW16_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_DATETIME_Enabled, 5, 0)));
      edtTBW16_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_STUDY_ID_Enabled, 5, 0)));
      edtTBW16_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_CRF_ID_Enabled, 5, 0)));
      edtTBW16_CRF_EDA_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_CRF_EDA_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_CRF_EDA_NO_Enabled, 5, 0)));
      edtTBW16_CRF_ITEM_GRP_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_CRF_ITEM_GRP_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_CRF_ITEM_GRP_CD_Enabled, 5, 0)));
      edtTBW16_VISIT_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_VISIT_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_VISIT_NO_Enabled, 5, 0)));
      edtTBW16_DOM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_DOM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_DOM_CD_Enabled, 5, 0)));
      edtTBW16_DOM_VAR_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_DOM_VAR_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_DOM_VAR_NM_Enabled, 5, 0)));
      edtTBW16_DOM_ITM_GRP_OID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_DOM_ITM_GRP_OID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_DOM_ITM_GRP_OID_Enabled, 5, 0)));
      edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Enabled, 5, 0)));
      edtTBW16_DOM_ITM_GRP_ROWNO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW16_DOM_ITM_GRP_ROWNO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW16_DOM_ITM_GRP_ROWNO_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1M0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRFドメインマッピングVISIT番号参照ワーク") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513222293");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbw16_dom_map_visit") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1M64( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z963TBW16_SESSION_ID", GXutil.rtrim( Z963TBW16_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z964TBW16_DATETIME", localUtil.ttoc( Z964TBW16_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z965TBW16_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z965TBW16_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z966TBW16_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z966TBW16_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z967TBW16_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( Z967TBW16_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z969TBW16_CRF_ITEM_GRP_CD", GXutil.rtrim( Z969TBW16_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z968TBW16_VISIT_NO", GXutil.ltrim( localUtil.ntoc( Z968TBW16_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z970TBW16_DOM_CD", GXutil.rtrim( Z970TBW16_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z971TBW16_DOM_VAR_NM", GXutil.rtrim( Z971TBW16_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z972TBW16_DOM_ITM_GRP_OID", GXutil.rtrim( Z972TBW16_DOM_ITM_GRP_OID));
      GxWebStd.gx_hidden_field( httpContext, "Z973TBW16_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( localUtil.ntoc( Z973TBW16_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z974TBW16_DOM_ITM_GRP_ROWNO", GXutil.ltrim( localUtil.ntoc( Z974TBW16_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return "TBW16_DOM_MAP_VISIT" ;
   }

   public String getPgmdesc( )
   {
      return "CRFドメインマッピングVISIT番号参照ワーク" ;
   }

   public void initializeNonKey1M64( )
   {
      A968TBW16_VISIT_NO = 0 ;
      n968TBW16_VISIT_NO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A968TBW16_VISIT_NO", GXutil.ltrim( GXutil.str( A968TBW16_VISIT_NO, 6, 0)));
      n968TBW16_VISIT_NO = ((0==A968TBW16_VISIT_NO) ? true : false) ;
      A970TBW16_DOM_CD = "" ;
      n970TBW16_DOM_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A970TBW16_DOM_CD", A970TBW16_DOM_CD);
      n970TBW16_DOM_CD = ((GXutil.strcmp("", A970TBW16_DOM_CD)==0) ? true : false) ;
      A971TBW16_DOM_VAR_NM = "" ;
      n971TBW16_DOM_VAR_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A971TBW16_DOM_VAR_NM", A971TBW16_DOM_VAR_NM);
      n971TBW16_DOM_VAR_NM = ((GXutil.strcmp("", A971TBW16_DOM_VAR_NM)==0) ? true : false) ;
      A972TBW16_DOM_ITM_GRP_OID = "" ;
      n972TBW16_DOM_ITM_GRP_OID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A972TBW16_DOM_ITM_GRP_OID", A972TBW16_DOM_ITM_GRP_OID);
      n972TBW16_DOM_ITM_GRP_OID = ((GXutil.strcmp("", A972TBW16_DOM_ITM_GRP_OID)==0) ? true : false) ;
      A973TBW16_DOM_ITM_GRP_ATTR_SEQ = (short)(0) ;
      n973TBW16_DOM_ITM_GRP_ATTR_SEQ = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A973TBW16_DOM_ITM_GRP_ATTR_SEQ", GXutil.ltrim( GXutil.str( A973TBW16_DOM_ITM_GRP_ATTR_SEQ, 4, 0)));
      n973TBW16_DOM_ITM_GRP_ATTR_SEQ = ((0==A973TBW16_DOM_ITM_GRP_ATTR_SEQ) ? true : false) ;
      A974TBW16_DOM_ITM_GRP_ROWNO = (short)(0) ;
      n974TBW16_DOM_ITM_GRP_ROWNO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A974TBW16_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A974TBW16_DOM_ITM_GRP_ROWNO, 4, 0)));
      n974TBW16_DOM_ITM_GRP_ROWNO = ((0==A974TBW16_DOM_ITM_GRP_ROWNO) ? true : false) ;
   }

   public void initAll1M64( )
   {
      A963TBW16_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A963TBW16_SESSION_ID", A963TBW16_SESSION_ID);
      A964TBW16_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A964TBW16_DATETIME", localUtil.ttoc( A964TBW16_DATETIME, 8, 5, 0, 1, "/", ":", " "));
      A965TBW16_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A965TBW16_STUDY_ID", GXutil.ltrim( GXutil.str( A965TBW16_STUDY_ID, 10, 0)));
      A966TBW16_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A966TBW16_CRF_ID", GXutil.ltrim( GXutil.str( A966TBW16_CRF_ID, 4, 0)));
      A967TBW16_CRF_EDA_NO = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A967TBW16_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A967TBW16_CRF_EDA_NO, 2, 0)));
      A969TBW16_CRF_ITEM_GRP_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A969TBW16_CRF_ITEM_GRP_CD", A969TBW16_CRF_ITEM_GRP_CD);
      initializeNonKey1M64( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513222298");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbw16_dom_map_visit.js", "?202071513222298");
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
      lblTextblocktbw16_session_id_Internalname = "TEXTBLOCKTBW16_SESSION_ID" ;
      edtTBW16_SESSION_ID_Internalname = "TBW16_SESSION_ID" ;
      lblTextblocktbw16_datetime_Internalname = "TEXTBLOCKTBW16_DATETIME" ;
      edtTBW16_DATETIME_Internalname = "TBW16_DATETIME" ;
      lblTextblocktbw16_study_id_Internalname = "TEXTBLOCKTBW16_STUDY_ID" ;
      edtTBW16_STUDY_ID_Internalname = "TBW16_STUDY_ID" ;
      lblTextblocktbw16_crf_id_Internalname = "TEXTBLOCKTBW16_CRF_ID" ;
      edtTBW16_CRF_ID_Internalname = "TBW16_CRF_ID" ;
      lblTextblocktbw16_crf_eda_no_Internalname = "TEXTBLOCKTBW16_CRF_EDA_NO" ;
      edtTBW16_CRF_EDA_NO_Internalname = "TBW16_CRF_EDA_NO" ;
      lblTextblocktbw16_crf_item_grp_cd_Internalname = "TEXTBLOCKTBW16_CRF_ITEM_GRP_CD" ;
      edtTBW16_CRF_ITEM_GRP_CD_Internalname = "TBW16_CRF_ITEM_GRP_CD" ;
      lblTextblocktbw16_visit_no_Internalname = "TEXTBLOCKTBW16_VISIT_NO" ;
      edtTBW16_VISIT_NO_Internalname = "TBW16_VISIT_NO" ;
      lblTextblocktbw16_dom_cd_Internalname = "TEXTBLOCKTBW16_DOM_CD" ;
      edtTBW16_DOM_CD_Internalname = "TBW16_DOM_CD" ;
      lblTextblocktbw16_dom_var_nm_Internalname = "TEXTBLOCKTBW16_DOM_VAR_NM" ;
      edtTBW16_DOM_VAR_NM_Internalname = "TBW16_DOM_VAR_NM" ;
      lblTextblocktbw16_dom_itm_grp_oid_Internalname = "TEXTBLOCKTBW16_DOM_ITM_GRP_OID" ;
      edtTBW16_DOM_ITM_GRP_OID_Internalname = "TBW16_DOM_ITM_GRP_OID" ;
      lblTextblocktbw16_dom_itm_grp_attr_seq_Internalname = "TEXTBLOCKTBW16_DOM_ITM_GRP_ATTR_SEQ" ;
      edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Internalname = "TBW16_DOM_ITM_GRP_ATTR_SEQ" ;
      lblTextblocktbw16_dom_itm_grp_rowno_Internalname = "TEXTBLOCKTBW16_DOM_ITM_GRP_ROWNO" ;
      edtTBW16_DOM_ITM_GRP_ROWNO_Internalname = "TBW16_DOM_ITM_GRP_ROWNO" ;
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
      edtTBW16_DOM_ITM_GRP_ROWNO_Jsonclick = "" ;
      edtTBW16_DOM_ITM_GRP_ROWNO_Enabled = 1 ;
      edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Jsonclick = "" ;
      edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Enabled = 1 ;
      edtTBW16_DOM_ITM_GRP_OID_Jsonclick = "" ;
      edtTBW16_DOM_ITM_GRP_OID_Enabled = 1 ;
      edtTBW16_DOM_VAR_NM_Jsonclick = "" ;
      edtTBW16_DOM_VAR_NM_Enabled = 1 ;
      edtTBW16_DOM_CD_Jsonclick = "" ;
      edtTBW16_DOM_CD_Enabled = 1 ;
      edtTBW16_VISIT_NO_Jsonclick = "" ;
      edtTBW16_VISIT_NO_Enabled = 1 ;
      edtTBW16_CRF_ITEM_GRP_CD_Jsonclick = "" ;
      edtTBW16_CRF_ITEM_GRP_CD_Enabled = 1 ;
      edtTBW16_CRF_EDA_NO_Jsonclick = "" ;
      edtTBW16_CRF_EDA_NO_Enabled = 1 ;
      edtTBW16_CRF_ID_Jsonclick = "" ;
      edtTBW16_CRF_ID_Enabled = 1 ;
      edtTBW16_STUDY_ID_Jsonclick = "" ;
      edtTBW16_STUDY_ID_Enabled = 1 ;
      edtTBW16_DATETIME_Jsonclick = "" ;
      edtTBW16_DATETIME_Enabled = 1 ;
      edtTBW16_SESSION_ID_Jsonclick = "" ;
      edtTBW16_SESSION_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      GX_FocusControl = edtTBW16_VISIT_NO_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw16_crf_item_grp_cd( String GX_Parm1 ,
                                            java.util.Date GX_Parm2 ,
                                            long GX_Parm3 ,
                                            short GX_Parm4 ,
                                            byte GX_Parm5 ,
                                            String GX_Parm6 ,
                                            int GX_Parm7 ,
                                            String GX_Parm8 ,
                                            String GX_Parm9 ,
                                            String GX_Parm10 ,
                                            short GX_Parm11 ,
                                            short GX_Parm12 )
   {
      A963TBW16_SESSION_ID = GX_Parm1 ;
      A964TBW16_DATETIME = GX_Parm2 ;
      A965TBW16_STUDY_ID = GX_Parm3 ;
      A966TBW16_CRF_ID = GX_Parm4 ;
      A967TBW16_CRF_EDA_NO = GX_Parm5 ;
      A969TBW16_CRF_ITEM_GRP_CD = GX_Parm6 ;
      A968TBW16_VISIT_NO = GX_Parm7 ;
      n968TBW16_VISIT_NO = false ;
      A970TBW16_DOM_CD = GX_Parm8 ;
      n970TBW16_DOM_CD = false ;
      A971TBW16_DOM_VAR_NM = GX_Parm9 ;
      n971TBW16_DOM_VAR_NM = false ;
      A972TBW16_DOM_ITM_GRP_OID = GX_Parm10 ;
      n972TBW16_DOM_ITM_GRP_OID = false ;
      A973TBW16_DOM_ITM_GRP_ATTR_SEQ = GX_Parm11 ;
      n973TBW16_DOM_ITM_GRP_ATTR_SEQ = false ;
      A974TBW16_DOM_ITM_GRP_ROWNO = GX_Parm12 ;
      n974TBW16_DOM_ITM_GRP_ROWNO = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A968TBW16_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A970TBW16_DOM_CD));
      isValidOutput.add(GXutil.rtrim( A971TBW16_DOM_VAR_NM));
      isValidOutput.add(GXutil.rtrim( A972TBW16_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A973TBW16_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A974TBW16_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z963TBW16_SESSION_ID));
      isValidOutput.add(localUtil.ttoc( Z964TBW16_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z965TBW16_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z966TBW16_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z967TBW16_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z969TBW16_CRF_ITEM_GRP_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z968TBW16_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z970TBW16_DOM_CD));
      isValidOutput.add(GXutil.rtrim( Z971TBW16_DOM_VAR_NM));
      isValidOutput.add(GXutil.rtrim( Z972TBW16_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z973TBW16_DOM_ITM_GRP_ATTR_SEQ, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z974TBW16_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
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
   public void initialize( )
   {
      sPrefix = "" ;
      Z963TBW16_SESSION_ID = "" ;
      Z964TBW16_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z969TBW16_CRF_ITEM_GRP_CD = "" ;
      Z970TBW16_DOM_CD = "" ;
      Z971TBW16_DOM_VAR_NM = "" ;
      Z972TBW16_DOM_ITM_GRP_OID = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
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
      lblTextblocktbw16_session_id_Jsonclick = "" ;
      A963TBW16_SESSION_ID = "" ;
      lblTextblocktbw16_datetime_Jsonclick = "" ;
      A964TBW16_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw16_study_id_Jsonclick = "" ;
      lblTextblocktbw16_crf_id_Jsonclick = "" ;
      lblTextblocktbw16_crf_eda_no_Jsonclick = "" ;
      lblTextblocktbw16_crf_item_grp_cd_Jsonclick = "" ;
      A969TBW16_CRF_ITEM_GRP_CD = "" ;
      lblTextblocktbw16_visit_no_Jsonclick = "" ;
      lblTextblocktbw16_dom_cd_Jsonclick = "" ;
      A970TBW16_DOM_CD = "" ;
      lblTextblocktbw16_dom_var_nm_Jsonclick = "" ;
      A971TBW16_DOM_VAR_NM = "" ;
      lblTextblocktbw16_dom_itm_grp_oid_Jsonclick = "" ;
      A972TBW16_DOM_ITM_GRP_OID = "" ;
      lblTextblocktbw16_dom_itm_grp_attr_seq_Jsonclick = "" ;
      lblTextblocktbw16_dom_itm_grp_rowno_Jsonclick = "" ;
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
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T001M4_A963TBW16_SESSION_ID = new String[] {""} ;
      T001M4_A964TBW16_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001M4_A965TBW16_STUDY_ID = new long[1] ;
      T001M4_A966TBW16_CRF_ID = new short[1] ;
      T001M4_A967TBW16_CRF_EDA_NO = new byte[1] ;
      T001M4_A969TBW16_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001M4_A968TBW16_VISIT_NO = new int[1] ;
      T001M4_n968TBW16_VISIT_NO = new boolean[] {false} ;
      T001M4_A970TBW16_DOM_CD = new String[] {""} ;
      T001M4_n970TBW16_DOM_CD = new boolean[] {false} ;
      T001M4_A971TBW16_DOM_VAR_NM = new String[] {""} ;
      T001M4_n971TBW16_DOM_VAR_NM = new boolean[] {false} ;
      T001M4_A972TBW16_DOM_ITM_GRP_OID = new String[] {""} ;
      T001M4_n972TBW16_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T001M4_A973TBW16_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T001M4_n973TBW16_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T001M4_A974TBW16_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001M4_n974TBW16_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T001M5_A963TBW16_SESSION_ID = new String[] {""} ;
      T001M5_A964TBW16_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001M5_A965TBW16_STUDY_ID = new long[1] ;
      T001M5_A966TBW16_CRF_ID = new short[1] ;
      T001M5_A967TBW16_CRF_EDA_NO = new byte[1] ;
      T001M5_A969TBW16_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001M3_A963TBW16_SESSION_ID = new String[] {""} ;
      T001M3_A964TBW16_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001M3_A965TBW16_STUDY_ID = new long[1] ;
      T001M3_A966TBW16_CRF_ID = new short[1] ;
      T001M3_A967TBW16_CRF_EDA_NO = new byte[1] ;
      T001M3_A969TBW16_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001M3_A968TBW16_VISIT_NO = new int[1] ;
      T001M3_n968TBW16_VISIT_NO = new boolean[] {false} ;
      T001M3_A970TBW16_DOM_CD = new String[] {""} ;
      T001M3_n970TBW16_DOM_CD = new boolean[] {false} ;
      T001M3_A971TBW16_DOM_VAR_NM = new String[] {""} ;
      T001M3_n971TBW16_DOM_VAR_NM = new boolean[] {false} ;
      T001M3_A972TBW16_DOM_ITM_GRP_OID = new String[] {""} ;
      T001M3_n972TBW16_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T001M3_A973TBW16_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T001M3_n973TBW16_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T001M3_A974TBW16_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001M3_n974TBW16_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      sMode64 = "" ;
      T001M6_A963TBW16_SESSION_ID = new String[] {""} ;
      T001M6_A964TBW16_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001M6_A965TBW16_STUDY_ID = new long[1] ;
      T001M6_A966TBW16_CRF_ID = new short[1] ;
      T001M6_A967TBW16_CRF_EDA_NO = new byte[1] ;
      T001M6_A969TBW16_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001M7_A963TBW16_SESSION_ID = new String[] {""} ;
      T001M7_A964TBW16_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001M7_A965TBW16_STUDY_ID = new long[1] ;
      T001M7_A966TBW16_CRF_ID = new short[1] ;
      T001M7_A967TBW16_CRF_EDA_NO = new byte[1] ;
      T001M7_A969TBW16_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001M2_A963TBW16_SESSION_ID = new String[] {""} ;
      T001M2_A964TBW16_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001M2_A965TBW16_STUDY_ID = new long[1] ;
      T001M2_A966TBW16_CRF_ID = new short[1] ;
      T001M2_A967TBW16_CRF_EDA_NO = new byte[1] ;
      T001M2_A969TBW16_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001M2_A968TBW16_VISIT_NO = new int[1] ;
      T001M2_n968TBW16_VISIT_NO = new boolean[] {false} ;
      T001M2_A970TBW16_DOM_CD = new String[] {""} ;
      T001M2_n970TBW16_DOM_CD = new boolean[] {false} ;
      T001M2_A971TBW16_DOM_VAR_NM = new String[] {""} ;
      T001M2_n971TBW16_DOM_VAR_NM = new boolean[] {false} ;
      T001M2_A972TBW16_DOM_ITM_GRP_OID = new String[] {""} ;
      T001M2_n972TBW16_DOM_ITM_GRP_OID = new boolean[] {false} ;
      T001M2_A973TBW16_DOM_ITM_GRP_ATTR_SEQ = new short[1] ;
      T001M2_n973TBW16_DOM_ITM_GRP_ATTR_SEQ = new boolean[] {false} ;
      T001M2_A974TBW16_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001M2_n974TBW16_DOM_ITM_GRP_ROWNO = new boolean[] {false} ;
      T001M11_A963TBW16_SESSION_ID = new String[] {""} ;
      T001M11_A964TBW16_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001M11_A965TBW16_STUDY_ID = new long[1] ;
      T001M11_A966TBW16_CRF_ID = new short[1] ;
      T001M11_A967TBW16_CRF_EDA_NO = new byte[1] ;
      T001M11_A969TBW16_CRF_ITEM_GRP_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw16_dom_map_visit__default(),
         new Object[] {
             new Object[] {
            T001M2_A963TBW16_SESSION_ID, T001M2_A964TBW16_DATETIME, T001M2_A965TBW16_STUDY_ID, T001M2_A966TBW16_CRF_ID, T001M2_A967TBW16_CRF_EDA_NO, T001M2_A969TBW16_CRF_ITEM_GRP_CD, T001M2_A968TBW16_VISIT_NO, T001M2_n968TBW16_VISIT_NO, T001M2_A970TBW16_DOM_CD, T001M2_n970TBW16_DOM_CD,
            T001M2_A971TBW16_DOM_VAR_NM, T001M2_n971TBW16_DOM_VAR_NM, T001M2_A972TBW16_DOM_ITM_GRP_OID, T001M2_n972TBW16_DOM_ITM_GRP_OID, T001M2_A973TBW16_DOM_ITM_GRP_ATTR_SEQ, T001M2_n973TBW16_DOM_ITM_GRP_ATTR_SEQ, T001M2_A974TBW16_DOM_ITM_GRP_ROWNO, T001M2_n974TBW16_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            T001M3_A963TBW16_SESSION_ID, T001M3_A964TBW16_DATETIME, T001M3_A965TBW16_STUDY_ID, T001M3_A966TBW16_CRF_ID, T001M3_A967TBW16_CRF_EDA_NO, T001M3_A969TBW16_CRF_ITEM_GRP_CD, T001M3_A968TBW16_VISIT_NO, T001M3_n968TBW16_VISIT_NO, T001M3_A970TBW16_DOM_CD, T001M3_n970TBW16_DOM_CD,
            T001M3_A971TBW16_DOM_VAR_NM, T001M3_n971TBW16_DOM_VAR_NM, T001M3_A972TBW16_DOM_ITM_GRP_OID, T001M3_n972TBW16_DOM_ITM_GRP_OID, T001M3_A973TBW16_DOM_ITM_GRP_ATTR_SEQ, T001M3_n973TBW16_DOM_ITM_GRP_ATTR_SEQ, T001M3_A974TBW16_DOM_ITM_GRP_ROWNO, T001M3_n974TBW16_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            T001M4_A963TBW16_SESSION_ID, T001M4_A964TBW16_DATETIME, T001M4_A965TBW16_STUDY_ID, T001M4_A966TBW16_CRF_ID, T001M4_A967TBW16_CRF_EDA_NO, T001M4_A969TBW16_CRF_ITEM_GRP_CD, T001M4_A968TBW16_VISIT_NO, T001M4_n968TBW16_VISIT_NO, T001M4_A970TBW16_DOM_CD, T001M4_n970TBW16_DOM_CD,
            T001M4_A971TBW16_DOM_VAR_NM, T001M4_n971TBW16_DOM_VAR_NM, T001M4_A972TBW16_DOM_ITM_GRP_OID, T001M4_n972TBW16_DOM_ITM_GRP_OID, T001M4_A973TBW16_DOM_ITM_GRP_ATTR_SEQ, T001M4_n973TBW16_DOM_ITM_GRP_ATTR_SEQ, T001M4_A974TBW16_DOM_ITM_GRP_ROWNO, T001M4_n974TBW16_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            T001M5_A963TBW16_SESSION_ID, T001M5_A964TBW16_DATETIME, T001M5_A965TBW16_STUDY_ID, T001M5_A966TBW16_CRF_ID, T001M5_A967TBW16_CRF_EDA_NO, T001M5_A969TBW16_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T001M6_A963TBW16_SESSION_ID, T001M6_A964TBW16_DATETIME, T001M6_A965TBW16_STUDY_ID, T001M6_A966TBW16_CRF_ID, T001M6_A967TBW16_CRF_EDA_NO, T001M6_A969TBW16_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T001M7_A963TBW16_SESSION_ID, T001M7_A964TBW16_DATETIME, T001M7_A965TBW16_STUDY_ID, T001M7_A966TBW16_CRF_ID, T001M7_A967TBW16_CRF_EDA_NO, T001M7_A969TBW16_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001M11_A963TBW16_SESSION_ID, T001M11_A964TBW16_DATETIME, T001M11_A965TBW16_STUDY_ID, T001M11_A966TBW16_CRF_ID, T001M11_A967TBW16_CRF_EDA_NO, T001M11_A969TBW16_CRF_ITEM_GRP_CD
            }
         }
      );
   }

   private byte Z967TBW16_CRF_EDA_NO ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A967TBW16_CRF_EDA_NO ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z966TBW16_CRF_ID ;
   private short Z973TBW16_DOM_ITM_GRP_ATTR_SEQ ;
   private short Z974TBW16_DOM_ITM_GRP_ROWNO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A966TBW16_CRF_ID ;
   private short A973TBW16_DOM_ITM_GRP_ATTR_SEQ ;
   private short A974TBW16_DOM_ITM_GRP_ROWNO ;
   private short RcdFound64 ;
   private int Z968TBW16_VISIT_NO ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW16_SESSION_ID_Enabled ;
   private int edtTBW16_DATETIME_Enabled ;
   private int edtTBW16_STUDY_ID_Enabled ;
   private int edtTBW16_CRF_ID_Enabled ;
   private int edtTBW16_CRF_EDA_NO_Enabled ;
   private int edtTBW16_CRF_ITEM_GRP_CD_Enabled ;
   private int A968TBW16_VISIT_NO ;
   private int edtTBW16_VISIT_NO_Enabled ;
   private int edtTBW16_DOM_CD_Enabled ;
   private int edtTBW16_DOM_VAR_NM_Enabled ;
   private int edtTBW16_DOM_ITM_GRP_OID_Enabled ;
   private int edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Enabled ;
   private int edtTBW16_DOM_ITM_GRP_ROWNO_Enabled ;
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
   private long Z965TBW16_STUDY_ID ;
   private long A965TBW16_STUDY_ID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW16_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw16_session_id_Internalname ;
   private String lblTextblocktbw16_session_id_Jsonclick ;
   private String edtTBW16_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw16_datetime_Internalname ;
   private String lblTextblocktbw16_datetime_Jsonclick ;
   private String edtTBW16_DATETIME_Internalname ;
   private String edtTBW16_DATETIME_Jsonclick ;
   private String lblTextblocktbw16_study_id_Internalname ;
   private String lblTextblocktbw16_study_id_Jsonclick ;
   private String edtTBW16_STUDY_ID_Internalname ;
   private String edtTBW16_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw16_crf_id_Internalname ;
   private String lblTextblocktbw16_crf_id_Jsonclick ;
   private String edtTBW16_CRF_ID_Internalname ;
   private String edtTBW16_CRF_ID_Jsonclick ;
   private String lblTextblocktbw16_crf_eda_no_Internalname ;
   private String lblTextblocktbw16_crf_eda_no_Jsonclick ;
   private String edtTBW16_CRF_EDA_NO_Internalname ;
   private String edtTBW16_CRF_EDA_NO_Jsonclick ;
   private String lblTextblocktbw16_crf_item_grp_cd_Internalname ;
   private String lblTextblocktbw16_crf_item_grp_cd_Jsonclick ;
   private String edtTBW16_CRF_ITEM_GRP_CD_Internalname ;
   private String edtTBW16_CRF_ITEM_GRP_CD_Jsonclick ;
   private String lblTextblocktbw16_visit_no_Internalname ;
   private String lblTextblocktbw16_visit_no_Jsonclick ;
   private String edtTBW16_VISIT_NO_Internalname ;
   private String edtTBW16_VISIT_NO_Jsonclick ;
   private String lblTextblocktbw16_dom_cd_Internalname ;
   private String lblTextblocktbw16_dom_cd_Jsonclick ;
   private String edtTBW16_DOM_CD_Internalname ;
   private String edtTBW16_DOM_CD_Jsonclick ;
   private String lblTextblocktbw16_dom_var_nm_Internalname ;
   private String lblTextblocktbw16_dom_var_nm_Jsonclick ;
   private String edtTBW16_DOM_VAR_NM_Internalname ;
   private String edtTBW16_DOM_VAR_NM_Jsonclick ;
   private String lblTextblocktbw16_dom_itm_grp_oid_Internalname ;
   private String lblTextblocktbw16_dom_itm_grp_oid_Jsonclick ;
   private String edtTBW16_DOM_ITM_GRP_OID_Internalname ;
   private String edtTBW16_DOM_ITM_GRP_OID_Jsonclick ;
   private String lblTextblocktbw16_dom_itm_grp_attr_seq_Internalname ;
   private String lblTextblocktbw16_dom_itm_grp_attr_seq_Jsonclick ;
   private String edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Internalname ;
   private String edtTBW16_DOM_ITM_GRP_ATTR_SEQ_Jsonclick ;
   private String lblTextblocktbw16_dom_itm_grp_rowno_Internalname ;
   private String lblTextblocktbw16_dom_itm_grp_rowno_Jsonclick ;
   private String edtTBW16_DOM_ITM_GRP_ROWNO_Internalname ;
   private String edtTBW16_DOM_ITM_GRP_ROWNO_Jsonclick ;
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
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sMode64 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z964TBW16_DATETIME ;
   private java.util.Date A964TBW16_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n968TBW16_VISIT_NO ;
   private boolean n970TBW16_DOM_CD ;
   private boolean n971TBW16_DOM_VAR_NM ;
   private boolean n972TBW16_DOM_ITM_GRP_OID ;
   private boolean n973TBW16_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean n974TBW16_DOM_ITM_GRP_ROWNO ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z963TBW16_SESSION_ID ;
   private String Z969TBW16_CRF_ITEM_GRP_CD ;
   private String Z970TBW16_DOM_CD ;
   private String Z971TBW16_DOM_VAR_NM ;
   private String Z972TBW16_DOM_ITM_GRP_OID ;
   private String A963TBW16_SESSION_ID ;
   private String A969TBW16_CRF_ITEM_GRP_CD ;
   private String A970TBW16_DOM_CD ;
   private String A971TBW16_DOM_VAR_NM ;
   private String A972TBW16_DOM_ITM_GRP_OID ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001M4_A963TBW16_SESSION_ID ;
   private java.util.Date[] T001M4_A964TBW16_DATETIME ;
   private long[] T001M4_A965TBW16_STUDY_ID ;
   private short[] T001M4_A966TBW16_CRF_ID ;
   private byte[] T001M4_A967TBW16_CRF_EDA_NO ;
   private String[] T001M4_A969TBW16_CRF_ITEM_GRP_CD ;
   private int[] T001M4_A968TBW16_VISIT_NO ;
   private boolean[] T001M4_n968TBW16_VISIT_NO ;
   private String[] T001M4_A970TBW16_DOM_CD ;
   private boolean[] T001M4_n970TBW16_DOM_CD ;
   private String[] T001M4_A971TBW16_DOM_VAR_NM ;
   private boolean[] T001M4_n971TBW16_DOM_VAR_NM ;
   private String[] T001M4_A972TBW16_DOM_ITM_GRP_OID ;
   private boolean[] T001M4_n972TBW16_DOM_ITM_GRP_OID ;
   private short[] T001M4_A973TBW16_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T001M4_n973TBW16_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T001M4_A974TBW16_DOM_ITM_GRP_ROWNO ;
   private boolean[] T001M4_n974TBW16_DOM_ITM_GRP_ROWNO ;
   private String[] T001M5_A963TBW16_SESSION_ID ;
   private java.util.Date[] T001M5_A964TBW16_DATETIME ;
   private long[] T001M5_A965TBW16_STUDY_ID ;
   private short[] T001M5_A966TBW16_CRF_ID ;
   private byte[] T001M5_A967TBW16_CRF_EDA_NO ;
   private String[] T001M5_A969TBW16_CRF_ITEM_GRP_CD ;
   private String[] T001M3_A963TBW16_SESSION_ID ;
   private java.util.Date[] T001M3_A964TBW16_DATETIME ;
   private long[] T001M3_A965TBW16_STUDY_ID ;
   private short[] T001M3_A966TBW16_CRF_ID ;
   private byte[] T001M3_A967TBW16_CRF_EDA_NO ;
   private String[] T001M3_A969TBW16_CRF_ITEM_GRP_CD ;
   private int[] T001M3_A968TBW16_VISIT_NO ;
   private boolean[] T001M3_n968TBW16_VISIT_NO ;
   private String[] T001M3_A970TBW16_DOM_CD ;
   private boolean[] T001M3_n970TBW16_DOM_CD ;
   private String[] T001M3_A971TBW16_DOM_VAR_NM ;
   private boolean[] T001M3_n971TBW16_DOM_VAR_NM ;
   private String[] T001M3_A972TBW16_DOM_ITM_GRP_OID ;
   private boolean[] T001M3_n972TBW16_DOM_ITM_GRP_OID ;
   private short[] T001M3_A973TBW16_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T001M3_n973TBW16_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T001M3_A974TBW16_DOM_ITM_GRP_ROWNO ;
   private boolean[] T001M3_n974TBW16_DOM_ITM_GRP_ROWNO ;
   private String[] T001M6_A963TBW16_SESSION_ID ;
   private java.util.Date[] T001M6_A964TBW16_DATETIME ;
   private long[] T001M6_A965TBW16_STUDY_ID ;
   private short[] T001M6_A966TBW16_CRF_ID ;
   private byte[] T001M6_A967TBW16_CRF_EDA_NO ;
   private String[] T001M6_A969TBW16_CRF_ITEM_GRP_CD ;
   private String[] T001M7_A963TBW16_SESSION_ID ;
   private java.util.Date[] T001M7_A964TBW16_DATETIME ;
   private long[] T001M7_A965TBW16_STUDY_ID ;
   private short[] T001M7_A966TBW16_CRF_ID ;
   private byte[] T001M7_A967TBW16_CRF_EDA_NO ;
   private String[] T001M7_A969TBW16_CRF_ITEM_GRP_CD ;
   private String[] T001M2_A963TBW16_SESSION_ID ;
   private java.util.Date[] T001M2_A964TBW16_DATETIME ;
   private long[] T001M2_A965TBW16_STUDY_ID ;
   private short[] T001M2_A966TBW16_CRF_ID ;
   private byte[] T001M2_A967TBW16_CRF_EDA_NO ;
   private String[] T001M2_A969TBW16_CRF_ITEM_GRP_CD ;
   private int[] T001M2_A968TBW16_VISIT_NO ;
   private boolean[] T001M2_n968TBW16_VISIT_NO ;
   private String[] T001M2_A970TBW16_DOM_CD ;
   private boolean[] T001M2_n970TBW16_DOM_CD ;
   private String[] T001M2_A971TBW16_DOM_VAR_NM ;
   private boolean[] T001M2_n971TBW16_DOM_VAR_NM ;
   private String[] T001M2_A972TBW16_DOM_ITM_GRP_OID ;
   private boolean[] T001M2_n972TBW16_DOM_ITM_GRP_OID ;
   private short[] T001M2_A973TBW16_DOM_ITM_GRP_ATTR_SEQ ;
   private boolean[] T001M2_n973TBW16_DOM_ITM_GRP_ATTR_SEQ ;
   private short[] T001M2_A974TBW16_DOM_ITM_GRP_ROWNO ;
   private boolean[] T001M2_n974TBW16_DOM_ITM_GRP_ROWNO ;
   private String[] T001M11_A963TBW16_SESSION_ID ;
   private java.util.Date[] T001M11_A964TBW16_DATETIME ;
   private long[] T001M11_A965TBW16_STUDY_ID ;
   private short[] T001M11_A966TBW16_CRF_ID ;
   private byte[] T001M11_A967TBW16_CRF_EDA_NO ;
   private String[] T001M11_A969TBW16_CRF_ITEM_GRP_CD ;
}

final  class tbw16_dom_map_visit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001M2", "SELECT `TBW16_SESSION_ID`, `TBW16_DATETIME`, `TBW16_STUDY_ID`, `TBW16_CRF_ID`, `TBW16_CRF_EDA_NO`, `TBW16_CRF_ITEM_GRP_CD`, `TBW16_VISIT_NO`, `TBW16_DOM_CD`, `TBW16_DOM_VAR_NM`, `TBW16_DOM_ITM_GRP_OID`, `TBW16_DOM_ITM_GRP_ATTR_SEQ`, `TBW16_DOM_ITM_GRP_ROWNO` FROM `TBW16_DOM_MAP_VISIT` WHERE `TBW16_SESSION_ID` = ? AND `TBW16_DATETIME` = ? AND `TBW16_STUDY_ID` = ? AND `TBW16_CRF_ID` = ? AND `TBW16_CRF_EDA_NO` = ? AND `TBW16_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001M3", "SELECT `TBW16_SESSION_ID`, `TBW16_DATETIME`, `TBW16_STUDY_ID`, `TBW16_CRF_ID`, `TBW16_CRF_EDA_NO`, `TBW16_CRF_ITEM_GRP_CD`, `TBW16_VISIT_NO`, `TBW16_DOM_CD`, `TBW16_DOM_VAR_NM`, `TBW16_DOM_ITM_GRP_OID`, `TBW16_DOM_ITM_GRP_ATTR_SEQ`, `TBW16_DOM_ITM_GRP_ROWNO` FROM `TBW16_DOM_MAP_VISIT` WHERE `TBW16_SESSION_ID` = ? AND `TBW16_DATETIME` = ? AND `TBW16_STUDY_ID` = ? AND `TBW16_CRF_ID` = ? AND `TBW16_CRF_EDA_NO` = ? AND `TBW16_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001M4", "SELECT TM1.`TBW16_SESSION_ID`, TM1.`TBW16_DATETIME`, TM1.`TBW16_STUDY_ID`, TM1.`TBW16_CRF_ID`, TM1.`TBW16_CRF_EDA_NO`, TM1.`TBW16_CRF_ITEM_GRP_CD`, TM1.`TBW16_VISIT_NO`, TM1.`TBW16_DOM_CD`, TM1.`TBW16_DOM_VAR_NM`, TM1.`TBW16_DOM_ITM_GRP_OID`, TM1.`TBW16_DOM_ITM_GRP_ATTR_SEQ`, TM1.`TBW16_DOM_ITM_GRP_ROWNO` FROM `TBW16_DOM_MAP_VISIT` TM1 WHERE TM1.`TBW16_SESSION_ID` = ? and TM1.`TBW16_DATETIME` = ? and TM1.`TBW16_STUDY_ID` = ? and TM1.`TBW16_CRF_ID` = ? and TM1.`TBW16_CRF_EDA_NO` = ? and TM1.`TBW16_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBW16_SESSION_ID`, TM1.`TBW16_DATETIME`, TM1.`TBW16_STUDY_ID`, TM1.`TBW16_CRF_ID`, TM1.`TBW16_CRF_EDA_NO`, TM1.`TBW16_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001M5", "SELECT `TBW16_SESSION_ID`, `TBW16_DATETIME`, `TBW16_STUDY_ID`, `TBW16_CRF_ID`, `TBW16_CRF_EDA_NO`, `TBW16_CRF_ITEM_GRP_CD` FROM `TBW16_DOM_MAP_VISIT` WHERE `TBW16_SESSION_ID` = ? AND `TBW16_DATETIME` = ? AND `TBW16_STUDY_ID` = ? AND `TBW16_CRF_ID` = ? AND `TBW16_CRF_EDA_NO` = ? AND `TBW16_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001M6", "SELECT `TBW16_SESSION_ID`, `TBW16_DATETIME`, `TBW16_STUDY_ID`, `TBW16_CRF_ID`, `TBW16_CRF_EDA_NO`, `TBW16_CRF_ITEM_GRP_CD` FROM `TBW16_DOM_MAP_VISIT` WHERE ( `TBW16_SESSION_ID` > ? or `TBW16_SESSION_ID` = ? and `TBW16_DATETIME` > ? or `TBW16_DATETIME` = ? and `TBW16_SESSION_ID` = ? and `TBW16_STUDY_ID` > ? or `TBW16_STUDY_ID` = ? and `TBW16_DATETIME` = ? and `TBW16_SESSION_ID` = ? and `TBW16_CRF_ID` > ? or `TBW16_CRF_ID` = ? and `TBW16_STUDY_ID` = ? and `TBW16_DATETIME` = ? and `TBW16_SESSION_ID` = ? and `TBW16_CRF_EDA_NO` > ? or `TBW16_CRF_EDA_NO` = ? and `TBW16_CRF_ID` = ? and `TBW16_STUDY_ID` = ? and `TBW16_DATETIME` = ? and `TBW16_SESSION_ID` = ? and `TBW16_CRF_ITEM_GRP_CD` > ?) ORDER BY `TBW16_SESSION_ID`, `TBW16_DATETIME`, `TBW16_STUDY_ID`, `TBW16_CRF_ID`, `TBW16_CRF_EDA_NO`, `TBW16_CRF_ITEM_GRP_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001M7", "SELECT `TBW16_SESSION_ID`, `TBW16_DATETIME`, `TBW16_STUDY_ID`, `TBW16_CRF_ID`, `TBW16_CRF_EDA_NO`, `TBW16_CRF_ITEM_GRP_CD` FROM `TBW16_DOM_MAP_VISIT` WHERE ( `TBW16_SESSION_ID` < ? or `TBW16_SESSION_ID` = ? and `TBW16_DATETIME` < ? or `TBW16_DATETIME` = ? and `TBW16_SESSION_ID` = ? and `TBW16_STUDY_ID` < ? or `TBW16_STUDY_ID` = ? and `TBW16_DATETIME` = ? and `TBW16_SESSION_ID` = ? and `TBW16_CRF_ID` < ? or `TBW16_CRF_ID` = ? and `TBW16_STUDY_ID` = ? and `TBW16_DATETIME` = ? and `TBW16_SESSION_ID` = ? and `TBW16_CRF_EDA_NO` < ? or `TBW16_CRF_EDA_NO` = ? and `TBW16_CRF_ID` = ? and `TBW16_STUDY_ID` = ? and `TBW16_DATETIME` = ? and `TBW16_SESSION_ID` = ? and `TBW16_CRF_ITEM_GRP_CD` < ?) ORDER BY `TBW16_SESSION_ID` DESC, `TBW16_DATETIME` DESC, `TBW16_STUDY_ID` DESC, `TBW16_CRF_ID` DESC, `TBW16_CRF_EDA_NO` DESC, `TBW16_CRF_ITEM_GRP_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001M8", "INSERT INTO `TBW16_DOM_MAP_VISIT`(`TBW16_SESSION_ID`, `TBW16_DATETIME`, `TBW16_STUDY_ID`, `TBW16_CRF_ID`, `TBW16_CRF_EDA_NO`, `TBW16_CRF_ITEM_GRP_CD`, `TBW16_VISIT_NO`, `TBW16_DOM_CD`, `TBW16_DOM_VAR_NM`, `TBW16_DOM_ITM_GRP_OID`, `TBW16_DOM_ITM_GRP_ATTR_SEQ`, `TBW16_DOM_ITM_GRP_ROWNO`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001M9", "UPDATE `TBW16_DOM_MAP_VISIT` SET `TBW16_VISIT_NO`=?, `TBW16_DOM_CD`=?, `TBW16_DOM_VAR_NM`=?, `TBW16_DOM_ITM_GRP_OID`=?, `TBW16_DOM_ITM_GRP_ATTR_SEQ`=?, `TBW16_DOM_ITM_GRP_ROWNO`=?  WHERE `TBW16_SESSION_ID` = ? AND `TBW16_DATETIME` = ? AND `TBW16_STUDY_ID` = ? AND `TBW16_CRF_ID` = ? AND `TBW16_CRF_EDA_NO` = ? AND `TBW16_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T001M10", "DELETE FROM `TBW16_DOM_MAP_VISIT`  WHERE `TBW16_SESSION_ID` = ? AND `TBW16_DATETIME` = ? AND `TBW16_STUDY_ID` = ? AND `TBW16_CRF_ID` = ? AND `TBW16_CRF_EDA_NO` = ? AND `TBW16_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T001M11", "SELECT `TBW16_SESSION_ID`, `TBW16_DATETIME`, `TBW16_STUDY_ID`, `TBW16_CRF_ID`, `TBW16_CRF_EDA_NO`, `TBW16_CRF_ITEM_GRP_CD` FROM `TBW16_DOM_MAP_VISIT` ORDER BY `TBW16_SESSION_ID`, `TBW16_DATETIME`, `TBW16_STUDY_ID`, `TBW16_CRF_ID`, `TBW16_CRF_EDA_NO`, `TBW16_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((byte[]) buf[4])[0] = rslt.getByte(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((byte[]) buf[4])[0] = rslt.getByte(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((byte[]) buf[4])[0] = rslt.getByte(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((int[]) buf[6])[0] = rslt.getInt(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((short[]) buf[14])[0] = rslt.getShort(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((short[]) buf[16])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((byte[]) buf[4])[0] = rslt.getByte(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((byte[]) buf[4])[0] = rslt.getByte(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((byte[]) buf[4])[0] = rslt.getByte(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               ((byte[]) buf[4])[0] = rslt.getByte(5) ;
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setDateTime(13, (java.util.Date)parms[12], false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setLong(18, ((Number) parms[17]).longValue());
               stmt.setDateTime(19, (java.util.Date)parms[18], false);
               stmt.setVarchar(20, (String)parms[19], 50, false);
               stmt.setVarchar(21, (String)parms[20], 50, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setDateTime(13, (java.util.Date)parms[12], false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setByte(15, ((Number) parms[14]).byteValue());
               stmt.setByte(16, ((Number) parms[15]).byteValue());
               stmt.setShort(17, ((Number) parms[16]).shortValue());
               stmt.setLong(18, ((Number) parms[17]).longValue());
               stmt.setDateTime(19, (java.util.Date)parms[18], false);
               stmt.setVarchar(20, (String)parms[19], 50, false);
               stmt.setVarchar(21, (String)parms[20], 50, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[9], 16);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[13], 50);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[17]).shortValue());
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 16);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 50);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 50);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               stmt.setVarchar(7, (String)parms[12], 50, false);
               stmt.setDateTime(8, (java.util.Date)parms[13], false);
               stmt.setLong(9, ((Number) parms[14]).longValue());
               stmt.setShort(10, ((Number) parms[15]).shortValue());
               stmt.setByte(11, ((Number) parms[16]).byteValue());
               stmt.setVarchar(12, (String)parms[17], 50, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
      }
   }

}

