/*
               File: tbw07_crf_memo_loc_impl
        Description: CRFメモ位置テーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:23.97
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw07_crf_memo_loc_impl extends GXWebPanel
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
         Form.getMeta().addItem("description", "CRFメモ位置テーブル", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW07_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbw07_crf_memo_loc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw07_crf_memo_loc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw07_crf_memo_loc_impl.class ));
   }

   public tbw07_crf_memo_loc_impl( int remoteHandle ,
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
         wb_table1_2_1A45( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1A45e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1A45( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1A45( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1A45( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1A45e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRFメモ位置テーブル", 1, 0, "px", 0, "px", "Group", "", "HLP_TBW07_CRF_MEMO_LOC.htm");
         wb_table3_28_1A45( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1A45e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1A45e( true) ;
      }
      else
      {
         wb_table1_2_1A45e( false) ;
      }
   }

   public void wb_table3_28_1A45( boolean wbgen )
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
         wb_table4_34_1A45( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1A45e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW07_CRF_MEMO_LOC.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW07_CRF_MEMO_LOC.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1A45e( true) ;
      }
      else
      {
         wb_table3_28_1A45e( false) ;
      }
   }

   public void wb_table4_34_1A45( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_session_id_Internalname, "ID", "", "", lblTextblocktbw07_session_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_SESSION_ID_Internalname, GXutil.rtrim( A146TBW07_SESSION_ID), GXutil.rtrim( localUtil.format( A146TBW07_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_SESSION_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_SESSION_ID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SESSION_ID", "left", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_app_id_Internalname, "ID", "", "", lblTextblocktbw07_app_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_APP_ID_Internalname, GXutil.rtrim( A147TBW07_APP_ID), GXutil.rtrim( localUtil.format( A147TBW07_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_APP_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_APP_ID_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_APP_ID", "left", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_disp_datetime_Internalname, "表示日時", "", "", lblTextblocktbw07_disp_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_DISP_DATETIME_Internalname, GXutil.rtrim( A148TBW07_DISP_DATETIME), GXutil.rtrim( localUtil.format( A148TBW07_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_DISP_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_DISP_DATETIME_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_Y4MD_HMS_C", "left", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_study_id_Internalname, "ID", "", "", lblTextblocktbw07_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A150TBW07_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW07_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A150TBW07_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A150TBW07_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_subject_id_Internalname, "ID", "", "", lblTextblocktbw07_subject_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A152TBW07_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW07_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A152TBW07_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A152TBW07_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_SUBJECT_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_SUBJECT_ID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_ins_no_Internalname, "挿入連番", "", "", lblTextblocktbw07_ins_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_INS_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A154TBW07_INS_NO, (byte)(3), (byte)(0), ".", "")), ((edtTBW07_INS_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A154TBW07_INS_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A154TBW07_INS_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_INS_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_INS_NO_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_crf_id_Internalname, "CRFID", "", "", lblTextblocktbw07_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A156TBW07_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW07_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A156TBW07_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A156TBW07_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_crf_version_Internalname, "CRF更新バージョン", "", "", lblTextblocktbw07_crf_version_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_CRF_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A158TBW07_CRF_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBW07_CRF_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A158TBW07_CRF_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A158TBW07_CRF_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_CRF_VERSION_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_CRF_VERSION_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_x_Internalname, "座標Ｘ", "", "", lblTextblocktbw07_x_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_X_Internalname, GXutil.ltrim( localUtil.ntoc( A160TBW07_X, (byte)(4), (byte)(0), ".", "")), ((edtTBW07_X_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A160TBW07_X), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A160TBW07_X), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_X_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_X_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_y_Internalname, "座標Ｙ", "", "", lblTextblocktbw07_y_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_Y_Internalname, GXutil.ltrim( localUtil.ntoc( A162TBW07_Y, (byte)(4), (byte)(0), ".", "")), ((edtTBW07_Y_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A162TBW07_Y), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A162TBW07_Y), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_Y_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_Y_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_edit_request_flg_Internalname, "クエリー依頼フラグ", "", "", lblTextblocktbw07_edit_request_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_EDIT_REQUEST_FLG_Internalname, GXutil.rtrim( A768TBW07_EDIT_REQUEST_FLG), GXutil.rtrim( localUtil.format( A768TBW07_EDIT_REQUEST_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_EDIT_REQUEST_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_EDIT_REQUEST_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw07_color_div_Internalname, "付箋カラー区分", "", "", lblTextblocktbw07_color_div_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW07_COLOR_DIV_Internalname, GXutil.rtrim( A769TBW07_COLOR_DIV), GXutil.rtrim( localUtil.format( A769TBW07_COLOR_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW07_COLOR_DIV_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW07_COLOR_DIV_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBW07_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1A45e( true) ;
      }
      else
      {
         wb_table4_34_1A45e( false) ;
      }
   }

   public void wb_table2_5_1A45( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW07_CRF_MEMO_LOC.htm");
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
         wb_table2_5_1A45e( true) ;
      }
      else
      {
         wb_table2_5_1A45e( false) ;
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
      /* Execute user event: e111A2 */
      e111A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A146TBW07_SESSION_ID = httpContext.cgiGet( edtTBW07_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A146TBW07_SESSION_ID", A146TBW07_SESSION_ID);
            A147TBW07_APP_ID = httpContext.cgiGet( edtTBW07_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A147TBW07_APP_ID", A147TBW07_APP_ID);
            A148TBW07_DISP_DATETIME = httpContext.cgiGet( edtTBW07_DISP_DATETIME_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A148TBW07_DISP_DATETIME", A148TBW07_DISP_DATETIME);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW07_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW07_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A150TBW07_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A150TBW07_STUDY_ID", GXutil.ltrim( GXutil.str( A150TBW07_STUDY_ID, 10, 0)));
            }
            else
            {
               A150TBW07_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW07_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A150TBW07_STUDY_ID", GXutil.ltrim( GXutil.str( A150TBW07_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW07_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW07_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A152TBW07_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A152TBW07_SUBJECT_ID", GXutil.ltrim( GXutil.str( A152TBW07_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A152TBW07_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW07_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A152TBW07_SUBJECT_ID", GXutil.ltrim( GXutil.str( A152TBW07_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_INS_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_INS_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW07_INS_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW07_INS_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A154TBW07_INS_NO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A154TBW07_INS_NO", GXutil.ltrim( GXutil.str( A154TBW07_INS_NO, 3, 0)));
            }
            else
            {
               A154TBW07_INS_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW07_INS_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A154TBW07_INS_NO", GXutil.ltrim( GXutil.str( A154TBW07_INS_NO, 3, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW07_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW07_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A156TBW07_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A156TBW07_CRF_ID", GXutil.ltrim( GXutil.str( A156TBW07_CRF_ID, 4, 0)));
            }
            else
            {
               A156TBW07_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW07_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A156TBW07_CRF_ID", GXutil.ltrim( GXutil.str( A156TBW07_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_CRF_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_CRF_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW07_CRF_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW07_CRF_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A158TBW07_CRF_VERSION = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A158TBW07_CRF_VERSION", GXutil.ltrim( GXutil.str( A158TBW07_CRF_VERSION, 4, 0)));
            }
            else
            {
               A158TBW07_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW07_CRF_VERSION_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A158TBW07_CRF_VERSION", GXutil.ltrim( GXutil.str( A158TBW07_CRF_VERSION, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_X_Internalname), ".", ",") < -999 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_X_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW07_X");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW07_X_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A160TBW07_X = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A160TBW07_X", GXutil.ltrim( GXutil.str( A160TBW07_X, 4, 0)));
            }
            else
            {
               A160TBW07_X = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW07_X_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A160TBW07_X", GXutil.ltrim( GXutil.str( A160TBW07_X, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_Y_Internalname), ".", ",") < -999 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW07_Y_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW07_Y");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW07_Y_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A162TBW07_Y = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A162TBW07_Y", GXutil.ltrim( GXutil.str( A162TBW07_Y, 4, 0)));
            }
            else
            {
               A162TBW07_Y = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW07_Y_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A162TBW07_Y", GXutil.ltrim( GXutil.str( A162TBW07_Y, 4, 0)));
            }
            A768TBW07_EDIT_REQUEST_FLG = httpContext.cgiGet( edtTBW07_EDIT_REQUEST_FLG_Internalname) ;
            n768TBW07_EDIT_REQUEST_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A768TBW07_EDIT_REQUEST_FLG", A768TBW07_EDIT_REQUEST_FLG);
            n768TBW07_EDIT_REQUEST_FLG = ((GXutil.strcmp("", A768TBW07_EDIT_REQUEST_FLG)==0) ? true : false) ;
            A769TBW07_COLOR_DIV = httpContext.cgiGet( edtTBW07_COLOR_DIV_Internalname) ;
            n769TBW07_COLOR_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A769TBW07_COLOR_DIV", A769TBW07_COLOR_DIV);
            n769TBW07_COLOR_DIV = ((GXutil.strcmp("", A769TBW07_COLOR_DIV)==0) ? true : false) ;
            /* Read saved values. */
            Z146TBW07_SESSION_ID = httpContext.cgiGet( "Z146TBW07_SESSION_ID") ;
            Z147TBW07_APP_ID = httpContext.cgiGet( "Z147TBW07_APP_ID") ;
            Z148TBW07_DISP_DATETIME = httpContext.cgiGet( "Z148TBW07_DISP_DATETIME") ;
            Z150TBW07_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z150TBW07_STUDY_ID"), ".", ",") ;
            Z152TBW07_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z152TBW07_SUBJECT_ID"), ".", ",")) ;
            Z154TBW07_INS_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z154TBW07_INS_NO"), ".", ",")) ;
            Z156TBW07_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z156TBW07_CRF_ID"), ".", ",")) ;
            Z158TBW07_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z158TBW07_CRF_VERSION"), ".", ",")) ;
            Z160TBW07_X = (short)(localUtil.ctol( httpContext.cgiGet( "Z160TBW07_X"), ".", ",")) ;
            Z162TBW07_Y = (short)(localUtil.ctol( httpContext.cgiGet( "Z162TBW07_Y"), ".", ",")) ;
            Z768TBW07_EDIT_REQUEST_FLG = httpContext.cgiGet( "Z768TBW07_EDIT_REQUEST_FLG") ;
            n768TBW07_EDIT_REQUEST_FLG = ((GXutil.strcmp("", A768TBW07_EDIT_REQUEST_FLG)==0) ? true : false) ;
            Z769TBW07_COLOR_DIV = httpContext.cgiGet( "Z769TBW07_COLOR_DIV") ;
            n769TBW07_COLOR_DIV = ((GXutil.strcmp("", A769TBW07_COLOR_DIV)==0) ? true : false) ;
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
               A146TBW07_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A146TBW07_SESSION_ID", A146TBW07_SESSION_ID);
               A147TBW07_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A147TBW07_APP_ID", A147TBW07_APP_ID);
               A148TBW07_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A148TBW07_DISP_DATETIME", A148TBW07_DISP_DATETIME);
               A150TBW07_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A150TBW07_STUDY_ID", GXutil.ltrim( GXutil.str( A150TBW07_STUDY_ID, 10, 0)));
               A152TBW07_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A152TBW07_SUBJECT_ID", GXutil.ltrim( GXutil.str( A152TBW07_SUBJECT_ID, 6, 0)));
               A154TBW07_INS_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A154TBW07_INS_NO", GXutil.ltrim( GXutil.str( A154TBW07_INS_NO, 3, 0)));
               A156TBW07_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A156TBW07_CRF_ID", GXutil.ltrim( GXutil.str( A156TBW07_CRF_ID, 4, 0)));
               A158TBW07_CRF_VERSION = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A158TBW07_CRF_VERSION", GXutil.ltrim( GXutil.str( A158TBW07_CRF_VERSION, 4, 0)));
               A160TBW07_X = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A160TBW07_X", GXutil.ltrim( GXutil.str( A160TBW07_X, 4, 0)));
               A162TBW07_Y = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A162TBW07_Y", GXutil.ltrim( GXutil.str( A162TBW07_Y, 4, 0)));
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
                     /* Execute user event: e111A2 */
                     e111A2 ();
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
            initAll1A45( ) ;
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
      disableAttributes1A45( ) ;
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

   public void resetCaption1A0( )
   {
   }

   public void e111A2( )
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

   public void zm1A45( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z768TBW07_EDIT_REQUEST_FLG = T001A3_A768TBW07_EDIT_REQUEST_FLG[0] ;
            Z769TBW07_COLOR_DIV = T001A3_A769TBW07_COLOR_DIV[0] ;
         }
         else
         {
            Z768TBW07_EDIT_REQUEST_FLG = A768TBW07_EDIT_REQUEST_FLG ;
            Z769TBW07_COLOR_DIV = A769TBW07_COLOR_DIV ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z146TBW07_SESSION_ID = A146TBW07_SESSION_ID ;
         Z147TBW07_APP_ID = A147TBW07_APP_ID ;
         Z148TBW07_DISP_DATETIME = A148TBW07_DISP_DATETIME ;
         Z150TBW07_STUDY_ID = A150TBW07_STUDY_ID ;
         Z152TBW07_SUBJECT_ID = A152TBW07_SUBJECT_ID ;
         Z154TBW07_INS_NO = A154TBW07_INS_NO ;
         Z156TBW07_CRF_ID = A156TBW07_CRF_ID ;
         Z158TBW07_CRF_VERSION = A158TBW07_CRF_VERSION ;
         Z160TBW07_X = A160TBW07_X ;
         Z162TBW07_Y = A162TBW07_Y ;
         Z768TBW07_EDIT_REQUEST_FLG = A768TBW07_EDIT_REQUEST_FLG ;
         Z769TBW07_COLOR_DIV = A769TBW07_COLOR_DIV ;
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

   public void load1A45( )
   {
      /* Using cursor T001A4 */
      pr_default.execute(2, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A768TBW07_EDIT_REQUEST_FLG = T001A4_A768TBW07_EDIT_REQUEST_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A768TBW07_EDIT_REQUEST_FLG", A768TBW07_EDIT_REQUEST_FLG);
         n768TBW07_EDIT_REQUEST_FLG = T001A4_n768TBW07_EDIT_REQUEST_FLG[0] ;
         A769TBW07_COLOR_DIV = T001A4_A769TBW07_COLOR_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769TBW07_COLOR_DIV", A769TBW07_COLOR_DIV);
         n769TBW07_COLOR_DIV = T001A4_n769TBW07_COLOR_DIV[0] ;
         zm1A45( -1) ;
      }
      pr_default.close(2);
      onLoadActions1A45( ) ;
   }

   public void onLoadActions1A45( )
   {
      AV8Pgmname = "TBW07_CRF_MEMO_LOC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable1A45( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TBW07_CRF_MEMO_LOC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void closeExtendedTableCursors1A45( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1A45( )
   {
      /* Using cursor T001A5 */
      pr_default.execute(3, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound45 = (short)(1) ;
      }
      else
      {
         RcdFound45 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001A3 */
      pr_default.execute(1, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1A45( 1) ;
         RcdFound45 = (short)(1) ;
         A146TBW07_SESSION_ID = T001A3_A146TBW07_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A146TBW07_SESSION_ID", A146TBW07_SESSION_ID);
         A147TBW07_APP_ID = T001A3_A147TBW07_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147TBW07_APP_ID", A147TBW07_APP_ID);
         A148TBW07_DISP_DATETIME = T001A3_A148TBW07_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148TBW07_DISP_DATETIME", A148TBW07_DISP_DATETIME);
         A150TBW07_STUDY_ID = T001A3_A150TBW07_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150TBW07_STUDY_ID", GXutil.ltrim( GXutil.str( A150TBW07_STUDY_ID, 10, 0)));
         A152TBW07_SUBJECT_ID = T001A3_A152TBW07_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152TBW07_SUBJECT_ID", GXutil.ltrim( GXutil.str( A152TBW07_SUBJECT_ID, 6, 0)));
         A154TBW07_INS_NO = T001A3_A154TBW07_INS_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A154TBW07_INS_NO", GXutil.ltrim( GXutil.str( A154TBW07_INS_NO, 3, 0)));
         A156TBW07_CRF_ID = T001A3_A156TBW07_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A156TBW07_CRF_ID", GXutil.ltrim( GXutil.str( A156TBW07_CRF_ID, 4, 0)));
         A158TBW07_CRF_VERSION = T001A3_A158TBW07_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A158TBW07_CRF_VERSION", GXutil.ltrim( GXutil.str( A158TBW07_CRF_VERSION, 4, 0)));
         A160TBW07_X = T001A3_A160TBW07_X[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160TBW07_X", GXutil.ltrim( GXutil.str( A160TBW07_X, 4, 0)));
         A162TBW07_Y = T001A3_A162TBW07_Y[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162TBW07_Y", GXutil.ltrim( GXutil.str( A162TBW07_Y, 4, 0)));
         A768TBW07_EDIT_REQUEST_FLG = T001A3_A768TBW07_EDIT_REQUEST_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A768TBW07_EDIT_REQUEST_FLG", A768TBW07_EDIT_REQUEST_FLG);
         n768TBW07_EDIT_REQUEST_FLG = T001A3_n768TBW07_EDIT_REQUEST_FLG[0] ;
         A769TBW07_COLOR_DIV = T001A3_A769TBW07_COLOR_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A769TBW07_COLOR_DIV", A769TBW07_COLOR_DIV);
         n769TBW07_COLOR_DIV = T001A3_n769TBW07_COLOR_DIV[0] ;
         Z146TBW07_SESSION_ID = A146TBW07_SESSION_ID ;
         Z147TBW07_APP_ID = A147TBW07_APP_ID ;
         Z148TBW07_DISP_DATETIME = A148TBW07_DISP_DATETIME ;
         Z150TBW07_STUDY_ID = A150TBW07_STUDY_ID ;
         Z152TBW07_SUBJECT_ID = A152TBW07_SUBJECT_ID ;
         Z154TBW07_INS_NO = A154TBW07_INS_NO ;
         Z156TBW07_CRF_ID = A156TBW07_CRF_ID ;
         Z158TBW07_CRF_VERSION = A158TBW07_CRF_VERSION ;
         Z160TBW07_X = A160TBW07_X ;
         Z162TBW07_Y = A162TBW07_Y ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1A45( ) ;
         if ( AnyError == 1 )
         {
            RcdFound45 = (short)(0) ;
            initializeNonKey1A45( ) ;
         }
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound45 = (short)(0) ;
         initializeNonKey1A45( ) ;
         sMode45 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode45 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1A45( ) ;
      if ( RcdFound45 == 0 )
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
      RcdFound45 = (short)(0) ;
      /* Using cursor T001A6 */
      pr_default.execute(4, new Object[] {A146TBW07_SESSION_ID, A146TBW07_SESSION_ID, A147TBW07_APP_ID, A147TBW07_APP_ID, A146TBW07_SESSION_ID, A148TBW07_DISP_DATETIME, A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Long(A150TBW07_STUDY_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Integer(A152TBW07_SUBJECT_ID), new Integer(A152TBW07_SUBJECT_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Short(A154TBW07_INS_NO), new Short(A154TBW07_INS_NO), new Integer(A152TBW07_SUBJECT_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Short(A156TBW07_CRF_ID), new Short(A156TBW07_CRF_ID), new Short(A154TBW07_INS_NO), new Integer(A152TBW07_SUBJECT_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Short(A158TBW07_CRF_VERSION), new Short(A158TBW07_CRF_VERSION), new Short(A156TBW07_CRF_ID), new Short(A154TBW07_INS_NO), new Integer(A152TBW07_SUBJECT_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Short(A160TBW07_X), new Short(A160TBW07_X), new Short(A158TBW07_CRF_VERSION), new Short(A156TBW07_CRF_ID), new Short(A154TBW07_INS_NO), new Integer(A152TBW07_SUBJECT_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Short(A162TBW07_Y)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) < 0 ) || ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A150TBW07_STUDY_ID[0] < A150TBW07_STUDY_ID ) || ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A152TBW07_SUBJECT_ID[0] < A152TBW07_SUBJECT_ID ) || ( T001A6_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A154TBW07_INS_NO[0] < A154TBW07_INS_NO ) || ( T001A6_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A6_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A156TBW07_CRF_ID[0] < A156TBW07_CRF_ID ) || ( T001A6_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A6_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A6_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A158TBW07_CRF_VERSION[0] < A158TBW07_CRF_VERSION ) || ( T001A6_A158TBW07_CRF_VERSION[0] == A158TBW07_CRF_VERSION ) && ( T001A6_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A6_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A6_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A160TBW07_X[0] < A160TBW07_X ) || ( T001A6_A160TBW07_X[0] == A160TBW07_X ) && ( T001A6_A158TBW07_CRF_VERSION[0] == A158TBW07_CRF_VERSION ) && ( T001A6_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A6_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A6_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A162TBW07_Y[0] < A162TBW07_Y ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) > 0 ) || ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A150TBW07_STUDY_ID[0] > A150TBW07_STUDY_ID ) || ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A152TBW07_SUBJECT_ID[0] > A152TBW07_SUBJECT_ID ) || ( T001A6_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A154TBW07_INS_NO[0] > A154TBW07_INS_NO ) || ( T001A6_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A6_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A156TBW07_CRF_ID[0] > A156TBW07_CRF_ID ) || ( T001A6_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A6_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A6_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A158TBW07_CRF_VERSION[0] > A158TBW07_CRF_VERSION ) || ( T001A6_A158TBW07_CRF_VERSION[0] == A158TBW07_CRF_VERSION ) && ( T001A6_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A6_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A6_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A160TBW07_X[0] > A160TBW07_X ) || ( T001A6_A160TBW07_X[0] == A160TBW07_X ) && ( T001A6_A158TBW07_CRF_VERSION[0] == A158TBW07_CRF_VERSION ) && ( T001A6_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A6_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A6_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A6_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A6_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A6_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A6_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A6_A162TBW07_Y[0] > A162TBW07_Y ) ) )
         {
            A146TBW07_SESSION_ID = T001A6_A146TBW07_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A146TBW07_SESSION_ID", A146TBW07_SESSION_ID);
            A147TBW07_APP_ID = T001A6_A147TBW07_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A147TBW07_APP_ID", A147TBW07_APP_ID);
            A148TBW07_DISP_DATETIME = T001A6_A148TBW07_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A148TBW07_DISP_DATETIME", A148TBW07_DISP_DATETIME);
            A150TBW07_STUDY_ID = T001A6_A150TBW07_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A150TBW07_STUDY_ID", GXutil.ltrim( GXutil.str( A150TBW07_STUDY_ID, 10, 0)));
            A152TBW07_SUBJECT_ID = T001A6_A152TBW07_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A152TBW07_SUBJECT_ID", GXutil.ltrim( GXutil.str( A152TBW07_SUBJECT_ID, 6, 0)));
            A154TBW07_INS_NO = T001A6_A154TBW07_INS_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A154TBW07_INS_NO", GXutil.ltrim( GXutil.str( A154TBW07_INS_NO, 3, 0)));
            A156TBW07_CRF_ID = T001A6_A156TBW07_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A156TBW07_CRF_ID", GXutil.ltrim( GXutil.str( A156TBW07_CRF_ID, 4, 0)));
            A158TBW07_CRF_VERSION = T001A6_A158TBW07_CRF_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A158TBW07_CRF_VERSION", GXutil.ltrim( GXutil.str( A158TBW07_CRF_VERSION, 4, 0)));
            A160TBW07_X = T001A6_A160TBW07_X[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A160TBW07_X", GXutil.ltrim( GXutil.str( A160TBW07_X, 4, 0)));
            A162TBW07_Y = T001A6_A162TBW07_Y[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A162TBW07_Y", GXutil.ltrim( GXutil.str( A162TBW07_Y, 4, 0)));
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound45 = (short)(0) ;
      /* Using cursor T001A7 */
      pr_default.execute(5, new Object[] {A146TBW07_SESSION_ID, A146TBW07_SESSION_ID, A147TBW07_APP_ID, A147TBW07_APP_ID, A146TBW07_SESSION_ID, A148TBW07_DISP_DATETIME, A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Long(A150TBW07_STUDY_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Integer(A152TBW07_SUBJECT_ID), new Integer(A152TBW07_SUBJECT_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Short(A154TBW07_INS_NO), new Short(A154TBW07_INS_NO), new Integer(A152TBW07_SUBJECT_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Short(A156TBW07_CRF_ID), new Short(A156TBW07_CRF_ID), new Short(A154TBW07_INS_NO), new Integer(A152TBW07_SUBJECT_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Short(A158TBW07_CRF_VERSION), new Short(A158TBW07_CRF_VERSION), new Short(A156TBW07_CRF_ID), new Short(A154TBW07_INS_NO), new Integer(A152TBW07_SUBJECT_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Short(A160TBW07_X), new Short(A160TBW07_X), new Short(A158TBW07_CRF_VERSION), new Short(A156TBW07_CRF_ID), new Short(A154TBW07_INS_NO), new Integer(A152TBW07_SUBJECT_ID), new Long(A150TBW07_STUDY_ID), A148TBW07_DISP_DATETIME, A147TBW07_APP_ID, A146TBW07_SESSION_ID, new Short(A162TBW07_Y)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) > 0 ) || ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A150TBW07_STUDY_ID[0] > A150TBW07_STUDY_ID ) || ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A152TBW07_SUBJECT_ID[0] > A152TBW07_SUBJECT_ID ) || ( T001A7_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A154TBW07_INS_NO[0] > A154TBW07_INS_NO ) || ( T001A7_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A7_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A156TBW07_CRF_ID[0] > A156TBW07_CRF_ID ) || ( T001A7_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A7_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A7_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A158TBW07_CRF_VERSION[0] > A158TBW07_CRF_VERSION ) || ( T001A7_A158TBW07_CRF_VERSION[0] == A158TBW07_CRF_VERSION ) && ( T001A7_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A7_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A7_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A160TBW07_X[0] > A160TBW07_X ) || ( T001A7_A160TBW07_X[0] == A160TBW07_X ) && ( T001A7_A158TBW07_CRF_VERSION[0] == A158TBW07_CRF_VERSION ) && ( T001A7_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A7_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A7_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A162TBW07_Y[0] > A162TBW07_Y ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) < 0 ) || ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A150TBW07_STUDY_ID[0] < A150TBW07_STUDY_ID ) || ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A152TBW07_SUBJECT_ID[0] < A152TBW07_SUBJECT_ID ) || ( T001A7_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A154TBW07_INS_NO[0] < A154TBW07_INS_NO ) || ( T001A7_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A7_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A156TBW07_CRF_ID[0] < A156TBW07_CRF_ID ) || ( T001A7_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A7_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A7_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A158TBW07_CRF_VERSION[0] < A158TBW07_CRF_VERSION ) || ( T001A7_A158TBW07_CRF_VERSION[0] == A158TBW07_CRF_VERSION ) && ( T001A7_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A7_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A7_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A160TBW07_X[0] < A160TBW07_X ) || ( T001A7_A160TBW07_X[0] == A160TBW07_X ) && ( T001A7_A158TBW07_CRF_VERSION[0] == A158TBW07_CRF_VERSION ) && ( T001A7_A156TBW07_CRF_ID[0] == A156TBW07_CRF_ID ) && ( T001A7_A154TBW07_INS_NO[0] == A154TBW07_INS_NO ) && ( T001A7_A152TBW07_SUBJECT_ID[0] == A152TBW07_SUBJECT_ID ) && ( T001A7_A150TBW07_STUDY_ID[0] == A150TBW07_STUDY_ID ) && ( GXutil.strcmp(T001A7_A148TBW07_DISP_DATETIME[0], A148TBW07_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T001A7_A147TBW07_APP_ID[0], A147TBW07_APP_ID) == 0 ) && ( GXutil.strcmp(T001A7_A146TBW07_SESSION_ID[0], A146TBW07_SESSION_ID) == 0 ) && ( T001A7_A162TBW07_Y[0] < A162TBW07_Y ) ) )
         {
            A146TBW07_SESSION_ID = T001A7_A146TBW07_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A146TBW07_SESSION_ID", A146TBW07_SESSION_ID);
            A147TBW07_APP_ID = T001A7_A147TBW07_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A147TBW07_APP_ID", A147TBW07_APP_ID);
            A148TBW07_DISP_DATETIME = T001A7_A148TBW07_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A148TBW07_DISP_DATETIME", A148TBW07_DISP_DATETIME);
            A150TBW07_STUDY_ID = T001A7_A150TBW07_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A150TBW07_STUDY_ID", GXutil.ltrim( GXutil.str( A150TBW07_STUDY_ID, 10, 0)));
            A152TBW07_SUBJECT_ID = T001A7_A152TBW07_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A152TBW07_SUBJECT_ID", GXutil.ltrim( GXutil.str( A152TBW07_SUBJECT_ID, 6, 0)));
            A154TBW07_INS_NO = T001A7_A154TBW07_INS_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A154TBW07_INS_NO", GXutil.ltrim( GXutil.str( A154TBW07_INS_NO, 3, 0)));
            A156TBW07_CRF_ID = T001A7_A156TBW07_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A156TBW07_CRF_ID", GXutil.ltrim( GXutil.str( A156TBW07_CRF_ID, 4, 0)));
            A158TBW07_CRF_VERSION = T001A7_A158TBW07_CRF_VERSION[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A158TBW07_CRF_VERSION", GXutil.ltrim( GXutil.str( A158TBW07_CRF_VERSION, 4, 0)));
            A160TBW07_X = T001A7_A160TBW07_X[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A160TBW07_X", GXutil.ltrim( GXutil.str( A160TBW07_X, 4, 0)));
            A162TBW07_Y = T001A7_A162TBW07_Y[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A162TBW07_Y", GXutil.ltrim( GXutil.str( A162TBW07_Y, 4, 0)));
            RcdFound45 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1A45( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBW07_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1A45( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound45 == 1 )
         {
            if ( ( GXutil.strcmp(A146TBW07_SESSION_ID, Z146TBW07_SESSION_ID) != 0 ) || ( GXutil.strcmp(A147TBW07_APP_ID, Z147TBW07_APP_ID) != 0 ) || ( GXutil.strcmp(A148TBW07_DISP_DATETIME, Z148TBW07_DISP_DATETIME) != 0 ) || ( A150TBW07_STUDY_ID != Z150TBW07_STUDY_ID ) || ( A152TBW07_SUBJECT_ID != Z152TBW07_SUBJECT_ID ) || ( A154TBW07_INS_NO != Z154TBW07_INS_NO ) || ( A156TBW07_CRF_ID != Z156TBW07_CRF_ID ) || ( A158TBW07_CRF_VERSION != Z158TBW07_CRF_VERSION ) || ( A160TBW07_X != Z160TBW07_X ) || ( A162TBW07_Y != Z162TBW07_Y ) )
            {
               A146TBW07_SESSION_ID = Z146TBW07_SESSION_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A146TBW07_SESSION_ID", A146TBW07_SESSION_ID);
               A147TBW07_APP_ID = Z147TBW07_APP_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A147TBW07_APP_ID", A147TBW07_APP_ID);
               A148TBW07_DISP_DATETIME = Z148TBW07_DISP_DATETIME ;
               httpContext.ajax_rsp_assign_attri("", false, "A148TBW07_DISP_DATETIME", A148TBW07_DISP_DATETIME);
               A150TBW07_STUDY_ID = Z150TBW07_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A150TBW07_STUDY_ID", GXutil.ltrim( GXutil.str( A150TBW07_STUDY_ID, 10, 0)));
               A152TBW07_SUBJECT_ID = Z152TBW07_SUBJECT_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A152TBW07_SUBJECT_ID", GXutil.ltrim( GXutil.str( A152TBW07_SUBJECT_ID, 6, 0)));
               A154TBW07_INS_NO = Z154TBW07_INS_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A154TBW07_INS_NO", GXutil.ltrim( GXutil.str( A154TBW07_INS_NO, 3, 0)));
               A156TBW07_CRF_ID = Z156TBW07_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A156TBW07_CRF_ID", GXutil.ltrim( GXutil.str( A156TBW07_CRF_ID, 4, 0)));
               A158TBW07_CRF_VERSION = Z158TBW07_CRF_VERSION ;
               httpContext.ajax_rsp_assign_attri("", false, "A158TBW07_CRF_VERSION", GXutil.ltrim( GXutil.str( A158TBW07_CRF_VERSION, 4, 0)));
               A160TBW07_X = Z160TBW07_X ;
               httpContext.ajax_rsp_assign_attri("", false, "A160TBW07_X", GXutil.ltrim( GXutil.str( A160TBW07_X, 4, 0)));
               A162TBW07_Y = Z162TBW07_Y ;
               httpContext.ajax_rsp_assign_attri("", false, "A162TBW07_Y", GXutil.ltrim( GXutil.str( A162TBW07_Y, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW07_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW07_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBW07_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1A45( ) ;
               GX_FocusControl = edtTBW07_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A146TBW07_SESSION_ID, Z146TBW07_SESSION_ID) != 0 ) || ( GXutil.strcmp(A147TBW07_APP_ID, Z147TBW07_APP_ID) != 0 ) || ( GXutil.strcmp(A148TBW07_DISP_DATETIME, Z148TBW07_DISP_DATETIME) != 0 ) || ( A150TBW07_STUDY_ID != Z150TBW07_STUDY_ID ) || ( A152TBW07_SUBJECT_ID != Z152TBW07_SUBJECT_ID ) || ( A154TBW07_INS_NO != Z154TBW07_INS_NO ) || ( A156TBW07_CRF_ID != Z156TBW07_CRF_ID ) || ( A158TBW07_CRF_VERSION != Z158TBW07_CRF_VERSION ) || ( A160TBW07_X != Z160TBW07_X ) || ( A162TBW07_Y != Z162TBW07_Y ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW07_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1A45( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW07_SESSION_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBW07_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBW07_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1A45( ) ;
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
      if ( ( GXutil.strcmp(A146TBW07_SESSION_ID, Z146TBW07_SESSION_ID) != 0 ) || ( GXutil.strcmp(A147TBW07_APP_ID, Z147TBW07_APP_ID) != 0 ) || ( GXutil.strcmp(A148TBW07_DISP_DATETIME, Z148TBW07_DISP_DATETIME) != 0 ) || ( A150TBW07_STUDY_ID != Z150TBW07_STUDY_ID ) || ( A152TBW07_SUBJECT_ID != Z152TBW07_SUBJECT_ID ) || ( A154TBW07_INS_NO != Z154TBW07_INS_NO ) || ( A156TBW07_CRF_ID != Z156TBW07_CRF_ID ) || ( A158TBW07_CRF_VERSION != Z158TBW07_CRF_VERSION ) || ( A160TBW07_X != Z160TBW07_X ) || ( A162TBW07_Y != Z162TBW07_Y ) )
      {
         A146TBW07_SESSION_ID = Z146TBW07_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A146TBW07_SESSION_ID", A146TBW07_SESSION_ID);
         A147TBW07_APP_ID = Z147TBW07_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A147TBW07_APP_ID", A147TBW07_APP_ID);
         A148TBW07_DISP_DATETIME = Z148TBW07_DISP_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A148TBW07_DISP_DATETIME", A148TBW07_DISP_DATETIME);
         A150TBW07_STUDY_ID = Z150TBW07_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A150TBW07_STUDY_ID", GXutil.ltrim( GXutil.str( A150TBW07_STUDY_ID, 10, 0)));
         A152TBW07_SUBJECT_ID = Z152TBW07_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A152TBW07_SUBJECT_ID", GXutil.ltrim( GXutil.str( A152TBW07_SUBJECT_ID, 6, 0)));
         A154TBW07_INS_NO = Z154TBW07_INS_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A154TBW07_INS_NO", GXutil.ltrim( GXutil.str( A154TBW07_INS_NO, 3, 0)));
         A156TBW07_CRF_ID = Z156TBW07_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A156TBW07_CRF_ID", GXutil.ltrim( GXutil.str( A156TBW07_CRF_ID, 4, 0)));
         A158TBW07_CRF_VERSION = Z158TBW07_CRF_VERSION ;
         httpContext.ajax_rsp_assign_attri("", false, "A158TBW07_CRF_VERSION", GXutil.ltrim( GXutil.str( A158TBW07_CRF_VERSION, 4, 0)));
         A160TBW07_X = Z160TBW07_X ;
         httpContext.ajax_rsp_assign_attri("", false, "A160TBW07_X", GXutil.ltrim( GXutil.str( A160TBW07_X, 4, 0)));
         A162TBW07_Y = Z162TBW07_Y ;
         httpContext.ajax_rsp_assign_attri("", false, "A162TBW07_Y", GXutil.ltrim( GXutil.str( A162TBW07_Y, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW07_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW07_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW07_SESSION_ID_Internalname ;
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
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW07_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW07_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBW07_EDIT_REQUEST_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1A45( ) ;
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW07_EDIT_REQUEST_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1A45( ) ;
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
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW07_EDIT_REQUEST_FLG_Internalname ;
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
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW07_EDIT_REQUEST_FLG_Internalname ;
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
      scanStart1A45( ) ;
      if ( RcdFound45 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound45 != 0 )
         {
            scanNext1A45( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW07_EDIT_REQUEST_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1A45( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1A45( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001A2 */
         pr_default.execute(0, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW07_CRF_MEMO_LOC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z768TBW07_EDIT_REQUEST_FLG, T001A2_A768TBW07_EDIT_REQUEST_FLG[0]) != 0 ) || ( GXutil.strcmp(Z769TBW07_COLOR_DIV, T001A2_A769TBW07_COLOR_DIV[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW07_CRF_MEMO_LOC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1A45( )
   {
      beforeValidate1A45( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A45( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1A45( 0) ;
         checkOptimisticConcurrency1A45( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A45( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1A45( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001A8 */
                  pr_default.execute(6, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y), new Boolean(n768TBW07_EDIT_REQUEST_FLG), A768TBW07_EDIT_REQUEST_FLG, new Boolean(n769TBW07_COLOR_DIV), A769TBW07_COLOR_DIV});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW07_CRF_MEMO_LOC") ;
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
                        resetCaption1A0( ) ;
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
            load1A45( ) ;
         }
         endLevel1A45( ) ;
      }
      closeExtendedTableCursors1A45( ) ;
   }

   public void update1A45( )
   {
      beforeValidate1A45( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1A45( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A45( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1A45( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1A45( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001A9 */
                  pr_default.execute(7, new Object[] {new Boolean(n768TBW07_EDIT_REQUEST_FLG), A768TBW07_EDIT_REQUEST_FLG, new Boolean(n769TBW07_COLOR_DIV), A769TBW07_COLOR_DIV, A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW07_CRF_MEMO_LOC") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW07_CRF_MEMO_LOC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1A45( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption1A0( ) ;
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
         endLevel1A45( ) ;
      }
      closeExtendedTableCursors1A45( ) ;
   }

   public void deferredUpdate1A45( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1A45( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1A45( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1A45( ) ;
         afterConfirm1A45( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1A45( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001A10 */
               pr_default.execute(8, new Object[] {A146TBW07_SESSION_ID, A147TBW07_APP_ID, A148TBW07_DISP_DATETIME, new Long(A150TBW07_STUDY_ID), new Integer(A152TBW07_SUBJECT_ID), new Short(A154TBW07_INS_NO), new Short(A156TBW07_CRF_ID), new Short(A158TBW07_CRF_VERSION), new Short(A160TBW07_X), new Short(A162TBW07_Y)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW07_CRF_MEMO_LOC") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound45 == 0 )
                     {
                        initAll1A45( ) ;
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
                     resetCaption1A0( ) ;
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
      sMode45 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1A45( ) ;
      Gx_mode = sMode45 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1A45( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW07_CRF_MEMO_LOC" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      }
   }

   public void endLevel1A45( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1A45( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw07_crf_memo_loc");
         if ( AnyError == 0 )
         {
            confirmValues1A0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw07_crf_memo_loc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1A45( )
   {
      /* Scan By routine */
      /* Using cursor T001A11 */
      pr_default.execute(9);
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A146TBW07_SESSION_ID = T001A11_A146TBW07_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A146TBW07_SESSION_ID", A146TBW07_SESSION_ID);
         A147TBW07_APP_ID = T001A11_A147TBW07_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147TBW07_APP_ID", A147TBW07_APP_ID);
         A148TBW07_DISP_DATETIME = T001A11_A148TBW07_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148TBW07_DISP_DATETIME", A148TBW07_DISP_DATETIME);
         A150TBW07_STUDY_ID = T001A11_A150TBW07_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150TBW07_STUDY_ID", GXutil.ltrim( GXutil.str( A150TBW07_STUDY_ID, 10, 0)));
         A152TBW07_SUBJECT_ID = T001A11_A152TBW07_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152TBW07_SUBJECT_ID", GXutil.ltrim( GXutil.str( A152TBW07_SUBJECT_ID, 6, 0)));
         A154TBW07_INS_NO = T001A11_A154TBW07_INS_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A154TBW07_INS_NO", GXutil.ltrim( GXutil.str( A154TBW07_INS_NO, 3, 0)));
         A156TBW07_CRF_ID = T001A11_A156TBW07_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A156TBW07_CRF_ID", GXutil.ltrim( GXutil.str( A156TBW07_CRF_ID, 4, 0)));
         A158TBW07_CRF_VERSION = T001A11_A158TBW07_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A158TBW07_CRF_VERSION", GXutil.ltrim( GXutil.str( A158TBW07_CRF_VERSION, 4, 0)));
         A160TBW07_X = T001A11_A160TBW07_X[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160TBW07_X", GXutil.ltrim( GXutil.str( A160TBW07_X, 4, 0)));
         A162TBW07_Y = T001A11_A162TBW07_Y[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162TBW07_Y", GXutil.ltrim( GXutil.str( A162TBW07_Y, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1A45( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound45 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound45 = (short)(1) ;
         A146TBW07_SESSION_ID = T001A11_A146TBW07_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A146TBW07_SESSION_ID", A146TBW07_SESSION_ID);
         A147TBW07_APP_ID = T001A11_A147TBW07_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147TBW07_APP_ID", A147TBW07_APP_ID);
         A148TBW07_DISP_DATETIME = T001A11_A148TBW07_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A148TBW07_DISP_DATETIME", A148TBW07_DISP_DATETIME);
         A150TBW07_STUDY_ID = T001A11_A150TBW07_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A150TBW07_STUDY_ID", GXutil.ltrim( GXutil.str( A150TBW07_STUDY_ID, 10, 0)));
         A152TBW07_SUBJECT_ID = T001A11_A152TBW07_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A152TBW07_SUBJECT_ID", GXutil.ltrim( GXutil.str( A152TBW07_SUBJECT_ID, 6, 0)));
         A154TBW07_INS_NO = T001A11_A154TBW07_INS_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A154TBW07_INS_NO", GXutil.ltrim( GXutil.str( A154TBW07_INS_NO, 3, 0)));
         A156TBW07_CRF_ID = T001A11_A156TBW07_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A156TBW07_CRF_ID", GXutil.ltrim( GXutil.str( A156TBW07_CRF_ID, 4, 0)));
         A158TBW07_CRF_VERSION = T001A11_A158TBW07_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A158TBW07_CRF_VERSION", GXutil.ltrim( GXutil.str( A158TBW07_CRF_VERSION, 4, 0)));
         A160TBW07_X = T001A11_A160TBW07_X[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A160TBW07_X", GXutil.ltrim( GXutil.str( A160TBW07_X, 4, 0)));
         A162TBW07_Y = T001A11_A162TBW07_Y[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A162TBW07_Y", GXutil.ltrim( GXutil.str( A162TBW07_Y, 4, 0)));
      }
   }

   public void scanEnd1A45( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1A45( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1A45( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1A45( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1A45( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1A45( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1A45( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1A45( )
   {
      edtTBW07_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_SESSION_ID_Enabled, 5, 0)));
      edtTBW07_APP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_APP_ID_Enabled, 5, 0)));
      edtTBW07_DISP_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_DISP_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_DISP_DATETIME_Enabled, 5, 0)));
      edtTBW07_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_STUDY_ID_Enabled, 5, 0)));
      edtTBW07_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_SUBJECT_ID_Enabled, 5, 0)));
      edtTBW07_INS_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_INS_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_INS_NO_Enabled, 5, 0)));
      edtTBW07_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_CRF_ID_Enabled, 5, 0)));
      edtTBW07_CRF_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_CRF_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_CRF_VERSION_Enabled, 5, 0)));
      edtTBW07_X_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_X_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_X_Enabled, 5, 0)));
      edtTBW07_Y_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_Y_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_Y_Enabled, 5, 0)));
      edtTBW07_EDIT_REQUEST_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_EDIT_REQUEST_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_EDIT_REQUEST_FLG_Enabled, 5, 0)));
      edtTBW07_COLOR_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW07_COLOR_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW07_COLOR_DIV_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1A0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRFメモ位置テーブル") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317162542");
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" ;
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbw07_crf_memo_loc") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1A45( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z146TBW07_SESSION_ID", GXutil.rtrim( Z146TBW07_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z147TBW07_APP_ID", GXutil.rtrim( Z147TBW07_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z148TBW07_DISP_DATETIME", GXutil.rtrim( Z148TBW07_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "Z150TBW07_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z150TBW07_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z152TBW07_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z152TBW07_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z154TBW07_INS_NO", GXutil.ltrim( localUtil.ntoc( Z154TBW07_INS_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z156TBW07_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z156TBW07_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z158TBW07_CRF_VERSION", GXutil.ltrim( localUtil.ntoc( Z158TBW07_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z160TBW07_X", GXutil.ltrim( localUtil.ntoc( Z160TBW07_X, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z162TBW07_Y", GXutil.ltrim( localUtil.ntoc( Z162TBW07_Y, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z768TBW07_EDIT_REQUEST_FLG", GXutil.rtrim( Z768TBW07_EDIT_REQUEST_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z769TBW07_COLOR_DIV", GXutil.rtrim( Z769TBW07_COLOR_DIV));
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
      return "TBW07_CRF_MEMO_LOC" ;
   }

   public String getPgmdesc( )
   {
      return "CRFメモ位置テーブル" ;
   }

   public void initializeNonKey1A45( )
   {
      A768TBW07_EDIT_REQUEST_FLG = "" ;
      n768TBW07_EDIT_REQUEST_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A768TBW07_EDIT_REQUEST_FLG", A768TBW07_EDIT_REQUEST_FLG);
      n768TBW07_EDIT_REQUEST_FLG = ((GXutil.strcmp("", A768TBW07_EDIT_REQUEST_FLG)==0) ? true : false) ;
      A769TBW07_COLOR_DIV = "" ;
      n769TBW07_COLOR_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A769TBW07_COLOR_DIV", A769TBW07_COLOR_DIV);
      n769TBW07_COLOR_DIV = ((GXutil.strcmp("", A769TBW07_COLOR_DIV)==0) ? true : false) ;
   }

   public void initAll1A45( )
   {
      A146TBW07_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A146TBW07_SESSION_ID", A146TBW07_SESSION_ID);
      A147TBW07_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A147TBW07_APP_ID", A147TBW07_APP_ID);
      A148TBW07_DISP_DATETIME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A148TBW07_DISP_DATETIME", A148TBW07_DISP_DATETIME);
      A150TBW07_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A150TBW07_STUDY_ID", GXutil.ltrim( GXutil.str( A150TBW07_STUDY_ID, 10, 0)));
      A152TBW07_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A152TBW07_SUBJECT_ID", GXutil.ltrim( GXutil.str( A152TBW07_SUBJECT_ID, 6, 0)));
      A154TBW07_INS_NO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A154TBW07_INS_NO", GXutil.ltrim( GXutil.str( A154TBW07_INS_NO, 3, 0)));
      A156TBW07_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A156TBW07_CRF_ID", GXutil.ltrim( GXutil.str( A156TBW07_CRF_ID, 4, 0)));
      A158TBW07_CRF_VERSION = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A158TBW07_CRF_VERSION", GXutil.ltrim( GXutil.str( A158TBW07_CRF_VERSION, 4, 0)));
      A160TBW07_X = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A160TBW07_X", GXutil.ltrim( GXutil.str( A160TBW07_X, 4, 0)));
      A162TBW07_Y = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A162TBW07_Y", GXutil.ltrim( GXutil.str( A162TBW07_Y, 4, 0)));
      initializeNonKey1A45( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122662");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317162547");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbw07_crf_memo_loc.js", "?20177317162547");
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
      lblTextblocktbw07_session_id_Internalname = "TEXTBLOCKTBW07_SESSION_ID" ;
      edtTBW07_SESSION_ID_Internalname = "TBW07_SESSION_ID" ;
      lblTextblocktbw07_app_id_Internalname = "TEXTBLOCKTBW07_APP_ID" ;
      edtTBW07_APP_ID_Internalname = "TBW07_APP_ID" ;
      lblTextblocktbw07_disp_datetime_Internalname = "TEXTBLOCKTBW07_DISP_DATETIME" ;
      edtTBW07_DISP_DATETIME_Internalname = "TBW07_DISP_DATETIME" ;
      lblTextblocktbw07_study_id_Internalname = "TEXTBLOCKTBW07_STUDY_ID" ;
      edtTBW07_STUDY_ID_Internalname = "TBW07_STUDY_ID" ;
      lblTextblocktbw07_subject_id_Internalname = "TEXTBLOCKTBW07_SUBJECT_ID" ;
      edtTBW07_SUBJECT_ID_Internalname = "TBW07_SUBJECT_ID" ;
      lblTextblocktbw07_ins_no_Internalname = "TEXTBLOCKTBW07_INS_NO" ;
      edtTBW07_INS_NO_Internalname = "TBW07_INS_NO" ;
      lblTextblocktbw07_crf_id_Internalname = "TEXTBLOCKTBW07_CRF_ID" ;
      edtTBW07_CRF_ID_Internalname = "TBW07_CRF_ID" ;
      lblTextblocktbw07_crf_version_Internalname = "TEXTBLOCKTBW07_CRF_VERSION" ;
      edtTBW07_CRF_VERSION_Internalname = "TBW07_CRF_VERSION" ;
      lblTextblocktbw07_x_Internalname = "TEXTBLOCKTBW07_X" ;
      edtTBW07_X_Internalname = "TBW07_X" ;
      lblTextblocktbw07_y_Internalname = "TEXTBLOCKTBW07_Y" ;
      edtTBW07_Y_Internalname = "TBW07_Y" ;
      lblTextblocktbw07_edit_request_flg_Internalname = "TEXTBLOCKTBW07_EDIT_REQUEST_FLG" ;
      edtTBW07_EDIT_REQUEST_FLG_Internalname = "TBW07_EDIT_REQUEST_FLG" ;
      lblTextblocktbw07_color_div_Internalname = "TEXTBLOCKTBW07_COLOR_DIV" ;
      edtTBW07_COLOR_DIV_Internalname = "TBW07_COLOR_DIV" ;
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
      edtTBW07_COLOR_DIV_Jsonclick = "" ;
      edtTBW07_COLOR_DIV_Enabled = 1 ;
      edtTBW07_EDIT_REQUEST_FLG_Jsonclick = "" ;
      edtTBW07_EDIT_REQUEST_FLG_Enabled = 1 ;
      edtTBW07_Y_Jsonclick = "" ;
      edtTBW07_Y_Enabled = 1 ;
      edtTBW07_X_Jsonclick = "" ;
      edtTBW07_X_Enabled = 1 ;
      edtTBW07_CRF_VERSION_Jsonclick = "" ;
      edtTBW07_CRF_VERSION_Enabled = 1 ;
      edtTBW07_CRF_ID_Jsonclick = "" ;
      edtTBW07_CRF_ID_Enabled = 1 ;
      edtTBW07_INS_NO_Jsonclick = "" ;
      edtTBW07_INS_NO_Enabled = 1 ;
      edtTBW07_SUBJECT_ID_Jsonclick = "" ;
      edtTBW07_SUBJECT_ID_Enabled = 1 ;
      edtTBW07_STUDY_ID_Jsonclick = "" ;
      edtTBW07_STUDY_ID_Enabled = 1 ;
      edtTBW07_DISP_DATETIME_Jsonclick = "" ;
      edtTBW07_DISP_DATETIME_Enabled = 1 ;
      edtTBW07_APP_ID_Jsonclick = "" ;
      edtTBW07_APP_ID_Enabled = 1 ;
      edtTBW07_SESSION_ID_Jsonclick = "" ;
      edtTBW07_SESSION_ID_Enabled = 1 ;
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
      GX_FocusControl = edtTBW07_EDIT_REQUEST_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw07_y( String GX_Parm1 ,
                              String GX_Parm2 ,
                              String GX_Parm3 ,
                              long GX_Parm4 ,
                              int GX_Parm5 ,
                              short GX_Parm6 ,
                              short GX_Parm7 ,
                              short GX_Parm8 ,
                              short GX_Parm9 ,
                              short GX_Parm10 ,
                              String GX_Parm11 ,
                              String GX_Parm12 )
   {
      A146TBW07_SESSION_ID = GX_Parm1 ;
      A147TBW07_APP_ID = GX_Parm2 ;
      A148TBW07_DISP_DATETIME = GX_Parm3 ;
      A150TBW07_STUDY_ID = GX_Parm4 ;
      A152TBW07_SUBJECT_ID = GX_Parm5 ;
      A154TBW07_INS_NO = GX_Parm6 ;
      A156TBW07_CRF_ID = GX_Parm7 ;
      A158TBW07_CRF_VERSION = GX_Parm8 ;
      A160TBW07_X = GX_Parm9 ;
      A162TBW07_Y = GX_Parm10 ;
      A768TBW07_EDIT_REQUEST_FLG = GX_Parm11 ;
      n768TBW07_EDIT_REQUEST_FLG = false ;
      A769TBW07_COLOR_DIV = GX_Parm12 ;
      n769TBW07_COLOR_DIV = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.rtrim( A768TBW07_EDIT_REQUEST_FLG));
      isValidOutput.add(GXutil.rtrim( A769TBW07_COLOR_DIV));
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z146TBW07_SESSION_ID));
      isValidOutput.add(GXutil.rtrim( Z147TBW07_APP_ID));
      isValidOutput.add(GXutil.rtrim( Z148TBW07_DISP_DATETIME));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z150TBW07_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z152TBW07_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z154TBW07_INS_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z156TBW07_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z158TBW07_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z160TBW07_X, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z162TBW07_Y, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z768TBW07_EDIT_REQUEST_FLG));
      isValidOutput.add(GXutil.rtrim( Z769TBW07_COLOR_DIV));
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
      Z146TBW07_SESSION_ID = "" ;
      Z147TBW07_APP_ID = "" ;
      Z148TBW07_DISP_DATETIME = "" ;
      Z768TBW07_EDIT_REQUEST_FLG = "" ;
      Z769TBW07_COLOR_DIV = "" ;
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
      lblTextblocktbw07_session_id_Jsonclick = "" ;
      A146TBW07_SESSION_ID = "" ;
      lblTextblocktbw07_app_id_Jsonclick = "" ;
      A147TBW07_APP_ID = "" ;
      lblTextblocktbw07_disp_datetime_Jsonclick = "" ;
      A148TBW07_DISP_DATETIME = "" ;
      lblTextblocktbw07_study_id_Jsonclick = "" ;
      lblTextblocktbw07_subject_id_Jsonclick = "" ;
      lblTextblocktbw07_ins_no_Jsonclick = "" ;
      lblTextblocktbw07_crf_id_Jsonclick = "" ;
      lblTextblocktbw07_crf_version_Jsonclick = "" ;
      lblTextblocktbw07_x_Jsonclick = "" ;
      lblTextblocktbw07_y_Jsonclick = "" ;
      lblTextblocktbw07_edit_request_flg_Jsonclick = "" ;
      A768TBW07_EDIT_REQUEST_FLG = "" ;
      lblTextblocktbw07_color_div_Jsonclick = "" ;
      A769TBW07_COLOR_DIV = "" ;
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
      T001A4_A146TBW07_SESSION_ID = new String[] {""} ;
      T001A4_A147TBW07_APP_ID = new String[] {""} ;
      T001A4_A148TBW07_DISP_DATETIME = new String[] {""} ;
      T001A4_A150TBW07_STUDY_ID = new long[1] ;
      T001A4_A152TBW07_SUBJECT_ID = new int[1] ;
      T001A4_A154TBW07_INS_NO = new short[1] ;
      T001A4_A156TBW07_CRF_ID = new short[1] ;
      T001A4_A158TBW07_CRF_VERSION = new short[1] ;
      T001A4_A160TBW07_X = new short[1] ;
      T001A4_A162TBW07_Y = new short[1] ;
      T001A4_A768TBW07_EDIT_REQUEST_FLG = new String[] {""} ;
      T001A4_n768TBW07_EDIT_REQUEST_FLG = new boolean[] {false} ;
      T001A4_A769TBW07_COLOR_DIV = new String[] {""} ;
      T001A4_n769TBW07_COLOR_DIV = new boolean[] {false} ;
      T001A5_A146TBW07_SESSION_ID = new String[] {""} ;
      T001A5_A147TBW07_APP_ID = new String[] {""} ;
      T001A5_A148TBW07_DISP_DATETIME = new String[] {""} ;
      T001A5_A150TBW07_STUDY_ID = new long[1] ;
      T001A5_A152TBW07_SUBJECT_ID = new int[1] ;
      T001A5_A154TBW07_INS_NO = new short[1] ;
      T001A5_A156TBW07_CRF_ID = new short[1] ;
      T001A5_A158TBW07_CRF_VERSION = new short[1] ;
      T001A5_A160TBW07_X = new short[1] ;
      T001A5_A162TBW07_Y = new short[1] ;
      T001A3_A146TBW07_SESSION_ID = new String[] {""} ;
      T001A3_A147TBW07_APP_ID = new String[] {""} ;
      T001A3_A148TBW07_DISP_DATETIME = new String[] {""} ;
      T001A3_A150TBW07_STUDY_ID = new long[1] ;
      T001A3_A152TBW07_SUBJECT_ID = new int[1] ;
      T001A3_A154TBW07_INS_NO = new short[1] ;
      T001A3_A156TBW07_CRF_ID = new short[1] ;
      T001A3_A158TBW07_CRF_VERSION = new short[1] ;
      T001A3_A160TBW07_X = new short[1] ;
      T001A3_A162TBW07_Y = new short[1] ;
      T001A3_A768TBW07_EDIT_REQUEST_FLG = new String[] {""} ;
      T001A3_n768TBW07_EDIT_REQUEST_FLG = new boolean[] {false} ;
      T001A3_A769TBW07_COLOR_DIV = new String[] {""} ;
      T001A3_n769TBW07_COLOR_DIV = new boolean[] {false} ;
      sMode45 = "" ;
      T001A6_A146TBW07_SESSION_ID = new String[] {""} ;
      T001A6_A147TBW07_APP_ID = new String[] {""} ;
      T001A6_A148TBW07_DISP_DATETIME = new String[] {""} ;
      T001A6_A150TBW07_STUDY_ID = new long[1] ;
      T001A6_A152TBW07_SUBJECT_ID = new int[1] ;
      T001A6_A154TBW07_INS_NO = new short[1] ;
      T001A6_A156TBW07_CRF_ID = new short[1] ;
      T001A6_A158TBW07_CRF_VERSION = new short[1] ;
      T001A6_A160TBW07_X = new short[1] ;
      T001A6_A162TBW07_Y = new short[1] ;
      T001A7_A146TBW07_SESSION_ID = new String[] {""} ;
      T001A7_A147TBW07_APP_ID = new String[] {""} ;
      T001A7_A148TBW07_DISP_DATETIME = new String[] {""} ;
      T001A7_A150TBW07_STUDY_ID = new long[1] ;
      T001A7_A152TBW07_SUBJECT_ID = new int[1] ;
      T001A7_A154TBW07_INS_NO = new short[1] ;
      T001A7_A156TBW07_CRF_ID = new short[1] ;
      T001A7_A158TBW07_CRF_VERSION = new short[1] ;
      T001A7_A160TBW07_X = new short[1] ;
      T001A7_A162TBW07_Y = new short[1] ;
      T001A2_A146TBW07_SESSION_ID = new String[] {""} ;
      T001A2_A147TBW07_APP_ID = new String[] {""} ;
      T001A2_A148TBW07_DISP_DATETIME = new String[] {""} ;
      T001A2_A150TBW07_STUDY_ID = new long[1] ;
      T001A2_A152TBW07_SUBJECT_ID = new int[1] ;
      T001A2_A154TBW07_INS_NO = new short[1] ;
      T001A2_A156TBW07_CRF_ID = new short[1] ;
      T001A2_A158TBW07_CRF_VERSION = new short[1] ;
      T001A2_A160TBW07_X = new short[1] ;
      T001A2_A162TBW07_Y = new short[1] ;
      T001A2_A768TBW07_EDIT_REQUEST_FLG = new String[] {""} ;
      T001A2_n768TBW07_EDIT_REQUEST_FLG = new boolean[] {false} ;
      T001A2_A769TBW07_COLOR_DIV = new String[] {""} ;
      T001A2_n769TBW07_COLOR_DIV = new boolean[] {false} ;
      T001A11_A146TBW07_SESSION_ID = new String[] {""} ;
      T001A11_A147TBW07_APP_ID = new String[] {""} ;
      T001A11_A148TBW07_DISP_DATETIME = new String[] {""} ;
      T001A11_A150TBW07_STUDY_ID = new long[1] ;
      T001A11_A152TBW07_SUBJECT_ID = new int[1] ;
      T001A11_A154TBW07_INS_NO = new short[1] ;
      T001A11_A156TBW07_CRF_ID = new short[1] ;
      T001A11_A158TBW07_CRF_VERSION = new short[1] ;
      T001A11_A160TBW07_X = new short[1] ;
      T001A11_A162TBW07_Y = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw07_crf_memo_loc__default(),
         new Object[] {
             new Object[] {
            T001A2_A146TBW07_SESSION_ID, T001A2_A147TBW07_APP_ID, T001A2_A148TBW07_DISP_DATETIME, T001A2_A150TBW07_STUDY_ID, T001A2_A152TBW07_SUBJECT_ID, T001A2_A154TBW07_INS_NO, T001A2_A156TBW07_CRF_ID, T001A2_A158TBW07_CRF_VERSION, T001A2_A160TBW07_X, T001A2_A162TBW07_Y,
            T001A2_A768TBW07_EDIT_REQUEST_FLG, T001A2_n768TBW07_EDIT_REQUEST_FLG, T001A2_A769TBW07_COLOR_DIV, T001A2_n769TBW07_COLOR_DIV
            }
            , new Object[] {
            T001A3_A146TBW07_SESSION_ID, T001A3_A147TBW07_APP_ID, T001A3_A148TBW07_DISP_DATETIME, T001A3_A150TBW07_STUDY_ID, T001A3_A152TBW07_SUBJECT_ID, T001A3_A154TBW07_INS_NO, T001A3_A156TBW07_CRF_ID, T001A3_A158TBW07_CRF_VERSION, T001A3_A160TBW07_X, T001A3_A162TBW07_Y,
            T001A3_A768TBW07_EDIT_REQUEST_FLG, T001A3_n768TBW07_EDIT_REQUEST_FLG, T001A3_A769TBW07_COLOR_DIV, T001A3_n769TBW07_COLOR_DIV
            }
            , new Object[] {
            T001A4_A146TBW07_SESSION_ID, T001A4_A147TBW07_APP_ID, T001A4_A148TBW07_DISP_DATETIME, T001A4_A150TBW07_STUDY_ID, T001A4_A152TBW07_SUBJECT_ID, T001A4_A154TBW07_INS_NO, T001A4_A156TBW07_CRF_ID, T001A4_A158TBW07_CRF_VERSION, T001A4_A160TBW07_X, T001A4_A162TBW07_Y,
            T001A4_A768TBW07_EDIT_REQUEST_FLG, T001A4_n768TBW07_EDIT_REQUEST_FLG, T001A4_A769TBW07_COLOR_DIV, T001A4_n769TBW07_COLOR_DIV
            }
            , new Object[] {
            T001A5_A146TBW07_SESSION_ID, T001A5_A147TBW07_APP_ID, T001A5_A148TBW07_DISP_DATETIME, T001A5_A150TBW07_STUDY_ID, T001A5_A152TBW07_SUBJECT_ID, T001A5_A154TBW07_INS_NO, T001A5_A156TBW07_CRF_ID, T001A5_A158TBW07_CRF_VERSION, T001A5_A160TBW07_X, T001A5_A162TBW07_Y
            }
            , new Object[] {
            T001A6_A146TBW07_SESSION_ID, T001A6_A147TBW07_APP_ID, T001A6_A148TBW07_DISP_DATETIME, T001A6_A150TBW07_STUDY_ID, T001A6_A152TBW07_SUBJECT_ID, T001A6_A154TBW07_INS_NO, T001A6_A156TBW07_CRF_ID, T001A6_A158TBW07_CRF_VERSION, T001A6_A160TBW07_X, T001A6_A162TBW07_Y
            }
            , new Object[] {
            T001A7_A146TBW07_SESSION_ID, T001A7_A147TBW07_APP_ID, T001A7_A148TBW07_DISP_DATETIME, T001A7_A150TBW07_STUDY_ID, T001A7_A152TBW07_SUBJECT_ID, T001A7_A154TBW07_INS_NO, T001A7_A156TBW07_CRF_ID, T001A7_A158TBW07_CRF_VERSION, T001A7_A160TBW07_X, T001A7_A162TBW07_Y
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001A11_A146TBW07_SESSION_ID, T001A11_A147TBW07_APP_ID, T001A11_A148TBW07_DISP_DATETIME, T001A11_A150TBW07_STUDY_ID, T001A11_A152TBW07_SUBJECT_ID, T001A11_A154TBW07_INS_NO, T001A11_A156TBW07_CRF_ID, T001A11_A158TBW07_CRF_VERSION, T001A11_A160TBW07_X, T001A11_A162TBW07_Y
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW07_CRF_MEMO_LOC" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z154TBW07_INS_NO ;
   private short Z156TBW07_CRF_ID ;
   private short Z158TBW07_CRF_VERSION ;
   private short Z160TBW07_X ;
   private short Z162TBW07_Y ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A154TBW07_INS_NO ;
   private short A156TBW07_CRF_ID ;
   private short A158TBW07_CRF_VERSION ;
   private short A160TBW07_X ;
   private short A162TBW07_Y ;
   private short RcdFound45 ;
   private short Gx_err ;
   private int Z152TBW07_SUBJECT_ID ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW07_SESSION_ID_Enabled ;
   private int edtTBW07_APP_ID_Enabled ;
   private int edtTBW07_DISP_DATETIME_Enabled ;
   private int edtTBW07_STUDY_ID_Enabled ;
   private int A152TBW07_SUBJECT_ID ;
   private int edtTBW07_SUBJECT_ID_Enabled ;
   private int edtTBW07_INS_NO_Enabled ;
   private int edtTBW07_CRF_ID_Enabled ;
   private int edtTBW07_CRF_VERSION_Enabled ;
   private int edtTBW07_X_Enabled ;
   private int edtTBW07_Y_Enabled ;
   private int edtTBW07_EDIT_REQUEST_FLG_Enabled ;
   private int edtTBW07_COLOR_DIV_Enabled ;
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
   private long Z150TBW07_STUDY_ID ;
   private long A150TBW07_STUDY_ID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW07_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw07_session_id_Internalname ;
   private String lblTextblocktbw07_session_id_Jsonclick ;
   private String edtTBW07_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw07_app_id_Internalname ;
   private String lblTextblocktbw07_app_id_Jsonclick ;
   private String edtTBW07_APP_ID_Internalname ;
   private String edtTBW07_APP_ID_Jsonclick ;
   private String lblTextblocktbw07_disp_datetime_Internalname ;
   private String lblTextblocktbw07_disp_datetime_Jsonclick ;
   private String edtTBW07_DISP_DATETIME_Internalname ;
   private String edtTBW07_DISP_DATETIME_Jsonclick ;
   private String lblTextblocktbw07_study_id_Internalname ;
   private String lblTextblocktbw07_study_id_Jsonclick ;
   private String edtTBW07_STUDY_ID_Internalname ;
   private String edtTBW07_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw07_subject_id_Internalname ;
   private String lblTextblocktbw07_subject_id_Jsonclick ;
   private String edtTBW07_SUBJECT_ID_Internalname ;
   private String edtTBW07_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbw07_ins_no_Internalname ;
   private String lblTextblocktbw07_ins_no_Jsonclick ;
   private String edtTBW07_INS_NO_Internalname ;
   private String edtTBW07_INS_NO_Jsonclick ;
   private String lblTextblocktbw07_crf_id_Internalname ;
   private String lblTextblocktbw07_crf_id_Jsonclick ;
   private String edtTBW07_CRF_ID_Internalname ;
   private String edtTBW07_CRF_ID_Jsonclick ;
   private String lblTextblocktbw07_crf_version_Internalname ;
   private String lblTextblocktbw07_crf_version_Jsonclick ;
   private String edtTBW07_CRF_VERSION_Internalname ;
   private String edtTBW07_CRF_VERSION_Jsonclick ;
   private String lblTextblocktbw07_x_Internalname ;
   private String lblTextblocktbw07_x_Jsonclick ;
   private String edtTBW07_X_Internalname ;
   private String edtTBW07_X_Jsonclick ;
   private String lblTextblocktbw07_y_Internalname ;
   private String lblTextblocktbw07_y_Jsonclick ;
   private String edtTBW07_Y_Internalname ;
   private String edtTBW07_Y_Jsonclick ;
   private String lblTextblocktbw07_edit_request_flg_Internalname ;
   private String lblTextblocktbw07_edit_request_flg_Jsonclick ;
   private String edtTBW07_EDIT_REQUEST_FLG_Internalname ;
   private String edtTBW07_EDIT_REQUEST_FLG_Jsonclick ;
   private String lblTextblocktbw07_color_div_Internalname ;
   private String lblTextblocktbw07_color_div_Jsonclick ;
   private String edtTBW07_COLOR_DIV_Internalname ;
   private String edtTBW07_COLOR_DIV_Jsonclick ;
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
   private String sMode45 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n768TBW07_EDIT_REQUEST_FLG ;
   private boolean n769TBW07_COLOR_DIV ;
   private boolean toggleJsOutput ;
   private String Z146TBW07_SESSION_ID ;
   private String Z147TBW07_APP_ID ;
   private String Z148TBW07_DISP_DATETIME ;
   private String Z768TBW07_EDIT_REQUEST_FLG ;
   private String Z769TBW07_COLOR_DIV ;
   private String A146TBW07_SESSION_ID ;
   private String A147TBW07_APP_ID ;
   private String A148TBW07_DISP_DATETIME ;
   private String A768TBW07_EDIT_REQUEST_FLG ;
   private String A769TBW07_COLOR_DIV ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001A4_A146TBW07_SESSION_ID ;
   private String[] T001A4_A147TBW07_APP_ID ;
   private String[] T001A4_A148TBW07_DISP_DATETIME ;
   private long[] T001A4_A150TBW07_STUDY_ID ;
   private int[] T001A4_A152TBW07_SUBJECT_ID ;
   private short[] T001A4_A154TBW07_INS_NO ;
   private short[] T001A4_A156TBW07_CRF_ID ;
   private short[] T001A4_A158TBW07_CRF_VERSION ;
   private short[] T001A4_A160TBW07_X ;
   private short[] T001A4_A162TBW07_Y ;
   private String[] T001A4_A768TBW07_EDIT_REQUEST_FLG ;
   private boolean[] T001A4_n768TBW07_EDIT_REQUEST_FLG ;
   private String[] T001A4_A769TBW07_COLOR_DIV ;
   private boolean[] T001A4_n769TBW07_COLOR_DIV ;
   private String[] T001A5_A146TBW07_SESSION_ID ;
   private String[] T001A5_A147TBW07_APP_ID ;
   private String[] T001A5_A148TBW07_DISP_DATETIME ;
   private long[] T001A5_A150TBW07_STUDY_ID ;
   private int[] T001A5_A152TBW07_SUBJECT_ID ;
   private short[] T001A5_A154TBW07_INS_NO ;
   private short[] T001A5_A156TBW07_CRF_ID ;
   private short[] T001A5_A158TBW07_CRF_VERSION ;
   private short[] T001A5_A160TBW07_X ;
   private short[] T001A5_A162TBW07_Y ;
   private String[] T001A3_A146TBW07_SESSION_ID ;
   private String[] T001A3_A147TBW07_APP_ID ;
   private String[] T001A3_A148TBW07_DISP_DATETIME ;
   private long[] T001A3_A150TBW07_STUDY_ID ;
   private int[] T001A3_A152TBW07_SUBJECT_ID ;
   private short[] T001A3_A154TBW07_INS_NO ;
   private short[] T001A3_A156TBW07_CRF_ID ;
   private short[] T001A3_A158TBW07_CRF_VERSION ;
   private short[] T001A3_A160TBW07_X ;
   private short[] T001A3_A162TBW07_Y ;
   private String[] T001A3_A768TBW07_EDIT_REQUEST_FLG ;
   private boolean[] T001A3_n768TBW07_EDIT_REQUEST_FLG ;
   private String[] T001A3_A769TBW07_COLOR_DIV ;
   private boolean[] T001A3_n769TBW07_COLOR_DIV ;
   private String[] T001A6_A146TBW07_SESSION_ID ;
   private String[] T001A6_A147TBW07_APP_ID ;
   private String[] T001A6_A148TBW07_DISP_DATETIME ;
   private long[] T001A6_A150TBW07_STUDY_ID ;
   private int[] T001A6_A152TBW07_SUBJECT_ID ;
   private short[] T001A6_A154TBW07_INS_NO ;
   private short[] T001A6_A156TBW07_CRF_ID ;
   private short[] T001A6_A158TBW07_CRF_VERSION ;
   private short[] T001A6_A160TBW07_X ;
   private short[] T001A6_A162TBW07_Y ;
   private String[] T001A7_A146TBW07_SESSION_ID ;
   private String[] T001A7_A147TBW07_APP_ID ;
   private String[] T001A7_A148TBW07_DISP_DATETIME ;
   private long[] T001A7_A150TBW07_STUDY_ID ;
   private int[] T001A7_A152TBW07_SUBJECT_ID ;
   private short[] T001A7_A154TBW07_INS_NO ;
   private short[] T001A7_A156TBW07_CRF_ID ;
   private short[] T001A7_A158TBW07_CRF_VERSION ;
   private short[] T001A7_A160TBW07_X ;
   private short[] T001A7_A162TBW07_Y ;
   private String[] T001A2_A146TBW07_SESSION_ID ;
   private String[] T001A2_A147TBW07_APP_ID ;
   private String[] T001A2_A148TBW07_DISP_DATETIME ;
   private long[] T001A2_A150TBW07_STUDY_ID ;
   private int[] T001A2_A152TBW07_SUBJECT_ID ;
   private short[] T001A2_A154TBW07_INS_NO ;
   private short[] T001A2_A156TBW07_CRF_ID ;
   private short[] T001A2_A158TBW07_CRF_VERSION ;
   private short[] T001A2_A160TBW07_X ;
   private short[] T001A2_A162TBW07_Y ;
   private String[] T001A2_A768TBW07_EDIT_REQUEST_FLG ;
   private boolean[] T001A2_n768TBW07_EDIT_REQUEST_FLG ;
   private String[] T001A2_A769TBW07_COLOR_DIV ;
   private boolean[] T001A2_n769TBW07_COLOR_DIV ;
   private String[] T001A11_A146TBW07_SESSION_ID ;
   private String[] T001A11_A147TBW07_APP_ID ;
   private String[] T001A11_A148TBW07_DISP_DATETIME ;
   private long[] T001A11_A150TBW07_STUDY_ID ;
   private int[] T001A11_A152TBW07_SUBJECT_ID ;
   private short[] T001A11_A154TBW07_INS_NO ;
   private short[] T001A11_A156TBW07_CRF_ID ;
   private short[] T001A11_A158TBW07_CRF_VERSION ;
   private short[] T001A11_A160TBW07_X ;
   private short[] T001A11_A162TBW07_Y ;
}

final  class tbw07_crf_memo_loc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001A2", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y`, `TBW07_EDIT_REQUEST_FLG`, `TBW07_COLOR_DIV` FROM `TBW07_CRF_MEMO_LOC` WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001A3", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y`, `TBW07_EDIT_REQUEST_FLG`, `TBW07_COLOR_DIV` FROM `TBW07_CRF_MEMO_LOC` WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001A4", "SELECT TM1.`TBW07_SESSION_ID`, TM1.`TBW07_APP_ID`, TM1.`TBW07_DISP_DATETIME`, TM1.`TBW07_STUDY_ID`, TM1.`TBW07_SUBJECT_ID`, TM1.`TBW07_INS_NO`, TM1.`TBW07_CRF_ID`, TM1.`TBW07_CRF_VERSION`, TM1.`TBW07_X`, TM1.`TBW07_Y`, TM1.`TBW07_EDIT_REQUEST_FLG`, TM1.`TBW07_COLOR_DIV` FROM `TBW07_CRF_MEMO_LOC` TM1 WHERE TM1.`TBW07_SESSION_ID` = ? and TM1.`TBW07_APP_ID` = ? and TM1.`TBW07_DISP_DATETIME` = ? and TM1.`TBW07_STUDY_ID` = ? and TM1.`TBW07_SUBJECT_ID` = ? and TM1.`TBW07_INS_NO` = ? and TM1.`TBW07_CRF_ID` = ? and TM1.`TBW07_CRF_VERSION` = ? and TM1.`TBW07_X` = ? and TM1.`TBW07_Y` = ? ORDER BY TM1.`TBW07_SESSION_ID`, TM1.`TBW07_APP_ID`, TM1.`TBW07_DISP_DATETIME`, TM1.`TBW07_STUDY_ID`, TM1.`TBW07_SUBJECT_ID`, TM1.`TBW07_INS_NO`, TM1.`TBW07_CRF_ID`, TM1.`TBW07_CRF_VERSION`, TM1.`TBW07_X`, TM1.`TBW07_Y` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001A5", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y` FROM `TBW07_CRF_MEMO_LOC` WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001A6", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y` FROM `TBW07_CRF_MEMO_LOC` WHERE ( `TBW07_SESSION_ID` > ? or `TBW07_SESSION_ID` = ? and `TBW07_APP_ID` > ? or `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_DISP_DATETIME` > ? or `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_STUDY_ID` > ? or `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_SUBJECT_ID` > ? or `TBW07_SUBJECT_ID` = ? and `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_INS_NO` > ? or `TBW07_INS_NO` = ? and `TBW07_SUBJECT_ID` = ? and `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_CRF_ID` > ? or `TBW07_CRF_ID` = ? and `TBW07_INS_NO` = ? and `TBW07_SUBJECT_ID` = ? and `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_CRF_VERSION` > ? or `TBW07_CRF_VERSION` = ? and `TBW07_CRF_ID` = ? and `TBW07_INS_NO` = ? and `TBW07_SUBJECT_ID` = ? and `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_X` > ? or `TBW07_X` = ? and `TBW07_CRF_VERSION` = ? and `TBW07_CRF_ID` = ? and `TBW07_INS_NO` = ? and `TBW07_SUBJECT_ID` = ? and `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_Y` > ?) ORDER BY `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001A7", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y` FROM `TBW07_CRF_MEMO_LOC` WHERE ( `TBW07_SESSION_ID` < ? or `TBW07_SESSION_ID` = ? and `TBW07_APP_ID` < ? or `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_DISP_DATETIME` < ? or `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_STUDY_ID` < ? or `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_SUBJECT_ID` < ? or `TBW07_SUBJECT_ID` = ? and `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_INS_NO` < ? or `TBW07_INS_NO` = ? and `TBW07_SUBJECT_ID` = ? and `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_CRF_ID` < ? or `TBW07_CRF_ID` = ? and `TBW07_INS_NO` = ? and `TBW07_SUBJECT_ID` = ? and `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_CRF_VERSION` < ? or `TBW07_CRF_VERSION` = ? and `TBW07_CRF_ID` = ? and `TBW07_INS_NO` = ? and `TBW07_SUBJECT_ID` = ? and `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_X` < ? or `TBW07_X` = ? and `TBW07_CRF_VERSION` = ? and `TBW07_CRF_ID` = ? and `TBW07_INS_NO` = ? and `TBW07_SUBJECT_ID` = ? and `TBW07_STUDY_ID` = ? and `TBW07_DISP_DATETIME` = ? and `TBW07_APP_ID` = ? and `TBW07_SESSION_ID` = ? and `TBW07_Y` < ?) ORDER BY `TBW07_SESSION_ID` DESC, `TBW07_APP_ID` DESC, `TBW07_DISP_DATETIME` DESC, `TBW07_STUDY_ID` DESC, `TBW07_SUBJECT_ID` DESC, `TBW07_INS_NO` DESC, `TBW07_CRF_ID` DESC, `TBW07_CRF_VERSION` DESC, `TBW07_X` DESC, `TBW07_Y` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001A8", "INSERT INTO `TBW07_CRF_MEMO_LOC`(`TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y`, `TBW07_EDIT_REQUEST_FLG`, `TBW07_COLOR_DIV`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001A9", "UPDATE `TBW07_CRF_MEMO_LOC` SET `TBW07_EDIT_REQUEST_FLG`=?, `TBW07_COLOR_DIV`=?  WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ?", GX_NOMASK)
         ,new UpdateCursor("T001A10", "DELETE FROM `TBW07_CRF_MEMO_LOC`  WHERE `TBW07_SESSION_ID` = ? AND `TBW07_APP_ID` = ? AND `TBW07_DISP_DATETIME` = ? AND `TBW07_STUDY_ID` = ? AND `TBW07_SUBJECT_ID` = ? AND `TBW07_INS_NO` = ? AND `TBW07_CRF_ID` = ? AND `TBW07_CRF_VERSION` = ? AND `TBW07_X` = ? AND `TBW07_Y` = ?", GX_NOMASK)
         ,new ForEachCursor("T001A11", "SELECT `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y` FROM `TBW07_CRF_MEMO_LOC` ORDER BY `TBW07_SESSION_ID`, `TBW07_APP_ID`, `TBW07_DISP_DATETIME`, `TBW07_STUDY_ID`, `TBW07_SUBJECT_ID`, `TBW07_INS_NO`, `TBW07_CRF_ID`, `TBW07_CRF_VERSION`, `TBW07_X`, `TBW07_Y` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               ((String[]) buf[10])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               ((short[]) buf[6])[0] = rslt.getShort(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((short[]) buf[8])[0] = rslt.getShort(9) ;
               ((short[]) buf[9])[0] = rslt.getShort(10) ;
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
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
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
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               stmt.setShort(29, ((Number) parms[28]).shortValue());
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setLong(32, ((Number) parms[31]).longValue());
               stmt.setVarchar(33, (String)parms[32], 14, false);
               stmt.setVarchar(34, (String)parms[33], 7, false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setShort(36, ((Number) parms[35]).shortValue());
               stmt.setShort(37, ((Number) parms[36]).shortValue());
               stmt.setShort(38, ((Number) parms[37]).shortValue());
               stmt.setShort(39, ((Number) parms[38]).shortValue());
               stmt.setInt(40, ((Number) parms[39]).intValue());
               stmt.setLong(41, ((Number) parms[40]).longValue());
               stmt.setVarchar(42, (String)parms[41], 14, false);
               stmt.setVarchar(43, (String)parms[42], 7, false);
               stmt.setVarchar(44, (String)parms[43], 50, false);
               stmt.setShort(45, ((Number) parms[44]).shortValue());
               stmt.setShort(46, ((Number) parms[45]).shortValue());
               stmt.setShort(47, ((Number) parms[46]).shortValue());
               stmt.setShort(48, ((Number) parms[47]).shortValue());
               stmt.setShort(49, ((Number) parms[48]).shortValue());
               stmt.setInt(50, ((Number) parms[49]).intValue());
               stmt.setLong(51, ((Number) parms[50]).longValue());
               stmt.setVarchar(52, (String)parms[51], 14, false);
               stmt.setVarchar(53, (String)parms[52], 7, false);
               stmt.setVarchar(54, (String)parms[53], 50, false);
               stmt.setShort(55, ((Number) parms[54]).shortValue());
               return;
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
               stmt.setShort(28, ((Number) parms[27]).shortValue());
               stmt.setShort(29, ((Number) parms[28]).shortValue());
               stmt.setShort(30, ((Number) parms[29]).shortValue());
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setLong(32, ((Number) parms[31]).longValue());
               stmt.setVarchar(33, (String)parms[32], 14, false);
               stmt.setVarchar(34, (String)parms[33], 7, false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setShort(36, ((Number) parms[35]).shortValue());
               stmt.setShort(37, ((Number) parms[36]).shortValue());
               stmt.setShort(38, ((Number) parms[37]).shortValue());
               stmt.setShort(39, ((Number) parms[38]).shortValue());
               stmt.setInt(40, ((Number) parms[39]).intValue());
               stmt.setLong(41, ((Number) parms[40]).longValue());
               stmt.setVarchar(42, (String)parms[41], 14, false);
               stmt.setVarchar(43, (String)parms[42], 7, false);
               stmt.setVarchar(44, (String)parms[43], 50, false);
               stmt.setShort(45, ((Number) parms[44]).shortValue());
               stmt.setShort(46, ((Number) parms[45]).shortValue());
               stmt.setShort(47, ((Number) parms[46]).shortValue());
               stmt.setShort(48, ((Number) parms[47]).shortValue());
               stmt.setShort(49, ((Number) parms[48]).shortValue());
               stmt.setInt(50, ((Number) parms[49]).intValue());
               stmt.setLong(51, ((Number) parms[50]).longValue());
               stmt.setVarchar(52, (String)parms[51], 14, false);
               stmt.setVarchar(53, (String)parms[52], 7, false);
               stmt.setVarchar(54, (String)parms[53], 50, false);
               stmt.setShort(55, ((Number) parms[54]).shortValue());
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[13], 2);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 2);
               }
               stmt.setVarchar(3, (String)parms[4], 50, false);
               stmt.setVarchar(4, (String)parms[5], 7, false);
               stmt.setVarchar(5, (String)parms[6], 14, false);
               stmt.setLong(6, ((Number) parms[7]).longValue());
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setShort(8, ((Number) parms[9]).shortValue());
               stmt.setShort(9, ((Number) parms[10]).shortValue());
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               stmt.setShort(11, ((Number) parms[12]).shortValue());
               stmt.setShort(12, ((Number) parms[13]).shortValue());
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setShort(9, ((Number) parms[8]).shortValue());
               stmt.setShort(10, ((Number) parms[9]).shortValue());
               return;
      }
   }

}

