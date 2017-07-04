/*
               File: tbm21_study_impl
        Description: 試験マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:19.10
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm21_study_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM21_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm21_crt_user_id0G15( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM21_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm21_upd_user_id0G15( Gx_mode) ;
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
         Form.getMeta().addItem("description", "試験マスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm21_study_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm21_study_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm21_study_impl.class ));
   }

   public tbm21_study_impl( int remoteHandle ,
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
         wb_table1_2_0G15( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0G15e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0G15( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0G15( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0G15( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0G15e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "試験マスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM21_STUDY.htm");
         wb_table3_28_0G15( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0G15e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0G15e( true) ;
      }
      else
      {
         wb_table1_2_0G15e( false) ;
      }
   }

   public void wb_table3_28_0G15( boolean wbgen )
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
         wb_table4_34_0G15( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0G15e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM21_STUDY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM21_STUDY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0G15e( true) ;
      }
      else
      {
         wb_table3_28_0G15e( false) ;
      }
   }

   public void wb_table4_34_0G15( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_study_id_Internalname, "試験ID", "", "", lblTextblocktbm21_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM21_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A63TBM21_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A63TBM21_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_study_nm_Internalname, "試験名", "", "", lblTextblocktbm21_study_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_STUDY_NM_Internalname, GXutil.rtrim( A367TBM21_STUDY_NM), GXutil.rtrim( localUtil.format( A367TBM21_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_STUDY_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_STUDY_NM_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_outer_study_id_Internalname, "外部試験ID", "", "", lblTextblocktbm21_outer_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_OUTER_STUDY_ID_Internalname, GXutil.rtrim( A530TBM21_OUTER_STUDY_ID), GXutil.rtrim( localUtil.format( A530TBM21_OUTER_STUDY_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_OUTER_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_OUTER_STUDY_ID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_proc_nm_Internalname, "プロトコール名", "", "", lblTextblocktbm21_proc_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_PROC_NM_Internalname, GXutil.rtrim( A531TBM21_PROC_NM), GXutil.rtrim( localUtil.format( A531TBM21_PROC_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_PROC_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_PROC_NM_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_note_Internalname, "備考", "", "", lblTextblocktbm21_note_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM21_NOTE_Internalname, GXutil.rtrim( A368TBM21_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", (short)(0), 1, edtTBM21_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_status_Internalname, "状態", "", "", lblTextblocktbm21_status_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_STATUS_Internalname, GXutil.rtrim( A607TBM21_STATUS), GXutil.rtrim( localUtil.format( A607TBM21_STATUS, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_STATUS_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_STATUS_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm21_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_DEL_FLG_Internalname, GXutil.rtrim( A369TBM21_DEL_FLG), GXutil.rtrim( localUtil.format( A369TBM21_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm21_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM21_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_CRT_DATETIME_Internalname, localUtil.format(A370TBM21_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A370TBM21_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM21_STUDY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM21_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM21_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm21_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_CRT_USER_ID_Internalname, GXutil.rtrim( A371TBM21_CRT_USER_ID), GXutil.rtrim( localUtil.format( A371TBM21_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm21_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_CRT_PROG_NM_Internalname, GXutil.rtrim( A372TBM21_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A372TBM21_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm21_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM21_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_UPD_DATETIME_Internalname, localUtil.format(A373TBM21_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A373TBM21_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM21_STUDY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM21_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM21_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm21_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_UPD_USER_ID_Internalname, GXutil.rtrim( A374TBM21_UPD_USER_ID), GXutil.rtrim( localUtil.format( A374TBM21_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm21_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_UPD_PROG_NM_Internalname, GXutil.rtrim( A375TBM21_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A375TBM21_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm21_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A376TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM21_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A376TBM21_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A376TBM21_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM21_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM21_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0G15e( true) ;
      }
      else
      {
         wb_table4_34_0G15e( false) ;
      }
   }

   public void wb_table2_5_0G15( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM21_STUDY.htm");
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
         wb_table2_5_0G15e( true) ;
      }
      else
      {
         wb_table2_5_0G15e( false) ;
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
      /* Execute user event: e110G2 */
      e110G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM21_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM21_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM21_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A63TBM21_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
            }
            else
            {
               A63TBM21_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM21_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
            }
            A367TBM21_STUDY_NM = httpContext.cgiGet( edtTBM21_STUDY_NM_Internalname) ;
            n367TBM21_STUDY_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
            n367TBM21_STUDY_NM = ((GXutil.strcmp("", A367TBM21_STUDY_NM)==0) ? true : false) ;
            A530TBM21_OUTER_STUDY_ID = httpContext.cgiGet( edtTBM21_OUTER_STUDY_ID_Internalname) ;
            n530TBM21_OUTER_STUDY_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A530TBM21_OUTER_STUDY_ID", A530TBM21_OUTER_STUDY_ID);
            n530TBM21_OUTER_STUDY_ID = ((GXutil.strcmp("", A530TBM21_OUTER_STUDY_ID)==0) ? true : false) ;
            A531TBM21_PROC_NM = httpContext.cgiGet( edtTBM21_PROC_NM_Internalname) ;
            n531TBM21_PROC_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A531TBM21_PROC_NM", A531TBM21_PROC_NM);
            n531TBM21_PROC_NM = ((GXutil.strcmp("", A531TBM21_PROC_NM)==0) ? true : false) ;
            A368TBM21_NOTE = httpContext.cgiGet( edtTBM21_NOTE_Internalname) ;
            n368TBM21_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A368TBM21_NOTE", A368TBM21_NOTE);
            n368TBM21_NOTE = ((GXutil.strcmp("", A368TBM21_NOTE)==0) ? true : false) ;
            A607TBM21_STATUS = httpContext.cgiGet( edtTBM21_STATUS_Internalname) ;
            n607TBM21_STATUS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
            n607TBM21_STATUS = ((GXutil.strcmp("", A607TBM21_STATUS)==0) ? true : false) ;
            A369TBM21_DEL_FLG = httpContext.cgiGet( edtTBM21_DEL_FLG_Internalname) ;
            n369TBM21_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
            n369TBM21_DEL_FLG = ((GXutil.strcmp("", A369TBM21_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM21_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM21_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM21_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A370TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n370TBM21_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A370TBM21_CRT_DATETIME", localUtil.ttoc( A370TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A370TBM21_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM21_CRT_DATETIME_Internalname)) ;
               n370TBM21_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A370TBM21_CRT_DATETIME", localUtil.ttoc( A370TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n370TBM21_CRT_DATETIME = (GXutil.nullDate().equals(A370TBM21_CRT_DATETIME) ? true : false) ;
            A371TBM21_CRT_USER_ID = httpContext.cgiGet( edtTBM21_CRT_USER_ID_Internalname) ;
            n371TBM21_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A371TBM21_CRT_USER_ID", A371TBM21_CRT_USER_ID);
            n371TBM21_CRT_USER_ID = ((GXutil.strcmp("", A371TBM21_CRT_USER_ID)==0) ? true : false) ;
            A372TBM21_CRT_PROG_NM = httpContext.cgiGet( edtTBM21_CRT_PROG_NM_Internalname) ;
            n372TBM21_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A372TBM21_CRT_PROG_NM", A372TBM21_CRT_PROG_NM);
            n372TBM21_CRT_PROG_NM = ((GXutil.strcmp("", A372TBM21_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM21_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM21_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM21_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A373TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n373TBM21_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A373TBM21_UPD_DATETIME", localUtil.ttoc( A373TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A373TBM21_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM21_UPD_DATETIME_Internalname)) ;
               n373TBM21_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A373TBM21_UPD_DATETIME", localUtil.ttoc( A373TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n373TBM21_UPD_DATETIME = (GXutil.nullDate().equals(A373TBM21_UPD_DATETIME) ? true : false) ;
            A374TBM21_UPD_USER_ID = httpContext.cgiGet( edtTBM21_UPD_USER_ID_Internalname) ;
            n374TBM21_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A374TBM21_UPD_USER_ID", A374TBM21_UPD_USER_ID);
            n374TBM21_UPD_USER_ID = ((GXutil.strcmp("", A374TBM21_UPD_USER_ID)==0) ? true : false) ;
            A375TBM21_UPD_PROG_NM = httpContext.cgiGet( edtTBM21_UPD_PROG_NM_Internalname) ;
            n375TBM21_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A375TBM21_UPD_PROG_NM", A375TBM21_UPD_PROG_NM);
            n375TBM21_UPD_PROG_NM = ((GXutil.strcmp("", A375TBM21_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM21_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM21_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM21_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM21_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A376TBM21_UPD_CNT = 0 ;
               n376TBM21_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A376TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)));
            }
            else
            {
               A376TBM21_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM21_UPD_CNT_Internalname), ".", ",") ;
               n376TBM21_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A376TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)));
            }
            n376TBM21_UPD_CNT = ((0==A376TBM21_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z63TBM21_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z63TBM21_STUDY_ID"), ".", ",") ;
            Z370TBM21_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z370TBM21_CRT_DATETIME"), 0) ;
            n370TBM21_CRT_DATETIME = (GXutil.nullDate().equals(A370TBM21_CRT_DATETIME) ? true : false) ;
            Z371TBM21_CRT_USER_ID = httpContext.cgiGet( "Z371TBM21_CRT_USER_ID") ;
            n371TBM21_CRT_USER_ID = ((GXutil.strcmp("", A371TBM21_CRT_USER_ID)==0) ? true : false) ;
            Z373TBM21_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z373TBM21_UPD_DATETIME"), 0) ;
            n373TBM21_UPD_DATETIME = (GXutil.nullDate().equals(A373TBM21_UPD_DATETIME) ? true : false) ;
            Z374TBM21_UPD_USER_ID = httpContext.cgiGet( "Z374TBM21_UPD_USER_ID") ;
            n374TBM21_UPD_USER_ID = ((GXutil.strcmp("", A374TBM21_UPD_USER_ID)==0) ? true : false) ;
            Z376TBM21_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z376TBM21_UPD_CNT"), ".", ",") ;
            n376TBM21_UPD_CNT = ((0==A376TBM21_UPD_CNT) ? true : false) ;
            Z367TBM21_STUDY_NM = httpContext.cgiGet( "Z367TBM21_STUDY_NM") ;
            n367TBM21_STUDY_NM = ((GXutil.strcmp("", A367TBM21_STUDY_NM)==0) ? true : false) ;
            Z530TBM21_OUTER_STUDY_ID = httpContext.cgiGet( "Z530TBM21_OUTER_STUDY_ID") ;
            n530TBM21_OUTER_STUDY_ID = ((GXutil.strcmp("", A530TBM21_OUTER_STUDY_ID)==0) ? true : false) ;
            Z531TBM21_PROC_NM = httpContext.cgiGet( "Z531TBM21_PROC_NM") ;
            n531TBM21_PROC_NM = ((GXutil.strcmp("", A531TBM21_PROC_NM)==0) ? true : false) ;
            Z368TBM21_NOTE = httpContext.cgiGet( "Z368TBM21_NOTE") ;
            n368TBM21_NOTE = ((GXutil.strcmp("", A368TBM21_NOTE)==0) ? true : false) ;
            Z607TBM21_STATUS = httpContext.cgiGet( "Z607TBM21_STATUS") ;
            n607TBM21_STATUS = ((GXutil.strcmp("", A607TBM21_STATUS)==0) ? true : false) ;
            Z369TBM21_DEL_FLG = httpContext.cgiGet( "Z369TBM21_DEL_FLG") ;
            n369TBM21_DEL_FLG = ((GXutil.strcmp("", A369TBM21_DEL_FLG)==0) ? true : false) ;
            Z372TBM21_CRT_PROG_NM = httpContext.cgiGet( "Z372TBM21_CRT_PROG_NM") ;
            n372TBM21_CRT_PROG_NM = ((GXutil.strcmp("", A372TBM21_CRT_PROG_NM)==0) ? true : false) ;
            Z375TBM21_UPD_PROG_NM = httpContext.cgiGet( "Z375TBM21_UPD_PROG_NM") ;
            n375TBM21_UPD_PROG_NM = ((GXutil.strcmp("", A375TBM21_UPD_PROG_NM)==0) ? true : false) ;
            O376TBM21_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O376TBM21_UPD_CNT"), ".", ",") ;
            n376TBM21_UPD_CNT = ((0==A376TBM21_UPD_CNT) ? true : false) ;
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
               A63TBM21_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
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
                     /* Execute user event: e110G2 */
                     e110G2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120G2 */
                     e120G2 ();
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
         /* Execute user event: e120G2 */
         e120G2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0G15( ) ;
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
      disableAttributes0G15( ) ;
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

   public void resetCaption0G0( )
   {
   }

   public void e110G2( )
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

   public void e120G2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A367TBM21_STUDY_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A530TBM21_OUTER_STUDY_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A531TBM21_PROC_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A368TBM21_NOTE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A369TBM21_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A370TBM21_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm21_study_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A370TBM21_CRT_DATETIME", localUtil.ttoc( A370TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A371TBM21_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A372TBM21_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A373TBM21_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm21_study_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A373TBM21_UPD_DATETIME", localUtil.ttoc( A373TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A374TBM21_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A375TBM21_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0G15( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z370TBM21_CRT_DATETIME = T000G3_A370TBM21_CRT_DATETIME[0] ;
            Z371TBM21_CRT_USER_ID = T000G3_A371TBM21_CRT_USER_ID[0] ;
            Z373TBM21_UPD_DATETIME = T000G3_A373TBM21_UPD_DATETIME[0] ;
            Z374TBM21_UPD_USER_ID = T000G3_A374TBM21_UPD_USER_ID[0] ;
            Z376TBM21_UPD_CNT = T000G3_A376TBM21_UPD_CNT[0] ;
            Z367TBM21_STUDY_NM = T000G3_A367TBM21_STUDY_NM[0] ;
            Z530TBM21_OUTER_STUDY_ID = T000G3_A530TBM21_OUTER_STUDY_ID[0] ;
            Z531TBM21_PROC_NM = T000G3_A531TBM21_PROC_NM[0] ;
            Z368TBM21_NOTE = T000G3_A368TBM21_NOTE[0] ;
            Z607TBM21_STATUS = T000G3_A607TBM21_STATUS[0] ;
            Z369TBM21_DEL_FLG = T000G3_A369TBM21_DEL_FLG[0] ;
            Z372TBM21_CRT_PROG_NM = T000G3_A372TBM21_CRT_PROG_NM[0] ;
            Z375TBM21_UPD_PROG_NM = T000G3_A375TBM21_UPD_PROG_NM[0] ;
         }
         else
         {
            Z370TBM21_CRT_DATETIME = A370TBM21_CRT_DATETIME ;
            Z371TBM21_CRT_USER_ID = A371TBM21_CRT_USER_ID ;
            Z373TBM21_UPD_DATETIME = A373TBM21_UPD_DATETIME ;
            Z374TBM21_UPD_USER_ID = A374TBM21_UPD_USER_ID ;
            Z376TBM21_UPD_CNT = A376TBM21_UPD_CNT ;
            Z367TBM21_STUDY_NM = A367TBM21_STUDY_NM ;
            Z530TBM21_OUTER_STUDY_ID = A530TBM21_OUTER_STUDY_ID ;
            Z531TBM21_PROC_NM = A531TBM21_PROC_NM ;
            Z368TBM21_NOTE = A368TBM21_NOTE ;
            Z607TBM21_STATUS = A607TBM21_STATUS ;
            Z369TBM21_DEL_FLG = A369TBM21_DEL_FLG ;
            Z372TBM21_CRT_PROG_NM = A372TBM21_CRT_PROG_NM ;
            Z375TBM21_UPD_PROG_NM = A375TBM21_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z63TBM21_STUDY_ID = A63TBM21_STUDY_ID ;
         Z370TBM21_CRT_DATETIME = A370TBM21_CRT_DATETIME ;
         Z371TBM21_CRT_USER_ID = A371TBM21_CRT_USER_ID ;
         Z373TBM21_UPD_DATETIME = A373TBM21_UPD_DATETIME ;
         Z374TBM21_UPD_USER_ID = A374TBM21_UPD_USER_ID ;
         Z376TBM21_UPD_CNT = A376TBM21_UPD_CNT ;
         Z367TBM21_STUDY_NM = A367TBM21_STUDY_NM ;
         Z530TBM21_OUTER_STUDY_ID = A530TBM21_OUTER_STUDY_ID ;
         Z531TBM21_PROC_NM = A531TBM21_PROC_NM ;
         Z368TBM21_NOTE = A368TBM21_NOTE ;
         Z607TBM21_STATUS = A607TBM21_STATUS ;
         Z369TBM21_DEL_FLG = A369TBM21_DEL_FLG ;
         Z372TBM21_CRT_PROG_NM = A372TBM21_CRT_PROG_NM ;
         Z375TBM21_UPD_PROG_NM = A375TBM21_UPD_PROG_NM ;
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

   public void load0G15( )
   {
      /* Using cursor T000G4 */
      pr_default.execute(2, new Object[] {new Long(A63TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A370TBM21_CRT_DATETIME = T000G4_A370TBM21_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A370TBM21_CRT_DATETIME", localUtil.ttoc( A370TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n370TBM21_CRT_DATETIME = T000G4_n370TBM21_CRT_DATETIME[0] ;
         A371TBM21_CRT_USER_ID = T000G4_A371TBM21_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A371TBM21_CRT_USER_ID", A371TBM21_CRT_USER_ID);
         n371TBM21_CRT_USER_ID = T000G4_n371TBM21_CRT_USER_ID[0] ;
         A373TBM21_UPD_DATETIME = T000G4_A373TBM21_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A373TBM21_UPD_DATETIME", localUtil.ttoc( A373TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n373TBM21_UPD_DATETIME = T000G4_n373TBM21_UPD_DATETIME[0] ;
         A374TBM21_UPD_USER_ID = T000G4_A374TBM21_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374TBM21_UPD_USER_ID", A374TBM21_UPD_USER_ID);
         n374TBM21_UPD_USER_ID = T000G4_n374TBM21_UPD_USER_ID[0] ;
         A376TBM21_UPD_CNT = T000G4_A376TBM21_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A376TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)));
         n376TBM21_UPD_CNT = T000G4_n376TBM21_UPD_CNT[0] ;
         A367TBM21_STUDY_NM = T000G4_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = T000G4_n367TBM21_STUDY_NM[0] ;
         A530TBM21_OUTER_STUDY_ID = T000G4_A530TBM21_OUTER_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A530TBM21_OUTER_STUDY_ID", A530TBM21_OUTER_STUDY_ID);
         n530TBM21_OUTER_STUDY_ID = T000G4_n530TBM21_OUTER_STUDY_ID[0] ;
         A531TBM21_PROC_NM = T000G4_A531TBM21_PROC_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A531TBM21_PROC_NM", A531TBM21_PROC_NM);
         n531TBM21_PROC_NM = T000G4_n531TBM21_PROC_NM[0] ;
         A368TBM21_NOTE = T000G4_A368TBM21_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A368TBM21_NOTE", A368TBM21_NOTE);
         n368TBM21_NOTE = T000G4_n368TBM21_NOTE[0] ;
         A607TBM21_STATUS = T000G4_A607TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
         n607TBM21_STATUS = T000G4_n607TBM21_STATUS[0] ;
         A369TBM21_DEL_FLG = T000G4_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = T000G4_n369TBM21_DEL_FLG[0] ;
         A372TBM21_CRT_PROG_NM = T000G4_A372TBM21_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A372TBM21_CRT_PROG_NM", A372TBM21_CRT_PROG_NM);
         n372TBM21_CRT_PROG_NM = T000G4_n372TBM21_CRT_PROG_NM[0] ;
         A375TBM21_UPD_PROG_NM = T000G4_A375TBM21_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A375TBM21_UPD_PROG_NM", A375TBM21_UPD_PROG_NM);
         n375TBM21_UPD_PROG_NM = T000G4_n375TBM21_UPD_PROG_NM[0] ;
         zm0G15( -8) ;
      }
      pr_default.close(2);
      onLoadActions0G15( ) ;
   }

   public void onLoadActions0G15( )
   {
      AV9Pgmname = "TBM21_STUDY" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0G15( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM21_STUDY" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A370TBM21_CRT_DATETIME) || (( A370TBM21_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A370TBM21_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM21_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM21_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A373TBM21_UPD_DATETIME) || (( A373TBM21_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A373TBM21_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM21_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM21_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0G15( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0G15( )
   {
      /* Using cursor T000G5 */
      pr_default.execute(3, new Object[] {new Long(A63TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound15 = (short)(1) ;
      }
      else
      {
         RcdFound15 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000G3 */
      pr_default.execute(1, new Object[] {new Long(A63TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0G15( 8) ;
         RcdFound15 = (short)(1) ;
         A63TBM21_STUDY_ID = T000G3_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         A370TBM21_CRT_DATETIME = T000G3_A370TBM21_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A370TBM21_CRT_DATETIME", localUtil.ttoc( A370TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n370TBM21_CRT_DATETIME = T000G3_n370TBM21_CRT_DATETIME[0] ;
         A371TBM21_CRT_USER_ID = T000G3_A371TBM21_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A371TBM21_CRT_USER_ID", A371TBM21_CRT_USER_ID);
         n371TBM21_CRT_USER_ID = T000G3_n371TBM21_CRT_USER_ID[0] ;
         A373TBM21_UPD_DATETIME = T000G3_A373TBM21_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A373TBM21_UPD_DATETIME", localUtil.ttoc( A373TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n373TBM21_UPD_DATETIME = T000G3_n373TBM21_UPD_DATETIME[0] ;
         A374TBM21_UPD_USER_ID = T000G3_A374TBM21_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A374TBM21_UPD_USER_ID", A374TBM21_UPD_USER_ID);
         n374TBM21_UPD_USER_ID = T000G3_n374TBM21_UPD_USER_ID[0] ;
         A376TBM21_UPD_CNT = T000G3_A376TBM21_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A376TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)));
         n376TBM21_UPD_CNT = T000G3_n376TBM21_UPD_CNT[0] ;
         A367TBM21_STUDY_NM = T000G3_A367TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
         n367TBM21_STUDY_NM = T000G3_n367TBM21_STUDY_NM[0] ;
         A530TBM21_OUTER_STUDY_ID = T000G3_A530TBM21_OUTER_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A530TBM21_OUTER_STUDY_ID", A530TBM21_OUTER_STUDY_ID);
         n530TBM21_OUTER_STUDY_ID = T000G3_n530TBM21_OUTER_STUDY_ID[0] ;
         A531TBM21_PROC_NM = T000G3_A531TBM21_PROC_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A531TBM21_PROC_NM", A531TBM21_PROC_NM);
         n531TBM21_PROC_NM = T000G3_n531TBM21_PROC_NM[0] ;
         A368TBM21_NOTE = T000G3_A368TBM21_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A368TBM21_NOTE", A368TBM21_NOTE);
         n368TBM21_NOTE = T000G3_n368TBM21_NOTE[0] ;
         A607TBM21_STATUS = T000G3_A607TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
         n607TBM21_STATUS = T000G3_n607TBM21_STATUS[0] ;
         A369TBM21_DEL_FLG = T000G3_A369TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
         n369TBM21_DEL_FLG = T000G3_n369TBM21_DEL_FLG[0] ;
         A372TBM21_CRT_PROG_NM = T000G3_A372TBM21_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A372TBM21_CRT_PROG_NM", A372TBM21_CRT_PROG_NM);
         n372TBM21_CRT_PROG_NM = T000G3_n372TBM21_CRT_PROG_NM[0] ;
         A375TBM21_UPD_PROG_NM = T000G3_A375TBM21_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A375TBM21_UPD_PROG_NM", A375TBM21_UPD_PROG_NM);
         n375TBM21_UPD_PROG_NM = T000G3_n375TBM21_UPD_PROG_NM[0] ;
         O376TBM21_UPD_CNT = A376TBM21_UPD_CNT ;
         n376TBM21_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A376TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)));
         Z63TBM21_STUDY_ID = A63TBM21_STUDY_ID ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0G15( ) ;
         if ( AnyError == 1 )
         {
            RcdFound15 = (short)(0) ;
            initializeNonKey0G15( ) ;
         }
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound15 = (short)(0) ;
         initializeNonKey0G15( ) ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode15 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0G15( ) ;
      if ( RcdFound15 == 0 )
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
      RcdFound15 = (short)(0) ;
      /* Using cursor T000G6 */
      pr_default.execute(4, new Object[] {new Long(A63TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000G6_A63TBM21_STUDY_ID[0] < A63TBM21_STUDY_ID ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000G6_A63TBM21_STUDY_ID[0] > A63TBM21_STUDY_ID ) ) )
         {
            A63TBM21_STUDY_ID = T000G6_A63TBM21_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T000G7 */
      pr_default.execute(5, new Object[] {new Long(A63TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000G7_A63TBM21_STUDY_ID[0] > A63TBM21_STUDY_ID ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000G7_A63TBM21_STUDY_ID[0] < A63TBM21_STUDY_ID ) ) )
         {
            A63TBM21_STUDY_ID = T000G7_A63TBM21_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0G15( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0G15( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound15 == 1 )
         {
            if ( A63TBM21_STUDY_ID != Z63TBM21_STUDY_ID )
            {
               A63TBM21_STUDY_ID = Z63TBM21_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM21_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0G15( ) ;
               GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A63TBM21_STUDY_ID != Z63TBM21_STUDY_ID )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0G15( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM21_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0G15( ) ;
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
      if ( A63TBM21_STUDY_ID != Z63TBM21_STUDY_ID )
      {
         A63TBM21_STUDY_ID = Z63TBM21_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM21_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM21_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM21_STUDY_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0G15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM21_STUDY_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0G15( ) ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM21_STUDY_NM_Internalname ;
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
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM21_STUDY_NM_Internalname ;
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
      scanStart0G15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound15 != 0 )
         {
            scanNext0G15( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM21_STUDY_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0G15( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0G15( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000G2 */
         pr_default.execute(0, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM21_STUDY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z370TBM21_CRT_DATETIME.equals( T000G2_A370TBM21_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z371TBM21_CRT_USER_ID, T000G2_A371TBM21_CRT_USER_ID[0]) != 0 ) || !( Z373TBM21_UPD_DATETIME.equals( T000G2_A373TBM21_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z374TBM21_UPD_USER_ID, T000G2_A374TBM21_UPD_USER_ID[0]) != 0 ) || ( Z376TBM21_UPD_CNT != T000G2_A376TBM21_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z367TBM21_STUDY_NM, T000G2_A367TBM21_STUDY_NM[0]) != 0 ) || ( GXutil.strcmp(Z530TBM21_OUTER_STUDY_ID, T000G2_A530TBM21_OUTER_STUDY_ID[0]) != 0 ) || ( GXutil.strcmp(Z531TBM21_PROC_NM, T000G2_A531TBM21_PROC_NM[0]) != 0 ) || ( GXutil.strcmp(Z368TBM21_NOTE, T000G2_A368TBM21_NOTE[0]) != 0 ) || ( GXutil.strcmp(Z607TBM21_STATUS, T000G2_A607TBM21_STATUS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z369TBM21_DEL_FLG, T000G2_A369TBM21_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z372TBM21_CRT_PROG_NM, T000G2_A372TBM21_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z375TBM21_UPD_PROG_NM, T000G2_A375TBM21_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM21_STUDY"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0G15( )
   {
      beforeValidate0G15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0G15( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0G15( 0) ;
         checkOptimisticConcurrency0G15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0G15( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0G15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000G8 */
                  pr_default.execute(6, new Object[] {new Long(A63TBM21_STUDY_ID), new Boolean(n370TBM21_CRT_DATETIME), A370TBM21_CRT_DATETIME, new Boolean(n371TBM21_CRT_USER_ID), A371TBM21_CRT_USER_ID, new Boolean(n373TBM21_UPD_DATETIME), A373TBM21_UPD_DATETIME, new Boolean(n374TBM21_UPD_USER_ID), A374TBM21_UPD_USER_ID, new Boolean(n376TBM21_UPD_CNT), new Long(A376TBM21_UPD_CNT), new Boolean(n367TBM21_STUDY_NM), A367TBM21_STUDY_NM, new Boolean(n530TBM21_OUTER_STUDY_ID), A530TBM21_OUTER_STUDY_ID, new Boolean(n531TBM21_PROC_NM), A531TBM21_PROC_NM, new Boolean(n368TBM21_NOTE), A368TBM21_NOTE, new Boolean(n607TBM21_STATUS), A607TBM21_STATUS, new Boolean(n369TBM21_DEL_FLG), A369TBM21_DEL_FLG, new Boolean(n372TBM21_CRT_PROG_NM), A372TBM21_CRT_PROG_NM, new Boolean(n375TBM21_UPD_PROG_NM), A375TBM21_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM21_STUDY") ;
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
                        resetCaption0G0( ) ;
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
            load0G15( ) ;
         }
         endLevel0G15( ) ;
      }
      closeExtendedTableCursors0G15( ) ;
   }

   public void update0G15( )
   {
      beforeValidate0G15( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0G15( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0G15( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0G15( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0G15( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000G9 */
                  pr_default.execute(7, new Object[] {new Boolean(n370TBM21_CRT_DATETIME), A370TBM21_CRT_DATETIME, new Boolean(n371TBM21_CRT_USER_ID), A371TBM21_CRT_USER_ID, new Boolean(n373TBM21_UPD_DATETIME), A373TBM21_UPD_DATETIME, new Boolean(n374TBM21_UPD_USER_ID), A374TBM21_UPD_USER_ID, new Boolean(n376TBM21_UPD_CNT), new Long(A376TBM21_UPD_CNT), new Boolean(n367TBM21_STUDY_NM), A367TBM21_STUDY_NM, new Boolean(n530TBM21_OUTER_STUDY_ID), A530TBM21_OUTER_STUDY_ID, new Boolean(n531TBM21_PROC_NM), A531TBM21_PROC_NM, new Boolean(n368TBM21_NOTE), A368TBM21_NOTE, new Boolean(n607TBM21_STATUS), A607TBM21_STATUS, new Boolean(n369TBM21_DEL_FLG), A369TBM21_DEL_FLG, new Boolean(n372TBM21_CRT_PROG_NM), A372TBM21_CRT_PROG_NM, new Boolean(n375TBM21_UPD_PROG_NM), A375TBM21_UPD_PROG_NM, new Long(A63TBM21_STUDY_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM21_STUDY") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM21_STUDY"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0G15( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0G0( ) ;
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
         endLevel0G15( ) ;
      }
      closeExtendedTableCursors0G15( ) ;
   }

   public void deferredUpdate0G15( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0G15( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0G15( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0G15( ) ;
         afterConfirm0G15( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0G15( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000G10 */
               pr_default.execute(8, new Object[] {new Long(A63TBM21_STUDY_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM21_STUDY") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound15 == 0 )
                     {
                        initAll0G15( ) ;
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
                     resetCaption0G0( ) ;
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
      sMode15 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0G15( ) ;
      Gx_mode = sMode15 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0G15( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM21_STUDY" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000G11 */
         pr_default.execute(9, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験参加スタッフマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T000G12 */
         pr_default.execute(10, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRFマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T000G13 */
         pr_default.execute(11, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"マッピング済部品マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T000G14 */
         pr_default.execute(12, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"選択リストマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T000G15 */
         pr_default.execute(13, new Object[] {new Long(A63TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験実施施設マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void endLevel0G15( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0G15( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm21_study");
         if ( AnyError == 0 )
         {
            confirmValues0G0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm21_study");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0G15( )
   {
      /* Scan By routine */
      /* Using cursor T000G16 */
      pr_default.execute(14);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A63TBM21_STUDY_ID = T000G16_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0G15( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A63TBM21_STUDY_ID = T000G16_A63TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
      }
   }

   public void scanEnd0G15( )
   {
      pr_default.close(14);
   }

   public void afterConfirm0G15( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0G15( )
   {
      /* Before Insert Rules */
      A370TBM21_CRT_DATETIME = GXutil.now( ) ;
      n370TBM21_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A370TBM21_CRT_DATETIME", localUtil.ttoc( A370TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A371TBM21_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm21_study_impl.this.GXt_char1 = GXv_char2[0] ;
      A371TBM21_CRT_USER_ID = GXt_char1 ;
      n371TBM21_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A371TBM21_CRT_USER_ID", A371TBM21_CRT_USER_ID);
      A373TBM21_UPD_DATETIME = GXutil.now( ) ;
      n373TBM21_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A373TBM21_UPD_DATETIME", localUtil.ttoc( A373TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A374TBM21_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm21_study_impl.this.GXt_char1 = GXv_char2[0] ;
      A374TBM21_UPD_USER_ID = GXt_char1 ;
      n374TBM21_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A374TBM21_UPD_USER_ID", A374TBM21_UPD_USER_ID);
      A376TBM21_UPD_CNT = (long)(O376TBM21_UPD_CNT+1) ;
      n376TBM21_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A376TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0G15( )
   {
      /* Before Update Rules */
      A373TBM21_UPD_DATETIME = GXutil.now( ) ;
      n373TBM21_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A373TBM21_UPD_DATETIME", localUtil.ttoc( A373TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A374TBM21_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm21_study_impl.this.GXt_char1 = GXv_char2[0] ;
      A374TBM21_UPD_USER_ID = GXt_char1 ;
      n374TBM21_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A374TBM21_UPD_USER_ID", A374TBM21_UPD_USER_ID);
      A376TBM21_UPD_CNT = (long)(O376TBM21_UPD_CNT+1) ;
      n376TBM21_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A376TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0G15( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0G15( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0G15( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0G15( )
   {
      edtTBM21_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_STUDY_ID_Enabled, 5, 0)));
      edtTBM21_STUDY_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_STUDY_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_STUDY_NM_Enabled, 5, 0)));
      edtTBM21_OUTER_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_OUTER_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_OUTER_STUDY_ID_Enabled, 5, 0)));
      edtTBM21_PROC_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_PROC_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_PROC_NM_Enabled, 5, 0)));
      edtTBM21_NOTE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_NOTE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_NOTE_Enabled, 5, 0)));
      edtTBM21_STATUS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_STATUS_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_STATUS_Enabled, 5, 0)));
      edtTBM21_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_DEL_FLG_Enabled, 5, 0)));
      edtTBM21_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM21_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM21_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM21_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM21_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM21_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM21_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM21_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM21_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0G0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "試験マスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317142121");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm21_study") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0G15( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z63TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z370TBM21_CRT_DATETIME", localUtil.ttoc( Z370TBM21_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z371TBM21_CRT_USER_ID", GXutil.rtrim( Z371TBM21_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z373TBM21_UPD_DATETIME", localUtil.ttoc( Z373TBM21_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z374TBM21_UPD_USER_ID", GXutil.rtrim( Z374TBM21_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z376TBM21_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z376TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z367TBM21_STUDY_NM", GXutil.rtrim( Z367TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z530TBM21_OUTER_STUDY_ID", GXutil.rtrim( Z530TBM21_OUTER_STUDY_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z531TBM21_PROC_NM", GXutil.rtrim( Z531TBM21_PROC_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z368TBM21_NOTE", GXutil.rtrim( Z368TBM21_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z607TBM21_STATUS", GXutil.rtrim( Z607TBM21_STATUS));
      GxWebStd.gx_hidden_field( httpContext, "Z369TBM21_DEL_FLG", GXutil.rtrim( Z369TBM21_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z372TBM21_CRT_PROG_NM", GXutil.rtrim( Z372TBM21_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z375TBM21_UPD_PROG_NM", GXutil.rtrim( Z375TBM21_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O376TBM21_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O376TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM21_STUDY" ;
   }

   public String getPgmdesc( )
   {
      return "試験マスタ" ;
   }

   public void initializeNonKey0G15( )
   {
      A370TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n370TBM21_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A370TBM21_CRT_DATETIME", localUtil.ttoc( A370TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n370TBM21_CRT_DATETIME = (GXutil.nullDate().equals(A370TBM21_CRT_DATETIME) ? true : false) ;
      A371TBM21_CRT_USER_ID = "" ;
      n371TBM21_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A371TBM21_CRT_USER_ID", A371TBM21_CRT_USER_ID);
      n371TBM21_CRT_USER_ID = ((GXutil.strcmp("", A371TBM21_CRT_USER_ID)==0) ? true : false) ;
      A373TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n373TBM21_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A373TBM21_UPD_DATETIME", localUtil.ttoc( A373TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n373TBM21_UPD_DATETIME = (GXutil.nullDate().equals(A373TBM21_UPD_DATETIME) ? true : false) ;
      A374TBM21_UPD_USER_ID = "" ;
      n374TBM21_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A374TBM21_UPD_USER_ID", A374TBM21_UPD_USER_ID);
      n374TBM21_UPD_USER_ID = ((GXutil.strcmp("", A374TBM21_UPD_USER_ID)==0) ? true : false) ;
      A376TBM21_UPD_CNT = 0 ;
      n376TBM21_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A376TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)));
      n376TBM21_UPD_CNT = ((0==A376TBM21_UPD_CNT) ? true : false) ;
      A367TBM21_STUDY_NM = "" ;
      n367TBM21_STUDY_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A367TBM21_STUDY_NM", A367TBM21_STUDY_NM);
      n367TBM21_STUDY_NM = ((GXutil.strcmp("", A367TBM21_STUDY_NM)==0) ? true : false) ;
      A530TBM21_OUTER_STUDY_ID = "" ;
      n530TBM21_OUTER_STUDY_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A530TBM21_OUTER_STUDY_ID", A530TBM21_OUTER_STUDY_ID);
      n530TBM21_OUTER_STUDY_ID = ((GXutil.strcmp("", A530TBM21_OUTER_STUDY_ID)==0) ? true : false) ;
      A531TBM21_PROC_NM = "" ;
      n531TBM21_PROC_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A531TBM21_PROC_NM", A531TBM21_PROC_NM);
      n531TBM21_PROC_NM = ((GXutil.strcmp("", A531TBM21_PROC_NM)==0) ? true : false) ;
      A368TBM21_NOTE = "" ;
      n368TBM21_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A368TBM21_NOTE", A368TBM21_NOTE);
      n368TBM21_NOTE = ((GXutil.strcmp("", A368TBM21_NOTE)==0) ? true : false) ;
      A607TBM21_STATUS = "" ;
      n607TBM21_STATUS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A607TBM21_STATUS", A607TBM21_STATUS);
      n607TBM21_STATUS = ((GXutil.strcmp("", A607TBM21_STATUS)==0) ? true : false) ;
      A369TBM21_DEL_FLG = "" ;
      n369TBM21_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A369TBM21_DEL_FLG", A369TBM21_DEL_FLG);
      n369TBM21_DEL_FLG = ((GXutil.strcmp("", A369TBM21_DEL_FLG)==0) ? true : false) ;
      A372TBM21_CRT_PROG_NM = "" ;
      n372TBM21_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A372TBM21_CRT_PROG_NM", A372TBM21_CRT_PROG_NM);
      n372TBM21_CRT_PROG_NM = ((GXutil.strcmp("", A372TBM21_CRT_PROG_NM)==0) ? true : false) ;
      A375TBM21_UPD_PROG_NM = "" ;
      n375TBM21_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A375TBM21_UPD_PROG_NM", A375TBM21_UPD_PROG_NM);
      n375TBM21_UPD_PROG_NM = ((GXutil.strcmp("", A375TBM21_UPD_PROG_NM)==0) ? true : false) ;
      O376TBM21_UPD_CNT = A376TBM21_UPD_CNT ;
      n376TBM21_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A376TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A376TBM21_UPD_CNT, 10, 0)));
   }

   public void initAll0G15( )
   {
      A63TBM21_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A63TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A63TBM21_STUDY_ID, 10, 0)));
      initializeNonKey0G15( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317142130");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm21_study.js", "?20177317142130");
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
      lblTextblocktbm21_study_id_Internalname = "TEXTBLOCKTBM21_STUDY_ID" ;
      edtTBM21_STUDY_ID_Internalname = "TBM21_STUDY_ID" ;
      lblTextblocktbm21_study_nm_Internalname = "TEXTBLOCKTBM21_STUDY_NM" ;
      edtTBM21_STUDY_NM_Internalname = "TBM21_STUDY_NM" ;
      lblTextblocktbm21_outer_study_id_Internalname = "TEXTBLOCKTBM21_OUTER_STUDY_ID" ;
      edtTBM21_OUTER_STUDY_ID_Internalname = "TBM21_OUTER_STUDY_ID" ;
      lblTextblocktbm21_proc_nm_Internalname = "TEXTBLOCKTBM21_PROC_NM" ;
      edtTBM21_PROC_NM_Internalname = "TBM21_PROC_NM" ;
      lblTextblocktbm21_note_Internalname = "TEXTBLOCKTBM21_NOTE" ;
      edtTBM21_NOTE_Internalname = "TBM21_NOTE" ;
      lblTextblocktbm21_status_Internalname = "TEXTBLOCKTBM21_STATUS" ;
      edtTBM21_STATUS_Internalname = "TBM21_STATUS" ;
      lblTextblocktbm21_del_flg_Internalname = "TEXTBLOCKTBM21_DEL_FLG" ;
      edtTBM21_DEL_FLG_Internalname = "TBM21_DEL_FLG" ;
      lblTextblocktbm21_crt_datetime_Internalname = "TEXTBLOCKTBM21_CRT_DATETIME" ;
      edtTBM21_CRT_DATETIME_Internalname = "TBM21_CRT_DATETIME" ;
      lblTextblocktbm21_crt_user_id_Internalname = "TEXTBLOCKTBM21_CRT_USER_ID" ;
      edtTBM21_CRT_USER_ID_Internalname = "TBM21_CRT_USER_ID" ;
      lblTextblocktbm21_crt_prog_nm_Internalname = "TEXTBLOCKTBM21_CRT_PROG_NM" ;
      edtTBM21_CRT_PROG_NM_Internalname = "TBM21_CRT_PROG_NM" ;
      lblTextblocktbm21_upd_datetime_Internalname = "TEXTBLOCKTBM21_UPD_DATETIME" ;
      edtTBM21_UPD_DATETIME_Internalname = "TBM21_UPD_DATETIME" ;
      lblTextblocktbm21_upd_user_id_Internalname = "TEXTBLOCKTBM21_UPD_USER_ID" ;
      edtTBM21_UPD_USER_ID_Internalname = "TBM21_UPD_USER_ID" ;
      lblTextblocktbm21_upd_prog_nm_Internalname = "TEXTBLOCKTBM21_UPD_PROG_NM" ;
      edtTBM21_UPD_PROG_NM_Internalname = "TBM21_UPD_PROG_NM" ;
      lblTextblocktbm21_upd_cnt_Internalname = "TEXTBLOCKTBM21_UPD_CNT" ;
      edtTBM21_UPD_CNT_Internalname = "TBM21_UPD_CNT" ;
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
      edtTBM21_UPD_CNT_Jsonclick = "" ;
      edtTBM21_UPD_CNT_Enabled = 1 ;
      edtTBM21_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM21_UPD_PROG_NM_Enabled = 1 ;
      edtTBM21_UPD_USER_ID_Jsonclick = "" ;
      edtTBM21_UPD_USER_ID_Enabled = 1 ;
      edtTBM21_UPD_DATETIME_Jsonclick = "" ;
      edtTBM21_UPD_DATETIME_Enabled = 1 ;
      edtTBM21_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM21_CRT_PROG_NM_Enabled = 1 ;
      edtTBM21_CRT_USER_ID_Jsonclick = "" ;
      edtTBM21_CRT_USER_ID_Enabled = 1 ;
      edtTBM21_CRT_DATETIME_Jsonclick = "" ;
      edtTBM21_CRT_DATETIME_Enabled = 1 ;
      edtTBM21_DEL_FLG_Jsonclick = "" ;
      edtTBM21_DEL_FLG_Enabled = 1 ;
      edtTBM21_STATUS_Jsonclick = "" ;
      edtTBM21_STATUS_Enabled = 1 ;
      edtTBM21_NOTE_Enabled = 1 ;
      edtTBM21_PROC_NM_Jsonclick = "" ;
      edtTBM21_PROC_NM_Enabled = 1 ;
      edtTBM21_OUTER_STUDY_ID_Jsonclick = "" ;
      edtTBM21_OUTER_STUDY_ID_Enabled = 1 ;
      edtTBM21_STUDY_NM_Jsonclick = "" ;
      edtTBM21_STUDY_NM_Enabled = 1 ;
      edtTBM21_STUDY_ID_Jsonclick = "" ;
      edtTBM21_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm21_crt_user_id0G15( String Gx_mode )
   {
      GXt_char1 = A371TBM21_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm21_study_impl.this.GXt_char1 = GXv_char2[0] ;
      A371TBM21_CRT_USER_ID = GXt_char1 ;
      n371TBM21_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A371TBM21_CRT_USER_ID", A371TBM21_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A371TBM21_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm21_upd_user_id0G15( String Gx_mode )
   {
      GXt_char1 = A374TBM21_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm21_study_impl.this.GXt_char1 = GXv_char2[0] ;
      A374TBM21_UPD_USER_ID = GXt_char1 ;
      n374TBM21_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A374TBM21_UPD_USER_ID", A374TBM21_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A374TBM21_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM21_STUDY_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm21_study_id( long GX_Parm1 ,
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
                                     String GX_Parm12 ,
                                     String GX_Parm13 ,
                                     String GX_Parm14 )
   {
      A63TBM21_STUDY_ID = GX_Parm1 ;
      A370TBM21_CRT_DATETIME = GX_Parm2 ;
      n370TBM21_CRT_DATETIME = false ;
      A371TBM21_CRT_USER_ID = GX_Parm3 ;
      n371TBM21_CRT_USER_ID = false ;
      A373TBM21_UPD_DATETIME = GX_Parm4 ;
      n373TBM21_UPD_DATETIME = false ;
      A374TBM21_UPD_USER_ID = GX_Parm5 ;
      n374TBM21_UPD_USER_ID = false ;
      A376TBM21_UPD_CNT = GX_Parm6 ;
      n376TBM21_UPD_CNT = false ;
      A367TBM21_STUDY_NM = GX_Parm7 ;
      n367TBM21_STUDY_NM = false ;
      A530TBM21_OUTER_STUDY_ID = GX_Parm8 ;
      n530TBM21_OUTER_STUDY_ID = false ;
      A531TBM21_PROC_NM = GX_Parm9 ;
      n531TBM21_PROC_NM = false ;
      A368TBM21_NOTE = GX_Parm10 ;
      n368TBM21_NOTE = false ;
      A607TBM21_STATUS = GX_Parm11 ;
      n607TBM21_STATUS = false ;
      A369TBM21_DEL_FLG = GX_Parm12 ;
      n369TBM21_DEL_FLG = false ;
      A372TBM21_CRT_PROG_NM = GX_Parm13 ;
      n372TBM21_CRT_PROG_NM = false ;
      A375TBM21_UPD_PROG_NM = GX_Parm14 ;
      n375TBM21_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A370TBM21_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A371TBM21_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A373TBM21_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A374TBM21_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A376TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A367TBM21_STUDY_NM));
      isValidOutput.add(GXutil.rtrim( A530TBM21_OUTER_STUDY_ID));
      isValidOutput.add(GXutil.rtrim( A531TBM21_PROC_NM));
      isValidOutput.add(GXutil.rtrim( A368TBM21_NOTE));
      isValidOutput.add(GXutil.rtrim( A607TBM21_STATUS));
      isValidOutput.add(GXutil.rtrim( A369TBM21_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A372TBM21_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A375TBM21_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z63TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z370TBM21_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z371TBM21_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z373TBM21_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z374TBM21_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z376TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z367TBM21_STUDY_NM));
      isValidOutput.add(GXutil.rtrim( Z530TBM21_OUTER_STUDY_ID));
      isValidOutput.add(GXutil.rtrim( Z531TBM21_PROC_NM));
      isValidOutput.add(GXutil.rtrim( Z368TBM21_NOTE));
      isValidOutput.add(GXutil.rtrim( Z607TBM21_STATUS));
      isValidOutput.add(GXutil.rtrim( Z369TBM21_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z372TBM21_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z375TBM21_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O376TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z370TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z371TBM21_CRT_USER_ID = "" ;
      Z373TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z374TBM21_UPD_USER_ID = "" ;
      Z367TBM21_STUDY_NM = "" ;
      Z530TBM21_OUTER_STUDY_ID = "" ;
      Z531TBM21_PROC_NM = "" ;
      Z368TBM21_NOTE = "" ;
      Z607TBM21_STATUS = "" ;
      Z369TBM21_DEL_FLG = "" ;
      Z372TBM21_CRT_PROG_NM = "" ;
      Z375TBM21_UPD_PROG_NM = "" ;
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
      lblTextblocktbm21_study_id_Jsonclick = "" ;
      lblTextblocktbm21_study_nm_Jsonclick = "" ;
      A367TBM21_STUDY_NM = "" ;
      lblTextblocktbm21_outer_study_id_Jsonclick = "" ;
      A530TBM21_OUTER_STUDY_ID = "" ;
      lblTextblocktbm21_proc_nm_Jsonclick = "" ;
      A531TBM21_PROC_NM = "" ;
      lblTextblocktbm21_note_Jsonclick = "" ;
      A368TBM21_NOTE = "" ;
      lblTextblocktbm21_status_Jsonclick = "" ;
      A607TBM21_STATUS = "" ;
      lblTextblocktbm21_del_flg_Jsonclick = "" ;
      A369TBM21_DEL_FLG = "" ;
      lblTextblocktbm21_crt_datetime_Jsonclick = "" ;
      A370TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm21_crt_user_id_Jsonclick = "" ;
      A371TBM21_CRT_USER_ID = "" ;
      lblTextblocktbm21_crt_prog_nm_Jsonclick = "" ;
      A372TBM21_CRT_PROG_NM = "" ;
      lblTextblocktbm21_upd_datetime_Jsonclick = "" ;
      A373TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm21_upd_user_id_Jsonclick = "" ;
      A374TBM21_UPD_USER_ID = "" ;
      lblTextblocktbm21_upd_prog_nm_Jsonclick = "" ;
      A375TBM21_UPD_PROG_NM = "" ;
      lblTextblocktbm21_upd_cnt_Jsonclick = "" ;
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
      T000G4_A63TBM21_STUDY_ID = new long[1] ;
      T000G4_A370TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G4_n370TBM21_CRT_DATETIME = new boolean[] {false} ;
      T000G4_A371TBM21_CRT_USER_ID = new String[] {""} ;
      T000G4_n371TBM21_CRT_USER_ID = new boolean[] {false} ;
      T000G4_A373TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G4_n373TBM21_UPD_DATETIME = new boolean[] {false} ;
      T000G4_A374TBM21_UPD_USER_ID = new String[] {""} ;
      T000G4_n374TBM21_UPD_USER_ID = new boolean[] {false} ;
      T000G4_A376TBM21_UPD_CNT = new long[1] ;
      T000G4_n376TBM21_UPD_CNT = new boolean[] {false} ;
      T000G4_A367TBM21_STUDY_NM = new String[] {""} ;
      T000G4_n367TBM21_STUDY_NM = new boolean[] {false} ;
      T000G4_A530TBM21_OUTER_STUDY_ID = new String[] {""} ;
      T000G4_n530TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      T000G4_A531TBM21_PROC_NM = new String[] {""} ;
      T000G4_n531TBM21_PROC_NM = new boolean[] {false} ;
      T000G4_A368TBM21_NOTE = new String[] {""} ;
      T000G4_n368TBM21_NOTE = new boolean[] {false} ;
      T000G4_A607TBM21_STATUS = new String[] {""} ;
      T000G4_n607TBM21_STATUS = new boolean[] {false} ;
      T000G4_A369TBM21_DEL_FLG = new String[] {""} ;
      T000G4_n369TBM21_DEL_FLG = new boolean[] {false} ;
      T000G4_A372TBM21_CRT_PROG_NM = new String[] {""} ;
      T000G4_n372TBM21_CRT_PROG_NM = new boolean[] {false} ;
      T000G4_A375TBM21_UPD_PROG_NM = new String[] {""} ;
      T000G4_n375TBM21_UPD_PROG_NM = new boolean[] {false} ;
      T000G5_A63TBM21_STUDY_ID = new long[1] ;
      T000G3_A63TBM21_STUDY_ID = new long[1] ;
      T000G3_A370TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G3_n370TBM21_CRT_DATETIME = new boolean[] {false} ;
      T000G3_A371TBM21_CRT_USER_ID = new String[] {""} ;
      T000G3_n371TBM21_CRT_USER_ID = new boolean[] {false} ;
      T000G3_A373TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G3_n373TBM21_UPD_DATETIME = new boolean[] {false} ;
      T000G3_A374TBM21_UPD_USER_ID = new String[] {""} ;
      T000G3_n374TBM21_UPD_USER_ID = new boolean[] {false} ;
      T000G3_A376TBM21_UPD_CNT = new long[1] ;
      T000G3_n376TBM21_UPD_CNT = new boolean[] {false} ;
      T000G3_A367TBM21_STUDY_NM = new String[] {""} ;
      T000G3_n367TBM21_STUDY_NM = new boolean[] {false} ;
      T000G3_A530TBM21_OUTER_STUDY_ID = new String[] {""} ;
      T000G3_n530TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      T000G3_A531TBM21_PROC_NM = new String[] {""} ;
      T000G3_n531TBM21_PROC_NM = new boolean[] {false} ;
      T000G3_A368TBM21_NOTE = new String[] {""} ;
      T000G3_n368TBM21_NOTE = new boolean[] {false} ;
      T000G3_A607TBM21_STATUS = new String[] {""} ;
      T000G3_n607TBM21_STATUS = new boolean[] {false} ;
      T000G3_A369TBM21_DEL_FLG = new String[] {""} ;
      T000G3_n369TBM21_DEL_FLG = new boolean[] {false} ;
      T000G3_A372TBM21_CRT_PROG_NM = new String[] {""} ;
      T000G3_n372TBM21_CRT_PROG_NM = new boolean[] {false} ;
      T000G3_A375TBM21_UPD_PROG_NM = new String[] {""} ;
      T000G3_n375TBM21_UPD_PROG_NM = new boolean[] {false} ;
      sMode15 = "" ;
      T000G6_A63TBM21_STUDY_ID = new long[1] ;
      T000G7_A63TBM21_STUDY_ID = new long[1] ;
      T000G2_A63TBM21_STUDY_ID = new long[1] ;
      T000G2_A370TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G2_n370TBM21_CRT_DATETIME = new boolean[] {false} ;
      T000G2_A371TBM21_CRT_USER_ID = new String[] {""} ;
      T000G2_n371TBM21_CRT_USER_ID = new boolean[] {false} ;
      T000G2_A373TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G2_n373TBM21_UPD_DATETIME = new boolean[] {false} ;
      T000G2_A374TBM21_UPD_USER_ID = new String[] {""} ;
      T000G2_n374TBM21_UPD_USER_ID = new boolean[] {false} ;
      T000G2_A376TBM21_UPD_CNT = new long[1] ;
      T000G2_n376TBM21_UPD_CNT = new boolean[] {false} ;
      T000G2_A367TBM21_STUDY_NM = new String[] {""} ;
      T000G2_n367TBM21_STUDY_NM = new boolean[] {false} ;
      T000G2_A530TBM21_OUTER_STUDY_ID = new String[] {""} ;
      T000G2_n530TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      T000G2_A531TBM21_PROC_NM = new String[] {""} ;
      T000G2_n531TBM21_PROC_NM = new boolean[] {false} ;
      T000G2_A368TBM21_NOTE = new String[] {""} ;
      T000G2_n368TBM21_NOTE = new boolean[] {false} ;
      T000G2_A607TBM21_STATUS = new String[] {""} ;
      T000G2_n607TBM21_STATUS = new boolean[] {false} ;
      T000G2_A369TBM21_DEL_FLG = new String[] {""} ;
      T000G2_n369TBM21_DEL_FLG = new boolean[] {false} ;
      T000G2_A372TBM21_CRT_PROG_NM = new String[] {""} ;
      T000G2_n372TBM21_CRT_PROG_NM = new boolean[] {false} ;
      T000G2_A375TBM21_UPD_PROG_NM = new String[] {""} ;
      T000G2_n375TBM21_UPD_PROG_NM = new boolean[] {false} ;
      T000G11_A107TBM23_STUDY_ID = new long[1] ;
      T000G11_A108TBM23_USER_ID = new String[] {""} ;
      T000G11_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000G12_A68TBM31_STUDY_ID = new long[1] ;
      T000G12_A69TBM31_CRF_ID = new short[1] ;
      T000G13_A64TBM24_STUDY_ID = new long[1] ;
      T000G13_A65TBM24_DOM_CD = new String[] {""} ;
      T000G13_A66TBM24_DOM_VAR_NM = new String[] {""} ;
      T000G13_A67TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000G14_A23TBM25_STUDY_ID = new long[1] ;
      T000G14_A24TBM25_LIST_CD = new String[] {""} ;
      T000G15_A17TBM22_STUDY_ID = new long[1] ;
      T000G15_A18TBM22_SITE_ID = new String[] {""} ;
      T000G16_A63TBM21_STUDY_ID = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm21_study__default(),
         new Object[] {
             new Object[] {
            T000G2_A63TBM21_STUDY_ID, T000G2_A370TBM21_CRT_DATETIME, T000G2_n370TBM21_CRT_DATETIME, T000G2_A371TBM21_CRT_USER_ID, T000G2_n371TBM21_CRT_USER_ID, T000G2_A373TBM21_UPD_DATETIME, T000G2_n373TBM21_UPD_DATETIME, T000G2_A374TBM21_UPD_USER_ID, T000G2_n374TBM21_UPD_USER_ID, T000G2_A376TBM21_UPD_CNT,
            T000G2_n376TBM21_UPD_CNT, T000G2_A367TBM21_STUDY_NM, T000G2_n367TBM21_STUDY_NM, T000G2_A530TBM21_OUTER_STUDY_ID, T000G2_n530TBM21_OUTER_STUDY_ID, T000G2_A531TBM21_PROC_NM, T000G2_n531TBM21_PROC_NM, T000G2_A368TBM21_NOTE, T000G2_n368TBM21_NOTE, T000G2_A607TBM21_STATUS,
            T000G2_n607TBM21_STATUS, T000G2_A369TBM21_DEL_FLG, T000G2_n369TBM21_DEL_FLG, T000G2_A372TBM21_CRT_PROG_NM, T000G2_n372TBM21_CRT_PROG_NM, T000G2_A375TBM21_UPD_PROG_NM, T000G2_n375TBM21_UPD_PROG_NM
            }
            , new Object[] {
            T000G3_A63TBM21_STUDY_ID, T000G3_A370TBM21_CRT_DATETIME, T000G3_n370TBM21_CRT_DATETIME, T000G3_A371TBM21_CRT_USER_ID, T000G3_n371TBM21_CRT_USER_ID, T000G3_A373TBM21_UPD_DATETIME, T000G3_n373TBM21_UPD_DATETIME, T000G3_A374TBM21_UPD_USER_ID, T000G3_n374TBM21_UPD_USER_ID, T000G3_A376TBM21_UPD_CNT,
            T000G3_n376TBM21_UPD_CNT, T000G3_A367TBM21_STUDY_NM, T000G3_n367TBM21_STUDY_NM, T000G3_A530TBM21_OUTER_STUDY_ID, T000G3_n530TBM21_OUTER_STUDY_ID, T000G3_A531TBM21_PROC_NM, T000G3_n531TBM21_PROC_NM, T000G3_A368TBM21_NOTE, T000G3_n368TBM21_NOTE, T000G3_A607TBM21_STATUS,
            T000G3_n607TBM21_STATUS, T000G3_A369TBM21_DEL_FLG, T000G3_n369TBM21_DEL_FLG, T000G3_A372TBM21_CRT_PROG_NM, T000G3_n372TBM21_CRT_PROG_NM, T000G3_A375TBM21_UPD_PROG_NM, T000G3_n375TBM21_UPD_PROG_NM
            }
            , new Object[] {
            T000G4_A63TBM21_STUDY_ID, T000G4_A370TBM21_CRT_DATETIME, T000G4_n370TBM21_CRT_DATETIME, T000G4_A371TBM21_CRT_USER_ID, T000G4_n371TBM21_CRT_USER_ID, T000G4_A373TBM21_UPD_DATETIME, T000G4_n373TBM21_UPD_DATETIME, T000G4_A374TBM21_UPD_USER_ID, T000G4_n374TBM21_UPD_USER_ID, T000G4_A376TBM21_UPD_CNT,
            T000G4_n376TBM21_UPD_CNT, T000G4_A367TBM21_STUDY_NM, T000G4_n367TBM21_STUDY_NM, T000G4_A530TBM21_OUTER_STUDY_ID, T000G4_n530TBM21_OUTER_STUDY_ID, T000G4_A531TBM21_PROC_NM, T000G4_n531TBM21_PROC_NM, T000G4_A368TBM21_NOTE, T000G4_n368TBM21_NOTE, T000G4_A607TBM21_STATUS,
            T000G4_n607TBM21_STATUS, T000G4_A369TBM21_DEL_FLG, T000G4_n369TBM21_DEL_FLG, T000G4_A372TBM21_CRT_PROG_NM, T000G4_n372TBM21_CRT_PROG_NM, T000G4_A375TBM21_UPD_PROG_NM, T000G4_n375TBM21_UPD_PROG_NM
            }
            , new Object[] {
            T000G5_A63TBM21_STUDY_ID
            }
            , new Object[] {
            T000G6_A63TBM21_STUDY_ID
            }
            , new Object[] {
            T000G7_A63TBM21_STUDY_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000G11_A107TBM23_STUDY_ID, T000G11_A108TBM23_USER_ID, T000G11_A109TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            T000G12_A68TBM31_STUDY_ID, T000G12_A69TBM31_CRF_ID
            }
            , new Object[] {
            T000G13_A64TBM24_STUDY_ID, T000G13_A65TBM24_DOM_CD, T000G13_A66TBM24_DOM_VAR_NM, T000G13_A67TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            T000G14_A23TBM25_STUDY_ID, T000G14_A24TBM25_LIST_CD
            }
            , new Object[] {
            T000G15_A17TBM22_STUDY_ID, T000G15_A18TBM22_SITE_ID
            }
            , new Object[] {
            T000G16_A63TBM21_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM21_STUDY" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound15 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM21_STUDY_ID_Enabled ;
   private int edtTBM21_STUDY_NM_Enabled ;
   private int edtTBM21_OUTER_STUDY_ID_Enabled ;
   private int edtTBM21_PROC_NM_Enabled ;
   private int edtTBM21_NOTE_Enabled ;
   private int edtTBM21_STATUS_Enabled ;
   private int edtTBM21_DEL_FLG_Enabled ;
   private int edtTBM21_CRT_DATETIME_Enabled ;
   private int edtTBM21_CRT_USER_ID_Enabled ;
   private int edtTBM21_CRT_PROG_NM_Enabled ;
   private int edtTBM21_UPD_DATETIME_Enabled ;
   private int edtTBM21_UPD_USER_ID_Enabled ;
   private int edtTBM21_UPD_PROG_NM_Enabled ;
   private int edtTBM21_UPD_CNT_Enabled ;
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
   private long Z63TBM21_STUDY_ID ;
   private long Z376TBM21_UPD_CNT ;
   private long O376TBM21_UPD_CNT ;
   private long A63TBM21_STUDY_ID ;
   private long A376TBM21_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM21_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm21_study_id_Internalname ;
   private String lblTextblocktbm21_study_id_Jsonclick ;
   private String edtTBM21_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm21_study_nm_Internalname ;
   private String lblTextblocktbm21_study_nm_Jsonclick ;
   private String edtTBM21_STUDY_NM_Internalname ;
   private String edtTBM21_STUDY_NM_Jsonclick ;
   private String lblTextblocktbm21_outer_study_id_Internalname ;
   private String lblTextblocktbm21_outer_study_id_Jsonclick ;
   private String edtTBM21_OUTER_STUDY_ID_Internalname ;
   private String edtTBM21_OUTER_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm21_proc_nm_Internalname ;
   private String lblTextblocktbm21_proc_nm_Jsonclick ;
   private String edtTBM21_PROC_NM_Internalname ;
   private String edtTBM21_PROC_NM_Jsonclick ;
   private String lblTextblocktbm21_note_Internalname ;
   private String lblTextblocktbm21_note_Jsonclick ;
   private String edtTBM21_NOTE_Internalname ;
   private String lblTextblocktbm21_status_Internalname ;
   private String lblTextblocktbm21_status_Jsonclick ;
   private String edtTBM21_STATUS_Internalname ;
   private String edtTBM21_STATUS_Jsonclick ;
   private String lblTextblocktbm21_del_flg_Internalname ;
   private String lblTextblocktbm21_del_flg_Jsonclick ;
   private String edtTBM21_DEL_FLG_Internalname ;
   private String edtTBM21_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm21_crt_datetime_Internalname ;
   private String lblTextblocktbm21_crt_datetime_Jsonclick ;
   private String edtTBM21_CRT_DATETIME_Internalname ;
   private String edtTBM21_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm21_crt_user_id_Internalname ;
   private String lblTextblocktbm21_crt_user_id_Jsonclick ;
   private String edtTBM21_CRT_USER_ID_Internalname ;
   private String edtTBM21_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm21_crt_prog_nm_Internalname ;
   private String lblTextblocktbm21_crt_prog_nm_Jsonclick ;
   private String edtTBM21_CRT_PROG_NM_Internalname ;
   private String edtTBM21_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm21_upd_datetime_Internalname ;
   private String lblTextblocktbm21_upd_datetime_Jsonclick ;
   private String edtTBM21_UPD_DATETIME_Internalname ;
   private String edtTBM21_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm21_upd_user_id_Internalname ;
   private String lblTextblocktbm21_upd_user_id_Jsonclick ;
   private String edtTBM21_UPD_USER_ID_Internalname ;
   private String edtTBM21_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm21_upd_prog_nm_Internalname ;
   private String lblTextblocktbm21_upd_prog_nm_Jsonclick ;
   private String edtTBM21_UPD_PROG_NM_Internalname ;
   private String edtTBM21_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm21_upd_cnt_Internalname ;
   private String lblTextblocktbm21_upd_cnt_Jsonclick ;
   private String edtTBM21_UPD_CNT_Internalname ;
   private String edtTBM21_UPD_CNT_Jsonclick ;
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
   private String sMode15 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z370TBM21_CRT_DATETIME ;
   private java.util.Date Z373TBM21_UPD_DATETIME ;
   private java.util.Date A370TBM21_CRT_DATETIME ;
   private java.util.Date A373TBM21_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n367TBM21_STUDY_NM ;
   private boolean n530TBM21_OUTER_STUDY_ID ;
   private boolean n531TBM21_PROC_NM ;
   private boolean n368TBM21_NOTE ;
   private boolean n607TBM21_STATUS ;
   private boolean n369TBM21_DEL_FLG ;
   private boolean n370TBM21_CRT_DATETIME ;
   private boolean n371TBM21_CRT_USER_ID ;
   private boolean n372TBM21_CRT_PROG_NM ;
   private boolean n373TBM21_UPD_DATETIME ;
   private boolean n374TBM21_UPD_USER_ID ;
   private boolean n375TBM21_UPD_PROG_NM ;
   private boolean n376TBM21_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z371TBM21_CRT_USER_ID ;
   private String Z374TBM21_UPD_USER_ID ;
   private String Z367TBM21_STUDY_NM ;
   private String Z530TBM21_OUTER_STUDY_ID ;
   private String Z531TBM21_PROC_NM ;
   private String Z368TBM21_NOTE ;
   private String Z607TBM21_STATUS ;
   private String Z369TBM21_DEL_FLG ;
   private String Z372TBM21_CRT_PROG_NM ;
   private String Z375TBM21_UPD_PROG_NM ;
   private String A367TBM21_STUDY_NM ;
   private String A530TBM21_OUTER_STUDY_ID ;
   private String A531TBM21_PROC_NM ;
   private String A368TBM21_NOTE ;
   private String A607TBM21_STATUS ;
   private String A369TBM21_DEL_FLG ;
   private String A371TBM21_CRT_USER_ID ;
   private String A372TBM21_CRT_PROG_NM ;
   private String A374TBM21_UPD_USER_ID ;
   private String A375TBM21_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000G4_A63TBM21_STUDY_ID ;
   private java.util.Date[] T000G4_A370TBM21_CRT_DATETIME ;
   private boolean[] T000G4_n370TBM21_CRT_DATETIME ;
   private String[] T000G4_A371TBM21_CRT_USER_ID ;
   private boolean[] T000G4_n371TBM21_CRT_USER_ID ;
   private java.util.Date[] T000G4_A373TBM21_UPD_DATETIME ;
   private boolean[] T000G4_n373TBM21_UPD_DATETIME ;
   private String[] T000G4_A374TBM21_UPD_USER_ID ;
   private boolean[] T000G4_n374TBM21_UPD_USER_ID ;
   private long[] T000G4_A376TBM21_UPD_CNT ;
   private boolean[] T000G4_n376TBM21_UPD_CNT ;
   private String[] T000G4_A367TBM21_STUDY_NM ;
   private boolean[] T000G4_n367TBM21_STUDY_NM ;
   private String[] T000G4_A530TBM21_OUTER_STUDY_ID ;
   private boolean[] T000G4_n530TBM21_OUTER_STUDY_ID ;
   private String[] T000G4_A531TBM21_PROC_NM ;
   private boolean[] T000G4_n531TBM21_PROC_NM ;
   private String[] T000G4_A368TBM21_NOTE ;
   private boolean[] T000G4_n368TBM21_NOTE ;
   private String[] T000G4_A607TBM21_STATUS ;
   private boolean[] T000G4_n607TBM21_STATUS ;
   private String[] T000G4_A369TBM21_DEL_FLG ;
   private boolean[] T000G4_n369TBM21_DEL_FLG ;
   private String[] T000G4_A372TBM21_CRT_PROG_NM ;
   private boolean[] T000G4_n372TBM21_CRT_PROG_NM ;
   private String[] T000G4_A375TBM21_UPD_PROG_NM ;
   private boolean[] T000G4_n375TBM21_UPD_PROG_NM ;
   private long[] T000G5_A63TBM21_STUDY_ID ;
   private long[] T000G3_A63TBM21_STUDY_ID ;
   private java.util.Date[] T000G3_A370TBM21_CRT_DATETIME ;
   private boolean[] T000G3_n370TBM21_CRT_DATETIME ;
   private String[] T000G3_A371TBM21_CRT_USER_ID ;
   private boolean[] T000G3_n371TBM21_CRT_USER_ID ;
   private java.util.Date[] T000G3_A373TBM21_UPD_DATETIME ;
   private boolean[] T000G3_n373TBM21_UPD_DATETIME ;
   private String[] T000G3_A374TBM21_UPD_USER_ID ;
   private boolean[] T000G3_n374TBM21_UPD_USER_ID ;
   private long[] T000G3_A376TBM21_UPD_CNT ;
   private boolean[] T000G3_n376TBM21_UPD_CNT ;
   private String[] T000G3_A367TBM21_STUDY_NM ;
   private boolean[] T000G3_n367TBM21_STUDY_NM ;
   private String[] T000G3_A530TBM21_OUTER_STUDY_ID ;
   private boolean[] T000G3_n530TBM21_OUTER_STUDY_ID ;
   private String[] T000G3_A531TBM21_PROC_NM ;
   private boolean[] T000G3_n531TBM21_PROC_NM ;
   private String[] T000G3_A368TBM21_NOTE ;
   private boolean[] T000G3_n368TBM21_NOTE ;
   private String[] T000G3_A607TBM21_STATUS ;
   private boolean[] T000G3_n607TBM21_STATUS ;
   private String[] T000G3_A369TBM21_DEL_FLG ;
   private boolean[] T000G3_n369TBM21_DEL_FLG ;
   private String[] T000G3_A372TBM21_CRT_PROG_NM ;
   private boolean[] T000G3_n372TBM21_CRT_PROG_NM ;
   private String[] T000G3_A375TBM21_UPD_PROG_NM ;
   private boolean[] T000G3_n375TBM21_UPD_PROG_NM ;
   private long[] T000G6_A63TBM21_STUDY_ID ;
   private long[] T000G7_A63TBM21_STUDY_ID ;
   private long[] T000G2_A63TBM21_STUDY_ID ;
   private java.util.Date[] T000G2_A370TBM21_CRT_DATETIME ;
   private boolean[] T000G2_n370TBM21_CRT_DATETIME ;
   private String[] T000G2_A371TBM21_CRT_USER_ID ;
   private boolean[] T000G2_n371TBM21_CRT_USER_ID ;
   private java.util.Date[] T000G2_A373TBM21_UPD_DATETIME ;
   private boolean[] T000G2_n373TBM21_UPD_DATETIME ;
   private String[] T000G2_A374TBM21_UPD_USER_ID ;
   private boolean[] T000G2_n374TBM21_UPD_USER_ID ;
   private long[] T000G2_A376TBM21_UPD_CNT ;
   private boolean[] T000G2_n376TBM21_UPD_CNT ;
   private String[] T000G2_A367TBM21_STUDY_NM ;
   private boolean[] T000G2_n367TBM21_STUDY_NM ;
   private String[] T000G2_A530TBM21_OUTER_STUDY_ID ;
   private boolean[] T000G2_n530TBM21_OUTER_STUDY_ID ;
   private String[] T000G2_A531TBM21_PROC_NM ;
   private boolean[] T000G2_n531TBM21_PROC_NM ;
   private String[] T000G2_A368TBM21_NOTE ;
   private boolean[] T000G2_n368TBM21_NOTE ;
   private String[] T000G2_A607TBM21_STATUS ;
   private boolean[] T000G2_n607TBM21_STATUS ;
   private String[] T000G2_A369TBM21_DEL_FLG ;
   private boolean[] T000G2_n369TBM21_DEL_FLG ;
   private String[] T000G2_A372TBM21_CRT_PROG_NM ;
   private boolean[] T000G2_n372TBM21_CRT_PROG_NM ;
   private String[] T000G2_A375TBM21_UPD_PROG_NM ;
   private boolean[] T000G2_n375TBM21_UPD_PROG_NM ;
   private long[] T000G11_A107TBM23_STUDY_ID ;
   private String[] T000G11_A108TBM23_USER_ID ;
   private String[] T000G11_A109TBM23_STYDY_AUTH_CD ;
   private long[] T000G12_A68TBM31_STUDY_ID ;
   private short[] T000G12_A69TBM31_CRF_ID ;
   private long[] T000G13_A64TBM24_STUDY_ID ;
   private String[] T000G13_A65TBM24_DOM_CD ;
   private String[] T000G13_A66TBM24_DOM_VAR_NM ;
   private String[] T000G13_A67TBM24_CRF_ITEM_DIV ;
   private long[] T000G14_A23TBM25_STUDY_ID ;
   private String[] T000G14_A24TBM25_LIST_CD ;
   private long[] T000G15_A17TBM22_STUDY_ID ;
   private String[] T000G15_A18TBM22_SITE_ID ;
   private long[] T000G16_A63TBM21_STUDY_ID ;
}

final  class tbm21_study__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000G2", "SELECT `TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000G3", "SELECT `TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000G4", "SELECT TM1.`TBM21_STUDY_ID`, TM1.`TBM21_CRT_DATETIME`, TM1.`TBM21_CRT_USER_ID`, TM1.`TBM21_UPD_DATETIME`, TM1.`TBM21_UPD_USER_ID`, TM1.`TBM21_UPD_CNT`, TM1.`TBM21_STUDY_NM`, TM1.`TBM21_OUTER_STUDY_ID`, TM1.`TBM21_PROC_NM`, TM1.`TBM21_NOTE`, TM1.`TBM21_STATUS`, TM1.`TBM21_DEL_FLG`, TM1.`TBM21_CRT_PROG_NM`, TM1.`TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` TM1 WHERE TM1.`TBM21_STUDY_ID` = ? ORDER BY TM1.`TBM21_STUDY_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000G5", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000G6", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE ( `TBM21_STUDY_ID` > ?) ORDER BY `TBM21_STUDY_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G7", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE ( `TBM21_STUDY_ID` < ?) ORDER BY `TBM21_STUDY_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000G8", "INSERT INTO `TBM21_STUDY`(`TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000G9", "UPDATE `TBM21_STUDY` SET `TBM21_CRT_DATETIME`=?, `TBM21_CRT_USER_ID`=?, `TBM21_UPD_DATETIME`=?, `TBM21_UPD_USER_ID`=?, `TBM21_UPD_CNT`=?, `TBM21_STUDY_NM`=?, `TBM21_OUTER_STUDY_ID`=?, `TBM21_PROC_NM`=?, `TBM21_NOTE`=?, `TBM21_STATUS`=?, `TBM21_DEL_FLG`=?, `TBM21_CRT_PROG_NM`=?, `TBM21_UPD_PROG_NM`=?  WHERE `TBM21_STUDY_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000G10", "DELETE FROM `TBM21_STUDY`  WHERE `TBM21_STUDY_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000G11", "SELECT `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G12", "SELECT `TBM31_STUDY_ID`, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G13", "SELECT `TBM24_STUDY_ID`, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G14", "SELECT `TBM25_STUDY_ID`, `TBM25_LIST_CD` FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G15", "SELECT `TBM22_STUDY_ID`, `TBM22_SITE_ID` FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G16", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` ORDER BY `TBM21_STUDY_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               return;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
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
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 20);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 100);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 1000);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 1);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 40);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 100);
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
                  stmt.setVarchar(8, (String)parms[15], 100);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 40);
               }
               stmt.setLong(14, ((Number) parms[26]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

