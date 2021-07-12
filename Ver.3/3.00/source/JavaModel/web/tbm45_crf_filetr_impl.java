/*
               File: tbm45_crf_filetr_impl
        Description: CRFフィルターマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:22:23.36
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm45_crf_filetr_impl extends GXWebPanel
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
         Form.getMeta().addItem("description", "CRFフィルターマスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm45_crf_filetr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm45_crf_filetr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm45_crf_filetr_impl.class ));
   }

   public tbm45_crf_filetr_impl( int remoteHandle ,
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
         wb_table1_2_1N65( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1N65e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1N65( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1N65( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1N65( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1N65e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRFフィルターマスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM45_CRF_FILETR.htm");
         wb_table3_28_1N65( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1N65e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1N65e( true) ;
      }
      else
      {
         wb_table1_2_1N65e( false) ;
      }
   }

   public void wb_table3_28_1N65( boolean wbgen )
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
         wb_table4_34_1N65( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1N65e( boolean wbgen )
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
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM45_CRF_FILETR.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM45_CRF_FILETR.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1N65e( true) ;
      }
      else
      {
         wb_table3_28_1N65e( false) ;
      }
   }

   public void wb_table4_34_1N65( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_study_id_Internalname, "ID", "", "", lblTextblocktbm45_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM45_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A977TBM45_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM45_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A977TBM45_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A977TBM45_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM45_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM45_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_filter_no_Internalname, "フィルター番号", "", "", lblTextblocktbm45_filter_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM45_FILTER_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A978TBM45_FILTER_NO, (byte)(4), (byte)(0), ".", "")), ((edtTBM45_FILTER_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A978TBM45_FILTER_NO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A978TBM45_FILTER_NO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM45_FILTER_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM45_FILTER_NO_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_filetr_nm_Internalname, "フィルター名", "", "", lblTextblocktbm45_filetr_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM45_FILETR_NM_Internalname, GXutil.rtrim( A980TBM45_FILETR_NM), GXutil.rtrim( localUtil.format( A980TBM45_FILETR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM45_FILETR_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM45_FILETR_NM_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_in_crf_id_Internalname, "IN条件用）　※ C712_SD10に対応", "", "", lblTextblocktbm45_in_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM45_IN_CRF_ID_Internalname, GXutil.rtrim( A981TBM45_IN_CRF_ID), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", (short)(0), 1, edtTBM45_IN_CRF_ID_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm45_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM45_DEL_FLG_Internalname, GXutil.rtrim( A982TBM45_DEL_FLG), GXutil.rtrim( localUtil.format( A982TBM45_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM45_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM45_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm45_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM45_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM45_CRT_DATETIME_Internalname, localUtil.format(A983TBM45_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A983TBM45_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM45_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM45_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM45_CRF_FILETR.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM45_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM45_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_crt_user_id_Internalname, "ID", "", "", lblTextblocktbm45_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM45_CRT_USER_ID_Internalname, GXutil.rtrim( A984TBM45_CRT_USER_ID), GXutil.rtrim( localUtil.format( A984TBM45_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM45_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM45_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm45_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM45_CRT_PROG_NM_Internalname, GXutil.rtrim( A985TBM45_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A985TBM45_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM45_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM45_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm45_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM45_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM45_UPD_DATETIME_Internalname, localUtil.format(A986TBM45_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A986TBM45_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM45_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM45_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM45_CRF_FILETR.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM45_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM45_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_upd_user_id_Internalname, "ID", "", "", lblTextblocktbm45_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM45_UPD_USER_ID_Internalname, GXutil.rtrim( A987TBM45_UPD_USER_ID), GXutil.rtrim( localUtil.format( A987TBM45_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM45_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM45_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm45_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM45_UPD_PROG_NM_Internalname, GXutil.rtrim( A988TBM45_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A988TBM45_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM45_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM45_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm45_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm45_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM45_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A989TBM45_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM45_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A989TBM45_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A989TBM45_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM45_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM45_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM45_CRF_FILETR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1N65e( true) ;
      }
      else
      {
         wb_table4_34_1N65e( false) ;
      }
   }

   public void wb_table2_5_1N65( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM45_CRF_FILETR.htm");
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
         wb_table2_5_1N65e( true) ;
      }
      else
      {
         wb_table2_5_1N65e( false) ;
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
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM45_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM45_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM45_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A977TBM45_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
            }
            else
            {
               A977TBM45_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM45_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM45_FILTER_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM45_FILTER_NO_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM45_FILTER_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM45_FILTER_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A978TBM45_FILTER_NO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
            }
            else
            {
               A978TBM45_FILTER_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM45_FILTER_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
            }
            A980TBM45_FILETR_NM = httpContext.cgiGet( edtTBM45_FILETR_NM_Internalname) ;
            n980TBM45_FILETR_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A980TBM45_FILETR_NM", A980TBM45_FILETR_NM);
            n980TBM45_FILETR_NM = ((GXutil.strcmp("", A980TBM45_FILETR_NM)==0) ? true : false) ;
            A981TBM45_IN_CRF_ID = httpContext.cgiGet( edtTBM45_IN_CRF_ID_Internalname) ;
            n981TBM45_IN_CRF_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A981TBM45_IN_CRF_ID", A981TBM45_IN_CRF_ID);
            n981TBM45_IN_CRF_ID = ((GXutil.strcmp("", A981TBM45_IN_CRF_ID)==0) ? true : false) ;
            A982TBM45_DEL_FLG = httpContext.cgiGet( edtTBM45_DEL_FLG_Internalname) ;
            n982TBM45_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A982TBM45_DEL_FLG", A982TBM45_DEL_FLG);
            n982TBM45_DEL_FLG = ((GXutil.strcmp("", A982TBM45_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM45_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM45_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM45_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A983TBM45_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n983TBM45_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A983TBM45_CRT_DATETIME", localUtil.ttoc( A983TBM45_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A983TBM45_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM45_CRT_DATETIME_Internalname)) ;
               n983TBM45_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A983TBM45_CRT_DATETIME", localUtil.ttoc( A983TBM45_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n983TBM45_CRT_DATETIME = (GXutil.nullDate().equals(A983TBM45_CRT_DATETIME) ? true : false) ;
            A984TBM45_CRT_USER_ID = httpContext.cgiGet( edtTBM45_CRT_USER_ID_Internalname) ;
            n984TBM45_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A984TBM45_CRT_USER_ID", A984TBM45_CRT_USER_ID);
            n984TBM45_CRT_USER_ID = ((GXutil.strcmp("", A984TBM45_CRT_USER_ID)==0) ? true : false) ;
            A985TBM45_CRT_PROG_NM = httpContext.cgiGet( edtTBM45_CRT_PROG_NM_Internalname) ;
            n985TBM45_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A985TBM45_CRT_PROG_NM", A985TBM45_CRT_PROG_NM);
            n985TBM45_CRT_PROG_NM = ((GXutil.strcmp("", A985TBM45_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM45_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM45_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM45_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A986TBM45_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n986TBM45_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A986TBM45_UPD_DATETIME", localUtil.ttoc( A986TBM45_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A986TBM45_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM45_UPD_DATETIME_Internalname)) ;
               n986TBM45_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A986TBM45_UPD_DATETIME", localUtil.ttoc( A986TBM45_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n986TBM45_UPD_DATETIME = (GXutil.nullDate().equals(A986TBM45_UPD_DATETIME) ? true : false) ;
            A987TBM45_UPD_USER_ID = httpContext.cgiGet( edtTBM45_UPD_USER_ID_Internalname) ;
            n987TBM45_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A987TBM45_UPD_USER_ID", A987TBM45_UPD_USER_ID);
            n987TBM45_UPD_USER_ID = ((GXutil.strcmp("", A987TBM45_UPD_USER_ID)==0) ? true : false) ;
            A988TBM45_UPD_PROG_NM = httpContext.cgiGet( edtTBM45_UPD_PROG_NM_Internalname) ;
            n988TBM45_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A988TBM45_UPD_PROG_NM", A988TBM45_UPD_PROG_NM);
            n988TBM45_UPD_PROG_NM = ((GXutil.strcmp("", A988TBM45_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM45_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM45_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM45_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM45_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A989TBM45_UPD_CNT = 0 ;
               n989TBM45_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A989TBM45_UPD_CNT", GXutil.ltrim( GXutil.str( A989TBM45_UPD_CNT, 10, 0)));
            }
            else
            {
               A989TBM45_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM45_UPD_CNT_Internalname), ".", ",") ;
               n989TBM45_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A989TBM45_UPD_CNT", GXutil.ltrim( GXutil.str( A989TBM45_UPD_CNT, 10, 0)));
            }
            n989TBM45_UPD_CNT = ((0==A989TBM45_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z977TBM45_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z977TBM45_STUDY_ID"), ".", ",") ;
            Z978TBM45_FILTER_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z978TBM45_FILTER_NO"), ".", ",")) ;
            Z980TBM45_FILETR_NM = httpContext.cgiGet( "Z980TBM45_FILETR_NM") ;
            n980TBM45_FILETR_NM = ((GXutil.strcmp("", A980TBM45_FILETR_NM)==0) ? true : false) ;
            Z981TBM45_IN_CRF_ID = httpContext.cgiGet( "Z981TBM45_IN_CRF_ID") ;
            n981TBM45_IN_CRF_ID = ((GXutil.strcmp("", A981TBM45_IN_CRF_ID)==0) ? true : false) ;
            Z982TBM45_DEL_FLG = httpContext.cgiGet( "Z982TBM45_DEL_FLG") ;
            n982TBM45_DEL_FLG = ((GXutil.strcmp("", A982TBM45_DEL_FLG)==0) ? true : false) ;
            Z983TBM45_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z983TBM45_CRT_DATETIME"), 0) ;
            n983TBM45_CRT_DATETIME = (GXutil.nullDate().equals(A983TBM45_CRT_DATETIME) ? true : false) ;
            Z984TBM45_CRT_USER_ID = httpContext.cgiGet( "Z984TBM45_CRT_USER_ID") ;
            n984TBM45_CRT_USER_ID = ((GXutil.strcmp("", A984TBM45_CRT_USER_ID)==0) ? true : false) ;
            Z985TBM45_CRT_PROG_NM = httpContext.cgiGet( "Z985TBM45_CRT_PROG_NM") ;
            n985TBM45_CRT_PROG_NM = ((GXutil.strcmp("", A985TBM45_CRT_PROG_NM)==0) ? true : false) ;
            Z986TBM45_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z986TBM45_UPD_DATETIME"), 0) ;
            n986TBM45_UPD_DATETIME = (GXutil.nullDate().equals(A986TBM45_UPD_DATETIME) ? true : false) ;
            Z987TBM45_UPD_USER_ID = httpContext.cgiGet( "Z987TBM45_UPD_USER_ID") ;
            n987TBM45_UPD_USER_ID = ((GXutil.strcmp("", A987TBM45_UPD_USER_ID)==0) ? true : false) ;
            Z988TBM45_UPD_PROG_NM = httpContext.cgiGet( "Z988TBM45_UPD_PROG_NM") ;
            n988TBM45_UPD_PROG_NM = ((GXutil.strcmp("", A988TBM45_UPD_PROG_NM)==0) ? true : false) ;
            Z989TBM45_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z989TBM45_UPD_CNT"), ".", ",") ;
            n989TBM45_UPD_CNT = ((0==A989TBM45_UPD_CNT) ? true : false) ;
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
               A977TBM45_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
               A978TBM45_FILTER_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
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
            initAll1N65( ) ;
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
      disableAttributes1N65( ) ;
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

   public void resetCaption1N0( )
   {
   }

   public void zm1N65( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z980TBM45_FILETR_NM = T001N3_A980TBM45_FILETR_NM[0] ;
            Z981TBM45_IN_CRF_ID = T001N3_A981TBM45_IN_CRF_ID[0] ;
            Z982TBM45_DEL_FLG = T001N3_A982TBM45_DEL_FLG[0] ;
            Z983TBM45_CRT_DATETIME = T001N3_A983TBM45_CRT_DATETIME[0] ;
            Z984TBM45_CRT_USER_ID = T001N3_A984TBM45_CRT_USER_ID[0] ;
            Z985TBM45_CRT_PROG_NM = T001N3_A985TBM45_CRT_PROG_NM[0] ;
            Z986TBM45_UPD_DATETIME = T001N3_A986TBM45_UPD_DATETIME[0] ;
            Z987TBM45_UPD_USER_ID = T001N3_A987TBM45_UPD_USER_ID[0] ;
            Z988TBM45_UPD_PROG_NM = T001N3_A988TBM45_UPD_PROG_NM[0] ;
            Z989TBM45_UPD_CNT = T001N3_A989TBM45_UPD_CNT[0] ;
         }
         else
         {
            Z980TBM45_FILETR_NM = A980TBM45_FILETR_NM ;
            Z981TBM45_IN_CRF_ID = A981TBM45_IN_CRF_ID ;
            Z982TBM45_DEL_FLG = A982TBM45_DEL_FLG ;
            Z983TBM45_CRT_DATETIME = A983TBM45_CRT_DATETIME ;
            Z984TBM45_CRT_USER_ID = A984TBM45_CRT_USER_ID ;
            Z985TBM45_CRT_PROG_NM = A985TBM45_CRT_PROG_NM ;
            Z986TBM45_UPD_DATETIME = A986TBM45_UPD_DATETIME ;
            Z987TBM45_UPD_USER_ID = A987TBM45_UPD_USER_ID ;
            Z988TBM45_UPD_PROG_NM = A988TBM45_UPD_PROG_NM ;
            Z989TBM45_UPD_CNT = A989TBM45_UPD_CNT ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z977TBM45_STUDY_ID = A977TBM45_STUDY_ID ;
         Z978TBM45_FILTER_NO = A978TBM45_FILTER_NO ;
         Z980TBM45_FILETR_NM = A980TBM45_FILETR_NM ;
         Z981TBM45_IN_CRF_ID = A981TBM45_IN_CRF_ID ;
         Z982TBM45_DEL_FLG = A982TBM45_DEL_FLG ;
         Z983TBM45_CRT_DATETIME = A983TBM45_CRT_DATETIME ;
         Z984TBM45_CRT_USER_ID = A984TBM45_CRT_USER_ID ;
         Z985TBM45_CRT_PROG_NM = A985TBM45_CRT_PROG_NM ;
         Z986TBM45_UPD_DATETIME = A986TBM45_UPD_DATETIME ;
         Z987TBM45_UPD_USER_ID = A987TBM45_UPD_USER_ID ;
         Z988TBM45_UPD_PROG_NM = A988TBM45_UPD_PROG_NM ;
         Z989TBM45_UPD_CNT = A989TBM45_UPD_CNT ;
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

   public void load1N65( )
   {
      /* Using cursor T001N4 */
      pr_default.execute(2, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A980TBM45_FILETR_NM = T001N4_A980TBM45_FILETR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A980TBM45_FILETR_NM", A980TBM45_FILETR_NM);
         n980TBM45_FILETR_NM = T001N4_n980TBM45_FILETR_NM[0] ;
         A981TBM45_IN_CRF_ID = T001N4_A981TBM45_IN_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A981TBM45_IN_CRF_ID", A981TBM45_IN_CRF_ID);
         n981TBM45_IN_CRF_ID = T001N4_n981TBM45_IN_CRF_ID[0] ;
         A982TBM45_DEL_FLG = T001N4_A982TBM45_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A982TBM45_DEL_FLG", A982TBM45_DEL_FLG);
         n982TBM45_DEL_FLG = T001N4_n982TBM45_DEL_FLG[0] ;
         A983TBM45_CRT_DATETIME = T001N4_A983TBM45_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A983TBM45_CRT_DATETIME", localUtil.ttoc( A983TBM45_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n983TBM45_CRT_DATETIME = T001N4_n983TBM45_CRT_DATETIME[0] ;
         A984TBM45_CRT_USER_ID = T001N4_A984TBM45_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A984TBM45_CRT_USER_ID", A984TBM45_CRT_USER_ID);
         n984TBM45_CRT_USER_ID = T001N4_n984TBM45_CRT_USER_ID[0] ;
         A985TBM45_CRT_PROG_NM = T001N4_A985TBM45_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A985TBM45_CRT_PROG_NM", A985TBM45_CRT_PROG_NM);
         n985TBM45_CRT_PROG_NM = T001N4_n985TBM45_CRT_PROG_NM[0] ;
         A986TBM45_UPD_DATETIME = T001N4_A986TBM45_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A986TBM45_UPD_DATETIME", localUtil.ttoc( A986TBM45_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n986TBM45_UPD_DATETIME = T001N4_n986TBM45_UPD_DATETIME[0] ;
         A987TBM45_UPD_USER_ID = T001N4_A987TBM45_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A987TBM45_UPD_USER_ID", A987TBM45_UPD_USER_ID);
         n987TBM45_UPD_USER_ID = T001N4_n987TBM45_UPD_USER_ID[0] ;
         A988TBM45_UPD_PROG_NM = T001N4_A988TBM45_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A988TBM45_UPD_PROG_NM", A988TBM45_UPD_PROG_NM);
         n988TBM45_UPD_PROG_NM = T001N4_n988TBM45_UPD_PROG_NM[0] ;
         A989TBM45_UPD_CNT = T001N4_A989TBM45_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A989TBM45_UPD_CNT", GXutil.ltrim( GXutil.str( A989TBM45_UPD_CNT, 10, 0)));
         n989TBM45_UPD_CNT = T001N4_n989TBM45_UPD_CNT[0] ;
         zm1N65( -3) ;
      }
      pr_default.close(2);
      onLoadActions1N65( ) ;
   }

   public void onLoadActions1N65( )
   {
   }

   public void checkExtendedTable1N65( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.nullDate().equals(A983TBM45_CRT_DATETIME) || (( A983TBM45_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A983TBM45_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM45_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM45_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A986TBM45_UPD_DATETIME) || (( A986TBM45_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A986TBM45_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM45_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM45_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1N65( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1N65( )
   {
      /* Using cursor T001N5 */
      pr_default.execute(3, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound65 = (short)(1) ;
      }
      else
      {
         RcdFound65 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001N3 */
      pr_default.execute(1, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1N65( 3) ;
         RcdFound65 = (short)(1) ;
         A977TBM45_STUDY_ID = T001N3_A977TBM45_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
         A978TBM45_FILTER_NO = T001N3_A978TBM45_FILTER_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
         A980TBM45_FILETR_NM = T001N3_A980TBM45_FILETR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A980TBM45_FILETR_NM", A980TBM45_FILETR_NM);
         n980TBM45_FILETR_NM = T001N3_n980TBM45_FILETR_NM[0] ;
         A981TBM45_IN_CRF_ID = T001N3_A981TBM45_IN_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A981TBM45_IN_CRF_ID", A981TBM45_IN_CRF_ID);
         n981TBM45_IN_CRF_ID = T001N3_n981TBM45_IN_CRF_ID[0] ;
         A982TBM45_DEL_FLG = T001N3_A982TBM45_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A982TBM45_DEL_FLG", A982TBM45_DEL_FLG);
         n982TBM45_DEL_FLG = T001N3_n982TBM45_DEL_FLG[0] ;
         A983TBM45_CRT_DATETIME = T001N3_A983TBM45_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A983TBM45_CRT_DATETIME", localUtil.ttoc( A983TBM45_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n983TBM45_CRT_DATETIME = T001N3_n983TBM45_CRT_DATETIME[0] ;
         A984TBM45_CRT_USER_ID = T001N3_A984TBM45_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A984TBM45_CRT_USER_ID", A984TBM45_CRT_USER_ID);
         n984TBM45_CRT_USER_ID = T001N3_n984TBM45_CRT_USER_ID[0] ;
         A985TBM45_CRT_PROG_NM = T001N3_A985TBM45_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A985TBM45_CRT_PROG_NM", A985TBM45_CRT_PROG_NM);
         n985TBM45_CRT_PROG_NM = T001N3_n985TBM45_CRT_PROG_NM[0] ;
         A986TBM45_UPD_DATETIME = T001N3_A986TBM45_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A986TBM45_UPD_DATETIME", localUtil.ttoc( A986TBM45_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n986TBM45_UPD_DATETIME = T001N3_n986TBM45_UPD_DATETIME[0] ;
         A987TBM45_UPD_USER_ID = T001N3_A987TBM45_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A987TBM45_UPD_USER_ID", A987TBM45_UPD_USER_ID);
         n987TBM45_UPD_USER_ID = T001N3_n987TBM45_UPD_USER_ID[0] ;
         A988TBM45_UPD_PROG_NM = T001N3_A988TBM45_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A988TBM45_UPD_PROG_NM", A988TBM45_UPD_PROG_NM);
         n988TBM45_UPD_PROG_NM = T001N3_n988TBM45_UPD_PROG_NM[0] ;
         A989TBM45_UPD_CNT = T001N3_A989TBM45_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A989TBM45_UPD_CNT", GXutil.ltrim( GXutil.str( A989TBM45_UPD_CNT, 10, 0)));
         n989TBM45_UPD_CNT = T001N3_n989TBM45_UPD_CNT[0] ;
         Z977TBM45_STUDY_ID = A977TBM45_STUDY_ID ;
         Z978TBM45_FILTER_NO = A978TBM45_FILTER_NO ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1N65( ) ;
         if ( AnyError == 1 )
         {
            RcdFound65 = (short)(0) ;
            initializeNonKey1N65( ) ;
         }
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound65 = (short)(0) ;
         initializeNonKey1N65( ) ;
         sMode65 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode65 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1N65( ) ;
      if ( RcdFound65 == 0 )
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
      RcdFound65 = (short)(0) ;
      /* Using cursor T001N6 */
      pr_default.execute(4, new Object[] {new Long(A977TBM45_STUDY_ID), new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001N6_A977TBM45_STUDY_ID[0] < A977TBM45_STUDY_ID ) || ( T001N6_A977TBM45_STUDY_ID[0] == A977TBM45_STUDY_ID ) && ( T001N6_A978TBM45_FILTER_NO[0] < A978TBM45_FILTER_NO ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001N6_A977TBM45_STUDY_ID[0] > A977TBM45_STUDY_ID ) || ( T001N6_A977TBM45_STUDY_ID[0] == A977TBM45_STUDY_ID ) && ( T001N6_A978TBM45_FILTER_NO[0] > A978TBM45_FILTER_NO ) ) )
         {
            A977TBM45_STUDY_ID = T001N6_A977TBM45_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
            A978TBM45_FILTER_NO = T001N6_A978TBM45_FILTER_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound65 = (short)(0) ;
      /* Using cursor T001N7 */
      pr_default.execute(5, new Object[] {new Long(A977TBM45_STUDY_ID), new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001N7_A977TBM45_STUDY_ID[0] > A977TBM45_STUDY_ID ) || ( T001N7_A977TBM45_STUDY_ID[0] == A977TBM45_STUDY_ID ) && ( T001N7_A978TBM45_FILTER_NO[0] > A978TBM45_FILTER_NO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001N7_A977TBM45_STUDY_ID[0] < A977TBM45_STUDY_ID ) || ( T001N7_A977TBM45_STUDY_ID[0] == A977TBM45_STUDY_ID ) && ( T001N7_A978TBM45_FILTER_NO[0] < A978TBM45_FILTER_NO ) ) )
         {
            A977TBM45_STUDY_ID = T001N7_A977TBM45_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
            A978TBM45_FILTER_NO = T001N7_A978TBM45_FILTER_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
            RcdFound65 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1N65( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1N65( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound65 == 1 )
         {
            if ( ( A977TBM45_STUDY_ID != Z977TBM45_STUDY_ID ) || ( A978TBM45_FILTER_NO != Z978TBM45_FILTER_NO ) )
            {
               A977TBM45_STUDY_ID = Z977TBM45_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
               A978TBM45_FILTER_NO = Z978TBM45_FILTER_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM45_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1N65( ) ;
               GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A977TBM45_STUDY_ID != Z977TBM45_STUDY_ID ) || ( A978TBM45_FILTER_NO != Z978TBM45_FILTER_NO ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1N65( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM45_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1N65( ) ;
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
      if ( ( A977TBM45_STUDY_ID != Z977TBM45_STUDY_ID ) || ( A978TBM45_FILTER_NO != Z978TBM45_FILTER_NO ) )
      {
         A977TBM45_STUDY_ID = Z977TBM45_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
         A978TBM45_FILTER_NO = Z978TBM45_FILTER_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM45_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM45_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM45_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM45_FILETR_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1N65( ) ;
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM45_FILETR_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1N65( ) ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM45_FILETR_NM_Internalname ;
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
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM45_FILETR_NM_Internalname ;
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
      scanStart1N65( ) ;
      if ( RcdFound65 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound65 != 0 )
         {
            scanNext1N65( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM45_FILETR_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1N65( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1N65( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001N2 */
         pr_default.execute(0, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM45_CRF_FILETR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z980TBM45_FILETR_NM, T001N2_A980TBM45_FILETR_NM[0]) != 0 ) || ( GXutil.strcmp(Z981TBM45_IN_CRF_ID, T001N2_A981TBM45_IN_CRF_ID[0]) != 0 ) || ( GXutil.strcmp(Z982TBM45_DEL_FLG, T001N2_A982TBM45_DEL_FLG[0]) != 0 ) || !( Z983TBM45_CRT_DATETIME.equals( T001N2_A983TBM45_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z984TBM45_CRT_USER_ID, T001N2_A984TBM45_CRT_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z985TBM45_CRT_PROG_NM, T001N2_A985TBM45_CRT_PROG_NM[0]) != 0 ) || !( Z986TBM45_UPD_DATETIME.equals( T001N2_A986TBM45_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z987TBM45_UPD_USER_ID, T001N2_A987TBM45_UPD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z988TBM45_UPD_PROG_NM, T001N2_A988TBM45_UPD_PROG_NM[0]) != 0 ) || ( Z989TBM45_UPD_CNT != T001N2_A989TBM45_UPD_CNT[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM45_CRF_FILETR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1N65( )
   {
      beforeValidate1N65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N65( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1N65( 0) ;
         checkOptimisticConcurrency1N65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N65( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1N65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001N8 */
                  pr_default.execute(6, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO), new Boolean(n980TBM45_FILETR_NM), A980TBM45_FILETR_NM, new Boolean(n981TBM45_IN_CRF_ID), A981TBM45_IN_CRF_ID, new Boolean(n982TBM45_DEL_FLG), A982TBM45_DEL_FLG, new Boolean(n983TBM45_CRT_DATETIME), A983TBM45_CRT_DATETIME, new Boolean(n984TBM45_CRT_USER_ID), A984TBM45_CRT_USER_ID, new Boolean(n985TBM45_CRT_PROG_NM), A985TBM45_CRT_PROG_NM, new Boolean(n986TBM45_UPD_DATETIME), A986TBM45_UPD_DATETIME, new Boolean(n987TBM45_UPD_USER_ID), A987TBM45_UPD_USER_ID, new Boolean(n988TBM45_UPD_PROG_NM), A988TBM45_UPD_PROG_NM, new Boolean(n989TBM45_UPD_CNT), new Long(A989TBM45_UPD_CNT)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
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
                        resetCaption1N0( ) ;
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
            load1N65( ) ;
         }
         endLevel1N65( ) ;
      }
      closeExtendedTableCursors1N65( ) ;
   }

   public void update1N65( )
   {
      beforeValidate1N65( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1N65( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N65( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1N65( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1N65( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001N9 */
                  pr_default.execute(7, new Object[] {new Boolean(n980TBM45_FILETR_NM), A980TBM45_FILETR_NM, new Boolean(n981TBM45_IN_CRF_ID), A981TBM45_IN_CRF_ID, new Boolean(n982TBM45_DEL_FLG), A982TBM45_DEL_FLG, new Boolean(n983TBM45_CRT_DATETIME), A983TBM45_CRT_DATETIME, new Boolean(n984TBM45_CRT_USER_ID), A984TBM45_CRT_USER_ID, new Boolean(n985TBM45_CRT_PROG_NM), A985TBM45_CRT_PROG_NM, new Boolean(n986TBM45_UPD_DATETIME), A986TBM45_UPD_DATETIME, new Boolean(n987TBM45_UPD_USER_ID), A987TBM45_UPD_USER_ID, new Boolean(n988TBM45_UPD_PROG_NM), A988TBM45_UPD_PROG_NM, new Boolean(n989TBM45_UPD_CNT), new Long(A989TBM45_UPD_CNT), new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM45_CRF_FILETR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1N65( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption1N0( ) ;
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
         endLevel1N65( ) ;
      }
      closeExtendedTableCursors1N65( ) ;
   }

   public void deferredUpdate1N65( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1N65( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1N65( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1N65( ) ;
         afterConfirm1N65( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1N65( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001N10 */
               pr_default.execute(8, new Object[] {new Long(A977TBM45_STUDY_ID), new Short(A978TBM45_FILTER_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM45_CRF_FILETR") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound65 == 0 )
                     {
                        initAll1N65( ) ;
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
                     resetCaption1N0( ) ;
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
      sMode65 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1N65( ) ;
      Gx_mode = sMode65 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1N65( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1N65( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1N65( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm45_crf_filetr");
         if ( AnyError == 0 )
         {
            confirmValues1N0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm45_crf_filetr");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1N65( )
   {
      /* Using cursor T001N11 */
      pr_default.execute(9);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A977TBM45_STUDY_ID = T001N11_A977TBM45_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
         A978TBM45_FILTER_NO = T001N11_A978TBM45_FILTER_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1N65( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound65 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound65 = (short)(1) ;
         A977TBM45_STUDY_ID = T001N11_A977TBM45_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
         A978TBM45_FILTER_NO = T001N11_A978TBM45_FILTER_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
      }
   }

   public void scanEnd1N65( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1N65( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1N65( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1N65( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1N65( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1N65( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1N65( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1N65( )
   {
      edtTBM45_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_STUDY_ID_Enabled, 5, 0)));
      edtTBM45_FILTER_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_FILTER_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_FILTER_NO_Enabled, 5, 0)));
      edtTBM45_FILETR_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_FILETR_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_FILETR_NM_Enabled, 5, 0)));
      edtTBM45_IN_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_IN_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_IN_CRF_ID_Enabled, 5, 0)));
      edtTBM45_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_DEL_FLG_Enabled, 5, 0)));
      edtTBM45_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM45_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM45_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM45_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM45_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM45_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM45_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM45_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM45_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1N0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRFフィルターマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513222429");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm45_crf_filetr") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1N65( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z977TBM45_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z977TBM45_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z978TBM45_FILTER_NO", GXutil.ltrim( localUtil.ntoc( Z978TBM45_FILTER_NO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z980TBM45_FILETR_NM", GXutil.rtrim( Z980TBM45_FILETR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z981TBM45_IN_CRF_ID", GXutil.rtrim( Z981TBM45_IN_CRF_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z982TBM45_DEL_FLG", GXutil.rtrim( Z982TBM45_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z983TBM45_CRT_DATETIME", localUtil.ttoc( Z983TBM45_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z984TBM45_CRT_USER_ID", GXutil.rtrim( Z984TBM45_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z985TBM45_CRT_PROG_NM", GXutil.rtrim( Z985TBM45_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z986TBM45_UPD_DATETIME", localUtil.ttoc( Z986TBM45_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z987TBM45_UPD_USER_ID", GXutil.rtrim( Z987TBM45_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z988TBM45_UPD_PROG_NM", GXutil.rtrim( Z988TBM45_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z989TBM45_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z989TBM45_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM45_CRF_FILETR" ;
   }

   public String getPgmdesc( )
   {
      return "CRFフィルターマスタ" ;
   }

   public void initializeNonKey1N65( )
   {
      A980TBM45_FILETR_NM = "" ;
      n980TBM45_FILETR_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A980TBM45_FILETR_NM", A980TBM45_FILETR_NM);
      n980TBM45_FILETR_NM = ((GXutil.strcmp("", A980TBM45_FILETR_NM)==0) ? true : false) ;
      A981TBM45_IN_CRF_ID = "" ;
      n981TBM45_IN_CRF_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A981TBM45_IN_CRF_ID", A981TBM45_IN_CRF_ID);
      n981TBM45_IN_CRF_ID = ((GXutil.strcmp("", A981TBM45_IN_CRF_ID)==0) ? true : false) ;
      A982TBM45_DEL_FLG = "" ;
      n982TBM45_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A982TBM45_DEL_FLG", A982TBM45_DEL_FLG);
      n982TBM45_DEL_FLG = ((GXutil.strcmp("", A982TBM45_DEL_FLG)==0) ? true : false) ;
      A983TBM45_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n983TBM45_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A983TBM45_CRT_DATETIME", localUtil.ttoc( A983TBM45_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n983TBM45_CRT_DATETIME = (GXutil.nullDate().equals(A983TBM45_CRT_DATETIME) ? true : false) ;
      A984TBM45_CRT_USER_ID = "" ;
      n984TBM45_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A984TBM45_CRT_USER_ID", A984TBM45_CRT_USER_ID);
      n984TBM45_CRT_USER_ID = ((GXutil.strcmp("", A984TBM45_CRT_USER_ID)==0) ? true : false) ;
      A985TBM45_CRT_PROG_NM = "" ;
      n985TBM45_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A985TBM45_CRT_PROG_NM", A985TBM45_CRT_PROG_NM);
      n985TBM45_CRT_PROG_NM = ((GXutil.strcmp("", A985TBM45_CRT_PROG_NM)==0) ? true : false) ;
      A986TBM45_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n986TBM45_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A986TBM45_UPD_DATETIME", localUtil.ttoc( A986TBM45_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n986TBM45_UPD_DATETIME = (GXutil.nullDate().equals(A986TBM45_UPD_DATETIME) ? true : false) ;
      A987TBM45_UPD_USER_ID = "" ;
      n987TBM45_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A987TBM45_UPD_USER_ID", A987TBM45_UPD_USER_ID);
      n987TBM45_UPD_USER_ID = ((GXutil.strcmp("", A987TBM45_UPD_USER_ID)==0) ? true : false) ;
      A988TBM45_UPD_PROG_NM = "" ;
      n988TBM45_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A988TBM45_UPD_PROG_NM", A988TBM45_UPD_PROG_NM);
      n988TBM45_UPD_PROG_NM = ((GXutil.strcmp("", A988TBM45_UPD_PROG_NM)==0) ? true : false) ;
      A989TBM45_UPD_CNT = 0 ;
      n989TBM45_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A989TBM45_UPD_CNT", GXutil.ltrim( GXutil.str( A989TBM45_UPD_CNT, 10, 0)));
      n989TBM45_UPD_CNT = ((0==A989TBM45_UPD_CNT) ? true : false) ;
   }

   public void initAll1N65( )
   {
      A977TBM45_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A977TBM45_STUDY_ID", GXutil.ltrim( GXutil.str( A977TBM45_STUDY_ID, 10, 0)));
      A978TBM45_FILTER_NO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A978TBM45_FILTER_NO", GXutil.ltrim( GXutil.str( A978TBM45_FILTER_NO, 4, 0)));
      initializeNonKey1N65( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513222434");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm45_crf_filetr.js", "?202071513222434");
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
      lblTextblocktbm45_study_id_Internalname = "TEXTBLOCKTBM45_STUDY_ID" ;
      edtTBM45_STUDY_ID_Internalname = "TBM45_STUDY_ID" ;
      lblTextblocktbm45_filter_no_Internalname = "TEXTBLOCKTBM45_FILTER_NO" ;
      edtTBM45_FILTER_NO_Internalname = "TBM45_FILTER_NO" ;
      lblTextblocktbm45_filetr_nm_Internalname = "TEXTBLOCKTBM45_FILETR_NM" ;
      edtTBM45_FILETR_NM_Internalname = "TBM45_FILETR_NM" ;
      lblTextblocktbm45_in_crf_id_Internalname = "TEXTBLOCKTBM45_IN_CRF_ID" ;
      edtTBM45_IN_CRF_ID_Internalname = "TBM45_IN_CRF_ID" ;
      lblTextblocktbm45_del_flg_Internalname = "TEXTBLOCKTBM45_DEL_FLG" ;
      edtTBM45_DEL_FLG_Internalname = "TBM45_DEL_FLG" ;
      lblTextblocktbm45_crt_datetime_Internalname = "TEXTBLOCKTBM45_CRT_DATETIME" ;
      edtTBM45_CRT_DATETIME_Internalname = "TBM45_CRT_DATETIME" ;
      lblTextblocktbm45_crt_user_id_Internalname = "TEXTBLOCKTBM45_CRT_USER_ID" ;
      edtTBM45_CRT_USER_ID_Internalname = "TBM45_CRT_USER_ID" ;
      lblTextblocktbm45_crt_prog_nm_Internalname = "TEXTBLOCKTBM45_CRT_PROG_NM" ;
      edtTBM45_CRT_PROG_NM_Internalname = "TBM45_CRT_PROG_NM" ;
      lblTextblocktbm45_upd_datetime_Internalname = "TEXTBLOCKTBM45_UPD_DATETIME" ;
      edtTBM45_UPD_DATETIME_Internalname = "TBM45_UPD_DATETIME" ;
      lblTextblocktbm45_upd_user_id_Internalname = "TEXTBLOCKTBM45_UPD_USER_ID" ;
      edtTBM45_UPD_USER_ID_Internalname = "TBM45_UPD_USER_ID" ;
      lblTextblocktbm45_upd_prog_nm_Internalname = "TEXTBLOCKTBM45_UPD_PROG_NM" ;
      edtTBM45_UPD_PROG_NM_Internalname = "TBM45_UPD_PROG_NM" ;
      lblTextblocktbm45_upd_cnt_Internalname = "TEXTBLOCKTBM45_UPD_CNT" ;
      edtTBM45_UPD_CNT_Internalname = "TBM45_UPD_CNT" ;
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
      edtTBM45_UPD_CNT_Jsonclick = "" ;
      edtTBM45_UPD_CNT_Enabled = 1 ;
      edtTBM45_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM45_UPD_PROG_NM_Enabled = 1 ;
      edtTBM45_UPD_USER_ID_Jsonclick = "" ;
      edtTBM45_UPD_USER_ID_Enabled = 1 ;
      edtTBM45_UPD_DATETIME_Jsonclick = "" ;
      edtTBM45_UPD_DATETIME_Enabled = 1 ;
      edtTBM45_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM45_CRT_PROG_NM_Enabled = 1 ;
      edtTBM45_CRT_USER_ID_Jsonclick = "" ;
      edtTBM45_CRT_USER_ID_Enabled = 1 ;
      edtTBM45_CRT_DATETIME_Jsonclick = "" ;
      edtTBM45_CRT_DATETIME_Enabled = 1 ;
      edtTBM45_DEL_FLG_Jsonclick = "" ;
      edtTBM45_DEL_FLG_Enabled = 1 ;
      edtTBM45_IN_CRF_ID_Enabled = 1 ;
      edtTBM45_FILETR_NM_Jsonclick = "" ;
      edtTBM45_FILETR_NM_Enabled = 1 ;
      edtTBM45_FILTER_NO_Jsonclick = "" ;
      edtTBM45_FILTER_NO_Enabled = 1 ;
      edtTBM45_STUDY_ID_Jsonclick = "" ;
      edtTBM45_STUDY_ID_Enabled = 1 ;
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
      GX_FocusControl = edtTBM45_FILETR_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm45_filter_no( long GX_Parm1 ,
                                      short GX_Parm2 ,
                                      String GX_Parm3 ,
                                      String GX_Parm4 ,
                                      String GX_Parm5 ,
                                      java.util.Date GX_Parm6 ,
                                      String GX_Parm7 ,
                                      String GX_Parm8 ,
                                      java.util.Date GX_Parm9 ,
                                      String GX_Parm10 ,
                                      String GX_Parm11 ,
                                      long GX_Parm12 )
   {
      A977TBM45_STUDY_ID = GX_Parm1 ;
      A978TBM45_FILTER_NO = GX_Parm2 ;
      A980TBM45_FILETR_NM = GX_Parm3 ;
      n980TBM45_FILETR_NM = false ;
      A981TBM45_IN_CRF_ID = GX_Parm4 ;
      n981TBM45_IN_CRF_ID = false ;
      A982TBM45_DEL_FLG = GX_Parm5 ;
      n982TBM45_DEL_FLG = false ;
      A983TBM45_CRT_DATETIME = GX_Parm6 ;
      n983TBM45_CRT_DATETIME = false ;
      A984TBM45_CRT_USER_ID = GX_Parm7 ;
      n984TBM45_CRT_USER_ID = false ;
      A985TBM45_CRT_PROG_NM = GX_Parm8 ;
      n985TBM45_CRT_PROG_NM = false ;
      A986TBM45_UPD_DATETIME = GX_Parm9 ;
      n986TBM45_UPD_DATETIME = false ;
      A987TBM45_UPD_USER_ID = GX_Parm10 ;
      n987TBM45_UPD_USER_ID = false ;
      A988TBM45_UPD_PROG_NM = GX_Parm11 ;
      n988TBM45_UPD_PROG_NM = false ;
      A989TBM45_UPD_CNT = GX_Parm12 ;
      n989TBM45_UPD_CNT = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.rtrim( A980TBM45_FILETR_NM));
      isValidOutput.add(GXutil.rtrim( A981TBM45_IN_CRF_ID));
      isValidOutput.add(GXutil.rtrim( A982TBM45_DEL_FLG));
      isValidOutput.add(localUtil.format(A983TBM45_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A984TBM45_CRT_USER_ID));
      isValidOutput.add(GXutil.rtrim( A985TBM45_CRT_PROG_NM));
      isValidOutput.add(localUtil.format(A986TBM45_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A987TBM45_UPD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A988TBM45_UPD_PROG_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A989TBM45_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z977TBM45_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z978TBM45_FILTER_NO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z980TBM45_FILETR_NM));
      isValidOutput.add(GXutil.rtrim( Z981TBM45_IN_CRF_ID));
      isValidOutput.add(GXutil.rtrim( Z982TBM45_DEL_FLG));
      isValidOutput.add(localUtil.ttoc( Z983TBM45_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z984TBM45_CRT_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z985TBM45_CRT_PROG_NM));
      isValidOutput.add(localUtil.ttoc( Z986TBM45_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z987TBM45_UPD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z988TBM45_UPD_PROG_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z989TBM45_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z980TBM45_FILETR_NM = "" ;
      Z981TBM45_IN_CRF_ID = "" ;
      Z982TBM45_DEL_FLG = "" ;
      Z983TBM45_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z984TBM45_CRT_USER_ID = "" ;
      Z985TBM45_CRT_PROG_NM = "" ;
      Z986TBM45_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z987TBM45_UPD_USER_ID = "" ;
      Z988TBM45_UPD_PROG_NM = "" ;
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
      lblTextblocktbm45_study_id_Jsonclick = "" ;
      lblTextblocktbm45_filter_no_Jsonclick = "" ;
      lblTextblocktbm45_filetr_nm_Jsonclick = "" ;
      A980TBM45_FILETR_NM = "" ;
      lblTextblocktbm45_in_crf_id_Jsonclick = "" ;
      A981TBM45_IN_CRF_ID = "" ;
      lblTextblocktbm45_del_flg_Jsonclick = "" ;
      A982TBM45_DEL_FLG = "" ;
      lblTextblocktbm45_crt_datetime_Jsonclick = "" ;
      A983TBM45_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm45_crt_user_id_Jsonclick = "" ;
      A984TBM45_CRT_USER_ID = "" ;
      lblTextblocktbm45_crt_prog_nm_Jsonclick = "" ;
      A985TBM45_CRT_PROG_NM = "" ;
      lblTextblocktbm45_upd_datetime_Jsonclick = "" ;
      A986TBM45_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm45_upd_user_id_Jsonclick = "" ;
      A987TBM45_UPD_USER_ID = "" ;
      lblTextblocktbm45_upd_prog_nm_Jsonclick = "" ;
      A988TBM45_UPD_PROG_NM = "" ;
      lblTextblocktbm45_upd_cnt_Jsonclick = "" ;
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
      T001N4_A977TBM45_STUDY_ID = new long[1] ;
      T001N4_A978TBM45_FILTER_NO = new short[1] ;
      T001N4_A980TBM45_FILETR_NM = new String[] {""} ;
      T001N4_n980TBM45_FILETR_NM = new boolean[] {false} ;
      T001N4_A981TBM45_IN_CRF_ID = new String[] {""} ;
      T001N4_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      T001N4_A982TBM45_DEL_FLG = new String[] {""} ;
      T001N4_n982TBM45_DEL_FLG = new boolean[] {false} ;
      T001N4_A983TBM45_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001N4_n983TBM45_CRT_DATETIME = new boolean[] {false} ;
      T001N4_A984TBM45_CRT_USER_ID = new String[] {""} ;
      T001N4_n984TBM45_CRT_USER_ID = new boolean[] {false} ;
      T001N4_A985TBM45_CRT_PROG_NM = new String[] {""} ;
      T001N4_n985TBM45_CRT_PROG_NM = new boolean[] {false} ;
      T001N4_A986TBM45_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001N4_n986TBM45_UPD_DATETIME = new boolean[] {false} ;
      T001N4_A987TBM45_UPD_USER_ID = new String[] {""} ;
      T001N4_n987TBM45_UPD_USER_ID = new boolean[] {false} ;
      T001N4_A988TBM45_UPD_PROG_NM = new String[] {""} ;
      T001N4_n988TBM45_UPD_PROG_NM = new boolean[] {false} ;
      T001N4_A989TBM45_UPD_CNT = new long[1] ;
      T001N4_n989TBM45_UPD_CNT = new boolean[] {false} ;
      T001N5_A977TBM45_STUDY_ID = new long[1] ;
      T001N5_A978TBM45_FILTER_NO = new short[1] ;
      T001N3_A977TBM45_STUDY_ID = new long[1] ;
      T001N3_A978TBM45_FILTER_NO = new short[1] ;
      T001N3_A980TBM45_FILETR_NM = new String[] {""} ;
      T001N3_n980TBM45_FILETR_NM = new boolean[] {false} ;
      T001N3_A981TBM45_IN_CRF_ID = new String[] {""} ;
      T001N3_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      T001N3_A982TBM45_DEL_FLG = new String[] {""} ;
      T001N3_n982TBM45_DEL_FLG = new boolean[] {false} ;
      T001N3_A983TBM45_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001N3_n983TBM45_CRT_DATETIME = new boolean[] {false} ;
      T001N3_A984TBM45_CRT_USER_ID = new String[] {""} ;
      T001N3_n984TBM45_CRT_USER_ID = new boolean[] {false} ;
      T001N3_A985TBM45_CRT_PROG_NM = new String[] {""} ;
      T001N3_n985TBM45_CRT_PROG_NM = new boolean[] {false} ;
      T001N3_A986TBM45_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001N3_n986TBM45_UPD_DATETIME = new boolean[] {false} ;
      T001N3_A987TBM45_UPD_USER_ID = new String[] {""} ;
      T001N3_n987TBM45_UPD_USER_ID = new boolean[] {false} ;
      T001N3_A988TBM45_UPD_PROG_NM = new String[] {""} ;
      T001N3_n988TBM45_UPD_PROG_NM = new boolean[] {false} ;
      T001N3_A989TBM45_UPD_CNT = new long[1] ;
      T001N3_n989TBM45_UPD_CNT = new boolean[] {false} ;
      sMode65 = "" ;
      T001N6_A977TBM45_STUDY_ID = new long[1] ;
      T001N6_A978TBM45_FILTER_NO = new short[1] ;
      T001N7_A977TBM45_STUDY_ID = new long[1] ;
      T001N7_A978TBM45_FILTER_NO = new short[1] ;
      T001N2_A977TBM45_STUDY_ID = new long[1] ;
      T001N2_A978TBM45_FILTER_NO = new short[1] ;
      T001N2_A980TBM45_FILETR_NM = new String[] {""} ;
      T001N2_n980TBM45_FILETR_NM = new boolean[] {false} ;
      T001N2_A981TBM45_IN_CRF_ID = new String[] {""} ;
      T001N2_n981TBM45_IN_CRF_ID = new boolean[] {false} ;
      T001N2_A982TBM45_DEL_FLG = new String[] {""} ;
      T001N2_n982TBM45_DEL_FLG = new boolean[] {false} ;
      T001N2_A983TBM45_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001N2_n983TBM45_CRT_DATETIME = new boolean[] {false} ;
      T001N2_A984TBM45_CRT_USER_ID = new String[] {""} ;
      T001N2_n984TBM45_CRT_USER_ID = new boolean[] {false} ;
      T001N2_A985TBM45_CRT_PROG_NM = new String[] {""} ;
      T001N2_n985TBM45_CRT_PROG_NM = new boolean[] {false} ;
      T001N2_A986TBM45_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001N2_n986TBM45_UPD_DATETIME = new boolean[] {false} ;
      T001N2_A987TBM45_UPD_USER_ID = new String[] {""} ;
      T001N2_n987TBM45_UPD_USER_ID = new boolean[] {false} ;
      T001N2_A988TBM45_UPD_PROG_NM = new String[] {""} ;
      T001N2_n988TBM45_UPD_PROG_NM = new boolean[] {false} ;
      T001N2_A989TBM45_UPD_CNT = new long[1] ;
      T001N2_n989TBM45_UPD_CNT = new boolean[] {false} ;
      T001N11_A977TBM45_STUDY_ID = new long[1] ;
      T001N11_A978TBM45_FILTER_NO = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm45_crf_filetr__default(),
         new Object[] {
             new Object[] {
            T001N2_A977TBM45_STUDY_ID, T001N2_A978TBM45_FILTER_NO, T001N2_A980TBM45_FILETR_NM, T001N2_n980TBM45_FILETR_NM, T001N2_A981TBM45_IN_CRF_ID, T001N2_n981TBM45_IN_CRF_ID, T001N2_A982TBM45_DEL_FLG, T001N2_n982TBM45_DEL_FLG, T001N2_A983TBM45_CRT_DATETIME, T001N2_n983TBM45_CRT_DATETIME,
            T001N2_A984TBM45_CRT_USER_ID, T001N2_n984TBM45_CRT_USER_ID, T001N2_A985TBM45_CRT_PROG_NM, T001N2_n985TBM45_CRT_PROG_NM, T001N2_A986TBM45_UPD_DATETIME, T001N2_n986TBM45_UPD_DATETIME, T001N2_A987TBM45_UPD_USER_ID, T001N2_n987TBM45_UPD_USER_ID, T001N2_A988TBM45_UPD_PROG_NM, T001N2_n988TBM45_UPD_PROG_NM,
            T001N2_A989TBM45_UPD_CNT, T001N2_n989TBM45_UPD_CNT
            }
            , new Object[] {
            T001N3_A977TBM45_STUDY_ID, T001N3_A978TBM45_FILTER_NO, T001N3_A980TBM45_FILETR_NM, T001N3_n980TBM45_FILETR_NM, T001N3_A981TBM45_IN_CRF_ID, T001N3_n981TBM45_IN_CRF_ID, T001N3_A982TBM45_DEL_FLG, T001N3_n982TBM45_DEL_FLG, T001N3_A983TBM45_CRT_DATETIME, T001N3_n983TBM45_CRT_DATETIME,
            T001N3_A984TBM45_CRT_USER_ID, T001N3_n984TBM45_CRT_USER_ID, T001N3_A985TBM45_CRT_PROG_NM, T001N3_n985TBM45_CRT_PROG_NM, T001N3_A986TBM45_UPD_DATETIME, T001N3_n986TBM45_UPD_DATETIME, T001N3_A987TBM45_UPD_USER_ID, T001N3_n987TBM45_UPD_USER_ID, T001N3_A988TBM45_UPD_PROG_NM, T001N3_n988TBM45_UPD_PROG_NM,
            T001N3_A989TBM45_UPD_CNT, T001N3_n989TBM45_UPD_CNT
            }
            , new Object[] {
            T001N4_A977TBM45_STUDY_ID, T001N4_A978TBM45_FILTER_NO, T001N4_A980TBM45_FILETR_NM, T001N4_n980TBM45_FILETR_NM, T001N4_A981TBM45_IN_CRF_ID, T001N4_n981TBM45_IN_CRF_ID, T001N4_A982TBM45_DEL_FLG, T001N4_n982TBM45_DEL_FLG, T001N4_A983TBM45_CRT_DATETIME, T001N4_n983TBM45_CRT_DATETIME,
            T001N4_A984TBM45_CRT_USER_ID, T001N4_n984TBM45_CRT_USER_ID, T001N4_A985TBM45_CRT_PROG_NM, T001N4_n985TBM45_CRT_PROG_NM, T001N4_A986TBM45_UPD_DATETIME, T001N4_n986TBM45_UPD_DATETIME, T001N4_A987TBM45_UPD_USER_ID, T001N4_n987TBM45_UPD_USER_ID, T001N4_A988TBM45_UPD_PROG_NM, T001N4_n988TBM45_UPD_PROG_NM,
            T001N4_A989TBM45_UPD_CNT, T001N4_n989TBM45_UPD_CNT
            }
            , new Object[] {
            T001N5_A977TBM45_STUDY_ID, T001N5_A978TBM45_FILTER_NO
            }
            , new Object[] {
            T001N6_A977TBM45_STUDY_ID, T001N6_A978TBM45_FILTER_NO
            }
            , new Object[] {
            T001N7_A977TBM45_STUDY_ID, T001N7_A978TBM45_FILTER_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001N11_A977TBM45_STUDY_ID, T001N11_A978TBM45_FILTER_NO
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z978TBM45_FILTER_NO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A978TBM45_FILTER_NO ;
   private short RcdFound65 ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM45_STUDY_ID_Enabled ;
   private int edtTBM45_FILTER_NO_Enabled ;
   private int edtTBM45_FILETR_NM_Enabled ;
   private int edtTBM45_IN_CRF_ID_Enabled ;
   private int edtTBM45_DEL_FLG_Enabled ;
   private int edtTBM45_CRT_DATETIME_Enabled ;
   private int edtTBM45_CRT_USER_ID_Enabled ;
   private int edtTBM45_CRT_PROG_NM_Enabled ;
   private int edtTBM45_UPD_DATETIME_Enabled ;
   private int edtTBM45_UPD_USER_ID_Enabled ;
   private int edtTBM45_UPD_PROG_NM_Enabled ;
   private int edtTBM45_UPD_CNT_Enabled ;
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
   private long Z977TBM45_STUDY_ID ;
   private long Z989TBM45_UPD_CNT ;
   private long A977TBM45_STUDY_ID ;
   private long A989TBM45_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM45_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm45_study_id_Internalname ;
   private String lblTextblocktbm45_study_id_Jsonclick ;
   private String edtTBM45_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm45_filter_no_Internalname ;
   private String lblTextblocktbm45_filter_no_Jsonclick ;
   private String edtTBM45_FILTER_NO_Internalname ;
   private String edtTBM45_FILTER_NO_Jsonclick ;
   private String lblTextblocktbm45_filetr_nm_Internalname ;
   private String lblTextblocktbm45_filetr_nm_Jsonclick ;
   private String edtTBM45_FILETR_NM_Internalname ;
   private String edtTBM45_FILETR_NM_Jsonclick ;
   private String lblTextblocktbm45_in_crf_id_Internalname ;
   private String lblTextblocktbm45_in_crf_id_Jsonclick ;
   private String edtTBM45_IN_CRF_ID_Internalname ;
   private String lblTextblocktbm45_del_flg_Internalname ;
   private String lblTextblocktbm45_del_flg_Jsonclick ;
   private String edtTBM45_DEL_FLG_Internalname ;
   private String edtTBM45_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm45_crt_datetime_Internalname ;
   private String lblTextblocktbm45_crt_datetime_Jsonclick ;
   private String edtTBM45_CRT_DATETIME_Internalname ;
   private String edtTBM45_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm45_crt_user_id_Internalname ;
   private String lblTextblocktbm45_crt_user_id_Jsonclick ;
   private String edtTBM45_CRT_USER_ID_Internalname ;
   private String edtTBM45_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm45_crt_prog_nm_Internalname ;
   private String lblTextblocktbm45_crt_prog_nm_Jsonclick ;
   private String edtTBM45_CRT_PROG_NM_Internalname ;
   private String edtTBM45_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm45_upd_datetime_Internalname ;
   private String lblTextblocktbm45_upd_datetime_Jsonclick ;
   private String edtTBM45_UPD_DATETIME_Internalname ;
   private String edtTBM45_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm45_upd_user_id_Internalname ;
   private String lblTextblocktbm45_upd_user_id_Jsonclick ;
   private String edtTBM45_UPD_USER_ID_Internalname ;
   private String edtTBM45_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm45_upd_prog_nm_Internalname ;
   private String lblTextblocktbm45_upd_prog_nm_Jsonclick ;
   private String edtTBM45_UPD_PROG_NM_Internalname ;
   private String edtTBM45_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm45_upd_cnt_Internalname ;
   private String lblTextblocktbm45_upd_cnt_Jsonclick ;
   private String edtTBM45_UPD_CNT_Internalname ;
   private String edtTBM45_UPD_CNT_Jsonclick ;
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
   private String sMode65 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z983TBM45_CRT_DATETIME ;
   private java.util.Date Z986TBM45_UPD_DATETIME ;
   private java.util.Date A983TBM45_CRT_DATETIME ;
   private java.util.Date A986TBM45_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n980TBM45_FILETR_NM ;
   private boolean n981TBM45_IN_CRF_ID ;
   private boolean n982TBM45_DEL_FLG ;
   private boolean n983TBM45_CRT_DATETIME ;
   private boolean n984TBM45_CRT_USER_ID ;
   private boolean n985TBM45_CRT_PROG_NM ;
   private boolean n986TBM45_UPD_DATETIME ;
   private boolean n987TBM45_UPD_USER_ID ;
   private boolean n988TBM45_UPD_PROG_NM ;
   private boolean n989TBM45_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z980TBM45_FILETR_NM ;
   private String Z981TBM45_IN_CRF_ID ;
   private String Z982TBM45_DEL_FLG ;
   private String Z984TBM45_CRT_USER_ID ;
   private String Z985TBM45_CRT_PROG_NM ;
   private String Z987TBM45_UPD_USER_ID ;
   private String Z988TBM45_UPD_PROG_NM ;
   private String A980TBM45_FILETR_NM ;
   private String A981TBM45_IN_CRF_ID ;
   private String A982TBM45_DEL_FLG ;
   private String A984TBM45_CRT_USER_ID ;
   private String A985TBM45_CRT_PROG_NM ;
   private String A987TBM45_UPD_USER_ID ;
   private String A988TBM45_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T001N4_A977TBM45_STUDY_ID ;
   private short[] T001N4_A978TBM45_FILTER_NO ;
   private String[] T001N4_A980TBM45_FILETR_NM ;
   private boolean[] T001N4_n980TBM45_FILETR_NM ;
   private String[] T001N4_A981TBM45_IN_CRF_ID ;
   private boolean[] T001N4_n981TBM45_IN_CRF_ID ;
   private String[] T001N4_A982TBM45_DEL_FLG ;
   private boolean[] T001N4_n982TBM45_DEL_FLG ;
   private java.util.Date[] T001N4_A983TBM45_CRT_DATETIME ;
   private boolean[] T001N4_n983TBM45_CRT_DATETIME ;
   private String[] T001N4_A984TBM45_CRT_USER_ID ;
   private boolean[] T001N4_n984TBM45_CRT_USER_ID ;
   private String[] T001N4_A985TBM45_CRT_PROG_NM ;
   private boolean[] T001N4_n985TBM45_CRT_PROG_NM ;
   private java.util.Date[] T001N4_A986TBM45_UPD_DATETIME ;
   private boolean[] T001N4_n986TBM45_UPD_DATETIME ;
   private String[] T001N4_A987TBM45_UPD_USER_ID ;
   private boolean[] T001N4_n987TBM45_UPD_USER_ID ;
   private String[] T001N4_A988TBM45_UPD_PROG_NM ;
   private boolean[] T001N4_n988TBM45_UPD_PROG_NM ;
   private long[] T001N4_A989TBM45_UPD_CNT ;
   private boolean[] T001N4_n989TBM45_UPD_CNT ;
   private long[] T001N5_A977TBM45_STUDY_ID ;
   private short[] T001N5_A978TBM45_FILTER_NO ;
   private long[] T001N3_A977TBM45_STUDY_ID ;
   private short[] T001N3_A978TBM45_FILTER_NO ;
   private String[] T001N3_A980TBM45_FILETR_NM ;
   private boolean[] T001N3_n980TBM45_FILETR_NM ;
   private String[] T001N3_A981TBM45_IN_CRF_ID ;
   private boolean[] T001N3_n981TBM45_IN_CRF_ID ;
   private String[] T001N3_A982TBM45_DEL_FLG ;
   private boolean[] T001N3_n982TBM45_DEL_FLG ;
   private java.util.Date[] T001N3_A983TBM45_CRT_DATETIME ;
   private boolean[] T001N3_n983TBM45_CRT_DATETIME ;
   private String[] T001N3_A984TBM45_CRT_USER_ID ;
   private boolean[] T001N3_n984TBM45_CRT_USER_ID ;
   private String[] T001N3_A985TBM45_CRT_PROG_NM ;
   private boolean[] T001N3_n985TBM45_CRT_PROG_NM ;
   private java.util.Date[] T001N3_A986TBM45_UPD_DATETIME ;
   private boolean[] T001N3_n986TBM45_UPD_DATETIME ;
   private String[] T001N3_A987TBM45_UPD_USER_ID ;
   private boolean[] T001N3_n987TBM45_UPD_USER_ID ;
   private String[] T001N3_A988TBM45_UPD_PROG_NM ;
   private boolean[] T001N3_n988TBM45_UPD_PROG_NM ;
   private long[] T001N3_A989TBM45_UPD_CNT ;
   private boolean[] T001N3_n989TBM45_UPD_CNT ;
   private long[] T001N6_A977TBM45_STUDY_ID ;
   private short[] T001N6_A978TBM45_FILTER_NO ;
   private long[] T001N7_A977TBM45_STUDY_ID ;
   private short[] T001N7_A978TBM45_FILTER_NO ;
   private long[] T001N2_A977TBM45_STUDY_ID ;
   private short[] T001N2_A978TBM45_FILTER_NO ;
   private String[] T001N2_A980TBM45_FILETR_NM ;
   private boolean[] T001N2_n980TBM45_FILETR_NM ;
   private String[] T001N2_A981TBM45_IN_CRF_ID ;
   private boolean[] T001N2_n981TBM45_IN_CRF_ID ;
   private String[] T001N2_A982TBM45_DEL_FLG ;
   private boolean[] T001N2_n982TBM45_DEL_FLG ;
   private java.util.Date[] T001N2_A983TBM45_CRT_DATETIME ;
   private boolean[] T001N2_n983TBM45_CRT_DATETIME ;
   private String[] T001N2_A984TBM45_CRT_USER_ID ;
   private boolean[] T001N2_n984TBM45_CRT_USER_ID ;
   private String[] T001N2_A985TBM45_CRT_PROG_NM ;
   private boolean[] T001N2_n985TBM45_CRT_PROG_NM ;
   private java.util.Date[] T001N2_A986TBM45_UPD_DATETIME ;
   private boolean[] T001N2_n986TBM45_UPD_DATETIME ;
   private String[] T001N2_A987TBM45_UPD_USER_ID ;
   private boolean[] T001N2_n987TBM45_UPD_USER_ID ;
   private String[] T001N2_A988TBM45_UPD_PROG_NM ;
   private boolean[] T001N2_n988TBM45_UPD_PROG_NM ;
   private long[] T001N2_A989TBM45_UPD_CNT ;
   private boolean[] T001N2_n989TBM45_UPD_CNT ;
   private long[] T001N11_A977TBM45_STUDY_ID ;
   private short[] T001N11_A978TBM45_FILTER_NO ;
}

final  class tbm45_crf_filetr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001N2", "SELECT `TBM45_STUDY_ID`, `TBM45_FILTER_NO`, `TBM45_FILETR_NM`, `TBM45_IN_CRF_ID`, `TBM45_DEL_FLG`, `TBM45_CRT_DATETIME`, `TBM45_CRT_USER_ID`, `TBM45_CRT_PROG_NM`, `TBM45_UPD_DATETIME`, `TBM45_UPD_USER_ID`, `TBM45_UPD_PROG_NM`, `TBM45_UPD_CNT` FROM `TBM45_CRF_FILETR` WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001N3", "SELECT `TBM45_STUDY_ID`, `TBM45_FILTER_NO`, `TBM45_FILETR_NM`, `TBM45_IN_CRF_ID`, `TBM45_DEL_FLG`, `TBM45_CRT_DATETIME`, `TBM45_CRT_USER_ID`, `TBM45_CRT_PROG_NM`, `TBM45_UPD_DATETIME`, `TBM45_UPD_USER_ID`, `TBM45_UPD_PROG_NM`, `TBM45_UPD_CNT` FROM `TBM45_CRF_FILETR` WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001N4", "SELECT TM1.`TBM45_STUDY_ID`, TM1.`TBM45_FILTER_NO`, TM1.`TBM45_FILETR_NM`, TM1.`TBM45_IN_CRF_ID`, TM1.`TBM45_DEL_FLG`, TM1.`TBM45_CRT_DATETIME`, TM1.`TBM45_CRT_USER_ID`, TM1.`TBM45_CRT_PROG_NM`, TM1.`TBM45_UPD_DATETIME`, TM1.`TBM45_UPD_USER_ID`, TM1.`TBM45_UPD_PROG_NM`, TM1.`TBM45_UPD_CNT` FROM `TBM45_CRF_FILETR` TM1 WHERE TM1.`TBM45_STUDY_ID` = ? and TM1.`TBM45_FILTER_NO` = ? ORDER BY TM1.`TBM45_STUDY_ID`, TM1.`TBM45_FILTER_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001N5", "SELECT `TBM45_STUDY_ID`, `TBM45_FILTER_NO` FROM `TBM45_CRF_FILETR` WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001N6", "SELECT `TBM45_STUDY_ID`, `TBM45_FILTER_NO` FROM `TBM45_CRF_FILETR` WHERE ( `TBM45_STUDY_ID` > ? or `TBM45_STUDY_ID` = ? and `TBM45_FILTER_NO` > ?) ORDER BY `TBM45_STUDY_ID`, `TBM45_FILTER_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001N7", "SELECT `TBM45_STUDY_ID`, `TBM45_FILTER_NO` FROM `TBM45_CRF_FILETR` WHERE ( `TBM45_STUDY_ID` < ? or `TBM45_STUDY_ID` = ? and `TBM45_FILTER_NO` < ?) ORDER BY `TBM45_STUDY_ID` DESC, `TBM45_FILTER_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001N8", "INSERT INTO `TBM45_CRF_FILETR`(`TBM45_STUDY_ID`, `TBM45_FILTER_NO`, `TBM45_FILETR_NM`, `TBM45_IN_CRF_ID`, `TBM45_DEL_FLG`, `TBM45_CRT_DATETIME`, `TBM45_CRT_USER_ID`, `TBM45_CRT_PROG_NM`, `TBM45_UPD_DATETIME`, `TBM45_UPD_USER_ID`, `TBM45_UPD_PROG_NM`, `TBM45_UPD_CNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001N9", "UPDATE `TBM45_CRF_FILETR` SET `TBM45_FILETR_NM`=?, `TBM45_IN_CRF_ID`=?, `TBM45_DEL_FLG`=?, `TBM45_CRT_DATETIME`=?, `TBM45_CRT_USER_ID`=?, `TBM45_CRT_PROG_NM`=?, `TBM45_UPD_DATETIME`=?, `TBM45_UPD_USER_ID`=?, `TBM45_UPD_PROG_NM`=?, `TBM45_UPD_CNT`=?  WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T001N10", "DELETE FROM `TBM45_CRF_FILETR`  WHERE `TBM45_STUDY_ID` = ? AND `TBM45_FILTER_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T001N11", "SELECT `TBM45_STUDY_ID`, `TBM45_FILTER_NO` FROM `TBM45_CRF_FILETR` ORDER BY `TBM45_STUDY_ID`, `TBM45_FILTER_NO` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[14])[0] = rslt.getGXDateTime(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((long[]) buf[20])[0] = rslt.getLong(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[3], 100);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 1000);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[11], 128);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 128);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(12, ((Number) parms[21]).longValue());
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 100);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1000);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[13], false);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(10, ((Number) parms[19]).longValue());
               }
               stmt.setLong(11, ((Number) parms[20]).longValue());
               stmt.setShort(12, ((Number) parms[21]).shortValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
      }
   }

}

