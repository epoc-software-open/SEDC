/*
               File: tbt01_subject_impl
        Description: 患者テーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:14.76
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbt01_subject_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBT01_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbt01_crt_user_id0O23( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBT01_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbt01_upd_user_id0O23( Gx_mode) ;
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
      Form.getMeta().addItem("Description", "患者テーブル", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBT01_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbt01_subject_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbt01_subject_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbt01_subject_impl.class ));
   }

   public tbt01_subject_impl( int remoteHandle ,
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
         wb_table1_2_0O23( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0O23e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0O23( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0O23( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0O23( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0O23e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"患者テーブル"+"</legend>") ;
         wb_table3_27_0O23( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0O23e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0O23e( true) ;
      }
      else
      {
         wb_table1_2_0O23e( false) ;
      }
   }

   public void wb_table3_27_0O23( boolean wbgen )
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
         wb_table4_33_0O23( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0O23e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT01_SUBJECT.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT01_SUBJECT.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0O23e( true) ;
      }
      else
      {
         wb_table3_27_0O23e( false) ;
      }
   }

   public void wb_table4_33_0O23( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_study_id_Internalname, "試験ID", "", "", lblTextblocktbt01_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A282TBT01_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBT01_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A282TBT01_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A282TBT01_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBT01_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_subject_id_Internalname, "患者ID", "", "", lblTextblocktbt01_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A283TBT01_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBT01_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A283TBT01_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A283TBT01_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBT01_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_outer_subject_id_Internalname, "ID", "", "", lblTextblocktbt01_outer_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A555TBT01_OUTER_SUBJECT_ID", A555TBT01_OUTER_SUBJECT_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_OUTER_SUBJECT_ID_Internalname, GXutil.rtrim( A555TBT01_OUTER_SUBJECT_ID), GXutil.rtrim( localUtil.format( A555TBT01_OUTER_SUBJECT_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBT01_OUTER_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_OUTER_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_site_id_Internalname, "ID", "", "", lblTextblocktbt01_site_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A613TBT01_SITE_ID", A613TBT01_SITE_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_SITE_ID_Internalname, GXutil.rtrim( A613TBT01_SITE_ID), GXutil.rtrim( localUtil.format( A613TBT01_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBT01_SITE_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_SITE_ID_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbt01_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A284TBT01_DEL_FLG", A284TBT01_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_DEL_FLG_Internalname, GXutil.rtrim( A284TBT01_DEL_FLG), GXutil.rtrim( localUtil.format( A284TBT01_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTBT01_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbt01_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A285TBT01_CRT_DATETIME", localUtil.ttoc( A285TBT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT01_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_CRT_DATETIME_Internalname, localUtil.format(A285TBT01_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A285TBT01_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(63);\"", "", "", "", "", edtTBT01_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT01_SUBJECT.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT01_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT01_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbt01_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A286TBT01_CRT_USER_ID", A286TBT01_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_CRT_USER_ID_Internalname, GXutil.rtrim( A286TBT01_CRT_USER_ID), GXutil.rtrim( localUtil.format( A286TBT01_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBT01_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbt01_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A287TBT01_CRT_PROG_NM", A287TBT01_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_CRT_PROG_NM_Internalname, GXutil.rtrim( A287TBT01_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A287TBT01_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBT01_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbt01_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A288TBT01_UPD_DATETIME", localUtil.ttoc( A288TBT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBT01_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_UPD_DATETIME_Internalname, localUtil.format(A288TBT01_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A288TBT01_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(78);\"", "", "", "", "", edtTBT01_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT01_SUBJECT.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBT01_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBT01_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbt01_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A289TBT01_UPD_USER_ID", A289TBT01_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_UPD_USER_ID_Internalname, GXutil.rtrim( A289TBT01_UPD_USER_ID), GXutil.rtrim( localUtil.format( A289TBT01_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBT01_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbt01_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A290TBT01_UPD_PROG_NM", A290TBT01_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_UPD_PROG_NM_Internalname, GXutil.rtrim( A290TBT01_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A290TBT01_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBT01_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbt01_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbt01_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A291TBT01_UPD_CNT", GXutil.ltrim( GXutil.str( A291TBT01_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBT01_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A291TBT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBT01_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A291TBT01_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A291TBT01_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBT01_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBT01_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBT01_SUBJECT.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0O23e( true) ;
      }
      else
      {
         wb_table4_33_0O23e( false) ;
      }
   }

   public void wb_table2_5_0O23( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBT01_SUBJECT.htm");
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
         wb_table2_5_0O23e( true) ;
      }
      else
      {
         wb_table2_5_0O23e( false) ;
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
      /* Execute user event: e110O2 */
      e110O2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT01_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT01_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT01_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT01_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A282TBT01_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
            }
            else
            {
               A282TBT01_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBT01_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT01_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT01_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT01_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT01_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A283TBT01_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A283TBT01_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBT01_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
            }
            A555TBT01_OUTER_SUBJECT_ID = httpContext.cgiGet( edtTBT01_OUTER_SUBJECT_ID_Internalname) ;
            n555TBT01_OUTER_SUBJECT_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A555TBT01_OUTER_SUBJECT_ID", A555TBT01_OUTER_SUBJECT_ID);
            n555TBT01_OUTER_SUBJECT_ID = ((GXutil.strcmp("", A555TBT01_OUTER_SUBJECT_ID)==0) ? true : false) ;
            A613TBT01_SITE_ID = httpContext.cgiGet( edtTBT01_SITE_ID_Internalname) ;
            n613TBT01_SITE_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A613TBT01_SITE_ID", A613TBT01_SITE_ID);
            n613TBT01_SITE_ID = ((GXutil.strcmp("", A613TBT01_SITE_ID)==0) ? true : false) ;
            A284TBT01_DEL_FLG = httpContext.cgiGet( edtTBT01_DEL_FLG_Internalname) ;
            n284TBT01_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A284TBT01_DEL_FLG", A284TBT01_DEL_FLG);
            n284TBT01_DEL_FLG = ((GXutil.strcmp("", A284TBT01_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT01_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBT01_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT01_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A285TBT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n285TBT01_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A285TBT01_CRT_DATETIME", localUtil.ttoc( A285TBT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A285TBT01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT01_CRT_DATETIME_Internalname)) ;
               n285TBT01_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A285TBT01_CRT_DATETIME", localUtil.ttoc( A285TBT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n285TBT01_CRT_DATETIME = (GXutil.nullDate().equals(A285TBT01_CRT_DATETIME) ? true : false) ;
            A286TBT01_CRT_USER_ID = httpContext.cgiGet( edtTBT01_CRT_USER_ID_Internalname) ;
            n286TBT01_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A286TBT01_CRT_USER_ID", A286TBT01_CRT_USER_ID);
            n286TBT01_CRT_USER_ID = ((GXutil.strcmp("", A286TBT01_CRT_USER_ID)==0) ? true : false) ;
            A287TBT01_CRT_PROG_NM = httpContext.cgiGet( edtTBT01_CRT_PROG_NM_Internalname) ;
            n287TBT01_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A287TBT01_CRT_PROG_NM", A287TBT01_CRT_PROG_NM);
            n287TBT01_CRT_PROG_NM = ((GXutil.strcmp("", A287TBT01_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBT01_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBT01_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT01_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A288TBT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n288TBT01_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A288TBT01_UPD_DATETIME", localUtil.ttoc( A288TBT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A288TBT01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBT01_UPD_DATETIME_Internalname)) ;
               n288TBT01_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A288TBT01_UPD_DATETIME", localUtil.ttoc( A288TBT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n288TBT01_UPD_DATETIME = (GXutil.nullDate().equals(A288TBT01_UPD_DATETIME) ? true : false) ;
            A289TBT01_UPD_USER_ID = httpContext.cgiGet( edtTBT01_UPD_USER_ID_Internalname) ;
            n289TBT01_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A289TBT01_UPD_USER_ID", A289TBT01_UPD_USER_ID);
            n289TBT01_UPD_USER_ID = ((GXutil.strcmp("", A289TBT01_UPD_USER_ID)==0) ? true : false) ;
            A290TBT01_UPD_PROG_NM = httpContext.cgiGet( edtTBT01_UPD_PROG_NM_Internalname) ;
            n290TBT01_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A290TBT01_UPD_PROG_NM", A290TBT01_UPD_PROG_NM);
            n290TBT01_UPD_PROG_NM = ((GXutil.strcmp("", A290TBT01_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBT01_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBT01_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBT01_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT01_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A291TBT01_UPD_CNT = 0 ;
               n291TBT01_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A291TBT01_UPD_CNT", GXutil.ltrim( GXutil.str( A291TBT01_UPD_CNT, 10, 0)));
            }
            else
            {
               A291TBT01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBT01_UPD_CNT_Internalname), ".", ",") ;
               n291TBT01_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A291TBT01_UPD_CNT", GXutil.ltrim( GXutil.str( A291TBT01_UPD_CNT, 10, 0)));
            }
            n291TBT01_UPD_CNT = ((0==A291TBT01_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z282TBT01_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z282TBT01_STUDY_ID"), ".", ",") ;
            Z283TBT01_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z283TBT01_SUBJECT_ID"), ".", ",")) ;
            Z285TBT01_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z285TBT01_CRT_DATETIME"), 0) ;
            n285TBT01_CRT_DATETIME = (GXutil.nullDate().equals(A285TBT01_CRT_DATETIME) ? true : false) ;
            Z286TBT01_CRT_USER_ID = httpContext.cgiGet( "Z286TBT01_CRT_USER_ID") ;
            n286TBT01_CRT_USER_ID = ((GXutil.strcmp("", A286TBT01_CRT_USER_ID)==0) ? true : false) ;
            Z288TBT01_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z288TBT01_UPD_DATETIME"), 0) ;
            n288TBT01_UPD_DATETIME = (GXutil.nullDate().equals(A288TBT01_UPD_DATETIME) ? true : false) ;
            Z289TBT01_UPD_USER_ID = httpContext.cgiGet( "Z289TBT01_UPD_USER_ID") ;
            n289TBT01_UPD_USER_ID = ((GXutil.strcmp("", A289TBT01_UPD_USER_ID)==0) ? true : false) ;
            Z291TBT01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z291TBT01_UPD_CNT"), ".", ",") ;
            n291TBT01_UPD_CNT = ((0==A291TBT01_UPD_CNT) ? true : false) ;
            Z555TBT01_OUTER_SUBJECT_ID = httpContext.cgiGet( "Z555TBT01_OUTER_SUBJECT_ID") ;
            n555TBT01_OUTER_SUBJECT_ID = ((GXutil.strcmp("", A555TBT01_OUTER_SUBJECT_ID)==0) ? true : false) ;
            Z613TBT01_SITE_ID = httpContext.cgiGet( "Z613TBT01_SITE_ID") ;
            n613TBT01_SITE_ID = ((GXutil.strcmp("", A613TBT01_SITE_ID)==0) ? true : false) ;
            Z284TBT01_DEL_FLG = httpContext.cgiGet( "Z284TBT01_DEL_FLG") ;
            n284TBT01_DEL_FLG = ((GXutil.strcmp("", A284TBT01_DEL_FLG)==0) ? true : false) ;
            Z287TBT01_CRT_PROG_NM = httpContext.cgiGet( "Z287TBT01_CRT_PROG_NM") ;
            n287TBT01_CRT_PROG_NM = ((GXutil.strcmp("", A287TBT01_CRT_PROG_NM)==0) ? true : false) ;
            Z290TBT01_UPD_PROG_NM = httpContext.cgiGet( "Z290TBT01_UPD_PROG_NM") ;
            n290TBT01_UPD_PROG_NM = ((GXutil.strcmp("", A290TBT01_UPD_PROG_NM)==0) ? true : false) ;
            O291TBT01_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O291TBT01_UPD_CNT"), ".", ",") ;
            n291TBT01_UPD_CNT = ((0==A291TBT01_UPD_CNT) ? true : false) ;
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
               A282TBT01_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
               A283TBT01_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
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
                     /* Execute user event: e110O2 */
                     e110O2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120O2 */
                     e120O2 ();
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
         /* Execute user event: e120O2 */
         e120O2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0O23( ) ;
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
      disableAttributes0O23( ) ;
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

   public void resetCaption0O0( )
   {
   }

   public void e110O2( )
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

   public void e120O2( )
   {
      /* After Trn Routine */
   }

   public void S1165( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0O23( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z285TBT01_CRT_DATETIME = T000O3_A285TBT01_CRT_DATETIME[0] ;
            Z286TBT01_CRT_USER_ID = T000O3_A286TBT01_CRT_USER_ID[0] ;
            Z288TBT01_UPD_DATETIME = T000O3_A288TBT01_UPD_DATETIME[0] ;
            Z289TBT01_UPD_USER_ID = T000O3_A289TBT01_UPD_USER_ID[0] ;
            Z291TBT01_UPD_CNT = T000O3_A291TBT01_UPD_CNT[0] ;
            Z555TBT01_OUTER_SUBJECT_ID = T000O3_A555TBT01_OUTER_SUBJECT_ID[0] ;
            Z613TBT01_SITE_ID = T000O3_A613TBT01_SITE_ID[0] ;
            Z284TBT01_DEL_FLG = T000O3_A284TBT01_DEL_FLG[0] ;
            Z287TBT01_CRT_PROG_NM = T000O3_A287TBT01_CRT_PROG_NM[0] ;
            Z290TBT01_UPD_PROG_NM = T000O3_A290TBT01_UPD_PROG_NM[0] ;
         }
         else
         {
            Z285TBT01_CRT_DATETIME = A285TBT01_CRT_DATETIME ;
            Z286TBT01_CRT_USER_ID = A286TBT01_CRT_USER_ID ;
            Z288TBT01_UPD_DATETIME = A288TBT01_UPD_DATETIME ;
            Z289TBT01_UPD_USER_ID = A289TBT01_UPD_USER_ID ;
            Z291TBT01_UPD_CNT = A291TBT01_UPD_CNT ;
            Z555TBT01_OUTER_SUBJECT_ID = A555TBT01_OUTER_SUBJECT_ID ;
            Z613TBT01_SITE_ID = A613TBT01_SITE_ID ;
            Z284TBT01_DEL_FLG = A284TBT01_DEL_FLG ;
            Z287TBT01_CRT_PROG_NM = A287TBT01_CRT_PROG_NM ;
            Z290TBT01_UPD_PROG_NM = A290TBT01_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z282TBT01_STUDY_ID = A282TBT01_STUDY_ID ;
         Z283TBT01_SUBJECT_ID = A283TBT01_SUBJECT_ID ;
         Z285TBT01_CRT_DATETIME = A285TBT01_CRT_DATETIME ;
         Z286TBT01_CRT_USER_ID = A286TBT01_CRT_USER_ID ;
         Z288TBT01_UPD_DATETIME = A288TBT01_UPD_DATETIME ;
         Z289TBT01_UPD_USER_ID = A289TBT01_UPD_USER_ID ;
         Z291TBT01_UPD_CNT = A291TBT01_UPD_CNT ;
         Z555TBT01_OUTER_SUBJECT_ID = A555TBT01_OUTER_SUBJECT_ID ;
         Z613TBT01_SITE_ID = A613TBT01_SITE_ID ;
         Z284TBT01_DEL_FLG = A284TBT01_DEL_FLG ;
         Z287TBT01_CRT_PROG_NM = A287TBT01_CRT_PROG_NM ;
         Z290TBT01_UPD_PROG_NM = A290TBT01_UPD_PROG_NM ;
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

   public void load0O23( )
   {
      /* Using cursor T000O4 */
      pr_default.execute(2, new Object[] {new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound23 = (short)(1) ;
         A285TBT01_CRT_DATETIME = T000O4_A285TBT01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A285TBT01_CRT_DATETIME", localUtil.ttoc( A285TBT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n285TBT01_CRT_DATETIME = T000O4_n285TBT01_CRT_DATETIME[0] ;
         A286TBT01_CRT_USER_ID = T000O4_A286TBT01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A286TBT01_CRT_USER_ID", A286TBT01_CRT_USER_ID);
         n286TBT01_CRT_USER_ID = T000O4_n286TBT01_CRT_USER_ID[0] ;
         A288TBT01_UPD_DATETIME = T000O4_A288TBT01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A288TBT01_UPD_DATETIME", localUtil.ttoc( A288TBT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n288TBT01_UPD_DATETIME = T000O4_n288TBT01_UPD_DATETIME[0] ;
         A289TBT01_UPD_USER_ID = T000O4_A289TBT01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A289TBT01_UPD_USER_ID", A289TBT01_UPD_USER_ID);
         n289TBT01_UPD_USER_ID = T000O4_n289TBT01_UPD_USER_ID[0] ;
         A291TBT01_UPD_CNT = T000O4_A291TBT01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291TBT01_UPD_CNT", GXutil.ltrim( GXutil.str( A291TBT01_UPD_CNT, 10, 0)));
         n291TBT01_UPD_CNT = T000O4_n291TBT01_UPD_CNT[0] ;
         A555TBT01_OUTER_SUBJECT_ID = T000O4_A555TBT01_OUTER_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A555TBT01_OUTER_SUBJECT_ID", A555TBT01_OUTER_SUBJECT_ID);
         n555TBT01_OUTER_SUBJECT_ID = T000O4_n555TBT01_OUTER_SUBJECT_ID[0] ;
         A613TBT01_SITE_ID = T000O4_A613TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A613TBT01_SITE_ID", A613TBT01_SITE_ID);
         n613TBT01_SITE_ID = T000O4_n613TBT01_SITE_ID[0] ;
         A284TBT01_DEL_FLG = T000O4_A284TBT01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TBT01_DEL_FLG", A284TBT01_DEL_FLG);
         n284TBT01_DEL_FLG = T000O4_n284TBT01_DEL_FLG[0] ;
         A287TBT01_CRT_PROG_NM = T000O4_A287TBT01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A287TBT01_CRT_PROG_NM", A287TBT01_CRT_PROG_NM);
         n287TBT01_CRT_PROG_NM = T000O4_n287TBT01_CRT_PROG_NM[0] ;
         A290TBT01_UPD_PROG_NM = T000O4_A290TBT01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A290TBT01_UPD_PROG_NM", A290TBT01_UPD_PROG_NM);
         n290TBT01_UPD_PROG_NM = T000O4_n290TBT01_UPD_PROG_NM[0] ;
         zm0O23( -8) ;
      }
      pr_default.close(2);
      onLoadActions0O23( ) ;
   }

   public void onLoadActions0O23( )
   {
      AV9Pgmname = "TBT01_SUBJECT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0O23( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBT01_SUBJECT" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A285TBT01_CRT_DATETIME) || (( A285TBT01_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A285TBT01_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A288TBT01_UPD_DATETIME) || (( A288TBT01_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A288TBT01_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0O23( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0O23( )
   {
      /* Using cursor T000O5 */
      pr_default.execute(3, new Object[] {new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound23 = (short)(1) ;
      }
      else
      {
         RcdFound23 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000O3 */
      pr_default.execute(1, new Object[] {new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0O23( 8) ;
         RcdFound23 = (short)(1) ;
         A282TBT01_STUDY_ID = T000O3_A282TBT01_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
         A283TBT01_SUBJECT_ID = T000O3_A283TBT01_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
         A285TBT01_CRT_DATETIME = T000O3_A285TBT01_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A285TBT01_CRT_DATETIME", localUtil.ttoc( A285TBT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n285TBT01_CRT_DATETIME = T000O3_n285TBT01_CRT_DATETIME[0] ;
         A286TBT01_CRT_USER_ID = T000O3_A286TBT01_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A286TBT01_CRT_USER_ID", A286TBT01_CRT_USER_ID);
         n286TBT01_CRT_USER_ID = T000O3_n286TBT01_CRT_USER_ID[0] ;
         A288TBT01_UPD_DATETIME = T000O3_A288TBT01_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A288TBT01_UPD_DATETIME", localUtil.ttoc( A288TBT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n288TBT01_UPD_DATETIME = T000O3_n288TBT01_UPD_DATETIME[0] ;
         A289TBT01_UPD_USER_ID = T000O3_A289TBT01_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A289TBT01_UPD_USER_ID", A289TBT01_UPD_USER_ID);
         n289TBT01_UPD_USER_ID = T000O3_n289TBT01_UPD_USER_ID[0] ;
         A291TBT01_UPD_CNT = T000O3_A291TBT01_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291TBT01_UPD_CNT", GXutil.ltrim( GXutil.str( A291TBT01_UPD_CNT, 10, 0)));
         n291TBT01_UPD_CNT = T000O3_n291TBT01_UPD_CNT[0] ;
         A555TBT01_OUTER_SUBJECT_ID = T000O3_A555TBT01_OUTER_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A555TBT01_OUTER_SUBJECT_ID", A555TBT01_OUTER_SUBJECT_ID);
         n555TBT01_OUTER_SUBJECT_ID = T000O3_n555TBT01_OUTER_SUBJECT_ID[0] ;
         A613TBT01_SITE_ID = T000O3_A613TBT01_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A613TBT01_SITE_ID", A613TBT01_SITE_ID);
         n613TBT01_SITE_ID = T000O3_n613TBT01_SITE_ID[0] ;
         A284TBT01_DEL_FLG = T000O3_A284TBT01_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A284TBT01_DEL_FLG", A284TBT01_DEL_FLG);
         n284TBT01_DEL_FLG = T000O3_n284TBT01_DEL_FLG[0] ;
         A287TBT01_CRT_PROG_NM = T000O3_A287TBT01_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A287TBT01_CRT_PROG_NM", A287TBT01_CRT_PROG_NM);
         n287TBT01_CRT_PROG_NM = T000O3_n287TBT01_CRT_PROG_NM[0] ;
         A290TBT01_UPD_PROG_NM = T000O3_A290TBT01_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A290TBT01_UPD_PROG_NM", A290TBT01_UPD_PROG_NM);
         n290TBT01_UPD_PROG_NM = T000O3_n290TBT01_UPD_PROG_NM[0] ;
         O291TBT01_UPD_CNT = A291TBT01_UPD_CNT ;
         n291TBT01_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A291TBT01_UPD_CNT", GXutil.ltrim( GXutil.str( A291TBT01_UPD_CNT, 10, 0)));
         Z282TBT01_STUDY_ID = A282TBT01_STUDY_ID ;
         Z283TBT01_SUBJECT_ID = A283TBT01_SUBJECT_ID ;
         sMode23 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0O23( ) ;
         Gx_mode = sMode23 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound23 = (short)(0) ;
         initializeNonKey0O23( ) ;
         sMode23 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode23 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0O23( ) ;
      if ( RcdFound23 == 0 )
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
      RcdFound23 = (short)(0) ;
      /* Using cursor T000O6 */
      pr_default.execute(4, new Object[] {new Long(A282TBT01_STUDY_ID), new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000O6_A282TBT01_STUDY_ID[0] < A282TBT01_STUDY_ID ) || ( T000O6_A282TBT01_STUDY_ID[0] == A282TBT01_STUDY_ID ) && ( T000O6_A283TBT01_SUBJECT_ID[0] < A283TBT01_SUBJECT_ID ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000O6_A282TBT01_STUDY_ID[0] > A282TBT01_STUDY_ID ) || ( T000O6_A282TBT01_STUDY_ID[0] == A282TBT01_STUDY_ID ) && ( T000O6_A283TBT01_SUBJECT_ID[0] > A283TBT01_SUBJECT_ID ) ) )
         {
            A282TBT01_STUDY_ID = T000O6_A282TBT01_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
            A283TBT01_SUBJECT_ID = T000O6_A283TBT01_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
            RcdFound23 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound23 = (short)(0) ;
      /* Using cursor T000O7 */
      pr_default.execute(5, new Object[] {new Long(A282TBT01_STUDY_ID), new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000O7_A282TBT01_STUDY_ID[0] > A282TBT01_STUDY_ID ) || ( T000O7_A282TBT01_STUDY_ID[0] == A282TBT01_STUDY_ID ) && ( T000O7_A283TBT01_SUBJECT_ID[0] > A283TBT01_SUBJECT_ID ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000O7_A282TBT01_STUDY_ID[0] < A282TBT01_STUDY_ID ) || ( T000O7_A282TBT01_STUDY_ID[0] == A282TBT01_STUDY_ID ) && ( T000O7_A283TBT01_SUBJECT_ID[0] < A283TBT01_SUBJECT_ID ) ) )
         {
            A282TBT01_STUDY_ID = T000O7_A282TBT01_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
            A283TBT01_SUBJECT_ID = T000O7_A283TBT01_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
            RcdFound23 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0O23( ) ;
      if ( RcdFound23 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBT01_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBT01_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A282TBT01_STUDY_ID != Z282TBT01_STUDY_ID ) || ( A283TBT01_SUBJECT_ID != Z283TBT01_SUBJECT_ID ) )
         {
            A282TBT01_STUDY_ID = Z282TBT01_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
            A283TBT01_SUBJECT_ID = Z283TBT01_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBT01_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBT01_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBT01_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update0O23( ) ;
            GX_FocusControl = edtTBT01_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A282TBT01_STUDY_ID != Z282TBT01_STUDY_ID ) || ( A283TBT01_SUBJECT_ID != Z283TBT01_SUBJECT_ID ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBT01_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0O23( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBT01_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBT01_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBT01_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0O23( ) ;
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
      if ( ( A282TBT01_STUDY_ID != Z282TBT01_STUDY_ID ) || ( A283TBT01_SUBJECT_ID != Z283TBT01_SUBJECT_ID ) )
      {
         A282TBT01_STUDY_ID = Z282TBT01_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
         A283TBT01_SUBJECT_ID = Z283TBT01_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBT01_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBT01_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBT01_STUDY_ID_Internalname ;
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
      if ( RcdFound23 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBT01_STUDY_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBT01_OUTER_SUBJECT_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0O23( ) ;
      if ( RcdFound23 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT01_OUTER_SUBJECT_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0O23( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound23 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT01_OUTER_SUBJECT_ID_Internalname ;
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
      if ( RcdFound23 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT01_OUTER_SUBJECT_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0O23( ) ;
      if ( RcdFound23 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound23 != 0 )
         {
            scanNext0O23( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBT01_OUTER_SUBJECT_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0O23( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0O23( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000O2 */
         pr_default.execute(0, new Object[] {new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT01_SUBJECT"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z285TBT01_CRT_DATETIME.equals( T000O2_A285TBT01_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z286TBT01_CRT_USER_ID, T000O2_A286TBT01_CRT_USER_ID[0]) != 0 ) || !( Z288TBT01_UPD_DATETIME.equals( T000O2_A288TBT01_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z289TBT01_UPD_USER_ID, T000O2_A289TBT01_UPD_USER_ID[0]) != 0 ) || ( Z291TBT01_UPD_CNT != T000O2_A291TBT01_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z555TBT01_OUTER_SUBJECT_ID, T000O2_A555TBT01_OUTER_SUBJECT_ID[0]) != 0 ) || ( GXutil.strcmp(Z613TBT01_SITE_ID, T000O2_A613TBT01_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z284TBT01_DEL_FLG, T000O2_A284TBT01_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z287TBT01_CRT_PROG_NM, T000O2_A287TBT01_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z290TBT01_UPD_PROG_NM, T000O2_A290TBT01_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBT01_SUBJECT"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0O23( )
   {
      beforeValidate0O23( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0O23( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0O23( 0) ;
         checkOptimisticConcurrency0O23( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0O23( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0O23( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000O8 */
                  pr_default.execute(6, new Object[] {new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID), new Boolean(n285TBT01_CRT_DATETIME), A285TBT01_CRT_DATETIME, new Boolean(n286TBT01_CRT_USER_ID), A286TBT01_CRT_USER_ID, new Boolean(n288TBT01_UPD_DATETIME), A288TBT01_UPD_DATETIME, new Boolean(n289TBT01_UPD_USER_ID), A289TBT01_UPD_USER_ID, new Boolean(n291TBT01_UPD_CNT), new Long(A291TBT01_UPD_CNT), new Boolean(n555TBT01_OUTER_SUBJECT_ID), A555TBT01_OUTER_SUBJECT_ID, new Boolean(n613TBT01_SITE_ID), A613TBT01_SITE_ID, new Boolean(n284TBT01_DEL_FLG), A284TBT01_DEL_FLG, new Boolean(n287TBT01_CRT_PROG_NM), A287TBT01_CRT_PROG_NM, new Boolean(n290TBT01_UPD_PROG_NM), A290TBT01_UPD_PROG_NM});
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
                        resetCaption0O0( ) ;
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
            load0O23( ) ;
         }
         endLevel0O23( ) ;
      }
      closeExtendedTableCursors0O23( ) ;
   }

   public void update0O23( )
   {
      beforeValidate0O23( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0O23( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0O23( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0O23( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0O23( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000O9 */
                  pr_default.execute(7, new Object[] {new Boolean(n285TBT01_CRT_DATETIME), A285TBT01_CRT_DATETIME, new Boolean(n286TBT01_CRT_USER_ID), A286TBT01_CRT_USER_ID, new Boolean(n288TBT01_UPD_DATETIME), A288TBT01_UPD_DATETIME, new Boolean(n289TBT01_UPD_USER_ID), A289TBT01_UPD_USER_ID, new Boolean(n291TBT01_UPD_CNT), new Long(A291TBT01_UPD_CNT), new Boolean(n555TBT01_OUTER_SUBJECT_ID), A555TBT01_OUTER_SUBJECT_ID, new Boolean(n613TBT01_SITE_ID), A613TBT01_SITE_ID, new Boolean(n284TBT01_DEL_FLG), A284TBT01_DEL_FLG, new Boolean(n287TBT01_CRT_PROG_NM), A287TBT01_CRT_PROG_NM, new Boolean(n290TBT01_UPD_PROG_NM), A290TBT01_UPD_PROG_NM, new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID)});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBT01_SUBJECT"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0O23( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption0O0( ) ;
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
         endLevel0O23( ) ;
      }
      closeExtendedTableCursors0O23( ) ;
   }

   public void deferredUpdate0O23( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0O23( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0O23( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0O23( ) ;
         afterConfirm0O23( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0O23( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000O10 */
               pr_default.execute(8, new Object[] {new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound23 == 0 )
                     {
                        initAll0O23( ) ;
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
                     resetCaption0O0( ) ;
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
      sMode23 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0O23( ) ;
      Gx_mode = sMode23 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0O23( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBT01_SUBJECT" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000O11 */
         pr_default.execute(9, new Object[] {new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID)});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRFメモテーブル"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T000O12 */
         pr_default.execute(10, new Object[] {new Long(A282TBT01_STUDY_ID), new Integer(A283TBT01_SUBJECT_ID)});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRFテーブル"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel0O23( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0O23( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbt01_subject");
         if ( AnyError == 0 )
         {
            confirmValues0O0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbt01_subject");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0O23( )
   {
      /* Using cursor T000O13 */
      pr_default.execute(11);
      RcdFound23 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound23 = (short)(1) ;
         A282TBT01_STUDY_ID = T000O13_A282TBT01_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
         A283TBT01_SUBJECT_ID = T000O13_A283TBT01_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0O23( )
   {
      pr_default.readNext(11);
      RcdFound23 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound23 = (short)(1) ;
         A282TBT01_STUDY_ID = T000O13_A282TBT01_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
         A283TBT01_SUBJECT_ID = T000O13_A283TBT01_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
      }
   }

   public void scanEnd0O23( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0O23( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0O23( )
   {
      /* Before Insert Rules */
      A285TBT01_CRT_DATETIME = GXutil.now( ) ;
      n285TBT01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A285TBT01_CRT_DATETIME", localUtil.ttoc( A285TBT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A286TBT01_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt01_subject_impl.this.GXt_char3 = GXv_char4[0] ;
      A286TBT01_CRT_USER_ID = GXt_char3 ;
      n286TBT01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A286TBT01_CRT_USER_ID", A286TBT01_CRT_USER_ID);
      A288TBT01_UPD_DATETIME = GXutil.now( ) ;
      n288TBT01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A288TBT01_UPD_DATETIME", localUtil.ttoc( A288TBT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A289TBT01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt01_subject_impl.this.GXt_char3 = GXv_char4[0] ;
      A289TBT01_UPD_USER_ID = GXt_char3 ;
      n289TBT01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A289TBT01_UPD_USER_ID", A289TBT01_UPD_USER_ID);
      A291TBT01_UPD_CNT = (long)(O291TBT01_UPD_CNT+1) ;
      n291TBT01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A291TBT01_UPD_CNT", GXutil.ltrim( GXutil.str( A291TBT01_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0O23( )
   {
      /* Before Update Rules */
      A288TBT01_UPD_DATETIME = GXutil.now( ) ;
      n288TBT01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A288TBT01_UPD_DATETIME", localUtil.ttoc( A288TBT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A289TBT01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt01_subject_impl.this.GXt_char3 = GXv_char4[0] ;
      A289TBT01_UPD_USER_ID = GXt_char3 ;
      n289TBT01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A289TBT01_UPD_USER_ID", A289TBT01_UPD_USER_ID);
      A291TBT01_UPD_CNT = (long)(O291TBT01_UPD_CNT+1) ;
      n291TBT01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A291TBT01_UPD_CNT", GXutil.ltrim( GXutil.str( A291TBT01_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0O23( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0O23( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0O23( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0O23( )
   {
      edtTBT01_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_STUDY_ID_Enabled, 5, 0)));
      edtTBT01_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_SUBJECT_ID_Enabled, 5, 0)));
      edtTBT01_OUTER_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_OUTER_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_OUTER_SUBJECT_ID_Enabled, 5, 0)));
      edtTBT01_SITE_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_SITE_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_SITE_ID_Enabled, 5, 0)));
      edtTBT01_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_DEL_FLG_Enabled, 5, 0)));
      edtTBT01_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_CRT_DATETIME_Enabled, 5, 0)));
      edtTBT01_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_CRT_USER_ID_Enabled, 5, 0)));
      edtTBT01_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBT01_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_UPD_DATETIME_Enabled, 5, 0)));
      edtTBT01_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_UPD_USER_ID_Enabled, 5, 0)));
      edtTBT01_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBT01_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBT01_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBT01_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0O0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "患者テーブル") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbt01_subject") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0O23( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z282TBT01_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z282TBT01_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z283TBT01_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z283TBT01_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z285TBT01_CRT_DATETIME", localUtil.ttoc( Z285TBT01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z286TBT01_CRT_USER_ID", GXutil.rtrim( Z286TBT01_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z288TBT01_UPD_DATETIME", localUtil.ttoc( Z288TBT01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z289TBT01_UPD_USER_ID", GXutil.rtrim( Z289TBT01_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z291TBT01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z291TBT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z555TBT01_OUTER_SUBJECT_ID", GXutil.rtrim( Z555TBT01_OUTER_SUBJECT_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z613TBT01_SITE_ID", GXutil.rtrim( Z613TBT01_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z284TBT01_DEL_FLG", GXutil.rtrim( Z284TBT01_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z287TBT01_CRT_PROG_NM", GXutil.rtrim( Z287TBT01_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z290TBT01_UPD_PROG_NM", GXutil.rtrim( Z290TBT01_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O291TBT01_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O291TBT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0O23( )
   {
      A285TBT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n285TBT01_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A285TBT01_CRT_DATETIME", localUtil.ttoc( A285TBT01_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n285TBT01_CRT_DATETIME = (GXutil.nullDate().equals(A285TBT01_CRT_DATETIME) ? true : false) ;
      A286TBT01_CRT_USER_ID = "" ;
      n286TBT01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A286TBT01_CRT_USER_ID", A286TBT01_CRT_USER_ID);
      n286TBT01_CRT_USER_ID = ((GXutil.strcmp("", A286TBT01_CRT_USER_ID)==0) ? true : false) ;
      A288TBT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n288TBT01_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A288TBT01_UPD_DATETIME", localUtil.ttoc( A288TBT01_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n288TBT01_UPD_DATETIME = (GXutil.nullDate().equals(A288TBT01_UPD_DATETIME) ? true : false) ;
      A289TBT01_UPD_USER_ID = "" ;
      n289TBT01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A289TBT01_UPD_USER_ID", A289TBT01_UPD_USER_ID);
      n289TBT01_UPD_USER_ID = ((GXutil.strcmp("", A289TBT01_UPD_USER_ID)==0) ? true : false) ;
      A291TBT01_UPD_CNT = 0 ;
      n291TBT01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A291TBT01_UPD_CNT", GXutil.ltrim( GXutil.str( A291TBT01_UPD_CNT, 10, 0)));
      n291TBT01_UPD_CNT = ((0==A291TBT01_UPD_CNT) ? true : false) ;
      A555TBT01_OUTER_SUBJECT_ID = "" ;
      n555TBT01_OUTER_SUBJECT_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A555TBT01_OUTER_SUBJECT_ID", A555TBT01_OUTER_SUBJECT_ID);
      n555TBT01_OUTER_SUBJECT_ID = ((GXutil.strcmp("", A555TBT01_OUTER_SUBJECT_ID)==0) ? true : false) ;
      A613TBT01_SITE_ID = "" ;
      n613TBT01_SITE_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A613TBT01_SITE_ID", A613TBT01_SITE_ID);
      n613TBT01_SITE_ID = ((GXutil.strcmp("", A613TBT01_SITE_ID)==0) ? true : false) ;
      A284TBT01_DEL_FLG = "" ;
      n284TBT01_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A284TBT01_DEL_FLG", A284TBT01_DEL_FLG);
      n284TBT01_DEL_FLG = ((GXutil.strcmp("", A284TBT01_DEL_FLG)==0) ? true : false) ;
      A287TBT01_CRT_PROG_NM = "" ;
      n287TBT01_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A287TBT01_CRT_PROG_NM", A287TBT01_CRT_PROG_NM);
      n287TBT01_CRT_PROG_NM = ((GXutil.strcmp("", A287TBT01_CRT_PROG_NM)==0) ? true : false) ;
      A290TBT01_UPD_PROG_NM = "" ;
      n290TBT01_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A290TBT01_UPD_PROG_NM", A290TBT01_UPD_PROG_NM);
      n290TBT01_UPD_PROG_NM = ((GXutil.strcmp("", A290TBT01_UPD_PROG_NM)==0) ? true : false) ;
      O291TBT01_UPD_CNT = A291TBT01_UPD_CNT ;
      n291TBT01_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A291TBT01_UPD_CNT", GXutil.ltrim( GXutil.str( A291TBT01_UPD_CNT, 10, 0)));
   }

   public void initAll0O23( )
   {
      A282TBT01_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A282TBT01_STUDY_ID", GXutil.ltrim( GXutil.str( A282TBT01_STUDY_ID, 10, 0)));
      A283TBT01_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A283TBT01_SUBJECT_ID", GXutil.ltrim( GXutil.str( A283TBT01_SUBJECT_ID, 6, 0)));
      initializeNonKey0O23( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14551623");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbt01_subject.js", "?14551624");
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
      lblTextblocktbt01_study_id_Internalname = "TEXTBLOCKTBT01_STUDY_ID" ;
      edtTBT01_STUDY_ID_Internalname = "TBT01_STUDY_ID" ;
      lblTextblocktbt01_subject_id_Internalname = "TEXTBLOCKTBT01_SUBJECT_ID" ;
      edtTBT01_SUBJECT_ID_Internalname = "TBT01_SUBJECT_ID" ;
      lblTextblocktbt01_outer_subject_id_Internalname = "TEXTBLOCKTBT01_OUTER_SUBJECT_ID" ;
      edtTBT01_OUTER_SUBJECT_ID_Internalname = "TBT01_OUTER_SUBJECT_ID" ;
      lblTextblocktbt01_site_id_Internalname = "TEXTBLOCKTBT01_SITE_ID" ;
      edtTBT01_SITE_ID_Internalname = "TBT01_SITE_ID" ;
      lblTextblocktbt01_del_flg_Internalname = "TEXTBLOCKTBT01_DEL_FLG" ;
      edtTBT01_DEL_FLG_Internalname = "TBT01_DEL_FLG" ;
      lblTextblocktbt01_crt_datetime_Internalname = "TEXTBLOCKTBT01_CRT_DATETIME" ;
      edtTBT01_CRT_DATETIME_Internalname = "TBT01_CRT_DATETIME" ;
      lblTextblocktbt01_crt_user_id_Internalname = "TEXTBLOCKTBT01_CRT_USER_ID" ;
      edtTBT01_CRT_USER_ID_Internalname = "TBT01_CRT_USER_ID" ;
      lblTextblocktbt01_crt_prog_nm_Internalname = "TEXTBLOCKTBT01_CRT_PROG_NM" ;
      edtTBT01_CRT_PROG_NM_Internalname = "TBT01_CRT_PROG_NM" ;
      lblTextblocktbt01_upd_datetime_Internalname = "TEXTBLOCKTBT01_UPD_DATETIME" ;
      edtTBT01_UPD_DATETIME_Internalname = "TBT01_UPD_DATETIME" ;
      lblTextblocktbt01_upd_user_id_Internalname = "TEXTBLOCKTBT01_UPD_USER_ID" ;
      edtTBT01_UPD_USER_ID_Internalname = "TBT01_UPD_USER_ID" ;
      lblTextblocktbt01_upd_prog_nm_Internalname = "TEXTBLOCKTBT01_UPD_PROG_NM" ;
      edtTBT01_UPD_PROG_NM_Internalname = "TBT01_UPD_PROG_NM" ;
      lblTextblocktbt01_upd_cnt_Internalname = "TEXTBLOCKTBT01_UPD_CNT" ;
      edtTBT01_UPD_CNT_Internalname = "TBT01_UPD_CNT" ;
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
      edtTBT01_UPD_CNT_Jsonclick = "" ;
      edtTBT01_UPD_CNT_Enabled = 1 ;
      edtTBT01_UPD_PROG_NM_Jsonclick = "" ;
      edtTBT01_UPD_PROG_NM_Enabled = 1 ;
      edtTBT01_UPD_USER_ID_Jsonclick = "" ;
      edtTBT01_UPD_USER_ID_Enabled = 1 ;
      edtTBT01_UPD_DATETIME_Jsonclick = "" ;
      edtTBT01_UPD_DATETIME_Enabled = 1 ;
      edtTBT01_CRT_PROG_NM_Jsonclick = "" ;
      edtTBT01_CRT_PROG_NM_Enabled = 1 ;
      edtTBT01_CRT_USER_ID_Jsonclick = "" ;
      edtTBT01_CRT_USER_ID_Enabled = 1 ;
      edtTBT01_CRT_DATETIME_Jsonclick = "" ;
      edtTBT01_CRT_DATETIME_Enabled = 1 ;
      edtTBT01_DEL_FLG_Jsonclick = "" ;
      edtTBT01_DEL_FLG_Enabled = 1 ;
      edtTBT01_SITE_ID_Jsonclick = "" ;
      edtTBT01_SITE_ID_Enabled = 1 ;
      edtTBT01_OUTER_SUBJECT_ID_Jsonclick = "" ;
      edtTBT01_OUTER_SUBJECT_ID_Enabled = 1 ;
      edtTBT01_SUBJECT_ID_Jsonclick = "" ;
      edtTBT01_SUBJECT_ID_Enabled = 1 ;
      edtTBT01_STUDY_ID_Jsonclick = "" ;
      edtTBT01_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbt01_crt_user_id0O23( String Gx_mode )
   {
      GXt_char3 = A286TBT01_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt01_subject_impl.this.GXt_char3 = GXv_char4[0] ;
      A286TBT01_CRT_USER_ID = GXt_char3 ;
      n286TBT01_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A286TBT01_CRT_USER_ID", A286TBT01_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A286TBT01_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbt01_upd_user_id0O23( String Gx_mode )
   {
      GXt_char3 = A289TBT01_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbt01_subject_impl.this.GXt_char3 = GXv_char4[0] ;
      A289TBT01_UPD_USER_ID = GXt_char3 ;
      n289TBT01_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A289TBT01_UPD_USER_ID", A289TBT01_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A289TBT01_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBT01_OUTER_SUBJECT_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbt01_subject_id( long GX_Parm1 ,
                                       int GX_Parm2 ,
                                       java.util.Date GX_Parm3 ,
                                       String GX_Parm4 ,
                                       java.util.Date GX_Parm5 ,
                                       String GX_Parm6 ,
                                       long GX_Parm7 ,
                                       String GX_Parm8 ,
                                       String GX_Parm9 ,
                                       String GX_Parm10 ,
                                       String GX_Parm11 ,
                                       String GX_Parm12 )
   {
      A282TBT01_STUDY_ID = GX_Parm1 ;
      A283TBT01_SUBJECT_ID = GX_Parm2 ;
      A285TBT01_CRT_DATETIME = GX_Parm3 ;
      n285TBT01_CRT_DATETIME = false ;
      A286TBT01_CRT_USER_ID = GX_Parm4 ;
      n286TBT01_CRT_USER_ID = false ;
      A288TBT01_UPD_DATETIME = GX_Parm5 ;
      n288TBT01_UPD_DATETIME = false ;
      A289TBT01_UPD_USER_ID = GX_Parm6 ;
      n289TBT01_UPD_USER_ID = false ;
      A291TBT01_UPD_CNT = GX_Parm7 ;
      n291TBT01_UPD_CNT = false ;
      A555TBT01_OUTER_SUBJECT_ID = GX_Parm8 ;
      n555TBT01_OUTER_SUBJECT_ID = false ;
      A613TBT01_SITE_ID = GX_Parm9 ;
      n613TBT01_SITE_ID = false ;
      A284TBT01_DEL_FLG = GX_Parm10 ;
      n284TBT01_DEL_FLG = false ;
      A287TBT01_CRT_PROG_NM = GX_Parm11 ;
      n287TBT01_CRT_PROG_NM = false ;
      A290TBT01_UPD_PROG_NM = GX_Parm12 ;
      n290TBT01_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A285TBT01_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A286TBT01_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A288TBT01_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A289TBT01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A291TBT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A555TBT01_OUTER_SUBJECT_ID));
      isValidOutput.add(GXutil.rtrim( A613TBT01_SITE_ID));
      isValidOutput.add(GXutil.rtrim( A284TBT01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A287TBT01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A290TBT01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z282TBT01_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z283TBT01_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(localUtil.ttoc( Z285TBT01_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z286TBT01_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z288TBT01_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z289TBT01_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z291TBT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z555TBT01_OUTER_SUBJECT_ID));
      isValidOutput.add(GXutil.rtrim( Z613TBT01_SITE_ID));
      isValidOutput.add(GXutil.rtrim( Z284TBT01_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z287TBT01_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z290TBT01_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O291TBT01_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
                  /* Execute user subroutine: S1165 */
                  S1165 ();
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
      lblTextblocktbt01_study_id_Jsonclick = "" ;
      lblTextblocktbt01_subject_id_Jsonclick = "" ;
      lblTextblocktbt01_outer_subject_id_Jsonclick = "" ;
      A555TBT01_OUTER_SUBJECT_ID = "" ;
      lblTextblocktbt01_site_id_Jsonclick = "" ;
      A613TBT01_SITE_ID = "" ;
      lblTextblocktbt01_del_flg_Jsonclick = "" ;
      A284TBT01_DEL_FLG = "" ;
      lblTextblocktbt01_crt_datetime_Jsonclick = "" ;
      A285TBT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt01_crt_user_id_Jsonclick = "" ;
      A286TBT01_CRT_USER_ID = "" ;
      lblTextblocktbt01_crt_prog_nm_Jsonclick = "" ;
      A287TBT01_CRT_PROG_NM = "" ;
      lblTextblocktbt01_upd_datetime_Jsonclick = "" ;
      A288TBT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbt01_upd_user_id_Jsonclick = "" ;
      A289TBT01_UPD_USER_ID = "" ;
      lblTextblocktbt01_upd_prog_nm_Jsonclick = "" ;
      A290TBT01_UPD_PROG_NM = "" ;
      lblTextblocktbt01_upd_cnt_Jsonclick = "" ;
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
      Z285TBT01_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z286TBT01_CRT_USER_ID = "" ;
      Z288TBT01_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z289TBT01_UPD_USER_ID = "" ;
      Z555TBT01_OUTER_SUBJECT_ID = "" ;
      Z613TBT01_SITE_ID = "" ;
      Z284TBT01_DEL_FLG = "" ;
      Z287TBT01_CRT_PROG_NM = "" ;
      Z290TBT01_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T000O4_A282TBT01_STUDY_ID = new long[1] ;
      T000O4_A283TBT01_SUBJECT_ID = new int[1] ;
      T000O4_A285TBT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000O4_n285TBT01_CRT_DATETIME = new boolean[] {false} ;
      T000O4_A286TBT01_CRT_USER_ID = new String[] {""} ;
      T000O4_n286TBT01_CRT_USER_ID = new boolean[] {false} ;
      T000O4_A288TBT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000O4_n288TBT01_UPD_DATETIME = new boolean[] {false} ;
      T000O4_A289TBT01_UPD_USER_ID = new String[] {""} ;
      T000O4_n289TBT01_UPD_USER_ID = new boolean[] {false} ;
      T000O4_A291TBT01_UPD_CNT = new long[1] ;
      T000O4_n291TBT01_UPD_CNT = new boolean[] {false} ;
      T000O4_A555TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      T000O4_n555TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      T000O4_A613TBT01_SITE_ID = new String[] {""} ;
      T000O4_n613TBT01_SITE_ID = new boolean[] {false} ;
      T000O4_A284TBT01_DEL_FLG = new String[] {""} ;
      T000O4_n284TBT01_DEL_FLG = new boolean[] {false} ;
      T000O4_A287TBT01_CRT_PROG_NM = new String[] {""} ;
      T000O4_n287TBT01_CRT_PROG_NM = new boolean[] {false} ;
      T000O4_A290TBT01_UPD_PROG_NM = new String[] {""} ;
      T000O4_n290TBT01_UPD_PROG_NM = new boolean[] {false} ;
      T000O5_A282TBT01_STUDY_ID = new long[1] ;
      T000O5_A283TBT01_SUBJECT_ID = new int[1] ;
      T000O3_A282TBT01_STUDY_ID = new long[1] ;
      T000O3_A283TBT01_SUBJECT_ID = new int[1] ;
      T000O3_A285TBT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000O3_n285TBT01_CRT_DATETIME = new boolean[] {false} ;
      T000O3_A286TBT01_CRT_USER_ID = new String[] {""} ;
      T000O3_n286TBT01_CRT_USER_ID = new boolean[] {false} ;
      T000O3_A288TBT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000O3_n288TBT01_UPD_DATETIME = new boolean[] {false} ;
      T000O3_A289TBT01_UPD_USER_ID = new String[] {""} ;
      T000O3_n289TBT01_UPD_USER_ID = new boolean[] {false} ;
      T000O3_A291TBT01_UPD_CNT = new long[1] ;
      T000O3_n291TBT01_UPD_CNT = new boolean[] {false} ;
      T000O3_A555TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      T000O3_n555TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      T000O3_A613TBT01_SITE_ID = new String[] {""} ;
      T000O3_n613TBT01_SITE_ID = new boolean[] {false} ;
      T000O3_A284TBT01_DEL_FLG = new String[] {""} ;
      T000O3_n284TBT01_DEL_FLG = new boolean[] {false} ;
      T000O3_A287TBT01_CRT_PROG_NM = new String[] {""} ;
      T000O3_n287TBT01_CRT_PROG_NM = new boolean[] {false} ;
      T000O3_A290TBT01_UPD_PROG_NM = new String[] {""} ;
      T000O3_n290TBT01_UPD_PROG_NM = new boolean[] {false} ;
      sMode23 = "" ;
      T000O6_A282TBT01_STUDY_ID = new long[1] ;
      T000O6_A283TBT01_SUBJECT_ID = new int[1] ;
      T000O7_A282TBT01_STUDY_ID = new long[1] ;
      T000O7_A283TBT01_SUBJECT_ID = new int[1] ;
      T000O2_A282TBT01_STUDY_ID = new long[1] ;
      T000O2_A283TBT01_SUBJECT_ID = new int[1] ;
      T000O2_A285TBT01_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000O2_n285TBT01_CRT_DATETIME = new boolean[] {false} ;
      T000O2_A286TBT01_CRT_USER_ID = new String[] {""} ;
      T000O2_n286TBT01_CRT_USER_ID = new boolean[] {false} ;
      T000O2_A288TBT01_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000O2_n288TBT01_UPD_DATETIME = new boolean[] {false} ;
      T000O2_A289TBT01_UPD_USER_ID = new String[] {""} ;
      T000O2_n289TBT01_UPD_USER_ID = new boolean[] {false} ;
      T000O2_A291TBT01_UPD_CNT = new long[1] ;
      T000O2_n291TBT01_UPD_CNT = new boolean[] {false} ;
      T000O2_A555TBT01_OUTER_SUBJECT_ID = new String[] {""} ;
      T000O2_n555TBT01_OUTER_SUBJECT_ID = new boolean[] {false} ;
      T000O2_A613TBT01_SITE_ID = new String[] {""} ;
      T000O2_n613TBT01_SITE_ID = new boolean[] {false} ;
      T000O2_A284TBT01_DEL_FLG = new String[] {""} ;
      T000O2_n284TBT01_DEL_FLG = new boolean[] {false} ;
      T000O2_A287TBT01_CRT_PROG_NM = new String[] {""} ;
      T000O2_n287TBT01_CRT_PROG_NM = new boolean[] {false} ;
      T000O2_A290TBT01_UPD_PROG_NM = new String[] {""} ;
      T000O2_n290TBT01_UPD_PROG_NM = new boolean[] {false} ;
      T000O11_A329TBT14_STUDY_ID = new long[1] ;
      T000O11_A330TBT14_SUBJECT_ID = new int[1] ;
      T000O11_A922TBT14_MEMO_NO = new short[1] ;
      T000O12_A292TBT02_STUDY_ID = new long[1] ;
      T000O12_A293TBT02_SUBJECT_ID = new int[1] ;
      T000O12_A294TBT02_CRF_ID = new short[1] ;
      T000O13_A282TBT01_STUDY_ID = new long[1] ;
      T000O13_A283TBT01_SUBJECT_ID = new int[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbt01_subject__default(),
         new Object[] {
             new Object[] {
            T000O2_A282TBT01_STUDY_ID, T000O2_A283TBT01_SUBJECT_ID, T000O2_A285TBT01_CRT_DATETIME, T000O2_n285TBT01_CRT_DATETIME, T000O2_A286TBT01_CRT_USER_ID, T000O2_n286TBT01_CRT_USER_ID, T000O2_A288TBT01_UPD_DATETIME, T000O2_n288TBT01_UPD_DATETIME, T000O2_A289TBT01_UPD_USER_ID, T000O2_n289TBT01_UPD_USER_ID,
            T000O2_A291TBT01_UPD_CNT, T000O2_n291TBT01_UPD_CNT, T000O2_A555TBT01_OUTER_SUBJECT_ID, T000O2_n555TBT01_OUTER_SUBJECT_ID, T000O2_A613TBT01_SITE_ID, T000O2_n613TBT01_SITE_ID, T000O2_A284TBT01_DEL_FLG, T000O2_n284TBT01_DEL_FLG, T000O2_A287TBT01_CRT_PROG_NM, T000O2_n287TBT01_CRT_PROG_NM,
            T000O2_A290TBT01_UPD_PROG_NM, T000O2_n290TBT01_UPD_PROG_NM
            }
            , new Object[] {
            T000O3_A282TBT01_STUDY_ID, T000O3_A283TBT01_SUBJECT_ID, T000O3_A285TBT01_CRT_DATETIME, T000O3_n285TBT01_CRT_DATETIME, T000O3_A286TBT01_CRT_USER_ID, T000O3_n286TBT01_CRT_USER_ID, T000O3_A288TBT01_UPD_DATETIME, T000O3_n288TBT01_UPD_DATETIME, T000O3_A289TBT01_UPD_USER_ID, T000O3_n289TBT01_UPD_USER_ID,
            T000O3_A291TBT01_UPD_CNT, T000O3_n291TBT01_UPD_CNT, T000O3_A555TBT01_OUTER_SUBJECT_ID, T000O3_n555TBT01_OUTER_SUBJECT_ID, T000O3_A613TBT01_SITE_ID, T000O3_n613TBT01_SITE_ID, T000O3_A284TBT01_DEL_FLG, T000O3_n284TBT01_DEL_FLG, T000O3_A287TBT01_CRT_PROG_NM, T000O3_n287TBT01_CRT_PROG_NM,
            T000O3_A290TBT01_UPD_PROG_NM, T000O3_n290TBT01_UPD_PROG_NM
            }
            , new Object[] {
            T000O4_A282TBT01_STUDY_ID, T000O4_A283TBT01_SUBJECT_ID, T000O4_A285TBT01_CRT_DATETIME, T000O4_n285TBT01_CRT_DATETIME, T000O4_A286TBT01_CRT_USER_ID, T000O4_n286TBT01_CRT_USER_ID, T000O4_A288TBT01_UPD_DATETIME, T000O4_n288TBT01_UPD_DATETIME, T000O4_A289TBT01_UPD_USER_ID, T000O4_n289TBT01_UPD_USER_ID,
            T000O4_A291TBT01_UPD_CNT, T000O4_n291TBT01_UPD_CNT, T000O4_A555TBT01_OUTER_SUBJECT_ID, T000O4_n555TBT01_OUTER_SUBJECT_ID, T000O4_A613TBT01_SITE_ID, T000O4_n613TBT01_SITE_ID, T000O4_A284TBT01_DEL_FLG, T000O4_n284TBT01_DEL_FLG, T000O4_A287TBT01_CRT_PROG_NM, T000O4_n287TBT01_CRT_PROG_NM,
            T000O4_A290TBT01_UPD_PROG_NM, T000O4_n290TBT01_UPD_PROG_NM
            }
            , new Object[] {
            T000O5_A282TBT01_STUDY_ID, T000O5_A283TBT01_SUBJECT_ID
            }
            , new Object[] {
            T000O6_A282TBT01_STUDY_ID, T000O6_A283TBT01_SUBJECT_ID
            }
            , new Object[] {
            T000O7_A282TBT01_STUDY_ID, T000O7_A283TBT01_SUBJECT_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000O11_A329TBT14_STUDY_ID, T000O11_A330TBT14_SUBJECT_ID, T000O11_A922TBT14_MEMO_NO
            }
            , new Object[] {
            T000O12_A292TBT02_STUDY_ID, T000O12_A293TBT02_SUBJECT_ID, T000O12_A294TBT02_CRF_ID
            }
            , new Object[] {
            T000O13_A282TBT01_STUDY_ID, T000O13_A283TBT01_SUBJECT_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBT01_SUBJECT" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound23 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBT01_STUDY_ID_Enabled ;
   private int A283TBT01_SUBJECT_ID ;
   private int edtTBT01_SUBJECT_ID_Enabled ;
   private int edtTBT01_OUTER_SUBJECT_ID_Enabled ;
   private int edtTBT01_SITE_ID_Enabled ;
   private int edtTBT01_DEL_FLG_Enabled ;
   private int edtTBT01_CRT_DATETIME_Enabled ;
   private int edtTBT01_CRT_USER_ID_Enabled ;
   private int edtTBT01_CRT_PROG_NM_Enabled ;
   private int edtTBT01_UPD_DATETIME_Enabled ;
   private int edtTBT01_UPD_USER_ID_Enabled ;
   private int edtTBT01_UPD_PROG_NM_Enabled ;
   private int edtTBT01_UPD_CNT_Enabled ;
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
   private int Z283TBT01_SUBJECT_ID ;
   private int GX_JID ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A282TBT01_STUDY_ID ;
   private long A291TBT01_UPD_CNT ;
   private long Z282TBT01_STUDY_ID ;
   private long Z291TBT01_UPD_CNT ;
   private long O291TBT01_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBT01_STUDY_ID_Internalname ;
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
   private String lblTextblocktbt01_study_id_Internalname ;
   private String lblTextblocktbt01_study_id_Jsonclick ;
   private String edtTBT01_STUDY_ID_Jsonclick ;
   private String lblTextblocktbt01_subject_id_Internalname ;
   private String lblTextblocktbt01_subject_id_Jsonclick ;
   private String edtTBT01_SUBJECT_ID_Internalname ;
   private String edtTBT01_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbt01_outer_subject_id_Internalname ;
   private String lblTextblocktbt01_outer_subject_id_Jsonclick ;
   private String edtTBT01_OUTER_SUBJECT_ID_Internalname ;
   private String edtTBT01_OUTER_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbt01_site_id_Internalname ;
   private String lblTextblocktbt01_site_id_Jsonclick ;
   private String edtTBT01_SITE_ID_Internalname ;
   private String edtTBT01_SITE_ID_Jsonclick ;
   private String lblTextblocktbt01_del_flg_Internalname ;
   private String lblTextblocktbt01_del_flg_Jsonclick ;
   private String edtTBT01_DEL_FLG_Internalname ;
   private String edtTBT01_DEL_FLG_Jsonclick ;
   private String lblTextblocktbt01_crt_datetime_Internalname ;
   private String lblTextblocktbt01_crt_datetime_Jsonclick ;
   private String edtTBT01_CRT_DATETIME_Internalname ;
   private String edtTBT01_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbt01_crt_user_id_Internalname ;
   private String lblTextblocktbt01_crt_user_id_Jsonclick ;
   private String edtTBT01_CRT_USER_ID_Internalname ;
   private String edtTBT01_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbt01_crt_prog_nm_Internalname ;
   private String lblTextblocktbt01_crt_prog_nm_Jsonclick ;
   private String edtTBT01_CRT_PROG_NM_Internalname ;
   private String edtTBT01_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbt01_upd_datetime_Internalname ;
   private String lblTextblocktbt01_upd_datetime_Jsonclick ;
   private String edtTBT01_UPD_DATETIME_Internalname ;
   private String edtTBT01_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbt01_upd_user_id_Internalname ;
   private String lblTextblocktbt01_upd_user_id_Jsonclick ;
   private String edtTBT01_UPD_USER_ID_Internalname ;
   private String edtTBT01_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbt01_upd_prog_nm_Internalname ;
   private String lblTextblocktbt01_upd_prog_nm_Jsonclick ;
   private String edtTBT01_UPD_PROG_NM_Internalname ;
   private String edtTBT01_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbt01_upd_cnt_Internalname ;
   private String lblTextblocktbt01_upd_cnt_Jsonclick ;
   private String edtTBT01_UPD_CNT_Internalname ;
   private String edtTBT01_UPD_CNT_Jsonclick ;
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
   private String sMode23 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A285TBT01_CRT_DATETIME ;
   private java.util.Date A288TBT01_UPD_DATETIME ;
   private java.util.Date Z285TBT01_CRT_DATETIME ;
   private java.util.Date Z288TBT01_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n555TBT01_OUTER_SUBJECT_ID ;
   private boolean n613TBT01_SITE_ID ;
   private boolean n284TBT01_DEL_FLG ;
   private boolean n285TBT01_CRT_DATETIME ;
   private boolean n286TBT01_CRT_USER_ID ;
   private boolean n287TBT01_CRT_PROG_NM ;
   private boolean n288TBT01_UPD_DATETIME ;
   private boolean n289TBT01_UPD_USER_ID ;
   private boolean n290TBT01_UPD_PROG_NM ;
   private boolean n291TBT01_UPD_CNT ;
   private boolean Gx_longc ;
   private String A555TBT01_OUTER_SUBJECT_ID ;
   private String A613TBT01_SITE_ID ;
   private String A284TBT01_DEL_FLG ;
   private String A286TBT01_CRT_USER_ID ;
   private String A287TBT01_CRT_PROG_NM ;
   private String A289TBT01_UPD_USER_ID ;
   private String A290TBT01_UPD_PROG_NM ;
   private String Z286TBT01_CRT_USER_ID ;
   private String Z289TBT01_UPD_USER_ID ;
   private String Z555TBT01_OUTER_SUBJECT_ID ;
   private String Z613TBT01_SITE_ID ;
   private String Z284TBT01_DEL_FLG ;
   private String Z287TBT01_CRT_PROG_NM ;
   private String Z290TBT01_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000O4_A282TBT01_STUDY_ID ;
   private int[] T000O4_A283TBT01_SUBJECT_ID ;
   private java.util.Date[] T000O4_A285TBT01_CRT_DATETIME ;
   private boolean[] T000O4_n285TBT01_CRT_DATETIME ;
   private String[] T000O4_A286TBT01_CRT_USER_ID ;
   private boolean[] T000O4_n286TBT01_CRT_USER_ID ;
   private java.util.Date[] T000O4_A288TBT01_UPD_DATETIME ;
   private boolean[] T000O4_n288TBT01_UPD_DATETIME ;
   private String[] T000O4_A289TBT01_UPD_USER_ID ;
   private boolean[] T000O4_n289TBT01_UPD_USER_ID ;
   private long[] T000O4_A291TBT01_UPD_CNT ;
   private boolean[] T000O4_n291TBT01_UPD_CNT ;
   private String[] T000O4_A555TBT01_OUTER_SUBJECT_ID ;
   private boolean[] T000O4_n555TBT01_OUTER_SUBJECT_ID ;
   private String[] T000O4_A613TBT01_SITE_ID ;
   private boolean[] T000O4_n613TBT01_SITE_ID ;
   private String[] T000O4_A284TBT01_DEL_FLG ;
   private boolean[] T000O4_n284TBT01_DEL_FLG ;
   private String[] T000O4_A287TBT01_CRT_PROG_NM ;
   private boolean[] T000O4_n287TBT01_CRT_PROG_NM ;
   private String[] T000O4_A290TBT01_UPD_PROG_NM ;
   private boolean[] T000O4_n290TBT01_UPD_PROG_NM ;
   private long[] T000O5_A282TBT01_STUDY_ID ;
   private int[] T000O5_A283TBT01_SUBJECT_ID ;
   private long[] T000O3_A282TBT01_STUDY_ID ;
   private int[] T000O3_A283TBT01_SUBJECT_ID ;
   private java.util.Date[] T000O3_A285TBT01_CRT_DATETIME ;
   private boolean[] T000O3_n285TBT01_CRT_DATETIME ;
   private String[] T000O3_A286TBT01_CRT_USER_ID ;
   private boolean[] T000O3_n286TBT01_CRT_USER_ID ;
   private java.util.Date[] T000O3_A288TBT01_UPD_DATETIME ;
   private boolean[] T000O3_n288TBT01_UPD_DATETIME ;
   private String[] T000O3_A289TBT01_UPD_USER_ID ;
   private boolean[] T000O3_n289TBT01_UPD_USER_ID ;
   private long[] T000O3_A291TBT01_UPD_CNT ;
   private boolean[] T000O3_n291TBT01_UPD_CNT ;
   private String[] T000O3_A555TBT01_OUTER_SUBJECT_ID ;
   private boolean[] T000O3_n555TBT01_OUTER_SUBJECT_ID ;
   private String[] T000O3_A613TBT01_SITE_ID ;
   private boolean[] T000O3_n613TBT01_SITE_ID ;
   private String[] T000O3_A284TBT01_DEL_FLG ;
   private boolean[] T000O3_n284TBT01_DEL_FLG ;
   private String[] T000O3_A287TBT01_CRT_PROG_NM ;
   private boolean[] T000O3_n287TBT01_CRT_PROG_NM ;
   private String[] T000O3_A290TBT01_UPD_PROG_NM ;
   private boolean[] T000O3_n290TBT01_UPD_PROG_NM ;
   private long[] T000O6_A282TBT01_STUDY_ID ;
   private int[] T000O6_A283TBT01_SUBJECT_ID ;
   private long[] T000O7_A282TBT01_STUDY_ID ;
   private int[] T000O7_A283TBT01_SUBJECT_ID ;
   private long[] T000O2_A282TBT01_STUDY_ID ;
   private int[] T000O2_A283TBT01_SUBJECT_ID ;
   private java.util.Date[] T000O2_A285TBT01_CRT_DATETIME ;
   private boolean[] T000O2_n285TBT01_CRT_DATETIME ;
   private String[] T000O2_A286TBT01_CRT_USER_ID ;
   private boolean[] T000O2_n286TBT01_CRT_USER_ID ;
   private java.util.Date[] T000O2_A288TBT01_UPD_DATETIME ;
   private boolean[] T000O2_n288TBT01_UPD_DATETIME ;
   private String[] T000O2_A289TBT01_UPD_USER_ID ;
   private boolean[] T000O2_n289TBT01_UPD_USER_ID ;
   private long[] T000O2_A291TBT01_UPD_CNT ;
   private boolean[] T000O2_n291TBT01_UPD_CNT ;
   private String[] T000O2_A555TBT01_OUTER_SUBJECT_ID ;
   private boolean[] T000O2_n555TBT01_OUTER_SUBJECT_ID ;
   private String[] T000O2_A613TBT01_SITE_ID ;
   private boolean[] T000O2_n613TBT01_SITE_ID ;
   private String[] T000O2_A284TBT01_DEL_FLG ;
   private boolean[] T000O2_n284TBT01_DEL_FLG ;
   private String[] T000O2_A287TBT01_CRT_PROG_NM ;
   private boolean[] T000O2_n287TBT01_CRT_PROG_NM ;
   private String[] T000O2_A290TBT01_UPD_PROG_NM ;
   private boolean[] T000O2_n290TBT01_UPD_PROG_NM ;
   private long[] T000O11_A329TBT14_STUDY_ID ;
   private int[] T000O11_A330TBT14_SUBJECT_ID ;
   private short[] T000O11_A922TBT14_MEMO_NO ;
   private long[] T000O12_A292TBT02_STUDY_ID ;
   private int[] T000O12_A293TBT02_SUBJECT_ID ;
   private short[] T000O12_A294TBT02_CRF_ID ;
   private long[] T000O13_A282TBT01_STUDY_ID ;
   private int[] T000O13_A283TBT01_SUBJECT_ID ;
}

final  class tbt01_subject__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000O2", "SELECT `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`, `TBT01_CRT_DATETIME`, `TBT01_CRT_USER_ID`, `TBT01_UPD_DATETIME`, `TBT01_UPD_USER_ID`, `TBT01_UPD_CNT`, `TBT01_OUTER_SUBJECT_ID`, `TBT01_SITE_ID`, `TBT01_DEL_FLG`, `TBT01_CRT_PROG_NM`, `TBT01_UPD_PROG_NM` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O3", "SELECT `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`, `TBT01_CRT_DATETIME`, `TBT01_CRT_USER_ID`, `TBT01_UPD_DATETIME`, `TBT01_UPD_USER_ID`, `TBT01_UPD_CNT`, `TBT01_OUTER_SUBJECT_ID`, `TBT01_SITE_ID`, `TBT01_DEL_FLG`, `TBT01_CRT_PROG_NM`, `TBT01_UPD_PROG_NM` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O4", "SELECT TM1.`TBT01_STUDY_ID`, TM1.`TBT01_SUBJECT_ID`, TM1.`TBT01_CRT_DATETIME`, TM1.`TBT01_CRT_USER_ID`, TM1.`TBT01_UPD_DATETIME`, TM1.`TBT01_UPD_USER_ID`, TM1.`TBT01_UPD_CNT`, TM1.`TBT01_OUTER_SUBJECT_ID`, TM1.`TBT01_SITE_ID`, TM1.`TBT01_DEL_FLG`, TM1.`TBT01_CRT_PROG_NM`, TM1.`TBT01_UPD_PROG_NM` FROM `TBT01_SUBJECT` TM1 WHERE TM1.`TBT01_STUDY_ID` = ? and TM1.`TBT01_SUBJECT_ID` = ? ORDER BY TM1.`TBT01_STUDY_ID`, TM1.`TBT01_SUBJECT_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000O5", "SELECT `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID` FROM `TBT01_SUBJECT` WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000O6", "SELECT `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID` FROM `TBT01_SUBJECT` WHERE ( `TBT01_STUDY_ID` > ? or `TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` > ?) ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000O7", "SELECT `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID` FROM `TBT01_SUBJECT` WHERE ( `TBT01_STUDY_ID` < ? or `TBT01_STUDY_ID` = ? and `TBT01_SUBJECT_ID` < ?) ORDER BY `TBT01_STUDY_ID` DESC, `TBT01_SUBJECT_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000O8", "INSERT INTO `TBT01_SUBJECT` (`TBT01_STUDY_ID`, `TBT01_SUBJECT_ID`, `TBT01_CRT_DATETIME`, `TBT01_CRT_USER_ID`, `TBT01_UPD_DATETIME`, `TBT01_UPD_USER_ID`, `TBT01_UPD_CNT`, `TBT01_OUTER_SUBJECT_ID`, `TBT01_SITE_ID`, `TBT01_DEL_FLG`, `TBT01_CRT_PROG_NM`, `TBT01_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000O9", "UPDATE `TBT01_SUBJECT` SET `TBT01_CRT_DATETIME`=?, `TBT01_CRT_USER_ID`=?, `TBT01_UPD_DATETIME`=?, `TBT01_UPD_USER_ID`=?, `TBT01_UPD_CNT`=?, `TBT01_OUTER_SUBJECT_ID`=?, `TBT01_SITE_ID`=?, `TBT01_DEL_FLG`=?, `TBT01_CRT_PROG_NM`=?, `TBT01_UPD_PROG_NM`=?  WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000O10", "DELETE FROM `TBT01_SUBJECT`  WHERE `TBT01_STUDY_ID` = ? AND `TBT01_SUBJECT_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000O11", "SELECT `TBT14_STUDY_ID`, `TBT14_SUBJECT_ID`, `TBT14_MEMO_NO` FROM `TBT14_CRF_MEMO` WHERE `TBT14_STUDY_ID` = ? AND `TBT14_SUBJECT_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000O12", "SELECT `TBT02_STUDY_ID`, `TBT02_SUBJECT_ID`, `TBT02_CRF_ID` FROM `TBT02_CRF` WHERE `TBT02_STUDY_ID` = ? AND `TBT02_SUBJECT_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000O13", "SELECT `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID` FROM `TBT01_SUBJECT` ORDER BY `TBT01_STUDY_ID`, `TBT01_SUBJECT_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               ((String[]) buf[12])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
               ((short[]) buf[2])[0] = rslt.getShort(3) ;
               break;
            case 11 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((int[]) buf[1])[0] = rslt.getInt(2) ;
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
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
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
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[13], 6);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 20);
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
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[21], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 6);
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
               stmt.setInt(12, ((Number) parms[21]).intValue());
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
            case 10 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               break;
      }
   }

}

