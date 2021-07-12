/*
               File: tbt02_crf_impl
        Description: CRFテーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:19:55.59
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt02_crf_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel10"+"_"+"TBT02_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx10asatbt02_crt_user_id0P55( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel12"+"_"+"TBT02_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx12asatbt02_upd_user_id0P55( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_15") == 0 )
      {
         A89TBT02_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
         A90TBT02_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_15( A89TBT02_STUDY_ID, A90TBT02_SUBJECT_ID) ;
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
         Form.getMeta().addItem("description", "CRFテーブル", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbt02_crf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt02_crf_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt02_crf_impl.class ));
   }

   public tbt02_crf_impl( int remoteHandle ,
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
         wb_table1_2_0P55( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0P55e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0P55( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0P55( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0P55( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0P55e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRFテーブル", 1, 0, "px", 0, "px", "Group", "", "HLP_TBT02_CRF.htm");
         wb_table3_28_0P55( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0P55e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0P55e( true) ;
      }
      else
      {
         wb_table1_2_0P55e( false) ;
      }
   }

   public void wb_table3_28_0P55( boolean wbgen )
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
         wb_table4_34_0P55( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0P55e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 207,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT02_CRF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 208,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT02_CRF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0P55e( true) ;
      }
      else
      {
         wb_table3_28_0P55e( false) ;
      }
   }

   public void wb_table4_34_0P55( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_study_id_Internalname, "試験ID", "", "", lblTextblocktbt02_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A89TBT02_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBT02_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A89TBT02_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A89TBT02_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_subject_id_Internalname, "患者ID", "", "", lblTextblocktbt02_subject_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A90TBT02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBT02_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A90TBT02_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A90TBT02_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_SUBJECT_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_SUBJECT_ID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crf_id_Internalname, "CRFID", "", "", lblTextblocktbt02_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A91TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBT02_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A91TBT02_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A91TBT02_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crf_eda_no_Internalname, "CRF枝番", "", "", lblTextblocktbt02_crf_eda_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRF_EDA_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A935TBT02_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")), ((edtTBT02_CRF_EDA_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A935TBT02_CRF_EDA_NO), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A935TBT02_CRF_EDA_NO), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_CRF_EDA_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_CRF_EDA_NO_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crf_latest_version_Internalname, "CRF最新更新バージョン", "", "", lblTextblocktbt02_crf_latest_version_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRF_LATEST_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A498TBT02_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBT02_CRF_LATEST_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A498TBT02_CRF_LATEST_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A498TBT02_CRF_LATEST_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_CRF_LATEST_VERSION_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_CRF_LATEST_VERSION_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_VERSION", "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crf_input_level_Internalname, "CRF入力権限レベル", "", "", lblTextblocktbt02_crf_input_level_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRF_INPUT_LEVEL_Internalname, GXutil.ltrim( localUtil.ntoc( A499TBT02_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")), ((edtTBT02_CRF_INPUT_LEVEL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A499TBT02_CRF_INPUT_LEVEL), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A499TBT02_CRF_INPUT_LEVEL), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_CRF_INPUT_LEVEL_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_CRF_INPUT_LEVEL_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_lock_flg_Internalname, "ロックフラグ", "", "", lblTextblocktbt02_lock_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_LOCK_FLG_Internalname, GXutil.rtrim( A648TBT02_LOCK_FLG), GXutil.rtrim( localUtil.format( A648TBT02_LOCK_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_LOCK_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_LOCK_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_lock_datetime_Internalname, "ロック日時", "", "", lblTextblocktbt02_lock_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT02_LOCK_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_LOCK_DATETIME_Internalname, localUtil.format(A649TBT02_LOCK_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A649TBT02_LOCK_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_LOCK_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_LOCK_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_LOCK_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT02_LOCK_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_lock_user_id_Internalname, "ID", "", "", lblTextblocktbt02_lock_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_LOCK_USER_ID_Internalname, GXutil.rtrim( A650TBT02_LOCK_USER_ID), GXutil.rtrim( localUtil.format( A650TBT02_LOCK_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_LOCK_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_LOCK_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_lock_auth_cd_Internalname, "ロック時権限コード", "", "", lblTextblocktbt02_lock_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_LOCK_AUTH_CD_Internalname, GXutil.rtrim( A651TBT02_LOCK_AUTH_CD), GXutil.rtrim( localUtil.format( A651TBT02_LOCK_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_LOCK_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_LOCK_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upload_datetime_Internalname, "アップロード日時", "", "", lblTextblocktbt02_upload_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT02_UPLOAD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPLOAD_DATETIME_Internalname, localUtil.format(A652TBT02_UPLOAD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A652TBT02_UPLOAD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_UPLOAD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_UPLOAD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_UPLOAD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT02_UPLOAD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upload_user_id_Internalname, "ID", "", "", lblTextblocktbt02_upload_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPLOAD_USER_ID_Internalname, GXutil.rtrim( A653TBT02_UPLOAD_USER_ID), GXutil.rtrim( localUtil.format( A653TBT02_UPLOAD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_UPLOAD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_UPLOAD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upload_auth_cd_Internalname, "アップロード時権限コード", "", "", lblTextblocktbt02_upload_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPLOAD_AUTH_CD_Internalname, GXutil.rtrim( A654TBT02_UPLOAD_AUTH_CD), GXutil.rtrim( localUtil.format( A654TBT02_UPLOAD_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_UPLOAD_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_UPLOAD_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_dm_arrival_flg_Internalname, "DM到着フラグ", "", "", lblTextblocktbt02_dm_arrival_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_DM_ARRIVAL_FLG_Internalname, GXutil.rtrim( A655TBT02_DM_ARRIVAL_FLG), GXutil.rtrim( localUtil.format( A655TBT02_DM_ARRIVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_DM_ARRIVAL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_DM_ARRIVAL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_dm_arrival_datetime_Internalname, "DM到着日時", "", "", lblTextblocktbt02_dm_arrival_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT02_DM_ARRIVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_DM_ARRIVAL_DATETIME_Internalname, localUtil.format(A656TBT02_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A656TBT02_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_DM_ARRIVAL_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_DM_ARRIVAL_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_DM_ARRIVAL_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT02_DM_ARRIVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_approval_flg_Internalname, "承認フラグ", "", "", lblTextblocktbt02_approval_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_APPROVAL_FLG_Internalname, GXutil.rtrim( A657TBT02_APPROVAL_FLG), GXutil.rtrim( localUtil.format( A657TBT02_APPROVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_APPROVAL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_APPROVAL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_approval_datetime_Internalname, "承認日時", "", "", lblTextblocktbt02_approval_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT02_APPROVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_APPROVAL_DATETIME_Internalname, localUtil.format(A658TBT02_APPROVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A658TBT02_APPROVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_APPROVAL_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_APPROVAL_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_APPROVAL_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT02_APPROVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_approval_user_id_Internalname, "ID", "", "", lblTextblocktbt02_approval_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_APPROVAL_USER_ID_Internalname, GXutil.rtrim( A659TBT02_APPROVAL_USER_ID), GXutil.rtrim( localUtil.format( A659TBT02_APPROVAL_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_APPROVAL_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_APPROVAL_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_approval_auth_cd_Internalname, "承認時権限コード", "", "", lblTextblocktbt02_approval_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_APPROVAL_AUTH_CD_Internalname, GXutil.rtrim( A660TBT02_APPROVAL_AUTH_CD), GXutil.rtrim( localUtil.format( A660TBT02_APPROVAL_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_APPROVAL_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_APPROVAL_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_signature_flg_Internalname, "署名フラグ", "", "", lblTextblocktbt02_signature_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_SIGNATURE_FLG_Internalname, GXutil.rtrim( A990TBT02_SIGNATURE_FLG), GXutil.rtrim( localUtil.format( A990TBT02_SIGNATURE_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_SIGNATURE_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_SIGNATURE_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_signature_datetime_Internalname, "署名日時", "", "", lblTextblocktbt02_signature_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT02_SIGNATURE_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_SIGNATURE_DATETIME_Internalname, localUtil.format(A991TBT02_SIGNATURE_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A991TBT02_SIGNATURE_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_SIGNATURE_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_SIGNATURE_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_SIGNATURE_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT02_SIGNATURE_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_signature_user_id_Internalname, "ID", "", "", lblTextblocktbt02_signature_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_SIGNATURE_USER_ID_Internalname, GXutil.rtrim( A992TBT02_SIGNATURE_USER_ID), GXutil.rtrim( localUtil.format( A992TBT02_SIGNATURE_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_SIGNATURE_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_SIGNATURE_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_input_end_flg_Internalname, "データ固定フラグ", "", "", lblTextblocktbt02_input_end_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_INPUT_END_FLG_Internalname, GXutil.rtrim( A661TBT02_INPUT_END_FLG), GXutil.rtrim( localUtil.format( A661TBT02_INPUT_END_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_INPUT_END_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_INPUT_END_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_input_end_datetime_Internalname, "データ固定日時", "", "", lblTextblocktbt02_input_end_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT02_INPUT_END_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_INPUT_END_DATETIME_Internalname, localUtil.format(A662TBT02_INPUT_END_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A662TBT02_INPUT_END_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(154);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_INPUT_END_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_INPUT_END_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_INPUT_END_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT02_INPUT_END_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_input_end_user_id_Internalname, "ID", "", "", lblTextblocktbt02_input_end_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 159,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_INPUT_END_USER_ID_Internalname, GXutil.rtrim( A663TBT02_INPUT_END_USER_ID), GXutil.rtrim( localUtil.format( A663TBT02_INPUT_END_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(159);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_INPUT_END_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_INPUT_END_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_input_end_auth_cd_Internalname, "データ固定時権限コード", "", "", lblTextblocktbt02_input_end_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 164,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_INPUT_END_AUTH_CD_Internalname, GXutil.rtrim( A664TBT02_INPUT_END_AUTH_CD), GXutil.rtrim( localUtil.format( A664TBT02_INPUT_END_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(164);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_INPUT_END_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_INPUT_END_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt02_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_DEL_FLG_Internalname, GXutil.rtrim( A449TBT02_DEL_FLG), GXutil.rtrim( localUtil.format( A449TBT02_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(169);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt02_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT02_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRT_DATETIME_Internalname, localUtil.format(A450TBT02_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A450TBT02_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT02_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbt02_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRT_USER_ID_Internalname, GXutil.rtrim( A451TBT02_CRT_USER_ID), GXutil.rtrim( localUtil.format( A451TBT02_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt02_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRT_PROG_NM_Internalname, GXutil.rtrim( A452TBT02_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A452TBT02_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt02_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT02_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPD_DATETIME_Internalname, localUtil.format(A453TBT02_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A453TBT02_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT02_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbt02_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 194,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPD_USER_ID_Internalname, GXutil.rtrim( A454TBT02_UPD_USER_ID), GXutil.rtrim( localUtil.format( A454TBT02_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(194);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt02_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 199,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPD_PROG_NM_Internalname, GXutil.rtrim( A455TBT02_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A455TBT02_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(199);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt02_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A456TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT02_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A456TBT02_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A456TBT02_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(204);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT02_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT02_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0P55e( true) ;
      }
      else
      {
         wb_table4_34_0P55e( false) ;
      }
   }

   public void wb_table2_5_0P55( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT02_CRF.htm");
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
         wb_table2_5_0P55e( true) ;
      }
      else
      {
         wb_table2_5_0P55e( false) ;
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
      /* Execute user event: e110P2 */
      e110P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A89TBT02_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
            }
            else
            {
               A89TBT02_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBT02_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A90TBT02_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A90TBT02_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBT02_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A91TBT02_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
            }
            else
            {
               A91TBT02_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_EDA_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_EDA_NO_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_CRF_EDA_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_CRF_EDA_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A935TBT02_CRF_EDA_NO = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
            }
            else
            {
               A935TBT02_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_EDA_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_LATEST_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_LATEST_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_CRF_LATEST_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_CRF_LATEST_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A498TBT02_CRF_LATEST_VERSION = (short)(0) ;
               n498TBT02_CRF_LATEST_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A498TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A498TBT02_CRF_LATEST_VERSION, 4, 0)));
            }
            else
            {
               A498TBT02_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_LATEST_VERSION_Internalname), ".", ",")) ;
               n498TBT02_CRF_LATEST_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A498TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A498TBT02_CRF_LATEST_VERSION, 4, 0)));
            }
            n498TBT02_CRF_LATEST_VERSION = ((0==A498TBT02_CRF_LATEST_VERSION) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_INPUT_LEVEL_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_INPUT_LEVEL_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_CRF_INPUT_LEVEL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_CRF_INPUT_LEVEL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A499TBT02_CRF_INPUT_LEVEL = (byte)(0) ;
               n499TBT02_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A499TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A499TBT02_CRF_INPUT_LEVEL, 2, 0)));
            }
            else
            {
               A499TBT02_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_INPUT_LEVEL_Internalname), ".", ",")) ;
               n499TBT02_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A499TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A499TBT02_CRF_INPUT_LEVEL, 2, 0)));
            }
            n499TBT02_CRF_INPUT_LEVEL = ((0==A499TBT02_CRF_INPUT_LEVEL) ? true : false) ;
            A648TBT02_LOCK_FLG = httpContext.cgiGet( edtTBT02_LOCK_FLG_Internalname) ;
            n648TBT02_LOCK_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A648TBT02_LOCK_FLG", A648TBT02_LOCK_FLG);
            n648TBT02_LOCK_FLG = ((GXutil.strcmp("", A648TBT02_LOCK_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_LOCK_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT02_LOCK_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_LOCK_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A649TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n649TBT02_LOCK_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A649TBT02_LOCK_DATETIME", localUtil.ttoc( A649TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A649TBT02_LOCK_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_LOCK_DATETIME_Internalname)) ;
               n649TBT02_LOCK_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A649TBT02_LOCK_DATETIME", localUtil.ttoc( A649TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n649TBT02_LOCK_DATETIME = (GXutil.nullDate().equals(A649TBT02_LOCK_DATETIME) ? true : false) ;
            A650TBT02_LOCK_USER_ID = httpContext.cgiGet( edtTBT02_LOCK_USER_ID_Internalname) ;
            n650TBT02_LOCK_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A650TBT02_LOCK_USER_ID", A650TBT02_LOCK_USER_ID);
            n650TBT02_LOCK_USER_ID = ((GXutil.strcmp("", A650TBT02_LOCK_USER_ID)==0) ? true : false) ;
            A651TBT02_LOCK_AUTH_CD = httpContext.cgiGet( edtTBT02_LOCK_AUTH_CD_Internalname) ;
            n651TBT02_LOCK_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A651TBT02_LOCK_AUTH_CD", A651TBT02_LOCK_AUTH_CD);
            n651TBT02_LOCK_AUTH_CD = ((GXutil.strcmp("", A651TBT02_LOCK_AUTH_CD)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_UPLOAD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT02_UPLOAD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_UPLOAD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n652TBT02_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A652TBT02_UPLOAD_DATETIME", localUtil.ttoc( A652TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A652TBT02_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_UPLOAD_DATETIME_Internalname)) ;
               n652TBT02_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A652TBT02_UPLOAD_DATETIME", localUtil.ttoc( A652TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n652TBT02_UPLOAD_DATETIME = (GXutil.nullDate().equals(A652TBT02_UPLOAD_DATETIME) ? true : false) ;
            A653TBT02_UPLOAD_USER_ID = httpContext.cgiGet( edtTBT02_UPLOAD_USER_ID_Internalname) ;
            n653TBT02_UPLOAD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A653TBT02_UPLOAD_USER_ID", A653TBT02_UPLOAD_USER_ID);
            n653TBT02_UPLOAD_USER_ID = ((GXutil.strcmp("", A653TBT02_UPLOAD_USER_ID)==0) ? true : false) ;
            A654TBT02_UPLOAD_AUTH_CD = httpContext.cgiGet( edtTBT02_UPLOAD_AUTH_CD_Internalname) ;
            n654TBT02_UPLOAD_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A654TBT02_UPLOAD_AUTH_CD", A654TBT02_UPLOAD_AUTH_CD);
            n654TBT02_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A654TBT02_UPLOAD_AUTH_CD)==0) ? true : false) ;
            A655TBT02_DM_ARRIVAL_FLG = httpContext.cgiGet( edtTBT02_DM_ARRIVAL_FLG_Internalname) ;
            n655TBT02_DM_ARRIVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A655TBT02_DM_ARRIVAL_FLG", A655TBT02_DM_ARRIVAL_FLG);
            n655TBT02_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A655TBT02_DM_ARRIVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_DM_ARRIVAL_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT02_DM_ARRIVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_DM_ARRIVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n656TBT02_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A656TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A656TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A656TBT02_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_DM_ARRIVAL_DATETIME_Internalname)) ;
               n656TBT02_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A656TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A656TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n656TBT02_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A656TBT02_DM_ARRIVAL_DATETIME) ? true : false) ;
            A657TBT02_APPROVAL_FLG = httpContext.cgiGet( edtTBT02_APPROVAL_FLG_Internalname) ;
            n657TBT02_APPROVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A657TBT02_APPROVAL_FLG", A657TBT02_APPROVAL_FLG);
            n657TBT02_APPROVAL_FLG = ((GXutil.strcmp("", A657TBT02_APPROVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_APPROVAL_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT02_APPROVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_APPROVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n658TBT02_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658TBT02_APPROVAL_DATETIME", localUtil.ttoc( A658TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A658TBT02_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_APPROVAL_DATETIME_Internalname)) ;
               n658TBT02_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A658TBT02_APPROVAL_DATETIME", localUtil.ttoc( A658TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n658TBT02_APPROVAL_DATETIME = (GXutil.nullDate().equals(A658TBT02_APPROVAL_DATETIME) ? true : false) ;
            A659TBT02_APPROVAL_USER_ID = httpContext.cgiGet( edtTBT02_APPROVAL_USER_ID_Internalname) ;
            n659TBT02_APPROVAL_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A659TBT02_APPROVAL_USER_ID", A659TBT02_APPROVAL_USER_ID);
            n659TBT02_APPROVAL_USER_ID = ((GXutil.strcmp("", A659TBT02_APPROVAL_USER_ID)==0) ? true : false) ;
            A660TBT02_APPROVAL_AUTH_CD = httpContext.cgiGet( edtTBT02_APPROVAL_AUTH_CD_Internalname) ;
            n660TBT02_APPROVAL_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A660TBT02_APPROVAL_AUTH_CD", A660TBT02_APPROVAL_AUTH_CD);
            n660TBT02_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A660TBT02_APPROVAL_AUTH_CD)==0) ? true : false) ;
            A990TBT02_SIGNATURE_FLG = httpContext.cgiGet( edtTBT02_SIGNATURE_FLG_Internalname) ;
            n990TBT02_SIGNATURE_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A990TBT02_SIGNATURE_FLG", A990TBT02_SIGNATURE_FLG);
            n990TBT02_SIGNATURE_FLG = ((GXutil.strcmp("", A990TBT02_SIGNATURE_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_SIGNATURE_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT02_SIGNATURE_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_SIGNATURE_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A991TBT02_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n991TBT02_SIGNATURE_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A991TBT02_SIGNATURE_DATETIME", localUtil.ttoc( A991TBT02_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A991TBT02_SIGNATURE_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_SIGNATURE_DATETIME_Internalname)) ;
               n991TBT02_SIGNATURE_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A991TBT02_SIGNATURE_DATETIME", localUtil.ttoc( A991TBT02_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n991TBT02_SIGNATURE_DATETIME = (GXutil.nullDate().equals(A991TBT02_SIGNATURE_DATETIME) ? true : false) ;
            A992TBT02_SIGNATURE_USER_ID = httpContext.cgiGet( edtTBT02_SIGNATURE_USER_ID_Internalname) ;
            n992TBT02_SIGNATURE_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A992TBT02_SIGNATURE_USER_ID", A992TBT02_SIGNATURE_USER_ID);
            n992TBT02_SIGNATURE_USER_ID = ((GXutil.strcmp("", A992TBT02_SIGNATURE_USER_ID)==0) ? true : false) ;
            A661TBT02_INPUT_END_FLG = httpContext.cgiGet( edtTBT02_INPUT_END_FLG_Internalname) ;
            n661TBT02_INPUT_END_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A661TBT02_INPUT_END_FLG", A661TBT02_INPUT_END_FLG);
            n661TBT02_INPUT_END_FLG = ((GXutil.strcmp("", A661TBT02_INPUT_END_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_INPUT_END_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT02_INPUT_END_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_INPUT_END_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A662TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n662TBT02_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A662TBT02_INPUT_END_DATETIME", localUtil.ttoc( A662TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A662TBT02_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_INPUT_END_DATETIME_Internalname)) ;
               n662TBT02_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A662TBT02_INPUT_END_DATETIME", localUtil.ttoc( A662TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n662TBT02_INPUT_END_DATETIME = (GXutil.nullDate().equals(A662TBT02_INPUT_END_DATETIME) ? true : false) ;
            A663TBT02_INPUT_END_USER_ID = httpContext.cgiGet( edtTBT02_INPUT_END_USER_ID_Internalname) ;
            n663TBT02_INPUT_END_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A663TBT02_INPUT_END_USER_ID", A663TBT02_INPUT_END_USER_ID);
            n663TBT02_INPUT_END_USER_ID = ((GXutil.strcmp("", A663TBT02_INPUT_END_USER_ID)==0) ? true : false) ;
            A664TBT02_INPUT_END_AUTH_CD = httpContext.cgiGet( edtTBT02_INPUT_END_AUTH_CD_Internalname) ;
            n664TBT02_INPUT_END_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A664TBT02_INPUT_END_AUTH_CD", A664TBT02_INPUT_END_AUTH_CD);
            n664TBT02_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A664TBT02_INPUT_END_AUTH_CD)==0) ? true : false) ;
            A449TBT02_DEL_FLG = httpContext.cgiGet( edtTBT02_DEL_FLG_Internalname) ;
            n449TBT02_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A449TBT02_DEL_FLG", A449TBT02_DEL_FLG);
            n449TBT02_DEL_FLG = ((GXutil.strcmp("", A449TBT02_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT02_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A450TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n450TBT02_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A450TBT02_CRT_DATETIME", localUtil.ttoc( A450TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A450TBT02_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_CRT_DATETIME_Internalname)) ;
               n450TBT02_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A450TBT02_CRT_DATETIME", localUtil.ttoc( A450TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n450TBT02_CRT_DATETIME = (GXutil.nullDate().equals(A450TBT02_CRT_DATETIME) ? true : false) ;
            A451TBT02_CRT_USER_ID = httpContext.cgiGet( edtTBT02_CRT_USER_ID_Internalname) ;
            n451TBT02_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A451TBT02_CRT_USER_ID", A451TBT02_CRT_USER_ID);
            n451TBT02_CRT_USER_ID = ((GXutil.strcmp("", A451TBT02_CRT_USER_ID)==0) ? true : false) ;
            A452TBT02_CRT_PROG_NM = httpContext.cgiGet( edtTBT02_CRT_PROG_NM_Internalname) ;
            n452TBT02_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A452TBT02_CRT_PROG_NM", A452TBT02_CRT_PROG_NM);
            n452TBT02_CRT_PROG_NM = ((GXutil.strcmp("", A452TBT02_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT02_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n453TBT02_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A453TBT02_UPD_DATETIME", localUtil.ttoc( A453TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A453TBT02_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_UPD_DATETIME_Internalname)) ;
               n453TBT02_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A453TBT02_UPD_DATETIME", localUtil.ttoc( A453TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n453TBT02_UPD_DATETIME = (GXutil.nullDate().equals(A453TBT02_UPD_DATETIME) ? true : false) ;
            A454TBT02_UPD_USER_ID = httpContext.cgiGet( edtTBT02_UPD_USER_ID_Internalname) ;
            n454TBT02_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A454TBT02_UPD_USER_ID", A454TBT02_UPD_USER_ID);
            n454TBT02_UPD_USER_ID = ((GXutil.strcmp("", A454TBT02_UPD_USER_ID)==0) ? true : false) ;
            A455TBT02_UPD_PROG_NM = httpContext.cgiGet( edtTBT02_UPD_PROG_NM_Internalname) ;
            n455TBT02_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A455TBT02_UPD_PROG_NM", A455TBT02_UPD_PROG_NM);
            n455TBT02_UPD_PROG_NM = ((GXutil.strcmp("", A455TBT02_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A456TBT02_UPD_CNT = 0 ;
               n456TBT02_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A456TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)));
            }
            else
            {
               A456TBT02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT02_UPD_CNT_Internalname), ".", ",") ;
               n456TBT02_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A456TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)));
            }
            n456TBT02_UPD_CNT = ((0==A456TBT02_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z89TBT02_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z89TBT02_STUDY_ID"), ".", ",") ;
            Z90TBT02_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z90TBT02_SUBJECT_ID"), ".", ",")) ;
            Z91TBT02_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z91TBT02_CRF_ID"), ".", ",")) ;
            Z935TBT02_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z935TBT02_CRF_EDA_NO"), ".", ",")) ;
            Z450TBT02_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z450TBT02_CRT_DATETIME"), 0) ;
            n450TBT02_CRT_DATETIME = (GXutil.nullDate().equals(A450TBT02_CRT_DATETIME) ? true : false) ;
            Z451TBT02_CRT_USER_ID = httpContext.cgiGet( "Z451TBT02_CRT_USER_ID") ;
            n451TBT02_CRT_USER_ID = ((GXutil.strcmp("", A451TBT02_CRT_USER_ID)==0) ? true : false) ;
            Z453TBT02_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z453TBT02_UPD_DATETIME"), 0) ;
            n453TBT02_UPD_DATETIME = (GXutil.nullDate().equals(A453TBT02_UPD_DATETIME) ? true : false) ;
            Z454TBT02_UPD_USER_ID = httpContext.cgiGet( "Z454TBT02_UPD_USER_ID") ;
            n454TBT02_UPD_USER_ID = ((GXutil.strcmp("", A454TBT02_UPD_USER_ID)==0) ? true : false) ;
            Z456TBT02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z456TBT02_UPD_CNT"), ".", ",") ;
            n456TBT02_UPD_CNT = ((0==A456TBT02_UPD_CNT) ? true : false) ;
            Z498TBT02_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z498TBT02_CRF_LATEST_VERSION"), ".", ",")) ;
            n498TBT02_CRF_LATEST_VERSION = ((0==A498TBT02_CRF_LATEST_VERSION) ? true : false) ;
            Z499TBT02_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z499TBT02_CRF_INPUT_LEVEL"), ".", ",")) ;
            n499TBT02_CRF_INPUT_LEVEL = ((0==A499TBT02_CRF_INPUT_LEVEL) ? true : false) ;
            Z648TBT02_LOCK_FLG = httpContext.cgiGet( "Z648TBT02_LOCK_FLG") ;
            n648TBT02_LOCK_FLG = ((GXutil.strcmp("", A648TBT02_LOCK_FLG)==0) ? true : false) ;
            Z649TBT02_LOCK_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z649TBT02_LOCK_DATETIME"), 0) ;
            n649TBT02_LOCK_DATETIME = (GXutil.nullDate().equals(A649TBT02_LOCK_DATETIME) ? true : false) ;
            Z650TBT02_LOCK_USER_ID = httpContext.cgiGet( "Z650TBT02_LOCK_USER_ID") ;
            n650TBT02_LOCK_USER_ID = ((GXutil.strcmp("", A650TBT02_LOCK_USER_ID)==0) ? true : false) ;
            Z651TBT02_LOCK_AUTH_CD = httpContext.cgiGet( "Z651TBT02_LOCK_AUTH_CD") ;
            n651TBT02_LOCK_AUTH_CD = ((GXutil.strcmp("", A651TBT02_LOCK_AUTH_CD)==0) ? true : false) ;
            Z652TBT02_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z652TBT02_UPLOAD_DATETIME"), 0) ;
            n652TBT02_UPLOAD_DATETIME = (GXutil.nullDate().equals(A652TBT02_UPLOAD_DATETIME) ? true : false) ;
            Z653TBT02_UPLOAD_USER_ID = httpContext.cgiGet( "Z653TBT02_UPLOAD_USER_ID") ;
            n653TBT02_UPLOAD_USER_ID = ((GXutil.strcmp("", A653TBT02_UPLOAD_USER_ID)==0) ? true : false) ;
            Z654TBT02_UPLOAD_AUTH_CD = httpContext.cgiGet( "Z654TBT02_UPLOAD_AUTH_CD") ;
            n654TBT02_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A654TBT02_UPLOAD_AUTH_CD)==0) ? true : false) ;
            Z655TBT02_DM_ARRIVAL_FLG = httpContext.cgiGet( "Z655TBT02_DM_ARRIVAL_FLG") ;
            n655TBT02_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A655TBT02_DM_ARRIVAL_FLG)==0) ? true : false) ;
            Z656TBT02_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z656TBT02_DM_ARRIVAL_DATETIME"), 0) ;
            n656TBT02_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A656TBT02_DM_ARRIVAL_DATETIME) ? true : false) ;
            Z657TBT02_APPROVAL_FLG = httpContext.cgiGet( "Z657TBT02_APPROVAL_FLG") ;
            n657TBT02_APPROVAL_FLG = ((GXutil.strcmp("", A657TBT02_APPROVAL_FLG)==0) ? true : false) ;
            Z658TBT02_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z658TBT02_APPROVAL_DATETIME"), 0) ;
            n658TBT02_APPROVAL_DATETIME = (GXutil.nullDate().equals(A658TBT02_APPROVAL_DATETIME) ? true : false) ;
            Z659TBT02_APPROVAL_USER_ID = httpContext.cgiGet( "Z659TBT02_APPROVAL_USER_ID") ;
            n659TBT02_APPROVAL_USER_ID = ((GXutil.strcmp("", A659TBT02_APPROVAL_USER_ID)==0) ? true : false) ;
            Z660TBT02_APPROVAL_AUTH_CD = httpContext.cgiGet( "Z660TBT02_APPROVAL_AUTH_CD") ;
            n660TBT02_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A660TBT02_APPROVAL_AUTH_CD)==0) ? true : false) ;
            Z990TBT02_SIGNATURE_FLG = httpContext.cgiGet( "Z990TBT02_SIGNATURE_FLG") ;
            n990TBT02_SIGNATURE_FLG = ((GXutil.strcmp("", A990TBT02_SIGNATURE_FLG)==0) ? true : false) ;
            Z991TBT02_SIGNATURE_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z991TBT02_SIGNATURE_DATETIME"), 0) ;
            n991TBT02_SIGNATURE_DATETIME = (GXutil.nullDate().equals(A991TBT02_SIGNATURE_DATETIME) ? true : false) ;
            Z992TBT02_SIGNATURE_USER_ID = httpContext.cgiGet( "Z992TBT02_SIGNATURE_USER_ID") ;
            n992TBT02_SIGNATURE_USER_ID = ((GXutil.strcmp("", A992TBT02_SIGNATURE_USER_ID)==0) ? true : false) ;
            Z661TBT02_INPUT_END_FLG = httpContext.cgiGet( "Z661TBT02_INPUT_END_FLG") ;
            n661TBT02_INPUT_END_FLG = ((GXutil.strcmp("", A661TBT02_INPUT_END_FLG)==0) ? true : false) ;
            Z662TBT02_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z662TBT02_INPUT_END_DATETIME"), 0) ;
            n662TBT02_INPUT_END_DATETIME = (GXutil.nullDate().equals(A662TBT02_INPUT_END_DATETIME) ? true : false) ;
            Z663TBT02_INPUT_END_USER_ID = httpContext.cgiGet( "Z663TBT02_INPUT_END_USER_ID") ;
            n663TBT02_INPUT_END_USER_ID = ((GXutil.strcmp("", A663TBT02_INPUT_END_USER_ID)==0) ? true : false) ;
            Z664TBT02_INPUT_END_AUTH_CD = httpContext.cgiGet( "Z664TBT02_INPUT_END_AUTH_CD") ;
            n664TBT02_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A664TBT02_INPUT_END_AUTH_CD)==0) ? true : false) ;
            Z449TBT02_DEL_FLG = httpContext.cgiGet( "Z449TBT02_DEL_FLG") ;
            n449TBT02_DEL_FLG = ((GXutil.strcmp("", A449TBT02_DEL_FLG)==0) ? true : false) ;
            Z452TBT02_CRT_PROG_NM = httpContext.cgiGet( "Z452TBT02_CRT_PROG_NM") ;
            n452TBT02_CRT_PROG_NM = ((GXutil.strcmp("", A452TBT02_CRT_PROG_NM)==0) ? true : false) ;
            Z455TBT02_UPD_PROG_NM = httpContext.cgiGet( "Z455TBT02_UPD_PROG_NM") ;
            n455TBT02_UPD_PROG_NM = ((GXutil.strcmp("", A455TBT02_UPD_PROG_NM)==0) ? true : false) ;
            O456TBT02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O456TBT02_UPD_CNT"), ".", ",") ;
            n456TBT02_UPD_CNT = ((0==A456TBT02_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV9Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A89TBT02_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
               A90TBT02_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
               A91TBT02_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
               A935TBT02_CRF_EDA_NO = (byte)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
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
                     /* Execute user event: e110P2 */
                     e110P2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120P2 */
                     e120P2 ();
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
         /* Execute user event: e120P2 */
         e120P2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0P55( ) ;
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
      disableAttributes0P55( ) ;
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

   public void resetCaption0P0( )
   {
   }

   public void e110P2( )
   {
      /* Start Routine */
      AV8W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_BC_FLG", AV8W_BC_FLG);
      if ( GXutil.strcmp(AV8W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e120P2( )
   {
      /* After Trn Routine */
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm0P55( int GX_JID )
   {
      if ( ( GX_JID == 14 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z450TBT02_CRT_DATETIME = T000P3_A450TBT02_CRT_DATETIME[0] ;
            Z451TBT02_CRT_USER_ID = T000P3_A451TBT02_CRT_USER_ID[0] ;
            Z453TBT02_UPD_DATETIME = T000P3_A453TBT02_UPD_DATETIME[0] ;
            Z454TBT02_UPD_USER_ID = T000P3_A454TBT02_UPD_USER_ID[0] ;
            Z456TBT02_UPD_CNT = T000P3_A456TBT02_UPD_CNT[0] ;
            Z498TBT02_CRF_LATEST_VERSION = T000P3_A498TBT02_CRF_LATEST_VERSION[0] ;
            Z499TBT02_CRF_INPUT_LEVEL = T000P3_A499TBT02_CRF_INPUT_LEVEL[0] ;
            Z648TBT02_LOCK_FLG = T000P3_A648TBT02_LOCK_FLG[0] ;
            Z649TBT02_LOCK_DATETIME = T000P3_A649TBT02_LOCK_DATETIME[0] ;
            Z650TBT02_LOCK_USER_ID = T000P3_A650TBT02_LOCK_USER_ID[0] ;
            Z651TBT02_LOCK_AUTH_CD = T000P3_A651TBT02_LOCK_AUTH_CD[0] ;
            Z652TBT02_UPLOAD_DATETIME = T000P3_A652TBT02_UPLOAD_DATETIME[0] ;
            Z653TBT02_UPLOAD_USER_ID = T000P3_A653TBT02_UPLOAD_USER_ID[0] ;
            Z654TBT02_UPLOAD_AUTH_CD = T000P3_A654TBT02_UPLOAD_AUTH_CD[0] ;
            Z655TBT02_DM_ARRIVAL_FLG = T000P3_A655TBT02_DM_ARRIVAL_FLG[0] ;
            Z656TBT02_DM_ARRIVAL_DATETIME = T000P3_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
            Z657TBT02_APPROVAL_FLG = T000P3_A657TBT02_APPROVAL_FLG[0] ;
            Z658TBT02_APPROVAL_DATETIME = T000P3_A658TBT02_APPROVAL_DATETIME[0] ;
            Z659TBT02_APPROVAL_USER_ID = T000P3_A659TBT02_APPROVAL_USER_ID[0] ;
            Z660TBT02_APPROVAL_AUTH_CD = T000P3_A660TBT02_APPROVAL_AUTH_CD[0] ;
            Z990TBT02_SIGNATURE_FLG = T000P3_A990TBT02_SIGNATURE_FLG[0] ;
            Z991TBT02_SIGNATURE_DATETIME = T000P3_A991TBT02_SIGNATURE_DATETIME[0] ;
            Z992TBT02_SIGNATURE_USER_ID = T000P3_A992TBT02_SIGNATURE_USER_ID[0] ;
            Z661TBT02_INPUT_END_FLG = T000P3_A661TBT02_INPUT_END_FLG[0] ;
            Z662TBT02_INPUT_END_DATETIME = T000P3_A662TBT02_INPUT_END_DATETIME[0] ;
            Z663TBT02_INPUT_END_USER_ID = T000P3_A663TBT02_INPUT_END_USER_ID[0] ;
            Z664TBT02_INPUT_END_AUTH_CD = T000P3_A664TBT02_INPUT_END_AUTH_CD[0] ;
            Z449TBT02_DEL_FLG = T000P3_A449TBT02_DEL_FLG[0] ;
            Z452TBT02_CRT_PROG_NM = T000P3_A452TBT02_CRT_PROG_NM[0] ;
            Z455TBT02_UPD_PROG_NM = T000P3_A455TBT02_UPD_PROG_NM[0] ;
         }
         else
         {
            Z450TBT02_CRT_DATETIME = A450TBT02_CRT_DATETIME ;
            Z451TBT02_CRT_USER_ID = A451TBT02_CRT_USER_ID ;
            Z453TBT02_UPD_DATETIME = A453TBT02_UPD_DATETIME ;
            Z454TBT02_UPD_USER_ID = A454TBT02_UPD_USER_ID ;
            Z456TBT02_UPD_CNT = A456TBT02_UPD_CNT ;
            Z498TBT02_CRF_LATEST_VERSION = A498TBT02_CRF_LATEST_VERSION ;
            Z499TBT02_CRF_INPUT_LEVEL = A499TBT02_CRF_INPUT_LEVEL ;
            Z648TBT02_LOCK_FLG = A648TBT02_LOCK_FLG ;
            Z649TBT02_LOCK_DATETIME = A649TBT02_LOCK_DATETIME ;
            Z650TBT02_LOCK_USER_ID = A650TBT02_LOCK_USER_ID ;
            Z651TBT02_LOCK_AUTH_CD = A651TBT02_LOCK_AUTH_CD ;
            Z652TBT02_UPLOAD_DATETIME = A652TBT02_UPLOAD_DATETIME ;
            Z653TBT02_UPLOAD_USER_ID = A653TBT02_UPLOAD_USER_ID ;
            Z654TBT02_UPLOAD_AUTH_CD = A654TBT02_UPLOAD_AUTH_CD ;
            Z655TBT02_DM_ARRIVAL_FLG = A655TBT02_DM_ARRIVAL_FLG ;
            Z656TBT02_DM_ARRIVAL_DATETIME = A656TBT02_DM_ARRIVAL_DATETIME ;
            Z657TBT02_APPROVAL_FLG = A657TBT02_APPROVAL_FLG ;
            Z658TBT02_APPROVAL_DATETIME = A658TBT02_APPROVAL_DATETIME ;
            Z659TBT02_APPROVAL_USER_ID = A659TBT02_APPROVAL_USER_ID ;
            Z660TBT02_APPROVAL_AUTH_CD = A660TBT02_APPROVAL_AUTH_CD ;
            Z990TBT02_SIGNATURE_FLG = A990TBT02_SIGNATURE_FLG ;
            Z991TBT02_SIGNATURE_DATETIME = A991TBT02_SIGNATURE_DATETIME ;
            Z992TBT02_SIGNATURE_USER_ID = A992TBT02_SIGNATURE_USER_ID ;
            Z661TBT02_INPUT_END_FLG = A661TBT02_INPUT_END_FLG ;
            Z662TBT02_INPUT_END_DATETIME = A662TBT02_INPUT_END_DATETIME ;
            Z663TBT02_INPUT_END_USER_ID = A663TBT02_INPUT_END_USER_ID ;
            Z664TBT02_INPUT_END_AUTH_CD = A664TBT02_INPUT_END_AUTH_CD ;
            Z449TBT02_DEL_FLG = A449TBT02_DEL_FLG ;
            Z452TBT02_CRT_PROG_NM = A452TBT02_CRT_PROG_NM ;
            Z455TBT02_UPD_PROG_NM = A455TBT02_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -14 )
      {
         Z91TBT02_CRF_ID = A91TBT02_CRF_ID ;
         Z935TBT02_CRF_EDA_NO = A935TBT02_CRF_EDA_NO ;
         Z450TBT02_CRT_DATETIME = A450TBT02_CRT_DATETIME ;
         Z451TBT02_CRT_USER_ID = A451TBT02_CRT_USER_ID ;
         Z453TBT02_UPD_DATETIME = A453TBT02_UPD_DATETIME ;
         Z454TBT02_UPD_USER_ID = A454TBT02_UPD_USER_ID ;
         Z456TBT02_UPD_CNT = A456TBT02_UPD_CNT ;
         Z498TBT02_CRF_LATEST_VERSION = A498TBT02_CRF_LATEST_VERSION ;
         Z499TBT02_CRF_INPUT_LEVEL = A499TBT02_CRF_INPUT_LEVEL ;
         Z648TBT02_LOCK_FLG = A648TBT02_LOCK_FLG ;
         Z649TBT02_LOCK_DATETIME = A649TBT02_LOCK_DATETIME ;
         Z650TBT02_LOCK_USER_ID = A650TBT02_LOCK_USER_ID ;
         Z651TBT02_LOCK_AUTH_CD = A651TBT02_LOCK_AUTH_CD ;
         Z652TBT02_UPLOAD_DATETIME = A652TBT02_UPLOAD_DATETIME ;
         Z653TBT02_UPLOAD_USER_ID = A653TBT02_UPLOAD_USER_ID ;
         Z654TBT02_UPLOAD_AUTH_CD = A654TBT02_UPLOAD_AUTH_CD ;
         Z655TBT02_DM_ARRIVAL_FLG = A655TBT02_DM_ARRIVAL_FLG ;
         Z656TBT02_DM_ARRIVAL_DATETIME = A656TBT02_DM_ARRIVAL_DATETIME ;
         Z657TBT02_APPROVAL_FLG = A657TBT02_APPROVAL_FLG ;
         Z658TBT02_APPROVAL_DATETIME = A658TBT02_APPROVAL_DATETIME ;
         Z659TBT02_APPROVAL_USER_ID = A659TBT02_APPROVAL_USER_ID ;
         Z660TBT02_APPROVAL_AUTH_CD = A660TBT02_APPROVAL_AUTH_CD ;
         Z990TBT02_SIGNATURE_FLG = A990TBT02_SIGNATURE_FLG ;
         Z991TBT02_SIGNATURE_DATETIME = A991TBT02_SIGNATURE_DATETIME ;
         Z992TBT02_SIGNATURE_USER_ID = A992TBT02_SIGNATURE_USER_ID ;
         Z661TBT02_INPUT_END_FLG = A661TBT02_INPUT_END_FLG ;
         Z662TBT02_INPUT_END_DATETIME = A662TBT02_INPUT_END_DATETIME ;
         Z663TBT02_INPUT_END_USER_ID = A663TBT02_INPUT_END_USER_ID ;
         Z664TBT02_INPUT_END_AUTH_CD = A664TBT02_INPUT_END_AUTH_CD ;
         Z449TBT02_DEL_FLG = A449TBT02_DEL_FLG ;
         Z452TBT02_CRT_PROG_NM = A452TBT02_CRT_PROG_NM ;
         Z455TBT02_UPD_PROG_NM = A455TBT02_UPD_PROG_NM ;
         Z89TBT02_STUDY_ID = A89TBT02_STUDY_ID ;
         Z90TBT02_SUBJECT_ID = A90TBT02_SUBJECT_ID ;
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

   public void load0P55( )
   {
      /* Using cursor T000P5 */
      pr_default.execute(3, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound55 = (short)(1) ;
         A450TBT02_CRT_DATETIME = T000P5_A450TBT02_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A450TBT02_CRT_DATETIME", localUtil.ttoc( A450TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n450TBT02_CRT_DATETIME = T000P5_n450TBT02_CRT_DATETIME[0] ;
         A451TBT02_CRT_USER_ID = T000P5_A451TBT02_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A451TBT02_CRT_USER_ID", A451TBT02_CRT_USER_ID);
         n451TBT02_CRT_USER_ID = T000P5_n451TBT02_CRT_USER_ID[0] ;
         A453TBT02_UPD_DATETIME = T000P5_A453TBT02_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A453TBT02_UPD_DATETIME", localUtil.ttoc( A453TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n453TBT02_UPD_DATETIME = T000P5_n453TBT02_UPD_DATETIME[0] ;
         A454TBT02_UPD_USER_ID = T000P5_A454TBT02_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A454TBT02_UPD_USER_ID", A454TBT02_UPD_USER_ID);
         n454TBT02_UPD_USER_ID = T000P5_n454TBT02_UPD_USER_ID[0] ;
         A456TBT02_UPD_CNT = T000P5_A456TBT02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A456TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)));
         n456TBT02_UPD_CNT = T000P5_n456TBT02_UPD_CNT[0] ;
         A498TBT02_CRF_LATEST_VERSION = T000P5_A498TBT02_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A498TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A498TBT02_CRF_LATEST_VERSION, 4, 0)));
         n498TBT02_CRF_LATEST_VERSION = T000P5_n498TBT02_CRF_LATEST_VERSION[0] ;
         A499TBT02_CRF_INPUT_LEVEL = T000P5_A499TBT02_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A499TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A499TBT02_CRF_INPUT_LEVEL, 2, 0)));
         n499TBT02_CRF_INPUT_LEVEL = T000P5_n499TBT02_CRF_INPUT_LEVEL[0] ;
         A648TBT02_LOCK_FLG = T000P5_A648TBT02_LOCK_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A648TBT02_LOCK_FLG", A648TBT02_LOCK_FLG);
         n648TBT02_LOCK_FLG = T000P5_n648TBT02_LOCK_FLG[0] ;
         A649TBT02_LOCK_DATETIME = T000P5_A649TBT02_LOCK_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A649TBT02_LOCK_DATETIME", localUtil.ttoc( A649TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n649TBT02_LOCK_DATETIME = T000P5_n649TBT02_LOCK_DATETIME[0] ;
         A650TBT02_LOCK_USER_ID = T000P5_A650TBT02_LOCK_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A650TBT02_LOCK_USER_ID", A650TBT02_LOCK_USER_ID);
         n650TBT02_LOCK_USER_ID = T000P5_n650TBT02_LOCK_USER_ID[0] ;
         A651TBT02_LOCK_AUTH_CD = T000P5_A651TBT02_LOCK_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A651TBT02_LOCK_AUTH_CD", A651TBT02_LOCK_AUTH_CD);
         n651TBT02_LOCK_AUTH_CD = T000P5_n651TBT02_LOCK_AUTH_CD[0] ;
         A652TBT02_UPLOAD_DATETIME = T000P5_A652TBT02_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652TBT02_UPLOAD_DATETIME", localUtil.ttoc( A652TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n652TBT02_UPLOAD_DATETIME = T000P5_n652TBT02_UPLOAD_DATETIME[0] ;
         A653TBT02_UPLOAD_USER_ID = T000P5_A653TBT02_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653TBT02_UPLOAD_USER_ID", A653TBT02_UPLOAD_USER_ID);
         n653TBT02_UPLOAD_USER_ID = T000P5_n653TBT02_UPLOAD_USER_ID[0] ;
         A654TBT02_UPLOAD_AUTH_CD = T000P5_A654TBT02_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654TBT02_UPLOAD_AUTH_CD", A654TBT02_UPLOAD_AUTH_CD);
         n654TBT02_UPLOAD_AUTH_CD = T000P5_n654TBT02_UPLOAD_AUTH_CD[0] ;
         A655TBT02_DM_ARRIVAL_FLG = T000P5_A655TBT02_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A655TBT02_DM_ARRIVAL_FLG", A655TBT02_DM_ARRIVAL_FLG);
         n655TBT02_DM_ARRIVAL_FLG = T000P5_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = T000P5_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A656TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n656TBT02_DM_ARRIVAL_DATETIME = T000P5_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A657TBT02_APPROVAL_FLG = T000P5_A657TBT02_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657TBT02_APPROVAL_FLG", A657TBT02_APPROVAL_FLG);
         n657TBT02_APPROVAL_FLG = T000P5_n657TBT02_APPROVAL_FLG[0] ;
         A658TBT02_APPROVAL_DATETIME = T000P5_A658TBT02_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658TBT02_APPROVAL_DATETIME", localUtil.ttoc( A658TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n658TBT02_APPROVAL_DATETIME = T000P5_n658TBT02_APPROVAL_DATETIME[0] ;
         A659TBT02_APPROVAL_USER_ID = T000P5_A659TBT02_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A659TBT02_APPROVAL_USER_ID", A659TBT02_APPROVAL_USER_ID);
         n659TBT02_APPROVAL_USER_ID = T000P5_n659TBT02_APPROVAL_USER_ID[0] ;
         A660TBT02_APPROVAL_AUTH_CD = T000P5_A660TBT02_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A660TBT02_APPROVAL_AUTH_CD", A660TBT02_APPROVAL_AUTH_CD);
         n660TBT02_APPROVAL_AUTH_CD = T000P5_n660TBT02_APPROVAL_AUTH_CD[0] ;
         A990TBT02_SIGNATURE_FLG = T000P5_A990TBT02_SIGNATURE_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A990TBT02_SIGNATURE_FLG", A990TBT02_SIGNATURE_FLG);
         n990TBT02_SIGNATURE_FLG = T000P5_n990TBT02_SIGNATURE_FLG[0] ;
         A991TBT02_SIGNATURE_DATETIME = T000P5_A991TBT02_SIGNATURE_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A991TBT02_SIGNATURE_DATETIME", localUtil.ttoc( A991TBT02_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n991TBT02_SIGNATURE_DATETIME = T000P5_n991TBT02_SIGNATURE_DATETIME[0] ;
         A992TBT02_SIGNATURE_USER_ID = T000P5_A992TBT02_SIGNATURE_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A992TBT02_SIGNATURE_USER_ID", A992TBT02_SIGNATURE_USER_ID);
         n992TBT02_SIGNATURE_USER_ID = T000P5_n992TBT02_SIGNATURE_USER_ID[0] ;
         A661TBT02_INPUT_END_FLG = T000P5_A661TBT02_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661TBT02_INPUT_END_FLG", A661TBT02_INPUT_END_FLG);
         n661TBT02_INPUT_END_FLG = T000P5_n661TBT02_INPUT_END_FLG[0] ;
         A662TBT02_INPUT_END_DATETIME = T000P5_A662TBT02_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A662TBT02_INPUT_END_DATETIME", localUtil.ttoc( A662TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n662TBT02_INPUT_END_DATETIME = T000P5_n662TBT02_INPUT_END_DATETIME[0] ;
         A663TBT02_INPUT_END_USER_ID = T000P5_A663TBT02_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A663TBT02_INPUT_END_USER_ID", A663TBT02_INPUT_END_USER_ID);
         n663TBT02_INPUT_END_USER_ID = T000P5_n663TBT02_INPUT_END_USER_ID[0] ;
         A664TBT02_INPUT_END_AUTH_CD = T000P5_A664TBT02_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A664TBT02_INPUT_END_AUTH_CD", A664TBT02_INPUT_END_AUTH_CD);
         n664TBT02_INPUT_END_AUTH_CD = T000P5_n664TBT02_INPUT_END_AUTH_CD[0] ;
         A449TBT02_DEL_FLG = T000P5_A449TBT02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A449TBT02_DEL_FLG", A449TBT02_DEL_FLG);
         n449TBT02_DEL_FLG = T000P5_n449TBT02_DEL_FLG[0] ;
         A452TBT02_CRT_PROG_NM = T000P5_A452TBT02_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A452TBT02_CRT_PROG_NM", A452TBT02_CRT_PROG_NM);
         n452TBT02_CRT_PROG_NM = T000P5_n452TBT02_CRT_PROG_NM[0] ;
         A455TBT02_UPD_PROG_NM = T000P5_A455TBT02_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A455TBT02_UPD_PROG_NM", A455TBT02_UPD_PROG_NM);
         n455TBT02_UPD_PROG_NM = T000P5_n455TBT02_UPD_PROG_NM[0] ;
         zm0P55( -14) ;
      }
      pr_default.close(3);
      onLoadActions0P55( ) ;
   }

   public void onLoadActions0P55( )
   {
      AV9Pgmname = "TBT02_CRF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0P55( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBT02_CRF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000P4 */
      pr_default.execute(2, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A649TBT02_LOCK_DATETIME) || (( A649TBT02_LOCK_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A649TBT02_LOCK_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　ロック日時 は範囲外です", "OutOfRange", 1, "TBT02_LOCK_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_LOCK_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A652TBT02_UPLOAD_DATETIME) || (( A652TBT02_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A652TBT02_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "TBT02_UPLOAD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_UPLOAD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A656TBT02_DM_ARRIVAL_DATETIME) || (( A656TBT02_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A656TBT02_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "TBT02_DM_ARRIVAL_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_DM_ARRIVAL_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A658TBT02_APPROVAL_DATETIME) || (( A658TBT02_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A658TBT02_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "TBT02_APPROVAL_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_APPROVAL_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A991TBT02_SIGNATURE_DATETIME) || (( A991TBT02_SIGNATURE_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A991TBT02_SIGNATURE_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　署名日時 は範囲外です", "OutOfRange", 1, "TBT02_SIGNATURE_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_SIGNATURE_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A662TBT02_INPUT_END_DATETIME) || (( A662TBT02_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A662TBT02_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "TBT02_INPUT_END_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_INPUT_END_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A450TBT02_CRT_DATETIME) || (( A450TBT02_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A450TBT02_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBT02_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A453TBT02_UPD_DATETIME) || (( A453TBT02_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A453TBT02_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBT02_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0P55( )
   {
   }

   public void enableDisable( )
   {
   }

   public void gxload_15( long A89TBT02_STUDY_ID ,
                          int A90TBT02_SUBJECT_ID )
   {
      /* Using cursor T000P4 */
      pr_default.execute(2, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(2);
   }

   public void getKey0P55( )
   {
      /* Using cursor T000P6 */
      pr_default.execute(4, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound55 = (short)(1) ;
      }
      else
      {
         RcdFound55 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000P3 */
      pr_default.execute(1, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0P55( 14) ;
         RcdFound55 = (short)(1) ;
         A91TBT02_CRF_ID = T000P3_A91TBT02_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
         A935TBT02_CRF_EDA_NO = T000P3_A935TBT02_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
         A450TBT02_CRT_DATETIME = T000P3_A450TBT02_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A450TBT02_CRT_DATETIME", localUtil.ttoc( A450TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n450TBT02_CRT_DATETIME = T000P3_n450TBT02_CRT_DATETIME[0] ;
         A451TBT02_CRT_USER_ID = T000P3_A451TBT02_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A451TBT02_CRT_USER_ID", A451TBT02_CRT_USER_ID);
         n451TBT02_CRT_USER_ID = T000P3_n451TBT02_CRT_USER_ID[0] ;
         A453TBT02_UPD_DATETIME = T000P3_A453TBT02_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A453TBT02_UPD_DATETIME", localUtil.ttoc( A453TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n453TBT02_UPD_DATETIME = T000P3_n453TBT02_UPD_DATETIME[0] ;
         A454TBT02_UPD_USER_ID = T000P3_A454TBT02_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A454TBT02_UPD_USER_ID", A454TBT02_UPD_USER_ID);
         n454TBT02_UPD_USER_ID = T000P3_n454TBT02_UPD_USER_ID[0] ;
         A456TBT02_UPD_CNT = T000P3_A456TBT02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A456TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)));
         n456TBT02_UPD_CNT = T000P3_n456TBT02_UPD_CNT[0] ;
         A498TBT02_CRF_LATEST_VERSION = T000P3_A498TBT02_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A498TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A498TBT02_CRF_LATEST_VERSION, 4, 0)));
         n498TBT02_CRF_LATEST_VERSION = T000P3_n498TBT02_CRF_LATEST_VERSION[0] ;
         A499TBT02_CRF_INPUT_LEVEL = T000P3_A499TBT02_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A499TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A499TBT02_CRF_INPUT_LEVEL, 2, 0)));
         n499TBT02_CRF_INPUT_LEVEL = T000P3_n499TBT02_CRF_INPUT_LEVEL[0] ;
         A648TBT02_LOCK_FLG = T000P3_A648TBT02_LOCK_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A648TBT02_LOCK_FLG", A648TBT02_LOCK_FLG);
         n648TBT02_LOCK_FLG = T000P3_n648TBT02_LOCK_FLG[0] ;
         A649TBT02_LOCK_DATETIME = T000P3_A649TBT02_LOCK_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A649TBT02_LOCK_DATETIME", localUtil.ttoc( A649TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n649TBT02_LOCK_DATETIME = T000P3_n649TBT02_LOCK_DATETIME[0] ;
         A650TBT02_LOCK_USER_ID = T000P3_A650TBT02_LOCK_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A650TBT02_LOCK_USER_ID", A650TBT02_LOCK_USER_ID);
         n650TBT02_LOCK_USER_ID = T000P3_n650TBT02_LOCK_USER_ID[0] ;
         A651TBT02_LOCK_AUTH_CD = T000P3_A651TBT02_LOCK_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A651TBT02_LOCK_AUTH_CD", A651TBT02_LOCK_AUTH_CD);
         n651TBT02_LOCK_AUTH_CD = T000P3_n651TBT02_LOCK_AUTH_CD[0] ;
         A652TBT02_UPLOAD_DATETIME = T000P3_A652TBT02_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A652TBT02_UPLOAD_DATETIME", localUtil.ttoc( A652TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n652TBT02_UPLOAD_DATETIME = T000P3_n652TBT02_UPLOAD_DATETIME[0] ;
         A653TBT02_UPLOAD_USER_ID = T000P3_A653TBT02_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A653TBT02_UPLOAD_USER_ID", A653TBT02_UPLOAD_USER_ID);
         n653TBT02_UPLOAD_USER_ID = T000P3_n653TBT02_UPLOAD_USER_ID[0] ;
         A654TBT02_UPLOAD_AUTH_CD = T000P3_A654TBT02_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A654TBT02_UPLOAD_AUTH_CD", A654TBT02_UPLOAD_AUTH_CD);
         n654TBT02_UPLOAD_AUTH_CD = T000P3_n654TBT02_UPLOAD_AUTH_CD[0] ;
         A655TBT02_DM_ARRIVAL_FLG = T000P3_A655TBT02_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A655TBT02_DM_ARRIVAL_FLG", A655TBT02_DM_ARRIVAL_FLG);
         n655TBT02_DM_ARRIVAL_FLG = T000P3_n655TBT02_DM_ARRIVAL_FLG[0] ;
         A656TBT02_DM_ARRIVAL_DATETIME = T000P3_A656TBT02_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A656TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A656TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n656TBT02_DM_ARRIVAL_DATETIME = T000P3_n656TBT02_DM_ARRIVAL_DATETIME[0] ;
         A657TBT02_APPROVAL_FLG = T000P3_A657TBT02_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A657TBT02_APPROVAL_FLG", A657TBT02_APPROVAL_FLG);
         n657TBT02_APPROVAL_FLG = T000P3_n657TBT02_APPROVAL_FLG[0] ;
         A658TBT02_APPROVAL_DATETIME = T000P3_A658TBT02_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A658TBT02_APPROVAL_DATETIME", localUtil.ttoc( A658TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n658TBT02_APPROVAL_DATETIME = T000P3_n658TBT02_APPROVAL_DATETIME[0] ;
         A659TBT02_APPROVAL_USER_ID = T000P3_A659TBT02_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A659TBT02_APPROVAL_USER_ID", A659TBT02_APPROVAL_USER_ID);
         n659TBT02_APPROVAL_USER_ID = T000P3_n659TBT02_APPROVAL_USER_ID[0] ;
         A660TBT02_APPROVAL_AUTH_CD = T000P3_A660TBT02_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A660TBT02_APPROVAL_AUTH_CD", A660TBT02_APPROVAL_AUTH_CD);
         n660TBT02_APPROVAL_AUTH_CD = T000P3_n660TBT02_APPROVAL_AUTH_CD[0] ;
         A990TBT02_SIGNATURE_FLG = T000P3_A990TBT02_SIGNATURE_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A990TBT02_SIGNATURE_FLG", A990TBT02_SIGNATURE_FLG);
         n990TBT02_SIGNATURE_FLG = T000P3_n990TBT02_SIGNATURE_FLG[0] ;
         A991TBT02_SIGNATURE_DATETIME = T000P3_A991TBT02_SIGNATURE_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A991TBT02_SIGNATURE_DATETIME", localUtil.ttoc( A991TBT02_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n991TBT02_SIGNATURE_DATETIME = T000P3_n991TBT02_SIGNATURE_DATETIME[0] ;
         A992TBT02_SIGNATURE_USER_ID = T000P3_A992TBT02_SIGNATURE_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A992TBT02_SIGNATURE_USER_ID", A992TBT02_SIGNATURE_USER_ID);
         n992TBT02_SIGNATURE_USER_ID = T000P3_n992TBT02_SIGNATURE_USER_ID[0] ;
         A661TBT02_INPUT_END_FLG = T000P3_A661TBT02_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A661TBT02_INPUT_END_FLG", A661TBT02_INPUT_END_FLG);
         n661TBT02_INPUT_END_FLG = T000P3_n661TBT02_INPUT_END_FLG[0] ;
         A662TBT02_INPUT_END_DATETIME = T000P3_A662TBT02_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A662TBT02_INPUT_END_DATETIME", localUtil.ttoc( A662TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n662TBT02_INPUT_END_DATETIME = T000P3_n662TBT02_INPUT_END_DATETIME[0] ;
         A663TBT02_INPUT_END_USER_ID = T000P3_A663TBT02_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A663TBT02_INPUT_END_USER_ID", A663TBT02_INPUT_END_USER_ID);
         n663TBT02_INPUT_END_USER_ID = T000P3_n663TBT02_INPUT_END_USER_ID[0] ;
         A664TBT02_INPUT_END_AUTH_CD = T000P3_A664TBT02_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A664TBT02_INPUT_END_AUTH_CD", A664TBT02_INPUT_END_AUTH_CD);
         n664TBT02_INPUT_END_AUTH_CD = T000P3_n664TBT02_INPUT_END_AUTH_CD[0] ;
         A449TBT02_DEL_FLG = T000P3_A449TBT02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A449TBT02_DEL_FLG", A449TBT02_DEL_FLG);
         n449TBT02_DEL_FLG = T000P3_n449TBT02_DEL_FLG[0] ;
         A452TBT02_CRT_PROG_NM = T000P3_A452TBT02_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A452TBT02_CRT_PROG_NM", A452TBT02_CRT_PROG_NM);
         n452TBT02_CRT_PROG_NM = T000P3_n452TBT02_CRT_PROG_NM[0] ;
         A455TBT02_UPD_PROG_NM = T000P3_A455TBT02_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A455TBT02_UPD_PROG_NM", A455TBT02_UPD_PROG_NM);
         n455TBT02_UPD_PROG_NM = T000P3_n455TBT02_UPD_PROG_NM[0] ;
         A89TBT02_STUDY_ID = T000P3_A89TBT02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
         A90TBT02_SUBJECT_ID = T000P3_A90TBT02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
         O456TBT02_UPD_CNT = A456TBT02_UPD_CNT ;
         n456TBT02_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A456TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)));
         Z89TBT02_STUDY_ID = A89TBT02_STUDY_ID ;
         Z90TBT02_SUBJECT_ID = A90TBT02_SUBJECT_ID ;
         Z91TBT02_CRF_ID = A91TBT02_CRF_ID ;
         Z935TBT02_CRF_EDA_NO = A935TBT02_CRF_EDA_NO ;
         sMode55 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0P55( ) ;
         if ( AnyError == 1 )
         {
            RcdFound55 = (short)(0) ;
            initializeNonKey0P55( ) ;
         }
         Gx_mode = sMode55 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound55 = (short)(0) ;
         initializeNonKey0P55( ) ;
         sMode55 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode55 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0P55( ) ;
      if ( RcdFound55 == 0 )
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
      RcdFound55 = (short)(0) ;
      /* Using cursor T000P7 */
      pr_default.execute(5, new Object[] {new Long(A89TBT02_STUDY_ID), new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Integer(A90TBT02_SUBJECT_ID), new Long(A89TBT02_STUDY_ID), new Short(A91TBT02_CRF_ID), new Short(A91TBT02_CRF_ID), new Integer(A90TBT02_SUBJECT_ID), new Long(A89TBT02_STUDY_ID), new Byte(A935TBT02_CRF_EDA_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000P7_A89TBT02_STUDY_ID[0] < A89TBT02_STUDY_ID ) || ( T000P7_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P7_A90TBT02_SUBJECT_ID[0] < A90TBT02_SUBJECT_ID ) || ( T000P7_A90TBT02_SUBJECT_ID[0] == A90TBT02_SUBJECT_ID ) && ( T000P7_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P7_A91TBT02_CRF_ID[0] < A91TBT02_CRF_ID ) || ( T000P7_A91TBT02_CRF_ID[0] == A91TBT02_CRF_ID ) && ( T000P7_A90TBT02_SUBJECT_ID[0] == A90TBT02_SUBJECT_ID ) && ( T000P7_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P7_A935TBT02_CRF_EDA_NO[0] < A935TBT02_CRF_EDA_NO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000P7_A89TBT02_STUDY_ID[0] > A89TBT02_STUDY_ID ) || ( T000P7_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P7_A90TBT02_SUBJECT_ID[0] > A90TBT02_SUBJECT_ID ) || ( T000P7_A90TBT02_SUBJECT_ID[0] == A90TBT02_SUBJECT_ID ) && ( T000P7_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P7_A91TBT02_CRF_ID[0] > A91TBT02_CRF_ID ) || ( T000P7_A91TBT02_CRF_ID[0] == A91TBT02_CRF_ID ) && ( T000P7_A90TBT02_SUBJECT_ID[0] == A90TBT02_SUBJECT_ID ) && ( T000P7_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P7_A935TBT02_CRF_EDA_NO[0] > A935TBT02_CRF_EDA_NO ) ) )
         {
            A89TBT02_STUDY_ID = T000P7_A89TBT02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
            A90TBT02_SUBJECT_ID = T000P7_A90TBT02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
            A91TBT02_CRF_ID = T000P7_A91TBT02_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
            A935TBT02_CRF_EDA_NO = T000P7_A935TBT02_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
            RcdFound55 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound55 = (short)(0) ;
      /* Using cursor T000P8 */
      pr_default.execute(6, new Object[] {new Long(A89TBT02_STUDY_ID), new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Integer(A90TBT02_SUBJECT_ID), new Long(A89TBT02_STUDY_ID), new Short(A91TBT02_CRF_ID), new Short(A91TBT02_CRF_ID), new Integer(A90TBT02_SUBJECT_ID), new Long(A89TBT02_STUDY_ID), new Byte(A935TBT02_CRF_EDA_NO)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000P8_A89TBT02_STUDY_ID[0] > A89TBT02_STUDY_ID ) || ( T000P8_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P8_A90TBT02_SUBJECT_ID[0] > A90TBT02_SUBJECT_ID ) || ( T000P8_A90TBT02_SUBJECT_ID[0] == A90TBT02_SUBJECT_ID ) && ( T000P8_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P8_A91TBT02_CRF_ID[0] > A91TBT02_CRF_ID ) || ( T000P8_A91TBT02_CRF_ID[0] == A91TBT02_CRF_ID ) && ( T000P8_A90TBT02_SUBJECT_ID[0] == A90TBT02_SUBJECT_ID ) && ( T000P8_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P8_A935TBT02_CRF_EDA_NO[0] > A935TBT02_CRF_EDA_NO ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000P8_A89TBT02_STUDY_ID[0] < A89TBT02_STUDY_ID ) || ( T000P8_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P8_A90TBT02_SUBJECT_ID[0] < A90TBT02_SUBJECT_ID ) || ( T000P8_A90TBT02_SUBJECT_ID[0] == A90TBT02_SUBJECT_ID ) && ( T000P8_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P8_A91TBT02_CRF_ID[0] < A91TBT02_CRF_ID ) || ( T000P8_A91TBT02_CRF_ID[0] == A91TBT02_CRF_ID ) && ( T000P8_A90TBT02_SUBJECT_ID[0] == A90TBT02_SUBJECT_ID ) && ( T000P8_A89TBT02_STUDY_ID[0] == A89TBT02_STUDY_ID ) && ( T000P8_A935TBT02_CRF_EDA_NO[0] < A935TBT02_CRF_EDA_NO ) ) )
         {
            A89TBT02_STUDY_ID = T000P8_A89TBT02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
            A90TBT02_SUBJECT_ID = T000P8_A90TBT02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
            A91TBT02_CRF_ID = T000P8_A91TBT02_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
            A935TBT02_CRF_EDA_NO = T000P8_A935TBT02_CRF_EDA_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
            RcdFound55 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0P55( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0P55( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound55 == 1 )
         {
            if ( ( A89TBT02_STUDY_ID != Z89TBT02_STUDY_ID ) || ( A90TBT02_SUBJECT_ID != Z90TBT02_SUBJECT_ID ) || ( A91TBT02_CRF_ID != Z91TBT02_CRF_ID ) || ( A935TBT02_CRF_EDA_NO != Z935TBT02_CRF_EDA_NO ) )
            {
               A89TBT02_STUDY_ID = Z89TBT02_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
               A90TBT02_SUBJECT_ID = Z90TBT02_SUBJECT_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
               A91TBT02_CRF_ID = Z91TBT02_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
               A935TBT02_CRF_EDA_NO = Z935TBT02_CRF_EDA_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBT02_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0P55( ) ;
               GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A89TBT02_STUDY_ID != Z89TBT02_STUDY_ID ) || ( A90TBT02_SUBJECT_ID != Z90TBT02_SUBJECT_ID ) || ( A91TBT02_CRF_ID != Z91TBT02_CRF_ID ) || ( A935TBT02_CRF_EDA_NO != Z935TBT02_CRF_EDA_NO ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0P55( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBT02_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0P55( ) ;
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
      if ( ( A89TBT02_STUDY_ID != Z89TBT02_STUDY_ID ) || ( A90TBT02_SUBJECT_ID != Z90TBT02_SUBJECT_ID ) || ( A91TBT02_CRF_ID != Z91TBT02_CRF_ID ) || ( A935TBT02_CRF_EDA_NO != Z935TBT02_CRF_EDA_NO ) )
      {
         A89TBT02_STUDY_ID = Z89TBT02_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
         A90TBT02_SUBJECT_ID = Z90TBT02_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
         A91TBT02_CRF_ID = Z91TBT02_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
         A935TBT02_CRF_EDA_NO = Z935TBT02_CRF_EDA_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
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
      if ( RcdFound55 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBT02_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0P55( ) ;
      if ( RcdFound55 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT02_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0P55( ) ;
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
      if ( RcdFound55 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT02_CRF_LATEST_VERSION_Internalname ;
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
      if ( RcdFound55 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT02_CRF_LATEST_VERSION_Internalname ;
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
      scanStart0P55( ) ;
      if ( RcdFound55 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound55 != 0 )
         {
            scanNext0P55( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT02_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0P55( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0P55( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000P2 */
         pr_default.execute(0, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT02_CRF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z450TBT02_CRT_DATETIME.equals( T000P2_A450TBT02_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z451TBT02_CRT_USER_ID, T000P2_A451TBT02_CRT_USER_ID[0]) != 0 ) || !( Z453TBT02_UPD_DATETIME.equals( T000P2_A453TBT02_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z454TBT02_UPD_USER_ID, T000P2_A454TBT02_UPD_USER_ID[0]) != 0 ) || ( Z456TBT02_UPD_CNT != T000P2_A456TBT02_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z498TBT02_CRF_LATEST_VERSION != T000P2_A498TBT02_CRF_LATEST_VERSION[0] ) || ( Z499TBT02_CRF_INPUT_LEVEL != T000P2_A499TBT02_CRF_INPUT_LEVEL[0] ) || ( GXutil.strcmp(Z648TBT02_LOCK_FLG, T000P2_A648TBT02_LOCK_FLG[0]) != 0 ) || !( Z649TBT02_LOCK_DATETIME.equals( T000P2_A649TBT02_LOCK_DATETIME[0] ) ) || ( GXutil.strcmp(Z650TBT02_LOCK_USER_ID, T000P2_A650TBT02_LOCK_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z651TBT02_LOCK_AUTH_CD, T000P2_A651TBT02_LOCK_AUTH_CD[0]) != 0 ) || !( Z652TBT02_UPLOAD_DATETIME.equals( T000P2_A652TBT02_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z653TBT02_UPLOAD_USER_ID, T000P2_A653TBT02_UPLOAD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z654TBT02_UPLOAD_AUTH_CD, T000P2_A654TBT02_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z655TBT02_DM_ARRIVAL_FLG, T000P2_A655TBT02_DM_ARRIVAL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( Z656TBT02_DM_ARRIVAL_DATETIME.equals( T000P2_A656TBT02_DM_ARRIVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z657TBT02_APPROVAL_FLG, T000P2_A657TBT02_APPROVAL_FLG[0]) != 0 ) || !( Z658TBT02_APPROVAL_DATETIME.equals( T000P2_A658TBT02_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z659TBT02_APPROVAL_USER_ID, T000P2_A659TBT02_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z660TBT02_APPROVAL_AUTH_CD, T000P2_A660TBT02_APPROVAL_AUTH_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z990TBT02_SIGNATURE_FLG, T000P2_A990TBT02_SIGNATURE_FLG[0]) != 0 ) || !( Z991TBT02_SIGNATURE_DATETIME.equals( T000P2_A991TBT02_SIGNATURE_DATETIME[0] ) ) || ( GXutil.strcmp(Z992TBT02_SIGNATURE_USER_ID, T000P2_A992TBT02_SIGNATURE_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z661TBT02_INPUT_END_FLG, T000P2_A661TBT02_INPUT_END_FLG[0]) != 0 ) || !( Z662TBT02_INPUT_END_DATETIME.equals( T000P2_A662TBT02_INPUT_END_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z663TBT02_INPUT_END_USER_ID, T000P2_A663TBT02_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z664TBT02_INPUT_END_AUTH_CD, T000P2_A664TBT02_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z449TBT02_DEL_FLG, T000P2_A449TBT02_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z452TBT02_CRT_PROG_NM, T000P2_A452TBT02_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z455TBT02_UPD_PROG_NM, T000P2_A455TBT02_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT02_CRF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0P55( )
   {
      beforeValidate0P55( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P55( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0P55( 0) ;
         checkOptimisticConcurrency0P55( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P55( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0P55( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P9 */
                  pr_default.execute(7, new Object[] {new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO), new Boolean(n450TBT02_CRT_DATETIME), A450TBT02_CRT_DATETIME, new Boolean(n451TBT02_CRT_USER_ID), A451TBT02_CRT_USER_ID, new Boolean(n453TBT02_UPD_DATETIME), A453TBT02_UPD_DATETIME, new Boolean(n454TBT02_UPD_USER_ID), A454TBT02_UPD_USER_ID, new Boolean(n456TBT02_UPD_CNT), new Long(A456TBT02_UPD_CNT), new Boolean(n498TBT02_CRF_LATEST_VERSION), new Short(A498TBT02_CRF_LATEST_VERSION), new Boolean(n499TBT02_CRF_INPUT_LEVEL), new Byte(A499TBT02_CRF_INPUT_LEVEL), new Boolean(n648TBT02_LOCK_FLG), A648TBT02_LOCK_FLG, new Boolean(n649TBT02_LOCK_DATETIME), A649TBT02_LOCK_DATETIME, new Boolean(n650TBT02_LOCK_USER_ID), A650TBT02_LOCK_USER_ID, new Boolean(n651TBT02_LOCK_AUTH_CD), A651TBT02_LOCK_AUTH_CD, new Boolean(n652TBT02_UPLOAD_DATETIME), A652TBT02_UPLOAD_DATETIME, new Boolean(n653TBT02_UPLOAD_USER_ID), A653TBT02_UPLOAD_USER_ID, new Boolean(n654TBT02_UPLOAD_AUTH_CD), A654TBT02_UPLOAD_AUTH_CD, new Boolean(n655TBT02_DM_ARRIVAL_FLG), A655TBT02_DM_ARRIVAL_FLG, new Boolean(n656TBT02_DM_ARRIVAL_DATETIME), A656TBT02_DM_ARRIVAL_DATETIME, new Boolean(n657TBT02_APPROVAL_FLG), A657TBT02_APPROVAL_FLG, new Boolean(n658TBT02_APPROVAL_DATETIME), A658TBT02_APPROVAL_DATETIME, new Boolean(n659TBT02_APPROVAL_USER_ID), A659TBT02_APPROVAL_USER_ID, new Boolean(n660TBT02_APPROVAL_AUTH_CD), A660TBT02_APPROVAL_AUTH_CD, new Boolean(n990TBT02_SIGNATURE_FLG), A990TBT02_SIGNATURE_FLG, new Boolean(n991TBT02_SIGNATURE_DATETIME), A991TBT02_SIGNATURE_DATETIME, new Boolean(n992TBT02_SIGNATURE_USER_ID), A992TBT02_SIGNATURE_USER_ID, new Boolean(n661TBT02_INPUT_END_FLG), A661TBT02_INPUT_END_FLG, new Boolean(n662TBT02_INPUT_END_DATETIME), A662TBT02_INPUT_END_DATETIME, new Boolean(n663TBT02_INPUT_END_USER_ID), A663TBT02_INPUT_END_USER_ID, new Boolean(n664TBT02_INPUT_END_AUTH_CD), A664TBT02_INPUT_END_AUTH_CD, new Boolean(n449TBT02_DEL_FLG), A449TBT02_DEL_FLG, new Boolean(n452TBT02_CRT_PROG_NM), A452TBT02_CRT_PROG_NM, new Boolean(n455TBT02_UPD_PROG_NM), A455TBT02_UPD_PROG_NM, new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaption0P0( ) ;
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
            load0P55( ) ;
         }
         endLevel0P55( ) ;
      }
      closeExtendedTableCursors0P55( ) ;
   }

   public void update0P55( )
   {
      beforeValidate0P55( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P55( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P55( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P55( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0P55( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P10 */
                  pr_default.execute(8, new Object[] {new Boolean(n450TBT02_CRT_DATETIME), A450TBT02_CRT_DATETIME, new Boolean(n451TBT02_CRT_USER_ID), A451TBT02_CRT_USER_ID, new Boolean(n453TBT02_UPD_DATETIME), A453TBT02_UPD_DATETIME, new Boolean(n454TBT02_UPD_USER_ID), A454TBT02_UPD_USER_ID, new Boolean(n456TBT02_UPD_CNT), new Long(A456TBT02_UPD_CNT), new Boolean(n498TBT02_CRF_LATEST_VERSION), new Short(A498TBT02_CRF_LATEST_VERSION), new Boolean(n499TBT02_CRF_INPUT_LEVEL), new Byte(A499TBT02_CRF_INPUT_LEVEL), new Boolean(n648TBT02_LOCK_FLG), A648TBT02_LOCK_FLG, new Boolean(n649TBT02_LOCK_DATETIME), A649TBT02_LOCK_DATETIME, new Boolean(n650TBT02_LOCK_USER_ID), A650TBT02_LOCK_USER_ID, new Boolean(n651TBT02_LOCK_AUTH_CD), A651TBT02_LOCK_AUTH_CD, new Boolean(n652TBT02_UPLOAD_DATETIME), A652TBT02_UPLOAD_DATETIME, new Boolean(n653TBT02_UPLOAD_USER_ID), A653TBT02_UPLOAD_USER_ID, new Boolean(n654TBT02_UPLOAD_AUTH_CD), A654TBT02_UPLOAD_AUTH_CD, new Boolean(n655TBT02_DM_ARRIVAL_FLG), A655TBT02_DM_ARRIVAL_FLG, new Boolean(n656TBT02_DM_ARRIVAL_DATETIME), A656TBT02_DM_ARRIVAL_DATETIME, new Boolean(n657TBT02_APPROVAL_FLG), A657TBT02_APPROVAL_FLG, new Boolean(n658TBT02_APPROVAL_DATETIME), A658TBT02_APPROVAL_DATETIME, new Boolean(n659TBT02_APPROVAL_USER_ID), A659TBT02_APPROVAL_USER_ID, new Boolean(n660TBT02_APPROVAL_AUTH_CD), A660TBT02_APPROVAL_AUTH_CD, new Boolean(n990TBT02_SIGNATURE_FLG), A990TBT02_SIGNATURE_FLG, new Boolean(n991TBT02_SIGNATURE_DATETIME), A991TBT02_SIGNATURE_DATETIME, new Boolean(n992TBT02_SIGNATURE_USER_ID), A992TBT02_SIGNATURE_USER_ID, new Boolean(n661TBT02_INPUT_END_FLG), A661TBT02_INPUT_END_FLG, new Boolean(n662TBT02_INPUT_END_DATETIME), A662TBT02_INPUT_END_DATETIME, new Boolean(n663TBT02_INPUT_END_USER_ID), A663TBT02_INPUT_END_USER_ID, new Boolean(n664TBT02_INPUT_END_AUTH_CD), A664TBT02_INPUT_END_AUTH_CD, new Boolean(n449TBT02_DEL_FLG), A449TBT02_DEL_FLG, new Boolean(n452TBT02_CRT_PROG_NM), A452TBT02_CRT_PROG_NM, new Boolean(n455TBT02_UPD_PROG_NM), A455TBT02_UPD_PROG_NM, new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT02_CRF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0P55( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0P0( ) ;
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
         endLevel0P55( ) ;
      }
      closeExtendedTableCursors0P55( ) ;
   }

   public void deferredUpdate0P55( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0P55( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P55( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0P55( ) ;
         afterConfirm0P55( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0P55( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000P11 */
               pr_default.execute(9, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID), new Short(A91TBT02_CRF_ID), new Byte(A935TBT02_CRF_EDA_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT02_CRF") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound55 == 0 )
                     {
                        initAll0P55( ) ;
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
                     resetCaption0P0( ) ;
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
      sMode55 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0P55( ) ;
      Gx_mode = sMode55 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0P55( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT02_CRF" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0P55( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0P55( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbt02_crf");
         if ( AnyError == 0 )
         {
            confirmValues0P0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbt02_crf");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0P55( )
   {
      /* Scan By routine */
      /* Using cursor T000P12 */
      pr_default.execute(10);
      RcdFound55 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound55 = (short)(1) ;
         A89TBT02_STUDY_ID = T000P12_A89TBT02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
         A90TBT02_SUBJECT_ID = T000P12_A90TBT02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
         A91TBT02_CRF_ID = T000P12_A91TBT02_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
         A935TBT02_CRF_EDA_NO = T000P12_A935TBT02_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0P55( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound55 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound55 = (short)(1) ;
         A89TBT02_STUDY_ID = T000P12_A89TBT02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
         A90TBT02_SUBJECT_ID = T000P12_A90TBT02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
         A91TBT02_CRF_ID = T000P12_A91TBT02_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
         A935TBT02_CRF_EDA_NO = T000P12_A935TBT02_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
      }
   }

   public void scanEnd0P55( )
   {
      pr_default.close(10);
   }

   public void afterConfirm0P55( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0P55( )
   {
      /* Before Insert Rules */
      A450TBT02_CRT_DATETIME = GXutil.now( ) ;
      n450TBT02_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A450TBT02_CRT_DATETIME", localUtil.ttoc( A450TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A451TBT02_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt02_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      A451TBT02_CRT_USER_ID = GXt_char1 ;
      n451TBT02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A451TBT02_CRT_USER_ID", A451TBT02_CRT_USER_ID);
      A453TBT02_UPD_DATETIME = GXutil.now( ) ;
      n453TBT02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A453TBT02_UPD_DATETIME", localUtil.ttoc( A453TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A454TBT02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt02_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      A454TBT02_UPD_USER_ID = GXt_char1 ;
      n454TBT02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A454TBT02_UPD_USER_ID", A454TBT02_UPD_USER_ID);
      A456TBT02_UPD_CNT = (long)(O456TBT02_UPD_CNT+1) ;
      n456TBT02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0P55( )
   {
      /* Before Update Rules */
      A453TBT02_UPD_DATETIME = GXutil.now( ) ;
      n453TBT02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A453TBT02_UPD_DATETIME", localUtil.ttoc( A453TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A454TBT02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt02_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      A454TBT02_UPD_USER_ID = GXt_char1 ;
      n454TBT02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A454TBT02_UPD_USER_ID", A454TBT02_UPD_USER_ID);
      A456TBT02_UPD_CNT = (long)(O456TBT02_UPD_CNT+1) ;
      n456TBT02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0P55( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0P55( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0P55( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0P55( )
   {
      edtTBT02_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_STUDY_ID_Enabled, 5, 0)));
      edtTBT02_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_SUBJECT_ID_Enabled, 5, 0)));
      edtTBT02_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_CRF_ID_Enabled, 5, 0)));
      edtTBT02_CRF_EDA_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_CRF_EDA_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_CRF_EDA_NO_Enabled, 5, 0)));
      edtTBT02_CRF_LATEST_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_CRF_LATEST_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_CRF_LATEST_VERSION_Enabled, 5, 0)));
      edtTBT02_CRF_INPUT_LEVEL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_CRF_INPUT_LEVEL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_CRF_INPUT_LEVEL_Enabled, 5, 0)));
      edtTBT02_LOCK_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_LOCK_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_LOCK_FLG_Enabled, 5, 0)));
      edtTBT02_LOCK_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_LOCK_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_LOCK_DATETIME_Enabled, 5, 0)));
      edtTBT02_LOCK_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_LOCK_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_LOCK_USER_ID_Enabled, 5, 0)));
      edtTBT02_LOCK_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_LOCK_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_LOCK_AUTH_CD_Enabled, 5, 0)));
      edtTBT02_UPLOAD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_UPLOAD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_UPLOAD_DATETIME_Enabled, 5, 0)));
      edtTBT02_UPLOAD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_UPLOAD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_UPLOAD_USER_ID_Enabled, 5, 0)));
      edtTBT02_UPLOAD_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_UPLOAD_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_UPLOAD_AUTH_CD_Enabled, 5, 0)));
      edtTBT02_DM_ARRIVAL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_DM_ARRIVAL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_DM_ARRIVAL_FLG_Enabled, 5, 0)));
      edtTBT02_DM_ARRIVAL_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_DM_ARRIVAL_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_DM_ARRIVAL_DATETIME_Enabled, 5, 0)));
      edtTBT02_APPROVAL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_APPROVAL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_APPROVAL_FLG_Enabled, 5, 0)));
      edtTBT02_APPROVAL_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_APPROVAL_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_APPROVAL_DATETIME_Enabled, 5, 0)));
      edtTBT02_APPROVAL_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_APPROVAL_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_APPROVAL_USER_ID_Enabled, 5, 0)));
      edtTBT02_APPROVAL_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_APPROVAL_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_APPROVAL_AUTH_CD_Enabled, 5, 0)));
      edtTBT02_SIGNATURE_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_SIGNATURE_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_SIGNATURE_FLG_Enabled, 5, 0)));
      edtTBT02_SIGNATURE_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_SIGNATURE_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_SIGNATURE_DATETIME_Enabled, 5, 0)));
      edtTBT02_SIGNATURE_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_SIGNATURE_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_SIGNATURE_USER_ID_Enabled, 5, 0)));
      edtTBT02_INPUT_END_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_INPUT_END_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_INPUT_END_FLG_Enabled, 5, 0)));
      edtTBT02_INPUT_END_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_INPUT_END_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_INPUT_END_DATETIME_Enabled, 5, 0)));
      edtTBT02_INPUT_END_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_INPUT_END_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_INPUT_END_USER_ID_Enabled, 5, 0)));
      edtTBT02_INPUT_END_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_INPUT_END_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_INPUT_END_AUTH_CD_Enabled, 5, 0)));
      edtTBT02_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_DEL_FLG_Enabled, 5, 0)));
      edtTBT02_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_CRT_DATETIME_Enabled, 5, 0)));
      edtTBT02_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_CRT_USER_ID_Enabled, 5, 0)));
      edtTBT02_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBT02_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_UPD_DATETIME_Enabled, 5, 0)));
      edtTBT02_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_UPD_USER_ID_Enabled, 5, 0)));
      edtTBT02_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBT02_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0P0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRFテーブル") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513195851");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbt02_crf") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0P55( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z89TBT02_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z89TBT02_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z90TBT02_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z90TBT02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z91TBT02_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z91TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z935TBT02_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( Z935TBT02_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z450TBT02_CRT_DATETIME", localUtil.ttoc( Z450TBT02_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z451TBT02_CRT_USER_ID", GXutil.rtrim( Z451TBT02_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z453TBT02_UPD_DATETIME", localUtil.ttoc( Z453TBT02_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z454TBT02_UPD_USER_ID", GXutil.rtrim( Z454TBT02_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z456TBT02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z456TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z498TBT02_CRF_LATEST_VERSION", GXutil.ltrim( localUtil.ntoc( Z498TBT02_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z499TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( localUtil.ntoc( Z499TBT02_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z648TBT02_LOCK_FLG", GXutil.rtrim( Z648TBT02_LOCK_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z649TBT02_LOCK_DATETIME", localUtil.ttoc( Z649TBT02_LOCK_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z650TBT02_LOCK_USER_ID", GXutil.rtrim( Z650TBT02_LOCK_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z651TBT02_LOCK_AUTH_CD", GXutil.rtrim( Z651TBT02_LOCK_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z652TBT02_UPLOAD_DATETIME", localUtil.ttoc( Z652TBT02_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z653TBT02_UPLOAD_USER_ID", GXutil.rtrim( Z653TBT02_UPLOAD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z654TBT02_UPLOAD_AUTH_CD", GXutil.rtrim( Z654TBT02_UPLOAD_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z655TBT02_DM_ARRIVAL_FLG", GXutil.rtrim( Z655TBT02_DM_ARRIVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z656TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( Z656TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z657TBT02_APPROVAL_FLG", GXutil.rtrim( Z657TBT02_APPROVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z658TBT02_APPROVAL_DATETIME", localUtil.ttoc( Z658TBT02_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z659TBT02_APPROVAL_USER_ID", GXutil.rtrim( Z659TBT02_APPROVAL_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z660TBT02_APPROVAL_AUTH_CD", GXutil.rtrim( Z660TBT02_APPROVAL_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z990TBT02_SIGNATURE_FLG", GXutil.rtrim( Z990TBT02_SIGNATURE_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z991TBT02_SIGNATURE_DATETIME", localUtil.ttoc( Z991TBT02_SIGNATURE_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z992TBT02_SIGNATURE_USER_ID", GXutil.rtrim( Z992TBT02_SIGNATURE_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z661TBT02_INPUT_END_FLG", GXutil.rtrim( Z661TBT02_INPUT_END_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z662TBT02_INPUT_END_DATETIME", localUtil.ttoc( Z662TBT02_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z663TBT02_INPUT_END_USER_ID", GXutil.rtrim( Z663TBT02_INPUT_END_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z664TBT02_INPUT_END_AUTH_CD", GXutil.rtrim( Z664TBT02_INPUT_END_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z449TBT02_DEL_FLG", GXutil.rtrim( Z449TBT02_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z452TBT02_CRT_PROG_NM", GXutil.rtrim( Z452TBT02_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z455TBT02_UPD_PROG_NM", GXutil.rtrim( Z455TBT02_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O456TBT02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O456TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public String getPgmname( )
   {
      return "TBT02_CRF" ;
   }

   public String getPgmdesc( )
   {
      return "CRFテーブル" ;
   }

   public void initializeNonKey0P55( )
   {
      A450TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n450TBT02_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A450TBT02_CRT_DATETIME", localUtil.ttoc( A450TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n450TBT02_CRT_DATETIME = (GXutil.nullDate().equals(A450TBT02_CRT_DATETIME) ? true : false) ;
      A451TBT02_CRT_USER_ID = "" ;
      n451TBT02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A451TBT02_CRT_USER_ID", A451TBT02_CRT_USER_ID);
      n451TBT02_CRT_USER_ID = ((GXutil.strcmp("", A451TBT02_CRT_USER_ID)==0) ? true : false) ;
      A453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n453TBT02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A453TBT02_UPD_DATETIME", localUtil.ttoc( A453TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n453TBT02_UPD_DATETIME = (GXutil.nullDate().equals(A453TBT02_UPD_DATETIME) ? true : false) ;
      A454TBT02_UPD_USER_ID = "" ;
      n454TBT02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A454TBT02_UPD_USER_ID", A454TBT02_UPD_USER_ID);
      n454TBT02_UPD_USER_ID = ((GXutil.strcmp("", A454TBT02_UPD_USER_ID)==0) ? true : false) ;
      A456TBT02_UPD_CNT = 0 ;
      n456TBT02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)));
      n456TBT02_UPD_CNT = ((0==A456TBT02_UPD_CNT) ? true : false) ;
      A498TBT02_CRF_LATEST_VERSION = (short)(0) ;
      n498TBT02_CRF_LATEST_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A498TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A498TBT02_CRF_LATEST_VERSION, 4, 0)));
      n498TBT02_CRF_LATEST_VERSION = ((0==A498TBT02_CRF_LATEST_VERSION) ? true : false) ;
      A499TBT02_CRF_INPUT_LEVEL = (byte)(0) ;
      n499TBT02_CRF_INPUT_LEVEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A499TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A499TBT02_CRF_INPUT_LEVEL, 2, 0)));
      n499TBT02_CRF_INPUT_LEVEL = ((0==A499TBT02_CRF_INPUT_LEVEL) ? true : false) ;
      A648TBT02_LOCK_FLG = "" ;
      n648TBT02_LOCK_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A648TBT02_LOCK_FLG", A648TBT02_LOCK_FLG);
      n648TBT02_LOCK_FLG = ((GXutil.strcmp("", A648TBT02_LOCK_FLG)==0) ? true : false) ;
      A649TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n649TBT02_LOCK_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A649TBT02_LOCK_DATETIME", localUtil.ttoc( A649TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n649TBT02_LOCK_DATETIME = (GXutil.nullDate().equals(A649TBT02_LOCK_DATETIME) ? true : false) ;
      A650TBT02_LOCK_USER_ID = "" ;
      n650TBT02_LOCK_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A650TBT02_LOCK_USER_ID", A650TBT02_LOCK_USER_ID);
      n650TBT02_LOCK_USER_ID = ((GXutil.strcmp("", A650TBT02_LOCK_USER_ID)==0) ? true : false) ;
      A651TBT02_LOCK_AUTH_CD = "" ;
      n651TBT02_LOCK_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A651TBT02_LOCK_AUTH_CD", A651TBT02_LOCK_AUTH_CD);
      n651TBT02_LOCK_AUTH_CD = ((GXutil.strcmp("", A651TBT02_LOCK_AUTH_CD)==0) ? true : false) ;
      A652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n652TBT02_UPLOAD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A652TBT02_UPLOAD_DATETIME", localUtil.ttoc( A652TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n652TBT02_UPLOAD_DATETIME = (GXutil.nullDate().equals(A652TBT02_UPLOAD_DATETIME) ? true : false) ;
      A653TBT02_UPLOAD_USER_ID = "" ;
      n653TBT02_UPLOAD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A653TBT02_UPLOAD_USER_ID", A653TBT02_UPLOAD_USER_ID);
      n653TBT02_UPLOAD_USER_ID = ((GXutil.strcmp("", A653TBT02_UPLOAD_USER_ID)==0) ? true : false) ;
      A654TBT02_UPLOAD_AUTH_CD = "" ;
      n654TBT02_UPLOAD_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A654TBT02_UPLOAD_AUTH_CD", A654TBT02_UPLOAD_AUTH_CD);
      n654TBT02_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A654TBT02_UPLOAD_AUTH_CD)==0) ? true : false) ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      n655TBT02_DM_ARRIVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A655TBT02_DM_ARRIVAL_FLG", A655TBT02_DM_ARRIVAL_FLG);
      n655TBT02_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A655TBT02_DM_ARRIVAL_FLG)==0) ? true : false) ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n656TBT02_DM_ARRIVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A656TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A656TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n656TBT02_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A656TBT02_DM_ARRIVAL_DATETIME) ? true : false) ;
      A657TBT02_APPROVAL_FLG = "" ;
      n657TBT02_APPROVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A657TBT02_APPROVAL_FLG", A657TBT02_APPROVAL_FLG);
      n657TBT02_APPROVAL_FLG = ((GXutil.strcmp("", A657TBT02_APPROVAL_FLG)==0) ? true : false) ;
      A658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n658TBT02_APPROVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A658TBT02_APPROVAL_DATETIME", localUtil.ttoc( A658TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n658TBT02_APPROVAL_DATETIME = (GXutil.nullDate().equals(A658TBT02_APPROVAL_DATETIME) ? true : false) ;
      A659TBT02_APPROVAL_USER_ID = "" ;
      n659TBT02_APPROVAL_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A659TBT02_APPROVAL_USER_ID", A659TBT02_APPROVAL_USER_ID);
      n659TBT02_APPROVAL_USER_ID = ((GXutil.strcmp("", A659TBT02_APPROVAL_USER_ID)==0) ? true : false) ;
      A660TBT02_APPROVAL_AUTH_CD = "" ;
      n660TBT02_APPROVAL_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A660TBT02_APPROVAL_AUTH_CD", A660TBT02_APPROVAL_AUTH_CD);
      n660TBT02_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A660TBT02_APPROVAL_AUTH_CD)==0) ? true : false) ;
      A990TBT02_SIGNATURE_FLG = "" ;
      n990TBT02_SIGNATURE_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A990TBT02_SIGNATURE_FLG", A990TBT02_SIGNATURE_FLG);
      n990TBT02_SIGNATURE_FLG = ((GXutil.strcmp("", A990TBT02_SIGNATURE_FLG)==0) ? true : false) ;
      A991TBT02_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n991TBT02_SIGNATURE_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A991TBT02_SIGNATURE_DATETIME", localUtil.ttoc( A991TBT02_SIGNATURE_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n991TBT02_SIGNATURE_DATETIME = (GXutil.nullDate().equals(A991TBT02_SIGNATURE_DATETIME) ? true : false) ;
      A992TBT02_SIGNATURE_USER_ID = "" ;
      n992TBT02_SIGNATURE_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A992TBT02_SIGNATURE_USER_ID", A992TBT02_SIGNATURE_USER_ID);
      n992TBT02_SIGNATURE_USER_ID = ((GXutil.strcmp("", A992TBT02_SIGNATURE_USER_ID)==0) ? true : false) ;
      A661TBT02_INPUT_END_FLG = "" ;
      n661TBT02_INPUT_END_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A661TBT02_INPUT_END_FLG", A661TBT02_INPUT_END_FLG);
      n661TBT02_INPUT_END_FLG = ((GXutil.strcmp("", A661TBT02_INPUT_END_FLG)==0) ? true : false) ;
      A662TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n662TBT02_INPUT_END_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A662TBT02_INPUT_END_DATETIME", localUtil.ttoc( A662TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n662TBT02_INPUT_END_DATETIME = (GXutil.nullDate().equals(A662TBT02_INPUT_END_DATETIME) ? true : false) ;
      A663TBT02_INPUT_END_USER_ID = "" ;
      n663TBT02_INPUT_END_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A663TBT02_INPUT_END_USER_ID", A663TBT02_INPUT_END_USER_ID);
      n663TBT02_INPUT_END_USER_ID = ((GXutil.strcmp("", A663TBT02_INPUT_END_USER_ID)==0) ? true : false) ;
      A664TBT02_INPUT_END_AUTH_CD = "" ;
      n664TBT02_INPUT_END_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A664TBT02_INPUT_END_AUTH_CD", A664TBT02_INPUT_END_AUTH_CD);
      n664TBT02_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A664TBT02_INPUT_END_AUTH_CD)==0) ? true : false) ;
      A449TBT02_DEL_FLG = "" ;
      n449TBT02_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A449TBT02_DEL_FLG", A449TBT02_DEL_FLG);
      n449TBT02_DEL_FLG = ((GXutil.strcmp("", A449TBT02_DEL_FLG)==0) ? true : false) ;
      A452TBT02_CRT_PROG_NM = "" ;
      n452TBT02_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A452TBT02_CRT_PROG_NM", A452TBT02_CRT_PROG_NM);
      n452TBT02_CRT_PROG_NM = ((GXutil.strcmp("", A452TBT02_CRT_PROG_NM)==0) ? true : false) ;
      A455TBT02_UPD_PROG_NM = "" ;
      n455TBT02_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A455TBT02_UPD_PROG_NM", A455TBT02_UPD_PROG_NM);
      n455TBT02_UPD_PROG_NM = ((GXutil.strcmp("", A455TBT02_UPD_PROG_NM)==0) ? true : false) ;
      O456TBT02_UPD_CNT = A456TBT02_UPD_CNT ;
      n456TBT02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A456TBT02_UPD_CNT, 10, 0)));
   }

   public void initAll0P55( )
   {
      A89TBT02_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A89TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A89TBT02_STUDY_ID, 10, 0)));
      A90TBT02_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A90TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A90TBT02_SUBJECT_ID, 6, 0)));
      A91TBT02_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A91TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A91TBT02_CRF_ID, 4, 0)));
      A935TBT02_CRF_EDA_NO = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A935TBT02_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A935TBT02_CRF_EDA_NO, 2, 0)));
      initializeNonKey0P55( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513195864");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbt02_crf.js", "?202071513195864");
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
      lblTextblocktbt02_study_id_Internalname = "TEXTBLOCKTBT02_STUDY_ID" ;
      edtTBT02_STUDY_ID_Internalname = "TBT02_STUDY_ID" ;
      lblTextblocktbt02_subject_id_Internalname = "TEXTBLOCKTBT02_SUBJECT_ID" ;
      edtTBT02_SUBJECT_ID_Internalname = "TBT02_SUBJECT_ID" ;
      lblTextblocktbt02_crf_id_Internalname = "TEXTBLOCKTBT02_CRF_ID" ;
      edtTBT02_CRF_ID_Internalname = "TBT02_CRF_ID" ;
      lblTextblocktbt02_crf_eda_no_Internalname = "TEXTBLOCKTBT02_CRF_EDA_NO" ;
      edtTBT02_CRF_EDA_NO_Internalname = "TBT02_CRF_EDA_NO" ;
      lblTextblocktbt02_crf_latest_version_Internalname = "TEXTBLOCKTBT02_CRF_LATEST_VERSION" ;
      edtTBT02_CRF_LATEST_VERSION_Internalname = "TBT02_CRF_LATEST_VERSION" ;
      lblTextblocktbt02_crf_input_level_Internalname = "TEXTBLOCKTBT02_CRF_INPUT_LEVEL" ;
      edtTBT02_CRF_INPUT_LEVEL_Internalname = "TBT02_CRF_INPUT_LEVEL" ;
      lblTextblocktbt02_lock_flg_Internalname = "TEXTBLOCKTBT02_LOCK_FLG" ;
      edtTBT02_LOCK_FLG_Internalname = "TBT02_LOCK_FLG" ;
      lblTextblocktbt02_lock_datetime_Internalname = "TEXTBLOCKTBT02_LOCK_DATETIME" ;
      edtTBT02_LOCK_DATETIME_Internalname = "TBT02_LOCK_DATETIME" ;
      lblTextblocktbt02_lock_user_id_Internalname = "TEXTBLOCKTBT02_LOCK_USER_ID" ;
      edtTBT02_LOCK_USER_ID_Internalname = "TBT02_LOCK_USER_ID" ;
      lblTextblocktbt02_lock_auth_cd_Internalname = "TEXTBLOCKTBT02_LOCK_AUTH_CD" ;
      edtTBT02_LOCK_AUTH_CD_Internalname = "TBT02_LOCK_AUTH_CD" ;
      lblTextblocktbt02_upload_datetime_Internalname = "TEXTBLOCKTBT02_UPLOAD_DATETIME" ;
      edtTBT02_UPLOAD_DATETIME_Internalname = "TBT02_UPLOAD_DATETIME" ;
      lblTextblocktbt02_upload_user_id_Internalname = "TEXTBLOCKTBT02_UPLOAD_USER_ID" ;
      edtTBT02_UPLOAD_USER_ID_Internalname = "TBT02_UPLOAD_USER_ID" ;
      lblTextblocktbt02_upload_auth_cd_Internalname = "TEXTBLOCKTBT02_UPLOAD_AUTH_CD" ;
      edtTBT02_UPLOAD_AUTH_CD_Internalname = "TBT02_UPLOAD_AUTH_CD" ;
      lblTextblocktbt02_dm_arrival_flg_Internalname = "TEXTBLOCKTBT02_DM_ARRIVAL_FLG" ;
      edtTBT02_DM_ARRIVAL_FLG_Internalname = "TBT02_DM_ARRIVAL_FLG" ;
      lblTextblocktbt02_dm_arrival_datetime_Internalname = "TEXTBLOCKTBT02_DM_ARRIVAL_DATETIME" ;
      edtTBT02_DM_ARRIVAL_DATETIME_Internalname = "TBT02_DM_ARRIVAL_DATETIME" ;
      lblTextblocktbt02_approval_flg_Internalname = "TEXTBLOCKTBT02_APPROVAL_FLG" ;
      edtTBT02_APPROVAL_FLG_Internalname = "TBT02_APPROVAL_FLG" ;
      lblTextblocktbt02_approval_datetime_Internalname = "TEXTBLOCKTBT02_APPROVAL_DATETIME" ;
      edtTBT02_APPROVAL_DATETIME_Internalname = "TBT02_APPROVAL_DATETIME" ;
      lblTextblocktbt02_approval_user_id_Internalname = "TEXTBLOCKTBT02_APPROVAL_USER_ID" ;
      edtTBT02_APPROVAL_USER_ID_Internalname = "TBT02_APPROVAL_USER_ID" ;
      lblTextblocktbt02_approval_auth_cd_Internalname = "TEXTBLOCKTBT02_APPROVAL_AUTH_CD" ;
      edtTBT02_APPROVAL_AUTH_CD_Internalname = "TBT02_APPROVAL_AUTH_CD" ;
      lblTextblocktbt02_signature_flg_Internalname = "TEXTBLOCKTBT02_SIGNATURE_FLG" ;
      edtTBT02_SIGNATURE_FLG_Internalname = "TBT02_SIGNATURE_FLG" ;
      lblTextblocktbt02_signature_datetime_Internalname = "TEXTBLOCKTBT02_SIGNATURE_DATETIME" ;
      edtTBT02_SIGNATURE_DATETIME_Internalname = "TBT02_SIGNATURE_DATETIME" ;
      lblTextblocktbt02_signature_user_id_Internalname = "TEXTBLOCKTBT02_SIGNATURE_USER_ID" ;
      edtTBT02_SIGNATURE_USER_ID_Internalname = "TBT02_SIGNATURE_USER_ID" ;
      lblTextblocktbt02_input_end_flg_Internalname = "TEXTBLOCKTBT02_INPUT_END_FLG" ;
      edtTBT02_INPUT_END_FLG_Internalname = "TBT02_INPUT_END_FLG" ;
      lblTextblocktbt02_input_end_datetime_Internalname = "TEXTBLOCKTBT02_INPUT_END_DATETIME" ;
      edtTBT02_INPUT_END_DATETIME_Internalname = "TBT02_INPUT_END_DATETIME" ;
      lblTextblocktbt02_input_end_user_id_Internalname = "TEXTBLOCKTBT02_INPUT_END_USER_ID" ;
      edtTBT02_INPUT_END_USER_ID_Internalname = "TBT02_INPUT_END_USER_ID" ;
      lblTextblocktbt02_input_end_auth_cd_Internalname = "TEXTBLOCKTBT02_INPUT_END_AUTH_CD" ;
      edtTBT02_INPUT_END_AUTH_CD_Internalname = "TBT02_INPUT_END_AUTH_CD" ;
      lblTextblocktbt02_del_flg_Internalname = "TEXTBLOCKTBT02_DEL_FLG" ;
      edtTBT02_DEL_FLG_Internalname = "TBT02_DEL_FLG" ;
      lblTextblocktbt02_crt_datetime_Internalname = "TEXTBLOCKTBT02_CRT_DATETIME" ;
      edtTBT02_CRT_DATETIME_Internalname = "TBT02_CRT_DATETIME" ;
      lblTextblocktbt02_crt_user_id_Internalname = "TEXTBLOCKTBT02_CRT_USER_ID" ;
      edtTBT02_CRT_USER_ID_Internalname = "TBT02_CRT_USER_ID" ;
      lblTextblocktbt02_crt_prog_nm_Internalname = "TEXTBLOCKTBT02_CRT_PROG_NM" ;
      edtTBT02_CRT_PROG_NM_Internalname = "TBT02_CRT_PROG_NM" ;
      lblTextblocktbt02_upd_datetime_Internalname = "TEXTBLOCKTBT02_UPD_DATETIME" ;
      edtTBT02_UPD_DATETIME_Internalname = "TBT02_UPD_DATETIME" ;
      lblTextblocktbt02_upd_user_id_Internalname = "TEXTBLOCKTBT02_UPD_USER_ID" ;
      edtTBT02_UPD_USER_ID_Internalname = "TBT02_UPD_USER_ID" ;
      lblTextblocktbt02_upd_prog_nm_Internalname = "TEXTBLOCKTBT02_UPD_PROG_NM" ;
      edtTBT02_UPD_PROG_NM_Internalname = "TBT02_UPD_PROG_NM" ;
      lblTextblocktbt02_upd_cnt_Internalname = "TEXTBLOCKTBT02_UPD_CNT" ;
      edtTBT02_UPD_CNT_Internalname = "TBT02_UPD_CNT" ;
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
      edtTBT02_UPD_CNT_Jsonclick = "" ;
      edtTBT02_UPD_CNT_Enabled = 1 ;
      edtTBT02_UPD_PROG_NM_Jsonclick = "" ;
      edtTBT02_UPD_PROG_NM_Enabled = 1 ;
      edtTBT02_UPD_USER_ID_Jsonclick = "" ;
      edtTBT02_UPD_USER_ID_Enabled = 1 ;
      edtTBT02_UPD_DATETIME_Jsonclick = "" ;
      edtTBT02_UPD_DATETIME_Enabled = 1 ;
      edtTBT02_CRT_PROG_NM_Jsonclick = "" ;
      edtTBT02_CRT_PROG_NM_Enabled = 1 ;
      edtTBT02_CRT_USER_ID_Jsonclick = "" ;
      edtTBT02_CRT_USER_ID_Enabled = 1 ;
      edtTBT02_CRT_DATETIME_Jsonclick = "" ;
      edtTBT02_CRT_DATETIME_Enabled = 1 ;
      edtTBT02_DEL_FLG_Jsonclick = "" ;
      edtTBT02_DEL_FLG_Enabled = 1 ;
      edtTBT02_INPUT_END_AUTH_CD_Jsonclick = "" ;
      edtTBT02_INPUT_END_AUTH_CD_Enabled = 1 ;
      edtTBT02_INPUT_END_USER_ID_Jsonclick = "" ;
      edtTBT02_INPUT_END_USER_ID_Enabled = 1 ;
      edtTBT02_INPUT_END_DATETIME_Jsonclick = "" ;
      edtTBT02_INPUT_END_DATETIME_Enabled = 1 ;
      edtTBT02_INPUT_END_FLG_Jsonclick = "" ;
      edtTBT02_INPUT_END_FLG_Enabled = 1 ;
      edtTBT02_SIGNATURE_USER_ID_Jsonclick = "" ;
      edtTBT02_SIGNATURE_USER_ID_Enabled = 1 ;
      edtTBT02_SIGNATURE_DATETIME_Jsonclick = "" ;
      edtTBT02_SIGNATURE_DATETIME_Enabled = 1 ;
      edtTBT02_SIGNATURE_FLG_Jsonclick = "" ;
      edtTBT02_SIGNATURE_FLG_Enabled = 1 ;
      edtTBT02_APPROVAL_AUTH_CD_Jsonclick = "" ;
      edtTBT02_APPROVAL_AUTH_CD_Enabled = 1 ;
      edtTBT02_APPROVAL_USER_ID_Jsonclick = "" ;
      edtTBT02_APPROVAL_USER_ID_Enabled = 1 ;
      edtTBT02_APPROVAL_DATETIME_Jsonclick = "" ;
      edtTBT02_APPROVAL_DATETIME_Enabled = 1 ;
      edtTBT02_APPROVAL_FLG_Jsonclick = "" ;
      edtTBT02_APPROVAL_FLG_Enabled = 1 ;
      edtTBT02_DM_ARRIVAL_DATETIME_Jsonclick = "" ;
      edtTBT02_DM_ARRIVAL_DATETIME_Enabled = 1 ;
      edtTBT02_DM_ARRIVAL_FLG_Jsonclick = "" ;
      edtTBT02_DM_ARRIVAL_FLG_Enabled = 1 ;
      edtTBT02_UPLOAD_AUTH_CD_Jsonclick = "" ;
      edtTBT02_UPLOAD_AUTH_CD_Enabled = 1 ;
      edtTBT02_UPLOAD_USER_ID_Jsonclick = "" ;
      edtTBT02_UPLOAD_USER_ID_Enabled = 1 ;
      edtTBT02_UPLOAD_DATETIME_Jsonclick = "" ;
      edtTBT02_UPLOAD_DATETIME_Enabled = 1 ;
      edtTBT02_LOCK_AUTH_CD_Jsonclick = "" ;
      edtTBT02_LOCK_AUTH_CD_Enabled = 1 ;
      edtTBT02_LOCK_USER_ID_Jsonclick = "" ;
      edtTBT02_LOCK_USER_ID_Enabled = 1 ;
      edtTBT02_LOCK_DATETIME_Jsonclick = "" ;
      edtTBT02_LOCK_DATETIME_Enabled = 1 ;
      edtTBT02_LOCK_FLG_Jsonclick = "" ;
      edtTBT02_LOCK_FLG_Enabled = 1 ;
      edtTBT02_CRF_INPUT_LEVEL_Jsonclick = "" ;
      edtTBT02_CRF_INPUT_LEVEL_Enabled = 1 ;
      edtTBT02_CRF_LATEST_VERSION_Jsonclick = "" ;
      edtTBT02_CRF_LATEST_VERSION_Enabled = 1 ;
      edtTBT02_CRF_EDA_NO_Jsonclick = "" ;
      edtTBT02_CRF_EDA_NO_Enabled = 1 ;
      edtTBT02_CRF_ID_Jsonclick = "" ;
      edtTBT02_CRF_ID_Enabled = 1 ;
      edtTBT02_SUBJECT_ID_Jsonclick = "" ;
      edtTBT02_SUBJECT_ID_Enabled = 1 ;
      edtTBT02_STUDY_ID_Jsonclick = "" ;
      edtTBT02_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx10asatbt02_crt_user_id0P55( String Gx_mode )
   {
      GXt_char1 = A451TBT02_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt02_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      A451TBT02_CRT_USER_ID = GXt_char1 ;
      n451TBT02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A451TBT02_CRT_USER_ID", A451TBT02_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A451TBT02_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx12asatbt02_upd_user_id0P55( String Gx_mode )
   {
      GXt_char1 = A454TBT02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt02_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      A454TBT02_UPD_USER_ID = GXt_char1 ;
      n454TBT02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A454TBT02_UPD_USER_ID", A454TBT02_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A454TBT02_UPD_USER_ID))+"\"");
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      /* Using cursor T000P13 */
      pr_default.execute(11, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(11);
      GX_FocusControl = edtTBT02_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbt02_subject_id( long GX_Parm1 ,
                                       int GX_Parm2 )
   {
      A89TBT02_STUDY_ID = GX_Parm1 ;
      A90TBT02_SUBJECT_ID = GX_Parm2 ;
      /* Using cursor T000P13 */
      pr_default.execute(11, new Object[] {new Long(A89TBT02_STUDY_ID), new Integer(A90TBT02_SUBJECT_ID)});
      if ( (pr_default.getStatus(11) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
      }
      pr_default.close(11);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbt02_crf_eda_no( long GX_Parm1 ,
                                       int GX_Parm2 ,
                                       short GX_Parm3 ,
                                       byte GX_Parm4 ,
                                       java.util.Date GX_Parm5 ,
                                       String GX_Parm6 ,
                                       java.util.Date GX_Parm7 ,
                                       String GX_Parm8 ,
                                       long GX_Parm9 ,
                                       short GX_Parm10 ,
                                       byte GX_Parm11 ,
                                       String GX_Parm12 ,
                                       java.util.Date GX_Parm13 ,
                                       String GX_Parm14 ,
                                       String GX_Parm15 ,
                                       java.util.Date GX_Parm16 ,
                                       String GX_Parm17 ,
                                       String GX_Parm18 ,
                                       String GX_Parm19 ,
                                       java.util.Date GX_Parm20 ,
                                       String GX_Parm21 ,
                                       java.util.Date GX_Parm22 ,
                                       String GX_Parm23 ,
                                       String GX_Parm24 ,
                                       String GX_Parm25 ,
                                       java.util.Date GX_Parm26 ,
                                       String GX_Parm27 ,
                                       String GX_Parm28 ,
                                       java.util.Date GX_Parm29 ,
                                       String GX_Parm30 ,
                                       String GX_Parm31 ,
                                       String GX_Parm32 ,
                                       String GX_Parm33 ,
                                       String GX_Parm34 )
   {
      A89TBT02_STUDY_ID = GX_Parm1 ;
      A90TBT02_SUBJECT_ID = GX_Parm2 ;
      A91TBT02_CRF_ID = GX_Parm3 ;
      A935TBT02_CRF_EDA_NO = GX_Parm4 ;
      A450TBT02_CRT_DATETIME = GX_Parm5 ;
      n450TBT02_CRT_DATETIME = false ;
      A451TBT02_CRT_USER_ID = GX_Parm6 ;
      n451TBT02_CRT_USER_ID = false ;
      A453TBT02_UPD_DATETIME = GX_Parm7 ;
      n453TBT02_UPD_DATETIME = false ;
      A454TBT02_UPD_USER_ID = GX_Parm8 ;
      n454TBT02_UPD_USER_ID = false ;
      A456TBT02_UPD_CNT = GX_Parm9 ;
      n456TBT02_UPD_CNT = false ;
      A498TBT02_CRF_LATEST_VERSION = GX_Parm10 ;
      n498TBT02_CRF_LATEST_VERSION = false ;
      A499TBT02_CRF_INPUT_LEVEL = GX_Parm11 ;
      n499TBT02_CRF_INPUT_LEVEL = false ;
      A648TBT02_LOCK_FLG = GX_Parm12 ;
      n648TBT02_LOCK_FLG = false ;
      A649TBT02_LOCK_DATETIME = GX_Parm13 ;
      n649TBT02_LOCK_DATETIME = false ;
      A650TBT02_LOCK_USER_ID = GX_Parm14 ;
      n650TBT02_LOCK_USER_ID = false ;
      A651TBT02_LOCK_AUTH_CD = GX_Parm15 ;
      n651TBT02_LOCK_AUTH_CD = false ;
      A652TBT02_UPLOAD_DATETIME = GX_Parm16 ;
      n652TBT02_UPLOAD_DATETIME = false ;
      A653TBT02_UPLOAD_USER_ID = GX_Parm17 ;
      n653TBT02_UPLOAD_USER_ID = false ;
      A654TBT02_UPLOAD_AUTH_CD = GX_Parm18 ;
      n654TBT02_UPLOAD_AUTH_CD = false ;
      A655TBT02_DM_ARRIVAL_FLG = GX_Parm19 ;
      n655TBT02_DM_ARRIVAL_FLG = false ;
      A656TBT02_DM_ARRIVAL_DATETIME = GX_Parm20 ;
      n656TBT02_DM_ARRIVAL_DATETIME = false ;
      A657TBT02_APPROVAL_FLG = GX_Parm21 ;
      n657TBT02_APPROVAL_FLG = false ;
      A658TBT02_APPROVAL_DATETIME = GX_Parm22 ;
      n658TBT02_APPROVAL_DATETIME = false ;
      A659TBT02_APPROVAL_USER_ID = GX_Parm23 ;
      n659TBT02_APPROVAL_USER_ID = false ;
      A660TBT02_APPROVAL_AUTH_CD = GX_Parm24 ;
      n660TBT02_APPROVAL_AUTH_CD = false ;
      A990TBT02_SIGNATURE_FLG = GX_Parm25 ;
      n990TBT02_SIGNATURE_FLG = false ;
      A991TBT02_SIGNATURE_DATETIME = GX_Parm26 ;
      n991TBT02_SIGNATURE_DATETIME = false ;
      A992TBT02_SIGNATURE_USER_ID = GX_Parm27 ;
      n992TBT02_SIGNATURE_USER_ID = false ;
      A661TBT02_INPUT_END_FLG = GX_Parm28 ;
      n661TBT02_INPUT_END_FLG = false ;
      A662TBT02_INPUT_END_DATETIME = GX_Parm29 ;
      n662TBT02_INPUT_END_DATETIME = false ;
      A663TBT02_INPUT_END_USER_ID = GX_Parm30 ;
      n663TBT02_INPUT_END_USER_ID = false ;
      A664TBT02_INPUT_END_AUTH_CD = GX_Parm31 ;
      n664TBT02_INPUT_END_AUTH_CD = false ;
      A449TBT02_DEL_FLG = GX_Parm32 ;
      n449TBT02_DEL_FLG = false ;
      A452TBT02_CRT_PROG_NM = GX_Parm33 ;
      n452TBT02_CRT_PROG_NM = false ;
      A455TBT02_UPD_PROG_NM = GX_Parm34 ;
      n455TBT02_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A450TBT02_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A451TBT02_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A453TBT02_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A454TBT02_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A456TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A498TBT02_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A499TBT02_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A648TBT02_LOCK_FLG));
      isValidOutput.add(localUtil.format(A649TBT02_LOCK_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A650TBT02_LOCK_USER_ID));
      isValidOutput.add(GXutil.rtrim( A651TBT02_LOCK_AUTH_CD));
      isValidOutput.add(localUtil.format(A652TBT02_UPLOAD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A653TBT02_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A654TBT02_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A655TBT02_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.format(A656TBT02_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A657TBT02_APPROVAL_FLG));
      isValidOutput.add(localUtil.format(A658TBT02_APPROVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A659TBT02_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( A660TBT02_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A990TBT02_SIGNATURE_FLG));
      isValidOutput.add(localUtil.format(A991TBT02_SIGNATURE_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A992TBT02_SIGNATURE_USER_ID));
      isValidOutput.add(GXutil.rtrim( A661TBT02_INPUT_END_FLG));
      isValidOutput.add(localUtil.format(A662TBT02_INPUT_END_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A663TBT02_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( A664TBT02_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A449TBT02_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A452TBT02_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A455TBT02_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z89TBT02_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z90TBT02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z91TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z935TBT02_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z450TBT02_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z451TBT02_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z453TBT02_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z454TBT02_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z456TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z498TBT02_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z499TBT02_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z648TBT02_LOCK_FLG));
      isValidOutput.add(localUtil.ttoc( Z649TBT02_LOCK_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z650TBT02_LOCK_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z651TBT02_LOCK_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z652TBT02_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z653TBT02_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z654TBT02_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z655TBT02_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z656TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z657TBT02_APPROVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z658TBT02_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z659TBT02_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z660TBT02_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z990TBT02_SIGNATURE_FLG));
      isValidOutput.add(localUtil.ttoc( Z991TBT02_SIGNATURE_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z992TBT02_SIGNATURE_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z661TBT02_INPUT_END_FLG));
      isValidOutput.add(localUtil.ttoc( Z662TBT02_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z663TBT02_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z664TBT02_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z449TBT02_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z452TBT02_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z455TBT02_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O456TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      pr_default.close(11);
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
      Z450TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z451TBT02_CRT_USER_ID = "" ;
      Z453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z454TBT02_UPD_USER_ID = "" ;
      Z648TBT02_LOCK_FLG = "" ;
      Z649TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z650TBT02_LOCK_USER_ID = "" ;
      Z651TBT02_LOCK_AUTH_CD = "" ;
      Z652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z653TBT02_UPLOAD_USER_ID = "" ;
      Z654TBT02_UPLOAD_AUTH_CD = "" ;
      Z655TBT02_DM_ARRIVAL_FLG = "" ;
      Z656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z657TBT02_APPROVAL_FLG = "" ;
      Z658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z659TBT02_APPROVAL_USER_ID = "" ;
      Z660TBT02_APPROVAL_AUTH_CD = "" ;
      Z990TBT02_SIGNATURE_FLG = "" ;
      Z991TBT02_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z992TBT02_SIGNATURE_USER_ID = "" ;
      Z661TBT02_INPUT_END_FLG = "" ;
      Z662TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z663TBT02_INPUT_END_USER_ID = "" ;
      Z664TBT02_INPUT_END_AUTH_CD = "" ;
      Z449TBT02_DEL_FLG = "" ;
      Z452TBT02_CRT_PROG_NM = "" ;
      Z455TBT02_UPD_PROG_NM = "" ;
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
      lblTextblocktbt02_study_id_Jsonclick = "" ;
      lblTextblocktbt02_subject_id_Jsonclick = "" ;
      lblTextblocktbt02_crf_id_Jsonclick = "" ;
      lblTextblocktbt02_crf_eda_no_Jsonclick = "" ;
      lblTextblocktbt02_crf_latest_version_Jsonclick = "" ;
      lblTextblocktbt02_crf_input_level_Jsonclick = "" ;
      lblTextblocktbt02_lock_flg_Jsonclick = "" ;
      A648TBT02_LOCK_FLG = "" ;
      lblTextblocktbt02_lock_datetime_Jsonclick = "" ;
      A649TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_lock_user_id_Jsonclick = "" ;
      A650TBT02_LOCK_USER_ID = "" ;
      lblTextblocktbt02_lock_auth_cd_Jsonclick = "" ;
      A651TBT02_LOCK_AUTH_CD = "" ;
      lblTextblocktbt02_upload_datetime_Jsonclick = "" ;
      A652TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_upload_user_id_Jsonclick = "" ;
      A653TBT02_UPLOAD_USER_ID = "" ;
      lblTextblocktbt02_upload_auth_cd_Jsonclick = "" ;
      A654TBT02_UPLOAD_AUTH_CD = "" ;
      lblTextblocktbt02_dm_arrival_flg_Jsonclick = "" ;
      A655TBT02_DM_ARRIVAL_FLG = "" ;
      lblTextblocktbt02_dm_arrival_datetime_Jsonclick = "" ;
      A656TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_approval_flg_Jsonclick = "" ;
      A657TBT02_APPROVAL_FLG = "" ;
      lblTextblocktbt02_approval_datetime_Jsonclick = "" ;
      A658TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_approval_user_id_Jsonclick = "" ;
      A659TBT02_APPROVAL_USER_ID = "" ;
      lblTextblocktbt02_approval_auth_cd_Jsonclick = "" ;
      A660TBT02_APPROVAL_AUTH_CD = "" ;
      lblTextblocktbt02_signature_flg_Jsonclick = "" ;
      A990TBT02_SIGNATURE_FLG = "" ;
      lblTextblocktbt02_signature_datetime_Jsonclick = "" ;
      A991TBT02_SIGNATURE_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_signature_user_id_Jsonclick = "" ;
      A992TBT02_SIGNATURE_USER_ID = "" ;
      lblTextblocktbt02_input_end_flg_Jsonclick = "" ;
      A661TBT02_INPUT_END_FLG = "" ;
      lblTextblocktbt02_input_end_datetime_Jsonclick = "" ;
      A662TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_input_end_user_id_Jsonclick = "" ;
      A663TBT02_INPUT_END_USER_ID = "" ;
      lblTextblocktbt02_input_end_auth_cd_Jsonclick = "" ;
      A664TBT02_INPUT_END_AUTH_CD = "" ;
      lblTextblocktbt02_del_flg_Jsonclick = "" ;
      A449TBT02_DEL_FLG = "" ;
      lblTextblocktbt02_crt_datetime_Jsonclick = "" ;
      A450TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_crt_user_id_Jsonclick = "" ;
      A451TBT02_CRT_USER_ID = "" ;
      lblTextblocktbt02_crt_prog_nm_Jsonclick = "" ;
      A452TBT02_CRT_PROG_NM = "" ;
      lblTextblocktbt02_upd_datetime_Jsonclick = "" ;
      A453TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_upd_user_id_Jsonclick = "" ;
      A454TBT02_UPD_USER_ID = "" ;
      lblTextblocktbt02_upd_prog_nm_Jsonclick = "" ;
      A455TBT02_UPD_PROG_NM = "" ;
      lblTextblocktbt02_upd_cnt_Jsonclick = "" ;
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
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T000P5_A91TBT02_CRF_ID = new short[1] ;
      T000P5_A935TBT02_CRF_EDA_NO = new byte[1] ;
      T000P5_A450TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n450TBT02_CRT_DATETIME = new boolean[] {false} ;
      T000P5_A451TBT02_CRT_USER_ID = new String[] {""} ;
      T000P5_n451TBT02_CRT_USER_ID = new boolean[] {false} ;
      T000P5_A453TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n453TBT02_UPD_DATETIME = new boolean[] {false} ;
      T000P5_A454TBT02_UPD_USER_ID = new String[] {""} ;
      T000P5_n454TBT02_UPD_USER_ID = new boolean[] {false} ;
      T000P5_A456TBT02_UPD_CNT = new long[1] ;
      T000P5_n456TBT02_UPD_CNT = new boolean[] {false} ;
      T000P5_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      T000P5_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      T000P5_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      T000P5_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000P5_A648TBT02_LOCK_FLG = new String[] {""} ;
      T000P5_n648TBT02_LOCK_FLG = new boolean[] {false} ;
      T000P5_A649TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n649TBT02_LOCK_DATETIME = new boolean[] {false} ;
      T000P5_A650TBT02_LOCK_USER_ID = new String[] {""} ;
      T000P5_n650TBT02_LOCK_USER_ID = new boolean[] {false} ;
      T000P5_A651TBT02_LOCK_AUTH_CD = new String[] {""} ;
      T000P5_n651TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      T000P5_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      T000P5_A653TBT02_UPLOAD_USER_ID = new String[] {""} ;
      T000P5_n653TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      T000P5_A654TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      T000P5_n654TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000P5_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      T000P5_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000P5_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000P5_A657TBT02_APPROVAL_FLG = new String[] {""} ;
      T000P5_n657TBT02_APPROVAL_FLG = new boolean[] {false} ;
      T000P5_A658TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n658TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      T000P5_A659TBT02_APPROVAL_USER_ID = new String[] {""} ;
      T000P5_n659TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      T000P5_A660TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      T000P5_n660TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000P5_A990TBT02_SIGNATURE_FLG = new String[] {""} ;
      T000P5_n990TBT02_SIGNATURE_FLG = new boolean[] {false} ;
      T000P5_A991TBT02_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n991TBT02_SIGNATURE_DATETIME = new boolean[] {false} ;
      T000P5_A992TBT02_SIGNATURE_USER_ID = new String[] {""} ;
      T000P5_n992TBT02_SIGNATURE_USER_ID = new boolean[] {false} ;
      T000P5_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      T000P5_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      T000P5_A662TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n662TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      T000P5_A663TBT02_INPUT_END_USER_ID = new String[] {""} ;
      T000P5_n663TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      T000P5_A664TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      T000P5_n664TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000P5_A449TBT02_DEL_FLG = new String[] {""} ;
      T000P5_n449TBT02_DEL_FLG = new boolean[] {false} ;
      T000P5_A452TBT02_CRT_PROG_NM = new String[] {""} ;
      T000P5_n452TBT02_CRT_PROG_NM = new boolean[] {false} ;
      T000P5_A455TBT02_UPD_PROG_NM = new String[] {""} ;
      T000P5_n455TBT02_UPD_PROG_NM = new boolean[] {false} ;
      T000P5_A89TBT02_STUDY_ID = new long[1] ;
      T000P5_A90TBT02_SUBJECT_ID = new int[1] ;
      T000P4_A89TBT02_STUDY_ID = new long[1] ;
      T000P6_A89TBT02_STUDY_ID = new long[1] ;
      T000P6_A90TBT02_SUBJECT_ID = new int[1] ;
      T000P6_A91TBT02_CRF_ID = new short[1] ;
      T000P6_A935TBT02_CRF_EDA_NO = new byte[1] ;
      T000P3_A91TBT02_CRF_ID = new short[1] ;
      T000P3_A935TBT02_CRF_EDA_NO = new byte[1] ;
      T000P3_A450TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n450TBT02_CRT_DATETIME = new boolean[] {false} ;
      T000P3_A451TBT02_CRT_USER_ID = new String[] {""} ;
      T000P3_n451TBT02_CRT_USER_ID = new boolean[] {false} ;
      T000P3_A453TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n453TBT02_UPD_DATETIME = new boolean[] {false} ;
      T000P3_A454TBT02_UPD_USER_ID = new String[] {""} ;
      T000P3_n454TBT02_UPD_USER_ID = new boolean[] {false} ;
      T000P3_A456TBT02_UPD_CNT = new long[1] ;
      T000P3_n456TBT02_UPD_CNT = new boolean[] {false} ;
      T000P3_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      T000P3_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      T000P3_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      T000P3_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000P3_A648TBT02_LOCK_FLG = new String[] {""} ;
      T000P3_n648TBT02_LOCK_FLG = new boolean[] {false} ;
      T000P3_A649TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n649TBT02_LOCK_DATETIME = new boolean[] {false} ;
      T000P3_A650TBT02_LOCK_USER_ID = new String[] {""} ;
      T000P3_n650TBT02_LOCK_USER_ID = new boolean[] {false} ;
      T000P3_A651TBT02_LOCK_AUTH_CD = new String[] {""} ;
      T000P3_n651TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      T000P3_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      T000P3_A653TBT02_UPLOAD_USER_ID = new String[] {""} ;
      T000P3_n653TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      T000P3_A654TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      T000P3_n654TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000P3_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      T000P3_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000P3_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000P3_A657TBT02_APPROVAL_FLG = new String[] {""} ;
      T000P3_n657TBT02_APPROVAL_FLG = new boolean[] {false} ;
      T000P3_A658TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n658TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      T000P3_A659TBT02_APPROVAL_USER_ID = new String[] {""} ;
      T000P3_n659TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      T000P3_A660TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      T000P3_n660TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000P3_A990TBT02_SIGNATURE_FLG = new String[] {""} ;
      T000P3_n990TBT02_SIGNATURE_FLG = new boolean[] {false} ;
      T000P3_A991TBT02_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n991TBT02_SIGNATURE_DATETIME = new boolean[] {false} ;
      T000P3_A992TBT02_SIGNATURE_USER_ID = new String[] {""} ;
      T000P3_n992TBT02_SIGNATURE_USER_ID = new boolean[] {false} ;
      T000P3_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      T000P3_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      T000P3_A662TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n662TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      T000P3_A663TBT02_INPUT_END_USER_ID = new String[] {""} ;
      T000P3_n663TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      T000P3_A664TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      T000P3_n664TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000P3_A449TBT02_DEL_FLG = new String[] {""} ;
      T000P3_n449TBT02_DEL_FLG = new boolean[] {false} ;
      T000P3_A452TBT02_CRT_PROG_NM = new String[] {""} ;
      T000P3_n452TBT02_CRT_PROG_NM = new boolean[] {false} ;
      T000P3_A455TBT02_UPD_PROG_NM = new String[] {""} ;
      T000P3_n455TBT02_UPD_PROG_NM = new boolean[] {false} ;
      T000P3_A89TBT02_STUDY_ID = new long[1] ;
      T000P3_A90TBT02_SUBJECT_ID = new int[1] ;
      sMode55 = "" ;
      T000P7_A89TBT02_STUDY_ID = new long[1] ;
      T000P7_A90TBT02_SUBJECT_ID = new int[1] ;
      T000P7_A91TBT02_CRF_ID = new short[1] ;
      T000P7_A935TBT02_CRF_EDA_NO = new byte[1] ;
      T000P8_A89TBT02_STUDY_ID = new long[1] ;
      T000P8_A90TBT02_SUBJECT_ID = new int[1] ;
      T000P8_A91TBT02_CRF_ID = new short[1] ;
      T000P8_A935TBT02_CRF_EDA_NO = new byte[1] ;
      T000P2_A91TBT02_CRF_ID = new short[1] ;
      T000P2_A935TBT02_CRF_EDA_NO = new byte[1] ;
      T000P2_A450TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n450TBT02_CRT_DATETIME = new boolean[] {false} ;
      T000P2_A451TBT02_CRT_USER_ID = new String[] {""} ;
      T000P2_n451TBT02_CRT_USER_ID = new boolean[] {false} ;
      T000P2_A453TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n453TBT02_UPD_DATETIME = new boolean[] {false} ;
      T000P2_A454TBT02_UPD_USER_ID = new String[] {""} ;
      T000P2_n454TBT02_UPD_USER_ID = new boolean[] {false} ;
      T000P2_A456TBT02_UPD_CNT = new long[1] ;
      T000P2_n456TBT02_UPD_CNT = new boolean[] {false} ;
      T000P2_A498TBT02_CRF_LATEST_VERSION = new short[1] ;
      T000P2_n498TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      T000P2_A499TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      T000P2_n499TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000P2_A648TBT02_LOCK_FLG = new String[] {""} ;
      T000P2_n648TBT02_LOCK_FLG = new boolean[] {false} ;
      T000P2_A649TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n649TBT02_LOCK_DATETIME = new boolean[] {false} ;
      T000P2_A650TBT02_LOCK_USER_ID = new String[] {""} ;
      T000P2_n650TBT02_LOCK_USER_ID = new boolean[] {false} ;
      T000P2_A651TBT02_LOCK_AUTH_CD = new String[] {""} ;
      T000P2_n651TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      T000P2_A652TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n652TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      T000P2_A653TBT02_UPLOAD_USER_ID = new String[] {""} ;
      T000P2_n653TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      T000P2_A654TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      T000P2_n654TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000P2_A655TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      T000P2_n655TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000P2_A656TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n656TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000P2_A657TBT02_APPROVAL_FLG = new String[] {""} ;
      T000P2_n657TBT02_APPROVAL_FLG = new boolean[] {false} ;
      T000P2_A658TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n658TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      T000P2_A659TBT02_APPROVAL_USER_ID = new String[] {""} ;
      T000P2_n659TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      T000P2_A660TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      T000P2_n660TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000P2_A990TBT02_SIGNATURE_FLG = new String[] {""} ;
      T000P2_n990TBT02_SIGNATURE_FLG = new boolean[] {false} ;
      T000P2_A991TBT02_SIGNATURE_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n991TBT02_SIGNATURE_DATETIME = new boolean[] {false} ;
      T000P2_A992TBT02_SIGNATURE_USER_ID = new String[] {""} ;
      T000P2_n992TBT02_SIGNATURE_USER_ID = new boolean[] {false} ;
      T000P2_A661TBT02_INPUT_END_FLG = new String[] {""} ;
      T000P2_n661TBT02_INPUT_END_FLG = new boolean[] {false} ;
      T000P2_A662TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n662TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      T000P2_A663TBT02_INPUT_END_USER_ID = new String[] {""} ;
      T000P2_n663TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      T000P2_A664TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      T000P2_n664TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000P2_A449TBT02_DEL_FLG = new String[] {""} ;
      T000P2_n449TBT02_DEL_FLG = new boolean[] {false} ;
      T000P2_A452TBT02_CRT_PROG_NM = new String[] {""} ;
      T000P2_n452TBT02_CRT_PROG_NM = new boolean[] {false} ;
      T000P2_A455TBT02_UPD_PROG_NM = new String[] {""} ;
      T000P2_n455TBT02_UPD_PROG_NM = new boolean[] {false} ;
      T000P2_A89TBT02_STUDY_ID = new long[1] ;
      T000P2_A90TBT02_SUBJECT_ID = new int[1] ;
      T000P12_A89TBT02_STUDY_ID = new long[1] ;
      T000P12_A90TBT02_SUBJECT_ID = new int[1] ;
      T000P12_A91TBT02_CRF_ID = new short[1] ;
      T000P12_A935TBT02_CRF_EDA_NO = new byte[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      T000P13_A89TBT02_STUDY_ID = new long[1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt02_crf__default(),
         new Object[] {
             new Object[] {
            T000P2_A91TBT02_CRF_ID, T000P2_A935TBT02_CRF_EDA_NO, T000P2_A450TBT02_CRT_DATETIME, T000P2_n450TBT02_CRT_DATETIME, T000P2_A451TBT02_CRT_USER_ID, T000P2_n451TBT02_CRT_USER_ID, T000P2_A453TBT02_UPD_DATETIME, T000P2_n453TBT02_UPD_DATETIME, T000P2_A454TBT02_UPD_USER_ID, T000P2_n454TBT02_UPD_USER_ID,
            T000P2_A456TBT02_UPD_CNT, T000P2_n456TBT02_UPD_CNT, T000P2_A498TBT02_CRF_LATEST_VERSION, T000P2_n498TBT02_CRF_LATEST_VERSION, T000P2_A499TBT02_CRF_INPUT_LEVEL, T000P2_n499TBT02_CRF_INPUT_LEVEL, T000P2_A648TBT02_LOCK_FLG, T000P2_n648TBT02_LOCK_FLG, T000P2_A649TBT02_LOCK_DATETIME, T000P2_n649TBT02_LOCK_DATETIME,
            T000P2_A650TBT02_LOCK_USER_ID, T000P2_n650TBT02_LOCK_USER_ID, T000P2_A651TBT02_LOCK_AUTH_CD, T000P2_n651TBT02_LOCK_AUTH_CD, T000P2_A652TBT02_UPLOAD_DATETIME, T000P2_n652TBT02_UPLOAD_DATETIME, T000P2_A653TBT02_UPLOAD_USER_ID, T000P2_n653TBT02_UPLOAD_USER_ID, T000P2_A654TBT02_UPLOAD_AUTH_CD, T000P2_n654TBT02_UPLOAD_AUTH_CD,
            T000P2_A655TBT02_DM_ARRIVAL_FLG, T000P2_n655TBT02_DM_ARRIVAL_FLG, T000P2_A656TBT02_DM_ARRIVAL_DATETIME, T000P2_n656TBT02_DM_ARRIVAL_DATETIME, T000P2_A657TBT02_APPROVAL_FLG, T000P2_n657TBT02_APPROVAL_FLG, T000P2_A658TBT02_APPROVAL_DATETIME, T000P2_n658TBT02_APPROVAL_DATETIME, T000P2_A659TBT02_APPROVAL_USER_ID, T000P2_n659TBT02_APPROVAL_USER_ID,
            T000P2_A660TBT02_APPROVAL_AUTH_CD, T000P2_n660TBT02_APPROVAL_AUTH_CD, T000P2_A990TBT02_SIGNATURE_FLG, T000P2_n990TBT02_SIGNATURE_FLG, T000P2_A991TBT02_SIGNATURE_DATETIME, T000P2_n991TBT02_SIGNATURE_DATETIME, T000P2_A992TBT02_SIGNATURE_USER_ID, T000P2_n992TBT02_SIGNATURE_USER_ID, T000P2_A661TBT02_INPUT_END_FLG, T000P2_n661TBT02_INPUT_END_FLG,
            T000P2_A662TBT02_INPUT_END_DATETIME, T000P2_n662TBT02_INPUT_END_DATETIME, T000P2_A663TBT02_INPUT_END_USER_ID, T000P2_n663TBT02_INPUT_END_USER_ID, T000P2_A664TBT02_INPUT_END_AUTH_CD, T000P2_n664TBT02_INPUT_END_AUTH_CD, T000P2_A449TBT02_DEL_FLG, T000P2_n449TBT02_DEL_FLG, T000P2_A452TBT02_CRT_PROG_NM, T000P2_n452TBT02_CRT_PROG_NM,
            T000P2_A455TBT02_UPD_PROG_NM, T000P2_n455TBT02_UPD_PROG_NM, T000P2_A89TBT02_STUDY_ID, T000P2_A90TBT02_SUBJECT_ID
            }
            , new Object[] {
            T000P3_A91TBT02_CRF_ID, T000P3_A935TBT02_CRF_EDA_NO, T000P3_A450TBT02_CRT_DATETIME, T000P3_n450TBT02_CRT_DATETIME, T000P3_A451TBT02_CRT_USER_ID, T000P3_n451TBT02_CRT_USER_ID, T000P3_A453TBT02_UPD_DATETIME, T000P3_n453TBT02_UPD_DATETIME, T000P3_A454TBT02_UPD_USER_ID, T000P3_n454TBT02_UPD_USER_ID,
            T000P3_A456TBT02_UPD_CNT, T000P3_n456TBT02_UPD_CNT, T000P3_A498TBT02_CRF_LATEST_VERSION, T000P3_n498TBT02_CRF_LATEST_VERSION, T000P3_A499TBT02_CRF_INPUT_LEVEL, T000P3_n499TBT02_CRF_INPUT_LEVEL, T000P3_A648TBT02_LOCK_FLG, T000P3_n648TBT02_LOCK_FLG, T000P3_A649TBT02_LOCK_DATETIME, T000P3_n649TBT02_LOCK_DATETIME,
            T000P3_A650TBT02_LOCK_USER_ID, T000P3_n650TBT02_LOCK_USER_ID, T000P3_A651TBT02_LOCK_AUTH_CD, T000P3_n651TBT02_LOCK_AUTH_CD, T000P3_A652TBT02_UPLOAD_DATETIME, T000P3_n652TBT02_UPLOAD_DATETIME, T000P3_A653TBT02_UPLOAD_USER_ID, T000P3_n653TBT02_UPLOAD_USER_ID, T000P3_A654TBT02_UPLOAD_AUTH_CD, T000P3_n654TBT02_UPLOAD_AUTH_CD,
            T000P3_A655TBT02_DM_ARRIVAL_FLG, T000P3_n655TBT02_DM_ARRIVAL_FLG, T000P3_A656TBT02_DM_ARRIVAL_DATETIME, T000P3_n656TBT02_DM_ARRIVAL_DATETIME, T000P3_A657TBT02_APPROVAL_FLG, T000P3_n657TBT02_APPROVAL_FLG, T000P3_A658TBT02_APPROVAL_DATETIME, T000P3_n658TBT02_APPROVAL_DATETIME, T000P3_A659TBT02_APPROVAL_USER_ID, T000P3_n659TBT02_APPROVAL_USER_ID,
            T000P3_A660TBT02_APPROVAL_AUTH_CD, T000P3_n660TBT02_APPROVAL_AUTH_CD, T000P3_A990TBT02_SIGNATURE_FLG, T000P3_n990TBT02_SIGNATURE_FLG, T000P3_A991TBT02_SIGNATURE_DATETIME, T000P3_n991TBT02_SIGNATURE_DATETIME, T000P3_A992TBT02_SIGNATURE_USER_ID, T000P3_n992TBT02_SIGNATURE_USER_ID, T000P3_A661TBT02_INPUT_END_FLG, T000P3_n661TBT02_INPUT_END_FLG,
            T000P3_A662TBT02_INPUT_END_DATETIME, T000P3_n662TBT02_INPUT_END_DATETIME, T000P3_A663TBT02_INPUT_END_USER_ID, T000P3_n663TBT02_INPUT_END_USER_ID, T000P3_A664TBT02_INPUT_END_AUTH_CD, T000P3_n664TBT02_INPUT_END_AUTH_CD, T000P3_A449TBT02_DEL_FLG, T000P3_n449TBT02_DEL_FLG, T000P3_A452TBT02_CRT_PROG_NM, T000P3_n452TBT02_CRT_PROG_NM,
            T000P3_A455TBT02_UPD_PROG_NM, T000P3_n455TBT02_UPD_PROG_NM, T000P3_A89TBT02_STUDY_ID, T000P3_A90TBT02_SUBJECT_ID
            }
            , new Object[] {
            T000P4_A89TBT02_STUDY_ID
            }
            , new Object[] {
            T000P5_A91TBT02_CRF_ID, T000P5_A935TBT02_CRF_EDA_NO, T000P5_A450TBT02_CRT_DATETIME, T000P5_n450TBT02_CRT_DATETIME, T000P5_A451TBT02_CRT_USER_ID, T000P5_n451TBT02_CRT_USER_ID, T000P5_A453TBT02_UPD_DATETIME, T000P5_n453TBT02_UPD_DATETIME, T000P5_A454TBT02_UPD_USER_ID, T000P5_n454TBT02_UPD_USER_ID,
            T000P5_A456TBT02_UPD_CNT, T000P5_n456TBT02_UPD_CNT, T000P5_A498TBT02_CRF_LATEST_VERSION, T000P5_n498TBT02_CRF_LATEST_VERSION, T000P5_A499TBT02_CRF_INPUT_LEVEL, T000P5_n499TBT02_CRF_INPUT_LEVEL, T000P5_A648TBT02_LOCK_FLG, T000P5_n648TBT02_LOCK_FLG, T000P5_A649TBT02_LOCK_DATETIME, T000P5_n649TBT02_LOCK_DATETIME,
            T000P5_A650TBT02_LOCK_USER_ID, T000P5_n650TBT02_LOCK_USER_ID, T000P5_A651TBT02_LOCK_AUTH_CD, T000P5_n651TBT02_LOCK_AUTH_CD, T000P5_A652TBT02_UPLOAD_DATETIME, T000P5_n652TBT02_UPLOAD_DATETIME, T000P5_A653TBT02_UPLOAD_USER_ID, T000P5_n653TBT02_UPLOAD_USER_ID, T000P5_A654TBT02_UPLOAD_AUTH_CD, T000P5_n654TBT02_UPLOAD_AUTH_CD,
            T000P5_A655TBT02_DM_ARRIVAL_FLG, T000P5_n655TBT02_DM_ARRIVAL_FLG, T000P5_A656TBT02_DM_ARRIVAL_DATETIME, T000P5_n656TBT02_DM_ARRIVAL_DATETIME, T000P5_A657TBT02_APPROVAL_FLG, T000P5_n657TBT02_APPROVAL_FLG, T000P5_A658TBT02_APPROVAL_DATETIME, T000P5_n658TBT02_APPROVAL_DATETIME, T000P5_A659TBT02_APPROVAL_USER_ID, T000P5_n659TBT02_APPROVAL_USER_ID,
            T000P5_A660TBT02_APPROVAL_AUTH_CD, T000P5_n660TBT02_APPROVAL_AUTH_CD, T000P5_A990TBT02_SIGNATURE_FLG, T000P5_n990TBT02_SIGNATURE_FLG, T000P5_A991TBT02_SIGNATURE_DATETIME, T000P5_n991TBT02_SIGNATURE_DATETIME, T000P5_A992TBT02_SIGNATURE_USER_ID, T000P5_n992TBT02_SIGNATURE_USER_ID, T000P5_A661TBT02_INPUT_END_FLG, T000P5_n661TBT02_INPUT_END_FLG,
            T000P5_A662TBT02_INPUT_END_DATETIME, T000P5_n662TBT02_INPUT_END_DATETIME, T000P5_A663TBT02_INPUT_END_USER_ID, T000P5_n663TBT02_INPUT_END_USER_ID, T000P5_A664TBT02_INPUT_END_AUTH_CD, T000P5_n664TBT02_INPUT_END_AUTH_CD, T000P5_A449TBT02_DEL_FLG, T000P5_n449TBT02_DEL_FLG, T000P5_A452TBT02_CRT_PROG_NM, T000P5_n452TBT02_CRT_PROG_NM,
            T000P5_A455TBT02_UPD_PROG_NM, T000P5_n455TBT02_UPD_PROG_NM, T000P5_A89TBT02_STUDY_ID, T000P5_A90TBT02_SUBJECT_ID
            }
            , new Object[] {
            T000P6_A89TBT02_STUDY_ID, T000P6_A90TBT02_SUBJECT_ID, T000P6_A91TBT02_CRF_ID, T000P6_A935TBT02_CRF_EDA_NO
            }
            , new Object[] {
            T000P7_A89TBT02_STUDY_ID, T000P7_A90TBT02_SUBJECT_ID, T000P7_A91TBT02_CRF_ID, T000P7_A935TBT02_CRF_EDA_NO
            }
            , new Object[] {
            T000P8_A89TBT02_STUDY_ID, T000P8_A90TBT02_SUBJECT_ID, T000P8_A91TBT02_CRF_ID, T000P8_A935TBT02_CRF_EDA_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000P12_A89TBT02_STUDY_ID, T000P12_A90TBT02_SUBJECT_ID, T000P12_A91TBT02_CRF_ID, T000P12_A935TBT02_CRF_EDA_NO
            }
            , new Object[] {
            T000P13_A89TBT02_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT02_CRF" ;
   }

   private byte Z935TBT02_CRF_EDA_NO ;
   private byte Z499TBT02_CRF_INPUT_LEVEL ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A935TBT02_CRF_EDA_NO ;
   private byte A499TBT02_CRF_INPUT_LEVEL ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z91TBT02_CRF_ID ;
   private short Z498TBT02_CRF_LATEST_VERSION ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A91TBT02_CRF_ID ;
   private short A498TBT02_CRF_LATEST_VERSION ;
   private short RcdFound55 ;
   private short Gx_err ;
   private int Z90TBT02_SUBJECT_ID ;
   private int A90TBT02_SUBJECT_ID ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBT02_STUDY_ID_Enabled ;
   private int edtTBT02_SUBJECT_ID_Enabled ;
   private int edtTBT02_CRF_ID_Enabled ;
   private int edtTBT02_CRF_EDA_NO_Enabled ;
   private int edtTBT02_CRF_LATEST_VERSION_Enabled ;
   private int edtTBT02_CRF_INPUT_LEVEL_Enabled ;
   private int edtTBT02_LOCK_FLG_Enabled ;
   private int edtTBT02_LOCK_DATETIME_Enabled ;
   private int edtTBT02_LOCK_USER_ID_Enabled ;
   private int edtTBT02_LOCK_AUTH_CD_Enabled ;
   private int edtTBT02_UPLOAD_DATETIME_Enabled ;
   private int edtTBT02_UPLOAD_USER_ID_Enabled ;
   private int edtTBT02_UPLOAD_AUTH_CD_Enabled ;
   private int edtTBT02_DM_ARRIVAL_FLG_Enabled ;
   private int edtTBT02_DM_ARRIVAL_DATETIME_Enabled ;
   private int edtTBT02_APPROVAL_FLG_Enabled ;
   private int edtTBT02_APPROVAL_DATETIME_Enabled ;
   private int edtTBT02_APPROVAL_USER_ID_Enabled ;
   private int edtTBT02_APPROVAL_AUTH_CD_Enabled ;
   private int edtTBT02_SIGNATURE_FLG_Enabled ;
   private int edtTBT02_SIGNATURE_DATETIME_Enabled ;
   private int edtTBT02_SIGNATURE_USER_ID_Enabled ;
   private int edtTBT02_INPUT_END_FLG_Enabled ;
   private int edtTBT02_INPUT_END_DATETIME_Enabled ;
   private int edtTBT02_INPUT_END_USER_ID_Enabled ;
   private int edtTBT02_INPUT_END_AUTH_CD_Enabled ;
   private int edtTBT02_DEL_FLG_Enabled ;
   private int edtTBT02_CRT_DATETIME_Enabled ;
   private int edtTBT02_CRT_USER_ID_Enabled ;
   private int edtTBT02_CRT_PROG_NM_Enabled ;
   private int edtTBT02_UPD_DATETIME_Enabled ;
   private int edtTBT02_UPD_USER_ID_Enabled ;
   private int edtTBT02_UPD_PROG_NM_Enabled ;
   private int edtTBT02_UPD_CNT_Enabled ;
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
   private long Z89TBT02_STUDY_ID ;
   private long Z456TBT02_UPD_CNT ;
   private long O456TBT02_UPD_CNT ;
   private long A89TBT02_STUDY_ID ;
   private long A456TBT02_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBT02_STUDY_ID_Internalname ;
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
   private String lblTextblocktbt02_study_id_Internalname ;
   private String lblTextblocktbt02_study_id_Jsonclick ;
   private String edtTBT02_STUDY_ID_Jsonclick ;
   private String lblTextblocktbt02_subject_id_Internalname ;
   private String lblTextblocktbt02_subject_id_Jsonclick ;
   private String edtTBT02_SUBJECT_ID_Internalname ;
   private String edtTBT02_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbt02_crf_id_Internalname ;
   private String lblTextblocktbt02_crf_id_Jsonclick ;
   private String edtTBT02_CRF_ID_Internalname ;
   private String edtTBT02_CRF_ID_Jsonclick ;
   private String lblTextblocktbt02_crf_eda_no_Internalname ;
   private String lblTextblocktbt02_crf_eda_no_Jsonclick ;
   private String edtTBT02_CRF_EDA_NO_Internalname ;
   private String edtTBT02_CRF_EDA_NO_Jsonclick ;
   private String lblTextblocktbt02_crf_latest_version_Internalname ;
   private String lblTextblocktbt02_crf_latest_version_Jsonclick ;
   private String edtTBT02_CRF_LATEST_VERSION_Internalname ;
   private String edtTBT02_CRF_LATEST_VERSION_Jsonclick ;
   private String lblTextblocktbt02_crf_input_level_Internalname ;
   private String lblTextblocktbt02_crf_input_level_Jsonclick ;
   private String edtTBT02_CRF_INPUT_LEVEL_Internalname ;
   private String edtTBT02_CRF_INPUT_LEVEL_Jsonclick ;
   private String lblTextblocktbt02_lock_flg_Internalname ;
   private String lblTextblocktbt02_lock_flg_Jsonclick ;
   private String edtTBT02_LOCK_FLG_Internalname ;
   private String edtTBT02_LOCK_FLG_Jsonclick ;
   private String lblTextblocktbt02_lock_datetime_Internalname ;
   private String lblTextblocktbt02_lock_datetime_Jsonclick ;
   private String edtTBT02_LOCK_DATETIME_Internalname ;
   private String edtTBT02_LOCK_DATETIME_Jsonclick ;
   private String lblTextblocktbt02_lock_user_id_Internalname ;
   private String lblTextblocktbt02_lock_user_id_Jsonclick ;
   private String edtTBT02_LOCK_USER_ID_Internalname ;
   private String edtTBT02_LOCK_USER_ID_Jsonclick ;
   private String lblTextblocktbt02_lock_auth_cd_Internalname ;
   private String lblTextblocktbt02_lock_auth_cd_Jsonclick ;
   private String edtTBT02_LOCK_AUTH_CD_Internalname ;
   private String edtTBT02_LOCK_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt02_upload_datetime_Internalname ;
   private String lblTextblocktbt02_upload_datetime_Jsonclick ;
   private String edtTBT02_UPLOAD_DATETIME_Internalname ;
   private String edtTBT02_UPLOAD_DATETIME_Jsonclick ;
   private String lblTextblocktbt02_upload_user_id_Internalname ;
   private String lblTextblocktbt02_upload_user_id_Jsonclick ;
   private String edtTBT02_UPLOAD_USER_ID_Internalname ;
   private String edtTBT02_UPLOAD_USER_ID_Jsonclick ;
   private String lblTextblocktbt02_upload_auth_cd_Internalname ;
   private String lblTextblocktbt02_upload_auth_cd_Jsonclick ;
   private String edtTBT02_UPLOAD_AUTH_CD_Internalname ;
   private String edtTBT02_UPLOAD_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt02_dm_arrival_flg_Internalname ;
   private String lblTextblocktbt02_dm_arrival_flg_Jsonclick ;
   private String edtTBT02_DM_ARRIVAL_FLG_Internalname ;
   private String edtTBT02_DM_ARRIVAL_FLG_Jsonclick ;
   private String lblTextblocktbt02_dm_arrival_datetime_Internalname ;
   private String lblTextblocktbt02_dm_arrival_datetime_Jsonclick ;
   private String edtTBT02_DM_ARRIVAL_DATETIME_Internalname ;
   private String edtTBT02_DM_ARRIVAL_DATETIME_Jsonclick ;
   private String lblTextblocktbt02_approval_flg_Internalname ;
   private String lblTextblocktbt02_approval_flg_Jsonclick ;
   private String edtTBT02_APPROVAL_FLG_Internalname ;
   private String edtTBT02_APPROVAL_FLG_Jsonclick ;
   private String lblTextblocktbt02_approval_datetime_Internalname ;
   private String lblTextblocktbt02_approval_datetime_Jsonclick ;
   private String edtTBT02_APPROVAL_DATETIME_Internalname ;
   private String edtTBT02_APPROVAL_DATETIME_Jsonclick ;
   private String lblTextblocktbt02_approval_user_id_Internalname ;
   private String lblTextblocktbt02_approval_user_id_Jsonclick ;
   private String edtTBT02_APPROVAL_USER_ID_Internalname ;
   private String edtTBT02_APPROVAL_USER_ID_Jsonclick ;
   private String lblTextblocktbt02_approval_auth_cd_Internalname ;
   private String lblTextblocktbt02_approval_auth_cd_Jsonclick ;
   private String edtTBT02_APPROVAL_AUTH_CD_Internalname ;
   private String edtTBT02_APPROVAL_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt02_signature_flg_Internalname ;
   private String lblTextblocktbt02_signature_flg_Jsonclick ;
   private String edtTBT02_SIGNATURE_FLG_Internalname ;
   private String edtTBT02_SIGNATURE_FLG_Jsonclick ;
   private String lblTextblocktbt02_signature_datetime_Internalname ;
   private String lblTextblocktbt02_signature_datetime_Jsonclick ;
   private String edtTBT02_SIGNATURE_DATETIME_Internalname ;
   private String edtTBT02_SIGNATURE_DATETIME_Jsonclick ;
   private String lblTextblocktbt02_signature_user_id_Internalname ;
   private String lblTextblocktbt02_signature_user_id_Jsonclick ;
   private String edtTBT02_SIGNATURE_USER_ID_Internalname ;
   private String edtTBT02_SIGNATURE_USER_ID_Jsonclick ;
   private String lblTextblocktbt02_input_end_flg_Internalname ;
   private String lblTextblocktbt02_input_end_flg_Jsonclick ;
   private String edtTBT02_INPUT_END_FLG_Internalname ;
   private String edtTBT02_INPUT_END_FLG_Jsonclick ;
   private String lblTextblocktbt02_input_end_datetime_Internalname ;
   private String lblTextblocktbt02_input_end_datetime_Jsonclick ;
   private String edtTBT02_INPUT_END_DATETIME_Internalname ;
   private String edtTBT02_INPUT_END_DATETIME_Jsonclick ;
   private String lblTextblocktbt02_input_end_user_id_Internalname ;
   private String lblTextblocktbt02_input_end_user_id_Jsonclick ;
   private String edtTBT02_INPUT_END_USER_ID_Internalname ;
   private String edtTBT02_INPUT_END_USER_ID_Jsonclick ;
   private String lblTextblocktbt02_input_end_auth_cd_Internalname ;
   private String lblTextblocktbt02_input_end_auth_cd_Jsonclick ;
   private String edtTBT02_INPUT_END_AUTH_CD_Internalname ;
   private String edtTBT02_INPUT_END_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt02_del_flg_Internalname ;
   private String lblTextblocktbt02_del_flg_Jsonclick ;
   private String edtTBT02_DEL_FLG_Internalname ;
   private String edtTBT02_DEL_FLG_Jsonclick ;
   private String lblTextblocktbt02_crt_datetime_Internalname ;
   private String lblTextblocktbt02_crt_datetime_Jsonclick ;
   private String edtTBT02_CRT_DATETIME_Internalname ;
   private String edtTBT02_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbt02_crt_user_id_Internalname ;
   private String lblTextblocktbt02_crt_user_id_Jsonclick ;
   private String edtTBT02_CRT_USER_ID_Internalname ;
   private String edtTBT02_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbt02_crt_prog_nm_Internalname ;
   private String lblTextblocktbt02_crt_prog_nm_Jsonclick ;
   private String edtTBT02_CRT_PROG_NM_Internalname ;
   private String edtTBT02_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbt02_upd_datetime_Internalname ;
   private String lblTextblocktbt02_upd_datetime_Jsonclick ;
   private String edtTBT02_UPD_DATETIME_Internalname ;
   private String edtTBT02_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbt02_upd_user_id_Internalname ;
   private String lblTextblocktbt02_upd_user_id_Jsonclick ;
   private String edtTBT02_UPD_USER_ID_Internalname ;
   private String edtTBT02_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbt02_upd_prog_nm_Internalname ;
   private String lblTextblocktbt02_upd_prog_nm_Jsonclick ;
   private String edtTBT02_UPD_PROG_NM_Internalname ;
   private String edtTBT02_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbt02_upd_cnt_Internalname ;
   private String lblTextblocktbt02_upd_cnt_Jsonclick ;
   private String edtTBT02_UPD_CNT_Internalname ;
   private String edtTBT02_UPD_CNT_Jsonclick ;
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
   private String AV9Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode55 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z450TBT02_CRT_DATETIME ;
   private java.util.Date Z453TBT02_UPD_DATETIME ;
   private java.util.Date Z649TBT02_LOCK_DATETIME ;
   private java.util.Date Z652TBT02_UPLOAD_DATETIME ;
   private java.util.Date Z656TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z658TBT02_APPROVAL_DATETIME ;
   private java.util.Date Z991TBT02_SIGNATURE_DATETIME ;
   private java.util.Date Z662TBT02_INPUT_END_DATETIME ;
   private java.util.Date A649TBT02_LOCK_DATETIME ;
   private java.util.Date A652TBT02_UPLOAD_DATETIME ;
   private java.util.Date A656TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A658TBT02_APPROVAL_DATETIME ;
   private java.util.Date A991TBT02_SIGNATURE_DATETIME ;
   private java.util.Date A662TBT02_INPUT_END_DATETIME ;
   private java.util.Date A450TBT02_CRT_DATETIME ;
   private java.util.Date A453TBT02_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n498TBT02_CRF_LATEST_VERSION ;
   private boolean n499TBT02_CRF_INPUT_LEVEL ;
   private boolean n648TBT02_LOCK_FLG ;
   private boolean n649TBT02_LOCK_DATETIME ;
   private boolean n650TBT02_LOCK_USER_ID ;
   private boolean n651TBT02_LOCK_AUTH_CD ;
   private boolean n652TBT02_UPLOAD_DATETIME ;
   private boolean n653TBT02_UPLOAD_USER_ID ;
   private boolean n654TBT02_UPLOAD_AUTH_CD ;
   private boolean n655TBT02_DM_ARRIVAL_FLG ;
   private boolean n656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n657TBT02_APPROVAL_FLG ;
   private boolean n658TBT02_APPROVAL_DATETIME ;
   private boolean n659TBT02_APPROVAL_USER_ID ;
   private boolean n660TBT02_APPROVAL_AUTH_CD ;
   private boolean n990TBT02_SIGNATURE_FLG ;
   private boolean n991TBT02_SIGNATURE_DATETIME ;
   private boolean n992TBT02_SIGNATURE_USER_ID ;
   private boolean n661TBT02_INPUT_END_FLG ;
   private boolean n662TBT02_INPUT_END_DATETIME ;
   private boolean n663TBT02_INPUT_END_USER_ID ;
   private boolean n664TBT02_INPUT_END_AUTH_CD ;
   private boolean n449TBT02_DEL_FLG ;
   private boolean n450TBT02_CRT_DATETIME ;
   private boolean n451TBT02_CRT_USER_ID ;
   private boolean n452TBT02_CRT_PROG_NM ;
   private boolean n453TBT02_UPD_DATETIME ;
   private boolean n454TBT02_UPD_USER_ID ;
   private boolean n455TBT02_UPD_PROG_NM ;
   private boolean n456TBT02_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z451TBT02_CRT_USER_ID ;
   private String Z454TBT02_UPD_USER_ID ;
   private String Z648TBT02_LOCK_FLG ;
   private String Z650TBT02_LOCK_USER_ID ;
   private String Z651TBT02_LOCK_AUTH_CD ;
   private String Z653TBT02_UPLOAD_USER_ID ;
   private String Z654TBT02_UPLOAD_AUTH_CD ;
   private String Z655TBT02_DM_ARRIVAL_FLG ;
   private String Z657TBT02_APPROVAL_FLG ;
   private String Z659TBT02_APPROVAL_USER_ID ;
   private String Z660TBT02_APPROVAL_AUTH_CD ;
   private String Z990TBT02_SIGNATURE_FLG ;
   private String Z992TBT02_SIGNATURE_USER_ID ;
   private String Z661TBT02_INPUT_END_FLG ;
   private String Z663TBT02_INPUT_END_USER_ID ;
   private String Z664TBT02_INPUT_END_AUTH_CD ;
   private String Z449TBT02_DEL_FLG ;
   private String Z452TBT02_CRT_PROG_NM ;
   private String Z455TBT02_UPD_PROG_NM ;
   private String A648TBT02_LOCK_FLG ;
   private String A650TBT02_LOCK_USER_ID ;
   private String A651TBT02_LOCK_AUTH_CD ;
   private String A653TBT02_UPLOAD_USER_ID ;
   private String A654TBT02_UPLOAD_AUTH_CD ;
   private String A655TBT02_DM_ARRIVAL_FLG ;
   private String A657TBT02_APPROVAL_FLG ;
   private String A659TBT02_APPROVAL_USER_ID ;
   private String A660TBT02_APPROVAL_AUTH_CD ;
   private String A990TBT02_SIGNATURE_FLG ;
   private String A992TBT02_SIGNATURE_USER_ID ;
   private String A661TBT02_INPUT_END_FLG ;
   private String A663TBT02_INPUT_END_USER_ID ;
   private String A664TBT02_INPUT_END_AUTH_CD ;
   private String A449TBT02_DEL_FLG ;
   private String A451TBT02_CRT_USER_ID ;
   private String A452TBT02_CRT_PROG_NM ;
   private String A454TBT02_UPD_USER_ID ;
   private String A455TBT02_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private short[] T000P5_A91TBT02_CRF_ID ;
   private byte[] T000P5_A935TBT02_CRF_EDA_NO ;
   private java.util.Date[] T000P5_A450TBT02_CRT_DATETIME ;
   private boolean[] T000P5_n450TBT02_CRT_DATETIME ;
   private String[] T000P5_A451TBT02_CRT_USER_ID ;
   private boolean[] T000P5_n451TBT02_CRT_USER_ID ;
   private java.util.Date[] T000P5_A453TBT02_UPD_DATETIME ;
   private boolean[] T000P5_n453TBT02_UPD_DATETIME ;
   private String[] T000P5_A454TBT02_UPD_USER_ID ;
   private boolean[] T000P5_n454TBT02_UPD_USER_ID ;
   private long[] T000P5_A456TBT02_UPD_CNT ;
   private boolean[] T000P5_n456TBT02_UPD_CNT ;
   private short[] T000P5_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] T000P5_n498TBT02_CRF_LATEST_VERSION ;
   private byte[] T000P5_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] T000P5_n499TBT02_CRF_INPUT_LEVEL ;
   private String[] T000P5_A648TBT02_LOCK_FLG ;
   private boolean[] T000P5_n648TBT02_LOCK_FLG ;
   private java.util.Date[] T000P5_A649TBT02_LOCK_DATETIME ;
   private boolean[] T000P5_n649TBT02_LOCK_DATETIME ;
   private String[] T000P5_A650TBT02_LOCK_USER_ID ;
   private boolean[] T000P5_n650TBT02_LOCK_USER_ID ;
   private String[] T000P5_A651TBT02_LOCK_AUTH_CD ;
   private boolean[] T000P5_n651TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] T000P5_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] T000P5_n652TBT02_UPLOAD_DATETIME ;
   private String[] T000P5_A653TBT02_UPLOAD_USER_ID ;
   private boolean[] T000P5_n653TBT02_UPLOAD_USER_ID ;
   private String[] T000P5_A654TBT02_UPLOAD_AUTH_CD ;
   private boolean[] T000P5_n654TBT02_UPLOAD_AUTH_CD ;
   private String[] T000P5_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] T000P5_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000P5_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] T000P5_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] T000P5_A657TBT02_APPROVAL_FLG ;
   private boolean[] T000P5_n657TBT02_APPROVAL_FLG ;
   private java.util.Date[] T000P5_A658TBT02_APPROVAL_DATETIME ;
   private boolean[] T000P5_n658TBT02_APPROVAL_DATETIME ;
   private String[] T000P5_A659TBT02_APPROVAL_USER_ID ;
   private boolean[] T000P5_n659TBT02_APPROVAL_USER_ID ;
   private String[] T000P5_A660TBT02_APPROVAL_AUTH_CD ;
   private boolean[] T000P5_n660TBT02_APPROVAL_AUTH_CD ;
   private String[] T000P5_A990TBT02_SIGNATURE_FLG ;
   private boolean[] T000P5_n990TBT02_SIGNATURE_FLG ;
   private java.util.Date[] T000P5_A991TBT02_SIGNATURE_DATETIME ;
   private boolean[] T000P5_n991TBT02_SIGNATURE_DATETIME ;
   private String[] T000P5_A992TBT02_SIGNATURE_USER_ID ;
   private boolean[] T000P5_n992TBT02_SIGNATURE_USER_ID ;
   private String[] T000P5_A661TBT02_INPUT_END_FLG ;
   private boolean[] T000P5_n661TBT02_INPUT_END_FLG ;
   private java.util.Date[] T000P5_A662TBT02_INPUT_END_DATETIME ;
   private boolean[] T000P5_n662TBT02_INPUT_END_DATETIME ;
   private String[] T000P5_A663TBT02_INPUT_END_USER_ID ;
   private boolean[] T000P5_n663TBT02_INPUT_END_USER_ID ;
   private String[] T000P5_A664TBT02_INPUT_END_AUTH_CD ;
   private boolean[] T000P5_n664TBT02_INPUT_END_AUTH_CD ;
   private String[] T000P5_A449TBT02_DEL_FLG ;
   private boolean[] T000P5_n449TBT02_DEL_FLG ;
   private String[] T000P5_A452TBT02_CRT_PROG_NM ;
   private boolean[] T000P5_n452TBT02_CRT_PROG_NM ;
   private String[] T000P5_A455TBT02_UPD_PROG_NM ;
   private boolean[] T000P5_n455TBT02_UPD_PROG_NM ;
   private long[] T000P5_A89TBT02_STUDY_ID ;
   private int[] T000P5_A90TBT02_SUBJECT_ID ;
   private long[] T000P4_A89TBT02_STUDY_ID ;
   private long[] T000P6_A89TBT02_STUDY_ID ;
   private int[] T000P6_A90TBT02_SUBJECT_ID ;
   private short[] T000P6_A91TBT02_CRF_ID ;
   private byte[] T000P6_A935TBT02_CRF_EDA_NO ;
   private short[] T000P3_A91TBT02_CRF_ID ;
   private byte[] T000P3_A935TBT02_CRF_EDA_NO ;
   private java.util.Date[] T000P3_A450TBT02_CRT_DATETIME ;
   private boolean[] T000P3_n450TBT02_CRT_DATETIME ;
   private String[] T000P3_A451TBT02_CRT_USER_ID ;
   private boolean[] T000P3_n451TBT02_CRT_USER_ID ;
   private java.util.Date[] T000P3_A453TBT02_UPD_DATETIME ;
   private boolean[] T000P3_n453TBT02_UPD_DATETIME ;
   private String[] T000P3_A454TBT02_UPD_USER_ID ;
   private boolean[] T000P3_n454TBT02_UPD_USER_ID ;
   private long[] T000P3_A456TBT02_UPD_CNT ;
   private boolean[] T000P3_n456TBT02_UPD_CNT ;
   private short[] T000P3_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] T000P3_n498TBT02_CRF_LATEST_VERSION ;
   private byte[] T000P3_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] T000P3_n499TBT02_CRF_INPUT_LEVEL ;
   private String[] T000P3_A648TBT02_LOCK_FLG ;
   private boolean[] T000P3_n648TBT02_LOCK_FLG ;
   private java.util.Date[] T000P3_A649TBT02_LOCK_DATETIME ;
   private boolean[] T000P3_n649TBT02_LOCK_DATETIME ;
   private String[] T000P3_A650TBT02_LOCK_USER_ID ;
   private boolean[] T000P3_n650TBT02_LOCK_USER_ID ;
   private String[] T000P3_A651TBT02_LOCK_AUTH_CD ;
   private boolean[] T000P3_n651TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] T000P3_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] T000P3_n652TBT02_UPLOAD_DATETIME ;
   private String[] T000P3_A653TBT02_UPLOAD_USER_ID ;
   private boolean[] T000P3_n653TBT02_UPLOAD_USER_ID ;
   private String[] T000P3_A654TBT02_UPLOAD_AUTH_CD ;
   private boolean[] T000P3_n654TBT02_UPLOAD_AUTH_CD ;
   private String[] T000P3_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] T000P3_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000P3_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] T000P3_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] T000P3_A657TBT02_APPROVAL_FLG ;
   private boolean[] T000P3_n657TBT02_APPROVAL_FLG ;
   private java.util.Date[] T000P3_A658TBT02_APPROVAL_DATETIME ;
   private boolean[] T000P3_n658TBT02_APPROVAL_DATETIME ;
   private String[] T000P3_A659TBT02_APPROVAL_USER_ID ;
   private boolean[] T000P3_n659TBT02_APPROVAL_USER_ID ;
   private String[] T000P3_A660TBT02_APPROVAL_AUTH_CD ;
   private boolean[] T000P3_n660TBT02_APPROVAL_AUTH_CD ;
   private String[] T000P3_A990TBT02_SIGNATURE_FLG ;
   private boolean[] T000P3_n990TBT02_SIGNATURE_FLG ;
   private java.util.Date[] T000P3_A991TBT02_SIGNATURE_DATETIME ;
   private boolean[] T000P3_n991TBT02_SIGNATURE_DATETIME ;
   private String[] T000P3_A992TBT02_SIGNATURE_USER_ID ;
   private boolean[] T000P3_n992TBT02_SIGNATURE_USER_ID ;
   private String[] T000P3_A661TBT02_INPUT_END_FLG ;
   private boolean[] T000P3_n661TBT02_INPUT_END_FLG ;
   private java.util.Date[] T000P3_A662TBT02_INPUT_END_DATETIME ;
   private boolean[] T000P3_n662TBT02_INPUT_END_DATETIME ;
   private String[] T000P3_A663TBT02_INPUT_END_USER_ID ;
   private boolean[] T000P3_n663TBT02_INPUT_END_USER_ID ;
   private String[] T000P3_A664TBT02_INPUT_END_AUTH_CD ;
   private boolean[] T000P3_n664TBT02_INPUT_END_AUTH_CD ;
   private String[] T000P3_A449TBT02_DEL_FLG ;
   private boolean[] T000P3_n449TBT02_DEL_FLG ;
   private String[] T000P3_A452TBT02_CRT_PROG_NM ;
   private boolean[] T000P3_n452TBT02_CRT_PROG_NM ;
   private String[] T000P3_A455TBT02_UPD_PROG_NM ;
   private boolean[] T000P3_n455TBT02_UPD_PROG_NM ;
   private long[] T000P3_A89TBT02_STUDY_ID ;
   private int[] T000P3_A90TBT02_SUBJECT_ID ;
   private long[] T000P7_A89TBT02_STUDY_ID ;
   private int[] T000P7_A90TBT02_SUBJECT_ID ;
   private short[] T000P7_A91TBT02_CRF_ID ;
   private byte[] T000P7_A935TBT02_CRF_EDA_NO ;
   private long[] T000P8_A89TBT02_STUDY_ID ;
   private int[] T000P8_A90TBT02_SUBJECT_ID ;
   private short[] T000P8_A91TBT02_CRF_ID ;
   private byte[] T000P8_A935TBT02_CRF_EDA_NO ;
   private short[] T000P2_A91TBT02_CRF_ID ;
   private byte[] T000P2_A935TBT02_CRF_EDA_NO ;
   private java.util.Date[] T000P2_A450TBT02_CRT_DATETIME ;
   private boolean[] T000P2_n450TBT02_CRT_DATETIME ;
   private String[] T000P2_A451TBT02_CRT_USER_ID ;
   private boolean[] T000P2_n451TBT02_CRT_USER_ID ;
   private java.util.Date[] T000P2_A453TBT02_UPD_DATETIME ;
   private boolean[] T000P2_n453TBT02_UPD_DATETIME ;
   private String[] T000P2_A454TBT02_UPD_USER_ID ;
   private boolean[] T000P2_n454TBT02_UPD_USER_ID ;
   private long[] T000P2_A456TBT02_UPD_CNT ;
   private boolean[] T000P2_n456TBT02_UPD_CNT ;
   private short[] T000P2_A498TBT02_CRF_LATEST_VERSION ;
   private boolean[] T000P2_n498TBT02_CRF_LATEST_VERSION ;
   private byte[] T000P2_A499TBT02_CRF_INPUT_LEVEL ;
   private boolean[] T000P2_n499TBT02_CRF_INPUT_LEVEL ;
   private String[] T000P2_A648TBT02_LOCK_FLG ;
   private boolean[] T000P2_n648TBT02_LOCK_FLG ;
   private java.util.Date[] T000P2_A649TBT02_LOCK_DATETIME ;
   private boolean[] T000P2_n649TBT02_LOCK_DATETIME ;
   private String[] T000P2_A650TBT02_LOCK_USER_ID ;
   private boolean[] T000P2_n650TBT02_LOCK_USER_ID ;
   private String[] T000P2_A651TBT02_LOCK_AUTH_CD ;
   private boolean[] T000P2_n651TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] T000P2_A652TBT02_UPLOAD_DATETIME ;
   private boolean[] T000P2_n652TBT02_UPLOAD_DATETIME ;
   private String[] T000P2_A653TBT02_UPLOAD_USER_ID ;
   private boolean[] T000P2_n653TBT02_UPLOAD_USER_ID ;
   private String[] T000P2_A654TBT02_UPLOAD_AUTH_CD ;
   private boolean[] T000P2_n654TBT02_UPLOAD_AUTH_CD ;
   private String[] T000P2_A655TBT02_DM_ARRIVAL_FLG ;
   private boolean[] T000P2_n655TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000P2_A656TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] T000P2_n656TBT02_DM_ARRIVAL_DATETIME ;
   private String[] T000P2_A657TBT02_APPROVAL_FLG ;
   private boolean[] T000P2_n657TBT02_APPROVAL_FLG ;
   private java.util.Date[] T000P2_A658TBT02_APPROVAL_DATETIME ;
   private boolean[] T000P2_n658TBT02_APPROVAL_DATETIME ;
   private String[] T000P2_A659TBT02_APPROVAL_USER_ID ;
   private boolean[] T000P2_n659TBT02_APPROVAL_USER_ID ;
   private String[] T000P2_A660TBT02_APPROVAL_AUTH_CD ;
   private boolean[] T000P2_n660TBT02_APPROVAL_AUTH_CD ;
   private String[] T000P2_A990TBT02_SIGNATURE_FLG ;
   private boolean[] T000P2_n990TBT02_SIGNATURE_FLG ;
   private java.util.Date[] T000P2_A991TBT02_SIGNATURE_DATETIME ;
   private boolean[] T000P2_n991TBT02_SIGNATURE_DATETIME ;
   private String[] T000P2_A992TBT02_SIGNATURE_USER_ID ;
   private boolean[] T000P2_n992TBT02_SIGNATURE_USER_ID ;
   private String[] T000P2_A661TBT02_INPUT_END_FLG ;
   private boolean[] T000P2_n661TBT02_INPUT_END_FLG ;
   private java.util.Date[] T000P2_A662TBT02_INPUT_END_DATETIME ;
   private boolean[] T000P2_n662TBT02_INPUT_END_DATETIME ;
   private String[] T000P2_A663TBT02_INPUT_END_USER_ID ;
   private boolean[] T000P2_n663TBT02_INPUT_END_USER_ID ;
   private String[] T000P2_A664TBT02_INPUT_END_AUTH_CD ;
   private boolean[] T000P2_n664TBT02_INPUT_END_AUTH_CD ;
   private String[] T000P2_A449TBT02_DEL_FLG ;
   private boolean[] T000P2_n449TBT02_DEL_FLG ;
   private String[] T000P2_A452TBT02_CRT_PROG_NM ;
   private boolean[] T000P2_n452TBT02_CRT_PROG_NM ;
   private String[] T000P2_A455TBT02_UPD_PROG_NM ;
   private boolean[] T000P2_n455TBT02_UPD_PROG_NM ;
   private long[] T000P2_A89TBT02_STUDY_ID ;
   private int[] T000P2_A90TBT02_SUBJECT_ID ;
   private long[] T000P12_A89TBT02_STUDY_ID ;
   private int[] T000P12_A90TBT02_SUBJECT_ID ;
   private short[] T000P12_A91TBT02_CRF_ID ;
   private byte[] T000P12_A935TBT02_CRF_EDA_NO ;
   private long[] T000P13_A89TBT02_STUDY_ID ;
}

