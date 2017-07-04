/*
               File: tbw05_crf_result_impl
        Description: CRF入力結果テーブルワーク
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:4.85
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw05_crf_result_impl extends GXWebPanel
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
      Form.getMeta().addItem("Description", "CRF入力結果テーブルワーク", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW05_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbw05_crf_result_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw05_crf_result_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw05_crf_result_impl.class ));
   }

   public tbw05_crf_result_impl( int remoteHandle ,
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
         wb_table1_2_1843( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1843e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1843( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1843( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1843( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1843e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRF入力結果テーブルワーク"+"</legend>") ;
         wb_table3_27_1843( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1843e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1843e( true) ;
      }
      else
      {
         wb_table1_2_1843e( false) ;
      }
   }

   public void wb_table3_27_1843( boolean wbgen )
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
         wb_table4_33_1843( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1843e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW05_CRF_RESULT.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW05_CRF_RESULT.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1843e( true) ;
      }
      else
      {
         wb_table3_27_1843e( false) ;
      }
   }

   public void wb_table4_33_1843( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw05_session_id_Internalname, "ID", "", "", lblTextblocktbw05_session_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A688TBW05_SESSION_ID", A688TBW05_SESSION_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW05_SESSION_ID_Internalname, GXutil.rtrim( A688TBW05_SESSION_ID), GXutil.rtrim( localUtil.format( A688TBW05_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTBW05_SESSION_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW05_SESSION_ID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw05_app_id_Internalname, "ID", "", "", lblTextblocktbw05_app_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A689TBW05_APP_ID", A689TBW05_APP_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW05_APP_ID_Internalname, GXutil.rtrim( A689TBW05_APP_ID), GXutil.rtrim( localUtil.format( A689TBW05_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBW05_APP_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW05_APP_ID_Enabled, 0, 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw05_disp_datetime_Internalname, "表示日時", "", "", lblTextblocktbw05_disp_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A690TBW05_DISP_DATETIME", A690TBW05_DISP_DATETIME);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW05_DISP_DATETIME_Internalname, GXutil.rtrim( A690TBW05_DISP_DATETIME), GXutil.rtrim( localUtil.format( A690TBW05_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBW05_DISP_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW05_DISP_DATETIME_Enabled, 0, 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw05_study_id_Internalname, "ID", "", "", lblTextblocktbw05_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW05_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A691TBW05_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW05_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A691TBW05_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A691TBW05_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBW05_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW05_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw05_subject_id_Internalname, "ID", "", "", lblTextblocktbw05_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW05_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A692TBW05_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW05_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A692TBW05_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A692TBW05_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBW05_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW05_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw05_crf_id_Internalname, "CRFID", "", "", lblTextblocktbw05_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW05_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A693TBW05_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW05_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A693TBW05_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A693TBW05_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(63);\"", "", "", "", "", edtTBW05_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW05_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw05_crf_item_grp_div_Internalname, "項目・グループ識別区分", "", "", lblTextblocktbw05_crf_item_grp_div_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A694TBW05_CRF_ITEM_GRP_DIV", A694TBW05_CRF_ITEM_GRP_DIV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW05_CRF_ITEM_GRP_DIV_Internalname, GXutil.rtrim( A694TBW05_CRF_ITEM_GRP_DIV), GXutil.rtrim( localUtil.format( A694TBW05_CRF_ITEM_GRP_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBW05_CRF_ITEM_GRP_DIV_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW05_CRF_ITEM_GRP_DIV_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw05_crf_item_grp_cd_Internalname, "CRF項目・項目グループコード", "", "", lblTextblocktbw05_crf_item_grp_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A695TBW05_CRF_ITEM_GRP_CD", A695TBW05_CRF_ITEM_GRP_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW05_CRF_ITEM_GRP_CD_Internalname, GXutil.rtrim( A695TBW05_CRF_ITEM_GRP_CD), GXutil.rtrim( localUtil.format( A695TBW05_CRF_ITEM_GRP_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBW05_CRF_ITEM_GRP_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW05_CRF_ITEM_GRP_CD_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw05_crf_value_Internalname, "入力値", "", "", lblTextblocktbw05_crf_value_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A696TBW05_CRF_VALUE", A696TBW05_CRF_VALUE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBW05_CRF_VALUE_Internalname, GXutil.rtrim( A696TBW05_CRF_VALUE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", (short)(0), 1, edtTBW05_CRF_VALUE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "2000", -1, "", true, "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw05_edit_flg_Internalname, "変更フラグ", "", "", lblTextblocktbw05_edit_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A697TBW05_EDIT_FLG", A697TBW05_EDIT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW05_EDIT_FLG_Internalname, GXutil.rtrim( A697TBW05_EDIT_FLG), GXutil.rtrim( localUtil.format( A697TBW05_EDIT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBW05_EDIT_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW05_EDIT_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW05_CRF_RESULT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1843e( true) ;
      }
      else
      {
         wb_table4_33_1843e( false) ;
      }
   }

   public void wb_table2_5_1843( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW05_CRF_RESULT.htm");
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
         wb_table2_5_1843e( true) ;
      }
      else
      {
         wb_table2_5_1843e( false) ;
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
      /* Execute user event: e11182 */
      e11182 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A688TBW05_SESSION_ID = httpContext.cgiGet( edtTBW05_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A688TBW05_SESSION_ID", A688TBW05_SESSION_ID);
            A689TBW05_APP_ID = httpContext.cgiGet( edtTBW05_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A689TBW05_APP_ID", A689TBW05_APP_ID);
            A690TBW05_DISP_DATETIME = httpContext.cgiGet( edtTBW05_DISP_DATETIME_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A690TBW05_DISP_DATETIME", A690TBW05_DISP_DATETIME);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW05_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW05_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW05_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW05_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A691TBW05_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
            }
            else
            {
               A691TBW05_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW05_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW05_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW05_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW05_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW05_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A692TBW05_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A692TBW05_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW05_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW05_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW05_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW05_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW05_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A693TBW05_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
            }
            else
            {
               A693TBW05_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW05_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
            }
            A694TBW05_CRF_ITEM_GRP_DIV = httpContext.cgiGet( edtTBW05_CRF_ITEM_GRP_DIV_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A694TBW05_CRF_ITEM_GRP_DIV", A694TBW05_CRF_ITEM_GRP_DIV);
            A695TBW05_CRF_ITEM_GRP_CD = httpContext.cgiGet( edtTBW05_CRF_ITEM_GRP_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A695TBW05_CRF_ITEM_GRP_CD", A695TBW05_CRF_ITEM_GRP_CD);
            A696TBW05_CRF_VALUE = httpContext.cgiGet( edtTBW05_CRF_VALUE_Internalname) ;
            n696TBW05_CRF_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A696TBW05_CRF_VALUE", A696TBW05_CRF_VALUE);
            n696TBW05_CRF_VALUE = ((GXutil.strcmp("", A696TBW05_CRF_VALUE)==0) ? true : false) ;
            A697TBW05_EDIT_FLG = httpContext.cgiGet( edtTBW05_EDIT_FLG_Internalname) ;
            n697TBW05_EDIT_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A697TBW05_EDIT_FLG", A697TBW05_EDIT_FLG);
            n697TBW05_EDIT_FLG = ((GXutil.strcmp("", A697TBW05_EDIT_FLG)==0) ? true : false) ;
            /* Read saved values. */
            Z688TBW05_SESSION_ID = httpContext.cgiGet( "Z688TBW05_SESSION_ID") ;
            Z689TBW05_APP_ID = httpContext.cgiGet( "Z689TBW05_APP_ID") ;
            Z690TBW05_DISP_DATETIME = httpContext.cgiGet( "Z690TBW05_DISP_DATETIME") ;
            Z691TBW05_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z691TBW05_STUDY_ID"), ".", ",") ;
            Z692TBW05_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z692TBW05_SUBJECT_ID"), ".", ",")) ;
            Z693TBW05_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z693TBW05_CRF_ID"), ".", ",")) ;
            Z694TBW05_CRF_ITEM_GRP_DIV = httpContext.cgiGet( "Z694TBW05_CRF_ITEM_GRP_DIV") ;
            Z695TBW05_CRF_ITEM_GRP_CD = httpContext.cgiGet( "Z695TBW05_CRF_ITEM_GRP_CD") ;
            Z696TBW05_CRF_VALUE = httpContext.cgiGet( "Z696TBW05_CRF_VALUE") ;
            n696TBW05_CRF_VALUE = ((GXutil.strcmp("", A696TBW05_CRF_VALUE)==0) ? true : false) ;
            Z697TBW05_EDIT_FLG = httpContext.cgiGet( "Z697TBW05_EDIT_FLG") ;
            n697TBW05_EDIT_FLG = ((GXutil.strcmp("", A697TBW05_EDIT_FLG)==0) ? true : false) ;
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
               A688TBW05_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A688TBW05_SESSION_ID", A688TBW05_SESSION_ID);
               A689TBW05_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A689TBW05_APP_ID", A689TBW05_APP_ID);
               A690TBW05_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A690TBW05_DISP_DATETIME", A690TBW05_DISP_DATETIME);
               A691TBW05_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
               A692TBW05_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
               A693TBW05_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
               A694TBW05_CRF_ITEM_GRP_DIV = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A694TBW05_CRF_ITEM_GRP_DIV", A694TBW05_CRF_ITEM_GRP_DIV);
               A695TBW05_CRF_ITEM_GRP_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A695TBW05_CRF_ITEM_GRP_CD", A695TBW05_CRF_ITEM_GRP_CD);
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
                     /* Execute user event: e11182 */
                     e11182 ();
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
            initAll1843( ) ;
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
      disableAttributes1843( ) ;
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

   public void resetCaption180( )
   {
   }

   public void e11182( )
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

   public void zm1843( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z696TBW05_CRF_VALUE = T00183_A696TBW05_CRF_VALUE[0] ;
            Z697TBW05_EDIT_FLG = T00183_A697TBW05_EDIT_FLG[0] ;
         }
         else
         {
            Z696TBW05_CRF_VALUE = A696TBW05_CRF_VALUE ;
            Z697TBW05_EDIT_FLG = A697TBW05_EDIT_FLG ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z688TBW05_SESSION_ID = A688TBW05_SESSION_ID ;
         Z689TBW05_APP_ID = A689TBW05_APP_ID ;
         Z690TBW05_DISP_DATETIME = A690TBW05_DISP_DATETIME ;
         Z691TBW05_STUDY_ID = A691TBW05_STUDY_ID ;
         Z692TBW05_SUBJECT_ID = A692TBW05_SUBJECT_ID ;
         Z693TBW05_CRF_ID = A693TBW05_CRF_ID ;
         Z694TBW05_CRF_ITEM_GRP_DIV = A694TBW05_CRF_ITEM_GRP_DIV ;
         Z695TBW05_CRF_ITEM_GRP_CD = A695TBW05_CRF_ITEM_GRP_CD ;
         Z696TBW05_CRF_VALUE = A696TBW05_CRF_VALUE ;
         Z697TBW05_EDIT_FLG = A697TBW05_EDIT_FLG ;
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

   public void load1843( )
   {
      /* Using cursor T00184 */
      pr_default.execute(2, new Object[] {A688TBW05_SESSION_ID, A689TBW05_APP_ID, A690TBW05_DISP_DATETIME, new Long(A691TBW05_STUDY_ID), new Integer(A692TBW05_SUBJECT_ID), new Short(A693TBW05_CRF_ID), A694TBW05_CRF_ITEM_GRP_DIV, A695TBW05_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A696TBW05_CRF_VALUE = T00184_A696TBW05_CRF_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A696TBW05_CRF_VALUE", A696TBW05_CRF_VALUE);
         n696TBW05_CRF_VALUE = T00184_n696TBW05_CRF_VALUE[0] ;
         A697TBW05_EDIT_FLG = T00184_A697TBW05_EDIT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A697TBW05_EDIT_FLG", A697TBW05_EDIT_FLG);
         n697TBW05_EDIT_FLG = T00184_n697TBW05_EDIT_FLG[0] ;
         zm1843( -1) ;
      }
      pr_default.close(2);
      onLoadActions1843( ) ;
   }

   public void onLoadActions1843( )
   {
      AV8Pgmname = "TBW05_CRF_RESULT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable1843( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TBW05_CRF_RESULT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void closeExtendedTableCursors1843( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1843( )
   {
      /* Using cursor T00185 */
      pr_default.execute(3, new Object[] {A688TBW05_SESSION_ID, A689TBW05_APP_ID, A690TBW05_DISP_DATETIME, new Long(A691TBW05_STUDY_ID), new Integer(A692TBW05_SUBJECT_ID), new Short(A693TBW05_CRF_ID), A694TBW05_CRF_ITEM_GRP_DIV, A695TBW05_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound43 = (short)(1) ;
      }
      else
      {
         RcdFound43 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00183 */
      pr_default.execute(1, new Object[] {A688TBW05_SESSION_ID, A689TBW05_APP_ID, A690TBW05_DISP_DATETIME, new Long(A691TBW05_STUDY_ID), new Integer(A692TBW05_SUBJECT_ID), new Short(A693TBW05_CRF_ID), A694TBW05_CRF_ITEM_GRP_DIV, A695TBW05_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1843( 1) ;
         RcdFound43 = (short)(1) ;
         A688TBW05_SESSION_ID = T00183_A688TBW05_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688TBW05_SESSION_ID", A688TBW05_SESSION_ID);
         A689TBW05_APP_ID = T00183_A689TBW05_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A689TBW05_APP_ID", A689TBW05_APP_ID);
         A690TBW05_DISP_DATETIME = T00183_A690TBW05_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A690TBW05_DISP_DATETIME", A690TBW05_DISP_DATETIME);
         A691TBW05_STUDY_ID = T00183_A691TBW05_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
         A692TBW05_SUBJECT_ID = T00183_A692TBW05_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
         A693TBW05_CRF_ID = T00183_A693TBW05_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
         A694TBW05_CRF_ITEM_GRP_DIV = T00183_A694TBW05_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A694TBW05_CRF_ITEM_GRP_DIV", A694TBW05_CRF_ITEM_GRP_DIV);
         A695TBW05_CRF_ITEM_GRP_CD = T00183_A695TBW05_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A695TBW05_CRF_ITEM_GRP_CD", A695TBW05_CRF_ITEM_GRP_CD);
         A696TBW05_CRF_VALUE = T00183_A696TBW05_CRF_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A696TBW05_CRF_VALUE", A696TBW05_CRF_VALUE);
         n696TBW05_CRF_VALUE = T00183_n696TBW05_CRF_VALUE[0] ;
         A697TBW05_EDIT_FLG = T00183_A697TBW05_EDIT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A697TBW05_EDIT_FLG", A697TBW05_EDIT_FLG);
         n697TBW05_EDIT_FLG = T00183_n697TBW05_EDIT_FLG[0] ;
         Z688TBW05_SESSION_ID = A688TBW05_SESSION_ID ;
         Z689TBW05_APP_ID = A689TBW05_APP_ID ;
         Z690TBW05_DISP_DATETIME = A690TBW05_DISP_DATETIME ;
         Z691TBW05_STUDY_ID = A691TBW05_STUDY_ID ;
         Z692TBW05_SUBJECT_ID = A692TBW05_SUBJECT_ID ;
         Z693TBW05_CRF_ID = A693TBW05_CRF_ID ;
         Z694TBW05_CRF_ITEM_GRP_DIV = A694TBW05_CRF_ITEM_GRP_DIV ;
         Z695TBW05_CRF_ITEM_GRP_CD = A695TBW05_CRF_ITEM_GRP_CD ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1843( ) ;
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound43 = (short)(0) ;
         initializeNonKey1843( ) ;
         sMode43 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode43 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1843( ) ;
      if ( RcdFound43 == 0 )
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
      RcdFound43 = (short)(0) ;
      /* Using cursor T00186 */
      pr_default.execute(4, new Object[] {A688TBW05_SESSION_ID, A688TBW05_SESSION_ID, A689TBW05_APP_ID, A689TBW05_APP_ID, A688TBW05_SESSION_ID, A690TBW05_DISP_DATETIME, A690TBW05_DISP_DATETIME, A689TBW05_APP_ID, A688TBW05_SESSION_ID, new Long(A691TBW05_STUDY_ID), new Long(A691TBW05_STUDY_ID), A690TBW05_DISP_DATETIME, A689TBW05_APP_ID, A688TBW05_SESSION_ID, new Integer(A692TBW05_SUBJECT_ID), new Integer(A692TBW05_SUBJECT_ID), new Long(A691TBW05_STUDY_ID), A690TBW05_DISP_DATETIME, A689TBW05_APP_ID, A688TBW05_SESSION_ID, new Short(A693TBW05_CRF_ID), new Short(A693TBW05_CRF_ID), new Integer(A692TBW05_SUBJECT_ID), new Long(A691TBW05_STUDY_ID), A690TBW05_DISP_DATETIME, A689TBW05_APP_ID, A688TBW05_SESSION_ID, A694TBW05_CRF_ITEM_GRP_DIV, A694TBW05_CRF_ITEM_GRP_DIV, new Short(A693TBW05_CRF_ID), new Integer(A692TBW05_SUBJECT_ID), new Long(A691TBW05_STUDY_ID), A690TBW05_DISP_DATETIME, A689TBW05_APP_ID, A688TBW05_SESSION_ID, A695TBW05_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) < 0 ) || ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) < 0 ) || ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00186_A691TBW05_STUDY_ID[0] < A691TBW05_STUDY_ID ) || ( T00186_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00186_A692TBW05_SUBJECT_ID[0] < A692TBW05_SUBJECT_ID ) || ( T00186_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00186_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00186_A693TBW05_CRF_ID[0] < A693TBW05_CRF_ID ) || ( T00186_A693TBW05_CRF_ID[0] == A693TBW05_CRF_ID ) && ( T00186_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00186_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00186_A694TBW05_CRF_ITEM_GRP_DIV[0], A694TBW05_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T00186_A694TBW05_CRF_ITEM_GRP_DIV[0], A694TBW05_CRF_ITEM_GRP_DIV) == 0 ) && ( T00186_A693TBW05_CRF_ID[0] == A693TBW05_CRF_ID ) && ( T00186_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00186_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00186_A695TBW05_CRF_ITEM_GRP_CD[0], A695TBW05_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) > 0 ) || ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) > 0 ) || ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00186_A691TBW05_STUDY_ID[0] > A691TBW05_STUDY_ID ) || ( T00186_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00186_A692TBW05_SUBJECT_ID[0] > A692TBW05_SUBJECT_ID ) || ( T00186_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00186_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00186_A693TBW05_CRF_ID[0] > A693TBW05_CRF_ID ) || ( T00186_A693TBW05_CRF_ID[0] == A693TBW05_CRF_ID ) && ( T00186_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00186_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00186_A694TBW05_CRF_ITEM_GRP_DIV[0], A694TBW05_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T00186_A694TBW05_CRF_ITEM_GRP_DIV[0], A694TBW05_CRF_ITEM_GRP_DIV) == 0 ) && ( T00186_A693TBW05_CRF_ID[0] == A693TBW05_CRF_ID ) && ( T00186_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00186_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00186_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00186_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00186_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00186_A695TBW05_CRF_ITEM_GRP_CD[0], A695TBW05_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            A688TBW05_SESSION_ID = T00186_A688TBW05_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A688TBW05_SESSION_ID", A688TBW05_SESSION_ID);
            A689TBW05_APP_ID = T00186_A689TBW05_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A689TBW05_APP_ID", A689TBW05_APP_ID);
            A690TBW05_DISP_DATETIME = T00186_A690TBW05_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A690TBW05_DISP_DATETIME", A690TBW05_DISP_DATETIME);
            A691TBW05_STUDY_ID = T00186_A691TBW05_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
            A692TBW05_SUBJECT_ID = T00186_A692TBW05_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
            A693TBW05_CRF_ID = T00186_A693TBW05_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
            A694TBW05_CRF_ITEM_GRP_DIV = T00186_A694TBW05_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A694TBW05_CRF_ITEM_GRP_DIV", A694TBW05_CRF_ITEM_GRP_DIV);
            A695TBW05_CRF_ITEM_GRP_CD = T00186_A695TBW05_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A695TBW05_CRF_ITEM_GRP_CD", A695TBW05_CRF_ITEM_GRP_CD);
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound43 = (short)(0) ;
      /* Using cursor T00187 */
      pr_default.execute(5, new Object[] {A688TBW05_SESSION_ID, A688TBW05_SESSION_ID, A689TBW05_APP_ID, A689TBW05_APP_ID, A688TBW05_SESSION_ID, A690TBW05_DISP_DATETIME, A690TBW05_DISP_DATETIME, A689TBW05_APP_ID, A688TBW05_SESSION_ID, new Long(A691TBW05_STUDY_ID), new Long(A691TBW05_STUDY_ID), A690TBW05_DISP_DATETIME, A689TBW05_APP_ID, A688TBW05_SESSION_ID, new Integer(A692TBW05_SUBJECT_ID), new Integer(A692TBW05_SUBJECT_ID), new Long(A691TBW05_STUDY_ID), A690TBW05_DISP_DATETIME, A689TBW05_APP_ID, A688TBW05_SESSION_ID, new Short(A693TBW05_CRF_ID), new Short(A693TBW05_CRF_ID), new Integer(A692TBW05_SUBJECT_ID), new Long(A691TBW05_STUDY_ID), A690TBW05_DISP_DATETIME, A689TBW05_APP_ID, A688TBW05_SESSION_ID, A694TBW05_CRF_ITEM_GRP_DIV, A694TBW05_CRF_ITEM_GRP_DIV, new Short(A693TBW05_CRF_ID), new Integer(A692TBW05_SUBJECT_ID), new Long(A691TBW05_STUDY_ID), A690TBW05_DISP_DATETIME, A689TBW05_APP_ID, A688TBW05_SESSION_ID, A695TBW05_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) > 0 ) || ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) > 0 ) || ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00187_A691TBW05_STUDY_ID[0] > A691TBW05_STUDY_ID ) || ( T00187_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00187_A692TBW05_SUBJECT_ID[0] > A692TBW05_SUBJECT_ID ) || ( T00187_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00187_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00187_A693TBW05_CRF_ID[0] > A693TBW05_CRF_ID ) || ( T00187_A693TBW05_CRF_ID[0] == A693TBW05_CRF_ID ) && ( T00187_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00187_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00187_A694TBW05_CRF_ITEM_GRP_DIV[0], A694TBW05_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T00187_A694TBW05_CRF_ITEM_GRP_DIV[0], A694TBW05_CRF_ITEM_GRP_DIV) == 0 ) && ( T00187_A693TBW05_CRF_ID[0] == A693TBW05_CRF_ID ) && ( T00187_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00187_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00187_A695TBW05_CRF_ITEM_GRP_CD[0], A695TBW05_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) < 0 ) || ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) < 0 ) || ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00187_A691TBW05_STUDY_ID[0] < A691TBW05_STUDY_ID ) || ( T00187_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00187_A692TBW05_SUBJECT_ID[0] < A692TBW05_SUBJECT_ID ) || ( T00187_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00187_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( T00187_A693TBW05_CRF_ID[0] < A693TBW05_CRF_ID ) || ( T00187_A693TBW05_CRF_ID[0] == A693TBW05_CRF_ID ) && ( T00187_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00187_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00187_A694TBW05_CRF_ITEM_GRP_DIV[0], A694TBW05_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T00187_A694TBW05_CRF_ITEM_GRP_DIV[0], A694TBW05_CRF_ITEM_GRP_DIV) == 0 ) && ( T00187_A693TBW05_CRF_ID[0] == A693TBW05_CRF_ID ) && ( T00187_A692TBW05_SUBJECT_ID[0] == A692TBW05_SUBJECT_ID ) && ( T00187_A691TBW05_STUDY_ID[0] == A691TBW05_STUDY_ID ) && ( GXutil.strcmp(T00187_A690TBW05_DISP_DATETIME[0], A690TBW05_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T00187_A689TBW05_APP_ID[0], A689TBW05_APP_ID) == 0 ) && ( GXutil.strcmp(T00187_A688TBW05_SESSION_ID[0], A688TBW05_SESSION_ID) == 0 ) && ( GXutil.strcmp(T00187_A695TBW05_CRF_ITEM_GRP_CD[0], A695TBW05_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            A688TBW05_SESSION_ID = T00187_A688TBW05_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A688TBW05_SESSION_ID", A688TBW05_SESSION_ID);
            A689TBW05_APP_ID = T00187_A689TBW05_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A689TBW05_APP_ID", A689TBW05_APP_ID);
            A690TBW05_DISP_DATETIME = T00187_A690TBW05_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A690TBW05_DISP_DATETIME", A690TBW05_DISP_DATETIME);
            A691TBW05_STUDY_ID = T00187_A691TBW05_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
            A692TBW05_SUBJECT_ID = T00187_A692TBW05_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
            A693TBW05_CRF_ID = T00187_A693TBW05_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
            A694TBW05_CRF_ITEM_GRP_DIV = T00187_A694TBW05_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A694TBW05_CRF_ITEM_GRP_DIV", A694TBW05_CRF_ITEM_GRP_DIV);
            A695TBW05_CRF_ITEM_GRP_CD = T00187_A695TBW05_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A695TBW05_CRF_ITEM_GRP_CD", A695TBW05_CRF_ITEM_GRP_CD);
            RcdFound43 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1843( ) ;
      if ( RcdFound43 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBW05_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW05_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A688TBW05_SESSION_ID, Z688TBW05_SESSION_ID) != 0 ) || ( GXutil.strcmp(A689TBW05_APP_ID, Z689TBW05_APP_ID) != 0 ) || ( GXutil.strcmp(A690TBW05_DISP_DATETIME, Z690TBW05_DISP_DATETIME) != 0 ) || ( A691TBW05_STUDY_ID != Z691TBW05_STUDY_ID ) || ( A692TBW05_SUBJECT_ID != Z692TBW05_SUBJECT_ID ) || ( A693TBW05_CRF_ID != Z693TBW05_CRF_ID ) || ( GXutil.strcmp(A694TBW05_CRF_ITEM_GRP_DIV, Z694TBW05_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A695TBW05_CRF_ITEM_GRP_CD, Z695TBW05_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A688TBW05_SESSION_ID = Z688TBW05_SESSION_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A688TBW05_SESSION_ID", A688TBW05_SESSION_ID);
            A689TBW05_APP_ID = Z689TBW05_APP_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A689TBW05_APP_ID", A689TBW05_APP_ID);
            A690TBW05_DISP_DATETIME = Z690TBW05_DISP_DATETIME ;
            httpContext.ajax_rsp_assign_attri("", false, "A690TBW05_DISP_DATETIME", A690TBW05_DISP_DATETIME);
            A691TBW05_STUDY_ID = Z691TBW05_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
            A692TBW05_SUBJECT_ID = Z692TBW05_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
            A693TBW05_CRF_ID = Z693TBW05_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
            A694TBW05_CRF_ITEM_GRP_DIV = Z694TBW05_CRF_ITEM_GRP_DIV ;
            httpContext.ajax_rsp_assign_attri("", false, "A694TBW05_CRF_ITEM_GRP_DIV", A694TBW05_CRF_ITEM_GRP_DIV);
            A695TBW05_CRF_ITEM_GRP_CD = Z695TBW05_CRF_ITEM_GRP_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A695TBW05_CRF_ITEM_GRP_CD", A695TBW05_CRF_ITEM_GRP_CD);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW05_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW05_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBW05_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update1843( ) ;
            GX_FocusControl = edtTBW05_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A688TBW05_SESSION_ID, Z688TBW05_SESSION_ID) != 0 ) || ( GXutil.strcmp(A689TBW05_APP_ID, Z689TBW05_APP_ID) != 0 ) || ( GXutil.strcmp(A690TBW05_DISP_DATETIME, Z690TBW05_DISP_DATETIME) != 0 ) || ( A691TBW05_STUDY_ID != Z691TBW05_STUDY_ID ) || ( A692TBW05_SUBJECT_ID != Z692TBW05_SUBJECT_ID ) || ( A693TBW05_CRF_ID != Z693TBW05_CRF_ID ) || ( GXutil.strcmp(A694TBW05_CRF_ITEM_GRP_DIV, Z694TBW05_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A695TBW05_CRF_ITEM_GRP_CD, Z695TBW05_CRF_ITEM_GRP_CD) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBW05_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert1843( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW05_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW05_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW05_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1843( ) ;
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
      if ( ( GXutil.strcmp(A688TBW05_SESSION_ID, Z688TBW05_SESSION_ID) != 0 ) || ( GXutil.strcmp(A689TBW05_APP_ID, Z689TBW05_APP_ID) != 0 ) || ( GXutil.strcmp(A690TBW05_DISP_DATETIME, Z690TBW05_DISP_DATETIME) != 0 ) || ( A691TBW05_STUDY_ID != Z691TBW05_STUDY_ID ) || ( A692TBW05_SUBJECT_ID != Z692TBW05_SUBJECT_ID ) || ( A693TBW05_CRF_ID != Z693TBW05_CRF_ID ) || ( GXutil.strcmp(A694TBW05_CRF_ITEM_GRP_DIV, Z694TBW05_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A695TBW05_CRF_ITEM_GRP_CD, Z695TBW05_CRF_ITEM_GRP_CD) != 0 ) )
      {
         A688TBW05_SESSION_ID = Z688TBW05_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A688TBW05_SESSION_ID", A688TBW05_SESSION_ID);
         A689TBW05_APP_ID = Z689TBW05_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A689TBW05_APP_ID", A689TBW05_APP_ID);
         A690TBW05_DISP_DATETIME = Z690TBW05_DISP_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A690TBW05_DISP_DATETIME", A690TBW05_DISP_DATETIME);
         A691TBW05_STUDY_ID = Z691TBW05_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
         A692TBW05_SUBJECT_ID = Z692TBW05_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
         A693TBW05_CRF_ID = Z693TBW05_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
         A694TBW05_CRF_ITEM_GRP_DIV = Z694TBW05_CRF_ITEM_GRP_DIV ;
         httpContext.ajax_rsp_assign_attri("", false, "A694TBW05_CRF_ITEM_GRP_DIV", A694TBW05_CRF_ITEM_GRP_DIV);
         A695TBW05_CRF_ITEM_GRP_CD = Z695TBW05_CRF_ITEM_GRP_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A695TBW05_CRF_ITEM_GRP_CD", A695TBW05_CRF_ITEM_GRP_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW05_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW05_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW05_SESSION_ID_Internalname ;
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
      if ( RcdFound43 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW05_SESSION_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBW05_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1843( ) ;
      if ( RcdFound43 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW05_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1843( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound43 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW05_CRF_VALUE_Internalname ;
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
      if ( RcdFound43 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW05_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1843( ) ;
      if ( RcdFound43 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound43 != 0 )
         {
            scanNext1843( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW05_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1843( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1843( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00182 */
         pr_default.execute(0, new Object[] {A688TBW05_SESSION_ID, A689TBW05_APP_ID, A690TBW05_DISP_DATETIME, new Long(A691TBW05_STUDY_ID), new Integer(A692TBW05_SUBJECT_ID), new Short(A693TBW05_CRF_ID), A694TBW05_CRF_ITEM_GRP_DIV, A695TBW05_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW05_CRF_RESULT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z696TBW05_CRF_VALUE, T00182_A696TBW05_CRF_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z697TBW05_EDIT_FLG, T00182_A697TBW05_EDIT_FLG[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW05_CRF_RESULT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1843( )
   {
      beforeValidate1843( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1843( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1843( 0) ;
         checkOptimisticConcurrency1843( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1843( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1843( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00188 */
                  pr_default.execute(6, new Object[] {A688TBW05_SESSION_ID, A689TBW05_APP_ID, A690TBW05_DISP_DATETIME, new Long(A691TBW05_STUDY_ID), new Integer(A692TBW05_SUBJECT_ID), new Short(A693TBW05_CRF_ID), A694TBW05_CRF_ITEM_GRP_DIV, A695TBW05_CRF_ITEM_GRP_CD, new Boolean(n696TBW05_CRF_VALUE), A696TBW05_CRF_VALUE, new Boolean(n697TBW05_EDIT_FLG), A697TBW05_EDIT_FLG});
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
                        resetCaption180( ) ;
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
            load1843( ) ;
         }
         endLevel1843( ) ;
      }
      closeExtendedTableCursors1843( ) ;
   }

   public void update1843( )
   {
      beforeValidate1843( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1843( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1843( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1843( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1843( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00189 */
                  pr_default.execute(7, new Object[] {new Boolean(n696TBW05_CRF_VALUE), A696TBW05_CRF_VALUE, new Boolean(n697TBW05_EDIT_FLG), A697TBW05_EDIT_FLG, A688TBW05_SESSION_ID, A689TBW05_APP_ID, A690TBW05_DISP_DATETIME, new Long(A691TBW05_STUDY_ID), new Integer(A692TBW05_SUBJECT_ID), new Short(A693TBW05_CRF_ID), A694TBW05_CRF_ITEM_GRP_DIV, A695TBW05_CRF_ITEM_GRP_CD});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW05_CRF_RESULT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1843( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption180( ) ;
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
         endLevel1843( ) ;
      }
      closeExtendedTableCursors1843( ) ;
   }

   public void deferredUpdate1843( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1843( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1843( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1843( ) ;
         afterConfirm1843( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1843( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001810 */
               pr_default.execute(8, new Object[] {A688TBW05_SESSION_ID, A689TBW05_APP_ID, A690TBW05_DISP_DATETIME, new Long(A691TBW05_STUDY_ID), new Integer(A692TBW05_SUBJECT_ID), new Short(A693TBW05_CRF_ID), A694TBW05_CRF_ITEM_GRP_DIV, A695TBW05_CRF_ITEM_GRP_CD});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound43 == 0 )
                     {
                        initAll1843( ) ;
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
                     resetCaption180( ) ;
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
      sMode43 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1843( ) ;
      Gx_mode = sMode43 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1843( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW05_CRF_RESULT" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      }
   }

   public void endLevel1843( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1843( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw05_crf_result");
         if ( AnyError == 0 )
         {
            confirmValues180( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw05_crf_result");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1843( )
   {
      /* Using cursor T001811 */
      pr_default.execute(9);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A688TBW05_SESSION_ID = T001811_A688TBW05_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688TBW05_SESSION_ID", A688TBW05_SESSION_ID);
         A689TBW05_APP_ID = T001811_A689TBW05_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A689TBW05_APP_ID", A689TBW05_APP_ID);
         A690TBW05_DISP_DATETIME = T001811_A690TBW05_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A690TBW05_DISP_DATETIME", A690TBW05_DISP_DATETIME);
         A691TBW05_STUDY_ID = T001811_A691TBW05_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
         A692TBW05_SUBJECT_ID = T001811_A692TBW05_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
         A693TBW05_CRF_ID = T001811_A693TBW05_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
         A694TBW05_CRF_ITEM_GRP_DIV = T001811_A694TBW05_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A694TBW05_CRF_ITEM_GRP_DIV", A694TBW05_CRF_ITEM_GRP_DIV);
         A695TBW05_CRF_ITEM_GRP_CD = T001811_A695TBW05_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A695TBW05_CRF_ITEM_GRP_CD", A695TBW05_CRF_ITEM_GRP_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1843( )
   {
      pr_default.readNext(9);
      RcdFound43 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound43 = (short)(1) ;
         A688TBW05_SESSION_ID = T001811_A688TBW05_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A688TBW05_SESSION_ID", A688TBW05_SESSION_ID);
         A689TBW05_APP_ID = T001811_A689TBW05_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A689TBW05_APP_ID", A689TBW05_APP_ID);
         A690TBW05_DISP_DATETIME = T001811_A690TBW05_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A690TBW05_DISP_DATETIME", A690TBW05_DISP_DATETIME);
         A691TBW05_STUDY_ID = T001811_A691TBW05_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
         A692TBW05_SUBJECT_ID = T001811_A692TBW05_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
         A693TBW05_CRF_ID = T001811_A693TBW05_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
         A694TBW05_CRF_ITEM_GRP_DIV = T001811_A694TBW05_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A694TBW05_CRF_ITEM_GRP_DIV", A694TBW05_CRF_ITEM_GRP_DIV);
         A695TBW05_CRF_ITEM_GRP_CD = T001811_A695TBW05_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A695TBW05_CRF_ITEM_GRP_CD", A695TBW05_CRF_ITEM_GRP_CD);
      }
   }

   public void scanEnd1843( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1843( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1843( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1843( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1843( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1843( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1843( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1843( )
   {
      edtTBW05_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW05_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW05_SESSION_ID_Enabled, 5, 0)));
      edtTBW05_APP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW05_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW05_APP_ID_Enabled, 5, 0)));
      edtTBW05_DISP_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW05_DISP_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW05_DISP_DATETIME_Enabled, 5, 0)));
      edtTBW05_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW05_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW05_STUDY_ID_Enabled, 5, 0)));
      edtTBW05_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW05_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW05_SUBJECT_ID_Enabled, 5, 0)));
      edtTBW05_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW05_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW05_CRF_ID_Enabled, 5, 0)));
      edtTBW05_CRF_ITEM_GRP_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW05_CRF_ITEM_GRP_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW05_CRF_ITEM_GRP_DIV_Enabled, 5, 0)));
      edtTBW05_CRF_ITEM_GRP_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW05_CRF_ITEM_GRP_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW05_CRF_ITEM_GRP_CD_Enabled, 5, 0)));
      edtTBW05_CRF_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW05_CRF_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW05_CRF_VALUE_Enabled, 5, 0)));
      edtTBW05_EDIT_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW05_EDIT_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW05_EDIT_FLG_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues180( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRF入力結果テーブルワーク") ;
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
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      httpContext.writeText( " "+"class=\"Form\""+" "+" style=\"-moz-opacity:0;opacity:0;") ;
      httpContext.writeText( "\""+FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbw05_crf_result") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1843( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z688TBW05_SESSION_ID", GXutil.rtrim( Z688TBW05_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z689TBW05_APP_ID", GXutil.rtrim( Z689TBW05_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z690TBW05_DISP_DATETIME", GXutil.rtrim( Z690TBW05_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "Z691TBW05_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z691TBW05_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z692TBW05_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z692TBW05_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z693TBW05_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z693TBW05_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z694TBW05_CRF_ITEM_GRP_DIV", GXutil.rtrim( Z694TBW05_CRF_ITEM_GRP_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z695TBW05_CRF_ITEM_GRP_CD", GXutil.rtrim( Z695TBW05_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z696TBW05_CRF_VALUE", GXutil.rtrim( Z696TBW05_CRF_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z697TBW05_EDIT_FLG", GXutil.rtrim( Z697TBW05_EDIT_FLG));
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

   public void initializeNonKey1843( )
   {
      A696TBW05_CRF_VALUE = "" ;
      n696TBW05_CRF_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A696TBW05_CRF_VALUE", A696TBW05_CRF_VALUE);
      n696TBW05_CRF_VALUE = ((GXutil.strcmp("", A696TBW05_CRF_VALUE)==0) ? true : false) ;
      A697TBW05_EDIT_FLG = "" ;
      n697TBW05_EDIT_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A697TBW05_EDIT_FLG", A697TBW05_EDIT_FLG);
      n697TBW05_EDIT_FLG = ((GXutil.strcmp("", A697TBW05_EDIT_FLG)==0) ? true : false) ;
   }

   public void initAll1843( )
   {
      A688TBW05_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A688TBW05_SESSION_ID", A688TBW05_SESSION_ID);
      A689TBW05_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A689TBW05_APP_ID", A689TBW05_APP_ID);
      A690TBW05_DISP_DATETIME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A690TBW05_DISP_DATETIME", A690TBW05_DISP_DATETIME);
      A691TBW05_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A691TBW05_STUDY_ID", GXutil.ltrim( GXutil.str( A691TBW05_STUDY_ID, 10, 0)));
      A692TBW05_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A692TBW05_SUBJECT_ID", GXutil.ltrim( GXutil.str( A692TBW05_SUBJECT_ID, 6, 0)));
      A693TBW05_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A693TBW05_CRF_ID", GXutil.ltrim( GXutil.str( A693TBW05_CRF_ID, 4, 0)));
      A694TBW05_CRF_ITEM_GRP_DIV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A694TBW05_CRF_ITEM_GRP_DIV", A694TBW05_CRF_ITEM_GRP_DIV);
      A695TBW05_CRF_ITEM_GRP_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A695TBW05_CRF_ITEM_GRP_CD", A695TBW05_CRF_ITEM_GRP_CD);
      initializeNonKey1843( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", "Style2.css", "?14454892");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1457632");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbw05_crf_result.js", "?1457632");
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
      lblTextblocktbw05_session_id_Internalname = "TEXTBLOCKTBW05_SESSION_ID" ;
      edtTBW05_SESSION_ID_Internalname = "TBW05_SESSION_ID" ;
      lblTextblocktbw05_app_id_Internalname = "TEXTBLOCKTBW05_APP_ID" ;
      edtTBW05_APP_ID_Internalname = "TBW05_APP_ID" ;
      lblTextblocktbw05_disp_datetime_Internalname = "TEXTBLOCKTBW05_DISP_DATETIME" ;
      edtTBW05_DISP_DATETIME_Internalname = "TBW05_DISP_DATETIME" ;
      lblTextblocktbw05_study_id_Internalname = "TEXTBLOCKTBW05_STUDY_ID" ;
      edtTBW05_STUDY_ID_Internalname = "TBW05_STUDY_ID" ;
      lblTextblocktbw05_subject_id_Internalname = "TEXTBLOCKTBW05_SUBJECT_ID" ;
      edtTBW05_SUBJECT_ID_Internalname = "TBW05_SUBJECT_ID" ;
      lblTextblocktbw05_crf_id_Internalname = "TEXTBLOCKTBW05_CRF_ID" ;
      edtTBW05_CRF_ID_Internalname = "TBW05_CRF_ID" ;
      lblTextblocktbw05_crf_item_grp_div_Internalname = "TEXTBLOCKTBW05_CRF_ITEM_GRP_DIV" ;
      edtTBW05_CRF_ITEM_GRP_DIV_Internalname = "TBW05_CRF_ITEM_GRP_DIV" ;
      lblTextblocktbw05_crf_item_grp_cd_Internalname = "TEXTBLOCKTBW05_CRF_ITEM_GRP_CD" ;
      edtTBW05_CRF_ITEM_GRP_CD_Internalname = "TBW05_CRF_ITEM_GRP_CD" ;
      lblTextblocktbw05_crf_value_Internalname = "TEXTBLOCKTBW05_CRF_VALUE" ;
      edtTBW05_CRF_VALUE_Internalname = "TBW05_CRF_VALUE" ;
      lblTextblocktbw05_edit_flg_Internalname = "TEXTBLOCKTBW05_EDIT_FLG" ;
      edtTBW05_EDIT_FLG_Internalname = "TBW05_EDIT_FLG" ;
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
      edtTBW05_EDIT_FLG_Jsonclick = "" ;
      edtTBW05_EDIT_FLG_Enabled = 1 ;
      edtTBW05_CRF_VALUE_Enabled = 1 ;
      edtTBW05_CRF_ITEM_GRP_CD_Jsonclick = "" ;
      edtTBW05_CRF_ITEM_GRP_CD_Enabled = 1 ;
      edtTBW05_CRF_ITEM_GRP_DIV_Jsonclick = "" ;
      edtTBW05_CRF_ITEM_GRP_DIV_Enabled = 1 ;
      edtTBW05_CRF_ID_Jsonclick = "" ;
      edtTBW05_CRF_ID_Enabled = 1 ;
      edtTBW05_SUBJECT_ID_Jsonclick = "" ;
      edtTBW05_SUBJECT_ID_Enabled = 1 ;
      edtTBW05_STUDY_ID_Jsonclick = "" ;
      edtTBW05_STUDY_ID_Enabled = 1 ;
      edtTBW05_DISP_DATETIME_Jsonclick = "" ;
      edtTBW05_DISP_DATETIME_Enabled = 1 ;
      edtTBW05_APP_ID_Jsonclick = "" ;
      edtTBW05_APP_ID_Enabled = 1 ;
      edtTBW05_SESSION_ID_Jsonclick = "" ;
      edtTBW05_SESSION_ID_Enabled = 1 ;
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
      GX_FocusControl = edtTBW05_CRF_VALUE_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw05_crf_item_grp_cd( String GX_Parm1 ,
                                            String GX_Parm2 ,
                                            String GX_Parm3 ,
                                            long GX_Parm4 ,
                                            int GX_Parm5 ,
                                            short GX_Parm6 ,
                                            String GX_Parm7 ,
                                            String GX_Parm8 ,
                                            String GX_Parm9 ,
                                            String GX_Parm10 )
   {
      A688TBW05_SESSION_ID = GX_Parm1 ;
      A689TBW05_APP_ID = GX_Parm2 ;
      A690TBW05_DISP_DATETIME = GX_Parm3 ;
      A691TBW05_STUDY_ID = GX_Parm4 ;
      A692TBW05_SUBJECT_ID = GX_Parm5 ;
      A693TBW05_CRF_ID = GX_Parm6 ;
      A694TBW05_CRF_ITEM_GRP_DIV = GX_Parm7 ;
      A695TBW05_CRF_ITEM_GRP_CD = GX_Parm8 ;
      A696TBW05_CRF_VALUE = GX_Parm9 ;
      n696TBW05_CRF_VALUE = false ;
      A697TBW05_EDIT_FLG = GX_Parm10 ;
      n697TBW05_EDIT_FLG = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.rtrim( A696TBW05_CRF_VALUE));
      isValidOutput.add(GXutil.rtrim( A697TBW05_EDIT_FLG));
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z688TBW05_SESSION_ID));
      isValidOutput.add(GXutil.rtrim( Z689TBW05_APP_ID));
      isValidOutput.add(GXutil.rtrim( Z690TBW05_DISP_DATETIME));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z691TBW05_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z692TBW05_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z693TBW05_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z694TBW05_CRF_ITEM_GRP_DIV));
      isValidOutput.add(GXutil.rtrim( Z695TBW05_CRF_ITEM_GRP_CD));
      isValidOutput.add(GXutil.rtrim( Z696TBW05_CRF_VALUE));
      isValidOutput.add(GXutil.rtrim( Z697TBW05_EDIT_FLG));
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
      lblTextblocktbw05_session_id_Jsonclick = "" ;
      A688TBW05_SESSION_ID = "" ;
      lblTextblocktbw05_app_id_Jsonclick = "" ;
      A689TBW05_APP_ID = "" ;
      lblTextblocktbw05_disp_datetime_Jsonclick = "" ;
      A690TBW05_DISP_DATETIME = "" ;
      lblTextblocktbw05_study_id_Jsonclick = "" ;
      lblTextblocktbw05_subject_id_Jsonclick = "" ;
      lblTextblocktbw05_crf_id_Jsonclick = "" ;
      lblTextblocktbw05_crf_item_grp_div_Jsonclick = "" ;
      A694TBW05_CRF_ITEM_GRP_DIV = "" ;
      lblTextblocktbw05_crf_item_grp_cd_Jsonclick = "" ;
      A695TBW05_CRF_ITEM_GRP_CD = "" ;
      lblTextblocktbw05_crf_value_Jsonclick = "" ;
      A696TBW05_CRF_VALUE = "" ;
      lblTextblocktbw05_edit_flg_Jsonclick = "" ;
      A697TBW05_EDIT_FLG = "" ;
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
      Z688TBW05_SESSION_ID = "" ;
      Z689TBW05_APP_ID = "" ;
      Z690TBW05_DISP_DATETIME = "" ;
      Z694TBW05_CRF_ITEM_GRP_DIV = "" ;
      Z695TBW05_CRF_ITEM_GRP_CD = "" ;
      Z696TBW05_CRF_VALUE = "" ;
      Z697TBW05_EDIT_FLG = "" ;
      Gx_mode = "" ;
      AV8Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T00184_A688TBW05_SESSION_ID = new String[] {""} ;
      T00184_A689TBW05_APP_ID = new String[] {""} ;
      T00184_A690TBW05_DISP_DATETIME = new String[] {""} ;
      T00184_A691TBW05_STUDY_ID = new long[1] ;
      T00184_A692TBW05_SUBJECT_ID = new int[1] ;
      T00184_A693TBW05_CRF_ID = new short[1] ;
      T00184_A694TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00184_A695TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00184_A696TBW05_CRF_VALUE = new String[] {""} ;
      T00184_n696TBW05_CRF_VALUE = new boolean[] {false} ;
      T00184_A697TBW05_EDIT_FLG = new String[] {""} ;
      T00184_n697TBW05_EDIT_FLG = new boolean[] {false} ;
      T00185_A688TBW05_SESSION_ID = new String[] {""} ;
      T00185_A689TBW05_APP_ID = new String[] {""} ;
      T00185_A690TBW05_DISP_DATETIME = new String[] {""} ;
      T00185_A691TBW05_STUDY_ID = new long[1] ;
      T00185_A692TBW05_SUBJECT_ID = new int[1] ;
      T00185_A693TBW05_CRF_ID = new short[1] ;
      T00185_A694TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00185_A695TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00183_A688TBW05_SESSION_ID = new String[] {""} ;
      T00183_A689TBW05_APP_ID = new String[] {""} ;
      T00183_A690TBW05_DISP_DATETIME = new String[] {""} ;
      T00183_A691TBW05_STUDY_ID = new long[1] ;
      T00183_A692TBW05_SUBJECT_ID = new int[1] ;
      T00183_A693TBW05_CRF_ID = new short[1] ;
      T00183_A694TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00183_A695TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00183_A696TBW05_CRF_VALUE = new String[] {""} ;
      T00183_n696TBW05_CRF_VALUE = new boolean[] {false} ;
      T00183_A697TBW05_EDIT_FLG = new String[] {""} ;
      T00183_n697TBW05_EDIT_FLG = new boolean[] {false} ;
      sMode43 = "" ;
      T00186_A688TBW05_SESSION_ID = new String[] {""} ;
      T00186_A689TBW05_APP_ID = new String[] {""} ;
      T00186_A690TBW05_DISP_DATETIME = new String[] {""} ;
      T00186_A691TBW05_STUDY_ID = new long[1] ;
      T00186_A692TBW05_SUBJECT_ID = new int[1] ;
      T00186_A693TBW05_CRF_ID = new short[1] ;
      T00186_A694TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00186_A695TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00187_A688TBW05_SESSION_ID = new String[] {""} ;
      T00187_A689TBW05_APP_ID = new String[] {""} ;
      T00187_A690TBW05_DISP_DATETIME = new String[] {""} ;
      T00187_A691TBW05_STUDY_ID = new long[1] ;
      T00187_A692TBW05_SUBJECT_ID = new int[1] ;
      T00187_A693TBW05_CRF_ID = new short[1] ;
      T00187_A694TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00187_A695TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00182_A688TBW05_SESSION_ID = new String[] {""} ;
      T00182_A689TBW05_APP_ID = new String[] {""} ;
      T00182_A690TBW05_DISP_DATETIME = new String[] {""} ;
      T00182_A691TBW05_STUDY_ID = new long[1] ;
      T00182_A692TBW05_SUBJECT_ID = new int[1] ;
      T00182_A693TBW05_CRF_ID = new short[1] ;
      T00182_A694TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T00182_A695TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      T00182_A696TBW05_CRF_VALUE = new String[] {""} ;
      T00182_n696TBW05_CRF_VALUE = new boolean[] {false} ;
      T00182_A697TBW05_EDIT_FLG = new String[] {""} ;
      T00182_n697TBW05_EDIT_FLG = new boolean[] {false} ;
      T001811_A688TBW05_SESSION_ID = new String[] {""} ;
      T001811_A689TBW05_APP_ID = new String[] {""} ;
      T001811_A690TBW05_DISP_DATETIME = new String[] {""} ;
      T001811_A691TBW05_STUDY_ID = new long[1] ;
      T001811_A692TBW05_SUBJECT_ID = new int[1] ;
      T001811_A693TBW05_CRF_ID = new short[1] ;
      T001811_A694TBW05_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T001811_A695TBW05_CRF_ITEM_GRP_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXt_char3 = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw05_crf_result__default(),
         new Object[] {
             new Object[] {
            T00182_A688TBW05_SESSION_ID, T00182_A689TBW05_APP_ID, T00182_A690TBW05_DISP_DATETIME, T00182_A691TBW05_STUDY_ID, T00182_A692TBW05_SUBJECT_ID, T00182_A693TBW05_CRF_ID, T00182_A694TBW05_CRF_ITEM_GRP_DIV, T00182_A695TBW05_CRF_ITEM_GRP_CD, T00182_A696TBW05_CRF_VALUE, T00182_n696TBW05_CRF_VALUE,
            T00182_A697TBW05_EDIT_FLG, T00182_n697TBW05_EDIT_FLG
            }
            , new Object[] {
            T00183_A688TBW05_SESSION_ID, T00183_A689TBW05_APP_ID, T00183_A690TBW05_DISP_DATETIME, T00183_A691TBW05_STUDY_ID, T00183_A692TBW05_SUBJECT_ID, T00183_A693TBW05_CRF_ID, T00183_A694TBW05_CRF_ITEM_GRP_DIV, T00183_A695TBW05_CRF_ITEM_GRP_CD, T00183_A696TBW05_CRF_VALUE, T00183_n696TBW05_CRF_VALUE,
            T00183_A697TBW05_EDIT_FLG, T00183_n697TBW05_EDIT_FLG
            }
            , new Object[] {
            T00184_A688TBW05_SESSION_ID, T00184_A689TBW05_APP_ID, T00184_A690TBW05_DISP_DATETIME, T00184_A691TBW05_STUDY_ID, T00184_A692TBW05_SUBJECT_ID, T00184_A693TBW05_CRF_ID, T00184_A694TBW05_CRF_ITEM_GRP_DIV, T00184_A695TBW05_CRF_ITEM_GRP_CD, T00184_A696TBW05_CRF_VALUE, T00184_n696TBW05_CRF_VALUE,
            T00184_A697TBW05_EDIT_FLG, T00184_n697TBW05_EDIT_FLG
            }
            , new Object[] {
            T00185_A688TBW05_SESSION_ID, T00185_A689TBW05_APP_ID, T00185_A690TBW05_DISP_DATETIME, T00185_A691TBW05_STUDY_ID, T00185_A692TBW05_SUBJECT_ID, T00185_A693TBW05_CRF_ID, T00185_A694TBW05_CRF_ITEM_GRP_DIV, T00185_A695TBW05_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T00186_A688TBW05_SESSION_ID, T00186_A689TBW05_APP_ID, T00186_A690TBW05_DISP_DATETIME, T00186_A691TBW05_STUDY_ID, T00186_A692TBW05_SUBJECT_ID, T00186_A693TBW05_CRF_ID, T00186_A694TBW05_CRF_ITEM_GRP_DIV, T00186_A695TBW05_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T00187_A688TBW05_SESSION_ID, T00187_A689TBW05_APP_ID, T00187_A690TBW05_DISP_DATETIME, T00187_A691TBW05_STUDY_ID, T00187_A692TBW05_SUBJECT_ID, T00187_A693TBW05_CRF_ID, T00187_A694TBW05_CRF_ITEM_GRP_DIV, T00187_A695TBW05_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001811_A688TBW05_SESSION_ID, T001811_A689TBW05_APP_ID, T001811_A690TBW05_DISP_DATETIME, T001811_A691TBW05_STUDY_ID, T001811_A692TBW05_SUBJECT_ID, T001811_A693TBW05_CRF_ID, T001811_A694TBW05_CRF_ITEM_GRP_DIV, T001811_A695TBW05_CRF_ITEM_GRP_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW05_CRF_RESULT" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A693TBW05_CRF_ID ;
   private short Z693TBW05_CRF_ID ;
   private short RcdFound43 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW05_SESSION_ID_Enabled ;
   private int edtTBW05_APP_ID_Enabled ;
   private int edtTBW05_DISP_DATETIME_Enabled ;
   private int edtTBW05_STUDY_ID_Enabled ;
   private int A692TBW05_SUBJECT_ID ;
   private int edtTBW05_SUBJECT_ID_Enabled ;
   private int edtTBW05_CRF_ID_Enabled ;
   private int edtTBW05_CRF_ITEM_GRP_DIV_Enabled ;
   private int edtTBW05_CRF_ITEM_GRP_CD_Enabled ;
   private int edtTBW05_CRF_VALUE_Enabled ;
   private int edtTBW05_EDIT_FLG_Enabled ;
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
   private int Z692TBW05_SUBJECT_ID ;
   private int GX_JID ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A691TBW05_STUDY_ID ;
   private long Z691TBW05_STUDY_ID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW05_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw05_session_id_Internalname ;
   private String lblTextblocktbw05_session_id_Jsonclick ;
   private String edtTBW05_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw05_app_id_Internalname ;
   private String lblTextblocktbw05_app_id_Jsonclick ;
   private String edtTBW05_APP_ID_Internalname ;
   private String edtTBW05_APP_ID_Jsonclick ;
   private String lblTextblocktbw05_disp_datetime_Internalname ;
   private String lblTextblocktbw05_disp_datetime_Jsonclick ;
   private String edtTBW05_DISP_DATETIME_Internalname ;
   private String edtTBW05_DISP_DATETIME_Jsonclick ;
   private String lblTextblocktbw05_study_id_Internalname ;
   private String lblTextblocktbw05_study_id_Jsonclick ;
   private String edtTBW05_STUDY_ID_Internalname ;
   private String edtTBW05_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw05_subject_id_Internalname ;
   private String lblTextblocktbw05_subject_id_Jsonclick ;
   private String edtTBW05_SUBJECT_ID_Internalname ;
   private String edtTBW05_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbw05_crf_id_Internalname ;
   private String lblTextblocktbw05_crf_id_Jsonclick ;
   private String edtTBW05_CRF_ID_Internalname ;
   private String edtTBW05_CRF_ID_Jsonclick ;
   private String lblTextblocktbw05_crf_item_grp_div_Internalname ;
   private String lblTextblocktbw05_crf_item_grp_div_Jsonclick ;
   private String edtTBW05_CRF_ITEM_GRP_DIV_Internalname ;
   private String edtTBW05_CRF_ITEM_GRP_DIV_Jsonclick ;
   private String lblTextblocktbw05_crf_item_grp_cd_Internalname ;
   private String lblTextblocktbw05_crf_item_grp_cd_Jsonclick ;
   private String edtTBW05_CRF_ITEM_GRP_CD_Internalname ;
   private String edtTBW05_CRF_ITEM_GRP_CD_Jsonclick ;
   private String lblTextblocktbw05_crf_value_Internalname ;
   private String lblTextblocktbw05_crf_value_Jsonclick ;
   private String edtTBW05_CRF_VALUE_Internalname ;
   private String lblTextblocktbw05_edit_flg_Internalname ;
   private String lblTextblocktbw05_edit_flg_Jsonclick ;
   private String edtTBW05_EDIT_FLG_Internalname ;
   private String edtTBW05_EDIT_FLG_Jsonclick ;
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
   private String sMode43 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXt_char3 ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n696TBW05_CRF_VALUE ;
   private boolean n697TBW05_EDIT_FLG ;
   private String A688TBW05_SESSION_ID ;
   private String A689TBW05_APP_ID ;
   private String A690TBW05_DISP_DATETIME ;
   private String A694TBW05_CRF_ITEM_GRP_DIV ;
   private String A695TBW05_CRF_ITEM_GRP_CD ;
   private String A696TBW05_CRF_VALUE ;
   private String A697TBW05_EDIT_FLG ;
   private String Z688TBW05_SESSION_ID ;
   private String Z689TBW05_APP_ID ;
   private String Z690TBW05_DISP_DATETIME ;
   private String Z694TBW05_CRF_ITEM_GRP_DIV ;
   private String Z695TBW05_CRF_ITEM_GRP_CD ;
   private String Z696TBW05_CRF_VALUE ;
   private String Z697TBW05_EDIT_FLG ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T00184_A688TBW05_SESSION_ID ;
   private String[] T00184_A689TBW05_APP_ID ;
   private String[] T00184_A690TBW05_DISP_DATETIME ;
   private long[] T00184_A691TBW05_STUDY_ID ;
   private int[] T00184_A692TBW05_SUBJECT_ID ;
   private short[] T00184_A693TBW05_CRF_ID ;
   private String[] T00184_A694TBW05_CRF_ITEM_GRP_DIV ;
   private String[] T00184_A695TBW05_CRF_ITEM_GRP_CD ;
   private String[] T00184_A696TBW05_CRF_VALUE ;
   private boolean[] T00184_n696TBW05_CRF_VALUE ;
   private String[] T00184_A697TBW05_EDIT_FLG ;
   private boolean[] T00184_n697TBW05_EDIT_FLG ;
   private String[] T00185_A688TBW05_SESSION_ID ;
   private String[] T00185_A689TBW05_APP_ID ;
   private String[] T00185_A690TBW05_DISP_DATETIME ;
   private long[] T00185_A691TBW05_STUDY_ID ;
   private int[] T00185_A692TBW05_SUBJECT_ID ;
   private short[] T00185_A693TBW05_CRF_ID ;
   private String[] T00185_A694TBW05_CRF_ITEM_GRP_DIV ;
   private String[] T00185_A695TBW05_CRF_ITEM_GRP_CD ;
   private String[] T00183_A688TBW05_SESSION_ID ;
   private String[] T00183_A689TBW05_APP_ID ;
   private String[] T00183_A690TBW05_DISP_DATETIME ;
   private long[] T00183_A691TBW05_STUDY_ID ;
   private int[] T00183_A692TBW05_SUBJECT_ID ;
   private short[] T00183_A693TBW05_CRF_ID ;
   private String[] T00183_A694TBW05_CRF_ITEM_GRP_DIV ;
   private String[] T00183_A695TBW05_CRF_ITEM_GRP_CD ;
   private String[] T00183_A696TBW05_CRF_VALUE ;
   private boolean[] T00183_n696TBW05_CRF_VALUE ;
   private String[] T00183_A697TBW05_EDIT_FLG ;
   private boolean[] T00183_n697TBW05_EDIT_FLG ;
   private String[] T00186_A688TBW05_SESSION_ID ;
   private String[] T00186_A689TBW05_APP_ID ;
   private String[] T00186_A690TBW05_DISP_DATETIME ;
   private long[] T00186_A691TBW05_STUDY_ID ;
   private int[] T00186_A692TBW05_SUBJECT_ID ;
   private short[] T00186_A693TBW05_CRF_ID ;
   private String[] T00186_A694TBW05_CRF_ITEM_GRP_DIV ;
   private String[] T00186_A695TBW05_CRF_ITEM_GRP_CD ;
   private String[] T00187_A688TBW05_SESSION_ID ;
   private String[] T00187_A689TBW05_APP_ID ;
   private String[] T00187_A690TBW05_DISP_DATETIME ;
   private long[] T00187_A691TBW05_STUDY_ID ;
   private int[] T00187_A692TBW05_SUBJECT_ID ;
   private short[] T00187_A693TBW05_CRF_ID ;
   private String[] T00187_A694TBW05_CRF_ITEM_GRP_DIV ;
   private String[] T00187_A695TBW05_CRF_ITEM_GRP_CD ;
   private String[] T00182_A688TBW05_SESSION_ID ;
   private String[] T00182_A689TBW05_APP_ID ;
   private String[] T00182_A690TBW05_DISP_DATETIME ;
   private long[] T00182_A691TBW05_STUDY_ID ;
   private int[] T00182_A692TBW05_SUBJECT_ID ;
   private short[] T00182_A693TBW05_CRF_ID ;
   private String[] T00182_A694TBW05_CRF_ITEM_GRP_DIV ;
   private String[] T00182_A695TBW05_CRF_ITEM_GRP_CD ;
   private String[] T00182_A696TBW05_CRF_VALUE ;
   private boolean[] T00182_n696TBW05_CRF_VALUE ;
   private String[] T00182_A697TBW05_EDIT_FLG ;
   private boolean[] T00182_n697TBW05_EDIT_FLG ;
   private String[] T001811_A688TBW05_SESSION_ID ;
   private String[] T001811_A689TBW05_APP_ID ;
   private String[] T001811_A690TBW05_DISP_DATETIME ;
   private long[] T001811_A691TBW05_STUDY_ID ;
   private int[] T001811_A692TBW05_SUBJECT_ID ;
   private short[] T001811_A693TBW05_CRF_ID ;
   private String[] T001811_A694TBW05_CRF_ITEM_GRP_DIV ;
   private String[] T001811_A695TBW05_CRF_ITEM_GRP_CD ;
}

final  class tbw05_crf_result__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00182", "SELECT `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD`, `TBW05_CRF_VALUE`, `TBW05_EDIT_FLG` FROM `TBW05_CRF_RESULT` WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00183", "SELECT `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD`, `TBW05_CRF_VALUE`, `TBW05_EDIT_FLG` FROM `TBW05_CRF_RESULT` WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00184", "SELECT TM1.`TBW05_SESSION_ID`, TM1.`TBW05_APP_ID`, TM1.`TBW05_DISP_DATETIME`, TM1.`TBW05_STUDY_ID`, TM1.`TBW05_SUBJECT_ID`, TM1.`TBW05_CRF_ID`, TM1.`TBW05_CRF_ITEM_GRP_DIV`, TM1.`TBW05_CRF_ITEM_GRP_CD`, TM1.`TBW05_CRF_VALUE`, TM1.`TBW05_EDIT_FLG` FROM `TBW05_CRF_RESULT` TM1 WHERE TM1.`TBW05_SESSION_ID` = ? and TM1.`TBW05_APP_ID` = ? and TM1.`TBW05_DISP_DATETIME` = ? and TM1.`TBW05_STUDY_ID` = ? and TM1.`TBW05_SUBJECT_ID` = ? and TM1.`TBW05_CRF_ID` = ? and TM1.`TBW05_CRF_ITEM_GRP_DIV` = ? and TM1.`TBW05_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBW05_SESSION_ID`, TM1.`TBW05_APP_ID`, TM1.`TBW05_DISP_DATETIME`, TM1.`TBW05_STUDY_ID`, TM1.`TBW05_SUBJECT_ID`, TM1.`TBW05_CRF_ID`, TM1.`TBW05_CRF_ITEM_GRP_DIV`, TM1.`TBW05_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T00185", "SELECT `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD` FROM `TBW05_CRF_RESULT` WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00186", "SELECT `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD` FROM `TBW05_CRF_RESULT` WHERE ( `TBW05_SESSION_ID` > ? or `TBW05_SESSION_ID` = ? and `TBW05_APP_ID` > ? or `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_DISP_DATETIME` > ? or `TBW05_DISP_DATETIME` = ? and `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_STUDY_ID` > ? or `TBW05_STUDY_ID` = ? and `TBW05_DISP_DATETIME` = ? and `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_SUBJECT_ID` > ? or `TBW05_SUBJECT_ID` = ? and `TBW05_STUDY_ID` = ? and `TBW05_DISP_DATETIME` = ? and `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_CRF_ID` > ? or `TBW05_CRF_ID` = ? and `TBW05_SUBJECT_ID` = ? and `TBW05_STUDY_ID` = ? and `TBW05_DISP_DATETIME` = ? and `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_CRF_ITEM_GRP_DIV` > ? or `TBW05_CRF_ITEM_GRP_DIV` = ? and `TBW05_CRF_ID` = ? and `TBW05_SUBJECT_ID` = ? and `TBW05_STUDY_ID` = ? and `TBW05_DISP_DATETIME` = ? and `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_CRF_ITEM_GRP_CD` > ?) ORDER BY `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00187", "SELECT `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD` FROM `TBW05_CRF_RESULT` WHERE ( `TBW05_SESSION_ID` < ? or `TBW05_SESSION_ID` = ? and `TBW05_APP_ID` < ? or `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_DISP_DATETIME` < ? or `TBW05_DISP_DATETIME` = ? and `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_STUDY_ID` < ? or `TBW05_STUDY_ID` = ? and `TBW05_DISP_DATETIME` = ? and `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_SUBJECT_ID` < ? or `TBW05_SUBJECT_ID` = ? and `TBW05_STUDY_ID` = ? and `TBW05_DISP_DATETIME` = ? and `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_CRF_ID` < ? or `TBW05_CRF_ID` = ? and `TBW05_SUBJECT_ID` = ? and `TBW05_STUDY_ID` = ? and `TBW05_DISP_DATETIME` = ? and `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_CRF_ITEM_GRP_DIV` < ? or `TBW05_CRF_ITEM_GRP_DIV` = ? and `TBW05_CRF_ID` = ? and `TBW05_SUBJECT_ID` = ? and `TBW05_STUDY_ID` = ? and `TBW05_DISP_DATETIME` = ? and `TBW05_APP_ID` = ? and `TBW05_SESSION_ID` = ? and `TBW05_CRF_ITEM_GRP_CD` < ?) ORDER BY `TBW05_SESSION_ID` DESC, `TBW05_APP_ID` DESC, `TBW05_DISP_DATETIME` DESC, `TBW05_STUDY_ID` DESC, `TBW05_SUBJECT_ID` DESC, `TBW05_CRF_ID` DESC, `TBW05_CRF_ITEM_GRP_DIV` DESC, `TBW05_CRF_ITEM_GRP_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00188", "INSERT INTO `TBW05_CRF_RESULT` (`TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD`, `TBW05_CRF_VALUE`, `TBW05_EDIT_FLG`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00189", "UPDATE `TBW05_CRF_RESULT` SET `TBW05_CRF_VALUE`=?, `TBW05_EDIT_FLG`=?  WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T001810", "DELETE FROM `TBW05_CRF_RESULT`  WHERE `TBW05_SESSION_ID` = ? AND `TBW05_APP_ID` = ? AND `TBW05_DISP_DATETIME` = ? AND `TBW05_STUDY_ID` = ? AND `TBW05_SUBJECT_ID` = ? AND `TBW05_CRF_ID` = ? AND `TBW05_CRF_ITEM_GRP_DIV` = ? AND `TBW05_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T001811", "SELECT `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD` FROM `TBW05_CRF_RESULT` ORDER BY `TBW05_SESSION_ID`, `TBW05_APP_ID`, `TBW05_DISP_DATETIME`, `TBW05_STUDY_ID`, `TBW05_SUBJECT_ID`, `TBW05_CRF_ID`, `TBW05_CRF_ITEM_GRP_DIV`, `TBW05_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               ((String[]) buf[8])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((String[]) buf[7])[0] = rslt.getVarchar(8) ;
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
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
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
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setLong(24, ((Number) parms[23]).longValue());
               stmt.setVarchar(25, (String)parms[24], 14, false);
               stmt.setVarchar(26, (String)parms[25], 7, false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setVarchar(28, (String)parms[27], 1, false);
               stmt.setVarchar(29, (String)parms[28], 1, false);
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setLong(32, ((Number) parms[31]).longValue());
               stmt.setVarchar(33, (String)parms[32], 14, false);
               stmt.setVarchar(34, (String)parms[33], 7, false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setVarchar(36, (String)parms[35], 50, false);
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
               stmt.setShort(22, ((Number) parms[21]).shortValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setLong(24, ((Number) parms[23]).longValue());
               stmt.setVarchar(25, (String)parms[24], 14, false);
               stmt.setVarchar(26, (String)parms[25], 7, false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setVarchar(28, (String)parms[27], 1, false);
               stmt.setVarchar(29, (String)parms[28], 1, false);
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setLong(32, ((Number) parms[31]).longValue());
               stmt.setVarchar(33, (String)parms[32], 14, false);
               stmt.setVarchar(34, (String)parms[33], 7, false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setVarchar(36, (String)parms[35], 50, false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[9], 2000);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[11], 1);
               }
               break;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2000);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
               }
               stmt.setVarchar(3, (String)parms[4], 50, false);
               stmt.setVarchar(4, (String)parms[5], 7, false);
               stmt.setVarchar(5, (String)parms[6], 14, false);
               stmt.setLong(6, ((Number) parms[7]).longValue());
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               stmt.setVarchar(9, (String)parms[10], 1, false);
               stmt.setVarchar(10, (String)parms[11], 50, false);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setVarchar(8, (String)parms[7], 50, false);
               break;
      }
   }

}

