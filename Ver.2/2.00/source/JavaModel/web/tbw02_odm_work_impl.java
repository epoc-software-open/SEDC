/*
               File: tbw02_odm_work_impl
        Description: ODM出力用ワーク
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:20.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw02_odm_work_impl extends GXWebPanel
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
         Form.getMeta().addItem("description", "ODM出力用ワーク", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW02_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbw02_odm_work_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw02_odm_work_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw02_odm_work_impl.class ));
   }

   public tbw02_odm_work_impl( int remoteHandle ,
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
         wb_table1_2_0U29( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0U29e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0U29( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0U29( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0U29( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0U29e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "ODM出力用ワーク", 1, 0, "px", 0, "px", "Group", "", "HLP_TBW02_ODM_WORK.htm");
         wb_table3_28_0U29( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0U29e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0U29e( true) ;
      }
      else
      {
         wb_table1_2_0U29e( false) ;
      }
   }

   public void wb_table3_28_0U29( boolean wbgen )
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
         wb_table4_34_0U29( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0U29e( boolean wbgen )
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
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW02_ODM_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW02_ODM_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0U29e( true) ;
      }
      else
      {
         wb_table3_28_0U29e( false) ;
      }
   }

   public void wb_table4_34_0U29( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_session_id_Internalname, "ID", "", "", lblTextblocktbw02_session_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW02_SESSION_ID_Internalname, GXutil.rtrim( A39TBW02_SESSION_ID), GXutil.rtrim( localUtil.format( A39TBW02_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW02_SESSION_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW02_SESSION_ID_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SESSION_ID", "left", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_app_id_Internalname, "ID", "", "", lblTextblocktbw02_app_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW02_APP_ID_Internalname, GXutil.rtrim( A40TBW02_APP_ID), GXutil.rtrim( localUtil.format( A40TBW02_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW02_APP_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW02_APP_ID_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_APP_ID", "left", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_disp_datetime_Internalname, "表示日時", "", "", lblTextblocktbw02_disp_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW02_DISP_DATETIME_Internalname, GXutil.rtrim( A41TBW02_DISP_DATETIME), GXutil.rtrim( localUtil.format( A41TBW02_DISP_DATETIME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW02_DISP_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW02_DISP_DATETIME_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_Y4MD_HMS_C", "left", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_study_id_Internalname, "ID", "", "", lblTextblocktbw02_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW02_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A42TBW02_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW02_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A42TBW02_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A42TBW02_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW02_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW02_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_subject_id_Internalname, "ID", "", "", lblTextblocktbw02_subject_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW02_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A43TBW02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW02_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A43TBW02_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A43TBW02_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW02_SUBJECT_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW02_SUBJECT_ID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_visit_no_Internalname, "VISIT番号", "", "", lblTextblocktbw02_visit_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW02_VISIT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A44TBW02_VISIT_NO, (byte)(6), (byte)(0), ".", "")), ((edtTBW02_VISIT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44TBW02_VISIT_NO), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A44TBW02_VISIT_NO), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW02_VISIT_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW02_VISIT_NO_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_VISIT_NO", "right", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbw02_dom_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW02_DOM_CD_Internalname, GXutil.rtrim( A45TBW02_DOM_CD), GXutil.rtrim( localUtil.format( A45TBW02_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW02_DOM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW02_DOM_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_CD", "left", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_repeat_key_Internalname, "リピートキー", "", "", lblTextblocktbw02_repeat_key_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW02_REPEAT_KEY_Internalname, GXutil.ltrim( localUtil.ntoc( A46TBW02_REPEAT_KEY, (byte)(4), (byte)(0), ".", "")), ((edtTBW02_REPEAT_KEY_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A46TBW02_REPEAT_KEY), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A46TBW02_REPEAT_KEY), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW02_REPEAT_KEY_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW02_REPEAT_KEY_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_order_Internalname, "表示順", "", "", lblTextblocktbw02_order_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW02_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A47TBW02_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBW02_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A47TBW02_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A47TBW02_ORDER), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW02_ORDER_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW02_ORDER_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_dom_var_nm_Internalname, "ドメイン変数名", "", "", lblTextblocktbw02_dom_var_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW02_DOM_VAR_NM_Internalname, GXutil.rtrim( A48TBW02_DOM_VAR_NM), GXutil.rtrim( localUtil.format( A48TBW02_DOM_VAR_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW02_DOM_VAR_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW02_DOM_VAR_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_VAR_NM", "left", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_crf_item_cd_Internalname, "CRF項目コード", "", "", lblTextblocktbw02_crf_item_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW02_CRF_ITEM_CD_Internalname, GXutil.rtrim( A496TBW02_CRF_ITEM_CD), GXutil.rtrim( localUtil.format( A496TBW02_CRF_ITEM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBW02_CRF_ITEM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBW02_CRF_ITEM_CD_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_CRF_ITEM_GRP_CD", "left", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw02_crf_value_Internalname, "入力値", "", "", lblTextblocktbw02_crf_value_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBW02_CRF_VALUE_Internalname, GXutil.rtrim( A497TBW02_CRF_VALUE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", (short)(0), 1, edtTBW02_CRF_VALUE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, "", "", (byte)(-1), true, "", "HLP_TBW02_ODM_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0U29e( true) ;
      }
      else
      {
         wb_table4_34_0U29e( false) ;
      }
   }

   public void wb_table2_5_0U29( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBW02_ODM_WORK.htm");
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
         wb_table2_5_0U29e( true) ;
      }
      else
      {
         wb_table2_5_0U29e( false) ;
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
      /* Execute user event: e110U2 */
      e110U2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A39TBW02_SESSION_ID = httpContext.cgiGet( edtTBW02_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A39TBW02_SESSION_ID", A39TBW02_SESSION_ID);
            A40TBW02_APP_ID = httpContext.cgiGet( edtTBW02_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A40TBW02_APP_ID", A40TBW02_APP_ID);
            A41TBW02_DISP_DATETIME = httpContext.cgiGet( edtTBW02_DISP_DATETIME_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A41TBW02_DISP_DATETIME", A41TBW02_DISP_DATETIME);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW02_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW02_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW02_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW02_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A42TBW02_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A42TBW02_STUDY_ID", GXutil.ltrim( GXutil.str( A42TBW02_STUDY_ID, 10, 0)));
            }
            else
            {
               A42TBW02_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW02_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A42TBW02_STUDY_ID", GXutil.ltrim( GXutil.str( A42TBW02_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW02_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW02_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW02_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW02_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A43TBW02_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A43TBW02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A43TBW02_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A43TBW02_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW02_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A43TBW02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A43TBW02_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW02_VISIT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW02_VISIT_NO_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW02_VISIT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW02_VISIT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A44TBW02_VISIT_NO = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A44TBW02_VISIT_NO", GXutil.ltrim( GXutil.str( A44TBW02_VISIT_NO, 6, 0)));
            }
            else
            {
               A44TBW02_VISIT_NO = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW02_VISIT_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A44TBW02_VISIT_NO", GXutil.ltrim( GXutil.str( A44TBW02_VISIT_NO, 6, 0)));
            }
            A45TBW02_DOM_CD = httpContext.cgiGet( edtTBW02_DOM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A45TBW02_DOM_CD", A45TBW02_DOM_CD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW02_REPEAT_KEY_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW02_REPEAT_KEY_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW02_REPEAT_KEY");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW02_REPEAT_KEY_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A46TBW02_REPEAT_KEY = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A46TBW02_REPEAT_KEY", GXutil.ltrim( GXutil.str( A46TBW02_REPEAT_KEY, 4, 0)));
            }
            else
            {
               A46TBW02_REPEAT_KEY = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW02_REPEAT_KEY_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A46TBW02_REPEAT_KEY", GXutil.ltrim( GXutil.str( A46TBW02_REPEAT_KEY, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW02_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW02_ORDER_Internalname), ".", ",") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW02_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW02_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A47TBW02_ORDER = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A47TBW02_ORDER", GXutil.ltrim( GXutil.str( A47TBW02_ORDER, 5, 0)));
            }
            else
            {
               A47TBW02_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW02_ORDER_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47TBW02_ORDER", GXutil.ltrim( GXutil.str( A47TBW02_ORDER, 5, 0)));
            }
            A48TBW02_DOM_VAR_NM = httpContext.cgiGet( edtTBW02_DOM_VAR_NM_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A48TBW02_DOM_VAR_NM", A48TBW02_DOM_VAR_NM);
            A496TBW02_CRF_ITEM_CD = httpContext.cgiGet( edtTBW02_CRF_ITEM_CD_Internalname) ;
            n496TBW02_CRF_ITEM_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A496TBW02_CRF_ITEM_CD", A496TBW02_CRF_ITEM_CD);
            n496TBW02_CRF_ITEM_CD = ((GXutil.strcmp("", A496TBW02_CRF_ITEM_CD)==0) ? true : false) ;
            A497TBW02_CRF_VALUE = httpContext.cgiGet( edtTBW02_CRF_VALUE_Internalname) ;
            n497TBW02_CRF_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A497TBW02_CRF_VALUE", A497TBW02_CRF_VALUE);
            n497TBW02_CRF_VALUE = ((GXutil.strcmp("", A497TBW02_CRF_VALUE)==0) ? true : false) ;
            /* Read saved values. */
            Z39TBW02_SESSION_ID = httpContext.cgiGet( "Z39TBW02_SESSION_ID") ;
            Z40TBW02_APP_ID = httpContext.cgiGet( "Z40TBW02_APP_ID") ;
            Z41TBW02_DISP_DATETIME = httpContext.cgiGet( "Z41TBW02_DISP_DATETIME") ;
            Z42TBW02_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z42TBW02_STUDY_ID"), ".", ",") ;
            Z43TBW02_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z43TBW02_SUBJECT_ID"), ".", ",")) ;
            Z44TBW02_VISIT_NO = (int)(localUtil.ctol( httpContext.cgiGet( "Z44TBW02_VISIT_NO"), ".", ",")) ;
            Z45TBW02_DOM_CD = httpContext.cgiGet( "Z45TBW02_DOM_CD") ;
            Z46TBW02_REPEAT_KEY = (short)(localUtil.ctol( httpContext.cgiGet( "Z46TBW02_REPEAT_KEY"), ".", ",")) ;
            Z47TBW02_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( "Z47TBW02_ORDER"), ".", ",")) ;
            Z48TBW02_DOM_VAR_NM = httpContext.cgiGet( "Z48TBW02_DOM_VAR_NM") ;
            Z496TBW02_CRF_ITEM_CD = httpContext.cgiGet( "Z496TBW02_CRF_ITEM_CD") ;
            n496TBW02_CRF_ITEM_CD = ((GXutil.strcmp("", A496TBW02_CRF_ITEM_CD)==0) ? true : false) ;
            Z497TBW02_CRF_VALUE = httpContext.cgiGet( "Z497TBW02_CRF_VALUE") ;
            n497TBW02_CRF_VALUE = ((GXutil.strcmp("", A497TBW02_CRF_VALUE)==0) ? true : false) ;
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
               A39TBW02_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A39TBW02_SESSION_ID", A39TBW02_SESSION_ID);
               A40TBW02_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A40TBW02_APP_ID", A40TBW02_APP_ID);
               A41TBW02_DISP_DATETIME = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A41TBW02_DISP_DATETIME", A41TBW02_DISP_DATETIME);
               A42TBW02_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A42TBW02_STUDY_ID", GXutil.ltrim( GXutil.str( A42TBW02_STUDY_ID, 10, 0)));
               A43TBW02_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A43TBW02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A43TBW02_SUBJECT_ID, 6, 0)));
               A44TBW02_VISIT_NO = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A44TBW02_VISIT_NO", GXutil.ltrim( GXutil.str( A44TBW02_VISIT_NO, 6, 0)));
               A45TBW02_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A45TBW02_DOM_CD", A45TBW02_DOM_CD);
               A46TBW02_REPEAT_KEY = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A46TBW02_REPEAT_KEY", GXutil.ltrim( GXutil.str( A46TBW02_REPEAT_KEY, 4, 0)));
               A47TBW02_ORDER = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A47TBW02_ORDER", GXutil.ltrim( GXutil.str( A47TBW02_ORDER, 5, 0)));
               A48TBW02_DOM_VAR_NM = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A48TBW02_DOM_VAR_NM", A48TBW02_DOM_VAR_NM);
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
                     /* Execute user event: e110U2 */
                     e110U2 ();
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
            initAll0U29( ) ;
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
      disableAttributes0U29( ) ;
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

   public void resetCaption0U0( )
   {
   }

   public void e110U2( )
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

   public void zm0U29( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z496TBW02_CRF_ITEM_CD = T000U3_A496TBW02_CRF_ITEM_CD[0] ;
            Z497TBW02_CRF_VALUE = T000U3_A497TBW02_CRF_VALUE[0] ;
         }
         else
         {
            Z496TBW02_CRF_ITEM_CD = A496TBW02_CRF_ITEM_CD ;
            Z497TBW02_CRF_VALUE = A497TBW02_CRF_VALUE ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z39TBW02_SESSION_ID = A39TBW02_SESSION_ID ;
         Z40TBW02_APP_ID = A40TBW02_APP_ID ;
         Z41TBW02_DISP_DATETIME = A41TBW02_DISP_DATETIME ;
         Z42TBW02_STUDY_ID = A42TBW02_STUDY_ID ;
         Z43TBW02_SUBJECT_ID = A43TBW02_SUBJECT_ID ;
         Z44TBW02_VISIT_NO = A44TBW02_VISIT_NO ;
         Z45TBW02_DOM_CD = A45TBW02_DOM_CD ;
         Z46TBW02_REPEAT_KEY = A46TBW02_REPEAT_KEY ;
         Z47TBW02_ORDER = A47TBW02_ORDER ;
         Z48TBW02_DOM_VAR_NM = A48TBW02_DOM_VAR_NM ;
         Z496TBW02_CRF_ITEM_CD = A496TBW02_CRF_ITEM_CD ;
         Z497TBW02_CRF_VALUE = A497TBW02_CRF_VALUE ;
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

   public void load0U29( )
   {
      /* Using cursor T000U4 */
      pr_default.execute(2, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A496TBW02_CRF_ITEM_CD = T000U4_A496TBW02_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A496TBW02_CRF_ITEM_CD", A496TBW02_CRF_ITEM_CD);
         n496TBW02_CRF_ITEM_CD = T000U4_n496TBW02_CRF_ITEM_CD[0] ;
         A497TBW02_CRF_VALUE = T000U4_A497TBW02_CRF_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A497TBW02_CRF_VALUE", A497TBW02_CRF_VALUE);
         n497TBW02_CRF_VALUE = T000U4_n497TBW02_CRF_VALUE[0] ;
         zm0U29( -1) ;
      }
      pr_default.close(2);
      onLoadActions0U29( ) ;
   }

   public void onLoadActions0U29( )
   {
      AV8Pgmname = "TBW02_ODM_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable0U29( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TBW02_ODM_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void closeExtendedTableCursors0U29( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0U29( )
   {
      /* Using cursor T000U5 */
      pr_default.execute(3, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound29 = (short)(1) ;
      }
      else
      {
         RcdFound29 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000U3 */
      pr_default.execute(1, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0U29( 1) ;
         RcdFound29 = (short)(1) ;
         A39TBW02_SESSION_ID = T000U3_A39TBW02_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39TBW02_SESSION_ID", A39TBW02_SESSION_ID);
         A40TBW02_APP_ID = T000U3_A40TBW02_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40TBW02_APP_ID", A40TBW02_APP_ID);
         A41TBW02_DISP_DATETIME = T000U3_A41TBW02_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41TBW02_DISP_DATETIME", A41TBW02_DISP_DATETIME);
         A42TBW02_STUDY_ID = T000U3_A42TBW02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42TBW02_STUDY_ID", GXutil.ltrim( GXutil.str( A42TBW02_STUDY_ID, 10, 0)));
         A43TBW02_SUBJECT_ID = T000U3_A43TBW02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43TBW02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A43TBW02_SUBJECT_ID, 6, 0)));
         A44TBW02_VISIT_NO = T000U3_A44TBW02_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44TBW02_VISIT_NO", GXutil.ltrim( GXutil.str( A44TBW02_VISIT_NO, 6, 0)));
         A45TBW02_DOM_CD = T000U3_A45TBW02_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45TBW02_DOM_CD", A45TBW02_DOM_CD);
         A46TBW02_REPEAT_KEY = T000U3_A46TBW02_REPEAT_KEY[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46TBW02_REPEAT_KEY", GXutil.ltrim( GXutil.str( A46TBW02_REPEAT_KEY, 4, 0)));
         A47TBW02_ORDER = T000U3_A47TBW02_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47TBW02_ORDER", GXutil.ltrim( GXutil.str( A47TBW02_ORDER, 5, 0)));
         A48TBW02_DOM_VAR_NM = T000U3_A48TBW02_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48TBW02_DOM_VAR_NM", A48TBW02_DOM_VAR_NM);
         A496TBW02_CRF_ITEM_CD = T000U3_A496TBW02_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A496TBW02_CRF_ITEM_CD", A496TBW02_CRF_ITEM_CD);
         n496TBW02_CRF_ITEM_CD = T000U3_n496TBW02_CRF_ITEM_CD[0] ;
         A497TBW02_CRF_VALUE = T000U3_A497TBW02_CRF_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A497TBW02_CRF_VALUE", A497TBW02_CRF_VALUE);
         n497TBW02_CRF_VALUE = T000U3_n497TBW02_CRF_VALUE[0] ;
         Z39TBW02_SESSION_ID = A39TBW02_SESSION_ID ;
         Z40TBW02_APP_ID = A40TBW02_APP_ID ;
         Z41TBW02_DISP_DATETIME = A41TBW02_DISP_DATETIME ;
         Z42TBW02_STUDY_ID = A42TBW02_STUDY_ID ;
         Z43TBW02_SUBJECT_ID = A43TBW02_SUBJECT_ID ;
         Z44TBW02_VISIT_NO = A44TBW02_VISIT_NO ;
         Z45TBW02_DOM_CD = A45TBW02_DOM_CD ;
         Z46TBW02_REPEAT_KEY = A46TBW02_REPEAT_KEY ;
         Z47TBW02_ORDER = A47TBW02_ORDER ;
         Z48TBW02_DOM_VAR_NM = A48TBW02_DOM_VAR_NM ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0U29( ) ;
         if ( AnyError == 1 )
         {
            RcdFound29 = (short)(0) ;
            initializeNonKey0U29( ) ;
         }
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound29 = (short)(0) ;
         initializeNonKey0U29( ) ;
         sMode29 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode29 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0U29( ) ;
      if ( RcdFound29 == 0 )
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
      RcdFound29 = (short)(0) ;
      /* Using cursor T000U6 */
      pr_default.execute(4, new Object[] {A39TBW02_SESSION_ID, A39TBW02_SESSION_ID, A40TBW02_APP_ID, A40TBW02_APP_ID, A39TBW02_SESSION_ID, A41TBW02_DISP_DATETIME, A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, new Long(A42TBW02_STUDY_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, new Integer(A43TBW02_SUBJECT_ID), new Integer(A43TBW02_SUBJECT_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, new Integer(A44TBW02_VISIT_NO), new Integer(A44TBW02_VISIT_NO), new Integer(A43TBW02_SUBJECT_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, A45TBW02_DOM_CD, A45TBW02_DOM_CD, new Integer(A44TBW02_VISIT_NO), new Integer(A43TBW02_SUBJECT_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, new Short(A46TBW02_REPEAT_KEY), new Short(A46TBW02_REPEAT_KEY), A45TBW02_DOM_CD, new Integer(A44TBW02_VISIT_NO), new Integer(A43TBW02_SUBJECT_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, new Integer(A47TBW02_ORDER), new Integer(A47TBW02_ORDER), new Short(A46TBW02_REPEAT_KEY), A45TBW02_DOM_CD, new Integer(A44TBW02_VISIT_NO), new Integer(A43TBW02_SUBJECT_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, A48TBW02_DOM_VAR_NM});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) < 0 ) || ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) < 0 ) || ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U6_A42TBW02_STUDY_ID[0] < A42TBW02_STUDY_ID ) || ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U6_A43TBW02_SUBJECT_ID[0] < A43TBW02_SUBJECT_ID ) || ( T000U6_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U6_A44TBW02_VISIT_NO[0] < A44TBW02_VISIT_NO ) || ( T000U6_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U6_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U6_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) < 0 ) || ( GXutil.strcmp(T000U6_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U6_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U6_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U6_A46TBW02_REPEAT_KEY[0] < A46TBW02_REPEAT_KEY ) || ( T000U6_A46TBW02_REPEAT_KEY[0] == A46TBW02_REPEAT_KEY ) && ( GXutil.strcmp(T000U6_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U6_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U6_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U6_A47TBW02_ORDER[0] < A47TBW02_ORDER ) || ( T000U6_A47TBW02_ORDER[0] == A47TBW02_ORDER ) && ( T000U6_A46TBW02_REPEAT_KEY[0] == A46TBW02_REPEAT_KEY ) && ( GXutil.strcmp(T000U6_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U6_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U6_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U6_A48TBW02_DOM_VAR_NM[0], A48TBW02_DOM_VAR_NM) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) > 0 ) || ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) > 0 ) || ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U6_A42TBW02_STUDY_ID[0] > A42TBW02_STUDY_ID ) || ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U6_A43TBW02_SUBJECT_ID[0] > A43TBW02_SUBJECT_ID ) || ( T000U6_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U6_A44TBW02_VISIT_NO[0] > A44TBW02_VISIT_NO ) || ( T000U6_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U6_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U6_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) > 0 ) || ( GXutil.strcmp(T000U6_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U6_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U6_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U6_A46TBW02_REPEAT_KEY[0] > A46TBW02_REPEAT_KEY ) || ( T000U6_A46TBW02_REPEAT_KEY[0] == A46TBW02_REPEAT_KEY ) && ( GXutil.strcmp(T000U6_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U6_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U6_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U6_A47TBW02_ORDER[0] > A47TBW02_ORDER ) || ( T000U6_A47TBW02_ORDER[0] == A47TBW02_ORDER ) && ( T000U6_A46TBW02_REPEAT_KEY[0] == A46TBW02_REPEAT_KEY ) && ( GXutil.strcmp(T000U6_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U6_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U6_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U6_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U6_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U6_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U6_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U6_A48TBW02_DOM_VAR_NM[0], A48TBW02_DOM_VAR_NM) > 0 ) ) )
         {
            A39TBW02_SESSION_ID = T000U6_A39TBW02_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A39TBW02_SESSION_ID", A39TBW02_SESSION_ID);
            A40TBW02_APP_ID = T000U6_A40TBW02_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A40TBW02_APP_ID", A40TBW02_APP_ID);
            A41TBW02_DISP_DATETIME = T000U6_A41TBW02_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A41TBW02_DISP_DATETIME", A41TBW02_DISP_DATETIME);
            A42TBW02_STUDY_ID = T000U6_A42TBW02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42TBW02_STUDY_ID", GXutil.ltrim( GXutil.str( A42TBW02_STUDY_ID, 10, 0)));
            A43TBW02_SUBJECT_ID = T000U6_A43TBW02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A43TBW02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A43TBW02_SUBJECT_ID, 6, 0)));
            A44TBW02_VISIT_NO = T000U6_A44TBW02_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44TBW02_VISIT_NO", GXutil.ltrim( GXutil.str( A44TBW02_VISIT_NO, 6, 0)));
            A45TBW02_DOM_CD = T000U6_A45TBW02_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A45TBW02_DOM_CD", A45TBW02_DOM_CD);
            A46TBW02_REPEAT_KEY = T000U6_A46TBW02_REPEAT_KEY[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A46TBW02_REPEAT_KEY", GXutil.ltrim( GXutil.str( A46TBW02_REPEAT_KEY, 4, 0)));
            A47TBW02_ORDER = T000U6_A47TBW02_ORDER[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A47TBW02_ORDER", GXutil.ltrim( GXutil.str( A47TBW02_ORDER, 5, 0)));
            A48TBW02_DOM_VAR_NM = T000U6_A48TBW02_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A48TBW02_DOM_VAR_NM", A48TBW02_DOM_VAR_NM);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound29 = (short)(0) ;
      /* Using cursor T000U7 */
      pr_default.execute(5, new Object[] {A39TBW02_SESSION_ID, A39TBW02_SESSION_ID, A40TBW02_APP_ID, A40TBW02_APP_ID, A39TBW02_SESSION_ID, A41TBW02_DISP_DATETIME, A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, new Long(A42TBW02_STUDY_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, new Integer(A43TBW02_SUBJECT_ID), new Integer(A43TBW02_SUBJECT_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, new Integer(A44TBW02_VISIT_NO), new Integer(A44TBW02_VISIT_NO), new Integer(A43TBW02_SUBJECT_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, A45TBW02_DOM_CD, A45TBW02_DOM_CD, new Integer(A44TBW02_VISIT_NO), new Integer(A43TBW02_SUBJECT_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, new Short(A46TBW02_REPEAT_KEY), new Short(A46TBW02_REPEAT_KEY), A45TBW02_DOM_CD, new Integer(A44TBW02_VISIT_NO), new Integer(A43TBW02_SUBJECT_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, new Integer(A47TBW02_ORDER), new Integer(A47TBW02_ORDER), new Short(A46TBW02_REPEAT_KEY), A45TBW02_DOM_CD, new Integer(A44TBW02_VISIT_NO), new Integer(A43TBW02_SUBJECT_ID), new Long(A42TBW02_STUDY_ID), A41TBW02_DISP_DATETIME, A40TBW02_APP_ID, A39TBW02_SESSION_ID, A48TBW02_DOM_VAR_NM});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) > 0 ) || ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) > 0 ) || ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) > 0 ) || ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U7_A42TBW02_STUDY_ID[0] > A42TBW02_STUDY_ID ) || ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U7_A43TBW02_SUBJECT_ID[0] > A43TBW02_SUBJECT_ID ) || ( T000U7_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U7_A44TBW02_VISIT_NO[0] > A44TBW02_VISIT_NO ) || ( T000U7_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U7_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U7_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) > 0 ) || ( GXutil.strcmp(T000U7_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U7_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U7_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U7_A46TBW02_REPEAT_KEY[0] > A46TBW02_REPEAT_KEY ) || ( T000U7_A46TBW02_REPEAT_KEY[0] == A46TBW02_REPEAT_KEY ) && ( GXutil.strcmp(T000U7_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U7_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U7_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U7_A47TBW02_ORDER[0] > A47TBW02_ORDER ) || ( T000U7_A47TBW02_ORDER[0] == A47TBW02_ORDER ) && ( T000U7_A46TBW02_REPEAT_KEY[0] == A46TBW02_REPEAT_KEY ) && ( GXutil.strcmp(T000U7_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U7_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U7_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U7_A48TBW02_DOM_VAR_NM[0], A48TBW02_DOM_VAR_NM) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) < 0 ) || ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) < 0 ) || ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) < 0 ) || ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U7_A42TBW02_STUDY_ID[0] < A42TBW02_STUDY_ID ) || ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U7_A43TBW02_SUBJECT_ID[0] < A43TBW02_SUBJECT_ID ) || ( T000U7_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U7_A44TBW02_VISIT_NO[0] < A44TBW02_VISIT_NO ) || ( T000U7_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U7_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U7_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) < 0 ) || ( GXutil.strcmp(T000U7_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U7_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U7_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U7_A46TBW02_REPEAT_KEY[0] < A46TBW02_REPEAT_KEY ) || ( T000U7_A46TBW02_REPEAT_KEY[0] == A46TBW02_REPEAT_KEY ) && ( GXutil.strcmp(T000U7_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U7_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U7_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( T000U7_A47TBW02_ORDER[0] < A47TBW02_ORDER ) || ( T000U7_A47TBW02_ORDER[0] == A47TBW02_ORDER ) && ( T000U7_A46TBW02_REPEAT_KEY[0] == A46TBW02_REPEAT_KEY ) && ( GXutil.strcmp(T000U7_A45TBW02_DOM_CD[0], A45TBW02_DOM_CD) == 0 ) && ( T000U7_A44TBW02_VISIT_NO[0] == A44TBW02_VISIT_NO ) && ( T000U7_A43TBW02_SUBJECT_ID[0] == A43TBW02_SUBJECT_ID ) && ( T000U7_A42TBW02_STUDY_ID[0] == A42TBW02_STUDY_ID ) && ( GXutil.strcmp(T000U7_A41TBW02_DISP_DATETIME[0], A41TBW02_DISP_DATETIME) == 0 ) && ( GXutil.strcmp(T000U7_A40TBW02_APP_ID[0], A40TBW02_APP_ID) == 0 ) && ( GXutil.strcmp(T000U7_A39TBW02_SESSION_ID[0], A39TBW02_SESSION_ID) == 0 ) && ( GXutil.strcmp(T000U7_A48TBW02_DOM_VAR_NM[0], A48TBW02_DOM_VAR_NM) < 0 ) ) )
         {
            A39TBW02_SESSION_ID = T000U7_A39TBW02_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A39TBW02_SESSION_ID", A39TBW02_SESSION_ID);
            A40TBW02_APP_ID = T000U7_A40TBW02_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A40TBW02_APP_ID", A40TBW02_APP_ID);
            A41TBW02_DISP_DATETIME = T000U7_A41TBW02_DISP_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A41TBW02_DISP_DATETIME", A41TBW02_DISP_DATETIME);
            A42TBW02_STUDY_ID = T000U7_A42TBW02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A42TBW02_STUDY_ID", GXutil.ltrim( GXutil.str( A42TBW02_STUDY_ID, 10, 0)));
            A43TBW02_SUBJECT_ID = T000U7_A43TBW02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A43TBW02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A43TBW02_SUBJECT_ID, 6, 0)));
            A44TBW02_VISIT_NO = T000U7_A44TBW02_VISIT_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A44TBW02_VISIT_NO", GXutil.ltrim( GXutil.str( A44TBW02_VISIT_NO, 6, 0)));
            A45TBW02_DOM_CD = T000U7_A45TBW02_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A45TBW02_DOM_CD", A45TBW02_DOM_CD);
            A46TBW02_REPEAT_KEY = T000U7_A46TBW02_REPEAT_KEY[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A46TBW02_REPEAT_KEY", GXutil.ltrim( GXutil.str( A46TBW02_REPEAT_KEY, 4, 0)));
            A47TBW02_ORDER = T000U7_A47TBW02_ORDER[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A47TBW02_ORDER", GXutil.ltrim( GXutil.str( A47TBW02_ORDER, 5, 0)));
            A48TBW02_DOM_VAR_NM = T000U7_A48TBW02_DOM_VAR_NM[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A48TBW02_DOM_VAR_NM", A48TBW02_DOM_VAR_NM);
            RcdFound29 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0U29( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBW02_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0U29( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound29 == 1 )
         {
            if ( ( GXutil.strcmp(A39TBW02_SESSION_ID, Z39TBW02_SESSION_ID) != 0 ) || ( GXutil.strcmp(A40TBW02_APP_ID, Z40TBW02_APP_ID) != 0 ) || ( GXutil.strcmp(A41TBW02_DISP_DATETIME, Z41TBW02_DISP_DATETIME) != 0 ) || ( A42TBW02_STUDY_ID != Z42TBW02_STUDY_ID ) || ( A43TBW02_SUBJECT_ID != Z43TBW02_SUBJECT_ID ) || ( A44TBW02_VISIT_NO != Z44TBW02_VISIT_NO ) || ( GXutil.strcmp(A45TBW02_DOM_CD, Z45TBW02_DOM_CD) != 0 ) || ( A46TBW02_REPEAT_KEY != Z46TBW02_REPEAT_KEY ) || ( A47TBW02_ORDER != Z47TBW02_ORDER ) || ( GXutil.strcmp(A48TBW02_DOM_VAR_NM, Z48TBW02_DOM_VAR_NM) != 0 ) )
            {
               A39TBW02_SESSION_ID = Z39TBW02_SESSION_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A39TBW02_SESSION_ID", A39TBW02_SESSION_ID);
               A40TBW02_APP_ID = Z40TBW02_APP_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A40TBW02_APP_ID", A40TBW02_APP_ID);
               A41TBW02_DISP_DATETIME = Z41TBW02_DISP_DATETIME ;
               httpContext.ajax_rsp_assign_attri("", false, "A41TBW02_DISP_DATETIME", A41TBW02_DISP_DATETIME);
               A42TBW02_STUDY_ID = Z42TBW02_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A42TBW02_STUDY_ID", GXutil.ltrim( GXutil.str( A42TBW02_STUDY_ID, 10, 0)));
               A43TBW02_SUBJECT_ID = Z43TBW02_SUBJECT_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A43TBW02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A43TBW02_SUBJECT_ID, 6, 0)));
               A44TBW02_VISIT_NO = Z44TBW02_VISIT_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A44TBW02_VISIT_NO", GXutil.ltrim( GXutil.str( A44TBW02_VISIT_NO, 6, 0)));
               A45TBW02_DOM_CD = Z45TBW02_DOM_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A45TBW02_DOM_CD", A45TBW02_DOM_CD);
               A46TBW02_REPEAT_KEY = Z46TBW02_REPEAT_KEY ;
               httpContext.ajax_rsp_assign_attri("", false, "A46TBW02_REPEAT_KEY", GXutil.ltrim( GXutil.str( A46TBW02_REPEAT_KEY, 4, 0)));
               A47TBW02_ORDER = Z47TBW02_ORDER ;
               httpContext.ajax_rsp_assign_attri("", false, "A47TBW02_ORDER", GXutil.ltrim( GXutil.str( A47TBW02_ORDER, 5, 0)));
               A48TBW02_DOM_VAR_NM = Z48TBW02_DOM_VAR_NM ;
               httpContext.ajax_rsp_assign_attri("", false, "A48TBW02_DOM_VAR_NM", A48TBW02_DOM_VAR_NM);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW02_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW02_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBW02_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0U29( ) ;
               GX_FocusControl = edtTBW02_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A39TBW02_SESSION_ID, Z39TBW02_SESSION_ID) != 0 ) || ( GXutil.strcmp(A40TBW02_APP_ID, Z40TBW02_APP_ID) != 0 ) || ( GXutil.strcmp(A41TBW02_DISP_DATETIME, Z41TBW02_DISP_DATETIME) != 0 ) || ( A42TBW02_STUDY_ID != Z42TBW02_STUDY_ID ) || ( A43TBW02_SUBJECT_ID != Z43TBW02_SUBJECT_ID ) || ( A44TBW02_VISIT_NO != Z44TBW02_VISIT_NO ) || ( GXutil.strcmp(A45TBW02_DOM_CD, Z45TBW02_DOM_CD) != 0 ) || ( A46TBW02_REPEAT_KEY != Z46TBW02_REPEAT_KEY ) || ( A47TBW02_ORDER != Z47TBW02_ORDER ) || ( GXutil.strcmp(A48TBW02_DOM_VAR_NM, Z48TBW02_DOM_VAR_NM) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW02_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0U29( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW02_SESSION_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBW02_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBW02_SESSION_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0U29( ) ;
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
      if ( ( GXutil.strcmp(A39TBW02_SESSION_ID, Z39TBW02_SESSION_ID) != 0 ) || ( GXutil.strcmp(A40TBW02_APP_ID, Z40TBW02_APP_ID) != 0 ) || ( GXutil.strcmp(A41TBW02_DISP_DATETIME, Z41TBW02_DISP_DATETIME) != 0 ) || ( A42TBW02_STUDY_ID != Z42TBW02_STUDY_ID ) || ( A43TBW02_SUBJECT_ID != Z43TBW02_SUBJECT_ID ) || ( A44TBW02_VISIT_NO != Z44TBW02_VISIT_NO ) || ( GXutil.strcmp(A45TBW02_DOM_CD, Z45TBW02_DOM_CD) != 0 ) || ( A46TBW02_REPEAT_KEY != Z46TBW02_REPEAT_KEY ) || ( A47TBW02_ORDER != Z47TBW02_ORDER ) || ( GXutil.strcmp(A48TBW02_DOM_VAR_NM, Z48TBW02_DOM_VAR_NM) != 0 ) )
      {
         A39TBW02_SESSION_ID = Z39TBW02_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A39TBW02_SESSION_ID", A39TBW02_SESSION_ID);
         A40TBW02_APP_ID = Z40TBW02_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A40TBW02_APP_ID", A40TBW02_APP_ID);
         A41TBW02_DISP_DATETIME = Z41TBW02_DISP_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A41TBW02_DISP_DATETIME", A41TBW02_DISP_DATETIME);
         A42TBW02_STUDY_ID = Z42TBW02_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A42TBW02_STUDY_ID", GXutil.ltrim( GXutil.str( A42TBW02_STUDY_ID, 10, 0)));
         A43TBW02_SUBJECT_ID = Z43TBW02_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A43TBW02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A43TBW02_SUBJECT_ID, 6, 0)));
         A44TBW02_VISIT_NO = Z44TBW02_VISIT_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A44TBW02_VISIT_NO", GXutil.ltrim( GXutil.str( A44TBW02_VISIT_NO, 6, 0)));
         A45TBW02_DOM_CD = Z45TBW02_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A45TBW02_DOM_CD", A45TBW02_DOM_CD);
         A46TBW02_REPEAT_KEY = Z46TBW02_REPEAT_KEY ;
         httpContext.ajax_rsp_assign_attri("", false, "A46TBW02_REPEAT_KEY", GXutil.ltrim( GXutil.str( A46TBW02_REPEAT_KEY, 4, 0)));
         A47TBW02_ORDER = Z47TBW02_ORDER ;
         httpContext.ajax_rsp_assign_attri("", false, "A47TBW02_ORDER", GXutil.ltrim( GXutil.str( A47TBW02_ORDER, 5, 0)));
         A48TBW02_DOM_VAR_NM = Z48TBW02_DOM_VAR_NM ;
         httpContext.ajax_rsp_assign_attri("", false, "A48TBW02_DOM_VAR_NM", A48TBW02_DOM_VAR_NM);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW02_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW02_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW02_SESSION_ID_Internalname ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW02_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW02_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBW02_CRF_ITEM_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0U29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW02_CRF_ITEM_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0U29( ) ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW02_CRF_ITEM_CD_Internalname ;
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
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW02_CRF_ITEM_CD_Internalname ;
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
      scanStart0U29( ) ;
      if ( RcdFound29 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound29 != 0 )
         {
            scanNext0U29( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBW02_CRF_ITEM_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0U29( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0U29( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000U2 */
         pr_default.execute(0, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW02_ODM_WORK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z496TBW02_CRF_ITEM_CD, T000U2_A496TBW02_CRF_ITEM_CD[0]) != 0 ) || ( GXutil.strcmp(Z497TBW02_CRF_VALUE, T000U2_A497TBW02_CRF_VALUE[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW02_ODM_WORK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0U29( )
   {
      beforeValidate0U29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0U29( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0U29( 0) ;
         checkOptimisticConcurrency0U29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0U29( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0U29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000U8 */
                  pr_default.execute(6, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM, new Boolean(n496TBW02_CRF_ITEM_CD), A496TBW02_CRF_ITEM_CD, new Boolean(n497TBW02_CRF_VALUE), A497TBW02_CRF_VALUE});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW02_ODM_WORK") ;
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
                        resetCaption0U0( ) ;
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
            load0U29( ) ;
         }
         endLevel0U29( ) ;
      }
      closeExtendedTableCursors0U29( ) ;
   }

   public void update0U29( )
   {
      beforeValidate0U29( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0U29( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0U29( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0U29( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0U29( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000U9 */
                  pr_default.execute(7, new Object[] {new Boolean(n496TBW02_CRF_ITEM_CD), A496TBW02_CRF_ITEM_CD, new Boolean(n497TBW02_CRF_VALUE), A497TBW02_CRF_VALUE, A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW02_ODM_WORK") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW02_ODM_WORK"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0U29( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0U0( ) ;
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
         endLevel0U29( ) ;
      }
      closeExtendedTableCursors0U29( ) ;
   }

   public void deferredUpdate0U29( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0U29( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0U29( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0U29( ) ;
         afterConfirm0U29( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0U29( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000U10 */
               pr_default.execute(8, new Object[] {A39TBW02_SESSION_ID, A40TBW02_APP_ID, A41TBW02_DISP_DATETIME, new Long(A42TBW02_STUDY_ID), new Integer(A43TBW02_SUBJECT_ID), new Integer(A44TBW02_VISIT_NO), A45TBW02_DOM_CD, new Short(A46TBW02_REPEAT_KEY), new Integer(A47TBW02_ORDER), A48TBW02_DOM_VAR_NM});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBW02_ODM_WORK") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound29 == 0 )
                     {
                        initAll0U29( ) ;
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
                     resetCaption0U0( ) ;
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
      sMode29 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0U29( ) ;
      Gx_mode = sMode29 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0U29( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW02_ODM_WORK" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      }
   }

   public void endLevel0U29( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0U29( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw02_odm_work");
         if ( AnyError == 0 )
         {
            confirmValues0U0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw02_odm_work");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0U29( )
   {
      /* Scan By routine */
      /* Using cursor T000U11 */
      pr_default.execute(9);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A39TBW02_SESSION_ID = T000U11_A39TBW02_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39TBW02_SESSION_ID", A39TBW02_SESSION_ID);
         A40TBW02_APP_ID = T000U11_A40TBW02_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40TBW02_APP_ID", A40TBW02_APP_ID);
         A41TBW02_DISP_DATETIME = T000U11_A41TBW02_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41TBW02_DISP_DATETIME", A41TBW02_DISP_DATETIME);
         A42TBW02_STUDY_ID = T000U11_A42TBW02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42TBW02_STUDY_ID", GXutil.ltrim( GXutil.str( A42TBW02_STUDY_ID, 10, 0)));
         A43TBW02_SUBJECT_ID = T000U11_A43TBW02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43TBW02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A43TBW02_SUBJECT_ID, 6, 0)));
         A44TBW02_VISIT_NO = T000U11_A44TBW02_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44TBW02_VISIT_NO", GXutil.ltrim( GXutil.str( A44TBW02_VISIT_NO, 6, 0)));
         A45TBW02_DOM_CD = T000U11_A45TBW02_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45TBW02_DOM_CD", A45TBW02_DOM_CD);
         A46TBW02_REPEAT_KEY = T000U11_A46TBW02_REPEAT_KEY[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46TBW02_REPEAT_KEY", GXutil.ltrim( GXutil.str( A46TBW02_REPEAT_KEY, 4, 0)));
         A47TBW02_ORDER = T000U11_A47TBW02_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47TBW02_ORDER", GXutil.ltrim( GXutil.str( A47TBW02_ORDER, 5, 0)));
         A48TBW02_DOM_VAR_NM = T000U11_A48TBW02_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48TBW02_DOM_VAR_NM", A48TBW02_DOM_VAR_NM);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0U29( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound29 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound29 = (short)(1) ;
         A39TBW02_SESSION_ID = T000U11_A39TBW02_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A39TBW02_SESSION_ID", A39TBW02_SESSION_ID);
         A40TBW02_APP_ID = T000U11_A40TBW02_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A40TBW02_APP_ID", A40TBW02_APP_ID);
         A41TBW02_DISP_DATETIME = T000U11_A41TBW02_DISP_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A41TBW02_DISP_DATETIME", A41TBW02_DISP_DATETIME);
         A42TBW02_STUDY_ID = T000U11_A42TBW02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A42TBW02_STUDY_ID", GXutil.ltrim( GXutil.str( A42TBW02_STUDY_ID, 10, 0)));
         A43TBW02_SUBJECT_ID = T000U11_A43TBW02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A43TBW02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A43TBW02_SUBJECT_ID, 6, 0)));
         A44TBW02_VISIT_NO = T000U11_A44TBW02_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A44TBW02_VISIT_NO", GXutil.ltrim( GXutil.str( A44TBW02_VISIT_NO, 6, 0)));
         A45TBW02_DOM_CD = T000U11_A45TBW02_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A45TBW02_DOM_CD", A45TBW02_DOM_CD);
         A46TBW02_REPEAT_KEY = T000U11_A46TBW02_REPEAT_KEY[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A46TBW02_REPEAT_KEY", GXutil.ltrim( GXutil.str( A46TBW02_REPEAT_KEY, 4, 0)));
         A47TBW02_ORDER = T000U11_A47TBW02_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A47TBW02_ORDER", GXutil.ltrim( GXutil.str( A47TBW02_ORDER, 5, 0)));
         A48TBW02_DOM_VAR_NM = T000U11_A48TBW02_DOM_VAR_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A48TBW02_DOM_VAR_NM", A48TBW02_DOM_VAR_NM);
      }
   }

   public void scanEnd0U29( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0U29( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0U29( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate0U29( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete0U29( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0U29( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0U29( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0U29( )
   {
      edtTBW02_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_SESSION_ID_Enabled, 5, 0)));
      edtTBW02_APP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_APP_ID_Enabled, 5, 0)));
      edtTBW02_DISP_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_DISP_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_DISP_DATETIME_Enabled, 5, 0)));
      edtTBW02_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_STUDY_ID_Enabled, 5, 0)));
      edtTBW02_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_SUBJECT_ID_Enabled, 5, 0)));
      edtTBW02_VISIT_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_VISIT_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_VISIT_NO_Enabled, 5, 0)));
      edtTBW02_DOM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_DOM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_DOM_CD_Enabled, 5, 0)));
      edtTBW02_REPEAT_KEY_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_REPEAT_KEY_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_REPEAT_KEY_Enabled, 5, 0)));
      edtTBW02_ORDER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_ORDER_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_ORDER_Enabled, 5, 0)));
      edtTBW02_DOM_VAR_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_DOM_VAR_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_DOM_VAR_NM_Enabled, 5, 0)));
      edtTBW02_CRF_ITEM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_CRF_ITEM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_CRF_ITEM_CD_Enabled, 5, 0)));
      edtTBW02_CRF_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW02_CRF_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW02_CRF_VALUE_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0U0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "ODM出力用ワーク") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317152211");
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" ;
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbw02_odm_work") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0U29( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z39TBW02_SESSION_ID", GXutil.rtrim( Z39TBW02_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z40TBW02_APP_ID", GXutil.rtrim( Z40TBW02_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z41TBW02_DISP_DATETIME", GXutil.rtrim( Z41TBW02_DISP_DATETIME));
      GxWebStd.gx_hidden_field( httpContext, "Z42TBW02_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z42TBW02_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z43TBW02_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z43TBW02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z44TBW02_VISIT_NO", GXutil.ltrim( localUtil.ntoc( Z44TBW02_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z45TBW02_DOM_CD", GXutil.rtrim( Z45TBW02_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z46TBW02_REPEAT_KEY", GXutil.ltrim( localUtil.ntoc( Z46TBW02_REPEAT_KEY, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z47TBW02_ORDER", GXutil.ltrim( localUtil.ntoc( Z47TBW02_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z48TBW02_DOM_VAR_NM", GXutil.rtrim( Z48TBW02_DOM_VAR_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z496TBW02_CRF_ITEM_CD", GXutil.rtrim( Z496TBW02_CRF_ITEM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z497TBW02_CRF_VALUE", GXutil.rtrim( Z497TBW02_CRF_VALUE));
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
      return "TBW02_ODM_WORK" ;
   }

   public String getPgmdesc( )
   {
      return "ODM出力用ワーク" ;
   }

   public void initializeNonKey0U29( )
   {
      A496TBW02_CRF_ITEM_CD = "" ;
      n496TBW02_CRF_ITEM_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A496TBW02_CRF_ITEM_CD", A496TBW02_CRF_ITEM_CD);
      n496TBW02_CRF_ITEM_CD = ((GXutil.strcmp("", A496TBW02_CRF_ITEM_CD)==0) ? true : false) ;
      A497TBW02_CRF_VALUE = "" ;
      n497TBW02_CRF_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A497TBW02_CRF_VALUE", A497TBW02_CRF_VALUE);
      n497TBW02_CRF_VALUE = ((GXutil.strcmp("", A497TBW02_CRF_VALUE)==0) ? true : false) ;
   }

   public void initAll0U29( )
   {
      A39TBW02_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A39TBW02_SESSION_ID", A39TBW02_SESSION_ID);
      A40TBW02_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A40TBW02_APP_ID", A40TBW02_APP_ID);
      A41TBW02_DISP_DATETIME = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A41TBW02_DISP_DATETIME", A41TBW02_DISP_DATETIME);
      A42TBW02_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A42TBW02_STUDY_ID", GXutil.ltrim( GXutil.str( A42TBW02_STUDY_ID, 10, 0)));
      A43TBW02_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A43TBW02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A43TBW02_SUBJECT_ID, 6, 0)));
      A44TBW02_VISIT_NO = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A44TBW02_VISIT_NO", GXutil.ltrim( GXutil.str( A44TBW02_VISIT_NO, 6, 0)));
      A45TBW02_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A45TBW02_DOM_CD", A45TBW02_DOM_CD);
      A46TBW02_REPEAT_KEY = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A46TBW02_REPEAT_KEY", GXutil.ltrim( GXutil.str( A46TBW02_REPEAT_KEY, 4, 0)));
      A47TBW02_ORDER = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A47TBW02_ORDER", GXutil.ltrim( GXutil.str( A47TBW02_ORDER, 5, 0)));
      A48TBW02_DOM_VAR_NM = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A48TBW02_DOM_VAR_NM", A48TBW02_DOM_VAR_NM);
      initializeNonKey0U29( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317152218");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbw02_odm_work.js", "?20177317152218");
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
      lblTextblocktbw02_session_id_Internalname = "TEXTBLOCKTBW02_SESSION_ID" ;
      edtTBW02_SESSION_ID_Internalname = "TBW02_SESSION_ID" ;
      lblTextblocktbw02_app_id_Internalname = "TEXTBLOCKTBW02_APP_ID" ;
      edtTBW02_APP_ID_Internalname = "TBW02_APP_ID" ;
      lblTextblocktbw02_disp_datetime_Internalname = "TEXTBLOCKTBW02_DISP_DATETIME" ;
      edtTBW02_DISP_DATETIME_Internalname = "TBW02_DISP_DATETIME" ;
      lblTextblocktbw02_study_id_Internalname = "TEXTBLOCKTBW02_STUDY_ID" ;
      edtTBW02_STUDY_ID_Internalname = "TBW02_STUDY_ID" ;
      lblTextblocktbw02_subject_id_Internalname = "TEXTBLOCKTBW02_SUBJECT_ID" ;
      edtTBW02_SUBJECT_ID_Internalname = "TBW02_SUBJECT_ID" ;
      lblTextblocktbw02_visit_no_Internalname = "TEXTBLOCKTBW02_VISIT_NO" ;
      edtTBW02_VISIT_NO_Internalname = "TBW02_VISIT_NO" ;
      lblTextblocktbw02_dom_cd_Internalname = "TEXTBLOCKTBW02_DOM_CD" ;
      edtTBW02_DOM_CD_Internalname = "TBW02_DOM_CD" ;
      lblTextblocktbw02_repeat_key_Internalname = "TEXTBLOCKTBW02_REPEAT_KEY" ;
      edtTBW02_REPEAT_KEY_Internalname = "TBW02_REPEAT_KEY" ;
      lblTextblocktbw02_order_Internalname = "TEXTBLOCKTBW02_ORDER" ;
      edtTBW02_ORDER_Internalname = "TBW02_ORDER" ;
      lblTextblocktbw02_dom_var_nm_Internalname = "TEXTBLOCKTBW02_DOM_VAR_NM" ;
      edtTBW02_DOM_VAR_NM_Internalname = "TBW02_DOM_VAR_NM" ;
      lblTextblocktbw02_crf_item_cd_Internalname = "TEXTBLOCKTBW02_CRF_ITEM_CD" ;
      edtTBW02_CRF_ITEM_CD_Internalname = "TBW02_CRF_ITEM_CD" ;
      lblTextblocktbw02_crf_value_Internalname = "TEXTBLOCKTBW02_CRF_VALUE" ;
      edtTBW02_CRF_VALUE_Internalname = "TBW02_CRF_VALUE" ;
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
      edtTBW02_CRF_VALUE_Enabled = 1 ;
      edtTBW02_CRF_ITEM_CD_Jsonclick = "" ;
      edtTBW02_CRF_ITEM_CD_Enabled = 1 ;
      edtTBW02_DOM_VAR_NM_Jsonclick = "" ;
      edtTBW02_DOM_VAR_NM_Enabled = 1 ;
      edtTBW02_ORDER_Jsonclick = "" ;
      edtTBW02_ORDER_Enabled = 1 ;
      edtTBW02_REPEAT_KEY_Jsonclick = "" ;
      edtTBW02_REPEAT_KEY_Enabled = 1 ;
      edtTBW02_DOM_CD_Jsonclick = "" ;
      edtTBW02_DOM_CD_Enabled = 1 ;
      edtTBW02_VISIT_NO_Jsonclick = "" ;
      edtTBW02_VISIT_NO_Enabled = 1 ;
      edtTBW02_SUBJECT_ID_Jsonclick = "" ;
      edtTBW02_SUBJECT_ID_Enabled = 1 ;
      edtTBW02_STUDY_ID_Jsonclick = "" ;
      edtTBW02_STUDY_ID_Enabled = 1 ;
      edtTBW02_DISP_DATETIME_Jsonclick = "" ;
      edtTBW02_DISP_DATETIME_Enabled = 1 ;
      edtTBW02_APP_ID_Jsonclick = "" ;
      edtTBW02_APP_ID_Enabled = 1 ;
      edtTBW02_SESSION_ID_Jsonclick = "" ;
      edtTBW02_SESSION_ID_Enabled = 1 ;
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
      GX_FocusControl = edtTBW02_CRF_ITEM_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw02_dom_var_nm( String GX_Parm1 ,
                                       String GX_Parm2 ,
                                       String GX_Parm3 ,
                                       long GX_Parm4 ,
                                       int GX_Parm5 ,
                                       int GX_Parm6 ,
                                       String GX_Parm7 ,
                                       short GX_Parm8 ,
                                       int GX_Parm9 ,
                                       String GX_Parm10 ,
                                       String GX_Parm11 ,
                                       String GX_Parm12 )
   {
      A39TBW02_SESSION_ID = GX_Parm1 ;
      A40TBW02_APP_ID = GX_Parm2 ;
      A41TBW02_DISP_DATETIME = GX_Parm3 ;
      A42TBW02_STUDY_ID = GX_Parm4 ;
      A43TBW02_SUBJECT_ID = GX_Parm5 ;
      A44TBW02_VISIT_NO = GX_Parm6 ;
      A45TBW02_DOM_CD = GX_Parm7 ;
      A46TBW02_REPEAT_KEY = GX_Parm8 ;
      A47TBW02_ORDER = GX_Parm9 ;
      A48TBW02_DOM_VAR_NM = GX_Parm10 ;
      A496TBW02_CRF_ITEM_CD = GX_Parm11 ;
      n496TBW02_CRF_ITEM_CD = false ;
      A497TBW02_CRF_VALUE = GX_Parm12 ;
      n497TBW02_CRF_VALUE = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.rtrim( A496TBW02_CRF_ITEM_CD));
      isValidOutput.add(GXutil.rtrim( A497TBW02_CRF_VALUE));
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z39TBW02_SESSION_ID));
      isValidOutput.add(GXutil.rtrim( Z40TBW02_APP_ID));
      isValidOutput.add(GXutil.rtrim( Z41TBW02_DISP_DATETIME));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z42TBW02_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z43TBW02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z44TBW02_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z45TBW02_DOM_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z46TBW02_REPEAT_KEY, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z47TBW02_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z48TBW02_DOM_VAR_NM));
      isValidOutput.add(GXutil.rtrim( Z496TBW02_CRF_ITEM_CD));
      isValidOutput.add(GXutil.rtrim( Z497TBW02_CRF_VALUE));
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
      Z39TBW02_SESSION_ID = "" ;
      Z40TBW02_APP_ID = "" ;
      Z41TBW02_DISP_DATETIME = "" ;
      Z45TBW02_DOM_CD = "" ;
      Z48TBW02_DOM_VAR_NM = "" ;
      Z496TBW02_CRF_ITEM_CD = "" ;
      Z497TBW02_CRF_VALUE = "" ;
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
      lblTextblocktbw02_session_id_Jsonclick = "" ;
      A39TBW02_SESSION_ID = "" ;
      lblTextblocktbw02_app_id_Jsonclick = "" ;
      A40TBW02_APP_ID = "" ;
      lblTextblocktbw02_disp_datetime_Jsonclick = "" ;
      A41TBW02_DISP_DATETIME = "" ;
      lblTextblocktbw02_study_id_Jsonclick = "" ;
      lblTextblocktbw02_subject_id_Jsonclick = "" ;
      lblTextblocktbw02_visit_no_Jsonclick = "" ;
      lblTextblocktbw02_dom_cd_Jsonclick = "" ;
      A45TBW02_DOM_CD = "" ;
      lblTextblocktbw02_repeat_key_Jsonclick = "" ;
      lblTextblocktbw02_order_Jsonclick = "" ;
      lblTextblocktbw02_dom_var_nm_Jsonclick = "" ;
      A48TBW02_DOM_VAR_NM = "" ;
      lblTextblocktbw02_crf_item_cd_Jsonclick = "" ;
      A496TBW02_CRF_ITEM_CD = "" ;
      lblTextblocktbw02_crf_value_Jsonclick = "" ;
      A497TBW02_CRF_VALUE = "" ;
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
      T000U4_A39TBW02_SESSION_ID = new String[] {""} ;
      T000U4_A40TBW02_APP_ID = new String[] {""} ;
      T000U4_A41TBW02_DISP_DATETIME = new String[] {""} ;
      T000U4_A42TBW02_STUDY_ID = new long[1] ;
      T000U4_A43TBW02_SUBJECT_ID = new int[1] ;
      T000U4_A44TBW02_VISIT_NO = new int[1] ;
      T000U4_A45TBW02_DOM_CD = new String[] {""} ;
      T000U4_A46TBW02_REPEAT_KEY = new short[1] ;
      T000U4_A47TBW02_ORDER = new int[1] ;
      T000U4_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      T000U4_A496TBW02_CRF_ITEM_CD = new String[] {""} ;
      T000U4_n496TBW02_CRF_ITEM_CD = new boolean[] {false} ;
      T000U4_A497TBW02_CRF_VALUE = new String[] {""} ;
      T000U4_n497TBW02_CRF_VALUE = new boolean[] {false} ;
      T000U5_A39TBW02_SESSION_ID = new String[] {""} ;
      T000U5_A40TBW02_APP_ID = new String[] {""} ;
      T000U5_A41TBW02_DISP_DATETIME = new String[] {""} ;
      T000U5_A42TBW02_STUDY_ID = new long[1] ;
      T000U5_A43TBW02_SUBJECT_ID = new int[1] ;
      T000U5_A44TBW02_VISIT_NO = new int[1] ;
      T000U5_A45TBW02_DOM_CD = new String[] {""} ;
      T000U5_A46TBW02_REPEAT_KEY = new short[1] ;
      T000U5_A47TBW02_ORDER = new int[1] ;
      T000U5_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      T000U3_A39TBW02_SESSION_ID = new String[] {""} ;
      T000U3_A40TBW02_APP_ID = new String[] {""} ;
      T000U3_A41TBW02_DISP_DATETIME = new String[] {""} ;
      T000U3_A42TBW02_STUDY_ID = new long[1] ;
      T000U3_A43TBW02_SUBJECT_ID = new int[1] ;
      T000U3_A44TBW02_VISIT_NO = new int[1] ;
      T000U3_A45TBW02_DOM_CD = new String[] {""} ;
      T000U3_A46TBW02_REPEAT_KEY = new short[1] ;
      T000U3_A47TBW02_ORDER = new int[1] ;
      T000U3_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      T000U3_A496TBW02_CRF_ITEM_CD = new String[] {""} ;
      T000U3_n496TBW02_CRF_ITEM_CD = new boolean[] {false} ;
      T000U3_A497TBW02_CRF_VALUE = new String[] {""} ;
      T000U3_n497TBW02_CRF_VALUE = new boolean[] {false} ;
      sMode29 = "" ;
      T000U6_A39TBW02_SESSION_ID = new String[] {""} ;
      T000U6_A40TBW02_APP_ID = new String[] {""} ;
      T000U6_A41TBW02_DISP_DATETIME = new String[] {""} ;
      T000U6_A42TBW02_STUDY_ID = new long[1] ;
      T000U6_A43TBW02_SUBJECT_ID = new int[1] ;
      T000U6_A44TBW02_VISIT_NO = new int[1] ;
      T000U6_A45TBW02_DOM_CD = new String[] {""} ;
      T000U6_A46TBW02_REPEAT_KEY = new short[1] ;
      T000U6_A47TBW02_ORDER = new int[1] ;
      T000U6_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      T000U7_A39TBW02_SESSION_ID = new String[] {""} ;
      T000U7_A40TBW02_APP_ID = new String[] {""} ;
      T000U7_A41TBW02_DISP_DATETIME = new String[] {""} ;
      T000U7_A42TBW02_STUDY_ID = new long[1] ;
      T000U7_A43TBW02_SUBJECT_ID = new int[1] ;
      T000U7_A44TBW02_VISIT_NO = new int[1] ;
      T000U7_A45TBW02_DOM_CD = new String[] {""} ;
      T000U7_A46TBW02_REPEAT_KEY = new short[1] ;
      T000U7_A47TBW02_ORDER = new int[1] ;
      T000U7_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      T000U2_A39TBW02_SESSION_ID = new String[] {""} ;
      T000U2_A40TBW02_APP_ID = new String[] {""} ;
      T000U2_A41TBW02_DISP_DATETIME = new String[] {""} ;
      T000U2_A42TBW02_STUDY_ID = new long[1] ;
      T000U2_A43TBW02_SUBJECT_ID = new int[1] ;
      T000U2_A44TBW02_VISIT_NO = new int[1] ;
      T000U2_A45TBW02_DOM_CD = new String[] {""} ;
      T000U2_A46TBW02_REPEAT_KEY = new short[1] ;
      T000U2_A47TBW02_ORDER = new int[1] ;
      T000U2_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      T000U2_A496TBW02_CRF_ITEM_CD = new String[] {""} ;
      T000U2_n496TBW02_CRF_ITEM_CD = new boolean[] {false} ;
      T000U2_A497TBW02_CRF_VALUE = new String[] {""} ;
      T000U2_n497TBW02_CRF_VALUE = new boolean[] {false} ;
      T000U11_A39TBW02_SESSION_ID = new String[] {""} ;
      T000U11_A40TBW02_APP_ID = new String[] {""} ;
      T000U11_A41TBW02_DISP_DATETIME = new String[] {""} ;
      T000U11_A42TBW02_STUDY_ID = new long[1] ;
      T000U11_A43TBW02_SUBJECT_ID = new int[1] ;
      T000U11_A44TBW02_VISIT_NO = new int[1] ;
      T000U11_A45TBW02_DOM_CD = new String[] {""} ;
      T000U11_A46TBW02_REPEAT_KEY = new short[1] ;
      T000U11_A47TBW02_ORDER = new int[1] ;
      T000U11_A48TBW02_DOM_VAR_NM = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw02_odm_work__default(),
         new Object[] {
             new Object[] {
            T000U2_A39TBW02_SESSION_ID, T000U2_A40TBW02_APP_ID, T000U2_A41TBW02_DISP_DATETIME, T000U2_A42TBW02_STUDY_ID, T000U2_A43TBW02_SUBJECT_ID, T000U2_A44TBW02_VISIT_NO, T000U2_A45TBW02_DOM_CD, T000U2_A46TBW02_REPEAT_KEY, T000U2_A47TBW02_ORDER, T000U2_A48TBW02_DOM_VAR_NM,
            T000U2_A496TBW02_CRF_ITEM_CD, T000U2_n496TBW02_CRF_ITEM_CD, T000U2_A497TBW02_CRF_VALUE, T000U2_n497TBW02_CRF_VALUE
            }
            , new Object[] {
            T000U3_A39TBW02_SESSION_ID, T000U3_A40TBW02_APP_ID, T000U3_A41TBW02_DISP_DATETIME, T000U3_A42TBW02_STUDY_ID, T000U3_A43TBW02_SUBJECT_ID, T000U3_A44TBW02_VISIT_NO, T000U3_A45TBW02_DOM_CD, T000U3_A46TBW02_REPEAT_KEY, T000U3_A47TBW02_ORDER, T000U3_A48TBW02_DOM_VAR_NM,
            T000U3_A496TBW02_CRF_ITEM_CD, T000U3_n496TBW02_CRF_ITEM_CD, T000U3_A497TBW02_CRF_VALUE, T000U3_n497TBW02_CRF_VALUE
            }
            , new Object[] {
            T000U4_A39TBW02_SESSION_ID, T000U4_A40TBW02_APP_ID, T000U4_A41TBW02_DISP_DATETIME, T000U4_A42TBW02_STUDY_ID, T000U4_A43TBW02_SUBJECT_ID, T000U4_A44TBW02_VISIT_NO, T000U4_A45TBW02_DOM_CD, T000U4_A46TBW02_REPEAT_KEY, T000U4_A47TBW02_ORDER, T000U4_A48TBW02_DOM_VAR_NM,
            T000U4_A496TBW02_CRF_ITEM_CD, T000U4_n496TBW02_CRF_ITEM_CD, T000U4_A497TBW02_CRF_VALUE, T000U4_n497TBW02_CRF_VALUE
            }
            , new Object[] {
            T000U5_A39TBW02_SESSION_ID, T000U5_A40TBW02_APP_ID, T000U5_A41TBW02_DISP_DATETIME, T000U5_A42TBW02_STUDY_ID, T000U5_A43TBW02_SUBJECT_ID, T000U5_A44TBW02_VISIT_NO, T000U5_A45TBW02_DOM_CD, T000U5_A46TBW02_REPEAT_KEY, T000U5_A47TBW02_ORDER, T000U5_A48TBW02_DOM_VAR_NM
            }
            , new Object[] {
            T000U6_A39TBW02_SESSION_ID, T000U6_A40TBW02_APP_ID, T000U6_A41TBW02_DISP_DATETIME, T000U6_A42TBW02_STUDY_ID, T000U6_A43TBW02_SUBJECT_ID, T000U6_A44TBW02_VISIT_NO, T000U6_A45TBW02_DOM_CD, T000U6_A46TBW02_REPEAT_KEY, T000U6_A47TBW02_ORDER, T000U6_A48TBW02_DOM_VAR_NM
            }
            , new Object[] {
            T000U7_A39TBW02_SESSION_ID, T000U7_A40TBW02_APP_ID, T000U7_A41TBW02_DISP_DATETIME, T000U7_A42TBW02_STUDY_ID, T000U7_A43TBW02_SUBJECT_ID, T000U7_A44TBW02_VISIT_NO, T000U7_A45TBW02_DOM_CD, T000U7_A46TBW02_REPEAT_KEY, T000U7_A47TBW02_ORDER, T000U7_A48TBW02_DOM_VAR_NM
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000U11_A39TBW02_SESSION_ID, T000U11_A40TBW02_APP_ID, T000U11_A41TBW02_DISP_DATETIME, T000U11_A42TBW02_STUDY_ID, T000U11_A43TBW02_SUBJECT_ID, T000U11_A44TBW02_VISIT_NO, T000U11_A45TBW02_DOM_CD, T000U11_A46TBW02_REPEAT_KEY, T000U11_A47TBW02_ORDER, T000U11_A48TBW02_DOM_VAR_NM
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW02_ODM_WORK" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z46TBW02_REPEAT_KEY ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A46TBW02_REPEAT_KEY ;
   private short RcdFound29 ;
   private short Gx_err ;
   private int Z43TBW02_SUBJECT_ID ;
   private int Z44TBW02_VISIT_NO ;
   private int Z47TBW02_ORDER ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW02_SESSION_ID_Enabled ;
   private int edtTBW02_APP_ID_Enabled ;
   private int edtTBW02_DISP_DATETIME_Enabled ;
   private int edtTBW02_STUDY_ID_Enabled ;
   private int A43TBW02_SUBJECT_ID ;
   private int edtTBW02_SUBJECT_ID_Enabled ;
   private int A44TBW02_VISIT_NO ;
   private int edtTBW02_VISIT_NO_Enabled ;
   private int edtTBW02_DOM_CD_Enabled ;
   private int edtTBW02_REPEAT_KEY_Enabled ;
   private int A47TBW02_ORDER ;
   private int edtTBW02_ORDER_Enabled ;
   private int edtTBW02_DOM_VAR_NM_Enabled ;
   private int edtTBW02_CRF_ITEM_CD_Enabled ;
   private int edtTBW02_CRF_VALUE_Enabled ;
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
   private long Z42TBW02_STUDY_ID ;
   private long A42TBW02_STUDY_ID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW02_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw02_session_id_Internalname ;
   private String lblTextblocktbw02_session_id_Jsonclick ;
   private String edtTBW02_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw02_app_id_Internalname ;
   private String lblTextblocktbw02_app_id_Jsonclick ;
   private String edtTBW02_APP_ID_Internalname ;
   private String edtTBW02_APP_ID_Jsonclick ;
   private String lblTextblocktbw02_disp_datetime_Internalname ;
   private String lblTextblocktbw02_disp_datetime_Jsonclick ;
   private String edtTBW02_DISP_DATETIME_Internalname ;
   private String edtTBW02_DISP_DATETIME_Jsonclick ;
   private String lblTextblocktbw02_study_id_Internalname ;
   private String lblTextblocktbw02_study_id_Jsonclick ;
   private String edtTBW02_STUDY_ID_Internalname ;
   private String edtTBW02_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw02_subject_id_Internalname ;
   private String lblTextblocktbw02_subject_id_Jsonclick ;
   private String edtTBW02_SUBJECT_ID_Internalname ;
   private String edtTBW02_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbw02_visit_no_Internalname ;
   private String lblTextblocktbw02_visit_no_Jsonclick ;
   private String edtTBW02_VISIT_NO_Internalname ;
   private String edtTBW02_VISIT_NO_Jsonclick ;
   private String lblTextblocktbw02_dom_cd_Internalname ;
   private String lblTextblocktbw02_dom_cd_Jsonclick ;
   private String edtTBW02_DOM_CD_Internalname ;
   private String edtTBW02_DOM_CD_Jsonclick ;
   private String lblTextblocktbw02_repeat_key_Internalname ;
   private String lblTextblocktbw02_repeat_key_Jsonclick ;
   private String edtTBW02_REPEAT_KEY_Internalname ;
   private String edtTBW02_REPEAT_KEY_Jsonclick ;
   private String lblTextblocktbw02_order_Internalname ;
   private String lblTextblocktbw02_order_Jsonclick ;
   private String edtTBW02_ORDER_Internalname ;
   private String edtTBW02_ORDER_Jsonclick ;
   private String lblTextblocktbw02_dom_var_nm_Internalname ;
   private String lblTextblocktbw02_dom_var_nm_Jsonclick ;
   private String edtTBW02_DOM_VAR_NM_Internalname ;
   private String edtTBW02_DOM_VAR_NM_Jsonclick ;
   private String lblTextblocktbw02_crf_item_cd_Internalname ;
   private String lblTextblocktbw02_crf_item_cd_Jsonclick ;
   private String edtTBW02_CRF_ITEM_CD_Internalname ;
   private String edtTBW02_CRF_ITEM_CD_Jsonclick ;
   private String lblTextblocktbw02_crf_value_Internalname ;
   private String lblTextblocktbw02_crf_value_Jsonclick ;
   private String edtTBW02_CRF_VALUE_Internalname ;
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
   private String sMode29 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n496TBW02_CRF_ITEM_CD ;
   private boolean n497TBW02_CRF_VALUE ;
   private boolean toggleJsOutput ;
   private String Z39TBW02_SESSION_ID ;
   private String Z40TBW02_APP_ID ;
   private String Z41TBW02_DISP_DATETIME ;
   private String Z45TBW02_DOM_CD ;
   private String Z48TBW02_DOM_VAR_NM ;
   private String Z496TBW02_CRF_ITEM_CD ;
   private String Z497TBW02_CRF_VALUE ;
   private String A39TBW02_SESSION_ID ;
   private String A40TBW02_APP_ID ;
   private String A41TBW02_DISP_DATETIME ;
   private String A45TBW02_DOM_CD ;
   private String A48TBW02_DOM_VAR_NM ;
   private String A496TBW02_CRF_ITEM_CD ;
   private String A497TBW02_CRF_VALUE ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000U4_A39TBW02_SESSION_ID ;
   private String[] T000U4_A40TBW02_APP_ID ;
   private String[] T000U4_A41TBW02_DISP_DATETIME ;
   private long[] T000U4_A42TBW02_STUDY_ID ;
   private int[] T000U4_A43TBW02_SUBJECT_ID ;
   private int[] T000U4_A44TBW02_VISIT_NO ;
   private String[] T000U4_A45TBW02_DOM_CD ;
   private short[] T000U4_A46TBW02_REPEAT_KEY ;
   private int[] T000U4_A47TBW02_ORDER ;
   private String[] T000U4_A48TBW02_DOM_VAR_NM ;
   private String[] T000U4_A496TBW02_CRF_ITEM_CD ;
   private boolean[] T000U4_n496TBW02_CRF_ITEM_CD ;
   private String[] T000U4_A497TBW02_CRF_VALUE ;
   private boolean[] T000U4_n497TBW02_CRF_VALUE ;
   private String[] T000U5_A39TBW02_SESSION_ID ;
   private String[] T000U5_A40TBW02_APP_ID ;
   private String[] T000U5_A41TBW02_DISP_DATETIME ;
   private long[] T000U5_A42TBW02_STUDY_ID ;
   private int[] T000U5_A43TBW02_SUBJECT_ID ;
   private int[] T000U5_A44TBW02_VISIT_NO ;
   private String[] T000U5_A45TBW02_DOM_CD ;
   private short[] T000U5_A46TBW02_REPEAT_KEY ;
   private int[] T000U5_A47TBW02_ORDER ;
   private String[] T000U5_A48TBW02_DOM_VAR_NM ;
   private String[] T000U3_A39TBW02_SESSION_ID ;
   private String[] T000U3_A40TBW02_APP_ID ;
   private String[] T000U3_A41TBW02_DISP_DATETIME ;
   private long[] T000U3_A42TBW02_STUDY_ID ;
   private int[] T000U3_A43TBW02_SUBJECT_ID ;
   private int[] T000U3_A44TBW02_VISIT_NO ;
   private String[] T000U3_A45TBW02_DOM_CD ;
   private short[] T000U3_A46TBW02_REPEAT_KEY ;
   private int[] T000U3_A47TBW02_ORDER ;
   private String[] T000U3_A48TBW02_DOM_VAR_NM ;
   private String[] T000U3_A496TBW02_CRF_ITEM_CD ;
   private boolean[] T000U3_n496TBW02_CRF_ITEM_CD ;
   private String[] T000U3_A497TBW02_CRF_VALUE ;
   private boolean[] T000U3_n497TBW02_CRF_VALUE ;
   private String[] T000U6_A39TBW02_SESSION_ID ;
   private String[] T000U6_A40TBW02_APP_ID ;
   private String[] T000U6_A41TBW02_DISP_DATETIME ;
   private long[] T000U6_A42TBW02_STUDY_ID ;
   private int[] T000U6_A43TBW02_SUBJECT_ID ;
   private int[] T000U6_A44TBW02_VISIT_NO ;
   private String[] T000U6_A45TBW02_DOM_CD ;
   private short[] T000U6_A46TBW02_REPEAT_KEY ;
   private int[] T000U6_A47TBW02_ORDER ;
   private String[] T000U6_A48TBW02_DOM_VAR_NM ;
   private String[] T000U7_A39TBW02_SESSION_ID ;
   private String[] T000U7_A40TBW02_APP_ID ;
   private String[] T000U7_A41TBW02_DISP_DATETIME ;
   private long[] T000U7_A42TBW02_STUDY_ID ;
   private int[] T000U7_A43TBW02_SUBJECT_ID ;
   private int[] T000U7_A44TBW02_VISIT_NO ;
   private String[] T000U7_A45TBW02_DOM_CD ;
   private short[] T000U7_A46TBW02_REPEAT_KEY ;
   private int[] T000U7_A47TBW02_ORDER ;
   private String[] T000U7_A48TBW02_DOM_VAR_NM ;
   private String[] T000U2_A39TBW02_SESSION_ID ;
   private String[] T000U2_A40TBW02_APP_ID ;
   private String[] T000U2_A41TBW02_DISP_DATETIME ;
   private long[] T000U2_A42TBW02_STUDY_ID ;
   private int[] T000U2_A43TBW02_SUBJECT_ID ;
   private int[] T000U2_A44TBW02_VISIT_NO ;
   private String[] T000U2_A45TBW02_DOM_CD ;
   private short[] T000U2_A46TBW02_REPEAT_KEY ;
   private int[] T000U2_A47TBW02_ORDER ;
   private String[] T000U2_A48TBW02_DOM_VAR_NM ;
   private String[] T000U2_A496TBW02_CRF_ITEM_CD ;
   private boolean[] T000U2_n496TBW02_CRF_ITEM_CD ;
   private String[] T000U2_A497TBW02_CRF_VALUE ;
   private boolean[] T000U2_n497TBW02_CRF_VALUE ;
   private String[] T000U11_A39TBW02_SESSION_ID ;
   private String[] T000U11_A40TBW02_APP_ID ;
   private String[] T000U11_A41TBW02_DISP_DATETIME ;
   private long[] T000U11_A42TBW02_STUDY_ID ;
   private int[] T000U11_A43TBW02_SUBJECT_ID ;
   private int[] T000U11_A44TBW02_VISIT_NO ;
   private String[] T000U11_A45TBW02_DOM_CD ;
   private short[] T000U11_A46TBW02_REPEAT_KEY ;
   private int[] T000U11_A47TBW02_ORDER ;
   private String[] T000U11_A48TBW02_DOM_VAR_NM ;
}

final  class tbw02_odm_work__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000U2", "SELECT `TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM`, `TBW02_CRF_ITEM_CD`, `TBW02_CRF_VALUE` FROM `TBW02_ODM_WORK` WHERE `TBW02_SESSION_ID` = ? AND `TBW02_APP_ID` = ? AND `TBW02_DISP_DATETIME` = ? AND `TBW02_STUDY_ID` = ? AND `TBW02_SUBJECT_ID` = ? AND `TBW02_VISIT_NO` = ? AND `TBW02_DOM_CD` = ? AND `TBW02_REPEAT_KEY` = ? AND `TBW02_ORDER` = ? AND `TBW02_DOM_VAR_NM` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000U3", "SELECT `TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM`, `TBW02_CRF_ITEM_CD`, `TBW02_CRF_VALUE` FROM `TBW02_ODM_WORK` WHERE `TBW02_SESSION_ID` = ? AND `TBW02_APP_ID` = ? AND `TBW02_DISP_DATETIME` = ? AND `TBW02_STUDY_ID` = ? AND `TBW02_SUBJECT_ID` = ? AND `TBW02_VISIT_NO` = ? AND `TBW02_DOM_CD` = ? AND `TBW02_REPEAT_KEY` = ? AND `TBW02_ORDER` = ? AND `TBW02_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000U4", "SELECT TM1.`TBW02_SESSION_ID`, TM1.`TBW02_APP_ID`, TM1.`TBW02_DISP_DATETIME`, TM1.`TBW02_STUDY_ID`, TM1.`TBW02_SUBJECT_ID`, TM1.`TBW02_VISIT_NO`, TM1.`TBW02_DOM_CD`, TM1.`TBW02_REPEAT_KEY`, TM1.`TBW02_ORDER`, TM1.`TBW02_DOM_VAR_NM`, TM1.`TBW02_CRF_ITEM_CD`, TM1.`TBW02_CRF_VALUE` FROM `TBW02_ODM_WORK` TM1 WHERE TM1.`TBW02_SESSION_ID` = ? and TM1.`TBW02_APP_ID` = ? and TM1.`TBW02_DISP_DATETIME` = ? and TM1.`TBW02_STUDY_ID` = ? and TM1.`TBW02_SUBJECT_ID` = ? and TM1.`TBW02_VISIT_NO` = ? and TM1.`TBW02_DOM_CD` = ? and TM1.`TBW02_REPEAT_KEY` = ? and TM1.`TBW02_ORDER` = ? and TM1.`TBW02_DOM_VAR_NM` = ? ORDER BY TM1.`TBW02_SESSION_ID`, TM1.`TBW02_APP_ID`, TM1.`TBW02_DISP_DATETIME`, TM1.`TBW02_STUDY_ID`, TM1.`TBW02_SUBJECT_ID`, TM1.`TBW02_VISIT_NO`, TM1.`TBW02_DOM_CD`, TM1.`TBW02_REPEAT_KEY`, TM1.`TBW02_ORDER`, TM1.`TBW02_DOM_VAR_NM` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000U5", "SELECT `TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM` FROM `TBW02_ODM_WORK` WHERE `TBW02_SESSION_ID` = ? AND `TBW02_APP_ID` = ? AND `TBW02_DISP_DATETIME` = ? AND `TBW02_STUDY_ID` = ? AND `TBW02_SUBJECT_ID` = ? AND `TBW02_VISIT_NO` = ? AND `TBW02_DOM_CD` = ? AND `TBW02_REPEAT_KEY` = ? AND `TBW02_ORDER` = ? AND `TBW02_DOM_VAR_NM` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000U6", "SELECT `TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM` FROM `TBW02_ODM_WORK` WHERE ( `TBW02_SESSION_ID` > ? or `TBW02_SESSION_ID` = ? and `TBW02_APP_ID` > ? or `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_DISP_DATETIME` > ? or `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_STUDY_ID` > ? or `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_SUBJECT_ID` > ? or `TBW02_SUBJECT_ID` = ? and `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_VISIT_NO` > ? or `TBW02_VISIT_NO` = ? and `TBW02_SUBJECT_ID` = ? and `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_DOM_CD` > ? or `TBW02_DOM_CD` = ? and `TBW02_VISIT_NO` = ? and `TBW02_SUBJECT_ID` = ? and `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_REPEAT_KEY` > ? or `TBW02_REPEAT_KEY` = ? and `TBW02_DOM_CD` = ? and `TBW02_VISIT_NO` = ? and `TBW02_SUBJECT_ID` = ? and `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_ORDER` > ? or `TBW02_ORDER` = ? and `TBW02_REPEAT_KEY` = ? and `TBW02_DOM_CD` = ? and `TBW02_VISIT_NO` = ? and `TBW02_SUBJECT_ID` = ? and `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_DOM_VAR_NM` > ?) ORDER BY `TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000U7", "SELECT `TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM` FROM `TBW02_ODM_WORK` WHERE ( `TBW02_SESSION_ID` < ? or `TBW02_SESSION_ID` = ? and `TBW02_APP_ID` < ? or `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_DISP_DATETIME` < ? or `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_STUDY_ID` < ? or `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_SUBJECT_ID` < ? or `TBW02_SUBJECT_ID` = ? and `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_VISIT_NO` < ? or `TBW02_VISIT_NO` = ? and `TBW02_SUBJECT_ID` = ? and `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_DOM_CD` < ? or `TBW02_DOM_CD` = ? and `TBW02_VISIT_NO` = ? and `TBW02_SUBJECT_ID` = ? and `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_REPEAT_KEY` < ? or `TBW02_REPEAT_KEY` = ? and `TBW02_DOM_CD` = ? and `TBW02_VISIT_NO` = ? and `TBW02_SUBJECT_ID` = ? and `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_ORDER` < ? or `TBW02_ORDER` = ? and `TBW02_REPEAT_KEY` = ? and `TBW02_DOM_CD` = ? and `TBW02_VISIT_NO` = ? and `TBW02_SUBJECT_ID` = ? and `TBW02_STUDY_ID` = ? and `TBW02_DISP_DATETIME` = ? and `TBW02_APP_ID` = ? and `TBW02_SESSION_ID` = ? and `TBW02_DOM_VAR_NM` < ?) ORDER BY `TBW02_SESSION_ID` DESC, `TBW02_APP_ID` DESC, `TBW02_DISP_DATETIME` DESC, `TBW02_STUDY_ID` DESC, `TBW02_SUBJECT_ID` DESC, `TBW02_VISIT_NO` DESC, `TBW02_DOM_CD` DESC, `TBW02_REPEAT_KEY` DESC, `TBW02_ORDER` DESC, `TBW02_DOM_VAR_NM` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000U8", "INSERT INTO `TBW02_ODM_WORK`(`TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM`, `TBW02_CRF_ITEM_CD`, `TBW02_CRF_VALUE`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000U9", "UPDATE `TBW02_ODM_WORK` SET `TBW02_CRF_ITEM_CD`=?, `TBW02_CRF_VALUE`=?  WHERE `TBW02_SESSION_ID` = ? AND `TBW02_APP_ID` = ? AND `TBW02_DISP_DATETIME` = ? AND `TBW02_STUDY_ID` = ? AND `TBW02_SUBJECT_ID` = ? AND `TBW02_VISIT_NO` = ? AND `TBW02_DOM_CD` = ? AND `TBW02_REPEAT_KEY` = ? AND `TBW02_ORDER` = ? AND `TBW02_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new UpdateCursor("T000U10", "DELETE FROM `TBW02_ODM_WORK`  WHERE `TBW02_SESSION_ID` = ? AND `TBW02_APP_ID` = ? AND `TBW02_DISP_DATETIME` = ? AND `TBW02_STUDY_ID` = ? AND `TBW02_SUBJECT_ID` = ? AND `TBW02_VISIT_NO` = ? AND `TBW02_DOM_CD` = ? AND `TBW02_REPEAT_KEY` = ? AND `TBW02_ORDER` = ? AND `TBW02_DOM_VAR_NM` = ?", GX_NOMASK)
         ,new ForEachCursor("T000U11", "SELECT `TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM` FROM `TBW02_ODM_WORK` ORDER BY `TBW02_SESSION_ID`, `TBW02_APP_ID`, `TBW02_DISP_DATETIME`, `TBW02_STUDY_ID`, `TBW02_SUBJECT_ID`, `TBW02_VISIT_NO`, `TBW02_DOM_CD`, `TBW02_REPEAT_KEY`, `TBW02_ORDER`, `TBW02_DOM_VAR_NM` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
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
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
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
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
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
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((int[]) buf[5])[0] = rslt.getInt(6) ;
               ((String[]) buf[6])[0] = rslt.getVarchar(7) ;
               ((short[]) buf[7])[0] = rslt.getShort(8) ;
               ((int[]) buf[8])[0] = rslt.getInt(9) ;
               ((String[]) buf[9])[0] = rslt.getVarchar(10) ;
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
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 2, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 2, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 2, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 2, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
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
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setLong(24, ((Number) parms[23]).longValue());
               stmt.setVarchar(25, (String)parms[24], 14, false);
               stmt.setVarchar(26, (String)parms[25], 7, false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setVarchar(28, (String)parms[27], 2, false);
               stmt.setVarchar(29, (String)parms[28], 2, false);
               stmt.setInt(30, ((Number) parms[29]).intValue());
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setLong(32, ((Number) parms[31]).longValue());
               stmt.setVarchar(33, (String)parms[32], 14, false);
               stmt.setVarchar(34, (String)parms[33], 7, false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setShort(36, ((Number) parms[35]).shortValue());
               stmt.setShort(37, ((Number) parms[36]).shortValue());
               stmt.setVarchar(38, (String)parms[37], 2, false);
               stmt.setInt(39, ((Number) parms[38]).intValue());
               stmt.setInt(40, ((Number) parms[39]).intValue());
               stmt.setLong(41, ((Number) parms[40]).longValue());
               stmt.setVarchar(42, (String)parms[41], 14, false);
               stmt.setVarchar(43, (String)parms[42], 7, false);
               stmt.setVarchar(44, (String)parms[43], 50, false);
               stmt.setInt(45, ((Number) parms[44]).intValue());
               stmt.setInt(46, ((Number) parms[45]).intValue());
               stmt.setShort(47, ((Number) parms[46]).shortValue());
               stmt.setVarchar(48, (String)parms[47], 2, false);
               stmt.setInt(49, ((Number) parms[48]).intValue());
               stmt.setInt(50, ((Number) parms[49]).intValue());
               stmt.setLong(51, ((Number) parms[50]).longValue());
               stmt.setVarchar(52, (String)parms[51], 14, false);
               stmt.setVarchar(53, (String)parms[52], 7, false);
               stmt.setVarchar(54, (String)parms[53], 50, false);
               stmt.setVarchar(55, (String)parms[54], 50, false);
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
               stmt.setInt(21, ((Number) parms[20]).intValue());
               stmt.setInt(22, ((Number) parms[21]).intValue());
               stmt.setInt(23, ((Number) parms[22]).intValue());
               stmt.setLong(24, ((Number) parms[23]).longValue());
               stmt.setVarchar(25, (String)parms[24], 14, false);
               stmt.setVarchar(26, (String)parms[25], 7, false);
               stmt.setVarchar(27, (String)parms[26], 50, false);
               stmt.setVarchar(28, (String)parms[27], 2, false);
               stmt.setVarchar(29, (String)parms[28], 2, false);
               stmt.setInt(30, ((Number) parms[29]).intValue());
               stmt.setInt(31, ((Number) parms[30]).intValue());
               stmt.setLong(32, ((Number) parms[31]).longValue());
               stmt.setVarchar(33, (String)parms[32], 14, false);
               stmt.setVarchar(34, (String)parms[33], 7, false);
               stmt.setVarchar(35, (String)parms[34], 50, false);
               stmt.setShort(36, ((Number) parms[35]).shortValue());
               stmt.setShort(37, ((Number) parms[36]).shortValue());
               stmt.setVarchar(38, (String)parms[37], 2, false);
               stmt.setInt(39, ((Number) parms[38]).intValue());
               stmt.setInt(40, ((Number) parms[39]).intValue());
               stmt.setLong(41, ((Number) parms[40]).longValue());
               stmt.setVarchar(42, (String)parms[41], 14, false);
               stmt.setVarchar(43, (String)parms[42], 7, false);
               stmt.setVarchar(44, (String)parms[43], 50, false);
               stmt.setInt(45, ((Number) parms[44]).intValue());
               stmt.setInt(46, ((Number) parms[45]).intValue());
               stmt.setShort(47, ((Number) parms[46]).shortValue());
               stmt.setVarchar(48, (String)parms[47], 2, false);
               stmt.setInt(49, ((Number) parms[48]).intValue());
               stmt.setInt(50, ((Number) parms[49]).intValue());
               stmt.setLong(51, ((Number) parms[50]).longValue());
               stmt.setVarchar(52, (String)parms[51], 14, false);
               stmt.setVarchar(53, (String)parms[52], 7, false);
               stmt.setVarchar(54, (String)parms[53], 50, false);
               stmt.setVarchar(55, (String)parms[54], 50, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 2, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[13], 2000);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 50);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 2000);
               }
               stmt.setVarchar(3, (String)parms[4], 50, false);
               stmt.setVarchar(4, (String)parms[5], 7, false);
               stmt.setVarchar(5, (String)parms[6], 14, false);
               stmt.setLong(6, ((Number) parms[7]).longValue());
               stmt.setInt(7, ((Number) parms[8]).intValue());
               stmt.setInt(8, ((Number) parms[9]).intValue());
               stmt.setVarchar(9, (String)parms[10], 2, false);
               stmt.setShort(10, ((Number) parms[11]).shortValue());
               stmt.setInt(11, ((Number) parms[12]).intValue());
               stmt.setVarchar(12, (String)parms[13], 50, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               stmt.setVarchar(3, (String)parms[2], 14, false);
               stmt.setLong(4, ((Number) parms[3]).longValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setVarchar(7, (String)parms[6], 2, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               return;
      }
   }

}

