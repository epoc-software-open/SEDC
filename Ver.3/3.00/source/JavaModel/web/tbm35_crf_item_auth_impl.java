/*
               File: tbm35_crf_item_auth_impl
        Description: CRF項目権限マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:20:45.73
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm35_crf_item_auth_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM35_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm35_crt_user_id1035( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM35_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm35_upd_user_id1035( Gx_mode) ;
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
         Form.getMeta().addItem("description", "CRF項目権限マスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm35_crf_item_auth_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm35_crf_item_auth_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm35_crf_item_auth_impl.class ));
   }

   public tbm35_crf_item_auth_impl( int remoteHandle ,
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
         wb_table1_2_1035( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1035e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1035( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1035( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1035( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1035e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRF項目権限マスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         wb_table3_28_1035( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1035e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1035e( true) ;
      }
      else
      {
         wb_table1_2_1035e( false) ;
      }
   }

   public void wb_table3_28_1035( boolean wbgen )
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
         wb_table4_34_1035( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1035e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1035e( true) ;
      }
      else
      {
         wb_table3_28_1035e( false) ;
      }
   }

   public void wb_table4_34_1035( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_study_id_Internalname, "試験ID", "", "", lblTextblocktbm35_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A31TBM35_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM35_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A31TBM35_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A31TBM35_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_crf_id_Internalname, "CRFID", "", "", lblTextblocktbm35_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A32TBM35_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBM35_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A32TBM35_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A32TBM35_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_crf_item_cd_Internalname, "CRF項目コード", "", "", lblTextblocktbm35_crf_item_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_CRF_ITEM_CD_Internalname, GXutil.rtrim( A33TBM35_CRF_ITEM_CD), GXutil.rtrim( localUtil.format( A33TBM35_CRF_ITEM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_CRF_ITEM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_CRF_ITEM_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_CD", "left", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_study_auth_cd_Internalname, "試験内権限コード", "", "", lblTextblocktbm35_study_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_STUDY_AUTH_CD_Internalname, GXutil.rtrim( A34TBM35_STUDY_AUTH_CD), GXutil.rtrim( localUtil.format( A34TBM35_STUDY_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_STUDY_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_STUDY_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_display_flg_Internalname, "表示フラグ", "", "", lblTextblocktbm35_display_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_DISPLAY_FLG_Internalname, GXutil.rtrim( A580TBM35_DISPLAY_FLG), GXutil.rtrim( localUtil.format( A580TBM35_DISPLAY_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_DISPLAY_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_DISPLAY_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm35_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_DEL_FLG_Internalname, GXutil.rtrim( A581TBM35_DEL_FLG), GXutil.rtrim( localUtil.format( A581TBM35_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm35_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM35_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_CRT_DATETIME_Internalname, localUtil.format(A582TBM35_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A582TBM35_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM35_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM35_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm35_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_CRT_USER_ID_Internalname, GXutil.rtrim( A583TBM35_CRT_USER_ID), GXutil.rtrim( localUtil.format( A583TBM35_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm35_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_CRT_PROG_NM_Internalname, GXutil.rtrim( A584TBM35_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A584TBM35_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm35_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM35_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_UPD_DATETIME_Internalname, localUtil.format(A585TBM35_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A585TBM35_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM35_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM35_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm35_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_UPD_USER_ID_Internalname, GXutil.rtrim( A586TBM35_UPD_USER_ID), GXutil.rtrim( localUtil.format( A586TBM35_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm35_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_UPD_PROG_NM_Internalname, GXutil.rtrim( A587TBM35_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A587TBM35_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm35_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm35_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM35_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A588TBM35_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM35_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A588TBM35_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A588TBM35_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM35_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM35_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM35_CRF_ITEM_AUTH.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1035e( true) ;
      }
      else
      {
         wb_table4_34_1035e( false) ;
      }
   }

   public void wb_table2_5_1035( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM35_CRF_ITEM_AUTH.htm");
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
         wb_table2_5_1035e( true) ;
      }
      else
      {
         wb_table2_5_1035e( false) ;
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
      /* Execute user event: e11102 */
      e11102 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM35_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM35_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM35_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A31TBM35_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
            }
            else
            {
               A31TBM35_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM35_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM35_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM35_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM35_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM35_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A32TBM35_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
            }
            else
            {
               A32TBM35_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM35_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
            }
            A33TBM35_CRF_ITEM_CD = httpContext.cgiGet( edtTBM35_CRF_ITEM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A33TBM35_CRF_ITEM_CD", A33TBM35_CRF_ITEM_CD);
            A34TBM35_STUDY_AUTH_CD = httpContext.cgiGet( edtTBM35_STUDY_AUTH_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A34TBM35_STUDY_AUTH_CD", A34TBM35_STUDY_AUTH_CD);
            A580TBM35_DISPLAY_FLG = httpContext.cgiGet( edtTBM35_DISPLAY_FLG_Internalname) ;
            n580TBM35_DISPLAY_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A580TBM35_DISPLAY_FLG", A580TBM35_DISPLAY_FLG);
            n580TBM35_DISPLAY_FLG = ((GXutil.strcmp("", A580TBM35_DISPLAY_FLG)==0) ? true : false) ;
            A581TBM35_DEL_FLG = httpContext.cgiGet( edtTBM35_DEL_FLG_Internalname) ;
            n581TBM35_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A581TBM35_DEL_FLG", A581TBM35_DEL_FLG);
            n581TBM35_DEL_FLG = ((GXutil.strcmp("", A581TBM35_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM35_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM35_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM35_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A582TBM35_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n582TBM35_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A582TBM35_CRT_DATETIME", localUtil.ttoc( A582TBM35_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A582TBM35_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM35_CRT_DATETIME_Internalname)) ;
               n582TBM35_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A582TBM35_CRT_DATETIME", localUtil.ttoc( A582TBM35_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n582TBM35_CRT_DATETIME = (GXutil.nullDate().equals(A582TBM35_CRT_DATETIME) ? true : false) ;
            A583TBM35_CRT_USER_ID = httpContext.cgiGet( edtTBM35_CRT_USER_ID_Internalname) ;
            n583TBM35_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A583TBM35_CRT_USER_ID", A583TBM35_CRT_USER_ID);
            n583TBM35_CRT_USER_ID = ((GXutil.strcmp("", A583TBM35_CRT_USER_ID)==0) ? true : false) ;
            A584TBM35_CRT_PROG_NM = httpContext.cgiGet( edtTBM35_CRT_PROG_NM_Internalname) ;
            n584TBM35_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A584TBM35_CRT_PROG_NM", A584TBM35_CRT_PROG_NM);
            n584TBM35_CRT_PROG_NM = ((GXutil.strcmp("", A584TBM35_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM35_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM35_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM35_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A585TBM35_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n585TBM35_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A585TBM35_UPD_DATETIME", localUtil.ttoc( A585TBM35_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A585TBM35_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM35_UPD_DATETIME_Internalname)) ;
               n585TBM35_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A585TBM35_UPD_DATETIME", localUtil.ttoc( A585TBM35_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n585TBM35_UPD_DATETIME = (GXutil.nullDate().equals(A585TBM35_UPD_DATETIME) ? true : false) ;
            A586TBM35_UPD_USER_ID = httpContext.cgiGet( edtTBM35_UPD_USER_ID_Internalname) ;
            n586TBM35_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A586TBM35_UPD_USER_ID", A586TBM35_UPD_USER_ID);
            n586TBM35_UPD_USER_ID = ((GXutil.strcmp("", A586TBM35_UPD_USER_ID)==0) ? true : false) ;
            A587TBM35_UPD_PROG_NM = httpContext.cgiGet( edtTBM35_UPD_PROG_NM_Internalname) ;
            n587TBM35_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A587TBM35_UPD_PROG_NM", A587TBM35_UPD_PROG_NM);
            n587TBM35_UPD_PROG_NM = ((GXutil.strcmp("", A587TBM35_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM35_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM35_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM35_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM35_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A588TBM35_UPD_CNT = 0 ;
               n588TBM35_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A588TBM35_UPD_CNT", GXutil.ltrim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)));
            }
            else
            {
               A588TBM35_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM35_UPD_CNT_Internalname), ".", ",") ;
               n588TBM35_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A588TBM35_UPD_CNT", GXutil.ltrim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)));
            }
            n588TBM35_UPD_CNT = ((0==A588TBM35_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z31TBM35_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z31TBM35_STUDY_ID"), ".", ",") ;
            Z32TBM35_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z32TBM35_CRF_ID"), ".", ",")) ;
            Z33TBM35_CRF_ITEM_CD = httpContext.cgiGet( "Z33TBM35_CRF_ITEM_CD") ;
            Z34TBM35_STUDY_AUTH_CD = httpContext.cgiGet( "Z34TBM35_STUDY_AUTH_CD") ;
            Z582TBM35_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z582TBM35_CRT_DATETIME"), 0) ;
            n582TBM35_CRT_DATETIME = (GXutil.nullDate().equals(A582TBM35_CRT_DATETIME) ? true : false) ;
            Z583TBM35_CRT_USER_ID = httpContext.cgiGet( "Z583TBM35_CRT_USER_ID") ;
            n583TBM35_CRT_USER_ID = ((GXutil.strcmp("", A583TBM35_CRT_USER_ID)==0) ? true : false) ;
            Z585TBM35_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z585TBM35_UPD_DATETIME"), 0) ;
            n585TBM35_UPD_DATETIME = (GXutil.nullDate().equals(A585TBM35_UPD_DATETIME) ? true : false) ;
            Z586TBM35_UPD_USER_ID = httpContext.cgiGet( "Z586TBM35_UPD_USER_ID") ;
            n586TBM35_UPD_USER_ID = ((GXutil.strcmp("", A586TBM35_UPD_USER_ID)==0) ? true : false) ;
            Z588TBM35_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z588TBM35_UPD_CNT"), ".", ",") ;
            n588TBM35_UPD_CNT = ((0==A588TBM35_UPD_CNT) ? true : false) ;
            Z580TBM35_DISPLAY_FLG = httpContext.cgiGet( "Z580TBM35_DISPLAY_FLG") ;
            n580TBM35_DISPLAY_FLG = ((GXutil.strcmp("", A580TBM35_DISPLAY_FLG)==0) ? true : false) ;
            Z581TBM35_DEL_FLG = httpContext.cgiGet( "Z581TBM35_DEL_FLG") ;
            n581TBM35_DEL_FLG = ((GXutil.strcmp("", A581TBM35_DEL_FLG)==0) ? true : false) ;
            Z584TBM35_CRT_PROG_NM = httpContext.cgiGet( "Z584TBM35_CRT_PROG_NM") ;
            n584TBM35_CRT_PROG_NM = ((GXutil.strcmp("", A584TBM35_CRT_PROG_NM)==0) ? true : false) ;
            Z587TBM35_UPD_PROG_NM = httpContext.cgiGet( "Z587TBM35_UPD_PROG_NM") ;
            n587TBM35_UPD_PROG_NM = ((GXutil.strcmp("", A587TBM35_UPD_PROG_NM)==0) ? true : false) ;
            O588TBM35_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O588TBM35_UPD_CNT"), ".", ",") ;
            n588TBM35_UPD_CNT = ((0==A588TBM35_UPD_CNT) ? true : false) ;
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
               A31TBM35_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
               A32TBM35_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
               A33TBM35_CRF_ITEM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A33TBM35_CRF_ITEM_CD", A33TBM35_CRF_ITEM_CD);
               A34TBM35_STUDY_AUTH_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A34TBM35_STUDY_AUTH_CD", A34TBM35_STUDY_AUTH_CD);
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
                     /* Execute user event: e11102 */
                     e11102 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12102 */
                     e12102 ();
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
         /* Execute user event: e12102 */
         e12102 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1035( ) ;
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
      disableAttributes1035( ) ;
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

   public void resetCaption100( )
   {
   }

   public void e11102( )
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

   public void e12102( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A32TBM35_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A33TBM35_CRF_ITEM_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A34TBM35_STUDY_AUTH_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A580TBM35_DISPLAY_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A581TBM35_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A582TBM35_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm35_crf_item_auth_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A582TBM35_CRT_DATETIME", localUtil.ttoc( A582TBM35_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A583TBM35_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A584TBM35_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A585TBM35_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm35_crf_item_auth_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A585TBM35_UPD_DATETIME", localUtil.ttoc( A585TBM35_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A586TBM35_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A587TBM35_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm1035( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z582TBM35_CRT_DATETIME = T00103_A582TBM35_CRT_DATETIME[0] ;
            Z583TBM35_CRT_USER_ID = T00103_A583TBM35_CRT_USER_ID[0] ;
            Z585TBM35_UPD_DATETIME = T00103_A585TBM35_UPD_DATETIME[0] ;
            Z586TBM35_UPD_USER_ID = T00103_A586TBM35_UPD_USER_ID[0] ;
            Z588TBM35_UPD_CNT = T00103_A588TBM35_UPD_CNT[0] ;
            Z580TBM35_DISPLAY_FLG = T00103_A580TBM35_DISPLAY_FLG[0] ;
            Z581TBM35_DEL_FLG = T00103_A581TBM35_DEL_FLG[0] ;
            Z584TBM35_CRT_PROG_NM = T00103_A584TBM35_CRT_PROG_NM[0] ;
            Z587TBM35_UPD_PROG_NM = T00103_A587TBM35_UPD_PROG_NM[0] ;
         }
         else
         {
            Z582TBM35_CRT_DATETIME = A582TBM35_CRT_DATETIME ;
            Z583TBM35_CRT_USER_ID = A583TBM35_CRT_USER_ID ;
            Z585TBM35_UPD_DATETIME = A585TBM35_UPD_DATETIME ;
            Z586TBM35_UPD_USER_ID = A586TBM35_UPD_USER_ID ;
            Z588TBM35_UPD_CNT = A588TBM35_UPD_CNT ;
            Z580TBM35_DISPLAY_FLG = A580TBM35_DISPLAY_FLG ;
            Z581TBM35_DEL_FLG = A581TBM35_DEL_FLG ;
            Z584TBM35_CRT_PROG_NM = A584TBM35_CRT_PROG_NM ;
            Z587TBM35_UPD_PROG_NM = A587TBM35_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z31TBM35_STUDY_ID = A31TBM35_STUDY_ID ;
         Z32TBM35_CRF_ID = A32TBM35_CRF_ID ;
         Z33TBM35_CRF_ITEM_CD = A33TBM35_CRF_ITEM_CD ;
         Z34TBM35_STUDY_AUTH_CD = A34TBM35_STUDY_AUTH_CD ;
         Z582TBM35_CRT_DATETIME = A582TBM35_CRT_DATETIME ;
         Z583TBM35_CRT_USER_ID = A583TBM35_CRT_USER_ID ;
         Z585TBM35_UPD_DATETIME = A585TBM35_UPD_DATETIME ;
         Z586TBM35_UPD_USER_ID = A586TBM35_UPD_USER_ID ;
         Z588TBM35_UPD_CNT = A588TBM35_UPD_CNT ;
         Z580TBM35_DISPLAY_FLG = A580TBM35_DISPLAY_FLG ;
         Z581TBM35_DEL_FLG = A581TBM35_DEL_FLG ;
         Z584TBM35_CRT_PROG_NM = A584TBM35_CRT_PROG_NM ;
         Z587TBM35_UPD_PROG_NM = A587TBM35_UPD_PROG_NM ;
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

   public void load1035( )
   {
      /* Using cursor T00104 */
      pr_default.execute(2, new Object[] {new Long(A31TBM35_STUDY_ID), new Short(A32TBM35_CRF_ID), A33TBM35_CRF_ITEM_CD, A34TBM35_STUDY_AUTH_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A582TBM35_CRT_DATETIME = T00104_A582TBM35_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A582TBM35_CRT_DATETIME", localUtil.ttoc( A582TBM35_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n582TBM35_CRT_DATETIME = T00104_n582TBM35_CRT_DATETIME[0] ;
         A583TBM35_CRT_USER_ID = T00104_A583TBM35_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583TBM35_CRT_USER_ID", A583TBM35_CRT_USER_ID);
         n583TBM35_CRT_USER_ID = T00104_n583TBM35_CRT_USER_ID[0] ;
         A585TBM35_UPD_DATETIME = T00104_A585TBM35_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A585TBM35_UPD_DATETIME", localUtil.ttoc( A585TBM35_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n585TBM35_UPD_DATETIME = T00104_n585TBM35_UPD_DATETIME[0] ;
         A586TBM35_UPD_USER_ID = T00104_A586TBM35_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A586TBM35_UPD_USER_ID", A586TBM35_UPD_USER_ID);
         n586TBM35_UPD_USER_ID = T00104_n586TBM35_UPD_USER_ID[0] ;
         A588TBM35_UPD_CNT = T00104_A588TBM35_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A588TBM35_UPD_CNT", GXutil.ltrim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)));
         n588TBM35_UPD_CNT = T00104_n588TBM35_UPD_CNT[0] ;
         A580TBM35_DISPLAY_FLG = T00104_A580TBM35_DISPLAY_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A580TBM35_DISPLAY_FLG", A580TBM35_DISPLAY_FLG);
         n580TBM35_DISPLAY_FLG = T00104_n580TBM35_DISPLAY_FLG[0] ;
         A581TBM35_DEL_FLG = T00104_A581TBM35_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A581TBM35_DEL_FLG", A581TBM35_DEL_FLG);
         n581TBM35_DEL_FLG = T00104_n581TBM35_DEL_FLG[0] ;
         A584TBM35_CRT_PROG_NM = T00104_A584TBM35_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584TBM35_CRT_PROG_NM", A584TBM35_CRT_PROG_NM);
         n584TBM35_CRT_PROG_NM = T00104_n584TBM35_CRT_PROG_NM[0] ;
         A587TBM35_UPD_PROG_NM = T00104_A587TBM35_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A587TBM35_UPD_PROG_NM", A587TBM35_UPD_PROG_NM);
         n587TBM35_UPD_PROG_NM = T00104_n587TBM35_UPD_PROG_NM[0] ;
         zm1035( -8) ;
      }
      pr_default.close(2);
      onLoadActions1035( ) ;
   }

   public void onLoadActions1035( )
   {
      AV9Pgmname = "TBM35_CRF_ITEM_AUTH" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable1035( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM35_CRF_ITEM_AUTH" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A582TBM35_CRT_DATETIME) || (( A582TBM35_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A582TBM35_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM35_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM35_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A585TBM35_UPD_DATETIME) || (( A585TBM35_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A585TBM35_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM35_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM35_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1035( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1035( )
   {
      /* Using cursor T00105 */
      pr_default.execute(3, new Object[] {new Long(A31TBM35_STUDY_ID), new Short(A32TBM35_CRF_ID), A33TBM35_CRF_ITEM_CD, A34TBM35_STUDY_AUTH_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound35 = (short)(1) ;
      }
      else
      {
         RcdFound35 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00103 */
      pr_default.execute(1, new Object[] {new Long(A31TBM35_STUDY_ID), new Short(A32TBM35_CRF_ID), A33TBM35_CRF_ITEM_CD, A34TBM35_STUDY_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1035( 8) ;
         RcdFound35 = (short)(1) ;
         A31TBM35_STUDY_ID = T00103_A31TBM35_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
         A32TBM35_CRF_ID = T00103_A32TBM35_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
         A33TBM35_CRF_ITEM_CD = T00103_A33TBM35_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33TBM35_CRF_ITEM_CD", A33TBM35_CRF_ITEM_CD);
         A34TBM35_STUDY_AUTH_CD = T00103_A34TBM35_STUDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34TBM35_STUDY_AUTH_CD", A34TBM35_STUDY_AUTH_CD);
         A582TBM35_CRT_DATETIME = T00103_A582TBM35_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A582TBM35_CRT_DATETIME", localUtil.ttoc( A582TBM35_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n582TBM35_CRT_DATETIME = T00103_n582TBM35_CRT_DATETIME[0] ;
         A583TBM35_CRT_USER_ID = T00103_A583TBM35_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583TBM35_CRT_USER_ID", A583TBM35_CRT_USER_ID);
         n583TBM35_CRT_USER_ID = T00103_n583TBM35_CRT_USER_ID[0] ;
         A585TBM35_UPD_DATETIME = T00103_A585TBM35_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A585TBM35_UPD_DATETIME", localUtil.ttoc( A585TBM35_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n585TBM35_UPD_DATETIME = T00103_n585TBM35_UPD_DATETIME[0] ;
         A586TBM35_UPD_USER_ID = T00103_A586TBM35_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A586TBM35_UPD_USER_ID", A586TBM35_UPD_USER_ID);
         n586TBM35_UPD_USER_ID = T00103_n586TBM35_UPD_USER_ID[0] ;
         A588TBM35_UPD_CNT = T00103_A588TBM35_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A588TBM35_UPD_CNT", GXutil.ltrim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)));
         n588TBM35_UPD_CNT = T00103_n588TBM35_UPD_CNT[0] ;
         A580TBM35_DISPLAY_FLG = T00103_A580TBM35_DISPLAY_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A580TBM35_DISPLAY_FLG", A580TBM35_DISPLAY_FLG);
         n580TBM35_DISPLAY_FLG = T00103_n580TBM35_DISPLAY_FLG[0] ;
         A581TBM35_DEL_FLG = T00103_A581TBM35_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A581TBM35_DEL_FLG", A581TBM35_DEL_FLG);
         n581TBM35_DEL_FLG = T00103_n581TBM35_DEL_FLG[0] ;
         A584TBM35_CRT_PROG_NM = T00103_A584TBM35_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584TBM35_CRT_PROG_NM", A584TBM35_CRT_PROG_NM);
         n584TBM35_CRT_PROG_NM = T00103_n584TBM35_CRT_PROG_NM[0] ;
         A587TBM35_UPD_PROG_NM = T00103_A587TBM35_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A587TBM35_UPD_PROG_NM", A587TBM35_UPD_PROG_NM);
         n587TBM35_UPD_PROG_NM = T00103_n587TBM35_UPD_PROG_NM[0] ;
         O588TBM35_UPD_CNT = A588TBM35_UPD_CNT ;
         n588TBM35_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A588TBM35_UPD_CNT", GXutil.ltrim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)));
         Z31TBM35_STUDY_ID = A31TBM35_STUDY_ID ;
         Z32TBM35_CRF_ID = A32TBM35_CRF_ID ;
         Z33TBM35_CRF_ITEM_CD = A33TBM35_CRF_ITEM_CD ;
         Z34TBM35_STUDY_AUTH_CD = A34TBM35_STUDY_AUTH_CD ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1035( ) ;
         if ( AnyError == 1 )
         {
            RcdFound35 = (short)(0) ;
            initializeNonKey1035( ) ;
         }
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound35 = (short)(0) ;
         initializeNonKey1035( ) ;
         sMode35 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode35 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1035( ) ;
      if ( RcdFound35 == 0 )
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
      RcdFound35 = (short)(0) ;
      /* Using cursor T00106 */
      pr_default.execute(4, new Object[] {new Long(A31TBM35_STUDY_ID), new Long(A31TBM35_STUDY_ID), new Short(A32TBM35_CRF_ID), new Short(A32TBM35_CRF_ID), new Long(A31TBM35_STUDY_ID), A33TBM35_CRF_ITEM_CD, A33TBM35_CRF_ITEM_CD, new Short(A32TBM35_CRF_ID), new Long(A31TBM35_STUDY_ID), A34TBM35_STUDY_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00106_A31TBM35_STUDY_ID[0] < A31TBM35_STUDY_ID ) || ( T00106_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( T00106_A32TBM35_CRF_ID[0] < A32TBM35_CRF_ID ) || ( T00106_A32TBM35_CRF_ID[0] == A32TBM35_CRF_ID ) && ( T00106_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( GXutil.strcmp(T00106_A33TBM35_CRF_ITEM_CD[0], A33TBM35_CRF_ITEM_CD) < 0 ) || ( GXutil.strcmp(T00106_A33TBM35_CRF_ITEM_CD[0], A33TBM35_CRF_ITEM_CD) == 0 ) && ( T00106_A32TBM35_CRF_ID[0] == A32TBM35_CRF_ID ) && ( T00106_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( GXutil.strcmp(T00106_A34TBM35_STUDY_AUTH_CD[0], A34TBM35_STUDY_AUTH_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00106_A31TBM35_STUDY_ID[0] > A31TBM35_STUDY_ID ) || ( T00106_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( T00106_A32TBM35_CRF_ID[0] > A32TBM35_CRF_ID ) || ( T00106_A32TBM35_CRF_ID[0] == A32TBM35_CRF_ID ) && ( T00106_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( GXutil.strcmp(T00106_A33TBM35_CRF_ITEM_CD[0], A33TBM35_CRF_ITEM_CD) > 0 ) || ( GXutil.strcmp(T00106_A33TBM35_CRF_ITEM_CD[0], A33TBM35_CRF_ITEM_CD) == 0 ) && ( T00106_A32TBM35_CRF_ID[0] == A32TBM35_CRF_ID ) && ( T00106_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( GXutil.strcmp(T00106_A34TBM35_STUDY_AUTH_CD[0], A34TBM35_STUDY_AUTH_CD) > 0 ) ) )
         {
            A31TBM35_STUDY_ID = T00106_A31TBM35_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
            A32TBM35_CRF_ID = T00106_A32TBM35_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
            A33TBM35_CRF_ITEM_CD = T00106_A33TBM35_CRF_ITEM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A33TBM35_CRF_ITEM_CD", A33TBM35_CRF_ITEM_CD);
            A34TBM35_STUDY_AUTH_CD = T00106_A34TBM35_STUDY_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A34TBM35_STUDY_AUTH_CD", A34TBM35_STUDY_AUTH_CD);
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound35 = (short)(0) ;
      /* Using cursor T00107 */
      pr_default.execute(5, new Object[] {new Long(A31TBM35_STUDY_ID), new Long(A31TBM35_STUDY_ID), new Short(A32TBM35_CRF_ID), new Short(A32TBM35_CRF_ID), new Long(A31TBM35_STUDY_ID), A33TBM35_CRF_ITEM_CD, A33TBM35_CRF_ITEM_CD, new Short(A32TBM35_CRF_ID), new Long(A31TBM35_STUDY_ID), A34TBM35_STUDY_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00107_A31TBM35_STUDY_ID[0] > A31TBM35_STUDY_ID ) || ( T00107_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( T00107_A32TBM35_CRF_ID[0] > A32TBM35_CRF_ID ) || ( T00107_A32TBM35_CRF_ID[0] == A32TBM35_CRF_ID ) && ( T00107_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( GXutil.strcmp(T00107_A33TBM35_CRF_ITEM_CD[0], A33TBM35_CRF_ITEM_CD) > 0 ) || ( GXutil.strcmp(T00107_A33TBM35_CRF_ITEM_CD[0], A33TBM35_CRF_ITEM_CD) == 0 ) && ( T00107_A32TBM35_CRF_ID[0] == A32TBM35_CRF_ID ) && ( T00107_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( GXutil.strcmp(T00107_A34TBM35_STUDY_AUTH_CD[0], A34TBM35_STUDY_AUTH_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00107_A31TBM35_STUDY_ID[0] < A31TBM35_STUDY_ID ) || ( T00107_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( T00107_A32TBM35_CRF_ID[0] < A32TBM35_CRF_ID ) || ( T00107_A32TBM35_CRF_ID[0] == A32TBM35_CRF_ID ) && ( T00107_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( GXutil.strcmp(T00107_A33TBM35_CRF_ITEM_CD[0], A33TBM35_CRF_ITEM_CD) < 0 ) || ( GXutil.strcmp(T00107_A33TBM35_CRF_ITEM_CD[0], A33TBM35_CRF_ITEM_CD) == 0 ) && ( T00107_A32TBM35_CRF_ID[0] == A32TBM35_CRF_ID ) && ( T00107_A31TBM35_STUDY_ID[0] == A31TBM35_STUDY_ID ) && ( GXutil.strcmp(T00107_A34TBM35_STUDY_AUTH_CD[0], A34TBM35_STUDY_AUTH_CD) < 0 ) ) )
         {
            A31TBM35_STUDY_ID = T00107_A31TBM35_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
            A32TBM35_CRF_ID = T00107_A32TBM35_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
            A33TBM35_CRF_ITEM_CD = T00107_A33TBM35_CRF_ITEM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A33TBM35_CRF_ITEM_CD", A33TBM35_CRF_ITEM_CD);
            A34TBM35_STUDY_AUTH_CD = T00107_A34TBM35_STUDY_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A34TBM35_STUDY_AUTH_CD", A34TBM35_STUDY_AUTH_CD);
            RcdFound35 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1035( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1035( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound35 == 1 )
         {
            if ( ( A31TBM35_STUDY_ID != Z31TBM35_STUDY_ID ) || ( A32TBM35_CRF_ID != Z32TBM35_CRF_ID ) || ( GXutil.strcmp(A33TBM35_CRF_ITEM_CD, Z33TBM35_CRF_ITEM_CD) != 0 ) || ( GXutil.strcmp(A34TBM35_STUDY_AUTH_CD, Z34TBM35_STUDY_AUTH_CD) != 0 ) )
            {
               A31TBM35_STUDY_ID = Z31TBM35_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
               A32TBM35_CRF_ID = Z32TBM35_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
               A33TBM35_CRF_ITEM_CD = Z33TBM35_CRF_ITEM_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A33TBM35_CRF_ITEM_CD", A33TBM35_CRF_ITEM_CD);
               A34TBM35_STUDY_AUTH_CD = Z34TBM35_STUDY_AUTH_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A34TBM35_STUDY_AUTH_CD", A34TBM35_STUDY_AUTH_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM35_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1035( ) ;
               GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A31TBM35_STUDY_ID != Z31TBM35_STUDY_ID ) || ( A32TBM35_CRF_ID != Z32TBM35_CRF_ID ) || ( GXutil.strcmp(A33TBM35_CRF_ITEM_CD, Z33TBM35_CRF_ITEM_CD) != 0 ) || ( GXutil.strcmp(A34TBM35_STUDY_AUTH_CD, Z34TBM35_STUDY_AUTH_CD) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1035( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM35_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1035( ) ;
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
      if ( ( A31TBM35_STUDY_ID != Z31TBM35_STUDY_ID ) || ( A32TBM35_CRF_ID != Z32TBM35_CRF_ID ) || ( GXutil.strcmp(A33TBM35_CRF_ITEM_CD, Z33TBM35_CRF_ITEM_CD) != 0 ) || ( GXutil.strcmp(A34TBM35_STUDY_AUTH_CD, Z34TBM35_STUDY_AUTH_CD) != 0 ) )
      {
         A31TBM35_STUDY_ID = Z31TBM35_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
         A32TBM35_CRF_ID = Z32TBM35_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
         A33TBM35_CRF_ITEM_CD = Z33TBM35_CRF_ITEM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A33TBM35_CRF_ITEM_CD", A33TBM35_CRF_ITEM_CD);
         A34TBM35_STUDY_AUTH_CD = Z34TBM35_STUDY_AUTH_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A34TBM35_STUDY_AUTH_CD", A34TBM35_STUDY_AUTH_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM35_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
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
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM35_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM35_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM35_DISPLAY_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1035( ) ;
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM35_DISPLAY_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1035( ) ;
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
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM35_DISPLAY_FLG_Internalname ;
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
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM35_DISPLAY_FLG_Internalname ;
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
      scanStart1035( ) ;
      if ( RcdFound35 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound35 != 0 )
         {
            scanNext1035( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM35_DISPLAY_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1035( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1035( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00102 */
         pr_default.execute(0, new Object[] {new Long(A31TBM35_STUDY_ID), new Short(A32TBM35_CRF_ID), A33TBM35_CRF_ITEM_CD, A34TBM35_STUDY_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM35_CRF_ITEM_AUTH"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z582TBM35_CRT_DATETIME.equals( T00102_A582TBM35_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z583TBM35_CRT_USER_ID, T00102_A583TBM35_CRT_USER_ID[0]) != 0 ) || !( Z585TBM35_UPD_DATETIME.equals( T00102_A585TBM35_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z586TBM35_UPD_USER_ID, T00102_A586TBM35_UPD_USER_ID[0]) != 0 ) || ( Z588TBM35_UPD_CNT != T00102_A588TBM35_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z580TBM35_DISPLAY_FLG, T00102_A580TBM35_DISPLAY_FLG[0]) != 0 ) || ( GXutil.strcmp(Z581TBM35_DEL_FLG, T00102_A581TBM35_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z584TBM35_CRT_PROG_NM, T00102_A584TBM35_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z587TBM35_UPD_PROG_NM, T00102_A587TBM35_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM35_CRF_ITEM_AUTH"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1035( )
   {
      beforeValidate1035( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1035( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1035( 0) ;
         checkOptimisticConcurrency1035( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1035( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1035( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00108 */
                  pr_default.execute(6, new Object[] {new Long(A31TBM35_STUDY_ID), new Short(A32TBM35_CRF_ID), A33TBM35_CRF_ITEM_CD, A34TBM35_STUDY_AUTH_CD, new Boolean(n582TBM35_CRT_DATETIME), A582TBM35_CRT_DATETIME, new Boolean(n583TBM35_CRT_USER_ID), A583TBM35_CRT_USER_ID, new Boolean(n585TBM35_UPD_DATETIME), A585TBM35_UPD_DATETIME, new Boolean(n586TBM35_UPD_USER_ID), A586TBM35_UPD_USER_ID, new Boolean(n588TBM35_UPD_CNT), new Long(A588TBM35_UPD_CNT), new Boolean(n580TBM35_DISPLAY_FLG), A580TBM35_DISPLAY_FLG, new Boolean(n581TBM35_DEL_FLG), A581TBM35_DEL_FLG, new Boolean(n584TBM35_CRT_PROG_NM), A584TBM35_CRT_PROG_NM, new Boolean(n587TBM35_UPD_PROG_NM), A587TBM35_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM35_CRF_ITEM_AUTH") ;
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
                        resetCaption100( ) ;
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
            load1035( ) ;
         }
         endLevel1035( ) ;
      }
      closeExtendedTableCursors1035( ) ;
   }

   public void update1035( )
   {
      beforeValidate1035( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1035( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1035( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1035( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1035( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00109 */
                  pr_default.execute(7, new Object[] {new Boolean(n582TBM35_CRT_DATETIME), A582TBM35_CRT_DATETIME, new Boolean(n583TBM35_CRT_USER_ID), A583TBM35_CRT_USER_ID, new Boolean(n585TBM35_UPD_DATETIME), A585TBM35_UPD_DATETIME, new Boolean(n586TBM35_UPD_USER_ID), A586TBM35_UPD_USER_ID, new Boolean(n588TBM35_UPD_CNT), new Long(A588TBM35_UPD_CNT), new Boolean(n580TBM35_DISPLAY_FLG), A580TBM35_DISPLAY_FLG, new Boolean(n581TBM35_DEL_FLG), A581TBM35_DEL_FLG, new Boolean(n584TBM35_CRT_PROG_NM), A584TBM35_CRT_PROG_NM, new Boolean(n587TBM35_UPD_PROG_NM), A587TBM35_UPD_PROG_NM, new Long(A31TBM35_STUDY_ID), new Short(A32TBM35_CRF_ID), A33TBM35_CRF_ITEM_CD, A34TBM35_STUDY_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM35_CRF_ITEM_AUTH") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM35_CRF_ITEM_AUTH"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1035( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption100( ) ;
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
         endLevel1035( ) ;
      }
      closeExtendedTableCursors1035( ) ;
   }

   public void deferredUpdate1035( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1035( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1035( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1035( ) ;
         afterConfirm1035( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1035( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001010 */
               pr_default.execute(8, new Object[] {new Long(A31TBM35_STUDY_ID), new Short(A32TBM35_CRF_ID), A33TBM35_CRF_ITEM_CD, A34TBM35_STUDY_AUTH_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM35_CRF_ITEM_AUTH") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound35 == 0 )
                     {
                        initAll1035( ) ;
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
                     resetCaption100( ) ;
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
      sMode35 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1035( ) ;
      Gx_mode = sMode35 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1035( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM35_CRF_ITEM_AUTH" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel1035( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1035( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm35_crf_item_auth");
         if ( AnyError == 0 )
         {
            confirmValues100( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm35_crf_item_auth");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1035( )
   {
      /* Scan By routine */
      /* Using cursor T001011 */
      pr_default.execute(9);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A31TBM35_STUDY_ID = T001011_A31TBM35_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
         A32TBM35_CRF_ID = T001011_A32TBM35_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
         A33TBM35_CRF_ITEM_CD = T001011_A33TBM35_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33TBM35_CRF_ITEM_CD", A33TBM35_CRF_ITEM_CD);
         A34TBM35_STUDY_AUTH_CD = T001011_A34TBM35_STUDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34TBM35_STUDY_AUTH_CD", A34TBM35_STUDY_AUTH_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1035( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound35 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound35 = (short)(1) ;
         A31TBM35_STUDY_ID = T001011_A31TBM35_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
         A32TBM35_CRF_ID = T001011_A32TBM35_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
         A33TBM35_CRF_ITEM_CD = T001011_A33TBM35_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A33TBM35_CRF_ITEM_CD", A33TBM35_CRF_ITEM_CD);
         A34TBM35_STUDY_AUTH_CD = T001011_A34TBM35_STUDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A34TBM35_STUDY_AUTH_CD", A34TBM35_STUDY_AUTH_CD);
      }
   }

   public void scanEnd1035( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1035( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1035( )
   {
      /* Before Insert Rules */
      A582TBM35_CRT_DATETIME = GXutil.now( ) ;
      n582TBM35_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A582TBM35_CRT_DATETIME", localUtil.ttoc( A582TBM35_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A583TBM35_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm35_crf_item_auth_impl.this.GXt_char1 = GXv_char2[0] ;
      A583TBM35_CRT_USER_ID = GXt_char1 ;
      n583TBM35_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A583TBM35_CRT_USER_ID", A583TBM35_CRT_USER_ID);
      A585TBM35_UPD_DATETIME = GXutil.now( ) ;
      n585TBM35_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A585TBM35_UPD_DATETIME", localUtil.ttoc( A585TBM35_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A586TBM35_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm35_crf_item_auth_impl.this.GXt_char1 = GXv_char2[0] ;
      A586TBM35_UPD_USER_ID = GXt_char1 ;
      n586TBM35_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A586TBM35_UPD_USER_ID", A586TBM35_UPD_USER_ID);
      A588TBM35_UPD_CNT = (long)(O588TBM35_UPD_CNT+1) ;
      n588TBM35_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A588TBM35_UPD_CNT", GXutil.ltrim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate1035( )
   {
      /* Before Update Rules */
      A585TBM35_UPD_DATETIME = GXutil.now( ) ;
      n585TBM35_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A585TBM35_UPD_DATETIME", localUtil.ttoc( A585TBM35_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A586TBM35_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm35_crf_item_auth_impl.this.GXt_char1 = GXv_char2[0] ;
      A586TBM35_UPD_USER_ID = GXt_char1 ;
      n586TBM35_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A586TBM35_UPD_USER_ID", A586TBM35_UPD_USER_ID);
      A588TBM35_UPD_CNT = (long)(O588TBM35_UPD_CNT+1) ;
      n588TBM35_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A588TBM35_UPD_CNT", GXutil.ltrim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)));
   }

   public void beforeDelete1035( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1035( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1035( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1035( )
   {
      edtTBM35_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_STUDY_ID_Enabled, 5, 0)));
      edtTBM35_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_CRF_ID_Enabled, 5, 0)));
      edtTBM35_CRF_ITEM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_CRF_ITEM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_CRF_ITEM_CD_Enabled, 5, 0)));
      edtTBM35_STUDY_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_STUDY_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_STUDY_AUTH_CD_Enabled, 5, 0)));
      edtTBM35_DISPLAY_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_DISPLAY_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_DISPLAY_FLG_Enabled, 5, 0)));
      edtTBM35_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_DEL_FLG_Enabled, 5, 0)));
      edtTBM35_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM35_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM35_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM35_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM35_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM35_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM35_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM35_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM35_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues100( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRF項目権限マスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513204689");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm35_crf_item_auth") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1035( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z31TBM35_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z31TBM35_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z32TBM35_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z32TBM35_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z33TBM35_CRF_ITEM_CD", GXutil.rtrim( Z33TBM35_CRF_ITEM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z34TBM35_STUDY_AUTH_CD", GXutil.rtrim( Z34TBM35_STUDY_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z582TBM35_CRT_DATETIME", localUtil.ttoc( Z582TBM35_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z583TBM35_CRT_USER_ID", GXutil.rtrim( Z583TBM35_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z585TBM35_UPD_DATETIME", localUtil.ttoc( Z585TBM35_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z586TBM35_UPD_USER_ID", GXutil.rtrim( Z586TBM35_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z588TBM35_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z588TBM35_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z580TBM35_DISPLAY_FLG", GXutil.rtrim( Z580TBM35_DISPLAY_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z581TBM35_DEL_FLG", GXutil.rtrim( Z581TBM35_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z584TBM35_CRT_PROG_NM", GXutil.rtrim( Z584TBM35_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z587TBM35_UPD_PROG_NM", GXutil.rtrim( Z587TBM35_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O588TBM35_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O588TBM35_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM35_CRF_ITEM_AUTH" ;
   }

   public String getPgmdesc( )
   {
      return "CRF項目権限マスタ" ;
   }

   public void initializeNonKey1035( )
   {
      A582TBM35_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n582TBM35_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A582TBM35_CRT_DATETIME", localUtil.ttoc( A582TBM35_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n582TBM35_CRT_DATETIME = (GXutil.nullDate().equals(A582TBM35_CRT_DATETIME) ? true : false) ;
      A583TBM35_CRT_USER_ID = "" ;
      n583TBM35_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A583TBM35_CRT_USER_ID", A583TBM35_CRT_USER_ID);
      n583TBM35_CRT_USER_ID = ((GXutil.strcmp("", A583TBM35_CRT_USER_ID)==0) ? true : false) ;
      A585TBM35_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n585TBM35_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A585TBM35_UPD_DATETIME", localUtil.ttoc( A585TBM35_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n585TBM35_UPD_DATETIME = (GXutil.nullDate().equals(A585TBM35_UPD_DATETIME) ? true : false) ;
      A586TBM35_UPD_USER_ID = "" ;
      n586TBM35_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A586TBM35_UPD_USER_ID", A586TBM35_UPD_USER_ID);
      n586TBM35_UPD_USER_ID = ((GXutil.strcmp("", A586TBM35_UPD_USER_ID)==0) ? true : false) ;
      A588TBM35_UPD_CNT = 0 ;
      n588TBM35_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A588TBM35_UPD_CNT", GXutil.ltrim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)));
      n588TBM35_UPD_CNT = ((0==A588TBM35_UPD_CNT) ? true : false) ;
      A580TBM35_DISPLAY_FLG = "" ;
      n580TBM35_DISPLAY_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A580TBM35_DISPLAY_FLG", A580TBM35_DISPLAY_FLG);
      n580TBM35_DISPLAY_FLG = ((GXutil.strcmp("", A580TBM35_DISPLAY_FLG)==0) ? true : false) ;
      A581TBM35_DEL_FLG = "" ;
      n581TBM35_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A581TBM35_DEL_FLG", A581TBM35_DEL_FLG);
      n581TBM35_DEL_FLG = ((GXutil.strcmp("", A581TBM35_DEL_FLG)==0) ? true : false) ;
      A584TBM35_CRT_PROG_NM = "" ;
      n584TBM35_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A584TBM35_CRT_PROG_NM", A584TBM35_CRT_PROG_NM);
      n584TBM35_CRT_PROG_NM = ((GXutil.strcmp("", A584TBM35_CRT_PROG_NM)==0) ? true : false) ;
      A587TBM35_UPD_PROG_NM = "" ;
      n587TBM35_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A587TBM35_UPD_PROG_NM", A587TBM35_UPD_PROG_NM);
      n587TBM35_UPD_PROG_NM = ((GXutil.strcmp("", A587TBM35_UPD_PROG_NM)==0) ? true : false) ;
      O588TBM35_UPD_CNT = A588TBM35_UPD_CNT ;
      n588TBM35_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A588TBM35_UPD_CNT", GXutil.ltrim( GXutil.str( A588TBM35_UPD_CNT, 10, 0)));
   }

   public void initAll1035( )
   {
      A31TBM35_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A31TBM35_STUDY_ID", GXutil.ltrim( GXutil.str( A31TBM35_STUDY_ID, 10, 0)));
      A32TBM35_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A32TBM35_CRF_ID", GXutil.ltrim( GXutil.str( A32TBM35_CRF_ID, 4, 0)));
      A33TBM35_CRF_ITEM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A33TBM35_CRF_ITEM_CD", A33TBM35_CRF_ITEM_CD);
      A34TBM35_STUDY_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A34TBM35_STUDY_AUTH_CD", A34TBM35_STUDY_AUTH_CD);
      initializeNonKey1035( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513204693");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm35_crf_item_auth.js", "?202071513204693");
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
      lblTextblocktbm35_study_id_Internalname = "TEXTBLOCKTBM35_STUDY_ID" ;
      edtTBM35_STUDY_ID_Internalname = "TBM35_STUDY_ID" ;
      lblTextblocktbm35_crf_id_Internalname = "TEXTBLOCKTBM35_CRF_ID" ;
      edtTBM35_CRF_ID_Internalname = "TBM35_CRF_ID" ;
      lblTextblocktbm35_crf_item_cd_Internalname = "TEXTBLOCKTBM35_CRF_ITEM_CD" ;
      edtTBM35_CRF_ITEM_CD_Internalname = "TBM35_CRF_ITEM_CD" ;
      lblTextblocktbm35_study_auth_cd_Internalname = "TEXTBLOCKTBM35_STUDY_AUTH_CD" ;
      edtTBM35_STUDY_AUTH_CD_Internalname = "TBM35_STUDY_AUTH_CD" ;
      lblTextblocktbm35_display_flg_Internalname = "TEXTBLOCKTBM35_DISPLAY_FLG" ;
      edtTBM35_DISPLAY_FLG_Internalname = "TBM35_DISPLAY_FLG" ;
      lblTextblocktbm35_del_flg_Internalname = "TEXTBLOCKTBM35_DEL_FLG" ;
      edtTBM35_DEL_FLG_Internalname = "TBM35_DEL_FLG" ;
      lblTextblocktbm35_crt_datetime_Internalname = "TEXTBLOCKTBM35_CRT_DATETIME" ;
      edtTBM35_CRT_DATETIME_Internalname = "TBM35_CRT_DATETIME" ;
      lblTextblocktbm35_crt_user_id_Internalname = "TEXTBLOCKTBM35_CRT_USER_ID" ;
      edtTBM35_CRT_USER_ID_Internalname = "TBM35_CRT_USER_ID" ;
      lblTextblocktbm35_crt_prog_nm_Internalname = "TEXTBLOCKTBM35_CRT_PROG_NM" ;
      edtTBM35_CRT_PROG_NM_Internalname = "TBM35_CRT_PROG_NM" ;
      lblTextblocktbm35_upd_datetime_Internalname = "TEXTBLOCKTBM35_UPD_DATETIME" ;
      edtTBM35_UPD_DATETIME_Internalname = "TBM35_UPD_DATETIME" ;
      lblTextblocktbm35_upd_user_id_Internalname = "TEXTBLOCKTBM35_UPD_USER_ID" ;
      edtTBM35_UPD_USER_ID_Internalname = "TBM35_UPD_USER_ID" ;
      lblTextblocktbm35_upd_prog_nm_Internalname = "TEXTBLOCKTBM35_UPD_PROG_NM" ;
      edtTBM35_UPD_PROG_NM_Internalname = "TBM35_UPD_PROG_NM" ;
      lblTextblocktbm35_upd_cnt_Internalname = "TEXTBLOCKTBM35_UPD_CNT" ;
      edtTBM35_UPD_CNT_Internalname = "TBM35_UPD_CNT" ;
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
      edtTBM35_UPD_CNT_Jsonclick = "" ;
      edtTBM35_UPD_CNT_Enabled = 1 ;
      edtTBM35_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM35_UPD_PROG_NM_Enabled = 1 ;
      edtTBM35_UPD_USER_ID_Jsonclick = "" ;
      edtTBM35_UPD_USER_ID_Enabled = 1 ;
      edtTBM35_UPD_DATETIME_Jsonclick = "" ;
      edtTBM35_UPD_DATETIME_Enabled = 1 ;
      edtTBM35_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM35_CRT_PROG_NM_Enabled = 1 ;
      edtTBM35_CRT_USER_ID_Jsonclick = "" ;
      edtTBM35_CRT_USER_ID_Enabled = 1 ;
      edtTBM35_CRT_DATETIME_Jsonclick = "" ;
      edtTBM35_CRT_DATETIME_Enabled = 1 ;
      edtTBM35_DEL_FLG_Jsonclick = "" ;
      edtTBM35_DEL_FLG_Enabled = 1 ;
      edtTBM35_DISPLAY_FLG_Jsonclick = "" ;
      edtTBM35_DISPLAY_FLG_Enabled = 1 ;
      edtTBM35_STUDY_AUTH_CD_Jsonclick = "" ;
      edtTBM35_STUDY_AUTH_CD_Enabled = 1 ;
      edtTBM35_CRF_ITEM_CD_Jsonclick = "" ;
      edtTBM35_CRF_ITEM_CD_Enabled = 1 ;
      edtTBM35_CRF_ID_Jsonclick = "" ;
      edtTBM35_CRF_ID_Enabled = 1 ;
      edtTBM35_STUDY_ID_Jsonclick = "" ;
      edtTBM35_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm35_crt_user_id1035( String Gx_mode )
   {
      GXt_char1 = A583TBM35_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm35_crf_item_auth_impl.this.GXt_char1 = GXv_char2[0] ;
      A583TBM35_CRT_USER_ID = GXt_char1 ;
      n583TBM35_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A583TBM35_CRT_USER_ID", A583TBM35_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A583TBM35_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm35_upd_user_id1035( String Gx_mode )
   {
      GXt_char1 = A586TBM35_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm35_crf_item_auth_impl.this.GXt_char1 = GXv_char2[0] ;
      A586TBM35_UPD_USER_ID = GXt_char1 ;
      n586TBM35_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A586TBM35_UPD_USER_ID", A586TBM35_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A586TBM35_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM35_DISPLAY_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm35_study_auth_cd( long GX_Parm1 ,
                                          short GX_Parm2 ,
                                          String GX_Parm3 ,
                                          String GX_Parm4 ,
                                          java.util.Date GX_Parm5 ,
                                          String GX_Parm6 ,
                                          java.util.Date GX_Parm7 ,
                                          String GX_Parm8 ,
                                          long GX_Parm9 ,
                                          String GX_Parm10 ,
                                          String GX_Parm11 ,
                                          String GX_Parm12 ,
                                          String GX_Parm13 )
   {
      A31TBM35_STUDY_ID = GX_Parm1 ;
      A32TBM35_CRF_ID = GX_Parm2 ;
      A33TBM35_CRF_ITEM_CD = GX_Parm3 ;
      A34TBM35_STUDY_AUTH_CD = GX_Parm4 ;
      A582TBM35_CRT_DATETIME = GX_Parm5 ;
      n582TBM35_CRT_DATETIME = false ;
      A583TBM35_CRT_USER_ID = GX_Parm6 ;
      n583TBM35_CRT_USER_ID = false ;
      A585TBM35_UPD_DATETIME = GX_Parm7 ;
      n585TBM35_UPD_DATETIME = false ;
      A586TBM35_UPD_USER_ID = GX_Parm8 ;
      n586TBM35_UPD_USER_ID = false ;
      A588TBM35_UPD_CNT = GX_Parm9 ;
      n588TBM35_UPD_CNT = false ;
      A580TBM35_DISPLAY_FLG = GX_Parm10 ;
      n580TBM35_DISPLAY_FLG = false ;
      A581TBM35_DEL_FLG = GX_Parm11 ;
      n581TBM35_DEL_FLG = false ;
      A584TBM35_CRT_PROG_NM = GX_Parm12 ;
      n584TBM35_CRT_PROG_NM = false ;
      A587TBM35_UPD_PROG_NM = GX_Parm13 ;
      n587TBM35_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A582TBM35_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A583TBM35_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A585TBM35_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A586TBM35_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A588TBM35_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A580TBM35_DISPLAY_FLG));
      isValidOutput.add(GXutil.rtrim( A581TBM35_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A584TBM35_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A587TBM35_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z31TBM35_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z32TBM35_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z33TBM35_CRF_ITEM_CD));
      isValidOutput.add(GXutil.rtrim( Z34TBM35_STUDY_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z582TBM35_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z583TBM35_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z585TBM35_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z586TBM35_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z588TBM35_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z580TBM35_DISPLAY_FLG));
      isValidOutput.add(GXutil.rtrim( Z581TBM35_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z584TBM35_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z587TBM35_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O588TBM35_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z33TBM35_CRF_ITEM_CD = "" ;
      Z34TBM35_STUDY_AUTH_CD = "" ;
      Z582TBM35_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z583TBM35_CRT_USER_ID = "" ;
      Z585TBM35_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z586TBM35_UPD_USER_ID = "" ;
      Z580TBM35_DISPLAY_FLG = "" ;
      Z581TBM35_DEL_FLG = "" ;
      Z584TBM35_CRT_PROG_NM = "" ;
      Z587TBM35_UPD_PROG_NM = "" ;
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
      lblTextblocktbm35_study_id_Jsonclick = "" ;
      lblTextblocktbm35_crf_id_Jsonclick = "" ;
      lblTextblocktbm35_crf_item_cd_Jsonclick = "" ;
      A33TBM35_CRF_ITEM_CD = "" ;
      lblTextblocktbm35_study_auth_cd_Jsonclick = "" ;
      A34TBM35_STUDY_AUTH_CD = "" ;
      lblTextblocktbm35_display_flg_Jsonclick = "" ;
      A580TBM35_DISPLAY_FLG = "" ;
      lblTextblocktbm35_del_flg_Jsonclick = "" ;
      A581TBM35_DEL_FLG = "" ;
      lblTextblocktbm35_crt_datetime_Jsonclick = "" ;
      A582TBM35_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm35_crt_user_id_Jsonclick = "" ;
      A583TBM35_CRT_USER_ID = "" ;
      lblTextblocktbm35_crt_prog_nm_Jsonclick = "" ;
      A584TBM35_CRT_PROG_NM = "" ;
      lblTextblocktbm35_upd_datetime_Jsonclick = "" ;
      A585TBM35_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm35_upd_user_id_Jsonclick = "" ;
      A586TBM35_UPD_USER_ID = "" ;
      lblTextblocktbm35_upd_prog_nm_Jsonclick = "" ;
      A587TBM35_UPD_PROG_NM = "" ;
      lblTextblocktbm35_upd_cnt_Jsonclick = "" ;
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
      T00104_A31TBM35_STUDY_ID = new long[1] ;
      T00104_A32TBM35_CRF_ID = new short[1] ;
      T00104_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      T00104_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      T00104_A582TBM35_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00104_n582TBM35_CRT_DATETIME = new boolean[] {false} ;
      T00104_A583TBM35_CRT_USER_ID = new String[] {""} ;
      T00104_n583TBM35_CRT_USER_ID = new boolean[] {false} ;
      T00104_A585TBM35_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00104_n585TBM35_UPD_DATETIME = new boolean[] {false} ;
      T00104_A586TBM35_UPD_USER_ID = new String[] {""} ;
      T00104_n586TBM35_UPD_USER_ID = new boolean[] {false} ;
      T00104_A588TBM35_UPD_CNT = new long[1] ;
      T00104_n588TBM35_UPD_CNT = new boolean[] {false} ;
      T00104_A580TBM35_DISPLAY_FLG = new String[] {""} ;
      T00104_n580TBM35_DISPLAY_FLG = new boolean[] {false} ;
      T00104_A581TBM35_DEL_FLG = new String[] {""} ;
      T00104_n581TBM35_DEL_FLG = new boolean[] {false} ;
      T00104_A584TBM35_CRT_PROG_NM = new String[] {""} ;
      T00104_n584TBM35_CRT_PROG_NM = new boolean[] {false} ;
      T00104_A587TBM35_UPD_PROG_NM = new String[] {""} ;
      T00104_n587TBM35_UPD_PROG_NM = new boolean[] {false} ;
      T00105_A31TBM35_STUDY_ID = new long[1] ;
      T00105_A32TBM35_CRF_ID = new short[1] ;
      T00105_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      T00105_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      T00103_A31TBM35_STUDY_ID = new long[1] ;
      T00103_A32TBM35_CRF_ID = new short[1] ;
      T00103_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      T00103_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      T00103_A582TBM35_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00103_n582TBM35_CRT_DATETIME = new boolean[] {false} ;
      T00103_A583TBM35_CRT_USER_ID = new String[] {""} ;
      T00103_n583TBM35_CRT_USER_ID = new boolean[] {false} ;
      T00103_A585TBM35_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00103_n585TBM35_UPD_DATETIME = new boolean[] {false} ;
      T00103_A586TBM35_UPD_USER_ID = new String[] {""} ;
      T00103_n586TBM35_UPD_USER_ID = new boolean[] {false} ;
      T00103_A588TBM35_UPD_CNT = new long[1] ;
      T00103_n588TBM35_UPD_CNT = new boolean[] {false} ;
      T00103_A580TBM35_DISPLAY_FLG = new String[] {""} ;
      T00103_n580TBM35_DISPLAY_FLG = new boolean[] {false} ;
      T00103_A581TBM35_DEL_FLG = new String[] {""} ;
      T00103_n581TBM35_DEL_FLG = new boolean[] {false} ;
      T00103_A584TBM35_CRT_PROG_NM = new String[] {""} ;
      T00103_n584TBM35_CRT_PROG_NM = new boolean[] {false} ;
      T00103_A587TBM35_UPD_PROG_NM = new String[] {""} ;
      T00103_n587TBM35_UPD_PROG_NM = new boolean[] {false} ;
      sMode35 = "" ;
      T00106_A31TBM35_STUDY_ID = new long[1] ;
      T00106_A32TBM35_CRF_ID = new short[1] ;
      T00106_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      T00106_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      T00107_A31TBM35_STUDY_ID = new long[1] ;
      T00107_A32TBM35_CRF_ID = new short[1] ;
      T00107_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      T00107_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      T00102_A31TBM35_STUDY_ID = new long[1] ;
      T00102_A32TBM35_CRF_ID = new short[1] ;
      T00102_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      T00102_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      T00102_A582TBM35_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00102_n582TBM35_CRT_DATETIME = new boolean[] {false} ;
      T00102_A583TBM35_CRT_USER_ID = new String[] {""} ;
      T00102_n583TBM35_CRT_USER_ID = new boolean[] {false} ;
      T00102_A585TBM35_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00102_n585TBM35_UPD_DATETIME = new boolean[] {false} ;
      T00102_A586TBM35_UPD_USER_ID = new String[] {""} ;
      T00102_n586TBM35_UPD_USER_ID = new boolean[] {false} ;
      T00102_A588TBM35_UPD_CNT = new long[1] ;
      T00102_n588TBM35_UPD_CNT = new boolean[] {false} ;
      T00102_A580TBM35_DISPLAY_FLG = new String[] {""} ;
      T00102_n580TBM35_DISPLAY_FLG = new boolean[] {false} ;
      T00102_A581TBM35_DEL_FLG = new String[] {""} ;
      T00102_n581TBM35_DEL_FLG = new boolean[] {false} ;
      T00102_A584TBM35_CRT_PROG_NM = new String[] {""} ;
      T00102_n584TBM35_CRT_PROG_NM = new boolean[] {false} ;
      T00102_A587TBM35_UPD_PROG_NM = new String[] {""} ;
      T00102_n587TBM35_UPD_PROG_NM = new boolean[] {false} ;
      T001011_A31TBM35_STUDY_ID = new long[1] ;
      T001011_A32TBM35_CRF_ID = new short[1] ;
      T001011_A33TBM35_CRF_ITEM_CD = new String[] {""} ;
      T001011_A34TBM35_STUDY_AUTH_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm35_crf_item_auth__default(),
         new Object[] {
             new Object[] {
            T00102_A31TBM35_STUDY_ID, T00102_A32TBM35_CRF_ID, T00102_A33TBM35_CRF_ITEM_CD, T00102_A34TBM35_STUDY_AUTH_CD, T00102_A582TBM35_CRT_DATETIME, T00102_n582TBM35_CRT_DATETIME, T00102_A583TBM35_CRT_USER_ID, T00102_n583TBM35_CRT_USER_ID, T00102_A585TBM35_UPD_DATETIME, T00102_n585TBM35_UPD_DATETIME,
            T00102_A586TBM35_UPD_USER_ID, T00102_n586TBM35_UPD_USER_ID, T00102_A588TBM35_UPD_CNT, T00102_n588TBM35_UPD_CNT, T00102_A580TBM35_DISPLAY_FLG, T00102_n580TBM35_DISPLAY_FLG, T00102_A581TBM35_DEL_FLG, T00102_n581TBM35_DEL_FLG, T00102_A584TBM35_CRT_PROG_NM, T00102_n584TBM35_CRT_PROG_NM,
            T00102_A587TBM35_UPD_PROG_NM, T00102_n587TBM35_UPD_PROG_NM
            }
            , new Object[] {
            T00103_A31TBM35_STUDY_ID, T00103_A32TBM35_CRF_ID, T00103_A33TBM35_CRF_ITEM_CD, T00103_A34TBM35_STUDY_AUTH_CD, T00103_A582TBM35_CRT_DATETIME, T00103_n582TBM35_CRT_DATETIME, T00103_A583TBM35_CRT_USER_ID, T00103_n583TBM35_CRT_USER_ID, T00103_A585TBM35_UPD_DATETIME, T00103_n585TBM35_UPD_DATETIME,
            T00103_A586TBM35_UPD_USER_ID, T00103_n586TBM35_UPD_USER_ID, T00103_A588TBM35_UPD_CNT, T00103_n588TBM35_UPD_CNT, T00103_A580TBM35_DISPLAY_FLG, T00103_n580TBM35_DISPLAY_FLG, T00103_A581TBM35_DEL_FLG, T00103_n581TBM35_DEL_FLG, T00103_A584TBM35_CRT_PROG_NM, T00103_n584TBM35_CRT_PROG_NM,
            T00103_A587TBM35_UPD_PROG_NM, T00103_n587TBM35_UPD_PROG_NM
            }
            , new Object[] {
            T00104_A31TBM35_STUDY_ID, T00104_A32TBM35_CRF_ID, T00104_A33TBM35_CRF_ITEM_CD, T00104_A34TBM35_STUDY_AUTH_CD, T00104_A582TBM35_CRT_DATETIME, T00104_n582TBM35_CRT_DATETIME, T00104_A583TBM35_CRT_USER_ID, T00104_n583TBM35_CRT_USER_ID, T00104_A585TBM35_UPD_DATETIME, T00104_n585TBM35_UPD_DATETIME,
            T00104_A586TBM35_UPD_USER_ID, T00104_n586TBM35_UPD_USER_ID, T00104_A588TBM35_UPD_CNT, T00104_n588TBM35_UPD_CNT, T00104_A580TBM35_DISPLAY_FLG, T00104_n580TBM35_DISPLAY_FLG, T00104_A581TBM35_DEL_FLG, T00104_n581TBM35_DEL_FLG, T00104_A584TBM35_CRT_PROG_NM, T00104_n584TBM35_CRT_PROG_NM,
            T00104_A587TBM35_UPD_PROG_NM, T00104_n587TBM35_UPD_PROG_NM
            }
            , new Object[] {
            T00105_A31TBM35_STUDY_ID, T00105_A32TBM35_CRF_ID, T00105_A33TBM35_CRF_ITEM_CD, T00105_A34TBM35_STUDY_AUTH_CD
            }
            , new Object[] {
            T00106_A31TBM35_STUDY_ID, T00106_A32TBM35_CRF_ID, T00106_A33TBM35_CRF_ITEM_CD, T00106_A34TBM35_STUDY_AUTH_CD
            }
            , new Object[] {
            T00107_A31TBM35_STUDY_ID, T00107_A32TBM35_CRF_ID, T00107_A33TBM35_CRF_ITEM_CD, T00107_A34TBM35_STUDY_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001011_A31TBM35_STUDY_ID, T001011_A32TBM35_CRF_ID, T001011_A33TBM35_CRF_ITEM_CD, T001011_A34TBM35_STUDY_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM35_CRF_ITEM_AUTH" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z32TBM35_CRF_ID ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A32TBM35_CRF_ID ;
   private short RcdFound35 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM35_STUDY_ID_Enabled ;
   private int edtTBM35_CRF_ID_Enabled ;
   private int edtTBM35_CRF_ITEM_CD_Enabled ;
   private int edtTBM35_STUDY_AUTH_CD_Enabled ;
   private int edtTBM35_DISPLAY_FLG_Enabled ;
   private int edtTBM35_DEL_FLG_Enabled ;
   private int edtTBM35_CRT_DATETIME_Enabled ;
   private int edtTBM35_CRT_USER_ID_Enabled ;
   private int edtTBM35_CRT_PROG_NM_Enabled ;
   private int edtTBM35_UPD_DATETIME_Enabled ;
   private int edtTBM35_UPD_USER_ID_Enabled ;
   private int edtTBM35_UPD_PROG_NM_Enabled ;
   private int edtTBM35_UPD_CNT_Enabled ;
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
   private long Z31TBM35_STUDY_ID ;
   private long Z588TBM35_UPD_CNT ;
   private long O588TBM35_UPD_CNT ;
   private long A31TBM35_STUDY_ID ;
   private long A588TBM35_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM35_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm35_study_id_Internalname ;
   private String lblTextblocktbm35_study_id_Jsonclick ;
   private String edtTBM35_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm35_crf_id_Internalname ;
   private String lblTextblocktbm35_crf_id_Jsonclick ;
   private String edtTBM35_CRF_ID_Internalname ;
   private String edtTBM35_CRF_ID_Jsonclick ;
   private String lblTextblocktbm35_crf_item_cd_Internalname ;
   private String lblTextblocktbm35_crf_item_cd_Jsonclick ;
   private String edtTBM35_CRF_ITEM_CD_Internalname ;
   private String edtTBM35_CRF_ITEM_CD_Jsonclick ;
   private String lblTextblocktbm35_study_auth_cd_Internalname ;
   private String lblTextblocktbm35_study_auth_cd_Jsonclick ;
   private String edtTBM35_STUDY_AUTH_CD_Internalname ;
   private String edtTBM35_STUDY_AUTH_CD_Jsonclick ;
   private String lblTextblocktbm35_display_flg_Internalname ;
   private String lblTextblocktbm35_display_flg_Jsonclick ;
   private String edtTBM35_DISPLAY_FLG_Internalname ;
   private String edtTBM35_DISPLAY_FLG_Jsonclick ;
   private String lblTextblocktbm35_del_flg_Internalname ;
   private String lblTextblocktbm35_del_flg_Jsonclick ;
   private String edtTBM35_DEL_FLG_Internalname ;
   private String edtTBM35_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm35_crt_datetime_Internalname ;
   private String lblTextblocktbm35_crt_datetime_Jsonclick ;
   private String edtTBM35_CRT_DATETIME_Internalname ;
   private String edtTBM35_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm35_crt_user_id_Internalname ;
   private String lblTextblocktbm35_crt_user_id_Jsonclick ;
   private String edtTBM35_CRT_USER_ID_Internalname ;
   private String edtTBM35_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm35_crt_prog_nm_Internalname ;
   private String lblTextblocktbm35_crt_prog_nm_Jsonclick ;
   private String edtTBM35_CRT_PROG_NM_Internalname ;
   private String edtTBM35_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm35_upd_datetime_Internalname ;
   private String lblTextblocktbm35_upd_datetime_Jsonclick ;
   private String edtTBM35_UPD_DATETIME_Internalname ;
   private String edtTBM35_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm35_upd_user_id_Internalname ;
   private String lblTextblocktbm35_upd_user_id_Jsonclick ;
   private String edtTBM35_UPD_USER_ID_Internalname ;
   private String edtTBM35_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm35_upd_prog_nm_Internalname ;
   private String lblTextblocktbm35_upd_prog_nm_Jsonclick ;
   private String edtTBM35_UPD_PROG_NM_Internalname ;
   private String edtTBM35_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm35_upd_cnt_Internalname ;
   private String lblTextblocktbm35_upd_cnt_Jsonclick ;
   private String edtTBM35_UPD_CNT_Internalname ;
   private String edtTBM35_UPD_CNT_Jsonclick ;
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
   private String sMode35 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z582TBM35_CRT_DATETIME ;
   private java.util.Date Z585TBM35_UPD_DATETIME ;
   private java.util.Date A582TBM35_CRT_DATETIME ;
   private java.util.Date A585TBM35_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n580TBM35_DISPLAY_FLG ;
   private boolean n581TBM35_DEL_FLG ;
   private boolean n582TBM35_CRT_DATETIME ;
   private boolean n583TBM35_CRT_USER_ID ;
   private boolean n584TBM35_CRT_PROG_NM ;
   private boolean n585TBM35_UPD_DATETIME ;
   private boolean n586TBM35_UPD_USER_ID ;
   private boolean n587TBM35_UPD_PROG_NM ;
   private boolean n588TBM35_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z33TBM35_CRF_ITEM_CD ;
   private String Z34TBM35_STUDY_AUTH_CD ;
   private String Z583TBM35_CRT_USER_ID ;
   private String Z586TBM35_UPD_USER_ID ;
   private String Z580TBM35_DISPLAY_FLG ;
   private String Z581TBM35_DEL_FLG ;
   private String Z584TBM35_CRT_PROG_NM ;
   private String Z587TBM35_UPD_PROG_NM ;
   private String A33TBM35_CRF_ITEM_CD ;
   private String A34TBM35_STUDY_AUTH_CD ;
   private String A580TBM35_DISPLAY_FLG ;
   private String A581TBM35_DEL_FLG ;
   private String A583TBM35_CRT_USER_ID ;
   private String A584TBM35_CRT_PROG_NM ;
   private String A586TBM35_UPD_USER_ID ;
   private String A587TBM35_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T00104_A31TBM35_STUDY_ID ;
   private short[] T00104_A32TBM35_CRF_ID ;
   private String[] T00104_A33TBM35_CRF_ITEM_CD ;
   private String[] T00104_A34TBM35_STUDY_AUTH_CD ;
   private java.util.Date[] T00104_A582TBM35_CRT_DATETIME ;
   private boolean[] T00104_n582TBM35_CRT_DATETIME ;
   private String[] T00104_A583TBM35_CRT_USER_ID ;
   private boolean[] T00104_n583TBM35_CRT_USER_ID ;
   private java.util.Date[] T00104_A585TBM35_UPD_DATETIME ;
   private boolean[] T00104_n585TBM35_UPD_DATETIME ;
   private String[] T00104_A586TBM35_UPD_USER_ID ;
   private boolean[] T00104_n586TBM35_UPD_USER_ID ;
   private long[] T00104_A588TBM35_UPD_CNT ;
   private boolean[] T00104_n588TBM35_UPD_CNT ;
   private String[] T00104_A580TBM35_DISPLAY_FLG ;
   private boolean[] T00104_n580TBM35_DISPLAY_FLG ;
   private String[] T00104_A581TBM35_DEL_FLG ;
   private boolean[] T00104_n581TBM35_DEL_FLG ;
   private String[] T00104_A584TBM35_CRT_PROG_NM ;
   private boolean[] T00104_n584TBM35_CRT_PROG_NM ;
   private String[] T00104_A587TBM35_UPD_PROG_NM ;
   private boolean[] T00104_n587TBM35_UPD_PROG_NM ;
   private long[] T00105_A31TBM35_STUDY_ID ;
   private short[] T00105_A32TBM35_CRF_ID ;
   private String[] T00105_A33TBM35_CRF_ITEM_CD ;
   private String[] T00105_A34TBM35_STUDY_AUTH_CD ;
   private long[] T00103_A31TBM35_STUDY_ID ;
   private short[] T00103_A32TBM35_CRF_ID ;
   private String[] T00103_A33TBM35_CRF_ITEM_CD ;
   private String[] T00103_A34TBM35_STUDY_AUTH_CD ;
   private java.util.Date[] T00103_A582TBM35_CRT_DATETIME ;
   private boolean[] T00103_n582TBM35_CRT_DATETIME ;
   private String[] T00103_A583TBM35_CRT_USER_ID ;
   private boolean[] T00103_n583TBM35_CRT_USER_ID ;
   private java.util.Date[] T00103_A585TBM35_UPD_DATETIME ;
   private boolean[] T00103_n585TBM35_UPD_DATETIME ;
   private String[] T00103_A586TBM35_UPD_USER_ID ;
   private boolean[] T00103_n586TBM35_UPD_USER_ID ;
   private long[] T00103_A588TBM35_UPD_CNT ;
   private boolean[] T00103_n588TBM35_UPD_CNT ;
   private String[] T00103_A580TBM35_DISPLAY_FLG ;
   private boolean[] T00103_n580TBM35_DISPLAY_FLG ;
   private String[] T00103_A581TBM35_DEL_FLG ;
   private boolean[] T00103_n581TBM35_DEL_FLG ;
   private String[] T00103_A584TBM35_CRT_PROG_NM ;
   private boolean[] T00103_n584TBM35_CRT_PROG_NM ;
   private String[] T00103_A587TBM35_UPD_PROG_NM ;
   private boolean[] T00103_n587TBM35_UPD_PROG_NM ;
   private long[] T00106_A31TBM35_STUDY_ID ;
   private short[] T00106_A32TBM35_CRF_ID ;
   private String[] T00106_A33TBM35_CRF_ITEM_CD ;
   private String[] T00106_A34TBM35_STUDY_AUTH_CD ;
   private long[] T00107_A31TBM35_STUDY_ID ;
   private short[] T00107_A32TBM35_CRF_ID ;
   private String[] T00107_A33TBM35_CRF_ITEM_CD ;
   private String[] T00107_A34TBM35_STUDY_AUTH_CD ;
   private long[] T00102_A31TBM35_STUDY_ID ;
   private short[] T00102_A32TBM35_CRF_ID ;
   private String[] T00102_A33TBM35_CRF_ITEM_CD ;
   private String[] T00102_A34TBM35_STUDY_AUTH_CD ;
   private java.util.Date[] T00102_A582TBM35_CRT_DATETIME ;
   private boolean[] T00102_n582TBM35_CRT_DATETIME ;
   private String[] T00102_A583TBM35_CRT_USER_ID ;
   private boolean[] T00102_n583TBM35_CRT_USER_ID ;
   private java.util.Date[] T00102_A585TBM35_UPD_DATETIME ;
   private boolean[] T00102_n585TBM35_UPD_DATETIME ;
   private String[] T00102_A586TBM35_UPD_USER_ID ;
   private boolean[] T00102_n586TBM35_UPD_USER_ID ;
   private long[] T00102_A588TBM35_UPD_CNT ;
   private boolean[] T00102_n588TBM35_UPD_CNT ;
   private String[] T00102_A580TBM35_DISPLAY_FLG ;
   private boolean[] T00102_n580TBM35_DISPLAY_FLG ;
   private String[] T00102_A581TBM35_DEL_FLG ;
   private boolean[] T00102_n581TBM35_DEL_FLG ;
   private String[] T00102_A584TBM35_CRT_PROG_NM ;
   private boolean[] T00102_n584TBM35_CRT_PROG_NM ;
   private String[] T00102_A587TBM35_UPD_PROG_NM ;
   private boolean[] T00102_n587TBM35_UPD_PROG_NM ;
   private long[] T001011_A31TBM35_STUDY_ID ;
   private short[] T001011_A32TBM35_CRF_ID ;
   private String[] T001011_A33TBM35_CRF_ITEM_CD ;
   private String[] T001011_A34TBM35_STUDY_AUTH_CD ;
}

final  class tbm35_crf_item_auth__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00102", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`, `TBM35_CRT_DATETIME`, `TBM35_CRT_USER_ID`, `TBM35_UPD_DATETIME`, `TBM35_UPD_USER_ID`, `TBM35_UPD_CNT`, `TBM35_DISPLAY_FLG`, `TBM35_DEL_FLG`, `TBM35_CRT_PROG_NM`, `TBM35_UPD_PROG_NM` FROM `TBM35_CRF_ITEM_AUTH` WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00103", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`, `TBM35_CRT_DATETIME`, `TBM35_CRT_USER_ID`, `TBM35_UPD_DATETIME`, `TBM35_UPD_USER_ID`, `TBM35_UPD_CNT`, `TBM35_DISPLAY_FLG`, `TBM35_DEL_FLG`, `TBM35_CRT_PROG_NM`, `TBM35_UPD_PROG_NM` FROM `TBM35_CRF_ITEM_AUTH` WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00104", "SELECT TM1.`TBM35_STUDY_ID`, TM1.`TBM35_CRF_ID`, TM1.`TBM35_CRF_ITEM_CD`, TM1.`TBM35_STUDY_AUTH_CD`, TM1.`TBM35_CRT_DATETIME`, TM1.`TBM35_CRT_USER_ID`, TM1.`TBM35_UPD_DATETIME`, TM1.`TBM35_UPD_USER_ID`, TM1.`TBM35_UPD_CNT`, TM1.`TBM35_DISPLAY_FLG`, TM1.`TBM35_DEL_FLG`, TM1.`TBM35_CRT_PROG_NM`, TM1.`TBM35_UPD_PROG_NM` FROM `TBM35_CRF_ITEM_AUTH` TM1 WHERE TM1.`TBM35_STUDY_ID` = ? and TM1.`TBM35_CRF_ID` = ? and TM1.`TBM35_CRF_ITEM_CD` = ? and TM1.`TBM35_STUDY_AUTH_CD` = ? ORDER BY TM1.`TBM35_STUDY_ID`, TM1.`TBM35_CRF_ID`, TM1.`TBM35_CRF_ITEM_CD`, TM1.`TBM35_STUDY_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00105", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD` FROM `TBM35_CRF_ITEM_AUTH` WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00106", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD` FROM `TBM35_CRF_ITEM_AUTH` WHERE ( `TBM35_STUDY_ID` > ? or `TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` > ? or `TBM35_CRF_ID` = ? and `TBM35_STUDY_ID` = ? and `TBM35_CRF_ITEM_CD` > ? or `TBM35_CRF_ITEM_CD` = ? and `TBM35_CRF_ID` = ? and `TBM35_STUDY_ID` = ? and `TBM35_STUDY_AUTH_CD` > ?) ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00107", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD` FROM `TBM35_CRF_ITEM_AUTH` WHERE ( `TBM35_STUDY_ID` < ? or `TBM35_STUDY_ID` = ? and `TBM35_CRF_ID` < ? or `TBM35_CRF_ID` = ? and `TBM35_STUDY_ID` = ? and `TBM35_CRF_ITEM_CD` < ? or `TBM35_CRF_ITEM_CD` = ? and `TBM35_CRF_ID` = ? and `TBM35_STUDY_ID` = ? and `TBM35_STUDY_AUTH_CD` < ?) ORDER BY `TBM35_STUDY_ID` DESC, `TBM35_CRF_ID` DESC, `TBM35_CRF_ITEM_CD` DESC, `TBM35_STUDY_AUTH_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00108", "INSERT INTO `TBM35_CRF_ITEM_AUTH`(`TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD`, `TBM35_CRT_DATETIME`, `TBM35_CRT_USER_ID`, `TBM35_UPD_DATETIME`, `TBM35_UPD_USER_ID`, `TBM35_UPD_CNT`, `TBM35_DISPLAY_FLG`, `TBM35_DEL_FLG`, `TBM35_CRT_PROG_NM`, `TBM35_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00109", "UPDATE `TBM35_CRF_ITEM_AUTH` SET `TBM35_CRT_DATETIME`=?, `TBM35_CRT_USER_ID`=?, `TBM35_UPD_DATETIME`=?, `TBM35_UPD_USER_ID`=?, `TBM35_UPD_CNT`=?, `TBM35_DISPLAY_FLG`=?, `TBM35_DEL_FLG`=?, `TBM35_CRT_PROG_NM`=?, `TBM35_UPD_PROG_NM`=?  WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T001010", "DELETE FROM `TBM35_CRF_ITEM_AUTH`  WHERE `TBM35_STUDY_ID` = ? AND `TBM35_CRF_ID` = ? AND `TBM35_CRF_ITEM_CD` = ? AND `TBM35_STUDY_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T001011", "SELECT `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD` FROM `TBM35_CRF_ITEM_AUTH` ORDER BY `TBM35_STUDY_ID`, `TBM35_CRF_ID`, `TBM35_CRF_ITEM_CD`, `TBM35_STUDY_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
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
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setVarchar(10, (String)parms[9], 2, false);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setVarchar(10, (String)parms[9], 2, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 1);
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
                  stmt.setVarchar(8, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 40);
               }
               stmt.setLong(10, ((Number) parms[18]).longValue());
               stmt.setShort(11, ((Number) parms[19]).shortValue());
               stmt.setVarchar(12, (String)parms[20], 50, false);
               stmt.setVarchar(13, (String)parms[21], 2, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 50, false);
               stmt.setVarchar(4, (String)parms[3], 2, false);
               return;
      }
   }

}

