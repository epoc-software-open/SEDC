/*
               File: tbm31_crf_impl
        Description: CRFマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:33.12
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm31_crf_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM31_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm31_crt_user_id0J18( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM31_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm31_upd_user_id0J18( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A68TBM31_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A68TBM31_STUDY_ID) ;
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
         Form.getMeta().addItem("description", "CRFマスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm31_crf_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm31_crf_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm31_crf_impl.class ));
   }

   public tbm31_crf_impl( int remoteHandle ,
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
         wb_table1_2_0J18( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0J18e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0J18( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0J18( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0J18( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0J18e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CRFマスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM31_CRF.htm");
         wb_table3_28_0J18( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0J18e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0J18e( true) ;
      }
      else
      {
         wb_table1_2_0J18e( false) ;
      }
   }

   public void wb_table3_28_0J18( boolean wbgen )
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
         wb_table4_34_0J18( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0J18e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 137,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM31_CRF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM31_CRF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0J18e( true) ;
      }
      else
      {
         wb_table3_28_0J18e( false) ;
      }
   }

   public void wb_table4_34_0J18( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_study_id_Internalname, "試験ID", "", "", lblTextblocktbm31_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM31_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A68TBM31_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A68TBM31_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crf_id_Internalname, "CRFID", "", "", lblTextblocktbm31_crf_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBM31_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A69TBM31_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A69TBM31_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_CRF_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_CRF_ID_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_CRF_ID", "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crf_nm_Internalname, "CRF名称", "", "", lblTextblocktbm31_crf_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRF_NM_Internalname, GXutil.rtrim( A393TBM31_CRF_NM), GXutil.rtrim( localUtil.format( A393TBM31_CRF_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_CRF_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_CRF_NM_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crf_snm_Internalname, "CRF略称", "", "", lblTextblocktbm31_crf_snm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRF_SNM_Internalname, GXutil.rtrim( A642TBM31_CRF_SNM), GXutil.rtrim( localUtil.format( A642TBM31_CRF_SNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_CRF_SNM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_CRF_SNM_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_grid_size_Internalname, "グリッドの間隔", "", "", lblTextblocktbm31_grid_size_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_GRID_SIZE_Internalname, GXutil.ltrim( localUtil.ntoc( A394TBM31_GRID_SIZE, (byte)(3), (byte)(0), ".", "")), ((edtTBM31_GRID_SIZE_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A394TBM31_GRID_SIZE), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A394TBM31_GRID_SIZE), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_GRID_SIZE_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_GRID_SIZE_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_order_Internalname, "表示順", "", "", lblTextblocktbm31_order_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A395TBM31_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBM31_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A395TBM31_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A395TBM31_ORDER), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_ORDER_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_ORDER_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_def_visit_no_Internalname, "デフォルトVISIT番号", "", "", lblTextblocktbm31_def_visit_no_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_DEF_VISIT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A528TBM31_DEF_VISIT_NO, (byte)(6), (byte)(0), ".", "")), ((edtTBM31_DEF_VISIT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A528TBM31_DEF_VISIT_NO), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A528TBM31_DEF_VISIT_NO), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_DEF_VISIT_NO_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_DEF_VISIT_NO_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_VISIT_NO", "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_def_domain_cd_Internalname, "デフォルトドメインコード", "", "", lblTextblocktbm31_def_domain_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_DEF_DOMAIN_CD_Internalname, GXutil.rtrim( A529TBM31_DEF_DOMAIN_CD), GXutil.rtrim( localUtil.format( A529TBM31_DEF_DOMAIN_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_DEF_DOMAIN_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_DEF_DOMAIN_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_CD", "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_status_Internalname, "状態", "", "", lblTextblocktbm31_status_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_STATUS_Internalname, GXutil.rtrim( A643TBM31_STATUS), GXutil.rtrim( localUtil.format( A643TBM31_STATUS, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_STATUS_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_STATUS_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_note_Internalname, "備考", "", "", lblTextblocktbm31_note_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM31_NOTE_Internalname, GXutil.rtrim( A396TBM31_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", (short)(0), 1, edtTBM31_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_repeat_flg_Internalname, "繰り返し使用フラグ", "", "", lblTextblocktbm31_repeat_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_REPEAT_FLG_Internalname, GXutil.ltrim( localUtil.ntoc( A943TBM31_REPEAT_FLG, (byte)(1), (byte)(0), ".", "")), ((edtTBM31_REPEAT_FLG_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A943TBM31_REPEAT_FLG), "9")) : localUtil.format( DecimalUtil.doubleToDec(A943TBM31_REPEAT_FLG), "9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_REPEAT_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_REPEAT_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_repeat_max_Internalname, "繰返し最大数", "", "", lblTextblocktbm31_repeat_max_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_REPEAT_MAX_Internalname, GXutil.ltrim( localUtil.ntoc( A944TBM31_REPEAT_MAX, (byte)(2), (byte)(0), ".", "")), ((edtTBM31_REPEAT_MAX_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A944TBM31_REPEAT_MAX), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A944TBM31_REPEAT_MAX), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_REPEAT_MAX_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_REPEAT_MAX_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm31_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_DEL_FLG_Internalname, GXutil.rtrim( A397TBM31_DEL_FLG), GXutil.rtrim( localUtil.format( A397TBM31_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm31_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM31_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRT_DATETIME_Internalname, localUtil.format(A398TBM31_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A398TBM31_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM31_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM31_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM31_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm31_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRT_USER_ID_Internalname, GXutil.rtrim( A399TBM31_CRT_USER_ID), GXutil.rtrim( localUtil.format( A399TBM31_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm31_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRT_PROG_NM_Internalname, GXutil.rtrim( A400TBM31_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A400TBM31_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm31_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM31_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_UPD_DATETIME_Internalname, localUtil.format(A401TBM31_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A401TBM31_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM31_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM31_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM31_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm31_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_UPD_USER_ID_Internalname, GXutil.rtrim( A402TBM31_UPD_USER_ID), GXutil.rtrim( localUtil.format( A402TBM31_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm31_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_UPD_PROG_NM_Internalname, GXutil.rtrim( A403TBM31_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A403TBM31_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm31_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A404TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM31_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A404TBM31_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A404TBM31_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM31_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM31_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0J18e( true) ;
      }
      else
      {
         wb_table4_34_0J18e( false) ;
      }
   }

   public void wb_table2_5_0J18( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM31_CRF.htm");
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
         wb_table2_5_0J18e( true) ;
      }
      else
      {
         wb_table2_5_0J18e( false) ;
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
      /* Execute user event: e110J2 */
      e110J2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A68TBM31_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
            }
            else
            {
               A68TBM31_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM31_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A69TBM31_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
            }
            else
            {
               A69TBM31_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM31_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
            }
            A393TBM31_CRF_NM = httpContext.cgiGet( edtTBM31_CRF_NM_Internalname) ;
            n393TBM31_CRF_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A393TBM31_CRF_NM", A393TBM31_CRF_NM);
            n393TBM31_CRF_NM = ((GXutil.strcmp("", A393TBM31_CRF_NM)==0) ? true : false) ;
            A642TBM31_CRF_SNM = httpContext.cgiGet( edtTBM31_CRF_SNM_Internalname) ;
            n642TBM31_CRF_SNM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A642TBM31_CRF_SNM", A642TBM31_CRF_SNM);
            n642TBM31_CRF_SNM = ((GXutil.strcmp("", A642TBM31_CRF_SNM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_GRID_SIZE_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_GRID_SIZE_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_GRID_SIZE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_GRID_SIZE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A394TBM31_GRID_SIZE = (short)(0) ;
               n394TBM31_GRID_SIZE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A394TBM31_GRID_SIZE", GXutil.ltrim( GXutil.str( A394TBM31_GRID_SIZE, 3, 0)));
            }
            else
            {
               A394TBM31_GRID_SIZE = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM31_GRID_SIZE_Internalname), ".", ",")) ;
               n394TBM31_GRID_SIZE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A394TBM31_GRID_SIZE", GXutil.ltrim( GXutil.str( A394TBM31_GRID_SIZE, 3, 0)));
            }
            n394TBM31_GRID_SIZE = ((0==A394TBM31_GRID_SIZE) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_ORDER_Internalname), ".", ",") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A395TBM31_ORDER = 0 ;
               n395TBM31_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A395TBM31_ORDER", GXutil.ltrim( GXutil.str( A395TBM31_ORDER, 5, 0)));
            }
            else
            {
               A395TBM31_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM31_ORDER_Internalname), ".", ",")) ;
               n395TBM31_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A395TBM31_ORDER", GXutil.ltrim( GXutil.str( A395TBM31_ORDER, 5, 0)));
            }
            n395TBM31_ORDER = ((0==A395TBM31_ORDER) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_DEF_VISIT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_DEF_VISIT_NO_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_DEF_VISIT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_DEF_VISIT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A528TBM31_DEF_VISIT_NO = 0 ;
               n528TBM31_DEF_VISIT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A528TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A528TBM31_DEF_VISIT_NO, 6, 0)));
            }
            else
            {
               A528TBM31_DEF_VISIT_NO = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM31_DEF_VISIT_NO_Internalname), ".", ",")) ;
               n528TBM31_DEF_VISIT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A528TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A528TBM31_DEF_VISIT_NO, 6, 0)));
            }
            n528TBM31_DEF_VISIT_NO = ((0==A528TBM31_DEF_VISIT_NO) ? true : false) ;
            A529TBM31_DEF_DOMAIN_CD = httpContext.cgiGet( edtTBM31_DEF_DOMAIN_CD_Internalname) ;
            n529TBM31_DEF_DOMAIN_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A529TBM31_DEF_DOMAIN_CD", A529TBM31_DEF_DOMAIN_CD);
            n529TBM31_DEF_DOMAIN_CD = ((GXutil.strcmp("", A529TBM31_DEF_DOMAIN_CD)==0) ? true : false) ;
            A643TBM31_STATUS = httpContext.cgiGet( edtTBM31_STATUS_Internalname) ;
            n643TBM31_STATUS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
            n643TBM31_STATUS = ((GXutil.strcmp("", A643TBM31_STATUS)==0) ? true : false) ;
            A396TBM31_NOTE = httpContext.cgiGet( edtTBM31_NOTE_Internalname) ;
            n396TBM31_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A396TBM31_NOTE", A396TBM31_NOTE);
            n396TBM31_NOTE = ((GXutil.strcmp("", A396TBM31_NOTE)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_REPEAT_FLG_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_REPEAT_FLG_Internalname), ".", ",") > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_REPEAT_FLG");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_REPEAT_FLG_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A943TBM31_REPEAT_FLG = (byte)(0) ;
               n943TBM31_REPEAT_FLG = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A943TBM31_REPEAT_FLG", GXutil.str( A943TBM31_REPEAT_FLG, 1, 0));
            }
            else
            {
               A943TBM31_REPEAT_FLG = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM31_REPEAT_FLG_Internalname), ".", ",")) ;
               n943TBM31_REPEAT_FLG = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A943TBM31_REPEAT_FLG", GXutil.str( A943TBM31_REPEAT_FLG, 1, 0));
            }
            n943TBM31_REPEAT_FLG = ((0==A943TBM31_REPEAT_FLG) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_REPEAT_MAX_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_REPEAT_MAX_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_REPEAT_MAX");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_REPEAT_MAX_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A944TBM31_REPEAT_MAX = (byte)(0) ;
               n944TBM31_REPEAT_MAX = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A944TBM31_REPEAT_MAX", GXutil.ltrim( GXutil.str( A944TBM31_REPEAT_MAX, 2, 0)));
            }
            else
            {
               A944TBM31_REPEAT_MAX = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBM31_REPEAT_MAX_Internalname), ".", ",")) ;
               n944TBM31_REPEAT_MAX = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A944TBM31_REPEAT_MAX", GXutil.ltrim( GXutil.str( A944TBM31_REPEAT_MAX, 2, 0)));
            }
            n944TBM31_REPEAT_MAX = ((0==A944TBM31_REPEAT_MAX) ? true : false) ;
            A397TBM31_DEL_FLG = httpContext.cgiGet( edtTBM31_DEL_FLG_Internalname) ;
            n397TBM31_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
            n397TBM31_DEL_FLG = ((GXutil.strcmp("", A397TBM31_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM31_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM31_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A398TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n398TBM31_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A398TBM31_CRT_DATETIME", localUtil.ttoc( A398TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A398TBM31_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM31_CRT_DATETIME_Internalname)) ;
               n398TBM31_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A398TBM31_CRT_DATETIME", localUtil.ttoc( A398TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n398TBM31_CRT_DATETIME = (GXutil.nullDate().equals(A398TBM31_CRT_DATETIME) ? true : false) ;
            A399TBM31_CRT_USER_ID = httpContext.cgiGet( edtTBM31_CRT_USER_ID_Internalname) ;
            n399TBM31_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A399TBM31_CRT_USER_ID", A399TBM31_CRT_USER_ID);
            n399TBM31_CRT_USER_ID = ((GXutil.strcmp("", A399TBM31_CRT_USER_ID)==0) ? true : false) ;
            A400TBM31_CRT_PROG_NM = httpContext.cgiGet( edtTBM31_CRT_PROG_NM_Internalname) ;
            n400TBM31_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A400TBM31_CRT_PROG_NM", A400TBM31_CRT_PROG_NM);
            n400TBM31_CRT_PROG_NM = ((GXutil.strcmp("", A400TBM31_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM31_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM31_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A401TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n401TBM31_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A401TBM31_UPD_DATETIME", localUtil.ttoc( A401TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A401TBM31_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM31_UPD_DATETIME_Internalname)) ;
               n401TBM31_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A401TBM31_UPD_DATETIME", localUtil.ttoc( A401TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n401TBM31_UPD_DATETIME = (GXutil.nullDate().equals(A401TBM31_UPD_DATETIME) ? true : false) ;
            A402TBM31_UPD_USER_ID = httpContext.cgiGet( edtTBM31_UPD_USER_ID_Internalname) ;
            n402TBM31_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A402TBM31_UPD_USER_ID", A402TBM31_UPD_USER_ID);
            n402TBM31_UPD_USER_ID = ((GXutil.strcmp("", A402TBM31_UPD_USER_ID)==0) ? true : false) ;
            A403TBM31_UPD_PROG_NM = httpContext.cgiGet( edtTBM31_UPD_PROG_NM_Internalname) ;
            n403TBM31_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A403TBM31_UPD_PROG_NM", A403TBM31_UPD_PROG_NM);
            n403TBM31_UPD_PROG_NM = ((GXutil.strcmp("", A403TBM31_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A404TBM31_UPD_CNT = 0 ;
               n404TBM31_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A404TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)));
            }
            else
            {
               A404TBM31_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM31_UPD_CNT_Internalname), ".", ",") ;
               n404TBM31_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A404TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)));
            }
            n404TBM31_UPD_CNT = ((0==A404TBM31_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z68TBM31_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z68TBM31_STUDY_ID"), ".", ",") ;
            Z69TBM31_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z69TBM31_CRF_ID"), ".", ",")) ;
            Z398TBM31_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z398TBM31_CRT_DATETIME"), 0) ;
            n398TBM31_CRT_DATETIME = (GXutil.nullDate().equals(A398TBM31_CRT_DATETIME) ? true : false) ;
            Z399TBM31_CRT_USER_ID = httpContext.cgiGet( "Z399TBM31_CRT_USER_ID") ;
            n399TBM31_CRT_USER_ID = ((GXutil.strcmp("", A399TBM31_CRT_USER_ID)==0) ? true : false) ;
            Z401TBM31_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z401TBM31_UPD_DATETIME"), 0) ;
            n401TBM31_UPD_DATETIME = (GXutil.nullDate().equals(A401TBM31_UPD_DATETIME) ? true : false) ;
            Z402TBM31_UPD_USER_ID = httpContext.cgiGet( "Z402TBM31_UPD_USER_ID") ;
            n402TBM31_UPD_USER_ID = ((GXutil.strcmp("", A402TBM31_UPD_USER_ID)==0) ? true : false) ;
            Z404TBM31_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z404TBM31_UPD_CNT"), ".", ",") ;
            n404TBM31_UPD_CNT = ((0==A404TBM31_UPD_CNT) ? true : false) ;
            Z393TBM31_CRF_NM = httpContext.cgiGet( "Z393TBM31_CRF_NM") ;
            n393TBM31_CRF_NM = ((GXutil.strcmp("", A393TBM31_CRF_NM)==0) ? true : false) ;
            Z642TBM31_CRF_SNM = httpContext.cgiGet( "Z642TBM31_CRF_SNM") ;
            n642TBM31_CRF_SNM = ((GXutil.strcmp("", A642TBM31_CRF_SNM)==0) ? true : false) ;
            Z394TBM31_GRID_SIZE = (short)(localUtil.ctol( httpContext.cgiGet( "Z394TBM31_GRID_SIZE"), ".", ",")) ;
            n394TBM31_GRID_SIZE = ((0==A394TBM31_GRID_SIZE) ? true : false) ;
            Z395TBM31_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( "Z395TBM31_ORDER"), ".", ",")) ;
            n395TBM31_ORDER = ((0==A395TBM31_ORDER) ? true : false) ;
            Z528TBM31_DEF_VISIT_NO = (int)(localUtil.ctol( httpContext.cgiGet( "Z528TBM31_DEF_VISIT_NO"), ".", ",")) ;
            n528TBM31_DEF_VISIT_NO = ((0==A528TBM31_DEF_VISIT_NO) ? true : false) ;
            Z529TBM31_DEF_DOMAIN_CD = httpContext.cgiGet( "Z529TBM31_DEF_DOMAIN_CD") ;
            n529TBM31_DEF_DOMAIN_CD = ((GXutil.strcmp("", A529TBM31_DEF_DOMAIN_CD)==0) ? true : false) ;
            Z643TBM31_STATUS = httpContext.cgiGet( "Z643TBM31_STATUS") ;
            n643TBM31_STATUS = ((GXutil.strcmp("", A643TBM31_STATUS)==0) ? true : false) ;
            Z396TBM31_NOTE = httpContext.cgiGet( "Z396TBM31_NOTE") ;
            n396TBM31_NOTE = ((GXutil.strcmp("", A396TBM31_NOTE)==0) ? true : false) ;
            Z943TBM31_REPEAT_FLG = (byte)(localUtil.ctol( httpContext.cgiGet( "Z943TBM31_REPEAT_FLG"), ".", ",")) ;
            n943TBM31_REPEAT_FLG = ((0==A943TBM31_REPEAT_FLG) ? true : false) ;
            Z944TBM31_REPEAT_MAX = (byte)(localUtil.ctol( httpContext.cgiGet( "Z944TBM31_REPEAT_MAX"), ".", ",")) ;
            n944TBM31_REPEAT_MAX = ((0==A944TBM31_REPEAT_MAX) ? true : false) ;
            Z397TBM31_DEL_FLG = httpContext.cgiGet( "Z397TBM31_DEL_FLG") ;
            n397TBM31_DEL_FLG = ((GXutil.strcmp("", A397TBM31_DEL_FLG)==0) ? true : false) ;
            Z400TBM31_CRT_PROG_NM = httpContext.cgiGet( "Z400TBM31_CRT_PROG_NM") ;
            n400TBM31_CRT_PROG_NM = ((GXutil.strcmp("", A400TBM31_CRT_PROG_NM)==0) ? true : false) ;
            Z403TBM31_UPD_PROG_NM = httpContext.cgiGet( "Z403TBM31_UPD_PROG_NM") ;
            n403TBM31_UPD_PROG_NM = ((GXutil.strcmp("", A403TBM31_UPD_PROG_NM)==0) ? true : false) ;
            O404TBM31_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O404TBM31_UPD_CNT"), ".", ",") ;
            n404TBM31_UPD_CNT = ((0==A404TBM31_UPD_CNT) ? true : false) ;
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
               A68TBM31_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
               A69TBM31_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
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
                     /* Execute user event: e110J2 */
                     e110J2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120J2 */
                     e120J2 ();
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
         /* Execute user event: e120J2 */
         e120J2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0J18( ) ;
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
      disableAttributes0J18( ) ;
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

   public void resetCaption0J0( )
   {
   }

   public void e110J2( )
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

   public void e120J2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A69TBM31_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A393TBM31_CRF_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A642TBM31_CRF_SNM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A394TBM31_GRID_SIZE, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A395TBM31_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A528TBM31_DEF_VISIT_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A529TBM31_DEF_DOMAIN_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A643TBM31_STATUS + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A396TBM31_NOTE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A397TBM31_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A398TBM31_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm31_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A398TBM31_CRT_DATETIME", localUtil.ttoc( A398TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A399TBM31_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A400TBM31_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A401TBM31_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm31_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A401TBM31_UPD_DATETIME", localUtil.ttoc( A401TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A402TBM31_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A403TBM31_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
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

   public void zm0J18( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z398TBM31_CRT_DATETIME = T000J3_A398TBM31_CRT_DATETIME[0] ;
            Z399TBM31_CRT_USER_ID = T000J3_A399TBM31_CRT_USER_ID[0] ;
            Z401TBM31_UPD_DATETIME = T000J3_A401TBM31_UPD_DATETIME[0] ;
            Z402TBM31_UPD_USER_ID = T000J3_A402TBM31_UPD_USER_ID[0] ;
            Z404TBM31_UPD_CNT = T000J3_A404TBM31_UPD_CNT[0] ;
            Z393TBM31_CRF_NM = T000J3_A393TBM31_CRF_NM[0] ;
            Z642TBM31_CRF_SNM = T000J3_A642TBM31_CRF_SNM[0] ;
            Z394TBM31_GRID_SIZE = T000J3_A394TBM31_GRID_SIZE[0] ;
            Z395TBM31_ORDER = T000J3_A395TBM31_ORDER[0] ;
            Z528TBM31_DEF_VISIT_NO = T000J3_A528TBM31_DEF_VISIT_NO[0] ;
            Z529TBM31_DEF_DOMAIN_CD = T000J3_A529TBM31_DEF_DOMAIN_CD[0] ;
            Z643TBM31_STATUS = T000J3_A643TBM31_STATUS[0] ;
            Z396TBM31_NOTE = T000J3_A396TBM31_NOTE[0] ;
            Z943TBM31_REPEAT_FLG = T000J3_A943TBM31_REPEAT_FLG[0] ;
            Z944TBM31_REPEAT_MAX = T000J3_A944TBM31_REPEAT_MAX[0] ;
            Z397TBM31_DEL_FLG = T000J3_A397TBM31_DEL_FLG[0] ;
            Z400TBM31_CRT_PROG_NM = T000J3_A400TBM31_CRT_PROG_NM[0] ;
            Z403TBM31_UPD_PROG_NM = T000J3_A403TBM31_UPD_PROG_NM[0] ;
         }
         else
         {
            Z398TBM31_CRT_DATETIME = A398TBM31_CRT_DATETIME ;
            Z399TBM31_CRT_USER_ID = A399TBM31_CRT_USER_ID ;
            Z401TBM31_UPD_DATETIME = A401TBM31_UPD_DATETIME ;
            Z402TBM31_UPD_USER_ID = A402TBM31_UPD_USER_ID ;
            Z404TBM31_UPD_CNT = A404TBM31_UPD_CNT ;
            Z393TBM31_CRF_NM = A393TBM31_CRF_NM ;
            Z642TBM31_CRF_SNM = A642TBM31_CRF_SNM ;
            Z394TBM31_GRID_SIZE = A394TBM31_GRID_SIZE ;
            Z395TBM31_ORDER = A395TBM31_ORDER ;
            Z528TBM31_DEF_VISIT_NO = A528TBM31_DEF_VISIT_NO ;
            Z529TBM31_DEF_DOMAIN_CD = A529TBM31_DEF_DOMAIN_CD ;
            Z643TBM31_STATUS = A643TBM31_STATUS ;
            Z396TBM31_NOTE = A396TBM31_NOTE ;
            Z943TBM31_REPEAT_FLG = A943TBM31_REPEAT_FLG ;
            Z944TBM31_REPEAT_MAX = A944TBM31_REPEAT_MAX ;
            Z397TBM31_DEL_FLG = A397TBM31_DEL_FLG ;
            Z400TBM31_CRT_PROG_NM = A400TBM31_CRT_PROG_NM ;
            Z403TBM31_UPD_PROG_NM = A403TBM31_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z69TBM31_CRF_ID = A69TBM31_CRF_ID ;
         Z398TBM31_CRT_DATETIME = A398TBM31_CRT_DATETIME ;
         Z399TBM31_CRT_USER_ID = A399TBM31_CRT_USER_ID ;
         Z401TBM31_UPD_DATETIME = A401TBM31_UPD_DATETIME ;
         Z402TBM31_UPD_USER_ID = A402TBM31_UPD_USER_ID ;
         Z404TBM31_UPD_CNT = A404TBM31_UPD_CNT ;
         Z393TBM31_CRF_NM = A393TBM31_CRF_NM ;
         Z642TBM31_CRF_SNM = A642TBM31_CRF_SNM ;
         Z394TBM31_GRID_SIZE = A394TBM31_GRID_SIZE ;
         Z395TBM31_ORDER = A395TBM31_ORDER ;
         Z528TBM31_DEF_VISIT_NO = A528TBM31_DEF_VISIT_NO ;
         Z529TBM31_DEF_DOMAIN_CD = A529TBM31_DEF_DOMAIN_CD ;
         Z643TBM31_STATUS = A643TBM31_STATUS ;
         Z396TBM31_NOTE = A396TBM31_NOTE ;
         Z943TBM31_REPEAT_FLG = A943TBM31_REPEAT_FLG ;
         Z944TBM31_REPEAT_MAX = A944TBM31_REPEAT_MAX ;
         Z397TBM31_DEL_FLG = A397TBM31_DEL_FLG ;
         Z400TBM31_CRT_PROG_NM = A400TBM31_CRT_PROG_NM ;
         Z403TBM31_UPD_PROG_NM = A403TBM31_UPD_PROG_NM ;
         Z68TBM31_STUDY_ID = A68TBM31_STUDY_ID ;
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

   public void load0J18( )
   {
      /* Using cursor T000J5 */
      pr_default.execute(3, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A398TBM31_CRT_DATETIME = T000J5_A398TBM31_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A398TBM31_CRT_DATETIME", localUtil.ttoc( A398TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n398TBM31_CRT_DATETIME = T000J5_n398TBM31_CRT_DATETIME[0] ;
         A399TBM31_CRT_USER_ID = T000J5_A399TBM31_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A399TBM31_CRT_USER_ID", A399TBM31_CRT_USER_ID);
         n399TBM31_CRT_USER_ID = T000J5_n399TBM31_CRT_USER_ID[0] ;
         A401TBM31_UPD_DATETIME = T000J5_A401TBM31_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A401TBM31_UPD_DATETIME", localUtil.ttoc( A401TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n401TBM31_UPD_DATETIME = T000J5_n401TBM31_UPD_DATETIME[0] ;
         A402TBM31_UPD_USER_ID = T000J5_A402TBM31_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A402TBM31_UPD_USER_ID", A402TBM31_UPD_USER_ID);
         n402TBM31_UPD_USER_ID = T000J5_n402TBM31_UPD_USER_ID[0] ;
         A404TBM31_UPD_CNT = T000J5_A404TBM31_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A404TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)));
         n404TBM31_UPD_CNT = T000J5_n404TBM31_UPD_CNT[0] ;
         A393TBM31_CRF_NM = T000J5_A393TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A393TBM31_CRF_NM", A393TBM31_CRF_NM);
         n393TBM31_CRF_NM = T000J5_n393TBM31_CRF_NM[0] ;
         A642TBM31_CRF_SNM = T000J5_A642TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A642TBM31_CRF_SNM", A642TBM31_CRF_SNM);
         n642TBM31_CRF_SNM = T000J5_n642TBM31_CRF_SNM[0] ;
         A394TBM31_GRID_SIZE = T000J5_A394TBM31_GRID_SIZE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A394TBM31_GRID_SIZE", GXutil.ltrim( GXutil.str( A394TBM31_GRID_SIZE, 3, 0)));
         n394TBM31_GRID_SIZE = T000J5_n394TBM31_GRID_SIZE[0] ;
         A395TBM31_ORDER = T000J5_A395TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A395TBM31_ORDER", GXutil.ltrim( GXutil.str( A395TBM31_ORDER, 5, 0)));
         n395TBM31_ORDER = T000J5_n395TBM31_ORDER[0] ;
         A528TBM31_DEF_VISIT_NO = T000J5_A528TBM31_DEF_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A528TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A528TBM31_DEF_VISIT_NO, 6, 0)));
         n528TBM31_DEF_VISIT_NO = T000J5_n528TBM31_DEF_VISIT_NO[0] ;
         A529TBM31_DEF_DOMAIN_CD = T000J5_A529TBM31_DEF_DOMAIN_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A529TBM31_DEF_DOMAIN_CD", A529TBM31_DEF_DOMAIN_CD);
         n529TBM31_DEF_DOMAIN_CD = T000J5_n529TBM31_DEF_DOMAIN_CD[0] ;
         A643TBM31_STATUS = T000J5_A643TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
         n643TBM31_STATUS = T000J5_n643TBM31_STATUS[0] ;
         A396TBM31_NOTE = T000J5_A396TBM31_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396TBM31_NOTE", A396TBM31_NOTE);
         n396TBM31_NOTE = T000J5_n396TBM31_NOTE[0] ;
         A943TBM31_REPEAT_FLG = T000J5_A943TBM31_REPEAT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A943TBM31_REPEAT_FLG", GXutil.str( A943TBM31_REPEAT_FLG, 1, 0));
         n943TBM31_REPEAT_FLG = T000J5_n943TBM31_REPEAT_FLG[0] ;
         A944TBM31_REPEAT_MAX = T000J5_A944TBM31_REPEAT_MAX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A944TBM31_REPEAT_MAX", GXutil.ltrim( GXutil.str( A944TBM31_REPEAT_MAX, 2, 0)));
         n944TBM31_REPEAT_MAX = T000J5_n944TBM31_REPEAT_MAX[0] ;
         A397TBM31_DEL_FLG = T000J5_A397TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
         n397TBM31_DEL_FLG = T000J5_n397TBM31_DEL_FLG[0] ;
         A400TBM31_CRT_PROG_NM = T000J5_A400TBM31_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A400TBM31_CRT_PROG_NM", A400TBM31_CRT_PROG_NM);
         n400TBM31_CRT_PROG_NM = T000J5_n400TBM31_CRT_PROG_NM[0] ;
         A403TBM31_UPD_PROG_NM = T000J5_A403TBM31_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A403TBM31_UPD_PROG_NM", A403TBM31_UPD_PROG_NM);
         n403TBM31_UPD_PROG_NM = T000J5_n403TBM31_UPD_PROG_NM[0] ;
         zm0J18( -8) ;
      }
      pr_default.close(3);
      onLoadActions0J18( ) ;
   }

   public void onLoadActions0J18( )
   {
      AV9Pgmname = "TBM31_CRF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0J18( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM31_CRF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000J4 */
      pr_default.execute(2, new Object[] {new Long(A68TBM31_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A398TBM31_CRT_DATETIME) || (( A398TBM31_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A398TBM31_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM31_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A401TBM31_UPD_DATETIME) || (( A401TBM31_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A401TBM31_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM31_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0J18( )
   {
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A68TBM31_STUDY_ID )
   {
      /* Using cursor T000J4 */
      pr_default.execute(2, new Object[] {new Long(A68TBM31_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
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

   public void getKey0J18( )
   {
      /* Using cursor T000J6 */
      pr_default.execute(4, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000J3 */
      pr_default.execute(1, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0J18( 8) ;
         RcdFound18 = (short)(1) ;
         A69TBM31_CRF_ID = T000J3_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         A398TBM31_CRT_DATETIME = T000J3_A398TBM31_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A398TBM31_CRT_DATETIME", localUtil.ttoc( A398TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n398TBM31_CRT_DATETIME = T000J3_n398TBM31_CRT_DATETIME[0] ;
         A399TBM31_CRT_USER_ID = T000J3_A399TBM31_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A399TBM31_CRT_USER_ID", A399TBM31_CRT_USER_ID);
         n399TBM31_CRT_USER_ID = T000J3_n399TBM31_CRT_USER_ID[0] ;
         A401TBM31_UPD_DATETIME = T000J3_A401TBM31_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A401TBM31_UPD_DATETIME", localUtil.ttoc( A401TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n401TBM31_UPD_DATETIME = T000J3_n401TBM31_UPD_DATETIME[0] ;
         A402TBM31_UPD_USER_ID = T000J3_A402TBM31_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A402TBM31_UPD_USER_ID", A402TBM31_UPD_USER_ID);
         n402TBM31_UPD_USER_ID = T000J3_n402TBM31_UPD_USER_ID[0] ;
         A404TBM31_UPD_CNT = T000J3_A404TBM31_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A404TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)));
         n404TBM31_UPD_CNT = T000J3_n404TBM31_UPD_CNT[0] ;
         A393TBM31_CRF_NM = T000J3_A393TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A393TBM31_CRF_NM", A393TBM31_CRF_NM);
         n393TBM31_CRF_NM = T000J3_n393TBM31_CRF_NM[0] ;
         A642TBM31_CRF_SNM = T000J3_A642TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A642TBM31_CRF_SNM", A642TBM31_CRF_SNM);
         n642TBM31_CRF_SNM = T000J3_n642TBM31_CRF_SNM[0] ;
         A394TBM31_GRID_SIZE = T000J3_A394TBM31_GRID_SIZE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A394TBM31_GRID_SIZE", GXutil.ltrim( GXutil.str( A394TBM31_GRID_SIZE, 3, 0)));
         n394TBM31_GRID_SIZE = T000J3_n394TBM31_GRID_SIZE[0] ;
         A395TBM31_ORDER = T000J3_A395TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A395TBM31_ORDER", GXutil.ltrim( GXutil.str( A395TBM31_ORDER, 5, 0)));
         n395TBM31_ORDER = T000J3_n395TBM31_ORDER[0] ;
         A528TBM31_DEF_VISIT_NO = T000J3_A528TBM31_DEF_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A528TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A528TBM31_DEF_VISIT_NO, 6, 0)));
         n528TBM31_DEF_VISIT_NO = T000J3_n528TBM31_DEF_VISIT_NO[0] ;
         A529TBM31_DEF_DOMAIN_CD = T000J3_A529TBM31_DEF_DOMAIN_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A529TBM31_DEF_DOMAIN_CD", A529TBM31_DEF_DOMAIN_CD);
         n529TBM31_DEF_DOMAIN_CD = T000J3_n529TBM31_DEF_DOMAIN_CD[0] ;
         A643TBM31_STATUS = T000J3_A643TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
         n643TBM31_STATUS = T000J3_n643TBM31_STATUS[0] ;
         A396TBM31_NOTE = T000J3_A396TBM31_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396TBM31_NOTE", A396TBM31_NOTE);
         n396TBM31_NOTE = T000J3_n396TBM31_NOTE[0] ;
         A943TBM31_REPEAT_FLG = T000J3_A943TBM31_REPEAT_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A943TBM31_REPEAT_FLG", GXutil.str( A943TBM31_REPEAT_FLG, 1, 0));
         n943TBM31_REPEAT_FLG = T000J3_n943TBM31_REPEAT_FLG[0] ;
         A944TBM31_REPEAT_MAX = T000J3_A944TBM31_REPEAT_MAX[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A944TBM31_REPEAT_MAX", GXutil.ltrim( GXutil.str( A944TBM31_REPEAT_MAX, 2, 0)));
         n944TBM31_REPEAT_MAX = T000J3_n944TBM31_REPEAT_MAX[0] ;
         A397TBM31_DEL_FLG = T000J3_A397TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
         n397TBM31_DEL_FLG = T000J3_n397TBM31_DEL_FLG[0] ;
         A400TBM31_CRT_PROG_NM = T000J3_A400TBM31_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A400TBM31_CRT_PROG_NM", A400TBM31_CRT_PROG_NM);
         n400TBM31_CRT_PROG_NM = T000J3_n400TBM31_CRT_PROG_NM[0] ;
         A403TBM31_UPD_PROG_NM = T000J3_A403TBM31_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A403TBM31_UPD_PROG_NM", A403TBM31_UPD_PROG_NM);
         n403TBM31_UPD_PROG_NM = T000J3_n403TBM31_UPD_PROG_NM[0] ;
         A68TBM31_STUDY_ID = T000J3_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         O404TBM31_UPD_CNT = A404TBM31_UPD_CNT ;
         n404TBM31_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A404TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)));
         Z68TBM31_STUDY_ID = A68TBM31_STUDY_ID ;
         Z69TBM31_CRF_ID = A69TBM31_CRF_ID ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0J18( ) ;
         if ( AnyError == 1 )
         {
            RcdFound18 = (short)(0) ;
            initializeNonKey0J18( ) ;
         }
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound18 = (short)(0) ;
         initializeNonKey0J18( ) ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode18 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0J18( ) ;
      if ( RcdFound18 == 0 )
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
      RcdFound18 = (short)(0) ;
      /* Using cursor T000J7 */
      pr_default.execute(5, new Object[] {new Long(A68TBM31_STUDY_ID), new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000J7_A68TBM31_STUDY_ID[0] < A68TBM31_STUDY_ID ) || ( T000J7_A68TBM31_STUDY_ID[0] == A68TBM31_STUDY_ID ) && ( T000J7_A69TBM31_CRF_ID[0] < A69TBM31_CRF_ID ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000J7_A68TBM31_STUDY_ID[0] > A68TBM31_STUDY_ID ) || ( T000J7_A68TBM31_STUDY_ID[0] == A68TBM31_STUDY_ID ) && ( T000J7_A69TBM31_CRF_ID[0] > A69TBM31_CRF_ID ) ) )
         {
            A68TBM31_STUDY_ID = T000J7_A68TBM31_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
            A69TBM31_CRF_ID = T000J7_A69TBM31_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound18 = (short)(0) ;
      /* Using cursor T000J8 */
      pr_default.execute(6, new Object[] {new Long(A68TBM31_STUDY_ID), new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000J8_A68TBM31_STUDY_ID[0] > A68TBM31_STUDY_ID ) || ( T000J8_A68TBM31_STUDY_ID[0] == A68TBM31_STUDY_ID ) && ( T000J8_A69TBM31_CRF_ID[0] > A69TBM31_CRF_ID ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000J8_A68TBM31_STUDY_ID[0] < A68TBM31_STUDY_ID ) || ( T000J8_A68TBM31_STUDY_ID[0] == A68TBM31_STUDY_ID ) && ( T000J8_A69TBM31_CRF_ID[0] < A69TBM31_CRF_ID ) ) )
         {
            A68TBM31_STUDY_ID = T000J8_A68TBM31_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
            A69TBM31_CRF_ID = T000J8_A69TBM31_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0J18( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0J18( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound18 == 1 )
         {
            if ( ( A68TBM31_STUDY_ID != Z68TBM31_STUDY_ID ) || ( A69TBM31_CRF_ID != Z69TBM31_CRF_ID ) )
            {
               A68TBM31_STUDY_ID = Z68TBM31_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
               A69TBM31_CRF_ID = Z69TBM31_CRF_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM31_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0J18( ) ;
               GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A68TBM31_STUDY_ID != Z68TBM31_STUDY_ID ) || ( A69TBM31_CRF_ID != Z69TBM31_CRF_ID ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0J18( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM31_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0J18( ) ;
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
      if ( ( A68TBM31_STUDY_ID != Z68TBM31_STUDY_ID ) || ( A69TBM31_CRF_ID != Z69TBM31_CRF_ID ) )
      {
         A68TBM31_STUDY_ID = Z68TBM31_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A69TBM31_CRF_ID = Z69TBM31_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM31_CRF_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0J18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM31_CRF_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0J18( ) ;
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM31_CRF_NM_Internalname ;
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
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM31_CRF_NM_Internalname ;
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
      scanStart0J18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound18 != 0 )
         {
            scanNext0J18( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM31_CRF_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0J18( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0J18( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000J2 */
         pr_default.execute(0, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM31_CRF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z398TBM31_CRT_DATETIME.equals( T000J2_A398TBM31_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z399TBM31_CRT_USER_ID, T000J2_A399TBM31_CRT_USER_ID[0]) != 0 ) || !( Z401TBM31_UPD_DATETIME.equals( T000J2_A401TBM31_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z402TBM31_UPD_USER_ID, T000J2_A402TBM31_UPD_USER_ID[0]) != 0 ) || ( Z404TBM31_UPD_CNT != T000J2_A404TBM31_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z393TBM31_CRF_NM, T000J2_A393TBM31_CRF_NM[0]) != 0 ) || ( GXutil.strcmp(Z642TBM31_CRF_SNM, T000J2_A642TBM31_CRF_SNM[0]) != 0 ) || ( Z394TBM31_GRID_SIZE != T000J2_A394TBM31_GRID_SIZE[0] ) || ( Z395TBM31_ORDER != T000J2_A395TBM31_ORDER[0] ) || ( Z528TBM31_DEF_VISIT_NO != T000J2_A528TBM31_DEF_VISIT_NO[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z529TBM31_DEF_DOMAIN_CD, T000J2_A529TBM31_DEF_DOMAIN_CD[0]) != 0 ) || ( GXutil.strcmp(Z643TBM31_STATUS, T000J2_A643TBM31_STATUS[0]) != 0 ) || ( GXutil.strcmp(Z396TBM31_NOTE, T000J2_A396TBM31_NOTE[0]) != 0 ) || ( Z943TBM31_REPEAT_FLG != T000J2_A943TBM31_REPEAT_FLG[0] ) || ( Z944TBM31_REPEAT_MAX != T000J2_A944TBM31_REPEAT_MAX[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z397TBM31_DEL_FLG, T000J2_A397TBM31_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z400TBM31_CRT_PROG_NM, T000J2_A400TBM31_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z403TBM31_UPD_PROG_NM, T000J2_A403TBM31_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM31_CRF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0J18( )
   {
      beforeValidate0J18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0J18( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0J18( 0) ;
         checkOptimisticConcurrency0J18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0J18( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0J18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000J9 */
                  pr_default.execute(7, new Object[] {new Short(A69TBM31_CRF_ID), new Boolean(n398TBM31_CRT_DATETIME), A398TBM31_CRT_DATETIME, new Boolean(n399TBM31_CRT_USER_ID), A399TBM31_CRT_USER_ID, new Boolean(n401TBM31_UPD_DATETIME), A401TBM31_UPD_DATETIME, new Boolean(n402TBM31_UPD_USER_ID), A402TBM31_UPD_USER_ID, new Boolean(n404TBM31_UPD_CNT), new Long(A404TBM31_UPD_CNT), new Boolean(n393TBM31_CRF_NM), A393TBM31_CRF_NM, new Boolean(n642TBM31_CRF_SNM), A642TBM31_CRF_SNM, new Boolean(n394TBM31_GRID_SIZE), new Short(A394TBM31_GRID_SIZE), new Boolean(n395TBM31_ORDER), new Integer(A395TBM31_ORDER), new Boolean(n528TBM31_DEF_VISIT_NO), new Integer(A528TBM31_DEF_VISIT_NO), new Boolean(n529TBM31_DEF_DOMAIN_CD), A529TBM31_DEF_DOMAIN_CD, new Boolean(n643TBM31_STATUS), A643TBM31_STATUS, new Boolean(n396TBM31_NOTE), A396TBM31_NOTE, new Boolean(n943TBM31_REPEAT_FLG), new Byte(A943TBM31_REPEAT_FLG), new Boolean(n944TBM31_REPEAT_MAX), new Byte(A944TBM31_REPEAT_MAX), new Boolean(n397TBM31_DEL_FLG), A397TBM31_DEL_FLG, new Boolean(n400TBM31_CRT_PROG_NM), A400TBM31_CRT_PROG_NM, new Boolean(n403TBM31_UPD_PROG_NM), A403TBM31_UPD_PROG_NM, new Long(A68TBM31_STUDY_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM31_CRF") ;
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
                        resetCaption0J0( ) ;
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
            load0J18( ) ;
         }
         endLevel0J18( ) ;
      }
      closeExtendedTableCursors0J18( ) ;
   }

   public void update0J18( )
   {
      beforeValidate0J18( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0J18( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0J18( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0J18( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0J18( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000J10 */
                  pr_default.execute(8, new Object[] {new Boolean(n398TBM31_CRT_DATETIME), A398TBM31_CRT_DATETIME, new Boolean(n399TBM31_CRT_USER_ID), A399TBM31_CRT_USER_ID, new Boolean(n401TBM31_UPD_DATETIME), A401TBM31_UPD_DATETIME, new Boolean(n402TBM31_UPD_USER_ID), A402TBM31_UPD_USER_ID, new Boolean(n404TBM31_UPD_CNT), new Long(A404TBM31_UPD_CNT), new Boolean(n393TBM31_CRF_NM), A393TBM31_CRF_NM, new Boolean(n642TBM31_CRF_SNM), A642TBM31_CRF_SNM, new Boolean(n394TBM31_GRID_SIZE), new Short(A394TBM31_GRID_SIZE), new Boolean(n395TBM31_ORDER), new Integer(A395TBM31_ORDER), new Boolean(n528TBM31_DEF_VISIT_NO), new Integer(A528TBM31_DEF_VISIT_NO), new Boolean(n529TBM31_DEF_DOMAIN_CD), A529TBM31_DEF_DOMAIN_CD, new Boolean(n643TBM31_STATUS), A643TBM31_STATUS, new Boolean(n396TBM31_NOTE), A396TBM31_NOTE, new Boolean(n943TBM31_REPEAT_FLG), new Byte(A943TBM31_REPEAT_FLG), new Boolean(n944TBM31_REPEAT_MAX), new Byte(A944TBM31_REPEAT_MAX), new Boolean(n397TBM31_DEL_FLG), A397TBM31_DEL_FLG, new Boolean(n400TBM31_CRT_PROG_NM), A400TBM31_CRT_PROG_NM, new Boolean(n403TBM31_UPD_PROG_NM), A403TBM31_UPD_PROG_NM, new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM31_CRF") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM31_CRF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0J18( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0J0( ) ;
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
         endLevel0J18( ) ;
      }
      closeExtendedTableCursors0J18( ) ;
   }

   public void deferredUpdate0J18( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0J18( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0J18( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0J18( ) ;
         afterConfirm0J18( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0J18( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000J11 */
               pr_default.execute(9, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM31_CRF") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound18 == 0 )
                     {
                        initAll0J18( ) ;
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
                     resetCaption0J0( ) ;
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
      sMode18 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0J18( ) ;
      Gx_mode = sMode18 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0J18( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM31_CRF" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000J12 */
         pr_default.execute(10, new Object[] {new Long(A68TBM31_STUDY_ID), new Short(A69TBM31_CRF_ID)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel0J18( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0J18( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm31_crf");
         if ( AnyError == 0 )
         {
            confirmValues0J0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm31_crf");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0J18( )
   {
      /* Scan By routine */
      /* Using cursor T000J13 */
      pr_default.execute(11);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A68TBM31_STUDY_ID = T000J13_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A69TBM31_CRF_ID = T000J13_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0J18( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A68TBM31_STUDY_ID = T000J13_A68TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
         A69TBM31_CRF_ID = T000J13_A69TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
      }
   }

   public void scanEnd0J18( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0J18( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0J18( )
   {
      /* Before Insert Rules */
      A398TBM31_CRT_DATETIME = GXutil.now( ) ;
      n398TBM31_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A398TBM31_CRT_DATETIME", localUtil.ttoc( A398TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A399TBM31_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm31_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      A399TBM31_CRT_USER_ID = GXt_char1 ;
      n399TBM31_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A399TBM31_CRT_USER_ID", A399TBM31_CRT_USER_ID);
      A401TBM31_UPD_DATETIME = GXutil.now( ) ;
      n401TBM31_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A401TBM31_UPD_DATETIME", localUtil.ttoc( A401TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A402TBM31_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm31_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      A402TBM31_UPD_USER_ID = GXt_char1 ;
      n402TBM31_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A402TBM31_UPD_USER_ID", A402TBM31_UPD_USER_ID);
      A404TBM31_UPD_CNT = (long)(O404TBM31_UPD_CNT+1) ;
      n404TBM31_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A404TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0J18( )
   {
      /* Before Update Rules */
      A401TBM31_UPD_DATETIME = GXutil.now( ) ;
      n401TBM31_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A401TBM31_UPD_DATETIME", localUtil.ttoc( A401TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A402TBM31_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm31_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      A402TBM31_UPD_USER_ID = GXt_char1 ;
      n402TBM31_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A402TBM31_UPD_USER_ID", A402TBM31_UPD_USER_ID);
      A404TBM31_UPD_CNT = (long)(O404TBM31_UPD_CNT+1) ;
      n404TBM31_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A404TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0J18( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0J18( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0J18( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0J18( )
   {
      edtTBM31_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_STUDY_ID_Enabled, 5, 0)));
      edtTBM31_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_CRF_ID_Enabled, 5, 0)));
      edtTBM31_CRF_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_CRF_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_CRF_NM_Enabled, 5, 0)));
      edtTBM31_CRF_SNM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_CRF_SNM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_CRF_SNM_Enabled, 5, 0)));
      edtTBM31_GRID_SIZE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_GRID_SIZE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_GRID_SIZE_Enabled, 5, 0)));
      edtTBM31_ORDER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_ORDER_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_ORDER_Enabled, 5, 0)));
      edtTBM31_DEF_VISIT_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_DEF_VISIT_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_DEF_VISIT_NO_Enabled, 5, 0)));
      edtTBM31_DEF_DOMAIN_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_DEF_DOMAIN_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_DEF_DOMAIN_CD_Enabled, 5, 0)));
      edtTBM31_STATUS_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_STATUS_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_STATUS_Enabled, 5, 0)));
      edtTBM31_NOTE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_NOTE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_NOTE_Enabled, 5, 0)));
      edtTBM31_REPEAT_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_REPEAT_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_REPEAT_FLG_Enabled, 5, 0)));
      edtTBM31_REPEAT_MAX_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_REPEAT_MAX_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_REPEAT_MAX_Enabled, 5, 0)));
      edtTBM31_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_DEL_FLG_Enabled, 5, 0)));
      edtTBM31_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM31_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM31_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM31_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM31_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM31_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM31_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM31_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM31_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0J0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CRFマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317143574");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm31_crf") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0J18( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z68TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z69TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z398TBM31_CRT_DATETIME", localUtil.ttoc( Z398TBM31_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z399TBM31_CRT_USER_ID", GXutil.rtrim( Z399TBM31_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z401TBM31_UPD_DATETIME", localUtil.ttoc( Z401TBM31_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z402TBM31_UPD_USER_ID", GXutil.rtrim( Z402TBM31_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z404TBM31_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z404TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z393TBM31_CRF_NM", GXutil.rtrim( Z393TBM31_CRF_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z642TBM31_CRF_SNM", GXutil.rtrim( Z642TBM31_CRF_SNM));
      GxWebStd.gx_hidden_field( httpContext, "Z394TBM31_GRID_SIZE", GXutil.ltrim( localUtil.ntoc( Z394TBM31_GRID_SIZE, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z395TBM31_ORDER", GXutil.ltrim( localUtil.ntoc( Z395TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z528TBM31_DEF_VISIT_NO", GXutil.ltrim( localUtil.ntoc( Z528TBM31_DEF_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z529TBM31_DEF_DOMAIN_CD", GXutil.rtrim( Z529TBM31_DEF_DOMAIN_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z643TBM31_STATUS", GXutil.rtrim( Z643TBM31_STATUS));
      GxWebStd.gx_hidden_field( httpContext, "Z396TBM31_NOTE", GXutil.rtrim( Z396TBM31_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z943TBM31_REPEAT_FLG", GXutil.ltrim( localUtil.ntoc( Z943TBM31_REPEAT_FLG, (byte)(1), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z944TBM31_REPEAT_MAX", GXutil.ltrim( localUtil.ntoc( Z944TBM31_REPEAT_MAX, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z397TBM31_DEL_FLG", GXutil.rtrim( Z397TBM31_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z400TBM31_CRT_PROG_NM", GXutil.rtrim( Z400TBM31_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z403TBM31_UPD_PROG_NM", GXutil.rtrim( Z403TBM31_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O404TBM31_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O404TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM31_CRF" ;
   }

   public String getPgmdesc( )
   {
      return "CRFマスタ" ;
   }

   public void initializeNonKey0J18( )
   {
      A398TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n398TBM31_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A398TBM31_CRT_DATETIME", localUtil.ttoc( A398TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n398TBM31_CRT_DATETIME = (GXutil.nullDate().equals(A398TBM31_CRT_DATETIME) ? true : false) ;
      A399TBM31_CRT_USER_ID = "" ;
      n399TBM31_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A399TBM31_CRT_USER_ID", A399TBM31_CRT_USER_ID);
      n399TBM31_CRT_USER_ID = ((GXutil.strcmp("", A399TBM31_CRT_USER_ID)==0) ? true : false) ;
      A401TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n401TBM31_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A401TBM31_UPD_DATETIME", localUtil.ttoc( A401TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n401TBM31_UPD_DATETIME = (GXutil.nullDate().equals(A401TBM31_UPD_DATETIME) ? true : false) ;
      A402TBM31_UPD_USER_ID = "" ;
      n402TBM31_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A402TBM31_UPD_USER_ID", A402TBM31_UPD_USER_ID);
      n402TBM31_UPD_USER_ID = ((GXutil.strcmp("", A402TBM31_UPD_USER_ID)==0) ? true : false) ;
      A404TBM31_UPD_CNT = 0 ;
      n404TBM31_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A404TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)));
      n404TBM31_UPD_CNT = ((0==A404TBM31_UPD_CNT) ? true : false) ;
      A393TBM31_CRF_NM = "" ;
      n393TBM31_CRF_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A393TBM31_CRF_NM", A393TBM31_CRF_NM);
      n393TBM31_CRF_NM = ((GXutil.strcmp("", A393TBM31_CRF_NM)==0) ? true : false) ;
      A642TBM31_CRF_SNM = "" ;
      n642TBM31_CRF_SNM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A642TBM31_CRF_SNM", A642TBM31_CRF_SNM);
      n642TBM31_CRF_SNM = ((GXutil.strcmp("", A642TBM31_CRF_SNM)==0) ? true : false) ;
      A394TBM31_GRID_SIZE = (short)(0) ;
      n394TBM31_GRID_SIZE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A394TBM31_GRID_SIZE", GXutil.ltrim( GXutil.str( A394TBM31_GRID_SIZE, 3, 0)));
      n394TBM31_GRID_SIZE = ((0==A394TBM31_GRID_SIZE) ? true : false) ;
      A395TBM31_ORDER = 0 ;
      n395TBM31_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A395TBM31_ORDER", GXutil.ltrim( GXutil.str( A395TBM31_ORDER, 5, 0)));
      n395TBM31_ORDER = ((0==A395TBM31_ORDER) ? true : false) ;
      A528TBM31_DEF_VISIT_NO = 0 ;
      n528TBM31_DEF_VISIT_NO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A528TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A528TBM31_DEF_VISIT_NO, 6, 0)));
      n528TBM31_DEF_VISIT_NO = ((0==A528TBM31_DEF_VISIT_NO) ? true : false) ;
      A529TBM31_DEF_DOMAIN_CD = "" ;
      n529TBM31_DEF_DOMAIN_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A529TBM31_DEF_DOMAIN_CD", A529TBM31_DEF_DOMAIN_CD);
      n529TBM31_DEF_DOMAIN_CD = ((GXutil.strcmp("", A529TBM31_DEF_DOMAIN_CD)==0) ? true : false) ;
      A643TBM31_STATUS = "" ;
      n643TBM31_STATUS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A643TBM31_STATUS", A643TBM31_STATUS);
      n643TBM31_STATUS = ((GXutil.strcmp("", A643TBM31_STATUS)==0) ? true : false) ;
      A396TBM31_NOTE = "" ;
      n396TBM31_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A396TBM31_NOTE", A396TBM31_NOTE);
      n396TBM31_NOTE = ((GXutil.strcmp("", A396TBM31_NOTE)==0) ? true : false) ;
      A943TBM31_REPEAT_FLG = (byte)(0) ;
      n943TBM31_REPEAT_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A943TBM31_REPEAT_FLG", GXutil.str( A943TBM31_REPEAT_FLG, 1, 0));
      n943TBM31_REPEAT_FLG = ((0==A943TBM31_REPEAT_FLG) ? true : false) ;
      A944TBM31_REPEAT_MAX = (byte)(0) ;
      n944TBM31_REPEAT_MAX = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A944TBM31_REPEAT_MAX", GXutil.ltrim( GXutil.str( A944TBM31_REPEAT_MAX, 2, 0)));
      n944TBM31_REPEAT_MAX = ((0==A944TBM31_REPEAT_MAX) ? true : false) ;
      A397TBM31_DEL_FLG = "" ;
      n397TBM31_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A397TBM31_DEL_FLG", A397TBM31_DEL_FLG);
      n397TBM31_DEL_FLG = ((GXutil.strcmp("", A397TBM31_DEL_FLG)==0) ? true : false) ;
      A400TBM31_CRT_PROG_NM = "" ;
      n400TBM31_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A400TBM31_CRT_PROG_NM", A400TBM31_CRT_PROG_NM);
      n400TBM31_CRT_PROG_NM = ((GXutil.strcmp("", A400TBM31_CRT_PROG_NM)==0) ? true : false) ;
      A403TBM31_UPD_PROG_NM = "" ;
      n403TBM31_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A403TBM31_UPD_PROG_NM", A403TBM31_UPD_PROG_NM);
      n403TBM31_UPD_PROG_NM = ((GXutil.strcmp("", A403TBM31_UPD_PROG_NM)==0) ? true : false) ;
      O404TBM31_UPD_CNT = A404TBM31_UPD_CNT ;
      n404TBM31_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A404TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A404TBM31_UPD_CNT, 10, 0)));
   }

   public void initAll0J18( )
   {
      A68TBM31_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A68TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A68TBM31_STUDY_ID, 10, 0)));
      A69TBM31_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A69TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A69TBM31_CRF_ID, 4, 0)));
      initializeNonKey0J18( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317143585");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm31_crf.js", "?20177317143585");
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
      lblTextblocktbm31_study_id_Internalname = "TEXTBLOCKTBM31_STUDY_ID" ;
      edtTBM31_STUDY_ID_Internalname = "TBM31_STUDY_ID" ;
      lblTextblocktbm31_crf_id_Internalname = "TEXTBLOCKTBM31_CRF_ID" ;
      edtTBM31_CRF_ID_Internalname = "TBM31_CRF_ID" ;
      lblTextblocktbm31_crf_nm_Internalname = "TEXTBLOCKTBM31_CRF_NM" ;
      edtTBM31_CRF_NM_Internalname = "TBM31_CRF_NM" ;
      lblTextblocktbm31_crf_snm_Internalname = "TEXTBLOCKTBM31_CRF_SNM" ;
      edtTBM31_CRF_SNM_Internalname = "TBM31_CRF_SNM" ;
      lblTextblocktbm31_grid_size_Internalname = "TEXTBLOCKTBM31_GRID_SIZE" ;
      edtTBM31_GRID_SIZE_Internalname = "TBM31_GRID_SIZE" ;
      lblTextblocktbm31_order_Internalname = "TEXTBLOCKTBM31_ORDER" ;
      edtTBM31_ORDER_Internalname = "TBM31_ORDER" ;
      lblTextblocktbm31_def_visit_no_Internalname = "TEXTBLOCKTBM31_DEF_VISIT_NO" ;
      edtTBM31_DEF_VISIT_NO_Internalname = "TBM31_DEF_VISIT_NO" ;
      lblTextblocktbm31_def_domain_cd_Internalname = "TEXTBLOCKTBM31_DEF_DOMAIN_CD" ;
      edtTBM31_DEF_DOMAIN_CD_Internalname = "TBM31_DEF_DOMAIN_CD" ;
      lblTextblocktbm31_status_Internalname = "TEXTBLOCKTBM31_STATUS" ;
      edtTBM31_STATUS_Internalname = "TBM31_STATUS" ;
      lblTextblocktbm31_note_Internalname = "TEXTBLOCKTBM31_NOTE" ;
      edtTBM31_NOTE_Internalname = "TBM31_NOTE" ;
      lblTextblocktbm31_repeat_flg_Internalname = "TEXTBLOCKTBM31_REPEAT_FLG" ;
      edtTBM31_REPEAT_FLG_Internalname = "TBM31_REPEAT_FLG" ;
      lblTextblocktbm31_repeat_max_Internalname = "TEXTBLOCKTBM31_REPEAT_MAX" ;
      edtTBM31_REPEAT_MAX_Internalname = "TBM31_REPEAT_MAX" ;
      lblTextblocktbm31_del_flg_Internalname = "TEXTBLOCKTBM31_DEL_FLG" ;
      edtTBM31_DEL_FLG_Internalname = "TBM31_DEL_FLG" ;
      lblTextblocktbm31_crt_datetime_Internalname = "TEXTBLOCKTBM31_CRT_DATETIME" ;
      edtTBM31_CRT_DATETIME_Internalname = "TBM31_CRT_DATETIME" ;
      lblTextblocktbm31_crt_user_id_Internalname = "TEXTBLOCKTBM31_CRT_USER_ID" ;
      edtTBM31_CRT_USER_ID_Internalname = "TBM31_CRT_USER_ID" ;
      lblTextblocktbm31_crt_prog_nm_Internalname = "TEXTBLOCKTBM31_CRT_PROG_NM" ;
      edtTBM31_CRT_PROG_NM_Internalname = "TBM31_CRT_PROG_NM" ;
      lblTextblocktbm31_upd_datetime_Internalname = "TEXTBLOCKTBM31_UPD_DATETIME" ;
      edtTBM31_UPD_DATETIME_Internalname = "TBM31_UPD_DATETIME" ;
      lblTextblocktbm31_upd_user_id_Internalname = "TEXTBLOCKTBM31_UPD_USER_ID" ;
      edtTBM31_UPD_USER_ID_Internalname = "TBM31_UPD_USER_ID" ;
      lblTextblocktbm31_upd_prog_nm_Internalname = "TEXTBLOCKTBM31_UPD_PROG_NM" ;
      edtTBM31_UPD_PROG_NM_Internalname = "TBM31_UPD_PROG_NM" ;
      lblTextblocktbm31_upd_cnt_Internalname = "TEXTBLOCKTBM31_UPD_CNT" ;
      edtTBM31_UPD_CNT_Internalname = "TBM31_UPD_CNT" ;
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
      edtTBM31_UPD_CNT_Jsonclick = "" ;
      edtTBM31_UPD_CNT_Enabled = 1 ;
      edtTBM31_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM31_UPD_PROG_NM_Enabled = 1 ;
      edtTBM31_UPD_USER_ID_Jsonclick = "" ;
      edtTBM31_UPD_USER_ID_Enabled = 1 ;
      edtTBM31_UPD_DATETIME_Jsonclick = "" ;
      edtTBM31_UPD_DATETIME_Enabled = 1 ;
      edtTBM31_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM31_CRT_PROG_NM_Enabled = 1 ;
      edtTBM31_CRT_USER_ID_Jsonclick = "" ;
      edtTBM31_CRT_USER_ID_Enabled = 1 ;
      edtTBM31_CRT_DATETIME_Jsonclick = "" ;
      edtTBM31_CRT_DATETIME_Enabled = 1 ;
      edtTBM31_DEL_FLG_Jsonclick = "" ;
      edtTBM31_DEL_FLG_Enabled = 1 ;
      edtTBM31_REPEAT_MAX_Jsonclick = "" ;
      edtTBM31_REPEAT_MAX_Enabled = 1 ;
      edtTBM31_REPEAT_FLG_Jsonclick = "" ;
      edtTBM31_REPEAT_FLG_Enabled = 1 ;
      edtTBM31_NOTE_Enabled = 1 ;
      edtTBM31_STATUS_Jsonclick = "" ;
      edtTBM31_STATUS_Enabled = 1 ;
      edtTBM31_DEF_DOMAIN_CD_Jsonclick = "" ;
      edtTBM31_DEF_DOMAIN_CD_Enabled = 1 ;
      edtTBM31_DEF_VISIT_NO_Jsonclick = "" ;
      edtTBM31_DEF_VISIT_NO_Enabled = 1 ;
      edtTBM31_ORDER_Jsonclick = "" ;
      edtTBM31_ORDER_Enabled = 1 ;
      edtTBM31_GRID_SIZE_Jsonclick = "" ;
      edtTBM31_GRID_SIZE_Enabled = 1 ;
      edtTBM31_CRF_SNM_Jsonclick = "" ;
      edtTBM31_CRF_SNM_Enabled = 1 ;
      edtTBM31_CRF_NM_Jsonclick = "" ;
      edtTBM31_CRF_NM_Enabled = 1 ;
      edtTBM31_CRF_ID_Jsonclick = "" ;
      edtTBM31_CRF_ID_Enabled = 1 ;
      edtTBM31_STUDY_ID_Jsonclick = "" ;
      edtTBM31_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm31_crt_user_id0J18( String Gx_mode )
   {
      GXt_char1 = A399TBM31_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm31_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      A399TBM31_CRT_USER_ID = GXt_char1 ;
      n399TBM31_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A399TBM31_CRT_USER_ID", A399TBM31_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A399TBM31_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm31_upd_user_id0J18( String Gx_mode )
   {
      GXt_char1 = A402TBM31_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm31_crf_impl.this.GXt_char1 = GXv_char2[0] ;
      A402TBM31_UPD_USER_ID = GXt_char1 ;
      n402TBM31_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A402TBM31_UPD_USER_ID", A402TBM31_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A402TBM31_UPD_USER_ID))+"\"");
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
      /* Using cursor T000J14 */
      pr_default.execute(12, new Object[] {new Long(A68TBM31_STUDY_ID)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
      GX_FocusControl = edtTBM31_CRF_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm31_study_id( long GX_Parm1 )
   {
      A68TBM31_STUDY_ID = GX_Parm1 ;
      /* Using cursor T000J14 */
      pr_default.execute(12, new Object[] {new Long(A68TBM31_STUDY_ID)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("'CRFマスタ・試験サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbm31_crf_id( long GX_Parm1 ,
                                   short GX_Parm2 ,
                                   java.util.Date GX_Parm3 ,
                                   String GX_Parm4 ,
                                   java.util.Date GX_Parm5 ,
                                   String GX_Parm6 ,
                                   long GX_Parm7 ,
                                   String GX_Parm8 ,
                                   String GX_Parm9 ,
                                   short GX_Parm10 ,
                                   int GX_Parm11 ,
                                   int GX_Parm12 ,
                                   String GX_Parm13 ,
                                   String GX_Parm14 ,
                                   String GX_Parm15 ,
                                   byte GX_Parm16 ,
                                   byte GX_Parm17 ,
                                   String GX_Parm18 ,
                                   String GX_Parm19 ,
                                   String GX_Parm20 )
   {
      A68TBM31_STUDY_ID = GX_Parm1 ;
      A69TBM31_CRF_ID = GX_Parm2 ;
      A398TBM31_CRT_DATETIME = GX_Parm3 ;
      n398TBM31_CRT_DATETIME = false ;
      A399TBM31_CRT_USER_ID = GX_Parm4 ;
      n399TBM31_CRT_USER_ID = false ;
      A401TBM31_UPD_DATETIME = GX_Parm5 ;
      n401TBM31_UPD_DATETIME = false ;
      A402TBM31_UPD_USER_ID = GX_Parm6 ;
      n402TBM31_UPD_USER_ID = false ;
      A404TBM31_UPD_CNT = GX_Parm7 ;
      n404TBM31_UPD_CNT = false ;
      A393TBM31_CRF_NM = GX_Parm8 ;
      n393TBM31_CRF_NM = false ;
      A642TBM31_CRF_SNM = GX_Parm9 ;
      n642TBM31_CRF_SNM = false ;
      A394TBM31_GRID_SIZE = GX_Parm10 ;
      n394TBM31_GRID_SIZE = false ;
      A395TBM31_ORDER = GX_Parm11 ;
      n395TBM31_ORDER = false ;
      A528TBM31_DEF_VISIT_NO = GX_Parm12 ;
      n528TBM31_DEF_VISIT_NO = false ;
      A529TBM31_DEF_DOMAIN_CD = GX_Parm13 ;
      n529TBM31_DEF_DOMAIN_CD = false ;
      A643TBM31_STATUS = GX_Parm14 ;
      n643TBM31_STATUS = false ;
      A396TBM31_NOTE = GX_Parm15 ;
      n396TBM31_NOTE = false ;
      A943TBM31_REPEAT_FLG = GX_Parm16 ;
      n943TBM31_REPEAT_FLG = false ;
      A944TBM31_REPEAT_MAX = GX_Parm17 ;
      n944TBM31_REPEAT_MAX = false ;
      A397TBM31_DEL_FLG = GX_Parm18 ;
      n397TBM31_DEL_FLG = false ;
      A400TBM31_CRT_PROG_NM = GX_Parm19 ;
      n400TBM31_CRT_PROG_NM = false ;
      A403TBM31_UPD_PROG_NM = GX_Parm20 ;
      n403TBM31_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A398TBM31_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A399TBM31_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A401TBM31_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A402TBM31_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A404TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A393TBM31_CRF_NM));
      isValidOutput.add(GXutil.rtrim( A642TBM31_CRF_SNM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A394TBM31_GRID_SIZE, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A395TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A528TBM31_DEF_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A529TBM31_DEF_DOMAIN_CD));
      isValidOutput.add(GXutil.rtrim( A643TBM31_STATUS));
      isValidOutput.add(GXutil.rtrim( A396TBM31_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A943TBM31_REPEAT_FLG, (byte)(1), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A944TBM31_REPEAT_MAX, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A397TBM31_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A400TBM31_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A403TBM31_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z68TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z69TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z398TBM31_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z399TBM31_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z401TBM31_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z402TBM31_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z404TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z393TBM31_CRF_NM));
      isValidOutput.add(GXutil.rtrim( Z642TBM31_CRF_SNM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z394TBM31_GRID_SIZE, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z395TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z528TBM31_DEF_VISIT_NO, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z529TBM31_DEF_DOMAIN_CD));
      isValidOutput.add(GXutil.rtrim( Z643TBM31_STATUS));
      isValidOutput.add(GXutil.rtrim( Z396TBM31_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z943TBM31_REPEAT_FLG, (byte)(1), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z944TBM31_REPEAT_MAX, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z397TBM31_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z400TBM31_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z403TBM31_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O404TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z398TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z399TBM31_CRT_USER_ID = "" ;
      Z401TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z402TBM31_UPD_USER_ID = "" ;
      Z393TBM31_CRF_NM = "" ;
      Z642TBM31_CRF_SNM = "" ;
      Z529TBM31_DEF_DOMAIN_CD = "" ;
      Z643TBM31_STATUS = "" ;
      Z396TBM31_NOTE = "" ;
      Z397TBM31_DEL_FLG = "" ;
      Z400TBM31_CRT_PROG_NM = "" ;
      Z403TBM31_UPD_PROG_NM = "" ;
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
      lblTextblocktbm31_study_id_Jsonclick = "" ;
      lblTextblocktbm31_crf_id_Jsonclick = "" ;
      lblTextblocktbm31_crf_nm_Jsonclick = "" ;
      A393TBM31_CRF_NM = "" ;
      lblTextblocktbm31_crf_snm_Jsonclick = "" ;
      A642TBM31_CRF_SNM = "" ;
      lblTextblocktbm31_grid_size_Jsonclick = "" ;
      lblTextblocktbm31_order_Jsonclick = "" ;
      lblTextblocktbm31_def_visit_no_Jsonclick = "" ;
      lblTextblocktbm31_def_domain_cd_Jsonclick = "" ;
      A529TBM31_DEF_DOMAIN_CD = "" ;
      lblTextblocktbm31_status_Jsonclick = "" ;
      A643TBM31_STATUS = "" ;
      lblTextblocktbm31_note_Jsonclick = "" ;
      A396TBM31_NOTE = "" ;
      lblTextblocktbm31_repeat_flg_Jsonclick = "" ;
      lblTextblocktbm31_repeat_max_Jsonclick = "" ;
      lblTextblocktbm31_del_flg_Jsonclick = "" ;
      A397TBM31_DEL_FLG = "" ;
      lblTextblocktbm31_crt_datetime_Jsonclick = "" ;
      A398TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm31_crt_user_id_Jsonclick = "" ;
      A399TBM31_CRT_USER_ID = "" ;
      lblTextblocktbm31_crt_prog_nm_Jsonclick = "" ;
      A400TBM31_CRT_PROG_NM = "" ;
      lblTextblocktbm31_upd_datetime_Jsonclick = "" ;
      A401TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm31_upd_user_id_Jsonclick = "" ;
      A402TBM31_UPD_USER_ID = "" ;
      lblTextblocktbm31_upd_prog_nm_Jsonclick = "" ;
      A403TBM31_UPD_PROG_NM = "" ;
      lblTextblocktbm31_upd_cnt_Jsonclick = "" ;
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
      AV7W_TXT = "" ;
      T000J5_A69TBM31_CRF_ID = new short[1] ;
      T000J5_A398TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J5_n398TBM31_CRT_DATETIME = new boolean[] {false} ;
      T000J5_A399TBM31_CRT_USER_ID = new String[] {""} ;
      T000J5_n399TBM31_CRT_USER_ID = new boolean[] {false} ;
      T000J5_A401TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J5_n401TBM31_UPD_DATETIME = new boolean[] {false} ;
      T000J5_A402TBM31_UPD_USER_ID = new String[] {""} ;
      T000J5_n402TBM31_UPD_USER_ID = new boolean[] {false} ;
      T000J5_A404TBM31_UPD_CNT = new long[1] ;
      T000J5_n404TBM31_UPD_CNT = new boolean[] {false} ;
      T000J5_A393TBM31_CRF_NM = new String[] {""} ;
      T000J5_n393TBM31_CRF_NM = new boolean[] {false} ;
      T000J5_A642TBM31_CRF_SNM = new String[] {""} ;
      T000J5_n642TBM31_CRF_SNM = new boolean[] {false} ;
      T000J5_A394TBM31_GRID_SIZE = new short[1] ;
      T000J5_n394TBM31_GRID_SIZE = new boolean[] {false} ;
      T000J5_A395TBM31_ORDER = new int[1] ;
      T000J5_n395TBM31_ORDER = new boolean[] {false} ;
      T000J5_A528TBM31_DEF_VISIT_NO = new int[1] ;
      T000J5_n528TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      T000J5_A529TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      T000J5_n529TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      T000J5_A643TBM31_STATUS = new String[] {""} ;
      T000J5_n643TBM31_STATUS = new boolean[] {false} ;
      T000J5_A396TBM31_NOTE = new String[] {""} ;
      T000J5_n396TBM31_NOTE = new boolean[] {false} ;
      T000J5_A943TBM31_REPEAT_FLG = new byte[1] ;
      T000J5_n943TBM31_REPEAT_FLG = new boolean[] {false} ;
      T000J5_A944TBM31_REPEAT_MAX = new byte[1] ;
      T000J5_n944TBM31_REPEAT_MAX = new boolean[] {false} ;
      T000J5_A397TBM31_DEL_FLG = new String[] {""} ;
      T000J5_n397TBM31_DEL_FLG = new boolean[] {false} ;
      T000J5_A400TBM31_CRT_PROG_NM = new String[] {""} ;
      T000J5_n400TBM31_CRT_PROG_NM = new boolean[] {false} ;
      T000J5_A403TBM31_UPD_PROG_NM = new String[] {""} ;
      T000J5_n403TBM31_UPD_PROG_NM = new boolean[] {false} ;
      T000J5_A68TBM31_STUDY_ID = new long[1] ;
      T000J4_A68TBM31_STUDY_ID = new long[1] ;
      T000J6_A68TBM31_STUDY_ID = new long[1] ;
      T000J6_A69TBM31_CRF_ID = new short[1] ;
      T000J3_A69TBM31_CRF_ID = new short[1] ;
      T000J3_A398TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J3_n398TBM31_CRT_DATETIME = new boolean[] {false} ;
      T000J3_A399TBM31_CRT_USER_ID = new String[] {""} ;
      T000J3_n399TBM31_CRT_USER_ID = new boolean[] {false} ;
      T000J3_A401TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J3_n401TBM31_UPD_DATETIME = new boolean[] {false} ;
      T000J3_A402TBM31_UPD_USER_ID = new String[] {""} ;
      T000J3_n402TBM31_UPD_USER_ID = new boolean[] {false} ;
      T000J3_A404TBM31_UPD_CNT = new long[1] ;
      T000J3_n404TBM31_UPD_CNT = new boolean[] {false} ;
      T000J3_A393TBM31_CRF_NM = new String[] {""} ;
      T000J3_n393TBM31_CRF_NM = new boolean[] {false} ;
      T000J3_A642TBM31_CRF_SNM = new String[] {""} ;
      T000J3_n642TBM31_CRF_SNM = new boolean[] {false} ;
      T000J3_A394TBM31_GRID_SIZE = new short[1] ;
      T000J3_n394TBM31_GRID_SIZE = new boolean[] {false} ;
      T000J3_A395TBM31_ORDER = new int[1] ;
      T000J3_n395TBM31_ORDER = new boolean[] {false} ;
      T000J3_A528TBM31_DEF_VISIT_NO = new int[1] ;
      T000J3_n528TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      T000J3_A529TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      T000J3_n529TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      T000J3_A643TBM31_STATUS = new String[] {""} ;
      T000J3_n643TBM31_STATUS = new boolean[] {false} ;
      T000J3_A396TBM31_NOTE = new String[] {""} ;
      T000J3_n396TBM31_NOTE = new boolean[] {false} ;
      T000J3_A943TBM31_REPEAT_FLG = new byte[1] ;
      T000J3_n943TBM31_REPEAT_FLG = new boolean[] {false} ;
      T000J3_A944TBM31_REPEAT_MAX = new byte[1] ;
      T000J3_n944TBM31_REPEAT_MAX = new boolean[] {false} ;
      T000J3_A397TBM31_DEL_FLG = new String[] {""} ;
      T000J3_n397TBM31_DEL_FLG = new boolean[] {false} ;
      T000J3_A400TBM31_CRT_PROG_NM = new String[] {""} ;
      T000J3_n400TBM31_CRT_PROG_NM = new boolean[] {false} ;
      T000J3_A403TBM31_UPD_PROG_NM = new String[] {""} ;
      T000J3_n403TBM31_UPD_PROG_NM = new boolean[] {false} ;
      T000J3_A68TBM31_STUDY_ID = new long[1] ;
      sMode18 = "" ;
      T000J7_A68TBM31_STUDY_ID = new long[1] ;
      T000J7_A69TBM31_CRF_ID = new short[1] ;
      T000J8_A68TBM31_STUDY_ID = new long[1] ;
      T000J8_A69TBM31_CRF_ID = new short[1] ;
      T000J2_A69TBM31_CRF_ID = new short[1] ;
      T000J2_A398TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J2_n398TBM31_CRT_DATETIME = new boolean[] {false} ;
      T000J2_A399TBM31_CRT_USER_ID = new String[] {""} ;
      T000J2_n399TBM31_CRT_USER_ID = new boolean[] {false} ;
      T000J2_A401TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J2_n401TBM31_UPD_DATETIME = new boolean[] {false} ;
      T000J2_A402TBM31_UPD_USER_ID = new String[] {""} ;
      T000J2_n402TBM31_UPD_USER_ID = new boolean[] {false} ;
      T000J2_A404TBM31_UPD_CNT = new long[1] ;
      T000J2_n404TBM31_UPD_CNT = new boolean[] {false} ;
      T000J2_A393TBM31_CRF_NM = new String[] {""} ;
      T000J2_n393TBM31_CRF_NM = new boolean[] {false} ;
      T000J2_A642TBM31_CRF_SNM = new String[] {""} ;
      T000J2_n642TBM31_CRF_SNM = new boolean[] {false} ;
      T000J2_A394TBM31_GRID_SIZE = new short[1] ;
      T000J2_n394TBM31_GRID_SIZE = new boolean[] {false} ;
      T000J2_A395TBM31_ORDER = new int[1] ;
      T000J2_n395TBM31_ORDER = new boolean[] {false} ;
      T000J2_A528TBM31_DEF_VISIT_NO = new int[1] ;
      T000J2_n528TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      T000J2_A529TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      T000J2_n529TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      T000J2_A643TBM31_STATUS = new String[] {""} ;
      T000J2_n643TBM31_STATUS = new boolean[] {false} ;
      T000J2_A396TBM31_NOTE = new String[] {""} ;
      T000J2_n396TBM31_NOTE = new boolean[] {false} ;
      T000J2_A943TBM31_REPEAT_FLG = new byte[1] ;
      T000J2_n943TBM31_REPEAT_FLG = new boolean[] {false} ;
      T000J2_A944TBM31_REPEAT_MAX = new byte[1] ;
      T000J2_n944TBM31_REPEAT_MAX = new boolean[] {false} ;
      T000J2_A397TBM31_DEL_FLG = new String[] {""} ;
      T000J2_n397TBM31_DEL_FLG = new boolean[] {false} ;
      T000J2_A400TBM31_CRT_PROG_NM = new String[] {""} ;
      T000J2_n400TBM31_CRT_PROG_NM = new boolean[] {false} ;
      T000J2_A403TBM31_UPD_PROG_NM = new String[] {""} ;
      T000J2_n403TBM31_UPD_PROG_NM = new boolean[] {false} ;
      T000J2_A68TBM31_STUDY_ID = new long[1] ;
      T000J12_A110TBW03_SESSION_ID = new String[] {""} ;
      T000J12_A111TBW03_APP_ID = new String[] {""} ;
      T000J12_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T000J12_A113TBW03_STUDY_ID = new long[1] ;
      T000J12_A114TBW03_SUBJECT_ID = new int[1] ;
      T000J12_A115TBW03_CRF_ID = new short[1] ;
      T000J13_A68TBM31_STUDY_ID = new long[1] ;
      T000J13_A69TBM31_CRF_ID = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      T000J14_A68TBM31_STUDY_ID = new long[1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm31_crf__default(),
         new Object[] {
             new Object[] {
            T000J2_A69TBM31_CRF_ID, T000J2_A398TBM31_CRT_DATETIME, T000J2_n398TBM31_CRT_DATETIME, T000J2_A399TBM31_CRT_USER_ID, T000J2_n399TBM31_CRT_USER_ID, T000J2_A401TBM31_UPD_DATETIME, T000J2_n401TBM31_UPD_DATETIME, T000J2_A402TBM31_UPD_USER_ID, T000J2_n402TBM31_UPD_USER_ID, T000J2_A404TBM31_UPD_CNT,
            T000J2_n404TBM31_UPD_CNT, T000J2_A393TBM31_CRF_NM, T000J2_n393TBM31_CRF_NM, T000J2_A642TBM31_CRF_SNM, T000J2_n642TBM31_CRF_SNM, T000J2_A394TBM31_GRID_SIZE, T000J2_n394TBM31_GRID_SIZE, T000J2_A395TBM31_ORDER, T000J2_n395TBM31_ORDER, T000J2_A528TBM31_DEF_VISIT_NO,
            T000J2_n528TBM31_DEF_VISIT_NO, T000J2_A529TBM31_DEF_DOMAIN_CD, T000J2_n529TBM31_DEF_DOMAIN_CD, T000J2_A643TBM31_STATUS, T000J2_n643TBM31_STATUS, T000J2_A396TBM31_NOTE, T000J2_n396TBM31_NOTE, T000J2_A943TBM31_REPEAT_FLG, T000J2_n943TBM31_REPEAT_FLG, T000J2_A944TBM31_REPEAT_MAX,
            T000J2_n944TBM31_REPEAT_MAX, T000J2_A397TBM31_DEL_FLG, T000J2_n397TBM31_DEL_FLG, T000J2_A400TBM31_CRT_PROG_NM, T000J2_n400TBM31_CRT_PROG_NM, T000J2_A403TBM31_UPD_PROG_NM, T000J2_n403TBM31_UPD_PROG_NM, T000J2_A68TBM31_STUDY_ID
            }
            , new Object[] {
            T000J3_A69TBM31_CRF_ID, T000J3_A398TBM31_CRT_DATETIME, T000J3_n398TBM31_CRT_DATETIME, T000J3_A399TBM31_CRT_USER_ID, T000J3_n399TBM31_CRT_USER_ID, T000J3_A401TBM31_UPD_DATETIME, T000J3_n401TBM31_UPD_DATETIME, T000J3_A402TBM31_UPD_USER_ID, T000J3_n402TBM31_UPD_USER_ID, T000J3_A404TBM31_UPD_CNT,
            T000J3_n404TBM31_UPD_CNT, T000J3_A393TBM31_CRF_NM, T000J3_n393TBM31_CRF_NM, T000J3_A642TBM31_CRF_SNM, T000J3_n642TBM31_CRF_SNM, T000J3_A394TBM31_GRID_SIZE, T000J3_n394TBM31_GRID_SIZE, T000J3_A395TBM31_ORDER, T000J3_n395TBM31_ORDER, T000J3_A528TBM31_DEF_VISIT_NO,
            T000J3_n528TBM31_DEF_VISIT_NO, T000J3_A529TBM31_DEF_DOMAIN_CD, T000J3_n529TBM31_DEF_DOMAIN_CD, T000J3_A643TBM31_STATUS, T000J3_n643TBM31_STATUS, T000J3_A396TBM31_NOTE, T000J3_n396TBM31_NOTE, T000J3_A943TBM31_REPEAT_FLG, T000J3_n943TBM31_REPEAT_FLG, T000J3_A944TBM31_REPEAT_MAX,
            T000J3_n944TBM31_REPEAT_MAX, T000J3_A397TBM31_DEL_FLG, T000J3_n397TBM31_DEL_FLG, T000J3_A400TBM31_CRT_PROG_NM, T000J3_n400TBM31_CRT_PROG_NM, T000J3_A403TBM31_UPD_PROG_NM, T000J3_n403TBM31_UPD_PROG_NM, T000J3_A68TBM31_STUDY_ID
            }
            , new Object[] {
            T000J4_A68TBM31_STUDY_ID
            }
            , new Object[] {
            T000J5_A69TBM31_CRF_ID, T000J5_A398TBM31_CRT_DATETIME, T000J5_n398TBM31_CRT_DATETIME, T000J5_A399TBM31_CRT_USER_ID, T000J5_n399TBM31_CRT_USER_ID, T000J5_A401TBM31_UPD_DATETIME, T000J5_n401TBM31_UPD_DATETIME, T000J5_A402TBM31_UPD_USER_ID, T000J5_n402TBM31_UPD_USER_ID, T000J5_A404TBM31_UPD_CNT,
            T000J5_n404TBM31_UPD_CNT, T000J5_A393TBM31_CRF_NM, T000J5_n393TBM31_CRF_NM, T000J5_A642TBM31_CRF_SNM, T000J5_n642TBM31_CRF_SNM, T000J5_A394TBM31_GRID_SIZE, T000J5_n394TBM31_GRID_SIZE, T000J5_A395TBM31_ORDER, T000J5_n395TBM31_ORDER, T000J5_A528TBM31_DEF_VISIT_NO,
            T000J5_n528TBM31_DEF_VISIT_NO, T000J5_A529TBM31_DEF_DOMAIN_CD, T000J5_n529TBM31_DEF_DOMAIN_CD, T000J5_A643TBM31_STATUS, T000J5_n643TBM31_STATUS, T000J5_A396TBM31_NOTE, T000J5_n396TBM31_NOTE, T000J5_A943TBM31_REPEAT_FLG, T000J5_n943TBM31_REPEAT_FLG, T000J5_A944TBM31_REPEAT_MAX,
            T000J5_n944TBM31_REPEAT_MAX, T000J5_A397TBM31_DEL_FLG, T000J5_n397TBM31_DEL_FLG, T000J5_A400TBM31_CRT_PROG_NM, T000J5_n400TBM31_CRT_PROG_NM, T000J5_A403TBM31_UPD_PROG_NM, T000J5_n403TBM31_UPD_PROG_NM, T000J5_A68TBM31_STUDY_ID
            }
            , new Object[] {
            T000J6_A68TBM31_STUDY_ID, T000J6_A69TBM31_CRF_ID
            }
            , new Object[] {
            T000J7_A68TBM31_STUDY_ID, T000J7_A69TBM31_CRF_ID
            }
            , new Object[] {
            T000J8_A68TBM31_STUDY_ID, T000J8_A69TBM31_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000J12_A110TBW03_SESSION_ID, T000J12_A111TBW03_APP_ID, T000J12_A112TBW03_DISP_DATETIME, T000J12_A113TBW03_STUDY_ID, T000J12_A114TBW03_SUBJECT_ID, T000J12_A115TBW03_CRF_ID
            }
            , new Object[] {
            T000J13_A68TBM31_STUDY_ID, T000J13_A69TBM31_CRF_ID
            }
            , new Object[] {
            T000J14_A68TBM31_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM31_CRF" ;
   }

   private byte Z943TBM31_REPEAT_FLG ;
   private byte Z944TBM31_REPEAT_MAX ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A943TBM31_REPEAT_FLG ;
   private byte A944TBM31_REPEAT_MAX ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z69TBM31_CRF_ID ;
   private short Z394TBM31_GRID_SIZE ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A69TBM31_CRF_ID ;
   private short A394TBM31_GRID_SIZE ;
   private short RcdFound18 ;
   private short Gx_err ;
   private int Z395TBM31_ORDER ;
   private int Z528TBM31_DEF_VISIT_NO ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM31_STUDY_ID_Enabled ;
   private int edtTBM31_CRF_ID_Enabled ;
   private int edtTBM31_CRF_NM_Enabled ;
   private int edtTBM31_CRF_SNM_Enabled ;
   private int edtTBM31_GRID_SIZE_Enabled ;
   private int A395TBM31_ORDER ;
   private int edtTBM31_ORDER_Enabled ;
   private int A528TBM31_DEF_VISIT_NO ;
   private int edtTBM31_DEF_VISIT_NO_Enabled ;
   private int edtTBM31_DEF_DOMAIN_CD_Enabled ;
   private int edtTBM31_STATUS_Enabled ;
   private int edtTBM31_NOTE_Enabled ;
   private int edtTBM31_REPEAT_FLG_Enabled ;
   private int edtTBM31_REPEAT_MAX_Enabled ;
   private int edtTBM31_DEL_FLG_Enabled ;
   private int edtTBM31_CRT_DATETIME_Enabled ;
   private int edtTBM31_CRT_USER_ID_Enabled ;
   private int edtTBM31_CRT_PROG_NM_Enabled ;
   private int edtTBM31_UPD_DATETIME_Enabled ;
   private int edtTBM31_UPD_USER_ID_Enabled ;
   private int edtTBM31_UPD_PROG_NM_Enabled ;
   private int edtTBM31_UPD_CNT_Enabled ;
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
   private long Z68TBM31_STUDY_ID ;
   private long Z404TBM31_UPD_CNT ;
   private long O404TBM31_UPD_CNT ;
   private long A68TBM31_STUDY_ID ;
   private long A404TBM31_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM31_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm31_study_id_Internalname ;
   private String lblTextblocktbm31_study_id_Jsonclick ;
   private String edtTBM31_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm31_crf_id_Internalname ;
   private String lblTextblocktbm31_crf_id_Jsonclick ;
   private String edtTBM31_CRF_ID_Internalname ;
   private String edtTBM31_CRF_ID_Jsonclick ;
   private String lblTextblocktbm31_crf_nm_Internalname ;
   private String lblTextblocktbm31_crf_nm_Jsonclick ;
   private String edtTBM31_CRF_NM_Internalname ;
   private String edtTBM31_CRF_NM_Jsonclick ;
   private String lblTextblocktbm31_crf_snm_Internalname ;
   private String lblTextblocktbm31_crf_snm_Jsonclick ;
   private String edtTBM31_CRF_SNM_Internalname ;
   private String edtTBM31_CRF_SNM_Jsonclick ;
   private String lblTextblocktbm31_grid_size_Internalname ;
   private String lblTextblocktbm31_grid_size_Jsonclick ;
   private String edtTBM31_GRID_SIZE_Internalname ;
   private String edtTBM31_GRID_SIZE_Jsonclick ;
   private String lblTextblocktbm31_order_Internalname ;
   private String lblTextblocktbm31_order_Jsonclick ;
   private String edtTBM31_ORDER_Internalname ;
   private String edtTBM31_ORDER_Jsonclick ;
   private String lblTextblocktbm31_def_visit_no_Internalname ;
   private String lblTextblocktbm31_def_visit_no_Jsonclick ;
   private String edtTBM31_DEF_VISIT_NO_Internalname ;
   private String edtTBM31_DEF_VISIT_NO_Jsonclick ;
   private String lblTextblocktbm31_def_domain_cd_Internalname ;
   private String lblTextblocktbm31_def_domain_cd_Jsonclick ;
   private String edtTBM31_DEF_DOMAIN_CD_Internalname ;
   private String edtTBM31_DEF_DOMAIN_CD_Jsonclick ;
   private String lblTextblocktbm31_status_Internalname ;
   private String lblTextblocktbm31_status_Jsonclick ;
   private String edtTBM31_STATUS_Internalname ;
   private String edtTBM31_STATUS_Jsonclick ;
   private String lblTextblocktbm31_note_Internalname ;
   private String lblTextblocktbm31_note_Jsonclick ;
   private String edtTBM31_NOTE_Internalname ;
   private String lblTextblocktbm31_repeat_flg_Internalname ;
   private String lblTextblocktbm31_repeat_flg_Jsonclick ;
   private String edtTBM31_REPEAT_FLG_Internalname ;
   private String edtTBM31_REPEAT_FLG_Jsonclick ;
   private String lblTextblocktbm31_repeat_max_Internalname ;
   private String lblTextblocktbm31_repeat_max_Jsonclick ;
   private String edtTBM31_REPEAT_MAX_Internalname ;
   private String edtTBM31_REPEAT_MAX_Jsonclick ;
   private String lblTextblocktbm31_del_flg_Internalname ;
   private String lblTextblocktbm31_del_flg_Jsonclick ;
   private String edtTBM31_DEL_FLG_Internalname ;
   private String edtTBM31_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm31_crt_datetime_Internalname ;
   private String lblTextblocktbm31_crt_datetime_Jsonclick ;
   private String edtTBM31_CRT_DATETIME_Internalname ;
   private String edtTBM31_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm31_crt_user_id_Internalname ;
   private String lblTextblocktbm31_crt_user_id_Jsonclick ;
   private String edtTBM31_CRT_USER_ID_Internalname ;
   private String edtTBM31_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm31_crt_prog_nm_Internalname ;
   private String lblTextblocktbm31_crt_prog_nm_Jsonclick ;
   private String edtTBM31_CRT_PROG_NM_Internalname ;
   private String edtTBM31_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm31_upd_datetime_Internalname ;
   private String lblTextblocktbm31_upd_datetime_Jsonclick ;
   private String edtTBM31_UPD_DATETIME_Internalname ;
   private String edtTBM31_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm31_upd_user_id_Internalname ;
   private String lblTextblocktbm31_upd_user_id_Jsonclick ;
   private String edtTBM31_UPD_USER_ID_Internalname ;
   private String edtTBM31_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm31_upd_prog_nm_Internalname ;
   private String lblTextblocktbm31_upd_prog_nm_Jsonclick ;
   private String edtTBM31_UPD_PROG_NM_Internalname ;
   private String edtTBM31_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm31_upd_cnt_Internalname ;
   private String lblTextblocktbm31_upd_cnt_Jsonclick ;
   private String edtTBM31_UPD_CNT_Internalname ;
   private String edtTBM31_UPD_CNT_Jsonclick ;
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
   private String sMode18 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z398TBM31_CRT_DATETIME ;
   private java.util.Date Z401TBM31_UPD_DATETIME ;
   private java.util.Date A398TBM31_CRT_DATETIME ;
   private java.util.Date A401TBM31_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n393TBM31_CRF_NM ;
   private boolean n642TBM31_CRF_SNM ;
   private boolean n394TBM31_GRID_SIZE ;
   private boolean n395TBM31_ORDER ;
   private boolean n528TBM31_DEF_VISIT_NO ;
   private boolean n529TBM31_DEF_DOMAIN_CD ;
   private boolean n643TBM31_STATUS ;
   private boolean n396TBM31_NOTE ;
   private boolean n943TBM31_REPEAT_FLG ;
   private boolean n944TBM31_REPEAT_MAX ;
   private boolean n397TBM31_DEL_FLG ;
   private boolean n398TBM31_CRT_DATETIME ;
   private boolean n399TBM31_CRT_USER_ID ;
   private boolean n400TBM31_CRT_PROG_NM ;
   private boolean n401TBM31_UPD_DATETIME ;
   private boolean n402TBM31_UPD_USER_ID ;
   private boolean n403TBM31_UPD_PROG_NM ;
   private boolean n404TBM31_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z399TBM31_CRT_USER_ID ;
   private String Z402TBM31_UPD_USER_ID ;
   private String Z393TBM31_CRF_NM ;
   private String Z642TBM31_CRF_SNM ;
   private String Z529TBM31_DEF_DOMAIN_CD ;
   private String Z643TBM31_STATUS ;
   private String Z396TBM31_NOTE ;
   private String Z397TBM31_DEL_FLG ;
   private String Z400TBM31_CRT_PROG_NM ;
   private String Z403TBM31_UPD_PROG_NM ;
   private String A393TBM31_CRF_NM ;
   private String A642TBM31_CRF_SNM ;
   private String A529TBM31_DEF_DOMAIN_CD ;
   private String A643TBM31_STATUS ;
   private String A396TBM31_NOTE ;
   private String A397TBM31_DEL_FLG ;
   private String A399TBM31_CRT_USER_ID ;
   private String A400TBM31_CRT_PROG_NM ;
   private String A402TBM31_UPD_USER_ID ;
   private String A403TBM31_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private short[] T000J5_A69TBM31_CRF_ID ;
   private java.util.Date[] T000J5_A398TBM31_CRT_DATETIME ;
   private boolean[] T000J5_n398TBM31_CRT_DATETIME ;
   private String[] T000J5_A399TBM31_CRT_USER_ID ;
   private boolean[] T000J5_n399TBM31_CRT_USER_ID ;
   private java.util.Date[] T000J5_A401TBM31_UPD_DATETIME ;
   private boolean[] T000J5_n401TBM31_UPD_DATETIME ;
   private String[] T000J5_A402TBM31_UPD_USER_ID ;
   private boolean[] T000J5_n402TBM31_UPD_USER_ID ;
   private long[] T000J5_A404TBM31_UPD_CNT ;
   private boolean[] T000J5_n404TBM31_UPD_CNT ;
   private String[] T000J5_A393TBM31_CRF_NM ;
   private boolean[] T000J5_n393TBM31_CRF_NM ;
   private String[] T000J5_A642TBM31_CRF_SNM ;
   private boolean[] T000J5_n642TBM31_CRF_SNM ;
   private short[] T000J5_A394TBM31_GRID_SIZE ;
   private boolean[] T000J5_n394TBM31_GRID_SIZE ;
   private int[] T000J5_A395TBM31_ORDER ;
   private boolean[] T000J5_n395TBM31_ORDER ;
   private int[] T000J5_A528TBM31_DEF_VISIT_NO ;
   private boolean[] T000J5_n528TBM31_DEF_VISIT_NO ;
   private String[] T000J5_A529TBM31_DEF_DOMAIN_CD ;
   private boolean[] T000J5_n529TBM31_DEF_DOMAIN_CD ;
   private String[] T000J5_A643TBM31_STATUS ;
   private boolean[] T000J5_n643TBM31_STATUS ;
   private String[] T000J5_A396TBM31_NOTE ;
   private boolean[] T000J5_n396TBM31_NOTE ;
   private byte[] T000J5_A943TBM31_REPEAT_FLG ;
   private boolean[] T000J5_n943TBM31_REPEAT_FLG ;
   private byte[] T000J5_A944TBM31_REPEAT_MAX ;
   private boolean[] T000J5_n944TBM31_REPEAT_MAX ;
   private String[] T000J5_A397TBM31_DEL_FLG ;
   private boolean[] T000J5_n397TBM31_DEL_FLG ;
   private String[] T000J5_A400TBM31_CRT_PROG_NM ;
   private boolean[] T000J5_n400TBM31_CRT_PROG_NM ;
   private String[] T000J5_A403TBM31_UPD_PROG_NM ;
   private boolean[] T000J5_n403TBM31_UPD_PROG_NM ;
   private long[] T000J5_A68TBM31_STUDY_ID ;
   private long[] T000J4_A68TBM31_STUDY_ID ;
   private long[] T000J6_A68TBM31_STUDY_ID ;
   private short[] T000J6_A69TBM31_CRF_ID ;
   private short[] T000J3_A69TBM31_CRF_ID ;
   private java.util.Date[] T000J3_A398TBM31_CRT_DATETIME ;
   private boolean[] T000J3_n398TBM31_CRT_DATETIME ;
   private String[] T000J3_A399TBM31_CRT_USER_ID ;
   private boolean[] T000J3_n399TBM31_CRT_USER_ID ;
   private java.util.Date[] T000J3_A401TBM31_UPD_DATETIME ;
   private boolean[] T000J3_n401TBM31_UPD_DATETIME ;
   private String[] T000J3_A402TBM31_UPD_USER_ID ;
   private boolean[] T000J3_n402TBM31_UPD_USER_ID ;
   private long[] T000J3_A404TBM31_UPD_CNT ;
   private boolean[] T000J3_n404TBM31_UPD_CNT ;
   private String[] T000J3_A393TBM31_CRF_NM ;
   private boolean[] T000J3_n393TBM31_CRF_NM ;
   private String[] T000J3_A642TBM31_CRF_SNM ;
   private boolean[] T000J3_n642TBM31_CRF_SNM ;
   private short[] T000J3_A394TBM31_GRID_SIZE ;
   private boolean[] T000J3_n394TBM31_GRID_SIZE ;
   private int[] T000J3_A395TBM31_ORDER ;
   private boolean[] T000J3_n395TBM31_ORDER ;
   private int[] T000J3_A528TBM31_DEF_VISIT_NO ;
   private boolean[] T000J3_n528TBM31_DEF_VISIT_NO ;
   private String[] T000J3_A529TBM31_DEF_DOMAIN_CD ;
   private boolean[] T000J3_n529TBM31_DEF_DOMAIN_CD ;
   private String[] T000J3_A643TBM31_STATUS ;
   private boolean[] T000J3_n643TBM31_STATUS ;
   private String[] T000J3_A396TBM31_NOTE ;
   private boolean[] T000J3_n396TBM31_NOTE ;
   private byte[] T000J3_A943TBM31_REPEAT_FLG ;
   private boolean[] T000J3_n943TBM31_REPEAT_FLG ;
   private byte[] T000J3_A944TBM31_REPEAT_MAX ;
   private boolean[] T000J3_n944TBM31_REPEAT_MAX ;
   private String[] T000J3_A397TBM31_DEL_FLG ;
   private boolean[] T000J3_n397TBM31_DEL_FLG ;
   private String[] T000J3_A400TBM31_CRT_PROG_NM ;
   private boolean[] T000J3_n400TBM31_CRT_PROG_NM ;
   private String[] T000J3_A403TBM31_UPD_PROG_NM ;
   private boolean[] T000J3_n403TBM31_UPD_PROG_NM ;
   private long[] T000J3_A68TBM31_STUDY_ID ;
   private long[] T000J7_A68TBM31_STUDY_ID ;
   private short[] T000J7_A69TBM31_CRF_ID ;
   private long[] T000J8_A68TBM31_STUDY_ID ;
   private short[] T000J8_A69TBM31_CRF_ID ;
   private short[] T000J2_A69TBM31_CRF_ID ;
   private java.util.Date[] T000J2_A398TBM31_CRT_DATETIME ;
   private boolean[] T000J2_n398TBM31_CRT_DATETIME ;
   private String[] T000J2_A399TBM31_CRT_USER_ID ;
   private boolean[] T000J2_n399TBM31_CRT_USER_ID ;
   private java.util.Date[] T000J2_A401TBM31_UPD_DATETIME ;
   private boolean[] T000J2_n401TBM31_UPD_DATETIME ;
   private String[] T000J2_A402TBM31_UPD_USER_ID ;
   private boolean[] T000J2_n402TBM31_UPD_USER_ID ;
   private long[] T000J2_A404TBM31_UPD_CNT ;
   private boolean[] T000J2_n404TBM31_UPD_CNT ;
   private String[] T000J2_A393TBM31_CRF_NM ;
   private boolean[] T000J2_n393TBM31_CRF_NM ;
   private String[] T000J2_A642TBM31_CRF_SNM ;
   private boolean[] T000J2_n642TBM31_CRF_SNM ;
   private short[] T000J2_A394TBM31_GRID_SIZE ;
   private boolean[] T000J2_n394TBM31_GRID_SIZE ;
   private int[] T000J2_A395TBM31_ORDER ;
   private boolean[] T000J2_n395TBM31_ORDER ;
   private int[] T000J2_A528TBM31_DEF_VISIT_NO ;
   private boolean[] T000J2_n528TBM31_DEF_VISIT_NO ;
   private String[] T000J2_A529TBM31_DEF_DOMAIN_CD ;
   private boolean[] T000J2_n529TBM31_DEF_DOMAIN_CD ;
   private String[] T000J2_A643TBM31_STATUS ;
   private boolean[] T000J2_n643TBM31_STATUS ;
   private String[] T000J2_A396TBM31_NOTE ;
   private boolean[] T000J2_n396TBM31_NOTE ;
   private byte[] T000J2_A943TBM31_REPEAT_FLG ;
   private boolean[] T000J2_n943TBM31_REPEAT_FLG ;
   private byte[] T000J2_A944TBM31_REPEAT_MAX ;
   private boolean[] T000J2_n944TBM31_REPEAT_MAX ;
   private String[] T000J2_A397TBM31_DEL_FLG ;
   private boolean[] T000J2_n397TBM31_DEL_FLG ;
   private String[] T000J2_A400TBM31_CRT_PROG_NM ;
   private boolean[] T000J2_n400TBM31_CRT_PROG_NM ;
   private String[] T000J2_A403TBM31_UPD_PROG_NM ;
   private boolean[] T000J2_n403TBM31_UPD_PROG_NM ;
   private long[] T000J2_A68TBM31_STUDY_ID ;
   private String[] T000J12_A110TBW03_SESSION_ID ;
   private String[] T000J12_A111TBW03_APP_ID ;
   private String[] T000J12_A112TBW03_DISP_DATETIME ;
   private long[] T000J12_A113TBW03_STUDY_ID ;
   private int[] T000J12_A114TBW03_SUBJECT_ID ;
   private short[] T000J12_A115TBW03_CRF_ID ;
   private long[] T000J13_A68TBM31_STUDY_ID ;
   private short[] T000J13_A69TBM31_CRF_ID ;
   private long[] T000J14_A68TBM31_STUDY_ID ;
}

final  class tbm31_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000J2", "SELECT `TBM31_CRF_ID`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_CNT`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_REPEAT_FLG`, `TBM31_REPEAT_MAX`, `TBM31_DEL_FLG`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_PROG_NM`, `TBM31_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000J3", "SELECT `TBM31_CRF_ID`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_CNT`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_REPEAT_FLG`, `TBM31_REPEAT_MAX`, `TBM31_DEL_FLG`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_PROG_NM`, `TBM31_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000J4", "SELECT `TBM21_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000J5", "SELECT TM1.`TBM31_CRF_ID`, TM1.`TBM31_CRT_DATETIME`, TM1.`TBM31_CRT_USER_ID`, TM1.`TBM31_UPD_DATETIME`, TM1.`TBM31_UPD_USER_ID`, TM1.`TBM31_UPD_CNT`, TM1.`TBM31_CRF_NM`, TM1.`TBM31_CRF_SNM`, TM1.`TBM31_GRID_SIZE`, TM1.`TBM31_ORDER`, TM1.`TBM31_DEF_VISIT_NO`, TM1.`TBM31_DEF_DOMAIN_CD`, TM1.`TBM31_STATUS`, TM1.`TBM31_NOTE`, TM1.`TBM31_REPEAT_FLG`, TM1.`TBM31_REPEAT_MAX`, TM1.`TBM31_DEL_FLG`, TM1.`TBM31_CRT_PROG_NM`, TM1.`TBM31_UPD_PROG_NM`, TM1.`TBM31_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM31_CRF` TM1 WHERE TM1.`TBM31_STUDY_ID` = ? and TM1.`TBM31_CRF_ID` = ? ORDER BY TM1.`TBM31_STUDY_ID`, TM1.`TBM31_CRF_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000J6", "SELECT `TBM31_STUDY_ID` AS TBM31_STUDY_ID, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000J7", "SELECT `TBM31_STUDY_ID` AS TBM31_STUDY_ID, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE ( `TBM31_STUDY_ID` > ? or `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` > ?) ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000J8", "SELECT `TBM31_STUDY_ID` AS TBM31_STUDY_ID, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE ( `TBM31_STUDY_ID` < ? or `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` < ?) ORDER BY `TBM31_STUDY_ID` DESC, `TBM31_CRF_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000J9", "INSERT INTO `TBM31_CRF`(`TBM31_CRF_ID`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_CNT`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_REPEAT_FLG`, `TBM31_REPEAT_MAX`, `TBM31_DEL_FLG`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_PROG_NM`, `TBM31_STUDY_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000J10", "UPDATE `TBM31_CRF` SET `TBM31_CRT_DATETIME`=?, `TBM31_CRT_USER_ID`=?, `TBM31_UPD_DATETIME`=?, `TBM31_UPD_USER_ID`=?, `TBM31_UPD_CNT`=?, `TBM31_CRF_NM`=?, `TBM31_CRF_SNM`=?, `TBM31_GRID_SIZE`=?, `TBM31_ORDER`=?, `TBM31_DEF_VISIT_NO`=?, `TBM31_DEF_DOMAIN_CD`=?, `TBM31_STATUS`=?, `TBM31_NOTE`=?, `TBM31_REPEAT_FLG`=?, `TBM31_REPEAT_MAX`=?, `TBM31_DEL_FLG`=?, `TBM31_CRT_PROG_NM`=?, `TBM31_UPD_PROG_NM`=?  WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000J11", "DELETE FROM `TBM31_CRF`  WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000J12", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_STUDY_ID` = ? AND `TBW03_CRF_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000J13", "SELECT `TBM31_STUDY_ID` AS TBM31_STUDY_ID, `TBM31_CRF_ID` FROM `TBM31_CRF` ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000J14", "SELECT `TBM21_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(20) ;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(20) ;
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
               ((String[]) buf[11])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((String[]) buf[13])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((int[]) buf[17])[0] = rslt.getInt(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((byte[]) buf[27])[0] = rslt.getByte(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((byte[]) buf[29])[0] = rslt.getByte(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((String[]) buf[35])[0] = rslt.getVarchar(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((long[]) buf[37])[0] = rslt.getLong(20) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 100);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 20);
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
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[18]).intValue());
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[20]).intValue());
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 2);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 1000);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[28]).byteValue());
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(16, ((Number) parms[30]).byteValue());
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 1);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 40);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 40);
               }
               stmt.setLong(20, ((Number) parms[37]).longValue());
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
                  stmt.setVarchar(7, (String)parms[13], 20);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[17]).intValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
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
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 1000);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(14, ((Number) parms[27]).byteValue());
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(15, ((Number) parms[29]).byteValue());
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
               return;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

}

