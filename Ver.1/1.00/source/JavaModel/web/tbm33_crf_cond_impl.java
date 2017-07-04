/*
               File: tbm33_crf_cond_impl
        Description: CRF条件マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:1.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm33_crf_cond_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM33_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm33_crt_user_id0L20( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM33_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm33_upd_user_id0L20( Gx_mode) ;
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
      Form.getMeta().addItem("Description", "CRF条件マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM33_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbm33_crf_cond_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm33_crf_cond_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm33_crf_cond_impl.class ));
   }

   public tbm33_crf_cond_impl( int remoteHandle ,
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
         wb_table1_2_0L20( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0L20e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0L20( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0L20( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0L20( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0L20e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRF条件マスタ"+"</legend>") ;
         wb_table3_27_0L20( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0L20e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0L20e( true) ;
      }
      else
      {
         wb_table1_2_0L20e( false) ;
      }
   }

   public void wb_table3_27_0L20( boolean wbgen )
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
         wb_table4_33_0L20( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0L20e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM33_CRF_COND.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 142,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM33_CRF_COND.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0L20e( true) ;
      }
      else
      {
         wb_table3_27_0L20e( false) ;
      }
   }

   public void wb_table4_33_0L20( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_study_id_Internalname, "試験ID", "", "", lblTextblocktbm33_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A246TBM33_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM33_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A246TBM33_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A246TBM33_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM33_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_crf_id_Internalname, "CRFID", "", "", lblTextblocktbm33_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A247TBM33_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBM33_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A247TBM33_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A247TBM33_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM33_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_cond_no_Internalname, "条件番号", "", "", lblTextblocktbm33_cond_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_COND_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A248TBM33_COND_NO, (byte)(4), (byte)(0), ".", "")), ((edtTBM33_COND_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A248TBM33_COND_NO), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A248TBM33_COND_NO), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM33_COND_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_COND_NO_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_cond_nm_Internalname, "条件名", "", "", lblTextblocktbm33_cond_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A379TBM33_COND_NM", A379TBM33_COND_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_COND_NM_Internalname, GXutil.rtrim( A379TBM33_COND_NM), GXutil.rtrim( localUtil.format( A379TBM33_COND_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM33_COND_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_COND_NM_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_expression_Internalname, "条件式", "", "", lblTextblocktbm33_expression_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A249TBM33_EXPRESSION", A249TBM33_EXPRESSION);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM33_EXPRESSION_Internalname, GXutil.rtrim( A249TBM33_EXPRESSION), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", (short)(0), 1, edtTBM33_EXPRESSION_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "1000", -1, "", true, "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_cond_div_Internalname, "条件区分", "", "", lblTextblocktbm33_cond_div_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A380TBM33_COND_DIV", A380TBM33_COND_DIV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_COND_DIV_Internalname, GXutil.rtrim( A380TBM33_COND_DIV), GXutil.rtrim( localUtil.format( A380TBM33_COND_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM33_COND_DIV_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_COND_DIV_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_crf_item_cd_Internalname, "CRF項目コード", "", "", lblTextblocktbm33_crf_item_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A381TBM33_CRF_ITEM_CD", A381TBM33_CRF_ITEM_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_CRF_ITEM_CD_Internalname, GXutil.rtrim( A381TBM33_CRF_ITEM_CD), GXutil.rtrim( localUtil.format( A381TBM33_CRF_ITEM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM33_CRF_ITEM_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_CRF_ITEM_CD_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_prior_no_Internalname, "優先順", "", "", lblTextblocktbm33_prior_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A250TBM33_PRIOR_NO", GXutil.ltrim( GXutil.str( A250TBM33_PRIOR_NO, 2, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_PRIOR_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A250TBM33_PRIOR_NO, (byte)(2), (byte)(0), ".", "")), ((edtTBM33_PRIOR_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A250TBM33_PRIOR_NO), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A250TBM33_PRIOR_NO), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM33_PRIOR_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_PRIOR_NO_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_err_div_Internalname, "エラー・警告区分", "", "", lblTextblocktbm33_err_div_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A382TBM33_ERR_DIV", A382TBM33_ERR_DIV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_ERR_DIV_Internalname, GXutil.rtrim( A382TBM33_ERR_DIV), GXutil.rtrim( localUtil.format( A382TBM33_ERR_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM33_ERR_DIV_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_ERR_DIV_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_err_msg_Internalname, "エラー・警告メッセージ", "", "", lblTextblocktbm33_err_msg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A383TBM33_ERR_MSG", A383TBM33_ERR_MSG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM33_ERR_MSG_Internalname, GXutil.rtrim( A383TBM33_ERR_MSG), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", (short)(0), 1, edtTBM33_ERR_MSG_Enabled, 0, 80, "chr", 3, "row", StyleString, ClassString, "200", -1, "", true, "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_enabled_flg_Internalname, "有効フラグ", "", "", lblTextblocktbm33_enabled_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A554TBM33_ENABLED_FLG", A554TBM33_ENABLED_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_ENABLED_FLG_Internalname, GXutil.rtrim( A554TBM33_ENABLED_FLG), GXutil.rtrim( localUtil.format( A554TBM33_ENABLED_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM33_ENABLED_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_ENABLED_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_required_input_flg_Internalname, "必須入力フラグ", "", "", lblTextblocktbm33_required_input_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A610TBM33_REQUIRED_INPUT_FLG", A610TBM33_REQUIRED_INPUT_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_REQUIRED_INPUT_FLG_Internalname, GXutil.rtrim( A610TBM33_REQUIRED_INPUT_FLG), GXutil.rtrim( localUtil.format( A610TBM33_REQUIRED_INPUT_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM33_REQUIRED_INPUT_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_REQUIRED_INPUT_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_numeric_range_flg_Internalname, "数値入力範囲条件フラグ", "", "", lblTextblocktbm33_numeric_range_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A611TBM33_NUMERIC_RANGE_FLG", A611TBM33_NUMERIC_RANGE_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_NUMERIC_RANGE_FLG_Internalname, GXutil.rtrim( A611TBM33_NUMERIC_RANGE_FLG), GXutil.rtrim( localUtil.format( A611TBM33_NUMERIC_RANGE_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTBM33_NUMERIC_RANGE_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_NUMERIC_RANGE_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm33_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A251TBM33_DEL_FLG", A251TBM33_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_DEL_FLG_Internalname, GXutil.rtrim( A251TBM33_DEL_FLG), GXutil.rtrim( localUtil.format( A251TBM33_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtTBM33_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm33_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A252TBM33_CRT_DATETIME", localUtil.ttoc( A252TBM33_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM33_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_CRT_DATETIME_Internalname, localUtil.format(A252TBM33_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A252TBM33_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(108);\"", "", "", "", "", edtTBM33_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM33_CRF_COND.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM33_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM33_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm33_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A253TBM33_CRT_USER_ID", A253TBM33_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_CRT_USER_ID_Internalname, GXutil.rtrim( A253TBM33_CRT_USER_ID), GXutil.rtrim( localUtil.format( A253TBM33_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(113);\"", "", "", "", "", edtTBM33_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm33_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A254TBM33_CRT_PROG_NM", A254TBM33_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_CRT_PROG_NM_Internalname, GXutil.rtrim( A254TBM33_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A254TBM33_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(118);\"", "", "", "", "", edtTBM33_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm33_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A255TBM33_UPD_DATETIME", localUtil.ttoc( A255TBM33_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM33_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_UPD_DATETIME_Internalname, localUtil.format(A255TBM33_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A255TBM33_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(123);\"", "", "", "", "", edtTBM33_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM33_CRF_COND.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM33_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM33_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm33_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A256TBM33_UPD_USER_ID", A256TBM33_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_UPD_USER_ID_Internalname, GXutil.rtrim( A256TBM33_UPD_USER_ID), GXutil.rtrim( localUtil.format( A256TBM33_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(128);\"", "", "", "", "", edtTBM33_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm33_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A257TBM33_UPD_PROG_NM", A257TBM33_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_UPD_PROG_NM_Internalname, GXutil.rtrim( A257TBM33_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A257TBM33_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(133);\"", "", "", "", "", edtTBM33_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm33_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm33_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A258TBM33_UPD_CNT", GXutil.ltrim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM33_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A258TBM33_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM33_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A258TBM33_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A258TBM33_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(138);\"", "", "", "", "", edtTBM33_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM33_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM33_CRF_COND.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0L20e( true) ;
      }
      else
      {
         wb_table4_33_0L20e( false) ;
      }
   }

   public void wb_table2_5_0L20( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM33_CRF_COND.htm");
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
         wb_table2_5_0L20e( true) ;
      }
      else
      {
         wb_table2_5_0L20e( false) ;
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
      /* Execute user event: e110L2 */
      e110L2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM33_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM33_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM33_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM33_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A246TBM33_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
            }
            else
            {
               A246TBM33_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM33_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM33_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM33_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM33_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM33_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A247TBM33_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
            }
            else
            {
               A247TBM33_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM33_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM33_COND_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM33_COND_NO_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM33_COND_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM33_COND_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A248TBM33_COND_NO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
            }
            else
            {
               A248TBM33_COND_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM33_COND_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
            }
            A379TBM33_COND_NM = httpContext.cgiGet( edtTBM33_COND_NM_Internalname) ;
            n379TBM33_COND_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A379TBM33_COND_NM", A379TBM33_COND_NM);
            n379TBM33_COND_NM = ((GXutil.strcmp("", A379TBM33_COND_NM)==0) ? true : false) ;
            A249TBM33_EXPRESSION = httpContext.cgiGet( edtTBM33_EXPRESSION_Internalname) ;
            n249TBM33_EXPRESSION = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A249TBM33_EXPRESSION", A249TBM33_EXPRESSION);
            n249TBM33_EXPRESSION = ((GXutil.strcmp("", A249TBM33_EXPRESSION)==0) ? true : false) ;
            A380TBM33_COND_DIV = httpContext.cgiGet( edtTBM33_COND_DIV_Internalname) ;
            n380TBM33_COND_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A380TBM33_COND_DIV", A380TBM33_COND_DIV);
            n380TBM33_COND_DIV = ((GXutil.strcmp("", A380TBM33_COND_DIV)==0) ? true : false) ;
            A381TBM33_CRF_ITEM_CD = httpContext.cgiGet( edtTBM33_CRF_ITEM_CD_Internalname) ;
            n381TBM33_CRF_ITEM_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A381TBM33_CRF_ITEM_CD", A381TBM33_CRF_ITEM_CD);
            n381TBM33_CRF_ITEM_CD = ((GXutil.strcmp("", A381TBM33_CRF_ITEM_CD)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM33_PRIOR_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM33_PRIOR_NO_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM33_PRIOR_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM33_PRIOR_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A250TBM33_PRIOR_NO = (byte)(0) ;
               n250TBM33_PRIOR_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A250TBM33_PRIOR_NO", GXutil.ltrim( GXutil.str( A250TBM33_PRIOR_NO, 2, 0)));
            }
            else
            {
               A250TBM33_PRIOR_NO = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM33_PRIOR_NO_Internalname), ".", ",")) ;
               n250TBM33_PRIOR_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A250TBM33_PRIOR_NO", GXutil.ltrim( GXutil.str( A250TBM33_PRIOR_NO, 2, 0)));
            }
            n250TBM33_PRIOR_NO = ((0==A250TBM33_PRIOR_NO) ? true : false) ;
            A382TBM33_ERR_DIV = httpContext.cgiGet( edtTBM33_ERR_DIV_Internalname) ;
            n382TBM33_ERR_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A382TBM33_ERR_DIV", A382TBM33_ERR_DIV);
            n382TBM33_ERR_DIV = ((GXutil.strcmp("", A382TBM33_ERR_DIV)==0) ? true : false) ;
            A383TBM33_ERR_MSG = httpContext.cgiGet( edtTBM33_ERR_MSG_Internalname) ;
            n383TBM33_ERR_MSG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A383TBM33_ERR_MSG", A383TBM33_ERR_MSG);
            n383TBM33_ERR_MSG = ((GXutil.strcmp("", A383TBM33_ERR_MSG)==0) ? true : false) ;
            A554TBM33_ENABLED_FLG = httpContext.cgiGet( edtTBM33_ENABLED_FLG_Internalname) ;
            n554TBM33_ENABLED_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A554TBM33_ENABLED_FLG", A554TBM33_ENABLED_FLG);
            n554TBM33_ENABLED_FLG = ((GXutil.strcmp("", A554TBM33_ENABLED_FLG)==0) ? true : false) ;
            A610TBM33_REQUIRED_INPUT_FLG = httpContext.cgiGet( edtTBM33_REQUIRED_INPUT_FLG_Internalname) ;
            n610TBM33_REQUIRED_INPUT_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A610TBM33_REQUIRED_INPUT_FLG", A610TBM33_REQUIRED_INPUT_FLG);
            n610TBM33_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A610TBM33_REQUIRED_INPUT_FLG)==0) ? true : false) ;
            A611TBM33_NUMERIC_RANGE_FLG = httpContext.cgiGet( edtTBM33_NUMERIC_RANGE_FLG_Internalname) ;
            n611TBM33_NUMERIC_RANGE_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A611TBM33_NUMERIC_RANGE_FLG", A611TBM33_NUMERIC_RANGE_FLG);
            n611TBM33_NUMERIC_RANGE_FLG = ((GXutil.strcmp("", A611TBM33_NUMERIC_RANGE_FLG)==0) ? true : false) ;
            A251TBM33_DEL_FLG = httpContext.cgiGet( edtTBM33_DEL_FLG_Internalname) ;
            n251TBM33_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A251TBM33_DEL_FLG", A251TBM33_DEL_FLG);
            n251TBM33_DEL_FLG = ((GXutil.strcmp("", A251TBM33_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM33_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM33_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM33_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A252TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n252TBM33_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252TBM33_CRT_DATETIME", localUtil.ttoc( A252TBM33_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A252TBM33_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM33_CRT_DATETIME_Internalname)) ;
               n252TBM33_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A252TBM33_CRT_DATETIME", localUtil.ttoc( A252TBM33_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n252TBM33_CRT_DATETIME = (GXutil.nullDate().equals(A252TBM33_CRT_DATETIME) ? true : false) ;
            A253TBM33_CRT_USER_ID = httpContext.cgiGet( edtTBM33_CRT_USER_ID_Internalname) ;
            n253TBM33_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A253TBM33_CRT_USER_ID", A253TBM33_CRT_USER_ID);
            n253TBM33_CRT_USER_ID = ((GXutil.strcmp("", A253TBM33_CRT_USER_ID)==0) ? true : false) ;
            A254TBM33_CRT_PROG_NM = httpContext.cgiGet( edtTBM33_CRT_PROG_NM_Internalname) ;
            n254TBM33_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A254TBM33_CRT_PROG_NM", A254TBM33_CRT_PROG_NM);
            n254TBM33_CRT_PROG_NM = ((GXutil.strcmp("", A254TBM33_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM33_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM33_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM33_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A255TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n255TBM33_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A255TBM33_UPD_DATETIME", localUtil.ttoc( A255TBM33_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A255TBM33_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM33_UPD_DATETIME_Internalname)) ;
               n255TBM33_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A255TBM33_UPD_DATETIME", localUtil.ttoc( A255TBM33_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n255TBM33_UPD_DATETIME = (GXutil.nullDate().equals(A255TBM33_UPD_DATETIME) ? true : false) ;
            A256TBM33_UPD_USER_ID = httpContext.cgiGet( edtTBM33_UPD_USER_ID_Internalname) ;
            n256TBM33_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A256TBM33_UPD_USER_ID", A256TBM33_UPD_USER_ID);
            n256TBM33_UPD_USER_ID = ((GXutil.strcmp("", A256TBM33_UPD_USER_ID)==0) ? true : false) ;
            A257TBM33_UPD_PROG_NM = httpContext.cgiGet( edtTBM33_UPD_PROG_NM_Internalname) ;
            n257TBM33_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A257TBM33_UPD_PROG_NM", A257TBM33_UPD_PROG_NM);
            n257TBM33_UPD_PROG_NM = ((GXutil.strcmp("", A257TBM33_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM33_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM33_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM33_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM33_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A258TBM33_UPD_CNT = 0 ;
               n258TBM33_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A258TBM33_UPD_CNT", GXutil.ltrim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)));
            }
            else
            {
               A258TBM33_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM33_UPD_CNT_Internalname), ".", ",") ;
               n258TBM33_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A258TBM33_UPD_CNT", GXutil.ltrim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)));
            }
            n258TBM33_UPD_CNT = ((0==A258TBM33_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z246TBM33_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z246TBM33_STUDY_ID"), ".", ",") ;
            Z247TBM33_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z247TBM33_CRF_ID"), ".", ",")) ;
            Z248TBM33_COND_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z248TBM33_COND_NO"), ".", ",")) ;
            Z252TBM33_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z252TBM33_CRT_DATETIME"), 0) ;
            n252TBM33_CRT_DATETIME = (GXutil.nullDate().equals(A252TBM33_CRT_DATETIME) ? true : false) ;
            Z253TBM33_CRT_USER_ID = httpContext.cgiGet( "Z253TBM33_CRT_USER_ID") ;
            n253TBM33_CRT_USER_ID = ((GXutil.strcmp("", A253TBM33_CRT_USER_ID)==0) ? true : false) ;
            Z255TBM33_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z255TBM33_UPD_DATETIME"), 0) ;
            n255TBM33_UPD_DATETIME = (GXutil.nullDate().equals(A255TBM33_UPD_DATETIME) ? true : false) ;
            Z256TBM33_UPD_USER_ID = httpContext.cgiGet( "Z256TBM33_UPD_USER_ID") ;
            n256TBM33_UPD_USER_ID = ((GXutil.strcmp("", A256TBM33_UPD_USER_ID)==0) ? true : false) ;
            Z258TBM33_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z258TBM33_UPD_CNT"), ".", ",") ;
            n258TBM33_UPD_CNT = ((0==A258TBM33_UPD_CNT) ? true : false) ;
            Z379TBM33_COND_NM = httpContext.cgiGet( "Z379TBM33_COND_NM") ;
            n379TBM33_COND_NM = ((GXutil.strcmp("", A379TBM33_COND_NM)==0) ? true : false) ;
            Z249TBM33_EXPRESSION = httpContext.cgiGet( "Z249TBM33_EXPRESSION") ;
            n249TBM33_EXPRESSION = ((GXutil.strcmp("", A249TBM33_EXPRESSION)==0) ? true : false) ;
            Z380TBM33_COND_DIV = httpContext.cgiGet( "Z380TBM33_COND_DIV") ;
            n380TBM33_COND_DIV = ((GXutil.strcmp("", A380TBM33_COND_DIV)==0) ? true : false) ;
            Z381TBM33_CRF_ITEM_CD = httpContext.cgiGet( "Z381TBM33_CRF_ITEM_CD") ;
            n381TBM33_CRF_ITEM_CD = ((GXutil.strcmp("", A381TBM33_CRF_ITEM_CD)==0) ? true : false) ;
            Z250TBM33_PRIOR_NO = (byte)(localUtil.ctol( httpContext.cgiGet( "Z250TBM33_PRIOR_NO"), ".", ",")) ;
            n250TBM33_PRIOR_NO = ((0==A250TBM33_PRIOR_NO) ? true : false) ;
            Z382TBM33_ERR_DIV = httpContext.cgiGet( "Z382TBM33_ERR_DIV") ;
            n382TBM33_ERR_DIV = ((GXutil.strcmp("", A382TBM33_ERR_DIV)==0) ? true : false) ;
            Z383TBM33_ERR_MSG = httpContext.cgiGet( "Z383TBM33_ERR_MSG") ;
            n383TBM33_ERR_MSG = ((GXutil.strcmp("", A383TBM33_ERR_MSG)==0) ? true : false) ;
            Z554TBM33_ENABLED_FLG = httpContext.cgiGet( "Z554TBM33_ENABLED_FLG") ;
            n554TBM33_ENABLED_FLG = ((GXutil.strcmp("", A554TBM33_ENABLED_FLG)==0) ? true : false) ;
            Z610TBM33_REQUIRED_INPUT_FLG = httpContext.cgiGet( "Z610TBM33_REQUIRED_INPUT_FLG") ;
            n610TBM33_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A610TBM33_REQUIRED_INPUT_FLG)==0) ? true : false) ;
            Z611TBM33_NUMERIC_RANGE_FLG = httpContext.cgiGet( "Z611TBM33_NUMERIC_RANGE_FLG") ;
            n611TBM33_NUMERIC_RANGE_FLG = ((GXutil.strcmp("", A611TBM33_NUMERIC_RANGE_FLG)==0) ? true : false) ;
            Z251TBM33_DEL_FLG = httpContext.cgiGet( "Z251TBM33_DEL_FLG") ;
            n251TBM33_DEL_FLG = ((GXutil.strcmp("", A251TBM33_DEL_FLG)==0) ? true : false) ;
            Z254TBM33_CRT_PROG_NM = httpContext.cgiGet( "Z254TBM33_CRT_PROG_NM") ;
            n254TBM33_CRT_PROG_NM = ((GXutil.strcmp("", A254TBM33_CRT_PROG_NM)==0) ? true : false) ;
            Z257TBM33_UPD_PROG_NM = httpContext.cgiGet( "Z257TBM33_UPD_PROG_NM") ;
            n257TBM33_UPD_PROG_NM = ((GXutil.strcmp("", A257TBM33_UPD_PROG_NM)==0) ? true : false) ;
            O258TBM33_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O258TBM33_UPD_CNT"), ".", ",") ;
            n258TBM33_UPD_CNT = ((0==A258TBM33_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV9Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A246TBM33_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
               A247TBM33_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
               A248TBM33_COND_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
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
                     /* Execute user event: e110L2 */
                     e110L2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120L2 */
                     e120L2 ();
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
         /* Execute user event: e120L2 */
         e120L2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0L20( ) ;
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
      disableAttributes0L20( ) ;
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

   public void resetCaption0L0( )
   {
   }

   public void e110L2( )
   {
      /* Start Routine */
      AV8W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_BC_FLG", AV8W_BC_FLG);
      if ( GXutil.strcmp(AV8W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120L2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A247TBM33_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A248TBM33_COND_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A379TBM33_COND_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A249TBM33_EXPRESSION + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A380TBM33_COND_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A381TBM33_CRF_ITEM_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A250TBM33_PRIOR_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A382TBM33_ERR_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A383TBM33_ERR_MSG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A554TBM33_ENABLED_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A610TBM33_REQUIRED_INPUT_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A611TBM33_NUMERIC_RANGE_FLG + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A251TBM33_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A252TBM33_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm33_crf_cond_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252TBM33_CRT_DATETIME", localUtil.ttoc( A252TBM33_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A253TBM33_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A254TBM33_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A255TBM33_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm33_crf_cond_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A255TBM33_UPD_DATETIME", localUtil.ttoc( A255TBM33_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A256TBM33_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A257TBM33_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1174( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0L20( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z252TBM33_CRT_DATETIME = T000L3_A252TBM33_CRT_DATETIME[0] ;
            Z253TBM33_CRT_USER_ID = T000L3_A253TBM33_CRT_USER_ID[0] ;
            Z255TBM33_UPD_DATETIME = T000L3_A255TBM33_UPD_DATETIME[0] ;
            Z256TBM33_UPD_USER_ID = T000L3_A256TBM33_UPD_USER_ID[0] ;
            Z258TBM33_UPD_CNT = T000L3_A258TBM33_UPD_CNT[0] ;
            Z379TBM33_COND_NM = T000L3_A379TBM33_COND_NM[0] ;
            Z249TBM33_EXPRESSION = T000L3_A249TBM33_EXPRESSION[0] ;
            Z380TBM33_COND_DIV = T000L3_A380TBM33_COND_DIV[0] ;
            Z381TBM33_CRF_ITEM_CD = T000L3_A381TBM33_CRF_ITEM_CD[0] ;
            Z250TBM33_PRIOR_NO = T000L3_A250TBM33_PRIOR_NO[0] ;
            Z382TBM33_ERR_DIV = T000L3_A382TBM33_ERR_DIV[0] ;
            Z383TBM33_ERR_MSG = T000L3_A383TBM33_ERR_MSG[0] ;
            Z554TBM33_ENABLED_FLG = T000L3_A554TBM33_ENABLED_FLG[0] ;
            Z610TBM33_REQUIRED_INPUT_FLG = T000L3_A610TBM33_REQUIRED_INPUT_FLG[0] ;
            Z611TBM33_NUMERIC_RANGE_FLG = T000L3_A611TBM33_NUMERIC_RANGE_FLG[0] ;
            Z251TBM33_DEL_FLG = T000L3_A251TBM33_DEL_FLG[0] ;
            Z254TBM33_CRT_PROG_NM = T000L3_A254TBM33_CRT_PROG_NM[0] ;
            Z257TBM33_UPD_PROG_NM = T000L3_A257TBM33_UPD_PROG_NM[0] ;
         }
         else
         {
            Z252TBM33_CRT_DATETIME = A252TBM33_CRT_DATETIME ;
            Z253TBM33_CRT_USER_ID = A253TBM33_CRT_USER_ID ;
            Z255TBM33_UPD_DATETIME = A255TBM33_UPD_DATETIME ;
            Z256TBM33_UPD_USER_ID = A256TBM33_UPD_USER_ID ;
            Z258TBM33_UPD_CNT = A258TBM33_UPD_CNT ;
            Z379TBM33_COND_NM = A379TBM33_COND_NM ;
            Z249TBM33_EXPRESSION = A249TBM33_EXPRESSION ;
            Z380TBM33_COND_DIV = A380TBM33_COND_DIV ;
            Z381TBM33_CRF_ITEM_CD = A381TBM33_CRF_ITEM_CD ;
            Z250TBM33_PRIOR_NO = A250TBM33_PRIOR_NO ;
            Z382TBM33_ERR_DIV = A382TBM33_ERR_DIV ;
            Z383TBM33_ERR_MSG = A383TBM33_ERR_MSG ;
            Z554TBM33_ENABLED_FLG = A554TBM33_ENABLED_FLG ;
            Z610TBM33_REQUIRED_INPUT_FLG = A610TBM33_REQUIRED_INPUT_FLG ;
            Z611TBM33_NUMERIC_RANGE_FLG = A611TBM33_NUMERIC_RANGE_FLG ;
            Z251TBM33_DEL_FLG = A251TBM33_DEL_FLG ;
            Z254TBM33_CRT_PROG_NM = A254TBM33_CRT_PROG_NM ;
            Z257TBM33_UPD_PROG_NM = A257TBM33_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z246TBM33_STUDY_ID = A246TBM33_STUDY_ID ;
         Z247TBM33_CRF_ID = A247TBM33_CRF_ID ;
         Z248TBM33_COND_NO = A248TBM33_COND_NO ;
         Z252TBM33_CRT_DATETIME = A252TBM33_CRT_DATETIME ;
         Z253TBM33_CRT_USER_ID = A253TBM33_CRT_USER_ID ;
         Z255TBM33_UPD_DATETIME = A255TBM33_UPD_DATETIME ;
         Z256TBM33_UPD_USER_ID = A256TBM33_UPD_USER_ID ;
         Z258TBM33_UPD_CNT = A258TBM33_UPD_CNT ;
         Z379TBM33_COND_NM = A379TBM33_COND_NM ;
         Z249TBM33_EXPRESSION = A249TBM33_EXPRESSION ;
         Z380TBM33_COND_DIV = A380TBM33_COND_DIV ;
         Z381TBM33_CRF_ITEM_CD = A381TBM33_CRF_ITEM_CD ;
         Z250TBM33_PRIOR_NO = A250TBM33_PRIOR_NO ;
         Z382TBM33_ERR_DIV = A382TBM33_ERR_DIV ;
         Z383TBM33_ERR_MSG = A383TBM33_ERR_MSG ;
         Z554TBM33_ENABLED_FLG = A554TBM33_ENABLED_FLG ;
         Z610TBM33_REQUIRED_INPUT_FLG = A610TBM33_REQUIRED_INPUT_FLG ;
         Z611TBM33_NUMERIC_RANGE_FLG = A611TBM33_NUMERIC_RANGE_FLG ;
         Z251TBM33_DEL_FLG = A251TBM33_DEL_FLG ;
         Z254TBM33_CRT_PROG_NM = A254TBM33_CRT_PROG_NM ;
         Z257TBM33_UPD_PROG_NM = A257TBM33_UPD_PROG_NM ;
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

   public void load0L20( )
   {
      /* Using cursor T000L4 */
      pr_default.execute(2, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A252TBM33_CRT_DATETIME = T000L4_A252TBM33_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252TBM33_CRT_DATETIME", localUtil.ttoc( A252TBM33_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n252TBM33_CRT_DATETIME = T000L4_n252TBM33_CRT_DATETIME[0] ;
         A253TBM33_CRT_USER_ID = T000L4_A253TBM33_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A253TBM33_CRT_USER_ID", A253TBM33_CRT_USER_ID);
         n253TBM33_CRT_USER_ID = T000L4_n253TBM33_CRT_USER_ID[0] ;
         A255TBM33_UPD_DATETIME = T000L4_A255TBM33_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A255TBM33_UPD_DATETIME", localUtil.ttoc( A255TBM33_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n255TBM33_UPD_DATETIME = T000L4_n255TBM33_UPD_DATETIME[0] ;
         A256TBM33_UPD_USER_ID = T000L4_A256TBM33_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A256TBM33_UPD_USER_ID", A256TBM33_UPD_USER_ID);
         n256TBM33_UPD_USER_ID = T000L4_n256TBM33_UPD_USER_ID[0] ;
         A258TBM33_UPD_CNT = T000L4_A258TBM33_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A258TBM33_UPD_CNT", GXutil.ltrim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)));
         n258TBM33_UPD_CNT = T000L4_n258TBM33_UPD_CNT[0] ;
         A379TBM33_COND_NM = T000L4_A379TBM33_COND_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A379TBM33_COND_NM", A379TBM33_COND_NM);
         n379TBM33_COND_NM = T000L4_n379TBM33_COND_NM[0] ;
         A249TBM33_EXPRESSION = T000L4_A249TBM33_EXPRESSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A249TBM33_EXPRESSION", A249TBM33_EXPRESSION);
         n249TBM33_EXPRESSION = T000L4_n249TBM33_EXPRESSION[0] ;
         A380TBM33_COND_DIV = T000L4_A380TBM33_COND_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A380TBM33_COND_DIV", A380TBM33_COND_DIV);
         n380TBM33_COND_DIV = T000L4_n380TBM33_COND_DIV[0] ;
         A381TBM33_CRF_ITEM_CD = T000L4_A381TBM33_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A381TBM33_CRF_ITEM_CD", A381TBM33_CRF_ITEM_CD);
         n381TBM33_CRF_ITEM_CD = T000L4_n381TBM33_CRF_ITEM_CD[0] ;
         A250TBM33_PRIOR_NO = T000L4_A250TBM33_PRIOR_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A250TBM33_PRIOR_NO", GXutil.ltrim( GXutil.str( A250TBM33_PRIOR_NO, 2, 0)));
         n250TBM33_PRIOR_NO = T000L4_n250TBM33_PRIOR_NO[0] ;
         A382TBM33_ERR_DIV = T000L4_A382TBM33_ERR_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A382TBM33_ERR_DIV", A382TBM33_ERR_DIV);
         n382TBM33_ERR_DIV = T000L4_n382TBM33_ERR_DIV[0] ;
         A383TBM33_ERR_MSG = T000L4_A383TBM33_ERR_MSG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A383TBM33_ERR_MSG", A383TBM33_ERR_MSG);
         n383TBM33_ERR_MSG = T000L4_n383TBM33_ERR_MSG[0] ;
         A554TBM33_ENABLED_FLG = T000L4_A554TBM33_ENABLED_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A554TBM33_ENABLED_FLG", A554TBM33_ENABLED_FLG);
         n554TBM33_ENABLED_FLG = T000L4_n554TBM33_ENABLED_FLG[0] ;
         A610TBM33_REQUIRED_INPUT_FLG = T000L4_A610TBM33_REQUIRED_INPUT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A610TBM33_REQUIRED_INPUT_FLG", A610TBM33_REQUIRED_INPUT_FLG);
         n610TBM33_REQUIRED_INPUT_FLG = T000L4_n610TBM33_REQUIRED_INPUT_FLG[0] ;
         A611TBM33_NUMERIC_RANGE_FLG = T000L4_A611TBM33_NUMERIC_RANGE_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A611TBM33_NUMERIC_RANGE_FLG", A611TBM33_NUMERIC_RANGE_FLG);
         n611TBM33_NUMERIC_RANGE_FLG = T000L4_n611TBM33_NUMERIC_RANGE_FLG[0] ;
         A251TBM33_DEL_FLG = T000L4_A251TBM33_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A251TBM33_DEL_FLG", A251TBM33_DEL_FLG);
         n251TBM33_DEL_FLG = T000L4_n251TBM33_DEL_FLG[0] ;
         A254TBM33_CRT_PROG_NM = T000L4_A254TBM33_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A254TBM33_CRT_PROG_NM", A254TBM33_CRT_PROG_NM);
         n254TBM33_CRT_PROG_NM = T000L4_n254TBM33_CRT_PROG_NM[0] ;
         A257TBM33_UPD_PROG_NM = T000L4_A257TBM33_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A257TBM33_UPD_PROG_NM", A257TBM33_UPD_PROG_NM);
         n257TBM33_UPD_PROG_NM = T000L4_n257TBM33_UPD_PROG_NM[0] ;
         zm0L20( -8) ;
      }
      pr_default.close(2);
      onLoadActions0L20( ) ;
   }

   public void onLoadActions0L20( )
   {
      AV9Pgmname = "TBM33_CRF_COND" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0L20( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM33_CRF_COND" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A252TBM33_CRT_DATETIME) || (( A252TBM33_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A252TBM33_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A255TBM33_UPD_DATETIME) || (( A255TBM33_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A255TBM33_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0L20( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0L20( )
   {
      /* Using cursor T000L5 */
      pr_default.execute(3, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound20 = (short)(1) ;
      }
      else
      {
         RcdFound20 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000L3 */
      pr_default.execute(1, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0L20( 8) ;
         RcdFound20 = (short)(1) ;
         A246TBM33_STUDY_ID = T000L3_A246TBM33_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
         A247TBM33_CRF_ID = T000L3_A247TBM33_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
         A248TBM33_COND_NO = T000L3_A248TBM33_COND_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
         A252TBM33_CRT_DATETIME = T000L3_A252TBM33_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A252TBM33_CRT_DATETIME", localUtil.ttoc( A252TBM33_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n252TBM33_CRT_DATETIME = T000L3_n252TBM33_CRT_DATETIME[0] ;
         A253TBM33_CRT_USER_ID = T000L3_A253TBM33_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A253TBM33_CRT_USER_ID", A253TBM33_CRT_USER_ID);
         n253TBM33_CRT_USER_ID = T000L3_n253TBM33_CRT_USER_ID[0] ;
         A255TBM33_UPD_DATETIME = T000L3_A255TBM33_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A255TBM33_UPD_DATETIME", localUtil.ttoc( A255TBM33_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n255TBM33_UPD_DATETIME = T000L3_n255TBM33_UPD_DATETIME[0] ;
         A256TBM33_UPD_USER_ID = T000L3_A256TBM33_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A256TBM33_UPD_USER_ID", A256TBM33_UPD_USER_ID);
         n256TBM33_UPD_USER_ID = T000L3_n256TBM33_UPD_USER_ID[0] ;
         A258TBM33_UPD_CNT = T000L3_A258TBM33_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A258TBM33_UPD_CNT", GXutil.ltrim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)));
         n258TBM33_UPD_CNT = T000L3_n258TBM33_UPD_CNT[0] ;
         A379TBM33_COND_NM = T000L3_A379TBM33_COND_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A379TBM33_COND_NM", A379TBM33_COND_NM);
         n379TBM33_COND_NM = T000L3_n379TBM33_COND_NM[0] ;
         A249TBM33_EXPRESSION = T000L3_A249TBM33_EXPRESSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A249TBM33_EXPRESSION", A249TBM33_EXPRESSION);
         n249TBM33_EXPRESSION = T000L3_n249TBM33_EXPRESSION[0] ;
         A380TBM33_COND_DIV = T000L3_A380TBM33_COND_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A380TBM33_COND_DIV", A380TBM33_COND_DIV);
         n380TBM33_COND_DIV = T000L3_n380TBM33_COND_DIV[0] ;
         A381TBM33_CRF_ITEM_CD = T000L3_A381TBM33_CRF_ITEM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A381TBM33_CRF_ITEM_CD", A381TBM33_CRF_ITEM_CD);
         n381TBM33_CRF_ITEM_CD = T000L3_n381TBM33_CRF_ITEM_CD[0] ;
         A250TBM33_PRIOR_NO = T000L3_A250TBM33_PRIOR_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A250TBM33_PRIOR_NO", GXutil.ltrim( GXutil.str( A250TBM33_PRIOR_NO, 2, 0)));
         n250TBM33_PRIOR_NO = T000L3_n250TBM33_PRIOR_NO[0] ;
         A382TBM33_ERR_DIV = T000L3_A382TBM33_ERR_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A382TBM33_ERR_DIV", A382TBM33_ERR_DIV);
         n382TBM33_ERR_DIV = T000L3_n382TBM33_ERR_DIV[0] ;
         A383TBM33_ERR_MSG = T000L3_A383TBM33_ERR_MSG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A383TBM33_ERR_MSG", A383TBM33_ERR_MSG);
         n383TBM33_ERR_MSG = T000L3_n383TBM33_ERR_MSG[0] ;
         A554TBM33_ENABLED_FLG = T000L3_A554TBM33_ENABLED_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A554TBM33_ENABLED_FLG", A554TBM33_ENABLED_FLG);
         n554TBM33_ENABLED_FLG = T000L3_n554TBM33_ENABLED_FLG[0] ;
         A610TBM33_REQUIRED_INPUT_FLG = T000L3_A610TBM33_REQUIRED_INPUT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A610TBM33_REQUIRED_INPUT_FLG", A610TBM33_REQUIRED_INPUT_FLG);
         n610TBM33_REQUIRED_INPUT_FLG = T000L3_n610TBM33_REQUIRED_INPUT_FLG[0] ;
         A611TBM33_NUMERIC_RANGE_FLG = T000L3_A611TBM33_NUMERIC_RANGE_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A611TBM33_NUMERIC_RANGE_FLG", A611TBM33_NUMERIC_RANGE_FLG);
         n611TBM33_NUMERIC_RANGE_FLG = T000L3_n611TBM33_NUMERIC_RANGE_FLG[0] ;
         A251TBM33_DEL_FLG = T000L3_A251TBM33_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A251TBM33_DEL_FLG", A251TBM33_DEL_FLG);
         n251TBM33_DEL_FLG = T000L3_n251TBM33_DEL_FLG[0] ;
         A254TBM33_CRT_PROG_NM = T000L3_A254TBM33_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A254TBM33_CRT_PROG_NM", A254TBM33_CRT_PROG_NM);
         n254TBM33_CRT_PROG_NM = T000L3_n254TBM33_CRT_PROG_NM[0] ;
         A257TBM33_UPD_PROG_NM = T000L3_A257TBM33_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A257TBM33_UPD_PROG_NM", A257TBM33_UPD_PROG_NM);
         n257TBM33_UPD_PROG_NM = T000L3_n257TBM33_UPD_PROG_NM[0] ;
         O258TBM33_UPD_CNT = A258TBM33_UPD_CNT ;
         n258TBM33_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A258TBM33_UPD_CNT", GXutil.ltrim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)));
         Z246TBM33_STUDY_ID = A246TBM33_STUDY_ID ;
         Z247TBM33_CRF_ID = A247TBM33_CRF_ID ;
         Z248TBM33_COND_NO = A248TBM33_COND_NO ;
         sMode20 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0L20( ) ;
         Gx_mode = sMode20 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound20 = (short)(0) ;
         initializeNonKey0L20( ) ;
         sMode20 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode20 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0L20( ) ;
      if ( RcdFound20 == 0 )
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
      RcdFound20 = (short)(0) ;
      /* Using cursor T000L6 */
      pr_default.execute(4, new Object[] {new Long(A246TBM33_STUDY_ID), new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A247TBM33_CRF_ID), new Long(A246TBM33_STUDY_ID), new Short(A248TBM33_COND_NO)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000L6_A246TBM33_STUDY_ID[0] < A246TBM33_STUDY_ID ) || ( T000L6_A246TBM33_STUDY_ID[0] == A246TBM33_STUDY_ID ) && ( T000L6_A247TBM33_CRF_ID[0] < A247TBM33_CRF_ID ) || ( T000L6_A247TBM33_CRF_ID[0] == A247TBM33_CRF_ID ) && ( T000L6_A246TBM33_STUDY_ID[0] == A246TBM33_STUDY_ID ) && ( T000L6_A248TBM33_COND_NO[0] < A248TBM33_COND_NO ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000L6_A246TBM33_STUDY_ID[0] > A246TBM33_STUDY_ID ) || ( T000L6_A246TBM33_STUDY_ID[0] == A246TBM33_STUDY_ID ) && ( T000L6_A247TBM33_CRF_ID[0] > A247TBM33_CRF_ID ) || ( T000L6_A247TBM33_CRF_ID[0] == A247TBM33_CRF_ID ) && ( T000L6_A246TBM33_STUDY_ID[0] == A246TBM33_STUDY_ID ) && ( T000L6_A248TBM33_COND_NO[0] > A248TBM33_COND_NO ) ) )
         {
            A246TBM33_STUDY_ID = T000L6_A246TBM33_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
            A247TBM33_CRF_ID = T000L6_A247TBM33_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
            A248TBM33_COND_NO = T000L6_A248TBM33_COND_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
            RcdFound20 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound20 = (short)(0) ;
      /* Using cursor T000L7 */
      pr_default.execute(5, new Object[] {new Long(A246TBM33_STUDY_ID), new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A247TBM33_CRF_ID), new Long(A246TBM33_STUDY_ID), new Short(A248TBM33_COND_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000L7_A246TBM33_STUDY_ID[0] > A246TBM33_STUDY_ID ) || ( T000L7_A246TBM33_STUDY_ID[0] == A246TBM33_STUDY_ID ) && ( T000L7_A247TBM33_CRF_ID[0] > A247TBM33_CRF_ID ) || ( T000L7_A247TBM33_CRF_ID[0] == A247TBM33_CRF_ID ) && ( T000L7_A246TBM33_STUDY_ID[0] == A246TBM33_STUDY_ID ) && ( T000L7_A248TBM33_COND_NO[0] > A248TBM33_COND_NO ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000L7_A246TBM33_STUDY_ID[0] < A246TBM33_STUDY_ID ) || ( T000L7_A246TBM33_STUDY_ID[0] == A246TBM33_STUDY_ID ) && ( T000L7_A247TBM33_CRF_ID[0] < A247TBM33_CRF_ID ) || ( T000L7_A247TBM33_CRF_ID[0] == A247TBM33_CRF_ID ) && ( T000L7_A246TBM33_STUDY_ID[0] == A246TBM33_STUDY_ID ) && ( T000L7_A248TBM33_COND_NO[0] < A248TBM33_COND_NO ) ) )
         {
            A246TBM33_STUDY_ID = T000L7_A246TBM33_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
            A247TBM33_CRF_ID = T000L7_A247TBM33_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
            A248TBM33_COND_NO = T000L7_A248TBM33_COND_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
            RcdFound20 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0L20( ) ;
      if ( RcdFound20 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM33_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM33_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A246TBM33_STUDY_ID != Z246TBM33_STUDY_ID ) || ( A247TBM33_CRF_ID != Z247TBM33_CRF_ID ) || ( A248TBM33_COND_NO != Z248TBM33_COND_NO ) )
         {
            A246TBM33_STUDY_ID = Z246TBM33_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
            A247TBM33_CRF_ID = Z247TBM33_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
            A248TBM33_COND_NO = Z248TBM33_COND_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM33_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM33_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBM33_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update0L20( ) ;
            GX_FocusControl = edtTBM33_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A246TBM33_STUDY_ID != Z246TBM33_STUDY_ID ) || ( A247TBM33_CRF_ID != Z247TBM33_CRF_ID ) || ( A248TBM33_COND_NO != Z248TBM33_COND_NO ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBM33_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0L20( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM33_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM33_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM33_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0L20( ) ;
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
      if ( ( A246TBM33_STUDY_ID != Z246TBM33_STUDY_ID ) || ( A247TBM33_CRF_ID != Z247TBM33_CRF_ID ) || ( A248TBM33_COND_NO != Z248TBM33_COND_NO ) )
      {
         A246TBM33_STUDY_ID = Z246TBM33_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
         A247TBM33_CRF_ID = Z247TBM33_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
         A248TBM33_COND_NO = Z248TBM33_COND_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM33_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM33_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM33_STUDY_ID_Internalname ;
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
      if ( RcdFound20 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM33_STUDY_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBM33_COND_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0L20( ) ;
      if ( RcdFound20 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM33_COND_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0L20( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound20 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM33_COND_NM_Internalname ;
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
      if ( RcdFound20 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM33_COND_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0L20( ) ;
      if ( RcdFound20 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound20 != 0 )
         {
            scanNext0L20( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM33_COND_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0L20( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0L20( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000L2 */
         pr_default.execute(0, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM33_CRF_COND"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z252TBM33_CRT_DATETIME.equals( T000L2_A252TBM33_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z253TBM33_CRT_USER_ID, T000L2_A253TBM33_CRT_USER_ID[0]) != 0 ) || !( Z255TBM33_UPD_DATETIME.equals( T000L2_A255TBM33_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z256TBM33_UPD_USER_ID, T000L2_A256TBM33_UPD_USER_ID[0]) != 0 ) || ( Z258TBM33_UPD_CNT != T000L2_A258TBM33_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z379TBM33_COND_NM, T000L2_A379TBM33_COND_NM[0]) != 0 ) || ( GXutil.strcmp(Z249TBM33_EXPRESSION, T000L2_A249TBM33_EXPRESSION[0]) != 0 ) || ( GXutil.strcmp(Z380TBM33_COND_DIV, T000L2_A380TBM33_COND_DIV[0]) != 0 ) || ( GXutil.strcmp(Z381TBM33_CRF_ITEM_CD, T000L2_A381TBM33_CRF_ITEM_CD[0]) != 0 ) || ( Z250TBM33_PRIOR_NO != T000L2_A250TBM33_PRIOR_NO[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z382TBM33_ERR_DIV, T000L2_A382TBM33_ERR_DIV[0]) != 0 ) || ( GXutil.strcmp(Z383TBM33_ERR_MSG, T000L2_A383TBM33_ERR_MSG[0]) != 0 ) || ( GXutil.strcmp(Z554TBM33_ENABLED_FLG, T000L2_A554TBM33_ENABLED_FLG[0]) != 0 ) || ( GXutil.strcmp(Z610TBM33_REQUIRED_INPUT_FLG, T000L2_A610TBM33_REQUIRED_INPUT_FLG[0]) != 0 ) || ( GXutil.strcmp(Z611TBM33_NUMERIC_RANGE_FLG, T000L2_A611TBM33_NUMERIC_RANGE_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z251TBM33_DEL_FLG, T000L2_A251TBM33_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z254TBM33_CRT_PROG_NM, T000L2_A254TBM33_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z257TBM33_UPD_PROG_NM, T000L2_A257TBM33_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM33_CRF_COND"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0L20( )
   {
      beforeValidate0L20( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L20( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0L20( 0) ;
         checkOptimisticConcurrency0L20( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0L20( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0L20( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000L8 */
                  pr_default.execute(6, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO), new Boolean(n252TBM33_CRT_DATETIME), A252TBM33_CRT_DATETIME, new Boolean(n253TBM33_CRT_USER_ID), A253TBM33_CRT_USER_ID, new Boolean(n255TBM33_UPD_DATETIME), A255TBM33_UPD_DATETIME, new Boolean(n256TBM33_UPD_USER_ID), A256TBM33_UPD_USER_ID, new Boolean(n258TBM33_UPD_CNT), new Long(A258TBM33_UPD_CNT), new Boolean(n379TBM33_COND_NM), A379TBM33_COND_NM, new Boolean(n249TBM33_EXPRESSION), A249TBM33_EXPRESSION, new Boolean(n380TBM33_COND_DIV), A380TBM33_COND_DIV, new Boolean(n381TBM33_CRF_ITEM_CD), A381TBM33_CRF_ITEM_CD, new Boolean(n250TBM33_PRIOR_NO), new Byte(A250TBM33_PRIOR_NO), new Boolean(n382TBM33_ERR_DIV), A382TBM33_ERR_DIV, new Boolean(n383TBM33_ERR_MSG), A383TBM33_ERR_MSG, new Boolean(n554TBM33_ENABLED_FLG), A554TBM33_ENABLED_FLG, new Boolean(n610TBM33_REQUIRED_INPUT_FLG), A610TBM33_REQUIRED_INPUT_FLG, new Boolean(n611TBM33_NUMERIC_RANGE_FLG), A611TBM33_NUMERIC_RANGE_FLG, new Boolean(n251TBM33_DEL_FLG), A251TBM33_DEL_FLG, new Boolean(n254TBM33_CRT_PROG_NM), A254TBM33_CRT_PROG_NM, new Boolean(n257TBM33_UPD_PROG_NM), A257TBM33_UPD_PROG_NM});
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
                        resetCaption0L0( ) ;
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
            load0L20( ) ;
         }
         endLevel0L20( ) ;
      }
      closeExtendedTableCursors0L20( ) ;
   }

   public void update0L20( )
   {
      beforeValidate0L20( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0L20( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0L20( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0L20( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0L20( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000L9 */
                  pr_default.execute(7, new Object[] {new Boolean(n252TBM33_CRT_DATETIME), A252TBM33_CRT_DATETIME, new Boolean(n253TBM33_CRT_USER_ID), A253TBM33_CRT_USER_ID, new Boolean(n255TBM33_UPD_DATETIME), A255TBM33_UPD_DATETIME, new Boolean(n256TBM33_UPD_USER_ID), A256TBM33_UPD_USER_ID, new Boolean(n258TBM33_UPD_CNT), new Long(A258TBM33_UPD_CNT), new Boolean(n379TBM33_COND_NM), A379TBM33_COND_NM, new Boolean(n249TBM33_EXPRESSION), A249TBM33_EXPRESSION, new Boolean(n380TBM33_COND_DIV), A380TBM33_COND_DIV, new Boolean(n381TBM33_CRF_ITEM_CD), A381TBM33_CRF_ITEM_CD, new Boolean(n250TBM33_PRIOR_NO), new Byte(A250TBM33_PRIOR_NO), new Boolean(n382TBM33_ERR_DIV), A382TBM33_ERR_DIV, new Boolean(n383TBM33_ERR_MSG), A383TBM33_ERR_MSG, new Boolean(n554TBM33_ENABLED_FLG), A554TBM33_ENABLED_FLG, new Boolean(n610TBM33_REQUIRED_INPUT_FLG), A610TBM33_REQUIRED_INPUT_FLG, new Boolean(n611TBM33_NUMERIC_RANGE_FLG), A611TBM33_NUMERIC_RANGE_FLG, new Boolean(n251TBM33_DEL_FLG), A251TBM33_DEL_FLG, new Boolean(n254TBM33_CRT_PROG_NM), A254TBM33_CRT_PROG_NM, new Boolean(n257TBM33_UPD_PROG_NM), A257TBM33_UPD_PROG_NM, new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM33_CRF_COND"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0L20( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption0L0( ) ;
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
         endLevel0L20( ) ;
      }
      closeExtendedTableCursors0L20( ) ;
   }

   public void deferredUpdate0L20( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0L20( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0L20( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0L20( ) ;
         afterConfirm0L20( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0L20( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000L10 */
               pr_default.execute(8, new Object[] {new Long(A246TBM33_STUDY_ID), new Short(A247TBM33_CRF_ID), new Short(A248TBM33_COND_NO)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound20 == 0 )
                     {
                        initAll0L20( ) ;
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
                     resetCaption0L0( ) ;
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
      sMode20 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0L20( ) ;
      Gx_mode = sMode20 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0L20( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM33_CRF_COND" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0L20( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0L20( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm33_crf_cond");
         if ( AnyError == 0 )
         {
            confirmValues0L0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm33_crf_cond");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0L20( )
   {
      /* Using cursor T000L11 */
      pr_default.execute(9);
      RcdFound20 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A246TBM33_STUDY_ID = T000L11_A246TBM33_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
         A247TBM33_CRF_ID = T000L11_A247TBM33_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
         A248TBM33_COND_NO = T000L11_A248TBM33_COND_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0L20( )
   {
      pr_default.readNext(9);
      RcdFound20 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound20 = (short)(1) ;
         A246TBM33_STUDY_ID = T000L11_A246TBM33_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
         A247TBM33_CRF_ID = T000L11_A247TBM33_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
         A248TBM33_COND_NO = T000L11_A248TBM33_COND_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
      }
   }

   public void scanEnd0L20( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0L20( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0L20( )
   {
      /* Before Insert Rules */
      A252TBM33_CRT_DATETIME = GXutil.now( ) ;
      n252TBM33_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252TBM33_CRT_DATETIME", localUtil.ttoc( A252TBM33_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A253TBM33_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm33_crf_cond_impl.this.GXt_char3 = GXv_char4[0] ;
      A253TBM33_CRT_USER_ID = GXt_char3 ;
      n253TBM33_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A253TBM33_CRT_USER_ID", A253TBM33_CRT_USER_ID);
      A255TBM33_UPD_DATETIME = GXutil.now( ) ;
      n255TBM33_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A255TBM33_UPD_DATETIME", localUtil.ttoc( A255TBM33_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A256TBM33_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm33_crf_cond_impl.this.GXt_char3 = GXv_char4[0] ;
      A256TBM33_UPD_USER_ID = GXt_char3 ;
      n256TBM33_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A256TBM33_UPD_USER_ID", A256TBM33_UPD_USER_ID);
      A258TBM33_UPD_CNT = (long)(O258TBM33_UPD_CNT+1) ;
      n258TBM33_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A258TBM33_UPD_CNT", GXutil.ltrim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0L20( )
   {
      /* Before Update Rules */
      A255TBM33_UPD_DATETIME = GXutil.now( ) ;
      n255TBM33_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A255TBM33_UPD_DATETIME", localUtil.ttoc( A255TBM33_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A256TBM33_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm33_crf_cond_impl.this.GXt_char3 = GXv_char4[0] ;
      A256TBM33_UPD_USER_ID = GXt_char3 ;
      n256TBM33_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A256TBM33_UPD_USER_ID", A256TBM33_UPD_USER_ID);
      A258TBM33_UPD_CNT = (long)(O258TBM33_UPD_CNT+1) ;
      n258TBM33_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A258TBM33_UPD_CNT", GXutil.ltrim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0L20( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0L20( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0L20( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0L20( )
   {
      edtTBM33_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_STUDY_ID_Enabled, 5, 0)));
      edtTBM33_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_CRF_ID_Enabled, 5, 0)));
      edtTBM33_COND_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_COND_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_COND_NO_Enabled, 5, 0)));
      edtTBM33_COND_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_COND_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_COND_NM_Enabled, 5, 0)));
      edtTBM33_EXPRESSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_EXPRESSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_EXPRESSION_Enabled, 5, 0)));
      edtTBM33_COND_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_COND_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_COND_DIV_Enabled, 5, 0)));
      edtTBM33_CRF_ITEM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_CRF_ITEM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_CRF_ITEM_CD_Enabled, 5, 0)));
      edtTBM33_PRIOR_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_PRIOR_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_PRIOR_NO_Enabled, 5, 0)));
      edtTBM33_ERR_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_ERR_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_ERR_DIV_Enabled, 5, 0)));
      edtTBM33_ERR_MSG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_ERR_MSG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_ERR_MSG_Enabled, 5, 0)));
      edtTBM33_ENABLED_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_ENABLED_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_ENABLED_FLG_Enabled, 5, 0)));
      edtTBM33_REQUIRED_INPUT_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_REQUIRED_INPUT_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_REQUIRED_INPUT_FLG_Enabled, 5, 0)));
      edtTBM33_NUMERIC_RANGE_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_NUMERIC_RANGE_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_NUMERIC_RANGE_FLG_Enabled, 5, 0)));
      edtTBM33_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_DEL_FLG_Enabled, 5, 0)));
      edtTBM33_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM33_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM33_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM33_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM33_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM33_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM33_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM33_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM33_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0L0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRF条件マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm33_crf_cond") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0L20( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z246TBM33_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z246TBM33_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z247TBM33_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z247TBM33_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z248TBM33_COND_NO", GXutil.ltrim( localUtil.ntoc( Z248TBM33_COND_NO, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z252TBM33_CRT_DATETIME", localUtil.ttoc( Z252TBM33_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z253TBM33_CRT_USER_ID", GXutil.rtrim( Z253TBM33_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z255TBM33_UPD_DATETIME", localUtil.ttoc( Z255TBM33_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z256TBM33_UPD_USER_ID", GXutil.rtrim( Z256TBM33_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z258TBM33_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z258TBM33_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z379TBM33_COND_NM", GXutil.rtrim( Z379TBM33_COND_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z249TBM33_EXPRESSION", GXutil.rtrim( Z249TBM33_EXPRESSION));
      GxWebStd.gx_hidden_field( httpContext, "Z380TBM33_COND_DIV", GXutil.rtrim( Z380TBM33_COND_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z381TBM33_CRF_ITEM_CD", GXutil.rtrim( Z381TBM33_CRF_ITEM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z250TBM33_PRIOR_NO", GXutil.ltrim( localUtil.ntoc( Z250TBM33_PRIOR_NO, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z382TBM33_ERR_DIV", GXutil.rtrim( Z382TBM33_ERR_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z383TBM33_ERR_MSG", GXutil.rtrim( Z383TBM33_ERR_MSG));
      GxWebStd.gx_hidden_field( httpContext, "Z554TBM33_ENABLED_FLG", GXutil.rtrim( Z554TBM33_ENABLED_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z610TBM33_REQUIRED_INPUT_FLG", GXutil.rtrim( Z610TBM33_REQUIRED_INPUT_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z611TBM33_NUMERIC_RANGE_FLG", GXutil.rtrim( Z611TBM33_NUMERIC_RANGE_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z251TBM33_DEL_FLG", GXutil.rtrim( Z251TBM33_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z254TBM33_CRT_PROG_NM", GXutil.rtrim( Z254TBM33_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z257TBM33_UPD_PROG_NM", GXutil.rtrim( Z257TBM33_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O258TBM33_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O258TBM33_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0L20( )
   {
      A252TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n252TBM33_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A252TBM33_CRT_DATETIME", localUtil.ttoc( A252TBM33_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n252TBM33_CRT_DATETIME = (GXutil.nullDate().equals(A252TBM33_CRT_DATETIME) ? true : false) ;
      A253TBM33_CRT_USER_ID = "" ;
      n253TBM33_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A253TBM33_CRT_USER_ID", A253TBM33_CRT_USER_ID);
      n253TBM33_CRT_USER_ID = ((GXutil.strcmp("", A253TBM33_CRT_USER_ID)==0) ? true : false) ;
      A255TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n255TBM33_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A255TBM33_UPD_DATETIME", localUtil.ttoc( A255TBM33_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n255TBM33_UPD_DATETIME = (GXutil.nullDate().equals(A255TBM33_UPD_DATETIME) ? true : false) ;
      A256TBM33_UPD_USER_ID = "" ;
      n256TBM33_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A256TBM33_UPD_USER_ID", A256TBM33_UPD_USER_ID);
      n256TBM33_UPD_USER_ID = ((GXutil.strcmp("", A256TBM33_UPD_USER_ID)==0) ? true : false) ;
      A258TBM33_UPD_CNT = 0 ;
      n258TBM33_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A258TBM33_UPD_CNT", GXutil.ltrim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)));
      n258TBM33_UPD_CNT = ((0==A258TBM33_UPD_CNT) ? true : false) ;
      A379TBM33_COND_NM = "" ;
      n379TBM33_COND_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A379TBM33_COND_NM", A379TBM33_COND_NM);
      n379TBM33_COND_NM = ((GXutil.strcmp("", A379TBM33_COND_NM)==0) ? true : false) ;
      A249TBM33_EXPRESSION = "" ;
      n249TBM33_EXPRESSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A249TBM33_EXPRESSION", A249TBM33_EXPRESSION);
      n249TBM33_EXPRESSION = ((GXutil.strcmp("", A249TBM33_EXPRESSION)==0) ? true : false) ;
      A380TBM33_COND_DIV = "" ;
      n380TBM33_COND_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A380TBM33_COND_DIV", A380TBM33_COND_DIV);
      n380TBM33_COND_DIV = ((GXutil.strcmp("", A380TBM33_COND_DIV)==0) ? true : false) ;
      A381TBM33_CRF_ITEM_CD = "" ;
      n381TBM33_CRF_ITEM_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A381TBM33_CRF_ITEM_CD", A381TBM33_CRF_ITEM_CD);
      n381TBM33_CRF_ITEM_CD = ((GXutil.strcmp("", A381TBM33_CRF_ITEM_CD)==0) ? true : false) ;
      A250TBM33_PRIOR_NO = (byte)(0) ;
      n250TBM33_PRIOR_NO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A250TBM33_PRIOR_NO", GXutil.ltrim( GXutil.str( A250TBM33_PRIOR_NO, 2, 0)));
      n250TBM33_PRIOR_NO = ((0==A250TBM33_PRIOR_NO) ? true : false) ;
      A382TBM33_ERR_DIV = "" ;
      n382TBM33_ERR_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A382TBM33_ERR_DIV", A382TBM33_ERR_DIV);
      n382TBM33_ERR_DIV = ((GXutil.strcmp("", A382TBM33_ERR_DIV)==0) ? true : false) ;
      A383TBM33_ERR_MSG = "" ;
      n383TBM33_ERR_MSG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A383TBM33_ERR_MSG", A383TBM33_ERR_MSG);
      n383TBM33_ERR_MSG = ((GXutil.strcmp("", A383TBM33_ERR_MSG)==0) ? true : false) ;
      A554TBM33_ENABLED_FLG = "" ;
      n554TBM33_ENABLED_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A554TBM33_ENABLED_FLG", A554TBM33_ENABLED_FLG);
      n554TBM33_ENABLED_FLG = ((GXutil.strcmp("", A554TBM33_ENABLED_FLG)==0) ? true : false) ;
      A610TBM33_REQUIRED_INPUT_FLG = "" ;
      n610TBM33_REQUIRED_INPUT_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A610TBM33_REQUIRED_INPUT_FLG", A610TBM33_REQUIRED_INPUT_FLG);
      n610TBM33_REQUIRED_INPUT_FLG = ((GXutil.strcmp("", A610TBM33_REQUIRED_INPUT_FLG)==0) ? true : false) ;
      A611TBM33_NUMERIC_RANGE_FLG = "" ;
      n611TBM33_NUMERIC_RANGE_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A611TBM33_NUMERIC_RANGE_FLG", A611TBM33_NUMERIC_RANGE_FLG);
      n611TBM33_NUMERIC_RANGE_FLG = ((GXutil.strcmp("", A611TBM33_NUMERIC_RANGE_FLG)==0) ? true : false) ;
      A251TBM33_DEL_FLG = "" ;
      n251TBM33_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A251TBM33_DEL_FLG", A251TBM33_DEL_FLG);
      n251TBM33_DEL_FLG = ((GXutil.strcmp("", A251TBM33_DEL_FLG)==0) ? true : false) ;
      A254TBM33_CRT_PROG_NM = "" ;
      n254TBM33_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A254TBM33_CRT_PROG_NM", A254TBM33_CRT_PROG_NM);
      n254TBM33_CRT_PROG_NM = ((GXutil.strcmp("", A254TBM33_CRT_PROG_NM)==0) ? true : false) ;
      A257TBM33_UPD_PROG_NM = "" ;
      n257TBM33_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A257TBM33_UPD_PROG_NM", A257TBM33_UPD_PROG_NM);
      n257TBM33_UPD_PROG_NM = ((GXutil.strcmp("", A257TBM33_UPD_PROG_NM)==0) ? true : false) ;
      O258TBM33_UPD_CNT = A258TBM33_UPD_CNT ;
      n258TBM33_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A258TBM33_UPD_CNT", GXutil.ltrim( GXutil.str( A258TBM33_UPD_CNT, 10, 0)));
   }

   public void initAll0L20( )
   {
      A246TBM33_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A246TBM33_STUDY_ID", GXutil.ltrim( GXutil.str( A246TBM33_STUDY_ID, 10, 0)));
      A247TBM33_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A247TBM33_CRF_ID", GXutil.ltrim( GXutil.str( A247TBM33_CRF_ID, 4, 0)));
      A248TBM33_COND_NO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A248TBM33_COND_NO", GXutil.ltrim( GXutil.str( A248TBM33_COND_NO, 4, 0)));
      initializeNonKey0L20( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1455335");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm33_crf_cond.js", "?1455335");
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
      lblTextblocktbm33_study_id_Internalname = "TEXTBLOCKTBM33_STUDY_ID" ;
      edtTBM33_STUDY_ID_Internalname = "TBM33_STUDY_ID" ;
      lblTextblocktbm33_crf_id_Internalname = "TEXTBLOCKTBM33_CRF_ID" ;
      edtTBM33_CRF_ID_Internalname = "TBM33_CRF_ID" ;
      lblTextblocktbm33_cond_no_Internalname = "TEXTBLOCKTBM33_COND_NO" ;
      edtTBM33_COND_NO_Internalname = "TBM33_COND_NO" ;
      lblTextblocktbm33_cond_nm_Internalname = "TEXTBLOCKTBM33_COND_NM" ;
      edtTBM33_COND_NM_Internalname = "TBM33_COND_NM" ;
      lblTextblocktbm33_expression_Internalname = "TEXTBLOCKTBM33_EXPRESSION" ;
      edtTBM33_EXPRESSION_Internalname = "TBM33_EXPRESSION" ;
      lblTextblocktbm33_cond_div_Internalname = "TEXTBLOCKTBM33_COND_DIV" ;
      edtTBM33_COND_DIV_Internalname = "TBM33_COND_DIV" ;
      lblTextblocktbm33_crf_item_cd_Internalname = "TEXTBLOCKTBM33_CRF_ITEM_CD" ;
      edtTBM33_CRF_ITEM_CD_Internalname = "TBM33_CRF_ITEM_CD" ;
      lblTextblocktbm33_prior_no_Internalname = "TEXTBLOCKTBM33_PRIOR_NO" ;
      edtTBM33_PRIOR_NO_Internalname = "TBM33_PRIOR_NO" ;
      lblTextblocktbm33_err_div_Internalname = "TEXTBLOCKTBM33_ERR_DIV" ;
      edtTBM33_ERR_DIV_Internalname = "TBM33_ERR_DIV" ;
      lblTextblocktbm33_err_msg_Internalname = "TEXTBLOCKTBM33_ERR_MSG" ;
      edtTBM33_ERR_MSG_Internalname = "TBM33_ERR_MSG" ;
      lblTextblocktbm33_enabled_flg_Internalname = "TEXTBLOCKTBM33_ENABLED_FLG" ;
      edtTBM33_ENABLED_FLG_Internalname = "TBM33_ENABLED_FLG" ;
      lblTextblocktbm33_required_input_flg_Internalname = "TEXTBLOCKTBM33_REQUIRED_INPUT_FLG" ;
      edtTBM33_REQUIRED_INPUT_FLG_Internalname = "TBM33_REQUIRED_INPUT_FLG" ;
      lblTextblocktbm33_numeric_range_flg_Internalname = "TEXTBLOCKTBM33_NUMERIC_RANGE_FLG" ;
      edtTBM33_NUMERIC_RANGE_FLG_Internalname = "TBM33_NUMERIC_RANGE_FLG" ;
      lblTextblocktbm33_del_flg_Internalname = "TEXTBLOCKTBM33_DEL_FLG" ;
      edtTBM33_DEL_FLG_Internalname = "TBM33_DEL_FLG" ;
      lblTextblocktbm33_crt_datetime_Internalname = "TEXTBLOCKTBM33_CRT_DATETIME" ;
      edtTBM33_CRT_DATETIME_Internalname = "TBM33_CRT_DATETIME" ;
      lblTextblocktbm33_crt_user_id_Internalname = "TEXTBLOCKTBM33_CRT_USER_ID" ;
      edtTBM33_CRT_USER_ID_Internalname = "TBM33_CRT_USER_ID" ;
      lblTextblocktbm33_crt_prog_nm_Internalname = "TEXTBLOCKTBM33_CRT_PROG_NM" ;
      edtTBM33_CRT_PROG_NM_Internalname = "TBM33_CRT_PROG_NM" ;
      lblTextblocktbm33_upd_datetime_Internalname = "TEXTBLOCKTBM33_UPD_DATETIME" ;
      edtTBM33_UPD_DATETIME_Internalname = "TBM33_UPD_DATETIME" ;
      lblTextblocktbm33_upd_user_id_Internalname = "TEXTBLOCKTBM33_UPD_USER_ID" ;
      edtTBM33_UPD_USER_ID_Internalname = "TBM33_UPD_USER_ID" ;
      lblTextblocktbm33_upd_prog_nm_Internalname = "TEXTBLOCKTBM33_UPD_PROG_NM" ;
      edtTBM33_UPD_PROG_NM_Internalname = "TBM33_UPD_PROG_NM" ;
      lblTextblocktbm33_upd_cnt_Internalname = "TEXTBLOCKTBM33_UPD_CNT" ;
      edtTBM33_UPD_CNT_Internalname = "TBM33_UPD_CNT" ;
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
      edtTBM33_UPD_CNT_Jsonclick = "" ;
      edtTBM33_UPD_CNT_Enabled = 1 ;
      edtTBM33_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM33_UPD_PROG_NM_Enabled = 1 ;
      edtTBM33_UPD_USER_ID_Jsonclick = "" ;
      edtTBM33_UPD_USER_ID_Enabled = 1 ;
      edtTBM33_UPD_DATETIME_Jsonclick = "" ;
      edtTBM33_UPD_DATETIME_Enabled = 1 ;
      edtTBM33_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM33_CRT_PROG_NM_Enabled = 1 ;
      edtTBM33_CRT_USER_ID_Jsonclick = "" ;
      edtTBM33_CRT_USER_ID_Enabled = 1 ;
      edtTBM33_CRT_DATETIME_Jsonclick = "" ;
      edtTBM33_CRT_DATETIME_Enabled = 1 ;
      edtTBM33_DEL_FLG_Jsonclick = "" ;
      edtTBM33_DEL_FLG_Enabled = 1 ;
      edtTBM33_NUMERIC_RANGE_FLG_Jsonclick = "" ;
      edtTBM33_NUMERIC_RANGE_FLG_Enabled = 1 ;
      edtTBM33_REQUIRED_INPUT_FLG_Jsonclick = "" ;
      edtTBM33_REQUIRED_INPUT_FLG_Enabled = 1 ;
      edtTBM33_ENABLED_FLG_Jsonclick = "" ;
      edtTBM33_ENABLED_FLG_Enabled = 1 ;
      edtTBM33_ERR_MSG_Enabled = 1 ;
      edtTBM33_ERR_DIV_Jsonclick = "" ;
      edtTBM33_ERR_DIV_Enabled = 1 ;
      edtTBM33_PRIOR_NO_Jsonclick = "" ;
      edtTBM33_PRIOR_NO_Enabled = 1 ;
      edtTBM33_CRF_ITEM_CD_Jsonclick = "" ;
      edtTBM33_CRF_ITEM_CD_Enabled = 1 ;
      edtTBM33_COND_DIV_Jsonclick = "" ;
      edtTBM33_COND_DIV_Enabled = 1 ;
      edtTBM33_EXPRESSION_Enabled = 1 ;
      edtTBM33_COND_NM_Jsonclick = "" ;
      edtTBM33_COND_NM_Enabled = 1 ;
      edtTBM33_COND_NO_Jsonclick = "" ;
      edtTBM33_COND_NO_Enabled = 1 ;
      edtTBM33_CRF_ID_Jsonclick = "" ;
      edtTBM33_CRF_ID_Enabled = 1 ;
      edtTBM33_STUDY_ID_Jsonclick = "" ;
      edtTBM33_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm33_crt_user_id0L20( String Gx_mode )
   {
      GXt_char3 = A253TBM33_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm33_crf_cond_impl.this.GXt_char3 = GXv_char4[0] ;
      A253TBM33_CRT_USER_ID = GXt_char3 ;
      n253TBM33_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A253TBM33_CRT_USER_ID", A253TBM33_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A253TBM33_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm33_upd_user_id0L20( String Gx_mode )
   {
      GXt_char3 = A256TBM33_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm33_crf_cond_impl.this.GXt_char3 = GXv_char4[0] ;
      A256TBM33_UPD_USER_ID = GXt_char3 ;
      n256TBM33_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A256TBM33_UPD_USER_ID", A256TBM33_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A256TBM33_UPD_USER_ID))+"\"");
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
      getEqualNoModal( ) ;
      GX_FocusControl = edtTBM33_COND_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm33_cond_no( long GX_Parm1 ,
                                    short GX_Parm2 ,
                                    short GX_Parm3 ,
                                    java.util.Date GX_Parm4 ,
                                    String GX_Parm5 ,
                                    java.util.Date GX_Parm6 ,
                                    String GX_Parm7 ,
                                    long GX_Parm8 ,
                                    String GX_Parm9 ,
                                    String GX_Parm10 ,
                                    String GX_Parm11 ,
                                    String GX_Parm12 ,
                                    byte GX_Parm13 ,
                                    String GX_Parm14 ,
                                    String GX_Parm15 ,
                                    String GX_Parm16 ,
                                    String GX_Parm17 ,
                                    String GX_Parm18 ,
                                    String GX_Parm19 ,
                                    String GX_Parm20 ,
                                    String GX_Parm21 )
   {
      A246TBM33_STUDY_ID = GX_Parm1 ;
      A247TBM33_CRF_ID = GX_Parm2 ;
      A248TBM33_COND_NO = GX_Parm3 ;
      A252TBM33_CRT_DATETIME = GX_Parm4 ;
      n252TBM33_CRT_DATETIME = false ;
      A253TBM33_CRT_USER_ID = GX_Parm5 ;
      n253TBM33_CRT_USER_ID = false ;
      A255TBM33_UPD_DATETIME = GX_Parm6 ;
      n255TBM33_UPD_DATETIME = false ;
      A256TBM33_UPD_USER_ID = GX_Parm7 ;
      n256TBM33_UPD_USER_ID = false ;
      A258TBM33_UPD_CNT = GX_Parm8 ;
      n258TBM33_UPD_CNT = false ;
      A379TBM33_COND_NM = GX_Parm9 ;
      n379TBM33_COND_NM = false ;
      A249TBM33_EXPRESSION = GX_Parm10 ;
      n249TBM33_EXPRESSION = false ;
      A380TBM33_COND_DIV = GX_Parm11 ;
      n380TBM33_COND_DIV = false ;
      A381TBM33_CRF_ITEM_CD = GX_Parm12 ;
      n381TBM33_CRF_ITEM_CD = false ;
      A250TBM33_PRIOR_NO = GX_Parm13 ;
      n250TBM33_PRIOR_NO = false ;
      A382TBM33_ERR_DIV = GX_Parm14 ;
      n382TBM33_ERR_DIV = false ;
      A383TBM33_ERR_MSG = GX_Parm15 ;
      n383TBM33_ERR_MSG = false ;
      A554TBM33_ENABLED_FLG = GX_Parm16 ;
      n554TBM33_ENABLED_FLG = false ;
      A610TBM33_REQUIRED_INPUT_FLG = GX_Parm17 ;
      n610TBM33_REQUIRED_INPUT_FLG = false ;
      A611TBM33_NUMERIC_RANGE_FLG = GX_Parm18 ;
      n611TBM33_NUMERIC_RANGE_FLG = false ;
      A251TBM33_DEL_FLG = GX_Parm19 ;
      n251TBM33_DEL_FLG = false ;
      A254TBM33_CRT_PROG_NM = GX_Parm20 ;
      n254TBM33_CRT_PROG_NM = false ;
      A257TBM33_UPD_PROG_NM = GX_Parm21 ;
      n257TBM33_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A252TBM33_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A253TBM33_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A255TBM33_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A256TBM33_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A258TBM33_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A379TBM33_COND_NM));
      isValidOutput.add(GXutil.rtrim( A249TBM33_EXPRESSION));
      isValidOutput.add(GXutil.rtrim( A380TBM33_COND_DIV));
      isValidOutput.add(GXutil.rtrim( A381TBM33_CRF_ITEM_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A250TBM33_PRIOR_NO, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A382TBM33_ERR_DIV));
      isValidOutput.add(GXutil.rtrim( A383TBM33_ERR_MSG));
      isValidOutput.add(GXutil.rtrim( A554TBM33_ENABLED_FLG));
      isValidOutput.add(GXutil.rtrim( A610TBM33_REQUIRED_INPUT_FLG));
      isValidOutput.add(GXutil.rtrim( A611TBM33_NUMERIC_RANGE_FLG));
      isValidOutput.add(GXutil.rtrim( A251TBM33_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A254TBM33_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A257TBM33_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z246TBM33_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z247TBM33_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z248TBM33_COND_NO, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z252TBM33_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z253TBM33_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z255TBM33_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z256TBM33_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z258TBM33_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z379TBM33_COND_NM));
      isValidOutput.add(GXutil.rtrim( Z249TBM33_EXPRESSION));
      isValidOutput.add(GXutil.rtrim( Z380TBM33_COND_DIV));
      isValidOutput.add(GXutil.rtrim( Z381TBM33_CRF_ITEM_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z250TBM33_PRIOR_NO, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z382TBM33_ERR_DIV));
      isValidOutput.add(GXutil.rtrim( Z383TBM33_ERR_MSG));
      isValidOutput.add(GXutil.rtrim( Z554TBM33_ENABLED_FLG));
      isValidOutput.add(GXutil.rtrim( Z610TBM33_REQUIRED_INPUT_FLG));
      isValidOutput.add(GXutil.rtrim( Z611TBM33_NUMERIC_RANGE_FLG));
      isValidOutput.add(GXutil.rtrim( Z251TBM33_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z254TBM33_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z257TBM33_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O258TBM33_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1174 */
                  S1174 ();
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
      lblTextblocktbm33_study_id_Jsonclick = "" ;
      lblTextblocktbm33_crf_id_Jsonclick = "" ;
      lblTextblocktbm33_cond_no_Jsonclick = "" ;
      lblTextblocktbm33_cond_nm_Jsonclick = "" ;
      A379TBM33_COND_NM = "" ;
      lblTextblocktbm33_expression_Jsonclick = "" ;
      A249TBM33_EXPRESSION = "" ;
      lblTextblocktbm33_cond_div_Jsonclick = "" ;
      A380TBM33_COND_DIV = "" ;
      lblTextblocktbm33_crf_item_cd_Jsonclick = "" ;
      A381TBM33_CRF_ITEM_CD = "" ;
      lblTextblocktbm33_prior_no_Jsonclick = "" ;
      lblTextblocktbm33_err_div_Jsonclick = "" ;
      A382TBM33_ERR_DIV = "" ;
      lblTextblocktbm33_err_msg_Jsonclick = "" ;
      A383TBM33_ERR_MSG = "" ;
      lblTextblocktbm33_enabled_flg_Jsonclick = "" ;
      A554TBM33_ENABLED_FLG = "" ;
      lblTextblocktbm33_required_input_flg_Jsonclick = "" ;
      A610TBM33_REQUIRED_INPUT_FLG = "" ;
      lblTextblocktbm33_numeric_range_flg_Jsonclick = "" ;
      A611TBM33_NUMERIC_RANGE_FLG = "" ;
      lblTextblocktbm33_del_flg_Jsonclick = "" ;
      A251TBM33_DEL_FLG = "" ;
      lblTextblocktbm33_crt_datetime_Jsonclick = "" ;
      A252TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm33_crt_user_id_Jsonclick = "" ;
      A253TBM33_CRT_USER_ID = "" ;
      lblTextblocktbm33_crt_prog_nm_Jsonclick = "" ;
      A254TBM33_CRT_PROG_NM = "" ;
      lblTextblocktbm33_upd_datetime_Jsonclick = "" ;
      A255TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm33_upd_user_id_Jsonclick = "" ;
      A256TBM33_UPD_USER_ID = "" ;
      lblTextblocktbm33_upd_prog_nm_Jsonclick = "" ;
      A257TBM33_UPD_PROG_NM = "" ;
      lblTextblocktbm33_upd_cnt_Jsonclick = "" ;
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
      Z252TBM33_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z253TBM33_CRT_USER_ID = "" ;
      Z255TBM33_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z256TBM33_UPD_USER_ID = "" ;
      Z379TBM33_COND_NM = "" ;
      Z249TBM33_EXPRESSION = "" ;
      Z380TBM33_COND_DIV = "" ;
      Z381TBM33_CRF_ITEM_CD = "" ;
      Z382TBM33_ERR_DIV = "" ;
      Z383TBM33_ERR_MSG = "" ;
      Z554TBM33_ENABLED_FLG = "" ;
      Z610TBM33_REQUIRED_INPUT_FLG = "" ;
      Z611TBM33_NUMERIC_RANGE_FLG = "" ;
      Z251TBM33_DEL_FLG = "" ;
      Z254TBM33_CRT_PROG_NM = "" ;
      Z257TBM33_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000L4_A246TBM33_STUDY_ID = new long[1] ;
      T000L4_A247TBM33_CRF_ID = new short[1] ;
      T000L4_A248TBM33_COND_NO = new short[1] ;
      T000L4_A252TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000L4_n252TBM33_CRT_DATETIME = new boolean[] {false} ;
      T000L4_A253TBM33_CRT_USER_ID = new String[] {""} ;
      T000L4_n253TBM33_CRT_USER_ID = new boolean[] {false} ;
      T000L4_A255TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000L4_n255TBM33_UPD_DATETIME = new boolean[] {false} ;
      T000L4_A256TBM33_UPD_USER_ID = new String[] {""} ;
      T000L4_n256TBM33_UPD_USER_ID = new boolean[] {false} ;
      T000L4_A258TBM33_UPD_CNT = new long[1] ;
      T000L4_n258TBM33_UPD_CNT = new boolean[] {false} ;
      T000L4_A379TBM33_COND_NM = new String[] {""} ;
      T000L4_n379TBM33_COND_NM = new boolean[] {false} ;
      T000L4_A249TBM33_EXPRESSION = new String[] {""} ;
      T000L4_n249TBM33_EXPRESSION = new boolean[] {false} ;
      T000L4_A380TBM33_COND_DIV = new String[] {""} ;
      T000L4_n380TBM33_COND_DIV = new boolean[] {false} ;
      T000L4_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      T000L4_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      T000L4_A250TBM33_PRIOR_NO = new byte[1] ;
      T000L4_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      T000L4_A382TBM33_ERR_DIV = new String[] {""} ;
      T000L4_n382TBM33_ERR_DIV = new boolean[] {false} ;
      T000L4_A383TBM33_ERR_MSG = new String[] {""} ;
      T000L4_n383TBM33_ERR_MSG = new boolean[] {false} ;
      T000L4_A554TBM33_ENABLED_FLG = new String[] {""} ;
      T000L4_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      T000L4_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000L4_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000L4_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      T000L4_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      T000L4_A251TBM33_DEL_FLG = new String[] {""} ;
      T000L4_n251TBM33_DEL_FLG = new boolean[] {false} ;
      T000L4_A254TBM33_CRT_PROG_NM = new String[] {""} ;
      T000L4_n254TBM33_CRT_PROG_NM = new boolean[] {false} ;
      T000L4_A257TBM33_UPD_PROG_NM = new String[] {""} ;
      T000L4_n257TBM33_UPD_PROG_NM = new boolean[] {false} ;
      T000L5_A246TBM33_STUDY_ID = new long[1] ;
      T000L5_A247TBM33_CRF_ID = new short[1] ;
      T000L5_A248TBM33_COND_NO = new short[1] ;
      T000L3_A246TBM33_STUDY_ID = new long[1] ;
      T000L3_A247TBM33_CRF_ID = new short[1] ;
      T000L3_A248TBM33_COND_NO = new short[1] ;
      T000L3_A252TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000L3_n252TBM33_CRT_DATETIME = new boolean[] {false} ;
      T000L3_A253TBM33_CRT_USER_ID = new String[] {""} ;
      T000L3_n253TBM33_CRT_USER_ID = new boolean[] {false} ;
      T000L3_A255TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000L3_n255TBM33_UPD_DATETIME = new boolean[] {false} ;
      T000L3_A256TBM33_UPD_USER_ID = new String[] {""} ;
      T000L3_n256TBM33_UPD_USER_ID = new boolean[] {false} ;
      T000L3_A258TBM33_UPD_CNT = new long[1] ;
      T000L3_n258TBM33_UPD_CNT = new boolean[] {false} ;
      T000L3_A379TBM33_COND_NM = new String[] {""} ;
      T000L3_n379TBM33_COND_NM = new boolean[] {false} ;
      T000L3_A249TBM33_EXPRESSION = new String[] {""} ;
      T000L3_n249TBM33_EXPRESSION = new boolean[] {false} ;
      T000L3_A380TBM33_COND_DIV = new String[] {""} ;
      T000L3_n380TBM33_COND_DIV = new boolean[] {false} ;
      T000L3_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      T000L3_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      T000L3_A250TBM33_PRIOR_NO = new byte[1] ;
      T000L3_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      T000L3_A382TBM33_ERR_DIV = new String[] {""} ;
      T000L3_n382TBM33_ERR_DIV = new boolean[] {false} ;
      T000L3_A383TBM33_ERR_MSG = new String[] {""} ;
      T000L3_n383TBM33_ERR_MSG = new boolean[] {false} ;
      T000L3_A554TBM33_ENABLED_FLG = new String[] {""} ;
      T000L3_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      T000L3_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000L3_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000L3_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      T000L3_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      T000L3_A251TBM33_DEL_FLG = new String[] {""} ;
      T000L3_n251TBM33_DEL_FLG = new boolean[] {false} ;
      T000L3_A254TBM33_CRT_PROG_NM = new String[] {""} ;
      T000L3_n254TBM33_CRT_PROG_NM = new boolean[] {false} ;
      T000L3_A257TBM33_UPD_PROG_NM = new String[] {""} ;
      T000L3_n257TBM33_UPD_PROG_NM = new boolean[] {false} ;
      sMode20 = "" ;
      T000L6_A246TBM33_STUDY_ID = new long[1] ;
      T000L6_A247TBM33_CRF_ID = new short[1] ;
      T000L6_A248TBM33_COND_NO = new short[1] ;
      T000L7_A246TBM33_STUDY_ID = new long[1] ;
      T000L7_A247TBM33_CRF_ID = new short[1] ;
      T000L7_A248TBM33_COND_NO = new short[1] ;
      T000L2_A246TBM33_STUDY_ID = new long[1] ;
      T000L2_A247TBM33_CRF_ID = new short[1] ;
      T000L2_A248TBM33_COND_NO = new short[1] ;
      T000L2_A252TBM33_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000L2_n252TBM33_CRT_DATETIME = new boolean[] {false} ;
      T000L2_A253TBM33_CRT_USER_ID = new String[] {""} ;
      T000L2_n253TBM33_CRT_USER_ID = new boolean[] {false} ;
      T000L2_A255TBM33_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000L2_n255TBM33_UPD_DATETIME = new boolean[] {false} ;
      T000L2_A256TBM33_UPD_USER_ID = new String[] {""} ;
      T000L2_n256TBM33_UPD_USER_ID = new boolean[] {false} ;
      T000L2_A258TBM33_UPD_CNT = new long[1] ;
      T000L2_n258TBM33_UPD_CNT = new boolean[] {false} ;
      T000L2_A379TBM33_COND_NM = new String[] {""} ;
      T000L2_n379TBM33_COND_NM = new boolean[] {false} ;
      T000L2_A249TBM33_EXPRESSION = new String[] {""} ;
      T000L2_n249TBM33_EXPRESSION = new boolean[] {false} ;
      T000L2_A380TBM33_COND_DIV = new String[] {""} ;
      T000L2_n380TBM33_COND_DIV = new boolean[] {false} ;
      T000L2_A381TBM33_CRF_ITEM_CD = new String[] {""} ;
      T000L2_n381TBM33_CRF_ITEM_CD = new boolean[] {false} ;
      T000L2_A250TBM33_PRIOR_NO = new byte[1] ;
      T000L2_n250TBM33_PRIOR_NO = new boolean[] {false} ;
      T000L2_A382TBM33_ERR_DIV = new String[] {""} ;
      T000L2_n382TBM33_ERR_DIV = new boolean[] {false} ;
      T000L2_A383TBM33_ERR_MSG = new String[] {""} ;
      T000L2_n383TBM33_ERR_MSG = new boolean[] {false} ;
      T000L2_A554TBM33_ENABLED_FLG = new String[] {""} ;
      T000L2_n554TBM33_ENABLED_FLG = new boolean[] {false} ;
      T000L2_A610TBM33_REQUIRED_INPUT_FLG = new String[] {""} ;
      T000L2_n610TBM33_REQUIRED_INPUT_FLG = new boolean[] {false} ;
      T000L2_A611TBM33_NUMERIC_RANGE_FLG = new String[] {""} ;
      T000L2_n611TBM33_NUMERIC_RANGE_FLG = new boolean[] {false} ;
      T000L2_A251TBM33_DEL_FLG = new String[] {""} ;
      T000L2_n251TBM33_DEL_FLG = new boolean[] {false} ;
      T000L2_A254TBM33_CRT_PROG_NM = new String[] {""} ;
      T000L2_n254TBM33_CRT_PROG_NM = new boolean[] {false} ;
      T000L2_A257TBM33_UPD_PROG_NM = new String[] {""} ;
      T000L2_n257TBM33_UPD_PROG_NM = new boolean[] {false} ;
      T000L11_A246TBM33_STUDY_ID = new long[1] ;
      T000L11_A247TBM33_CRF_ID = new short[1] ;
      T000L11_A248TBM33_COND_NO = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm33_crf_cond__default(),
         new Object[] {
             new Object[] {
            T000L2_A246TBM33_STUDY_ID, T000L2_A247TBM33_CRF_ID, T000L2_A248TBM33_COND_NO, T000L2_A252TBM33_CRT_DATETIME, T000L2_n252TBM33_CRT_DATETIME, T000L2_A253TBM33_CRT_USER_ID, T000L2_n253TBM33_CRT_USER_ID, T000L2_A255TBM33_UPD_DATETIME, T000L2_n255TBM33_UPD_DATETIME, T000L2_A256TBM33_UPD_USER_ID,
            T000L2_n256TBM33_UPD_USER_ID, T000L2_A258TBM33_UPD_CNT, T000L2_n258TBM33_UPD_CNT, T000L2_A379TBM33_COND_NM, T000L2_n379TBM33_COND_NM, T000L2_A249TBM33_EXPRESSION, T000L2_n249TBM33_EXPRESSION, T000L2_A380TBM33_COND_DIV, T000L2_n380TBM33_COND_DIV, T000L2_A381TBM33_CRF_ITEM_CD,
            T000L2_n381TBM33_CRF_ITEM_CD, T000L2_A250TBM33_PRIOR_NO, T000L2_n250TBM33_PRIOR_NO, T000L2_A382TBM33_ERR_DIV, T000L2_n382TBM33_ERR_DIV, T000L2_A383TBM33_ERR_MSG, T000L2_n383TBM33_ERR_MSG, T000L2_A554TBM33_ENABLED_FLG, T000L2_n554TBM33_ENABLED_FLG, T000L2_A610TBM33_REQUIRED_INPUT_FLG,
            T000L2_n610TBM33_REQUIRED_INPUT_FLG, T000L2_A611TBM33_NUMERIC_RANGE_FLG, T000L2_n611TBM33_NUMERIC_RANGE_FLG, T000L2_A251TBM33_DEL_FLG, T000L2_n251TBM33_DEL_FLG, T000L2_A254TBM33_CRT_PROG_NM, T000L2_n254TBM33_CRT_PROG_NM, T000L2_A257TBM33_UPD_PROG_NM, T000L2_n257TBM33_UPD_PROG_NM
            }
            , new Object[] {
            T000L3_A246TBM33_STUDY_ID, T000L3_A247TBM33_CRF_ID, T000L3_A248TBM33_COND_NO, T000L3_A252TBM33_CRT_DATETIME, T000L3_n252TBM33_CRT_DATETIME, T000L3_A253TBM33_CRT_USER_ID, T000L3_n253TBM33_CRT_USER_ID, T000L3_A255TBM33_UPD_DATETIME, T000L3_n255TBM33_UPD_DATETIME, T000L3_A256TBM33_UPD_USER_ID,
            T000L3_n256TBM33_UPD_USER_ID, T000L3_A258TBM33_UPD_CNT, T000L3_n258TBM33_UPD_CNT, T000L3_A379TBM33_COND_NM, T000L3_n379TBM33_COND_NM, T000L3_A249TBM33_EXPRESSION, T000L3_n249TBM33_EXPRESSION, T000L3_A380TBM33_COND_DIV, T000L3_n380TBM33_COND_DIV, T000L3_A381TBM33_CRF_ITEM_CD,
            T000L3_n381TBM33_CRF_ITEM_CD, T000L3_A250TBM33_PRIOR_NO, T000L3_n250TBM33_PRIOR_NO, T000L3_A382TBM33_ERR_DIV, T000L3_n382TBM33_ERR_DIV, T000L3_A383TBM33_ERR_MSG, T000L3_n383TBM33_ERR_MSG, T000L3_A554TBM33_ENABLED_FLG, T000L3_n554TBM33_ENABLED_FLG, T000L3_A610TBM33_REQUIRED_INPUT_FLG,
            T000L3_n610TBM33_REQUIRED_INPUT_FLG, T000L3_A611TBM33_NUMERIC_RANGE_FLG, T000L3_n611TBM33_NUMERIC_RANGE_FLG, T000L3_A251TBM33_DEL_FLG, T000L3_n251TBM33_DEL_FLG, T000L3_A254TBM33_CRT_PROG_NM, T000L3_n254TBM33_CRT_PROG_NM, T000L3_A257TBM33_UPD_PROG_NM, T000L3_n257TBM33_UPD_PROG_NM
            }
            , new Object[] {
            T000L4_A246TBM33_STUDY_ID, T000L4_A247TBM33_CRF_ID, T000L4_A248TBM33_COND_NO, T000L4_A252TBM33_CRT_DATETIME, T000L4_n252TBM33_CRT_DATETIME, T000L4_A253TBM33_CRT_USER_ID, T000L4_n253TBM33_CRT_USER_ID, T000L4_A255TBM33_UPD_DATETIME, T000L4_n255TBM33_UPD_DATETIME, T000L4_A256TBM33_UPD_USER_ID,
            T000L4_n256TBM33_UPD_USER_ID, T000L4_A258TBM33_UPD_CNT, T000L4_n258TBM33_UPD_CNT, T000L4_A379TBM33_COND_NM, T000L4_n379TBM33_COND_NM, T000L4_A249TBM33_EXPRESSION, T000L4_n249TBM33_EXPRESSION, T000L4_A380TBM33_COND_DIV, T000L4_n380TBM33_COND_DIV, T000L4_A381TBM33_CRF_ITEM_CD,
            T000L4_n381TBM33_CRF_ITEM_CD, T000L4_A250TBM33_PRIOR_NO, T000L4_n250TBM33_PRIOR_NO, T000L4_A382TBM33_ERR_DIV, T000L4_n382TBM33_ERR_DIV, T000L4_A383TBM33_ERR_MSG, T000L4_n383TBM33_ERR_MSG, T000L4_A554TBM33_ENABLED_FLG, T000L4_n554TBM33_ENABLED_FLG, T000L4_A610TBM33_REQUIRED_INPUT_FLG,
            T000L4_n610TBM33_REQUIRED_INPUT_FLG, T000L4_A611TBM33_NUMERIC_RANGE_FLG, T000L4_n611TBM33_NUMERIC_RANGE_FLG, T000L4_A251TBM33_DEL_FLG, T000L4_n251TBM33_DEL_FLG, T000L4_A254TBM33_CRT_PROG_NM, T000L4_n254TBM33_CRT_PROG_NM, T000L4_A257TBM33_UPD_PROG_NM, T000L4_n257TBM33_UPD_PROG_NM
            }
            , new Object[] {
            T000L5_A246TBM33_STUDY_ID, T000L5_A247TBM33_CRF_ID, T000L5_A248TBM33_COND_NO
            }
            , new Object[] {
            T000L6_A246TBM33_STUDY_ID, T000L6_A247TBM33_CRF_ID, T000L6_A248TBM33_COND_NO
            }
            , new Object[] {
            T000L7_A246TBM33_STUDY_ID, T000L7_A247TBM33_CRF_ID, T000L7_A248TBM33_COND_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000L11_A246TBM33_STUDY_ID, T000L11_A247TBM33_CRF_ID, T000L11_A248TBM33_COND_NO
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM33_CRF_COND" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A250TBM33_PRIOR_NO ;
   private byte Z250TBM33_PRIOR_NO ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A247TBM33_CRF_ID ;
   private short A248TBM33_COND_NO ;
   private short Z247TBM33_CRF_ID ;
   private short Z248TBM33_COND_NO ;
   private short RcdFound20 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM33_STUDY_ID_Enabled ;
   private int edtTBM33_CRF_ID_Enabled ;
   private int edtTBM33_COND_NO_Enabled ;
   private int edtTBM33_COND_NM_Enabled ;
   private int edtTBM33_EXPRESSION_Enabled ;
   private int edtTBM33_COND_DIV_Enabled ;
   private int edtTBM33_CRF_ITEM_CD_Enabled ;
   private int edtTBM33_PRIOR_NO_Enabled ;
   private int edtTBM33_ERR_DIV_Enabled ;
   private int edtTBM33_ERR_MSG_Enabled ;
   private int edtTBM33_ENABLED_FLG_Enabled ;
   private int edtTBM33_REQUIRED_INPUT_FLG_Enabled ;
   private int edtTBM33_NUMERIC_RANGE_FLG_Enabled ;
   private int edtTBM33_DEL_FLG_Enabled ;
   private int edtTBM33_CRT_DATETIME_Enabled ;
   private int edtTBM33_CRT_USER_ID_Enabled ;
   private int edtTBM33_CRT_PROG_NM_Enabled ;
   private int edtTBM33_UPD_DATETIME_Enabled ;
   private int edtTBM33_UPD_USER_ID_Enabled ;
   private int edtTBM33_UPD_PROG_NM_Enabled ;
   private int edtTBM33_UPD_CNT_Enabled ;
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
   private long A246TBM33_STUDY_ID ;
   private long A258TBM33_UPD_CNT ;
   private long Z246TBM33_STUDY_ID ;
   private long Z258TBM33_UPD_CNT ;
   private long O258TBM33_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM33_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm33_study_id_Internalname ;
   private String lblTextblocktbm33_study_id_Jsonclick ;
   private String edtTBM33_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm33_crf_id_Internalname ;
   private String lblTextblocktbm33_crf_id_Jsonclick ;
   private String edtTBM33_CRF_ID_Internalname ;
   private String edtTBM33_CRF_ID_Jsonclick ;
   private String lblTextblocktbm33_cond_no_Internalname ;
   private String lblTextblocktbm33_cond_no_Jsonclick ;
   private String edtTBM33_COND_NO_Internalname ;
   private String edtTBM33_COND_NO_Jsonclick ;
   private String lblTextblocktbm33_cond_nm_Internalname ;
   private String lblTextblocktbm33_cond_nm_Jsonclick ;
   private String edtTBM33_COND_NM_Internalname ;
   private String edtTBM33_COND_NM_Jsonclick ;
   private String lblTextblocktbm33_expression_Internalname ;
   private String lblTextblocktbm33_expression_Jsonclick ;
   private String edtTBM33_EXPRESSION_Internalname ;
   private String lblTextblocktbm33_cond_div_Internalname ;
   private String lblTextblocktbm33_cond_div_Jsonclick ;
   private String edtTBM33_COND_DIV_Internalname ;
   private String edtTBM33_COND_DIV_Jsonclick ;
   private String lblTextblocktbm33_crf_item_cd_Internalname ;
   private String lblTextblocktbm33_crf_item_cd_Jsonclick ;
   private String edtTBM33_CRF_ITEM_CD_Internalname ;
   private String edtTBM33_CRF_ITEM_CD_Jsonclick ;
   private String lblTextblocktbm33_prior_no_Internalname ;
   private String lblTextblocktbm33_prior_no_Jsonclick ;
   private String edtTBM33_PRIOR_NO_Internalname ;
   private String edtTBM33_PRIOR_NO_Jsonclick ;
   private String lblTextblocktbm33_err_div_Internalname ;
   private String lblTextblocktbm33_err_div_Jsonclick ;
   private String edtTBM33_ERR_DIV_Internalname ;
   private String edtTBM33_ERR_DIV_Jsonclick ;
   private String lblTextblocktbm33_err_msg_Internalname ;
   private String lblTextblocktbm33_err_msg_Jsonclick ;
   private String edtTBM33_ERR_MSG_Internalname ;
   private String lblTextblocktbm33_enabled_flg_Internalname ;
   private String lblTextblocktbm33_enabled_flg_Jsonclick ;
   private String edtTBM33_ENABLED_FLG_Internalname ;
   private String edtTBM33_ENABLED_FLG_Jsonclick ;
   private String lblTextblocktbm33_required_input_flg_Internalname ;
   private String lblTextblocktbm33_required_input_flg_Jsonclick ;
   private String edtTBM33_REQUIRED_INPUT_FLG_Internalname ;
   private String edtTBM33_REQUIRED_INPUT_FLG_Jsonclick ;
   private String lblTextblocktbm33_numeric_range_flg_Internalname ;
   private String lblTextblocktbm33_numeric_range_flg_Jsonclick ;
   private String edtTBM33_NUMERIC_RANGE_FLG_Internalname ;
   private String edtTBM33_NUMERIC_RANGE_FLG_Jsonclick ;
   private String lblTextblocktbm33_del_flg_Internalname ;
   private String lblTextblocktbm33_del_flg_Jsonclick ;
   private String edtTBM33_DEL_FLG_Internalname ;
   private String edtTBM33_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm33_crt_datetime_Internalname ;
   private String lblTextblocktbm33_crt_datetime_Jsonclick ;
   private String edtTBM33_CRT_DATETIME_Internalname ;
   private String edtTBM33_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm33_crt_user_id_Internalname ;
   private String lblTextblocktbm33_crt_user_id_Jsonclick ;
   private String edtTBM33_CRT_USER_ID_Internalname ;
   private String edtTBM33_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm33_crt_prog_nm_Internalname ;
   private String lblTextblocktbm33_crt_prog_nm_Jsonclick ;
   private String edtTBM33_CRT_PROG_NM_Internalname ;
   private String edtTBM33_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm33_upd_datetime_Internalname ;
   private String lblTextblocktbm33_upd_datetime_Jsonclick ;
   private String edtTBM33_UPD_DATETIME_Internalname ;
   private String edtTBM33_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm33_upd_user_id_Internalname ;
   private String lblTextblocktbm33_upd_user_id_Jsonclick ;
   private String edtTBM33_UPD_USER_ID_Internalname ;
   private String edtTBM33_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm33_upd_prog_nm_Internalname ;
   private String lblTextblocktbm33_upd_prog_nm_Jsonclick ;
   private String edtTBM33_UPD_PROG_NM_Internalname ;
   private String edtTBM33_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm33_upd_cnt_Internalname ;
   private String lblTextblocktbm33_upd_cnt_Jsonclick ;
   private String edtTBM33_UPD_CNT_Internalname ;
   private String edtTBM33_UPD_CNT_Jsonclick ;
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
   private String AV9Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode20 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A252TBM33_CRT_DATETIME ;
   private java.util.Date A255TBM33_UPD_DATETIME ;
   private java.util.Date Z252TBM33_CRT_DATETIME ;
   private java.util.Date Z255TBM33_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n379TBM33_COND_NM ;
   private boolean n249TBM33_EXPRESSION ;
   private boolean n380TBM33_COND_DIV ;
   private boolean n381TBM33_CRF_ITEM_CD ;
   private boolean n250TBM33_PRIOR_NO ;
   private boolean n382TBM33_ERR_DIV ;
   private boolean n383TBM33_ERR_MSG ;
   private boolean n554TBM33_ENABLED_FLG ;
   private boolean n610TBM33_REQUIRED_INPUT_FLG ;
   private boolean n611TBM33_NUMERIC_RANGE_FLG ;
   private boolean n251TBM33_DEL_FLG ;
   private boolean n252TBM33_CRT_DATETIME ;
   private boolean n253TBM33_CRT_USER_ID ;
   private boolean n254TBM33_CRT_PROG_NM ;
   private boolean n255TBM33_UPD_DATETIME ;
   private boolean n256TBM33_UPD_USER_ID ;
   private boolean n257TBM33_UPD_PROG_NM ;
   private boolean n258TBM33_UPD_CNT ;
   private boolean Gx_longc ;
   private String A379TBM33_COND_NM ;
   private String A249TBM33_EXPRESSION ;
   private String A380TBM33_COND_DIV ;
   private String A381TBM33_CRF_ITEM_CD ;
   private String A382TBM33_ERR_DIV ;
   private String A383TBM33_ERR_MSG ;
   private String A554TBM33_ENABLED_FLG ;
   private String A610TBM33_REQUIRED_INPUT_FLG ;
   private String A611TBM33_NUMERIC_RANGE_FLG ;
   private String A251TBM33_DEL_FLG ;
   private String A253TBM33_CRT_USER_ID ;
   private String A254TBM33_CRT_PROG_NM ;
   private String A256TBM33_UPD_USER_ID ;
   private String A257TBM33_UPD_PROG_NM ;
   private String Z253TBM33_CRT_USER_ID ;
   private String Z256TBM33_UPD_USER_ID ;
   private String Z379TBM33_COND_NM ;
   private String Z249TBM33_EXPRESSION ;
   private String Z380TBM33_COND_DIV ;
   private String Z381TBM33_CRF_ITEM_CD ;
   private String Z382TBM33_ERR_DIV ;
   private String Z383TBM33_ERR_MSG ;
   private String Z554TBM33_ENABLED_FLG ;
   private String Z610TBM33_REQUIRED_INPUT_FLG ;
   private String Z611TBM33_NUMERIC_RANGE_FLG ;
   private String Z251TBM33_DEL_FLG ;
   private String Z254TBM33_CRT_PROG_NM ;
   private String Z257TBM33_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000L4_A246TBM33_STUDY_ID ;
   private short[] T000L4_A247TBM33_CRF_ID ;
   private short[] T000L4_A248TBM33_COND_NO ;
   private java.util.Date[] T000L4_A252TBM33_CRT_DATETIME ;
   private boolean[] T000L4_n252TBM33_CRT_DATETIME ;
   private String[] T000L4_A253TBM33_CRT_USER_ID ;
   private boolean[] T000L4_n253TBM33_CRT_USER_ID ;
   private java.util.Date[] T000L4_A255TBM33_UPD_DATETIME ;
   private boolean[] T000L4_n255TBM33_UPD_DATETIME ;
   private String[] T000L4_A256TBM33_UPD_USER_ID ;
   private boolean[] T000L4_n256TBM33_UPD_USER_ID ;
   private long[] T000L4_A258TBM33_UPD_CNT ;
   private boolean[] T000L4_n258TBM33_UPD_CNT ;
   private String[] T000L4_A379TBM33_COND_NM ;
   private boolean[] T000L4_n379TBM33_COND_NM ;
   private String[] T000L4_A249TBM33_EXPRESSION ;
   private boolean[] T000L4_n249TBM33_EXPRESSION ;
   private String[] T000L4_A380TBM33_COND_DIV ;
   private boolean[] T000L4_n380TBM33_COND_DIV ;
   private String[] T000L4_A381TBM33_CRF_ITEM_CD ;
   private boolean[] T000L4_n381TBM33_CRF_ITEM_CD ;
   private byte[] T000L4_A250TBM33_PRIOR_NO ;
   private boolean[] T000L4_n250TBM33_PRIOR_NO ;
   private String[] T000L4_A382TBM33_ERR_DIV ;
   private boolean[] T000L4_n382TBM33_ERR_DIV ;
   private String[] T000L4_A383TBM33_ERR_MSG ;
   private boolean[] T000L4_n383TBM33_ERR_MSG ;
   private String[] T000L4_A554TBM33_ENABLED_FLG ;
   private boolean[] T000L4_n554TBM33_ENABLED_FLG ;
   private String[] T000L4_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] T000L4_n610TBM33_REQUIRED_INPUT_FLG ;
   private String[] T000L4_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] T000L4_n611TBM33_NUMERIC_RANGE_FLG ;
   private String[] T000L4_A251TBM33_DEL_FLG ;
   private boolean[] T000L4_n251TBM33_DEL_FLG ;
   private String[] T000L4_A254TBM33_CRT_PROG_NM ;
   private boolean[] T000L4_n254TBM33_CRT_PROG_NM ;
   private String[] T000L4_A257TBM33_UPD_PROG_NM ;
   private boolean[] T000L4_n257TBM33_UPD_PROG_NM ;
   private long[] T000L5_A246TBM33_STUDY_ID ;
   private short[] T000L5_A247TBM33_CRF_ID ;
   private short[] T000L5_A248TBM33_COND_NO ;
   private long[] T000L3_A246TBM33_STUDY_ID ;
   private short[] T000L3_A247TBM33_CRF_ID ;
   private short[] T000L3_A248TBM33_COND_NO ;
   private java.util.Date[] T000L3_A252TBM33_CRT_DATETIME ;
   private boolean[] T000L3_n252TBM33_CRT_DATETIME ;
   private String[] T000L3_A253TBM33_CRT_USER_ID ;
   private boolean[] T000L3_n253TBM33_CRT_USER_ID ;
   private java.util.Date[] T000L3_A255TBM33_UPD_DATETIME ;
   private boolean[] T000L3_n255TBM33_UPD_DATETIME ;
   private String[] T000L3_A256TBM33_UPD_USER_ID ;
   private boolean[] T000L3_n256TBM33_UPD_USER_ID ;
   private long[] T000L3_A258TBM33_UPD_CNT ;
   private boolean[] T000L3_n258TBM33_UPD_CNT ;
   private String[] T000L3_A379TBM33_COND_NM ;
   private boolean[] T000L3_n379TBM33_COND_NM ;
   private String[] T000L3_A249TBM33_EXPRESSION ;
   private boolean[] T000L3_n249TBM33_EXPRESSION ;
   private String[] T000L3_A380TBM33_COND_DIV ;
   private boolean[] T000L3_n380TBM33_COND_DIV ;
   private String[] T000L3_A381TBM33_CRF_ITEM_CD ;
   private boolean[] T000L3_n381TBM33_CRF_ITEM_CD ;
   private byte[] T000L3_A250TBM33_PRIOR_NO ;
   private boolean[] T000L3_n250TBM33_PRIOR_NO ;
   private String[] T000L3_A382TBM33_ERR_DIV ;
   private boolean[] T000L3_n382TBM33_ERR_DIV ;
   private String[] T000L3_A383TBM33_ERR_MSG ;
   private boolean[] T000L3_n383TBM33_ERR_MSG ;
   private String[] T000L3_A554TBM33_ENABLED_FLG ;
   private boolean[] T000L3_n554TBM33_ENABLED_FLG ;
   private String[] T000L3_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] T000L3_n610TBM33_REQUIRED_INPUT_FLG ;
   private String[] T000L3_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] T000L3_n611TBM33_NUMERIC_RANGE_FLG ;
   private String[] T000L3_A251TBM33_DEL_FLG ;
   private boolean[] T000L3_n251TBM33_DEL_FLG ;
   private String[] T000L3_A254TBM33_CRT_PROG_NM ;
   private boolean[] T000L3_n254TBM33_CRT_PROG_NM ;
   private String[] T000L3_A257TBM33_UPD_PROG_NM ;
   private boolean[] T000L3_n257TBM33_UPD_PROG_NM ;
   private long[] T000L6_A246TBM33_STUDY_ID ;
   private short[] T000L6_A247TBM33_CRF_ID ;
   private short[] T000L6_A248TBM33_COND_NO ;
   private long[] T000L7_A246TBM33_STUDY_ID ;
   private short[] T000L7_A247TBM33_CRF_ID ;
   private short[] T000L7_A248TBM33_COND_NO ;
   private long[] T000L2_A246TBM33_STUDY_ID ;
   private short[] T000L2_A247TBM33_CRF_ID ;
   private short[] T000L2_A248TBM33_COND_NO ;
   private java.util.Date[] T000L2_A252TBM33_CRT_DATETIME ;
   private boolean[] T000L2_n252TBM33_CRT_DATETIME ;
   private String[] T000L2_A253TBM33_CRT_USER_ID ;
   private boolean[] T000L2_n253TBM33_CRT_USER_ID ;
   private java.util.Date[] T000L2_A255TBM33_UPD_DATETIME ;
   private boolean[] T000L2_n255TBM33_UPD_DATETIME ;
   private String[] T000L2_A256TBM33_UPD_USER_ID ;
   private boolean[] T000L2_n256TBM33_UPD_USER_ID ;
   private long[] T000L2_A258TBM33_UPD_CNT ;
   private boolean[] T000L2_n258TBM33_UPD_CNT ;
   private String[] T000L2_A379TBM33_COND_NM ;
   private boolean[] T000L2_n379TBM33_COND_NM ;
   private String[] T000L2_A249TBM33_EXPRESSION ;
   private boolean[] T000L2_n249TBM33_EXPRESSION ;
   private String[] T000L2_A380TBM33_COND_DIV ;
   private boolean[] T000L2_n380TBM33_COND_DIV ;
   private String[] T000L2_A381TBM33_CRF_ITEM_CD ;
   private boolean[] T000L2_n381TBM33_CRF_ITEM_CD ;
   private byte[] T000L2_A250TBM33_PRIOR_NO ;
   private boolean[] T000L2_n250TBM33_PRIOR_NO ;
   private String[] T000L2_A382TBM33_ERR_DIV ;
   private boolean[] T000L2_n382TBM33_ERR_DIV ;
   private String[] T000L2_A383TBM33_ERR_MSG ;
   private boolean[] T000L2_n383TBM33_ERR_MSG ;
   private String[] T000L2_A554TBM33_ENABLED_FLG ;
   private boolean[] T000L2_n554TBM33_ENABLED_FLG ;
   private String[] T000L2_A610TBM33_REQUIRED_INPUT_FLG ;
   private boolean[] T000L2_n610TBM33_REQUIRED_INPUT_FLG ;
   private String[] T000L2_A611TBM33_NUMERIC_RANGE_FLG ;
   private boolean[] T000L2_n611TBM33_NUMERIC_RANGE_FLG ;
   private String[] T000L2_A251TBM33_DEL_FLG ;
   private boolean[] T000L2_n251TBM33_DEL_FLG ;
   private String[] T000L2_A254TBM33_CRT_PROG_NM ;
   private boolean[] T000L2_n254TBM33_CRT_PROG_NM ;
   private String[] T000L2_A257TBM33_UPD_PROG_NM ;
   private boolean[] T000L2_n257TBM33_UPD_PROG_NM ;
   private long[] T000L11_A246TBM33_STUDY_ID ;
   private short[] T000L11_A247TBM33_CRF_ID ;
   private short[] T000L11_A248TBM33_COND_NO ;
}

final  class tbm33_crf_cond__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000L2", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_CNT`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000L3", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_CNT`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000L4", "SELECT TM1.`TBM33_STUDY_ID`, TM1.`TBM33_CRF_ID`, TM1.`TBM33_COND_NO`, TM1.`TBM33_CRT_DATETIME`, TM1.`TBM33_CRT_USER_ID`, TM1.`TBM33_UPD_DATETIME`, TM1.`TBM33_UPD_USER_ID`, TM1.`TBM33_UPD_CNT`, TM1.`TBM33_COND_NM`, TM1.`TBM33_EXPRESSION`, TM1.`TBM33_COND_DIV`, TM1.`TBM33_CRF_ITEM_CD`, TM1.`TBM33_PRIOR_NO`, TM1.`TBM33_ERR_DIV`, TM1.`TBM33_ERR_MSG`, TM1.`TBM33_ENABLED_FLG`, TM1.`TBM33_REQUIRED_INPUT_FLG`, TM1.`TBM33_NUMERIC_RANGE_FLG`, TM1.`TBM33_DEL_FLG`, TM1.`TBM33_CRT_PROG_NM`, TM1.`TBM33_UPD_PROG_NM` FROM `TBM33_CRF_COND` TM1 WHERE TM1.`TBM33_STUDY_ID` = ? and TM1.`TBM33_CRF_ID` = ? and TM1.`TBM33_COND_NO` = ? ORDER BY TM1.`TBM33_STUDY_ID`, TM1.`TBM33_CRF_ID`, TM1.`TBM33_COND_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000L5", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO` FROM `TBM33_CRF_COND` WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000L6", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO` FROM `TBM33_CRF_COND` WHERE ( `TBM33_STUDY_ID` > ? or `TBM33_STUDY_ID` = ? and `TBM33_CRF_ID` > ? or `TBM33_CRF_ID` = ? and `TBM33_STUDY_ID` = ? and `TBM33_COND_NO` > ?) ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000L7", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO` FROM `TBM33_CRF_COND` WHERE ( `TBM33_STUDY_ID` < ? or `TBM33_STUDY_ID` = ? and `TBM33_CRF_ID` < ? or `TBM33_CRF_ID` = ? and `TBM33_STUDY_ID` = ? and `TBM33_COND_NO` < ?) ORDER BY `TBM33_STUDY_ID` DESC, `TBM33_CRF_ID` DESC, `TBM33_COND_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000L8", "INSERT INTO `TBM33_CRF_COND` (`TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO`, `TBM33_CRT_DATETIME`, `TBM33_CRT_USER_ID`, `TBM33_UPD_DATETIME`, `TBM33_UPD_USER_ID`, `TBM33_UPD_CNT`, `TBM33_COND_NM`, `TBM33_EXPRESSION`, `TBM33_COND_DIV`, `TBM33_CRF_ITEM_CD`, `TBM33_PRIOR_NO`, `TBM33_ERR_DIV`, `TBM33_ERR_MSG`, `TBM33_ENABLED_FLG`, `TBM33_REQUIRED_INPUT_FLG`, `TBM33_NUMERIC_RANGE_FLG`, `TBM33_DEL_FLG`, `TBM33_CRT_PROG_NM`, `TBM33_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000L9", "UPDATE `TBM33_CRF_COND` SET `TBM33_CRT_DATETIME`=?, `TBM33_CRT_USER_ID`=?, `TBM33_UPD_DATETIME`=?, `TBM33_UPD_USER_ID`=?, `TBM33_UPD_CNT`=?, `TBM33_COND_NM`=?, `TBM33_EXPRESSION`=?, `TBM33_COND_DIV`=?, `TBM33_CRF_ITEM_CD`=?, `TBM33_PRIOR_NO`=?, `TBM33_ERR_DIV`=?, `TBM33_ERR_MSG`=?, `TBM33_ENABLED_FLG`=?, `TBM33_REQUIRED_INPUT_FLG`=?, `TBM33_NUMERIC_RANGE_FLG`=?, `TBM33_DEL_FLG`=?, `TBM33_CRT_PROG_NM`=?, `TBM33_UPD_PROG_NM`=?  WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T000L10", "DELETE FROM `TBM33_CRF_COND`  WHERE `TBM33_STUDY_ID` = ? AND `TBM33_CRF_ID` = ? AND `TBM33_COND_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T000L11", "SELECT `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO` FROM `TBM33_CRF_COND` ORDER BY `TBM33_STUDY_ID`, `TBM33_CRF_ID`, `TBM33_COND_NO` ",true, GX_NOMASK, false, this,10,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDateTime(4) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(6) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((long[]) buf[11])[0] = rslt.getLong(8) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((byte[]) buf[21])[0] = rslt.getByte(13) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(4, (java.util.Date)parms[4], false);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[6], 128);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(6, (java.util.Date)parms[8], false);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[10], 128);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(8, ((Number) parms[12]).longValue());
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[14], 100);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[16], 1000);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[20], 50);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(13, ((Number) parms[22]).byteValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[26], 200);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[36], 40);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[38], 40);
               }
               break;
            case 7 :
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
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[11], 100);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 1000);
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
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 50);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[19]).byteValue());
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 200);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 1);
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
                  stmt.setVarchar(15, (String)parms[29], 1);
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
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 40);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 40);
               }
               stmt.setLong(19, ((Number) parms[36]).longValue());
               stmt.setShort(20, ((Number) parms[37]).shortValue());
               stmt.setShort(21, ((Number) parms[38]).shortValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
      }
   }

}

