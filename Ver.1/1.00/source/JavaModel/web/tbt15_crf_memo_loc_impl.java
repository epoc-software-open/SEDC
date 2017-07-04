/*
               File: tbt15_crf_memo_loc_impl
        Description: CRFメモ位置テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:42.56
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt15_crf_memo_loc_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBT15_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbt15_crt_user_id0T28( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBT15_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbt15_upd_user_id0T28( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A345TBT15_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
         A346TBT15_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
         A925TBT15_MEMO_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A345TBT15_STUDY_ID, A346TBT15_SUBJECT_ID, A925TBT15_MEMO_NO) ;
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
      Form.getMeta().addItem("Description", "CRFメモ位置テーブル", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbt15_crf_memo_loc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt15_crf_memo_loc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt15_crf_memo_loc_impl.class ));
   }

   public tbt15_crf_memo_loc_impl( int remoteHandle ,
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
         wb_table1_2_0T28( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0T28e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0T28( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0T28( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0T28( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0T28e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRFメモ位置テーブル"+"</legend>") ;
         wb_table3_27_0T28( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0T28e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0T28e( true) ;
      }
      else
      {
         wb_table1_2_0T28e( false) ;
      }
   }

   public void wb_table3_27_0T28( boolean wbgen )
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
         wb_table4_33_0T28( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0T28e( boolean wbgen )
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
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT15_CRF_MEMO_LOC.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT15_CRF_MEMO_LOC.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0T28e( true) ;
      }
      else
      {
         wb_table3_27_0T28e( false) ;
      }
   }

   public void wb_table4_33_0T28( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_study_id_Internalname, "試験ID", "", "", lblTextblocktbt15_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A345TBT15_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBT15_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A345TBT15_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A345TBT15_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBT15_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_subject_id_Internalname, "患者ID", "", "", lblTextblocktbt15_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A346TBT15_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBT15_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A346TBT15_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A346TBT15_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBT15_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_memo_no_Internalname, "メモ番号", "", "", lblTextblocktbt15_memo_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_MEMO_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A925TBT15_MEMO_NO, (byte)(3), (byte)(0), ".", "")), ((edtTBT15_MEMO_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A925TBT15_MEMO_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A925TBT15_MEMO_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(48);\"", "", "", "", "", edtTBT15_MEMO_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_MEMO_NO_Enabled, 0, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_crf_id_Internalname, "CRFID", "", "", lblTextblocktbt15_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A347TBT15_CRF_ID", GXutil.ltrim( GXutil.str( A347TBT15_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A347TBT15_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBT15_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A347TBT15_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A347TBT15_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBT15_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_crf_version_Internalname, "CRF更新バージョン", "", "", lblTextblocktbt15_crf_version_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A348TBT15_CRF_VERSION", GXutil.ltrim( GXutil.str( A348TBT15_CRF_VERSION, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_CRF_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A348TBT15_CRF_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBT15_CRF_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A348TBT15_CRF_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A348TBT15_CRF_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBT15_CRF_VERSION_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_CRF_VERSION_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_crf_item_grp_div_Internalname, "項目・グループ識別区分", "", "", lblTextblocktbt15_crf_item_grp_div_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A932TBT15_CRF_ITEM_GRP_DIV", A932TBT15_CRF_ITEM_GRP_DIV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_CRF_ITEM_GRP_DIV_Internalname, GXutil.rtrim( A932TBT15_CRF_ITEM_GRP_DIV), GXutil.rtrim( localUtil.format( A932TBT15_CRF_ITEM_GRP_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBT15_CRF_ITEM_GRP_DIV_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_CRF_ITEM_GRP_DIV_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_crf_item_grp_cd_Internalname, "CRF項目・項目グループコード", "", "", lblTextblocktbt15_crf_item_grp_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A926TBT15_CRF_ITEM_GRP_CD", A926TBT15_CRF_ITEM_GRP_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_CRF_ITEM_GRP_CD_Internalname, GXutil.rtrim( A926TBT15_CRF_ITEM_GRP_CD), GXutil.rtrim( localUtil.format( A926TBT15_CRF_ITEM_GRP_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBT15_CRF_ITEM_GRP_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_CRF_ITEM_GRP_CD_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt15_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A351TBT15_DEL_FLG", A351TBT15_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_DEL_FLG_Internalname, GXutil.rtrim( A351TBT15_DEL_FLG), GXutil.rtrim( localUtil.format( A351TBT15_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBT15_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt15_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A352TBT15_CRT_DATETIME", localUtil.ttoc( A352TBT15_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT15_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_CRT_DATETIME_Internalname, localUtil.format(A352TBT15_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A352TBT15_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(78);\"", "", "", "", "", edtTBT15_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT15_CRF_MEMO_LOC.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT15_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT15_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbt15_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A353TBT15_CRT_USER_ID", A353TBT15_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_CRT_USER_ID_Internalname, GXutil.rtrim( A353TBT15_CRT_USER_ID), GXutil.rtrim( localUtil.format( A353TBT15_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBT15_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt15_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A354TBT15_CRT_PROG_NM", A354TBT15_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_CRT_PROG_NM_Internalname, GXutil.rtrim( A354TBT15_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A354TBT15_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBT15_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt15_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A355TBT15_UPD_DATETIME", localUtil.ttoc( A355TBT15_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT15_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_UPD_DATETIME_Internalname, localUtil.format(A355TBT15_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A355TBT15_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBT15_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT15_CRF_MEMO_LOC.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT15_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT15_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbt15_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A356TBT15_UPD_USER_ID", A356TBT15_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_UPD_USER_ID_Internalname, GXutil.rtrim( A356TBT15_UPD_USER_ID), GXutil.rtrim( localUtil.format( A356TBT15_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTBT15_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt15_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A357TBT15_UPD_PROG_NM", A357TBT15_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_UPD_PROG_NM_Internalname, GXutil.rtrim( A357TBT15_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A357TBT15_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtTBT15_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt15_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt15_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A358TBT15_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBT15_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT15_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A358TBT15_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT15_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A358TBT15_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A358TBT15_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(108);\"", "", "", "", "", edtTBT15_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT15_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT15_CRF_MEMO_LOC.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0T28e( true) ;
      }
      else
      {
         wb_table4_33_0T28e( false) ;
      }
   }

   public void wb_table2_5_0T28( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT15_CRF_MEMO_LOC.htm");
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
         wb_table2_5_0T28e( true) ;
      }
      else
      {
         wb_table2_5_0T28e( false) ;
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
      /* Execute user event: e110T2 */
      e110T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT15_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A345TBT15_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
            }
            else
            {
               A345TBT15_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBT15_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT15_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT15_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A346TBT15_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A346TBT15_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBT15_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_MEMO_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_MEMO_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT15_MEMO_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT15_MEMO_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A925TBT15_MEMO_NO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
            }
            else
            {
               A925TBT15_MEMO_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT15_MEMO_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT15_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT15_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A347TBT15_CRF_ID = (short)(0) ;
               n347TBT15_CRF_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A347TBT15_CRF_ID", GXutil.ltrim( GXutil.str( A347TBT15_CRF_ID, 4, 0)));
            }
            else
            {
               A347TBT15_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT15_CRF_ID_Internalname), ".", ",")) ;
               n347TBT15_CRF_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A347TBT15_CRF_ID", GXutil.ltrim( GXutil.str( A347TBT15_CRF_ID, 4, 0)));
            }
            n347TBT15_CRF_ID = ((0==A347TBT15_CRF_ID) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_CRF_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_CRF_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT15_CRF_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT15_CRF_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A348TBT15_CRF_VERSION = (short)(0) ;
               n348TBT15_CRF_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A348TBT15_CRF_VERSION", GXutil.ltrim( GXutil.str( A348TBT15_CRF_VERSION, 4, 0)));
            }
            else
            {
               A348TBT15_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT15_CRF_VERSION_Internalname), ".", ",")) ;
               n348TBT15_CRF_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A348TBT15_CRF_VERSION", GXutil.ltrim( GXutil.str( A348TBT15_CRF_VERSION, 4, 0)));
            }
            n348TBT15_CRF_VERSION = ((0==A348TBT15_CRF_VERSION) ? true : false) ;
            A932TBT15_CRF_ITEM_GRP_DIV = httpContext.cgiGet( edtTBT15_CRF_ITEM_GRP_DIV_Internalname) ;
            n932TBT15_CRF_ITEM_GRP_DIV = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A932TBT15_CRF_ITEM_GRP_DIV", A932TBT15_CRF_ITEM_GRP_DIV);
            n932TBT15_CRF_ITEM_GRP_DIV = ((GXutil.strcmp("", A932TBT15_CRF_ITEM_GRP_DIV)==0) ? true : false) ;
            A926TBT15_CRF_ITEM_GRP_CD = httpContext.cgiGet( edtTBT15_CRF_ITEM_GRP_CD_Internalname) ;
            n926TBT15_CRF_ITEM_GRP_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A926TBT15_CRF_ITEM_GRP_CD", A926TBT15_CRF_ITEM_GRP_CD);
            n926TBT15_CRF_ITEM_GRP_CD = ((GXutil.strcmp("", A926TBT15_CRF_ITEM_GRP_CD)==0) ? true : false) ;
            A351TBT15_DEL_FLG = httpContext.cgiGet( edtTBT15_DEL_FLG_Internalname) ;
            n351TBT15_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A351TBT15_DEL_FLG", A351TBT15_DEL_FLG);
            n351TBT15_DEL_FLG = ((GXutil.strcmp("", A351TBT15_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT15_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBT15_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT15_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A352TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n352TBT15_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A352TBT15_CRT_DATETIME", localUtil.ttoc( A352TBT15_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A352TBT15_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT15_CRT_DATETIME_Internalname)) ;
               n352TBT15_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A352TBT15_CRT_DATETIME", localUtil.ttoc( A352TBT15_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n352TBT15_CRT_DATETIME = (GXutil.nullDate().equals(A352TBT15_CRT_DATETIME) ? true : false) ;
            A353TBT15_CRT_USER_ID = httpContext.cgiGet( edtTBT15_CRT_USER_ID_Internalname) ;
            n353TBT15_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A353TBT15_CRT_USER_ID", A353TBT15_CRT_USER_ID);
            n353TBT15_CRT_USER_ID = ((GXutil.strcmp("", A353TBT15_CRT_USER_ID)==0) ? true : false) ;
            A354TBT15_CRT_PROG_NM = httpContext.cgiGet( edtTBT15_CRT_PROG_NM_Internalname) ;
            n354TBT15_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A354TBT15_CRT_PROG_NM", A354TBT15_CRT_PROG_NM);
            n354TBT15_CRT_PROG_NM = ((GXutil.strcmp("", A354TBT15_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT15_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBT15_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT15_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A355TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n355TBT15_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A355TBT15_UPD_DATETIME", localUtil.ttoc( A355TBT15_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A355TBT15_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT15_UPD_DATETIME_Internalname)) ;
               n355TBT15_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A355TBT15_UPD_DATETIME", localUtil.ttoc( A355TBT15_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n355TBT15_UPD_DATETIME = (GXutil.nullDate().equals(A355TBT15_UPD_DATETIME) ? true : false) ;
            A356TBT15_UPD_USER_ID = httpContext.cgiGet( edtTBT15_UPD_USER_ID_Internalname) ;
            n356TBT15_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A356TBT15_UPD_USER_ID", A356TBT15_UPD_USER_ID);
            n356TBT15_UPD_USER_ID = ((GXutil.strcmp("", A356TBT15_UPD_USER_ID)==0) ? true : false) ;
            A357TBT15_UPD_PROG_NM = httpContext.cgiGet( edtTBT15_UPD_PROG_NM_Internalname) ;
            n357TBT15_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A357TBT15_UPD_PROG_NM", A357TBT15_UPD_PROG_NM);
            n357TBT15_UPD_PROG_NM = ((GXutil.strcmp("", A357TBT15_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT15_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT15_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT15_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A358TBT15_UPD_CNT = 0 ;
               n358TBT15_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A358TBT15_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBT15_UPD_CNT, 10, 0)));
            }
            else
            {
               A358TBT15_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT15_UPD_CNT_Internalname), ".", ",") ;
               n358TBT15_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A358TBT15_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBT15_UPD_CNT, 10, 0)));
            }
            n358TBT15_UPD_CNT = ((0==A358TBT15_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z345TBT15_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z345TBT15_STUDY_ID"), ".", ",") ;
            Z346TBT15_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z346TBT15_SUBJECT_ID"), ".", ",")) ;
            Z925TBT15_MEMO_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z925TBT15_MEMO_NO"), ".", ",")) ;
            Z352TBT15_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z352TBT15_CRT_DATETIME"), 0) ;
            n352TBT15_CRT_DATETIME = (GXutil.nullDate().equals(A352TBT15_CRT_DATETIME) ? true : false) ;
            Z353TBT15_CRT_USER_ID = httpContext.cgiGet( "Z353TBT15_CRT_USER_ID") ;
            n353TBT15_CRT_USER_ID = ((GXutil.strcmp("", A353TBT15_CRT_USER_ID)==0) ? true : false) ;
            Z355TBT15_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z355TBT15_UPD_DATETIME"), 0) ;
            n355TBT15_UPD_DATETIME = (GXutil.nullDate().equals(A355TBT15_UPD_DATETIME) ? true : false) ;
            Z356TBT15_UPD_USER_ID = httpContext.cgiGet( "Z356TBT15_UPD_USER_ID") ;
            n356TBT15_UPD_USER_ID = ((GXutil.strcmp("", A356TBT15_UPD_USER_ID)==0) ? true : false) ;
            Z358TBT15_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z358TBT15_UPD_CNT"), ".", ",") ;
            n358TBT15_UPD_CNT = ((0==A358TBT15_UPD_CNT) ? true : false) ;
            Z347TBT15_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z347TBT15_CRF_ID"), ".", ",")) ;
            n347TBT15_CRF_ID = ((0==A347TBT15_CRF_ID) ? true : false) ;
            Z348TBT15_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z348TBT15_CRF_VERSION"), ".", ",")) ;
            n348TBT15_CRF_VERSION = ((0==A348TBT15_CRF_VERSION) ? true : false) ;
            Z932TBT15_CRF_ITEM_GRP_DIV = httpContext.cgiGet( "Z932TBT15_CRF_ITEM_GRP_DIV") ;
            n932TBT15_CRF_ITEM_GRP_DIV = ((GXutil.strcmp("", A932TBT15_CRF_ITEM_GRP_DIV)==0) ? true : false) ;
            Z926TBT15_CRF_ITEM_GRP_CD = httpContext.cgiGet( "Z926TBT15_CRF_ITEM_GRP_CD") ;
            n926TBT15_CRF_ITEM_GRP_CD = ((GXutil.strcmp("", A926TBT15_CRF_ITEM_GRP_CD)==0) ? true : false) ;
            Z351TBT15_DEL_FLG = httpContext.cgiGet( "Z351TBT15_DEL_FLG") ;
            n351TBT15_DEL_FLG = ((GXutil.strcmp("", A351TBT15_DEL_FLG)==0) ? true : false) ;
            Z354TBT15_CRT_PROG_NM = httpContext.cgiGet( "Z354TBT15_CRT_PROG_NM") ;
            n354TBT15_CRT_PROG_NM = ((GXutil.strcmp("", A354TBT15_CRT_PROG_NM)==0) ? true : false) ;
            Z357TBT15_UPD_PROG_NM = httpContext.cgiGet( "Z357TBT15_UPD_PROG_NM") ;
            n357TBT15_UPD_PROG_NM = ((GXutil.strcmp("", A357TBT15_UPD_PROG_NM)==0) ? true : false) ;
            O358TBT15_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O358TBT15_UPD_CNT"), ".", ",") ;
            n358TBT15_UPD_CNT = ((0==A358TBT15_UPD_CNT) ? true : false) ;
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
               A345TBT15_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
               A346TBT15_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
               A925TBT15_MEMO_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
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
                     /* Execute user event: e110T2 */
                     e110T2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120T2 */
                     e120T2 ();
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
         /* Execute user event: e120T2 */
         e120T2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0T28( ) ;
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
      disableAttributes0T28( ) ;
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

   public void resetCaption0T0( )
   {
   }

   public void e110T2( )
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

   public void e120T2( )
   {
      /* After Trn Routine */
   }

   public void S1170( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0T28( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z352TBT15_CRT_DATETIME = T000T3_A352TBT15_CRT_DATETIME[0] ;
            Z353TBT15_CRT_USER_ID = T000T3_A353TBT15_CRT_USER_ID[0] ;
            Z355TBT15_UPD_DATETIME = T000T3_A355TBT15_UPD_DATETIME[0] ;
            Z356TBT15_UPD_USER_ID = T000T3_A356TBT15_UPD_USER_ID[0] ;
            Z358TBT15_UPD_CNT = T000T3_A358TBT15_UPD_CNT[0] ;
            Z347TBT15_CRF_ID = T000T3_A347TBT15_CRF_ID[0] ;
            Z348TBT15_CRF_VERSION = T000T3_A348TBT15_CRF_VERSION[0] ;
            Z932TBT15_CRF_ITEM_GRP_DIV = T000T3_A932TBT15_CRF_ITEM_GRP_DIV[0] ;
            Z926TBT15_CRF_ITEM_GRP_CD = T000T3_A926TBT15_CRF_ITEM_GRP_CD[0] ;
            Z351TBT15_DEL_FLG = T000T3_A351TBT15_DEL_FLG[0] ;
            Z354TBT15_CRT_PROG_NM = T000T3_A354TBT15_CRT_PROG_NM[0] ;
            Z357TBT15_UPD_PROG_NM = T000T3_A357TBT15_UPD_PROG_NM[0] ;
         }
         else
         {
            Z352TBT15_CRT_DATETIME = A352TBT15_CRT_DATETIME ;
            Z353TBT15_CRT_USER_ID = A353TBT15_CRT_USER_ID ;
            Z355TBT15_UPD_DATETIME = A355TBT15_UPD_DATETIME ;
            Z356TBT15_UPD_USER_ID = A356TBT15_UPD_USER_ID ;
            Z358TBT15_UPD_CNT = A358TBT15_UPD_CNT ;
            Z347TBT15_CRF_ID = A347TBT15_CRF_ID ;
            Z348TBT15_CRF_VERSION = A348TBT15_CRF_VERSION ;
            Z932TBT15_CRF_ITEM_GRP_DIV = A932TBT15_CRF_ITEM_GRP_DIV ;
            Z926TBT15_CRF_ITEM_GRP_CD = A926TBT15_CRF_ITEM_GRP_CD ;
            Z351TBT15_DEL_FLG = A351TBT15_DEL_FLG ;
            Z354TBT15_CRT_PROG_NM = A354TBT15_CRT_PROG_NM ;
            Z357TBT15_UPD_PROG_NM = A357TBT15_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z352TBT15_CRT_DATETIME = A352TBT15_CRT_DATETIME ;
         Z353TBT15_CRT_USER_ID = A353TBT15_CRT_USER_ID ;
         Z355TBT15_UPD_DATETIME = A355TBT15_UPD_DATETIME ;
         Z356TBT15_UPD_USER_ID = A356TBT15_UPD_USER_ID ;
         Z358TBT15_UPD_CNT = A358TBT15_UPD_CNT ;
         Z347TBT15_CRF_ID = A347TBT15_CRF_ID ;
         Z348TBT15_CRF_VERSION = A348TBT15_CRF_VERSION ;
         Z932TBT15_CRF_ITEM_GRP_DIV = A932TBT15_CRF_ITEM_GRP_DIV ;
         Z926TBT15_CRF_ITEM_GRP_CD = A926TBT15_CRF_ITEM_GRP_CD ;
         Z351TBT15_DEL_FLG = A351TBT15_DEL_FLG ;
         Z354TBT15_CRT_PROG_NM = A354TBT15_CRT_PROG_NM ;
         Z357TBT15_UPD_PROG_NM = A357TBT15_UPD_PROG_NM ;
         Z345TBT15_STUDY_ID = A345TBT15_STUDY_ID ;
         Z346TBT15_SUBJECT_ID = A346TBT15_SUBJECT_ID ;
         Z925TBT15_MEMO_NO = A925TBT15_MEMO_NO ;
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

   public void load0T28( )
   {
      /* Using cursor T000T5 */
      pr_default.execute(3, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound28 = (short)(1) ;
         A352TBT15_CRT_DATETIME = T000T5_A352TBT15_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A352TBT15_CRT_DATETIME", localUtil.ttoc( A352TBT15_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n352TBT15_CRT_DATETIME = T000T5_n352TBT15_CRT_DATETIME[0] ;
         A353TBT15_CRT_USER_ID = T000T5_A353TBT15_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A353TBT15_CRT_USER_ID", A353TBT15_CRT_USER_ID);
         n353TBT15_CRT_USER_ID = T000T5_n353TBT15_CRT_USER_ID[0] ;
         A355TBT15_UPD_DATETIME = T000T5_A355TBT15_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A355TBT15_UPD_DATETIME", localUtil.ttoc( A355TBT15_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n355TBT15_UPD_DATETIME = T000T5_n355TBT15_UPD_DATETIME[0] ;
         A356TBT15_UPD_USER_ID = T000T5_A356TBT15_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A356TBT15_UPD_USER_ID", A356TBT15_UPD_USER_ID);
         n356TBT15_UPD_USER_ID = T000T5_n356TBT15_UPD_USER_ID[0] ;
         A358TBT15_UPD_CNT = T000T5_A358TBT15_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A358TBT15_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBT15_UPD_CNT, 10, 0)));
         n358TBT15_UPD_CNT = T000T5_n358TBT15_UPD_CNT[0] ;
         A347TBT15_CRF_ID = T000T5_A347TBT15_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A347TBT15_CRF_ID", GXutil.ltrim( GXutil.str( A347TBT15_CRF_ID, 4, 0)));
         n347TBT15_CRF_ID = T000T5_n347TBT15_CRF_ID[0] ;
         A348TBT15_CRF_VERSION = T000T5_A348TBT15_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A348TBT15_CRF_VERSION", GXutil.ltrim( GXutil.str( A348TBT15_CRF_VERSION, 4, 0)));
         n348TBT15_CRF_VERSION = T000T5_n348TBT15_CRF_VERSION[0] ;
         A932TBT15_CRF_ITEM_GRP_DIV = T000T5_A932TBT15_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A932TBT15_CRF_ITEM_GRP_DIV", A932TBT15_CRF_ITEM_GRP_DIV);
         n932TBT15_CRF_ITEM_GRP_DIV = T000T5_n932TBT15_CRF_ITEM_GRP_DIV[0] ;
         A926TBT15_CRF_ITEM_GRP_CD = T000T5_A926TBT15_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A926TBT15_CRF_ITEM_GRP_CD", A926TBT15_CRF_ITEM_GRP_CD);
         n926TBT15_CRF_ITEM_GRP_CD = T000T5_n926TBT15_CRF_ITEM_GRP_CD[0] ;
         A351TBT15_DEL_FLG = T000T5_A351TBT15_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A351TBT15_DEL_FLG", A351TBT15_DEL_FLG);
         n351TBT15_DEL_FLG = T000T5_n351TBT15_DEL_FLG[0] ;
         A354TBT15_CRT_PROG_NM = T000T5_A354TBT15_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A354TBT15_CRT_PROG_NM", A354TBT15_CRT_PROG_NM);
         n354TBT15_CRT_PROG_NM = T000T5_n354TBT15_CRT_PROG_NM[0] ;
         A357TBT15_UPD_PROG_NM = T000T5_A357TBT15_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A357TBT15_UPD_PROG_NM", A357TBT15_UPD_PROG_NM);
         n357TBT15_UPD_PROG_NM = T000T5_n357TBT15_UPD_PROG_NM[0] ;
         zm0T28( -8) ;
      }
      pr_default.close(3);
      onLoadActions0T28( ) ;
   }

   public void onLoadActions0T28( )
   {
      AV9Pgmname = "TBT15_CRF_MEMO_LOC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0T28( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBT15_CRF_MEMO_LOC" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000T4 */
      pr_default.execute(2, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError345 = 1 ;
         AnyError346 = 1 ;
         AnyError925 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFメモ位置テーブル・CRFメモサブタイプ'", "ForeignKeyNotFound", 1, "TBT15_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError345 == 0 ) && ( AnyError346 == 0 ) && ( AnyError925 == 0 ) )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A352TBT15_CRT_DATETIME) || (( A352TBT15_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A352TBT15_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A355TBT15_UPD_DATETIME) || (( A355TBT15_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A355TBT15_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0T28( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A345TBT15_STUDY_ID ,
                         int A346TBT15_SUBJECT_ID ,
                         short A925TBT15_MEMO_NO )
   {
      /* Using cursor T000T6 */
      pr_default.execute(4, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         AnyError345 = 1 ;
         AnyError346 = 1 ;
         AnyError925 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFメモ位置テーブル・CRFメモサブタイプ'", "ForeignKeyNotFound", 1, "TBT15_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError345 == 0 ) && ( AnyError346 == 0 ) && ( AnyError925 == 0 ) )
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

   public void getKey0T28( )
   {
      /* Using cursor T000T7 */
      pr_default.execute(5, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound28 = (short)(1) ;
      }
      else
      {
         RcdFound28 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000T3 */
      pr_default.execute(1, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0T28( 8) ;
         RcdFound28 = (short)(1) ;
         A352TBT15_CRT_DATETIME = T000T3_A352TBT15_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A352TBT15_CRT_DATETIME", localUtil.ttoc( A352TBT15_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n352TBT15_CRT_DATETIME = T000T3_n352TBT15_CRT_DATETIME[0] ;
         A353TBT15_CRT_USER_ID = T000T3_A353TBT15_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A353TBT15_CRT_USER_ID", A353TBT15_CRT_USER_ID);
         n353TBT15_CRT_USER_ID = T000T3_n353TBT15_CRT_USER_ID[0] ;
         A355TBT15_UPD_DATETIME = T000T3_A355TBT15_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A355TBT15_UPD_DATETIME", localUtil.ttoc( A355TBT15_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n355TBT15_UPD_DATETIME = T000T3_n355TBT15_UPD_DATETIME[0] ;
         A356TBT15_UPD_USER_ID = T000T3_A356TBT15_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A356TBT15_UPD_USER_ID", A356TBT15_UPD_USER_ID);
         n356TBT15_UPD_USER_ID = T000T3_n356TBT15_UPD_USER_ID[0] ;
         A358TBT15_UPD_CNT = T000T3_A358TBT15_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A358TBT15_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBT15_UPD_CNT, 10, 0)));
         n358TBT15_UPD_CNT = T000T3_n358TBT15_UPD_CNT[0] ;
         A347TBT15_CRF_ID = T000T3_A347TBT15_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A347TBT15_CRF_ID", GXutil.ltrim( GXutil.str( A347TBT15_CRF_ID, 4, 0)));
         n347TBT15_CRF_ID = T000T3_n347TBT15_CRF_ID[0] ;
         A348TBT15_CRF_VERSION = T000T3_A348TBT15_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A348TBT15_CRF_VERSION", GXutil.ltrim( GXutil.str( A348TBT15_CRF_VERSION, 4, 0)));
         n348TBT15_CRF_VERSION = T000T3_n348TBT15_CRF_VERSION[0] ;
         A932TBT15_CRF_ITEM_GRP_DIV = T000T3_A932TBT15_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A932TBT15_CRF_ITEM_GRP_DIV", A932TBT15_CRF_ITEM_GRP_DIV);
         n932TBT15_CRF_ITEM_GRP_DIV = T000T3_n932TBT15_CRF_ITEM_GRP_DIV[0] ;
         A926TBT15_CRF_ITEM_GRP_CD = T000T3_A926TBT15_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A926TBT15_CRF_ITEM_GRP_CD", A926TBT15_CRF_ITEM_GRP_CD);
         n926TBT15_CRF_ITEM_GRP_CD = T000T3_n926TBT15_CRF_ITEM_GRP_CD[0] ;
         A351TBT15_DEL_FLG = T000T3_A351TBT15_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A351TBT15_DEL_FLG", A351TBT15_DEL_FLG);
         n351TBT15_DEL_FLG = T000T3_n351TBT15_DEL_FLG[0] ;
         A354TBT15_CRT_PROG_NM = T000T3_A354TBT15_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A354TBT15_CRT_PROG_NM", A354TBT15_CRT_PROG_NM);
         n354TBT15_CRT_PROG_NM = T000T3_n354TBT15_CRT_PROG_NM[0] ;
         A357TBT15_UPD_PROG_NM = T000T3_A357TBT15_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A357TBT15_UPD_PROG_NM", A357TBT15_UPD_PROG_NM);
         n357TBT15_UPD_PROG_NM = T000T3_n357TBT15_UPD_PROG_NM[0] ;
         A345TBT15_STUDY_ID = T000T3_A345TBT15_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
         A346TBT15_SUBJECT_ID = T000T3_A346TBT15_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
         A925TBT15_MEMO_NO = T000T3_A925TBT15_MEMO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
         O358TBT15_UPD_CNT = A358TBT15_UPD_CNT ;
         n358TBT15_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A358TBT15_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBT15_UPD_CNT, 10, 0)));
         Z345TBT15_STUDY_ID = A345TBT15_STUDY_ID ;
         Z346TBT15_SUBJECT_ID = A346TBT15_SUBJECT_ID ;
         Z925TBT15_MEMO_NO = A925TBT15_MEMO_NO ;
         sMode28 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0T28( ) ;
         Gx_mode = sMode28 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound28 = (short)(0) ;
         initializeNonKey0T28( ) ;
         sMode28 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode28 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0T28( ) ;
      if ( RcdFound28 == 0 )
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
      RcdFound28 = (short)(0) ;
      /* Using cursor T000T8 */
      pr_default.execute(6, new Object[] {new Long(A345TBT15_STUDY_ID), new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Integer(A346TBT15_SUBJECT_ID), new Long(A345TBT15_STUDY_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000T8_A345TBT15_STUDY_ID[0] < A345TBT15_STUDY_ID ) || ( T000T8_A345TBT15_STUDY_ID[0] == A345TBT15_STUDY_ID ) && ( T000T8_A346TBT15_SUBJECT_ID[0] < A346TBT15_SUBJECT_ID ) || ( T000T8_A346TBT15_SUBJECT_ID[0] == A346TBT15_SUBJECT_ID ) && ( T000T8_A345TBT15_STUDY_ID[0] == A345TBT15_STUDY_ID ) && ( T000T8_A925TBT15_MEMO_NO[0] < A925TBT15_MEMO_NO ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000T8_A345TBT15_STUDY_ID[0] > A345TBT15_STUDY_ID ) || ( T000T8_A345TBT15_STUDY_ID[0] == A345TBT15_STUDY_ID ) && ( T000T8_A346TBT15_SUBJECT_ID[0] > A346TBT15_SUBJECT_ID ) || ( T000T8_A346TBT15_SUBJECT_ID[0] == A346TBT15_SUBJECT_ID ) && ( T000T8_A345TBT15_STUDY_ID[0] == A345TBT15_STUDY_ID ) && ( T000T8_A925TBT15_MEMO_NO[0] > A925TBT15_MEMO_NO ) ) )
         {
            A345TBT15_STUDY_ID = T000T8_A345TBT15_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
            A346TBT15_SUBJECT_ID = T000T8_A346TBT15_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
            A925TBT15_MEMO_NO = T000T8_A925TBT15_MEMO_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
            RcdFound28 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound28 = (short)(0) ;
      /* Using cursor T000T9 */
      pr_default.execute(7, new Object[] {new Long(A345TBT15_STUDY_ID), new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Integer(A346TBT15_SUBJECT_ID), new Long(A345TBT15_STUDY_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000T9_A345TBT15_STUDY_ID[0] > A345TBT15_STUDY_ID ) || ( T000T9_A345TBT15_STUDY_ID[0] == A345TBT15_STUDY_ID ) && ( T000T9_A346TBT15_SUBJECT_ID[0] > A346TBT15_SUBJECT_ID ) || ( T000T9_A346TBT15_SUBJECT_ID[0] == A346TBT15_SUBJECT_ID ) && ( T000T9_A345TBT15_STUDY_ID[0] == A345TBT15_STUDY_ID ) && ( T000T9_A925TBT15_MEMO_NO[0] > A925TBT15_MEMO_NO ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000T9_A345TBT15_STUDY_ID[0] < A345TBT15_STUDY_ID ) || ( T000T9_A345TBT15_STUDY_ID[0] == A345TBT15_STUDY_ID ) && ( T000T9_A346TBT15_SUBJECT_ID[0] < A346TBT15_SUBJECT_ID ) || ( T000T9_A346TBT15_SUBJECT_ID[0] == A346TBT15_SUBJECT_ID ) && ( T000T9_A345TBT15_STUDY_ID[0] == A345TBT15_STUDY_ID ) && ( T000T9_A925TBT15_MEMO_NO[0] < A925TBT15_MEMO_NO ) ) )
         {
            A345TBT15_STUDY_ID = T000T9_A345TBT15_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
            A346TBT15_SUBJECT_ID = T000T9_A346TBT15_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
            A925TBT15_MEMO_NO = T000T9_A925TBT15_MEMO_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
            RcdFound28 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0T28( ) ;
      if ( RcdFound28 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBT15_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A345TBT15_STUDY_ID != Z345TBT15_STUDY_ID ) || ( A346TBT15_SUBJECT_ID != Z346TBT15_SUBJECT_ID ) || ( A925TBT15_MEMO_NO != Z925TBT15_MEMO_NO ) )
         {
            A345TBT15_STUDY_ID = Z345TBT15_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
            A346TBT15_SUBJECT_ID = Z346TBT15_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
            A925TBT15_MEMO_NO = Z925TBT15_MEMO_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBT15_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update0T28( ) ;
            GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A345TBT15_STUDY_ID != Z345TBT15_STUDY_ID ) || ( A346TBT15_SUBJECT_ID != Z346TBT15_SUBJECT_ID ) || ( A925TBT15_MEMO_NO != Z925TBT15_MEMO_NO ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0T28( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBT15_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0T28( ) ;
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
      if ( ( A345TBT15_STUDY_ID != Z345TBT15_STUDY_ID ) || ( A346TBT15_SUBJECT_ID != Z346TBT15_SUBJECT_ID ) || ( A925TBT15_MEMO_NO != Z925TBT15_MEMO_NO ) )
      {
         A345TBT15_STUDY_ID = Z345TBT15_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
         A346TBT15_SUBJECT_ID = Z346TBT15_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
         A925TBT15_MEMO_NO = Z925TBT15_MEMO_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBT15_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
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
      if ( RcdFound28 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT15_STUDY_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBT15_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0T28( ) ;
      if ( RcdFound28 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT15_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0T28( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound28 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT15_CRF_ID_Internalname ;
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
      if ( RcdFound28 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT15_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0T28( ) ;
      if ( RcdFound28 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound28 != 0 )
         {
            scanNext0T28( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT15_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0T28( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0T28( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000T2 */
         pr_default.execute(0, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT15_CRF_MEMO_LOC"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z352TBT15_CRT_DATETIME.equals( T000T2_A352TBT15_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z353TBT15_CRT_USER_ID, T000T2_A353TBT15_CRT_USER_ID[0]) != 0 ) || !( Z355TBT15_UPD_DATETIME.equals( T000T2_A355TBT15_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z356TBT15_UPD_USER_ID, T000T2_A356TBT15_UPD_USER_ID[0]) != 0 ) || ( Z358TBT15_UPD_CNT != T000T2_A358TBT15_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z347TBT15_CRF_ID != T000T2_A347TBT15_CRF_ID[0] ) || ( Z348TBT15_CRF_VERSION != T000T2_A348TBT15_CRF_VERSION[0] ) || ( GXutil.strcmp(Z932TBT15_CRF_ITEM_GRP_DIV, T000T2_A932TBT15_CRF_ITEM_GRP_DIV[0]) != 0 ) || ( GXutil.strcmp(Z926TBT15_CRF_ITEM_GRP_CD, T000T2_A926TBT15_CRF_ITEM_GRP_CD[0]) != 0 ) || ( GXutil.strcmp(Z351TBT15_DEL_FLG, T000T2_A351TBT15_DEL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z354TBT15_CRT_PROG_NM, T000T2_A354TBT15_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z357TBT15_UPD_PROG_NM, T000T2_A357TBT15_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT15_CRF_MEMO_LOC"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0T28( )
   {
      beforeValidate0T28( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0T28( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0T28( 0) ;
         checkOptimisticConcurrency0T28( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0T28( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0T28( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000T10 */
                  pr_default.execute(8, new Object[] {new Boolean(n352TBT15_CRT_DATETIME), A352TBT15_CRT_DATETIME, new Boolean(n353TBT15_CRT_USER_ID), A353TBT15_CRT_USER_ID, new Boolean(n355TBT15_UPD_DATETIME), A355TBT15_UPD_DATETIME, new Boolean(n356TBT15_UPD_USER_ID), A356TBT15_UPD_USER_ID, new Boolean(n358TBT15_UPD_CNT), new Long(A358TBT15_UPD_CNT), new Boolean(n347TBT15_CRF_ID), new Short(A347TBT15_CRF_ID), new Boolean(n348TBT15_CRF_VERSION), new Short(A348TBT15_CRF_VERSION), new Boolean(n932TBT15_CRF_ITEM_GRP_DIV), A932TBT15_CRF_ITEM_GRP_DIV, new Boolean(n926TBT15_CRF_ITEM_GRP_CD), A926TBT15_CRF_ITEM_GRP_CD, new Boolean(n351TBT15_DEL_FLG), A351TBT15_DEL_FLG, new Boolean(n354TBT15_CRT_PROG_NM), A354TBT15_CRT_PROG_NM, new Boolean(n357TBT15_UPD_PROG_NM), A357TBT15_UPD_PROG_NM, new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
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
                        resetCaption0T0( ) ;
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
            load0T28( ) ;
         }
         endLevel0T28( ) ;
      }
      closeExtendedTableCursors0T28( ) ;
   }

   public void update0T28( )
   {
      beforeValidate0T28( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0T28( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0T28( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0T28( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0T28( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000T11 */
                  pr_default.execute(9, new Object[] {new Boolean(n352TBT15_CRT_DATETIME), A352TBT15_CRT_DATETIME, new Boolean(n353TBT15_CRT_USER_ID), A353TBT15_CRT_USER_ID, new Boolean(n355TBT15_UPD_DATETIME), A355TBT15_UPD_DATETIME, new Boolean(n356TBT15_UPD_USER_ID), A356TBT15_UPD_USER_ID, new Boolean(n358TBT15_UPD_CNT), new Long(A358TBT15_UPD_CNT), new Boolean(n347TBT15_CRF_ID), new Short(A347TBT15_CRF_ID), new Boolean(n348TBT15_CRF_VERSION), new Short(A348TBT15_CRF_VERSION), new Boolean(n932TBT15_CRF_ITEM_GRP_DIV), A932TBT15_CRF_ITEM_GRP_DIV, new Boolean(n926TBT15_CRF_ITEM_GRP_CD), A926TBT15_CRF_ITEM_GRP_CD, new Boolean(n351TBT15_DEL_FLG), A351TBT15_DEL_FLG, new Boolean(n354TBT15_CRT_PROG_NM), A354TBT15_CRT_PROG_NM, new Boolean(n357TBT15_UPD_PROG_NM), A357TBT15_UPD_PROG_NM, new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT15_CRF_MEMO_LOC"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0T28( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption0T0( ) ;
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
         endLevel0T28( ) ;
      }
      closeExtendedTableCursors0T28( ) ;
   }

   public void deferredUpdate0T28( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0T28( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0T28( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0T28( ) ;
         afterConfirm0T28( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0T28( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000T12 */
               pr_default.execute(10, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound28 == 0 )
                     {
                        initAll0T28( ) ;
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
                     resetCaption0T0( ) ;
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
      sMode28 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0T28( ) ;
      Gx_mode = sMode28 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0T28( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT15_CRF_MEMO_LOC" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0T28( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0T28( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbt15_crf_memo_loc");
         if ( AnyError == 0 )
         {
            confirmValues0T0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbt15_crf_memo_loc");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0T28( )
   {
      /* Using cursor T000T13 */
      pr_default.execute(11);
      RcdFound28 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound28 = (short)(1) ;
         A345TBT15_STUDY_ID = T000T13_A345TBT15_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
         A346TBT15_SUBJECT_ID = T000T13_A346TBT15_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
         A925TBT15_MEMO_NO = T000T13_A925TBT15_MEMO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0T28( )
   {
      pr_default.readNext(11);
      RcdFound28 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound28 = (short)(1) ;
         A345TBT15_STUDY_ID = T000T13_A345TBT15_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
         A346TBT15_SUBJECT_ID = T000T13_A346TBT15_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
         A925TBT15_MEMO_NO = T000T13_A925TBT15_MEMO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
      }
   }

   public void scanEnd0T28( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0T28( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0T28( )
   {
      /* Before Insert Rules */
      A352TBT15_CRT_DATETIME = GXutil.now( ) ;
      n352TBT15_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A352TBT15_CRT_DATETIME", localUtil.ttoc( A352TBT15_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A353TBT15_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt15_crf_memo_loc_impl.this.GXt_char3 = GXv_char4[0] ;
      A353TBT15_CRT_USER_ID = GXt_char3 ;
      n353TBT15_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A353TBT15_CRT_USER_ID", A353TBT15_CRT_USER_ID);
      A355TBT15_UPD_DATETIME = GXutil.now( ) ;
      n355TBT15_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A355TBT15_UPD_DATETIME", localUtil.ttoc( A355TBT15_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A356TBT15_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt15_crf_memo_loc_impl.this.GXt_char3 = GXv_char4[0] ;
      A356TBT15_UPD_USER_ID = GXt_char3 ;
      n356TBT15_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A356TBT15_UPD_USER_ID", A356TBT15_UPD_USER_ID);
      A358TBT15_UPD_CNT = (long)(O358TBT15_UPD_CNT+1) ;
      n358TBT15_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A358TBT15_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBT15_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0T28( )
   {
      /* Before Update Rules */
      A355TBT15_UPD_DATETIME = GXutil.now( ) ;
      n355TBT15_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A355TBT15_UPD_DATETIME", localUtil.ttoc( A355TBT15_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A356TBT15_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt15_crf_memo_loc_impl.this.GXt_char3 = GXv_char4[0] ;
      A356TBT15_UPD_USER_ID = GXt_char3 ;
      n356TBT15_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A356TBT15_UPD_USER_ID", A356TBT15_UPD_USER_ID);
      A358TBT15_UPD_CNT = (long)(O358TBT15_UPD_CNT+1) ;
      n358TBT15_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A358TBT15_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBT15_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0T28( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0T28( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0T28( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0T28( )
   {
      edtTBT15_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_STUDY_ID_Enabled, 5, 0)));
      edtTBT15_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_SUBJECT_ID_Enabled, 5, 0)));
      edtTBT15_MEMO_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_MEMO_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_MEMO_NO_Enabled, 5, 0)));
      edtTBT15_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_CRF_ID_Enabled, 5, 0)));
      edtTBT15_CRF_VERSION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_CRF_VERSION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_CRF_VERSION_Enabled, 5, 0)));
      edtTBT15_CRF_ITEM_GRP_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_CRF_ITEM_GRP_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_CRF_ITEM_GRP_DIV_Enabled, 5, 0)));
      edtTBT15_CRF_ITEM_GRP_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_CRF_ITEM_GRP_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_CRF_ITEM_GRP_CD_Enabled, 5, 0)));
      edtTBT15_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_DEL_FLG_Enabled, 5, 0)));
      edtTBT15_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_CRT_DATETIME_Enabled, 5, 0)));
      edtTBT15_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_CRT_USER_ID_Enabled, 5, 0)));
      edtTBT15_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBT15_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_UPD_DATETIME_Enabled, 5, 0)));
      edtTBT15_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_UPD_USER_ID_Enabled, 5, 0)));
      edtTBT15_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBT15_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT15_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT15_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0T0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRFメモ位置テーブル") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbt15_crf_memo_loc") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0T28( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z345TBT15_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z345TBT15_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z346TBT15_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z346TBT15_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z925TBT15_MEMO_NO", GXutil.ltrim( localUtil.ntoc( Z925TBT15_MEMO_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z352TBT15_CRT_DATETIME", localUtil.ttoc( Z352TBT15_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z353TBT15_CRT_USER_ID", GXutil.rtrim( Z353TBT15_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z355TBT15_UPD_DATETIME", localUtil.ttoc( Z355TBT15_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z356TBT15_UPD_USER_ID", GXutil.rtrim( Z356TBT15_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z358TBT15_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z358TBT15_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z347TBT15_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z347TBT15_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z348TBT15_CRF_VERSION", GXutil.ltrim( localUtil.ntoc( Z348TBT15_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z932TBT15_CRF_ITEM_GRP_DIV", GXutil.rtrim( Z932TBT15_CRF_ITEM_GRP_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z926TBT15_CRF_ITEM_GRP_CD", GXutil.rtrim( Z926TBT15_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z351TBT15_DEL_FLG", GXutil.rtrim( Z351TBT15_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z354TBT15_CRT_PROG_NM", GXutil.rtrim( Z354TBT15_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z357TBT15_UPD_PROG_NM", GXutil.rtrim( Z357TBT15_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O358TBT15_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O358TBT15_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0T28( )
   {
      A352TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n352TBT15_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A352TBT15_CRT_DATETIME", localUtil.ttoc( A352TBT15_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n352TBT15_CRT_DATETIME = (GXutil.nullDate().equals(A352TBT15_CRT_DATETIME) ? true : false) ;
      A353TBT15_CRT_USER_ID = "" ;
      n353TBT15_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A353TBT15_CRT_USER_ID", A353TBT15_CRT_USER_ID);
      n353TBT15_CRT_USER_ID = ((GXutil.strcmp("", A353TBT15_CRT_USER_ID)==0) ? true : false) ;
      A355TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n355TBT15_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A355TBT15_UPD_DATETIME", localUtil.ttoc( A355TBT15_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n355TBT15_UPD_DATETIME = (GXutil.nullDate().equals(A355TBT15_UPD_DATETIME) ? true : false) ;
      A356TBT15_UPD_USER_ID = "" ;
      n356TBT15_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A356TBT15_UPD_USER_ID", A356TBT15_UPD_USER_ID);
      n356TBT15_UPD_USER_ID = ((GXutil.strcmp("", A356TBT15_UPD_USER_ID)==0) ? true : false) ;
      A358TBT15_UPD_CNT = 0 ;
      n358TBT15_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A358TBT15_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBT15_UPD_CNT, 10, 0)));
      n358TBT15_UPD_CNT = ((0==A358TBT15_UPD_CNT) ? true : false) ;
      A347TBT15_CRF_ID = (short)(0) ;
      n347TBT15_CRF_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A347TBT15_CRF_ID", GXutil.ltrim( GXutil.str( A347TBT15_CRF_ID, 4, 0)));
      n347TBT15_CRF_ID = ((0==A347TBT15_CRF_ID) ? true : false) ;
      A348TBT15_CRF_VERSION = (short)(0) ;
      n348TBT15_CRF_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A348TBT15_CRF_VERSION", GXutil.ltrim( GXutil.str( A348TBT15_CRF_VERSION, 4, 0)));
      n348TBT15_CRF_VERSION = ((0==A348TBT15_CRF_VERSION) ? true : false) ;
      A932TBT15_CRF_ITEM_GRP_DIV = "" ;
      n932TBT15_CRF_ITEM_GRP_DIV = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A932TBT15_CRF_ITEM_GRP_DIV", A932TBT15_CRF_ITEM_GRP_DIV);
      n932TBT15_CRF_ITEM_GRP_DIV = ((GXutil.strcmp("", A932TBT15_CRF_ITEM_GRP_DIV)==0) ? true : false) ;
      A926TBT15_CRF_ITEM_GRP_CD = "" ;
      n926TBT15_CRF_ITEM_GRP_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A926TBT15_CRF_ITEM_GRP_CD", A926TBT15_CRF_ITEM_GRP_CD);
      n926TBT15_CRF_ITEM_GRP_CD = ((GXutil.strcmp("", A926TBT15_CRF_ITEM_GRP_CD)==0) ? true : false) ;
      A351TBT15_DEL_FLG = "" ;
      n351TBT15_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A351TBT15_DEL_FLG", A351TBT15_DEL_FLG);
      n351TBT15_DEL_FLG = ((GXutil.strcmp("", A351TBT15_DEL_FLG)==0) ? true : false) ;
      A354TBT15_CRT_PROG_NM = "" ;
      n354TBT15_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A354TBT15_CRT_PROG_NM", A354TBT15_CRT_PROG_NM);
      n354TBT15_CRT_PROG_NM = ((GXutil.strcmp("", A354TBT15_CRT_PROG_NM)==0) ? true : false) ;
      A357TBT15_UPD_PROG_NM = "" ;
      n357TBT15_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A357TBT15_UPD_PROG_NM", A357TBT15_UPD_PROG_NM);
      n357TBT15_UPD_PROG_NM = ((GXutil.strcmp("", A357TBT15_UPD_PROG_NM)==0) ? true : false) ;
      O358TBT15_UPD_CNT = A358TBT15_UPD_CNT ;
      n358TBT15_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A358TBT15_UPD_CNT", GXutil.ltrim( GXutil.str( A358TBT15_UPD_CNT, 10, 0)));
   }

   public void initAll0T28( )
   {
      A345TBT15_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A345TBT15_STUDY_ID", GXutil.ltrim( GXutil.str( A345TBT15_STUDY_ID, 10, 0)));
      A346TBT15_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A346TBT15_SUBJECT_ID", GXutil.ltrim( GXutil.str( A346TBT15_SUBJECT_ID, 6, 0)));
      A925TBT15_MEMO_NO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A925TBT15_MEMO_NO", GXutil.ltrim( GXutil.str( A925TBT15_MEMO_NO, 3, 0)));
      initializeNonKey0T28( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14554432");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbt15_crf_memo_loc.js", "?14554434");
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
      lblTextblocktbt15_study_id_Internalname = "TEXTBLOCKTBT15_STUDY_ID" ;
      edtTBT15_STUDY_ID_Internalname = "TBT15_STUDY_ID" ;
      lblTextblocktbt15_subject_id_Internalname = "TEXTBLOCKTBT15_SUBJECT_ID" ;
      edtTBT15_SUBJECT_ID_Internalname = "TBT15_SUBJECT_ID" ;
      lblTextblocktbt15_memo_no_Internalname = "TEXTBLOCKTBT15_MEMO_NO" ;
      edtTBT15_MEMO_NO_Internalname = "TBT15_MEMO_NO" ;
      lblTextblocktbt15_crf_id_Internalname = "TEXTBLOCKTBT15_CRF_ID" ;
      edtTBT15_CRF_ID_Internalname = "TBT15_CRF_ID" ;
      lblTextblocktbt15_crf_version_Internalname = "TEXTBLOCKTBT15_CRF_VERSION" ;
      edtTBT15_CRF_VERSION_Internalname = "TBT15_CRF_VERSION" ;
      lblTextblocktbt15_crf_item_grp_div_Internalname = "TEXTBLOCKTBT15_CRF_ITEM_GRP_DIV" ;
      edtTBT15_CRF_ITEM_GRP_DIV_Internalname = "TBT15_CRF_ITEM_GRP_DIV" ;
      lblTextblocktbt15_crf_item_grp_cd_Internalname = "TEXTBLOCKTBT15_CRF_ITEM_GRP_CD" ;
      edtTBT15_CRF_ITEM_GRP_CD_Internalname = "TBT15_CRF_ITEM_GRP_CD" ;
      lblTextblocktbt15_del_flg_Internalname = "TEXTBLOCKTBT15_DEL_FLG" ;
      edtTBT15_DEL_FLG_Internalname = "TBT15_DEL_FLG" ;
      lblTextblocktbt15_crt_datetime_Internalname = "TEXTBLOCKTBT15_CRT_DATETIME" ;
      edtTBT15_CRT_DATETIME_Internalname = "TBT15_CRT_DATETIME" ;
      lblTextblocktbt15_crt_user_id_Internalname = "TEXTBLOCKTBT15_CRT_USER_ID" ;
      edtTBT15_CRT_USER_ID_Internalname = "TBT15_CRT_USER_ID" ;
      lblTextblocktbt15_crt_prog_nm_Internalname = "TEXTBLOCKTBT15_CRT_PROG_NM" ;
      edtTBT15_CRT_PROG_NM_Internalname = "TBT15_CRT_PROG_NM" ;
      lblTextblocktbt15_upd_datetime_Internalname = "TEXTBLOCKTBT15_UPD_DATETIME" ;
      edtTBT15_UPD_DATETIME_Internalname = "TBT15_UPD_DATETIME" ;
      lblTextblocktbt15_upd_user_id_Internalname = "TEXTBLOCKTBT15_UPD_USER_ID" ;
      edtTBT15_UPD_USER_ID_Internalname = "TBT15_UPD_USER_ID" ;
      lblTextblocktbt15_upd_prog_nm_Internalname = "TEXTBLOCKTBT15_UPD_PROG_NM" ;
      edtTBT15_UPD_PROG_NM_Internalname = "TBT15_UPD_PROG_NM" ;
      lblTextblocktbt15_upd_cnt_Internalname = "TEXTBLOCKTBT15_UPD_CNT" ;
      edtTBT15_UPD_CNT_Internalname = "TBT15_UPD_CNT" ;
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
      edtTBT15_UPD_CNT_Jsonclick = "" ;
      edtTBT15_UPD_CNT_Enabled = 1 ;
      edtTBT15_UPD_PROG_NM_Jsonclick = "" ;
      edtTBT15_UPD_PROG_NM_Enabled = 1 ;
      edtTBT15_UPD_USER_ID_Jsonclick = "" ;
      edtTBT15_UPD_USER_ID_Enabled = 1 ;
      edtTBT15_UPD_DATETIME_Jsonclick = "" ;
      edtTBT15_UPD_DATETIME_Enabled = 1 ;
      edtTBT15_CRT_PROG_NM_Jsonclick = "" ;
      edtTBT15_CRT_PROG_NM_Enabled = 1 ;
      edtTBT15_CRT_USER_ID_Jsonclick = "" ;
      edtTBT15_CRT_USER_ID_Enabled = 1 ;
      edtTBT15_CRT_DATETIME_Jsonclick = "" ;
      edtTBT15_CRT_DATETIME_Enabled = 1 ;
      edtTBT15_DEL_FLG_Jsonclick = "" ;
      edtTBT15_DEL_FLG_Enabled = 1 ;
      edtTBT15_CRF_ITEM_GRP_CD_Jsonclick = "" ;
      edtTBT15_CRF_ITEM_GRP_CD_Enabled = 1 ;
      edtTBT15_CRF_ITEM_GRP_DIV_Jsonclick = "" ;
      edtTBT15_CRF_ITEM_GRP_DIV_Enabled = 1 ;
      edtTBT15_CRF_VERSION_Jsonclick = "" ;
      edtTBT15_CRF_VERSION_Enabled = 1 ;
      edtTBT15_CRF_ID_Jsonclick = "" ;
      edtTBT15_CRF_ID_Enabled = 1 ;
      edtTBT15_MEMO_NO_Jsonclick = "" ;
      edtTBT15_MEMO_NO_Enabled = 1 ;
      edtTBT15_SUBJECT_ID_Jsonclick = "" ;
      edtTBT15_SUBJECT_ID_Enabled = 1 ;
      edtTBT15_STUDY_ID_Jsonclick = "" ;
      edtTBT15_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbt15_crt_user_id0T28( String Gx_mode )
   {
      GXt_char3 = A353TBT15_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt15_crf_memo_loc_impl.this.GXt_char3 = GXv_char4[0] ;
      A353TBT15_CRT_USER_ID = GXt_char3 ;
      n353TBT15_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A353TBT15_CRT_USER_ID", A353TBT15_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A353TBT15_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbt15_upd_user_id0T28( String Gx_mode )
   {
      GXt_char3 = A356TBT15_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt15_crf_memo_loc_impl.this.GXt_char3 = GXv_char4[0] ;
      A356TBT15_UPD_USER_ID = GXt_char3 ;
      n356TBT15_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A356TBT15_UPD_USER_ID", A356TBT15_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A356TBT15_UPD_USER_ID))+"\"");
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
      /* Using cursor T000T14 */
      pr_default.execute(12, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         AnyError345 = 1 ;
         AnyError346 = 1 ;
         AnyError925 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFメモ位置テーブル・CRFメモサブタイプ'", "ForeignKeyNotFound", 1, "TBT15_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError345 == 0 ) && ( AnyError346 == 0 ) && ( AnyError925 == 0 ) )
      {
      }
      pr_default.close(12);
      GX_FocusControl = edtTBT15_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbt15_memo_no( long GX_Parm1 ,
                                    int GX_Parm2 ,
                                    short GX_Parm3 ,
                                    java.util.Date GX_Parm4 ,
                                    String GX_Parm5 ,
                                    java.util.Date GX_Parm6 ,
                                    String GX_Parm7 ,
                                    long GX_Parm8 ,
                                    short GX_Parm9 ,
                                    short GX_Parm10 ,
                                    String GX_Parm11 ,
                                    String GX_Parm12 ,
                                    String GX_Parm13 ,
                                    String GX_Parm14 ,
                                    String GX_Parm15 )
   {
      A345TBT15_STUDY_ID = GX_Parm1 ;
      A346TBT15_SUBJECT_ID = GX_Parm2 ;
      A925TBT15_MEMO_NO = GX_Parm3 ;
      A352TBT15_CRT_DATETIME = GX_Parm4 ;
      n352TBT15_CRT_DATETIME = false ;
      A353TBT15_CRT_USER_ID = GX_Parm5 ;
      n353TBT15_CRT_USER_ID = false ;
      A355TBT15_UPD_DATETIME = GX_Parm6 ;
      n355TBT15_UPD_DATETIME = false ;
      A356TBT15_UPD_USER_ID = GX_Parm7 ;
      n356TBT15_UPD_USER_ID = false ;
      A358TBT15_UPD_CNT = GX_Parm8 ;
      n358TBT15_UPD_CNT = false ;
      A347TBT15_CRF_ID = GX_Parm9 ;
      n347TBT15_CRF_ID = false ;
      A348TBT15_CRF_VERSION = GX_Parm10 ;
      n348TBT15_CRF_VERSION = false ;
      A932TBT15_CRF_ITEM_GRP_DIV = GX_Parm11 ;
      n932TBT15_CRF_ITEM_GRP_DIV = false ;
      A926TBT15_CRF_ITEM_GRP_CD = GX_Parm12 ;
      n926TBT15_CRF_ITEM_GRP_CD = false ;
      A351TBT15_DEL_FLG = GX_Parm13 ;
      n351TBT15_DEL_FLG = false ;
      A354TBT15_CRT_PROG_NM = GX_Parm14 ;
      n354TBT15_CRT_PROG_NM = false ;
      A357TBT15_UPD_PROG_NM = GX_Parm15 ;
      n357TBT15_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      /* Using cursor T000T14 */
      pr_default.execute(12, new Object[] {new Long(A345TBT15_STUDY_ID), new Integer(A346TBT15_SUBJECT_ID), new Short(A925TBT15_MEMO_NO)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         AnyError345 = 1 ;
         AnyError346 = 1 ;
         AnyError925 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFメモ位置テーブル・CRFメモサブタイプ'", "ForeignKeyNotFound", 1, "TBT15_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT15_STUDY_ID_Internalname ;
      }
      if ( ( AnyError345 == 0 ) && ( AnyError346 == 0 ) && ( AnyError925 == 0 ) )
      {
      }
      pr_default.close(12);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A352TBT15_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A353TBT15_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A355TBT15_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A356TBT15_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A358TBT15_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A347TBT15_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A348TBT15_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A932TBT15_CRF_ITEM_GRP_DIV));
      isValidOutput.add(GXutil.rtrim( A926TBT15_CRF_ITEM_GRP_CD));
      isValidOutput.add(GXutil.rtrim( A351TBT15_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A354TBT15_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A357TBT15_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z345TBT15_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z346TBT15_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z925TBT15_MEMO_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z352TBT15_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z353TBT15_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z355TBT15_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z356TBT15_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z358TBT15_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z347TBT15_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z348TBT15_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z932TBT15_CRF_ITEM_GRP_DIV));
      isValidOutput.add(GXutil.rtrim( Z926TBT15_CRF_ITEM_GRP_CD));
      isValidOutput.add(GXutil.rtrim( Z351TBT15_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z354TBT15_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z357TBT15_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O358TBT15_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1170 */
                  S1170 ();
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
      lblTextblocktbt15_study_id_Jsonclick = "" ;
      lblTextblocktbt15_subject_id_Jsonclick = "" ;
      lblTextblocktbt15_memo_no_Jsonclick = "" ;
      lblTextblocktbt15_crf_id_Jsonclick = "" ;
      lblTextblocktbt15_crf_version_Jsonclick = "" ;
      lblTextblocktbt15_crf_item_grp_div_Jsonclick = "" ;
      A932TBT15_CRF_ITEM_GRP_DIV = "" ;
      lblTextblocktbt15_crf_item_grp_cd_Jsonclick = "" ;
      A926TBT15_CRF_ITEM_GRP_CD = "" ;
      lblTextblocktbt15_del_flg_Jsonclick = "" ;
      A351TBT15_DEL_FLG = "" ;
      lblTextblocktbt15_crt_datetime_Jsonclick = "" ;
      A352TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt15_crt_user_id_Jsonclick = "" ;
      A353TBT15_CRT_USER_ID = "" ;
      lblTextblocktbt15_crt_prog_nm_Jsonclick = "" ;
      A354TBT15_CRT_PROG_NM = "" ;
      lblTextblocktbt15_upd_datetime_Jsonclick = "" ;
      A355TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt15_upd_user_id_Jsonclick = "" ;
      A356TBT15_UPD_USER_ID = "" ;
      lblTextblocktbt15_upd_prog_nm_Jsonclick = "" ;
      A357TBT15_UPD_PROG_NM = "" ;
      lblTextblocktbt15_upd_cnt_Jsonclick = "" ;
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
      Z352TBT15_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z353TBT15_CRT_USER_ID = "" ;
      Z355TBT15_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z356TBT15_UPD_USER_ID = "" ;
      Z932TBT15_CRF_ITEM_GRP_DIV = "" ;
      Z926TBT15_CRF_ITEM_GRP_CD = "" ;
      Z351TBT15_DEL_FLG = "" ;
      Z354TBT15_CRT_PROG_NM = "" ;
      Z357TBT15_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T000T5_A352TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000T5_n352TBT15_CRT_DATETIME = new boolean[] {false} ;
      T000T5_A353TBT15_CRT_USER_ID = new String[] {""} ;
      T000T5_n353TBT15_CRT_USER_ID = new boolean[] {false} ;
      T000T5_A355TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000T5_n355TBT15_UPD_DATETIME = new boolean[] {false} ;
      T000T5_A356TBT15_UPD_USER_ID = new String[] {""} ;
      T000T5_n356TBT15_UPD_USER_ID = new boolean[] {false} ;
      T000T5_A358TBT15_UPD_CNT = new long[1] ;
      T000T5_n358TBT15_UPD_CNT = new boolean[] {false} ;
      T000T5_A347TBT15_CRF_ID = new short[1] ;
      T000T5_n347TBT15_CRF_ID = new boolean[] {false} ;
      T000T5_A348TBT15_CRF_VERSION = new short[1] ;
      T000T5_n348TBT15_CRF_VERSION = new boolean[] {false} ;
      T000T5_A932TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000T5_n932TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      T000T5_A926TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000T5_n926TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      T000T5_A351TBT15_DEL_FLG = new String[] {""} ;
      T000T5_n351TBT15_DEL_FLG = new boolean[] {false} ;
      T000T5_A354TBT15_CRT_PROG_NM = new String[] {""} ;
      T000T5_n354TBT15_CRT_PROG_NM = new boolean[] {false} ;
      T000T5_A357TBT15_UPD_PROG_NM = new String[] {""} ;
      T000T5_n357TBT15_UPD_PROG_NM = new boolean[] {false} ;
      T000T5_A345TBT15_STUDY_ID = new long[1] ;
      T000T5_A346TBT15_SUBJECT_ID = new int[1] ;
      T000T5_A925TBT15_MEMO_NO = new short[1] ;
      T000T4_A345TBT15_STUDY_ID = new long[1] ;
      T000T6_A345TBT15_STUDY_ID = new long[1] ;
      T000T7_A345TBT15_STUDY_ID = new long[1] ;
      T000T7_A346TBT15_SUBJECT_ID = new int[1] ;
      T000T7_A925TBT15_MEMO_NO = new short[1] ;
      T000T3_A352TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000T3_n352TBT15_CRT_DATETIME = new boolean[] {false} ;
      T000T3_A353TBT15_CRT_USER_ID = new String[] {""} ;
      T000T3_n353TBT15_CRT_USER_ID = new boolean[] {false} ;
      T000T3_A355TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000T3_n355TBT15_UPD_DATETIME = new boolean[] {false} ;
      T000T3_A356TBT15_UPD_USER_ID = new String[] {""} ;
      T000T3_n356TBT15_UPD_USER_ID = new boolean[] {false} ;
      T000T3_A358TBT15_UPD_CNT = new long[1] ;
      T000T3_n358TBT15_UPD_CNT = new boolean[] {false} ;
      T000T3_A347TBT15_CRF_ID = new short[1] ;
      T000T3_n347TBT15_CRF_ID = new boolean[] {false} ;
      T000T3_A348TBT15_CRF_VERSION = new short[1] ;
      T000T3_n348TBT15_CRF_VERSION = new boolean[] {false} ;
      T000T3_A932TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000T3_n932TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      T000T3_A926TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000T3_n926TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      T000T3_A351TBT15_DEL_FLG = new String[] {""} ;
      T000T3_n351TBT15_DEL_FLG = new boolean[] {false} ;
      T000T3_A354TBT15_CRT_PROG_NM = new String[] {""} ;
      T000T3_n354TBT15_CRT_PROG_NM = new boolean[] {false} ;
      T000T3_A357TBT15_UPD_PROG_NM = new String[] {""} ;
      T000T3_n357TBT15_UPD_PROG_NM = new boolean[] {false} ;
      T000T3_A345TBT15_STUDY_ID = new long[1] ;
      T000T3_A346TBT15_SUBJECT_ID = new int[1] ;
      T000T3_A925TBT15_MEMO_NO = new short[1] ;
      sMode28 = "" ;
      T000T8_A345TBT15_STUDY_ID = new long[1] ;
      T000T8_A346TBT15_SUBJECT_ID = new int[1] ;
      T000T8_A925TBT15_MEMO_NO = new short[1] ;
      T000T9_A345TBT15_STUDY_ID = new long[1] ;
      T000T9_A346TBT15_SUBJECT_ID = new int[1] ;
      T000T9_A925TBT15_MEMO_NO = new short[1] ;
      T000T2_A352TBT15_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000T2_n352TBT15_CRT_DATETIME = new boolean[] {false} ;
      T000T2_A353TBT15_CRT_USER_ID = new String[] {""} ;
      T000T2_n353TBT15_CRT_USER_ID = new boolean[] {false} ;
      T000T2_A355TBT15_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000T2_n355TBT15_UPD_DATETIME = new boolean[] {false} ;
      T000T2_A356TBT15_UPD_USER_ID = new String[] {""} ;
      T000T2_n356TBT15_UPD_USER_ID = new boolean[] {false} ;
      T000T2_A358TBT15_UPD_CNT = new long[1] ;
      T000T2_n358TBT15_UPD_CNT = new boolean[] {false} ;
      T000T2_A347TBT15_CRF_ID = new short[1] ;
      T000T2_n347TBT15_CRF_ID = new boolean[] {false} ;
      T000T2_A348TBT15_CRF_VERSION = new short[1] ;
      T000T2_n348TBT15_CRF_VERSION = new boolean[] {false} ;
      T000T2_A932TBT15_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000T2_n932TBT15_CRF_ITEM_GRP_DIV = new boolean[] {false} ;
      T000T2_A926TBT15_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000T2_n926TBT15_CRF_ITEM_GRP_CD = new boolean[] {false} ;
      T000T2_A351TBT15_DEL_FLG = new String[] {""} ;
      T000T2_n351TBT15_DEL_FLG = new boolean[] {false} ;
      T000T2_A354TBT15_CRT_PROG_NM = new String[] {""} ;
      T000T2_n354TBT15_CRT_PROG_NM = new boolean[] {false} ;
      T000T2_A357TBT15_UPD_PROG_NM = new String[] {""} ;
      T000T2_n357TBT15_UPD_PROG_NM = new boolean[] {false} ;
      T000T2_A345TBT15_STUDY_ID = new long[1] ;
      T000T2_A346TBT15_SUBJECT_ID = new int[1] ;
      T000T2_A925TBT15_MEMO_NO = new short[1] ;
      T000T13_A345TBT15_STUDY_ID = new long[1] ;
      T000T13_A346TBT15_SUBJECT_ID = new int[1] ;
      T000T13_A925TBT15_MEMO_NO = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      T000T14_A345TBT15_STUDY_ID = new long[1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt15_crf_memo_loc__default(),
         new Object[] {
             new Object[] {
            T000T2_A352TBT15_CRT_DATETIME, T000T2_n352TBT15_CRT_DATETIME, T000T2_A353TBT15_CRT_USER_ID, T000T2_n353TBT15_CRT_USER_ID, T000T2_A355TBT15_UPD_DATETIME, T000T2_n355TBT15_UPD_DATETIME, T000T2_A356TBT15_UPD_USER_ID, T000T2_n356TBT15_UPD_USER_ID, T000T2_A358TBT15_UPD_CNT, T000T2_n358TBT15_UPD_CNT,
            T000T2_A347TBT15_CRF_ID, T000T2_n347TBT15_CRF_ID, T000T2_A348TBT15_CRF_VERSION, T000T2_n348TBT15_CRF_VERSION, T000T2_A932TBT15_CRF_ITEM_GRP_DIV, T000T2_n932TBT15_CRF_ITEM_GRP_DIV, T000T2_A926TBT15_CRF_ITEM_GRP_CD, T000T2_n926TBT15_CRF_ITEM_GRP_CD, T000T2_A351TBT15_DEL_FLG, T000T2_n351TBT15_DEL_FLG,
            T000T2_A354TBT15_CRT_PROG_NM, T000T2_n354TBT15_CRT_PROG_NM, T000T2_A357TBT15_UPD_PROG_NM, T000T2_n357TBT15_UPD_PROG_NM, T000T2_A345TBT15_STUDY_ID, T000T2_A346TBT15_SUBJECT_ID, T000T2_A925TBT15_MEMO_NO
            }
            , new Object[] {
            T000T3_A352TBT15_CRT_DATETIME, T000T3_n352TBT15_CRT_DATETIME, T000T3_A353TBT15_CRT_USER_ID, T000T3_n353TBT15_CRT_USER_ID, T000T3_A355TBT15_UPD_DATETIME, T000T3_n355TBT15_UPD_DATETIME, T000T3_A356TBT15_UPD_USER_ID, T000T3_n356TBT15_UPD_USER_ID, T000T3_A358TBT15_UPD_CNT, T000T3_n358TBT15_UPD_CNT,
            T000T3_A347TBT15_CRF_ID, T000T3_n347TBT15_CRF_ID, T000T3_A348TBT15_CRF_VERSION, T000T3_n348TBT15_CRF_VERSION, T000T3_A932TBT15_CRF_ITEM_GRP_DIV, T000T3_n932TBT15_CRF_ITEM_GRP_DIV, T000T3_A926TBT15_CRF_ITEM_GRP_CD, T000T3_n926TBT15_CRF_ITEM_GRP_CD, T000T3_A351TBT15_DEL_FLG, T000T3_n351TBT15_DEL_FLG,
            T000T3_A354TBT15_CRT_PROG_NM, T000T3_n354TBT15_CRT_PROG_NM, T000T3_A357TBT15_UPD_PROG_NM, T000T3_n357TBT15_UPD_PROG_NM, T000T3_A345TBT15_STUDY_ID, T000T3_A346TBT15_SUBJECT_ID, T000T3_A925TBT15_MEMO_NO
            }
            , new Object[] {
            T000T4_A345TBT15_STUDY_ID
            }
            , new Object[] {
            T000T5_A352TBT15_CRT_DATETIME, T000T5_n352TBT15_CRT_DATETIME, T000T5_A353TBT15_CRT_USER_ID, T000T5_n353TBT15_CRT_USER_ID, T000T5_A355TBT15_UPD_DATETIME, T000T5_n355TBT15_UPD_DATETIME, T000T5_A356TBT15_UPD_USER_ID, T000T5_n356TBT15_UPD_USER_ID, T000T5_A358TBT15_UPD_CNT, T000T5_n358TBT15_UPD_CNT,
            T000T5_A347TBT15_CRF_ID, T000T5_n347TBT15_CRF_ID, T000T5_A348TBT15_CRF_VERSION, T000T5_n348TBT15_CRF_VERSION, T000T5_A932TBT15_CRF_ITEM_GRP_DIV, T000T5_n932TBT15_CRF_ITEM_GRP_DIV, T000T5_A926TBT15_CRF_ITEM_GRP_CD, T000T5_n926TBT15_CRF_ITEM_GRP_CD, T000T5_A351TBT15_DEL_FLG, T000T5_n351TBT15_DEL_FLG,
            T000T5_A354TBT15_CRT_PROG_NM, T000T5_n354TBT15_CRT_PROG_NM, T000T5_A357TBT15_UPD_PROG_NM, T000T5_n357TBT15_UPD_PROG_NM, T000T5_A345TBT15_STUDY_ID, T000T5_A346TBT15_SUBJECT_ID, T000T5_A925TBT15_MEMO_NO
            }
            , new Object[] {
            T000T6_A345TBT15_STUDY_ID
            }
            , new Object[] {
            T000T7_A345TBT15_STUDY_ID, T000T7_A346TBT15_SUBJECT_ID, T000T7_A925TBT15_MEMO_NO
            }
            , new Object[] {
            T000T8_A345TBT15_STUDY_ID, T000T8_A346TBT15_SUBJECT_ID, T000T8_A925TBT15_MEMO_NO
            }
            , new Object[] {
            T000T9_A345TBT15_STUDY_ID, T000T9_A346TBT15_SUBJECT_ID, T000T9_A925TBT15_MEMO_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000T13_A345TBT15_STUDY_ID, T000T13_A346TBT15_SUBJECT_ID, T000T13_A925TBT15_MEMO_NO
            }
            , new Object[] {
            T000T14_A345TBT15_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT15_CRF_MEMO_LOC" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short A925TBT15_MEMO_NO ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A347TBT15_CRF_ID ;
   private short A348TBT15_CRF_VERSION ;
   private short Z925TBT15_MEMO_NO ;
   private short Z347TBT15_CRF_ID ;
   private short Z348TBT15_CRF_VERSION ;
   private short RcdFound28 ;
   private short Gx_err ;
   private int A346TBT15_SUBJECT_ID ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBT15_STUDY_ID_Enabled ;
   private int edtTBT15_SUBJECT_ID_Enabled ;
   private int edtTBT15_MEMO_NO_Enabled ;
   private int edtTBT15_CRF_ID_Enabled ;
   private int edtTBT15_CRF_VERSION_Enabled ;
   private int edtTBT15_CRF_ITEM_GRP_DIV_Enabled ;
   private int edtTBT15_CRF_ITEM_GRP_CD_Enabled ;
   private int edtTBT15_DEL_FLG_Enabled ;
   private int edtTBT15_CRT_DATETIME_Enabled ;
   private int edtTBT15_CRT_USER_ID_Enabled ;
   private int edtTBT15_CRT_PROG_NM_Enabled ;
   private int edtTBT15_UPD_DATETIME_Enabled ;
   private int edtTBT15_UPD_USER_ID_Enabled ;
   private int edtTBT15_UPD_PROG_NM_Enabled ;
   private int edtTBT15_UPD_CNT_Enabled ;
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
   private int Z346TBT15_SUBJECT_ID ;
   private int GX_JID ;
   private int AnyError345 ;
   private int AnyError346 ;
   private int AnyError925 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A345TBT15_STUDY_ID ;
   private long A358TBT15_UPD_CNT ;
   private long Z345TBT15_STUDY_ID ;
   private long Z358TBT15_UPD_CNT ;
   private long O358TBT15_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBT15_STUDY_ID_Internalname ;
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
   private String lblTextblocktbt15_study_id_Internalname ;
   private String lblTextblocktbt15_study_id_Jsonclick ;
   private String edtTBT15_STUDY_ID_Jsonclick ;
   private String lblTextblocktbt15_subject_id_Internalname ;
   private String lblTextblocktbt15_subject_id_Jsonclick ;
   private String edtTBT15_SUBJECT_ID_Internalname ;
   private String edtTBT15_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbt15_memo_no_Internalname ;
   private String lblTextblocktbt15_memo_no_Jsonclick ;
   private String edtTBT15_MEMO_NO_Internalname ;
   private String edtTBT15_MEMO_NO_Jsonclick ;
   private String lblTextblocktbt15_crf_id_Internalname ;
   private String lblTextblocktbt15_crf_id_Jsonclick ;
   private String edtTBT15_CRF_ID_Internalname ;
   private String edtTBT15_CRF_ID_Jsonclick ;
   private String lblTextblocktbt15_crf_version_Internalname ;
   private String lblTextblocktbt15_crf_version_Jsonclick ;
   private String edtTBT15_CRF_VERSION_Internalname ;
   private String edtTBT15_CRF_VERSION_Jsonclick ;
   private String lblTextblocktbt15_crf_item_grp_div_Internalname ;
   private String lblTextblocktbt15_crf_item_grp_div_Jsonclick ;
   private String edtTBT15_CRF_ITEM_GRP_DIV_Internalname ;
   private String edtTBT15_CRF_ITEM_GRP_DIV_Jsonclick ;
   private String lblTextblocktbt15_crf_item_grp_cd_Internalname ;
   private String lblTextblocktbt15_crf_item_grp_cd_Jsonclick ;
   private String edtTBT15_CRF_ITEM_GRP_CD_Internalname ;
   private String edtTBT15_CRF_ITEM_GRP_CD_Jsonclick ;
   private String lblTextblocktbt15_del_flg_Internalname ;
   private String lblTextblocktbt15_del_flg_Jsonclick ;
   private String edtTBT15_DEL_FLG_Internalname ;
   private String edtTBT15_DEL_FLG_Jsonclick ;
   private String lblTextblocktbt15_crt_datetime_Internalname ;
   private String lblTextblocktbt15_crt_datetime_Jsonclick ;
   private String edtTBT15_CRT_DATETIME_Internalname ;
   private String edtTBT15_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbt15_crt_user_id_Internalname ;
   private String lblTextblocktbt15_crt_user_id_Jsonclick ;
   private String edtTBT15_CRT_USER_ID_Internalname ;
   private String edtTBT15_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbt15_crt_prog_nm_Internalname ;
   private String lblTextblocktbt15_crt_prog_nm_Jsonclick ;
   private String edtTBT15_CRT_PROG_NM_Internalname ;
   private String edtTBT15_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbt15_upd_datetime_Internalname ;
   private String lblTextblocktbt15_upd_datetime_Jsonclick ;
   private String edtTBT15_UPD_DATETIME_Internalname ;
   private String edtTBT15_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbt15_upd_user_id_Internalname ;
   private String lblTextblocktbt15_upd_user_id_Jsonclick ;
   private String edtTBT15_UPD_USER_ID_Internalname ;
   private String edtTBT15_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbt15_upd_prog_nm_Internalname ;
   private String lblTextblocktbt15_upd_prog_nm_Jsonclick ;
   private String edtTBT15_UPD_PROG_NM_Internalname ;
   private String edtTBT15_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbt15_upd_cnt_Internalname ;
   private String lblTextblocktbt15_upd_cnt_Jsonclick ;
   private String edtTBT15_UPD_CNT_Internalname ;
   private String edtTBT15_UPD_CNT_Jsonclick ;
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
   private String sMode28 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A352TBT15_CRT_DATETIME ;
   private java.util.Date A355TBT15_UPD_DATETIME ;
   private java.util.Date Z352TBT15_CRT_DATETIME ;
   private java.util.Date Z355TBT15_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n347TBT15_CRF_ID ;
   private boolean n348TBT15_CRF_VERSION ;
   private boolean n932TBT15_CRF_ITEM_GRP_DIV ;
   private boolean n926TBT15_CRF_ITEM_GRP_CD ;
   private boolean n351TBT15_DEL_FLG ;
   private boolean n352TBT15_CRT_DATETIME ;
   private boolean n353TBT15_CRT_USER_ID ;
   private boolean n354TBT15_CRT_PROG_NM ;
   private boolean n355TBT15_UPD_DATETIME ;
   private boolean n356TBT15_UPD_USER_ID ;
   private boolean n357TBT15_UPD_PROG_NM ;
   private boolean n358TBT15_UPD_CNT ;
   private boolean Gx_longc ;
   private String A932TBT15_CRF_ITEM_GRP_DIV ;
   private String A926TBT15_CRF_ITEM_GRP_CD ;
   private String A351TBT15_DEL_FLG ;
   private String A353TBT15_CRT_USER_ID ;
   private String A354TBT15_CRT_PROG_NM ;
   private String A356TBT15_UPD_USER_ID ;
   private String A357TBT15_UPD_PROG_NM ;
   private String Z353TBT15_CRT_USER_ID ;
   private String Z356TBT15_UPD_USER_ID ;
   private String Z932TBT15_CRF_ITEM_GRP_DIV ;
   private String Z926TBT15_CRF_ITEM_GRP_CD ;
   private String Z351TBT15_DEL_FLG ;
   private String Z354TBT15_CRT_PROG_NM ;
   private String Z357TBT15_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T000T5_A352TBT15_CRT_DATETIME ;
   private boolean[] T000T5_n352TBT15_CRT_DATETIME ;
   private String[] T000T5_A353TBT15_CRT_USER_ID ;
   private boolean[] T000T5_n353TBT15_CRT_USER_ID ;
   private java.util.Date[] T000T5_A355TBT15_UPD_DATETIME ;
   private boolean[] T000T5_n355TBT15_UPD_DATETIME ;
   private String[] T000T5_A356TBT15_UPD_USER_ID ;
   private boolean[] T000T5_n356TBT15_UPD_USER_ID ;
   private long[] T000T5_A358TBT15_UPD_CNT ;
   private boolean[] T000T5_n358TBT15_UPD_CNT ;
   private short[] T000T5_A347TBT15_CRF_ID ;
   private boolean[] T000T5_n347TBT15_CRF_ID ;
   private short[] T000T5_A348TBT15_CRF_VERSION ;
   private boolean[] T000T5_n348TBT15_CRF_VERSION ;
   private String[] T000T5_A932TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] T000T5_n932TBT15_CRF_ITEM_GRP_DIV ;
   private String[] T000T5_A926TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] T000T5_n926TBT15_CRF_ITEM_GRP_CD ;
   private String[] T000T5_A351TBT15_DEL_FLG ;
   private boolean[] T000T5_n351TBT15_DEL_FLG ;
   private String[] T000T5_A354TBT15_CRT_PROG_NM ;
   private boolean[] T000T5_n354TBT15_CRT_PROG_NM ;
   private String[] T000T5_A357TBT15_UPD_PROG_NM ;
   private boolean[] T000T5_n357TBT15_UPD_PROG_NM ;
   private long[] T000T5_A345TBT15_STUDY_ID ;
   private int[] T000T5_A346TBT15_SUBJECT_ID ;
   private short[] T000T5_A925TBT15_MEMO_NO ;
   private long[] T000T4_A345TBT15_STUDY_ID ;
   private long[] T000T6_A345TBT15_STUDY_ID ;
   private long[] T000T7_A345TBT15_STUDY_ID ;
   private int[] T000T7_A346TBT15_SUBJECT_ID ;
   private short[] T000T7_A925TBT15_MEMO_NO ;
   private java.util.Date[] T000T3_A352TBT15_CRT_DATETIME ;
   private boolean[] T000T3_n352TBT15_CRT_DATETIME ;
   private String[] T000T3_A353TBT15_CRT_USER_ID ;
   private boolean[] T000T3_n353TBT15_CRT_USER_ID ;
   private java.util.Date[] T000T3_A355TBT15_UPD_DATETIME ;
   private boolean[] T000T3_n355TBT15_UPD_DATETIME ;
   private String[] T000T3_A356TBT15_UPD_USER_ID ;
   private boolean[] T000T3_n356TBT15_UPD_USER_ID ;
   private long[] T000T3_A358TBT15_UPD_CNT ;
   private boolean[] T000T3_n358TBT15_UPD_CNT ;
   private short[] T000T3_A347TBT15_CRF_ID ;
   private boolean[] T000T3_n347TBT15_CRF_ID ;
   private short[] T000T3_A348TBT15_CRF_VERSION ;
   private boolean[] T000T3_n348TBT15_CRF_VERSION ;
   private String[] T000T3_A932TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] T000T3_n932TBT15_CRF_ITEM_GRP_DIV ;
   private String[] T000T3_A926TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] T000T3_n926TBT15_CRF_ITEM_GRP_CD ;
   private String[] T000T3_A351TBT15_DEL_FLG ;
   private boolean[] T000T3_n351TBT15_DEL_FLG ;
   private String[] T000T3_A354TBT15_CRT_PROG_NM ;
   private boolean[] T000T3_n354TBT15_CRT_PROG_NM ;
   private String[] T000T3_A357TBT15_UPD_PROG_NM ;
   private boolean[] T000T3_n357TBT15_UPD_PROG_NM ;
   private long[] T000T3_A345TBT15_STUDY_ID ;
   private int[] T000T3_A346TBT15_SUBJECT_ID ;
   private short[] T000T3_A925TBT15_MEMO_NO ;
   private long[] T000T8_A345TBT15_STUDY_ID ;
   private int[] T000T8_A346TBT15_SUBJECT_ID ;
   private short[] T000T8_A925TBT15_MEMO_NO ;
   private long[] T000T9_A345TBT15_STUDY_ID ;
   private int[] T000T9_A346TBT15_SUBJECT_ID ;
   private short[] T000T9_A925TBT15_MEMO_NO ;
   private java.util.Date[] T000T2_A352TBT15_CRT_DATETIME ;
   private boolean[] T000T2_n352TBT15_CRT_DATETIME ;
   private String[] T000T2_A353TBT15_CRT_USER_ID ;
   private boolean[] T000T2_n353TBT15_CRT_USER_ID ;
   private java.util.Date[] T000T2_A355TBT15_UPD_DATETIME ;
   private boolean[] T000T2_n355TBT15_UPD_DATETIME ;
   private String[] T000T2_A356TBT15_UPD_USER_ID ;
   private boolean[] T000T2_n356TBT15_UPD_USER_ID ;
   private long[] T000T2_A358TBT15_UPD_CNT ;
   private boolean[] T000T2_n358TBT15_UPD_CNT ;
   private short[] T000T2_A347TBT15_CRF_ID ;
   private boolean[] T000T2_n347TBT15_CRF_ID ;
   private short[] T000T2_A348TBT15_CRF_VERSION ;
   private boolean[] T000T2_n348TBT15_CRF_VERSION ;
   private String[] T000T2_A932TBT15_CRF_ITEM_GRP_DIV ;
   private boolean[] T000T2_n932TBT15_CRF_ITEM_GRP_DIV ;
   private String[] T000T2_A926TBT15_CRF_ITEM_GRP_CD ;
   private boolean[] T000T2_n926TBT15_CRF_ITEM_GRP_CD ;
   private String[] T000T2_A351TBT15_DEL_FLG ;
   private boolean[] T000T2_n351TBT15_DEL_FLG ;
   private String[] T000T2_A354TBT15_CRT_PROG_NM ;
   private boolean[] T000T2_n354TBT15_CRT_PROG_NM ;
   private String[] T000T2_A357TBT15_UPD_PROG_NM ;
   private boolean[] T000T2_n357TBT15_UPD_PROG_NM ;
   private long[] T000T2_A345TBT15_STUDY_ID ;
   private int[] T000T2_A346TBT15_SUBJECT_ID ;
   private short[] T000T2_A925TBT15_MEMO_NO ;
   private long[] T000T13_A345TBT15_STUDY_ID ;
   private int[] T000T13_A346TBT15_SUBJECT_ID ;
   private short[] T000T13_A925TBT15_MEMO_NO ;
   private long[] T000T14_A345TBT15_STUDY_ID ;
}

final  class tbt15_crf_memo_loc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000T2", "SELECT `TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_CNT`, `TBT15_CRF_ID`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_DIV`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_PROG_NM`, `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000T3", "SELECT `TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_CNT`, `TBT15_CRF_ID`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_DIV`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_PROG_NM`, `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000T4", "SELECT `TBT14_STUDY_ID` AS TBT15_STUDY_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000T5", "SELECT TM1.`TBT15_CRT_DATETIME`, TM1.`TBT15_CRT_USER_ID`, TM1.`TBT15_UPD_DATETIME`, TM1.`TBT15_UPD_USER_ID`, TM1.`TBT15_UPD_CNT`, TM1.`TBT15_CRF_ID`, TM1.`TBT15_CRF_VERSION`, TM1.`TBT15_CRF_ITEM_GRP_DIV`, TM1.`TBT15_CRF_ITEM_GRP_CD`, TM1.`TBT15_DEL_FLG`, TM1.`TBT15_CRT_PROG_NM`, TM1.`TBT15_UPD_PROG_NM`, TM1.`TBT15_STUDY_ID` AS TBT15_STUDY_ID, TM1.`TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, TM1.`TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` TM1 WHERE TM1.`TBT15_STUDY_ID` = ? and TM1.`TBT15_SUBJECT_ID` = ? and TM1.`TBT15_MEMO_NO` = ? ORDER BY TM1.`TBT15_STUDY_ID`, TM1.`TBT15_SUBJECT_ID`, TM1.`TBT15_MEMO_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000T6", "SELECT `TBT14_STUDY_ID` AS TBT15_STUDY_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000T7", "SELECT `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000T8", "SELECT `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` WHERE ( `TBT15_STUDY_ID` > ? or `TBT15_STUDY_ID` = ? and `TBT15_SUBJECT_ID` > ? or `TBT15_SUBJECT_ID` = ? and `TBT15_STUDY_ID` = ? and `TBT15_MEMO_NO` > ?) ORDER BY `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000T9", "SELECT `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` WHERE ( `TBT15_STUDY_ID` < ? or `TBT15_STUDY_ID` = ? and `TBT15_SUBJECT_ID` < ? or `TBT15_SUBJECT_ID` = ? and `TBT15_STUDY_ID` = ? and `TBT15_MEMO_NO` < ?) ORDER BY `TBT15_STUDY_ID` DESC, `TBT15_SUBJECT_ID` DESC, `TBT15_MEMO_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000T10", "INSERT INTO `TBT15_CRF_MEMO_LOC` (`TBT15_CRT_DATETIME`, `TBT15_CRT_USER_ID`, `TBT15_UPD_DATETIME`, `TBT15_UPD_USER_ID`, `TBT15_UPD_CNT`, `TBT15_CRF_ID`, `TBT15_CRF_VERSION`, `TBT15_CRF_ITEM_GRP_DIV`, `TBT15_CRF_ITEM_GRP_CD`, `TBT15_DEL_FLG`, `TBT15_CRT_PROG_NM`, `TBT15_UPD_PROG_NM`, `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000T11", "UPDATE `TBT15_CRF_MEMO_LOC` SET `TBT15_CRT_DATETIME`=?, `TBT15_CRT_USER_ID`=?, `TBT15_UPD_DATETIME`=?, `TBT15_UPD_USER_ID`=?, `TBT15_UPD_CNT`=?, `TBT15_CRF_ID`=?, `TBT15_CRF_VERSION`=?, `TBT15_CRF_ITEM_GRP_DIV`=?, `TBT15_CRF_ITEM_GRP_CD`=?, `TBT15_DEL_FLG`=?, `TBT15_CRT_PROG_NM`=?, `TBT15_UPD_PROG_NM`=?  WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T000T12", "DELETE FROM `TBT15_CRF_MEMO_LOC`  WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T000T13", "SELECT `TBT15_STUDY_ID` AS TBT15_STUDY_ID, `TBT15_SUBJECT_ID` AS TBT15_SUBJECT_ID, `TBT15_MEMO_NO` AS TBT15_MEMO_NO FROM `TBT15_CRF_MEMO_LOC` ORDER BY `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000T14", "SELECT `TBT14_STUDY_ID` AS TBT15_STUDY_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(13) ;
               ((int[]) buf[25])[0] = rslt.getInt(14) ;
               ((short[]) buf[26])[0] = rslt.getShort(15) ;
               break;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(13) ;
               ((int[]) buf[25])[0] = rslt.getInt(14) ;
               ((short[]) buf[26])[0] = rslt.getShort(15) ;
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 3 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1) ;
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(3) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((short[]) buf[12])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((long[]) buf[24])[0] = rslt.getLong(13) ;
               ((int[]) buf[25])[0] = rslt.getInt(14) ;
               ((short[]) buf[26])[0] = rslt.getShort(15) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 12 :
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
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
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               stmt.setLong(13, ((Number) parms[24]).longValue());
               stmt.setInt(14, ((Number) parms[25]).intValue());
               stmt.setShort(15, ((Number) parms[26]).shortValue());
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
                  stmt.setShort(7, ((Number) parms[13]).shortValue());
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
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 1);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               stmt.setLong(13, ((Number) parms[24]).longValue());
               stmt.setInt(14, ((Number) parms[25]).intValue());
               stmt.setShort(15, ((Number) parms[26]).shortValue());
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
      }
   }

}

