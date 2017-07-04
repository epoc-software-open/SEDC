/*
               File: tbw10_csv_work_impl
        Description: TBW10_ CSV_ WORK
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:14.65
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw10_csv_work_impl extends GXWebPanel
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
      Form.getMeta().addItem("Description", "TBW10_ CSV_ WORK", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbw10_csv_work_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw10_csv_work_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw10_csv_work_impl.class ));
   }

   public tbw10_csv_work_impl( int remoteHandle ,
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
         wb_table1_2_1B46( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1B46e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1B46( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1B46( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1B46( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1B46e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"TBW10_ CSV_ WORK"+"</legend>") ;
         wb_table3_27_1B46( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1B46e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1B46e( true) ;
      }
      else
      {
         wb_table1_2_1B46e( false) ;
      }
   }

   public void wb_table3_27_1B46( boolean wbgen )
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
         wb_table4_33_1B46( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1B46e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW10_CSV_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW10_CSV_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1B46e( true) ;
      }
      else
      {
         wb_table3_27_1B46e( false) ;
      }
   }

   public void wb_table4_33_1B46( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_session_id_Internalname, "SESSION_ ID", "", "", lblTextblocktbw10_session_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A726TBW10_SESSION_ID", A726TBW10_SESSION_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_SESSION_ID_Internalname, GXutil.rtrim( A726TBW10_SESSION_ID), GXutil.rtrim( localUtil.format( A726TBW10_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTBW10_SESSION_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_SESSION_ID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_datetime_Internalname, "DATETIME", "", "", lblTextblocktbw10_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW10_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_DATETIME_Internalname, localUtil.format(A727TBW10_DATETIME, "99/99/99 99:99"), localUtil.format( A727TBW10_DATETIME, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'YMD',5,24,'jap',false,0);"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBW10_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_DATETIME_Enabled, 0, 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW10_CSV_WORK.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW10_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW10_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_study_id_Internalname, "STUDY_ ID", "", "", lblTextblocktbw10_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A728TBW10_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW10_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A728TBW10_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A728TBW10_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(48);\"", "", "", "", "", edtTBW10_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_subject_id_Internalname, "SUBJECT_ ID", "", "", lblTextblocktbw10_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A729TBW10_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW10_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A729TBW10_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A729TBW10_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBW10_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_crf_id_Internalname, "CRF_ ID", "", "", lblTextblocktbw10_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A730TBW10_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW10_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A730TBW10_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A730TBW10_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBW10_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_crf_item_grp_cd_Internalname, "GRP_ CD", "", "", lblTextblocktbw10_crf_item_grp_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A731TBW10_CRF_ITEM_GRP_CD", A731TBW10_CRF_ITEM_GRP_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_CRF_ITEM_GRP_CD_Internalname, GXutil.rtrim( A731TBW10_CRF_ITEM_GRP_CD), GXutil.rtrim( localUtil.format( A731TBW10_CRF_ITEM_GRP_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBW10_CRF_ITEM_GRP_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_CRF_ITEM_GRP_CD_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_visit_no_Internalname, "VISIT_ NO", "", "", lblTextblocktbw10_visit_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_VISIT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A732TBW10_VISIT_NO, (byte)(3), (byte)(0), ".", "")), ((edtTBW10_VISIT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A732TBW10_VISIT_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A732TBW10_VISIT_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(68);\"", "", "", "", "", edtTBW10_VISIT_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_VISIT_NO_Enabled, 0, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_dom_cd_Internalname, "DOM_ CD", "", "", lblTextblocktbw10_dom_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A733TBW10_DOM_CD", A733TBW10_DOM_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_DOM_CD_Internalname, GXutil.rtrim( A733TBW10_DOM_CD), GXutil.rtrim( localUtil.format( A733TBW10_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBW10_DOM_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_DOM_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_dom_var_nm_Internalname, "VAR_ NM", "", "", lblTextblocktbw10_dom_var_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A734TBW10_DOM_VAR_NM", A734TBW10_DOM_VAR_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_DOM_VAR_NM_Internalname, GXutil.rtrim( A734TBW10_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A734TBW10_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBW10_DOM_VAR_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_DOM_VAR_NM_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_dom_itm_grp_oid_Internalname, "GRP_ OID", "", "", lblTextblocktbw10_dom_itm_grp_oid_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A735TBW10_DOM_ITM_GRP_OID", A735TBW10_DOM_ITM_GRP_OID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_DOM_ITM_GRP_OID_Internalname, GXutil.rtrim( A735TBW10_DOM_ITM_GRP_OID), GXutil.rtrim( localUtil.format( A735TBW10_DOM_ITM_GRP_OID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBW10_DOM_ITM_GRP_OID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_DOM_ITM_GRP_OID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_dom_itm_grp_rowno_Internalname, "GRP_ ROWNO", "", "", lblTextblocktbw10_dom_itm_grp_rowno_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_DOM_ITM_GRP_ROWNO_Internalname, GXutil.ltrim( localUtil.ntoc( A736TBW10_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")), ((edtTBW10_DOM_ITM_GRP_ROWNO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A736TBW10_DOM_ITM_GRP_ROWNO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A736TBW10_DOM_ITM_GRP_ROWNO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(88);\"", "", "", "", "", edtTBW10_DOM_ITM_GRP_ROWNO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_DOM_ITM_GRP_ROWNO_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_char_1_Internalname, "CHAR_1", "", "", lblTextblocktbw10_char_1_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A737TBW10_CHAR_1", GXutil.str( A737TBW10_CHAR_1, 1, 0));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_CHAR_1_Internalname, GXutil.ltrim( localUtil.ntoc( A737TBW10_CHAR_1, (byte)(1), (byte)(0), ".", "")), ((edtTBW10_CHAR_1_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A737TBW10_CHAR_1), "9")) : localUtil.format( DecimalUtil.doubleToDec(A737TBW10_CHAR_1), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBW10_CHAR_1_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_CHAR_1_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_value_Internalname, "VALUE", "", "", lblTextblocktbw10_value_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A738TBW10_VALUE", A738TBW10_VALUE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBW10_VALUE_Internalname, GXutil.rtrim( A738TBW10_VALUE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", (short)(0), 1, edtTBW10_VALUE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "2000", -1, "", true, "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_crf_item_div_Internalname, "ITEM_ DIV", "", "", lblTextblocktbw10_crf_item_div_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A739TBW10_CRF_ITEM_DIV", A739TBW10_CRF_ITEM_DIV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_CRF_ITEM_DIV_Internalname, GXutil.rtrim( A739TBW10_CRF_ITEM_DIV), GXutil.rtrim( localUtil.format( A739TBW10_CRF_ITEM_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtTBW10_CRF_ITEM_DIV_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_CRF_ITEM_DIV_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_list_cd_Internalname, "LIST_ CD", "", "", lblTextblocktbw10_list_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A740TBW10_LIST_CD", A740TBW10_LIST_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_LIST_CD_Internalname, GXutil.rtrim( A740TBW10_LIST_CD), GXutil.rtrim( localUtil.format( A740TBW10_LIST_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(108);\"", "", "", "", "", edtTBW10_LIST_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW10_LIST_CD_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1B46e( true) ;
      }
      else
      {
         wb_table4_33_1B46e( false) ;
      }
   }

   public void wb_table2_5_1B46( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW10_CSV_WORK.htm");
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
         wb_table2_5_1B46e( true) ;
      }
      else
      {
         wb_table2_5_1B46e( false) ;
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
      /* Execute user event: e111B2 */
      e111B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A726TBW10_SESSION_ID = httpContext.cgiGet( edtTBW10_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A726TBW10_SESSION_ID", A726TBW10_SESSION_ID);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW10_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"TBW10_ DATETIME"}), 1, "TBW10_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A727TBW10_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            else
            {
               A727TBW10_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW10_DATETIME_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A728TBW10_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
            }
            else
            {
               A728TBW10_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW10_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A729TBW10_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A729TBW10_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW10_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A730TBW10_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
            }
            else
            {
               A730TBW10_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW10_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
            }
            A731TBW10_CRF_ITEM_GRP_CD = httpContext.cgiGet( edtTBW10_CRF_ITEM_GRP_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A731TBW10_CRF_ITEM_GRP_CD", A731TBW10_CRF_ITEM_GRP_CD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_VISIT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_VISIT_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_VISIT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_VISIT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A732TBW10_VISIT_NO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
            }
            else
            {
               A732TBW10_VISIT_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW10_VISIT_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
            }
            A733TBW10_DOM_CD = httpContext.cgiGet( edtTBW10_DOM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A733TBW10_DOM_CD", A733TBW10_DOM_CD);
            A734TBW10_DOM_VAR_NM = httpContext.cgiGet( edtTBW10_DOM_VAR_NM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A734TBW10_DOM_VAR_NM", A734TBW10_DOM_VAR_NM);
            A735TBW10_DOM_ITM_GRP_OID = httpContext.cgiGet( edtTBW10_DOM_ITM_GRP_OID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A735TBW10_DOM_ITM_GRP_OID", A735TBW10_DOM_ITM_GRP_OID);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_DOM_ITM_GRP_ROWNO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_DOM_ITM_GRP_ROWNO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A736TBW10_DOM_ITM_GRP_ROWNO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            else
            {
               A736TBW10_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW10_DOM_ITM_GRP_ROWNO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_CHAR_1_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_CHAR_1_Internalname), ".", ",") > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_CHAR_1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_CHAR_1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A737TBW10_CHAR_1 = (byte)(0) ;
               n737TBW10_CHAR_1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A737TBW10_CHAR_1", GXutil.str( A737TBW10_CHAR_1, 1, 0));
            }
            else
            {
               A737TBW10_CHAR_1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBW10_CHAR_1_Internalname), ".", ",")) ;
               n737TBW10_CHAR_1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A737TBW10_CHAR_1", GXutil.str( A737TBW10_CHAR_1, 1, 0));
            }
            n737TBW10_CHAR_1 = ((0==A737TBW10_CHAR_1) ? true : false) ;
            A738TBW10_VALUE = httpContext.cgiGet( edtTBW10_VALUE_Internalname) ;
            n738TBW10_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A738TBW10_VALUE", A738TBW10_VALUE);
            n738TBW10_VALUE = ((GXutil.strcmp("", A738TBW10_VALUE)==0) ? true : false) ;
            A739TBW10_CRF_ITEM_DIV = httpContext.cgiGet( edtTBW10_CRF_ITEM_DIV_Internalname) ;
            n739TBW10_CRF_ITEM_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A739TBW10_CRF_ITEM_DIV", A739TBW10_CRF_ITEM_DIV);
            n739TBW10_CRF_ITEM_DIV = ((GXutil.strcmp("", A739TBW10_CRF_ITEM_DIV)==0) ? true : false) ;
            A740TBW10_LIST_CD = httpContext.cgiGet( edtTBW10_LIST_CD_Internalname) ;
            n740TBW10_LIST_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A740TBW10_LIST_CD", A740TBW10_LIST_CD);
            n740TBW10_LIST_CD = ((GXutil.strcmp("", A740TBW10_LIST_CD)==0) ? true : false) ;
            /* Read saved values. */
            Z726TBW10_SESSION_ID = httpContext.cgiGet( "Z726TBW10_SESSION_ID") ;
            Z727TBW10_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z727TBW10_DATETIME"), 0) ;
            Z728TBW10_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z728TBW10_STUDY_ID"), ".", ",") ;
            Z729TBW10_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z729TBW10_SUBJECT_ID"), ".", ",")) ;
            Z730TBW10_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z730TBW10_CRF_ID"), ".", ",")) ;
            Z731TBW10_CRF_ITEM_GRP_CD = httpContext.cgiGet( "Z731TBW10_CRF_ITEM_GRP_CD") ;
            Z732TBW10_VISIT_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z732TBW10_VISIT_NO"), ".", ",")) ;
            Z733TBW10_DOM_CD = httpContext.cgiGet( "Z733TBW10_DOM_CD") ;
            Z734TBW10_DOM_VAR_NM = httpContext.cgiGet( "Z734TBW10_DOM_VAR_NM") ;
            Z735TBW10_DOM_ITM_GRP_OID = httpContext.cgiGet( "Z735TBW10_DOM_ITM_GRP_OID") ;
            Z736TBW10_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( "Z736TBW10_DOM_ITM_GRP_ROWNO"), ".", ",")) ;
            Z737TBW10_CHAR_1 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z737TBW10_CHAR_1"), ".", ",")) ;
            n737TBW10_CHAR_1 = ((0==A737TBW10_CHAR_1) ? true : false) ;
            Z738TBW10_VALUE = httpContext.cgiGet( "Z738TBW10_VALUE") ;
            n738TBW10_VALUE = ((GXutil.strcmp("", A738TBW10_VALUE)==0) ? true : false) ;
            Z739TBW10_CRF_ITEM_DIV = httpContext.cgiGet( "Z739TBW10_CRF_ITEM_DIV") ;
            n739TBW10_CRF_ITEM_DIV = ((GXutil.strcmp("", A739TBW10_CRF_ITEM_DIV)==0) ? true : false) ;
            Z740TBW10_LIST_CD = httpContext.cgiGet( "Z740TBW10_LIST_CD") ;
            n740TBW10_LIST_CD = ((GXutil.strcmp("", A740TBW10_LIST_CD)==0) ? true : false) ;
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
               A726TBW10_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A726TBW10_SESSION_ID", A726TBW10_SESSION_ID);
               A727TBW10_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
               A728TBW10_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
               A729TBW10_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
               A730TBW10_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
               A731TBW10_CRF_ITEM_GRP_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A731TBW10_CRF_ITEM_GRP_CD", A731TBW10_CRF_ITEM_GRP_CD);
               A732TBW10_VISIT_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
               A733TBW10_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A733TBW10_DOM_CD", A733TBW10_DOM_CD);
               A734TBW10_DOM_VAR_NM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A734TBW10_DOM_VAR_NM", A734TBW10_DOM_VAR_NM);
               A735TBW10_DOM_ITM_GRP_OID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A735TBW10_DOM_ITM_GRP_OID", A735TBW10_DOM_ITM_GRP_OID);
               A736TBW10_DOM_ITM_GRP_ROWNO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
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
                     /* Execute user event: e111B2 */
                     e111B2 ();
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
            initAll1B46( ) ;
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
      disableAttributes1B46( ) ;
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

   public void resetCaption1B0( )
   {
   }

   public void e111B2( )
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

   public void zm1B46( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z737TBW10_CHAR_1 = T001B3_A737TBW10_CHAR_1[0] ;
            Z738TBW10_VALUE = T001B3_A738TBW10_VALUE[0] ;
            Z739TBW10_CRF_ITEM_DIV = T001B3_A739TBW10_CRF_ITEM_DIV[0] ;
            Z740TBW10_LIST_CD = T001B3_A740TBW10_LIST_CD[0] ;
         }
         else
         {
            Z737TBW10_CHAR_1 = A737TBW10_CHAR_1 ;
            Z738TBW10_VALUE = A738TBW10_VALUE ;
            Z739TBW10_CRF_ITEM_DIV = A739TBW10_CRF_ITEM_DIV ;
            Z740TBW10_LIST_CD = A740TBW10_LIST_CD ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z726TBW10_SESSION_ID = A726TBW10_SESSION_ID ;
         Z727TBW10_DATETIME = A727TBW10_DATETIME ;
         Z728TBW10_STUDY_ID = A728TBW10_STUDY_ID ;
         Z729TBW10_SUBJECT_ID = A729TBW10_SUBJECT_ID ;
         Z730TBW10_CRF_ID = A730TBW10_CRF_ID ;
         Z731TBW10_CRF_ITEM_GRP_CD = A731TBW10_CRF_ITEM_GRP_CD ;
         Z732TBW10_VISIT_NO = A732TBW10_VISIT_NO ;
         Z733TBW10_DOM_CD = A733TBW10_DOM_CD ;
         Z734TBW10_DOM_VAR_NM = A734TBW10_DOM_VAR_NM ;
         Z735TBW10_DOM_ITM_GRP_OID = A735TBW10_DOM_ITM_GRP_OID ;
         Z736TBW10_DOM_ITM_GRP_ROWNO = A736TBW10_DOM_ITM_GRP_ROWNO ;
         Z737TBW10_CHAR_1 = A737TBW10_CHAR_1 ;
         Z738TBW10_VALUE = A738TBW10_VALUE ;
         Z739TBW10_CRF_ITEM_DIV = A739TBW10_CRF_ITEM_DIV ;
         Z740TBW10_LIST_CD = A740TBW10_LIST_CD ;
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

   public void load1B46( )
   {
      /* Using cursor T001B4 */
      pr_default.execute(2, new Object[] {A726TBW10_SESSION_ID, A727TBW10_DATETIME, new Long(A728TBW10_STUDY_ID), new Integer(A729TBW10_SUBJECT_ID), new Short(A730TBW10_CRF_ID), A731TBW10_CRF_ITEM_GRP_CD, new Short(A732TBW10_VISIT_NO), A733TBW10_DOM_CD, A734TBW10_DOM_VAR_NM, A735TBW10_DOM_ITM_GRP_OID, new Short(A736TBW10_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound46 = (short)(1) ;
         A737TBW10_CHAR_1 = T001B4_A737TBW10_CHAR_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A737TBW10_CHAR_1", GXutil.str( A737TBW10_CHAR_1, 1, 0));
         n737TBW10_CHAR_1 = T001B4_n737TBW10_CHAR_1[0] ;
         A738TBW10_VALUE = T001B4_A738TBW10_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A738TBW10_VALUE", A738TBW10_VALUE);
         n738TBW10_VALUE = T001B4_n738TBW10_VALUE[0] ;
         A739TBW10_CRF_ITEM_DIV = T001B4_A739TBW10_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A739TBW10_CRF_ITEM_DIV", A739TBW10_CRF_ITEM_DIV);
         n739TBW10_CRF_ITEM_DIV = T001B4_n739TBW10_CRF_ITEM_DIV[0] ;
         A740TBW10_LIST_CD = T001B4_A740TBW10_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A740TBW10_LIST_CD", A740TBW10_LIST_CD);
         n740TBW10_LIST_CD = T001B4_n740TBW10_LIST_CD[0] ;
         zm1B46( -2) ;
      }
      pr_default.close(2);
      onLoadActions1B46( ) ;
   }

   public void onLoadActions1B46( )
   {
      AV8Pgmname = "TBW10_CSV_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable1B46( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TBW10_CSV_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      if ( ! ( GXutil.nullDate().equals(A727TBW10_DATETIME) || (( A727TBW10_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A727TBW10_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　TBW10_ DATETIME は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1B46( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1B46( )
   {
      /* Using cursor T001B5 */
      pr_default.execute(3, new Object[] {A726TBW10_SESSION_ID, A727TBW10_DATETIME, new Long(A728TBW10_STUDY_ID), new Integer(A729TBW10_SUBJECT_ID), new Short(A730TBW10_CRF_ID), A731TBW10_CRF_ITEM_GRP_CD, new Short(A732TBW10_VISIT_NO), A733TBW10_DOM_CD, A734TBW10_DOM_VAR_NM, A735TBW10_DOM_ITM_GRP_OID, new Short(A736TBW10_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound46 = (short)(1) ;
      }
      else
      {
         RcdFound46 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001B3 */
      pr_default.execute(1, new Object[] {A726TBW10_SESSION_ID, A727TBW10_DATETIME, new Long(A728TBW10_STUDY_ID), new Integer(A729TBW10_SUBJECT_ID), new Short(A730TBW10_CRF_ID), A731TBW10_CRF_ITEM_GRP_CD, new Short(A732TBW10_VISIT_NO), A733TBW10_DOM_CD, A734TBW10_DOM_VAR_NM, A735TBW10_DOM_ITM_GRP_OID, new Short(A736TBW10_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1B46( 2) ;
         RcdFound46 = (short)(1) ;
         A726TBW10_SESSION_ID = T001B3_A726TBW10_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726TBW10_SESSION_ID", A726TBW10_SESSION_ID);
         A727TBW10_DATETIME = T001B3_A727TBW10_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A728TBW10_STUDY_ID = T001B3_A728TBW10_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
         A729TBW10_SUBJECT_ID = T001B3_A729TBW10_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
         A730TBW10_CRF_ID = T001B3_A730TBW10_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
         A731TBW10_CRF_ITEM_GRP_CD = T001B3_A731TBW10_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A731TBW10_CRF_ITEM_GRP_CD", A731TBW10_CRF_ITEM_GRP_CD);
         A732TBW10_VISIT_NO = T001B3_A732TBW10_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
         A733TBW10_DOM_CD = T001B3_A733TBW10_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A733TBW10_DOM_CD", A733TBW10_DOM_CD);
         A734TBW10_DOM_VAR_NM = T001B3_A734TBW10_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A734TBW10_DOM_VAR_NM", A734TBW10_DOM_VAR_NM);
         A735TBW10_DOM_ITM_GRP_OID = T001B3_A735TBW10_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A735TBW10_DOM_ITM_GRP_OID", A735TBW10_DOM_ITM_GRP_OID);
         A736TBW10_DOM_ITM_GRP_ROWNO = T001B3_A736TBW10_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
         A737TBW10_CHAR_1 = T001B3_A737TBW10_CHAR_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A737TBW10_CHAR_1", GXutil.str( A737TBW10_CHAR_1, 1, 0));
         n737TBW10_CHAR_1 = T001B3_n737TBW10_CHAR_1[0] ;
         A738TBW10_VALUE = T001B3_A738TBW10_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A738TBW10_VALUE", A738TBW10_VALUE);
         n738TBW10_VALUE = T001B3_n738TBW10_VALUE[0] ;
         A739TBW10_CRF_ITEM_DIV = T001B3_A739TBW10_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A739TBW10_CRF_ITEM_DIV", A739TBW10_CRF_ITEM_DIV);
         n739TBW10_CRF_ITEM_DIV = T001B3_n739TBW10_CRF_ITEM_DIV[0] ;
         A740TBW10_LIST_CD = T001B3_A740TBW10_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A740TBW10_LIST_CD", A740TBW10_LIST_CD);
         n740TBW10_LIST_CD = T001B3_n740TBW10_LIST_CD[0] ;
         Z726TBW10_SESSION_ID = A726TBW10_SESSION_ID ;
         Z727TBW10_DATETIME = A727TBW10_DATETIME ;
         Z728TBW10_STUDY_ID = A728TBW10_STUDY_ID ;
         Z729TBW10_SUBJECT_ID = A729TBW10_SUBJECT_ID ;
         Z730TBW10_CRF_ID = A730TBW10_CRF_ID ;
         Z731TBW10_CRF_ITEM_GRP_CD = A731TBW10_CRF_ITEM_GRP_CD ;
         Z732TBW10_VISIT_NO = A732TBW10_VISIT_NO ;
         Z733TBW10_DOM_CD = A733TBW10_DOM_CD ;
         Z734TBW10_DOM_VAR_NM = A734TBW10_DOM_VAR_NM ;
         Z735TBW10_DOM_ITM_GRP_OID = A735TBW10_DOM_ITM_GRP_OID ;
         Z736TBW10_DOM_ITM_GRP_ROWNO = A736TBW10_DOM_ITM_GRP_ROWNO ;
         sMode46 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1B46( ) ;
         Gx_mode = sMode46 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound46 = (short)(0) ;
         initializeNonKey1B46( ) ;
         sMode46 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode46 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1B46( ) ;
      if ( RcdFound46 == 0 )
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
      RcdFound46 = (short)(0) ;
      /* Using cursor T001B6 */
      pr_default.execute(4, new Object[] {A726TBW10_SESSION_ID, A726TBW10_SESSION_ID, A727TBW10_DATETIME, A727TBW10_DATETIME, A726TBW10_SESSION_ID, new Long(A728TBW10_STUDY_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, new Integer(A729TBW10_SUBJECT_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, new Short(A730TBW10_CRF_ID), new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, A731TBW10_CRF_ITEM_GRP_CD, A731TBW10_CRF_ITEM_GRP_CD, new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, new Short(A732TBW10_VISIT_NO), new Short(A732TBW10_VISIT_NO), A731TBW10_CRF_ITEM_GRP_CD, new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, A733TBW10_DOM_CD, A733TBW10_DOM_CD, new Short(A732TBW10_VISIT_NO), A731TBW10_CRF_ITEM_GRP_CD, new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, A734TBW10_DOM_VAR_NM, A734TBW10_DOM_VAR_NM, A733TBW10_DOM_CD, new Short(A732TBW10_VISIT_NO), A731TBW10_CRF_ITEM_GRP_CD, new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, A735TBW10_DOM_ITM_GRP_OID, A735TBW10_DOM_ITM_GRP_OID, A734TBW10_DOM_VAR_NM, A733TBW10_DOM_CD, new Short(A732TBW10_VISIT_NO), A731TBW10_CRF_ITEM_GRP_CD, new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, new Short(A736TBW10_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && T001B6_A727TBW10_DATETIME[0].before( A727TBW10_DATETIME ) || T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B6_A728TBW10_STUDY_ID[0] < A728TBW10_STUDY_ID ) || ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B6_A729TBW10_SUBJECT_ID[0] < A729TBW10_SUBJECT_ID ) || ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] < A730TBW10_CRF_ID ) || ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) < 0 ) || ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B6_A732TBW10_VISIT_NO[0] < A732TBW10_VISIT_NO ) || ( T001B6_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) < 0 ) || ( GXutil.strcmp(T001B6_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B6_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) < 0 ) || ( GXutil.strcmp(T001B6_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B6_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B6_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A735TBW10_DOM_ITM_GRP_OID[0], A735TBW10_DOM_ITM_GRP_OID) < 0 ) || ( GXutil.strcmp(T001B6_A735TBW10_DOM_ITM_GRP_OID[0], A735TBW10_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001B6_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B6_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B6_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B6_A736TBW10_DOM_ITM_GRP_ROWNO[0] < A736TBW10_DOM_ITM_GRP_ROWNO ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && T001B6_A727TBW10_DATETIME[0].after( A727TBW10_DATETIME ) || T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B6_A728TBW10_STUDY_ID[0] > A728TBW10_STUDY_ID ) || ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B6_A729TBW10_SUBJECT_ID[0] > A729TBW10_SUBJECT_ID ) || ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] > A730TBW10_CRF_ID ) || ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) > 0 ) || ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B6_A732TBW10_VISIT_NO[0] > A732TBW10_VISIT_NO ) || ( T001B6_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) > 0 ) || ( GXutil.strcmp(T001B6_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B6_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) > 0 ) || ( GXutil.strcmp(T001B6_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B6_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B6_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A735TBW10_DOM_ITM_GRP_OID[0], A735TBW10_DOM_ITM_GRP_OID) > 0 ) || ( GXutil.strcmp(T001B6_A735TBW10_DOM_ITM_GRP_OID[0], A735TBW10_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001B6_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B6_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B6_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B6_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B6_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B6_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B6_A736TBW10_DOM_ITM_GRP_ROWNO[0] > A736TBW10_DOM_ITM_GRP_ROWNO ) ) )
         {
            A726TBW10_SESSION_ID = T001B6_A726TBW10_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A726TBW10_SESSION_ID", A726TBW10_SESSION_ID);
            A727TBW10_DATETIME = T001B6_A727TBW10_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A728TBW10_STUDY_ID = T001B6_A728TBW10_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
            A729TBW10_SUBJECT_ID = T001B6_A729TBW10_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
            A730TBW10_CRF_ID = T001B6_A730TBW10_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
            A731TBW10_CRF_ITEM_GRP_CD = T001B6_A731TBW10_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A731TBW10_CRF_ITEM_GRP_CD", A731TBW10_CRF_ITEM_GRP_CD);
            A732TBW10_VISIT_NO = T001B6_A732TBW10_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
            A733TBW10_DOM_CD = T001B6_A733TBW10_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A733TBW10_DOM_CD", A733TBW10_DOM_CD);
            A734TBW10_DOM_VAR_NM = T001B6_A734TBW10_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A734TBW10_DOM_VAR_NM", A734TBW10_DOM_VAR_NM);
            A735TBW10_DOM_ITM_GRP_OID = T001B6_A735TBW10_DOM_ITM_GRP_OID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A735TBW10_DOM_ITM_GRP_OID", A735TBW10_DOM_ITM_GRP_OID);
            A736TBW10_DOM_ITM_GRP_ROWNO = T001B6_A736TBW10_DOM_ITM_GRP_ROWNO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
            RcdFound46 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound46 = (short)(0) ;
      /* Using cursor T001B7 */
      pr_default.execute(5, new Object[] {A726TBW10_SESSION_ID, A726TBW10_SESSION_ID, A727TBW10_DATETIME, A727TBW10_DATETIME, A726TBW10_SESSION_ID, new Long(A728TBW10_STUDY_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, new Integer(A729TBW10_SUBJECT_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, new Short(A730TBW10_CRF_ID), new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, A731TBW10_CRF_ITEM_GRP_CD, A731TBW10_CRF_ITEM_GRP_CD, new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, new Short(A732TBW10_VISIT_NO), new Short(A732TBW10_VISIT_NO), A731TBW10_CRF_ITEM_GRP_CD, new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, A733TBW10_DOM_CD, A733TBW10_DOM_CD, new Short(A732TBW10_VISIT_NO), A731TBW10_CRF_ITEM_GRP_CD, new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, A734TBW10_DOM_VAR_NM, A734TBW10_DOM_VAR_NM, A733TBW10_DOM_CD, new Short(A732TBW10_VISIT_NO), A731TBW10_CRF_ITEM_GRP_CD, new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, A735TBW10_DOM_ITM_GRP_OID, A735TBW10_DOM_ITM_GRP_OID, A734TBW10_DOM_VAR_NM, A733TBW10_DOM_CD, new Short(A732TBW10_VISIT_NO), A731TBW10_CRF_ITEM_GRP_CD, new Short(A730TBW10_CRF_ID), new Integer(A729TBW10_SUBJECT_ID), new Long(A728TBW10_STUDY_ID), A727TBW10_DATETIME, A726TBW10_SESSION_ID, new Short(A736TBW10_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && T001B7_A727TBW10_DATETIME[0].after( A727TBW10_DATETIME ) || T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B7_A728TBW10_STUDY_ID[0] > A728TBW10_STUDY_ID ) || ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B7_A729TBW10_SUBJECT_ID[0] > A729TBW10_SUBJECT_ID ) || ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] > A730TBW10_CRF_ID ) || ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) > 0 ) || ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B7_A732TBW10_VISIT_NO[0] > A732TBW10_VISIT_NO ) || ( T001B7_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) > 0 ) || ( GXutil.strcmp(T001B7_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B7_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) > 0 ) || ( GXutil.strcmp(T001B7_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B7_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B7_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A735TBW10_DOM_ITM_GRP_OID[0], A735TBW10_DOM_ITM_GRP_OID) > 0 ) || ( GXutil.strcmp(T001B7_A735TBW10_DOM_ITM_GRP_OID[0], A735TBW10_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001B7_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B7_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B7_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B7_A736TBW10_DOM_ITM_GRP_ROWNO[0] > A736TBW10_DOM_ITM_GRP_ROWNO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && T001B7_A727TBW10_DATETIME[0].before( A727TBW10_DATETIME ) || T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B7_A728TBW10_STUDY_ID[0] < A728TBW10_STUDY_ID ) || ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B7_A729TBW10_SUBJECT_ID[0] < A729TBW10_SUBJECT_ID ) || ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] < A730TBW10_CRF_ID ) || ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) < 0 ) || ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B7_A732TBW10_VISIT_NO[0] < A732TBW10_VISIT_NO ) || ( T001B7_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) < 0 ) || ( GXutil.strcmp(T001B7_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B7_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) < 0 ) || ( GXutil.strcmp(T001B7_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B7_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B7_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A735TBW10_DOM_ITM_GRP_OID[0], A735TBW10_DOM_ITM_GRP_OID) < 0 ) || ( GXutil.strcmp(T001B7_A735TBW10_DOM_ITM_GRP_OID[0], A735TBW10_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001B7_A734TBW10_DOM_VAR_NM[0], A734TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B7_A733TBW10_DOM_CD[0], A733TBW10_DOM_CD) == 0 ) && ( T001B7_A732TBW10_VISIT_NO[0] == A732TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A731TBW10_CRF_ITEM_GRP_CD[0], A731TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A730TBW10_CRF_ID[0] == A730TBW10_CRF_ID ) && ( T001B7_A729TBW10_SUBJECT_ID[0] == A729TBW10_SUBJECT_ID ) && ( T001B7_A728TBW10_STUDY_ID[0] == A728TBW10_STUDY_ID ) && T001B7_A727TBW10_DATETIME[0].equals( A727TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A726TBW10_SESSION_ID[0], A726TBW10_SESSION_ID) == 0 ) && ( T001B7_A736TBW10_DOM_ITM_GRP_ROWNO[0] < A736TBW10_DOM_ITM_GRP_ROWNO ) ) )
         {
            A726TBW10_SESSION_ID = T001B7_A726TBW10_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A726TBW10_SESSION_ID", A726TBW10_SESSION_ID);
            A727TBW10_DATETIME = T001B7_A727TBW10_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A728TBW10_STUDY_ID = T001B7_A728TBW10_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
            A729TBW10_SUBJECT_ID = T001B7_A729TBW10_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
            A730TBW10_CRF_ID = T001B7_A730TBW10_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
            A731TBW10_CRF_ITEM_GRP_CD = T001B7_A731TBW10_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A731TBW10_CRF_ITEM_GRP_CD", A731TBW10_CRF_ITEM_GRP_CD);
            A732TBW10_VISIT_NO = T001B7_A732TBW10_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
            A733TBW10_DOM_CD = T001B7_A733TBW10_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A733TBW10_DOM_CD", A733TBW10_DOM_CD);
            A734TBW10_DOM_VAR_NM = T001B7_A734TBW10_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A734TBW10_DOM_VAR_NM", A734TBW10_DOM_VAR_NM);
            A735TBW10_DOM_ITM_GRP_OID = T001B7_A735TBW10_DOM_ITM_GRP_OID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A735TBW10_DOM_ITM_GRP_OID", A735TBW10_DOM_ITM_GRP_OID);
            A736TBW10_DOM_ITM_GRP_ROWNO = T001B7_A736TBW10_DOM_ITM_GRP_ROWNO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
            RcdFound46 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1B46( ) ;
      if ( RcdFound46 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBW10_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A726TBW10_SESSION_ID, Z726TBW10_SESSION_ID) != 0 ) || !( A727TBW10_DATETIME.equals( Z727TBW10_DATETIME ) ) || ( A728TBW10_STUDY_ID != Z728TBW10_STUDY_ID ) || ( A729TBW10_SUBJECT_ID != Z729TBW10_SUBJECT_ID ) || ( A730TBW10_CRF_ID != Z730TBW10_CRF_ID ) || ( GXutil.strcmp(A731TBW10_CRF_ITEM_GRP_CD, Z731TBW10_CRF_ITEM_GRP_CD) != 0 ) || ( A732TBW10_VISIT_NO != Z732TBW10_VISIT_NO ) || ( GXutil.strcmp(A733TBW10_DOM_CD, Z733TBW10_DOM_CD) != 0 ) || ( GXutil.strcmp(A734TBW10_DOM_VAR_NM, Z734TBW10_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A735TBW10_DOM_ITM_GRP_OID, Z735TBW10_DOM_ITM_GRP_OID) != 0 ) || ( A736TBW10_DOM_ITM_GRP_ROWNO != Z736TBW10_DOM_ITM_GRP_ROWNO ) )
         {
            A726TBW10_SESSION_ID = Z726TBW10_SESSION_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A726TBW10_SESSION_ID", A726TBW10_SESSION_ID);
            A727TBW10_DATETIME = Z727TBW10_DATETIME ;
            httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A728TBW10_STUDY_ID = Z728TBW10_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
            A729TBW10_SUBJECT_ID = Z729TBW10_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
            A730TBW10_CRF_ID = Z730TBW10_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
            A731TBW10_CRF_ITEM_GRP_CD = Z731TBW10_CRF_ITEM_GRP_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A731TBW10_CRF_ITEM_GRP_CD", A731TBW10_CRF_ITEM_GRP_CD);
            A732TBW10_VISIT_NO = Z732TBW10_VISIT_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
            A733TBW10_DOM_CD = Z733TBW10_DOM_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A733TBW10_DOM_CD", A733TBW10_DOM_CD);
            A734TBW10_DOM_VAR_NM = Z734TBW10_DOM_VAR_NM ;
            httpContext.ajax_rsp_assign_attri("", false, "A734TBW10_DOM_VAR_NM", A734TBW10_DOM_VAR_NM);
            A735TBW10_DOM_ITM_GRP_OID = Z735TBW10_DOM_ITM_GRP_OID ;
            httpContext.ajax_rsp_assign_attri("", false, "A735TBW10_DOM_ITM_GRP_OID", A735TBW10_DOM_ITM_GRP_OID);
            A736TBW10_DOM_ITM_GRP_ROWNO = Z736TBW10_DOM_ITM_GRP_ROWNO ;
            httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW10_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update1B46( ) ;
            GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A726TBW10_SESSION_ID, Z726TBW10_SESSION_ID) != 0 ) || !( A727TBW10_DATETIME.equals( Z727TBW10_DATETIME ) ) || ( A728TBW10_STUDY_ID != Z728TBW10_STUDY_ID ) || ( A729TBW10_SUBJECT_ID != Z729TBW10_SUBJECT_ID ) || ( A730TBW10_CRF_ID != Z730TBW10_CRF_ID ) || ( GXutil.strcmp(A731TBW10_CRF_ITEM_GRP_CD, Z731TBW10_CRF_ITEM_GRP_CD) != 0 ) || ( A732TBW10_VISIT_NO != Z732TBW10_VISIT_NO ) || ( GXutil.strcmp(A733TBW10_DOM_CD, Z733TBW10_DOM_CD) != 0 ) || ( GXutil.strcmp(A734TBW10_DOM_VAR_NM, Z734TBW10_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A735TBW10_DOM_ITM_GRP_OID, Z735TBW10_DOM_ITM_GRP_OID) != 0 ) || ( A736TBW10_DOM_ITM_GRP_ROWNO != Z736TBW10_DOM_ITM_GRP_ROWNO ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert1B46( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW10_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1B46( ) ;
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
      if ( ( GXutil.strcmp(A726TBW10_SESSION_ID, Z726TBW10_SESSION_ID) != 0 ) || !( A727TBW10_DATETIME.equals( Z727TBW10_DATETIME ) ) || ( A728TBW10_STUDY_ID != Z728TBW10_STUDY_ID ) || ( A729TBW10_SUBJECT_ID != Z729TBW10_SUBJECT_ID ) || ( A730TBW10_CRF_ID != Z730TBW10_CRF_ID ) || ( GXutil.strcmp(A731TBW10_CRF_ITEM_GRP_CD, Z731TBW10_CRF_ITEM_GRP_CD) != 0 ) || ( A732TBW10_VISIT_NO != Z732TBW10_VISIT_NO ) || ( GXutil.strcmp(A733TBW10_DOM_CD, Z733TBW10_DOM_CD) != 0 ) || ( GXutil.strcmp(A734TBW10_DOM_VAR_NM, Z734TBW10_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A735TBW10_DOM_ITM_GRP_OID, Z735TBW10_DOM_ITM_GRP_OID) != 0 ) || ( A736TBW10_DOM_ITM_GRP_ROWNO != Z736TBW10_DOM_ITM_GRP_ROWNO ) )
      {
         A726TBW10_SESSION_ID = Z726TBW10_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A726TBW10_SESSION_ID", A726TBW10_SESSION_ID);
         A727TBW10_DATETIME = Z727TBW10_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A728TBW10_STUDY_ID = Z728TBW10_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
         A729TBW10_SUBJECT_ID = Z729TBW10_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
         A730TBW10_CRF_ID = Z730TBW10_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
         A731TBW10_CRF_ITEM_GRP_CD = Z731TBW10_CRF_ITEM_GRP_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A731TBW10_CRF_ITEM_GRP_CD", A731TBW10_CRF_ITEM_GRP_CD);
         A732TBW10_VISIT_NO = Z732TBW10_VISIT_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
         A733TBW10_DOM_CD = Z733TBW10_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A733TBW10_DOM_CD", A733TBW10_DOM_CD);
         A734TBW10_DOM_VAR_NM = Z734TBW10_DOM_VAR_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "A734TBW10_DOM_VAR_NM", A734TBW10_DOM_VAR_NM);
         A735TBW10_DOM_ITM_GRP_OID = Z735TBW10_DOM_ITM_GRP_OID ;
         httpContext.ajax_rsp_assign_attri("", false, "A735TBW10_DOM_ITM_GRP_OID", A735TBW10_DOM_ITM_GRP_OID);
         A736TBW10_DOM_ITM_GRP_ROWNO = Z736TBW10_DOM_ITM_GRP_ROWNO ;
         httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW10_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
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
      if ( RcdFound46 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW10_SESSION_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBW10_CHAR_1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1B46( ) ;
      if ( RcdFound46 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW10_CHAR_1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1B46( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound46 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW10_CHAR_1_Internalname ;
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
      if ( RcdFound46 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW10_CHAR_1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1B46( ) ;
      if ( RcdFound46 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound46 != 0 )
         {
            scanNext1B46( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW10_CHAR_1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1B46( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1B46( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001B2 */
         pr_default.execute(0, new Object[] {A726TBW10_SESSION_ID, A727TBW10_DATETIME, new Long(A728TBW10_STUDY_ID), new Integer(A729TBW10_SUBJECT_ID), new Short(A730TBW10_CRF_ID), A731TBW10_CRF_ITEM_GRP_CD, new Short(A732TBW10_VISIT_NO), A733TBW10_DOM_CD, A734TBW10_DOM_VAR_NM, A735TBW10_DOM_ITM_GRP_OID, new Short(A736TBW10_DOM_ITM_GRP_ROWNO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW10_CSV_WORK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z737TBW10_CHAR_1 != T001B2_A737TBW10_CHAR_1[0] ) || ( GXutil.strcmp(Z738TBW10_VALUE, T001B2_A738TBW10_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z739TBW10_CRF_ITEM_DIV, T001B2_A739TBW10_CRF_ITEM_DIV[0]) != 0 ) || ( GXutil.strcmp(Z740TBW10_LIST_CD, T001B2_A740TBW10_LIST_CD[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW10_CSV_WORK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1B46( )
   {
      beforeValidate1B46( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1B46( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1B46( 0) ;
         checkOptimisticConcurrency1B46( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1B46( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1B46( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001B8 */
                  pr_default.execute(6, new Object[] {A726TBW10_SESSION_ID, A727TBW10_DATETIME, new Long(A728TBW10_STUDY_ID), new Integer(A729TBW10_SUBJECT_ID), new Short(A730TBW10_CRF_ID), A731TBW10_CRF_ITEM_GRP_CD, new Short(A732TBW10_VISIT_NO), A733TBW10_DOM_CD, A734TBW10_DOM_VAR_NM, A735TBW10_DOM_ITM_GRP_OID, new Short(A736TBW10_DOM_ITM_GRP_ROWNO), new Boolean(n737TBW10_CHAR_1), new Byte(A737TBW10_CHAR_1), new Boolean(n738TBW10_VALUE), A738TBW10_VALUE, new Boolean(n739TBW10_CRF_ITEM_DIV), A739TBW10_CRF_ITEM_DIV, new Boolean(n740TBW10_LIST_CD), A740TBW10_LIST_CD});
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
                        resetCaption1B0( ) ;
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
            load1B46( ) ;
         }
         endLevel1B46( ) ;
      }
      closeExtendedTableCursors1B46( ) ;
   }

   public void update1B46( )
   {
      beforeValidate1B46( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1B46( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1B46( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1B46( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1B46( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001B9 */
                  pr_default.execute(7, new Object[] {new Boolean(n737TBW10_CHAR_1), new Byte(A737TBW10_CHAR_1), new Boolean(n738TBW10_VALUE), A738TBW10_VALUE, new Boolean(n739TBW10_CRF_ITEM_DIV), A739TBW10_CRF_ITEM_DIV, new Boolean(n740TBW10_LIST_CD), A740TBW10_LIST_CD, A726TBW10_SESSION_ID, A727TBW10_DATETIME, new Long(A728TBW10_STUDY_ID), new Integer(A729TBW10_SUBJECT_ID), new Short(A730TBW10_CRF_ID), A731TBW10_CRF_ITEM_GRP_CD, new Short(A732TBW10_VISIT_NO), A733TBW10_DOM_CD, A734TBW10_DOM_VAR_NM, A735TBW10_DOM_ITM_GRP_OID, new Short(A736TBW10_DOM_ITM_GRP_ROWNO)});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW10_CSV_WORK"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1B46( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption1B0( ) ;
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
         endLevel1B46( ) ;
      }
      closeExtendedTableCursors1B46( ) ;
   }

   public void deferredUpdate1B46( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1B46( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1B46( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1B46( ) ;
         afterConfirm1B46( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1B46( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001B10 */
               pr_default.execute(8, new Object[] {A726TBW10_SESSION_ID, A727TBW10_DATETIME, new Long(A728TBW10_STUDY_ID), new Integer(A729TBW10_SUBJECT_ID), new Short(A730TBW10_CRF_ID), A731TBW10_CRF_ITEM_GRP_CD, new Short(A732TBW10_VISIT_NO), A733TBW10_DOM_CD, A734TBW10_DOM_VAR_NM, A735TBW10_DOM_ITM_GRP_OID, new Short(A736TBW10_DOM_ITM_GRP_ROWNO)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound46 == 0 )
                     {
                        initAll1B46( ) ;
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
                     resetCaption1B0( ) ;
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
      sMode46 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1B46( ) ;
      Gx_mode = sMode46 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1B46( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW10_CSV_WORK" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      }
   }

   public void endLevel1B46( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1B46( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw10_csv_work");
         if ( AnyError == 0 )
         {
            confirmValues1B0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw10_csv_work");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1B46( )
   {
      /* Using cursor T001B11 */
      pr_default.execute(9);
      RcdFound46 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound46 = (short)(1) ;
         A726TBW10_SESSION_ID = T001B11_A726TBW10_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726TBW10_SESSION_ID", A726TBW10_SESSION_ID);
         A727TBW10_DATETIME = T001B11_A727TBW10_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A728TBW10_STUDY_ID = T001B11_A728TBW10_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
         A729TBW10_SUBJECT_ID = T001B11_A729TBW10_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
         A730TBW10_CRF_ID = T001B11_A730TBW10_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
         A731TBW10_CRF_ITEM_GRP_CD = T001B11_A731TBW10_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A731TBW10_CRF_ITEM_GRP_CD", A731TBW10_CRF_ITEM_GRP_CD);
         A732TBW10_VISIT_NO = T001B11_A732TBW10_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
         A733TBW10_DOM_CD = T001B11_A733TBW10_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A733TBW10_DOM_CD", A733TBW10_DOM_CD);
         A734TBW10_DOM_VAR_NM = T001B11_A734TBW10_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A734TBW10_DOM_VAR_NM", A734TBW10_DOM_VAR_NM);
         A735TBW10_DOM_ITM_GRP_OID = T001B11_A735TBW10_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A735TBW10_DOM_ITM_GRP_OID", A735TBW10_DOM_ITM_GRP_OID);
         A736TBW10_DOM_ITM_GRP_ROWNO = T001B11_A736TBW10_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1B46( )
   {
      pr_default.readNext(9);
      RcdFound46 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound46 = (short)(1) ;
         A726TBW10_SESSION_ID = T001B11_A726TBW10_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A726TBW10_SESSION_ID", A726TBW10_SESSION_ID);
         A727TBW10_DATETIME = T001B11_A727TBW10_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A728TBW10_STUDY_ID = T001B11_A728TBW10_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
         A729TBW10_SUBJECT_ID = T001B11_A729TBW10_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
         A730TBW10_CRF_ID = T001B11_A730TBW10_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
         A731TBW10_CRF_ITEM_GRP_CD = T001B11_A731TBW10_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A731TBW10_CRF_ITEM_GRP_CD", A731TBW10_CRF_ITEM_GRP_CD);
         A732TBW10_VISIT_NO = T001B11_A732TBW10_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
         A733TBW10_DOM_CD = T001B11_A733TBW10_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A733TBW10_DOM_CD", A733TBW10_DOM_CD);
         A734TBW10_DOM_VAR_NM = T001B11_A734TBW10_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A734TBW10_DOM_VAR_NM", A734TBW10_DOM_VAR_NM);
         A735TBW10_DOM_ITM_GRP_OID = T001B11_A735TBW10_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A735TBW10_DOM_ITM_GRP_OID", A735TBW10_DOM_ITM_GRP_OID);
         A736TBW10_DOM_ITM_GRP_ROWNO = T001B11_A736TBW10_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
      }
   }

   public void scanEnd1B46( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1B46( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1B46( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1B46( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1B46( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1B46( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1B46( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1B46( )
   {
      edtTBW10_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_SESSION_ID_Enabled, 5, 0)));
      edtTBW10_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_DATETIME_Enabled, 5, 0)));
      edtTBW10_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_STUDY_ID_Enabled, 5, 0)));
      edtTBW10_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_SUBJECT_ID_Enabled, 5, 0)));
      edtTBW10_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_CRF_ID_Enabled, 5, 0)));
      edtTBW10_CRF_ITEM_GRP_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_CRF_ITEM_GRP_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_CRF_ITEM_GRP_CD_Enabled, 5, 0)));
      edtTBW10_VISIT_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_VISIT_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_VISIT_NO_Enabled, 5, 0)));
      edtTBW10_DOM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_DOM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_DOM_CD_Enabled, 5, 0)));
      edtTBW10_DOM_VAR_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_DOM_VAR_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_DOM_VAR_NM_Enabled, 5, 0)));
      edtTBW10_DOM_ITM_GRP_OID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_DOM_ITM_GRP_OID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_DOM_ITM_GRP_OID_Enabled, 5, 0)));
      edtTBW10_DOM_ITM_GRP_ROWNO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_DOM_ITM_GRP_ROWNO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_DOM_ITM_GRP_ROWNO_Enabled, 5, 0)));
      edtTBW10_CHAR_1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_CHAR_1_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_CHAR_1_Enabled, 5, 0)));
      edtTBW10_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_VALUE_Enabled, 5, 0)));
      edtTBW10_CRF_ITEM_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_CRF_ITEM_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_CRF_ITEM_DIV_Enabled, 5, 0)));
      edtTBW10_LIST_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_LIST_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_LIST_CD_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1B0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "TBW10_ CSV_ WORK") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbw10_csv_work") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1B46( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z726TBW10_SESSION_ID", GXutil.rtrim( Z726TBW10_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z727TBW10_DATETIME", localUtil.ttoc( Z727TBW10_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z728TBW10_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z728TBW10_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z729TBW10_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z729TBW10_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z730TBW10_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z730TBW10_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z731TBW10_CRF_ITEM_GRP_CD", GXutil.rtrim( Z731TBW10_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z732TBW10_VISIT_NO", GXutil.ltrim( localUtil.ntoc( Z732TBW10_VISIT_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z733TBW10_DOM_CD", GXutil.rtrim( Z733TBW10_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z734TBW10_DOM_VAR_NM", GXutil.rtrim( Z734TBW10_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z735TBW10_DOM_ITM_GRP_OID", GXutil.rtrim( Z735TBW10_DOM_ITM_GRP_OID));
      GxWebStd.gx_hidden_field( httpContext, "Z736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( localUtil.ntoc( Z736TBW10_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z737TBW10_CHAR_1", GXutil.ltrim( localUtil.ntoc( Z737TBW10_CHAR_1, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z738TBW10_VALUE", GXutil.rtrim( Z738TBW10_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z739TBW10_CRF_ITEM_DIV", GXutil.rtrim( Z739TBW10_CRF_ITEM_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z740TBW10_LIST_CD", GXutil.rtrim( Z740TBW10_LIST_CD));
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

   public void initializeNonKey1B46( )
   {
      A737TBW10_CHAR_1 = (byte)(0) ;
      n737TBW10_CHAR_1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A737TBW10_CHAR_1", GXutil.str( A737TBW10_CHAR_1, 1, 0));
      n737TBW10_CHAR_1 = ((0==A737TBW10_CHAR_1) ? true : false) ;
      A738TBW10_VALUE = "" ;
      n738TBW10_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A738TBW10_VALUE", A738TBW10_VALUE);
      n738TBW10_VALUE = ((GXutil.strcmp("", A738TBW10_VALUE)==0) ? true : false) ;
      A739TBW10_CRF_ITEM_DIV = "" ;
      n739TBW10_CRF_ITEM_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A739TBW10_CRF_ITEM_DIV", A739TBW10_CRF_ITEM_DIV);
      n739TBW10_CRF_ITEM_DIV = ((GXutil.strcmp("", A739TBW10_CRF_ITEM_DIV)==0) ? true : false) ;
      A740TBW10_LIST_CD = "" ;
      n740TBW10_LIST_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A740TBW10_LIST_CD", A740TBW10_LIST_CD);
      n740TBW10_LIST_CD = ((GXutil.strcmp("", A740TBW10_LIST_CD)==0) ? true : false) ;
   }

   public void initAll1B46( )
   {
      A726TBW10_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A726TBW10_SESSION_ID", A726TBW10_SESSION_ID);
      A727TBW10_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A727TBW10_DATETIME", localUtil.ttoc( A727TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
      A728TBW10_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A728TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A728TBW10_STUDY_ID, 10, 0)));
      A729TBW10_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A729TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A729TBW10_SUBJECT_ID, 6, 0)));
      A730TBW10_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A730TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A730TBW10_CRF_ID, 4, 0)));
      A731TBW10_CRF_ITEM_GRP_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A731TBW10_CRF_ITEM_GRP_CD", A731TBW10_CRF_ITEM_GRP_CD);
      A732TBW10_VISIT_NO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A732TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A732TBW10_VISIT_NO, 3, 0)));
      A733TBW10_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A733TBW10_DOM_CD", A733TBW10_DOM_CD);
      A734TBW10_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A734TBW10_DOM_VAR_NM", A734TBW10_DOM_VAR_NM);
      A735TBW10_DOM_ITM_GRP_OID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A735TBW10_DOM_ITM_GRP_OID", A735TBW10_DOM_ITM_GRP_OID);
      A736TBW10_DOM_ITM_GRP_ROWNO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A736TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A736TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
      initializeNonKey1B46( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14571647");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbw10_csv_work.js", "?14571647");
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
      lblTextblocktbw10_session_id_Internalname = "TEXTBLOCKTBW10_SESSION_ID" ;
      edtTBW10_SESSION_ID_Internalname = "TBW10_SESSION_ID" ;
      lblTextblocktbw10_datetime_Internalname = "TEXTBLOCKTBW10_DATETIME" ;
      edtTBW10_DATETIME_Internalname = "TBW10_DATETIME" ;
      lblTextblocktbw10_study_id_Internalname = "TEXTBLOCKTBW10_STUDY_ID" ;
      edtTBW10_STUDY_ID_Internalname = "TBW10_STUDY_ID" ;
      lblTextblocktbw10_subject_id_Internalname = "TEXTBLOCKTBW10_SUBJECT_ID" ;
      edtTBW10_SUBJECT_ID_Internalname = "TBW10_SUBJECT_ID" ;
      lblTextblocktbw10_crf_id_Internalname = "TEXTBLOCKTBW10_CRF_ID" ;
      edtTBW10_CRF_ID_Internalname = "TBW10_CRF_ID" ;
      lblTextblocktbw10_crf_item_grp_cd_Internalname = "TEXTBLOCKTBW10_CRF_ITEM_GRP_CD" ;
      edtTBW10_CRF_ITEM_GRP_CD_Internalname = "TBW10_CRF_ITEM_GRP_CD" ;
      lblTextblocktbw10_visit_no_Internalname = "TEXTBLOCKTBW10_VISIT_NO" ;
      edtTBW10_VISIT_NO_Internalname = "TBW10_VISIT_NO" ;
      lblTextblocktbw10_dom_cd_Internalname = "TEXTBLOCKTBW10_DOM_CD" ;
      edtTBW10_DOM_CD_Internalname = "TBW10_DOM_CD" ;
      lblTextblocktbw10_dom_var_nm_Internalname = "TEXTBLOCKTBW10_DOM_VAR_NM" ;
      edtTBW10_DOM_VAR_NM_Internalname = "TBW10_DOM_VAR_NM" ;
      lblTextblocktbw10_dom_itm_grp_oid_Internalname = "TEXTBLOCKTBW10_DOM_ITM_GRP_OID" ;
      edtTBW10_DOM_ITM_GRP_OID_Internalname = "TBW10_DOM_ITM_GRP_OID" ;
      lblTextblocktbw10_dom_itm_grp_rowno_Internalname = "TEXTBLOCKTBW10_DOM_ITM_GRP_ROWNO" ;
      edtTBW10_DOM_ITM_GRP_ROWNO_Internalname = "TBW10_DOM_ITM_GRP_ROWNO" ;
      lblTextblocktbw10_char_1_Internalname = "TEXTBLOCKTBW10_CHAR_1" ;
      edtTBW10_CHAR_1_Internalname = "TBW10_CHAR_1" ;
      lblTextblocktbw10_value_Internalname = "TEXTBLOCKTBW10_VALUE" ;
      edtTBW10_VALUE_Internalname = "TBW10_VALUE" ;
      lblTextblocktbw10_crf_item_div_Internalname = "TEXTBLOCKTBW10_CRF_ITEM_DIV" ;
      edtTBW10_CRF_ITEM_DIV_Internalname = "TBW10_CRF_ITEM_DIV" ;
      lblTextblocktbw10_list_cd_Internalname = "TEXTBLOCKTBW10_LIST_CD" ;
      edtTBW10_LIST_CD_Internalname = "TBW10_LIST_CD" ;
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
      edtTBW10_LIST_CD_Jsonclick = "" ;
      edtTBW10_LIST_CD_Enabled = 1 ;
      edtTBW10_CRF_ITEM_DIV_Jsonclick = "" ;
      edtTBW10_CRF_ITEM_DIV_Enabled = 1 ;
      edtTBW10_VALUE_Enabled = 1 ;
      edtTBW10_CHAR_1_Jsonclick = "" ;
      edtTBW10_CHAR_1_Enabled = 1 ;
      edtTBW10_DOM_ITM_GRP_ROWNO_Jsonclick = "" ;
      edtTBW10_DOM_ITM_GRP_ROWNO_Enabled = 1 ;
      edtTBW10_DOM_ITM_GRP_OID_Jsonclick = "" ;
      edtTBW10_DOM_ITM_GRP_OID_Enabled = 1 ;
      edtTBW10_DOM_VAR_NM_Jsonclick = "" ;
      edtTBW10_DOM_VAR_NM_Enabled = 1 ;
      edtTBW10_DOM_CD_Jsonclick = "" ;
      edtTBW10_DOM_CD_Enabled = 1 ;
      edtTBW10_VISIT_NO_Jsonclick = "" ;
      edtTBW10_VISIT_NO_Enabled = 1 ;
      edtTBW10_CRF_ITEM_GRP_CD_Jsonclick = "" ;
      edtTBW10_CRF_ITEM_GRP_CD_Enabled = 1 ;
      edtTBW10_CRF_ID_Jsonclick = "" ;
      edtTBW10_CRF_ID_Enabled = 1 ;
      edtTBW10_SUBJECT_ID_Jsonclick = "" ;
      edtTBW10_SUBJECT_ID_Enabled = 1 ;
      edtTBW10_STUDY_ID_Jsonclick = "" ;
      edtTBW10_STUDY_ID_Enabled = 1 ;
      edtTBW10_DATETIME_Jsonclick = "" ;
      edtTBW10_DATETIME_Enabled = 1 ;
      edtTBW10_SESSION_ID_Jsonclick = "" ;
      edtTBW10_SESSION_ID_Enabled = 1 ;
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
      GX_FocusControl = edtTBW10_CHAR_1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw10_dom_itm_grp_rowno( String GX_Parm1 ,
                                              java.util.Date GX_Parm2 ,
                                              long GX_Parm3 ,
                                              int GX_Parm4 ,
                                              short GX_Parm5 ,
                                              String GX_Parm6 ,
                                              short GX_Parm7 ,
                                              String GX_Parm8 ,
                                              String GX_Parm9 ,
                                              String GX_Parm10 ,
                                              short GX_Parm11 ,
                                              byte GX_Parm12 ,
                                              String GX_Parm13 ,
                                              String GX_Parm14 ,
                                              String GX_Parm15 )
   {
      A726TBW10_SESSION_ID = GX_Parm1 ;
      A727TBW10_DATETIME = GX_Parm2 ;
      A728TBW10_STUDY_ID = GX_Parm3 ;
      A729TBW10_SUBJECT_ID = GX_Parm4 ;
      A730TBW10_CRF_ID = GX_Parm5 ;
      A731TBW10_CRF_ITEM_GRP_CD = GX_Parm6 ;
      A732TBW10_VISIT_NO = GX_Parm7 ;
      A733TBW10_DOM_CD = GX_Parm8 ;
      A734TBW10_DOM_VAR_NM = GX_Parm9 ;
      A735TBW10_DOM_ITM_GRP_OID = GX_Parm10 ;
      A736TBW10_DOM_ITM_GRP_ROWNO = GX_Parm11 ;
      A737TBW10_CHAR_1 = GX_Parm12 ;
      n737TBW10_CHAR_1 = false ;
      A738TBW10_VALUE = GX_Parm13 ;
      n738TBW10_VALUE = false ;
      A739TBW10_CRF_ITEM_DIV = GX_Parm14 ;
      n739TBW10_CRF_ITEM_DIV = false ;
      A740TBW10_LIST_CD = GX_Parm15 ;
      n740TBW10_LIST_CD = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A737TBW10_CHAR_1, (byte)(1), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A738TBW10_VALUE));
      isValidOutput.add(GXutil.rtrim( A739TBW10_CRF_ITEM_DIV));
      isValidOutput.add(GXutil.rtrim( A740TBW10_LIST_CD));
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z726TBW10_SESSION_ID));
      isValidOutput.add(localUtil.ttoc( Z727TBW10_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z728TBW10_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z729TBW10_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z730TBW10_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z731TBW10_CRF_ITEM_GRP_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z732TBW10_VISIT_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z733TBW10_DOM_CD));
      isValidOutput.add(GXutil.rtrim( Z734TBW10_DOM_VAR_NM));
      isValidOutput.add(GXutil.rtrim( Z735TBW10_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z736TBW10_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z737TBW10_CHAR_1, (byte)(1), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z738TBW10_VALUE));
      isValidOutput.add(GXutil.rtrim( Z739TBW10_CRF_ITEM_DIV));
      isValidOutput.add(GXutil.rtrim( Z740TBW10_LIST_CD));
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
      lblTextblocktbw10_session_id_Jsonclick = "" ;
      A726TBW10_SESSION_ID = "" ;
      lblTextblocktbw10_datetime_Jsonclick = "" ;
      A727TBW10_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw10_study_id_Jsonclick = "" ;
      lblTextblocktbw10_subject_id_Jsonclick = "" ;
      lblTextblocktbw10_crf_id_Jsonclick = "" ;
      lblTextblocktbw10_crf_item_grp_cd_Jsonclick = "" ;
      A731TBW10_CRF_ITEM_GRP_CD = "" ;
      lblTextblocktbw10_visit_no_Jsonclick = "" ;
      lblTextblocktbw10_dom_cd_Jsonclick = "" ;
      A733TBW10_DOM_CD = "" ;
      lblTextblocktbw10_dom_var_nm_Jsonclick = "" ;
      A734TBW10_DOM_VAR_NM = "" ;
      lblTextblocktbw10_dom_itm_grp_oid_Jsonclick = "" ;
      A735TBW10_DOM_ITM_GRP_OID = "" ;
      lblTextblocktbw10_dom_itm_grp_rowno_Jsonclick = "" ;
      lblTextblocktbw10_char_1_Jsonclick = "" ;
      lblTextblocktbw10_value_Jsonclick = "" ;
      A738TBW10_VALUE = "" ;
      lblTextblocktbw10_crf_item_div_Jsonclick = "" ;
      A739TBW10_CRF_ITEM_DIV = "" ;
      lblTextblocktbw10_list_cd_Jsonclick = "" ;
      A740TBW10_LIST_CD = "" ;
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
      Z726TBW10_SESSION_ID = "" ;
      Z727TBW10_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z731TBW10_CRF_ITEM_GRP_CD = "" ;
      Z733TBW10_DOM_CD = "" ;
      Z734TBW10_DOM_VAR_NM = "" ;
      Z735TBW10_DOM_ITM_GRP_OID = "" ;
      Z738TBW10_VALUE = "" ;
      Z739TBW10_CRF_ITEM_DIV = "" ;
      Z740TBW10_LIST_CD = "" ;
      Gx_mode = "" ;
      AV8Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T001B4_A726TBW10_SESSION_ID = new String[] {""} ;
      T001B4_A727TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B4_A728TBW10_STUDY_ID = new long[1] ;
      T001B4_A729TBW10_SUBJECT_ID = new int[1] ;
      T001B4_A730TBW10_CRF_ID = new short[1] ;
      T001B4_A731TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B4_A732TBW10_VISIT_NO = new short[1] ;
      T001B4_A733TBW10_DOM_CD = new String[] {""} ;
      T001B4_A734TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B4_A735TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B4_A736TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B4_A737TBW10_CHAR_1 = new byte[1] ;
      T001B4_n737TBW10_CHAR_1 = new boolean[] {false} ;
      T001B4_A738TBW10_VALUE = new String[] {""} ;
      T001B4_n738TBW10_VALUE = new boolean[] {false} ;
      T001B4_A739TBW10_CRF_ITEM_DIV = new String[] {""} ;
      T001B4_n739TBW10_CRF_ITEM_DIV = new boolean[] {false} ;
      T001B4_A740TBW10_LIST_CD = new String[] {""} ;
      T001B4_n740TBW10_LIST_CD = new boolean[] {false} ;
      T001B5_A726TBW10_SESSION_ID = new String[] {""} ;
      T001B5_A727TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B5_A728TBW10_STUDY_ID = new long[1] ;
      T001B5_A729TBW10_SUBJECT_ID = new int[1] ;
      T001B5_A730TBW10_CRF_ID = new short[1] ;
      T001B5_A731TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B5_A732TBW10_VISIT_NO = new short[1] ;
      T001B5_A733TBW10_DOM_CD = new String[] {""} ;
      T001B5_A734TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B5_A735TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B5_A736TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B3_A726TBW10_SESSION_ID = new String[] {""} ;
      T001B3_A727TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B3_A728TBW10_STUDY_ID = new long[1] ;
      T001B3_A729TBW10_SUBJECT_ID = new int[1] ;
      T001B3_A730TBW10_CRF_ID = new short[1] ;
      T001B3_A731TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B3_A732TBW10_VISIT_NO = new short[1] ;
      T001B3_A733TBW10_DOM_CD = new String[] {""} ;
      T001B3_A734TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B3_A735TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B3_A736TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B3_A737TBW10_CHAR_1 = new byte[1] ;
      T001B3_n737TBW10_CHAR_1 = new boolean[] {false} ;
      T001B3_A738TBW10_VALUE = new String[] {""} ;
      T001B3_n738TBW10_VALUE = new boolean[] {false} ;
      T001B3_A739TBW10_CRF_ITEM_DIV = new String[] {""} ;
      T001B3_n739TBW10_CRF_ITEM_DIV = new boolean[] {false} ;
      T001B3_A740TBW10_LIST_CD = new String[] {""} ;
      T001B3_n740TBW10_LIST_CD = new boolean[] {false} ;
      sMode46 = "" ;
      T001B6_A726TBW10_SESSION_ID = new String[] {""} ;
      T001B6_A727TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B6_A728TBW10_STUDY_ID = new long[1] ;
      T001B6_A729TBW10_SUBJECT_ID = new int[1] ;
      T001B6_A730TBW10_CRF_ID = new short[1] ;
      T001B6_A731TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B6_A732TBW10_VISIT_NO = new short[1] ;
      T001B6_A733TBW10_DOM_CD = new String[] {""} ;
      T001B6_A734TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B6_A735TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B6_A736TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B7_A726TBW10_SESSION_ID = new String[] {""} ;
      T001B7_A727TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B7_A728TBW10_STUDY_ID = new long[1] ;
      T001B7_A729TBW10_SUBJECT_ID = new int[1] ;
      T001B7_A730TBW10_CRF_ID = new short[1] ;
      T001B7_A731TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B7_A732TBW10_VISIT_NO = new short[1] ;
      T001B7_A733TBW10_DOM_CD = new String[] {""} ;
      T001B7_A734TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B7_A735TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B7_A736TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B2_A726TBW10_SESSION_ID = new String[] {""} ;
      T001B2_A727TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B2_A728TBW10_STUDY_ID = new long[1] ;
      T001B2_A729TBW10_SUBJECT_ID = new int[1] ;
      T001B2_A730TBW10_CRF_ID = new short[1] ;
      T001B2_A731TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B2_A732TBW10_VISIT_NO = new short[1] ;
      T001B2_A733TBW10_DOM_CD = new String[] {""} ;
      T001B2_A734TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B2_A735TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B2_A736TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B2_A737TBW10_CHAR_1 = new byte[1] ;
      T001B2_n737TBW10_CHAR_1 = new boolean[] {false} ;
      T001B2_A738TBW10_VALUE = new String[] {""} ;
      T001B2_n738TBW10_VALUE = new boolean[] {false} ;
      T001B2_A739TBW10_CRF_ITEM_DIV = new String[] {""} ;
      T001B2_n739TBW10_CRF_ITEM_DIV = new boolean[] {false} ;
      T001B2_A740TBW10_LIST_CD = new String[] {""} ;
      T001B2_n740TBW10_LIST_CD = new boolean[] {false} ;
      T001B11_A726TBW10_SESSION_ID = new String[] {""} ;
      T001B11_A727TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B11_A728TBW10_STUDY_ID = new long[1] ;
      T001B11_A729TBW10_SUBJECT_ID = new int[1] ;
      T001B11_A730TBW10_CRF_ID = new short[1] ;
      T001B11_A731TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B11_A732TBW10_VISIT_NO = new short[1] ;
      T001B11_A733TBW10_DOM_CD = new String[] {""} ;
      T001B11_A734TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B11_A735TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B11_A736TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char3 = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw10_csv_work__default(),
         new Object[] {
             new Object[] {
            T001B2_A726TBW10_SESSION_ID, T001B2_A727TBW10_DATETIME, T001B2_A728TBW10_STUDY_ID, T001B2_A729TBW10_SUBJECT_ID, T001B2_A730TBW10_CRF_ID, T001B2_A731TBW10_CRF_ITEM_GRP_CD, T001B2_A732TBW10_VISIT_NO, T001B2_A733TBW10_DOM_CD, T001B2_A734TBW10_DOM_VAR_NM, T001B2_A735TBW10_DOM_ITM_GRP_OID,
            T001B2_A736TBW10_DOM_ITM_GRP_ROWNO, T001B2_A737TBW10_CHAR_1, T001B2_n737TBW10_CHAR_1, T001B2_A738TBW10_VALUE, T001B2_n738TBW10_VALUE, T001B2_A739TBW10_CRF_ITEM_DIV, T001B2_n739TBW10_CRF_ITEM_DIV, T001B2_A740TBW10_LIST_CD, T001B2_n740TBW10_LIST_CD
            }
            , new Object[] {
            T001B3_A726TBW10_SESSION_ID, T001B3_A727TBW10_DATETIME, T001B3_A728TBW10_STUDY_ID, T001B3_A729TBW10_SUBJECT_ID, T001B3_A730TBW10_CRF_ID, T001B3_A731TBW10_CRF_ITEM_GRP_CD, T001B3_A732TBW10_VISIT_NO, T001B3_A733TBW10_DOM_CD, T001B3_A734TBW10_DOM_VAR_NM, T001B3_A735TBW10_DOM_ITM_GRP_OID,
            T001B3_A736TBW10_DOM_ITM_GRP_ROWNO, T001B3_A737TBW10_CHAR_1, T001B3_n737TBW10_CHAR_1, T001B3_A738TBW10_VALUE, T001B3_n738TBW10_VALUE, T001B3_A739TBW10_CRF_ITEM_DIV, T001B3_n739TBW10_CRF_ITEM_DIV, T001B3_A740TBW10_LIST_CD, T001B3_n740TBW10_LIST_CD
            }
            , new Object[] {
            T001B4_A726TBW10_SESSION_ID, T001B4_A727TBW10_DATETIME, T001B4_A728TBW10_STUDY_ID, T001B4_A729TBW10_SUBJECT_ID, T001B4_A730TBW10_CRF_ID, T001B4_A731TBW10_CRF_ITEM_GRP_CD, T001B4_A732TBW10_VISIT_NO, T001B4_A733TBW10_DOM_CD, T001B4_A734TBW10_DOM_VAR_NM, T001B4_A735TBW10_DOM_ITM_GRP_OID,
            T001B4_A736TBW10_DOM_ITM_GRP_ROWNO, T001B4_A737TBW10_CHAR_1, T001B4_n737TBW10_CHAR_1, T001B4_A738TBW10_VALUE, T001B4_n738TBW10_VALUE, T001B4_A739TBW10_CRF_ITEM_DIV, T001B4_n739TBW10_CRF_ITEM_DIV, T001B4_A740TBW10_LIST_CD, T001B4_n740TBW10_LIST_CD
            }
            , new Object[] {
            T001B5_A726TBW10_SESSION_ID, T001B5_A727TBW10_DATETIME, T001B5_A728TBW10_STUDY_ID, T001B5_A729TBW10_SUBJECT_ID, T001B5_A730TBW10_CRF_ID, T001B5_A731TBW10_CRF_ITEM_GRP_CD, T001B5_A732TBW10_VISIT_NO, T001B5_A733TBW10_DOM_CD, T001B5_A734TBW10_DOM_VAR_NM, T001B5_A735TBW10_DOM_ITM_GRP_OID,
            T001B5_A736TBW10_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            T001B6_A726TBW10_SESSION_ID, T001B6_A727TBW10_DATETIME, T001B6_A728TBW10_STUDY_ID, T001B6_A729TBW10_SUBJECT_ID, T001B6_A730TBW10_CRF_ID, T001B6_A731TBW10_CRF_ITEM_GRP_CD, T001B6_A732TBW10_VISIT_NO, T001B6_A733TBW10_DOM_CD, T001B6_A734TBW10_DOM_VAR_NM, T001B6_A735TBW10_DOM_ITM_GRP_OID,
            T001B6_A736TBW10_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            T001B7_A726TBW10_SESSION_ID, T001B7_A727TBW10_DATETIME, T001B7_A728TBW10_STUDY_ID, T001B7_A729TBW10_SUBJECT_ID, T001B7_A730TBW10_CRF_ID, T001B7_A731TBW10_CRF_ITEM_GRP_CD, T001B7_A732TBW10_VISIT_NO, T001B7_A733TBW10_DOM_CD, T001B7_A734TBW10_DOM_VAR_NM, T001B7_A735TBW10_DOM_ITM_GRP_OID,
            T001B7_A736TBW10_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001B11_A726TBW10_SESSION_ID, T001B11_A727TBW10_DATETIME, T001B11_A728TBW10_STUDY_ID, T001B11_A729TBW10_SUBJECT_ID, T001B11_A730TBW10_CRF_ID, T001B11_A731TBW10_CRF_ITEM_GRP_CD, T001B11_A732TBW10_VISIT_NO, T001B11_A733TBW10_DOM_CD, T001B11_A734TBW10_DOM_VAR_NM, T001B11_A735TBW10_DOM_ITM_GRP_OID,
            T001B11_A736TBW10_DOM_ITM_GRP_ROWNO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW10_CSV_WORK" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A737TBW10_CHAR_1 ;
   private byte Z737TBW10_CHAR_1 ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A730TBW10_CRF_ID ;
   private short A732TBW10_VISIT_NO ;
   private short A736TBW10_DOM_ITM_GRP_ROWNO ;
   private short Z730TBW10_CRF_ID ;
   private short Z732TBW10_VISIT_NO ;
   private short Z736TBW10_DOM_ITM_GRP_ROWNO ;
   private short RcdFound46 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW10_SESSION_ID_Enabled ;
   private int edtTBW10_DATETIME_Enabled ;
   private int edtTBW10_STUDY_ID_Enabled ;
   private int A729TBW10_SUBJECT_ID ;
   private int edtTBW10_SUBJECT_ID_Enabled ;
   private int edtTBW10_CRF_ID_Enabled ;
   private int edtTBW10_CRF_ITEM_GRP_CD_Enabled ;
   private int edtTBW10_VISIT_NO_Enabled ;
   private int edtTBW10_DOM_CD_Enabled ;
   private int edtTBW10_DOM_VAR_NM_Enabled ;
   private int edtTBW10_DOM_ITM_GRP_OID_Enabled ;
   private int edtTBW10_DOM_ITM_GRP_ROWNO_Enabled ;
   private int edtTBW10_CHAR_1_Enabled ;
   private int edtTBW10_VALUE_Enabled ;
   private int edtTBW10_CRF_ITEM_DIV_Enabled ;
   private int edtTBW10_LIST_CD_Enabled ;
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
   private int Z729TBW10_SUBJECT_ID ;
   private int GX_JID ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A728TBW10_STUDY_ID ;
   private long Z728TBW10_STUDY_ID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW10_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw10_session_id_Internalname ;
   private String lblTextblocktbw10_session_id_Jsonclick ;
   private String edtTBW10_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw10_datetime_Internalname ;
   private String lblTextblocktbw10_datetime_Jsonclick ;
   private String edtTBW10_DATETIME_Internalname ;
   private String edtTBW10_DATETIME_Jsonclick ;
   private String lblTextblocktbw10_study_id_Internalname ;
   private String lblTextblocktbw10_study_id_Jsonclick ;
   private String edtTBW10_STUDY_ID_Internalname ;
   private String edtTBW10_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw10_subject_id_Internalname ;
   private String lblTextblocktbw10_subject_id_Jsonclick ;
   private String edtTBW10_SUBJECT_ID_Internalname ;
   private String edtTBW10_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbw10_crf_id_Internalname ;
   private String lblTextblocktbw10_crf_id_Jsonclick ;
   private String edtTBW10_CRF_ID_Internalname ;
   private String edtTBW10_CRF_ID_Jsonclick ;
   private String lblTextblocktbw10_crf_item_grp_cd_Internalname ;
   private String lblTextblocktbw10_crf_item_grp_cd_Jsonclick ;
   private String edtTBW10_CRF_ITEM_GRP_CD_Internalname ;
   private String edtTBW10_CRF_ITEM_GRP_CD_Jsonclick ;
   private String lblTextblocktbw10_visit_no_Internalname ;
   private String lblTextblocktbw10_visit_no_Jsonclick ;
   private String edtTBW10_VISIT_NO_Internalname ;
   private String edtTBW10_VISIT_NO_Jsonclick ;
   private String lblTextblocktbw10_dom_cd_Internalname ;
   private String lblTextblocktbw10_dom_cd_Jsonclick ;
   private String edtTBW10_DOM_CD_Internalname ;
   private String edtTBW10_DOM_CD_Jsonclick ;
   private String lblTextblocktbw10_dom_var_nm_Internalname ;
   private String lblTextblocktbw10_dom_var_nm_Jsonclick ;
   private String edtTBW10_DOM_VAR_NM_Internalname ;
   private String edtTBW10_DOM_VAR_NM_Jsonclick ;
   private String lblTextblocktbw10_dom_itm_grp_oid_Internalname ;
   private String lblTextblocktbw10_dom_itm_grp_oid_Jsonclick ;
   private String edtTBW10_DOM_ITM_GRP_OID_Internalname ;
   private String edtTBW10_DOM_ITM_GRP_OID_Jsonclick ;
   private String lblTextblocktbw10_dom_itm_grp_rowno_Internalname ;
   private String lblTextblocktbw10_dom_itm_grp_rowno_Jsonclick ;
   private String edtTBW10_DOM_ITM_GRP_ROWNO_Internalname ;
   private String edtTBW10_DOM_ITM_GRP_ROWNO_Jsonclick ;
   private String lblTextblocktbw10_char_1_Internalname ;
   private String lblTextblocktbw10_char_1_Jsonclick ;
   private String edtTBW10_CHAR_1_Internalname ;
   private String edtTBW10_CHAR_1_Jsonclick ;
   private String lblTextblocktbw10_value_Internalname ;
   private String lblTextblocktbw10_value_Jsonclick ;
   private String edtTBW10_VALUE_Internalname ;
   private String lblTextblocktbw10_crf_item_div_Internalname ;
   private String lblTextblocktbw10_crf_item_div_Jsonclick ;
   private String edtTBW10_CRF_ITEM_DIV_Internalname ;
   private String edtTBW10_CRF_ITEM_DIV_Jsonclick ;
   private String lblTextblocktbw10_list_cd_Internalname ;
   private String lblTextblocktbw10_list_cd_Jsonclick ;
   private String edtTBW10_LIST_CD_Internalname ;
   private String edtTBW10_LIST_CD_Jsonclick ;
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
   private String sMode46 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char3 ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A727TBW10_DATETIME ;
   private java.util.Date Z727TBW10_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n737TBW10_CHAR_1 ;
   private boolean n738TBW10_VALUE ;
   private boolean n739TBW10_CRF_ITEM_DIV ;
   private boolean n740TBW10_LIST_CD ;
   private String A726TBW10_SESSION_ID ;
   private String A731TBW10_CRF_ITEM_GRP_CD ;
   private String A733TBW10_DOM_CD ;
   private String A734TBW10_DOM_VAR_NM ;
   private String A735TBW10_DOM_ITM_GRP_OID ;
   private String A738TBW10_VALUE ;
   private String A739TBW10_CRF_ITEM_DIV ;
   private String A740TBW10_LIST_CD ;
   private String Z726TBW10_SESSION_ID ;
   private String Z731TBW10_CRF_ITEM_GRP_CD ;
   private String Z733TBW10_DOM_CD ;
   private String Z734TBW10_DOM_VAR_NM ;
   private String Z735TBW10_DOM_ITM_GRP_OID ;
   private String Z738TBW10_VALUE ;
   private String Z739TBW10_CRF_ITEM_DIV ;
   private String Z740TBW10_LIST_CD ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001B4_A726TBW10_SESSION_ID ;
   private java.util.Date[] T001B4_A727TBW10_DATETIME ;
   private long[] T001B4_A728TBW10_STUDY_ID ;
   private int[] T001B4_A729TBW10_SUBJECT_ID ;
   private short[] T001B4_A730TBW10_CRF_ID ;
   private String[] T001B4_A731TBW10_CRF_ITEM_GRP_CD ;
   private short[] T001B4_A732TBW10_VISIT_NO ;
   private String[] T001B4_A733TBW10_DOM_CD ;
   private String[] T001B4_A734TBW10_DOM_VAR_NM ;
   private String[] T001B4_A735TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B4_A736TBW10_DOM_ITM_GRP_ROWNO ;
   private byte[] T001B4_A737TBW10_CHAR_1 ;
   private boolean[] T001B4_n737TBW10_CHAR_1 ;
   private String[] T001B4_A738TBW10_VALUE ;
   private boolean[] T001B4_n738TBW10_VALUE ;
   private String[] T001B4_A739TBW10_CRF_ITEM_DIV ;
   private boolean[] T001B4_n739TBW10_CRF_ITEM_DIV ;
   private String[] T001B4_A740TBW10_LIST_CD ;
   private boolean[] T001B4_n740TBW10_LIST_CD ;
   private String[] T001B5_A726TBW10_SESSION_ID ;
   private java.util.Date[] T001B5_A727TBW10_DATETIME ;
   private long[] T001B5_A728TBW10_STUDY_ID ;
   private int[] T001B5_A729TBW10_SUBJECT_ID ;
   private short[] T001B5_A730TBW10_CRF_ID ;
   private String[] T001B5_A731TBW10_CRF_ITEM_GRP_CD ;
   private short[] T001B5_A732TBW10_VISIT_NO ;
   private String[] T001B5_A733TBW10_DOM_CD ;
   private String[] T001B5_A734TBW10_DOM_VAR_NM ;
   private String[] T001B5_A735TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B5_A736TBW10_DOM_ITM_GRP_ROWNO ;
   private String[] T001B3_A726TBW10_SESSION_ID ;
   private java.util.Date[] T001B3_A727TBW10_DATETIME ;
   private long[] T001B3_A728TBW10_STUDY_ID ;
   private int[] T001B3_A729TBW10_SUBJECT_ID ;
   private short[] T001B3_A730TBW10_CRF_ID ;
   private String[] T001B3_A731TBW10_CRF_ITEM_GRP_CD ;
   private short[] T001B3_A732TBW10_VISIT_NO ;
   private String[] T001B3_A733TBW10_DOM_CD ;
   private String[] T001B3_A734TBW10_DOM_VAR_NM ;
   private String[] T001B3_A735TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B3_A736TBW10_DOM_ITM_GRP_ROWNO ;
   private byte[] T001B3_A737TBW10_CHAR_1 ;
   private boolean[] T001B3_n737TBW10_CHAR_1 ;
   private String[] T001B3_A738TBW10_VALUE ;
   private boolean[] T001B3_n738TBW10_VALUE ;
   private String[] T001B3_A739TBW10_CRF_ITEM_DIV ;
   private boolean[] T001B3_n739TBW10_CRF_ITEM_DIV ;
   private String[] T001B3_A740TBW10_LIST_CD ;
   private boolean[] T001B3_n740TBW10_LIST_CD ;
   private String[] T001B6_A726TBW10_SESSION_ID ;
   private java.util.Date[] T001B6_A727TBW10_DATETIME ;
   private long[] T001B6_A728TBW10_STUDY_ID ;
   private int[] T001B6_A729TBW10_SUBJECT_ID ;
   private short[] T001B6_A730TBW10_CRF_ID ;
   private String[] T001B6_A731TBW10_CRF_ITEM_GRP_CD ;
   private short[] T001B6_A732TBW10_VISIT_NO ;
   private String[] T001B6_A733TBW10_DOM_CD ;
   private String[] T001B6_A734TBW10_DOM_VAR_NM ;
   private String[] T001B6_A735TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B6_A736TBW10_DOM_ITM_GRP_ROWNO ;
   private String[] T001B7_A726TBW10_SESSION_ID ;
   private java.util.Date[] T001B7_A727TBW10_DATETIME ;
   private long[] T001B7_A728TBW10_STUDY_ID ;
   private int[] T001B7_A729TBW10_SUBJECT_ID ;
   private short[] T001B7_A730TBW10_CRF_ID ;
   private String[] T001B7_A731TBW10_CRF_ITEM_GRP_CD ;
   private short[] T001B7_A732TBW10_VISIT_NO ;
   private String[] T001B7_A733TBW10_DOM_CD ;
   private String[] T001B7_A734TBW10_DOM_VAR_NM ;
   private String[] T001B7_A735TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B7_A736TBW10_DOM_ITM_GRP_ROWNO ;
   private String[] T001B2_A726TBW10_SESSION_ID ;
   private java.util.Date[] T001B2_A727TBW10_DATETIME ;
   private long[] T001B2_A728TBW10_STUDY_ID ;
   private int[] T001B2_A729TBW10_SUBJECT_ID ;
   private short[] T001B2_A730TBW10_CRF_ID ;
   private String[] T001B2_A731TBW10_CRF_ITEM_GRP_CD ;
   private short[] T001B2_A732TBW10_VISIT_NO ;
   private String[] T001B2_A733TBW10_DOM_CD ;
   private String[] T001B2_A734TBW10_DOM_VAR_NM ;
   private String[] T001B2_A735TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B2_A736TBW10_DOM_ITM_GRP_ROWNO ;
   private byte[] T001B2_A737TBW10_CHAR_1 ;
   private boolean[] T001B2_n737TBW10_CHAR_1 ;
   private String[] T001B2_A738TBW10_VALUE ;
   private boolean[] T001B2_n738TBW10_VALUE ;
   private String[] T001B2_A739TBW10_CRF_ITEM_DIV ;
   private boolean[] T001B2_n739TBW10_CRF_ITEM_DIV ;
   private String[] T001B2_A740TBW10_LIST_CD ;
   private boolean[] T001B2_n740TBW10_LIST_CD ;
   private String[] T001B11_A726TBW10_SESSION_ID ;
   private java.util.Date[] T001B11_A727TBW10_DATETIME ;
   private long[] T001B11_A728TBW10_STUDY_ID ;
   private int[] T001B11_A729TBW10_SUBJECT_ID ;
   private short[] T001B11_A730TBW10_CRF_ID ;
   private String[] T001B11_A731TBW10_CRF_ITEM_GRP_CD ;
   private short[] T001B11_A732TBW10_VISIT_NO ;
   private String[] T001B11_A733TBW10_DOM_CD ;
   private String[] T001B11_A734TBW10_DOM_VAR_NM ;
   private String[] T001B11_A735TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B11_A736TBW10_DOM_ITM_GRP_ROWNO ;
}

final  class tbw10_csv_work__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001B2", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO`, `TBW10_CHAR_1`, `TBW10_VALUE`, `TBW10_CRF_ITEM_DIV`, `TBW10_LIST_CD` FROM `TBW10_CSV_WORK` WHERE `TBW10_SESSION_ID` = ? AND `TBW10_DATETIME` = ? AND `TBW10_STUDY_ID` = ? AND `TBW10_SUBJECT_ID` = ? AND `TBW10_CRF_ID` = ? AND `TBW10_CRF_ITEM_GRP_CD` = ? AND `TBW10_VISIT_NO` = ? AND `TBW10_DOM_CD` = ? AND `TBW10_DOM_VAR_NM` = ? AND `TBW10_DOM_ITM_GRP_OID` = ? AND `TBW10_DOM_ITM_GRP_ROWNO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001B3", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO`, `TBW10_CHAR_1`, `TBW10_VALUE`, `TBW10_CRF_ITEM_DIV`, `TBW10_LIST_CD` FROM `TBW10_CSV_WORK` WHERE `TBW10_SESSION_ID` = ? AND `TBW10_DATETIME` = ? AND `TBW10_STUDY_ID` = ? AND `TBW10_SUBJECT_ID` = ? AND `TBW10_CRF_ID` = ? AND `TBW10_CRF_ITEM_GRP_CD` = ? AND `TBW10_VISIT_NO` = ? AND `TBW10_DOM_CD` = ? AND `TBW10_DOM_VAR_NM` = ? AND `TBW10_DOM_ITM_GRP_OID` = ? AND `TBW10_DOM_ITM_GRP_ROWNO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001B4", "SELECT TM1.`TBW10_SESSION_ID`, TM1.`TBW10_DATETIME`, TM1.`TBW10_STUDY_ID`, TM1.`TBW10_SUBJECT_ID`, TM1.`TBW10_CRF_ID`, TM1.`TBW10_CRF_ITEM_GRP_CD`, TM1.`TBW10_VISIT_NO`, TM1.`TBW10_DOM_CD`, TM1.`TBW10_DOM_VAR_NM`, TM1.`TBW10_DOM_ITM_GRP_OID`, TM1.`TBW10_DOM_ITM_GRP_ROWNO`, TM1.`TBW10_CHAR_1`, TM1.`TBW10_VALUE`, TM1.`TBW10_CRF_ITEM_DIV`, TM1.`TBW10_LIST_CD` FROM `TBW10_CSV_WORK` TM1 WHERE TM1.`TBW10_SESSION_ID` = ? and TM1.`TBW10_DATETIME` = ? and TM1.`TBW10_STUDY_ID` = ? and TM1.`TBW10_SUBJECT_ID` = ? and TM1.`TBW10_CRF_ID` = ? and TM1.`TBW10_CRF_ITEM_GRP_CD` = ? and TM1.`TBW10_VISIT_NO` = ? and TM1.`TBW10_DOM_CD` = ? and TM1.`TBW10_DOM_VAR_NM` = ? and TM1.`TBW10_DOM_ITM_GRP_OID` = ? and TM1.`TBW10_DOM_ITM_GRP_ROWNO` = ? ORDER BY TM1.`TBW10_SESSION_ID`, TM1.`TBW10_DATETIME`, TM1.`TBW10_STUDY_ID`, TM1.`TBW10_SUBJECT_ID`, TM1.`TBW10_CRF_ID`, TM1.`TBW10_CRF_ITEM_GRP_CD`, TM1.`TBW10_VISIT_NO`, TM1.`TBW10_DOM_CD`, TM1.`TBW10_DOM_VAR_NM`, TM1.`TBW10_DOM_ITM_GRP_OID`, TM1.`TBW10_DOM_ITM_GRP_ROWNO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T001B5", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO` FROM `TBW10_CSV_WORK` WHERE `TBW10_SESSION_ID` = ? AND `TBW10_DATETIME` = ? AND `TBW10_STUDY_ID` = ? AND `TBW10_SUBJECT_ID` = ? AND `TBW10_CRF_ID` = ? AND `TBW10_CRF_ITEM_GRP_CD` = ? AND `TBW10_VISIT_NO` = ? AND `TBW10_DOM_CD` = ? AND `TBW10_DOM_VAR_NM` = ? AND `TBW10_DOM_ITM_GRP_OID` = ? AND `TBW10_DOM_ITM_GRP_ROWNO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001B6", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO` FROM `TBW10_CSV_WORK` WHERE ( `TBW10_SESSION_ID` > ? or `TBW10_SESSION_ID` = ? and `TBW10_DATETIME` > ? or `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_STUDY_ID` > ? or `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_SUBJECT_ID` > ? or `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_CRF_ID` > ? or `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_CRF_ITEM_GRP_CD` > ? or `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_VISIT_NO` > ? or `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_CD` > ? or `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_VAR_NM` > ? or `TBW10_DOM_VAR_NM` = ? and `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_ITM_GRP_OID` > ? or `TBW10_DOM_ITM_GRP_OID` = ? and `TBW10_DOM_VAR_NM` = ? and `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_ITM_GRP_ROWNO` > ?) ORDER BY `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001B7", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO` FROM `TBW10_CSV_WORK` WHERE ( `TBW10_SESSION_ID` < ? or `TBW10_SESSION_ID` = ? and `TBW10_DATETIME` < ? or `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_STUDY_ID` < ? or `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_SUBJECT_ID` < ? or `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_CRF_ID` < ? or `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_CRF_ITEM_GRP_CD` < ? or `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_VISIT_NO` < ? or `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_CD` < ? or `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_VAR_NM` < ? or `TBW10_DOM_VAR_NM` = ? and `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_ITM_GRP_OID` < ? or `TBW10_DOM_ITM_GRP_OID` = ? and `TBW10_DOM_VAR_NM` = ? and `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_ITM_GRP_ROWNO` < ?) ORDER BY `TBW10_SESSION_ID` DESC, `TBW10_DATETIME` DESC, `TBW10_STUDY_ID` DESC, `TBW10_SUBJECT_ID` DESC, `TBW10_CRF_ID` DESC, `TBW10_CRF_ITEM_GRP_CD` DESC, `TBW10_VISIT_NO` DESC, `TBW10_DOM_CD` DESC, `TBW10_DOM_VAR_NM` DESC, `TBW10_DOM_ITM_GRP_OID` DESC, `TBW10_DOM_ITM_GRP_ROWNO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001B8", "INSERT INTO `TBW10_CSV_WORK` (`TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO`, `TBW10_CHAR_1`, `TBW10_VALUE`, `TBW10_CRF_ITEM_DIV`, `TBW10_LIST_CD`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001B9", "UPDATE `TBW10_CSV_WORK` SET `TBW10_CHAR_1`=?, `TBW10_VALUE`=?, `TBW10_CRF_ITEM_DIV`=?, `TBW10_LIST_CD`=?  WHERE `TBW10_SESSION_ID` = ? AND `TBW10_DATETIME` = ? AND `TBW10_STUDY_ID` = ? AND `TBW10_SUBJECT_ID` = ? AND `TBW10_CRF_ID` = ? AND `TBW10_CRF_ITEM_GRP_CD` = ? AND `TBW10_VISIT_NO` = ? AND `TBW10_DOM_CD` = ? AND `TBW10_DOM_VAR_NM` = ? AND `TBW10_DOM_ITM_GRP_OID` = ? AND `TBW10_DOM_ITM_GRP_ROWNO` = ?", GX_NOMASK)
         ,new UpdateCursor("T001B10", "DELETE FROM `TBW10_CSV_WORK`  WHERE `TBW10_SESSION_ID` = ? AND `TBW10_DATETIME` = ? AND `TBW10_STUDY_ID` = ? AND `TBW10_SUBJECT_ID` = ? AND `TBW10_CRF_ID` = ? AND `TBW10_CRF_ITEM_GRP_CD` = ? AND `TBW10_VISIT_NO` = ? AND `TBW10_DOM_CD` = ? AND `TBW10_DOM_VAR_NM` = ? AND `TBW10_DOM_ITM_GRP_OID` = ? AND `TBW10_DOM_ITM_GRP_ROWNO` = ?", GX_NOMASK)
         ,new ForEachCursor("T001B11", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO` FROM `TBW10_CSV_WORK` ORDER BY `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               ((byte[]) buf[11])[0] = rslt.getByte(12) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               ((byte[]) buf[11])[0] = rslt.getByte(12) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               ((byte[]) buf[11])[0] = rslt.getByte(12) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((String[]) buf[5])[0] = rslt.getVarchar(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((short[]) buf[10])[0] = rslt.getShort(11) ;
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
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
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
               stmt.setVarchar(21, (String)parms[20], 50, false);
               stmt.setVarchar(22, (String)parms[21], 50, false);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setLong(25, ((Number) parms[24]).longValue());
               stmt.setDateTime(26, (java.util.Date)parms[25], false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               stmt.setShort(29, ((Number) parms[28]).shortValue());
               stmt.setVarchar(30, (String)parms[29], 50, false);
               stmt.setShort(31, ((Number) parms[30]).shortValue());
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setLong(33, ((Number) parms[32]).longValue());
               stmt.setDateTime(34, (java.util.Date)parms[33], false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setVarchar(36, (String)parms[35], 2, false);
               stmt.setVarchar(37, (String)parms[36], 2, false);
               stmt.setShort(38, ((Number) parms[37]).shortValue());
               stmt.setVarchar(39, (String)parms[38], 50, false);
               stmt.setShort(40, ((Number) parms[39]).shortValue());
               stmt.setInt(41, ((Number) parms[40]).intValue());
               stmt.setLong(42, ((Number) parms[41]).longValue());
               stmt.setDateTime(43, (java.util.Date)parms[42], false);
               stmt.setVarchar(44, (String)parms[43], 50, false);
               stmt.setVarchar(45, (String)parms[44], 50, false);
               stmt.setVarchar(46, (String)parms[45], 50, false);
               stmt.setVarchar(47, (String)parms[46], 2, false);
               stmt.setShort(48, ((Number) parms[47]).shortValue());
               stmt.setVarchar(49, (String)parms[48], 50, false);
               stmt.setShort(50, ((Number) parms[49]).shortValue());
               stmt.setInt(51, ((Number) parms[50]).intValue());
               stmt.setLong(52, ((Number) parms[51]).longValue());
               stmt.setDateTime(53, (java.util.Date)parms[52], false);
               stmt.setVarchar(54, (String)parms[53], 50, false);
               stmt.setVarchar(55, (String)parms[54], 50, false);
               stmt.setVarchar(56, (String)parms[55], 50, false);
               stmt.setVarchar(57, (String)parms[56], 50, false);
               stmt.setVarchar(58, (String)parms[57], 2, false);
               stmt.setShort(59, ((Number) parms[58]).shortValue());
               stmt.setVarchar(60, (String)parms[59], 50, false);
               stmt.setShort(61, ((Number) parms[60]).shortValue());
               stmt.setInt(62, ((Number) parms[61]).intValue());
               stmt.setLong(63, ((Number) parms[62]).longValue());
               stmt.setDateTime(64, (java.util.Date)parms[63], false);
               stmt.setVarchar(65, (String)parms[64], 50, false);
               stmt.setShort(66, ((Number) parms[65]).shortValue());
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
               stmt.setVarchar(21, (String)parms[20], 50, false);
               stmt.setVarchar(22, (String)parms[21], 50, false);
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setLong(25, ((Number) parms[24]).longValue());
               stmt.setDateTime(26, (java.util.Date)parms[25], false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               stmt.setShort(29, ((Number) parms[28]).shortValue());
               stmt.setVarchar(30, (String)parms[29], 50, false);
               stmt.setShort(31, ((Number) parms[30]).shortValue());
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setLong(33, ((Number) parms[32]).longValue());
               stmt.setDateTime(34, (java.util.Date)parms[33], false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setVarchar(36, (String)parms[35], 2, false);
               stmt.setVarchar(37, (String)parms[36], 2, false);
               stmt.setShort(38, ((Number) parms[37]).shortValue());
               stmt.setVarchar(39, (String)parms[38], 50, false);
               stmt.setShort(40, ((Number) parms[39]).shortValue());
               stmt.setInt(41, ((Number) parms[40]).intValue());
               stmt.setLong(42, ((Number) parms[41]).longValue());
               stmt.setDateTime(43, (java.util.Date)parms[42], false);
               stmt.setVarchar(44, (String)parms[43], 50, false);
               stmt.setVarchar(45, (String)parms[44], 50, false);
               stmt.setVarchar(46, (String)parms[45], 50, false);
               stmt.setVarchar(47, (String)parms[46], 2, false);
               stmt.setShort(48, ((Number) parms[47]).shortValue());
               stmt.setVarchar(49, (String)parms[48], 50, false);
               stmt.setShort(50, ((Number) parms[49]).shortValue());
               stmt.setInt(51, ((Number) parms[50]).intValue());
               stmt.setLong(52, ((Number) parms[51]).longValue());
               stmt.setDateTime(53, (java.util.Date)parms[52], false);
               stmt.setVarchar(54, (String)parms[53], 50, false);
               stmt.setVarchar(55, (String)parms[54], 50, false);
               stmt.setVarchar(56, (String)parms[55], 50, false);
               stmt.setVarchar(57, (String)parms[56], 50, false);
               stmt.setVarchar(58, (String)parms[57], 2, false);
               stmt.setShort(59, ((Number) parms[58]).shortValue());
               stmt.setVarchar(60, (String)parms[59], 50, false);
               stmt.setShort(61, ((Number) parms[60]).shortValue());
               stmt.setInt(62, ((Number) parms[61]).intValue());
               stmt.setLong(63, ((Number) parms[62]).longValue());
               stmt.setDateTime(64, (java.util.Date)parms[63], false);
               stmt.setVarchar(65, (String)parms[64], 50, false);
               stmt.setShort(66, ((Number) parms[65]).shortValue());
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(12, ((Number) parms[12]).byteValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[14], 2000);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[16], 20);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[18], 20);
               }
               break;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(1, ((Number) parms[1]).byteValue());
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 2000);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 20);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 20);
               }
               stmt.setVarchar(5, (String)parms[8], 50, false);
               stmt.setDateTime(6, (java.util.Date)parms[9], false);
               stmt.setLong(7, ((Number) parms[10]).longValue());
               stmt.setInt(8, ((Number) parms[11]).intValue());
               stmt.setShort(9, ((Number) parms[12]).shortValue());
               stmt.setVarchar(10, (String)parms[13], 50, false);
               stmt.setShort(11, ((Number) parms[14]).shortValue());
               stmt.setVarchar(12, (String)parms[15], 2, false);
               stmt.setVarchar(13, (String)parms[16], 50, false);
               stmt.setVarchar(14, (String)parms[17], 50, false);
               stmt.setShort(15, ((Number) parms[18]).shortValue());
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setVarchar(6, (String)parms[5], 50, false);
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setVarchar(8, (String)parms[7], 2, false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setShort(11, ((Number) parms[10]).shortValue());
               break;
      }
   }

}

