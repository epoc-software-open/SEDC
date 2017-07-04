/*
               File: tbw13_csv_record_impl
        Description: CSVレコードワーク
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:19.29
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw13_csv_record_impl extends GXWebPanel
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
      Form.getMeta().addItem("Description", "CSVレコードワーク", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW13_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbw13_csv_record_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw13_csv_record_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw13_csv_record_impl.class ));
   }

   public tbw13_csv_record_impl( int remoteHandle ,
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
         wb_table1_2_1E49( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1E49e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1E49( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1E49( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1E49( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1E49e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CSVレコードワーク"+"</legend>") ;
         wb_table3_27_1E49( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1E49e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1E49e( true) ;
      }
      else
      {
         wb_table1_2_1E49e( false) ;
      }
   }

   public void wb_table3_27_1E49( boolean wbgen )
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
         wb_table4_33_1E49( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1E49e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 81,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW13_CSV_RECORD.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW13_CSV_RECORD.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1E49e( true) ;
      }
      else
      {
         wb_table3_27_1E49e( false) ;
      }
   }

   public void wb_table4_33_1E49( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw13_session_id_Internalname, "ID", "", "", lblTextblocktbw13_session_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A813TBW13_SESSION_ID", A813TBW13_SESSION_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW13_SESSION_ID_Internalname, GXutil.rtrim( A813TBW13_SESSION_ID), GXutil.rtrim( localUtil.format( A813TBW13_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTBW13_SESSION_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW13_SESSION_ID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw13_datetime_Internalname, "実行日時", "", "", lblTextblocktbw13_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW13_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW13_DATETIME_Internalname, localUtil.format(A814TBW13_DATETIME, "99/99/99 99:99"), localUtil.format( A814TBW13_DATETIME, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'YMD',5,24,'jap',false,0);"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBW13_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW13_DATETIME_Enabled, 0, 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW13_CSV_RECORD.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW13_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW13_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw13_study_id_Internalname, "ID", "", "", lblTextblocktbw13_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW13_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A815TBW13_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW13_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A815TBW13_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A815TBW13_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(48);\"", "", "", "", "", edtTBW13_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW13_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw13_subject_id_Internalname, "ID", "", "", lblTextblocktbw13_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW13_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A816TBW13_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW13_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A816TBW13_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A816TBW13_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBW13_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW13_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw13_visit_no_Internalname, "VISIT番号", "", "", lblTextblocktbw13_visit_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW13_VISIT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A817TBW13_VISIT_NO, (byte)(3), (byte)(0), ".", "")), ((edtTBW13_VISIT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A817TBW13_VISIT_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A817TBW13_VISIT_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBW13_VISIT_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW13_VISIT_NO_Enabled, 0, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw13_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbw13_dom_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A818TBW13_DOM_CD", A818TBW13_DOM_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW13_DOM_CD_Internalname, GXutil.rtrim( A818TBW13_DOM_CD), GXutil.rtrim( localUtil.format( A818TBW13_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBW13_DOM_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW13_DOM_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw13_dom_itm_grp_oid_Internalname, "OID", "", "", lblTextblocktbw13_dom_itm_grp_oid_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A819TBW13_DOM_ITM_GRP_OID", A819TBW13_DOM_ITM_GRP_OID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW13_DOM_ITM_GRP_OID_Internalname, GXutil.rtrim( A819TBW13_DOM_ITM_GRP_OID), GXutil.rtrim( localUtil.format( A819TBW13_DOM_ITM_GRP_OID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBW13_DOM_ITM_GRP_OID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW13_DOM_ITM_GRP_OID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw13_dom_itm_grp_rowno_Internalname, "ドメイン内項目グループ内連番", "", "", lblTextblocktbw13_dom_itm_grp_rowno_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW13_DOM_ITM_GRP_ROWNO_Internalname, GXutil.ltrim( localUtil.ntoc( A820TBW13_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")), ((edtTBW13_DOM_ITM_GRP_ROWNO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A820TBW13_DOM_ITM_GRP_ROWNO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A820TBW13_DOM_ITM_GRP_ROWNO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(73);\"", "", "", "", "", edtTBW13_DOM_ITM_GRP_ROWNO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW13_DOM_ITM_GRP_ROWNO_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw13_value_Internalname, "レコード", "", "", lblTextblocktbw13_value_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A821TBW13_VALUE", A821TBW13_VALUE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBW13_VALUE_Internalname, A821TBW13_VALUE, "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", (short)(0), 1, edtTBW13_VALUE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "50000", -1, "", true, "HLP_TBW13_CSV_RECORD.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1E49e( true) ;
      }
      else
      {
         wb_table4_33_1E49e( false) ;
      }
   }

   public void wb_table2_5_1E49( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW13_CSV_RECORD.htm");
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
         wb_table2_5_1E49e( true) ;
      }
      else
      {
         wb_table2_5_1E49e( false) ;
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A813TBW13_SESSION_ID = httpContext.cgiGet( edtTBW13_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A813TBW13_SESSION_ID", A813TBW13_SESSION_ID);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW13_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"実行日時"}), 1, "TBW13_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW13_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A814TBW13_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            else
            {
               A814TBW13_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW13_DATETIME_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW13_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW13_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW13_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW13_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A815TBW13_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
            }
            else
            {
               A815TBW13_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW13_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW13_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW13_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW13_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW13_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A816TBW13_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A816TBW13_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW13_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW13_VISIT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW13_VISIT_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW13_VISIT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW13_VISIT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A817TBW13_VISIT_NO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
            }
            else
            {
               A817TBW13_VISIT_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW13_VISIT_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
            }
            A818TBW13_DOM_CD = httpContext.cgiGet( edtTBW13_DOM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A818TBW13_DOM_CD", A818TBW13_DOM_CD);
            A819TBW13_DOM_ITM_GRP_OID = httpContext.cgiGet( edtTBW13_DOM_ITM_GRP_OID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A819TBW13_DOM_ITM_GRP_OID", A819TBW13_DOM_ITM_GRP_OID);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW13_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW13_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW13_DOM_ITM_GRP_ROWNO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW13_DOM_ITM_GRP_ROWNO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A820TBW13_DOM_ITM_GRP_ROWNO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            else
            {
               A820TBW13_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW13_DOM_ITM_GRP_ROWNO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            A821TBW13_VALUE = httpContext.cgiGet( edtTBW13_VALUE_Internalname) ;
            n821TBW13_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A821TBW13_VALUE", A821TBW13_VALUE);
            n821TBW13_VALUE = ((GXutil.strcmp("", A821TBW13_VALUE)==0) ? true : false) ;
            /* Read saved values. */
            Z813TBW13_SESSION_ID = httpContext.cgiGet( "Z813TBW13_SESSION_ID") ;
            Z814TBW13_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z814TBW13_DATETIME"), 0) ;
            Z815TBW13_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z815TBW13_STUDY_ID"), ".", ",") ;
            Z816TBW13_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z816TBW13_SUBJECT_ID"), ".", ",")) ;
            Z817TBW13_VISIT_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z817TBW13_VISIT_NO"), ".", ",")) ;
            Z818TBW13_DOM_CD = httpContext.cgiGet( "Z818TBW13_DOM_CD") ;
            Z819TBW13_DOM_ITM_GRP_OID = httpContext.cgiGet( "Z819TBW13_DOM_ITM_GRP_OID") ;
            Z820TBW13_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( "Z820TBW13_DOM_ITM_GRP_ROWNO"), ".", ",")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
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
               A813TBW13_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A813TBW13_SESSION_ID", A813TBW13_SESSION_ID);
               A814TBW13_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
               A815TBW13_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
               A816TBW13_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
               A817TBW13_VISIT_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
               A818TBW13_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A818TBW13_DOM_CD", A818TBW13_DOM_CD);
               A819TBW13_DOM_ITM_GRP_OID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A819TBW13_DOM_ITM_GRP_OID", A819TBW13_DOM_ITM_GRP_OID);
               A820TBW13_DOM_ITM_GRP_ROWNO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
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
            initAll1E49( ) ;
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
      disableAttributes1E49( ) ;
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

   public void resetCaption1E0( )
   {
   }

   public void zm1E49( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -2 )
      {
         Z813TBW13_SESSION_ID = A813TBW13_SESSION_ID ;
         Z814TBW13_DATETIME = A814TBW13_DATETIME ;
         Z815TBW13_STUDY_ID = A815TBW13_STUDY_ID ;
         Z816TBW13_SUBJECT_ID = A816TBW13_SUBJECT_ID ;
         Z817TBW13_VISIT_NO = A817TBW13_VISIT_NO ;
         Z818TBW13_DOM_CD = A818TBW13_DOM_CD ;
         Z819TBW13_DOM_ITM_GRP_OID = A819TBW13_DOM_ITM_GRP_OID ;
         Z820TBW13_DOM_ITM_GRP_ROWNO = A820TBW13_DOM_ITM_GRP_ROWNO ;
         Z821TBW13_VALUE = A821TBW13_VALUE ;
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

   public void load1E49( )
   {
      /* Using cursor T001E4 */
      pr_default.execute(2, new Object[] {A813TBW13_SESSION_ID, A814TBW13_DATETIME, new Long(A815TBW13_STUDY_ID), new Integer(A816TBW13_SUBJECT_ID), new Short(A817TBW13_VISIT_NO), A818TBW13_DOM_CD, A819TBW13_DOM_ITM_GRP_OID, new Short(A820TBW13_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A821TBW13_VALUE = T001E4_A821TBW13_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A821TBW13_VALUE", A821TBW13_VALUE);
         n821TBW13_VALUE = T001E4_n821TBW13_VALUE[0] ;
         zm1E49( -2) ;
      }
      pr_default.close(2);
      onLoadActions1E49( ) ;
   }

   public void onLoadActions1E49( )
   {
   }

   public void checkExtendedTable1E49( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.nullDate().equals(A814TBW13_DATETIME) || (( A814TBW13_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A814TBW13_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　実行日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1E49( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1E49( )
   {
      /* Using cursor T001E5 */
      pr_default.execute(3, new Object[] {A813TBW13_SESSION_ID, A814TBW13_DATETIME, new Long(A815TBW13_STUDY_ID), new Integer(A816TBW13_SUBJECT_ID), new Short(A817TBW13_VISIT_NO), A818TBW13_DOM_CD, A819TBW13_DOM_ITM_GRP_OID, new Short(A820TBW13_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound49 = (short)(1) ;
      }
      else
      {
         RcdFound49 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001E3 */
      pr_default.execute(1, new Object[] {A813TBW13_SESSION_ID, A814TBW13_DATETIME, new Long(A815TBW13_STUDY_ID), new Integer(A816TBW13_SUBJECT_ID), new Short(A817TBW13_VISIT_NO), A818TBW13_DOM_CD, A819TBW13_DOM_ITM_GRP_OID, new Short(A820TBW13_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1E49( 2) ;
         RcdFound49 = (short)(1) ;
         A813TBW13_SESSION_ID = T001E3_A813TBW13_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A813TBW13_SESSION_ID", A813TBW13_SESSION_ID);
         A814TBW13_DATETIME = T001E3_A814TBW13_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A815TBW13_STUDY_ID = T001E3_A815TBW13_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
         A816TBW13_SUBJECT_ID = T001E3_A816TBW13_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
         A817TBW13_VISIT_NO = T001E3_A817TBW13_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
         A818TBW13_DOM_CD = T001E3_A818TBW13_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A818TBW13_DOM_CD", A818TBW13_DOM_CD);
         A819TBW13_DOM_ITM_GRP_OID = T001E3_A819TBW13_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A819TBW13_DOM_ITM_GRP_OID", A819TBW13_DOM_ITM_GRP_OID);
         A820TBW13_DOM_ITM_GRP_ROWNO = T001E3_A820TBW13_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
         A821TBW13_VALUE = T001E3_A821TBW13_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A821TBW13_VALUE", A821TBW13_VALUE);
         n821TBW13_VALUE = T001E3_n821TBW13_VALUE[0] ;
         Z813TBW13_SESSION_ID = A813TBW13_SESSION_ID ;
         Z814TBW13_DATETIME = A814TBW13_DATETIME ;
         Z815TBW13_STUDY_ID = A815TBW13_STUDY_ID ;
         Z816TBW13_SUBJECT_ID = A816TBW13_SUBJECT_ID ;
         Z817TBW13_VISIT_NO = A817TBW13_VISIT_NO ;
         Z818TBW13_DOM_CD = A818TBW13_DOM_CD ;
         Z819TBW13_DOM_ITM_GRP_OID = A819TBW13_DOM_ITM_GRP_OID ;
         Z820TBW13_DOM_ITM_GRP_ROWNO = A820TBW13_DOM_ITM_GRP_ROWNO ;
         sMode49 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1E49( ) ;
         Gx_mode = sMode49 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound49 = (short)(0) ;
         initializeNonKey1E49( ) ;
         sMode49 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode49 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1E49( ) ;
      if ( RcdFound49 == 0 )
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
      RcdFound49 = (short)(0) ;
      /* Using cursor T001E6 */
      pr_default.execute(4, new Object[] {A813TBW13_SESSION_ID, A813TBW13_SESSION_ID, A814TBW13_DATETIME, A814TBW13_DATETIME, A813TBW13_SESSION_ID, new Long(A815TBW13_STUDY_ID), new Long(A815TBW13_STUDY_ID), A814TBW13_DATETIME, A813TBW13_SESSION_ID, new Integer(A816TBW13_SUBJECT_ID), new Integer(A816TBW13_SUBJECT_ID), new Long(A815TBW13_STUDY_ID), A814TBW13_DATETIME, A813TBW13_SESSION_ID, new Short(A817TBW13_VISIT_NO), new Short(A817TBW13_VISIT_NO), new Integer(A816TBW13_SUBJECT_ID), new Long(A815TBW13_STUDY_ID), A814TBW13_DATETIME, A813TBW13_SESSION_ID, A818TBW13_DOM_CD, A818TBW13_DOM_CD, new Short(A817TBW13_VISIT_NO), new Integer(A816TBW13_SUBJECT_ID), new Long(A815TBW13_STUDY_ID), A814TBW13_DATETIME, A813TBW13_SESSION_ID, A819TBW13_DOM_ITM_GRP_OID, A819TBW13_DOM_ITM_GRP_OID, A818TBW13_DOM_CD, new Short(A817TBW13_VISIT_NO), new Integer(A816TBW13_SUBJECT_ID), new Long(A815TBW13_STUDY_ID), A814TBW13_DATETIME, A813TBW13_SESSION_ID, new Short(A820TBW13_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && T001E6_A814TBW13_DATETIME[0].before( A814TBW13_DATETIME ) || T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E6_A815TBW13_STUDY_ID[0] < A815TBW13_STUDY_ID ) || ( T001E6_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E6_A816TBW13_SUBJECT_ID[0] < A816TBW13_SUBJECT_ID ) || ( T001E6_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E6_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E6_A817TBW13_VISIT_NO[0] < A817TBW13_VISIT_NO ) || ( T001E6_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E6_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E6_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001E6_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) < 0 ) || ( GXutil.strcmp(T001E6_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) == 0 ) && ( T001E6_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E6_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E6_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001E6_A819TBW13_DOM_ITM_GRP_OID[0], A819TBW13_DOM_ITM_GRP_OID) < 0 ) || ( GXutil.strcmp(T001E6_A819TBW13_DOM_ITM_GRP_OID[0], A819TBW13_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001E6_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) == 0 ) && ( T001E6_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E6_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E6_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E6_A820TBW13_DOM_ITM_GRP_ROWNO[0] < A820TBW13_DOM_ITM_GRP_ROWNO ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && T001E6_A814TBW13_DATETIME[0].after( A814TBW13_DATETIME ) || T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E6_A815TBW13_STUDY_ID[0] > A815TBW13_STUDY_ID ) || ( T001E6_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E6_A816TBW13_SUBJECT_ID[0] > A816TBW13_SUBJECT_ID ) || ( T001E6_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E6_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E6_A817TBW13_VISIT_NO[0] > A817TBW13_VISIT_NO ) || ( T001E6_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E6_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E6_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001E6_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) > 0 ) || ( GXutil.strcmp(T001E6_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) == 0 ) && ( T001E6_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E6_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E6_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001E6_A819TBW13_DOM_ITM_GRP_OID[0], A819TBW13_DOM_ITM_GRP_OID) > 0 ) || ( GXutil.strcmp(T001E6_A819TBW13_DOM_ITM_GRP_OID[0], A819TBW13_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001E6_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) == 0 ) && ( T001E6_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E6_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E6_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E6_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E6_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E6_A820TBW13_DOM_ITM_GRP_ROWNO[0] > A820TBW13_DOM_ITM_GRP_ROWNO ) ) )
         {
            A813TBW13_SESSION_ID = T001E6_A813TBW13_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A813TBW13_SESSION_ID", A813TBW13_SESSION_ID);
            A814TBW13_DATETIME = T001E6_A814TBW13_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A815TBW13_STUDY_ID = T001E6_A815TBW13_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
            A816TBW13_SUBJECT_ID = T001E6_A816TBW13_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
            A817TBW13_VISIT_NO = T001E6_A817TBW13_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
            A818TBW13_DOM_CD = T001E6_A818TBW13_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A818TBW13_DOM_CD", A818TBW13_DOM_CD);
            A819TBW13_DOM_ITM_GRP_OID = T001E6_A819TBW13_DOM_ITM_GRP_OID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A819TBW13_DOM_ITM_GRP_OID", A819TBW13_DOM_ITM_GRP_OID);
            A820TBW13_DOM_ITM_GRP_ROWNO = T001E6_A820TBW13_DOM_ITM_GRP_ROWNO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
            RcdFound49 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound49 = (short)(0) ;
      /* Using cursor T001E7 */
      pr_default.execute(5, new Object[] {A813TBW13_SESSION_ID, A813TBW13_SESSION_ID, A814TBW13_DATETIME, A814TBW13_DATETIME, A813TBW13_SESSION_ID, new Long(A815TBW13_STUDY_ID), new Long(A815TBW13_STUDY_ID), A814TBW13_DATETIME, A813TBW13_SESSION_ID, new Integer(A816TBW13_SUBJECT_ID), new Integer(A816TBW13_SUBJECT_ID), new Long(A815TBW13_STUDY_ID), A814TBW13_DATETIME, A813TBW13_SESSION_ID, new Short(A817TBW13_VISIT_NO), new Short(A817TBW13_VISIT_NO), new Integer(A816TBW13_SUBJECT_ID), new Long(A815TBW13_STUDY_ID), A814TBW13_DATETIME, A813TBW13_SESSION_ID, A818TBW13_DOM_CD, A818TBW13_DOM_CD, new Short(A817TBW13_VISIT_NO), new Integer(A816TBW13_SUBJECT_ID), new Long(A815TBW13_STUDY_ID), A814TBW13_DATETIME, A813TBW13_SESSION_ID, A819TBW13_DOM_ITM_GRP_OID, A819TBW13_DOM_ITM_GRP_OID, A818TBW13_DOM_CD, new Short(A817TBW13_VISIT_NO), new Integer(A816TBW13_SUBJECT_ID), new Long(A815TBW13_STUDY_ID), A814TBW13_DATETIME, A813TBW13_SESSION_ID, new Short(A820TBW13_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && T001E7_A814TBW13_DATETIME[0].after( A814TBW13_DATETIME ) || T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E7_A815TBW13_STUDY_ID[0] > A815TBW13_STUDY_ID ) || ( T001E7_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E7_A816TBW13_SUBJECT_ID[0] > A816TBW13_SUBJECT_ID ) || ( T001E7_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E7_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E7_A817TBW13_VISIT_NO[0] > A817TBW13_VISIT_NO ) || ( T001E7_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E7_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E7_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001E7_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) > 0 ) || ( GXutil.strcmp(T001E7_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) == 0 ) && ( T001E7_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E7_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E7_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001E7_A819TBW13_DOM_ITM_GRP_OID[0], A819TBW13_DOM_ITM_GRP_OID) > 0 ) || ( GXutil.strcmp(T001E7_A819TBW13_DOM_ITM_GRP_OID[0], A819TBW13_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001E7_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) == 0 ) && ( T001E7_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E7_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E7_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E7_A820TBW13_DOM_ITM_GRP_ROWNO[0] > A820TBW13_DOM_ITM_GRP_ROWNO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && T001E7_A814TBW13_DATETIME[0].before( A814TBW13_DATETIME ) || T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E7_A815TBW13_STUDY_ID[0] < A815TBW13_STUDY_ID ) || ( T001E7_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E7_A816TBW13_SUBJECT_ID[0] < A816TBW13_SUBJECT_ID ) || ( T001E7_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E7_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E7_A817TBW13_VISIT_NO[0] < A817TBW13_VISIT_NO ) || ( T001E7_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E7_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E7_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001E7_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) < 0 ) || ( GXutil.strcmp(T001E7_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) == 0 ) && ( T001E7_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E7_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E7_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001E7_A819TBW13_DOM_ITM_GRP_OID[0], A819TBW13_DOM_ITM_GRP_OID) < 0 ) || ( GXutil.strcmp(T001E7_A819TBW13_DOM_ITM_GRP_OID[0], A819TBW13_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001E7_A818TBW13_DOM_CD[0], A818TBW13_DOM_CD) == 0 ) && ( T001E7_A817TBW13_VISIT_NO[0] == A817TBW13_VISIT_NO ) && ( T001E7_A816TBW13_SUBJECT_ID[0] == A816TBW13_SUBJECT_ID ) && ( T001E7_A815TBW13_STUDY_ID[0] == A815TBW13_STUDY_ID ) && T001E7_A814TBW13_DATETIME[0].equals( A814TBW13_DATETIME ) && ( GXutil.strcmp(T001E7_A813TBW13_SESSION_ID[0], A813TBW13_SESSION_ID) == 0 ) && ( T001E7_A820TBW13_DOM_ITM_GRP_ROWNO[0] < A820TBW13_DOM_ITM_GRP_ROWNO ) ) )
         {
            A813TBW13_SESSION_ID = T001E7_A813TBW13_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A813TBW13_SESSION_ID", A813TBW13_SESSION_ID);
            A814TBW13_DATETIME = T001E7_A814TBW13_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A815TBW13_STUDY_ID = T001E7_A815TBW13_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
            A816TBW13_SUBJECT_ID = T001E7_A816TBW13_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
            A817TBW13_VISIT_NO = T001E7_A817TBW13_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
            A818TBW13_DOM_CD = T001E7_A818TBW13_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A818TBW13_DOM_CD", A818TBW13_DOM_CD);
            A819TBW13_DOM_ITM_GRP_OID = T001E7_A819TBW13_DOM_ITM_GRP_OID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A819TBW13_DOM_ITM_GRP_OID", A819TBW13_DOM_ITM_GRP_OID);
            A820TBW13_DOM_ITM_GRP_ROWNO = T001E7_A820TBW13_DOM_ITM_GRP_ROWNO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
            RcdFound49 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1E49( ) ;
      if ( RcdFound49 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBW13_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW13_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A813TBW13_SESSION_ID, Z813TBW13_SESSION_ID) != 0 ) || !( A814TBW13_DATETIME.equals( Z814TBW13_DATETIME ) ) || ( A815TBW13_STUDY_ID != Z815TBW13_STUDY_ID ) || ( A816TBW13_SUBJECT_ID != Z816TBW13_SUBJECT_ID ) || ( A817TBW13_VISIT_NO != Z817TBW13_VISIT_NO ) || ( GXutil.strcmp(A818TBW13_DOM_CD, Z818TBW13_DOM_CD) != 0 ) || ( GXutil.strcmp(A819TBW13_DOM_ITM_GRP_OID, Z819TBW13_DOM_ITM_GRP_OID) != 0 ) || ( A820TBW13_DOM_ITM_GRP_ROWNO != Z820TBW13_DOM_ITM_GRP_ROWNO ) )
         {
            A813TBW13_SESSION_ID = Z813TBW13_SESSION_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A813TBW13_SESSION_ID", A813TBW13_SESSION_ID);
            A814TBW13_DATETIME = Z814TBW13_DATETIME ;
            httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A815TBW13_STUDY_ID = Z815TBW13_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
            A816TBW13_SUBJECT_ID = Z816TBW13_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
            A817TBW13_VISIT_NO = Z817TBW13_VISIT_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
            A818TBW13_DOM_CD = Z818TBW13_DOM_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A818TBW13_DOM_CD", A818TBW13_DOM_CD);
            A819TBW13_DOM_ITM_GRP_OID = Z819TBW13_DOM_ITM_GRP_OID ;
            httpContext.ajax_rsp_assign_attri("", false, "A819TBW13_DOM_ITM_GRP_OID", A819TBW13_DOM_ITM_GRP_OID);
            A820TBW13_DOM_ITM_GRP_ROWNO = Z820TBW13_DOM_ITM_GRP_ROWNO ;
            httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW13_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW13_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBW13_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update1E49( ) ;
            GX_FocusControl = edtTBW13_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A813TBW13_SESSION_ID, Z813TBW13_SESSION_ID) != 0 ) || !( A814TBW13_DATETIME.equals( Z814TBW13_DATETIME ) ) || ( A815TBW13_STUDY_ID != Z815TBW13_STUDY_ID ) || ( A816TBW13_SUBJECT_ID != Z816TBW13_SUBJECT_ID ) || ( A817TBW13_VISIT_NO != Z817TBW13_VISIT_NO ) || ( GXutil.strcmp(A818TBW13_DOM_CD, Z818TBW13_DOM_CD) != 0 ) || ( GXutil.strcmp(A819TBW13_DOM_ITM_GRP_OID, Z819TBW13_DOM_ITM_GRP_OID) != 0 ) || ( A820TBW13_DOM_ITM_GRP_ROWNO != Z820TBW13_DOM_ITM_GRP_ROWNO ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBW13_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert1E49( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW13_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW13_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW13_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1E49( ) ;
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
      if ( ( GXutil.strcmp(A813TBW13_SESSION_ID, Z813TBW13_SESSION_ID) != 0 ) || !( A814TBW13_DATETIME.equals( Z814TBW13_DATETIME ) ) || ( A815TBW13_STUDY_ID != Z815TBW13_STUDY_ID ) || ( A816TBW13_SUBJECT_ID != Z816TBW13_SUBJECT_ID ) || ( A817TBW13_VISIT_NO != Z817TBW13_VISIT_NO ) || ( GXutil.strcmp(A818TBW13_DOM_CD, Z818TBW13_DOM_CD) != 0 ) || ( GXutil.strcmp(A819TBW13_DOM_ITM_GRP_OID, Z819TBW13_DOM_ITM_GRP_OID) != 0 ) || ( A820TBW13_DOM_ITM_GRP_ROWNO != Z820TBW13_DOM_ITM_GRP_ROWNO ) )
      {
         A813TBW13_SESSION_ID = Z813TBW13_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A813TBW13_SESSION_ID", A813TBW13_SESSION_ID);
         A814TBW13_DATETIME = Z814TBW13_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A815TBW13_STUDY_ID = Z815TBW13_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
         A816TBW13_SUBJECT_ID = Z816TBW13_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
         A817TBW13_VISIT_NO = Z817TBW13_VISIT_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
         A818TBW13_DOM_CD = Z818TBW13_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A818TBW13_DOM_CD", A818TBW13_DOM_CD);
         A819TBW13_DOM_ITM_GRP_OID = Z819TBW13_DOM_ITM_GRP_OID ;
         httpContext.ajax_rsp_assign_attri("", false, "A819TBW13_DOM_ITM_GRP_OID", A819TBW13_DOM_ITM_GRP_OID);
         A820TBW13_DOM_ITM_GRP_ROWNO = Z820TBW13_DOM_ITM_GRP_ROWNO ;
         httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW13_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW13_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW13_SESSION_ID_Internalname ;
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
      if ( RcdFound49 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW13_SESSION_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBW13_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1E49( ) ;
      if ( RcdFound49 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW13_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1E49( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound49 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW13_VALUE_Internalname ;
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
      if ( RcdFound49 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW13_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1E49( ) ;
      if ( RcdFound49 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound49 != 0 )
         {
            scanNext1E49( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW13_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1E49( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1E49( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001E2 */
         pr_default.execute(0, new Object[] {A813TBW13_SESSION_ID, A814TBW13_DATETIME, new Long(A815TBW13_STUDY_ID), new Integer(A816TBW13_SUBJECT_ID), new Short(A817TBW13_VISIT_NO), A818TBW13_DOM_CD, A819TBW13_DOM_ITM_GRP_OID, new Short(A820TBW13_DOM_ITM_GRP_ROWNO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW13_CSV_RECORD"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW13_CSV_RECORD"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1E49( )
   {
      beforeValidate1E49( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1E49( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1E49( 0) ;
         checkOptimisticConcurrency1E49( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1E49( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1E49( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001E8 */
                  pr_default.execute(6, new Object[] {A813TBW13_SESSION_ID, A814TBW13_DATETIME, new Long(A815TBW13_STUDY_ID), new Integer(A816TBW13_SUBJECT_ID), new Short(A817TBW13_VISIT_NO), A818TBW13_DOM_CD, A819TBW13_DOM_ITM_GRP_OID, new Short(A820TBW13_DOM_ITM_GRP_ROWNO), new Boolean(n821TBW13_VALUE), A821TBW13_VALUE});
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
                        resetCaption1E0( ) ;
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
            load1E49( ) ;
         }
         endLevel1E49( ) ;
      }
      closeExtendedTableCursors1E49( ) ;
   }

   public void update1E49( )
   {
      beforeValidate1E49( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1E49( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1E49( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1E49( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1E49( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001E9 */
                  pr_default.execute(7, new Object[] {new Boolean(n821TBW13_VALUE), A821TBW13_VALUE, A813TBW13_SESSION_ID, A814TBW13_DATETIME, new Long(A815TBW13_STUDY_ID), new Integer(A816TBW13_SUBJECT_ID), new Short(A817TBW13_VISIT_NO), A818TBW13_DOM_CD, A819TBW13_DOM_ITM_GRP_OID, new Short(A820TBW13_DOM_ITM_GRP_ROWNO)});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW13_CSV_RECORD"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1E49( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption1E0( ) ;
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
         endLevel1E49( ) ;
      }
      closeExtendedTableCursors1E49( ) ;
   }

   public void deferredUpdate1E49( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1E49( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1E49( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1E49( ) ;
         afterConfirm1E49( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1E49( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001E10 */
               pr_default.execute(8, new Object[] {A813TBW13_SESSION_ID, A814TBW13_DATETIME, new Long(A815TBW13_STUDY_ID), new Integer(A816TBW13_SUBJECT_ID), new Short(A817TBW13_VISIT_NO), A818TBW13_DOM_CD, A819TBW13_DOM_ITM_GRP_OID, new Short(A820TBW13_DOM_ITM_GRP_ROWNO)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound49 == 0 )
                     {
                        initAll1E49( ) ;
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
                     resetCaption1E0( ) ;
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
      sMode49 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1E49( ) ;
      Gx_mode = sMode49 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1E49( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1E49( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1E49( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw13_csv_record");
         if ( AnyError == 0 )
         {
            confirmValues1E0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw13_csv_record");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1E49( )
   {
      /* Using cursor T001E11 */
      pr_default.execute(9);
      RcdFound49 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A813TBW13_SESSION_ID = T001E11_A813TBW13_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A813TBW13_SESSION_ID", A813TBW13_SESSION_ID);
         A814TBW13_DATETIME = T001E11_A814TBW13_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A815TBW13_STUDY_ID = T001E11_A815TBW13_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
         A816TBW13_SUBJECT_ID = T001E11_A816TBW13_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
         A817TBW13_VISIT_NO = T001E11_A817TBW13_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
         A818TBW13_DOM_CD = T001E11_A818TBW13_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A818TBW13_DOM_CD", A818TBW13_DOM_CD);
         A819TBW13_DOM_ITM_GRP_OID = T001E11_A819TBW13_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A819TBW13_DOM_ITM_GRP_OID", A819TBW13_DOM_ITM_GRP_OID);
         A820TBW13_DOM_ITM_GRP_ROWNO = T001E11_A820TBW13_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1E49( )
   {
      pr_default.readNext(9);
      RcdFound49 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound49 = (short)(1) ;
         A813TBW13_SESSION_ID = T001E11_A813TBW13_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A813TBW13_SESSION_ID", A813TBW13_SESSION_ID);
         A814TBW13_DATETIME = T001E11_A814TBW13_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A815TBW13_STUDY_ID = T001E11_A815TBW13_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
         A816TBW13_SUBJECT_ID = T001E11_A816TBW13_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
         A817TBW13_VISIT_NO = T001E11_A817TBW13_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
         A818TBW13_DOM_CD = T001E11_A818TBW13_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A818TBW13_DOM_CD", A818TBW13_DOM_CD);
         A819TBW13_DOM_ITM_GRP_OID = T001E11_A819TBW13_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A819TBW13_DOM_ITM_GRP_OID", A819TBW13_DOM_ITM_GRP_OID);
         A820TBW13_DOM_ITM_GRP_ROWNO = T001E11_A820TBW13_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
      }
   }

   public void scanEnd1E49( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1E49( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1E49( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1E49( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1E49( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1E49( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1E49( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1E49( )
   {
      edtTBW13_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW13_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW13_SESSION_ID_Enabled, 5, 0)));
      edtTBW13_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW13_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW13_DATETIME_Enabled, 5, 0)));
      edtTBW13_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW13_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW13_STUDY_ID_Enabled, 5, 0)));
      edtTBW13_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW13_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW13_SUBJECT_ID_Enabled, 5, 0)));
      edtTBW13_VISIT_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW13_VISIT_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW13_VISIT_NO_Enabled, 5, 0)));
      edtTBW13_DOM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW13_DOM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW13_DOM_CD_Enabled, 5, 0)));
      edtTBW13_DOM_ITM_GRP_OID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW13_DOM_ITM_GRP_OID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW13_DOM_ITM_GRP_OID_Enabled, 5, 0)));
      edtTBW13_DOM_ITM_GRP_ROWNO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW13_DOM_ITM_GRP_ROWNO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW13_DOM_ITM_GRP_ROWNO_Enabled, 5, 0)));
      edtTBW13_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW13_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW13_VALUE_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1E0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CSVレコードワーク") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbw13_csv_record") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1E49( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z813TBW13_SESSION_ID", GXutil.rtrim( Z813TBW13_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z814TBW13_DATETIME", localUtil.ttoc( Z814TBW13_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z815TBW13_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z815TBW13_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z816TBW13_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z816TBW13_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z817TBW13_VISIT_NO", GXutil.ltrim( localUtil.ntoc( Z817TBW13_VISIT_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z818TBW13_DOM_CD", GXutil.rtrim( Z818TBW13_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z819TBW13_DOM_ITM_GRP_OID", GXutil.rtrim( Z819TBW13_DOM_ITM_GRP_OID));
      GxWebStd.gx_hidden_field( httpContext, "Z820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( localUtil.ntoc( Z820TBW13_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
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

   public void initializeNonKey1E49( )
   {
      A821TBW13_VALUE = "" ;
      n821TBW13_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A821TBW13_VALUE", A821TBW13_VALUE);
      n821TBW13_VALUE = ((GXutil.strcmp("", A821TBW13_VALUE)==0) ? true : false) ;
   }

   public void initAll1E49( )
   {
      A813TBW13_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A813TBW13_SESSION_ID", A813TBW13_SESSION_ID);
      A814TBW13_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A814TBW13_DATETIME", localUtil.ttoc( A814TBW13_DATETIME, 8, 5, 0, 1, "/", ":", " "));
      A815TBW13_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A815TBW13_STUDY_ID", GXutil.ltrim( GXutil.str( A815TBW13_STUDY_ID, 10, 0)));
      A816TBW13_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A816TBW13_SUBJECT_ID", GXutil.ltrim( GXutil.str( A816TBW13_SUBJECT_ID, 6, 0)));
      A817TBW13_VISIT_NO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A817TBW13_VISIT_NO", GXutil.ltrim( GXutil.str( A817TBW13_VISIT_NO, 3, 0)));
      A818TBW13_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A818TBW13_DOM_CD", A818TBW13_DOM_CD);
      A819TBW13_DOM_ITM_GRP_OID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A819TBW13_DOM_ITM_GRP_OID", A819TBW13_DOM_ITM_GRP_OID);
      A820TBW13_DOM_ITM_GRP_ROWNO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A820TBW13_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A820TBW13_DOM_ITM_GRP_ROWNO, 4, 0)));
      initializeNonKey1E49( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14572040");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbw13_csv_record.js", "?14572040");
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
      lblTextblocktbw13_session_id_Internalname = "TEXTBLOCKTBW13_SESSION_ID" ;
      edtTBW13_SESSION_ID_Internalname = "TBW13_SESSION_ID" ;
      lblTextblocktbw13_datetime_Internalname = "TEXTBLOCKTBW13_DATETIME" ;
      edtTBW13_DATETIME_Internalname = "TBW13_DATETIME" ;
      lblTextblocktbw13_study_id_Internalname = "TEXTBLOCKTBW13_STUDY_ID" ;
      edtTBW13_STUDY_ID_Internalname = "TBW13_STUDY_ID" ;
      lblTextblocktbw13_subject_id_Internalname = "TEXTBLOCKTBW13_SUBJECT_ID" ;
      edtTBW13_SUBJECT_ID_Internalname = "TBW13_SUBJECT_ID" ;
      lblTextblocktbw13_visit_no_Internalname = "TEXTBLOCKTBW13_VISIT_NO" ;
      edtTBW13_VISIT_NO_Internalname = "TBW13_VISIT_NO" ;
      lblTextblocktbw13_dom_cd_Internalname = "TEXTBLOCKTBW13_DOM_CD" ;
      edtTBW13_DOM_CD_Internalname = "TBW13_DOM_CD" ;
      lblTextblocktbw13_dom_itm_grp_oid_Internalname = "TEXTBLOCKTBW13_DOM_ITM_GRP_OID" ;
      edtTBW13_DOM_ITM_GRP_OID_Internalname = "TBW13_DOM_ITM_GRP_OID" ;
      lblTextblocktbw13_dom_itm_grp_rowno_Internalname = "TEXTBLOCKTBW13_DOM_ITM_GRP_ROWNO" ;
      edtTBW13_DOM_ITM_GRP_ROWNO_Internalname = "TBW13_DOM_ITM_GRP_ROWNO" ;
      lblTextblocktbw13_value_Internalname = "TEXTBLOCKTBW13_VALUE" ;
      edtTBW13_VALUE_Internalname = "TBW13_VALUE" ;
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
      edtTBW13_VALUE_Enabled = 1 ;
      edtTBW13_DOM_ITM_GRP_ROWNO_Jsonclick = "" ;
      edtTBW13_DOM_ITM_GRP_ROWNO_Enabled = 1 ;
      edtTBW13_DOM_ITM_GRP_OID_Jsonclick = "" ;
      edtTBW13_DOM_ITM_GRP_OID_Enabled = 1 ;
      edtTBW13_DOM_CD_Jsonclick = "" ;
      edtTBW13_DOM_CD_Enabled = 1 ;
      edtTBW13_VISIT_NO_Jsonclick = "" ;
      edtTBW13_VISIT_NO_Enabled = 1 ;
      edtTBW13_SUBJECT_ID_Jsonclick = "" ;
      edtTBW13_SUBJECT_ID_Enabled = 1 ;
      edtTBW13_STUDY_ID_Jsonclick = "" ;
      edtTBW13_STUDY_ID_Enabled = 1 ;
      edtTBW13_DATETIME_Jsonclick = "" ;
      edtTBW13_DATETIME_Enabled = 1 ;
      edtTBW13_SESSION_ID_Jsonclick = "" ;
      edtTBW13_SESSION_ID_Enabled = 1 ;
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
      GX_FocusControl = edtTBW13_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw13_dom_itm_grp_rowno( String GX_Parm1 ,
                                              java.util.Date GX_Parm2 ,
                                              long GX_Parm3 ,
                                              int GX_Parm4 ,
                                              short GX_Parm5 ,
                                              String GX_Parm6 ,
                                              String GX_Parm7 ,
                                              short GX_Parm8 ,
                                              String GX_Parm9 )
   {
      A813TBW13_SESSION_ID = GX_Parm1 ;
      A814TBW13_DATETIME = GX_Parm2 ;
      A815TBW13_STUDY_ID = GX_Parm3 ;
      A816TBW13_SUBJECT_ID = GX_Parm4 ;
      A817TBW13_VISIT_NO = GX_Parm5 ;
      A818TBW13_DOM_CD = GX_Parm6 ;
      A819TBW13_DOM_ITM_GRP_OID = GX_Parm7 ;
      A820TBW13_DOM_ITM_GRP_ROWNO = GX_Parm8 ;
      A821TBW13_VALUE = GX_Parm9 ;
      n821TBW13_VALUE = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(A821TBW13_VALUE);
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z813TBW13_SESSION_ID));
      isValidOutput.add(localUtil.ttoc( Z814TBW13_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z815TBW13_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z816TBW13_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z817TBW13_VISIT_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z818TBW13_DOM_CD));
      isValidOutput.add(GXutil.rtrim( Z819TBW13_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z820TBW13_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(Z821TBW13_VALUE);
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
      lblTextblocktbw13_session_id_Jsonclick = "" ;
      A813TBW13_SESSION_ID = "" ;
      lblTextblocktbw13_datetime_Jsonclick = "" ;
      A814TBW13_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw13_study_id_Jsonclick = "" ;
      lblTextblocktbw13_subject_id_Jsonclick = "" ;
      lblTextblocktbw13_visit_no_Jsonclick = "" ;
      lblTextblocktbw13_dom_cd_Jsonclick = "" ;
      A818TBW13_DOM_CD = "" ;
      lblTextblocktbw13_dom_itm_grp_oid_Jsonclick = "" ;
      A819TBW13_DOM_ITM_GRP_OID = "" ;
      lblTextblocktbw13_dom_itm_grp_rowno_Jsonclick = "" ;
      lblTextblocktbw13_value_Jsonclick = "" ;
      A821TBW13_VALUE = "" ;
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
      Z813TBW13_SESSION_ID = "" ;
      Z814TBW13_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z818TBW13_DOM_CD = "" ;
      Z819TBW13_DOM_ITM_GRP_OID = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      Z821TBW13_VALUE = "" ;
      T001E4_A813TBW13_SESSION_ID = new String[] {""} ;
      T001E4_A814TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001E4_A815TBW13_STUDY_ID = new long[1] ;
      T001E4_A816TBW13_SUBJECT_ID = new int[1] ;
      T001E4_A817TBW13_VISIT_NO = new short[1] ;
      T001E4_A818TBW13_DOM_CD = new String[] {""} ;
      T001E4_A819TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      T001E4_A820TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001E4_A821TBW13_VALUE = new String[] {""} ;
      T001E4_n821TBW13_VALUE = new boolean[] {false} ;
      T001E5_A813TBW13_SESSION_ID = new String[] {""} ;
      T001E5_A814TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001E5_A815TBW13_STUDY_ID = new long[1] ;
      T001E5_A816TBW13_SUBJECT_ID = new int[1] ;
      T001E5_A817TBW13_VISIT_NO = new short[1] ;
      T001E5_A818TBW13_DOM_CD = new String[] {""} ;
      T001E5_A819TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      T001E5_A820TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001E3_A813TBW13_SESSION_ID = new String[] {""} ;
      T001E3_A814TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001E3_A815TBW13_STUDY_ID = new long[1] ;
      T001E3_A816TBW13_SUBJECT_ID = new int[1] ;
      T001E3_A817TBW13_VISIT_NO = new short[1] ;
      T001E3_A818TBW13_DOM_CD = new String[] {""} ;
      T001E3_A819TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      T001E3_A820TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001E3_A821TBW13_VALUE = new String[] {""} ;
      T001E3_n821TBW13_VALUE = new boolean[] {false} ;
      sMode49 = "" ;
      T001E6_A813TBW13_SESSION_ID = new String[] {""} ;
      T001E6_A814TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001E6_A815TBW13_STUDY_ID = new long[1] ;
      T001E6_A816TBW13_SUBJECT_ID = new int[1] ;
      T001E6_A817TBW13_VISIT_NO = new short[1] ;
      T001E6_A818TBW13_DOM_CD = new String[] {""} ;
      T001E6_A819TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      T001E6_A820TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001E7_A813TBW13_SESSION_ID = new String[] {""} ;
      T001E7_A814TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001E7_A815TBW13_STUDY_ID = new long[1] ;
      T001E7_A816TBW13_SUBJECT_ID = new int[1] ;
      T001E7_A817TBW13_VISIT_NO = new short[1] ;
      T001E7_A818TBW13_DOM_CD = new String[] {""} ;
      T001E7_A819TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      T001E7_A820TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001E2_A813TBW13_SESSION_ID = new String[] {""} ;
      T001E2_A814TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001E2_A815TBW13_STUDY_ID = new long[1] ;
      T001E2_A816TBW13_SUBJECT_ID = new int[1] ;
      T001E2_A817TBW13_VISIT_NO = new short[1] ;
      T001E2_A818TBW13_DOM_CD = new String[] {""} ;
      T001E2_A819TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      T001E2_A820TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001E2_A821TBW13_VALUE = new String[] {""} ;
      T001E2_n821TBW13_VALUE = new boolean[] {false} ;
      T001E11_A813TBW13_SESSION_ID = new String[] {""} ;
      T001E11_A814TBW13_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001E11_A815TBW13_STUDY_ID = new long[1] ;
      T001E11_A816TBW13_SUBJECT_ID = new int[1] ;
      T001E11_A817TBW13_VISIT_NO = new short[1] ;
      T001E11_A818TBW13_DOM_CD = new String[] {""} ;
      T001E11_A819TBW13_DOM_ITM_GRP_OID = new String[] {""} ;
      T001E11_A820TBW13_DOM_ITM_GRP_ROWNO = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char3 = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw13_csv_record__default(),
         new Object[] {
             new Object[] {
            T001E2_A813TBW13_SESSION_ID, T001E2_A814TBW13_DATETIME, T001E2_A815TBW13_STUDY_ID, T001E2_A816TBW13_SUBJECT_ID, T001E2_A817TBW13_VISIT_NO, T001E2_A818TBW13_DOM_CD, T001E2_A819TBW13_DOM_ITM_GRP_OID, T001E2_A820TBW13_DOM_ITM_GRP_ROWNO, T001E2_A821TBW13_VALUE, T001E2_n821TBW13_VALUE
            }
            , new Object[] {
            T001E3_A813TBW13_SESSION_ID, T001E3_A814TBW13_DATETIME, T001E3_A815TBW13_STUDY_ID, T001E3_A816TBW13_SUBJECT_ID, T001E3_A817TBW13_VISIT_NO, T001E3_A818TBW13_DOM_CD, T001E3_A819TBW13_DOM_ITM_GRP_OID, T001E3_A820TBW13_DOM_ITM_GRP_ROWNO, T001E3_A821TBW13_VALUE, T001E3_n821TBW13_VALUE
            }
            , new Object[] {
            T001E4_A813TBW13_SESSION_ID, T001E4_A814TBW13_DATETIME, T001E4_A815TBW13_STUDY_ID, T001E4_A816TBW13_SUBJECT_ID, T001E4_A817TBW13_VISIT_NO, T001E4_A818TBW13_DOM_CD, T001E4_A819TBW13_DOM_ITM_GRP_OID, T001E4_A820TBW13_DOM_ITM_GRP_ROWNO, T001E4_A821TBW13_VALUE, T001E4_n821TBW13_VALUE
            }
            , new Object[] {
            T001E5_A813TBW13_SESSION_ID, T001E5_A814TBW13_DATETIME, T001E5_A815TBW13_STUDY_ID, T001E5_A816TBW13_SUBJECT_ID, T001E5_A817TBW13_VISIT_NO, T001E5_A818TBW13_DOM_CD, T001E5_A819TBW13_DOM_ITM_GRP_OID, T001E5_A820TBW13_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            T001E6_A813TBW13_SESSION_ID, T001E6_A814TBW13_DATETIME, T001E6_A815TBW13_STUDY_ID, T001E6_A816TBW13_SUBJECT_ID, T001E6_A817TBW13_VISIT_NO, T001E6_A818TBW13_DOM_CD, T001E6_A819TBW13_DOM_ITM_GRP_OID, T001E6_A820TBW13_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            T001E7_A813TBW13_SESSION_ID, T001E7_A814TBW13_DATETIME, T001E7_A815TBW13_STUDY_ID, T001E7_A816TBW13_SUBJECT_ID, T001E7_A817TBW13_VISIT_NO, T001E7_A818TBW13_DOM_CD, T001E7_A819TBW13_DOM_ITM_GRP_OID, T001E7_A820TBW13_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001E11_A813TBW13_SESSION_ID, T001E11_A814TBW13_DATETIME, T001E11_A815TBW13_STUDY_ID, T001E11_A816TBW13_SUBJECT_ID, T001E11_A817TBW13_VISIT_NO, T001E11_A818TBW13_DOM_CD, T001E11_A819TBW13_DOM_ITM_GRP_OID, T001E11_A820TBW13_DOM_ITM_GRP_ROWNO
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A817TBW13_VISIT_NO ;
   private short A820TBW13_DOM_ITM_GRP_ROWNO ;
   private short Z817TBW13_VISIT_NO ;
   private short Z820TBW13_DOM_ITM_GRP_ROWNO ;
   private short RcdFound49 ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW13_SESSION_ID_Enabled ;
   private int edtTBW13_DATETIME_Enabled ;
   private int edtTBW13_STUDY_ID_Enabled ;
   private int A816TBW13_SUBJECT_ID ;
   private int edtTBW13_SUBJECT_ID_Enabled ;
   private int edtTBW13_VISIT_NO_Enabled ;
   private int edtTBW13_DOM_CD_Enabled ;
   private int edtTBW13_DOM_ITM_GRP_OID_Enabled ;
   private int edtTBW13_DOM_ITM_GRP_ROWNO_Enabled ;
   private int edtTBW13_VALUE_Enabled ;
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
   private int Z816TBW13_SUBJECT_ID ;
   private int GX_JID ;
   private int idxLst ;
   private long A815TBW13_STUDY_ID ;
   private long Z815TBW13_STUDY_ID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW13_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw13_session_id_Internalname ;
   private String lblTextblocktbw13_session_id_Jsonclick ;
   private String edtTBW13_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw13_datetime_Internalname ;
   private String lblTextblocktbw13_datetime_Jsonclick ;
   private String edtTBW13_DATETIME_Internalname ;
   private String edtTBW13_DATETIME_Jsonclick ;
   private String lblTextblocktbw13_study_id_Internalname ;
   private String lblTextblocktbw13_study_id_Jsonclick ;
   private String edtTBW13_STUDY_ID_Internalname ;
   private String edtTBW13_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw13_subject_id_Internalname ;
   private String lblTextblocktbw13_subject_id_Jsonclick ;
   private String edtTBW13_SUBJECT_ID_Internalname ;
   private String edtTBW13_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbw13_visit_no_Internalname ;
   private String lblTextblocktbw13_visit_no_Jsonclick ;
   private String edtTBW13_VISIT_NO_Internalname ;
   private String edtTBW13_VISIT_NO_Jsonclick ;
   private String lblTextblocktbw13_dom_cd_Internalname ;
   private String lblTextblocktbw13_dom_cd_Jsonclick ;
   private String edtTBW13_DOM_CD_Internalname ;
   private String edtTBW13_DOM_CD_Jsonclick ;
   private String lblTextblocktbw13_dom_itm_grp_oid_Internalname ;
   private String lblTextblocktbw13_dom_itm_grp_oid_Jsonclick ;
   private String edtTBW13_DOM_ITM_GRP_OID_Internalname ;
   private String edtTBW13_DOM_ITM_GRP_OID_Jsonclick ;
   private String lblTextblocktbw13_dom_itm_grp_rowno_Internalname ;
   private String lblTextblocktbw13_dom_itm_grp_rowno_Jsonclick ;
   private String edtTBW13_DOM_ITM_GRP_ROWNO_Internalname ;
   private String edtTBW13_DOM_ITM_GRP_ROWNO_Jsonclick ;
   private String lblTextblocktbw13_value_Internalname ;
   private String lblTextblocktbw13_value_Jsonclick ;
   private String edtTBW13_VALUE_Internalname ;
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
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sMode49 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char3 ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private java.util.Date A814TBW13_DATETIME ;
   private java.util.Date Z814TBW13_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n821TBW13_VALUE ;
   private String A821TBW13_VALUE ;
   private String Z821TBW13_VALUE ;
   private String A813TBW13_SESSION_ID ;
   private String A818TBW13_DOM_CD ;
   private String A819TBW13_DOM_ITM_GRP_OID ;
   private String Z813TBW13_SESSION_ID ;
   private String Z818TBW13_DOM_CD ;
   private String Z819TBW13_DOM_ITM_GRP_OID ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001E4_A813TBW13_SESSION_ID ;
   private java.util.Date[] T001E4_A814TBW13_DATETIME ;
   private long[] T001E4_A815TBW13_STUDY_ID ;
   private int[] T001E4_A816TBW13_SUBJECT_ID ;
   private short[] T001E4_A817TBW13_VISIT_NO ;
   private String[] T001E4_A818TBW13_DOM_CD ;
   private String[] T001E4_A819TBW13_DOM_ITM_GRP_OID ;
   private short[] T001E4_A820TBW13_DOM_ITM_GRP_ROWNO ;
   private String[] T001E4_A821TBW13_VALUE ;
   private boolean[] T001E4_n821TBW13_VALUE ;
   private String[] T001E5_A813TBW13_SESSION_ID ;
   private java.util.Date[] T001E5_A814TBW13_DATETIME ;
   private long[] T001E5_A815TBW13_STUDY_ID ;
   private int[] T001E5_A816TBW13_SUBJECT_ID ;
   private short[] T001E5_A817TBW13_VISIT_NO ;
   private String[] T001E5_A818TBW13_DOM_CD ;
   private String[] T001E5_A819TBW13_DOM_ITM_GRP_OID ;
   private short[] T001E5_A820TBW13_DOM_ITM_GRP_ROWNO ;
   private String[] T001E3_A813TBW13_SESSION_ID ;
   private java.util.Date[] T001E3_A814TBW13_DATETIME ;
   private long[] T001E3_A815TBW13_STUDY_ID ;
   private int[] T001E3_A816TBW13_SUBJECT_ID ;
   private short[] T001E3_A817TBW13_VISIT_NO ;
   private String[] T001E3_A818TBW13_DOM_CD ;
   private String[] T001E3_A819TBW13_DOM_ITM_GRP_OID ;
   private short[] T001E3_A820TBW13_DOM_ITM_GRP_ROWNO ;
   private String[] T001E3_A821TBW13_VALUE ;
   private boolean[] T001E3_n821TBW13_VALUE ;
   private String[] T001E6_A813TBW13_SESSION_ID ;
   private java.util.Date[] T001E6_A814TBW13_DATETIME ;
   private long[] T001E6_A815TBW13_STUDY_ID ;
   private int[] T001E6_A816TBW13_SUBJECT_ID ;
   private short[] T001E6_A817TBW13_VISIT_NO ;
   private String[] T001E6_A818TBW13_DOM_CD ;
   private String[] T001E6_A819TBW13_DOM_ITM_GRP_OID ;
   private short[] T001E6_A820TBW13_DOM_ITM_GRP_ROWNO ;
   private String[] T001E7_A813TBW13_SESSION_ID ;
   private java.util.Date[] T001E7_A814TBW13_DATETIME ;
   private long[] T001E7_A815TBW13_STUDY_ID ;
   private int[] T001E7_A816TBW13_SUBJECT_ID ;
   private short[] T001E7_A817TBW13_VISIT_NO ;
   private String[] T001E7_A818TBW13_DOM_CD ;
   private String[] T001E7_A819TBW13_DOM_ITM_GRP_OID ;
   private short[] T001E7_A820TBW13_DOM_ITM_GRP_ROWNO ;
   private String[] T001E2_A813TBW13_SESSION_ID ;
   private java.util.Date[] T001E2_A814TBW13_DATETIME ;
   private long[] T001E2_A815TBW13_STUDY_ID ;
   private int[] T001E2_A816TBW13_SUBJECT_ID ;
   private short[] T001E2_A817TBW13_VISIT_NO ;
   private String[] T001E2_A818TBW13_DOM_CD ;
   private String[] T001E2_A819TBW13_DOM_ITM_GRP_OID ;
   private short[] T001E2_A820TBW13_DOM_ITM_GRP_ROWNO ;
   private String[] T001E2_A821TBW13_VALUE ;
   private boolean[] T001E2_n821TBW13_VALUE ;
   private String[] T001E11_A813TBW13_SESSION_ID ;
   private java.util.Date[] T001E11_A814TBW13_DATETIME ;
   private long[] T001E11_A815TBW13_STUDY_ID ;
   private int[] T001E11_A816TBW13_SUBJECT_ID ;
   private short[] T001E11_A817TBW13_VISIT_NO ;
   private String[] T001E11_A818TBW13_DOM_CD ;
   private String[] T001E11_A819TBW13_DOM_ITM_GRP_OID ;
   private short[] T001E11_A820TBW13_DOM_ITM_GRP_ROWNO ;
}

final  class tbw13_csv_record__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001E2", "SELECT `TBW13_SESSION_ID`, `TBW13_DATETIME`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO`, `TBW13_VALUE` FROM `TBW13_CSV_RECORD` WHERE `TBW13_SESSION_ID` = ? AND `TBW13_DATETIME` = ? AND `TBW13_STUDY_ID` = ? AND `TBW13_SUBJECT_ID` = ? AND `TBW13_VISIT_NO` = ? AND `TBW13_DOM_CD` = ? AND `TBW13_DOM_ITM_GRP_OID` = ? AND `TBW13_DOM_ITM_GRP_ROWNO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001E3", "SELECT `TBW13_SESSION_ID`, `TBW13_DATETIME`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO`, `TBW13_VALUE` FROM `TBW13_CSV_RECORD` WHERE `TBW13_SESSION_ID` = ? AND `TBW13_DATETIME` = ? AND `TBW13_STUDY_ID` = ? AND `TBW13_SUBJECT_ID` = ? AND `TBW13_VISIT_NO` = ? AND `TBW13_DOM_CD` = ? AND `TBW13_DOM_ITM_GRP_OID` = ? AND `TBW13_DOM_ITM_GRP_ROWNO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001E4", "SELECT TM1.`TBW13_SESSION_ID`, TM1.`TBW13_DATETIME`, TM1.`TBW13_STUDY_ID`, TM1.`TBW13_SUBJECT_ID`, TM1.`TBW13_VISIT_NO`, TM1.`TBW13_DOM_CD`, TM1.`TBW13_DOM_ITM_GRP_OID`, TM1.`TBW13_DOM_ITM_GRP_ROWNO`, TM1.`TBW13_VALUE` FROM `TBW13_CSV_RECORD` TM1 WHERE TM1.`TBW13_SESSION_ID` = ? and TM1.`TBW13_DATETIME` = ? and TM1.`TBW13_STUDY_ID` = ? and TM1.`TBW13_SUBJECT_ID` = ? and TM1.`TBW13_VISIT_NO` = ? and TM1.`TBW13_DOM_CD` = ? and TM1.`TBW13_DOM_ITM_GRP_OID` = ? and TM1.`TBW13_DOM_ITM_GRP_ROWNO` = ? ORDER BY TM1.`TBW13_SESSION_ID`, TM1.`TBW13_DATETIME`, TM1.`TBW13_STUDY_ID`, TM1.`TBW13_SUBJECT_ID`, TM1.`TBW13_VISIT_NO`, TM1.`TBW13_DOM_CD`, TM1.`TBW13_DOM_ITM_GRP_OID`, TM1.`TBW13_DOM_ITM_GRP_ROWNO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T001E5", "SELECT `TBW13_SESSION_ID`, `TBW13_DATETIME`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO` FROM `TBW13_CSV_RECORD` WHERE `TBW13_SESSION_ID` = ? AND `TBW13_DATETIME` = ? AND `TBW13_STUDY_ID` = ? AND `TBW13_SUBJECT_ID` = ? AND `TBW13_VISIT_NO` = ? AND `TBW13_DOM_CD` = ? AND `TBW13_DOM_ITM_GRP_OID` = ? AND `TBW13_DOM_ITM_GRP_ROWNO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001E6", "SELECT `TBW13_SESSION_ID`, `TBW13_DATETIME`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO` FROM `TBW13_CSV_RECORD` WHERE ( `TBW13_SESSION_ID` > ? or `TBW13_SESSION_ID` = ? and `TBW13_DATETIME` > ? or `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_STUDY_ID` > ? or `TBW13_STUDY_ID` = ? and `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_SUBJECT_ID` > ? or `TBW13_SUBJECT_ID` = ? and `TBW13_STUDY_ID` = ? and `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_VISIT_NO` > ? or `TBW13_VISIT_NO` = ? and `TBW13_SUBJECT_ID` = ? and `TBW13_STUDY_ID` = ? and `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_DOM_CD` > ? or `TBW13_DOM_CD` = ? and `TBW13_VISIT_NO` = ? and `TBW13_SUBJECT_ID` = ? and `TBW13_STUDY_ID` = ? and `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_DOM_ITM_GRP_OID` > ? or `TBW13_DOM_ITM_GRP_OID` = ? and `TBW13_DOM_CD` = ? and `TBW13_VISIT_NO` = ? and `TBW13_SUBJECT_ID` = ? and `TBW13_STUDY_ID` = ? and `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_DOM_ITM_GRP_ROWNO` > ?) ORDER BY `TBW13_SESSION_ID`, `TBW13_DATETIME`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001E7", "SELECT `TBW13_SESSION_ID`, `TBW13_DATETIME`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO` FROM `TBW13_CSV_RECORD` WHERE ( `TBW13_SESSION_ID` < ? or `TBW13_SESSION_ID` = ? and `TBW13_DATETIME` < ? or `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_STUDY_ID` < ? or `TBW13_STUDY_ID` = ? and `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_SUBJECT_ID` < ? or `TBW13_SUBJECT_ID` = ? and `TBW13_STUDY_ID` = ? and `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_VISIT_NO` < ? or `TBW13_VISIT_NO` = ? and `TBW13_SUBJECT_ID` = ? and `TBW13_STUDY_ID` = ? and `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_DOM_CD` < ? or `TBW13_DOM_CD` = ? and `TBW13_VISIT_NO` = ? and `TBW13_SUBJECT_ID` = ? and `TBW13_STUDY_ID` = ? and `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_DOM_ITM_GRP_OID` < ? or `TBW13_DOM_ITM_GRP_OID` = ? and `TBW13_DOM_CD` = ? and `TBW13_VISIT_NO` = ? and `TBW13_SUBJECT_ID` = ? and `TBW13_STUDY_ID` = ? and `TBW13_DATETIME` = ? and `TBW13_SESSION_ID` = ? and `TBW13_DOM_ITM_GRP_ROWNO` < ?) ORDER BY `TBW13_SESSION_ID` DESC, `TBW13_DATETIME` DESC, `TBW13_STUDY_ID` DESC, `TBW13_SUBJECT_ID` DESC, `TBW13_VISIT_NO` DESC, `TBW13_DOM_CD` DESC, `TBW13_DOM_ITM_GRP_OID` DESC, `TBW13_DOM_ITM_GRP_ROWNO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001E8", "INSERT INTO `TBW13_CSV_RECORD` (`TBW13_SESSION_ID`, `TBW13_DATETIME`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO`, `TBW13_VALUE`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001E9", "UPDATE `TBW13_CSV_RECORD` SET `TBW13_VALUE`=?  WHERE `TBW13_SESSION_ID` = ? AND `TBW13_DATETIME` = ? AND `TBW13_STUDY_ID` = ? AND `TBW13_SUBJECT_ID` = ? AND `TBW13_VISIT_NO` = ? AND `TBW13_DOM_CD` = ? AND `TBW13_DOM_ITM_GRP_OID` = ? AND `TBW13_DOM_ITM_GRP_ROWNO` = ?", GX_NOMASK)
         ,new UpdateCursor("T001E10", "DELETE FROM `TBW13_CSV_RECORD`  WHERE `TBW13_SESSION_ID` = ? AND `TBW13_DATETIME` = ? AND `TBW13_STUDY_ID` = ? AND `TBW13_SUBJECT_ID` = ? AND `TBW13_VISIT_NO` = ? AND `TBW13_DOM_CD` = ? AND `TBW13_DOM_ITM_GRP_OID` = ? AND `TBW13_DOM_ITM_GRP_ROWNO` = ?", GX_NOMASK)
         ,new ForEachCursor("T001E11", "SELECT `TBW13_SESSION_ID`, `TBW13_DATETIME`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO` FROM `TBW13_CSV_RECORD` ORDER BY `TBW13_SESSION_ID`, `TBW13_DATETIME`, `TBW13_STUDY_ID`, `TBW13_SUBJECT_ID`, `TBW13_VISIT_NO`, `TBW13_DOM_CD`, `TBW13_DOM_ITM_GRP_OID`, `TBW13_DOM_ITM_GRP_ROWNO` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((String[]) buf[8])[0] = rslt.getLongVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((String[]) buf[8])[0] = rslt.getLongVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((String[]) buf[8])[0] = rslt.getLongVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
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
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setDateTime(13, (java.util.Date)parms[12], false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setLong(18, ((Number) parms[17]).longValue());
               stmt.setDateTime(19, (java.util.Date)parms[18], false);
               stmt.setVarchar(20, (String)parms[19], 50, false);
               stmt.setVarchar(21, (String)parms[20], 2, false);
               stmt.setVarchar(22, (String)parms[21], 2, false);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setLong(25, ((Number) parms[24]).longValue());
               stmt.setDateTime(26, (java.util.Date)parms[25], false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setVarchar(28, (String)parms[27], 50, false);
               stmt.setVarchar(29, (String)parms[28], 50, false);
               stmt.setVarchar(30, (String)parms[29], 2, false);
               stmt.setShort(31, ((Number) parms[30]).shortValue());
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setLong(33, ((Number) parms[32]).longValue());
               stmt.setDateTime(34, (java.util.Date)parms[33], false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setShort(36, ((Number) parms[35]).shortValue());
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setDateTime(13, (java.util.Date)parms[12], false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               stmt.setShort(16, ((Number) parms[15]).shortValue());
               stmt.setInt(17, ((Number) parms[16]).intValue());
               stmt.setLong(18, ((Number) parms[17]).longValue());
               stmt.setDateTime(19, (java.util.Date)parms[18], false);
               stmt.setVarchar(20, (String)parms[19], 50, false);
               stmt.setVarchar(21, (String)parms[20], 2, false);
               stmt.setVarchar(22, (String)parms[21], 2, false);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setLong(25, ((Number) parms[24]).longValue());
               stmt.setDateTime(26, (java.util.Date)parms[25], false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setVarchar(28, (String)parms[27], 50, false);
               stmt.setVarchar(29, (String)parms[28], 50, false);
               stmt.setVarchar(30, (String)parms[29], 2, false);
               stmt.setShort(31, ((Number) parms[30]).shortValue());
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setLong(33, ((Number) parms[32]).longValue());
               stmt.setDateTime(34, (java.util.Date)parms[33], false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setShort(36, ((Number) parms[35]).shortValue());
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(9, (String)parms[9]);
               }
               break;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.LONGVARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(1, (String)parms[1]);
               }
               stmt.setVarchar(2, (String)parms[2], 50, false);
               stmt.setDateTime(3, (java.util.Date)parms[3], false);
               stmt.setLong(4, ((Number) parms[4]).longValue());
               stmt.setInt(5, ((Number) parms[5]).intValue());
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               stmt.setVarchar(7, (String)parms[7], 2, false);
               stmt.setVarchar(8, (String)parms[8], 50, false);
               stmt.setShort(9, ((Number) parms[9]).shortValue());
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 2, false);
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               break;
      }
   }

}

