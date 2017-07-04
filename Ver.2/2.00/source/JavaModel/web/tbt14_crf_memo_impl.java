/*
               File: tbt14_crf_memo_impl
        Description: CRFメモテーブル
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:15:13.72
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt14_crf_memo_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBT14_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbt14_crt_user_id0S27( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBT14_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbt14_upd_user_id0S27( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A140TBT14_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
         A142TBT14_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A140TBT14_STUDY_ID, A142TBT14_SUBJECT_ID) ;
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
         Form.getMeta().addItem("description", "CRFメモテーブル", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbt14_crf_memo_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt14_crf_memo_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt14_crf_memo_impl.class ));
   }

   public tbt14_crf_memo_impl( int remoteHandle ,
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
         wb_table1_2_0S27( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0S27e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0S27( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0S27( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0S27( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0S27e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRFメモテーブル", 1, 0, "px", 0, "px", "Group", "", "HLP_TBT14_CRF_MEMO.htm");
         wb_table3_28_0S27( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0S27e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0S27e( true) ;
      }
      else
      {
         wb_table1_2_0S27e( false) ;
      }
   }

   public void wb_table3_28_0S27( boolean wbgen )
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
         wb_table4_34_0S27( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0S27e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 152,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT14_CRF_MEMO.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT14_CRF_MEMO.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0S27e( true) ;
      }
      else
      {
         wb_table3_28_0S27e( false) ;
      }
   }

   public void wb_table4_34_0S27( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_study_id_Internalname, "試験ID", "", "", lblTextblocktbt14_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A140TBT14_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBT14_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A140TBT14_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A140TBT14_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_subject_id_Internalname, "患者ID", "", "", lblTextblocktbt14_subject_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A142TBT14_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBT14_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A142TBT14_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A142TBT14_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_SUBJECT_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_SUBJECT_ID_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_SUBJECT_ID", "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_memo_no_Internalname, "メモ番号", "", "", lblTextblocktbt14_memo_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_MEMO_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A198TBT14_MEMO_NO, (byte)(3), (byte)(0), ".", "")), ((edtTBT14_MEMO_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198TBT14_MEMO_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A198TBT14_MEMO_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_MEMO_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_MEMO_NO_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crf_id_Internalname, "CRFID", "", "", lblTextblocktbt14_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A474TBT14_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBT14_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A474TBT14_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A474TBT14_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crf_eda_no_Internalname, "CRF枝番", "", "", lblTextblocktbt14_crf_eda_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRF_EDA_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A941TBT14_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")), ((edtTBT14_CRF_EDA_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A941TBT14_CRF_EDA_NO), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A941TBT14_CRF_EDA_NO), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_CRF_EDA_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_CRF_EDA_NO_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crf_version_Internalname, "CRF更新バージョン", "", "", lblTextblocktbt14_crf_version_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRF_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A475TBT14_CRF_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBT14_CRF_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A475TBT14_CRF_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A475TBT14_CRF_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_CRF_VERSION_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_CRF_VERSION_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_VERSION", "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_memo_kbn_Internalname, "2:連絡メモ）", "", "", lblTextblocktbt14_memo_kbn_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_MEMO_KBN_Internalname, GXutil.rtrim( A901TBT14_MEMO_KBN), GXutil.rtrim( localUtil.format( A901TBT14_MEMO_KBN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_MEMO_KBN_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_MEMO_KBN_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_memo_Internalname, "メモ", "", "", lblTextblocktbt14_memo_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT14_MEMO_Internalname, GXutil.rtrim( A477TBT14_MEMO), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", (short)(0), 1, edtTBT14_MEMO_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, "", "", (byte)(-1), true, "", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_request_site_id_Internalname, "ID", "", "", lblTextblocktbt14_request_site_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_REQUEST_SITE_ID_Internalname, GXutil.rtrim( A929TBT14_REQUEST_SITE_ID), GXutil.rtrim( localUtil.format( A929TBT14_REQUEST_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_REQUEST_SITE_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_REQUEST_SITE_ID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SITE_ID", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_request_auth_cd_Internalname, "連絡先権限コード", "", "", lblTextblocktbt14_request_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_REQUEST_AUTH_CD_Internalname, GXutil.rtrim( A930TBT14_REQUEST_AUTH_CD), GXutil.rtrim( localUtil.format( A930TBT14_REQUEST_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_REQUEST_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_REQUEST_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crt_auth_cd_Internalname, "作成者権限コード", "", "", lblTextblocktbt14_crt_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRT_AUTH_CD_Internalname, GXutil.rtrim( A931TBT14_CRT_AUTH_CD), GXutil.rtrim( localUtil.format( A931TBT14_CRT_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_CRT_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_CRT_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_kakunin_flg_Internalname, "確認フラグ", "", "", lblTextblocktbt14_kakunin_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_KAKUNIN_FLG_Internalname, GXutil.rtrim( A927TBT14_KAKUNIN_FLG), GXutil.rtrim( localUtil.format( A927TBT14_KAKUNIN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_KAKUNIN_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_KAKUNIN_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_kakunin_user_id_Internalname, "ID", "", "", lblTextblocktbt14_kakunin_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_KAKUNIN_USER_ID_Internalname, GXutil.rtrim( A928TBT14_KAKUNIN_USER_ID), GXutil.rtrim( localUtil.format( A928TBT14_KAKUNIN_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_KAKUNIN_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_KAKUNIN_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_kakunin_comment_Internalname, "確認コメント", "", "", lblTextblocktbt14_kakunin_comment_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT14_KAKUNIN_COMMENT_Internalname, GXutil.rtrim( A934TBT14_KAKUNIN_COMMENT), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(104);\"", (short)(0), 1, edtTBT14_KAKUNIN_COMMENT_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "2000", -1, "", "", (byte)(-1), true, "", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_kanryo_flg_Internalname, "完了フラグ", "", "", lblTextblocktbt14_kanryo_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_KANRYO_FLG_Internalname, GXutil.rtrim( A902TBT14_KANRYO_FLG), GXutil.rtrim( localUtil.format( A902TBT14_KANRYO_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_KANRYO_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_KANRYO_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt14_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_DEL_FLG_Internalname, GXutil.rtrim( A479TBT14_DEL_FLG), GXutil.rtrim( localUtil.format( A479TBT14_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt14_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT14_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRT_DATETIME_Internalname, localUtil.format(A480TBT14_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A480TBT14_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT14_CRF_MEMO.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT14_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT14_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbt14_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRT_USER_ID_Internalname, GXutil.rtrim( A481TBT14_CRT_USER_ID), GXutil.rtrim( localUtil.format( A481TBT14_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt14_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRT_PROG_NM_Internalname, GXutil.rtrim( A482TBT14_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A482TBT14_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt14_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBT14_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_UPD_DATETIME_Internalname, localUtil.format(A483TBT14_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A483TBT14_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBT14_CRF_MEMO.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT14_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBT14_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbt14_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_UPD_USER_ID_Internalname, GXutil.rtrim( A484TBT14_UPD_USER_ID), GXutil.rtrim( localUtil.format( A484TBT14_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt14_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_UPD_PROG_NM_Internalname, GXutil.rtrim( A485TBT14_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A485TBT14_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt14_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A486TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT14_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A486TBT14_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A486TBT14_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBT14_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBT14_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0S27e( true) ;
      }
      else
      {
         wb_table4_34_0S27e( false) ;
      }
   }

   public void wb_table2_5_0S27( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBT14_CRF_MEMO.htm");
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
         wb_table2_5_0S27e( true) ;
      }
      else
      {
         wb_table2_5_0S27e( false) ;
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
      /* Execute user event: e110S2 */
      e110S2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A140TBT14_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
            }
            else
            {
               A140TBT14_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBT14_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A142TBT14_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A142TBT14_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBT14_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_MEMO_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_MEMO_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_MEMO_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_MEMO_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A198TBT14_MEMO_NO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A198TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)));
            }
            else
            {
               A198TBT14_MEMO_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT14_MEMO_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A198TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A474TBT14_CRF_ID = (short)(0) ;
               n474TBT14_CRF_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A474TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A474TBT14_CRF_ID, 4, 0)));
            }
            else
            {
               A474TBT14_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_ID_Internalname), ".", ",")) ;
               n474TBT14_CRF_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A474TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A474TBT14_CRF_ID, 4, 0)));
            }
            n474TBT14_CRF_ID = ((0==A474TBT14_CRF_ID) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_EDA_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_EDA_NO_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_CRF_EDA_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_CRF_EDA_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A941TBT14_CRF_EDA_NO = (byte)(0) ;
               n941TBT14_CRF_EDA_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A941TBT14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A941TBT14_CRF_EDA_NO, 2, 0)));
            }
            else
            {
               A941TBT14_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_EDA_NO_Internalname), ".", ",")) ;
               n941TBT14_CRF_EDA_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A941TBT14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A941TBT14_CRF_EDA_NO, 2, 0)));
            }
            n941TBT14_CRF_EDA_NO = ((0==A941TBT14_CRF_EDA_NO) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_CRF_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_CRF_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A475TBT14_CRF_VERSION = (short)(0) ;
               n475TBT14_CRF_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A475TBT14_CRF_VERSION", GXutil.ltrim( GXutil.str( A475TBT14_CRF_VERSION, 4, 0)));
            }
            else
            {
               A475TBT14_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_VERSION_Internalname), ".", ",")) ;
               n475TBT14_CRF_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A475TBT14_CRF_VERSION", GXutil.ltrim( GXutil.str( A475TBT14_CRF_VERSION, 4, 0)));
            }
            n475TBT14_CRF_VERSION = ((0==A475TBT14_CRF_VERSION) ? true : false) ;
            A901TBT14_MEMO_KBN = httpContext.cgiGet( edtTBT14_MEMO_KBN_Internalname) ;
            n901TBT14_MEMO_KBN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A901TBT14_MEMO_KBN", A901TBT14_MEMO_KBN);
            n901TBT14_MEMO_KBN = ((GXutil.strcmp("", A901TBT14_MEMO_KBN)==0) ? true : false) ;
            A477TBT14_MEMO = httpContext.cgiGet( edtTBT14_MEMO_Internalname) ;
            n477TBT14_MEMO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A477TBT14_MEMO", A477TBT14_MEMO);
            n477TBT14_MEMO = ((GXutil.strcmp("", A477TBT14_MEMO)==0) ? true : false) ;
            A929TBT14_REQUEST_SITE_ID = httpContext.cgiGet( edtTBT14_REQUEST_SITE_ID_Internalname) ;
            n929TBT14_REQUEST_SITE_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_SITE_ID", A929TBT14_REQUEST_SITE_ID);
            n929TBT14_REQUEST_SITE_ID = ((GXutil.strcmp("", A929TBT14_REQUEST_SITE_ID)==0) ? true : false) ;
            A930TBT14_REQUEST_AUTH_CD = httpContext.cgiGet( edtTBT14_REQUEST_AUTH_CD_Internalname) ;
            n930TBT14_REQUEST_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_REQUEST_AUTH_CD", A930TBT14_REQUEST_AUTH_CD);
            n930TBT14_REQUEST_AUTH_CD = ((GXutil.strcmp("", A930TBT14_REQUEST_AUTH_CD)==0) ? true : false) ;
            A931TBT14_CRT_AUTH_CD = httpContext.cgiGet( edtTBT14_CRT_AUTH_CD_Internalname) ;
            n931TBT14_CRT_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A931TBT14_CRT_AUTH_CD", A931TBT14_CRT_AUTH_CD);
            n931TBT14_CRT_AUTH_CD = ((GXutil.strcmp("", A931TBT14_CRT_AUTH_CD)==0) ? true : false) ;
            A927TBT14_KAKUNIN_FLG = httpContext.cgiGet( edtTBT14_KAKUNIN_FLG_Internalname) ;
            n927TBT14_KAKUNIN_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
            n927TBT14_KAKUNIN_FLG = ((GXutil.strcmp("", A927TBT14_KAKUNIN_FLG)==0) ? true : false) ;
            A928TBT14_KAKUNIN_USER_ID = httpContext.cgiGet( edtTBT14_KAKUNIN_USER_ID_Internalname) ;
            n928TBT14_KAKUNIN_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_KAKUNIN_USER_ID", A928TBT14_KAKUNIN_USER_ID);
            n928TBT14_KAKUNIN_USER_ID = ((GXutil.strcmp("", A928TBT14_KAKUNIN_USER_ID)==0) ? true : false) ;
            A934TBT14_KAKUNIN_COMMENT = httpContext.cgiGet( edtTBT14_KAKUNIN_COMMENT_Internalname) ;
            n934TBT14_KAKUNIN_COMMENT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A934TBT14_KAKUNIN_COMMENT", A934TBT14_KAKUNIN_COMMENT);
            n934TBT14_KAKUNIN_COMMENT = ((GXutil.strcmp("", A934TBT14_KAKUNIN_COMMENT)==0) ? true : false) ;
            A902TBT14_KANRYO_FLG = httpContext.cgiGet( edtTBT14_KANRYO_FLG_Internalname) ;
            n902TBT14_KANRYO_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A902TBT14_KANRYO_FLG", A902TBT14_KANRYO_FLG);
            n902TBT14_KANRYO_FLG = ((GXutil.strcmp("", A902TBT14_KANRYO_FLG)==0) ? true : false) ;
            A479TBT14_DEL_FLG = httpContext.cgiGet( edtTBT14_DEL_FLG_Internalname) ;
            n479TBT14_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A479TBT14_DEL_FLG", A479TBT14_DEL_FLG);
            n479TBT14_DEL_FLG = ((GXutil.strcmp("", A479TBT14_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT14_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT14_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n480TBT14_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A480TBT14_CRT_DATETIME", localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A480TBT14_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT14_CRT_DATETIME_Internalname)) ;
               n480TBT14_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A480TBT14_CRT_DATETIME", localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n480TBT14_CRT_DATETIME = (GXutil.nullDate().equals(A480TBT14_CRT_DATETIME) ? true : false) ;
            A481TBT14_CRT_USER_ID = httpContext.cgiGet( edtTBT14_CRT_USER_ID_Internalname) ;
            n481TBT14_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A481TBT14_CRT_USER_ID", A481TBT14_CRT_USER_ID);
            n481TBT14_CRT_USER_ID = ((GXutil.strcmp("", A481TBT14_CRT_USER_ID)==0) ? true : false) ;
            A482TBT14_CRT_PROG_NM = httpContext.cgiGet( edtTBT14_CRT_PROG_NM_Internalname) ;
            n482TBT14_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A482TBT14_CRT_PROG_NM", A482TBT14_CRT_PROG_NM);
            n482TBT14_CRT_PROG_NM = ((GXutil.strcmp("", A482TBT14_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT14_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBT14_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A483TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n483TBT14_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A483TBT14_UPD_DATETIME", localUtil.ttoc( A483TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A483TBT14_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT14_UPD_DATETIME_Internalname)) ;
               n483TBT14_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A483TBT14_UPD_DATETIME", localUtil.ttoc( A483TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n483TBT14_UPD_DATETIME = (GXutil.nullDate().equals(A483TBT14_UPD_DATETIME) ? true : false) ;
            A484TBT14_UPD_USER_ID = httpContext.cgiGet( edtTBT14_UPD_USER_ID_Internalname) ;
            n484TBT14_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A484TBT14_UPD_USER_ID", A484TBT14_UPD_USER_ID);
            n484TBT14_UPD_USER_ID = ((GXutil.strcmp("", A484TBT14_UPD_USER_ID)==0) ? true : false) ;
            A485TBT14_UPD_PROG_NM = httpContext.cgiGet( edtTBT14_UPD_PROG_NM_Internalname) ;
            n485TBT14_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A485TBT14_UPD_PROG_NM", A485TBT14_UPD_PROG_NM);
            n485TBT14_UPD_PROG_NM = ((GXutil.strcmp("", A485TBT14_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A486TBT14_UPD_CNT = 0 ;
               n486TBT14_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
            }
            else
            {
               A486TBT14_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT14_UPD_CNT_Internalname), ".", ",") ;
               n486TBT14_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
            }
            n486TBT14_UPD_CNT = ((0==A486TBT14_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z140TBT14_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z140TBT14_STUDY_ID"), ".", ",") ;
            Z142TBT14_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z142TBT14_SUBJECT_ID"), ".", ",")) ;
            Z198TBT14_MEMO_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z198TBT14_MEMO_NO"), ".", ",")) ;
            Z480TBT14_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z480TBT14_CRT_DATETIME"), 0) ;
            n480TBT14_CRT_DATETIME = (GXutil.nullDate().equals(A480TBT14_CRT_DATETIME) ? true : false) ;
            Z481TBT14_CRT_USER_ID = httpContext.cgiGet( "Z481TBT14_CRT_USER_ID") ;
            n481TBT14_CRT_USER_ID = ((GXutil.strcmp("", A481TBT14_CRT_USER_ID)==0) ? true : false) ;
            Z483TBT14_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z483TBT14_UPD_DATETIME"), 0) ;
            n483TBT14_UPD_DATETIME = (GXutil.nullDate().equals(A483TBT14_UPD_DATETIME) ? true : false) ;
            Z484TBT14_UPD_USER_ID = httpContext.cgiGet( "Z484TBT14_UPD_USER_ID") ;
            n484TBT14_UPD_USER_ID = ((GXutil.strcmp("", A484TBT14_UPD_USER_ID)==0) ? true : false) ;
            Z486TBT14_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z486TBT14_UPD_CNT"), ".", ",") ;
            n486TBT14_UPD_CNT = ((0==A486TBT14_UPD_CNT) ? true : false) ;
            Z474TBT14_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z474TBT14_CRF_ID"), ".", ",")) ;
            n474TBT14_CRF_ID = ((0==A474TBT14_CRF_ID) ? true : false) ;
            Z941TBT14_CRF_EDA_NO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z941TBT14_CRF_EDA_NO"), ".", ",")) ;
            n941TBT14_CRF_EDA_NO = ((0==A941TBT14_CRF_EDA_NO) ? true : false) ;
            Z475TBT14_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z475TBT14_CRF_VERSION"), ".", ",")) ;
            n475TBT14_CRF_VERSION = ((0==A475TBT14_CRF_VERSION) ? true : false) ;
            Z901TBT14_MEMO_KBN = httpContext.cgiGet( "Z901TBT14_MEMO_KBN") ;
            n901TBT14_MEMO_KBN = ((GXutil.strcmp("", A901TBT14_MEMO_KBN)==0) ? true : false) ;
            Z477TBT14_MEMO = httpContext.cgiGet( "Z477TBT14_MEMO") ;
            n477TBT14_MEMO = ((GXutil.strcmp("", A477TBT14_MEMO)==0) ? true : false) ;
            Z929TBT14_REQUEST_SITE_ID = httpContext.cgiGet( "Z929TBT14_REQUEST_SITE_ID") ;
            n929TBT14_REQUEST_SITE_ID = ((GXutil.strcmp("", A929TBT14_REQUEST_SITE_ID)==0) ? true : false) ;
            Z930TBT14_REQUEST_AUTH_CD = httpContext.cgiGet( "Z930TBT14_REQUEST_AUTH_CD") ;
            n930TBT14_REQUEST_AUTH_CD = ((GXutil.strcmp("", A930TBT14_REQUEST_AUTH_CD)==0) ? true : false) ;
            Z931TBT14_CRT_AUTH_CD = httpContext.cgiGet( "Z931TBT14_CRT_AUTH_CD") ;
            n931TBT14_CRT_AUTH_CD = ((GXutil.strcmp("", A931TBT14_CRT_AUTH_CD)==0) ? true : false) ;
            Z927TBT14_KAKUNIN_FLG = httpContext.cgiGet( "Z927TBT14_KAKUNIN_FLG") ;
            n927TBT14_KAKUNIN_FLG = ((GXutil.strcmp("", A927TBT14_KAKUNIN_FLG)==0) ? true : false) ;
            Z928TBT14_KAKUNIN_USER_ID = httpContext.cgiGet( "Z928TBT14_KAKUNIN_USER_ID") ;
            n928TBT14_KAKUNIN_USER_ID = ((GXutil.strcmp("", A928TBT14_KAKUNIN_USER_ID)==0) ? true : false) ;
            Z934TBT14_KAKUNIN_COMMENT = httpContext.cgiGet( "Z934TBT14_KAKUNIN_COMMENT") ;
            n934TBT14_KAKUNIN_COMMENT = ((GXutil.strcmp("", A934TBT14_KAKUNIN_COMMENT)==0) ? true : false) ;
            Z902TBT14_KANRYO_FLG = httpContext.cgiGet( "Z902TBT14_KANRYO_FLG") ;
            n902TBT14_KANRYO_FLG = ((GXutil.strcmp("", A902TBT14_KANRYO_FLG)==0) ? true : false) ;
            Z479TBT14_DEL_FLG = httpContext.cgiGet( "Z479TBT14_DEL_FLG") ;
            n479TBT14_DEL_FLG = ((GXutil.strcmp("", A479TBT14_DEL_FLG)==0) ? true : false) ;
            Z482TBT14_CRT_PROG_NM = httpContext.cgiGet( "Z482TBT14_CRT_PROG_NM") ;
            n482TBT14_CRT_PROG_NM = ((GXutil.strcmp("", A482TBT14_CRT_PROG_NM)==0) ? true : false) ;
            Z485TBT14_UPD_PROG_NM = httpContext.cgiGet( "Z485TBT14_UPD_PROG_NM") ;
            n485TBT14_UPD_PROG_NM = ((GXutil.strcmp("", A485TBT14_UPD_PROG_NM)==0) ? true : false) ;
            O486TBT14_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O486TBT14_UPD_CNT"), ".", ",") ;
            n486TBT14_UPD_CNT = ((0==A486TBT14_UPD_CNT) ? true : false) ;
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
               A140TBT14_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
               A142TBT14_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
               A198TBT14_MEMO_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A198TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)));
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
                     /* Execute user event: e110S2 */
                     e110S2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120S2 */
                     e120S2 ();
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
         /* Execute user event: e120S2 */
         e120S2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0S27( ) ;
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
      disableAttributes0S27( ) ;
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

   public void resetCaption0S0( )
   {
   }

   public void e110S2( )
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

   public void e120S2( )
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

   public void zm0S27( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z480TBT14_CRT_DATETIME = T000S3_A480TBT14_CRT_DATETIME[0] ;
            Z481TBT14_CRT_USER_ID = T000S3_A481TBT14_CRT_USER_ID[0] ;
            Z483TBT14_UPD_DATETIME = T000S3_A483TBT14_UPD_DATETIME[0] ;
            Z484TBT14_UPD_USER_ID = T000S3_A484TBT14_UPD_USER_ID[0] ;
            Z486TBT14_UPD_CNT = T000S3_A486TBT14_UPD_CNT[0] ;
            Z474TBT14_CRF_ID = T000S3_A474TBT14_CRF_ID[0] ;
            Z941TBT14_CRF_EDA_NO = T000S3_A941TBT14_CRF_EDA_NO[0] ;
            Z475TBT14_CRF_VERSION = T000S3_A475TBT14_CRF_VERSION[0] ;
            Z901TBT14_MEMO_KBN = T000S3_A901TBT14_MEMO_KBN[0] ;
            Z477TBT14_MEMO = T000S3_A477TBT14_MEMO[0] ;
            Z929TBT14_REQUEST_SITE_ID = T000S3_A929TBT14_REQUEST_SITE_ID[0] ;
            Z930TBT14_REQUEST_AUTH_CD = T000S3_A930TBT14_REQUEST_AUTH_CD[0] ;
            Z931TBT14_CRT_AUTH_CD = T000S3_A931TBT14_CRT_AUTH_CD[0] ;
            Z927TBT14_KAKUNIN_FLG = T000S3_A927TBT14_KAKUNIN_FLG[0] ;
            Z928TBT14_KAKUNIN_USER_ID = T000S3_A928TBT14_KAKUNIN_USER_ID[0] ;
            Z934TBT14_KAKUNIN_COMMENT = T000S3_A934TBT14_KAKUNIN_COMMENT[0] ;
            Z902TBT14_KANRYO_FLG = T000S3_A902TBT14_KANRYO_FLG[0] ;
            Z479TBT14_DEL_FLG = T000S3_A479TBT14_DEL_FLG[0] ;
            Z482TBT14_CRT_PROG_NM = T000S3_A482TBT14_CRT_PROG_NM[0] ;
            Z485TBT14_UPD_PROG_NM = T000S3_A485TBT14_UPD_PROG_NM[0] ;
         }
         else
         {
            Z480TBT14_CRT_DATETIME = A480TBT14_CRT_DATETIME ;
            Z481TBT14_CRT_USER_ID = A481TBT14_CRT_USER_ID ;
            Z483TBT14_UPD_DATETIME = A483TBT14_UPD_DATETIME ;
            Z484TBT14_UPD_USER_ID = A484TBT14_UPD_USER_ID ;
            Z486TBT14_UPD_CNT = A486TBT14_UPD_CNT ;
            Z474TBT14_CRF_ID = A474TBT14_CRF_ID ;
            Z941TBT14_CRF_EDA_NO = A941TBT14_CRF_EDA_NO ;
            Z475TBT14_CRF_VERSION = A475TBT14_CRF_VERSION ;
            Z901TBT14_MEMO_KBN = A901TBT14_MEMO_KBN ;
            Z477TBT14_MEMO = A477TBT14_MEMO ;
            Z929TBT14_REQUEST_SITE_ID = A929TBT14_REQUEST_SITE_ID ;
            Z930TBT14_REQUEST_AUTH_CD = A930TBT14_REQUEST_AUTH_CD ;
            Z931TBT14_CRT_AUTH_CD = A931TBT14_CRT_AUTH_CD ;
            Z927TBT14_KAKUNIN_FLG = A927TBT14_KAKUNIN_FLG ;
            Z928TBT14_KAKUNIN_USER_ID = A928TBT14_KAKUNIN_USER_ID ;
            Z934TBT14_KAKUNIN_COMMENT = A934TBT14_KAKUNIN_COMMENT ;
            Z902TBT14_KANRYO_FLG = A902TBT14_KANRYO_FLG ;
            Z479TBT14_DEL_FLG = A479TBT14_DEL_FLG ;
            Z482TBT14_CRT_PROG_NM = A482TBT14_CRT_PROG_NM ;
            Z485TBT14_UPD_PROG_NM = A485TBT14_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z198TBT14_MEMO_NO = A198TBT14_MEMO_NO ;
         Z480TBT14_CRT_DATETIME = A480TBT14_CRT_DATETIME ;
         Z481TBT14_CRT_USER_ID = A481TBT14_CRT_USER_ID ;
         Z483TBT14_UPD_DATETIME = A483TBT14_UPD_DATETIME ;
         Z484TBT14_UPD_USER_ID = A484TBT14_UPD_USER_ID ;
         Z486TBT14_UPD_CNT = A486TBT14_UPD_CNT ;
         Z474TBT14_CRF_ID = A474TBT14_CRF_ID ;
         Z941TBT14_CRF_EDA_NO = A941TBT14_CRF_EDA_NO ;
         Z475TBT14_CRF_VERSION = A475TBT14_CRF_VERSION ;
         Z901TBT14_MEMO_KBN = A901TBT14_MEMO_KBN ;
         Z477TBT14_MEMO = A477TBT14_MEMO ;
         Z929TBT14_REQUEST_SITE_ID = A929TBT14_REQUEST_SITE_ID ;
         Z930TBT14_REQUEST_AUTH_CD = A930TBT14_REQUEST_AUTH_CD ;
         Z931TBT14_CRT_AUTH_CD = A931TBT14_CRT_AUTH_CD ;
         Z927TBT14_KAKUNIN_FLG = A927TBT14_KAKUNIN_FLG ;
         Z928TBT14_KAKUNIN_USER_ID = A928TBT14_KAKUNIN_USER_ID ;
         Z934TBT14_KAKUNIN_COMMENT = A934TBT14_KAKUNIN_COMMENT ;
         Z902TBT14_KANRYO_FLG = A902TBT14_KANRYO_FLG ;
         Z479TBT14_DEL_FLG = A479TBT14_DEL_FLG ;
         Z482TBT14_CRT_PROG_NM = A482TBT14_CRT_PROG_NM ;
         Z485TBT14_UPD_PROG_NM = A485TBT14_UPD_PROG_NM ;
         Z140TBT14_STUDY_ID = A140TBT14_STUDY_ID ;
         Z142TBT14_SUBJECT_ID = A142TBT14_SUBJECT_ID ;
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

   public void load0S27( )
   {
      /* Using cursor T000S5 */
      pr_default.execute(3, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A480TBT14_CRT_DATETIME = T000S5_A480TBT14_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480TBT14_CRT_DATETIME", localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n480TBT14_CRT_DATETIME = T000S5_n480TBT14_CRT_DATETIME[0] ;
         A481TBT14_CRT_USER_ID = T000S5_A481TBT14_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A481TBT14_CRT_USER_ID", A481TBT14_CRT_USER_ID);
         n481TBT14_CRT_USER_ID = T000S5_n481TBT14_CRT_USER_ID[0] ;
         A483TBT14_UPD_DATETIME = T000S5_A483TBT14_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483TBT14_UPD_DATETIME", localUtil.ttoc( A483TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n483TBT14_UPD_DATETIME = T000S5_n483TBT14_UPD_DATETIME[0] ;
         A484TBT14_UPD_USER_ID = T000S5_A484TBT14_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A484TBT14_UPD_USER_ID", A484TBT14_UPD_USER_ID);
         n484TBT14_UPD_USER_ID = T000S5_n484TBT14_UPD_USER_ID[0] ;
         A486TBT14_UPD_CNT = T000S5_A486TBT14_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
         n486TBT14_UPD_CNT = T000S5_n486TBT14_UPD_CNT[0] ;
         A474TBT14_CRF_ID = T000S5_A474TBT14_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A474TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A474TBT14_CRF_ID, 4, 0)));
         n474TBT14_CRF_ID = T000S5_n474TBT14_CRF_ID[0] ;
         A941TBT14_CRF_EDA_NO = T000S5_A941TBT14_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A941TBT14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A941TBT14_CRF_EDA_NO, 2, 0)));
         n941TBT14_CRF_EDA_NO = T000S5_n941TBT14_CRF_EDA_NO[0] ;
         A475TBT14_CRF_VERSION = T000S5_A475TBT14_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A475TBT14_CRF_VERSION", GXutil.ltrim( GXutil.str( A475TBT14_CRF_VERSION, 4, 0)));
         n475TBT14_CRF_VERSION = T000S5_n475TBT14_CRF_VERSION[0] ;
         A901TBT14_MEMO_KBN = T000S5_A901TBT14_MEMO_KBN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A901TBT14_MEMO_KBN", A901TBT14_MEMO_KBN);
         n901TBT14_MEMO_KBN = T000S5_n901TBT14_MEMO_KBN[0] ;
         A477TBT14_MEMO = T000S5_A477TBT14_MEMO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A477TBT14_MEMO", A477TBT14_MEMO);
         n477TBT14_MEMO = T000S5_n477TBT14_MEMO[0] ;
         A929TBT14_REQUEST_SITE_ID = T000S5_A929TBT14_REQUEST_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_SITE_ID", A929TBT14_REQUEST_SITE_ID);
         n929TBT14_REQUEST_SITE_ID = T000S5_n929TBT14_REQUEST_SITE_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = T000S5_A930TBT14_REQUEST_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_REQUEST_AUTH_CD", A930TBT14_REQUEST_AUTH_CD);
         n930TBT14_REQUEST_AUTH_CD = T000S5_n930TBT14_REQUEST_AUTH_CD[0] ;
         A931TBT14_CRT_AUTH_CD = T000S5_A931TBT14_CRT_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A931TBT14_CRT_AUTH_CD", A931TBT14_CRT_AUTH_CD);
         n931TBT14_CRT_AUTH_CD = T000S5_n931TBT14_CRT_AUTH_CD[0] ;
         A927TBT14_KAKUNIN_FLG = T000S5_A927TBT14_KAKUNIN_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
         n927TBT14_KAKUNIN_FLG = T000S5_n927TBT14_KAKUNIN_FLG[0] ;
         A928TBT14_KAKUNIN_USER_ID = T000S5_A928TBT14_KAKUNIN_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_KAKUNIN_USER_ID", A928TBT14_KAKUNIN_USER_ID);
         n928TBT14_KAKUNIN_USER_ID = T000S5_n928TBT14_KAKUNIN_USER_ID[0] ;
         A934TBT14_KAKUNIN_COMMENT = T000S5_A934TBT14_KAKUNIN_COMMENT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A934TBT14_KAKUNIN_COMMENT", A934TBT14_KAKUNIN_COMMENT);
         n934TBT14_KAKUNIN_COMMENT = T000S5_n934TBT14_KAKUNIN_COMMENT[0] ;
         A902TBT14_KANRYO_FLG = T000S5_A902TBT14_KANRYO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A902TBT14_KANRYO_FLG", A902TBT14_KANRYO_FLG);
         n902TBT14_KANRYO_FLG = T000S5_n902TBT14_KANRYO_FLG[0] ;
         A479TBT14_DEL_FLG = T000S5_A479TBT14_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479TBT14_DEL_FLG", A479TBT14_DEL_FLG);
         n479TBT14_DEL_FLG = T000S5_n479TBT14_DEL_FLG[0] ;
         A482TBT14_CRT_PROG_NM = T000S5_A482TBT14_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482TBT14_CRT_PROG_NM", A482TBT14_CRT_PROG_NM);
         n482TBT14_CRT_PROG_NM = T000S5_n482TBT14_CRT_PROG_NM[0] ;
         A485TBT14_UPD_PROG_NM = T000S5_A485TBT14_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A485TBT14_UPD_PROG_NM", A485TBT14_UPD_PROG_NM);
         n485TBT14_UPD_PROG_NM = T000S5_n485TBT14_UPD_PROG_NM[0] ;
         zm0S27( -8) ;
      }
      pr_default.close(3);
      onLoadActions0S27( ) ;
   }

   public void onLoadActions0S27( )
   {
      AV9Pgmname = "TBT14_CRF_MEMO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0S27( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBT14_CRF_MEMO" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000S4 */
      pr_default.execute(2, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFメモテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A480TBT14_CRT_DATETIME) || (( A480TBT14_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A480TBT14_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBT14_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A483TBT14_UPD_DATETIME) || (( A483TBT14_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A483TBT14_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBT14_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0S27( )
   {
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A140TBT14_STUDY_ID ,
                         int A142TBT14_SUBJECT_ID )
   {
      /* Using cursor T000S4 */
      pr_default.execute(2, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFメモテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
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

   public void getKey0S27( )
   {
      /* Using cursor T000S6 */
      pr_default.execute(4, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000S3 */
      pr_default.execute(1, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0S27( 8) ;
         RcdFound27 = (short)(1) ;
         A198TBT14_MEMO_NO = T000S3_A198TBT14_MEMO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A198TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)));
         A480TBT14_CRT_DATETIME = T000S3_A480TBT14_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A480TBT14_CRT_DATETIME", localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n480TBT14_CRT_DATETIME = T000S3_n480TBT14_CRT_DATETIME[0] ;
         A481TBT14_CRT_USER_ID = T000S3_A481TBT14_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A481TBT14_CRT_USER_ID", A481TBT14_CRT_USER_ID);
         n481TBT14_CRT_USER_ID = T000S3_n481TBT14_CRT_USER_ID[0] ;
         A483TBT14_UPD_DATETIME = T000S3_A483TBT14_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A483TBT14_UPD_DATETIME", localUtil.ttoc( A483TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n483TBT14_UPD_DATETIME = T000S3_n483TBT14_UPD_DATETIME[0] ;
         A484TBT14_UPD_USER_ID = T000S3_A484TBT14_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A484TBT14_UPD_USER_ID", A484TBT14_UPD_USER_ID);
         n484TBT14_UPD_USER_ID = T000S3_n484TBT14_UPD_USER_ID[0] ;
         A486TBT14_UPD_CNT = T000S3_A486TBT14_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
         n486TBT14_UPD_CNT = T000S3_n486TBT14_UPD_CNT[0] ;
         A474TBT14_CRF_ID = T000S3_A474TBT14_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A474TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A474TBT14_CRF_ID, 4, 0)));
         n474TBT14_CRF_ID = T000S3_n474TBT14_CRF_ID[0] ;
         A941TBT14_CRF_EDA_NO = T000S3_A941TBT14_CRF_EDA_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A941TBT14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A941TBT14_CRF_EDA_NO, 2, 0)));
         n941TBT14_CRF_EDA_NO = T000S3_n941TBT14_CRF_EDA_NO[0] ;
         A475TBT14_CRF_VERSION = T000S3_A475TBT14_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A475TBT14_CRF_VERSION", GXutil.ltrim( GXutil.str( A475TBT14_CRF_VERSION, 4, 0)));
         n475TBT14_CRF_VERSION = T000S3_n475TBT14_CRF_VERSION[0] ;
         A901TBT14_MEMO_KBN = T000S3_A901TBT14_MEMO_KBN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A901TBT14_MEMO_KBN", A901TBT14_MEMO_KBN);
         n901TBT14_MEMO_KBN = T000S3_n901TBT14_MEMO_KBN[0] ;
         A477TBT14_MEMO = T000S3_A477TBT14_MEMO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A477TBT14_MEMO", A477TBT14_MEMO);
         n477TBT14_MEMO = T000S3_n477TBT14_MEMO[0] ;
         A929TBT14_REQUEST_SITE_ID = T000S3_A929TBT14_REQUEST_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_SITE_ID", A929TBT14_REQUEST_SITE_ID);
         n929TBT14_REQUEST_SITE_ID = T000S3_n929TBT14_REQUEST_SITE_ID[0] ;
         A930TBT14_REQUEST_AUTH_CD = T000S3_A930TBT14_REQUEST_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_REQUEST_AUTH_CD", A930TBT14_REQUEST_AUTH_CD);
         n930TBT14_REQUEST_AUTH_CD = T000S3_n930TBT14_REQUEST_AUTH_CD[0] ;
         A931TBT14_CRT_AUTH_CD = T000S3_A931TBT14_CRT_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A931TBT14_CRT_AUTH_CD", A931TBT14_CRT_AUTH_CD);
         n931TBT14_CRT_AUTH_CD = T000S3_n931TBT14_CRT_AUTH_CD[0] ;
         A927TBT14_KAKUNIN_FLG = T000S3_A927TBT14_KAKUNIN_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
         n927TBT14_KAKUNIN_FLG = T000S3_n927TBT14_KAKUNIN_FLG[0] ;
         A928TBT14_KAKUNIN_USER_ID = T000S3_A928TBT14_KAKUNIN_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_KAKUNIN_USER_ID", A928TBT14_KAKUNIN_USER_ID);
         n928TBT14_KAKUNIN_USER_ID = T000S3_n928TBT14_KAKUNIN_USER_ID[0] ;
         A934TBT14_KAKUNIN_COMMENT = T000S3_A934TBT14_KAKUNIN_COMMENT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A934TBT14_KAKUNIN_COMMENT", A934TBT14_KAKUNIN_COMMENT);
         n934TBT14_KAKUNIN_COMMENT = T000S3_n934TBT14_KAKUNIN_COMMENT[0] ;
         A902TBT14_KANRYO_FLG = T000S3_A902TBT14_KANRYO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A902TBT14_KANRYO_FLG", A902TBT14_KANRYO_FLG);
         n902TBT14_KANRYO_FLG = T000S3_n902TBT14_KANRYO_FLG[0] ;
         A479TBT14_DEL_FLG = T000S3_A479TBT14_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A479TBT14_DEL_FLG", A479TBT14_DEL_FLG);
         n479TBT14_DEL_FLG = T000S3_n479TBT14_DEL_FLG[0] ;
         A482TBT14_CRT_PROG_NM = T000S3_A482TBT14_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A482TBT14_CRT_PROG_NM", A482TBT14_CRT_PROG_NM);
         n482TBT14_CRT_PROG_NM = T000S3_n482TBT14_CRT_PROG_NM[0] ;
         A485TBT14_UPD_PROG_NM = T000S3_A485TBT14_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A485TBT14_UPD_PROG_NM", A485TBT14_UPD_PROG_NM);
         n485TBT14_UPD_PROG_NM = T000S3_n485TBT14_UPD_PROG_NM[0] ;
         A140TBT14_STUDY_ID = T000S3_A140TBT14_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
         A142TBT14_SUBJECT_ID = T000S3_A142TBT14_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
         O486TBT14_UPD_CNT = A486TBT14_UPD_CNT ;
         n486TBT14_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
         Z140TBT14_STUDY_ID = A140TBT14_STUDY_ID ;
         Z142TBT14_SUBJECT_ID = A142TBT14_SUBJECT_ID ;
         Z198TBT14_MEMO_NO = A198TBT14_MEMO_NO ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0S27( ) ;
         if ( AnyError == 1 )
         {
            RcdFound27 = (short)(0) ;
            initializeNonKey0S27( ) ;
         }
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound27 = (short)(0) ;
         initializeNonKey0S27( ) ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode27 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0S27( ) ;
      if ( RcdFound27 == 0 )
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
      RcdFound27 = (short)(0) ;
      /* Using cursor T000S7 */
      pr_default.execute(5, new Object[] {new Long(A140TBT14_STUDY_ID), new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Integer(A142TBT14_SUBJECT_ID), new Long(A140TBT14_STUDY_ID), new Short(A198TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000S7_A140TBT14_STUDY_ID[0] < A140TBT14_STUDY_ID ) || ( T000S7_A140TBT14_STUDY_ID[0] == A140TBT14_STUDY_ID ) && ( T000S7_A142TBT14_SUBJECT_ID[0] < A142TBT14_SUBJECT_ID ) || ( T000S7_A142TBT14_SUBJECT_ID[0] == A142TBT14_SUBJECT_ID ) && ( T000S7_A140TBT14_STUDY_ID[0] == A140TBT14_STUDY_ID ) && ( T000S7_A198TBT14_MEMO_NO[0] < A198TBT14_MEMO_NO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000S7_A140TBT14_STUDY_ID[0] > A140TBT14_STUDY_ID ) || ( T000S7_A140TBT14_STUDY_ID[0] == A140TBT14_STUDY_ID ) && ( T000S7_A142TBT14_SUBJECT_ID[0] > A142TBT14_SUBJECT_ID ) || ( T000S7_A142TBT14_SUBJECT_ID[0] == A142TBT14_SUBJECT_ID ) && ( T000S7_A140TBT14_STUDY_ID[0] == A140TBT14_STUDY_ID ) && ( T000S7_A198TBT14_MEMO_NO[0] > A198TBT14_MEMO_NO ) ) )
         {
            A140TBT14_STUDY_ID = T000S7_A140TBT14_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
            A142TBT14_SUBJECT_ID = T000S7_A142TBT14_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
            A198TBT14_MEMO_NO = T000S7_A198TBT14_MEMO_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A198TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)));
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T000S8 */
      pr_default.execute(6, new Object[] {new Long(A140TBT14_STUDY_ID), new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Integer(A142TBT14_SUBJECT_ID), new Long(A140TBT14_STUDY_ID), new Short(A198TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000S8_A140TBT14_STUDY_ID[0] > A140TBT14_STUDY_ID ) || ( T000S8_A140TBT14_STUDY_ID[0] == A140TBT14_STUDY_ID ) && ( T000S8_A142TBT14_SUBJECT_ID[0] > A142TBT14_SUBJECT_ID ) || ( T000S8_A142TBT14_SUBJECT_ID[0] == A142TBT14_SUBJECT_ID ) && ( T000S8_A140TBT14_STUDY_ID[0] == A140TBT14_STUDY_ID ) && ( T000S8_A198TBT14_MEMO_NO[0] > A198TBT14_MEMO_NO ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000S8_A140TBT14_STUDY_ID[0] < A140TBT14_STUDY_ID ) || ( T000S8_A140TBT14_STUDY_ID[0] == A140TBT14_STUDY_ID ) && ( T000S8_A142TBT14_SUBJECT_ID[0] < A142TBT14_SUBJECT_ID ) || ( T000S8_A142TBT14_SUBJECT_ID[0] == A142TBT14_SUBJECT_ID ) && ( T000S8_A140TBT14_STUDY_ID[0] == A140TBT14_STUDY_ID ) && ( T000S8_A198TBT14_MEMO_NO[0] < A198TBT14_MEMO_NO ) ) )
         {
            A140TBT14_STUDY_ID = T000S8_A140TBT14_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
            A142TBT14_SUBJECT_ID = T000S8_A142TBT14_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
            A198TBT14_MEMO_NO = T000S8_A198TBT14_MEMO_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A198TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)));
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0S27( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0S27( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound27 == 1 )
         {
            if ( ( A140TBT14_STUDY_ID != Z140TBT14_STUDY_ID ) || ( A142TBT14_SUBJECT_ID != Z142TBT14_SUBJECT_ID ) || ( A198TBT14_MEMO_NO != Z198TBT14_MEMO_NO ) )
            {
               A140TBT14_STUDY_ID = Z140TBT14_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
               A142TBT14_SUBJECT_ID = Z142TBT14_SUBJECT_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
               A198TBT14_MEMO_NO = Z198TBT14_MEMO_NO ;
               httpContext.ajax_rsp_assign_attri("", false, "A198TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBT14_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0S27( ) ;
               GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A140TBT14_STUDY_ID != Z140TBT14_STUDY_ID ) || ( A142TBT14_SUBJECT_ID != Z142TBT14_SUBJECT_ID ) || ( A198TBT14_MEMO_NO != Z198TBT14_MEMO_NO ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0S27( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBT14_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0S27( ) ;
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
      if ( ( A140TBT14_STUDY_ID != Z140TBT14_STUDY_ID ) || ( A142TBT14_SUBJECT_ID != Z142TBT14_SUBJECT_ID ) || ( A198TBT14_MEMO_NO != Z198TBT14_MEMO_NO ) )
      {
         A140TBT14_STUDY_ID = Z140TBT14_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
         A142TBT14_SUBJECT_ID = Z142TBT14_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
         A198TBT14_MEMO_NO = Z198TBT14_MEMO_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A198TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBT14_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0S27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT14_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0S27( ) ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT14_CRF_ID_Internalname ;
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
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT14_CRF_ID_Internalname ;
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
      scanStart0S27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound27 != 0 )
         {
            scanNext0S27( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT14_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0S27( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0S27( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000S2 */
         pr_default.execute(0, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT14_CRF_MEMO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z480TBT14_CRT_DATETIME.equals( T000S2_A480TBT14_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z481TBT14_CRT_USER_ID, T000S2_A481TBT14_CRT_USER_ID[0]) != 0 ) || !( Z483TBT14_UPD_DATETIME.equals( T000S2_A483TBT14_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z484TBT14_UPD_USER_ID, T000S2_A484TBT14_UPD_USER_ID[0]) != 0 ) || ( Z486TBT14_UPD_CNT != T000S2_A486TBT14_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z474TBT14_CRF_ID != T000S2_A474TBT14_CRF_ID[0] ) || ( Z941TBT14_CRF_EDA_NO != T000S2_A941TBT14_CRF_EDA_NO[0] ) || ( Z475TBT14_CRF_VERSION != T000S2_A475TBT14_CRF_VERSION[0] ) || ( GXutil.strcmp(Z901TBT14_MEMO_KBN, T000S2_A901TBT14_MEMO_KBN[0]) != 0 ) || ( GXutil.strcmp(Z477TBT14_MEMO, T000S2_A477TBT14_MEMO[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z929TBT14_REQUEST_SITE_ID, T000S2_A929TBT14_REQUEST_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z930TBT14_REQUEST_AUTH_CD, T000S2_A930TBT14_REQUEST_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z931TBT14_CRT_AUTH_CD, T000S2_A931TBT14_CRT_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z927TBT14_KAKUNIN_FLG, T000S2_A927TBT14_KAKUNIN_FLG[0]) != 0 ) || ( GXutil.strcmp(Z928TBT14_KAKUNIN_USER_ID, T000S2_A928TBT14_KAKUNIN_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z934TBT14_KAKUNIN_COMMENT, T000S2_A934TBT14_KAKUNIN_COMMENT[0]) != 0 ) || ( GXutil.strcmp(Z902TBT14_KANRYO_FLG, T000S2_A902TBT14_KANRYO_FLG[0]) != 0 ) || ( GXutil.strcmp(Z479TBT14_DEL_FLG, T000S2_A479TBT14_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z482TBT14_CRT_PROG_NM, T000S2_A482TBT14_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z485TBT14_UPD_PROG_NM, T000S2_A485TBT14_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT14_CRF_MEMO"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0S27( )
   {
      beforeValidate0S27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0S27( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0S27( 0) ;
         checkOptimisticConcurrency0S27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0S27( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0S27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000S9 */
                  pr_default.execute(7, new Object[] {new Short(A198TBT14_MEMO_NO), new Boolean(n480TBT14_CRT_DATETIME), A480TBT14_CRT_DATETIME, new Boolean(n481TBT14_CRT_USER_ID), A481TBT14_CRT_USER_ID, new Boolean(n483TBT14_UPD_DATETIME), A483TBT14_UPD_DATETIME, new Boolean(n484TBT14_UPD_USER_ID), A484TBT14_UPD_USER_ID, new Boolean(n486TBT14_UPD_CNT), new Long(A486TBT14_UPD_CNT), new Boolean(n474TBT14_CRF_ID), new Short(A474TBT14_CRF_ID), new Boolean(n941TBT14_CRF_EDA_NO), new Byte(A941TBT14_CRF_EDA_NO), new Boolean(n475TBT14_CRF_VERSION), new Short(A475TBT14_CRF_VERSION), new Boolean(n901TBT14_MEMO_KBN), A901TBT14_MEMO_KBN, new Boolean(n477TBT14_MEMO), A477TBT14_MEMO, new Boolean(n929TBT14_REQUEST_SITE_ID), A929TBT14_REQUEST_SITE_ID, new Boolean(n930TBT14_REQUEST_AUTH_CD), A930TBT14_REQUEST_AUTH_CD, new Boolean(n931TBT14_CRT_AUTH_CD), A931TBT14_CRT_AUTH_CD, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n928TBT14_KAKUNIN_USER_ID), A928TBT14_KAKUNIN_USER_ID, new Boolean(n934TBT14_KAKUNIN_COMMENT), A934TBT14_KAKUNIN_COMMENT, new Boolean(n902TBT14_KANRYO_FLG), A902TBT14_KANRYO_FLG, new Boolean(n479TBT14_DEL_FLG), A479TBT14_DEL_FLG, new Boolean(n482TBT14_CRT_PROG_NM), A482TBT14_CRT_PROG_NM, new Boolean(n485TBT14_UPD_PROG_NM), A485TBT14_UPD_PROG_NM, new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
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
                        resetCaption0S0( ) ;
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
            load0S27( ) ;
         }
         endLevel0S27( ) ;
      }
      closeExtendedTableCursors0S27( ) ;
   }

   public void update0S27( )
   {
      beforeValidate0S27( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0S27( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0S27( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0S27( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0S27( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000S10 */
                  pr_default.execute(8, new Object[] {new Boolean(n480TBT14_CRT_DATETIME), A480TBT14_CRT_DATETIME, new Boolean(n481TBT14_CRT_USER_ID), A481TBT14_CRT_USER_ID, new Boolean(n483TBT14_UPD_DATETIME), A483TBT14_UPD_DATETIME, new Boolean(n484TBT14_UPD_USER_ID), A484TBT14_UPD_USER_ID, new Boolean(n486TBT14_UPD_CNT), new Long(A486TBT14_UPD_CNT), new Boolean(n474TBT14_CRF_ID), new Short(A474TBT14_CRF_ID), new Boolean(n941TBT14_CRF_EDA_NO), new Byte(A941TBT14_CRF_EDA_NO), new Boolean(n475TBT14_CRF_VERSION), new Short(A475TBT14_CRF_VERSION), new Boolean(n901TBT14_MEMO_KBN), A901TBT14_MEMO_KBN, new Boolean(n477TBT14_MEMO), A477TBT14_MEMO, new Boolean(n929TBT14_REQUEST_SITE_ID), A929TBT14_REQUEST_SITE_ID, new Boolean(n930TBT14_REQUEST_AUTH_CD), A930TBT14_REQUEST_AUTH_CD, new Boolean(n931TBT14_CRT_AUTH_CD), A931TBT14_CRT_AUTH_CD, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n928TBT14_KAKUNIN_USER_ID), A928TBT14_KAKUNIN_USER_ID, new Boolean(n934TBT14_KAKUNIN_COMMENT), A934TBT14_KAKUNIN_COMMENT, new Boolean(n902TBT14_KANRYO_FLG), A902TBT14_KANRYO_FLG, new Boolean(n479TBT14_DEL_FLG), A479TBT14_DEL_FLG, new Boolean(n482TBT14_CRT_PROG_NM), A482TBT14_CRT_PROG_NM, new Boolean(n485TBT14_UPD_PROG_NM), A485TBT14_UPD_PROG_NM, new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT14_CRF_MEMO"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0S27( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0S0( ) ;
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
         endLevel0S27( ) ;
      }
      closeExtendedTableCursors0S27( ) ;
   }

   public void deferredUpdate0S27( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0S27( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0S27( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0S27( ) ;
         afterConfirm0S27( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0S27( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000S11 */
               pr_default.execute(9, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBT14_CRF_MEMO") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound27 == 0 )
                     {
                        initAll0S27( ) ;
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
                     resetCaption0S0( ) ;
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
      sMode27 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0S27( ) ;
      Gx_mode = sMode27 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0S27( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT14_CRF_MEMO" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000S12 */
         pr_default.execute(10, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID), new Short(A198TBT14_MEMO_NO)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRFメモ位置テーブル"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel0S27( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0S27( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbt14_crf_memo");
         if ( AnyError == 0 )
         {
            confirmValues0S0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbt14_crf_memo");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0S27( )
   {
      /* Scan By routine */
      /* Using cursor T000S13 */
      pr_default.execute(11);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A140TBT14_STUDY_ID = T000S13_A140TBT14_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
         A142TBT14_SUBJECT_ID = T000S13_A142TBT14_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
         A198TBT14_MEMO_NO = T000S13_A198TBT14_MEMO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A198TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0S27( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A140TBT14_STUDY_ID = T000S13_A140TBT14_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
         A142TBT14_SUBJECT_ID = T000S13_A142TBT14_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
         A198TBT14_MEMO_NO = T000S13_A198TBT14_MEMO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A198TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)));
      }
   }

   public void scanEnd0S27( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0S27( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0S27( )
   {
      /* Before Insert Rules */
      A480TBT14_CRT_DATETIME = GXutil.now( ) ;
      n480TBT14_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A480TBT14_CRT_DATETIME", localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A481TBT14_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt14_crf_memo_impl.this.GXt_char1 = GXv_char2[0] ;
      A481TBT14_CRT_USER_ID = GXt_char1 ;
      n481TBT14_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A481TBT14_CRT_USER_ID", A481TBT14_CRT_USER_ID);
      A483TBT14_UPD_DATETIME = GXutil.now( ) ;
      n483TBT14_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A483TBT14_UPD_DATETIME", localUtil.ttoc( A483TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A484TBT14_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt14_crf_memo_impl.this.GXt_char1 = GXv_char2[0] ;
      A484TBT14_UPD_USER_ID = GXt_char1 ;
      n484TBT14_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A484TBT14_UPD_USER_ID", A484TBT14_UPD_USER_ID);
      A486TBT14_UPD_CNT = (long)(O486TBT14_UPD_CNT+1) ;
      n486TBT14_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0S27( )
   {
      /* Before Update Rules */
      A483TBT14_UPD_DATETIME = GXutil.now( ) ;
      n483TBT14_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A483TBT14_UPD_DATETIME", localUtil.ttoc( A483TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A484TBT14_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt14_crf_memo_impl.this.GXt_char1 = GXv_char2[0] ;
      A484TBT14_UPD_USER_ID = GXt_char1 ;
      n484TBT14_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A484TBT14_UPD_USER_ID", A484TBT14_UPD_USER_ID);
      A486TBT14_UPD_CNT = (long)(O486TBT14_UPD_CNT+1) ;
      n486TBT14_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0S27( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0S27( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0S27( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0S27( )
   {
      edtTBT14_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_STUDY_ID_Enabled, 5, 0)));
      edtTBT14_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_SUBJECT_ID_Enabled, 5, 0)));
      edtTBT14_MEMO_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_MEMO_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_MEMO_NO_Enabled, 5, 0)));
      edtTBT14_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_CRF_ID_Enabled, 5, 0)));
      edtTBT14_CRF_EDA_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_CRF_EDA_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_CRF_EDA_NO_Enabled, 5, 0)));
      edtTBT14_CRF_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_CRF_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_CRF_VERSION_Enabled, 5, 0)));
      edtTBT14_MEMO_KBN_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_MEMO_KBN_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_MEMO_KBN_Enabled, 5, 0)));
      edtTBT14_MEMO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_MEMO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_MEMO_Enabled, 5, 0)));
      edtTBT14_REQUEST_SITE_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_REQUEST_SITE_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_REQUEST_SITE_ID_Enabled, 5, 0)));
      edtTBT14_REQUEST_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_REQUEST_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_REQUEST_AUTH_CD_Enabled, 5, 0)));
      edtTBT14_CRT_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_CRT_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_CRT_AUTH_CD_Enabled, 5, 0)));
      edtTBT14_KAKUNIN_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_KAKUNIN_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_KAKUNIN_FLG_Enabled, 5, 0)));
      edtTBT14_KAKUNIN_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_KAKUNIN_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_KAKUNIN_USER_ID_Enabled, 5, 0)));
      edtTBT14_KAKUNIN_COMMENT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_KAKUNIN_COMMENT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_KAKUNIN_COMMENT_Enabled, 5, 0)));
      edtTBT14_KANRYO_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_KANRYO_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_KANRYO_FLG_Enabled, 5, 0)));
      edtTBT14_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_DEL_FLG_Enabled, 5, 0)));
      edtTBT14_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_CRT_DATETIME_Enabled, 5, 0)));
      edtTBT14_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_CRT_USER_ID_Enabled, 5, 0)));
      edtTBT14_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBT14_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_UPD_DATETIME_Enabled, 5, 0)));
      edtTBT14_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_UPD_USER_ID_Enabled, 5, 0)));
      edtTBT14_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBT14_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT14_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT14_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0S0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRFメモテーブル") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317151658");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbt14_crf_memo") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0S27( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z140TBT14_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z140TBT14_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z142TBT14_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z142TBT14_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z198TBT14_MEMO_NO", GXutil.ltrim( localUtil.ntoc( Z198TBT14_MEMO_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z480TBT14_CRT_DATETIME", localUtil.ttoc( Z480TBT14_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z481TBT14_CRT_USER_ID", GXutil.rtrim( Z481TBT14_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z483TBT14_UPD_DATETIME", localUtil.ttoc( Z483TBT14_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z484TBT14_UPD_USER_ID", GXutil.rtrim( Z484TBT14_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z486TBT14_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z486TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z474TBT14_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z474TBT14_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z941TBT14_CRF_EDA_NO", GXutil.ltrim( localUtil.ntoc( Z941TBT14_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z475TBT14_CRF_VERSION", GXutil.ltrim( localUtil.ntoc( Z475TBT14_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z901TBT14_MEMO_KBN", GXutil.rtrim( Z901TBT14_MEMO_KBN));
      GxWebStd.gx_hidden_field( httpContext, "Z477TBT14_MEMO", GXutil.rtrim( Z477TBT14_MEMO));
      GxWebStd.gx_hidden_field( httpContext, "Z929TBT14_REQUEST_SITE_ID", GXutil.rtrim( Z929TBT14_REQUEST_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z930TBT14_REQUEST_AUTH_CD", GXutil.rtrim( Z930TBT14_REQUEST_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z931TBT14_CRT_AUTH_CD", GXutil.rtrim( Z931TBT14_CRT_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z927TBT14_KAKUNIN_FLG", GXutil.rtrim( Z927TBT14_KAKUNIN_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z928TBT14_KAKUNIN_USER_ID", GXutil.rtrim( Z928TBT14_KAKUNIN_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z934TBT14_KAKUNIN_COMMENT", GXutil.rtrim( Z934TBT14_KAKUNIN_COMMENT));
      GxWebStd.gx_hidden_field( httpContext, "Z902TBT14_KANRYO_FLG", GXutil.rtrim( Z902TBT14_KANRYO_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z479TBT14_DEL_FLG", GXutil.rtrim( Z479TBT14_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z482TBT14_CRT_PROG_NM", GXutil.rtrim( Z482TBT14_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z485TBT14_UPD_PROG_NM", GXutil.rtrim( Z485TBT14_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O486TBT14_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O486TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBT14_CRF_MEMO" ;
   }

   public String getPgmdesc( )
   {
      return "CRFメモテーブル" ;
   }

   public void initializeNonKey0S27( )
   {
      A480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n480TBT14_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A480TBT14_CRT_DATETIME", localUtil.ttoc( A480TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n480TBT14_CRT_DATETIME = (GXutil.nullDate().equals(A480TBT14_CRT_DATETIME) ? true : false) ;
      A481TBT14_CRT_USER_ID = "" ;
      n481TBT14_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A481TBT14_CRT_USER_ID", A481TBT14_CRT_USER_ID);
      n481TBT14_CRT_USER_ID = ((GXutil.strcmp("", A481TBT14_CRT_USER_ID)==0) ? true : false) ;
      A483TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n483TBT14_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A483TBT14_UPD_DATETIME", localUtil.ttoc( A483TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n483TBT14_UPD_DATETIME = (GXutil.nullDate().equals(A483TBT14_UPD_DATETIME) ? true : false) ;
      A484TBT14_UPD_USER_ID = "" ;
      n484TBT14_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A484TBT14_UPD_USER_ID", A484TBT14_UPD_USER_ID);
      n484TBT14_UPD_USER_ID = ((GXutil.strcmp("", A484TBT14_UPD_USER_ID)==0) ? true : false) ;
      A486TBT14_UPD_CNT = 0 ;
      n486TBT14_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
      n486TBT14_UPD_CNT = ((0==A486TBT14_UPD_CNT) ? true : false) ;
      A474TBT14_CRF_ID = (short)(0) ;
      n474TBT14_CRF_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A474TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A474TBT14_CRF_ID, 4, 0)));
      n474TBT14_CRF_ID = ((0==A474TBT14_CRF_ID) ? true : false) ;
      A941TBT14_CRF_EDA_NO = (byte)(0) ;
      n941TBT14_CRF_EDA_NO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A941TBT14_CRF_EDA_NO", GXutil.ltrim( GXutil.str( A941TBT14_CRF_EDA_NO, 2, 0)));
      n941TBT14_CRF_EDA_NO = ((0==A941TBT14_CRF_EDA_NO) ? true : false) ;
      A475TBT14_CRF_VERSION = (short)(0) ;
      n475TBT14_CRF_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A475TBT14_CRF_VERSION", GXutil.ltrim( GXutil.str( A475TBT14_CRF_VERSION, 4, 0)));
      n475TBT14_CRF_VERSION = ((0==A475TBT14_CRF_VERSION) ? true : false) ;
      A901TBT14_MEMO_KBN = "" ;
      n901TBT14_MEMO_KBN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A901TBT14_MEMO_KBN", A901TBT14_MEMO_KBN);
      n901TBT14_MEMO_KBN = ((GXutil.strcmp("", A901TBT14_MEMO_KBN)==0) ? true : false) ;
      A477TBT14_MEMO = "" ;
      n477TBT14_MEMO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A477TBT14_MEMO", A477TBT14_MEMO);
      n477TBT14_MEMO = ((GXutil.strcmp("", A477TBT14_MEMO)==0) ? true : false) ;
      A929TBT14_REQUEST_SITE_ID = "" ;
      n929TBT14_REQUEST_SITE_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_SITE_ID", A929TBT14_REQUEST_SITE_ID);
      n929TBT14_REQUEST_SITE_ID = ((GXutil.strcmp("", A929TBT14_REQUEST_SITE_ID)==0) ? true : false) ;
      A930TBT14_REQUEST_AUTH_CD = "" ;
      n930TBT14_REQUEST_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_REQUEST_AUTH_CD", A930TBT14_REQUEST_AUTH_CD);
      n930TBT14_REQUEST_AUTH_CD = ((GXutil.strcmp("", A930TBT14_REQUEST_AUTH_CD)==0) ? true : false) ;
      A931TBT14_CRT_AUTH_CD = "" ;
      n931TBT14_CRT_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A931TBT14_CRT_AUTH_CD", A931TBT14_CRT_AUTH_CD);
      n931TBT14_CRT_AUTH_CD = ((GXutil.strcmp("", A931TBT14_CRT_AUTH_CD)==0) ? true : false) ;
      A927TBT14_KAKUNIN_FLG = "" ;
      n927TBT14_KAKUNIN_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
      n927TBT14_KAKUNIN_FLG = ((GXutil.strcmp("", A927TBT14_KAKUNIN_FLG)==0) ? true : false) ;
      A928TBT14_KAKUNIN_USER_ID = "" ;
      n928TBT14_KAKUNIN_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_KAKUNIN_USER_ID", A928TBT14_KAKUNIN_USER_ID);
      n928TBT14_KAKUNIN_USER_ID = ((GXutil.strcmp("", A928TBT14_KAKUNIN_USER_ID)==0) ? true : false) ;
      A934TBT14_KAKUNIN_COMMENT = "" ;
      n934TBT14_KAKUNIN_COMMENT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A934TBT14_KAKUNIN_COMMENT", A934TBT14_KAKUNIN_COMMENT);
      n934TBT14_KAKUNIN_COMMENT = ((GXutil.strcmp("", A934TBT14_KAKUNIN_COMMENT)==0) ? true : false) ;
      A902TBT14_KANRYO_FLG = "" ;
      n902TBT14_KANRYO_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A902TBT14_KANRYO_FLG", A902TBT14_KANRYO_FLG);
      n902TBT14_KANRYO_FLG = ((GXutil.strcmp("", A902TBT14_KANRYO_FLG)==0) ? true : false) ;
      A479TBT14_DEL_FLG = "" ;
      n479TBT14_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A479TBT14_DEL_FLG", A479TBT14_DEL_FLG);
      n479TBT14_DEL_FLG = ((GXutil.strcmp("", A479TBT14_DEL_FLG)==0) ? true : false) ;
      A482TBT14_CRT_PROG_NM = "" ;
      n482TBT14_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A482TBT14_CRT_PROG_NM", A482TBT14_CRT_PROG_NM);
      n482TBT14_CRT_PROG_NM = ((GXutil.strcmp("", A482TBT14_CRT_PROG_NM)==0) ? true : false) ;
      A485TBT14_UPD_PROG_NM = "" ;
      n485TBT14_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A485TBT14_UPD_PROG_NM", A485TBT14_UPD_PROG_NM);
      n485TBT14_UPD_PROG_NM = ((GXutil.strcmp("", A485TBT14_UPD_PROG_NM)==0) ? true : false) ;
      O486TBT14_UPD_CNT = A486TBT14_UPD_CNT ;
      n486TBT14_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A486TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A486TBT14_UPD_CNT, 10, 0)));
   }

   public void initAll0S27( )
   {
      A140TBT14_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A140TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A140TBT14_STUDY_ID, 10, 0)));
      A142TBT14_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A142TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A142TBT14_SUBJECT_ID, 6, 0)));
      A198TBT14_MEMO_NO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A198TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A198TBT14_MEMO_NO, 3, 0)));
      initializeNonKey0S27( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?8960");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122662");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317151672");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbt14_crf_memo.js", "?20177317151672");
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
      lblTextblocktbt14_study_id_Internalname = "TEXTBLOCKTBT14_STUDY_ID" ;
      edtTBT14_STUDY_ID_Internalname = "TBT14_STUDY_ID" ;
      lblTextblocktbt14_subject_id_Internalname = "TEXTBLOCKTBT14_SUBJECT_ID" ;
      edtTBT14_SUBJECT_ID_Internalname = "TBT14_SUBJECT_ID" ;
      lblTextblocktbt14_memo_no_Internalname = "TEXTBLOCKTBT14_MEMO_NO" ;
      edtTBT14_MEMO_NO_Internalname = "TBT14_MEMO_NO" ;
      lblTextblocktbt14_crf_id_Internalname = "TEXTBLOCKTBT14_CRF_ID" ;
      edtTBT14_CRF_ID_Internalname = "TBT14_CRF_ID" ;
      lblTextblocktbt14_crf_eda_no_Internalname = "TEXTBLOCKTBT14_CRF_EDA_NO" ;
      edtTBT14_CRF_EDA_NO_Internalname = "TBT14_CRF_EDA_NO" ;
      lblTextblocktbt14_crf_version_Internalname = "TEXTBLOCKTBT14_CRF_VERSION" ;
      edtTBT14_CRF_VERSION_Internalname = "TBT14_CRF_VERSION" ;
      lblTextblocktbt14_memo_kbn_Internalname = "TEXTBLOCKTBT14_MEMO_KBN" ;
      edtTBT14_MEMO_KBN_Internalname = "TBT14_MEMO_KBN" ;
      lblTextblocktbt14_memo_Internalname = "TEXTBLOCKTBT14_MEMO" ;
      edtTBT14_MEMO_Internalname = "TBT14_MEMO" ;
      lblTextblocktbt14_request_site_id_Internalname = "TEXTBLOCKTBT14_REQUEST_SITE_ID" ;
      edtTBT14_REQUEST_SITE_ID_Internalname = "TBT14_REQUEST_SITE_ID" ;
      lblTextblocktbt14_request_auth_cd_Internalname = "TEXTBLOCKTBT14_REQUEST_AUTH_CD" ;
      edtTBT14_REQUEST_AUTH_CD_Internalname = "TBT14_REQUEST_AUTH_CD" ;
      lblTextblocktbt14_crt_auth_cd_Internalname = "TEXTBLOCKTBT14_CRT_AUTH_CD" ;
      edtTBT14_CRT_AUTH_CD_Internalname = "TBT14_CRT_AUTH_CD" ;
      lblTextblocktbt14_kakunin_flg_Internalname = "TEXTBLOCKTBT14_KAKUNIN_FLG" ;
      edtTBT14_KAKUNIN_FLG_Internalname = "TBT14_KAKUNIN_FLG" ;
      lblTextblocktbt14_kakunin_user_id_Internalname = "TEXTBLOCKTBT14_KAKUNIN_USER_ID" ;
      edtTBT14_KAKUNIN_USER_ID_Internalname = "TBT14_KAKUNIN_USER_ID" ;
      lblTextblocktbt14_kakunin_comment_Internalname = "TEXTBLOCKTBT14_KAKUNIN_COMMENT" ;
      edtTBT14_KAKUNIN_COMMENT_Internalname = "TBT14_KAKUNIN_COMMENT" ;
      lblTextblocktbt14_kanryo_flg_Internalname = "TEXTBLOCKTBT14_KANRYO_FLG" ;
      edtTBT14_KANRYO_FLG_Internalname = "TBT14_KANRYO_FLG" ;
      lblTextblocktbt14_del_flg_Internalname = "TEXTBLOCKTBT14_DEL_FLG" ;
      edtTBT14_DEL_FLG_Internalname = "TBT14_DEL_FLG" ;
      lblTextblocktbt14_crt_datetime_Internalname = "TEXTBLOCKTBT14_CRT_DATETIME" ;
      edtTBT14_CRT_DATETIME_Internalname = "TBT14_CRT_DATETIME" ;
      lblTextblocktbt14_crt_user_id_Internalname = "TEXTBLOCKTBT14_CRT_USER_ID" ;
      edtTBT14_CRT_USER_ID_Internalname = "TBT14_CRT_USER_ID" ;
      lblTextblocktbt14_crt_prog_nm_Internalname = "TEXTBLOCKTBT14_CRT_PROG_NM" ;
      edtTBT14_CRT_PROG_NM_Internalname = "TBT14_CRT_PROG_NM" ;
      lblTextblocktbt14_upd_datetime_Internalname = "TEXTBLOCKTBT14_UPD_DATETIME" ;
      edtTBT14_UPD_DATETIME_Internalname = "TBT14_UPD_DATETIME" ;
      lblTextblocktbt14_upd_user_id_Internalname = "TEXTBLOCKTBT14_UPD_USER_ID" ;
      edtTBT14_UPD_USER_ID_Internalname = "TBT14_UPD_USER_ID" ;
      lblTextblocktbt14_upd_prog_nm_Internalname = "TEXTBLOCKTBT14_UPD_PROG_NM" ;
      edtTBT14_UPD_PROG_NM_Internalname = "TBT14_UPD_PROG_NM" ;
      lblTextblocktbt14_upd_cnt_Internalname = "TEXTBLOCKTBT14_UPD_CNT" ;
      edtTBT14_UPD_CNT_Internalname = "TBT14_UPD_CNT" ;
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
      edtTBT14_UPD_CNT_Jsonclick = "" ;
      edtTBT14_UPD_CNT_Enabled = 1 ;
      edtTBT14_UPD_PROG_NM_Jsonclick = "" ;
      edtTBT14_UPD_PROG_NM_Enabled = 1 ;
      edtTBT14_UPD_USER_ID_Jsonclick = "" ;
      edtTBT14_UPD_USER_ID_Enabled = 1 ;
      edtTBT14_UPD_DATETIME_Jsonclick = "" ;
      edtTBT14_UPD_DATETIME_Enabled = 1 ;
      edtTBT14_CRT_PROG_NM_Jsonclick = "" ;
      edtTBT14_CRT_PROG_NM_Enabled = 1 ;
      edtTBT14_CRT_USER_ID_Jsonclick = "" ;
      edtTBT14_CRT_USER_ID_Enabled = 1 ;
      edtTBT14_CRT_DATETIME_Jsonclick = "" ;
      edtTBT14_CRT_DATETIME_Enabled = 1 ;
      edtTBT14_DEL_FLG_Jsonclick = "" ;
      edtTBT14_DEL_FLG_Enabled = 1 ;
      edtTBT14_KANRYO_FLG_Jsonclick = "" ;
      edtTBT14_KANRYO_FLG_Enabled = 1 ;
      edtTBT14_KAKUNIN_COMMENT_Enabled = 1 ;
      edtTBT14_KAKUNIN_USER_ID_Jsonclick = "" ;
      edtTBT14_KAKUNIN_USER_ID_Enabled = 1 ;
      edtTBT14_KAKUNIN_FLG_Jsonclick = "" ;
      edtTBT14_KAKUNIN_FLG_Enabled = 1 ;
      edtTBT14_CRT_AUTH_CD_Jsonclick = "" ;
      edtTBT14_CRT_AUTH_CD_Enabled = 1 ;
      edtTBT14_REQUEST_AUTH_CD_Jsonclick = "" ;
      edtTBT14_REQUEST_AUTH_CD_Enabled = 1 ;
      edtTBT14_REQUEST_SITE_ID_Jsonclick = "" ;
      edtTBT14_REQUEST_SITE_ID_Enabled = 1 ;
      edtTBT14_MEMO_Enabled = 1 ;
      edtTBT14_MEMO_KBN_Jsonclick = "" ;
      edtTBT14_MEMO_KBN_Enabled = 1 ;
      edtTBT14_CRF_VERSION_Jsonclick = "" ;
      edtTBT14_CRF_VERSION_Enabled = 1 ;
      edtTBT14_CRF_EDA_NO_Jsonclick = "" ;
      edtTBT14_CRF_EDA_NO_Enabled = 1 ;
      edtTBT14_CRF_ID_Jsonclick = "" ;
      edtTBT14_CRF_ID_Enabled = 1 ;
      edtTBT14_MEMO_NO_Jsonclick = "" ;
      edtTBT14_MEMO_NO_Enabled = 1 ;
      edtTBT14_SUBJECT_ID_Jsonclick = "" ;
      edtTBT14_SUBJECT_ID_Enabled = 1 ;
      edtTBT14_STUDY_ID_Jsonclick = "" ;
      edtTBT14_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbt14_crt_user_id0S27( String Gx_mode )
   {
      GXt_char1 = A481TBT14_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt14_crf_memo_impl.this.GXt_char1 = GXv_char2[0] ;
      A481TBT14_CRT_USER_ID = GXt_char1 ;
      n481TBT14_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A481TBT14_CRT_USER_ID", A481TBT14_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A481TBT14_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbt14_upd_user_id0S27( String Gx_mode )
   {
      GXt_char1 = A484TBT14_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbt14_crf_memo_impl.this.GXt_char1 = GXv_char2[0] ;
      A484TBT14_UPD_USER_ID = GXt_char1 ;
      n484TBT14_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A484TBT14_UPD_USER_ID", A484TBT14_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A484TBT14_UPD_USER_ID))+"\"");
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
      /* Using cursor T000S14 */
      pr_default.execute(12, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFメモテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
      GX_FocusControl = edtTBT14_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbt14_subject_id( long GX_Parm1 ,
                                       int GX_Parm2 )
   {
      A140TBT14_STUDY_ID = GX_Parm1 ;
      A142TBT14_SUBJECT_ID = GX_Parm2 ;
      /* Using cursor T000S14 */
      pr_default.execute(12, new Object[] {new Long(A140TBT14_STUDY_ID), new Integer(A142TBT14_SUBJECT_ID)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFメモテーブル・患者サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbt14_memo_no( long GX_Parm1 ,
                                    int GX_Parm2 ,
                                    short GX_Parm3 ,
                                    java.util.Date GX_Parm4 ,
                                    String GX_Parm5 ,
                                    java.util.Date GX_Parm6 ,
                                    String GX_Parm7 ,
                                    long GX_Parm8 ,
                                    short GX_Parm9 ,
                                    byte GX_Parm10 ,
                                    short GX_Parm11 ,
                                    String GX_Parm12 ,
                                    String GX_Parm13 ,
                                    String GX_Parm14 ,
                                    String GX_Parm15 ,
                                    String GX_Parm16 ,
                                    String GX_Parm17 ,
                                    String GX_Parm18 ,
                                    String GX_Parm19 ,
                                    String GX_Parm20 ,
                                    String GX_Parm21 ,
                                    String GX_Parm22 ,
                                    String GX_Parm23 )
   {
      A140TBT14_STUDY_ID = GX_Parm1 ;
      A142TBT14_SUBJECT_ID = GX_Parm2 ;
      A198TBT14_MEMO_NO = GX_Parm3 ;
      A480TBT14_CRT_DATETIME = GX_Parm4 ;
      n480TBT14_CRT_DATETIME = false ;
      A481TBT14_CRT_USER_ID = GX_Parm5 ;
      n481TBT14_CRT_USER_ID = false ;
      A483TBT14_UPD_DATETIME = GX_Parm6 ;
      n483TBT14_UPD_DATETIME = false ;
      A484TBT14_UPD_USER_ID = GX_Parm7 ;
      n484TBT14_UPD_USER_ID = false ;
      A486TBT14_UPD_CNT = GX_Parm8 ;
      n486TBT14_UPD_CNT = false ;
      A474TBT14_CRF_ID = GX_Parm9 ;
      n474TBT14_CRF_ID = false ;
      A941TBT14_CRF_EDA_NO = GX_Parm10 ;
      n941TBT14_CRF_EDA_NO = false ;
      A475TBT14_CRF_VERSION = GX_Parm11 ;
      n475TBT14_CRF_VERSION = false ;
      A901TBT14_MEMO_KBN = GX_Parm12 ;
      n901TBT14_MEMO_KBN = false ;
      A477TBT14_MEMO = GX_Parm13 ;
      n477TBT14_MEMO = false ;
      A929TBT14_REQUEST_SITE_ID = GX_Parm14 ;
      n929TBT14_REQUEST_SITE_ID = false ;
      A930TBT14_REQUEST_AUTH_CD = GX_Parm15 ;
      n930TBT14_REQUEST_AUTH_CD = false ;
      A931TBT14_CRT_AUTH_CD = GX_Parm16 ;
      n931TBT14_CRT_AUTH_CD = false ;
      A927TBT14_KAKUNIN_FLG = GX_Parm17 ;
      n927TBT14_KAKUNIN_FLG = false ;
      A928TBT14_KAKUNIN_USER_ID = GX_Parm18 ;
      n928TBT14_KAKUNIN_USER_ID = false ;
      A934TBT14_KAKUNIN_COMMENT = GX_Parm19 ;
      n934TBT14_KAKUNIN_COMMENT = false ;
      A902TBT14_KANRYO_FLG = GX_Parm20 ;
      n902TBT14_KANRYO_FLG = false ;
      A479TBT14_DEL_FLG = GX_Parm21 ;
      n479TBT14_DEL_FLG = false ;
      A482TBT14_CRT_PROG_NM = GX_Parm22 ;
      n482TBT14_CRT_PROG_NM = false ;
      A485TBT14_UPD_PROG_NM = GX_Parm23 ;
      n485TBT14_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A480TBT14_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A481TBT14_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A483TBT14_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A484TBT14_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A486TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A474TBT14_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A941TBT14_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A475TBT14_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A901TBT14_MEMO_KBN));
      isValidOutput.add(GXutil.rtrim( A477TBT14_MEMO));
      isValidOutput.add(GXutil.rtrim( A929TBT14_REQUEST_SITE_ID));
      isValidOutput.add(GXutil.rtrim( A930TBT14_REQUEST_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A931TBT14_CRT_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A927TBT14_KAKUNIN_FLG));
      isValidOutput.add(GXutil.rtrim( A928TBT14_KAKUNIN_USER_ID));
      isValidOutput.add(GXutil.rtrim( A934TBT14_KAKUNIN_COMMENT));
      isValidOutput.add(GXutil.rtrim( A902TBT14_KANRYO_FLG));
      isValidOutput.add(GXutil.rtrim( A479TBT14_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A482TBT14_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A485TBT14_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z140TBT14_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z142TBT14_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z198TBT14_MEMO_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z480TBT14_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z481TBT14_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z483TBT14_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z484TBT14_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z486TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z474TBT14_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z941TBT14_CRF_EDA_NO, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z475TBT14_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z901TBT14_MEMO_KBN));
      isValidOutput.add(GXutil.rtrim( Z477TBT14_MEMO));
      isValidOutput.add(GXutil.rtrim( Z929TBT14_REQUEST_SITE_ID));
      isValidOutput.add(GXutil.rtrim( Z930TBT14_REQUEST_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z931TBT14_CRT_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z927TBT14_KAKUNIN_FLG));
      isValidOutput.add(GXutil.rtrim( Z928TBT14_KAKUNIN_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z934TBT14_KAKUNIN_COMMENT));
      isValidOutput.add(GXutil.rtrim( Z902TBT14_KANRYO_FLG));
      isValidOutput.add(GXutil.rtrim( Z479TBT14_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z482TBT14_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z485TBT14_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O486TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      pr_default.close(12);
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
      Z480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z481TBT14_CRT_USER_ID = "" ;
      Z483TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z484TBT14_UPD_USER_ID = "" ;
      Z901TBT14_MEMO_KBN = "" ;
      Z477TBT14_MEMO = "" ;
      Z929TBT14_REQUEST_SITE_ID = "" ;
      Z930TBT14_REQUEST_AUTH_CD = "" ;
      Z931TBT14_CRT_AUTH_CD = "" ;
      Z927TBT14_KAKUNIN_FLG = "" ;
      Z928TBT14_KAKUNIN_USER_ID = "" ;
      Z934TBT14_KAKUNIN_COMMENT = "" ;
      Z902TBT14_KANRYO_FLG = "" ;
      Z479TBT14_DEL_FLG = "" ;
      Z482TBT14_CRT_PROG_NM = "" ;
      Z485TBT14_UPD_PROG_NM = "" ;
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
      lblTextblocktbt14_study_id_Jsonclick = "" ;
      lblTextblocktbt14_subject_id_Jsonclick = "" ;
      lblTextblocktbt14_memo_no_Jsonclick = "" ;
      lblTextblocktbt14_crf_id_Jsonclick = "" ;
      lblTextblocktbt14_crf_eda_no_Jsonclick = "" ;
      lblTextblocktbt14_crf_version_Jsonclick = "" ;
      lblTextblocktbt14_memo_kbn_Jsonclick = "" ;
      A901TBT14_MEMO_KBN = "" ;
      lblTextblocktbt14_memo_Jsonclick = "" ;
      A477TBT14_MEMO = "" ;
      lblTextblocktbt14_request_site_id_Jsonclick = "" ;
      A929TBT14_REQUEST_SITE_ID = "" ;
      lblTextblocktbt14_request_auth_cd_Jsonclick = "" ;
      A930TBT14_REQUEST_AUTH_CD = "" ;
      lblTextblocktbt14_crt_auth_cd_Jsonclick = "" ;
      A931TBT14_CRT_AUTH_CD = "" ;
      lblTextblocktbt14_kakunin_flg_Jsonclick = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      lblTextblocktbt14_kakunin_user_id_Jsonclick = "" ;
      A928TBT14_KAKUNIN_USER_ID = "" ;
      lblTextblocktbt14_kakunin_comment_Jsonclick = "" ;
      A934TBT14_KAKUNIN_COMMENT = "" ;
      lblTextblocktbt14_kanryo_flg_Jsonclick = "" ;
      A902TBT14_KANRYO_FLG = "" ;
      lblTextblocktbt14_del_flg_Jsonclick = "" ;
      A479TBT14_DEL_FLG = "" ;
      lblTextblocktbt14_crt_datetime_Jsonclick = "" ;
      A480TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt14_crt_user_id_Jsonclick = "" ;
      A481TBT14_CRT_USER_ID = "" ;
      lblTextblocktbt14_crt_prog_nm_Jsonclick = "" ;
      A482TBT14_CRT_PROG_NM = "" ;
      lblTextblocktbt14_upd_datetime_Jsonclick = "" ;
      A483TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt14_upd_user_id_Jsonclick = "" ;
      A484TBT14_UPD_USER_ID = "" ;
      lblTextblocktbt14_upd_prog_nm_Jsonclick = "" ;
      A485TBT14_UPD_PROG_NM = "" ;
      lblTextblocktbt14_upd_cnt_Jsonclick = "" ;
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
      T000S5_A198TBT14_MEMO_NO = new short[1] ;
      T000S5_A480TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S5_n480TBT14_CRT_DATETIME = new boolean[] {false} ;
      T000S5_A481TBT14_CRT_USER_ID = new String[] {""} ;
      T000S5_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      T000S5_A483TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S5_n483TBT14_UPD_DATETIME = new boolean[] {false} ;
      T000S5_A484TBT14_UPD_USER_ID = new String[] {""} ;
      T000S5_n484TBT14_UPD_USER_ID = new boolean[] {false} ;
      T000S5_A486TBT14_UPD_CNT = new long[1] ;
      T000S5_n486TBT14_UPD_CNT = new boolean[] {false} ;
      T000S5_A474TBT14_CRF_ID = new short[1] ;
      T000S5_n474TBT14_CRF_ID = new boolean[] {false} ;
      T000S5_A941TBT14_CRF_EDA_NO = new byte[1] ;
      T000S5_n941TBT14_CRF_EDA_NO = new boolean[] {false} ;
      T000S5_A475TBT14_CRF_VERSION = new short[1] ;
      T000S5_n475TBT14_CRF_VERSION = new boolean[] {false} ;
      T000S5_A901TBT14_MEMO_KBN = new String[] {""} ;
      T000S5_n901TBT14_MEMO_KBN = new boolean[] {false} ;
      T000S5_A477TBT14_MEMO = new String[] {""} ;
      T000S5_n477TBT14_MEMO = new boolean[] {false} ;
      T000S5_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      T000S5_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      T000S5_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      T000S5_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      T000S5_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      T000S5_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      T000S5_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      T000S5_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      T000S5_A928TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      T000S5_n928TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      T000S5_A934TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      T000S5_n934TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      T000S5_A902TBT14_KANRYO_FLG = new String[] {""} ;
      T000S5_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      T000S5_A479TBT14_DEL_FLG = new String[] {""} ;
      T000S5_n479TBT14_DEL_FLG = new boolean[] {false} ;
      T000S5_A482TBT14_CRT_PROG_NM = new String[] {""} ;
      T000S5_n482TBT14_CRT_PROG_NM = new boolean[] {false} ;
      T000S5_A485TBT14_UPD_PROG_NM = new String[] {""} ;
      T000S5_n485TBT14_UPD_PROG_NM = new boolean[] {false} ;
      T000S5_A140TBT14_STUDY_ID = new long[1] ;
      T000S5_A142TBT14_SUBJECT_ID = new int[1] ;
      T000S4_A140TBT14_STUDY_ID = new long[1] ;
      T000S6_A140TBT14_STUDY_ID = new long[1] ;
      T000S6_A142TBT14_SUBJECT_ID = new int[1] ;
      T000S6_A198TBT14_MEMO_NO = new short[1] ;
      T000S3_A198TBT14_MEMO_NO = new short[1] ;
      T000S3_A480TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S3_n480TBT14_CRT_DATETIME = new boolean[] {false} ;
      T000S3_A481TBT14_CRT_USER_ID = new String[] {""} ;
      T000S3_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      T000S3_A483TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S3_n483TBT14_UPD_DATETIME = new boolean[] {false} ;
      T000S3_A484TBT14_UPD_USER_ID = new String[] {""} ;
      T000S3_n484TBT14_UPD_USER_ID = new boolean[] {false} ;
      T000S3_A486TBT14_UPD_CNT = new long[1] ;
      T000S3_n486TBT14_UPD_CNT = new boolean[] {false} ;
      T000S3_A474TBT14_CRF_ID = new short[1] ;
      T000S3_n474TBT14_CRF_ID = new boolean[] {false} ;
      T000S3_A941TBT14_CRF_EDA_NO = new byte[1] ;
      T000S3_n941TBT14_CRF_EDA_NO = new boolean[] {false} ;
      T000S3_A475TBT14_CRF_VERSION = new short[1] ;
      T000S3_n475TBT14_CRF_VERSION = new boolean[] {false} ;
      T000S3_A901TBT14_MEMO_KBN = new String[] {""} ;
      T000S3_n901TBT14_MEMO_KBN = new boolean[] {false} ;
      T000S3_A477TBT14_MEMO = new String[] {""} ;
      T000S3_n477TBT14_MEMO = new boolean[] {false} ;
      T000S3_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      T000S3_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      T000S3_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      T000S3_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      T000S3_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      T000S3_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      T000S3_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      T000S3_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      T000S3_A928TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      T000S3_n928TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      T000S3_A934TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      T000S3_n934TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      T000S3_A902TBT14_KANRYO_FLG = new String[] {""} ;
      T000S3_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      T000S3_A479TBT14_DEL_FLG = new String[] {""} ;
      T000S3_n479TBT14_DEL_FLG = new boolean[] {false} ;
      T000S3_A482TBT14_CRT_PROG_NM = new String[] {""} ;
      T000S3_n482TBT14_CRT_PROG_NM = new boolean[] {false} ;
      T000S3_A485TBT14_UPD_PROG_NM = new String[] {""} ;
      T000S3_n485TBT14_UPD_PROG_NM = new boolean[] {false} ;
      T000S3_A140TBT14_STUDY_ID = new long[1] ;
      T000S3_A142TBT14_SUBJECT_ID = new int[1] ;
      sMode27 = "" ;
      T000S7_A140TBT14_STUDY_ID = new long[1] ;
      T000S7_A142TBT14_SUBJECT_ID = new int[1] ;
      T000S7_A198TBT14_MEMO_NO = new short[1] ;
      T000S8_A140TBT14_STUDY_ID = new long[1] ;
      T000S8_A142TBT14_SUBJECT_ID = new int[1] ;
      T000S8_A198TBT14_MEMO_NO = new short[1] ;
      T000S2_A198TBT14_MEMO_NO = new short[1] ;
      T000S2_A480TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S2_n480TBT14_CRT_DATETIME = new boolean[] {false} ;
      T000S2_A481TBT14_CRT_USER_ID = new String[] {""} ;
      T000S2_n481TBT14_CRT_USER_ID = new boolean[] {false} ;
      T000S2_A483TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S2_n483TBT14_UPD_DATETIME = new boolean[] {false} ;
      T000S2_A484TBT14_UPD_USER_ID = new String[] {""} ;
      T000S2_n484TBT14_UPD_USER_ID = new boolean[] {false} ;
      T000S2_A486TBT14_UPD_CNT = new long[1] ;
      T000S2_n486TBT14_UPD_CNT = new boolean[] {false} ;
      T000S2_A474TBT14_CRF_ID = new short[1] ;
      T000S2_n474TBT14_CRF_ID = new boolean[] {false} ;
      T000S2_A941TBT14_CRF_EDA_NO = new byte[1] ;
      T000S2_n941TBT14_CRF_EDA_NO = new boolean[] {false} ;
      T000S2_A475TBT14_CRF_VERSION = new short[1] ;
      T000S2_n475TBT14_CRF_VERSION = new boolean[] {false} ;
      T000S2_A901TBT14_MEMO_KBN = new String[] {""} ;
      T000S2_n901TBT14_MEMO_KBN = new boolean[] {false} ;
      T000S2_A477TBT14_MEMO = new String[] {""} ;
      T000S2_n477TBT14_MEMO = new boolean[] {false} ;
      T000S2_A929TBT14_REQUEST_SITE_ID = new String[] {""} ;
      T000S2_n929TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      T000S2_A930TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      T000S2_n930TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      T000S2_A931TBT14_CRT_AUTH_CD = new String[] {""} ;
      T000S2_n931TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      T000S2_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      T000S2_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      T000S2_A928TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      T000S2_n928TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      T000S2_A934TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      T000S2_n934TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      T000S2_A902TBT14_KANRYO_FLG = new String[] {""} ;
      T000S2_n902TBT14_KANRYO_FLG = new boolean[] {false} ;
      T000S2_A479TBT14_DEL_FLG = new String[] {""} ;
      T000S2_n479TBT14_DEL_FLG = new boolean[] {false} ;
      T000S2_A482TBT14_CRT_PROG_NM = new String[] {""} ;
      T000S2_n482TBT14_CRT_PROG_NM = new boolean[] {false} ;
      T000S2_A485TBT14_UPD_PROG_NM = new String[] {""} ;
      T000S2_n485TBT14_UPD_PROG_NM = new boolean[] {false} ;
      T000S2_A140TBT14_STUDY_ID = new long[1] ;
      T000S2_A142TBT14_SUBJECT_ID = new int[1] ;
      T000S12_A149TBT15_STUDY_ID = new long[1] ;
      T000S12_A151TBT15_SUBJECT_ID = new int[1] ;
      T000S12_A199TBT15_MEMO_NO = new short[1] ;
      T000S13_A140TBT14_STUDY_ID = new long[1] ;
      T000S13_A142TBT14_SUBJECT_ID = new int[1] ;
      T000S13_A198TBT14_MEMO_NO = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      T000S14_A140TBT14_STUDY_ID = new long[1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt14_crf_memo__default(),
         new Object[] {
             new Object[] {
            T000S2_A198TBT14_MEMO_NO, T000S2_A480TBT14_CRT_DATETIME, T000S2_n480TBT14_CRT_DATETIME, T000S2_A481TBT14_CRT_USER_ID, T000S2_n481TBT14_CRT_USER_ID, T000S2_A483TBT14_UPD_DATETIME, T000S2_n483TBT14_UPD_DATETIME, T000S2_A484TBT14_UPD_USER_ID, T000S2_n484TBT14_UPD_USER_ID, T000S2_A486TBT14_UPD_CNT,
            T000S2_n486TBT14_UPD_CNT, T000S2_A474TBT14_CRF_ID, T000S2_n474TBT14_CRF_ID, T000S2_A941TBT14_CRF_EDA_NO, T000S2_n941TBT14_CRF_EDA_NO, T000S2_A475TBT14_CRF_VERSION, T000S2_n475TBT14_CRF_VERSION, T000S2_A901TBT14_MEMO_KBN, T000S2_n901TBT14_MEMO_KBN, T000S2_A477TBT14_MEMO,
            T000S2_n477TBT14_MEMO, T000S2_A929TBT14_REQUEST_SITE_ID, T000S2_n929TBT14_REQUEST_SITE_ID, T000S2_A930TBT14_REQUEST_AUTH_CD, T000S2_n930TBT14_REQUEST_AUTH_CD, T000S2_A931TBT14_CRT_AUTH_CD, T000S2_n931TBT14_CRT_AUTH_CD, T000S2_A927TBT14_KAKUNIN_FLG, T000S2_n927TBT14_KAKUNIN_FLG, T000S2_A928TBT14_KAKUNIN_USER_ID,
            T000S2_n928TBT14_KAKUNIN_USER_ID, T000S2_A934TBT14_KAKUNIN_COMMENT, T000S2_n934TBT14_KAKUNIN_COMMENT, T000S2_A902TBT14_KANRYO_FLG, T000S2_n902TBT14_KANRYO_FLG, T000S2_A479TBT14_DEL_FLG, T000S2_n479TBT14_DEL_FLG, T000S2_A482TBT14_CRT_PROG_NM, T000S2_n482TBT14_CRT_PROG_NM, T000S2_A485TBT14_UPD_PROG_NM,
            T000S2_n485TBT14_UPD_PROG_NM, T000S2_A140TBT14_STUDY_ID, T000S2_A142TBT14_SUBJECT_ID
            }
            , new Object[] {
            T000S3_A198TBT14_MEMO_NO, T000S3_A480TBT14_CRT_DATETIME, T000S3_n480TBT14_CRT_DATETIME, T000S3_A481TBT14_CRT_USER_ID, T000S3_n481TBT14_CRT_USER_ID, T000S3_A483TBT14_UPD_DATETIME, T000S3_n483TBT14_UPD_DATETIME, T000S3_A484TBT14_UPD_USER_ID, T000S3_n484TBT14_UPD_USER_ID, T000S3_A486TBT14_UPD_CNT,
            T000S3_n486TBT14_UPD_CNT, T000S3_A474TBT14_CRF_ID, T000S3_n474TBT14_CRF_ID, T000S3_A941TBT14_CRF_EDA_NO, T000S3_n941TBT14_CRF_EDA_NO, T000S3_A475TBT14_CRF_VERSION, T000S3_n475TBT14_CRF_VERSION, T000S3_A901TBT14_MEMO_KBN, T000S3_n901TBT14_MEMO_KBN, T000S3_A477TBT14_MEMO,
            T000S3_n477TBT14_MEMO, T000S3_A929TBT14_REQUEST_SITE_ID, T000S3_n929TBT14_REQUEST_SITE_ID, T000S3_A930TBT14_REQUEST_AUTH_CD, T000S3_n930TBT14_REQUEST_AUTH_CD, T000S3_A931TBT14_CRT_AUTH_CD, T000S3_n931TBT14_CRT_AUTH_CD, T000S3_A927TBT14_KAKUNIN_FLG, T000S3_n927TBT14_KAKUNIN_FLG, T000S3_A928TBT14_KAKUNIN_USER_ID,
            T000S3_n928TBT14_KAKUNIN_USER_ID, T000S3_A934TBT14_KAKUNIN_COMMENT, T000S3_n934TBT14_KAKUNIN_COMMENT, T000S3_A902TBT14_KANRYO_FLG, T000S3_n902TBT14_KANRYO_FLG, T000S3_A479TBT14_DEL_FLG, T000S3_n479TBT14_DEL_FLG, T000S3_A482TBT14_CRT_PROG_NM, T000S3_n482TBT14_CRT_PROG_NM, T000S3_A485TBT14_UPD_PROG_NM,
            T000S3_n485TBT14_UPD_PROG_NM, T000S3_A140TBT14_STUDY_ID, T000S3_A142TBT14_SUBJECT_ID
            }
            , new Object[] {
            T000S4_A140TBT14_STUDY_ID
            }
            , new Object[] {
            T000S5_A198TBT14_MEMO_NO, T000S5_A480TBT14_CRT_DATETIME, T000S5_n480TBT14_CRT_DATETIME, T000S5_A481TBT14_CRT_USER_ID, T000S5_n481TBT14_CRT_USER_ID, T000S5_A483TBT14_UPD_DATETIME, T000S5_n483TBT14_UPD_DATETIME, T000S5_A484TBT14_UPD_USER_ID, T000S5_n484TBT14_UPD_USER_ID, T000S5_A486TBT14_UPD_CNT,
            T000S5_n486TBT14_UPD_CNT, T000S5_A474TBT14_CRF_ID, T000S5_n474TBT14_CRF_ID, T000S5_A941TBT14_CRF_EDA_NO, T000S5_n941TBT14_CRF_EDA_NO, T000S5_A475TBT14_CRF_VERSION, T000S5_n475TBT14_CRF_VERSION, T000S5_A901TBT14_MEMO_KBN, T000S5_n901TBT14_MEMO_KBN, T000S5_A477TBT14_MEMO,
            T000S5_n477TBT14_MEMO, T000S5_A929TBT14_REQUEST_SITE_ID, T000S5_n929TBT14_REQUEST_SITE_ID, T000S5_A930TBT14_REQUEST_AUTH_CD, T000S5_n930TBT14_REQUEST_AUTH_CD, T000S5_A931TBT14_CRT_AUTH_CD, T000S5_n931TBT14_CRT_AUTH_CD, T000S5_A927TBT14_KAKUNIN_FLG, T000S5_n927TBT14_KAKUNIN_FLG, T000S5_A928TBT14_KAKUNIN_USER_ID,
            T000S5_n928TBT14_KAKUNIN_USER_ID, T000S5_A934TBT14_KAKUNIN_COMMENT, T000S5_n934TBT14_KAKUNIN_COMMENT, T000S5_A902TBT14_KANRYO_FLG, T000S5_n902TBT14_KANRYO_FLG, T000S5_A479TBT14_DEL_FLG, T000S5_n479TBT14_DEL_FLG, T000S5_A482TBT14_CRT_PROG_NM, T000S5_n482TBT14_CRT_PROG_NM, T000S5_A485TBT14_UPD_PROG_NM,
            T000S5_n485TBT14_UPD_PROG_NM, T000S5_A140TBT14_STUDY_ID, T000S5_A142TBT14_SUBJECT_ID
            }
            , new Object[] {
            T000S6_A140TBT14_STUDY_ID, T000S6_A142TBT14_SUBJECT_ID, T000S6_A198TBT14_MEMO_NO
            }
            , new Object[] {
            T000S7_A140TBT14_STUDY_ID, T000S7_A142TBT14_SUBJECT_ID, T000S7_A198TBT14_MEMO_NO
            }
            , new Object[] {
            T000S8_A140TBT14_STUDY_ID, T000S8_A142TBT14_SUBJECT_ID, T000S8_A198TBT14_MEMO_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000S12_A149TBT15_STUDY_ID, T000S12_A151TBT15_SUBJECT_ID, T000S12_A199TBT15_MEMO_NO
            }
            , new Object[] {
            T000S13_A140TBT14_STUDY_ID, T000S13_A142TBT14_SUBJECT_ID, T000S13_A198TBT14_MEMO_NO
            }
            , new Object[] {
            T000S14_A140TBT14_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT14_CRF_MEMO" ;
   }

   private byte Z941TBT14_CRF_EDA_NO ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A941TBT14_CRF_EDA_NO ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z198TBT14_MEMO_NO ;
   private short Z474TBT14_CRF_ID ;
   private short Z475TBT14_CRF_VERSION ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A198TBT14_MEMO_NO ;
   private short A474TBT14_CRF_ID ;
   private short A475TBT14_CRF_VERSION ;
   private short RcdFound27 ;
   private short Gx_err ;
   private int Z142TBT14_SUBJECT_ID ;
   private int A142TBT14_SUBJECT_ID ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBT14_STUDY_ID_Enabled ;
   private int edtTBT14_SUBJECT_ID_Enabled ;
   private int edtTBT14_MEMO_NO_Enabled ;
   private int edtTBT14_CRF_ID_Enabled ;
   private int edtTBT14_CRF_EDA_NO_Enabled ;
   private int edtTBT14_CRF_VERSION_Enabled ;
   private int edtTBT14_MEMO_KBN_Enabled ;
   private int edtTBT14_MEMO_Enabled ;
   private int edtTBT14_REQUEST_SITE_ID_Enabled ;
   private int edtTBT14_REQUEST_AUTH_CD_Enabled ;
   private int edtTBT14_CRT_AUTH_CD_Enabled ;
   private int edtTBT14_KAKUNIN_FLG_Enabled ;
   private int edtTBT14_KAKUNIN_USER_ID_Enabled ;
   private int edtTBT14_KAKUNIN_COMMENT_Enabled ;
   private int edtTBT14_KANRYO_FLG_Enabled ;
   private int edtTBT14_DEL_FLG_Enabled ;
   private int edtTBT14_CRT_DATETIME_Enabled ;
   private int edtTBT14_CRT_USER_ID_Enabled ;
   private int edtTBT14_CRT_PROG_NM_Enabled ;
   private int edtTBT14_UPD_DATETIME_Enabled ;
   private int edtTBT14_UPD_USER_ID_Enabled ;
   private int edtTBT14_UPD_PROG_NM_Enabled ;
   private int edtTBT14_UPD_CNT_Enabled ;
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
   private long Z140TBT14_STUDY_ID ;
   private long Z486TBT14_UPD_CNT ;
   private long O486TBT14_UPD_CNT ;
   private long A140TBT14_STUDY_ID ;
   private long A486TBT14_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBT14_STUDY_ID_Internalname ;
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
   private String lblTextblocktbt14_study_id_Internalname ;
   private String lblTextblocktbt14_study_id_Jsonclick ;
   private String edtTBT14_STUDY_ID_Jsonclick ;
   private String lblTextblocktbt14_subject_id_Internalname ;
   private String lblTextblocktbt14_subject_id_Jsonclick ;
   private String edtTBT14_SUBJECT_ID_Internalname ;
   private String edtTBT14_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbt14_memo_no_Internalname ;
   private String lblTextblocktbt14_memo_no_Jsonclick ;
   private String edtTBT14_MEMO_NO_Internalname ;
   private String edtTBT14_MEMO_NO_Jsonclick ;
   private String lblTextblocktbt14_crf_id_Internalname ;
   private String lblTextblocktbt14_crf_id_Jsonclick ;
   private String edtTBT14_CRF_ID_Internalname ;
   private String edtTBT14_CRF_ID_Jsonclick ;
   private String lblTextblocktbt14_crf_eda_no_Internalname ;
   private String lblTextblocktbt14_crf_eda_no_Jsonclick ;
   private String edtTBT14_CRF_EDA_NO_Internalname ;
   private String edtTBT14_CRF_EDA_NO_Jsonclick ;
   private String lblTextblocktbt14_crf_version_Internalname ;
   private String lblTextblocktbt14_crf_version_Jsonclick ;
   private String edtTBT14_CRF_VERSION_Internalname ;
   private String edtTBT14_CRF_VERSION_Jsonclick ;
   private String lblTextblocktbt14_memo_kbn_Internalname ;
   private String lblTextblocktbt14_memo_kbn_Jsonclick ;
   private String edtTBT14_MEMO_KBN_Internalname ;
   private String edtTBT14_MEMO_KBN_Jsonclick ;
   private String lblTextblocktbt14_memo_Internalname ;
   private String lblTextblocktbt14_memo_Jsonclick ;
   private String edtTBT14_MEMO_Internalname ;
   private String lblTextblocktbt14_request_site_id_Internalname ;
   private String lblTextblocktbt14_request_site_id_Jsonclick ;
   private String edtTBT14_REQUEST_SITE_ID_Internalname ;
   private String edtTBT14_REQUEST_SITE_ID_Jsonclick ;
   private String lblTextblocktbt14_request_auth_cd_Internalname ;
   private String lblTextblocktbt14_request_auth_cd_Jsonclick ;
   private String edtTBT14_REQUEST_AUTH_CD_Internalname ;
   private String edtTBT14_REQUEST_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt14_crt_auth_cd_Internalname ;
   private String lblTextblocktbt14_crt_auth_cd_Jsonclick ;
   private String edtTBT14_CRT_AUTH_CD_Internalname ;
   private String edtTBT14_CRT_AUTH_CD_Jsonclick ;
   private String lblTextblocktbt14_kakunin_flg_Internalname ;
   private String lblTextblocktbt14_kakunin_flg_Jsonclick ;
   private String edtTBT14_KAKUNIN_FLG_Internalname ;
   private String edtTBT14_KAKUNIN_FLG_Jsonclick ;
   private String lblTextblocktbt14_kakunin_user_id_Internalname ;
   private String lblTextblocktbt14_kakunin_user_id_Jsonclick ;
   private String edtTBT14_KAKUNIN_USER_ID_Internalname ;
   private String edtTBT14_KAKUNIN_USER_ID_Jsonclick ;
   private String lblTextblocktbt14_kakunin_comment_Internalname ;
   private String lblTextblocktbt14_kakunin_comment_Jsonclick ;
   private String edtTBT14_KAKUNIN_COMMENT_Internalname ;
   private String lblTextblocktbt14_kanryo_flg_Internalname ;
   private String lblTextblocktbt14_kanryo_flg_Jsonclick ;
   private String edtTBT14_KANRYO_FLG_Internalname ;
   private String edtTBT14_KANRYO_FLG_Jsonclick ;
   private String lblTextblocktbt14_del_flg_Internalname ;
   private String lblTextblocktbt14_del_flg_Jsonclick ;
   private String edtTBT14_DEL_FLG_Internalname ;
   private String edtTBT14_DEL_FLG_Jsonclick ;
   private String lblTextblocktbt14_crt_datetime_Internalname ;
   private String lblTextblocktbt14_crt_datetime_Jsonclick ;
   private String edtTBT14_CRT_DATETIME_Internalname ;
   private String edtTBT14_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbt14_crt_user_id_Internalname ;
   private String lblTextblocktbt14_crt_user_id_Jsonclick ;
   private String edtTBT14_CRT_USER_ID_Internalname ;
   private String edtTBT14_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbt14_crt_prog_nm_Internalname ;
   private String lblTextblocktbt14_crt_prog_nm_Jsonclick ;
   private String edtTBT14_CRT_PROG_NM_Internalname ;
   private String edtTBT14_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbt14_upd_datetime_Internalname ;
   private String lblTextblocktbt14_upd_datetime_Jsonclick ;
   private String edtTBT14_UPD_DATETIME_Internalname ;
   private String edtTBT14_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbt14_upd_user_id_Internalname ;
   private String lblTextblocktbt14_upd_user_id_Jsonclick ;
   private String edtTBT14_UPD_USER_ID_Internalname ;
   private String edtTBT14_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbt14_upd_prog_nm_Internalname ;
   private String lblTextblocktbt14_upd_prog_nm_Jsonclick ;
   private String edtTBT14_UPD_PROG_NM_Internalname ;
   private String edtTBT14_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbt14_upd_cnt_Internalname ;
   private String lblTextblocktbt14_upd_cnt_Jsonclick ;
   private String edtTBT14_UPD_CNT_Internalname ;
   private String edtTBT14_UPD_CNT_Jsonclick ;
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
   private String sMode27 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z480TBT14_CRT_DATETIME ;
   private java.util.Date Z483TBT14_UPD_DATETIME ;
   private java.util.Date A480TBT14_CRT_DATETIME ;
   private java.util.Date A483TBT14_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n474TBT14_CRF_ID ;
   private boolean n941TBT14_CRF_EDA_NO ;
   private boolean n475TBT14_CRF_VERSION ;
   private boolean n901TBT14_MEMO_KBN ;
   private boolean n477TBT14_MEMO ;
   private boolean n929TBT14_REQUEST_SITE_ID ;
   private boolean n930TBT14_REQUEST_AUTH_CD ;
   private boolean n931TBT14_CRT_AUTH_CD ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n928TBT14_KAKUNIN_USER_ID ;
   private boolean n934TBT14_KAKUNIN_COMMENT ;
   private boolean n902TBT14_KANRYO_FLG ;
   private boolean n479TBT14_DEL_FLG ;
   private boolean n480TBT14_CRT_DATETIME ;
   private boolean n481TBT14_CRT_USER_ID ;
   private boolean n482TBT14_CRT_PROG_NM ;
   private boolean n483TBT14_UPD_DATETIME ;
   private boolean n484TBT14_UPD_USER_ID ;
   private boolean n485TBT14_UPD_PROG_NM ;
   private boolean n486TBT14_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z481TBT14_CRT_USER_ID ;
   private String Z484TBT14_UPD_USER_ID ;
   private String Z901TBT14_MEMO_KBN ;
   private String Z477TBT14_MEMO ;
   private String Z929TBT14_REQUEST_SITE_ID ;
   private String Z930TBT14_REQUEST_AUTH_CD ;
   private String Z931TBT14_CRT_AUTH_CD ;
   private String Z927TBT14_KAKUNIN_FLG ;
   private String Z928TBT14_KAKUNIN_USER_ID ;
   private String Z934TBT14_KAKUNIN_COMMENT ;
   private String Z902TBT14_KANRYO_FLG ;
   private String Z479TBT14_DEL_FLG ;
   private String Z482TBT14_CRT_PROG_NM ;
   private String Z485TBT14_UPD_PROG_NM ;
   private String A901TBT14_MEMO_KBN ;
   private String A477TBT14_MEMO ;
   private String A929TBT14_REQUEST_SITE_ID ;
   private String A930TBT14_REQUEST_AUTH_CD ;
   private String A931TBT14_CRT_AUTH_CD ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A928TBT14_KAKUNIN_USER_ID ;
   private String A934TBT14_KAKUNIN_COMMENT ;
   private String A902TBT14_KANRYO_FLG ;
   private String A479TBT14_DEL_FLG ;
   private String A481TBT14_CRT_USER_ID ;
   private String A482TBT14_CRT_PROG_NM ;
   private String A484TBT14_UPD_USER_ID ;
   private String A485TBT14_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private short[] T000S5_A198TBT14_MEMO_NO ;
   private java.util.Date[] T000S5_A480TBT14_CRT_DATETIME ;
   private boolean[] T000S5_n480TBT14_CRT_DATETIME ;
   private String[] T000S5_A481TBT14_CRT_USER_ID ;
   private boolean[] T000S5_n481TBT14_CRT_USER_ID ;
   private java.util.Date[] T000S5_A483TBT14_UPD_DATETIME ;
   private boolean[] T000S5_n483TBT14_UPD_DATETIME ;
   private String[] T000S5_A484TBT14_UPD_USER_ID ;
   private boolean[] T000S5_n484TBT14_UPD_USER_ID ;
   private long[] T000S5_A486TBT14_UPD_CNT ;
   private boolean[] T000S5_n486TBT14_UPD_CNT ;
   private short[] T000S5_A474TBT14_CRF_ID ;
   private boolean[] T000S5_n474TBT14_CRF_ID ;
   private byte[] T000S5_A941TBT14_CRF_EDA_NO ;
   private boolean[] T000S5_n941TBT14_CRF_EDA_NO ;
   private short[] T000S5_A475TBT14_CRF_VERSION ;
   private boolean[] T000S5_n475TBT14_CRF_VERSION ;
   private String[] T000S5_A901TBT14_MEMO_KBN ;
   private boolean[] T000S5_n901TBT14_MEMO_KBN ;
   private String[] T000S5_A477TBT14_MEMO ;
   private boolean[] T000S5_n477TBT14_MEMO ;
   private String[] T000S5_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] T000S5_n929TBT14_REQUEST_SITE_ID ;
   private String[] T000S5_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] T000S5_n930TBT14_REQUEST_AUTH_CD ;
   private String[] T000S5_A931TBT14_CRT_AUTH_CD ;
   private boolean[] T000S5_n931TBT14_CRT_AUTH_CD ;
   private String[] T000S5_A927TBT14_KAKUNIN_FLG ;
   private boolean[] T000S5_n927TBT14_KAKUNIN_FLG ;
   private String[] T000S5_A928TBT14_KAKUNIN_USER_ID ;
   private boolean[] T000S5_n928TBT14_KAKUNIN_USER_ID ;
   private String[] T000S5_A934TBT14_KAKUNIN_COMMENT ;
   private boolean[] T000S5_n934TBT14_KAKUNIN_COMMENT ;
   private String[] T000S5_A902TBT14_KANRYO_FLG ;
   private boolean[] T000S5_n902TBT14_KANRYO_FLG ;
   private String[] T000S5_A479TBT14_DEL_FLG ;
   private boolean[] T000S5_n479TBT14_DEL_FLG ;
   private String[] T000S5_A482TBT14_CRT_PROG_NM ;
   private boolean[] T000S5_n482TBT14_CRT_PROG_NM ;
   private String[] T000S5_A485TBT14_UPD_PROG_NM ;
   private boolean[] T000S5_n485TBT14_UPD_PROG_NM ;
   private long[] T000S5_A140TBT14_STUDY_ID ;
   private int[] T000S5_A142TBT14_SUBJECT_ID ;
   private long[] T000S4_A140TBT14_STUDY_ID ;
   private long[] T000S6_A140TBT14_STUDY_ID ;
   private int[] T000S6_A142TBT14_SUBJECT_ID ;
   private short[] T000S6_A198TBT14_MEMO_NO ;
   private short[] T000S3_A198TBT14_MEMO_NO ;
   private java.util.Date[] T000S3_A480TBT14_CRT_DATETIME ;
   private boolean[] T000S3_n480TBT14_CRT_DATETIME ;
   private String[] T000S3_A481TBT14_CRT_USER_ID ;
   private boolean[] T000S3_n481TBT14_CRT_USER_ID ;
   private java.util.Date[] T000S3_A483TBT14_UPD_DATETIME ;
   private boolean[] T000S3_n483TBT14_UPD_DATETIME ;
   private String[] T000S3_A484TBT14_UPD_USER_ID ;
   private boolean[] T000S3_n484TBT14_UPD_USER_ID ;
   private long[] T000S3_A486TBT14_UPD_CNT ;
   private boolean[] T000S3_n486TBT14_UPD_CNT ;
   private short[] T000S3_A474TBT14_CRF_ID ;
   private boolean[] T000S3_n474TBT14_CRF_ID ;
   private byte[] T000S3_A941TBT14_CRF_EDA_NO ;
   private boolean[] T000S3_n941TBT14_CRF_EDA_NO ;
   private short[] T000S3_A475TBT14_CRF_VERSION ;
   private boolean[] T000S3_n475TBT14_CRF_VERSION ;
   private String[] T000S3_A901TBT14_MEMO_KBN ;
   private boolean[] T000S3_n901TBT14_MEMO_KBN ;
   private String[] T000S3_A477TBT14_MEMO ;
   private boolean[] T000S3_n477TBT14_MEMO ;
   private String[] T000S3_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] T000S3_n929TBT14_REQUEST_SITE_ID ;
   private String[] T000S3_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] T000S3_n930TBT14_REQUEST_AUTH_CD ;
   private String[] T000S3_A931TBT14_CRT_AUTH_CD ;
   private boolean[] T000S3_n931TBT14_CRT_AUTH_CD ;
   private String[] T000S3_A927TBT14_KAKUNIN_FLG ;
   private boolean[] T000S3_n927TBT14_KAKUNIN_FLG ;
   private String[] T000S3_A928TBT14_KAKUNIN_USER_ID ;
   private boolean[] T000S3_n928TBT14_KAKUNIN_USER_ID ;
   private String[] T000S3_A934TBT14_KAKUNIN_COMMENT ;
   private boolean[] T000S3_n934TBT14_KAKUNIN_COMMENT ;
   private String[] T000S3_A902TBT14_KANRYO_FLG ;
   private boolean[] T000S3_n902TBT14_KANRYO_FLG ;
   private String[] T000S3_A479TBT14_DEL_FLG ;
   private boolean[] T000S3_n479TBT14_DEL_FLG ;
   private String[] T000S3_A482TBT14_CRT_PROG_NM ;
   private boolean[] T000S3_n482TBT14_CRT_PROG_NM ;
   private String[] T000S3_A485TBT14_UPD_PROG_NM ;
   private boolean[] T000S3_n485TBT14_UPD_PROG_NM ;
   private long[] T000S3_A140TBT14_STUDY_ID ;
   private int[] T000S3_A142TBT14_SUBJECT_ID ;
   private long[] T000S7_A140TBT14_STUDY_ID ;
   private int[] T000S7_A142TBT14_SUBJECT_ID ;
   private short[] T000S7_A198TBT14_MEMO_NO ;
   private long[] T000S8_A140TBT14_STUDY_ID ;
   private int[] T000S8_A142TBT14_SUBJECT_ID ;
   private short[] T000S8_A198TBT14_MEMO_NO ;
   private short[] T000S2_A198TBT14_MEMO_NO ;
   private java.util.Date[] T000S2_A480TBT14_CRT_DATETIME ;
   private boolean[] T000S2_n480TBT14_CRT_DATETIME ;
   private String[] T000S2_A481TBT14_CRT_USER_ID ;
   private boolean[] T000S2_n481TBT14_CRT_USER_ID ;
   private java.util.Date[] T000S2_A483TBT14_UPD_DATETIME ;
   private boolean[] T000S2_n483TBT14_UPD_DATETIME ;
   private String[] T000S2_A484TBT14_UPD_USER_ID ;
   private boolean[] T000S2_n484TBT14_UPD_USER_ID ;
   private long[] T000S2_A486TBT14_UPD_CNT ;
   private boolean[] T000S2_n486TBT14_UPD_CNT ;
   private short[] T000S2_A474TBT14_CRF_ID ;
   private boolean[] T000S2_n474TBT14_CRF_ID ;
   private byte[] T000S2_A941TBT14_CRF_EDA_NO ;
   private boolean[] T000S2_n941TBT14_CRF_EDA_NO ;
   private short[] T000S2_A475TBT14_CRF_VERSION ;
   private boolean[] T000S2_n475TBT14_CRF_VERSION ;
   private String[] T000S2_A901TBT14_MEMO_KBN ;
   private boolean[] T000S2_n901TBT14_MEMO_KBN ;
   private String[] T000S2_A477TBT14_MEMO ;
   private boolean[] T000S2_n477TBT14_MEMO ;
   private String[] T000S2_A929TBT14_REQUEST_SITE_ID ;
   private boolean[] T000S2_n929TBT14_REQUEST_SITE_ID ;
   private String[] T000S2_A930TBT14_REQUEST_AUTH_CD ;
   private boolean[] T000S2_n930TBT14_REQUEST_AUTH_CD ;
   private String[] T000S2_A931TBT14_CRT_AUTH_CD ;
   private boolean[] T000S2_n931TBT14_CRT_AUTH_CD ;
   private String[] T000S2_A927TBT14_KAKUNIN_FLG ;
   private boolean[] T000S2_n927TBT14_KAKUNIN_FLG ;
   private String[] T000S2_A928TBT14_KAKUNIN_USER_ID ;
   private boolean[] T000S2_n928TBT14_KAKUNIN_USER_ID ;
   private String[] T000S2_A934TBT14_KAKUNIN_COMMENT ;
   private boolean[] T000S2_n934TBT14_KAKUNIN_COMMENT ;
   private String[] T000S2_A902TBT14_KANRYO_FLG ;
   private boolean[] T000S2_n902TBT14_KANRYO_FLG ;
   private String[] T000S2_A479TBT14_DEL_FLG ;
   private boolean[] T000S2_n479TBT14_DEL_FLG ;
   private String[] T000S2_A482TBT14_CRT_PROG_NM ;
   private boolean[] T000S2_n482TBT14_CRT_PROG_NM ;
   private String[] T000S2_A485TBT14_UPD_PROG_NM ;
   private boolean[] T000S2_n485TBT14_UPD_PROG_NM ;
   private long[] T000S2_A140TBT14_STUDY_ID ;
   private int[] T000S2_A142TBT14_SUBJECT_ID ;
   private long[] T000S12_A149TBT15_STUDY_ID ;
   private int[] T000S12_A151TBT15_SUBJECT_ID ;
   private short[] T000S12_A199TBT15_MEMO_NO ;
   private long[] T000S13_A140TBT14_STUDY_ID ;
   private int[] T000S13_A142TBT14_SUBJECT_ID ;
   private short[] T000S13_A198TBT14_MEMO_NO ;
   private long[] T000S14_A140TBT14_STUDY_ID ;
}

final  class tbt14_crf_memo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000S2", "SELECT `TBT14_MEMO_NO`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_CNT`, `TBT14_CRF_ID`, `TBT14_CRF_EDA_NO`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_PROG_NM`, `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S3", "SELECT `TBT14_MEMO_NO`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_CNT`, `TBT14_CRF_ID`, `TBT14_CRF_EDA_NO`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_PROG_NM`, `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S4", "SELECT `TBT01_STUDY_ID` AS TBT14_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S5", "SELECT TM1.`TBT14_MEMO_NO`, TM1.`TBT14_CRT_DATETIME`, TM1.`TBT14_CRT_USER_ID`, TM1.`TBT14_UPD_DATETIME`, TM1.`TBT14_UPD_USER_ID`, TM1.`TBT14_UPD_CNT`, TM1.`TBT14_CRF_ID`, TM1.`TBT14_CRF_EDA_NO`, TM1.`TBT14_CRF_VERSION`, TM1.`TBT14_MEMO_KBN`, TM1.`TBT14_MEMO`, TM1.`TBT14_REQUEST_SITE_ID`, TM1.`TBT14_REQUEST_AUTH_CD`, TM1.`TBT14_CRT_AUTH_CD`, TM1.`TBT14_KAKUNIN_FLG`, TM1.`TBT14_KAKUNIN_USER_ID`, TM1.`TBT14_KAKUNIN_COMMENT`, TM1.`TBT14_KANRYO_FLG`, TM1.`TBT14_DEL_FLG`, TM1.`TBT14_CRT_PROG_NM`, TM1.`TBT14_UPD_PROG_NM`, TM1.`TBT14_STUDY_ID` AS TBT14_STUDY_ID, TM1.`TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID FROM `TBT14_CRF_MEMO` TM1 WHERE TM1.`TBT14_STUDY_ID` = ? and TM1.`TBT14_SUBJECT_ID` = ? and TM1.`TBT14_MEMO_NO` = ? ORDER BY TM1.`TBT14_STUDY_ID`, TM1.`TBT14_SUBJECT_ID`, TM1.`TBT14_MEMO_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000S6", "SELECT `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S7", "SELECT `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` WHERE ( `TBT14_STUDY_ID` > ? or `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` > ? or `TBT14_SUBJECT_ID` = ? and `TBT14_STUDY_ID` = ? and `TBT14_MEMO_NO` > ?) ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000S8", "SELECT `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` WHERE ( `TBT14_STUDY_ID` < ? or `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` < ? or `TBT14_SUBJECT_ID` = ? and `TBT14_STUDY_ID` = ? and `TBT14_MEMO_NO` < ?) ORDER BY `TBT14_STUDY_ID` DESC, `TBT14_SUBJECT_ID` DESC, `TBT14_MEMO_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000S9", "INSERT INTO `TBT14_CRF_MEMO`(`TBT14_MEMO_NO`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_CNT`, `TBT14_CRF_ID`, `TBT14_CRF_EDA_NO`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_PROG_NM`, `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000S10", "UPDATE `TBT14_CRF_MEMO` SET `TBT14_CRT_DATETIME`=?, `TBT14_CRT_USER_ID`=?, `TBT14_UPD_DATETIME`=?, `TBT14_UPD_USER_ID`=?, `TBT14_UPD_CNT`=?, `TBT14_CRF_ID`=?, `TBT14_CRF_EDA_NO`=?, `TBT14_CRF_VERSION`=?, `TBT14_MEMO_KBN`=?, `TBT14_MEMO`=?, `TBT14_REQUEST_SITE_ID`=?, `TBT14_REQUEST_AUTH_CD`=?, `TBT14_CRT_AUTH_CD`=?, `TBT14_KAKUNIN_FLG`=?, `TBT14_KAKUNIN_USER_ID`=?, `TBT14_KAKUNIN_COMMENT`=?, `TBT14_KANRYO_FLG`=?, `TBT14_DEL_FLG`=?, `TBT14_CRT_PROG_NM`=?, `TBT14_UPD_PROG_NM`=?  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T000S11", "DELETE FROM `TBT14_CRF_MEMO`  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T000S12", "SELECT `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO` FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000S13", "SELECT `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000S14", "SELECT `TBT01_STUDY_ID` AS TBT14_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(22) ;
               ((int[]) buf[42])[0] = rslt.getInt(23) ;
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(22) ;
               ((int[]) buf[42])[0] = rslt.getInt(23) ;
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               return;
            case 3 :
               ((short[]) buf[0])[0] = rslt.getShort(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((long[]) buf[9])[0] = rslt.getLong(6) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(22) ;
               ((int[]) buf[42])[0] = rslt.getInt(23) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               return;
            case 12 :
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
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               return;
            case 7 :
               stmt.setShort(1, ((Number) parms[0]).shortValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(2, (java.util.Date)parms[2], false);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 128);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[6], false);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 128);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(6, ((Number) parms[10]).longValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[12]).shortValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[16]).shortValue());
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 2000);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 20);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 2);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 128);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 2000);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 1);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 40);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 40);
               }
               stmt.setLong(22, ((Number) parms[41]).longValue());
               stmt.setInt(23, ((Number) parms[42]).intValue());
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
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 2000);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 20);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 2);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 2);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 128);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 2000);
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
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 1);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 40);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 40);
               }
               stmt.setLong(21, ((Number) parms[40]).longValue());
               stmt.setInt(22, ((Number) parms[41]).intValue());
               stmt.setShort(23, ((Number) parms[42]).shortValue());
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

