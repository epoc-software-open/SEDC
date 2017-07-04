/*
               File: tbw06_crf_memo_impl
        Description: CRFメモテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:7.63
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw06_crf_memo_impl extends GXWebPanel
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
      Form.getMeta().addItem("Description", "CRFメモテーブル", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW06_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbw06_crf_memo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw06_crf_memo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw06_crf_memo_impl.class ));
   }

   public tbw06_crf_memo_impl( int remoteHandle ,
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
         wb_table1_2_1944( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1944e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1944( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1944( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1944( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1944e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRFメモテーブル"+"</legend>") ;
         wb_table3_27_1944( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1944e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1944e( true) ;
      }
      else
      {
         wb_table1_2_1944e( false) ;
      }
   }

   public void wb_table3_27_1944( boolean wbgen )
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
         wb_table4_33_1944( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1944e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 116,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW06_CRF_MEMO.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW06_CRF_MEMO.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1944e( true) ;
      }
      else
      {
         wb_table3_27_1944e( false) ;
      }
   }

   public void wb_table4_33_1944( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_session_id_Internalname, "ID", "", "", lblTextblocktbw06_session_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A698TBW06_SESSION_ID", A698TBW06_SESSION_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_SESSION_ID_Internalname, GXutil.rtrim( A698TBW06_SESSION_ID), GXutil.rtrim( localUtil.format( A698TBW06_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTBW06_SESSION_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_SESSION_ID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_app_id_Internalname, "ID", "", "", lblTextblocktbw06_app_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A699TBW06_APP_ID", A699TBW06_APP_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_APP_ID_Internalname, GXutil.rtrim( A699TBW06_APP_ID), GXutil.rtrim( localUtil.format( A699TBW06_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBW06_APP_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_APP_ID_Enabled, 0, 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_disp_datetime_Internalname, "表示日時", "", "", lblTextblocktbw06_disp_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A700TBW06_DISP_DATETIME", A700TBW06_DISP_DATETIME);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_DISP_DATETIME_Internalname, GXutil.rtrim( A700TBW06_DISP_DATETIME), GXutil.rtrim( localUtil.format( A700TBW06_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBW06_DISP_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_DISP_DATETIME_Enabled, 0, 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_study_id_Internalname, "ID", "", "", lblTextblocktbw06_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A701TBW06_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW06_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A701TBW06_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A701TBW06_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBW06_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_subject_id_Internalname, "ID", "", "", lblTextblocktbw06_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A702TBW06_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW06_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A702TBW06_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A702TBW06_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBW06_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_ins_no_Internalname, "挿入連番", "", "", lblTextblocktbw06_ins_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_INS_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A703TBW06_INS_NO, (byte)(3), (byte)(0), ".", "")), ((edtTBW06_INS_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A703TBW06_INS_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A703TBW06_INS_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(63);\"", "", "", "", "", edtTBW06_INS_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_INS_NO_Enabled, 0, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_crf_id_Internalname, "CRFID", "", "", lblTextblocktbw06_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A704TBW06_CRF_ID", GXutil.ltrim( GXutil.str( A704TBW06_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A704TBW06_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW06_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A704TBW06_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A704TBW06_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(68);\"", "", "", "", "", edtTBW06_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_crf_version_Internalname, "CRF更新バージョン", "", "", lblTextblocktbw06_crf_version_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A705TBW06_CRF_VERSION", GXutil.ltrim( GXutil.str( A705TBW06_CRF_VERSION, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_CRF_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A705TBW06_CRF_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBW06_CRF_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A705TBW06_CRF_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A705TBW06_CRF_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(73);\"", "", "", "", "", edtTBW06_CRF_VERSION_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_CRF_VERSION_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_memo_Internalname, "メモ", "", "", lblTextblocktbw06_memo_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A706TBW06_MEMO", A706TBW06_MEMO);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBW06_MEMO_Internalname, GXutil.rtrim( A706TBW06_MEMO), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", (short)(0), 1, edtTBW06_MEMO_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "2000", -1, "", true, "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_stydy_auth_cd_Internalname, "メモ作成者の試験内権限コード", "", "", lblTextblocktbw06_stydy_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A707TBW06_STYDY_AUTH_CD", A707TBW06_STYDY_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_STYDY_AUTH_CD_Internalname, GXutil.rtrim( A707TBW06_STYDY_AUTH_CD), GXutil.rtrim( localUtil.format( A707TBW06_STYDY_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBW06_STYDY_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_STYDY_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_request_user_id_Internalname, "ID", "", "", lblTextblocktbw06_request_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A708TBW06_REQUEST_USER_ID", A708TBW06_REQUEST_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_REQUEST_USER_ID_Internalname, GXutil.rtrim( A708TBW06_REQUEST_USER_ID), GXutil.rtrim( localUtil.format( A708TBW06_REQUEST_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBW06_REQUEST_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_REQUEST_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_edit_request_flg_Internalname, "クエリー依頼フラグ", "", "", lblTextblocktbw06_edit_request_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A709TBW06_EDIT_REQUEST_FLG", A709TBW06_EDIT_REQUEST_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_EDIT_REQUEST_FLG_Internalname, GXutil.rtrim( A709TBW06_EDIT_REQUEST_FLG), GXutil.rtrim( localUtil.format( A709TBW06_EDIT_REQUEST_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(93);\"", "", "", "", "", edtTBW06_EDIT_REQUEST_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_EDIT_REQUEST_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_edit_request_end_flg_Internalname, "クエリー依頼完了フラグ", "", "", lblTextblocktbw06_edit_request_end_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A710TBW06_EDIT_REQUEST_END_FLG", A710TBW06_EDIT_REQUEST_END_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_EDIT_REQUEST_END_FLG_Internalname, GXutil.rtrim( A710TBW06_EDIT_REQUEST_END_FLG), GXutil.rtrim( localUtil.format( A710TBW06_EDIT_REQUEST_END_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTBW06_EDIT_REQUEST_END_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_EDIT_REQUEST_END_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_edit_req_end_datetime_Internalname, "クエリー依頼完了フラグ操作日時", "", "", lblTextblocktbw06_edit_req_end_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A711TBW06_EDIT_REQ_END_DATETIME", localUtil.ttoc( A711TBW06_EDIT_REQ_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW06_EDIT_REQ_END_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_EDIT_REQ_END_DATETIME_Internalname, localUtil.format(A711TBW06_EDIT_REQ_END_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A711TBW06_EDIT_REQ_END_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(103);\"", "", "", "", "", edtTBW06_EDIT_REQ_END_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_EDIT_REQ_END_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW06_CRF_MEMO.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW06_EDIT_REQ_END_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW06_EDIT_REQ_END_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_edit_request_end_user_id_Internalname, "ID", "", "", lblTextblocktbw06_edit_request_end_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A712TBW06_EDIT_REQUEST_END_USER_ID", A712TBW06_EDIT_REQUEST_END_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_EDIT_REQUEST_END_USER_ID_Internalname, GXutil.rtrim( A712TBW06_EDIT_REQUEST_END_USER_ID), GXutil.rtrim( localUtil.format( A712TBW06_EDIT_REQUEST_END_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(108);\"", "", "", "", "", edtTBW06_EDIT_REQUEST_END_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_EDIT_REQUEST_END_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw06_proc_div_Internalname, "処理区分", "", "", lblTextblocktbw06_proc_div_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A713TBW06_PROC_DIV", A713TBW06_PROC_DIV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW06_PROC_DIV_Internalname, GXutil.rtrim( A713TBW06_PROC_DIV), GXutil.rtrim( localUtil.format( A713TBW06_PROC_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(113);\"", "", "", "", "", edtTBW06_PROC_DIV_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW06_PROC_DIV_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW06_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1944e( true) ;
      }
      else
      {
         wb_table4_33_1944e( false) ;
      }
   }

   public void wb_table2_5_1944( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW06_CRF_MEMO.htm");
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
         wb_table2_5_1944e( true) ;
      }
      else
      {
         wb_table2_5_1944e( false) ;
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
      /* Execute user event: e11192 */
      e11192 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A698TBW06_SESSION_ID = httpContext.cgiGet( edtTBW06_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A698TBW06_SESSION_ID", A698TBW06_SESSION_ID);
            A699TBW06_APP_ID = httpContext.cgiGet( edtTBW06_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A699TBW06_APP_ID", A699TBW06_APP_ID);
            A700TBW06_DISP_DATETIME = httpContext.cgiGet( edtTBW06_DISP_DATETIME_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A700TBW06_DISP_DATETIME", A700TBW06_DISP_DATETIME);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW06_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW06_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW06_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW06_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A701TBW06_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
            }
            else
            {
               A701TBW06_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW06_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW06_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW06_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW06_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW06_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A702TBW06_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A702TBW06_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW06_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW06_INS_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW06_INS_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW06_INS_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW06_INS_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A703TBW06_INS_NO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
            }
            else
            {
               A703TBW06_INS_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW06_INS_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW06_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW06_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW06_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW06_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A704TBW06_CRF_ID = (short)(0) ;
               n704TBW06_CRF_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A704TBW06_CRF_ID", GXutil.ltrim( GXutil.str( A704TBW06_CRF_ID, 4, 0)));
            }
            else
            {
               A704TBW06_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW06_CRF_ID_Internalname), ".", ",")) ;
               n704TBW06_CRF_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A704TBW06_CRF_ID", GXutil.ltrim( GXutil.str( A704TBW06_CRF_ID, 4, 0)));
            }
            n704TBW06_CRF_ID = ((0==A704TBW06_CRF_ID) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW06_CRF_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW06_CRF_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW06_CRF_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW06_CRF_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A705TBW06_CRF_VERSION = (short)(0) ;
               n705TBW06_CRF_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A705TBW06_CRF_VERSION", GXutil.ltrim( GXutil.str( A705TBW06_CRF_VERSION, 4, 0)));
            }
            else
            {
               A705TBW06_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW06_CRF_VERSION_Internalname), ".", ",")) ;
               n705TBW06_CRF_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A705TBW06_CRF_VERSION", GXutil.ltrim( GXutil.str( A705TBW06_CRF_VERSION, 4, 0)));
            }
            n705TBW06_CRF_VERSION = ((0==A705TBW06_CRF_VERSION) ? true : false) ;
            A706TBW06_MEMO = httpContext.cgiGet( edtTBW06_MEMO_Internalname) ;
            n706TBW06_MEMO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A706TBW06_MEMO", A706TBW06_MEMO);
            n706TBW06_MEMO = ((GXutil.strcmp("", A706TBW06_MEMO)==0) ? true : false) ;
            A707TBW06_STYDY_AUTH_CD = httpContext.cgiGet( edtTBW06_STYDY_AUTH_CD_Internalname) ;
            n707TBW06_STYDY_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A707TBW06_STYDY_AUTH_CD", A707TBW06_STYDY_AUTH_CD);
            n707TBW06_STYDY_AUTH_CD = ((GXutil.strcmp("", A707TBW06_STYDY_AUTH_CD)==0) ? true : false) ;
            A708TBW06_REQUEST_USER_ID = httpContext.cgiGet( edtTBW06_REQUEST_USER_ID_Internalname) ;
            n708TBW06_REQUEST_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A708TBW06_REQUEST_USER_ID", A708TBW06_REQUEST_USER_ID);
            n708TBW06_REQUEST_USER_ID = ((GXutil.strcmp("", A708TBW06_REQUEST_USER_ID)==0) ? true : false) ;
            A709TBW06_EDIT_REQUEST_FLG = httpContext.cgiGet( edtTBW06_EDIT_REQUEST_FLG_Internalname) ;
            n709TBW06_EDIT_REQUEST_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A709TBW06_EDIT_REQUEST_FLG", A709TBW06_EDIT_REQUEST_FLG);
            n709TBW06_EDIT_REQUEST_FLG = ((GXutil.strcmp("", A709TBW06_EDIT_REQUEST_FLG)==0) ? true : false) ;
            A710TBW06_EDIT_REQUEST_END_FLG = httpContext.cgiGet( edtTBW06_EDIT_REQUEST_END_FLG_Internalname) ;
            n710TBW06_EDIT_REQUEST_END_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A710TBW06_EDIT_REQUEST_END_FLG", A710TBW06_EDIT_REQUEST_END_FLG);
            n710TBW06_EDIT_REQUEST_END_FLG = ((GXutil.strcmp("", A710TBW06_EDIT_REQUEST_END_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW06_EDIT_REQ_END_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"クエリー依頼完了フラグ操作日時"}), 1, "TBW06_EDIT_REQ_END_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW06_EDIT_REQ_END_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A711TBW06_EDIT_REQ_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n711TBW06_EDIT_REQ_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A711TBW06_EDIT_REQ_END_DATETIME", localUtil.ttoc( A711TBW06_EDIT_REQ_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A711TBW06_EDIT_REQ_END_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW06_EDIT_REQ_END_DATETIME_Internalname)) ;
               n711TBW06_EDIT_REQ_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A711TBW06_EDIT_REQ_END_DATETIME", localUtil.ttoc( A711TBW06_EDIT_REQ_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n711TBW06_EDIT_REQ_END_DATETIME = (GXutil.nullDate().equals(A711TBW06_EDIT_REQ_END_DATETIME) ? true : false) ;
            A712TBW06_EDIT_REQUEST_END_USER_ID = httpContext.cgiGet( edtTBW06_EDIT_REQUEST_END_USER_ID_Internalname) ;
            n712TBW06_EDIT_REQUEST_END_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A712TBW06_EDIT_REQUEST_END_USER_ID", A712TBW06_EDIT_REQUEST_END_USER_ID);
            n712TBW06_EDIT_REQUEST_END_USER_ID = ((GXutil.strcmp("", A712TBW06_EDIT_REQUEST_END_USER_ID)==0) ? true : false) ;
            A713TBW06_PROC_DIV = httpContext.cgiGet( edtTBW06_PROC_DIV_Internalname) ;
            n713TBW06_PROC_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A713TBW06_PROC_DIV", A713TBW06_PROC_DIV);
            n713TBW06_PROC_DIV = ((GXutil.strcmp("", A713TBW06_PROC_DIV)==0) ? true : false) ;
            /* Read saved values. */
            Z698TBW06_SESSION_ID = httpContext.cgiGet( "Z698TBW06_SESSION_ID") ;
            Z699TBW06_APP_ID = httpContext.cgiGet( "Z699TBW06_APP_ID") ;
            Z700TBW06_DISP_DATETIME = httpContext.cgiGet( "Z700TBW06_DISP_DATETIME") ;
            Z701TBW06_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z701TBW06_STUDY_ID"), ".", ",") ;
            Z702TBW06_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z702TBW06_SUBJECT_ID"), ".", ",")) ;
            Z703TBW06_INS_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z703TBW06_INS_NO"), ".", ",")) ;
            Z704TBW06_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z704TBW06_CRF_ID"), ".", ",")) ;
            n704TBW06_CRF_ID = ((0==A704TBW06_CRF_ID) ? true : false) ;
            Z705TBW06_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z705TBW06_CRF_VERSION"), ".", ",")) ;
            n705TBW06_CRF_VERSION = ((0==A705TBW06_CRF_VERSION) ? true : false) ;
            Z706TBW06_MEMO = httpContext.cgiGet( "Z706TBW06_MEMO") ;
            n706TBW06_MEMO = ((GXutil.strcmp("", A706TBW06_MEMO)==0) ? true : false) ;
            Z707TBW06_STYDY_AUTH_CD = httpContext.cgiGet( "Z707TBW06_STYDY_AUTH_CD") ;
            n707TBW06_STYDY_AUTH_CD = ((GXutil.strcmp("", A707TBW06_STYDY_AUTH_CD)==0) ? true : false) ;
            Z708TBW06_REQUEST_USER_ID = httpContext.cgiGet( "Z708TBW06_REQUEST_USER_ID") ;
            n708TBW06_REQUEST_USER_ID = ((GXutil.strcmp("", A708TBW06_REQUEST_USER_ID)==0) ? true : false) ;
            Z709TBW06_EDIT_REQUEST_FLG = httpContext.cgiGet( "Z709TBW06_EDIT_REQUEST_FLG") ;
            n709TBW06_EDIT_REQUEST_FLG = ((GXutil.strcmp("", A709TBW06_EDIT_REQUEST_FLG)==0) ? true : false) ;
            Z710TBW06_EDIT_REQUEST_END_FLG = httpContext.cgiGet( "Z710TBW06_EDIT_REQUEST_END_FLG") ;
            n710TBW06_EDIT_REQUEST_END_FLG = ((GXutil.strcmp("", A710TBW06_EDIT_REQUEST_END_FLG)==0) ? true : false) ;
            Z711TBW06_EDIT_REQ_END_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z711TBW06_EDIT_REQ_END_DATETIME"), 0) ;
            n711TBW06_EDIT_REQ_END_DATETIME = (GXutil.nullDate().equals(A711TBW06_EDIT_REQ_END_DATETIME) ? true : false) ;
            Z712TBW06_EDIT_REQUEST_END_USER_ID = httpContext.cgiGet( "Z712TBW06_EDIT_REQUEST_END_USER_ID") ;
            n712TBW06_EDIT_REQUEST_END_USER_ID = ((GXutil.strcmp("", A712TBW06_EDIT_REQUEST_END_USER_ID)==0) ? true : false) ;
            Z713TBW06_PROC_DIV = httpContext.cgiGet( "Z713TBW06_PROC_DIV") ;
            n713TBW06_PROC_DIV = ((GXutil.strcmp("", A713TBW06_PROC_DIV)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV8Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A698TBW06_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A698TBW06_SESSION_ID", A698TBW06_SESSION_ID);
               A699TBW06_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A699TBW06_APP_ID", A699TBW06_APP_ID);
               A700TBW06_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A700TBW06_DISP_DATETIME", A700TBW06_DISP_DATETIME);
               A701TBW06_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
               A702TBW06_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
               A703TBW06_INS_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
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
                     /* Execute user event: e11192 */
                     e11192 ();
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1944( ) ;
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
      disableAttributes1944( ) ;
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

   public void resetCaption190( )
   {
   }

   public void e11192( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_BC_FLG", AV7W_BC_FLG);
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1132( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1944( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z704TBW06_CRF_ID = T00193_A704TBW06_CRF_ID[0] ;
            Z705TBW06_CRF_VERSION = T00193_A705TBW06_CRF_VERSION[0] ;
            Z706TBW06_MEMO = T00193_A706TBW06_MEMO[0] ;
            Z707TBW06_STYDY_AUTH_CD = T00193_A707TBW06_STYDY_AUTH_CD[0] ;
            Z708TBW06_REQUEST_USER_ID = T00193_A708TBW06_REQUEST_USER_ID[0] ;
            Z709TBW06_EDIT_REQUEST_FLG = T00193_A709TBW06_EDIT_REQUEST_FLG[0] ;
            Z710TBW06_EDIT_REQUEST_END_FLG = T00193_A710TBW06_EDIT_REQUEST_END_FLG[0] ;
            Z711TBW06_EDIT_REQ_END_DATETIME = T00193_A711TBW06_EDIT_REQ_END_DATETIME[0] ;
            Z712TBW06_EDIT_REQUEST_END_USER_ID = T00193_A712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
            Z713TBW06_PROC_DIV = T00193_A713TBW06_PROC_DIV[0] ;
         }
         else
         {
            Z704TBW06_CRF_ID = A704TBW06_CRF_ID ;
            Z705TBW06_CRF_VERSION = A705TBW06_CRF_VERSION ;
            Z706TBW06_MEMO = A706TBW06_MEMO ;
            Z707TBW06_STYDY_AUTH_CD = A707TBW06_STYDY_AUTH_CD ;
            Z708TBW06_REQUEST_USER_ID = A708TBW06_REQUEST_USER_ID ;
            Z709TBW06_EDIT_REQUEST_FLG = A709TBW06_EDIT_REQUEST_FLG ;
            Z710TBW06_EDIT_REQUEST_END_FLG = A710TBW06_EDIT_REQUEST_END_FLG ;
            Z711TBW06_EDIT_REQ_END_DATETIME = A711TBW06_EDIT_REQ_END_DATETIME ;
            Z712TBW06_EDIT_REQUEST_END_USER_ID = A712TBW06_EDIT_REQUEST_END_USER_ID ;
            Z713TBW06_PROC_DIV = A713TBW06_PROC_DIV ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z698TBW06_SESSION_ID = A698TBW06_SESSION_ID ;
         Z699TBW06_APP_ID = A699TBW06_APP_ID ;
         Z700TBW06_DISP_DATETIME = A700TBW06_DISP_DATETIME ;
         Z701TBW06_STUDY_ID = A701TBW06_STUDY_ID ;
         Z702TBW06_SUBJECT_ID = A702TBW06_SUBJECT_ID ;
         Z703TBW06_INS_NO = A703TBW06_INS_NO ;
         Z704TBW06_CRF_ID = A704TBW06_CRF_ID ;
         Z705TBW06_CRF_VERSION = A705TBW06_CRF_VERSION ;
         Z706TBW06_MEMO = A706TBW06_MEMO ;
         Z707TBW06_STYDY_AUTH_CD = A707TBW06_STYDY_AUTH_CD ;
         Z708TBW06_REQUEST_USER_ID = A708TBW06_REQUEST_USER_ID ;
         Z709TBW06_EDIT_REQUEST_FLG = A709TBW06_EDIT_REQUEST_FLG ;
         Z710TBW06_EDIT_REQUEST_END_FLG = A710TBW06_EDIT_REQUEST_END_FLG ;
         Z711TBW06_EDIT_REQ_END_DATETIME = A711TBW06_EDIT_REQ_END_DATETIME ;
         Z712TBW06_EDIT_REQUEST_END_USER_ID = A712TBW06_EDIT_REQUEST_END_USER_ID ;
         Z713TBW06_PROC_DIV = A713TBW06_PROC_DIV ;
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

   public void load1944( )
   {
      /* Using cursor T00194 */
      pr_default.execute(2, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A704TBW06_CRF_ID = T00194_A704TBW06_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704TBW06_CRF_ID", GXutil.ltrim( GXutil.str( A704TBW06_CRF_ID, 4, 0)));
         n704TBW06_CRF_ID = T00194_n704TBW06_CRF_ID[0] ;
         A705TBW06_CRF_VERSION = T00194_A705TBW06_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705TBW06_CRF_VERSION", GXutil.ltrim( GXutil.str( A705TBW06_CRF_VERSION, 4, 0)));
         n705TBW06_CRF_VERSION = T00194_n705TBW06_CRF_VERSION[0] ;
         A706TBW06_MEMO = T00194_A706TBW06_MEMO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706TBW06_MEMO", A706TBW06_MEMO);
         n706TBW06_MEMO = T00194_n706TBW06_MEMO[0] ;
         A707TBW06_STYDY_AUTH_CD = T00194_A707TBW06_STYDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707TBW06_STYDY_AUTH_CD", A707TBW06_STYDY_AUTH_CD);
         n707TBW06_STYDY_AUTH_CD = T00194_n707TBW06_STYDY_AUTH_CD[0] ;
         A708TBW06_REQUEST_USER_ID = T00194_A708TBW06_REQUEST_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A708TBW06_REQUEST_USER_ID", A708TBW06_REQUEST_USER_ID);
         n708TBW06_REQUEST_USER_ID = T00194_n708TBW06_REQUEST_USER_ID[0] ;
         A709TBW06_EDIT_REQUEST_FLG = T00194_A709TBW06_EDIT_REQUEST_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709TBW06_EDIT_REQUEST_FLG", A709TBW06_EDIT_REQUEST_FLG);
         n709TBW06_EDIT_REQUEST_FLG = T00194_n709TBW06_EDIT_REQUEST_FLG[0] ;
         A710TBW06_EDIT_REQUEST_END_FLG = T00194_A710TBW06_EDIT_REQUEST_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A710TBW06_EDIT_REQUEST_END_FLG", A710TBW06_EDIT_REQUEST_END_FLG);
         n710TBW06_EDIT_REQUEST_END_FLG = T00194_n710TBW06_EDIT_REQUEST_END_FLG[0] ;
         A711TBW06_EDIT_REQ_END_DATETIME = T00194_A711TBW06_EDIT_REQ_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A711TBW06_EDIT_REQ_END_DATETIME", localUtil.ttoc( A711TBW06_EDIT_REQ_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n711TBW06_EDIT_REQ_END_DATETIME = T00194_n711TBW06_EDIT_REQ_END_DATETIME[0] ;
         A712TBW06_EDIT_REQUEST_END_USER_ID = T00194_A712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A712TBW06_EDIT_REQUEST_END_USER_ID", A712TBW06_EDIT_REQUEST_END_USER_ID);
         n712TBW06_EDIT_REQUEST_END_USER_ID = T00194_n712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         A713TBW06_PROC_DIV = T00194_A713TBW06_PROC_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A713TBW06_PROC_DIV", A713TBW06_PROC_DIV);
         n713TBW06_PROC_DIV = T00194_n713TBW06_PROC_DIV[0] ;
         zm1944( -2) ;
      }
      pr_default.close(2);
      onLoadActions1944( ) ;
   }

   public void onLoadActions1944( )
   {
      AV8Pgmname = "TBW06_CRF_MEMO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable1944( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TBW06_CRF_MEMO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      if ( ! ( GXutil.nullDate().equals(A711TBW06_EDIT_REQ_END_DATETIME) || (( A711TBW06_EDIT_REQ_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A711TBW06_EDIT_REQ_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　クエリー依頼完了フラグ操作日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1944( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1944( )
   {
      /* Using cursor T00195 */
      pr_default.execute(3, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound44 = (short)(1) ;
      }
      else
      {
         RcdFound44 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00193 */
      pr_default.execute(1, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1944( 2) ;
         RcdFound44 = (short)(1) ;
         A698TBW06_SESSION_ID = T00193_A698TBW06_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698TBW06_SESSION_ID", A698TBW06_SESSION_ID);
         A699TBW06_APP_ID = T00193_A699TBW06_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A699TBW06_APP_ID", A699TBW06_APP_ID);
         A700TBW06_DISP_DATETIME = T00193_A700TBW06_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A700TBW06_DISP_DATETIME", A700TBW06_DISP_DATETIME);
         A701TBW06_STUDY_ID = T00193_A701TBW06_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
         A702TBW06_SUBJECT_ID = T00193_A702TBW06_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
         A703TBW06_INS_NO = T00193_A703TBW06_INS_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
         A704TBW06_CRF_ID = T00193_A704TBW06_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A704TBW06_CRF_ID", GXutil.ltrim( GXutil.str( A704TBW06_CRF_ID, 4, 0)));
         n704TBW06_CRF_ID = T00193_n704TBW06_CRF_ID[0] ;
         A705TBW06_CRF_VERSION = T00193_A705TBW06_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A705TBW06_CRF_VERSION", GXutil.ltrim( GXutil.str( A705TBW06_CRF_VERSION, 4, 0)));
         n705TBW06_CRF_VERSION = T00193_n705TBW06_CRF_VERSION[0] ;
         A706TBW06_MEMO = T00193_A706TBW06_MEMO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A706TBW06_MEMO", A706TBW06_MEMO);
         n706TBW06_MEMO = T00193_n706TBW06_MEMO[0] ;
         A707TBW06_STYDY_AUTH_CD = T00193_A707TBW06_STYDY_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A707TBW06_STYDY_AUTH_CD", A707TBW06_STYDY_AUTH_CD);
         n707TBW06_STYDY_AUTH_CD = T00193_n707TBW06_STYDY_AUTH_CD[0] ;
         A708TBW06_REQUEST_USER_ID = T00193_A708TBW06_REQUEST_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A708TBW06_REQUEST_USER_ID", A708TBW06_REQUEST_USER_ID);
         n708TBW06_REQUEST_USER_ID = T00193_n708TBW06_REQUEST_USER_ID[0] ;
         A709TBW06_EDIT_REQUEST_FLG = T00193_A709TBW06_EDIT_REQUEST_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A709TBW06_EDIT_REQUEST_FLG", A709TBW06_EDIT_REQUEST_FLG);
         n709TBW06_EDIT_REQUEST_FLG = T00193_n709TBW06_EDIT_REQUEST_FLG[0] ;
         A710TBW06_EDIT_REQUEST_END_FLG = T00193_A710TBW06_EDIT_REQUEST_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A710TBW06_EDIT_REQUEST_END_FLG", A710TBW06_EDIT_REQUEST_END_FLG);
         n710TBW06_EDIT_REQUEST_END_FLG = T00193_n710TBW06_EDIT_REQUEST_END_FLG[0] ;
         A711TBW06_EDIT_REQ_END_DATETIME = T00193_A711TBW06_EDIT_REQ_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A711TBW06_EDIT_REQ_END_DATETIME", localUtil.ttoc( A711TBW06_EDIT_REQ_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n711TBW06_EDIT_REQ_END_DATETIME = T00193_n711TBW06_EDIT_REQ_END_DATETIME[0] ;
         A712TBW06_EDIT_REQUEST_END_USER_ID = T00193_A712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A712TBW06_EDIT_REQUEST_END_USER_ID", A712TBW06_EDIT_REQUEST_END_USER_ID);
         n712TBW06_EDIT_REQUEST_END_USER_ID = T00193_n712TBW06_EDIT_REQUEST_END_USER_ID[0] ;
         A713TBW06_PROC_DIV = T00193_A713TBW06_PROC_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A713TBW06_PROC_DIV", A713TBW06_PROC_DIV);
         n713TBW06_PROC_DIV = T00193_n713TBW06_PROC_DIV[0] ;
         Z698TBW06_SESSION_ID = A698TBW06_SESSION_ID ;
         Z699TBW06_APP_ID = A699TBW06_APP_ID ;
         Z700TBW06_DISP_DATETIME = A700TBW06_DISP_DATETIME ;
         Z701TBW06_STUDY_ID = A701TBW06_STUDY_ID ;
         Z702TBW06_SUBJECT_ID = A702TBW06_SUBJECT_ID ;
         Z703TBW06_INS_NO = A703TBW06_INS_NO ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1944( ) ;
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound44 = (short)(0) ;
         initializeNonKey1944( ) ;
         sMode44 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode44 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1944( ) ;
      if ( RcdFound44 == 0 )
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
      RcdFound44 = (short)(0) ;
      /* Using cursor T00196 */
      pr_default.execute(4, new Object[] {A698TBW06_SESSION_ID, A698TBW06_SESSION_ID, A699TBW06_APP_ID, A699TBW06_APP_ID, A698TBW06_SESSION_ID, A700TBW06_DISP_DATETIME, A700TBW06_DISP_DATETIME, A699TBW06_APP_ID, A698TBW06_SESSION_ID, new Long(A701TBW06_STUDY_ID), new Long(A701TBW06_STUDY_ID), A700TBW06_DISP_DATETIME, A699TBW06_APP_ID, A698TBW06_SESSION_ID, new Integer(A702TBW06_SUBJECT_ID), new Integer(A702TBW06_SUBJECT_ID), new Long(A701TBW06_STUDY_ID), A700TBW06_DISP_DATETIME, A699TBW06_APP_ID, A698TBW06_SESSION_ID, new Short(A703TBW06_INS_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) < 0 ) || ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00196_A699TBW06_APP_ID[0], A699TBW06_APP_ID) < 0 ) || ( GXutil.strcmp(T00196_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00196_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T00196_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00196_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00196_A701TBW06_STUDY_ID[0] < A701TBW06_STUDY_ID ) || ( T00196_A701TBW06_STUDY_ID[0] == A701TBW06_STUDY_ID ) && ( GXutil.strcmp(T00196_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00196_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00196_A702TBW06_SUBJECT_ID[0] < A702TBW06_SUBJECT_ID ) || ( T00196_A702TBW06_SUBJECT_ID[0] == A702TBW06_SUBJECT_ID ) && ( T00196_A701TBW06_STUDY_ID[0] == A701TBW06_STUDY_ID ) && ( GXutil.strcmp(T00196_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00196_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00196_A703TBW06_INS_NO[0] < A703TBW06_INS_NO ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) > 0 ) || ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00196_A699TBW06_APP_ID[0], A699TBW06_APP_ID) > 0 ) || ( GXutil.strcmp(T00196_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00196_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T00196_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00196_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00196_A701TBW06_STUDY_ID[0] > A701TBW06_STUDY_ID ) || ( T00196_A701TBW06_STUDY_ID[0] == A701TBW06_STUDY_ID ) && ( GXutil.strcmp(T00196_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00196_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00196_A702TBW06_SUBJECT_ID[0] > A702TBW06_SUBJECT_ID ) || ( T00196_A702TBW06_SUBJECT_ID[0] == A702TBW06_SUBJECT_ID ) && ( T00196_A701TBW06_STUDY_ID[0] == A701TBW06_STUDY_ID ) && ( GXutil.strcmp(T00196_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00196_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00196_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00196_A703TBW06_INS_NO[0] > A703TBW06_INS_NO ) ) )
         {
            A698TBW06_SESSION_ID = T00196_A698TBW06_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A698TBW06_SESSION_ID", A698TBW06_SESSION_ID);
            A699TBW06_APP_ID = T00196_A699TBW06_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A699TBW06_APP_ID", A699TBW06_APP_ID);
            A700TBW06_DISP_DATETIME = T00196_A700TBW06_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A700TBW06_DISP_DATETIME", A700TBW06_DISP_DATETIME);
            A701TBW06_STUDY_ID = T00196_A701TBW06_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
            A702TBW06_SUBJECT_ID = T00196_A702TBW06_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
            A703TBW06_INS_NO = T00196_A703TBW06_INS_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
            RcdFound44 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound44 = (short)(0) ;
      /* Using cursor T00197 */
      pr_default.execute(5, new Object[] {A698TBW06_SESSION_ID, A698TBW06_SESSION_ID, A699TBW06_APP_ID, A699TBW06_APP_ID, A698TBW06_SESSION_ID, A700TBW06_DISP_DATETIME, A700TBW06_DISP_DATETIME, A699TBW06_APP_ID, A698TBW06_SESSION_ID, new Long(A701TBW06_STUDY_ID), new Long(A701TBW06_STUDY_ID), A700TBW06_DISP_DATETIME, A699TBW06_APP_ID, A698TBW06_SESSION_ID, new Integer(A702TBW06_SUBJECT_ID), new Integer(A702TBW06_SUBJECT_ID), new Long(A701TBW06_STUDY_ID), A700TBW06_DISP_DATETIME, A699TBW06_APP_ID, A698TBW06_SESSION_ID, new Short(A703TBW06_INS_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) > 0 ) || ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00197_A699TBW06_APP_ID[0], A699TBW06_APP_ID) > 0 ) || ( GXutil.strcmp(T00197_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00197_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T00197_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00197_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00197_A701TBW06_STUDY_ID[0] > A701TBW06_STUDY_ID ) || ( T00197_A701TBW06_STUDY_ID[0] == A701TBW06_STUDY_ID ) && ( GXutil.strcmp(T00197_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00197_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00197_A702TBW06_SUBJECT_ID[0] > A702TBW06_SUBJECT_ID ) || ( T00197_A702TBW06_SUBJECT_ID[0] == A702TBW06_SUBJECT_ID ) && ( T00197_A701TBW06_STUDY_ID[0] == A701TBW06_STUDY_ID ) && ( GXutil.strcmp(T00197_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00197_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00197_A703TBW06_INS_NO[0] > A703TBW06_INS_NO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) < 0 ) || ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00197_A699TBW06_APP_ID[0], A699TBW06_APP_ID) < 0 ) || ( GXutil.strcmp(T00197_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00197_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T00197_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00197_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00197_A701TBW06_STUDY_ID[0] < A701TBW06_STUDY_ID ) || ( T00197_A701TBW06_STUDY_ID[0] == A701TBW06_STUDY_ID ) && ( GXutil.strcmp(T00197_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00197_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00197_A702TBW06_SUBJECT_ID[0] < A702TBW06_SUBJECT_ID ) || ( T00197_A702TBW06_SUBJECT_ID[0] == A702TBW06_SUBJECT_ID ) && ( T00197_A701TBW06_STUDY_ID[0] == A701TBW06_STUDY_ID ) && ( GXutil.strcmp(T00197_A700TBW06_DISP_DATETIME[0], A700TBW06_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00197_A699TBW06_APP_ID[0], A699TBW06_APP_ID) == 0 ) && ( GXutil.strcmp(T00197_A698TBW06_SESSION_ID[0], A698TBW06_SESSION_ID) == 0 ) && ( T00197_A703TBW06_INS_NO[0] < A703TBW06_INS_NO ) ) )
         {
            A698TBW06_SESSION_ID = T00197_A698TBW06_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A698TBW06_SESSION_ID", A698TBW06_SESSION_ID);
            A699TBW06_APP_ID = T00197_A699TBW06_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A699TBW06_APP_ID", A699TBW06_APP_ID);
            A700TBW06_DISP_DATETIME = T00197_A700TBW06_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A700TBW06_DISP_DATETIME", A700TBW06_DISP_DATETIME);
            A701TBW06_STUDY_ID = T00197_A701TBW06_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
            A702TBW06_SUBJECT_ID = T00197_A702TBW06_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
            A703TBW06_INS_NO = T00197_A703TBW06_INS_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
            RcdFound44 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1944( ) ;
      if ( RcdFound44 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBW06_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW06_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A698TBW06_SESSION_ID, Z698TBW06_SESSION_ID) != 0 ) || ( GXutil.strcmp(A699TBW06_APP_ID, Z699TBW06_APP_ID) != 0 ) || ( GXutil.strcmp(A700TBW06_DISP_DATETIME, Z700TBW06_DISP_DATETIME) != 0 ) || ( A701TBW06_STUDY_ID != Z701TBW06_STUDY_ID ) || ( A702TBW06_SUBJECT_ID != Z702TBW06_SUBJECT_ID ) || ( A703TBW06_INS_NO != Z703TBW06_INS_NO ) )
         {
            A698TBW06_SESSION_ID = Z698TBW06_SESSION_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A698TBW06_SESSION_ID", A698TBW06_SESSION_ID);
            A699TBW06_APP_ID = Z699TBW06_APP_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A699TBW06_APP_ID", A699TBW06_APP_ID);
            A700TBW06_DISP_DATETIME = Z700TBW06_DISP_DATETIME ;
            httpContext.ajax_rsp_assign_attri("", false, "A700TBW06_DISP_DATETIME", A700TBW06_DISP_DATETIME);
            A701TBW06_STUDY_ID = Z701TBW06_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
            A702TBW06_SUBJECT_ID = Z702TBW06_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
            A703TBW06_INS_NO = Z703TBW06_INS_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW06_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW06_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBW06_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update1944( ) ;
            GX_FocusControl = edtTBW06_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A698TBW06_SESSION_ID, Z698TBW06_SESSION_ID) != 0 ) || ( GXutil.strcmp(A699TBW06_APP_ID, Z699TBW06_APP_ID) != 0 ) || ( GXutil.strcmp(A700TBW06_DISP_DATETIME, Z700TBW06_DISP_DATETIME) != 0 ) || ( A701TBW06_STUDY_ID != Z701TBW06_STUDY_ID ) || ( A702TBW06_SUBJECT_ID != Z702TBW06_SUBJECT_ID ) || ( A703TBW06_INS_NO != Z703TBW06_INS_NO ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBW06_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert1944( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW06_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW06_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW06_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1944( ) ;
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
      if ( ( GXutil.strcmp(A698TBW06_SESSION_ID, Z698TBW06_SESSION_ID) != 0 ) || ( GXutil.strcmp(A699TBW06_APP_ID, Z699TBW06_APP_ID) != 0 ) || ( GXutil.strcmp(A700TBW06_DISP_DATETIME, Z700TBW06_DISP_DATETIME) != 0 ) || ( A701TBW06_STUDY_ID != Z701TBW06_STUDY_ID ) || ( A702TBW06_SUBJECT_ID != Z702TBW06_SUBJECT_ID ) || ( A703TBW06_INS_NO != Z703TBW06_INS_NO ) )
      {
         A698TBW06_SESSION_ID = Z698TBW06_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A698TBW06_SESSION_ID", A698TBW06_SESSION_ID);
         A699TBW06_APP_ID = Z699TBW06_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A699TBW06_APP_ID", A699TBW06_APP_ID);
         A700TBW06_DISP_DATETIME = Z700TBW06_DISP_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A700TBW06_DISP_DATETIME", A700TBW06_DISP_DATETIME);
         A701TBW06_STUDY_ID = Z701TBW06_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
         A702TBW06_SUBJECT_ID = Z702TBW06_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
         A703TBW06_INS_NO = Z703TBW06_INS_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW06_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW06_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW06_SESSION_ID_Internalname ;
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
      if ( RcdFound44 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW06_SESSION_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBW06_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1944( ) ;
      if ( RcdFound44 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW06_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1944( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound44 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW06_CRF_ID_Internalname ;
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
      if ( RcdFound44 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW06_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1944( ) ;
      if ( RcdFound44 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound44 != 0 )
         {
            scanNext1944( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW06_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1944( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1944( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00192 */
         pr_default.execute(0, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW06_CRF_MEMO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z704TBW06_CRF_ID != T00192_A704TBW06_CRF_ID[0] ) || ( Z705TBW06_CRF_VERSION != T00192_A705TBW06_CRF_VERSION[0] ) || ( GXutil.strcmp(Z706TBW06_MEMO, T00192_A706TBW06_MEMO[0]) != 0 ) || ( GXutil.strcmp(Z707TBW06_STYDY_AUTH_CD, T00192_A707TBW06_STYDY_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z708TBW06_REQUEST_USER_ID, T00192_A708TBW06_REQUEST_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z709TBW06_EDIT_REQUEST_FLG, T00192_A709TBW06_EDIT_REQUEST_FLG[0]) != 0 ) || ( GXutil.strcmp(Z710TBW06_EDIT_REQUEST_END_FLG, T00192_A710TBW06_EDIT_REQUEST_END_FLG[0]) != 0 ) || !( Z711TBW06_EDIT_REQ_END_DATETIME.equals( T00192_A711TBW06_EDIT_REQ_END_DATETIME[0] ) ) || ( GXutil.strcmp(Z712TBW06_EDIT_REQUEST_END_USER_ID, T00192_A712TBW06_EDIT_REQUEST_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z713TBW06_PROC_DIV, T00192_A713TBW06_PROC_DIV[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW06_CRF_MEMO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1944( )
   {
      beforeValidate1944( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1944( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1944( 0) ;
         checkOptimisticConcurrency1944( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1944( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1944( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00198 */
                  pr_default.execute(6, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO), new Boolean(n704TBW06_CRF_ID), new Short(A704TBW06_CRF_ID), new Boolean(n705TBW06_CRF_VERSION), new Short(A705TBW06_CRF_VERSION), new Boolean(n706TBW06_MEMO), A706TBW06_MEMO, new Boolean(n707TBW06_STYDY_AUTH_CD), A707TBW06_STYDY_AUTH_CD, new Boolean(n708TBW06_REQUEST_USER_ID), A708TBW06_REQUEST_USER_ID, new Boolean(n709TBW06_EDIT_REQUEST_FLG), A709TBW06_EDIT_REQUEST_FLG, new Boolean(n710TBW06_EDIT_REQUEST_END_FLG), A710TBW06_EDIT_REQUEST_END_FLG, new Boolean(n711TBW06_EDIT_REQ_END_DATETIME), A711TBW06_EDIT_REQ_END_DATETIME, new Boolean(n712TBW06_EDIT_REQUEST_END_USER_ID), A712TBW06_EDIT_REQUEST_END_USER_ID, new Boolean(n713TBW06_PROC_DIV), A713TBW06_PROC_DIV});
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
                        resetCaption190( ) ;
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
            load1944( ) ;
         }
         endLevel1944( ) ;
      }
      closeExtendedTableCursors1944( ) ;
   }

   public void update1944( )
   {
      beforeValidate1944( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1944( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1944( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1944( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1944( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00199 */
                  pr_default.execute(7, new Object[] {new Boolean(n704TBW06_CRF_ID), new Short(A704TBW06_CRF_ID), new Boolean(n705TBW06_CRF_VERSION), new Short(A705TBW06_CRF_VERSION), new Boolean(n706TBW06_MEMO), A706TBW06_MEMO, new Boolean(n707TBW06_STYDY_AUTH_CD), A707TBW06_STYDY_AUTH_CD, new Boolean(n708TBW06_REQUEST_USER_ID), A708TBW06_REQUEST_USER_ID, new Boolean(n709TBW06_EDIT_REQUEST_FLG), A709TBW06_EDIT_REQUEST_FLG, new Boolean(n710TBW06_EDIT_REQUEST_END_FLG), A710TBW06_EDIT_REQUEST_END_FLG, new Boolean(n711TBW06_EDIT_REQ_END_DATETIME), A711TBW06_EDIT_REQ_END_DATETIME, new Boolean(n712TBW06_EDIT_REQUEST_END_USER_ID), A712TBW06_EDIT_REQUEST_END_USER_ID, new Boolean(n713TBW06_PROC_DIV), A713TBW06_PROC_DIV, A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW06_CRF_MEMO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1944( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption190( ) ;
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
         endLevel1944( ) ;
      }
      closeExtendedTableCursors1944( ) ;
   }

   public void deferredUpdate1944( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1944( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1944( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1944( ) ;
         afterConfirm1944( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1944( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001910 */
               pr_default.execute(8, new Object[] {A698TBW06_SESSION_ID, A699TBW06_APP_ID, A700TBW06_DISP_DATETIME, new Long(A701TBW06_STUDY_ID), new Integer(A702TBW06_SUBJECT_ID), new Short(A703TBW06_INS_NO)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound44 == 0 )
                     {
                        initAll1944( ) ;
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
                     resetCaption190( ) ;
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
      sMode44 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1944( ) ;
      Gx_mode = sMode44 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1944( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW06_CRF_MEMO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      }
   }

   public void endLevel1944( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1944( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw06_crf_memo");
         if ( AnyError == 0 )
         {
            confirmValues190( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw06_crf_memo");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1944( )
   {
      /* Using cursor T001911 */
      pr_default.execute(9);
      RcdFound44 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A698TBW06_SESSION_ID = T001911_A698TBW06_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698TBW06_SESSION_ID", A698TBW06_SESSION_ID);
         A699TBW06_APP_ID = T001911_A699TBW06_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A699TBW06_APP_ID", A699TBW06_APP_ID);
         A700TBW06_DISP_DATETIME = T001911_A700TBW06_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A700TBW06_DISP_DATETIME", A700TBW06_DISP_DATETIME);
         A701TBW06_STUDY_ID = T001911_A701TBW06_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
         A702TBW06_SUBJECT_ID = T001911_A702TBW06_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
         A703TBW06_INS_NO = T001911_A703TBW06_INS_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1944( )
   {
      pr_default.readNext(9);
      RcdFound44 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound44 = (short)(1) ;
         A698TBW06_SESSION_ID = T001911_A698TBW06_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A698TBW06_SESSION_ID", A698TBW06_SESSION_ID);
         A699TBW06_APP_ID = T001911_A699TBW06_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A699TBW06_APP_ID", A699TBW06_APP_ID);
         A700TBW06_DISP_DATETIME = T001911_A700TBW06_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A700TBW06_DISP_DATETIME", A700TBW06_DISP_DATETIME);
         A701TBW06_STUDY_ID = T001911_A701TBW06_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
         A702TBW06_SUBJECT_ID = T001911_A702TBW06_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
         A703TBW06_INS_NO = T001911_A703TBW06_INS_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
      }
   }

   public void scanEnd1944( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1944( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1944( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1944( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1944( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1944( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1944( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1944( )
   {
      edtTBW06_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_SESSION_ID_Enabled, 5, 0)));
      edtTBW06_APP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_APP_ID_Enabled, 5, 0)));
      edtTBW06_DISP_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_DISP_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_DISP_DATETIME_Enabled, 5, 0)));
      edtTBW06_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_STUDY_ID_Enabled, 5, 0)));
      edtTBW06_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_SUBJECT_ID_Enabled, 5, 0)));
      edtTBW06_INS_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_INS_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_INS_NO_Enabled, 5, 0)));
      edtTBW06_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_CRF_ID_Enabled, 5, 0)));
      edtTBW06_CRF_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_CRF_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_CRF_VERSION_Enabled, 5, 0)));
      edtTBW06_MEMO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_MEMO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_MEMO_Enabled, 5, 0)));
      edtTBW06_STYDY_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_STYDY_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_STYDY_AUTH_CD_Enabled, 5, 0)));
      edtTBW06_REQUEST_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_REQUEST_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_REQUEST_USER_ID_Enabled, 5, 0)));
      edtTBW06_EDIT_REQUEST_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_EDIT_REQUEST_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_EDIT_REQUEST_FLG_Enabled, 5, 0)));
      edtTBW06_EDIT_REQUEST_END_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_EDIT_REQUEST_END_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_EDIT_REQUEST_END_FLG_Enabled, 5, 0)));
      edtTBW06_EDIT_REQ_END_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_EDIT_REQ_END_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_EDIT_REQ_END_DATETIME_Enabled, 5, 0)));
      edtTBW06_EDIT_REQUEST_END_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_EDIT_REQUEST_END_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_EDIT_REQUEST_END_USER_ID_Enabled, 5, 0)));
      edtTBW06_PROC_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW06_PROC_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW06_PROC_DIV_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues190( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRFメモテーブル") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbw06_crf_memo") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1944( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z698TBW06_SESSION_ID", GXutil.rtrim( Z698TBW06_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z699TBW06_APP_ID", GXutil.rtrim( Z699TBW06_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z700TBW06_DISP_DATETIME", GXutil.rtrim( Z700TBW06_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "Z701TBW06_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z701TBW06_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z702TBW06_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z702TBW06_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z703TBW06_INS_NO", GXutil.ltrim( localUtil.ntoc( Z703TBW06_INS_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z704TBW06_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z704TBW06_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z705TBW06_CRF_VERSION", GXutil.ltrim( localUtil.ntoc( Z705TBW06_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z706TBW06_MEMO", GXutil.rtrim( Z706TBW06_MEMO));
      GxWebStd.gx_hidden_field( httpContext, "Z707TBW06_STYDY_AUTH_CD", GXutil.rtrim( Z707TBW06_STYDY_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z708TBW06_REQUEST_USER_ID", GXutil.rtrim( Z708TBW06_REQUEST_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z709TBW06_EDIT_REQUEST_FLG", GXutil.rtrim( Z709TBW06_EDIT_REQUEST_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z710TBW06_EDIT_REQUEST_END_FLG", GXutil.rtrim( Z710TBW06_EDIT_REQUEST_END_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z711TBW06_EDIT_REQ_END_DATETIME", localUtil.ttoc( Z711TBW06_EDIT_REQ_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z712TBW06_EDIT_REQUEST_END_USER_ID", GXutil.rtrim( Z712TBW06_EDIT_REQUEST_END_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z713TBW06_PROC_DIV", GXutil.rtrim( Z713TBW06_PROC_DIV));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV8Pgmname));
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

   public void initializeNonKey1944( )
   {
      A704TBW06_CRF_ID = (short)(0) ;
      n704TBW06_CRF_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A704TBW06_CRF_ID", GXutil.ltrim( GXutil.str( A704TBW06_CRF_ID, 4, 0)));
      n704TBW06_CRF_ID = ((0==A704TBW06_CRF_ID) ? true : false) ;
      A705TBW06_CRF_VERSION = (short)(0) ;
      n705TBW06_CRF_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A705TBW06_CRF_VERSION", GXutil.ltrim( GXutil.str( A705TBW06_CRF_VERSION, 4, 0)));
      n705TBW06_CRF_VERSION = ((0==A705TBW06_CRF_VERSION) ? true : false) ;
      A706TBW06_MEMO = "" ;
      n706TBW06_MEMO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A706TBW06_MEMO", A706TBW06_MEMO);
      n706TBW06_MEMO = ((GXutil.strcmp("", A706TBW06_MEMO)==0) ? true : false) ;
      A707TBW06_STYDY_AUTH_CD = "" ;
      n707TBW06_STYDY_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A707TBW06_STYDY_AUTH_CD", A707TBW06_STYDY_AUTH_CD);
      n707TBW06_STYDY_AUTH_CD = ((GXutil.strcmp("", A707TBW06_STYDY_AUTH_CD)==0) ? true : false) ;
      A708TBW06_REQUEST_USER_ID = "" ;
      n708TBW06_REQUEST_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A708TBW06_REQUEST_USER_ID", A708TBW06_REQUEST_USER_ID);
      n708TBW06_REQUEST_USER_ID = ((GXutil.strcmp("", A708TBW06_REQUEST_USER_ID)==0) ? true : false) ;
      A709TBW06_EDIT_REQUEST_FLG = "" ;
      n709TBW06_EDIT_REQUEST_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A709TBW06_EDIT_REQUEST_FLG", A709TBW06_EDIT_REQUEST_FLG);
      n709TBW06_EDIT_REQUEST_FLG = ((GXutil.strcmp("", A709TBW06_EDIT_REQUEST_FLG)==0) ? true : false) ;
      A710TBW06_EDIT_REQUEST_END_FLG = "" ;
      n710TBW06_EDIT_REQUEST_END_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A710TBW06_EDIT_REQUEST_END_FLG", A710TBW06_EDIT_REQUEST_END_FLG);
      n710TBW06_EDIT_REQUEST_END_FLG = ((GXutil.strcmp("", A710TBW06_EDIT_REQUEST_END_FLG)==0) ? true : false) ;
      A711TBW06_EDIT_REQ_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n711TBW06_EDIT_REQ_END_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A711TBW06_EDIT_REQ_END_DATETIME", localUtil.ttoc( A711TBW06_EDIT_REQ_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n711TBW06_EDIT_REQ_END_DATETIME = (GXutil.nullDate().equals(A711TBW06_EDIT_REQ_END_DATETIME) ? true : false) ;
      A712TBW06_EDIT_REQUEST_END_USER_ID = "" ;
      n712TBW06_EDIT_REQUEST_END_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A712TBW06_EDIT_REQUEST_END_USER_ID", A712TBW06_EDIT_REQUEST_END_USER_ID);
      n712TBW06_EDIT_REQUEST_END_USER_ID = ((GXutil.strcmp("", A712TBW06_EDIT_REQUEST_END_USER_ID)==0) ? true : false) ;
      A713TBW06_PROC_DIV = "" ;
      n713TBW06_PROC_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A713TBW06_PROC_DIV", A713TBW06_PROC_DIV);
      n713TBW06_PROC_DIV = ((GXutil.strcmp("", A713TBW06_PROC_DIV)==0) ? true : false) ;
   }

   public void initAll1944( )
   {
      A698TBW06_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A698TBW06_SESSION_ID", A698TBW06_SESSION_ID);
      A699TBW06_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A699TBW06_APP_ID", A699TBW06_APP_ID);
      A700TBW06_DISP_DATETIME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A700TBW06_DISP_DATETIME", A700TBW06_DISP_DATETIME);
      A701TBW06_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A701TBW06_STUDY_ID", GXutil.ltrim( GXutil.str( A701TBW06_STUDY_ID, 10, 0)));
      A702TBW06_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A702TBW06_SUBJECT_ID", GXutil.ltrim( GXutil.str( A702TBW06_SUBJECT_ID, 6, 0)));
      A703TBW06_INS_NO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A703TBW06_INS_NO", GXutil.ltrim( GXutil.str( A703TBW06_INS_NO, 3, 0)));
      initializeNonKey1944( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1457943");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbw06_crf_memo.js", "?1457943");
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
      lblTextblocktbw06_session_id_Internalname = "TEXTBLOCKTBW06_SESSION_ID" ;
      edtTBW06_SESSION_ID_Internalname = "TBW06_SESSION_ID" ;
      lblTextblocktbw06_app_id_Internalname = "TEXTBLOCKTBW06_APP_ID" ;
      edtTBW06_APP_ID_Internalname = "TBW06_APP_ID" ;
      lblTextblocktbw06_disp_datetime_Internalname = "TEXTBLOCKTBW06_DISP_DATETIME" ;
      edtTBW06_DISP_DATETIME_Internalname = "TBW06_DISP_DATETIME" ;
      lblTextblocktbw06_study_id_Internalname = "TEXTBLOCKTBW06_STUDY_ID" ;
      edtTBW06_STUDY_ID_Internalname = "TBW06_STUDY_ID" ;
      lblTextblocktbw06_subject_id_Internalname = "TEXTBLOCKTBW06_SUBJECT_ID" ;
      edtTBW06_SUBJECT_ID_Internalname = "TBW06_SUBJECT_ID" ;
      lblTextblocktbw06_ins_no_Internalname = "TEXTBLOCKTBW06_INS_NO" ;
      edtTBW06_INS_NO_Internalname = "TBW06_INS_NO" ;
      lblTextblocktbw06_crf_id_Internalname = "TEXTBLOCKTBW06_CRF_ID" ;
      edtTBW06_CRF_ID_Internalname = "TBW06_CRF_ID" ;
      lblTextblocktbw06_crf_version_Internalname = "TEXTBLOCKTBW06_CRF_VERSION" ;
      edtTBW06_CRF_VERSION_Internalname = "TBW06_CRF_VERSION" ;
      lblTextblocktbw06_memo_Internalname = "TEXTBLOCKTBW06_MEMO" ;
      edtTBW06_MEMO_Internalname = "TBW06_MEMO" ;
      lblTextblocktbw06_stydy_auth_cd_Internalname = "TEXTBLOCKTBW06_STYDY_AUTH_CD" ;
      edtTBW06_STYDY_AUTH_CD_Internalname = "TBW06_STYDY_AUTH_CD" ;
      lblTextblocktbw06_request_user_id_Internalname = "TEXTBLOCKTBW06_REQUEST_USER_ID" ;
      edtTBW06_REQUEST_USER_ID_Internalname = "TBW06_REQUEST_USER_ID" ;
      lblTextblocktbw06_edit_request_flg_Internalname = "TEXTBLOCKTBW06_EDIT_REQUEST_FLG" ;
      edtTBW06_EDIT_REQUEST_FLG_Internalname = "TBW06_EDIT_REQUEST_FLG" ;
      lblTextblocktbw06_edit_request_end_flg_Internalname = "TEXTBLOCKTBW06_EDIT_REQUEST_END_FLG" ;
      edtTBW06_EDIT_REQUEST_END_FLG_Internalname = "TBW06_EDIT_REQUEST_END_FLG" ;
      lblTextblocktbw06_edit_req_end_datetime_Internalname = "TEXTBLOCKTBW06_EDIT_REQ_END_DATETIME" ;
      edtTBW06_EDIT_REQ_END_DATETIME_Internalname = "TBW06_EDIT_REQ_END_DATETIME" ;
      lblTextblocktbw06_edit_request_end_user_id_Internalname = "TEXTBLOCKTBW06_EDIT_REQUEST_END_USER_ID" ;
      edtTBW06_EDIT_REQUEST_END_USER_ID_Internalname = "TBW06_EDIT_REQUEST_END_USER_ID" ;
      lblTextblocktbw06_proc_div_Internalname = "TEXTBLOCKTBW06_PROC_DIV" ;
      edtTBW06_PROC_DIV_Internalname = "TBW06_PROC_DIV" ;
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
      edtTBW06_PROC_DIV_Jsonclick = "" ;
      edtTBW06_PROC_DIV_Enabled = 1 ;
      edtTBW06_EDIT_REQUEST_END_USER_ID_Jsonclick = "" ;
      edtTBW06_EDIT_REQUEST_END_USER_ID_Enabled = 1 ;
      edtTBW06_EDIT_REQ_END_DATETIME_Jsonclick = "" ;
      edtTBW06_EDIT_REQ_END_DATETIME_Enabled = 1 ;
      edtTBW06_EDIT_REQUEST_END_FLG_Jsonclick = "" ;
      edtTBW06_EDIT_REQUEST_END_FLG_Enabled = 1 ;
      edtTBW06_EDIT_REQUEST_FLG_Jsonclick = "" ;
      edtTBW06_EDIT_REQUEST_FLG_Enabled = 1 ;
      edtTBW06_REQUEST_USER_ID_Jsonclick = "" ;
      edtTBW06_REQUEST_USER_ID_Enabled = 1 ;
      edtTBW06_STYDY_AUTH_CD_Jsonclick = "" ;
      edtTBW06_STYDY_AUTH_CD_Enabled = 1 ;
      edtTBW06_MEMO_Enabled = 1 ;
      edtTBW06_CRF_VERSION_Jsonclick = "" ;
      edtTBW06_CRF_VERSION_Enabled = 1 ;
      edtTBW06_CRF_ID_Jsonclick = "" ;
      edtTBW06_CRF_ID_Enabled = 1 ;
      edtTBW06_INS_NO_Jsonclick = "" ;
      edtTBW06_INS_NO_Enabled = 1 ;
      edtTBW06_SUBJECT_ID_Jsonclick = "" ;
      edtTBW06_SUBJECT_ID_Enabled = 1 ;
      edtTBW06_STUDY_ID_Jsonclick = "" ;
      edtTBW06_STUDY_ID_Enabled = 1 ;
      edtTBW06_DISP_DATETIME_Jsonclick = "" ;
      edtTBW06_DISP_DATETIME_Enabled = 1 ;
      edtTBW06_APP_ID_Jsonclick = "" ;
      edtTBW06_APP_ID_Enabled = 1 ;
      edtTBW06_SESSION_ID_Jsonclick = "" ;
      edtTBW06_SESSION_ID_Enabled = 1 ;
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
      getEqualNoModal( ) ;
      GX_FocusControl = edtTBW06_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw06_ins_no( String GX_Parm1 ,
                                   String GX_Parm2 ,
                                   String GX_Parm3 ,
                                   long GX_Parm4 ,
                                   int GX_Parm5 ,
                                   short GX_Parm6 ,
                                   short GX_Parm7 ,
                                   short GX_Parm8 ,
                                   String GX_Parm9 ,
                                   String GX_Parm10 ,
                                   String GX_Parm11 ,
                                   String GX_Parm12 ,
                                   String GX_Parm13 ,
                                   java.util.Date GX_Parm14 ,
                                   String GX_Parm15 ,
                                   String GX_Parm16 )
   {
      A698TBW06_SESSION_ID = GX_Parm1 ;
      A699TBW06_APP_ID = GX_Parm2 ;
      A700TBW06_DISP_DATETIME = GX_Parm3 ;
      A701TBW06_STUDY_ID = GX_Parm4 ;
      A702TBW06_SUBJECT_ID = GX_Parm5 ;
      A703TBW06_INS_NO = GX_Parm6 ;
      A704TBW06_CRF_ID = GX_Parm7 ;
      n704TBW06_CRF_ID = false ;
      A705TBW06_CRF_VERSION = GX_Parm8 ;
      n705TBW06_CRF_VERSION = false ;
      A706TBW06_MEMO = GX_Parm9 ;
      n706TBW06_MEMO = false ;
      A707TBW06_STYDY_AUTH_CD = GX_Parm10 ;
      n707TBW06_STYDY_AUTH_CD = false ;
      A708TBW06_REQUEST_USER_ID = GX_Parm11 ;
      n708TBW06_REQUEST_USER_ID = false ;
      A709TBW06_EDIT_REQUEST_FLG = GX_Parm12 ;
      n709TBW06_EDIT_REQUEST_FLG = false ;
      A710TBW06_EDIT_REQUEST_END_FLG = GX_Parm13 ;
      n710TBW06_EDIT_REQUEST_END_FLG = false ;
      A711TBW06_EDIT_REQ_END_DATETIME = GX_Parm14 ;
      n711TBW06_EDIT_REQ_END_DATETIME = false ;
      A712TBW06_EDIT_REQUEST_END_USER_ID = GX_Parm15 ;
      n712TBW06_EDIT_REQUEST_END_USER_ID = false ;
      A713TBW06_PROC_DIV = GX_Parm16 ;
      n713TBW06_PROC_DIV = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A704TBW06_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A705TBW06_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A706TBW06_MEMO));
      isValidOutput.add(GXutil.rtrim( A707TBW06_STYDY_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A708TBW06_REQUEST_USER_ID));
      isValidOutput.add(GXutil.rtrim( A709TBW06_EDIT_REQUEST_FLG));
      isValidOutput.add(GXutil.rtrim( A710TBW06_EDIT_REQUEST_END_FLG));
      isValidOutput.add(localUtil.format(A711TBW06_EDIT_REQ_END_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A712TBW06_EDIT_REQUEST_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( A713TBW06_PROC_DIV));
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z698TBW06_SESSION_ID));
      isValidOutput.add(GXutil.rtrim( Z699TBW06_APP_ID));
      isValidOutput.add(GXutil.rtrim( Z700TBW06_DISP_DATETIME));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z701TBW06_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z702TBW06_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z703TBW06_INS_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z704TBW06_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z705TBW06_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z706TBW06_MEMO));
      isValidOutput.add(GXutil.rtrim( Z707TBW06_STYDY_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z708TBW06_REQUEST_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z709TBW06_EDIT_REQUEST_FLG));
      isValidOutput.add(GXutil.rtrim( Z710TBW06_EDIT_REQUEST_END_FLG));
      isValidOutput.add(localUtil.ttoc( Z711TBW06_EDIT_REQ_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z712TBW06_EDIT_REQUEST_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z713TBW06_PROC_DIV));
      isValidOutput.add(GXutil.rtrim( ZV8Pgmname));
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
                  /* Execute user subroutine: S1132 */
                  S1132 ();
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
      lblTextblocktbw06_session_id_Jsonclick = "" ;
      A698TBW06_SESSION_ID = "" ;
      lblTextblocktbw06_app_id_Jsonclick = "" ;
      A699TBW06_APP_ID = "" ;
      lblTextblocktbw06_disp_datetime_Jsonclick = "" ;
      A700TBW06_DISP_DATETIME = "" ;
      lblTextblocktbw06_study_id_Jsonclick = "" ;
      lblTextblocktbw06_subject_id_Jsonclick = "" ;
      lblTextblocktbw06_ins_no_Jsonclick = "" ;
      lblTextblocktbw06_crf_id_Jsonclick = "" ;
      lblTextblocktbw06_crf_version_Jsonclick = "" ;
      lblTextblocktbw06_memo_Jsonclick = "" ;
      A706TBW06_MEMO = "" ;
      lblTextblocktbw06_stydy_auth_cd_Jsonclick = "" ;
      A707TBW06_STYDY_AUTH_CD = "" ;
      lblTextblocktbw06_request_user_id_Jsonclick = "" ;
      A708TBW06_REQUEST_USER_ID = "" ;
      lblTextblocktbw06_edit_request_flg_Jsonclick = "" ;
      A709TBW06_EDIT_REQUEST_FLG = "" ;
      lblTextblocktbw06_edit_request_end_flg_Jsonclick = "" ;
      A710TBW06_EDIT_REQUEST_END_FLG = "" ;
      lblTextblocktbw06_edit_req_end_datetime_Jsonclick = "" ;
      A711TBW06_EDIT_REQ_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw06_edit_request_end_user_id_Jsonclick = "" ;
      A712TBW06_EDIT_REQUEST_END_USER_ID = "" ;
      lblTextblocktbw06_proc_div_Jsonclick = "" ;
      A713TBW06_PROC_DIV = "" ;
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
      Z698TBW06_SESSION_ID = "" ;
      Z699TBW06_APP_ID = "" ;
      Z700TBW06_DISP_DATETIME = "" ;
      Z706TBW06_MEMO = "" ;
      Z707TBW06_STYDY_AUTH_CD = "" ;
      Z708TBW06_REQUEST_USER_ID = "" ;
      Z709TBW06_EDIT_REQUEST_FLG = "" ;
      Z710TBW06_EDIT_REQUEST_END_FLG = "" ;
      Z711TBW06_EDIT_REQ_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z712TBW06_EDIT_REQUEST_END_USER_ID = "" ;
      Z713TBW06_PROC_DIV = "" ;
      Gx_mode = "" ;
      AV8Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T00194_A698TBW06_SESSION_ID = new String[] {""} ;
      T00194_A699TBW06_APP_ID = new String[] {""} ;
      T00194_A700TBW06_DISP_DATETIME = new String[] {""} ;
      T00194_A701TBW06_STUDY_ID = new long[1] ;
      T00194_A702TBW06_SUBJECT_ID = new int[1] ;
      T00194_A703TBW06_INS_NO = new short[1] ;
      T00194_A704TBW06_CRF_ID = new short[1] ;
      T00194_n704TBW06_CRF_ID = new boolean[] {false} ;
      T00194_A705TBW06_CRF_VERSION = new short[1] ;
      T00194_n705TBW06_CRF_VERSION = new boolean[] {false} ;
      T00194_A706TBW06_MEMO = new String[] {""} ;
      T00194_n706TBW06_MEMO = new boolean[] {false} ;
      T00194_A707TBW06_STYDY_AUTH_CD = new String[] {""} ;
      T00194_n707TBW06_STYDY_AUTH_CD = new boolean[] {false} ;
      T00194_A708TBW06_REQUEST_USER_ID = new String[] {""} ;
      T00194_n708TBW06_REQUEST_USER_ID = new boolean[] {false} ;
      T00194_A709TBW06_EDIT_REQUEST_FLG = new String[] {""} ;
      T00194_n709TBW06_EDIT_REQUEST_FLG = new boolean[] {false} ;
      T00194_A710TBW06_EDIT_REQUEST_END_FLG = new String[] {""} ;
      T00194_n710TBW06_EDIT_REQUEST_END_FLG = new boolean[] {false} ;
      T00194_A711TBW06_EDIT_REQ_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00194_n711TBW06_EDIT_REQ_END_DATETIME = new boolean[] {false} ;
      T00194_A712TBW06_EDIT_REQUEST_END_USER_ID = new String[] {""} ;
      T00194_n712TBW06_EDIT_REQUEST_END_USER_ID = new boolean[] {false} ;
      T00194_A713TBW06_PROC_DIV = new String[] {""} ;
      T00194_n713TBW06_PROC_DIV = new boolean[] {false} ;
      T00195_A698TBW06_SESSION_ID = new String[] {""} ;
      T00195_A699TBW06_APP_ID = new String[] {""} ;
      T00195_A700TBW06_DISP_DATETIME = new String[] {""} ;
      T00195_A701TBW06_STUDY_ID = new long[1] ;
      T00195_A702TBW06_SUBJECT_ID = new int[1] ;
      T00195_A703TBW06_INS_NO = new short[1] ;
      T00193_A698TBW06_SESSION_ID = new String[] {""} ;
      T00193_A699TBW06_APP_ID = new String[] {""} ;
      T00193_A700TBW06_DISP_DATETIME = new String[] {""} ;
      T00193_A701TBW06_STUDY_ID = new long[1] ;
      T00193_A702TBW06_SUBJECT_ID = new int[1] ;
      T00193_A703TBW06_INS_NO = new short[1] ;
      T00193_A704TBW06_CRF_ID = new short[1] ;
      T00193_n704TBW06_CRF_ID = new boolean[] {false} ;
      T00193_A705TBW06_CRF_VERSION = new short[1] ;
      T00193_n705TBW06_CRF_VERSION = new boolean[] {false} ;
      T00193_A706TBW06_MEMO = new String[] {""} ;
      T00193_n706TBW06_MEMO = new boolean[] {false} ;
      T00193_A707TBW06_STYDY_AUTH_CD = new String[] {""} ;
      T00193_n707TBW06_STYDY_AUTH_CD = new boolean[] {false} ;
      T00193_A708TBW06_REQUEST_USER_ID = new String[] {""} ;
      T00193_n708TBW06_REQUEST_USER_ID = new boolean[] {false} ;
      T00193_A709TBW06_EDIT_REQUEST_FLG = new String[] {""} ;
      T00193_n709TBW06_EDIT_REQUEST_FLG = new boolean[] {false} ;
      T00193_A710TBW06_EDIT_REQUEST_END_FLG = new String[] {""} ;
      T00193_n710TBW06_EDIT_REQUEST_END_FLG = new boolean[] {false} ;
      T00193_A711TBW06_EDIT_REQ_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00193_n711TBW06_EDIT_REQ_END_DATETIME = new boolean[] {false} ;
      T00193_A712TBW06_EDIT_REQUEST_END_USER_ID = new String[] {""} ;
      T00193_n712TBW06_EDIT_REQUEST_END_USER_ID = new boolean[] {false} ;
      T00193_A713TBW06_PROC_DIV = new String[] {""} ;
      T00193_n713TBW06_PROC_DIV = new boolean[] {false} ;
      sMode44 = "" ;
      T00196_A698TBW06_SESSION_ID = new String[] {""} ;
      T00196_A699TBW06_APP_ID = new String[] {""} ;
      T00196_A700TBW06_DISP_DATETIME = new String[] {""} ;
      T00196_A701TBW06_STUDY_ID = new long[1] ;
      T00196_A702TBW06_SUBJECT_ID = new int[1] ;
      T00196_A703TBW06_INS_NO = new short[1] ;
      T00197_A698TBW06_SESSION_ID = new String[] {""} ;
      T00197_A699TBW06_APP_ID = new String[] {""} ;
      T00197_A700TBW06_DISP_DATETIME = new String[] {""} ;
      T00197_A701TBW06_STUDY_ID = new long[1] ;
      T00197_A702TBW06_SUBJECT_ID = new int[1] ;
      T00197_A703TBW06_INS_NO = new short[1] ;
      T00192_A698TBW06_SESSION_ID = new String[] {""} ;
      T00192_A699TBW06_APP_ID = new String[] {""} ;
      T00192_A700TBW06_DISP_DATETIME = new String[] {""} ;
      T00192_A701TBW06_STUDY_ID = new long[1] ;
      T00192_A702TBW06_SUBJECT_ID = new int[1] ;
      T00192_A703TBW06_INS_NO = new short[1] ;
      T00192_A704TBW06_CRF_ID = new short[1] ;
      T00192_n704TBW06_CRF_ID = new boolean[] {false} ;
      T00192_A705TBW06_CRF_VERSION = new short[1] ;
      T00192_n705TBW06_CRF_VERSION = new boolean[] {false} ;
      T00192_A706TBW06_MEMO = new String[] {""} ;
      T00192_n706TBW06_MEMO = new boolean[] {false} ;
      T00192_A707TBW06_STYDY_AUTH_CD = new String[] {""} ;
      T00192_n707TBW06_STYDY_AUTH_CD = new boolean[] {false} ;
      T00192_A708TBW06_REQUEST_USER_ID = new String[] {""} ;
      T00192_n708TBW06_REQUEST_USER_ID = new boolean[] {false} ;
      T00192_A709TBW06_EDIT_REQUEST_FLG = new String[] {""} ;
      T00192_n709TBW06_EDIT_REQUEST_FLG = new boolean[] {false} ;
      T00192_A710TBW06_EDIT_REQUEST_END_FLG = new String[] {""} ;
      T00192_n710TBW06_EDIT_REQUEST_END_FLG = new boolean[] {false} ;
      T00192_A711TBW06_EDIT_REQ_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00192_n711TBW06_EDIT_REQ_END_DATETIME = new boolean[] {false} ;
      T00192_A712TBW06_EDIT_REQUEST_END_USER_ID = new String[] {""} ;
      T00192_n712TBW06_EDIT_REQUEST_END_USER_ID = new boolean[] {false} ;
      T00192_A713TBW06_PROC_DIV = new String[] {""} ;
      T00192_n713TBW06_PROC_DIV = new boolean[] {false} ;
      T001911_A698TBW06_SESSION_ID = new String[] {""} ;
      T001911_A699TBW06_APP_ID = new String[] {""} ;
      T001911_A700TBW06_DISP_DATETIME = new String[] {""} ;
      T001911_A701TBW06_STUDY_ID = new long[1] ;
      T001911_A702TBW06_SUBJECT_ID = new int[1] ;
      T001911_A703TBW06_INS_NO = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char3 = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw06_crf_memo__default(),
         new Object[] {
             new Object[] {
            T00192_A698TBW06_SESSION_ID, T00192_A699TBW06_APP_ID, T00192_A700TBW06_DISP_DATETIME, T00192_A701TBW06_STUDY_ID, T00192_A702TBW06_SUBJECT_ID, T00192_A703TBW06_INS_NO, T00192_A704TBW06_CRF_ID, T00192_n704TBW06_CRF_ID, T00192_A705TBW06_CRF_VERSION, T00192_n705TBW06_CRF_VERSION,
            T00192_A706TBW06_MEMO, T00192_n706TBW06_MEMO, T00192_A707TBW06_STYDY_AUTH_CD, T00192_n707TBW06_STYDY_AUTH_CD, T00192_A708TBW06_REQUEST_USER_ID, T00192_n708TBW06_REQUEST_USER_ID, T00192_A709TBW06_EDIT_REQUEST_FLG, T00192_n709TBW06_EDIT_REQUEST_FLG, T00192_A710TBW06_EDIT_REQUEST_END_FLG, T00192_n710TBW06_EDIT_REQUEST_END_FLG,
            T00192_A711TBW06_EDIT_REQ_END_DATETIME, T00192_n711TBW06_EDIT_REQ_END_DATETIME, T00192_A712TBW06_EDIT_REQUEST_END_USER_ID, T00192_n712TBW06_EDIT_REQUEST_END_USER_ID, T00192_A713TBW06_PROC_DIV, T00192_n713TBW06_PROC_DIV
            }
            , new Object[] {
            T00193_A698TBW06_SESSION_ID, T00193_A699TBW06_APP_ID, T00193_A700TBW06_DISP_DATETIME, T00193_A701TBW06_STUDY_ID, T00193_A702TBW06_SUBJECT_ID, T00193_A703TBW06_INS_NO, T00193_A704TBW06_CRF_ID, T00193_n704TBW06_CRF_ID, T00193_A705TBW06_CRF_VERSION, T00193_n705TBW06_CRF_VERSION,
            T00193_A706TBW06_MEMO, T00193_n706TBW06_MEMO, T00193_A707TBW06_STYDY_AUTH_CD, T00193_n707TBW06_STYDY_AUTH_CD, T00193_A708TBW06_REQUEST_USER_ID, T00193_n708TBW06_REQUEST_USER_ID, T00193_A709TBW06_EDIT_REQUEST_FLG, T00193_n709TBW06_EDIT_REQUEST_FLG, T00193_A710TBW06_EDIT_REQUEST_END_FLG, T00193_n710TBW06_EDIT_REQUEST_END_FLG,
            T00193_A711TBW06_EDIT_REQ_END_DATETIME, T00193_n711TBW06_EDIT_REQ_END_DATETIME, T00193_A712TBW06_EDIT_REQUEST_END_USER_ID, T00193_n712TBW06_EDIT_REQUEST_END_USER_ID, T00193_A713TBW06_PROC_DIV, T00193_n713TBW06_PROC_DIV
            }
            , new Object[] {
            T00194_A698TBW06_SESSION_ID, T00194_A699TBW06_APP_ID, T00194_A700TBW06_DISP_DATETIME, T00194_A701TBW06_STUDY_ID, T00194_A702TBW06_SUBJECT_ID, T00194_A703TBW06_INS_NO, T00194_A704TBW06_CRF_ID, T00194_n704TBW06_CRF_ID, T00194_A705TBW06_CRF_VERSION, T00194_n705TBW06_CRF_VERSION,
            T00194_A706TBW06_MEMO, T00194_n706TBW06_MEMO, T00194_A707TBW06_STYDY_AUTH_CD, T00194_n707TBW06_STYDY_AUTH_CD, T00194_A708TBW06_REQUEST_USER_ID, T00194_n708TBW06_REQUEST_USER_ID, T00194_A709TBW06_EDIT_REQUEST_FLG, T00194_n709TBW06_EDIT_REQUEST_FLG, T00194_A710TBW06_EDIT_REQUEST_END_FLG, T00194_n710TBW06_EDIT_REQUEST_END_FLG,
            T00194_A711TBW06_EDIT_REQ_END_DATETIME, T00194_n711TBW06_EDIT_REQ_END_DATETIME, T00194_A712TBW06_EDIT_REQUEST_END_USER_ID, T00194_n712TBW06_EDIT_REQUEST_END_USER_ID, T00194_A713TBW06_PROC_DIV, T00194_n713TBW06_PROC_DIV
            }
            , new Object[] {
            T00195_A698TBW06_SESSION_ID, T00195_A699TBW06_APP_ID, T00195_A700TBW06_DISP_DATETIME, T00195_A701TBW06_STUDY_ID, T00195_A702TBW06_SUBJECT_ID, T00195_A703TBW06_INS_NO
            }
            , new Object[] {
            T00196_A698TBW06_SESSION_ID, T00196_A699TBW06_APP_ID, T00196_A700TBW06_DISP_DATETIME, T00196_A701TBW06_STUDY_ID, T00196_A702TBW06_SUBJECT_ID, T00196_A703TBW06_INS_NO
            }
            , new Object[] {
            T00197_A698TBW06_SESSION_ID, T00197_A699TBW06_APP_ID, T00197_A700TBW06_DISP_DATETIME, T00197_A701TBW06_STUDY_ID, T00197_A702TBW06_SUBJECT_ID, T00197_A703TBW06_INS_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001911_A698TBW06_SESSION_ID, T001911_A699TBW06_APP_ID, T001911_A700TBW06_DISP_DATETIME, T001911_A701TBW06_STUDY_ID, T001911_A702TBW06_SUBJECT_ID, T001911_A703TBW06_INS_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW06_CRF_MEMO" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A703TBW06_INS_NO ;
   private short A704TBW06_CRF_ID ;
   private short A705TBW06_CRF_VERSION ;
   private short Z703TBW06_INS_NO ;
   private short Z704TBW06_CRF_ID ;
   private short Z705TBW06_CRF_VERSION ;
   private short RcdFound44 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW06_SESSION_ID_Enabled ;
   private int edtTBW06_APP_ID_Enabled ;
   private int edtTBW06_DISP_DATETIME_Enabled ;
   private int edtTBW06_STUDY_ID_Enabled ;
   private int A702TBW06_SUBJECT_ID ;
   private int edtTBW06_SUBJECT_ID_Enabled ;
   private int edtTBW06_INS_NO_Enabled ;
   private int edtTBW06_CRF_ID_Enabled ;
   private int edtTBW06_CRF_VERSION_Enabled ;
   private int edtTBW06_MEMO_Enabled ;
   private int edtTBW06_STYDY_AUTH_CD_Enabled ;
   private int edtTBW06_REQUEST_USER_ID_Enabled ;
   private int edtTBW06_EDIT_REQUEST_FLG_Enabled ;
   private int edtTBW06_EDIT_REQUEST_END_FLG_Enabled ;
   private int edtTBW06_EDIT_REQ_END_DATETIME_Enabled ;
   private int edtTBW06_EDIT_REQUEST_END_USER_ID_Enabled ;
   private int edtTBW06_PROC_DIV_Enabled ;
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
   private int Z702TBW06_SUBJECT_ID ;
   private int GX_JID ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A701TBW06_STUDY_ID ;
   private long Z701TBW06_STUDY_ID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW06_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw06_session_id_Internalname ;
   private String lblTextblocktbw06_session_id_Jsonclick ;
   private String edtTBW06_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw06_app_id_Internalname ;
   private String lblTextblocktbw06_app_id_Jsonclick ;
   private String edtTBW06_APP_ID_Internalname ;
   private String edtTBW06_APP_ID_Jsonclick ;
   private String lblTextblocktbw06_disp_datetime_Internalname ;
   private String lblTextblocktbw06_disp_datetime_Jsonclick ;
   private String edtTBW06_DISP_DATETIME_Internalname ;
   private String edtTBW06_DISP_DATETIME_Jsonclick ;
   private String lblTextblocktbw06_study_id_Internalname ;
   private String lblTextblocktbw06_study_id_Jsonclick ;
   private String edtTBW06_STUDY_ID_Internalname ;
   private String edtTBW06_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw06_subject_id_Internalname ;
   private String lblTextblocktbw06_subject_id_Jsonclick ;
   private String edtTBW06_SUBJECT_ID_Internalname ;
   private String edtTBW06_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbw06_ins_no_Internalname ;
   private String lblTextblocktbw06_ins_no_Jsonclick ;
   private String edtTBW06_INS_NO_Internalname ;
   private String edtTBW06_INS_NO_Jsonclick ;
   private String lblTextblocktbw06_crf_id_Internalname ;
   private String lblTextblocktbw06_crf_id_Jsonclick ;
   private String edtTBW06_CRF_ID_Internalname ;
   private String edtTBW06_CRF_ID_Jsonclick ;
   private String lblTextblocktbw06_crf_version_Internalname ;
   private String lblTextblocktbw06_crf_version_Jsonclick ;
   private String edtTBW06_CRF_VERSION_Internalname ;
   private String edtTBW06_CRF_VERSION_Jsonclick ;
   private String lblTextblocktbw06_memo_Internalname ;
   private String lblTextblocktbw06_memo_Jsonclick ;
   private String edtTBW06_MEMO_Internalname ;
   private String lblTextblocktbw06_stydy_auth_cd_Internalname ;
   private String lblTextblocktbw06_stydy_auth_cd_Jsonclick ;
   private String edtTBW06_STYDY_AUTH_CD_Internalname ;
   private String edtTBW06_STYDY_AUTH_CD_Jsonclick ;
   private String lblTextblocktbw06_request_user_id_Internalname ;
   private String lblTextblocktbw06_request_user_id_Jsonclick ;
   private String edtTBW06_REQUEST_USER_ID_Internalname ;
   private String edtTBW06_REQUEST_USER_ID_Jsonclick ;
   private String lblTextblocktbw06_edit_request_flg_Internalname ;
   private String lblTextblocktbw06_edit_request_flg_Jsonclick ;
   private String edtTBW06_EDIT_REQUEST_FLG_Internalname ;
   private String edtTBW06_EDIT_REQUEST_FLG_Jsonclick ;
   private String lblTextblocktbw06_edit_request_end_flg_Internalname ;
   private String lblTextblocktbw06_edit_request_end_flg_Jsonclick ;
   private String edtTBW06_EDIT_REQUEST_END_FLG_Internalname ;
   private String edtTBW06_EDIT_REQUEST_END_FLG_Jsonclick ;
   private String lblTextblocktbw06_edit_req_end_datetime_Internalname ;
   private String lblTextblocktbw06_edit_req_end_datetime_Jsonclick ;
   private String edtTBW06_EDIT_REQ_END_DATETIME_Internalname ;
   private String edtTBW06_EDIT_REQ_END_DATETIME_Jsonclick ;
   private String lblTextblocktbw06_edit_request_end_user_id_Internalname ;
   private String lblTextblocktbw06_edit_request_end_user_id_Jsonclick ;
   private String edtTBW06_EDIT_REQUEST_END_USER_ID_Internalname ;
   private String edtTBW06_EDIT_REQUEST_END_USER_ID_Jsonclick ;
   private String lblTextblocktbw06_proc_div_Internalname ;
   private String lblTextblocktbw06_proc_div_Jsonclick ;
   private String edtTBW06_PROC_DIV_Internalname ;
   private String edtTBW06_PROC_DIV_Jsonclick ;
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
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode44 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char3 ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A711TBW06_EDIT_REQ_END_DATETIME ;
   private java.util.Date Z711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n704TBW06_CRF_ID ;
   private boolean n705TBW06_CRF_VERSION ;
   private boolean n706TBW06_MEMO ;
   private boolean n707TBW06_STYDY_AUTH_CD ;
   private boolean n708TBW06_REQUEST_USER_ID ;
   private boolean n709TBW06_EDIT_REQUEST_FLG ;
   private boolean n710TBW06_EDIT_REQUEST_END_FLG ;
   private boolean n711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean n712TBW06_EDIT_REQUEST_END_USER_ID ;
   private boolean n713TBW06_PROC_DIV ;
   private boolean Gx_longc ;
   private String A698TBW06_SESSION_ID ;
   private String A699TBW06_APP_ID ;
   private String A700TBW06_DISP_DATETIME ;
   private String A706TBW06_MEMO ;
   private String A707TBW06_STYDY_AUTH_CD ;
   private String A708TBW06_REQUEST_USER_ID ;
   private String A709TBW06_EDIT_REQUEST_FLG ;
   private String A710TBW06_EDIT_REQUEST_END_FLG ;
   private String A712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String A713TBW06_PROC_DIV ;
   private String Z698TBW06_SESSION_ID ;
   private String Z699TBW06_APP_ID ;
   private String Z700TBW06_DISP_DATETIME ;
   private String Z706TBW06_MEMO ;
   private String Z707TBW06_STYDY_AUTH_CD ;
   private String Z708TBW06_REQUEST_USER_ID ;
   private String Z709TBW06_EDIT_REQUEST_FLG ;
   private String Z710TBW06_EDIT_REQUEST_END_FLG ;
   private String Z712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String Z713TBW06_PROC_DIV ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T00194_A698TBW06_SESSION_ID ;
   private String[] T00194_A699TBW06_APP_ID ;
   private String[] T00194_A700TBW06_DISP_DATETIME ;
   private long[] T00194_A701TBW06_STUDY_ID ;
   private int[] T00194_A702TBW06_SUBJECT_ID ;
   private short[] T00194_A703TBW06_INS_NO ;
   private short[] T00194_A704TBW06_CRF_ID ;
   private boolean[] T00194_n704TBW06_CRF_ID ;
   private short[] T00194_A705TBW06_CRF_VERSION ;
   private boolean[] T00194_n705TBW06_CRF_VERSION ;
   private String[] T00194_A706TBW06_MEMO ;
   private boolean[] T00194_n706TBW06_MEMO ;
   private String[] T00194_A707TBW06_STYDY_AUTH_CD ;
   private boolean[] T00194_n707TBW06_STYDY_AUTH_CD ;
   private String[] T00194_A708TBW06_REQUEST_USER_ID ;
   private boolean[] T00194_n708TBW06_REQUEST_USER_ID ;
   private String[] T00194_A709TBW06_EDIT_REQUEST_FLG ;
   private boolean[] T00194_n709TBW06_EDIT_REQUEST_FLG ;
   private String[] T00194_A710TBW06_EDIT_REQUEST_END_FLG ;
   private boolean[] T00194_n710TBW06_EDIT_REQUEST_END_FLG ;
   private java.util.Date[] T00194_A711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean[] T00194_n711TBW06_EDIT_REQ_END_DATETIME ;
   private String[] T00194_A712TBW06_EDIT_REQUEST_END_USER_ID ;
   private boolean[] T00194_n712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String[] T00194_A713TBW06_PROC_DIV ;
   private boolean[] T00194_n713TBW06_PROC_DIV ;
   private String[] T00195_A698TBW06_SESSION_ID ;
   private String[] T00195_A699TBW06_APP_ID ;
   private String[] T00195_A700TBW06_DISP_DATETIME ;
   private long[] T00195_A701TBW06_STUDY_ID ;
   private int[] T00195_A702TBW06_SUBJECT_ID ;
   private short[] T00195_A703TBW06_INS_NO ;
   private String[] T00193_A698TBW06_SESSION_ID ;
   private String[] T00193_A699TBW06_APP_ID ;
   private String[] T00193_A700TBW06_DISP_DATETIME ;
   private long[] T00193_A701TBW06_STUDY_ID ;
   private int[] T00193_A702TBW06_SUBJECT_ID ;
   private short[] T00193_A703TBW06_INS_NO ;
   private short[] T00193_A704TBW06_CRF_ID ;
   private boolean[] T00193_n704TBW06_CRF_ID ;
   private short[] T00193_A705TBW06_CRF_VERSION ;
   private boolean[] T00193_n705TBW06_CRF_VERSION ;
   private String[] T00193_A706TBW06_MEMO ;
   private boolean[] T00193_n706TBW06_MEMO ;
   private String[] T00193_A707TBW06_STYDY_AUTH_CD ;
   private boolean[] T00193_n707TBW06_STYDY_AUTH_CD ;
   private String[] T00193_A708TBW06_REQUEST_USER_ID ;
   private boolean[] T00193_n708TBW06_REQUEST_USER_ID ;
   private String[] T00193_A709TBW06_EDIT_REQUEST_FLG ;
   private boolean[] T00193_n709TBW06_EDIT_REQUEST_FLG ;
   private String[] T00193_A710TBW06_EDIT_REQUEST_END_FLG ;
   private boolean[] T00193_n710TBW06_EDIT_REQUEST_END_FLG ;
   private java.util.Date[] T00193_A711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean[] T00193_n711TBW06_EDIT_REQ_END_DATETIME ;
   private String[] T00193_A712TBW06_EDIT_REQUEST_END_USER_ID ;
   private boolean[] T00193_n712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String[] T00193_A713TBW06_PROC_DIV ;
   private boolean[] T00193_n713TBW06_PROC_DIV ;
   private String[] T00196_A698TBW06_SESSION_ID ;
   private String[] T00196_A699TBW06_APP_ID ;
   private String[] T00196_A700TBW06_DISP_DATETIME ;
   private long[] T00196_A701TBW06_STUDY_ID ;
   private int[] T00196_A702TBW06_SUBJECT_ID ;
   private short[] T00196_A703TBW06_INS_NO ;
   private String[] T00197_A698TBW06_SESSION_ID ;
   private String[] T00197_A699TBW06_APP_ID ;
   private String[] T00197_A700TBW06_DISP_DATETIME ;
   private long[] T00197_A701TBW06_STUDY_ID ;
   private int[] T00197_A702TBW06_SUBJECT_ID ;
   private short[] T00197_A703TBW06_INS_NO ;
   private String[] T00192_A698TBW06_SESSION_ID ;
   private String[] T00192_A699TBW06_APP_ID ;
   private String[] T00192_A700TBW06_DISP_DATETIME ;
   private long[] T00192_A701TBW06_STUDY_ID ;
   private int[] T00192_A702TBW06_SUBJECT_ID ;
   private short[] T00192_A703TBW06_INS_NO ;
   private short[] T00192_A704TBW06_CRF_ID ;
   private boolean[] T00192_n704TBW06_CRF_ID ;
   private short[] T00192_A705TBW06_CRF_VERSION ;
   private boolean[] T00192_n705TBW06_CRF_VERSION ;
   private String[] T00192_A706TBW06_MEMO ;
   private boolean[] T00192_n706TBW06_MEMO ;
   private String[] T00192_A707TBW06_STYDY_AUTH_CD ;
   private boolean[] T00192_n707TBW06_STYDY_AUTH_CD ;
   private String[] T00192_A708TBW06_REQUEST_USER_ID ;
   private boolean[] T00192_n708TBW06_REQUEST_USER_ID ;
   private String[] T00192_A709TBW06_EDIT_REQUEST_FLG ;
   private boolean[] T00192_n709TBW06_EDIT_REQUEST_FLG ;
   private String[] T00192_A710TBW06_EDIT_REQUEST_END_FLG ;
   private boolean[] T00192_n710TBW06_EDIT_REQUEST_END_FLG ;
   private java.util.Date[] T00192_A711TBW06_EDIT_REQ_END_DATETIME ;
   private boolean[] T00192_n711TBW06_EDIT_REQ_END_DATETIME ;
   private String[] T00192_A712TBW06_EDIT_REQUEST_END_USER_ID ;
   private boolean[] T00192_n712TBW06_EDIT_REQUEST_END_USER_ID ;
   private String[] T00192_A713TBW06_PROC_DIV ;
   private boolean[] T00192_n713TBW06_PROC_DIV ;
   private String[] T001911_A698TBW06_SESSION_ID ;
   private String[] T001911_A699TBW06_APP_ID ;
   private String[] T001911_A700TBW06_DISP_DATETIME ;
   private long[] T001911_A701TBW06_STUDY_ID ;
   private int[] T001911_A702TBW06_SUBJECT_ID ;
   private short[] T001911_A703TBW06_INS_NO ;
}

final  class tbw06_crf_memo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00192", "SELECT `TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO`, `TBW06_CRF_ID`, `TBW06_CRF_VERSION`, `TBW06_MEMO`, `TBW06_STYDY_AUTH_CD`, `TBW06_REQUEST_USER_ID`, `TBW06_EDIT_REQUEST_FLG`, `TBW06_EDIT_REQUEST_END_FLG`, `TBW06_EDIT_REQ_END_DATETIME`, `TBW06_EDIT_REQUEST_END_USER_ID`, `TBW06_PROC_DIV` FROM `TBW06_CRF_MEMO` WHERE `TBW06_SESSION_ID` = ? AND `TBW06_APP_ID` = ? AND `TBW06_DISP_DATETIME` = ? AND `TBW06_STUDY_ID` = ? AND `TBW06_SUBJECT_ID` = ? AND `TBW06_INS_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00193", "SELECT `TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO`, `TBW06_CRF_ID`, `TBW06_CRF_VERSION`, `TBW06_MEMO`, `TBW06_STYDY_AUTH_CD`, `TBW06_REQUEST_USER_ID`, `TBW06_EDIT_REQUEST_FLG`, `TBW06_EDIT_REQUEST_END_FLG`, `TBW06_EDIT_REQ_END_DATETIME`, `TBW06_EDIT_REQUEST_END_USER_ID`, `TBW06_PROC_DIV` FROM `TBW06_CRF_MEMO` WHERE `TBW06_SESSION_ID` = ? AND `TBW06_APP_ID` = ? AND `TBW06_DISP_DATETIME` = ? AND `TBW06_STUDY_ID` = ? AND `TBW06_SUBJECT_ID` = ? AND `TBW06_INS_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00194", "SELECT TM1.`TBW06_SESSION_ID`, TM1.`TBW06_APP_ID`, TM1.`TBW06_DISP_DATETIME`, TM1.`TBW06_STUDY_ID`, TM1.`TBW06_SUBJECT_ID`, TM1.`TBW06_INS_NO`, TM1.`TBW06_CRF_ID`, TM1.`TBW06_CRF_VERSION`, TM1.`TBW06_MEMO`, TM1.`TBW06_STYDY_AUTH_CD`, TM1.`TBW06_REQUEST_USER_ID`, TM1.`TBW06_EDIT_REQUEST_FLG`, TM1.`TBW06_EDIT_REQUEST_END_FLG`, TM1.`TBW06_EDIT_REQ_END_DATETIME`, TM1.`TBW06_EDIT_REQUEST_END_USER_ID`, TM1.`TBW06_PROC_DIV` FROM `TBW06_CRF_MEMO` TM1 WHERE TM1.`TBW06_SESSION_ID` = ? and TM1.`TBW06_APP_ID` = ? and TM1.`TBW06_DISP_DATETIME` = ? and TM1.`TBW06_STUDY_ID` = ? and TM1.`TBW06_SUBJECT_ID` = ? and TM1.`TBW06_INS_NO` = ? ORDER BY TM1.`TBW06_SESSION_ID`, TM1.`TBW06_APP_ID`, TM1.`TBW06_DISP_DATETIME`, TM1.`TBW06_STUDY_ID`, TM1.`TBW06_SUBJECT_ID`, TM1.`TBW06_INS_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T00195", "SELECT `TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO` FROM `TBW06_CRF_MEMO` WHERE `TBW06_SESSION_ID` = ? AND `TBW06_APP_ID` = ? AND `TBW06_DISP_DATETIME` = ? AND `TBW06_STUDY_ID` = ? AND `TBW06_SUBJECT_ID` = ? AND `TBW06_INS_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00196", "SELECT `TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO` FROM `TBW06_CRF_MEMO` WHERE ( `TBW06_SESSION_ID` > ? or `TBW06_SESSION_ID` = ? and `TBW06_APP_ID` > ? or `TBW06_APP_ID` = ? and `TBW06_SESSION_ID` = ? and `TBW06_DISP_DATETIME` > ? or `TBW06_DISP_DATETIME` = ? and `TBW06_APP_ID` = ? and `TBW06_SESSION_ID` = ? and `TBW06_STUDY_ID` > ? or `TBW06_STUDY_ID` = ? and `TBW06_DISP_DATETIME` = ? and `TBW06_APP_ID` = ? and `TBW06_SESSION_ID` = ? and `TBW06_SUBJECT_ID` > ? or `TBW06_SUBJECT_ID` = ? and `TBW06_STUDY_ID` = ? and `TBW06_DISP_DATETIME` = ? and `TBW06_APP_ID` = ? and `TBW06_SESSION_ID` = ? and `TBW06_INS_NO` > ?) ORDER BY `TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00197", "SELECT `TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO` FROM `TBW06_CRF_MEMO` WHERE ( `TBW06_SESSION_ID` < ? or `TBW06_SESSION_ID` = ? and `TBW06_APP_ID` < ? or `TBW06_APP_ID` = ? and `TBW06_SESSION_ID` = ? and `TBW06_DISP_DATETIME` < ? or `TBW06_DISP_DATETIME` = ? and `TBW06_APP_ID` = ? and `TBW06_SESSION_ID` = ? and `TBW06_STUDY_ID` < ? or `TBW06_STUDY_ID` = ? and `TBW06_DISP_DATETIME` = ? and `TBW06_APP_ID` = ? and `TBW06_SESSION_ID` = ? and `TBW06_SUBJECT_ID` < ? or `TBW06_SUBJECT_ID` = ? and `TBW06_STUDY_ID` = ? and `TBW06_DISP_DATETIME` = ? and `TBW06_APP_ID` = ? and `TBW06_SESSION_ID` = ? and `TBW06_INS_NO` < ?) ORDER BY `TBW06_SESSION_ID` DESC, `TBW06_APP_ID` DESC, `TBW06_DISP_DATETIME` DESC, `TBW06_STUDY_ID` DESC, `TBW06_SUBJECT_ID` DESC, `TBW06_INS_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00198", "INSERT INTO `TBW06_CRF_MEMO` (`TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO`, `TBW06_CRF_ID`, `TBW06_CRF_VERSION`, `TBW06_MEMO`, `TBW06_STYDY_AUTH_CD`, `TBW06_REQUEST_USER_ID`, `TBW06_EDIT_REQUEST_FLG`, `TBW06_EDIT_REQUEST_END_FLG`, `TBW06_EDIT_REQ_END_DATETIME`, `TBW06_EDIT_REQUEST_END_USER_ID`, `TBW06_PROC_DIV`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00199", "UPDATE `TBW06_CRF_MEMO` SET `TBW06_CRF_ID`=?, `TBW06_CRF_VERSION`=?, `TBW06_MEMO`=?, `TBW06_STYDY_AUTH_CD`=?, `TBW06_REQUEST_USER_ID`=?, `TBW06_EDIT_REQUEST_FLG`=?, `TBW06_EDIT_REQUEST_END_FLG`=?, `TBW06_EDIT_REQ_END_DATETIME`=?, `TBW06_EDIT_REQUEST_END_USER_ID`=?, `TBW06_PROC_DIV`=?  WHERE `TBW06_SESSION_ID` = ? AND `TBW06_APP_ID` = ? AND `TBW06_DISP_DATETIME` = ? AND `TBW06_STUDY_ID` = ? AND `TBW06_SUBJECT_ID` = ? AND `TBW06_INS_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T001910", "DELETE FROM `TBW06_CRF_MEMO`  WHERE `TBW06_SESSION_ID` = ? AND `TBW06_APP_ID` = ? AND `TBW06_DISP_DATETIME` = ? AND `TBW06_STUDY_ID` = ? AND `TBW06_SUBJECT_ID` = ? AND `TBW06_INS_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T001911", "SELECT `TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO` FROM `TBW06_CRF_MEMO` ORDER BY `TBW06_SESSION_ID`, `TBW06_APP_ID`, `TBW06_DISP_DATETIME`, `TBW06_STUDY_ID`, `TBW06_SUBJECT_ID`, `TBW06_INS_NO` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((short[]) buf[8])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[20])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 7, false);
               stmt.setVarchar(4, (String)parms[3], 7, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 14, false);
               stmt.setVarchar(7, (String)parms[6], 14, false);
               stmt.setVarchar(8, (String)parms[7], 7, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               stmt.setLong(11, ((Number) parms[10]).longValue());
               stmt.setVarchar(12, (String)parms[11], 14, false);
               stmt.setVarchar(13, (String)parms[12], 7, false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setLong(17, ((Number) parms[16]).longValue());
               stmt.setVarchar(18, (String)parms[17], 14, false);
               stmt.setVarchar(19, (String)parms[18], 7, false);
               stmt.setVarchar(20, (String)parms[19], 50, false);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setVarchar(3, (String)parms[2], 7, false);
               stmt.setVarchar(4, (String)parms[3], 7, false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setVarchar(6, (String)parms[5], 14, false);
               stmt.setVarchar(7, (String)parms[6], 14, false);
               stmt.setVarchar(8, (String)parms[7], 7, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setLong(10, ((Number) parms[9]).longValue());
               stmt.setLong(11, ((Number) parms[10]).longValue());
               stmt.setVarchar(12, (String)parms[11], 14, false);
               stmt.setVarchar(13, (String)parms[12], 7, false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setInt(15, ((Number) parms[14]).intValue());
               stmt.setInt(16, ((Number) parms[15]).intValue());
               stmt.setLong(17, ((Number) parms[16]).longValue());
               stmt.setVarchar(18, (String)parms[17], 14, false);
               stmt.setVarchar(19, (String)parms[18], 7, false);
               stmt.setVarchar(20, (String)parms[19], 50, false);
               stmt.setShort(21, ((Number) parms[20]).shortValue());
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[11], 2000);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[13], 2);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[21], false);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[23], 128);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[25], 1);
               }
               break;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(1, ((Number) parms[1]).shortValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(2, ((Number) parms[3]).shortValue());
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 2000);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 2);
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
                  stmt.setNull( 8 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(8, (java.util.Date)parms[15], false);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 128);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               stmt.setVarchar(11, (String)parms[20], 50, false);
               stmt.setVarchar(12, (String)parms[21], 7, false);
               stmt.setVarchar(13, (String)parms[22], 14, false);
               stmt.setLong(14, ((Number) parms[23]).longValue());
               stmt.setInt(15, ((Number) parms[24]).intValue());
               stmt.setShort(16, ((Number) parms[25]).shortValue());
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
      }
   }

}

