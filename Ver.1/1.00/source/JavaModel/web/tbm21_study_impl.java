/*
               File: tbm21_study_impl
        Description: 試験マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:25.13
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
      Form.getMeta().addItem("Description", "試験マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"試験マスタ"+"</legend>") ;
         wb_table3_27_0G15( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0G15e( boolean wbgen )
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

   public void wb_table3_27_0G15( boolean wbgen )
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
         wb_table4_33_0G15( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0G15e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM21_STUDY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM21_STUDY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0G15e( true) ;
      }
      else
      {
         wb_table3_27_0G15e( false) ;
      }
   }

   public void wb_table4_33_0G15( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_study_id_Internalname, "試験ID", "", "", lblTextblocktbm21_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A186TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM21_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A186TBM21_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A186TBM21_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM21_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_study_nm_Internalname, "試験名", "", "", lblTextblocktbm21_study_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_STUDY_NM_Internalname, GXutil.rtrim( A187TBM21_STUDY_NM), GXutil.rtrim( localUtil.format( A187TBM21_STUDY_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM21_STUDY_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_STUDY_NM_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_outer_study_id_Internalname, "外部試験ID", "", "", lblTextblocktbm21_outer_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A408TBM21_OUTER_STUDY_ID", A408TBM21_OUTER_STUDY_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_OUTER_STUDY_ID_Internalname, GXutil.rtrim( A408TBM21_OUTER_STUDY_ID), GXutil.rtrim( localUtil.format( A408TBM21_OUTER_STUDY_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM21_OUTER_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_OUTER_STUDY_ID_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_proc_nm_Internalname, "プロトコール名", "", "", lblTextblocktbm21_proc_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A409TBM21_PROC_NM", A409TBM21_PROC_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_PROC_NM_Internalname, GXutil.rtrim( A409TBM21_PROC_NM), GXutil.rtrim( localUtil.format( A409TBM21_PROC_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM21_PROC_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_PROC_NM_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_note_Internalname, "備考", "", "", lblTextblocktbm21_note_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A188TBM21_NOTE", A188TBM21_NOTE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM21_NOTE_Internalname, GXutil.rtrim( A188TBM21_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", (short)(0), 1, edtTBM21_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "1000", -1, "", true, "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_status_Internalname, "状態", "", "", lblTextblocktbm21_status_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A513TBM21_STATUS", A513TBM21_STATUS);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_STATUS_Internalname, GXutil.rtrim( A513TBM21_STATUS), GXutil.rtrim( localUtil.format( A513TBM21_STATUS, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM21_STATUS_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_STATUS_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm21_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_DEL_FLG_Internalname, GXutil.rtrim( A189TBM21_DEL_FLG), GXutil.rtrim( localUtil.format( A189TBM21_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM21_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm21_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A190TBM21_CRT_DATETIME", localUtil.ttoc( A190TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM21_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_CRT_DATETIME_Internalname, localUtil.format(A190TBM21_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A190TBM21_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM21_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM21_STUDY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM21_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM21_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM21_STUDY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm21_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A191TBM21_CRT_USER_ID", A191TBM21_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_CRT_USER_ID_Internalname, GXutil.rtrim( A191TBM21_CRT_USER_ID), GXutil.rtrim( localUtil.format( A191TBM21_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM21_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm21_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A192TBM21_CRT_PROG_NM", A192TBM21_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_CRT_PROG_NM_Internalname, GXutil.rtrim( A192TBM21_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A192TBM21_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM21_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm21_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A193TBM21_UPD_DATETIME", localUtil.ttoc( A193TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM21_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_UPD_DATETIME_Internalname, localUtil.format(A193TBM21_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A193TBM21_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM21_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM21_STUDY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM21_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM21_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM21_STUDY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm21_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A194TBM21_UPD_USER_ID", A194TBM21_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_UPD_USER_ID_Internalname, GXutil.rtrim( A194TBM21_UPD_USER_ID), GXutil.rtrim( localUtil.format( A194TBM21_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM21_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm21_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A195TBM21_UPD_PROG_NM", A195TBM21_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_UPD_PROG_NM_Internalname, GXutil.rtrim( A195TBM21_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A195TBM21_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTBM21_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm21_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm21_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A196TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM21_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A196TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM21_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A196TBM21_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A196TBM21_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(103);\"", "", "", "", "", edtTBM21_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM21_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM21_STUDY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0G15e( true) ;
      }
      else
      {
         wb_table4_33_0G15e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM21_STUDY.htm");
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
               A186TBM21_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
            }
            else
            {
               A186TBM21_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM21_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
            }
            A187TBM21_STUDY_NM = httpContext.cgiGet( edtTBM21_STUDY_NM_Internalname) ;
            n187TBM21_STUDY_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
            n187TBM21_STUDY_NM = ((GXutil.strcmp("", A187TBM21_STUDY_NM)==0) ? true : false) ;
            A408TBM21_OUTER_STUDY_ID = httpContext.cgiGet( edtTBM21_OUTER_STUDY_ID_Internalname) ;
            n408TBM21_OUTER_STUDY_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A408TBM21_OUTER_STUDY_ID", A408TBM21_OUTER_STUDY_ID);
            n408TBM21_OUTER_STUDY_ID = ((GXutil.strcmp("", A408TBM21_OUTER_STUDY_ID)==0) ? true : false) ;
            A409TBM21_PROC_NM = httpContext.cgiGet( edtTBM21_PROC_NM_Internalname) ;
            n409TBM21_PROC_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A409TBM21_PROC_NM", A409TBM21_PROC_NM);
            n409TBM21_PROC_NM = ((GXutil.strcmp("", A409TBM21_PROC_NM)==0) ? true : false) ;
            A188TBM21_NOTE = httpContext.cgiGet( edtTBM21_NOTE_Internalname) ;
            n188TBM21_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A188TBM21_NOTE", A188TBM21_NOTE);
            n188TBM21_NOTE = ((GXutil.strcmp("", A188TBM21_NOTE)==0) ? true : false) ;
            A513TBM21_STATUS = httpContext.cgiGet( edtTBM21_STATUS_Internalname) ;
            n513TBM21_STATUS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A513TBM21_STATUS", A513TBM21_STATUS);
            n513TBM21_STATUS = ((GXutil.strcmp("", A513TBM21_STATUS)==0) ? true : false) ;
            A189TBM21_DEL_FLG = httpContext.cgiGet( edtTBM21_DEL_FLG_Internalname) ;
            n189TBM21_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
            n189TBM21_DEL_FLG = ((GXutil.strcmp("", A189TBM21_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM21_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM21_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM21_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A190TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n190TBM21_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A190TBM21_CRT_DATETIME", localUtil.ttoc( A190TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A190TBM21_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM21_CRT_DATETIME_Internalname)) ;
               n190TBM21_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A190TBM21_CRT_DATETIME", localUtil.ttoc( A190TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n190TBM21_CRT_DATETIME = (GXutil.nullDate().equals(A190TBM21_CRT_DATETIME) ? true : false) ;
            A191TBM21_CRT_USER_ID = httpContext.cgiGet( edtTBM21_CRT_USER_ID_Internalname) ;
            n191TBM21_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A191TBM21_CRT_USER_ID", A191TBM21_CRT_USER_ID);
            n191TBM21_CRT_USER_ID = ((GXutil.strcmp("", A191TBM21_CRT_USER_ID)==0) ? true : false) ;
            A192TBM21_CRT_PROG_NM = httpContext.cgiGet( edtTBM21_CRT_PROG_NM_Internalname) ;
            n192TBM21_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A192TBM21_CRT_PROG_NM", A192TBM21_CRT_PROG_NM);
            n192TBM21_CRT_PROG_NM = ((GXutil.strcmp("", A192TBM21_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM21_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM21_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM21_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A193TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n193TBM21_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A193TBM21_UPD_DATETIME", localUtil.ttoc( A193TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A193TBM21_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM21_UPD_DATETIME_Internalname)) ;
               n193TBM21_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A193TBM21_UPD_DATETIME", localUtil.ttoc( A193TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n193TBM21_UPD_DATETIME = (GXutil.nullDate().equals(A193TBM21_UPD_DATETIME) ? true : false) ;
            A194TBM21_UPD_USER_ID = httpContext.cgiGet( edtTBM21_UPD_USER_ID_Internalname) ;
            n194TBM21_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A194TBM21_UPD_USER_ID", A194TBM21_UPD_USER_ID);
            n194TBM21_UPD_USER_ID = ((GXutil.strcmp("", A194TBM21_UPD_USER_ID)==0) ? true : false) ;
            A195TBM21_UPD_PROG_NM = httpContext.cgiGet( edtTBM21_UPD_PROG_NM_Internalname) ;
            n195TBM21_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A195TBM21_UPD_PROG_NM", A195TBM21_UPD_PROG_NM);
            n195TBM21_UPD_PROG_NM = ((GXutil.strcmp("", A195TBM21_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM21_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM21_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM21_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM21_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A196TBM21_UPD_CNT = 0 ;
               n196TBM21_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A196TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)));
            }
            else
            {
               A196TBM21_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM21_UPD_CNT_Internalname), ".", ",") ;
               n196TBM21_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A196TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)));
            }
            n196TBM21_UPD_CNT = ((0==A196TBM21_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z186TBM21_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z186TBM21_STUDY_ID"), ".", ",") ;
            Z190TBM21_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z190TBM21_CRT_DATETIME"), 0) ;
            n190TBM21_CRT_DATETIME = (GXutil.nullDate().equals(A190TBM21_CRT_DATETIME) ? true : false) ;
            Z191TBM21_CRT_USER_ID = httpContext.cgiGet( "Z191TBM21_CRT_USER_ID") ;
            n191TBM21_CRT_USER_ID = ((GXutil.strcmp("", A191TBM21_CRT_USER_ID)==0) ? true : false) ;
            Z193TBM21_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z193TBM21_UPD_DATETIME"), 0) ;
            n193TBM21_UPD_DATETIME = (GXutil.nullDate().equals(A193TBM21_UPD_DATETIME) ? true : false) ;
            Z194TBM21_UPD_USER_ID = httpContext.cgiGet( "Z194TBM21_UPD_USER_ID") ;
            n194TBM21_UPD_USER_ID = ((GXutil.strcmp("", A194TBM21_UPD_USER_ID)==0) ? true : false) ;
            Z196TBM21_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z196TBM21_UPD_CNT"), ".", ",") ;
            n196TBM21_UPD_CNT = ((0==A196TBM21_UPD_CNT) ? true : false) ;
            Z187TBM21_STUDY_NM = httpContext.cgiGet( "Z187TBM21_STUDY_NM") ;
            n187TBM21_STUDY_NM = ((GXutil.strcmp("", A187TBM21_STUDY_NM)==0) ? true : false) ;
            Z408TBM21_OUTER_STUDY_ID = httpContext.cgiGet( "Z408TBM21_OUTER_STUDY_ID") ;
            n408TBM21_OUTER_STUDY_ID = ((GXutil.strcmp("", A408TBM21_OUTER_STUDY_ID)==0) ? true : false) ;
            Z409TBM21_PROC_NM = httpContext.cgiGet( "Z409TBM21_PROC_NM") ;
            n409TBM21_PROC_NM = ((GXutil.strcmp("", A409TBM21_PROC_NM)==0) ? true : false) ;
            Z188TBM21_NOTE = httpContext.cgiGet( "Z188TBM21_NOTE") ;
            n188TBM21_NOTE = ((GXutil.strcmp("", A188TBM21_NOTE)==0) ? true : false) ;
            Z513TBM21_STATUS = httpContext.cgiGet( "Z513TBM21_STATUS") ;
            n513TBM21_STATUS = ((GXutil.strcmp("", A513TBM21_STATUS)==0) ? true : false) ;
            Z189TBM21_DEL_FLG = httpContext.cgiGet( "Z189TBM21_DEL_FLG") ;
            n189TBM21_DEL_FLG = ((GXutil.strcmp("", A189TBM21_DEL_FLG)==0) ? true : false) ;
            Z192TBM21_CRT_PROG_NM = httpContext.cgiGet( "Z192TBM21_CRT_PROG_NM") ;
            n192TBM21_CRT_PROG_NM = ((GXutil.strcmp("", A192TBM21_CRT_PROG_NM)==0) ? true : false) ;
            Z195TBM21_UPD_PROG_NM = httpContext.cgiGet( "Z195TBM21_UPD_PROG_NM") ;
            n195TBM21_UPD_PROG_NM = ((GXutil.strcmp("", A195TBM21_UPD_PROG_NM)==0) ? true : false) ;
            O196TBM21_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O196TBM21_UPD_CNT"), ".", ",") ;
            n196TBM21_UPD_CNT = ((0==A196TBM21_UPD_CNT) ? true : false) ;
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
               A186TBM21_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120G2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A187TBM21_STUDY_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A408TBM21_OUTER_STUDY_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A409TBM21_PROC_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A188TBM21_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A189TBM21_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A190TBM21_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm21_study_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A190TBM21_CRT_DATETIME", localUtil.ttoc( A190TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A191TBM21_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A192TBM21_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A193TBM21_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm21_study_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A193TBM21_UPD_DATETIME", localUtil.ttoc( A193TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A194TBM21_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A195TBM21_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1166( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0G15( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z190TBM21_CRT_DATETIME = T000G3_A190TBM21_CRT_DATETIME[0] ;
            Z191TBM21_CRT_USER_ID = T000G3_A191TBM21_CRT_USER_ID[0] ;
            Z193TBM21_UPD_DATETIME = T000G3_A193TBM21_UPD_DATETIME[0] ;
            Z194TBM21_UPD_USER_ID = T000G3_A194TBM21_UPD_USER_ID[0] ;
            Z196TBM21_UPD_CNT = T000G3_A196TBM21_UPD_CNT[0] ;
            Z187TBM21_STUDY_NM = T000G3_A187TBM21_STUDY_NM[0] ;
            Z408TBM21_OUTER_STUDY_ID = T000G3_A408TBM21_OUTER_STUDY_ID[0] ;
            Z409TBM21_PROC_NM = T000G3_A409TBM21_PROC_NM[0] ;
            Z188TBM21_NOTE = T000G3_A188TBM21_NOTE[0] ;
            Z513TBM21_STATUS = T000G3_A513TBM21_STATUS[0] ;
            Z189TBM21_DEL_FLG = T000G3_A189TBM21_DEL_FLG[0] ;
            Z192TBM21_CRT_PROG_NM = T000G3_A192TBM21_CRT_PROG_NM[0] ;
            Z195TBM21_UPD_PROG_NM = T000G3_A195TBM21_UPD_PROG_NM[0] ;
         }
         else
         {
            Z190TBM21_CRT_DATETIME = A190TBM21_CRT_DATETIME ;
            Z191TBM21_CRT_USER_ID = A191TBM21_CRT_USER_ID ;
            Z193TBM21_UPD_DATETIME = A193TBM21_UPD_DATETIME ;
            Z194TBM21_UPD_USER_ID = A194TBM21_UPD_USER_ID ;
            Z196TBM21_UPD_CNT = A196TBM21_UPD_CNT ;
            Z187TBM21_STUDY_NM = A187TBM21_STUDY_NM ;
            Z408TBM21_OUTER_STUDY_ID = A408TBM21_OUTER_STUDY_ID ;
            Z409TBM21_PROC_NM = A409TBM21_PROC_NM ;
            Z188TBM21_NOTE = A188TBM21_NOTE ;
            Z513TBM21_STATUS = A513TBM21_STATUS ;
            Z189TBM21_DEL_FLG = A189TBM21_DEL_FLG ;
            Z192TBM21_CRT_PROG_NM = A192TBM21_CRT_PROG_NM ;
            Z195TBM21_UPD_PROG_NM = A195TBM21_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z186TBM21_STUDY_ID = A186TBM21_STUDY_ID ;
         Z190TBM21_CRT_DATETIME = A190TBM21_CRT_DATETIME ;
         Z191TBM21_CRT_USER_ID = A191TBM21_CRT_USER_ID ;
         Z193TBM21_UPD_DATETIME = A193TBM21_UPD_DATETIME ;
         Z194TBM21_UPD_USER_ID = A194TBM21_UPD_USER_ID ;
         Z196TBM21_UPD_CNT = A196TBM21_UPD_CNT ;
         Z187TBM21_STUDY_NM = A187TBM21_STUDY_NM ;
         Z408TBM21_OUTER_STUDY_ID = A408TBM21_OUTER_STUDY_ID ;
         Z409TBM21_PROC_NM = A409TBM21_PROC_NM ;
         Z188TBM21_NOTE = A188TBM21_NOTE ;
         Z513TBM21_STATUS = A513TBM21_STATUS ;
         Z189TBM21_DEL_FLG = A189TBM21_DEL_FLG ;
         Z192TBM21_CRT_PROG_NM = A192TBM21_CRT_PROG_NM ;
         Z195TBM21_UPD_PROG_NM = A195TBM21_UPD_PROG_NM ;
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
      pr_default.execute(2, new Object[] {new Long(A186TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A190TBM21_CRT_DATETIME = T000G4_A190TBM21_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A190TBM21_CRT_DATETIME", localUtil.ttoc( A190TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n190TBM21_CRT_DATETIME = T000G4_n190TBM21_CRT_DATETIME[0] ;
         A191TBM21_CRT_USER_ID = T000G4_A191TBM21_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191TBM21_CRT_USER_ID", A191TBM21_CRT_USER_ID);
         n191TBM21_CRT_USER_ID = T000G4_n191TBM21_CRT_USER_ID[0] ;
         A193TBM21_UPD_DATETIME = T000G4_A193TBM21_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A193TBM21_UPD_DATETIME", localUtil.ttoc( A193TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n193TBM21_UPD_DATETIME = T000G4_n193TBM21_UPD_DATETIME[0] ;
         A194TBM21_UPD_USER_ID = T000G4_A194TBM21_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194TBM21_UPD_USER_ID", A194TBM21_UPD_USER_ID);
         n194TBM21_UPD_USER_ID = T000G4_n194TBM21_UPD_USER_ID[0] ;
         A196TBM21_UPD_CNT = T000G4_A196TBM21_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A196TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)));
         n196TBM21_UPD_CNT = T000G4_n196TBM21_UPD_CNT[0] ;
         A187TBM21_STUDY_NM = T000G4_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = T000G4_n187TBM21_STUDY_NM[0] ;
         A408TBM21_OUTER_STUDY_ID = T000G4_A408TBM21_OUTER_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A408TBM21_OUTER_STUDY_ID", A408TBM21_OUTER_STUDY_ID);
         n408TBM21_OUTER_STUDY_ID = T000G4_n408TBM21_OUTER_STUDY_ID[0] ;
         A409TBM21_PROC_NM = T000G4_A409TBM21_PROC_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A409TBM21_PROC_NM", A409TBM21_PROC_NM);
         n409TBM21_PROC_NM = T000G4_n409TBM21_PROC_NM[0] ;
         A188TBM21_NOTE = T000G4_A188TBM21_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A188TBM21_NOTE", A188TBM21_NOTE);
         n188TBM21_NOTE = T000G4_n188TBM21_NOTE[0] ;
         A513TBM21_STATUS = T000G4_A513TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513TBM21_STATUS", A513TBM21_STATUS);
         n513TBM21_STATUS = T000G4_n513TBM21_STATUS[0] ;
         A189TBM21_DEL_FLG = T000G4_A189TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
         n189TBM21_DEL_FLG = T000G4_n189TBM21_DEL_FLG[0] ;
         A192TBM21_CRT_PROG_NM = T000G4_A192TBM21_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192TBM21_CRT_PROG_NM", A192TBM21_CRT_PROG_NM);
         n192TBM21_CRT_PROG_NM = T000G4_n192TBM21_CRT_PROG_NM[0] ;
         A195TBM21_UPD_PROG_NM = T000G4_A195TBM21_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A195TBM21_UPD_PROG_NM", A195TBM21_UPD_PROG_NM);
         n195TBM21_UPD_PROG_NM = T000G4_n195TBM21_UPD_PROG_NM[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A190TBM21_CRT_DATETIME) || (( A190TBM21_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A190TBM21_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A193TBM21_UPD_DATETIME) || (( A193TBM21_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A193TBM21_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
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
      pr_default.execute(3, new Object[] {new Long(A186TBM21_STUDY_ID)});
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
      pr_default.execute(1, new Object[] {new Long(A186TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0G15( 8) ;
         RcdFound15 = (short)(1) ;
         A186TBM21_STUDY_ID = T000G3_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
         A190TBM21_CRT_DATETIME = T000G3_A190TBM21_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A190TBM21_CRT_DATETIME", localUtil.ttoc( A190TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n190TBM21_CRT_DATETIME = T000G3_n190TBM21_CRT_DATETIME[0] ;
         A191TBM21_CRT_USER_ID = T000G3_A191TBM21_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191TBM21_CRT_USER_ID", A191TBM21_CRT_USER_ID);
         n191TBM21_CRT_USER_ID = T000G3_n191TBM21_CRT_USER_ID[0] ;
         A193TBM21_UPD_DATETIME = T000G3_A193TBM21_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A193TBM21_UPD_DATETIME", localUtil.ttoc( A193TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n193TBM21_UPD_DATETIME = T000G3_n193TBM21_UPD_DATETIME[0] ;
         A194TBM21_UPD_USER_ID = T000G3_A194TBM21_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A194TBM21_UPD_USER_ID", A194TBM21_UPD_USER_ID);
         n194TBM21_UPD_USER_ID = T000G3_n194TBM21_UPD_USER_ID[0] ;
         A196TBM21_UPD_CNT = T000G3_A196TBM21_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A196TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)));
         n196TBM21_UPD_CNT = T000G3_n196TBM21_UPD_CNT[0] ;
         A187TBM21_STUDY_NM = T000G3_A187TBM21_STUDY_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
         n187TBM21_STUDY_NM = T000G3_n187TBM21_STUDY_NM[0] ;
         A408TBM21_OUTER_STUDY_ID = T000G3_A408TBM21_OUTER_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A408TBM21_OUTER_STUDY_ID", A408TBM21_OUTER_STUDY_ID);
         n408TBM21_OUTER_STUDY_ID = T000G3_n408TBM21_OUTER_STUDY_ID[0] ;
         A409TBM21_PROC_NM = T000G3_A409TBM21_PROC_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A409TBM21_PROC_NM", A409TBM21_PROC_NM);
         n409TBM21_PROC_NM = T000G3_n409TBM21_PROC_NM[0] ;
         A188TBM21_NOTE = T000G3_A188TBM21_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A188TBM21_NOTE", A188TBM21_NOTE);
         n188TBM21_NOTE = T000G3_n188TBM21_NOTE[0] ;
         A513TBM21_STATUS = T000G3_A513TBM21_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A513TBM21_STATUS", A513TBM21_STATUS);
         n513TBM21_STATUS = T000G3_n513TBM21_STATUS[0] ;
         A189TBM21_DEL_FLG = T000G3_A189TBM21_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
         n189TBM21_DEL_FLG = T000G3_n189TBM21_DEL_FLG[0] ;
         A192TBM21_CRT_PROG_NM = T000G3_A192TBM21_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A192TBM21_CRT_PROG_NM", A192TBM21_CRT_PROG_NM);
         n192TBM21_CRT_PROG_NM = T000G3_n192TBM21_CRT_PROG_NM[0] ;
         A195TBM21_UPD_PROG_NM = T000G3_A195TBM21_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A195TBM21_UPD_PROG_NM", A195TBM21_UPD_PROG_NM);
         n195TBM21_UPD_PROG_NM = T000G3_n195TBM21_UPD_PROG_NM[0] ;
         O196TBM21_UPD_CNT = A196TBM21_UPD_CNT ;
         n196TBM21_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A196TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)));
         Z186TBM21_STUDY_ID = A186TBM21_STUDY_ID ;
         sMode15 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0G15( ) ;
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
      pr_default.execute(4, new Object[] {new Long(A186TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000G6_A186TBM21_STUDY_ID[0] < A186TBM21_STUDY_ID ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000G6_A186TBM21_STUDY_ID[0] > A186TBM21_STUDY_ID ) ) )
         {
            A186TBM21_STUDY_ID = T000G6_A186TBM21_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound15 = (short)(0) ;
      /* Using cursor T000G7 */
      pr_default.execute(5, new Object[] {new Long(A186TBM21_STUDY_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000G7_A186TBM21_STUDY_ID[0] > A186TBM21_STUDY_ID ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000G7_A186TBM21_STUDY_ID[0] < A186TBM21_STUDY_ID ) ) )
         {
            A186TBM21_STUDY_ID = T000G7_A186TBM21_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
            RcdFound15 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0G15( ) ;
      if ( RcdFound15 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM21_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM21_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( A186TBM21_STUDY_ID != Z186TBM21_STUDY_ID )
         {
            A186TBM21_STUDY_ID = Z186TBM21_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
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
         if ( A186TBM21_STUDY_ID != Z186TBM21_STUDY_ID )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( A186TBM21_STUDY_ID != Z186TBM21_STUDY_ID )
      {
         A186TBM21_STUDY_ID = Z186TBM21_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM21_STUDY_ID");
         AnyError = (short)(1) ;
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
      scanStart0G15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart0G15( ) ;
      if ( RcdFound15 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(0, new Object[] {new Long(A186TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM21_STUDY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z190TBM21_CRT_DATETIME.equals( T000G2_A190TBM21_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z191TBM21_CRT_USER_ID, T000G2_A191TBM21_CRT_USER_ID[0]) != 0 ) || !( Z193TBM21_UPD_DATETIME.equals( T000G2_A193TBM21_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z194TBM21_UPD_USER_ID, T000G2_A194TBM21_UPD_USER_ID[0]) != 0 ) || ( Z196TBM21_UPD_CNT != T000G2_A196TBM21_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z187TBM21_STUDY_NM, T000G2_A187TBM21_STUDY_NM[0]) != 0 ) || ( GXutil.strcmp(Z408TBM21_OUTER_STUDY_ID, T000G2_A408TBM21_OUTER_STUDY_ID[0]) != 0 ) || ( GXutil.strcmp(Z409TBM21_PROC_NM, T000G2_A409TBM21_PROC_NM[0]) != 0 ) || ( GXutil.strcmp(Z188TBM21_NOTE, T000G2_A188TBM21_NOTE[0]) != 0 ) || ( GXutil.strcmp(Z513TBM21_STATUS, T000G2_A513TBM21_STATUS[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z189TBM21_DEL_FLG, T000G2_A189TBM21_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z192TBM21_CRT_PROG_NM, T000G2_A192TBM21_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z195TBM21_UPD_PROG_NM, T000G2_A195TBM21_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(6, new Object[] {new Long(A186TBM21_STUDY_ID), new Boolean(n190TBM21_CRT_DATETIME), A190TBM21_CRT_DATETIME, new Boolean(n191TBM21_CRT_USER_ID), A191TBM21_CRT_USER_ID, new Boolean(n193TBM21_UPD_DATETIME), A193TBM21_UPD_DATETIME, new Boolean(n194TBM21_UPD_USER_ID), A194TBM21_UPD_USER_ID, new Boolean(n196TBM21_UPD_CNT), new Long(A196TBM21_UPD_CNT), new Boolean(n187TBM21_STUDY_NM), A187TBM21_STUDY_NM, new Boolean(n408TBM21_OUTER_STUDY_ID), A408TBM21_OUTER_STUDY_ID, new Boolean(n409TBM21_PROC_NM), A409TBM21_PROC_NM, new Boolean(n188TBM21_NOTE), A188TBM21_NOTE, new Boolean(n513TBM21_STATUS), A513TBM21_STATUS, new Boolean(n189TBM21_DEL_FLG), A189TBM21_DEL_FLG, new Boolean(n192TBM21_CRT_PROG_NM), A192TBM21_CRT_PROG_NM, new Boolean(n195TBM21_UPD_PROG_NM), A195TBM21_UPD_PROG_NM});
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
                  pr_default.execute(7, new Object[] {new Boolean(n190TBM21_CRT_DATETIME), A190TBM21_CRT_DATETIME, new Boolean(n191TBM21_CRT_USER_ID), A191TBM21_CRT_USER_ID, new Boolean(n193TBM21_UPD_DATETIME), A193TBM21_UPD_DATETIME, new Boolean(n194TBM21_UPD_USER_ID), A194TBM21_UPD_USER_ID, new Boolean(n196TBM21_UPD_CNT), new Long(A196TBM21_UPD_CNT), new Boolean(n187TBM21_STUDY_NM), A187TBM21_STUDY_NM, new Boolean(n408TBM21_OUTER_STUDY_ID), A408TBM21_OUTER_STUDY_ID, new Boolean(n409TBM21_PROC_NM), A409TBM21_PROC_NM, new Boolean(n188TBM21_NOTE), A188TBM21_NOTE, new Boolean(n513TBM21_STATUS), A513TBM21_STATUS, new Boolean(n189TBM21_DEL_FLG), A189TBM21_DEL_FLG, new Boolean(n192TBM21_CRT_PROG_NM), A192TBM21_CRT_PROG_NM, new Boolean(n195TBM21_UPD_PROG_NM), A195TBM21_UPD_PROG_NM, new Long(A186TBM21_STUDY_ID)});
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               pr_default.execute(8, new Object[] {new Long(A186TBM21_STUDY_ID)});
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
         pr_default.execute(9, new Object[] {new Long(A186TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"選択リストマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T000G12 */
         pr_default.execute(10, new Object[] {new Long(A186TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"マッピング済部品マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T000G13 */
         pr_default.execute(11, new Object[] {new Long(A186TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRFマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T000G14 */
         pr_default.execute(12, new Object[] {new Long(A186TBM21_STUDY_ID)});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験参加スタッフマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T000G15 */
         pr_default.execute(13, new Object[] {new Long(A186TBM21_STUDY_ID)});
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
      /* Using cursor T000G16 */
      pr_default.execute(14);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A186TBM21_STUDY_ID = T000G16_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0G15( )
   {
      pr_default.readNext(14);
      RcdFound15 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound15 = (short)(1) ;
         A186TBM21_STUDY_ID = T000G16_A186TBM21_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
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
      A190TBM21_CRT_DATETIME = GXutil.now( ) ;
      n190TBM21_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A190TBM21_CRT_DATETIME", localUtil.ttoc( A190TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A191TBM21_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm21_study_impl.this.GXt_char3 = GXv_char4[0] ;
      A191TBM21_CRT_USER_ID = GXt_char3 ;
      n191TBM21_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A191TBM21_CRT_USER_ID", A191TBM21_CRT_USER_ID);
      A193TBM21_UPD_DATETIME = GXutil.now( ) ;
      n193TBM21_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A193TBM21_UPD_DATETIME", localUtil.ttoc( A193TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A194TBM21_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm21_study_impl.this.GXt_char3 = GXv_char4[0] ;
      A194TBM21_UPD_USER_ID = GXt_char3 ;
      n194TBM21_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A194TBM21_UPD_USER_ID", A194TBM21_UPD_USER_ID);
      A196TBM21_UPD_CNT = (long)(O196TBM21_UPD_CNT+1) ;
      n196TBM21_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A196TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0G15( )
   {
      /* Before Update Rules */
      A193TBM21_UPD_DATETIME = GXutil.now( ) ;
      n193TBM21_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A193TBM21_UPD_DATETIME", localUtil.ttoc( A193TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A194TBM21_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm21_study_impl.this.GXt_char3 = GXv_char4[0] ;
      A194TBM21_UPD_USER_ID = GXt_char3 ;
      n194TBM21_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A194TBM21_UPD_USER_ID", A194TBM21_UPD_USER_ID);
      A196TBM21_UPD_CNT = (long)(O196TBM21_UPD_CNT+1) ;
      n196TBM21_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A196TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "試験マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm21_study") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0G15( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z186TBM21_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z186TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z190TBM21_CRT_DATETIME", localUtil.ttoc( Z190TBM21_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z191TBM21_CRT_USER_ID", GXutil.rtrim( Z191TBM21_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z193TBM21_UPD_DATETIME", localUtil.ttoc( Z193TBM21_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z194TBM21_UPD_USER_ID", GXutil.rtrim( Z194TBM21_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z196TBM21_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z196TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z187TBM21_STUDY_NM", GXutil.rtrim( Z187TBM21_STUDY_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z408TBM21_OUTER_STUDY_ID", GXutil.rtrim( Z408TBM21_OUTER_STUDY_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z409TBM21_PROC_NM", GXutil.rtrim( Z409TBM21_PROC_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z188TBM21_NOTE", GXutil.rtrim( Z188TBM21_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z513TBM21_STATUS", GXutil.rtrim( Z513TBM21_STATUS));
      GxWebStd.gx_hidden_field( httpContext, "Z189TBM21_DEL_FLG", GXutil.rtrim( Z189TBM21_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z192TBM21_CRT_PROG_NM", GXutil.rtrim( Z192TBM21_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z195TBM21_UPD_PROG_NM", GXutil.rtrim( Z195TBM21_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O196TBM21_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O196TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0G15( )
   {
      A190TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n190TBM21_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A190TBM21_CRT_DATETIME", localUtil.ttoc( A190TBM21_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n190TBM21_CRT_DATETIME = (GXutil.nullDate().equals(A190TBM21_CRT_DATETIME) ? true : false) ;
      A191TBM21_CRT_USER_ID = "" ;
      n191TBM21_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A191TBM21_CRT_USER_ID", A191TBM21_CRT_USER_ID);
      n191TBM21_CRT_USER_ID = ((GXutil.strcmp("", A191TBM21_CRT_USER_ID)==0) ? true : false) ;
      A193TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n193TBM21_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A193TBM21_UPD_DATETIME", localUtil.ttoc( A193TBM21_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n193TBM21_UPD_DATETIME = (GXutil.nullDate().equals(A193TBM21_UPD_DATETIME) ? true : false) ;
      A194TBM21_UPD_USER_ID = "" ;
      n194TBM21_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A194TBM21_UPD_USER_ID", A194TBM21_UPD_USER_ID);
      n194TBM21_UPD_USER_ID = ((GXutil.strcmp("", A194TBM21_UPD_USER_ID)==0) ? true : false) ;
      A196TBM21_UPD_CNT = 0 ;
      n196TBM21_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A196TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)));
      n196TBM21_UPD_CNT = ((0==A196TBM21_UPD_CNT) ? true : false) ;
      A187TBM21_STUDY_NM = "" ;
      n187TBM21_STUDY_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A187TBM21_STUDY_NM", A187TBM21_STUDY_NM);
      n187TBM21_STUDY_NM = ((GXutil.strcmp("", A187TBM21_STUDY_NM)==0) ? true : false) ;
      A408TBM21_OUTER_STUDY_ID = "" ;
      n408TBM21_OUTER_STUDY_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A408TBM21_OUTER_STUDY_ID", A408TBM21_OUTER_STUDY_ID);
      n408TBM21_OUTER_STUDY_ID = ((GXutil.strcmp("", A408TBM21_OUTER_STUDY_ID)==0) ? true : false) ;
      A409TBM21_PROC_NM = "" ;
      n409TBM21_PROC_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A409TBM21_PROC_NM", A409TBM21_PROC_NM);
      n409TBM21_PROC_NM = ((GXutil.strcmp("", A409TBM21_PROC_NM)==0) ? true : false) ;
      A188TBM21_NOTE = "" ;
      n188TBM21_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A188TBM21_NOTE", A188TBM21_NOTE);
      n188TBM21_NOTE = ((GXutil.strcmp("", A188TBM21_NOTE)==0) ? true : false) ;
      A513TBM21_STATUS = "" ;
      n513TBM21_STATUS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A513TBM21_STATUS", A513TBM21_STATUS);
      n513TBM21_STATUS = ((GXutil.strcmp("", A513TBM21_STATUS)==0) ? true : false) ;
      A189TBM21_DEL_FLG = "" ;
      n189TBM21_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A189TBM21_DEL_FLG", A189TBM21_DEL_FLG);
      n189TBM21_DEL_FLG = ((GXutil.strcmp("", A189TBM21_DEL_FLG)==0) ? true : false) ;
      A192TBM21_CRT_PROG_NM = "" ;
      n192TBM21_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A192TBM21_CRT_PROG_NM", A192TBM21_CRT_PROG_NM);
      n192TBM21_CRT_PROG_NM = ((GXutil.strcmp("", A192TBM21_CRT_PROG_NM)==0) ? true : false) ;
      A195TBM21_UPD_PROG_NM = "" ;
      n195TBM21_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A195TBM21_UPD_PROG_NM", A195TBM21_UPD_PROG_NM);
      n195TBM21_UPD_PROG_NM = ((GXutil.strcmp("", A195TBM21_UPD_PROG_NM)==0) ? true : false) ;
      O196TBM21_UPD_CNT = A196TBM21_UPD_CNT ;
      n196TBM21_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A196TBM21_UPD_CNT", GXutil.ltrim( GXutil.str( A196TBM21_UPD_CNT, 10, 0)));
   }

   public void initAll0G15( )
   {
      A186TBM21_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A186TBM21_STUDY_ID", GXutil.ltrim( GXutil.str( A186TBM21_STUDY_ID, 10, 0)));
      initializeNonKey0G15( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14542688");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm21_study.js", "?14542688");
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
      GXt_char3 = A191TBM21_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm21_study_impl.this.GXt_char3 = GXv_char4[0] ;
      A191TBM21_CRT_USER_ID = GXt_char3 ;
      n191TBM21_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A191TBM21_CRT_USER_ID", A191TBM21_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A191TBM21_CRT_USER_ID))+"\"");
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
      GXt_char3 = A194TBM21_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm21_study_impl.this.GXt_char3 = GXv_char4[0] ;
      A194TBM21_UPD_USER_ID = GXt_char3 ;
      n194TBM21_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A194TBM21_UPD_USER_ID", A194TBM21_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A194TBM21_UPD_USER_ID))+"\"");
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
      A186TBM21_STUDY_ID = GX_Parm1 ;
      A190TBM21_CRT_DATETIME = GX_Parm2 ;
      n190TBM21_CRT_DATETIME = false ;
      A191TBM21_CRT_USER_ID = GX_Parm3 ;
      n191TBM21_CRT_USER_ID = false ;
      A193TBM21_UPD_DATETIME = GX_Parm4 ;
      n193TBM21_UPD_DATETIME = false ;
      A194TBM21_UPD_USER_ID = GX_Parm5 ;
      n194TBM21_UPD_USER_ID = false ;
      A196TBM21_UPD_CNT = GX_Parm6 ;
      n196TBM21_UPD_CNT = false ;
      A187TBM21_STUDY_NM = GX_Parm7 ;
      n187TBM21_STUDY_NM = false ;
      A408TBM21_OUTER_STUDY_ID = GX_Parm8 ;
      n408TBM21_OUTER_STUDY_ID = false ;
      A409TBM21_PROC_NM = GX_Parm9 ;
      n409TBM21_PROC_NM = false ;
      A188TBM21_NOTE = GX_Parm10 ;
      n188TBM21_NOTE = false ;
      A513TBM21_STATUS = GX_Parm11 ;
      n513TBM21_STATUS = false ;
      A189TBM21_DEL_FLG = GX_Parm12 ;
      n189TBM21_DEL_FLG = false ;
      A192TBM21_CRT_PROG_NM = GX_Parm13 ;
      n192TBM21_CRT_PROG_NM = false ;
      A195TBM21_UPD_PROG_NM = GX_Parm14 ;
      n195TBM21_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A190TBM21_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A191TBM21_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A193TBM21_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A194TBM21_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A196TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A187TBM21_STUDY_NM));
      isValidOutput.add(GXutil.rtrim( A408TBM21_OUTER_STUDY_ID));
      isValidOutput.add(GXutil.rtrim( A409TBM21_PROC_NM));
      isValidOutput.add(GXutil.rtrim( A188TBM21_NOTE));
      isValidOutput.add(GXutil.rtrim( A513TBM21_STATUS));
      isValidOutput.add(GXutil.rtrim( A189TBM21_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A192TBM21_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A195TBM21_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z186TBM21_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z190TBM21_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z191TBM21_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z193TBM21_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z194TBM21_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z196TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z187TBM21_STUDY_NM));
      isValidOutput.add(GXutil.rtrim( Z408TBM21_OUTER_STUDY_ID));
      isValidOutput.add(GXutil.rtrim( Z409TBM21_PROC_NM));
      isValidOutput.add(GXutil.rtrim( Z188TBM21_NOTE));
      isValidOutput.add(GXutil.rtrim( Z513TBM21_STATUS));
      isValidOutput.add(GXutil.rtrim( Z189TBM21_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z192TBM21_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z195TBM21_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O196TBM21_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1166 */
                  S1166 ();
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
      lblTextblocktbm21_study_id_Jsonclick = "" ;
      lblTextblocktbm21_study_nm_Jsonclick = "" ;
      A187TBM21_STUDY_NM = "" ;
      lblTextblocktbm21_outer_study_id_Jsonclick = "" ;
      A408TBM21_OUTER_STUDY_ID = "" ;
      lblTextblocktbm21_proc_nm_Jsonclick = "" ;
      A409TBM21_PROC_NM = "" ;
      lblTextblocktbm21_note_Jsonclick = "" ;
      A188TBM21_NOTE = "" ;
      lblTextblocktbm21_status_Jsonclick = "" ;
      A513TBM21_STATUS = "" ;
      lblTextblocktbm21_del_flg_Jsonclick = "" ;
      A189TBM21_DEL_FLG = "" ;
      lblTextblocktbm21_crt_datetime_Jsonclick = "" ;
      A190TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm21_crt_user_id_Jsonclick = "" ;
      A191TBM21_CRT_USER_ID = "" ;
      lblTextblocktbm21_crt_prog_nm_Jsonclick = "" ;
      A192TBM21_CRT_PROG_NM = "" ;
      lblTextblocktbm21_upd_datetime_Jsonclick = "" ;
      A193TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm21_upd_user_id_Jsonclick = "" ;
      A194TBM21_UPD_USER_ID = "" ;
      lblTextblocktbm21_upd_prog_nm_Jsonclick = "" ;
      A195TBM21_UPD_PROG_NM = "" ;
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
      Z190TBM21_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z191TBM21_CRT_USER_ID = "" ;
      Z193TBM21_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z194TBM21_UPD_USER_ID = "" ;
      Z187TBM21_STUDY_NM = "" ;
      Z408TBM21_OUTER_STUDY_ID = "" ;
      Z409TBM21_PROC_NM = "" ;
      Z188TBM21_NOTE = "" ;
      Z513TBM21_STATUS = "" ;
      Z189TBM21_DEL_FLG = "" ;
      Z192TBM21_CRT_PROG_NM = "" ;
      Z195TBM21_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000G4_A186TBM21_STUDY_ID = new long[1] ;
      T000G4_A190TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G4_n190TBM21_CRT_DATETIME = new boolean[] {false} ;
      T000G4_A191TBM21_CRT_USER_ID = new String[] {""} ;
      T000G4_n191TBM21_CRT_USER_ID = new boolean[] {false} ;
      T000G4_A193TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G4_n193TBM21_UPD_DATETIME = new boolean[] {false} ;
      T000G4_A194TBM21_UPD_USER_ID = new String[] {""} ;
      T000G4_n194TBM21_UPD_USER_ID = new boolean[] {false} ;
      T000G4_A196TBM21_UPD_CNT = new long[1] ;
      T000G4_n196TBM21_UPD_CNT = new boolean[] {false} ;
      T000G4_A187TBM21_STUDY_NM = new String[] {""} ;
      T000G4_n187TBM21_STUDY_NM = new boolean[] {false} ;
      T000G4_A408TBM21_OUTER_STUDY_ID = new String[] {""} ;
      T000G4_n408TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      T000G4_A409TBM21_PROC_NM = new String[] {""} ;
      T000G4_n409TBM21_PROC_NM = new boolean[] {false} ;
      T000G4_A188TBM21_NOTE = new String[] {""} ;
      T000G4_n188TBM21_NOTE = new boolean[] {false} ;
      T000G4_A513TBM21_STATUS = new String[] {""} ;
      T000G4_n513TBM21_STATUS = new boolean[] {false} ;
      T000G4_A189TBM21_DEL_FLG = new String[] {""} ;
      T000G4_n189TBM21_DEL_FLG = new boolean[] {false} ;
      T000G4_A192TBM21_CRT_PROG_NM = new String[] {""} ;
      T000G4_n192TBM21_CRT_PROG_NM = new boolean[] {false} ;
      T000G4_A195TBM21_UPD_PROG_NM = new String[] {""} ;
      T000G4_n195TBM21_UPD_PROG_NM = new boolean[] {false} ;
      T000G5_A186TBM21_STUDY_ID = new long[1] ;
      T000G3_A186TBM21_STUDY_ID = new long[1] ;
      T000G3_A190TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G3_n190TBM21_CRT_DATETIME = new boolean[] {false} ;
      T000G3_A191TBM21_CRT_USER_ID = new String[] {""} ;
      T000G3_n191TBM21_CRT_USER_ID = new boolean[] {false} ;
      T000G3_A193TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G3_n193TBM21_UPD_DATETIME = new boolean[] {false} ;
      T000G3_A194TBM21_UPD_USER_ID = new String[] {""} ;
      T000G3_n194TBM21_UPD_USER_ID = new boolean[] {false} ;
      T000G3_A196TBM21_UPD_CNT = new long[1] ;
      T000G3_n196TBM21_UPD_CNT = new boolean[] {false} ;
      T000G3_A187TBM21_STUDY_NM = new String[] {""} ;
      T000G3_n187TBM21_STUDY_NM = new boolean[] {false} ;
      T000G3_A408TBM21_OUTER_STUDY_ID = new String[] {""} ;
      T000G3_n408TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      T000G3_A409TBM21_PROC_NM = new String[] {""} ;
      T000G3_n409TBM21_PROC_NM = new boolean[] {false} ;
      T000G3_A188TBM21_NOTE = new String[] {""} ;
      T000G3_n188TBM21_NOTE = new boolean[] {false} ;
      T000G3_A513TBM21_STATUS = new String[] {""} ;
      T000G3_n513TBM21_STATUS = new boolean[] {false} ;
      T000G3_A189TBM21_DEL_FLG = new String[] {""} ;
      T000G3_n189TBM21_DEL_FLG = new boolean[] {false} ;
      T000G3_A192TBM21_CRT_PROG_NM = new String[] {""} ;
      T000G3_n192TBM21_CRT_PROG_NM = new boolean[] {false} ;
      T000G3_A195TBM21_UPD_PROG_NM = new String[] {""} ;
      T000G3_n195TBM21_UPD_PROG_NM = new boolean[] {false} ;
      sMode15 = "" ;
      T000G6_A186TBM21_STUDY_ID = new long[1] ;
      T000G7_A186TBM21_STUDY_ID = new long[1] ;
      T000G2_A186TBM21_STUDY_ID = new long[1] ;
      T000G2_A190TBM21_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G2_n190TBM21_CRT_DATETIME = new boolean[] {false} ;
      T000G2_A191TBM21_CRT_USER_ID = new String[] {""} ;
      T000G2_n191TBM21_CRT_USER_ID = new boolean[] {false} ;
      T000G2_A193TBM21_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000G2_n193TBM21_UPD_DATETIME = new boolean[] {false} ;
      T000G2_A194TBM21_UPD_USER_ID = new String[] {""} ;
      T000G2_n194TBM21_UPD_USER_ID = new boolean[] {false} ;
      T000G2_A196TBM21_UPD_CNT = new long[1] ;
      T000G2_n196TBM21_UPD_CNT = new boolean[] {false} ;
      T000G2_A187TBM21_STUDY_NM = new String[] {""} ;
      T000G2_n187TBM21_STUDY_NM = new boolean[] {false} ;
      T000G2_A408TBM21_OUTER_STUDY_ID = new String[] {""} ;
      T000G2_n408TBM21_OUTER_STUDY_ID = new boolean[] {false} ;
      T000G2_A409TBM21_PROC_NM = new String[] {""} ;
      T000G2_n409TBM21_PROC_NM = new boolean[] {false} ;
      T000G2_A188TBM21_NOTE = new String[] {""} ;
      T000G2_n188TBM21_NOTE = new boolean[] {false} ;
      T000G2_A513TBM21_STATUS = new String[] {""} ;
      T000G2_n513TBM21_STATUS = new boolean[] {false} ;
      T000G2_A189TBM21_DEL_FLG = new String[] {""} ;
      T000G2_n189TBM21_DEL_FLG = new boolean[] {false} ;
      T000G2_A192TBM21_CRT_PROG_NM = new String[] {""} ;
      T000G2_n192TBM21_CRT_PROG_NM = new boolean[] {false} ;
      T000G2_A195TBM21_UPD_PROG_NM = new String[] {""} ;
      T000G2_n195TBM21_UPD_PROG_NM = new boolean[] {false} ;
      T000G11_A435TBM25_STUDY_ID = new long[1] ;
      T000G11_A436TBM25_LIST_CD = new String[] {""} ;
      T000G12_A422TBM24_STUDY_ID = new long[1] ;
      T000G12_A423TBM24_DOM_CD = new String[] {""} ;
      T000G12_A424TBM24_DOM_VAR_NM = new String[] {""} ;
      T000G12_A425TBM24_CRF_ITEM_DIV = new String[] {""} ;
      T000G13_A217TBM31_STUDY_ID = new long[1] ;
      T000G13_A218TBM31_CRF_ID = new short[1] ;
      T000G14_A207TBM23_STUDY_ID = new long[1] ;
      T000G14_A208TBM23_USER_ID = new String[] {""} ;
      T000G14_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000G15_A197TBM22_STUDY_ID = new long[1] ;
      T000G15_A198TBM22_SITE_ID = new String[] {""} ;
      T000G16_A186TBM21_STUDY_ID = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm21_study__default(),
         new Object[] {
             new Object[] {
            T000G2_A186TBM21_STUDY_ID, T000G2_A190TBM21_CRT_DATETIME, T000G2_n190TBM21_CRT_DATETIME, T000G2_A191TBM21_CRT_USER_ID, T000G2_n191TBM21_CRT_USER_ID, T000G2_A193TBM21_UPD_DATETIME, T000G2_n193TBM21_UPD_DATETIME, T000G2_A194TBM21_UPD_USER_ID, T000G2_n194TBM21_UPD_USER_ID, T000G2_A196TBM21_UPD_CNT,
            T000G2_n196TBM21_UPD_CNT, T000G2_A187TBM21_STUDY_NM, T000G2_n187TBM21_STUDY_NM, T000G2_A408TBM21_OUTER_STUDY_ID, T000G2_n408TBM21_OUTER_STUDY_ID, T000G2_A409TBM21_PROC_NM, T000G2_n409TBM21_PROC_NM, T000G2_A188TBM21_NOTE, T000G2_n188TBM21_NOTE, T000G2_A513TBM21_STATUS,
            T000G2_n513TBM21_STATUS, T000G2_A189TBM21_DEL_FLG, T000G2_n189TBM21_DEL_FLG, T000G2_A192TBM21_CRT_PROG_NM, T000G2_n192TBM21_CRT_PROG_NM, T000G2_A195TBM21_UPD_PROG_NM, T000G2_n195TBM21_UPD_PROG_NM
            }
            , new Object[] {
            T000G3_A186TBM21_STUDY_ID, T000G3_A190TBM21_CRT_DATETIME, T000G3_n190TBM21_CRT_DATETIME, T000G3_A191TBM21_CRT_USER_ID, T000G3_n191TBM21_CRT_USER_ID, T000G3_A193TBM21_UPD_DATETIME, T000G3_n193TBM21_UPD_DATETIME, T000G3_A194TBM21_UPD_USER_ID, T000G3_n194TBM21_UPD_USER_ID, T000G3_A196TBM21_UPD_CNT,
            T000G3_n196TBM21_UPD_CNT, T000G3_A187TBM21_STUDY_NM, T000G3_n187TBM21_STUDY_NM, T000G3_A408TBM21_OUTER_STUDY_ID, T000G3_n408TBM21_OUTER_STUDY_ID, T000G3_A409TBM21_PROC_NM, T000G3_n409TBM21_PROC_NM, T000G3_A188TBM21_NOTE, T000G3_n188TBM21_NOTE, T000G3_A513TBM21_STATUS,
            T000G3_n513TBM21_STATUS, T000G3_A189TBM21_DEL_FLG, T000G3_n189TBM21_DEL_FLG, T000G3_A192TBM21_CRT_PROG_NM, T000G3_n192TBM21_CRT_PROG_NM, T000G3_A195TBM21_UPD_PROG_NM, T000G3_n195TBM21_UPD_PROG_NM
            }
            , new Object[] {
            T000G4_A186TBM21_STUDY_ID, T000G4_A190TBM21_CRT_DATETIME, T000G4_n190TBM21_CRT_DATETIME, T000G4_A191TBM21_CRT_USER_ID, T000G4_n191TBM21_CRT_USER_ID, T000G4_A193TBM21_UPD_DATETIME, T000G4_n193TBM21_UPD_DATETIME, T000G4_A194TBM21_UPD_USER_ID, T000G4_n194TBM21_UPD_USER_ID, T000G4_A196TBM21_UPD_CNT,
            T000G4_n196TBM21_UPD_CNT, T000G4_A187TBM21_STUDY_NM, T000G4_n187TBM21_STUDY_NM, T000G4_A408TBM21_OUTER_STUDY_ID, T000G4_n408TBM21_OUTER_STUDY_ID, T000G4_A409TBM21_PROC_NM, T000G4_n409TBM21_PROC_NM, T000G4_A188TBM21_NOTE, T000G4_n188TBM21_NOTE, T000G4_A513TBM21_STATUS,
            T000G4_n513TBM21_STATUS, T000G4_A189TBM21_DEL_FLG, T000G4_n189TBM21_DEL_FLG, T000G4_A192TBM21_CRT_PROG_NM, T000G4_n192TBM21_CRT_PROG_NM, T000G4_A195TBM21_UPD_PROG_NM, T000G4_n195TBM21_UPD_PROG_NM
            }
            , new Object[] {
            T000G5_A186TBM21_STUDY_ID
            }
            , new Object[] {
            T000G6_A186TBM21_STUDY_ID
            }
            , new Object[] {
            T000G7_A186TBM21_STUDY_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000G11_A435TBM25_STUDY_ID, T000G11_A436TBM25_LIST_CD
            }
            , new Object[] {
            T000G12_A422TBM24_STUDY_ID, T000G12_A423TBM24_DOM_CD, T000G12_A424TBM24_DOM_VAR_NM, T000G12_A425TBM24_CRF_ITEM_DIV
            }
            , new Object[] {
            T000G13_A217TBM31_STUDY_ID, T000G13_A218TBM31_CRF_ID
            }
            , new Object[] {
            T000G14_A207TBM23_STUDY_ID, T000G14_A208TBM23_USER_ID, T000G14_A407TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            T000G15_A197TBM22_STUDY_ID, T000G15_A198TBM22_SITE_ID
            }
            , new Object[] {
            T000G16_A186TBM21_STUDY_ID
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
   private long A186TBM21_STUDY_ID ;
   private long A196TBM21_UPD_CNT ;
   private long Z186TBM21_STUDY_ID ;
   private long Z196TBM21_UPD_CNT ;
   private long O196TBM21_UPD_CNT ;
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
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A190TBM21_CRT_DATETIME ;
   private java.util.Date A193TBM21_UPD_DATETIME ;
   private java.util.Date Z190TBM21_CRT_DATETIME ;
   private java.util.Date Z193TBM21_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n187TBM21_STUDY_NM ;
   private boolean n408TBM21_OUTER_STUDY_ID ;
   private boolean n409TBM21_PROC_NM ;
   private boolean n188TBM21_NOTE ;
   private boolean n513TBM21_STATUS ;
   private boolean n189TBM21_DEL_FLG ;
   private boolean n190TBM21_CRT_DATETIME ;
   private boolean n191TBM21_CRT_USER_ID ;
   private boolean n192TBM21_CRT_PROG_NM ;
   private boolean n193TBM21_UPD_DATETIME ;
   private boolean n194TBM21_UPD_USER_ID ;
   private boolean n195TBM21_UPD_PROG_NM ;
   private boolean n196TBM21_UPD_CNT ;
   private boolean Gx_longc ;
   private String A187TBM21_STUDY_NM ;
   private String A408TBM21_OUTER_STUDY_ID ;
   private String A409TBM21_PROC_NM ;
   private String A188TBM21_NOTE ;
   private String A513TBM21_STATUS ;
   private String A189TBM21_DEL_FLG ;
   private String A191TBM21_CRT_USER_ID ;
   private String A192TBM21_CRT_PROG_NM ;
   private String A194TBM21_UPD_USER_ID ;
   private String A195TBM21_UPD_PROG_NM ;
   private String Z191TBM21_CRT_USER_ID ;
   private String Z194TBM21_UPD_USER_ID ;
   private String Z187TBM21_STUDY_NM ;
   private String Z408TBM21_OUTER_STUDY_ID ;
   private String Z409TBM21_PROC_NM ;
   private String Z188TBM21_NOTE ;
   private String Z513TBM21_STATUS ;
   private String Z189TBM21_DEL_FLG ;
   private String Z192TBM21_CRT_PROG_NM ;
   private String Z195TBM21_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000G4_A186TBM21_STUDY_ID ;
   private java.util.Date[] T000G4_A190TBM21_CRT_DATETIME ;
   private boolean[] T000G4_n190TBM21_CRT_DATETIME ;
   private String[] T000G4_A191TBM21_CRT_USER_ID ;
   private boolean[] T000G4_n191TBM21_CRT_USER_ID ;
   private java.util.Date[] T000G4_A193TBM21_UPD_DATETIME ;
   private boolean[] T000G4_n193TBM21_UPD_DATETIME ;
   private String[] T000G4_A194TBM21_UPD_USER_ID ;
   private boolean[] T000G4_n194TBM21_UPD_USER_ID ;
   private long[] T000G4_A196TBM21_UPD_CNT ;
   private boolean[] T000G4_n196TBM21_UPD_CNT ;
   private String[] T000G4_A187TBM21_STUDY_NM ;
   private boolean[] T000G4_n187TBM21_STUDY_NM ;
   private String[] T000G4_A408TBM21_OUTER_STUDY_ID ;
   private boolean[] T000G4_n408TBM21_OUTER_STUDY_ID ;
   private String[] T000G4_A409TBM21_PROC_NM ;
   private boolean[] T000G4_n409TBM21_PROC_NM ;
   private String[] T000G4_A188TBM21_NOTE ;
   private boolean[] T000G4_n188TBM21_NOTE ;
   private String[] T000G4_A513TBM21_STATUS ;
   private boolean[] T000G4_n513TBM21_STATUS ;
   private String[] T000G4_A189TBM21_DEL_FLG ;
   private boolean[] T000G4_n189TBM21_DEL_FLG ;
   private String[] T000G4_A192TBM21_CRT_PROG_NM ;
   private boolean[] T000G4_n192TBM21_CRT_PROG_NM ;
   private String[] T000G4_A195TBM21_UPD_PROG_NM ;
   private boolean[] T000G4_n195TBM21_UPD_PROG_NM ;
   private long[] T000G5_A186TBM21_STUDY_ID ;
   private long[] T000G3_A186TBM21_STUDY_ID ;
   private java.util.Date[] T000G3_A190TBM21_CRT_DATETIME ;
   private boolean[] T000G3_n190TBM21_CRT_DATETIME ;
   private String[] T000G3_A191TBM21_CRT_USER_ID ;
   private boolean[] T000G3_n191TBM21_CRT_USER_ID ;
   private java.util.Date[] T000G3_A193TBM21_UPD_DATETIME ;
   private boolean[] T000G3_n193TBM21_UPD_DATETIME ;
   private String[] T000G3_A194TBM21_UPD_USER_ID ;
   private boolean[] T000G3_n194TBM21_UPD_USER_ID ;
   private long[] T000G3_A196TBM21_UPD_CNT ;
   private boolean[] T000G3_n196TBM21_UPD_CNT ;
   private String[] T000G3_A187TBM21_STUDY_NM ;
   private boolean[] T000G3_n187TBM21_STUDY_NM ;
   private String[] T000G3_A408TBM21_OUTER_STUDY_ID ;
   private boolean[] T000G3_n408TBM21_OUTER_STUDY_ID ;
   private String[] T000G3_A409TBM21_PROC_NM ;
   private boolean[] T000G3_n409TBM21_PROC_NM ;
   private String[] T000G3_A188TBM21_NOTE ;
   private boolean[] T000G3_n188TBM21_NOTE ;
   private String[] T000G3_A513TBM21_STATUS ;
   private boolean[] T000G3_n513TBM21_STATUS ;
   private String[] T000G3_A189TBM21_DEL_FLG ;
   private boolean[] T000G3_n189TBM21_DEL_FLG ;
   private String[] T000G3_A192TBM21_CRT_PROG_NM ;
   private boolean[] T000G3_n192TBM21_CRT_PROG_NM ;
   private String[] T000G3_A195TBM21_UPD_PROG_NM ;
   private boolean[] T000G3_n195TBM21_UPD_PROG_NM ;
   private long[] T000G6_A186TBM21_STUDY_ID ;
   private long[] T000G7_A186TBM21_STUDY_ID ;
   private long[] T000G2_A186TBM21_STUDY_ID ;
   private java.util.Date[] T000G2_A190TBM21_CRT_DATETIME ;
   private boolean[] T000G2_n190TBM21_CRT_DATETIME ;
   private String[] T000G2_A191TBM21_CRT_USER_ID ;
   private boolean[] T000G2_n191TBM21_CRT_USER_ID ;
   private java.util.Date[] T000G2_A193TBM21_UPD_DATETIME ;
   private boolean[] T000G2_n193TBM21_UPD_DATETIME ;
   private String[] T000G2_A194TBM21_UPD_USER_ID ;
   private boolean[] T000G2_n194TBM21_UPD_USER_ID ;
   private long[] T000G2_A196TBM21_UPD_CNT ;
   private boolean[] T000G2_n196TBM21_UPD_CNT ;
   private String[] T000G2_A187TBM21_STUDY_NM ;
   private boolean[] T000G2_n187TBM21_STUDY_NM ;
   private String[] T000G2_A408TBM21_OUTER_STUDY_ID ;
   private boolean[] T000G2_n408TBM21_OUTER_STUDY_ID ;
   private String[] T000G2_A409TBM21_PROC_NM ;
   private boolean[] T000G2_n409TBM21_PROC_NM ;
   private String[] T000G2_A188TBM21_NOTE ;
   private boolean[] T000G2_n188TBM21_NOTE ;
   private String[] T000G2_A513TBM21_STATUS ;
   private boolean[] T000G2_n513TBM21_STATUS ;
   private String[] T000G2_A189TBM21_DEL_FLG ;
   private boolean[] T000G2_n189TBM21_DEL_FLG ;
   private String[] T000G2_A192TBM21_CRT_PROG_NM ;
   private boolean[] T000G2_n192TBM21_CRT_PROG_NM ;
   private String[] T000G2_A195TBM21_UPD_PROG_NM ;
   private boolean[] T000G2_n195TBM21_UPD_PROG_NM ;
   private long[] T000G11_A435TBM25_STUDY_ID ;
   private String[] T000G11_A436TBM25_LIST_CD ;
   private long[] T000G12_A422TBM24_STUDY_ID ;
   private String[] T000G12_A423TBM24_DOM_CD ;
   private String[] T000G12_A424TBM24_DOM_VAR_NM ;
   private String[] T000G12_A425TBM24_CRF_ITEM_DIV ;
   private long[] T000G13_A217TBM31_STUDY_ID ;
   private short[] T000G13_A218TBM31_CRF_ID ;
   private long[] T000G14_A207TBM23_STUDY_ID ;
   private String[] T000G14_A208TBM23_USER_ID ;
   private String[] T000G14_A407TBM23_STYDY_AUTH_CD ;
   private long[] T000G15_A197TBM22_STUDY_ID ;
   private String[] T000G15_A198TBM22_SITE_ID ;
   private long[] T000G16_A186TBM21_STUDY_ID ;
}

final  class tbm21_study__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000G2", "SELECT `TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000G3", "SELECT `TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000G4", "SELECT TM1.`TBM21_STUDY_ID`, TM1.`TBM21_CRT_DATETIME`, TM1.`TBM21_CRT_USER_ID`, TM1.`TBM21_UPD_DATETIME`, TM1.`TBM21_UPD_USER_ID`, TM1.`TBM21_UPD_CNT`, TM1.`TBM21_STUDY_NM`, TM1.`TBM21_OUTER_STUDY_ID`, TM1.`TBM21_PROC_NM`, TM1.`TBM21_NOTE`, TM1.`TBM21_STATUS`, TM1.`TBM21_DEL_FLG`, TM1.`TBM21_CRT_PROG_NM`, TM1.`TBM21_UPD_PROG_NM` FROM `TBM21_STUDY` TM1 WHERE TM1.`TBM21_STUDY_ID` = ? ORDER BY TM1.`TBM21_STUDY_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000G5", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000G6", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE ( `TBM21_STUDY_ID` > ?) ORDER BY `TBM21_STUDY_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G7", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` WHERE ( `TBM21_STUDY_ID` < ?) ORDER BY `TBM21_STUDY_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000G8", "INSERT INTO `TBM21_STUDY` (`TBM21_STUDY_ID`, `TBM21_CRT_DATETIME`, `TBM21_CRT_USER_ID`, `TBM21_UPD_DATETIME`, `TBM21_UPD_USER_ID`, `TBM21_UPD_CNT`, `TBM21_STUDY_NM`, `TBM21_OUTER_STUDY_ID`, `TBM21_PROC_NM`, `TBM21_NOTE`, `TBM21_STATUS`, `TBM21_DEL_FLG`, `TBM21_CRT_PROG_NM`, `TBM21_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000G9", "UPDATE `TBM21_STUDY` SET `TBM21_CRT_DATETIME`=?, `TBM21_CRT_USER_ID`=?, `TBM21_UPD_DATETIME`=?, `TBM21_UPD_USER_ID`=?, `TBM21_UPD_CNT`=?, `TBM21_STUDY_NM`=?, `TBM21_OUTER_STUDY_ID`=?, `TBM21_PROC_NM`=?, `TBM21_NOTE`=?, `TBM21_STATUS`=?, `TBM21_DEL_FLG`=?, `TBM21_CRT_PROG_NM`=?, `TBM21_UPD_PROG_NM`=?  WHERE `TBM21_STUDY_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000G10", "DELETE FROM `TBM21_STUDY`  WHERE `TBM21_STUDY_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000G11", "SELECT `TBM25_STUDY_ID`, `TBM25_LIST_CD` FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G12", "SELECT `TBM24_STUDY_ID`, `TBM24_DOM_CD`, `TBM24_DOM_VAR_NM`, `TBM24_CRF_ITEM_DIV` FROM `TBM24_MAP_ITEM` WHERE `TBM24_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G13", "SELECT `TBM31_STUDY_ID`, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G14", "SELECT `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G15", "SELECT `TBM22_STUDY_ID`, `TBM22_SITE_ID` FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000G16", "SELECT `TBM21_STUDY_ID` FROM `TBM21_STUDY` ORDER BY `TBM21_STUDY_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               break;
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
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               break;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 14 :
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
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
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
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