final  class tbt02_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000P2", "SELECT `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_SIGNATURE_FLG`, `TBT02_SIGNATURE_DATETIME`, `TBT02_SIGNATURE_USER_ID`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P3", "SELECT `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_SIGNATURE_FLG`, `TBT02_SIGNATURE_DATETIME`, `TBT02_SIGNATURE_USER_ID`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P4", "SELECT `TBT01_STUDY_ID` AS TBT02_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P5", "SELECT TM1.`TBT02_CRF_ID`, TM1.`TBT02_CRF_EDA_NO`, TM1.`TBT02_CRT_DATETIME`, TM1.`TBT02_CRT_USER_ID`, TM1.`TBT02_UPD_DATETIME`, TM1.`TBT02_UPD_USER_ID`, TM1.`TBT02_UPD_CNT`, TM1.`TBT02_CRF_LATEST_VERSION`, TM1.`TBT02_CRF_INPUT_LEVEL`, TM1.`TBT02_LOCK_FLG`, TM1.`TBT02_LOCK_DATETIME`, TM1.`TBT02_LOCK_USER_ID`, TM1.`TBT02_LOCK_AUTH_CD`, TM1.`TBT02_UPLOAD_DATETIME`, TM1.`TBT02_UPLOAD_USER_ID`, TM1.`TBT02_UPLOAD_AUTH_CD`, TM1.`TBT02_DM_ARRIVAL_FLG`, TM1.`TBT02_DM_ARRIVAL_DATETIME`, TM1.`TBT02_APPROVAL_FLG`, TM1.`TBT02_APPROVAL_DATETIME`, TM1.`TBT02_APPROVAL_USER_ID`, TM1.`TBT02_APPROVAL_AUTH_CD`, TM1.`TBT02_SIGNATURE_FLG`, TM1.`TBT02_SIGNATURE_DATETIME`, TM1.`TBT02_SIGNATURE_USER_ID`, TM1.`TBT02_INPUT_END_FLG`, TM1.`TBT02_INPUT_END_DATETIME`, TM1.`TBT02_INPUT_END_USER_ID`, TM1.`TBT02_INPUT_END_AUTH_CD`, TM1.`TBT02_DEL_FLG`, TM1.`TBT02_CRT_PROG_NM`, TM1.`TBT02_UPD_PROG_NM`, TM1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID, TM1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` TM1 WHERE TM1.`TBT02_STUDY_ID` = ? and TM1.`TBT02_SUBJECT_ID` = ? and TM1.`TBT02_CRF_ID` = ? and TM1.`TBT02_CRF_EDA_NO` = ? ORDER BY TM1.`TBT02_STUDY_ID`, TM1.`TBT02_SUBJECT_ID`, TM1.`TBT02_CRF_ID`, TM1.`TBT02_CRF_EDA_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000P6", "SELECT `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P7", "SELECT `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` FROM `TBT02_CRF` WHERE ( `TBT02_STUDY_ID` > ? or `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` > ? or `TBT02_SUBJECT_ID` = ? and `TBT02_STUDY_ID` = ? and `TBT02_CRF_ID` > ? or `TBT02_CRF_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_STUDY_ID` = ? and `TBT02_CRF_EDA_NO` > ?) ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000P8", "SELECT `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` FROM `TBT02_CRF` WHERE ( `TBT02_STUDY_ID` < ? or `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` < ? or `TBT02_SUBJECT_ID` = ? and `TBT02_STUDY_ID` = ? and `TBT02_CRF_ID` < ? or `TBT02_CRF_ID` = ? and `TBT02_SUBJECT_ID` = ? and `TBT02_STUDY_ID` = ? and `TBT02_CRF_EDA_NO` < ?) ORDER BY `TBT02_STUDY_ID` DESC, `TBT02_SUBJECT_ID` DESC, `TBT02_CRF_ID` DESC, `TBT02_CRF_EDA_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000P9", "INSERT INTO `TBT02_CRF`(`TBT02_CRF_ID`, `TBT02_CRF_EDA_NO`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_SIGNATURE_FLG`, `TBT02_SIGNATURE_DATETIME`, `TBT02_SIGNATURE_USER_ID`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000P10", "UPDATE `TBT02_CRF` SET `TBT02_CRT_DATETIME`=?, `TBT02_CRT_USER_ID`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_CNT`=?, `TBT02_CRF_LATEST_VERSION`=?, `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_LOCK_FLG`=?, `TBT02_LOCK_DATETIME`=?, `TBT02_LOCK_USER_ID`=?, `TBT02_LOCK_AUTH_CD`=?, `TBT02_UPLOAD_DATETIME`=?, `TBT02_UPLOAD_USER_ID`=?, `TBT02_UPLOAD_AUTH_CD`=?, `TBT02_DM_ARRIVAL_FLG`=?, `TBT02_DM_ARRIVAL_DATETIME`=?, `TBT02_APPROVAL_FLG`=?, `TBT02_APPROVAL_DATETIME`=?, `TBT02_APPROVAL_USER_ID`=?, `TBT02_APPROVAL_AUTH_CD`=?, `TBT02_SIGNATURE_FLG`=?, `TBT02_SIGNATURE_DATETIME`=?, `TBT02_SIGNATURE_USER_ID`=?, `TBT02_INPUT_END_FLG`=?, `TBT02_INPUT_END_DATETIME`=?, `TBT02_INPUT_END_USER_ID`=?, `TBT02_INPUT_END_AUTH_CD`=?, `TBT02_DEL_FLG`=?, `TBT02_CRT_PROG_NM`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T000P11", "DELETE FROM `TBT02_CRF`  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? AND `TBT02_CRF_EDA_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T000P12", "SELECT `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` FROM `TBT02_CRF` ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`, `TBT02_CRF_EDA_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000P13", "SELECT `TBT01_STUDY_ID` AS TBT02_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(20) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDateTime(27) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((long[]) buf[62])[0] = rslt.getLong(33) ;
               ((int[]) buf[63])[0] = rslt.getInt(34) ;
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(20) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDateTime(27) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((long[]) buf[62])[0] = rslt.getLong(33) ;
               ((int[]) buf[63])[0] = rslt.getInt(34) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((byte[]) buf[1])[0] = rslt.getByte(2) ;
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((long[]) buf[10])[0] = rslt.getLong(7) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[18])[0] = rslt.getGXDateTime(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[24])[0] = rslt.getGXDateTime(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[31])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[32])[0] = rslt.getGXDateTime(18) ;
               ((boolean[]) buf[33])[0] = rslt.wasNull();
               ((String[]) buf[34])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[35])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[36])[0] = rslt.getGXDateTime(20) ;
               ((boolean[]) buf[37])[0] = rslt.wasNull();
               ((String[]) buf[38])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[39])[0] = rslt.wasNull();
               ((String[]) buf[40])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[41])[0] = rslt.wasNull();
               ((String[]) buf[42])[0] = rslt.getVarchar(23) ;
               ((boolean[]) buf[43])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[44])[0] = rslt.getGXDateTime(24) ;
               ((boolean[]) buf[45])[0] = rslt.wasNull();
               ((String[]) buf[46])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[47])[0] = rslt.wasNull();
               ((String[]) buf[48])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[50])[0] = rslt.getGXDateTime(27) ;
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((String[]) buf[54])[0] = rslt.getVarchar(29) ;
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getVarchar(30) ;
               ((boolean[]) buf[57])[0] = rslt.wasNull();
               ((String[]) buf[58])[0] = rslt.getVarchar(31) ;
               ((boolean[]) buf[59])[0] = rslt.wasNull();
               ((String[]) buf[60])[0] = rslt.getVarchar(32) ;
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((long[]) buf[62])[0] = rslt.getLong(33) ;
               ((int[]) buf[63])[0] = rslt.getInt(34) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((byte[]) buf[3])[0] = rslt.getByte(4) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
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
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               stmt.setShort(7, ((Number) parms[6]).shortValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setByte(10, ((Number) parms[9]).byteValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(3, (java.util.Date)parms[3], false);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[5], 128);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[7], false);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[9], 128);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(7, ((Number) parms[11]).longValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(9, ((Number) parms[15]).byteValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(11, (java.util.Date)parms[19], false);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[21], 128);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(14, (java.util.Date)parms[25], false);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[27], 128);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[29], 2);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[31], 1);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[33], false);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(20, (java.util.Date)parms[37], false);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[39], 128);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[41], 2);
               }
               if ( ((Boolean) parms[42]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[43], 1);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(24, (java.util.Date)parms[45], false);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[47], 128);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(27, (java.util.Date)parms[51], false);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[53], 128);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[55], 2);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[57], 1);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 31 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(31, (String)parms[59], 40);
               }
               if ( ((Boolean) parms[60]).booleanValue() )
               {
                  stmt.setNull( 32 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(32, (String)parms[61], 40);
               }
               stmt.setLong(33, ((Number) parms[62]).longValue());
               stmt.setInt(34, ((Number) parms[63]).intValue());
               return;
            case 8 :
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
                  stmt.setShort(6, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 1);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(9, (java.util.Date)parms[17], false);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 128);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 2);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(12, (java.util.Date)parms[23], false);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 128);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 2);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 1);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[31], false);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[35], false);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 128);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 2);
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
                  stmt.setNull( 22 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(22, (java.util.Date)parms[43], false);
               }
               if ( ((Boolean) parms[44]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(23, (String)parms[45], 128);
               }
               if ( ((Boolean) parms[46]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[47], 1);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(25, (java.util.Date)parms[49], false);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 128);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 2);
               }
               if ( ((Boolean) parms[54]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[55], 1);
               }
               if ( ((Boolean) parms[56]).booleanValue() )
               {
                  stmt.setNull( 29 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(29, (String)parms[57], 40);
               }
               if ( ((Boolean) parms[58]).booleanValue() )
               {
                  stmt.setNull( 30 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(30, (String)parms[59], 40);
               }
               stmt.setLong(31, ((Number) parms[60]).longValue());
               stmt.setInt(32, ((Number) parms[61]).intValue());
               stmt.setShort(33, ((Number) parms[62]).shortValue());
               stmt.setByte(34, ((Number) parms[63]).byteValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               return;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

