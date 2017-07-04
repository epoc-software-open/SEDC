/*
               File: tbm26_sel_list_item_impl
        Description: 選択リスト項目マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:4.84
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm26_sel_list_item_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM26_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm26_crt_user_id0Y33( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM26_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm26_upd_user_id0Y33( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A446TBM26_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
         A447TBM26_LIST_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A446TBM26_STUDY_ID, A447TBM26_LIST_CD) ;
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
      Form.getMeta().addItem("Description", "選択リスト項目マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbm26_sel_list_item_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm26_sel_list_item_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm26_sel_list_item_impl.class ));
   }

   public tbm26_sel_list_item_impl( int remoteHandle ,
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
         wb_table1_2_0Y33( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0Y33e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0Y33( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0Y33( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0Y33( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0Y33e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"選択リスト項目マスタ"+"</legend>") ;
         wb_table3_27_0Y33( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0Y33e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0Y33e( true) ;
      }
      else
      {
         wb_table1_2_0Y33e( false) ;
      }
   }

   public void wb_table3_27_0Y33( boolean wbgen )
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
         wb_table4_33_0Y33( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0Y33e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM26_SEL_LIST_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM26_SEL_LIST_ITEM.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0Y33e( true) ;
      }
      else
      {
         wb_table3_27_0Y33e( false) ;
      }
   }

   public void wb_table4_33_0Y33( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_study_id_Internalname, "試験ID", "", "", lblTextblocktbm26_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A446TBM26_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM26_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A446TBM26_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A446TBM26_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM26_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_list_cd_Internalname, "選択リストコード", "", "", lblTextblocktbm26_list_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_LIST_CD_Internalname, GXutil.rtrim( A447TBM26_LIST_CD), GXutil.rtrim( localUtil.format( A447TBM26_LIST_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM26_LIST_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_LIST_CD_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_list_item_no_Internalname, "リスト番号", "", "", lblTextblocktbm26_list_item_no_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_LIST_ITEM_NO_Internalname, GXutil.ltrim( localUtil.ntoc( A448TBM26_LIST_ITEM_NO, (byte)(3), (byte)(0), ".", "")), ((edtTBM26_LIST_ITEM_NO_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A448TBM26_LIST_ITEM_NO), "ZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A448TBM26_LIST_ITEM_NO), "ZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM26_LIST_ITEM_NO_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_LIST_ITEM_NO_Enabled, 0, 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_list_item_name_Internalname, "リスト要素名", "", "", lblTextblocktbm26_list_item_name_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A449TBM26_LIST_ITEM_NAME", A449TBM26_LIST_ITEM_NAME);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_LIST_ITEM_NAME_Internalname, GXutil.rtrim( A449TBM26_LIST_ITEM_NAME), GXutil.rtrim( localUtil.format( A449TBM26_LIST_ITEM_NAME, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM26_LIST_ITEM_NAME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_LIST_ITEM_NAME_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_inner_value_Internalname, "内部値", "", "", lblTextblocktbm26_inner_value_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A450TBM26_INNER_VALUE", A450TBM26_INNER_VALUE);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_INNER_VALUE_Internalname, GXutil.rtrim( A450TBM26_INNER_VALUE), GXutil.rtrim( localUtil.format( A450TBM26_INNER_VALUE, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM26_INNER_VALUE_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_INNER_VALUE_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm26_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A451TBM26_DEL_FLG", A451TBM26_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_DEL_FLG_Internalname, GXutil.rtrim( A451TBM26_DEL_FLG), GXutil.rtrim( localUtil.format( A451TBM26_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM26_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm26_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A452TBM26_CRT_DATETIME", localUtil.ttoc( A452TBM26_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM26_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_CRT_DATETIME_Internalname, localUtil.format(A452TBM26_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A452TBM26_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM26_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM26_SEL_LIST_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM26_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM26_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm26_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A453TBM26_CRT_USER_ID", A453TBM26_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_CRT_USER_ID_Internalname, GXutil.rtrim( A453TBM26_CRT_USER_ID), GXutil.rtrim( localUtil.format( A453TBM26_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM26_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm26_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A454TBM26_CRT_PROG_NM", A454TBM26_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_CRT_PROG_NM_Internalname, GXutil.rtrim( A454TBM26_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A454TBM26_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM26_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm26_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A455TBM26_UPD_DATETIME", localUtil.ttoc( A455TBM26_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM26_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_UPD_DATETIME_Internalname, localUtil.format(A455TBM26_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A455TBM26_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM26_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM26_SEL_LIST_ITEM.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM26_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM26_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm26_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A456TBM26_UPD_USER_ID", A456TBM26_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_UPD_USER_ID_Internalname, GXutil.rtrim( A456TBM26_UPD_USER_ID), GXutil.rtrim( localUtil.format( A456TBM26_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM26_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm26_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A457TBM26_UPD_PROG_NM", A457TBM26_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_UPD_PROG_NM_Internalname, GXutil.rtrim( A457TBM26_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A457TBM26_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM26_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm26_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm26_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A458TBM26_UPD_CNT", GXutil.ltrim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM26_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A458TBM26_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM26_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A458TBM26_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A458TBM26_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(98);\"", "", "", "", "", edtTBM26_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM26_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM26_SEL_LIST_ITEM.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0Y33e( true) ;
      }
      else
      {
         wb_table4_33_0Y33e( false) ;
      }
   }

   public void wb_table2_5_0Y33( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM26_SEL_LIST_ITEM.htm");
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
         wb_table2_5_0Y33e( true) ;
      }
      else
      {
         wb_table2_5_0Y33e( false) ;
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
      /* Execute user event: e110Y2 */
      e110Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM26_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM26_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM26_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A446TBM26_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
            }
            else
            {
               A446TBM26_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM26_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
            }
            A447TBM26_LIST_CD = httpContext.cgiGet( edtTBM26_LIST_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM26_LIST_ITEM_NO_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM26_LIST_ITEM_NO_Internalname), ".", ",") > 999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM26_LIST_ITEM_NO");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM26_LIST_ITEM_NO_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A448TBM26_LIST_ITEM_NO = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
            }
            else
            {
               A448TBM26_LIST_ITEM_NO = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM26_LIST_ITEM_NO_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
            }
            A449TBM26_LIST_ITEM_NAME = httpContext.cgiGet( edtTBM26_LIST_ITEM_NAME_Internalname) ;
            n449TBM26_LIST_ITEM_NAME = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A449TBM26_LIST_ITEM_NAME", A449TBM26_LIST_ITEM_NAME);
            n449TBM26_LIST_ITEM_NAME = ((GXutil.strcmp("", A449TBM26_LIST_ITEM_NAME)==0) ? true : false) ;
            A450TBM26_INNER_VALUE = httpContext.cgiGet( edtTBM26_INNER_VALUE_Internalname) ;
            n450TBM26_INNER_VALUE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A450TBM26_INNER_VALUE", A450TBM26_INNER_VALUE);
            n450TBM26_INNER_VALUE = ((GXutil.strcmp("", A450TBM26_INNER_VALUE)==0) ? true : false) ;
            A451TBM26_DEL_FLG = httpContext.cgiGet( edtTBM26_DEL_FLG_Internalname) ;
            n451TBM26_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A451TBM26_DEL_FLG", A451TBM26_DEL_FLG);
            n451TBM26_DEL_FLG = ((GXutil.strcmp("", A451TBM26_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM26_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM26_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM26_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A452TBM26_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n452TBM26_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A452TBM26_CRT_DATETIME", localUtil.ttoc( A452TBM26_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A452TBM26_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM26_CRT_DATETIME_Internalname)) ;
               n452TBM26_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A452TBM26_CRT_DATETIME", localUtil.ttoc( A452TBM26_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n452TBM26_CRT_DATETIME = (GXutil.nullDate().equals(A452TBM26_CRT_DATETIME) ? true : false) ;
            A453TBM26_CRT_USER_ID = httpContext.cgiGet( edtTBM26_CRT_USER_ID_Internalname) ;
            n453TBM26_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A453TBM26_CRT_USER_ID", A453TBM26_CRT_USER_ID);
            n453TBM26_CRT_USER_ID = ((GXutil.strcmp("", A453TBM26_CRT_USER_ID)==0) ? true : false) ;
            A454TBM26_CRT_PROG_NM = httpContext.cgiGet( edtTBM26_CRT_PROG_NM_Internalname) ;
            n454TBM26_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A454TBM26_CRT_PROG_NM", A454TBM26_CRT_PROG_NM);
            n454TBM26_CRT_PROG_NM = ((GXutil.strcmp("", A454TBM26_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM26_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM26_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM26_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A455TBM26_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n455TBM26_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A455TBM26_UPD_DATETIME", localUtil.ttoc( A455TBM26_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A455TBM26_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM26_UPD_DATETIME_Internalname)) ;
               n455TBM26_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A455TBM26_UPD_DATETIME", localUtil.ttoc( A455TBM26_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n455TBM26_UPD_DATETIME = (GXutil.nullDate().equals(A455TBM26_UPD_DATETIME) ? true : false) ;
            A456TBM26_UPD_USER_ID = httpContext.cgiGet( edtTBM26_UPD_USER_ID_Internalname) ;
            n456TBM26_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A456TBM26_UPD_USER_ID", A456TBM26_UPD_USER_ID);
            n456TBM26_UPD_USER_ID = ((GXutil.strcmp("", A456TBM26_UPD_USER_ID)==0) ? true : false) ;
            A457TBM26_UPD_PROG_NM = httpContext.cgiGet( edtTBM26_UPD_PROG_NM_Internalname) ;
            n457TBM26_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A457TBM26_UPD_PROG_NM", A457TBM26_UPD_PROG_NM);
            n457TBM26_UPD_PROG_NM = ((GXutil.strcmp("", A457TBM26_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM26_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM26_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM26_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM26_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A458TBM26_UPD_CNT = 0 ;
               n458TBM26_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A458TBM26_UPD_CNT", GXutil.ltrim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)));
            }
            else
            {
               A458TBM26_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM26_UPD_CNT_Internalname), ".", ",") ;
               n458TBM26_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A458TBM26_UPD_CNT", GXutil.ltrim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)));
            }
            n458TBM26_UPD_CNT = ((0==A458TBM26_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z446TBM26_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z446TBM26_STUDY_ID"), ".", ",") ;
            Z447TBM26_LIST_CD = httpContext.cgiGet( "Z447TBM26_LIST_CD") ;
            Z448TBM26_LIST_ITEM_NO = (short)(localUtil.ctol( httpContext.cgiGet( "Z448TBM26_LIST_ITEM_NO"), ".", ",")) ;
            Z452TBM26_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z452TBM26_CRT_DATETIME"), 0) ;
            n452TBM26_CRT_DATETIME = (GXutil.nullDate().equals(A452TBM26_CRT_DATETIME) ? true : false) ;
            Z453TBM26_CRT_USER_ID = httpContext.cgiGet( "Z453TBM26_CRT_USER_ID") ;
            n453TBM26_CRT_USER_ID = ((GXutil.strcmp("", A453TBM26_CRT_USER_ID)==0) ? true : false) ;
            Z455TBM26_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z455TBM26_UPD_DATETIME"), 0) ;
            n455TBM26_UPD_DATETIME = (GXutil.nullDate().equals(A455TBM26_UPD_DATETIME) ? true : false) ;
            Z456TBM26_UPD_USER_ID = httpContext.cgiGet( "Z456TBM26_UPD_USER_ID") ;
            n456TBM26_UPD_USER_ID = ((GXutil.strcmp("", A456TBM26_UPD_USER_ID)==0) ? true : false) ;
            Z458TBM26_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z458TBM26_UPD_CNT"), ".", ",") ;
            n458TBM26_UPD_CNT = ((0==A458TBM26_UPD_CNT) ? true : false) ;
            Z449TBM26_LIST_ITEM_NAME = httpContext.cgiGet( "Z449TBM26_LIST_ITEM_NAME") ;
            n449TBM26_LIST_ITEM_NAME = ((GXutil.strcmp("", A449TBM26_LIST_ITEM_NAME)==0) ? true : false) ;
            Z450TBM26_INNER_VALUE = httpContext.cgiGet( "Z450TBM26_INNER_VALUE") ;
            n450TBM26_INNER_VALUE = ((GXutil.strcmp("", A450TBM26_INNER_VALUE)==0) ? true : false) ;
            Z451TBM26_DEL_FLG = httpContext.cgiGet( "Z451TBM26_DEL_FLG") ;
            n451TBM26_DEL_FLG = ((GXutil.strcmp("", A451TBM26_DEL_FLG)==0) ? true : false) ;
            Z454TBM26_CRT_PROG_NM = httpContext.cgiGet( "Z454TBM26_CRT_PROG_NM") ;
            n454TBM26_CRT_PROG_NM = ((GXutil.strcmp("", A454TBM26_CRT_PROG_NM)==0) ? true : false) ;
            Z457TBM26_UPD_PROG_NM = httpContext.cgiGet( "Z457TBM26_UPD_PROG_NM") ;
            n457TBM26_UPD_PROG_NM = ((GXutil.strcmp("", A457TBM26_UPD_PROG_NM)==0) ? true : false) ;
            O458TBM26_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O458TBM26_UPD_CNT"), ".", ",") ;
            n458TBM26_UPD_CNT = ((0==A458TBM26_UPD_CNT) ? true : false) ;
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
               A446TBM26_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
               A447TBM26_LIST_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
               A448TBM26_LIST_ITEM_NO = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
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
                     /* Execute user event: e110Y2 */
                     e110Y2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120Y2 */
                     e120Y2 ();
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
         /* Execute user event: e120Y2 */
         e120Y2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0Y33( ) ;
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
      disableAttributes0Y33( ) ;
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

   public void resetCaption0Y0( )
   {
   }

   public void e110Y2( )
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

   public void e120Y2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A447TBM26_LIST_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A448TBM26_LIST_ITEM_NO, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A449TBM26_LIST_ITEM_NAME + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A450TBM26_INNER_VALUE + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A451TBM26_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A452TBM26_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm26_sel_list_item_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A452TBM26_CRT_DATETIME", localUtil.ttoc( A452TBM26_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A453TBM26_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A454TBM26_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A455TBM26_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm26_sel_list_item_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A455TBM26_UPD_DATETIME", localUtil.ttoc( A455TBM26_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A456TBM26_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A457TBM26_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1166( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0Y33( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z452TBM26_CRT_DATETIME = T000Y3_A452TBM26_CRT_DATETIME[0] ;
            Z453TBM26_CRT_USER_ID = T000Y3_A453TBM26_CRT_USER_ID[0] ;
            Z455TBM26_UPD_DATETIME = T000Y3_A455TBM26_UPD_DATETIME[0] ;
            Z456TBM26_UPD_USER_ID = T000Y3_A456TBM26_UPD_USER_ID[0] ;
            Z458TBM26_UPD_CNT = T000Y3_A458TBM26_UPD_CNT[0] ;
            Z449TBM26_LIST_ITEM_NAME = T000Y3_A449TBM26_LIST_ITEM_NAME[0] ;
            Z450TBM26_INNER_VALUE = T000Y3_A450TBM26_INNER_VALUE[0] ;
            Z451TBM26_DEL_FLG = T000Y3_A451TBM26_DEL_FLG[0] ;
            Z454TBM26_CRT_PROG_NM = T000Y3_A454TBM26_CRT_PROG_NM[0] ;
            Z457TBM26_UPD_PROG_NM = T000Y3_A457TBM26_UPD_PROG_NM[0] ;
         }
         else
         {
            Z452TBM26_CRT_DATETIME = A452TBM26_CRT_DATETIME ;
            Z453TBM26_CRT_USER_ID = A453TBM26_CRT_USER_ID ;
            Z455TBM26_UPD_DATETIME = A455TBM26_UPD_DATETIME ;
            Z456TBM26_UPD_USER_ID = A456TBM26_UPD_USER_ID ;
            Z458TBM26_UPD_CNT = A458TBM26_UPD_CNT ;
            Z449TBM26_LIST_ITEM_NAME = A449TBM26_LIST_ITEM_NAME ;
            Z450TBM26_INNER_VALUE = A450TBM26_INNER_VALUE ;
            Z451TBM26_DEL_FLG = A451TBM26_DEL_FLG ;
            Z454TBM26_CRT_PROG_NM = A454TBM26_CRT_PROG_NM ;
            Z457TBM26_UPD_PROG_NM = A457TBM26_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z448TBM26_LIST_ITEM_NO = A448TBM26_LIST_ITEM_NO ;
         Z452TBM26_CRT_DATETIME = A452TBM26_CRT_DATETIME ;
         Z453TBM26_CRT_USER_ID = A453TBM26_CRT_USER_ID ;
         Z455TBM26_UPD_DATETIME = A455TBM26_UPD_DATETIME ;
         Z456TBM26_UPD_USER_ID = A456TBM26_UPD_USER_ID ;
         Z458TBM26_UPD_CNT = A458TBM26_UPD_CNT ;
         Z449TBM26_LIST_ITEM_NAME = A449TBM26_LIST_ITEM_NAME ;
         Z450TBM26_INNER_VALUE = A450TBM26_INNER_VALUE ;
         Z451TBM26_DEL_FLG = A451TBM26_DEL_FLG ;
         Z454TBM26_CRT_PROG_NM = A454TBM26_CRT_PROG_NM ;
         Z457TBM26_UPD_PROG_NM = A457TBM26_UPD_PROG_NM ;
         Z446TBM26_STUDY_ID = A446TBM26_STUDY_ID ;
         Z447TBM26_LIST_CD = A447TBM26_LIST_CD ;
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

   public void load0Y33( )
   {
      /* Using cursor T000Y5 */
      pr_default.execute(3, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A452TBM26_CRT_DATETIME = T000Y5_A452TBM26_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A452TBM26_CRT_DATETIME", localUtil.ttoc( A452TBM26_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n452TBM26_CRT_DATETIME = T000Y5_n452TBM26_CRT_DATETIME[0] ;
         A453TBM26_CRT_USER_ID = T000Y5_A453TBM26_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A453TBM26_CRT_USER_ID", A453TBM26_CRT_USER_ID);
         n453TBM26_CRT_USER_ID = T000Y5_n453TBM26_CRT_USER_ID[0] ;
         A455TBM26_UPD_DATETIME = T000Y5_A455TBM26_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A455TBM26_UPD_DATETIME", localUtil.ttoc( A455TBM26_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n455TBM26_UPD_DATETIME = T000Y5_n455TBM26_UPD_DATETIME[0] ;
         A456TBM26_UPD_USER_ID = T000Y5_A456TBM26_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A456TBM26_UPD_USER_ID", A456TBM26_UPD_USER_ID);
         n456TBM26_UPD_USER_ID = T000Y5_n456TBM26_UPD_USER_ID[0] ;
         A458TBM26_UPD_CNT = T000Y5_A458TBM26_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A458TBM26_UPD_CNT", GXutil.ltrim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)));
         n458TBM26_UPD_CNT = T000Y5_n458TBM26_UPD_CNT[0] ;
         A449TBM26_LIST_ITEM_NAME = T000Y5_A449TBM26_LIST_ITEM_NAME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A449TBM26_LIST_ITEM_NAME", A449TBM26_LIST_ITEM_NAME);
         n449TBM26_LIST_ITEM_NAME = T000Y5_n449TBM26_LIST_ITEM_NAME[0] ;
         A450TBM26_INNER_VALUE = T000Y5_A450TBM26_INNER_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A450TBM26_INNER_VALUE", A450TBM26_INNER_VALUE);
         n450TBM26_INNER_VALUE = T000Y5_n450TBM26_INNER_VALUE[0] ;
         A451TBM26_DEL_FLG = T000Y5_A451TBM26_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A451TBM26_DEL_FLG", A451TBM26_DEL_FLG);
         n451TBM26_DEL_FLG = T000Y5_n451TBM26_DEL_FLG[0] ;
         A454TBM26_CRT_PROG_NM = T000Y5_A454TBM26_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A454TBM26_CRT_PROG_NM", A454TBM26_CRT_PROG_NM);
         n454TBM26_CRT_PROG_NM = T000Y5_n454TBM26_CRT_PROG_NM[0] ;
         A457TBM26_UPD_PROG_NM = T000Y5_A457TBM26_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457TBM26_UPD_PROG_NM", A457TBM26_UPD_PROG_NM);
         n457TBM26_UPD_PROG_NM = T000Y5_n457TBM26_UPD_PROG_NM[0] ;
         zm0Y33( -8) ;
      }
      pr_default.close(3);
      onLoadActions0Y33( ) ;
   }

   public void onLoadActions0Y33( )
   {
      AV9Pgmname = "TBM26_SEL_LIST_ITEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0Y33( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM26_SEL_LIST_ITEM" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000Y4 */
      pr_default.execute(2, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError446 = 1 ;
         AnyError447 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'選択リスト項目マスタ・選択リストサブタイプ'", "ForeignKeyNotFound", 1, "TBM26_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError446 == 0 ) && ( AnyError447 == 0 ) )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A452TBM26_CRT_DATETIME) || (( A452TBM26_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A452TBM26_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A455TBM26_UPD_DATETIME) || (( A455TBM26_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A455TBM26_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0Y33( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A446TBM26_STUDY_ID ,
                         String A447TBM26_LIST_CD )
   {
      /* Using cursor T000Y6 */
      pr_default.execute(4, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD});
      if ( (pr_default.getStatus(4) == 101) )
      {
         AnyError446 = 1 ;
         AnyError447 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'選択リスト項目マスタ・選択リストサブタイプ'", "ForeignKeyNotFound", 1, "TBM26_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError446 == 0 ) && ( AnyError447 == 0 ) )
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

   public void getKey0Y33( )
   {
      /* Using cursor T000Y7 */
      pr_default.execute(5, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound33 = (short)(1) ;
      }
      else
      {
         RcdFound33 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000Y3 */
      pr_default.execute(1, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0Y33( 8) ;
         RcdFound33 = (short)(1) ;
         A448TBM26_LIST_ITEM_NO = T000Y3_A448TBM26_LIST_ITEM_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
         A452TBM26_CRT_DATETIME = T000Y3_A452TBM26_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A452TBM26_CRT_DATETIME", localUtil.ttoc( A452TBM26_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n452TBM26_CRT_DATETIME = T000Y3_n452TBM26_CRT_DATETIME[0] ;
         A453TBM26_CRT_USER_ID = T000Y3_A453TBM26_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A453TBM26_CRT_USER_ID", A453TBM26_CRT_USER_ID);
         n453TBM26_CRT_USER_ID = T000Y3_n453TBM26_CRT_USER_ID[0] ;
         A455TBM26_UPD_DATETIME = T000Y3_A455TBM26_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A455TBM26_UPD_DATETIME", localUtil.ttoc( A455TBM26_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n455TBM26_UPD_DATETIME = T000Y3_n455TBM26_UPD_DATETIME[0] ;
         A456TBM26_UPD_USER_ID = T000Y3_A456TBM26_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A456TBM26_UPD_USER_ID", A456TBM26_UPD_USER_ID);
         n456TBM26_UPD_USER_ID = T000Y3_n456TBM26_UPD_USER_ID[0] ;
         A458TBM26_UPD_CNT = T000Y3_A458TBM26_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A458TBM26_UPD_CNT", GXutil.ltrim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)));
         n458TBM26_UPD_CNT = T000Y3_n458TBM26_UPD_CNT[0] ;
         A449TBM26_LIST_ITEM_NAME = T000Y3_A449TBM26_LIST_ITEM_NAME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A449TBM26_LIST_ITEM_NAME", A449TBM26_LIST_ITEM_NAME);
         n449TBM26_LIST_ITEM_NAME = T000Y3_n449TBM26_LIST_ITEM_NAME[0] ;
         A450TBM26_INNER_VALUE = T000Y3_A450TBM26_INNER_VALUE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A450TBM26_INNER_VALUE", A450TBM26_INNER_VALUE);
         n450TBM26_INNER_VALUE = T000Y3_n450TBM26_INNER_VALUE[0] ;
         A451TBM26_DEL_FLG = T000Y3_A451TBM26_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A451TBM26_DEL_FLG", A451TBM26_DEL_FLG);
         n451TBM26_DEL_FLG = T000Y3_n451TBM26_DEL_FLG[0] ;
         A454TBM26_CRT_PROG_NM = T000Y3_A454TBM26_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A454TBM26_CRT_PROG_NM", A454TBM26_CRT_PROG_NM);
         n454TBM26_CRT_PROG_NM = T000Y3_n454TBM26_CRT_PROG_NM[0] ;
         A457TBM26_UPD_PROG_NM = T000Y3_A457TBM26_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A457TBM26_UPD_PROG_NM", A457TBM26_UPD_PROG_NM);
         n457TBM26_UPD_PROG_NM = T000Y3_n457TBM26_UPD_PROG_NM[0] ;
         A446TBM26_STUDY_ID = T000Y3_A446TBM26_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
         A447TBM26_LIST_CD = T000Y3_A447TBM26_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
         O458TBM26_UPD_CNT = A458TBM26_UPD_CNT ;
         n458TBM26_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A458TBM26_UPD_CNT", GXutil.ltrim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)));
         Z446TBM26_STUDY_ID = A446TBM26_STUDY_ID ;
         Z447TBM26_LIST_CD = A447TBM26_LIST_CD ;
         Z448TBM26_LIST_ITEM_NO = A448TBM26_LIST_ITEM_NO ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0Y33( ) ;
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound33 = (short)(0) ;
         initializeNonKey0Y33( ) ;
         sMode33 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode33 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0Y33( ) ;
      if ( RcdFound33 == 0 )
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
      RcdFound33 = (short)(0) ;
      /* Using cursor T000Y8 */
      pr_default.execute(6, new Object[] {new Long(A446TBM26_STUDY_ID), new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, A447TBM26_LIST_CD, new Long(A446TBM26_STUDY_ID), new Short(A448TBM26_LIST_ITEM_NO)});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000Y8_A446TBM26_STUDY_ID[0] < A446TBM26_STUDY_ID ) || ( T000Y8_A446TBM26_STUDY_ID[0] == A446TBM26_STUDY_ID ) && ( GXutil.strcmp(T000Y8_A447TBM26_LIST_CD[0], A447TBM26_LIST_CD) < 0 ) || ( GXutil.strcmp(T000Y8_A447TBM26_LIST_CD[0], A447TBM26_LIST_CD) == 0 ) && ( T000Y8_A446TBM26_STUDY_ID[0] == A446TBM26_STUDY_ID ) && ( T000Y8_A448TBM26_LIST_ITEM_NO[0] < A448TBM26_LIST_ITEM_NO ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000Y8_A446TBM26_STUDY_ID[0] > A446TBM26_STUDY_ID ) || ( T000Y8_A446TBM26_STUDY_ID[0] == A446TBM26_STUDY_ID ) && ( GXutil.strcmp(T000Y8_A447TBM26_LIST_CD[0], A447TBM26_LIST_CD) > 0 ) || ( GXutil.strcmp(T000Y8_A447TBM26_LIST_CD[0], A447TBM26_LIST_CD) == 0 ) && ( T000Y8_A446TBM26_STUDY_ID[0] == A446TBM26_STUDY_ID ) && ( T000Y8_A448TBM26_LIST_ITEM_NO[0] > A448TBM26_LIST_ITEM_NO ) ) )
         {
            A446TBM26_STUDY_ID = T000Y8_A446TBM26_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
            A447TBM26_LIST_CD = T000Y8_A447TBM26_LIST_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
            A448TBM26_LIST_ITEM_NO = T000Y8_A448TBM26_LIST_ITEM_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
            RcdFound33 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound33 = (short)(0) ;
      /* Using cursor T000Y9 */
      pr_default.execute(7, new Object[] {new Long(A446TBM26_STUDY_ID), new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, A447TBM26_LIST_CD, new Long(A446TBM26_STUDY_ID), new Short(A448TBM26_LIST_ITEM_NO)});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000Y9_A446TBM26_STUDY_ID[0] > A446TBM26_STUDY_ID ) || ( T000Y9_A446TBM26_STUDY_ID[0] == A446TBM26_STUDY_ID ) && ( GXutil.strcmp(T000Y9_A447TBM26_LIST_CD[0], A447TBM26_LIST_CD) > 0 ) || ( GXutil.strcmp(T000Y9_A447TBM26_LIST_CD[0], A447TBM26_LIST_CD) == 0 ) && ( T000Y9_A446TBM26_STUDY_ID[0] == A446TBM26_STUDY_ID ) && ( T000Y9_A448TBM26_LIST_ITEM_NO[0] > A448TBM26_LIST_ITEM_NO ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000Y9_A446TBM26_STUDY_ID[0] < A446TBM26_STUDY_ID ) || ( T000Y9_A446TBM26_STUDY_ID[0] == A446TBM26_STUDY_ID ) && ( GXutil.strcmp(T000Y9_A447TBM26_LIST_CD[0], A447TBM26_LIST_CD) < 0 ) || ( GXutil.strcmp(T000Y9_A447TBM26_LIST_CD[0], A447TBM26_LIST_CD) == 0 ) && ( T000Y9_A446TBM26_STUDY_ID[0] == A446TBM26_STUDY_ID ) && ( T000Y9_A448TBM26_LIST_ITEM_NO[0] < A448TBM26_LIST_ITEM_NO ) ) )
         {
            A446TBM26_STUDY_ID = T000Y9_A446TBM26_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
            A447TBM26_LIST_CD = T000Y9_A447TBM26_LIST_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
            A448TBM26_LIST_ITEM_NO = T000Y9_A448TBM26_LIST_ITEM_NO[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
            RcdFound33 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0Y33( ) ;
      if ( RcdFound33 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM26_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A446TBM26_STUDY_ID != Z446TBM26_STUDY_ID ) || ( GXutil.strcmp(A447TBM26_LIST_CD, Z447TBM26_LIST_CD) != 0 ) || ( A448TBM26_LIST_ITEM_NO != Z448TBM26_LIST_ITEM_NO ) )
         {
            A446TBM26_STUDY_ID = Z446TBM26_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
            A447TBM26_LIST_CD = Z447TBM26_LIST_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
            A448TBM26_LIST_ITEM_NO = Z448TBM26_LIST_ITEM_NO ;
            httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM26_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update0Y33( ) ;
            GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A446TBM26_STUDY_ID != Z446TBM26_STUDY_ID ) || ( GXutil.strcmp(A447TBM26_LIST_CD, Z447TBM26_LIST_CD) != 0 ) || ( A448TBM26_LIST_ITEM_NO != Z448TBM26_LIST_ITEM_NO ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0Y33( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM26_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0Y33( ) ;
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
      if ( ( A446TBM26_STUDY_ID != Z446TBM26_STUDY_ID ) || ( GXutil.strcmp(A447TBM26_LIST_CD, Z447TBM26_LIST_CD) != 0 ) || ( A448TBM26_LIST_ITEM_NO != Z448TBM26_LIST_ITEM_NO ) )
      {
         A446TBM26_STUDY_ID = Z446TBM26_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
         A447TBM26_LIST_CD = Z447TBM26_LIST_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
         A448TBM26_LIST_ITEM_NO = Z448TBM26_LIST_ITEM_NO ;
         httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM26_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
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
      if ( RcdFound33 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM26_STUDY_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBM26_LIST_ITEM_NAME_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0Y33( ) ;
      if ( RcdFound33 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM26_LIST_ITEM_NAME_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0Y33( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound33 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM26_LIST_ITEM_NAME_Internalname ;
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
      if ( RcdFound33 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM26_LIST_ITEM_NAME_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0Y33( ) ;
      if ( RcdFound33 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound33 != 0 )
         {
            scanNext0Y33( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM26_LIST_ITEM_NAME_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0Y33( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0Y33( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000Y2 */
         pr_default.execute(0, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM26_SEL_LIST_ITEM"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z452TBM26_CRT_DATETIME.equals( T000Y2_A452TBM26_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z453TBM26_CRT_USER_ID, T000Y2_A453TBM26_CRT_USER_ID[0]) != 0 ) || !( Z455TBM26_UPD_DATETIME.equals( T000Y2_A455TBM26_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z456TBM26_UPD_USER_ID, T000Y2_A456TBM26_UPD_USER_ID[0]) != 0 ) || ( Z458TBM26_UPD_CNT != T000Y2_A458TBM26_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z449TBM26_LIST_ITEM_NAME, T000Y2_A449TBM26_LIST_ITEM_NAME[0]) != 0 ) || ( GXutil.strcmp(Z450TBM26_INNER_VALUE, T000Y2_A450TBM26_INNER_VALUE[0]) != 0 ) || ( GXutil.strcmp(Z451TBM26_DEL_FLG, T000Y2_A451TBM26_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z454TBM26_CRT_PROG_NM, T000Y2_A454TBM26_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z457TBM26_UPD_PROG_NM, T000Y2_A457TBM26_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM26_SEL_LIST_ITEM"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0Y33( )
   {
      beforeValidate0Y33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Y33( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0Y33( 0) ;
         checkOptimisticConcurrency0Y33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Y33( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0Y33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Y10 */
                  pr_default.execute(8, new Object[] {new Short(A448TBM26_LIST_ITEM_NO), new Boolean(n452TBM26_CRT_DATETIME), A452TBM26_CRT_DATETIME, new Boolean(n453TBM26_CRT_USER_ID), A453TBM26_CRT_USER_ID, new Boolean(n455TBM26_UPD_DATETIME), A455TBM26_UPD_DATETIME, new Boolean(n456TBM26_UPD_USER_ID), A456TBM26_UPD_USER_ID, new Boolean(n458TBM26_UPD_CNT), new Long(A458TBM26_UPD_CNT), new Boolean(n449TBM26_LIST_ITEM_NAME), A449TBM26_LIST_ITEM_NAME, new Boolean(n450TBM26_INNER_VALUE), A450TBM26_INNER_VALUE, new Boolean(n451TBM26_DEL_FLG), A451TBM26_DEL_FLG, new Boolean(n454TBM26_CRT_PROG_NM), A454TBM26_CRT_PROG_NM, new Boolean(n457TBM26_UPD_PROG_NM), A457TBM26_UPD_PROG_NM, new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD});
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
                        resetCaption0Y0( ) ;
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
            load0Y33( ) ;
         }
         endLevel0Y33( ) ;
      }
      closeExtendedTableCursors0Y33( ) ;
   }

   public void update0Y33( )
   {
      beforeValidate0Y33( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0Y33( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Y33( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0Y33( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0Y33( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000Y11 */
                  pr_default.execute(9, new Object[] {new Boolean(n452TBM26_CRT_DATETIME), A452TBM26_CRT_DATETIME, new Boolean(n453TBM26_CRT_USER_ID), A453TBM26_CRT_USER_ID, new Boolean(n455TBM26_UPD_DATETIME), A455TBM26_UPD_DATETIME, new Boolean(n456TBM26_UPD_USER_ID), A456TBM26_UPD_USER_ID, new Boolean(n458TBM26_UPD_CNT), new Long(A458TBM26_UPD_CNT), new Boolean(n449TBM26_LIST_ITEM_NAME), A449TBM26_LIST_ITEM_NAME, new Boolean(n450TBM26_INNER_VALUE), A450TBM26_INNER_VALUE, new Boolean(n451TBM26_DEL_FLG), A451TBM26_DEL_FLG, new Boolean(n454TBM26_CRT_PROG_NM), A454TBM26_CRT_PROG_NM, new Boolean(n457TBM26_UPD_PROG_NM), A457TBM26_UPD_PROG_NM, new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM26_SEL_LIST_ITEM"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0Y33( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption0Y0( ) ;
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
         endLevel0Y33( ) ;
      }
      closeExtendedTableCursors0Y33( ) ;
   }

   public void deferredUpdate0Y33( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0Y33( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0Y33( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0Y33( ) ;
         afterConfirm0Y33( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0Y33( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000Y12 */
               pr_default.execute(10, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD, new Short(A448TBM26_LIST_ITEM_NO)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound33 == 0 )
                     {
                        initAll0Y33( ) ;
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
                     resetCaption0Y0( ) ;
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
      sMode33 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0Y33( ) ;
      Gx_mode = sMode33 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0Y33( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM26_SEL_LIST_ITEM" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0Y33( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0Y33( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm26_sel_list_item");
         if ( AnyError == 0 )
         {
            confirmValues0Y0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm26_sel_list_item");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0Y33( )
   {
      /* Using cursor T000Y13 */
      pr_default.execute(11);
      RcdFound33 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A446TBM26_STUDY_ID = T000Y13_A446TBM26_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
         A447TBM26_LIST_CD = T000Y13_A447TBM26_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
         A448TBM26_LIST_ITEM_NO = T000Y13_A448TBM26_LIST_ITEM_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0Y33( )
   {
      pr_default.readNext(11);
      RcdFound33 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound33 = (short)(1) ;
         A446TBM26_STUDY_ID = T000Y13_A446TBM26_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
         A447TBM26_LIST_CD = T000Y13_A447TBM26_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
         A448TBM26_LIST_ITEM_NO = T000Y13_A448TBM26_LIST_ITEM_NO[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
      }
   }

   public void scanEnd0Y33( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0Y33( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0Y33( )
   {
      /* Before Insert Rules */
      A452TBM26_CRT_DATETIME = GXutil.now( ) ;
      n452TBM26_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A452TBM26_CRT_DATETIME", localUtil.ttoc( A452TBM26_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A453TBM26_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm26_sel_list_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A453TBM26_CRT_USER_ID = GXt_char3 ;
      n453TBM26_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A453TBM26_CRT_USER_ID", A453TBM26_CRT_USER_ID);
      A455TBM26_UPD_DATETIME = GXutil.now( ) ;
      n455TBM26_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A455TBM26_UPD_DATETIME", localUtil.ttoc( A455TBM26_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A456TBM26_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm26_sel_list_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A456TBM26_UPD_USER_ID = GXt_char3 ;
      n456TBM26_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456TBM26_UPD_USER_ID", A456TBM26_UPD_USER_ID);
      A458TBM26_UPD_CNT = (long)(O458TBM26_UPD_CNT+1) ;
      n458TBM26_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A458TBM26_UPD_CNT", GXutil.ltrim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0Y33( )
   {
      /* Before Update Rules */
      A455TBM26_UPD_DATETIME = GXutil.now( ) ;
      n455TBM26_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A455TBM26_UPD_DATETIME", localUtil.ttoc( A455TBM26_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A456TBM26_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm26_sel_list_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A456TBM26_UPD_USER_ID = GXt_char3 ;
      n456TBM26_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456TBM26_UPD_USER_ID", A456TBM26_UPD_USER_ID);
      A458TBM26_UPD_CNT = (long)(O458TBM26_UPD_CNT+1) ;
      n458TBM26_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A458TBM26_UPD_CNT", GXutil.ltrim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0Y33( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0Y33( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0Y33( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0Y33( )
   {
      edtTBM26_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_STUDY_ID_Enabled, 5, 0)));
      edtTBM26_LIST_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_LIST_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_LIST_CD_Enabled, 5, 0)));
      edtTBM26_LIST_ITEM_NO_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_LIST_ITEM_NO_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_LIST_ITEM_NO_Enabled, 5, 0)));
      edtTBM26_LIST_ITEM_NAME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_LIST_ITEM_NAME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_LIST_ITEM_NAME_Enabled, 5, 0)));
      edtTBM26_INNER_VALUE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_INNER_VALUE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_INNER_VALUE_Enabled, 5, 0)));
      edtTBM26_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_DEL_FLG_Enabled, 5, 0)));
      edtTBM26_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM26_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM26_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM26_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM26_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM26_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM26_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM26_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM26_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0Y0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "選択リスト項目マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm26_sel_list_item") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0Y33( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z446TBM26_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z446TBM26_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z447TBM26_LIST_CD", GXutil.rtrim( Z447TBM26_LIST_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z448TBM26_LIST_ITEM_NO", GXutil.ltrim( localUtil.ntoc( Z448TBM26_LIST_ITEM_NO, (byte)(3), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z452TBM26_CRT_DATETIME", localUtil.ttoc( Z452TBM26_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z453TBM26_CRT_USER_ID", GXutil.rtrim( Z453TBM26_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z455TBM26_UPD_DATETIME", localUtil.ttoc( Z455TBM26_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z456TBM26_UPD_USER_ID", GXutil.rtrim( Z456TBM26_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z458TBM26_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z458TBM26_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z449TBM26_LIST_ITEM_NAME", GXutil.rtrim( Z449TBM26_LIST_ITEM_NAME));
      GxWebStd.gx_hidden_field( httpContext, "Z450TBM26_INNER_VALUE", GXutil.rtrim( Z450TBM26_INNER_VALUE));
      GxWebStd.gx_hidden_field( httpContext, "Z451TBM26_DEL_FLG", GXutil.rtrim( Z451TBM26_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z454TBM26_CRT_PROG_NM", GXutil.rtrim( Z454TBM26_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z457TBM26_UPD_PROG_NM", GXutil.rtrim( Z457TBM26_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O458TBM26_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O458TBM26_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0Y33( )
   {
      A452TBM26_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n452TBM26_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A452TBM26_CRT_DATETIME", localUtil.ttoc( A452TBM26_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n452TBM26_CRT_DATETIME = (GXutil.nullDate().equals(A452TBM26_CRT_DATETIME) ? true : false) ;
      A453TBM26_CRT_USER_ID = "" ;
      n453TBM26_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A453TBM26_CRT_USER_ID", A453TBM26_CRT_USER_ID);
      n453TBM26_CRT_USER_ID = ((GXutil.strcmp("", A453TBM26_CRT_USER_ID)==0) ? true : false) ;
      A455TBM26_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n455TBM26_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A455TBM26_UPD_DATETIME", localUtil.ttoc( A455TBM26_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n455TBM26_UPD_DATETIME = (GXutil.nullDate().equals(A455TBM26_UPD_DATETIME) ? true : false) ;
      A456TBM26_UPD_USER_ID = "" ;
      n456TBM26_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456TBM26_UPD_USER_ID", A456TBM26_UPD_USER_ID);
      n456TBM26_UPD_USER_ID = ((GXutil.strcmp("", A456TBM26_UPD_USER_ID)==0) ? true : false) ;
      A458TBM26_UPD_CNT = 0 ;
      n458TBM26_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A458TBM26_UPD_CNT", GXutil.ltrim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)));
      n458TBM26_UPD_CNT = ((0==A458TBM26_UPD_CNT) ? true : false) ;
      A449TBM26_LIST_ITEM_NAME = "" ;
      n449TBM26_LIST_ITEM_NAME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A449TBM26_LIST_ITEM_NAME", A449TBM26_LIST_ITEM_NAME);
      n449TBM26_LIST_ITEM_NAME = ((GXutil.strcmp("", A449TBM26_LIST_ITEM_NAME)==0) ? true : false) ;
      A450TBM26_INNER_VALUE = "" ;
      n450TBM26_INNER_VALUE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A450TBM26_INNER_VALUE", A450TBM26_INNER_VALUE);
      n450TBM26_INNER_VALUE = ((GXutil.strcmp("", A450TBM26_INNER_VALUE)==0) ? true : false) ;
      A451TBM26_DEL_FLG = "" ;
      n451TBM26_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A451TBM26_DEL_FLG", A451TBM26_DEL_FLG);
      n451TBM26_DEL_FLG = ((GXutil.strcmp("", A451TBM26_DEL_FLG)==0) ? true : false) ;
      A454TBM26_CRT_PROG_NM = "" ;
      n454TBM26_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A454TBM26_CRT_PROG_NM", A454TBM26_CRT_PROG_NM);
      n454TBM26_CRT_PROG_NM = ((GXutil.strcmp("", A454TBM26_CRT_PROG_NM)==0) ? true : false) ;
      A457TBM26_UPD_PROG_NM = "" ;
      n457TBM26_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A457TBM26_UPD_PROG_NM", A457TBM26_UPD_PROG_NM);
      n457TBM26_UPD_PROG_NM = ((GXutil.strcmp("", A457TBM26_UPD_PROG_NM)==0) ? true : false) ;
      O458TBM26_UPD_CNT = A458TBM26_UPD_CNT ;
      n458TBM26_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A458TBM26_UPD_CNT", GXutil.ltrim( GXutil.str( A458TBM26_UPD_CNT, 10, 0)));
   }

   public void initAll0Y33( )
   {
      A446TBM26_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A446TBM26_STUDY_ID", GXutil.ltrim( GXutil.str( A446TBM26_STUDY_ID, 10, 0)));
      A447TBM26_LIST_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A447TBM26_LIST_CD", A447TBM26_LIST_CD);
      A448TBM26_LIST_ITEM_NO = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A448TBM26_LIST_ITEM_NO", GXutil.ltrim( GXutil.str( A448TBM26_LIST_ITEM_NO, 3, 0)));
      initializeNonKey0Y33( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1456645");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm26_sel_list_item.js", "?1456645");
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
      lblTextblocktbm26_study_id_Internalname = "TEXTBLOCKTBM26_STUDY_ID" ;
      edtTBM26_STUDY_ID_Internalname = "TBM26_STUDY_ID" ;
      lblTextblocktbm26_list_cd_Internalname = "TEXTBLOCKTBM26_LIST_CD" ;
      edtTBM26_LIST_CD_Internalname = "TBM26_LIST_CD" ;
      lblTextblocktbm26_list_item_no_Internalname = "TEXTBLOCKTBM26_LIST_ITEM_NO" ;
      edtTBM26_LIST_ITEM_NO_Internalname = "TBM26_LIST_ITEM_NO" ;
      lblTextblocktbm26_list_item_name_Internalname = "TEXTBLOCKTBM26_LIST_ITEM_NAME" ;
      edtTBM26_LIST_ITEM_NAME_Internalname = "TBM26_LIST_ITEM_NAME" ;
      lblTextblocktbm26_inner_value_Internalname = "TEXTBLOCKTBM26_INNER_VALUE" ;
      edtTBM26_INNER_VALUE_Internalname = "TBM26_INNER_VALUE" ;
      lblTextblocktbm26_del_flg_Internalname = "TEXTBLOCKTBM26_DEL_FLG" ;
      edtTBM26_DEL_FLG_Internalname = "TBM26_DEL_FLG" ;
      lblTextblocktbm26_crt_datetime_Internalname = "TEXTBLOCKTBM26_CRT_DATETIME" ;
      edtTBM26_CRT_DATETIME_Internalname = "TBM26_CRT_DATETIME" ;
      lblTextblocktbm26_crt_user_id_Internalname = "TEXTBLOCKTBM26_CRT_USER_ID" ;
      edtTBM26_CRT_USER_ID_Internalname = "TBM26_CRT_USER_ID" ;
      lblTextblocktbm26_crt_prog_nm_Internalname = "TEXTBLOCKTBM26_CRT_PROG_NM" ;
      edtTBM26_CRT_PROG_NM_Internalname = "TBM26_CRT_PROG_NM" ;
      lblTextblocktbm26_upd_datetime_Internalname = "TEXTBLOCKTBM26_UPD_DATETIME" ;
      edtTBM26_UPD_DATETIME_Internalname = "TBM26_UPD_DATETIME" ;
      lblTextblocktbm26_upd_user_id_Internalname = "TEXTBLOCKTBM26_UPD_USER_ID" ;
      edtTBM26_UPD_USER_ID_Internalname = "TBM26_UPD_USER_ID" ;
      lblTextblocktbm26_upd_prog_nm_Internalname = "TEXTBLOCKTBM26_UPD_PROG_NM" ;
      edtTBM26_UPD_PROG_NM_Internalname = "TBM26_UPD_PROG_NM" ;
      lblTextblocktbm26_upd_cnt_Internalname = "TEXTBLOCKTBM26_UPD_CNT" ;
      edtTBM26_UPD_CNT_Internalname = "TBM26_UPD_CNT" ;
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
      edtTBM26_UPD_CNT_Jsonclick = "" ;
      edtTBM26_UPD_CNT_Enabled = 1 ;
      edtTBM26_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM26_UPD_PROG_NM_Enabled = 1 ;
      edtTBM26_UPD_USER_ID_Jsonclick = "" ;
      edtTBM26_UPD_USER_ID_Enabled = 1 ;
      edtTBM26_UPD_DATETIME_Jsonclick = "" ;
      edtTBM26_UPD_DATETIME_Enabled = 1 ;
      edtTBM26_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM26_CRT_PROG_NM_Enabled = 1 ;
      edtTBM26_CRT_USER_ID_Jsonclick = "" ;
      edtTBM26_CRT_USER_ID_Enabled = 1 ;
      edtTBM26_CRT_DATETIME_Jsonclick = "" ;
      edtTBM26_CRT_DATETIME_Enabled = 1 ;
      edtTBM26_DEL_FLG_Jsonclick = "" ;
      edtTBM26_DEL_FLG_Enabled = 1 ;
      edtTBM26_INNER_VALUE_Jsonclick = "" ;
      edtTBM26_INNER_VALUE_Enabled = 1 ;
      edtTBM26_LIST_ITEM_NAME_Jsonclick = "" ;
      edtTBM26_LIST_ITEM_NAME_Enabled = 1 ;
      edtTBM26_LIST_ITEM_NO_Jsonclick = "" ;
      edtTBM26_LIST_ITEM_NO_Enabled = 1 ;
      edtTBM26_LIST_CD_Jsonclick = "" ;
      edtTBM26_LIST_CD_Enabled = 1 ;
      edtTBM26_STUDY_ID_Jsonclick = "" ;
      edtTBM26_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm26_crt_user_id0Y33( String Gx_mode )
   {
      GXt_char3 = A453TBM26_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm26_sel_list_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A453TBM26_CRT_USER_ID = GXt_char3 ;
      n453TBM26_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A453TBM26_CRT_USER_ID", A453TBM26_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A453TBM26_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm26_upd_user_id0Y33( String Gx_mode )
   {
      GXt_char3 = A456TBM26_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm26_sel_list_item_impl.this.GXt_char3 = GXv_char4[0] ;
      A456TBM26_UPD_USER_ID = GXt_char3 ;
      n456TBM26_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A456TBM26_UPD_USER_ID", A456TBM26_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A456TBM26_UPD_USER_ID))+"\"");
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
      /* Using cursor T000Y14 */
      pr_default.execute(12, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD});
      if ( (pr_default.getStatus(12) == 101) )
      {
         AnyError446 = 1 ;
         AnyError447 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'選択リスト項目マスタ・選択リストサブタイプ'", "ForeignKeyNotFound", 1, "TBM26_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ( AnyError446 == 0 ) && ( AnyError447 == 0 ) )
      {
      }
      pr_default.close(12);
      GX_FocusControl = edtTBM26_LIST_ITEM_NAME_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm26_list_cd( long GX_Parm1 ,
                                    String GX_Parm2 )
   {
      A446TBM26_STUDY_ID = GX_Parm1 ;
      A447TBM26_LIST_CD = GX_Parm2 ;
      /* Using cursor T000Y14 */
      pr_default.execute(12, new Object[] {new Long(A446TBM26_STUDY_ID), A447TBM26_LIST_CD});
      if ( (pr_default.getStatus(12) == 101) )
      {
         AnyError446 = 1 ;
         AnyError447 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'選択リスト項目マスタ・選択リストサブタイプ'", "ForeignKeyNotFound", 1, "TBM26_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM26_STUDY_ID_Internalname ;
      }
      if ( ( AnyError446 == 0 ) && ( AnyError447 == 0 ) )
      {
      }
      pr_default.close(12);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbm26_list_item_no( long GX_Parm1 ,
                                         String GX_Parm2 ,
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
                                         String GX_Parm13 )
   {
      A446TBM26_STUDY_ID = GX_Parm1 ;
      A447TBM26_LIST_CD = GX_Parm2 ;
      A448TBM26_LIST_ITEM_NO = GX_Parm3 ;
      A452TBM26_CRT_DATETIME = GX_Parm4 ;
      n452TBM26_CRT_DATETIME = false ;
      A453TBM26_CRT_USER_ID = GX_Parm5 ;
      n453TBM26_CRT_USER_ID = false ;
      A455TBM26_UPD_DATETIME = GX_Parm6 ;
      n455TBM26_UPD_DATETIME = false ;
      A456TBM26_UPD_USER_ID = GX_Parm7 ;
      n456TBM26_UPD_USER_ID = false ;
      A458TBM26_UPD_CNT = GX_Parm8 ;
      n458TBM26_UPD_CNT = false ;
      A449TBM26_LIST_ITEM_NAME = GX_Parm9 ;
      n449TBM26_LIST_ITEM_NAME = false ;
      A450TBM26_INNER_VALUE = GX_Parm10 ;
      n450TBM26_INNER_VALUE = false ;
      A451TBM26_DEL_FLG = GX_Parm11 ;
      n451TBM26_DEL_FLG = false ;
      A454TBM26_CRT_PROG_NM = GX_Parm12 ;
      n454TBM26_CRT_PROG_NM = false ;
      A457TBM26_UPD_PROG_NM = GX_Parm13 ;
      n457TBM26_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A452TBM26_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A453TBM26_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A455TBM26_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A456TBM26_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A458TBM26_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A449TBM26_LIST_ITEM_NAME));
      isValidOutput.add(GXutil.rtrim( A450TBM26_INNER_VALUE));
      isValidOutput.add(GXutil.rtrim( A451TBM26_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A454TBM26_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A457TBM26_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z446TBM26_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z447TBM26_LIST_CD));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z448TBM26_LIST_ITEM_NO, (byte)(3), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z452TBM26_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z453TBM26_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z455TBM26_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z456TBM26_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z458TBM26_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z449TBM26_LIST_ITEM_NAME));
      isValidOutput.add(GXutil.rtrim( Z450TBM26_INNER_VALUE));
      isValidOutput.add(GXutil.rtrim( Z451TBM26_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z454TBM26_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z457TBM26_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O458TBM26_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1166 */
                  S1166 ();
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
      A447TBM26_LIST_CD = "" ;
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
      lblTextblocktbm26_study_id_Jsonclick = "" ;
      lblTextblocktbm26_list_cd_Jsonclick = "" ;
      lblTextblocktbm26_list_item_no_Jsonclick = "" ;
      lblTextblocktbm26_list_item_name_Jsonclick = "" ;
      A449TBM26_LIST_ITEM_NAME = "" ;
      lblTextblocktbm26_inner_value_Jsonclick = "" ;
      A450TBM26_INNER_VALUE = "" ;
      lblTextblocktbm26_del_flg_Jsonclick = "" ;
      A451TBM26_DEL_FLG = "" ;
      lblTextblocktbm26_crt_datetime_Jsonclick = "" ;
      A452TBM26_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm26_crt_user_id_Jsonclick = "" ;
      A453TBM26_CRT_USER_ID = "" ;
      lblTextblocktbm26_crt_prog_nm_Jsonclick = "" ;
      A454TBM26_CRT_PROG_NM = "" ;
      lblTextblocktbm26_upd_datetime_Jsonclick = "" ;
      A455TBM26_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm26_upd_user_id_Jsonclick = "" ;
      A456TBM26_UPD_USER_ID = "" ;
      lblTextblocktbm26_upd_prog_nm_Jsonclick = "" ;
      A457TBM26_UPD_PROG_NM = "" ;
      lblTextblocktbm26_upd_cnt_Jsonclick = "" ;
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
      Z447TBM26_LIST_CD = "" ;
      Z452TBM26_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z453TBM26_CRT_USER_ID = "" ;
      Z455TBM26_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z456TBM26_UPD_USER_ID = "" ;
      Z449TBM26_LIST_ITEM_NAME = "" ;
      Z450TBM26_INNER_VALUE = "" ;
      Z451TBM26_DEL_FLG = "" ;
      Z454TBM26_CRT_PROG_NM = "" ;
      Z457TBM26_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000Y5_A448TBM26_LIST_ITEM_NO = new short[1] ;
      T000Y5_A452TBM26_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y5_n452TBM26_CRT_DATETIME = new boolean[] {false} ;
      T000Y5_A453TBM26_CRT_USER_ID = new String[] {""} ;
      T000Y5_n453TBM26_CRT_USER_ID = new boolean[] {false} ;
      T000Y5_A455TBM26_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y5_n455TBM26_UPD_DATETIME = new boolean[] {false} ;
      T000Y5_A456TBM26_UPD_USER_ID = new String[] {""} ;
      T000Y5_n456TBM26_UPD_USER_ID = new boolean[] {false} ;
      T000Y5_A458TBM26_UPD_CNT = new long[1] ;
      T000Y5_n458TBM26_UPD_CNT = new boolean[] {false} ;
      T000Y5_A449TBM26_LIST_ITEM_NAME = new String[] {""} ;
      T000Y5_n449TBM26_LIST_ITEM_NAME = new boolean[] {false} ;
      T000Y5_A450TBM26_INNER_VALUE = new String[] {""} ;
      T000Y5_n450TBM26_INNER_VALUE = new boolean[] {false} ;
      T000Y5_A451TBM26_DEL_FLG = new String[] {""} ;
      T000Y5_n451TBM26_DEL_FLG = new boolean[] {false} ;
      T000Y5_A454TBM26_CRT_PROG_NM = new String[] {""} ;
      T000Y5_n454TBM26_CRT_PROG_NM = new boolean[] {false} ;
      T000Y5_A457TBM26_UPD_PROG_NM = new String[] {""} ;
      T000Y5_n457TBM26_UPD_PROG_NM = new boolean[] {false} ;
      T000Y5_A446TBM26_STUDY_ID = new long[1] ;
      T000Y5_A447TBM26_LIST_CD = new String[] {""} ;
      T000Y4_A446TBM26_STUDY_ID = new long[1] ;
      T000Y6_A446TBM26_STUDY_ID = new long[1] ;
      T000Y7_A446TBM26_STUDY_ID = new long[1] ;
      T000Y7_A447TBM26_LIST_CD = new String[] {""} ;
      T000Y7_A448TBM26_LIST_ITEM_NO = new short[1] ;
      T000Y3_A448TBM26_LIST_ITEM_NO = new short[1] ;
      T000Y3_A452TBM26_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y3_n452TBM26_CRT_DATETIME = new boolean[] {false} ;
      T000Y3_A453TBM26_CRT_USER_ID = new String[] {""} ;
      T000Y3_n453TBM26_CRT_USER_ID = new boolean[] {false} ;
      T000Y3_A455TBM26_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y3_n455TBM26_UPD_DATETIME = new boolean[] {false} ;
      T000Y3_A456TBM26_UPD_USER_ID = new String[] {""} ;
      T000Y3_n456TBM26_UPD_USER_ID = new boolean[] {false} ;
      T000Y3_A458TBM26_UPD_CNT = new long[1] ;
      T000Y3_n458TBM26_UPD_CNT = new boolean[] {false} ;
      T000Y3_A449TBM26_LIST_ITEM_NAME = new String[] {""} ;
      T000Y3_n449TBM26_LIST_ITEM_NAME = new boolean[] {false} ;
      T000Y3_A450TBM26_INNER_VALUE = new String[] {""} ;
      T000Y3_n450TBM26_INNER_VALUE = new boolean[] {false} ;
      T000Y3_A451TBM26_DEL_FLG = new String[] {""} ;
      T000Y3_n451TBM26_DEL_FLG = new boolean[] {false} ;
      T000Y3_A454TBM26_CRT_PROG_NM = new String[] {""} ;
      T000Y3_n454TBM26_CRT_PROG_NM = new boolean[] {false} ;
      T000Y3_A457TBM26_UPD_PROG_NM = new String[] {""} ;
      T000Y3_n457TBM26_UPD_PROG_NM = new boolean[] {false} ;
      T000Y3_A446TBM26_STUDY_ID = new long[1] ;
      T000Y3_A447TBM26_LIST_CD = new String[] {""} ;
      sMode33 = "" ;
      T000Y8_A446TBM26_STUDY_ID = new long[1] ;
      T000Y8_A447TBM26_LIST_CD = new String[] {""} ;
      T000Y8_A448TBM26_LIST_ITEM_NO = new short[1] ;
      T000Y9_A446TBM26_STUDY_ID = new long[1] ;
      T000Y9_A447TBM26_LIST_CD = new String[] {""} ;
      T000Y9_A448TBM26_LIST_ITEM_NO = new short[1] ;
      T000Y2_A448TBM26_LIST_ITEM_NO = new short[1] ;
      T000Y2_A452TBM26_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y2_n452TBM26_CRT_DATETIME = new boolean[] {false} ;
      T000Y2_A453TBM26_CRT_USER_ID = new String[] {""} ;
      T000Y2_n453TBM26_CRT_USER_ID = new boolean[] {false} ;
      T000Y2_A455TBM26_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000Y2_n455TBM26_UPD_DATETIME = new boolean[] {false} ;
      T000Y2_A456TBM26_UPD_USER_ID = new String[] {""} ;
      T000Y2_n456TBM26_UPD_USER_ID = new boolean[] {false} ;
      T000Y2_A458TBM26_UPD_CNT = new long[1] ;
      T000Y2_n458TBM26_UPD_CNT = new boolean[] {false} ;
      T000Y2_A449TBM26_LIST_ITEM_NAME = new String[] {""} ;
      T000Y2_n449TBM26_LIST_ITEM_NAME = new boolean[] {false} ;
      T000Y2_A450TBM26_INNER_VALUE = new String[] {""} ;
      T000Y2_n450TBM26_INNER_VALUE = new boolean[] {false} ;
      T000Y2_A451TBM26_DEL_FLG = new String[] {""} ;
      T000Y2_n451TBM26_DEL_FLG = new boolean[] {false} ;
      T000Y2_A454TBM26_CRT_PROG_NM = new String[] {""} ;
      T000Y2_n454TBM26_CRT_PROG_NM = new boolean[] {false} ;
      T000Y2_A457TBM26_UPD_PROG_NM = new String[] {""} ;
      T000Y2_n457TBM26_UPD_PROG_NM = new boolean[] {false} ;
      T000Y2_A446TBM26_STUDY_ID = new long[1] ;
      T000Y2_A447TBM26_LIST_CD = new String[] {""} ;
      T000Y13_A446TBM26_STUDY_ID = new long[1] ;
      T000Y13_A447TBM26_LIST_CD = new String[] {""} ;
      T000Y13_A448TBM26_LIST_ITEM_NO = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      T000Y14_A446TBM26_STUDY_ID = new long[1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm26_sel_list_item__default(),
         new Object[] {
             new Object[] {
            T000Y2_A448TBM26_LIST_ITEM_NO, T000Y2_A452TBM26_CRT_DATETIME, T000Y2_n452TBM26_CRT_DATETIME, T000Y2_A453TBM26_CRT_USER_ID, T000Y2_n453TBM26_CRT_USER_ID, T000Y2_A455TBM26_UPD_DATETIME, T000Y2_n455TBM26_UPD_DATETIME, T000Y2_A456TBM26_UPD_USER_ID, T000Y2_n456TBM26_UPD_USER_ID, T000Y2_A458TBM26_UPD_CNT,
            T000Y2_n458TBM26_UPD_CNT, T000Y2_A449TBM26_LIST_ITEM_NAME, T000Y2_n449TBM26_LIST_ITEM_NAME, T000Y2_A450TBM26_INNER_VALUE, T000Y2_n450TBM26_INNER_VALUE, T000Y2_A451TBM26_DEL_FLG, T000Y2_n451TBM26_DEL_FLG, T000Y2_A454TBM26_CRT_PROG_NM, T000Y2_n454TBM26_CRT_PROG_NM, T000Y2_A457TBM26_UPD_PROG_NM,
            T000Y2_n457TBM26_UPD_PROG_NM, T000Y2_A446TBM26_STUDY_ID, T000Y2_A447TBM26_LIST_CD
            }
            , new Object[] {
            T000Y3_A448TBM26_LIST_ITEM_NO, T000Y3_A452TBM26_CRT_DATETIME, T000Y3_n452TBM26_CRT_DATETIME, T000Y3_A453TBM26_CRT_USER_ID, T000Y3_n453TBM26_CRT_USER_ID, T000Y3_A455TBM26_UPD_DATETIME, T000Y3_n455TBM26_UPD_DATETIME, T000Y3_A456TBM26_UPD_USER_ID, T000Y3_n456TBM26_UPD_USER_ID, T000Y3_A458TBM26_UPD_CNT,
            T000Y3_n458TBM26_UPD_CNT, T000Y3_A449TBM26_LIST_ITEM_NAME, T000Y3_n449TBM26_LIST_ITEM_NAME, T000Y3_A450TBM26_INNER_VALUE, T000Y3_n450TBM26_INNER_VALUE, T000Y3_A451TBM26_DEL_FLG, T000Y3_n451TBM26_DEL_FLG, T000Y3_A454TBM26_CRT_PROG_NM, T000Y3_n454TBM26_CRT_PROG_NM, T000Y3_A457TBM26_UPD_PROG_NM,
            T000Y3_n457TBM26_UPD_PROG_NM, T000Y3_A446TBM26_STUDY_ID, T000Y3_A447TBM26_LIST_CD
            }
            , new Object[] {
            T000Y4_A446TBM26_STUDY_ID
            }
            , new Object[] {
            T000Y5_A448TBM26_LIST_ITEM_NO, T000Y5_A452TBM26_CRT_DATETIME, T000Y5_n452TBM26_CRT_DATETIME, T000Y5_A453TBM26_CRT_USER_ID, T000Y5_n453TBM26_CRT_USER_ID, T000Y5_A455TBM26_UPD_DATETIME, T000Y5_n455TBM26_UPD_DATETIME, T000Y5_A456TBM26_UPD_USER_ID, T000Y5_n456TBM26_UPD_USER_ID, T000Y5_A458TBM26_UPD_CNT,
            T000Y5_n458TBM26_UPD_CNT, T000Y5_A449TBM26_LIST_ITEM_NAME, T000Y5_n449TBM26_LIST_ITEM_NAME, T000Y5_A450TBM26_INNER_VALUE, T000Y5_n450TBM26_INNER_VALUE, T000Y5_A451TBM26_DEL_FLG, T000Y5_n451TBM26_DEL_FLG, T000Y5_A454TBM26_CRT_PROG_NM, T000Y5_n454TBM26_CRT_PROG_NM, T000Y5_A457TBM26_UPD_PROG_NM,
            T000Y5_n457TBM26_UPD_PROG_NM, T000Y5_A446TBM26_STUDY_ID, T000Y5_A447TBM26_LIST_CD
            }
            , new Object[] {
            T000Y6_A446TBM26_STUDY_ID
            }
            , new Object[] {
            T000Y7_A446TBM26_STUDY_ID, T000Y7_A447TBM26_LIST_CD, T000Y7_A448TBM26_LIST_ITEM_NO
            }
            , new Object[] {
            T000Y8_A446TBM26_STUDY_ID, T000Y8_A447TBM26_LIST_CD, T000Y8_A448TBM26_LIST_ITEM_NO
            }
            , new Object[] {
            T000Y9_A446TBM26_STUDY_ID, T000Y9_A447TBM26_LIST_CD, T000Y9_A448TBM26_LIST_ITEM_NO
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000Y13_A446TBM26_STUDY_ID, T000Y13_A447TBM26_LIST_CD, T000Y13_A448TBM26_LIST_ITEM_NO
            }
            , new Object[] {
            T000Y14_A446TBM26_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM26_SEL_LIST_ITEM" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A448TBM26_LIST_ITEM_NO ;
   private short Z448TBM26_LIST_ITEM_NO ;
   private short RcdFound33 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM26_STUDY_ID_Enabled ;
   private int edtTBM26_LIST_CD_Enabled ;
   private int edtTBM26_LIST_ITEM_NO_Enabled ;
   private int edtTBM26_LIST_ITEM_NAME_Enabled ;
   private int edtTBM26_INNER_VALUE_Enabled ;
   private int edtTBM26_DEL_FLG_Enabled ;
   private int edtTBM26_CRT_DATETIME_Enabled ;
   private int edtTBM26_CRT_USER_ID_Enabled ;
   private int edtTBM26_CRT_PROG_NM_Enabled ;
   private int edtTBM26_UPD_DATETIME_Enabled ;
   private int edtTBM26_UPD_USER_ID_Enabled ;
   private int edtTBM26_UPD_PROG_NM_Enabled ;
   private int edtTBM26_UPD_CNT_Enabled ;
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
   private int AnyError446 ;
   private int AnyError447 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A446TBM26_STUDY_ID ;
   private long A458TBM26_UPD_CNT ;
   private long Z446TBM26_STUDY_ID ;
   private long Z458TBM26_UPD_CNT ;
   private long O458TBM26_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM26_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm26_study_id_Internalname ;
   private String lblTextblocktbm26_study_id_Jsonclick ;
   private String edtTBM26_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm26_list_cd_Internalname ;
   private String lblTextblocktbm26_list_cd_Jsonclick ;
   private String edtTBM26_LIST_CD_Internalname ;
   private String edtTBM26_LIST_CD_Jsonclick ;
   private String lblTextblocktbm26_list_item_no_Internalname ;
   private String lblTextblocktbm26_list_item_no_Jsonclick ;
   private String edtTBM26_LIST_ITEM_NO_Internalname ;
   private String edtTBM26_LIST_ITEM_NO_Jsonclick ;
   private String lblTextblocktbm26_list_item_name_Internalname ;
   private String lblTextblocktbm26_list_item_name_Jsonclick ;
   private String edtTBM26_LIST_ITEM_NAME_Internalname ;
   private String edtTBM26_LIST_ITEM_NAME_Jsonclick ;
   private String lblTextblocktbm26_inner_value_Internalname ;
   private String lblTextblocktbm26_inner_value_Jsonclick ;
   private String edtTBM26_INNER_VALUE_Internalname ;
   private String edtTBM26_INNER_VALUE_Jsonclick ;
   private String lblTextblocktbm26_del_flg_Internalname ;
   private String lblTextblocktbm26_del_flg_Jsonclick ;
   private String edtTBM26_DEL_FLG_Internalname ;
   private String edtTBM26_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm26_crt_datetime_Internalname ;
   private String lblTextblocktbm26_crt_datetime_Jsonclick ;
   private String edtTBM26_CRT_DATETIME_Internalname ;
   private String edtTBM26_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm26_crt_user_id_Internalname ;
   private String lblTextblocktbm26_crt_user_id_Jsonclick ;
   private String edtTBM26_CRT_USER_ID_Internalname ;
   private String edtTBM26_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm26_crt_prog_nm_Internalname ;
   private String lblTextblocktbm26_crt_prog_nm_Jsonclick ;
   private String edtTBM26_CRT_PROG_NM_Internalname ;
   private String edtTBM26_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm26_upd_datetime_Internalname ;
   private String lblTextblocktbm26_upd_datetime_Jsonclick ;
   private String edtTBM26_UPD_DATETIME_Internalname ;
   private String edtTBM26_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm26_upd_user_id_Internalname ;
   private String lblTextblocktbm26_upd_user_id_Jsonclick ;
   private String edtTBM26_UPD_USER_ID_Internalname ;
   private String edtTBM26_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm26_upd_prog_nm_Internalname ;
   private String lblTextblocktbm26_upd_prog_nm_Jsonclick ;
   private String edtTBM26_UPD_PROG_NM_Internalname ;
   private String edtTBM26_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm26_upd_cnt_Internalname ;
   private String lblTextblocktbm26_upd_cnt_Jsonclick ;
   private String edtTBM26_UPD_CNT_Internalname ;
   private String edtTBM26_UPD_CNT_Jsonclick ;
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
   private String sMode33 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A452TBM26_CRT_DATETIME ;
   private java.util.Date A455TBM26_UPD_DATETIME ;
   private java.util.Date Z452TBM26_CRT_DATETIME ;
   private java.util.Date Z455TBM26_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n449TBM26_LIST_ITEM_NAME ;
   private boolean n450TBM26_INNER_VALUE ;
   private boolean n451TBM26_DEL_FLG ;
   private boolean n452TBM26_CRT_DATETIME ;
   private boolean n453TBM26_CRT_USER_ID ;
   private boolean n454TBM26_CRT_PROG_NM ;
   private boolean n455TBM26_UPD_DATETIME ;
   private boolean n456TBM26_UPD_USER_ID ;
   private boolean n457TBM26_UPD_PROG_NM ;
   private boolean n458TBM26_UPD_CNT ;
   private boolean Gx_longc ;
   private String A447TBM26_LIST_CD ;
   private String A449TBM26_LIST_ITEM_NAME ;
   private String A450TBM26_INNER_VALUE ;
   private String A451TBM26_DEL_FLG ;
   private String A453TBM26_CRT_USER_ID ;
   private String A454TBM26_CRT_PROG_NM ;
   private String A456TBM26_UPD_USER_ID ;
   private String A457TBM26_UPD_PROG_NM ;
   private String Z447TBM26_LIST_CD ;
   private String Z453TBM26_CRT_USER_ID ;
   private String Z456TBM26_UPD_USER_ID ;
   private String Z449TBM26_LIST_ITEM_NAME ;
   private String Z450TBM26_INNER_VALUE ;
   private String Z451TBM26_DEL_FLG ;
   private String Z454TBM26_CRT_PROG_NM ;
   private String Z457TBM26_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private short[] T000Y5_A448TBM26_LIST_ITEM_NO ;
   private java.util.Date[] T000Y5_A452TBM26_CRT_DATETIME ;
   private boolean[] T000Y5_n452TBM26_CRT_DATETIME ;
   private String[] T000Y5_A453TBM26_CRT_USER_ID ;
   private boolean[] T000Y5_n453TBM26_CRT_USER_ID ;
   private java.util.Date[] T000Y5_A455TBM26_UPD_DATETIME ;
   private boolean[] T000Y5_n455TBM26_UPD_DATETIME ;
   private String[] T000Y5_A456TBM26_UPD_USER_ID ;
   private boolean[] T000Y5_n456TBM26_UPD_USER_ID ;
   private long[] T000Y5_A458TBM26_UPD_CNT ;
   private boolean[] T000Y5_n458TBM26_UPD_CNT ;
   private String[] T000Y5_A449TBM26_LIST_ITEM_NAME ;
   private boolean[] T000Y5_n449TBM26_LIST_ITEM_NAME ;
   private String[] T000Y5_A450TBM26_INNER_VALUE ;
   private boolean[] T000Y5_n450TBM26_INNER_VALUE ;
   private String[] T000Y5_A451TBM26_DEL_FLG ;
   private boolean[] T000Y5_n451TBM26_DEL_FLG ;
   private String[] T000Y5_A454TBM26_CRT_PROG_NM ;
   private boolean[] T000Y5_n454TBM26_CRT_PROG_NM ;
   private String[] T000Y5_A457TBM26_UPD_PROG_NM ;
   private boolean[] T000Y5_n457TBM26_UPD_PROG_NM ;
   private long[] T000Y5_A446TBM26_STUDY_ID ;
   private String[] T000Y5_A447TBM26_LIST_CD ;
   private long[] T000Y4_A446TBM26_STUDY_ID ;
   private long[] T000Y6_A446TBM26_STUDY_ID ;
   private long[] T000Y7_A446TBM26_STUDY_ID ;
   private String[] T000Y7_A447TBM26_LIST_CD ;
   private short[] T000Y7_A448TBM26_LIST_ITEM_NO ;
   private short[] T000Y3_A448TBM26_LIST_ITEM_NO ;
   private java.util.Date[] T000Y3_A452TBM26_CRT_DATETIME ;
   private boolean[] T000Y3_n452TBM26_CRT_DATETIME ;
   private String[] T000Y3_A453TBM26_CRT_USER_ID ;
   private boolean[] T000Y3_n453TBM26_CRT_USER_ID ;
   private java.util.Date[] T000Y3_A455TBM26_UPD_DATETIME ;
   private boolean[] T000Y3_n455TBM26_UPD_DATETIME ;
   private String[] T000Y3_A456TBM26_UPD_USER_ID ;
   private boolean[] T000Y3_n456TBM26_UPD_USER_ID ;
   private long[] T000Y3_A458TBM26_UPD_CNT ;
   private boolean[] T000Y3_n458TBM26_UPD_CNT ;
   private String[] T000Y3_A449TBM26_LIST_ITEM_NAME ;
   private boolean[] T000Y3_n449TBM26_LIST_ITEM_NAME ;
   private String[] T000Y3_A450TBM26_INNER_VALUE ;
   private boolean[] T000Y3_n450TBM26_INNER_VALUE ;
   private String[] T000Y3_A451TBM26_DEL_FLG ;
   private boolean[] T000Y3_n451TBM26_DEL_FLG ;
   private String[] T000Y3_A454TBM26_CRT_PROG_NM ;
   private boolean[] T000Y3_n454TBM26_CRT_PROG_NM ;
   private String[] T000Y3_A457TBM26_UPD_PROG_NM ;
   private boolean[] T000Y3_n457TBM26_UPD_PROG_NM ;
   private long[] T000Y3_A446TBM26_STUDY_ID ;
   private String[] T000Y3_A447TBM26_LIST_CD ;
   private long[] T000Y8_A446TBM26_STUDY_ID ;
   private String[] T000Y8_A447TBM26_LIST_CD ;
   private short[] T000Y8_A448TBM26_LIST_ITEM_NO ;
   private long[] T000Y9_A446TBM26_STUDY_ID ;
   private String[] T000Y9_A447TBM26_LIST_CD ;
   private short[] T000Y9_A448TBM26_LIST_ITEM_NO ;
   private short[] T000Y2_A448TBM26_LIST_ITEM_NO ;
   private java.util.Date[] T000Y2_A452TBM26_CRT_DATETIME ;
   private boolean[] T000Y2_n452TBM26_CRT_DATETIME ;
   private String[] T000Y2_A453TBM26_CRT_USER_ID ;
   private boolean[] T000Y2_n453TBM26_CRT_USER_ID ;
   private java.util.Date[] T000Y2_A455TBM26_UPD_DATETIME ;
   private boolean[] T000Y2_n455TBM26_UPD_DATETIME ;
   private String[] T000Y2_A456TBM26_UPD_USER_ID ;
   private boolean[] T000Y2_n456TBM26_UPD_USER_ID ;
   private long[] T000Y2_A458TBM26_UPD_CNT ;
   private boolean[] T000Y2_n458TBM26_UPD_CNT ;
   private String[] T000Y2_A449TBM26_LIST_ITEM_NAME ;
   private boolean[] T000Y2_n449TBM26_LIST_ITEM_NAME ;
   private String[] T000Y2_A450TBM26_INNER_VALUE ;
   private boolean[] T000Y2_n450TBM26_INNER_VALUE ;
   private String[] T000Y2_A451TBM26_DEL_FLG ;
   private boolean[] T000Y2_n451TBM26_DEL_FLG ;
   private String[] T000Y2_A454TBM26_CRT_PROG_NM ;
   private boolean[] T000Y2_n454TBM26_CRT_PROG_NM ;
   private String[] T000Y2_A457TBM26_UPD_PROG_NM ;
   private boolean[] T000Y2_n457TBM26_UPD_PROG_NM ;
   private long[] T000Y2_A446TBM26_STUDY_ID ;
   private String[] T000Y2_A447TBM26_LIST_CD ;
   private long[] T000Y13_A446TBM26_STUDY_ID ;
   private String[] T000Y13_A447TBM26_LIST_CD ;
   private short[] T000Y13_A448TBM26_LIST_ITEM_NO ;
   private long[] T000Y14_A446TBM26_STUDY_ID ;
}

final  class tbm26_sel_list_item__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000Y2", "SELECT `TBM26_LIST_ITEM_NO`, `TBM26_CRT_DATETIME`, `TBM26_CRT_USER_ID`, `TBM26_UPD_DATETIME`, `TBM26_UPD_USER_ID`, `TBM26_UPD_CNT`, `TBM26_LIST_ITEM_NAME`, `TBM26_INNER_VALUE`, `TBM26_DEL_FLG`, `TBM26_CRT_PROG_NM`, `TBM26_UPD_PROG_NM`, `TBM26_STUDY_ID` AS TBM26_STUDY_ID, `TBM26_LIST_CD` AS TBM26_LIST_CD FROM `TBM26_SEL_LIST_ITEM` WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ? AND `TBM26_LIST_ITEM_NO` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y3", "SELECT `TBM26_LIST_ITEM_NO`, `TBM26_CRT_DATETIME`, `TBM26_CRT_USER_ID`, `TBM26_UPD_DATETIME`, `TBM26_UPD_USER_ID`, `TBM26_UPD_CNT`, `TBM26_LIST_ITEM_NAME`, `TBM26_INNER_VALUE`, `TBM26_DEL_FLG`, `TBM26_CRT_PROG_NM`, `TBM26_UPD_PROG_NM`, `TBM26_STUDY_ID` AS TBM26_STUDY_ID, `TBM26_LIST_CD` AS TBM26_LIST_CD FROM `TBM26_SEL_LIST_ITEM` WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ? AND `TBM26_LIST_ITEM_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y4", "SELECT `TBM25_STUDY_ID` AS TBM26_STUDY_ID FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y5", "SELECT TM1.`TBM26_LIST_ITEM_NO`, TM1.`TBM26_CRT_DATETIME`, TM1.`TBM26_CRT_USER_ID`, TM1.`TBM26_UPD_DATETIME`, TM1.`TBM26_UPD_USER_ID`, TM1.`TBM26_UPD_CNT`, TM1.`TBM26_LIST_ITEM_NAME`, TM1.`TBM26_INNER_VALUE`, TM1.`TBM26_DEL_FLG`, TM1.`TBM26_CRT_PROG_NM`, TM1.`TBM26_UPD_PROG_NM`, TM1.`TBM26_STUDY_ID` AS TBM26_STUDY_ID, TM1.`TBM26_LIST_CD` AS TBM26_LIST_CD FROM `TBM26_SEL_LIST_ITEM` TM1 WHERE TM1.`TBM26_STUDY_ID` = ? and TM1.`TBM26_LIST_CD` = ? and TM1.`TBM26_LIST_ITEM_NO` = ? ORDER BY TM1.`TBM26_STUDY_ID`, TM1.`TBM26_LIST_CD`, TM1.`TBM26_LIST_ITEM_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000Y6", "SELECT `TBM25_STUDY_ID` AS TBM26_STUDY_ID FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y7", "SELECT `TBM26_STUDY_ID` AS TBM26_STUDY_ID, `TBM26_LIST_CD` AS TBM26_LIST_CD, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ? AND `TBM26_LIST_ITEM_NO` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000Y8", "SELECT `TBM26_STUDY_ID` AS TBM26_STUDY_ID, `TBM26_LIST_CD` AS TBM26_LIST_CD, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` WHERE ( `TBM26_STUDY_ID` > ? or `TBM26_STUDY_ID` = ? and `TBM26_LIST_CD` > ? or `TBM26_LIST_CD` = ? and `TBM26_STUDY_ID` = ? and `TBM26_LIST_ITEM_NO` > ?) ORDER BY `TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_LIST_ITEM_NO`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000Y9", "SELECT `TBM26_STUDY_ID` AS TBM26_STUDY_ID, `TBM26_LIST_CD` AS TBM26_LIST_CD, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` WHERE ( `TBM26_STUDY_ID` < ? or `TBM26_STUDY_ID` = ? and `TBM26_LIST_CD` < ? or `TBM26_LIST_CD` = ? and `TBM26_STUDY_ID` = ? and `TBM26_LIST_ITEM_NO` < ?) ORDER BY `TBM26_STUDY_ID` DESC, `TBM26_LIST_CD` DESC, `TBM26_LIST_ITEM_NO` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000Y10", "INSERT INTO `TBM26_SEL_LIST_ITEM` (`TBM26_LIST_ITEM_NO`, `TBM26_CRT_DATETIME`, `TBM26_CRT_USER_ID`, `TBM26_UPD_DATETIME`, `TBM26_UPD_USER_ID`, `TBM26_UPD_CNT`, `TBM26_LIST_ITEM_NAME`, `TBM26_INNER_VALUE`, `TBM26_DEL_FLG`, `TBM26_CRT_PROG_NM`, `TBM26_UPD_PROG_NM`, `TBM26_STUDY_ID`, `TBM26_LIST_CD`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000Y11", "UPDATE `TBM26_SEL_LIST_ITEM` SET `TBM26_CRT_DATETIME`=?, `TBM26_CRT_USER_ID`=?, `TBM26_UPD_DATETIME`=?, `TBM26_UPD_USER_ID`=?, `TBM26_UPD_CNT`=?, `TBM26_LIST_ITEM_NAME`=?, `TBM26_INNER_VALUE`=?, `TBM26_DEL_FLG`=?, `TBM26_CRT_PROG_NM`=?, `TBM26_UPD_PROG_NM`=?  WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ? AND `TBM26_LIST_ITEM_NO` = ?", GX_NOMASK)
         ,new UpdateCursor("T000Y12", "DELETE FROM `TBM26_SEL_LIST_ITEM`  WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ? AND `TBM26_LIST_ITEM_NO` = ?", GX_NOMASK)
         ,new ForEachCursor("T000Y13", "SELECT `TBM26_STUDY_ID` AS TBM26_STUDY_ID, `TBM26_LIST_CD` AS TBM26_LIST_CD, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` ORDER BY `TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_LIST_ITEM_NO` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000Y14", "SELECT `TBM25_STUDY_ID` AS TBM26_STUDY_ID FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
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
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
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
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((long[]) buf[21])[0] = rslt.getLong(12) ;
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 20, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setShort(6, ((Number) parms[5]).shortValue());
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 20, false);
               stmt.setVarchar(4, (String)parms[3], 20, false);
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
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 50);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 100);
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
                  stmt.setVarchar(10, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 40);
               }
               stmt.setLong(12, ((Number) parms[21]).longValue());
               stmt.setVarchar(13, (String)parms[22], 20, false);
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
                  stmt.setVarchar(6, (String)parms[11], 50);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 100);
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
                  stmt.setVarchar(9, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               stmt.setLong(11, ((Number) parms[20]).longValue());
               stmt.setVarchar(12, (String)parms[21], 20, false);
               stmt.setShort(13, ((Number) parms[22]).shortValue());
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               break;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
      }
   }

}

