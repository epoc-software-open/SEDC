/*
               File: tbm23_study_staff_impl
        Description: 試験参加スタッフマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:26.33
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm23_study_staff_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM23_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm23_crt_user_id0I17( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM23_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm23_upd_user_id0I17( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A107TBM23_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A107TBM23_STUDY_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A108TBM23_USER_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A108TBM23_USER_ID) ;
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
         Form.getMeta().addItem("description", "試験参加スタッフマスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm23_study_staff_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm23_study_staff_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm23_study_staff_impl.class ));
   }

   public tbm23_study_staff_impl( int remoteHandle ,
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
         wb_table1_2_0I17( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0I17e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0I17( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0I17( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0I17( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0I17e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "試験参加スタッフマスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM23_STUDY_STAFF.htm");
         wb_table3_28_0I17( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0I17e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0I17e( true) ;
      }
      else
      {
         wb_table1_2_0I17e( false) ;
      }
   }

   public void wb_table3_28_0I17( boolean wbgen )
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
         wb_table4_34_0I17( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0I17e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM23_STUDY_STAFF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM23_STUDY_STAFF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0I17e( true) ;
      }
      else
      {
         wb_table3_28_0I17e( false) ;
      }
   }

   public void wb_table4_34_0I17( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_study_id_Internalname, "試験ID", "", "", lblTextblocktbm23_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A107TBM23_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM23_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A107TBM23_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A107TBM23_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM23_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM23_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_user_id_Internalname, "ユーザＩＤ", "", "", lblTextblocktbm23_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_USER_ID_Internalname, GXutil.rtrim( A108TBM23_USER_ID), GXutil.rtrim( localUtil.format( A108TBM23_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM23_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM23_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_stydy_auth_cd_Internalname, "試験内権限コード", "", "", lblTextblocktbm23_stydy_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_STYDY_AUTH_CD_Internalname, GXutil.rtrim( A109TBM23_STYDY_AUTH_CD), GXutil.rtrim( localUtil.format( A109TBM23_STYDY_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM23_STYDY_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM23_STYDY_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm23_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_DEL_FLG_Internalname, GXutil.rtrim( A385TBM23_DEL_FLG), GXutil.rtrim( localUtil.format( A385TBM23_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM23_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM23_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm23_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM23_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_CRT_DATETIME_Internalname, localUtil.format(A386TBM23_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A386TBM23_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM23_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM23_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM23_STUDY_STAFF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM23_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM23_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm23_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_CRT_USER_ID_Internalname, GXutil.rtrim( A387TBM23_CRT_USER_ID), GXutil.rtrim( localUtil.format( A387TBM23_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM23_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM23_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm23_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_CRT_PROG_NM_Internalname, GXutil.rtrim( A388TBM23_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A388TBM23_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM23_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM23_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm23_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM23_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_UPD_DATETIME_Internalname, localUtil.format(A389TBM23_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A389TBM23_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM23_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM23_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM23_STUDY_STAFF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM23_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM23_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm23_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_UPD_USER_ID_Internalname, GXutil.rtrim( A390TBM23_UPD_USER_ID), GXutil.rtrim( localUtil.format( A390TBM23_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM23_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM23_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm23_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_UPD_PROG_NM_Internalname, GXutil.rtrim( A391TBM23_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A391TBM23_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM23_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM23_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm23_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm23_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM23_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A392TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM23_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A392TBM23_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A392TBM23_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM23_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM23_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM23_STUDY_STAFF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0I17e( true) ;
      }
      else
      {
         wb_table4_34_0I17e( false) ;
      }
   }

   public void wb_table2_5_0I17( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM23_STUDY_STAFF.htm");
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
         wb_table2_5_0I17e( true) ;
      }
      else
      {
         wb_table2_5_0I17e( false) ;
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
      /* Execute user event: e110I2 */
      e110I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM23_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM23_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM23_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A107TBM23_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
            }
            else
            {
               A107TBM23_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM23_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
            }
            A108TBM23_USER_ID = httpContext.cgiGet( edtTBM23_USER_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
            A109TBM23_STYDY_AUTH_CD = httpContext.cgiGet( edtTBM23_STYDY_AUTH_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
            A385TBM23_DEL_FLG = httpContext.cgiGet( edtTBM23_DEL_FLG_Internalname) ;
            n385TBM23_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A385TBM23_DEL_FLG", A385TBM23_DEL_FLG);
            n385TBM23_DEL_FLG = ((GXutil.strcmp("", A385TBM23_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM23_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM23_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM23_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A386TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n386TBM23_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A386TBM23_CRT_DATETIME", localUtil.ttoc( A386TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A386TBM23_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM23_CRT_DATETIME_Internalname)) ;
               n386TBM23_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A386TBM23_CRT_DATETIME", localUtil.ttoc( A386TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n386TBM23_CRT_DATETIME = (GXutil.nullDate().equals(A386TBM23_CRT_DATETIME) ? true : false) ;
            A387TBM23_CRT_USER_ID = httpContext.cgiGet( edtTBM23_CRT_USER_ID_Internalname) ;
            n387TBM23_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A387TBM23_CRT_USER_ID", A387TBM23_CRT_USER_ID);
            n387TBM23_CRT_USER_ID = ((GXutil.strcmp("", A387TBM23_CRT_USER_ID)==0) ? true : false) ;
            A388TBM23_CRT_PROG_NM = httpContext.cgiGet( edtTBM23_CRT_PROG_NM_Internalname) ;
            n388TBM23_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A388TBM23_CRT_PROG_NM", A388TBM23_CRT_PROG_NM);
            n388TBM23_CRT_PROG_NM = ((GXutil.strcmp("", A388TBM23_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM23_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM23_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM23_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n389TBM23_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A389TBM23_UPD_DATETIME", localUtil.ttoc( A389TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A389TBM23_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM23_UPD_DATETIME_Internalname)) ;
               n389TBM23_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A389TBM23_UPD_DATETIME", localUtil.ttoc( A389TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n389TBM23_UPD_DATETIME = (GXutil.nullDate().equals(A389TBM23_UPD_DATETIME) ? true : false) ;
            A390TBM23_UPD_USER_ID = httpContext.cgiGet( edtTBM23_UPD_USER_ID_Internalname) ;
            n390TBM23_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A390TBM23_UPD_USER_ID", A390TBM23_UPD_USER_ID);
            n390TBM23_UPD_USER_ID = ((GXutil.strcmp("", A390TBM23_UPD_USER_ID)==0) ? true : false) ;
            A391TBM23_UPD_PROG_NM = httpContext.cgiGet( edtTBM23_UPD_PROG_NM_Internalname) ;
            n391TBM23_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A391TBM23_UPD_PROG_NM", A391TBM23_UPD_PROG_NM);
            n391TBM23_UPD_PROG_NM = ((GXutil.strcmp("", A391TBM23_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM23_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM23_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM23_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM23_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A392TBM23_UPD_CNT = 0 ;
               n392TBM23_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A392TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)));
            }
            else
            {
               A392TBM23_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM23_UPD_CNT_Internalname), ".", ",") ;
               n392TBM23_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A392TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)));
            }
            n392TBM23_UPD_CNT = ((0==A392TBM23_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z107TBM23_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z107TBM23_STUDY_ID"), ".", ",") ;
            Z108TBM23_USER_ID = httpContext.cgiGet( "Z108TBM23_USER_ID") ;
            Z109TBM23_STYDY_AUTH_CD = httpContext.cgiGet( "Z109TBM23_STYDY_AUTH_CD") ;
            Z386TBM23_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z386TBM23_CRT_DATETIME"), 0) ;
            n386TBM23_CRT_DATETIME = (GXutil.nullDate().equals(A386TBM23_CRT_DATETIME) ? true : false) ;
            Z387TBM23_CRT_USER_ID = httpContext.cgiGet( "Z387TBM23_CRT_USER_ID") ;
            n387TBM23_CRT_USER_ID = ((GXutil.strcmp("", A387TBM23_CRT_USER_ID)==0) ? true : false) ;
            Z389TBM23_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z389TBM23_UPD_DATETIME"), 0) ;
            n389TBM23_UPD_DATETIME = (GXutil.nullDate().equals(A389TBM23_UPD_DATETIME) ? true : false) ;
            Z390TBM23_UPD_USER_ID = httpContext.cgiGet( "Z390TBM23_UPD_USER_ID") ;
            n390TBM23_UPD_USER_ID = ((GXutil.strcmp("", A390TBM23_UPD_USER_ID)==0) ? true : false) ;
            Z392TBM23_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z392TBM23_UPD_CNT"), ".", ",") ;
            n392TBM23_UPD_CNT = ((0==A392TBM23_UPD_CNT) ? true : false) ;
            Z385TBM23_DEL_FLG = httpContext.cgiGet( "Z385TBM23_DEL_FLG") ;
            n385TBM23_DEL_FLG = ((GXutil.strcmp("", A385TBM23_DEL_FLG)==0) ? true : false) ;
            Z388TBM23_CRT_PROG_NM = httpContext.cgiGet( "Z388TBM23_CRT_PROG_NM") ;
            n388TBM23_CRT_PROG_NM = ((GXutil.strcmp("", A388TBM23_CRT_PROG_NM)==0) ? true : false) ;
            Z391TBM23_UPD_PROG_NM = httpContext.cgiGet( "Z391TBM23_UPD_PROG_NM") ;
            n391TBM23_UPD_PROG_NM = ((GXutil.strcmp("", A391TBM23_UPD_PROG_NM)==0) ? true : false) ;
            O392TBM23_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O392TBM23_UPD_CNT"), ".", ",") ;
            n392TBM23_UPD_CNT = ((0==A392TBM23_UPD_CNT) ? true : false) ;
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
               A107TBM23_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
               A108TBM23_USER_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
               A109TBM23_STYDY_AUTH_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
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
                     /* Execute user event: e110I2 */
                     e110I2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120I2 */
                     e120I2 ();
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
         /* Execute user event: e120I2 */
         e120I2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0I17( ) ;
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
      disableAttributes0I17( ) ;
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

   public void resetCaption0I0( )
   {
   }

   public void e110I2( )
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

   public void e120I2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A108TBM23_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A109TBM23_STYDY_AUTH_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A385TBM23_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A386TBM23_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm23_study_staff_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A386TBM23_CRT_DATETIME", localUtil.ttoc( A386TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A387TBM23_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A388TBM23_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A389TBM23_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm23_study_staff_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A389TBM23_UPD_DATETIME", localUtil.ttoc( A389TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A390TBM23_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A391TBM23_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0I17( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z386TBM23_CRT_DATETIME = T000I3_A386TBM23_CRT_DATETIME[0] ;
            Z387TBM23_CRT_USER_ID = T000I3_A387TBM23_CRT_USER_ID[0] ;
            Z389TBM23_UPD_DATETIME = T000I3_A389TBM23_UPD_DATETIME[0] ;
            Z390TBM23_UPD_USER_ID = T000I3_A390TBM23_UPD_USER_ID[0] ;
            Z392TBM23_UPD_CNT = T000I3_A392TBM23_UPD_CNT[0] ;
            Z385TBM23_DEL_FLG = T000I3_A385TBM23_DEL_FLG[0] ;
            Z388TBM23_CRT_PROG_NM = T000I3_A388TBM23_CRT_PROG_NM[0] ;
            Z391TBM23_UPD_PROG_NM = T000I3_A391TBM23_UPD_PROG_NM[0] ;
         }
         else
         {
            Z386TBM23_CRT_DATETIME = A386TBM23_CRT_DATETIME ;
            Z387TBM23_CRT_USER_ID = A387TBM23_CRT_USER_ID ;
            Z389TBM23_UPD_DATETIME = A389TBM23_UPD_DATETIME ;
            Z390TBM23_UPD_USER_ID = A390TBM23_UPD_USER_ID ;
            Z392TBM23_UPD_CNT = A392TBM23_UPD_CNT ;
            Z385TBM23_DEL_FLG = A385TBM23_DEL_FLG ;
            Z388TBM23_CRT_PROG_NM = A388TBM23_CRT_PROG_NM ;
            Z391TBM23_UPD_PROG_NM = A391TBM23_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z109TBM23_STYDY_AUTH_CD = A109TBM23_STYDY_AUTH_CD ;
         Z386TBM23_CRT_DATETIME = A386TBM23_CRT_DATETIME ;
         Z387TBM23_CRT_USER_ID = A387TBM23_CRT_USER_ID ;
         Z389TBM23_UPD_DATETIME = A389TBM23_UPD_DATETIME ;
         Z390TBM23_UPD_USER_ID = A390TBM23_UPD_USER_ID ;
         Z392TBM23_UPD_CNT = A392TBM23_UPD_CNT ;
         Z385TBM23_DEL_FLG = A385TBM23_DEL_FLG ;
         Z388TBM23_CRT_PROG_NM = A388TBM23_CRT_PROG_NM ;
         Z391TBM23_UPD_PROG_NM = A391TBM23_UPD_PROG_NM ;
         Z107TBM23_STUDY_ID = A107TBM23_STUDY_ID ;
         Z108TBM23_USER_ID = A108TBM23_USER_ID ;
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

   public void load0I17( )
   {
      /* Using cursor T000I6 */
      pr_default.execute(4, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A386TBM23_CRT_DATETIME = T000I6_A386TBM23_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A386TBM23_CRT_DATETIME", localUtil.ttoc( A386TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n386TBM23_CRT_DATETIME = T000I6_n386TBM23_CRT_DATETIME[0] ;
         A387TBM23_CRT_USER_ID = T000I6_A387TBM23_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387TBM23_CRT_USER_ID", A387TBM23_CRT_USER_ID);
         n387TBM23_CRT_USER_ID = T000I6_n387TBM23_CRT_USER_ID[0] ;
         A389TBM23_UPD_DATETIME = T000I6_A389TBM23_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389TBM23_UPD_DATETIME", localUtil.ttoc( A389TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n389TBM23_UPD_DATETIME = T000I6_n389TBM23_UPD_DATETIME[0] ;
         A390TBM23_UPD_USER_ID = T000I6_A390TBM23_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A390TBM23_UPD_USER_ID", A390TBM23_UPD_USER_ID);
         n390TBM23_UPD_USER_ID = T000I6_n390TBM23_UPD_USER_ID[0] ;
         A392TBM23_UPD_CNT = T000I6_A392TBM23_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)));
         n392TBM23_UPD_CNT = T000I6_n392TBM23_UPD_CNT[0] ;
         A385TBM23_DEL_FLG = T000I6_A385TBM23_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A385TBM23_DEL_FLG", A385TBM23_DEL_FLG);
         n385TBM23_DEL_FLG = T000I6_n385TBM23_DEL_FLG[0] ;
         A388TBM23_CRT_PROG_NM = T000I6_A388TBM23_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A388TBM23_CRT_PROG_NM", A388TBM23_CRT_PROG_NM);
         n388TBM23_CRT_PROG_NM = T000I6_n388TBM23_CRT_PROG_NM[0] ;
         A391TBM23_UPD_PROG_NM = T000I6_A391TBM23_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A391TBM23_UPD_PROG_NM", A391TBM23_UPD_PROG_NM);
         n391TBM23_UPD_PROG_NM = T000I6_n391TBM23_UPD_PROG_NM[0] ;
         zm0I17( -8) ;
      }
      pr_default.close(4);
      onLoadActions0I17( ) ;
   }

   public void onLoadActions0I17( )
   {
      AV9Pgmname = "TBM23_STUDY_STAFF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0I17( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM23_STUDY_STAFF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000I4 */
      pr_default.execute(2, new Object[] {new Long(A107TBM23_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T000I5 */
      pr_default.execute(3, new Object[] {A108TBM23_USER_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_USER_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_USER_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      if ( ! ( GXutil.nullDate().equals(A386TBM23_CRT_DATETIME) || (( A386TBM23_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A386TBM23_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM23_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A389TBM23_UPD_DATETIME) || (( A389TBM23_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A389TBM23_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM23_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0I17( )
   {
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A107TBM23_STUDY_ID )
   {
      /* Using cursor T000I4 */
      pr_default.execute(2, new Object[] {new Long(A107TBM23_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
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

   public void gxload_10( String A108TBM23_USER_ID )
   {
      /* Using cursor T000I5 */
      pr_default.execute(3, new Object[] {A108TBM23_USER_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_USER_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_USER_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(3);
   }

   public void getKey0I17( )
   {
      /* Using cursor T000I7 */
      pr_default.execute(5, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound17 = (short)(1) ;
      }
      else
      {
         RcdFound17 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000I3 */
      pr_default.execute(1, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0I17( 8) ;
         RcdFound17 = (short)(1) ;
         A109TBM23_STYDY_AUTH_CD = T000I3_A109TBM23_STYDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
         A386TBM23_CRT_DATETIME = T000I3_A386TBM23_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A386TBM23_CRT_DATETIME", localUtil.ttoc( A386TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n386TBM23_CRT_DATETIME = T000I3_n386TBM23_CRT_DATETIME[0] ;
         A387TBM23_CRT_USER_ID = T000I3_A387TBM23_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A387TBM23_CRT_USER_ID", A387TBM23_CRT_USER_ID);
         n387TBM23_CRT_USER_ID = T000I3_n387TBM23_CRT_USER_ID[0] ;
         A389TBM23_UPD_DATETIME = T000I3_A389TBM23_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A389TBM23_UPD_DATETIME", localUtil.ttoc( A389TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n389TBM23_UPD_DATETIME = T000I3_n389TBM23_UPD_DATETIME[0] ;
         A390TBM23_UPD_USER_ID = T000I3_A390TBM23_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A390TBM23_UPD_USER_ID", A390TBM23_UPD_USER_ID);
         n390TBM23_UPD_USER_ID = T000I3_n390TBM23_UPD_USER_ID[0] ;
         A392TBM23_UPD_CNT = T000I3_A392TBM23_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A392TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)));
         n392TBM23_UPD_CNT = T000I3_n392TBM23_UPD_CNT[0] ;
         A385TBM23_DEL_FLG = T000I3_A385TBM23_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A385TBM23_DEL_FLG", A385TBM23_DEL_FLG);
         n385TBM23_DEL_FLG = T000I3_n385TBM23_DEL_FLG[0] ;
         A388TBM23_CRT_PROG_NM = T000I3_A388TBM23_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A388TBM23_CRT_PROG_NM", A388TBM23_CRT_PROG_NM);
         n388TBM23_CRT_PROG_NM = T000I3_n388TBM23_CRT_PROG_NM[0] ;
         A391TBM23_UPD_PROG_NM = T000I3_A391TBM23_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A391TBM23_UPD_PROG_NM", A391TBM23_UPD_PROG_NM);
         n391TBM23_UPD_PROG_NM = T000I3_n391TBM23_UPD_PROG_NM[0] ;
         A107TBM23_STUDY_ID = T000I3_A107TBM23_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
         A108TBM23_USER_ID = T000I3_A108TBM23_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
         O392TBM23_UPD_CNT = A392TBM23_UPD_CNT ;
         n392TBM23_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A392TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)));
         Z107TBM23_STUDY_ID = A107TBM23_STUDY_ID ;
         Z108TBM23_USER_ID = A108TBM23_USER_ID ;
         Z109TBM23_STYDY_AUTH_CD = A109TBM23_STYDY_AUTH_CD ;
         sMode17 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0I17( ) ;
         if ( AnyError == 1 )
         {
            RcdFound17 = (short)(0) ;
            initializeNonKey0I17( ) ;
         }
         Gx_mode = sMode17 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound17 = (short)(0) ;
         initializeNonKey0I17( ) ;
         sMode17 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode17 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0I17( ) ;
      if ( RcdFound17 == 0 )
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
      RcdFound17 = (short)(0) ;
      /* Using cursor T000I8 */
      pr_default.execute(6, new Object[] {new Long(A107TBM23_STUDY_ID), new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A108TBM23_USER_ID, new Long(A107TBM23_STUDY_ID), A109TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000I8_A107TBM23_STUDY_ID[0] < A107TBM23_STUDY_ID ) || ( T000I8_A107TBM23_STUDY_ID[0] == A107TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I8_A108TBM23_USER_ID[0], A108TBM23_USER_ID) < 0 ) || ( GXutil.strcmp(T000I8_A108TBM23_USER_ID[0], A108TBM23_USER_ID) == 0 ) && ( T000I8_A107TBM23_STUDY_ID[0] == A107TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I8_A109TBM23_STYDY_AUTH_CD[0], A109TBM23_STYDY_AUTH_CD) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000I8_A107TBM23_STUDY_ID[0] > A107TBM23_STUDY_ID ) || ( T000I8_A107TBM23_STUDY_ID[0] == A107TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I8_A108TBM23_USER_ID[0], A108TBM23_USER_ID) > 0 ) || ( GXutil.strcmp(T000I8_A108TBM23_USER_ID[0], A108TBM23_USER_ID) == 0 ) && ( T000I8_A107TBM23_STUDY_ID[0] == A107TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I8_A109TBM23_STYDY_AUTH_CD[0], A109TBM23_STYDY_AUTH_CD) > 0 ) ) )
         {
            A107TBM23_STUDY_ID = T000I8_A107TBM23_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
            A108TBM23_USER_ID = T000I8_A108TBM23_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
            A109TBM23_STYDY_AUTH_CD = T000I8_A109TBM23_STYDY_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
            RcdFound17 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound17 = (short)(0) ;
      /* Using cursor T000I9 */
      pr_default.execute(7, new Object[] {new Long(A107TBM23_STUDY_ID), new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A108TBM23_USER_ID, new Long(A107TBM23_STUDY_ID), A109TBM23_STYDY_AUTH_CD});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000I9_A107TBM23_STUDY_ID[0] > A107TBM23_STUDY_ID ) || ( T000I9_A107TBM23_STUDY_ID[0] == A107TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I9_A108TBM23_USER_ID[0], A108TBM23_USER_ID) > 0 ) || ( GXutil.strcmp(T000I9_A108TBM23_USER_ID[0], A108TBM23_USER_ID) == 0 ) && ( T000I9_A107TBM23_STUDY_ID[0] == A107TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I9_A109TBM23_STYDY_AUTH_CD[0], A109TBM23_STYDY_AUTH_CD) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000I9_A107TBM23_STUDY_ID[0] < A107TBM23_STUDY_ID ) || ( T000I9_A107TBM23_STUDY_ID[0] == A107TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I9_A108TBM23_USER_ID[0], A108TBM23_USER_ID) < 0 ) || ( GXutil.strcmp(T000I9_A108TBM23_USER_ID[0], A108TBM23_USER_ID) == 0 ) && ( T000I9_A107TBM23_STUDY_ID[0] == A107TBM23_STUDY_ID ) && ( GXutil.strcmp(T000I9_A109TBM23_STYDY_AUTH_CD[0], A109TBM23_STYDY_AUTH_CD) < 0 ) ) )
         {
            A107TBM23_STUDY_ID = T000I9_A107TBM23_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
            A108TBM23_USER_ID = T000I9_A108TBM23_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
            A109TBM23_STYDY_AUTH_CD = T000I9_A109TBM23_STYDY_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
            RcdFound17 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0I17( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0I17( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound17 == 1 )
         {
            if ( ( A107TBM23_STUDY_ID != Z107TBM23_STUDY_ID ) || ( GXutil.strcmp(A108TBM23_USER_ID, Z108TBM23_USER_ID) != 0 ) || ( GXutil.strcmp(A109TBM23_STYDY_AUTH_CD, Z109TBM23_STYDY_AUTH_CD) != 0 ) )
            {
               A107TBM23_STUDY_ID = Z107TBM23_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
               A108TBM23_USER_ID = Z108TBM23_USER_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
               A109TBM23_STYDY_AUTH_CD = Z109TBM23_STYDY_AUTH_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM23_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0I17( ) ;
               GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A107TBM23_STUDY_ID != Z107TBM23_STUDY_ID ) || ( GXutil.strcmp(A108TBM23_USER_ID, Z108TBM23_USER_ID) != 0 ) || ( GXutil.strcmp(A109TBM23_STYDY_AUTH_CD, Z109TBM23_STYDY_AUTH_CD) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0I17( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM23_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0I17( ) ;
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
      if ( ( A107TBM23_STUDY_ID != Z107TBM23_STUDY_ID ) || ( GXutil.strcmp(A108TBM23_USER_ID, Z108TBM23_USER_ID) != 0 ) || ( GXutil.strcmp(A109TBM23_STYDY_AUTH_CD, Z109TBM23_STYDY_AUTH_CD) != 0 ) )
      {
         A107TBM23_STUDY_ID = Z107TBM23_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
         A108TBM23_USER_ID = Z108TBM23_USER_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
         A109TBM23_STYDY_AUTH_CD = Z109TBM23_STYDY_AUTH_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
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
      if ( RcdFound17 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0I17( ) ;
      if ( RcdFound17 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0I17( ) ;
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
      if ( RcdFound17 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
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
      if ( RcdFound17 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
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
      scanStart0I17( ) ;
      if ( RcdFound17 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound17 != 0 )
         {
            scanNext0I17( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0I17( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0I17( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000I2 */
         pr_default.execute(0, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM23_STUDY_STAFF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z386TBM23_CRT_DATETIME.equals( T000I2_A386TBM23_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z387TBM23_CRT_USER_ID, T000I2_A387TBM23_CRT_USER_ID[0]) != 0 ) || !( Z389TBM23_UPD_DATETIME.equals( T000I2_A389TBM23_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z390TBM23_UPD_USER_ID, T000I2_A390TBM23_UPD_USER_ID[0]) != 0 ) || ( Z392TBM23_UPD_CNT != T000I2_A392TBM23_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z385TBM23_DEL_FLG, T000I2_A385TBM23_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z388TBM23_CRT_PROG_NM, T000I2_A388TBM23_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z391TBM23_UPD_PROG_NM, T000I2_A391TBM23_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM23_STUDY_STAFF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0I17( )
   {
      beforeValidate0I17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I17( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0I17( 0) ;
         checkOptimisticConcurrency0I17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I17( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0I17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000I10 */
                  pr_default.execute(8, new Object[] {A109TBM23_STYDY_AUTH_CD, new Boolean(n386TBM23_CRT_DATETIME), A386TBM23_CRT_DATETIME, new Boolean(n387TBM23_CRT_USER_ID), A387TBM23_CRT_USER_ID, new Boolean(n389TBM23_UPD_DATETIME), A389TBM23_UPD_DATETIME, new Boolean(n390TBM23_UPD_USER_ID), A390TBM23_UPD_USER_ID, new Boolean(n392TBM23_UPD_CNT), new Long(A392TBM23_UPD_CNT), new Boolean(n385TBM23_DEL_FLG), A385TBM23_DEL_FLG, new Boolean(n388TBM23_CRT_PROG_NM), A388TBM23_CRT_PROG_NM, new Boolean(n391TBM23_UPD_PROG_NM), A391TBM23_UPD_PROG_NM, new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM23_STUDY_STAFF") ;
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                        resetCaption0I0( ) ;
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
            load0I17( ) ;
         }
         endLevel0I17( ) ;
      }
      closeExtendedTableCursors0I17( ) ;
   }

   public void update0I17( )
   {
      beforeValidate0I17( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0I17( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I17( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0I17( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0I17( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000I11 */
                  pr_default.execute(9, new Object[] {new Boolean(n386TBM23_CRT_DATETIME), A386TBM23_CRT_DATETIME, new Boolean(n387TBM23_CRT_USER_ID), A387TBM23_CRT_USER_ID, new Boolean(n389TBM23_UPD_DATETIME), A389TBM23_UPD_DATETIME, new Boolean(n390TBM23_UPD_USER_ID), A390TBM23_UPD_USER_ID, new Boolean(n392TBM23_UPD_CNT), new Long(A392TBM23_UPD_CNT), new Boolean(n385TBM23_DEL_FLG), A385TBM23_DEL_FLG, new Boolean(n388TBM23_CRT_PROG_NM), A388TBM23_CRT_PROG_NM, new Boolean(n391TBM23_UPD_PROG_NM), A391TBM23_UPD_PROG_NM, new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM23_STUDY_STAFF") ;
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM23_STUDY_STAFF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0I17( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0I0( ) ;
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
         endLevel0I17( ) ;
      }
      closeExtendedTableCursors0I17( ) ;
   }

   public void deferredUpdate0I17( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0I17( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0I17( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0I17( ) ;
         afterConfirm0I17( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0I17( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000I12 */
               pr_default.execute(10, new Object[] {new Long(A107TBM23_STUDY_ID), A108TBM23_USER_ID, A109TBM23_STYDY_AUTH_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM23_STUDY_STAFF") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound17 == 0 )
                     {
                        initAll0I17( ) ;
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
                     resetCaption0I0( ) ;
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
      sMode17 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0I17( ) ;
      Gx_mode = sMode17 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0I17( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM23_STUDY_STAFF" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0I17( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0I17( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm23_study_staff");
         if ( AnyError == 0 )
         {
            confirmValues0I0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm23_study_staff");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0I17( )
   {
      /* Scan By routine */
      /* Using cursor T000I13 */
      pr_default.execute(11);
      RcdFound17 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A107TBM23_STUDY_ID = T000I13_A107TBM23_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
         A108TBM23_USER_ID = T000I13_A108TBM23_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
         A109TBM23_STYDY_AUTH_CD = T000I13_A109TBM23_STYDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0I17( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound17 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound17 = (short)(1) ;
         A107TBM23_STUDY_ID = T000I13_A107TBM23_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
         A108TBM23_USER_ID = T000I13_A108TBM23_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
         A109TBM23_STYDY_AUTH_CD = T000I13_A109TBM23_STYDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
      }
   }

   public void scanEnd0I17( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0I17( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0I17( )
   {
      /* Before Insert Rules */
      A386TBM23_CRT_DATETIME = GXutil.now( ) ;
      n386TBM23_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A386TBM23_CRT_DATETIME", localUtil.ttoc( A386TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A387TBM23_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm23_study_staff_impl.this.GXt_char1 = GXv_char2[0] ;
      A387TBM23_CRT_USER_ID = GXt_char1 ;
      n387TBM23_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A387TBM23_CRT_USER_ID", A387TBM23_CRT_USER_ID);
      A389TBM23_UPD_DATETIME = GXutil.now( ) ;
      n389TBM23_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A389TBM23_UPD_DATETIME", localUtil.ttoc( A389TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A390TBM23_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm23_study_staff_impl.this.GXt_char1 = GXv_char2[0] ;
      A390TBM23_UPD_USER_ID = GXt_char1 ;
      n390TBM23_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A390TBM23_UPD_USER_ID", A390TBM23_UPD_USER_ID);
      A392TBM23_UPD_CNT = (long)(O392TBM23_UPD_CNT+1) ;
      n392TBM23_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A392TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0I17( )
   {
      /* Before Update Rules */
      A389TBM23_UPD_DATETIME = GXutil.now( ) ;
      n389TBM23_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A389TBM23_UPD_DATETIME", localUtil.ttoc( A389TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A390TBM23_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm23_study_staff_impl.this.GXt_char1 = GXv_char2[0] ;
      A390TBM23_UPD_USER_ID = GXt_char1 ;
      n390TBM23_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A390TBM23_UPD_USER_ID", A390TBM23_UPD_USER_ID);
      A392TBM23_UPD_CNT = (long)(O392TBM23_UPD_CNT+1) ;
      n392TBM23_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A392TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0I17( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0I17( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0I17( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0I17( )
   {
      edtTBM23_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_STUDY_ID_Enabled, 5, 0)));
      edtTBM23_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_USER_ID_Enabled, 5, 0)));
      edtTBM23_STYDY_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_STYDY_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_STYDY_AUTH_CD_Enabled, 5, 0)));
      edtTBM23_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_DEL_FLG_Enabled, 5, 0)));
      edtTBM23_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM23_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM23_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM23_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM23_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM23_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM23_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM23_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM23_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0I0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "試験参加スタッフマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317142824");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm23_study_staff") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0I17( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z107TBM23_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z107TBM23_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z108TBM23_USER_ID", GXutil.rtrim( Z108TBM23_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z109TBM23_STYDY_AUTH_CD", GXutil.rtrim( Z109TBM23_STYDY_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z386TBM23_CRT_DATETIME", localUtil.ttoc( Z386TBM23_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z387TBM23_CRT_USER_ID", GXutil.rtrim( Z387TBM23_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z389TBM23_UPD_DATETIME", localUtil.ttoc( Z389TBM23_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z390TBM23_UPD_USER_ID", GXutil.rtrim( Z390TBM23_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z392TBM23_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z392TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z385TBM23_DEL_FLG", GXutil.rtrim( Z385TBM23_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z388TBM23_CRT_PROG_NM", GXutil.rtrim( Z388TBM23_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z391TBM23_UPD_PROG_NM", GXutil.rtrim( Z391TBM23_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O392TBM23_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O392TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM23_STUDY_STAFF" ;
   }

   public String getPgmdesc( )
   {
      return "試験参加スタッフマスタ" ;
   }

   public void initializeNonKey0I17( )
   {
      A386TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n386TBM23_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A386TBM23_CRT_DATETIME", localUtil.ttoc( A386TBM23_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n386TBM23_CRT_DATETIME = (GXutil.nullDate().equals(A386TBM23_CRT_DATETIME) ? true : false) ;
      A387TBM23_CRT_USER_ID = "" ;
      n387TBM23_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A387TBM23_CRT_USER_ID", A387TBM23_CRT_USER_ID);
      n387TBM23_CRT_USER_ID = ((GXutil.strcmp("", A387TBM23_CRT_USER_ID)==0) ? true : false) ;
      A389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n389TBM23_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A389TBM23_UPD_DATETIME", localUtil.ttoc( A389TBM23_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n389TBM23_UPD_DATETIME = (GXutil.nullDate().equals(A389TBM23_UPD_DATETIME) ? true : false) ;
      A390TBM23_UPD_USER_ID = "" ;
      n390TBM23_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A390TBM23_UPD_USER_ID", A390TBM23_UPD_USER_ID);
      n390TBM23_UPD_USER_ID = ((GXutil.strcmp("", A390TBM23_UPD_USER_ID)==0) ? true : false) ;
      A392TBM23_UPD_CNT = 0 ;
      n392TBM23_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A392TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)));
      n392TBM23_UPD_CNT = ((0==A392TBM23_UPD_CNT) ? true : false) ;
      A385TBM23_DEL_FLG = "" ;
      n385TBM23_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A385TBM23_DEL_FLG", A385TBM23_DEL_FLG);
      n385TBM23_DEL_FLG = ((GXutil.strcmp("", A385TBM23_DEL_FLG)==0) ? true : false) ;
      A388TBM23_CRT_PROG_NM = "" ;
      n388TBM23_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A388TBM23_CRT_PROG_NM", A388TBM23_CRT_PROG_NM);
      n388TBM23_CRT_PROG_NM = ((GXutil.strcmp("", A388TBM23_CRT_PROG_NM)==0) ? true : false) ;
      A391TBM23_UPD_PROG_NM = "" ;
      n391TBM23_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A391TBM23_UPD_PROG_NM", A391TBM23_UPD_PROG_NM);
      n391TBM23_UPD_PROG_NM = ((GXutil.strcmp("", A391TBM23_UPD_PROG_NM)==0) ? true : false) ;
      O392TBM23_UPD_CNT = A392TBM23_UPD_CNT ;
      n392TBM23_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A392TBM23_UPD_CNT", GXutil.ltrim( GXutil.str( A392TBM23_UPD_CNT, 10, 0)));
   }

   public void initAll0I17( )
   {
      A107TBM23_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A107TBM23_STUDY_ID", GXutil.ltrim( GXutil.str( A107TBM23_STUDY_ID, 10, 0)));
      A108TBM23_USER_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A108TBM23_USER_ID", A108TBM23_USER_ID);
      A109TBM23_STYDY_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A109TBM23_STYDY_AUTH_CD", A109TBM23_STYDY_AUTH_CD);
      initializeNonKey0I17( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317142830");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm23_study_staff.js", "?20177317142832");
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
      lblTextblocktbm23_study_id_Internalname = "TEXTBLOCKTBM23_STUDY_ID" ;
      edtTBM23_STUDY_ID_Internalname = "TBM23_STUDY_ID" ;
      lblTextblocktbm23_user_id_Internalname = "TEXTBLOCKTBM23_USER_ID" ;
      edtTBM23_USER_ID_Internalname = "TBM23_USER_ID" ;
      lblTextblocktbm23_stydy_auth_cd_Internalname = "TEXTBLOCKTBM23_STYDY_AUTH_CD" ;
      edtTBM23_STYDY_AUTH_CD_Internalname = "TBM23_STYDY_AUTH_CD" ;
      lblTextblocktbm23_del_flg_Internalname = "TEXTBLOCKTBM23_DEL_FLG" ;
      edtTBM23_DEL_FLG_Internalname = "TBM23_DEL_FLG" ;
      lblTextblocktbm23_crt_datetime_Internalname = "TEXTBLOCKTBM23_CRT_DATETIME" ;
      edtTBM23_CRT_DATETIME_Internalname = "TBM23_CRT_DATETIME" ;
      lblTextblocktbm23_crt_user_id_Internalname = "TEXTBLOCKTBM23_CRT_USER_ID" ;
      edtTBM23_CRT_USER_ID_Internalname = "TBM23_CRT_USER_ID" ;
      lblTextblocktbm23_crt_prog_nm_Internalname = "TEXTBLOCKTBM23_CRT_PROG_NM" ;
      edtTBM23_CRT_PROG_NM_Internalname = "TBM23_CRT_PROG_NM" ;
      lblTextblocktbm23_upd_datetime_Internalname = "TEXTBLOCKTBM23_UPD_DATETIME" ;
      edtTBM23_UPD_DATETIME_Internalname = "TBM23_UPD_DATETIME" ;
      lblTextblocktbm23_upd_user_id_Internalname = "TEXTBLOCKTBM23_UPD_USER_ID" ;
      edtTBM23_UPD_USER_ID_Internalname = "TBM23_UPD_USER_ID" ;
      lblTextblocktbm23_upd_prog_nm_Internalname = "TEXTBLOCKTBM23_UPD_PROG_NM" ;
      edtTBM23_UPD_PROG_NM_Internalname = "TBM23_UPD_PROG_NM" ;
      lblTextblocktbm23_upd_cnt_Internalname = "TEXTBLOCKTBM23_UPD_CNT" ;
      edtTBM23_UPD_CNT_Internalname = "TBM23_UPD_CNT" ;
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
      edtTBM23_UPD_CNT_Jsonclick = "" ;
      edtTBM23_UPD_CNT_Enabled = 1 ;
      edtTBM23_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM23_UPD_PROG_NM_Enabled = 1 ;
      edtTBM23_UPD_USER_ID_Jsonclick = "" ;
      edtTBM23_UPD_USER_ID_Enabled = 1 ;
      edtTBM23_UPD_DATETIME_Jsonclick = "" ;
      edtTBM23_UPD_DATETIME_Enabled = 1 ;
      edtTBM23_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM23_CRT_PROG_NM_Enabled = 1 ;
      edtTBM23_CRT_USER_ID_Jsonclick = "" ;
      edtTBM23_CRT_USER_ID_Enabled = 1 ;
      edtTBM23_CRT_DATETIME_Jsonclick = "" ;
      edtTBM23_CRT_DATETIME_Enabled = 1 ;
      edtTBM23_DEL_FLG_Jsonclick = "" ;
      edtTBM23_DEL_FLG_Enabled = 1 ;
      edtTBM23_STYDY_AUTH_CD_Jsonclick = "" ;
      edtTBM23_STYDY_AUTH_CD_Enabled = 1 ;
      edtTBM23_USER_ID_Jsonclick = "" ;
      edtTBM23_USER_ID_Enabled = 1 ;
      edtTBM23_STUDY_ID_Jsonclick = "" ;
      edtTBM23_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm23_crt_user_id0I17( String Gx_mode )
   {
      GXt_char1 = A387TBM23_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm23_study_staff_impl.this.GXt_char1 = GXv_char2[0] ;
      A387TBM23_CRT_USER_ID = GXt_char1 ;
      n387TBM23_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A387TBM23_CRT_USER_ID", A387TBM23_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A387TBM23_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm23_upd_user_id0I17( String Gx_mode )
   {
      GXt_char1 = A390TBM23_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm23_study_staff_impl.this.GXt_char1 = GXv_char2[0] ;
      A390TBM23_UPD_USER_ID = GXt_char1 ;
      n390TBM23_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A390TBM23_UPD_USER_ID", A390TBM23_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A390TBM23_UPD_USER_ID))+"\"");
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
      /* Using cursor T000I14 */
      pr_default.execute(12, new Object[] {new Long(A107TBM23_STUDY_ID)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
      /* Using cursor T000I15 */
      pr_default.execute(13, new Object[] {A108TBM23_USER_ID});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_USER_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_USER_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(13);
      GX_FocusControl = edtTBM23_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm23_study_id( long GX_Parm1 )
   {
      A107TBM23_STUDY_ID = GX_Parm1 ;
      /* Using cursor T000I14 */
      pr_default.execute(12, new Object[] {new Long(A107TBM23_STUDY_ID)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_STUDY_ID_Internalname ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbm23_user_id( String GX_Parm1 )
   {
      A108TBM23_USER_ID = GX_Parm1 ;
      /* Using cursor T000I15 */
      pr_default.execute(13, new Object[] {A108TBM23_USER_ID});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("'試験参加スタッフマスタ・ユーザーサブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM23_USER_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM23_USER_ID_Internalname ;
      }
      pr_default.close(13);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbm23_stydy_auth_cd( long GX_Parm1 ,
                                          String GX_Parm2 ,
                                          String GX_Parm3 ,
                                          java.util.Date GX_Parm4 ,
                                          String GX_Parm5 ,
                                          java.util.Date GX_Parm6 ,
                                          String GX_Parm7 ,
                                          long GX_Parm8 ,
                                          String GX_Parm9 ,
                                          String GX_Parm10 ,
                                          String GX_Parm11 )
   {
      A107TBM23_STUDY_ID = GX_Parm1 ;
      A108TBM23_USER_ID = GX_Parm2 ;
      A109TBM23_STYDY_AUTH_CD = GX_Parm3 ;
      A386TBM23_CRT_DATETIME = GX_Parm4 ;
      n386TBM23_CRT_DATETIME = false ;
      A387TBM23_CRT_USER_ID = GX_Parm5 ;
      n387TBM23_CRT_USER_ID = false ;
      A389TBM23_UPD_DATETIME = GX_Parm6 ;
      n389TBM23_UPD_DATETIME = false ;
      A390TBM23_UPD_USER_ID = GX_Parm7 ;
      n390TBM23_UPD_USER_ID = false ;
      A392TBM23_UPD_CNT = GX_Parm8 ;
      n392TBM23_UPD_CNT = false ;
      A385TBM23_DEL_FLG = GX_Parm9 ;
      n385TBM23_DEL_FLG = false ;
      A388TBM23_CRT_PROG_NM = GX_Parm10 ;
      n388TBM23_CRT_PROG_NM = false ;
      A391TBM23_UPD_PROG_NM = GX_Parm11 ;
      n391TBM23_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A386TBM23_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A387TBM23_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A389TBM23_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A390TBM23_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A392TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A385TBM23_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A388TBM23_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A391TBM23_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z107TBM23_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z108TBM23_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z109TBM23_STYDY_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z386TBM23_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z387TBM23_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z389TBM23_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z390TBM23_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z392TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z385TBM23_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z388TBM23_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z391TBM23_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O392TBM23_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      pr_default.close(12);
      pr_default.close(13);
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
      Z108TBM23_USER_ID = "" ;
      Z109TBM23_STYDY_AUTH_CD = "" ;
      Z386TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z387TBM23_CRT_USER_ID = "" ;
      Z389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z390TBM23_UPD_USER_ID = "" ;
      Z385TBM23_DEL_FLG = "" ;
      Z388TBM23_CRT_PROG_NM = "" ;
      Z391TBM23_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A108TBM23_USER_ID = "" ;
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
      lblTextblocktbm23_study_id_Jsonclick = "" ;
      lblTextblocktbm23_user_id_Jsonclick = "" ;
      lblTextblocktbm23_stydy_auth_cd_Jsonclick = "" ;
      A109TBM23_STYDY_AUTH_CD = "" ;
      lblTextblocktbm23_del_flg_Jsonclick = "" ;
      A385TBM23_DEL_FLG = "" ;
      lblTextblocktbm23_crt_datetime_Jsonclick = "" ;
      A386TBM23_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm23_crt_user_id_Jsonclick = "" ;
      A387TBM23_CRT_USER_ID = "" ;
      lblTextblocktbm23_crt_prog_nm_Jsonclick = "" ;
      A388TBM23_CRT_PROG_NM = "" ;
      lblTextblocktbm23_upd_datetime_Jsonclick = "" ;
      A389TBM23_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm23_upd_user_id_Jsonclick = "" ;
      A390TBM23_UPD_USER_ID = "" ;
      lblTextblocktbm23_upd_prog_nm_Jsonclick = "" ;
      A391TBM23_UPD_PROG_NM = "" ;
      lblTextblocktbm23_upd_cnt_Jsonclick = "" ;
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
      T000I6_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I6_A386TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I6_n386TBM23_CRT_DATETIME = new boolean[] {false} ;
      T000I6_A387TBM23_CRT_USER_ID = new String[] {""} ;
      T000I6_n387TBM23_CRT_USER_ID = new boolean[] {false} ;
      T000I6_A389TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I6_n389TBM23_UPD_DATETIME = new boolean[] {false} ;
      T000I6_A390TBM23_UPD_USER_ID = new String[] {""} ;
      T000I6_n390TBM23_UPD_USER_ID = new boolean[] {false} ;
      T000I6_A392TBM23_UPD_CNT = new long[1] ;
      T000I6_n392TBM23_UPD_CNT = new boolean[] {false} ;
      T000I6_A385TBM23_DEL_FLG = new String[] {""} ;
      T000I6_n385TBM23_DEL_FLG = new boolean[] {false} ;
      T000I6_A388TBM23_CRT_PROG_NM = new String[] {""} ;
      T000I6_n388TBM23_CRT_PROG_NM = new boolean[] {false} ;
      T000I6_A391TBM23_UPD_PROG_NM = new String[] {""} ;
      T000I6_n391TBM23_UPD_PROG_NM = new boolean[] {false} ;
      T000I6_A107TBM23_STUDY_ID = new long[1] ;
      T000I6_A108TBM23_USER_ID = new String[] {""} ;
      T000I4_A107TBM23_STUDY_ID = new long[1] ;
      T000I5_A108TBM23_USER_ID = new String[] {""} ;
      T000I7_A107TBM23_STUDY_ID = new long[1] ;
      T000I7_A108TBM23_USER_ID = new String[] {""} ;
      T000I7_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I3_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I3_A386TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I3_n386TBM23_CRT_DATETIME = new boolean[] {false} ;
      T000I3_A387TBM23_CRT_USER_ID = new String[] {""} ;
      T000I3_n387TBM23_CRT_USER_ID = new boolean[] {false} ;
      T000I3_A389TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I3_n389TBM23_UPD_DATETIME = new boolean[] {false} ;
      T000I3_A390TBM23_UPD_USER_ID = new String[] {""} ;
      T000I3_n390TBM23_UPD_USER_ID = new boolean[] {false} ;
      T000I3_A392TBM23_UPD_CNT = new long[1] ;
      T000I3_n392TBM23_UPD_CNT = new boolean[] {false} ;
      T000I3_A385TBM23_DEL_FLG = new String[] {""} ;
      T000I3_n385TBM23_DEL_FLG = new boolean[] {false} ;
      T000I3_A388TBM23_CRT_PROG_NM = new String[] {""} ;
      T000I3_n388TBM23_CRT_PROG_NM = new boolean[] {false} ;
      T000I3_A391TBM23_UPD_PROG_NM = new String[] {""} ;
      T000I3_n391TBM23_UPD_PROG_NM = new boolean[] {false} ;
      T000I3_A107TBM23_STUDY_ID = new long[1] ;
      T000I3_A108TBM23_USER_ID = new String[] {""} ;
      sMode17 = "" ;
      T000I8_A107TBM23_STUDY_ID = new long[1] ;
      T000I8_A108TBM23_USER_ID = new String[] {""} ;
      T000I8_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I9_A107TBM23_STUDY_ID = new long[1] ;
      T000I9_A108TBM23_USER_ID = new String[] {""} ;
      T000I9_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I2_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000I2_A386TBM23_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I2_n386TBM23_CRT_DATETIME = new boolean[] {false} ;
      T000I2_A387TBM23_CRT_USER_ID = new String[] {""} ;
      T000I2_n387TBM23_CRT_USER_ID = new boolean[] {false} ;
      T000I2_A389TBM23_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000I2_n389TBM23_UPD_DATETIME = new boolean[] {false} ;
      T000I2_A390TBM23_UPD_USER_ID = new String[] {""} ;
      T000I2_n390TBM23_UPD_USER_ID = new boolean[] {false} ;
      T000I2_A392TBM23_UPD_CNT = new long[1] ;
      T000I2_n392TBM23_UPD_CNT = new boolean[] {false} ;
      T000I2_A385TBM23_DEL_FLG = new String[] {""} ;
      T000I2_n385TBM23_DEL_FLG = new boolean[] {false} ;
      T000I2_A388TBM23_CRT_PROG_NM = new String[] {""} ;
      T000I2_n388TBM23_CRT_PROG_NM = new boolean[] {false} ;
      T000I2_A391TBM23_UPD_PROG_NM = new String[] {""} ;
      T000I2_n391TBM23_UPD_PROG_NM = new boolean[] {false} ;
      T000I2_A107TBM23_STUDY_ID = new long[1] ;
      T000I2_A108TBM23_USER_ID = new String[] {""} ;
      T000I13_A107TBM23_STUDY_ID = new long[1] ;
      T000I13_A108TBM23_USER_ID = new String[] {""} ;
      T000I13_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      T000I14_A107TBM23_STUDY_ID = new long[1] ;
      T000I15_A108TBM23_USER_ID = new String[] {""} ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm23_study_staff__default(),
         new Object[] {
             new Object[] {
            T000I2_A109TBM23_STYDY_AUTH_CD, T000I2_A386TBM23_CRT_DATETIME, T000I2_n386TBM23_CRT_DATETIME, T000I2_A387TBM23_CRT_USER_ID, T000I2_n387TBM23_CRT_USER_ID, T000I2_A389TBM23_UPD_DATETIME, T000I2_n389TBM23_UPD_DATETIME, T000I2_A390TBM23_UPD_USER_ID, T000I2_n390TBM23_UPD_USER_ID, T000I2_A392TBM23_UPD_CNT,
            T000I2_n392TBM23_UPD_CNT, T000I2_A385TBM23_DEL_FLG, T000I2_n385TBM23_DEL_FLG, T000I2_A388TBM23_CRT_PROG_NM, T000I2_n388TBM23_CRT_PROG_NM, T000I2_A391TBM23_UPD_PROG_NM, T000I2_n391TBM23_UPD_PROG_NM, T000I2_A107TBM23_STUDY_ID, T000I2_A108TBM23_USER_ID
            }
            , new Object[] {
            T000I3_A109TBM23_STYDY_AUTH_CD, T000I3_A386TBM23_CRT_DATETIME, T000I3_n386TBM23_CRT_DATETIME, T000I3_A387TBM23_CRT_USER_ID, T000I3_n387TBM23_CRT_USER_ID, T000I3_A389TBM23_UPD_DATETIME, T000I3_n389TBM23_UPD_DATETIME, T000I3_A390TBM23_UPD_USER_ID, T000I3_n390TBM23_UPD_USER_ID, T000I3_A392TBM23_UPD_CNT,
            T000I3_n392TBM23_UPD_CNT, T000I3_A385TBM23_DEL_FLG, T000I3_n385TBM23_DEL_FLG, T000I3_A388TBM23_CRT_PROG_NM, T000I3_n388TBM23_CRT_PROG_NM, T000I3_A391TBM23_UPD_PROG_NM, T000I3_n391TBM23_UPD_PROG_NM, T000I3_A107TBM23_STUDY_ID, T000I3_A108TBM23_USER_ID
            }
            , new Object[] {
            T000I4_A107TBM23_STUDY_ID
            }
            , new Object[] {
            T000I5_A108TBM23_USER_ID
            }
            , new Object[] {
            T000I6_A109TBM23_STYDY_AUTH_CD, T000I6_A386TBM23_CRT_DATETIME, T000I6_n386TBM23_CRT_DATETIME, T000I6_A387TBM23_CRT_USER_ID, T000I6_n387TBM23_CRT_USER_ID, T000I6_A389TBM23_UPD_DATETIME, T000I6_n389TBM23_UPD_DATETIME, T000I6_A390TBM23_UPD_USER_ID, T000I6_n390TBM23_UPD_USER_ID, T000I6_A392TBM23_UPD_CNT,
            T000I6_n392TBM23_UPD_CNT, T000I6_A385TBM23_DEL_FLG, T000I6_n385TBM23_DEL_FLG, T000I6_A388TBM23_CRT_PROG_NM, T000I6_n388TBM23_CRT_PROG_NM, T000I6_A391TBM23_UPD_PROG_NM, T000I6_n391TBM23_UPD_PROG_NM, T000I6_A107TBM23_STUDY_ID, T000I6_A108TBM23_USER_ID
            }
            , new Object[] {
            T000I7_A107TBM23_STUDY_ID, T000I7_A108TBM23_USER_ID, T000I7_A109TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            T000I8_A107TBM23_STUDY_ID, T000I8_A108TBM23_USER_ID, T000I8_A109TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            T000I9_A107TBM23_STUDY_ID, T000I9_A108TBM23_USER_ID, T000I9_A109TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000I13_A107TBM23_STUDY_ID, T000I13_A108TBM23_USER_ID, T000I13_A109TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            T000I14_A107TBM23_STUDY_ID
            }
            , new Object[] {
            T000I15_A108TBM23_USER_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM23_STUDY_STAFF" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound17 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM23_STUDY_ID_Enabled ;
   private int edtTBM23_USER_ID_Enabled ;
   private int edtTBM23_STYDY_AUTH_CD_Enabled ;
   private int edtTBM23_DEL_FLG_Enabled ;
   private int edtTBM23_CRT_DATETIME_Enabled ;
   private int edtTBM23_CRT_USER_ID_Enabled ;
   private int edtTBM23_CRT_PROG_NM_Enabled ;
   private int edtTBM23_UPD_DATETIME_Enabled ;
   private int edtTBM23_UPD_USER_ID_Enabled ;
   private int edtTBM23_UPD_PROG_NM_Enabled ;
   private int edtTBM23_UPD_CNT_Enabled ;
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
   private long Z107TBM23_STUDY_ID ;
   private long Z392TBM23_UPD_CNT ;
   private long O392TBM23_UPD_CNT ;
   private long A107TBM23_STUDY_ID ;
   private long A392TBM23_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM23_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm23_study_id_Internalname ;
   private String lblTextblocktbm23_study_id_Jsonclick ;
   private String edtTBM23_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm23_user_id_Internalname ;
   private String lblTextblocktbm23_user_id_Jsonclick ;
   private String edtTBM23_USER_ID_Internalname ;
   private String edtTBM23_USER_ID_Jsonclick ;
   private String lblTextblocktbm23_stydy_auth_cd_Internalname ;
   private String lblTextblocktbm23_stydy_auth_cd_Jsonclick ;
   private String edtTBM23_STYDY_AUTH_CD_Internalname ;
   private String edtTBM23_STYDY_AUTH_CD_Jsonclick ;
   private String lblTextblocktbm23_del_flg_Internalname ;
   private String lblTextblocktbm23_del_flg_Jsonclick ;
   private String edtTBM23_DEL_FLG_Internalname ;
   private String edtTBM23_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm23_crt_datetime_Internalname ;
   private String lblTextblocktbm23_crt_datetime_Jsonclick ;
   private String edtTBM23_CRT_DATETIME_Internalname ;
   private String edtTBM23_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm23_crt_user_id_Internalname ;
   private String lblTextblocktbm23_crt_user_id_Jsonclick ;
   private String edtTBM23_CRT_USER_ID_Internalname ;
   private String edtTBM23_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm23_crt_prog_nm_Internalname ;
   private String lblTextblocktbm23_crt_prog_nm_Jsonclick ;
   private String edtTBM23_CRT_PROG_NM_Internalname ;
   private String edtTBM23_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm23_upd_datetime_Internalname ;
   private String lblTextblocktbm23_upd_datetime_Jsonclick ;
   private String edtTBM23_UPD_DATETIME_Internalname ;
   private String edtTBM23_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm23_upd_user_id_Internalname ;
   private String lblTextblocktbm23_upd_user_id_Jsonclick ;
   private String edtTBM23_UPD_USER_ID_Internalname ;
   private String edtTBM23_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm23_upd_prog_nm_Internalname ;
   private String lblTextblocktbm23_upd_prog_nm_Jsonclick ;
   private String edtTBM23_UPD_PROG_NM_Internalname ;
   private String edtTBM23_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm23_upd_cnt_Internalname ;
   private String lblTextblocktbm23_upd_cnt_Jsonclick ;
   private String edtTBM23_UPD_CNT_Internalname ;
   private String edtTBM23_UPD_CNT_Jsonclick ;
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
   private String sMode17 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z386TBM23_CRT_DATETIME ;
   private java.util.Date Z389TBM23_UPD_DATETIME ;
   private java.util.Date A386TBM23_CRT_DATETIME ;
   private java.util.Date A389TBM23_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n385TBM23_DEL_FLG ;
   private boolean n386TBM23_CRT_DATETIME ;
   private boolean n387TBM23_CRT_USER_ID ;
   private boolean n388TBM23_CRT_PROG_NM ;
   private boolean n389TBM23_UPD_DATETIME ;
   private boolean n390TBM23_UPD_USER_ID ;
   private boolean n391TBM23_UPD_PROG_NM ;
   private boolean n392TBM23_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z108TBM23_USER_ID ;
   private String Z109TBM23_STYDY_AUTH_CD ;
   private String Z387TBM23_CRT_USER_ID ;
   private String Z390TBM23_UPD_USER_ID ;
   private String Z385TBM23_DEL_FLG ;
   private String Z388TBM23_CRT_PROG_NM ;
   private String Z391TBM23_UPD_PROG_NM ;
   private String A108TBM23_USER_ID ;
   private String A109TBM23_STYDY_AUTH_CD ;
   private String A385TBM23_DEL_FLG ;
   private String A387TBM23_CRT_USER_ID ;
   private String A388TBM23_CRT_PROG_NM ;
   private String A390TBM23_UPD_USER_ID ;
   private String A391TBM23_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000I6_A109TBM23_STYDY_AUTH_CD ;
   private java.util.Date[] T000I6_A386TBM23_CRT_DATETIME ;
   private boolean[] T000I6_n386TBM23_CRT_DATETIME ;
   private String[] T000I6_A387TBM23_CRT_USER_ID ;
   private boolean[] T000I6_n387TBM23_CRT_USER_ID ;
   private java.util.Date[] T000I6_A389TBM23_UPD_DATETIME ;
   private boolean[] T000I6_n389TBM23_UPD_DATETIME ;
   private String[] T000I6_A390TBM23_UPD_USER_ID ;
   private boolean[] T000I6_n390TBM23_UPD_USER_ID ;
   private long[] T000I6_A392TBM23_UPD_CNT ;
   private boolean[] T000I6_n392TBM23_UPD_CNT ;
   private String[] T000I6_A385TBM23_DEL_FLG ;
   private boolean[] T000I6_n385TBM23_DEL_FLG ;
   private String[] T000I6_A388TBM23_CRT_PROG_NM ;
   private boolean[] T000I6_n388TBM23_CRT_PROG_NM ;
   private String[] T000I6_A391TBM23_UPD_PROG_NM ;
   private boolean[] T000I6_n391TBM23_UPD_PROG_NM ;
   private long[] T000I6_A107TBM23_STUDY_ID ;
   private String[] T000I6_A108TBM23_USER_ID ;
   private long[] T000I4_A107TBM23_STUDY_ID ;
   private String[] T000I5_A108TBM23_USER_ID ;
   private long[] T000I7_A107TBM23_STUDY_ID ;
   private String[] T000I7_A108TBM23_USER_ID ;
   private String[] T000I7_A109TBM23_STYDY_AUTH_CD ;
   private String[] T000I3_A109TBM23_STYDY_AUTH_CD ;
   private java.util.Date[] T000I3_A386TBM23_CRT_DATETIME ;
   private boolean[] T000I3_n386TBM23_CRT_DATETIME ;
   private String[] T000I3_A387TBM23_CRT_USER_ID ;
   private boolean[] T000I3_n387TBM23_CRT_USER_ID ;
   private java.util.Date[] T000I3_A389TBM23_UPD_DATETIME ;
   private boolean[] T000I3_n389TBM23_UPD_DATETIME ;
   private String[] T000I3_A390TBM23_UPD_USER_ID ;
   private boolean[] T000I3_n390TBM23_UPD_USER_ID ;
   private long[] T000I3_A392TBM23_UPD_CNT ;
   private boolean[] T000I3_n392TBM23_UPD_CNT ;
   private String[] T000I3_A385TBM23_DEL_FLG ;
   private boolean[] T000I3_n385TBM23_DEL_FLG ;
   private String[] T000I3_A388TBM23_CRT_PROG_NM ;
   private boolean[] T000I3_n388TBM23_CRT_PROG_NM ;
   private String[] T000I3_A391TBM23_UPD_PROG_NM ;
   private boolean[] T000I3_n391TBM23_UPD_PROG_NM ;
   private long[] T000I3_A107TBM23_STUDY_ID ;
   private String[] T000I3_A108TBM23_USER_ID ;
   private long[] T000I8_A107TBM23_STUDY_ID ;
   private String[] T000I8_A108TBM23_USER_ID ;
   private String[] T000I8_A109TBM23_STYDY_AUTH_CD ;
   private long[] T000I9_A107TBM23_STUDY_ID ;
   private String[] T000I9_A108TBM23_USER_ID ;
   private String[] T000I9_A109TBM23_STYDY_AUTH_CD ;
   private String[] T000I2_A109TBM23_STYDY_AUTH_CD ;
   private java.util.Date[] T000I2_A386TBM23_CRT_DATETIME ;
   private boolean[] T000I2_n386TBM23_CRT_DATETIME ;
   private String[] T000I2_A387TBM23_CRT_USER_ID ;
   private boolean[] T000I2_n387TBM23_CRT_USER_ID ;
   private java.util.Date[] T000I2_A389TBM23_UPD_DATETIME ;
   private boolean[] T000I2_n389TBM23_UPD_DATETIME ;
   private String[] T000I2_A390TBM23_UPD_USER_ID ;
   private boolean[] T000I2_n390TBM23_UPD_USER_ID ;
   private long[] T000I2_A392TBM23_UPD_CNT ;
   private boolean[] T000I2_n392TBM23_UPD_CNT ;
   private String[] T000I2_A385TBM23_DEL_FLG ;
   private boolean[] T000I2_n385TBM23_DEL_FLG ;
   private String[] T000I2_A388TBM23_CRT_PROG_NM ;
   private boolean[] T000I2_n388TBM23_CRT_PROG_NM ;
   private String[] T000I2_A391TBM23_UPD_PROG_NM ;
   private boolean[] T000I2_n391TBM23_UPD_PROG_NM ;
   private long[] T000I2_A107TBM23_STUDY_ID ;
   private String[] T000I2_A108TBM23_USER_ID ;
   private long[] T000I13_A107TBM23_STUDY_ID ;
   private String[] T000I13_A108TBM23_USER_ID ;
   private String[] T000I13_A109TBM23_STYDY_AUTH_CD ;
   private long[] T000I14_A107TBM23_STUDY_ID ;
   private String[] T000I15_A108TBM23_USER_ID ;
}

final  class tbm23_study_staff__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000I2", "SELECT `TBM23_STYDY_AUTH_CD`, `TBM23_CRT_DATETIME`, `TBM23_CRT_USER_ID`, `TBM23_UPD_DATETIME`, `TBM23_UPD_USER_ID`, `TBM23_UPD_CNT`, `TBM23_DEL_FLG`, `TBM23_CRT_PROG_NM`, `TBM23_UPD_PROG_NM`, `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I3", "SELECT `TBM23_STYDY_AUTH_CD`, `TBM23_CRT_DATETIME`, `TBM23_CRT_USER_ID`, `TBM23_UPD_DATETIME`, `TBM23_UPD_USER_ID`, `TBM23_UPD_CNT`, `TBM23_DEL_FLG`, `TBM23_CRT_PROG_NM`, `TBM23_UPD_PROG_NM`, `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I4", "SELECT `TBM21_STUDY_ID` AS TBM23_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I5", "SELECT `TAM07_USER_ID` AS TBM23_USER_ID FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I6", "SELECT TM1.`TBM23_STYDY_AUTH_CD`, TM1.`TBM23_CRT_DATETIME`, TM1.`TBM23_CRT_USER_ID`, TM1.`TBM23_UPD_DATETIME`, TM1.`TBM23_UPD_USER_ID`, TM1.`TBM23_UPD_CNT`, TM1.`TBM23_DEL_FLG`, TM1.`TBM23_CRT_PROG_NM`, TM1.`TBM23_UPD_PROG_NM`, TM1.`TBM23_STUDY_ID` AS TBM23_STUDY_ID, TM1.`TBM23_USER_ID` AS TBM23_USER_ID FROM `TBM23_STUDY_STAFF` TM1 WHERE TM1.`TBM23_STUDY_ID` = ? and TM1.`TBM23_USER_ID` = ? and TM1.`TBM23_STYDY_AUTH_CD` = ? ORDER BY TM1.`TBM23_STUDY_ID`, TM1.`TBM23_USER_ID`, TM1.`TBM23_STYDY_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000I7", "SELECT `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I8", "SELECT `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE ( `TBM23_STUDY_ID` > ? or `TBM23_STUDY_ID` = ? and `TBM23_USER_ID` > ? or `TBM23_USER_ID` = ? and `TBM23_STUDY_ID` = ? and `TBM23_STYDY_AUTH_CD` > ?) ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000I9", "SELECT `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE ( `TBM23_STUDY_ID` < ? or `TBM23_STUDY_ID` = ? and `TBM23_USER_ID` < ? or `TBM23_USER_ID` = ? and `TBM23_STUDY_ID` = ? and `TBM23_STYDY_AUTH_CD` < ?) ORDER BY `TBM23_STUDY_ID` DESC, `TBM23_USER_ID` DESC, `TBM23_STYDY_AUTH_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000I10", "INSERT INTO `TBM23_STUDY_STAFF`(`TBM23_STYDY_AUTH_CD`, `TBM23_CRT_DATETIME`, `TBM23_CRT_USER_ID`, `TBM23_UPD_DATETIME`, `TBM23_UPD_USER_ID`, `TBM23_UPD_CNT`, `TBM23_DEL_FLG`, `TBM23_CRT_PROG_NM`, `TBM23_UPD_PROG_NM`, `TBM23_STUDY_ID`, `TBM23_USER_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000I11", "UPDATE `TBM23_STUDY_STAFF` SET `TBM23_CRT_DATETIME`=?, `TBM23_CRT_USER_ID`=?, `TBM23_UPD_DATETIME`=?, `TBM23_UPD_USER_ID`=?, `TBM23_UPD_CNT`=?, `TBM23_DEL_FLG`=?, `TBM23_CRT_PROG_NM`=?, `TBM23_UPD_PROG_NM`=?  WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000I12", "DELETE FROM `TBM23_STUDY_STAFF`  WHERE `TBM23_STUDY_ID` = ? AND `TBM23_USER_ID` = ? AND `TBM23_STYDY_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000I13", "SELECT `TBM23_STUDY_ID` AS TBM23_STUDY_ID, `TBM23_USER_ID` AS TBM23_USER_ID, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` ORDER BY `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000I14", "SELECT `TBM21_STUDY_ID` AS TBM23_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000I15", "SELECT `TAM07_USER_ID` AS TBM23_USER_ID FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((long[]) buf[17])[0] = rslt.getLong(10) ;
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 128, false);
               stmt.setVarchar(4, (String)parms[3], 128, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               return;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 128, false);
               stmt.setVarchar(4, (String)parms[3], 128, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 128);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 128);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[10]).longValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 40);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 40);
               }
               stmt.setLong(10, ((Number) parms[17]).longValue());
               stmt.setVarchar(11, (String)parms[18], 128, false);
               return;
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
               stmt.setVarchar(10, (String)parms[17], 128, false);
               stmt.setVarchar(11, (String)parms[18], 2, false);
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 128, false);
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
      }
   }

}

