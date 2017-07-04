/*
               File: tbt02_crf_impl
        Description: CRFテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:18.4
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel9"+"_"+"TBT02_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx9asatbt02_crt_user_id0P24( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"TBT02_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx11asatbt02_upd_user_id0P24( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_14") == 0 )
      {
         A292TBT02_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
         A293TBT02_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_14( A292TBT02_STUDY_ID, A293TBT02_SUBJECT_ID) ;
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
      Form.getMeta().addItem("Description", "CRFテーブル", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         wb_table1_2_0P24( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0P24e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0P24( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0P24( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0P24( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0P24e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRFテーブル"+"</legend>") ;
         wb_table3_27_0P24( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0P24e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0P24e( true) ;
      }
      else
      {
         wb_table1_2_0P24e( false) ;
      }
   }

   public void wb_table3_27_0P24( boolean wbgen )
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
         wb_table4_33_0P24( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0P24e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT02_CRF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT02_CRF.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0P24e( true) ;
      }
      else
      {
         wb_table3_27_0P24e( false) ;
      }
   }

   public void wb_table4_33_0P24( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_study_id_Internalname, "試験ID", "", "", lblTextblocktbt02_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A292TBT02_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBT02_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A292TBT02_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A292TBT02_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBT02_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_subject_id_Internalname, "患者ID", "", "", lblTextblocktbt02_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A293TBT02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBT02_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A293TBT02_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A293TBT02_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBT02_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crf_id_Internalname, "CRFID", "", "", lblTextblocktbt02_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A294TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBT02_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A294TBT02_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A294TBT02_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(48);\"", "", "", "", "", edtTBT02_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crf_latest_version_Internalname, "CRF最新更新バージョン", "", "", lblTextblocktbt02_crf_latest_version_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A370TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A370TBT02_CRF_LATEST_VERSION, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRF_LATEST_VERSION_Internalname, GXutil.ltrim( localUtil.ntoc( A370TBT02_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")), ((edtTBT02_CRF_LATEST_VERSION_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A370TBT02_CRF_LATEST_VERSION), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A370TBT02_CRF_LATEST_VERSION), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBT02_CRF_LATEST_VERSION_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_CRF_LATEST_VERSION_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crf_input_level_Internalname, "CRF入力権限レベル", "", "", lblTextblocktbt02_crf_input_level_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A371TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A371TBT02_CRF_INPUT_LEVEL, 2, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRF_INPUT_LEVEL_Internalname, GXutil.ltrim( localUtil.ntoc( A371TBT02_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")), ((edtTBT02_CRF_INPUT_LEVEL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A371TBT02_CRF_INPUT_LEVEL), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A371TBT02_CRF_INPUT_LEVEL), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBT02_CRF_INPUT_LEVEL_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_CRF_INPUT_LEVEL_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_lock_flg_Internalname, "ロックフラグ", "", "", lblTextblocktbt02_lock_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A556TBT02_LOCK_FLG", A556TBT02_LOCK_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_LOCK_FLG_Internalname, GXutil.rtrim( A556TBT02_LOCK_FLG), GXutil.rtrim( localUtil.format( A556TBT02_LOCK_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBT02_LOCK_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_LOCK_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_lock_datetime_Internalname, "ロック日時", "", "", lblTextblocktbt02_lock_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A557TBT02_LOCK_DATETIME", localUtil.ttoc( A557TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT02_LOCK_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_LOCK_DATETIME_Internalname, localUtil.format(A557TBT02_LOCK_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A557TBT02_LOCK_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(68);\"", "", "", "", "", edtTBT02_LOCK_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_LOCK_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_LOCK_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT02_LOCK_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_lock_user_id_Internalname, "ID", "", "", lblTextblocktbt02_lock_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A558TBT02_LOCK_USER_ID", A558TBT02_LOCK_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_LOCK_USER_ID_Internalname, GXutil.rtrim( A558TBT02_LOCK_USER_ID), GXutil.rtrim( localUtil.format( A558TBT02_LOCK_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBT02_LOCK_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_LOCK_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_lock_auth_cd_Internalname, "ロック時権限コード", "", "", lblTextblocktbt02_lock_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A559TBT02_LOCK_AUTH_CD", A559TBT02_LOCK_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_LOCK_AUTH_CD_Internalname, GXutil.rtrim( A559TBT02_LOCK_AUTH_CD), GXutil.rtrim( localUtil.format( A559TBT02_LOCK_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBT02_LOCK_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_LOCK_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upload_datetime_Internalname, "アップロード日時", "", "", lblTextblocktbt02_upload_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A560TBT02_UPLOAD_DATETIME", localUtil.ttoc( A560TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT02_UPLOAD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPLOAD_DATETIME_Internalname, localUtil.format(A560TBT02_UPLOAD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A560TBT02_UPLOAD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(83);\"", "", "", "", "", edtTBT02_UPLOAD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_UPLOAD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_UPLOAD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT02_UPLOAD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upload_user_id_Internalname, "ID", "", "", lblTextblocktbt02_upload_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A561TBT02_UPLOAD_USER_ID", A561TBT02_UPLOAD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPLOAD_USER_ID_Internalname, GXutil.rtrim( A561TBT02_UPLOAD_USER_ID), GXutil.rtrim( localUtil.format( A561TBT02_UPLOAD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBT02_UPLOAD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_UPLOAD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upload_auth_cd_Internalname, "アップロード時権限コード", "", "", lblTextblocktbt02_upload_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A562TBT02_UPLOAD_AUTH_CD", A562TBT02_UPLOAD_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPLOAD_AUTH_CD_Internalname, GXutil.rtrim( A562TBT02_UPLOAD_AUTH_CD), GXutil.rtrim( localUtil.format( A562TBT02_UPLOAD_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(93);\"", "", "", "", "", edtTBT02_UPLOAD_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_UPLOAD_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_dm_arrival_flg_Internalname, "DM到着フラグ", "", "", lblTextblocktbt02_dm_arrival_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A563TBT02_DM_ARRIVAL_FLG", A563TBT02_DM_ARRIVAL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_DM_ARRIVAL_FLG_Internalname, GXutil.rtrim( A563TBT02_DM_ARRIVAL_FLG), GXutil.rtrim( localUtil.format( A563TBT02_DM_ARRIVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTBT02_DM_ARRIVAL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_DM_ARRIVAL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_dm_arrival_datetime_Internalname, "DM到着日時", "", "", lblTextblocktbt02_dm_arrival_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A564TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A564TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT02_DM_ARRIVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_DM_ARRIVAL_DATETIME_Internalname, localUtil.format(A564TBT02_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A564TBT02_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(103);\"", "", "", "", "", edtTBT02_DM_ARRIVAL_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_DM_ARRIVAL_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_DM_ARRIVAL_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT02_DM_ARRIVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_approval_flg_Internalname, "承認フラグ", "", "", lblTextblocktbt02_approval_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A565TBT02_APPROVAL_FLG", A565TBT02_APPROVAL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_APPROVAL_FLG_Internalname, GXutil.rtrim( A565TBT02_APPROVAL_FLG), GXutil.rtrim( localUtil.format( A565TBT02_APPROVAL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(108);\"", "", "", "", "", edtTBT02_APPROVAL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_APPROVAL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_approval_datetime_Internalname, "承認日時", "", "", lblTextblocktbt02_approval_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A566TBT02_APPROVAL_DATETIME", localUtil.ttoc( A566TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT02_APPROVAL_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_APPROVAL_DATETIME_Internalname, localUtil.format(A566TBT02_APPROVAL_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A566TBT02_APPROVAL_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(113);\"", "", "", "", "", edtTBT02_APPROVAL_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_APPROVAL_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_APPROVAL_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT02_APPROVAL_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_approval_user_id_Internalname, "ID", "", "", lblTextblocktbt02_approval_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A567TBT02_APPROVAL_USER_ID", A567TBT02_APPROVAL_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_APPROVAL_USER_ID_Internalname, GXutil.rtrim( A567TBT02_APPROVAL_USER_ID), GXutil.rtrim( localUtil.format( A567TBT02_APPROVAL_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(118);\"", "", "", "", "", edtTBT02_APPROVAL_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_APPROVAL_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_approval_auth_cd_Internalname, "承認時権限コード", "", "", lblTextblocktbt02_approval_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A568TBT02_APPROVAL_AUTH_CD", A568TBT02_APPROVAL_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_APPROVAL_AUTH_CD_Internalname, GXutil.rtrim( A568TBT02_APPROVAL_AUTH_CD), GXutil.rtrim( localUtil.format( A568TBT02_APPROVAL_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(123);\"", "", "", "", "", edtTBT02_APPROVAL_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_APPROVAL_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_input_end_flg_Internalname, "データ固定フラグ", "", "", lblTextblocktbt02_input_end_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A569TBT02_INPUT_END_FLG", A569TBT02_INPUT_END_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_INPUT_END_FLG_Internalname, GXutil.rtrim( A569TBT02_INPUT_END_FLG), GXutil.rtrim( localUtil.format( A569TBT02_INPUT_END_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(128);\"", "", "", "", "", edtTBT02_INPUT_END_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_INPUT_END_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_input_end_datetime_Internalname, "データ固定日時", "", "", lblTextblocktbt02_input_end_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A570TBT02_INPUT_END_DATETIME", localUtil.ttoc( A570TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT02_INPUT_END_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_INPUT_END_DATETIME_Internalname, localUtil.format(A570TBT02_INPUT_END_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A570TBT02_INPUT_END_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(133);\"", "", "", "", "", edtTBT02_INPUT_END_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_INPUT_END_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_INPUT_END_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT02_INPUT_END_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_input_end_user_id_Internalname, "ID", "", "", lblTextblocktbt02_input_end_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A571TBT02_INPUT_END_USER_ID", A571TBT02_INPUT_END_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_INPUT_END_USER_ID_Internalname, GXutil.rtrim( A571TBT02_INPUT_END_USER_ID), GXutil.rtrim( localUtil.format( A571TBT02_INPUT_END_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(138);\"", "", "", "", "", edtTBT02_INPUT_END_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_INPUT_END_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_input_end_auth_cd_Internalname, "データ固定時権限コード", "", "", lblTextblocktbt02_input_end_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A572TBT02_INPUT_END_AUTH_CD", A572TBT02_INPUT_END_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_INPUT_END_AUTH_CD_Internalname, GXutil.rtrim( A572TBT02_INPUT_END_AUTH_CD), GXutil.rtrim( localUtil.format( A572TBT02_INPUT_END_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(143);\"", "", "", "", "", edtTBT02_INPUT_END_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_INPUT_END_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt02_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A295TBT02_DEL_FLG", A295TBT02_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_DEL_FLG_Internalname, GXutil.rtrim( A295TBT02_DEL_FLG), GXutil.rtrim( localUtil.format( A295TBT02_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(148);\"", "", "", "", "", edtTBT02_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt02_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A296TBT02_CRT_DATETIME", localUtil.ttoc( A296TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT02_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRT_DATETIME_Internalname, localUtil.format(A296TBT02_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A296TBT02_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(153);\"", "", "", "", "", edtTBT02_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT02_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbt02_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A297TBT02_CRT_USER_ID", A297TBT02_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 158,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRT_USER_ID_Internalname, GXutil.rtrim( A297TBT02_CRT_USER_ID), GXutil.rtrim( localUtil.format( A297TBT02_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(158);\"", "", "", "", "", edtTBT02_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt02_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A298TBT02_CRT_PROG_NM", A298TBT02_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_CRT_PROG_NM_Internalname, GXutil.rtrim( A298TBT02_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A298TBT02_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(163);\"", "", "", "", "", edtTBT02_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt02_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A299TBT02_UPD_DATETIME", localUtil.ttoc( A299TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 168,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT02_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPD_DATETIME_Internalname, localUtil.format(A299TBT02_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A299TBT02_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(168);\"", "", "", "", "", edtTBT02_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT02_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT02_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT02_CRF.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbt02_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A300TBT02_UPD_USER_ID", A300TBT02_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPD_USER_ID_Internalname, GXutil.rtrim( A300TBT02_UPD_USER_ID), GXutil.rtrim( localUtil.format( A300TBT02_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(173);\"", "", "", "", "", edtTBT02_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt02_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A301TBT02_UPD_PROG_NM", A301TBT02_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPD_PROG_NM_Internalname, GXutil.rtrim( A301TBT02_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A301TBT02_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(178);\"", "", "", "", "", edtTBT02_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt02_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt02_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT02_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A302TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT02_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A302TBT02_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A302TBT02_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(183);\"", "", "", "", "", edtTBT02_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT02_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT02_CRF.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0P24e( true) ;
      }
      else
      {
         wb_table4_33_0P24e( false) ;
      }
   }

   public void wb_table2_5_0P24( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT02_CRF.htm");
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
         wb_table2_5_0P24e( true) ;
      }
      else
      {
         wb_table2_5_0P24e( false) ;
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
               A292TBT02_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
            }
            else
            {
               A292TBT02_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBT02_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A293TBT02_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A293TBT02_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBT02_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A294TBT02_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
            }
            else
            {
               A294TBT02_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_LATEST_VERSION_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_LATEST_VERSION_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_CRF_LATEST_VERSION");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_CRF_LATEST_VERSION_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A370TBT02_CRF_LATEST_VERSION = (short)(0) ;
               n370TBT02_CRF_LATEST_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A370TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A370TBT02_CRF_LATEST_VERSION, 4, 0)));
            }
            else
            {
               A370TBT02_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_LATEST_VERSION_Internalname), ".", ",")) ;
               n370TBT02_CRF_LATEST_VERSION = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A370TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A370TBT02_CRF_LATEST_VERSION, 4, 0)));
            }
            n370TBT02_CRF_LATEST_VERSION = ((0==A370TBT02_CRF_LATEST_VERSION) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_INPUT_LEVEL_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_INPUT_LEVEL_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_CRF_INPUT_LEVEL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_CRF_INPUT_LEVEL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A371TBT02_CRF_INPUT_LEVEL = (byte)(0) ;
               n371TBT02_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A371TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A371TBT02_CRF_INPUT_LEVEL, 2, 0)));
            }
            else
            {
               A371TBT02_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( edtTBT02_CRF_INPUT_LEVEL_Internalname), ".", ",")) ;
               n371TBT02_CRF_INPUT_LEVEL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A371TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A371TBT02_CRF_INPUT_LEVEL, 2, 0)));
            }
            n371TBT02_CRF_INPUT_LEVEL = ((0==A371TBT02_CRF_INPUT_LEVEL) ? true : false) ;
            A556TBT02_LOCK_FLG = httpContext.cgiGet( edtTBT02_LOCK_FLG_Internalname) ;
            n556TBT02_LOCK_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A556TBT02_LOCK_FLG", A556TBT02_LOCK_FLG);
            n556TBT02_LOCK_FLG = ((GXutil.strcmp("", A556TBT02_LOCK_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_LOCK_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"ロック日時"}), 1, "TBT02_LOCK_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_LOCK_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A557TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n557TBT02_LOCK_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A557TBT02_LOCK_DATETIME", localUtil.ttoc( A557TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A557TBT02_LOCK_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_LOCK_DATETIME_Internalname)) ;
               n557TBT02_LOCK_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A557TBT02_LOCK_DATETIME", localUtil.ttoc( A557TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n557TBT02_LOCK_DATETIME = (GXutil.nullDate().equals(A557TBT02_LOCK_DATETIME) ? true : false) ;
            A558TBT02_LOCK_USER_ID = httpContext.cgiGet( edtTBT02_LOCK_USER_ID_Internalname) ;
            n558TBT02_LOCK_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A558TBT02_LOCK_USER_ID", A558TBT02_LOCK_USER_ID);
            n558TBT02_LOCK_USER_ID = ((GXutil.strcmp("", A558TBT02_LOCK_USER_ID)==0) ? true : false) ;
            A559TBT02_LOCK_AUTH_CD = httpContext.cgiGet( edtTBT02_LOCK_AUTH_CD_Internalname) ;
            n559TBT02_LOCK_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A559TBT02_LOCK_AUTH_CD", A559TBT02_LOCK_AUTH_CD);
            n559TBT02_LOCK_AUTH_CD = ((GXutil.strcmp("", A559TBT02_LOCK_AUTH_CD)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_UPLOAD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"アップロード日時"}), 1, "TBT02_UPLOAD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_UPLOAD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A560TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n560TBT02_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A560TBT02_UPLOAD_DATETIME", localUtil.ttoc( A560TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A560TBT02_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_UPLOAD_DATETIME_Internalname)) ;
               n560TBT02_UPLOAD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A560TBT02_UPLOAD_DATETIME", localUtil.ttoc( A560TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n560TBT02_UPLOAD_DATETIME = (GXutil.nullDate().equals(A560TBT02_UPLOAD_DATETIME) ? true : false) ;
            A561TBT02_UPLOAD_USER_ID = httpContext.cgiGet( edtTBT02_UPLOAD_USER_ID_Internalname) ;
            n561TBT02_UPLOAD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A561TBT02_UPLOAD_USER_ID", A561TBT02_UPLOAD_USER_ID);
            n561TBT02_UPLOAD_USER_ID = ((GXutil.strcmp("", A561TBT02_UPLOAD_USER_ID)==0) ? true : false) ;
            A562TBT02_UPLOAD_AUTH_CD = httpContext.cgiGet( edtTBT02_UPLOAD_AUTH_CD_Internalname) ;
            n562TBT02_UPLOAD_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A562TBT02_UPLOAD_AUTH_CD", A562TBT02_UPLOAD_AUTH_CD);
            n562TBT02_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A562TBT02_UPLOAD_AUTH_CD)==0) ? true : false) ;
            A563TBT02_DM_ARRIVAL_FLG = httpContext.cgiGet( edtTBT02_DM_ARRIVAL_FLG_Internalname) ;
            n563TBT02_DM_ARRIVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A563TBT02_DM_ARRIVAL_FLG", A563TBT02_DM_ARRIVAL_FLG);
            n563TBT02_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A563TBT02_DM_ARRIVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_DM_ARRIVAL_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"DM到着日時"}), 1, "TBT02_DM_ARRIVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_DM_ARRIVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n564TBT02_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A564TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A564TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A564TBT02_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_DM_ARRIVAL_DATETIME_Internalname)) ;
               n564TBT02_DM_ARRIVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A564TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A564TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n564TBT02_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A564TBT02_DM_ARRIVAL_DATETIME) ? true : false) ;
            A565TBT02_APPROVAL_FLG = httpContext.cgiGet( edtTBT02_APPROVAL_FLG_Internalname) ;
            n565TBT02_APPROVAL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A565TBT02_APPROVAL_FLG", A565TBT02_APPROVAL_FLG);
            n565TBT02_APPROVAL_FLG = ((GXutil.strcmp("", A565TBT02_APPROVAL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_APPROVAL_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"承認日時"}), 1, "TBT02_APPROVAL_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_APPROVAL_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n566TBT02_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A566TBT02_APPROVAL_DATETIME", localUtil.ttoc( A566TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A566TBT02_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_APPROVAL_DATETIME_Internalname)) ;
               n566TBT02_APPROVAL_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A566TBT02_APPROVAL_DATETIME", localUtil.ttoc( A566TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n566TBT02_APPROVAL_DATETIME = (GXutil.nullDate().equals(A566TBT02_APPROVAL_DATETIME) ? true : false) ;
            A567TBT02_APPROVAL_USER_ID = httpContext.cgiGet( edtTBT02_APPROVAL_USER_ID_Internalname) ;
            n567TBT02_APPROVAL_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A567TBT02_APPROVAL_USER_ID", A567TBT02_APPROVAL_USER_ID);
            n567TBT02_APPROVAL_USER_ID = ((GXutil.strcmp("", A567TBT02_APPROVAL_USER_ID)==0) ? true : false) ;
            A568TBT02_APPROVAL_AUTH_CD = httpContext.cgiGet( edtTBT02_APPROVAL_AUTH_CD_Internalname) ;
            n568TBT02_APPROVAL_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A568TBT02_APPROVAL_AUTH_CD", A568TBT02_APPROVAL_AUTH_CD);
            n568TBT02_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A568TBT02_APPROVAL_AUTH_CD)==0) ? true : false) ;
            A569TBT02_INPUT_END_FLG = httpContext.cgiGet( edtTBT02_INPUT_END_FLG_Internalname) ;
            n569TBT02_INPUT_END_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A569TBT02_INPUT_END_FLG", A569TBT02_INPUT_END_FLG);
            n569TBT02_INPUT_END_FLG = ((GXutil.strcmp("", A569TBT02_INPUT_END_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_INPUT_END_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"データ固定日時"}), 1, "TBT02_INPUT_END_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_INPUT_END_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A570TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n570TBT02_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A570TBT02_INPUT_END_DATETIME", localUtil.ttoc( A570TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A570TBT02_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_INPUT_END_DATETIME_Internalname)) ;
               n570TBT02_INPUT_END_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A570TBT02_INPUT_END_DATETIME", localUtil.ttoc( A570TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n570TBT02_INPUT_END_DATETIME = (GXutil.nullDate().equals(A570TBT02_INPUT_END_DATETIME) ? true : false) ;
            A571TBT02_INPUT_END_USER_ID = httpContext.cgiGet( edtTBT02_INPUT_END_USER_ID_Internalname) ;
            n571TBT02_INPUT_END_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A571TBT02_INPUT_END_USER_ID", A571TBT02_INPUT_END_USER_ID);
            n571TBT02_INPUT_END_USER_ID = ((GXutil.strcmp("", A571TBT02_INPUT_END_USER_ID)==0) ? true : false) ;
            A572TBT02_INPUT_END_AUTH_CD = httpContext.cgiGet( edtTBT02_INPUT_END_AUTH_CD_Internalname) ;
            n572TBT02_INPUT_END_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A572TBT02_INPUT_END_AUTH_CD", A572TBT02_INPUT_END_AUTH_CD);
            n572TBT02_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A572TBT02_INPUT_END_AUTH_CD)==0) ? true : false) ;
            A295TBT02_DEL_FLG = httpContext.cgiGet( edtTBT02_DEL_FLG_Internalname) ;
            n295TBT02_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A295TBT02_DEL_FLG", A295TBT02_DEL_FLG);
            n295TBT02_DEL_FLG = ((GXutil.strcmp("", A295TBT02_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBT02_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A296TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n296TBT02_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A296TBT02_CRT_DATETIME", localUtil.ttoc( A296TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A296TBT02_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_CRT_DATETIME_Internalname)) ;
               n296TBT02_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A296TBT02_CRT_DATETIME", localUtil.ttoc( A296TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n296TBT02_CRT_DATETIME = (GXutil.nullDate().equals(A296TBT02_CRT_DATETIME) ? true : false) ;
            A297TBT02_CRT_USER_ID = httpContext.cgiGet( edtTBT02_CRT_USER_ID_Internalname) ;
            n297TBT02_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A297TBT02_CRT_USER_ID", A297TBT02_CRT_USER_ID);
            n297TBT02_CRT_USER_ID = ((GXutil.strcmp("", A297TBT02_CRT_USER_ID)==0) ? true : false) ;
            A298TBT02_CRT_PROG_NM = httpContext.cgiGet( edtTBT02_CRT_PROG_NM_Internalname) ;
            n298TBT02_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A298TBT02_CRT_PROG_NM", A298TBT02_CRT_PROG_NM);
            n298TBT02_CRT_PROG_NM = ((GXutil.strcmp("", A298TBT02_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT02_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBT02_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n299TBT02_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A299TBT02_UPD_DATETIME", localUtil.ttoc( A299TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A299TBT02_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT02_UPD_DATETIME_Internalname)) ;
               n299TBT02_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A299TBT02_UPD_DATETIME", localUtil.ttoc( A299TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n299TBT02_UPD_DATETIME = (GXutil.nullDate().equals(A299TBT02_UPD_DATETIME) ? true : false) ;
            A300TBT02_UPD_USER_ID = httpContext.cgiGet( edtTBT02_UPD_USER_ID_Internalname) ;
            n300TBT02_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A300TBT02_UPD_USER_ID", A300TBT02_UPD_USER_ID);
            n300TBT02_UPD_USER_ID = ((GXutil.strcmp("", A300TBT02_UPD_USER_ID)==0) ? true : false) ;
            A301TBT02_UPD_PROG_NM = httpContext.cgiGet( edtTBT02_UPD_PROG_NM_Internalname) ;
            n301TBT02_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A301TBT02_UPD_PROG_NM", A301TBT02_UPD_PROG_NM);
            n301TBT02_UPD_PROG_NM = ((GXutil.strcmp("", A301TBT02_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT02_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT02_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT02_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A302TBT02_UPD_CNT = 0 ;
               n302TBT02_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
            }
            else
            {
               A302TBT02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT02_UPD_CNT_Internalname), ".", ",") ;
               n302TBT02_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
            }
            n302TBT02_UPD_CNT = ((0==A302TBT02_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z292TBT02_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z292TBT02_STUDY_ID"), ".", ",") ;
            Z293TBT02_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z293TBT02_SUBJECT_ID"), ".", ",")) ;
            Z294TBT02_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z294TBT02_CRF_ID"), ".", ",")) ;
            Z296TBT02_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z296TBT02_CRT_DATETIME"), 0) ;
            n296TBT02_CRT_DATETIME = (GXutil.nullDate().equals(A296TBT02_CRT_DATETIME) ? true : false) ;
            Z297TBT02_CRT_USER_ID = httpContext.cgiGet( "Z297TBT02_CRT_USER_ID") ;
            n297TBT02_CRT_USER_ID = ((GXutil.strcmp("", A297TBT02_CRT_USER_ID)==0) ? true : false) ;
            Z299TBT02_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z299TBT02_UPD_DATETIME"), 0) ;
            n299TBT02_UPD_DATETIME = (GXutil.nullDate().equals(A299TBT02_UPD_DATETIME) ? true : false) ;
            Z300TBT02_UPD_USER_ID = httpContext.cgiGet( "Z300TBT02_UPD_USER_ID") ;
            n300TBT02_UPD_USER_ID = ((GXutil.strcmp("", A300TBT02_UPD_USER_ID)==0) ? true : false) ;
            Z302TBT02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z302TBT02_UPD_CNT"), ".", ",") ;
            n302TBT02_UPD_CNT = ((0==A302TBT02_UPD_CNT) ? true : false) ;
            Z370TBT02_CRF_LATEST_VERSION = (short)(localUtil.ctol( httpContext.cgiGet( "Z370TBT02_CRF_LATEST_VERSION"), ".", ",")) ;
            n370TBT02_CRF_LATEST_VERSION = ((0==A370TBT02_CRF_LATEST_VERSION) ? true : false) ;
            Z371TBT02_CRF_INPUT_LEVEL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z371TBT02_CRF_INPUT_LEVEL"), ".", ",")) ;
            n371TBT02_CRF_INPUT_LEVEL = ((0==A371TBT02_CRF_INPUT_LEVEL) ? true : false) ;
            Z556TBT02_LOCK_FLG = httpContext.cgiGet( "Z556TBT02_LOCK_FLG") ;
            n556TBT02_LOCK_FLG = ((GXutil.strcmp("", A556TBT02_LOCK_FLG)==0) ? true : false) ;
            Z557TBT02_LOCK_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z557TBT02_LOCK_DATETIME"), 0) ;
            n557TBT02_LOCK_DATETIME = (GXutil.nullDate().equals(A557TBT02_LOCK_DATETIME) ? true : false) ;
            Z558TBT02_LOCK_USER_ID = httpContext.cgiGet( "Z558TBT02_LOCK_USER_ID") ;
            n558TBT02_LOCK_USER_ID = ((GXutil.strcmp("", A558TBT02_LOCK_USER_ID)==0) ? true : false) ;
            Z559TBT02_LOCK_AUTH_CD = httpContext.cgiGet( "Z559TBT02_LOCK_AUTH_CD") ;
            n559TBT02_LOCK_AUTH_CD = ((GXutil.strcmp("", A559TBT02_LOCK_AUTH_CD)==0) ? true : false) ;
            Z560TBT02_UPLOAD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z560TBT02_UPLOAD_DATETIME"), 0) ;
            n560TBT02_UPLOAD_DATETIME = (GXutil.nullDate().equals(A560TBT02_UPLOAD_DATETIME) ? true : false) ;
            Z561TBT02_UPLOAD_USER_ID = httpContext.cgiGet( "Z561TBT02_UPLOAD_USER_ID") ;
            n561TBT02_UPLOAD_USER_ID = ((GXutil.strcmp("", A561TBT02_UPLOAD_USER_ID)==0) ? true : false) ;
            Z562TBT02_UPLOAD_AUTH_CD = httpContext.cgiGet( "Z562TBT02_UPLOAD_AUTH_CD") ;
            n562TBT02_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A562TBT02_UPLOAD_AUTH_CD)==0) ? true : false) ;
            Z563TBT02_DM_ARRIVAL_FLG = httpContext.cgiGet( "Z563TBT02_DM_ARRIVAL_FLG") ;
            n563TBT02_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A563TBT02_DM_ARRIVAL_FLG)==0) ? true : false) ;
            Z564TBT02_DM_ARRIVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z564TBT02_DM_ARRIVAL_DATETIME"), 0) ;
            n564TBT02_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A564TBT02_DM_ARRIVAL_DATETIME) ? true : false) ;
            Z565TBT02_APPROVAL_FLG = httpContext.cgiGet( "Z565TBT02_APPROVAL_FLG") ;
            n565TBT02_APPROVAL_FLG = ((GXutil.strcmp("", A565TBT02_APPROVAL_FLG)==0) ? true : false) ;
            Z566TBT02_APPROVAL_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z566TBT02_APPROVAL_DATETIME"), 0) ;
            n566TBT02_APPROVAL_DATETIME = (GXutil.nullDate().equals(A566TBT02_APPROVAL_DATETIME) ? true : false) ;
            Z567TBT02_APPROVAL_USER_ID = httpContext.cgiGet( "Z567TBT02_APPROVAL_USER_ID") ;
            n567TBT02_APPROVAL_USER_ID = ((GXutil.strcmp("", A567TBT02_APPROVAL_USER_ID)==0) ? true : false) ;
            Z568TBT02_APPROVAL_AUTH_CD = httpContext.cgiGet( "Z568TBT02_APPROVAL_AUTH_CD") ;
            n568TBT02_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A568TBT02_APPROVAL_AUTH_CD)==0) ? true : false) ;
            Z569TBT02_INPUT_END_FLG = httpContext.cgiGet( "Z569TBT02_INPUT_END_FLG") ;
            n569TBT02_INPUT_END_FLG = ((GXutil.strcmp("", A569TBT02_INPUT_END_FLG)==0) ? true : false) ;
            Z570TBT02_INPUT_END_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z570TBT02_INPUT_END_DATETIME"), 0) ;
            n570TBT02_INPUT_END_DATETIME = (GXutil.nullDate().equals(A570TBT02_INPUT_END_DATETIME) ? true : false) ;
            Z571TBT02_INPUT_END_USER_ID = httpContext.cgiGet( "Z571TBT02_INPUT_END_USER_ID") ;
            n571TBT02_INPUT_END_USER_ID = ((GXutil.strcmp("", A571TBT02_INPUT_END_USER_ID)==0) ? true : false) ;
            Z572TBT02_INPUT_END_AUTH_CD = httpContext.cgiGet( "Z572TBT02_INPUT_END_AUTH_CD") ;
            n572TBT02_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A572TBT02_INPUT_END_AUTH_CD)==0) ? true : false) ;
            Z295TBT02_DEL_FLG = httpContext.cgiGet( "Z295TBT02_DEL_FLG") ;
            n295TBT02_DEL_FLG = ((GXutil.strcmp("", A295TBT02_DEL_FLG)==0) ? true : false) ;
            Z298TBT02_CRT_PROG_NM = httpContext.cgiGet( "Z298TBT02_CRT_PROG_NM") ;
            n298TBT02_CRT_PROG_NM = ((GXutil.strcmp("", A298TBT02_CRT_PROG_NM)==0) ? true : false) ;
            Z301TBT02_UPD_PROG_NM = httpContext.cgiGet( "Z301TBT02_UPD_PROG_NM") ;
            n301TBT02_UPD_PROG_NM = ((GXutil.strcmp("", A301TBT02_UPD_PROG_NM)==0) ? true : false) ;
            O302TBT02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O302TBT02_UPD_CNT"), ".", ",") ;
            n302TBT02_UPD_CNT = ((0==A302TBT02_UPD_CNT) ? true : false) ;
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
               A292TBT02_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
               A293TBT02_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
               A294TBT02_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
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
            initAll0P24( ) ;
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
      disableAttributes0P24( ) ;
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120P2( )
   {
      /* After Trn Routine */
   }

   public void S1183( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0P24( int GX_JID )
   {
      if ( ( GX_JID == 13 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z296TBT02_CRT_DATETIME = T000P3_A296TBT02_CRT_DATETIME[0] ;
            Z297TBT02_CRT_USER_ID = T000P3_A297TBT02_CRT_USER_ID[0] ;
            Z299TBT02_UPD_DATETIME = T000P3_A299TBT02_UPD_DATETIME[0] ;
            Z300TBT02_UPD_USER_ID = T000P3_A300TBT02_UPD_USER_ID[0] ;
            Z302TBT02_UPD_CNT = T000P3_A302TBT02_UPD_CNT[0] ;
            Z370TBT02_CRF_LATEST_VERSION = T000P3_A370TBT02_CRF_LATEST_VERSION[0] ;
            Z371TBT02_CRF_INPUT_LEVEL = T000P3_A371TBT02_CRF_INPUT_LEVEL[0] ;
            Z556TBT02_LOCK_FLG = T000P3_A556TBT02_LOCK_FLG[0] ;
            Z557TBT02_LOCK_DATETIME = T000P3_A557TBT02_LOCK_DATETIME[0] ;
            Z558TBT02_LOCK_USER_ID = T000P3_A558TBT02_LOCK_USER_ID[0] ;
            Z559TBT02_LOCK_AUTH_CD = T000P3_A559TBT02_LOCK_AUTH_CD[0] ;
            Z560TBT02_UPLOAD_DATETIME = T000P3_A560TBT02_UPLOAD_DATETIME[0] ;
            Z561TBT02_UPLOAD_USER_ID = T000P3_A561TBT02_UPLOAD_USER_ID[0] ;
            Z562TBT02_UPLOAD_AUTH_CD = T000P3_A562TBT02_UPLOAD_AUTH_CD[0] ;
            Z563TBT02_DM_ARRIVAL_FLG = T000P3_A563TBT02_DM_ARRIVAL_FLG[0] ;
            Z564TBT02_DM_ARRIVAL_DATETIME = T000P3_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
            Z565TBT02_APPROVAL_FLG = T000P3_A565TBT02_APPROVAL_FLG[0] ;
            Z566TBT02_APPROVAL_DATETIME = T000P3_A566TBT02_APPROVAL_DATETIME[0] ;
            Z567TBT02_APPROVAL_USER_ID = T000P3_A567TBT02_APPROVAL_USER_ID[0] ;
            Z568TBT02_APPROVAL_AUTH_CD = T000P3_A568TBT02_APPROVAL_AUTH_CD[0] ;
            Z569TBT02_INPUT_END_FLG = T000P3_A569TBT02_INPUT_END_FLG[0] ;
            Z570TBT02_INPUT_END_DATETIME = T000P3_A570TBT02_INPUT_END_DATETIME[0] ;
            Z571TBT02_INPUT_END_USER_ID = T000P3_A571TBT02_INPUT_END_USER_ID[0] ;
            Z572TBT02_INPUT_END_AUTH_CD = T000P3_A572TBT02_INPUT_END_AUTH_CD[0] ;
            Z295TBT02_DEL_FLG = T000P3_A295TBT02_DEL_FLG[0] ;
            Z298TBT02_CRT_PROG_NM = T000P3_A298TBT02_CRT_PROG_NM[0] ;
            Z301TBT02_UPD_PROG_NM = T000P3_A301TBT02_UPD_PROG_NM[0] ;
         }
         else
         {
            Z296TBT02_CRT_DATETIME = A296TBT02_CRT_DATETIME ;
            Z297TBT02_CRT_USER_ID = A297TBT02_CRT_USER_ID ;
            Z299TBT02_UPD_DATETIME = A299TBT02_UPD_DATETIME ;
            Z300TBT02_UPD_USER_ID = A300TBT02_UPD_USER_ID ;
            Z302TBT02_UPD_CNT = A302TBT02_UPD_CNT ;
            Z370TBT02_CRF_LATEST_VERSION = A370TBT02_CRF_LATEST_VERSION ;
            Z371TBT02_CRF_INPUT_LEVEL = A371TBT02_CRF_INPUT_LEVEL ;
            Z556TBT02_LOCK_FLG = A556TBT02_LOCK_FLG ;
            Z557TBT02_LOCK_DATETIME = A557TBT02_LOCK_DATETIME ;
            Z558TBT02_LOCK_USER_ID = A558TBT02_LOCK_USER_ID ;
            Z559TBT02_LOCK_AUTH_CD = A559TBT02_LOCK_AUTH_CD ;
            Z560TBT02_UPLOAD_DATETIME = A560TBT02_UPLOAD_DATETIME ;
            Z561TBT02_UPLOAD_USER_ID = A561TBT02_UPLOAD_USER_ID ;
            Z562TBT02_UPLOAD_AUTH_CD = A562TBT02_UPLOAD_AUTH_CD ;
            Z563TBT02_DM_ARRIVAL_FLG = A563TBT02_DM_ARRIVAL_FLG ;
            Z564TBT02_DM_ARRIVAL_DATETIME = A564TBT02_DM_ARRIVAL_DATETIME ;
            Z565TBT02_APPROVAL_FLG = A565TBT02_APPROVAL_FLG ;
            Z566TBT02_APPROVAL_DATETIME = A566TBT02_APPROVAL_DATETIME ;
            Z567TBT02_APPROVAL_USER_ID = A567TBT02_APPROVAL_USER_ID ;
            Z568TBT02_APPROVAL_AUTH_CD = A568TBT02_APPROVAL_AUTH_CD ;
            Z569TBT02_INPUT_END_FLG = A569TBT02_INPUT_END_FLG ;
            Z570TBT02_INPUT_END_DATETIME = A570TBT02_INPUT_END_DATETIME ;
            Z571TBT02_INPUT_END_USER_ID = A571TBT02_INPUT_END_USER_ID ;
            Z572TBT02_INPUT_END_AUTH_CD = A572TBT02_INPUT_END_AUTH_CD ;
            Z295TBT02_DEL_FLG = A295TBT02_DEL_FLG ;
            Z298TBT02_CRT_PROG_NM = A298TBT02_CRT_PROG_NM ;
            Z301TBT02_UPD_PROG_NM = A301TBT02_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -13 )
      {
         Z294TBT02_CRF_ID = A294TBT02_CRF_ID ;
         Z296TBT02_CRT_DATETIME = A296TBT02_CRT_DATETIME ;
         Z297TBT02_CRT_USER_ID = A297TBT02_CRT_USER_ID ;
         Z299TBT02_UPD_DATETIME = A299TBT02_UPD_DATETIME ;
         Z300TBT02_UPD_USER_ID = A300TBT02_UPD_USER_ID ;
         Z302TBT02_UPD_CNT = A302TBT02_UPD_CNT ;
         Z370TBT02_CRF_LATEST_VERSION = A370TBT02_CRF_LATEST_VERSION ;
         Z371TBT02_CRF_INPUT_LEVEL = A371TBT02_CRF_INPUT_LEVEL ;
         Z556TBT02_LOCK_FLG = A556TBT02_LOCK_FLG ;
         Z557TBT02_LOCK_DATETIME = A557TBT02_LOCK_DATETIME ;
         Z558TBT02_LOCK_USER_ID = A558TBT02_LOCK_USER_ID ;
         Z559TBT02_LOCK_AUTH_CD = A559TBT02_LOCK_AUTH_CD ;
         Z560TBT02_UPLOAD_DATETIME = A560TBT02_UPLOAD_DATETIME ;
         Z561TBT02_UPLOAD_USER_ID = A561TBT02_UPLOAD_USER_ID ;
         Z562TBT02_UPLOAD_AUTH_CD = A562TBT02_UPLOAD_AUTH_CD ;
         Z563TBT02_DM_ARRIVAL_FLG = A563TBT02_DM_ARRIVAL_FLG ;
         Z564TBT02_DM_ARRIVAL_DATETIME = A564TBT02_DM_ARRIVAL_DATETIME ;
         Z565TBT02_APPROVAL_FLG = A565TBT02_APPROVAL_FLG ;
         Z566TBT02_APPROVAL_DATETIME = A566TBT02_APPROVAL_DATETIME ;
         Z567TBT02_APPROVAL_USER_ID = A567TBT02_APPROVAL_USER_ID ;
         Z568TBT02_APPROVAL_AUTH_CD = A568TBT02_APPROVAL_AUTH_CD ;
         Z569TBT02_INPUT_END_FLG = A569TBT02_INPUT_END_FLG ;
         Z570TBT02_INPUT_END_DATETIME = A570TBT02_INPUT_END_DATETIME ;
         Z571TBT02_INPUT_END_USER_ID = A571TBT02_INPUT_END_USER_ID ;
         Z572TBT02_INPUT_END_AUTH_CD = A572TBT02_INPUT_END_AUTH_CD ;
         Z295TBT02_DEL_FLG = A295TBT02_DEL_FLG ;
         Z298TBT02_CRT_PROG_NM = A298TBT02_CRT_PROG_NM ;
         Z301TBT02_UPD_PROG_NM = A301TBT02_UPD_PROG_NM ;
         Z292TBT02_STUDY_ID = A292TBT02_STUDY_ID ;
         Z293TBT02_SUBJECT_ID = A293TBT02_SUBJECT_ID ;
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

   public void load0P24( )
   {
      /* Using cursor T000P5 */
      pr_default.execute(3, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound24 = (short)(1) ;
         A296TBT02_CRT_DATETIME = T000P5_A296TBT02_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A296TBT02_CRT_DATETIME", localUtil.ttoc( A296TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n296TBT02_CRT_DATETIME = T000P5_n296TBT02_CRT_DATETIME[0] ;
         A297TBT02_CRT_USER_ID = T000P5_A297TBT02_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A297TBT02_CRT_USER_ID", A297TBT02_CRT_USER_ID);
         n297TBT02_CRT_USER_ID = T000P5_n297TBT02_CRT_USER_ID[0] ;
         A299TBT02_UPD_DATETIME = T000P5_A299TBT02_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A299TBT02_UPD_DATETIME", localUtil.ttoc( A299TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n299TBT02_UPD_DATETIME = T000P5_n299TBT02_UPD_DATETIME[0] ;
         A300TBT02_UPD_USER_ID = T000P5_A300TBT02_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A300TBT02_UPD_USER_ID", A300TBT02_UPD_USER_ID);
         n300TBT02_UPD_USER_ID = T000P5_n300TBT02_UPD_USER_ID[0] ;
         A302TBT02_UPD_CNT = T000P5_A302TBT02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
         n302TBT02_UPD_CNT = T000P5_n302TBT02_UPD_CNT[0] ;
         A370TBT02_CRF_LATEST_VERSION = T000P5_A370TBT02_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A370TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A370TBT02_CRF_LATEST_VERSION, 4, 0)));
         n370TBT02_CRF_LATEST_VERSION = T000P5_n370TBT02_CRF_LATEST_VERSION[0] ;
         A371TBT02_CRF_INPUT_LEVEL = T000P5_A371TBT02_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A371TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A371TBT02_CRF_INPUT_LEVEL, 2, 0)));
         n371TBT02_CRF_INPUT_LEVEL = T000P5_n371TBT02_CRF_INPUT_LEVEL[0] ;
         A556TBT02_LOCK_FLG = T000P5_A556TBT02_LOCK_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A556TBT02_LOCK_FLG", A556TBT02_LOCK_FLG);
         n556TBT02_LOCK_FLG = T000P5_n556TBT02_LOCK_FLG[0] ;
         A557TBT02_LOCK_DATETIME = T000P5_A557TBT02_LOCK_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557TBT02_LOCK_DATETIME", localUtil.ttoc( A557TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n557TBT02_LOCK_DATETIME = T000P5_n557TBT02_LOCK_DATETIME[0] ;
         A558TBT02_LOCK_USER_ID = T000P5_A558TBT02_LOCK_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558TBT02_LOCK_USER_ID", A558TBT02_LOCK_USER_ID);
         n558TBT02_LOCK_USER_ID = T000P5_n558TBT02_LOCK_USER_ID[0] ;
         A559TBT02_LOCK_AUTH_CD = T000P5_A559TBT02_LOCK_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A559TBT02_LOCK_AUTH_CD", A559TBT02_LOCK_AUTH_CD);
         n559TBT02_LOCK_AUTH_CD = T000P5_n559TBT02_LOCK_AUTH_CD[0] ;
         A560TBT02_UPLOAD_DATETIME = T000P5_A560TBT02_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A560TBT02_UPLOAD_DATETIME", localUtil.ttoc( A560TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n560TBT02_UPLOAD_DATETIME = T000P5_n560TBT02_UPLOAD_DATETIME[0] ;
         A561TBT02_UPLOAD_USER_ID = T000P5_A561TBT02_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561TBT02_UPLOAD_USER_ID", A561TBT02_UPLOAD_USER_ID);
         n561TBT02_UPLOAD_USER_ID = T000P5_n561TBT02_UPLOAD_USER_ID[0] ;
         A562TBT02_UPLOAD_AUTH_CD = T000P5_A562TBT02_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A562TBT02_UPLOAD_AUTH_CD", A562TBT02_UPLOAD_AUTH_CD);
         n562TBT02_UPLOAD_AUTH_CD = T000P5_n562TBT02_UPLOAD_AUTH_CD[0] ;
         A563TBT02_DM_ARRIVAL_FLG = T000P5_A563TBT02_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A563TBT02_DM_ARRIVAL_FLG", A563TBT02_DM_ARRIVAL_FLG);
         n563TBT02_DM_ARRIVAL_FLG = T000P5_n563TBT02_DM_ARRIVAL_FLG[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = T000P5_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A564TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A564TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n564TBT02_DM_ARRIVAL_DATETIME = T000P5_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         A565TBT02_APPROVAL_FLG = T000P5_A565TBT02_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A565TBT02_APPROVAL_FLG", A565TBT02_APPROVAL_FLG);
         n565TBT02_APPROVAL_FLG = T000P5_n565TBT02_APPROVAL_FLG[0] ;
         A566TBT02_APPROVAL_DATETIME = T000P5_A566TBT02_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A566TBT02_APPROVAL_DATETIME", localUtil.ttoc( A566TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n566TBT02_APPROVAL_DATETIME = T000P5_n566TBT02_APPROVAL_DATETIME[0] ;
         A567TBT02_APPROVAL_USER_ID = T000P5_A567TBT02_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A567TBT02_APPROVAL_USER_ID", A567TBT02_APPROVAL_USER_ID);
         n567TBT02_APPROVAL_USER_ID = T000P5_n567TBT02_APPROVAL_USER_ID[0] ;
         A568TBT02_APPROVAL_AUTH_CD = T000P5_A568TBT02_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A568TBT02_APPROVAL_AUTH_CD", A568TBT02_APPROVAL_AUTH_CD);
         n568TBT02_APPROVAL_AUTH_CD = T000P5_n568TBT02_APPROVAL_AUTH_CD[0] ;
         A569TBT02_INPUT_END_FLG = T000P5_A569TBT02_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A569TBT02_INPUT_END_FLG", A569TBT02_INPUT_END_FLG);
         n569TBT02_INPUT_END_FLG = T000P5_n569TBT02_INPUT_END_FLG[0] ;
         A570TBT02_INPUT_END_DATETIME = T000P5_A570TBT02_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A570TBT02_INPUT_END_DATETIME", localUtil.ttoc( A570TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n570TBT02_INPUT_END_DATETIME = T000P5_n570TBT02_INPUT_END_DATETIME[0] ;
         A571TBT02_INPUT_END_USER_ID = T000P5_A571TBT02_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A571TBT02_INPUT_END_USER_ID", A571TBT02_INPUT_END_USER_ID);
         n571TBT02_INPUT_END_USER_ID = T000P5_n571TBT02_INPUT_END_USER_ID[0] ;
         A572TBT02_INPUT_END_AUTH_CD = T000P5_A572TBT02_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A572TBT02_INPUT_END_AUTH_CD", A572TBT02_INPUT_END_AUTH_CD);
         n572TBT02_INPUT_END_AUTH_CD = T000P5_n572TBT02_INPUT_END_AUTH_CD[0] ;
         A295TBT02_DEL_FLG = T000P5_A295TBT02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A295TBT02_DEL_FLG", A295TBT02_DEL_FLG);
         n295TBT02_DEL_FLG = T000P5_n295TBT02_DEL_FLG[0] ;
         A298TBT02_CRT_PROG_NM = T000P5_A298TBT02_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298TBT02_CRT_PROG_NM", A298TBT02_CRT_PROG_NM);
         n298TBT02_CRT_PROG_NM = T000P5_n298TBT02_CRT_PROG_NM[0] ;
         A301TBT02_UPD_PROG_NM = T000P5_A301TBT02_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A301TBT02_UPD_PROG_NM", A301TBT02_UPD_PROG_NM);
         n301TBT02_UPD_PROG_NM = T000P5_n301TBT02_UPD_PROG_NM[0] ;
         zm0P24( -13) ;
      }
      pr_default.close(3);
      onLoadActions0P24( ) ;
   }

   public void onLoadActions0P24( )
   {
      AV9Pgmname = "TBT02_CRF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0P24( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBT02_CRF" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000P4 */
      pr_default.execute(2, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError292 = 1 ;
         AnyError293 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFテーブル・患者サブタイプ'", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError292 == 0 ) && ( AnyError293 == 0 ) )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A557TBT02_LOCK_DATETIME) || (( A557TBT02_LOCK_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A557TBT02_LOCK_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　ロック日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A560TBT02_UPLOAD_DATETIME) || (( A560TBT02_UPLOAD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A560TBT02_UPLOAD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　アップロード日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A564TBT02_DM_ARRIVAL_DATETIME) || (( A564TBT02_DM_ARRIVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A564TBT02_DM_ARRIVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　DM到着日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A566TBT02_APPROVAL_DATETIME) || (( A566TBT02_APPROVAL_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A566TBT02_APPROVAL_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　承認日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A570TBT02_INPUT_END_DATETIME) || (( A570TBT02_INPUT_END_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A570TBT02_INPUT_END_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　データ固定日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A296TBT02_CRT_DATETIME) || (( A296TBT02_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A296TBT02_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A299TBT02_UPD_DATETIME) || (( A299TBT02_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A299TBT02_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0P24( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_14( long A292TBT02_STUDY_ID ,
                          int A293TBT02_SUBJECT_ID )
   {
      /* Using cursor T000P6 */
      pr_default.execute(4, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         AnyError292 = 1 ;
         AnyError293 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFテーブル・患者サブタイプ'", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError292 == 0 ) && ( AnyError293 == 0 ) )
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

   public void getKey0P24( )
   {
      /* Using cursor T000P7 */
      pr_default.execute(5, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound24 = (short)(1) ;
      }
      else
      {
         RcdFound24 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000P3 */
      pr_default.execute(1, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0P24( 13) ;
         RcdFound24 = (short)(1) ;
         A294TBT02_CRF_ID = T000P3_A294TBT02_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
         A296TBT02_CRT_DATETIME = T000P3_A296TBT02_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A296TBT02_CRT_DATETIME", localUtil.ttoc( A296TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n296TBT02_CRT_DATETIME = T000P3_n296TBT02_CRT_DATETIME[0] ;
         A297TBT02_CRT_USER_ID = T000P3_A297TBT02_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A297TBT02_CRT_USER_ID", A297TBT02_CRT_USER_ID);
         n297TBT02_CRT_USER_ID = T000P3_n297TBT02_CRT_USER_ID[0] ;
         A299TBT02_UPD_DATETIME = T000P3_A299TBT02_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A299TBT02_UPD_DATETIME", localUtil.ttoc( A299TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n299TBT02_UPD_DATETIME = T000P3_n299TBT02_UPD_DATETIME[0] ;
         A300TBT02_UPD_USER_ID = T000P3_A300TBT02_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A300TBT02_UPD_USER_ID", A300TBT02_UPD_USER_ID);
         n300TBT02_UPD_USER_ID = T000P3_n300TBT02_UPD_USER_ID[0] ;
         A302TBT02_UPD_CNT = T000P3_A302TBT02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
         n302TBT02_UPD_CNT = T000P3_n302TBT02_UPD_CNT[0] ;
         A370TBT02_CRF_LATEST_VERSION = T000P3_A370TBT02_CRF_LATEST_VERSION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A370TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A370TBT02_CRF_LATEST_VERSION, 4, 0)));
         n370TBT02_CRF_LATEST_VERSION = T000P3_n370TBT02_CRF_LATEST_VERSION[0] ;
         A371TBT02_CRF_INPUT_LEVEL = T000P3_A371TBT02_CRF_INPUT_LEVEL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A371TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A371TBT02_CRF_INPUT_LEVEL, 2, 0)));
         n371TBT02_CRF_INPUT_LEVEL = T000P3_n371TBT02_CRF_INPUT_LEVEL[0] ;
         A556TBT02_LOCK_FLG = T000P3_A556TBT02_LOCK_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A556TBT02_LOCK_FLG", A556TBT02_LOCK_FLG);
         n556TBT02_LOCK_FLG = T000P3_n556TBT02_LOCK_FLG[0] ;
         A557TBT02_LOCK_DATETIME = T000P3_A557TBT02_LOCK_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A557TBT02_LOCK_DATETIME", localUtil.ttoc( A557TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n557TBT02_LOCK_DATETIME = T000P3_n557TBT02_LOCK_DATETIME[0] ;
         A558TBT02_LOCK_USER_ID = T000P3_A558TBT02_LOCK_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A558TBT02_LOCK_USER_ID", A558TBT02_LOCK_USER_ID);
         n558TBT02_LOCK_USER_ID = T000P3_n558TBT02_LOCK_USER_ID[0] ;
         A559TBT02_LOCK_AUTH_CD = T000P3_A559TBT02_LOCK_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A559TBT02_LOCK_AUTH_CD", A559TBT02_LOCK_AUTH_CD);
         n559TBT02_LOCK_AUTH_CD = T000P3_n559TBT02_LOCK_AUTH_CD[0] ;
         A560TBT02_UPLOAD_DATETIME = T000P3_A560TBT02_UPLOAD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A560TBT02_UPLOAD_DATETIME", localUtil.ttoc( A560TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n560TBT02_UPLOAD_DATETIME = T000P3_n560TBT02_UPLOAD_DATETIME[0] ;
         A561TBT02_UPLOAD_USER_ID = T000P3_A561TBT02_UPLOAD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A561TBT02_UPLOAD_USER_ID", A561TBT02_UPLOAD_USER_ID);
         n561TBT02_UPLOAD_USER_ID = T000P3_n561TBT02_UPLOAD_USER_ID[0] ;
         A562TBT02_UPLOAD_AUTH_CD = T000P3_A562TBT02_UPLOAD_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A562TBT02_UPLOAD_AUTH_CD", A562TBT02_UPLOAD_AUTH_CD);
         n562TBT02_UPLOAD_AUTH_CD = T000P3_n562TBT02_UPLOAD_AUTH_CD[0] ;
         A563TBT02_DM_ARRIVAL_FLG = T000P3_A563TBT02_DM_ARRIVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A563TBT02_DM_ARRIVAL_FLG", A563TBT02_DM_ARRIVAL_FLG);
         n563TBT02_DM_ARRIVAL_FLG = T000P3_n563TBT02_DM_ARRIVAL_FLG[0] ;
         A564TBT02_DM_ARRIVAL_DATETIME = T000P3_A564TBT02_DM_ARRIVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A564TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A564TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n564TBT02_DM_ARRIVAL_DATETIME = T000P3_n564TBT02_DM_ARRIVAL_DATETIME[0] ;
         A565TBT02_APPROVAL_FLG = T000P3_A565TBT02_APPROVAL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A565TBT02_APPROVAL_FLG", A565TBT02_APPROVAL_FLG);
         n565TBT02_APPROVAL_FLG = T000P3_n565TBT02_APPROVAL_FLG[0] ;
         A566TBT02_APPROVAL_DATETIME = T000P3_A566TBT02_APPROVAL_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A566TBT02_APPROVAL_DATETIME", localUtil.ttoc( A566TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n566TBT02_APPROVAL_DATETIME = T000P3_n566TBT02_APPROVAL_DATETIME[0] ;
         A567TBT02_APPROVAL_USER_ID = T000P3_A567TBT02_APPROVAL_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A567TBT02_APPROVAL_USER_ID", A567TBT02_APPROVAL_USER_ID);
         n567TBT02_APPROVAL_USER_ID = T000P3_n567TBT02_APPROVAL_USER_ID[0] ;
         A568TBT02_APPROVAL_AUTH_CD = T000P3_A568TBT02_APPROVAL_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A568TBT02_APPROVAL_AUTH_CD", A568TBT02_APPROVAL_AUTH_CD);
         n568TBT02_APPROVAL_AUTH_CD = T000P3_n568TBT02_APPROVAL_AUTH_CD[0] ;
         A569TBT02_INPUT_END_FLG = T000P3_A569TBT02_INPUT_END_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A569TBT02_INPUT_END_FLG", A569TBT02_INPUT_END_FLG);
         n569TBT02_INPUT_END_FLG = T000P3_n569TBT02_INPUT_END_FLG[0] ;
         A570TBT02_INPUT_END_DATETIME = T000P3_A570TBT02_INPUT_END_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A570TBT02_INPUT_END_DATETIME", localUtil.ttoc( A570TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n570TBT02_INPUT_END_DATETIME = T000P3_n570TBT02_INPUT_END_DATETIME[0] ;
         A571TBT02_INPUT_END_USER_ID = T000P3_A571TBT02_INPUT_END_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A571TBT02_INPUT_END_USER_ID", A571TBT02_INPUT_END_USER_ID);
         n571TBT02_INPUT_END_USER_ID = T000P3_n571TBT02_INPUT_END_USER_ID[0] ;
         A572TBT02_INPUT_END_AUTH_CD = T000P3_A572TBT02_INPUT_END_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A572TBT02_INPUT_END_AUTH_CD", A572TBT02_INPUT_END_AUTH_CD);
         n572TBT02_INPUT_END_AUTH_CD = T000P3_n572TBT02_INPUT_END_AUTH_CD[0] ;
         A295TBT02_DEL_FLG = T000P3_A295TBT02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A295TBT02_DEL_FLG", A295TBT02_DEL_FLG);
         n295TBT02_DEL_FLG = T000P3_n295TBT02_DEL_FLG[0] ;
         A298TBT02_CRT_PROG_NM = T000P3_A298TBT02_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A298TBT02_CRT_PROG_NM", A298TBT02_CRT_PROG_NM);
         n298TBT02_CRT_PROG_NM = T000P3_n298TBT02_CRT_PROG_NM[0] ;
         A301TBT02_UPD_PROG_NM = T000P3_A301TBT02_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A301TBT02_UPD_PROG_NM", A301TBT02_UPD_PROG_NM);
         n301TBT02_UPD_PROG_NM = T000P3_n301TBT02_UPD_PROG_NM[0] ;
         A292TBT02_STUDY_ID = T000P3_A292TBT02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
         A293TBT02_SUBJECT_ID = T000P3_A293TBT02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
         O302TBT02_UPD_CNT = A302TBT02_UPD_CNT ;
         n302TBT02_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
         Z292TBT02_STUDY_ID = A292TBT02_STUDY_ID ;
         Z293TBT02_SUBJECT_ID = A293TBT02_SUBJECT_ID ;
         Z294TBT02_CRF_ID = A294TBT02_CRF_ID ;
         sMode24 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0P24( ) ;
         Gx_mode = sMode24 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound24 = (short)(0) ;
         initializeNonKey0P24( ) ;
         sMode24 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode24 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0P24( ) ;
      if ( RcdFound24 == 0 )
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
      RcdFound24 = (short)(0) ;
      /* Using cursor T000P8 */
      pr_default.execute(6, new Object[] {new Long(A292TBT02_STUDY_ID), new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Integer(A293TBT02_SUBJECT_ID), new Long(A292TBT02_STUDY_ID), new Short(A294TBT02_CRF_ID)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000P8_A292TBT02_STUDY_ID[0] < A292TBT02_STUDY_ID ) || ( T000P8_A292TBT02_STUDY_ID[0] == A292TBT02_STUDY_ID ) && ( T000P8_A293TBT02_SUBJECT_ID[0] < A293TBT02_SUBJECT_ID ) || ( T000P8_A293TBT02_SUBJECT_ID[0] == A293TBT02_SUBJECT_ID ) && ( T000P8_A292TBT02_STUDY_ID[0] == A292TBT02_STUDY_ID ) && ( T000P8_A294TBT02_CRF_ID[0] < A294TBT02_CRF_ID ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000P8_A292TBT02_STUDY_ID[0] > A292TBT02_STUDY_ID ) || ( T000P8_A292TBT02_STUDY_ID[0] == A292TBT02_STUDY_ID ) && ( T000P8_A293TBT02_SUBJECT_ID[0] > A293TBT02_SUBJECT_ID ) || ( T000P8_A293TBT02_SUBJECT_ID[0] == A293TBT02_SUBJECT_ID ) && ( T000P8_A292TBT02_STUDY_ID[0] == A292TBT02_STUDY_ID ) && ( T000P8_A294TBT02_CRF_ID[0] > A294TBT02_CRF_ID ) ) )
         {
            A292TBT02_STUDY_ID = T000P8_A292TBT02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
            A293TBT02_SUBJECT_ID = T000P8_A293TBT02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
            A294TBT02_CRF_ID = T000P8_A294TBT02_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
            RcdFound24 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound24 = (short)(0) ;
      /* Using cursor T000P9 */
      pr_default.execute(7, new Object[] {new Long(A292TBT02_STUDY_ID), new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Integer(A293TBT02_SUBJECT_ID), new Long(A292TBT02_STUDY_ID), new Short(A294TBT02_CRF_ID)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000P9_A292TBT02_STUDY_ID[0] > A292TBT02_STUDY_ID ) || ( T000P9_A292TBT02_STUDY_ID[0] == A292TBT02_STUDY_ID ) && ( T000P9_A293TBT02_SUBJECT_ID[0] > A293TBT02_SUBJECT_ID ) || ( T000P9_A293TBT02_SUBJECT_ID[0] == A293TBT02_SUBJECT_ID ) && ( T000P9_A292TBT02_STUDY_ID[0] == A292TBT02_STUDY_ID ) && ( T000P9_A294TBT02_CRF_ID[0] > A294TBT02_CRF_ID ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000P9_A292TBT02_STUDY_ID[0] < A292TBT02_STUDY_ID ) || ( T000P9_A292TBT02_STUDY_ID[0] == A292TBT02_STUDY_ID ) && ( T000P9_A293TBT02_SUBJECT_ID[0] < A293TBT02_SUBJECT_ID ) || ( T000P9_A293TBT02_SUBJECT_ID[0] == A293TBT02_SUBJECT_ID ) && ( T000P9_A292TBT02_STUDY_ID[0] == A292TBT02_STUDY_ID ) && ( T000P9_A294TBT02_CRF_ID[0] < A294TBT02_CRF_ID ) ) )
         {
            A292TBT02_STUDY_ID = T000P9_A292TBT02_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
            A293TBT02_SUBJECT_ID = T000P9_A293TBT02_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
            A294TBT02_CRF_ID = T000P9_A294TBT02_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
            RcdFound24 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0P24( ) ;
      if ( RcdFound24 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBT02_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A292TBT02_STUDY_ID != Z292TBT02_STUDY_ID ) || ( A293TBT02_SUBJECT_ID != Z293TBT02_SUBJECT_ID ) || ( A294TBT02_CRF_ID != Z294TBT02_CRF_ID ) )
         {
            A292TBT02_STUDY_ID = Z292TBT02_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
            A293TBT02_SUBJECT_ID = Z293TBT02_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
            A294TBT02_CRF_ID = Z294TBT02_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
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
            update0P24( ) ;
            GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A292TBT02_STUDY_ID != Z292TBT02_STUDY_ID ) || ( A293TBT02_SUBJECT_ID != Z293TBT02_SUBJECT_ID ) || ( A294TBT02_CRF_ID != Z294TBT02_CRF_ID ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0P24( ) ;
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
               insert0P24( ) ;
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
      if ( ( A292TBT02_STUDY_ID != Z292TBT02_STUDY_ID ) || ( A293TBT02_SUBJECT_ID != Z293TBT02_SUBJECT_ID ) || ( A294TBT02_CRF_ID != Z294TBT02_CRF_ID ) )
      {
         A292TBT02_STUDY_ID = Z292TBT02_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
         A293TBT02_SUBJECT_ID = Z293TBT02_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
         A294TBT02_CRF_ID = Z294TBT02_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound24 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
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
      scanStart0P24( ) ;
      if ( RcdFound24 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT02_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0P24( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound24 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound24 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart0P24( ) ;
      if ( RcdFound24 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound24 != 0 )
         {
            scanNext0P24( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT02_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0P24( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0P24( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000P2 */
         pr_default.execute(0, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT02_CRF"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z296TBT02_CRT_DATETIME.equals( T000P2_A296TBT02_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z297TBT02_CRT_USER_ID, T000P2_A297TBT02_CRT_USER_ID[0]) != 0 ) || !( Z299TBT02_UPD_DATETIME.equals( T000P2_A299TBT02_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z300TBT02_UPD_USER_ID, T000P2_A300TBT02_UPD_USER_ID[0]) != 0 ) || ( Z302TBT02_UPD_CNT != T000P2_A302TBT02_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z370TBT02_CRF_LATEST_VERSION != T000P2_A370TBT02_CRF_LATEST_VERSION[0] ) || ( Z371TBT02_CRF_INPUT_LEVEL != T000P2_A371TBT02_CRF_INPUT_LEVEL[0] ) || ( GXutil.strcmp(Z556TBT02_LOCK_FLG, T000P2_A556TBT02_LOCK_FLG[0]) != 0 ) || !( Z557TBT02_LOCK_DATETIME.equals( T000P2_A557TBT02_LOCK_DATETIME[0] ) ) || ( GXutil.strcmp(Z558TBT02_LOCK_USER_ID, T000P2_A558TBT02_LOCK_USER_ID[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z559TBT02_LOCK_AUTH_CD, T000P2_A559TBT02_LOCK_AUTH_CD[0]) != 0 ) || !( Z560TBT02_UPLOAD_DATETIME.equals( T000P2_A560TBT02_UPLOAD_DATETIME[0] ) ) || ( GXutil.strcmp(Z561TBT02_UPLOAD_USER_ID, T000P2_A561TBT02_UPLOAD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z562TBT02_UPLOAD_AUTH_CD, T000P2_A562TBT02_UPLOAD_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z563TBT02_DM_ARRIVAL_FLG, T000P2_A563TBT02_DM_ARRIVAL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || !( Z564TBT02_DM_ARRIVAL_DATETIME.equals( T000P2_A564TBT02_DM_ARRIVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z565TBT02_APPROVAL_FLG, T000P2_A565TBT02_APPROVAL_FLG[0]) != 0 ) || !( Z566TBT02_APPROVAL_DATETIME.equals( T000P2_A566TBT02_APPROVAL_DATETIME[0] ) ) || ( GXutil.strcmp(Z567TBT02_APPROVAL_USER_ID, T000P2_A567TBT02_APPROVAL_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z568TBT02_APPROVAL_AUTH_CD, T000P2_A568TBT02_APPROVAL_AUTH_CD[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z569TBT02_INPUT_END_FLG, T000P2_A569TBT02_INPUT_END_FLG[0]) != 0 ) || !( Z570TBT02_INPUT_END_DATETIME.equals( T000P2_A570TBT02_INPUT_END_DATETIME[0] ) ) || ( GXutil.strcmp(Z571TBT02_INPUT_END_USER_ID, T000P2_A571TBT02_INPUT_END_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z572TBT02_INPUT_END_AUTH_CD, T000P2_A572TBT02_INPUT_END_AUTH_CD[0]) != 0 ) || ( GXutil.strcmp(Z295TBT02_DEL_FLG, T000P2_A295TBT02_DEL_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z298TBT02_CRT_PROG_NM, T000P2_A298TBT02_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z301TBT02_UPD_PROG_NM, T000P2_A301TBT02_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT02_CRF"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0P24( )
   {
      beforeValidate0P24( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P24( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0P24( 0) ;
         checkOptimisticConcurrency0P24( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P24( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0P24( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P10 */
                  pr_default.execute(8, new Object[] {new Short(A294TBT02_CRF_ID), new Boolean(n296TBT02_CRT_DATETIME), A296TBT02_CRT_DATETIME, new Boolean(n297TBT02_CRT_USER_ID), A297TBT02_CRT_USER_ID, new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n302TBT02_UPD_CNT), new Long(A302TBT02_UPD_CNT), new Boolean(n370TBT02_CRF_LATEST_VERSION), new Short(A370TBT02_CRF_LATEST_VERSION), new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n556TBT02_LOCK_FLG), A556TBT02_LOCK_FLG, new Boolean(n557TBT02_LOCK_DATETIME), A557TBT02_LOCK_DATETIME, new Boolean(n558TBT02_LOCK_USER_ID), A558TBT02_LOCK_USER_ID, new Boolean(n559TBT02_LOCK_AUTH_CD), A559TBT02_LOCK_AUTH_CD, new Boolean(n560TBT02_UPLOAD_DATETIME), A560TBT02_UPLOAD_DATETIME, new Boolean(n561TBT02_UPLOAD_USER_ID), A561TBT02_UPLOAD_USER_ID, new Boolean(n562TBT02_UPLOAD_AUTH_CD), A562TBT02_UPLOAD_AUTH_CD, new Boolean(n563TBT02_DM_ARRIVAL_FLG), A563TBT02_DM_ARRIVAL_FLG, new Boolean(n564TBT02_DM_ARRIVAL_DATETIME), A564TBT02_DM_ARRIVAL_DATETIME, new Boolean(n565TBT02_APPROVAL_FLG), A565TBT02_APPROVAL_FLG, new Boolean(n566TBT02_APPROVAL_DATETIME), A566TBT02_APPROVAL_DATETIME, new Boolean(n567TBT02_APPROVAL_USER_ID), A567TBT02_APPROVAL_USER_ID, new Boolean(n568TBT02_APPROVAL_AUTH_CD), A568TBT02_APPROVAL_AUTH_CD, new Boolean(n569TBT02_INPUT_END_FLG), A569TBT02_INPUT_END_FLG, new Boolean(n570TBT02_INPUT_END_DATETIME), A570TBT02_INPUT_END_DATETIME, new Boolean(n571TBT02_INPUT_END_USER_ID), A571TBT02_INPUT_END_USER_ID, new Boolean(n572TBT02_INPUT_END_AUTH_CD), A572TBT02_INPUT_END_AUTH_CD, new Boolean(n295TBT02_DEL_FLG), A295TBT02_DEL_FLG, new Boolean(n298TBT02_CRT_PROG_NM), A298TBT02_CRT_PROG_NM, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID)});
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
            load0P24( ) ;
         }
         endLevel0P24( ) ;
      }
      closeExtendedTableCursors0P24( ) ;
   }

   public void update0P24( )
   {
      beforeValidate0P24( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0P24( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P24( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0P24( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0P24( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000P11 */
                  pr_default.execute(9, new Object[] {new Boolean(n296TBT02_CRT_DATETIME), A296TBT02_CRT_DATETIME, new Boolean(n297TBT02_CRT_USER_ID), A297TBT02_CRT_USER_ID, new Boolean(n299TBT02_UPD_DATETIME), A299TBT02_UPD_DATETIME, new Boolean(n300TBT02_UPD_USER_ID), A300TBT02_UPD_USER_ID, new Boolean(n302TBT02_UPD_CNT), new Long(A302TBT02_UPD_CNT), new Boolean(n370TBT02_CRF_LATEST_VERSION), new Short(A370TBT02_CRF_LATEST_VERSION), new Boolean(n371TBT02_CRF_INPUT_LEVEL), new Byte(A371TBT02_CRF_INPUT_LEVEL), new Boolean(n556TBT02_LOCK_FLG), A556TBT02_LOCK_FLG, new Boolean(n557TBT02_LOCK_DATETIME), A557TBT02_LOCK_DATETIME, new Boolean(n558TBT02_LOCK_USER_ID), A558TBT02_LOCK_USER_ID, new Boolean(n559TBT02_LOCK_AUTH_CD), A559TBT02_LOCK_AUTH_CD, new Boolean(n560TBT02_UPLOAD_DATETIME), A560TBT02_UPLOAD_DATETIME, new Boolean(n561TBT02_UPLOAD_USER_ID), A561TBT02_UPLOAD_USER_ID, new Boolean(n562TBT02_UPLOAD_AUTH_CD), A562TBT02_UPLOAD_AUTH_CD, new Boolean(n563TBT02_DM_ARRIVAL_FLG), A563TBT02_DM_ARRIVAL_FLG, new Boolean(n564TBT02_DM_ARRIVAL_DATETIME), A564TBT02_DM_ARRIVAL_DATETIME, new Boolean(n565TBT02_APPROVAL_FLG), A565TBT02_APPROVAL_FLG, new Boolean(n566TBT02_APPROVAL_DATETIME), A566TBT02_APPROVAL_DATETIME, new Boolean(n567TBT02_APPROVAL_USER_ID), A567TBT02_APPROVAL_USER_ID, new Boolean(n568TBT02_APPROVAL_AUTH_CD), A568TBT02_APPROVAL_AUTH_CD, new Boolean(n569TBT02_INPUT_END_FLG), A569TBT02_INPUT_END_FLG, new Boolean(n570TBT02_INPUT_END_DATETIME), A570TBT02_INPUT_END_DATETIME, new Boolean(n571TBT02_INPUT_END_USER_ID), A571TBT02_INPUT_END_USER_ID, new Boolean(n572TBT02_INPUT_END_AUTH_CD), A572TBT02_INPUT_END_AUTH_CD, new Boolean(n295TBT02_DEL_FLG), A295TBT02_DEL_FLG, new Boolean(n298TBT02_CRT_PROG_NM), A298TBT02_CRT_PROG_NM, new Boolean(n301TBT02_UPD_PROG_NM), A301TBT02_UPD_PROG_NM, new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT02_CRF"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0P24( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
         endLevel0P24( ) ;
      }
      closeExtendedTableCursors0P24( ) ;
   }

   public void deferredUpdate0P24( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0P24( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0P24( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0P24( ) ;
         afterConfirm0P24( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0P24( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000P12 */
               pr_default.execute(10, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID), new Short(A294TBT02_CRF_ID)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound24 == 0 )
                     {
                        initAll0P24( ) ;
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
      sMode24 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0P24( ) ;
      Gx_mode = sMode24 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0P24( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT02_CRF" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0P24( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0P24( ) ;
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

   public void scanStart0P24( )
   {
      /* Using cursor T000P13 */
      pr_default.execute(11);
      RcdFound24 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound24 = (short)(1) ;
         A292TBT02_STUDY_ID = T000P13_A292TBT02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
         A293TBT02_SUBJECT_ID = T000P13_A293TBT02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
         A294TBT02_CRF_ID = T000P13_A294TBT02_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0P24( )
   {
      pr_default.readNext(11);
      RcdFound24 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound24 = (short)(1) ;
         A292TBT02_STUDY_ID = T000P13_A292TBT02_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
         A293TBT02_SUBJECT_ID = T000P13_A293TBT02_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
         A294TBT02_CRF_ID = T000P13_A294TBT02_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
      }
   }

   public void scanEnd0P24( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0P24( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0P24( )
   {
      /* Before Insert Rules */
      A296TBT02_CRT_DATETIME = GXutil.now( ) ;
      n296TBT02_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A296TBT02_CRT_DATETIME", localUtil.ttoc( A296TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A297TBT02_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt02_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      A297TBT02_CRT_USER_ID = GXt_char3 ;
      n297TBT02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A297TBT02_CRT_USER_ID", A297TBT02_CRT_USER_ID);
      A299TBT02_UPD_DATETIME = GXutil.now( ) ;
      n299TBT02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A299TBT02_UPD_DATETIME", localUtil.ttoc( A299TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A300TBT02_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt02_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      A300TBT02_UPD_USER_ID = GXt_char3 ;
      n300TBT02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A300TBT02_UPD_USER_ID", A300TBT02_UPD_USER_ID);
      A302TBT02_UPD_CNT = (long)(O302TBT02_UPD_CNT+1) ;
      n302TBT02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0P24( )
   {
      /* Before Update Rules */
      A299TBT02_UPD_DATETIME = GXutil.now( ) ;
      n299TBT02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A299TBT02_UPD_DATETIME", localUtil.ttoc( A299TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A300TBT02_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt02_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      A300TBT02_UPD_USER_ID = GXt_char3 ;
      n300TBT02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A300TBT02_UPD_USER_ID", A300TBT02_UPD_USER_ID);
      A302TBT02_UPD_CNT = (long)(O302TBT02_UPD_CNT+1) ;
      n302TBT02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0P24( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0P24( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0P24( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0P24( )
   {
      edtTBT02_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_STUDY_ID_Enabled, 5, 0)));
      edtTBT02_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_SUBJECT_ID_Enabled, 5, 0)));
      edtTBT02_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT02_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT02_CRF_ID_Enabled, 5, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRFテーブル") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbt02_crf") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0P24( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z292TBT02_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z292TBT02_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z293TBT02_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z293TBT02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z294TBT02_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z294TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z296TBT02_CRT_DATETIME", localUtil.ttoc( Z296TBT02_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z297TBT02_CRT_USER_ID", GXutil.rtrim( Z297TBT02_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z299TBT02_UPD_DATETIME", localUtil.ttoc( Z299TBT02_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z300TBT02_UPD_USER_ID", GXutil.rtrim( Z300TBT02_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z302TBT02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z302TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z370TBT02_CRF_LATEST_VERSION", GXutil.ltrim( localUtil.ntoc( Z370TBT02_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z371TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( localUtil.ntoc( Z371TBT02_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z556TBT02_LOCK_FLG", GXutil.rtrim( Z556TBT02_LOCK_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z557TBT02_LOCK_DATETIME", localUtil.ttoc( Z557TBT02_LOCK_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z558TBT02_LOCK_USER_ID", GXutil.rtrim( Z558TBT02_LOCK_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z559TBT02_LOCK_AUTH_CD", GXutil.rtrim( Z559TBT02_LOCK_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z560TBT02_UPLOAD_DATETIME", localUtil.ttoc( Z560TBT02_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z561TBT02_UPLOAD_USER_ID", GXutil.rtrim( Z561TBT02_UPLOAD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z562TBT02_UPLOAD_AUTH_CD", GXutil.rtrim( Z562TBT02_UPLOAD_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z563TBT02_DM_ARRIVAL_FLG", GXutil.rtrim( Z563TBT02_DM_ARRIVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z564TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( Z564TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z565TBT02_APPROVAL_FLG", GXutil.rtrim( Z565TBT02_APPROVAL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z566TBT02_APPROVAL_DATETIME", localUtil.ttoc( Z566TBT02_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z567TBT02_APPROVAL_USER_ID", GXutil.rtrim( Z567TBT02_APPROVAL_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z568TBT02_APPROVAL_AUTH_CD", GXutil.rtrim( Z568TBT02_APPROVAL_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z569TBT02_INPUT_END_FLG", GXutil.rtrim( Z569TBT02_INPUT_END_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z570TBT02_INPUT_END_DATETIME", localUtil.ttoc( Z570TBT02_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z571TBT02_INPUT_END_USER_ID", GXutil.rtrim( Z571TBT02_INPUT_END_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z572TBT02_INPUT_END_AUTH_CD", GXutil.rtrim( Z572TBT02_INPUT_END_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z295TBT02_DEL_FLG", GXutil.rtrim( Z295TBT02_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z298TBT02_CRT_PROG_NM", GXutil.rtrim( Z298TBT02_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z301TBT02_UPD_PROG_NM", GXutil.rtrim( Z301TBT02_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O302TBT02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O302TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0P24( )
   {
      A296TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n296TBT02_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A296TBT02_CRT_DATETIME", localUtil.ttoc( A296TBT02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n296TBT02_CRT_DATETIME = (GXutil.nullDate().equals(A296TBT02_CRT_DATETIME) ? true : false) ;
      A297TBT02_CRT_USER_ID = "" ;
      n297TBT02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A297TBT02_CRT_USER_ID", A297TBT02_CRT_USER_ID);
      n297TBT02_CRT_USER_ID = ((GXutil.strcmp("", A297TBT02_CRT_USER_ID)==0) ? true : false) ;
      A299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n299TBT02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A299TBT02_UPD_DATETIME", localUtil.ttoc( A299TBT02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n299TBT02_UPD_DATETIME = (GXutil.nullDate().equals(A299TBT02_UPD_DATETIME) ? true : false) ;
      A300TBT02_UPD_USER_ID = "" ;
      n300TBT02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A300TBT02_UPD_USER_ID", A300TBT02_UPD_USER_ID);
      n300TBT02_UPD_USER_ID = ((GXutil.strcmp("", A300TBT02_UPD_USER_ID)==0) ? true : false) ;
      A302TBT02_UPD_CNT = 0 ;
      n302TBT02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
      n302TBT02_UPD_CNT = ((0==A302TBT02_UPD_CNT) ? true : false) ;
      A370TBT02_CRF_LATEST_VERSION = (short)(0) ;
      n370TBT02_CRF_LATEST_VERSION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A370TBT02_CRF_LATEST_VERSION", GXutil.ltrim( GXutil.str( A370TBT02_CRF_LATEST_VERSION, 4, 0)));
      n370TBT02_CRF_LATEST_VERSION = ((0==A370TBT02_CRF_LATEST_VERSION) ? true : false) ;
      A371TBT02_CRF_INPUT_LEVEL = (byte)(0) ;
      n371TBT02_CRF_INPUT_LEVEL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A371TBT02_CRF_INPUT_LEVEL", GXutil.ltrim( GXutil.str( A371TBT02_CRF_INPUT_LEVEL, 2, 0)));
      n371TBT02_CRF_INPUT_LEVEL = ((0==A371TBT02_CRF_INPUT_LEVEL) ? true : false) ;
      A556TBT02_LOCK_FLG = "" ;
      n556TBT02_LOCK_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A556TBT02_LOCK_FLG", A556TBT02_LOCK_FLG);
      n556TBT02_LOCK_FLG = ((GXutil.strcmp("", A556TBT02_LOCK_FLG)==0) ? true : false) ;
      A557TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n557TBT02_LOCK_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A557TBT02_LOCK_DATETIME", localUtil.ttoc( A557TBT02_LOCK_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n557TBT02_LOCK_DATETIME = (GXutil.nullDate().equals(A557TBT02_LOCK_DATETIME) ? true : false) ;
      A558TBT02_LOCK_USER_ID = "" ;
      n558TBT02_LOCK_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A558TBT02_LOCK_USER_ID", A558TBT02_LOCK_USER_ID);
      n558TBT02_LOCK_USER_ID = ((GXutil.strcmp("", A558TBT02_LOCK_USER_ID)==0) ? true : false) ;
      A559TBT02_LOCK_AUTH_CD = "" ;
      n559TBT02_LOCK_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A559TBT02_LOCK_AUTH_CD", A559TBT02_LOCK_AUTH_CD);
      n559TBT02_LOCK_AUTH_CD = ((GXutil.strcmp("", A559TBT02_LOCK_AUTH_CD)==0) ? true : false) ;
      A560TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n560TBT02_UPLOAD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A560TBT02_UPLOAD_DATETIME", localUtil.ttoc( A560TBT02_UPLOAD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n560TBT02_UPLOAD_DATETIME = (GXutil.nullDate().equals(A560TBT02_UPLOAD_DATETIME) ? true : false) ;
      A561TBT02_UPLOAD_USER_ID = "" ;
      n561TBT02_UPLOAD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A561TBT02_UPLOAD_USER_ID", A561TBT02_UPLOAD_USER_ID);
      n561TBT02_UPLOAD_USER_ID = ((GXutil.strcmp("", A561TBT02_UPLOAD_USER_ID)==0) ? true : false) ;
      A562TBT02_UPLOAD_AUTH_CD = "" ;
      n562TBT02_UPLOAD_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A562TBT02_UPLOAD_AUTH_CD", A562TBT02_UPLOAD_AUTH_CD);
      n562TBT02_UPLOAD_AUTH_CD = ((GXutil.strcmp("", A562TBT02_UPLOAD_AUTH_CD)==0) ? true : false) ;
      A563TBT02_DM_ARRIVAL_FLG = "" ;
      n563TBT02_DM_ARRIVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A563TBT02_DM_ARRIVAL_FLG", A563TBT02_DM_ARRIVAL_FLG);
      n563TBT02_DM_ARRIVAL_FLG = ((GXutil.strcmp("", A563TBT02_DM_ARRIVAL_FLG)==0) ? true : false) ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n564TBT02_DM_ARRIVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A564TBT02_DM_ARRIVAL_DATETIME", localUtil.ttoc( A564TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n564TBT02_DM_ARRIVAL_DATETIME = (GXutil.nullDate().equals(A564TBT02_DM_ARRIVAL_DATETIME) ? true : false) ;
      A565TBT02_APPROVAL_FLG = "" ;
      n565TBT02_APPROVAL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A565TBT02_APPROVAL_FLG", A565TBT02_APPROVAL_FLG);
      n565TBT02_APPROVAL_FLG = ((GXutil.strcmp("", A565TBT02_APPROVAL_FLG)==0) ? true : false) ;
      A566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n566TBT02_APPROVAL_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A566TBT02_APPROVAL_DATETIME", localUtil.ttoc( A566TBT02_APPROVAL_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n566TBT02_APPROVAL_DATETIME = (GXutil.nullDate().equals(A566TBT02_APPROVAL_DATETIME) ? true : false) ;
      A567TBT02_APPROVAL_USER_ID = "" ;
      n567TBT02_APPROVAL_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A567TBT02_APPROVAL_USER_ID", A567TBT02_APPROVAL_USER_ID);
      n567TBT02_APPROVAL_USER_ID = ((GXutil.strcmp("", A567TBT02_APPROVAL_USER_ID)==0) ? true : false) ;
      A568TBT02_APPROVAL_AUTH_CD = "" ;
      n568TBT02_APPROVAL_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A568TBT02_APPROVAL_AUTH_CD", A568TBT02_APPROVAL_AUTH_CD);
      n568TBT02_APPROVAL_AUTH_CD = ((GXutil.strcmp("", A568TBT02_APPROVAL_AUTH_CD)==0) ? true : false) ;
      A569TBT02_INPUT_END_FLG = "" ;
      n569TBT02_INPUT_END_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A569TBT02_INPUT_END_FLG", A569TBT02_INPUT_END_FLG);
      n569TBT02_INPUT_END_FLG = ((GXutil.strcmp("", A569TBT02_INPUT_END_FLG)==0) ? true : false) ;
      A570TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n570TBT02_INPUT_END_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A570TBT02_INPUT_END_DATETIME", localUtil.ttoc( A570TBT02_INPUT_END_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n570TBT02_INPUT_END_DATETIME = (GXutil.nullDate().equals(A570TBT02_INPUT_END_DATETIME) ? true : false) ;
      A571TBT02_INPUT_END_USER_ID = "" ;
      n571TBT02_INPUT_END_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A571TBT02_INPUT_END_USER_ID", A571TBT02_INPUT_END_USER_ID);
      n571TBT02_INPUT_END_USER_ID = ((GXutil.strcmp("", A571TBT02_INPUT_END_USER_ID)==0) ? true : false) ;
      A572TBT02_INPUT_END_AUTH_CD = "" ;
      n572TBT02_INPUT_END_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A572TBT02_INPUT_END_AUTH_CD", A572TBT02_INPUT_END_AUTH_CD);
      n572TBT02_INPUT_END_AUTH_CD = ((GXutil.strcmp("", A572TBT02_INPUT_END_AUTH_CD)==0) ? true : false) ;
      A295TBT02_DEL_FLG = "" ;
      n295TBT02_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A295TBT02_DEL_FLG", A295TBT02_DEL_FLG);
      n295TBT02_DEL_FLG = ((GXutil.strcmp("", A295TBT02_DEL_FLG)==0) ? true : false) ;
      A298TBT02_CRT_PROG_NM = "" ;
      n298TBT02_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A298TBT02_CRT_PROG_NM", A298TBT02_CRT_PROG_NM);
      n298TBT02_CRT_PROG_NM = ((GXutil.strcmp("", A298TBT02_CRT_PROG_NM)==0) ? true : false) ;
      A301TBT02_UPD_PROG_NM = "" ;
      n301TBT02_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A301TBT02_UPD_PROG_NM", A301TBT02_UPD_PROG_NM);
      n301TBT02_UPD_PROG_NM = ((GXutil.strcmp("", A301TBT02_UPD_PROG_NM)==0) ? true : false) ;
      O302TBT02_UPD_CNT = A302TBT02_UPD_CNT ;
      n302TBT02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A302TBT02_UPD_CNT", GXutil.ltrim( GXutil.str( A302TBT02_UPD_CNT, 10, 0)));
   }

   public void initAll0P24( )
   {
      A292TBT02_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A292TBT02_STUDY_ID", GXutil.ltrim( GXutil.str( A292TBT02_STUDY_ID, 10, 0)));
      A293TBT02_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A293TBT02_SUBJECT_ID", GXutil.ltrim( GXutil.str( A293TBT02_SUBJECT_ID, 6, 0)));
      A294TBT02_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A294TBT02_CRF_ID", GXutil.ltrim( GXutil.str( A294TBT02_CRF_ID, 4, 0)));
      initializeNonKey0P24( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14552115");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbt02_crf.js", "?14552115");
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
      lblTextblocktbt02_study_id_Internalname = "TEXTBLOCKTBT02_STUDY_ID" ;
      edtTBT02_STUDY_ID_Internalname = "TBT02_STUDY_ID" ;
      lblTextblocktbt02_subject_id_Internalname = "TEXTBLOCKTBT02_SUBJECT_ID" ;
      edtTBT02_SUBJECT_ID_Internalname = "TBT02_SUBJECT_ID" ;
      lblTextblocktbt02_crf_id_Internalname = "TEXTBLOCKTBT02_CRF_ID" ;
      edtTBT02_CRF_ID_Internalname = "TBT02_CRF_ID" ;
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

   public void gx9asatbt02_crt_user_id0P24( String Gx_mode )
   {
      GXt_char3 = A297TBT02_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt02_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      A297TBT02_CRT_USER_ID = GXt_char3 ;
      n297TBT02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A297TBT02_CRT_USER_ID", A297TBT02_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A297TBT02_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx11asatbt02_upd_user_id0P24( String Gx_mode )
   {
      GXt_char3 = A300TBT02_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt02_crf_impl.this.GXt_char3 = GXv_char4[0] ;
      A300TBT02_UPD_USER_ID = GXt_char3 ;
      n300TBT02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A300TBT02_UPD_USER_ID", A300TBT02_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A300TBT02_UPD_USER_ID))+"\"");
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
      /* Using cursor T000P14 */
      pr_default.execute(12, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         AnyError292 = 1 ;
         AnyError293 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFテーブル・患者サブタイプ'", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError292 == 0 ) && ( AnyError293 == 0 ) )
      {
      }
      pr_default.close(12);
      GX_FocusControl = edtTBT02_CRF_LATEST_VERSION_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbt02_subject_id( long GX_Parm1 ,
                                       int GX_Parm2 )
   {
      A292TBT02_STUDY_ID = GX_Parm1 ;
      A293TBT02_SUBJECT_ID = GX_Parm2 ;
      /* Using cursor T000P14 */
      pr_default.execute(12, new Object[] {new Long(A292TBT02_STUDY_ID), new Integer(A293TBT02_SUBJECT_ID)});
      if ( (pr_default.getStatus(12) == 101) )
      {
         AnyError292 = 1 ;
         AnyError293 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'CRFテーブル・患者サブタイプ'", "ForeignKeyNotFound", 1, "TBT02_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT02_STUDY_ID_Internalname ;
      }
      if ( ( AnyError292 == 0 ) && ( AnyError293 == 0 ) )
      {
      }
      pr_default.close(12);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbt02_crf_id( long GX_Parm1 ,
                                   int GX_Parm2 ,
                                   short GX_Parm3 ,
                                   java.util.Date GX_Parm4 ,
                                   String GX_Parm5 ,
                                   java.util.Date GX_Parm6 ,
                                   String GX_Parm7 ,
                                   long GX_Parm8 ,
                                   short GX_Parm9 ,
                                   byte GX_Parm10 ,
                                   String GX_Parm11 ,
                                   java.util.Date GX_Parm12 ,
                                   String GX_Parm13 ,
                                   String GX_Parm14 ,
                                   java.util.Date GX_Parm15 ,
                                   String GX_Parm16 ,
                                   String GX_Parm17 ,
                                   String GX_Parm18 ,
                                   java.util.Date GX_Parm19 ,
                                   String GX_Parm20 ,
                                   java.util.Date GX_Parm21 ,
                                   String GX_Parm22 ,
                                   String GX_Parm23 ,
                                   String GX_Parm24 ,
                                   java.util.Date GX_Parm25 ,
                                   String GX_Parm26 ,
                                   String GX_Parm27 ,
                                   String GX_Parm28 ,
                                   String GX_Parm29 ,
                                   String GX_Parm30 )
   {
      A292TBT02_STUDY_ID = GX_Parm1 ;
      A293TBT02_SUBJECT_ID = GX_Parm2 ;
      A294TBT02_CRF_ID = GX_Parm3 ;
      A296TBT02_CRT_DATETIME = GX_Parm4 ;
      n296TBT02_CRT_DATETIME = false ;
      A297TBT02_CRT_USER_ID = GX_Parm5 ;
      n297TBT02_CRT_USER_ID = false ;
      A299TBT02_UPD_DATETIME = GX_Parm6 ;
      n299TBT02_UPD_DATETIME = false ;
      A300TBT02_UPD_USER_ID = GX_Parm7 ;
      n300TBT02_UPD_USER_ID = false ;
      A302TBT02_UPD_CNT = GX_Parm8 ;
      n302TBT02_UPD_CNT = false ;
      A370TBT02_CRF_LATEST_VERSION = GX_Parm9 ;
      n370TBT02_CRF_LATEST_VERSION = false ;
      A371TBT02_CRF_INPUT_LEVEL = GX_Parm10 ;
      n371TBT02_CRF_INPUT_LEVEL = false ;
      A556TBT02_LOCK_FLG = GX_Parm11 ;
      n556TBT02_LOCK_FLG = false ;
      A557TBT02_LOCK_DATETIME = GX_Parm12 ;
      n557TBT02_LOCK_DATETIME = false ;
      A558TBT02_LOCK_USER_ID = GX_Parm13 ;
      n558TBT02_LOCK_USER_ID = false ;
      A559TBT02_LOCK_AUTH_CD = GX_Parm14 ;
      n559TBT02_LOCK_AUTH_CD = false ;
      A560TBT02_UPLOAD_DATETIME = GX_Parm15 ;
      n560TBT02_UPLOAD_DATETIME = false ;
      A561TBT02_UPLOAD_USER_ID = GX_Parm16 ;
      n561TBT02_UPLOAD_USER_ID = false ;
      A562TBT02_UPLOAD_AUTH_CD = GX_Parm17 ;
      n562TBT02_UPLOAD_AUTH_CD = false ;
      A563TBT02_DM_ARRIVAL_FLG = GX_Parm18 ;
      n563TBT02_DM_ARRIVAL_FLG = false ;
      A564TBT02_DM_ARRIVAL_DATETIME = GX_Parm19 ;
      n564TBT02_DM_ARRIVAL_DATETIME = false ;
      A565TBT02_APPROVAL_FLG = GX_Parm20 ;
      n565TBT02_APPROVAL_FLG = false ;
      A566TBT02_APPROVAL_DATETIME = GX_Parm21 ;
      n566TBT02_APPROVAL_DATETIME = false ;
      A567TBT02_APPROVAL_USER_ID = GX_Parm22 ;
      n567TBT02_APPROVAL_USER_ID = false ;
      A568TBT02_APPROVAL_AUTH_CD = GX_Parm23 ;
      n568TBT02_APPROVAL_AUTH_CD = false ;
      A569TBT02_INPUT_END_FLG = GX_Parm24 ;
      n569TBT02_INPUT_END_FLG = false ;
      A570TBT02_INPUT_END_DATETIME = GX_Parm25 ;
      n570TBT02_INPUT_END_DATETIME = false ;
      A571TBT02_INPUT_END_USER_ID = GX_Parm26 ;
      n571TBT02_INPUT_END_USER_ID = false ;
      A572TBT02_INPUT_END_AUTH_CD = GX_Parm27 ;
      n572TBT02_INPUT_END_AUTH_CD = false ;
      A295TBT02_DEL_FLG = GX_Parm28 ;
      n295TBT02_DEL_FLG = false ;
      A298TBT02_CRT_PROG_NM = GX_Parm29 ;
      n298TBT02_CRT_PROG_NM = false ;
      A301TBT02_UPD_PROG_NM = GX_Parm30 ;
      n301TBT02_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A296TBT02_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A297TBT02_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A299TBT02_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A300TBT02_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A302TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A370TBT02_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A371TBT02_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A556TBT02_LOCK_FLG));
      isValidOutput.add(localUtil.format(A557TBT02_LOCK_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A558TBT02_LOCK_USER_ID));
      isValidOutput.add(GXutil.rtrim( A559TBT02_LOCK_AUTH_CD));
      isValidOutput.add(localUtil.format(A560TBT02_UPLOAD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A561TBT02_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A562TBT02_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A563TBT02_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.format(A564TBT02_DM_ARRIVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A565TBT02_APPROVAL_FLG));
      isValidOutput.add(localUtil.format(A566TBT02_APPROVAL_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A567TBT02_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( A568TBT02_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A569TBT02_INPUT_END_FLG));
      isValidOutput.add(localUtil.format(A570TBT02_INPUT_END_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A571TBT02_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( A572TBT02_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A295TBT02_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A298TBT02_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A301TBT02_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z292TBT02_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z293TBT02_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z294TBT02_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z296TBT02_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z297TBT02_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z299TBT02_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z300TBT02_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z302TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z370TBT02_CRF_LATEST_VERSION, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z371TBT02_CRF_INPUT_LEVEL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z556TBT02_LOCK_FLG));
      isValidOutput.add(localUtil.ttoc( Z557TBT02_LOCK_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z558TBT02_LOCK_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z559TBT02_LOCK_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z560TBT02_UPLOAD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z561TBT02_UPLOAD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z562TBT02_UPLOAD_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z563TBT02_DM_ARRIVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z564TBT02_DM_ARRIVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z565TBT02_APPROVAL_FLG));
      isValidOutput.add(localUtil.ttoc( Z566TBT02_APPROVAL_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z567TBT02_APPROVAL_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z568TBT02_APPROVAL_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z569TBT02_INPUT_END_FLG));
      isValidOutput.add(localUtil.ttoc( Z570TBT02_INPUT_END_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z571TBT02_INPUT_END_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z572TBT02_INPUT_END_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z295TBT02_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z298TBT02_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z301TBT02_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O302TBT02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1183 */
                  S1183 ();
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
      lblTextblocktbt02_study_id_Jsonclick = "" ;
      lblTextblocktbt02_subject_id_Jsonclick = "" ;
      lblTextblocktbt02_crf_id_Jsonclick = "" ;
      lblTextblocktbt02_crf_latest_version_Jsonclick = "" ;
      lblTextblocktbt02_crf_input_level_Jsonclick = "" ;
      lblTextblocktbt02_lock_flg_Jsonclick = "" ;
      A556TBT02_LOCK_FLG = "" ;
      lblTextblocktbt02_lock_datetime_Jsonclick = "" ;
      A557TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_lock_user_id_Jsonclick = "" ;
      A558TBT02_LOCK_USER_ID = "" ;
      lblTextblocktbt02_lock_auth_cd_Jsonclick = "" ;
      A559TBT02_LOCK_AUTH_CD = "" ;
      lblTextblocktbt02_upload_datetime_Jsonclick = "" ;
      A560TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_upload_user_id_Jsonclick = "" ;
      A561TBT02_UPLOAD_USER_ID = "" ;
      lblTextblocktbt02_upload_auth_cd_Jsonclick = "" ;
      A562TBT02_UPLOAD_AUTH_CD = "" ;
      lblTextblocktbt02_dm_arrival_flg_Jsonclick = "" ;
      A563TBT02_DM_ARRIVAL_FLG = "" ;
      lblTextblocktbt02_dm_arrival_datetime_Jsonclick = "" ;
      A564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_approval_flg_Jsonclick = "" ;
      A565TBT02_APPROVAL_FLG = "" ;
      lblTextblocktbt02_approval_datetime_Jsonclick = "" ;
      A566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_approval_user_id_Jsonclick = "" ;
      A567TBT02_APPROVAL_USER_ID = "" ;
      lblTextblocktbt02_approval_auth_cd_Jsonclick = "" ;
      A568TBT02_APPROVAL_AUTH_CD = "" ;
      lblTextblocktbt02_input_end_flg_Jsonclick = "" ;
      A569TBT02_INPUT_END_FLG = "" ;
      lblTextblocktbt02_input_end_datetime_Jsonclick = "" ;
      A570TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_input_end_user_id_Jsonclick = "" ;
      A571TBT02_INPUT_END_USER_ID = "" ;
      lblTextblocktbt02_input_end_auth_cd_Jsonclick = "" ;
      A572TBT02_INPUT_END_AUTH_CD = "" ;
      lblTextblocktbt02_del_flg_Jsonclick = "" ;
      A295TBT02_DEL_FLG = "" ;
      lblTextblocktbt02_crt_datetime_Jsonclick = "" ;
      A296TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_crt_user_id_Jsonclick = "" ;
      A297TBT02_CRT_USER_ID = "" ;
      lblTextblocktbt02_crt_prog_nm_Jsonclick = "" ;
      A298TBT02_CRT_PROG_NM = "" ;
      lblTextblocktbt02_upd_datetime_Jsonclick = "" ;
      A299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt02_upd_user_id_Jsonclick = "" ;
      A300TBT02_UPD_USER_ID = "" ;
      lblTextblocktbt02_upd_prog_nm_Jsonclick = "" ;
      A301TBT02_UPD_PROG_NM = "" ;
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
      Z296TBT02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z297TBT02_CRT_USER_ID = "" ;
      Z299TBT02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z300TBT02_UPD_USER_ID = "" ;
      Z556TBT02_LOCK_FLG = "" ;
      Z557TBT02_LOCK_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z558TBT02_LOCK_USER_ID = "" ;
      Z559TBT02_LOCK_AUTH_CD = "" ;
      Z560TBT02_UPLOAD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z561TBT02_UPLOAD_USER_ID = "" ;
      Z562TBT02_UPLOAD_AUTH_CD = "" ;
      Z563TBT02_DM_ARRIVAL_FLG = "" ;
      Z564TBT02_DM_ARRIVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z565TBT02_APPROVAL_FLG = "" ;
      Z566TBT02_APPROVAL_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z567TBT02_APPROVAL_USER_ID = "" ;
      Z568TBT02_APPROVAL_AUTH_CD = "" ;
      Z569TBT02_INPUT_END_FLG = "" ;
      Z570TBT02_INPUT_END_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z571TBT02_INPUT_END_USER_ID = "" ;
      Z572TBT02_INPUT_END_AUTH_CD = "" ;
      Z295TBT02_DEL_FLG = "" ;
      Z298TBT02_CRT_PROG_NM = "" ;
      Z301TBT02_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T000P5_A294TBT02_CRF_ID = new short[1] ;
      T000P5_A296TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n296TBT02_CRT_DATETIME = new boolean[] {false} ;
      T000P5_A297TBT02_CRT_USER_ID = new String[] {""} ;
      T000P5_n297TBT02_CRT_USER_ID = new boolean[] {false} ;
      T000P5_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      T000P5_A300TBT02_UPD_USER_ID = new String[] {""} ;
      T000P5_n300TBT02_UPD_USER_ID = new boolean[] {false} ;
      T000P5_A302TBT02_UPD_CNT = new long[1] ;
      T000P5_n302TBT02_UPD_CNT = new boolean[] {false} ;
      T000P5_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      T000P5_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      T000P5_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      T000P5_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000P5_A556TBT02_LOCK_FLG = new String[] {""} ;
      T000P5_n556TBT02_LOCK_FLG = new boolean[] {false} ;
      T000P5_A557TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n557TBT02_LOCK_DATETIME = new boolean[] {false} ;
      T000P5_A558TBT02_LOCK_USER_ID = new String[] {""} ;
      T000P5_n558TBT02_LOCK_USER_ID = new boolean[] {false} ;
      T000P5_A559TBT02_LOCK_AUTH_CD = new String[] {""} ;
      T000P5_n559TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      T000P5_A560TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n560TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      T000P5_A561TBT02_UPLOAD_USER_ID = new String[] {""} ;
      T000P5_n561TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      T000P5_A562TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      T000P5_n562TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000P5_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      T000P5_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000P5_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000P5_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      T000P5_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      T000P5_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      T000P5_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      T000P5_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      T000P5_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      T000P5_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000P5_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      T000P5_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      T000P5_A570TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P5_n570TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      T000P5_A571TBT02_INPUT_END_USER_ID = new String[] {""} ;
      T000P5_n571TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      T000P5_A572TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      T000P5_n572TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000P5_A295TBT02_DEL_FLG = new String[] {""} ;
      T000P5_n295TBT02_DEL_FLG = new boolean[] {false} ;
      T000P5_A298TBT02_CRT_PROG_NM = new String[] {""} ;
      T000P5_n298TBT02_CRT_PROG_NM = new boolean[] {false} ;
      T000P5_A301TBT02_UPD_PROG_NM = new String[] {""} ;
      T000P5_n301TBT02_UPD_PROG_NM = new boolean[] {false} ;
      T000P5_A292TBT02_STUDY_ID = new long[1] ;
      T000P5_A293TBT02_SUBJECT_ID = new int[1] ;
      T000P4_A292TBT02_STUDY_ID = new long[1] ;
      T000P6_A292TBT02_STUDY_ID = new long[1] ;
      T000P7_A292TBT02_STUDY_ID = new long[1] ;
      T000P7_A293TBT02_SUBJECT_ID = new int[1] ;
      T000P7_A294TBT02_CRF_ID = new short[1] ;
      T000P3_A294TBT02_CRF_ID = new short[1] ;
      T000P3_A296TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n296TBT02_CRT_DATETIME = new boolean[] {false} ;
      T000P3_A297TBT02_CRT_USER_ID = new String[] {""} ;
      T000P3_n297TBT02_CRT_USER_ID = new boolean[] {false} ;
      T000P3_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      T000P3_A300TBT02_UPD_USER_ID = new String[] {""} ;
      T000P3_n300TBT02_UPD_USER_ID = new boolean[] {false} ;
      T000P3_A302TBT02_UPD_CNT = new long[1] ;
      T000P3_n302TBT02_UPD_CNT = new boolean[] {false} ;
      T000P3_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      T000P3_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      T000P3_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      T000P3_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000P3_A556TBT02_LOCK_FLG = new String[] {""} ;
      T000P3_n556TBT02_LOCK_FLG = new boolean[] {false} ;
      T000P3_A557TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n557TBT02_LOCK_DATETIME = new boolean[] {false} ;
      T000P3_A558TBT02_LOCK_USER_ID = new String[] {""} ;
      T000P3_n558TBT02_LOCK_USER_ID = new boolean[] {false} ;
      T000P3_A559TBT02_LOCK_AUTH_CD = new String[] {""} ;
      T000P3_n559TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      T000P3_A560TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n560TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      T000P3_A561TBT02_UPLOAD_USER_ID = new String[] {""} ;
      T000P3_n561TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      T000P3_A562TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      T000P3_n562TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000P3_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      T000P3_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000P3_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000P3_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      T000P3_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      T000P3_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      T000P3_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      T000P3_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      T000P3_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      T000P3_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000P3_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      T000P3_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      T000P3_A570TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P3_n570TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      T000P3_A571TBT02_INPUT_END_USER_ID = new String[] {""} ;
      T000P3_n571TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      T000P3_A572TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      T000P3_n572TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000P3_A295TBT02_DEL_FLG = new String[] {""} ;
      T000P3_n295TBT02_DEL_FLG = new boolean[] {false} ;
      T000P3_A298TBT02_CRT_PROG_NM = new String[] {""} ;
      T000P3_n298TBT02_CRT_PROG_NM = new boolean[] {false} ;
      T000P3_A301TBT02_UPD_PROG_NM = new String[] {""} ;
      T000P3_n301TBT02_UPD_PROG_NM = new boolean[] {false} ;
      T000P3_A292TBT02_STUDY_ID = new long[1] ;
      T000P3_A293TBT02_SUBJECT_ID = new int[1] ;
      sMode24 = "" ;
      T000P8_A292TBT02_STUDY_ID = new long[1] ;
      T000P8_A293TBT02_SUBJECT_ID = new int[1] ;
      T000P8_A294TBT02_CRF_ID = new short[1] ;
      T000P9_A292TBT02_STUDY_ID = new long[1] ;
      T000P9_A293TBT02_SUBJECT_ID = new int[1] ;
      T000P9_A294TBT02_CRF_ID = new short[1] ;
      T000P2_A294TBT02_CRF_ID = new short[1] ;
      T000P2_A296TBT02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n296TBT02_CRT_DATETIME = new boolean[] {false} ;
      T000P2_A297TBT02_CRT_USER_ID = new String[] {""} ;
      T000P2_n297TBT02_CRT_USER_ID = new boolean[] {false} ;
      T000P2_A299TBT02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n299TBT02_UPD_DATETIME = new boolean[] {false} ;
      T000P2_A300TBT02_UPD_USER_ID = new String[] {""} ;
      T000P2_n300TBT02_UPD_USER_ID = new boolean[] {false} ;
      T000P2_A302TBT02_UPD_CNT = new long[1] ;
      T000P2_n302TBT02_UPD_CNT = new boolean[] {false} ;
      T000P2_A370TBT02_CRF_LATEST_VERSION = new short[1] ;
      T000P2_n370TBT02_CRF_LATEST_VERSION = new boolean[] {false} ;
      T000P2_A371TBT02_CRF_INPUT_LEVEL = new byte[1] ;
      T000P2_n371TBT02_CRF_INPUT_LEVEL = new boolean[] {false} ;
      T000P2_A556TBT02_LOCK_FLG = new String[] {""} ;
      T000P2_n556TBT02_LOCK_FLG = new boolean[] {false} ;
      T000P2_A557TBT02_LOCK_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n557TBT02_LOCK_DATETIME = new boolean[] {false} ;
      T000P2_A558TBT02_LOCK_USER_ID = new String[] {""} ;
      T000P2_n558TBT02_LOCK_USER_ID = new boolean[] {false} ;
      T000P2_A559TBT02_LOCK_AUTH_CD = new String[] {""} ;
      T000P2_n559TBT02_LOCK_AUTH_CD = new boolean[] {false} ;
      T000P2_A560TBT02_UPLOAD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n560TBT02_UPLOAD_DATETIME = new boolean[] {false} ;
      T000P2_A561TBT02_UPLOAD_USER_ID = new String[] {""} ;
      T000P2_n561TBT02_UPLOAD_USER_ID = new boolean[] {false} ;
      T000P2_A562TBT02_UPLOAD_AUTH_CD = new String[] {""} ;
      T000P2_n562TBT02_UPLOAD_AUTH_CD = new boolean[] {false} ;
      T000P2_A563TBT02_DM_ARRIVAL_FLG = new String[] {""} ;
      T000P2_n563TBT02_DM_ARRIVAL_FLG = new boolean[] {false} ;
      T000P2_A564TBT02_DM_ARRIVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n564TBT02_DM_ARRIVAL_DATETIME = new boolean[] {false} ;
      T000P2_A565TBT02_APPROVAL_FLG = new String[] {""} ;
      T000P2_n565TBT02_APPROVAL_FLG = new boolean[] {false} ;
      T000P2_A566TBT02_APPROVAL_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n566TBT02_APPROVAL_DATETIME = new boolean[] {false} ;
      T000P2_A567TBT02_APPROVAL_USER_ID = new String[] {""} ;
      T000P2_n567TBT02_APPROVAL_USER_ID = new boolean[] {false} ;
      T000P2_A568TBT02_APPROVAL_AUTH_CD = new String[] {""} ;
      T000P2_n568TBT02_APPROVAL_AUTH_CD = new boolean[] {false} ;
      T000P2_A569TBT02_INPUT_END_FLG = new String[] {""} ;
      T000P2_n569TBT02_INPUT_END_FLG = new boolean[] {false} ;
      T000P2_A570TBT02_INPUT_END_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000P2_n570TBT02_INPUT_END_DATETIME = new boolean[] {false} ;
      T000P2_A571TBT02_INPUT_END_USER_ID = new String[] {""} ;
      T000P2_n571TBT02_INPUT_END_USER_ID = new boolean[] {false} ;
      T000P2_A572TBT02_INPUT_END_AUTH_CD = new String[] {""} ;
      T000P2_n572TBT02_INPUT_END_AUTH_CD = new boolean[] {false} ;
      T000P2_A295TBT02_DEL_FLG = new String[] {""} ;
      T000P2_n295TBT02_DEL_FLG = new boolean[] {false} ;
      T000P2_A298TBT02_CRT_PROG_NM = new String[] {""} ;
      T000P2_n298TBT02_CRT_PROG_NM = new boolean[] {false} ;
      T000P2_A301TBT02_UPD_PROG_NM = new String[] {""} ;
      T000P2_n301TBT02_UPD_PROG_NM = new boolean[] {false} ;
      T000P2_A292TBT02_STUDY_ID = new long[1] ;
      T000P2_A293TBT02_SUBJECT_ID = new int[1] ;
      T000P13_A292TBT02_STUDY_ID = new long[1] ;
      T000P13_A293TBT02_SUBJECT_ID = new int[1] ;
      T000P13_A294TBT02_CRF_ID = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      T000P14_A292TBT02_STUDY_ID = new long[1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt02_crf__default(),
         new Object[] {
             new Object[] {
            T000P2_A294TBT02_CRF_ID, T000P2_A296TBT02_CRT_DATETIME, T000P2_n296TBT02_CRT_DATETIME, T000P2_A297TBT02_CRT_USER_ID, T000P2_n297TBT02_CRT_USER_ID, T000P2_A299TBT02_UPD_DATETIME, T000P2_n299TBT02_UPD_DATETIME, T000P2_A300TBT02_UPD_USER_ID, T000P2_n300TBT02_UPD_USER_ID, T000P2_A302TBT02_UPD_CNT,
            T000P2_n302TBT02_UPD_CNT, T000P2_A370TBT02_CRF_LATEST_VERSION, T000P2_n370TBT02_CRF_LATEST_VERSION, T000P2_A371TBT02_CRF_INPUT_LEVEL, T000P2_n371TBT02_CRF_INPUT_LEVEL, T000P2_A556TBT02_LOCK_FLG, T000P2_n556TBT02_LOCK_FLG, T000P2_A557TBT02_LOCK_DATETIME, T000P2_n557TBT02_LOCK_DATETIME, T000P2_A558TBT02_LOCK_USER_ID,
            T000P2_n558TBT02_LOCK_USER_ID, T000P2_A559TBT02_LOCK_AUTH_CD, T000P2_n559TBT02_LOCK_AUTH_CD, T000P2_A560TBT02_UPLOAD_DATETIME, T000P2_n560TBT02_UPLOAD_DATETIME, T000P2_A561TBT02_UPLOAD_USER_ID, T000P2_n561TBT02_UPLOAD_USER_ID, T000P2_A562TBT02_UPLOAD_AUTH_CD, T000P2_n562TBT02_UPLOAD_AUTH_CD, T000P2_A563TBT02_DM_ARRIVAL_FLG,
            T000P2_n563TBT02_DM_ARRIVAL_FLG, T000P2_A564TBT02_DM_ARRIVAL_DATETIME, T000P2_n564TBT02_DM_ARRIVAL_DATETIME, T000P2_A565TBT02_APPROVAL_FLG, T000P2_n565TBT02_APPROVAL_FLG, T000P2_A566TBT02_APPROVAL_DATETIME, T000P2_n566TBT02_APPROVAL_DATETIME, T000P2_A567TBT02_APPROVAL_USER_ID, T000P2_n567TBT02_APPROVAL_USER_ID, T000P2_A568TBT02_APPROVAL_AUTH_CD,
            T000P2_n568TBT02_APPROVAL_AUTH_CD, T000P2_A569TBT02_INPUT_END_FLG, T000P2_n569TBT02_INPUT_END_FLG, T000P2_A570TBT02_INPUT_END_DATETIME, T000P2_n570TBT02_INPUT_END_DATETIME, T000P2_A571TBT02_INPUT_END_USER_ID, T000P2_n571TBT02_INPUT_END_USER_ID, T000P2_A572TBT02_INPUT_END_AUTH_CD, T000P2_n572TBT02_INPUT_END_AUTH_CD, T000P2_A295TBT02_DEL_FLG,
            T000P2_n295TBT02_DEL_FLG, T000P2_A298TBT02_CRT_PROG_NM, T000P2_n298TBT02_CRT_PROG_NM, T000P2_A301TBT02_UPD_PROG_NM, T000P2_n301TBT02_UPD_PROG_NM, T000P2_A292TBT02_STUDY_ID, T000P2_A293TBT02_SUBJECT_ID
            }
            , new Object[] {
            T000P3_A294TBT02_CRF_ID, T000P3_A296TBT02_CRT_DATETIME, T000P3_n296TBT02_CRT_DATETIME, T000P3_A297TBT02_CRT_USER_ID, T000P3_n297TBT02_CRT_USER_ID, T000P3_A299TBT02_UPD_DATETIME, T000P3_n299TBT02_UPD_DATETIME, T000P3_A300TBT02_UPD_USER_ID, T000P3_n300TBT02_UPD_USER_ID, T000P3_A302TBT02_UPD_CNT,
            T000P3_n302TBT02_UPD_CNT, T000P3_A370TBT02_CRF_LATEST_VERSION, T000P3_n370TBT02_CRF_LATEST_VERSION, T000P3_A371TBT02_CRF_INPUT_LEVEL, T000P3_n371TBT02_CRF_INPUT_LEVEL, T000P3_A556TBT02_LOCK_FLG, T000P3_n556TBT02_LOCK_FLG, T000P3_A557TBT02_LOCK_DATETIME, T000P3_n557TBT02_LOCK_DATETIME, T000P3_A558TBT02_LOCK_USER_ID,
            T000P3_n558TBT02_LOCK_USER_ID, T000P3_A559TBT02_LOCK_AUTH_CD, T000P3_n559TBT02_LOCK_AUTH_CD, T000P3_A560TBT02_UPLOAD_DATETIME, T000P3_n560TBT02_UPLOAD_DATETIME, T000P3_A561TBT02_UPLOAD_USER_ID, T000P3_n561TBT02_UPLOAD_USER_ID, T000P3_A562TBT02_UPLOAD_AUTH_CD, T000P3_n562TBT02_UPLOAD_AUTH_CD, T000P3_A563TBT02_DM_ARRIVAL_FLG,
            T000P3_n563TBT02_DM_ARRIVAL_FLG, T000P3_A564TBT02_DM_ARRIVAL_DATETIME, T000P3_n564TBT02_DM_ARRIVAL_DATETIME, T000P3_A565TBT02_APPROVAL_FLG, T000P3_n565TBT02_APPROVAL_FLG, T000P3_A566TBT02_APPROVAL_DATETIME, T000P3_n566TBT02_APPROVAL_DATETIME, T000P3_A567TBT02_APPROVAL_USER_ID, T000P3_n567TBT02_APPROVAL_USER_ID, T000P3_A568TBT02_APPROVAL_AUTH_CD,
            T000P3_n568TBT02_APPROVAL_AUTH_CD, T000P3_A569TBT02_INPUT_END_FLG, T000P3_n569TBT02_INPUT_END_FLG, T000P3_A570TBT02_INPUT_END_DATETIME, T000P3_n570TBT02_INPUT_END_DATETIME, T000P3_A571TBT02_INPUT_END_USER_ID, T000P3_n571TBT02_INPUT_END_USER_ID, T000P3_A572TBT02_INPUT_END_AUTH_CD, T000P3_n572TBT02_INPUT_END_AUTH_CD, T000P3_A295TBT02_DEL_FLG,
            T000P3_n295TBT02_DEL_FLG, T000P3_A298TBT02_CRT_PROG_NM, T000P3_n298TBT02_CRT_PROG_NM, T000P3_A301TBT02_UPD_PROG_NM, T000P3_n301TBT02_UPD_PROG_NM, T000P3_A292TBT02_STUDY_ID, T000P3_A293TBT02_SUBJECT_ID
            }
            , new Object[] {
            T000P4_A292TBT02_STUDY_ID
            }
            , new Object[] {
            T000P5_A294TBT02_CRF_ID, T000P5_A296TBT02_CRT_DATETIME, T000P5_n296TBT02_CRT_DATETIME, T000P5_A297TBT02_CRT_USER_ID, T000P5_n297TBT02_CRT_USER_ID, T000P5_A299TBT02_UPD_DATETIME, T000P5_n299TBT02_UPD_DATETIME, T000P5_A300TBT02_UPD_USER_ID, T000P5_n300TBT02_UPD_USER_ID, T000P5_A302TBT02_UPD_CNT,
            T000P5_n302TBT02_UPD_CNT, T000P5_A370TBT02_CRF_LATEST_VERSION, T000P5_n370TBT02_CRF_LATEST_VERSION, T000P5_A371TBT02_CRF_INPUT_LEVEL, T000P5_n371TBT02_CRF_INPUT_LEVEL, T000P5_A556TBT02_LOCK_FLG, T000P5_n556TBT02_LOCK_FLG, T000P5_A557TBT02_LOCK_DATETIME, T000P5_n557TBT02_LOCK_DATETIME, T000P5_A558TBT02_LOCK_USER_ID,
            T000P5_n558TBT02_LOCK_USER_ID, T000P5_A559TBT02_LOCK_AUTH_CD, T000P5_n559TBT02_LOCK_AUTH_CD, T000P5_A560TBT02_UPLOAD_DATETIME, T000P5_n560TBT02_UPLOAD_DATETIME, T000P5_A561TBT02_UPLOAD_USER_ID, T000P5_n561TBT02_UPLOAD_USER_ID, T000P5_A562TBT02_UPLOAD_AUTH_CD, T000P5_n562TBT02_UPLOAD_AUTH_CD, T000P5_A563TBT02_DM_ARRIVAL_FLG,
            T000P5_n563TBT02_DM_ARRIVAL_FLG, T000P5_A564TBT02_DM_ARRIVAL_DATETIME, T000P5_n564TBT02_DM_ARRIVAL_DATETIME, T000P5_A565TBT02_APPROVAL_FLG, T000P5_n565TBT02_APPROVAL_FLG, T000P5_A566TBT02_APPROVAL_DATETIME, T000P5_n566TBT02_APPROVAL_DATETIME, T000P5_A567TBT02_APPROVAL_USER_ID, T000P5_n567TBT02_APPROVAL_USER_ID, T000P5_A568TBT02_APPROVAL_AUTH_CD,
            T000P5_n568TBT02_APPROVAL_AUTH_CD, T000P5_A569TBT02_INPUT_END_FLG, T000P5_n569TBT02_INPUT_END_FLG, T000P5_A570TBT02_INPUT_END_DATETIME, T000P5_n570TBT02_INPUT_END_DATETIME, T000P5_A571TBT02_INPUT_END_USER_ID, T000P5_n571TBT02_INPUT_END_USER_ID, T000P5_A572TBT02_INPUT_END_AUTH_CD, T000P5_n572TBT02_INPUT_END_AUTH_CD, T000P5_A295TBT02_DEL_FLG,
            T000P5_n295TBT02_DEL_FLG, T000P5_A298TBT02_CRT_PROG_NM, T000P5_n298TBT02_CRT_PROG_NM, T000P5_A301TBT02_UPD_PROG_NM, T000P5_n301TBT02_UPD_PROG_NM, T000P5_A292TBT02_STUDY_ID, T000P5_A293TBT02_SUBJECT_ID
            }
            , new Object[] {
            T000P6_A292TBT02_STUDY_ID
            }
            , new Object[] {
            T000P7_A292TBT02_STUDY_ID, T000P7_A293TBT02_SUBJECT_ID, T000P7_A294TBT02_CRF_ID
            }
            , new Object[] {
            T000P8_A292TBT02_STUDY_ID, T000P8_A293TBT02_SUBJECT_ID, T000P8_A294TBT02_CRF_ID
            }
            , new Object[] {
            T000P9_A292TBT02_STUDY_ID, T000P9_A293TBT02_SUBJECT_ID, T000P9_A294TBT02_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000P13_A292TBT02_STUDY_ID, T000P13_A293TBT02_SUBJECT_ID, T000P13_A294TBT02_CRF_ID
            }
            , new Object[] {
            T000P14_A292TBT02_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT02_CRF" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A371TBT02_CRF_INPUT_LEVEL ;
   private byte Z371TBT02_CRF_INPUT_LEVEL ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A294TBT02_CRF_ID ;
   private short A370TBT02_CRF_LATEST_VERSION ;
   private short Z294TBT02_CRF_ID ;
   private short Z370TBT02_CRF_LATEST_VERSION ;
   private short RcdFound24 ;
   private short Gx_err ;
   private int A293TBT02_SUBJECT_ID ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBT02_STUDY_ID_Enabled ;
   private int edtTBT02_SUBJECT_ID_Enabled ;
   private int edtTBT02_CRF_ID_Enabled ;
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
   private int Z293TBT02_SUBJECT_ID ;
   private int GX_JID ;
   private int AnyError292 ;
   private int AnyError293 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A292TBT02_STUDY_ID ;
   private long A302TBT02_UPD_CNT ;
   private long Z292TBT02_STUDY_ID ;
   private long Z302TBT02_UPD_CNT ;
   private long O302TBT02_UPD_CNT ;
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
   private String sMode24 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A557TBT02_LOCK_DATETIME ;
   private java.util.Date A560TBT02_UPLOAD_DATETIME ;
   private java.util.Date A564TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date A566TBT02_APPROVAL_DATETIME ;
   private java.util.Date A570TBT02_INPUT_END_DATETIME ;
   private java.util.Date A296TBT02_CRT_DATETIME ;
   private java.util.Date A299TBT02_UPD_DATETIME ;
   private java.util.Date Z296TBT02_CRT_DATETIME ;
   private java.util.Date Z299TBT02_UPD_DATETIME ;
   private java.util.Date Z557TBT02_LOCK_DATETIME ;
   private java.util.Date Z560TBT02_UPLOAD_DATETIME ;
   private java.util.Date Z564TBT02_DM_ARRIVAL_DATETIME ;
   private java.util.Date Z566TBT02_APPROVAL_DATETIME ;
   private java.util.Date Z570TBT02_INPUT_END_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n370TBT02_CRF_LATEST_VERSION ;
   private boolean n371TBT02_CRF_INPUT_LEVEL ;
   private boolean n556TBT02_LOCK_FLG ;
   private boolean n557TBT02_LOCK_DATETIME ;
   private boolean n558TBT02_LOCK_USER_ID ;
   private boolean n559TBT02_LOCK_AUTH_CD ;
   private boolean n560TBT02_UPLOAD_DATETIME ;
   private boolean n561TBT02_UPLOAD_USER_ID ;
   private boolean n562TBT02_UPLOAD_AUTH_CD ;
   private boolean n563TBT02_DM_ARRIVAL_FLG ;
   private boolean n564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean n565TBT02_APPROVAL_FLG ;
   private boolean n566TBT02_APPROVAL_DATETIME ;
   private boolean n567TBT02_APPROVAL_USER_ID ;
   private boolean n568TBT02_APPROVAL_AUTH_CD ;
   private boolean n569TBT02_INPUT_END_FLG ;
   private boolean n570TBT02_INPUT_END_DATETIME ;
   private boolean n571TBT02_INPUT_END_USER_ID ;
   private boolean n572TBT02_INPUT_END_AUTH_CD ;
   private boolean n295TBT02_DEL_FLG ;
   private boolean n296TBT02_CRT_DATETIME ;
   private boolean n297TBT02_CRT_USER_ID ;
   private boolean n298TBT02_CRT_PROG_NM ;
   private boolean n299TBT02_UPD_DATETIME ;
   private boolean n300TBT02_UPD_USER_ID ;
   private boolean n301TBT02_UPD_PROG_NM ;
   private boolean n302TBT02_UPD_CNT ;
   private boolean Gx_longc ;
   private String A556TBT02_LOCK_FLG ;
   private String A558TBT02_LOCK_USER_ID ;
   private String A559TBT02_LOCK_AUTH_CD ;
   private String A561TBT02_UPLOAD_USER_ID ;
   private String A562TBT02_UPLOAD_AUTH_CD ;
   private String A563TBT02_DM_ARRIVAL_FLG ;
   private String A565TBT02_APPROVAL_FLG ;
   private String A567TBT02_APPROVAL_USER_ID ;
   private String A568TBT02_APPROVAL_AUTH_CD ;
   private String A569TBT02_INPUT_END_FLG ;
   private String A571TBT02_INPUT_END_USER_ID ;
   private String A572TBT02_INPUT_END_AUTH_CD ;
   private String A295TBT02_DEL_FLG ;
   private String A297TBT02_CRT_USER_ID ;
   private String A298TBT02_CRT_PROG_NM ;
   private String A300TBT02_UPD_USER_ID ;
   private String A301TBT02_UPD_PROG_NM ;
   private String Z297TBT02_CRT_USER_ID ;
   private String Z300TBT02_UPD_USER_ID ;
   private String Z556TBT02_LOCK_FLG ;
   private String Z558TBT02_LOCK_USER_ID ;
   private String Z559TBT02_LOCK_AUTH_CD ;
   private String Z561TBT02_UPLOAD_USER_ID ;
   private String Z562TBT02_UPLOAD_AUTH_CD ;
   private String Z563TBT02_DM_ARRIVAL_FLG ;
   private String Z565TBT02_APPROVAL_FLG ;
   private String Z567TBT02_APPROVAL_USER_ID ;
   private String Z568TBT02_APPROVAL_AUTH_CD ;
   private String Z569TBT02_INPUT_END_FLG ;
   private String Z571TBT02_INPUT_END_USER_ID ;
   private String Z572TBT02_INPUT_END_AUTH_CD ;
   private String Z295TBT02_DEL_FLG ;
   private String Z298TBT02_CRT_PROG_NM ;
   private String Z301TBT02_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private short[] T000P5_A294TBT02_CRF_ID ;
   private java.util.Date[] T000P5_A296TBT02_CRT_DATETIME ;
   private boolean[] T000P5_n296TBT02_CRT_DATETIME ;
   private String[] T000P5_A297TBT02_CRT_USER_ID ;
   private boolean[] T000P5_n297TBT02_CRT_USER_ID ;
   private java.util.Date[] T000P5_A299TBT02_UPD_DATETIME ;
   private boolean[] T000P5_n299TBT02_UPD_DATETIME ;
   private String[] T000P5_A300TBT02_UPD_USER_ID ;
   private boolean[] T000P5_n300TBT02_UPD_USER_ID ;
   private long[] T000P5_A302TBT02_UPD_CNT ;
   private boolean[] T000P5_n302TBT02_UPD_CNT ;
   private short[] T000P5_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] T000P5_n370TBT02_CRF_LATEST_VERSION ;
   private byte[] T000P5_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] T000P5_n371TBT02_CRF_INPUT_LEVEL ;
   private String[] T000P5_A556TBT02_LOCK_FLG ;
   private boolean[] T000P5_n556TBT02_LOCK_FLG ;
   private java.util.Date[] T000P5_A557TBT02_LOCK_DATETIME ;
   private boolean[] T000P5_n557TBT02_LOCK_DATETIME ;
   private String[] T000P5_A558TBT02_LOCK_USER_ID ;
   private boolean[] T000P5_n558TBT02_LOCK_USER_ID ;
   private String[] T000P5_A559TBT02_LOCK_AUTH_CD ;
   private boolean[] T000P5_n559TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] T000P5_A560TBT02_UPLOAD_DATETIME ;
   private boolean[] T000P5_n560TBT02_UPLOAD_DATETIME ;
   private String[] T000P5_A561TBT02_UPLOAD_USER_ID ;
   private boolean[] T000P5_n561TBT02_UPLOAD_USER_ID ;
   private String[] T000P5_A562TBT02_UPLOAD_AUTH_CD ;
   private boolean[] T000P5_n562TBT02_UPLOAD_AUTH_CD ;
   private String[] T000P5_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] T000P5_n563TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000P5_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] T000P5_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] T000P5_A565TBT02_APPROVAL_FLG ;
   private boolean[] T000P5_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] T000P5_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] T000P5_n566TBT02_APPROVAL_DATETIME ;
   private String[] T000P5_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] T000P5_n567TBT02_APPROVAL_USER_ID ;
   private String[] T000P5_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] T000P5_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] T000P5_A569TBT02_INPUT_END_FLG ;
   private boolean[] T000P5_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] T000P5_A570TBT02_INPUT_END_DATETIME ;
   private boolean[] T000P5_n570TBT02_INPUT_END_DATETIME ;
   private String[] T000P5_A571TBT02_INPUT_END_USER_ID ;
   private boolean[] T000P5_n571TBT02_INPUT_END_USER_ID ;
   private String[] T000P5_A572TBT02_INPUT_END_AUTH_CD ;
   private boolean[] T000P5_n572TBT02_INPUT_END_AUTH_CD ;
   private String[] T000P5_A295TBT02_DEL_FLG ;
   private boolean[] T000P5_n295TBT02_DEL_FLG ;
   private String[] T000P5_A298TBT02_CRT_PROG_NM ;
   private boolean[] T000P5_n298TBT02_CRT_PROG_NM ;
   private String[] T000P5_A301TBT02_UPD_PROG_NM ;
   private boolean[] T000P5_n301TBT02_UPD_PROG_NM ;
   private long[] T000P5_A292TBT02_STUDY_ID ;
   private int[] T000P5_A293TBT02_SUBJECT_ID ;
   private long[] T000P4_A292TBT02_STUDY_ID ;
   private long[] T000P6_A292TBT02_STUDY_ID ;
   private long[] T000P7_A292TBT02_STUDY_ID ;
   private int[] T000P7_A293TBT02_SUBJECT_ID ;
   private short[] T000P7_A294TBT02_CRF_ID ;
   private short[] T000P3_A294TBT02_CRF_ID ;
   private java.util.Date[] T000P3_A296TBT02_CRT_DATETIME ;
   private boolean[] T000P3_n296TBT02_CRT_DATETIME ;
   private String[] T000P3_A297TBT02_CRT_USER_ID ;
   private boolean[] T000P3_n297TBT02_CRT_USER_ID ;
   private java.util.Date[] T000P3_A299TBT02_UPD_DATETIME ;
   private boolean[] T000P3_n299TBT02_UPD_DATETIME ;
   private String[] T000P3_A300TBT02_UPD_USER_ID ;
   private boolean[] T000P3_n300TBT02_UPD_USER_ID ;
   private long[] T000P3_A302TBT02_UPD_CNT ;
   private boolean[] T000P3_n302TBT02_UPD_CNT ;
   private short[] T000P3_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] T000P3_n370TBT02_CRF_LATEST_VERSION ;
   private byte[] T000P3_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] T000P3_n371TBT02_CRF_INPUT_LEVEL ;
   private String[] T000P3_A556TBT02_LOCK_FLG ;
   private boolean[] T000P3_n556TBT02_LOCK_FLG ;
   private java.util.Date[] T000P3_A557TBT02_LOCK_DATETIME ;
   private boolean[] T000P3_n557TBT02_LOCK_DATETIME ;
   private String[] T000P3_A558TBT02_LOCK_USER_ID ;
   private boolean[] T000P3_n558TBT02_LOCK_USER_ID ;
   private String[] T000P3_A559TBT02_LOCK_AUTH_CD ;
   private boolean[] T000P3_n559TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] T000P3_A560TBT02_UPLOAD_DATETIME ;
   private boolean[] T000P3_n560TBT02_UPLOAD_DATETIME ;
   private String[] T000P3_A561TBT02_UPLOAD_USER_ID ;
   private boolean[] T000P3_n561TBT02_UPLOAD_USER_ID ;
   private String[] T000P3_A562TBT02_UPLOAD_AUTH_CD ;
   private boolean[] T000P3_n562TBT02_UPLOAD_AUTH_CD ;
   private String[] T000P3_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] T000P3_n563TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000P3_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] T000P3_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] T000P3_A565TBT02_APPROVAL_FLG ;
   private boolean[] T000P3_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] T000P3_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] T000P3_n566TBT02_APPROVAL_DATETIME ;
   private String[] T000P3_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] T000P3_n567TBT02_APPROVAL_USER_ID ;
   private String[] T000P3_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] T000P3_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] T000P3_A569TBT02_INPUT_END_FLG ;
   private boolean[] T000P3_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] T000P3_A570TBT02_INPUT_END_DATETIME ;
   private boolean[] T000P3_n570TBT02_INPUT_END_DATETIME ;
   private String[] T000P3_A571TBT02_INPUT_END_USER_ID ;
   private boolean[] T000P3_n571TBT02_INPUT_END_USER_ID ;
   private String[] T000P3_A572TBT02_INPUT_END_AUTH_CD ;
   private boolean[] T000P3_n572TBT02_INPUT_END_AUTH_CD ;
   private String[] T000P3_A295TBT02_DEL_FLG ;
   private boolean[] T000P3_n295TBT02_DEL_FLG ;
   private String[] T000P3_A298TBT02_CRT_PROG_NM ;
   private boolean[] T000P3_n298TBT02_CRT_PROG_NM ;
   private String[] T000P3_A301TBT02_UPD_PROG_NM ;
   private boolean[] T000P3_n301TBT02_UPD_PROG_NM ;
   private long[] T000P3_A292TBT02_STUDY_ID ;
   private int[] T000P3_A293TBT02_SUBJECT_ID ;
   private long[] T000P8_A292TBT02_STUDY_ID ;
   private int[] T000P8_A293TBT02_SUBJECT_ID ;
   private short[] T000P8_A294TBT02_CRF_ID ;
   private long[] T000P9_A292TBT02_STUDY_ID ;
   private int[] T000P9_A293TBT02_SUBJECT_ID ;
   private short[] T000P9_A294TBT02_CRF_ID ;
   private short[] T000P2_A294TBT02_CRF_ID ;
   private java.util.Date[] T000P2_A296TBT02_CRT_DATETIME ;
   private boolean[] T000P2_n296TBT02_CRT_DATETIME ;
   private String[] T000P2_A297TBT02_CRT_USER_ID ;
   private boolean[] T000P2_n297TBT02_CRT_USER_ID ;
   private java.util.Date[] T000P2_A299TBT02_UPD_DATETIME ;
   private boolean[] T000P2_n299TBT02_UPD_DATETIME ;
   private String[] T000P2_A300TBT02_UPD_USER_ID ;
   private boolean[] T000P2_n300TBT02_UPD_USER_ID ;
   private long[] T000P2_A302TBT02_UPD_CNT ;
   private boolean[] T000P2_n302TBT02_UPD_CNT ;
   private short[] T000P2_A370TBT02_CRF_LATEST_VERSION ;
   private boolean[] T000P2_n370TBT02_CRF_LATEST_VERSION ;
   private byte[] T000P2_A371TBT02_CRF_INPUT_LEVEL ;
   private boolean[] T000P2_n371TBT02_CRF_INPUT_LEVEL ;
   private String[] T000P2_A556TBT02_LOCK_FLG ;
   private boolean[] T000P2_n556TBT02_LOCK_FLG ;
   private java.util.Date[] T000P2_A557TBT02_LOCK_DATETIME ;
   private boolean[] T000P2_n557TBT02_LOCK_DATETIME ;
   private String[] T000P2_A558TBT02_LOCK_USER_ID ;
   private boolean[] T000P2_n558TBT02_LOCK_USER_ID ;
   private String[] T000P2_A559TBT02_LOCK_AUTH_CD ;
   private boolean[] T000P2_n559TBT02_LOCK_AUTH_CD ;
   private java.util.Date[] T000P2_A560TBT02_UPLOAD_DATETIME ;
   private boolean[] T000P2_n560TBT02_UPLOAD_DATETIME ;
   private String[] T000P2_A561TBT02_UPLOAD_USER_ID ;
   private boolean[] T000P2_n561TBT02_UPLOAD_USER_ID ;
   private String[] T000P2_A562TBT02_UPLOAD_AUTH_CD ;
   private boolean[] T000P2_n562TBT02_UPLOAD_AUTH_CD ;
   private String[] T000P2_A563TBT02_DM_ARRIVAL_FLG ;
   private boolean[] T000P2_n563TBT02_DM_ARRIVAL_FLG ;
   private java.util.Date[] T000P2_A564TBT02_DM_ARRIVAL_DATETIME ;
   private boolean[] T000P2_n564TBT02_DM_ARRIVAL_DATETIME ;
   private String[] T000P2_A565TBT02_APPROVAL_FLG ;
   private boolean[] T000P2_n565TBT02_APPROVAL_FLG ;
   private java.util.Date[] T000P2_A566TBT02_APPROVAL_DATETIME ;
   private boolean[] T000P2_n566TBT02_APPROVAL_DATETIME ;
   private String[] T000P2_A567TBT02_APPROVAL_USER_ID ;
   private boolean[] T000P2_n567TBT02_APPROVAL_USER_ID ;
   private String[] T000P2_A568TBT02_APPROVAL_AUTH_CD ;
   private boolean[] T000P2_n568TBT02_APPROVAL_AUTH_CD ;
   private String[] T000P2_A569TBT02_INPUT_END_FLG ;
   private boolean[] T000P2_n569TBT02_INPUT_END_FLG ;
   private java.util.Date[] T000P2_A570TBT02_INPUT_END_DATETIME ;
   private boolean[] T000P2_n570TBT02_INPUT_END_DATETIME ;
   private String[] T000P2_A571TBT02_INPUT_END_USER_ID ;
   private boolean[] T000P2_n571TBT02_INPUT_END_USER_ID ;
   private String[] T000P2_A572TBT02_INPUT_END_AUTH_CD ;
   private boolean[] T000P2_n572TBT02_INPUT_END_AUTH_CD ;
   private String[] T000P2_A295TBT02_DEL_FLG ;
   private boolean[] T000P2_n295TBT02_DEL_FLG ;
   private String[] T000P2_A298TBT02_CRT_PROG_NM ;
   private boolean[] T000P2_n298TBT02_CRT_PROG_NM ;
   private String[] T000P2_A301TBT02_UPD_PROG_NM ;
   private boolean[] T000P2_n301TBT02_UPD_PROG_NM ;
   private long[] T000P2_A292TBT02_STUDY_ID ;
   private int[] T000P2_A293TBT02_SUBJECT_ID ;
   private long[] T000P13_A292TBT02_STUDY_ID ;
   private int[] T000P13_A293TBT02_SUBJECT_ID ;
   private short[] T000P13_A294TBT02_CRF_ID ;
   private long[] T000P14_A292TBT02_STUDY_ID ;
}

final  class tbt02_crf__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000P2", "SELECT `TBT02_CRF_ID`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P3", "SELECT `TBT02_CRF_ID`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P4", "SELECT `TBT01_STUDY_ID` AS TBT02_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P5", "SELECT TM1.`TBT02_CRF_ID`, TM1.`TBT02_CRT_DATETIME`, TM1.`TBT02_CRT_USER_ID`, TM1.`TBT02_UPD_DATETIME`, TM1.`TBT02_UPD_USER_ID`, TM1.`TBT02_UPD_CNT`, TM1.`TBT02_CRF_LATEST_VERSION`, TM1.`TBT02_CRF_INPUT_LEVEL`, TM1.`TBT02_LOCK_FLG`, TM1.`TBT02_LOCK_DATETIME`, TM1.`TBT02_LOCK_USER_ID`, TM1.`TBT02_LOCK_AUTH_CD`, TM1.`TBT02_UPLOAD_DATETIME`, TM1.`TBT02_UPLOAD_USER_ID`, TM1.`TBT02_UPLOAD_AUTH_CD`, TM1.`TBT02_DM_ARRIVAL_FLG`, TM1.`TBT02_DM_ARRIVAL_DATETIME`, TM1.`TBT02_APPROVAL_FLG`, TM1.`TBT02_APPROVAL_DATETIME`, TM1.`TBT02_APPROVAL_USER_ID`, TM1.`TBT02_APPROVAL_AUTH_CD`, TM1.`TBT02_INPUT_END_FLG`, TM1.`TBT02_INPUT_END_DATETIME`, TM1.`TBT02_INPUT_END_USER_ID`, TM1.`TBT02_INPUT_END_AUTH_CD`, TM1.`TBT02_DEL_FLG`, TM1.`TBT02_CRT_PROG_NM`, TM1.`TBT02_UPD_PROG_NM`, TM1.`TBT02_STUDY_ID` AS TBT02_STUDY_ID, TM1.`TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID FROM `TBT02_CRF` TM1 WHERE TM1.`TBT02_STUDY_ID` = ? and TM1.`TBT02_SUBJECT_ID` = ? and TM1.`TBT02_CRF_ID` = ? ORDER BY TM1.`TBT02_STUDY_ID`, TM1.`TBT02_SUBJECT_ID`, TM1.`TBT02_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000P6", "SELECT `TBT01_STUDY_ID` AS TBT02_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P7", "SELECT `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_CRF_ID` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000P8", "SELECT `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_CRF_ID` FROM `TBT02_CRF` WHERE ( `TBT02_STUDY_ID` > ? or `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` > ? or `TBT02_SUBJECT_ID` = ? and `TBT02_STUDY_ID` = ? and `TBT02_CRF_ID` > ?) ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000P9", "SELECT `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_CRF_ID` FROM `TBT02_CRF` WHERE ( `TBT02_STUDY_ID` < ? or `TBT02_STUDY_ID` = ? and `TBT02_SUBJECT_ID` < ? or `TBT02_SUBJECT_ID` = ? and `TBT02_STUDY_ID` = ? and `TBT02_CRF_ID` < ?) ORDER BY `TBT02_STUDY_ID` DESC, `TBT02_SUBJECT_ID` DESC, `TBT02_CRF_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000P10", "INSERT INTO `TBT02_CRF` (`TBT02_CRF_ID`, `TBT02_CRT_DATETIME`, `TBT02_CRT_USER_ID`, `TBT02_UPD_DATETIME`, `TBT02_UPD_USER_ID`, `TBT02_UPD_CNT`, `TBT02_CRF_LATEST_VERSION`, `TBT02_CRF_INPUT_LEVEL`, `TBT02_LOCK_FLG`, `TBT02_LOCK_DATETIME`, `TBT02_LOCK_USER_ID`, `TBT02_LOCK_AUTH_CD`, `TBT02_UPLOAD_DATETIME`, `TBT02_UPLOAD_USER_ID`, `TBT02_UPLOAD_AUTH_CD`, `TBT02_DM_ARRIVAL_FLG`, `TBT02_DM_ARRIVAL_DATETIME`, `TBT02_APPROVAL_FLG`, `TBT02_APPROVAL_DATETIME`, `TBT02_APPROVAL_USER_ID`, `TBT02_APPROVAL_AUTH_CD`, `TBT02_INPUT_END_FLG`, `TBT02_INPUT_END_DATETIME`, `TBT02_INPUT_END_USER_ID`, `TBT02_INPUT_END_AUTH_CD`, `TBT02_DEL_FLG`, `TBT02_CRT_PROG_NM`, `TBT02_UPD_PROG_NM`, `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000P11", "UPDATE `TBT02_CRF` SET `TBT02_CRT_DATETIME`=?, `TBT02_CRT_USER_ID`=?, `TBT02_UPD_DATETIME`=?, `TBT02_UPD_USER_ID`=?, `TBT02_UPD_CNT`=?, `TBT02_CRF_LATEST_VERSION`=?, `TBT02_CRF_INPUT_LEVEL`=?, `TBT02_LOCK_FLG`=?, `TBT02_LOCK_DATETIME`=?, `TBT02_LOCK_USER_ID`=?, `TBT02_LOCK_AUTH_CD`=?, `TBT02_UPLOAD_DATETIME`=?, `TBT02_UPLOAD_USER_ID`=?, `TBT02_UPLOAD_AUTH_CD`=?, `TBT02_DM_ARRIVAL_FLG`=?, `TBT02_DM_ARRIVAL_DATETIME`=?, `TBT02_APPROVAL_FLG`=?, `TBT02_APPROVAL_DATETIME`=?, `TBT02_APPROVAL_USER_ID`=?, `TBT02_APPROVAL_AUTH_CD`=?, `TBT02_INPUT_END_FLG`=?, `TBT02_INPUT_END_DATETIME`=?, `TBT02_INPUT_END_USER_ID`=?, `TBT02_INPUT_END_AUTH_CD`=?, `TBT02_DEL_FLG`=?, `TBT02_CRT_PROG_NM`=?, `TBT02_UPD_PROG_NM`=?  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000P12", "DELETE FROM `TBT02_CRF`  WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ? AND `TBT02_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000P13", "SELECT `TBT02_STUDY_ID` AS TBT02_STUDY_ID, `TBT02_SUBJECT_ID` AS TBT02_SUBJECT_ID, `TBT02_CRF_ID` FROM `TBT02_CRF` ORDER BY `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000P14", "SELECT `TBT01_STUDY_ID` AS TBT02_STUDY_ID FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(29) ;
               ((int[]) buf[56])[0] = rslt.getInt(30) ;
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(29) ;
               ((int[]) buf[56])[0] = rslt.getInt(30) ;
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[17])[0] = rslt.getGXDateTime(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[23])[0] = rslt.getGXDateTime(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getVarchar(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[31])[0] = rslt.getGXDateTime(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((String[]) buf[41])[0] = rslt.getVarchar(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[43])[0] = rslt.getGXDateTime(23) ;
               ((boolean[]) buf[44])[0] = rslt.wasNull();
               ((String[]) buf[45])[0] = rslt.getVarchar(24) ;
               ((boolean[]) buf[46])[0] = rslt.wasNull();
               ((String[]) buf[47])[0] = rslt.getVarchar(25) ;
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getVarchar(26) ;
               ((boolean[]) buf[50])[0] = rslt.wasNull();
               ((String[]) buf[51])[0] = rslt.getVarchar(27) ;
               ((boolean[]) buf[52])[0] = rslt.wasNull();
               ((String[]) buf[53])[0] = rslt.getVarchar(28) ;
               ((boolean[]) buf[54])[0] = rslt.wasNull();
               ((long[]) buf[55])[0] = rslt.getLong(29) ;
               ((int[]) buf[56])[0] = rslt.getInt(30) ;
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
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
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
                  stmt.setNull( 10 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(10, (java.util.Date)parms[18], false);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 128);
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
                  stmt.setNull( 13 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(13, (java.util.Date)parms[24], false);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 128);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 2);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 1);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(17, (java.util.Date)parms[32], false);
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
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[36], false);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 128);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 2);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(22, (String)parms[42], 1);
               }
               if ( ((Boolean) parms[43]).booleanValue() )
               {
                  stmt.setNull( 23 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(23, (java.util.Date)parms[44], false);
               }
               if ( ((Boolean) parms[45]).booleanValue() )
               {
                  stmt.setNull( 24 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(24, (String)parms[46], 128);
               }
               if ( ((Boolean) parms[47]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[48], 2);
               }
               if ( ((Boolean) parms[49]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[50], 1);
               }
               if ( ((Boolean) parms[51]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[52], 40);
               }
               if ( ((Boolean) parms[53]).booleanValue() )
               {
                  stmt.setNull( 28 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(28, (String)parms[54], 40);
               }
               stmt.setLong(29, ((Number) parms[55]).longValue());
               stmt.setInt(30, ((Number) parms[56]).intValue());
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
                  stmt.setVarchar(24, (String)parms[47], 2);
               }
               if ( ((Boolean) parms[48]).booleanValue() )
               {
                  stmt.setNull( 25 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(25, (String)parms[49], 1);
               }
               if ( ((Boolean) parms[50]).booleanValue() )
               {
                  stmt.setNull( 26 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(26, (String)parms[51], 40);
               }
               if ( ((Boolean) parms[52]).booleanValue() )
               {
                  stmt.setNull( 27 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(27, (String)parms[53], 40);
               }
               stmt.setLong(28, ((Number) parms[54]).longValue());
               stmt.setInt(29, ((Number) parms[55]).intValue());
               stmt.setShort(30, ((Number) parms[56]).shortValue());
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
      }
   }

}

