/*
               File: tbw04_crf_impl
        Description: CRFテーブルワーク
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:58.0
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw04_crf_impl extends GXWebPanel
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
      Form.getMeta().addItem("Description", "CRFテーブルワーク", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW04_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbw04_crf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw04_crf_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw04_crf_impl.class ));
   }

   public tbw04_crf_impl( int remoteHandle ,
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
         wb_table1_2_1742( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1742e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1742( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1742( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1742( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1742e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRFテーブルワーク"+"</legend>") ;
         wb_table3_27_1742( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1742e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1742e( true) ;
      }
      else
      {
         wb_table1_2_1742e( false) ;
      }
   }

   public void wb_table3_27_1742( boolean wbgen )
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
         wb_table4_33_1742( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1742e( boolean wbgen )
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
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW04_CRF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 172,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW04_CRF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1742e( true) ;
      }
      else
      {
         wb_table3_27_1742e( false) ;
      }
   }

   public void wb_table4_33_1742( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_session_id_Internalname, "ID", "", "", lblTextblocktbw04_session_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A661TBW04_SESSION_ID", A661TBW04_SESSION_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_SESSION_ID_Internalname, GXutil.rtrim( A661TBW04_SESSION_ID), GXutil.rtrim( localUtil.format( A661TBW04_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTBW04_SESSION_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_SESSION_ID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_app_id_Internalname, "ID", "", "", lblTextblocktbw04_app_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A662TBW04_APP_ID", A662TBW04_APP_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_APP_ID_Internalname, GXutil.rtrim( A662TBW04_APP_ID), GXutil.rtrim( localUtil.format( A662TBW04_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBW04_APP_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_APP_ID_Enabled, 0, 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_disp_datetime_Internalname, "表示日時", "", "", lblTextblocktbw04_disp_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A663TBW04_DISP_DATETIME", A663TBW04_DISP_DATETIME);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_DISP_DATETIME_Internalname, GXutil.rtrim( A663TBW04_DISP_DATETIME), GXutil.rtrim( localUtil.format( A663TBW04_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBW04_DISP_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_DISP_DATETIME_Enabled, 0, 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_study_id_Internalname, "ID", "", "", lblTextblocktbw04_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A664TBW04_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW04_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A664TBW04_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A664TBW04_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBW04_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_subject_id_Internalname, "ID", "", "", lblTextblocktbw04_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A665TBW04_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW04_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A665TBW04_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A665TBW04_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBW04_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_crf_id_Internalname, "CRFID", "", "", lblTextblocktbw04_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A666TBW04_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW04_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A666TBW04_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A666TBW04_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(63);\"", "", "", "", "", edtTBW04_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_crf_latest_version_Internalname, "CRF最新更新バージョン", "", "", lblTextblocktbw04_crf_latest_version_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A667TBW04_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A667TBW04_CRF_LATEST_VERSION, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_CRF_LATEST_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A667TBW04_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBW04_CRF_LATEST_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A667TBW04_CRF_LATEST_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A667TBW04_CRF_LATEST_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(68);\"", "", "", "", "", edtTBW04_CRF_LATEST_VERSION_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_CRF_LATEST_VERSION_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_crf_input_level_Internalname, "CRF入力権限レベル", "", "", lblTextblocktbw04_crf_input_level_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A668TBW04_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A668TBW04_CRF_INPUT_LEVEL, 2, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_CRF_INPUT_LEVEL_Internalname, GXutil.ltrim( localUtil.ntoc( A668TBW04_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")), ((edtTBW04_CRF_INPUT_LEVEL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A668TBW04_CRF_INPUT_LEVEL), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A668TBW04_CRF_INPUT_LEVEL), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(73);\"", "", "", "", "", edtTBW04_CRF_INPUT_LEVEL_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_CRF_INPUT_LEVEL_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_lock_flg_Internalname, "ロックフラグ", "", "", lblTextblocktbw04_lock_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A669TBW04_LOCK_FLG", A669TBW04_LOCK_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_LOCK_FLG_Internalname, GXutil.rtrim( A669TBW04_LOCK_FLG), GXutil.rtrim( localUtil.format( A669TBW04_LOCK_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBW04_LOCK_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_LOCK_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_lock_datetime_Internalname, "ロック日時", "", "", lblTextblocktbw04_lock_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A670TBW04_LOCK_DATETIME", localUtil.ttoc( A670TBW04_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW04_LOCK_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_LOCK_DATETIME_Internalname, localUtil.format(A670TBW04_LOCK_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A670TBW04_LOCK_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(83);\"", "", "", "", "", edtTBW04_LOCK_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_LOCK_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW04_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW04_LOCK_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW04_LOCK_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW04_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_lock_user_id_Internalname, "ID", "", "", lblTextblocktbw04_lock_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A671TBW04_LOCK_USER_ID", A671TBW04_LOCK_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_LOCK_USER_ID_Internalname, GXutil.rtrim( A671TBW04_LOCK_USER_ID), GXutil.rtrim( localUtil.format( A671TBW04_LOCK_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBW04_LOCK_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_LOCK_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_lock_auth_cd_Internalname, "ロック時権限コード", "", "", lblTextblocktbw04_lock_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A672TBW04_LOCK_AUTH_CD", A672TBW04_LOCK_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_LOCK_AUTH_CD_Internalname, GXutil.rtrim( A672TBW04_LOCK_AUTH_CD), GXutil.rtrim( localUtil.format( A672TBW04_LOCK_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(93);\"", "", "", "", "", edtTBW04_LOCK_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_LOCK_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_upload_datetime_Internalname, "アップロード日時", "", "", lblTextblocktbw04_upload_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A673TBW04_UPLOAD_DATETIME", localUtil.ttoc( A673TBW04_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW04_UPLOAD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_UPLOAD_DATETIME_Internalname, localUtil.format(A673TBW04_UPLOAD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A673TBW04_UPLOAD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(98);\"", "", "", "", "", edtTBW04_UPLOAD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_UPLOAD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW04_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW04_UPLOAD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW04_UPLOAD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW04_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_upload_user_id_Internalname, "ID", "", "", lblTextblocktbw04_upload_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A674TBW04_UPLOAD_USER_ID", A674TBW04_UPLOAD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_UPLOAD_USER_ID_Internalname, GXutil.rtrim( A674TBW04_UPLOAD_USER_ID), GXutil.rtrim( localUtil.format( A674TBW04_UPLOAD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtTBW04_UPLOAD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_UPLOAD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_upload_auth_cd_Internalname, "アップロード時権限コード", "", "", lblTextblocktbw04_upload_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A675TBW04_UPLOAD_AUTH_CD", A675TBW04_UPLOAD_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_UPLOAD_AUTH_CD_Internalname, GXutil.rtrim( A675TBW04_UPLOAD_AUTH_CD), GXutil.rtrim( localUtil.format( A675TBW04_UPLOAD_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(108);\"", "", "", "", "", edtTBW04_UPLOAD_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_UPLOAD_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_dm_arrival_flg_Internalname, "DM到着フラグ", "", "", lblTextblocktbw04_dm_arrival_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A676TBW04_DM_ARRIVAL_FLG", A676TBW04_DM_ARRIVAL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_DM_ARRIVAL_FLG_Internalname, GXutil.rtrim( A676TBW04_DM_ARRIVAL_FLG), GXutil.rtrim( localUtil.format( A676TBW04_DM_ARRIVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(113);\"", "", "", "", "", edtTBW04_DM_ARRIVAL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_DM_ARRIVAL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_dm_arrival_datetime_Internalname, "DM到着日時", "", "", lblTextblocktbw04_dm_arrival_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A677TBW04_DM_ARRIVAL_DATETIME", localUtil.ttoc( A677TBW04_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW04_DM_ARRIVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_DM_ARRIVAL_DATETIME_Internalname, localUtil.format(A677TBW04_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A677TBW04_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(118);\"", "", "", "", "", edtTBW04_DM_ARRIVAL_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_DM_ARRIVAL_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW04_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW04_DM_ARRIVAL_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW04_DM_ARRIVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW04_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_approval_flg_Internalname, "承認フラグ", "", "", lblTextblocktbw04_approval_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A678TBW04_APPROVAL_FLG", A678TBW04_APPROVAL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_APPROVAL_FLG_Internalname, GXutil.rtrim( A678TBW04_APPROVAL_FLG), GXutil.rtrim( localUtil.format( A678TBW04_APPROVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(123);\"", "", "", "", "", edtTBW04_APPROVAL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_APPROVAL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_approval_datetime_Internalname, "承認日時", "", "", lblTextblocktbw04_approval_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A679TBW04_APPROVAL_DATETIME", localUtil.ttoc( A679TBW04_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW04_APPROVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_APPROVAL_DATETIME_Internalname, localUtil.format(A679TBW04_APPROVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A679TBW04_APPROVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(128);\"", "", "", "", "", edtTBW04_APPROVAL_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_APPROVAL_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW04_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW04_APPROVAL_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW04_APPROVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW04_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_approval_user_id_Internalname, "ID", "", "", lblTextblocktbw04_approval_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A680TBW04_APPROVAL_USER_ID", A680TBW04_APPROVAL_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_APPROVAL_USER_ID_Internalname, GXutil.rtrim( A680TBW04_APPROVAL_USER_ID), GXutil.rtrim( localUtil.format( A680TBW04_APPROVAL_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(133);\"", "", "", "", "", edtTBW04_APPROVAL_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_APPROVAL_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_approval_auth_cd_Internalname, "承認時権限コード", "", "", lblTextblocktbw04_approval_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A681TBW04_APPROVAL_AUTH_CD", A681TBW04_APPROVAL_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_APPROVAL_AUTH_CD_Internalname, GXutil.rtrim( A681TBW04_APPROVAL_AUTH_CD), GXutil.rtrim( localUtil.format( A681TBW04_APPROVAL_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(138);\"", "", "", "", "", edtTBW04_APPROVAL_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_APPROVAL_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_input_end_flg_Internalname, "データ固定フラグ", "", "", lblTextblocktbw04_input_end_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A682TBW04_INPUT_END_FLG", A682TBW04_INPUT_END_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_INPUT_END_FLG_Internalname, GXutil.rtrim( A682TBW04_INPUT_END_FLG), GXutil.rtrim( localUtil.format( A682TBW04_INPUT_END_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(143);\"", "", "", "", "", edtTBW04_INPUT_END_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_INPUT_END_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_input_end_datetime_Internalname, "データ固定日時", "", "", lblTextblocktbw04_input_end_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A683TBW04_INPUT_END_DATETIME", localUtil.ttoc( A683TBW04_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW04_INPUT_END_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_INPUT_END_DATETIME_Internalname, localUtil.format(A683TBW04_INPUT_END_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A683TBW04_INPUT_END_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(148);\"", "", "", "", "", edtTBW04_INPUT_END_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_INPUT_END_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW04_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW04_INPUT_END_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW04_INPUT_END_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW04_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_input_end_user_id_Internalname, "ID", "", "", lblTextblocktbw04_input_end_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A684TBW04_INPUT_END_USER_ID", A684TBW04_INPUT_END_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_INPUT_END_USER_ID_Internalname, GXutil.rtrim( A684TBW04_INPUT_END_USER_ID), GXutil.rtrim( localUtil.format( A684TBW04_INPUT_END_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(153);\"", "", "", "", "", edtTBW04_INPUT_END_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_INPUT_END_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_input_end_auth_cd_Internalname, "データ固定時権限コード", "", "", lblTextblocktbw04_input_end_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A685TBW04_INPUT_END_AUTH_CD", A685TBW04_INPUT_END_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_INPUT_END_AUTH_CD_Internalname, GXutil.rtrim( A685TBW04_INPUT_END_AUTH_CD), GXutil.rtrim( localUtil.format( A685TBW04_INPUT_END_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(158);\"", "", "", "", "", edtTBW04_INPUT_END_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_INPUT_END_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_completion_flg_Internalname, "完了フラグ", "", "", lblTextblocktbw04_completion_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A686TBW04_COMPLETION_FLG", A686TBW04_COMPLETION_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_COMPLETION_FLG_Internalname, GXutil.rtrim( A686TBW04_COMPLETION_FLG), GXutil.rtrim( localUtil.format( A686TBW04_COMPLETION_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(163);\"", "", "", "", "", edtTBW04_COMPLETION_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_COMPLETION_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw04_edit_flg_Internalname, "編集フラグ", "", "", lblTextblocktbw04_edit_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A687TBW04_EDIT_FLG", A687TBW04_EDIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW04_EDIT_FLG_Internalname, GXutil.rtrim( A687TBW04_EDIT_FLG), GXutil.rtrim( localUtil.format( A687TBW04_EDIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(168);\"", "", "", "", "", edtTBW04_EDIT_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW04_EDIT_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW04_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1742e( true) ;
      }
      else
      {
         wb_table4_33_1742e( false) ;
      }
   }

   public void wb_table2_5_1742( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW04_CRF.htm");
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
         wb_table2_5_1742e( true) ;
      }
      else
      {
         wb_table2_5_1742e( false) ;
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
      /* Execute user event: e11172 */
      e11172 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A661TBW04_SESSION_ID = httpContext.cgiGet( edtTBW04_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A661TBW04_SESSION_ID", A661TBW04_SESSION_ID);
            A662TBW04_APP_ID = httpContext.cgiGet( edtTBW04_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A662TBW04_APP_ID", A662TBW04_APP_ID);
            A663TBW04_DISP_DATETIME = httpContext.cgiGet( edtTBW04_DISP_DATETIME_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A663TBW04_DISP_DATETIME", A663TBW04_DISP_DATETIME);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW04_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW04_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW04_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW04_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A664TBW04_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
            }
            else
            {
               A664TBW04_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW04_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW04_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW04_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW04_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW04_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A665TBW04_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A665TBW04_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW04_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW04_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW04_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW04_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW04_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A666TBW04_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
            }
            else
            {
               A666TBW04_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW04_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW04_CRF_LATEST_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW04_CRF_LATEST_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW04_CRF_LATEST_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW04_CRF_LATEST_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A667TBW04_CRF_LATEST_VERSION = (short)(0) ;
               n667TBW04_CRF_LATEST_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A667TBW04_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A667TBW04_CRF_LATEST_VERSION, 4, 0)));
            }
            else
            {
               A667TBW04_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW04_CRF_LATEST_VERSION_Internalname), ".", ",")) ;
               n667TBW04_CRF_LATEST_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A667TBW04_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A667TBW04_CRF_LATEST_VERSION, 4, 0)));
            }
            n667TBW04_CRF_LATEST_VERSION = ((0==A667TBW04_CRF_LATEST_VERSION) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW04_CRF_INPUT_LEVEL_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW04_CRF_INPUT_LEVEL_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW04_CRF_INPUT_LEVEL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW04_CRF_INPUT_LEVEL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A668TBW04_CRF_INPUT_LEVEL = (byte)(0) ;
               n668TBW04_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A668TBW04_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A668TBW04_CRF_INPUT_LEVEL, 2, 0)));
            }
            else
            {
               A668TBW04_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBW04_CRF_INPUT_LEVEL_Internalname), ".", ",")) ;
               n668TBW04_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A668TBW04_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A668TBW04_CRF_INPUT_LEVEL, 2, 0)));
            }
            n668TBW04_CRF_INPUT_LEVEL = ((0==A668TBW04_CRF_INPUT_LEVEL) ? true : false) ;
            A669TBW04_LOCK_FLG = httpContext.cgiGet( edtTBW04_LOCK_FLG_Internalname) ;
            n669TBW04_LOCK_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A669TBW04_LOCK_FLG", A669TBW04_LOCK_FLG);
            n669TBW04_LOCK_FLG = ((GXutil.strcmp("", A669TBW04_LOCK_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW04_LOCK_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"ロック日時"}), 1, "TBW04_LOCK_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW04_LOCK_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A670TBW04_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n670TBW04_LOCK_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A670TBW04_LOCK_DATETIME", localUtil.ttoc( A670TBW04_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A670TBW04_LOCK_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW04_LOCK_DATETIME_Internalname)) ;
               n670TBW04_LOCK_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A670TBW04_LOCK_DATETIME", localUtil.ttoc( A670TBW04_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n670TBW04_LOCK_DATETIME = (GXutil.nullDate().equals(A670TBW04_LOCK_DATETIME) ? true : false) ;
            A671TBW04_LOCK_USER_ID = httpContext.cgiGet( edtTBW04_LOCK_USER_ID_Internalname) ;
            n671TBW04_LOCK_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A671TBW04_LOCK_USER_ID", A671TBW04_LOCK_USER_ID);
            n671TBW04_LOCK_USER_ID = ((GXutil.strcmp("", A671TBW04_LOCK_USER_ID)==0) ? true : false) ;
            A672TBW04_LOCK_AUTH_CD = httpContext.cgiGet( edtTBW04_LOCK_AUTH_CD_Internalname) ;
            n672TBW04_LOCK_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A672TBW04_LOCK_AUTH_CD", A672TBW04_LOCK_AUTH_CD);
            n672TBW04_LOCK_AUTH_CD = ((GXutil.strcmp("", A672TBW04_LOCK_AUTH_CD)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW04_UPLOAD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"アップロード日時"}), 1, "TBW04_UPLOAD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW04_UPLOAD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A673TBW04_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n673TBW04_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A673TBW04_UPLOAD_DATETIME", localUtil.ttoc( A673TBW04_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A673TBW04_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW04_UPLOAD_DATETIME_Internalname)) ;
               n673TBW04_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A673TBW04_UPLOAD_DATETIME", localUtil.ttoc( A673TBW04_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n673TBW04_UPLOAD_DATETIME = (GXutil.nullDate().equals(A673TBW04_UPLOAD_DATETIME) ? true : false) ;
            A674TBW04_UPLOAD_USER_ID = httpContext.cgiGet( edtTBW04_UPLOAD_USER_ID_Internalname) ;
            n674TBW04_UPLOAD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A674TBW04_UPLOAD_USER_ID", A674TBW04_UPLOAD_USER_ID);
            n674TBW04_UPLOAD_USER_ID = ((GXutil.strcmp("", A674TBW04_UPLOAD_USER_ID)==0) ? true : false) ;
            A675TBW04_UPLOAD_AUTH_CD = httpContext.cgiGet( edtTBW04_UPLOAD_AUTH_CD_Internalname) ;
            n675TBW04_UPLOAD_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A675TBW04_UPLOAD_AUTH_CD", A675TBW04_UPLOAD_AUTH_CD);
            n675TBW04_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A675TBW04_UPLOAD_AUTH_CD)==0) ? true : false) ;
            A676TBW04_DM_ARRIVAL_FLG = httpContext.cgiGet( edtTBW04_DM_ARRIVAL_FLG_Internalname) ;
            n676TBW04_DM_ARRIVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A676TBW04_DM_ARRIVAL_FLG", A676TBW04_DM_ARRIVAL_FLG);
            n676TBW04_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A676TBW04_DM_ARRIVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW04_DM_ARRIVAL_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"DM到着日時"}), 1, "TBW04_DM_ARRIVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW04_DM_ARRIVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A677TBW04_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n677TBW04_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A677TBW04_DM_ARRIVAL_DATETIME", localUtil.ttoc( A677TBW04_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A677TBW04_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW04_DM_ARRIVAL_DATETIME_Internalname)) ;
               n677TBW04_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A677TBW04_DM_ARRIVAL_DATETIME", localUtil.ttoc( A677TBW04_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n677TBW04_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A677TBW04_DM_ARRIVAL_DATETIME) ? true : false) ;
            A678TBW04_APPROVAL_FLG = httpContext.cgiGet( edtTBW04_APPROVAL_FLG_Internalname) ;
            n678TBW04_APPROVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A678TBW04_APPROVAL_FLG", A678TBW04_APPROVAL_FLG);
            n678TBW04_APPROVAL_FLG = ((GXutil.strcmp("", A678TBW04_APPROVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW04_APPROVAL_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"承認日時"}), 1, "TBW04_APPROVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW04_APPROVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A679TBW04_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n679TBW04_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A679TBW04_APPROVAL_DATETIME", localUtil.ttoc( A679TBW04_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A679TBW04_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW04_APPROVAL_DATETIME_Internalname)) ;
               n679TBW04_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A679TBW04_APPROVAL_DATETIME", localUtil.ttoc( A679TBW04_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n679TBW04_APPROVAL_DATETIME = (GXutil.nullDate().equals(A679TBW04_APPROVAL_DATETIME) ? true : false) ;
            A680TBW04_APPROVAL_USER_ID = httpContext.cgiGet( edtTBW04_APPROVAL_USER_ID_Internalname) ;
            n680TBW04_APPROVAL_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A680TBW04_APPROVAL_USER_ID", A680TBW04_APPROVAL_USER_ID);
            n680TBW04_APPROVAL_USER_ID = ((GXutil.strcmp("", A680TBW04_APPROVAL_USER_ID)==0) ? true : false) ;
            A681TBW04_APPROVAL_AUTH_CD = httpContext.cgiGet( edtTBW04_APPROVAL_AUTH_CD_Internalname) ;
            n681TBW04_APPROVAL_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A681TBW04_APPROVAL_AUTH_CD", A681TBW04_APPROVAL_AUTH_CD);
            n681TBW04_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A681TBW04_APPROVAL_AUTH_CD)==0) ? true : false) ;
            A682TBW04_INPUT_END_FLG = httpContext.cgiGet( edtTBW04_INPUT_END_FLG_Internalname) ;
            n682TBW04_INPUT_END_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A682TBW04_INPUT_END_FLG", A682TBW04_INPUT_END_FLG);
            n682TBW04_INPUT_END_FLG = ((GXutil.strcmp("", A682TBW04_INPUT_END_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW04_INPUT_END_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"データ固定日時"}), 1, "TBW04_INPUT_END_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW04_INPUT_END_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A683TBW04_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n683TBW04_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A683TBW04_INPUT_END_DATETIME", localUtil.ttoc( A683TBW04_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A683TBW04_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW04_INPUT_END_DATETIME_Internalname)) ;
               n683TBW04_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A683TBW04_INPUT_END_DATETIME", localUtil.ttoc( A683TBW04_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n683TBW04_INPUT_END_DATETIME = (GXutil.nullDate().equals(A683TBW04_INPUT_END_DATETIME) ? true : false) ;
            A684TBW04_INPUT_END_USER_ID = httpContext.cgiGet( edtTBW04_INPUT_END_USER_ID_Internalname) ;
            n684TBW04_INPUT_END_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A684TBW04_INPUT_END_USER_ID", A684TBW04_INPUT_END_USER_ID);
            n684TBW04_INPUT_END_USER_ID = ((GXutil.strcmp("", A684TBW04_INPUT_END_USER_ID)==0) ? true : false) ;
            A685TBW04_INPUT_END_AUTH_CD = httpContext.cgiGet( edtTBW04_INPUT_END_AUTH_CD_Internalname) ;
            n685TBW04_INPUT_END_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A685TBW04_INPUT_END_AUTH_CD", A685TBW04_INPUT_END_AUTH_CD);
            n685TBW04_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A685TBW04_INPUT_END_AUTH_CD)==0) ? true : false) ;
            A686TBW04_COMPLETION_FLG = httpContext.cgiGet( edtTBW04_COMPLETION_FLG_Internalname) ;
            n686TBW04_COMPLETION_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A686TBW04_COMPLETION_FLG", A686TBW04_COMPLETION_FLG);
            n686TBW04_COMPLETION_FLG = ((GXutil.strcmp("", A686TBW04_COMPLETION_FLG)==0) ? true : false) ;
            A687TBW04_EDIT_FLG = httpContext.cgiGet( edtTBW04_EDIT_FLG_Internalname) ;
            n687TBW04_EDIT_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A687TBW04_EDIT_FLG", A687TBW04_EDIT_FLG);
            n687TBW04_EDIT_FLG = ((GXutil.strcmp("", A687TBW04_EDIT_FLG)==0) ? true : false) ;
            /* Read saved values. */
            Z661TBW04_SESSION_ID = httpContext.cgiGet( "Z661TBW04_SESSION_ID") ;
            Z662TBW04_APP_ID = httpContext.cgiGet( "Z662TBW04_APP_ID") ;
            Z663TBW04_DISP_DATETIME = httpContext.cgiGet( "Z663TBW04_DISP_DATETIME") ;
            Z664TBW04_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z664TBW04_STUDY_ID"), ".", ",") ;
            Z665TBW04_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z665TBW04_SUBJECT_ID"), ".", ",")) ;
            Z666TBW04_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z666TBW04_CRF_ID"), ".", ",")) ;
            Z667TBW04_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z667TBW04_CRF_LATEST_VERSION"), ".", ",")) ;
            n667TBW04_CRF_LATEST_VERSION = ((0==A667TBW04_CRF_LATEST_VERSION) ? true : false) ;
            Z668TBW04_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z668TBW04_CRF_INPUT_LEVEL"), ".", ",")) ;
            n668TBW04_CRF_INPUT_LEVEL = ((0==A668TBW04_CRF_INPUT_LEVEL) ? true : false) ;
            Z669TBW04_LOCK_FLG = httpContext.cgiGet( "Z669TBW04_LOCK_FLG") ;
            n669TBW04_LOCK_FLG = ((GXutil.strcmp("", A669TBW04_LOCK_FLG)==0) ? true : false) ;
            Z670TBW04_LOCK_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z670TBW04_LOCK_DATETIME"), 0) ;
            n670TBW04_LOCK_DATETIME = (GXutil.nullDate().equals(A670TBW04_LOCK_DATETIME) ? true : false) ;
            Z671TBW04_LOCK_USER_ID = httpContext.cgiGet( "Z671TBW04_LOCK_USER_ID") ;
            n671TBW04_LOCK_USER_ID = ((GXutil.strcmp("", A671TBW04_LOCK_USER_ID)==0) ? true : false) ;
            Z672TBW04_LOCK_AUTH_CD = httpContext.cgiGet( "Z672TBW04_LOCK_AUTH_CD") ;
            n672TBW04_LOCK_AUTH_CD = ((GXutil.strcmp("", A672TBW04_LOCK_AUTH_CD)==0) ? true : false) ;
            Z673TBW04_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z673TBW04_UPLOAD_DATETIME"), 0) ;
            n673TBW04_UPLOAD_DATETIME = (GXutil.nullDate().equals(A673TBW04_UPLOAD_DATETIME) ? true : false) ;
            Z674TBW04_UPLOAD_USER_ID = httpContext.cgiGet( "Z674TBW04_UPLOAD_USER_ID") ;
            n674TBW04_UPLOAD_USER_ID = ((GXutil.strcmp("", A674TBW04_UPLOAD_USER_ID)==0) ? true : false) ;
            Z675TBW04_UPLOAD_AUTH_CD = httpContext.cgiGet( "Z675TBW04_UPLOAD_AUTH_CD") ;
            n675TBW04_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A675TBW04_UPLOAD_AUTH_CD)==0) ? true : false) ;
            Z676TBW04_DM_ARRIVAL_FLG = httpContext.cgiGet( "Z676TBW04_DM_ARRIVAL_FLG") ;
            n676TBW04_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A676TBW04_DM_ARRIVAL_FLG)==0) ? true : false) ;
            Z677TBW04_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z677TBW04_DM_ARRIVAL_DATETIME"), 0) ;
            n677TBW04_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A677TBW04_DM_ARRIVAL_DATETIME) ? true : false) ;
            Z678TBW04_APPROVAL_FLG = httpContext.cgiGet( "Z678TBW04_APPROVAL_FLG") ;
            n678TBW04_APPROVAL_FLG = ((GXutil.strcmp("", A678TBW04_APPROVAL_FLG)==0) ? true : false) ;
            Z679TBW04_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z679TBW04_APPROVAL_DATETIME"), 0) ;
            n679TBW04_APPROVAL_DATETIME = (GXutil.nullDate().equals(A679TBW04_APPROVAL_DATETIME) ? true : false) ;
            Z680TBW04_APPROVAL_USER_ID = httpContext.cgiGet( "Z680TBW04_APPROVAL_USER_ID") ;
            n680TBW04_APPROVAL_USER_ID = ((GXutil.strcmp("", A680TBW04_APPROVAL_USER_ID)==0) ? true : false) ;
            Z681TBW04_APPROVAL_AUTH_CD = httpContext.cgiGet( "Z681TBW04_APPROVAL_AUTH_CD") ;
            n681TBW04_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A681TBW04_APPROVAL_AUTH_CD)==0) ? true : false) ;
            Z682TBW04_INPUT_END_FLG = httpContext.cgiGet( "Z682TBW04_INPUT_END_FLG") ;
            n682TBW04_INPUT_END_FLG = ((GXutil.strcmp("", A682TBW04_INPUT_END_FLG)==0) ? true : false) ;
            Z683TBW04_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z683TBW04_INPUT_END_DATETIME"), 0) ;
            n683TBW04_INPUT_END_DATETIME = (GXutil.nullDate().equals(A683TBW04_INPUT_END_DATETIME) ? true : false) ;
            Z684TBW04_INPUT_END_USER_ID = httpContext.cgiGet( "Z684TBW04_INPUT_END_USER_ID") ;
            n684TBW04_INPUT_END_USER_ID = ((GXutil.strcmp("", A684TBW04_INPUT_END_USER_ID)==0) ? true : false) ;
            Z685TBW04_INPUT_END_AUTH_CD = httpContext.cgiGet( "Z685TBW04_INPUT_END_AUTH_CD") ;
            n685TBW04_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A685TBW04_INPUT_END_AUTH_CD)==0) ? true : false) ;
            Z686TBW04_COMPLETION_FLG = httpContext.cgiGet( "Z686TBW04_COMPLETION_FLG") ;
            n686TBW04_COMPLETION_FLG = ((GXutil.strcmp("", A686TBW04_COMPLETION_FLG)==0) ? true : false) ;
            Z687TBW04_EDIT_FLG = httpContext.cgiGet( "Z687TBW04_EDIT_FLG") ;
            n687TBW04_EDIT_FLG = ((GXutil.strcmp("", A687TBW04_EDIT_FLG)==0) ? true : false) ;
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
               A661TBW04_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A661TBW04_SESSION_ID", A661TBW04_SESSION_ID);
               A662TBW04_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A662TBW04_APP_ID", A662TBW04_APP_ID);
               A663TBW04_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A663TBW04_DISP_DATETIME", A663TBW04_DISP_DATETIME);
               A664TBW04_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
               A665TBW04_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
               A666TBW04_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
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
                     /* Execute user event: e11172 */
                     e11172 ();
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
            initAll1742( ) ;
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
      disableAttributes1742( ) ;
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

   public void resetCaption170( )
   {
   }

   public void e11172( )
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

   public void zm1742( int GX_JID )
   {
      if ( ( GX_JID == 6 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z667TBW04_CRF_LATEST_VERSION = T00173_A667TBW04_CRF_LATEST_VERSION[0] ;
            Z668TBW04_CRF_INPUT_LEVEL = T00173_A668TBW04_CRF_INPUT_LEVEL[0] ;
            Z669TBW04_LOCK_FLG = T00173_A669TBW04_LOCK_FLG[0] ;
            Z670TBW04_LOCK_DATETIME = T00173_A670TBW04_LOCK_DATETIME[0] ;
            Z671TBW04_LOCK_USER_ID = T00173_A671TBW04_LOCK_USER_ID[0] ;
            Z672TBW04_LOCK_AUTH_CD = T00173_A672TBW04_LOCK_AUTH_CD[0] ;
            Z673TBW04_UPLOAD_DATETIME = T00173_A673TBW04_UPLOAD_DATETIME[0] ;
            Z674TBW04_UPLOAD_USER_ID = T00173_A674TBW04_UPLOAD_USER_ID[0] ;
            Z675TBW04_UPLOAD_AUTH_CD = T00173_A675TBW04_UPLOAD_AUTH_CD[0] ;
            Z676TBW04_DM_ARRIVAL_FLG = T00173_A676TBW04_DM_ARRIVAL_FLG[0] ;
            Z677TBW04_DM_ARRIVAL_DATETIME = T00173_A677TBW04_DM_ARRIVAL_DATETIME[0] ;
            Z678TBW04_APPROVAL_FLG = T00173_A678TBW04_APPROVAL_FLG[0] ;
            Z679TBW04_APPROVAL_DATETIME = T00173_A679TBW04_APPROVAL_DATETIME[0] ;
            Z680TBW04_APPROVAL_USER_ID = T00173_A680TBW04_APPROVAL_USER_ID[0] ;
            Z681TBW04_APPROVAL_AUTH_CD = T00173_A681TBW04_APPROVAL_AUTH_CD[0] ;
            Z682TBW04_INPUT_END_FLG = T00173_A682TBW04_INPUT_END_FLG[0] ;
            Z683TBW04_INPUT_END_DATETIME = T00173_A683TBW04_INPUT_END_DATETIME[0] ;
            Z684TBW04_INPUT_END_USER_ID = T00173_A684TBW04_INPUT_END_USER_ID[0] ;
            Z685TBW04_INPUT_END_AUTH_CD = T00173_A685TBW04_INPUT_END_AUTH_CD[0] ;
            Z686TBW04_COMPLETION_FLG = T00173_A686TBW04_COMPLETION_FLG[0] ;
            Z687TBW04_EDIT_FLG = T00173_A687TBW04_EDIT_FLG[0] ;
         }
         else
         {
            Z667TBW04_CRF_LATEST_VERSION = A667TBW04_CRF_LATEST_VERSION ;
            Z668TBW04_CRF_INPUT_LEVEL = A668TBW04_CRF_INPUT_LEVEL ;
            Z669TBW04_LOCK_FLG = A669TBW04_LOCK_FLG ;
            Z670TBW04_LOCK_DATETIME = A670TBW04_LOCK_DATETIME ;
            Z671TBW04_LOCK_USER_ID = A671TBW04_LOCK_USER_ID ;
            Z672TBW04_LOCK_AUTH_CD = A672TBW04_LOCK_AUTH_CD ;
            Z673TBW04_UPLOAD_DATETIME = A673TBW04_UPLOAD_DATETIME ;
            Z674TBW04_UPLOAD_USER_ID = A674TBW04_UPLOAD_USER_ID ;
            Z675TBW04_UPLOAD_AUTH_CD = A675TBW04_UPLOAD_AUTH_CD ;
            Z676TBW04_DM_ARRIVAL_FLG = A676TBW04_DM_ARRIVAL_FLG ;
            Z677TBW04_DM_ARRIVAL_DATETIME = A677TBW04_DM_ARRIVAL_DATETIME ;
            Z678TBW04_APPROVAL_FLG = A678TBW04_APPROVAL_FLG ;
            Z679TBW04_APPROVAL_DATETIME = A679TBW04_APPROVAL_DATETIME ;
            Z680TBW04_APPROVAL_USER_ID = A680TBW04_APPROVAL_USER_ID ;
            Z681TBW04_APPROVAL_AUTH_CD = A681TBW04_APPROVAL_AUTH_CD ;
            Z682TBW04_INPUT_END_FLG = A682TBW04_INPUT_END_FLG ;
            Z683TBW04_INPUT_END_DATETIME = A683TBW04_INPUT_END_DATETIME ;
            Z684TBW04_INPUT_END_USER_ID = A684TBW04_INPUT_END_USER_ID ;
            Z685TBW04_INPUT_END_AUTH_CD = A685TBW04_INPUT_END_AUTH_CD ;
            Z686TBW04_COMPLETION_FLG = A686TBW04_COMPLETION_FLG ;
            Z687TBW04_EDIT_FLG = A687TBW04_EDIT_FLG ;
         }
      }
      if ( GX_JID == -6 )
      {
         Z661TBW04_SESSION_ID = A661TBW04_SESSION_ID ;
         Z662TBW04_APP_ID = A662TBW04_APP_ID ;
         Z663TBW04_DISP_DATETIME = A663TBW04_DISP_DATETIME ;
         Z664TBW04_STUDY_ID = A664TBW04_STUDY_ID ;
         Z665TBW04_SUBJECT_ID = A665TBW04_SUBJECT_ID ;
         Z666TBW04_CRF_ID = A666TBW04_CRF_ID ;
         Z667TBW04_CRF_LATEST_VERSION = A667TBW04_CRF_LATEST_VERSION ;
         Z668TBW04_CRF_INPUT_LEVEL = A668TBW04_CRF_INPUT_LEVEL ;
         Z669TBW04_LOCK_FLG = A669TBW04_LOCK_FLG ;
         Z670TBW04_LOCK_DATETIME = A670TBW04_LOCK_DATETIME ;
         Z671TBW04_LOCK_USER_ID = A671TBW04_LOCK_USER_ID ;
         Z672TBW04_LOCK_AUTH_CD = A672TBW04_LOCK_AUTH_CD ;
         Z673TBW04_UPLOAD_DATETIME = A673TBW04_UPLOAD_DATETIME ;
         Z674TBW04_UPLOAD_USER_ID = A674TBW04_UPLOAD_USER_ID ;
         Z675TBW04_UPLOAD_AUTH_CD = A675TBW04_UPLOAD_AUTH_CD ;
         Z676TBW04_DM_ARRIVAL_FLG = A676TBW04_DM_ARRIVAL_FLG ;
         Z677TBW04_DM_ARRIVAL_DATETIME = A677TBW04_DM_ARRIVAL_DATETIME ;
         Z678TBW04_APPROVAL_FLG = A678TBW04_APPROVAL_FLG ;
         Z679TBW04_APPROVAL_DATETIME = A679TBW04_APPROVAL_DATETIME ;
         Z680TBW04_APPROVAL_USER_ID = A680TBW04_APPROVAL_USER_ID ;
         Z681TBW04_APPROVAL_AUTH_CD = A681TBW04_APPROVAL_AUTH_CD ;
         Z682TBW04_INPUT_END_FLG = A682TBW04_INPUT_END_FLG ;
         Z683TBW04_INPUT_END_DATETIME = A683TBW04_INPUT_END_DATETIME ;
         Z684TBW04_INPUT_END_USER_ID = A684TBW04_INPUT_END_USER_ID ;
         Z685TBW04_INPUT_END_AUTH_CD = A685TBW04_INPUT_END_AUTH_CD ;
         Z686TBW04_COMPLETION_FLG = A686TBW04_COMPLETION_FLG ;
         Z687TBW04_EDIT_FLG = A687TBW04_EDIT_FLG ;
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

   public void load1742( )
   {
      /* Using cursor T00174 */
      pr_default.execute(2, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A667TBW04_CRF_LATEST_VERSION = T00174_A667TBW04_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A667TBW04_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A667TBW04_CRF_LATEST_VERSION, 4, 0)));
         n667TBW04_CRF_LATEST_VERSION = T00174_n667TBW04_CRF_LATEST_VERSION[0] ;
         A668TBW04_CRF_INPUT_LEVEL = T00174_A668TBW04_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A668TBW04_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A668TBW04_CRF_INPUT_LEVEL, 2, 0)));
         n668TBW04_CRF_INPUT_LEVEL = T00174_n668TBW04_CRF_INPUT_LEVEL[0] ;
         A669TBW04_LOCK_FLG = T00174_A669TBW04_LOCK_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669TBW04_LOCK_FLG", A669TBW04_LOCK_FLG);
         n669TBW04_LOCK_FLG = T00174_n669TBW04_LOCK_FLG[0] ;
         A670TBW04_LOCK_DATETIME = T00174_A670TBW04_LOCK_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A670TBW04_LOCK_DATETIME", localUtil.ttoc( A670TBW04_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n670TBW04_LOCK_DATETIME = T00174_n670TBW04_LOCK_DATETIME[0] ;
         A671TBW04_LOCK_USER_ID = T00174_A671TBW04_LOCK_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A671TBW04_LOCK_USER_ID", A671TBW04_LOCK_USER_ID);
         n671TBW04_LOCK_USER_ID = T00174_n671TBW04_LOCK_USER_ID[0] ;
         A672TBW04_LOCK_AUTH_CD = T00174_A672TBW04_LOCK_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A672TBW04_LOCK_AUTH_CD", A672TBW04_LOCK_AUTH_CD);
         n672TBW04_LOCK_AUTH_CD = T00174_n672TBW04_LOCK_AUTH_CD[0] ;
         A673TBW04_UPLOAD_DATETIME = T00174_A673TBW04_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673TBW04_UPLOAD_DATETIME", localUtil.ttoc( A673TBW04_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n673TBW04_UPLOAD_DATETIME = T00174_n673TBW04_UPLOAD_DATETIME[0] ;
         A674TBW04_UPLOAD_USER_ID = T00174_A674TBW04_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A674TBW04_UPLOAD_USER_ID", A674TBW04_UPLOAD_USER_ID);
         n674TBW04_UPLOAD_USER_ID = T00174_n674TBW04_UPLOAD_USER_ID[0] ;
         A675TBW04_UPLOAD_AUTH_CD = T00174_A675TBW04_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A675TBW04_UPLOAD_AUTH_CD", A675TBW04_UPLOAD_AUTH_CD);
         n675TBW04_UPLOAD_AUTH_CD = T00174_n675TBW04_UPLOAD_AUTH_CD[0] ;
         A676TBW04_DM_ARRIVAL_FLG = T00174_A676TBW04_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A676TBW04_DM_ARRIVAL_FLG", A676TBW04_DM_ARRIVAL_FLG);
         n676TBW04_DM_ARRIVAL_FLG = T00174_n676TBW04_DM_ARRIVAL_FLG[0] ;
         A677TBW04_DM_ARRIVAL_DATETIME = T00174_A677TBW04_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A677TBW04_DM_ARRIVAL_DATETIME", localUtil.ttoc( A677TBW04_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n677TBW04_DM_ARRIVAL_DATETIME = T00174_n677TBW04_DM_ARRIVAL_DATETIME[0] ;
         A678TBW04_APPROVAL_FLG = T00174_A678TBW04_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A678TBW04_APPROVAL_FLG", A678TBW04_APPROVAL_FLG);
         n678TBW04_APPROVAL_FLG = T00174_n678TBW04_APPROVAL_FLG[0] ;
         A679TBW04_APPROVAL_DATETIME = T00174_A679TBW04_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A679TBW04_APPROVAL_DATETIME", localUtil.ttoc( A679TBW04_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n679TBW04_APPROVAL_DATETIME = T00174_n679TBW04_APPROVAL_DATETIME[0] ;
         A680TBW04_APPROVAL_USER_ID = T00174_A680TBW04_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A680TBW04_APPROVAL_USER_ID", A680TBW04_APPROVAL_USER_ID);
         n680TBW04_APPROVAL_USER_ID = T00174_n680TBW04_APPROVAL_USER_ID[0] ;
         A681TBW04_APPROVAL_AUTH_CD = T00174_A681TBW04_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A681TBW04_APPROVAL_AUTH_CD", A681TBW04_APPROVAL_AUTH_CD);
         n681TBW04_APPROVAL_AUTH_CD = T00174_n681TBW04_APPROVAL_AUTH_CD[0] ;
         A682TBW04_INPUT_END_FLG = T00174_A682TBW04_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A682TBW04_INPUT_END_FLG", A682TBW04_INPUT_END_FLG);
         n682TBW04_INPUT_END_FLG = T00174_n682TBW04_INPUT_END_FLG[0] ;
         A683TBW04_INPUT_END_DATETIME = T00174_A683TBW04_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A683TBW04_INPUT_END_DATETIME", localUtil.ttoc( A683TBW04_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n683TBW04_INPUT_END_DATETIME = T00174_n683TBW04_INPUT_END_DATETIME[0] ;
         A684TBW04_INPUT_END_USER_ID = T00174_A684TBW04_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684TBW04_INPUT_END_USER_ID", A684TBW04_INPUT_END_USER_ID);
         n684TBW04_INPUT_END_USER_ID = T00174_n684TBW04_INPUT_END_USER_ID[0] ;
         A685TBW04_INPUT_END_AUTH_CD = T00174_A685TBW04_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685TBW04_INPUT_END_AUTH_CD", A685TBW04_INPUT_END_AUTH_CD);
         n685TBW04_INPUT_END_AUTH_CD = T00174_n685TBW04_INPUT_END_AUTH_CD[0] ;
         A686TBW04_COMPLETION_FLG = T00174_A686TBW04_COMPLETION_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A686TBW04_COMPLETION_FLG", A686TBW04_COMPLETION_FLG);
         n686TBW04_COMPLETION_FLG = T00174_n686TBW04_COMPLETION_FLG[0] ;
         A687TBW04_EDIT_FLG = T00174_A687TBW04_EDIT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A687TBW04_EDIT_FLG", A687TBW04_EDIT_FLG);
         n687TBW04_EDIT_FLG = T00174_n687TBW04_EDIT_FLG[0] ;
         zm1742( -6) ;
      }
      pr_default.close(2);
      onLoadActions1742( ) ;
   }

   public void onLoadActions1742( )
   {
      AV8Pgmname = "TBW04_CRF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable1742( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TBW04_CRF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      if ( ! ( GXutil.nullDate().equals(A670TBW04_LOCK_DATETIME) || (( A670TBW04_LOCK_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A670TBW04_LOCK_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　ロック日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A673TBW04_UPLOAD_DATETIME) || (( A673TBW04_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A673TBW04_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A677TBW04_DM_ARRIVAL_DATETIME) || (( A677TBW04_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A677TBW04_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A679TBW04_APPROVAL_DATETIME) || (( A679TBW04_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A679TBW04_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A683TBW04_INPUT_END_DATETIME) || (( A683TBW04_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A683TBW04_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1742( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1742( )
   {
      /* Using cursor T00175 */
      pr_default.execute(3, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound42 = (short)(1) ;
      }
      else
      {
         RcdFound42 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00173 */
      pr_default.execute(1, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1742( 6) ;
         RcdFound42 = (short)(1) ;
         A661TBW04_SESSION_ID = T00173_A661TBW04_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661TBW04_SESSION_ID", A661TBW04_SESSION_ID);
         A662TBW04_APP_ID = T00173_A662TBW04_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A662TBW04_APP_ID", A662TBW04_APP_ID);
         A663TBW04_DISP_DATETIME = T00173_A663TBW04_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A663TBW04_DISP_DATETIME", A663TBW04_DISP_DATETIME);
         A664TBW04_STUDY_ID = T00173_A664TBW04_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
         A665TBW04_SUBJECT_ID = T00173_A665TBW04_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
         A666TBW04_CRF_ID = T00173_A666TBW04_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
         A667TBW04_CRF_LATEST_VERSION = T00173_A667TBW04_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A667TBW04_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A667TBW04_CRF_LATEST_VERSION, 4, 0)));
         n667TBW04_CRF_LATEST_VERSION = T00173_n667TBW04_CRF_LATEST_VERSION[0] ;
         A668TBW04_CRF_INPUT_LEVEL = T00173_A668TBW04_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A668TBW04_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A668TBW04_CRF_INPUT_LEVEL, 2, 0)));
         n668TBW04_CRF_INPUT_LEVEL = T00173_n668TBW04_CRF_INPUT_LEVEL[0] ;
         A669TBW04_LOCK_FLG = T00173_A669TBW04_LOCK_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A669TBW04_LOCK_FLG", A669TBW04_LOCK_FLG);
         n669TBW04_LOCK_FLG = T00173_n669TBW04_LOCK_FLG[0] ;
         A670TBW04_LOCK_DATETIME = T00173_A670TBW04_LOCK_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A670TBW04_LOCK_DATETIME", localUtil.ttoc( A670TBW04_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n670TBW04_LOCK_DATETIME = T00173_n670TBW04_LOCK_DATETIME[0] ;
         A671TBW04_LOCK_USER_ID = T00173_A671TBW04_LOCK_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A671TBW04_LOCK_USER_ID", A671TBW04_LOCK_USER_ID);
         n671TBW04_LOCK_USER_ID = T00173_n671TBW04_LOCK_USER_ID[0] ;
         A672TBW04_LOCK_AUTH_CD = T00173_A672TBW04_LOCK_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A672TBW04_LOCK_AUTH_CD", A672TBW04_LOCK_AUTH_CD);
         n672TBW04_LOCK_AUTH_CD = T00173_n672TBW04_LOCK_AUTH_CD[0] ;
         A673TBW04_UPLOAD_DATETIME = T00173_A673TBW04_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A673TBW04_UPLOAD_DATETIME", localUtil.ttoc( A673TBW04_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n673TBW04_UPLOAD_DATETIME = T00173_n673TBW04_UPLOAD_DATETIME[0] ;
         A674TBW04_UPLOAD_USER_ID = T00173_A674TBW04_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A674TBW04_UPLOAD_USER_ID", A674TBW04_UPLOAD_USER_ID);
         n674TBW04_UPLOAD_USER_ID = T00173_n674TBW04_UPLOAD_USER_ID[0] ;
         A675TBW04_UPLOAD_AUTH_CD = T00173_A675TBW04_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A675TBW04_UPLOAD_AUTH_CD", A675TBW04_UPLOAD_AUTH_CD);
         n675TBW04_UPLOAD_AUTH_CD = T00173_n675TBW04_UPLOAD_AUTH_CD[0] ;
         A676TBW04_DM_ARRIVAL_FLG = T00173_A676TBW04_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A676TBW04_DM_ARRIVAL_FLG", A676TBW04_DM_ARRIVAL_FLG);
         n676TBW04_DM_ARRIVAL_FLG = T00173_n676TBW04_DM_ARRIVAL_FLG[0] ;
         A677TBW04_DM_ARRIVAL_DATETIME = T00173_A677TBW04_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A677TBW04_DM_ARRIVAL_DATETIME", localUtil.ttoc( A677TBW04_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n677TBW04_DM_ARRIVAL_DATETIME = T00173_n677TBW04_DM_ARRIVAL_DATETIME[0] ;
         A678TBW04_APPROVAL_FLG = T00173_A678TBW04_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A678TBW04_APPROVAL_FLG", A678TBW04_APPROVAL_FLG);
         n678TBW04_APPROVAL_FLG = T00173_n678TBW04_APPROVAL_FLG[0] ;
         A679TBW04_APPROVAL_DATETIME = T00173_A679TBW04_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A679TBW04_APPROVAL_DATETIME", localUtil.ttoc( A679TBW04_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n679TBW04_APPROVAL_DATETIME = T00173_n679TBW04_APPROVAL_DATETIME[0] ;
         A680TBW04_APPROVAL_USER_ID = T00173_A680TBW04_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A680TBW04_APPROVAL_USER_ID", A680TBW04_APPROVAL_USER_ID);
         n680TBW04_APPROVAL_USER_ID = T00173_n680TBW04_APPROVAL_USER_ID[0] ;
         A681TBW04_APPROVAL_AUTH_CD = T00173_A681TBW04_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A681TBW04_APPROVAL_AUTH_CD", A681TBW04_APPROVAL_AUTH_CD);
         n681TBW04_APPROVAL_AUTH_CD = T00173_n681TBW04_APPROVAL_AUTH_CD[0] ;
         A682TBW04_INPUT_END_FLG = T00173_A682TBW04_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A682TBW04_INPUT_END_FLG", A682TBW04_INPUT_END_FLG);
         n682TBW04_INPUT_END_FLG = T00173_n682TBW04_INPUT_END_FLG[0] ;
         A683TBW04_INPUT_END_DATETIME = T00173_A683TBW04_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A683TBW04_INPUT_END_DATETIME", localUtil.ttoc( A683TBW04_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n683TBW04_INPUT_END_DATETIME = T00173_n683TBW04_INPUT_END_DATETIME[0] ;
         A684TBW04_INPUT_END_USER_ID = T00173_A684TBW04_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684TBW04_INPUT_END_USER_ID", A684TBW04_INPUT_END_USER_ID);
         n684TBW04_INPUT_END_USER_ID = T00173_n684TBW04_INPUT_END_USER_ID[0] ;
         A685TBW04_INPUT_END_AUTH_CD = T00173_A685TBW04_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A685TBW04_INPUT_END_AUTH_CD", A685TBW04_INPUT_END_AUTH_CD);
         n685TBW04_INPUT_END_AUTH_CD = T00173_n685TBW04_INPUT_END_AUTH_CD[0] ;
         A686TBW04_COMPLETION_FLG = T00173_A686TBW04_COMPLETION_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A686TBW04_COMPLETION_FLG", A686TBW04_COMPLETION_FLG);
         n686TBW04_COMPLETION_FLG = T00173_n686TBW04_COMPLETION_FLG[0] ;
         A687TBW04_EDIT_FLG = T00173_A687TBW04_EDIT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A687TBW04_EDIT_FLG", A687TBW04_EDIT_FLG);
         n687TBW04_EDIT_FLG = T00173_n687TBW04_EDIT_FLG[0] ;
         Z661TBW04_SESSION_ID = A661TBW04_SESSION_ID ;
         Z662TBW04_APP_ID = A662TBW04_APP_ID ;
         Z663TBW04_DISP_DATETIME = A663TBW04_DISP_DATETIME ;
         Z664TBW04_STUDY_ID = A664TBW04_STUDY_ID ;
         Z665TBW04_SUBJECT_ID = A665TBW04_SUBJECT_ID ;
         Z666TBW04_CRF_ID = A666TBW04_CRF_ID ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1742( ) ;
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound42 = (short)(0) ;
         initializeNonKey1742( ) ;
         sMode42 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode42 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1742( ) ;
      if ( RcdFound42 == 0 )
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
      RcdFound42 = (short)(0) ;
      /* Using cursor T00176 */
      pr_default.execute(4, new Object[] {A661TBW04_SESSION_ID, A661TBW04_SESSION_ID, A662TBW04_APP_ID, A662TBW04_APP_ID, A661TBW04_SESSION_ID, A663TBW04_DISP_DATETIME, A663TBW04_DISP_DATETIME, A662TBW04_APP_ID, A661TBW04_SESSION_ID, new Long(A664TBW04_STUDY_ID), new Long(A664TBW04_STUDY_ID), A663TBW04_DISP_DATETIME, A662TBW04_APP_ID, A661TBW04_SESSION_ID, new Integer(A665TBW04_SUBJECT_ID), new Integer(A665TBW04_SUBJECT_ID), new Long(A664TBW04_STUDY_ID), A663TBW04_DISP_DATETIME, A662TBW04_APP_ID, A661TBW04_SESSION_ID, new Short(A666TBW04_CRF_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) < 0 ) || ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00176_A662TBW04_APP_ID[0], A662TBW04_APP_ID) < 0 ) || ( GXutil.strcmp(T00176_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00176_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T00176_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00176_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00176_A664TBW04_STUDY_ID[0] < A664TBW04_STUDY_ID ) || ( T00176_A664TBW04_STUDY_ID[0] == A664TBW04_STUDY_ID ) && ( GXutil.strcmp(T00176_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00176_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00176_A665TBW04_SUBJECT_ID[0] < A665TBW04_SUBJECT_ID ) || ( T00176_A665TBW04_SUBJECT_ID[0] == A665TBW04_SUBJECT_ID ) && ( T00176_A664TBW04_STUDY_ID[0] == A664TBW04_STUDY_ID ) && ( GXutil.strcmp(T00176_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00176_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00176_A666TBW04_CRF_ID[0] < A666TBW04_CRF_ID ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) > 0 ) || ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00176_A662TBW04_APP_ID[0], A662TBW04_APP_ID) > 0 ) || ( GXutil.strcmp(T00176_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00176_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T00176_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00176_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00176_A664TBW04_STUDY_ID[0] > A664TBW04_STUDY_ID ) || ( T00176_A664TBW04_STUDY_ID[0] == A664TBW04_STUDY_ID ) && ( GXutil.strcmp(T00176_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00176_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00176_A665TBW04_SUBJECT_ID[0] > A665TBW04_SUBJECT_ID ) || ( T00176_A665TBW04_SUBJECT_ID[0] == A665TBW04_SUBJECT_ID ) && ( T00176_A664TBW04_STUDY_ID[0] == A664TBW04_STUDY_ID ) && ( GXutil.strcmp(T00176_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00176_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00176_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00176_A666TBW04_CRF_ID[0] > A666TBW04_CRF_ID ) ) )
         {
            A661TBW04_SESSION_ID = T00176_A661TBW04_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A661TBW04_SESSION_ID", A661TBW04_SESSION_ID);
            A662TBW04_APP_ID = T00176_A662TBW04_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A662TBW04_APP_ID", A662TBW04_APP_ID);
            A663TBW04_DISP_DATETIME = T00176_A663TBW04_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A663TBW04_DISP_DATETIME", A663TBW04_DISP_DATETIME);
            A664TBW04_STUDY_ID = T00176_A664TBW04_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
            A665TBW04_SUBJECT_ID = T00176_A665TBW04_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
            A666TBW04_CRF_ID = T00176_A666TBW04_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound42 = (short)(0) ;
      /* Using cursor T00177 */
      pr_default.execute(5, new Object[] {A661TBW04_SESSION_ID, A661TBW04_SESSION_ID, A662TBW04_APP_ID, A662TBW04_APP_ID, A661TBW04_SESSION_ID, A663TBW04_DISP_DATETIME, A663TBW04_DISP_DATETIME, A662TBW04_APP_ID, A661TBW04_SESSION_ID, new Long(A664TBW04_STUDY_ID), new Long(A664TBW04_STUDY_ID), A663TBW04_DISP_DATETIME, A662TBW04_APP_ID, A661TBW04_SESSION_ID, new Integer(A665TBW04_SUBJECT_ID), new Integer(A665TBW04_SUBJECT_ID), new Long(A664TBW04_STUDY_ID), A663TBW04_DISP_DATETIME, A662TBW04_APP_ID, A661TBW04_SESSION_ID, new Short(A666TBW04_CRF_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) > 0 ) || ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00177_A662TBW04_APP_ID[0], A662TBW04_APP_ID) > 0 ) || ( GXutil.strcmp(T00177_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00177_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T00177_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00177_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00177_A664TBW04_STUDY_ID[0] > A664TBW04_STUDY_ID ) || ( T00177_A664TBW04_STUDY_ID[0] == A664TBW04_STUDY_ID ) && ( GXutil.strcmp(T00177_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00177_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00177_A665TBW04_SUBJECT_ID[0] > A665TBW04_SUBJECT_ID ) || ( T00177_A665TBW04_SUBJECT_ID[0] == A665TBW04_SUBJECT_ID ) && ( T00177_A664TBW04_STUDY_ID[0] == A664TBW04_STUDY_ID ) && ( GXutil.strcmp(T00177_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00177_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00177_A666TBW04_CRF_ID[0] > A666TBW04_CRF_ID ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) < 0 ) || ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00177_A662TBW04_APP_ID[0], A662TBW04_APP_ID) < 0 ) || ( GXutil.strcmp(T00177_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00177_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T00177_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00177_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00177_A664TBW04_STUDY_ID[0] < A664TBW04_STUDY_ID ) || ( T00177_A664TBW04_STUDY_ID[0] == A664TBW04_STUDY_ID ) && ( GXutil.strcmp(T00177_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00177_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00177_A665TBW04_SUBJECT_ID[0] < A665TBW04_SUBJECT_ID ) || ( T00177_A665TBW04_SUBJECT_ID[0] == A665TBW04_SUBJECT_ID ) && ( T00177_A664TBW04_STUDY_ID[0] == A664TBW04_STUDY_ID ) && ( GXutil.strcmp(T00177_A663TBW04_DISP_DATETIME[0], A663TBW04_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00177_A662TBW04_APP_ID[0], A662TBW04_APP_ID) == 0 ) && ( GXutil.strcmp(T00177_A661TBW04_SESSION_ID[0], A661TBW04_SESSION_ID) == 0 ) && ( T00177_A666TBW04_CRF_ID[0] < A666TBW04_CRF_ID ) ) )
         {
            A661TBW04_SESSION_ID = T00177_A661TBW04_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A661TBW04_SESSION_ID", A661TBW04_SESSION_ID);
            A662TBW04_APP_ID = T00177_A662TBW04_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A662TBW04_APP_ID", A662TBW04_APP_ID);
            A663TBW04_DISP_DATETIME = T00177_A663TBW04_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A663TBW04_DISP_DATETIME", A663TBW04_DISP_DATETIME);
            A664TBW04_STUDY_ID = T00177_A664TBW04_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
            A665TBW04_SUBJECT_ID = T00177_A665TBW04_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
            A666TBW04_CRF_ID = T00177_A666TBW04_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
            RcdFound42 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1742( ) ;
      if ( RcdFound42 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBW04_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW04_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A661TBW04_SESSION_ID, Z661TBW04_SESSION_ID) != 0 ) || ( GXutil.strcmp(A662TBW04_APP_ID, Z662TBW04_APP_ID) != 0 ) || ( GXutil.strcmp(A663TBW04_DISP_DATETIME, Z663TBW04_DISP_DATETIME) != 0 ) || ( A664TBW04_STUDY_ID != Z664TBW04_STUDY_ID ) || ( A665TBW04_SUBJECT_ID != Z665TBW04_SUBJECT_ID ) || ( A666TBW04_CRF_ID != Z666TBW04_CRF_ID ) )
         {
            A661TBW04_SESSION_ID = Z661TBW04_SESSION_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A661TBW04_SESSION_ID", A661TBW04_SESSION_ID);
            A662TBW04_APP_ID = Z662TBW04_APP_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A662TBW04_APP_ID", A662TBW04_APP_ID);
            A663TBW04_DISP_DATETIME = Z663TBW04_DISP_DATETIME ;
            httpContext.ajax_rsp_assign_attri("", false, "A663TBW04_DISP_DATETIME", A663TBW04_DISP_DATETIME);
            A664TBW04_STUDY_ID = Z664TBW04_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
            A665TBW04_SUBJECT_ID = Z665TBW04_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
            A666TBW04_CRF_ID = Z666TBW04_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW04_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW04_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBW04_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update1742( ) ;
            GX_FocusControl = edtTBW04_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A661TBW04_SESSION_ID, Z661TBW04_SESSION_ID) != 0 ) || ( GXutil.strcmp(A662TBW04_APP_ID, Z662TBW04_APP_ID) != 0 ) || ( GXutil.strcmp(A663TBW04_DISP_DATETIME, Z663TBW04_DISP_DATETIME) != 0 ) || ( A664TBW04_STUDY_ID != Z664TBW04_STUDY_ID ) || ( A665TBW04_SUBJECT_ID != Z665TBW04_SUBJECT_ID ) || ( A666TBW04_CRF_ID != Z666TBW04_CRF_ID ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBW04_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert1742( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW04_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW04_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW04_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1742( ) ;
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
      if ( ( GXutil.strcmp(A661TBW04_SESSION_ID, Z661TBW04_SESSION_ID) != 0 ) || ( GXutil.strcmp(A662TBW04_APP_ID, Z662TBW04_APP_ID) != 0 ) || ( GXutil.strcmp(A663TBW04_DISP_DATETIME, Z663TBW04_DISP_DATETIME) != 0 ) || ( A664TBW04_STUDY_ID != Z664TBW04_STUDY_ID ) || ( A665TBW04_SUBJECT_ID != Z665TBW04_SUBJECT_ID ) || ( A666TBW04_CRF_ID != Z666TBW04_CRF_ID ) )
      {
         A661TBW04_SESSION_ID = Z661TBW04_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A661TBW04_SESSION_ID", A661TBW04_SESSION_ID);
         A662TBW04_APP_ID = Z662TBW04_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A662TBW04_APP_ID", A662TBW04_APP_ID);
         A663TBW04_DISP_DATETIME = Z663TBW04_DISP_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A663TBW04_DISP_DATETIME", A663TBW04_DISP_DATETIME);
         A664TBW04_STUDY_ID = Z664TBW04_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
         A665TBW04_SUBJECT_ID = Z665TBW04_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
         A666TBW04_CRF_ID = Z666TBW04_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW04_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW04_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW04_SESSION_ID_Internalname ;
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
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW04_SESSION_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBW04_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1742( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW04_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1742( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW04_CRF_LATEST_VERSION_Internalname ;
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
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW04_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1742( ) ;
      if ( RcdFound42 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound42 != 0 )
         {
            scanNext1742( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW04_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1742( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1742( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00172 */
         pr_default.execute(0, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW04_CRF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( Z667TBW04_CRF_LATEST_VERSION != T00172_A667TBW04_CRF_LATEST_VERSION[0] ) || ( Z668TBW04_CRF_INPUT_LEVEL != T00172_A668TBW04_CRF_INPUT_LEVEL[0] ) || ( GXutil.strcmp(Z669TBW04_LOCK_FLG, T00172_A669TBW04_LOCK_FLG[0]) != 0 ) || !( Z670TBW04_LOCK_DATETIME.equals( T00172_A670TBW04_LOCK_DATETIME[0] ) ) || ( GXutil.strcmp(Z671TBW04_LOCK_USER_ID, T00172_A671TBW04_LOCK_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z672TBW04_LOCK_AUTH_CD, T00172_A672TBW04_LOCK_AUTH_CD[0]) != 0 ) || !( Z673TBW04_UPLOAD_DATETIME.equals( T00172_A673TBW04_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z674TBW04_UPLOAD_USER_ID, T00172_A674TBW04_UPLOAD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z675TBW04_UPLOAD_AUTH_CD, T00172_A675TBW04_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z676TBW04_DM_ARRIVAL_FLG, T00172_A676TBW04_DM_ARRIVAL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( Z677TBW04_DM_ARRIVAL_DATETIME.equals( T00172_A677TBW04_DM_ARRIVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z678TBW04_APPROVAL_FLG, T00172_A678TBW04_APPROVAL_FLG[0]) != 0 ) || !( Z679TBW04_APPROVAL_DATETIME.equals( T00172_A679TBW04_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z680TBW04_APPROVAL_USER_ID, T00172_A680TBW04_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z681TBW04_APPROVAL_AUTH_CD, T00172_A681TBW04_APPROVAL_AUTH_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z682TBW04_INPUT_END_FLG, T00172_A682TBW04_INPUT_END_FLG[0]) != 0 ) || !( Z683TBW04_INPUT_END_DATETIME.equals( T00172_A683TBW04_INPUT_END_DATETIME[0] ) ) || ( GXutil.strcmp(Z684TBW04_INPUT_END_USER_ID, T00172_A684TBW04_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z685TBW04_INPUT_END_AUTH_CD, T00172_A685TBW04_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z686TBW04_COMPLETION_FLG, T00172_A686TBW04_COMPLETION_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z687TBW04_EDIT_FLG, T00172_A687TBW04_EDIT_FLG[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW04_CRF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1742( )
   {
      beforeValidate1742( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1742( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1742( 0) ;
         checkOptimisticConcurrency1742( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1742( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1742( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00178 */
                  pr_default.execute(6, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID), new Boolean(n667TBW04_CRF_LATEST_VERSION), new Short(A667TBW04_CRF_LATEST_VERSION), new Boolean(n668TBW04_CRF_INPUT_LEVEL), new Byte(A668TBW04_CRF_INPUT_LEVEL), new Boolean(n669TBW04_LOCK_FLG), A669TBW04_LOCK_FLG, new Boolean(n670TBW04_LOCK_DATETIME), A670TBW04_LOCK_DATETIME, new Boolean(n671TBW04_LOCK_USER_ID), A671TBW04_LOCK_USER_ID, new Boolean(n672TBW04_LOCK_AUTH_CD), A672TBW04_LOCK_AUTH_CD, new Boolean(n673TBW04_UPLOAD_DATETIME), A673TBW04_UPLOAD_DATETIME, new Boolean(n674TBW04_UPLOAD_USER_ID), A674TBW04_UPLOAD_USER_ID, new Boolean(n675TBW04_UPLOAD_AUTH_CD), A675TBW04_UPLOAD_AUTH_CD, new Boolean(n676TBW04_DM_ARRIVAL_FLG), A676TBW04_DM_ARRIVAL_FLG, new Boolean(n677TBW04_DM_ARRIVAL_DATETIME), A677TBW04_DM_ARRIVAL_DATETIME, new Boolean(n678TBW04_APPROVAL_FLG), A678TBW04_APPROVAL_FLG, new Boolean(n679TBW04_APPROVAL_DATETIME), A679TBW04_APPROVAL_DATETIME, new Boolean(n680TBW04_APPROVAL_USER_ID), A680TBW04_APPROVAL_USER_ID, new Boolean(n681TBW04_APPROVAL_AUTH_CD), A681TBW04_APPROVAL_AUTH_CD, new Boolean(n682TBW04_INPUT_END_FLG), A682TBW04_INPUT_END_FLG, new Boolean(n683TBW04_INPUT_END_DATETIME), A683TBW04_INPUT_END_DATETIME, new Boolean(n684TBW04_INPUT_END_USER_ID), A684TBW04_INPUT_END_USER_ID, new Boolean(n685TBW04_INPUT_END_AUTH_CD), A685TBW04_INPUT_END_AUTH_CD, new Boolean(n686TBW04_COMPLETION_FLG), A686TBW04_COMPLETION_FLG, new Boolean(n687TBW04_EDIT_FLG), A687TBW04_EDIT_FLG});
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
                        resetCaption170( ) ;
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
            load1742( ) ;
         }
         endLevel1742( ) ;
      }
      closeExtendedTableCursors1742( ) ;
   }

   public void update1742( )
   {
      beforeValidate1742( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1742( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1742( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1742( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1742( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00179 */
                  pr_default.execute(7, new Object[] {new Boolean(n667TBW04_CRF_LATEST_VERSION), new Short(A667TBW04_CRF_LATEST_VERSION), new Boolean(n668TBW04_CRF_INPUT_LEVEL), new Byte(A668TBW04_CRF_INPUT_LEVEL), new Boolean(n669TBW04_LOCK_FLG), A669TBW04_LOCK_FLG, new Boolean(n670TBW04_LOCK_DATETIME), A670TBW04_LOCK_DATETIME, new Boolean(n671TBW04_LOCK_USER_ID), A671TBW04_LOCK_USER_ID, new Boolean(n672TBW04_LOCK_AUTH_CD), A672TBW04_LOCK_AUTH_CD, new Boolean(n673TBW04_UPLOAD_DATETIME), A673TBW04_UPLOAD_DATETIME, new Boolean(n674TBW04_UPLOAD_USER_ID), A674TBW04_UPLOAD_USER_ID, new Boolean(n675TBW04_UPLOAD_AUTH_CD), A675TBW04_UPLOAD_AUTH_CD, new Boolean(n676TBW04_DM_ARRIVAL_FLG), A676TBW04_DM_ARRIVAL_FLG, new Boolean(n677TBW04_DM_ARRIVAL_DATETIME), A677TBW04_DM_ARRIVAL_DATETIME, new Boolean(n678TBW04_APPROVAL_FLG), A678TBW04_APPROVAL_FLG, new Boolean(n679TBW04_APPROVAL_DATETIME), A679TBW04_APPROVAL_DATETIME, new Boolean(n680TBW04_APPROVAL_USER_ID), A680TBW04_APPROVAL_USER_ID, new Boolean(n681TBW04_APPROVAL_AUTH_CD), A681TBW04_APPROVAL_AUTH_CD, new Boolean(n682TBW04_INPUT_END_FLG), A682TBW04_INPUT_END_FLG, new Boolean(n683TBW04_INPUT_END_DATETIME), A683TBW04_INPUT_END_DATETIME, new Boolean(n684TBW04_INPUT_END_USER_ID), A684TBW04_INPUT_END_USER_ID, new Boolean(n685TBW04_INPUT_END_AUTH_CD), A685TBW04_INPUT_END_AUTH_CD, new Boolean(n686TBW04_COMPLETION_FLG), A686TBW04_COMPLETION_FLG, new Boolean(n687TBW04_EDIT_FLG), A687TBW04_EDIT_FLG, A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW04_CRF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1742( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption170( ) ;
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
         endLevel1742( ) ;
      }
      closeExtendedTableCursors1742( ) ;
   }

   public void deferredUpdate1742( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1742( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1742( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1742( ) ;
         afterConfirm1742( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1742( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001710 */
               pr_default.execute(8, new Object[] {A661TBW04_SESSION_ID, A662TBW04_APP_ID, A663TBW04_DISP_DATETIME, new Long(A664TBW04_STUDY_ID), new Integer(A665TBW04_SUBJECT_ID), new Short(A666TBW04_CRF_ID)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound42 == 0 )
                     {
                        initAll1742( ) ;
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
                     resetCaption170( ) ;
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
      sMode42 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1742( ) ;
      Gx_mode = sMode42 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1742( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW04_CRF" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      }
   }

   public void endLevel1742( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1742( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw04_crf");
         if ( AnyError == 0 )
         {
            confirmValues170( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw04_crf");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1742( )
   {
      /* Using cursor T001711 */
      pr_default.execute(9);
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A661TBW04_SESSION_ID = T001711_A661TBW04_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661TBW04_SESSION_ID", A661TBW04_SESSION_ID);
         A662TBW04_APP_ID = T001711_A662TBW04_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A662TBW04_APP_ID", A662TBW04_APP_ID);
         A663TBW04_DISP_DATETIME = T001711_A663TBW04_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A663TBW04_DISP_DATETIME", A663TBW04_DISP_DATETIME);
         A664TBW04_STUDY_ID = T001711_A664TBW04_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
         A665TBW04_SUBJECT_ID = T001711_A665TBW04_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
         A666TBW04_CRF_ID = T001711_A666TBW04_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1742( )
   {
      pr_default.readNext(9);
      RcdFound42 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound42 = (short)(1) ;
         A661TBW04_SESSION_ID = T001711_A661TBW04_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661TBW04_SESSION_ID", A661TBW04_SESSION_ID);
         A662TBW04_APP_ID = T001711_A662TBW04_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A662TBW04_APP_ID", A662TBW04_APP_ID);
         A663TBW04_DISP_DATETIME = T001711_A663TBW04_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A663TBW04_DISP_DATETIME", A663TBW04_DISP_DATETIME);
         A664TBW04_STUDY_ID = T001711_A664TBW04_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
         A665TBW04_SUBJECT_ID = T001711_A665TBW04_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
         A666TBW04_CRF_ID = T001711_A666TBW04_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
      }
   }

   public void scanEnd1742( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1742( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1742( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1742( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1742( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1742( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1742( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1742( )
   {
      edtTBW04_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_SESSION_ID_Enabled, 5, 0)));
      edtTBW04_APP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_APP_ID_Enabled, 5, 0)));
      edtTBW04_DISP_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_DISP_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_DISP_DATETIME_Enabled, 5, 0)));
      edtTBW04_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_STUDY_ID_Enabled, 5, 0)));
      edtTBW04_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_SUBJECT_ID_Enabled, 5, 0)));
      edtTBW04_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_CRF_ID_Enabled, 5, 0)));
      edtTBW04_CRF_LATEST_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_CRF_LATEST_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_CRF_LATEST_VERSION_Enabled, 5, 0)));
      edtTBW04_CRF_INPUT_LEVEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_CRF_INPUT_LEVEL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_CRF_INPUT_LEVEL_Enabled, 5, 0)));
      edtTBW04_LOCK_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_LOCK_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_LOCK_FLG_Enabled, 5, 0)));
      edtTBW04_LOCK_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_LOCK_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_LOCK_DATETIME_Enabled, 5, 0)));
      edtTBW04_LOCK_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_LOCK_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_LOCK_USER_ID_Enabled, 5, 0)));
      edtTBW04_LOCK_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_LOCK_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_LOCK_AUTH_CD_Enabled, 5, 0)));
      edtTBW04_UPLOAD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_UPLOAD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_UPLOAD_DATETIME_Enabled, 5, 0)));
      edtTBW04_UPLOAD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_UPLOAD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_UPLOAD_USER_ID_Enabled, 5, 0)));
      edtTBW04_UPLOAD_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_UPLOAD_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_UPLOAD_AUTH_CD_Enabled, 5, 0)));
      edtTBW04_DM_ARRIVAL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_DM_ARRIVAL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_DM_ARRIVAL_FLG_Enabled, 5, 0)));
      edtTBW04_DM_ARRIVAL_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_DM_ARRIVAL_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_DM_ARRIVAL_DATETIME_Enabled, 5, 0)));
      edtTBW04_APPROVAL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_APPROVAL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_APPROVAL_FLG_Enabled, 5, 0)));
      edtTBW04_APPROVAL_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_APPROVAL_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_APPROVAL_DATETIME_Enabled, 5, 0)));
      edtTBW04_APPROVAL_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_APPROVAL_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_APPROVAL_USER_ID_Enabled, 5, 0)));
      edtTBW04_APPROVAL_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_APPROVAL_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_APPROVAL_AUTH_CD_Enabled, 5, 0)));
      edtTBW04_INPUT_END_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_INPUT_END_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_INPUT_END_FLG_Enabled, 5, 0)));
      edtTBW04_INPUT_END_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_INPUT_END_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_INPUT_END_DATETIME_Enabled, 5, 0)));
      edtTBW04_INPUT_END_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_INPUT_END_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_INPUT_END_USER_ID_Enabled, 5, 0)));
      edtTBW04_INPUT_END_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_INPUT_END_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_INPUT_END_AUTH_CD_Enabled, 5, 0)));
      edtTBW04_COMPLETION_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_COMPLETION_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_COMPLETION_FLG_Enabled, 5, 0)));
      edtTBW04_EDIT_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW04_EDIT_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW04_EDIT_FLG_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues170( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRFテーブルワーク") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbw04_crf") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1742( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z661TBW04_SESSION_ID", GXutil.rtrim( Z661TBW04_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z662TBW04_APP_ID", GXutil.rtrim( Z662TBW04_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z663TBW04_DISP_DATETIME", GXutil.rtrim( Z663TBW04_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "Z664TBW04_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z664TBW04_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z665TBW04_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z665TBW04_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z666TBW04_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z666TBW04_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z667TBW04_CRF_LATEST_VERSION", GXutil.ltrim( localUtil.ntoc( Z667TBW04_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z668TBW04_CRF_INPUT_LEVEL", GXutil.ltrim( localUtil.ntoc( Z668TBW04_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z669TBW04_LOCK_FLG", GXutil.rtrim( Z669TBW04_LOCK_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z670TBW04_LOCK_DATETIME", localUtil.ttoc( Z670TBW04_LOCK_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z671TBW04_LOCK_USER_ID", GXutil.rtrim( Z671TBW04_LOCK_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z672TBW04_LOCK_AUTH_CD", GXutil.rtrim( Z672TBW04_LOCK_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z673TBW04_UPLOAD_DATETIME", localUtil.ttoc( Z673TBW04_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z674TBW04_UPLOAD_USER_ID", GXutil.rtrim( Z674TBW04_UPLOAD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z675TBW04_UPLOAD_AUTH_CD", GXutil.rtrim( Z675TBW04_UPLOAD_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z676TBW04_DM_ARRIVAL_FLG", GXutil.rtrim( Z676TBW04_DM_ARRIVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z677TBW04_DM_ARRIVAL_DATETIME", localUtil.ttoc( Z677TBW04_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z678TBW04_APPROVAL_FLG", GXutil.rtrim( Z678TBW04_APPROVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z679TBW04_APPROVAL_DATETIME", localUtil.ttoc( Z679TBW04_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z680TBW04_APPROVAL_USER_ID", GXutil.rtrim( Z680TBW04_APPROVAL_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z681TBW04_APPROVAL_AUTH_CD", GXutil.rtrim( Z681TBW04_APPROVAL_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z682TBW04_INPUT_END_FLG", GXutil.rtrim( Z682TBW04_INPUT_END_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z683TBW04_INPUT_END_DATETIME", localUtil.ttoc( Z683TBW04_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z684TBW04_INPUT_END_USER_ID", GXutil.rtrim( Z684TBW04_INPUT_END_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z685TBW04_INPUT_END_AUTH_CD", GXutil.rtrim( Z685TBW04_INPUT_END_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z686TBW04_COMPLETION_FLG", GXutil.rtrim( Z686TBW04_COMPLETION_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z687TBW04_EDIT_FLG", GXutil.rtrim( Z687TBW04_EDIT_FLG));
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

   public void initializeNonKey1742( )
   {
      A667TBW04_CRF_LATEST_VERSION = (short)(0) ;
      n667TBW04_CRF_LATEST_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A667TBW04_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A667TBW04_CRF_LATEST_VERSION, 4, 0)));
      n667TBW04_CRF_LATEST_VERSION = ((0==A667TBW04_CRF_LATEST_VERSION) ? true : false) ;
      A668TBW04_CRF_INPUT_LEVEL = (byte)(0) ;
      n668TBW04_CRF_INPUT_LEVEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A668TBW04_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A668TBW04_CRF_INPUT_LEVEL, 2, 0)));
      n668TBW04_CRF_INPUT_LEVEL = ((0==A668TBW04_CRF_INPUT_LEVEL) ? true : false) ;
      A669TBW04_LOCK_FLG = "" ;
      n669TBW04_LOCK_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A669TBW04_LOCK_FLG", A669TBW04_LOCK_FLG);
      n669TBW04_LOCK_FLG = ((GXutil.strcmp("", A669TBW04_LOCK_FLG)==0) ? true : false) ;
      A670TBW04_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n670TBW04_LOCK_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A670TBW04_LOCK_DATETIME", localUtil.ttoc( A670TBW04_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n670TBW04_LOCK_DATETIME = (GXutil.nullDate().equals(A670TBW04_LOCK_DATETIME) ? true : false) ;
      A671TBW04_LOCK_USER_ID = "" ;
      n671TBW04_LOCK_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A671TBW04_LOCK_USER_ID", A671TBW04_LOCK_USER_ID);
      n671TBW04_LOCK_USER_ID = ((GXutil.strcmp("", A671TBW04_LOCK_USER_ID)==0) ? true : false) ;
      A672TBW04_LOCK_AUTH_CD = "" ;
      n672TBW04_LOCK_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A672TBW04_LOCK_AUTH_CD", A672TBW04_LOCK_AUTH_CD);
      n672TBW04_LOCK_AUTH_CD = ((GXutil.strcmp("", A672TBW04_LOCK_AUTH_CD)==0) ? true : false) ;
      A673TBW04_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n673TBW04_UPLOAD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A673TBW04_UPLOAD_DATETIME", localUtil.ttoc( A673TBW04_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n673TBW04_UPLOAD_DATETIME = (GXutil.nullDate().equals(A673TBW04_UPLOAD_DATETIME) ? true : false) ;
      A674TBW04_UPLOAD_USER_ID = "" ;
      n674TBW04_UPLOAD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A674TBW04_UPLOAD_USER_ID", A674TBW04_UPLOAD_USER_ID);
      n674TBW04_UPLOAD_USER_ID = ((GXutil.strcmp("", A674TBW04_UPLOAD_USER_ID)==0) ? true : false) ;
      A675TBW04_UPLOAD_AUTH_CD = "" ;
      n675TBW04_UPLOAD_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A675TBW04_UPLOAD_AUTH_CD", A675TBW04_UPLOAD_AUTH_CD);
      n675TBW04_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A675TBW04_UPLOAD_AUTH_CD)==0) ? true : false) ;
      A676TBW04_DM_ARRIVAL_FLG = "" ;
      n676TBW04_DM_ARRIVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A676TBW04_DM_ARRIVAL_FLG", A676TBW04_DM_ARRIVAL_FLG);
      n676TBW04_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A676TBW04_DM_ARRIVAL_FLG)==0) ? true : false) ;
      A677TBW04_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n677TBW04_DM_ARRIVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A677TBW04_DM_ARRIVAL_DATETIME", localUtil.ttoc( A677TBW04_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n677TBW04_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A677TBW04_DM_ARRIVAL_DATETIME) ? true : false) ;
      A678TBW04_APPROVAL_FLG = "" ;
      n678TBW04_APPROVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A678TBW04_APPROVAL_FLG", A678TBW04_APPROVAL_FLG);
      n678TBW04_APPROVAL_FLG = ((GXutil.strcmp("", A678TBW04_APPROVAL_FLG)==0) ? true : false) ;
      A679TBW04_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n679TBW04_APPROVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A679TBW04_APPROVAL_DATETIME", localUtil.ttoc( A679TBW04_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n679TBW04_APPROVAL_DATETIME = (GXutil.nullDate().equals(A679TBW04_APPROVAL_DATETIME) ? true : false) ;
      A680TBW04_APPROVAL_USER_ID = "" ;
      n680TBW04_APPROVAL_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A680TBW04_APPROVAL_USER_ID", A680TBW04_APPROVAL_USER_ID);
      n680TBW04_APPROVAL_USER_ID = ((GXutil.strcmp("", A680TBW04_APPROVAL_USER_ID)==0) ? true : false) ;
      A681TBW04_APPROVAL_AUTH_CD = "" ;
      n681TBW04_APPROVAL_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A681TBW04_APPROVAL_AUTH_CD", A681TBW04_APPROVAL_AUTH_CD);
      n681TBW04_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A681TBW04_APPROVAL_AUTH_CD)==0) ? true : false) ;
      A682TBW04_INPUT_END_FLG = "" ;
      n682TBW04_INPUT_END_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A682TBW04_INPUT_END_FLG", A682TBW04_INPUT_END_FLG);
      n682TBW04_INPUT_END_FLG = ((GXutil.strcmp("", A682TBW04_INPUT_END_FLG)==0) ? true : false) ;
      A683TBW04_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n683TBW04_INPUT_END_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A683TBW04_INPUT_END_DATETIME", localUtil.ttoc( A683TBW04_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n683TBW04_INPUT_END_DATETIME = (GXutil.nullDate().equals(A683TBW04_INPUT_END_DATETIME) ? true : false) ;
      A684TBW04_INPUT_END_USER_ID = "" ;
      n684TBW04_INPUT_END_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A684TBW04_INPUT_END_USER_ID", A684TBW04_INPUT_END_USER_ID);
      n684TBW04_INPUT_END_USER_ID = ((GXutil.strcmp("", A684TBW04_INPUT_END_USER_ID)==0) ? true : false) ;
      A685TBW04_INPUT_END_AUTH_CD = "" ;
      n685TBW04_INPUT_END_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A685TBW04_INPUT_END_AUTH_CD", A685TBW04_INPUT_END_AUTH_CD);
      n685TBW04_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A685TBW04_INPUT_END_AUTH_CD)==0) ? true : false) ;
      A686TBW04_COMPLETION_FLG = "" ;
      n686TBW04_COMPLETION_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A686TBW04_COMPLETION_FLG", A686TBW04_COMPLETION_FLG);
      n686TBW04_COMPLETION_FLG = ((GXutil.strcmp("", A686TBW04_COMPLETION_FLG)==0) ? true : false) ;
      A687TBW04_EDIT_FLG = "" ;
      n687TBW04_EDIT_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A687TBW04_EDIT_FLG", A687TBW04_EDIT_FLG);
      n687TBW04_EDIT_FLG = ((GXutil.strcmp("", A687TBW04_EDIT_FLG)==0) ? true : false) ;
   }

   public void initAll1742( )
   {
      A661TBW04_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A661TBW04_SESSION_ID", A661TBW04_SESSION_ID);
      A662TBW04_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A662TBW04_APP_ID", A662TBW04_APP_ID);
      A663TBW04_DISP_DATETIME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A663TBW04_DISP_DATETIME", A663TBW04_DISP_DATETIME);
      A664TBW04_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A664TBW04_STUDY_ID", GXutil.ltrim( GXutil.str( A664TBW04_STUDY_ID, 10, 0)));
      A665TBW04_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A665TBW04_SUBJECT_ID", GXutil.ltrim( GXutil.str( A665TBW04_SUBJECT_ID, 6, 0)));
      A666TBW04_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A666TBW04_CRF_ID", GXutil.ltrim( GXutil.str( A666TBW04_CRF_ID, 4, 0)));
      initializeNonKey1742( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1457085");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbw04_crf.js", "?1457085");
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
      lblTextblocktbw04_session_id_Internalname = "TEXTBLOCKTBW04_SESSION_ID" ;
      edtTBW04_SESSION_ID_Internalname = "TBW04_SESSION_ID" ;
      lblTextblocktbw04_app_id_Internalname = "TEXTBLOCKTBW04_APP_ID" ;
      edtTBW04_APP_ID_Internalname = "TBW04_APP_ID" ;
      lblTextblocktbw04_disp_datetime_Internalname = "TEXTBLOCKTBW04_DISP_DATETIME" ;
      edtTBW04_DISP_DATETIME_Internalname = "TBW04_DISP_DATETIME" ;
      lblTextblocktbw04_study_id_Internalname = "TEXTBLOCKTBW04_STUDY_ID" ;
      edtTBW04_STUDY_ID_Internalname = "TBW04_STUDY_ID" ;
      lblTextblocktbw04_subject_id_Internalname = "TEXTBLOCKTBW04_SUBJECT_ID" ;
      edtTBW04_SUBJECT_ID_Internalname = "TBW04_SUBJECT_ID" ;
      lblTextblocktbw04_crf_id_Internalname = "TEXTBLOCKTBW04_CRF_ID" ;
      edtTBW04_CRF_ID_Internalname = "TBW04_CRF_ID" ;
      lblTextblocktbw04_crf_latest_version_Internalname = "TEXTBLOCKTBW04_CRF_LATEST_VERSION" ;
      edtTBW04_CRF_LATEST_VERSION_Internalname = "TBW04_CRF_LATEST_VERSION" ;
      lblTextblocktbw04_crf_input_level_Internalname = "TEXTBLOCKTBW04_CRF_INPUT_LEVEL" ;
      edtTBW04_CRF_INPUT_LEVEL_Internalname = "TBW04_CRF_INPUT_LEVEL" ;
      lblTextblocktbw04_lock_flg_Internalname = "TEXTBLOCKTBW04_LOCK_FLG" ;
      edtTBW04_LOCK_FLG_Internalname = "TBW04_LOCK_FLG" ;
      lblTextblocktbw04_lock_datetime_Internalname = "TEXTBLOCKTBW04_LOCK_DATETIME" ;
      edtTBW04_LOCK_DATETIME_Internalname = "TBW04_LOCK_DATETIME" ;
      lblTextblocktbw04_lock_user_id_Internalname = "TEXTBLOCKTBW04_LOCK_USER_ID" ;
      edtTBW04_LOCK_USER_ID_Internalname = "TBW04_LOCK_USER_ID" ;
      lblTextblocktbw04_lock_auth_cd_Internalname = "TEXTBLOCKTBW04_LOCK_AUTH_CD" ;
      edtTBW04_LOCK_AUTH_CD_Internalname = "TBW04_LOCK_AUTH_CD" ;
      lblTextblocktbw04_upload_datetime_Internalname = "TEXTBLOCKTBW04_UPLOAD_DATETIME" ;
      edtTBW04_UPLOAD_DATETIME_Internalname = "TBW04_UPLOAD_DATETIME" ;
      lblTextblocktbw04_upload_user_id_Internalname = "TEXTBLOCKTBW04_UPLOAD_USER_ID" ;
      edtTBW04_UPLOAD_USER_ID_Internalname = "TBW04_UPLOAD_USER_ID" ;
      lblTextblocktbw04_upload_auth_cd_Internalname = "TEXTBLOCKTBW04_UPLOAD_AUTH_CD" ;
      edtTBW04_UPLOAD_AUTH_CD_Internalname = "TBW04_UPLOAD_AUTH_CD" ;
      lblTextblocktbw04_dm_arrival_flg_Internalname = "TEXTBLOCKTBW04_DM_ARRIVAL_FLG" ;
      edtTBW04_DM_ARRIVAL_FLG_Internalname = "TBW04_DM_ARRIVAL_FLG" ;
      lblTextblocktbw04_dm_arrival_datetime_Internalname = "TEXTBLOCKTBW04_DM_ARRIVAL_DATETIME" ;
      edtTBW04_DM_ARRIVAL_DATETIME_Internalname = "TBW04_DM_ARRIVAL_DATETIME" ;
      lblTextblocktbw04_approval_flg_Internalname = "TEXTBLOCKTBW04_APPROVAL_FLG" ;
      edtTBW04_APPROVAL_FLG_Internalname = "TBW04_APPROVAL_FLG" ;
      lblTextblocktbw04_approval_datetime_Internalname = "TEXTBLOCKTBW04_APPROVAL_DATETIME" ;
      edtTBW04_APPROVAL_DATETIME_Internalname = "TBW04_APPROVAL_DATETIME" ;
      lblTextblocktbw04_approval_user_id_Internalname = "TEXTBLOCKTBW04_APPROVAL_USER_ID" ;
      edtTBW04_APPROVAL_USER_ID_Internalname = "TBW04_APPROVAL_USER_ID" ;
      lblTextblocktbw04_approval_auth_cd_Internalname = "TEXTBLOCKTBW04_APPROVAL_AUTH_CD" ;
      edtTBW04_APPROVAL_AUTH_CD_Internalname = "TBW04_APPROVAL_AUTH_CD" ;
      lblTextblocktbw04_input_end_flg_Internalname = "TEXTBLOCKTBW04_INPUT_END_FLG" ;
      edtTBW04_INPUT_END_FLG_Internalname = "TBW04_INPUT_END_FLG" ;
      lblTextblocktbw04_input_end_datetime_Internalname = "TEXTBLOCKTBW04_INPUT_END_DATETIME" ;
      edtTBW04_INPUT_END_DATETIME_Internalname = "TBW04_INPUT_END_DATETIME" ;
      lblTextblocktbw04_input_end_user_id_Internalname = "TEXTBLOCKTBW04_INPUT_END_USER_ID" ;
      edtTBW04_INPUT_END_USER_ID_Internalname = "TBW04_INPUT_END_USER_ID" ;
      lblTextblocktbw04_input_end_auth_cd_Internalname = "TEXTBLOCKTBW04_INPUT_END_AUTH_CD" ;
      edtTBW04_INPUT_END_AUTH_CD_Internalname = "TBW04_INPUT_END_AUTH_CD" ;
      lblTextblocktbw04_completion_flg_Internalname = "TEXTBLOCKTBW04_COMPLETION_FLG" ;
      edtTBW04_COMPLETION_FLG_Internalname = "TBW04_COMPLETION_FLG" ;
      lblTextblocktbw04_edit_flg_Internalname = "TEXTBLOCKTBW04_EDIT_FLG" ;
      edtTBW04_EDIT_FLG_Internalname = "TBW04_EDIT_FLG" ;
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
      edtTBW04_EDIT_FLG_Jsonclick = "" ;
      edtTBW04_EDIT_FLG_Enabled = 1 ;
      edtTBW04_COMPLETION_FLG_Jsonclick = "" ;
      edtTBW04_COMPLETION_FLG_Enabled = 1 ;
      edtTBW04_INPUT_END_AUTH_CD_Jsonclick = "" ;
      edtTBW04_INPUT_END_AUTH_CD_Enabled = 1 ;
      edtTBW04_INPUT_END_USER_ID_Jsonclick = "" ;
      edtTBW04_INPUT_END_USER_ID_Enabled = 1 ;
      edtTBW04_INPUT_END_DATETIME_Jsonclick = "" ;
      edtTBW04_INPUT_END_DATETIME_Enabled = 1 ;
      edtTBW04_INPUT_END_FLG_Jsonclick = "" ;
      edtTBW04_INPUT_END_FLG_Enabled = 1 ;
      edtTBW04_APPROVAL_AUTH_CD_Jsonclick = "" ;
      edtTBW04_APPROVAL_AUTH_CD_Enabled = 1 ;
      edtTBW04_APPROVAL_USER_ID_Jsonclick = "" ;
      edtTBW04_APPROVAL_USER_ID_Enabled = 1 ;
      edtTBW04_APPROVAL_DATETIME_Jsonclick = "" ;
      edtTBW04_APPROVAL_DATETIME_Enabled = 1 ;
      edtTBW04_APPROVAL_FLG_Jsonclick = "" ;
      edtTBW04_APPROVAL_FLG_Enabled = 1 ;
      edtTBW04_DM_ARRIVAL_DATETIME_Jsonclick = "" ;
      edtTBW04_DM_ARRIVAL_DATETIME_Enabled = 1 ;
      edtTBW04_DM_ARRIVAL_FLG_Jsonclick = "" ;
      edtTBW04_DM_ARRIVAL_FLG_Enabled = 1 ;
      edtTBW04_UPLOAD_AUTH_CD_Jsonclick = "" ;
      edtTBW04_UPLOAD_AUTH_CD_Enabled = 1 ;
      edtTBW04_UPLOAD_USER_ID_Jsonclick = "" ;
      edtTBW04_UPLOAD_USER_ID_Enabled = 1 ;
      edtTBW04_UPLOAD_DATETIME_Jsonclick = "" ;
      edtTBW04_UPLOAD_DATETIME_Enabled = 1 ;
      edtTBW04_LOCK_AUTH_CD_Jsonclick = "" ;
      edtTBW04_LOCK_AUTH_CD_Enabled = 1 ;
      edtTBW04_LOCK_USER_ID_Jsonclick = "" ;
      edtTBW04_LOCK_USER_ID_Enabled = 1 ;
      edtTBW04_LOCK_DATETIME_Jsonclick = "" ;
      edtTBW04_LOCK_DATETIME_Enabled = 1 ;
      edtTBW04_LOCK_FLG_Jsonclick = "" ;
      edtTBW04_LOCK_FLG_Enabled = 1 ;
      edtTBW04_CRF_INPUT_LEVEL_Jsonclick = "" ;
      edtTBW04_CRF_INPUT_LEVEL_Enabled = 1 ;
      edtTBW04_CRF_LATEST_VERSION_Jsonclick = "" ;
      edtTBW04_CRF_LATEST_VERSION_Enabled = 1 ;
      edtTBW04_CRF_ID_Jsonclick = "" ;
      edtTBW04_CRF_ID_Enabled = 1 ;
      edtTBW04_SUBJECT_ID_Jsonclick = "" ;
      edtTBW04_SUBJECT_ID_Enabled = 1 ;
      edtTBW04_STUDY_ID_Jsonclick = "" ;
      edtTBW04_STUDY_ID_Enabled = 1 ;
      edtTBW04_DISP_DATETIME_Jsonclick = "" ;
      edtTBW04_DISP_DATETIME_Enabled = 1 ;
      edtTBW04_APP_ID_Jsonclick = "" ;
      edtTBW04_APP_ID_Enabled = 1 ;
      edtTBW04_SESSION_ID_Jsonclick = "" ;
      edtTBW04_SESSION_ID_Enabled = 1 ;
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
      GX_FocusControl = edtTBW04_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw04_crf_id( String GX_Parm1 ,
                                   String GX_Parm2 ,
                                   String GX_Parm3 ,
                                   long GX_Parm4 ,
                                   int GX_Parm5 ,
                                   short GX_Parm6 ,
                                   short GX_Parm7 ,
                                   byte GX_Parm8 ,
                                   String GX_Parm9 ,
                                   java.util.Date GX_Parm10 ,
                                   String GX_Parm11 ,
                                   String GX_Parm12 ,
                                   java.util.Date GX_Parm13 ,
                                   String GX_Parm14 ,
                                   String GX_Parm15 ,
                                   String GX_Parm16 ,
                                   java.util.Date GX_Parm17 ,
                                   String GX_Parm18 ,
                                   java.util.Date GX_Parm19 ,
                                   String GX_Parm20 ,
                                   String GX_Parm21 ,
                                   String GX_Parm22 ,
                                   java.util.Date GX_Parm23 ,
                                   String GX_Parm24 ,
                                   String GX_Parm25 ,
                                   String GX_Parm26 ,
                                   String GX_Parm27 )
   {
      A661TBW04_SESSION_ID = GX_Parm1 ;
      A662TBW04_APP_ID = GX_Parm2 ;
      A663TBW04_DISP_DATETIME = GX_Parm3 ;
      A664TBW04_STUDY_ID = GX_Parm4 ;
      A665TBW04_SUBJECT_ID = GX_Parm5 ;
      A666TBW04_CRF_ID = GX_Parm6 ;
      A667TBW04_CRF_LATEST_VERSION = GX_Parm7 ;
      n667TBW04_CRF_LATEST_VERSION = false ;
      A668TBW04_CRF_INPUT_LEVEL = GX_Parm8 ;
      n668TBW04_CRF_INPUT_LEVEL = false ;
      A669TBW04_LOCK_FLG = GX_Parm9 ;
      n669TBW04_LOCK_FLG = false ;
      A670TBW04_LOCK_DATETIME = GX_Parm10 ;
      n670TBW04_LOCK_DATETIME = false ;
      A671TBW04_LOCK_USER_ID = GX_Parm11 ;
      n671TBW04_LOCK_USER_ID = false ;
      A672TBW04_LOCK_AUTH_CD = GX_Parm12 ;
      n672TBW04_LOCK_AUTH_CD = false ;
      A673TBW04_UPLOAD_DATETIME = GX_Parm13 ;
      n673TBW04_UPLOAD_DATETIME = false ;
      A674TBW04_UPLOAD_USER_ID = GX_Parm14 ;
      n674TBW04_UPLOAD_USER_ID = false ;
      A675TBW04_UPLOAD_AUTH_CD = GX_Parm15 ;
      n675TBW04_UPLOAD_AUTH_CD = false ;
      A676TBW04_DM_ARRIVAL_FLG = GX_Parm16 ;
      n676TBW04_DM_ARRIVAL_FLG = false ;
      A677TBW04_DM_ARRIVAL_DATETIME = GX_Parm17 ;
      n677TBW04_DM_ARRIVAL_DATETIME = false ;
      A678TBW04_APPROVAL_FLG = GX_Parm18 ;
      n678TBW04_APPROVAL_FLG = false ;
      A679TBW04_APPROVAL_DATETIME = GX_Parm19 ;
      n679TBW04_APPROVAL_DATETIME = false ;
      A680TBW04_APPROVAL_USER_ID = GX_Parm20 ;
      n680TBW04_APPROVAL_USER_ID = false ;
      A681TBW04_APPROVAL_AUTH_CD = GX_Parm21 ;
      n681TBW04_APPROVAL_AUTH_CD = false ;
      A682TBW04_INPUT_END_FLG = GX_Parm22 ;
      n682TBW04_INPUT_END_FLG = false ;
      A683TBW04_INPUT_END_DATETIME = GX_Parm23 ;
      n683TBW04_INPUT_END_DATETIME = false ;
      A684TBW04_INPUT_END_USER_ID = GX_Parm24 ;
      n684TBW04_INPUT_END_USER_ID = false ;
      A685TBW04_INPUT_END_AUTH_CD = GX_Parm25 ;
      n685TBW04_INPUT_END_AUTH_CD = false ;
      A686TBW04_COMPLETION_FLG = GX_Parm26 ;
      n686TBW04_COMPLETION_FLG = false ;
      A687TBW04_EDIT_FLG = GX_Parm27 ;
      n687TBW04_EDIT_FLG = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A667TBW04_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A668TBW04_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A669TBW04_LOCK_FLG));
      isValidOutput.add(localUtil.format(A670TBW04_LOCK_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A671TBW04_LOCK_USER_ID));
      isValidOutput.add(GXutil.rtrim( A672TBW04_LOCK_AUTH_CD));
      isValidOutput.add(localUtil.format(A673TBW04_UPLOAD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A674TBW04_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A675TBW04_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A676TBW04_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.format(A677TBW04_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A678TBW04_APPROVAL_FLG));
      isValidOutput.add(localUtil.format(A679TBW04_APPROVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A680TBW04_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( A681TBW04_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A682TBW04_INPUT_END_FLG));
      isValidOutput.add(localUtil.format(A683TBW04_INPUT_END_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A684TBW04_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( A685TBW04_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A686TBW04_COMPLETION_FLG));
      isValidOutput.add(GXutil.rtrim( A687TBW04_EDIT_FLG));
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z661TBW04_SESSION_ID));
      isValidOutput.add(GXutil.rtrim( Z662TBW04_APP_ID));
      isValidOutput.add(GXutil.rtrim( Z663TBW04_DISP_DATETIME));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z664TBW04_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z665TBW04_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z666TBW04_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z667TBW04_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z668TBW04_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z669TBW04_LOCK_FLG));
      isValidOutput.add(localUtil.ttoc( Z670TBW04_LOCK_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z671TBW04_LOCK_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z672TBW04_LOCK_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z673TBW04_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z674TBW04_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z675TBW04_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z676TBW04_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z677TBW04_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z678TBW04_APPROVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z679TBW04_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z680TBW04_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z681TBW04_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z682TBW04_INPUT_END_FLG));
      isValidOutput.add(localUtil.ttoc( Z683TBW04_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z684TBW04_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z685TBW04_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z686TBW04_COMPLETION_FLG));
      isValidOutput.add(GXutil.rtrim( Z687TBW04_EDIT_FLG));
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
      lblTextblocktbw04_session_id_Jsonclick = "" ;
      A661TBW04_SESSION_ID = "" ;
      lblTextblocktbw04_app_id_Jsonclick = "" ;
      A662TBW04_APP_ID = "" ;
      lblTextblocktbw04_disp_datetime_Jsonclick = "" ;
      A663TBW04_DISP_DATETIME = "" ;
      lblTextblocktbw04_study_id_Jsonclick = "" ;
      lblTextblocktbw04_subject_id_Jsonclick = "" ;
      lblTextblocktbw04_crf_id_Jsonclick = "" ;
      lblTextblocktbw04_crf_latest_version_Jsonclick = "" ;
      lblTextblocktbw04_crf_input_level_Jsonclick = "" ;
      lblTextblocktbw04_lock_flg_Jsonclick = "" ;
      A669TBW04_LOCK_FLG = "" ;
      lblTextblocktbw04_lock_datetime_Jsonclick = "" ;
      A670TBW04_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw04_lock_user_id_Jsonclick = "" ;
      A671TBW04_LOCK_USER_ID = "" ;
      lblTextblocktbw04_lock_auth_cd_Jsonclick = "" ;
      A672TBW04_LOCK_AUTH_CD = "" ;
      lblTextblocktbw04_upload_datetime_Jsonclick = "" ;
      A673TBW04_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw04_upload_user_id_Jsonclick = "" ;
      A674TBW04_UPLOAD_USER_ID = "" ;
      lblTextblocktbw04_upload_auth_cd_Jsonclick = "" ;
      A675TBW04_UPLOAD_AUTH_CD = "" ;
      lblTextblocktbw04_dm_arrival_flg_Jsonclick = "" ;
      A676TBW04_DM_ARRIVAL_FLG = "" ;
      lblTextblocktbw04_dm_arrival_datetime_Jsonclick = "" ;
      A677TBW04_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw04_approval_flg_Jsonclick = "" ;
      A678TBW04_APPROVAL_FLG = "" ;
      lblTextblocktbw04_approval_datetime_Jsonclick = "" ;
      A679TBW04_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw04_approval_user_id_Jsonclick = "" ;
      A680TBW04_APPROVAL_USER_ID = "" ;
      lblTextblocktbw04_approval_auth_cd_Jsonclick = "" ;
      A681TBW04_APPROVAL_AUTH_CD = "" ;
      lblTextblocktbw04_input_end_flg_Jsonclick = "" ;
      A682TBW04_INPUT_END_FLG = "" ;
      lblTextblocktbw04_input_end_datetime_Jsonclick = "" ;
      A683TBW04_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw04_input_end_user_id_Jsonclick = "" ;
      A684TBW04_INPUT_END_USER_ID = "" ;
      lblTextblocktbw04_input_end_auth_cd_Jsonclick = "" ;
      A685TBW04_INPUT_END_AUTH_CD = "" ;
      lblTextblocktbw04_completion_flg_Jsonclick = "" ;
      A686TBW04_COMPLETION_FLG = "" ;
      lblTextblocktbw04_edit_flg_Jsonclick = "" ;
      A687TBW04_EDIT_FLG = "" ;
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
      Z661TBW04_SESSION_ID = "" ;
      Z662TBW04_APP_ID = "" ;
      Z663TBW04_DISP_DATETIME = "" ;
      Z669TBW04_LOCK_FLG = "" ;
      Z670TBW04_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z671TBW04_LOCK_USER_ID = "" ;
      Z672TBW04_LOCK_AUTH_CD = "" ;
      Z673TBW04_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z674TBW04_UPLOAD_USER_ID = "" ;
      Z675TBW04_UPLOAD_AUTH_CD = "" ;
      Z676TBW04_DM_ARRIVAL_FLG = "" ;
      Z677TBW04_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z678TBW04_APPROVAL_FLG = "" ;
      Z679TBW04_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z680TBW04_APPROVAL_USER_ID = "" ;
      Z681TBW04_APPROVAL_AUTH_CD = "" ;
      Z682TBW04_INPUT_END_FLG = "" ;
      Z683TBW04_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z684TBW04_INPUT_END_USER_ID = "" ;
      Z685TBW04_INPUT_END_AUTH_CD = "" ;
      Z686TBW04_COMPLETION_FLG = "" ;
      Z687TBW04_EDIT_FLG = "" ;
      Gx_mode = "" ;
      AV8Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T00174_A661TBW04_SESSION_ID = new String[] {""} ;
      T00174_A662TBW04_APP_ID = new String[] {""} ;
      T00174_A663TBW04_DISP_DATETIME = new String[] {""} ;
      T00174_A664TBW04_STUDY_ID = new long[1] ;
      T00174_A665TBW04_SUBJECT_ID = new int[1] ;
      T00174_A666TBW04_CRF_ID = new short[1] ;
      T00174_A667TBW04_CRF_LATEST_VERSION = new short[1] ;
      T00174_n667TBW04_CRF_LATEST_VERSION = new boolean[] {false} ;
      T00174_A668TBW04_CRF_INPUT_LEVEL = new byte[1] ;
      T00174_n668TBW04_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T00174_A669TBW04_LOCK_FLG = new String[] {""} ;
      T00174_n669TBW04_LOCK_FLG = new boolean[] {false} ;
      T00174_A670TBW04_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00174_n670TBW04_LOCK_DATETIME = new boolean[] {false} ;
      T00174_A671TBW04_LOCK_USER_ID = new String[] {""} ;
      T00174_n671TBW04_LOCK_USER_ID = new boolean[] {false} ;
      T00174_A672TBW04_LOCK_AUTH_CD = new String[] {""} ;
      T00174_n672TBW04_LOCK_AUTH_CD = new boolean[] {false} ;
      T00174_A673TBW04_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00174_n673TBW04_UPLOAD_DATETIME = new boolean[] {false} ;
      T00174_A674TBW04_UPLOAD_USER_ID = new String[] {""} ;
      T00174_n674TBW04_UPLOAD_USER_ID = new boolean[] {false} ;
      T00174_A675TBW04_UPLOAD_AUTH_CD = new String[] {""} ;
      T00174_n675TBW04_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T00174_A676TBW04_DM_ARRIVAL_FLG = new String[] {""} ;
      T00174_n676TBW04_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T00174_A677TBW04_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00174_n677TBW04_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T00174_A678TBW04_APPROVAL_FLG = new String[] {""} ;
      T00174_n678TBW04_APPROVAL_FLG = new boolean[] {false} ;
      T00174_A679TBW04_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00174_n679TBW04_APPROVAL_DATETIME = new boolean[] {false} ;
      T00174_A680TBW04_APPROVAL_USER_ID = new String[] {""} ;
      T00174_n680TBW04_APPROVAL_USER_ID = new boolean[] {false} ;
      T00174_A681TBW04_APPROVAL_AUTH_CD = new String[] {""} ;
      T00174_n681TBW04_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T00174_A682TBW04_INPUT_END_FLG = new String[] {""} ;
      T00174_n682TBW04_INPUT_END_FLG = new boolean[] {false} ;
      T00174_A683TBW04_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00174_n683TBW04_INPUT_END_DATETIME = new boolean[] {false} ;
      T00174_A684TBW04_INPUT_END_USER_ID = new String[] {""} ;
      T00174_n684TBW04_INPUT_END_USER_ID = new boolean[] {false} ;
      T00174_A685TBW04_INPUT_END_AUTH_CD = new String[] {""} ;
      T00174_n685TBW04_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T00174_A686TBW04_COMPLETION_FLG = new String[] {""} ;
      T00174_n686TBW04_COMPLETION_FLG = new boolean[] {false} ;
      T00174_A687TBW04_EDIT_FLG = new String[] {""} ;
      T00174_n687TBW04_EDIT_FLG = new boolean[] {false} ;
      T00175_A661TBW04_SESSION_ID = new String[] {""} ;
      T00175_A662TBW04_APP_ID = new String[] {""} ;
      T00175_A663TBW04_DISP_DATETIME = new String[] {""} ;
      T00175_A664TBW04_STUDY_ID = new long[1] ;
      T00175_A665TBW04_SUBJECT_ID = new int[1] ;
      T00175_A666TBW04_CRF_ID = new short[1] ;
      T00173_A661TBW04_SESSION_ID = new String[] {""} ;
      T00173_A662TBW04_APP_ID = new String[] {""} ;
      T00173_A663TBW04_DISP_DATETIME = new String[] {""} ;
      T00173_A664TBW04_STUDY_ID = new long[1] ;
      T00173_A665TBW04_SUBJECT_ID = new int[1] ;
      T00173_A666TBW04_CRF_ID = new short[1] ;
      T00173_A667TBW04_CRF_LATEST_VERSION = new short[1] ;
      T00173_n667TBW04_CRF_LATEST_VERSION = new boolean[] {false} ;
      T00173_A668TBW04_CRF_INPUT_LEVEL = new byte[1] ;
      T00173_n668TBW04_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T00173_A669TBW04_LOCK_FLG = new String[] {""} ;
      T00173_n669TBW04_LOCK_FLG = new boolean[] {false} ;
      T00173_A670TBW04_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00173_n670TBW04_LOCK_DATETIME = new boolean[] {false} ;
      T00173_A671TBW04_LOCK_USER_ID = new String[] {""} ;
      T00173_n671TBW04_LOCK_USER_ID = new boolean[] {false} ;
      T00173_A672TBW04_LOCK_AUTH_CD = new String[] {""} ;
      T00173_n672TBW04_LOCK_AUTH_CD = new boolean[] {false} ;
      T00173_A673TBW04_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00173_n673TBW04_UPLOAD_DATETIME = new boolean[] {false} ;
      T00173_A674TBW04_UPLOAD_USER_ID = new String[] {""} ;
      T00173_n674TBW04_UPLOAD_USER_ID = new boolean[] {false} ;
      T00173_A675TBW04_UPLOAD_AUTH_CD = new String[] {""} ;
      T00173_n675TBW04_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T00173_A676TBW04_DM_ARRIVAL_FLG = new String[] {""} ;
      T00173_n676TBW04_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T00173_A677TBW04_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00173_n677TBW04_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T00173_A678TBW04_APPROVAL_FLG = new String[] {""} ;
      T00173_n678TBW04_APPROVAL_FLG = new boolean[] {false} ;
      T00173_A679TBW04_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00173_n679TBW04_APPROVAL_DATETIME = new boolean[] {false} ;
      T00173_A680TBW04_APPROVAL_USER_ID = new String[] {""} ;
      T00173_n680TBW04_APPROVAL_USER_ID = new boolean[] {false} ;
      T00173_A681TBW04_APPROVAL_AUTH_CD = new String[] {""} ;
      T00173_n681TBW04_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T00173_A682TBW04_INPUT_END_FLG = new String[] {""} ;
      T00173_n682TBW04_INPUT_END_FLG = new boolean[] {false} ;
      T00173_A683TBW04_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00173_n683TBW04_INPUT_END_DATETIME = new boolean[] {false} ;
      T00173_A684TBW04_INPUT_END_USER_ID = new String[] {""} ;
      T00173_n684TBW04_INPUT_END_USER_ID = new boolean[] {false} ;
      T00173_A685TBW04_INPUT_END_AUTH_CD = new String[] {""} ;
      T00173_n685TBW04_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T00173_A686TBW04_COMPLETION_FLG = new String[] {""} ;
      T00173_n686TBW04_COMPLETION_FLG = new boolean[] {false} ;
      T00173_A687TBW04_EDIT_FLG = new String[] {""} ;
      T00173_n687TBW04_EDIT_FLG = new boolean[] {false} ;
      sMode42 = "" ;
      T00176_A661TBW04_SESSION_ID = new String[] {""} ;
      T00176_A662TBW04_APP_ID = new String[] {""} ;
      T00176_A663TBW04_DISP_DATETIME = new String[] {""} ;
      T00176_A664TBW04_STUDY_ID = new long[1] ;
      T00176_A665TBW04_SUBJECT_ID = new int[1] ;
      T00176_A666TBW04_CRF_ID = new short[1] ;
      T00177_A661TBW04_SESSION_ID = new String[] {""} ;
      T00177_A662TBW04_APP_ID = new String[] {""} ;
      T00177_A663TBW04_DISP_DATETIME = new String[] {""} ;
      T00177_A664TBW04_STUDY_ID = new long[1] ;
      T00177_A665TBW04_SUBJECT_ID = new int[1] ;
      T00177_A666TBW04_CRF_ID = new short[1] ;
      T00172_A661TBW04_SESSION_ID = new String[] {""} ;
      T00172_A662TBW04_APP_ID = new String[] {""} ;
      T00172_A663TBW04_DISP_DATETIME = new String[] {""} ;
      T00172_A664TBW04_STUDY_ID = new long[1] ;
      T00172_A665TBW04_SUBJECT_ID = new int[1] ;
      T00172_A666TBW04_CRF_ID = new short[1] ;
      T00172_A667TBW04_CRF_LATEST_VERSION = new short[1] ;
      T00172_n667TBW04_CRF_LATEST_VERSION = new boolean[] {false} ;
      T00172_A668TBW04_CRF_INPUT_LEVEL = new byte[1] ;
      T00172_n668TBW04_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T00172_A669TBW04_LOCK_FLG = new String[] {""} ;
      T00172_n669TBW04_LOCK_FLG = new boolean[] {false} ;
      T00172_A670TBW04_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00172_n670TBW04_LOCK_DATETIME = new boolean[] {false} ;
      T00172_A671TBW04_LOCK_USER_ID = new String[] {""} ;
      T00172_n671TBW04_LOCK_USER_ID = new boolean[] {false} ;
      T00172_A672TBW04_LOCK_AUTH_CD = new String[] {""} ;
      T00172_n672TBW04_LOCK_AUTH_CD = new boolean[] {false} ;
      T00172_A673TBW04_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00172_n673TBW04_UPLOAD_DATETIME = new boolean[] {false} ;
      T00172_A674TBW04_UPLOAD_USER_ID = new String[] {""} ;
      T00172_n674TBW04_UPLOAD_USER_ID = new boolean[] {false} ;
      T00172_A675TBW04_UPLOAD_AUTH_CD = new String[] {""} ;
      T00172_n675TBW04_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T00172_A676TBW04_DM_ARRIVAL_FLG = new String[] {""} ;
      T00172_n676TBW04_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T00172_A677TBW04_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00172_n677TBW04_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T00172_A678TBW04_APPROVAL_FLG = new String[] {""} ;
      T00172_n678TBW04_APPROVAL_FLG = new boolean[] {false} ;
      T00172_A679TBW04_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00172_n679TBW04_APPROVAL_DATETIME = new boolean[] {false} ;
      T00172_A680TBW04_APPROVAL_USER_ID = new String[] {""} ;
      T00172_n680TBW04_APPROVAL_USER_ID = new boolean[] {false} ;
      T00172_A681TBW04_APPROVAL_AUTH_CD = new String[] {""} ;
      T00172_n681TBW04_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T00172_A682TBW04_INPUT_END_FLG = new String[] {""} ;
      T00172_n682TBW04_INPUT_END_FLG = new boolean[] {false} ;
      T00172_A683TBW04_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00172_n683TBW04_INPUT_END_DATETIME = new boolean[] {false} ;
      T00172_A684TBW04_INPUT_END_USER_ID = new String[] {""} ;
      T00172_n684TBW04_INPUT_END_USER_ID = new boolean[] {false} ;
      T00172_A685TBW04_INPUT_END_AUTH_CD = new String[] {""} ;
      T00172_n685TBW04_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T00172_A686TBW04_COMPLETION_FLG = new String[] {""} ;
      T00172_n686TBW04_COMPLETION_FLG = new boolean[] {false} ;
      T00172_A687TBW04_EDIT_FLG = new String[] {""} ;
      T00172_n687TBW04_EDIT_FLG = new boolean[] {false} ;
      T001711_A661TBW04_SESSION_ID = new String[] {""} ;
      T001711_A662TBW04_APP_ID = new String[] {""} ;
      T001711_A663TBW04_DISP_DATETIME = new String[] {""} ;
      T001711_A664TBW04_STUDY_ID = new long[1] ;
      T001711_A665TBW04_SUBJECT_ID = new int[1] ;
      T001711_A666TBW04_CRF_ID = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char3 = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw04_crf__default(),
         new Object[] {
             new Object[] {
            T00172_A661TBW04_SESSION_ID, T00172_A662TBW04_APP_ID, T00172_A663TBW04_DISP_DATETIME, T00172_A664TBW04_STUDY_ID, T00172_A665TBW04_SUBJECT_ID, T00172_A666TBW04_CRF_ID, T00172_A667TBW04_CRF_LATEST_VERSION, T00172_n667TBW04_CRF_LATEST_VERSION, T00172_A668TBW04_CRF_INPUT_LEVEL, T00172_n668TBW04_CRF_INPUT_LEVEL,
            T00172_A669TBW04_LOCK_FLG, T00172_n669TBW04_LOCK_FLG, T00172_A670TBW04_LOCK_DATETIME, T00172_n670TBW04_LOCK_DATETIME, T00172_A671TBW04_LOCK_USER_ID, T00172_n671TBW04_LOCK_USER_ID, T00172_A672TBW04_LOCK_AUTH_CD, T00172_n672TBW04_LOCK_AUTH_CD, T00172_A673TBW04_UPLOAD_DATETIME, T00172_n673TBW04_UPLOAD_DATETIME,
            T00172_A674TBW04_UPLOAD_USER_ID, T00172_n674TBW04_UPLOAD_USER_ID, T00172_A675TBW04_UPLOAD_AUTH_CD, T00172_n675TBW04_UPLOAD_AUTH_CD, T00172_A676TBW04_DM_ARRIVAL_FLG, T00172_n676TBW04_DM_ARRIVAL_FLG, T00172_A677TBW04_DM_ARRIVAL_DATETIME, T00172_n677TBW04_DM_ARRIVAL_DATETIME, T00172_A678TBW04_APPROVAL_FLG, T00172_n678TBW04_APPROVAL_FLG,
            T00172_A679TBW04_APPROVAL_DATETIME, T00172_n679TBW04_APPROVAL_DATETIME, T00172_A680TBW04_APPROVAL_USER_ID, T00172_n680TBW04_APPROVAL_USER_ID, T00172_A681TBW04_APPROVAL_AUTH_CD, T00172_n681TBW04_APPROVAL_AUTH_CD, T00172_A682TBW04_INPUT_END_FLG, T00172_n682TBW04_INPUT_END_FLG, T00172_A683TBW04_INPUT_END_DATETIME, T00172_n683TBW04_INPUT_END_DATETIME,
            T00172_A684TBW04_INPUT_END_USER_ID, T00172_n684TBW04_INPUT_END_USER_ID, T00172_A685TBW04_INPUT_END_AUTH_CD, T00172_n685TBW04_INPUT_END_AUTH_CD, T00172_A686TBW04_COMPLETION_FLG, T00172_n686TBW04_COMPLETION_FLG, T00172_A687TBW04_EDIT_FLG, T00172_n687TBW04_EDIT_FLG
            }
            , new Object[] {
            T00173_A661TBW04_SESSION_ID, T00173_A662TBW04_APP_ID, T00173_A663TBW04_DISP_DATETIME, T00173_A664TBW04_STUDY_ID, T00173_A665TBW04_SUBJECT_ID, T00173_A666TBW04_CRF_ID, T00173_A667TBW04_CRF_LATEST_VERSION, T00173_n667TBW04_CRF_LATEST_VERSION, T00173_A668TBW04_CRF_INPUT_LEVEL, T00173_n668TBW04_CRF_INPUT_LEVEL,
            T00173_A669TBW04_LOCK_FLG, T00173_n669TBW04_LOCK_FLG, T00173_A670TBW04_LOCK_DATETIME, T00173_n670TBW04_LOCK_DATETIME, T00173_A671TBW04_LOCK_USER_ID, T00173_n671TBW04_LOCK_USER_ID, T00173_A672TBW04_LOCK_AUTH_CD, T00173_n672TBW04_LOCK_AUTH_CD, T00173_A673TBW04_UPLOAD_DATETIME, T00173_n673TBW04_UPLOAD_DATETIME,
            T00173_A674TBW04_UPLOAD_USER_ID, T00173_n674TBW04_UPLOAD_USER_ID, T00173_A675TBW04_UPLOAD_AUTH_CD, T00173_n675TBW04_UPLOAD_AUTH_CD, T00173_A676TBW04_DM_ARRIVAL_FLG, T00173_n676TBW04_DM_ARRIVAL_FLG, T00173_A677TBW04_DM_ARRIVAL_DATETIME, T00173_n677TBW04_DM_ARRIVAL_DATETIME, T00173_A678TBW04_APPROVAL_FLG, T00173_n678TBW04_APPROVAL_FLG,
            T00173_A679TBW04_APPROVAL_DATETIME, T00173_n679TBW04_APPROVAL_DATETIME, T00173_A680TBW04_APPROVAL_USER_ID, T00173_n680TBW04_APPROVAL_USER_ID, T00173_A681TBW04_APPROVAL_AUTH_CD, T00173_n681TBW04_APPROVAL_AUTH_CD, T00173_A682TBW04_INPUT_END_FLG, T00173_n682TBW04_INPUT_END_FLG, T00173_A683TBW04_INPUT_END_DATETIME, T00173_n683TBW04_INPUT_END_DATETIME,
            T00173_A684TBW04_INPUT_END_USER_ID, T00173_n684TBW04_INPUT_END_USER_ID, T00173_A685TBW04_INPUT_END_AUTH_CD, T00173_n685TBW04_INPUT_END_AUTH_CD, T00173_A686TBW04_COMPLETION_FLG, T00173_n686TBW04_COMPLETION_FLG, T00173_A687TBW04_EDIT_FLG, T00173_n687TBW04_EDIT_FLG
            }
            , new Object[] {
            T00174_A661TBW04_SESSION_ID, T00174_A662TBW04_APP_ID, T00174_A663TBW04_DISP_DATETIME, T00174_A664TBW04_STUDY_ID, T00174_A665TBW04_SUBJECT_ID, T00174_A666TBW04_CRF_ID, T00174_A667TBW04_CRF_LATEST_VERSION, T00174_n667TBW04_CRF_LATEST_VERSION, T00174_A668TBW04_CRF_INPUT_LEVEL, T00174_n668TBW04_CRF_INPUT_LEVEL,
            T00174_A669TBW04_LOCK_FLG, T00174_n669TBW04_LOCK_FLG, T00174_A670TBW04_LOCK_DATETIME, T00174_n670TBW04_LOCK_DATETIME, T00174_A671TBW04_LOCK_USER_ID, T00174_n671TBW04_LOCK_USER_ID, T00174_A672TBW04_LOCK_AUTH_CD, T00174_n672TBW04_LOCK_AUTH_CD, T00174_A673TBW04_UPLOAD_DATETIME, T00174_n673TBW04_UPLOAD_DATETIME,
            T00174_A674TBW04_UPLOAD_USER_ID, T00174_n674TBW04_UPLOAD_USER_ID, T00174_A675TBW04_UPLOAD_AUTH_CD, T00174_n675TBW04_UPLOAD_AUTH_CD, T00174_A676TBW04_DM_ARRIVAL_FLG, T00174_n676TBW04_DM_ARRIVAL_FLG, T00174_A677TBW04_DM_ARRIVAL_DATETIME, T00174_n677TBW04_DM_ARRIVAL_DATETIME, T00174_A678TBW04_APPROVAL_FLG, T00174_n678TBW04_APPROVAL_FLG,
            T00174_A679TBW04_APPROVAL_DATETIME, T00174_n679TBW04_APPROVAL_DATETIME, T00174_A680TBW04_APPROVAL_USER_ID, T00174_n680TBW04_APPROVAL_USER_ID, T00174_A681TBW04_APPROVAL_AUTH_CD, T00174_n681TBW04_APPROVAL_AUTH_CD, T00174_A682TBW04_INPUT_END_FLG, T00174_n682TBW04_INPUT_END_FLG, T00174_A683TBW04_INPUT_END_DATETIME, T00174_n683TBW04_INPUT_END_DATETIME,
            T00174_A684TBW04_INPUT_END_USER_ID, T00174_n684TBW04_INPUT_END_USER_ID, T00174_A685TBW04_INPUT_END_AUTH_CD, T00174_n685TBW04_INPUT_END_AUTH_CD, T00174_A686TBW04_COMPLETION_FLG, T00174_n686TBW04_COMPLETION_FLG, T00174_A687TBW04_EDIT_FLG, T00174_n687TBW04_EDIT_FLG
            }
            , new Object[] {
            T00175_A661TBW04_SESSION_ID, T00175_A662TBW04_APP_ID, T00175_A663TBW04_DISP_DATETIME, T00175_A664TBW04_STUDY_ID, T00175_A665TBW04_SUBJECT_ID, T00175_A666TBW04_CRF_ID
            }
            , new Object[] {
            T00176_A661TBW04_SESSION_ID, T00176_A662TBW04_APP_ID, T00176_A663TBW04_DISP_DATETIME, T00176_A664TBW04_STUDY_ID, T00176_A665TBW04_SUBJECT_ID, T00176_A666TBW04_CRF_ID
            }
            , new Object[] {
            T00177_A661TBW04_SESSION_ID, T00177_A662TBW04_APP_ID, T00177_A663TBW04_DISP_DATETIME, T00177_A664TBW04_STUDY_ID, T00177_A665TBW04_SUBJECT_ID, T00177_A666TBW04_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001711_A661TBW04_SESSION_ID, T001711_A662TBW04_APP_ID, T001711_A663TBW04_DISP_DATETIME, T001711_A664TBW04_STUDY_ID, T001711_A665TBW04_SUBJECT_ID, T001711_A666TBW04_CRF_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW04_CRF" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A668TBW04_CRF_INPUT_LEVEL ;
   private byte Z668TBW04_CRF_INPUT_LEVEL ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A666TBW04_CRF_ID ;
   private short A667TBW04_CRF_LATEST_VERSION ;
   private short Z666TBW04_CRF_ID ;
   private short Z667TBW04_CRF_LATEST_VERSION ;
   private short RcdFound42 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW04_SESSION_ID_Enabled ;
   private int edtTBW04_APP_ID_Enabled ;
   private int edtTBW04_DISP_DATETIME_Enabled ;
   private int edtTBW04_STUDY_ID_Enabled ;
   private int A665TBW04_SUBJECT_ID ;
   private int edtTBW04_SUBJECT_ID_Enabled ;
   private int edtTBW04_CRF_ID_Enabled ;
   private int edtTBW04_CRF_LATEST_VERSION_Enabled ;
   private int edtTBW04_CRF_INPUT_LEVEL_Enabled ;
   private int edtTBW04_LOCK_FLG_Enabled ;
   private int edtTBW04_LOCK_DATETIME_Enabled ;
   private int edtTBW04_LOCK_USER_ID_Enabled ;
   private int edtTBW04_LOCK_AUTH_CD_Enabled ;
   private int edtTBW04_UPLOAD_DATETIME_Enabled ;
   private int edtTBW04_UPLOAD_USER_ID_Enabled ;
   private int edtTBW04_UPLOAD_AUTH_CD_Enabled ;
   private int edtTBW04_DM_ARRIVAL_FLG_Enabled ;
   private int edtTBW04_DM_ARRIVAL_DATETIME_Enabled ;
   private int edtTBW04_APPROVAL_FLG_Enabled ;
   private int edtTBW04_APPROVAL_DATETIME_Enabled ;
   private int edtTBW04_APPROVAL_USER_ID_Enabled ;
   private int edtTBW04_APPROVAL_AUTH_CD_Enabled ;
   private int edtTBW04_INPUT_END_FLG_Enabled ;
   private int edtTBW04_INPUT_END_DATETIME_Enabled ;
   private int edtTBW04_INPUT_END_USER_ID_Enabled ;
   private int edtTBW04_INPUT_END_AUTH_CD_Enabled ;
   private int edtTBW04_COMPLETION_FLG_Enabled ;
   private int edtTBW04_EDIT_FLG_Enabled ;
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
   private int Z665TBW04_SUBJECT_ID ;
   private int GX_JID ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A664TBW04_STUDY_ID ;
   private long Z664TBW04_STUDY_ID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW04_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw04_session_id_Internalname ;
   private String lblTextblocktbw04_session_id_Jsonclick ;
   private String edtTBW04_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw04_app_id_Internalname ;
   private String lblTextblocktbw04_app_id_Jsonclick ;
   private String edtTBW04_APP_ID_Internalname ;
   private String edtTBW04_APP_ID_Jsonclick ;
   private String lblTextblocktbw04_disp_datetime_Internalname ;
   private String lblTextblocktbw04_disp_datetime_Jsonclick ;
   private String edtTBW04_DISP_DATETIME_Internalname ;
   private String edtTBW04_DISP_DATETIME_Jsonclick ;
   private String lblTextblocktbw04_study_id_Internalname ;
   private String lblTextblocktbw04_study_id_Jsonclick ;
   private String edtTBW04_STUDY_ID_Internalname ;
   private String edtTBW04_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw04_subject_id_Internalname ;
   private String lblTextblocktbw04_subject_id_Jsonclick ;
   private String edtTBW04_SUBJECT_ID_Internalname ;
   private String edtTBW04_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbw04_crf_id_Internalname ;
   private String lblTextblocktbw04_crf_id_Jsonclick ;
   private String edtTBW04_CRF_ID_Internalname ;
   private String edtTBW04_CRF_ID_Jsonclick ;
   private String lblTextblocktbw04_crf_latest_version_Internalname ;
   private String lblTextblocktbw04_crf_latest_version_Jsonclick ;
   private String edtTBW04_CRF_LATEST_VERSION_Internalname ;
   private String edtTBW04_CRF_LATEST_VERSION_Jsonclick ;
   private String lblTextblocktbw04_crf_input_level_Internalname ;
   private String lblTextblocktbw04_crf_input_level_Jsonclick ;
   private String edtTBW04_CRF_INPUT_LEVEL_Internalname ;
   private String edtTBW04_CRF_INPUT_LEVEL_Jsonclick ;
   private String lblTextblocktbw04_lock_flg_Internalname ;
   private String lblTextblocktbw04_lock_flg_Jsonclick ;
   private String edtTBW04_LOCK_FLG_Internalname ;
   private String edtTBW04_LOCK_FLG_Jsonclick ;
   private String lblTextblocktbw04_lock_datetime_Internalname ;
   private String lblTextblocktbw04_lock_datetime_Jsonclick ;
   private String edtTBW04_LOCK_DATETIME_Internalname ;
   private String edtTBW04_LOCK_DATETIME_Jsonclick ;
   private String lblTextblocktbw04_lock_user_id_Internalname ;
   private String lblTextblocktbw04_lock_user_id_Jsonclick ;
   private String edtTBW04_LOCK_USER_ID_Internalname ;
   private String edtTBW04_LOCK_USER_ID_Jsonclick ;
   private String lblTextblocktbw04_lock_auth_cd_Internalname ;
   private String lblTextblocktbw04_lock_auth_cd_Jsonclick ;
   private String edtTBW04_LOCK_AUTH_CD_Internalname ;
   private String edtTBW04_LOCK_AUTH_CD_Jsonclick ;
   private String lblTextblocktbw04_upload_datetime_Internalname ;
   private String lblTextblocktbw04_upload_datetime_Jsonclick ;
   private String edtTBW04_UPLOAD_DATETIME_Internalname ;
   private String edtTBW04_UPLOAD_DATETIME_Jsonclick ;
   private String lblTextblocktbw04_upload_user_id_Internalname ;
   private String lblTextblocktbw04_upload_user_id_Jsonclick ;
   private String edtTBW04_UPLOAD_USER_ID_Internalname ;
   private String edtTBW04_UPLOAD_USER_ID_Jsonclick ;
   private String lblTextblocktbw04_upload_auth_cd_Internalname ;
   private String lblTextblocktbw04_upload_auth_cd_Jsonclick ;
   private String edtTBW04_UPLOAD_AUTH_CD_Internalname ;
   private String edtTBW04_UPLOAD_AUTH_CD_Jsonclick ;
   private String lblTextblocktbw04_dm_arrival_flg_Internalname ;
   private String lblTextblocktbw04_dm_arrival_flg_Jsonclick ;
   private String edtTBW04_DM_ARRIVAL_FLG_Internalname ;
   private String edtTBW04_DM_ARRIVAL_FLG_Jsonclick ;
   private String lblTextblocktbw04_dm_arrival_datetime_Internalname ;
   private String lblTextblocktbw04_dm_arrival_datetime_Jsonclick ;
   private String edtTBW04_DM_ARRIVAL_DATETIME_Internalname ;
   private String edtTBW04_DM_ARRIVAL_DATETIME_Jsonclick ;
   private String lblTextblocktbw04_approval_flg_Internalname ;
   private String lblTextblocktbw04_approval_flg_Jsonclick ;
   private String edtTBW04_APPROVAL_FLG_Internalname ;
   private String edtTBW04_APPROVAL_FLG_Jsonclick ;
   private String lblTextblocktbw04_approval_datetime_Internalname ;
   private String lblTextblocktbw04_approval_datetime_Jsonclick ;
   private String edtTBW04_APPROVAL_DATETIME_Internalname ;
   private String edtTBW04_APPROVAL_DATETIME_Jsonclick ;
   private String lblTextblocktbw04_approval_user_id_Internalname ;
   private String lblTextblocktbw04_approval_user_id_Jsonclick ;
   private String edtTBW04_APPROVAL_USER_ID_Internalname ;
   private String edtTBW04_APPROVAL_USER_ID_Jsonclick ;
   private String lblTextblocktbw04_approval_auth_cd_Internalname ;
   private String lblTextblocktbw04_approval_auth_cd_Jsonclick ;
   private String edtTBW04_APPROVAL_AUTH_CD_Internalname ;
   private String edtTBW04_APPROVAL_AUTH_CD_Jsonclick ;
   private String lblTextblocktbw04_input_end_flg_Internalname ;
   private String lblTextblocktbw04_input_end_flg_Jsonclick ;
   private String edtTBW04_INPUT_END_FLG_Internalname ;
   private String edtTBW04_INPUT_END_FLG_Jsonclick ;
   private String lblTextblocktbw04_input_end_datetime_Internalname ;
   private String lblTextblocktbw04_input_end_datetime_Jsonclick ;
   private String edtTBW04_INPUT_END_DATETIME_Internalname ;
   private String edtTBW04_INPUT_END_DATETIME_Jsonclick ;
   private String lblTextblocktbw04_input_end_user_id_Internalname ;
   private String lblTextblocktbw04_input_end_user_id_Jsonclick ;
   private String edtTBW04_INPUT_END_USER_ID_Internalname ;
   private String edtTBW04_INPUT_END_USER_ID_Jsonclick ;
   private String lblTextblocktbw04_input_end_auth_cd_Internalname ;
   private String lblTextblocktbw04_input_end_auth_cd_Jsonclick ;
   private String edtTBW04_INPUT_END_AUTH_CD_Internalname ;
   private String edtTBW04_INPUT_END_AUTH_CD_Jsonclick ;
   private String lblTextblocktbw04_completion_flg_Internalname ;
   private String lblTextblocktbw04_completion_flg_Jsonclick ;
   private String edtTBW04_COMPLETION_FLG_Internalname ;
   private String edtTBW04_COMPLETION_FLG_Jsonclick ;
   private String lblTextblocktbw04_edit_flg_Internalname ;
   private String lblTextblocktbw04_edit_flg_Jsonclick ;
   private String edtTBW04_EDIT_FLG_Internalname ;
   private String edtTBW04_EDIT_FLG_Jsonclick ;
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
   private String sMode42 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char3 ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A670TBW04_LOCK_DATETIME ;
   private java.util.Date A673TBW04_UPLOAD_DATETIME ;
   private java.util.Date A677TBW04_DM_ARRIVAL_DATETIME ;
   private java.util.Date A679TBW04_APPROVAL_DATETIME ;
   private java.util.Date A683TBW04_INPUT_END_DATETIME ;
   private java.util.Date Z670TBW04_LOCK_DATETIME ;
   private java.util.Date Z673TBW04_UPLOAD_DATETIME ;
   private java.util.Date Z677TBW04_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z679TBW04_APPROVAL_DATETIME ;
   private java.util.Date Z683TBW04_INPUT_END_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n667TBW04_CRF_LATEST_VERSION ;
   private boolean n668TBW04_CRF_INPUT_LEVEL ;
   private boolean n669TBW04_LOCK_FLG ;
   private boolean n670TBW04_LOCK_DATETIME ;
   private boolean n671TBW04_LOCK_USER_ID ;
   private boolean n672TBW04_LOCK_AUTH_CD ;
   private boolean n673TBW04_UPLOAD_DATETIME ;
   private boolean n674TBW04_UPLOAD_USER_ID ;
   private boolean n675TBW04_UPLOAD_AUTH_CD ;
   private boolean n676TBW04_DM_ARRIVAL_FLG ;
   private boolean n677TBW04_DM_ARRIVAL_DATETIME ;
   private boolean n678TBW04_APPROVAL_FLG ;
   private boolean n679TBW04_APPROVAL_DATETIME ;
   private boolean n680TBW04_APPROVAL_USER_ID ;
   private boolean n681TBW04_APPROVAL_AUTH_CD ;
   private boolean n682TBW04_INPUT_END_FLG ;
   private boolean n683TBW04_INPUT_END_DATETIME ;
   private boolean n684TBW04_INPUT_END_USER_ID ;
   private boolean n685TBW04_INPUT_END_AUTH_CD ;
   private boolean n686TBW04_COMPLETION_FLG ;
   private boolean n687TBW04_EDIT_FLG ;
   private boolean Gx_longc ;
   private String A661TBW04_SESSION_ID ;
   private String A662TBW04_APP_ID ;
   private String A663TBW04_DISP_DATETIME ;
   private String A669TBW04_LOCK_FLG ;
   private String A671TBW04_LOCK_USER_ID ;
   private String A672TBW04_LOCK_AUTH_CD ;
   private String A674TBW04_UPLOAD_USER_ID ;
   private String A675TBW04_UPLOAD_AUTH_CD ;
   private String A676TBW04_DM_ARRIVAL_FLG ;
   private String A678TBW04_APPROVAL_FLG ;
   private String A680TBW04_APPROVAL_USER_ID ;
   private String A681TBW04_APPROVAL_AUTH_CD ;
   private String A682TBW04_INPUT_END_FLG ;
   private String A684TBW04_INPUT_END_USER_ID ;
   private String A685TBW04_INPUT_END_AUTH_CD ;
   private String A686TBW04_COMPLETION_FLG ;
   private String A687TBW04_EDIT_FLG ;
   private String Z661TBW04_SESSION_ID ;
   private String Z662TBW04_APP_ID ;
   private String Z663TBW04_DISP_DATETIME ;
   private String Z669TBW04_LOCK_FLG ;
   private String Z671TBW04_LOCK_USER_ID ;
   private String Z672TBW04_LOCK_AUTH_CD ;
   private String Z674TBW04_UPLOAD_USER_ID ;
   private String Z675TBW04_UPLOAD_AUTH_CD ;
   private String Z676TBW04_DM_ARRIVAL_FLG ;
   private String Z678TBW04_APPROVAL_FLG ;
   private String Z680TBW04_APPROVAL_USER_ID ;
   private String Z681TBW04_APPROVAL_AUTH_CD ;
   private String Z682TBW04_INPUT_END_FLG ;
   private String Z684TBW04_INPUT_END_USER_ID ;
   private String Z685TBW04_INPUT_END_AUTH_CD ;
   private String Z686TBW04_COMPLETION_FLG ;
   private String Z687TBW04_EDIT_FLG ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T00174_A661TBW04_SESSION_ID ;
   private String[] T00174_A662TBW04_APP_ID ;
   private String[] T00174_A663TBW04_DISP_DATETIME ;
   private long[] T00174_A664TBW04_STUDY_ID ;
   private int[] T00174_A665TBW04_SUBJECT_ID ;
   private short[] T00174_A666TBW04_CRF_ID ;
   private short[] T00174_A667TBW04_CRF_LATEST_VERSION ;
   private boolean[] T00174_n667TBW04_CRF_LATEST_VERSION ;
   private byte[] T00174_A668TBW04_CRF_INPUT_LEVEL ;
   private boolean[] T00174_n668TBW04_CRF_INPUT_LEVEL ;
   private String[] T00174_A669TBW04_LOCK_FLG ;
   private boolean[] T00174_n669TBW04_LOCK_FLG ;
   private java.util.Date[] T00174_A670TBW04_LOCK_DATETIME ;
   private boolean[] T00174_n670TBW04_LOCK_DATETIME ;
   private String[] T00174_A671TBW04_LOCK_USER_ID ;
   private boolean[] T00174_n671TBW04_LOCK_USER_ID ;
   private String[] T00174_A672TBW04_LOCK_AUTH_CD ;
   private boolean[] T00174_n672TBW04_LOCK_AUTH_CD ;
   private java.util.Date[] T00174_A673TBW04_UPLOAD_DATETIME ;
   private boolean[] T00174_n673TBW04_UPLOAD_DATETIME ;
   private String[] T00174_A674TBW04_UPLOAD_USER_ID ;
   private boolean[] T00174_n674TBW04_UPLOAD_USER_ID ;
   private String[] T00174_A675TBW04_UPLOAD_AUTH_CD ;
   private boolean[] T00174_n675TBW04_UPLOAD_AUTH_CD ;
   private String[] T00174_A676TBW04_DM_ARRIVAL_FLG ;
   private boolean[] T00174_n676TBW04_DM_ARRIVAL_FLG ;
   private java.util.Date[] T00174_A677TBW04_DM_ARRIVAL_DATETIME ;
   private boolean[] T00174_n677TBW04_DM_ARRIVAL_DATETIME ;
   private String[] T00174_A678TBW04_APPROVAL_FLG ;
   private boolean[] T00174_n678TBW04_APPROVAL_FLG ;
   private java.util.Date[] T00174_A679TBW04_APPROVAL_DATETIME ;
   private boolean[] T00174_n679TBW04_APPROVAL_DATETIME ;
   private String[] T00174_A680TBW04_APPROVAL_USER_ID ;
   private boolean[] T00174_n680TBW04_APPROVAL_USER_ID ;
   private String[] T00174_A681TBW04_APPROVAL_AUTH_CD ;
   private boolean[] T00174_n681TBW04_APPROVAL_AUTH_CD ;
   private String[] T00174_A682TBW04_INPUT_END_FLG ;
   private boolean[] T00174_n682TBW04_INPUT_END_FLG ;
   private java.util.Date[] T00174_A683TBW04_INPUT_END_DATETIME ;
   private boolean[] T00174_n683TBW04_INPUT_END_DATETIME ;
   private String[] T00174_A684TBW04_INPUT_END_USER_ID ;
   private boolean[] T00174_n684TBW04_INPUT_END_USER_ID ;
   private String[] T00174_A685TBW04_INPUT_END_AUTH_CD ;
   private boolean[] T00174_n685TBW04_INPUT_END_AUTH_CD ;
   private String[] T00174_A686TBW04_COMPLETION_FLG ;
   private boolean[] T00174_n686TBW04_COMPLETION_FLG ;
   private String[] T00174_A687TBW04_EDIT_FLG ;
   private boolean[] T00174_n687TBW04_EDIT_FLG ;
   private String[] T00175_A661TBW04_SESSION_ID ;
   private String[] T00175_A662TBW04_APP_ID ;
   private String[] T00175_A663TBW04_DISP_DATETIME ;
   private long[] T00175_A664TBW04_STUDY_ID ;
   private int[] T00175_A665TBW04_SUBJECT_ID ;
   private short[] T00175_A666TBW04_CRF_ID ;
   private String[] T00173_A661TBW04_SESSION_ID ;
   private String[] T00173_A662TBW04_APP_ID ;
   private String[] T00173_A663TBW04_DISP_DATETIME ;
   private long[] T00173_A664TBW04_STUDY_ID ;
   private int[] T00173_A665TBW04_SUBJECT_ID ;
   private short[] T00173_A666TBW04_CRF_ID ;
   private short[] T00173_A667TBW04_CRF_LATEST_VERSION ;
   private boolean[] T00173_n667TBW04_CRF_LATEST_VERSION ;
   private byte[] T00173_A668TBW04_CRF_INPUT_LEVEL ;
   private boolean[] T00173_n668TBW04_CRF_INPUT_LEVEL ;
   private String[] T00173_A669TBW04_LOCK_FLG ;
   private boolean[] T00173_n669TBW04_LOCK_FLG ;
   private java.util.Date[] T00173_A670TBW04_LOCK_DATETIME ;
   private boolean[] T00173_n670TBW04_LOCK_DATETIME ;
   private String[] T00173_A671TBW04_LOCK_USER_ID ;
   private boolean[] T00173_n671TBW04_LOCK_USER_ID ;
   private String[] T00173_A672TBW04_LOCK_AUTH_CD ;
   private boolean[] T00173_n672TBW04_LOCK_AUTH_CD ;
   private java.util.Date[] T00173_A673TBW04_UPLOAD_DATETIME ;
   private boolean[] T00173_n673TBW04_UPLOAD_DATETIME ;
   private String[] T00173_A674TBW04_UPLOAD_USER_ID ;
   private boolean[] T00173_n674TBW04_UPLOAD_USER_ID ;
   private String[] T00173_A675TBW04_UPLOAD_AUTH_CD ;
   private boolean[] T00173_n675TBW04_UPLOAD_AUTH_CD ;
   private String[] T00173_A676TBW04_DM_ARRIVAL_FLG ;
   private boolean[] T00173_n676TBW04_DM_ARRIVAL_FLG ;
   private java.util.Date[] T00173_A677TBW04_DM_ARRIVAL_DATETIME ;
   private boolean[] T00173_n677TBW04_DM_ARRIVAL_DATETIME ;
   private String[] T00173_A678TBW04_APPROVAL_FLG ;
   private boolean[] T00173_n678TBW04_APPROVAL_FLG ;
   private java.util.Date[] T00173_A679TBW04_APPROVAL_DATETIME ;
   private boolean[] T00173_n679TBW04_APPROVAL_DATETIME ;
   private String[] T00173_A680TBW04_APPROVAL_USER_ID ;
   private boolean[] T00173_n680TBW04_APPROVAL_USER_ID ;
   private String[] T00173_A681TBW04_APPROVAL_AUTH_CD ;
   private boolean[] T00173_n681TBW04_APPROVAL_AUTH_CD ;
   private String[] T00173_A682TBW04_INPUT_END_FLG ;
   private boolean[] T00173_n682TBW04_INPUT_END_FLG ;
   private java.util.Date[] T00173_A683TBW04_INPUT_END_DATETIME ;
   private boolean[] T00173_n683TBW04_INPUT_END_DATETIME ;
   private String[] T00173_A684TBW04_INPUT_END_USER_ID ;
   private boolean[] T00173_n684TBW04_INPUT_END_USER_ID ;
   private String[] T00173_A685TBW04_INPUT_END_AUTH_CD ;
   private boolean[] T00173_n685TBW04_INPUT_END_AUTH_CD ;
   private String[] T00173_A686TBW04_COMPLETION_FLG ;
   private boolean[] T00173_n686TBW04_COMPLETION_FLG ;
   private String[] T00173_A687TBW04_EDIT_FLG ;
   private boolean[] T00173_n687TBW04_EDIT_FLG ;
   private String[] T00176_A661TBW04_SESSION_ID ;
   private String[] T00176_A662TBW04_APP_ID ;
   private String[] T00176_A663TBW04_DISP_DATETIME ;
   private long[] T00176_A664TBW04_STUDY_ID ;
   private int[] T00176_A665TBW04_SUBJECT_ID ;
   private short[] T00176_A666TBW04_CRF_ID ;
   private String[] T00177_A661TBW04_SESSION_ID ;
   private String[] T00177_A662TBW04_APP_ID ;
   private String[] T00177_A663TBW04_DISP_DATETIME ;
   private long[] T00177_A664TBW04_STUDY_ID ;
   private int[] T00177_A665TBW04_SUBJECT_ID ;
   private short[] T00177_A666TBW04_CRF_ID ;
   private String[] T00172_A661TBW04_SESSION_ID ;
   private String[] T00172_A662TBW04_APP_ID ;
   private String[] T00172_A663TBW04_DISP_DATETIME ;
   private long[] T00172_A664TBW04_STUDY_ID ;
   private int[] T00172_A665TBW04_SUBJECT_ID ;
   private short[] T00172_A666TBW04_CRF_ID ;
   private short[] T00172_A667TBW04_CRF_LATEST_VERSION ;
   private boolean[] T00172_n667TBW04_CRF_LATEST_VERSION ;
   private byte[] T00172_A668TBW04_CRF_INPUT_LEVEL ;
   private boolean[] T00172_n668TBW04_CRF_INPUT_LEVEL ;
   private String[] T00172_A669TBW04_LOCK_FLG ;
   private boolean[] T00172_n669TBW04_LOCK_FLG ;
   private java.util.Date[] T00172_A670TBW04_LOCK_DATETIME ;
   private boolean[] T00172_n670TBW04_LOCK_DATETIME ;
   private String[] T00172_A671TBW04_LOCK_USER_ID ;
   private boolean[] T00172_n671TBW04_LOCK_USER_ID ;
   private String[] T00172_A672TBW04_LOCK_AUTH_CD ;
   private boolean[] T00172_n672TBW04_LOCK_AUTH_CD ;
   private java.util.Date[] T00172_A673TBW04_UPLOAD_DATETIME ;
   private boolean[] T00172_n673TBW04_UPLOAD_DATETIME ;
   private String[] T00172_A674TBW04_UPLOAD_USER_ID ;
   private boolean[] T00172_n674TBW04_UPLOAD_USER_ID ;
   private String[] T00172_A675TBW04_UPLOAD_AUTH_CD ;
   private boolean[] T00172_n675TBW04_UPLOAD_AUTH_CD ;
   private String[] T00172_A676TBW04_DM_ARRIVAL_FLG ;
   private boolean[] T00172_n676TBW04_DM_ARRIVAL_FLG ;
   private java.util.Date[] T00172_A677TBW04_DM_ARRIVAL_DATETIME ;
   private boolean[] T00172_n677TBW04_DM_ARRIVAL_DATETIME ;
   private String[] T00172_A678TBW04_APPROVAL_FLG ;
   private boolean[] T00172_n678TBW04_APPROVAL_FLG ;
   private java.util.Date[] T00172_A679TBW04_APPROVAL_DATETIME ;
   private boolean[] T00172_n679TBW04_APPROVAL_DATETIME ;
   private String[] T00172_A680TBW04_APPROVAL_USER_ID ;
   private boolean[] T00172_n680TBW04_APPROVAL_USER_ID ;
   private String[] T00172_A681TBW04_APPROVAL_AUTH_CD ;
   private boolean[] T00172_n681TBW04_APPROVAL_AUTH_CD ;
   private String[] T00172_A682TBW04_INPUT_END_FLG ;
   private boolean[] T00172_n682TBW04_INPUT_END_FLG ;
   private java.util.Date[] T00172_A683TBW04_INPUT_END_DATETIME ;
   private boolean[] T00172_n683TBW04_INPUT_END_DATETIME ;
   private String[] T00172_A684TBW04_INPUT_END_USER_ID ;
   private boolean[] T00172_n684TBW04_INPUT_END_USER_ID ;
   private String[] T00172_A685TBW04_INPUT_END_AUTH_CD ;
   private boolean[] T00172_n685TBW04_INPUT_END_AUTH_CD ;
   private String[] T00172_A686TBW04_COMPLETION_FLG ;
   private boolean[] T00172_n686TBW04_COMPLETION_FLG ;
   private String[] T00172_A687TBW04_EDIT_FLG ;
   private boolean[] T00172_n687TBW04_EDIT_FLG ;
   private String[] T001711_A661TBW04_SESSION_ID ;
   private String[] T001711_A662TBW04_APP_ID ;
   private String[] T001711_A663TBW04_DISP_DATETIME ;
   private long[] T001711_A664TBW04_STUDY_ID ;
   private int[] T001711_A665TBW04_SUBJECT_ID ;
   private short[] T001711_A666TBW04_CRF_ID ;
}

final  class tbw04_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00172", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID`, `TBW04_CRF_LATEST_VERSION`, `TBW04_CRF_INPUT_LEVEL`, `TBW04_LOCK_FLG`, `TBW04_LOCK_DATETIME`, `TBW04_LOCK_USER_ID`, `TBW04_LOCK_AUTH_CD`, `TBW04_UPLOAD_DATETIME`, `TBW04_UPLOAD_USER_ID`, `TBW04_UPLOAD_AUTH_CD`, `TBW04_DM_ARRIVAL_FLG`, `TBW04_DM_ARRIVAL_DATETIME`, `TBW04_APPROVAL_FLG`, `TBW04_APPROVAL_DATETIME`, `TBW04_APPROVAL_USER_ID`, `TBW04_APPROVAL_AUTH_CD`, `TBW04_INPUT_END_FLG`, `TBW04_INPUT_END_DATETIME`, `TBW04_INPUT_END_USER_ID`, `TBW04_INPUT_END_AUTH_CD`, `TBW04_COMPLETION_FLG`, `TBW04_EDIT_FLG` FROM `TBW04_CRF` WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00173", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID`, `TBW04_CRF_LATEST_VERSION`, `TBW04_CRF_INPUT_LEVEL`, `TBW04_LOCK_FLG`, `TBW04_LOCK_DATETIME`, `TBW04_LOCK_USER_ID`, `TBW04_LOCK_AUTH_CD`, `TBW04_UPLOAD_DATETIME`, `TBW04_UPLOAD_USER_ID`, `TBW04_UPLOAD_AUTH_CD`, `TBW04_DM_ARRIVAL_FLG`, `TBW04_DM_ARRIVAL_DATETIME`, `TBW04_APPROVAL_FLG`, `TBW04_APPROVAL_DATETIME`, `TBW04_APPROVAL_USER_ID`, `TBW04_APPROVAL_AUTH_CD`, `TBW04_INPUT_END_FLG`, `TBW04_INPUT_END_DATETIME`, `TBW04_INPUT_END_USER_ID`, `TBW04_INPUT_END_AUTH_CD`, `TBW04_COMPLETION_FLG`, `TBW04_EDIT_FLG` FROM `TBW04_CRF` WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00174", "SELECT TM1.`TBW04_SESSION_ID`, TM1.`TBW04_APP_ID`, TM1.`TBW04_DISP_DATETIME`, TM1.`TBW04_STUDY_ID`, TM1.`TBW04_SUBJECT_ID`, TM1.`TBW04_CRF_ID`, TM1.`TBW04_CRF_LATEST_VERSION`, TM1.`TBW04_CRF_INPUT_LEVEL`, TM1.`TBW04_LOCK_FLG`, TM1.`TBW04_LOCK_DATETIME`, TM1.`TBW04_LOCK_USER_ID`, TM1.`TBW04_LOCK_AUTH_CD`, TM1.`TBW04_UPLOAD_DATETIME`, TM1.`TBW04_UPLOAD_USER_ID`, TM1.`TBW04_UPLOAD_AUTH_CD`, TM1.`TBW04_DM_ARRIVAL_FLG`, TM1.`TBW04_DM_ARRIVAL_DATETIME`, TM1.`TBW04_APPROVAL_FLG`, TM1.`TBW04_APPROVAL_DATETIME`, TM1.`TBW04_APPROVAL_USER_ID`, TM1.`TBW04_APPROVAL_AUTH_CD`, TM1.`TBW04_INPUT_END_FLG`, TM1.`TBW04_INPUT_END_DATETIME`, TM1.`TBW04_INPUT_END_USER_ID`, TM1.`TBW04_INPUT_END_AUTH_CD`, TM1.`TBW04_COMPLETION_FLG`, TM1.`TBW04_EDIT_FLG` FROM `TBW04_CRF` TM1 WHERE TM1.`TBW04_SESSION_ID` = ? and TM1.`TBW04_APP_ID` = ? and TM1.`TBW04_DISP_DATETIME` = ? and TM1.`TBW04_STUDY_ID` = ? and TM1.`TBW04_SUBJECT_ID` = ? and TM1.`TBW04_CRF_ID` = ? ORDER BY TM1.`TBW04_SESSION_ID`, TM1.`TBW04_APP_ID`, TM1.`TBW04_DISP_DATETIME`, TM1.`TBW04_STUDY_ID`, TM1.`TBW04_SUBJECT_ID`, TM1.`TBW04_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T00175", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID` FROM `TBW04_CRF` WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00176", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID` FROM `TBW04_CRF` WHERE ( `TBW04_SESSION_ID` > ? or `TBW04_SESSION_ID` = ? and `TBW04_APP_ID` > ? or `TBW04_APP_ID` = ? and `TBW04_SESSION_ID` = ? and `TBW04_DISP_DATETIME` > ? or `TBW04_DISP_DATETIME` = ? and `TBW04_APP_ID` = ? and `TBW04_SESSION_ID` = ? and `TBW04_STUDY_ID` > ? or `TBW04_STUDY_ID` = ? and `TBW04_DISP_DATETIME` = ? and `TBW04_APP_ID` = ? and `TBW04_SESSION_ID` = ? and `TBW04_SUBJECT_ID` > ? or `TBW04_SUBJECT_ID` = ? and `TBW04_STUDY_ID` = ? and `TBW04_DISP_DATETIME` = ? and `TBW04_APP_ID` = ? and `TBW04_SESSION_ID` = ? and `TBW04_CRF_ID` > ?) ORDER BY `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00177", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID` FROM `TBW04_CRF` WHERE ( `TBW04_SESSION_ID` < ? or `TBW04_SESSION_ID` = ? and `TBW04_APP_ID` < ? or `TBW04_APP_ID` = ? and `TBW04_SESSION_ID` = ? and `TBW04_DISP_DATETIME` < ? or `TBW04_DISP_DATETIME` = ? and `TBW04_APP_ID` = ? and `TBW04_SESSION_ID` = ? and `TBW04_STUDY_ID` < ? or `TBW04_STUDY_ID` = ? and `TBW04_DISP_DATETIME` = ? and `TBW04_APP_ID` = ? and `TBW04_SESSION_ID` = ? and `TBW04_SUBJECT_ID` < ? or `TBW04_SUBJECT_ID` = ? and `TBW04_STUDY_ID` = ? and `TBW04_DISP_DATETIME` = ? and `TBW04_APP_ID` = ? and `TBW04_SESSION_ID` = ? and `TBW04_CRF_ID` < ?) ORDER BY `TBW04_SESSION_ID` DESC, `TBW04_APP_ID` DESC, `TBW04_DISP_DATETIME` DESC, `TBW04_STUDY_ID` DESC, `TBW04_SUBJECT_ID` DESC, `TBW04_CRF_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00178", "INSERT INTO `TBW04_CRF` (`TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID`, `TBW04_CRF_LATEST_VERSION`, `TBW04_CRF_INPUT_LEVEL`, `TBW04_LOCK_FLG`, `TBW04_LOCK_DATETIME`, `TBW04_LOCK_USER_ID`, `TBW04_LOCK_AUTH_CD`, `TBW04_UPLOAD_DATETIME`, `TBW04_UPLOAD_USER_ID`, `TBW04_UPLOAD_AUTH_CD`, `TBW04_DM_ARRIVAL_FLG`, `TBW04_DM_ARRIVAL_DATETIME`, `TBW04_APPROVAL_FLG`, `TBW04_APPROVAL_DATETIME`, `TBW04_APPROVAL_USER_ID`, `TBW04_APPROVAL_AUTH_CD`, `TBW04_INPUT_END_FLG`, `TBW04_INPUT_END_DATETIME`, `TBW04_INPUT_END_USER_ID`, `TBW04_INPUT_END_AUTH_CD`, `TBW04_COMPLETION_FLG`, `TBW04_EDIT_FLG`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00179", "UPDATE `TBW04_CRF` SET `TBW04_CRF_LATEST_VERSION`=?, `TBW04_CRF_INPUT_LEVEL`=?, `TBW04_LOCK_FLG`=?, `TBW04_LOCK_DATETIME`=?, `TBW04_LOCK_USER_ID`=?, `TBW04_LOCK_AUTH_CD`=?, `TBW04_UPLOAD_DATETIME`=?, `TBW04_UPLOAD_USER_ID`=?, `TBW04_UPLOAD_AUTH_CD`=?, `TBW04_DM_ARRIVAL_FLG`=?, `TBW04_DM_ARRIVAL_DATETIME`=?, `TBW04_APPROVAL_FLG`=?, `TBW04_APPROVAL_DATETIME`=?, `TBW04_APPROVAL_USER_ID`=?, `TBW04_APPROVAL_AUTH_CD`=?, `TBW04_INPUT_END_FLG`=?, `TBW04_INPUT_END_DATETIME`=?, `TBW04_INPUT_END_USER_ID`=?, `TBW04_INPUT_END_AUTH_CD`=?, `TBW04_COMPLETION_FLG`=?, `TBW04_EDIT_FLG`=?  WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T001710", "DELETE FROM `TBW04_CRF`  WHERE `TBW04_SESSION_ID` = ? AND `TBW04_APP_ID` = ? AND `TBW04_DISP_DATETIME` = ? AND `TBW04_STUDY_ID` = ? AND `TBW04_SUBJECT_ID` = ? AND `TBW04_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T001711", "SELECT `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID` FROM `TBW04_CRF` ORDER BY `TBW04_SESSION_ID`, `TBW04_APP_ID`, `TBW04_DISP_DATETIME`, `TBW04_STUDY_ID`, `TBW04_SUBJECT_ID`, `TBW04_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((byte[]) buf[8])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
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
               ((byte[]) buf[8])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
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
               ((byte[]) buf[8])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[26])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[30])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((String[]) buf[32])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((String[]) buf[36])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[38])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((String[]) buf[44])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
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
                  stmt.setByte(8, ((Number) parms[9]).byteValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[13], false);
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
                  stmt.setVarchar(12, (String)parms[17], 2);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[21], 128);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[25], 1);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[27], false);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[31], false);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[33], 128);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[35], 2);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[37], 1);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(23, (java.util.Date)parms[39], false);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[41], 128);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[43], 2);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[45], 1);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[47], 1);
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
                  stmt.setByte(2, ((Number) parms[3]).byteValue());
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
                  stmt.setVarchar(6, (String)parms[11], 2);
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
                  stmt.setVarchar(20, (String)parms[39], 1);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[41], 1);
               }
               stmt.setVarchar(22, (String)parms[42], 50, false);
               stmt.setVarchar(23, (String)parms[43], 7, false);
               stmt.setVarchar(24, (String)parms[44], 14, false);
               stmt.setLong(25, ((Number) parms[45]).longValue());
               stmt.setInt(26, ((Number) parms[46]).intValue());
               stmt.setShort(27, ((Number) parms[47]).shortValue());
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

