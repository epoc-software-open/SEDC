/*
               File: tbt14_crf_memo_impl
        Description: CRFメモテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:37.25
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
         A329TBT14_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
         A330TBT14_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A329TBT14_STUDY_ID, A330TBT14_SUBJECT_ID) ;
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
      Form.getMeta().addItem("Description", "CRFメモテーブル", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRFメモテーブル"+"</legend>") ;
         wb_table3_27_0S27( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0S27e( boolean wbgen )
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

   public void wb_table3_27_0S27( boolean wbgen )
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
         wb_table4_33_0S27( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0S27e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT14_CRF_MEMO.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT14_CRF_MEMO.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0S27e( true) ;
      }
      else
      {
         wb_table3_27_0S27e( false) ;
      }
   }

   public void wb_table4_33_0S27( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_study_id_Internalname, "試験ID", "", "", lblTextblocktbt14_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A329TBT14_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBT14_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A329TBT14_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A329TBT14_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBT14_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_subject_id_Internalname, "患者ID", "", "", lblTextblocktbt14_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A330TBT14_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBT14_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A330TBT14_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A330TBT14_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBT14_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_memo_no_Internalname, "メモ番号", "", "", lblTextblocktbt14_memo_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_MEMO_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A922TBT14_MEMO_NO, (byte)(3), (byte)(0), ".", "")), ((edtTBT14_MEMO_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A922TBT14_MEMO_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A922TBT14_MEMO_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(48);\"", "", "", "", "", edtTBT14_MEMO_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_MEMO_NO_Enabled, 0, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crf_id_Internalname, "CRFID", "", "", lblTextblocktbt14_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A331TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A331TBT14_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A331TBT14_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBT14_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A331TBT14_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A331TBT14_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBT14_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crf_version_Internalname, "CRF更新バージョン", "", "", lblTextblocktbt14_crf_version_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A332TBT14_CRF_VERSION", GXutil.ltrim( GXutil.str( A332TBT14_CRF_VERSION, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRF_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A332TBT14_CRF_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBT14_CRF_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A332TBT14_CRF_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A332TBT14_CRF_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBT14_CRF_VERSION_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_CRF_VERSION_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_memo_kbn_Internalname, "2:連絡メモ）", "", "", lblTextblocktbt14_memo_kbn_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A923TBT14_MEMO_KBN", A923TBT14_MEMO_KBN);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_MEMO_KBN_Internalname, GXutil.rtrim( A923TBT14_MEMO_KBN), GXutil.rtrim( localUtil.format( A923TBT14_MEMO_KBN, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBT14_MEMO_KBN_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_MEMO_KBN_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_memo_Internalname, "メモ", "", "", lblTextblocktbt14_memo_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A335TBT14_MEMO", A335TBT14_MEMO);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT14_MEMO_Internalname, GXutil.rtrim( A335TBT14_MEMO), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", (short)(0), 1, edtTBT14_MEMO_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "2000", -1, "", true, "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_request_site_id_Internalname, "ID", "", "", lblTextblocktbt14_request_site_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_REQUEST_SITE_ID", A928TBT14_REQUEST_SITE_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_REQUEST_SITE_ID_Internalname, GXutil.rtrim( A928TBT14_REQUEST_SITE_ID), GXutil.rtrim( localUtil.format( A928TBT14_REQUEST_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBT14_REQUEST_SITE_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_REQUEST_SITE_ID_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_request_auth_cd_Internalname, "連絡先権限コード", "", "", lblTextblocktbt14_request_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_AUTH_CD", A929TBT14_REQUEST_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_REQUEST_AUTH_CD_Internalname, GXutil.rtrim( A929TBT14_REQUEST_AUTH_CD), GXutil.rtrim( localUtil.format( A929TBT14_REQUEST_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBT14_REQUEST_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_REQUEST_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crt_auth_cd_Internalname, "作成者権限コード", "", "", lblTextblocktbt14_crt_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_CRT_AUTH_CD", A930TBT14_CRT_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRT_AUTH_CD_Internalname, GXutil.rtrim( A930TBT14_CRT_AUTH_CD), GXutil.rtrim( localUtil.format( A930TBT14_CRT_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBT14_CRT_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_CRT_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_kakunin_flg_Internalname, "確認フラグ", "", "", lblTextblocktbt14_kakunin_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_KAKUNIN_FLG_Internalname, GXutil.rtrim( A927TBT14_KAKUNIN_FLG), GXutil.rtrim( localUtil.format( A927TBT14_KAKUNIN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBT14_KAKUNIN_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_KAKUNIN_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_kakunin_user_id_Internalname, "ID", "", "", lblTextblocktbt14_kakunin_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A931TBT14_KAKUNIN_USER_ID", A931TBT14_KAKUNIN_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_KAKUNIN_USER_ID_Internalname, GXutil.rtrim( A931TBT14_KAKUNIN_USER_ID), GXutil.rtrim( localUtil.format( A931TBT14_KAKUNIN_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(93);\"", "", "", "", "", edtTBT14_KAKUNIN_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_KAKUNIN_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_kakunin_comment_Internalname, "確認コメント", "", "", lblTextblocktbt14_kakunin_comment_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A933TBT14_KAKUNIN_COMMENT", A933TBT14_KAKUNIN_COMMENT);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBT14_KAKUNIN_COMMENT_Internalname, GXutil.rtrim( A933TBT14_KAKUNIN_COMMENT), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", (short)(0), 1, edtTBT14_KAKUNIN_COMMENT_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "2000", -1, "", true, "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_kanryo_flg_Internalname, "完了フラグ", "", "", lblTextblocktbt14_kanryo_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A924TBT14_KANRYO_FLG", A924TBT14_KANRYO_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_KANRYO_FLG_Internalname, GXutil.rtrim( A924TBT14_KANRYO_FLG), GXutil.rtrim( localUtil.format( A924TBT14_KANRYO_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtTBT14_KANRYO_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_KANRYO_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt14_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A337TBT14_DEL_FLG", A337TBT14_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_DEL_FLG_Internalname, GXutil.rtrim( A337TBT14_DEL_FLG), GXutil.rtrim( localUtil.format( A337TBT14_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(108);\"", "", "", "", "", edtTBT14_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt14_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A338TBT14_CRT_DATETIME", localUtil.ttoc( A338TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT14_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRT_DATETIME_Internalname, localUtil.format(A338TBT14_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A338TBT14_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(113);\"", "", "", "", "", edtTBT14_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT14_CRF_MEMO.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT14_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT14_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbt14_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A339TBT14_CRT_USER_ID", A339TBT14_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRT_USER_ID_Internalname, GXutil.rtrim( A339TBT14_CRT_USER_ID), GXutil.rtrim( localUtil.format( A339TBT14_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(118);\"", "", "", "", "", edtTBT14_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt14_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A340TBT14_CRT_PROG_NM", A340TBT14_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_CRT_PROG_NM_Internalname, GXutil.rtrim( A340TBT14_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A340TBT14_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(123);\"", "", "", "", "", edtTBT14_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt14_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A341TBT14_UPD_DATETIME", localUtil.ttoc( A341TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT14_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_UPD_DATETIME_Internalname, localUtil.format(A341TBT14_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A341TBT14_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(128);\"", "", "", "", "", edtTBT14_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT14_CRF_MEMO.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT14_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT14_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbt14_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A342TBT14_UPD_USER_ID", A342TBT14_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_UPD_USER_ID_Internalname, GXutil.rtrim( A342TBT14_UPD_USER_ID), GXutil.rtrim( localUtil.format( A342TBT14_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(133);\"", "", "", "", "", edtTBT14_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt14_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A343TBT14_UPD_PROG_NM", A343TBT14_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_UPD_PROG_NM_Internalname, GXutil.rtrim( A343TBT14_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A343TBT14_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(138);\"", "", "", "", "", edtTBT14_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt14_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt14_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A344TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A344TBT14_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT14_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A344TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT14_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A344TBT14_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A344TBT14_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(143);\"", "", "", "", "", edtTBT14_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT14_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT14_CRF_MEMO.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0S27e( true) ;
      }
      else
      {
         wb_table4_33_0S27e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT14_CRF_MEMO.htm");
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
               A329TBT14_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
            }
            else
            {
               A329TBT14_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBT14_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A330TBT14_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A330TBT14_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBT14_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_MEMO_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_MEMO_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_MEMO_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_MEMO_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A922TBT14_MEMO_NO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
            }
            else
            {
               A922TBT14_MEMO_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT14_MEMO_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A331TBT14_CRF_ID = (short)(0) ;
               n331TBT14_CRF_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A331TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A331TBT14_CRF_ID, 4, 0)));
            }
            else
            {
               A331TBT14_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_ID_Internalname), ".", ",")) ;
               n331TBT14_CRF_ID = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A331TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A331TBT14_CRF_ID, 4, 0)));
            }
            n331TBT14_CRF_ID = ((0==A331TBT14_CRF_ID) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_CRF_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_CRF_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A332TBT14_CRF_VERSION = (short)(0) ;
               n332TBT14_CRF_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A332TBT14_CRF_VERSION", GXutil.ltrim( GXutil.str( A332TBT14_CRF_VERSION, 4, 0)));
            }
            else
            {
               A332TBT14_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT14_CRF_VERSION_Internalname), ".", ",")) ;
               n332TBT14_CRF_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A332TBT14_CRF_VERSION", GXutil.ltrim( GXutil.str( A332TBT14_CRF_VERSION, 4, 0)));
            }
            n332TBT14_CRF_VERSION = ((0==A332TBT14_CRF_VERSION) ? true : false) ;
            A923TBT14_MEMO_KBN = httpContext.cgiGet( edtTBT14_MEMO_KBN_Internalname) ;
            n923TBT14_MEMO_KBN = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A923TBT14_MEMO_KBN", A923TBT14_MEMO_KBN);
            n923TBT14_MEMO_KBN = ((GXutil.strcmp("", A923TBT14_MEMO_KBN)==0) ? true : false) ;
            A335TBT14_MEMO = httpContext.cgiGet( edtTBT14_MEMO_Internalname) ;
            n335TBT14_MEMO = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A335TBT14_MEMO", A335TBT14_MEMO);
            n335TBT14_MEMO = ((GXutil.strcmp("", A335TBT14_MEMO)==0) ? true : false) ;
            A928TBT14_REQUEST_SITE_ID = httpContext.cgiGet( edtTBT14_REQUEST_SITE_ID_Internalname) ;
            n928TBT14_REQUEST_SITE_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_REQUEST_SITE_ID", A928TBT14_REQUEST_SITE_ID);
            n928TBT14_REQUEST_SITE_ID = ((GXutil.strcmp("", A928TBT14_REQUEST_SITE_ID)==0) ? true : false) ;
            A929TBT14_REQUEST_AUTH_CD = httpContext.cgiGet( edtTBT14_REQUEST_AUTH_CD_Internalname) ;
            n929TBT14_REQUEST_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_AUTH_CD", A929TBT14_REQUEST_AUTH_CD);
            n929TBT14_REQUEST_AUTH_CD = ((GXutil.strcmp("", A929TBT14_REQUEST_AUTH_CD)==0) ? true : false) ;
            A930TBT14_CRT_AUTH_CD = httpContext.cgiGet( edtTBT14_CRT_AUTH_CD_Internalname) ;
            n930TBT14_CRT_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_CRT_AUTH_CD", A930TBT14_CRT_AUTH_CD);
            n930TBT14_CRT_AUTH_CD = ((GXutil.strcmp("", A930TBT14_CRT_AUTH_CD)==0) ? true : false) ;
            A927TBT14_KAKUNIN_FLG = httpContext.cgiGet( edtTBT14_KAKUNIN_FLG_Internalname) ;
            n927TBT14_KAKUNIN_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
            n927TBT14_KAKUNIN_FLG = ((GXutil.strcmp("", A927TBT14_KAKUNIN_FLG)==0) ? true : false) ;
            A931TBT14_KAKUNIN_USER_ID = httpContext.cgiGet( edtTBT14_KAKUNIN_USER_ID_Internalname) ;
            n931TBT14_KAKUNIN_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A931TBT14_KAKUNIN_USER_ID", A931TBT14_KAKUNIN_USER_ID);
            n931TBT14_KAKUNIN_USER_ID = ((GXutil.strcmp("", A931TBT14_KAKUNIN_USER_ID)==0) ? true : false) ;
            A933TBT14_KAKUNIN_COMMENT = httpContext.cgiGet( edtTBT14_KAKUNIN_COMMENT_Internalname) ;
            n933TBT14_KAKUNIN_COMMENT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A933TBT14_KAKUNIN_COMMENT", A933TBT14_KAKUNIN_COMMENT);
            n933TBT14_KAKUNIN_COMMENT = ((GXutil.strcmp("", A933TBT14_KAKUNIN_COMMENT)==0) ? true : false) ;
            A924TBT14_KANRYO_FLG = httpContext.cgiGet( edtTBT14_KANRYO_FLG_Internalname) ;
            n924TBT14_KANRYO_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A924TBT14_KANRYO_FLG", A924TBT14_KANRYO_FLG);
            n924TBT14_KANRYO_FLG = ((GXutil.strcmp("", A924TBT14_KANRYO_FLG)==0) ? true : false) ;
            A337TBT14_DEL_FLG = httpContext.cgiGet( edtTBT14_DEL_FLG_Internalname) ;
            n337TBT14_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A337TBT14_DEL_FLG", A337TBT14_DEL_FLG);
            n337TBT14_DEL_FLG = ((GXutil.strcmp("", A337TBT14_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT14_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBT14_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A338TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n338TBT14_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A338TBT14_CRT_DATETIME", localUtil.ttoc( A338TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A338TBT14_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT14_CRT_DATETIME_Internalname)) ;
               n338TBT14_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A338TBT14_CRT_DATETIME", localUtil.ttoc( A338TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n338TBT14_CRT_DATETIME = (GXutil.nullDate().equals(A338TBT14_CRT_DATETIME) ? true : false) ;
            A339TBT14_CRT_USER_ID = httpContext.cgiGet( edtTBT14_CRT_USER_ID_Internalname) ;
            n339TBT14_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A339TBT14_CRT_USER_ID", A339TBT14_CRT_USER_ID);
            n339TBT14_CRT_USER_ID = ((GXutil.strcmp("", A339TBT14_CRT_USER_ID)==0) ? true : false) ;
            A340TBT14_CRT_PROG_NM = httpContext.cgiGet( edtTBT14_CRT_PROG_NM_Internalname) ;
            n340TBT14_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A340TBT14_CRT_PROG_NM", A340TBT14_CRT_PROG_NM);
            n340TBT14_CRT_PROG_NM = ((GXutil.strcmp("", A340TBT14_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT14_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBT14_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A341TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n341TBT14_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A341TBT14_UPD_DATETIME", localUtil.ttoc( A341TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A341TBT14_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT14_UPD_DATETIME_Internalname)) ;
               n341TBT14_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A341TBT14_UPD_DATETIME", localUtil.ttoc( A341TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n341TBT14_UPD_DATETIME = (GXutil.nullDate().equals(A341TBT14_UPD_DATETIME) ? true : false) ;
            A342TBT14_UPD_USER_ID = httpContext.cgiGet( edtTBT14_UPD_USER_ID_Internalname) ;
            n342TBT14_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A342TBT14_UPD_USER_ID", A342TBT14_UPD_USER_ID);
            n342TBT14_UPD_USER_ID = ((GXutil.strcmp("", A342TBT14_UPD_USER_ID)==0) ? true : false) ;
            A343TBT14_UPD_PROG_NM = httpContext.cgiGet( edtTBT14_UPD_PROG_NM_Internalname) ;
            n343TBT14_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A343TBT14_UPD_PROG_NM", A343TBT14_UPD_PROG_NM);
            n343TBT14_UPD_PROG_NM = ((GXutil.strcmp("", A343TBT14_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT14_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT14_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT14_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A344TBT14_UPD_CNT = 0 ;
               n344TBT14_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A344TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A344TBT14_UPD_CNT, 10, 0)));
            }
            else
            {
               A344TBT14_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT14_UPD_CNT_Internalname), ".", ",") ;
               n344TBT14_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A344TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A344TBT14_UPD_CNT, 10, 0)));
            }
            n344TBT14_UPD_CNT = ((0==A344TBT14_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z329TBT14_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z329TBT14_STUDY_ID"), ".", ",") ;
            Z330TBT14_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z330TBT14_SUBJECT_ID"), ".", ",")) ;
            Z922TBT14_MEMO_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z922TBT14_MEMO_NO"), ".", ",")) ;
            Z338TBT14_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z338TBT14_CRT_DATETIME"), 0) ;
            n338TBT14_CRT_DATETIME = (GXutil.nullDate().equals(A338TBT14_CRT_DATETIME) ? true : false) ;
            Z339TBT14_CRT_USER_ID = httpContext.cgiGet( "Z339TBT14_CRT_USER_ID") ;
            n339TBT14_CRT_USER_ID = ((GXutil.strcmp("", A339TBT14_CRT_USER_ID)==0) ? true : false) ;
            Z341TBT14_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z341TBT14_UPD_DATETIME"), 0) ;
            n341TBT14_UPD_DATETIME = (GXutil.nullDate().equals(A341TBT14_UPD_DATETIME) ? true : false) ;
            Z342TBT14_UPD_USER_ID = httpContext.cgiGet( "Z342TBT14_UPD_USER_ID") ;
            n342TBT14_UPD_USER_ID = ((GXutil.strcmp("", A342TBT14_UPD_USER_ID)==0) ? true : false) ;
            Z344TBT14_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z344TBT14_UPD_CNT"), ".", ",") ;
            n344TBT14_UPD_CNT = ((0==A344TBT14_UPD_CNT) ? true : false) ;
            Z331TBT14_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z331TBT14_CRF_ID"), ".", ",")) ;
            n331TBT14_CRF_ID = ((0==A331TBT14_CRF_ID) ? true : false) ;
            Z332TBT14_CRF_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z332TBT14_CRF_VERSION"), ".", ",")) ;
            n332TBT14_CRF_VERSION = ((0==A332TBT14_CRF_VERSION) ? true : false) ;
            Z923TBT14_MEMO_KBN = httpContext.cgiGet( "Z923TBT14_MEMO_KBN") ;
            n923TBT14_MEMO_KBN = ((GXutil.strcmp("", A923TBT14_MEMO_KBN)==0) ? true : false) ;
            Z335TBT14_MEMO = httpContext.cgiGet( "Z335TBT14_MEMO") ;
            n335TBT14_MEMO = ((GXutil.strcmp("", A335TBT14_MEMO)==0) ? true : false) ;
            Z928TBT14_REQUEST_SITE_ID = httpContext.cgiGet( "Z928TBT14_REQUEST_SITE_ID") ;
            n928TBT14_REQUEST_SITE_ID = ((GXutil.strcmp("", A928TBT14_REQUEST_SITE_ID)==0) ? true : false) ;
            Z929TBT14_REQUEST_AUTH_CD = httpContext.cgiGet( "Z929TBT14_REQUEST_AUTH_CD") ;
            n929TBT14_REQUEST_AUTH_CD = ((GXutil.strcmp("", A929TBT14_REQUEST_AUTH_CD)==0) ? true : false) ;
            Z930TBT14_CRT_AUTH_CD = httpContext.cgiGet( "Z930TBT14_CRT_AUTH_CD") ;
            n930TBT14_CRT_AUTH_CD = ((GXutil.strcmp("", A930TBT14_CRT_AUTH_CD)==0) ? true : false) ;
            Z927TBT14_KAKUNIN_FLG = httpContext.cgiGet( "Z927TBT14_KAKUNIN_FLG") ;
            n927TBT14_KAKUNIN_FLG = ((GXutil.strcmp("", A927TBT14_KAKUNIN_FLG)==0) ? true : false) ;
            Z931TBT14_KAKUNIN_USER_ID = httpContext.cgiGet( "Z931TBT14_KAKUNIN_USER_ID") ;
            n931TBT14_KAKUNIN_USER_ID = ((GXutil.strcmp("", A931TBT14_KAKUNIN_USER_ID)==0) ? true : false) ;
            Z933TBT14_KAKUNIN_COMMENT = httpContext.cgiGet( "Z933TBT14_KAKUNIN_COMMENT") ;
            n933TBT14_KAKUNIN_COMMENT = ((GXutil.strcmp("", A933TBT14_KAKUNIN_COMMENT)==0) ? true : false) ;
            Z924TBT14_KANRYO_FLG = httpContext.cgiGet( "Z924TBT14_KANRYO_FLG") ;
            n924TBT14_KANRYO_FLG = ((GXutil.strcmp("", A924TBT14_KANRYO_FLG)==0) ? true : false) ;
            Z337TBT14_DEL_FLG = httpContext.cgiGet( "Z337TBT14_DEL_FLG") ;
            n337TBT14_DEL_FLG = ((GXutil.strcmp("", A337TBT14_DEL_FLG)==0) ? true : false) ;
            Z340TBT14_CRT_PROG_NM = httpContext.cgiGet( "Z340TBT14_CRT_PROG_NM") ;
            n340TBT14_CRT_PROG_NM = ((GXutil.strcmp("", A340TBT14_CRT_PROG_NM)==0) ? true : false) ;
            Z343TBT14_UPD_PROG_NM = httpContext.cgiGet( "Z343TBT14_UPD_PROG_NM") ;
            n343TBT14_UPD_PROG_NM = ((GXutil.strcmp("", A343TBT14_UPD_PROG_NM)==0) ? true : false) ;
            O344TBT14_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O344TBT14_UPD_CNT"), ".", ",") ;
            n344TBT14_UPD_CNT = ((0==A344TBT14_UPD_CNT) ? true : false) ;
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
               A329TBT14_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
               A330TBT14_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
               A922TBT14_MEMO_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120S2( )
   {
      /* After Trn Routine */
   }

   public void S1173( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0S27( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z338TBT14_CRT_DATETIME = T000S3_A338TBT14_CRT_DATETIME[0] ;
            Z339TBT14_CRT_USER_ID = T000S3_A339TBT14_CRT_USER_ID[0] ;
            Z341TBT14_UPD_DATETIME = T000S3_A341TBT14_UPD_DATETIME[0] ;
            Z342TBT14_UPD_USER_ID = T000S3_A342TBT14_UPD_USER_ID[0] ;
            Z344TBT14_UPD_CNT = T000S3_A344TBT14_UPD_CNT[0] ;
            Z331TBT14_CRF_ID = T000S3_A331TBT14_CRF_ID[0] ;
            Z332TBT14_CRF_VERSION = T000S3_A332TBT14_CRF_VERSION[0] ;
            Z923TBT14_MEMO_KBN = T000S3_A923TBT14_MEMO_KBN[0] ;
            Z335TBT14_MEMO = T000S3_A335TBT14_MEMO[0] ;
            Z928TBT14_REQUEST_SITE_ID = T000S3_A928TBT14_REQUEST_SITE_ID[0] ;
            Z929TBT14_REQUEST_AUTH_CD = T000S3_A929TBT14_REQUEST_AUTH_CD[0] ;
            Z930TBT14_CRT_AUTH_CD = T000S3_A930TBT14_CRT_AUTH_CD[0] ;
            Z927TBT14_KAKUNIN_FLG = T000S3_A927TBT14_KAKUNIN_FLG[0] ;
            Z931TBT14_KAKUNIN_USER_ID = T000S3_A931TBT14_KAKUNIN_USER_ID[0] ;
            Z933TBT14_KAKUNIN_COMMENT = T000S3_A933TBT14_KAKUNIN_COMMENT[0] ;
            Z924TBT14_KANRYO_FLG = T000S3_A924TBT14_KANRYO_FLG[0] ;
            Z337TBT14_DEL_FLG = T000S3_A337TBT14_DEL_FLG[0] ;
            Z340TBT14_CRT_PROG_NM = T000S3_A340TBT14_CRT_PROG_NM[0] ;
            Z343TBT14_UPD_PROG_NM = T000S3_A343TBT14_UPD_PROG_NM[0] ;
         }
         else
         {
            Z338TBT14_CRT_DATETIME = A338TBT14_CRT_DATETIME ;
            Z339TBT14_CRT_USER_ID = A339TBT14_CRT_USER_ID ;
            Z341TBT14_UPD_DATETIME = A341TBT14_UPD_DATETIME ;
            Z342TBT14_UPD_USER_ID = A342TBT14_UPD_USER_ID ;
            Z344TBT14_UPD_CNT = A344TBT14_UPD_CNT ;
            Z331TBT14_CRF_ID = A331TBT14_CRF_ID ;
            Z332TBT14_CRF_VERSION = A332TBT14_CRF_VERSION ;
            Z923TBT14_MEMO_KBN = A923TBT14_MEMO_KBN ;
            Z335TBT14_MEMO = A335TBT14_MEMO ;
            Z928TBT14_REQUEST_SITE_ID = A928TBT14_REQUEST_SITE_ID ;
            Z929TBT14_REQUEST_AUTH_CD = A929TBT14_REQUEST_AUTH_CD ;
            Z930TBT14_CRT_AUTH_CD = A930TBT14_CRT_AUTH_CD ;
            Z927TBT14_KAKUNIN_FLG = A927TBT14_KAKUNIN_FLG ;
            Z931TBT14_KAKUNIN_USER_ID = A931TBT14_KAKUNIN_USER_ID ;
            Z933TBT14_KAKUNIN_COMMENT = A933TBT14_KAKUNIN_COMMENT ;
            Z924TBT14_KANRYO_FLG = A924TBT14_KANRYO_FLG ;
            Z337TBT14_DEL_FLG = A337TBT14_DEL_FLG ;
            Z340TBT14_CRT_PROG_NM = A340TBT14_CRT_PROG_NM ;
            Z343TBT14_UPD_PROG_NM = A343TBT14_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z922TBT14_MEMO_NO = A922TBT14_MEMO_NO ;
         Z338TBT14_CRT_DATETIME = A338TBT14_CRT_DATETIME ;
         Z339TBT14_CRT_USER_ID = A339TBT14_CRT_USER_ID ;
         Z341TBT14_UPD_DATETIME = A341TBT14_UPD_DATETIME ;
         Z342TBT14_UPD_USER_ID = A342TBT14_UPD_USER_ID ;
         Z344TBT14_UPD_CNT = A344TBT14_UPD_CNT ;
         Z331TBT14_CRF_ID = A331TBT14_CRF_ID ;
         Z332TBT14_CRF_VERSION = A332TBT14_CRF_VERSION ;
         Z923TBT14_MEMO_KBN = A923TBT14_MEMO_KBN ;
         Z335TBT14_MEMO = A335TBT14_MEMO ;
         Z928TBT14_REQUEST_SITE_ID = A928TBT14_REQUEST_SITE_ID ;
         Z929TBT14_REQUEST_AUTH_CD = A929TBT14_REQUEST_AUTH_CD ;
         Z930TBT14_CRT_AUTH_CD = A930TBT14_CRT_AUTH_CD ;
         Z927TBT14_KAKUNIN_FLG = A927TBT14_KAKUNIN_FLG ;
         Z931TBT14_KAKUNIN_USER_ID = A931TBT14_KAKUNIN_USER_ID ;
         Z933TBT14_KAKUNIN_COMMENT = A933TBT14_KAKUNIN_COMMENT ;
         Z924TBT14_KANRYO_FLG = A924TBT14_KANRYO_FLG ;
         Z337TBT14_DEL_FLG = A337TBT14_DEL_FLG ;
         Z340TBT14_CRT_PROG_NM = A340TBT14_CRT_PROG_NM ;
         Z343TBT14_UPD_PROG_NM = A343TBT14_UPD_PROG_NM ;
         Z329TBT14_STUDY_ID = A329TBT14_STUDY_ID ;
         Z330TBT14_SUBJECT_ID = A330TBT14_SUBJECT_ID ;
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
      pr_default.execute(3, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A338TBT14_CRT_DATETIME = T000S5_A338TBT14_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A338TBT14_CRT_DATETIME", localUtil.ttoc( A338TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n338TBT14_CRT_DATETIME = T000S5_n338TBT14_CRT_DATETIME[0] ;
         A339TBT14_CRT_USER_ID = T000S5_A339TBT14_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A339TBT14_CRT_USER_ID", A339TBT14_CRT_USER_ID);
         n339TBT14_CRT_USER_ID = T000S5_n339TBT14_CRT_USER_ID[0] ;
         A341TBT14_UPD_DATETIME = T000S5_A341TBT14_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A341TBT14_UPD_DATETIME", localUtil.ttoc( A341TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n341TBT14_UPD_DATETIME = T000S5_n341TBT14_UPD_DATETIME[0] ;
         A342TBT14_UPD_USER_ID = T000S5_A342TBT14_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A342TBT14_UPD_USER_ID", A342TBT14_UPD_USER_ID);
         n342TBT14_UPD_USER_ID = T000S5_n342TBT14_UPD_USER_ID[0] ;
         A344TBT14_UPD_CNT = T000S5_A344TBT14_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A344TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A344TBT14_UPD_CNT, 10, 0)));
         n344TBT14_UPD_CNT = T000S5_n344TBT14_UPD_CNT[0] ;
         A331TBT14_CRF_ID = T000S5_A331TBT14_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A331TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A331TBT14_CRF_ID, 4, 0)));
         n331TBT14_CRF_ID = T000S5_n331TBT14_CRF_ID[0] ;
         A332TBT14_CRF_VERSION = T000S5_A332TBT14_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332TBT14_CRF_VERSION", GXutil.ltrim( GXutil.str( A332TBT14_CRF_VERSION, 4, 0)));
         n332TBT14_CRF_VERSION = T000S5_n332TBT14_CRF_VERSION[0] ;
         A923TBT14_MEMO_KBN = T000S5_A923TBT14_MEMO_KBN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A923TBT14_MEMO_KBN", A923TBT14_MEMO_KBN);
         n923TBT14_MEMO_KBN = T000S5_n923TBT14_MEMO_KBN[0] ;
         A335TBT14_MEMO = T000S5_A335TBT14_MEMO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335TBT14_MEMO", A335TBT14_MEMO);
         n335TBT14_MEMO = T000S5_n335TBT14_MEMO[0] ;
         A928TBT14_REQUEST_SITE_ID = T000S5_A928TBT14_REQUEST_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_REQUEST_SITE_ID", A928TBT14_REQUEST_SITE_ID);
         n928TBT14_REQUEST_SITE_ID = T000S5_n928TBT14_REQUEST_SITE_ID[0] ;
         A929TBT14_REQUEST_AUTH_CD = T000S5_A929TBT14_REQUEST_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_AUTH_CD", A929TBT14_REQUEST_AUTH_CD);
         n929TBT14_REQUEST_AUTH_CD = T000S5_n929TBT14_REQUEST_AUTH_CD[0] ;
         A930TBT14_CRT_AUTH_CD = T000S5_A930TBT14_CRT_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_CRT_AUTH_CD", A930TBT14_CRT_AUTH_CD);
         n930TBT14_CRT_AUTH_CD = T000S5_n930TBT14_CRT_AUTH_CD[0] ;
         A927TBT14_KAKUNIN_FLG = T000S5_A927TBT14_KAKUNIN_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
         n927TBT14_KAKUNIN_FLG = T000S5_n927TBT14_KAKUNIN_FLG[0] ;
         A931TBT14_KAKUNIN_USER_ID = T000S5_A931TBT14_KAKUNIN_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A931TBT14_KAKUNIN_USER_ID", A931TBT14_KAKUNIN_USER_ID);
         n931TBT14_KAKUNIN_USER_ID = T000S5_n931TBT14_KAKUNIN_USER_ID[0] ;
         A933TBT14_KAKUNIN_COMMENT = T000S5_A933TBT14_KAKUNIN_COMMENT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A933TBT14_KAKUNIN_COMMENT", A933TBT14_KAKUNIN_COMMENT);
         n933TBT14_KAKUNIN_COMMENT = T000S5_n933TBT14_KAKUNIN_COMMENT[0] ;
         A924TBT14_KANRYO_FLG = T000S5_A924TBT14_KANRYO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A924TBT14_KANRYO_FLG", A924TBT14_KANRYO_FLG);
         n924TBT14_KANRYO_FLG = T000S5_n924TBT14_KANRYO_FLG[0] ;
         A337TBT14_DEL_FLG = T000S5_A337TBT14_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337TBT14_DEL_FLG", A337TBT14_DEL_FLG);
         n337TBT14_DEL_FLG = T000S5_n337TBT14_DEL_FLG[0] ;
         A340TBT14_CRT_PROG_NM = T000S5_A340TBT14_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A340TBT14_CRT_PROG_NM", A340TBT14_CRT_PROG_NM);
         n340TBT14_CRT_PROG_NM = T000S5_n340TBT14_CRT_PROG_NM[0] ;
         A343TBT14_UPD_PROG_NM = T000S5_A343TBT14_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A343TBT14_UPD_PROG_NM", A343TBT14_UPD_PROG_NM);
         n343TBT14_UPD_PROG_NM = T000S5_n343TBT14_UPD_PROG_NM[0] ;
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
      pr_default.execute(2, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError329 = 1 ;
         AnyError330 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFメモテーブル・患者サブタイプ'", "ForeignKeyNotFound", 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError329 == 0 ) && ( AnyError330 == 0 ) )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A338TBT14_CRT_DATETIME) || (( A338TBT14_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A338TBT14_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A341TBT14_UPD_DATETIME) || (( A341TBT14_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A341TBT14_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0S27( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A329TBT14_STUDY_ID ,
                         int A330TBT14_SUBJECT_ID )
   {
      /* Using cursor T000S6 */
      pr_default.execute(4, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         AnyError329 = 1 ;
         AnyError330 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFメモテーブル・患者サブタイプ'", "ForeignKeyNotFound", 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError329 == 0 ) && ( AnyError330 == 0 ) )
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

   public void getKey0S27( )
   {
      /* Using cursor T000S7 */
      pr_default.execute(5, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound27 = (short)(1) ;
      }
      else
      {
         RcdFound27 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000S3 */
      pr_default.execute(1, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0S27( 8) ;
         RcdFound27 = (short)(1) ;
         A922TBT14_MEMO_NO = T000S3_A922TBT14_MEMO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
         A338TBT14_CRT_DATETIME = T000S3_A338TBT14_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A338TBT14_CRT_DATETIME", localUtil.ttoc( A338TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n338TBT14_CRT_DATETIME = T000S3_n338TBT14_CRT_DATETIME[0] ;
         A339TBT14_CRT_USER_ID = T000S3_A339TBT14_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A339TBT14_CRT_USER_ID", A339TBT14_CRT_USER_ID);
         n339TBT14_CRT_USER_ID = T000S3_n339TBT14_CRT_USER_ID[0] ;
         A341TBT14_UPD_DATETIME = T000S3_A341TBT14_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A341TBT14_UPD_DATETIME", localUtil.ttoc( A341TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n341TBT14_UPD_DATETIME = T000S3_n341TBT14_UPD_DATETIME[0] ;
         A342TBT14_UPD_USER_ID = T000S3_A342TBT14_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A342TBT14_UPD_USER_ID", A342TBT14_UPD_USER_ID);
         n342TBT14_UPD_USER_ID = T000S3_n342TBT14_UPD_USER_ID[0] ;
         A344TBT14_UPD_CNT = T000S3_A344TBT14_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A344TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A344TBT14_UPD_CNT, 10, 0)));
         n344TBT14_UPD_CNT = T000S3_n344TBT14_UPD_CNT[0] ;
         A331TBT14_CRF_ID = T000S3_A331TBT14_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A331TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A331TBT14_CRF_ID, 4, 0)));
         n331TBT14_CRF_ID = T000S3_n331TBT14_CRF_ID[0] ;
         A332TBT14_CRF_VERSION = T000S3_A332TBT14_CRF_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332TBT14_CRF_VERSION", GXutil.ltrim( GXutil.str( A332TBT14_CRF_VERSION, 4, 0)));
         n332TBT14_CRF_VERSION = T000S3_n332TBT14_CRF_VERSION[0] ;
         A923TBT14_MEMO_KBN = T000S3_A923TBT14_MEMO_KBN[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A923TBT14_MEMO_KBN", A923TBT14_MEMO_KBN);
         n923TBT14_MEMO_KBN = T000S3_n923TBT14_MEMO_KBN[0] ;
         A335TBT14_MEMO = T000S3_A335TBT14_MEMO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A335TBT14_MEMO", A335TBT14_MEMO);
         n335TBT14_MEMO = T000S3_n335TBT14_MEMO[0] ;
         A928TBT14_REQUEST_SITE_ID = T000S3_A928TBT14_REQUEST_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_REQUEST_SITE_ID", A928TBT14_REQUEST_SITE_ID);
         n928TBT14_REQUEST_SITE_ID = T000S3_n928TBT14_REQUEST_SITE_ID[0] ;
         A929TBT14_REQUEST_AUTH_CD = T000S3_A929TBT14_REQUEST_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_AUTH_CD", A929TBT14_REQUEST_AUTH_CD);
         n929TBT14_REQUEST_AUTH_CD = T000S3_n929TBT14_REQUEST_AUTH_CD[0] ;
         A930TBT14_CRT_AUTH_CD = T000S3_A930TBT14_CRT_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_CRT_AUTH_CD", A930TBT14_CRT_AUTH_CD);
         n930TBT14_CRT_AUTH_CD = T000S3_n930TBT14_CRT_AUTH_CD[0] ;
         A927TBT14_KAKUNIN_FLG = T000S3_A927TBT14_KAKUNIN_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
         n927TBT14_KAKUNIN_FLG = T000S3_n927TBT14_KAKUNIN_FLG[0] ;
         A931TBT14_KAKUNIN_USER_ID = T000S3_A931TBT14_KAKUNIN_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A931TBT14_KAKUNIN_USER_ID", A931TBT14_KAKUNIN_USER_ID);
         n931TBT14_KAKUNIN_USER_ID = T000S3_n931TBT14_KAKUNIN_USER_ID[0] ;
         A933TBT14_KAKUNIN_COMMENT = T000S3_A933TBT14_KAKUNIN_COMMENT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A933TBT14_KAKUNIN_COMMENT", A933TBT14_KAKUNIN_COMMENT);
         n933TBT14_KAKUNIN_COMMENT = T000S3_n933TBT14_KAKUNIN_COMMENT[0] ;
         A924TBT14_KANRYO_FLG = T000S3_A924TBT14_KANRYO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A924TBT14_KANRYO_FLG", A924TBT14_KANRYO_FLG);
         n924TBT14_KANRYO_FLG = T000S3_n924TBT14_KANRYO_FLG[0] ;
         A337TBT14_DEL_FLG = T000S3_A337TBT14_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A337TBT14_DEL_FLG", A337TBT14_DEL_FLG);
         n337TBT14_DEL_FLG = T000S3_n337TBT14_DEL_FLG[0] ;
         A340TBT14_CRT_PROG_NM = T000S3_A340TBT14_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A340TBT14_CRT_PROG_NM", A340TBT14_CRT_PROG_NM);
         n340TBT14_CRT_PROG_NM = T000S3_n340TBT14_CRT_PROG_NM[0] ;
         A343TBT14_UPD_PROG_NM = T000S3_A343TBT14_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A343TBT14_UPD_PROG_NM", A343TBT14_UPD_PROG_NM);
         n343TBT14_UPD_PROG_NM = T000S3_n343TBT14_UPD_PROG_NM[0] ;
         A329TBT14_STUDY_ID = T000S3_A329TBT14_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
         A330TBT14_SUBJECT_ID = T000S3_A330TBT14_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
         O344TBT14_UPD_CNT = A344TBT14_UPD_CNT ;
         n344TBT14_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A344TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A344TBT14_UPD_CNT, 10, 0)));
         Z329TBT14_STUDY_ID = A329TBT14_STUDY_ID ;
         Z330TBT14_SUBJECT_ID = A330TBT14_SUBJECT_ID ;
         Z922TBT14_MEMO_NO = A922TBT14_MEMO_NO ;
         sMode27 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0S27( ) ;
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
      /* Using cursor T000S8 */
      pr_default.execute(6, new Object[] {new Long(A329TBT14_STUDY_ID), new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Integer(A330TBT14_SUBJECT_ID), new Long(A329TBT14_STUDY_ID), new Short(A922TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000S8_A329TBT14_STUDY_ID[0] < A329TBT14_STUDY_ID ) || ( T000S8_A329TBT14_STUDY_ID[0] == A329TBT14_STUDY_ID ) && ( T000S8_A330TBT14_SUBJECT_ID[0] < A330TBT14_SUBJECT_ID ) || ( T000S8_A330TBT14_SUBJECT_ID[0] == A330TBT14_SUBJECT_ID ) && ( T000S8_A329TBT14_STUDY_ID[0] == A329TBT14_STUDY_ID ) && ( T000S8_A922TBT14_MEMO_NO[0] < A922TBT14_MEMO_NO ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000S8_A329TBT14_STUDY_ID[0] > A329TBT14_STUDY_ID ) || ( T000S8_A329TBT14_STUDY_ID[0] == A329TBT14_STUDY_ID ) && ( T000S8_A330TBT14_SUBJECT_ID[0] > A330TBT14_SUBJECT_ID ) || ( T000S8_A330TBT14_SUBJECT_ID[0] == A330TBT14_SUBJECT_ID ) && ( T000S8_A329TBT14_STUDY_ID[0] == A329TBT14_STUDY_ID ) && ( T000S8_A922TBT14_MEMO_NO[0] > A922TBT14_MEMO_NO ) ) )
         {
            A329TBT14_STUDY_ID = T000S8_A329TBT14_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
            A330TBT14_SUBJECT_ID = T000S8_A330TBT14_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
            A922TBT14_MEMO_NO = T000S8_A922TBT14_MEMO_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound27 = (short)(0) ;
      /* Using cursor T000S9 */
      pr_default.execute(7, new Object[] {new Long(A329TBT14_STUDY_ID), new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Integer(A330TBT14_SUBJECT_ID), new Long(A329TBT14_STUDY_ID), new Short(A922TBT14_MEMO_NO)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000S9_A329TBT14_STUDY_ID[0] > A329TBT14_STUDY_ID ) || ( T000S9_A329TBT14_STUDY_ID[0] == A329TBT14_STUDY_ID ) && ( T000S9_A330TBT14_SUBJECT_ID[0] > A330TBT14_SUBJECT_ID ) || ( T000S9_A330TBT14_SUBJECT_ID[0] == A330TBT14_SUBJECT_ID ) && ( T000S9_A329TBT14_STUDY_ID[0] == A329TBT14_STUDY_ID ) && ( T000S9_A922TBT14_MEMO_NO[0] > A922TBT14_MEMO_NO ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000S9_A329TBT14_STUDY_ID[0] < A329TBT14_STUDY_ID ) || ( T000S9_A329TBT14_STUDY_ID[0] == A329TBT14_STUDY_ID ) && ( T000S9_A330TBT14_SUBJECT_ID[0] < A330TBT14_SUBJECT_ID ) || ( T000S9_A330TBT14_SUBJECT_ID[0] == A330TBT14_SUBJECT_ID ) && ( T000S9_A329TBT14_STUDY_ID[0] == A329TBT14_STUDY_ID ) && ( T000S9_A922TBT14_MEMO_NO[0] < A922TBT14_MEMO_NO ) ) )
         {
            A329TBT14_STUDY_ID = T000S9_A329TBT14_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
            A330TBT14_SUBJECT_ID = T000S9_A330TBT14_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
            A922TBT14_MEMO_NO = T000S9_A922TBT14_MEMO_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
            RcdFound27 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0S27( ) ;
      if ( RcdFound27 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBT14_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A329TBT14_STUDY_ID != Z329TBT14_STUDY_ID ) || ( A330TBT14_SUBJECT_ID != Z330TBT14_SUBJECT_ID ) || ( A922TBT14_MEMO_NO != Z922TBT14_MEMO_NO ) )
         {
            A329TBT14_STUDY_ID = Z329TBT14_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
            A330TBT14_SUBJECT_ID = Z330TBT14_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
            A922TBT14_MEMO_NO = Z922TBT14_MEMO_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
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
         if ( ( A329TBT14_STUDY_ID != Z329TBT14_STUDY_ID ) || ( A330TBT14_SUBJECT_ID != Z330TBT14_SUBJECT_ID ) || ( A922TBT14_MEMO_NO != Z922TBT14_MEMO_NO ) )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( ( A329TBT14_STUDY_ID != Z329TBT14_STUDY_ID ) || ( A330TBT14_SUBJECT_ID != Z330TBT14_SUBJECT_ID ) || ( A922TBT14_MEMO_NO != Z922TBT14_MEMO_NO ) )
      {
         A329TBT14_STUDY_ID = Z329TBT14_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
         A330TBT14_SUBJECT_ID = Z330TBT14_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
         A922TBT14_MEMO_NO = Z922TBT14_MEMO_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
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
      scanStart0S27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart0S27( ) ;
      if ( RcdFound27 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(0, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT14_CRF_MEMO"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z338TBT14_CRT_DATETIME.equals( T000S2_A338TBT14_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z339TBT14_CRT_USER_ID, T000S2_A339TBT14_CRT_USER_ID[0]) != 0 ) || !( Z341TBT14_UPD_DATETIME.equals( T000S2_A341TBT14_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z342TBT14_UPD_USER_ID, T000S2_A342TBT14_UPD_USER_ID[0]) != 0 ) || ( Z344TBT14_UPD_CNT != T000S2_A344TBT14_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z331TBT14_CRF_ID != T000S2_A331TBT14_CRF_ID[0] ) || ( Z332TBT14_CRF_VERSION != T000S2_A332TBT14_CRF_VERSION[0] ) || ( GXutil.strcmp(Z923TBT14_MEMO_KBN, T000S2_A923TBT14_MEMO_KBN[0]) != 0 ) || ( GXutil.strcmp(Z335TBT14_MEMO, T000S2_A335TBT14_MEMO[0]) != 0 ) || ( GXutil.strcmp(Z928TBT14_REQUEST_SITE_ID, T000S2_A928TBT14_REQUEST_SITE_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z929TBT14_REQUEST_AUTH_CD, T000S2_A929TBT14_REQUEST_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z930TBT14_CRT_AUTH_CD, T000S2_A930TBT14_CRT_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z927TBT14_KAKUNIN_FLG, T000S2_A927TBT14_KAKUNIN_FLG[0]) != 0 ) || ( GXutil.strcmp(Z931TBT14_KAKUNIN_USER_ID, T000S2_A931TBT14_KAKUNIN_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z933TBT14_KAKUNIN_COMMENT, T000S2_A933TBT14_KAKUNIN_COMMENT[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z924TBT14_KANRYO_FLG, T000S2_A924TBT14_KANRYO_FLG[0]) != 0 ) || ( GXutil.strcmp(Z337TBT14_DEL_FLG, T000S2_A337TBT14_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z340TBT14_CRT_PROG_NM, T000S2_A340TBT14_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z343TBT14_UPD_PROG_NM, T000S2_A343TBT14_UPD_PROG_NM[0]) != 0 ) )
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
                  /* Using cursor T000S10 */
                  pr_default.execute(8, new Object[] {new Short(A922TBT14_MEMO_NO), new Boolean(n338TBT14_CRT_DATETIME), A338TBT14_CRT_DATETIME, new Boolean(n339TBT14_CRT_USER_ID), A339TBT14_CRT_USER_ID, new Boolean(n341TBT14_UPD_DATETIME), A341TBT14_UPD_DATETIME, new Boolean(n342TBT14_UPD_USER_ID), A342TBT14_UPD_USER_ID, new Boolean(n344TBT14_UPD_CNT), new Long(A344TBT14_UPD_CNT), new Boolean(n331TBT14_CRF_ID), new Short(A331TBT14_CRF_ID), new Boolean(n332TBT14_CRF_VERSION), new Short(A332TBT14_CRF_VERSION), new Boolean(n923TBT14_MEMO_KBN), A923TBT14_MEMO_KBN, new Boolean(n335TBT14_MEMO), A335TBT14_MEMO, new Boolean(n928TBT14_REQUEST_SITE_ID), A928TBT14_REQUEST_SITE_ID, new Boolean(n929TBT14_REQUEST_AUTH_CD), A929TBT14_REQUEST_AUTH_CD, new Boolean(n930TBT14_CRT_AUTH_CD), A930TBT14_CRT_AUTH_CD, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n931TBT14_KAKUNIN_USER_ID), A931TBT14_KAKUNIN_USER_ID, new Boolean(n933TBT14_KAKUNIN_COMMENT), A933TBT14_KAKUNIN_COMMENT, new Boolean(n924TBT14_KANRYO_FLG), A924TBT14_KANRYO_FLG, new Boolean(n337TBT14_DEL_FLG), A337TBT14_DEL_FLG, new Boolean(n340TBT14_CRT_PROG_NM), A340TBT14_CRT_PROG_NM, new Boolean(n343TBT14_UPD_PROG_NM), A343TBT14_UPD_PROG_NM, new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID)});
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
                  /* Using cursor T000S11 */
                  pr_default.execute(9, new Object[] {new Boolean(n338TBT14_CRT_DATETIME), A338TBT14_CRT_DATETIME, new Boolean(n339TBT14_CRT_USER_ID), A339TBT14_CRT_USER_ID, new Boolean(n341TBT14_UPD_DATETIME), A341TBT14_UPD_DATETIME, new Boolean(n342TBT14_UPD_USER_ID), A342TBT14_UPD_USER_ID, new Boolean(n344TBT14_UPD_CNT), new Long(A344TBT14_UPD_CNT), new Boolean(n331TBT14_CRF_ID), new Short(A331TBT14_CRF_ID), new Boolean(n332TBT14_CRF_VERSION), new Short(A332TBT14_CRF_VERSION), new Boolean(n923TBT14_MEMO_KBN), A923TBT14_MEMO_KBN, new Boolean(n335TBT14_MEMO), A335TBT14_MEMO, new Boolean(n928TBT14_REQUEST_SITE_ID), A928TBT14_REQUEST_SITE_ID, new Boolean(n929TBT14_REQUEST_AUTH_CD), A929TBT14_REQUEST_AUTH_CD, new Boolean(n930TBT14_CRT_AUTH_CD), A930TBT14_CRT_AUTH_CD, new Boolean(n927TBT14_KAKUNIN_FLG), A927TBT14_KAKUNIN_FLG, new Boolean(n931TBT14_KAKUNIN_USER_ID), A931TBT14_KAKUNIN_USER_ID, new Boolean(n933TBT14_KAKUNIN_COMMENT), A933TBT14_KAKUNIN_COMMENT, new Boolean(n924TBT14_KANRYO_FLG), A924TBT14_KANRYO_FLG, new Boolean(n337TBT14_DEL_FLG), A337TBT14_DEL_FLG, new Boolean(n340TBT14_CRT_PROG_NM), A340TBT14_CRT_PROG_NM, new Boolean(n343TBT14_UPD_PROG_NM), A343TBT14_UPD_PROG_NM, new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
                  if ( (pr_default.getStatus(9) == 103) )
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               /* Using cursor T000S12 */
               pr_default.execute(10, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
         /* Using cursor T000S13 */
         pr_default.execute(11, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID), new Short(A922TBT14_MEMO_NO)});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRFメモ位置テーブル"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
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
      /* Using cursor T000S14 */
      pr_default.execute(12);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A329TBT14_STUDY_ID = T000S14_A329TBT14_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
         A330TBT14_SUBJECT_ID = T000S14_A330TBT14_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
         A922TBT14_MEMO_NO = T000S14_A922TBT14_MEMO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0S27( )
   {
      pr_default.readNext(12);
      RcdFound27 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound27 = (short)(1) ;
         A329TBT14_STUDY_ID = T000S14_A329TBT14_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
         A330TBT14_SUBJECT_ID = T000S14_A330TBT14_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
         A922TBT14_MEMO_NO = T000S14_A922TBT14_MEMO_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
      }
   }

   public void scanEnd0S27( )
   {
      pr_default.close(12);
   }

   public void afterConfirm0S27( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0S27( )
   {
      /* Before Insert Rules */
      A338TBT14_CRT_DATETIME = GXutil.now( ) ;
      n338TBT14_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A338TBT14_CRT_DATETIME", localUtil.ttoc( A338TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A339TBT14_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt14_crf_memo_impl.this.GXt_char3 = GXv_char4[0] ;
      A339TBT14_CRT_USER_ID = GXt_char3 ;
      n339TBT14_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A339TBT14_CRT_USER_ID", A339TBT14_CRT_USER_ID);
      A341TBT14_UPD_DATETIME = GXutil.now( ) ;
      n341TBT14_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A341TBT14_UPD_DATETIME", localUtil.ttoc( A341TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A342TBT14_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt14_crf_memo_impl.this.GXt_char3 = GXv_char4[0] ;
      A342TBT14_UPD_USER_ID = GXt_char3 ;
      n342TBT14_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A342TBT14_UPD_USER_ID", A342TBT14_UPD_USER_ID);
      A344TBT14_UPD_CNT = (long)(O344TBT14_UPD_CNT+1) ;
      n344TBT14_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A344TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A344TBT14_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0S27( )
   {
      /* Before Update Rules */
      A341TBT14_UPD_DATETIME = GXutil.now( ) ;
      n341TBT14_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A341TBT14_UPD_DATETIME", localUtil.ttoc( A341TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A342TBT14_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt14_crf_memo_impl.this.GXt_char3 = GXv_char4[0] ;
      A342TBT14_UPD_USER_ID = GXt_char3 ;
      n342TBT14_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A342TBT14_UPD_USER_ID", A342TBT14_UPD_USER_ID);
      A344TBT14_UPD_CNT = (long)(O344TBT14_UPD_CNT+1) ;
      n344TBT14_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A344TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A344TBT14_UPD_CNT, 10, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRFメモテーブル") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbt14_crf_memo") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0S27( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z329TBT14_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z329TBT14_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z330TBT14_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z330TBT14_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z922TBT14_MEMO_NO", GXutil.ltrim( localUtil.ntoc( Z922TBT14_MEMO_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z338TBT14_CRT_DATETIME", localUtil.ttoc( Z338TBT14_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z339TBT14_CRT_USER_ID", GXutil.rtrim( Z339TBT14_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z341TBT14_UPD_DATETIME", localUtil.ttoc( Z341TBT14_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z342TBT14_UPD_USER_ID", GXutil.rtrim( Z342TBT14_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z344TBT14_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z344TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z331TBT14_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z331TBT14_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z332TBT14_CRF_VERSION", GXutil.ltrim( localUtil.ntoc( Z332TBT14_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z923TBT14_MEMO_KBN", GXutil.rtrim( Z923TBT14_MEMO_KBN));
      GxWebStd.gx_hidden_field( httpContext, "Z335TBT14_MEMO", GXutil.rtrim( Z335TBT14_MEMO));
      GxWebStd.gx_hidden_field( httpContext, "Z928TBT14_REQUEST_SITE_ID", GXutil.rtrim( Z928TBT14_REQUEST_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z929TBT14_REQUEST_AUTH_CD", GXutil.rtrim( Z929TBT14_REQUEST_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z930TBT14_CRT_AUTH_CD", GXutil.rtrim( Z930TBT14_CRT_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z927TBT14_KAKUNIN_FLG", GXutil.rtrim( Z927TBT14_KAKUNIN_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z931TBT14_KAKUNIN_USER_ID", GXutil.rtrim( Z931TBT14_KAKUNIN_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z933TBT14_KAKUNIN_COMMENT", GXutil.rtrim( Z933TBT14_KAKUNIN_COMMENT));
      GxWebStd.gx_hidden_field( httpContext, "Z924TBT14_KANRYO_FLG", GXutil.rtrim( Z924TBT14_KANRYO_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z337TBT14_DEL_FLG", GXutil.rtrim( Z337TBT14_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z340TBT14_CRT_PROG_NM", GXutil.rtrim( Z340TBT14_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z343TBT14_UPD_PROG_NM", GXutil.rtrim( Z343TBT14_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O344TBT14_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O344TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0S27( )
   {
      A338TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n338TBT14_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A338TBT14_CRT_DATETIME", localUtil.ttoc( A338TBT14_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n338TBT14_CRT_DATETIME = (GXutil.nullDate().equals(A338TBT14_CRT_DATETIME) ? true : false) ;
      A339TBT14_CRT_USER_ID = "" ;
      n339TBT14_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A339TBT14_CRT_USER_ID", A339TBT14_CRT_USER_ID);
      n339TBT14_CRT_USER_ID = ((GXutil.strcmp("", A339TBT14_CRT_USER_ID)==0) ? true : false) ;
      A341TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n341TBT14_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A341TBT14_UPD_DATETIME", localUtil.ttoc( A341TBT14_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n341TBT14_UPD_DATETIME = (GXutil.nullDate().equals(A341TBT14_UPD_DATETIME) ? true : false) ;
      A342TBT14_UPD_USER_ID = "" ;
      n342TBT14_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A342TBT14_UPD_USER_ID", A342TBT14_UPD_USER_ID);
      n342TBT14_UPD_USER_ID = ((GXutil.strcmp("", A342TBT14_UPD_USER_ID)==0) ? true : false) ;
      A344TBT14_UPD_CNT = 0 ;
      n344TBT14_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A344TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A344TBT14_UPD_CNT, 10, 0)));
      n344TBT14_UPD_CNT = ((0==A344TBT14_UPD_CNT) ? true : false) ;
      A331TBT14_CRF_ID = (short)(0) ;
      n331TBT14_CRF_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A331TBT14_CRF_ID", GXutil.ltrim( GXutil.str( A331TBT14_CRF_ID, 4, 0)));
      n331TBT14_CRF_ID = ((0==A331TBT14_CRF_ID) ? true : false) ;
      A332TBT14_CRF_VERSION = (short)(0) ;
      n332TBT14_CRF_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A332TBT14_CRF_VERSION", GXutil.ltrim( GXutil.str( A332TBT14_CRF_VERSION, 4, 0)));
      n332TBT14_CRF_VERSION = ((0==A332TBT14_CRF_VERSION) ? true : false) ;
      A923TBT14_MEMO_KBN = "" ;
      n923TBT14_MEMO_KBN = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A923TBT14_MEMO_KBN", A923TBT14_MEMO_KBN);
      n923TBT14_MEMO_KBN = ((GXutil.strcmp("", A923TBT14_MEMO_KBN)==0) ? true : false) ;
      A335TBT14_MEMO = "" ;
      n335TBT14_MEMO = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A335TBT14_MEMO", A335TBT14_MEMO);
      n335TBT14_MEMO = ((GXutil.strcmp("", A335TBT14_MEMO)==0) ? true : false) ;
      A928TBT14_REQUEST_SITE_ID = "" ;
      n928TBT14_REQUEST_SITE_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A928TBT14_REQUEST_SITE_ID", A928TBT14_REQUEST_SITE_ID);
      n928TBT14_REQUEST_SITE_ID = ((GXutil.strcmp("", A928TBT14_REQUEST_SITE_ID)==0) ? true : false) ;
      A929TBT14_REQUEST_AUTH_CD = "" ;
      n929TBT14_REQUEST_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A929TBT14_REQUEST_AUTH_CD", A929TBT14_REQUEST_AUTH_CD);
      n929TBT14_REQUEST_AUTH_CD = ((GXutil.strcmp("", A929TBT14_REQUEST_AUTH_CD)==0) ? true : false) ;
      A930TBT14_CRT_AUTH_CD = "" ;
      n930TBT14_CRT_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A930TBT14_CRT_AUTH_CD", A930TBT14_CRT_AUTH_CD);
      n930TBT14_CRT_AUTH_CD = ((GXutil.strcmp("", A930TBT14_CRT_AUTH_CD)==0) ? true : false) ;
      A927TBT14_KAKUNIN_FLG = "" ;
      n927TBT14_KAKUNIN_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A927TBT14_KAKUNIN_FLG", A927TBT14_KAKUNIN_FLG);
      n927TBT14_KAKUNIN_FLG = ((GXutil.strcmp("", A927TBT14_KAKUNIN_FLG)==0) ? true : false) ;
      A931TBT14_KAKUNIN_USER_ID = "" ;
      n931TBT14_KAKUNIN_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A931TBT14_KAKUNIN_USER_ID", A931TBT14_KAKUNIN_USER_ID);
      n931TBT14_KAKUNIN_USER_ID = ((GXutil.strcmp("", A931TBT14_KAKUNIN_USER_ID)==0) ? true : false) ;
      A933TBT14_KAKUNIN_COMMENT = "" ;
      n933TBT14_KAKUNIN_COMMENT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A933TBT14_KAKUNIN_COMMENT", A933TBT14_KAKUNIN_COMMENT);
      n933TBT14_KAKUNIN_COMMENT = ((GXutil.strcmp("", A933TBT14_KAKUNIN_COMMENT)==0) ? true : false) ;
      A924TBT14_KANRYO_FLG = "" ;
      n924TBT14_KANRYO_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A924TBT14_KANRYO_FLG", A924TBT14_KANRYO_FLG);
      n924TBT14_KANRYO_FLG = ((GXutil.strcmp("", A924TBT14_KANRYO_FLG)==0) ? true : false) ;
      A337TBT14_DEL_FLG = "" ;
      n337TBT14_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A337TBT14_DEL_FLG", A337TBT14_DEL_FLG);
      n337TBT14_DEL_FLG = ((GXutil.strcmp("", A337TBT14_DEL_FLG)==0) ? true : false) ;
      A340TBT14_CRT_PROG_NM = "" ;
      n340TBT14_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A340TBT14_CRT_PROG_NM", A340TBT14_CRT_PROG_NM);
      n340TBT14_CRT_PROG_NM = ((GXutil.strcmp("", A340TBT14_CRT_PROG_NM)==0) ? true : false) ;
      A343TBT14_UPD_PROG_NM = "" ;
      n343TBT14_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A343TBT14_UPD_PROG_NM", A343TBT14_UPD_PROG_NM);
      n343TBT14_UPD_PROG_NM = ((GXutil.strcmp("", A343TBT14_UPD_PROG_NM)==0) ? true : false) ;
      O344TBT14_UPD_CNT = A344TBT14_UPD_CNT ;
      n344TBT14_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A344TBT14_UPD_CNT", GXutil.ltrim( GXutil.str( A344TBT14_UPD_CNT, 10, 0)));
   }

   public void initAll0S27( )
   {
      A329TBT14_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A329TBT14_STUDY_ID", GXutil.ltrim( GXutil.str( A329TBT14_STUDY_ID, 10, 0)));
      A330TBT14_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A330TBT14_SUBJECT_ID", GXutil.ltrim( GXutil.str( A330TBT14_SUBJECT_ID, 6, 0)));
      A922TBT14_MEMO_NO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A922TBT14_MEMO_NO", GXutil.ltrim( GXutil.str( A922TBT14_MEMO_NO, 3, 0)));
      initializeNonKey0S27( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14553948");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbt14_crf_memo.js", "?14553948");
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
      lblTextblocktbt14_study_id_Internalname = "TEXTBLOCKTBT14_STUDY_ID" ;
      edtTBT14_STUDY_ID_Internalname = "TBT14_STUDY_ID" ;
      lblTextblocktbt14_subject_id_Internalname = "TEXTBLOCKTBT14_SUBJECT_ID" ;
      edtTBT14_SUBJECT_ID_Internalname = "TBT14_SUBJECT_ID" ;
      lblTextblocktbt14_memo_no_Internalname = "TEXTBLOCKTBT14_MEMO_NO" ;
      edtTBT14_MEMO_NO_Internalname = "TBT14_MEMO_NO" ;
      lblTextblocktbt14_crf_id_Internalname = "TEXTBLOCKTBT14_CRF_ID" ;
      edtTBT14_CRF_ID_Internalname = "TBT14_CRF_ID" ;
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
      GXt_char3 = A339TBT14_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt14_crf_memo_impl.this.GXt_char3 = GXv_char4[0] ;
      A339TBT14_CRT_USER_ID = GXt_char3 ;
      n339TBT14_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A339TBT14_CRT_USER_ID", A339TBT14_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A339TBT14_CRT_USER_ID))+"\"");
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
      GXt_char3 = A342TBT14_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt14_crf_memo_impl.this.GXt_char3 = GXv_char4[0] ;
      A342TBT14_UPD_USER_ID = GXt_char3 ;
      n342TBT14_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A342TBT14_UPD_USER_ID", A342TBT14_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A342TBT14_UPD_USER_ID))+"\"");
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
      /* Using cursor T000S15 */
      pr_default.execute(13, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         AnyError329 = 1 ;
         AnyError330 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFメモテーブル・患者サブタイプ'", "ForeignKeyNotFound", 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError329 == 0 ) && ( AnyError330 == 0 ) )
      {
      }
      pr_default.close(13);
      GX_FocusControl = edtTBT14_CRF_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbt14_subject_id( long GX_Parm1 ,
                                       int GX_Parm2 )
   {
      A329TBT14_STUDY_ID = GX_Parm1 ;
      A330TBT14_SUBJECT_ID = GX_Parm2 ;
      /* Using cursor T000S15 */
      pr_default.execute(13, new Object[] {new Long(A329TBT14_STUDY_ID), new Integer(A330TBT14_SUBJECT_ID)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         AnyError329 = 1 ;
         AnyError330 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFメモテーブル・患者サブタイプ'", "ForeignKeyNotFound", 1, "TBT14_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT14_STUDY_ID_Internalname ;
      }
      if ( ( AnyError329 == 0 ) && ( AnyError330 == 0 ) )
      {
      }
      pr_default.close(13);
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
                                    short GX_Parm10 ,
                                    String GX_Parm11 ,
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
                                    String GX_Parm22 )
   {
      A329TBT14_STUDY_ID = GX_Parm1 ;
      A330TBT14_SUBJECT_ID = GX_Parm2 ;
      A922TBT14_MEMO_NO = GX_Parm3 ;
      A338TBT14_CRT_DATETIME = GX_Parm4 ;
      n338TBT14_CRT_DATETIME = false ;
      A339TBT14_CRT_USER_ID = GX_Parm5 ;
      n339TBT14_CRT_USER_ID = false ;
      A341TBT14_UPD_DATETIME = GX_Parm6 ;
      n341TBT14_UPD_DATETIME = false ;
      A342TBT14_UPD_USER_ID = GX_Parm7 ;
      n342TBT14_UPD_USER_ID = false ;
      A344TBT14_UPD_CNT = GX_Parm8 ;
      n344TBT14_UPD_CNT = false ;
      A331TBT14_CRF_ID = GX_Parm9 ;
      n331TBT14_CRF_ID = false ;
      A332TBT14_CRF_VERSION = GX_Parm10 ;
      n332TBT14_CRF_VERSION = false ;
      A923TBT14_MEMO_KBN = GX_Parm11 ;
      n923TBT14_MEMO_KBN = false ;
      A335TBT14_MEMO = GX_Parm12 ;
      n335TBT14_MEMO = false ;
      A928TBT14_REQUEST_SITE_ID = GX_Parm13 ;
      n928TBT14_REQUEST_SITE_ID = false ;
      A929TBT14_REQUEST_AUTH_CD = GX_Parm14 ;
      n929TBT14_REQUEST_AUTH_CD = false ;
      A930TBT14_CRT_AUTH_CD = GX_Parm15 ;
      n930TBT14_CRT_AUTH_CD = false ;
      A927TBT14_KAKUNIN_FLG = GX_Parm16 ;
      n927TBT14_KAKUNIN_FLG = false ;
      A931TBT14_KAKUNIN_USER_ID = GX_Parm17 ;
      n931TBT14_KAKUNIN_USER_ID = false ;
      A933TBT14_KAKUNIN_COMMENT = GX_Parm18 ;
      n933TBT14_KAKUNIN_COMMENT = false ;
      A924TBT14_KANRYO_FLG = GX_Parm19 ;
      n924TBT14_KANRYO_FLG = false ;
      A337TBT14_DEL_FLG = GX_Parm20 ;
      n337TBT14_DEL_FLG = false ;
      A340TBT14_CRT_PROG_NM = GX_Parm21 ;
      n340TBT14_CRT_PROG_NM = false ;
      A343TBT14_UPD_PROG_NM = GX_Parm22 ;
      n343TBT14_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A338TBT14_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A339TBT14_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A341TBT14_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A342TBT14_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A344TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A331TBT14_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A332TBT14_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A923TBT14_MEMO_KBN));
      isValidOutput.add(GXutil.rtrim( A335TBT14_MEMO));
      isValidOutput.add(GXutil.rtrim( A928TBT14_REQUEST_SITE_ID));
      isValidOutput.add(GXutil.rtrim( A929TBT14_REQUEST_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A930TBT14_CRT_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A927TBT14_KAKUNIN_FLG));
      isValidOutput.add(GXutil.rtrim( A931TBT14_KAKUNIN_USER_ID));
      isValidOutput.add(GXutil.rtrim( A933TBT14_KAKUNIN_COMMENT));
      isValidOutput.add(GXutil.rtrim( A924TBT14_KANRYO_FLG));
      isValidOutput.add(GXutil.rtrim( A337TBT14_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A340TBT14_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A343TBT14_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z329TBT14_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z330TBT14_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z922TBT14_MEMO_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z338TBT14_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z339TBT14_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z341TBT14_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z342TBT14_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z344TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z331TBT14_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z332TBT14_CRF_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z923TBT14_MEMO_KBN));
      isValidOutput.add(GXutil.rtrim( Z335TBT14_MEMO));
      isValidOutput.add(GXutil.rtrim( Z928TBT14_REQUEST_SITE_ID));
      isValidOutput.add(GXutil.rtrim( Z929TBT14_REQUEST_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z930TBT14_CRT_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z927TBT14_KAKUNIN_FLG));
      isValidOutput.add(GXutil.rtrim( Z931TBT14_KAKUNIN_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z933TBT14_KAKUNIN_COMMENT));
      isValidOutput.add(GXutil.rtrim( Z924TBT14_KANRYO_FLG));
      isValidOutput.add(GXutil.rtrim( Z337TBT14_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z340TBT14_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z343TBT14_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O344TBT14_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1173 */
                  S1173 ();
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
      lblTextblocktbt14_study_id_Jsonclick = "" ;
      lblTextblocktbt14_subject_id_Jsonclick = "" ;
      lblTextblocktbt14_memo_no_Jsonclick = "" ;
      lblTextblocktbt14_crf_id_Jsonclick = "" ;
      lblTextblocktbt14_crf_version_Jsonclick = "" ;
      lblTextblocktbt14_memo_kbn_Jsonclick = "" ;
      A923TBT14_MEMO_KBN = "" ;
      lblTextblocktbt14_memo_Jsonclick = "" ;
      A335TBT14_MEMO = "" ;
      lblTextblocktbt14_request_site_id_Jsonclick = "" ;
      A928TBT14_REQUEST_SITE_ID = "" ;
      lblTextblocktbt14_request_auth_cd_Jsonclick = "" ;
      A929TBT14_REQUEST_AUTH_CD = "" ;
      lblTextblocktbt14_crt_auth_cd_Jsonclick = "" ;
      A930TBT14_CRT_AUTH_CD = "" ;
      lblTextblocktbt14_kakunin_flg_Jsonclick = "" ;
      A927TBT14_KAKUNIN_FLG = "" ;
      lblTextblocktbt14_kakunin_user_id_Jsonclick = "" ;
      A931TBT14_KAKUNIN_USER_ID = "" ;
      lblTextblocktbt14_kakunin_comment_Jsonclick = "" ;
      A933TBT14_KAKUNIN_COMMENT = "" ;
      lblTextblocktbt14_kanryo_flg_Jsonclick = "" ;
      A924TBT14_KANRYO_FLG = "" ;
      lblTextblocktbt14_del_flg_Jsonclick = "" ;
      A337TBT14_DEL_FLG = "" ;
      lblTextblocktbt14_crt_datetime_Jsonclick = "" ;
      A338TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt14_crt_user_id_Jsonclick = "" ;
      A339TBT14_CRT_USER_ID = "" ;
      lblTextblocktbt14_crt_prog_nm_Jsonclick = "" ;
      A340TBT14_CRT_PROG_NM = "" ;
      lblTextblocktbt14_upd_datetime_Jsonclick = "" ;
      A341TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt14_upd_user_id_Jsonclick = "" ;
      A342TBT14_UPD_USER_ID = "" ;
      lblTextblocktbt14_upd_prog_nm_Jsonclick = "" ;
      A343TBT14_UPD_PROG_NM = "" ;
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
      Z338TBT14_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z339TBT14_CRT_USER_ID = "" ;
      Z341TBT14_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z342TBT14_UPD_USER_ID = "" ;
      Z923TBT14_MEMO_KBN = "" ;
      Z335TBT14_MEMO = "" ;
      Z928TBT14_REQUEST_SITE_ID = "" ;
      Z929TBT14_REQUEST_AUTH_CD = "" ;
      Z930TBT14_CRT_AUTH_CD = "" ;
      Z927TBT14_KAKUNIN_FLG = "" ;
      Z931TBT14_KAKUNIN_USER_ID = "" ;
      Z933TBT14_KAKUNIN_COMMENT = "" ;
      Z924TBT14_KANRYO_FLG = "" ;
      Z337TBT14_DEL_FLG = "" ;
      Z340TBT14_CRT_PROG_NM = "" ;
      Z343TBT14_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T000S5_A922TBT14_MEMO_NO = new short[1] ;
      T000S5_A338TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S5_n338TBT14_CRT_DATETIME = new boolean[] {false} ;
      T000S5_A339TBT14_CRT_USER_ID = new String[] {""} ;
      T000S5_n339TBT14_CRT_USER_ID = new boolean[] {false} ;
      T000S5_A341TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S5_n341TBT14_UPD_DATETIME = new boolean[] {false} ;
      T000S5_A342TBT14_UPD_USER_ID = new String[] {""} ;
      T000S5_n342TBT14_UPD_USER_ID = new boolean[] {false} ;
      T000S5_A344TBT14_UPD_CNT = new long[1] ;
      T000S5_n344TBT14_UPD_CNT = new boolean[] {false} ;
      T000S5_A331TBT14_CRF_ID = new short[1] ;
      T000S5_n331TBT14_CRF_ID = new boolean[] {false} ;
      T000S5_A332TBT14_CRF_VERSION = new short[1] ;
      T000S5_n332TBT14_CRF_VERSION = new boolean[] {false} ;
      T000S5_A923TBT14_MEMO_KBN = new String[] {""} ;
      T000S5_n923TBT14_MEMO_KBN = new boolean[] {false} ;
      T000S5_A335TBT14_MEMO = new String[] {""} ;
      T000S5_n335TBT14_MEMO = new boolean[] {false} ;
      T000S5_A928TBT14_REQUEST_SITE_ID = new String[] {""} ;
      T000S5_n928TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      T000S5_A929TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      T000S5_n929TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      T000S5_A930TBT14_CRT_AUTH_CD = new String[] {""} ;
      T000S5_n930TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      T000S5_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      T000S5_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      T000S5_A931TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      T000S5_n931TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      T000S5_A933TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      T000S5_n933TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      T000S5_A924TBT14_KANRYO_FLG = new String[] {""} ;
      T000S5_n924TBT14_KANRYO_FLG = new boolean[] {false} ;
      T000S5_A337TBT14_DEL_FLG = new String[] {""} ;
      T000S5_n337TBT14_DEL_FLG = new boolean[] {false} ;
      T000S5_A340TBT14_CRT_PROG_NM = new String[] {""} ;
      T000S5_n340TBT14_CRT_PROG_NM = new boolean[] {false} ;
      T000S5_A343TBT14_UPD_PROG_NM = new String[] {""} ;
      T000S5_n343TBT14_UPD_PROG_NM = new boolean[] {false} ;
      T000S5_A329TBT14_STUDY_ID = new long[1] ;
      T000S5_A330TBT14_SUBJECT_ID = new int[1] ;
      T000S4_A329TBT14_STUDY_ID = new long[1] ;
      T000S6_A329TBT14_STUDY_ID = new long[1] ;
      T000S7_A329TBT14_STUDY_ID = new long[1] ;
      T000S7_A330TBT14_SUBJECT_ID = new int[1] ;
      T000S7_A922TBT14_MEMO_NO = new short[1] ;
      T000S3_A922TBT14_MEMO_NO = new short[1] ;
      T000S3_A338TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S3_n338TBT14_CRT_DATETIME = new boolean[] {false} ;
      T000S3_A339TBT14_CRT_USER_ID = new String[] {""} ;
      T000S3_n339TBT14_CRT_USER_ID = new boolean[] {false} ;
      T000S3_A341TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S3_n341TBT14_UPD_DATETIME = new boolean[] {false} ;
      T000S3_A342TBT14_UPD_USER_ID = new String[] {""} ;
      T000S3_n342TBT14_UPD_USER_ID = new boolean[] {false} ;
      T000S3_A344TBT14_UPD_CNT = new long[1] ;
      T000S3_n344TBT14_UPD_CNT = new boolean[] {false} ;
      T000S3_A331TBT14_CRF_ID = new short[1] ;
      T000S3_n331TBT14_CRF_ID = new boolean[] {false} ;
      T000S3_A332TBT14_CRF_VERSION = new short[1] ;
      T000S3_n332TBT14_CRF_VERSION = new boolean[] {false} ;
      T000S3_A923TBT14_MEMO_KBN = new String[] {""} ;
      T000S3_n923TBT14_MEMO_KBN = new boolean[] {false} ;
      T000S3_A335TBT14_MEMO = new String[] {""} ;
      T000S3_n335TBT14_MEMO = new boolean[] {false} ;
      T000S3_A928TBT14_REQUEST_SITE_ID = new String[] {""} ;
      T000S3_n928TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      T000S3_A929TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      T000S3_n929TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      T000S3_A930TBT14_CRT_AUTH_CD = new String[] {""} ;
      T000S3_n930TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      T000S3_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      T000S3_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      T000S3_A931TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      T000S3_n931TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      T000S3_A933TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      T000S3_n933TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      T000S3_A924TBT14_KANRYO_FLG = new String[] {""} ;
      T000S3_n924TBT14_KANRYO_FLG = new boolean[] {false} ;
      T000S3_A337TBT14_DEL_FLG = new String[] {""} ;
      T000S3_n337TBT14_DEL_FLG = new boolean[] {false} ;
      T000S3_A340TBT14_CRT_PROG_NM = new String[] {""} ;
      T000S3_n340TBT14_CRT_PROG_NM = new boolean[] {false} ;
      T000S3_A343TBT14_UPD_PROG_NM = new String[] {""} ;
      T000S3_n343TBT14_UPD_PROG_NM = new boolean[] {false} ;
      T000S3_A329TBT14_STUDY_ID = new long[1] ;
      T000S3_A330TBT14_SUBJECT_ID = new int[1] ;
      sMode27 = "" ;
      T000S8_A329TBT14_STUDY_ID = new long[1] ;
      T000S8_A330TBT14_SUBJECT_ID = new int[1] ;
      T000S8_A922TBT14_MEMO_NO = new short[1] ;
      T000S9_A329TBT14_STUDY_ID = new long[1] ;
      T000S9_A330TBT14_SUBJECT_ID = new int[1] ;
      T000S9_A922TBT14_MEMO_NO = new short[1] ;
      T000S2_A922TBT14_MEMO_NO = new short[1] ;
      T000S2_A338TBT14_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S2_n338TBT14_CRT_DATETIME = new boolean[] {false} ;
      T000S2_A339TBT14_CRT_USER_ID = new String[] {""} ;
      T000S2_n339TBT14_CRT_USER_ID = new boolean[] {false} ;
      T000S2_A341TBT14_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000S2_n341TBT14_UPD_DATETIME = new boolean[] {false} ;
      T000S2_A342TBT14_UPD_USER_ID = new String[] {""} ;
      T000S2_n342TBT14_UPD_USER_ID = new boolean[] {false} ;
      T000S2_A344TBT14_UPD_CNT = new long[1] ;
      T000S2_n344TBT14_UPD_CNT = new boolean[] {false} ;
      T000S2_A331TBT14_CRF_ID = new short[1] ;
      T000S2_n331TBT14_CRF_ID = new boolean[] {false} ;
      T000S2_A332TBT14_CRF_VERSION = new short[1] ;
      T000S2_n332TBT14_CRF_VERSION = new boolean[] {false} ;
      T000S2_A923TBT14_MEMO_KBN = new String[] {""} ;
      T000S2_n923TBT14_MEMO_KBN = new boolean[] {false} ;
      T000S2_A335TBT14_MEMO = new String[] {""} ;
      T000S2_n335TBT14_MEMO = new boolean[] {false} ;
      T000S2_A928TBT14_REQUEST_SITE_ID = new String[] {""} ;
      T000S2_n928TBT14_REQUEST_SITE_ID = new boolean[] {false} ;
      T000S2_A929TBT14_REQUEST_AUTH_CD = new String[] {""} ;
      T000S2_n929TBT14_REQUEST_AUTH_CD = new boolean[] {false} ;
      T000S2_A930TBT14_CRT_AUTH_CD = new String[] {""} ;
      T000S2_n930TBT14_CRT_AUTH_CD = new boolean[] {false} ;
      T000S2_A927TBT14_KAKUNIN_FLG = new String[] {""} ;
      T000S2_n927TBT14_KAKUNIN_FLG = new boolean[] {false} ;
      T000S2_A931TBT14_KAKUNIN_USER_ID = new String[] {""} ;
      T000S2_n931TBT14_KAKUNIN_USER_ID = new boolean[] {false} ;
      T000S2_A933TBT14_KAKUNIN_COMMENT = new String[] {""} ;
      T000S2_n933TBT14_KAKUNIN_COMMENT = new boolean[] {false} ;
      T000S2_A924TBT14_KANRYO_FLG = new String[] {""} ;
      T000S2_n924TBT14_KANRYO_FLG = new boolean[] {false} ;
      T000S2_A337TBT14_DEL_FLG = new String[] {""} ;
      T000S2_n337TBT14_DEL_FLG = new boolean[] {false} ;
      T000S2_A340TBT14_CRT_PROG_NM = new String[] {""} ;
      T000S2_n340TBT14_CRT_PROG_NM = new boolean[] {false} ;
      T000S2_A343TBT14_UPD_PROG_NM = new String[] {""} ;
      T000S2_n343TBT14_UPD_PROG_NM = new boolean[] {false} ;
      T000S2_A329TBT14_STUDY_ID = new long[1] ;
      T000S2_A330TBT14_SUBJECT_ID = new int[1] ;
      T000S13_A345TBT15_STUDY_ID = new long[1] ;
      T000S13_A346TBT15_SUBJECT_ID = new int[1] ;
      T000S13_A925TBT15_MEMO_NO = new short[1] ;
      T000S14_A329TBT14_STUDY_ID = new long[1] ;
      T000S14_A330TBT14_SUBJECT_ID = new int[1] ;
      T000S14_A922TBT14_MEMO_NO = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      T000S15_A329TBT14_STUDY_ID = new long[1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt14_crf_memo__default(),
         new Object[] {
             new Object[] {
            T000S2_A922TBT14_MEMO_NO, T000S2_A338TBT14_CRT_DATETIME, T000S2_n338TBT14_CRT_DATETIME, T000S2_A339TBT14_CRT_USER_ID, T000S2_n339TBT14_CRT_USER_ID, T000S2_A341TBT14_UPD_DATETIME, T000S2_n341TBT14_UPD_DATETIME, T000S2_A342TBT14_UPD_USER_ID, T000S2_n342TBT14_UPD_USER_ID, T000S2_A344TBT14_UPD_CNT,
            T000S2_n344TBT14_UPD_CNT, T000S2_A331TBT14_CRF_ID, T000S2_n331TBT14_CRF_ID, T000S2_A332TBT14_CRF_VERSION, T000S2_n332TBT14_CRF_VERSION, T000S2_A923TBT14_MEMO_KBN, T000S2_n923TBT14_MEMO_KBN, T000S2_A335TBT14_MEMO, T000S2_n335TBT14_MEMO, T000S2_A928TBT14_REQUEST_SITE_ID,
            T000S2_n928TBT14_REQUEST_SITE_ID, T000S2_A929TBT14_REQUEST_AUTH_CD, T000S2_n929TBT14_REQUEST_AUTH_CD, T000S2_A930TBT14_CRT_AUTH_CD, T000S2_n930TBT14_CRT_AUTH_CD, T000S2_A927TBT14_KAKUNIN_FLG, T000S2_n927TBT14_KAKUNIN_FLG, T000S2_A931TBT14_KAKUNIN_USER_ID, T000S2_n931TBT14_KAKUNIN_USER_ID, T000S2_A933TBT14_KAKUNIN_COMMENT,
            T000S2_n933TBT14_KAKUNIN_COMMENT, T000S2_A924TBT14_KANRYO_FLG, T000S2_n924TBT14_KANRYO_FLG, T000S2_A337TBT14_DEL_FLG, T000S2_n337TBT14_DEL_FLG, T000S2_A340TBT14_CRT_PROG_NM, T000S2_n340TBT14_CRT_PROG_NM, T000S2_A343TBT14_UPD_PROG_NM, T000S2_n343TBT14_UPD_PROG_NM, T000S2_A329TBT14_STUDY_ID,
            T000S2_A330TBT14_SUBJECT_ID
            }
            , new Object[] {
            T000S3_A922TBT14_MEMO_NO, T000S3_A338TBT14_CRT_DATETIME, T000S3_n338TBT14_CRT_DATETIME, T000S3_A339TBT14_CRT_USER_ID, T000S3_n339TBT14_CRT_USER_ID, T000S3_A341TBT14_UPD_DATETIME, T000S3_n341TBT14_UPD_DATETIME, T000S3_A342TBT14_UPD_USER_ID, T000S3_n342TBT14_UPD_USER_ID, T000S3_A344TBT14_UPD_CNT,
            T000S3_n344TBT14_UPD_CNT, T000S3_A331TBT14_CRF_ID, T000S3_n331TBT14_CRF_ID, T000S3_A332TBT14_CRF_VERSION, T000S3_n332TBT14_CRF_VERSION, T000S3_A923TBT14_MEMO_KBN, T000S3_n923TBT14_MEMO_KBN, T000S3_A335TBT14_MEMO, T000S3_n335TBT14_MEMO, T000S3_A928TBT14_REQUEST_SITE_ID,
            T000S3_n928TBT14_REQUEST_SITE_ID, T000S3_A929TBT14_REQUEST_AUTH_CD, T000S3_n929TBT14_REQUEST_AUTH_CD, T000S3_A930TBT14_CRT_AUTH_CD, T000S3_n930TBT14_CRT_AUTH_CD, T000S3_A927TBT14_KAKUNIN_FLG, T000S3_n927TBT14_KAKUNIN_FLG, T000S3_A931TBT14_KAKUNIN_USER_ID, T000S3_n931TBT14_KAKUNIN_USER_ID, T000S3_A933TBT14_KAKUNIN_COMMENT,
            T000S3_n933TBT14_KAKUNIN_COMMENT, T000S3_A924TBT14_KANRYO_FLG, T000S3_n924TBT14_KANRYO_FLG, T000S3_A337TBT14_DEL_FLG, T000S3_n337TBT14_DEL_FLG, T000S3_A340TBT14_CRT_PROG_NM, T000S3_n340TBT14_CRT_PROG_NM, T000S3_A343TBT14_UPD_PROG_NM, T000S3_n343TBT14_UPD_PROG_NM, T000S3_A329TBT14_STUDY_ID,
            T000S3_A330TBT14_SUBJECT_ID
            }
            , new Object[] {
            T000S4_A329TBT14_STUDY_ID
            }
            , new Object[] {
            T000S5_A922TBT14_MEMO_NO, T000S5_A338TBT14_CRT_DATETIME, T000S5_n338TBT14_CRT_DATETIME, T000S5_A339TBT14_CRT_USER_ID, T000S5_n339TBT14_CRT_USER_ID, T000S5_A341TBT14_UPD_DATETIME, T000S5_n341TBT14_UPD_DATETIME, T000S5_A342TBT14_UPD_USER_ID, T000S5_n342TBT14_UPD_USER_ID, T000S5_A344TBT14_UPD_CNT,
            T000S5_n344TBT14_UPD_CNT, T000S5_A331TBT14_CRF_ID, T000S5_n331TBT14_CRF_ID, T000S5_A332TBT14_CRF_VERSION, T000S5_n332TBT14_CRF_VERSION, T000S5_A923TBT14_MEMO_KBN, T000S5_n923TBT14_MEMO_KBN, T000S5_A335TBT14_MEMO, T000S5_n335TBT14_MEMO, T000S5_A928TBT14_REQUEST_SITE_ID,
            T000S5_n928TBT14_REQUEST_SITE_ID, T000S5_A929TBT14_REQUEST_AUTH_CD, T000S5_n929TBT14_REQUEST_AUTH_CD, T000S5_A930TBT14_CRT_AUTH_CD, T000S5_n930TBT14_CRT_AUTH_CD, T000S5_A927TBT14_KAKUNIN_FLG, T000S5_n927TBT14_KAKUNIN_FLG, T000S5_A931TBT14_KAKUNIN_USER_ID, T000S5_n931TBT14_KAKUNIN_USER_ID, T000S5_A933TBT14_KAKUNIN_COMMENT,
            T000S5_n933TBT14_KAKUNIN_COMMENT, T000S5_A924TBT14_KANRYO_FLG, T000S5_n924TBT14_KANRYO_FLG, T000S5_A337TBT14_DEL_FLG, T000S5_n337TBT14_DEL_FLG, T000S5_A340TBT14_CRT_PROG_NM, T000S5_n340TBT14_CRT_PROG_NM, T000S5_A343TBT14_UPD_PROG_NM, T000S5_n343TBT14_UPD_PROG_NM, T000S5_A329TBT14_STUDY_ID,
            T000S5_A330TBT14_SUBJECT_ID
            }
            , new Object[] {
            T000S6_A329TBT14_STUDY_ID
            }
            , new Object[] {
            T000S7_A329TBT14_STUDY_ID, T000S7_A330TBT14_SUBJECT_ID, T000S7_A922TBT14_MEMO_NO
            }
            , new Object[] {
            T000S8_A329TBT14_STUDY_ID, T000S8_A330TBT14_SUBJECT_ID, T000S8_A922TBT14_MEMO_NO
            }
            , new Object[] {
            T000S9_A329TBT14_STUDY_ID, T000S9_A330TBT14_SUBJECT_ID, T000S9_A922TBT14_MEMO_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000S13_A345TBT15_STUDY_ID, T000S13_A346TBT15_SUBJECT_ID, T000S13_A925TBT15_MEMO_NO
            }
            , new Object[] {
            T000S14_A329TBT14_STUDY_ID, T000S14_A330TBT14_SUBJECT_ID, T000S14_A922TBT14_MEMO_NO
            }
            , new Object[] {
            T000S15_A329TBT14_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT14_CRF_MEMO" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A922TBT14_MEMO_NO ;
   private short A331TBT14_CRF_ID ;
   private short A332TBT14_CRF_VERSION ;
   private short Z922TBT14_MEMO_NO ;
   private short Z331TBT14_CRF_ID ;
   private short Z332TBT14_CRF_VERSION ;
   private short RcdFound27 ;
   private short Gx_err ;
   private int A330TBT14_SUBJECT_ID ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBT14_STUDY_ID_Enabled ;
   private int edtTBT14_SUBJECT_ID_Enabled ;
   private int edtTBT14_MEMO_NO_Enabled ;
   private int edtTBT14_CRF_ID_Enabled ;
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
   private int Z330TBT14_SUBJECT_ID ;
   private int GX_JID ;
   private int AnyError329 ;
   private int AnyError330 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A329TBT14_STUDY_ID ;
   private long A344TBT14_UPD_CNT ;
   private long Z329TBT14_STUDY_ID ;
   private long Z344TBT14_UPD_CNT ;
   private long O344TBT14_UPD_CNT ;
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
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A338TBT14_CRT_DATETIME ;
   private java.util.Date A341TBT14_UPD_DATETIME ;
   private java.util.Date Z338TBT14_CRT_DATETIME ;
   private java.util.Date Z341TBT14_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n331TBT14_CRF_ID ;
   private boolean n332TBT14_CRF_VERSION ;
   private boolean n923TBT14_MEMO_KBN ;
   private boolean n335TBT14_MEMO ;
   private boolean n928TBT14_REQUEST_SITE_ID ;
   private boolean n929TBT14_REQUEST_AUTH_CD ;
   private boolean n930TBT14_CRT_AUTH_CD ;
   private boolean n927TBT14_KAKUNIN_FLG ;
   private boolean n931TBT14_KAKUNIN_USER_ID ;
   private boolean n933TBT14_KAKUNIN_COMMENT ;
   private boolean n924TBT14_KANRYO_FLG ;
   private boolean n337TBT14_DEL_FLG ;
   private boolean n338TBT14_CRT_DATETIME ;
   private boolean n339TBT14_CRT_USER_ID ;
   private boolean n340TBT14_CRT_PROG_NM ;
   private boolean n341TBT14_UPD_DATETIME ;
   private boolean n342TBT14_UPD_USER_ID ;
   private boolean n343TBT14_UPD_PROG_NM ;
   private boolean n344TBT14_UPD_CNT ;
   private boolean Gx_longc ;
   private String A923TBT14_MEMO_KBN ;
   private String A335TBT14_MEMO ;
   private String A928TBT14_REQUEST_SITE_ID ;
   private String A929TBT14_REQUEST_AUTH_CD ;
   private String A930TBT14_CRT_AUTH_CD ;
   private String A927TBT14_KAKUNIN_FLG ;
   private String A931TBT14_KAKUNIN_USER_ID ;
   private String A933TBT14_KAKUNIN_COMMENT ;
   private String A924TBT14_KANRYO_FLG ;
   private String A337TBT14_DEL_FLG ;
   private String A339TBT14_CRT_USER_ID ;
   private String A340TBT14_CRT_PROG_NM ;
   private String A342TBT14_UPD_USER_ID ;
   private String A343TBT14_UPD_PROG_NM ;
   private String Z339TBT14_CRT_USER_ID ;
   private String Z342TBT14_UPD_USER_ID ;
   private String Z923TBT14_MEMO_KBN ;
   private String Z335TBT14_MEMO ;
   private String Z928TBT14_REQUEST_SITE_ID ;
   private String Z929TBT14_REQUEST_AUTH_CD ;
   private String Z930TBT14_CRT_AUTH_CD ;
   private String Z927TBT14_KAKUNIN_FLG ;
   private String Z931TBT14_KAKUNIN_USER_ID ;
   private String Z933TBT14_KAKUNIN_COMMENT ;
   private String Z924TBT14_KANRYO_FLG ;
   private String Z337TBT14_DEL_FLG ;
   private String Z340TBT14_CRT_PROG_NM ;
   private String Z343TBT14_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private short[] T000S5_A922TBT14_MEMO_NO ;
   private java.util.Date[] T000S5_A338TBT14_CRT_DATETIME ;
   private boolean[] T000S5_n338TBT14_CRT_DATETIME ;
   private String[] T000S5_A339TBT14_CRT_USER_ID ;
   private boolean[] T000S5_n339TBT14_CRT_USER_ID ;
   private java.util.Date[] T000S5_A341TBT14_UPD_DATETIME ;
   private boolean[] T000S5_n341TBT14_UPD_DATETIME ;
   private String[] T000S5_A342TBT14_UPD_USER_ID ;
   private boolean[] T000S5_n342TBT14_UPD_USER_ID ;
   private long[] T000S5_A344TBT14_UPD_CNT ;
   private boolean[] T000S5_n344TBT14_UPD_CNT ;
   private short[] T000S5_A331TBT14_CRF_ID ;
   private boolean[] T000S5_n331TBT14_CRF_ID ;
   private short[] T000S5_A332TBT14_CRF_VERSION ;
   private boolean[] T000S5_n332TBT14_CRF_VERSION ;
   private String[] T000S5_A923TBT14_MEMO_KBN ;
   private boolean[] T000S5_n923TBT14_MEMO_KBN ;
   private String[] T000S5_A335TBT14_MEMO ;
   private boolean[] T000S5_n335TBT14_MEMO ;
   private String[] T000S5_A928TBT14_REQUEST_SITE_ID ;
   private boolean[] T000S5_n928TBT14_REQUEST_SITE_ID ;
   private String[] T000S5_A929TBT14_REQUEST_AUTH_CD ;
   private boolean[] T000S5_n929TBT14_REQUEST_AUTH_CD ;
   private String[] T000S5_A930TBT14_CRT_AUTH_CD ;
   private boolean[] T000S5_n930TBT14_CRT_AUTH_CD ;
   private String[] T000S5_A927TBT14_KAKUNIN_FLG ;
   private boolean[] T000S5_n927TBT14_KAKUNIN_FLG ;
   private String[] T000S5_A931TBT14_KAKUNIN_USER_ID ;
   private boolean[] T000S5_n931TBT14_KAKUNIN_USER_ID ;
   private String[] T000S5_A933TBT14_KAKUNIN_COMMENT ;
   private boolean[] T000S5_n933TBT14_KAKUNIN_COMMENT ;
   private String[] T000S5_A924TBT14_KANRYO_FLG ;
   private boolean[] T000S5_n924TBT14_KANRYO_FLG ;
   private String[] T000S5_A337TBT14_DEL_FLG ;
   private boolean[] T000S5_n337TBT14_DEL_FLG ;
   private String[] T000S5_A340TBT14_CRT_PROG_NM ;
   private boolean[] T000S5_n340TBT14_CRT_PROG_NM ;
   private String[] T000S5_A343TBT14_UPD_PROG_NM ;
   private boolean[] T000S5_n343TBT14_UPD_PROG_NM ;
   private long[] T000S5_A329TBT14_STUDY_ID ;
   private int[] T000S5_A330TBT14_SUBJECT_ID ;
   private long[] T000S4_A329TBT14_STUDY_ID ;
   private long[] T000S6_A329TBT14_STUDY_ID ;
   private long[] T000S7_A329TBT14_STUDY_ID ;
   private int[] T000S7_A330TBT14_SUBJECT_ID ;
   private short[] T000S7_A922TBT14_MEMO_NO ;
   private short[] T000S3_A922TBT14_MEMO_NO ;
   private java.util.Date[] T000S3_A338TBT14_CRT_DATETIME ;
   private boolean[] T000S3_n338TBT14_CRT_DATETIME ;
   private String[] T000S3_A339TBT14_CRT_USER_ID ;
   private boolean[] T000S3_n339TBT14_CRT_USER_ID ;
   private java.util.Date[] T000S3_A341TBT14_UPD_DATETIME ;
   private boolean[] T000S3_n341TBT14_UPD_DATETIME ;
   private String[] T000S3_A342TBT14_UPD_USER_ID ;
   private boolean[] T000S3_n342TBT14_UPD_USER_ID ;
   private long[] T000S3_A344TBT14_UPD_CNT ;
   private boolean[] T000S3_n344TBT14_UPD_CNT ;
   private short[] T000S3_A331TBT14_CRF_ID ;
   private boolean[] T000S3_n331TBT14_CRF_ID ;
   private short[] T000S3_A332TBT14_CRF_VERSION ;
   private boolean[] T000S3_n332TBT14_CRF_VERSION ;
   private String[] T000S3_A923TBT14_MEMO_KBN ;
   private boolean[] T000S3_n923TBT14_MEMO_KBN ;
   private String[] T000S3_A335TBT14_MEMO ;
   private boolean[] T000S3_n335TBT14_MEMO ;
   private String[] T000S3_A928TBT14_REQUEST_SITE_ID ;
   private boolean[] T000S3_n928TBT14_REQUEST_SITE_ID ;
   private String[] T000S3_A929TBT14_REQUEST_AUTH_CD ;
   private boolean[] T000S3_n929TBT14_REQUEST_AUTH_CD ;
   private String[] T000S3_A930TBT14_CRT_AUTH_CD ;
   private boolean[] T000S3_n930TBT14_CRT_AUTH_CD ;
   private String[] T000S3_A927TBT14_KAKUNIN_FLG ;
   private boolean[] T000S3_n927TBT14_KAKUNIN_FLG ;
   private String[] T000S3_A931TBT14_KAKUNIN_USER_ID ;
   private boolean[] T000S3_n931TBT14_KAKUNIN_USER_ID ;
   private String[] T000S3_A933TBT14_KAKUNIN_COMMENT ;
   private boolean[] T000S3_n933TBT14_KAKUNIN_COMMENT ;
   private String[] T000S3_A924TBT14_KANRYO_FLG ;
   private boolean[] T000S3_n924TBT14_KANRYO_FLG ;
   private String[] T000S3_A337TBT14_DEL_FLG ;
   private boolean[] T000S3_n337TBT14_DEL_FLG ;
   private String[] T000S3_A340TBT14_CRT_PROG_NM ;
   private boolean[] T000S3_n340TBT14_CRT_PROG_NM ;
   private String[] T000S3_A343TBT14_UPD_PROG_NM ;
   private boolean[] T000S3_n343TBT14_UPD_PROG_NM ;
   private long[] T000S3_A329TBT14_STUDY_ID ;
   private int[] T000S3_A330TBT14_SUBJECT_ID ;
   private long[] T000S8_A329TBT14_STUDY_ID ;
   private int[] T000S8_A330TBT14_SUBJECT_ID ;
   private short[] T000S8_A922TBT14_MEMO_NO ;
   private long[] T000S9_A329TBT14_STUDY_ID ;
   private int[] T000S9_A330TBT14_SUBJECT_ID ;
   private short[] T000S9_A922TBT14_MEMO_NO ;
   private short[] T000S2_A922TBT14_MEMO_NO ;
   private java.util.Date[] T000S2_A338TBT14_CRT_DATETIME ;
   private boolean[] T000S2_n338TBT14_CRT_DATETIME ;
   private String[] T000S2_A339TBT14_CRT_USER_ID ;
   private boolean[] T000S2_n339TBT14_CRT_USER_ID ;
   private java.util.Date[] T000S2_A341TBT14_UPD_DATETIME ;
   private boolean[] T000S2_n341TBT14_UPD_DATETIME ;
   private String[] T000S2_A342TBT14_UPD_USER_ID ;
   private boolean[] T000S2_n342TBT14_UPD_USER_ID ;
   private long[] T000S2_A344TBT14_UPD_CNT ;
   private boolean[] T000S2_n344TBT14_UPD_CNT ;
   private short[] T000S2_A331TBT14_CRF_ID ;
   private boolean[] T000S2_n331TBT14_CRF_ID ;
   private short[] T000S2_A332TBT14_CRF_VERSION ;
   private boolean[] T000S2_n332TBT14_CRF_VERSION ;
   private String[] T000S2_A923TBT14_MEMO_KBN ;
   private boolean[] T000S2_n923TBT14_MEMO_KBN ;
   private String[] T000S2_A335TBT14_MEMO ;
   private boolean[] T000S2_n335TBT14_MEMO ;
   private String[] T000S2_A928TBT14_REQUEST_SITE_ID ;
   private boolean[] T000S2_n928TBT14_REQUEST_SITE_ID ;
   private String[] T000S2_A929TBT14_REQUEST_AUTH_CD ;
   private boolean[] T000S2_n929TBT14_REQUEST_AUTH_CD ;
   private String[] T000S2_A930TBT14_CRT_AUTH_CD ;
   private boolean[] T000S2_n930TBT14_CRT_AUTH_CD ;
   private String[] T000S2_A927TBT14_KAKUNIN_FLG ;
   private boolean[] T000S2_n927TBT14_KAKUNIN_FLG ;
   private String[] T000S2_A931TBT14_KAKUNIN_USER_ID ;
   private boolean[] T000S2_n931TBT14_KAKUNIN_USER_ID ;
   private String[] T000S2_A933TBT14_KAKUNIN_COMMENT ;
   private boolean[] T000S2_n933TBT14_KAKUNIN_COMMENT ;
   private String[] T000S2_A924TBT14_KANRYO_FLG ;
   private boolean[] T000S2_n924TBT14_KANRYO_FLG ;
   private String[] T000S2_A337TBT14_DEL_FLG ;
   private boolean[] T000S2_n337TBT14_DEL_FLG ;
   private String[] T000S2_A340TBT14_CRT_PROG_NM ;
   private boolean[] T000S2_n340TBT14_CRT_PROG_NM ;
   private String[] T000S2_A343TBT14_UPD_PROG_NM ;
   private boolean[] T000S2_n343TBT14_UPD_PROG_NM ;
   private long[] T000S2_A329TBT14_STUDY_ID ;
   private int[] T000S2_A330TBT14_SUBJECT_ID ;
   private long[] T000S13_A345TBT15_STUDY_ID ;
   private int[] T000S13_A346TBT15_SUBJECT_ID ;
   private short[] T000S13_A925TBT15_MEMO_NO ;
   private long[] T000S14_A329TBT14_STUDY_ID ;
   private int[] T000S14_A330TBT14_SUBJECT_ID ;
   private short[] T000S14_A922TBT14_MEMO_NO ;
   private long[] T000S15_A329TBT14_STUDY_ID ;
}

final  class tbt14_crf_memo__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000S2", "SELECT `TBT14_MEMO_NO`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_CNT`, `TBT14_CRF_ID`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_PROG_NM`, `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S3", "SELECT `TBT14_MEMO_NO`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_CNT`, `TBT14_CRF_ID`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_PROG_NM`, `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S4", "SELECT `TBT01_STUDY_ID` AS TBT14_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S5", "SELECT TM1.`TBT14_MEMO_NO`, TM1.`TBT14_CRT_DATETIME`, TM1.`TBT14_CRT_USER_ID`, TM1.`TBT14_UPD_DATETIME`, TM1.`TBT14_UPD_USER_ID`, TM1.`TBT14_UPD_CNT`, TM1.`TBT14_CRF_ID`, TM1.`TBT14_CRF_VERSION`, TM1.`TBT14_MEMO_KBN`, TM1.`TBT14_MEMO`, TM1.`TBT14_REQUEST_SITE_ID`, TM1.`TBT14_REQUEST_AUTH_CD`, TM1.`TBT14_CRT_AUTH_CD`, TM1.`TBT14_KAKUNIN_FLG`, TM1.`TBT14_KAKUNIN_USER_ID`, TM1.`TBT14_KAKUNIN_COMMENT`, TM1.`TBT14_KANRYO_FLG`, TM1.`TBT14_DEL_FLG`, TM1.`TBT14_CRT_PROG_NM`, TM1.`TBT14_UPD_PROG_NM`, TM1.`TBT14_STUDY_ID` AS TBT14_STUDY_ID, TM1.`TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID FROM `TBT14_CRF_MEMO` TM1 WHERE TM1.`TBT14_STUDY_ID` = ? and TM1.`TBT14_SUBJECT_ID` = ? and TM1.`TBT14_MEMO_NO` = ? ORDER BY TM1.`TBT14_STUDY_ID`, TM1.`TBT14_SUBJECT_ID`, TM1.`TBT14_MEMO_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000S6", "SELECT `TBT01_STUDY_ID` AS TBT14_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S7", "SELECT `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000S8", "SELECT `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` WHERE ( `TBT14_STUDY_ID` > ? or `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` > ? or `TBT14_SUBJECT_ID` = ? and `TBT14_STUDY_ID` = ? and `TBT14_MEMO_NO` > ?) ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000S9", "SELECT `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` WHERE ( `TBT14_STUDY_ID` < ? or `TBT14_STUDY_ID` = ? and `TBT14_SUBJECT_ID` < ? or `TBT14_SUBJECT_ID` = ? and `TBT14_STUDY_ID` = ? and `TBT14_MEMO_NO` < ?) ORDER BY `TBT14_STUDY_ID` DESC, `TBT14_SUBJECT_ID` DESC, `TBT14_MEMO_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000S10", "INSERT INTO `TBT14_CRF_MEMO` (`TBT14_MEMO_NO`, `TBT14_CRT_DATETIME`, `TBT14_CRT_USER_ID`, `TBT14_UPD_DATETIME`, `TBT14_UPD_USER_ID`, `TBT14_UPD_CNT`, `TBT14_CRF_ID`, `TBT14_CRF_VERSION`, `TBT14_MEMO_KBN`, `TBT14_MEMO`, `TBT14_REQUEST_SITE_ID`, `TBT14_REQUEST_AUTH_CD`, `TBT14_CRT_AUTH_CD`, `TBT14_KAKUNIN_FLG`, `TBT14_KAKUNIN_USER_ID`, `TBT14_KAKUNIN_COMMENT`, `TBT14_KANRYO_FLG`, `TBT14_DEL_FLG`, `TBT14_CRT_PROG_NM`, `TBT14_UPD_PROG_NM`, `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000S11", "UPDATE `TBT14_CRF_MEMO` SET `TBT14_CRT_DATETIME`=?, `TBT14_CRT_USER_ID`=?, `TBT14_UPD_DATETIME`=?, `TBT14_UPD_USER_ID`=?, `TBT14_UPD_CNT`=?, `TBT14_CRF_ID`=?, `TBT14_CRF_VERSION`=?, `TBT14_MEMO_KBN`=?, `TBT14_MEMO`=?, `TBT14_REQUEST_SITE_ID`=?, `TBT14_REQUEST_AUTH_CD`=?, `TBT14_CRT_AUTH_CD`=?, `TBT14_KAKUNIN_FLG`=?, `TBT14_KAKUNIN_USER_ID`=?, `TBT14_KAKUNIN_COMMENT`=?, `TBT14_KANRYO_FLG`=?, `TBT14_DEL_FLG`=?, `TBT14_CRT_PROG_NM`=?, `TBT14_UPD_PROG_NM`=?  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T000S12", "DELETE FROM `TBT14_CRF_MEMO`  WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ? AND `TBT14_MEMO_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T000S13", "SELECT `TBT15_STUDY_ID`, `TBT15_SUBJECT_ID`, `TBT15_MEMO_NO` FROM `TBT15_CRF_MEMO_LOC` WHERE `TBT15_STUDY_ID` = ? AND `TBT15_SUBJECT_ID` = ? AND `TBT15_MEMO_NO` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000S14", "SELECT `TBT14_STUDY_ID` AS TBT14_STUDY_ID, `TBT14_SUBJECT_ID` AS TBT14_SUBJECT_ID, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` ORDER BY `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000S15", "SELECT `TBT01_STUDY_ID` AS TBT14_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((short[]) buf[13])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
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
               ((long[]) buf[39])[0] = rslt.getLong(21) ;
               ((int[]) buf[40])[0] = rslt.getInt(22) ;
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
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
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
               ((long[]) buf[39])[0] = rslt.getLong(21) ;
               ((int[]) buf[40])[0] = rslt.getInt(22) ;
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
               ((short[]) buf[11])[0] = rslt.getShort(7) ;
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((short[]) buf[13])[0] = rslt.getShort(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
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
               ((long[]) buf[39])[0] = rslt.getLong(21) ;
               ((int[]) buf[40])[0] = rslt.getInt(22) ;
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
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
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setShort(8, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 1);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 2000);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 20);
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
                  stmt.setVarchar(13, (String)parms[24], 2);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 1);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 128);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 2000);
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
                  stmt.setVarchar(18, (String)parms[34], 1);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[36], 40);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 40);
               }
               stmt.setLong(21, ((Number) parms[39]).longValue());
               stmt.setInt(22, ((Number) parms[40]).intValue());
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
                  stmt.setVarchar(9, (String)parms[17], 2000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 20);
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
                  stmt.setVarchar(12, (String)parms[23], 2);
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
                  stmt.setVarchar(14, (String)parms[27], 128);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 2000);
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
                  stmt.setVarchar(17, (String)parms[33], 1);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[35], 40);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 40);
               }
               stmt.setLong(20, ((Number) parms[38]).longValue());
               stmt.setInt(21, ((Number) parms[39]).intValue());
               stmt.setShort(22, ((Number) parms[40]).shortValue());
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
      }
   }

}

