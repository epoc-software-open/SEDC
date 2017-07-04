/*
               File: tbm25_sel_list_impl
        Description: 選択リストマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:56:1.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm25_sel_list_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM25_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm25_crt_user_id0X32( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM25_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm25_upd_user_id0X32( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A435TBM25_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A435TBM25_STUDY_ID) ;
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
      Form.getMeta().addItem("Description", "選択リストマスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbm25_sel_list_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm25_sel_list_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm25_sel_list_impl.class ));
   }

   public tbm25_sel_list_impl( int remoteHandle ,
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
         wb_table1_2_0X32( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0X32e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0X32( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0X32( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0X32( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0X32e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"選択リストマスタ"+"</legend>") ;
         wb_table3_27_0X32( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0X32e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0X32e( true) ;
      }
      else
      {
         wb_table1_2_0X32e( false) ;
      }
   }

   public void wb_table3_27_0X32( boolean wbgen )
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
         wb_table4_33_0X32( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0X32e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM25_SEL_LIST.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM25_SEL_LIST.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0X32e( true) ;
      }
      else
      {
         wb_table3_27_0X32e( false) ;
      }
   }

   public void wb_table4_33_0X32( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm25_study_id_Internalname, "試験ID", "", "", lblTextblocktbm25_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM25_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A435TBM25_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM25_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A435TBM25_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A435TBM25_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM25_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM25_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm25_list_cd_Internalname, "選択リストコード", "", "", lblTextblocktbm25_list_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A436TBM25_LIST_CD", A436TBM25_LIST_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM25_LIST_CD_Internalname, GXutil.rtrim( A436TBM25_LIST_CD), GXutil.rtrim( localUtil.format( A436TBM25_LIST_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM25_LIST_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM25_LIST_CD_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm25_list_nm_Internalname, "選択リスト名", "", "", lblTextblocktbm25_list_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A437TBM25_LIST_NM", A437TBM25_LIST_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM25_LIST_NM_Internalname, GXutil.rtrim( A437TBM25_LIST_NM), GXutil.rtrim( localUtil.format( A437TBM25_LIST_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM25_LIST_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM25_LIST_NM_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm25_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm25_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A438TBM25_DEL_FLG", A438TBM25_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM25_DEL_FLG_Internalname, GXutil.rtrim( A438TBM25_DEL_FLG), GXutil.rtrim( localUtil.format( A438TBM25_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM25_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM25_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm25_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm25_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A439TBM25_CRT_DATETIME", localUtil.ttoc( A439TBM25_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM25_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM25_CRT_DATETIME_Internalname, localUtil.format(A439TBM25_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A439TBM25_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM25_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM25_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM25_SEL_LIST.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM25_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM25_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm25_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm25_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A440TBM25_CRT_USER_ID", A440TBM25_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM25_CRT_USER_ID_Internalname, GXutil.rtrim( A440TBM25_CRT_USER_ID), GXutil.rtrim( localUtil.format( A440TBM25_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM25_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM25_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm25_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm25_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A441TBM25_CRT_PROG_NM", A441TBM25_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM25_CRT_PROG_NM_Internalname, GXutil.rtrim( A441TBM25_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A441TBM25_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM25_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM25_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm25_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm25_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A442TBM25_UPD_DATETIME", localUtil.ttoc( A442TBM25_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM25_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM25_UPD_DATETIME_Internalname, localUtil.format(A442TBM25_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A442TBM25_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM25_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM25_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM25_SEL_LIST.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM25_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM25_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm25_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm25_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A443TBM25_UPD_USER_ID", A443TBM25_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM25_UPD_USER_ID_Internalname, GXutil.rtrim( A443TBM25_UPD_USER_ID), GXutil.rtrim( localUtil.format( A443TBM25_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM25_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM25_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm25_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm25_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A444TBM25_UPD_PROG_NM", A444TBM25_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM25_UPD_PROG_NM_Internalname, GXutil.rtrim( A444TBM25_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A444TBM25_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM25_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM25_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm25_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm25_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A445TBM25_UPD_CNT", GXutil.ltrim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM25_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A445TBM25_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM25_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A445TBM25_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A445TBM25_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM25_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM25_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM25_SEL_LIST.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0X32e( true) ;
      }
      else
      {
         wb_table4_33_0X32e( false) ;
      }
   }

   public void wb_table2_5_0X32( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM25_SEL_LIST.htm");
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
         wb_table2_5_0X32e( true) ;
      }
      else
      {
         wb_table2_5_0X32e( false) ;
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
      /* Execute user event: e110X2 */
      e110X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM25_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM25_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM25_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A435TBM25_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
            }
            else
            {
               A435TBM25_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM25_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
            }
            A436TBM25_LIST_CD = httpContext.cgiGet( edtTBM25_LIST_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A436TBM25_LIST_CD", A436TBM25_LIST_CD);
            A437TBM25_LIST_NM = httpContext.cgiGet( edtTBM25_LIST_NM_Internalname) ;
            n437TBM25_LIST_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A437TBM25_LIST_NM", A437TBM25_LIST_NM);
            n437TBM25_LIST_NM = ((GXutil.strcmp("", A437TBM25_LIST_NM)==0) ? true : false) ;
            A438TBM25_DEL_FLG = httpContext.cgiGet( edtTBM25_DEL_FLG_Internalname) ;
            n438TBM25_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A438TBM25_DEL_FLG", A438TBM25_DEL_FLG);
            n438TBM25_DEL_FLG = ((GXutil.strcmp("", A438TBM25_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM25_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM25_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM25_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A439TBM25_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n439TBM25_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A439TBM25_CRT_DATETIME", localUtil.ttoc( A439TBM25_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A439TBM25_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM25_CRT_DATETIME_Internalname)) ;
               n439TBM25_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A439TBM25_CRT_DATETIME", localUtil.ttoc( A439TBM25_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n439TBM25_CRT_DATETIME = (GXutil.nullDate().equals(A439TBM25_CRT_DATETIME) ? true : false) ;
            A440TBM25_CRT_USER_ID = httpContext.cgiGet( edtTBM25_CRT_USER_ID_Internalname) ;
            n440TBM25_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A440TBM25_CRT_USER_ID", A440TBM25_CRT_USER_ID);
            n440TBM25_CRT_USER_ID = ((GXutil.strcmp("", A440TBM25_CRT_USER_ID)==0) ? true : false) ;
            A441TBM25_CRT_PROG_NM = httpContext.cgiGet( edtTBM25_CRT_PROG_NM_Internalname) ;
            n441TBM25_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A441TBM25_CRT_PROG_NM", A441TBM25_CRT_PROG_NM);
            n441TBM25_CRT_PROG_NM = ((GXutil.strcmp("", A441TBM25_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM25_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM25_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM25_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A442TBM25_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n442TBM25_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A442TBM25_UPD_DATETIME", localUtil.ttoc( A442TBM25_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A442TBM25_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM25_UPD_DATETIME_Internalname)) ;
               n442TBM25_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A442TBM25_UPD_DATETIME", localUtil.ttoc( A442TBM25_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n442TBM25_UPD_DATETIME = (GXutil.nullDate().equals(A442TBM25_UPD_DATETIME) ? true : false) ;
            A443TBM25_UPD_USER_ID = httpContext.cgiGet( edtTBM25_UPD_USER_ID_Internalname) ;
            n443TBM25_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A443TBM25_UPD_USER_ID", A443TBM25_UPD_USER_ID);
            n443TBM25_UPD_USER_ID = ((GXutil.strcmp("", A443TBM25_UPD_USER_ID)==0) ? true : false) ;
            A444TBM25_UPD_PROG_NM = httpContext.cgiGet( edtTBM25_UPD_PROG_NM_Internalname) ;
            n444TBM25_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A444TBM25_UPD_PROG_NM", A444TBM25_UPD_PROG_NM);
            n444TBM25_UPD_PROG_NM = ((GXutil.strcmp("", A444TBM25_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM25_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM25_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM25_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM25_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A445TBM25_UPD_CNT = 0 ;
               n445TBM25_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A445TBM25_UPD_CNT", GXutil.ltrim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)));
            }
            else
            {
               A445TBM25_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM25_UPD_CNT_Internalname), ".", ",") ;
               n445TBM25_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A445TBM25_UPD_CNT", GXutil.ltrim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)));
            }
            n445TBM25_UPD_CNT = ((0==A445TBM25_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z435TBM25_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z435TBM25_STUDY_ID"), ".", ",") ;
            Z436TBM25_LIST_CD = httpContext.cgiGet( "Z436TBM25_LIST_CD") ;
            Z439TBM25_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z439TBM25_CRT_DATETIME"), 0) ;
            n439TBM25_CRT_DATETIME = (GXutil.nullDate().equals(A439TBM25_CRT_DATETIME) ? true : false) ;
            Z440TBM25_CRT_USER_ID = httpContext.cgiGet( "Z440TBM25_CRT_USER_ID") ;
            n440TBM25_CRT_USER_ID = ((GXutil.strcmp("", A440TBM25_CRT_USER_ID)==0) ? true : false) ;
            Z442TBM25_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z442TBM25_UPD_DATETIME"), 0) ;
            n442TBM25_UPD_DATETIME = (GXutil.nullDate().equals(A442TBM25_UPD_DATETIME) ? true : false) ;
            Z443TBM25_UPD_USER_ID = httpContext.cgiGet( "Z443TBM25_UPD_USER_ID") ;
            n443TBM25_UPD_USER_ID = ((GXutil.strcmp("", A443TBM25_UPD_USER_ID)==0) ? true : false) ;
            Z445TBM25_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z445TBM25_UPD_CNT"), ".", ",") ;
            n445TBM25_UPD_CNT = ((0==A445TBM25_UPD_CNT) ? true : false) ;
            Z437TBM25_LIST_NM = httpContext.cgiGet( "Z437TBM25_LIST_NM") ;
            n437TBM25_LIST_NM = ((GXutil.strcmp("", A437TBM25_LIST_NM)==0) ? true : false) ;
            Z438TBM25_DEL_FLG = httpContext.cgiGet( "Z438TBM25_DEL_FLG") ;
            n438TBM25_DEL_FLG = ((GXutil.strcmp("", A438TBM25_DEL_FLG)==0) ? true : false) ;
            Z441TBM25_CRT_PROG_NM = httpContext.cgiGet( "Z441TBM25_CRT_PROG_NM") ;
            n441TBM25_CRT_PROG_NM = ((GXutil.strcmp("", A441TBM25_CRT_PROG_NM)==0) ? true : false) ;
            Z444TBM25_UPD_PROG_NM = httpContext.cgiGet( "Z444TBM25_UPD_PROG_NM") ;
            n444TBM25_UPD_PROG_NM = ((GXutil.strcmp("", A444TBM25_UPD_PROG_NM)==0) ? true : false) ;
            O445TBM25_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O445TBM25_UPD_CNT"), ".", ",") ;
            n445TBM25_UPD_CNT = ((0==A445TBM25_UPD_CNT) ? true : false) ;
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
               A435TBM25_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
               A436TBM25_LIST_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A436TBM25_LIST_CD", A436TBM25_LIST_CD);
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
                     /* Execute user event: e110X2 */
                     e110X2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120X2 */
                     e120X2 ();
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
         /* Execute user event: e120X2 */
         e120X2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0X32( ) ;
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
      disableAttributes0X32( ) ;
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

   public void resetCaption0X0( )
   {
   }

   public void e110X2( )
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

   public void e120X2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A436TBM25_LIST_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A437TBM25_LIST_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A438TBM25_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A439TBM25_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm25_sel_list_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A439TBM25_CRT_DATETIME", localUtil.ttoc( A439TBM25_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A440TBM25_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A441TBM25_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A442TBM25_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm25_sel_list_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A442TBM25_UPD_DATETIME", localUtil.ttoc( A442TBM25_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A443TBM25_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A444TBM25_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1164( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0X32( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z439TBM25_CRT_DATETIME = T000X3_A439TBM25_CRT_DATETIME[0] ;
            Z440TBM25_CRT_USER_ID = T000X3_A440TBM25_CRT_USER_ID[0] ;
            Z442TBM25_UPD_DATETIME = T000X3_A442TBM25_UPD_DATETIME[0] ;
            Z443TBM25_UPD_USER_ID = T000X3_A443TBM25_UPD_USER_ID[0] ;
            Z445TBM25_UPD_CNT = T000X3_A445TBM25_UPD_CNT[0] ;
            Z437TBM25_LIST_NM = T000X3_A437TBM25_LIST_NM[0] ;
            Z438TBM25_DEL_FLG = T000X3_A438TBM25_DEL_FLG[0] ;
            Z441TBM25_CRT_PROG_NM = T000X3_A441TBM25_CRT_PROG_NM[0] ;
            Z444TBM25_UPD_PROG_NM = T000X3_A444TBM25_UPD_PROG_NM[0] ;
         }
         else
         {
            Z439TBM25_CRT_DATETIME = A439TBM25_CRT_DATETIME ;
            Z440TBM25_CRT_USER_ID = A440TBM25_CRT_USER_ID ;
            Z442TBM25_UPD_DATETIME = A442TBM25_UPD_DATETIME ;
            Z443TBM25_UPD_USER_ID = A443TBM25_UPD_USER_ID ;
            Z445TBM25_UPD_CNT = A445TBM25_UPD_CNT ;
            Z437TBM25_LIST_NM = A437TBM25_LIST_NM ;
            Z438TBM25_DEL_FLG = A438TBM25_DEL_FLG ;
            Z441TBM25_CRT_PROG_NM = A441TBM25_CRT_PROG_NM ;
            Z444TBM25_UPD_PROG_NM = A444TBM25_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z436TBM25_LIST_CD = A436TBM25_LIST_CD ;
         Z439TBM25_CRT_DATETIME = A439TBM25_CRT_DATETIME ;
         Z440TBM25_CRT_USER_ID = A440TBM25_CRT_USER_ID ;
         Z442TBM25_UPD_DATETIME = A442TBM25_UPD_DATETIME ;
         Z443TBM25_UPD_USER_ID = A443TBM25_UPD_USER_ID ;
         Z445TBM25_UPD_CNT = A445TBM25_UPD_CNT ;
         Z437TBM25_LIST_NM = A437TBM25_LIST_NM ;
         Z438TBM25_DEL_FLG = A438TBM25_DEL_FLG ;
         Z441TBM25_CRT_PROG_NM = A441TBM25_CRT_PROG_NM ;
         Z444TBM25_UPD_PROG_NM = A444TBM25_UPD_PROG_NM ;
         Z435TBM25_STUDY_ID = A435TBM25_STUDY_ID ;
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

   public void load0X32( )
   {
      /* Using cursor T000X5 */
      pr_default.execute(3, new Object[] {new Long(A435TBM25_STUDY_ID), A436TBM25_LIST_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A439TBM25_CRT_DATETIME = T000X5_A439TBM25_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A439TBM25_CRT_DATETIME", localUtil.ttoc( A439TBM25_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n439TBM25_CRT_DATETIME = T000X5_n439TBM25_CRT_DATETIME[0] ;
         A440TBM25_CRT_USER_ID = T000X5_A440TBM25_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A440TBM25_CRT_USER_ID", A440TBM25_CRT_USER_ID);
         n440TBM25_CRT_USER_ID = T000X5_n440TBM25_CRT_USER_ID[0] ;
         A442TBM25_UPD_DATETIME = T000X5_A442TBM25_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442TBM25_UPD_DATETIME", localUtil.ttoc( A442TBM25_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n442TBM25_UPD_DATETIME = T000X5_n442TBM25_UPD_DATETIME[0] ;
         A443TBM25_UPD_USER_ID = T000X5_A443TBM25_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A443TBM25_UPD_USER_ID", A443TBM25_UPD_USER_ID);
         n443TBM25_UPD_USER_ID = T000X5_n443TBM25_UPD_USER_ID[0] ;
         A445TBM25_UPD_CNT = T000X5_A445TBM25_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A445TBM25_UPD_CNT", GXutil.ltrim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)));
         n445TBM25_UPD_CNT = T000X5_n445TBM25_UPD_CNT[0] ;
         A437TBM25_LIST_NM = T000X5_A437TBM25_LIST_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A437TBM25_LIST_NM", A437TBM25_LIST_NM);
         n437TBM25_LIST_NM = T000X5_n437TBM25_LIST_NM[0] ;
         A438TBM25_DEL_FLG = T000X5_A438TBM25_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A438TBM25_DEL_FLG", A438TBM25_DEL_FLG);
         n438TBM25_DEL_FLG = T000X5_n438TBM25_DEL_FLG[0] ;
         A441TBM25_CRT_PROG_NM = T000X5_A441TBM25_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A441TBM25_CRT_PROG_NM", A441TBM25_CRT_PROG_NM);
         n441TBM25_CRT_PROG_NM = T000X5_n441TBM25_CRT_PROG_NM[0] ;
         A444TBM25_UPD_PROG_NM = T000X5_A444TBM25_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A444TBM25_UPD_PROG_NM", A444TBM25_UPD_PROG_NM);
         n444TBM25_UPD_PROG_NM = T000X5_n444TBM25_UPD_PROG_NM[0] ;
         zm0X32( -8) ;
      }
      pr_default.close(3);
      onLoadActions0X32( ) ;
   }

   public void onLoadActions0X32( )
   {
      AV9Pgmname = "TBM25_SEL_LIST" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0X32( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM25_SEL_LIST" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000X4 */
      pr_default.execute(2, new Object[] {new Long(A435TBM25_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError435 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'選択リストマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM25_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError435 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A439TBM25_CRT_DATETIME) || (( A439TBM25_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A439TBM25_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A442TBM25_UPD_DATETIME) || (( A442TBM25_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A442TBM25_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0X32( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A435TBM25_STUDY_ID )
   {
      /* Using cursor T000X6 */
      pr_default.execute(4, new Object[] {new Long(A435TBM25_STUDY_ID)});
      if ( (pr_default.getStatus(4) == 101) )
      {
         AnyError435 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'選択リストマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM25_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError435 == 0 )
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

   public void getKey0X32( )
   {
      /* Using cursor T000X7 */
      pr_default.execute(5, new Object[] {new Long(A435TBM25_STUDY_ID), A436TBM25_LIST_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound32 = (short)(1) ;
      }
      else
      {
         RcdFound32 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000X3 */
      pr_default.execute(1, new Object[] {new Long(A435TBM25_STUDY_ID), A436TBM25_LIST_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0X32( 8) ;
         RcdFound32 = (short)(1) ;
         A436TBM25_LIST_CD = T000X3_A436TBM25_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A436TBM25_LIST_CD", A436TBM25_LIST_CD);
         A439TBM25_CRT_DATETIME = T000X3_A439TBM25_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A439TBM25_CRT_DATETIME", localUtil.ttoc( A439TBM25_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n439TBM25_CRT_DATETIME = T000X3_n439TBM25_CRT_DATETIME[0] ;
         A440TBM25_CRT_USER_ID = T000X3_A440TBM25_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A440TBM25_CRT_USER_ID", A440TBM25_CRT_USER_ID);
         n440TBM25_CRT_USER_ID = T000X3_n440TBM25_CRT_USER_ID[0] ;
         A442TBM25_UPD_DATETIME = T000X3_A442TBM25_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A442TBM25_UPD_DATETIME", localUtil.ttoc( A442TBM25_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n442TBM25_UPD_DATETIME = T000X3_n442TBM25_UPD_DATETIME[0] ;
         A443TBM25_UPD_USER_ID = T000X3_A443TBM25_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A443TBM25_UPD_USER_ID", A443TBM25_UPD_USER_ID);
         n443TBM25_UPD_USER_ID = T000X3_n443TBM25_UPD_USER_ID[0] ;
         A445TBM25_UPD_CNT = T000X3_A445TBM25_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A445TBM25_UPD_CNT", GXutil.ltrim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)));
         n445TBM25_UPD_CNT = T000X3_n445TBM25_UPD_CNT[0] ;
         A437TBM25_LIST_NM = T000X3_A437TBM25_LIST_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A437TBM25_LIST_NM", A437TBM25_LIST_NM);
         n437TBM25_LIST_NM = T000X3_n437TBM25_LIST_NM[0] ;
         A438TBM25_DEL_FLG = T000X3_A438TBM25_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A438TBM25_DEL_FLG", A438TBM25_DEL_FLG);
         n438TBM25_DEL_FLG = T000X3_n438TBM25_DEL_FLG[0] ;
         A441TBM25_CRT_PROG_NM = T000X3_A441TBM25_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A441TBM25_CRT_PROG_NM", A441TBM25_CRT_PROG_NM);
         n441TBM25_CRT_PROG_NM = T000X3_n441TBM25_CRT_PROG_NM[0] ;
         A444TBM25_UPD_PROG_NM = T000X3_A444TBM25_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A444TBM25_UPD_PROG_NM", A444TBM25_UPD_PROG_NM);
         n444TBM25_UPD_PROG_NM = T000X3_n444TBM25_UPD_PROG_NM[0] ;
         A435TBM25_STUDY_ID = T000X3_A435TBM25_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
         O445TBM25_UPD_CNT = A445TBM25_UPD_CNT ;
         n445TBM25_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A445TBM25_UPD_CNT", GXutil.ltrim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)));
         Z435TBM25_STUDY_ID = A435TBM25_STUDY_ID ;
         Z436TBM25_LIST_CD = A436TBM25_LIST_CD ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0X32( ) ;
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound32 = (short)(0) ;
         initializeNonKey0X32( ) ;
         sMode32 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode32 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0X32( ) ;
      if ( RcdFound32 == 0 )
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
      RcdFound32 = (short)(0) ;
      /* Using cursor T000X8 */
      pr_default.execute(6, new Object[] {new Long(A435TBM25_STUDY_ID), new Long(A435TBM25_STUDY_ID), A436TBM25_LIST_CD});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( T000X8_A435TBM25_STUDY_ID[0] < A435TBM25_STUDY_ID ) || ( T000X8_A435TBM25_STUDY_ID[0] == A435TBM25_STUDY_ID ) && ( GXutil.strcmp(T000X8_A436TBM25_LIST_CD[0], A436TBM25_LIST_CD) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( T000X8_A435TBM25_STUDY_ID[0] > A435TBM25_STUDY_ID ) || ( T000X8_A435TBM25_STUDY_ID[0] == A435TBM25_STUDY_ID ) && ( GXutil.strcmp(T000X8_A436TBM25_LIST_CD[0], A436TBM25_LIST_CD) > 0 ) ) )
         {
            A435TBM25_STUDY_ID = T000X8_A435TBM25_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
            A436TBM25_LIST_CD = T000X8_A436TBM25_LIST_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A436TBM25_LIST_CD", A436TBM25_LIST_CD);
            RcdFound32 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound32 = (short)(0) ;
      /* Using cursor T000X9 */
      pr_default.execute(7, new Object[] {new Long(A435TBM25_STUDY_ID), new Long(A435TBM25_STUDY_ID), A436TBM25_LIST_CD});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( T000X9_A435TBM25_STUDY_ID[0] > A435TBM25_STUDY_ID ) || ( T000X9_A435TBM25_STUDY_ID[0] == A435TBM25_STUDY_ID ) && ( GXutil.strcmp(T000X9_A436TBM25_LIST_CD[0], A436TBM25_LIST_CD) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( T000X9_A435TBM25_STUDY_ID[0] < A435TBM25_STUDY_ID ) || ( T000X9_A435TBM25_STUDY_ID[0] == A435TBM25_STUDY_ID ) && ( GXutil.strcmp(T000X9_A436TBM25_LIST_CD[0], A436TBM25_LIST_CD) < 0 ) ) )
         {
            A435TBM25_STUDY_ID = T000X9_A435TBM25_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
            A436TBM25_LIST_CD = T000X9_A436TBM25_LIST_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A436TBM25_LIST_CD", A436TBM25_LIST_CD);
            RcdFound32 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0X32( ) ;
      if ( RcdFound32 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM25_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A435TBM25_STUDY_ID != Z435TBM25_STUDY_ID ) || ( GXutil.strcmp(A436TBM25_LIST_CD, Z436TBM25_LIST_CD) != 0 ) )
         {
            A435TBM25_STUDY_ID = Z435TBM25_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
            A436TBM25_LIST_CD = Z436TBM25_LIST_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A436TBM25_LIST_CD", A436TBM25_LIST_CD);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM25_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update0X32( ) ;
            GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A435TBM25_STUDY_ID != Z435TBM25_STUDY_ID ) || ( GXutil.strcmp(A436TBM25_LIST_CD, Z436TBM25_LIST_CD) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0X32( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM25_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0X32( ) ;
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
      if ( ( A435TBM25_STUDY_ID != Z435TBM25_STUDY_ID ) || ( GXutil.strcmp(A436TBM25_LIST_CD, Z436TBM25_LIST_CD) != 0 ) )
      {
         A435TBM25_STUDY_ID = Z435TBM25_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
         A436TBM25_LIST_CD = Z436TBM25_LIST_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A436TBM25_LIST_CD", A436TBM25_LIST_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM25_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
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
      if ( RcdFound32 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM25_STUDY_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBM25_LIST_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0X32( ) ;
      if ( RcdFound32 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM25_LIST_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0X32( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound32 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM25_LIST_NM_Internalname ;
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
      if ( RcdFound32 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM25_LIST_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0X32( ) ;
      if ( RcdFound32 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound32 != 0 )
         {
            scanNext0X32( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM25_LIST_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0X32( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0X32( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000X2 */
         pr_default.execute(0, new Object[] {new Long(A435TBM25_STUDY_ID), A436TBM25_LIST_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM25_SEL_LIST"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z439TBM25_CRT_DATETIME.equals( T000X2_A439TBM25_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z440TBM25_CRT_USER_ID, T000X2_A440TBM25_CRT_USER_ID[0]) != 0 ) || !( Z442TBM25_UPD_DATETIME.equals( T000X2_A442TBM25_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z443TBM25_UPD_USER_ID, T000X2_A443TBM25_UPD_USER_ID[0]) != 0 ) || ( Z445TBM25_UPD_CNT != T000X2_A445TBM25_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z437TBM25_LIST_NM, T000X2_A437TBM25_LIST_NM[0]) != 0 ) || ( GXutil.strcmp(Z438TBM25_DEL_FLG, T000X2_A438TBM25_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z441TBM25_CRT_PROG_NM, T000X2_A441TBM25_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z444TBM25_UPD_PROG_NM, T000X2_A444TBM25_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM25_SEL_LIST"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0X32( )
   {
      beforeValidate0X32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0X32( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0X32( 0) ;
         checkOptimisticConcurrency0X32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0X32( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0X32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000X10 */
                  pr_default.execute(8, new Object[] {A436TBM25_LIST_CD, new Boolean(n439TBM25_CRT_DATETIME), A439TBM25_CRT_DATETIME, new Boolean(n440TBM25_CRT_USER_ID), A440TBM25_CRT_USER_ID, new Boolean(n442TBM25_UPD_DATETIME), A442TBM25_UPD_DATETIME, new Boolean(n443TBM25_UPD_USER_ID), A443TBM25_UPD_USER_ID, new Boolean(n445TBM25_UPD_CNT), new Long(A445TBM25_UPD_CNT), new Boolean(n437TBM25_LIST_NM), A437TBM25_LIST_NM, new Boolean(n438TBM25_DEL_FLG), A438TBM25_DEL_FLG, new Boolean(n441TBM25_CRT_PROG_NM), A441TBM25_CRT_PROG_NM, new Boolean(n444TBM25_UPD_PROG_NM), A444TBM25_UPD_PROG_NM, new Long(A435TBM25_STUDY_ID)});
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
                        resetCaption0X0( ) ;
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
            load0X32( ) ;
         }
         endLevel0X32( ) ;
      }
      closeExtendedTableCursors0X32( ) ;
   }

   public void update0X32( )
   {
      beforeValidate0X32( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0X32( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0X32( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0X32( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0X32( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000X11 */
                  pr_default.execute(9, new Object[] {new Boolean(n439TBM25_CRT_DATETIME), A439TBM25_CRT_DATETIME, new Boolean(n440TBM25_CRT_USER_ID), A440TBM25_CRT_USER_ID, new Boolean(n442TBM25_UPD_DATETIME), A442TBM25_UPD_DATETIME, new Boolean(n443TBM25_UPD_USER_ID), A443TBM25_UPD_USER_ID, new Boolean(n445TBM25_UPD_CNT), new Long(A445TBM25_UPD_CNT), new Boolean(n437TBM25_LIST_NM), A437TBM25_LIST_NM, new Boolean(n438TBM25_DEL_FLG), A438TBM25_DEL_FLG, new Boolean(n441TBM25_CRT_PROG_NM), A441TBM25_CRT_PROG_NM, new Boolean(n444TBM25_UPD_PROG_NM), A444TBM25_UPD_PROG_NM, new Long(A435TBM25_STUDY_ID), A436TBM25_LIST_CD});
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM25_SEL_LIST"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0X32( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption0X0( ) ;
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
         endLevel0X32( ) ;
      }
      closeExtendedTableCursors0X32( ) ;
   }

   public void deferredUpdate0X32( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0X32( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0X32( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0X32( ) ;
         afterConfirm0X32( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0X32( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000X12 */
               pr_default.execute(10, new Object[] {new Long(A435TBM25_STUDY_ID), A436TBM25_LIST_CD});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound32 == 0 )
                     {
                        initAll0X32( ) ;
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
                     resetCaption0X0( ) ;
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
      sMode32 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0X32( ) ;
      Gx_mode = sMode32 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0X32( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM25_SEL_LIST" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000X13 */
         pr_default.execute(11, new Object[] {new Long(A435TBM25_STUDY_ID), A436TBM25_LIST_CD});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"選択リスト項目マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevel0X32( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0X32( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm25_sel_list");
         if ( AnyError == 0 )
         {
            confirmValues0X0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm25_sel_list");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0X32( )
   {
      /* Using cursor T000X14 */
      pr_default.execute(12);
      RcdFound32 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A435TBM25_STUDY_ID = T000X14_A435TBM25_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
         A436TBM25_LIST_CD = T000X14_A436TBM25_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A436TBM25_LIST_CD", A436TBM25_LIST_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0X32( )
   {
      pr_default.readNext(12);
      RcdFound32 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound32 = (short)(1) ;
         A435TBM25_STUDY_ID = T000X14_A435TBM25_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
         A436TBM25_LIST_CD = T000X14_A436TBM25_LIST_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A436TBM25_LIST_CD", A436TBM25_LIST_CD);
      }
   }

   public void scanEnd0X32( )
   {
      pr_default.close(12);
   }

   public void afterConfirm0X32( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0X32( )
   {
      /* Before Insert Rules */
      A439TBM25_CRT_DATETIME = GXutil.now( ) ;
      n439TBM25_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A439TBM25_CRT_DATETIME", localUtil.ttoc( A439TBM25_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A440TBM25_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm25_sel_list_impl.this.GXt_char3 = GXv_char4[0] ;
      A440TBM25_CRT_USER_ID = GXt_char3 ;
      n440TBM25_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A440TBM25_CRT_USER_ID", A440TBM25_CRT_USER_ID);
      A442TBM25_UPD_DATETIME = GXutil.now( ) ;
      n442TBM25_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A442TBM25_UPD_DATETIME", localUtil.ttoc( A442TBM25_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A443TBM25_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm25_sel_list_impl.this.GXt_char3 = GXv_char4[0] ;
      A443TBM25_UPD_USER_ID = GXt_char3 ;
      n443TBM25_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A443TBM25_UPD_USER_ID", A443TBM25_UPD_USER_ID);
      A445TBM25_UPD_CNT = (long)(O445TBM25_UPD_CNT+1) ;
      n445TBM25_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A445TBM25_UPD_CNT", GXutil.ltrim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0X32( )
   {
      /* Before Update Rules */
      A442TBM25_UPD_DATETIME = GXutil.now( ) ;
      n442TBM25_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A442TBM25_UPD_DATETIME", localUtil.ttoc( A442TBM25_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A443TBM25_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm25_sel_list_impl.this.GXt_char3 = GXv_char4[0] ;
      A443TBM25_UPD_USER_ID = GXt_char3 ;
      n443TBM25_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A443TBM25_UPD_USER_ID", A443TBM25_UPD_USER_ID);
      A445TBM25_UPD_CNT = (long)(O445TBM25_UPD_CNT+1) ;
      n445TBM25_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A445TBM25_UPD_CNT", GXutil.ltrim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0X32( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0X32( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0X32( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0X32( )
   {
      edtTBM25_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM25_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM25_STUDY_ID_Enabled, 5, 0)));
      edtTBM25_LIST_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM25_LIST_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM25_LIST_CD_Enabled, 5, 0)));
      edtTBM25_LIST_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM25_LIST_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM25_LIST_NM_Enabled, 5, 0)));
      edtTBM25_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM25_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM25_DEL_FLG_Enabled, 5, 0)));
      edtTBM25_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM25_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM25_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM25_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM25_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM25_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM25_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM25_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM25_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM25_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM25_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM25_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM25_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM25_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM25_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM25_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM25_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM25_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM25_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM25_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM25_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0X0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "選択リストマスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm25_sel_list") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0X32( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z435TBM25_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z435TBM25_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z436TBM25_LIST_CD", GXutil.rtrim( Z436TBM25_LIST_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z439TBM25_CRT_DATETIME", localUtil.ttoc( Z439TBM25_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z440TBM25_CRT_USER_ID", GXutil.rtrim( Z440TBM25_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z442TBM25_UPD_DATETIME", localUtil.ttoc( Z442TBM25_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z443TBM25_UPD_USER_ID", GXutil.rtrim( Z443TBM25_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z445TBM25_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z445TBM25_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z437TBM25_LIST_NM", GXutil.rtrim( Z437TBM25_LIST_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z438TBM25_DEL_FLG", GXutil.rtrim( Z438TBM25_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z441TBM25_CRT_PROG_NM", GXutil.rtrim( Z441TBM25_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z444TBM25_UPD_PROG_NM", GXutil.rtrim( Z444TBM25_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O445TBM25_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O445TBM25_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0X32( )
   {
      A439TBM25_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n439TBM25_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A439TBM25_CRT_DATETIME", localUtil.ttoc( A439TBM25_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n439TBM25_CRT_DATETIME = (GXutil.nullDate().equals(A439TBM25_CRT_DATETIME) ? true : false) ;
      A440TBM25_CRT_USER_ID = "" ;
      n440TBM25_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A440TBM25_CRT_USER_ID", A440TBM25_CRT_USER_ID);
      n440TBM25_CRT_USER_ID = ((GXutil.strcmp("", A440TBM25_CRT_USER_ID)==0) ? true : false) ;
      A442TBM25_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n442TBM25_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A442TBM25_UPD_DATETIME", localUtil.ttoc( A442TBM25_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n442TBM25_UPD_DATETIME = (GXutil.nullDate().equals(A442TBM25_UPD_DATETIME) ? true : false) ;
      A443TBM25_UPD_USER_ID = "" ;
      n443TBM25_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A443TBM25_UPD_USER_ID", A443TBM25_UPD_USER_ID);
      n443TBM25_UPD_USER_ID = ((GXutil.strcmp("", A443TBM25_UPD_USER_ID)==0) ? true : false) ;
      A445TBM25_UPD_CNT = 0 ;
      n445TBM25_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A445TBM25_UPD_CNT", GXutil.ltrim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)));
      n445TBM25_UPD_CNT = ((0==A445TBM25_UPD_CNT) ? true : false) ;
      A437TBM25_LIST_NM = "" ;
      n437TBM25_LIST_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A437TBM25_LIST_NM", A437TBM25_LIST_NM);
      n437TBM25_LIST_NM = ((GXutil.strcmp("", A437TBM25_LIST_NM)==0) ? true : false) ;
      A438TBM25_DEL_FLG = "" ;
      n438TBM25_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A438TBM25_DEL_FLG", A438TBM25_DEL_FLG);
      n438TBM25_DEL_FLG = ((GXutil.strcmp("", A438TBM25_DEL_FLG)==0) ? true : false) ;
      A441TBM25_CRT_PROG_NM = "" ;
      n441TBM25_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A441TBM25_CRT_PROG_NM", A441TBM25_CRT_PROG_NM);
      n441TBM25_CRT_PROG_NM = ((GXutil.strcmp("", A441TBM25_CRT_PROG_NM)==0) ? true : false) ;
      A444TBM25_UPD_PROG_NM = "" ;
      n444TBM25_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A444TBM25_UPD_PROG_NM", A444TBM25_UPD_PROG_NM);
      n444TBM25_UPD_PROG_NM = ((GXutil.strcmp("", A444TBM25_UPD_PROG_NM)==0) ? true : false) ;
      O445TBM25_UPD_CNT = A445TBM25_UPD_CNT ;
      n445TBM25_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A445TBM25_UPD_CNT", GXutil.ltrim( GXutil.str( A445TBM25_UPD_CNT, 10, 0)));
   }

   public void initAll0X32( )
   {
      A435TBM25_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A435TBM25_STUDY_ID", GXutil.ltrim( GXutil.str( A435TBM25_STUDY_ID, 10, 0)));
      A436TBM25_LIST_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A436TBM25_LIST_CD", A436TBM25_LIST_CD);
      initializeNonKey0X32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?145633");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm25_sel_list.js", "?145633");
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
      lblTextblocktbm25_study_id_Internalname = "TEXTBLOCKTBM25_STUDY_ID" ;
      edtTBM25_STUDY_ID_Internalname = "TBM25_STUDY_ID" ;
      lblTextblocktbm25_list_cd_Internalname = "TEXTBLOCKTBM25_LIST_CD" ;
      edtTBM25_LIST_CD_Internalname = "TBM25_LIST_CD" ;
      lblTextblocktbm25_list_nm_Internalname = "TEXTBLOCKTBM25_LIST_NM" ;
      edtTBM25_LIST_NM_Internalname = "TBM25_LIST_NM" ;
      lblTextblocktbm25_del_flg_Internalname = "TEXTBLOCKTBM25_DEL_FLG" ;
      edtTBM25_DEL_FLG_Internalname = "TBM25_DEL_FLG" ;
      lblTextblocktbm25_crt_datetime_Internalname = "TEXTBLOCKTBM25_CRT_DATETIME" ;
      edtTBM25_CRT_DATETIME_Internalname = "TBM25_CRT_DATETIME" ;
      lblTextblocktbm25_crt_user_id_Internalname = "TEXTBLOCKTBM25_CRT_USER_ID" ;
      edtTBM25_CRT_USER_ID_Internalname = "TBM25_CRT_USER_ID" ;
      lblTextblocktbm25_crt_prog_nm_Internalname = "TEXTBLOCKTBM25_CRT_PROG_NM" ;
      edtTBM25_CRT_PROG_NM_Internalname = "TBM25_CRT_PROG_NM" ;
      lblTextblocktbm25_upd_datetime_Internalname = "TEXTBLOCKTBM25_UPD_DATETIME" ;
      edtTBM25_UPD_DATETIME_Internalname = "TBM25_UPD_DATETIME" ;
      lblTextblocktbm25_upd_user_id_Internalname = "TEXTBLOCKTBM25_UPD_USER_ID" ;
      edtTBM25_UPD_USER_ID_Internalname = "TBM25_UPD_USER_ID" ;
      lblTextblocktbm25_upd_prog_nm_Internalname = "TEXTBLOCKTBM25_UPD_PROG_NM" ;
      edtTBM25_UPD_PROG_NM_Internalname = "TBM25_UPD_PROG_NM" ;
      lblTextblocktbm25_upd_cnt_Internalname = "TEXTBLOCKTBM25_UPD_CNT" ;
      edtTBM25_UPD_CNT_Internalname = "TBM25_UPD_CNT" ;
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
      edtTBM25_UPD_CNT_Jsonclick = "" ;
      edtTBM25_UPD_CNT_Enabled = 1 ;
      edtTBM25_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM25_UPD_PROG_NM_Enabled = 1 ;
      edtTBM25_UPD_USER_ID_Jsonclick = "" ;
      edtTBM25_UPD_USER_ID_Enabled = 1 ;
      edtTBM25_UPD_DATETIME_Jsonclick = "" ;
      edtTBM25_UPD_DATETIME_Enabled = 1 ;
      edtTBM25_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM25_CRT_PROG_NM_Enabled = 1 ;
      edtTBM25_CRT_USER_ID_Jsonclick = "" ;
      edtTBM25_CRT_USER_ID_Enabled = 1 ;
      edtTBM25_CRT_DATETIME_Jsonclick = "" ;
      edtTBM25_CRT_DATETIME_Enabled = 1 ;
      edtTBM25_DEL_FLG_Jsonclick = "" ;
      edtTBM25_DEL_FLG_Enabled = 1 ;
      edtTBM25_LIST_NM_Jsonclick = "" ;
      edtTBM25_LIST_NM_Enabled = 1 ;
      edtTBM25_LIST_CD_Jsonclick = "" ;
      edtTBM25_LIST_CD_Enabled = 1 ;
      edtTBM25_STUDY_ID_Jsonclick = "" ;
      edtTBM25_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm25_crt_user_id0X32( String Gx_mode )
   {
      GXt_char3 = A440TBM25_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm25_sel_list_impl.this.GXt_char3 = GXv_char4[0] ;
      A440TBM25_CRT_USER_ID = GXt_char3 ;
      n440TBM25_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A440TBM25_CRT_USER_ID", A440TBM25_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A440TBM25_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm25_upd_user_id0X32( String Gx_mode )
   {
      GXt_char3 = A443TBM25_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm25_sel_list_impl.this.GXt_char3 = GXv_char4[0] ;
      A443TBM25_UPD_USER_ID = GXt_char3 ;
      n443TBM25_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A443TBM25_UPD_USER_ID", A443TBM25_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A443TBM25_UPD_USER_ID))+"\"");
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
      /* Using cursor T000X15 */
      pr_default.execute(13, new Object[] {new Long(A435TBM25_STUDY_ID)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         AnyError435 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'選択リストマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM25_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError435 == 0 )
      {
      }
      pr_default.close(13);
      GX_FocusControl = edtTBM25_LIST_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm25_study_id( long GX_Parm1 )
   {
      A435TBM25_STUDY_ID = GX_Parm1 ;
      /* Using cursor T000X15 */
      pr_default.execute(13, new Object[] {new Long(A435TBM25_STUDY_ID)});
      if ( (pr_default.getStatus(13) == 101) )
      {
         AnyError435 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'選択リストマスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM25_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM25_STUDY_ID_Internalname ;
      }
      if ( AnyError435 == 0 )
      {
      }
      pr_default.close(13);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbm25_list_cd( long GX_Parm1 ,
                                    String GX_Parm2 ,
                                    java.util.Date GX_Parm3 ,
                                    String GX_Parm4 ,
                                    java.util.Date GX_Parm5 ,
                                    String GX_Parm6 ,
                                    long GX_Parm7 ,
                                    String GX_Parm8 ,
                                    String GX_Parm9 ,
                                    String GX_Parm10 ,
                                    String GX_Parm11 )
   {
      A435TBM25_STUDY_ID = GX_Parm1 ;
      A436TBM25_LIST_CD = GX_Parm2 ;
      A439TBM25_CRT_DATETIME = GX_Parm3 ;
      n439TBM25_CRT_DATETIME = false ;
      A440TBM25_CRT_USER_ID = GX_Parm4 ;
      n440TBM25_CRT_USER_ID = false ;
      A442TBM25_UPD_DATETIME = GX_Parm5 ;
      n442TBM25_UPD_DATETIME = false ;
      A443TBM25_UPD_USER_ID = GX_Parm6 ;
      n443TBM25_UPD_USER_ID = false ;
      A445TBM25_UPD_CNT = GX_Parm7 ;
      n445TBM25_UPD_CNT = false ;
      A437TBM25_LIST_NM = GX_Parm8 ;
      n437TBM25_LIST_NM = false ;
      A438TBM25_DEL_FLG = GX_Parm9 ;
      n438TBM25_DEL_FLG = false ;
      A441TBM25_CRT_PROG_NM = GX_Parm10 ;
      n441TBM25_CRT_PROG_NM = false ;
      A444TBM25_UPD_PROG_NM = GX_Parm11 ;
      n444TBM25_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A439TBM25_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A440TBM25_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A442TBM25_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A443TBM25_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A445TBM25_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A437TBM25_LIST_NM));
      isValidOutput.add(GXutil.rtrim( A438TBM25_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A441TBM25_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A444TBM25_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z435TBM25_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z436TBM25_LIST_CD));
      isValidOutput.add(localUtil.ttoc( Z439TBM25_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z440TBM25_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z442TBM25_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z443TBM25_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z445TBM25_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z437TBM25_LIST_NM));
      isValidOutput.add(GXutil.rtrim( Z438TBM25_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z441TBM25_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z444TBM25_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O445TBM25_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1164 */
                  S1164 ();
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
      lblTextblocktbm25_study_id_Jsonclick = "" ;
      lblTextblocktbm25_list_cd_Jsonclick = "" ;
      A436TBM25_LIST_CD = "" ;
      lblTextblocktbm25_list_nm_Jsonclick = "" ;
      A437TBM25_LIST_NM = "" ;
      lblTextblocktbm25_del_flg_Jsonclick = "" ;
      A438TBM25_DEL_FLG = "" ;
      lblTextblocktbm25_crt_datetime_Jsonclick = "" ;
      A439TBM25_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm25_crt_user_id_Jsonclick = "" ;
      A440TBM25_CRT_USER_ID = "" ;
      lblTextblocktbm25_crt_prog_nm_Jsonclick = "" ;
      A441TBM25_CRT_PROG_NM = "" ;
      lblTextblocktbm25_upd_datetime_Jsonclick = "" ;
      A442TBM25_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm25_upd_user_id_Jsonclick = "" ;
      A443TBM25_UPD_USER_ID = "" ;
      lblTextblocktbm25_upd_prog_nm_Jsonclick = "" ;
      A444TBM25_UPD_PROG_NM = "" ;
      lblTextblocktbm25_upd_cnt_Jsonclick = "" ;
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
      Z436TBM25_LIST_CD = "" ;
      Z439TBM25_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z440TBM25_CRT_USER_ID = "" ;
      Z442TBM25_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z443TBM25_UPD_USER_ID = "" ;
      Z437TBM25_LIST_NM = "" ;
      Z438TBM25_DEL_FLG = "" ;
      Z441TBM25_CRT_PROG_NM = "" ;
      Z444TBM25_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000X5_A436TBM25_LIST_CD = new String[] {""} ;
      T000X5_A439TBM25_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000X5_n439TBM25_CRT_DATETIME = new boolean[] {false} ;
      T000X5_A440TBM25_CRT_USER_ID = new String[] {""} ;
      T000X5_n440TBM25_CRT_USER_ID = new boolean[] {false} ;
      T000X5_A442TBM25_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000X5_n442TBM25_UPD_DATETIME = new boolean[] {false} ;
      T000X5_A443TBM25_UPD_USER_ID = new String[] {""} ;
      T000X5_n443TBM25_UPD_USER_ID = new boolean[] {false} ;
      T000X5_A445TBM25_UPD_CNT = new long[1] ;
      T000X5_n445TBM25_UPD_CNT = new boolean[] {false} ;
      T000X5_A437TBM25_LIST_NM = new String[] {""} ;
      T000X5_n437TBM25_LIST_NM = new boolean[] {false} ;
      T000X5_A438TBM25_DEL_FLG = new String[] {""} ;
      T000X5_n438TBM25_DEL_FLG = new boolean[] {false} ;
      T000X5_A441TBM25_CRT_PROG_NM = new String[] {""} ;
      T000X5_n441TBM25_CRT_PROG_NM = new boolean[] {false} ;
      T000X5_A444TBM25_UPD_PROG_NM = new String[] {""} ;
      T000X5_n444TBM25_UPD_PROG_NM = new boolean[] {false} ;
      T000X5_A435TBM25_STUDY_ID = new long[1] ;
      T000X4_A435TBM25_STUDY_ID = new long[1] ;
      T000X6_A435TBM25_STUDY_ID = new long[1] ;
      T000X7_A435TBM25_STUDY_ID = new long[1] ;
      T000X7_A436TBM25_LIST_CD = new String[] {""} ;
      T000X3_A436TBM25_LIST_CD = new String[] {""} ;
      T000X3_A439TBM25_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000X3_n439TBM25_CRT_DATETIME = new boolean[] {false} ;
      T000X3_A440TBM25_CRT_USER_ID = new String[] {""} ;
      T000X3_n440TBM25_CRT_USER_ID = new boolean[] {false} ;
      T000X3_A442TBM25_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000X3_n442TBM25_UPD_DATETIME = new boolean[] {false} ;
      T000X3_A443TBM25_UPD_USER_ID = new String[] {""} ;
      T000X3_n443TBM25_UPD_USER_ID = new boolean[] {false} ;
      T000X3_A445TBM25_UPD_CNT = new long[1] ;
      T000X3_n445TBM25_UPD_CNT = new boolean[] {false} ;
      T000X3_A437TBM25_LIST_NM = new String[] {""} ;
      T000X3_n437TBM25_LIST_NM = new boolean[] {false} ;
      T000X3_A438TBM25_DEL_FLG = new String[] {""} ;
      T000X3_n438TBM25_DEL_FLG = new boolean[] {false} ;
      T000X3_A441TBM25_CRT_PROG_NM = new String[] {""} ;
      T000X3_n441TBM25_CRT_PROG_NM = new boolean[] {false} ;
      T000X3_A444TBM25_UPD_PROG_NM = new String[] {""} ;
      T000X3_n444TBM25_UPD_PROG_NM = new boolean[] {false} ;
      T000X3_A435TBM25_STUDY_ID = new long[1] ;
      sMode32 = "" ;
      T000X8_A435TBM25_STUDY_ID = new long[1] ;
      T000X8_A436TBM25_LIST_CD = new String[] {""} ;
      T000X9_A435TBM25_STUDY_ID = new long[1] ;
      T000X9_A436TBM25_LIST_CD = new String[] {""} ;
      T000X2_A436TBM25_LIST_CD = new String[] {""} ;
      T000X2_A439TBM25_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000X2_n439TBM25_CRT_DATETIME = new boolean[] {false} ;
      T000X2_A440TBM25_CRT_USER_ID = new String[] {""} ;
      T000X2_n440TBM25_CRT_USER_ID = new boolean[] {false} ;
      T000X2_A442TBM25_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000X2_n442TBM25_UPD_DATETIME = new boolean[] {false} ;
      T000X2_A443TBM25_UPD_USER_ID = new String[] {""} ;
      T000X2_n443TBM25_UPD_USER_ID = new boolean[] {false} ;
      T000X2_A445TBM25_UPD_CNT = new long[1] ;
      T000X2_n445TBM25_UPD_CNT = new boolean[] {false} ;
      T000X2_A437TBM25_LIST_NM = new String[] {""} ;
      T000X2_n437TBM25_LIST_NM = new boolean[] {false} ;
      T000X2_A438TBM25_DEL_FLG = new String[] {""} ;
      T000X2_n438TBM25_DEL_FLG = new boolean[] {false} ;
      T000X2_A441TBM25_CRT_PROG_NM = new String[] {""} ;
      T000X2_n441TBM25_CRT_PROG_NM = new boolean[] {false} ;
      T000X2_A444TBM25_UPD_PROG_NM = new String[] {""} ;
      T000X2_n444TBM25_UPD_PROG_NM = new boolean[] {false} ;
      T000X2_A435TBM25_STUDY_ID = new long[1] ;
      T000X13_A446TBM26_STUDY_ID = new long[1] ;
      T000X13_A447TBM26_LIST_CD = new String[] {""} ;
      T000X13_A448TBM26_LIST_ITEM_NO = new short[1] ;
      T000X14_A435TBM25_STUDY_ID = new long[1] ;
      T000X14_A436TBM25_LIST_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      T000X15_A435TBM25_STUDY_ID = new long[1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm25_sel_list__default(),
         new Object[] {
             new Object[] {
            T000X2_A436TBM25_LIST_CD, T000X2_A439TBM25_CRT_DATETIME, T000X2_n439TBM25_CRT_DATETIME, T000X2_A440TBM25_CRT_USER_ID, T000X2_n440TBM25_CRT_USER_ID, T000X2_A442TBM25_UPD_DATETIME, T000X2_n442TBM25_UPD_DATETIME, T000X2_A443TBM25_UPD_USER_ID, T000X2_n443TBM25_UPD_USER_ID, T000X2_A445TBM25_UPD_CNT,
            T000X2_n445TBM25_UPD_CNT, T000X2_A437TBM25_LIST_NM, T000X2_n437TBM25_LIST_NM, T000X2_A438TBM25_DEL_FLG, T000X2_n438TBM25_DEL_FLG, T000X2_A441TBM25_CRT_PROG_NM, T000X2_n441TBM25_CRT_PROG_NM, T000X2_A444TBM25_UPD_PROG_NM, T000X2_n444TBM25_UPD_PROG_NM, T000X2_A435TBM25_STUDY_ID
            }
            , new Object[] {
            T000X3_A436TBM25_LIST_CD, T000X3_A439TBM25_CRT_DATETIME, T000X3_n439TBM25_CRT_DATETIME, T000X3_A440TBM25_CRT_USER_ID, T000X3_n440TBM25_CRT_USER_ID, T000X3_A442TBM25_UPD_DATETIME, T000X3_n442TBM25_UPD_DATETIME, T000X3_A443TBM25_UPD_USER_ID, T000X3_n443TBM25_UPD_USER_ID, T000X3_A445TBM25_UPD_CNT,
            T000X3_n445TBM25_UPD_CNT, T000X3_A437TBM25_LIST_NM, T000X3_n437TBM25_LIST_NM, T000X3_A438TBM25_DEL_FLG, T000X3_n438TBM25_DEL_FLG, T000X3_A441TBM25_CRT_PROG_NM, T000X3_n441TBM25_CRT_PROG_NM, T000X3_A444TBM25_UPD_PROG_NM, T000X3_n444TBM25_UPD_PROG_NM, T000X3_A435TBM25_STUDY_ID
            }
            , new Object[] {
            T000X4_A435TBM25_STUDY_ID
            }
            , new Object[] {
            T000X5_A436TBM25_LIST_CD, T000X5_A439TBM25_CRT_DATETIME, T000X5_n439TBM25_CRT_DATETIME, T000X5_A440TBM25_CRT_USER_ID, T000X5_n440TBM25_CRT_USER_ID, T000X5_A442TBM25_UPD_DATETIME, T000X5_n442TBM25_UPD_DATETIME, T000X5_A443TBM25_UPD_USER_ID, T000X5_n443TBM25_UPD_USER_ID, T000X5_A445TBM25_UPD_CNT,
            T000X5_n445TBM25_UPD_CNT, T000X5_A437TBM25_LIST_NM, T000X5_n437TBM25_LIST_NM, T000X5_A438TBM25_DEL_FLG, T000X5_n438TBM25_DEL_FLG, T000X5_A441TBM25_CRT_PROG_NM, T000X5_n441TBM25_CRT_PROG_NM, T000X5_A444TBM25_UPD_PROG_NM, T000X5_n444TBM25_UPD_PROG_NM, T000X5_A435TBM25_STUDY_ID
            }
            , new Object[] {
            T000X6_A435TBM25_STUDY_ID
            }
            , new Object[] {
            T000X7_A435TBM25_STUDY_ID, T000X7_A436TBM25_LIST_CD
            }
            , new Object[] {
            T000X8_A435TBM25_STUDY_ID, T000X8_A436TBM25_LIST_CD
            }
            , new Object[] {
            T000X9_A435TBM25_STUDY_ID, T000X9_A436TBM25_LIST_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000X13_A446TBM26_STUDY_ID, T000X13_A447TBM26_LIST_CD, T000X13_A448TBM26_LIST_ITEM_NO
            }
            , new Object[] {
            T000X14_A435TBM25_STUDY_ID, T000X14_A436TBM25_LIST_CD
            }
            , new Object[] {
            T000X15_A435TBM25_STUDY_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM25_SEL_LIST" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound32 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM25_STUDY_ID_Enabled ;
   private int edtTBM25_LIST_CD_Enabled ;
   private int edtTBM25_LIST_NM_Enabled ;
   private int edtTBM25_DEL_FLG_Enabled ;
   private int edtTBM25_CRT_DATETIME_Enabled ;
   private int edtTBM25_CRT_USER_ID_Enabled ;
   private int edtTBM25_CRT_PROG_NM_Enabled ;
   private int edtTBM25_UPD_DATETIME_Enabled ;
   private int edtTBM25_UPD_USER_ID_Enabled ;
   private int edtTBM25_UPD_PROG_NM_Enabled ;
   private int edtTBM25_UPD_CNT_Enabled ;
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
   private int AnyError435 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A435TBM25_STUDY_ID ;
   private long A445TBM25_UPD_CNT ;
   private long Z435TBM25_STUDY_ID ;
   private long Z445TBM25_UPD_CNT ;
   private long O445TBM25_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM25_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm25_study_id_Internalname ;
   private String lblTextblocktbm25_study_id_Jsonclick ;
   private String edtTBM25_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm25_list_cd_Internalname ;
   private String lblTextblocktbm25_list_cd_Jsonclick ;
   private String edtTBM25_LIST_CD_Internalname ;
   private String edtTBM25_LIST_CD_Jsonclick ;
   private String lblTextblocktbm25_list_nm_Internalname ;
   private String lblTextblocktbm25_list_nm_Jsonclick ;
   private String edtTBM25_LIST_NM_Internalname ;
   private String edtTBM25_LIST_NM_Jsonclick ;
   private String lblTextblocktbm25_del_flg_Internalname ;
   private String lblTextblocktbm25_del_flg_Jsonclick ;
   private String edtTBM25_DEL_FLG_Internalname ;
   private String edtTBM25_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm25_crt_datetime_Internalname ;
   private String lblTextblocktbm25_crt_datetime_Jsonclick ;
   private String edtTBM25_CRT_DATETIME_Internalname ;
   private String edtTBM25_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm25_crt_user_id_Internalname ;
   private String lblTextblocktbm25_crt_user_id_Jsonclick ;
   private String edtTBM25_CRT_USER_ID_Internalname ;
   private String edtTBM25_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm25_crt_prog_nm_Internalname ;
   private String lblTextblocktbm25_crt_prog_nm_Jsonclick ;
   private String edtTBM25_CRT_PROG_NM_Internalname ;
   private String edtTBM25_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm25_upd_datetime_Internalname ;
   private String lblTextblocktbm25_upd_datetime_Jsonclick ;
   private String edtTBM25_UPD_DATETIME_Internalname ;
   private String edtTBM25_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm25_upd_user_id_Internalname ;
   private String lblTextblocktbm25_upd_user_id_Jsonclick ;
   private String edtTBM25_UPD_USER_ID_Internalname ;
   private String edtTBM25_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm25_upd_prog_nm_Internalname ;
   private String lblTextblocktbm25_upd_prog_nm_Jsonclick ;
   private String edtTBM25_UPD_PROG_NM_Internalname ;
   private String edtTBM25_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm25_upd_cnt_Internalname ;
   private String lblTextblocktbm25_upd_cnt_Jsonclick ;
   private String edtTBM25_UPD_CNT_Internalname ;
   private String edtTBM25_UPD_CNT_Jsonclick ;
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
   private String sMode32 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A439TBM25_CRT_DATETIME ;
   private java.util.Date A442TBM25_UPD_DATETIME ;
   private java.util.Date Z439TBM25_CRT_DATETIME ;
   private java.util.Date Z442TBM25_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n437TBM25_LIST_NM ;
   private boolean n438TBM25_DEL_FLG ;
   private boolean n439TBM25_CRT_DATETIME ;
   private boolean n440TBM25_CRT_USER_ID ;
   private boolean n441TBM25_CRT_PROG_NM ;
   private boolean n442TBM25_UPD_DATETIME ;
   private boolean n443TBM25_UPD_USER_ID ;
   private boolean n444TBM25_UPD_PROG_NM ;
   private boolean n445TBM25_UPD_CNT ;
   private boolean Gx_longc ;
   private String A436TBM25_LIST_CD ;
   private String A437TBM25_LIST_NM ;
   private String A438TBM25_DEL_FLG ;
   private String A440TBM25_CRT_USER_ID ;
   private String A441TBM25_CRT_PROG_NM ;
   private String A443TBM25_UPD_USER_ID ;
   private String A444TBM25_UPD_PROG_NM ;
   private String Z436TBM25_LIST_CD ;
   private String Z440TBM25_CRT_USER_ID ;
   private String Z443TBM25_UPD_USER_ID ;
   private String Z437TBM25_LIST_NM ;
   private String Z438TBM25_DEL_FLG ;
   private String Z441TBM25_CRT_PROG_NM ;
   private String Z444TBM25_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000X5_A436TBM25_LIST_CD ;
   private java.util.Date[] T000X5_A439TBM25_CRT_DATETIME ;
   private boolean[] T000X5_n439TBM25_CRT_DATETIME ;
   private String[] T000X5_A440TBM25_CRT_USER_ID ;
   private boolean[] T000X5_n440TBM25_CRT_USER_ID ;
   private java.util.Date[] T000X5_A442TBM25_UPD_DATETIME ;
   private boolean[] T000X5_n442TBM25_UPD_DATETIME ;
   private String[] T000X5_A443TBM25_UPD_USER_ID ;
   private boolean[] T000X5_n443TBM25_UPD_USER_ID ;
   private long[] T000X5_A445TBM25_UPD_CNT ;
   private boolean[] T000X5_n445TBM25_UPD_CNT ;
   private String[] T000X5_A437TBM25_LIST_NM ;
   private boolean[] T000X5_n437TBM25_LIST_NM ;
   private String[] T000X5_A438TBM25_DEL_FLG ;
   private boolean[] T000X5_n438TBM25_DEL_FLG ;
   private String[] T000X5_A441TBM25_CRT_PROG_NM ;
   private boolean[] T000X5_n441TBM25_CRT_PROG_NM ;
   private String[] T000X5_A444TBM25_UPD_PROG_NM ;
   private boolean[] T000X5_n444TBM25_UPD_PROG_NM ;
   private long[] T000X5_A435TBM25_STUDY_ID ;
   private long[] T000X4_A435TBM25_STUDY_ID ;
   private long[] T000X6_A435TBM25_STUDY_ID ;
   private long[] T000X7_A435TBM25_STUDY_ID ;
   private String[] T000X7_A436TBM25_LIST_CD ;
   private String[] T000X3_A436TBM25_LIST_CD ;
   private java.util.Date[] T000X3_A439TBM25_CRT_DATETIME ;
   private boolean[] T000X3_n439TBM25_CRT_DATETIME ;
   private String[] T000X3_A440TBM25_CRT_USER_ID ;
   private boolean[] T000X3_n440TBM25_CRT_USER_ID ;
   private java.util.Date[] T000X3_A442TBM25_UPD_DATETIME ;
   private boolean[] T000X3_n442TBM25_UPD_DATETIME ;
   private String[] T000X3_A443TBM25_UPD_USER_ID ;
   private boolean[] T000X3_n443TBM25_UPD_USER_ID ;
   private long[] T000X3_A445TBM25_UPD_CNT ;
   private boolean[] T000X3_n445TBM25_UPD_CNT ;
   private String[] T000X3_A437TBM25_LIST_NM ;
   private boolean[] T000X3_n437TBM25_LIST_NM ;
   private String[] T000X3_A438TBM25_DEL_FLG ;
   private boolean[] T000X3_n438TBM25_DEL_FLG ;
   private String[] T000X3_A441TBM25_CRT_PROG_NM ;
   private boolean[] T000X3_n441TBM25_CRT_PROG_NM ;
   private String[] T000X3_A444TBM25_UPD_PROG_NM ;
   private boolean[] T000X3_n444TBM25_UPD_PROG_NM ;
   private long[] T000X3_A435TBM25_STUDY_ID ;
   private long[] T000X8_A435TBM25_STUDY_ID ;
   private String[] T000X8_A436TBM25_LIST_CD ;
   private long[] T000X9_A435TBM25_STUDY_ID ;
   private String[] T000X9_A436TBM25_LIST_CD ;
   private String[] T000X2_A436TBM25_LIST_CD ;
   private java.util.Date[] T000X2_A439TBM25_CRT_DATETIME ;
   private boolean[] T000X2_n439TBM25_CRT_DATETIME ;
   private String[] T000X2_A440TBM25_CRT_USER_ID ;
   private boolean[] T000X2_n440TBM25_CRT_USER_ID ;
   private java.util.Date[] T000X2_A442TBM25_UPD_DATETIME ;
   private boolean[] T000X2_n442TBM25_UPD_DATETIME ;
   private String[] T000X2_A443TBM25_UPD_USER_ID ;
   private boolean[] T000X2_n443TBM25_UPD_USER_ID ;
   private long[] T000X2_A445TBM25_UPD_CNT ;
   private boolean[] T000X2_n445TBM25_UPD_CNT ;
   private String[] T000X2_A437TBM25_LIST_NM ;
   private boolean[] T000X2_n437TBM25_LIST_NM ;
   private String[] T000X2_A438TBM25_DEL_FLG ;
   private boolean[] T000X2_n438TBM25_DEL_FLG ;
   private String[] T000X2_A441TBM25_CRT_PROG_NM ;
   private boolean[] T000X2_n441TBM25_CRT_PROG_NM ;
   private String[] T000X2_A444TBM25_UPD_PROG_NM ;
   private boolean[] T000X2_n444TBM25_UPD_PROG_NM ;
   private long[] T000X2_A435TBM25_STUDY_ID ;
   private long[] T000X13_A446TBM26_STUDY_ID ;
   private String[] T000X13_A447TBM26_LIST_CD ;
   private short[] T000X13_A448TBM26_LIST_ITEM_NO ;
   private long[] T000X14_A435TBM25_STUDY_ID ;
   private String[] T000X14_A436TBM25_LIST_CD ;
   private long[] T000X15_A435TBM25_STUDY_ID ;
}

final  class tbm25_sel_list__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000X2", "SELECT `TBM25_LIST_CD`, `TBM25_CRT_DATETIME`, `TBM25_CRT_USER_ID`, `TBM25_UPD_DATETIME`, `TBM25_UPD_USER_ID`, `TBM25_UPD_CNT`, `TBM25_LIST_NM`, `TBM25_DEL_FLG`, `TBM25_CRT_PROG_NM`, `TBM25_UPD_PROG_NM`, `TBM25_STUDY_ID` AS TBM25_STUDY_ID FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X3", "SELECT `TBM25_LIST_CD`, `TBM25_CRT_DATETIME`, `TBM25_CRT_USER_ID`, `TBM25_UPD_DATETIME`, `TBM25_UPD_USER_ID`, `TBM25_UPD_CNT`, `TBM25_LIST_NM`, `TBM25_DEL_FLG`, `TBM25_CRT_PROG_NM`, `TBM25_UPD_PROG_NM`, `TBM25_STUDY_ID` AS TBM25_STUDY_ID FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X4", "SELECT `TBM21_STUDY_ID` AS TBM25_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X5", "SELECT TM1.`TBM25_LIST_CD`, TM1.`TBM25_CRT_DATETIME`, TM1.`TBM25_CRT_USER_ID`, TM1.`TBM25_UPD_DATETIME`, TM1.`TBM25_UPD_USER_ID`, TM1.`TBM25_UPD_CNT`, TM1.`TBM25_LIST_NM`, TM1.`TBM25_DEL_FLG`, TM1.`TBM25_CRT_PROG_NM`, TM1.`TBM25_UPD_PROG_NM`, TM1.`TBM25_STUDY_ID` AS TBM25_STUDY_ID FROM `TBM25_SEL_LIST` TM1 WHERE TM1.`TBM25_STUDY_ID` = ? and TM1.`TBM25_LIST_CD` = ? ORDER BY TM1.`TBM25_STUDY_ID`, TM1.`TBM25_LIST_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000X6", "SELECT `TBM21_STUDY_ID` AS TBM25_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X7", "SELECT `TBM25_STUDY_ID` AS TBM25_STUDY_ID, `TBM25_LIST_CD` FROM `TBM25_SEL_LIST` WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000X8", "SELECT `TBM25_STUDY_ID` AS TBM25_STUDY_ID, `TBM25_LIST_CD` FROM `TBM25_SEL_LIST` WHERE ( `TBM25_STUDY_ID` > ? or `TBM25_STUDY_ID` = ? and `TBM25_LIST_CD` > ?) ORDER BY `TBM25_STUDY_ID`, `TBM25_LIST_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000X9", "SELECT `TBM25_STUDY_ID` AS TBM25_STUDY_ID, `TBM25_LIST_CD` FROM `TBM25_SEL_LIST` WHERE ( `TBM25_STUDY_ID` < ? or `TBM25_STUDY_ID` = ? and `TBM25_LIST_CD` < ?) ORDER BY `TBM25_STUDY_ID` DESC, `TBM25_LIST_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000X10", "INSERT INTO `TBM25_SEL_LIST` (`TBM25_LIST_CD`, `TBM25_CRT_DATETIME`, `TBM25_CRT_USER_ID`, `TBM25_UPD_DATETIME`, `TBM25_UPD_USER_ID`, `TBM25_UPD_CNT`, `TBM25_LIST_NM`, `TBM25_DEL_FLG`, `TBM25_CRT_PROG_NM`, `TBM25_UPD_PROG_NM`, `TBM25_STUDY_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000X11", "UPDATE `TBM25_SEL_LIST` SET `TBM25_CRT_DATETIME`=?, `TBM25_CRT_USER_ID`=?, `TBM25_UPD_DATETIME`=?, `TBM25_UPD_USER_ID`=?, `TBM25_UPD_CNT`=?, `TBM25_LIST_NM`=?, `TBM25_DEL_FLG`=?, `TBM25_CRT_PROG_NM`=?, `TBM25_UPD_PROG_NM`=?  WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000X12", "DELETE FROM `TBM25_SEL_LIST`  WHERE `TBM25_STUDY_ID` = ? AND `TBM25_LIST_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000X13", "SELECT `TBM26_STUDY_ID`, `TBM26_LIST_CD`, `TBM26_LIST_ITEM_NO` FROM `TBM26_SEL_LIST_ITEM` WHERE `TBM26_STUDY_ID` = ? AND `TBM26_LIST_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000X14", "SELECT `TBM25_STUDY_ID` AS TBM25_STUDY_ID, `TBM25_LIST_CD` FROM `TBM25_SEL_LIST` ORDER BY `TBM25_STUDY_ID`, `TBM25_LIST_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000X15", "SELECT `TBM21_STUDY_ID` AS TBM25_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               ((long[]) buf[19])[0] = rslt.getLong(11) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 6 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 12 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 20, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 20, false);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
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
                  stmt.setVarchar(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 40);
               }
               stmt.setLong(11, ((Number) parms[19]).longValue());
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
                  stmt.setVarchar(7, (String)parms[13], 1);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 40);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 40);
               }
               stmt.setLong(10, ((Number) parms[18]).longValue());
               stmt.setVarchar(11, (String)parms[19], 20, false);
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 11 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20);
               break;
            case 13 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
      }
   }

}

