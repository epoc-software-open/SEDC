/*
               File: tbm31_crf_impl
        Description: CRFマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:41.36
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
         A217TBM31_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A217TBM31_STUDY_ID) ;
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
      Form.getMeta().addItem("Description", "CRFマスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRFマスタ"+"</legend>") ;
         wb_table3_27_0J18( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0J18e( boolean wbgen )
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

   public void wb_table3_27_0J18( boolean wbgen )
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
         wb_table4_33_0J18( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0J18e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 126,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM31_CRF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM31_CRF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0J18e( true) ;
      }
      else
      {
         wb_table3_27_0J18e( false) ;
      }
   }

   public void wb_table4_33_0J18( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_study_id_Internalname, "試験ID", "", "", lblTextblocktbm31_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A217TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM31_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A217TBM31_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A217TBM31_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM31_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crf_id_Internalname, "CRFID", "", "", lblTextblocktbm31_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A218TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBM31_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A218TBM31_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A218TBM31_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM31_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crf_nm_Internalname, "CRF名称", "", "", lblTextblocktbm31_crf_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A219TBM31_CRF_NM", A219TBM31_CRF_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRF_NM_Internalname, GXutil.rtrim( A219TBM31_CRF_NM), GXutil.rtrim( localUtil.format( A219TBM31_CRF_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM31_CRF_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_CRF_NM_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crf_snm_Internalname, "CRF略称", "", "", lblTextblocktbm31_crf_snm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A550TBM31_CRF_SNM", A550TBM31_CRF_SNM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRF_SNM_Internalname, GXutil.rtrim( A550TBM31_CRF_SNM), GXutil.rtrim( localUtil.format( A550TBM31_CRF_SNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM31_CRF_SNM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_CRF_SNM_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_grid_size_Internalname, "グリッドの間隔", "", "", lblTextblocktbm31_grid_size_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A220TBM31_GRID_SIZE", GXutil.ltrim( GXutil.str( A220TBM31_GRID_SIZE, 3, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_GRID_SIZE_Internalname, GXutil.ltrim( localUtil.ntoc( A220TBM31_GRID_SIZE, (byte)(3), (byte)(0), ".", "")), ((edtTBM31_GRID_SIZE_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A220TBM31_GRID_SIZE), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A220TBM31_GRID_SIZE), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM31_GRID_SIZE_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_GRID_SIZE_Enabled, 0, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_order_Internalname, "表示順", "", "", lblTextblocktbm31_order_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A221TBM31_ORDER", GXutil.ltrim( GXutil.str( A221TBM31_ORDER, 5, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A221TBM31_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBM31_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A221TBM31_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A221TBM31_ORDER), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM31_ORDER_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_ORDER_Enabled, 0, 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_def_visit_no_Internalname, "デフォルトVISIT番号", "", "", lblTextblocktbm31_def_visit_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A405TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A405TBM31_DEF_VISIT_NO, 3, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_DEF_VISIT_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A405TBM31_DEF_VISIT_NO, (byte)(3), (byte)(0), ".", "")), ((edtTBM31_DEF_VISIT_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A405TBM31_DEF_VISIT_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A405TBM31_DEF_VISIT_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM31_DEF_VISIT_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_DEF_VISIT_NO_Enabled, 0, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_def_domain_cd_Internalname, "デフォルトドメインコード", "", "", lblTextblocktbm31_def_domain_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A406TBM31_DEF_DOMAIN_CD", A406TBM31_DEF_DOMAIN_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_DEF_DOMAIN_CD_Internalname, GXutil.rtrim( A406TBM31_DEF_DOMAIN_CD), GXutil.rtrim( localUtil.format( A406TBM31_DEF_DOMAIN_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM31_DEF_DOMAIN_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_DEF_DOMAIN_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_status_Internalname, "状態", "", "", lblTextblocktbm31_status_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_STATUS_Internalname, GXutil.rtrim( A551TBM31_STATUS), GXutil.rtrim( localUtil.format( A551TBM31_STATUS, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM31_STATUS_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_STATUS_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_note_Internalname, "備考", "", "", lblTextblocktbm31_note_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A222TBM31_NOTE", A222TBM31_NOTE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM31_NOTE_Internalname, GXutil.rtrim( A222TBM31_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", (short)(0), 1, edtTBM31_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "1000", -1, "", true, "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm31_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_DEL_FLG_Internalname, GXutil.rtrim( A223TBM31_DEL_FLG), GXutil.rtrim( localUtil.format( A223TBM31_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM31_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm31_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A224TBM31_CRT_DATETIME", localUtil.ttoc( A224TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM31_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRT_DATETIME_Internalname, localUtil.format(A224TBM31_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A224TBM31_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM31_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM31_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM31_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM31_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM31_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm31_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A225TBM31_CRT_USER_ID", A225TBM31_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRT_USER_ID_Internalname, GXutil.rtrim( A225TBM31_CRT_USER_ID), GXutil.rtrim( localUtil.format( A225TBM31_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTBM31_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm31_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A226TBM31_CRT_PROG_NM", A226TBM31_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_CRT_PROG_NM_Internalname, GXutil.rtrim( A226TBM31_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A226TBM31_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtTBM31_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm31_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A227TBM31_UPD_DATETIME", localUtil.ttoc( A227TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM31_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_UPD_DATETIME_Internalname, localUtil.format(A227TBM31_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A227TBM31_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(108);\"", "", "", "", "", edtTBM31_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM31_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM31_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM31_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM31_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm31_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A228TBM31_UPD_USER_ID", A228TBM31_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_UPD_USER_ID_Internalname, GXutil.rtrim( A228TBM31_UPD_USER_ID), GXutil.rtrim( localUtil.format( A228TBM31_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(113);\"", "", "", "", "", edtTBM31_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm31_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A229TBM31_UPD_PROG_NM", A229TBM31_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_UPD_PROG_NM_Internalname, GXutil.rtrim( A229TBM31_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A229TBM31_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(118);\"", "", "", "", "", edtTBM31_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm31_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm31_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A230TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM31_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A230TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM31_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A230TBM31_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A230TBM31_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(123);\"", "", "", "", "", edtTBM31_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM31_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM31_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0J18e( true) ;
      }
      else
      {
         wb_table4_33_0J18e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM31_CRF.htm");
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
               A217TBM31_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
            }
            else
            {
               A217TBM31_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM31_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A218TBM31_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
            }
            else
            {
               A218TBM31_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM31_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
            }
            A219TBM31_CRF_NM = httpContext.cgiGet( edtTBM31_CRF_NM_Internalname) ;
            n219TBM31_CRF_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A219TBM31_CRF_NM", A219TBM31_CRF_NM);
            n219TBM31_CRF_NM = ((GXutil.strcmp("", A219TBM31_CRF_NM)==0) ? true : false) ;
            A550TBM31_CRF_SNM = httpContext.cgiGet( edtTBM31_CRF_SNM_Internalname) ;
            n550TBM31_CRF_SNM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A550TBM31_CRF_SNM", A550TBM31_CRF_SNM);
            n550TBM31_CRF_SNM = ((GXutil.strcmp("", A550TBM31_CRF_SNM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_GRID_SIZE_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_GRID_SIZE_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_GRID_SIZE");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_GRID_SIZE_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A220TBM31_GRID_SIZE = (short)(0) ;
               n220TBM31_GRID_SIZE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A220TBM31_GRID_SIZE", GXutil.ltrim( GXutil.str( A220TBM31_GRID_SIZE, 3, 0)));
            }
            else
            {
               A220TBM31_GRID_SIZE = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM31_GRID_SIZE_Internalname), ".", ",")) ;
               n220TBM31_GRID_SIZE = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A220TBM31_GRID_SIZE", GXutil.ltrim( GXutil.str( A220TBM31_GRID_SIZE, 3, 0)));
            }
            n220TBM31_GRID_SIZE = ((0==A220TBM31_GRID_SIZE) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_ORDER_Internalname), ".", ",") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A221TBM31_ORDER = 0 ;
               n221TBM31_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A221TBM31_ORDER", GXutil.ltrim( GXutil.str( A221TBM31_ORDER, 5, 0)));
            }
            else
            {
               A221TBM31_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM31_ORDER_Internalname), ".", ",")) ;
               n221TBM31_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A221TBM31_ORDER", GXutil.ltrim( GXutil.str( A221TBM31_ORDER, 5, 0)));
            }
            n221TBM31_ORDER = ((0==A221TBM31_ORDER) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_DEF_VISIT_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_DEF_VISIT_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_DEF_VISIT_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_DEF_VISIT_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A405TBM31_DEF_VISIT_NO = (short)(0) ;
               n405TBM31_DEF_VISIT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A405TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A405TBM31_DEF_VISIT_NO, 3, 0)));
            }
            else
            {
               A405TBM31_DEF_VISIT_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM31_DEF_VISIT_NO_Internalname), ".", ",")) ;
               n405TBM31_DEF_VISIT_NO = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A405TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A405TBM31_DEF_VISIT_NO, 3, 0)));
            }
            n405TBM31_DEF_VISIT_NO = ((0==A405TBM31_DEF_VISIT_NO) ? true : false) ;
            A406TBM31_DEF_DOMAIN_CD = httpContext.cgiGet( edtTBM31_DEF_DOMAIN_CD_Internalname) ;
            n406TBM31_DEF_DOMAIN_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A406TBM31_DEF_DOMAIN_CD", A406TBM31_DEF_DOMAIN_CD);
            n406TBM31_DEF_DOMAIN_CD = ((GXutil.strcmp("", A406TBM31_DEF_DOMAIN_CD)==0) ? true : false) ;
            A551TBM31_STATUS = httpContext.cgiGet( edtTBM31_STATUS_Internalname) ;
            n551TBM31_STATUS = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
            n551TBM31_STATUS = ((GXutil.strcmp("", A551TBM31_STATUS)==0) ? true : false) ;
            A222TBM31_NOTE = httpContext.cgiGet( edtTBM31_NOTE_Internalname) ;
            n222TBM31_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A222TBM31_NOTE", A222TBM31_NOTE);
            n222TBM31_NOTE = ((GXutil.strcmp("", A222TBM31_NOTE)==0) ? true : false) ;
            A223TBM31_DEL_FLG = httpContext.cgiGet( edtTBM31_DEL_FLG_Internalname) ;
            n223TBM31_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
            n223TBM31_DEL_FLG = ((GXutil.strcmp("", A223TBM31_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM31_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM31_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A224TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n224TBM31_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A224TBM31_CRT_DATETIME", localUtil.ttoc( A224TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A224TBM31_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM31_CRT_DATETIME_Internalname)) ;
               n224TBM31_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A224TBM31_CRT_DATETIME", localUtil.ttoc( A224TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n224TBM31_CRT_DATETIME = (GXutil.nullDate().equals(A224TBM31_CRT_DATETIME) ? true : false) ;
            A225TBM31_CRT_USER_ID = httpContext.cgiGet( edtTBM31_CRT_USER_ID_Internalname) ;
            n225TBM31_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A225TBM31_CRT_USER_ID", A225TBM31_CRT_USER_ID);
            n225TBM31_CRT_USER_ID = ((GXutil.strcmp("", A225TBM31_CRT_USER_ID)==0) ? true : false) ;
            A226TBM31_CRT_PROG_NM = httpContext.cgiGet( edtTBM31_CRT_PROG_NM_Internalname) ;
            n226TBM31_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A226TBM31_CRT_PROG_NM", A226TBM31_CRT_PROG_NM);
            n226TBM31_CRT_PROG_NM = ((GXutil.strcmp("", A226TBM31_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM31_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM31_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A227TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n227TBM31_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A227TBM31_UPD_DATETIME", localUtil.ttoc( A227TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A227TBM31_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM31_UPD_DATETIME_Internalname)) ;
               n227TBM31_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A227TBM31_UPD_DATETIME", localUtil.ttoc( A227TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n227TBM31_UPD_DATETIME = (GXutil.nullDate().equals(A227TBM31_UPD_DATETIME) ? true : false) ;
            A228TBM31_UPD_USER_ID = httpContext.cgiGet( edtTBM31_UPD_USER_ID_Internalname) ;
            n228TBM31_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A228TBM31_UPD_USER_ID", A228TBM31_UPD_USER_ID);
            n228TBM31_UPD_USER_ID = ((GXutil.strcmp("", A228TBM31_UPD_USER_ID)==0) ? true : false) ;
            A229TBM31_UPD_PROG_NM = httpContext.cgiGet( edtTBM31_UPD_PROG_NM_Internalname) ;
            n229TBM31_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A229TBM31_UPD_PROG_NM", A229TBM31_UPD_PROG_NM);
            n229TBM31_UPD_PROG_NM = ((GXutil.strcmp("", A229TBM31_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM31_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM31_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM31_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A230TBM31_UPD_CNT = 0 ;
               n230TBM31_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A230TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)));
            }
            else
            {
               A230TBM31_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM31_UPD_CNT_Internalname), ".", ",") ;
               n230TBM31_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A230TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)));
            }
            n230TBM31_UPD_CNT = ((0==A230TBM31_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z217TBM31_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z217TBM31_STUDY_ID"), ".", ",") ;
            Z218TBM31_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z218TBM31_CRF_ID"), ".", ",")) ;
            Z224TBM31_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z224TBM31_CRT_DATETIME"), 0) ;
            n224TBM31_CRT_DATETIME = (GXutil.nullDate().equals(A224TBM31_CRT_DATETIME) ? true : false) ;
            Z225TBM31_CRT_USER_ID = httpContext.cgiGet( "Z225TBM31_CRT_USER_ID") ;
            n225TBM31_CRT_USER_ID = ((GXutil.strcmp("", A225TBM31_CRT_USER_ID)==0) ? true : false) ;
            Z227TBM31_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z227TBM31_UPD_DATETIME"), 0) ;
            n227TBM31_UPD_DATETIME = (GXutil.nullDate().equals(A227TBM31_UPD_DATETIME) ? true : false) ;
            Z228TBM31_UPD_USER_ID = httpContext.cgiGet( "Z228TBM31_UPD_USER_ID") ;
            n228TBM31_UPD_USER_ID = ((GXutil.strcmp("", A228TBM31_UPD_USER_ID)==0) ? true : false) ;
            Z230TBM31_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z230TBM31_UPD_CNT"), ".", ",") ;
            n230TBM31_UPD_CNT = ((0==A230TBM31_UPD_CNT) ? true : false) ;
            Z219TBM31_CRF_NM = httpContext.cgiGet( "Z219TBM31_CRF_NM") ;
            n219TBM31_CRF_NM = ((GXutil.strcmp("", A219TBM31_CRF_NM)==0) ? true : false) ;
            Z550TBM31_CRF_SNM = httpContext.cgiGet( "Z550TBM31_CRF_SNM") ;
            n550TBM31_CRF_SNM = ((GXutil.strcmp("", A550TBM31_CRF_SNM)==0) ? true : false) ;
            Z220TBM31_GRID_SIZE = (short)(localUtil.ctol( httpContext.cgiGet( "Z220TBM31_GRID_SIZE"), ".", ",")) ;
            n220TBM31_GRID_SIZE = ((0==A220TBM31_GRID_SIZE) ? true : false) ;
            Z221TBM31_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( "Z221TBM31_ORDER"), ".", ",")) ;
            n221TBM31_ORDER = ((0==A221TBM31_ORDER) ? true : false) ;
            Z405TBM31_DEF_VISIT_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z405TBM31_DEF_VISIT_NO"), ".", ",")) ;
            n405TBM31_DEF_VISIT_NO = ((0==A405TBM31_DEF_VISIT_NO) ? true : false) ;
            Z406TBM31_DEF_DOMAIN_CD = httpContext.cgiGet( "Z406TBM31_DEF_DOMAIN_CD") ;
            n406TBM31_DEF_DOMAIN_CD = ((GXutil.strcmp("", A406TBM31_DEF_DOMAIN_CD)==0) ? true : false) ;
            Z551TBM31_STATUS = httpContext.cgiGet( "Z551TBM31_STATUS") ;
            n551TBM31_STATUS = ((GXutil.strcmp("", A551TBM31_STATUS)==0) ? true : false) ;
            Z222TBM31_NOTE = httpContext.cgiGet( "Z222TBM31_NOTE") ;
            n222TBM31_NOTE = ((GXutil.strcmp("", A222TBM31_NOTE)==0) ? true : false) ;
            Z223TBM31_DEL_FLG = httpContext.cgiGet( "Z223TBM31_DEL_FLG") ;
            n223TBM31_DEL_FLG = ((GXutil.strcmp("", A223TBM31_DEL_FLG)==0) ? true : false) ;
            Z226TBM31_CRT_PROG_NM = httpContext.cgiGet( "Z226TBM31_CRT_PROG_NM") ;
            n226TBM31_CRT_PROG_NM = ((GXutil.strcmp("", A226TBM31_CRT_PROG_NM)==0) ? true : false) ;
            Z229TBM31_UPD_PROG_NM = httpContext.cgiGet( "Z229TBM31_UPD_PROG_NM") ;
            n229TBM31_UPD_PROG_NM = ((GXutil.strcmp("", A229TBM31_UPD_PROG_NM)==0) ? true : false) ;
            O230TBM31_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O230TBM31_UPD_CNT"), ".", ",") ;
            n230TBM31_UPD_CNT = ((0==A230TBM31_UPD_CNT) ? true : false) ;
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
               A217TBM31_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
               A218TBM31_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120J2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A218TBM31_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A219TBM31_CRF_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A550TBM31_CRF_SNM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A220TBM31_GRID_SIZE, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A221TBM31_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A405TBM31_DEF_VISIT_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A406TBM31_DEF_DOMAIN_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A551TBM31_STATUS + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A222TBM31_NOTE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A223TBM31_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A224TBM31_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm31_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A224TBM31_CRT_DATETIME", localUtil.ttoc( A224TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A225TBM31_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A226TBM31_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A227TBM31_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm31_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A227TBM31_UPD_DATETIME", localUtil.ttoc( A227TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A228TBM31_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A229TBM31_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1171( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0J18( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z224TBM31_CRT_DATETIME = T000J3_A224TBM31_CRT_DATETIME[0] ;
            Z225TBM31_CRT_USER_ID = T000J3_A225TBM31_CRT_USER_ID[0] ;
            Z227TBM31_UPD_DATETIME = T000J3_A227TBM31_UPD_DATETIME[0] ;
            Z228TBM31_UPD_USER_ID = T000J3_A228TBM31_UPD_USER_ID[0] ;
            Z230TBM31_UPD_CNT = T000J3_A230TBM31_UPD_CNT[0] ;
            Z219TBM31_CRF_NM = T000J3_A219TBM31_CRF_NM[0] ;
            Z550TBM31_CRF_SNM = T000J3_A550TBM31_CRF_SNM[0] ;
            Z220TBM31_GRID_SIZE = T000J3_A220TBM31_GRID_SIZE[0] ;
            Z221TBM31_ORDER = T000J3_A221TBM31_ORDER[0] ;
            Z405TBM31_DEF_VISIT_NO = T000J3_A405TBM31_DEF_VISIT_NO[0] ;
            Z406TBM31_DEF_DOMAIN_CD = T000J3_A406TBM31_DEF_DOMAIN_CD[0] ;
            Z551TBM31_STATUS = T000J3_A551TBM31_STATUS[0] ;
            Z222TBM31_NOTE = T000J3_A222TBM31_NOTE[0] ;
            Z223TBM31_DEL_FLG = T000J3_A223TBM31_DEL_FLG[0] ;
            Z226TBM31_CRT_PROG_NM = T000J3_A226TBM31_CRT_PROG_NM[0] ;
            Z229TBM31_UPD_PROG_NM = T000J3_A229TBM31_UPD_PROG_NM[0] ;
         }
         else
         {
            Z224TBM31_CRT_DATETIME = A224TBM31_CRT_DATETIME ;
            Z225TBM31_CRT_USER_ID = A225TBM31_CRT_USER_ID ;
            Z227TBM31_UPD_DATETIME = A227TBM31_UPD_DATETIME ;
            Z228TBM31_UPD_USER_ID = A228TBM31_UPD_USER_ID ;
            Z230TBM31_UPD_CNT = A230TBM31_UPD_CNT ;
            Z219TBM31_CRF_NM = A219TBM31_CRF_NM ;
            Z550TBM31_CRF_SNM = A550TBM31_CRF_SNM ;
            Z220TBM31_GRID_SIZE = A220TBM31_GRID_SIZE ;
            Z221TBM31_ORDER = A221TBM31_ORDER ;
            Z405TBM31_DEF_VISIT_NO = A405TBM31_DEF_VISIT_NO ;
            Z406TBM31_DEF_DOMAIN_CD = A406TBM31_DEF_DOMAIN_CD ;
            Z551TBM31_STATUS = A551TBM31_STATUS ;
            Z222TBM31_NOTE = A222TBM31_NOTE ;
            Z223TBM31_DEL_FLG = A223TBM31_DEL_FLG ;
            Z226TBM31_CRT_PROG_NM = A226TBM31_CRT_PROG_NM ;
            Z229TBM31_UPD_PROG_NM = A229TBM31_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z218TBM31_CRF_ID = A218TBM31_CRF_ID ;
         Z224TBM31_CRT_DATETIME = A224TBM31_CRT_DATETIME ;
         Z225TBM31_CRT_USER_ID = A225TBM31_CRT_USER_ID ;
         Z227TBM31_UPD_DATETIME = A227TBM31_UPD_DATETIME ;
         Z228TBM31_UPD_USER_ID = A228TBM31_UPD_USER_ID ;
         Z230TBM31_UPD_CNT = A230TBM31_UPD_CNT ;
         Z219TBM31_CRF_NM = A219TBM31_CRF_NM ;
         Z550TBM31_CRF_SNM = A550TBM31_CRF_SNM ;
         Z220TBM31_GRID_SIZE = A220TBM31_GRID_SIZE ;
         Z221TBM31_ORDER = A221TBM31_ORDER ;
         Z405TBM31_DEF_VISIT_NO = A405TBM31_DEF_VISIT_NO ;
         Z406TBM31_DEF_DOMAIN_CD = A406TBM31_DEF_DOMAIN_CD ;
         Z551TBM31_STATUS = A551TBM31_STATUS ;
         Z222TBM31_NOTE = A222TBM31_NOTE ;
         Z223TBM31_DEL_FLG = A223TBM31_DEL_FLG ;
         Z226TBM31_CRT_PROG_NM = A226TBM31_CRT_PROG_NM ;
         Z229TBM31_UPD_PROG_NM = A229TBM31_UPD_PROG_NM ;
         Z217TBM31_STUDY_ID = A217TBM31_STUDY_ID ;
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
      pr_default.execute(3, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A224TBM31_CRT_DATETIME = T000J5_A224TBM31_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A224TBM31_CRT_DATETIME", localUtil.ttoc( A224TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n224TBM31_CRT_DATETIME = T000J5_n224TBM31_CRT_DATETIME[0] ;
         A225TBM31_CRT_USER_ID = T000J5_A225TBM31_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A225TBM31_CRT_USER_ID", A225TBM31_CRT_USER_ID);
         n225TBM31_CRT_USER_ID = T000J5_n225TBM31_CRT_USER_ID[0] ;
         A227TBM31_UPD_DATETIME = T000J5_A227TBM31_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A227TBM31_UPD_DATETIME", localUtil.ttoc( A227TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n227TBM31_UPD_DATETIME = T000J5_n227TBM31_UPD_DATETIME[0] ;
         A228TBM31_UPD_USER_ID = T000J5_A228TBM31_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228TBM31_UPD_USER_ID", A228TBM31_UPD_USER_ID);
         n228TBM31_UPD_USER_ID = T000J5_n228TBM31_UPD_USER_ID[0] ;
         A230TBM31_UPD_CNT = T000J5_A230TBM31_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A230TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)));
         n230TBM31_UPD_CNT = T000J5_n230TBM31_UPD_CNT[0] ;
         A219TBM31_CRF_NM = T000J5_A219TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A219TBM31_CRF_NM", A219TBM31_CRF_NM);
         n219TBM31_CRF_NM = T000J5_n219TBM31_CRF_NM[0] ;
         A550TBM31_CRF_SNM = T000J5_A550TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A550TBM31_CRF_SNM", A550TBM31_CRF_SNM);
         n550TBM31_CRF_SNM = T000J5_n550TBM31_CRF_SNM[0] ;
         A220TBM31_GRID_SIZE = T000J5_A220TBM31_GRID_SIZE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A220TBM31_GRID_SIZE", GXutil.ltrim( GXutil.str( A220TBM31_GRID_SIZE, 3, 0)));
         n220TBM31_GRID_SIZE = T000J5_n220TBM31_GRID_SIZE[0] ;
         A221TBM31_ORDER = T000J5_A221TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A221TBM31_ORDER", GXutil.ltrim( GXutil.str( A221TBM31_ORDER, 5, 0)));
         n221TBM31_ORDER = T000J5_n221TBM31_ORDER[0] ;
         A405TBM31_DEF_VISIT_NO = T000J5_A405TBM31_DEF_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A405TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A405TBM31_DEF_VISIT_NO, 3, 0)));
         n405TBM31_DEF_VISIT_NO = T000J5_n405TBM31_DEF_VISIT_NO[0] ;
         A406TBM31_DEF_DOMAIN_CD = T000J5_A406TBM31_DEF_DOMAIN_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A406TBM31_DEF_DOMAIN_CD", A406TBM31_DEF_DOMAIN_CD);
         n406TBM31_DEF_DOMAIN_CD = T000J5_n406TBM31_DEF_DOMAIN_CD[0] ;
         A551TBM31_STATUS = T000J5_A551TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
         n551TBM31_STATUS = T000J5_n551TBM31_STATUS[0] ;
         A222TBM31_NOTE = T000J5_A222TBM31_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A222TBM31_NOTE", A222TBM31_NOTE);
         n222TBM31_NOTE = T000J5_n222TBM31_NOTE[0] ;
         A223TBM31_DEL_FLG = T000J5_A223TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
         n223TBM31_DEL_FLG = T000J5_n223TBM31_DEL_FLG[0] ;
         A226TBM31_CRT_PROG_NM = T000J5_A226TBM31_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A226TBM31_CRT_PROG_NM", A226TBM31_CRT_PROG_NM);
         n226TBM31_CRT_PROG_NM = T000J5_n226TBM31_CRT_PROG_NM[0] ;
         A229TBM31_UPD_PROG_NM = T000J5_A229TBM31_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A229TBM31_UPD_PROG_NM", A229TBM31_UPD_PROG_NM);
         n229TBM31_UPD_PROG_NM = T000J5_n229TBM31_UPD_PROG_NM[0] ;
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
      pr_default.execute(2, new Object[] {new Long(A217TBM31_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError217 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError217 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A224TBM31_CRT_DATETIME) || (( A224TBM31_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A224TBM31_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A227TBM31_UPD_DATETIME) || (( A227TBM31_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A227TBM31_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0J18( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A217TBM31_STUDY_ID )
   {
      /* Using cursor T000J6 */
      pr_default.execute(4, new Object[] {new Long(A217TBM31_STUDY_ID)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         AnyError217 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError217 == 0 )
      {
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(4) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(4);
   }

   public void getKey0J18( )
   {
      /* Using cursor T000J7 */
      pr_default.execute(5, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound18 = (short)(1) ;
      }
      else
      {
         RcdFound18 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000J3 */
      pr_default.execute(1, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0J18( 8) ;
         RcdFound18 = (short)(1) ;
         A218TBM31_CRF_ID = T000J3_A218TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
         A224TBM31_CRT_DATETIME = T000J3_A224TBM31_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A224TBM31_CRT_DATETIME", localUtil.ttoc( A224TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n224TBM31_CRT_DATETIME = T000J3_n224TBM31_CRT_DATETIME[0] ;
         A225TBM31_CRT_USER_ID = T000J3_A225TBM31_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A225TBM31_CRT_USER_ID", A225TBM31_CRT_USER_ID);
         n225TBM31_CRT_USER_ID = T000J3_n225TBM31_CRT_USER_ID[0] ;
         A227TBM31_UPD_DATETIME = T000J3_A227TBM31_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A227TBM31_UPD_DATETIME", localUtil.ttoc( A227TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n227TBM31_UPD_DATETIME = T000J3_n227TBM31_UPD_DATETIME[0] ;
         A228TBM31_UPD_USER_ID = T000J3_A228TBM31_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A228TBM31_UPD_USER_ID", A228TBM31_UPD_USER_ID);
         n228TBM31_UPD_USER_ID = T000J3_n228TBM31_UPD_USER_ID[0] ;
         A230TBM31_UPD_CNT = T000J3_A230TBM31_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A230TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)));
         n230TBM31_UPD_CNT = T000J3_n230TBM31_UPD_CNT[0] ;
         A219TBM31_CRF_NM = T000J3_A219TBM31_CRF_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A219TBM31_CRF_NM", A219TBM31_CRF_NM);
         n219TBM31_CRF_NM = T000J3_n219TBM31_CRF_NM[0] ;
         A550TBM31_CRF_SNM = T000J3_A550TBM31_CRF_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A550TBM31_CRF_SNM", A550TBM31_CRF_SNM);
         n550TBM31_CRF_SNM = T000J3_n550TBM31_CRF_SNM[0] ;
         A220TBM31_GRID_SIZE = T000J3_A220TBM31_GRID_SIZE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A220TBM31_GRID_SIZE", GXutil.ltrim( GXutil.str( A220TBM31_GRID_SIZE, 3, 0)));
         n220TBM31_GRID_SIZE = T000J3_n220TBM31_GRID_SIZE[0] ;
         A221TBM31_ORDER = T000J3_A221TBM31_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A221TBM31_ORDER", GXutil.ltrim( GXutil.str( A221TBM31_ORDER, 5, 0)));
         n221TBM31_ORDER = T000J3_n221TBM31_ORDER[0] ;
         A405TBM31_DEF_VISIT_NO = T000J3_A405TBM31_DEF_VISIT_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A405TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A405TBM31_DEF_VISIT_NO, 3, 0)));
         n405TBM31_DEF_VISIT_NO = T000J3_n405TBM31_DEF_VISIT_NO[0] ;
         A406TBM31_DEF_DOMAIN_CD = T000J3_A406TBM31_DEF_DOMAIN_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A406TBM31_DEF_DOMAIN_CD", A406TBM31_DEF_DOMAIN_CD);
         n406TBM31_DEF_DOMAIN_CD = T000J3_n406TBM31_DEF_DOMAIN_CD[0] ;
         A551TBM31_STATUS = T000J3_A551TBM31_STATUS[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
         n551TBM31_STATUS = T000J3_n551TBM31_STATUS[0] ;
         A222TBM31_NOTE = T000J3_A222TBM31_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A222TBM31_NOTE", A222TBM31_NOTE);
         n222TBM31_NOTE = T000J3_n222TBM31_NOTE[0] ;
         A223TBM31_DEL_FLG = T000J3_A223TBM31_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
         n223TBM31_DEL_FLG = T000J3_n223TBM31_DEL_FLG[0] ;
         A226TBM31_CRT_PROG_NM = T000J3_A226TBM31_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A226TBM31_CRT_PROG_NM", A226TBM31_CRT_PROG_NM);
         n226TBM31_CRT_PROG_NM = T000J3_n226TBM31_CRT_PROG_NM[0] ;
         A229TBM31_UPD_PROG_NM = T000J3_A229TBM31_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A229TBM31_UPD_PROG_NM", A229TBM31_UPD_PROG_NM);
         n229TBM31_UPD_PROG_NM = T000J3_n229TBM31_UPD_PROG_NM[0] ;
         A217TBM31_STUDY_ID = T000J3_A217TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         O230TBM31_UPD_CNT = A230TBM31_UPD_CNT ;
         n230TBM31_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A230TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)));
         Z217TBM31_STUDY_ID = A217TBM31_STUDY_ID ;
         Z218TBM31_CRF_ID = A218TBM31_CRF_ID ;
         sMode18 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0J18( ) ;
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
      /* Using cursor T000J8 */
      pr_default.execute(6, new Object[] {new Long(A217TBM31_STUDY_ID), new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000J8_A217TBM31_STUDY_ID[0] < A217TBM31_STUDY_ID ) || ( T000J8_A217TBM31_STUDY_ID[0] == A217TBM31_STUDY_ID ) && ( T000J8_A218TBM31_CRF_ID[0] < A218TBM31_CRF_ID ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000J8_A217TBM31_STUDY_ID[0] > A217TBM31_STUDY_ID ) || ( T000J8_A217TBM31_STUDY_ID[0] == A217TBM31_STUDY_ID ) && ( T000J8_A218TBM31_CRF_ID[0] > A218TBM31_CRF_ID ) ) )
         {
            A217TBM31_STUDY_ID = T000J8_A217TBM31_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
            A218TBM31_CRF_ID = T000J8_A218TBM31_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound18 = (short)(0) ;
      /* Using cursor T000J9 */
      pr_default.execute(7, new Object[] {new Long(A217TBM31_STUDY_ID), new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000J9_A217TBM31_STUDY_ID[0] > A217TBM31_STUDY_ID ) || ( T000J9_A217TBM31_STUDY_ID[0] == A217TBM31_STUDY_ID ) && ( T000J9_A218TBM31_CRF_ID[0] > A218TBM31_CRF_ID ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000J9_A217TBM31_STUDY_ID[0] < A217TBM31_STUDY_ID ) || ( T000J9_A217TBM31_STUDY_ID[0] == A217TBM31_STUDY_ID ) && ( T000J9_A218TBM31_CRF_ID[0] < A218TBM31_CRF_ID ) ) )
         {
            A217TBM31_STUDY_ID = T000J9_A217TBM31_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
            A218TBM31_CRF_ID = T000J9_A218TBM31_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
            RcdFound18 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0J18( ) ;
      if ( RcdFound18 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM31_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A217TBM31_STUDY_ID != Z217TBM31_STUDY_ID ) || ( A218TBM31_CRF_ID != Z218TBM31_CRF_ID ) )
         {
            A217TBM31_STUDY_ID = Z217TBM31_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
            A218TBM31_CRF_ID = Z218TBM31_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
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
         if ( ( A217TBM31_STUDY_ID != Z217TBM31_STUDY_ID ) || ( A218TBM31_CRF_ID != Z218TBM31_CRF_ID ) )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( A217TBM31_STUDY_ID != Z217TBM31_STUDY_ID ) || ( A218TBM31_CRF_ID != Z218TBM31_CRF_ID ) )
      {
         A217TBM31_STUDY_ID = Z217TBM31_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         A218TBM31_CRF_ID = Z218TBM31_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
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
      scanStart0J18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart0J18( ) ;
      if ( RcdFound18 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(0, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM31_CRF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z224TBM31_CRT_DATETIME.equals( T000J2_A224TBM31_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z225TBM31_CRT_USER_ID, T000J2_A225TBM31_CRT_USER_ID[0]) != 0 ) || !( Z227TBM31_UPD_DATETIME.equals( T000J2_A227TBM31_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z228TBM31_UPD_USER_ID, T000J2_A228TBM31_UPD_USER_ID[0]) != 0 ) || ( Z230TBM31_UPD_CNT != T000J2_A230TBM31_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z219TBM31_CRF_NM, T000J2_A219TBM31_CRF_NM[0]) != 0 ) || ( GXutil.strcmp(Z550TBM31_CRF_SNM, T000J2_A550TBM31_CRF_SNM[0]) != 0 ) || ( Z220TBM31_GRID_SIZE != T000J2_A220TBM31_GRID_SIZE[0] ) || ( Z221TBM31_ORDER != T000J2_A221TBM31_ORDER[0] ) || ( Z405TBM31_DEF_VISIT_NO != T000J2_A405TBM31_DEF_VISIT_NO[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z406TBM31_DEF_DOMAIN_CD, T000J2_A406TBM31_DEF_DOMAIN_CD[0]) != 0 ) || ( GXutil.strcmp(Z551TBM31_STATUS, T000J2_A551TBM31_STATUS[0]) != 0 ) || ( GXutil.strcmp(Z222TBM31_NOTE, T000J2_A222TBM31_NOTE[0]) != 0 ) || ( GXutil.strcmp(Z223TBM31_DEL_FLG, T000J2_A223TBM31_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z226TBM31_CRT_PROG_NM, T000J2_A226TBM31_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z229TBM31_UPD_PROG_NM, T000J2_A229TBM31_UPD_PROG_NM[0]) != 0 ) )
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
                  /* Using cursor T000J10 */
                  pr_default.execute(8, new Object[] {new Short(A218TBM31_CRF_ID), new Boolean(n224TBM31_CRT_DATETIME), A224TBM31_CRT_DATETIME, new Boolean(n225TBM31_CRT_USER_ID), A225TBM31_CRT_USER_ID, new Boolean(n227TBM31_UPD_DATETIME), A227TBM31_UPD_DATETIME, new Boolean(n228TBM31_UPD_USER_ID), A228TBM31_UPD_USER_ID, new Boolean(n230TBM31_UPD_CNT), new Long(A230TBM31_UPD_CNT), new Boolean(n219TBM31_CRF_NM), A219TBM31_CRF_NM, new Boolean(n550TBM31_CRF_SNM), A550TBM31_CRF_SNM, new Boolean(n220TBM31_GRID_SIZE), new Short(A220TBM31_GRID_SIZE), new Boolean(n221TBM31_ORDER), new Integer(A221TBM31_ORDER), new Boolean(n405TBM31_DEF_VISIT_NO), new Short(A405TBM31_DEF_VISIT_NO), new Boolean(n406TBM31_DEF_DOMAIN_CD), A406TBM31_DEF_DOMAIN_CD, new Boolean(n551TBM31_STATUS), A551TBM31_STATUS, new Boolean(n222TBM31_NOTE), A222TBM31_NOTE, new Boolean(n223TBM31_DEL_FLG), A223TBM31_DEL_FLG, new Boolean(n226TBM31_CRT_PROG_NM), A226TBM31_CRT_PROG_NM, new Boolean(n229TBM31_UPD_PROG_NM), A229TBM31_UPD_PROG_NM, new Long(A217TBM31_STUDY_ID)});
                  if ( (pr_default.getStatus(8) == 1) )
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
                  /* Using cursor T000J11 */
                  pr_default.execute(9, new Object[] {new Boolean(n224TBM31_CRT_DATETIME), A224TBM31_CRT_DATETIME, new Boolean(n225TBM31_CRT_USER_ID), A225TBM31_CRT_USER_ID, new Boolean(n227TBM31_UPD_DATETIME), A227TBM31_UPD_DATETIME, new Boolean(n228TBM31_UPD_USER_ID), A228TBM31_UPD_USER_ID, new Boolean(n230TBM31_UPD_CNT), new Long(A230TBM31_UPD_CNT), new Boolean(n219TBM31_CRF_NM), A219TBM31_CRF_NM, new Boolean(n550TBM31_CRF_SNM), A550TBM31_CRF_SNM, new Boolean(n220TBM31_GRID_SIZE), new Short(A220TBM31_GRID_SIZE), new Boolean(n221TBM31_ORDER), new Integer(A221TBM31_ORDER), new Boolean(n405TBM31_DEF_VISIT_NO), new Short(A405TBM31_DEF_VISIT_NO), new Boolean(n406TBM31_DEF_DOMAIN_CD), A406TBM31_DEF_DOMAIN_CD, new Boolean(n551TBM31_STATUS), A551TBM31_STATUS, new Boolean(n222TBM31_NOTE), A222TBM31_NOTE, new Boolean(n223TBM31_DEL_FLG), A223TBM31_DEL_FLG, new Boolean(n226TBM31_CRT_PROG_NM), A226TBM31_CRT_PROG_NM, new Boolean(n229TBM31_UPD_PROG_NM), A229TBM31_UPD_PROG_NM, new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
                  if ( (pr_default.getStatus(9) == 103) )
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               /* Using cursor T000J12 */
               pr_default.execute(10, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
         /* Using cursor T000J13 */
         pr_default.execute(11, new Object[] {new Long(A217TBM31_STUDY_ID), new Short(A218TBM31_CRF_ID)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
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
      /* Using cursor T000J14 */
      pr_default.execute(12);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A217TBM31_STUDY_ID = T000J14_A217TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         A218TBM31_CRF_ID = T000J14_A218TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0J18( )
   {
      pr_default.readNext(12);
      RcdFound18 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound18 = (short)(1) ;
         A217TBM31_STUDY_ID = T000J14_A217TBM31_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
         A218TBM31_CRF_ID = T000J14_A218TBM31_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
      }
   }

   public void scanEnd0J18( )
   {
      pr_default.close(12);
   }

   public void afterConfirm0J18( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0J18( )
   {
      /* Before Insert Rules */
      A224TBM31_CRT_DATETIME = GXutil.now( ) ;
      n224TBM31_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A224TBM31_CRT_DATETIME", localUtil.ttoc( A224TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A225TBM31_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm31_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      A225TBM31_CRT_USER_ID = GXt_char3 ;
      n225TBM31_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A225TBM31_CRT_USER_ID", A225TBM31_CRT_USER_ID);
      A227TBM31_UPD_DATETIME = GXutil.now( ) ;
      n227TBM31_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A227TBM31_UPD_DATETIME", localUtil.ttoc( A227TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A228TBM31_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm31_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      A228TBM31_UPD_USER_ID = GXt_char3 ;
      n228TBM31_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A228TBM31_UPD_USER_ID", A228TBM31_UPD_USER_ID);
      A230TBM31_UPD_CNT = (long)(O230TBM31_UPD_CNT+1) ;
      n230TBM31_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A230TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0J18( )
   {
      /* Before Update Rules */
      A227TBM31_UPD_DATETIME = GXutil.now( ) ;
      n227TBM31_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A227TBM31_UPD_DATETIME", localUtil.ttoc( A227TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A228TBM31_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm31_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      A228TBM31_UPD_USER_ID = GXt_char3 ;
      n228TBM31_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A228TBM31_UPD_USER_ID", A228TBM31_UPD_USER_ID);
      A230TBM31_UPD_CNT = (long)(O230TBM31_UPD_CNT+1) ;
      n230TBM31_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A230TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRFマスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm31_crf") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0J18( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z217TBM31_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z217TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z218TBM31_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z218TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z224TBM31_CRT_DATETIME", localUtil.ttoc( Z224TBM31_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z225TBM31_CRT_USER_ID", GXutil.rtrim( Z225TBM31_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z227TBM31_UPD_DATETIME", localUtil.ttoc( Z227TBM31_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z228TBM31_UPD_USER_ID", GXutil.rtrim( Z228TBM31_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z230TBM31_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z230TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z219TBM31_CRF_NM", GXutil.rtrim( Z219TBM31_CRF_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z550TBM31_CRF_SNM", GXutil.rtrim( Z550TBM31_CRF_SNM));
      GxWebStd.gx_hidden_field( httpContext, "Z220TBM31_GRID_SIZE", GXutil.ltrim( localUtil.ntoc( Z220TBM31_GRID_SIZE, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z221TBM31_ORDER", GXutil.ltrim( localUtil.ntoc( Z221TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z405TBM31_DEF_VISIT_NO", GXutil.ltrim( localUtil.ntoc( Z405TBM31_DEF_VISIT_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z406TBM31_DEF_DOMAIN_CD", GXutil.rtrim( Z406TBM31_DEF_DOMAIN_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z551TBM31_STATUS", GXutil.rtrim( Z551TBM31_STATUS));
      GxWebStd.gx_hidden_field( httpContext, "Z222TBM31_NOTE", GXutil.rtrim( Z222TBM31_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z223TBM31_DEL_FLG", GXutil.rtrim( Z223TBM31_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z226TBM31_CRT_PROG_NM", GXutil.rtrim( Z226TBM31_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z229TBM31_UPD_PROG_NM", GXutil.rtrim( Z229TBM31_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O230TBM31_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O230TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0J18( )
   {
      A224TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n224TBM31_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A224TBM31_CRT_DATETIME", localUtil.ttoc( A224TBM31_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n224TBM31_CRT_DATETIME = (GXutil.nullDate().equals(A224TBM31_CRT_DATETIME) ? true : false) ;
      A225TBM31_CRT_USER_ID = "" ;
      n225TBM31_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A225TBM31_CRT_USER_ID", A225TBM31_CRT_USER_ID);
      n225TBM31_CRT_USER_ID = ((GXutil.strcmp("", A225TBM31_CRT_USER_ID)==0) ? true : false) ;
      A227TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n227TBM31_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A227TBM31_UPD_DATETIME", localUtil.ttoc( A227TBM31_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n227TBM31_UPD_DATETIME = (GXutil.nullDate().equals(A227TBM31_UPD_DATETIME) ? true : false) ;
      A228TBM31_UPD_USER_ID = "" ;
      n228TBM31_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A228TBM31_UPD_USER_ID", A228TBM31_UPD_USER_ID);
      n228TBM31_UPD_USER_ID = ((GXutil.strcmp("", A228TBM31_UPD_USER_ID)==0) ? true : false) ;
      A230TBM31_UPD_CNT = 0 ;
      n230TBM31_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A230TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)));
      n230TBM31_UPD_CNT = ((0==A230TBM31_UPD_CNT) ? true : false) ;
      A219TBM31_CRF_NM = "" ;
      n219TBM31_CRF_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A219TBM31_CRF_NM", A219TBM31_CRF_NM);
      n219TBM31_CRF_NM = ((GXutil.strcmp("", A219TBM31_CRF_NM)==0) ? true : false) ;
      A550TBM31_CRF_SNM = "" ;
      n550TBM31_CRF_SNM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A550TBM31_CRF_SNM", A550TBM31_CRF_SNM);
      n550TBM31_CRF_SNM = ((GXutil.strcmp("", A550TBM31_CRF_SNM)==0) ? true : false) ;
      A220TBM31_GRID_SIZE = (short)(0) ;
      n220TBM31_GRID_SIZE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A220TBM31_GRID_SIZE", GXutil.ltrim( GXutil.str( A220TBM31_GRID_SIZE, 3, 0)));
      n220TBM31_GRID_SIZE = ((0==A220TBM31_GRID_SIZE) ? true : false) ;
      A221TBM31_ORDER = 0 ;
      n221TBM31_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A221TBM31_ORDER", GXutil.ltrim( GXutil.str( A221TBM31_ORDER, 5, 0)));
      n221TBM31_ORDER = ((0==A221TBM31_ORDER) ? true : false) ;
      A405TBM31_DEF_VISIT_NO = (short)(0) ;
      n405TBM31_DEF_VISIT_NO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A405TBM31_DEF_VISIT_NO", GXutil.ltrim( GXutil.str( A405TBM31_DEF_VISIT_NO, 3, 0)));
      n405TBM31_DEF_VISIT_NO = ((0==A405TBM31_DEF_VISIT_NO) ? true : false) ;
      A406TBM31_DEF_DOMAIN_CD = "" ;
      n406TBM31_DEF_DOMAIN_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A406TBM31_DEF_DOMAIN_CD", A406TBM31_DEF_DOMAIN_CD);
      n406TBM31_DEF_DOMAIN_CD = ((GXutil.strcmp("", A406TBM31_DEF_DOMAIN_CD)==0) ? true : false) ;
      A551TBM31_STATUS = "" ;
      n551TBM31_STATUS = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A551TBM31_STATUS", A551TBM31_STATUS);
      n551TBM31_STATUS = ((GXutil.strcmp("", A551TBM31_STATUS)==0) ? true : false) ;
      A222TBM31_NOTE = "" ;
      n222TBM31_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A222TBM31_NOTE", A222TBM31_NOTE);
      n222TBM31_NOTE = ((GXutil.strcmp("", A222TBM31_NOTE)==0) ? true : false) ;
      A223TBM31_DEL_FLG = "" ;
      n223TBM31_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A223TBM31_DEL_FLG", A223TBM31_DEL_FLG);
      n223TBM31_DEL_FLG = ((GXutil.strcmp("", A223TBM31_DEL_FLG)==0) ? true : false) ;
      A226TBM31_CRT_PROG_NM = "" ;
      n226TBM31_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A226TBM31_CRT_PROG_NM", A226TBM31_CRT_PROG_NM);
      n226TBM31_CRT_PROG_NM = ((GXutil.strcmp("", A226TBM31_CRT_PROG_NM)==0) ? true : false) ;
      A229TBM31_UPD_PROG_NM = "" ;
      n229TBM31_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A229TBM31_UPD_PROG_NM", A229TBM31_UPD_PROG_NM);
      n229TBM31_UPD_PROG_NM = ((GXutil.strcmp("", A229TBM31_UPD_PROG_NM)==0) ? true : false) ;
      O230TBM31_UPD_CNT = A230TBM31_UPD_CNT ;
      n230TBM31_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A230TBM31_UPD_CNT", GXutil.ltrim( GXutil.str( A230TBM31_UPD_CNT, 10, 0)));
   }

   public void initAll0J18( )
   {
      A217TBM31_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A217TBM31_STUDY_ID", GXutil.ltrim( GXutil.str( A217TBM31_STUDY_ID, 10, 0)));
      A218TBM31_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A218TBM31_CRF_ID", GXutil.ltrim( GXutil.str( A218TBM31_CRF_ID, 4, 0)));
      initializeNonKey0J18( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14544330");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm31_crf.js", "?14544330");
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
      GXt_char3 = A225TBM31_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm31_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      A225TBM31_CRT_USER_ID = GXt_char3 ;
      n225TBM31_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A225TBM31_CRT_USER_ID", A225TBM31_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A225TBM31_CRT_USER_ID))+"\"");
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
      GXt_char3 = A228TBM31_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm31_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      A228TBM31_UPD_USER_ID = GXt_char3 ;
      n228TBM31_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A228TBM31_UPD_USER_ID", A228TBM31_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A228TBM31_UPD_USER_ID))+"\"");
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
      /* Using cursor T000J15 */
      pr_default.execute(13, new Object[] {new Long(A217TBM31_STUDY_ID)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         AnyError217 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError217 == 0 )
      {
      }
      pr_default.close(13);
      GX_FocusControl = edtTBM31_CRF_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm31_study_id( long GX_Parm1 )
   {
      A217TBM31_STUDY_ID = GX_Parm1 ;
      /* Using cursor T000J15 */
      pr_default.execute(13, new Object[] {new Long(A217TBM31_STUDY_ID)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         AnyError217 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM31_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM31_STUDY_ID_Internalname ;
      }
      if ( AnyError217 == 0 )
      {
      }
      pr_default.close(13);
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
                                   short GX_Parm12 ,
                                   String GX_Parm13 ,
                                   String GX_Parm14 ,
                                   String GX_Parm15 ,
                                   String GX_Parm16 ,
                                   String GX_Parm17 ,
                                   String GX_Parm18 )
   {
      A217TBM31_STUDY_ID = GX_Parm1 ;
      A218TBM31_CRF_ID = GX_Parm2 ;
      A224TBM31_CRT_DATETIME = GX_Parm3 ;
      n224TBM31_CRT_DATETIME = false ;
      A225TBM31_CRT_USER_ID = GX_Parm4 ;
      n225TBM31_CRT_USER_ID = false ;
      A227TBM31_UPD_DATETIME = GX_Parm5 ;
      n227TBM31_UPD_DATETIME = false ;
      A228TBM31_UPD_USER_ID = GX_Parm6 ;
      n228TBM31_UPD_USER_ID = false ;
      A230TBM31_UPD_CNT = GX_Parm7 ;
      n230TBM31_UPD_CNT = false ;
      A219TBM31_CRF_NM = GX_Parm8 ;
      n219TBM31_CRF_NM = false ;
      A550TBM31_CRF_SNM = GX_Parm9 ;
      n550TBM31_CRF_SNM = false ;
      A220TBM31_GRID_SIZE = GX_Parm10 ;
      n220TBM31_GRID_SIZE = false ;
      A221TBM31_ORDER = GX_Parm11 ;
      n221TBM31_ORDER = false ;
      A405TBM31_DEF_VISIT_NO = GX_Parm12 ;
      n405TBM31_DEF_VISIT_NO = false ;
      A406TBM31_DEF_DOMAIN_CD = GX_Parm13 ;
      n406TBM31_DEF_DOMAIN_CD = false ;
      A551TBM31_STATUS = GX_Parm14 ;
      n551TBM31_STATUS = false ;
      A222TBM31_NOTE = GX_Parm15 ;
      n222TBM31_NOTE = false ;
      A223TBM31_DEL_FLG = GX_Parm16 ;
      n223TBM31_DEL_FLG = false ;
      A226TBM31_CRT_PROG_NM = GX_Parm17 ;
      n226TBM31_CRT_PROG_NM = false ;
      A229TBM31_UPD_PROG_NM = GX_Parm18 ;
      n229TBM31_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A224TBM31_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A225TBM31_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A227TBM31_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A228TBM31_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A230TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A219TBM31_CRF_NM));
      isValidOutput.add(GXutil.rtrim( A550TBM31_CRF_SNM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A220TBM31_GRID_SIZE, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A221TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A405TBM31_DEF_VISIT_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A406TBM31_DEF_DOMAIN_CD));
      isValidOutput.add(GXutil.rtrim( A551TBM31_STATUS));
      isValidOutput.add(GXutil.rtrim( A222TBM31_NOTE));
      isValidOutput.add(GXutil.rtrim( A223TBM31_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A226TBM31_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A229TBM31_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z217TBM31_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z218TBM31_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z224TBM31_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z225TBM31_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z227TBM31_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z228TBM31_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z230TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z219TBM31_CRF_NM));
      isValidOutput.add(GXutil.rtrim( Z550TBM31_CRF_SNM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z220TBM31_GRID_SIZE, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z221TBM31_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z405TBM31_DEF_VISIT_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z406TBM31_DEF_DOMAIN_CD));
      isValidOutput.add(GXutil.rtrim( Z551TBM31_STATUS));
      isValidOutput.add(GXutil.rtrim( Z222TBM31_NOTE));
      isValidOutput.add(GXutil.rtrim( Z223TBM31_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z226TBM31_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z229TBM31_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O230TBM31_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      pr_default.close(13);
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
                  /* Execute user subroutine: S1171 */
                  S1171 ();
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
      lblTextblocktbm31_study_id_Jsonclick = "" ;
      lblTextblocktbm31_crf_id_Jsonclick = "" ;
      lblTextblocktbm31_crf_nm_Jsonclick = "" ;
      A219TBM31_CRF_NM = "" ;
      lblTextblocktbm31_crf_snm_Jsonclick = "" ;
      A550TBM31_CRF_SNM = "" ;
      lblTextblocktbm31_grid_size_Jsonclick = "" ;
      lblTextblocktbm31_order_Jsonclick = "" ;
      lblTextblocktbm31_def_visit_no_Jsonclick = "" ;
      lblTextblocktbm31_def_domain_cd_Jsonclick = "" ;
      A406TBM31_DEF_DOMAIN_CD = "" ;
      lblTextblocktbm31_status_Jsonclick = "" ;
      A551TBM31_STATUS = "" ;
      lblTextblocktbm31_note_Jsonclick = "" ;
      A222TBM31_NOTE = "" ;
      lblTextblocktbm31_del_flg_Jsonclick = "" ;
      A223TBM31_DEL_FLG = "" ;
      lblTextblocktbm31_crt_datetime_Jsonclick = "" ;
      A224TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm31_crt_user_id_Jsonclick = "" ;
      A225TBM31_CRT_USER_ID = "" ;
      lblTextblocktbm31_crt_prog_nm_Jsonclick = "" ;
      A226TBM31_CRT_PROG_NM = "" ;
      lblTextblocktbm31_upd_datetime_Jsonclick = "" ;
      A227TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm31_upd_user_id_Jsonclick = "" ;
      A228TBM31_UPD_USER_ID = "" ;
      lblTextblocktbm31_upd_prog_nm_Jsonclick = "" ;
      A229TBM31_UPD_PROG_NM = "" ;
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
      Z224TBM31_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z225TBM31_CRT_USER_ID = "" ;
      Z227TBM31_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z228TBM31_UPD_USER_ID = "" ;
      Z219TBM31_CRF_NM = "" ;
      Z550TBM31_CRF_SNM = "" ;
      Z406TBM31_DEF_DOMAIN_CD = "" ;
      Z551TBM31_STATUS = "" ;
      Z222TBM31_NOTE = "" ;
      Z223TBM31_DEL_FLG = "" ;
      Z226TBM31_CRT_PROG_NM = "" ;
      Z229TBM31_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000J5_A218TBM31_CRF_ID = new short[1] ;
      T000J5_A224TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J5_n224TBM31_CRT_DATETIME = new boolean[] {false} ;
      T000J5_A225TBM31_CRT_USER_ID = new String[] {""} ;
      T000J5_n225TBM31_CRT_USER_ID = new boolean[] {false} ;
      T000J5_A227TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J5_n227TBM31_UPD_DATETIME = new boolean[] {false} ;
      T000J5_A228TBM31_UPD_USER_ID = new String[] {""} ;
      T000J5_n228TBM31_UPD_USER_ID = new boolean[] {false} ;
      T000J5_A230TBM31_UPD_CNT = new long[1] ;
      T000J5_n230TBM31_UPD_CNT = new boolean[] {false} ;
      T000J5_A219TBM31_CRF_NM = new String[] {""} ;
      T000J5_n219TBM31_CRF_NM = new boolean[] {false} ;
      T000J5_A550TBM31_CRF_SNM = new String[] {""} ;
      T000J5_n550TBM31_CRF_SNM = new boolean[] {false} ;
      T000J5_A220TBM31_GRID_SIZE = new short[1] ;
      T000J5_n220TBM31_GRID_SIZE = new boolean[] {false} ;
      T000J5_A221TBM31_ORDER = new int[1] ;
      T000J5_n221TBM31_ORDER = new boolean[] {false} ;
      T000J5_A405TBM31_DEF_VISIT_NO = new short[1] ;
      T000J5_n405TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      T000J5_A406TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      T000J5_n406TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      T000J5_A551TBM31_STATUS = new String[] {""} ;
      T000J5_n551TBM31_STATUS = new boolean[] {false} ;
      T000J5_A222TBM31_NOTE = new String[] {""} ;
      T000J5_n222TBM31_NOTE = new boolean[] {false} ;
      T000J5_A223TBM31_DEL_FLG = new String[] {""} ;
      T000J5_n223TBM31_DEL_FLG = new boolean[] {false} ;
      T000J5_A226TBM31_CRT_PROG_NM = new String[] {""} ;
      T000J5_n226TBM31_CRT_PROG_NM = new boolean[] {false} ;
      T000J5_A229TBM31_UPD_PROG_NM = new String[] {""} ;
      T000J5_n229TBM31_UPD_PROG_NM = new boolean[] {false} ;
      T000J5_A217TBM31_STUDY_ID = new long[1] ;
      T000J4_A217TBM31_STUDY_ID = new long[1] ;
      T000J6_A217TBM31_STUDY_ID = new long[1] ;
      T000J7_A217TBM31_STUDY_ID = new long[1] ;
      T000J7_A218TBM31_CRF_ID = new short[1] ;
      T000J3_A218TBM31_CRF_ID = new short[1] ;
      T000J3_A224TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J3_n224TBM31_CRT_DATETIME = new boolean[] {false} ;
      T000J3_A225TBM31_CRT_USER_ID = new String[] {""} ;
      T000J3_n225TBM31_CRT_USER_ID = new boolean[] {false} ;
      T000J3_A227TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J3_n227TBM31_UPD_DATETIME = new boolean[] {false} ;
      T000J3_A228TBM31_UPD_USER_ID = new String[] {""} ;
      T000J3_n228TBM31_UPD_USER_ID = new boolean[] {false} ;
      T000J3_A230TBM31_UPD_CNT = new long[1] ;
      T000J3_n230TBM31_UPD_CNT = new boolean[] {false} ;
      T000J3_A219TBM31_CRF_NM = new String[] {""} ;
      T000J3_n219TBM31_CRF_NM = new boolean[] {false} ;
      T000J3_A550TBM31_CRF_SNM = new String[] {""} ;
      T000J3_n550TBM31_CRF_SNM = new boolean[] {false} ;
      T000J3_A220TBM31_GRID_SIZE = new short[1] ;
      T000J3_n220TBM31_GRID_SIZE = new boolean[] {false} ;
      T000J3_A221TBM31_ORDER = new int[1] ;
      T000J3_n221TBM31_ORDER = new boolean[] {false} ;
      T000J3_A405TBM31_DEF_VISIT_NO = new short[1] ;
      T000J3_n405TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      T000J3_A406TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      T000J3_n406TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      T000J3_A551TBM31_STATUS = new String[] {""} ;
      T000J3_n551TBM31_STATUS = new boolean[] {false} ;
      T000J3_A222TBM31_NOTE = new String[] {""} ;
      T000J3_n222TBM31_NOTE = new boolean[] {false} ;
      T000J3_A223TBM31_DEL_FLG = new String[] {""} ;
      T000J3_n223TBM31_DEL_FLG = new boolean[] {false} ;
      T000J3_A226TBM31_CRT_PROG_NM = new String[] {""} ;
      T000J3_n226TBM31_CRT_PROG_NM = new boolean[] {false} ;
      T000J3_A229TBM31_UPD_PROG_NM = new String[] {""} ;
      T000J3_n229TBM31_UPD_PROG_NM = new boolean[] {false} ;
      T000J3_A217TBM31_STUDY_ID = new long[1] ;
      sMode18 = "" ;
      T000J8_A217TBM31_STUDY_ID = new long[1] ;
      T000J8_A218TBM31_CRF_ID = new short[1] ;
      T000J9_A217TBM31_STUDY_ID = new long[1] ;
      T000J9_A218TBM31_CRF_ID = new short[1] ;
      T000J2_A218TBM31_CRF_ID = new short[1] ;
      T000J2_A224TBM31_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J2_n224TBM31_CRT_DATETIME = new boolean[] {false} ;
      T000J2_A225TBM31_CRT_USER_ID = new String[] {""} ;
      T000J2_n225TBM31_CRT_USER_ID = new boolean[] {false} ;
      T000J2_A227TBM31_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000J2_n227TBM31_UPD_DATETIME = new boolean[] {false} ;
      T000J2_A228TBM31_UPD_USER_ID = new String[] {""} ;
      T000J2_n228TBM31_UPD_USER_ID = new boolean[] {false} ;
      T000J2_A230TBM31_UPD_CNT = new long[1] ;
      T000J2_n230TBM31_UPD_CNT = new boolean[] {false} ;
      T000J2_A219TBM31_CRF_NM = new String[] {""} ;
      T000J2_n219TBM31_CRF_NM = new boolean[] {false} ;
      T000J2_A550TBM31_CRF_SNM = new String[] {""} ;
      T000J2_n550TBM31_CRF_SNM = new boolean[] {false} ;
      T000J2_A220TBM31_GRID_SIZE = new short[1] ;
      T000J2_n220TBM31_GRID_SIZE = new boolean[] {false} ;
      T000J2_A221TBM31_ORDER = new int[1] ;
      T000J2_n221TBM31_ORDER = new boolean[] {false} ;
      T000J2_A405TBM31_DEF_VISIT_NO = new short[1] ;
      T000J2_n405TBM31_DEF_VISIT_NO = new boolean[] {false} ;
      T000J2_A406TBM31_DEF_DOMAIN_CD = new String[] {""} ;
      T000J2_n406TBM31_DEF_DOMAIN_CD = new boolean[] {false} ;
      T000J2_A551TBM31_STATUS = new String[] {""} ;
      T000J2_n551TBM31_STATUS = new boolean[] {false} ;
      T000J2_A222TBM31_NOTE = new String[] {""} ;
      T000J2_n222TBM31_NOTE = new boolean[] {false} ;
      T000J2_A223TBM31_DEL_FLG = new String[] {""} ;
      T000J2_n223TBM31_DEL_FLG = new boolean[] {false} ;
      T000J2_A226TBM31_CRT_PROG_NM = new String[] {""} ;
      T000J2_n226TBM31_CRT_PROG_NM = new boolean[] {false} ;
      T000J2_A229TBM31_UPD_PROG_NM = new String[] {""} ;
      T000J2_n229TBM31_UPD_PROG_NM = new boolean[] {false} ;
      T000J2_A217TBM31_STUDY_ID = new long[1] ;
      T000J13_A625TBW03_SESSION_ID = new String[] {""} ;
      T000J13_A626TBW03_APP_ID = new String[] {""} ;
      T000J13_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T000J13_A628TBW03_STUDY_ID = new long[1] ;
      T000J13_A629TBW03_SUBJECT_ID = new int[1] ;
      T000J13_A630TBW03_CRF_ID = new short[1] ;
      T000J14_A217TBM31_STUDY_ID = new long[1] ;
      T000J14_A218TBM31_CRF_ID = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      T000J15_A217TBM31_STUDY_ID = new long[1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm31_crf__default(),
         new Object[] {
             new Object[] {
            T000J2_A218TBM31_CRF_ID, T000J2_A224TBM31_CRT_DATETIME, T000J2_n224TBM31_CRT_DATETIME, T000J2_A225TBM31_CRT_USER_ID, T000J2_n225TBM31_CRT_USER_ID, T000J2_A227TBM31_UPD_DATETIME, T000J2_n227TBM31_UPD_DATETIME, T000J2_A228TBM31_UPD_USER_ID, T000J2_n228TBM31_UPD_USER_ID, T000J2_A230TBM31_UPD_CNT,
            T000J2_n230TBM31_UPD_CNT, T000J2_A219TBM31_CRF_NM, T000J2_n219TBM31_CRF_NM, T000J2_A550TBM31_CRF_SNM, T000J2_n550TBM31_CRF_SNM, T000J2_A220TBM31_GRID_SIZE, T000J2_n220TBM31_GRID_SIZE, T000J2_A221TBM31_ORDER, T000J2_n221TBM31_ORDER, T000J2_A405TBM31_DEF_VISIT_NO,
            T000J2_n405TBM31_DEF_VISIT_NO, T000J2_A406TBM31_DEF_DOMAIN_CD, T000J2_n406TBM31_DEF_DOMAIN_CD, T000J2_A551TBM31_STATUS, T000J2_n551TBM31_STATUS, T000J2_A222TBM31_NOTE, T000J2_n222TBM31_NOTE, T000J2_A223TBM31_DEL_FLG, T000J2_n223TBM31_DEL_FLG, T000J2_A226TBM31_CRT_PROG_NM,
            T000J2_n226TBM31_CRT_PROG_NM, T000J2_A229TBM31_UPD_PROG_NM, T000J2_n229TBM31_UPD_PROG_NM, T000J2_A217TBM31_STUDY_ID
            }
            , new Object[] {
            T000J3_A218TBM31_CRF_ID, T000J3_A224TBM31_CRT_DATETIME, T000J3_n224TBM31_CRT_DATETIME, T000J3_A225TBM31_CRT_USER_ID, T000J3_n225TBM31_CRT_USER_ID, T000J3_A227TBM31_UPD_DATETIME, T000J3_n227TBM31_UPD_DATETIME, T000J3_A228TBM31_UPD_USER_ID, T000J3_n228TBM31_UPD_USER_ID, T000J3_A230TBM31_UPD_CNT,
            T000J3_n230TBM31_UPD_CNT, T000J3_A219TBM31_CRF_NM, T000J3_n219TBM31_CRF_NM, T000J3_A550TBM31_CRF_SNM, T000J3_n550TBM31_CRF_SNM, T000J3_A220TBM31_GRID_SIZE, T000J3_n220TBM31_GRID_SIZE, T000J3_A221TBM31_ORDER, T000J3_n221TBM31_ORDER, T000J3_A405TBM31_DEF_VISIT_NO,
            T000J3_n405TBM31_DEF_VISIT_NO, T000J3_A406TBM31_DEF_DOMAIN_CD, T000J3_n406TBM31_DEF_DOMAIN_CD, T000J3_A551TBM31_STATUS, T000J3_n551TBM31_STATUS, T000J3_A222TBM31_NOTE, T000J3_n222TBM31_NOTE, T000J3_A223TBM31_DEL_FLG, T000J3_n223TBM31_DEL_FLG, T000J3_A226TBM31_CRT_PROG_NM,
            T000J3_n226TBM31_CRT_PROG_NM, T000J3_A229TBM31_UPD_PROG_NM, T000J3_n229TBM31_UPD_PROG_NM, T000J3_A217TBM31_STUDY_ID
            }
            , new Object[] {
            T000J4_A217TBM31_STUDY_ID
            }
            , new Object[] {
            T000J5_A218TBM31_CRF_ID, T000J5_A224TBM31_CRT_DATETIME, T000J5_n224TBM31_CRT_DATETIME, T000J5_A225TBM31_CRT_USER_ID, T000J5_n225TBM31_CRT_USER_ID, T000J5_A227TBM31_UPD_DATETIME, T000J5_n227TBM31_UPD_DATETIME, T000J5_A228TBM31_UPD_USER_ID, T000J5_n228TBM31_UPD_USER_ID, T000J5_A230TBM31_UPD_CNT,
            T000J5_n230TBM31_UPD_CNT, T000J5_A219TBM31_CRF_NM, T000J5_n219TBM31_CRF_NM, T000J5_A550TBM31_CRF_SNM, T000J5_n550TBM31_CRF_SNM, T000J5_A220TBM31_GRID_SIZE, T000J5_n220TBM31_GRID_SIZE, T000J5_A221TBM31_ORDER, T000J5_n221TBM31_ORDER, T000J5_A405TBM31_DEF_VISIT_NO,
            T000J5_n405TBM31_DEF_VISIT_NO, T000J5_A406TBM31_DEF_DOMAIN_CD, T000J5_n406TBM31_DEF_DOMAIN_CD, T000J5_A551TBM31_STATUS, T000J5_n551TBM31_STATUS, T000J5_A222TBM31_NOTE, T000J5_n222TBM31_NOTE, T000J5_A223TBM31_DEL_FLG, T000J5_n223TBM31_DEL_FLG, T000J5_A226TBM31_CRT_PROG_NM,
            T000J5_n226TBM31_CRT_PROG_NM, T000J5_A229TBM31_UPD_PROG_NM, T000J5_n229TBM31_UPD_PROG_NM, T000J5_A217TBM31_STUDY_ID
            }
            , new Object[] {
            T000J6_A217TBM31_STUDY_ID
            }
            , new Object[] {
            T000J7_A217TBM31_STUDY_ID, T000J7_A218TBM31_CRF_ID
            }
            , new Object[] {
            T000J8_A217TBM31_STUDY_ID, T000J8_A218TBM31_CRF_ID
            }
            , new Object[] {
            T000J9_A217TBM31_STUDY_ID, T000J9_A218TBM31_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000J13_A625TBW03_SESSION_ID, T000J13_A626TBW03_APP_ID, T000J13_A627TBW03_DISP_DATETIME, T000J13_A628TBW03_STUDY_ID, T000J13_A629TBW03_SUBJECT_ID, T000J13_A630TBW03_CRF_ID
            }
            , new Object[] {
            T000J14_A217TBM31_STUDY_ID, T000J14_A218TBM31_CRF_ID
            }
            , new Object[] {
            T000J15_A217TBM31_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM31_CRF" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A218TBM31_CRF_ID ;
   private short A220TBM31_GRID_SIZE ;
   private short A405TBM31_DEF_VISIT_NO ;
   private short Z218TBM31_CRF_ID ;
   private short Z220TBM31_GRID_SIZE ;
   private short Z405TBM31_DEF_VISIT_NO ;
   private short RcdFound18 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM31_STUDY_ID_Enabled ;
   private int edtTBM31_CRF_ID_Enabled ;
   private int edtTBM31_CRF_NM_Enabled ;
   private int edtTBM31_CRF_SNM_Enabled ;
   private int edtTBM31_GRID_SIZE_Enabled ;
   private int A221TBM31_ORDER ;
   private int edtTBM31_ORDER_Enabled ;
   private int edtTBM31_DEF_VISIT_NO_Enabled ;
   private int edtTBM31_DEF_DOMAIN_CD_Enabled ;
   private int edtTBM31_STATUS_Enabled ;
   private int edtTBM31_NOTE_Enabled ;
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
   private int Z221TBM31_ORDER ;
   private int GX_JID ;
   private int AnyError217 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A217TBM31_STUDY_ID ;
   private long A230TBM31_UPD_CNT ;
   private long Z217TBM31_STUDY_ID ;
   private long Z230TBM31_UPD_CNT ;
   private long O230TBM31_UPD_CNT ;
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
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A224TBM31_CRT_DATETIME ;
   private java.util.Date A227TBM31_UPD_DATETIME ;
   private java.util.Date Z224TBM31_CRT_DATETIME ;
   private java.util.Date Z227TBM31_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n219TBM31_CRF_NM ;
   private boolean n550TBM31_CRF_SNM ;
   private boolean n220TBM31_GRID_SIZE ;
   private boolean n221TBM31_ORDER ;
   private boolean n405TBM31_DEF_VISIT_NO ;
   private boolean n406TBM31_DEF_DOMAIN_CD ;
   private boolean n551TBM31_STATUS ;
   private boolean n222TBM31_NOTE ;
   private boolean n223TBM31_DEL_FLG ;
   private boolean n224TBM31_CRT_DATETIME ;
   private boolean n225TBM31_CRT_USER_ID ;
   private boolean n226TBM31_CRT_PROG_NM ;
   private boolean n227TBM31_UPD_DATETIME ;
   private boolean n228TBM31_UPD_USER_ID ;
   private boolean n229TBM31_UPD_PROG_NM ;
   private boolean n230TBM31_UPD_CNT ;
   private boolean Gx_longc ;
   private String A219TBM31_CRF_NM ;
   private String A550TBM31_CRF_SNM ;
   private String A406TBM31_DEF_DOMAIN_CD ;
   private String A551TBM31_STATUS ;
   private String A222TBM31_NOTE ;
   private String A223TBM31_DEL_FLG ;
   private String A225TBM31_CRT_USER_ID ;
   private String A226TBM31_CRT_PROG_NM ;
   private String A228TBM31_UPD_USER_ID ;
   private String A229TBM31_UPD_PROG_NM ;
   private String Z225TBM31_CRT_USER_ID ;
   private String Z228TBM31_UPD_USER_ID ;
   private String Z219TBM31_CRF_NM ;
   private String Z550TBM31_CRF_SNM ;
   private String Z406TBM31_DEF_DOMAIN_CD ;
   private String Z551TBM31_STATUS ;
   private String Z222TBM31_NOTE ;
   private String Z223TBM31_DEL_FLG ;
   private String Z226TBM31_CRT_PROG_NM ;
   private String Z229TBM31_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private short[] T000J5_A218TBM31_CRF_ID ;
   private java.util.Date[] T000J5_A224TBM31_CRT_DATETIME ;
   private boolean[] T000J5_n224TBM31_CRT_DATETIME ;
   private String[] T000J5_A225TBM31_CRT_USER_ID ;
   private boolean[] T000J5_n225TBM31_CRT_USER_ID ;
   private java.util.Date[] T000J5_A227TBM31_UPD_DATETIME ;
   private boolean[] T000J5_n227TBM31_UPD_DATETIME ;
   private String[] T000J5_A228TBM31_UPD_USER_ID ;
   private boolean[] T000J5_n228TBM31_UPD_USER_ID ;
   private long[] T000J5_A230TBM31_UPD_CNT ;
   private boolean[] T000J5_n230TBM31_UPD_CNT ;
   private String[] T000J5_A219TBM31_CRF_NM ;
   private boolean[] T000J5_n219TBM31_CRF_NM ;
   private String[] T000J5_A550TBM31_CRF_SNM ;
   private boolean[] T000J5_n550TBM31_CRF_SNM ;
   private short[] T000J5_A220TBM31_GRID_SIZE ;
   private boolean[] T000J5_n220TBM31_GRID_SIZE ;
   private int[] T000J5_A221TBM31_ORDER ;
   private boolean[] T000J5_n221TBM31_ORDER ;
   private short[] T000J5_A405TBM31_DEF_VISIT_NO ;
   private boolean[] T000J5_n405TBM31_DEF_VISIT_NO ;
   private String[] T000J5_A406TBM31_DEF_DOMAIN_CD ;
   private boolean[] T000J5_n406TBM31_DEF_DOMAIN_CD ;
   private String[] T000J5_A551TBM31_STATUS ;
   private boolean[] T000J5_n551TBM31_STATUS ;
   private String[] T000J5_A222TBM31_NOTE ;
   private boolean[] T000J5_n222TBM31_NOTE ;
   private String[] T000J5_A223TBM31_DEL_FLG ;
   private boolean[] T000J5_n223TBM31_DEL_FLG ;
   private String[] T000J5_A226TBM31_CRT_PROG_NM ;
   private boolean[] T000J5_n226TBM31_CRT_PROG_NM ;
   private String[] T000J5_A229TBM31_UPD_PROG_NM ;
   private boolean[] T000J5_n229TBM31_UPD_PROG_NM ;
   private long[] T000J5_A217TBM31_STUDY_ID ;
   private long[] T000J4_A217TBM31_STUDY_ID ;
   private long[] T000J6_A217TBM31_STUDY_ID ;
   private long[] T000J7_A217TBM31_STUDY_ID ;
   private short[] T000J7_A218TBM31_CRF_ID ;
   private short[] T000J3_A218TBM31_CRF_ID ;
   private java.util.Date[] T000J3_A224TBM31_CRT_DATETIME ;
   private boolean[] T000J3_n224TBM31_CRT_DATETIME ;
   private String[] T000J3_A225TBM31_CRT_USER_ID ;
   private boolean[] T000J3_n225TBM31_CRT_USER_ID ;
   private java.util.Date[] T000J3_A227TBM31_UPD_DATETIME ;
   private boolean[] T000J3_n227TBM31_UPD_DATETIME ;
   private String[] T000J3_A228TBM31_UPD_USER_ID ;
   private boolean[] T000J3_n228TBM31_UPD_USER_ID ;
   private long[] T000J3_A230TBM31_UPD_CNT ;
   private boolean[] T000J3_n230TBM31_UPD_CNT ;
   private String[] T000J3_A219TBM31_CRF_NM ;
   private boolean[] T000J3_n219TBM31_CRF_NM ;
   private String[] T000J3_A550TBM31_CRF_SNM ;
   private boolean[] T000J3_n550TBM31_CRF_SNM ;
   private short[] T000J3_A220TBM31_GRID_SIZE ;
   private boolean[] T000J3_n220TBM31_GRID_SIZE ;
   private int[] T000J3_A221TBM31_ORDER ;
   private boolean[] T000J3_n221TBM31_ORDER ;
   private short[] T000J3_A405TBM31_DEF_VISIT_NO ;
   private boolean[] T000J3_n405TBM31_DEF_VISIT_NO ;
   private String[] T000J3_A406TBM31_DEF_DOMAIN_CD ;
   private boolean[] T000J3_n406TBM31_DEF_DOMAIN_CD ;
   private String[] T000J3_A551TBM31_STATUS ;
   private boolean[] T000J3_n551TBM31_STATUS ;
   private String[] T000J3_A222TBM31_NOTE ;
   private boolean[] T000J3_n222TBM31_NOTE ;
   private String[] T000J3_A223TBM31_DEL_FLG ;
   private boolean[] T000J3_n223TBM31_DEL_FLG ;
   private String[] T000J3_A226TBM31_CRT_PROG_NM ;
   private boolean[] T000J3_n226TBM31_CRT_PROG_NM ;
   private String[] T000J3_A229TBM31_UPD_PROG_NM ;
   private boolean[] T000J3_n229TBM31_UPD_PROG_NM ;
   private long[] T000J3_A217TBM31_STUDY_ID ;
   private long[] T000J8_A217TBM31_STUDY_ID ;
   private short[] T000J8_A218TBM31_CRF_ID ;
   private long[] T000J9_A217TBM31_STUDY_ID ;
   private short[] T000J9_A218TBM31_CRF_ID ;
   private short[] T000J2_A218TBM31_CRF_ID ;
   private java.util.Date[] T000J2_A224TBM31_CRT_DATETIME ;
   private boolean[] T000J2_n224TBM31_CRT_DATETIME ;
   private String[] T000J2_A225TBM31_CRT_USER_ID ;
   private boolean[] T000J2_n225TBM31_CRT_USER_ID ;
   private java.util.Date[] T000J2_A227TBM31_UPD_DATETIME ;
   private boolean[] T000J2_n227TBM31_UPD_DATETIME ;
   private String[] T000J2_A228TBM31_UPD_USER_ID ;
   private boolean[] T000J2_n228TBM31_UPD_USER_ID ;
   private long[] T000J2_A230TBM31_UPD_CNT ;
   private boolean[] T000J2_n230TBM31_UPD_CNT ;
   private String[] T000J2_A219TBM31_CRF_NM ;
   private boolean[] T000J2_n219TBM31_CRF_NM ;
   private String[] T000J2_A550TBM31_CRF_SNM ;
   private boolean[] T000J2_n550TBM31_CRF_SNM ;
   private short[] T000J2_A220TBM31_GRID_SIZE ;
   private boolean[] T000J2_n220TBM31_GRID_SIZE ;
   private int[] T000J2_A221TBM31_ORDER ;
   private boolean[] T000J2_n221TBM31_ORDER ;
   private short[] T000J2_A405TBM31_DEF_VISIT_NO ;
   private boolean[] T000J2_n405TBM31_DEF_VISIT_NO ;
   private String[] T000J2_A406TBM31_DEF_DOMAIN_CD ;
   private boolean[] T000J2_n406TBM31_DEF_DOMAIN_CD ;
   private String[] T000J2_A551TBM31_STATUS ;
   private boolean[] T000J2_n551TBM31_STATUS ;
   private String[] T000J2_A222TBM31_NOTE ;
   private boolean[] T000J2_n222TBM31_NOTE ;
   private String[] T000J2_A223TBM31_DEL_FLG ;
   private boolean[] T000J2_n223TBM31_DEL_FLG ;
   private String[] T000J2_A226TBM31_CRT_PROG_NM ;
   private boolean[] T000J2_n226TBM31_CRT_PROG_NM ;
   private String[] T000J2_A229TBM31_UPD_PROG_NM ;
   private boolean[] T000J2_n229TBM31_UPD_PROG_NM ;
   private long[] T000J2_A217TBM31_STUDY_ID ;
   private String[] T000J13_A625TBW03_SESSION_ID ;
   private String[] T000J13_A626TBW03_APP_ID ;
   private String[] T000J13_A627TBW03_DISP_DATETIME ;
   private long[] T000J13_A628TBW03_STUDY_ID ;
   private int[] T000J13_A629TBW03_SUBJECT_ID ;
   private short[] T000J13_A630TBW03_CRF_ID ;
   private long[] T000J14_A217TBM31_STUDY_ID ;
   private short[] T000J14_A218TBM31_CRF_ID ;
   private long[] T000J15_A217TBM31_STUDY_ID ;
}

final  class tbm31_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000J2", "SELECT `TBM31_CRF_ID`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_CNT`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_DEL_FLG`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_PROG_NM`, `TBM31_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000J3", "SELECT `TBM31_CRF_ID`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_CNT`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_DEL_FLG`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_PROG_NM`, `TBM31_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000J4", "SELECT `TBM21_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000J5", "SELECT TM1.`TBM31_CRF_ID`, TM1.`TBM31_CRT_DATETIME`, TM1.`TBM31_CRT_USER_ID`, TM1.`TBM31_UPD_DATETIME`, TM1.`TBM31_UPD_USER_ID`, TM1.`TBM31_UPD_CNT`, TM1.`TBM31_CRF_NM`, TM1.`TBM31_CRF_SNM`, TM1.`TBM31_GRID_SIZE`, TM1.`TBM31_ORDER`, TM1.`TBM31_DEF_VISIT_NO`, TM1.`TBM31_DEF_DOMAIN_CD`, TM1.`TBM31_STATUS`, TM1.`TBM31_NOTE`, TM1.`TBM31_DEL_FLG`, TM1.`TBM31_CRT_PROG_NM`, TM1.`TBM31_UPD_PROG_NM`, TM1.`TBM31_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM31_CRF` TM1 WHERE TM1.`TBM31_STUDY_ID` = ? and TM1.`TBM31_CRF_ID` = ? ORDER BY TM1.`TBM31_STUDY_ID`, TM1.`TBM31_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000J6", "SELECT `TBM21_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000J7", "SELECT `TBM31_STUDY_ID` AS TBM31_STUDY_ID, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000J8", "SELECT `TBM31_STUDY_ID` AS TBM31_STUDY_ID, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE ( `TBM31_STUDY_ID` > ? or `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` > ?) ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000J9", "SELECT `TBM31_STUDY_ID` AS TBM31_STUDY_ID, `TBM31_CRF_ID` FROM `TBM31_CRF` WHERE ( `TBM31_STUDY_ID` < ? or `TBM31_STUDY_ID` = ? and `TBM31_CRF_ID` < ?) ORDER BY `TBM31_STUDY_ID` DESC, `TBM31_CRF_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000J10", "INSERT INTO `TBM31_CRF` (`TBM31_CRF_ID`, `TBM31_CRT_DATETIME`, `TBM31_CRT_USER_ID`, `TBM31_UPD_DATETIME`, `TBM31_UPD_USER_ID`, `TBM31_UPD_CNT`, `TBM31_CRF_NM`, `TBM31_CRF_SNM`, `TBM31_GRID_SIZE`, `TBM31_ORDER`, `TBM31_DEF_VISIT_NO`, `TBM31_DEF_DOMAIN_CD`, `TBM31_STATUS`, `TBM31_NOTE`, `TBM31_DEL_FLG`, `TBM31_CRT_PROG_NM`, `TBM31_UPD_PROG_NM`, `TBM31_STUDY_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000J11", "UPDATE `TBM31_CRF` SET `TBM31_CRT_DATETIME`=?, `TBM31_CRT_USER_ID`=?, `TBM31_UPD_DATETIME`=?, `TBM31_UPD_USER_ID`=?, `TBM31_UPD_CNT`=?, `TBM31_CRF_NM`=?, `TBM31_CRF_SNM`=?, `TBM31_GRID_SIZE`=?, `TBM31_ORDER`=?, `TBM31_DEF_VISIT_NO`=?, `TBM31_DEF_DOMAIN_CD`=?, `TBM31_STATUS`=?, `TBM31_NOTE`=?, `TBM31_DEL_FLG`=?, `TBM31_CRT_PROG_NM`=?, `TBM31_UPD_PROG_NM`=?  WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000J12", "DELETE FROM `TBM31_CRF`  WHERE `TBM31_STUDY_ID` = ? AND `TBM31_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000J13", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_STUDY_ID` = ? AND `TBW03_CRF_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000J14", "SELECT `TBM31_STUDY_ID` AS TBM31_STUDY_ID, `TBM31_CRF_ID` FROM `TBM31_CRF` ORDER BY `TBM31_STUDY_ID`, `TBM31_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000J15", "SELECT `TBM21_STUDY_ID` AS TBM31_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((short[]) buf[19])[0] = rslt.getShort(11) ;
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
               ((long[]) buf[33])[0] = rslt.getLong(18) ;
               break;
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
               ((short[]) buf[19])[0] = rslt.getShort(11) ;
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
               ((long[]) buf[33])[0] = rslt.getLong(18) ;
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
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
               ((short[]) buf[19])[0] = rslt.getShort(11) ;
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
               ((long[]) buf[33])[0] = rslt.getLong(18) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               break;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               break;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
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
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 8 :
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
                  stmt.setShort(11, ((Number) parms[20]).shortValue());
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
                  stmt.setVarchar(16, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 40);
               }
               stmt.setLong(18, ((Number) parms[33]).longValue());
               break;
            case 9 :
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
                  stmt.setShort(10, ((Number) parms[19]).shortValue());
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
                  stmt.setVarchar(15, (String)parms[29], 40);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 40);
               }
               stmt.setLong(17, ((Number) parms[32]).longValue());
               stmt.setShort(18, ((Number) parms[33]).shortValue());
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               break;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

