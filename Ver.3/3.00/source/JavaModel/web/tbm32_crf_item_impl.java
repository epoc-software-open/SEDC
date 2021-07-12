/*
               File: tbm32_crf_item_impl
        Description: CRF項目マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:19:28.93
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm32_crf_item_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM32_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm32_crt_user_id0K19( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM32_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm32_upd_user_id0K19( Gx_mode) ;
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
         Form.getMeta().addItem("description", "CRF項目マスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm32_crf_item_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm32_crf_item_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm32_crf_item_impl.class ));
   }

   public tbm32_crf_item_impl( int remoteHandle ,
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
         wb_table1_2_0K19( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0K19e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0K19( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0K19( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0K19( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0K19e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRF項目マスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM32_CRF_ITEM.htm");
         wb_table3_28_0K19( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0K19e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0K19e( true) ;
      }
      else
      {
         wb_table1_2_0K19e( false) ;
      }
   }

   public void wb_table3_28_0K19( boolean wbgen )
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
         wb_table4_34_0K19( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0K19e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 272,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM32_CRF_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 273,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM32_CRF_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0K19e( true) ;
      }
      else
      {
         wb_table3_28_0K19e( false) ;
      }
   }

   public void wb_table4_34_0K19( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_study_id_Internalname, "試験ID", "", "", lblTextblocktbm32_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A70TBM32_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM32_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A70TBM32_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A70TBM32_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_crf_id_Internalname, "CRFID", "", "", lblTextblocktbm32_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A71TBM32_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBM32_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A71TBM32_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A71TBM32_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_crf_item_cd_Internalname, "CRF項目コード", "", "", lblTextblocktbm32_crf_item_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_CRF_ITEM_CD_Internalname, GXutil.rtrim( A72TBM32_CRF_ITEM_CD), GXutil.rtrim( localUtil.format( A72TBM32_CRF_ITEM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_CRF_ITEM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_CRF_ITEM_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_CD", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_crf_item_nm_Internalname, "CRF項目名", "", "", lblTextblocktbm32_crf_item_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM32_CRF_ITEM_NM_Internalname, GXutil.rtrim( A405TBM32_CRF_ITEM_NM), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", (short)(0), 1, edtTBM32_CRF_ITEM_NM_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, "", "", (byte)(-1), true, "", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_crf_item_div_Internalname, "CRF項目区分", "", "", lblTextblocktbm32_crf_item_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_CRF_ITEM_DIV_Internalname, GXutil.rtrim( A74TBM32_CRF_ITEM_DIV), GXutil.rtrim( localUtil.format( A74TBM32_CRF_ITEM_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_CRF_ITEM_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_CRF_ITEM_DIV_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_crf_item_grp_cd_Internalname, "CRF項目グループコード", "", "", lblTextblocktbm32_crf_item_grp_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_CRF_ITEM_GRP_CD_Internalname, GXutil.rtrim( A73TBM32_CRF_ITEM_GRP_CD), GXutil.rtrim( localUtil.format( A73TBM32_CRF_ITEM_GRP_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_CRF_ITEM_GRP_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_CRF_ITEM_GRP_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_CD", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_crf_item_grp_order_Internalname, "同一項目グループ内結合順", "", "", lblTextblocktbm32_crf_item_grp_order_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_CRF_ITEM_GRP_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A507TBM32_CRF_ITEM_GRP_ORDER, (byte)(3), (byte)(0), ".", "")), ((edtTBM32_CRF_ITEM_GRP_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A507TBM32_CRF_ITEM_GRP_ORDER), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A507TBM32_CRF_ITEM_GRP_ORDER), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_CRF_ITEM_GRP_ORDER_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_CRF_ITEM_GRP_ORDER_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_location_x_Internalname, "開始座標X", "", "", lblTextblocktbm32_location_x_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_LOCATION_X_Internalname, GXutil.ltrim( localUtil.ntoc( A508TBM32_LOCATION_X, (byte)(4), (byte)(0), ".", "")), ((edtTBM32_LOCATION_X_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A508TBM32_LOCATION_X), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A508TBM32_LOCATION_X), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_LOCATION_X_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_LOCATION_X_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_location_y_Internalname, "開始座標Y", "", "", lblTextblocktbm32_location_y_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_LOCATION_Y_Internalname, GXutil.ltrim( localUtil.ntoc( A509TBM32_LOCATION_Y, (byte)(4), (byte)(0), ".", "")), ((edtTBM32_LOCATION_Y_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A509TBM32_LOCATION_Y), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A509TBM32_LOCATION_Y), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_LOCATION_Y_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_LOCATION_Y_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_location_x2_Internalname, "終了座標X", "", "", lblTextblocktbm32_location_x2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_LOCATION_X2_Internalname, GXutil.ltrim( localUtil.ntoc( A510TBM32_LOCATION_X2, (byte)(4), (byte)(0), ".", "")), ((edtTBM32_LOCATION_X2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A510TBM32_LOCATION_X2), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A510TBM32_LOCATION_X2), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_LOCATION_X2_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_LOCATION_X2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_location_y2_Internalname, "終了座標Y", "", "", lblTextblocktbm32_location_y2_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_LOCATION_Y2_Internalname, GXutil.ltrim( localUtil.ntoc( A511TBM32_LOCATION_Y2, (byte)(4), (byte)(0), ".", "")), ((edtTBM32_LOCATION_Y2_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A511TBM32_LOCATION_Y2), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A511TBM32_LOCATION_Y2), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_LOCATION_Y2_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_LOCATION_Y2_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_text_align_div_Internalname, "テキスト位置区分", "", "", lblTextblocktbm32_text_align_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_TEXT_ALIGN_DIV_Internalname, GXutil.rtrim( A512TBM32_TEXT_ALIGN_DIV), GXutil.rtrim( localUtil.format( A512TBM32_TEXT_ALIGN_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_TEXT_ALIGN_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_TEXT_ALIGN_DIV_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_text_maxrows_Internalname, "テキスト最大行数", "", "", lblTextblocktbm32_text_maxrows_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_TEXT_MAXROWS_Internalname, GXutil.ltrim( localUtil.ntoc( A516TBM32_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")), ((edtTBM32_TEXT_MAXROWS_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A516TBM32_TEXT_MAXROWS), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A516TBM32_TEXT_MAXROWS), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_TEXT_MAXROWS_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_TEXT_MAXROWS_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_text_maxlength_Internalname, "テキスト最大文字数", "", "", lblTextblocktbm32_text_maxlength_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_TEXT_MAXLENGTH_Internalname, GXutil.ltrim( localUtil.ntoc( A517TBM32_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")), ((edtTBM32_TEXT_MAXLENGTH_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A517TBM32_TEXT_MAXLENGTH), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A517TBM32_TEXT_MAXLENGTH), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_TEXT_MAXLENGTH_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_TEXT_MAXLENGTH_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_decimal_digits_Internalname, "小数点以下桁数", "", "", lblTextblocktbm32_decimal_digits_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_DECIMAL_DIGITS_Internalname, GXutil.ltrim( localUtil.ntoc( A518TBM32_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")), ((edtTBM32_DECIMAL_DIGITS_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A518TBM32_DECIMAL_DIGITS), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A518TBM32_DECIMAL_DIGITS), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_DECIMAL_DIGITS_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_DECIMAL_DIGITS_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_chk_true_inner_value_Internalname, "チェックボックス・ラジオtrue時内部値", "", "", lblTextblocktbm32_chk_true_inner_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_CHK_TRUE_INNER_VALUE_Internalname, GXutil.rtrim( A522TBM32_CHK_TRUE_INNER_VALUE), GXutil.rtrim( localUtil.format( A522TBM32_CHK_TRUE_INNER_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_CHK_TRUE_INNER_VALUE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_CHK_TRUE_INNER_VALUE_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_chk_false_inner_value_Internalname, "チェックボックスfalse時内部値", "", "", lblTextblocktbm32_chk_false_inner_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_CHK_FALSE_INNER_VALUE_Internalname, GXutil.rtrim( A523TBM32_CHK_FALSE_INNER_VALUE), GXutil.rtrim( localUtil.format( A523TBM32_CHK_FALSE_INNER_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_CHK_FALSE_INNER_VALUE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_CHK_FALSE_INNER_VALUE_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_fixed_value_Internalname, "固定値", "", "", lblTextblocktbm32_fixed_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_FIXED_VALUE_Internalname, GXutil.rtrim( A527TBM32_FIXED_VALUE), GXutil.rtrim( localUtil.format( A527TBM32_FIXED_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_FIXED_VALUE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_FIXED_VALUE_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_list_cd_Internalname, "選択リストコード", "", "", lblTextblocktbm32_list_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_LIST_CD_Internalname, GXutil.rtrim( A525TBM32_LIST_CD), GXutil.rtrim( localUtil.format( A525TBM32_LIST_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_LIST_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_LIST_CD_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_image_cd_Internalname, "画像コード", "", "", lblTextblocktbm32_image_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_IMAGE_CD_Internalname, GXutil.rtrim( A526TBM32_IMAGE_CD), GXutil.rtrim( localUtil.format( A526TBM32_IMAGE_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_IMAGE_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_IMAGE_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_text_Internalname, "表示テキスト", "", "", lblTextblocktbm32_text_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM32_TEXT_Internalname, GXutil.rtrim( A524TBM32_TEXT), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(139);\"", (short)(0), 1, edtTBM32_TEXT_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "", "200", -1, "", "", (byte)(-1), true, "", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_font_size_Internalname, "フォントサイズ", "", "", lblTextblocktbm32_font_size_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_FONT_SIZE_Internalname, GXutil.ltrim( localUtil.ntoc( A513TBM32_FONT_SIZE, (byte)(2), (byte)(0), ".", "")), ((edtTBM32_FONT_SIZE_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A513TBM32_FONT_SIZE), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A513TBM32_FONT_SIZE), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_FONT_SIZE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_FONT_SIZE_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_font_ul_flg_Internalname, "フォントアンダーラインフラグ", "", "", lblTextblocktbm32_font_ul_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_FONT_UL_FLG_Internalname, GXutil.rtrim( A514TBM32_FONT_UL_FLG), GXutil.rtrim( localUtil.format( A514TBM32_FONT_UL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_FONT_UL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_FONT_UL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_font_color_div_Internalname, "フォントカラー", "", "", lblTextblocktbm32_font_color_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_FONT_COLOR_DIV_Internalname, GXutil.ltrim( localUtil.ntoc( A515TBM32_FONT_COLOR_DIV, (byte)(10), (byte)(0), ".", "")), ((edtTBM32_FONT_COLOR_DIV_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A515TBM32_FONT_COLOR_DIV), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A515TBM32_FONT_COLOR_DIV), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_FONT_COLOR_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_FONT_COLOR_DIV_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_line_size_div_Internalname, "ライン太さ", "", "", lblTextblocktbm32_line_size_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_LINE_SIZE_DIV_Internalname, GXutil.ltrim( localUtil.ntoc( A521TBM32_LINE_SIZE_DIV, (byte)(2), (byte)(0), ".", "")), ((edtTBM32_LINE_SIZE_DIV_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A521TBM32_LINE_SIZE_DIV), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A521TBM32_LINE_SIZE_DIV), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_LINE_SIZE_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_LINE_SIZE_DIV_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_line_color_div_Internalname, "ラインカラー", "", "", lblTextblocktbm32_line_color_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_LINE_COLOR_DIV_Internalname, GXutil.ltrim( localUtil.ntoc( A689TBM32_LINE_COLOR_DIV, (byte)(10), (byte)(0), ".", "")), ((edtTBM32_LINE_COLOR_DIV_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A689TBM32_LINE_COLOR_DIV), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A689TBM32_LINE_COLOR_DIV), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_LINE_COLOR_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_LINE_COLOR_DIV_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_line_start_point_div_Internalname, "ライン開始点スタイル区分", "", "", lblTextblocktbm32_line_start_point_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_LINE_START_POINT_DIV_Internalname, GXutil.rtrim( A519TBM32_LINE_START_POINT_DIV), GXutil.rtrim( localUtil.format( A519TBM32_LINE_START_POINT_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_LINE_START_POINT_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_LINE_START_POINT_DIV_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_line_end_point_div_Internalname, "ライン終了点スタイル区分", "", "", lblTextblocktbm32_line_end_point_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_LINE_END_POINT_DIV_Internalname, GXutil.rtrim( A520TBM32_LINE_END_POINT_DIV), GXutil.rtrim( localUtil.format( A520TBM32_LINE_END_POINT_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_LINE_END_POINT_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_LINE_END_POINT_DIV_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_line_angle_Internalname, "ライン角度", "", "", lblTextblocktbm32_line_angle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_LINE_ANGLE_Internalname, GXutil.ltrim( localUtil.ntoc( A690TBM32_LINE_ANGLE, (byte)(4), (byte)(0), ".", "")), ((edtTBM32_LINE_ANGLE_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A690TBM32_LINE_ANGLE), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A690TBM32_LINE_ANGLE), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_LINE_ANGLE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_LINE_ANGLE_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_auth_lvl_min_Internalname, "最低入力権限レベル", "", "", lblTextblocktbm32_auth_lvl_min_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_AUTH_LVL_MIN_Internalname, GXutil.ltrim( localUtil.ntoc( A644TBM32_AUTH_LVL_MIN, (byte)(2), (byte)(0), ".", "")), ((edtTBM32_AUTH_LVL_MIN_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A644TBM32_AUTH_LVL_MIN), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A644TBM32_AUTH_LVL_MIN), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_AUTH_LVL_MIN_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_AUTH_LVL_MIN_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_zorder_Internalname, "重なり順", "", "", lblTextblocktbm32_zorder_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_ZORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A645TBM32_ZORDER, (byte)(3), (byte)(0), ".", "")), ((edtTBM32_ZORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A645TBM32_ZORDER), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A645TBM32_ZORDER), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_ZORDER_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_ZORDER_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_tab_order_Internalname, "タブ移動順", "", "", lblTextblocktbm32_tab_order_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_TAB_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A691TBM32_TAB_ORDER, (byte)(3), (byte)(0), ".", "")), ((edtTBM32_TAB_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A691TBM32_TAB_ORDER), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A691TBM32_TAB_ORDER), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_TAB_ORDER_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_TAB_ORDER_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_tabstop_flg_Internalname, "タブストップフラグ", "", "", lblTextblocktbm32_tabstop_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_TABSTOP_FLG_Internalname, GXutil.rtrim( A692TBM32_TABSTOP_FLG), GXutil.rtrim( localUtil.format( A692TBM32_TABSTOP_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_TABSTOP_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_TABSTOP_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_required_input_flg_Internalname, "必須入力フラグ", "", "", lblTextblocktbm32_required_input_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_REQUIRED_INPUT_FLG_Internalname, GXutil.rtrim( A693TBM32_REQUIRED_INPUT_FLG), GXutil.rtrim( localUtil.format( A693TBM32_REQUIRED_INPUT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_REQUIRED_INPUT_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_REQUIRED_INPUT_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_min_value_Internalname, "入力下限値", "", "", lblTextblocktbm32_min_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_MIN_VALUE_Internalname, GXutil.rtrim( A694TBM32_MIN_VALUE), GXutil.rtrim( localUtil.format( A694TBM32_MIN_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_MIN_VALUE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_MIN_VALUE_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_max_value_Internalname, "入力上限値", "", "", lblTextblocktbm32_max_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 214,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_MAX_VALUE_Internalname, GXutil.rtrim( A695TBM32_MAX_VALUE), GXutil.rtrim( localUtil.format( A695TBM32_MAX_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(214);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_MAX_VALUE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_MAX_VALUE_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_crf_item_note_Internalname, "備考", "", "", lblTextblocktbm32_crf_item_note_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 219,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM32_CRF_ITEM_NOTE_Internalname, GXutil.rtrim( A406TBM32_CRF_ITEM_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(219);\"", (short)(0), 1, edtTBM32_CRF_ITEM_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_ref_crf_id_Internalname, "CRFID", "", "", lblTextblocktbm32_ref_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 224,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_REF_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A774TBM32_REF_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBM32_REF_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A774TBM32_REF_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A774TBM32_REF_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(224);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_REF_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_REF_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_ref_crf_item_cd_Internalname, "CRF項目コード", "", "", lblTextblocktbm32_ref_crf_item_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_REF_CRF_ITEM_CD_Internalname, GXutil.rtrim( A775TBM32_REF_CRF_ITEM_CD), GXutil.rtrim( localUtil.format( A775TBM32_REF_CRF_ITEM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_REF_CRF_ITEM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_REF_CRF_ITEM_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_CD", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm32_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 234,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_DEL_FLG_Internalname, GXutil.rtrim( A75TBM32_DEL_FLG), GXutil.rtrim( localUtil.format( A75TBM32_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(234);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm32_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 239,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM32_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_CRT_DATETIME_Internalname, localUtil.format(A407TBM32_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A407TBM32_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(239);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM32_CRF_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM32_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM32_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm32_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 244,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_CRT_USER_ID_Internalname, GXutil.rtrim( A408TBM32_CRT_USER_ID), GXutil.rtrim( localUtil.format( A408TBM32_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(244);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm32_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 249,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_CRT_PROG_NM_Internalname, GXutil.rtrim( A409TBM32_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A409TBM32_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(249);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm32_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 254,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM32_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_UPD_DATETIME_Internalname, localUtil.format(A410TBM32_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A410TBM32_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(254);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM32_CRF_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM32_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM32_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm32_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 259,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_UPD_USER_ID_Internalname, GXutil.rtrim( A411TBM32_UPD_USER_ID), GXutil.rtrim( localUtil.format( A411TBM32_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(259);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm32_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 264,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_UPD_PROG_NM_Internalname, GXutil.rtrim( A412TBM32_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A412TBM32_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(264);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm32_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm32_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 269,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM32_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A413TBM32_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM32_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A413TBM32_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A413TBM32_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(269);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM32_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM32_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM32_CRF_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0K19e( true) ;
      }
      else
      {
         wb_table4_34_0K19e( false) ;
      }
   }

   public void wb_table2_5_0K19( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM32_CRF_ITEM.htm");
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
         wb_table2_5_0K19e( true) ;
      }
      else
      {
         wb_table2_5_0K19e( false) ;
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
      /* Execute user event: e110K2 */
      e110K2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A70TBM32_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
            }
            else
            {
               A70TBM32_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM32_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A71TBM32_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
            }
            else
            {
               A71TBM32_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM32_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
            }
            A72TBM32_CRF_ITEM_CD = httpContext.cgiGet( edtTBM32_CRF_ITEM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A72TBM32_CRF_ITEM_CD", A72TBM32_CRF_ITEM_CD);
            A405TBM32_CRF_ITEM_NM = httpContext.cgiGet( edtTBM32_CRF_ITEM_NM_Internalname) ;
            n405TBM32_CRF_ITEM_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A405TBM32_CRF_ITEM_NM", A405TBM32_CRF_ITEM_NM);
            n405TBM32_CRF_ITEM_NM = ((GXutil.strcmp("", A405TBM32_CRF_ITEM_NM)==0) ? true : false) ;
            A74TBM32_CRF_ITEM_DIV = httpContext.cgiGet( edtTBM32_CRF_ITEM_DIV_Internalname) ;
            n74TBM32_CRF_ITEM_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A74TBM32_CRF_ITEM_DIV", A74TBM32_CRF_ITEM_DIV);
            n74TBM32_CRF_ITEM_DIV = ((GXutil.strcmp("", A74TBM32_CRF_ITEM_DIV)==0) ? true : false) ;
            A73TBM32_CRF_ITEM_GRP_CD = httpContext.cgiGet( edtTBM32_CRF_ITEM_GRP_CD_Internalname) ;
            n73TBM32_CRF_ITEM_GRP_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A73TBM32_CRF_ITEM_GRP_CD", A73TBM32_CRF_ITEM_GRP_CD);
            n73TBM32_CRF_ITEM_GRP_CD = ((GXutil.strcmp("", A73TBM32_CRF_ITEM_GRP_CD)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_CRF_ITEM_GRP_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_CRF_ITEM_GRP_ORDER_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_CRF_ITEM_GRP_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_CRF_ITEM_GRP_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A507TBM32_CRF_ITEM_GRP_ORDER = (short)(0) ;
               n507TBM32_CRF_ITEM_GRP_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A507TBM32_CRF_ITEM_GRP_ORDER", GXutil.ltrim( GXutil.str( A507TBM32_CRF_ITEM_GRP_ORDER, 3, 0)));
            }
            else
            {
               A507TBM32_CRF_ITEM_GRP_ORDER = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM32_CRF_ITEM_GRP_ORDER_Internalname), ".", ",")) ;
               n507TBM32_CRF_ITEM_GRP_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A507TBM32_CRF_ITEM_GRP_ORDER", GXutil.ltrim( GXutil.str( A507TBM32_CRF_ITEM_GRP_ORDER, 3, 0)));
            }
            n507TBM32_CRF_ITEM_GRP_ORDER = ((0==A507TBM32_CRF_ITEM_GRP_ORDER) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_X_Internalname), ".", ",") < -999 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_X_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_LOCATION_X");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_LOCATION_X_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A508TBM32_LOCATION_X = (short)(0) ;
               n508TBM32_LOCATION_X = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A508TBM32_LOCATION_X", GXutil.ltrim( GXutil.str( A508TBM32_LOCATION_X, 4, 0)));
            }
            else
            {
               A508TBM32_LOCATION_X = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_X_Internalname), ".", ",")) ;
               n508TBM32_LOCATION_X = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A508TBM32_LOCATION_X", GXutil.ltrim( GXutil.str( A508TBM32_LOCATION_X, 4, 0)));
            }
            n508TBM32_LOCATION_X = ((0==A508TBM32_LOCATION_X) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_Y_Internalname), ".", ",") < -999 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_Y_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_LOCATION_Y");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_LOCATION_Y_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A509TBM32_LOCATION_Y = (short)(0) ;
               n509TBM32_LOCATION_Y = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A509TBM32_LOCATION_Y", GXutil.ltrim( GXutil.str( A509TBM32_LOCATION_Y, 4, 0)));
            }
            else
            {
               A509TBM32_LOCATION_Y = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_Y_Internalname), ".", ",")) ;
               n509TBM32_LOCATION_Y = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A509TBM32_LOCATION_Y", GXutil.ltrim( GXutil.str( A509TBM32_LOCATION_Y, 4, 0)));
            }
            n509TBM32_LOCATION_Y = ((0==A509TBM32_LOCATION_Y) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_X2_Internalname), ".", ",") < -999 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_X2_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_LOCATION_X2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_LOCATION_X2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A510TBM32_LOCATION_X2 = (short)(0) ;
               n510TBM32_LOCATION_X2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A510TBM32_LOCATION_X2", GXutil.ltrim( GXutil.str( A510TBM32_LOCATION_X2, 4, 0)));
            }
            else
            {
               A510TBM32_LOCATION_X2 = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_X2_Internalname), ".", ",")) ;
               n510TBM32_LOCATION_X2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A510TBM32_LOCATION_X2", GXutil.ltrim( GXutil.str( A510TBM32_LOCATION_X2, 4, 0)));
            }
            n510TBM32_LOCATION_X2 = ((0==A510TBM32_LOCATION_X2) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_Y2_Internalname), ".", ",") < -999 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_Y2_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_LOCATION_Y2");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_LOCATION_Y2_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A511TBM32_LOCATION_Y2 = (short)(0) ;
               n511TBM32_LOCATION_Y2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A511TBM32_LOCATION_Y2", GXutil.ltrim( GXutil.str( A511TBM32_LOCATION_Y2, 4, 0)));
            }
            else
            {
               A511TBM32_LOCATION_Y2 = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM32_LOCATION_Y2_Internalname), ".", ",")) ;
               n511TBM32_LOCATION_Y2 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A511TBM32_LOCATION_Y2", GXutil.ltrim( GXutil.str( A511TBM32_LOCATION_Y2, 4, 0)));
            }
            n511TBM32_LOCATION_Y2 = ((0==A511TBM32_LOCATION_Y2) ? true : false) ;
            A512TBM32_TEXT_ALIGN_DIV = httpContext.cgiGet( edtTBM32_TEXT_ALIGN_DIV_Internalname) ;
            n512TBM32_TEXT_ALIGN_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A512TBM32_TEXT_ALIGN_DIV", A512TBM32_TEXT_ALIGN_DIV);
            n512TBM32_TEXT_ALIGN_DIV = ((GXutil.strcmp("", A512TBM32_TEXT_ALIGN_DIV)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_TEXT_MAXROWS_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_TEXT_MAXROWS_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_TEXT_MAXROWS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_TEXT_MAXROWS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A516TBM32_TEXT_MAXROWS = (byte)(0) ;
               n516TBM32_TEXT_MAXROWS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A516TBM32_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A516TBM32_TEXT_MAXROWS, 2, 0)));
            }
            else
            {
               A516TBM32_TEXT_MAXROWS = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM32_TEXT_MAXROWS_Internalname), ".", ",")) ;
               n516TBM32_TEXT_MAXROWS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A516TBM32_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A516TBM32_TEXT_MAXROWS, 2, 0)));
            }
            n516TBM32_TEXT_MAXROWS = ((0==A516TBM32_TEXT_MAXROWS) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_TEXT_MAXLENGTH_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_TEXT_MAXLENGTH_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_TEXT_MAXLENGTH");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_TEXT_MAXLENGTH_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A517TBM32_TEXT_MAXLENGTH = (short)(0) ;
               n517TBM32_TEXT_MAXLENGTH = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A517TBM32_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A517TBM32_TEXT_MAXLENGTH, 3, 0)));
            }
            else
            {
               A517TBM32_TEXT_MAXLENGTH = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM32_TEXT_MAXLENGTH_Internalname), ".", ",")) ;
               n517TBM32_TEXT_MAXLENGTH = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A517TBM32_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A517TBM32_TEXT_MAXLENGTH, 3, 0)));
            }
            n517TBM32_TEXT_MAXLENGTH = ((0==A517TBM32_TEXT_MAXLENGTH) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_DECIMAL_DIGITS_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_DECIMAL_DIGITS_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_DECIMAL_DIGITS");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_DECIMAL_DIGITS_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A518TBM32_DECIMAL_DIGITS = (byte)(0) ;
               n518TBM32_DECIMAL_DIGITS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A518TBM32_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A518TBM32_DECIMAL_DIGITS, 2, 0)));
            }
            else
            {
               A518TBM32_DECIMAL_DIGITS = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM32_DECIMAL_DIGITS_Internalname), ".", ",")) ;
               n518TBM32_DECIMAL_DIGITS = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A518TBM32_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A518TBM32_DECIMAL_DIGITS, 2, 0)));
            }
            n518TBM32_DECIMAL_DIGITS = ((0==A518TBM32_DECIMAL_DIGITS) ? true : false) ;
            A522TBM32_CHK_TRUE_INNER_VALUE = httpContext.cgiGet( edtTBM32_CHK_TRUE_INNER_VALUE_Internalname) ;
            n522TBM32_CHK_TRUE_INNER_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A522TBM32_CHK_TRUE_INNER_VALUE", A522TBM32_CHK_TRUE_INNER_VALUE);
            n522TBM32_CHK_TRUE_INNER_VALUE = ((GXutil.strcmp("", A522TBM32_CHK_TRUE_INNER_VALUE)==0) ? true : false) ;
            A523TBM32_CHK_FALSE_INNER_VALUE = httpContext.cgiGet( edtTBM32_CHK_FALSE_INNER_VALUE_Internalname) ;
            n523TBM32_CHK_FALSE_INNER_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A523TBM32_CHK_FALSE_INNER_VALUE", A523TBM32_CHK_FALSE_INNER_VALUE);
            n523TBM32_CHK_FALSE_INNER_VALUE = ((GXutil.strcmp("", A523TBM32_CHK_FALSE_INNER_VALUE)==0) ? true : false) ;
            A527TBM32_FIXED_VALUE = httpContext.cgiGet( edtTBM32_FIXED_VALUE_Internalname) ;
            n527TBM32_FIXED_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A527TBM32_FIXED_VALUE", A527TBM32_FIXED_VALUE);
            n527TBM32_FIXED_VALUE = ((GXutil.strcmp("", A527TBM32_FIXED_VALUE)==0) ? true : false) ;
            A525TBM32_LIST_CD = httpContext.cgiGet( edtTBM32_LIST_CD_Internalname) ;
            n525TBM32_LIST_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A525TBM32_LIST_CD", A525TBM32_LIST_CD);
            n525TBM32_LIST_CD = ((GXutil.strcmp("", A525TBM32_LIST_CD)==0) ? true : false) ;
            A526TBM32_IMAGE_CD = httpContext.cgiGet( edtTBM32_IMAGE_CD_Internalname) ;
            n526TBM32_IMAGE_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A526TBM32_IMAGE_CD", A526TBM32_IMAGE_CD);
            n526TBM32_IMAGE_CD = ((GXutil.strcmp("", A526TBM32_IMAGE_CD)==0) ? true : false) ;
            A524TBM32_TEXT = httpContext.cgiGet( edtTBM32_TEXT_Internalname) ;
            n524TBM32_TEXT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A524TBM32_TEXT", A524TBM32_TEXT);
            n524TBM32_TEXT = ((GXutil.strcmp("", A524TBM32_TEXT)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_FONT_SIZE_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_FONT_SIZE_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_FONT_SIZE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_FONT_SIZE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A513TBM32_FONT_SIZE = (byte)(0) ;
               n513TBM32_FONT_SIZE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A513TBM32_FONT_SIZE", GXutil.ltrim( GXutil.str( A513TBM32_FONT_SIZE, 2, 0)));
            }
            else
            {
               A513TBM32_FONT_SIZE = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM32_FONT_SIZE_Internalname), ".", ",")) ;
               n513TBM32_FONT_SIZE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A513TBM32_FONT_SIZE", GXutil.ltrim( GXutil.str( A513TBM32_FONT_SIZE, 2, 0)));
            }
            n513TBM32_FONT_SIZE = ((0==A513TBM32_FONT_SIZE) ? true : false) ;
            A514TBM32_FONT_UL_FLG = httpContext.cgiGet( edtTBM32_FONT_UL_FLG_Internalname) ;
            n514TBM32_FONT_UL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A514TBM32_FONT_UL_FLG", A514TBM32_FONT_UL_FLG);
            n514TBM32_FONT_UL_FLG = ((GXutil.strcmp("", A514TBM32_FONT_UL_FLG)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_FONT_COLOR_DIV_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_FONT_COLOR_DIV_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_FONT_COLOR_DIV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_FONT_COLOR_DIV_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A515TBM32_FONT_COLOR_DIV = 0 ;
               n515TBM32_FONT_COLOR_DIV = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A515TBM32_FONT_COLOR_DIV", GXutil.ltrim( GXutil.str( A515TBM32_FONT_COLOR_DIV, 10, 0)));
            }
            else
            {
               A515TBM32_FONT_COLOR_DIV = localUtil.ctol( httpContext.cgiGet( edtTBM32_FONT_COLOR_DIV_Internalname), ".", ",") ;
               n515TBM32_FONT_COLOR_DIV = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A515TBM32_FONT_COLOR_DIV", GXutil.ltrim( GXutil.str( A515TBM32_FONT_COLOR_DIV, 10, 0)));
            }
            n515TBM32_FONT_COLOR_DIV = ((0==A515TBM32_FONT_COLOR_DIV) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LINE_SIZE_DIV_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LINE_SIZE_DIV_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_LINE_SIZE_DIV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_LINE_SIZE_DIV_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A521TBM32_LINE_SIZE_DIV = (byte)(0) ;
               n521TBM32_LINE_SIZE_DIV = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A521TBM32_LINE_SIZE_DIV", GXutil.ltrim( GXutil.str( A521TBM32_LINE_SIZE_DIV, 2, 0)));
            }
            else
            {
               A521TBM32_LINE_SIZE_DIV = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM32_LINE_SIZE_DIV_Internalname), ".", ",")) ;
               n521TBM32_LINE_SIZE_DIV = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A521TBM32_LINE_SIZE_DIV", GXutil.ltrim( GXutil.str( A521TBM32_LINE_SIZE_DIV, 2, 0)));
            }
            n521TBM32_LINE_SIZE_DIV = ((0==A521TBM32_LINE_SIZE_DIV) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LINE_COLOR_DIV_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LINE_COLOR_DIV_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_LINE_COLOR_DIV");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_LINE_COLOR_DIV_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A689TBM32_LINE_COLOR_DIV = 0 ;
               n689TBM32_LINE_COLOR_DIV = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A689TBM32_LINE_COLOR_DIV", GXutil.ltrim( GXutil.str( A689TBM32_LINE_COLOR_DIV, 10, 0)));
            }
            else
            {
               A689TBM32_LINE_COLOR_DIV = localUtil.ctol( httpContext.cgiGet( edtTBM32_LINE_COLOR_DIV_Internalname), ".", ",") ;
               n689TBM32_LINE_COLOR_DIV = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A689TBM32_LINE_COLOR_DIV", GXutil.ltrim( GXutil.str( A689TBM32_LINE_COLOR_DIV, 10, 0)));
            }
            n689TBM32_LINE_COLOR_DIV = ((0==A689TBM32_LINE_COLOR_DIV) ? true : false) ;
            A519TBM32_LINE_START_POINT_DIV = httpContext.cgiGet( edtTBM32_LINE_START_POINT_DIV_Internalname) ;
            n519TBM32_LINE_START_POINT_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A519TBM32_LINE_START_POINT_DIV", A519TBM32_LINE_START_POINT_DIV);
            n519TBM32_LINE_START_POINT_DIV = ((GXutil.strcmp("", A519TBM32_LINE_START_POINT_DIV)==0) ? true : false) ;
            A520TBM32_LINE_END_POINT_DIV = httpContext.cgiGet( edtTBM32_LINE_END_POINT_DIV_Internalname) ;
            n520TBM32_LINE_END_POINT_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A520TBM32_LINE_END_POINT_DIV", A520TBM32_LINE_END_POINT_DIV);
            n520TBM32_LINE_END_POINT_DIV = ((GXutil.strcmp("", A520TBM32_LINE_END_POINT_DIV)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LINE_ANGLE_Internalname), ".", ",") < -999 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_LINE_ANGLE_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_LINE_ANGLE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_LINE_ANGLE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A690TBM32_LINE_ANGLE = (short)(0) ;
               n690TBM32_LINE_ANGLE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A690TBM32_LINE_ANGLE", GXutil.ltrim( GXutil.str( A690TBM32_LINE_ANGLE, 4, 0)));
            }
            else
            {
               A690TBM32_LINE_ANGLE = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM32_LINE_ANGLE_Internalname), ".", ",")) ;
               n690TBM32_LINE_ANGLE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A690TBM32_LINE_ANGLE", GXutil.ltrim( GXutil.str( A690TBM32_LINE_ANGLE, 4, 0)));
            }
            n690TBM32_LINE_ANGLE = ((0==A690TBM32_LINE_ANGLE) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_AUTH_LVL_MIN_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_AUTH_LVL_MIN_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_AUTH_LVL_MIN");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_AUTH_LVL_MIN_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A644TBM32_AUTH_LVL_MIN = (byte)(0) ;
               n644TBM32_AUTH_LVL_MIN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A644TBM32_AUTH_LVL_MIN", GXutil.ltrim( GXutil.str( A644TBM32_AUTH_LVL_MIN, 2, 0)));
            }
            else
            {
               A644TBM32_AUTH_LVL_MIN = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM32_AUTH_LVL_MIN_Internalname), ".", ",")) ;
               n644TBM32_AUTH_LVL_MIN = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A644TBM32_AUTH_LVL_MIN", GXutil.ltrim( GXutil.str( A644TBM32_AUTH_LVL_MIN, 2, 0)));
            }
            n644TBM32_AUTH_LVL_MIN = ((0==A644TBM32_AUTH_LVL_MIN) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_ZORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_ZORDER_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_ZORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_ZORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A645TBM32_ZORDER = (short)(0) ;
               n645TBM32_ZORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A645TBM32_ZORDER", GXutil.ltrim( GXutil.str( A645TBM32_ZORDER, 3, 0)));
            }
            else
            {
               A645TBM32_ZORDER = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM32_ZORDER_Internalname), ".", ",")) ;
               n645TBM32_ZORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A645TBM32_ZORDER", GXutil.ltrim( GXutil.str( A645TBM32_ZORDER, 3, 0)));
            }
            n645TBM32_ZORDER = ((0==A645TBM32_ZORDER) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_TAB_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_TAB_ORDER_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_TAB_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_TAB_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A691TBM32_TAB_ORDER = (short)(0) ;
               n691TBM32_TAB_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A691TBM32_TAB_ORDER", GXutil.ltrim( GXutil.str( A691TBM32_TAB_ORDER, 3, 0)));
            }
            else
            {
               A691TBM32_TAB_ORDER = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM32_TAB_ORDER_Internalname), ".", ",")) ;
               n691TBM32_TAB_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A691TBM32_TAB_ORDER", GXutil.ltrim( GXutil.str( A691TBM32_TAB_ORDER, 3, 0)));
            }
            n691TBM32_TAB_ORDER = ((0==A691TBM32_TAB_ORDER) ? true : false) ;
            A692TBM32_TABSTOP_FLG = httpContext.cgiGet( edtTBM32_TABSTOP_FLG_Internalname) ;
            n692TBM32_TABSTOP_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A692TBM32_TABSTOP_FLG", A692TBM32_TABSTOP_FLG);
            n692TBM32_TABSTOP_FLG = ((GXutil.strcmp("", A692TBM32_TABSTOP_FLG)==0) ? true : false) ;
            A693TBM32_REQUIRED_INPUT_FLG = httpContext.cgiGet( edtTBM32_REQUIRED_INPUT_FLG_Internalname) ;
            n693TBM32_REQUIRED_INPUT_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A693TBM32_REQUIRED_INPUT_FLG", A693TBM32_REQUIRED_INPUT_FLG);
            n693TBM32_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A693TBM32_REQUIRED_INPUT_FLG)==0) ? true : false) ;
            A694TBM32_MIN_VALUE = httpContext.cgiGet( edtTBM32_MIN_VALUE_Internalname) ;
            n694TBM32_MIN_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A694TBM32_MIN_VALUE", A694TBM32_MIN_VALUE);
            n694TBM32_MIN_VALUE = ((GXutil.strcmp("", A694TBM32_MIN_VALUE)==0) ? true : false) ;
            A695TBM32_MAX_VALUE = httpContext.cgiGet( edtTBM32_MAX_VALUE_Internalname) ;
            n695TBM32_MAX_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A695TBM32_MAX_VALUE", A695TBM32_MAX_VALUE);
            n695TBM32_MAX_VALUE = ((GXutil.strcmp("", A695TBM32_MAX_VALUE)==0) ? true : false) ;
            A406TBM32_CRF_ITEM_NOTE = httpContext.cgiGet( edtTBM32_CRF_ITEM_NOTE_Internalname) ;
            n406TBM32_CRF_ITEM_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A406TBM32_CRF_ITEM_NOTE", A406TBM32_CRF_ITEM_NOTE);
            n406TBM32_CRF_ITEM_NOTE = ((GXutil.strcmp("", A406TBM32_CRF_ITEM_NOTE)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_REF_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_REF_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_REF_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_REF_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A774TBM32_REF_CRF_ID = (short)(0) ;
               n774TBM32_REF_CRF_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A774TBM32_REF_CRF_ID", GXutil.ltrim( GXutil.str( A774TBM32_REF_CRF_ID, 4, 0)));
            }
            else
            {
               A774TBM32_REF_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM32_REF_CRF_ID_Internalname), ".", ",")) ;
               n774TBM32_REF_CRF_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A774TBM32_REF_CRF_ID", GXutil.ltrim( GXutil.str( A774TBM32_REF_CRF_ID, 4, 0)));
            }
            n774TBM32_REF_CRF_ID = ((0==A774TBM32_REF_CRF_ID) ? true : false) ;
            A775TBM32_REF_CRF_ITEM_CD = httpContext.cgiGet( edtTBM32_REF_CRF_ITEM_CD_Internalname) ;
            n775TBM32_REF_CRF_ITEM_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A775TBM32_REF_CRF_ITEM_CD", A775TBM32_REF_CRF_ITEM_CD);
            n775TBM32_REF_CRF_ITEM_CD = ((GXutil.strcmp("", A775TBM32_REF_CRF_ITEM_CD)==0) ? true : false) ;
            A75TBM32_DEL_FLG = httpContext.cgiGet( edtTBM32_DEL_FLG_Internalname) ;
            n75TBM32_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A75TBM32_DEL_FLG", A75TBM32_DEL_FLG);
            n75TBM32_DEL_FLG = ((GXutil.strcmp("", A75TBM32_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM32_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM32_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A407TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n407TBM32_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A407TBM32_CRT_DATETIME", localUtil.ttoc( A407TBM32_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A407TBM32_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM32_CRT_DATETIME_Internalname)) ;
               n407TBM32_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A407TBM32_CRT_DATETIME", localUtil.ttoc( A407TBM32_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n407TBM32_CRT_DATETIME = (GXutil.nullDate().equals(A407TBM32_CRT_DATETIME) ? true : false) ;
            A408TBM32_CRT_USER_ID = httpContext.cgiGet( edtTBM32_CRT_USER_ID_Internalname) ;
            n408TBM32_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A408TBM32_CRT_USER_ID", A408TBM32_CRT_USER_ID);
            n408TBM32_CRT_USER_ID = ((GXutil.strcmp("", A408TBM32_CRT_USER_ID)==0) ? true : false) ;
            A409TBM32_CRT_PROG_NM = httpContext.cgiGet( edtTBM32_CRT_PROG_NM_Internalname) ;
            n409TBM32_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A409TBM32_CRT_PROG_NM", A409TBM32_CRT_PROG_NM);
            n409TBM32_CRT_PROG_NM = ((GXutil.strcmp("", A409TBM32_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM32_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM32_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A410TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n410TBM32_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A410TBM32_UPD_DATETIME", localUtil.ttoc( A410TBM32_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A410TBM32_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM32_UPD_DATETIME_Internalname)) ;
               n410TBM32_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A410TBM32_UPD_DATETIME", localUtil.ttoc( A410TBM32_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n410TBM32_UPD_DATETIME = (GXutil.nullDate().equals(A410TBM32_UPD_DATETIME) ? true : false) ;
            A411TBM32_UPD_USER_ID = httpContext.cgiGet( edtTBM32_UPD_USER_ID_Internalname) ;
            n411TBM32_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A411TBM32_UPD_USER_ID", A411TBM32_UPD_USER_ID);
            n411TBM32_UPD_USER_ID = ((GXutil.strcmp("", A411TBM32_UPD_USER_ID)==0) ? true : false) ;
            A412TBM32_UPD_PROG_NM = httpContext.cgiGet( edtTBM32_UPD_PROG_NM_Internalname) ;
            n412TBM32_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A412TBM32_UPD_PROG_NM", A412TBM32_UPD_PROG_NM);
            n412TBM32_UPD_PROG_NM = ((GXutil.strcmp("", A412TBM32_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM32_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM32_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A413TBM32_UPD_CNT = 0 ;
               n413TBM32_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A413TBM32_UPD_CNT", GXutil.ltrim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)));
            }
            else
            {
               A413TBM32_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM32_UPD_CNT_Internalname), ".", ",") ;
               n413TBM32_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A413TBM32_UPD_CNT", GXutil.ltrim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)));
            }
            n413TBM32_UPD_CNT = ((0==A413TBM32_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z70TBM32_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z70TBM32_STUDY_ID"), ".", ",") ;
            Z71TBM32_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z71TBM32_CRF_ID"), ".", ",")) ;
            Z72TBM32_CRF_ITEM_CD = httpContext.cgiGet( "Z72TBM32_CRF_ITEM_CD") ;
            Z407TBM32_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z407TBM32_CRT_DATETIME"), 0) ;
            n407TBM32_CRT_DATETIME = (GXutil.nullDate().equals(A407TBM32_CRT_DATETIME) ? true : false) ;
            Z408TBM32_CRT_USER_ID = httpContext.cgiGet( "Z408TBM32_CRT_USER_ID") ;
            n408TBM32_CRT_USER_ID = ((GXutil.strcmp("", A408TBM32_CRT_USER_ID)==0) ? true : false) ;
            Z410TBM32_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z410TBM32_UPD_DATETIME"), 0) ;
            n410TBM32_UPD_DATETIME = (GXutil.nullDate().equals(A410TBM32_UPD_DATETIME) ? true : false) ;
            Z411TBM32_UPD_USER_ID = httpContext.cgiGet( "Z411TBM32_UPD_USER_ID") ;
            n411TBM32_UPD_USER_ID = ((GXutil.strcmp("", A411TBM32_UPD_USER_ID)==0) ? true : false) ;
            Z413TBM32_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z413TBM32_UPD_CNT"), ".", ",") ;
            n413TBM32_UPD_CNT = ((0==A413TBM32_UPD_CNT) ? true : false) ;
            Z405TBM32_CRF_ITEM_NM = httpContext.cgiGet( "Z405TBM32_CRF_ITEM_NM") ;
            n405TBM32_CRF_ITEM_NM = ((GXutil.strcmp("", A405TBM32_CRF_ITEM_NM)==0) ? true : false) ;
            Z74TBM32_CRF_ITEM_DIV = httpContext.cgiGet( "Z74TBM32_CRF_ITEM_DIV") ;
            n74TBM32_CRF_ITEM_DIV = ((GXutil.strcmp("", A74TBM32_CRF_ITEM_DIV)==0) ? true : false) ;
            Z73TBM32_CRF_ITEM_GRP_CD = httpContext.cgiGet( "Z73TBM32_CRF_ITEM_GRP_CD") ;
            n73TBM32_CRF_ITEM_GRP_CD = ((GXutil.strcmp("", A73TBM32_CRF_ITEM_GRP_CD)==0) ? true : false) ;
            Z507TBM32_CRF_ITEM_GRP_ORDER = (short)(localUtil.ctol( httpContext.cgiGet( "Z507TBM32_CRF_ITEM_GRP_ORDER"), ".", ",")) ;
            n507TBM32_CRF_ITEM_GRP_ORDER = ((0==A507TBM32_CRF_ITEM_GRP_ORDER) ? true : false) ;
            Z508TBM32_LOCATION_X = (short)(localUtil.ctol( httpContext.cgiGet( "Z508TBM32_LOCATION_X"), ".", ",")) ;
            n508TBM32_LOCATION_X = ((0==A508TBM32_LOCATION_X) ? true : false) ;
            Z509TBM32_LOCATION_Y = (short)(localUtil.ctol( httpContext.cgiGet( "Z509TBM32_LOCATION_Y"), ".", ",")) ;
            n509TBM32_LOCATION_Y = ((0==A509TBM32_LOCATION_Y) ? true : false) ;
            Z510TBM32_LOCATION_X2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z510TBM32_LOCATION_X2"), ".", ",")) ;
            n510TBM32_LOCATION_X2 = ((0==A510TBM32_LOCATION_X2) ? true : false) ;
            Z511TBM32_LOCATION_Y2 = (short)(localUtil.ctol( httpContext.cgiGet( "Z511TBM32_LOCATION_Y2"), ".", ",")) ;
            n511TBM32_LOCATION_Y2 = ((0==A511TBM32_LOCATION_Y2) ? true : false) ;
            Z512TBM32_TEXT_ALIGN_DIV = httpContext.cgiGet( "Z512TBM32_TEXT_ALIGN_DIV") ;
            n512TBM32_TEXT_ALIGN_DIV = ((GXutil.strcmp("", A512TBM32_TEXT_ALIGN_DIV)==0) ? true : false) ;
            Z516TBM32_TEXT_MAXROWS = (byte)(localUtil.ctol( httpContext.cgiGet( "Z516TBM32_TEXT_MAXROWS"), ".", ",")) ;
            n516TBM32_TEXT_MAXROWS = ((0==A516TBM32_TEXT_MAXROWS) ? true : false) ;
            Z517TBM32_TEXT_MAXLENGTH = (short)(localUtil.ctol( httpContext.cgiGet( "Z517TBM32_TEXT_MAXLENGTH"), ".", ",")) ;
            n517TBM32_TEXT_MAXLENGTH = ((0==A517TBM32_TEXT_MAXLENGTH) ? true : false) ;
            Z518TBM32_DECIMAL_DIGITS = (byte)(localUtil.ctol( httpContext.cgiGet( "Z518TBM32_DECIMAL_DIGITS"), ".", ",")) ;
            n518TBM32_DECIMAL_DIGITS = ((0==A518TBM32_DECIMAL_DIGITS) ? true : false) ;
            Z522TBM32_CHK_TRUE_INNER_VALUE = httpContext.cgiGet( "Z522TBM32_CHK_TRUE_INNER_VALUE") ;
            n522TBM32_CHK_TRUE_INNER_VALUE = ((GXutil.strcmp("", A522TBM32_CHK_TRUE_INNER_VALUE)==0) ? true : false) ;
            Z523TBM32_CHK_FALSE_INNER_VALUE = httpContext.cgiGet( "Z523TBM32_CHK_FALSE_INNER_VALUE") ;
            n523TBM32_CHK_FALSE_INNER_VALUE = ((GXutil.strcmp("", A523TBM32_CHK_FALSE_INNER_VALUE)==0) ? true : false) ;
            Z527TBM32_FIXED_VALUE = httpContext.cgiGet( "Z527TBM32_FIXED_VALUE") ;
            n527TBM32_FIXED_VALUE = ((GXutil.strcmp("", A527TBM32_FIXED_VALUE)==0) ? true : false) ;
            Z525TBM32_LIST_CD = httpContext.cgiGet( "Z525TBM32_LIST_CD") ;
            n525TBM32_LIST_CD = ((GXutil.strcmp("", A525TBM32_LIST_CD)==0) ? true : false) ;
            Z526TBM32_IMAGE_CD = httpContext.cgiGet( "Z526TBM32_IMAGE_CD") ;
            n526TBM32_IMAGE_CD = ((GXutil.strcmp("", A526TBM32_IMAGE_CD)==0) ? true : false) ;
            Z524TBM32_TEXT = httpContext.cgiGet( "Z524TBM32_TEXT") ;
            n524TBM32_TEXT = ((GXutil.strcmp("", A524TBM32_TEXT)==0) ? true : false) ;
            Z513TBM32_FONT_SIZE = (byte)(localUtil.ctol( httpContext.cgiGet( "Z513TBM32_FONT_SIZE"), ".", ",")) ;
            n513TBM32_FONT_SIZE = ((0==A513TBM32_FONT_SIZE) ? true : false) ;
            Z514TBM32_FONT_UL_FLG = httpContext.cgiGet( "Z514TBM32_FONT_UL_FLG") ;
            n514TBM32_FONT_UL_FLG = ((GXutil.strcmp("", A514TBM32_FONT_UL_FLG)==0) ? true : false) ;
            Z515TBM32_FONT_COLOR_DIV = localUtil.ctol( httpContext.cgiGet( "Z515TBM32_FONT_COLOR_DIV"), ".", ",") ;
            n515TBM32_FONT_COLOR_DIV = ((0==A515TBM32_FONT_COLOR_DIV) ? true : false) ;
            Z521TBM32_LINE_SIZE_DIV = (byte)(localUtil.ctol( httpContext.cgiGet( "Z521TBM32_LINE_SIZE_DIV"), ".", ",")) ;
            n521TBM32_LINE_SIZE_DIV = ((0==A521TBM32_LINE_SIZE_DIV) ? true : false) ;
            Z689TBM32_LINE_COLOR_DIV = localUtil.ctol( httpContext.cgiGet( "Z689TBM32_LINE_COLOR_DIV"), ".", ",") ;
            n689TBM32_LINE_COLOR_DIV = ((0==A689TBM32_LINE_COLOR_DIV) ? true : false) ;
            Z519TBM32_LINE_START_POINT_DIV = httpContext.cgiGet( "Z519TBM32_LINE_START_POINT_DIV") ;
            n519TBM32_LINE_START_POINT_DIV = ((GXutil.strcmp("", A519TBM32_LINE_START_POINT_DIV)==0) ? true : false) ;
            Z520TBM32_LINE_END_POINT_DIV = httpContext.cgiGet( "Z520TBM32_LINE_END_POINT_DIV") ;
            n520TBM32_LINE_END_POINT_DIV = ((GXutil.strcmp("", A520TBM32_LINE_END_POINT_DIV)==0) ? true : false) ;
            Z690TBM32_LINE_ANGLE = (short)(localUtil.ctol( httpContext.cgiGet( "Z690TBM32_LINE_ANGLE"), ".", ",")) ;
            n690TBM32_LINE_ANGLE = ((0==A690TBM32_LINE_ANGLE) ? true : false) ;
            Z644TBM32_AUTH_LVL_MIN = (byte)(localUtil.ctol( httpContext.cgiGet( "Z644TBM32_AUTH_LVL_MIN"), ".", ",")) ;
            n644TBM32_AUTH_LVL_MIN = ((0==A644TBM32_AUTH_LVL_MIN) ? true : false) ;
            Z645TBM32_ZORDER = (short)(localUtil.ctol( httpContext.cgiGet( "Z645TBM32_ZORDER"), ".", ",")) ;
            n645TBM32_ZORDER = ((0==A645TBM32_ZORDER) ? true : false) ;
            Z691TBM32_TAB_ORDER = (short)(localUtil.ctol( httpContext.cgiGet( "Z691TBM32_TAB_ORDER"), ".", ",")) ;
            n691TBM32_TAB_ORDER = ((0==A691TBM32_TAB_ORDER) ? true : false) ;
            Z692TBM32_TABSTOP_FLG = httpContext.cgiGet( "Z692TBM32_TABSTOP_FLG") ;
            n692TBM32_TABSTOP_FLG = ((GXutil.strcmp("", A692TBM32_TABSTOP_FLG)==0) ? true : false) ;
            Z693TBM32_REQUIRED_INPUT_FLG = httpContext.cgiGet( "Z693TBM32_REQUIRED_INPUT_FLG") ;
            n693TBM32_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A693TBM32_REQUIRED_INPUT_FLG)==0) ? true : false) ;
            Z694TBM32_MIN_VALUE = httpContext.cgiGet( "Z694TBM32_MIN_VALUE") ;
            n694TBM32_MIN_VALUE = ((GXutil.strcmp("", A694TBM32_MIN_VALUE)==0) ? true : false) ;
            Z695TBM32_MAX_VALUE = httpContext.cgiGet( "Z695TBM32_MAX_VALUE") ;
            n695TBM32_MAX_VALUE = ((GXutil.strcmp("", A695TBM32_MAX_VALUE)==0) ? true : false) ;
            Z406TBM32_CRF_ITEM_NOTE = httpContext.cgiGet( "Z406TBM32_CRF_ITEM_NOTE") ;
            n406TBM32_CRF_ITEM_NOTE = ((GXutil.strcmp("", A406TBM32_CRF_ITEM_NOTE)==0) ? true : false) ;
            Z774TBM32_REF_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z774TBM32_REF_CRF_ID"), ".", ",")) ;
            n774TBM32_REF_CRF_ID = ((0==A774TBM32_REF_CRF_ID) ? true : false) ;
            Z775TBM32_REF_CRF_ITEM_CD = httpContext.cgiGet( "Z775TBM32_REF_CRF_ITEM_CD") ;
            n775TBM32_REF_CRF_ITEM_CD = ((GXutil.strcmp("", A775TBM32_REF_CRF_ITEM_CD)==0) ? true : false) ;
            Z75TBM32_DEL_FLG = httpContext.cgiGet( "Z75TBM32_DEL_FLG") ;
            n75TBM32_DEL_FLG = ((GXutil.strcmp("", A75TBM32_DEL_FLG)==0) ? true : false) ;
            Z409TBM32_CRT_PROG_NM = httpContext.cgiGet( "Z409TBM32_CRT_PROG_NM") ;
            n409TBM32_CRT_PROG_NM = ((GXutil.strcmp("", A409TBM32_CRT_PROG_NM)==0) ? true : false) ;
            Z412TBM32_UPD_PROG_NM = httpContext.cgiGet( "Z412TBM32_UPD_PROG_NM") ;
            n412TBM32_UPD_PROG_NM = ((GXutil.strcmp("", A412TBM32_UPD_PROG_NM)==0) ? true : false) ;
            O413TBM32_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O413TBM32_UPD_CNT"), ".", ",") ;
            n413TBM32_UPD_CNT = ((0==A413TBM32_UPD_CNT) ? true : false) ;
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
               A70TBM32_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
               A71TBM32_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
               A72TBM32_CRF_ITEM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A72TBM32_CRF_ITEM_CD", A72TBM32_CRF_ITEM_CD);
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
                     /* Execute user event: e110K2 */
                     e110K2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120K2 */
                     e120K2 ();
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
         /* Execute user event: e120K2 */
         e120K2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0K19( ) ;
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
      disableAttributes0K19( ) ;
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

   public void resetCaption0K0( )
   {
   }

   public void e110K2( )
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

   public void e120K2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A71TBM32_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A72TBM32_CRF_ITEM_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A405TBM32_CRF_ITEM_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A74TBM32_CRF_ITEM_DIV + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A73TBM32_CRF_ITEM_GRP_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A507TBM32_CRF_ITEM_GRP_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A508TBM32_LOCATION_X, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A509TBM32_LOCATION_Y, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A510TBM32_LOCATION_X2, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A511TBM32_LOCATION_Y2, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A512TBM32_TEXT_ALIGN_DIV + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A516TBM32_TEXT_MAXROWS, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A517TBM32_TEXT_MAXLENGTH, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A518TBM32_DECIMAL_DIGITS, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A522TBM32_CHK_TRUE_INNER_VALUE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A523TBM32_CHK_FALSE_INNER_VALUE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A527TBM32_FIXED_VALUE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A525TBM32_LIST_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A526TBM32_IMAGE_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A524TBM32_TEXT + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A513TBM32_FONT_SIZE, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A514TBM32_FONT_UL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A515TBM32_FONT_COLOR_DIV, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A521TBM32_LINE_SIZE_DIV, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A689TBM32_LINE_COLOR_DIV, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A519TBM32_LINE_START_POINT_DIV + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A520TBM32_LINE_END_POINT_DIV + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A690TBM32_LINE_ANGLE, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A644TBM32_AUTH_LVL_MIN, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A645TBM32_ZORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A691TBM32_TAB_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A692TBM32_TABSTOP_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A693TBM32_REQUIRED_INPUT_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A694TBM32_MIN_VALUE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A695TBM32_MAX_VALUE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A406TBM32_CRF_ITEM_NOTE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A774TBM32_REF_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A775TBM32_REF_CRF_ITEM_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A75TBM32_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A407TBM32_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm32_crf_item_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A407TBM32_CRT_DATETIME", localUtil.ttoc( A407TBM32_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A408TBM32_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A409TBM32_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A410TBM32_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm32_crf_item_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A410TBM32_UPD_DATETIME", localUtil.ttoc( A410TBM32_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A411TBM32_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A412TBM32_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0K19( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z407TBM32_CRT_DATETIME = T000K3_A407TBM32_CRT_DATETIME[0] ;
            Z408TBM32_CRT_USER_ID = T000K3_A408TBM32_CRT_USER_ID[0] ;
            Z410TBM32_UPD_DATETIME = T000K3_A410TBM32_UPD_DATETIME[0] ;
            Z411TBM32_UPD_USER_ID = T000K3_A411TBM32_UPD_USER_ID[0] ;
            Z413TBM32_UPD_CNT = T000K3_A413TBM32_UPD_CNT[0] ;
            Z405TBM32_CRF_ITEM_NM = T000K3_A405TBM32_CRF_ITEM_NM[0] ;
            Z74TBM32_CRF_ITEM_DIV = T000K3_A74TBM32_CRF_ITEM_DIV[0] ;
            Z73TBM32_CRF_ITEM_GRP_CD = T000K3_A73TBM32_CRF_ITEM_GRP_CD[0] ;
            Z507TBM32_CRF_ITEM_GRP_ORDER = T000K3_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
            Z508TBM32_LOCATION_X = T000K3_A508TBM32_LOCATION_X[0] ;
            Z509TBM32_LOCATION_Y = T000K3_A509TBM32_LOCATION_Y[0] ;
            Z510TBM32_LOCATION_X2 = T000K3_A510TBM32_LOCATION_X2[0] ;
            Z511TBM32_LOCATION_Y2 = T000K3_A511TBM32_LOCATION_Y2[0] ;
            Z512TBM32_TEXT_ALIGN_DIV = T000K3_A512TBM32_TEXT_ALIGN_DIV[0] ;
            Z516TBM32_TEXT_MAXROWS = T000K3_A516TBM32_TEXT_MAXROWS[0] ;
            Z517TBM32_TEXT_MAXLENGTH = T000K3_A517TBM32_TEXT_MAXLENGTH[0] ;
            Z518TBM32_DECIMAL_DIGITS = T000K3_A518TBM32_DECIMAL_DIGITS[0] ;
            Z522TBM32_CHK_TRUE_INNER_VALUE = T000K3_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
            Z523TBM32_CHK_FALSE_INNER_VALUE = T000K3_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
            Z527TBM32_FIXED_VALUE = T000K3_A527TBM32_FIXED_VALUE[0] ;
            Z525TBM32_LIST_CD = T000K3_A525TBM32_LIST_CD[0] ;
            Z526TBM32_IMAGE_CD = T000K3_A526TBM32_IMAGE_CD[0] ;
            Z524TBM32_TEXT = T000K3_A524TBM32_TEXT[0] ;
            Z513TBM32_FONT_SIZE = T000K3_A513TBM32_FONT_SIZE[0] ;
            Z514TBM32_FONT_UL_FLG = T000K3_A514TBM32_FONT_UL_FLG[0] ;
            Z515TBM32_FONT_COLOR_DIV = T000K3_A515TBM32_FONT_COLOR_DIV[0] ;
            Z521TBM32_LINE_SIZE_DIV = T000K3_A521TBM32_LINE_SIZE_DIV[0] ;
            Z689TBM32_LINE_COLOR_DIV = T000K3_A689TBM32_LINE_COLOR_DIV[0] ;
            Z519TBM32_LINE_START_POINT_DIV = T000K3_A519TBM32_LINE_START_POINT_DIV[0] ;
            Z520TBM32_LINE_END_POINT_DIV = T000K3_A520TBM32_LINE_END_POINT_DIV[0] ;
            Z690TBM32_LINE_ANGLE = T000K3_A690TBM32_LINE_ANGLE[0] ;
            Z644TBM32_AUTH_LVL_MIN = T000K3_A644TBM32_AUTH_LVL_MIN[0] ;
            Z645TBM32_ZORDER = T000K3_A645TBM32_ZORDER[0] ;
            Z691TBM32_TAB_ORDER = T000K3_A691TBM32_TAB_ORDER[0] ;
            Z692TBM32_TABSTOP_FLG = T000K3_A692TBM32_TABSTOP_FLG[0] ;
            Z693TBM32_REQUIRED_INPUT_FLG = T000K3_A693TBM32_REQUIRED_INPUT_FLG[0] ;
            Z694TBM32_MIN_VALUE = T000K3_A694TBM32_MIN_VALUE[0] ;
            Z695TBM32_MAX_VALUE = T000K3_A695TBM32_MAX_VALUE[0] ;
            Z406TBM32_CRF_ITEM_NOTE = T000K3_A406TBM32_CRF_ITEM_NOTE[0] ;
            Z774TBM32_REF_CRF_ID = T000K3_A774TBM32_REF_CRF_ID[0] ;
            Z775TBM32_REF_CRF_ITEM_CD = T000K3_A775TBM32_REF_CRF_ITEM_CD[0] ;
            Z75TBM32_DEL_FLG = T000K3_A75TBM32_DEL_FLG[0] ;
            Z409TBM32_CRT_PROG_NM = T000K3_A409TBM32_CRT_PROG_NM[0] ;
            Z412TBM32_UPD_PROG_NM = T000K3_A412TBM32_UPD_PROG_NM[0] ;
         }
         else
         {
            Z407TBM32_CRT_DATETIME = A407TBM32_CRT_DATETIME ;
            Z408TBM32_CRT_USER_ID = A408TBM32_CRT_USER_ID ;
            Z410TBM32_UPD_DATETIME = A410TBM32_UPD_DATETIME ;
            Z411TBM32_UPD_USER_ID = A411TBM32_UPD_USER_ID ;
            Z413TBM32_UPD_CNT = A413TBM32_UPD_CNT ;
            Z405TBM32_CRF_ITEM_NM = A405TBM32_CRF_ITEM_NM ;
            Z74TBM32_CRF_ITEM_DIV = A74TBM32_CRF_ITEM_DIV ;
            Z73TBM32_CRF_ITEM_GRP_CD = A73TBM32_CRF_ITEM_GRP_CD ;
            Z507TBM32_CRF_ITEM_GRP_ORDER = A507TBM32_CRF_ITEM_GRP_ORDER ;
            Z508TBM32_LOCATION_X = A508TBM32_LOCATION_X ;
            Z509TBM32_LOCATION_Y = A509TBM32_LOCATION_Y ;
            Z510TBM32_LOCATION_X2 = A510TBM32_LOCATION_X2 ;
            Z511TBM32_LOCATION_Y2 = A511TBM32_LOCATION_Y2 ;
            Z512TBM32_TEXT_ALIGN_DIV = A512TBM32_TEXT_ALIGN_DIV ;
            Z516TBM32_TEXT_MAXROWS = A516TBM32_TEXT_MAXROWS ;
            Z517TBM32_TEXT_MAXLENGTH = A517TBM32_TEXT_MAXLENGTH ;
            Z518TBM32_DECIMAL_DIGITS = A518TBM32_DECIMAL_DIGITS ;
            Z522TBM32_CHK_TRUE_INNER_VALUE = A522TBM32_CHK_TRUE_INNER_VALUE ;
            Z523TBM32_CHK_FALSE_INNER_VALUE = A523TBM32_CHK_FALSE_INNER_VALUE ;
            Z527TBM32_FIXED_VALUE = A527TBM32_FIXED_VALUE ;
            Z525TBM32_LIST_CD = A525TBM32_LIST_CD ;
            Z526TBM32_IMAGE_CD = A526TBM32_IMAGE_CD ;
            Z524TBM32_TEXT = A524TBM32_TEXT ;
            Z513TBM32_FONT_SIZE = A513TBM32_FONT_SIZE ;
            Z514TBM32_FONT_UL_FLG = A514TBM32_FONT_UL_FLG ;
            Z515TBM32_FONT_COLOR_DIV = A515TBM32_FONT_COLOR_DIV ;
            Z521TBM32_LINE_SIZE_DIV = A521TBM32_LINE_SIZE_DIV ;
            Z689TBM32_LINE_COLOR_DIV = A689TBM32_LINE_COLOR_DIV ;
            Z519TBM32_LINE_START_POINT_DIV = A519TBM32_LINE_START_POINT_DIV ;
            Z520TBM32_LINE_END_POINT_DIV = A520TBM32_LINE_END_POINT_DIV ;
            Z690TBM32_LINE_ANGLE = A690TBM32_LINE_ANGLE ;
            Z644TBM32_AUTH_LVL_MIN = A644TBM32_AUTH_LVL_MIN ;
            Z645TBM32_ZORDER = A645TBM32_ZORDER ;
            Z691TBM32_TAB_ORDER = A691TBM32_TAB_ORDER ;
            Z692TBM32_TABSTOP_FLG = A692TBM32_TABSTOP_FLG ;
            Z693TBM32_REQUIRED_INPUT_FLG = A693TBM32_REQUIRED_INPUT_FLG ;
            Z694TBM32_MIN_VALUE = A694TBM32_MIN_VALUE ;
            Z695TBM32_MAX_VALUE = A695TBM32_MAX_VALUE ;
            Z406TBM32_CRF_ITEM_NOTE = A406TBM32_CRF_ITEM_NOTE ;
            Z774TBM32_REF_CRF_ID = A774TBM32_REF_CRF_ID ;
            Z775TBM32_REF_CRF_ITEM_CD = A775TBM32_REF_CRF_ITEM_CD ;
            Z75TBM32_DEL_FLG = A75TBM32_DEL_FLG ;
            Z409TBM32_CRT_PROG_NM = A409TBM32_CRT_PROG_NM ;
            Z412TBM32_UPD_PROG_NM = A412TBM32_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z70TBM32_STUDY_ID = A70TBM32_STUDY_ID ;
         Z71TBM32_CRF_ID = A71TBM32_CRF_ID ;
         Z72TBM32_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
         Z407TBM32_CRT_DATETIME = A407TBM32_CRT_DATETIME ;
         Z408TBM32_CRT_USER_ID = A408TBM32_CRT_USER_ID ;
         Z410TBM32_UPD_DATETIME = A410TBM32_UPD_DATETIME ;
         Z411TBM32_UPD_USER_ID = A411TBM32_UPD_USER_ID ;
         Z413TBM32_UPD_CNT = A413TBM32_UPD_CNT ;
         Z405TBM32_CRF_ITEM_NM = A405TBM32_CRF_ITEM_NM ;
         Z74TBM32_CRF_ITEM_DIV = A74TBM32_CRF_ITEM_DIV ;
         Z73TBM32_CRF_ITEM_GRP_CD = A73TBM32_CRF_ITEM_GRP_CD ;
         Z507TBM32_CRF_ITEM_GRP_ORDER = A507TBM32_CRF_ITEM_GRP_ORDER ;
         Z508TBM32_LOCATION_X = A508TBM32_LOCATION_X ;
         Z509TBM32_LOCATION_Y = A509TBM32_LOCATION_Y ;
         Z510TBM32_LOCATION_X2 = A510TBM32_LOCATION_X2 ;
         Z511TBM32_LOCATION_Y2 = A511TBM32_LOCATION_Y2 ;
         Z512TBM32_TEXT_ALIGN_DIV = A512TBM32_TEXT_ALIGN_DIV ;
         Z516TBM32_TEXT_MAXROWS = A516TBM32_TEXT_MAXROWS ;
         Z517TBM32_TEXT_MAXLENGTH = A517TBM32_TEXT_MAXLENGTH ;
         Z518TBM32_DECIMAL_DIGITS = A518TBM32_DECIMAL_DIGITS ;
         Z522TBM32_CHK_TRUE_INNER_VALUE = A522TBM32_CHK_TRUE_INNER_VALUE ;
         Z523TBM32_CHK_FALSE_INNER_VALUE = A523TBM32_CHK_FALSE_INNER_VALUE ;
         Z527TBM32_FIXED_VALUE = A527TBM32_FIXED_VALUE ;
         Z525TBM32_LIST_CD = A525TBM32_LIST_CD ;
         Z526TBM32_IMAGE_CD = A526TBM32_IMAGE_CD ;
         Z524TBM32_TEXT = A524TBM32_TEXT ;
         Z513TBM32_FONT_SIZE = A513TBM32_FONT_SIZE ;
         Z514TBM32_FONT_UL_FLG = A514TBM32_FONT_UL_FLG ;
         Z515TBM32_FONT_COLOR_DIV = A515TBM32_FONT_COLOR_DIV ;
         Z521TBM32_LINE_SIZE_DIV = A521TBM32_LINE_SIZE_DIV ;
         Z689TBM32_LINE_COLOR_DIV = A689TBM32_LINE_COLOR_DIV ;
         Z519TBM32_LINE_START_POINT_DIV = A519TBM32_LINE_START_POINT_DIV ;
         Z520TBM32_LINE_END_POINT_DIV = A520TBM32_LINE_END_POINT_DIV ;
         Z690TBM32_LINE_ANGLE = A690TBM32_LINE_ANGLE ;
         Z644TBM32_AUTH_LVL_MIN = A644TBM32_AUTH_LVL_MIN ;
         Z645TBM32_ZORDER = A645TBM32_ZORDER ;
         Z691TBM32_TAB_ORDER = A691TBM32_TAB_ORDER ;
         Z692TBM32_TABSTOP_FLG = A692TBM32_TABSTOP_FLG ;
         Z693TBM32_REQUIRED_INPUT_FLG = A693TBM32_REQUIRED_INPUT_FLG ;
         Z694TBM32_MIN_VALUE = A694TBM32_MIN_VALUE ;
         Z695TBM32_MAX_VALUE = A695TBM32_MAX_VALUE ;
         Z406TBM32_CRF_ITEM_NOTE = A406TBM32_CRF_ITEM_NOTE ;
         Z774TBM32_REF_CRF_ID = A774TBM32_REF_CRF_ID ;
         Z775TBM32_REF_CRF_ITEM_CD = A775TBM32_REF_CRF_ITEM_CD ;
         Z75TBM32_DEL_FLG = A75TBM32_DEL_FLG ;
         Z409TBM32_CRT_PROG_NM = A409TBM32_CRT_PROG_NM ;
         Z412TBM32_UPD_PROG_NM = A412TBM32_UPD_PROG_NM ;
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

   public void load0K19( )
   {
      /* Using cursor T000K4 */
      pr_default.execute(2, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound19 = (short)(1) ;
         A407TBM32_CRT_DATETIME = T000K4_A407TBM32_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407TBM32_CRT_DATETIME", localUtil.ttoc( A407TBM32_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n407TBM32_CRT_DATETIME = T000K4_n407TBM32_CRT_DATETIME[0] ;
         A408TBM32_CRT_USER_ID = T000K4_A408TBM32_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A408TBM32_CRT_USER_ID", A408TBM32_CRT_USER_ID);
         n408TBM32_CRT_USER_ID = T000K4_n408TBM32_CRT_USER_ID[0] ;
         A410TBM32_UPD_DATETIME = T000K4_A410TBM32_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A410TBM32_UPD_DATETIME", localUtil.ttoc( A410TBM32_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n410TBM32_UPD_DATETIME = T000K4_n410TBM32_UPD_DATETIME[0] ;
         A411TBM32_UPD_USER_ID = T000K4_A411TBM32_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A411TBM32_UPD_USER_ID", A411TBM32_UPD_USER_ID);
         n411TBM32_UPD_USER_ID = T000K4_n411TBM32_UPD_USER_ID[0] ;
         A413TBM32_UPD_CNT = T000K4_A413TBM32_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A413TBM32_UPD_CNT", GXutil.ltrim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)));
         n413TBM32_UPD_CNT = T000K4_n413TBM32_UPD_CNT[0] ;
         A405TBM32_CRF_ITEM_NM = T000K4_A405TBM32_CRF_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A405TBM32_CRF_ITEM_NM", A405TBM32_CRF_ITEM_NM);
         n405TBM32_CRF_ITEM_NM = T000K4_n405TBM32_CRF_ITEM_NM[0] ;
         A74TBM32_CRF_ITEM_DIV = T000K4_A74TBM32_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TBM32_CRF_ITEM_DIV", A74TBM32_CRF_ITEM_DIV);
         n74TBM32_CRF_ITEM_DIV = T000K4_n74TBM32_CRF_ITEM_DIV[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = T000K4_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73TBM32_CRF_ITEM_GRP_CD", A73TBM32_CRF_ITEM_GRP_CD);
         n73TBM32_CRF_ITEM_GRP_CD = T000K4_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = T000K4_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A507TBM32_CRF_ITEM_GRP_ORDER", GXutil.ltrim( GXutil.str( A507TBM32_CRF_ITEM_GRP_ORDER, 3, 0)));
         n507TBM32_CRF_ITEM_GRP_ORDER = T000K4_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A508TBM32_LOCATION_X = T000K4_A508TBM32_LOCATION_X[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A508TBM32_LOCATION_X", GXutil.ltrim( GXutil.str( A508TBM32_LOCATION_X, 4, 0)));
         n508TBM32_LOCATION_X = T000K4_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = T000K4_A509TBM32_LOCATION_Y[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A509TBM32_LOCATION_Y", GXutil.ltrim( GXutil.str( A509TBM32_LOCATION_Y, 4, 0)));
         n509TBM32_LOCATION_Y = T000K4_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = T000K4_A510TBM32_LOCATION_X2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A510TBM32_LOCATION_X2", GXutil.ltrim( GXutil.str( A510TBM32_LOCATION_X2, 4, 0)));
         n510TBM32_LOCATION_X2 = T000K4_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = T000K4_A511TBM32_LOCATION_Y2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A511TBM32_LOCATION_Y2", GXutil.ltrim( GXutil.str( A511TBM32_LOCATION_Y2, 4, 0)));
         n511TBM32_LOCATION_Y2 = T000K4_n511TBM32_LOCATION_Y2[0] ;
         A512TBM32_TEXT_ALIGN_DIV = T000K4_A512TBM32_TEXT_ALIGN_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A512TBM32_TEXT_ALIGN_DIV", A512TBM32_TEXT_ALIGN_DIV);
         n512TBM32_TEXT_ALIGN_DIV = T000K4_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A516TBM32_TEXT_MAXROWS = T000K4_A516TBM32_TEXT_MAXROWS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A516TBM32_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A516TBM32_TEXT_MAXROWS, 2, 0)));
         n516TBM32_TEXT_MAXROWS = T000K4_n516TBM32_TEXT_MAXROWS[0] ;
         A517TBM32_TEXT_MAXLENGTH = T000K4_A517TBM32_TEXT_MAXLENGTH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A517TBM32_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A517TBM32_TEXT_MAXLENGTH, 3, 0)));
         n517TBM32_TEXT_MAXLENGTH = T000K4_n517TBM32_TEXT_MAXLENGTH[0] ;
         A518TBM32_DECIMAL_DIGITS = T000K4_A518TBM32_DECIMAL_DIGITS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A518TBM32_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A518TBM32_DECIMAL_DIGITS, 2, 0)));
         n518TBM32_DECIMAL_DIGITS = T000K4_n518TBM32_DECIMAL_DIGITS[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = T000K4_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A522TBM32_CHK_TRUE_INNER_VALUE", A522TBM32_CHK_TRUE_INNER_VALUE);
         n522TBM32_CHK_TRUE_INNER_VALUE = T000K4_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = T000K4_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A523TBM32_CHK_FALSE_INNER_VALUE", A523TBM32_CHK_FALSE_INNER_VALUE);
         n523TBM32_CHK_FALSE_INNER_VALUE = T000K4_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A527TBM32_FIXED_VALUE = T000K4_A527TBM32_FIXED_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A527TBM32_FIXED_VALUE", A527TBM32_FIXED_VALUE);
         n527TBM32_FIXED_VALUE = T000K4_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = T000K4_A525TBM32_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A525TBM32_LIST_CD", A525TBM32_LIST_CD);
         n525TBM32_LIST_CD = T000K4_n525TBM32_LIST_CD[0] ;
         A526TBM32_IMAGE_CD = T000K4_A526TBM32_IMAGE_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A526TBM32_IMAGE_CD", A526TBM32_IMAGE_CD);
         n526TBM32_IMAGE_CD = T000K4_n526TBM32_IMAGE_CD[0] ;
         A524TBM32_TEXT = T000K4_A524TBM32_TEXT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A524TBM32_TEXT", A524TBM32_TEXT);
         n524TBM32_TEXT = T000K4_n524TBM32_TEXT[0] ;
         A513TBM32_FONT_SIZE = T000K4_A513TBM32_FONT_SIZE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513TBM32_FONT_SIZE", GXutil.ltrim( GXutil.str( A513TBM32_FONT_SIZE, 2, 0)));
         n513TBM32_FONT_SIZE = T000K4_n513TBM32_FONT_SIZE[0] ;
         A514TBM32_FONT_UL_FLG = T000K4_A514TBM32_FONT_UL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A514TBM32_FONT_UL_FLG", A514TBM32_FONT_UL_FLG);
         n514TBM32_FONT_UL_FLG = T000K4_n514TBM32_FONT_UL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = T000K4_A515TBM32_FONT_COLOR_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A515TBM32_FONT_COLOR_DIV", GXutil.ltrim( GXutil.str( A515TBM32_FONT_COLOR_DIV, 10, 0)));
         n515TBM32_FONT_COLOR_DIV = T000K4_n515TBM32_FONT_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = T000K4_A521TBM32_LINE_SIZE_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A521TBM32_LINE_SIZE_DIV", GXutil.ltrim( GXutil.str( A521TBM32_LINE_SIZE_DIV, 2, 0)));
         n521TBM32_LINE_SIZE_DIV = T000K4_n521TBM32_LINE_SIZE_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = T000K4_A689TBM32_LINE_COLOR_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A689TBM32_LINE_COLOR_DIV", GXutil.ltrim( GXutil.str( A689TBM32_LINE_COLOR_DIV, 10, 0)));
         n689TBM32_LINE_COLOR_DIV = T000K4_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = T000K4_A519TBM32_LINE_START_POINT_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A519TBM32_LINE_START_POINT_DIV", A519TBM32_LINE_START_POINT_DIV);
         n519TBM32_LINE_START_POINT_DIV = T000K4_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = T000K4_A520TBM32_LINE_END_POINT_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A520TBM32_LINE_END_POINT_DIV", A520TBM32_LINE_END_POINT_DIV);
         n520TBM32_LINE_END_POINT_DIV = T000K4_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = T000K4_A690TBM32_LINE_ANGLE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A690TBM32_LINE_ANGLE", GXutil.ltrim( GXutil.str( A690TBM32_LINE_ANGLE, 4, 0)));
         n690TBM32_LINE_ANGLE = T000K4_n690TBM32_LINE_ANGLE[0] ;
         A644TBM32_AUTH_LVL_MIN = T000K4_A644TBM32_AUTH_LVL_MIN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A644TBM32_AUTH_LVL_MIN", GXutil.ltrim( GXutil.str( A644TBM32_AUTH_LVL_MIN, 2, 0)));
         n644TBM32_AUTH_LVL_MIN = T000K4_n644TBM32_AUTH_LVL_MIN[0] ;
         A645TBM32_ZORDER = T000K4_A645TBM32_ZORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A645TBM32_ZORDER", GXutil.ltrim( GXutil.str( A645TBM32_ZORDER, 3, 0)));
         n645TBM32_ZORDER = T000K4_n645TBM32_ZORDER[0] ;
         A691TBM32_TAB_ORDER = T000K4_A691TBM32_TAB_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A691TBM32_TAB_ORDER", GXutil.ltrim( GXutil.str( A691TBM32_TAB_ORDER, 3, 0)));
         n691TBM32_TAB_ORDER = T000K4_n691TBM32_TAB_ORDER[0] ;
         A692TBM32_TABSTOP_FLG = T000K4_A692TBM32_TABSTOP_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A692TBM32_TABSTOP_FLG", A692TBM32_TABSTOP_FLG);
         n692TBM32_TABSTOP_FLG = T000K4_n692TBM32_TABSTOP_FLG[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = T000K4_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A693TBM32_REQUIRED_INPUT_FLG", A693TBM32_REQUIRED_INPUT_FLG);
         n693TBM32_REQUIRED_INPUT_FLG = T000K4_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A694TBM32_MIN_VALUE = T000K4_A694TBM32_MIN_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A694TBM32_MIN_VALUE", A694TBM32_MIN_VALUE);
         n694TBM32_MIN_VALUE = T000K4_n694TBM32_MIN_VALUE[0] ;
         A695TBM32_MAX_VALUE = T000K4_A695TBM32_MAX_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A695TBM32_MAX_VALUE", A695TBM32_MAX_VALUE);
         n695TBM32_MAX_VALUE = T000K4_n695TBM32_MAX_VALUE[0] ;
         A406TBM32_CRF_ITEM_NOTE = T000K4_A406TBM32_CRF_ITEM_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A406TBM32_CRF_ITEM_NOTE", A406TBM32_CRF_ITEM_NOTE);
         n406TBM32_CRF_ITEM_NOTE = T000K4_n406TBM32_CRF_ITEM_NOTE[0] ;
         A774TBM32_REF_CRF_ID = T000K4_A774TBM32_REF_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774TBM32_REF_CRF_ID", GXutil.ltrim( GXutil.str( A774TBM32_REF_CRF_ID, 4, 0)));
         n774TBM32_REF_CRF_ID = T000K4_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = T000K4_A775TBM32_REF_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A775TBM32_REF_CRF_ITEM_CD", A775TBM32_REF_CRF_ITEM_CD);
         n775TBM32_REF_CRF_ITEM_CD = T000K4_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A75TBM32_DEL_FLG = T000K4_A75TBM32_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75TBM32_DEL_FLG", A75TBM32_DEL_FLG);
         n75TBM32_DEL_FLG = T000K4_n75TBM32_DEL_FLG[0] ;
         A409TBM32_CRT_PROG_NM = T000K4_A409TBM32_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A409TBM32_CRT_PROG_NM", A409TBM32_CRT_PROG_NM);
         n409TBM32_CRT_PROG_NM = T000K4_n409TBM32_CRT_PROG_NM[0] ;
         A412TBM32_UPD_PROG_NM = T000K4_A412TBM32_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A412TBM32_UPD_PROG_NM", A412TBM32_UPD_PROG_NM);
         n412TBM32_UPD_PROG_NM = T000K4_n412TBM32_UPD_PROG_NM[0] ;
         zm0K19( -8) ;
      }
      pr_default.close(2);
      onLoadActions0K19( ) ;
   }

   public void onLoadActions0K19( )
   {
      AV9Pgmname = "TBM32_CRF_ITEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0K19( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM32_CRF_ITEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A407TBM32_CRT_DATETIME) || (( A407TBM32_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A407TBM32_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM32_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM32_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A410TBM32_UPD_DATETIME) || (( A410TBM32_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A410TBM32_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM32_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM32_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0K19( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0K19( )
   {
      /* Using cursor T000K5 */
      pr_default.execute(3, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound19 = (short)(1) ;
      }
      else
      {
         RcdFound19 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000K3 */
      pr_default.execute(1, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0K19( 8) ;
         RcdFound19 = (short)(1) ;
         A70TBM32_STUDY_ID = T000K3_A70TBM32_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
         A71TBM32_CRF_ID = T000K3_A71TBM32_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
         A72TBM32_CRF_ITEM_CD = T000K3_A72TBM32_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A72TBM32_CRF_ITEM_CD", A72TBM32_CRF_ITEM_CD);
         A407TBM32_CRT_DATETIME = T000K3_A407TBM32_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A407TBM32_CRT_DATETIME", localUtil.ttoc( A407TBM32_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n407TBM32_CRT_DATETIME = T000K3_n407TBM32_CRT_DATETIME[0] ;
         A408TBM32_CRT_USER_ID = T000K3_A408TBM32_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A408TBM32_CRT_USER_ID", A408TBM32_CRT_USER_ID);
         n408TBM32_CRT_USER_ID = T000K3_n408TBM32_CRT_USER_ID[0] ;
         A410TBM32_UPD_DATETIME = T000K3_A410TBM32_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A410TBM32_UPD_DATETIME", localUtil.ttoc( A410TBM32_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n410TBM32_UPD_DATETIME = T000K3_n410TBM32_UPD_DATETIME[0] ;
         A411TBM32_UPD_USER_ID = T000K3_A411TBM32_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A411TBM32_UPD_USER_ID", A411TBM32_UPD_USER_ID);
         n411TBM32_UPD_USER_ID = T000K3_n411TBM32_UPD_USER_ID[0] ;
         A413TBM32_UPD_CNT = T000K3_A413TBM32_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A413TBM32_UPD_CNT", GXutil.ltrim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)));
         n413TBM32_UPD_CNT = T000K3_n413TBM32_UPD_CNT[0] ;
         A405TBM32_CRF_ITEM_NM = T000K3_A405TBM32_CRF_ITEM_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A405TBM32_CRF_ITEM_NM", A405TBM32_CRF_ITEM_NM);
         n405TBM32_CRF_ITEM_NM = T000K3_n405TBM32_CRF_ITEM_NM[0] ;
         A74TBM32_CRF_ITEM_DIV = T000K3_A74TBM32_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A74TBM32_CRF_ITEM_DIV", A74TBM32_CRF_ITEM_DIV);
         n74TBM32_CRF_ITEM_DIV = T000K3_n74TBM32_CRF_ITEM_DIV[0] ;
         A73TBM32_CRF_ITEM_GRP_CD = T000K3_A73TBM32_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A73TBM32_CRF_ITEM_GRP_CD", A73TBM32_CRF_ITEM_GRP_CD);
         n73TBM32_CRF_ITEM_GRP_CD = T000K3_n73TBM32_CRF_ITEM_GRP_CD[0] ;
         A507TBM32_CRF_ITEM_GRP_ORDER = T000K3_A507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A507TBM32_CRF_ITEM_GRP_ORDER", GXutil.ltrim( GXutil.str( A507TBM32_CRF_ITEM_GRP_ORDER, 3, 0)));
         n507TBM32_CRF_ITEM_GRP_ORDER = T000K3_n507TBM32_CRF_ITEM_GRP_ORDER[0] ;
         A508TBM32_LOCATION_X = T000K3_A508TBM32_LOCATION_X[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A508TBM32_LOCATION_X", GXutil.ltrim( GXutil.str( A508TBM32_LOCATION_X, 4, 0)));
         n508TBM32_LOCATION_X = T000K3_n508TBM32_LOCATION_X[0] ;
         A509TBM32_LOCATION_Y = T000K3_A509TBM32_LOCATION_Y[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A509TBM32_LOCATION_Y", GXutil.ltrim( GXutil.str( A509TBM32_LOCATION_Y, 4, 0)));
         n509TBM32_LOCATION_Y = T000K3_n509TBM32_LOCATION_Y[0] ;
         A510TBM32_LOCATION_X2 = T000K3_A510TBM32_LOCATION_X2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A510TBM32_LOCATION_X2", GXutil.ltrim( GXutil.str( A510TBM32_LOCATION_X2, 4, 0)));
         n510TBM32_LOCATION_X2 = T000K3_n510TBM32_LOCATION_X2[0] ;
         A511TBM32_LOCATION_Y2 = T000K3_A511TBM32_LOCATION_Y2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A511TBM32_LOCATION_Y2", GXutil.ltrim( GXutil.str( A511TBM32_LOCATION_Y2, 4, 0)));
         n511TBM32_LOCATION_Y2 = T000K3_n511TBM32_LOCATION_Y2[0] ;
         A512TBM32_TEXT_ALIGN_DIV = T000K3_A512TBM32_TEXT_ALIGN_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A512TBM32_TEXT_ALIGN_DIV", A512TBM32_TEXT_ALIGN_DIV);
         n512TBM32_TEXT_ALIGN_DIV = T000K3_n512TBM32_TEXT_ALIGN_DIV[0] ;
         A516TBM32_TEXT_MAXROWS = T000K3_A516TBM32_TEXT_MAXROWS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A516TBM32_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A516TBM32_TEXT_MAXROWS, 2, 0)));
         n516TBM32_TEXT_MAXROWS = T000K3_n516TBM32_TEXT_MAXROWS[0] ;
         A517TBM32_TEXT_MAXLENGTH = T000K3_A517TBM32_TEXT_MAXLENGTH[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A517TBM32_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A517TBM32_TEXT_MAXLENGTH, 3, 0)));
         n517TBM32_TEXT_MAXLENGTH = T000K3_n517TBM32_TEXT_MAXLENGTH[0] ;
         A518TBM32_DECIMAL_DIGITS = T000K3_A518TBM32_DECIMAL_DIGITS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A518TBM32_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A518TBM32_DECIMAL_DIGITS, 2, 0)));
         n518TBM32_DECIMAL_DIGITS = T000K3_n518TBM32_DECIMAL_DIGITS[0] ;
         A522TBM32_CHK_TRUE_INNER_VALUE = T000K3_A522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A522TBM32_CHK_TRUE_INNER_VALUE", A522TBM32_CHK_TRUE_INNER_VALUE);
         n522TBM32_CHK_TRUE_INNER_VALUE = T000K3_n522TBM32_CHK_TRUE_INNER_VALUE[0] ;
         A523TBM32_CHK_FALSE_INNER_VALUE = T000K3_A523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A523TBM32_CHK_FALSE_INNER_VALUE", A523TBM32_CHK_FALSE_INNER_VALUE);
         n523TBM32_CHK_FALSE_INNER_VALUE = T000K3_n523TBM32_CHK_FALSE_INNER_VALUE[0] ;
         A527TBM32_FIXED_VALUE = T000K3_A527TBM32_FIXED_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A527TBM32_FIXED_VALUE", A527TBM32_FIXED_VALUE);
         n527TBM32_FIXED_VALUE = T000K3_n527TBM32_FIXED_VALUE[0] ;
         A525TBM32_LIST_CD = T000K3_A525TBM32_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A525TBM32_LIST_CD", A525TBM32_LIST_CD);
         n525TBM32_LIST_CD = T000K3_n525TBM32_LIST_CD[0] ;
         A526TBM32_IMAGE_CD = T000K3_A526TBM32_IMAGE_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A526TBM32_IMAGE_CD", A526TBM32_IMAGE_CD);
         n526TBM32_IMAGE_CD = T000K3_n526TBM32_IMAGE_CD[0] ;
         A524TBM32_TEXT = T000K3_A524TBM32_TEXT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A524TBM32_TEXT", A524TBM32_TEXT);
         n524TBM32_TEXT = T000K3_n524TBM32_TEXT[0] ;
         A513TBM32_FONT_SIZE = T000K3_A513TBM32_FONT_SIZE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513TBM32_FONT_SIZE", GXutil.ltrim( GXutil.str( A513TBM32_FONT_SIZE, 2, 0)));
         n513TBM32_FONT_SIZE = T000K3_n513TBM32_FONT_SIZE[0] ;
         A514TBM32_FONT_UL_FLG = T000K3_A514TBM32_FONT_UL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A514TBM32_FONT_UL_FLG", A514TBM32_FONT_UL_FLG);
         n514TBM32_FONT_UL_FLG = T000K3_n514TBM32_FONT_UL_FLG[0] ;
         A515TBM32_FONT_COLOR_DIV = T000K3_A515TBM32_FONT_COLOR_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A515TBM32_FONT_COLOR_DIV", GXutil.ltrim( GXutil.str( A515TBM32_FONT_COLOR_DIV, 10, 0)));
         n515TBM32_FONT_COLOR_DIV = T000K3_n515TBM32_FONT_COLOR_DIV[0] ;
         A521TBM32_LINE_SIZE_DIV = T000K3_A521TBM32_LINE_SIZE_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A521TBM32_LINE_SIZE_DIV", GXutil.ltrim( GXutil.str( A521TBM32_LINE_SIZE_DIV, 2, 0)));
         n521TBM32_LINE_SIZE_DIV = T000K3_n521TBM32_LINE_SIZE_DIV[0] ;
         A689TBM32_LINE_COLOR_DIV = T000K3_A689TBM32_LINE_COLOR_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A689TBM32_LINE_COLOR_DIV", GXutil.ltrim( GXutil.str( A689TBM32_LINE_COLOR_DIV, 10, 0)));
         n689TBM32_LINE_COLOR_DIV = T000K3_n689TBM32_LINE_COLOR_DIV[0] ;
         A519TBM32_LINE_START_POINT_DIV = T000K3_A519TBM32_LINE_START_POINT_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A519TBM32_LINE_START_POINT_DIV", A519TBM32_LINE_START_POINT_DIV);
         n519TBM32_LINE_START_POINT_DIV = T000K3_n519TBM32_LINE_START_POINT_DIV[0] ;
         A520TBM32_LINE_END_POINT_DIV = T000K3_A520TBM32_LINE_END_POINT_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A520TBM32_LINE_END_POINT_DIV", A520TBM32_LINE_END_POINT_DIV);
         n520TBM32_LINE_END_POINT_DIV = T000K3_n520TBM32_LINE_END_POINT_DIV[0] ;
         A690TBM32_LINE_ANGLE = T000K3_A690TBM32_LINE_ANGLE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A690TBM32_LINE_ANGLE", GXutil.ltrim( GXutil.str( A690TBM32_LINE_ANGLE, 4, 0)));
         n690TBM32_LINE_ANGLE = T000K3_n690TBM32_LINE_ANGLE[0] ;
         A644TBM32_AUTH_LVL_MIN = T000K3_A644TBM32_AUTH_LVL_MIN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A644TBM32_AUTH_LVL_MIN", GXutil.ltrim( GXutil.str( A644TBM32_AUTH_LVL_MIN, 2, 0)));
         n644TBM32_AUTH_LVL_MIN = T000K3_n644TBM32_AUTH_LVL_MIN[0] ;
         A645TBM32_ZORDER = T000K3_A645TBM32_ZORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A645TBM32_ZORDER", GXutil.ltrim( GXutil.str( A645TBM32_ZORDER, 3, 0)));
         n645TBM32_ZORDER = T000K3_n645TBM32_ZORDER[0] ;
         A691TBM32_TAB_ORDER = T000K3_A691TBM32_TAB_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A691TBM32_TAB_ORDER", GXutil.ltrim( GXutil.str( A691TBM32_TAB_ORDER, 3, 0)));
         n691TBM32_TAB_ORDER = T000K3_n691TBM32_TAB_ORDER[0] ;
         A692TBM32_TABSTOP_FLG = T000K3_A692TBM32_TABSTOP_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A692TBM32_TABSTOP_FLG", A692TBM32_TABSTOP_FLG);
         n692TBM32_TABSTOP_FLG = T000K3_n692TBM32_TABSTOP_FLG[0] ;
         A693TBM32_REQUIRED_INPUT_FLG = T000K3_A693TBM32_REQUIRED_INPUT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A693TBM32_REQUIRED_INPUT_FLG", A693TBM32_REQUIRED_INPUT_FLG);
         n693TBM32_REQUIRED_INPUT_FLG = T000K3_n693TBM32_REQUIRED_INPUT_FLG[0] ;
         A694TBM32_MIN_VALUE = T000K3_A694TBM32_MIN_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A694TBM32_MIN_VALUE", A694TBM32_MIN_VALUE);
         n694TBM32_MIN_VALUE = T000K3_n694TBM32_MIN_VALUE[0] ;
         A695TBM32_MAX_VALUE = T000K3_A695TBM32_MAX_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A695TBM32_MAX_VALUE", A695TBM32_MAX_VALUE);
         n695TBM32_MAX_VALUE = T000K3_n695TBM32_MAX_VALUE[0] ;
         A406TBM32_CRF_ITEM_NOTE = T000K3_A406TBM32_CRF_ITEM_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A406TBM32_CRF_ITEM_NOTE", A406TBM32_CRF_ITEM_NOTE);
         n406TBM32_CRF_ITEM_NOTE = T000K3_n406TBM32_CRF_ITEM_NOTE[0] ;
         A774TBM32_REF_CRF_ID = T000K3_A774TBM32_REF_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A774TBM32_REF_CRF_ID", GXutil.ltrim( GXutil.str( A774TBM32_REF_CRF_ID, 4, 0)));
         n774TBM32_REF_CRF_ID = T000K3_n774TBM32_REF_CRF_ID[0] ;
         A775TBM32_REF_CRF_ITEM_CD = T000K3_A775TBM32_REF_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A775TBM32_REF_CRF_ITEM_CD", A775TBM32_REF_CRF_ITEM_CD);
         n775TBM32_REF_CRF_ITEM_CD = T000K3_n775TBM32_REF_CRF_ITEM_CD[0] ;
         A75TBM32_DEL_FLG = T000K3_A75TBM32_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A75TBM32_DEL_FLG", A75TBM32_DEL_FLG);
         n75TBM32_DEL_FLG = T000K3_n75TBM32_DEL_FLG[0] ;
         A409TBM32_CRT_PROG_NM = T000K3_A409TBM32_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A409TBM32_CRT_PROG_NM", A409TBM32_CRT_PROG_NM);
         n409TBM32_CRT_PROG_NM = T000K3_n409TBM32_CRT_PROG_NM[0] ;
         A412TBM32_UPD_PROG_NM = T000K3_A412TBM32_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A412TBM32_UPD_PROG_NM", A412TBM32_UPD_PROG_NM);
         n412TBM32_UPD_PROG_NM = T000K3_n412TBM32_UPD_PROG_NM[0] ;
         O413TBM32_UPD_CNT = A413TBM32_UPD_CNT ;
         n413TBM32_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A413TBM32_UPD_CNT", GXutil.ltrim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)));
         Z70TBM32_STUDY_ID = A70TBM32_STUDY_ID ;
         Z71TBM32_CRF_ID = A71TBM32_CRF_ID ;
         Z72TBM32_CRF_ITEM_CD = A72TBM32_CRF_ITEM_CD ;
         sMode19 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0K19( ) ;
         if ( AnyError == 1 )
         {
            RcdFound19 = (short)(0) ;
            initializeNonKey0K19( ) ;
         }
         Gx_mode = sMode19 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound19 = (short)(0) ;
         initializeNonKey0K19( ) ;
         sMode19 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode19 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0K19( ) ;
      if ( RcdFound19 == 0 )
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
      RcdFound19 = (short)(0) ;
      /* Using cursor T000K6 */
      pr_default.execute(4, new Object[] {new Long(A70TBM32_STUDY_ID), new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), new Short(A71TBM32_CRF_ID), new Long(A70TBM32_STUDY_ID), A72TBM32_CRF_ITEM_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000K6_A70TBM32_STUDY_ID[0] < A70TBM32_STUDY_ID ) || ( T000K6_A70TBM32_STUDY_ID[0] == A70TBM32_STUDY_ID ) && ( T000K6_A71TBM32_CRF_ID[0] < A71TBM32_CRF_ID ) || ( T000K6_A71TBM32_CRF_ID[0] == A71TBM32_CRF_ID ) && ( T000K6_A70TBM32_STUDY_ID[0] == A70TBM32_STUDY_ID ) && ( GXutil.strcmp(T000K6_A72TBM32_CRF_ITEM_CD[0], A72TBM32_CRF_ITEM_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000K6_A70TBM32_STUDY_ID[0] > A70TBM32_STUDY_ID ) || ( T000K6_A70TBM32_STUDY_ID[0] == A70TBM32_STUDY_ID ) && ( T000K6_A71TBM32_CRF_ID[0] > A71TBM32_CRF_ID ) || ( T000K6_A71TBM32_CRF_ID[0] == A71TBM32_CRF_ID ) && ( T000K6_A70TBM32_STUDY_ID[0] == A70TBM32_STUDY_ID ) && ( GXutil.strcmp(T000K6_A72TBM32_CRF_ITEM_CD[0], A72TBM32_CRF_ITEM_CD) > 0 ) ) )
         {
            A70TBM32_STUDY_ID = T000K6_A70TBM32_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
            A71TBM32_CRF_ID = T000K6_A71TBM32_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
            A72TBM32_CRF_ITEM_CD = T000K6_A72TBM32_CRF_ITEM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A72TBM32_CRF_ITEM_CD", A72TBM32_CRF_ITEM_CD);
            RcdFound19 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound19 = (short)(0) ;
      /* Using cursor T000K7 */
      pr_default.execute(5, new Object[] {new Long(A70TBM32_STUDY_ID), new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), new Short(A71TBM32_CRF_ID), new Long(A70TBM32_STUDY_ID), A72TBM32_CRF_ITEM_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000K7_A70TBM32_STUDY_ID[0] > A70TBM32_STUDY_ID ) || ( T000K7_A70TBM32_STUDY_ID[0] == A70TBM32_STUDY_ID ) && ( T000K7_A71TBM32_CRF_ID[0] > A71TBM32_CRF_ID ) || ( T000K7_A71TBM32_CRF_ID[0] == A71TBM32_CRF_ID ) && ( T000K7_A70TBM32_STUDY_ID[0] == A70TBM32_STUDY_ID ) && ( GXutil.strcmp(T000K7_A72TBM32_CRF_ITEM_CD[0], A72TBM32_CRF_ITEM_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000K7_A70TBM32_STUDY_ID[0] < A70TBM32_STUDY_ID ) || ( T000K7_A70TBM32_STUDY_ID[0] == A70TBM32_STUDY_ID ) && ( T000K7_A71TBM32_CRF_ID[0] < A71TBM32_CRF_ID ) || ( T000K7_A71TBM32_CRF_ID[0] == A71TBM32_CRF_ID ) && ( T000K7_A70TBM32_STUDY_ID[0] == A70TBM32_STUDY_ID ) && ( GXutil.strcmp(T000K7_A72TBM32_CRF_ITEM_CD[0], A72TBM32_CRF_ITEM_CD) < 0 ) ) )
         {
            A70TBM32_STUDY_ID = T000K7_A70TBM32_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
            A71TBM32_CRF_ID = T000K7_A71TBM32_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
            A72TBM32_CRF_ITEM_CD = T000K7_A72TBM32_CRF_ITEM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A72TBM32_CRF_ITEM_CD", A72TBM32_CRF_ITEM_CD);
            RcdFound19 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0K19( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0K19( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound19 == 1 )
         {
            if ( ( A70TBM32_STUDY_ID != Z70TBM32_STUDY_ID ) || ( A71TBM32_CRF_ID != Z71TBM32_CRF_ID ) || ( GXutil.strcmp(A72TBM32_CRF_ITEM_CD, Z72TBM32_CRF_ITEM_CD) != 0 ) )
            {
               A70TBM32_STUDY_ID = Z70TBM32_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
               A71TBM32_CRF_ID = Z71TBM32_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
               A72TBM32_CRF_ITEM_CD = Z72TBM32_CRF_ITEM_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A72TBM32_CRF_ITEM_CD", A72TBM32_CRF_ITEM_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM32_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0K19( ) ;
               GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A70TBM32_STUDY_ID != Z70TBM32_STUDY_ID ) || ( A71TBM32_CRF_ID != Z71TBM32_CRF_ID ) || ( GXutil.strcmp(A72TBM32_CRF_ITEM_CD, Z72TBM32_CRF_ITEM_CD) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0K19( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM32_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0K19( ) ;
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
      if ( ( A70TBM32_STUDY_ID != Z70TBM32_STUDY_ID ) || ( A71TBM32_CRF_ID != Z71TBM32_CRF_ID ) || ( GXutil.strcmp(A72TBM32_CRF_ITEM_CD, Z72TBM32_CRF_ITEM_CD) != 0 ) )
      {
         A70TBM32_STUDY_ID = Z70TBM32_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
         A71TBM32_CRF_ID = Z71TBM32_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
         A72TBM32_CRF_ITEM_CD = Z72TBM32_CRF_ITEM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A72TBM32_CRF_ITEM_CD", A72TBM32_CRF_ITEM_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM32_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
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
      if ( RcdFound19 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM32_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM32_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM32_CRF_ITEM_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0K19( ) ;
      if ( RcdFound19 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM32_CRF_ITEM_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0K19( ) ;
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
      if ( RcdFound19 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM32_CRF_ITEM_NM_Internalname ;
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
      if ( RcdFound19 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM32_CRF_ITEM_NM_Internalname ;
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
      scanStart0K19( ) ;
      if ( RcdFound19 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound19 != 0 )
         {
            scanNext0K19( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM32_CRF_ITEM_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0K19( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0K19( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000K2 */
         pr_default.execute(0, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM32_CRF_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z407TBM32_CRT_DATETIME.equals( T000K2_A407TBM32_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z408TBM32_CRT_USER_ID, T000K2_A408TBM32_CRT_USER_ID[0]) != 0 ) || !( Z410TBM32_UPD_DATETIME.equals( T000K2_A410TBM32_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z411TBM32_UPD_USER_ID, T000K2_A411TBM32_UPD_USER_ID[0]) != 0 ) || ( Z413TBM32_UPD_CNT != T000K2_A413TBM32_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z405TBM32_CRF_ITEM_NM, T000K2_A405TBM32_CRF_ITEM_NM[0]) != 0 ) || ( GXutil.strcmp(Z74TBM32_CRF_ITEM_DIV, T000K2_A74TBM32_CRF_ITEM_DIV[0]) != 0 ) || ( GXutil.strcmp(Z73TBM32_CRF_ITEM_GRP_CD, T000K2_A73TBM32_CRF_ITEM_GRP_CD[0]) != 0 ) || ( Z507TBM32_CRF_ITEM_GRP_ORDER != T000K2_A507TBM32_CRF_ITEM_GRP_ORDER[0] ) || ( Z508TBM32_LOCATION_X != T000K2_A508TBM32_LOCATION_X[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z509TBM32_LOCATION_Y != T000K2_A509TBM32_LOCATION_Y[0] ) || ( Z510TBM32_LOCATION_X2 != T000K2_A510TBM32_LOCATION_X2[0] ) || ( Z511TBM32_LOCATION_Y2 != T000K2_A511TBM32_LOCATION_Y2[0] ) || ( GXutil.strcmp(Z512TBM32_TEXT_ALIGN_DIV, T000K2_A512TBM32_TEXT_ALIGN_DIV[0]) != 0 ) || ( Z516TBM32_TEXT_MAXROWS != T000K2_A516TBM32_TEXT_MAXROWS[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z517TBM32_TEXT_MAXLENGTH != T000K2_A517TBM32_TEXT_MAXLENGTH[0] ) || ( Z518TBM32_DECIMAL_DIGITS != T000K2_A518TBM32_DECIMAL_DIGITS[0] ) || ( GXutil.strcmp(Z522TBM32_CHK_TRUE_INNER_VALUE, T000K2_A522TBM32_CHK_TRUE_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z523TBM32_CHK_FALSE_INNER_VALUE, T000K2_A523TBM32_CHK_FALSE_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z527TBM32_FIXED_VALUE, T000K2_A527TBM32_FIXED_VALUE[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z525TBM32_LIST_CD, T000K2_A525TBM32_LIST_CD[0]) != 0 ) || ( GXutil.strcmp(Z526TBM32_IMAGE_CD, T000K2_A526TBM32_IMAGE_CD[0]) != 0 ) || ( GXutil.strcmp(Z524TBM32_TEXT, T000K2_A524TBM32_TEXT[0]) != 0 ) || ( Z513TBM32_FONT_SIZE != T000K2_A513TBM32_FONT_SIZE[0] ) || ( GXutil.strcmp(Z514TBM32_FONT_UL_FLG, T000K2_A514TBM32_FONT_UL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z515TBM32_FONT_COLOR_DIV != T000K2_A515TBM32_FONT_COLOR_DIV[0] ) || ( Z521TBM32_LINE_SIZE_DIV != T000K2_A521TBM32_LINE_SIZE_DIV[0] ) || ( Z689TBM32_LINE_COLOR_DIV != T000K2_A689TBM32_LINE_COLOR_DIV[0] ) || ( GXutil.strcmp(Z519TBM32_LINE_START_POINT_DIV, T000K2_A519TBM32_LINE_START_POINT_DIV[0]) != 0 ) || ( GXutil.strcmp(Z520TBM32_LINE_END_POINT_DIV, T000K2_A520TBM32_LINE_END_POINT_DIV[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z690TBM32_LINE_ANGLE != T000K2_A690TBM32_LINE_ANGLE[0] ) || ( Z644TBM32_AUTH_LVL_MIN != T000K2_A644TBM32_AUTH_LVL_MIN[0] ) || ( Z645TBM32_ZORDER != T000K2_A645TBM32_ZORDER[0] ) || ( Z691TBM32_TAB_ORDER != T000K2_A691TBM32_TAB_ORDER[0] ) || ( GXutil.strcmp(Z692TBM32_TABSTOP_FLG, T000K2_A692TBM32_TABSTOP_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z693TBM32_REQUIRED_INPUT_FLG, T000K2_A693TBM32_REQUIRED_INPUT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z694TBM32_MIN_VALUE, T000K2_A694TBM32_MIN_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z695TBM32_MAX_VALUE, T000K2_A695TBM32_MAX_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z406TBM32_CRF_ITEM_NOTE, T000K2_A406TBM32_CRF_ITEM_NOTE[0]) != 0 ) || ( Z774TBM32_REF_CRF_ID != T000K2_A774TBM32_REF_CRF_ID[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z775TBM32_REF_CRF_ITEM_CD, T000K2_A775TBM32_REF_CRF_ITEM_CD[0]) != 0 ) || ( GXutil.strcmp(Z75TBM32_DEL_FLG, T000K2_A75TBM32_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z409TBM32_CRT_PROG_NM, T000K2_A409TBM32_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z412TBM32_UPD_PROG_NM, T000K2_A412TBM32_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM32_CRF_ITEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0K19( )
   {
      beforeValidate0K19( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0K19( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0K19( 0) ;
         checkOptimisticConcurrency0K19( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0K19( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0K19( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000K8 */
                  pr_default.execute(6, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD, new Boolean(n407TBM32_CRT_DATETIME), A407TBM32_CRT_DATETIME, new Boolean(n408TBM32_CRT_USER_ID), A408TBM32_CRT_USER_ID, new Boolean(n410TBM32_UPD_DATETIME), A410TBM32_UPD_DATETIME, new Boolean(n411TBM32_UPD_USER_ID), A411TBM32_UPD_USER_ID, new Boolean(n413TBM32_UPD_CNT), new Long(A413TBM32_UPD_CNT), new Boolean(n405TBM32_CRF_ITEM_NM), A405TBM32_CRF_ITEM_NM, new Boolean(n74TBM32_CRF_ITEM_DIV), A74TBM32_CRF_ITEM_DIV, new Boolean(n73TBM32_CRF_ITEM_GRP_CD), A73TBM32_CRF_ITEM_GRP_CD, new Boolean(n507TBM32_CRF_ITEM_GRP_ORDER), new Short(A507TBM32_CRF_ITEM_GRP_ORDER), new Boolean(n508TBM32_LOCATION_X), new Short(A508TBM32_LOCATION_X), new Boolean(n509TBM32_LOCATION_Y), new Short(A509TBM32_LOCATION_Y), new Boolean(n510TBM32_LOCATION_X2), new Short(A510TBM32_LOCATION_X2), new Boolean(n511TBM32_LOCATION_Y2), new Short(A511TBM32_LOCATION_Y2), new Boolean(n512TBM32_TEXT_ALIGN_DIV), A512TBM32_TEXT_ALIGN_DIV, new Boolean(n516TBM32_TEXT_MAXROWS), new Byte(A516TBM32_TEXT_MAXROWS), new Boolean(n517TBM32_TEXT_MAXLENGTH), new Short(A517TBM32_TEXT_MAXLENGTH), new Boolean(n518TBM32_DECIMAL_DIGITS), new Byte(A518TBM32_DECIMAL_DIGITS), new Boolean(n522TBM32_CHK_TRUE_INNER_VALUE), A522TBM32_CHK_TRUE_INNER_VALUE, new Boolean(n523TBM32_CHK_FALSE_INNER_VALUE), A523TBM32_CHK_FALSE_INNER_VALUE, new Boolean(n527TBM32_FIXED_VALUE), A527TBM32_FIXED_VALUE, new Boolean(n525TBM32_LIST_CD), A525TBM32_LIST_CD, new Boolean(n526TBM32_IMAGE_CD), A526TBM32_IMAGE_CD, new Boolean(n524TBM32_TEXT), A524TBM32_TEXT, new Boolean(n513TBM32_FONT_SIZE), new Byte(A513TBM32_FONT_SIZE), new Boolean(n514TBM32_FONT_UL_FLG), A514TBM32_FONT_UL_FLG, new Boolean(n515TBM32_FONT_COLOR_DIV), new Long(A515TBM32_FONT_COLOR_DIV), new Boolean(n521TBM32_LINE_SIZE_DIV), new Byte(A521TBM32_LINE_SIZE_DIV), new Boolean(n689TBM32_LINE_COLOR_DIV), new Long(A689TBM32_LINE_COLOR_DIV), new Boolean(n519TBM32_LINE_START_POINT_DIV), A519TBM32_LINE_START_POINT_DIV, new Boolean(n520TBM32_LINE_END_POINT_DIV), A520TBM32_LINE_END_POINT_DIV, new Boolean(n690TBM32_LINE_ANGLE), new Short(A690TBM32_LINE_ANGLE), new Boolean(n644TBM32_AUTH_LVL_MIN), new Byte(A644TBM32_AUTH_LVL_MIN), new Boolean(n645TBM32_ZORDER), new Short(A645TBM32_ZORDER), new Boolean(n691TBM32_TAB_ORDER), new Short(A691TBM32_TAB_ORDER), new Boolean(n692TBM32_TABSTOP_FLG), A692TBM32_TABSTOP_FLG, new Boolean(n693TBM32_REQUIRED_INPUT_FLG), A693TBM32_REQUIRED_INPUT_FLG, new Boolean(n694TBM32_MIN_VALUE), A694TBM32_MIN_VALUE, new Boolean(n695TBM32_MAX_VALUE), A695TBM32_MAX_VALUE, new Boolean(n406TBM32_CRF_ITEM_NOTE), A406TBM32_CRF_ITEM_NOTE, new Boolean(n774TBM32_REF_CRF_ID), new Short(A774TBM32_REF_CRF_ID), new Boolean(n775TBM32_REF_CRF_ITEM_CD), A775TBM32_REF_CRF_ITEM_CD, new Boolean(n75TBM32_DEL_FLG), A75TBM32_DEL_FLG, new Boolean(n409TBM32_CRT_PROG_NM), A409TBM32_CRT_PROG_NM, new Boolean(n412TBM32_UPD_PROG_NM), A412TBM32_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM32_CRF_ITEM") ;
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
                        resetCaption0K0( ) ;
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
            load0K19( ) ;
         }
         endLevel0K19( ) ;
      }
      closeExtendedTableCursors0K19( ) ;
   }

   public void update0K19( )
   {
      beforeValidate0K19( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0K19( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0K19( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0K19( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0K19( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000K9 */
                  pr_default.execute(7, new Object[] {new Boolean(n407TBM32_CRT_DATETIME), A407TBM32_CRT_DATETIME, new Boolean(n408TBM32_CRT_USER_ID), A408TBM32_CRT_USER_ID, new Boolean(n410TBM32_UPD_DATETIME), A410TBM32_UPD_DATETIME, new Boolean(n411TBM32_UPD_USER_ID), A411TBM32_UPD_USER_ID, new Boolean(n413TBM32_UPD_CNT), new Long(A413TBM32_UPD_CNT), new Boolean(n405TBM32_CRF_ITEM_NM), A405TBM32_CRF_ITEM_NM, new Boolean(n74TBM32_CRF_ITEM_DIV), A74TBM32_CRF_ITEM_DIV, new Boolean(n73TBM32_CRF_ITEM_GRP_CD), A73TBM32_CRF_ITEM_GRP_CD, new Boolean(n507TBM32_CRF_ITEM_GRP_ORDER), new Short(A507TBM32_CRF_ITEM_GRP_ORDER), new Boolean(n508TBM32_LOCATION_X), new Short(A508TBM32_LOCATION_X), new Boolean(n509TBM32_LOCATION_Y), new Short(A509TBM32_LOCATION_Y), new Boolean(n510TBM32_LOCATION_X2), new Short(A510TBM32_LOCATION_X2), new Boolean(n511TBM32_LOCATION_Y2), new Short(A511TBM32_LOCATION_Y2), new Boolean(n512TBM32_TEXT_ALIGN_DIV), A512TBM32_TEXT_ALIGN_DIV, new Boolean(n516TBM32_TEXT_MAXROWS), new Byte(A516TBM32_TEXT_MAXROWS), new Boolean(n517TBM32_TEXT_MAXLENGTH), new Short(A517TBM32_TEXT_MAXLENGTH), new Boolean(n518TBM32_DECIMAL_DIGITS), new Byte(A518TBM32_DECIMAL_DIGITS), new Boolean(n522TBM32_CHK_TRUE_INNER_VALUE), A522TBM32_CHK_TRUE_INNER_VALUE, new Boolean(n523TBM32_CHK_FALSE_INNER_VALUE), A523TBM32_CHK_FALSE_INNER_VALUE, new Boolean(n527TBM32_FIXED_VALUE), A527TBM32_FIXED_VALUE, new Boolean(n525TBM32_LIST_CD), A525TBM32_LIST_CD, new Boolean(n526TBM32_IMAGE_CD), A526TBM32_IMAGE_CD, new Boolean(n524TBM32_TEXT), A524TBM32_TEXT, new Boolean(n513TBM32_FONT_SIZE), new Byte(A513TBM32_FONT_SIZE), new Boolean(n514TBM32_FONT_UL_FLG), A514TBM32_FONT_UL_FLG, new Boolean(n515TBM32_FONT_COLOR_DIV), new Long(A515TBM32_FONT_COLOR_DIV), new Boolean(n521TBM32_LINE_SIZE_DIV), new Byte(A521TBM32_LINE_SIZE_DIV), new Boolean(n689TBM32_LINE_COLOR_DIV), new Long(A689TBM32_LINE_COLOR_DIV), new Boolean(n519TBM32_LINE_START_POINT_DIV), A519TBM32_LINE_START_POINT_DIV, new Boolean(n520TBM32_LINE_END_POINT_DIV), A520TBM32_LINE_END_POINT_DIV, new Boolean(n690TBM32_LINE_ANGLE), new Short(A690TBM32_LINE_ANGLE), new Boolean(n644TBM32_AUTH_LVL_MIN), new Byte(A644TBM32_AUTH_LVL_MIN), new Boolean(n645TBM32_ZORDER), new Short(A645TBM32_ZORDER), new Boolean(n691TBM32_TAB_ORDER), new Short(A691TBM32_TAB_ORDER), new Boolean(n692TBM32_TABSTOP_FLG), A692TBM32_TABSTOP_FLG, new Boolean(n693TBM32_REQUIRED_INPUT_FLG), A693TBM32_REQUIRED_INPUT_FLG, new Boolean(n694TBM32_MIN_VALUE), A694TBM32_MIN_VALUE, new Boolean(n695TBM32_MAX_VALUE), A695TBM32_MAX_VALUE, new Boolean(n406TBM32_CRF_ITEM_NOTE), A406TBM32_CRF_ITEM_NOTE, new Boolean(n774TBM32_REF_CRF_ID), new Short(A774TBM32_REF_CRF_ID), new Boolean(n775TBM32_REF_CRF_ITEM_CD), A775TBM32_REF_CRF_ITEM_CD, new Boolean(n75TBM32_DEL_FLG), A75TBM32_DEL_FLG, new Boolean(n409TBM32_CRT_PROG_NM), A409TBM32_CRT_PROG_NM, new Boolean(n412TBM32_UPD_PROG_NM), A412TBM32_UPD_PROG_NM, new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM32_CRF_ITEM") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM32_CRF_ITEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0K19( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0K0( ) ;
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
         endLevel0K19( ) ;
      }
      closeExtendedTableCursors0K19( ) ;
   }

   public void deferredUpdate0K19( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0K19( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0K19( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0K19( ) ;
         afterConfirm0K19( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0K19( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000K10 */
               pr_default.execute(8, new Object[] {new Long(A70TBM32_STUDY_ID), new Short(A71TBM32_CRF_ID), A72TBM32_CRF_ITEM_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM32_CRF_ITEM") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound19 == 0 )
                     {
                        initAll0K19( ) ;
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
                     resetCaption0K0( ) ;
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
      sMode19 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0K19( ) ;
      Gx_mode = sMode19 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0K19( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM32_CRF_ITEM" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0K19( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0K19( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm32_crf_item");
         if ( AnyError == 0 )
         {
            confirmValues0K0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm32_crf_item");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0K19( )
   {
      /* Scan By routine */
      /* Using cursor T000K11 */
      pr_default.execute(9);
      RcdFound19 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound19 = (short)(1) ;
         A70TBM32_STUDY_ID = T000K11_A70TBM32_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
         A71TBM32_CRF_ID = T000K11_A71TBM32_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
         A72TBM32_CRF_ITEM_CD = T000K11_A72TBM32_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A72TBM32_CRF_ITEM_CD", A72TBM32_CRF_ITEM_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0K19( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound19 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound19 = (short)(1) ;
         A70TBM32_STUDY_ID = T000K11_A70TBM32_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
         A71TBM32_CRF_ID = T000K11_A71TBM32_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
         A72TBM32_CRF_ITEM_CD = T000K11_A72TBM32_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A72TBM32_CRF_ITEM_CD", A72TBM32_CRF_ITEM_CD);
      }
   }

   public void scanEnd0K19( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0K19( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0K19( )
   {
      /* Before Insert Rules */
      A407TBM32_CRT_DATETIME = GXutil.now( ) ;
      n407TBM32_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407TBM32_CRT_DATETIME", localUtil.ttoc( A407TBM32_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A408TBM32_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm32_crf_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A408TBM32_CRT_USER_ID = GXt_char1 ;
      n408TBM32_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A408TBM32_CRT_USER_ID", A408TBM32_CRT_USER_ID);
      A410TBM32_UPD_DATETIME = GXutil.now( ) ;
      n410TBM32_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A410TBM32_UPD_DATETIME", localUtil.ttoc( A410TBM32_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A411TBM32_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm32_crf_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A411TBM32_UPD_USER_ID = GXt_char1 ;
      n411TBM32_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A411TBM32_UPD_USER_ID", A411TBM32_UPD_USER_ID);
      A413TBM32_UPD_CNT = (long)(O413TBM32_UPD_CNT+1) ;
      n413TBM32_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A413TBM32_UPD_CNT", GXutil.ltrim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0K19( )
   {
      /* Before Update Rules */
      A410TBM32_UPD_DATETIME = GXutil.now( ) ;
      n410TBM32_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A410TBM32_UPD_DATETIME", localUtil.ttoc( A410TBM32_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A411TBM32_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm32_crf_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A411TBM32_UPD_USER_ID = GXt_char1 ;
      n411TBM32_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A411TBM32_UPD_USER_ID", A411TBM32_UPD_USER_ID);
      A413TBM32_UPD_CNT = (long)(O413TBM32_UPD_CNT+1) ;
      n413TBM32_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A413TBM32_UPD_CNT", GXutil.ltrim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0K19( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0K19( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0K19( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0K19( )
   {
      edtTBM32_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_STUDY_ID_Enabled, 5, 0)));
      edtTBM32_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CRF_ID_Enabled, 5, 0)));
      edtTBM32_CRF_ITEM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CRF_ITEM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CRF_ITEM_CD_Enabled, 5, 0)));
      edtTBM32_CRF_ITEM_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CRF_ITEM_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CRF_ITEM_NM_Enabled, 5, 0)));
      edtTBM32_CRF_ITEM_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CRF_ITEM_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CRF_ITEM_DIV_Enabled, 5, 0)));
      edtTBM32_CRF_ITEM_GRP_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CRF_ITEM_GRP_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CRF_ITEM_GRP_CD_Enabled, 5, 0)));
      edtTBM32_CRF_ITEM_GRP_ORDER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CRF_ITEM_GRP_ORDER_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CRF_ITEM_GRP_ORDER_Enabled, 5, 0)));
      edtTBM32_LOCATION_X_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_LOCATION_X_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_LOCATION_X_Enabled, 5, 0)));
      edtTBM32_LOCATION_Y_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_LOCATION_Y_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_LOCATION_Y_Enabled, 5, 0)));
      edtTBM32_LOCATION_X2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_LOCATION_X2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_LOCATION_X2_Enabled, 5, 0)));
      edtTBM32_LOCATION_Y2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_LOCATION_Y2_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_LOCATION_Y2_Enabled, 5, 0)));
      edtTBM32_TEXT_ALIGN_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_TEXT_ALIGN_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_TEXT_ALIGN_DIV_Enabled, 5, 0)));
      edtTBM32_TEXT_MAXROWS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_TEXT_MAXROWS_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_TEXT_MAXROWS_Enabled, 5, 0)));
      edtTBM32_TEXT_MAXLENGTH_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_TEXT_MAXLENGTH_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_TEXT_MAXLENGTH_Enabled, 5, 0)));
      edtTBM32_DECIMAL_DIGITS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_DECIMAL_DIGITS_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_DECIMAL_DIGITS_Enabled, 5, 0)));
      edtTBM32_CHK_TRUE_INNER_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CHK_TRUE_INNER_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CHK_TRUE_INNER_VALUE_Enabled, 5, 0)));
      edtTBM32_CHK_FALSE_INNER_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CHK_FALSE_INNER_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CHK_FALSE_INNER_VALUE_Enabled, 5, 0)));
      edtTBM32_FIXED_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_FIXED_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_FIXED_VALUE_Enabled, 5, 0)));
      edtTBM32_LIST_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_LIST_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_LIST_CD_Enabled, 5, 0)));
      edtTBM32_IMAGE_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_IMAGE_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_IMAGE_CD_Enabled, 5, 0)));
      edtTBM32_TEXT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_TEXT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_TEXT_Enabled, 5, 0)));
      edtTBM32_FONT_SIZE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_FONT_SIZE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_FONT_SIZE_Enabled, 5, 0)));
      edtTBM32_FONT_UL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_FONT_UL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_FONT_UL_FLG_Enabled, 5, 0)));
      edtTBM32_FONT_COLOR_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_FONT_COLOR_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_FONT_COLOR_DIV_Enabled, 5, 0)));
      edtTBM32_LINE_SIZE_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_LINE_SIZE_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_LINE_SIZE_DIV_Enabled, 5, 0)));
      edtTBM32_LINE_COLOR_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_LINE_COLOR_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_LINE_COLOR_DIV_Enabled, 5, 0)));
      edtTBM32_LINE_START_POINT_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_LINE_START_POINT_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_LINE_START_POINT_DIV_Enabled, 5, 0)));
      edtTBM32_LINE_END_POINT_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_LINE_END_POINT_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_LINE_END_POINT_DIV_Enabled, 5, 0)));
      edtTBM32_LINE_ANGLE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_LINE_ANGLE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_LINE_ANGLE_Enabled, 5, 0)));
      edtTBM32_AUTH_LVL_MIN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_AUTH_LVL_MIN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_AUTH_LVL_MIN_Enabled, 5, 0)));
      edtTBM32_ZORDER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_ZORDER_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_ZORDER_Enabled, 5, 0)));
      edtTBM32_TAB_ORDER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_TAB_ORDER_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_TAB_ORDER_Enabled, 5, 0)));
      edtTBM32_TABSTOP_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_TABSTOP_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_TABSTOP_FLG_Enabled, 5, 0)));
      edtTBM32_REQUIRED_INPUT_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_REQUIRED_INPUT_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_REQUIRED_INPUT_FLG_Enabled, 5, 0)));
      edtTBM32_MIN_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_MIN_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_MIN_VALUE_Enabled, 5, 0)));
      edtTBM32_MAX_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_MAX_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_MAX_VALUE_Enabled, 5, 0)));
      edtTBM32_CRF_ITEM_NOTE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CRF_ITEM_NOTE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CRF_ITEM_NOTE_Enabled, 5, 0)));
      edtTBM32_REF_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_REF_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_REF_CRF_ID_Enabled, 5, 0)));
      edtTBM32_REF_CRF_ITEM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_REF_CRF_ITEM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_REF_CRF_ITEM_CD_Enabled, 5, 0)));
      edtTBM32_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_DEL_FLG_Enabled, 5, 0)));
      edtTBM32_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM32_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM32_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM32_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM32_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM32_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM32_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM32_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM32_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0K0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRF項目マスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513193311");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm32_crf_item") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0K19( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z70TBM32_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z70TBM32_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z71TBM32_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z71TBM32_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z72TBM32_CRF_ITEM_CD", GXutil.rtrim( Z72TBM32_CRF_ITEM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z407TBM32_CRT_DATETIME", localUtil.ttoc( Z407TBM32_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z408TBM32_CRT_USER_ID", GXutil.rtrim( Z408TBM32_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z410TBM32_UPD_DATETIME", localUtil.ttoc( Z410TBM32_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z411TBM32_UPD_USER_ID", GXutil.rtrim( Z411TBM32_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z413TBM32_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z413TBM32_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z405TBM32_CRF_ITEM_NM", GXutil.rtrim( Z405TBM32_CRF_ITEM_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z74TBM32_CRF_ITEM_DIV", GXutil.rtrim( Z74TBM32_CRF_ITEM_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z73TBM32_CRF_ITEM_GRP_CD", GXutil.rtrim( Z73TBM32_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z507TBM32_CRF_ITEM_GRP_ORDER", GXutil.ltrim( localUtil.ntoc( Z507TBM32_CRF_ITEM_GRP_ORDER, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z508TBM32_LOCATION_X", GXutil.ltrim( localUtil.ntoc( Z508TBM32_LOCATION_X, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z509TBM32_LOCATION_Y", GXutil.ltrim( localUtil.ntoc( Z509TBM32_LOCATION_Y, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z510TBM32_LOCATION_X2", GXutil.ltrim( localUtil.ntoc( Z510TBM32_LOCATION_X2, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z511TBM32_LOCATION_Y2", GXutil.ltrim( localUtil.ntoc( Z511TBM32_LOCATION_Y2, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z512TBM32_TEXT_ALIGN_DIV", GXutil.rtrim( Z512TBM32_TEXT_ALIGN_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z516TBM32_TEXT_MAXROWS", GXutil.ltrim( localUtil.ntoc( Z516TBM32_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z517TBM32_TEXT_MAXLENGTH", GXutil.ltrim( localUtil.ntoc( Z517TBM32_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z518TBM32_DECIMAL_DIGITS", GXutil.ltrim( localUtil.ntoc( Z518TBM32_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z522TBM32_CHK_TRUE_INNER_VALUE", GXutil.rtrim( Z522TBM32_CHK_TRUE_INNER_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z523TBM32_CHK_FALSE_INNER_VALUE", GXutil.rtrim( Z523TBM32_CHK_FALSE_INNER_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z527TBM32_FIXED_VALUE", GXutil.rtrim( Z527TBM32_FIXED_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z525TBM32_LIST_CD", GXutil.rtrim( Z525TBM32_LIST_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z526TBM32_IMAGE_CD", GXutil.rtrim( Z526TBM32_IMAGE_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z524TBM32_TEXT", GXutil.rtrim( Z524TBM32_TEXT));
      GxWebStd.gx_hidden_field( httpContext, "Z513TBM32_FONT_SIZE", GXutil.ltrim( localUtil.ntoc( Z513TBM32_FONT_SIZE, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z514TBM32_FONT_UL_FLG", GXutil.rtrim( Z514TBM32_FONT_UL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z515TBM32_FONT_COLOR_DIV", GXutil.ltrim( localUtil.ntoc( Z515TBM32_FONT_COLOR_DIV, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z521TBM32_LINE_SIZE_DIV", GXutil.ltrim( localUtil.ntoc( Z521TBM32_LINE_SIZE_DIV, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z689TBM32_LINE_COLOR_DIV", GXutil.ltrim( localUtil.ntoc( Z689TBM32_LINE_COLOR_DIV, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z519TBM32_LINE_START_POINT_DIV", GXutil.rtrim( Z519TBM32_LINE_START_POINT_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z520TBM32_LINE_END_POINT_DIV", GXutil.rtrim( Z520TBM32_LINE_END_POINT_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z690TBM32_LINE_ANGLE", GXutil.ltrim( localUtil.ntoc( Z690TBM32_LINE_ANGLE, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z644TBM32_AUTH_LVL_MIN", GXutil.ltrim( localUtil.ntoc( Z644TBM32_AUTH_LVL_MIN, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z645TBM32_ZORDER", GXutil.ltrim( localUtil.ntoc( Z645TBM32_ZORDER, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z691TBM32_TAB_ORDER", GXutil.ltrim( localUtil.ntoc( Z691TBM32_TAB_ORDER, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z692TBM32_TABSTOP_FLG", GXutil.rtrim( Z692TBM32_TABSTOP_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z693TBM32_REQUIRED_INPUT_FLG", GXutil.rtrim( Z693TBM32_REQUIRED_INPUT_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z694TBM32_MIN_VALUE", GXutil.rtrim( Z694TBM32_MIN_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z695TBM32_MAX_VALUE", GXutil.rtrim( Z695TBM32_MAX_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z406TBM32_CRF_ITEM_NOTE", GXutil.rtrim( Z406TBM32_CRF_ITEM_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z774TBM32_REF_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z774TBM32_REF_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z775TBM32_REF_CRF_ITEM_CD", GXutil.rtrim( Z775TBM32_REF_CRF_ITEM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z75TBM32_DEL_FLG", GXutil.rtrim( Z75TBM32_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z409TBM32_CRT_PROG_NM", GXutil.rtrim( Z409TBM32_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z412TBM32_UPD_PROG_NM", GXutil.rtrim( Z412TBM32_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O413TBM32_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O413TBM32_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM32_CRF_ITEM" ;
   }

   public String getPgmdesc( )
   {
      return "CRF項目マスタ" ;
   }

   public void initializeNonKey0K19( )
   {
      A407TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n407TBM32_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A407TBM32_CRT_DATETIME", localUtil.ttoc( A407TBM32_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n407TBM32_CRT_DATETIME = (GXutil.nullDate().equals(A407TBM32_CRT_DATETIME) ? true : false) ;
      A408TBM32_CRT_USER_ID = "" ;
      n408TBM32_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A408TBM32_CRT_USER_ID", A408TBM32_CRT_USER_ID);
      n408TBM32_CRT_USER_ID = ((GXutil.strcmp("", A408TBM32_CRT_USER_ID)==0) ? true : false) ;
      A410TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n410TBM32_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A410TBM32_UPD_DATETIME", localUtil.ttoc( A410TBM32_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n410TBM32_UPD_DATETIME = (GXutil.nullDate().equals(A410TBM32_UPD_DATETIME) ? true : false) ;
      A411TBM32_UPD_USER_ID = "" ;
      n411TBM32_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A411TBM32_UPD_USER_ID", A411TBM32_UPD_USER_ID);
      n411TBM32_UPD_USER_ID = ((GXutil.strcmp("", A411TBM32_UPD_USER_ID)==0) ? true : false) ;
      A413TBM32_UPD_CNT = 0 ;
      n413TBM32_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A413TBM32_UPD_CNT", GXutil.ltrim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)));
      n413TBM32_UPD_CNT = ((0==A413TBM32_UPD_CNT) ? true : false) ;
      A405TBM32_CRF_ITEM_NM = "" ;
      n405TBM32_CRF_ITEM_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A405TBM32_CRF_ITEM_NM", A405TBM32_CRF_ITEM_NM);
      n405TBM32_CRF_ITEM_NM = ((GXutil.strcmp("", A405TBM32_CRF_ITEM_NM)==0) ? true : false) ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      n74TBM32_CRF_ITEM_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A74TBM32_CRF_ITEM_DIV", A74TBM32_CRF_ITEM_DIV);
      n74TBM32_CRF_ITEM_DIV = ((GXutil.strcmp("", A74TBM32_CRF_ITEM_DIV)==0) ? true : false) ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      n73TBM32_CRF_ITEM_GRP_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A73TBM32_CRF_ITEM_GRP_CD", A73TBM32_CRF_ITEM_GRP_CD);
      n73TBM32_CRF_ITEM_GRP_CD = ((GXutil.strcmp("", A73TBM32_CRF_ITEM_GRP_CD)==0) ? true : false) ;
      A507TBM32_CRF_ITEM_GRP_ORDER = (short)(0) ;
      n507TBM32_CRF_ITEM_GRP_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A507TBM32_CRF_ITEM_GRP_ORDER", GXutil.ltrim( GXutil.str( A507TBM32_CRF_ITEM_GRP_ORDER, 3, 0)));
      n507TBM32_CRF_ITEM_GRP_ORDER = ((0==A507TBM32_CRF_ITEM_GRP_ORDER) ? true : false) ;
      A508TBM32_LOCATION_X = (short)(0) ;
      n508TBM32_LOCATION_X = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A508TBM32_LOCATION_X", GXutil.ltrim( GXutil.str( A508TBM32_LOCATION_X, 4, 0)));
      n508TBM32_LOCATION_X = ((0==A508TBM32_LOCATION_X) ? true : false) ;
      A509TBM32_LOCATION_Y = (short)(0) ;
      n509TBM32_LOCATION_Y = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A509TBM32_LOCATION_Y", GXutil.ltrim( GXutil.str( A509TBM32_LOCATION_Y, 4, 0)));
      n509TBM32_LOCATION_Y = ((0==A509TBM32_LOCATION_Y) ? true : false) ;
      A510TBM32_LOCATION_X2 = (short)(0) ;
      n510TBM32_LOCATION_X2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A510TBM32_LOCATION_X2", GXutil.ltrim( GXutil.str( A510TBM32_LOCATION_X2, 4, 0)));
      n510TBM32_LOCATION_X2 = ((0==A510TBM32_LOCATION_X2) ? true : false) ;
      A511TBM32_LOCATION_Y2 = (short)(0) ;
      n511TBM32_LOCATION_Y2 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A511TBM32_LOCATION_Y2", GXutil.ltrim( GXutil.str( A511TBM32_LOCATION_Y2, 4, 0)));
      n511TBM32_LOCATION_Y2 = ((0==A511TBM32_LOCATION_Y2) ? true : false) ;
      A512TBM32_TEXT_ALIGN_DIV = "" ;
      n512TBM32_TEXT_ALIGN_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A512TBM32_TEXT_ALIGN_DIV", A512TBM32_TEXT_ALIGN_DIV);
      n512TBM32_TEXT_ALIGN_DIV = ((GXutil.strcmp("", A512TBM32_TEXT_ALIGN_DIV)==0) ? true : false) ;
      A516TBM32_TEXT_MAXROWS = (byte)(0) ;
      n516TBM32_TEXT_MAXROWS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A516TBM32_TEXT_MAXROWS", GXutil.ltrim( GXutil.str( A516TBM32_TEXT_MAXROWS, 2, 0)));
      n516TBM32_TEXT_MAXROWS = ((0==A516TBM32_TEXT_MAXROWS) ? true : false) ;
      A517TBM32_TEXT_MAXLENGTH = (short)(0) ;
      n517TBM32_TEXT_MAXLENGTH = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A517TBM32_TEXT_MAXLENGTH", GXutil.ltrim( GXutil.str( A517TBM32_TEXT_MAXLENGTH, 3, 0)));
      n517TBM32_TEXT_MAXLENGTH = ((0==A517TBM32_TEXT_MAXLENGTH) ? true : false) ;
      A518TBM32_DECIMAL_DIGITS = (byte)(0) ;
      n518TBM32_DECIMAL_DIGITS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A518TBM32_DECIMAL_DIGITS", GXutil.ltrim( GXutil.str( A518TBM32_DECIMAL_DIGITS, 2, 0)));
      n518TBM32_DECIMAL_DIGITS = ((0==A518TBM32_DECIMAL_DIGITS) ? true : false) ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      n522TBM32_CHK_TRUE_INNER_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A522TBM32_CHK_TRUE_INNER_VALUE", A522TBM32_CHK_TRUE_INNER_VALUE);
      n522TBM32_CHK_TRUE_INNER_VALUE = ((GXutil.strcmp("", A522TBM32_CHK_TRUE_INNER_VALUE)==0) ? true : false) ;
      A523TBM32_CHK_FALSE_INNER_VALUE = "" ;
      n523TBM32_CHK_FALSE_INNER_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A523TBM32_CHK_FALSE_INNER_VALUE", A523TBM32_CHK_FALSE_INNER_VALUE);
      n523TBM32_CHK_FALSE_INNER_VALUE = ((GXutil.strcmp("", A523TBM32_CHK_FALSE_INNER_VALUE)==0) ? true : false) ;
      A527TBM32_FIXED_VALUE = "" ;
      n527TBM32_FIXED_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A527TBM32_FIXED_VALUE", A527TBM32_FIXED_VALUE);
      n527TBM32_FIXED_VALUE = ((GXutil.strcmp("", A527TBM32_FIXED_VALUE)==0) ? true : false) ;
      A525TBM32_LIST_CD = "" ;
      n525TBM32_LIST_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A525TBM32_LIST_CD", A525TBM32_LIST_CD);
      n525TBM32_LIST_CD = ((GXutil.strcmp("", A525TBM32_LIST_CD)==0) ? true : false) ;
      A526TBM32_IMAGE_CD = "" ;
      n526TBM32_IMAGE_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A526TBM32_IMAGE_CD", A526TBM32_IMAGE_CD);
      n526TBM32_IMAGE_CD = ((GXutil.strcmp("", A526TBM32_IMAGE_CD)==0) ? true : false) ;
      A524TBM32_TEXT = "" ;
      n524TBM32_TEXT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A524TBM32_TEXT", A524TBM32_TEXT);
      n524TBM32_TEXT = ((GXutil.strcmp("", A524TBM32_TEXT)==0) ? true : false) ;
      A513TBM32_FONT_SIZE = (byte)(0) ;
      n513TBM32_FONT_SIZE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A513TBM32_FONT_SIZE", GXutil.ltrim( GXutil.str( A513TBM32_FONT_SIZE, 2, 0)));
      n513TBM32_FONT_SIZE = ((0==A513TBM32_FONT_SIZE) ? true : false) ;
      A514TBM32_FONT_UL_FLG = "" ;
      n514TBM32_FONT_UL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A514TBM32_FONT_UL_FLG", A514TBM32_FONT_UL_FLG);
      n514TBM32_FONT_UL_FLG = ((GXutil.strcmp("", A514TBM32_FONT_UL_FLG)==0) ? true : false) ;
      A515TBM32_FONT_COLOR_DIV = 0 ;
      n515TBM32_FONT_COLOR_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A515TBM32_FONT_COLOR_DIV", GXutil.ltrim( GXutil.str( A515TBM32_FONT_COLOR_DIV, 10, 0)));
      n515TBM32_FONT_COLOR_DIV = ((0==A515TBM32_FONT_COLOR_DIV) ? true : false) ;
      A521TBM32_LINE_SIZE_DIV = (byte)(0) ;
      n521TBM32_LINE_SIZE_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A521TBM32_LINE_SIZE_DIV", GXutil.ltrim( GXutil.str( A521TBM32_LINE_SIZE_DIV, 2, 0)));
      n521TBM32_LINE_SIZE_DIV = ((0==A521TBM32_LINE_SIZE_DIV) ? true : false) ;
      A689TBM32_LINE_COLOR_DIV = 0 ;
      n689TBM32_LINE_COLOR_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A689TBM32_LINE_COLOR_DIV", GXutil.ltrim( GXutil.str( A689TBM32_LINE_COLOR_DIV, 10, 0)));
      n689TBM32_LINE_COLOR_DIV = ((0==A689TBM32_LINE_COLOR_DIV) ? true : false) ;
      A519TBM32_LINE_START_POINT_DIV = "" ;
      n519TBM32_LINE_START_POINT_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A519TBM32_LINE_START_POINT_DIV", A519TBM32_LINE_START_POINT_DIV);
      n519TBM32_LINE_START_POINT_DIV = ((GXutil.strcmp("", A519TBM32_LINE_START_POINT_DIV)==0) ? true : false) ;
      A520TBM32_LINE_END_POINT_DIV = "" ;
      n520TBM32_LINE_END_POINT_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A520TBM32_LINE_END_POINT_DIV", A520TBM32_LINE_END_POINT_DIV);
      n520TBM32_LINE_END_POINT_DIV = ((GXutil.strcmp("", A520TBM32_LINE_END_POINT_DIV)==0) ? true : false) ;
      A690TBM32_LINE_ANGLE = (short)(0) ;
      n690TBM32_LINE_ANGLE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A690TBM32_LINE_ANGLE", GXutil.ltrim( GXutil.str( A690TBM32_LINE_ANGLE, 4, 0)));
      n690TBM32_LINE_ANGLE = ((0==A690TBM32_LINE_ANGLE) ? true : false) ;
      A644TBM32_AUTH_LVL_MIN = (byte)(0) ;
      n644TBM32_AUTH_LVL_MIN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A644TBM32_AUTH_LVL_MIN", GXutil.ltrim( GXutil.str( A644TBM32_AUTH_LVL_MIN, 2, 0)));
      n644TBM32_AUTH_LVL_MIN = ((0==A644TBM32_AUTH_LVL_MIN) ? true : false) ;
      A645TBM32_ZORDER = (short)(0) ;
      n645TBM32_ZORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A645TBM32_ZORDER", GXutil.ltrim( GXutil.str( A645TBM32_ZORDER, 3, 0)));
      n645TBM32_ZORDER = ((0==A645TBM32_ZORDER) ? true : false) ;
      A691TBM32_TAB_ORDER = (short)(0) ;
      n691TBM32_TAB_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A691TBM32_TAB_ORDER", GXutil.ltrim( GXutil.str( A691TBM32_TAB_ORDER, 3, 0)));
      n691TBM32_TAB_ORDER = ((0==A691TBM32_TAB_ORDER) ? true : false) ;
      A692TBM32_TABSTOP_FLG = "" ;
      n692TBM32_TABSTOP_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A692TBM32_TABSTOP_FLG", A692TBM32_TABSTOP_FLG);
      n692TBM32_TABSTOP_FLG = ((GXutil.strcmp("", A692TBM32_TABSTOP_FLG)==0) ? true : false) ;
      A693TBM32_REQUIRED_INPUT_FLG = "" ;
      n693TBM32_REQUIRED_INPUT_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A693TBM32_REQUIRED_INPUT_FLG", A693TBM32_REQUIRED_INPUT_FLG);
      n693TBM32_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A693TBM32_REQUIRED_INPUT_FLG)==0) ? true : false) ;
      A694TBM32_MIN_VALUE = "" ;
      n694TBM32_MIN_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A694TBM32_MIN_VALUE", A694TBM32_MIN_VALUE);
      n694TBM32_MIN_VALUE = ((GXutil.strcmp("", A694TBM32_MIN_VALUE)==0) ? true : false) ;
      A695TBM32_MAX_VALUE = "" ;
      n695TBM32_MAX_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A695TBM32_MAX_VALUE", A695TBM32_MAX_VALUE);
      n695TBM32_MAX_VALUE = ((GXutil.strcmp("", A695TBM32_MAX_VALUE)==0) ? true : false) ;
      A406TBM32_CRF_ITEM_NOTE = "" ;
      n406TBM32_CRF_ITEM_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A406TBM32_CRF_ITEM_NOTE", A406TBM32_CRF_ITEM_NOTE);
      n406TBM32_CRF_ITEM_NOTE = ((GXutil.strcmp("", A406TBM32_CRF_ITEM_NOTE)==0) ? true : false) ;
      A774TBM32_REF_CRF_ID = (short)(0) ;
      n774TBM32_REF_CRF_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A774TBM32_REF_CRF_ID", GXutil.ltrim( GXutil.str( A774TBM32_REF_CRF_ID, 4, 0)));
      n774TBM32_REF_CRF_ID = ((0==A774TBM32_REF_CRF_ID) ? true : false) ;
      A775TBM32_REF_CRF_ITEM_CD = "" ;
      n775TBM32_REF_CRF_ITEM_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A775TBM32_REF_CRF_ITEM_CD", A775TBM32_REF_CRF_ITEM_CD);
      n775TBM32_REF_CRF_ITEM_CD = ((GXutil.strcmp("", A775TBM32_REF_CRF_ITEM_CD)==0) ? true : false) ;
      A75TBM32_DEL_FLG = "" ;
      n75TBM32_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A75TBM32_DEL_FLG", A75TBM32_DEL_FLG);
      n75TBM32_DEL_FLG = ((GXutil.strcmp("", A75TBM32_DEL_FLG)==0) ? true : false) ;
      A409TBM32_CRT_PROG_NM = "" ;
      n409TBM32_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A409TBM32_CRT_PROG_NM", A409TBM32_CRT_PROG_NM);
      n409TBM32_CRT_PROG_NM = ((GXutil.strcmp("", A409TBM32_CRT_PROG_NM)==0) ? true : false) ;
      A412TBM32_UPD_PROG_NM = "" ;
      n412TBM32_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A412TBM32_UPD_PROG_NM", A412TBM32_UPD_PROG_NM);
      n412TBM32_UPD_PROG_NM = ((GXutil.strcmp("", A412TBM32_UPD_PROG_NM)==0) ? true : false) ;
      O413TBM32_UPD_CNT = A413TBM32_UPD_CNT ;
      n413TBM32_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A413TBM32_UPD_CNT", GXutil.ltrim( GXutil.str( A413TBM32_UPD_CNT, 10, 0)));
   }

   public void initAll0K19( )
   {
      A70TBM32_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A70TBM32_STUDY_ID", GXutil.ltrim( GXutil.str( A70TBM32_STUDY_ID, 10, 0)));
      A71TBM32_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A71TBM32_CRF_ID", GXutil.ltrim( GXutil.str( A71TBM32_CRF_ID, 4, 0)));
      A72TBM32_CRF_ITEM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A72TBM32_CRF_ITEM_CD", A72TBM32_CRF_ITEM_CD);
      initializeNonKey0K19( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513193329");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm32_crf_item.js", "?202071513193329");
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
      lblTextblocktbm32_study_id_Internalname = "TEXTBLOCKTBM32_STUDY_ID" ;
      edtTBM32_STUDY_ID_Internalname = "TBM32_STUDY_ID" ;
      lblTextblocktbm32_crf_id_Internalname = "TEXTBLOCKTBM32_CRF_ID" ;
      edtTBM32_CRF_ID_Internalname = "TBM32_CRF_ID" ;
      lblTextblocktbm32_crf_item_cd_Internalname = "TEXTBLOCKTBM32_CRF_ITEM_CD" ;
      edtTBM32_CRF_ITEM_CD_Internalname = "TBM32_CRF_ITEM_CD" ;
      lblTextblocktbm32_crf_item_nm_Internalname = "TEXTBLOCKTBM32_CRF_ITEM_NM" ;
      edtTBM32_CRF_ITEM_NM_Internalname = "TBM32_CRF_ITEM_NM" ;
      lblTextblocktbm32_crf_item_div_Internalname = "TEXTBLOCKTBM32_CRF_ITEM_DIV" ;
      edtTBM32_CRF_ITEM_DIV_Internalname = "TBM32_CRF_ITEM_DIV" ;
      lblTextblocktbm32_crf_item_grp_cd_Internalname = "TEXTBLOCKTBM32_CRF_ITEM_GRP_CD" ;
      edtTBM32_CRF_ITEM_GRP_CD_Internalname = "TBM32_CRF_ITEM_GRP_CD" ;
      lblTextblocktbm32_crf_item_grp_order_Internalname = "TEXTBLOCKTBM32_CRF_ITEM_GRP_ORDER" ;
      edtTBM32_CRF_ITEM_GRP_ORDER_Internalname = "TBM32_CRF_ITEM_GRP_ORDER" ;
      lblTextblocktbm32_location_x_Internalname = "TEXTBLOCKTBM32_LOCATION_X" ;
      edtTBM32_LOCATION_X_Internalname = "TBM32_LOCATION_X" ;
      lblTextblocktbm32_location_y_Internalname = "TEXTBLOCKTBM32_LOCATION_Y" ;
      edtTBM32_LOCATION_Y_Internalname = "TBM32_LOCATION_Y" ;
      lblTextblocktbm32_location_x2_Internalname = "TEXTBLOCKTBM32_LOCATION_X2" ;
      edtTBM32_LOCATION_X2_Internalname = "TBM32_LOCATION_X2" ;
      lblTextblocktbm32_location_y2_Internalname = "TEXTBLOCKTBM32_LOCATION_Y2" ;
      edtTBM32_LOCATION_Y2_Internalname = "TBM32_LOCATION_Y2" ;
      lblTextblocktbm32_text_align_div_Internalname = "TEXTBLOCKTBM32_TEXT_ALIGN_DIV" ;
      edtTBM32_TEXT_ALIGN_DIV_Internalname = "TBM32_TEXT_ALIGN_DIV" ;
      lblTextblocktbm32_text_maxrows_Internalname = "TEXTBLOCKTBM32_TEXT_MAXROWS" ;
      edtTBM32_TEXT_MAXROWS_Internalname = "TBM32_TEXT_MAXROWS" ;
      lblTextblocktbm32_text_maxlength_Internalname = "TEXTBLOCKTBM32_TEXT_MAXLENGTH" ;
      edtTBM32_TEXT_MAXLENGTH_Internalname = "TBM32_TEXT_MAXLENGTH" ;
      lblTextblocktbm32_decimal_digits_Internalname = "TEXTBLOCKTBM32_DECIMAL_DIGITS" ;
      edtTBM32_DECIMAL_DIGITS_Internalname = "TBM32_DECIMAL_DIGITS" ;
      lblTextblocktbm32_chk_true_inner_value_Internalname = "TEXTBLOCKTBM32_CHK_TRUE_INNER_VALUE" ;
      edtTBM32_CHK_TRUE_INNER_VALUE_Internalname = "TBM32_CHK_TRUE_INNER_VALUE" ;
      lblTextblocktbm32_chk_false_inner_value_Internalname = "TEXTBLOCKTBM32_CHK_FALSE_INNER_VALUE" ;
      edtTBM32_CHK_FALSE_INNER_VALUE_Internalname = "TBM32_CHK_FALSE_INNER_VALUE" ;
      lblTextblocktbm32_fixed_value_Internalname = "TEXTBLOCKTBM32_FIXED_VALUE" ;
      edtTBM32_FIXED_VALUE_Internalname = "TBM32_FIXED_VALUE" ;
      lblTextblocktbm32_list_cd_Internalname = "TEXTBLOCKTBM32_LIST_CD" ;
      edtTBM32_LIST_CD_Internalname = "TBM32_LIST_CD" ;
      lblTextblocktbm32_image_cd_Internalname = "TEXTBLOCKTBM32_IMAGE_CD" ;
      edtTBM32_IMAGE_CD_Internalname = "TBM32_IMAGE_CD" ;
      lblTextblocktbm32_text_Internalname = "TEXTBLOCKTBM32_TEXT" ;
      edtTBM32_TEXT_Internalname = "TBM32_TEXT" ;
      lblTextblocktbm32_font_size_Internalname = "TEXTBLOCKTBM32_FONT_SIZE" ;
      edtTBM32_FONT_SIZE_Internalname = "TBM32_FONT_SIZE" ;
      lblTextblocktbm32_font_ul_flg_Internalname = "TEXTBLOCKTBM32_FONT_UL_FLG" ;
      edtTBM32_FONT_UL_FLG_Internalname = "TBM32_FONT_UL_FLG" ;
      lblTextblocktbm32_font_color_div_Internalname = "TEXTBLOCKTBM32_FONT_COLOR_DIV" ;
      edtTBM32_FONT_COLOR_DIV_Internalname = "TBM32_FONT_COLOR_DIV" ;
      lblTextblocktbm32_line_size_div_Internalname = "TEXTBLOCKTBM32_LINE_SIZE_DIV" ;
      edtTBM32_LINE_SIZE_DIV_Internalname = "TBM32_LINE_SIZE_DIV" ;
      lblTextblocktbm32_line_color_div_Internalname = "TEXTBLOCKTBM32_LINE_COLOR_DIV" ;
      edtTBM32_LINE_COLOR_DIV_Internalname = "TBM32_LINE_COLOR_DIV" ;
      lblTextblocktbm32_line_start_point_div_Internalname = "TEXTBLOCKTBM32_LINE_START_POINT_DIV" ;
      edtTBM32_LINE_START_POINT_DIV_Internalname = "TBM32_LINE_START_POINT_DIV" ;
      lblTextblocktbm32_line_end_point_div_Internalname = "TEXTBLOCKTBM32_LINE_END_POINT_DIV" ;
      edtTBM32_LINE_END_POINT_DIV_Internalname = "TBM32_LINE_END_POINT_DIV" ;
      lblTextblocktbm32_line_angle_Internalname = "TEXTBLOCKTBM32_LINE_ANGLE" ;
      edtTBM32_LINE_ANGLE_Internalname = "TBM32_LINE_ANGLE" ;
      lblTextblocktbm32_auth_lvl_min_Internalname = "TEXTBLOCKTBM32_AUTH_LVL_MIN" ;
      edtTBM32_AUTH_LVL_MIN_Internalname = "TBM32_AUTH_LVL_MIN" ;
      lblTextblocktbm32_zorder_Internalname = "TEXTBLOCKTBM32_ZORDER" ;
      edtTBM32_ZORDER_Internalname = "TBM32_ZORDER" ;
      lblTextblocktbm32_tab_order_Internalname = "TEXTBLOCKTBM32_TAB_ORDER" ;
      edtTBM32_TAB_ORDER_Internalname = "TBM32_TAB_ORDER" ;
      lblTextblocktbm32_tabstop_flg_Internalname = "TEXTBLOCKTBM32_TABSTOP_FLG" ;
      edtTBM32_TABSTOP_FLG_Internalname = "TBM32_TABSTOP_FLG" ;
      lblTextblocktbm32_required_input_flg_Internalname = "TEXTBLOCKTBM32_REQUIRED_INPUT_FLG" ;
      edtTBM32_REQUIRED_INPUT_FLG_Internalname = "TBM32_REQUIRED_INPUT_FLG" ;
      lblTextblocktbm32_min_value_Internalname = "TEXTBLOCKTBM32_MIN_VALUE" ;
      edtTBM32_MIN_VALUE_Internalname = "TBM32_MIN_VALUE" ;
      lblTextblocktbm32_max_value_Internalname = "TEXTBLOCKTBM32_MAX_VALUE" ;
      edtTBM32_MAX_VALUE_Internalname = "TBM32_MAX_VALUE" ;
      lblTextblocktbm32_crf_item_note_Internalname = "TEXTBLOCKTBM32_CRF_ITEM_NOTE" ;
      edtTBM32_CRF_ITEM_NOTE_Internalname = "TBM32_CRF_ITEM_NOTE" ;
      lblTextblocktbm32_ref_crf_id_Internalname = "TEXTBLOCKTBM32_REF_CRF_ID" ;
      edtTBM32_REF_CRF_ID_Internalname = "TBM32_REF_CRF_ID" ;
      lblTextblocktbm32_ref_crf_item_cd_Internalname = "TEXTBLOCKTBM32_REF_CRF_ITEM_CD" ;
      edtTBM32_REF_CRF_ITEM_CD_Internalname = "TBM32_REF_CRF_ITEM_CD" ;
      lblTextblocktbm32_del_flg_Internalname = "TEXTBLOCKTBM32_DEL_FLG" ;
      edtTBM32_DEL_FLG_Internalname = "TBM32_DEL_FLG" ;
      lblTextblocktbm32_crt_datetime_Internalname = "TEXTBLOCKTBM32_CRT_DATETIME" ;
      edtTBM32_CRT_DATETIME_Internalname = "TBM32_CRT_DATETIME" ;
      lblTextblocktbm32_crt_user_id_Internalname = "TEXTBLOCKTBM32_CRT_USER_ID" ;
      edtTBM32_CRT_USER_ID_Internalname = "TBM32_CRT_USER_ID" ;
      lblTextblocktbm32_crt_prog_nm_Internalname = "TEXTBLOCKTBM32_CRT_PROG_NM" ;
      edtTBM32_CRT_PROG_NM_Internalname = "TBM32_CRT_PROG_NM" ;
      lblTextblocktbm32_upd_datetime_Internalname = "TEXTBLOCKTBM32_UPD_DATETIME" ;
      edtTBM32_UPD_DATETIME_Internalname = "TBM32_UPD_DATETIME" ;
      lblTextblocktbm32_upd_user_id_Internalname = "TEXTBLOCKTBM32_UPD_USER_ID" ;
      edtTBM32_UPD_USER_ID_Internalname = "TBM32_UPD_USER_ID" ;
      lblTextblocktbm32_upd_prog_nm_Internalname = "TEXTBLOCKTBM32_UPD_PROG_NM" ;
      edtTBM32_UPD_PROG_NM_Internalname = "TBM32_UPD_PROG_NM" ;
      lblTextblocktbm32_upd_cnt_Internalname = "TEXTBLOCKTBM32_UPD_CNT" ;
      edtTBM32_UPD_CNT_Internalname = "TBM32_UPD_CNT" ;
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
      edtTBM32_UPD_CNT_Jsonclick = "" ;
      edtTBM32_UPD_CNT_Enabled = 1 ;
      edtTBM32_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM32_UPD_PROG_NM_Enabled = 1 ;
      edtTBM32_UPD_USER_ID_Jsonclick = "" ;
      edtTBM32_UPD_USER_ID_Enabled = 1 ;
      edtTBM32_UPD_DATETIME_Jsonclick = "" ;
      edtTBM32_UPD_DATETIME_Enabled = 1 ;
      edtTBM32_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM32_CRT_PROG_NM_Enabled = 1 ;
      edtTBM32_CRT_USER_ID_Jsonclick = "" ;
      edtTBM32_CRT_USER_ID_Enabled = 1 ;
      edtTBM32_CRT_DATETIME_Jsonclick = "" ;
      edtTBM32_CRT_DATETIME_Enabled = 1 ;
      edtTBM32_DEL_FLG_Jsonclick = "" ;
      edtTBM32_DEL_FLG_Enabled = 1 ;
      edtTBM32_REF_CRF_ITEM_CD_Jsonclick = "" ;
      edtTBM32_REF_CRF_ITEM_CD_Enabled = 1 ;
      edtTBM32_REF_CRF_ID_Jsonclick = "" ;
      edtTBM32_REF_CRF_ID_Enabled = 1 ;
      edtTBM32_CRF_ITEM_NOTE_Enabled = 1 ;
      edtTBM32_MAX_VALUE_Jsonclick = "" ;
      edtTBM32_MAX_VALUE_Enabled = 1 ;
      edtTBM32_MIN_VALUE_Jsonclick = "" ;
      edtTBM32_MIN_VALUE_Enabled = 1 ;
      edtTBM32_REQUIRED_INPUT_FLG_Jsonclick = "" ;
      edtTBM32_REQUIRED_INPUT_FLG_Enabled = 1 ;
      edtTBM32_TABSTOP_FLG_Jsonclick = "" ;
      edtTBM32_TABSTOP_FLG_Enabled = 1 ;
      edtTBM32_TAB_ORDER_Jsonclick = "" ;
      edtTBM32_TAB_ORDER_Enabled = 1 ;
      edtTBM32_ZORDER_Jsonclick = "" ;
      edtTBM32_ZORDER_Enabled = 1 ;
      edtTBM32_AUTH_LVL_MIN_Jsonclick = "" ;
      edtTBM32_AUTH_LVL_MIN_Enabled = 1 ;
      edtTBM32_LINE_ANGLE_Jsonclick = "" ;
      edtTBM32_LINE_ANGLE_Enabled = 1 ;
      edtTBM32_LINE_END_POINT_DIV_Jsonclick = "" ;
      edtTBM32_LINE_END_POINT_DIV_Enabled = 1 ;
      edtTBM32_LINE_START_POINT_DIV_Jsonclick = "" ;
      edtTBM32_LINE_START_POINT_DIV_Enabled = 1 ;
      edtTBM32_LINE_COLOR_DIV_Jsonclick = "" ;
      edtTBM32_LINE_COLOR_DIV_Enabled = 1 ;
      edtTBM32_LINE_SIZE_DIV_Jsonclick = "" ;
      edtTBM32_LINE_SIZE_DIV_Enabled = 1 ;
      edtTBM32_FONT_COLOR_DIV_Jsonclick = "" ;
      edtTBM32_FONT_COLOR_DIV_Enabled = 1 ;
      edtTBM32_FONT_UL_FLG_Jsonclick = "" ;
      edtTBM32_FONT_UL_FLG_Enabled = 1 ;
      edtTBM32_FONT_SIZE_Jsonclick = "" ;
      edtTBM32_FONT_SIZE_Enabled = 1 ;
      edtTBM32_TEXT_Enabled = 1 ;
      edtTBM32_IMAGE_CD_Jsonclick = "" ;
      edtTBM32_IMAGE_CD_Enabled = 1 ;
      edtTBM32_LIST_CD_Jsonclick = "" ;
      edtTBM32_LIST_CD_Enabled = 1 ;
      edtTBM32_FIXED_VALUE_Jsonclick = "" ;
      edtTBM32_FIXED_VALUE_Enabled = 1 ;
      edtTBM32_CHK_FALSE_INNER_VALUE_Jsonclick = "" ;
      edtTBM32_CHK_FALSE_INNER_VALUE_Enabled = 1 ;
      edtTBM32_CHK_TRUE_INNER_VALUE_Jsonclick = "" ;
      edtTBM32_CHK_TRUE_INNER_VALUE_Enabled = 1 ;
      edtTBM32_DECIMAL_DIGITS_Jsonclick = "" ;
      edtTBM32_DECIMAL_DIGITS_Enabled = 1 ;
      edtTBM32_TEXT_MAXLENGTH_Jsonclick = "" ;
      edtTBM32_TEXT_MAXLENGTH_Enabled = 1 ;
      edtTBM32_TEXT_MAXROWS_Jsonclick = "" ;
      edtTBM32_TEXT_MAXROWS_Enabled = 1 ;
      edtTBM32_TEXT_ALIGN_DIV_Jsonclick = "" ;
      edtTBM32_TEXT_ALIGN_DIV_Enabled = 1 ;
      edtTBM32_LOCATION_Y2_Jsonclick = "" ;
      edtTBM32_LOCATION_Y2_Enabled = 1 ;
      edtTBM32_LOCATION_X2_Jsonclick = "" ;
      edtTBM32_LOCATION_X2_Enabled = 1 ;
      edtTBM32_LOCATION_Y_Jsonclick = "" ;
      edtTBM32_LOCATION_Y_Enabled = 1 ;
      edtTBM32_LOCATION_X_Jsonclick = "" ;
      edtTBM32_LOCATION_X_Enabled = 1 ;
      edtTBM32_CRF_ITEM_GRP_ORDER_Jsonclick = "" ;
      edtTBM32_CRF_ITEM_GRP_ORDER_Enabled = 1 ;
      edtTBM32_CRF_ITEM_GRP_CD_Jsonclick = "" ;
      edtTBM32_CRF_ITEM_GRP_CD_Enabled = 1 ;
      edtTBM32_CRF_ITEM_DIV_Jsonclick = "" ;
      edtTBM32_CRF_ITEM_DIV_Enabled = 1 ;
      edtTBM32_CRF_ITEM_NM_Enabled = 1 ;
      edtTBM32_CRF_ITEM_CD_Jsonclick = "" ;
      edtTBM32_CRF_ITEM_CD_Enabled = 1 ;
      edtTBM32_CRF_ID_Jsonclick = "" ;
      edtTBM32_CRF_ID_Enabled = 1 ;
      edtTBM32_STUDY_ID_Jsonclick = "" ;
      edtTBM32_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm32_crt_user_id0K19( String Gx_mode )
   {
      GXt_char1 = A408TBM32_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm32_crf_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A408TBM32_CRT_USER_ID = GXt_char1 ;
      n408TBM32_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A408TBM32_CRT_USER_ID", A408TBM32_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A408TBM32_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm32_upd_user_id0K19( String Gx_mode )
   {
      GXt_char1 = A411TBM32_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm32_crf_item_impl.this.GXt_char1 = GXv_char2[0] ;
      A411TBM32_UPD_USER_ID = GXt_char1 ;
      n411TBM32_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A411TBM32_UPD_USER_ID", A411TBM32_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A411TBM32_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM32_CRF_ITEM_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm32_crf_item_cd( long GX_Parm1 ,
                                        short GX_Parm2 ,
                                        String GX_Parm3 ,
                                        java.util.Date GX_Parm4 ,
                                        String GX_Parm5 ,
                                        java.util.Date GX_Parm6 ,
                                        String GX_Parm7 ,
                                        long GX_Parm8 ,
                                        String GX_Parm9 ,
                                        String GX_Parm10 ,
                                        String GX_Parm11 ,
                                        short GX_Parm12 ,
                                        short GX_Parm13 ,
                                        short GX_Parm14 ,
                                        short GX_Parm15 ,
                                        short GX_Parm16 ,
                                        String GX_Parm17 ,
                                        byte GX_Parm18 ,
                                        short GX_Parm19 ,
                                        byte GX_Parm20 ,
                                        String GX_Parm21 ,
                                        String GX_Parm22 ,
                                        String GX_Parm23 ,
                                        String GX_Parm24 ,
                                        String GX_Parm25 ,
                                        String GX_Parm26 ,
                                        byte GX_Parm27 ,
                                        String GX_Parm28 ,
                                        long GX_Parm29 ,
                                        byte GX_Parm30 ,
                                        long GX_Parm31 ,
                                        String GX_Parm32 ,
                                        String GX_Parm33 ,
                                        short GX_Parm34 ,
                                        byte GX_Parm35 ,
                                        short GX_Parm36 ,
                                        short GX_Parm37 ,
                                        String GX_Parm38 ,
                                        String GX_Parm39 ,
                                        String GX_Parm40 ,
                                        String GX_Parm41 ,
                                        String GX_Parm42 ,
                                        short GX_Parm43 ,
                                        String GX_Parm44 ,
                                        String GX_Parm45 ,
                                        String GX_Parm46 ,
                                        String GX_Parm47 )
   {
      A70TBM32_STUDY_ID = GX_Parm1 ;
      A71TBM32_CRF_ID = GX_Parm2 ;
      A72TBM32_CRF_ITEM_CD = GX_Parm3 ;
      A407TBM32_CRT_DATETIME = GX_Parm4 ;
      n407TBM32_CRT_DATETIME = false ;
      A408TBM32_CRT_USER_ID = GX_Parm5 ;
      n408TBM32_CRT_USER_ID = false ;
      A410TBM32_UPD_DATETIME = GX_Parm6 ;
      n410TBM32_UPD_DATETIME = false ;
      A411TBM32_UPD_USER_ID = GX_Parm7 ;
      n411TBM32_UPD_USER_ID = false ;
      A413TBM32_UPD_CNT = GX_Parm8 ;
      n413TBM32_UPD_CNT = false ;
      A405TBM32_CRF_ITEM_NM = GX_Parm9 ;
      n405TBM32_CRF_ITEM_NM = false ;
      A74TBM32_CRF_ITEM_DIV = GX_Parm10 ;
      n74TBM32_CRF_ITEM_DIV = false ;
      A73TBM32_CRF_ITEM_GRP_CD = GX_Parm11 ;
      n73TBM32_CRF_ITEM_GRP_CD = false ;
      A507TBM32_CRF_ITEM_GRP_ORDER = GX_Parm12 ;
      n507TBM32_CRF_ITEM_GRP_ORDER = false ;
      A508TBM32_LOCATION_X = GX_Parm13 ;
      n508TBM32_LOCATION_X = false ;
      A509TBM32_LOCATION_Y = GX_Parm14 ;
      n509TBM32_LOCATION_Y = false ;
      A510TBM32_LOCATION_X2 = GX_Parm15 ;
      n510TBM32_LOCATION_X2 = false ;
      A511TBM32_LOCATION_Y2 = GX_Parm16 ;
      n511TBM32_LOCATION_Y2 = false ;
      A512TBM32_TEXT_ALIGN_DIV = GX_Parm17 ;
      n512TBM32_TEXT_ALIGN_DIV = false ;
      A516TBM32_TEXT_MAXROWS = GX_Parm18 ;
      n516TBM32_TEXT_MAXROWS = false ;
      A517TBM32_TEXT_MAXLENGTH = GX_Parm19 ;
      n517TBM32_TEXT_MAXLENGTH = false ;
      A518TBM32_DECIMAL_DIGITS = GX_Parm20 ;
      n518TBM32_DECIMAL_DIGITS = false ;
      A522TBM32_CHK_TRUE_INNER_VALUE = GX_Parm21 ;
      n522TBM32_CHK_TRUE_INNER_VALUE = false ;
      A523TBM32_CHK_FALSE_INNER_VALUE = GX_Parm22 ;
      n523TBM32_CHK_FALSE_INNER_VALUE = false ;
      A527TBM32_FIXED_VALUE = GX_Parm23 ;
      n527TBM32_FIXED_VALUE = false ;
      A525TBM32_LIST_CD = GX_Parm24 ;
      n525TBM32_LIST_CD = false ;
      A526TBM32_IMAGE_CD = GX_Parm25 ;
      n526TBM32_IMAGE_CD = false ;
      A524TBM32_TEXT = GX_Parm26 ;
      n524TBM32_TEXT = false ;
      A513TBM32_FONT_SIZE = GX_Parm27 ;
      n513TBM32_FONT_SIZE = false ;
      A514TBM32_FONT_UL_FLG = GX_Parm28 ;
      n514TBM32_FONT_UL_FLG = false ;
      A515TBM32_FONT_COLOR_DIV = GX_Parm29 ;
      n515TBM32_FONT_COLOR_DIV = false ;
      A521TBM32_LINE_SIZE_DIV = GX_Parm30 ;
      n521TBM32_LINE_SIZE_DIV = false ;
      A689TBM32_LINE_COLOR_DIV = GX_Parm31 ;
      n689TBM32_LINE_COLOR_DIV = false ;
      A519TBM32_LINE_START_POINT_DIV = GX_Parm32 ;
      n519TBM32_LINE_START_POINT_DIV = false ;
      A520TBM32_LINE_END_POINT_DIV = GX_Parm33 ;
      n520TBM32_LINE_END_POINT_DIV = false ;
      A690TBM32_LINE_ANGLE = GX_Parm34 ;
      n690TBM32_LINE_ANGLE = false ;
      A644TBM32_AUTH_LVL_MIN = GX_Parm35 ;
      n644TBM32_AUTH_LVL_MIN = false ;
      A645TBM32_ZORDER = GX_Parm36 ;
      n645TBM32_ZORDER = false ;
      A691TBM32_TAB_ORDER = GX_Parm37 ;
      n691TBM32_TAB_ORDER = false ;
      A692TBM32_TABSTOP_FLG = GX_Parm38 ;
      n692TBM32_TABSTOP_FLG = false ;
      A693TBM32_REQUIRED_INPUT_FLG = GX_Parm39 ;
      n693TBM32_REQUIRED_INPUT_FLG = false ;
      A694TBM32_MIN_VALUE = GX_Parm40 ;
      n694TBM32_MIN_VALUE = false ;
      A695TBM32_MAX_VALUE = GX_Parm41 ;
      n695TBM32_MAX_VALUE = false ;
      A406TBM32_CRF_ITEM_NOTE = GX_Parm42 ;
      n406TBM32_CRF_ITEM_NOTE = false ;
      A774TBM32_REF_CRF_ID = GX_Parm43 ;
      n774TBM32_REF_CRF_ID = false ;
      A775TBM32_REF_CRF_ITEM_CD = GX_Parm44 ;
      n775TBM32_REF_CRF_ITEM_CD = false ;
      A75TBM32_DEL_FLG = GX_Parm45 ;
      n75TBM32_DEL_FLG = false ;
      A409TBM32_CRT_PROG_NM = GX_Parm46 ;
      n409TBM32_CRT_PROG_NM = false ;
      A412TBM32_UPD_PROG_NM = GX_Parm47 ;
      n412TBM32_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A407TBM32_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A408TBM32_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A410TBM32_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A411TBM32_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A413TBM32_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A405TBM32_CRF_ITEM_NM));
      isValidOutput.add(GXutil.rtrim( A74TBM32_CRF_ITEM_DIV));
      isValidOutput.add(GXutil.rtrim( A73TBM32_CRF_ITEM_GRP_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A507TBM32_CRF_ITEM_GRP_ORDER, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A508TBM32_LOCATION_X, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A509TBM32_LOCATION_Y, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A510TBM32_LOCATION_X2, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A511TBM32_LOCATION_Y2, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A512TBM32_TEXT_ALIGN_DIV));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A516TBM32_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A517TBM32_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A518TBM32_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A522TBM32_CHK_TRUE_INNER_VALUE));
      isValidOutput.add(GXutil.rtrim( A523TBM32_CHK_FALSE_INNER_VALUE));
      isValidOutput.add(GXutil.rtrim( A527TBM32_FIXED_VALUE));
      isValidOutput.add(GXutil.rtrim( A525TBM32_LIST_CD));
      isValidOutput.add(GXutil.rtrim( A526TBM32_IMAGE_CD));
      isValidOutput.add(GXutil.rtrim( A524TBM32_TEXT));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A513TBM32_FONT_SIZE, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A514TBM32_FONT_UL_FLG));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A515TBM32_FONT_COLOR_DIV, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A521TBM32_LINE_SIZE_DIV, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A689TBM32_LINE_COLOR_DIV, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A519TBM32_LINE_START_POINT_DIV));
      isValidOutput.add(GXutil.rtrim( A520TBM32_LINE_END_POINT_DIV));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A690TBM32_LINE_ANGLE, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A644TBM32_AUTH_LVL_MIN, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A645TBM32_ZORDER, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A691TBM32_TAB_ORDER, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A692TBM32_TABSTOP_FLG));
      isValidOutput.add(GXutil.rtrim( A693TBM32_REQUIRED_INPUT_FLG));
      isValidOutput.add(GXutil.rtrim( A694TBM32_MIN_VALUE));
      isValidOutput.add(GXutil.rtrim( A695TBM32_MAX_VALUE));
      isValidOutput.add(GXutil.rtrim( A406TBM32_CRF_ITEM_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A774TBM32_REF_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A775TBM32_REF_CRF_ITEM_CD));
      isValidOutput.add(GXutil.rtrim( A75TBM32_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A409TBM32_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A412TBM32_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z70TBM32_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z71TBM32_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z72TBM32_CRF_ITEM_CD));
      isValidOutput.add(localUtil.ttoc( Z407TBM32_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z408TBM32_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z410TBM32_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z411TBM32_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z413TBM32_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z405TBM32_CRF_ITEM_NM));
      isValidOutput.add(GXutil.rtrim( Z74TBM32_CRF_ITEM_DIV));
      isValidOutput.add(GXutil.rtrim( Z73TBM32_CRF_ITEM_GRP_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z507TBM32_CRF_ITEM_GRP_ORDER, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z508TBM32_LOCATION_X, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z509TBM32_LOCATION_Y, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z510TBM32_LOCATION_X2, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z511TBM32_LOCATION_Y2, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z512TBM32_TEXT_ALIGN_DIV));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z516TBM32_TEXT_MAXROWS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z517TBM32_TEXT_MAXLENGTH, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z518TBM32_DECIMAL_DIGITS, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z522TBM32_CHK_TRUE_INNER_VALUE));
      isValidOutput.add(GXutil.rtrim( Z523TBM32_CHK_FALSE_INNER_VALUE));
      isValidOutput.add(GXutil.rtrim( Z527TBM32_FIXED_VALUE));
      isValidOutput.add(GXutil.rtrim( Z525TBM32_LIST_CD));
      isValidOutput.add(GXutil.rtrim( Z526TBM32_IMAGE_CD));
      isValidOutput.add(GXutil.rtrim( Z524TBM32_TEXT));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z513TBM32_FONT_SIZE, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z514TBM32_FONT_UL_FLG));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z515TBM32_FONT_COLOR_DIV, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z521TBM32_LINE_SIZE_DIV, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z689TBM32_LINE_COLOR_DIV, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z519TBM32_LINE_START_POINT_DIV));
      isValidOutput.add(GXutil.rtrim( Z520TBM32_LINE_END_POINT_DIV));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z690TBM32_LINE_ANGLE, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z644TBM32_AUTH_LVL_MIN, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z645TBM32_ZORDER, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z691TBM32_TAB_ORDER, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z692TBM32_TABSTOP_FLG));
      isValidOutput.add(GXutil.rtrim( Z693TBM32_REQUIRED_INPUT_FLG));
      isValidOutput.add(GXutil.rtrim( Z694TBM32_MIN_VALUE));
      isValidOutput.add(GXutil.rtrim( Z695TBM32_MAX_VALUE));
      isValidOutput.add(GXutil.rtrim( Z406TBM32_CRF_ITEM_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z774TBM32_REF_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z775TBM32_REF_CRF_ITEM_CD));
      isValidOutput.add(GXutil.rtrim( Z75TBM32_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z409TBM32_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z412TBM32_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O413TBM32_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z72TBM32_CRF_ITEM_CD = "" ;
      Z407TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z408TBM32_CRT_USER_ID = "" ;
      Z410TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z411TBM32_UPD_USER_ID = "" ;
      Z405TBM32_CRF_ITEM_NM = "" ;
      Z74TBM32_CRF_ITEM_DIV = "" ;
      Z73TBM32_CRF_ITEM_GRP_CD = "" ;
      Z512TBM32_TEXT_ALIGN_DIV = "" ;
      Z522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      Z523TBM32_CHK_FALSE_INNER_VALUE = "" ;
      Z527TBM32_FIXED_VALUE = "" ;
      Z525TBM32_LIST_CD = "" ;
      Z526TBM32_IMAGE_CD = "" ;
      Z524TBM32_TEXT = "" ;
      Z514TBM32_FONT_UL_FLG = "" ;
      Z519TBM32_LINE_START_POINT_DIV = "" ;
      Z520TBM32_LINE_END_POINT_DIV = "" ;
      Z692TBM32_TABSTOP_FLG = "" ;
      Z693TBM32_REQUIRED_INPUT_FLG = "" ;
      Z694TBM32_MIN_VALUE = "" ;
      Z695TBM32_MAX_VALUE = "" ;
      Z406TBM32_CRF_ITEM_NOTE = "" ;
      Z775TBM32_REF_CRF_ITEM_CD = "" ;
      Z75TBM32_DEL_FLG = "" ;
      Z409TBM32_CRT_PROG_NM = "" ;
      Z412TBM32_UPD_PROG_NM = "" ;
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
      lblTextblocktbm32_study_id_Jsonclick = "" ;
      lblTextblocktbm32_crf_id_Jsonclick = "" ;
      lblTextblocktbm32_crf_item_cd_Jsonclick = "" ;
      A72TBM32_CRF_ITEM_CD = "" ;
      lblTextblocktbm32_crf_item_nm_Jsonclick = "" ;
      A405TBM32_CRF_ITEM_NM = "" ;
      lblTextblocktbm32_crf_item_div_Jsonclick = "" ;
      A74TBM32_CRF_ITEM_DIV = "" ;
      lblTextblocktbm32_crf_item_grp_cd_Jsonclick = "" ;
      A73TBM32_CRF_ITEM_GRP_CD = "" ;
      lblTextblocktbm32_crf_item_grp_order_Jsonclick = "" ;
      lblTextblocktbm32_location_x_Jsonclick = "" ;
      lblTextblocktbm32_location_y_Jsonclick = "" ;
      lblTextblocktbm32_location_x2_Jsonclick = "" ;
      lblTextblocktbm32_location_y2_Jsonclick = "" ;
      lblTextblocktbm32_text_align_div_Jsonclick = "" ;
      A512TBM32_TEXT_ALIGN_DIV = "" ;
      lblTextblocktbm32_text_maxrows_Jsonclick = "" ;
      lblTextblocktbm32_text_maxlength_Jsonclick = "" ;
      lblTextblocktbm32_decimal_digits_Jsonclick = "" ;
      lblTextblocktbm32_chk_true_inner_value_Jsonclick = "" ;
      A522TBM32_CHK_TRUE_INNER_VALUE = "" ;
      lblTextblocktbm32_chk_false_inner_value_Jsonclick = "" ;
      A523TBM32_CHK_FALSE_INNER_VALUE = "" ;
      lblTextblocktbm32_fixed_value_Jsonclick = "" ;
      A527TBM32_FIXED_VALUE = "" ;
      lblTextblocktbm32_list_cd_Jsonclick = "" ;
      A525TBM32_LIST_CD = "" ;
      lblTextblocktbm32_image_cd_Jsonclick = "" ;
      A526TBM32_IMAGE_CD = "" ;
      lblTextblocktbm32_text_Jsonclick = "" ;
      A524TBM32_TEXT = "" ;
      lblTextblocktbm32_font_size_Jsonclick = "" ;
      lblTextblocktbm32_font_ul_flg_Jsonclick = "" ;
      A514TBM32_FONT_UL_FLG = "" ;
      lblTextblocktbm32_font_color_div_Jsonclick = "" ;
      lblTextblocktbm32_line_size_div_Jsonclick = "" ;
      lblTextblocktbm32_line_color_div_Jsonclick = "" ;
      lblTextblocktbm32_line_start_point_div_Jsonclick = "" ;
      A519TBM32_LINE_START_POINT_DIV = "" ;
      lblTextblocktbm32_line_end_point_div_Jsonclick = "" ;
      A520TBM32_LINE_END_POINT_DIV = "" ;
      lblTextblocktbm32_line_angle_Jsonclick = "" ;
      lblTextblocktbm32_auth_lvl_min_Jsonclick = "" ;
      lblTextblocktbm32_zorder_Jsonclick = "" ;
      lblTextblocktbm32_tab_order_Jsonclick = "" ;
      lblTextblocktbm32_tabstop_flg_Jsonclick = "" ;
      A692TBM32_TABSTOP_FLG = "" ;
      lblTextblocktbm32_required_input_flg_Jsonclick = "" ;
      A693TBM32_REQUIRED_INPUT_FLG = "" ;
      lblTextblocktbm32_min_value_Jsonclick = "" ;
      A694TBM32_MIN_VALUE = "" ;
      lblTextblocktbm32_max_value_Jsonclick = "" ;
      A695TBM32_MAX_VALUE = "" ;
      lblTextblocktbm32_crf_item_note_Jsonclick = "" ;
      A406TBM32_CRF_ITEM_NOTE = "" ;
      lblTextblocktbm32_ref_crf_id_Jsonclick = "" ;
      lblTextblocktbm32_ref_crf_item_cd_Jsonclick = "" ;
      A775TBM32_REF_CRF_ITEM_CD = "" ;
      lblTextblocktbm32_del_flg_Jsonclick = "" ;
      A75TBM32_DEL_FLG = "" ;
      lblTextblocktbm32_crt_datetime_Jsonclick = "" ;
      A407TBM32_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm32_crt_user_id_Jsonclick = "" ;
      A408TBM32_CRT_USER_ID = "" ;
      lblTextblocktbm32_crt_prog_nm_Jsonclick = "" ;
      A409TBM32_CRT_PROG_NM = "" ;
      lblTextblocktbm32_upd_datetime_Jsonclick = "" ;
      A410TBM32_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm32_upd_user_id_Jsonclick = "" ;
      A411TBM32_UPD_USER_ID = "" ;
      lblTextblocktbm32_upd_prog_nm_Jsonclick = "" ;
      A412TBM32_UPD_PROG_NM = "" ;
      lblTextblocktbm32_upd_cnt_Jsonclick = "" ;
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
      T000K4_A70TBM32_STUDY_ID = new long[1] ;
      T000K4_A71TBM32_CRF_ID = new short[1] ;
      T000K4_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      T000K4_A407TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000K4_n407TBM32_CRT_DATETIME = new boolean[] {false} ;
      T000K4_A408TBM32_CRT_USER_ID = new String[] {""} ;
      T000K4_n408TBM32_CRT_USER_ID = new boolean[] {false} ;
      T000K4_A410TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000K4_n410TBM32_UPD_DATETIME = new boolean[] {false} ;
      T000K4_A411TBM32_UPD_USER_ID = new String[] {""} ;
      T000K4_n411TBM32_UPD_USER_ID = new boolean[] {false} ;
      T000K4_A413TBM32_UPD_CNT = new long[1] ;
      T000K4_n413TBM32_UPD_CNT = new boolean[] {false} ;
      T000K4_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      T000K4_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      T000K4_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      T000K4_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      T000K4_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000K4_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      T000K4_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      T000K4_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      T000K4_A508TBM32_LOCATION_X = new short[1] ;
      T000K4_n508TBM32_LOCATION_X = new boolean[] {false} ;
      T000K4_A509TBM32_LOCATION_Y = new short[1] ;
      T000K4_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      T000K4_A510TBM32_LOCATION_X2 = new short[1] ;
      T000K4_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      T000K4_A511TBM32_LOCATION_Y2 = new short[1] ;
      T000K4_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      T000K4_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      T000K4_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      T000K4_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      T000K4_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      T000K4_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      T000K4_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      T000K4_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      T000K4_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      T000K4_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      T000K4_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      T000K4_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      T000K4_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      T000K4_A527TBM32_FIXED_VALUE = new String[] {""} ;
      T000K4_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      T000K4_A525TBM32_LIST_CD = new String[] {""} ;
      T000K4_n525TBM32_LIST_CD = new boolean[] {false} ;
      T000K4_A526TBM32_IMAGE_CD = new String[] {""} ;
      T000K4_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      T000K4_A524TBM32_TEXT = new String[] {""} ;
      T000K4_n524TBM32_TEXT = new boolean[] {false} ;
      T000K4_A513TBM32_FONT_SIZE = new byte[1] ;
      T000K4_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      T000K4_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      T000K4_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      T000K4_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      T000K4_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      T000K4_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      T000K4_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      T000K4_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      T000K4_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      T000K4_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      T000K4_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      T000K4_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      T000K4_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      T000K4_A690TBM32_LINE_ANGLE = new short[1] ;
      T000K4_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      T000K4_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      T000K4_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      T000K4_A645TBM32_ZORDER = new short[1] ;
      T000K4_n645TBM32_ZORDER = new boolean[] {false} ;
      T000K4_A691TBM32_TAB_ORDER = new short[1] ;
      T000K4_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      T000K4_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      T000K4_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      T000K4_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000K4_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000K4_A694TBM32_MIN_VALUE = new String[] {""} ;
      T000K4_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      T000K4_A695TBM32_MAX_VALUE = new String[] {""} ;
      T000K4_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      T000K4_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      T000K4_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      T000K4_A774TBM32_REF_CRF_ID = new short[1] ;
      T000K4_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      T000K4_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      T000K4_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      T000K4_A75TBM32_DEL_FLG = new String[] {""} ;
      T000K4_n75TBM32_DEL_FLG = new boolean[] {false} ;
      T000K4_A409TBM32_CRT_PROG_NM = new String[] {""} ;
      T000K4_n409TBM32_CRT_PROG_NM = new boolean[] {false} ;
      T000K4_A412TBM32_UPD_PROG_NM = new String[] {""} ;
      T000K4_n412TBM32_UPD_PROG_NM = new boolean[] {false} ;
      T000K5_A70TBM32_STUDY_ID = new long[1] ;
      T000K5_A71TBM32_CRF_ID = new short[1] ;
      T000K5_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      T000K3_A70TBM32_STUDY_ID = new long[1] ;
      T000K3_A71TBM32_CRF_ID = new short[1] ;
      T000K3_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      T000K3_A407TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000K3_n407TBM32_CRT_DATETIME = new boolean[] {false} ;
      T000K3_A408TBM32_CRT_USER_ID = new String[] {""} ;
      T000K3_n408TBM32_CRT_USER_ID = new boolean[] {false} ;
      T000K3_A410TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000K3_n410TBM32_UPD_DATETIME = new boolean[] {false} ;
      T000K3_A411TBM32_UPD_USER_ID = new String[] {""} ;
      T000K3_n411TBM32_UPD_USER_ID = new boolean[] {false} ;
      T000K3_A413TBM32_UPD_CNT = new long[1] ;
      T000K3_n413TBM32_UPD_CNT = new boolean[] {false} ;
      T000K3_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      T000K3_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      T000K3_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      T000K3_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      T000K3_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000K3_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      T000K3_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      T000K3_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      T000K3_A508TBM32_LOCATION_X = new short[1] ;
      T000K3_n508TBM32_LOCATION_X = new boolean[] {false} ;
      T000K3_A509TBM32_LOCATION_Y = new short[1] ;
      T000K3_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      T000K3_A510TBM32_LOCATION_X2 = new short[1] ;
      T000K3_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      T000K3_A511TBM32_LOCATION_Y2 = new short[1] ;
      T000K3_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      T000K3_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      T000K3_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      T000K3_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      T000K3_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      T000K3_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      T000K3_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      T000K3_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      T000K3_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      T000K3_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      T000K3_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      T000K3_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      T000K3_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      T000K3_A527TBM32_FIXED_VALUE = new String[] {""} ;
      T000K3_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      T000K3_A525TBM32_LIST_CD = new String[] {""} ;
      T000K3_n525TBM32_LIST_CD = new boolean[] {false} ;
      T000K3_A526TBM32_IMAGE_CD = new String[] {""} ;
      T000K3_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      T000K3_A524TBM32_TEXT = new String[] {""} ;
      T000K3_n524TBM32_TEXT = new boolean[] {false} ;
      T000K3_A513TBM32_FONT_SIZE = new byte[1] ;
      T000K3_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      T000K3_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      T000K3_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      T000K3_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      T000K3_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      T000K3_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      T000K3_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      T000K3_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      T000K3_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      T000K3_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      T000K3_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      T000K3_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      T000K3_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      T000K3_A690TBM32_LINE_ANGLE = new short[1] ;
      T000K3_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      T000K3_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      T000K3_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      T000K3_A645TBM32_ZORDER = new short[1] ;
      T000K3_n645TBM32_ZORDER = new boolean[] {false} ;
      T000K3_A691TBM32_TAB_ORDER = new short[1] ;
      T000K3_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      T000K3_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      T000K3_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      T000K3_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000K3_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000K3_A694TBM32_MIN_VALUE = new String[] {""} ;
      T000K3_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      T000K3_A695TBM32_MAX_VALUE = new String[] {""} ;
      T000K3_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      T000K3_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      T000K3_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      T000K3_A774TBM32_REF_CRF_ID = new short[1] ;
      T000K3_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      T000K3_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      T000K3_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      T000K3_A75TBM32_DEL_FLG = new String[] {""} ;
      T000K3_n75TBM32_DEL_FLG = new boolean[] {false} ;
      T000K3_A409TBM32_CRT_PROG_NM = new String[] {""} ;
      T000K3_n409TBM32_CRT_PROG_NM = new boolean[] {false} ;
      T000K3_A412TBM32_UPD_PROG_NM = new String[] {""} ;
      T000K3_n412TBM32_UPD_PROG_NM = new boolean[] {false} ;
      sMode19 = "" ;
      T000K6_A70TBM32_STUDY_ID = new long[1] ;
      T000K6_A71TBM32_CRF_ID = new short[1] ;
      T000K6_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      T000K7_A70TBM32_STUDY_ID = new long[1] ;
      T000K7_A71TBM32_CRF_ID = new short[1] ;
      T000K7_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      T000K2_A70TBM32_STUDY_ID = new long[1] ;
      T000K2_A71TBM32_CRF_ID = new short[1] ;
      T000K2_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      T000K2_A407TBM32_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000K2_n407TBM32_CRT_DATETIME = new boolean[] {false} ;
      T000K2_A408TBM32_CRT_USER_ID = new String[] {""} ;
      T000K2_n408TBM32_CRT_USER_ID = new boolean[] {false} ;
      T000K2_A410TBM32_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000K2_n410TBM32_UPD_DATETIME = new boolean[] {false} ;
      T000K2_A411TBM32_UPD_USER_ID = new String[] {""} ;
      T000K2_n411TBM32_UPD_USER_ID = new boolean[] {false} ;
      T000K2_A413TBM32_UPD_CNT = new long[1] ;
      T000K2_n413TBM32_UPD_CNT = new boolean[] {false} ;
      T000K2_A405TBM32_CRF_ITEM_NM = new String[] {""} ;
      T000K2_n405TBM32_CRF_ITEM_NM = new boolean[] {false} ;
      T000K2_A74TBM32_CRF_ITEM_DIV = new String[] {""} ;
      T000K2_n74TBM32_CRF_ITEM_DIV = new boolean[] {false} ;
      T000K2_A73TBM32_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000K2_n73TBM32_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      T000K2_A507TBM32_CRF_ITEM_GRP_ORDER = new short[1] ;
      T000K2_n507TBM32_CRF_ITEM_GRP_ORDER = new boolean[] {false} ;
      T000K2_A508TBM32_LOCATION_X = new short[1] ;
      T000K2_n508TBM32_LOCATION_X = new boolean[] {false} ;
      T000K2_A509TBM32_LOCATION_Y = new short[1] ;
      T000K2_n509TBM32_LOCATION_Y = new boolean[] {false} ;
      T000K2_A510TBM32_LOCATION_X2 = new short[1] ;
      T000K2_n510TBM32_LOCATION_X2 = new boolean[] {false} ;
      T000K2_A511TBM32_LOCATION_Y2 = new short[1] ;
      T000K2_n511TBM32_LOCATION_Y2 = new boolean[] {false} ;
      T000K2_A512TBM32_TEXT_ALIGN_DIV = new String[] {""} ;
      T000K2_n512TBM32_TEXT_ALIGN_DIV = new boolean[] {false} ;
      T000K2_A516TBM32_TEXT_MAXROWS = new byte[1] ;
      T000K2_n516TBM32_TEXT_MAXROWS = new boolean[] {false} ;
      T000K2_A517TBM32_TEXT_MAXLENGTH = new short[1] ;
      T000K2_n517TBM32_TEXT_MAXLENGTH = new boolean[] {false} ;
      T000K2_A518TBM32_DECIMAL_DIGITS = new byte[1] ;
      T000K2_n518TBM32_DECIMAL_DIGITS = new boolean[] {false} ;
      T000K2_A522TBM32_CHK_TRUE_INNER_VALUE = new String[] {""} ;
      T000K2_n522TBM32_CHK_TRUE_INNER_VALUE = new boolean[] {false} ;
      T000K2_A523TBM32_CHK_FALSE_INNER_VALUE = new String[] {""} ;
      T000K2_n523TBM32_CHK_FALSE_INNER_VALUE = new boolean[] {false} ;
      T000K2_A527TBM32_FIXED_VALUE = new String[] {""} ;
      T000K2_n527TBM32_FIXED_VALUE = new boolean[] {false} ;
      T000K2_A525TBM32_LIST_CD = new String[] {""} ;
      T000K2_n525TBM32_LIST_CD = new boolean[] {false} ;
      T000K2_A526TBM32_IMAGE_CD = new String[] {""} ;
      T000K2_n526TBM32_IMAGE_CD = new boolean[] {false} ;
      T000K2_A524TBM32_TEXT = new String[] {""} ;
      T000K2_n524TBM32_TEXT = new boolean[] {false} ;
      T000K2_A513TBM32_FONT_SIZE = new byte[1] ;
      T000K2_n513TBM32_FONT_SIZE = new boolean[] {false} ;
      T000K2_A514TBM32_FONT_UL_FLG = new String[] {""} ;
      T000K2_n514TBM32_FONT_UL_FLG = new boolean[] {false} ;
      T000K2_A515TBM32_FONT_COLOR_DIV = new long[1] ;
      T000K2_n515TBM32_FONT_COLOR_DIV = new boolean[] {false} ;
      T000K2_A521TBM32_LINE_SIZE_DIV = new byte[1] ;
      T000K2_n521TBM32_LINE_SIZE_DIV = new boolean[] {false} ;
      T000K2_A689TBM32_LINE_COLOR_DIV = new long[1] ;
      T000K2_n689TBM32_LINE_COLOR_DIV = new boolean[] {false} ;
      T000K2_A519TBM32_LINE_START_POINT_DIV = new String[] {""} ;
      T000K2_n519TBM32_LINE_START_POINT_DIV = new boolean[] {false} ;
      T000K2_A520TBM32_LINE_END_POINT_DIV = new String[] {""} ;
      T000K2_n520TBM32_LINE_END_POINT_DIV = new boolean[] {false} ;
      T000K2_A690TBM32_LINE_ANGLE = new short[1] ;
      T000K2_n690TBM32_LINE_ANGLE = new boolean[] {false} ;
      T000K2_A644TBM32_AUTH_LVL_MIN = new byte[1] ;
      T000K2_n644TBM32_AUTH_LVL_MIN = new boolean[] {false} ;
      T000K2_A645TBM32_ZORDER = new short[1] ;
      T000K2_n645TBM32_ZORDER = new boolean[] {false} ;
      T000K2_A691TBM32_TAB_ORDER = new short[1] ;
      T000K2_n691TBM32_TAB_ORDER = new boolean[] {false} ;
      T000K2_A692TBM32_TABSTOP_FLG = new String[] {""} ;
      T000K2_n692TBM32_TABSTOP_FLG = new boolean[] {false} ;
      T000K2_A693TBM32_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000K2_n693TBM32_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000K2_A694TBM32_MIN_VALUE = new String[] {""} ;
      T000K2_n694TBM32_MIN_VALUE = new boolean[] {false} ;
      T000K2_A695TBM32_MAX_VALUE = new String[] {""} ;
      T000K2_n695TBM32_MAX_VALUE = new boolean[] {false} ;
      T000K2_A406TBM32_CRF_ITEM_NOTE = new String[] {""} ;
      T000K2_n406TBM32_CRF_ITEM_NOTE = new boolean[] {false} ;
      T000K2_A774TBM32_REF_CRF_ID = new short[1] ;
      T000K2_n774TBM32_REF_CRF_ID = new boolean[] {false} ;
      T000K2_A775TBM32_REF_CRF_ITEM_CD = new String[] {""} ;
      T000K2_n775TBM32_REF_CRF_ITEM_CD = new boolean[] {false} ;
      T000K2_A75TBM32_DEL_FLG = new String[] {""} ;
      T000K2_n75TBM32_DEL_FLG = new boolean[] {false} ;
      T000K2_A409TBM32_CRT_PROG_NM = new String[] {""} ;
      T000K2_n409TBM32_CRT_PROG_NM = new boolean[] {false} ;
      T000K2_A412TBM32_UPD_PROG_NM = new String[] {""} ;
      T000K2_n412TBM32_UPD_PROG_NM = new boolean[] {false} ;
      T000K11_A70TBM32_STUDY_ID = new long[1] ;
      T000K11_A71TBM32_CRF_ID = new short[1] ;
      T000K11_A72TBM32_CRF_ITEM_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm32_crf_item__default(),
         new Object[] {
             new Object[] {
            T000K2_A70TBM32_STUDY_ID, T000K2_A71TBM32_CRF_ID, T000K2_A72TBM32_CRF_ITEM_CD, T000K2_A407TBM32_CRT_DATETIME, T000K2_n407TBM32_CRT_DATETIME, T000K2_A408TBM32_CRT_USER_ID, T000K2_n408TBM32_CRT_USER_ID, T000K2_A410TBM32_UPD_DATETIME, T000K2_n410TBM32_UPD_DATETIME, T000K2_A411TBM32_UPD_USER_ID,
            T000K2_n411TBM32_UPD_USER_ID, T000K2_A413TBM32_UPD_CNT, T000K2_n413TBM32_UPD_CNT, T000K2_A405TBM32_CRF_ITEM_NM, T000K2_n405TBM32_CRF_ITEM_NM, T000K2_A74TBM32_CRF_ITEM_DIV, T000K2_n74TBM32_CRF_ITEM_DIV, T000K2_A73TBM32_CRF_ITEM_GRP_CD, T000K2_n73TBM32_CRF_ITEM_GRP_CD, T000K2_A507TBM32_CRF_ITEM_GRP_ORDER,
            T000K2_n507TBM32_CRF_ITEM_GRP_ORDER, T000K2_A508TBM32_LOCATION_X, T000K2_n508TBM32_LOCATION_X, T000K2_A509TBM32_LOCATION_Y, T000K2_n509TBM32_LOCATION_Y, T000K2_A510TBM32_LOCATION_X2, T000K2_n510TBM32_LOCATION_X2, T000K2_A511TBM32_LOCATION_Y2, T000K2_n511TBM32_LOCATION_Y2, T000K2_A512TBM32_TEXT_ALIGN_DIV,
            T000K2_n512TBM32_TEXT_ALIGN_DIV, T000K2_A516TBM32_TEXT_MAXROWS, T000K2_n516TBM32_TEXT_MAXROWS, T000K2_A517TBM32_TEXT_MAXLENGTH, T000K2_n517TBM32_TEXT_MAXLENGTH, T000K2_A518TBM32_DECIMAL_DIGITS, T000K2_n518TBM32_DECIMAL_DIGITS, T000K2_A522TBM32_CHK_TRUE_INNER_VALUE, T000K2_n522TBM32_CHK_TRUE_INNER_VALUE, T000K2_A523TBM32_CHK_FALSE_INNER_VALUE,
            T000K2_n523TBM32_CHK_FALSE_INNER_VALUE, T000K2_A527TBM32_FIXED_VALUE, T000K2_n527TBM32_FIXED_VALUE, T000K2_A525TBM32_LIST_CD, T000K2_n525TBM32_LIST_CD, T000K2_A526TBM32_IMAGE_CD, T000K2_n526TBM32_IMAGE_CD, T000K2_A524TBM32_TEXT, T000K2_n524TBM32_TEXT, T000K2_A513TBM32_FONT_SIZE,
            T000K2_n513TBM32_FONT_SIZE, T000K2_A514TBM32_FONT_UL_FLG, T000K2_n514TBM32_FONT_UL_FLG, T000K2_A515TBM32_FONT_COLOR_DIV, T000K2_n515TBM32_FONT_COLOR_DIV, T000K2_A521TBM32_LINE_SIZE_DIV, T000K2_n521TBM32_LINE_SIZE_DIV, T000K2_A689TBM32_LINE_COLOR_DIV, T000K2_n689TBM32_LINE_COLOR_DIV, T000K2_A519TBM32_LINE_START_POINT_DIV,
            T000K2_n519TBM32_LINE_START_POINT_DIV, T000K2_A520TBM32_LINE_END_POINT_DIV, T000K2_n520TBM32_LINE_END_POINT_DIV, T000K2_A690TBM32_LINE_ANGLE, T000K2_n690TBM32_LINE_ANGLE, T000K2_A644TBM32_AUTH_LVL_MIN, T000K2_n644TBM32_AUTH_LVL_MIN, T000K2_A645TBM32_ZORDER, T000K2_n645TBM32_ZORDER, T000K2_A691TBM32_TAB_ORDER,
            T000K2_n691TBM32_TAB_ORDER, T000K2_A692TBM32_TABSTOP_FLG, T000K2_n692TBM32_TABSTOP_FLG, T000K2_A693TBM32_REQUIRED_INPUT_FLG, T000K2_n693TBM32_REQUIRED_INPUT_FLG, T000K2_A694TBM32_MIN_VALUE, T000K2_n694TBM32_MIN_VALUE, T000K2_A695TBM32_MAX_VALUE, T000K2_n695TBM32_MAX_VALUE, T000K2_A406TBM32_CRF_ITEM_NOTE,
            T000K2_n406TBM32_CRF_ITEM_NOTE, T000K2_A774TBM32_REF_CRF_ID, T000K2_n774TBM32_REF_CRF_ID, T000K2_A775TBM32_REF_CRF_ITEM_CD, T000K2_n775TBM32_REF_CRF_ITEM_CD, T000K2_A75TBM32_DEL_FLG, T000K2_n75TBM32_DEL_FLG, T000K2_A409TBM32_CRT_PROG_NM, T000K2_n409TBM32_CRT_PROG_NM, T000K2_A412TBM32_UPD_PROG_NM,
            T000K2_n412TBM32_UPD_PROG_NM
            }
            , new Object[] {
            T000K3_A70TBM32_STUDY_ID, T000K3_A71TBM32_CRF_ID, T000K3_A72TBM32_CRF_ITEM_CD, T000K3_A407TBM32_CRT_DATETIME, T000K3_n407TBM32_CRT_DATETIME, T000K3_A408TBM32_CRT_USER_ID, T000K3_n408TBM32_CRT_USER_ID, T000K3_A410TBM32_UPD_DATETIME, T000K3_n410TBM32_UPD_DATETIME, T000K3_A411TBM32_UPD_USER_ID,
            T000K3_n411TBM32_UPD_USER_ID, T000K3_A413TBM32_UPD_CNT, T000K3_n413TBM32_UPD_CNT, T000K3_A405TBM32_CRF_ITEM_NM, T000K3_n405TBM32_CRF_ITEM_NM, T000K3_A74TBM32_CRF_ITEM_DIV, T000K3_n74TBM32_CRF_ITEM_DIV, T000K3_A73TBM32_CRF_ITEM_GRP_CD, T000K3_n73TBM32_CRF_ITEM_GRP_CD, T000K3_A507TBM32_CRF_ITEM_GRP_ORDER,
            T000K3_n507TBM32_CRF_ITEM_GRP_ORDER, T000K3_A508TBM32_LOCATION_X, T000K3_n508TBM32_LOCATION_X, T000K3_A509TBM32_LOCATION_Y, T000K3_n509TBM32_LOCATION_Y, T000K3_A510TBM32_LOCATION_X2, T000K3_n510TBM32_LOCATION_X2, T000K3_A511TBM32_LOCATION_Y2, T000K3_n511TBM32_LOCATION_Y2, T000K3_A512TBM32_TEXT_ALIGN_DIV,
            T000K3_n512TBM32_TEXT_ALIGN_DIV, T000K3_A516TBM32_TEXT_MAXROWS, T000K3_n516TBM32_TEXT_MAXROWS, T000K3_A517TBM32_TEXT_MAXLENGTH, T000K3_n517TBM32_TEXT_MAXLENGTH, T000K3_A518TBM32_DECIMAL_DIGITS, T000K3_n518TBM32_DECIMAL_DIGITS, T000K3_A522TBM32_CHK_TRUE_INNER_VALUE, T000K3_n522TBM32_CHK_TRUE_INNER_VALUE, T000K3_A523TBM32_CHK_FALSE_INNER_VALUE,
            T000K3_n523TBM32_CHK_FALSE_INNER_VALUE, T000K3_A527TBM32_FIXED_VALUE, T000K3_n527TBM32_FIXED_VALUE, T000K3_A525TBM32_LIST_CD, T000K3_n525TBM32_LIST_CD, T000K3_A526TBM32_IMAGE_CD, T000K3_n526TBM32_IMAGE_CD, T000K3_A524TBM32_TEXT, T000K3_n524TBM32_TEXT, T000K3_A513TBM32_FONT_SIZE,
            T000K3_n513TBM32_FONT_SIZE, T000K3_A514TBM32_FONT_UL_FLG, T000K3_n514TBM32_FONT_UL_FLG, T000K3_A515TBM32_FONT_COLOR_DIV, T000K3_n515TBM32_FONT_COLOR_DIV, T000K3_A521TBM32_LINE_SIZE_DIV, T000K3_n521TBM32_LINE_SIZE_DIV, T000K3_A689TBM32_LINE_COLOR_DIV, T000K3_n689TBM32_LINE_COLOR_DIV, T000K3_A519TBM32_LINE_START_POINT_DIV,
            T000K3_n519TBM32_LINE_START_POINT_DIV, T000K3_A520TBM32_LINE_END_POINT_DIV, T000K3_n520TBM32_LINE_END_POINT_DIV, T000K3_A690TBM32_LINE_ANGLE, T000K3_n690TBM32_LINE_ANGLE, T000K3_A644TBM32_AUTH_LVL_MIN, T000K3_n644TBM32_AUTH_LVL_MIN, T000K3_A645TBM32_ZORDER, T000K3_n645TBM32_ZORDER, T000K3_A691TBM32_TAB_ORDER,
            T000K3_n691TBM32_TAB_ORDER, T000K3_A692TBM32_TABSTOP_FLG, T000K3_n692TBM32_TABSTOP_FLG, T000K3_A693TBM32_REQUIRED_INPUT_FLG, T000K3_n693TBM32_REQUIRED_INPUT_FLG, T000K3_A694TBM32_MIN_VALUE, T000K3_n694TBM32_MIN_VALUE, T000K3_A695TBM32_MAX_VALUE, T000K3_n695TBM32_MAX_VALUE, T000K3_A406TBM32_CRF_ITEM_NOTE,
            T000K3_n406TBM32_CRF_ITEM_NOTE, T000K3_A774TBM32_REF_CRF_ID, T000K3_n774TBM32_REF_CRF_ID, T000K3_A775TBM32_REF_CRF_ITEM_CD, T000K3_n775TBM32_REF_CRF_ITEM_CD, T000K3_A75TBM32_DEL_FLG, T000K3_n75TBM32_DEL_FLG, T000K3_A409TBM32_CRT_PROG_NM, T000K3_n409TBM32_CRT_PROG_NM, T000K3_A412TBM32_UPD_PROG_NM,
            T000K3_n412TBM32_UPD_PROG_NM
            }
            , new Object[] {
            T000K4_A70TBM32_STUDY_ID, T000K4_A71TBM32_CRF_ID, T000K4_A72TBM32_CRF_ITEM_CD, T000K4_A407TBM32_CRT_DATETIME, T000K4_n407TBM32_CRT_DATETIME, T000K4_A408TBM32_CRT_USER_ID, T000K4_n408TBM32_CRT_USER_ID, T000K4_A410TBM32_UPD_DATETIME, T000K4_n410TBM32_UPD_DATETIME, T000K4_A411TBM32_UPD_USER_ID,
            T000K4_n411TBM32_UPD_USER_ID, T000K4_A413TBM32_UPD_CNT, T000K4_n413TBM32_UPD_CNT, T000K4_A405TBM32_CRF_ITEM_NM, T000K4_n405TBM32_CRF_ITEM_NM, T000K4_A74TBM32_CRF_ITEM_DIV, T000K4_n74TBM32_CRF_ITEM_DIV, T000K4_A73TBM32_CRF_ITEM_GRP_CD, T000K4_n73TBM32_CRF_ITEM_GRP_CD, T000K4_A507TBM32_CRF_ITEM_GRP_ORDER,
            T000K4_n507TBM32_CRF_ITEM_GRP_ORDER, T000K4_A508TBM32_LOCATION_X, T000K4_n508TBM32_LOCATION_X, T000K4_A509TBM32_LOCATION_Y, T000K4_n509TBM32_LOCATION_Y, T000K4_A510TBM32_LOCATION_X2, T000K4_n510TBM32_LOCATION_X2, T000K4_A511TBM32_LOCATION_Y2, T000K4_n511TBM32_LOCATION_Y2, T000K4_A512TBM32_TEXT_ALIGN_DIV,
            T000K4_n512TBM32_TEXT_ALIGN_DIV, T000K4_A516TBM32_TEXT_MAXROWS, T000K4_n516TBM32_TEXT_MAXROWS, T000K4_A517TBM32_TEXT_MAXLENGTH, T000K4_n517TBM32_TEXT_MAXLENGTH, T000K4_A518TBM32_DECIMAL_DIGITS, T000K4_n518TBM32_DECIMAL_DIGITS, T000K4_A522TBM32_CHK_TRUE_INNER_VALUE, T000K4_n522TBM32_CHK_TRUE_INNER_VALUE, T000K4_A523TBM32_CHK_FALSE_INNER_VALUE,
            T000K4_n523TBM32_CHK_FALSE_INNER_VALUE, T000K4_A527TBM32_FIXED_VALUE, T000K4_n527TBM32_FIXED_VALUE, T000K4_A525TBM32_LIST_CD, T000K4_n525TBM32_LIST_CD, T000K4_A526TBM32_IMAGE_CD, T000K4_n526TBM32_IMAGE_CD, T000K4_A524TBM32_TEXT, T000K4_n524TBM32_TEXT, T000K4_A513TBM32_FONT_SIZE,
            T000K4_n513TBM32_FONT_SIZE, T000K4_A514TBM32_FONT_UL_FLG, T000K4_n514TBM32_FONT_UL_FLG, T000K4_A515TBM32_FONT_COLOR_DIV, T000K4_n515TBM32_FONT_COLOR_DIV, T000K4_A521TBM32_LINE_SIZE_DIV, T000K4_n521TBM32_LINE_SIZE_DIV, T000K4_A689TBM32_LINE_COLOR_DIV, T000K4_n689TBM32_LINE_COLOR_DIV, T000K4_A519TBM32_LINE_START_POINT_DIV,
            T000K4_n519TBM32_LINE_START_POINT_DIV, T000K4_A520TBM32_LINE_END_POINT_DIV, T000K4_n520TBM32_LINE_END_POINT_DIV, T000K4_A690TBM32_LINE_ANGLE, T000K4_n690TBM32_LINE_ANGLE, T000K4_A644TBM32_AUTH_LVL_MIN, T000K4_n644TBM32_AUTH_LVL_MIN, T000K4_A645TBM32_ZORDER, T000K4_n645TBM32_ZORDER, T000K4_A691TBM32_TAB_ORDER,
            T000K4_n691TBM32_TAB_ORDER, T000K4_A692TBM32_TABSTOP_FLG, T000K4_n692TBM32_TABSTOP_FLG, T000K4_A693TBM32_REQUIRED_INPUT_FLG, T000K4_n693TBM32_REQUIRED_INPUT_FLG, T000K4_A694TBM32_MIN_VALUE, T000K4_n694TBM32_MIN_VALUE, T000K4_A695TBM32_MAX_VALUE, T000K4_n695TBM32_MAX_VALUE, T000K4_A406TBM32_CRF_ITEM_NOTE,
            T000K4_n406TBM32_CRF_ITEM_NOTE, T000K4_A774TBM32_REF_CRF_ID, T000K4_n774TBM32_REF_CRF_ID, T000K4_A775TBM32_REF_CRF_ITEM_CD, T000K4_n775TBM32_REF_CRF_ITEM_CD, T000K4_A75TBM32_DEL_FLG, T000K4_n75TBM32_DEL_FLG, T000K4_A409TBM32_CRT_PROG_NM, T000K4_n409TBM32_CRT_PROG_NM, T000K4_A412TBM32_UPD_PROG_NM,
            T000K4_n412TBM32_UPD_PROG_NM
            }
            , new Object[] {
            T000K5_A70TBM32_STUDY_ID, T000K5_A71TBM32_CRF_ID, T000K5_A72TBM32_CRF_ITEM_CD
            }
            , new Object[] {
            T000K6_A70TBM32_STUDY_ID, T000K6_A71TBM32_CRF_ID, T000K6_A72TBM32_CRF_ITEM_CD
            }
            , new Object[] {
            T000K7_A70TBM32_STUDY_ID, T000K7_A71TBM32_CRF_ID, T000K7_A72TBM32_CRF_ITEM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000K11_A70TBM32_STUDY_ID, T000K11_A71TBM32_CRF_ID, T000K11_A72TBM32_CRF_ITEM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM32_CRF_ITEM" ;
   }

   private byte Z516TBM32_TEXT_MAXROWS ;
   private byte Z518TBM32_DECIMAL_DIGITS ;
   private byte Z513TBM32_FONT_SIZE ;
   private byte Z521TBM32_LINE_SIZE_DIV ;
   private byte Z644TBM32_AUTH_LVL_MIN ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A516TBM32_TEXT_MAXROWS ;
   private byte A518TBM32_DECIMAL_DIGITS ;
   private byte A513TBM32_FONT_SIZE ;
   private byte A521TBM32_LINE_SIZE_DIV ;
   private byte A644TBM32_AUTH_LVL_MIN ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z71TBM32_CRF_ID ;
   private short Z507TBM32_CRF_ITEM_GRP_ORDER ;
   private short Z508TBM32_LOCATION_X ;
   private short Z509TBM32_LOCATION_Y ;
   private short Z510TBM32_LOCATION_X2 ;
   private short Z511TBM32_LOCATION_Y2 ;
   private short Z517TBM32_TEXT_MAXLENGTH ;
   private short Z690TBM32_LINE_ANGLE ;
   private short Z645TBM32_ZORDER ;
   private short Z691TBM32_TAB_ORDER ;
   private short Z774TBM32_REF_CRF_ID ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A71TBM32_CRF_ID ;
   private short A507TBM32_CRF_ITEM_GRP_ORDER ;
   private short A508TBM32_LOCATION_X ;
   private short A509TBM32_LOCATION_Y ;
   private short A510TBM32_LOCATION_X2 ;
   private short A511TBM32_LOCATION_Y2 ;
   private short A517TBM32_TEXT_MAXLENGTH ;
   private short A690TBM32_LINE_ANGLE ;
   private short A645TBM32_ZORDER ;
   private short A691TBM32_TAB_ORDER ;
   private short A774TBM32_REF_CRF_ID ;
   private short RcdFound19 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM32_STUDY_ID_Enabled ;
   private int edtTBM32_CRF_ID_Enabled ;
   private int edtTBM32_CRF_ITEM_CD_Enabled ;
   private int edtTBM32_CRF_ITEM_NM_Enabled ;
   private int edtTBM32_CRF_ITEM_DIV_Enabled ;
   private int edtTBM32_CRF_ITEM_GRP_CD_Enabled ;
   private int edtTBM32_CRF_ITEM_GRP_ORDER_Enabled ;
   private int edtTBM32_LOCATION_X_Enabled ;
   private int edtTBM32_LOCATION_Y_Enabled ;
   private int edtTBM32_LOCATION_X2_Enabled ;
   private int edtTBM32_LOCATION_Y2_Enabled ;
   private int edtTBM32_TEXT_ALIGN_DIV_Enabled ;
   private int edtTBM32_TEXT_MAXROWS_Enabled ;
   private int edtTBM32_TEXT_MAXLENGTH_Enabled ;
   private int edtTBM32_DECIMAL_DIGITS_Enabled ;
   private int edtTBM32_CHK_TRUE_INNER_VALUE_Enabled ;
   private int edtTBM32_CHK_FALSE_INNER_VALUE_Enabled ;
   private int edtTBM32_FIXED_VALUE_Enabled ;
   private int edtTBM32_LIST_CD_Enabled ;
   private int edtTBM32_IMAGE_CD_Enabled ;
   private int edtTBM32_TEXT_Enabled ;
   private int edtTBM32_FONT_SIZE_Enabled ;
   private int edtTBM32_FONT_UL_FLG_Enabled ;
   private int edtTBM32_FONT_COLOR_DIV_Enabled ;
   private int edtTBM32_LINE_SIZE_DIV_Enabled ;
   private int edtTBM32_LINE_COLOR_DIV_Enabled ;
   private int edtTBM32_LINE_START_POINT_DIV_Enabled ;
   private int edtTBM32_LINE_END_POINT_DIV_Enabled ;
   private int edtTBM32_LINE_ANGLE_Enabled ;
   private int edtTBM32_AUTH_LVL_MIN_Enabled ;
   private int edtTBM32_ZORDER_Enabled ;
   private int edtTBM32_TAB_ORDER_Enabled ;
   private int edtTBM32_TABSTOP_FLG_Enabled ;
   private int edtTBM32_REQUIRED_INPUT_FLG_Enabled ;
   private int edtTBM32_MIN_VALUE_Enabled ;
   private int edtTBM32_MAX_VALUE_Enabled ;
   private int edtTBM32_CRF_ITEM_NOTE_Enabled ;
   private int edtTBM32_REF_CRF_ID_Enabled ;
   private int edtTBM32_REF_CRF_ITEM_CD_Enabled ;
   private int edtTBM32_DEL_FLG_Enabled ;
   private int edtTBM32_CRT_DATETIME_Enabled ;
   private int edtTBM32_CRT_USER_ID_Enabled ;
   private int edtTBM32_CRT_PROG_NM_Enabled ;
   private int edtTBM32_UPD_DATETIME_Enabled ;
   private int edtTBM32_UPD_USER_ID_Enabled ;
   private int edtTBM32_UPD_PROG_NM_Enabled ;
   private int edtTBM32_UPD_CNT_Enabled ;
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
   private long Z70TBM32_STUDY_ID ;
   private long Z413TBM32_UPD_CNT ;
   private long Z515TBM32_FONT_COLOR_DIV ;
   private long Z689TBM32_LINE_COLOR_DIV ;
   private long O413TBM32_UPD_CNT ;
   private long A70TBM32_STUDY_ID ;
   private long A515TBM32_FONT_COLOR_DIV ;
   private long A689TBM32_LINE_COLOR_DIV ;
   private long A413TBM32_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM32_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm32_study_id_Internalname ;
   private String lblTextblocktbm32_study_id_Jsonclick ;
   private String edtTBM32_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm32_crf_id_Internalname ;
   private String lblTextblocktbm32_crf_id_Jsonclick ;
   private String edtTBM32_CRF_ID_Internalname ;
   private String edtTBM32_CRF_ID_Jsonclick ;
   private String lblTextblocktbm32_crf_item_cd_Internalname ;
   private String lblTextblocktbm32_crf_item_cd_Jsonclick ;
   private String edtTBM32_CRF_ITEM_CD_Internalname ;
   private String edtTBM32_CRF_ITEM_CD_Jsonclick ;
   private String lblTextblocktbm32_crf_item_nm_Internalname ;
   private String lblTextblocktbm32_crf_item_nm_Jsonclick ;
   private String edtTBM32_CRF_ITEM_NM_Internalname ;
   private String lblTextblocktbm32_crf_item_div_Internalname ;
   private String lblTextblocktbm32_crf_item_div_Jsonclick ;
   private String edtTBM32_CRF_ITEM_DIV_Internalname ;
   private String edtTBM32_CRF_ITEM_DIV_Jsonclick ;
   private String lblTextblocktbm32_crf_item_grp_cd_Internalname ;
   private String lblTextblocktbm32_crf_item_grp_cd_Jsonclick ;
   private String edtTBM32_CRF_ITEM_GRP_CD_Internalname ;
   private String edtTBM32_CRF_ITEM_GRP_CD_Jsonclick ;
   private String lblTextblocktbm32_crf_item_grp_order_Internalname ;
   private String lblTextblocktbm32_crf_item_grp_order_Jsonclick ;
   private String edtTBM32_CRF_ITEM_GRP_ORDER_Internalname ;
   private String edtTBM32_CRF_ITEM_GRP_ORDER_Jsonclick ;
   private String lblTextblocktbm32_location_x_Internalname ;
   private String lblTextblocktbm32_location_x_Jsonclick ;
   private String edtTBM32_LOCATION_X_Internalname ;
   private String edtTBM32_LOCATION_X_Jsonclick ;
   private String lblTextblocktbm32_location_y_Internalname ;
   private String lblTextblocktbm32_location_y_Jsonclick ;
   private String edtTBM32_LOCATION_Y_Internalname ;
   private String edtTBM32_LOCATION_Y_Jsonclick ;
   private String lblTextblocktbm32_location_x2_Internalname ;
   private String lblTextblocktbm32_location_x2_Jsonclick ;
   private String edtTBM32_LOCATION_X2_Internalname ;
   private String edtTBM32_LOCATION_X2_Jsonclick ;
   private String lblTextblocktbm32_location_y2_Internalname ;
   private String lblTextblocktbm32_location_y2_Jsonclick ;
   private String edtTBM32_LOCATION_Y2_Internalname ;
   private String edtTBM32_LOCATION_Y2_Jsonclick ;
   private String lblTextblocktbm32_text_align_div_Internalname ;
   private String lblTextblocktbm32_text_align_div_Jsonclick ;
   private String edtTBM32_TEXT_ALIGN_DIV_Internalname ;
   private String edtTBM32_TEXT_ALIGN_DIV_Jsonclick ;
   private String lblTextblocktbm32_text_maxrows_Internalname ;
   private String lblTextblocktbm32_text_maxrows_Jsonclick ;
   private String edtTBM32_TEXT_MAXROWS_Internalname ;
   private String edtTBM32_TEXT_MAXROWS_Jsonclick ;
   private String lblTextblocktbm32_text_maxlength_Internalname ;
   private String lblTextblocktbm32_text_maxlength_Jsonclick ;
   private String edtTBM32_TEXT_MAXLENGTH_Internalname ;
   private String edtTBM32_TEXT_MAXLENGTH_Jsonclick ;
   private String lblTextblocktbm32_decimal_digits_Internalname ;
   private String lblTextblocktbm32_decimal_digits_Jsonclick ;
   private String edtTBM32_DECIMAL_DIGITS_Internalname ;
   private String edtTBM32_DECIMAL_DIGITS_Jsonclick ;
   private String lblTextblocktbm32_chk_true_inner_value_Internalname ;
   private String lblTextblocktbm32_chk_true_inner_value_Jsonclick ;
   private String edtTBM32_CHK_TRUE_INNER_VALUE_Internalname ;
   private String edtTBM32_CHK_TRUE_INNER_VALUE_Jsonclick ;
   private String lblTextblocktbm32_chk_false_inner_value_Internalname ;
   private String lblTextblocktbm32_chk_false_inner_value_Jsonclick ;
   private String edtTBM32_CHK_FALSE_INNER_VALUE_Internalname ;
   private String edtTBM32_CHK_FALSE_INNER_VALUE_Jsonclick ;
   private String lblTextblocktbm32_fixed_value_Internalname ;
   private String lblTextblocktbm32_fixed_value_Jsonclick ;
   private String edtTBM32_FIXED_VALUE_Internalname ;
   private String edtTBM32_FIXED_VALUE_Jsonclick ;
   private String lblTextblocktbm32_list_cd_Internalname ;
   private String lblTextblocktbm32_list_cd_Jsonclick ;
   private String edtTBM32_LIST_CD_Internalname ;
   private String edtTBM32_LIST_CD_Jsonclick ;
   private String lblTextblocktbm32_image_cd_Internalname ;
   private String lblTextblocktbm32_image_cd_Jsonclick ;
   private String edtTBM32_IMAGE_CD_Internalname ;
   private String edtTBM32_IMAGE_CD_Jsonclick ;
   private String lblTextblocktbm32_text_Internalname ;
   private String lblTextblocktbm32_text_Jsonclick ;
   private String edtTBM32_TEXT_Internalname ;
   private String lblTextblocktbm32_font_size_Internalname ;
   private String lblTextblocktbm32_font_size_Jsonclick ;
   private String edtTBM32_FONT_SIZE_Internalname ;
   private String edtTBM32_FONT_SIZE_Jsonclick ;
   private String lblTextblocktbm32_font_ul_flg_Internalname ;
   private String lblTextblocktbm32_font_ul_flg_Jsonclick ;
   private String edtTBM32_FONT_UL_FLG_Internalname ;
   private String edtTBM32_FONT_UL_FLG_Jsonclick ;
   private String lblTextblocktbm32_font_color_div_Internalname ;
   private String lblTextblocktbm32_font_color_div_Jsonclick ;
   private String edtTBM32_FONT_COLOR_DIV_Internalname ;
   private String edtTBM32_FONT_COLOR_DIV_Jsonclick ;
   private String lblTextblocktbm32_line_size_div_Internalname ;
   private String lblTextblocktbm32_line_size_div_Jsonclick ;
   private String edtTBM32_LINE_SIZE_DIV_Internalname ;
   private String edtTBM32_LINE_SIZE_DIV_Jsonclick ;
   private String lblTextblocktbm32_line_color_div_Internalname ;
   private String lblTextblocktbm32_line_color_div_Jsonclick ;
   private String edtTBM32_LINE_COLOR_DIV_Internalname ;
   private String edtTBM32_LINE_COLOR_DIV_Jsonclick ;
   private String lblTextblocktbm32_line_start_point_div_Internalname ;
   private String lblTextblocktbm32_line_start_point_div_Jsonclick ;
   private String edtTBM32_LINE_START_POINT_DIV_Internalname ;
   private String edtTBM32_LINE_START_POINT_DIV_Jsonclick ;
   private String lblTextblocktbm32_line_end_point_div_Internalname ;
   private String lblTextblocktbm32_line_end_point_div_Jsonclick ;
   private String edtTBM32_LINE_END_POINT_DIV_Internalname ;
   private String edtTBM32_LINE_END_POINT_DIV_Jsonclick ;
   private String lblTextblocktbm32_line_angle_Internalname ;
   private String lblTextblocktbm32_line_angle_Jsonclick ;
   private String edtTBM32_LINE_ANGLE_Internalname ;
   private String edtTBM32_LINE_ANGLE_Jsonclick ;
   private String lblTextblocktbm32_auth_lvl_min_Internalname ;
   private String lblTextblocktbm32_auth_lvl_min_Jsonclick ;
   private String edtTBM32_AUTH_LVL_MIN_Internalname ;
   private String edtTBM32_AUTH_LVL_MIN_Jsonclick ;
   private String lblTextblocktbm32_zorder_Internalname ;
   private String lblTextblocktbm32_zorder_Jsonclick ;
   private String edtTBM32_ZORDER_Internalname ;
   private String edtTBM32_ZORDER_Jsonclick ;
   private String lblTextblocktbm32_tab_order_Internalname ;
   private String lblTextblocktbm32_tab_order_Jsonclick ;
   private String edtTBM32_TAB_ORDER_Internalname ;
   private String edtTBM32_TAB_ORDER_Jsonclick ;
   private String lblTextblocktbm32_tabstop_flg_Internalname ;
   private String lblTextblocktbm32_tabstop_flg_Jsonclick ;
   private String edtTBM32_TABSTOP_FLG_Internalname ;
   private String edtTBM32_TABSTOP_FLG_Jsonclick ;
   private String lblTextblocktbm32_required_input_flg_Internalname ;
   private String lblTextblocktbm32_required_input_flg_Jsonclick ;
   private String edtTBM32_REQUIRED_INPUT_FLG_Internalname ;
   private String edtTBM32_REQUIRED_INPUT_FLG_Jsonclick ;
   private String lblTextblocktbm32_min_value_Internalname ;
   private String lblTextblocktbm32_min_value_Jsonclick ;
   private String edtTBM32_MIN_VALUE_Internalname ;
   private String edtTBM32_MIN_VALUE_Jsonclick ;
   private String lblTextblocktbm32_max_value_Internalname ;
   private String lblTextblocktbm32_max_value_Jsonclick ;
   private String edtTBM32_MAX_VALUE_Internalname ;
   private String edtTBM32_MAX_VALUE_Jsonclick ;
   private String lblTextblocktbm32_crf_item_note_Internalname ;
   private String lblTextblocktbm32_crf_item_note_Jsonclick ;
   private String edtTBM32_CRF_ITEM_NOTE_Internalname ;
   private String lblTextblocktbm32_ref_crf_id_Internalname ;
   private String lblTextblocktbm32_ref_crf_id_Jsonclick ;
   private String edtTBM32_REF_CRF_ID_Internalname ;
   private String edtTBM32_REF_CRF_ID_Jsonclick ;
   private String lblTextblocktbm32_ref_crf_item_cd_Internalname ;
   private String lblTextblocktbm32_ref_crf_item_cd_Jsonclick ;
   private String edtTBM32_REF_CRF_ITEM_CD_Internalname ;
   private String edtTBM32_REF_CRF_ITEM_CD_Jsonclick ;
   private String lblTextblocktbm32_del_flg_Internalname ;
   private String lblTextblocktbm32_del_flg_Jsonclick ;
   private String edtTBM32_DEL_FLG_Internalname ;
   private String edtTBM32_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm32_crt_datetime_Internalname ;
   private String lblTextblocktbm32_crt_datetime_Jsonclick ;
   private String edtTBM32_CRT_DATETIME_Internalname ;
   private String edtTBM32_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm32_crt_user_id_Internalname ;
   private String lblTextblocktbm32_crt_user_id_Jsonclick ;
   private String edtTBM32_CRT_USER_ID_Internalname ;
   private String edtTBM32_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm32_crt_prog_nm_Internalname ;
   private String lblTextblocktbm32_crt_prog_nm_Jsonclick ;
   private String edtTBM32_CRT_PROG_NM_Internalname ;
   private String edtTBM32_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm32_upd_datetime_Internalname ;
   private String lblTextblocktbm32_upd_datetime_Jsonclick ;
   private String edtTBM32_UPD_DATETIME_Internalname ;
   private String edtTBM32_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm32_upd_user_id_Internalname ;
   private String lblTextblocktbm32_upd_user_id_Jsonclick ;
   private String edtTBM32_UPD_USER_ID_Internalname ;
   private String edtTBM32_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm32_upd_prog_nm_Internalname ;
   private String lblTextblocktbm32_upd_prog_nm_Jsonclick ;
   private String edtTBM32_UPD_PROG_NM_Internalname ;
   private String edtTBM32_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm32_upd_cnt_Internalname ;
   private String lblTextblocktbm32_upd_cnt_Jsonclick ;
   private String edtTBM32_UPD_CNT_Internalname ;
   private String edtTBM32_UPD_CNT_Jsonclick ;
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
   private String sMode19 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z407TBM32_CRT_DATETIME ;
   private java.util.Date Z410TBM32_UPD_DATETIME ;
   private java.util.Date A407TBM32_CRT_DATETIME ;
   private java.util.Date A410TBM32_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n405TBM32_CRF_ITEM_NM ;
   private boolean n74TBM32_CRF_ITEM_DIV ;
   private boolean n73TBM32_CRF_ITEM_GRP_CD ;
   private boolean n507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean n508TBM32_LOCATION_X ;
   private boolean n509TBM32_LOCATION_Y ;
   private boolean n510TBM32_LOCATION_X2 ;
   private boolean n511TBM32_LOCATION_Y2 ;
   private boolean n512TBM32_TEXT_ALIGN_DIV ;
   private boolean n516TBM32_TEXT_MAXROWS ;
   private boolean n517TBM32_TEXT_MAXLENGTH ;
   private boolean n518TBM32_DECIMAL_DIGITS ;
   private boolean n522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean n523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean n527TBM32_FIXED_VALUE ;
   private boolean n525TBM32_LIST_CD ;
   private boolean n526TBM32_IMAGE_CD ;
   private boolean n524TBM32_TEXT ;
   private boolean n513TBM32_FONT_SIZE ;
   private boolean n514TBM32_FONT_UL_FLG ;
   private boolean n515TBM32_FONT_COLOR_DIV ;
   private boolean n521TBM32_LINE_SIZE_DIV ;
   private boolean n689TBM32_LINE_COLOR_DIV ;
   private boolean n519TBM32_LINE_START_POINT_DIV ;
   private boolean n520TBM32_LINE_END_POINT_DIV ;
   private boolean n690TBM32_LINE_ANGLE ;
   private boolean n644TBM32_AUTH_LVL_MIN ;
   private boolean n645TBM32_ZORDER ;
   private boolean n691TBM32_TAB_ORDER ;
   private boolean n692TBM32_TABSTOP_FLG ;
   private boolean n693TBM32_REQUIRED_INPUT_FLG ;
   private boolean n694TBM32_MIN_VALUE ;
   private boolean n695TBM32_MAX_VALUE ;
   private boolean n406TBM32_CRF_ITEM_NOTE ;
   private boolean n774TBM32_REF_CRF_ID ;
   private boolean n775TBM32_REF_CRF_ITEM_CD ;
   private boolean n75TBM32_DEL_FLG ;
   private boolean n407TBM32_CRT_DATETIME ;
   private boolean n408TBM32_CRT_USER_ID ;
   private boolean n409TBM32_CRT_PROG_NM ;
   private boolean n410TBM32_UPD_DATETIME ;
   private boolean n411TBM32_UPD_USER_ID ;
   private boolean n412TBM32_UPD_PROG_NM ;
   private boolean n413TBM32_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z72TBM32_CRF_ITEM_CD ;
   private String Z408TBM32_CRT_USER_ID ;
   private String Z411TBM32_UPD_USER_ID ;
   private String Z405TBM32_CRF_ITEM_NM ;
   private String Z74TBM32_CRF_ITEM_DIV ;
   private String Z73TBM32_CRF_ITEM_GRP_CD ;
   private String Z512TBM32_TEXT_ALIGN_DIV ;
   private String Z522TBM32_CHK_TRUE_INNER_VALUE ;
   private String Z523TBM32_CHK_FALSE_INNER_VALUE ;
   private String Z527TBM32_FIXED_VALUE ;
   private String Z525TBM32_LIST_CD ;
   private String Z526TBM32_IMAGE_CD ;
   private String Z524TBM32_TEXT ;
   private String Z514TBM32_FONT_UL_FLG ;
   private String Z519TBM32_LINE_START_POINT_DIV ;
   private String Z520TBM32_LINE_END_POINT_DIV ;
   private String Z692TBM32_TABSTOP_FLG ;
   private String Z693TBM32_REQUIRED_INPUT_FLG ;
   private String Z694TBM32_MIN_VALUE ;
   private String Z695TBM32_MAX_VALUE ;
   private String Z406TBM32_CRF_ITEM_NOTE ;
   private String Z775TBM32_REF_CRF_ITEM_CD ;
   private String Z75TBM32_DEL_FLG ;
   private String Z409TBM32_CRT_PROG_NM ;
   private String Z412TBM32_UPD_PROG_NM ;
   private String A72TBM32_CRF_ITEM_CD ;
   private String A405TBM32_CRF_ITEM_NM ;
   private String A74TBM32_CRF_ITEM_DIV ;
   private String A73TBM32_CRF_ITEM_GRP_CD ;
   private String A512TBM32_TEXT_ALIGN_DIV ;
   private String A522TBM32_CHK_TRUE_INNER_VALUE ;
   private String A523TBM32_CHK_FALSE_INNER_VALUE ;
   private String A527TBM32_FIXED_VALUE ;
   private String A525TBM32_LIST_CD ;
   private String A526TBM32_IMAGE_CD ;
   private String A524TBM32_TEXT ;
   private String A514TBM32_FONT_UL_FLG ;
   private String A519TBM32_LINE_START_POINT_DIV ;
   private String A520TBM32_LINE_END_POINT_DIV ;
   private String A692TBM32_TABSTOP_FLG ;
   private String A693TBM32_REQUIRED_INPUT_FLG ;
   private String A694TBM32_MIN_VALUE ;
   private String A695TBM32_MAX_VALUE ;
   private String A406TBM32_CRF_ITEM_NOTE ;
   private String A775TBM32_REF_CRF_ITEM_CD ;
   private String A75TBM32_DEL_FLG ;
   private String A408TBM32_CRT_USER_ID ;
   private String A409TBM32_CRT_PROG_NM ;
   private String A411TBM32_UPD_USER_ID ;
   private String A412TBM32_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000K4_A70TBM32_STUDY_ID ;
   private short[] T000K4_A71TBM32_CRF_ID ;
   private String[] T000K4_A72TBM32_CRF_ITEM_CD ;
   private java.util.Date[] T000K4_A407TBM32_CRT_DATETIME ;
   private boolean[] T000K4_n407TBM32_CRT_DATETIME ;
   private String[] T000K4_A408TBM32_CRT_USER_ID ;
   private boolean[] T000K4_n408TBM32_CRT_USER_ID ;
   private java.util.Date[] T000K4_A410TBM32_UPD_DATETIME ;
   private boolean[] T000K4_n410TBM32_UPD_DATETIME ;
   private String[] T000K4_A411TBM32_UPD_USER_ID ;
   private boolean[] T000K4_n411TBM32_UPD_USER_ID ;
   private long[] T000K4_A413TBM32_UPD_CNT ;
   private boolean[] T000K4_n413TBM32_UPD_CNT ;
   private String[] T000K4_A405TBM32_CRF_ITEM_NM ;
   private boolean[] T000K4_n405TBM32_CRF_ITEM_NM ;
   private String[] T000K4_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] T000K4_n74TBM32_CRF_ITEM_DIV ;
   private String[] T000K4_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] T000K4_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] T000K4_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] T000K4_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] T000K4_A508TBM32_LOCATION_X ;
   private boolean[] T000K4_n508TBM32_LOCATION_X ;
   private short[] T000K4_A509TBM32_LOCATION_Y ;
   private boolean[] T000K4_n509TBM32_LOCATION_Y ;
   private short[] T000K4_A510TBM32_LOCATION_X2 ;
   private boolean[] T000K4_n510TBM32_LOCATION_X2 ;
   private short[] T000K4_A511TBM32_LOCATION_Y2 ;
   private boolean[] T000K4_n511TBM32_LOCATION_Y2 ;
   private String[] T000K4_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] T000K4_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] T000K4_A516TBM32_TEXT_MAXROWS ;
   private boolean[] T000K4_n516TBM32_TEXT_MAXROWS ;
   private short[] T000K4_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] T000K4_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] T000K4_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] T000K4_n518TBM32_DECIMAL_DIGITS ;
   private String[] T000K4_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] T000K4_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] T000K4_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] T000K4_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] T000K4_A527TBM32_FIXED_VALUE ;
   private boolean[] T000K4_n527TBM32_FIXED_VALUE ;
   private String[] T000K4_A525TBM32_LIST_CD ;
   private boolean[] T000K4_n525TBM32_LIST_CD ;
   private String[] T000K4_A526TBM32_IMAGE_CD ;
   private boolean[] T000K4_n526TBM32_IMAGE_CD ;
   private String[] T000K4_A524TBM32_TEXT ;
   private boolean[] T000K4_n524TBM32_TEXT ;
   private byte[] T000K4_A513TBM32_FONT_SIZE ;
   private boolean[] T000K4_n513TBM32_FONT_SIZE ;
   private String[] T000K4_A514TBM32_FONT_UL_FLG ;
   private boolean[] T000K4_n514TBM32_FONT_UL_FLG ;
   private long[] T000K4_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] T000K4_n515TBM32_FONT_COLOR_DIV ;
   private byte[] T000K4_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] T000K4_n521TBM32_LINE_SIZE_DIV ;
   private long[] T000K4_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] T000K4_n689TBM32_LINE_COLOR_DIV ;
   private String[] T000K4_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] T000K4_n519TBM32_LINE_START_POINT_DIV ;
   private String[] T000K4_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] T000K4_n520TBM32_LINE_END_POINT_DIV ;
   private short[] T000K4_A690TBM32_LINE_ANGLE ;
   private boolean[] T000K4_n690TBM32_LINE_ANGLE ;
   private byte[] T000K4_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] T000K4_n644TBM32_AUTH_LVL_MIN ;
   private short[] T000K4_A645TBM32_ZORDER ;
   private boolean[] T000K4_n645TBM32_ZORDER ;
   private short[] T000K4_A691TBM32_TAB_ORDER ;
   private boolean[] T000K4_n691TBM32_TAB_ORDER ;
   private String[] T000K4_A692TBM32_TABSTOP_FLG ;
   private boolean[] T000K4_n692TBM32_TABSTOP_FLG ;
   private String[] T000K4_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] T000K4_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] T000K4_A694TBM32_MIN_VALUE ;
   private boolean[] T000K4_n694TBM32_MIN_VALUE ;
   private String[] T000K4_A695TBM32_MAX_VALUE ;
   private boolean[] T000K4_n695TBM32_MAX_VALUE ;
   private String[] T000K4_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] T000K4_n406TBM32_CRF_ITEM_NOTE ;
   private short[] T000K4_A774TBM32_REF_CRF_ID ;
   private boolean[] T000K4_n774TBM32_REF_CRF_ID ;
   private String[] T000K4_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] T000K4_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] T000K4_A75TBM32_DEL_FLG ;
   private boolean[] T000K4_n75TBM32_DEL_FLG ;
   private String[] T000K4_A409TBM32_CRT_PROG_NM ;
   private boolean[] T000K4_n409TBM32_CRT_PROG_NM ;
   private String[] T000K4_A412TBM32_UPD_PROG_NM ;
   private boolean[] T000K4_n412TBM32_UPD_PROG_NM ;
   private long[] T000K5_A70TBM32_STUDY_ID ;
   private short[] T000K5_A71TBM32_CRF_ID ;
   private String[] T000K5_A72TBM32_CRF_ITEM_CD ;
   private long[] T000K3_A70TBM32_STUDY_ID ;
   private short[] T000K3_A71TBM32_CRF_ID ;
   private String[] T000K3_A72TBM32_CRF_ITEM_CD ;
   private java.util.Date[] T000K3_A407TBM32_CRT_DATETIME ;
   private boolean[] T000K3_n407TBM32_CRT_DATETIME ;
   private String[] T000K3_A408TBM32_CRT_USER_ID ;
   private boolean[] T000K3_n408TBM32_CRT_USER_ID ;
   private java.util.Date[] T000K3_A410TBM32_UPD_DATETIME ;
   private boolean[] T000K3_n410TBM32_UPD_DATETIME ;
   private String[] T000K3_A411TBM32_UPD_USER_ID ;
   private boolean[] T000K3_n411TBM32_UPD_USER_ID ;
   private long[] T000K3_A413TBM32_UPD_CNT ;
   private boolean[] T000K3_n413TBM32_UPD_CNT ;
   private String[] T000K3_A405TBM32_CRF_ITEM_NM ;
   private boolean[] T000K3_n405TBM32_CRF_ITEM_NM ;
   private String[] T000K3_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] T000K3_n74TBM32_CRF_ITEM_DIV ;
   private String[] T000K3_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] T000K3_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] T000K3_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] T000K3_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] T000K3_A508TBM32_LOCATION_X ;
   private boolean[] T000K3_n508TBM32_LOCATION_X ;
   private short[] T000K3_A509TBM32_LOCATION_Y ;
   private boolean[] T000K3_n509TBM32_LOCATION_Y ;
   private short[] T000K3_A510TBM32_LOCATION_X2 ;
   private boolean[] T000K3_n510TBM32_LOCATION_X2 ;
   private short[] T000K3_A511TBM32_LOCATION_Y2 ;
   private boolean[] T000K3_n511TBM32_LOCATION_Y2 ;
   private String[] T000K3_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] T000K3_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] T000K3_A516TBM32_TEXT_MAXROWS ;
   private boolean[] T000K3_n516TBM32_TEXT_MAXROWS ;
   private short[] T000K3_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] T000K3_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] T000K3_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] T000K3_n518TBM32_DECIMAL_DIGITS ;
   private String[] T000K3_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] T000K3_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] T000K3_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] T000K3_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] T000K3_A527TBM32_FIXED_VALUE ;
   private boolean[] T000K3_n527TBM32_FIXED_VALUE ;
   private String[] T000K3_A525TBM32_LIST_CD ;
   private boolean[] T000K3_n525TBM32_LIST_CD ;
   private String[] T000K3_A526TBM32_IMAGE_CD ;
   private boolean[] T000K3_n526TBM32_IMAGE_CD ;
   private String[] T000K3_A524TBM32_TEXT ;
   private boolean[] T000K3_n524TBM32_TEXT ;
   private byte[] T000K3_A513TBM32_FONT_SIZE ;
   private boolean[] T000K3_n513TBM32_FONT_SIZE ;
   private String[] T000K3_A514TBM32_FONT_UL_FLG ;
   private boolean[] T000K3_n514TBM32_FONT_UL_FLG ;
   private long[] T000K3_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] T000K3_n515TBM32_FONT_COLOR_DIV ;
   private byte[] T000K3_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] T000K3_n521TBM32_LINE_SIZE_DIV ;
   private long[] T000K3_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] T000K3_n689TBM32_LINE_COLOR_DIV ;
   private String[] T000K3_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] T000K3_n519TBM32_LINE_START_POINT_DIV ;
   private String[] T000K3_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] T000K3_n520TBM32_LINE_END_POINT_DIV ;
   private short[] T000K3_A690TBM32_LINE_ANGLE ;
   private boolean[] T000K3_n690TBM32_LINE_ANGLE ;
   private byte[] T000K3_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] T000K3_n644TBM32_AUTH_LVL_MIN ;
   private short[] T000K3_A645TBM32_ZORDER ;
   private boolean[] T000K3_n645TBM32_ZORDER ;
   private short[] T000K3_A691TBM32_TAB_ORDER ;
   private boolean[] T000K3_n691TBM32_TAB_ORDER ;
   private String[] T000K3_A692TBM32_TABSTOP_FLG ;
   private boolean[] T000K3_n692TBM32_TABSTOP_FLG ;
   private String[] T000K3_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] T000K3_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] T000K3_A694TBM32_MIN_VALUE ;
   private boolean[] T000K3_n694TBM32_MIN_VALUE ;
   private String[] T000K3_A695TBM32_MAX_VALUE ;
   private boolean[] T000K3_n695TBM32_MAX_VALUE ;
   private String[] T000K3_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] T000K3_n406TBM32_CRF_ITEM_NOTE ;
   private short[] T000K3_A774TBM32_REF_CRF_ID ;
   private boolean[] T000K3_n774TBM32_REF_CRF_ID ;
   private String[] T000K3_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] T000K3_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] T000K3_A75TBM32_DEL_FLG ;
   private boolean[] T000K3_n75TBM32_DEL_FLG ;
   private String[] T000K3_A409TBM32_CRT_PROG_NM ;
   private boolean[] T000K3_n409TBM32_CRT_PROG_NM ;
   private String[] T000K3_A412TBM32_UPD_PROG_NM ;
   private boolean[] T000K3_n412TBM32_UPD_PROG_NM ;
   private long[] T000K6_A70TBM32_STUDY_ID ;
   private short[] T000K6_A71TBM32_CRF_ID ;
   private String[] T000K6_A72TBM32_CRF_ITEM_CD ;
   private long[] T000K7_A70TBM32_STUDY_ID ;
   private short[] T000K7_A71TBM32_CRF_ID ;
   private String[] T000K7_A72TBM32_CRF_ITEM_CD ;
   private long[] T000K2_A70TBM32_STUDY_ID ;
   private short[] T000K2_A71TBM32_CRF_ID ;
   private String[] T000K2_A72TBM32_CRF_ITEM_CD ;
   private java.util.Date[] T000K2_A407TBM32_CRT_DATETIME ;
   private boolean[] T000K2_n407TBM32_CRT_DATETIME ;
   private String[] T000K2_A408TBM32_CRT_USER_ID ;
   private boolean[] T000K2_n408TBM32_CRT_USER_ID ;
   private java.util.Date[] T000K2_A410TBM32_UPD_DATETIME ;
   private boolean[] T000K2_n410TBM32_UPD_DATETIME ;
   private String[] T000K2_A411TBM32_UPD_USER_ID ;
   private boolean[] T000K2_n411TBM32_UPD_USER_ID ;
   private long[] T000K2_A413TBM32_UPD_CNT ;
   private boolean[] T000K2_n413TBM32_UPD_CNT ;
   private String[] T000K2_A405TBM32_CRF_ITEM_NM ;
   private boolean[] T000K2_n405TBM32_CRF_ITEM_NM ;
   private String[] T000K2_A74TBM32_CRF_ITEM_DIV ;
   private boolean[] T000K2_n74TBM32_CRF_ITEM_DIV ;
   private String[] T000K2_A73TBM32_CRF_ITEM_GRP_CD ;
   private boolean[] T000K2_n73TBM32_CRF_ITEM_GRP_CD ;
   private short[] T000K2_A507TBM32_CRF_ITEM_GRP_ORDER ;
   private boolean[] T000K2_n507TBM32_CRF_ITEM_GRP_ORDER ;
   private short[] T000K2_A508TBM32_LOCATION_X ;
   private boolean[] T000K2_n508TBM32_LOCATION_X ;
   private short[] T000K2_A509TBM32_LOCATION_Y ;
   private boolean[] T000K2_n509TBM32_LOCATION_Y ;
   private short[] T000K2_A510TBM32_LOCATION_X2 ;
   private boolean[] T000K2_n510TBM32_LOCATION_X2 ;
   private short[] T000K2_A511TBM32_LOCATION_Y2 ;
   private boolean[] T000K2_n511TBM32_LOCATION_Y2 ;
   private String[] T000K2_A512TBM32_TEXT_ALIGN_DIV ;
   private boolean[] T000K2_n512TBM32_TEXT_ALIGN_DIV ;
   private byte[] T000K2_A516TBM32_TEXT_MAXROWS ;
   private boolean[] T000K2_n516TBM32_TEXT_MAXROWS ;
   private short[] T000K2_A517TBM32_TEXT_MAXLENGTH ;
   private boolean[] T000K2_n517TBM32_TEXT_MAXLENGTH ;
   private byte[] T000K2_A518TBM32_DECIMAL_DIGITS ;
   private boolean[] T000K2_n518TBM32_DECIMAL_DIGITS ;
   private String[] T000K2_A522TBM32_CHK_TRUE_INNER_VALUE ;
   private boolean[] T000K2_n522TBM32_CHK_TRUE_INNER_VALUE ;
   private String[] T000K2_A523TBM32_CHK_FALSE_INNER_VALUE ;
   private boolean[] T000K2_n523TBM32_CHK_FALSE_INNER_VALUE ;
   private String[] T000K2_A527TBM32_FIXED_VALUE ;
   private boolean[] T000K2_n527TBM32_FIXED_VALUE ;
   private String[] T000K2_A525TBM32_LIST_CD ;
   private boolean[] T000K2_n525TBM32_LIST_CD ;
   private String[] T000K2_A526TBM32_IMAGE_CD ;
   private boolean[] T000K2_n526TBM32_IMAGE_CD ;
   private String[] T000K2_A524TBM32_TEXT ;
   private boolean[] T000K2_n524TBM32_TEXT ;
   private byte[] T000K2_A513TBM32_FONT_SIZE ;
   private boolean[] T000K2_n513TBM32_FONT_SIZE ;
   private String[] T000K2_A514TBM32_FONT_UL_FLG ;
   private boolean[] T000K2_n514TBM32_FONT_UL_FLG ;
   private long[] T000K2_A515TBM32_FONT_COLOR_DIV ;
   private boolean[] T000K2_n515TBM32_FONT_COLOR_DIV ;
   private byte[] T000K2_A521TBM32_LINE_SIZE_DIV ;
   private boolean[] T000K2_n521TBM32_LINE_SIZE_DIV ;
   private long[] T000K2_A689TBM32_LINE_COLOR_DIV ;
   private boolean[] T000K2_n689TBM32_LINE_COLOR_DIV ;
   private String[] T000K2_A519TBM32_LINE_START_POINT_DIV ;
   private boolean[] T000K2_n519TBM32_LINE_START_POINT_DIV ;
   private String[] T000K2_A520TBM32_LINE_END_POINT_DIV ;
   private boolean[] T000K2_n520TBM32_LINE_END_POINT_DIV ;
   private short[] T000K2_A690TBM32_LINE_ANGLE ;
   private boolean[] T000K2_n690TBM32_LINE_ANGLE ;
   private byte[] T000K2_A644TBM32_AUTH_LVL_MIN ;
   private boolean[] T000K2_n644TBM32_AUTH_LVL_MIN ;
   private short[] T000K2_A645TBM32_ZORDER ;
   private boolean[] T000K2_n645TBM32_ZORDER ;
   private short[] T000K2_A691TBM32_TAB_ORDER ;
   private boolean[] T000K2_n691TBM32_TAB_ORDER ;
   private String[] T000K2_A692TBM32_TABSTOP_FLG ;
   private boolean[] T000K2_n692TBM32_TABSTOP_FLG ;
   private String[] T000K2_A693TBM32_REQUIRED_INPUT_FLG ;
   private boolean[] T000K2_n693TBM32_REQUIRED_INPUT_FLG ;
   private String[] T000K2_A694TBM32_MIN_VALUE ;
   private boolean[] T000K2_n694TBM32_MIN_VALUE ;
   private String[] T000K2_A695TBM32_MAX_VALUE ;
   private boolean[] T000K2_n695TBM32_MAX_VALUE ;
   private String[] T000K2_A406TBM32_CRF_ITEM_NOTE ;
   private boolean[] T000K2_n406TBM32_CRF_ITEM_NOTE ;
   private short[] T000K2_A774TBM32_REF_CRF_ID ;
   private boolean[] T000K2_n774TBM32_REF_CRF_ID ;
   private String[] T000K2_A775TBM32_REF_CRF_ITEM_CD ;
   private boolean[] T000K2_n775TBM32_REF_CRF_ITEM_CD ;
   private String[] T000K2_A75TBM32_DEL_FLG ;
   private boolean[] T000K2_n75TBM32_DEL_FLG ;
   private String[] T000K2_A409TBM32_CRT_PROG_NM ;
   private boolean[] T000K2_n409TBM32_CRT_PROG_NM ;
   private String[] T000K2_A412TBM32_UPD_PROG_NM ;
   private boolean[] T000K2_n412TBM32_UPD_PROG_NM ;
   private long[] T000K11_A70TBM32_STUDY_ID ;
   private short[] T000K11_A71TBM32_CRF_ID ;
   private String[] T000K11_A72TBM32_CRF_ITEM_CD ;
}

