/*
               File: tbm07_auth_behavior_impl
        Description: 権限別振舞マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:36.39
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm07_auth_behavior_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM07_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm07_crt_user_id1439( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM07_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm07_upd_user_id1439( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A530TBM07_AUTH_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A530TBM07_AUTH_CD) ;
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
      Form.getMeta().addItem("Description", "権限別振舞マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbm07_auth_behavior_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm07_auth_behavior_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm07_auth_behavior_impl.class ));
   }

   public tbm07_auth_behavior_impl( int remoteHandle ,
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
         wb_table1_2_1439( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1439e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1439( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1439( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1439( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1439e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"権限別振舞マスタ"+"</legend>") ;
         wb_table3_27_1439( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1439e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1439e( true) ;
      }
      else
      {
         wb_table1_2_1439e( false) ;
      }
   }

   public void wb_table3_27_1439( boolean wbgen )
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
         wb_table4_33_1439( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1439e( boolean wbgen )
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
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1439e( true) ;
      }
      else
      {
         wb_table3_27_1439e( false) ;
      }
   }

   public void wb_table4_33_1439( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_auth_cd_Internalname, "権限コード", "", "", lblTextblocktbm07_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_AUTH_CD_Internalname, GXutil.rtrim( A530TBM07_AUTH_CD), GXutil.rtrim( localUtil.format( A530TBM07_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM07_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_crf_inp_auth_flg_Internalname, "ＣＲＦ入力権限フラグ", "", "", lblTextblocktbm07_crf_inp_auth_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A531TBM07_CRF_INP_AUTH_FLG", A531TBM07_CRF_INP_AUTH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_CRF_INP_AUTH_FLG_Internalname, GXutil.rtrim( A531TBM07_CRF_INP_AUTH_FLG), GXutil.rtrim( localUtil.format( A531TBM07_CRF_INP_AUTH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM07_CRF_INP_AUTH_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_CRF_INP_AUTH_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_crf_edit_auth_flg_Internalname, "ＣＲＦ修正権限フラグ", "", "", lblTextblocktbm07_crf_edit_auth_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A532TBM07_CRF_EDIT_AUTH_FLG", A532TBM07_CRF_EDIT_AUTH_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_CRF_EDIT_AUTH_FLG_Internalname, GXutil.rtrim( A532TBM07_CRF_EDIT_AUTH_FLG), GXutil.rtrim( localUtil.format( A532TBM07_CRF_EDIT_AUTH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM07_CRF_EDIT_AUTH_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_CRF_EDIT_AUTH_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_other_site_view_flg_Internalname, "他施設参照フラグ", "", "", lblTextblocktbm07_other_site_view_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A533TBM07_OTHER_SITE_VIEW_FLG", A533TBM07_OTHER_SITE_VIEW_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_OTHER_SITE_VIEW_FLG_Internalname, GXutil.rtrim( A533TBM07_OTHER_SITE_VIEW_FLG), GXutil.rtrim( localUtil.format( A533TBM07_OTHER_SITE_VIEW_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM07_OTHER_SITE_VIEW_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_OTHER_SITE_VIEW_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm07_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A534TBM07_DEL_FLG", A534TBM07_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_DEL_FLG_Internalname, GXutil.rtrim( A534TBM07_DEL_FLG), GXutil.rtrim( localUtil.format( A534TBM07_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM07_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm07_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A535TBM07_CRT_DATETIME", localUtil.ttoc( A535TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM07_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_CRT_DATETIME_Internalname, localUtil.format(A535TBM07_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A535TBM07_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM07_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM07_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM07_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_crt_user_id_Internalname, "ID", "", "", lblTextblocktbm07_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A536TBM07_CRT_USER_ID", A536TBM07_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_CRT_USER_ID_Internalname, GXutil.rtrim( A536TBM07_CRT_USER_ID), GXutil.rtrim( localUtil.format( A536TBM07_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM07_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm07_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A537TBM07_CRT_PROG_NM", A537TBM07_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_CRT_PROG_NM_Internalname, GXutil.rtrim( A537TBM07_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A537TBM07_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM07_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm07_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A538TBM07_UPD_DATETIME", localUtil.ttoc( A538TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM07_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_UPD_DATETIME_Internalname, localUtil.format(A538TBM07_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A538TBM07_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM07_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM07_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM07_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_upd_user_id_Internalname, "ID", "", "", lblTextblocktbm07_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A539TBM07_UPD_USER_ID", A539TBM07_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_UPD_USER_ID_Internalname, GXutil.rtrim( A539TBM07_UPD_USER_ID), GXutil.rtrim( localUtil.format( A539TBM07_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM07_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm07_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A540TBM07_UPD_PROG_NM", A540TBM07_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_UPD_PROG_NM_Internalname, GXutil.rtrim( A540TBM07_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A540TBM07_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM07_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm07_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm07_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A541TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM07_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A541TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM07_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A541TBM07_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A541TBM07_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM07_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM07_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1439e( true) ;
      }
      else
      {
         wb_table4_33_1439e( false) ;
      }
   }

   public void wb_table2_5_1439( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM07_AUTH_BEHAVIOR.htm");
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
         wb_table2_5_1439e( true) ;
      }
      else
      {
         wb_table2_5_1439e( false) ;
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
      /* Execute user event: e11142 */
      e11142 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A530TBM07_AUTH_CD = httpContext.cgiGet( edtTBM07_AUTH_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
            A531TBM07_CRF_INP_AUTH_FLG = httpContext.cgiGet( edtTBM07_CRF_INP_AUTH_FLG_Internalname) ;
            n531TBM07_CRF_INP_AUTH_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A531TBM07_CRF_INP_AUTH_FLG", A531TBM07_CRF_INP_AUTH_FLG);
            n531TBM07_CRF_INP_AUTH_FLG = ((GXutil.strcmp("", A531TBM07_CRF_INP_AUTH_FLG)==0) ? true : false) ;
            A532TBM07_CRF_EDIT_AUTH_FLG = httpContext.cgiGet( edtTBM07_CRF_EDIT_AUTH_FLG_Internalname) ;
            n532TBM07_CRF_EDIT_AUTH_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A532TBM07_CRF_EDIT_AUTH_FLG", A532TBM07_CRF_EDIT_AUTH_FLG);
            n532TBM07_CRF_EDIT_AUTH_FLG = ((GXutil.strcmp("", A532TBM07_CRF_EDIT_AUTH_FLG)==0) ? true : false) ;
            A533TBM07_OTHER_SITE_VIEW_FLG = httpContext.cgiGet( edtTBM07_OTHER_SITE_VIEW_FLG_Internalname) ;
            n533TBM07_OTHER_SITE_VIEW_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A533TBM07_OTHER_SITE_VIEW_FLG", A533TBM07_OTHER_SITE_VIEW_FLG);
            n533TBM07_OTHER_SITE_VIEW_FLG = ((GXutil.strcmp("", A533TBM07_OTHER_SITE_VIEW_FLG)==0) ? true : false) ;
            A534TBM07_DEL_FLG = httpContext.cgiGet( edtTBM07_DEL_FLG_Internalname) ;
            n534TBM07_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A534TBM07_DEL_FLG", A534TBM07_DEL_FLG);
            n534TBM07_DEL_FLG = ((GXutil.strcmp("", A534TBM07_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM07_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM07_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM07_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A535TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n535TBM07_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A535TBM07_CRT_DATETIME", localUtil.ttoc( A535TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A535TBM07_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM07_CRT_DATETIME_Internalname)) ;
               n535TBM07_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A535TBM07_CRT_DATETIME", localUtil.ttoc( A535TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n535TBM07_CRT_DATETIME = (GXutil.nullDate().equals(A535TBM07_CRT_DATETIME) ? true : false) ;
            A536TBM07_CRT_USER_ID = httpContext.cgiGet( edtTBM07_CRT_USER_ID_Internalname) ;
            n536TBM07_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A536TBM07_CRT_USER_ID", A536TBM07_CRT_USER_ID);
            n536TBM07_CRT_USER_ID = ((GXutil.strcmp("", A536TBM07_CRT_USER_ID)==0) ? true : false) ;
            A537TBM07_CRT_PROG_NM = httpContext.cgiGet( edtTBM07_CRT_PROG_NM_Internalname) ;
            n537TBM07_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A537TBM07_CRT_PROG_NM", A537TBM07_CRT_PROG_NM);
            n537TBM07_CRT_PROG_NM = ((GXutil.strcmp("", A537TBM07_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM07_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM07_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM07_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A538TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n538TBM07_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A538TBM07_UPD_DATETIME", localUtil.ttoc( A538TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A538TBM07_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM07_UPD_DATETIME_Internalname)) ;
               n538TBM07_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A538TBM07_UPD_DATETIME", localUtil.ttoc( A538TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n538TBM07_UPD_DATETIME = (GXutil.nullDate().equals(A538TBM07_UPD_DATETIME) ? true : false) ;
            A539TBM07_UPD_USER_ID = httpContext.cgiGet( edtTBM07_UPD_USER_ID_Internalname) ;
            n539TBM07_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A539TBM07_UPD_USER_ID", A539TBM07_UPD_USER_ID);
            n539TBM07_UPD_USER_ID = ((GXutil.strcmp("", A539TBM07_UPD_USER_ID)==0) ? true : false) ;
            A540TBM07_UPD_PROG_NM = httpContext.cgiGet( edtTBM07_UPD_PROG_NM_Internalname) ;
            n540TBM07_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A540TBM07_UPD_PROG_NM", A540TBM07_UPD_PROG_NM);
            n540TBM07_UPD_PROG_NM = ((GXutil.strcmp("", A540TBM07_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM07_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM07_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM07_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM07_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A541TBM07_UPD_CNT = 0 ;
               n541TBM07_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A541TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)));
            }
            else
            {
               A541TBM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM07_UPD_CNT_Internalname), ".", ",") ;
               n541TBM07_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A541TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)));
            }
            n541TBM07_UPD_CNT = ((0==A541TBM07_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z530TBM07_AUTH_CD = httpContext.cgiGet( "Z530TBM07_AUTH_CD") ;
            Z535TBM07_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z535TBM07_CRT_DATETIME"), 0) ;
            n535TBM07_CRT_DATETIME = (GXutil.nullDate().equals(A535TBM07_CRT_DATETIME) ? true : false) ;
            Z536TBM07_CRT_USER_ID = httpContext.cgiGet( "Z536TBM07_CRT_USER_ID") ;
            n536TBM07_CRT_USER_ID = ((GXutil.strcmp("", A536TBM07_CRT_USER_ID)==0) ? true : false) ;
            Z538TBM07_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z538TBM07_UPD_DATETIME"), 0) ;
            n538TBM07_UPD_DATETIME = (GXutil.nullDate().equals(A538TBM07_UPD_DATETIME) ? true : false) ;
            Z539TBM07_UPD_USER_ID = httpContext.cgiGet( "Z539TBM07_UPD_USER_ID") ;
            n539TBM07_UPD_USER_ID = ((GXutil.strcmp("", A539TBM07_UPD_USER_ID)==0) ? true : false) ;
            Z541TBM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z541TBM07_UPD_CNT"), ".", ",") ;
            n541TBM07_UPD_CNT = ((0==A541TBM07_UPD_CNT) ? true : false) ;
            Z531TBM07_CRF_INP_AUTH_FLG = httpContext.cgiGet( "Z531TBM07_CRF_INP_AUTH_FLG") ;
            n531TBM07_CRF_INP_AUTH_FLG = ((GXutil.strcmp("", A531TBM07_CRF_INP_AUTH_FLG)==0) ? true : false) ;
            Z532TBM07_CRF_EDIT_AUTH_FLG = httpContext.cgiGet( "Z532TBM07_CRF_EDIT_AUTH_FLG") ;
            n532TBM07_CRF_EDIT_AUTH_FLG = ((GXutil.strcmp("", A532TBM07_CRF_EDIT_AUTH_FLG)==0) ? true : false) ;
            Z533TBM07_OTHER_SITE_VIEW_FLG = httpContext.cgiGet( "Z533TBM07_OTHER_SITE_VIEW_FLG") ;
            n533TBM07_OTHER_SITE_VIEW_FLG = ((GXutil.strcmp("", A533TBM07_OTHER_SITE_VIEW_FLG)==0) ? true : false) ;
            Z534TBM07_DEL_FLG = httpContext.cgiGet( "Z534TBM07_DEL_FLG") ;
            n534TBM07_DEL_FLG = ((GXutil.strcmp("", A534TBM07_DEL_FLG)==0) ? true : false) ;
            Z537TBM07_CRT_PROG_NM = httpContext.cgiGet( "Z537TBM07_CRT_PROG_NM") ;
            n537TBM07_CRT_PROG_NM = ((GXutil.strcmp("", A537TBM07_CRT_PROG_NM)==0) ? true : false) ;
            Z540TBM07_UPD_PROG_NM = httpContext.cgiGet( "Z540TBM07_UPD_PROG_NM") ;
            n540TBM07_UPD_PROG_NM = ((GXutil.strcmp("", A540TBM07_UPD_PROG_NM)==0) ? true : false) ;
            O541TBM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O541TBM07_UPD_CNT"), ".", ",") ;
            n541TBM07_UPD_CNT = ((0==A541TBM07_UPD_CNT) ? true : false) ;
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
               A530TBM07_AUTH_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
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
                     /* Execute user event: e11142 */
                     e11142 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12142 */
                     e12142 ();
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
         /* Execute user event: e12142 */
         e12142 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1439( ) ;
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
      disableAttributes1439( ) ;
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

   public void resetCaption140( )
   {
   }

   public void e11142( )
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

   public void e12142( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "権限コード:" + A530TBM07_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A531TBM07_CRF_INP_AUTH_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A532TBM07_CRF_EDIT_AUTH_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A533TBM07_OTHER_SITE_VIEW_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A534TBM07_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A535TBM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm07_auth_behavior_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A535TBM07_CRT_DATETIME", localUtil.ttoc( A535TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A536TBM07_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A537TBM07_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A538TBM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm07_auth_behavior_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A538TBM07_UPD_DATETIME", localUtil.ttoc( A538TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A539TBM07_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A540TBM07_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm1439( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z535TBM07_CRT_DATETIME = T00143_A535TBM07_CRT_DATETIME[0] ;
            Z536TBM07_CRT_USER_ID = T00143_A536TBM07_CRT_USER_ID[0] ;
            Z538TBM07_UPD_DATETIME = T00143_A538TBM07_UPD_DATETIME[0] ;
            Z539TBM07_UPD_USER_ID = T00143_A539TBM07_UPD_USER_ID[0] ;
            Z541TBM07_UPD_CNT = T00143_A541TBM07_UPD_CNT[0] ;
            Z531TBM07_CRF_INP_AUTH_FLG = T00143_A531TBM07_CRF_INP_AUTH_FLG[0] ;
            Z532TBM07_CRF_EDIT_AUTH_FLG = T00143_A532TBM07_CRF_EDIT_AUTH_FLG[0] ;
            Z533TBM07_OTHER_SITE_VIEW_FLG = T00143_A533TBM07_OTHER_SITE_VIEW_FLG[0] ;
            Z534TBM07_DEL_FLG = T00143_A534TBM07_DEL_FLG[0] ;
            Z537TBM07_CRT_PROG_NM = T00143_A537TBM07_CRT_PROG_NM[0] ;
            Z540TBM07_UPD_PROG_NM = T00143_A540TBM07_UPD_PROG_NM[0] ;
         }
         else
         {
            Z535TBM07_CRT_DATETIME = A535TBM07_CRT_DATETIME ;
            Z536TBM07_CRT_USER_ID = A536TBM07_CRT_USER_ID ;
            Z538TBM07_UPD_DATETIME = A538TBM07_UPD_DATETIME ;
            Z539TBM07_UPD_USER_ID = A539TBM07_UPD_USER_ID ;
            Z541TBM07_UPD_CNT = A541TBM07_UPD_CNT ;
            Z531TBM07_CRF_INP_AUTH_FLG = A531TBM07_CRF_INP_AUTH_FLG ;
            Z532TBM07_CRF_EDIT_AUTH_FLG = A532TBM07_CRF_EDIT_AUTH_FLG ;
            Z533TBM07_OTHER_SITE_VIEW_FLG = A533TBM07_OTHER_SITE_VIEW_FLG ;
            Z534TBM07_DEL_FLG = A534TBM07_DEL_FLG ;
            Z537TBM07_CRT_PROG_NM = A537TBM07_CRT_PROG_NM ;
            Z540TBM07_UPD_PROG_NM = A540TBM07_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z535TBM07_CRT_DATETIME = A535TBM07_CRT_DATETIME ;
         Z536TBM07_CRT_USER_ID = A536TBM07_CRT_USER_ID ;
         Z538TBM07_UPD_DATETIME = A538TBM07_UPD_DATETIME ;
         Z539TBM07_UPD_USER_ID = A539TBM07_UPD_USER_ID ;
         Z541TBM07_UPD_CNT = A541TBM07_UPD_CNT ;
         Z531TBM07_CRF_INP_AUTH_FLG = A531TBM07_CRF_INP_AUTH_FLG ;
         Z532TBM07_CRF_EDIT_AUTH_FLG = A532TBM07_CRF_EDIT_AUTH_FLG ;
         Z533TBM07_OTHER_SITE_VIEW_FLG = A533TBM07_OTHER_SITE_VIEW_FLG ;
         Z534TBM07_DEL_FLG = A534TBM07_DEL_FLG ;
         Z537TBM07_CRT_PROG_NM = A537TBM07_CRT_PROG_NM ;
         Z540TBM07_UPD_PROG_NM = A540TBM07_UPD_PROG_NM ;
         Z530TBM07_AUTH_CD = A530TBM07_AUTH_CD ;
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

   public void load1439( )
   {
      /* Using cursor T00145 */
      pr_default.execute(3, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A535TBM07_CRT_DATETIME = T00145_A535TBM07_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A535TBM07_CRT_DATETIME", localUtil.ttoc( A535TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n535TBM07_CRT_DATETIME = T00145_n535TBM07_CRT_DATETIME[0] ;
         A536TBM07_CRT_USER_ID = T00145_A536TBM07_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A536TBM07_CRT_USER_ID", A536TBM07_CRT_USER_ID);
         n536TBM07_CRT_USER_ID = T00145_n536TBM07_CRT_USER_ID[0] ;
         A538TBM07_UPD_DATETIME = T00145_A538TBM07_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A538TBM07_UPD_DATETIME", localUtil.ttoc( A538TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n538TBM07_UPD_DATETIME = T00145_n538TBM07_UPD_DATETIME[0] ;
         A539TBM07_UPD_USER_ID = T00145_A539TBM07_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A539TBM07_UPD_USER_ID", A539TBM07_UPD_USER_ID);
         n539TBM07_UPD_USER_ID = T00145_n539TBM07_UPD_USER_ID[0] ;
         A541TBM07_UPD_CNT = T00145_A541TBM07_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A541TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)));
         n541TBM07_UPD_CNT = T00145_n541TBM07_UPD_CNT[0] ;
         A531TBM07_CRF_INP_AUTH_FLG = T00145_A531TBM07_CRF_INP_AUTH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A531TBM07_CRF_INP_AUTH_FLG", A531TBM07_CRF_INP_AUTH_FLG);
         n531TBM07_CRF_INP_AUTH_FLG = T00145_n531TBM07_CRF_INP_AUTH_FLG[0] ;
         A532TBM07_CRF_EDIT_AUTH_FLG = T00145_A532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A532TBM07_CRF_EDIT_AUTH_FLG", A532TBM07_CRF_EDIT_AUTH_FLG);
         n532TBM07_CRF_EDIT_AUTH_FLG = T00145_n532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A533TBM07_OTHER_SITE_VIEW_FLG = T00145_A533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A533TBM07_OTHER_SITE_VIEW_FLG", A533TBM07_OTHER_SITE_VIEW_FLG);
         n533TBM07_OTHER_SITE_VIEW_FLG = T00145_n533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A534TBM07_DEL_FLG = T00145_A534TBM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A534TBM07_DEL_FLG", A534TBM07_DEL_FLG);
         n534TBM07_DEL_FLG = T00145_n534TBM07_DEL_FLG[0] ;
         A537TBM07_CRT_PROG_NM = T00145_A537TBM07_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A537TBM07_CRT_PROG_NM", A537TBM07_CRT_PROG_NM);
         n537TBM07_CRT_PROG_NM = T00145_n537TBM07_CRT_PROG_NM[0] ;
         A540TBM07_UPD_PROG_NM = T00145_A540TBM07_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A540TBM07_UPD_PROG_NM", A540TBM07_UPD_PROG_NM);
         n540TBM07_UPD_PROG_NM = T00145_n540TBM07_UPD_PROG_NM[0] ;
         zm1439( -8) ;
      }
      pr_default.close(3);
      onLoadActions1439( ) ;
   }

   public void onLoadActions1439( )
   {
      AV9Pgmname = "TBM07_AUTH_BEHAVIOR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable1439( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM07_AUTH_BEHAVIOR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T00144 */
      pr_default.execute(2, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError530 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'権限別振舞マスタ・権限サブタイプ'", "ForeignKeyNotFound", 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError530 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A535TBM07_CRT_DATETIME) || (( A535TBM07_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A535TBM07_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A538TBM07_UPD_DATETIME) || (( A538TBM07_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A538TBM07_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1439( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A530TBM07_AUTH_CD )
   {
      /* Using cursor T00146 */
      pr_default.execute(4, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(4) == 101) )
      {
         AnyError530 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'権限別振舞マスタ・権限サブタイプ'", "ForeignKeyNotFound", 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError530 == 0 )
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

   public void getKey1439( )
   {
      /* Using cursor T00147 */
      pr_default.execute(5, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound39 = (short)(1) ;
      }
      else
      {
         RcdFound39 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00143 */
      pr_default.execute(1, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1439( 8) ;
         RcdFound39 = (short)(1) ;
         A535TBM07_CRT_DATETIME = T00143_A535TBM07_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A535TBM07_CRT_DATETIME", localUtil.ttoc( A535TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n535TBM07_CRT_DATETIME = T00143_n535TBM07_CRT_DATETIME[0] ;
         A536TBM07_CRT_USER_ID = T00143_A536TBM07_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A536TBM07_CRT_USER_ID", A536TBM07_CRT_USER_ID);
         n536TBM07_CRT_USER_ID = T00143_n536TBM07_CRT_USER_ID[0] ;
         A538TBM07_UPD_DATETIME = T00143_A538TBM07_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A538TBM07_UPD_DATETIME", localUtil.ttoc( A538TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n538TBM07_UPD_DATETIME = T00143_n538TBM07_UPD_DATETIME[0] ;
         A539TBM07_UPD_USER_ID = T00143_A539TBM07_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A539TBM07_UPD_USER_ID", A539TBM07_UPD_USER_ID);
         n539TBM07_UPD_USER_ID = T00143_n539TBM07_UPD_USER_ID[0] ;
         A541TBM07_UPD_CNT = T00143_A541TBM07_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A541TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)));
         n541TBM07_UPD_CNT = T00143_n541TBM07_UPD_CNT[0] ;
         A531TBM07_CRF_INP_AUTH_FLG = T00143_A531TBM07_CRF_INP_AUTH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A531TBM07_CRF_INP_AUTH_FLG", A531TBM07_CRF_INP_AUTH_FLG);
         n531TBM07_CRF_INP_AUTH_FLG = T00143_n531TBM07_CRF_INP_AUTH_FLG[0] ;
         A532TBM07_CRF_EDIT_AUTH_FLG = T00143_A532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A532TBM07_CRF_EDIT_AUTH_FLG", A532TBM07_CRF_EDIT_AUTH_FLG);
         n532TBM07_CRF_EDIT_AUTH_FLG = T00143_n532TBM07_CRF_EDIT_AUTH_FLG[0] ;
         A533TBM07_OTHER_SITE_VIEW_FLG = T00143_A533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A533TBM07_OTHER_SITE_VIEW_FLG", A533TBM07_OTHER_SITE_VIEW_FLG);
         n533TBM07_OTHER_SITE_VIEW_FLG = T00143_n533TBM07_OTHER_SITE_VIEW_FLG[0] ;
         A534TBM07_DEL_FLG = T00143_A534TBM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A534TBM07_DEL_FLG", A534TBM07_DEL_FLG);
         n534TBM07_DEL_FLG = T00143_n534TBM07_DEL_FLG[0] ;
         A537TBM07_CRT_PROG_NM = T00143_A537TBM07_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A537TBM07_CRT_PROG_NM", A537TBM07_CRT_PROG_NM);
         n537TBM07_CRT_PROG_NM = T00143_n537TBM07_CRT_PROG_NM[0] ;
         A540TBM07_UPD_PROG_NM = T00143_A540TBM07_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A540TBM07_UPD_PROG_NM", A540TBM07_UPD_PROG_NM);
         n540TBM07_UPD_PROG_NM = T00143_n540TBM07_UPD_PROG_NM[0] ;
         A530TBM07_AUTH_CD = T00143_A530TBM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
         O541TBM07_UPD_CNT = A541TBM07_UPD_CNT ;
         n541TBM07_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A541TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)));
         Z530TBM07_AUTH_CD = A530TBM07_AUTH_CD ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1439( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound39 = (short)(0) ;
         initializeNonKey1439( ) ;
         sMode39 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode39 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1439( ) ;
      if ( RcdFound39 == 0 )
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
      RcdFound39 = (short)(0) ;
      /* Using cursor T00148 */
      pr_default.execute(6, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00148_A530TBM07_AUTH_CD[0], A530TBM07_AUTH_CD) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00148_A530TBM07_AUTH_CD[0], A530TBM07_AUTH_CD) > 0 ) ) )
         {
            A530TBM07_AUTH_CD = T00148_A530TBM07_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound39 = (short)(0) ;
      /* Using cursor T00149 */
      pr_default.execute(7, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00149_A530TBM07_AUTH_CD[0], A530TBM07_AUTH_CD) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00149_A530TBM07_AUTH_CD[0], A530TBM07_AUTH_CD) < 0 ) ) )
         {
            A530TBM07_AUTH_CD = T00149_A530TBM07_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
            RcdFound39 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1439( ) ;
      if ( RcdFound39 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM07_AUTH_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A530TBM07_AUTH_CD, Z530TBM07_AUTH_CD) != 0 )
         {
            A530TBM07_AUTH_CD = Z530TBM07_AUTH_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM07_AUTH_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update1439( ) ;
            GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( GXutil.strcmp(A530TBM07_AUTH_CD, Z530TBM07_AUTH_CD) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert1439( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM07_AUTH_CD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1439( ) ;
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
      if ( GXutil.strcmp(A530TBM07_AUTH_CD, Z530TBM07_AUTH_CD) != 0 )
      {
         A530TBM07_AUTH_CD = Z530TBM07_AUTH_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
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
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1439( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1439( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
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
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1439( ) ;
      if ( RcdFound39 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound39 != 0 )
         {
            scanNext1439( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1439( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1439( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00142 */
         pr_default.execute(0, new Object[] {A530TBM07_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM07_AUTH_BEHAVIOR"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z535TBM07_CRT_DATETIME.equals( T00142_A535TBM07_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z536TBM07_CRT_USER_ID, T00142_A536TBM07_CRT_USER_ID[0]) != 0 ) || !( Z538TBM07_UPD_DATETIME.equals( T00142_A538TBM07_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z539TBM07_UPD_USER_ID, T00142_A539TBM07_UPD_USER_ID[0]) != 0 ) || ( Z541TBM07_UPD_CNT != T00142_A541TBM07_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z531TBM07_CRF_INP_AUTH_FLG, T00142_A531TBM07_CRF_INP_AUTH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z532TBM07_CRF_EDIT_AUTH_FLG, T00142_A532TBM07_CRF_EDIT_AUTH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z533TBM07_OTHER_SITE_VIEW_FLG, T00142_A533TBM07_OTHER_SITE_VIEW_FLG[0]) != 0 ) || ( GXutil.strcmp(Z534TBM07_DEL_FLG, T00142_A534TBM07_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z537TBM07_CRT_PROG_NM, T00142_A537TBM07_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z540TBM07_UPD_PROG_NM, T00142_A540TBM07_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM07_AUTH_BEHAVIOR"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1439( )
   {
      beforeValidate1439( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1439( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1439( 0) ;
         checkOptimisticConcurrency1439( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1439( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1439( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001410 */
                  pr_default.execute(8, new Object[] {new Boolean(n535TBM07_CRT_DATETIME), A535TBM07_CRT_DATETIME, new Boolean(n536TBM07_CRT_USER_ID), A536TBM07_CRT_USER_ID, new Boolean(n538TBM07_UPD_DATETIME), A538TBM07_UPD_DATETIME, new Boolean(n539TBM07_UPD_USER_ID), A539TBM07_UPD_USER_ID, new Boolean(n541TBM07_UPD_CNT), new Long(A541TBM07_UPD_CNT), new Boolean(n531TBM07_CRF_INP_AUTH_FLG), A531TBM07_CRF_INP_AUTH_FLG, new Boolean(n532TBM07_CRF_EDIT_AUTH_FLG), A532TBM07_CRF_EDIT_AUTH_FLG, new Boolean(n533TBM07_OTHER_SITE_VIEW_FLG), A533TBM07_OTHER_SITE_VIEW_FLG, new Boolean(n534TBM07_DEL_FLG), A534TBM07_DEL_FLG, new Boolean(n537TBM07_CRT_PROG_NM), A537TBM07_CRT_PROG_NM, new Boolean(n540TBM07_UPD_PROG_NM), A540TBM07_UPD_PROG_NM, A530TBM07_AUTH_CD});
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
                        resetCaption140( ) ;
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
            load1439( ) ;
         }
         endLevel1439( ) ;
      }
      closeExtendedTableCursors1439( ) ;
   }

   public void update1439( )
   {
      beforeValidate1439( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1439( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1439( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1439( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1439( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001411 */
                  pr_default.execute(9, new Object[] {new Boolean(n535TBM07_CRT_DATETIME), A535TBM07_CRT_DATETIME, new Boolean(n536TBM07_CRT_USER_ID), A536TBM07_CRT_USER_ID, new Boolean(n538TBM07_UPD_DATETIME), A538TBM07_UPD_DATETIME, new Boolean(n539TBM07_UPD_USER_ID), A539TBM07_UPD_USER_ID, new Boolean(n541TBM07_UPD_CNT), new Long(A541TBM07_UPD_CNT), new Boolean(n531TBM07_CRF_INP_AUTH_FLG), A531TBM07_CRF_INP_AUTH_FLG, new Boolean(n532TBM07_CRF_EDIT_AUTH_FLG), A532TBM07_CRF_EDIT_AUTH_FLG, new Boolean(n533TBM07_OTHER_SITE_VIEW_FLG), A533TBM07_OTHER_SITE_VIEW_FLG, new Boolean(n534TBM07_DEL_FLG), A534TBM07_DEL_FLG, new Boolean(n537TBM07_CRT_PROG_NM), A537TBM07_CRT_PROG_NM, new Boolean(n540TBM07_UPD_PROG_NM), A540TBM07_UPD_PROG_NM, A530TBM07_AUTH_CD});
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM07_AUTH_BEHAVIOR"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1439( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption140( ) ;
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
         endLevel1439( ) ;
      }
      closeExtendedTableCursors1439( ) ;
   }

   public void deferredUpdate1439( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1439( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1439( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1439( ) ;
         afterConfirm1439( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1439( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001412 */
               pr_default.execute(10, new Object[] {A530TBM07_AUTH_CD});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound39 == 0 )
                     {
                        initAll1439( ) ;
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
                     resetCaption140( ) ;
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
      sMode39 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1439( ) ;
      Gx_mode = sMode39 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1439( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM07_AUTH_BEHAVIOR" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel1439( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1439( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm07_auth_behavior");
         if ( AnyError == 0 )
         {
            confirmValues140( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm07_auth_behavior");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1439( )
   {
      /* Using cursor T001413 */
      pr_default.execute(11);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A530TBM07_AUTH_CD = T001413_A530TBM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1439( )
   {
      pr_default.readNext(11);
      RcdFound39 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound39 = (short)(1) ;
         A530TBM07_AUTH_CD = T001413_A530TBM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
      }
   }

   public void scanEnd1439( )
   {
      pr_default.close(11);
   }

   public void afterConfirm1439( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1439( )
   {
      /* Before Insert Rules */
      A535TBM07_CRT_DATETIME = GXutil.now( ) ;
      n535TBM07_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A535TBM07_CRT_DATETIME", localUtil.ttoc( A535TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A536TBM07_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm07_auth_behavior_impl.this.GXt_char3 = GXv_char4[0] ;
      A536TBM07_CRT_USER_ID = GXt_char3 ;
      n536TBM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A536TBM07_CRT_USER_ID", A536TBM07_CRT_USER_ID);
      A538TBM07_UPD_DATETIME = GXutil.now( ) ;
      n538TBM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A538TBM07_UPD_DATETIME", localUtil.ttoc( A538TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A539TBM07_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm07_auth_behavior_impl.this.GXt_char3 = GXv_char4[0] ;
      A539TBM07_UPD_USER_ID = GXt_char3 ;
      n539TBM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A539TBM07_UPD_USER_ID", A539TBM07_UPD_USER_ID);
      A541TBM07_UPD_CNT = (long)(O541TBM07_UPD_CNT+1) ;
      n541TBM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A541TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate1439( )
   {
      /* Before Update Rules */
      A538TBM07_UPD_DATETIME = GXutil.now( ) ;
      n538TBM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A538TBM07_UPD_DATETIME", localUtil.ttoc( A538TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A539TBM07_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm07_auth_behavior_impl.this.GXt_char3 = GXv_char4[0] ;
      A539TBM07_UPD_USER_ID = GXt_char3 ;
      n539TBM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A539TBM07_UPD_USER_ID", A539TBM07_UPD_USER_ID);
      A541TBM07_UPD_CNT = (long)(O541TBM07_UPD_CNT+1) ;
      n541TBM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A541TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)));
   }

   public void beforeDelete1439( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1439( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1439( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1439( )
   {
      edtTBM07_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_AUTH_CD_Enabled, 5, 0)));
      edtTBM07_CRF_INP_AUTH_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_CRF_INP_AUTH_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_CRF_INP_AUTH_FLG_Enabled, 5, 0)));
      edtTBM07_CRF_EDIT_AUTH_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_CRF_EDIT_AUTH_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_CRF_EDIT_AUTH_FLG_Enabled, 5, 0)));
      edtTBM07_OTHER_SITE_VIEW_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_OTHER_SITE_VIEW_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_OTHER_SITE_VIEW_FLG_Enabled, 5, 0)));
      edtTBM07_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_DEL_FLG_Enabled, 5, 0)));
      edtTBM07_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM07_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM07_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM07_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM07_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM07_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM07_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM07_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM07_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues140( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "権限別振舞マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm07_auth_behavior") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1439( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z530TBM07_AUTH_CD", GXutil.rtrim( Z530TBM07_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z535TBM07_CRT_DATETIME", localUtil.ttoc( Z535TBM07_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z536TBM07_CRT_USER_ID", GXutil.rtrim( Z536TBM07_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z538TBM07_UPD_DATETIME", localUtil.ttoc( Z538TBM07_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z539TBM07_UPD_USER_ID", GXutil.rtrim( Z539TBM07_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z541TBM07_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z541TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z531TBM07_CRF_INP_AUTH_FLG", GXutil.rtrim( Z531TBM07_CRF_INP_AUTH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z532TBM07_CRF_EDIT_AUTH_FLG", GXutil.rtrim( Z532TBM07_CRF_EDIT_AUTH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z533TBM07_OTHER_SITE_VIEW_FLG", GXutil.rtrim( Z533TBM07_OTHER_SITE_VIEW_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z534TBM07_DEL_FLG", GXutil.rtrim( Z534TBM07_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z537TBM07_CRT_PROG_NM", GXutil.rtrim( Z537TBM07_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z540TBM07_UPD_PROG_NM", GXutil.rtrim( Z540TBM07_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O541TBM07_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O541TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey1439( )
   {
      A535TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n535TBM07_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A535TBM07_CRT_DATETIME", localUtil.ttoc( A535TBM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n535TBM07_CRT_DATETIME = (GXutil.nullDate().equals(A535TBM07_CRT_DATETIME) ? true : false) ;
      A536TBM07_CRT_USER_ID = "" ;
      n536TBM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A536TBM07_CRT_USER_ID", A536TBM07_CRT_USER_ID);
      n536TBM07_CRT_USER_ID = ((GXutil.strcmp("", A536TBM07_CRT_USER_ID)==0) ? true : false) ;
      A538TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n538TBM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A538TBM07_UPD_DATETIME", localUtil.ttoc( A538TBM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n538TBM07_UPD_DATETIME = (GXutil.nullDate().equals(A538TBM07_UPD_DATETIME) ? true : false) ;
      A539TBM07_UPD_USER_ID = "" ;
      n539TBM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A539TBM07_UPD_USER_ID", A539TBM07_UPD_USER_ID);
      n539TBM07_UPD_USER_ID = ((GXutil.strcmp("", A539TBM07_UPD_USER_ID)==0) ? true : false) ;
      A541TBM07_UPD_CNT = 0 ;
      n541TBM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A541TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)));
      n541TBM07_UPD_CNT = ((0==A541TBM07_UPD_CNT) ? true : false) ;
      A531TBM07_CRF_INP_AUTH_FLG = "" ;
      n531TBM07_CRF_INP_AUTH_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A531TBM07_CRF_INP_AUTH_FLG", A531TBM07_CRF_INP_AUTH_FLG);
      n531TBM07_CRF_INP_AUTH_FLG = ((GXutil.strcmp("", A531TBM07_CRF_INP_AUTH_FLG)==0) ? true : false) ;
      A532TBM07_CRF_EDIT_AUTH_FLG = "" ;
      n532TBM07_CRF_EDIT_AUTH_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A532TBM07_CRF_EDIT_AUTH_FLG", A532TBM07_CRF_EDIT_AUTH_FLG);
      n532TBM07_CRF_EDIT_AUTH_FLG = ((GXutil.strcmp("", A532TBM07_CRF_EDIT_AUTH_FLG)==0) ? true : false) ;
      A533TBM07_OTHER_SITE_VIEW_FLG = "" ;
      n533TBM07_OTHER_SITE_VIEW_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A533TBM07_OTHER_SITE_VIEW_FLG", A533TBM07_OTHER_SITE_VIEW_FLG);
      n533TBM07_OTHER_SITE_VIEW_FLG = ((GXutil.strcmp("", A533TBM07_OTHER_SITE_VIEW_FLG)==0) ? true : false) ;
      A534TBM07_DEL_FLG = "" ;
      n534TBM07_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A534TBM07_DEL_FLG", A534TBM07_DEL_FLG);
      n534TBM07_DEL_FLG = ((GXutil.strcmp("", A534TBM07_DEL_FLG)==0) ? true : false) ;
      A537TBM07_CRT_PROG_NM = "" ;
      n537TBM07_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A537TBM07_CRT_PROG_NM", A537TBM07_CRT_PROG_NM);
      n537TBM07_CRT_PROG_NM = ((GXutil.strcmp("", A537TBM07_CRT_PROG_NM)==0) ? true : false) ;
      A540TBM07_UPD_PROG_NM = "" ;
      n540TBM07_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A540TBM07_UPD_PROG_NM", A540TBM07_UPD_PROG_NM);
      n540TBM07_UPD_PROG_NM = ((GXutil.strcmp("", A540TBM07_UPD_PROG_NM)==0) ? true : false) ;
      O541TBM07_UPD_CNT = A541TBM07_UPD_CNT ;
      n541TBM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A541TBM07_UPD_CNT", GXutil.ltrim( GXutil.str( A541TBM07_UPD_CNT, 10, 0)));
   }

   public void initAll1439( )
   {
      A530TBM07_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A530TBM07_AUTH_CD", A530TBM07_AUTH_CD);
      initializeNonKey1439( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14563780");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm07_auth_behavior.js", "?14563780");
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
      lblTextblocktbm07_auth_cd_Internalname = "TEXTBLOCKTBM07_AUTH_CD" ;
      edtTBM07_AUTH_CD_Internalname = "TBM07_AUTH_CD" ;
      lblTextblocktbm07_crf_inp_auth_flg_Internalname = "TEXTBLOCKTBM07_CRF_INP_AUTH_FLG" ;
      edtTBM07_CRF_INP_AUTH_FLG_Internalname = "TBM07_CRF_INP_AUTH_FLG" ;
      lblTextblocktbm07_crf_edit_auth_flg_Internalname = "TEXTBLOCKTBM07_CRF_EDIT_AUTH_FLG" ;
      edtTBM07_CRF_EDIT_AUTH_FLG_Internalname = "TBM07_CRF_EDIT_AUTH_FLG" ;
      lblTextblocktbm07_other_site_view_flg_Internalname = "TEXTBLOCKTBM07_OTHER_SITE_VIEW_FLG" ;
      edtTBM07_OTHER_SITE_VIEW_FLG_Internalname = "TBM07_OTHER_SITE_VIEW_FLG" ;
      lblTextblocktbm07_del_flg_Internalname = "TEXTBLOCKTBM07_DEL_FLG" ;
      edtTBM07_DEL_FLG_Internalname = "TBM07_DEL_FLG" ;
      lblTextblocktbm07_crt_datetime_Internalname = "TEXTBLOCKTBM07_CRT_DATETIME" ;
      edtTBM07_CRT_DATETIME_Internalname = "TBM07_CRT_DATETIME" ;
      lblTextblocktbm07_crt_user_id_Internalname = "TEXTBLOCKTBM07_CRT_USER_ID" ;
      edtTBM07_CRT_USER_ID_Internalname = "TBM07_CRT_USER_ID" ;
      lblTextblocktbm07_crt_prog_nm_Internalname = "TEXTBLOCKTBM07_CRT_PROG_NM" ;
      edtTBM07_CRT_PROG_NM_Internalname = "TBM07_CRT_PROG_NM" ;
      lblTextblocktbm07_upd_datetime_Internalname = "TEXTBLOCKTBM07_UPD_DATETIME" ;
      edtTBM07_UPD_DATETIME_Internalname = "TBM07_UPD_DATETIME" ;
      lblTextblocktbm07_upd_user_id_Internalname = "TEXTBLOCKTBM07_UPD_USER_ID" ;
      edtTBM07_UPD_USER_ID_Internalname = "TBM07_UPD_USER_ID" ;
      lblTextblocktbm07_upd_prog_nm_Internalname = "TEXTBLOCKTBM07_UPD_PROG_NM" ;
      edtTBM07_UPD_PROG_NM_Internalname = "TBM07_UPD_PROG_NM" ;
      lblTextblocktbm07_upd_cnt_Internalname = "TEXTBLOCKTBM07_UPD_CNT" ;
      edtTBM07_UPD_CNT_Internalname = "TBM07_UPD_CNT" ;
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
      edtTBM07_UPD_CNT_Jsonclick = "" ;
      edtTBM07_UPD_CNT_Enabled = 1 ;
      edtTBM07_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM07_UPD_PROG_NM_Enabled = 1 ;
      edtTBM07_UPD_USER_ID_Jsonclick = "" ;
      edtTBM07_UPD_USER_ID_Enabled = 1 ;
      edtTBM07_UPD_DATETIME_Jsonclick = "" ;
      edtTBM07_UPD_DATETIME_Enabled = 1 ;
      edtTBM07_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM07_CRT_PROG_NM_Enabled = 1 ;
      edtTBM07_CRT_USER_ID_Jsonclick = "" ;
      edtTBM07_CRT_USER_ID_Enabled = 1 ;
      edtTBM07_CRT_DATETIME_Jsonclick = "" ;
      edtTBM07_CRT_DATETIME_Enabled = 1 ;
      edtTBM07_DEL_FLG_Jsonclick = "" ;
      edtTBM07_DEL_FLG_Enabled = 1 ;
      edtTBM07_OTHER_SITE_VIEW_FLG_Jsonclick = "" ;
      edtTBM07_OTHER_SITE_VIEW_FLG_Enabled = 1 ;
      edtTBM07_CRF_EDIT_AUTH_FLG_Jsonclick = "" ;
      edtTBM07_CRF_EDIT_AUTH_FLG_Enabled = 1 ;
      edtTBM07_CRF_INP_AUTH_FLG_Jsonclick = "" ;
      edtTBM07_CRF_INP_AUTH_FLG_Enabled = 1 ;
      edtTBM07_AUTH_CD_Jsonclick = "" ;
      edtTBM07_AUTH_CD_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm07_crt_user_id1439( String Gx_mode )
   {
      GXt_char3 = A536TBM07_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm07_auth_behavior_impl.this.GXt_char3 = GXv_char4[0] ;
      A536TBM07_CRT_USER_ID = GXt_char3 ;
      n536TBM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A536TBM07_CRT_USER_ID", A536TBM07_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A536TBM07_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm07_upd_user_id1439( String Gx_mode )
   {
      GXt_char3 = A539TBM07_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm07_auth_behavior_impl.this.GXt_char3 = GXv_char4[0] ;
      A539TBM07_UPD_USER_ID = GXt_char3 ;
      n539TBM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A539TBM07_UPD_USER_ID", A539TBM07_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A539TBM07_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm07_auth_cd( String GX_Parm1 ,
                                    java.util.Date GX_Parm2 ,
                                    String GX_Parm3 ,
                                    java.util.Date GX_Parm4 ,
                                    String GX_Parm5 ,
                                    long GX_Parm6 ,
                                    String GX_Parm7 ,
                                    String GX_Parm8 ,
                                    String GX_Parm9 ,
                                    String GX_Parm10 ,
                                    String GX_Parm11 ,
                                    String GX_Parm12 )
   {
      A530TBM07_AUTH_CD = GX_Parm1 ;
      A535TBM07_CRT_DATETIME = GX_Parm2 ;
      n535TBM07_CRT_DATETIME = false ;
      A536TBM07_CRT_USER_ID = GX_Parm3 ;
      n536TBM07_CRT_USER_ID = false ;
      A538TBM07_UPD_DATETIME = GX_Parm4 ;
      n538TBM07_UPD_DATETIME = false ;
      A539TBM07_UPD_USER_ID = GX_Parm5 ;
      n539TBM07_UPD_USER_ID = false ;
      A541TBM07_UPD_CNT = GX_Parm6 ;
      n541TBM07_UPD_CNT = false ;
      A531TBM07_CRF_INP_AUTH_FLG = GX_Parm7 ;
      n531TBM07_CRF_INP_AUTH_FLG = false ;
      A532TBM07_CRF_EDIT_AUTH_FLG = GX_Parm8 ;
      n532TBM07_CRF_EDIT_AUTH_FLG = false ;
      A533TBM07_OTHER_SITE_VIEW_FLG = GX_Parm9 ;
      n533TBM07_OTHER_SITE_VIEW_FLG = false ;
      A534TBM07_DEL_FLG = GX_Parm10 ;
      n534TBM07_DEL_FLG = false ;
      A537TBM07_CRT_PROG_NM = GX_Parm11 ;
      n537TBM07_CRT_PROG_NM = false ;
      A540TBM07_UPD_PROG_NM = GX_Parm12 ;
      n540TBM07_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      /* Using cursor T001414 */
      pr_default.execute(12, new Object[] {A530TBM07_AUTH_CD});
      if ( (pr_default.getStatus(12) == 101) )
      {
         AnyError530 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'権限別振舞マスタ・権限サブタイプ'", "ForeignKeyNotFound", 1, "TBM07_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM07_AUTH_CD_Internalname ;
      }
      if ( AnyError530 == 0 )
      {
      }
      pr_default.close(12);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A535TBM07_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A536TBM07_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A538TBM07_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A539TBM07_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A541TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A531TBM07_CRF_INP_AUTH_FLG));
      isValidOutput.add(GXutil.rtrim( A532TBM07_CRF_EDIT_AUTH_FLG));
      isValidOutput.add(GXutil.rtrim( A533TBM07_OTHER_SITE_VIEW_FLG));
      isValidOutput.add(GXutil.rtrim( A534TBM07_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A537TBM07_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A540TBM07_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z530TBM07_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z535TBM07_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z536TBM07_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z538TBM07_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z539TBM07_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z541TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z531TBM07_CRF_INP_AUTH_FLG));
      isValidOutput.add(GXutil.rtrim( Z532TBM07_CRF_EDIT_AUTH_FLG));
      isValidOutput.add(GXutil.rtrim( Z533TBM07_OTHER_SITE_VIEW_FLG));
      isValidOutput.add(GXutil.rtrim( Z534TBM07_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z537TBM07_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z540TBM07_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O541TBM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      A530TBM07_AUTH_CD = "" ;
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
      lblTextblocktbm07_auth_cd_Jsonclick = "" ;
      lblTextblocktbm07_crf_inp_auth_flg_Jsonclick = "" ;
      A531TBM07_CRF_INP_AUTH_FLG = "" ;
      lblTextblocktbm07_crf_edit_auth_flg_Jsonclick = "" ;
      A532TBM07_CRF_EDIT_AUTH_FLG = "" ;
      lblTextblocktbm07_other_site_view_flg_Jsonclick = "" ;
      A533TBM07_OTHER_SITE_VIEW_FLG = "" ;
      lblTextblocktbm07_del_flg_Jsonclick = "" ;
      A534TBM07_DEL_FLG = "" ;
      lblTextblocktbm07_crt_datetime_Jsonclick = "" ;
      A535TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm07_crt_user_id_Jsonclick = "" ;
      A536TBM07_CRT_USER_ID = "" ;
      lblTextblocktbm07_crt_prog_nm_Jsonclick = "" ;
      A537TBM07_CRT_PROG_NM = "" ;
      lblTextblocktbm07_upd_datetime_Jsonclick = "" ;
      A538TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm07_upd_user_id_Jsonclick = "" ;
      A539TBM07_UPD_USER_ID = "" ;
      lblTextblocktbm07_upd_prog_nm_Jsonclick = "" ;
      A540TBM07_UPD_PROG_NM = "" ;
      lblTextblocktbm07_upd_cnt_Jsonclick = "" ;
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
      Z530TBM07_AUTH_CD = "" ;
      Z535TBM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z536TBM07_CRT_USER_ID = "" ;
      Z538TBM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z539TBM07_UPD_USER_ID = "" ;
      Z531TBM07_CRF_INP_AUTH_FLG = "" ;
      Z532TBM07_CRF_EDIT_AUTH_FLG = "" ;
      Z533TBM07_OTHER_SITE_VIEW_FLG = "" ;
      Z534TBM07_DEL_FLG = "" ;
      Z537TBM07_CRT_PROG_NM = "" ;
      Z540TBM07_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T00145_A535TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00145_n535TBM07_CRT_DATETIME = new boolean[] {false} ;
      T00145_A536TBM07_CRT_USER_ID = new String[] {""} ;
      T00145_n536TBM07_CRT_USER_ID = new boolean[] {false} ;
      T00145_A538TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00145_n538TBM07_UPD_DATETIME = new boolean[] {false} ;
      T00145_A539TBM07_UPD_USER_ID = new String[] {""} ;
      T00145_n539TBM07_UPD_USER_ID = new boolean[] {false} ;
      T00145_A541TBM07_UPD_CNT = new long[1] ;
      T00145_n541TBM07_UPD_CNT = new boolean[] {false} ;
      T00145_A531TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      T00145_n531TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      T00145_A532TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      T00145_n532TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      T00145_A533TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      T00145_n533TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      T00145_A534TBM07_DEL_FLG = new String[] {""} ;
      T00145_n534TBM07_DEL_FLG = new boolean[] {false} ;
      T00145_A537TBM07_CRT_PROG_NM = new String[] {""} ;
      T00145_n537TBM07_CRT_PROG_NM = new boolean[] {false} ;
      T00145_A540TBM07_UPD_PROG_NM = new String[] {""} ;
      T00145_n540TBM07_UPD_PROG_NM = new boolean[] {false} ;
      T00145_A530TBM07_AUTH_CD = new String[] {""} ;
      T00144_A530TBM07_AUTH_CD = new String[] {""} ;
      T00146_A530TBM07_AUTH_CD = new String[] {""} ;
      T00147_A530TBM07_AUTH_CD = new String[] {""} ;
      T00143_A535TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00143_n535TBM07_CRT_DATETIME = new boolean[] {false} ;
      T00143_A536TBM07_CRT_USER_ID = new String[] {""} ;
      T00143_n536TBM07_CRT_USER_ID = new boolean[] {false} ;
      T00143_A538TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00143_n538TBM07_UPD_DATETIME = new boolean[] {false} ;
      T00143_A539TBM07_UPD_USER_ID = new String[] {""} ;
      T00143_n539TBM07_UPD_USER_ID = new boolean[] {false} ;
      T00143_A541TBM07_UPD_CNT = new long[1] ;
      T00143_n541TBM07_UPD_CNT = new boolean[] {false} ;
      T00143_A531TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      T00143_n531TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      T00143_A532TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      T00143_n532TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      T00143_A533TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      T00143_n533TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      T00143_A534TBM07_DEL_FLG = new String[] {""} ;
      T00143_n534TBM07_DEL_FLG = new boolean[] {false} ;
      T00143_A537TBM07_CRT_PROG_NM = new String[] {""} ;
      T00143_n537TBM07_CRT_PROG_NM = new boolean[] {false} ;
      T00143_A540TBM07_UPD_PROG_NM = new String[] {""} ;
      T00143_n540TBM07_UPD_PROG_NM = new boolean[] {false} ;
      T00143_A530TBM07_AUTH_CD = new String[] {""} ;
      sMode39 = "" ;
      T00148_A530TBM07_AUTH_CD = new String[] {""} ;
      T00149_A530TBM07_AUTH_CD = new String[] {""} ;
      T00142_A535TBM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00142_n535TBM07_CRT_DATETIME = new boolean[] {false} ;
      T00142_A536TBM07_CRT_USER_ID = new String[] {""} ;
      T00142_n536TBM07_CRT_USER_ID = new boolean[] {false} ;
      T00142_A538TBM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00142_n538TBM07_UPD_DATETIME = new boolean[] {false} ;
      T00142_A539TBM07_UPD_USER_ID = new String[] {""} ;
      T00142_n539TBM07_UPD_USER_ID = new boolean[] {false} ;
      T00142_A541TBM07_UPD_CNT = new long[1] ;
      T00142_n541TBM07_UPD_CNT = new boolean[] {false} ;
      T00142_A531TBM07_CRF_INP_AUTH_FLG = new String[] {""} ;
      T00142_n531TBM07_CRF_INP_AUTH_FLG = new boolean[] {false} ;
      T00142_A532TBM07_CRF_EDIT_AUTH_FLG = new String[] {""} ;
      T00142_n532TBM07_CRF_EDIT_AUTH_FLG = new boolean[] {false} ;
      T00142_A533TBM07_OTHER_SITE_VIEW_FLG = new String[] {""} ;
      T00142_n533TBM07_OTHER_SITE_VIEW_FLG = new boolean[] {false} ;
      T00142_A534TBM07_DEL_FLG = new String[] {""} ;
      T00142_n534TBM07_DEL_FLG = new boolean[] {false} ;
      T00142_A537TBM07_CRT_PROG_NM = new String[] {""} ;
      T00142_n537TBM07_CRT_PROG_NM = new boolean[] {false} ;
      T00142_A540TBM07_UPD_PROG_NM = new String[] {""} ;
      T00142_n540TBM07_UPD_PROG_NM = new boolean[] {false} ;
      T00142_A530TBM07_AUTH_CD = new String[] {""} ;
      T001413_A530TBM07_AUTH_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      T001414_A530TBM07_AUTH_CD = new String[] {""} ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm07_auth_behavior__default(),
         new Object[] {
             new Object[] {
            T00142_A535TBM07_CRT_DATETIME, T00142_n535TBM07_CRT_DATETIME, T00142_A536TBM07_CRT_USER_ID, T00142_n536TBM07_CRT_USER_ID, T00142_A538TBM07_UPD_DATETIME, T00142_n538TBM07_UPD_DATETIME, T00142_A539TBM07_UPD_USER_ID, T00142_n539TBM07_UPD_USER_ID, T00142_A541TBM07_UPD_CNT, T00142_n541TBM07_UPD_CNT,
            T00142_A531TBM07_CRF_INP_AUTH_FLG, T00142_n531TBM07_CRF_INP_AUTH_FLG, T00142_A532TBM07_CRF_EDIT_AUTH_FLG, T00142_n532TBM07_CRF_EDIT_AUTH_FLG, T00142_A533TBM07_OTHER_SITE_VIEW_FLG, T00142_n533TBM07_OTHER_SITE_VIEW_FLG, T00142_A534TBM07_DEL_FLG, T00142_n534TBM07_DEL_FLG, T00142_A537TBM07_CRT_PROG_NM, T00142_n537TBM07_CRT_PROG_NM,
            T00142_A540TBM07_UPD_PROG_NM, T00142_n540TBM07_UPD_PROG_NM, T00142_A530TBM07_AUTH_CD
            }
            , new Object[] {
            T00143_A535TBM07_CRT_DATETIME, T00143_n535TBM07_CRT_DATETIME, T00143_A536TBM07_CRT_USER_ID, T00143_n536TBM07_CRT_USER_ID, T00143_A538TBM07_UPD_DATETIME, T00143_n538TBM07_UPD_DATETIME, T00143_A539TBM07_UPD_USER_ID, T00143_n539TBM07_UPD_USER_ID, T00143_A541TBM07_UPD_CNT, T00143_n541TBM07_UPD_CNT,
            T00143_A531TBM07_CRF_INP_AUTH_FLG, T00143_n531TBM07_CRF_INP_AUTH_FLG, T00143_A532TBM07_CRF_EDIT_AUTH_FLG, T00143_n532TBM07_CRF_EDIT_AUTH_FLG, T00143_A533TBM07_OTHER_SITE_VIEW_FLG, T00143_n533TBM07_OTHER_SITE_VIEW_FLG, T00143_A534TBM07_DEL_FLG, T00143_n534TBM07_DEL_FLG, T00143_A537TBM07_CRT_PROG_NM, T00143_n537TBM07_CRT_PROG_NM,
            T00143_A540TBM07_UPD_PROG_NM, T00143_n540TBM07_UPD_PROG_NM, T00143_A530TBM07_AUTH_CD
            }
            , new Object[] {
            T00144_A530TBM07_AUTH_CD
            }
            , new Object[] {
            T00145_A535TBM07_CRT_DATETIME, T00145_n535TBM07_CRT_DATETIME, T00145_A536TBM07_CRT_USER_ID, T00145_n536TBM07_CRT_USER_ID, T00145_A538TBM07_UPD_DATETIME, T00145_n538TBM07_UPD_DATETIME, T00145_A539TBM07_UPD_USER_ID, T00145_n539TBM07_UPD_USER_ID, T00145_A541TBM07_UPD_CNT, T00145_n541TBM07_UPD_CNT,
            T00145_A531TBM07_CRF_INP_AUTH_FLG, T00145_n531TBM07_CRF_INP_AUTH_FLG, T00145_A532TBM07_CRF_EDIT_AUTH_FLG, T00145_n532TBM07_CRF_EDIT_AUTH_FLG, T00145_A533TBM07_OTHER_SITE_VIEW_FLG, T00145_n533TBM07_OTHER_SITE_VIEW_FLG, T00145_A534TBM07_DEL_FLG, T00145_n534TBM07_DEL_FLG, T00145_A537TBM07_CRT_PROG_NM, T00145_n537TBM07_CRT_PROG_NM,
            T00145_A540TBM07_UPD_PROG_NM, T00145_n540TBM07_UPD_PROG_NM, T00145_A530TBM07_AUTH_CD
            }
            , new Object[] {
            T00146_A530TBM07_AUTH_CD
            }
            , new Object[] {
            T00147_A530TBM07_AUTH_CD
            }
            , new Object[] {
            T00148_A530TBM07_AUTH_CD
            }
            , new Object[] {
            T00149_A530TBM07_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001413_A530TBM07_AUTH_CD
            }
            , new Object[] {
            T001414_A530TBM07_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM07_AUTH_BEHAVIOR" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound39 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM07_AUTH_CD_Enabled ;
   private int edtTBM07_CRF_INP_AUTH_FLG_Enabled ;
   private int edtTBM07_CRF_EDIT_AUTH_FLG_Enabled ;
   private int edtTBM07_OTHER_SITE_VIEW_FLG_Enabled ;
   private int edtTBM07_DEL_FLG_Enabled ;
   private int edtTBM07_CRT_DATETIME_Enabled ;
   private int edtTBM07_CRT_USER_ID_Enabled ;
   private int edtTBM07_CRT_PROG_NM_Enabled ;
   private int edtTBM07_UPD_DATETIME_Enabled ;
   private int edtTBM07_UPD_USER_ID_Enabled ;
   private int edtTBM07_UPD_PROG_NM_Enabled ;
   private int edtTBM07_UPD_CNT_Enabled ;
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
   private int AnyError530 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A541TBM07_UPD_CNT ;
   private long Z541TBM07_UPD_CNT ;
   private long O541TBM07_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM07_AUTH_CD_Internalname ;
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
   private String lblTextblocktbm07_auth_cd_Internalname ;
   private String lblTextblocktbm07_auth_cd_Jsonclick ;
   private String edtTBM07_AUTH_CD_Jsonclick ;
   private String lblTextblocktbm07_crf_inp_auth_flg_Internalname ;
   private String lblTextblocktbm07_crf_inp_auth_flg_Jsonclick ;
   private String edtTBM07_CRF_INP_AUTH_FLG_Internalname ;
   private String edtTBM07_CRF_INP_AUTH_FLG_Jsonclick ;
   private String lblTextblocktbm07_crf_edit_auth_flg_Internalname ;
   private String lblTextblocktbm07_crf_edit_auth_flg_Jsonclick ;
   private String edtTBM07_CRF_EDIT_AUTH_FLG_Internalname ;
   private String edtTBM07_CRF_EDIT_AUTH_FLG_Jsonclick ;
   private String lblTextblocktbm07_other_site_view_flg_Internalname ;
   private String lblTextblocktbm07_other_site_view_flg_Jsonclick ;
   private String edtTBM07_OTHER_SITE_VIEW_FLG_Internalname ;
   private String edtTBM07_OTHER_SITE_VIEW_FLG_Jsonclick ;
   private String lblTextblocktbm07_del_flg_Internalname ;
   private String lblTextblocktbm07_del_flg_Jsonclick ;
   private String edtTBM07_DEL_FLG_Internalname ;
   private String edtTBM07_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm07_crt_datetime_Internalname ;
   private String lblTextblocktbm07_crt_datetime_Jsonclick ;
   private String edtTBM07_CRT_DATETIME_Internalname ;
   private String edtTBM07_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm07_crt_user_id_Internalname ;
   private String lblTextblocktbm07_crt_user_id_Jsonclick ;
   private String edtTBM07_CRT_USER_ID_Internalname ;
   private String edtTBM07_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm07_crt_prog_nm_Internalname ;
   private String lblTextblocktbm07_crt_prog_nm_Jsonclick ;
   private String edtTBM07_CRT_PROG_NM_Internalname ;
   private String edtTBM07_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm07_upd_datetime_Internalname ;
   private String lblTextblocktbm07_upd_datetime_Jsonclick ;
   private String edtTBM07_UPD_DATETIME_Internalname ;
   private String edtTBM07_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm07_upd_user_id_Internalname ;
   private String lblTextblocktbm07_upd_user_id_Jsonclick ;
   private String edtTBM07_UPD_USER_ID_Internalname ;
   private String edtTBM07_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm07_upd_prog_nm_Internalname ;
   private String lblTextblocktbm07_upd_prog_nm_Jsonclick ;
   private String edtTBM07_UPD_PROG_NM_Internalname ;
   private String edtTBM07_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm07_upd_cnt_Internalname ;
   private String lblTextblocktbm07_upd_cnt_Jsonclick ;
   private String edtTBM07_UPD_CNT_Internalname ;
   private String edtTBM07_UPD_CNT_Jsonclick ;
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
   private String sMode39 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A535TBM07_CRT_DATETIME ;
   private java.util.Date A538TBM07_UPD_DATETIME ;
   private java.util.Date Z535TBM07_CRT_DATETIME ;
   private java.util.Date Z538TBM07_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n531TBM07_CRF_INP_AUTH_FLG ;
   private boolean n532TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean n533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean n534TBM07_DEL_FLG ;
   private boolean n535TBM07_CRT_DATETIME ;
   private boolean n536TBM07_CRT_USER_ID ;
   private boolean n537TBM07_CRT_PROG_NM ;
   private boolean n538TBM07_UPD_DATETIME ;
   private boolean n539TBM07_UPD_USER_ID ;
   private boolean n540TBM07_UPD_PROG_NM ;
   private boolean n541TBM07_UPD_CNT ;
   private boolean Gx_longc ;
   private String A530TBM07_AUTH_CD ;
   private String A531TBM07_CRF_INP_AUTH_FLG ;
   private String A532TBM07_CRF_EDIT_AUTH_FLG ;
   private String A533TBM07_OTHER_SITE_VIEW_FLG ;
   private String A534TBM07_DEL_FLG ;
   private String A536TBM07_CRT_USER_ID ;
   private String A537TBM07_CRT_PROG_NM ;
   private String A539TBM07_UPD_USER_ID ;
   private String A540TBM07_UPD_PROG_NM ;
   private String Z530TBM07_AUTH_CD ;
   private String Z536TBM07_CRT_USER_ID ;
   private String Z539TBM07_UPD_USER_ID ;
   private String Z531TBM07_CRF_INP_AUTH_FLG ;
   private String Z532TBM07_CRF_EDIT_AUTH_FLG ;
   private String Z533TBM07_OTHER_SITE_VIEW_FLG ;
   private String Z534TBM07_DEL_FLG ;
   private String Z537TBM07_CRT_PROG_NM ;
   private String Z540TBM07_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T00145_A535TBM07_CRT_DATETIME ;
   private boolean[] T00145_n535TBM07_CRT_DATETIME ;
   private String[] T00145_A536TBM07_CRT_USER_ID ;
   private boolean[] T00145_n536TBM07_CRT_USER_ID ;
   private java.util.Date[] T00145_A538TBM07_UPD_DATETIME ;
   private boolean[] T00145_n538TBM07_UPD_DATETIME ;
   private String[] T00145_A539TBM07_UPD_USER_ID ;
   private boolean[] T00145_n539TBM07_UPD_USER_ID ;
   private long[] T00145_A541TBM07_UPD_CNT ;
   private boolean[] T00145_n541TBM07_UPD_CNT ;
   private String[] T00145_A531TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] T00145_n531TBM07_CRF_INP_AUTH_FLG ;
   private String[] T00145_A532TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] T00145_n532TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] T00145_A533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] T00145_n533TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] T00145_A534TBM07_DEL_FLG ;
   private boolean[] T00145_n534TBM07_DEL_FLG ;
   private String[] T00145_A537TBM07_CRT_PROG_NM ;
   private boolean[] T00145_n537TBM07_CRT_PROG_NM ;
   private String[] T00145_A540TBM07_UPD_PROG_NM ;
   private boolean[] T00145_n540TBM07_UPD_PROG_NM ;
   private String[] T00145_A530TBM07_AUTH_CD ;
   private String[] T00144_A530TBM07_AUTH_CD ;
   private String[] T00146_A530TBM07_AUTH_CD ;
   private String[] T00147_A530TBM07_AUTH_CD ;
   private java.util.Date[] T00143_A535TBM07_CRT_DATETIME ;
   private boolean[] T00143_n535TBM07_CRT_DATETIME ;
   private String[] T00143_A536TBM07_CRT_USER_ID ;
   private boolean[] T00143_n536TBM07_CRT_USER_ID ;
   private java.util.Date[] T00143_A538TBM07_UPD_DATETIME ;
   private boolean[] T00143_n538TBM07_UPD_DATETIME ;
   private String[] T00143_A539TBM07_UPD_USER_ID ;
   private boolean[] T00143_n539TBM07_UPD_USER_ID ;
   private long[] T00143_A541TBM07_UPD_CNT ;
   private boolean[] T00143_n541TBM07_UPD_CNT ;
   private String[] T00143_A531TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] T00143_n531TBM07_CRF_INP_AUTH_FLG ;
   private String[] T00143_A532TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] T00143_n532TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] T00143_A533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] T00143_n533TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] T00143_A534TBM07_DEL_FLG ;
   private boolean[] T00143_n534TBM07_DEL_FLG ;
   private String[] T00143_A537TBM07_CRT_PROG_NM ;
   private boolean[] T00143_n537TBM07_CRT_PROG_NM ;
   private String[] T00143_A540TBM07_UPD_PROG_NM ;
   private boolean[] T00143_n540TBM07_UPD_PROG_NM ;
   private String[] T00143_A530TBM07_AUTH_CD ;
   private String[] T00148_A530TBM07_AUTH_CD ;
   private String[] T00149_A530TBM07_AUTH_CD ;
   private java.util.Date[] T00142_A535TBM07_CRT_DATETIME ;
   private boolean[] T00142_n535TBM07_CRT_DATETIME ;
   private String[] T00142_A536TBM07_CRT_USER_ID ;
   private boolean[] T00142_n536TBM07_CRT_USER_ID ;
   private java.util.Date[] T00142_A538TBM07_UPD_DATETIME ;
   private boolean[] T00142_n538TBM07_UPD_DATETIME ;
   private String[] T00142_A539TBM07_UPD_USER_ID ;
   private boolean[] T00142_n539TBM07_UPD_USER_ID ;
   private long[] T00142_A541TBM07_UPD_CNT ;
   private boolean[] T00142_n541TBM07_UPD_CNT ;
   private String[] T00142_A531TBM07_CRF_INP_AUTH_FLG ;
   private boolean[] T00142_n531TBM07_CRF_INP_AUTH_FLG ;
   private String[] T00142_A532TBM07_CRF_EDIT_AUTH_FLG ;
   private boolean[] T00142_n532TBM07_CRF_EDIT_AUTH_FLG ;
   private String[] T00142_A533TBM07_OTHER_SITE_VIEW_FLG ;
   private boolean[] T00142_n533TBM07_OTHER_SITE_VIEW_FLG ;
   private String[] T00142_A534TBM07_DEL_FLG ;
   private boolean[] T00142_n534TBM07_DEL_FLG ;
   private String[] T00142_A537TBM07_CRT_PROG_NM ;
   private boolean[] T00142_n537TBM07_CRT_PROG_NM ;
   private String[] T00142_A540TBM07_UPD_PROG_NM ;
   private boolean[] T00142_n540TBM07_UPD_PROG_NM ;
   private String[] T00142_A530TBM07_AUTH_CD ;
   private String[] T001413_A530TBM07_AUTH_CD ;
   private String[] T001414_A530TBM07_AUTH_CD ;
}

final  class tbm07_auth_behavior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00142", "SELECT `TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00143", "SELECT `TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00144", "SELECT `TAM04_AUTH_CD` AS TBM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00145", "SELECT TM1.`TBM07_CRT_DATETIME`, TM1.`TBM07_CRT_USER_ID`, TM1.`TBM07_UPD_DATETIME`, TM1.`TBM07_UPD_USER_ID`, TM1.`TBM07_UPD_CNT`, TM1.`TBM07_CRF_INP_AUTH_FLG`, TM1.`TBM07_CRF_EDIT_AUTH_FLG`, TM1.`TBM07_OTHER_SITE_VIEW_FLG`, TM1.`TBM07_DEL_FLG`, TM1.`TBM07_CRT_PROG_NM`, TM1.`TBM07_UPD_PROG_NM`, TM1.`TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` TM1 WHERE TM1.`TBM07_AUTH_CD` = ? ORDER BY TM1.`TBM07_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T00146", "SELECT `TAM04_AUTH_CD` AS TBM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00147", "SELECT `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00148", "SELECT `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE ( `TBM07_AUTH_CD` > ?) ORDER BY `TBM07_AUTH_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00149", "SELECT `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` WHERE ( `TBM07_AUTH_CD` < ?) ORDER BY `TBM07_AUTH_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001410", "INSERT INTO `TBM07_AUTH_BEHAVIOR` (`TBM07_CRT_DATETIME`, `TBM07_CRT_USER_ID`, `TBM07_UPD_DATETIME`, `TBM07_UPD_USER_ID`, `TBM07_UPD_CNT`, `TBM07_CRF_INP_AUTH_FLG`, `TBM07_CRF_EDIT_AUTH_FLG`, `TBM07_OTHER_SITE_VIEW_FLG`, `TBM07_DEL_FLG`, `TBM07_CRT_PROG_NM`, `TBM07_UPD_PROG_NM`, `TBM07_AUTH_CD`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001411", "UPDATE `TBM07_AUTH_BEHAVIOR` SET `TBM07_CRT_DATETIME`=?, `TBM07_CRT_USER_ID`=?, `TBM07_UPD_DATETIME`=?, `TBM07_UPD_USER_ID`=?, `TBM07_UPD_CNT`=?, `TBM07_CRF_INP_AUTH_FLG`=?, `TBM07_CRF_EDIT_AUTH_FLG`=?, `TBM07_OTHER_SITE_VIEW_FLG`=?, `TBM07_DEL_FLG`=?, `TBM07_CRT_PROG_NM`=?, `TBM07_UPD_PROG_NM`=?  WHERE `TBM07_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T001412", "DELETE FROM `TBM07_AUTH_BEHAVIOR`  WHERE `TBM07_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T001413", "SELECT `TBM07_AUTH_CD` AS TBM07_AUTH_CD FROM `TBM07_AUTH_BEHAVIOR` ORDER BY `TBM07_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T001414", "SELECT `TAM04_AUTH_CD` AS TBM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               break;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
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
                  stmt.setVarchar(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               stmt.setVarchar(12, (String)parms[22], 2, false);
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
                  stmt.setVarchar(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               stmt.setVarchar(12, (String)parms[22], 2, false);
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
      }
   }

}

