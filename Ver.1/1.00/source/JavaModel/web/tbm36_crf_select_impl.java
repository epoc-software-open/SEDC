/*
               File: tbm36_crf_select_impl
        Description: CRF選択マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:16.2
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm36_crf_select_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM36_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm36_crt_user_id1136( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM36_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm36_upd_user_id1136( Gx_mode) ;
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
      Form.getMeta().addItem("Description", "CRF選択マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM36_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbm36_crf_select_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm36_crf_select_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm36_crf_select_impl.class ));
   }

   public tbm36_crf_select_impl( int remoteHandle ,
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
         wb_table1_2_1136( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1136e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1136( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1136( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1136( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1136e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRF選択マスタ"+"</legend>") ;
         wb_table3_27_1136( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1136e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1136e( true) ;
      }
      else
      {
         wb_table1_2_1136e( false) ;
      }
   }

   public void wb_table3_27_1136( boolean wbgen )
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
         wb_table4_33_1136( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1136e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM36_CRF_SELECT.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM36_CRF_SELECT.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1136e( true) ;
      }
      else
      {
         wb_table3_27_1136e( false) ;
      }
   }

   public void wb_table4_33_1136( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_study_id_Internalname, "試験ID", "", "", lblTextblocktbm36_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A484TBM36_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM36_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A484TBM36_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A484TBM36_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM36_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_crf_id_Internalname, "CRFID", "", "", lblTextblocktbm36_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A485TBM36_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBM36_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A485TBM36_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A485TBM36_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM36_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_cond_no_Internalname, "CRF条件番号", "", "", lblTextblocktbm36_cond_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_COND_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A486TBM36_COND_NO, (byte)(4), (byte)(0), ".", "")), ((edtTBM36_COND_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486TBM36_COND_NO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A486TBM36_COND_NO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM36_COND_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_COND_NO_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_select_crf_id_Internalname, "選択CRFID", "", "", lblTextblocktbm36_select_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_SELECT_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A487TBM36_SELECT_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBM36_SELECT_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A487TBM36_SELECT_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A487TBM36_SELECT_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM36_SELECT_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_SELECT_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm36_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A488TBM36_DEL_FLG", A488TBM36_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_DEL_FLG_Internalname, GXutil.rtrim( A488TBM36_DEL_FLG), GXutil.rtrim( localUtil.format( A488TBM36_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM36_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm36_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A489TBM36_CRT_DATETIME", localUtil.ttoc( A489TBM36_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM36_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_CRT_DATETIME_Internalname, localUtil.format(A489TBM36_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A489TBM36_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM36_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM36_CRF_SELECT.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM36_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM36_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm36_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A490TBM36_CRT_USER_ID", A490TBM36_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_CRT_USER_ID_Internalname, GXutil.rtrim( A490TBM36_CRT_USER_ID), GXutil.rtrim( localUtil.format( A490TBM36_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM36_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm36_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A491TBM36_CRT_PROG_NM", A491TBM36_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_CRT_PROG_NM_Internalname, GXutil.rtrim( A491TBM36_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A491TBM36_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM36_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm36_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A492TBM36_UPD_DATETIME", localUtil.ttoc( A492TBM36_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM36_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_UPD_DATETIME_Internalname, localUtil.format(A492TBM36_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A492TBM36_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM36_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM36_CRF_SELECT.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM36_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM36_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm36_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A493TBM36_UPD_USER_ID", A493TBM36_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_UPD_USER_ID_Internalname, GXutil.rtrim( A493TBM36_UPD_USER_ID), GXutil.rtrim( localUtil.format( A493TBM36_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM36_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm36_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A494TBM36_UPD_PROG_NM", A494TBM36_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_UPD_PROG_NM_Internalname, GXutil.rtrim( A494TBM36_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A494TBM36_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM36_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm36_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm36_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A495TBM36_UPD_CNT", GXutil.ltrim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM36_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A495TBM36_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM36_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A495TBM36_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A495TBM36_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM36_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM36_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM36_CRF_SELECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1136e( true) ;
      }
      else
      {
         wb_table4_33_1136e( false) ;
      }
   }

   public void wb_table2_5_1136( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM36_CRF_SELECT.htm");
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
         wb_table2_5_1136e( true) ;
      }
      else
      {
         wb_table2_5_1136e( false) ;
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
      /* Execute user event: e11112 */
      e11112 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM36_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM36_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM36_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM36_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A484TBM36_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
            }
            else
            {
               A484TBM36_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM36_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM36_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM36_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM36_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM36_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A485TBM36_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
            }
            else
            {
               A485TBM36_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM36_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM36_COND_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM36_COND_NO_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM36_COND_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM36_COND_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A486TBM36_COND_NO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
            }
            else
            {
               A486TBM36_COND_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM36_COND_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM36_SELECT_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM36_SELECT_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM36_SELECT_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM36_SELECT_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A487TBM36_SELECT_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
            }
            else
            {
               A487TBM36_SELECT_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM36_SELECT_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
            }
            A488TBM36_DEL_FLG = httpContext.cgiGet( edtTBM36_DEL_FLG_Internalname) ;
            n488TBM36_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A488TBM36_DEL_FLG", A488TBM36_DEL_FLG);
            n488TBM36_DEL_FLG = ((GXutil.strcmp("", A488TBM36_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM36_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM36_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM36_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A489TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n489TBM36_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A489TBM36_CRT_DATETIME", localUtil.ttoc( A489TBM36_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A489TBM36_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM36_CRT_DATETIME_Internalname)) ;
               n489TBM36_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A489TBM36_CRT_DATETIME", localUtil.ttoc( A489TBM36_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n489TBM36_CRT_DATETIME = (GXutil.nullDate().equals(A489TBM36_CRT_DATETIME) ? true : false) ;
            A490TBM36_CRT_USER_ID = httpContext.cgiGet( edtTBM36_CRT_USER_ID_Internalname) ;
            n490TBM36_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A490TBM36_CRT_USER_ID", A490TBM36_CRT_USER_ID);
            n490TBM36_CRT_USER_ID = ((GXutil.strcmp("", A490TBM36_CRT_USER_ID)==0) ? true : false) ;
            A491TBM36_CRT_PROG_NM = httpContext.cgiGet( edtTBM36_CRT_PROG_NM_Internalname) ;
            n491TBM36_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A491TBM36_CRT_PROG_NM", A491TBM36_CRT_PROG_NM);
            n491TBM36_CRT_PROG_NM = ((GXutil.strcmp("", A491TBM36_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM36_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM36_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM36_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A492TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n492TBM36_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A492TBM36_UPD_DATETIME", localUtil.ttoc( A492TBM36_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A492TBM36_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM36_UPD_DATETIME_Internalname)) ;
               n492TBM36_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A492TBM36_UPD_DATETIME", localUtil.ttoc( A492TBM36_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n492TBM36_UPD_DATETIME = (GXutil.nullDate().equals(A492TBM36_UPD_DATETIME) ? true : false) ;
            A493TBM36_UPD_USER_ID = httpContext.cgiGet( edtTBM36_UPD_USER_ID_Internalname) ;
            n493TBM36_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A493TBM36_UPD_USER_ID", A493TBM36_UPD_USER_ID);
            n493TBM36_UPD_USER_ID = ((GXutil.strcmp("", A493TBM36_UPD_USER_ID)==0) ? true : false) ;
            A494TBM36_UPD_PROG_NM = httpContext.cgiGet( edtTBM36_UPD_PROG_NM_Internalname) ;
            n494TBM36_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A494TBM36_UPD_PROG_NM", A494TBM36_UPD_PROG_NM);
            n494TBM36_UPD_PROG_NM = ((GXutil.strcmp("", A494TBM36_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM36_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM36_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM36_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM36_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A495TBM36_UPD_CNT = 0 ;
               n495TBM36_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A495TBM36_UPD_CNT", GXutil.ltrim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)));
            }
            else
            {
               A495TBM36_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM36_UPD_CNT_Internalname), ".", ",") ;
               n495TBM36_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A495TBM36_UPD_CNT", GXutil.ltrim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)));
            }
            n495TBM36_UPD_CNT = ((0==A495TBM36_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z484TBM36_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z484TBM36_STUDY_ID"), ".", ",") ;
            Z485TBM36_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z485TBM36_CRF_ID"), ".", ",")) ;
            Z486TBM36_COND_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z486TBM36_COND_NO"), ".", ",")) ;
            Z487TBM36_SELECT_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z487TBM36_SELECT_CRF_ID"), ".", ",")) ;
            Z489TBM36_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z489TBM36_CRT_DATETIME"), 0) ;
            n489TBM36_CRT_DATETIME = (GXutil.nullDate().equals(A489TBM36_CRT_DATETIME) ? true : false) ;
            Z490TBM36_CRT_USER_ID = httpContext.cgiGet( "Z490TBM36_CRT_USER_ID") ;
            n490TBM36_CRT_USER_ID = ((GXutil.strcmp("", A490TBM36_CRT_USER_ID)==0) ? true : false) ;
            Z492TBM36_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z492TBM36_UPD_DATETIME"), 0) ;
            n492TBM36_UPD_DATETIME = (GXutil.nullDate().equals(A492TBM36_UPD_DATETIME) ? true : false) ;
            Z493TBM36_UPD_USER_ID = httpContext.cgiGet( "Z493TBM36_UPD_USER_ID") ;
            n493TBM36_UPD_USER_ID = ((GXutil.strcmp("", A493TBM36_UPD_USER_ID)==0) ? true : false) ;
            Z495TBM36_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z495TBM36_UPD_CNT"), ".", ",") ;
            n495TBM36_UPD_CNT = ((0==A495TBM36_UPD_CNT) ? true : false) ;
            Z488TBM36_DEL_FLG = httpContext.cgiGet( "Z488TBM36_DEL_FLG") ;
            n488TBM36_DEL_FLG = ((GXutil.strcmp("", A488TBM36_DEL_FLG)==0) ? true : false) ;
            Z491TBM36_CRT_PROG_NM = httpContext.cgiGet( "Z491TBM36_CRT_PROG_NM") ;
            n491TBM36_CRT_PROG_NM = ((GXutil.strcmp("", A491TBM36_CRT_PROG_NM)==0) ? true : false) ;
            Z494TBM36_UPD_PROG_NM = httpContext.cgiGet( "Z494TBM36_UPD_PROG_NM") ;
            n494TBM36_UPD_PROG_NM = ((GXutil.strcmp("", A494TBM36_UPD_PROG_NM)==0) ? true : false) ;
            O495TBM36_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O495TBM36_UPD_CNT"), ".", ",") ;
            n495TBM36_UPD_CNT = ((0==A495TBM36_UPD_CNT) ? true : false) ;
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
               A484TBM36_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
               A485TBM36_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
               A486TBM36_COND_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
               A487TBM36_SELECT_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
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
                     /* Execute user event: e11112 */
                     e11112 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12112 */
                     e12112 ();
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
         /* Execute user event: e12112 */
         e12112 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1136( ) ;
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
      disableAttributes1136( ) ;
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

   public void resetCaption110( )
   {
   }

   public void e11112( )
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

   public void e12112( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A485TBM36_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A486TBM36_COND_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A487TBM36_SELECT_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A488TBM36_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A489TBM36_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm36_crf_select_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A489TBM36_CRT_DATETIME", localUtil.ttoc( A489TBM36_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A490TBM36_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A491TBM36_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A492TBM36_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm36_crf_select_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A492TBM36_UPD_DATETIME", localUtil.ttoc( A492TBM36_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A493TBM36_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A494TBM36_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1165( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1136( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z489TBM36_CRT_DATETIME = T00113_A489TBM36_CRT_DATETIME[0] ;
            Z490TBM36_CRT_USER_ID = T00113_A490TBM36_CRT_USER_ID[0] ;
            Z492TBM36_UPD_DATETIME = T00113_A492TBM36_UPD_DATETIME[0] ;
            Z493TBM36_UPD_USER_ID = T00113_A493TBM36_UPD_USER_ID[0] ;
            Z495TBM36_UPD_CNT = T00113_A495TBM36_UPD_CNT[0] ;
            Z488TBM36_DEL_FLG = T00113_A488TBM36_DEL_FLG[0] ;
            Z491TBM36_CRT_PROG_NM = T00113_A491TBM36_CRT_PROG_NM[0] ;
            Z494TBM36_UPD_PROG_NM = T00113_A494TBM36_UPD_PROG_NM[0] ;
         }
         else
         {
            Z489TBM36_CRT_DATETIME = A489TBM36_CRT_DATETIME ;
            Z490TBM36_CRT_USER_ID = A490TBM36_CRT_USER_ID ;
            Z492TBM36_UPD_DATETIME = A492TBM36_UPD_DATETIME ;
            Z493TBM36_UPD_USER_ID = A493TBM36_UPD_USER_ID ;
            Z495TBM36_UPD_CNT = A495TBM36_UPD_CNT ;
            Z488TBM36_DEL_FLG = A488TBM36_DEL_FLG ;
            Z491TBM36_CRT_PROG_NM = A491TBM36_CRT_PROG_NM ;
            Z494TBM36_UPD_PROG_NM = A494TBM36_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z484TBM36_STUDY_ID = A484TBM36_STUDY_ID ;
         Z485TBM36_CRF_ID = A485TBM36_CRF_ID ;
         Z486TBM36_COND_NO = A486TBM36_COND_NO ;
         Z487TBM36_SELECT_CRF_ID = A487TBM36_SELECT_CRF_ID ;
         Z489TBM36_CRT_DATETIME = A489TBM36_CRT_DATETIME ;
         Z490TBM36_CRT_USER_ID = A490TBM36_CRT_USER_ID ;
         Z492TBM36_UPD_DATETIME = A492TBM36_UPD_DATETIME ;
         Z493TBM36_UPD_USER_ID = A493TBM36_UPD_USER_ID ;
         Z495TBM36_UPD_CNT = A495TBM36_UPD_CNT ;
         Z488TBM36_DEL_FLG = A488TBM36_DEL_FLG ;
         Z491TBM36_CRT_PROG_NM = A491TBM36_CRT_PROG_NM ;
         Z494TBM36_UPD_PROG_NM = A494TBM36_UPD_PROG_NM ;
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

   public void load1136( )
   {
      /* Using cursor T00114 */
      pr_default.execute(2, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A489TBM36_CRT_DATETIME = T00114_A489TBM36_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A489TBM36_CRT_DATETIME", localUtil.ttoc( A489TBM36_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n489TBM36_CRT_DATETIME = T00114_n489TBM36_CRT_DATETIME[0] ;
         A490TBM36_CRT_USER_ID = T00114_A490TBM36_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490TBM36_CRT_USER_ID", A490TBM36_CRT_USER_ID);
         n490TBM36_CRT_USER_ID = T00114_n490TBM36_CRT_USER_ID[0] ;
         A492TBM36_UPD_DATETIME = T00114_A492TBM36_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A492TBM36_UPD_DATETIME", localUtil.ttoc( A492TBM36_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n492TBM36_UPD_DATETIME = T00114_n492TBM36_UPD_DATETIME[0] ;
         A493TBM36_UPD_USER_ID = T00114_A493TBM36_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A493TBM36_UPD_USER_ID", A493TBM36_UPD_USER_ID);
         n493TBM36_UPD_USER_ID = T00114_n493TBM36_UPD_USER_ID[0] ;
         A495TBM36_UPD_CNT = T00114_A495TBM36_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A495TBM36_UPD_CNT", GXutil.ltrim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)));
         n495TBM36_UPD_CNT = T00114_n495TBM36_UPD_CNT[0] ;
         A488TBM36_DEL_FLG = T00114_A488TBM36_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488TBM36_DEL_FLG", A488TBM36_DEL_FLG);
         n488TBM36_DEL_FLG = T00114_n488TBM36_DEL_FLG[0] ;
         A491TBM36_CRT_PROG_NM = T00114_A491TBM36_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A491TBM36_CRT_PROG_NM", A491TBM36_CRT_PROG_NM);
         n491TBM36_CRT_PROG_NM = T00114_n491TBM36_CRT_PROG_NM[0] ;
         A494TBM36_UPD_PROG_NM = T00114_A494TBM36_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494TBM36_UPD_PROG_NM", A494TBM36_UPD_PROG_NM);
         n494TBM36_UPD_PROG_NM = T00114_n494TBM36_UPD_PROG_NM[0] ;
         zm1136( -8) ;
      }
      pr_default.close(2);
      onLoadActions1136( ) ;
   }

   public void onLoadActions1136( )
   {
      AV9Pgmname = "TBM36_CRF_SELECT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable1136( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM36_CRF_SELECT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A489TBM36_CRT_DATETIME) || (( A489TBM36_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A489TBM36_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A492TBM36_UPD_DATETIME) || (( A492TBM36_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A492TBM36_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1136( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1136( )
   {
      /* Using cursor T00115 */
      pr_default.execute(3, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound36 = (short)(1) ;
      }
      else
      {
         RcdFound36 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00113 */
      pr_default.execute(1, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1136( 8) ;
         RcdFound36 = (short)(1) ;
         A484TBM36_STUDY_ID = T00113_A484TBM36_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
         A485TBM36_CRF_ID = T00113_A485TBM36_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
         A486TBM36_COND_NO = T00113_A486TBM36_COND_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
         A487TBM36_SELECT_CRF_ID = T00113_A487TBM36_SELECT_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
         A489TBM36_CRT_DATETIME = T00113_A489TBM36_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A489TBM36_CRT_DATETIME", localUtil.ttoc( A489TBM36_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n489TBM36_CRT_DATETIME = T00113_n489TBM36_CRT_DATETIME[0] ;
         A490TBM36_CRT_USER_ID = T00113_A490TBM36_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A490TBM36_CRT_USER_ID", A490TBM36_CRT_USER_ID);
         n490TBM36_CRT_USER_ID = T00113_n490TBM36_CRT_USER_ID[0] ;
         A492TBM36_UPD_DATETIME = T00113_A492TBM36_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A492TBM36_UPD_DATETIME", localUtil.ttoc( A492TBM36_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n492TBM36_UPD_DATETIME = T00113_n492TBM36_UPD_DATETIME[0] ;
         A493TBM36_UPD_USER_ID = T00113_A493TBM36_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A493TBM36_UPD_USER_ID", A493TBM36_UPD_USER_ID);
         n493TBM36_UPD_USER_ID = T00113_n493TBM36_UPD_USER_ID[0] ;
         A495TBM36_UPD_CNT = T00113_A495TBM36_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A495TBM36_UPD_CNT", GXutil.ltrim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)));
         n495TBM36_UPD_CNT = T00113_n495TBM36_UPD_CNT[0] ;
         A488TBM36_DEL_FLG = T00113_A488TBM36_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A488TBM36_DEL_FLG", A488TBM36_DEL_FLG);
         n488TBM36_DEL_FLG = T00113_n488TBM36_DEL_FLG[0] ;
         A491TBM36_CRT_PROG_NM = T00113_A491TBM36_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A491TBM36_CRT_PROG_NM", A491TBM36_CRT_PROG_NM);
         n491TBM36_CRT_PROG_NM = T00113_n491TBM36_CRT_PROG_NM[0] ;
         A494TBM36_UPD_PROG_NM = T00113_A494TBM36_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A494TBM36_UPD_PROG_NM", A494TBM36_UPD_PROG_NM);
         n494TBM36_UPD_PROG_NM = T00113_n494TBM36_UPD_PROG_NM[0] ;
         O495TBM36_UPD_CNT = A495TBM36_UPD_CNT ;
         n495TBM36_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A495TBM36_UPD_CNT", GXutil.ltrim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)));
         Z484TBM36_STUDY_ID = A484TBM36_STUDY_ID ;
         Z485TBM36_CRF_ID = A485TBM36_CRF_ID ;
         Z486TBM36_COND_NO = A486TBM36_COND_NO ;
         Z487TBM36_SELECT_CRF_ID = A487TBM36_SELECT_CRF_ID ;
         sMode36 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1136( ) ;
         Gx_mode = sMode36 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound36 = (short)(0) ;
         initializeNonKey1136( ) ;
         sMode36 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode36 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1136( ) ;
      if ( RcdFound36 == 0 )
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
      RcdFound36 = (short)(0) ;
      /* Using cursor T00116 */
      pr_default.execute(4, new Object[] {new Long(A484TBM36_STUDY_ID), new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A485TBM36_CRF_ID), new Long(A484TBM36_STUDY_ID), new Short(A486TBM36_COND_NO), new Short(A486TBM36_COND_NO), new Short(A485TBM36_CRF_ID), new Long(A484TBM36_STUDY_ID), new Short(A487TBM36_SELECT_CRF_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T00116_A484TBM36_STUDY_ID[0] < A484TBM36_STUDY_ID ) || ( T00116_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00116_A485TBM36_CRF_ID[0] < A485TBM36_CRF_ID ) || ( T00116_A485TBM36_CRF_ID[0] == A485TBM36_CRF_ID ) && ( T00116_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00116_A486TBM36_COND_NO[0] < A486TBM36_COND_NO ) || ( T00116_A486TBM36_COND_NO[0] == A486TBM36_COND_NO ) && ( T00116_A485TBM36_CRF_ID[0] == A485TBM36_CRF_ID ) && ( T00116_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00116_A487TBM36_SELECT_CRF_ID[0] < A487TBM36_SELECT_CRF_ID ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T00116_A484TBM36_STUDY_ID[0] > A484TBM36_STUDY_ID ) || ( T00116_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00116_A485TBM36_CRF_ID[0] > A485TBM36_CRF_ID ) || ( T00116_A485TBM36_CRF_ID[0] == A485TBM36_CRF_ID ) && ( T00116_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00116_A486TBM36_COND_NO[0] > A486TBM36_COND_NO ) || ( T00116_A486TBM36_COND_NO[0] == A486TBM36_COND_NO ) && ( T00116_A485TBM36_CRF_ID[0] == A485TBM36_CRF_ID ) && ( T00116_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00116_A487TBM36_SELECT_CRF_ID[0] > A487TBM36_SELECT_CRF_ID ) ) )
         {
            A484TBM36_STUDY_ID = T00116_A484TBM36_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
            A485TBM36_CRF_ID = T00116_A485TBM36_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
            A486TBM36_COND_NO = T00116_A486TBM36_COND_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
            A487TBM36_SELECT_CRF_ID = T00116_A487TBM36_SELECT_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
            RcdFound36 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound36 = (short)(0) ;
      /* Using cursor T00117 */
      pr_default.execute(5, new Object[] {new Long(A484TBM36_STUDY_ID), new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A485TBM36_CRF_ID), new Long(A484TBM36_STUDY_ID), new Short(A486TBM36_COND_NO), new Short(A486TBM36_COND_NO), new Short(A485TBM36_CRF_ID), new Long(A484TBM36_STUDY_ID), new Short(A487TBM36_SELECT_CRF_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T00117_A484TBM36_STUDY_ID[0] > A484TBM36_STUDY_ID ) || ( T00117_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00117_A485TBM36_CRF_ID[0] > A485TBM36_CRF_ID ) || ( T00117_A485TBM36_CRF_ID[0] == A485TBM36_CRF_ID ) && ( T00117_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00117_A486TBM36_COND_NO[0] > A486TBM36_COND_NO ) || ( T00117_A486TBM36_COND_NO[0] == A486TBM36_COND_NO ) && ( T00117_A485TBM36_CRF_ID[0] == A485TBM36_CRF_ID ) && ( T00117_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00117_A487TBM36_SELECT_CRF_ID[0] > A487TBM36_SELECT_CRF_ID ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T00117_A484TBM36_STUDY_ID[0] < A484TBM36_STUDY_ID ) || ( T00117_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00117_A485TBM36_CRF_ID[0] < A485TBM36_CRF_ID ) || ( T00117_A485TBM36_CRF_ID[0] == A485TBM36_CRF_ID ) && ( T00117_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00117_A486TBM36_COND_NO[0] < A486TBM36_COND_NO ) || ( T00117_A486TBM36_COND_NO[0] == A486TBM36_COND_NO ) && ( T00117_A485TBM36_CRF_ID[0] == A485TBM36_CRF_ID ) && ( T00117_A484TBM36_STUDY_ID[0] == A484TBM36_STUDY_ID ) && ( T00117_A487TBM36_SELECT_CRF_ID[0] < A487TBM36_SELECT_CRF_ID ) ) )
         {
            A484TBM36_STUDY_ID = T00117_A484TBM36_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
            A485TBM36_CRF_ID = T00117_A485TBM36_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
            A486TBM36_COND_NO = T00117_A486TBM36_COND_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
            A487TBM36_SELECT_CRF_ID = T00117_A487TBM36_SELECT_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
            RcdFound36 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1136( ) ;
      if ( RcdFound36 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM36_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM36_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A484TBM36_STUDY_ID != Z484TBM36_STUDY_ID ) || ( A485TBM36_CRF_ID != Z485TBM36_CRF_ID ) || ( A486TBM36_COND_NO != Z486TBM36_COND_NO ) || ( A487TBM36_SELECT_CRF_ID != Z487TBM36_SELECT_CRF_ID ) )
         {
            A484TBM36_STUDY_ID = Z484TBM36_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
            A485TBM36_CRF_ID = Z485TBM36_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
            A486TBM36_COND_NO = Z486TBM36_COND_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
            A487TBM36_SELECT_CRF_ID = Z487TBM36_SELECT_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM36_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM36_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBM36_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update1136( ) ;
            GX_FocusControl = edtTBM36_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A484TBM36_STUDY_ID != Z484TBM36_STUDY_ID ) || ( A485TBM36_CRF_ID != Z485TBM36_CRF_ID ) || ( A486TBM36_COND_NO != Z486TBM36_COND_NO ) || ( A487TBM36_SELECT_CRF_ID != Z487TBM36_SELECT_CRF_ID ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBM36_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert1136( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM36_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM36_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM36_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1136( ) ;
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
      if ( ( A484TBM36_STUDY_ID != Z484TBM36_STUDY_ID ) || ( A485TBM36_CRF_ID != Z485TBM36_CRF_ID ) || ( A486TBM36_COND_NO != Z486TBM36_COND_NO ) || ( A487TBM36_SELECT_CRF_ID != Z487TBM36_SELECT_CRF_ID ) )
      {
         A484TBM36_STUDY_ID = Z484TBM36_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
         A485TBM36_CRF_ID = Z485TBM36_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
         A486TBM36_COND_NO = Z486TBM36_COND_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
         A487TBM36_SELECT_CRF_ID = Z487TBM36_SELECT_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM36_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM36_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM36_STUDY_ID_Internalname ;
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
      if ( RcdFound36 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM36_STUDY_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBM36_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1136( ) ;
      if ( RcdFound36 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM36_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1136( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound36 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM36_DEL_FLG_Internalname ;
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
      if ( RcdFound36 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM36_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1136( ) ;
      if ( RcdFound36 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound36 != 0 )
         {
            scanNext1136( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM36_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1136( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1136( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00112 */
         pr_default.execute(0, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM36_CRF_SELECT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z489TBM36_CRT_DATETIME.equals( T00112_A489TBM36_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z490TBM36_CRT_USER_ID, T00112_A490TBM36_CRT_USER_ID[0]) != 0 ) || !( Z492TBM36_UPD_DATETIME.equals( T00112_A492TBM36_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z493TBM36_UPD_USER_ID, T00112_A493TBM36_UPD_USER_ID[0]) != 0 ) || ( Z495TBM36_UPD_CNT != T00112_A495TBM36_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z488TBM36_DEL_FLG, T00112_A488TBM36_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z491TBM36_CRT_PROG_NM, T00112_A491TBM36_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z494TBM36_UPD_PROG_NM, T00112_A494TBM36_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM36_CRF_SELECT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1136( )
   {
      beforeValidate1136( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1136( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1136( 0) ;
         checkOptimisticConcurrency1136( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1136( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1136( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00118 */
                  pr_default.execute(6, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID), new Boolean(n489TBM36_CRT_DATETIME), A489TBM36_CRT_DATETIME, new Boolean(n490TBM36_CRT_USER_ID), A490TBM36_CRT_USER_ID, new Boolean(n492TBM36_UPD_DATETIME), A492TBM36_UPD_DATETIME, new Boolean(n493TBM36_UPD_USER_ID), A493TBM36_UPD_USER_ID, new Boolean(n495TBM36_UPD_CNT), new Long(A495TBM36_UPD_CNT), new Boolean(n488TBM36_DEL_FLG), A488TBM36_DEL_FLG, new Boolean(n491TBM36_CRT_PROG_NM), A491TBM36_CRT_PROG_NM, new Boolean(n494TBM36_UPD_PROG_NM), A494TBM36_UPD_PROG_NM});
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
                        resetCaption110( ) ;
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
            load1136( ) ;
         }
         endLevel1136( ) ;
      }
      closeExtendedTableCursors1136( ) ;
   }

   public void update1136( )
   {
      beforeValidate1136( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1136( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1136( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1136( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1136( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00119 */
                  pr_default.execute(7, new Object[] {new Boolean(n489TBM36_CRT_DATETIME), A489TBM36_CRT_DATETIME, new Boolean(n490TBM36_CRT_USER_ID), A490TBM36_CRT_USER_ID, new Boolean(n492TBM36_UPD_DATETIME), A492TBM36_UPD_DATETIME, new Boolean(n493TBM36_UPD_USER_ID), A493TBM36_UPD_USER_ID, new Boolean(n495TBM36_UPD_CNT), new Long(A495TBM36_UPD_CNT), new Boolean(n488TBM36_DEL_FLG), A488TBM36_DEL_FLG, new Boolean(n491TBM36_CRT_PROG_NM), A491TBM36_CRT_PROG_NM, new Boolean(n494TBM36_UPD_PROG_NM), A494TBM36_UPD_PROG_NM, new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM36_CRF_SELECT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1136( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption110( ) ;
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
         endLevel1136( ) ;
      }
      closeExtendedTableCursors1136( ) ;
   }

   public void deferredUpdate1136( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1136( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1136( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1136( ) ;
         afterConfirm1136( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1136( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001110 */
               pr_default.execute(8, new Object[] {new Long(A484TBM36_STUDY_ID), new Short(A485TBM36_CRF_ID), new Short(A486TBM36_COND_NO), new Short(A487TBM36_SELECT_CRF_ID)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound36 == 0 )
                     {
                        initAll1136( ) ;
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
                     resetCaption110( ) ;
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
      sMode36 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1136( ) ;
      Gx_mode = sMode36 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1136( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM36_CRF_SELECT" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel1136( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1136( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm36_crf_select");
         if ( AnyError == 0 )
         {
            confirmValues110( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm36_crf_select");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1136( )
   {
      /* Using cursor T001111 */
      pr_default.execute(9);
      RcdFound36 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A484TBM36_STUDY_ID = T001111_A484TBM36_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
         A485TBM36_CRF_ID = T001111_A485TBM36_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
         A486TBM36_COND_NO = T001111_A486TBM36_COND_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
         A487TBM36_SELECT_CRF_ID = T001111_A487TBM36_SELECT_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1136( )
   {
      pr_default.readNext(9);
      RcdFound36 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound36 = (short)(1) ;
         A484TBM36_STUDY_ID = T001111_A484TBM36_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
         A485TBM36_CRF_ID = T001111_A485TBM36_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
         A486TBM36_COND_NO = T001111_A486TBM36_COND_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
         A487TBM36_SELECT_CRF_ID = T001111_A487TBM36_SELECT_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
      }
   }

   public void scanEnd1136( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1136( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1136( )
   {
      /* Before Insert Rules */
      A489TBM36_CRT_DATETIME = GXutil.now( ) ;
      n489TBM36_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A489TBM36_CRT_DATETIME", localUtil.ttoc( A489TBM36_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A490TBM36_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm36_crf_select_impl.this.GXt_char3 = GXv_char4[0] ;
      A490TBM36_CRT_USER_ID = GXt_char3 ;
      n490TBM36_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A490TBM36_CRT_USER_ID", A490TBM36_CRT_USER_ID);
      A492TBM36_UPD_DATETIME = GXutil.now( ) ;
      n492TBM36_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A492TBM36_UPD_DATETIME", localUtil.ttoc( A492TBM36_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A493TBM36_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm36_crf_select_impl.this.GXt_char3 = GXv_char4[0] ;
      A493TBM36_UPD_USER_ID = GXt_char3 ;
      n493TBM36_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A493TBM36_UPD_USER_ID", A493TBM36_UPD_USER_ID);
      A495TBM36_UPD_CNT = (long)(O495TBM36_UPD_CNT+1) ;
      n495TBM36_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A495TBM36_UPD_CNT", GXutil.ltrim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate1136( )
   {
      /* Before Update Rules */
      A492TBM36_UPD_DATETIME = GXutil.now( ) ;
      n492TBM36_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A492TBM36_UPD_DATETIME", localUtil.ttoc( A492TBM36_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A493TBM36_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm36_crf_select_impl.this.GXt_char3 = GXv_char4[0] ;
      A493TBM36_UPD_USER_ID = GXt_char3 ;
      n493TBM36_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A493TBM36_UPD_USER_ID", A493TBM36_UPD_USER_ID);
      A495TBM36_UPD_CNT = (long)(O495TBM36_UPD_CNT+1) ;
      n495TBM36_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A495TBM36_UPD_CNT", GXutil.ltrim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)));
   }

   public void beforeDelete1136( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1136( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1136( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1136( )
   {
      edtTBM36_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_STUDY_ID_Enabled, 5, 0)));
      edtTBM36_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_CRF_ID_Enabled, 5, 0)));
      edtTBM36_COND_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_COND_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_COND_NO_Enabled, 5, 0)));
      edtTBM36_SELECT_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_SELECT_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_SELECT_CRF_ID_Enabled, 5, 0)));
      edtTBM36_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_DEL_FLG_Enabled, 5, 0)));
      edtTBM36_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM36_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM36_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM36_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM36_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM36_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM36_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM36_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM36_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues110( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRF選択マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm36_crf_select") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1136( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z484TBM36_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z484TBM36_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z485TBM36_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z485TBM36_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z486TBM36_COND_NO", GXutil.ltrim( localUtil.ntoc( Z486TBM36_COND_NO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z487TBM36_SELECT_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z487TBM36_SELECT_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z489TBM36_CRT_DATETIME", localUtil.ttoc( Z489TBM36_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z490TBM36_CRT_USER_ID", GXutil.rtrim( Z490TBM36_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z492TBM36_UPD_DATETIME", localUtil.ttoc( Z492TBM36_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z493TBM36_UPD_USER_ID", GXutil.rtrim( Z493TBM36_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z495TBM36_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z495TBM36_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z488TBM36_DEL_FLG", GXutil.rtrim( Z488TBM36_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z491TBM36_CRT_PROG_NM", GXutil.rtrim( Z491TBM36_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z494TBM36_UPD_PROG_NM", GXutil.rtrim( Z494TBM36_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O495TBM36_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O495TBM36_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey1136( )
   {
      A489TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n489TBM36_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A489TBM36_CRT_DATETIME", localUtil.ttoc( A489TBM36_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n489TBM36_CRT_DATETIME = (GXutil.nullDate().equals(A489TBM36_CRT_DATETIME) ? true : false) ;
      A490TBM36_CRT_USER_ID = "" ;
      n490TBM36_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A490TBM36_CRT_USER_ID", A490TBM36_CRT_USER_ID);
      n490TBM36_CRT_USER_ID = ((GXutil.strcmp("", A490TBM36_CRT_USER_ID)==0) ? true : false) ;
      A492TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n492TBM36_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A492TBM36_UPD_DATETIME", localUtil.ttoc( A492TBM36_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n492TBM36_UPD_DATETIME = (GXutil.nullDate().equals(A492TBM36_UPD_DATETIME) ? true : false) ;
      A493TBM36_UPD_USER_ID = "" ;
      n493TBM36_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A493TBM36_UPD_USER_ID", A493TBM36_UPD_USER_ID);
      n493TBM36_UPD_USER_ID = ((GXutil.strcmp("", A493TBM36_UPD_USER_ID)==0) ? true : false) ;
      A495TBM36_UPD_CNT = 0 ;
      n495TBM36_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A495TBM36_UPD_CNT", GXutil.ltrim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)));
      n495TBM36_UPD_CNT = ((0==A495TBM36_UPD_CNT) ? true : false) ;
      A488TBM36_DEL_FLG = "" ;
      n488TBM36_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A488TBM36_DEL_FLG", A488TBM36_DEL_FLG);
      n488TBM36_DEL_FLG = ((GXutil.strcmp("", A488TBM36_DEL_FLG)==0) ? true : false) ;
      A491TBM36_CRT_PROG_NM = "" ;
      n491TBM36_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A491TBM36_CRT_PROG_NM", A491TBM36_CRT_PROG_NM);
      n491TBM36_CRT_PROG_NM = ((GXutil.strcmp("", A491TBM36_CRT_PROG_NM)==0) ? true : false) ;
      A494TBM36_UPD_PROG_NM = "" ;
      n494TBM36_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A494TBM36_UPD_PROG_NM", A494TBM36_UPD_PROG_NM);
      n494TBM36_UPD_PROG_NM = ((GXutil.strcmp("", A494TBM36_UPD_PROG_NM)==0) ? true : false) ;
      O495TBM36_UPD_CNT = A495TBM36_UPD_CNT ;
      n495TBM36_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A495TBM36_UPD_CNT", GXutil.ltrim( GXutil.str( A495TBM36_UPD_CNT, 10, 0)));
   }

   public void initAll1136( )
   {
      A484TBM36_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A484TBM36_STUDY_ID", GXutil.ltrim( GXutil.str( A484TBM36_STUDY_ID, 10, 0)));
      A485TBM36_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A485TBM36_CRF_ID", GXutil.ltrim( GXutil.str( A485TBM36_CRF_ID, 4, 0)));
      A486TBM36_COND_NO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A486TBM36_COND_NO", GXutil.ltrim( GXutil.str( A486TBM36_COND_NO, 4, 0)));
      A487TBM36_SELECT_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A487TBM36_SELECT_CRF_ID", GXutil.ltrim( GXutil.str( A487TBM36_SELECT_CRF_ID, 4, 0)));
      initializeNonKey1136( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14561759");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm36_crf_select.js", "?14561759");
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
      lblTextblocktbm36_study_id_Internalname = "TEXTBLOCKTBM36_STUDY_ID" ;
      edtTBM36_STUDY_ID_Internalname = "TBM36_STUDY_ID" ;
      lblTextblocktbm36_crf_id_Internalname = "TEXTBLOCKTBM36_CRF_ID" ;
      edtTBM36_CRF_ID_Internalname = "TBM36_CRF_ID" ;
      lblTextblocktbm36_cond_no_Internalname = "TEXTBLOCKTBM36_COND_NO" ;
      edtTBM36_COND_NO_Internalname = "TBM36_COND_NO" ;
      lblTextblocktbm36_select_crf_id_Internalname = "TEXTBLOCKTBM36_SELECT_CRF_ID" ;
      edtTBM36_SELECT_CRF_ID_Internalname = "TBM36_SELECT_CRF_ID" ;
      lblTextblocktbm36_del_flg_Internalname = "TEXTBLOCKTBM36_DEL_FLG" ;
      edtTBM36_DEL_FLG_Internalname = "TBM36_DEL_FLG" ;
      lblTextblocktbm36_crt_datetime_Internalname = "TEXTBLOCKTBM36_CRT_DATETIME" ;
      edtTBM36_CRT_DATETIME_Internalname = "TBM36_CRT_DATETIME" ;
      lblTextblocktbm36_crt_user_id_Internalname = "TEXTBLOCKTBM36_CRT_USER_ID" ;
      edtTBM36_CRT_USER_ID_Internalname = "TBM36_CRT_USER_ID" ;
      lblTextblocktbm36_crt_prog_nm_Internalname = "TEXTBLOCKTBM36_CRT_PROG_NM" ;
      edtTBM36_CRT_PROG_NM_Internalname = "TBM36_CRT_PROG_NM" ;
      lblTextblocktbm36_upd_datetime_Internalname = "TEXTBLOCKTBM36_UPD_DATETIME" ;
      edtTBM36_UPD_DATETIME_Internalname = "TBM36_UPD_DATETIME" ;
      lblTextblocktbm36_upd_user_id_Internalname = "TEXTBLOCKTBM36_UPD_USER_ID" ;
      edtTBM36_UPD_USER_ID_Internalname = "TBM36_UPD_USER_ID" ;
      lblTextblocktbm36_upd_prog_nm_Internalname = "TEXTBLOCKTBM36_UPD_PROG_NM" ;
      edtTBM36_UPD_PROG_NM_Internalname = "TBM36_UPD_PROG_NM" ;
      lblTextblocktbm36_upd_cnt_Internalname = "TEXTBLOCKTBM36_UPD_CNT" ;
      edtTBM36_UPD_CNT_Internalname = "TBM36_UPD_CNT" ;
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
      edtTBM36_UPD_CNT_Jsonclick = "" ;
      edtTBM36_UPD_CNT_Enabled = 1 ;
      edtTBM36_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM36_UPD_PROG_NM_Enabled = 1 ;
      edtTBM36_UPD_USER_ID_Jsonclick = "" ;
      edtTBM36_UPD_USER_ID_Enabled = 1 ;
      edtTBM36_UPD_DATETIME_Jsonclick = "" ;
      edtTBM36_UPD_DATETIME_Enabled = 1 ;
      edtTBM36_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM36_CRT_PROG_NM_Enabled = 1 ;
      edtTBM36_CRT_USER_ID_Jsonclick = "" ;
      edtTBM36_CRT_USER_ID_Enabled = 1 ;
      edtTBM36_CRT_DATETIME_Jsonclick = "" ;
      edtTBM36_CRT_DATETIME_Enabled = 1 ;
      edtTBM36_DEL_FLG_Jsonclick = "" ;
      edtTBM36_DEL_FLG_Enabled = 1 ;
      edtTBM36_SELECT_CRF_ID_Jsonclick = "" ;
      edtTBM36_SELECT_CRF_ID_Enabled = 1 ;
      edtTBM36_COND_NO_Jsonclick = "" ;
      edtTBM36_COND_NO_Enabled = 1 ;
      edtTBM36_CRF_ID_Jsonclick = "" ;
      edtTBM36_CRF_ID_Enabled = 1 ;
      edtTBM36_STUDY_ID_Jsonclick = "" ;
      edtTBM36_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm36_crt_user_id1136( String Gx_mode )
   {
      GXt_char3 = A490TBM36_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm36_crf_select_impl.this.GXt_char3 = GXv_char4[0] ;
      A490TBM36_CRT_USER_ID = GXt_char3 ;
      n490TBM36_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A490TBM36_CRT_USER_ID", A490TBM36_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A490TBM36_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm36_upd_user_id1136( String Gx_mode )
   {
      GXt_char3 = A493TBM36_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm36_crf_select_impl.this.GXt_char3 = GXv_char4[0] ;
      A493TBM36_UPD_USER_ID = GXt_char3 ;
      n493TBM36_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A493TBM36_UPD_USER_ID", A493TBM36_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A493TBM36_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM36_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm36_select_crf_id( long GX_Parm1 ,
                                          short GX_Parm2 ,
                                          short GX_Parm3 ,
                                          short GX_Parm4 ,
                                          java.util.Date GX_Parm5 ,
                                          String GX_Parm6 ,
                                          java.util.Date GX_Parm7 ,
                                          String GX_Parm8 ,
                                          long GX_Parm9 ,
                                          String GX_Parm10 ,
                                          String GX_Parm11 ,
                                          String GX_Parm12 )
   {
      A484TBM36_STUDY_ID = GX_Parm1 ;
      A485TBM36_CRF_ID = GX_Parm2 ;
      A486TBM36_COND_NO = GX_Parm3 ;
      A487TBM36_SELECT_CRF_ID = GX_Parm4 ;
      A489TBM36_CRT_DATETIME = GX_Parm5 ;
      n489TBM36_CRT_DATETIME = false ;
      A490TBM36_CRT_USER_ID = GX_Parm6 ;
      n490TBM36_CRT_USER_ID = false ;
      A492TBM36_UPD_DATETIME = GX_Parm7 ;
      n492TBM36_UPD_DATETIME = false ;
      A493TBM36_UPD_USER_ID = GX_Parm8 ;
      n493TBM36_UPD_USER_ID = false ;
      A495TBM36_UPD_CNT = GX_Parm9 ;
      n495TBM36_UPD_CNT = false ;
      A488TBM36_DEL_FLG = GX_Parm10 ;
      n488TBM36_DEL_FLG = false ;
      A491TBM36_CRT_PROG_NM = GX_Parm11 ;
      n491TBM36_CRT_PROG_NM = false ;
      A494TBM36_UPD_PROG_NM = GX_Parm12 ;
      n494TBM36_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A489TBM36_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A490TBM36_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A492TBM36_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A493TBM36_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A495TBM36_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A488TBM36_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A491TBM36_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A494TBM36_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z484TBM36_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z485TBM36_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z486TBM36_COND_NO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z487TBM36_SELECT_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z489TBM36_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z490TBM36_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z492TBM36_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z493TBM36_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z495TBM36_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z488TBM36_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z491TBM36_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z494TBM36_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O495TBM36_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1165 */
                  S1165 ();
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
      lblTextblocktbm36_study_id_Jsonclick = "" ;
      lblTextblocktbm36_crf_id_Jsonclick = "" ;
      lblTextblocktbm36_cond_no_Jsonclick = "" ;
      lblTextblocktbm36_select_crf_id_Jsonclick = "" ;
      lblTextblocktbm36_del_flg_Jsonclick = "" ;
      A488TBM36_DEL_FLG = "" ;
      lblTextblocktbm36_crt_datetime_Jsonclick = "" ;
      A489TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm36_crt_user_id_Jsonclick = "" ;
      A490TBM36_CRT_USER_ID = "" ;
      lblTextblocktbm36_crt_prog_nm_Jsonclick = "" ;
      A491TBM36_CRT_PROG_NM = "" ;
      lblTextblocktbm36_upd_datetime_Jsonclick = "" ;
      A492TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm36_upd_user_id_Jsonclick = "" ;
      A493TBM36_UPD_USER_ID = "" ;
      lblTextblocktbm36_upd_prog_nm_Jsonclick = "" ;
      A494TBM36_UPD_PROG_NM = "" ;
      lblTextblocktbm36_upd_cnt_Jsonclick = "" ;
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
      Z489TBM36_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z490TBM36_CRT_USER_ID = "" ;
      Z492TBM36_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z493TBM36_UPD_USER_ID = "" ;
      Z488TBM36_DEL_FLG = "" ;
      Z491TBM36_CRT_PROG_NM = "" ;
      Z494TBM36_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T00114_A484TBM36_STUDY_ID = new long[1] ;
      T00114_A485TBM36_CRF_ID = new short[1] ;
      T00114_A486TBM36_COND_NO = new short[1] ;
      T00114_A487TBM36_SELECT_CRF_ID = new short[1] ;
      T00114_A489TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00114_n489TBM36_CRT_DATETIME = new boolean[] {false} ;
      T00114_A490TBM36_CRT_USER_ID = new String[] {""} ;
      T00114_n490TBM36_CRT_USER_ID = new boolean[] {false} ;
      T00114_A492TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00114_n492TBM36_UPD_DATETIME = new boolean[] {false} ;
      T00114_A493TBM36_UPD_USER_ID = new String[] {""} ;
      T00114_n493TBM36_UPD_USER_ID = new boolean[] {false} ;
      T00114_A495TBM36_UPD_CNT = new long[1] ;
      T00114_n495TBM36_UPD_CNT = new boolean[] {false} ;
      T00114_A488TBM36_DEL_FLG = new String[] {""} ;
      T00114_n488TBM36_DEL_FLG = new boolean[] {false} ;
      T00114_A491TBM36_CRT_PROG_NM = new String[] {""} ;
      T00114_n491TBM36_CRT_PROG_NM = new boolean[] {false} ;
      T00114_A494TBM36_UPD_PROG_NM = new String[] {""} ;
      T00114_n494TBM36_UPD_PROG_NM = new boolean[] {false} ;
      T00115_A484TBM36_STUDY_ID = new long[1] ;
      T00115_A485TBM36_CRF_ID = new short[1] ;
      T00115_A486TBM36_COND_NO = new short[1] ;
      T00115_A487TBM36_SELECT_CRF_ID = new short[1] ;
      T00113_A484TBM36_STUDY_ID = new long[1] ;
      T00113_A485TBM36_CRF_ID = new short[1] ;
      T00113_A486TBM36_COND_NO = new short[1] ;
      T00113_A487TBM36_SELECT_CRF_ID = new short[1] ;
      T00113_A489TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00113_n489TBM36_CRT_DATETIME = new boolean[] {false} ;
      T00113_A490TBM36_CRT_USER_ID = new String[] {""} ;
      T00113_n490TBM36_CRT_USER_ID = new boolean[] {false} ;
      T00113_A492TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00113_n492TBM36_UPD_DATETIME = new boolean[] {false} ;
      T00113_A493TBM36_UPD_USER_ID = new String[] {""} ;
      T00113_n493TBM36_UPD_USER_ID = new boolean[] {false} ;
      T00113_A495TBM36_UPD_CNT = new long[1] ;
      T00113_n495TBM36_UPD_CNT = new boolean[] {false} ;
      T00113_A488TBM36_DEL_FLG = new String[] {""} ;
      T00113_n488TBM36_DEL_FLG = new boolean[] {false} ;
      T00113_A491TBM36_CRT_PROG_NM = new String[] {""} ;
      T00113_n491TBM36_CRT_PROG_NM = new boolean[] {false} ;
      T00113_A494TBM36_UPD_PROG_NM = new String[] {""} ;
      T00113_n494TBM36_UPD_PROG_NM = new boolean[] {false} ;
      sMode36 = "" ;
      T00116_A484TBM36_STUDY_ID = new long[1] ;
      T00116_A485TBM36_CRF_ID = new short[1] ;
      T00116_A486TBM36_COND_NO = new short[1] ;
      T00116_A487TBM36_SELECT_CRF_ID = new short[1] ;
      T00117_A484TBM36_STUDY_ID = new long[1] ;
      T00117_A485TBM36_CRF_ID = new short[1] ;
      T00117_A486TBM36_COND_NO = new short[1] ;
      T00117_A487TBM36_SELECT_CRF_ID = new short[1] ;
      T00112_A484TBM36_STUDY_ID = new long[1] ;
      T00112_A485TBM36_CRF_ID = new short[1] ;
      T00112_A486TBM36_COND_NO = new short[1] ;
      T00112_A487TBM36_SELECT_CRF_ID = new short[1] ;
      T00112_A489TBM36_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00112_n489TBM36_CRT_DATETIME = new boolean[] {false} ;
      T00112_A490TBM36_CRT_USER_ID = new String[] {""} ;
      T00112_n490TBM36_CRT_USER_ID = new boolean[] {false} ;
      T00112_A492TBM36_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00112_n492TBM36_UPD_DATETIME = new boolean[] {false} ;
      T00112_A493TBM36_UPD_USER_ID = new String[] {""} ;
      T00112_n493TBM36_UPD_USER_ID = new boolean[] {false} ;
      T00112_A495TBM36_UPD_CNT = new long[1] ;
      T00112_n495TBM36_UPD_CNT = new boolean[] {false} ;
      T00112_A488TBM36_DEL_FLG = new String[] {""} ;
      T00112_n488TBM36_DEL_FLG = new boolean[] {false} ;
      T00112_A491TBM36_CRT_PROG_NM = new String[] {""} ;
      T00112_n491TBM36_CRT_PROG_NM = new boolean[] {false} ;
      T00112_A494TBM36_UPD_PROG_NM = new String[] {""} ;
      T00112_n494TBM36_UPD_PROG_NM = new boolean[] {false} ;
      T001111_A484TBM36_STUDY_ID = new long[1] ;
      T001111_A485TBM36_CRF_ID = new short[1] ;
      T001111_A486TBM36_COND_NO = new short[1] ;
      T001111_A487TBM36_SELECT_CRF_ID = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm36_crf_select__default(),
         new Object[] {
             new Object[] {
            T00112_A484TBM36_STUDY_ID, T00112_A485TBM36_CRF_ID, T00112_A486TBM36_COND_NO, T00112_A487TBM36_SELECT_CRF_ID, T00112_A489TBM36_CRT_DATETIME, T00112_n489TBM36_CRT_DATETIME, T00112_A490TBM36_CRT_USER_ID, T00112_n490TBM36_CRT_USER_ID, T00112_A492TBM36_UPD_DATETIME, T00112_n492TBM36_UPD_DATETIME,
            T00112_A493TBM36_UPD_USER_ID, T00112_n493TBM36_UPD_USER_ID, T00112_A495TBM36_UPD_CNT, T00112_n495TBM36_UPD_CNT, T00112_A488TBM36_DEL_FLG, T00112_n488TBM36_DEL_FLG, T00112_A491TBM36_CRT_PROG_NM, T00112_n491TBM36_CRT_PROG_NM, T00112_A494TBM36_UPD_PROG_NM, T00112_n494TBM36_UPD_PROG_NM
            }
            , new Object[] {
            T00113_A484TBM36_STUDY_ID, T00113_A485TBM36_CRF_ID, T00113_A486TBM36_COND_NO, T00113_A487TBM36_SELECT_CRF_ID, T00113_A489TBM36_CRT_DATETIME, T00113_n489TBM36_CRT_DATETIME, T00113_A490TBM36_CRT_USER_ID, T00113_n490TBM36_CRT_USER_ID, T00113_A492TBM36_UPD_DATETIME, T00113_n492TBM36_UPD_DATETIME,
            T00113_A493TBM36_UPD_USER_ID, T00113_n493TBM36_UPD_USER_ID, T00113_A495TBM36_UPD_CNT, T00113_n495TBM36_UPD_CNT, T00113_A488TBM36_DEL_FLG, T00113_n488TBM36_DEL_FLG, T00113_A491TBM36_CRT_PROG_NM, T00113_n491TBM36_CRT_PROG_NM, T00113_A494TBM36_UPD_PROG_NM, T00113_n494TBM36_UPD_PROG_NM
            }
            , new Object[] {
            T00114_A484TBM36_STUDY_ID, T00114_A485TBM36_CRF_ID, T00114_A486TBM36_COND_NO, T00114_A487TBM36_SELECT_CRF_ID, T00114_A489TBM36_CRT_DATETIME, T00114_n489TBM36_CRT_DATETIME, T00114_A490TBM36_CRT_USER_ID, T00114_n490TBM36_CRT_USER_ID, T00114_A492TBM36_UPD_DATETIME, T00114_n492TBM36_UPD_DATETIME,
            T00114_A493TBM36_UPD_USER_ID, T00114_n493TBM36_UPD_USER_ID, T00114_A495TBM36_UPD_CNT, T00114_n495TBM36_UPD_CNT, T00114_A488TBM36_DEL_FLG, T00114_n488TBM36_DEL_FLG, T00114_A491TBM36_CRT_PROG_NM, T00114_n491TBM36_CRT_PROG_NM, T00114_A494TBM36_UPD_PROG_NM, T00114_n494TBM36_UPD_PROG_NM
            }
            , new Object[] {
            T00115_A484TBM36_STUDY_ID, T00115_A485TBM36_CRF_ID, T00115_A486TBM36_COND_NO, T00115_A487TBM36_SELECT_CRF_ID
            }
            , new Object[] {
            T00116_A484TBM36_STUDY_ID, T00116_A485TBM36_CRF_ID, T00116_A486TBM36_COND_NO, T00116_A487TBM36_SELECT_CRF_ID
            }
            , new Object[] {
            T00117_A484TBM36_STUDY_ID, T00117_A485TBM36_CRF_ID, T00117_A486TBM36_COND_NO, T00117_A487TBM36_SELECT_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001111_A484TBM36_STUDY_ID, T001111_A485TBM36_CRF_ID, T001111_A486TBM36_COND_NO, T001111_A487TBM36_SELECT_CRF_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM36_CRF_SELECT" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A485TBM36_CRF_ID ;
   private short A486TBM36_COND_NO ;
   private short A487TBM36_SELECT_CRF_ID ;
   private short Z485TBM36_CRF_ID ;
   private short Z486TBM36_COND_NO ;
   private short Z487TBM36_SELECT_CRF_ID ;
   private short RcdFound36 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM36_STUDY_ID_Enabled ;
   private int edtTBM36_CRF_ID_Enabled ;
   private int edtTBM36_COND_NO_Enabled ;
   private int edtTBM36_SELECT_CRF_ID_Enabled ;
   private int edtTBM36_DEL_FLG_Enabled ;
   private int edtTBM36_CRT_DATETIME_Enabled ;
   private int edtTBM36_CRT_USER_ID_Enabled ;
   private int edtTBM36_CRT_PROG_NM_Enabled ;
   private int edtTBM36_UPD_DATETIME_Enabled ;
   private int edtTBM36_UPD_USER_ID_Enabled ;
   private int edtTBM36_UPD_PROG_NM_Enabled ;
   private int edtTBM36_UPD_CNT_Enabled ;
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
   private long A484TBM36_STUDY_ID ;
   private long A495TBM36_UPD_CNT ;
   private long Z484TBM36_STUDY_ID ;
   private long Z495TBM36_UPD_CNT ;
   private long O495TBM36_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM36_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm36_study_id_Internalname ;
   private String lblTextblocktbm36_study_id_Jsonclick ;
   private String edtTBM36_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm36_crf_id_Internalname ;
   private String lblTextblocktbm36_crf_id_Jsonclick ;
   private String edtTBM36_CRF_ID_Internalname ;
   private String edtTBM36_CRF_ID_Jsonclick ;
   private String lblTextblocktbm36_cond_no_Internalname ;
   private String lblTextblocktbm36_cond_no_Jsonclick ;
   private String edtTBM36_COND_NO_Internalname ;
   private String edtTBM36_COND_NO_Jsonclick ;
   private String lblTextblocktbm36_select_crf_id_Internalname ;
   private String lblTextblocktbm36_select_crf_id_Jsonclick ;
   private String edtTBM36_SELECT_CRF_ID_Internalname ;
   private String edtTBM36_SELECT_CRF_ID_Jsonclick ;
   private String lblTextblocktbm36_del_flg_Internalname ;
   private String lblTextblocktbm36_del_flg_Jsonclick ;
   private String edtTBM36_DEL_FLG_Internalname ;
   private String edtTBM36_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm36_crt_datetime_Internalname ;
   private String lblTextblocktbm36_crt_datetime_Jsonclick ;
   private String edtTBM36_CRT_DATETIME_Internalname ;
   private String edtTBM36_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm36_crt_user_id_Internalname ;
   private String lblTextblocktbm36_crt_user_id_Jsonclick ;
   private String edtTBM36_CRT_USER_ID_Internalname ;
   private String edtTBM36_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm36_crt_prog_nm_Internalname ;
   private String lblTextblocktbm36_crt_prog_nm_Jsonclick ;
   private String edtTBM36_CRT_PROG_NM_Internalname ;
   private String edtTBM36_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm36_upd_datetime_Internalname ;
   private String lblTextblocktbm36_upd_datetime_Jsonclick ;
   private String edtTBM36_UPD_DATETIME_Internalname ;
   private String edtTBM36_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm36_upd_user_id_Internalname ;
   private String lblTextblocktbm36_upd_user_id_Jsonclick ;
   private String edtTBM36_UPD_USER_ID_Internalname ;
   private String edtTBM36_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm36_upd_prog_nm_Internalname ;
   private String lblTextblocktbm36_upd_prog_nm_Jsonclick ;
   private String edtTBM36_UPD_PROG_NM_Internalname ;
   private String edtTBM36_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm36_upd_cnt_Internalname ;
   private String lblTextblocktbm36_upd_cnt_Jsonclick ;
   private String edtTBM36_UPD_CNT_Internalname ;
   private String edtTBM36_UPD_CNT_Jsonclick ;
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
   private String sMode36 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A489TBM36_CRT_DATETIME ;
   private java.util.Date A492TBM36_UPD_DATETIME ;
   private java.util.Date Z489TBM36_CRT_DATETIME ;
   private java.util.Date Z492TBM36_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n488TBM36_DEL_FLG ;
   private boolean n489TBM36_CRT_DATETIME ;
   private boolean n490TBM36_CRT_USER_ID ;
   private boolean n491TBM36_CRT_PROG_NM ;
   private boolean n492TBM36_UPD_DATETIME ;
   private boolean n493TBM36_UPD_USER_ID ;
   private boolean n494TBM36_UPD_PROG_NM ;
   private boolean n495TBM36_UPD_CNT ;
   private boolean Gx_longc ;
   private String A488TBM36_DEL_FLG ;
   private String A490TBM36_CRT_USER_ID ;
   private String A491TBM36_CRT_PROG_NM ;
   private String A493TBM36_UPD_USER_ID ;
   private String A494TBM36_UPD_PROG_NM ;
   private String Z490TBM36_CRT_USER_ID ;
   private String Z493TBM36_UPD_USER_ID ;
   private String Z488TBM36_DEL_FLG ;
   private String Z491TBM36_CRT_PROG_NM ;
   private String Z494TBM36_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T00114_A484TBM36_STUDY_ID ;
   private short[] T00114_A485TBM36_CRF_ID ;
   private short[] T00114_A486TBM36_COND_NO ;
   private short[] T00114_A487TBM36_SELECT_CRF_ID ;
   private java.util.Date[] T00114_A489TBM36_CRT_DATETIME ;
   private boolean[] T00114_n489TBM36_CRT_DATETIME ;
   private String[] T00114_A490TBM36_CRT_USER_ID ;
   private boolean[] T00114_n490TBM36_CRT_USER_ID ;
   private java.util.Date[] T00114_A492TBM36_UPD_DATETIME ;
   private boolean[] T00114_n492TBM36_UPD_DATETIME ;
   private String[] T00114_A493TBM36_UPD_USER_ID ;
   private boolean[] T00114_n493TBM36_UPD_USER_ID ;
   private long[] T00114_A495TBM36_UPD_CNT ;
   private boolean[] T00114_n495TBM36_UPD_CNT ;
   private String[] T00114_A488TBM36_DEL_FLG ;
   private boolean[] T00114_n488TBM36_DEL_FLG ;
   private String[] T00114_A491TBM36_CRT_PROG_NM ;
   private boolean[] T00114_n491TBM36_CRT_PROG_NM ;
   private String[] T00114_A494TBM36_UPD_PROG_NM ;
   private boolean[] T00114_n494TBM36_UPD_PROG_NM ;
   private long[] T00115_A484TBM36_STUDY_ID ;
   private short[] T00115_A485TBM36_CRF_ID ;
   private short[] T00115_A486TBM36_COND_NO ;
   private short[] T00115_A487TBM36_SELECT_CRF_ID ;
   private long[] T00113_A484TBM36_STUDY_ID ;
   private short[] T00113_A485TBM36_CRF_ID ;
   private short[] T00113_A486TBM36_COND_NO ;
   private short[] T00113_A487TBM36_SELECT_CRF_ID ;
   private java.util.Date[] T00113_A489TBM36_CRT_DATETIME ;
   private boolean[] T00113_n489TBM36_CRT_DATETIME ;
   private String[] T00113_A490TBM36_CRT_USER_ID ;
   private boolean[] T00113_n490TBM36_CRT_USER_ID ;
   private java.util.Date[] T00113_A492TBM36_UPD_DATETIME ;
   private boolean[] T00113_n492TBM36_UPD_DATETIME ;
   private String[] T00113_A493TBM36_UPD_USER_ID ;
   private boolean[] T00113_n493TBM36_UPD_USER_ID ;
   private long[] T00113_A495TBM36_UPD_CNT ;
   private boolean[] T00113_n495TBM36_UPD_CNT ;
   private String[] T00113_A488TBM36_DEL_FLG ;
   private boolean[] T00113_n488TBM36_DEL_FLG ;
   private String[] T00113_A491TBM36_CRT_PROG_NM ;
   private boolean[] T00113_n491TBM36_CRT_PROG_NM ;
   private String[] T00113_A494TBM36_UPD_PROG_NM ;
   private boolean[] T00113_n494TBM36_UPD_PROG_NM ;
   private long[] T00116_A484TBM36_STUDY_ID ;
   private short[] T00116_A485TBM36_CRF_ID ;
   private short[] T00116_A486TBM36_COND_NO ;
   private short[] T00116_A487TBM36_SELECT_CRF_ID ;
   private long[] T00117_A484TBM36_STUDY_ID ;
   private short[] T00117_A485TBM36_CRF_ID ;
   private short[] T00117_A486TBM36_COND_NO ;
   private short[] T00117_A487TBM36_SELECT_CRF_ID ;
   private long[] T00112_A484TBM36_STUDY_ID ;
   private short[] T00112_A485TBM36_CRF_ID ;
   private short[] T00112_A486TBM36_COND_NO ;
   private short[] T00112_A487TBM36_SELECT_CRF_ID ;
   private java.util.Date[] T00112_A489TBM36_CRT_DATETIME ;
   private boolean[] T00112_n489TBM36_CRT_DATETIME ;
   private String[] T00112_A490TBM36_CRT_USER_ID ;
   private boolean[] T00112_n490TBM36_CRT_USER_ID ;
   private java.util.Date[] T00112_A492TBM36_UPD_DATETIME ;
   private boolean[] T00112_n492TBM36_UPD_DATETIME ;
   private String[] T00112_A493TBM36_UPD_USER_ID ;
   private boolean[] T00112_n493TBM36_UPD_USER_ID ;
   private long[] T00112_A495TBM36_UPD_CNT ;
   private boolean[] T00112_n495TBM36_UPD_CNT ;
   private String[] T00112_A488TBM36_DEL_FLG ;
   private boolean[] T00112_n488TBM36_DEL_FLG ;
   private String[] T00112_A491TBM36_CRT_PROG_NM ;
   private boolean[] T00112_n491TBM36_CRT_PROG_NM ;
   private String[] T00112_A494TBM36_UPD_PROG_NM ;
   private boolean[] T00112_n494TBM36_UPD_PROG_NM ;
   private long[] T001111_A484TBM36_STUDY_ID ;
   private short[] T001111_A485TBM36_CRF_ID ;
   private short[] T001111_A486TBM36_COND_NO ;
   private short[] T001111_A487TBM36_SELECT_CRF_ID ;
}

final  class tbm36_crf_select__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00112", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_CNT`, `TBM36_DEL_FLG`, `TBM36_CRT_PROG_NM`, `TBM36_UPD_PROG_NM` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00113", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_CNT`, `TBM36_DEL_FLG`, `TBM36_CRT_PROG_NM`, `TBM36_UPD_PROG_NM` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00114", "SELECT TM1.`TBM36_STUDY_ID`, TM1.`TBM36_CRF_ID`, TM1.`TBM36_COND_NO`, TM1.`TBM36_SELECT_CRF_ID`, TM1.`TBM36_CRT_DATETIME`, TM1.`TBM36_CRT_USER_ID`, TM1.`TBM36_UPD_DATETIME`, TM1.`TBM36_UPD_USER_ID`, TM1.`TBM36_UPD_CNT`, TM1.`TBM36_DEL_FLG`, TM1.`TBM36_CRT_PROG_NM`, TM1.`TBM36_UPD_PROG_NM` FROM `TBM36_CRF_SELECT` TM1 WHERE TM1.`TBM36_STUDY_ID` = ? and TM1.`TBM36_CRF_ID` = ? and TM1.`TBM36_COND_NO` = ? and TM1.`TBM36_SELECT_CRF_ID` = ? ORDER BY TM1.`TBM36_STUDY_ID`, TM1.`TBM36_CRF_ID`, TM1.`TBM36_COND_NO`, TM1.`TBM36_SELECT_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T00115", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID` FROM `TBM36_CRF_SELECT` WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00116", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID` FROM `TBM36_CRF_SELECT` WHERE ( `TBM36_STUDY_ID` > ? or `TBM36_STUDY_ID` = ? and `TBM36_CRF_ID` > ? or `TBM36_CRF_ID` = ? and `TBM36_STUDY_ID` = ? and `TBM36_COND_NO` > ? or `TBM36_COND_NO` = ? and `TBM36_CRF_ID` = ? and `TBM36_STUDY_ID` = ? and `TBM36_SELECT_CRF_ID` > ?) ORDER BY `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00117", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID` FROM `TBM36_CRF_SELECT` WHERE ( `TBM36_STUDY_ID` < ? or `TBM36_STUDY_ID` = ? and `TBM36_CRF_ID` < ? or `TBM36_CRF_ID` = ? and `TBM36_STUDY_ID` = ? and `TBM36_COND_NO` < ? or `TBM36_COND_NO` = ? and `TBM36_CRF_ID` = ? and `TBM36_STUDY_ID` = ? and `TBM36_SELECT_CRF_ID` < ?) ORDER BY `TBM36_STUDY_ID` DESC, `TBM36_CRF_ID` DESC, `TBM36_COND_NO` DESC, `TBM36_SELECT_CRF_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00118", "INSERT INTO `TBM36_CRF_SELECT` (`TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID`, `TBM36_CRT_DATETIME`, `TBM36_CRT_USER_ID`, `TBM36_UPD_DATETIME`, `TBM36_UPD_USER_ID`, `TBM36_UPD_CNT`, `TBM36_DEL_FLG`, `TBM36_CRT_PROG_NM`, `TBM36_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00119", "UPDATE `TBM36_CRF_SELECT` SET `TBM36_CRT_DATETIME`=?, `TBM36_CRT_USER_ID`=?, `TBM36_UPD_DATETIME`=?, `TBM36_UPD_USER_ID`=?, `TBM36_UPD_CNT`=?, `TBM36_DEL_FLG`=?, `TBM36_CRT_PROG_NM`=?, `TBM36_UPD_PROG_NM`=?  WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T001110", "DELETE FROM `TBM36_CRF_SELECT`  WHERE `TBM36_STUDY_ID` = ? AND `TBM36_CRF_ID` = ? AND `TBM36_COND_NO` = ? AND `TBM36_SELECT_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T001111", "SELECT `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID` FROM `TBM36_CRF_SELECT` ORDER BY `TBM36_STUDY_ID`, `TBM36_CRF_ID`, `TBM36_COND_NO`, `TBM36_SELECT_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
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
                  stmt.setVarchar(11, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 40);
               }
               stmt.setLong(9, ((Number) parms[16]).longValue());
               stmt.setShort(10, ((Number) parms[17]).shortValue());
               stmt.setShort(11, ((Number) parms[18]).shortValue());
               stmt.setShort(12, ((Number) parms[19]).shortValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
      }
   }

}