final  class tbm32_crf_item__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000K2", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000K3", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000K4", "SELECT TM1.`TBM32_STUDY_ID`, TM1.`TBM32_CRF_ID`, TM1.`TBM32_CRF_ITEM_CD`, TM1.`TBM32_CRT_DATETIME`, TM1.`TBM32_CRT_USER_ID`, TM1.`TBM32_UPD_DATETIME`, TM1.`TBM32_UPD_USER_ID`, TM1.`TBM32_UPD_CNT`, TM1.`TBM32_CRF_ITEM_NM`, TM1.`TBM32_CRF_ITEM_DIV`, TM1.`TBM32_CRF_ITEM_GRP_CD`, TM1.`TBM32_CRF_ITEM_GRP_ORDER`, TM1.`TBM32_LOCATION_X`, TM1.`TBM32_LOCATION_Y`, TM1.`TBM32_LOCATION_X2`, TM1.`TBM32_LOCATION_Y2`, TM1.`TBM32_TEXT_ALIGN_DIV`, TM1.`TBM32_TEXT_MAXROWS`, TM1.`TBM32_TEXT_MAXLENGTH`, TM1.`TBM32_DECIMAL_DIGITS`, TM1.`TBM32_CHK_TRUE_INNER_VALUE`, TM1.`TBM32_CHK_FALSE_INNER_VALUE`, TM1.`TBM32_FIXED_VALUE`, TM1.`TBM32_LIST_CD`, TM1.`TBM32_IMAGE_CD`, TM1.`TBM32_TEXT`, TM1.`TBM32_FONT_SIZE`, TM1.`TBM32_FONT_UL_FLG`, TM1.`TBM32_FONT_COLOR_DIV`, TM1.`TBM32_LINE_SIZE_DIV`, TM1.`TBM32_LINE_COLOR_DIV`, TM1.`TBM32_LINE_START_POINT_DIV`, TM1.`TBM32_LINE_END_POINT_DIV`, TM1.`TBM32_LINE_ANGLE`, TM1.`TBM32_AUTH_LVL_MIN`, TM1.`TBM32_ZORDER`, TM1.`TBM32_TAB_ORDER`, TM1.`TBM32_TABSTOP_FLG`, TM1.`TBM32_REQUIRED_INPUT_FLG`, TM1.`TBM32_MIN_VALUE`, TM1.`TBM32_MAX_VALUE`, TM1.`TBM32_CRF_ITEM_NOTE`, TM1.`TBM32_REF_CRF_ID`, TM1.`TBM32_REF_CRF_ITEM_CD`, TM1.`TBM32_DEL_FLG`, TM1.`TBM32_CRT_PROG_NM`, TM1.`TBM32_UPD_PROG_NM` FROM `TBM32_CRF_ITEM` TM1 WHERE TM1.`TBM32_STUDY_ID` = ? and TM1.`TBM32_CRF_ID` = ? and TM1.`TBM32_CRF_ITEM_CD` = ? ORDER BY TM1.`TBM32_STUDY_ID`, TM1.`TBM32_CRF_ID`, TM1.`TBM32_CRF_ITEM_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000K5", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000K6", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE ( `TBM32_STUDY_ID` > ? or `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` > ? or `TBM32_CRF_ID` = ? and `TBM32_STUDY_ID` = ? and `TBM32_CRF_ITEM_CD` > ?) ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000K7", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` WHERE ( `TBM32_STUDY_ID` < ? or `TBM32_STUDY_ID` = ? and `TBM32_CRF_ID` < ? or `TBM32_CRF_ID` = ? and `TBM32_STUDY_ID` = ? and `TBM32_CRF_ITEM_CD` < ?) ORDER BY `TBM32_STUDY_ID` DESC, `TBM32_CRF_ID` DESC, `TBM32_CRF_ITEM_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000K8", "INSERT INTO `TBM32_CRF_ITEM`(`TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD`, `TBM32_CRT_DATETIME`, `TBM32_CRT_USER_ID`, `TBM32_UPD_DATETIME`, `TBM32_UPD_USER_ID`, `TBM32_UPD_CNT`, `TBM32_CRF_ITEM_NM`, `TBM32_CRF_ITEM_DIV`, `TBM32_CRF_ITEM_GRP_CD`, `TBM32_CRF_ITEM_GRP_ORDER`, `TBM32_LOCATION_X`, `TBM32_LOCATION_Y`, `TBM32_LOCATION_X2`, `TBM32_LOCATION_Y2`, `TBM32_TEXT_ALIGN_DIV`, `TBM32_TEXT_MAXROWS`, `TBM32_TEXT_MAXLENGTH`, `TBM32_DECIMAL_DIGITS`, `TBM32_CHK_TRUE_INNER_VALUE`, `TBM32_CHK_FALSE_INNER_VALUE`, `TBM32_FIXED_VALUE`, `TBM32_LIST_CD`, `TBM32_IMAGE_CD`, `TBM32_TEXT`, `TBM32_FONT_SIZE`, `TBM32_FONT_UL_FLG`, `TBM32_FONT_COLOR_DIV`, `TBM32_LINE_SIZE_DIV`, `TBM32_LINE_COLOR_DIV`, `TBM32_LINE_START_POINT_DIV`, `TBM32_LINE_END_POINT_DIV`, `TBM32_LINE_ANGLE`, `TBM32_AUTH_LVL_MIN`, `TBM32_ZORDER`, `TBM32_TAB_ORDER`, `TBM32_TABSTOP_FLG`, `TBM32_REQUIRED_INPUT_FLG`, `TBM32_MIN_VALUE`, `TBM32_MAX_VALUE`, `TBM32_CRF_ITEM_NOTE`, `TBM32_REF_CRF_ID`, `TBM32_REF_CRF_ITEM_CD`, `TBM32_DEL_FLG`, `TBM32_CRT_PROG_NM`, `TBM32_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000K9", "UPDATE `TBM32_CRF_ITEM` SET `TBM32_CRT_DATETIME`=?, `TBM32_CRT_USER_ID`=?, `TBM32_UPD_DATETIME`=?, `TBM32_UPD_USER_ID`=?, `TBM32_UPD_CNT`=?, `TBM32_CRF_ITEM_NM`=?, `TBM32_CRF_ITEM_DIV`=?, `TBM32_CRF_ITEM_GRP_CD`=?, `TBM32_CRF_ITEM_GRP_ORDER`=?, `TBM32_LOCATION_X`=?, `TBM32_LOCATION_Y`=?, `TBM32_LOCATION_X2`=?, `TBM32_LOCATION_Y2`=?, `TBM32_TEXT_ALIGN_DIV`=?, `TBM32_TEXT_MAXROWS`=?, `TBM32_TEXT_MAXLENGTH`=?, `TBM32_DECIMAL_DIGITS`=?, `TBM32_CHK_TRUE_INNER_VALUE`=?, `TBM32_CHK_FALSE_INNER_VALUE`=?, `TBM32_FIXED_VALUE`=?, `TBM32_LIST_CD`=?, `TBM32_IMAGE_CD`=?, `TBM32_TEXT`=?, `TBM32_FONT_SIZE`=?, `TBM32_FONT_UL_FLG`=?, `TBM32_FONT_COLOR_DIV`=?, `TBM32_LINE_SIZE_DIV`=?, `TBM32_LINE_COLOR_DIV`=?, `TBM32_LINE_START_POINT_DIV`=?, `TBM32_LINE_END_POINT_DIV`=?, `TBM32_LINE_ANGLE`=?, `TBM32_AUTH_LVL_MIN`=?, `TBM32_ZORDER`=?, `TBM32_TAB_ORDER`=?, `TBM32_TABSTOP_FLG`=?, `TBM32_REQUIRED_INPUT_FLG`=?, `TBM32_MIN_VALUE`=?, `TBM32_MAX_VALUE`=?, `TBM32_CRF_ITEM_NOTE`=?, `TBM32_REF_CRF_ID`=?, `TBM32_REF_CRF_ITEM_CD`=?, `TBM32_DEL_FLG`=?, `TBM32_CRT_PROG_NM`=?, `TBM32_UPD_PROG_NM`=?  WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000K10", "DELETE FROM `TBM32_CRF_ITEM`  WHERE `TBM32_STUDY_ID` = ? AND `TBM32_CRF_ID` = ? AND `TBM32_CRF_ITEM_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000K11", "SELECT `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` FROM `TBM32_CRF_ITEM` ORDER BY `TBM32_STUDY_ID`, `TBM32_CRF_ID`, `TBM32_CRF_ITEM_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(35) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(36) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(37) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(38) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
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
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(35) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(36) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(37) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(38) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
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
               ((short[]) buf[19])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((short[]) buf[21])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((short[]) buf[27])[0] = rslt.getShort(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((byte[]) buf[31])[0] = rslt.getByte(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((short[]) buf[33])[0] = rslt.getShort(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((byte[]) buf[35])[0] = rslt.getByte(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((String[]) buf[43])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((byte[]) buf[49])[0] = rslt.getByte(27) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((long[]) buf[53])[0] = rslt.getLong(29) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((byte[]) buf[55])[0] = rslt.getByte(30) ;
               ((boolean[]) buf[56])[0] = rslt.wasNull();
               ((long[]) buf[57])[0] = rslt.getLong(31) ;
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((String[]) buf[61])[0] = rslt.getVarchar(33) ;
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((short[]) buf[63])[0] = rslt.getShort(34) ;
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((byte[]) buf[65])[0] = rslt.getByte(35) ;
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((short[]) buf[67])[0] = rslt.getShort(36) ;
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((short[]) buf[69])[0] = rslt.getShort(37) ;
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getVarchar(38) ;
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((String[]) buf[73])[0] = rslt.getVarchar(39) ;
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((String[]) buf[75])[0] = rslt.getVarchar(40) ;
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               ((String[]) buf[77])[0] = rslt.getVarchar(41) ;
               ((boolean[]) buf[78])[0] = rslt.wasNull();
               ((String[]) buf[79])[0] = rslt.getVarchar(42) ;
               ((boolean[]) buf[80])[0] = rslt.wasNull();
               ((short[]) buf[81])[0] = rslt.getShort(43) ;
               ((boolean[]) buf[82])[0] = rslt.wasNull();
               ((String[]) buf[83])[0] = rslt.getVarchar(44) ;
               ((boolean[]) buf[84])[0] = rslt.wasNull();
               ((String[]) buf[85])[0] = rslt.getVarchar(45) ;
               ((boolean[]) buf[86])[0] = rslt.wasNull();
               ((String[]) buf[87])[0] = rslt.getVarchar(46) ;
               ((boolean[]) buf[88])[0] = rslt.wasNull();
               ((String[]) buf[89])[0] = rslt.getVarchar(47) ;
               ((boolean[]) buf[90])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
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
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
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
                  stmt.setVarchar(9, (String)parms[14], 200);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 20);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 50);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[20]).shortValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[22]).shortValue());
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
                  stmt.setShort(15, ((Number) parms[26]).shortValue());
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[28]).shortValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 6);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(18, ((Number) parms[32]).byteValue());
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(19, ((Number) parms[34]).shortValue());
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(20, ((Number) parms[36]).byteValue());
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 100);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[40], 100);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[42], 100);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[44], 20);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[46], 50);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[48], 200);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[50]).byteValue());
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[52], 1);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(29, ((Number) parms[54]).longValue());
               }
               if ( ((Boolean) parms[55]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(30, ((Number) parms[56]).byteValue());
               }
               if ( ((Boolean) parms[57]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(31, ((Number) parms[58]).longValue());
               }
               if ( ((Boolean) parms[59]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[60], 2);
               }
               if ( ((Boolean) parms[61]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(33, (String)parms[62], 2);
               }
               if ( ((Boolean) parms[63]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[64]).shortValue());
               }
               if ( ((Boolean) parms[65]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(35, ((Number) parms[66]).byteValue());
               }
               if ( ((Boolean) parms[67]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(36, ((Number) parms[68]).shortValue());
               }
               if ( ((Boolean) parms[69]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(37, ((Number) parms[70]).shortValue());
               }
               if ( ((Boolean) parms[71]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[72], 1);
               }
               if ( ((Boolean) parms[73]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[74], 1);
               }
               if ( ((Boolean) parms[75]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(40, (String)parms[76], 10);
               }
               if ( ((Boolean) parms[77]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[78], 10);
               }
               if ( ((Boolean) parms[79]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[80], 1000);
               }
               if ( ((Boolean) parms[81]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(43, ((Number) parms[82]).shortValue());
               }
               if ( ((Boolean) parms[83]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[84], 50);
               }
               if ( ((Boolean) parms[85]).booleanValue() )
               {
                  stmt.setNull( 45 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(45, (String)parms[86], 1);
               }
               if ( ((Boolean) parms[87]).booleanValue() )
               {
                  stmt.setNull( 46 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(46, (String)parms[88], 40);
               }
               if ( ((Boolean) parms[89]).booleanValue() )
               {
                  stmt.setNull( 47 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(47, (String)parms[90], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 200);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 20);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[17]).shortValue());
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
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 6);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(16, ((Number) parms[31]).shortValue());
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(17, ((Number) parms[33]).byteValue());
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 100);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 100);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 100);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 20);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 50);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 200);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(24, ((Number) parms[47]).byteValue());
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(26, ((Number) parms[51]).longValue());
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(27, ((Number) parms[53]).byteValue());
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(28, ((Number) parms[55]).longValue());
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[57], 2);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[59], 2);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(31, ((Number) parms[61]).shortValue());
               }
               if ( ((Boolean) parms[62]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(32, ((Number) parms[63]).byteValue());
               }
               if ( ((Boolean) parms[64]).booleanValue() )
               {
                  stmt.setNull( 33 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(33, ((Number) parms[65]).shortValue());
               }
               if ( ((Boolean) parms[66]).booleanValue() )
               {
                  stmt.setNull( 34 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(34, ((Number) parms[67]).shortValue());
               }
               if ( ((Boolean) parms[68]).booleanValue() )
               {
                  stmt.setNull( 35 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(35, (String)parms[69], 1);
               }
               if ( ((Boolean) parms[70]).booleanValue() )
               {
                  stmt.setNull( 36 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(36, (String)parms[71], 1);
               }
               if ( ((Boolean) parms[72]).booleanValue() )
               {
                  stmt.setNull( 37 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(37, (String)parms[73], 10);
               }
               if ( ((Boolean) parms[74]).booleanValue() )
               {
                  stmt.setNull( 38 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(38, (String)parms[75], 10);
               }
               if ( ((Boolean) parms[76]).booleanValue() )
               {
                  stmt.setNull( 39 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(39, (String)parms[77], 1000);
               }
               if ( ((Boolean) parms[78]).booleanValue() )
               {
                  stmt.setNull( 40 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(40, ((Number) parms[79]).shortValue());
               }
               if ( ((Boolean) parms[80]).booleanValue() )
               {
                  stmt.setNull( 41 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(41, (String)parms[81], 50);
               }
               if ( ((Boolean) parms[82]).booleanValue() )
               {
                  stmt.setNull( 42 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(42, (String)parms[83], 1);
               }
               if ( ((Boolean) parms[84]).booleanValue() )
               {
                  stmt.setNull( 43 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(43, (String)parms[85], 40);
               }
               if ( ((Boolean) parms[86]).booleanValue() )
               {
                  stmt.setNull( 44 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(44, (String)parms[87], 40);
               }
               stmt.setLong(45, ((Number) parms[88]).longValue());
               stmt.setShort(46, ((Number) parms[89]).shortValue());
               stmt.setVarchar(47, (String)parms[90], 50, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               return;
      }
   }

}

