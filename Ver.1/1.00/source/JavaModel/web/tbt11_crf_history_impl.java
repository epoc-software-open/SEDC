/*
               File: tbt11_crf_history_impl
        Description: CRF修正履歴テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:26.71
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt11_crf_history_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel8"+"_"+"TBT11_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx8asatbt11_crt_user_id0Q25( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"TBT11_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx10asatbt11_upd_user_id0Q25( Gx_mode) ;
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
      Form.getMeta().addItem("Description", "CRF修正履歴テーブル", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbt11_crf_history_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt11_crf_history_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt11_crf_history_impl.class ));
   }

   public tbt11_crf_history_impl( int remoteHandle ,
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
         wb_table1_2_0Q25( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0Q25e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0Q25( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0Q25( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0Q25( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0Q25e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRF修正履歴テーブル"+"</legend>") ;
         wb_table3_27_0Q25( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0Q25e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0Q25e( true) ;
      }
      else
      {
         wb_table1_2_0Q25e( false) ;
      }
   }

   public void wb_table3_27_0Q25( boolean wbgen )
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
         wb_table4_33_0Q25( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0Q25e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 171,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT11_CRF_HISTORY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT11_CRF_HISTORY.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0Q25e( true) ;
      }
      else
      {
         wb_table3_27_0Q25e( false) ;
      }
   }

   public void wb_table4_33_0Q25( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_study_id_Internalname, "試験ID", "", "", lblTextblocktbt11_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A303TBT11_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBT11_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A303TBT11_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A303TBT11_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBT11_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_subject_id_Internalname, "患者ID", "", "", lblTextblocktbt11_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A304TBT11_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBT11_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A304TBT11_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A304TBT11_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBT11_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crf_id_Internalname, "CRFID", "", "", lblTextblocktbt11_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A305TBT11_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBT11_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A305TBT11_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A305TBT11_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(48);\"", "", "", "", "", edtTBT11_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crf_version_Internalname, "CRF更新バージョン", "", "", lblTextblocktbt11_crf_version_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRF_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A306TBT11_CRF_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBT11_CRF_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A306TBT11_CRF_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A306TBT11_CRF_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBT11_CRF_VERSION_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_CRF_VERSION_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crf_input_level_Internalname, "CRF入力権限レベル", "", "", lblTextblocktbt11_crf_input_level_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A573TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A573TBT11_CRF_INPUT_LEVEL, 2, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRF_INPUT_LEVEL_Internalname, GXutil.ltrim( localUtil.ntoc( A573TBT11_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")), ((edtTBT11_CRF_INPUT_LEVEL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A573TBT11_CRF_INPUT_LEVEL), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A573TBT11_CRF_INPUT_LEVEL), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBT11_CRF_INPUT_LEVEL_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_CRF_INPUT_LEVEL_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upload_datetime_Internalname, "アップロード日時", "", "", lblTextblocktbt11_upload_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A574TBT11_UPLOAD_DATETIME", localUtil.ttoc( A574TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT11_UPLOAD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPLOAD_DATETIME_Internalname, localUtil.format(A574TBT11_UPLOAD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A574TBT11_UPLOAD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(63);\"", "", "", "", "", edtTBT11_UPLOAD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_UPLOAD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_UPLOAD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT11_UPLOAD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upload_user_id_Internalname, "ID", "", "", lblTextblocktbt11_upload_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A575TBT11_UPLOAD_USER_ID", A575TBT11_UPLOAD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPLOAD_USER_ID_Internalname, GXutil.rtrim( A575TBT11_UPLOAD_USER_ID), GXutil.rtrim( localUtil.format( A575TBT11_UPLOAD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBT11_UPLOAD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_UPLOAD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upload_auth_cd_Internalname, "アップロード時権限コード", "", "", lblTextblocktbt11_upload_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A576TBT11_UPLOAD_AUTH_CD", A576TBT11_UPLOAD_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPLOAD_AUTH_CD_Internalname, GXutil.rtrim( A576TBT11_UPLOAD_AUTH_CD), GXutil.rtrim( localUtil.format( A576TBT11_UPLOAD_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBT11_UPLOAD_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_UPLOAD_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_dm_arrival_flg_Internalname, "DM到着フラグ", "", "", lblTextblocktbt11_dm_arrival_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A577TBT11_DM_ARRIVAL_FLG", A577TBT11_DM_ARRIVAL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_DM_ARRIVAL_FLG_Internalname, GXutil.rtrim( A577TBT11_DM_ARRIVAL_FLG), GXutil.rtrim( localUtil.format( A577TBT11_DM_ARRIVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBT11_DM_ARRIVAL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_DM_ARRIVAL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_dm_arrival_datetime_Internalname, "DM到着日時", "", "", lblTextblocktbt11_dm_arrival_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A578TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A578TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT11_DM_ARRIVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_DM_ARRIVAL_DATETIME_Internalname, localUtil.format(A578TBT11_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A578TBT11_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(83);\"", "", "", "", "", edtTBT11_DM_ARRIVAL_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_DM_ARRIVAL_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_DM_ARRIVAL_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT11_DM_ARRIVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_approval_flg_Internalname, "承認フラグ", "", "", lblTextblocktbt11_approval_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A579TBT11_APPROVAL_FLG", A579TBT11_APPROVAL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_APPROVAL_FLG_Internalname, GXutil.rtrim( A579TBT11_APPROVAL_FLG), GXutil.rtrim( localUtil.format( A579TBT11_APPROVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBT11_APPROVAL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_APPROVAL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_approval_datetime_Internalname, "承認日時", "", "", lblTextblocktbt11_approval_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A580TBT11_APPROVAL_DATETIME", localUtil.ttoc( A580TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT11_APPROVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_APPROVAL_DATETIME_Internalname, localUtil.format(A580TBT11_APPROVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A580TBT11_APPROVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBT11_APPROVAL_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_APPROVAL_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_APPROVAL_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT11_APPROVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_approval_user_id_Internalname, "ID", "", "", lblTextblocktbt11_approval_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A581TBT11_APPROVAL_USER_ID", A581TBT11_APPROVAL_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_APPROVAL_USER_ID_Internalname, GXutil.rtrim( A581TBT11_APPROVAL_USER_ID), GXutil.rtrim( localUtil.format( A581TBT11_APPROVAL_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTBT11_APPROVAL_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_APPROVAL_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_approval_auth_cd_Internalname, "承認時権限コード", "", "", lblTextblocktbt11_approval_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A582TBT11_APPROVAL_AUTH_CD", A582TBT11_APPROVAL_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_APPROVAL_AUTH_CD_Internalname, GXutil.rtrim( A582TBT11_APPROVAL_AUTH_CD), GXutil.rtrim( localUtil.format( A582TBT11_APPROVAL_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtTBT11_APPROVAL_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_APPROVAL_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_input_end_flg_Internalname, "データ固定フラグ", "", "", lblTextblocktbt11_input_end_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A583TBT11_INPUT_END_FLG", A583TBT11_INPUT_END_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_INPUT_END_FLG_Internalname, GXutil.rtrim( A583TBT11_INPUT_END_FLG), GXutil.rtrim( localUtil.format( A583TBT11_INPUT_END_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(108);\"", "", "", "", "", edtTBT11_INPUT_END_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_INPUT_END_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_input_end_datetime_Internalname, "データ固定日時", "", "", lblTextblocktbt11_input_end_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A584TBT11_INPUT_END_DATETIME", localUtil.ttoc( A584TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT11_INPUT_END_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_INPUT_END_DATETIME_Internalname, localUtil.format(A584TBT11_INPUT_END_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A584TBT11_INPUT_END_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(113);\"", "", "", "", "", edtTBT11_INPUT_END_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_INPUT_END_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_INPUT_END_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT11_INPUT_END_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_input_end_user_id_Internalname, "ID", "", "", lblTextblocktbt11_input_end_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A585TBT11_INPUT_END_USER_ID", A585TBT11_INPUT_END_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_INPUT_END_USER_ID_Internalname, GXutil.rtrim( A585TBT11_INPUT_END_USER_ID), GXutil.rtrim( localUtil.format( A585TBT11_INPUT_END_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(118);\"", "", "", "", "", edtTBT11_INPUT_END_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_INPUT_END_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_input_end_auth_cd_Internalname, "データ固定時権限コード", "", "", lblTextblocktbt11_input_end_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A586TBT11_INPUT_END_AUTH_CD", A586TBT11_INPUT_END_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_INPUT_END_AUTH_CD_Internalname, GXutil.rtrim( A586TBT11_INPUT_END_AUTH_CD), GXutil.rtrim( localUtil.format( A586TBT11_INPUT_END_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(123);\"", "", "", "", "", edtTBT11_INPUT_END_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_INPUT_END_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upd_riyu_Internalname, "変更理由", "", "", lblTextblocktbt11_upd_riyu_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A884TBT11_UPD_RIYU", A884TBT11_UPD_RIYU);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT11_UPD_RIYU_Internalname, GXutil.rtrim( A884TBT11_UPD_RIYU), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(128);\"", (short)(0), 1, edtTBT11_UPD_RIYU_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "2000", -1, "", true, "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt11_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A307TBT11_DEL_FLG", A307TBT11_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_DEL_FLG_Internalname, GXutil.rtrim( A307TBT11_DEL_FLG), GXutil.rtrim( localUtil.format( A307TBT11_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(133);\"", "", "", "", "", edtTBT11_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt11_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A308TBT11_CRT_DATETIME", localUtil.ttoc( A308TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT11_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRT_DATETIME_Internalname, localUtil.format(A308TBT11_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A308TBT11_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(138);\"", "", "", "", "", edtTBT11_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT11_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbt11_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A309TBT11_CRT_USER_ID", A309TBT11_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRT_USER_ID_Internalname, GXutil.rtrim( A309TBT11_CRT_USER_ID), GXutil.rtrim( localUtil.format( A309TBT11_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(143);\"", "", "", "", "", edtTBT11_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt11_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A310TBT11_CRT_PROG_NM", A310TBT11_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_CRT_PROG_NM_Internalname, GXutil.rtrim( A310TBT11_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A310TBT11_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(148);\"", "", "", "", "", edtTBT11_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt11_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A311TBT11_UPD_DATETIME", localUtil.ttoc( A311TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT11_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPD_DATETIME_Internalname, localUtil.format(A311TBT11_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A311TBT11_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(153);\"", "", "", "", "", edtTBT11_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT11_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT11_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbt11_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A312TBT11_UPD_USER_ID", A312TBT11_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPD_USER_ID_Internalname, GXutil.rtrim( A312TBT11_UPD_USER_ID), GXutil.rtrim( localUtil.format( A312TBT11_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(158);\"", "", "", "", "", edtTBT11_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt11_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A313TBT11_UPD_PROG_NM", A313TBT11_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPD_PROG_NM_Internalname, GXutil.rtrim( A313TBT11_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A313TBT11_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(163);\"", "", "", "", "", edtTBT11_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt11_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt11_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A314TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT11_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A314TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT11_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A314TBT11_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A314TBT11_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(168);\"", "", "", "", "", edtTBT11_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT11_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT11_CRF_HISTORY.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0Q25e( true) ;
      }
      else
      {
         wb_table4_33_0Q25e( false) ;
      }
   }

   public void wb_table2_5_0Q25( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT11_CRF_HISTORY.htm");
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
         wb_table2_5_0Q25e( true) ;
      }
      else
      {
         wb_table2_5_0Q25e( false) ;
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
      /* Execute user event: e110Q2 */
      e110Q2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A303TBT11_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
            }
            else
            {
               A303TBT11_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBT11_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A304TBT11_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A304TBT11_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBT11_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A305TBT11_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
            }
            else
            {
               A305TBT11_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_CRF_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_CRF_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A306TBT11_CRF_VERSION = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
            }
            else
            {
               A306TBT11_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_VERSION_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_INPUT_LEVEL_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_INPUT_LEVEL_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_CRF_INPUT_LEVEL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A573TBT11_CRF_INPUT_LEVEL = (byte)(0) ;
               n573TBT11_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A573TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A573TBT11_CRF_INPUT_LEVEL, 2, 0)));
            }
            else
            {
               A573TBT11_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBT11_CRF_INPUT_LEVEL_Internalname), ".", ",")) ;
               n573TBT11_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A573TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A573TBT11_CRF_INPUT_LEVEL, 2, 0)));
            }
            n573TBT11_CRF_INPUT_LEVEL = ((0==A573TBT11_CRF_INPUT_LEVEL) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_UPLOAD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"アップロード日時"}), 1, "TBT11_UPLOAD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_UPLOAD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A574TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n574TBT11_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A574TBT11_UPLOAD_DATETIME", localUtil.ttoc( A574TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A574TBT11_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_UPLOAD_DATETIME_Internalname)) ;
               n574TBT11_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A574TBT11_UPLOAD_DATETIME", localUtil.ttoc( A574TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n574TBT11_UPLOAD_DATETIME = (GXutil.nullDate().equals(A574TBT11_UPLOAD_DATETIME) ? true : false) ;
            A575TBT11_UPLOAD_USER_ID = httpContext.cgiGet( edtTBT11_UPLOAD_USER_ID_Internalname) ;
            n575TBT11_UPLOAD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A575TBT11_UPLOAD_USER_ID", A575TBT11_UPLOAD_USER_ID);
            n575TBT11_UPLOAD_USER_ID = ((GXutil.strcmp("", A575TBT11_UPLOAD_USER_ID)==0) ? true : false) ;
            A576TBT11_UPLOAD_AUTH_CD = httpContext.cgiGet( edtTBT11_UPLOAD_AUTH_CD_Internalname) ;
            n576TBT11_UPLOAD_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A576TBT11_UPLOAD_AUTH_CD", A576TBT11_UPLOAD_AUTH_CD);
            n576TBT11_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A576TBT11_UPLOAD_AUTH_CD)==0) ? true : false) ;
            A577TBT11_DM_ARRIVAL_FLG = httpContext.cgiGet( edtTBT11_DM_ARRIVAL_FLG_Internalname) ;
            n577TBT11_DM_ARRIVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A577TBT11_DM_ARRIVAL_FLG", A577TBT11_DM_ARRIVAL_FLG);
            n577TBT11_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A577TBT11_DM_ARRIVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_DM_ARRIVAL_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"DM到着日時"}), 1, "TBT11_DM_ARRIVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_DM_ARRIVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n578TBT11_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A578TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A578TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A578TBT11_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_DM_ARRIVAL_DATETIME_Internalname)) ;
               n578TBT11_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A578TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A578TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n578TBT11_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A578TBT11_DM_ARRIVAL_DATETIME) ? true : false) ;
            A579TBT11_APPROVAL_FLG = httpContext.cgiGet( edtTBT11_APPROVAL_FLG_Internalname) ;
            n579TBT11_APPROVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A579TBT11_APPROVAL_FLG", A579TBT11_APPROVAL_FLG);
            n579TBT11_APPROVAL_FLG = ((GXutil.strcmp("", A579TBT11_APPROVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_APPROVAL_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"承認日時"}), 1, "TBT11_APPROVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_APPROVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A580TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n580TBT11_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A580TBT11_APPROVAL_DATETIME", localUtil.ttoc( A580TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A580TBT11_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_APPROVAL_DATETIME_Internalname)) ;
               n580TBT11_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A580TBT11_APPROVAL_DATETIME", localUtil.ttoc( A580TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n580TBT11_APPROVAL_DATETIME = (GXutil.nullDate().equals(A580TBT11_APPROVAL_DATETIME) ? true : false) ;
            A581TBT11_APPROVAL_USER_ID = httpContext.cgiGet( edtTBT11_APPROVAL_USER_ID_Internalname) ;
            n581TBT11_APPROVAL_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A581TBT11_APPROVAL_USER_ID", A581TBT11_APPROVAL_USER_ID);
            n581TBT11_APPROVAL_USER_ID = ((GXutil.strcmp("", A581TBT11_APPROVAL_USER_ID)==0) ? true : false) ;
            A582TBT11_APPROVAL_AUTH_CD = httpContext.cgiGet( edtTBT11_APPROVAL_AUTH_CD_Internalname) ;
            n582TBT11_APPROVAL_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A582TBT11_APPROVAL_AUTH_CD", A582TBT11_APPROVAL_AUTH_CD);
            n582TBT11_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A582TBT11_APPROVAL_AUTH_CD)==0) ? true : false) ;
            A583TBT11_INPUT_END_FLG = httpContext.cgiGet( edtTBT11_INPUT_END_FLG_Internalname) ;
            n583TBT11_INPUT_END_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A583TBT11_INPUT_END_FLG", A583TBT11_INPUT_END_FLG);
            n583TBT11_INPUT_END_FLG = ((GXutil.strcmp("", A583TBT11_INPUT_END_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_INPUT_END_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"データ固定日時"}), 1, "TBT11_INPUT_END_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_INPUT_END_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A584TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n584TBT11_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A584TBT11_INPUT_END_DATETIME", localUtil.ttoc( A584TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A584TBT11_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_INPUT_END_DATETIME_Internalname)) ;
               n584TBT11_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A584TBT11_INPUT_END_DATETIME", localUtil.ttoc( A584TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n584TBT11_INPUT_END_DATETIME = (GXutil.nullDate().equals(A584TBT11_INPUT_END_DATETIME) ? true : false) ;
            A585TBT11_INPUT_END_USER_ID = httpContext.cgiGet( edtTBT11_INPUT_END_USER_ID_Internalname) ;
            n585TBT11_INPUT_END_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A585TBT11_INPUT_END_USER_ID", A585TBT11_INPUT_END_USER_ID);
            n585TBT11_INPUT_END_USER_ID = ((GXutil.strcmp("", A585TBT11_INPUT_END_USER_ID)==0) ? true : false) ;
            A586TBT11_INPUT_END_AUTH_CD = httpContext.cgiGet( edtTBT11_INPUT_END_AUTH_CD_Internalname) ;
            n586TBT11_INPUT_END_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A586TBT11_INPUT_END_AUTH_CD", A586TBT11_INPUT_END_AUTH_CD);
            n586TBT11_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A586TBT11_INPUT_END_AUTH_CD)==0) ? true : false) ;
            A884TBT11_UPD_RIYU = httpContext.cgiGet( edtTBT11_UPD_RIYU_Internalname) ;
            n884TBT11_UPD_RIYU = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A884TBT11_UPD_RIYU", A884TBT11_UPD_RIYU);
            n884TBT11_UPD_RIYU = ((GXutil.strcmp("", A884TBT11_UPD_RIYU)==0) ? true : false) ;
            A307TBT11_DEL_FLG = httpContext.cgiGet( edtTBT11_DEL_FLG_Internalname) ;
            n307TBT11_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A307TBT11_DEL_FLG", A307TBT11_DEL_FLG);
            n307TBT11_DEL_FLG = ((GXutil.strcmp("", A307TBT11_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBT11_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A308TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n308TBT11_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A308TBT11_CRT_DATETIME", localUtil.ttoc( A308TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A308TBT11_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_CRT_DATETIME_Internalname)) ;
               n308TBT11_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A308TBT11_CRT_DATETIME", localUtil.ttoc( A308TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n308TBT11_CRT_DATETIME = (GXutil.nullDate().equals(A308TBT11_CRT_DATETIME) ? true : false) ;
            A309TBT11_CRT_USER_ID = httpContext.cgiGet( edtTBT11_CRT_USER_ID_Internalname) ;
            n309TBT11_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A309TBT11_CRT_USER_ID", A309TBT11_CRT_USER_ID);
            n309TBT11_CRT_USER_ID = ((GXutil.strcmp("", A309TBT11_CRT_USER_ID)==0) ? true : false) ;
            A310TBT11_CRT_PROG_NM = httpContext.cgiGet( edtTBT11_CRT_PROG_NM_Internalname) ;
            n310TBT11_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A310TBT11_CRT_PROG_NM", A310TBT11_CRT_PROG_NM);
            n310TBT11_CRT_PROG_NM = ((GXutil.strcmp("", A310TBT11_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT11_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBT11_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A311TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n311TBT11_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A311TBT11_UPD_DATETIME", localUtil.ttoc( A311TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A311TBT11_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT11_UPD_DATETIME_Internalname)) ;
               n311TBT11_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A311TBT11_UPD_DATETIME", localUtil.ttoc( A311TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n311TBT11_UPD_DATETIME = (GXutil.nullDate().equals(A311TBT11_UPD_DATETIME) ? true : false) ;
            A312TBT11_UPD_USER_ID = httpContext.cgiGet( edtTBT11_UPD_USER_ID_Internalname) ;
            n312TBT11_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A312TBT11_UPD_USER_ID", A312TBT11_UPD_USER_ID);
            n312TBT11_UPD_USER_ID = ((GXutil.strcmp("", A312TBT11_UPD_USER_ID)==0) ? true : false) ;
            A313TBT11_UPD_PROG_NM = httpContext.cgiGet( edtTBT11_UPD_PROG_NM_Internalname) ;
            n313TBT11_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A313TBT11_UPD_PROG_NM", A313TBT11_UPD_PROG_NM);
            n313TBT11_UPD_PROG_NM = ((GXutil.strcmp("", A313TBT11_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT11_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT11_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A314TBT11_UPD_CNT = 0 ;
               n314TBT11_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A314TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)));
            }
            else
            {
               A314TBT11_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT11_UPD_CNT_Internalname), ".", ",") ;
               n314TBT11_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A314TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)));
            }
            n314TBT11_UPD_CNT = ((0==A314TBT11_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z303TBT11_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z303TBT11_STUDY_ID"), ".", ",") ;
            Z304TBT11_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z304TBT11_SUBJECT_ID"), ".", ",")) ;
            Z305TBT11_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z305TBT11_CRF_ID"), ".", ",")) ;
            Z306TBT11_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z306TBT11_CRF_VERSION"), ".", ",")) ;
            Z308TBT11_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z308TBT11_CRT_DATETIME"), 0) ;
            n308TBT11_CRT_DATETIME = (GXutil.nullDate().equals(A308TBT11_CRT_DATETIME) ? true : false) ;
            Z309TBT11_CRT_USER_ID = httpContext.cgiGet( "Z309TBT11_CRT_USER_ID") ;
            n309TBT11_CRT_USER_ID = ((GXutil.strcmp("", A309TBT11_CRT_USER_ID)==0) ? true : false) ;
            Z311TBT11_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z311TBT11_UPD_DATETIME"), 0) ;
            n311TBT11_UPD_DATETIME = (GXutil.nullDate().equals(A311TBT11_UPD_DATETIME) ? true : false) ;
            Z312TBT11_UPD_USER_ID = httpContext.cgiGet( "Z312TBT11_UPD_USER_ID") ;
            n312TBT11_UPD_USER_ID = ((GXutil.strcmp("", A312TBT11_UPD_USER_ID)==0) ? true : false) ;
            Z314TBT11_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z314TBT11_UPD_CNT"), ".", ",") ;
            n314TBT11_UPD_CNT = ((0==A314TBT11_UPD_CNT) ? true : false) ;
            Z573TBT11_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z573TBT11_CRF_INPUT_LEVEL"), ".", ",")) ;
            n573TBT11_CRF_INPUT_LEVEL = ((0==A573TBT11_CRF_INPUT_LEVEL) ? true : false) ;
            Z574TBT11_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z574TBT11_UPLOAD_DATETIME"), 0) ;
            n574TBT11_UPLOAD_DATETIME = (GXutil.nullDate().equals(A574TBT11_UPLOAD_DATETIME) ? true : false) ;
            Z575TBT11_UPLOAD_USER_ID = httpContext.cgiGet( "Z575TBT11_UPLOAD_USER_ID") ;
            n575TBT11_UPLOAD_USER_ID = ((GXutil.strcmp("", A575TBT11_UPLOAD_USER_ID)==0) ? true : false) ;
            Z576TBT11_UPLOAD_AUTH_CD = httpContext.cgiGet( "Z576TBT11_UPLOAD_AUTH_CD") ;
            n576TBT11_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A576TBT11_UPLOAD_AUTH_CD)==0) ? true : false) ;
            Z577TBT11_DM_ARRIVAL_FLG = httpContext.cgiGet( "Z577TBT11_DM_ARRIVAL_FLG") ;
            n577TBT11_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A577TBT11_DM_ARRIVAL_FLG)==0) ? true : false) ;
            Z578TBT11_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z578TBT11_DM_ARRIVAL_DATETIME"), 0) ;
            n578TBT11_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A578TBT11_DM_ARRIVAL_DATETIME) ? true : false) ;
            Z579TBT11_APPROVAL_FLG = httpContext.cgiGet( "Z579TBT11_APPROVAL_FLG") ;
            n579TBT11_APPROVAL_FLG = ((GXutil.strcmp("", A579TBT11_APPROVAL_FLG)==0) ? true : false) ;
            Z580TBT11_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z580TBT11_APPROVAL_DATETIME"), 0) ;
            n580TBT11_APPROVAL_DATETIME = (GXutil.nullDate().equals(A580TBT11_APPROVAL_DATETIME) ? true : false) ;
            Z581TBT11_APPROVAL_USER_ID = httpContext.cgiGet( "Z581TBT11_APPROVAL_USER_ID") ;
            n581TBT11_APPROVAL_USER_ID = ((GXutil.strcmp("", A581TBT11_APPROVAL_USER_ID)==0) ? true : false) ;
            Z582TBT11_APPROVAL_AUTH_CD = httpContext.cgiGet( "Z582TBT11_APPROVAL_AUTH_CD") ;
            n582TBT11_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A582TBT11_APPROVAL_AUTH_CD)==0) ? true : false) ;
            Z583TBT11_INPUT_END_FLG = httpContext.cgiGet( "Z583TBT11_INPUT_END_FLG") ;
            n583TBT11_INPUT_END_FLG = ((GXutil.strcmp("", A583TBT11_INPUT_END_FLG)==0) ? true : false) ;
            Z584TBT11_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z584TBT11_INPUT_END_DATETIME"), 0) ;
            n584TBT11_INPUT_END_DATETIME = (GXutil.nullDate().equals(A584TBT11_INPUT_END_DATETIME) ? true : false) ;
            Z585TBT11_INPUT_END_USER_ID = httpContext.cgiGet( "Z585TBT11_INPUT_END_USER_ID") ;
            n585TBT11_INPUT_END_USER_ID = ((GXutil.strcmp("", A585TBT11_INPUT_END_USER_ID)==0) ? true : false) ;
            Z586TBT11_INPUT_END_AUTH_CD = httpContext.cgiGet( "Z586TBT11_INPUT_END_AUTH_CD") ;
            n586TBT11_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A586TBT11_INPUT_END_AUTH_CD)==0) ? true : false) ;
            Z884TBT11_UPD_RIYU = httpContext.cgiGet( "Z884TBT11_UPD_RIYU") ;
            n884TBT11_UPD_RIYU = ((GXutil.strcmp("", A884TBT11_UPD_RIYU)==0) ? true : false) ;
            Z307TBT11_DEL_FLG = httpContext.cgiGet( "Z307TBT11_DEL_FLG") ;
            n307TBT11_DEL_FLG = ((GXutil.strcmp("", A307TBT11_DEL_FLG)==0) ? true : false) ;
            Z310TBT11_CRT_PROG_NM = httpContext.cgiGet( "Z310TBT11_CRT_PROG_NM") ;
            n310TBT11_CRT_PROG_NM = ((GXutil.strcmp("", A310TBT11_CRT_PROG_NM)==0) ? true : false) ;
            Z313TBT11_UPD_PROG_NM = httpContext.cgiGet( "Z313TBT11_UPD_PROG_NM") ;
            n313TBT11_UPD_PROG_NM = ((GXutil.strcmp("", A313TBT11_UPD_PROG_NM)==0) ? true : false) ;
            O314TBT11_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O314TBT11_UPD_CNT"), ".", ",") ;
            n314TBT11_UPD_CNT = ((0==A314TBT11_UPD_CNT) ? true : false) ;
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
               A303TBT11_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
               A304TBT11_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
               A305TBT11_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
               A306TBT11_CRF_VERSION = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
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
                     /* Execute user event: e110Q2 */
                     e110Q2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120Q2 */
                     e120Q2 ();
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
         /* Execute user event: e120Q2 */
         e120Q2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0Q25( ) ;
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
      disableAttributes0Q25( ) ;
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

   public void resetCaption0Q0( )
   {
   }

   public void e110Q2( )
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

   public void e120Q2( )
   {
      /* After Trn Routine */
   }

   public void S1179( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0Q25( int GX_JID )
   {
      if ( ( GX_JID == 12 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z308TBT11_CRT_DATETIME = T000Q3_A308TBT11_CRT_DATETIME[0] ;
            Z309TBT11_CRT_USER_ID = T000Q3_A309TBT11_CRT_USER_ID[0] ;
            Z311TBT11_UPD_DATETIME = T000Q3_A311TBT11_UPD_DATETIME[0] ;
            Z312TBT11_UPD_USER_ID = T000Q3_A312TBT11_UPD_USER_ID[0] ;
            Z314TBT11_UPD_CNT = T000Q3_A314TBT11_UPD_CNT[0] ;
            Z573TBT11_CRF_INPUT_LEVEL = T000Q3_A573TBT11_CRF_INPUT_LEVEL[0] ;
            Z574TBT11_UPLOAD_DATETIME = T000Q3_A574TBT11_UPLOAD_DATETIME[0] ;
            Z575TBT11_UPLOAD_USER_ID = T000Q3_A575TBT11_UPLOAD_USER_ID[0] ;
            Z576TBT11_UPLOAD_AUTH_CD = T000Q3_A576TBT11_UPLOAD_AUTH_CD[0] ;
            Z577TBT11_DM_ARRIVAL_FLG = T000Q3_A577TBT11_DM_ARRIVAL_FLG[0] ;
            Z578TBT11_DM_ARRIVAL_DATETIME = T000Q3_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
            Z579TBT11_APPROVAL_FLG = T000Q3_A579TBT11_APPROVAL_FLG[0] ;
            Z580TBT11_APPROVAL_DATETIME = T000Q3_A580TBT11_APPROVAL_DATETIME[0] ;
            Z581TBT11_APPROVAL_USER_ID = T000Q3_A581TBT11_APPROVAL_USER_ID[0] ;
            Z582TBT11_APPROVAL_AUTH_CD = T000Q3_A582TBT11_APPROVAL_AUTH_CD[0] ;
            Z583TBT11_INPUT_END_FLG = T000Q3_A583TBT11_INPUT_END_FLG[0] ;
            Z584TBT11_INPUT_END_DATETIME = T000Q3_A584TBT11_INPUT_END_DATETIME[0] ;
            Z585TBT11_INPUT_END_USER_ID = T000Q3_A585TBT11_INPUT_END_USER_ID[0] ;
            Z586TBT11_INPUT_END_AUTH_CD = T000Q3_A586TBT11_INPUT_END_AUTH_CD[0] ;
            Z884TBT11_UPD_RIYU = T000Q3_A884TBT11_UPD_RIYU[0] ;
            Z307TBT11_DEL_FLG = T000Q3_A307TBT11_DEL_FLG[0] ;
            Z310TBT11_CRT_PROG_NM = T000Q3_A310TBT11_CRT_PROG_NM[0] ;
            Z313TBT11_UPD_PROG_NM = T000Q3_A313TBT11_UPD_PROG_NM[0] ;
         }
         else
         {
            Z308TBT11_CRT_DATETIME = A308TBT11_CRT_DATETIME ;
            Z309TBT11_CRT_USER_ID = A309TBT11_CRT_USER_ID ;
            Z311TBT11_UPD_DATETIME = A311TBT11_UPD_DATETIME ;
            Z312TBT11_UPD_USER_ID = A312TBT11_UPD_USER_ID ;
            Z314TBT11_UPD_CNT = A314TBT11_UPD_CNT ;
            Z573TBT11_CRF_INPUT_LEVEL = A573TBT11_CRF_INPUT_LEVEL ;
            Z574TBT11_UPLOAD_DATETIME = A574TBT11_UPLOAD_DATETIME ;
            Z575TBT11_UPLOAD_USER_ID = A575TBT11_UPLOAD_USER_ID ;
            Z576TBT11_UPLOAD_AUTH_CD = A576TBT11_UPLOAD_AUTH_CD ;
            Z577TBT11_DM_ARRIVAL_FLG = A577TBT11_DM_ARRIVAL_FLG ;
            Z578TBT11_DM_ARRIVAL_DATETIME = A578TBT11_DM_ARRIVAL_DATETIME ;
            Z579TBT11_APPROVAL_FLG = A579TBT11_APPROVAL_FLG ;
            Z580TBT11_APPROVAL_DATETIME = A580TBT11_APPROVAL_DATETIME ;
            Z581TBT11_APPROVAL_USER_ID = A581TBT11_APPROVAL_USER_ID ;
            Z582TBT11_APPROVAL_AUTH_CD = A582TBT11_APPROVAL_AUTH_CD ;
            Z583TBT11_INPUT_END_FLG = A583TBT11_INPUT_END_FLG ;
            Z584TBT11_INPUT_END_DATETIME = A584TBT11_INPUT_END_DATETIME ;
            Z585TBT11_INPUT_END_USER_ID = A585TBT11_INPUT_END_USER_ID ;
            Z586TBT11_INPUT_END_AUTH_CD = A586TBT11_INPUT_END_AUTH_CD ;
            Z884TBT11_UPD_RIYU = A884TBT11_UPD_RIYU ;
            Z307TBT11_DEL_FLG = A307TBT11_DEL_FLG ;
            Z310TBT11_CRT_PROG_NM = A310TBT11_CRT_PROG_NM ;
            Z313TBT11_UPD_PROG_NM = A313TBT11_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -12 )
      {
         Z303TBT11_STUDY_ID = A303TBT11_STUDY_ID ;
         Z304TBT11_SUBJECT_ID = A304TBT11_SUBJECT_ID ;
         Z305TBT11_CRF_ID = A305TBT11_CRF_ID ;
         Z306TBT11_CRF_VERSION = A306TBT11_CRF_VERSION ;
         Z308TBT11_CRT_DATETIME = A308TBT11_CRT_DATETIME ;
         Z309TBT11_CRT_USER_ID = A309TBT11_CRT_USER_ID ;
         Z311TBT11_UPD_DATETIME = A311TBT11_UPD_DATETIME ;
         Z312TBT11_UPD_USER_ID = A312TBT11_UPD_USER_ID ;
         Z314TBT11_UPD_CNT = A314TBT11_UPD_CNT ;
         Z573TBT11_CRF_INPUT_LEVEL = A573TBT11_CRF_INPUT_LEVEL ;
         Z574TBT11_UPLOAD_DATETIME = A574TBT11_UPLOAD_DATETIME ;
         Z575TBT11_UPLOAD_USER_ID = A575TBT11_UPLOAD_USER_ID ;
         Z576TBT11_UPLOAD_AUTH_CD = A576TBT11_UPLOAD_AUTH_CD ;
         Z577TBT11_DM_ARRIVAL_FLG = A577TBT11_DM_ARRIVAL_FLG ;
         Z578TBT11_DM_ARRIVAL_DATETIME = A578TBT11_DM_ARRIVAL_DATETIME ;
         Z579TBT11_APPROVAL_FLG = A579TBT11_APPROVAL_FLG ;
         Z580TBT11_APPROVAL_DATETIME = A580TBT11_APPROVAL_DATETIME ;
         Z581TBT11_APPROVAL_USER_ID = A581TBT11_APPROVAL_USER_ID ;
         Z582TBT11_APPROVAL_AUTH_CD = A582TBT11_APPROVAL_AUTH_CD ;
         Z583TBT11_INPUT_END_FLG = A583TBT11_INPUT_END_FLG ;
         Z584TBT11_INPUT_END_DATETIME = A584TBT11_INPUT_END_DATETIME ;
         Z585TBT11_INPUT_END_USER_ID = A585TBT11_INPUT_END_USER_ID ;
         Z586TBT11_INPUT_END_AUTH_CD = A586TBT11_INPUT_END_AUTH_CD ;
         Z884TBT11_UPD_RIYU = A884TBT11_UPD_RIYU ;
         Z307TBT11_DEL_FLG = A307TBT11_DEL_FLG ;
         Z310TBT11_CRT_PROG_NM = A310TBT11_CRT_PROG_NM ;
         Z313TBT11_UPD_PROG_NM = A313TBT11_UPD_PROG_NM ;
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

   public void load0Q25( )
   {
      /* Using cursor T000Q4 */
      pr_default.execute(2, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound25 = (short)(1) ;
         A308TBT11_CRT_DATETIME = T000Q4_A308TBT11_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A308TBT11_CRT_DATETIME", localUtil.ttoc( A308TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n308TBT11_CRT_DATETIME = T000Q4_n308TBT11_CRT_DATETIME[0] ;
         A309TBT11_CRT_USER_ID = T000Q4_A309TBT11_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A309TBT11_CRT_USER_ID", A309TBT11_CRT_USER_ID);
         n309TBT11_CRT_USER_ID = T000Q4_n309TBT11_CRT_USER_ID[0] ;
         A311TBT11_UPD_DATETIME = T000Q4_A311TBT11_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A311TBT11_UPD_DATETIME", localUtil.ttoc( A311TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n311TBT11_UPD_DATETIME = T000Q4_n311TBT11_UPD_DATETIME[0] ;
         A312TBT11_UPD_USER_ID = T000Q4_A312TBT11_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A312TBT11_UPD_USER_ID", A312TBT11_UPD_USER_ID);
         n312TBT11_UPD_USER_ID = T000Q4_n312TBT11_UPD_USER_ID[0] ;
         A314TBT11_UPD_CNT = T000Q4_A314TBT11_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A314TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)));
         n314TBT11_UPD_CNT = T000Q4_n314TBT11_UPD_CNT[0] ;
         A573TBT11_CRF_INPUT_LEVEL = T000Q4_A573TBT11_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A573TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A573TBT11_CRF_INPUT_LEVEL, 2, 0)));
         n573TBT11_CRF_INPUT_LEVEL = T000Q4_n573TBT11_CRF_INPUT_LEVEL[0] ;
         A574TBT11_UPLOAD_DATETIME = T000Q4_A574TBT11_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A574TBT11_UPLOAD_DATETIME", localUtil.ttoc( A574TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n574TBT11_UPLOAD_DATETIME = T000Q4_n574TBT11_UPLOAD_DATETIME[0] ;
         A575TBT11_UPLOAD_USER_ID = T000Q4_A575TBT11_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A575TBT11_UPLOAD_USER_ID", A575TBT11_UPLOAD_USER_ID);
         n575TBT11_UPLOAD_USER_ID = T000Q4_n575TBT11_UPLOAD_USER_ID[0] ;
         A576TBT11_UPLOAD_AUTH_CD = T000Q4_A576TBT11_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A576TBT11_UPLOAD_AUTH_CD", A576TBT11_UPLOAD_AUTH_CD);
         n576TBT11_UPLOAD_AUTH_CD = T000Q4_n576TBT11_UPLOAD_AUTH_CD[0] ;
         A577TBT11_DM_ARRIVAL_FLG = T000Q4_A577TBT11_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A577TBT11_DM_ARRIVAL_FLG", A577TBT11_DM_ARRIVAL_FLG);
         n577TBT11_DM_ARRIVAL_FLG = T000Q4_n577TBT11_DM_ARRIVAL_FLG[0] ;
         A578TBT11_DM_ARRIVAL_DATETIME = T000Q4_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A578TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A578TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n578TBT11_DM_ARRIVAL_DATETIME = T000Q4_n578TBT11_DM_ARRIVAL_DATETIME[0] ;
         A579TBT11_APPROVAL_FLG = T000Q4_A579TBT11_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A579TBT11_APPROVAL_FLG", A579TBT11_APPROVAL_FLG);
         n579TBT11_APPROVAL_FLG = T000Q4_n579TBT11_APPROVAL_FLG[0] ;
         A580TBT11_APPROVAL_DATETIME = T000Q4_A580TBT11_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A580TBT11_APPROVAL_DATETIME", localUtil.ttoc( A580TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n580TBT11_APPROVAL_DATETIME = T000Q4_n580TBT11_APPROVAL_DATETIME[0] ;
         A581TBT11_APPROVAL_USER_ID = T000Q4_A581TBT11_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A581TBT11_APPROVAL_USER_ID", A581TBT11_APPROVAL_USER_ID);
         n581TBT11_APPROVAL_USER_ID = T000Q4_n581TBT11_APPROVAL_USER_ID[0] ;
         A582TBT11_APPROVAL_AUTH_CD = T000Q4_A582TBT11_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A582TBT11_APPROVAL_AUTH_CD", A582TBT11_APPROVAL_AUTH_CD);
         n582TBT11_APPROVAL_AUTH_CD = T000Q4_n582TBT11_APPROVAL_AUTH_CD[0] ;
         A583TBT11_INPUT_END_FLG = T000Q4_A583TBT11_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583TBT11_INPUT_END_FLG", A583TBT11_INPUT_END_FLG);
         n583TBT11_INPUT_END_FLG = T000Q4_n583TBT11_INPUT_END_FLG[0] ;
         A584TBT11_INPUT_END_DATETIME = T000Q4_A584TBT11_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584TBT11_INPUT_END_DATETIME", localUtil.ttoc( A584TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n584TBT11_INPUT_END_DATETIME = T000Q4_n584TBT11_INPUT_END_DATETIME[0] ;
         A585TBT11_INPUT_END_USER_ID = T000Q4_A585TBT11_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A585TBT11_INPUT_END_USER_ID", A585TBT11_INPUT_END_USER_ID);
         n585TBT11_INPUT_END_USER_ID = T000Q4_n585TBT11_INPUT_END_USER_ID[0] ;
         A586TBT11_INPUT_END_AUTH_CD = T000Q4_A586TBT11_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A586TBT11_INPUT_END_AUTH_CD", A586TBT11_INPUT_END_AUTH_CD);
         n586TBT11_INPUT_END_AUTH_CD = T000Q4_n586TBT11_INPUT_END_AUTH_CD[0] ;
         A884TBT11_UPD_RIYU = T000Q4_A884TBT11_UPD_RIYU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A884TBT11_UPD_RIYU", A884TBT11_UPD_RIYU);
         n884TBT11_UPD_RIYU = T000Q4_n884TBT11_UPD_RIYU[0] ;
         A307TBT11_DEL_FLG = T000Q4_A307TBT11_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307TBT11_DEL_FLG", A307TBT11_DEL_FLG);
         n307TBT11_DEL_FLG = T000Q4_n307TBT11_DEL_FLG[0] ;
         A310TBT11_CRT_PROG_NM = T000Q4_A310TBT11_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A310TBT11_CRT_PROG_NM", A310TBT11_CRT_PROG_NM);
         n310TBT11_CRT_PROG_NM = T000Q4_n310TBT11_CRT_PROG_NM[0] ;
         A313TBT11_UPD_PROG_NM = T000Q4_A313TBT11_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A313TBT11_UPD_PROG_NM", A313TBT11_UPD_PROG_NM);
         n313TBT11_UPD_PROG_NM = T000Q4_n313TBT11_UPD_PROG_NM[0] ;
         zm0Q25( -12) ;
      }
      pr_default.close(2);
      onLoadActions0Q25( ) ;
   }

   public void onLoadActions0Q25( )
   {
      AV9Pgmname = "TBT11_CRF_HISTORY" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0Q25( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBT11_CRF_HISTORY" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A574TBT11_UPLOAD_DATETIME) || (( A574TBT11_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A574TBT11_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A578TBT11_DM_ARRIVAL_DATETIME) || (( A578TBT11_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A578TBT11_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A580TBT11_APPROVAL_DATETIME) || (( A580TBT11_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A580TBT11_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A584TBT11_INPUT_END_DATETIME) || (( A584TBT11_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A584TBT11_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A308TBT11_CRT_DATETIME) || (( A308TBT11_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A308TBT11_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A311TBT11_UPD_DATETIME) || (( A311TBT11_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A311TBT11_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0Q25( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0Q25( )
   {
      /* Using cursor T000Q5 */
      pr_default.execute(3, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound25 = (short)(1) ;
      }
      else
      {
         RcdFound25 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000Q3 */
      pr_default.execute(1, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0Q25( 12) ;
         RcdFound25 = (short)(1) ;
         A303TBT11_STUDY_ID = T000Q3_A303TBT11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
         A304TBT11_SUBJECT_ID = T000Q3_A304TBT11_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
         A305TBT11_CRF_ID = T000Q3_A305TBT11_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
         A306TBT11_CRF_VERSION = T000Q3_A306TBT11_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
         A308TBT11_CRT_DATETIME = T000Q3_A308TBT11_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A308TBT11_CRT_DATETIME", localUtil.ttoc( A308TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n308TBT11_CRT_DATETIME = T000Q3_n308TBT11_CRT_DATETIME[0] ;
         A309TBT11_CRT_USER_ID = T000Q3_A309TBT11_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A309TBT11_CRT_USER_ID", A309TBT11_CRT_USER_ID);
         n309TBT11_CRT_USER_ID = T000Q3_n309TBT11_CRT_USER_ID[0] ;
         A311TBT11_UPD_DATETIME = T000Q3_A311TBT11_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A311TBT11_UPD_DATETIME", localUtil.ttoc( A311TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n311TBT11_UPD_DATETIME = T000Q3_n311TBT11_UPD_DATETIME[0] ;
         A312TBT11_UPD_USER_ID = T000Q3_A312TBT11_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A312TBT11_UPD_USER_ID", A312TBT11_UPD_USER_ID);
         n312TBT11_UPD_USER_ID = T000Q3_n312TBT11_UPD_USER_ID[0] ;
         A314TBT11_UPD_CNT = T000Q3_A314TBT11_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A314TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)));
         n314TBT11_UPD_CNT = T000Q3_n314TBT11_UPD_CNT[0] ;
         A573TBT11_CRF_INPUT_LEVEL = T000Q3_A573TBT11_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A573TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A573TBT11_CRF_INPUT_LEVEL, 2, 0)));
         n573TBT11_CRF_INPUT_LEVEL = T000Q3_n573TBT11_CRF_INPUT_LEVEL[0] ;
         A574TBT11_UPLOAD_DATETIME = T000Q3_A574TBT11_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A574TBT11_UPLOAD_DATETIME", localUtil.ttoc( A574TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n574TBT11_UPLOAD_DATETIME = T000Q3_n574TBT11_UPLOAD_DATETIME[0] ;
         A575TBT11_UPLOAD_USER_ID = T000Q3_A575TBT11_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A575TBT11_UPLOAD_USER_ID", A575TBT11_UPLOAD_USER_ID);
         n575TBT11_UPLOAD_USER_ID = T000Q3_n575TBT11_UPLOAD_USER_ID[0] ;
         A576TBT11_UPLOAD_AUTH_CD = T000Q3_A576TBT11_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A576TBT11_UPLOAD_AUTH_CD", A576TBT11_UPLOAD_AUTH_CD);
         n576TBT11_UPLOAD_AUTH_CD = T000Q3_n576TBT11_UPLOAD_AUTH_CD[0] ;
         A577TBT11_DM_ARRIVAL_FLG = T000Q3_A577TBT11_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A577TBT11_DM_ARRIVAL_FLG", A577TBT11_DM_ARRIVAL_FLG);
         n577TBT11_DM_ARRIVAL_FLG = T000Q3_n577TBT11_DM_ARRIVAL_FLG[0] ;
         A578TBT11_DM_ARRIVAL_DATETIME = T000Q3_A578TBT11_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A578TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A578TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n578TBT11_DM_ARRIVAL_DATETIME = T000Q3_n578TBT11_DM_ARRIVAL_DATETIME[0] ;
         A579TBT11_APPROVAL_FLG = T000Q3_A579TBT11_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A579TBT11_APPROVAL_FLG", A579TBT11_APPROVAL_FLG);
         n579TBT11_APPROVAL_FLG = T000Q3_n579TBT11_APPROVAL_FLG[0] ;
         A580TBT11_APPROVAL_DATETIME = T000Q3_A580TBT11_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A580TBT11_APPROVAL_DATETIME", localUtil.ttoc( A580TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n580TBT11_APPROVAL_DATETIME = T000Q3_n580TBT11_APPROVAL_DATETIME[0] ;
         A581TBT11_APPROVAL_USER_ID = T000Q3_A581TBT11_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A581TBT11_APPROVAL_USER_ID", A581TBT11_APPROVAL_USER_ID);
         n581TBT11_APPROVAL_USER_ID = T000Q3_n581TBT11_APPROVAL_USER_ID[0] ;
         A582TBT11_APPROVAL_AUTH_CD = T000Q3_A582TBT11_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A582TBT11_APPROVAL_AUTH_CD", A582TBT11_APPROVAL_AUTH_CD);
         n582TBT11_APPROVAL_AUTH_CD = T000Q3_n582TBT11_APPROVAL_AUTH_CD[0] ;
         A583TBT11_INPUT_END_FLG = T000Q3_A583TBT11_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A583TBT11_INPUT_END_FLG", A583TBT11_INPUT_END_FLG);
         n583TBT11_INPUT_END_FLG = T000Q3_n583TBT11_INPUT_END_FLG[0] ;
         A584TBT11_INPUT_END_DATETIME = T000Q3_A584TBT11_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A584TBT11_INPUT_END_DATETIME", localUtil.ttoc( A584TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n584TBT11_INPUT_END_DATETIME = T000Q3_n584TBT11_INPUT_END_DATETIME[0] ;
         A585TBT11_INPUT_END_USER_ID = T000Q3_A585TBT11_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A585TBT11_INPUT_END_USER_ID", A585TBT11_INPUT_END_USER_ID);
         n585TBT11_INPUT_END_USER_ID = T000Q3_n585TBT11_INPUT_END_USER_ID[0] ;
         A586TBT11_INPUT_END_AUTH_CD = T000Q3_A586TBT11_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A586TBT11_INPUT_END_AUTH_CD", A586TBT11_INPUT_END_AUTH_CD);
         n586TBT11_INPUT_END_AUTH_CD = T000Q3_n586TBT11_INPUT_END_AUTH_CD[0] ;
         A884TBT11_UPD_RIYU = T000Q3_A884TBT11_UPD_RIYU[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A884TBT11_UPD_RIYU", A884TBT11_UPD_RIYU);
         n884TBT11_UPD_RIYU = T000Q3_n884TBT11_UPD_RIYU[0] ;
         A307TBT11_DEL_FLG = T000Q3_A307TBT11_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A307TBT11_DEL_FLG", A307TBT11_DEL_FLG);
         n307TBT11_DEL_FLG = T000Q3_n307TBT11_DEL_FLG[0] ;
         A310TBT11_CRT_PROG_NM = T000Q3_A310TBT11_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A310TBT11_CRT_PROG_NM", A310TBT11_CRT_PROG_NM);
         n310TBT11_CRT_PROG_NM = T000Q3_n310TBT11_CRT_PROG_NM[0] ;
         A313TBT11_UPD_PROG_NM = T000Q3_A313TBT11_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A313TBT11_UPD_PROG_NM", A313TBT11_UPD_PROG_NM);
         n313TBT11_UPD_PROG_NM = T000Q3_n313TBT11_UPD_PROG_NM[0] ;
         O314TBT11_UPD_CNT = A314TBT11_UPD_CNT ;
         n314TBT11_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A314TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)));
         Z303TBT11_STUDY_ID = A303TBT11_STUDY_ID ;
         Z304TBT11_SUBJECT_ID = A304TBT11_SUBJECT_ID ;
         Z305TBT11_CRF_ID = A305TBT11_CRF_ID ;
         Z306TBT11_CRF_VERSION = A306TBT11_CRF_VERSION ;
         sMode25 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0Q25( ) ;
         Gx_mode = sMode25 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound25 = (short)(0) ;
         initializeNonKey0Q25( ) ;
         sMode25 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode25 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0Q25( ) ;
      if ( RcdFound25 == 0 )
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
      RcdFound25 = (short)(0) ;
      /* Using cursor T000Q6 */
      pr_default.execute(4, new Object[] {new Long(A303TBT11_STUDY_ID), new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Integer(A304TBT11_SUBJECT_ID), new Long(A303TBT11_STUDY_ID), new Short(A305TBT11_CRF_ID), new Short(A305TBT11_CRF_ID), new Integer(A304TBT11_SUBJECT_ID), new Long(A303TBT11_STUDY_ID), new Short(A306TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000Q6_A303TBT11_STUDY_ID[0] < A303TBT11_STUDY_ID ) || ( T000Q6_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q6_A304TBT11_SUBJECT_ID[0] < A304TBT11_SUBJECT_ID ) || ( T000Q6_A304TBT11_SUBJECT_ID[0] == A304TBT11_SUBJECT_ID ) && ( T000Q6_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q6_A305TBT11_CRF_ID[0] < A305TBT11_CRF_ID ) || ( T000Q6_A305TBT11_CRF_ID[0] == A305TBT11_CRF_ID ) && ( T000Q6_A304TBT11_SUBJECT_ID[0] == A304TBT11_SUBJECT_ID ) && ( T000Q6_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q6_A306TBT11_CRF_VERSION[0] < A306TBT11_CRF_VERSION ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000Q6_A303TBT11_STUDY_ID[0] > A303TBT11_STUDY_ID ) || ( T000Q6_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q6_A304TBT11_SUBJECT_ID[0] > A304TBT11_SUBJECT_ID ) || ( T000Q6_A304TBT11_SUBJECT_ID[0] == A304TBT11_SUBJECT_ID ) && ( T000Q6_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q6_A305TBT11_CRF_ID[0] > A305TBT11_CRF_ID ) || ( T000Q6_A305TBT11_CRF_ID[0] == A305TBT11_CRF_ID ) && ( T000Q6_A304TBT11_SUBJECT_ID[0] == A304TBT11_SUBJECT_ID ) && ( T000Q6_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q6_A306TBT11_CRF_VERSION[0] > A306TBT11_CRF_VERSION ) ) )
         {
            A303TBT11_STUDY_ID = T000Q6_A303TBT11_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
            A304TBT11_SUBJECT_ID = T000Q6_A304TBT11_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
            A305TBT11_CRF_ID = T000Q6_A305TBT11_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
            A306TBT11_CRF_VERSION = T000Q6_A306TBT11_CRF_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
            RcdFound25 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound25 = (short)(0) ;
      /* Using cursor T000Q7 */
      pr_default.execute(5, new Object[] {new Long(A303TBT11_STUDY_ID), new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Integer(A304TBT11_SUBJECT_ID), new Long(A303TBT11_STUDY_ID), new Short(A305TBT11_CRF_ID), new Short(A305TBT11_CRF_ID), new Integer(A304TBT11_SUBJECT_ID), new Long(A303TBT11_STUDY_ID), new Short(A306TBT11_CRF_VERSION)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000Q7_A303TBT11_STUDY_ID[0] > A303TBT11_STUDY_ID ) || ( T000Q7_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q7_A304TBT11_SUBJECT_ID[0] > A304TBT11_SUBJECT_ID ) || ( T000Q7_A304TBT11_SUBJECT_ID[0] == A304TBT11_SUBJECT_ID ) && ( T000Q7_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q7_A305TBT11_CRF_ID[0] > A305TBT11_CRF_ID ) || ( T000Q7_A305TBT11_CRF_ID[0] == A305TBT11_CRF_ID ) && ( T000Q7_A304TBT11_SUBJECT_ID[0] == A304TBT11_SUBJECT_ID ) && ( T000Q7_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q7_A306TBT11_CRF_VERSION[0] > A306TBT11_CRF_VERSION ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000Q7_A303TBT11_STUDY_ID[0] < A303TBT11_STUDY_ID ) || ( T000Q7_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q7_A304TBT11_SUBJECT_ID[0] < A304TBT11_SUBJECT_ID ) || ( T000Q7_A304TBT11_SUBJECT_ID[0] == A304TBT11_SUBJECT_ID ) && ( T000Q7_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q7_A305TBT11_CRF_ID[0] < A305TBT11_CRF_ID ) || ( T000Q7_A305TBT11_CRF_ID[0] == A305TBT11_CRF_ID ) && ( T000Q7_A304TBT11_SUBJECT_ID[0] == A304TBT11_SUBJECT_ID ) && ( T000Q7_A303TBT11_STUDY_ID[0] == A303TBT11_STUDY_ID ) && ( T000Q7_A306TBT11_CRF_VERSION[0] < A306TBT11_CRF_VERSION ) ) )
         {
            A303TBT11_STUDY_ID = T000Q7_A303TBT11_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
            A304TBT11_SUBJECT_ID = T000Q7_A304TBT11_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
            A305TBT11_CRF_ID = T000Q7_A305TBT11_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
            A306TBT11_CRF_VERSION = T000Q7_A306TBT11_CRF_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
            RcdFound25 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0Q25( ) ;
      if ( RcdFound25 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBT11_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A303TBT11_STUDY_ID != Z303TBT11_STUDY_ID ) || ( A304TBT11_SUBJECT_ID != Z304TBT11_SUBJECT_ID ) || ( A305TBT11_CRF_ID != Z305TBT11_CRF_ID ) || ( A306TBT11_CRF_VERSION != Z306TBT11_CRF_VERSION ) )
         {
            A303TBT11_STUDY_ID = Z303TBT11_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
            A304TBT11_SUBJECT_ID = Z304TBT11_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
            A305TBT11_CRF_ID = Z305TBT11_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
            A306TBT11_CRF_VERSION = Z306TBT11_CRF_VERSION ;
            httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBT11_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update0Q25( ) ;
            GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A303TBT11_STUDY_ID != Z303TBT11_STUDY_ID ) || ( A304TBT11_SUBJECT_ID != Z304TBT11_SUBJECT_ID ) || ( A305TBT11_CRF_ID != Z305TBT11_CRF_ID ) || ( A306TBT11_CRF_VERSION != Z306TBT11_CRF_VERSION ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0Q25( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBT11_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0Q25( ) ;
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
      if ( ( A303TBT11_STUDY_ID != Z303TBT11_STUDY_ID ) || ( A304TBT11_SUBJECT_ID != Z304TBT11_SUBJECT_ID ) || ( A305TBT11_CRF_ID != Z305TBT11_CRF_ID ) || ( A306TBT11_CRF_VERSION != Z306TBT11_CRF_VERSION ) )
      {
         A303TBT11_STUDY_ID = Z303TBT11_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
         A304TBT11_SUBJECT_ID = Z304TBT11_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
         A305TBT11_CRF_ID = Z305TBT11_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
         A306TBT11_CRF_VERSION = Z306TBT11_CRF_VERSION ;
         httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBT11_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBT11_STUDY_ID_Internalname ;
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
      if ( RcdFound25 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT11_STUDY_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0Q25( ) ;
      if ( RcdFound25 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0Q25( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound25 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
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
      if ( RcdFound25 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0Q25( ) ;
      if ( RcdFound25 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound25 != 0 )
         {
            scanNext0Q25( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0Q25( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0Q25( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000Q2 */
         pr_default.execute(0, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT11_CRF_HISTORY"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z308TBT11_CRT_DATETIME.equals( T000Q2_A308TBT11_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z309TBT11_CRT_USER_ID, T000Q2_A309TBT11_CRT_USER_ID[0]) != 0 ) || !( Z311TBT11_UPD_DATETIME.equals( T000Q2_A311TBT11_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z312TBT11_UPD_USER_ID, T000Q2_A312TBT11_UPD_USER_ID[0]) != 0 ) || ( Z314TBT11_UPD_CNT != T000Q2_A314TBT11_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z573TBT11_CRF_INPUT_LEVEL != T000Q2_A573TBT11_CRF_INPUT_LEVEL[0] ) || !( Z574TBT11_UPLOAD_DATETIME.equals( T000Q2_A574TBT11_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z575TBT11_UPLOAD_USER_ID, T000Q2_A575TBT11_UPLOAD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z576TBT11_UPLOAD_AUTH_CD, T000Q2_A576TBT11_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z577TBT11_DM_ARRIVAL_FLG, T000Q2_A577TBT11_DM_ARRIVAL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( Z578TBT11_DM_ARRIVAL_DATETIME.equals( T000Q2_A578TBT11_DM_ARRIVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z579TBT11_APPROVAL_FLG, T000Q2_A579TBT11_APPROVAL_FLG[0]) != 0 ) || !( Z580TBT11_APPROVAL_DATETIME.equals( T000Q2_A580TBT11_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z581TBT11_APPROVAL_USER_ID, T000Q2_A581TBT11_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z582TBT11_APPROVAL_AUTH_CD, T000Q2_A582TBT11_APPROVAL_AUTH_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z583TBT11_INPUT_END_FLG, T000Q2_A583TBT11_INPUT_END_FLG[0]) != 0 ) || !( Z584TBT11_INPUT_END_DATETIME.equals( T000Q2_A584TBT11_INPUT_END_DATETIME[0] ) ) || ( GXutil.strcmp(Z585TBT11_INPUT_END_USER_ID, T000Q2_A585TBT11_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z586TBT11_INPUT_END_AUTH_CD, T000Q2_A586TBT11_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z884TBT11_UPD_RIYU, T000Q2_A884TBT11_UPD_RIYU[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z307TBT11_DEL_FLG, T000Q2_A307TBT11_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z310TBT11_CRT_PROG_NM, T000Q2_A310TBT11_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z313TBT11_UPD_PROG_NM, T000Q2_A313TBT11_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT11_CRF_HISTORY"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Q25( )
   {
      beforeValidate0Q25( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q25( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Q25( 0) ;
         checkOptimisticConcurrency0Q25( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q25( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Q25( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Q8 */
                  pr_default.execute(6, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION), new Boolean(n308TBT11_CRT_DATETIME), A308TBT11_CRT_DATETIME, new Boolean(n309TBT11_CRT_USER_ID), A309TBT11_CRT_USER_ID, new Boolean(n311TBT11_UPD_DATETIME), A311TBT11_UPD_DATETIME, new Boolean(n312TBT11_UPD_USER_ID), A312TBT11_UPD_USER_ID, new Boolean(n314TBT11_UPD_CNT), new Long(A314TBT11_UPD_CNT), new Boolean(n573TBT11_CRF_INPUT_LEVEL), new Byte(A573TBT11_CRF_INPUT_LEVEL), new Boolean(n574TBT11_UPLOAD_DATETIME), A574TBT11_UPLOAD_DATETIME, new Boolean(n575TBT11_UPLOAD_USER_ID), A575TBT11_UPLOAD_USER_ID, new Boolean(n576TBT11_UPLOAD_AUTH_CD), A576TBT11_UPLOAD_AUTH_CD, new Boolean(n577TBT11_DM_ARRIVAL_FLG), A577TBT11_DM_ARRIVAL_FLG, new Boolean(n578TBT11_DM_ARRIVAL_DATETIME), A578TBT11_DM_ARRIVAL_DATETIME, new Boolean(n579TBT11_APPROVAL_FLG), A579TBT11_APPROVAL_FLG, new Boolean(n580TBT11_APPROVAL_DATETIME), A580TBT11_APPROVAL_DATETIME, new Boolean(n581TBT11_APPROVAL_USER_ID), A581TBT11_APPROVAL_USER_ID, new Boolean(n582TBT11_APPROVAL_AUTH_CD), A582TBT11_APPROVAL_AUTH_CD, new Boolean(n583TBT11_INPUT_END_FLG), A583TBT11_INPUT_END_FLG, new Boolean(n584TBT11_INPUT_END_DATETIME), A584TBT11_INPUT_END_DATETIME, new Boolean(n585TBT11_INPUT_END_USER_ID), A585TBT11_INPUT_END_USER_ID, new Boolean(n586TBT11_INPUT_END_AUTH_CD), A586TBT11_INPUT_END_AUTH_CD, new Boolean(n884TBT11_UPD_RIYU), A884TBT11_UPD_RIYU, new Boolean(n307TBT11_DEL_FLG), A307TBT11_DEL_FLG, new Boolean(n310TBT11_CRT_PROG_NM), A310TBT11_CRT_PROG_NM, new Boolean(n313TBT11_UPD_PROG_NM), A313TBT11_UPD_PROG_NM});
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
                        resetCaption0Q0( ) ;
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
            load0Q25( ) ;
         }
         endLevel0Q25( ) ;
      }
      closeExtendedTableCursors0Q25( ) ;
   }

   public void update0Q25( )
   {
      beforeValidate0Q25( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Q25( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q25( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Q25( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Q25( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Q9 */
                  pr_default.execute(7, new Object[] {new Boolean(n308TBT11_CRT_DATETIME), A308TBT11_CRT_DATETIME, new Boolean(n309TBT11_CRT_USER_ID), A309TBT11_CRT_USER_ID, new Boolean(n311TBT11_UPD_DATETIME), A311TBT11_UPD_DATETIME, new Boolean(n312TBT11_UPD_USER_ID), A312TBT11_UPD_USER_ID, new Boolean(n314TBT11_UPD_CNT), new Long(A314TBT11_UPD_CNT), new Boolean(n573TBT11_CRF_INPUT_LEVEL), new Byte(A573TBT11_CRF_INPUT_LEVEL), new Boolean(n574TBT11_UPLOAD_DATETIME), A574TBT11_UPLOAD_DATETIME, new Boolean(n575TBT11_UPLOAD_USER_ID), A575TBT11_UPLOAD_USER_ID, new Boolean(n576TBT11_UPLOAD_AUTH_CD), A576TBT11_UPLOAD_AUTH_CD, new Boolean(n577TBT11_DM_ARRIVAL_FLG), A577TBT11_DM_ARRIVAL_FLG, new Boolean(n578TBT11_DM_ARRIVAL_DATETIME), A578TBT11_DM_ARRIVAL_DATETIME, new Boolean(n579TBT11_APPROVAL_FLG), A579TBT11_APPROVAL_FLG, new Boolean(n580TBT11_APPROVAL_DATETIME), A580TBT11_APPROVAL_DATETIME, new Boolean(n581TBT11_APPROVAL_USER_ID), A581TBT11_APPROVAL_USER_ID, new Boolean(n582TBT11_APPROVAL_AUTH_CD), A582TBT11_APPROVAL_AUTH_CD, new Boolean(n583TBT11_INPUT_END_FLG), A583TBT11_INPUT_END_FLG, new Boolean(n584TBT11_INPUT_END_DATETIME), A584TBT11_INPUT_END_DATETIME, new Boolean(n585TBT11_INPUT_END_USER_ID), A585TBT11_INPUT_END_USER_ID, new Boolean(n586TBT11_INPUT_END_AUTH_CD), A586TBT11_INPUT_END_AUTH_CD, new Boolean(n884TBT11_UPD_RIYU), A884TBT11_UPD_RIYU, new Boolean(n307TBT11_DEL_FLG), A307TBT11_DEL_FLG, new Boolean(n310TBT11_CRT_PROG_NM), A310TBT11_CRT_PROG_NM, new Boolean(n313TBT11_UPD_PROG_NM), A313TBT11_UPD_PROG_NM, new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT11_CRF_HISTORY"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Q25( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption0Q0( ) ;
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
         endLevel0Q25( ) ;
      }
      closeExtendedTableCursors0Q25( ) ;
   }

   public void deferredUpdate0Q25( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0Q25( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Q25( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Q25( ) ;
         afterConfirm0Q25( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Q25( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000Q10 */
               pr_default.execute(8, new Object[] {new Long(A303TBT11_STUDY_ID), new Integer(A304TBT11_SUBJECT_ID), new Short(A305TBT11_CRF_ID), new Short(A306TBT11_CRF_VERSION)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound25 == 0 )
                     {
                        initAll0Q25( ) ;
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
                     resetCaption0Q0( ) ;
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
      sMode25 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0Q25( ) ;
      Gx_mode = sMode25 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0Q25( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT11_CRF_HISTORY" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0Q25( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0Q25( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbt11_crf_history");
         if ( AnyError == 0 )
         {
            confirmValues0Q0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbt11_crf_history");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0Q25( )
   {
      /* Using cursor T000Q11 */
      pr_default.execute(9);
      RcdFound25 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound25 = (short)(1) ;
         A303TBT11_STUDY_ID = T000Q11_A303TBT11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
         A304TBT11_SUBJECT_ID = T000Q11_A304TBT11_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
         A305TBT11_CRF_ID = T000Q11_A305TBT11_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
         A306TBT11_CRF_VERSION = T000Q11_A306TBT11_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0Q25( )
   {
      pr_default.readNext(9);
      RcdFound25 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound25 = (short)(1) ;
         A303TBT11_STUDY_ID = T000Q11_A303TBT11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
         A304TBT11_SUBJECT_ID = T000Q11_A304TBT11_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
         A305TBT11_CRF_ID = T000Q11_A305TBT11_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
         A306TBT11_CRF_VERSION = T000Q11_A306TBT11_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
      }
   }

   public void scanEnd0Q25( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0Q25( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0Q25( )
   {
      /* Before Insert Rules */
      A308TBT11_CRT_DATETIME = GXutil.now( ) ;
      n308TBT11_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A308TBT11_CRT_DATETIME", localUtil.ttoc( A308TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A309TBT11_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt11_crf_history_impl.this.GXt_char3 = GXv_char4[0] ;
      A309TBT11_CRT_USER_ID = GXt_char3 ;
      n309TBT11_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A309TBT11_CRT_USER_ID", A309TBT11_CRT_USER_ID);
      A311TBT11_UPD_DATETIME = GXutil.now( ) ;
      n311TBT11_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A311TBT11_UPD_DATETIME", localUtil.ttoc( A311TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A312TBT11_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt11_crf_history_impl.this.GXt_char3 = GXv_char4[0] ;
      A312TBT11_UPD_USER_ID = GXt_char3 ;
      n312TBT11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A312TBT11_UPD_USER_ID", A312TBT11_UPD_USER_ID);
      A314TBT11_UPD_CNT = (long)(O314TBT11_UPD_CNT+1) ;
      n314TBT11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A314TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0Q25( )
   {
      /* Before Update Rules */
      A311TBT11_UPD_DATETIME = GXutil.now( ) ;
      n311TBT11_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A311TBT11_UPD_DATETIME", localUtil.ttoc( A311TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A312TBT11_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt11_crf_history_impl.this.GXt_char3 = GXv_char4[0] ;
      A312TBT11_UPD_USER_ID = GXt_char3 ;
      n312TBT11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A312TBT11_UPD_USER_ID", A312TBT11_UPD_USER_ID);
      A314TBT11_UPD_CNT = (long)(O314TBT11_UPD_CNT+1) ;
      n314TBT11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A314TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0Q25( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Q25( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Q25( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Q25( )
   {
      edtTBT11_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_STUDY_ID_Enabled, 5, 0)));
      edtTBT11_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_SUBJECT_ID_Enabled, 5, 0)));
      edtTBT11_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRF_ID_Enabled, 5, 0)));
      edtTBT11_CRF_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRF_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRF_VERSION_Enabled, 5, 0)));
      edtTBT11_CRF_INPUT_LEVEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRF_INPUT_LEVEL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRF_INPUT_LEVEL_Enabled, 5, 0)));
      edtTBT11_UPLOAD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPLOAD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPLOAD_DATETIME_Enabled, 5, 0)));
      edtTBT11_UPLOAD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPLOAD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPLOAD_USER_ID_Enabled, 5, 0)));
      edtTBT11_UPLOAD_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPLOAD_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPLOAD_AUTH_CD_Enabled, 5, 0)));
      edtTBT11_DM_ARRIVAL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_DM_ARRIVAL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_DM_ARRIVAL_FLG_Enabled, 5, 0)));
      edtTBT11_DM_ARRIVAL_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_DM_ARRIVAL_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_DM_ARRIVAL_DATETIME_Enabled, 5, 0)));
      edtTBT11_APPROVAL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_APPROVAL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_APPROVAL_FLG_Enabled, 5, 0)));
      edtTBT11_APPROVAL_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_APPROVAL_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_APPROVAL_DATETIME_Enabled, 5, 0)));
      edtTBT11_APPROVAL_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_APPROVAL_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_APPROVAL_USER_ID_Enabled, 5, 0)));
      edtTBT11_APPROVAL_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_APPROVAL_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_APPROVAL_AUTH_CD_Enabled, 5, 0)));
      edtTBT11_INPUT_END_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_INPUT_END_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_INPUT_END_FLG_Enabled, 5, 0)));
      edtTBT11_INPUT_END_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_INPUT_END_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_INPUT_END_DATETIME_Enabled, 5, 0)));
      edtTBT11_INPUT_END_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_INPUT_END_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_INPUT_END_USER_ID_Enabled, 5, 0)));
      edtTBT11_INPUT_END_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_INPUT_END_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_INPUT_END_AUTH_CD_Enabled, 5, 0)));
      edtTBT11_UPD_RIYU_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPD_RIYU_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPD_RIYU_Enabled, 5, 0)));
      edtTBT11_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_DEL_FLG_Enabled, 5, 0)));
      edtTBT11_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRT_DATETIME_Enabled, 5, 0)));
      edtTBT11_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRT_USER_ID_Enabled, 5, 0)));
      edtTBT11_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBT11_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPD_DATETIME_Enabled, 5, 0)));
      edtTBT11_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPD_USER_ID_Enabled, 5, 0)));
      edtTBT11_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBT11_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT11_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT11_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0Q0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRF修正履歴テーブル") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbt11_crf_history") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0Q25( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z303TBT11_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z303TBT11_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z304TBT11_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z304TBT11_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z305TBT11_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z305TBT11_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z306TBT11_CRF_VERSION", GXutil.ltrim( localUtil.ntoc( Z306TBT11_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z308TBT11_CRT_DATETIME", localUtil.ttoc( Z308TBT11_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z309TBT11_CRT_USER_ID", GXutil.rtrim( Z309TBT11_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z311TBT11_UPD_DATETIME", localUtil.ttoc( Z311TBT11_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z312TBT11_UPD_USER_ID", GXutil.rtrim( Z312TBT11_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z314TBT11_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z314TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z573TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( localUtil.ntoc( Z573TBT11_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z574TBT11_UPLOAD_DATETIME", localUtil.ttoc( Z574TBT11_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z575TBT11_UPLOAD_USER_ID", GXutil.rtrim( Z575TBT11_UPLOAD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z576TBT11_UPLOAD_AUTH_CD", GXutil.rtrim( Z576TBT11_UPLOAD_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z577TBT11_DM_ARRIVAL_FLG", GXutil.rtrim( Z577TBT11_DM_ARRIVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z578TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( Z578TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z579TBT11_APPROVAL_FLG", GXutil.rtrim( Z579TBT11_APPROVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z580TBT11_APPROVAL_DATETIME", localUtil.ttoc( Z580TBT11_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z581TBT11_APPROVAL_USER_ID", GXutil.rtrim( Z581TBT11_APPROVAL_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z582TBT11_APPROVAL_AUTH_CD", GXutil.rtrim( Z582TBT11_APPROVAL_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z583TBT11_INPUT_END_FLG", GXutil.rtrim( Z583TBT11_INPUT_END_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z584TBT11_INPUT_END_DATETIME", localUtil.ttoc( Z584TBT11_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z585TBT11_INPUT_END_USER_ID", GXutil.rtrim( Z585TBT11_INPUT_END_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z586TBT11_INPUT_END_AUTH_CD", GXutil.rtrim( Z586TBT11_INPUT_END_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z884TBT11_UPD_RIYU", GXutil.rtrim( Z884TBT11_UPD_RIYU));
      GxWebStd.gx_hidden_field( httpContext, "Z307TBT11_DEL_FLG", GXutil.rtrim( Z307TBT11_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z310TBT11_CRT_PROG_NM", GXutil.rtrim( Z310TBT11_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z313TBT11_UPD_PROG_NM", GXutil.rtrim( Z313TBT11_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O314TBT11_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O314TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0Q25( )
   {
      A308TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n308TBT11_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A308TBT11_CRT_DATETIME", localUtil.ttoc( A308TBT11_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n308TBT11_CRT_DATETIME = (GXutil.nullDate().equals(A308TBT11_CRT_DATETIME) ? true : false) ;
      A309TBT11_CRT_USER_ID = "" ;
      n309TBT11_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A309TBT11_CRT_USER_ID", A309TBT11_CRT_USER_ID);
      n309TBT11_CRT_USER_ID = ((GXutil.strcmp("", A309TBT11_CRT_USER_ID)==0) ? true : false) ;
      A311TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n311TBT11_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A311TBT11_UPD_DATETIME", localUtil.ttoc( A311TBT11_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n311TBT11_UPD_DATETIME = (GXutil.nullDate().equals(A311TBT11_UPD_DATETIME) ? true : false) ;
      A312TBT11_UPD_USER_ID = "" ;
      n312TBT11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A312TBT11_UPD_USER_ID", A312TBT11_UPD_USER_ID);
      n312TBT11_UPD_USER_ID = ((GXutil.strcmp("", A312TBT11_UPD_USER_ID)==0) ? true : false) ;
      A314TBT11_UPD_CNT = 0 ;
      n314TBT11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A314TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)));
      n314TBT11_UPD_CNT = ((0==A314TBT11_UPD_CNT) ? true : false) ;
      A573TBT11_CRF_INPUT_LEVEL = (byte)(0) ;
      n573TBT11_CRF_INPUT_LEVEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A573TBT11_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A573TBT11_CRF_INPUT_LEVEL, 2, 0)));
      n573TBT11_CRF_INPUT_LEVEL = ((0==A573TBT11_CRF_INPUT_LEVEL) ? true : false) ;
      A574TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n574TBT11_UPLOAD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A574TBT11_UPLOAD_DATETIME", localUtil.ttoc( A574TBT11_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n574TBT11_UPLOAD_DATETIME = (GXutil.nullDate().equals(A574TBT11_UPLOAD_DATETIME) ? true : false) ;
      A575TBT11_UPLOAD_USER_ID = "" ;
      n575TBT11_UPLOAD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A575TBT11_UPLOAD_USER_ID", A575TBT11_UPLOAD_USER_ID);
      n575TBT11_UPLOAD_USER_ID = ((GXutil.strcmp("", A575TBT11_UPLOAD_USER_ID)==0) ? true : false) ;
      A576TBT11_UPLOAD_AUTH_CD = "" ;
      n576TBT11_UPLOAD_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A576TBT11_UPLOAD_AUTH_CD", A576TBT11_UPLOAD_AUTH_CD);
      n576TBT11_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A576TBT11_UPLOAD_AUTH_CD)==0) ? true : false) ;
      A577TBT11_DM_ARRIVAL_FLG = "" ;
      n577TBT11_DM_ARRIVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A577TBT11_DM_ARRIVAL_FLG", A577TBT11_DM_ARRIVAL_FLG);
      n577TBT11_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A577TBT11_DM_ARRIVAL_FLG)==0) ? true : false) ;
      A578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n578TBT11_DM_ARRIVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A578TBT11_DM_ARRIVAL_DATETIME", localUtil.ttoc( A578TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n578TBT11_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A578TBT11_DM_ARRIVAL_DATETIME) ? true : false) ;
      A579TBT11_APPROVAL_FLG = "" ;
      n579TBT11_APPROVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A579TBT11_APPROVAL_FLG", A579TBT11_APPROVAL_FLG);
      n579TBT11_APPROVAL_FLG = ((GXutil.strcmp("", A579TBT11_APPROVAL_FLG)==0) ? true : false) ;
      A580TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n580TBT11_APPROVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A580TBT11_APPROVAL_DATETIME", localUtil.ttoc( A580TBT11_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n580TBT11_APPROVAL_DATETIME = (GXutil.nullDate().equals(A580TBT11_APPROVAL_DATETIME) ? true : false) ;
      A581TBT11_APPROVAL_USER_ID = "" ;
      n581TBT11_APPROVAL_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A581TBT11_APPROVAL_USER_ID", A581TBT11_APPROVAL_USER_ID);
      n581TBT11_APPROVAL_USER_ID = ((GXutil.strcmp("", A581TBT11_APPROVAL_USER_ID)==0) ? true : false) ;
      A582TBT11_APPROVAL_AUTH_CD = "" ;
      n582TBT11_APPROVAL_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A582TBT11_APPROVAL_AUTH_CD", A582TBT11_APPROVAL_AUTH_CD);
      n582TBT11_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A582TBT11_APPROVAL_AUTH_CD)==0) ? true : false) ;
      A583TBT11_INPUT_END_FLG = "" ;
      n583TBT11_INPUT_END_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A583TBT11_INPUT_END_FLG", A583TBT11_INPUT_END_FLG);
      n583TBT11_INPUT_END_FLG = ((GXutil.strcmp("", A583TBT11_INPUT_END_FLG)==0) ? true : false) ;
      A584TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n584TBT11_INPUT_END_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A584TBT11_INPUT_END_DATETIME", localUtil.ttoc( A584TBT11_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n584TBT11_INPUT_END_DATETIME = (GXutil.nullDate().equals(A584TBT11_INPUT_END_DATETIME) ? true : false) ;
      A585TBT11_INPUT_END_USER_ID = "" ;
      n585TBT11_INPUT_END_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A585TBT11_INPUT_END_USER_ID", A585TBT11_INPUT_END_USER_ID);
      n585TBT11_INPUT_END_USER_ID = ((GXutil.strcmp("", A585TBT11_INPUT_END_USER_ID)==0) ? true : false) ;
      A586TBT11_INPUT_END_AUTH_CD = "" ;
      n586TBT11_INPUT_END_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A586TBT11_INPUT_END_AUTH_CD", A586TBT11_INPUT_END_AUTH_CD);
      n586TBT11_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A586TBT11_INPUT_END_AUTH_CD)==0) ? true : false) ;
      A884TBT11_UPD_RIYU = "" ;
      n884TBT11_UPD_RIYU = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A884TBT11_UPD_RIYU", A884TBT11_UPD_RIYU);
      n884TBT11_UPD_RIYU = ((GXutil.strcmp("", A884TBT11_UPD_RIYU)==0) ? true : false) ;
      A307TBT11_DEL_FLG = "" ;
      n307TBT11_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A307TBT11_DEL_FLG", A307TBT11_DEL_FLG);
      n307TBT11_DEL_FLG = ((GXutil.strcmp("", A307TBT11_DEL_FLG)==0) ? true : false) ;
      A310TBT11_CRT_PROG_NM = "" ;
      n310TBT11_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A310TBT11_CRT_PROG_NM", A310TBT11_CRT_PROG_NM);
      n310TBT11_CRT_PROG_NM = ((GXutil.strcmp("", A310TBT11_CRT_PROG_NM)==0) ? true : false) ;
      A313TBT11_UPD_PROG_NM = "" ;
      n313TBT11_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A313TBT11_UPD_PROG_NM", A313TBT11_UPD_PROG_NM);
      n313TBT11_UPD_PROG_NM = ((GXutil.strcmp("", A313TBT11_UPD_PROG_NM)==0) ? true : false) ;
      O314TBT11_UPD_CNT = A314TBT11_UPD_CNT ;
      n314TBT11_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A314TBT11_UPD_CNT", GXutil.ltrim( GXutil.str( A314TBT11_UPD_CNT, 10, 0)));
   }

   public void initAll0Q25( )
   {
      A303TBT11_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A303TBT11_STUDY_ID", GXutil.ltrim( GXutil.str( A303TBT11_STUDY_ID, 10, 0)));
      A304TBT11_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A304TBT11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A304TBT11_SUBJECT_ID, 6, 0)));
      A305TBT11_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A305TBT11_CRF_ID", GXutil.ltrim( GXutil.str( A305TBT11_CRF_ID, 4, 0)));
      A306TBT11_CRF_VERSION = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A306TBT11_CRF_VERSION", GXutil.ltrim( GXutil.str( A306TBT11_CRF_VERSION, 4, 0)));
      initializeNonKey0Q25( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14552949");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbt11_crf_history.js", "?14552949");
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
      lblTextblocktbt11_study_id_Internalname = "TEXTBLOCKTBT11_STUDY_ID" ;
      edtTBT11_STUDY_ID_Internalname = "TBT11_STUDY_ID" ;
      lblTextblocktbt11_subject_id_Internalname = "TEXTBLOCKTBT11_SUBJECT_ID" ;
      edtTBT11_SUBJECT_ID_Internalname = "TBT11_SUBJECT_ID" ;
      lblTextblocktbt11_crf_id_Internalname = "TEXTBLOCKTBT11_CRF_ID" ;
      edtTBT11_CRF_ID_Internalname = "TBT11_CRF_ID" ;
      lblTextblocktbt11_crf_version_Internalname = "TEXTBLOCKTBT11_CRF_VERSION" ;
      edtTBT11_CRF_VERSION_Internalname = "TBT11_CRF_VERSION" ;
      lblTextblocktbt11_crf_input_level_Internalname = "TEXTBLOCKTBT11_CRF_INPUT_LEVEL" ;
      edtTBT11_CRF_INPUT_LEVEL_Internalname = "TBT11_CRF_INPUT_LEVEL" ;
      lblTextblocktbt11_upload_datetime_Internalname = "TEXTBLOCKTBT11_UPLOAD_DATETIME" ;
      edtTBT11_UPLOAD_DATETIME_Internalname = "TBT11_UPLOAD_DATETIME" ;
      lblTextblocktbt11_upload_user_id_Internalname = "TEXTBLOCKTBT11_UPLOAD_USER_ID" ;
      edtTBT11_UPLOAD_USER_ID_Internalname = "TBT11_UPLOAD_USER_ID" ;
      lblTextblocktbt11_upload_auth_cd_Internalname = "TEXTBLOCKTBT11_UPLOAD_AUTH_CD" ;
      edtTBT11_UPLOAD_AUTH_CD_Internalname = "TBT11_UPLOAD_AUTH_CD" ;
      lblTextblocktbt11_dm_arrival_flg_Internalname = "TEXTBLOCKTBT11_DM_ARRIVAL_FLG" ;
      edtTBT11_DM_ARRIVAL_FLG_Internalname = "TBT11_DM_ARRIVAL_FLG" ;
      lblTextblocktbt11_dm_arrival_datetime_Internalname = "TEXTBLOCKTBT11_DM_ARRIVAL_DATETIME" ;
      edtTBT11_DM_ARRIVAL_DATETIME_Internalname = "TBT11_DM_ARRIVAL_DATETIME" ;
      lblTextblocktbt11_approval_flg_Internalname = "TEXTBLOCKTBT11_APPROVAL_FLG" ;
      edtTBT11_APPROVAL_FLG_Internalname = "TBT11_APPROVAL_FLG" ;
      lblTextblocktbt11_approval_datetime_Internalname = "TEXTBLOCKTBT11_APPROVAL_DATETIME" ;
      edtTBT11_APPROVAL_DATETIME_Internalname = "TBT11_APPROVAL_DATETIME" ;
      lblTextblocktbt11_approval_user_id_Internalname = "TEXTBLOCKTBT11_APPROVAL_USER_ID" ;
      edtTBT11_APPROVAL_USER_ID_Internalname = "TBT11_APPROVAL_USER_ID" ;
      lblTextblocktbt11_approval_auth_cd_Internalname = "TEXTBLOCKTBT11_APPROVAL_AUTH_CD" ;
      edtTBT11_APPROVAL_AUTH_CD_Internalname = "TBT11_APPROVAL_AUTH_CD" ;
      lblTextblocktbt11_input_end_flg_Internalname = "TEXTBLOCKTBT11_INPUT_END_FLG" ;
      edtTBT11_INPUT_END_FLG_Internalname = "TBT11_INPUT_END_FLG" ;
      lblTextblocktbt11_input_end_datetime_Internalname = "TEXTBLOCKTBT11_INPUT_END_DATETIME" ;
      edtTBT11_INPUT_END_DATETIME_Internalname = "TBT11_INPUT_END_DATETIME" ;
      lblTextblocktbt11_input_end_user_id_Internalname = "TEXTBLOCKTBT11_INPUT_END_USER_ID" ;
      edtTBT11_INPUT_END_USER_ID_Internalname = "TBT11_INPUT_END_USER_ID" ;
      lblTextblocktbt11_input_end_auth_cd_Internalname = "TEXTBLOCKTBT11_INPUT_END_AUTH_CD" ;
      edtTBT11_INPUT_END_AUTH_CD_Internalname = "TBT11_INPUT_END_AUTH_CD" ;
      lblTextblocktbt11_upd_riyu_Internalname = "TEXTBLOCKTBT11_UPD_RIYU" ;
      edtTBT11_UPD_RIYU_Internalname = "TBT11_UPD_RIYU" ;
      lblTextblocktbt11_del_flg_Internalname = "TEXTBLOCKTBT11_DEL_FLG" ;
      edtTBT11_DEL_FLG_Internalname = "TBT11_DEL_FLG" ;
      lblTextblocktbt11_crt_datetime_Internalname = "TEXTBLOCKTBT11_CRT_DATETIME" ;
      edtTBT11_CRT_DATETIME_Internalname = "TBT11_CRT_DATETIME" ;
      lblTextblocktbt11_crt_user_id_Internalname = "TEXTBLOCKTBT11_CRT_USER_ID" ;
      edtTBT11_CRT_USER_ID_Internalname = "TBT11_CRT_USER_ID" ;
      lblTextblocktbt11_crt_prog_nm_Internalname = "TEXTBLOCKTBT11_CRT_PROG_NM" ;
      edtTBT11_CRT_PROG_NM_Internalname = "TBT11_CRT_PROG_NM" ;
      lblTextblocktbt11_upd_datetime_Internalname = "TEXTBLOCKTBT11_UPD_DATETIME" ;
      edtTBT11_UPD_DATETIME_Internalname = "TBT11_UPD_DATETIME" ;
      lblTextblocktbt11_upd_user_id_Internalname = "TEXTBLOCKTBT11_UPD_USER_ID" ;
      edtTBT11_UPD_USER_ID_Internalname = "TBT11_UPD_USER_ID" ;
      lblTextblocktbt11_upd_prog_nm_Internalname = "TEXTBLOCKTBT11_UPD_PROG_NM" ;
      edtTBT11_UPD_PROG_NM_Internalname = "TBT11_UPD_PROG_NM" ;
      lblTextblocktbt11_upd_cnt_Internalname = "TEXTBLOCKTBT11_UPD_CNT" ;
      edtTBT11_UPD_CNT_Internalname = "TBT11_UPD_CNT" ;
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
      edtTBT11_UPD_CNT_Jsonclick = "" ;
      edtTBT11_UPD_CNT_Enabled = 1 ;
      edtTBT11_UPD_PROG_NM_Jsonclick = "" ;
      edtTBT11_UPD_PROG_NM_Enabled = 1 ;
      edtTBT11_UPD_USER_ID_Jsonclick = "" ;
      edtTBT11_UPD_USER_ID_Enabled = 1 ;
      edtTBT11_UPD_DATETIME_Jsonclick = "" ;
      edtTBT11_UPD_DATETIME_Enabled = 1 ;
      edtTBT11_CRT_PROG_NM_Jsonclick = "" ;
      edtTBT11_CRT_PROG_NM_Enabled = 1 ;
      edtTBT11_CRT_USER_ID_Jsonclick = "" ;
      edtTBT11_CRT_USER_ID_Enabled = 1 ;
      edtTBT11_CRT_DATETIME_Jsonclick = "" ;
      edtTBT11_CRT_DATETIME_Enabled = 1 ;
      edtTBT11_DEL_FLG_Jsonclick = "" ;
      edtTBT11_DEL_FLG_Enabled = 1 ;
      edtTBT11_UPD_RIYU_Enabled = 1 ;
      edtTBT11_INPUT_END_AUTH_CD_Jsonclick = "" ;
      edtTBT11_INPUT_END_AUTH_CD_Enabled = 1 ;
      edtTBT11_INPUT_END_USER_ID_Jsonclick = "" ;
      edtTBT11_INPUT_END_USER_ID_Enabled = 1 ;
      edtTBT11_INPUT_END_DATETIME_Jsonclick = "" ;
      edtTBT11_INPUT_END_DATETIME_Enabled = 1 ;
      edtTBT11_INPUT_END_FLG_Jsonclick = "" ;
      edtTBT11_INPUT_END_FLG_Enabled = 1 ;
      edtTBT11_APPROVAL_AUTH_CD_Jsonclick = "" ;
      edtTBT11_APPROVAL_AUTH_CD_Enabled = 1 ;
      edtTBT11_APPROVAL_USER_ID_Jsonclick = "" ;
      edtTBT11_APPROVAL_USER_ID_Enabled = 1 ;
      edtTBT11_APPROVAL_DATETIME_Jsonclick = "" ;
      edtTBT11_APPROVAL_DATETIME_Enabled = 1 ;
      edtTBT11_APPROVAL_FLG_Jsonclick = "" ;
      edtTBT11_APPROVAL_FLG_Enabled = 1 ;
      edtTBT11_DM_ARRIVAL_DATETIME_Jsonclick = "" ;
      edtTBT11_DM_ARRIVAL_DATETIME_Enabled = 1 ;
      edtTBT11_DM_ARRIVAL_FLG_Jsonclick = "" ;
      edtTBT11_DM_ARRIVAL_FLG_Enabled = 1 ;
      edtTBT11_UPLOAD_AUTH_CD_Jsonclick = "" ;
      edtTBT11_UPLOAD_AUTH_CD_Enabled = 1 ;
      edtTBT11_UPLOAD_USER_ID_Jsonclick = "" ;
      edtTBT11_UPLOAD_USER_ID_Enabled = 1 ;
      edtTBT11_UPLOAD_DATETIME_Jsonclick = "" ;
      edtTBT11_UPLOAD_DATETIME_Enabled = 1 ;
      edtTBT11_CRF_INPUT_LEVEL_Jsonclick = "" ;
      edtTBT11_CRF_INPUT_LEVEL_Enabled = 1 ;
      edtTBT11_CRF_VERSION_Jsonclick = "" ;
      edtTBT11_CRF_VERSION_Enabled = 1 ;
      edtTBT11_CRF_ID_Jsonclick = "" ;
      edtTBT11_CRF_ID_Enabled = 1 ;
      edtTBT11_SUBJECT_ID_Jsonclick = "" ;
      edtTBT11_SUBJECT_ID_Enabled = 1 ;
      edtTBT11_STUDY_ID_Jsonclick = "" ;
      edtTBT11_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx8asatbt11_crt_user_id0Q25( String Gx_mode )
   {
      GXt_char3 = A309TBT11_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt11_crf_history_impl.this.GXt_char3 = GXv_char4[0] ;
      A309TBT11_CRT_USER_ID = GXt_char3 ;
      n309TBT11_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A309TBT11_CRT_USER_ID", A309TBT11_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A309TBT11_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx10asatbt11_upd_user_id0Q25( String Gx_mode )
   {
      GXt_char3 = A312TBT11_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt11_crf_history_impl.this.GXt_char3 = GXv_char4[0] ;
      A312TBT11_UPD_USER_ID = GXt_char3 ;
      n312TBT11_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A312TBT11_UPD_USER_ID", A312TBT11_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A312TBT11_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBT11_CRF_INPUT_LEVEL_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbt11_crf_version( long GX_Parm1 ,
                                        int GX_Parm2 ,
                                        short GX_Parm3 ,
                                        short GX_Parm4 ,
                                        java.util.Date GX_Parm5 ,
                                        String GX_Parm6 ,
                                        java.util.Date GX_Parm7 ,
                                        String GX_Parm8 ,
                                        long GX_Parm9 ,
                                        byte GX_Parm10 ,
                                        java.util.Date GX_Parm11 ,
                                        String GX_Parm12 ,
                                        String GX_Parm13 ,
                                        String GX_Parm14 ,
                                        java.util.Date GX_Parm15 ,
                                        String GX_Parm16 ,
                                        java.util.Date GX_Parm17 ,
                                        String GX_Parm18 ,
                                        String GX_Parm19 ,
                                        String GX_Parm20 ,
                                        java.util.Date GX_Parm21 ,
                                        String GX_Parm22 ,
                                        String GX_Parm23 ,
                                        String GX_Parm24 ,
                                        String GX_Parm25 ,
                                        String GX_Parm26 ,
                                        String GX_Parm27 )
   {
      A303TBT11_STUDY_ID = GX_Parm1 ;
      A304TBT11_SUBJECT_ID = GX_Parm2 ;
      A305TBT11_CRF_ID = GX_Parm3 ;
      A306TBT11_CRF_VERSION = GX_Parm4 ;
      A308TBT11_CRT_DATETIME = GX_Parm5 ;
      n308TBT11_CRT_DATETIME = false ;
      A309TBT11_CRT_USER_ID = GX_Parm6 ;
      n309TBT11_CRT_USER_ID = false ;
      A311TBT11_UPD_DATETIME = GX_Parm7 ;
      n311TBT11_UPD_DATETIME = false ;
      A312TBT11_UPD_USER_ID = GX_Parm8 ;
      n312TBT11_UPD_USER_ID = false ;
      A314TBT11_UPD_CNT = GX_Parm9 ;
      n314TBT11_UPD_CNT = false ;
      A573TBT11_CRF_INPUT_LEVEL = GX_Parm10 ;
      n573TBT11_CRF_INPUT_LEVEL = false ;
      A574TBT11_UPLOAD_DATETIME = GX_Parm11 ;
      n574TBT11_UPLOAD_DATETIME = false ;
      A575TBT11_UPLOAD_USER_ID = GX_Parm12 ;
      n575TBT11_UPLOAD_USER_ID = false ;
      A576TBT11_UPLOAD_AUTH_CD = GX_Parm13 ;
      n576TBT11_UPLOAD_AUTH_CD = false ;
      A577TBT11_DM_ARRIVAL_FLG = GX_Parm14 ;
      n577TBT11_DM_ARRIVAL_FLG = false ;
      A578TBT11_DM_ARRIVAL_DATETIME = GX_Parm15 ;
      n578TBT11_DM_ARRIVAL_DATETIME = false ;
      A579TBT11_APPROVAL_FLG = GX_Parm16 ;
      n579TBT11_APPROVAL_FLG = false ;
      A580TBT11_APPROVAL_DATETIME = GX_Parm17 ;
      n580TBT11_APPROVAL_DATETIME = false ;
      A581TBT11_APPROVAL_USER_ID = GX_Parm18 ;
      n581TBT11_APPROVAL_USER_ID = false ;
      A582TBT11_APPROVAL_AUTH_CD = GX_Parm19 ;
      n582TBT11_APPROVAL_AUTH_CD = false ;
      A583TBT11_INPUT_END_FLG = GX_Parm20 ;
      n583TBT11_INPUT_END_FLG = false ;
      A584TBT11_INPUT_END_DATETIME = GX_Parm21 ;
      n584TBT11_INPUT_END_DATETIME = false ;
      A585TBT11_INPUT_END_USER_ID = GX_Parm22 ;
      n585TBT11_INPUT_END_USER_ID = false ;
      A586TBT11_INPUT_END_AUTH_CD = GX_Parm23 ;
      n586TBT11_INPUT_END_AUTH_CD = false ;
      A884TBT11_UPD_RIYU = GX_Parm24 ;
      n884TBT11_UPD_RIYU = false ;
      A307TBT11_DEL_FLG = GX_Parm25 ;
      n307TBT11_DEL_FLG = false ;
      A310TBT11_CRT_PROG_NM = GX_Parm26 ;
      n310TBT11_CRT_PROG_NM = false ;
      A313TBT11_UPD_PROG_NM = GX_Parm27 ;
      n313TBT11_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A308TBT11_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A309TBT11_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A311TBT11_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A312TBT11_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A314TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A573TBT11_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.format(A574TBT11_UPLOAD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A575TBT11_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A576TBT11_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A577TBT11_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.format(A578TBT11_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A579TBT11_APPROVAL_FLG));
      isValidOutput.add(localUtil.format(A580TBT11_APPROVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A581TBT11_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( A582TBT11_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A583TBT11_INPUT_END_FLG));
      isValidOutput.add(localUtil.format(A584TBT11_INPUT_END_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A585TBT11_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( A586TBT11_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A884TBT11_UPD_RIYU));
      isValidOutput.add(GXutil.rtrim( A307TBT11_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A310TBT11_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A313TBT11_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z303TBT11_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z304TBT11_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z305TBT11_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z306TBT11_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z308TBT11_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z309TBT11_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z311TBT11_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z312TBT11_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z314TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z573TBT11_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z574TBT11_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z575TBT11_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z576TBT11_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z577TBT11_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z578TBT11_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z579TBT11_APPROVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z580TBT11_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z581TBT11_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z582TBT11_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z583TBT11_INPUT_END_FLG));
      isValidOutput.add(localUtil.ttoc( Z584TBT11_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z585TBT11_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z586TBT11_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z884TBT11_UPD_RIYU));
      isValidOutput.add(GXutil.rtrim( Z307TBT11_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z310TBT11_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z313TBT11_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O314TBT11_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1179 */
                  S1179 ();
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
      lblTextblocktbt11_study_id_Jsonclick = "" ;
      lblTextblocktbt11_subject_id_Jsonclick = "" ;
      lblTextblocktbt11_crf_id_Jsonclick = "" ;
      lblTextblocktbt11_crf_version_Jsonclick = "" ;
      lblTextblocktbt11_crf_input_level_Jsonclick = "" ;
      lblTextblocktbt11_upload_datetime_Jsonclick = "" ;
      A574TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_upload_user_id_Jsonclick = "" ;
      A575TBT11_UPLOAD_USER_ID = "" ;
      lblTextblocktbt11_upload_auth_cd_Jsonclick = "" ;
      A576TBT11_UPLOAD_AUTH_CD = "" ;
      lblTextblocktbt11_dm_arrival_flg_Jsonclick = "" ;
      A577TBT11_DM_ARRIVAL_FLG = "" ;
      lblTextblocktbt11_dm_arrival_datetime_Jsonclick = "" ;
      A578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_approval_flg_Jsonclick = "" ;
      A579TBT11_APPROVAL_FLG = "" ;
      lblTextblocktbt11_approval_datetime_Jsonclick = "" ;
      A580TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_approval_user_id_Jsonclick = "" ;
      A581TBT11_APPROVAL_USER_ID = "" ;
      lblTextblocktbt11_approval_auth_cd_Jsonclick = "" ;
      A582TBT11_APPROVAL_AUTH_CD = "" ;
      lblTextblocktbt11_input_end_flg_Jsonclick = "" ;
      A583TBT11_INPUT_END_FLG = "" ;
      lblTextblocktbt11_input_end_datetime_Jsonclick = "" ;
      A584TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_input_end_user_id_Jsonclick = "" ;
      A585TBT11_INPUT_END_USER_ID = "" ;
      lblTextblocktbt11_input_end_auth_cd_Jsonclick = "" ;
      A586TBT11_INPUT_END_AUTH_CD = "" ;
      lblTextblocktbt11_upd_riyu_Jsonclick = "" ;
      A884TBT11_UPD_RIYU = "" ;
      lblTextblocktbt11_del_flg_Jsonclick = "" ;
      A307TBT11_DEL_FLG = "" ;
      lblTextblocktbt11_crt_datetime_Jsonclick = "" ;
      A308TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_crt_user_id_Jsonclick = "" ;
      A309TBT11_CRT_USER_ID = "" ;
      lblTextblocktbt11_crt_prog_nm_Jsonclick = "" ;
      A310TBT11_CRT_PROG_NM = "" ;
      lblTextblocktbt11_upd_datetime_Jsonclick = "" ;
      A311TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt11_upd_user_id_Jsonclick = "" ;
      A312TBT11_UPD_USER_ID = "" ;
      lblTextblocktbt11_upd_prog_nm_Jsonclick = "" ;
      A313TBT11_UPD_PROG_NM = "" ;
      lblTextblocktbt11_upd_cnt_Jsonclick = "" ;
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
      Z308TBT11_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z309TBT11_CRT_USER_ID = "" ;
      Z311TBT11_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z312TBT11_UPD_USER_ID = "" ;
      Z574TBT11_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z575TBT11_UPLOAD_USER_ID = "" ;
      Z576TBT11_UPLOAD_AUTH_CD = "" ;
      Z577TBT11_DM_ARRIVAL_FLG = "" ;
      Z578TBT11_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z579TBT11_APPROVAL_FLG = "" ;
      Z580TBT11_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z581TBT11_APPROVAL_USER_ID = "" ;
      Z582TBT11_APPROVAL_AUTH_CD = "" ;
      Z583TBT11_INPUT_END_FLG = "" ;
      Z584TBT11_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z585TBT11_INPUT_END_USER_ID = "" ;
      Z586TBT11_INPUT_END_AUTH_CD = "" ;
      Z884TBT11_UPD_RIYU = "" ;
      Z307TBT11_DEL_FLG = "" ;
      Z310TBT11_CRT_PROG_NM = "" ;
      Z313TBT11_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T000Q4_A303TBT11_STUDY_ID = new long[1] ;
      T000Q4_A304TBT11_SUBJECT_ID = new int[1] ;
      T000Q4_A305TBT11_CRF_ID = new short[1] ;
      T000Q4_A306TBT11_CRF_VERSION = new short[1] ;
      T000Q4_A308TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n308TBT11_CRT_DATETIME = new boolean[] {false} ;
      T000Q4_A309TBT11_CRT_USER_ID = new String[] {""} ;
      T000Q4_n309TBT11_CRT_USER_ID = new boolean[] {false} ;
      T000Q4_A311TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n311TBT11_UPD_DATETIME = new boolean[] {false} ;
      T000Q4_A312TBT11_UPD_USER_ID = new String[] {""} ;
      T000Q4_n312TBT11_UPD_USER_ID = new boolean[] {false} ;
      T000Q4_A314TBT11_UPD_CNT = new long[1] ;
      T000Q4_n314TBT11_UPD_CNT = new boolean[] {false} ;
      T000Q4_A573TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      T000Q4_n573TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000Q4_A574TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n574TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      T000Q4_A575TBT11_UPLOAD_USER_ID = new String[] {""} ;
      T000Q4_n575TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      T000Q4_A576TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      T000Q4_n576TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000Q4_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      T000Q4_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000Q4_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000Q4_A579TBT11_APPROVAL_FLG = new String[] {""} ;
      T000Q4_n579TBT11_APPROVAL_FLG = new boolean[] {false} ;
      T000Q4_A580TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n580TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      T000Q4_A581TBT11_APPROVAL_USER_ID = new String[] {""} ;
      T000Q4_n581TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      T000Q4_A582TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      T000Q4_n582TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000Q4_A583TBT11_INPUT_END_FLG = new String[] {""} ;
      T000Q4_n583TBT11_INPUT_END_FLG = new boolean[] {false} ;
      T000Q4_A584TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q4_n584TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      T000Q4_A585TBT11_INPUT_END_USER_ID = new String[] {""} ;
      T000Q4_n585TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      T000Q4_A586TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      T000Q4_n586TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000Q4_A884TBT11_UPD_RIYU = new String[] {""} ;
      T000Q4_n884TBT11_UPD_RIYU = new boolean[] {false} ;
      T000Q4_A307TBT11_DEL_FLG = new String[] {""} ;
      T000Q4_n307TBT11_DEL_FLG = new boolean[] {false} ;
      T000Q4_A310TBT11_CRT_PROG_NM = new String[] {""} ;
      T000Q4_n310TBT11_CRT_PROG_NM = new boolean[] {false} ;
      T000Q4_A313TBT11_UPD_PROG_NM = new String[] {""} ;
      T000Q4_n313TBT11_UPD_PROG_NM = new boolean[] {false} ;
      T000Q5_A303TBT11_STUDY_ID = new long[1] ;
      T000Q5_A304TBT11_SUBJECT_ID = new int[1] ;
      T000Q5_A305TBT11_CRF_ID = new short[1] ;
      T000Q5_A306TBT11_CRF_VERSION = new short[1] ;
      T000Q3_A303TBT11_STUDY_ID = new long[1] ;
      T000Q3_A304TBT11_SUBJECT_ID = new int[1] ;
      T000Q3_A305TBT11_CRF_ID = new short[1] ;
      T000Q3_A306TBT11_CRF_VERSION = new short[1] ;
      T000Q3_A308TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n308TBT11_CRT_DATETIME = new boolean[] {false} ;
      T000Q3_A309TBT11_CRT_USER_ID = new String[] {""} ;
      T000Q3_n309TBT11_CRT_USER_ID = new boolean[] {false} ;
      T000Q3_A311TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n311TBT11_UPD_DATETIME = new boolean[] {false} ;
      T000Q3_A312TBT11_UPD_USER_ID = new String[] {""} ;
      T000Q3_n312TBT11_UPD_USER_ID = new boolean[] {false} ;
      T000Q3_A314TBT11_UPD_CNT = new long[1] ;
      T000Q3_n314TBT11_UPD_CNT = new boolean[] {false} ;
      T000Q3_A573TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      T000Q3_n573TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000Q3_A574TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n574TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      T000Q3_A575TBT11_UPLOAD_USER_ID = new String[] {""} ;
      T000Q3_n575TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      T000Q3_A576TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      T000Q3_n576TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000Q3_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      T000Q3_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000Q3_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000Q3_A579TBT11_APPROVAL_FLG = new String[] {""} ;
      T000Q3_n579TBT11_APPROVAL_FLG = new boolean[] {false} ;
      T000Q3_A580TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n580TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      T000Q3_A581TBT11_APPROVAL_USER_ID = new String[] {""} ;
      T000Q3_n581TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      T000Q3_A582TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      T000Q3_n582TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000Q3_A583TBT11_INPUT_END_FLG = new String[] {""} ;
      T000Q3_n583TBT11_INPUT_END_FLG = new boolean[] {false} ;
      T000Q3_A584TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q3_n584TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      T000Q3_A585TBT11_INPUT_END_USER_ID = new String[] {""} ;
      T000Q3_n585TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      T000Q3_A586TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      T000Q3_n586TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000Q3_A884TBT11_UPD_RIYU = new String[] {""} ;
      T000Q3_n884TBT11_UPD_RIYU = new boolean[] {false} ;
      T000Q3_A307TBT11_DEL_FLG = new String[] {""} ;
      T000Q3_n307TBT11_DEL_FLG = new boolean[] {false} ;
      T000Q3_A310TBT11_CRT_PROG_NM = new String[] {""} ;
      T000Q3_n310TBT11_CRT_PROG_NM = new boolean[] {false} ;
      T000Q3_A313TBT11_UPD_PROG_NM = new String[] {""} ;
      T000Q3_n313TBT11_UPD_PROG_NM = new boolean[] {false} ;
      sMode25 = "" ;
      T000Q6_A303TBT11_STUDY_ID = new long[1] ;
      T000Q6_A304TBT11_SUBJECT_ID = new int[1] ;
      T000Q6_A305TBT11_CRF_ID = new short[1] ;
      T000Q6_A306TBT11_CRF_VERSION = new short[1] ;
      T000Q7_A303TBT11_STUDY_ID = new long[1] ;
      T000Q7_A304TBT11_SUBJECT_ID = new int[1] ;
      T000Q7_A305TBT11_CRF_ID = new short[1] ;
      T000Q7_A306TBT11_CRF_VERSION = new short[1] ;
      T000Q2_A303TBT11_STUDY_ID = new long[1] ;
      T000Q2_A304TBT11_SUBJECT_ID = new int[1] ;
      T000Q2_A305TBT11_CRF_ID = new short[1] ;
      T000Q2_A306TBT11_CRF_VERSION = new short[1] ;
      T000Q2_A308TBT11_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n308TBT11_CRT_DATETIME = new boolean[] {false} ;
      T000Q2_A309TBT11_CRT_USER_ID = new String[] {""} ;
      T000Q2_n309TBT11_CRT_USER_ID = new boolean[] {false} ;
      T000Q2_A311TBT11_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n311TBT11_UPD_DATETIME = new boolean[] {false} ;
      T000Q2_A312TBT11_UPD_USER_ID = new String[] {""} ;
      T000Q2_n312TBT11_UPD_USER_ID = new boolean[] {false} ;
      T000Q2_A314TBT11_UPD_CNT = new long[1] ;
      T000Q2_n314TBT11_UPD_CNT = new boolean[] {false} ;
      T000Q2_A573TBT11_CRF_INPUT_LEVEL = new byte[1] ;
      T000Q2_n573TBT11_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000Q2_A574TBT11_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n574TBT11_UPLOAD_DATETIME = new boolean[] {false} ;
      T000Q2_A575TBT11_UPLOAD_USER_ID = new String[] {""} ;
      T000Q2_n575TBT11_UPLOAD_USER_ID = new boolean[] {false} ;
      T000Q2_A576TBT11_UPLOAD_AUTH_CD = new String[] {""} ;
      T000Q2_n576TBT11_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000Q2_A577TBT11_DM_ARRIVAL_FLG = new String[] {""} ;
      T000Q2_n577TBT11_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000Q2_A578TBT11_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n578TBT11_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000Q2_A579TBT11_APPROVAL_FLG = new String[] {""} ;
      T000Q2_n579TBT11_APPROVAL_FLG = new boolean[] {false} ;
      T000Q2_A580TBT11_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n580TBT11_APPROVAL_DATETIME = new boolean[] {false} ;
      T000Q2_A581TBT11_APPROVAL_USER_ID = new String[] {""} ;
      T000Q2_n581TBT11_APPROVAL_USER_ID = new boolean[] {false} ;
      T000Q2_A582TBT11_APPROVAL_AUTH_CD = new String[] {""} ;
      T000Q2_n582TBT11_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000Q2_A583TBT11_INPUT_END_FLG = new String[] {""} ;
      T000Q2_n583TBT11_INPUT_END_FLG = new boolean[] {false} ;
      T000Q2_A584TBT11_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Q2_n584TBT11_INPUT_END_DATETIME = new boolean[] {false} ;
      T000Q2_A585TBT11_INPUT_END_USER_ID = new String[] {""} ;
      T000Q2_n585TBT11_INPUT_END_USER_ID = new boolean[] {false} ;
      T000Q2_A586TBT11_INPUT_END_AUTH_CD = new String[] {""} ;
      T000Q2_n586TBT11_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000Q2_A884TBT11_UPD_RIYU = new String[] {""} ;
      T000Q2_n884TBT11_UPD_RIYU = new boolean[] {false} ;
      T000Q2_A307TBT11_DEL_FLG = new String[] {""} ;
      T000Q2_n307TBT11_DEL_FLG = new boolean[] {false} ;
      T000Q2_A310TBT11_CRT_PROG_NM = new String[] {""} ;
      T000Q2_n310TBT11_CRT_PROG_NM = new boolean[] {false} ;
      T000Q2_A313TBT11_UPD_PROG_NM = new String[] {""} ;
      T000Q2_n313TBT11_UPD_PROG_NM = new boolean[] {false} ;
      T000Q11_A303TBT11_STUDY_ID = new long[1] ;
      T000Q11_A304TBT11_SUBJECT_ID = new int[1] ;
      T000Q11_A305TBT11_CRF_ID = new short[1] ;
      T000Q11_A306TBT11_CRF_VERSION = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt11_crf_history__default(),
         new Object[] {
             new Object[] {
            T000Q2_A303TBT11_STUDY_ID, T000Q2_A304TBT11_SUBJECT_ID, T000Q2_A305TBT11_CRF_ID, T000Q2_A306TBT11_CRF_VERSION, T000Q2_A308TBT11_CRT_DATETIME, T000Q2_n308TBT11_CRT_DATETIME, T000Q2_A309TBT11_CRT_USER_ID, T000Q2_n309TBT11_CRT_USER_ID, T000Q2_A311TBT11_UPD_DATETIME, T000Q2_n311TBT11_UPD_DATETIME,
            T000Q2_A312TBT11_UPD_USER_ID, T000Q2_n312TBT11_UPD_USER_ID, T000Q2_A314TBT11_UPD_CNT, T000Q2_n314TBT11_UPD_CNT, T000Q2_A573TBT11_CRF_INPUT_LEVEL, T000Q2_n573TBT11_CRF_INPUT_LEVEL, T000Q2_A574TBT11_UPLOAD_DATETIME, T000Q2_n574TBT11_UPLOAD_DATETIME, T000Q2_A575TBT11_UPLOAD_USER_ID, T000Q2_n575TBT11_UPLOAD_USER_ID,
            T000Q2_A576TBT11_UPLOAD_AUTH_CD, T000Q2_n576TBT11_UPLOAD_AUTH_CD, T000Q2_A577TBT11_DM_ARRIVAL_FLG, T000Q2_n577TBT11_DM_ARRIVAL_FLG, T000Q2_A578TBT11_DM_ARRIVAL_DATETIME, T000Q2_n578TBT11_DM_ARRIVAL_DATETIME, T000Q2_A579TBT11_APPROVAL_FLG, T000Q2_n579TBT11_APPROVAL_FLG, T000Q2_A580TBT11_APPROVAL_DATETIME, T000Q2_n580TBT11_APPROVAL_DATETIME,
            T000Q2_A581TBT11_APPROVAL_USER_ID, T000Q2_n581TBT11_APPROVAL_USER_ID, T000Q2_A582TBT11_APPROVAL_AUTH_CD, T000Q2_n582TBT11_APPROVAL_AUTH_CD, T000Q2_A583TBT11_INPUT_END_FLG, T000Q2_n583TBT11_INPUT_END_FLG, T000Q2_A584TBT11_INPUT_END_DATETIME, T000Q2_n584TBT11_INPUT_END_DATETIME, T000Q2_A585TBT11_INPUT_END_USER_ID, T000Q2_n585TBT11_INPUT_END_USER_ID,
            T000Q2_A586TBT11_INPUT_END_AUTH_CD, T000Q2_n586TBT11_INPUT_END_AUTH_CD, T000Q2_A884TBT11_UPD_RIYU, T000Q2_n884TBT11_UPD_RIYU, T000Q2_A307TBT11_DEL_FLG, T000Q2_n307TBT11_DEL_FLG, T000Q2_A310TBT11_CRT_PROG_NM, T000Q2_n310TBT11_CRT_PROG_NM, T000Q2_A313TBT11_UPD_PROG_NM, T000Q2_n313TBT11_UPD_PROG_NM
            }
            , new Object[] {
            T000Q3_A303TBT11_STUDY_ID, T000Q3_A304TBT11_SUBJECT_ID, T000Q3_A305TBT11_CRF_ID, T000Q3_A306TBT11_CRF_VERSION, T000Q3_A308TBT11_CRT_DATETIME, T000Q3_n308TBT11_CRT_DATETIME, T000Q3_A309TBT11_CRT_USER_ID, T000Q3_n309TBT11_CRT_USER_ID, T000Q3_A311TBT11_UPD_DATETIME, T000Q3_n311TBT11_UPD_DATETIME,
            T000Q3_A312TBT11_UPD_USER_ID, T000Q3_n312TBT11_UPD_USER_ID, T000Q3_A314TBT11_UPD_CNT, T000Q3_n314TBT11_UPD_CNT, T000Q3_A573TBT11_CRF_INPUT_LEVEL, T000Q3_n573TBT11_CRF_INPUT_LEVEL, T000Q3_A574TBT11_UPLOAD_DATETIME, T000Q3_n574TBT11_UPLOAD_DATETIME, T000Q3_A575TBT11_UPLOAD_USER_ID, T000Q3_n575TBT11_UPLOAD_USER_ID,
            T000Q3_A576TBT11_UPLOAD_AUTH_CD, T000Q3_n576TBT11_UPLOAD_AUTH_CD, T000Q3_A577TBT11_DM_ARRIVAL_FLG, T000Q3_n577TBT11_DM_ARRIVAL_FLG, T000Q3_A578TBT11_DM_ARRIVAL_DATETIME, T000Q3_n578TBT11_DM_ARRIVAL_DATETIME, T000Q3_A579TBT11_APPROVAL_FLG, T000Q3_n579TBT11_APPROVAL_FLG, T000Q3_A580TBT11_APPROVAL_DATETIME, T000Q3_n580TBT11_APPROVAL_DATETIME,
            T000Q3_A581TBT11_APPROVAL_USER_ID, T000Q3_n581TBT11_APPROVAL_USER_ID, T000Q3_A582TBT11_APPROVAL_AUTH_CD, T000Q3_n582TBT11_APPROVAL_AUTH_CD, T000Q3_A583TBT11_INPUT_END_FLG, T000Q3_n583TBT11_INPUT_END_FLG, T000Q3_A584TBT11_INPUT_END_DATETIME, T000Q3_n584TBT11_INPUT_END_DATETIME, T000Q3_A585TBT11_INPUT_END_USER_ID, T000Q3_n585TBT11_INPUT_END_USER_ID,
            T000Q3_A586TBT11_INPUT_END_AUTH_CD, T000Q3_n586TBT11_INPUT_END_AUTH_CD, T000Q3_A884TBT11_UPD_RIYU, T000Q3_n884TBT11_UPD_RIYU, T000Q3_A307TBT11_DEL_FLG, T000Q3_n307TBT11_DEL_FLG, T000Q3_A310TBT11_CRT_PROG_NM, T000Q3_n310TBT11_CRT_PROG_NM, T000Q3_A313TBT11_UPD_PROG_NM, T000Q3_n313TBT11_UPD_PROG_NM
            }
            , new Object[] {
            T000Q4_A303TBT11_STUDY_ID, T000Q4_A304TBT11_SUBJECT_ID, T000Q4_A305TBT11_CRF_ID, T000Q4_A306TBT11_CRF_VERSION, T000Q4_A308TBT11_CRT_DATETIME, T000Q4_n308TBT11_CRT_DATETIME, T000Q4_A309TBT11_CRT_USER_ID, T000Q4_n309TBT11_CRT_USER_ID, T000Q4_A311TBT11_UPD_DATETIME, T000Q4_n311TBT11_UPD_DATETIME,
            T000Q4_A312TBT11_UPD_USER_ID, T000Q4_n312TBT11_UPD_USER_ID, T000Q4_A314TBT11_UPD_CNT, T000Q4_n314TBT11_UPD_CNT, T000Q4_A573TBT11_CRF_INPUT_LEVEL, T000Q4_n573TBT11_CRF_INPUT_LEVEL, T000Q4_A574TBT11_UPLOAD_DATETIME, T000Q4_n574TBT11_UPLOAD_DATETIME, T000Q4_A575TBT11_UPLOAD_USER_ID, T000Q4_n575TBT11_UPLOAD_USER_ID,
            T000Q4_A576TBT11_UPLOAD_AUTH_CD, T000Q4_n576TBT11_UPLOAD_AUTH_CD, T000Q4_A577TBT11_DM_ARRIVAL_FLG, T000Q4_n577TBT11_DM_ARRIVAL_FLG, T000Q4_A578TBT11_DM_ARRIVAL_DATETIME, T000Q4_n578TBT11_DM_ARRIVAL_DATETIME, T000Q4_A579TBT11_APPROVAL_FLG, T000Q4_n579TBT11_APPROVAL_FLG, T000Q4_A580TBT11_APPROVAL_DATETIME, T000Q4_n580TBT11_APPROVAL_DATETIME,
            T000Q4_A581TBT11_APPROVAL_USER_ID, T000Q4_n581TBT11_APPROVAL_USER_ID, T000Q4_A582TBT11_APPROVAL_AUTH_CD, T000Q4_n582TBT11_APPROVAL_AUTH_CD, T000Q4_A583TBT11_INPUT_END_FLG, T000Q4_n583TBT11_INPUT_END_FLG, T000Q4_A584TBT11_INPUT_END_DATETIME, T000Q4_n584TBT11_INPUT_END_DATETIME, T000Q4_A585TBT11_INPUT_END_USER_ID, T000Q4_n585TBT11_INPUT_END_USER_ID,
            T000Q4_A586TBT11_INPUT_END_AUTH_CD, T000Q4_n586TBT11_INPUT_END_AUTH_CD, T000Q4_A884TBT11_UPD_RIYU, T000Q4_n884TBT11_UPD_RIYU, T000Q4_A307TBT11_DEL_FLG, T000Q4_n307TBT11_DEL_FLG, T000Q4_A310TBT11_CRT_PROG_NM, T000Q4_n310TBT11_CRT_PROG_NM, T000Q4_A313TBT11_UPD_PROG_NM, T000Q4_n313TBT11_UPD_PROG_NM
            }
            , new Object[] {
            T000Q5_A303TBT11_STUDY_ID, T000Q5_A304TBT11_SUBJECT_ID, T000Q5_A305TBT11_CRF_ID, T000Q5_A306TBT11_CRF_VERSION
            }
            , new Object[] {
            T000Q6_A303TBT11_STUDY_ID, T000Q6_A304TBT11_SUBJECT_ID, T000Q6_A305TBT11_CRF_ID, T000Q6_A306TBT11_CRF_VERSION
            }
            , new Object[] {
            T000Q7_A303TBT11_STUDY_ID, T000Q7_A304TBT11_SUBJECT_ID, T000Q7_A305TBT11_CRF_ID, T000Q7_A306TBT11_CRF_VERSION
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000Q11_A303TBT11_STUDY_ID, T000Q11_A304TBT11_SUBJECT_ID, T000Q11_A305TBT11_CRF_ID, T000Q11_A306TBT11_CRF_VERSION
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT11_CRF_HISTORY" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A573TBT11_CRF_INPUT_LEVEL ;
   private byte Z573TBT11_CRF_INPUT_LEVEL ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A305TBT11_CRF_ID ;
   private short A306TBT11_CRF_VERSION ;
   private short Z305TBT11_CRF_ID ;
   private short Z306TBT11_CRF_VERSION ;
   private short RcdFound25 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBT11_STUDY_ID_Enabled ;
   private int A304TBT11_SUBJECT_ID ;
   private int edtTBT11_SUBJECT_ID_Enabled ;
   private int edtTBT11_CRF_ID_Enabled ;
   private int edtTBT11_CRF_VERSION_Enabled ;
   private int edtTBT11_CRF_INPUT_LEVEL_Enabled ;
   private int edtTBT11_UPLOAD_DATETIME_Enabled ;
   private int edtTBT11_UPLOAD_USER_ID_Enabled ;
   private int edtTBT11_UPLOAD_AUTH_CD_Enabled ;
   private int edtTBT11_DM_ARRIVAL_FLG_Enabled ;
   private int edtTBT11_DM_ARRIVAL_DATETIME_Enabled ;
   private int edtTBT11_APPROVAL_FLG_Enabled ;
   private int edtTBT11_APPROVAL_DATETIME_Enabled ;
   private int edtTBT11_APPROVAL_USER_ID_Enabled ;
   private int edtTBT11_APPROVAL_AUTH_CD_Enabled ;
   private int edtTBT11_INPUT_END_FLG_Enabled ;
   private int edtTBT11_INPUT_END_DATETIME_Enabled ;
   private int edtTBT11_INPUT_END_USER_ID_Enabled ;
   private int edtTBT11_INPUT_END_AUTH_CD_Enabled ;
   private int edtTBT11_UPD_RIYU_Enabled ;
   private int edtTBT11_DEL_FLG_Enabled ;
   private int edtTBT11_CRT_DATETIME_Enabled ;
   private int edtTBT11_CRT_USER_ID_Enabled ;
   private int edtTBT11_CRT_PROG_NM_Enabled ;
   private int edtTBT11_UPD_DATETIME_Enabled ;
   private int edtTBT11_UPD_USER_ID_Enabled ;
   private int edtTBT11_UPD_PROG_NM_Enabled ;
   private int edtTBT11_UPD_CNT_Enabled ;
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
   private int Z304TBT11_SUBJECT_ID ;
   private int GX_JID ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A303TBT11_STUDY_ID ;
   private long A314TBT11_UPD_CNT ;
   private long Z303TBT11_STUDY_ID ;
   private long Z314TBT11_UPD_CNT ;
   private long O314TBT11_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBT11_STUDY_ID_Internalname ;
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
   private String lblTextblocktbt11_study_id_Internalname ;
   private String lblTextblocktbt11_study_id_Jsonclick ;
   private String edtTBT11_STUDY_ID_Jsonclick ;
   private String lblTextblocktbt11_subject_id_Internalname ;
   private String lblTextblocktbt11_subject_id_Jsonclick ;
   private String edtTBT11_SUBJECT_ID_Internalname ;
   private String edtTBT11_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbt11_crf_id_Internalname ;
   private String lblTextblocktbt11_crf_id_Jsonclick ;
   private String edtTBT11_CRF_ID_Internalname ;
   private String edtTBT11_CRF_ID_Jsonclick ;
   private String lblTextblocktbt11_crf_version_Internalname ;
   private String lblTextblocktbt11_crf_version_Jsonclick ;
   private String edtTBT11_CRF_VERSION_Internalname ;
   private String edtTBT11_CRF_VERSION_Jsonclick ;
   private String lblTextblocktbt11_crf_input_level_Internalname ;
   private String lblTextblocktbt11_crf_input_level_Jsonclick ;
   private String edtTBT11_CRF_INPUT_LEVEL_Internalname ;
   private String edtTBT11_CRF_INPUT_LEVEL_Jsonclick ;
   private String lblTextblocktbt11_upload_datetime_Internalname ;
   private String lblTextblocktbt11_upload_datetime_Jsonclick ;
   private String edtTBT11_UPLOAD_DATETIME_Internalname ;
   private String edtTBT11_UPLOAD_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_upload_user_id_Internalname ;
   private String lblTextblocktbt11_upload_user_id_Jsonclick ;
   private String edtTBT11_UPLOAD_USER_ID_Internalname ;
   private String edtTBT11_UPLOAD_USER_ID_Jsonclick ;
   private String lblTextblocktbt11_upload_auth_cd_Internalname ;
   private String lblTextblocktbt11_upload_auth_cd_Jsonclick ;
   private String edtTBT11_UPLOAD_AUTH_CD_Internalname ;
   private String edtTBT11_UPLOAD_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt11_dm_arrival_flg_Internalname ;
   private String lblTextblocktbt11_dm_arrival_flg_Jsonclick ;
   private String edtTBT11_DM_ARRIVAL_FLG_Internalname ;
   private String edtTBT11_DM_ARRIVAL_FLG_Jsonclick ;
   private String lblTextblocktbt11_dm_arrival_datetime_Internalname ;
   private String lblTextblocktbt11_dm_arrival_datetime_Jsonclick ;
   private String edtTBT11_DM_ARRIVAL_DATETIME_Internalname ;
   private String edtTBT11_DM_ARRIVAL_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_approval_flg_Internalname ;
   private String lblTextblocktbt11_approval_flg_Jsonclick ;
   private String edtTBT11_APPROVAL_FLG_Internalname ;
   private String edtTBT11_APPROVAL_FLG_Jsonclick ;
   private String lblTextblocktbt11_approval_datetime_Internalname ;
   private String lblTextblocktbt11_approval_datetime_Jsonclick ;
   private String edtTBT11_APPROVAL_DATETIME_Internalname ;
   private String edtTBT11_APPROVAL_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_approval_user_id_Internalname ;
   private String lblTextblocktbt11_approval_user_id_Jsonclick ;
   private String edtTBT11_APPROVAL_USER_ID_Internalname ;
   private String edtTBT11_APPROVAL_USER_ID_Jsonclick ;
   private String lblTextblocktbt11_approval_auth_cd_Internalname ;
   private String lblTextblocktbt11_approval_auth_cd_Jsonclick ;
   private String edtTBT11_APPROVAL_AUTH_CD_Internalname ;
   private String edtTBT11_APPROVAL_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt11_input_end_flg_Internalname ;
   private String lblTextblocktbt11_input_end_flg_Jsonclick ;
   private String edtTBT11_INPUT_END_FLG_Internalname ;
   private String edtTBT11_INPUT_END_FLG_Jsonclick ;
   private String lblTextblocktbt11_input_end_datetime_Internalname ;
   private String lblTextblocktbt11_input_end_datetime_Jsonclick ;
   private String edtTBT11_INPUT_END_DATETIME_Internalname ;
   private String edtTBT11_INPUT_END_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_input_end_user_id_Internalname ;
   private String lblTextblocktbt11_input_end_user_id_Jsonclick ;
   private String edtTBT11_INPUT_END_USER_ID_Internalname ;
   private String edtTBT11_INPUT_END_USER_ID_Jsonclick ;
   private String lblTextblocktbt11_input_end_auth_cd_Internalname ;
   private String lblTextblocktbt11_input_end_auth_cd_Jsonclick ;
   private String edtTBT11_INPUT_END_AUTH_CD_Internalname ;
   private String edtTBT11_INPUT_END_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt11_upd_riyu_Internalname ;
   private String lblTextblocktbt11_upd_riyu_Jsonclick ;
   private String edtTBT11_UPD_RIYU_Internalname ;
   private String lblTextblocktbt11_del_flg_Internalname ;
   private String lblTextblocktbt11_del_flg_Jsonclick ;
   private String edtTBT11_DEL_FLG_Internalname ;
   private String edtTBT11_DEL_FLG_Jsonclick ;
   private String lblTextblocktbt11_crt_datetime_Internalname ;
   private String lblTextblocktbt11_crt_datetime_Jsonclick ;
   private String edtTBT11_CRT_DATETIME_Internalname ;
   private String edtTBT11_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_crt_user_id_Internalname ;
   private String lblTextblocktbt11_crt_user_id_Jsonclick ;
   private String edtTBT11_CRT_USER_ID_Internalname ;
   private String edtTBT11_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbt11_crt_prog_nm_Internalname ;
   private String lblTextblocktbt11_crt_prog_nm_Jsonclick ;
   private String edtTBT11_CRT_PROG_NM_Internalname ;
   private String edtTBT11_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbt11_upd_datetime_Internalname ;
   private String lblTextblocktbt11_upd_datetime_Jsonclick ;
   private String edtTBT11_UPD_DATETIME_Internalname ;
   private String edtTBT11_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbt11_upd_user_id_Internalname ;
   private String lblTextblocktbt11_upd_user_id_Jsonclick ;
   private String edtTBT11_UPD_USER_ID_Internalname ;
   private String edtTBT11_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbt11_upd_prog_nm_Internalname ;
   private String lblTextblocktbt11_upd_prog_nm_Jsonclick ;
   private String edtTBT11_UPD_PROG_NM_Internalname ;
   private String edtTBT11_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbt11_upd_cnt_Internalname ;
   private String lblTextblocktbt11_upd_cnt_Jsonclick ;
   private String edtTBT11_UPD_CNT_Internalname ;
   private String edtTBT11_UPD_CNT_Jsonclick ;
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
   private String sMode25 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A574TBT11_UPLOAD_DATETIME ;
   private java.util.Date A578TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date A580TBT11_APPROVAL_DATETIME ;
   private java.util.Date A584TBT11_INPUT_END_DATETIME ;
   private java.util.Date A308TBT11_CRT_DATETIME ;
   private java.util.Date A311TBT11_UPD_DATETIME ;
   private java.util.Date Z308TBT11_CRT_DATETIME ;
   private java.util.Date Z311TBT11_UPD_DATETIME ;
   private java.util.Date Z574TBT11_UPLOAD_DATETIME ;
   private java.util.Date Z578TBT11_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z580TBT11_APPROVAL_DATETIME ;
   private java.util.Date Z584TBT11_INPUT_END_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n573TBT11_CRF_INPUT_LEVEL ;
   private boolean n574TBT11_UPLOAD_DATETIME ;
   private boolean n575TBT11_UPLOAD_USER_ID ;
   private boolean n576TBT11_UPLOAD_AUTH_CD ;
   private boolean n577TBT11_DM_ARRIVAL_FLG ;
   private boolean n578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean n579TBT11_APPROVAL_FLG ;
   private boolean n580TBT11_APPROVAL_DATETIME ;
   private boolean n581TBT11_APPROVAL_USER_ID ;
   private boolean n582TBT11_APPROVAL_AUTH_CD ;
   private boolean n583TBT11_INPUT_END_FLG ;
   private boolean n584TBT11_INPUT_END_DATETIME ;
   private boolean n585TBT11_INPUT_END_USER_ID ;
   private boolean n586TBT11_INPUT_END_AUTH_CD ;
   private boolean n884TBT11_UPD_RIYU ;
   private boolean n307TBT11_DEL_FLG ;
   private boolean n308TBT11_CRT_DATETIME ;
   private boolean n309TBT11_CRT_USER_ID ;
   private boolean n310TBT11_CRT_PROG_NM ;
   private boolean n311TBT11_UPD_DATETIME ;
   private boolean n312TBT11_UPD_USER_ID ;
   private boolean n313TBT11_UPD_PROG_NM ;
   private boolean n314TBT11_UPD_CNT ;
   private boolean Gx_longc ;
   private String A575TBT11_UPLOAD_USER_ID ;
   private String A576TBT11_UPLOAD_AUTH_CD ;
   private String A577TBT11_DM_ARRIVAL_FLG ;
   private String A579TBT11_APPROVAL_FLG ;
   private String A581TBT11_APPROVAL_USER_ID ;
   private String A582TBT11_APPROVAL_AUTH_CD ;
   private String A583TBT11_INPUT_END_FLG ;
   private String A585TBT11_INPUT_END_USER_ID ;
   private String A586TBT11_INPUT_END_AUTH_CD ;
   private String A884TBT11_UPD_RIYU ;
   private String A307TBT11_DEL_FLG ;
   private String A309TBT11_CRT_USER_ID ;
   private String A310TBT11_CRT_PROG_NM ;
   private String A312TBT11_UPD_USER_ID ;
   private String A313TBT11_UPD_PROG_NM ;
   private String Z309TBT11_CRT_USER_ID ;
   private String Z312TBT11_UPD_USER_ID ;
   private String Z575TBT11_UPLOAD_USER_ID ;
   private String Z576TBT11_UPLOAD_AUTH_CD ;
   private String Z577TBT11_DM_ARRIVAL_FLG ;
   private String Z579TBT11_APPROVAL_FLG ;
   private String Z581TBT11_APPROVAL_USER_ID ;
   private String Z582TBT11_APPROVAL_AUTH_CD ;
   private String Z583TBT11_INPUT_END_FLG ;
   private String Z585TBT11_INPUT_END_USER_ID ;
   private String Z586TBT11_INPUT_END_AUTH_CD ;
   private String Z884TBT11_UPD_RIYU ;
   private String Z307TBT11_DEL_FLG ;
   private String Z310TBT11_CRT_PROG_NM ;
   private String Z313TBT11_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000Q4_A303TBT11_STUDY_ID ;
   private int[] T000Q4_A304TBT11_SUBJECT_ID ;
   private short[] T000Q4_A305TBT11_CRF_ID ;
   private short[] T000Q4_A306TBT11_CRF_VERSION ;
   private java.util.Date[] T000Q4_A308TBT11_CRT_DATETIME ;
   private boolean[] T000Q4_n308TBT11_CRT_DATETIME ;
   private String[] T000Q4_A309TBT11_CRT_USER_ID ;
   private boolean[] T000Q4_n309TBT11_CRT_USER_ID ;
   private java.util.Date[] T000Q4_A311TBT11_UPD_DATETIME ;
   private boolean[] T000Q4_n311TBT11_UPD_DATETIME ;
   private String[] T000Q4_A312TBT11_UPD_USER_ID ;
   private boolean[] T000Q4_n312TBT11_UPD_USER_ID ;
   private long[] T000Q4_A314TBT11_UPD_CNT ;
   private boolean[] T000Q4_n314TBT11_UPD_CNT ;
   private byte[] T000Q4_A573TBT11_CRF_INPUT_LEVEL ;
   private boolean[] T000Q4_n573TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] T000Q4_A574TBT11_UPLOAD_DATETIME ;
   private boolean[] T000Q4_n574TBT11_UPLOAD_DATETIME ;
   private String[] T000Q4_A575TBT11_UPLOAD_USER_ID ;
   private boolean[] T000Q4_n575TBT11_UPLOAD_USER_ID ;
   private String[] T000Q4_A576TBT11_UPLOAD_AUTH_CD ;
   private boolean[] T000Q4_n576TBT11_UPLOAD_AUTH_CD ;
   private String[] T000Q4_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] T000Q4_n577TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000Q4_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] T000Q4_n578TBT11_DM_ARRIVAL_DATETIME ;
   private String[] T000Q4_A579TBT11_APPROVAL_FLG ;
   private boolean[] T000Q4_n579TBT11_APPROVAL_FLG ;
   private java.util.Date[] T000Q4_A580TBT11_APPROVAL_DATETIME ;
   private boolean[] T000Q4_n580TBT11_APPROVAL_DATETIME ;
   private String[] T000Q4_A581TBT11_APPROVAL_USER_ID ;
   private boolean[] T000Q4_n581TBT11_APPROVAL_USER_ID ;
   private String[] T000Q4_A582TBT11_APPROVAL_AUTH_CD ;
   private boolean[] T000Q4_n582TBT11_APPROVAL_AUTH_CD ;
   private String[] T000Q4_A583TBT11_INPUT_END_FLG ;
   private boolean[] T000Q4_n583TBT11_INPUT_END_FLG ;
   private java.util.Date[] T000Q4_A584TBT11_INPUT_END_DATETIME ;
   private boolean[] T000Q4_n584TBT11_INPUT_END_DATETIME ;
   private String[] T000Q4_A585TBT11_INPUT_END_USER_ID ;
   private boolean[] T000Q4_n585TBT11_INPUT_END_USER_ID ;
   private String[] T000Q4_A586TBT11_INPUT_END_AUTH_CD ;
   private boolean[] T000Q4_n586TBT11_INPUT_END_AUTH_CD ;
   private String[] T000Q4_A884TBT11_UPD_RIYU ;
   private boolean[] T000Q4_n884TBT11_UPD_RIYU ;
   private String[] T000Q4_A307TBT11_DEL_FLG ;
   private boolean[] T000Q4_n307TBT11_DEL_FLG ;
   private String[] T000Q4_A310TBT11_CRT_PROG_NM ;
   private boolean[] T000Q4_n310TBT11_CRT_PROG_NM ;
   private String[] T000Q4_A313TBT11_UPD_PROG_NM ;
   private boolean[] T000Q4_n313TBT11_UPD_PROG_NM ;
   private long[] T000Q5_A303TBT11_STUDY_ID ;
   private int[] T000Q5_A304TBT11_SUBJECT_ID ;
   private short[] T000Q5_A305TBT11_CRF_ID ;
   private short[] T000Q5_A306TBT11_CRF_VERSION ;
   private long[] T000Q3_A303TBT11_STUDY_ID ;
   private int[] T000Q3_A304TBT11_SUBJECT_ID ;
   private short[] T000Q3_A305TBT11_CRF_ID ;
   private short[] T000Q3_A306TBT11_CRF_VERSION ;
   private java.util.Date[] T000Q3_A308TBT11_CRT_DATETIME ;
   private boolean[] T000Q3_n308TBT11_CRT_DATETIME ;
   private String[] T000Q3_A309TBT11_CRT_USER_ID ;
   private boolean[] T000Q3_n309TBT11_CRT_USER_ID ;
   private java.util.Date[] T000Q3_A311TBT11_UPD_DATETIME ;
   private boolean[] T000Q3_n311TBT11_UPD_DATETIME ;
   private String[] T000Q3_A312TBT11_UPD_USER_ID ;
   private boolean[] T000Q3_n312TBT11_UPD_USER_ID ;
   private long[] T000Q3_A314TBT11_UPD_CNT ;
   private boolean[] T000Q3_n314TBT11_UPD_CNT ;
   private byte[] T000Q3_A573TBT11_CRF_INPUT_LEVEL ;
   private boolean[] T000Q3_n573TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] T000Q3_A574TBT11_UPLOAD_DATETIME ;
   private boolean[] T000Q3_n574TBT11_UPLOAD_DATETIME ;
   private String[] T000Q3_A575TBT11_UPLOAD_USER_ID ;
   private boolean[] T000Q3_n575TBT11_UPLOAD_USER_ID ;
   private String[] T000Q3_A576TBT11_UPLOAD_AUTH_CD ;
   private boolean[] T000Q3_n576TBT11_UPLOAD_AUTH_CD ;
   private String[] T000Q3_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] T000Q3_n577TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000Q3_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] T000Q3_n578TBT11_DM_ARRIVAL_DATETIME ;
   private String[] T000Q3_A579TBT11_APPROVAL_FLG ;
   private boolean[] T000Q3_n579TBT11_APPROVAL_FLG ;
   private java.util.Date[] T000Q3_A580TBT11_APPROVAL_DATETIME ;
   private boolean[] T000Q3_n580TBT11_APPROVAL_DATETIME ;
   private String[] T000Q3_A581TBT11_APPROVAL_USER_ID ;
   private boolean[] T000Q3_n581TBT11_APPROVAL_USER_ID ;
   private String[] T000Q3_A582TBT11_APPROVAL_AUTH_CD ;
   private boolean[] T000Q3_n582TBT11_APPROVAL_AUTH_CD ;
   private String[] T000Q3_A583TBT11_INPUT_END_FLG ;
   private boolean[] T000Q3_n583TBT11_INPUT_END_FLG ;
   private java.util.Date[] T000Q3_A584TBT11_INPUT_END_DATETIME ;
   private boolean[] T000Q3_n584TBT11_INPUT_END_DATETIME ;
   private String[] T000Q3_A585TBT11_INPUT_END_USER_ID ;
   private boolean[] T000Q3_n585TBT11_INPUT_END_USER_ID ;
   private String[] T000Q3_A586TBT11_INPUT_END_AUTH_CD ;
   private boolean[] T000Q3_n586TBT11_INPUT_END_AUTH_CD ;
   private String[] T000Q3_A884TBT11_UPD_RIYU ;
   private boolean[] T000Q3_n884TBT11_UPD_RIYU ;
   private String[] T000Q3_A307TBT11_DEL_FLG ;
   private boolean[] T000Q3_n307TBT11_DEL_FLG ;
   private String[] T000Q3_A310TBT11_CRT_PROG_NM ;
   private boolean[] T000Q3_n310TBT11_CRT_PROG_NM ;
   private String[] T000Q3_A313TBT11_UPD_PROG_NM ;
   private boolean[] T000Q3_n313TBT11_UPD_PROG_NM ;
   private long[] T000Q6_A303TBT11_STUDY_ID ;
   private int[] T000Q6_A304TBT11_SUBJECT_ID ;
   private short[] T000Q6_A305TBT11_CRF_ID ;
   private short[] T000Q6_A306TBT11_CRF_VERSION ;
   private long[] T000Q7_A303TBT11_STUDY_ID ;
   private int[] T000Q7_A304TBT11_SUBJECT_ID ;
   private short[] T000Q7_A305TBT11_CRF_ID ;
   private short[] T000Q7_A306TBT11_CRF_VERSION ;
   private long[] T000Q2_A303TBT11_STUDY_ID ;
   private int[] T000Q2_A304TBT11_SUBJECT_ID ;
   private short[] T000Q2_A305TBT11_CRF_ID ;
   private short[] T000Q2_A306TBT11_CRF_VERSION ;
   private java.util.Date[] T000Q2_A308TBT11_CRT_DATETIME ;
   private boolean[] T000Q2_n308TBT11_CRT_DATETIME ;
   private String[] T000Q2_A309TBT11_CRT_USER_ID ;
   private boolean[] T000Q2_n309TBT11_CRT_USER_ID ;
   private java.util.Date[] T000Q2_A311TBT11_UPD_DATETIME ;
   private boolean[] T000Q2_n311TBT11_UPD_DATETIME ;
   private String[] T000Q2_A312TBT11_UPD_USER_ID ;
   private boolean[] T000Q2_n312TBT11_UPD_USER_ID ;
   private long[] T000Q2_A314TBT11_UPD_CNT ;
   private boolean[] T000Q2_n314TBT11_UPD_CNT ;
   private byte[] T000Q2_A573TBT11_CRF_INPUT_LEVEL ;
   private boolean[] T000Q2_n573TBT11_CRF_INPUT_LEVEL ;
   private java.util.Date[] T000Q2_A574TBT11_UPLOAD_DATETIME ;
   private boolean[] T000Q2_n574TBT11_UPLOAD_DATETIME ;
   private String[] T000Q2_A575TBT11_UPLOAD_USER_ID ;
   private boolean[] T000Q2_n575TBT11_UPLOAD_USER_ID ;
   private String[] T000Q2_A576TBT11_UPLOAD_AUTH_CD ;
   private boolean[] T000Q2_n576TBT11_UPLOAD_AUTH_CD ;
   private String[] T000Q2_A577TBT11_DM_ARRIVAL_FLG ;
   private boolean[] T000Q2_n577TBT11_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000Q2_A578TBT11_DM_ARRIVAL_DATETIME ;
   private boolean[] T000Q2_n578TBT11_DM_ARRIVAL_DATETIME ;
   private String[] T000Q2_A579TBT11_APPROVAL_FLG ;
   private boolean[] T000Q2_n579TBT11_APPROVAL_FLG ;
   private java.util.Date[] T000Q2_A580TBT11_APPROVAL_DATETIME ;
   private boolean[] T000Q2_n580TBT11_APPROVAL_DATETIME ;
   private String[] T000Q2_A581TBT11_APPROVAL_USER_ID ;
   private boolean[] T000Q2_n581TBT11_APPROVAL_USER_ID ;
   private String[] T000Q2_A582TBT11_APPROVAL_AUTH_CD ;
   private boolean[] T000Q2_n582TBT11_APPROVAL_AUTH_CD ;
   private String[] T000Q2_A583TBT11_INPUT_END_FLG ;
   private boolean[] T000Q2_n583TBT11_INPUT_END_FLG ;
   private java.util.Date[] T000Q2_A584TBT11_INPUT_END_DATETIME ;
   private boolean[] T000Q2_n584TBT11_INPUT_END_DATETIME ;
   private String[] T000Q2_A585TBT11_INPUT_END_USER_ID ;
   private boolean[] T000Q2_n585TBT11_INPUT_END_USER_ID ;
   private String[] T000Q2_A586TBT11_INPUT_END_AUTH_CD ;
   private boolean[] T000Q2_n586TBT11_INPUT_END_AUTH_CD ;
   private String[] T000Q2_A884TBT11_UPD_RIYU ;
   private boolean[] T000Q2_n884TBT11_UPD_RIYU ;
   private String[] T000Q2_A307TBT11_DEL_FLG ;
   private boolean[] T000Q2_n307TBT11_DEL_FLG ;
   private String[] T000Q2_A310TBT11_CRT_PROG_NM ;
   private boolean[] T000Q2_n310TBT11_CRT_PROG_NM ;
   private String[] T000Q2_A313TBT11_UPD_PROG_NM ;
   private boolean[] T000Q2_n313TBT11_UPD_PROG_NM ;
   private long[] T000Q11_A303TBT11_STUDY_ID ;
   private int[] T000Q11_A304TBT11_SUBJECT_ID ;
   private short[] T000Q11_A305TBT11_CRF_ID ;
   private short[] T000Q11_A306TBT11_CRF_VERSION ;
}

final  class tbt11_crf_history__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000Q2", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Q3", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Q4", "SELECT TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_VERSION`, TM1.`TBT11_CRT_DATETIME`, TM1.`TBT11_CRT_USER_ID`, TM1.`TBT11_UPD_DATETIME`, TM1.`TBT11_UPD_USER_ID`, TM1.`TBT11_UPD_CNT`, TM1.`TBT11_CRF_INPUT_LEVEL`, TM1.`TBT11_UPLOAD_DATETIME`, TM1.`TBT11_UPLOAD_USER_ID`, TM1.`TBT11_UPLOAD_AUTH_CD`, TM1.`TBT11_DM_ARRIVAL_FLG`, TM1.`TBT11_DM_ARRIVAL_DATETIME`, TM1.`TBT11_APPROVAL_FLG`, TM1.`TBT11_APPROVAL_DATETIME`, TM1.`TBT11_APPROVAL_USER_ID`, TM1.`TBT11_APPROVAL_AUTH_CD`, TM1.`TBT11_INPUT_END_FLG`, TM1.`TBT11_INPUT_END_DATETIME`, TM1.`TBT11_INPUT_END_USER_ID`, TM1.`TBT11_INPUT_END_AUTH_CD`, TM1.`TBT11_UPD_RIYU`, TM1.`TBT11_DEL_FLG`, TM1.`TBT11_CRT_PROG_NM`, TM1.`TBT11_UPD_PROG_NM` FROM `TBT11_CRF_HISTORY` TM1 WHERE TM1.`TBT11_STUDY_ID` = ? and TM1.`TBT11_SUBJECT_ID` = ? and TM1.`TBT11_CRF_ID` = ? and TM1.`TBT11_CRF_VERSION` = ? ORDER BY TM1.`TBT11_STUDY_ID`, TM1.`TBT11_SUBJECT_ID`, TM1.`TBT11_CRF_ID`, TM1.`TBT11_CRF_VERSION` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000Q5", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Q6", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE ( `TBT11_STUDY_ID` > ? or `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` > ? or `TBT11_SUBJECT_ID` = ? and `TBT11_STUDY_ID` = ? and `TBT11_CRF_ID` > ? or `TBT11_CRF_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_STUDY_ID` = ? and `TBT11_CRF_VERSION` > ?) ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000Q7", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` WHERE ( `TBT11_STUDY_ID` < ? or `TBT11_STUDY_ID` = ? and `TBT11_SUBJECT_ID` < ? or `TBT11_SUBJECT_ID` = ? and `TBT11_STUDY_ID` = ? and `TBT11_CRF_ID` < ? or `TBT11_CRF_ID` = ? and `TBT11_SUBJECT_ID` = ? and `TBT11_STUDY_ID` = ? and `TBT11_CRF_VERSION` < ?) ORDER BY `TBT11_STUDY_ID` DESC, `TBT11_SUBJECT_ID` DESC, `TBT11_CRF_ID` DESC, `TBT11_CRF_VERSION` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000Q8", "INSERT INTO `TBT11_CRF_HISTORY` (`TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION`, `TBT11_CRT_DATETIME`, `TBT11_CRT_USER_ID`, `TBT11_UPD_DATETIME`, `TBT11_UPD_USER_ID`, `TBT11_UPD_CNT`, `TBT11_CRF_INPUT_LEVEL`, `TBT11_UPLOAD_DATETIME`, `TBT11_UPLOAD_USER_ID`, `TBT11_UPLOAD_AUTH_CD`, `TBT11_DM_ARRIVAL_FLG`, `TBT11_DM_ARRIVAL_DATETIME`, `TBT11_APPROVAL_FLG`, `TBT11_APPROVAL_DATETIME`, `TBT11_APPROVAL_USER_ID`, `TBT11_APPROVAL_AUTH_CD`, `TBT11_INPUT_END_FLG`, `TBT11_INPUT_END_DATETIME`, `TBT11_INPUT_END_USER_ID`, `TBT11_INPUT_END_AUTH_CD`, `TBT11_UPD_RIYU`, `TBT11_DEL_FLG`, `TBT11_CRT_PROG_NM`, `TBT11_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000Q9", "UPDATE `TBT11_CRF_HISTORY` SET `TBT11_CRT_DATETIME`=?, `TBT11_CRT_USER_ID`=?, `TBT11_UPD_DATETIME`=?, `TBT11_UPD_USER_ID`=?, `TBT11_UPD_CNT`=?, `TBT11_CRF_INPUT_LEVEL`=?, `TBT11_UPLOAD_DATETIME`=?, `TBT11_UPLOAD_USER_ID`=?, `TBT11_UPLOAD_AUTH_CD`=?, `TBT11_DM_ARRIVAL_FLG`=?, `TBT11_DM_ARRIVAL_DATETIME`=?, `TBT11_APPROVAL_FLG`=?, `TBT11_APPROVAL_DATETIME`=?, `TBT11_APPROVAL_USER_ID`=?, `TBT11_APPROVAL_AUTH_CD`=?, `TBT11_INPUT_END_FLG`=?, `TBT11_INPUT_END_DATETIME`=?, `TBT11_INPUT_END_USER_ID`=?, `TBT11_INPUT_END_AUTH_CD`=?, `TBT11_UPD_RIYU`=?, `TBT11_DEL_FLG`=?, `TBT11_CRT_PROG_NM`=?, `TBT11_UPD_PROG_NM`=?  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK)
         ,new UpdateCursor("T000Q10", "DELETE FROM `TBT11_CRF_HISTORY`  WHERE `TBT11_STUDY_ID` = ? AND `TBT11_SUBJECT_ID` = ? AND `TBT11_CRF_ID` = ? AND `TBT11_CRF_VERSION` = ?", GX_NOMASK)
         ,new ForEachCursor("T000Q11", "SELECT `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION` FROM `TBT11_CRF_HISTORY` ORDER BY `TBT11_STUDY_ID`, `TBT11_SUBJECT_ID`, `TBT11_CRF_ID`, `TBT11_CRF_VERSION` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               ((byte[]) buf[14])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               ((byte[]) buf[14])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               ((byte[]) buf[14])[0] = rslt.getByte(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[16])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(15) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[28])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(21) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((short[]) buf[3])[0] = rslt.getShort(4) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 128);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[25], false);
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
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[29], false);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[31], 128);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[33], 2);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(21, (java.util.Date)parms[37], false);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[39], 128);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[43], 2000);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[47], 40);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[49], 40);
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
                  stmt.setByte(6, ((Number) parms[11]).byteValue());
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
                  stmt.setVarchar(9, (String)parms[17], 2);
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
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[21], false);
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
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 128);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[33], false);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 128);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 2);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 2000);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 1);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[43], 40);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 40);
               }
               stmt.setLong(24, ((Number) parms[46]).longValue());
               stmt.setInt(25, ((Number) parms[47]).intValue());
               stmt.setShort(26, ((Number) parms[48]).shortValue());
               stmt.setShort(27, ((Number) parms[49]).shortValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               break;
      }
   }

}

