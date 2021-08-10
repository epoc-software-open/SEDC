/*
               File: tbw10_csv_work_impl
        Description: TBW10_CSV_WORK
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:57.65
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
         Form.getMeta().addItem("description", "TBW10_CSV_WORK", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
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
         wb_table1_2_1B62( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1B62e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1B62( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1B62( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1B62( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1B62e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "TBW10_CSV_WORK", 1, 0, "px", 0, "px", "Group", "", "HLP_TBW10_CSV_WORK.htm");
         wb_table3_28_1B62( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1B62e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1B62e( true) ;
      }
      else
      {
         wb_table1_2_1B62e( false) ;
      }
   }

   public void wb_table3_28_1B62( boolean wbgen )
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
         wb_table4_34_1B62( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1B62e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 117,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW10_CSV_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW10_CSV_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1B62e( true) ;
      }
      else
      {
         wb_table3_28_1B62e( false) ;
      }
   }

   public void wb_table4_34_1B62( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_session_id_Internalname, "TBW10_SESSION_ID", "", "", lblTextblocktbw10_session_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_SESSION_ID_Internalname, GXutil.rtrim( A163TBW10_SESSION_ID), GXutil.rtrim( localUtil.format( A163TBW10_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_SESSION_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_SESSION_ID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SESSION_ID", "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_datetime_Internalname, "TBW10_DATETIME", "", "", lblTextblocktbw10_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBW10_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_DATETIME_Internalname, localUtil.format(A164TBW10_DATETIME, "99/99/99 99:99"), localUtil.format( A164TBW10_DATETIME, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'YMD',5,24,'jap',false,0);"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_DATETIME_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW10_CSV_WORK.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW10_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBW10_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_study_id_Internalname, "TBW10_STUDY_ID", "", "", lblTextblocktbw10_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A165TBW10_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW10_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A165TBW10_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A165TBW10_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_subject_id_Internalname, "TBW10_SUBJECT_ID", "", "", lblTextblocktbw10_subject_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A166TBW10_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW10_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A166TBW10_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A166TBW10_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_SUBJECT_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_SUBJECT_ID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_crf_id_Internalname, "TBW10_CRF_ID", "", "", lblTextblocktbw10_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A167TBW10_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW10_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A167TBW10_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A167TBW10_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_crf_eda_no_Internalname, "TBW10_CRF_EDA_NO", "", "", lblTextblocktbw10_crf_eda_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_CRF_EDA_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A957TBW10_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")), ((edtTBW10_CRF_EDA_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A957TBW10_CRF_EDA_NO), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A957TBW10_CRF_EDA_NO), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_CRF_EDA_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_CRF_EDA_NO_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_EDA_NO", "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_crf_item_grp_cd_Internalname, "TBW10_CRF_ITEM_GRP_CD", "", "", lblTextblocktbw10_crf_item_grp_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_CRF_ITEM_GRP_CD_Internalname, GXutil.rtrim( A168TBW10_CRF_ITEM_GRP_CD), GXutil.rtrim( localUtil.format( A168TBW10_CRF_ITEM_GRP_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_CRF_ITEM_GRP_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_CRF_ITEM_GRP_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_CD", "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_visit_no_Internalname, "TBW10_VISIT_NO", "", "", lblTextblocktbw10_visit_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_VISIT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A169TBW10_VISIT_NO, (byte)(6), (byte)(0), ".", "")), ((edtTBW10_VISIT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A169TBW10_VISIT_NO), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A169TBW10_VISIT_NO), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_VISIT_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_VISIT_NO_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_VISIT_NO", "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_dom_cd_Internalname, "TBW10_DOM_CD", "", "", lblTextblocktbw10_dom_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_DOM_CD_Internalname, GXutil.rtrim( A170TBW10_DOM_CD), GXutil.rtrim( localUtil.format( A170TBW10_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_DOM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_DOM_CD_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_CD", "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_dom_var_nm_Internalname, "TBW10_DOM_VAR_NM", "", "", lblTextblocktbw10_dom_var_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_DOM_VAR_NM_Internalname, GXutil.rtrim( A171TBW10_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A171TBW10_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_DOM_VAR_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_DOM_VAR_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_VAR_NM", "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_dom_itm_grp_oid_Internalname, "TBW10_DOM_ITM_GRP_OID", "", "", lblTextblocktbw10_dom_itm_grp_oid_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_DOM_ITM_GRP_OID_Internalname, GXutil.rtrim( A172TBW10_DOM_ITM_GRP_OID), GXutil.rtrim( localUtil.format( A172TBW10_DOM_ITM_GRP_OID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_DOM_ITM_GRP_OID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_DOM_ITM_GRP_OID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_dom_itm_grp_rowno_Internalname, "TBW10_DOM_ITM_GRP_ROWNO", "", "", lblTextblocktbw10_dom_itm_grp_rowno_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_DOM_ITM_GRP_ROWNO_Internalname, GXutil.ltrim( localUtil.ntoc( A173TBW10_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")), ((edtTBW10_DOM_ITM_GRP_ROWNO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A173TBW10_DOM_ITM_GRP_ROWNO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A173TBW10_DOM_ITM_GRP_ROWNO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_DOM_ITM_GRP_ROWNO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_DOM_ITM_GRP_ROWNO_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_char_1_Internalname, "TBW10_CHAR_1", "", "", lblTextblocktbw10_char_1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_CHAR_1_Internalname, GXutil.ltrim( localUtil.ntoc( A770TBW10_CHAR_1, (byte)(1), (byte)(0), ".", "")), ((edtTBW10_CHAR_1_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A770TBW10_CHAR_1), "9")) : localUtil.format( DecimalUtil.doubleToDec(A770TBW10_CHAR_1), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_CHAR_1_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_CHAR_1_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_value_Internalname, "TBW10_VALUE", "", "", lblTextblocktbw10_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBW10_VALUE_Internalname, GXutil.rtrim( A771TBW10_VALUE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(104);\"", (short)(0), 1, edtTBW10_VALUE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, "", "", (byte)(-1), true, "", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_crf_item_div_Internalname, "TBW10_CRF_ITEM_DIV", "", "", lblTextblocktbw10_crf_item_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_CRF_ITEM_DIV_Internalname, GXutil.rtrim( A772TBW10_CRF_ITEM_DIV), GXutil.rtrim( localUtil.format( A772TBW10_CRF_ITEM_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_CRF_ITEM_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_CRF_ITEM_DIV_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw10_list_cd_Internalname, "TBW10_LIST_CD", "", "", lblTextblocktbw10_list_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW10_LIST_CD_Internalname, GXutil.rtrim( A773TBW10_LIST_CD), GXutil.rtrim( localUtil.format( A773TBW10_LIST_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW10_LIST_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW10_LIST_CD_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW10_CSV_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1B62e( true) ;
      }
      else
      {
         wb_table4_34_1B62e( false) ;
      }
   }

   public void wb_table2_5_1B62( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW10_CSV_WORK.htm");
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
         wb_table2_5_1B62e( true) ;
      }
      else
      {
         wb_table2_5_1B62e( false) ;
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
            A163TBW10_SESSION_ID = httpContext.cgiGet( edtTBW10_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A163TBW10_SESSION_ID", A163TBW10_SESSION_ID);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW10_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBW10_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A164TBW10_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A164TBW10_DATETIME", localUtil.ttoc( A164TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            else
            {
               A164TBW10_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW10_DATETIME_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A164TBW10_DATETIME", localUtil.ttoc( A164TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A165TBW10_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A165TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A165TBW10_STUDY_ID, 10, 0)));
            }
            else
            {
               A165TBW10_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW10_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A165TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A165TBW10_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A166TBW10_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A166TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A166TBW10_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A166TBW10_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW10_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A166TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A166TBW10_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A167TBW10_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A167TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A167TBW10_CRF_ID, 4, 0)));
            }
            else
            {
               A167TBW10_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW10_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A167TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A167TBW10_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_CRF_EDA_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_CRF_EDA_NO_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_CRF_EDA_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_CRF_EDA_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A957TBW10_CRF_EDA_NO = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A957TBW10_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A957TBW10_CRF_EDA_NO, 2, 0)));
            }
            else
            {
               A957TBW10_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBW10_CRF_EDA_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A957TBW10_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A957TBW10_CRF_EDA_NO, 2, 0)));
            }
            A168TBW10_CRF_ITEM_GRP_CD = httpContext.cgiGet( edtTBW10_CRF_ITEM_GRP_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A168TBW10_CRF_ITEM_GRP_CD", A168TBW10_CRF_ITEM_GRP_CD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_VISIT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_VISIT_NO_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_VISIT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_VISIT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A169TBW10_VISIT_NO = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A169TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A169TBW10_VISIT_NO, 6, 0)));
            }
            else
            {
               A169TBW10_VISIT_NO = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW10_VISIT_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A169TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A169TBW10_VISIT_NO, 6, 0)));
            }
            A170TBW10_DOM_CD = httpContext.cgiGet( edtTBW10_DOM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A170TBW10_DOM_CD", A170TBW10_DOM_CD);
            A171TBW10_DOM_VAR_NM = httpContext.cgiGet( edtTBW10_DOM_VAR_NM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A171TBW10_DOM_VAR_NM", A171TBW10_DOM_VAR_NM);
            A172TBW10_DOM_ITM_GRP_OID = httpContext.cgiGet( edtTBW10_DOM_ITM_GRP_OID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A172TBW10_DOM_ITM_GRP_OID", A172TBW10_DOM_ITM_GRP_OID);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_DOM_ITM_GRP_ROWNO_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_DOM_ITM_GRP_ROWNO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_DOM_ITM_GRP_ROWNO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A173TBW10_DOM_ITM_GRP_ROWNO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A173TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            else
            {
               A173TBW10_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW10_DOM_ITM_GRP_ROWNO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A173TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_CHAR_1_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW10_CHAR_1_Internalname), ".", ",") > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW10_CHAR_1");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW10_CHAR_1_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A770TBW10_CHAR_1 = (byte)(0) ;
               n770TBW10_CHAR_1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A770TBW10_CHAR_1", GXutil.str( A770TBW10_CHAR_1, 1, 0));
            }
            else
            {
               A770TBW10_CHAR_1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBW10_CHAR_1_Internalname), ".", ",")) ;
               n770TBW10_CHAR_1 = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A770TBW10_CHAR_1", GXutil.str( A770TBW10_CHAR_1, 1, 0));
            }
            n770TBW10_CHAR_1 = ((0==A770TBW10_CHAR_1) ? true : false) ;
            A771TBW10_VALUE = httpContext.cgiGet( edtTBW10_VALUE_Internalname) ;
            n771TBW10_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A771TBW10_VALUE", A771TBW10_VALUE);
            n771TBW10_VALUE = ((GXutil.strcmp("", A771TBW10_VALUE)==0) ? true : false) ;
            A772TBW10_CRF_ITEM_DIV = httpContext.cgiGet( edtTBW10_CRF_ITEM_DIV_Internalname) ;
            n772TBW10_CRF_ITEM_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A772TBW10_CRF_ITEM_DIV", A772TBW10_CRF_ITEM_DIV);
            n772TBW10_CRF_ITEM_DIV = ((GXutil.strcmp("", A772TBW10_CRF_ITEM_DIV)==0) ? true : false) ;
            A773TBW10_LIST_CD = httpContext.cgiGet( edtTBW10_LIST_CD_Internalname) ;
            n773TBW10_LIST_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A773TBW10_LIST_CD", A773TBW10_LIST_CD);
            n773TBW10_LIST_CD = ((GXutil.strcmp("", A773TBW10_LIST_CD)==0) ? true : false) ;
            /* Read saved values. */
            Z163TBW10_SESSION_ID = httpContext.cgiGet( "Z163TBW10_SESSION_ID") ;
            Z164TBW10_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z164TBW10_DATETIME"), 0) ;
            Z165TBW10_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z165TBW10_STUDY_ID"), ".", ",") ;
            Z166TBW10_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z166TBW10_SUBJECT_ID"), ".", ",")) ;
            Z167TBW10_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z167TBW10_CRF_ID"), ".", ",")) ;
            Z957TBW10_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z957TBW10_CRF_EDA_NO"), ".", ",")) ;
            Z168TBW10_CRF_ITEM_GRP_CD = httpContext.cgiGet( "Z168TBW10_CRF_ITEM_GRP_CD") ;
            Z169TBW10_VISIT_NO = (int)(localUtil.ctol( httpContext.cgiGet( "Z169TBW10_VISIT_NO"), ".", ",")) ;
            Z170TBW10_DOM_CD = httpContext.cgiGet( "Z170TBW10_DOM_CD") ;
            Z171TBW10_DOM_VAR_NM = httpContext.cgiGet( "Z171TBW10_DOM_VAR_NM") ;
            Z172TBW10_DOM_ITM_GRP_OID = httpContext.cgiGet( "Z172TBW10_DOM_ITM_GRP_OID") ;
            Z173TBW10_DOM_ITM_GRP_ROWNO = (short)(localUtil.ctol( httpContext.cgiGet( "Z173TBW10_DOM_ITM_GRP_ROWNO"), ".", ",")) ;
            Z770TBW10_CHAR_1 = (byte)(localUtil.ctol( httpContext.cgiGet( "Z770TBW10_CHAR_1"), ".", ",")) ;
            n770TBW10_CHAR_1 = ((0==A770TBW10_CHAR_1) ? true : false) ;
            Z771TBW10_VALUE = httpContext.cgiGet( "Z771TBW10_VALUE") ;
            n771TBW10_VALUE = ((GXutil.strcmp("", A771TBW10_VALUE)==0) ? true : false) ;
            Z772TBW10_CRF_ITEM_DIV = httpContext.cgiGet( "Z772TBW10_CRF_ITEM_DIV") ;
            n772TBW10_CRF_ITEM_DIV = ((GXutil.strcmp("", A772TBW10_CRF_ITEM_DIV)==0) ? true : false) ;
            Z773TBW10_LIST_CD = httpContext.cgiGet( "Z773TBW10_LIST_CD") ;
            n773TBW10_LIST_CD = ((GXutil.strcmp("", A773TBW10_LIST_CD)==0) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV8Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A163TBW10_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A163TBW10_SESSION_ID", A163TBW10_SESSION_ID);
               A164TBW10_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A164TBW10_DATETIME", localUtil.ttoc( A164TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
               A165TBW10_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A165TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A165TBW10_STUDY_ID, 10, 0)));
               A166TBW10_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A166TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A166TBW10_SUBJECT_ID, 6, 0)));
               A167TBW10_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A167TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A167TBW10_CRF_ID, 4, 0)));
               A957TBW10_CRF_EDA_NO = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A957TBW10_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A957TBW10_CRF_EDA_NO, 2, 0)));
               A168TBW10_CRF_ITEM_GRP_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A168TBW10_CRF_ITEM_GRP_CD", A168TBW10_CRF_ITEM_GRP_CD);
               A169TBW10_VISIT_NO = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A169TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A169TBW10_VISIT_NO, 6, 0)));
               A170TBW10_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A170TBW10_DOM_CD", A170TBW10_DOM_CD);
               A171TBW10_DOM_VAR_NM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A171TBW10_DOM_VAR_NM", A171TBW10_DOM_VAR_NM);
               A172TBW10_DOM_ITM_GRP_OID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A172TBW10_DOM_ITM_GRP_OID", A172TBW10_DOM_ITM_GRP_OID);
               A173TBW10_DOM_ITM_GRP_ROWNO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A173TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
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
            initAll1B62( ) ;
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
      disableAttributes1B62( ) ;
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
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm1B62( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z770TBW10_CHAR_1 = T001B3_A770TBW10_CHAR_1[0] ;
            Z771TBW10_VALUE = T001B3_A771TBW10_VALUE[0] ;
            Z772TBW10_CRF_ITEM_DIV = T001B3_A772TBW10_CRF_ITEM_DIV[0] ;
            Z773TBW10_LIST_CD = T001B3_A773TBW10_LIST_CD[0] ;
         }
         else
         {
            Z770TBW10_CHAR_1 = A770TBW10_CHAR_1 ;
            Z771TBW10_VALUE = A771TBW10_VALUE ;
            Z772TBW10_CRF_ITEM_DIV = A772TBW10_CRF_ITEM_DIV ;
            Z773TBW10_LIST_CD = A773TBW10_LIST_CD ;
         }
      }
      if ( GX_JID == -2 )
      {
         Z163TBW10_SESSION_ID = A163TBW10_SESSION_ID ;
         Z164TBW10_DATETIME = A164TBW10_DATETIME ;
         Z165TBW10_STUDY_ID = A165TBW10_STUDY_ID ;
         Z166TBW10_SUBJECT_ID = A166TBW10_SUBJECT_ID ;
         Z167TBW10_CRF_ID = A167TBW10_CRF_ID ;
         Z957TBW10_CRF_EDA_NO = A957TBW10_CRF_EDA_NO ;
         Z168TBW10_CRF_ITEM_GRP_CD = A168TBW10_CRF_ITEM_GRP_CD ;
         Z169TBW10_VISIT_NO = A169TBW10_VISIT_NO ;
         Z170TBW10_DOM_CD = A170TBW10_DOM_CD ;
         Z171TBW10_DOM_VAR_NM = A171TBW10_DOM_VAR_NM ;
         Z172TBW10_DOM_ITM_GRP_OID = A172TBW10_DOM_ITM_GRP_OID ;
         Z173TBW10_DOM_ITM_GRP_ROWNO = A173TBW10_DOM_ITM_GRP_ROWNO ;
         Z770TBW10_CHAR_1 = A770TBW10_CHAR_1 ;
         Z771TBW10_VALUE = A771TBW10_VALUE ;
         Z772TBW10_CRF_ITEM_DIV = A772TBW10_CRF_ITEM_DIV ;
         Z773TBW10_LIST_CD = A773TBW10_LIST_CD ;
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

   public void load1B62( )
   {
      /* Using cursor T001B4 */
      pr_default.execute(2, new Object[] {A163TBW10_SESSION_ID, A164TBW10_DATETIME, new Long(A165TBW10_STUDY_ID), new Integer(A166TBW10_SUBJECT_ID), new Short(A167TBW10_CRF_ID), new Byte(A957TBW10_CRF_EDA_NO), A168TBW10_CRF_ITEM_GRP_CD, new Integer(A169TBW10_VISIT_NO), A170TBW10_DOM_CD, A171TBW10_DOM_VAR_NM, A172TBW10_DOM_ITM_GRP_OID, new Short(A173TBW10_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound62 = (short)(1) ;
         A770TBW10_CHAR_1 = T001B4_A770TBW10_CHAR_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A770TBW10_CHAR_1", GXutil.str( A770TBW10_CHAR_1, 1, 0));
         n770TBW10_CHAR_1 = T001B4_n770TBW10_CHAR_1[0] ;
         A771TBW10_VALUE = T001B4_A771TBW10_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771TBW10_VALUE", A771TBW10_VALUE);
         n771TBW10_VALUE = T001B4_n771TBW10_VALUE[0] ;
         A772TBW10_CRF_ITEM_DIV = T001B4_A772TBW10_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772TBW10_CRF_ITEM_DIV", A772TBW10_CRF_ITEM_DIV);
         n772TBW10_CRF_ITEM_DIV = T001B4_n772TBW10_CRF_ITEM_DIV[0] ;
         A773TBW10_LIST_CD = T001B4_A773TBW10_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A773TBW10_LIST_CD", A773TBW10_LIST_CD);
         n773TBW10_LIST_CD = T001B4_n773TBW10_LIST_CD[0] ;
         zm1B62( -2) ;
      }
      pr_default.close(2);
      onLoadActions1B62( ) ;
   }

   public void onLoadActions1B62( )
   {
      AV8Pgmname = "TBW10_CSV_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable1B62( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TBW10_CSV_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      if ( ! ( GXutil.nullDate().equals(A164TBW10_DATETIME) || (( A164TBW10_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A164TBW10_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　TBW10_DATETIME は範囲外です", "OutOfRange", 1, "TBW10_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW10_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1B62( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1B62( )
   {
      /* Using cursor T001B5 */
      pr_default.execute(3, new Object[] {A163TBW10_SESSION_ID, A164TBW10_DATETIME, new Long(A165TBW10_STUDY_ID), new Integer(A166TBW10_SUBJECT_ID), new Short(A167TBW10_CRF_ID), new Byte(A957TBW10_CRF_EDA_NO), A168TBW10_CRF_ITEM_GRP_CD, new Integer(A169TBW10_VISIT_NO), A170TBW10_DOM_CD, A171TBW10_DOM_VAR_NM, A172TBW10_DOM_ITM_GRP_OID, new Short(A173TBW10_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound62 = (short)(1) ;
      }
      else
      {
         RcdFound62 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001B3 */
      pr_default.execute(1, new Object[] {A163TBW10_SESSION_ID, A164TBW10_DATETIME, new Long(A165TBW10_STUDY_ID), new Integer(A166TBW10_SUBJECT_ID), new Short(A167TBW10_CRF_ID), new Byte(A957TBW10_CRF_EDA_NO), A168TBW10_CRF_ITEM_GRP_CD, new Integer(A169TBW10_VISIT_NO), A170TBW10_DOM_CD, A171TBW10_DOM_VAR_NM, A172TBW10_DOM_ITM_GRP_OID, new Short(A173TBW10_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1B62( 2) ;
         RcdFound62 = (short)(1) ;
         A163TBW10_SESSION_ID = T001B3_A163TBW10_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163TBW10_SESSION_ID", A163TBW10_SESSION_ID);
         A164TBW10_DATETIME = T001B3_A164TBW10_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164TBW10_DATETIME", localUtil.ttoc( A164TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A165TBW10_STUDY_ID = T001B3_A165TBW10_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A165TBW10_STUDY_ID, 10, 0)));
         A166TBW10_SUBJECT_ID = T001B3_A166TBW10_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A166TBW10_SUBJECT_ID, 6, 0)));
         A167TBW10_CRF_ID = T001B3_A167TBW10_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A167TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A167TBW10_CRF_ID, 4, 0)));
         A957TBW10_CRF_EDA_NO = T001B3_A957TBW10_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A957TBW10_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A957TBW10_CRF_EDA_NO, 2, 0)));
         A168TBW10_CRF_ITEM_GRP_CD = T001B3_A168TBW10_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A168TBW10_CRF_ITEM_GRP_CD", A168TBW10_CRF_ITEM_GRP_CD);
         A169TBW10_VISIT_NO = T001B3_A169TBW10_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A169TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A169TBW10_VISIT_NO, 6, 0)));
         A170TBW10_DOM_CD = T001B3_A170TBW10_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170TBW10_DOM_CD", A170TBW10_DOM_CD);
         A171TBW10_DOM_VAR_NM = T001B3_A171TBW10_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A171TBW10_DOM_VAR_NM", A171TBW10_DOM_VAR_NM);
         A172TBW10_DOM_ITM_GRP_OID = T001B3_A172TBW10_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A172TBW10_DOM_ITM_GRP_OID", A172TBW10_DOM_ITM_GRP_OID);
         A173TBW10_DOM_ITM_GRP_ROWNO = T001B3_A173TBW10_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A173TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
         A770TBW10_CHAR_1 = T001B3_A770TBW10_CHAR_1[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A770TBW10_CHAR_1", GXutil.str( A770TBW10_CHAR_1, 1, 0));
         n770TBW10_CHAR_1 = T001B3_n770TBW10_CHAR_1[0] ;
         A771TBW10_VALUE = T001B3_A771TBW10_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A771TBW10_VALUE", A771TBW10_VALUE);
         n771TBW10_VALUE = T001B3_n771TBW10_VALUE[0] ;
         A772TBW10_CRF_ITEM_DIV = T001B3_A772TBW10_CRF_ITEM_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A772TBW10_CRF_ITEM_DIV", A772TBW10_CRF_ITEM_DIV);
         n772TBW10_CRF_ITEM_DIV = T001B3_n772TBW10_CRF_ITEM_DIV[0] ;
         A773TBW10_LIST_CD = T001B3_A773TBW10_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A773TBW10_LIST_CD", A773TBW10_LIST_CD);
         n773TBW10_LIST_CD = T001B3_n773TBW10_LIST_CD[0] ;
         Z163TBW10_SESSION_ID = A163TBW10_SESSION_ID ;
         Z164TBW10_DATETIME = A164TBW10_DATETIME ;
         Z165TBW10_STUDY_ID = A165TBW10_STUDY_ID ;
         Z166TBW10_SUBJECT_ID = A166TBW10_SUBJECT_ID ;
         Z167TBW10_CRF_ID = A167TBW10_CRF_ID ;
         Z957TBW10_CRF_EDA_NO = A957TBW10_CRF_EDA_NO ;
         Z168TBW10_CRF_ITEM_GRP_CD = A168TBW10_CRF_ITEM_GRP_CD ;
         Z169TBW10_VISIT_NO = A169TBW10_VISIT_NO ;
         Z170TBW10_DOM_CD = A170TBW10_DOM_CD ;
         Z171TBW10_DOM_VAR_NM = A171TBW10_DOM_VAR_NM ;
         Z172TBW10_DOM_ITM_GRP_OID = A172TBW10_DOM_ITM_GRP_OID ;
         Z173TBW10_DOM_ITM_GRP_ROWNO = A173TBW10_DOM_ITM_GRP_ROWNO ;
         sMode62 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1B62( ) ;
         if ( AnyError == 1 )
         {
            RcdFound62 = (short)(0) ;
            initializeNonKey1B62( ) ;
         }
         Gx_mode = sMode62 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound62 = (short)(0) ;
         initializeNonKey1B62( ) ;
         sMode62 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode62 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1B62( ) ;
      if ( RcdFound62 == 0 )
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
      RcdFound62 = (short)(0) ;
      /* Using cursor T001B6 */
      pr_default.execute(4, new Object[] {A163TBW10_SESSION_ID, A163TBW10_SESSION_ID, A164TBW10_DATETIME, A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Long(A165TBW10_STUDY_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Integer(A166TBW10_SUBJECT_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Short(A167TBW10_CRF_ID), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Byte(A957TBW10_CRF_EDA_NO), new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, A168TBW10_CRF_ITEM_GRP_CD, A168TBW10_CRF_ITEM_GRP_CD, new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Integer(A169TBW10_VISIT_NO), new Integer(A169TBW10_VISIT_NO), A168TBW10_CRF_ITEM_GRP_CD, new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, A170TBW10_DOM_CD, A170TBW10_DOM_CD, new Integer(A169TBW10_VISIT_NO), A168TBW10_CRF_ITEM_GRP_CD, new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, A171TBW10_DOM_VAR_NM, A171TBW10_DOM_VAR_NM, A170TBW10_DOM_CD, new Integer(A169TBW10_VISIT_NO), A168TBW10_CRF_ITEM_GRP_CD, new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, A172TBW10_DOM_ITM_GRP_OID, A172TBW10_DOM_ITM_GRP_OID, A171TBW10_DOM_VAR_NM, A170TBW10_DOM_CD, new Integer(A169TBW10_VISIT_NO), A168TBW10_CRF_ITEM_GRP_CD, new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Short(A173TBW10_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && T001B6_A164TBW10_DATETIME[0].before( A164TBW10_DATETIME ) || T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A165TBW10_STUDY_ID[0] < A165TBW10_STUDY_ID ) || ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A166TBW10_SUBJECT_ID[0] < A166TBW10_SUBJECT_ID ) || ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A167TBW10_CRF_ID[0] < A167TBW10_CRF_ID ) || ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] < A957TBW10_CRF_EDA_NO ) || ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) < 0 ) || ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A169TBW10_VISIT_NO[0] < A169TBW10_VISIT_NO ) || ( T001B6_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) < 0 ) || ( GXutil.strcmp(T001B6_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B6_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) < 0 ) || ( GXutil.strcmp(T001B6_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B6_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B6_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A172TBW10_DOM_ITM_GRP_OID[0], A172TBW10_DOM_ITM_GRP_OID) < 0 ) || ( GXutil.strcmp(T001B6_A172TBW10_DOM_ITM_GRP_OID[0], A172TBW10_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001B6_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B6_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B6_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A173TBW10_DOM_ITM_GRP_ROWNO[0] < A173TBW10_DOM_ITM_GRP_ROWNO ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && T001B6_A164TBW10_DATETIME[0].after( A164TBW10_DATETIME ) || T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A165TBW10_STUDY_ID[0] > A165TBW10_STUDY_ID ) || ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A166TBW10_SUBJECT_ID[0] > A166TBW10_SUBJECT_ID ) || ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A167TBW10_CRF_ID[0] > A167TBW10_CRF_ID ) || ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] > A957TBW10_CRF_EDA_NO ) || ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) > 0 ) || ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A169TBW10_VISIT_NO[0] > A169TBW10_VISIT_NO ) || ( T001B6_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) > 0 ) || ( GXutil.strcmp(T001B6_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B6_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) > 0 ) || ( GXutil.strcmp(T001B6_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B6_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B6_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B6_A172TBW10_DOM_ITM_GRP_OID[0], A172TBW10_DOM_ITM_GRP_OID) > 0 ) || ( GXutil.strcmp(T001B6_A172TBW10_DOM_ITM_GRP_OID[0], A172TBW10_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001B6_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B6_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B6_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B6_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B6_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B6_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B6_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B6_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B6_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B6_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B6_A173TBW10_DOM_ITM_GRP_ROWNO[0] > A173TBW10_DOM_ITM_GRP_ROWNO ) ) )
         {
            A163TBW10_SESSION_ID = T001B6_A163TBW10_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A163TBW10_SESSION_ID", A163TBW10_SESSION_ID);
            A164TBW10_DATETIME = T001B6_A164TBW10_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A164TBW10_DATETIME", localUtil.ttoc( A164TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A165TBW10_STUDY_ID = T001B6_A165TBW10_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A165TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A165TBW10_STUDY_ID, 10, 0)));
            A166TBW10_SUBJECT_ID = T001B6_A166TBW10_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A166TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A166TBW10_SUBJECT_ID, 6, 0)));
            A167TBW10_CRF_ID = T001B6_A167TBW10_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A167TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A167TBW10_CRF_ID, 4, 0)));
            A957TBW10_CRF_EDA_NO = T001B6_A957TBW10_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A957TBW10_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A957TBW10_CRF_EDA_NO, 2, 0)));
            A168TBW10_CRF_ITEM_GRP_CD = T001B6_A168TBW10_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A168TBW10_CRF_ITEM_GRP_CD", A168TBW10_CRF_ITEM_GRP_CD);
            A169TBW10_VISIT_NO = T001B6_A169TBW10_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A169TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A169TBW10_VISIT_NO, 6, 0)));
            A170TBW10_DOM_CD = T001B6_A170TBW10_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A170TBW10_DOM_CD", A170TBW10_DOM_CD);
            A171TBW10_DOM_VAR_NM = T001B6_A171TBW10_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A171TBW10_DOM_VAR_NM", A171TBW10_DOM_VAR_NM);
            A172TBW10_DOM_ITM_GRP_OID = T001B6_A172TBW10_DOM_ITM_GRP_OID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A172TBW10_DOM_ITM_GRP_OID", A172TBW10_DOM_ITM_GRP_OID);
            A173TBW10_DOM_ITM_GRP_ROWNO = T001B6_A173TBW10_DOM_ITM_GRP_ROWNO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A173TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
            RcdFound62 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound62 = (short)(0) ;
      /* Using cursor T001B7 */
      pr_default.execute(5, new Object[] {A163TBW10_SESSION_ID, A163TBW10_SESSION_ID, A164TBW10_DATETIME, A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Long(A165TBW10_STUDY_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Integer(A166TBW10_SUBJECT_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Short(A167TBW10_CRF_ID), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Byte(A957TBW10_CRF_EDA_NO), new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, A168TBW10_CRF_ITEM_GRP_CD, A168TBW10_CRF_ITEM_GRP_CD, new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Integer(A169TBW10_VISIT_NO), new Integer(A169TBW10_VISIT_NO), A168TBW10_CRF_ITEM_GRP_CD, new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, A170TBW10_DOM_CD, A170TBW10_DOM_CD, new Integer(A169TBW10_VISIT_NO), A168TBW10_CRF_ITEM_GRP_CD, new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, A171TBW10_DOM_VAR_NM, A171TBW10_DOM_VAR_NM, A170TBW10_DOM_CD, new Integer(A169TBW10_VISIT_NO), A168TBW10_CRF_ITEM_GRP_CD, new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, A172TBW10_DOM_ITM_GRP_OID, A172TBW10_DOM_ITM_GRP_OID, A171TBW10_DOM_VAR_NM, A170TBW10_DOM_CD, new Integer(A169TBW10_VISIT_NO), A168TBW10_CRF_ITEM_GRP_CD, new Byte(A957TBW10_CRF_EDA_NO), new Short(A167TBW10_CRF_ID), new Integer(A166TBW10_SUBJECT_ID), new Long(A165TBW10_STUDY_ID), A164TBW10_DATETIME, A163TBW10_SESSION_ID, new Short(A173TBW10_DOM_ITM_GRP_ROWNO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && T001B7_A164TBW10_DATETIME[0].after( A164TBW10_DATETIME ) || T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A165TBW10_STUDY_ID[0] > A165TBW10_STUDY_ID ) || ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A166TBW10_SUBJECT_ID[0] > A166TBW10_SUBJECT_ID ) || ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A167TBW10_CRF_ID[0] > A167TBW10_CRF_ID ) || ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] > A957TBW10_CRF_EDA_NO ) || ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) > 0 ) || ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A169TBW10_VISIT_NO[0] > A169TBW10_VISIT_NO ) || ( T001B7_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) > 0 ) || ( GXutil.strcmp(T001B7_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B7_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) > 0 ) || ( GXutil.strcmp(T001B7_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B7_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B7_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A172TBW10_DOM_ITM_GRP_OID[0], A172TBW10_DOM_ITM_GRP_OID) > 0 ) || ( GXutil.strcmp(T001B7_A172TBW10_DOM_ITM_GRP_OID[0], A172TBW10_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001B7_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B7_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B7_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A173TBW10_DOM_ITM_GRP_ROWNO[0] > A173TBW10_DOM_ITM_GRP_ROWNO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && T001B7_A164TBW10_DATETIME[0].before( A164TBW10_DATETIME ) || T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A165TBW10_STUDY_ID[0] < A165TBW10_STUDY_ID ) || ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A166TBW10_SUBJECT_ID[0] < A166TBW10_SUBJECT_ID ) || ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A167TBW10_CRF_ID[0] < A167TBW10_CRF_ID ) || ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] < A957TBW10_CRF_EDA_NO ) || ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) < 0 ) || ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A169TBW10_VISIT_NO[0] < A169TBW10_VISIT_NO ) || ( T001B7_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) < 0 ) || ( GXutil.strcmp(T001B7_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B7_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) < 0 ) || ( GXutil.strcmp(T001B7_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B7_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B7_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001B7_A172TBW10_DOM_ITM_GRP_OID[0], A172TBW10_DOM_ITM_GRP_OID) < 0 ) || ( GXutil.strcmp(T001B7_A172TBW10_DOM_ITM_GRP_OID[0], A172TBW10_DOM_ITM_GRP_OID) == 0 ) && ( GXutil.strcmp(T001B7_A171TBW10_DOM_VAR_NM[0], A171TBW10_DOM_VAR_NM) == 0 ) && ( GXutil.strcmp(T001B7_A170TBW10_DOM_CD[0], A170TBW10_DOM_CD) == 0 ) && ( T001B7_A169TBW10_VISIT_NO[0] == A169TBW10_VISIT_NO ) && ( GXutil.strcmp(T001B7_A168TBW10_CRF_ITEM_GRP_CD[0], A168TBW10_CRF_ITEM_GRP_CD) == 0 ) && ( T001B7_A957TBW10_CRF_EDA_NO[0] == A957TBW10_CRF_EDA_NO ) && ( T001B7_A167TBW10_CRF_ID[0] == A167TBW10_CRF_ID ) && ( T001B7_A166TBW10_SUBJECT_ID[0] == A166TBW10_SUBJECT_ID ) && ( T001B7_A165TBW10_STUDY_ID[0] == A165TBW10_STUDY_ID ) && T001B7_A164TBW10_DATETIME[0].equals( A164TBW10_DATETIME ) && ( GXutil.strcmp(T001B7_A163TBW10_SESSION_ID[0], A163TBW10_SESSION_ID) == 0 ) && ( T001B7_A173TBW10_DOM_ITM_GRP_ROWNO[0] < A173TBW10_DOM_ITM_GRP_ROWNO ) ) )
         {
            A163TBW10_SESSION_ID = T001B7_A163TBW10_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A163TBW10_SESSION_ID", A163TBW10_SESSION_ID);
            A164TBW10_DATETIME = T001B7_A164TBW10_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A164TBW10_DATETIME", localUtil.ttoc( A164TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A165TBW10_STUDY_ID = T001B7_A165TBW10_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A165TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A165TBW10_STUDY_ID, 10, 0)));
            A166TBW10_SUBJECT_ID = T001B7_A166TBW10_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A166TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A166TBW10_SUBJECT_ID, 6, 0)));
            A167TBW10_CRF_ID = T001B7_A167TBW10_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A167TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A167TBW10_CRF_ID, 4, 0)));
            A957TBW10_CRF_EDA_NO = T001B7_A957TBW10_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A957TBW10_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A957TBW10_CRF_EDA_NO, 2, 0)));
            A168TBW10_CRF_ITEM_GRP_CD = T001B7_A168TBW10_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A168TBW10_CRF_ITEM_GRP_CD", A168TBW10_CRF_ITEM_GRP_CD);
            A169TBW10_VISIT_NO = T001B7_A169TBW10_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A169TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A169TBW10_VISIT_NO, 6, 0)));
            A170TBW10_DOM_CD = T001B7_A170TBW10_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A170TBW10_DOM_CD", A170TBW10_DOM_CD);
            A171TBW10_DOM_VAR_NM = T001B7_A171TBW10_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A171TBW10_DOM_VAR_NM", A171TBW10_DOM_VAR_NM);
            A172TBW10_DOM_ITM_GRP_OID = T001B7_A172TBW10_DOM_ITM_GRP_OID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A172TBW10_DOM_ITM_GRP_OID", A172TBW10_DOM_ITM_GRP_OID);
            A173TBW10_DOM_ITM_GRP_ROWNO = T001B7_A173TBW10_DOM_ITM_GRP_ROWNO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A173TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
            RcdFound62 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1B62( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1B62( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound62 == 1 )
         {
            if ( ( GXutil.strcmp(A163TBW10_SESSION_ID, Z163TBW10_SESSION_ID) != 0 ) || !( A164TBW10_DATETIME.equals( Z164TBW10_DATETIME ) ) || ( A165TBW10_STUDY_ID != Z165TBW10_STUDY_ID ) || ( A166TBW10_SUBJECT_ID != Z166TBW10_SUBJECT_ID ) || ( A167TBW10_CRF_ID != Z167TBW10_CRF_ID ) || ( A957TBW10_CRF_EDA_NO != Z957TBW10_CRF_EDA_NO ) || ( GXutil.strcmp(A168TBW10_CRF_ITEM_GRP_CD, Z168TBW10_CRF_ITEM_GRP_CD) != 0 ) || ( A169TBW10_VISIT_NO != Z169TBW10_VISIT_NO ) || ( GXutil.strcmp(A170TBW10_DOM_CD, Z170TBW10_DOM_CD) != 0 ) || ( GXutil.strcmp(A171TBW10_DOM_VAR_NM, Z171TBW10_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A172TBW10_DOM_ITM_GRP_OID, Z172TBW10_DOM_ITM_GRP_OID) != 0 ) || ( A173TBW10_DOM_ITM_GRP_ROWNO != Z173TBW10_DOM_ITM_GRP_ROWNO ) )
            {
               A163TBW10_SESSION_ID = Z163TBW10_SESSION_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A163TBW10_SESSION_ID", A163TBW10_SESSION_ID);
               A164TBW10_DATETIME = Z164TBW10_DATETIME ;
               httpContext.ajax_rsp_assign_attri("", false, "A164TBW10_DATETIME", localUtil.ttoc( A164TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
               A165TBW10_STUDY_ID = Z165TBW10_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A165TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A165TBW10_STUDY_ID, 10, 0)));
               A166TBW10_SUBJECT_ID = Z166TBW10_SUBJECT_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A166TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A166TBW10_SUBJECT_ID, 6, 0)));
               A167TBW10_CRF_ID = Z167TBW10_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A167TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A167TBW10_CRF_ID, 4, 0)));
               A957TBW10_CRF_EDA_NO = Z957TBW10_CRF_EDA_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A957TBW10_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A957TBW10_CRF_EDA_NO, 2, 0)));
               A168TBW10_CRF_ITEM_GRP_CD = Z168TBW10_CRF_ITEM_GRP_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A168TBW10_CRF_ITEM_GRP_CD", A168TBW10_CRF_ITEM_GRP_CD);
               A169TBW10_VISIT_NO = Z169TBW10_VISIT_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A169TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A169TBW10_VISIT_NO, 6, 0)));
               A170TBW10_DOM_CD = Z170TBW10_DOM_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A170TBW10_DOM_CD", A170TBW10_DOM_CD);
               A171TBW10_DOM_VAR_NM = Z171TBW10_DOM_VAR_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "A171TBW10_DOM_VAR_NM", A171TBW10_DOM_VAR_NM);
               A172TBW10_DOM_ITM_GRP_OID = Z172TBW10_DOM_ITM_GRP_OID ;
               httpContext.ajax_rsp_assign_attri("", false, "A172TBW10_DOM_ITM_GRP_OID", A172TBW10_DOM_ITM_GRP_OID);
               A173TBW10_DOM_ITM_GRP_ROWNO = Z173TBW10_DOM_ITM_GRP_ROWNO ;
               httpContext.ajax_rsp_assign_attri("", false, "A173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A173TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
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
               update1B62( ) ;
               GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A163TBW10_SESSION_ID, Z163TBW10_SESSION_ID) != 0 ) || !( A164TBW10_DATETIME.equals( Z164TBW10_DATETIME ) ) || ( A165TBW10_STUDY_ID != Z165TBW10_STUDY_ID ) || ( A166TBW10_SUBJECT_ID != Z166TBW10_SUBJECT_ID ) || ( A167TBW10_CRF_ID != Z167TBW10_CRF_ID ) || ( A957TBW10_CRF_EDA_NO != Z957TBW10_CRF_EDA_NO ) || ( GXutil.strcmp(A168TBW10_CRF_ITEM_GRP_CD, Z168TBW10_CRF_ITEM_GRP_CD) != 0 ) || ( A169TBW10_VISIT_NO != Z169TBW10_VISIT_NO ) || ( GXutil.strcmp(A170TBW10_DOM_CD, Z170TBW10_DOM_CD) != 0 ) || ( GXutil.strcmp(A171TBW10_DOM_VAR_NM, Z171TBW10_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A172TBW10_DOM_ITM_GRP_OID, Z172TBW10_DOM_ITM_GRP_OID) != 0 ) || ( A173TBW10_DOM_ITM_GRP_ROWNO != Z173TBW10_DOM_ITM_GRP_ROWNO ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1B62( ) ;
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
                  insert1B62( ) ;
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
      if ( ( GXutil.strcmp(A163TBW10_SESSION_ID, Z163TBW10_SESSION_ID) != 0 ) || !( A164TBW10_DATETIME.equals( Z164TBW10_DATETIME ) ) || ( A165TBW10_STUDY_ID != Z165TBW10_STUDY_ID ) || ( A166TBW10_SUBJECT_ID != Z166TBW10_SUBJECT_ID ) || ( A167TBW10_CRF_ID != Z167TBW10_CRF_ID ) || ( A957TBW10_CRF_EDA_NO != Z957TBW10_CRF_EDA_NO ) || ( GXutil.strcmp(A168TBW10_CRF_ITEM_GRP_CD, Z168TBW10_CRF_ITEM_GRP_CD) != 0 ) || ( A169TBW10_VISIT_NO != Z169TBW10_VISIT_NO ) || ( GXutil.strcmp(A170TBW10_DOM_CD, Z170TBW10_DOM_CD) != 0 ) || ( GXutil.strcmp(A171TBW10_DOM_VAR_NM, Z171TBW10_DOM_VAR_NM) != 0 ) || ( GXutil.strcmp(A172TBW10_DOM_ITM_GRP_OID, Z172TBW10_DOM_ITM_GRP_OID) != 0 ) || ( A173TBW10_DOM_ITM_GRP_ROWNO != Z173TBW10_DOM_ITM_GRP_ROWNO ) )
      {
         A163TBW10_SESSION_ID = Z163TBW10_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A163TBW10_SESSION_ID", A163TBW10_SESSION_ID);
         A164TBW10_DATETIME = Z164TBW10_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A164TBW10_DATETIME", localUtil.ttoc( A164TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A165TBW10_STUDY_ID = Z165TBW10_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A165TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A165TBW10_STUDY_ID, 10, 0)));
         A166TBW10_SUBJECT_ID = Z166TBW10_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A166TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A166TBW10_SUBJECT_ID, 6, 0)));
         A167TBW10_CRF_ID = Z167TBW10_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A167TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A167TBW10_CRF_ID, 4, 0)));
         A957TBW10_CRF_EDA_NO = Z957TBW10_CRF_EDA_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A957TBW10_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A957TBW10_CRF_EDA_NO, 2, 0)));
         A168TBW10_CRF_ITEM_GRP_CD = Z168TBW10_CRF_ITEM_GRP_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A168TBW10_CRF_ITEM_GRP_CD", A168TBW10_CRF_ITEM_GRP_CD);
         A169TBW10_VISIT_NO = Z169TBW10_VISIT_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A169TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A169TBW10_VISIT_NO, 6, 0)));
         A170TBW10_DOM_CD = Z170TBW10_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A170TBW10_DOM_CD", A170TBW10_DOM_CD);
         A171TBW10_DOM_VAR_NM = Z171TBW10_DOM_VAR_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "A171TBW10_DOM_VAR_NM", A171TBW10_DOM_VAR_NM);
         A172TBW10_DOM_ITM_GRP_OID = Z172TBW10_DOM_ITM_GRP_OID ;
         httpContext.ajax_rsp_assign_attri("", false, "A172TBW10_DOM_ITM_GRP_OID", A172TBW10_DOM_ITM_GRP_OID);
         A173TBW10_DOM_ITM_GRP_ROWNO = Z173TBW10_DOM_ITM_GRP_ROWNO ;
         httpContext.ajax_rsp_assign_attri("", false, "A173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A173TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
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
      if ( RcdFound62 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW10_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW10_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1B62( ) ;
      if ( RcdFound62 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW10_CHAR_1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1B62( ) ;
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
      if ( RcdFound62 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_next( ) ;
      if ( RcdFound62 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1B62( ) ;
      if ( RcdFound62 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound62 != 0 )
         {
            scanNext1B62( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW10_CHAR_1_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1B62( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1B62( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001B2 */
         pr_default.execute(0, new Object[] {A163TBW10_SESSION_ID, A164TBW10_DATETIME, new Long(A165TBW10_STUDY_ID), new Integer(A166TBW10_SUBJECT_ID), new Short(A167TBW10_CRF_ID), new Byte(A957TBW10_CRF_EDA_NO), A168TBW10_CRF_ITEM_GRP_CD, new Integer(A169TBW10_VISIT_NO), A170TBW10_DOM_CD, A171TBW10_DOM_VAR_NM, A172TBW10_DOM_ITM_GRP_OID, new Short(A173TBW10_DOM_ITM_GRP_ROWNO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW10_CSV_WORK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( Z770TBW10_CHAR_1 != T001B2_A770TBW10_CHAR_1[0] ) || ( GXutil.strcmp(Z771TBW10_VALUE, T001B2_A771TBW10_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z772TBW10_CRF_ITEM_DIV, T001B2_A772TBW10_CRF_ITEM_DIV[0]) != 0 ) || ( GXutil.strcmp(Z773TBW10_LIST_CD, T001B2_A773TBW10_LIST_CD[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW10_CSV_WORK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1B62( )
   {
      beforeValidate1B62( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1B62( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1B62( 0) ;
         checkOptimisticConcurrency1B62( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1B62( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1B62( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001B8 */
                  pr_default.execute(6, new Object[] {A163TBW10_SESSION_ID, A164TBW10_DATETIME, new Long(A165TBW10_STUDY_ID), new Integer(A166TBW10_SUBJECT_ID), new Short(A167TBW10_CRF_ID), new Byte(A957TBW10_CRF_EDA_NO), A168TBW10_CRF_ITEM_GRP_CD, new Integer(A169TBW10_VISIT_NO), A170TBW10_DOM_CD, A171TBW10_DOM_VAR_NM, A172TBW10_DOM_ITM_GRP_OID, new Short(A173TBW10_DOM_ITM_GRP_ROWNO), new Boolean(n770TBW10_CHAR_1), new Byte(A770TBW10_CHAR_1), new Boolean(n771TBW10_VALUE), A771TBW10_VALUE, new Boolean(n772TBW10_CRF_ITEM_DIV), A772TBW10_CRF_ITEM_DIV, new Boolean(n773TBW10_LIST_CD), A773TBW10_LIST_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW10_CSV_WORK") ;
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
            load1B62( ) ;
         }
         endLevel1B62( ) ;
      }
      closeExtendedTableCursors1B62( ) ;
   }

   public void update1B62( )
   {
      beforeValidate1B62( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1B62( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1B62( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1B62( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1B62( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001B9 */
                  pr_default.execute(7, new Object[] {new Boolean(n770TBW10_CHAR_1), new Byte(A770TBW10_CHAR_1), new Boolean(n771TBW10_VALUE), A771TBW10_VALUE, new Boolean(n772TBW10_CRF_ITEM_DIV), A772TBW10_CRF_ITEM_DIV, new Boolean(n773TBW10_LIST_CD), A773TBW10_LIST_CD, A163TBW10_SESSION_ID, A164TBW10_DATETIME, new Long(A165TBW10_STUDY_ID), new Integer(A166TBW10_SUBJECT_ID), new Short(A167TBW10_CRF_ID), new Byte(A957TBW10_CRF_EDA_NO), A168TBW10_CRF_ITEM_GRP_CD, new Integer(A169TBW10_VISIT_NO), A170TBW10_DOM_CD, A171TBW10_DOM_VAR_NM, A172TBW10_DOM_ITM_GRP_OID, new Short(A173TBW10_DOM_ITM_GRP_ROWNO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW10_CSV_WORK") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW10_CSV_WORK"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1B62( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
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
         endLevel1B62( ) ;
      }
      closeExtendedTableCursors1B62( ) ;
   }

   public void deferredUpdate1B62( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1B62( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1B62( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1B62( ) ;
         afterConfirm1B62( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1B62( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001B10 */
               pr_default.execute(8, new Object[] {A163TBW10_SESSION_ID, A164TBW10_DATETIME, new Long(A165TBW10_STUDY_ID), new Integer(A166TBW10_SUBJECT_ID), new Short(A167TBW10_CRF_ID), new Byte(A957TBW10_CRF_EDA_NO), A168TBW10_CRF_ITEM_GRP_CD, new Integer(A169TBW10_VISIT_NO), A170TBW10_DOM_CD, A171TBW10_DOM_VAR_NM, A172TBW10_DOM_ITM_GRP_OID, new Short(A173TBW10_DOM_ITM_GRP_ROWNO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW10_CSV_WORK") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound62 == 0 )
                     {
                        initAll1B62( ) ;
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
      sMode62 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1B62( ) ;
      Gx_mode = sMode62 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1B62( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW10_CSV_WORK" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      }
   }

   public void endLevel1B62( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1B62( ) ;
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

   public void scanStart1B62( )
   {
      /* Scan By routine */
      /* Using cursor T001B11 */
      pr_default.execute(9);
      RcdFound62 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound62 = (short)(1) ;
         A163TBW10_SESSION_ID = T001B11_A163TBW10_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163TBW10_SESSION_ID", A163TBW10_SESSION_ID);
         A164TBW10_DATETIME = T001B11_A164TBW10_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164TBW10_DATETIME", localUtil.ttoc( A164TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A165TBW10_STUDY_ID = T001B11_A165TBW10_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A165TBW10_STUDY_ID, 10, 0)));
         A166TBW10_SUBJECT_ID = T001B11_A166TBW10_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A166TBW10_SUBJECT_ID, 6, 0)));
         A167TBW10_CRF_ID = T001B11_A167TBW10_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A167TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A167TBW10_CRF_ID, 4, 0)));
         A957TBW10_CRF_EDA_NO = T001B11_A957TBW10_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A957TBW10_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A957TBW10_CRF_EDA_NO, 2, 0)));
         A168TBW10_CRF_ITEM_GRP_CD = T001B11_A168TBW10_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A168TBW10_CRF_ITEM_GRP_CD", A168TBW10_CRF_ITEM_GRP_CD);
         A169TBW10_VISIT_NO = T001B11_A169TBW10_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A169TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A169TBW10_VISIT_NO, 6, 0)));
         A170TBW10_DOM_CD = T001B11_A170TBW10_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170TBW10_DOM_CD", A170TBW10_DOM_CD);
         A171TBW10_DOM_VAR_NM = T001B11_A171TBW10_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A171TBW10_DOM_VAR_NM", A171TBW10_DOM_VAR_NM);
         A172TBW10_DOM_ITM_GRP_OID = T001B11_A172TBW10_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A172TBW10_DOM_ITM_GRP_OID", A172TBW10_DOM_ITM_GRP_OID);
         A173TBW10_DOM_ITM_GRP_ROWNO = T001B11_A173TBW10_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A173TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1B62( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound62 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound62 = (short)(1) ;
         A163TBW10_SESSION_ID = T001B11_A163TBW10_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A163TBW10_SESSION_ID", A163TBW10_SESSION_ID);
         A164TBW10_DATETIME = T001B11_A164TBW10_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A164TBW10_DATETIME", localUtil.ttoc( A164TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A165TBW10_STUDY_ID = T001B11_A165TBW10_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A165TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A165TBW10_STUDY_ID, 10, 0)));
         A166TBW10_SUBJECT_ID = T001B11_A166TBW10_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A166TBW10_SUBJECT_ID, 6, 0)));
         A167TBW10_CRF_ID = T001B11_A167TBW10_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A167TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A167TBW10_CRF_ID, 4, 0)));
         A957TBW10_CRF_EDA_NO = T001B11_A957TBW10_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A957TBW10_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A957TBW10_CRF_EDA_NO, 2, 0)));
         A168TBW10_CRF_ITEM_GRP_CD = T001B11_A168TBW10_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A168TBW10_CRF_ITEM_GRP_CD", A168TBW10_CRF_ITEM_GRP_CD);
         A169TBW10_VISIT_NO = T001B11_A169TBW10_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A169TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A169TBW10_VISIT_NO, 6, 0)));
         A170TBW10_DOM_CD = T001B11_A170TBW10_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A170TBW10_DOM_CD", A170TBW10_DOM_CD);
         A171TBW10_DOM_VAR_NM = T001B11_A171TBW10_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A171TBW10_DOM_VAR_NM", A171TBW10_DOM_VAR_NM);
         A172TBW10_DOM_ITM_GRP_OID = T001B11_A172TBW10_DOM_ITM_GRP_OID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A172TBW10_DOM_ITM_GRP_OID", A172TBW10_DOM_ITM_GRP_OID);
         A173TBW10_DOM_ITM_GRP_ROWNO = T001B11_A173TBW10_DOM_ITM_GRP_ROWNO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A173TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
      }
   }

   public void scanEnd1B62( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1B62( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1B62( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1B62( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1B62( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1B62( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1B62( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1B62( )
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
      edtTBW10_CRF_EDA_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW10_CRF_EDA_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW10_CRF_EDA_NO_Enabled, 5, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "TBW10_CSV_WORK") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513215931");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbw10_csv_work") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1B62( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z163TBW10_SESSION_ID", GXutil.rtrim( Z163TBW10_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z164TBW10_DATETIME", localUtil.ttoc( Z164TBW10_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z165TBW10_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z165TBW10_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z166TBW10_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z166TBW10_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z167TBW10_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z167TBW10_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z957TBW10_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( Z957TBW10_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z168TBW10_CRF_ITEM_GRP_CD", GXutil.rtrim( Z168TBW10_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z169TBW10_VISIT_NO", GXutil.ltrim( localUtil.ntoc( Z169TBW10_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z170TBW10_DOM_CD", GXutil.rtrim( Z170TBW10_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z171TBW10_DOM_VAR_NM", GXutil.rtrim( Z171TBW10_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z172TBW10_DOM_ITM_GRP_OID", GXutil.rtrim( Z172TBW10_DOM_ITM_GRP_OID));
      GxWebStd.gx_hidden_field( httpContext, "Z173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( localUtil.ntoc( Z173TBW10_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z770TBW10_CHAR_1", GXutil.ltrim( localUtil.ntoc( Z770TBW10_CHAR_1, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z771TBW10_VALUE", GXutil.rtrim( Z771TBW10_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z772TBW10_CRF_ITEM_DIV", GXutil.rtrim( Z772TBW10_CRF_ITEM_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z773TBW10_LIST_CD", GXutil.rtrim( Z773TBW10_LIST_CD));
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

   public String getPgmname( )
   {
      return "TBW10_CSV_WORK" ;
   }

   public String getPgmdesc( )
   {
      return "TBW10_CSV_WORK" ;
   }

   public void initializeNonKey1B62( )
   {
      A770TBW10_CHAR_1 = (byte)(0) ;
      n770TBW10_CHAR_1 = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A770TBW10_CHAR_1", GXutil.str( A770TBW10_CHAR_1, 1, 0));
      n770TBW10_CHAR_1 = ((0==A770TBW10_CHAR_1) ? true : false) ;
      A771TBW10_VALUE = "" ;
      n771TBW10_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A771TBW10_VALUE", A771TBW10_VALUE);
      n771TBW10_VALUE = ((GXutil.strcmp("", A771TBW10_VALUE)==0) ? true : false) ;
      A772TBW10_CRF_ITEM_DIV = "" ;
      n772TBW10_CRF_ITEM_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A772TBW10_CRF_ITEM_DIV", A772TBW10_CRF_ITEM_DIV);
      n772TBW10_CRF_ITEM_DIV = ((GXutil.strcmp("", A772TBW10_CRF_ITEM_DIV)==0) ? true : false) ;
      A773TBW10_LIST_CD = "" ;
      n773TBW10_LIST_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A773TBW10_LIST_CD", A773TBW10_LIST_CD);
      n773TBW10_LIST_CD = ((GXutil.strcmp("", A773TBW10_LIST_CD)==0) ? true : false) ;
   }

   public void initAll1B62( )
   {
      A163TBW10_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A163TBW10_SESSION_ID", A163TBW10_SESSION_ID);
      A164TBW10_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A164TBW10_DATETIME", localUtil.ttoc( A164TBW10_DATETIME, 8, 5, 0, 1, "/", ":", " "));
      A165TBW10_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A165TBW10_STUDY_ID", GXutil.ltrim( GXutil.str( A165TBW10_STUDY_ID, 10, 0)));
      A166TBW10_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A166TBW10_SUBJECT_ID", GXutil.ltrim( GXutil.str( A166TBW10_SUBJECT_ID, 6, 0)));
      A167TBW10_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A167TBW10_CRF_ID", GXutil.ltrim( GXutil.str( A167TBW10_CRF_ID, 4, 0)));
      A957TBW10_CRF_EDA_NO = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A957TBW10_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A957TBW10_CRF_EDA_NO, 2, 0)));
      A168TBW10_CRF_ITEM_GRP_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A168TBW10_CRF_ITEM_GRP_CD", A168TBW10_CRF_ITEM_GRP_CD);
      A169TBW10_VISIT_NO = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A169TBW10_VISIT_NO", GXutil.ltrim( GXutil.str( A169TBW10_VISIT_NO, 6, 0)));
      A170TBW10_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A170TBW10_DOM_CD", A170TBW10_DOM_CD);
      A171TBW10_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A171TBW10_DOM_VAR_NM", A171TBW10_DOM_VAR_NM);
      A172TBW10_DOM_ITM_GRP_OID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A172TBW10_DOM_ITM_GRP_OID", A172TBW10_DOM_ITM_GRP_OID);
      A173TBW10_DOM_ITM_GRP_ROWNO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A173TBW10_DOM_ITM_GRP_ROWNO", GXutil.ltrim( GXutil.str( A173TBW10_DOM_ITM_GRP_ROWNO, 4, 0)));
      initializeNonKey1B62( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?1830155");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513215936");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbw10_csv_work.js", "?202071513215936");
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
      lblTextblocktbw10_crf_eda_no_Internalname = "TEXTBLOCKTBW10_CRF_EDA_NO" ;
      edtTBW10_CRF_EDA_NO_Internalname = "TBW10_CRF_EDA_NO" ;
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
      edtTBW10_CRF_EDA_NO_Jsonclick = "" ;
      edtTBW10_CRF_EDA_NO_Enabled = 1 ;
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
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
                                              byte GX_Parm6 ,
                                              String GX_Parm7 ,
                                              int GX_Parm8 ,
                                              String GX_Parm9 ,
                                              String GX_Parm10 ,
                                              String GX_Parm11 ,
                                              short GX_Parm12 ,
                                              byte GX_Parm13 ,
                                              String GX_Parm14 ,
                                              String GX_Parm15 ,
                                              String GX_Parm16 )
   {
      A163TBW10_SESSION_ID = GX_Parm1 ;
      A164TBW10_DATETIME = GX_Parm2 ;
      A165TBW10_STUDY_ID = GX_Parm3 ;
      A166TBW10_SUBJECT_ID = GX_Parm4 ;
      A167TBW10_CRF_ID = GX_Parm5 ;
      A957TBW10_CRF_EDA_NO = GX_Parm6 ;
      A168TBW10_CRF_ITEM_GRP_CD = GX_Parm7 ;
      A169TBW10_VISIT_NO = GX_Parm8 ;
      A170TBW10_DOM_CD = GX_Parm9 ;
      A171TBW10_DOM_VAR_NM = GX_Parm10 ;
      A172TBW10_DOM_ITM_GRP_OID = GX_Parm11 ;
      A173TBW10_DOM_ITM_GRP_ROWNO = GX_Parm12 ;
      A770TBW10_CHAR_1 = GX_Parm13 ;
      n770TBW10_CHAR_1 = false ;
      A771TBW10_VALUE = GX_Parm14 ;
      n771TBW10_VALUE = false ;
      A772TBW10_CRF_ITEM_DIV = GX_Parm15 ;
      n772TBW10_CRF_ITEM_DIV = false ;
      A773TBW10_LIST_CD = GX_Parm16 ;
      n773TBW10_LIST_CD = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A770TBW10_CHAR_1, (byte)(1), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A771TBW10_VALUE));
      isValidOutput.add(GXutil.rtrim( A772TBW10_CRF_ITEM_DIV));
      isValidOutput.add(GXutil.rtrim( A773TBW10_LIST_CD));
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z163TBW10_SESSION_ID));
      isValidOutput.add(localUtil.ttoc( Z164TBW10_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z165TBW10_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z166TBW10_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z167TBW10_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z957TBW10_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z168TBW10_CRF_ITEM_GRP_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z169TBW10_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z170TBW10_DOM_CD));
      isValidOutput.add(GXutil.rtrim( Z171TBW10_DOM_VAR_NM));
      isValidOutput.add(GXutil.rtrim( Z172TBW10_DOM_ITM_GRP_OID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z173TBW10_DOM_ITM_GRP_ROWNO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z770TBW10_CHAR_1, (byte)(1), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z771TBW10_VALUE));
      isValidOutput.add(GXutil.rtrim( Z772TBW10_CRF_ITEM_DIV));
      isValidOutput.add(GXutil.rtrim( Z773TBW10_LIST_CD));
      isValidOutput.add(GXutil.rtrim( ZV8Pgmname));
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
      Z163TBW10_SESSION_ID = "" ;
      Z164TBW10_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z168TBW10_CRF_ITEM_GRP_CD = "" ;
      Z170TBW10_DOM_CD = "" ;
      Z171TBW10_DOM_VAR_NM = "" ;
      Z172TBW10_DOM_ITM_GRP_OID = "" ;
      Z771TBW10_VALUE = "" ;
      Z772TBW10_CRF_ITEM_DIV = "" ;
      Z773TBW10_LIST_CD = "" ;
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
      A163TBW10_SESSION_ID = "" ;
      lblTextblocktbw10_datetime_Jsonclick = "" ;
      A164TBW10_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw10_study_id_Jsonclick = "" ;
      lblTextblocktbw10_subject_id_Jsonclick = "" ;
      lblTextblocktbw10_crf_id_Jsonclick = "" ;
      lblTextblocktbw10_crf_eda_no_Jsonclick = "" ;
      lblTextblocktbw10_crf_item_grp_cd_Jsonclick = "" ;
      A168TBW10_CRF_ITEM_GRP_CD = "" ;
      lblTextblocktbw10_visit_no_Jsonclick = "" ;
      lblTextblocktbw10_dom_cd_Jsonclick = "" ;
      A170TBW10_DOM_CD = "" ;
      lblTextblocktbw10_dom_var_nm_Jsonclick = "" ;
      A171TBW10_DOM_VAR_NM = "" ;
      lblTextblocktbw10_dom_itm_grp_oid_Jsonclick = "" ;
      A172TBW10_DOM_ITM_GRP_OID = "" ;
      lblTextblocktbw10_dom_itm_grp_rowno_Jsonclick = "" ;
      lblTextblocktbw10_char_1_Jsonclick = "" ;
      lblTextblocktbw10_value_Jsonclick = "" ;
      A771TBW10_VALUE = "" ;
      lblTextblocktbw10_crf_item_div_Jsonclick = "" ;
      A772TBW10_CRF_ITEM_DIV = "" ;
      lblTextblocktbw10_list_cd_Jsonclick = "" ;
      A773TBW10_LIST_CD = "" ;
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
      Gx_mode = "" ;
      AV8Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T001B4_A163TBW10_SESSION_ID = new String[] {""} ;
      T001B4_A164TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B4_A165TBW10_STUDY_ID = new long[1] ;
      T001B4_A166TBW10_SUBJECT_ID = new int[1] ;
      T001B4_A167TBW10_CRF_ID = new short[1] ;
      T001B4_A957TBW10_CRF_EDA_NO = new byte[1] ;
      T001B4_A168TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B4_A169TBW10_VISIT_NO = new int[1] ;
      T001B4_A170TBW10_DOM_CD = new String[] {""} ;
      T001B4_A171TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B4_A172TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B4_A173TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B4_A770TBW10_CHAR_1 = new byte[1] ;
      T001B4_n770TBW10_CHAR_1 = new boolean[] {false} ;
      T001B4_A771TBW10_VALUE = new String[] {""} ;
      T001B4_n771TBW10_VALUE = new boolean[] {false} ;
      T001B4_A772TBW10_CRF_ITEM_DIV = new String[] {""} ;
      T001B4_n772TBW10_CRF_ITEM_DIV = new boolean[] {false} ;
      T001B4_A773TBW10_LIST_CD = new String[] {""} ;
      T001B4_n773TBW10_LIST_CD = new boolean[] {false} ;
      T001B5_A163TBW10_SESSION_ID = new String[] {""} ;
      T001B5_A164TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B5_A165TBW10_STUDY_ID = new long[1] ;
      T001B5_A166TBW10_SUBJECT_ID = new int[1] ;
      T001B5_A167TBW10_CRF_ID = new short[1] ;
      T001B5_A957TBW10_CRF_EDA_NO = new byte[1] ;
      T001B5_A168TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B5_A169TBW10_VISIT_NO = new int[1] ;
      T001B5_A170TBW10_DOM_CD = new String[] {""} ;
      T001B5_A171TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B5_A172TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B5_A173TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B3_A163TBW10_SESSION_ID = new String[] {""} ;
      T001B3_A164TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B3_A165TBW10_STUDY_ID = new long[1] ;
      T001B3_A166TBW10_SUBJECT_ID = new int[1] ;
      T001B3_A167TBW10_CRF_ID = new short[1] ;
      T001B3_A957TBW10_CRF_EDA_NO = new byte[1] ;
      T001B3_A168TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B3_A169TBW10_VISIT_NO = new int[1] ;
      T001B3_A170TBW10_DOM_CD = new String[] {""} ;
      T001B3_A171TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B3_A172TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B3_A173TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B3_A770TBW10_CHAR_1 = new byte[1] ;
      T001B3_n770TBW10_CHAR_1 = new boolean[] {false} ;
      T001B3_A771TBW10_VALUE = new String[] {""} ;
      T001B3_n771TBW10_VALUE = new boolean[] {false} ;
      T001B3_A772TBW10_CRF_ITEM_DIV = new String[] {""} ;
      T001B3_n772TBW10_CRF_ITEM_DIV = new boolean[] {false} ;
      T001B3_A773TBW10_LIST_CD = new String[] {""} ;
      T001B3_n773TBW10_LIST_CD = new boolean[] {false} ;
      sMode62 = "" ;
      T001B6_A163TBW10_SESSION_ID = new String[] {""} ;
      T001B6_A164TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B6_A165TBW10_STUDY_ID = new long[1] ;
      T001B6_A166TBW10_SUBJECT_ID = new int[1] ;
      T001B6_A167TBW10_CRF_ID = new short[1] ;
      T001B6_A957TBW10_CRF_EDA_NO = new byte[1] ;
      T001B6_A168TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B6_A169TBW10_VISIT_NO = new int[1] ;
      T001B6_A170TBW10_DOM_CD = new String[] {""} ;
      T001B6_A171TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B6_A172TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B6_A173TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B7_A163TBW10_SESSION_ID = new String[] {""} ;
      T001B7_A164TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B7_A165TBW10_STUDY_ID = new long[1] ;
      T001B7_A166TBW10_SUBJECT_ID = new int[1] ;
      T001B7_A167TBW10_CRF_ID = new short[1] ;
      T001B7_A957TBW10_CRF_EDA_NO = new byte[1] ;
      T001B7_A168TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B7_A169TBW10_VISIT_NO = new int[1] ;
      T001B7_A170TBW10_DOM_CD = new String[] {""} ;
      T001B7_A171TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B7_A172TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B7_A173TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B2_A163TBW10_SESSION_ID = new String[] {""} ;
      T001B2_A164TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B2_A165TBW10_STUDY_ID = new long[1] ;
      T001B2_A166TBW10_SUBJECT_ID = new int[1] ;
      T001B2_A167TBW10_CRF_ID = new short[1] ;
      T001B2_A957TBW10_CRF_EDA_NO = new byte[1] ;
      T001B2_A168TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B2_A169TBW10_VISIT_NO = new int[1] ;
      T001B2_A170TBW10_DOM_CD = new String[] {""} ;
      T001B2_A171TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B2_A172TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B2_A173TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      T001B2_A770TBW10_CHAR_1 = new byte[1] ;
      T001B2_n770TBW10_CHAR_1 = new boolean[] {false} ;
      T001B2_A771TBW10_VALUE = new String[] {""} ;
      T001B2_n771TBW10_VALUE = new boolean[] {false} ;
      T001B2_A772TBW10_CRF_ITEM_DIV = new String[] {""} ;
      T001B2_n772TBW10_CRF_ITEM_DIV = new boolean[] {false} ;
      T001B2_A773TBW10_LIST_CD = new String[] {""} ;
      T001B2_n773TBW10_LIST_CD = new boolean[] {false} ;
      T001B11_A163TBW10_SESSION_ID = new String[] {""} ;
      T001B11_A164TBW10_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001B11_A165TBW10_STUDY_ID = new long[1] ;
      T001B11_A166TBW10_SUBJECT_ID = new int[1] ;
      T001B11_A167TBW10_CRF_ID = new short[1] ;
      T001B11_A957TBW10_CRF_EDA_NO = new byte[1] ;
      T001B11_A168TBW10_CRF_ITEM_GRP_CD = new String[] {""} ;
      T001B11_A169TBW10_VISIT_NO = new int[1] ;
      T001B11_A170TBW10_DOM_CD = new String[] {""} ;
      T001B11_A171TBW10_DOM_VAR_NM = new String[] {""} ;
      T001B11_A172TBW10_DOM_ITM_GRP_OID = new String[] {""} ;
      T001B11_A173TBW10_DOM_ITM_GRP_ROWNO = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw10_csv_work__default(),
         new Object[] {
             new Object[] {
            T001B2_A163TBW10_SESSION_ID, T001B2_A164TBW10_DATETIME, T001B2_A165TBW10_STUDY_ID, T001B2_A166TBW10_SUBJECT_ID, T001B2_A167TBW10_CRF_ID, T001B2_A957TBW10_CRF_EDA_NO, T001B2_A168TBW10_CRF_ITEM_GRP_CD, T001B2_A169TBW10_VISIT_NO, T001B2_A170TBW10_DOM_CD, T001B2_A171TBW10_DOM_VAR_NM,
            T001B2_A172TBW10_DOM_ITM_GRP_OID, T001B2_A173TBW10_DOM_ITM_GRP_ROWNO, T001B2_A770TBW10_CHAR_1, T001B2_n770TBW10_CHAR_1, T001B2_A771TBW10_VALUE, T001B2_n771TBW10_VALUE, T001B2_A772TBW10_CRF_ITEM_DIV, T001B2_n772TBW10_CRF_ITEM_DIV, T001B2_A773TBW10_LIST_CD, T001B2_n773TBW10_LIST_CD
            }
            , new Object[] {
            T001B3_A163TBW10_SESSION_ID, T001B3_A164TBW10_DATETIME, T001B3_A165TBW10_STUDY_ID, T001B3_A166TBW10_SUBJECT_ID, T001B3_A167TBW10_CRF_ID, T001B3_A957TBW10_CRF_EDA_NO, T001B3_A168TBW10_CRF_ITEM_GRP_CD, T001B3_A169TBW10_VISIT_NO, T001B3_A170TBW10_DOM_CD, T001B3_A171TBW10_DOM_VAR_NM,
            T001B3_A172TBW10_DOM_ITM_GRP_OID, T001B3_A173TBW10_DOM_ITM_GRP_ROWNO, T001B3_A770TBW10_CHAR_1, T001B3_n770TBW10_CHAR_1, T001B3_A771TBW10_VALUE, T001B3_n771TBW10_VALUE, T001B3_A772TBW10_CRF_ITEM_DIV, T001B3_n772TBW10_CRF_ITEM_DIV, T001B3_A773TBW10_LIST_CD, T001B3_n773TBW10_LIST_CD
            }
            , new Object[] {
            T001B4_A163TBW10_SESSION_ID, T001B4_A164TBW10_DATETIME, T001B4_A165TBW10_STUDY_ID, T001B4_A166TBW10_SUBJECT_ID, T001B4_A167TBW10_CRF_ID, T001B4_A957TBW10_CRF_EDA_NO, T001B4_A168TBW10_CRF_ITEM_GRP_CD, T001B4_A169TBW10_VISIT_NO, T001B4_A170TBW10_DOM_CD, T001B4_A171TBW10_DOM_VAR_NM,
            T001B4_A172TBW10_DOM_ITM_GRP_OID, T001B4_A173TBW10_DOM_ITM_GRP_ROWNO, T001B4_A770TBW10_CHAR_1, T001B4_n770TBW10_CHAR_1, T001B4_A771TBW10_VALUE, T001B4_n771TBW10_VALUE, T001B4_A772TBW10_CRF_ITEM_DIV, T001B4_n772TBW10_CRF_ITEM_DIV, T001B4_A773TBW10_LIST_CD, T001B4_n773TBW10_LIST_CD
            }
            , new Object[] {
            T001B5_A163TBW10_SESSION_ID, T001B5_A164TBW10_DATETIME, T001B5_A165TBW10_STUDY_ID, T001B5_A166TBW10_SUBJECT_ID, T001B5_A167TBW10_CRF_ID, T001B5_A957TBW10_CRF_EDA_NO, T001B5_A168TBW10_CRF_ITEM_GRP_CD, T001B5_A169TBW10_VISIT_NO, T001B5_A170TBW10_DOM_CD, T001B5_A171TBW10_DOM_VAR_NM,
            T001B5_A172TBW10_DOM_ITM_GRP_OID, T001B5_A173TBW10_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            T001B6_A163TBW10_SESSION_ID, T001B6_A164TBW10_DATETIME, T001B6_A165TBW10_STUDY_ID, T001B6_A166TBW10_SUBJECT_ID, T001B6_A167TBW10_CRF_ID, T001B6_A957TBW10_CRF_EDA_NO, T001B6_A168TBW10_CRF_ITEM_GRP_CD, T001B6_A169TBW10_VISIT_NO, T001B6_A170TBW10_DOM_CD, T001B6_A171TBW10_DOM_VAR_NM,
            T001B6_A172TBW10_DOM_ITM_GRP_OID, T001B6_A173TBW10_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            T001B7_A163TBW10_SESSION_ID, T001B7_A164TBW10_DATETIME, T001B7_A165TBW10_STUDY_ID, T001B7_A166TBW10_SUBJECT_ID, T001B7_A167TBW10_CRF_ID, T001B7_A957TBW10_CRF_EDA_NO, T001B7_A168TBW10_CRF_ITEM_GRP_CD, T001B7_A169TBW10_VISIT_NO, T001B7_A170TBW10_DOM_CD, T001B7_A171TBW10_DOM_VAR_NM,
            T001B7_A172TBW10_DOM_ITM_GRP_OID, T001B7_A173TBW10_DOM_ITM_GRP_ROWNO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001B11_A163TBW10_SESSION_ID, T001B11_A164TBW10_DATETIME, T001B11_A165TBW10_STUDY_ID, T001B11_A166TBW10_SUBJECT_ID, T001B11_A167TBW10_CRF_ID, T001B11_A957TBW10_CRF_EDA_NO, T001B11_A168TBW10_CRF_ITEM_GRP_CD, T001B11_A169TBW10_VISIT_NO, T001B11_A170TBW10_DOM_CD, T001B11_A171TBW10_DOM_VAR_NM,
            T001B11_A172TBW10_DOM_ITM_GRP_OID, T001B11_A173TBW10_DOM_ITM_GRP_ROWNO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW10_CSV_WORK" ;
   }

   private byte Z957TBW10_CRF_EDA_NO ;
   private byte Z770TBW10_CHAR_1 ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A957TBW10_CRF_EDA_NO ;
   private byte A770TBW10_CHAR_1 ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z167TBW10_CRF_ID ;
   private short Z173TBW10_DOM_ITM_GRP_ROWNO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A167TBW10_CRF_ID ;
   private short A173TBW10_DOM_ITM_GRP_ROWNO ;
   private short RcdFound62 ;
   private short Gx_err ;
   private int Z166TBW10_SUBJECT_ID ;
   private int Z169TBW10_VISIT_NO ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW10_SESSION_ID_Enabled ;
   private int edtTBW10_DATETIME_Enabled ;
   private int edtTBW10_STUDY_ID_Enabled ;
   private int A166TBW10_SUBJECT_ID ;
   private int edtTBW10_SUBJECT_ID_Enabled ;
   private int edtTBW10_CRF_ID_Enabled ;
   private int edtTBW10_CRF_EDA_NO_Enabled ;
   private int edtTBW10_CRF_ITEM_GRP_CD_Enabled ;
   private int A169TBW10_VISIT_NO ;
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
   private int GX_JID ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long Z165TBW10_STUDY_ID ;
   private long A165TBW10_STUDY_ID ;
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
   private String lblTextblocktbw10_crf_eda_no_Internalname ;
   private String lblTextblocktbw10_crf_eda_no_Jsonclick ;
   private String edtTBW10_CRF_EDA_NO_Internalname ;
   private String edtTBW10_CRF_EDA_NO_Jsonclick ;
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
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode62 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z164TBW10_DATETIME ;
   private java.util.Date A164TBW10_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n770TBW10_CHAR_1 ;
   private boolean n771TBW10_VALUE ;
   private boolean n772TBW10_CRF_ITEM_DIV ;
   private boolean n773TBW10_LIST_CD ;
   private boolean toggleJsOutput ;
   private String Z163TBW10_SESSION_ID ;
   private String Z168TBW10_CRF_ITEM_GRP_CD ;
   private String Z170TBW10_DOM_CD ;
   private String Z171TBW10_DOM_VAR_NM ;
   private String Z172TBW10_DOM_ITM_GRP_OID ;
   private String Z771TBW10_VALUE ;
   private String Z772TBW10_CRF_ITEM_DIV ;
   private String Z773TBW10_LIST_CD ;
   private String A163TBW10_SESSION_ID ;
   private String A168TBW10_CRF_ITEM_GRP_CD ;
   private String A170TBW10_DOM_CD ;
   private String A171TBW10_DOM_VAR_NM ;
   private String A172TBW10_DOM_ITM_GRP_OID ;
   private String A771TBW10_VALUE ;
   private String A772TBW10_CRF_ITEM_DIV ;
   private String A773TBW10_LIST_CD ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001B4_A163TBW10_SESSION_ID ;
   private java.util.Date[] T001B4_A164TBW10_DATETIME ;
   private long[] T001B4_A165TBW10_STUDY_ID ;
   private int[] T001B4_A166TBW10_SUBJECT_ID ;
   private short[] T001B4_A167TBW10_CRF_ID ;
   private byte[] T001B4_A957TBW10_CRF_EDA_NO ;
   private String[] T001B4_A168TBW10_CRF_ITEM_GRP_CD ;
   private int[] T001B4_A169TBW10_VISIT_NO ;
   private String[] T001B4_A170TBW10_DOM_CD ;
   private String[] T001B4_A171TBW10_DOM_VAR_NM ;
   private String[] T001B4_A172TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B4_A173TBW10_DOM_ITM_GRP_ROWNO ;
   private byte[] T001B4_A770TBW10_CHAR_1 ;
   private boolean[] T001B4_n770TBW10_CHAR_1 ;
   private String[] T001B4_A771TBW10_VALUE ;
   private boolean[] T001B4_n771TBW10_VALUE ;
   private String[] T001B4_A772TBW10_CRF_ITEM_DIV ;
   private boolean[] T001B4_n772TBW10_CRF_ITEM_DIV ;
   private String[] T001B4_A773TBW10_LIST_CD ;
   private boolean[] T001B4_n773TBW10_LIST_CD ;
   private String[] T001B5_A163TBW10_SESSION_ID ;
   private java.util.Date[] T001B5_A164TBW10_DATETIME ;
   private long[] T001B5_A165TBW10_STUDY_ID ;
   private int[] T001B5_A166TBW10_SUBJECT_ID ;
   private short[] T001B5_A167TBW10_CRF_ID ;
   private byte[] T001B5_A957TBW10_CRF_EDA_NO ;
   private String[] T001B5_A168TBW10_CRF_ITEM_GRP_CD ;
   private int[] T001B5_A169TBW10_VISIT_NO ;
   private String[] T001B5_A170TBW10_DOM_CD ;
   private String[] T001B5_A171TBW10_DOM_VAR_NM ;
   private String[] T001B5_A172TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B5_A173TBW10_DOM_ITM_GRP_ROWNO ;
   private String[] T001B3_A163TBW10_SESSION_ID ;
   private java.util.Date[] T001B3_A164TBW10_DATETIME ;
   private long[] T001B3_A165TBW10_STUDY_ID ;
   private int[] T001B3_A166TBW10_SUBJECT_ID ;
   private short[] T001B3_A167TBW10_CRF_ID ;
   private byte[] T001B3_A957TBW10_CRF_EDA_NO ;
   private String[] T001B3_A168TBW10_CRF_ITEM_GRP_CD ;
   private int[] T001B3_A169TBW10_VISIT_NO ;
   private String[] T001B3_A170TBW10_DOM_CD ;
   private String[] T001B3_A171TBW10_DOM_VAR_NM ;
   private String[] T001B3_A172TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B3_A173TBW10_DOM_ITM_GRP_ROWNO ;
   private byte[] T001B3_A770TBW10_CHAR_1 ;
   private boolean[] T001B3_n770TBW10_CHAR_1 ;
   private String[] T001B3_A771TBW10_VALUE ;
   private boolean[] T001B3_n771TBW10_VALUE ;
   private String[] T001B3_A772TBW10_CRF_ITEM_DIV ;
   private boolean[] T001B3_n772TBW10_CRF_ITEM_DIV ;
   private String[] T001B3_A773TBW10_LIST_CD ;
   private boolean[] T001B3_n773TBW10_LIST_CD ;
   private String[] T001B6_A163TBW10_SESSION_ID ;
   private java.util.Date[] T001B6_A164TBW10_DATETIME ;
   private long[] T001B6_A165TBW10_STUDY_ID ;
   private int[] T001B6_A166TBW10_SUBJECT_ID ;
   private short[] T001B6_A167TBW10_CRF_ID ;
   private byte[] T001B6_A957TBW10_CRF_EDA_NO ;
   private String[] T001B6_A168TBW10_CRF_ITEM_GRP_CD ;
   private int[] T001B6_A169TBW10_VISIT_NO ;
   private String[] T001B6_A170TBW10_DOM_CD ;
   private String[] T001B6_A171TBW10_DOM_VAR_NM ;
   private String[] T001B6_A172TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B6_A173TBW10_DOM_ITM_GRP_ROWNO ;
   private String[] T001B7_A163TBW10_SESSION_ID ;
   private java.util.Date[] T001B7_A164TBW10_DATETIME ;
   private long[] T001B7_A165TBW10_STUDY_ID ;
   private int[] T001B7_A166TBW10_SUBJECT_ID ;
   private short[] T001B7_A167TBW10_CRF_ID ;
   private byte[] T001B7_A957TBW10_CRF_EDA_NO ;
   private String[] T001B7_A168TBW10_CRF_ITEM_GRP_CD ;
   private int[] T001B7_A169TBW10_VISIT_NO ;
   private String[] T001B7_A170TBW10_DOM_CD ;
   private String[] T001B7_A171TBW10_DOM_VAR_NM ;
   private String[] T001B7_A172TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B7_A173TBW10_DOM_ITM_GRP_ROWNO ;
   private String[] T001B2_A163TBW10_SESSION_ID ;
   private java.util.Date[] T001B2_A164TBW10_DATETIME ;
   private long[] T001B2_A165TBW10_STUDY_ID ;
   private int[] T001B2_A166TBW10_SUBJECT_ID ;
   private short[] T001B2_A167TBW10_CRF_ID ;
   private byte[] T001B2_A957TBW10_CRF_EDA_NO ;
   private String[] T001B2_A168TBW10_CRF_ITEM_GRP_CD ;
   private int[] T001B2_A169TBW10_VISIT_NO ;
   private String[] T001B2_A170TBW10_DOM_CD ;
   private String[] T001B2_A171TBW10_DOM_VAR_NM ;
   private String[] T001B2_A172TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B2_A173TBW10_DOM_ITM_GRP_ROWNO ;
   private byte[] T001B2_A770TBW10_CHAR_1 ;
   private boolean[] T001B2_n770TBW10_CHAR_1 ;
   private String[] T001B2_A771TBW10_VALUE ;
   private boolean[] T001B2_n771TBW10_VALUE ;
   private String[] T001B2_A772TBW10_CRF_ITEM_DIV ;
   private boolean[] T001B2_n772TBW10_CRF_ITEM_DIV ;
   private String[] T001B2_A773TBW10_LIST_CD ;
   private boolean[] T001B2_n773TBW10_LIST_CD ;
   private String[] T001B11_A163TBW10_SESSION_ID ;
   private java.util.Date[] T001B11_A164TBW10_DATETIME ;
   private long[] T001B11_A165TBW10_STUDY_ID ;
   private int[] T001B11_A166TBW10_SUBJECT_ID ;
   private short[] T001B11_A167TBW10_CRF_ID ;
   private byte[] T001B11_A957TBW10_CRF_EDA_NO ;
   private String[] T001B11_A168TBW10_CRF_ITEM_GRP_CD ;
   private int[] T001B11_A169TBW10_VISIT_NO ;
   private String[] T001B11_A170TBW10_DOM_CD ;
   private String[] T001B11_A171TBW10_DOM_VAR_NM ;
   private String[] T001B11_A172TBW10_DOM_ITM_GRP_OID ;
   private short[] T001B11_A173TBW10_DOM_ITM_GRP_ROWNO ;
}

final  class tbw10_csv_work__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001B2", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_EDA_NO`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO`, `TBW10_CHAR_1`, `TBW10_VALUE`, `TBW10_CRF_ITEM_DIV`, `TBW10_LIST_CD` FROM `TBW10_CSV_WORK` WHERE `TBW10_SESSION_ID` = ? AND `TBW10_DATETIME` = ? AND `TBW10_STUDY_ID` = ? AND `TBW10_SUBJECT_ID` = ? AND `TBW10_CRF_ID` = ? AND `TBW10_CRF_EDA_NO` = ? AND `TBW10_CRF_ITEM_GRP_CD` = ? AND `TBW10_VISIT_NO` = ? AND `TBW10_DOM_CD` = ? AND `TBW10_DOM_VAR_NM` = ? AND `TBW10_DOM_ITM_GRP_OID` = ? AND `TBW10_DOM_ITM_GRP_ROWNO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001B3", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_EDA_NO`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO`, `TBW10_CHAR_1`, `TBW10_VALUE`, `TBW10_CRF_ITEM_DIV`, `TBW10_LIST_CD` FROM `TBW10_CSV_WORK` WHERE `TBW10_SESSION_ID` = ? AND `TBW10_DATETIME` = ? AND `TBW10_STUDY_ID` = ? AND `TBW10_SUBJECT_ID` = ? AND `TBW10_CRF_ID` = ? AND `TBW10_CRF_EDA_NO` = ? AND `TBW10_CRF_ITEM_GRP_CD` = ? AND `TBW10_VISIT_NO` = ? AND `TBW10_DOM_CD` = ? AND `TBW10_DOM_VAR_NM` = ? AND `TBW10_DOM_ITM_GRP_OID` = ? AND `TBW10_DOM_ITM_GRP_ROWNO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001B4", "SELECT TM1.`TBW10_SESSION_ID`, TM1.`TBW10_DATETIME`, TM1.`TBW10_STUDY_ID`, TM1.`TBW10_SUBJECT_ID`, TM1.`TBW10_CRF_ID`, TM1.`TBW10_CRF_EDA_NO`, TM1.`TBW10_CRF_ITEM_GRP_CD`, TM1.`TBW10_VISIT_NO`, TM1.`TBW10_DOM_CD`, TM1.`TBW10_DOM_VAR_NM`, TM1.`TBW10_DOM_ITM_GRP_OID`, TM1.`TBW10_DOM_ITM_GRP_ROWNO`, TM1.`TBW10_CHAR_1`, TM1.`TBW10_VALUE`, TM1.`TBW10_CRF_ITEM_DIV`, TM1.`TBW10_LIST_CD` FROM `TBW10_CSV_WORK` TM1 WHERE TM1.`TBW10_SESSION_ID` = ? and TM1.`TBW10_DATETIME` = ? and TM1.`TBW10_STUDY_ID` = ? and TM1.`TBW10_SUBJECT_ID` = ? and TM1.`TBW10_CRF_ID` = ? and TM1.`TBW10_CRF_EDA_NO` = ? and TM1.`TBW10_CRF_ITEM_GRP_CD` = ? and TM1.`TBW10_VISIT_NO` = ? and TM1.`TBW10_DOM_CD` = ? and TM1.`TBW10_DOM_VAR_NM` = ? and TM1.`TBW10_DOM_ITM_GRP_OID` = ? and TM1.`TBW10_DOM_ITM_GRP_ROWNO` = ? ORDER BY TM1.`TBW10_SESSION_ID`, TM1.`TBW10_DATETIME`, TM1.`TBW10_STUDY_ID`, TM1.`TBW10_SUBJECT_ID`, TM1.`TBW10_CRF_ID`, TM1.`TBW10_CRF_EDA_NO`, TM1.`TBW10_CRF_ITEM_GRP_CD`, TM1.`TBW10_VISIT_NO`, TM1.`TBW10_DOM_CD`, TM1.`TBW10_DOM_VAR_NM`, TM1.`TBW10_DOM_ITM_GRP_OID`, TM1.`TBW10_DOM_ITM_GRP_ROWNO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001B5", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_EDA_NO`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO` FROM `TBW10_CSV_WORK` WHERE `TBW10_SESSION_ID` = ? AND `TBW10_DATETIME` = ? AND `TBW10_STUDY_ID` = ? AND `TBW10_SUBJECT_ID` = ? AND `TBW10_CRF_ID` = ? AND `TBW10_CRF_EDA_NO` = ? AND `TBW10_CRF_ITEM_GRP_CD` = ? AND `TBW10_VISIT_NO` = ? AND `TBW10_DOM_CD` = ? AND `TBW10_DOM_VAR_NM` = ? AND `TBW10_DOM_ITM_GRP_OID` = ? AND `TBW10_DOM_ITM_GRP_ROWNO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001B6", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_EDA_NO`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO` FROM `TBW10_CSV_WORK` WHERE ( `TBW10_SESSION_ID` > ? or `TBW10_SESSION_ID` = ? and `TBW10_DATETIME` > ? or `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_STUDY_ID` > ? or `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_SUBJECT_ID` > ? or `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_CRF_ID` > ? or `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_CRF_EDA_NO` > ? or `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_CRF_ITEM_GRP_CD` > ? or `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_VISIT_NO` > ? or `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_CD` > ? or `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_VAR_NM` > ? or `TBW10_DOM_VAR_NM` = ? and `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_ITM_GRP_OID` > ? or `TBW10_DOM_ITM_GRP_OID` = ? and `TBW10_DOM_VAR_NM` = ? and `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_ITM_GRP_ROWNO` > ?) ORDER BY `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_EDA_NO`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001B7", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_EDA_NO`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO` FROM `TBW10_CSV_WORK` WHERE ( `TBW10_SESSION_ID` < ? or `TBW10_SESSION_ID` = ? and `TBW10_DATETIME` < ? or `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_STUDY_ID` < ? or `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_SUBJECT_ID` < ? or `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_CRF_ID` < ? or `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_CRF_EDA_NO` < ? or `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_CRF_ITEM_GRP_CD` < ? or `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_VISIT_NO` < ? or `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_CD` < ? or `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_VAR_NM` < ? or `TBW10_DOM_VAR_NM` = ? and `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_ITM_GRP_OID` < ? or `TBW10_DOM_ITM_GRP_OID` = ? and `TBW10_DOM_VAR_NM` = ? and `TBW10_DOM_CD` = ? and `TBW10_VISIT_NO` = ? and `TBW10_CRF_ITEM_GRP_CD` = ? and `TBW10_CRF_EDA_NO` = ? and `TBW10_CRF_ID` = ? and `TBW10_SUBJECT_ID` = ? and `TBW10_STUDY_ID` = ? and `TBW10_DATETIME` = ? and `TBW10_SESSION_ID` = ? and `TBW10_DOM_ITM_GRP_ROWNO` < ?) ORDER BY `TBW10_SESSION_ID` DESC, `TBW10_DATETIME` DESC, `TBW10_STUDY_ID` DESC, `TBW10_SUBJECT_ID` DESC, `TBW10_CRF_ID` DESC, `TBW10_CRF_EDA_NO` DESC, `TBW10_CRF_ITEM_GRP_CD` DESC, `TBW10_VISIT_NO` DESC, `TBW10_DOM_CD` DESC, `TBW10_DOM_VAR_NM` DESC, `TBW10_DOM_ITM_GRP_OID` DESC, `TBW10_DOM_ITM_GRP_ROWNO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001B8", "INSERT INTO `TBW10_CSV_WORK`(`TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_EDA_NO`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO`, `TBW10_CHAR_1`, `TBW10_VALUE`, `TBW10_CRF_ITEM_DIV`, `TBW10_LIST_CD`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001B9", "UPDATE `TBW10_CSV_WORK` SET `TBW10_CHAR_1`=?, `TBW10_VALUE`=?, `TBW10_CRF_ITEM_DIV`=?, `TBW10_LIST_CD`=?  WHERE `TBW10_SESSION_ID` = ? AND `TBW10_DATETIME` = ? AND `TBW10_STUDY_ID` = ? AND `TBW10_SUBJECT_ID` = ? AND `TBW10_CRF_ID` = ? AND `TBW10_CRF_EDA_NO` = ? AND `TBW10_CRF_ITEM_GRP_CD` = ? AND `TBW10_VISIT_NO` = ? AND `TBW10_DOM_CD` = ? AND `TBW10_DOM_VAR_NM` = ? AND `TBW10_DOM_ITM_GRP_OID` = ? AND `TBW10_DOM_ITM_GRP_ROWNO` = ?", GX_NOMASK)
         ,new UpdateCursor("T001B10", "DELETE FROM `TBW10_CSV_WORK`  WHERE `TBW10_SESSION_ID` = ? AND `TBW10_DATETIME` = ? AND `TBW10_STUDY_ID` = ? AND `TBW10_SUBJECT_ID` = ? AND `TBW10_CRF_ID` = ? AND `TBW10_CRF_EDA_NO` = ? AND `TBW10_CRF_ITEM_GRP_CD` = ? AND `TBW10_VISIT_NO` = ? AND `TBW10_DOM_CD` = ? AND `TBW10_DOM_VAR_NM` = ? AND `TBW10_DOM_ITM_GRP_OID` = ? AND `TBW10_DOM_ITM_GRP_ROWNO` = ?", GX_NOMASK)
         ,new ForEachCursor("T001B11", "SELECT `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_EDA_NO`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO` FROM `TBW10_CSV_WORK` ORDER BY `TBW10_SESSION_ID`, `TBW10_DATETIME`, `TBW10_STUDY_ID`, `TBW10_SUBJECT_ID`, `TBW10_CRF_ID`, `TBW10_CRF_EDA_NO`, `TBW10_CRF_ITEM_GRP_CD`, `TBW10_VISIT_NO`, `TBW10_DOM_CD`, `TBW10_DOM_VAR_NM`, `TBW10_DOM_ITM_GRP_OID`, `TBW10_DOM_ITM_GRP_ROWNO` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((short[]) buf[11])[0] = rslt.getShort(12) ;
               ((byte[]) buf[12])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((short[]) buf[11])[0] = rslt.getShort(12) ;
               ((byte[]) buf[12])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((short[]) buf[11])[0] = rslt.getShort(12) ;
               ((byte[]) buf[12])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((short[]) buf[11])[0] = rslt.getShort(12) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((short[]) buf[11])[0] = rslt.getShort(12) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((short[]) buf[11])[0] = rslt.getShort(12) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               ((byte[]) buf[5])[0] = rslt.getByte(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((int[]) buf[7])[0] = rslt.getInt(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((short[]) buf[11])[0] = rslt.getShort(12) ;
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setVarchar(9, (String)parms[8], 16, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setVarchar(11, (String)parms[10], 50, false);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setVarchar(9, (String)parms[8], 16, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setVarchar(11, (String)parms[10], 50, false);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setVarchar(9, (String)parms[8], 16, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setVarchar(11, (String)parms[10], 50, false);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setVarchar(9, (String)parms[8], 16, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setVarchar(11, (String)parms[10], 50, false);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
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
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setLong(25, ((Number) parms[24]).longValue());
               stmt.setDateTime(26, (java.util.Date)parms[25], false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setVarchar(28, (String)parms[27], 50, false);
               stmt.setVarchar(29, (String)parms[28], 50, false);
               stmt.setByte(30, ((Number) parms[29]).byteValue());
               stmt.setShort(31, ((Number) parms[30]).shortValue());
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setLong(33, ((Number) parms[32]).longValue());
               stmt.setDateTime(34, (java.util.Date)parms[33], false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setInt(36, ((Number) parms[35]).intValue());
               stmt.setInt(37, ((Number) parms[36]).intValue());
               stmt.setVarchar(38, (String)parms[37], 50, false);
               stmt.setByte(39, ((Number) parms[38]).byteValue());
               stmt.setShort(40, ((Number) parms[39]).shortValue());
               stmt.setInt(41, ((Number) parms[40]).intValue());
               stmt.setLong(42, ((Number) parms[41]).longValue());
               stmt.setDateTime(43, (java.util.Date)parms[42], false);
               stmt.setVarchar(44, (String)parms[43], 50, false);
               stmt.setVarchar(45, (String)parms[44], 16, false);
               stmt.setVarchar(46, (String)parms[45], 16, false);
               stmt.setInt(47, ((Number) parms[46]).intValue());
               stmt.setVarchar(48, (String)parms[47], 50, false);
               stmt.setByte(49, ((Number) parms[48]).byteValue());
               stmt.setShort(50, ((Number) parms[49]).shortValue());
               stmt.setInt(51, ((Number) parms[50]).intValue());
               stmt.setLong(52, ((Number) parms[51]).longValue());
               stmt.setDateTime(53, (java.util.Date)parms[52], false);
               stmt.setVarchar(54, (String)parms[53], 50, false);
               stmt.setVarchar(55, (String)parms[54], 50, false);
               stmt.setVarchar(56, (String)parms[55], 50, false);
               stmt.setVarchar(57, (String)parms[56], 16, false);
               stmt.setInt(58, ((Number) parms[57]).intValue());
               stmt.setVarchar(59, (String)parms[58], 50, false);
               stmt.setByte(60, ((Number) parms[59]).byteValue());
               stmt.setShort(61, ((Number) parms[60]).shortValue());
               stmt.setInt(62, ((Number) parms[61]).intValue());
               stmt.setLong(63, ((Number) parms[62]).longValue());
               stmt.setDateTime(64, (java.util.Date)parms[63], false);
               stmt.setVarchar(65, (String)parms[64], 50, false);
               stmt.setVarchar(66, (String)parms[65], 50, false);
               stmt.setVarchar(67, (String)parms[66], 50, false);
               stmt.setVarchar(68, (String)parms[67], 50, false);
               stmt.setVarchar(69, (String)parms[68], 16, false);
               stmt.setInt(70, ((Number) parms[69]).intValue());
               stmt.setVarchar(71, (String)parms[70], 50, false);
               stmt.setByte(72, ((Number) parms[71]).byteValue());
               stmt.setShort(73, ((Number) parms[72]).shortValue());
               stmt.setInt(74, ((Number) parms[73]).intValue());
               stmt.setLong(75, ((Number) parms[74]).longValue());
               stmt.setDateTime(76, (java.util.Date)parms[75], false);
               stmt.setVarchar(77, (String)parms[76], 50, false);
               stmt.setShort(78, ((Number) parms[77]).shortValue());
               return;
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
               stmt.setByte(21, ((Number) parms[20]).byteValue());
               stmt.setByte(22, ((Number) parms[21]).byteValue());
               stmt.setShort(23, ((Number) parms[22]).shortValue());
               stmt.setInt(24, ((Number) parms[23]).intValue());
               stmt.setLong(25, ((Number) parms[24]).longValue());
               stmt.setDateTime(26, (java.util.Date)parms[25], false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setVarchar(28, (String)parms[27], 50, false);
               stmt.setVarchar(29, (String)parms[28], 50, false);
               stmt.setByte(30, ((Number) parms[29]).byteValue());
               stmt.setShort(31, ((Number) parms[30]).shortValue());
               stmt.setInt(32, ((Number) parms[31]).intValue());
               stmt.setLong(33, ((Number) parms[32]).longValue());
               stmt.setDateTime(34, (java.util.Date)parms[33], false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setInt(36, ((Number) parms[35]).intValue());
               stmt.setInt(37, ((Number) parms[36]).intValue());
               stmt.setVarchar(38, (String)parms[37], 50, false);
               stmt.setByte(39, ((Number) parms[38]).byteValue());
               stmt.setShort(40, ((Number) parms[39]).shortValue());
               stmt.setInt(41, ((Number) parms[40]).intValue());
               stmt.setLong(42, ((Number) parms[41]).longValue());
               stmt.setDateTime(43, (java.util.Date)parms[42], false);
               stmt.setVarchar(44, (String)parms[43], 50, false);
               stmt.setVarchar(45, (String)parms[44], 16, false);
               stmt.setVarchar(46, (String)parms[45], 16, false);
               stmt.setInt(47, ((Number) parms[46]).intValue());
               stmt.setVarchar(48, (String)parms[47], 50, false);
               stmt.setByte(49, ((Number) parms[48]).byteValue());
               stmt.setShort(50, ((Number) parms[49]).shortValue());
               stmt.setInt(51, ((Number) parms[50]).intValue());
               stmt.setLong(52, ((Number) parms[51]).longValue());
               stmt.setDateTime(53, (java.util.Date)parms[52], false);
               stmt.setVarchar(54, (String)parms[53], 50, false);
               stmt.setVarchar(55, (String)parms[54], 50, false);
               stmt.setVarchar(56, (String)parms[55], 50, false);
               stmt.setVarchar(57, (String)parms[56], 16, false);
               stmt.setInt(58, ((Number) parms[57]).intValue());
               stmt.setVarchar(59, (String)parms[58], 50, false);
               stmt.setByte(60, ((Number) parms[59]).byteValue());
               stmt.setShort(61, ((Number) parms[60]).shortValue());
               stmt.setInt(62, ((Number) parms[61]).intValue());
               stmt.setLong(63, ((Number) parms[62]).longValue());
               stmt.setDateTime(64, (java.util.Date)parms[63], false);
               stmt.setVarchar(65, (String)parms[64], 50, false);
               stmt.setVarchar(66, (String)parms[65], 50, false);
               stmt.setVarchar(67, (String)parms[66], 50, false);
               stmt.setVarchar(68, (String)parms[67], 50, false);
               stmt.setVarchar(69, (String)parms[68], 16, false);
               stmt.setInt(70, ((Number) parms[69]).intValue());
               stmt.setVarchar(71, (String)parms[70], 50, false);
               stmt.setByte(72, ((Number) parms[71]).byteValue());
               stmt.setShort(73, ((Number) parms[72]).shortValue());
               stmt.setInt(74, ((Number) parms[73]).intValue());
               stmt.setLong(75, ((Number) parms[74]).longValue());
               stmt.setDateTime(76, (java.util.Date)parms[75], false);
               stmt.setVarchar(77, (String)parms[76], 50, false);
               stmt.setShort(78, ((Number) parms[77]).shortValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setVarchar(9, (String)parms[8], 16, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setVarchar(11, (String)parms[10], 50, false);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[15], 2000);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[17], 20);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[19], 20);
               }
               return;
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
               stmt.setByte(10, ((Number) parms[13]).byteValue());
               stmt.setVarchar(11, (String)parms[14], 50, false);
               stmt.setInt(12, ((Number) parms[15]).intValue());
               stmt.setVarchar(13, (String)parms[16], 16, false);
               stmt.setVarchar(14, (String)parms[17], 50, false);
               stmt.setVarchar(15, (String)parms[18], 50, false);
               stmt.setShort(16, ((Number) parms[19]).shortValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               stmt.setByte(6, ((Number) parms[5]).byteValue());
               stmt.setVarchar(7, (String)parms[6], 50, false);
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setVarchar(9, (String)parms[8], 16, false);
               stmt.setVarchar(10, (String)parms[9], 50, false);
               stmt.setVarchar(11, (String)parms[10], 50, false);
               stmt.setShort(12, ((Number) parms[11]).shortValue());
               return;
      }
   }

}

