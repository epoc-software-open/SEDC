/*
               File: tbw11_cond_work_impl
        Description: TBW11_条件ワークテーブル
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:17.4
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbw11_cond_work_impl extends GXWebPanel
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
      Form.getMeta().addItem("Description", "TBW11_条件ワークテーブル", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBW11_SESSION_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbw11_cond_work_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbw11_cond_work_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbw11_cond_work_impl.class ));
   }

   public tbw11_cond_work_impl( int remoteHandle ,
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
         wb_table1_2_1C47( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1C47e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1C47( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1C47( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1C47( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1C47e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"TBW11_条件ワークテーブル"+"</legend>") ;
         wb_table3_27_1C47( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1C47e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1C47e( true) ;
      }
      else
      {
         wb_table1_2_1C47e( false) ;
      }
   }

   public void wb_table3_27_1C47( boolean wbgen )
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
         wb_table4_33_1C47( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1C47e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW11_COND_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW11_COND_WORK.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBW11_COND_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1C47e( true) ;
      }
      else
      {
         wb_table3_27_1C47e( false) ;
      }
   }

   public void wb_table4_33_1C47( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw11_session_id_Internalname, "ID", "", "", lblTextblocktbw11_session_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW11_COND_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A741TBW11_SESSION_ID", A741TBW11_SESSION_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW11_SESSION_ID_Internalname, GXutil.rtrim( A741TBW11_SESSION_ID), GXutil.rtrim( localUtil.format( A741TBW11_SESSION_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTBW11_SESSION_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW11_SESSION_ID_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBW11_COND_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw11_datetime_Internalname, "実行日時", "", "", lblTextblocktbw11_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW11_COND_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBW11_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW11_DATETIME_Internalname, localUtil.format(A742TBW11_DATETIME, "99/99/99 99:99"), localUtil.format( A742TBW11_DATETIME, "99/99/99 99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'YMD',5,24,'jap',false,0);"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBW11_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW11_DATETIME_Enabled, 0, 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW11_COND_WORK.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBW11_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBW11_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBW11_COND_WORK.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw11_study_id_Internalname, "ID", "", "", lblTextblocktbw11_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW11_COND_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW11_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A743TBW11_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBW11_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A743TBW11_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A743TBW11_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(48);\"", "", "", "", "", edtTBW11_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW11_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW11_COND_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw11_subject_id_Internalname, "ID", "", "", lblTextblocktbw11_subject_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW11_COND_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW11_SUBJECT_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A744TBW11_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")), ((edtTBW11_SUBJECT_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A744TBW11_SUBJECT_ID), "ZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A744TBW11_SUBJECT_ID), "ZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBW11_SUBJECT_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW11_SUBJECT_ID_Enabled, 0, 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW11_COND_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbw11_crf_id_Internalname, "CRFID", "", "", lblTextblocktbw11_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBW11_COND_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBW11_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A745TBW11_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBW11_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A745TBW11_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A745TBW11_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(58);\"", "", "", "", "", edtTBW11_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBW11_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBW11_COND_WORK.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1C47e( true) ;
      }
      else
      {
         wb_table4_33_1C47e( false) ;
      }
   }

   public void wb_table2_5_1C47( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBW11_COND_WORK.htm");
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
         wb_table2_5_1C47e( true) ;
      }
      else
      {
         wb_table2_5_1C47e( false) ;
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
      /* Execute user event: e111C2 */
      e111C2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A741TBW11_SESSION_ID = httpContext.cgiGet( edtTBW11_SESSION_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A741TBW11_SESSION_ID", A741TBW11_SESSION_ID);
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBW11_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"実行日時"}), 1, "TBW11_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW11_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A742TBW11_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            else
            {
               A742TBW11_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBW11_DATETIME_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW11_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW11_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW11_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW11_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A743TBW11_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
            }
            else
            {
               A743TBW11_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBW11_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW11_SUBJECT_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW11_SUBJECT_ID_Internalname), ".", ",") > 999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW11_SUBJECT_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW11_SUBJECT_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A744TBW11_SUBJECT_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
            }
            else
            {
               A744TBW11_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( edtTBW11_SUBJECT_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBW11_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBW11_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBW11_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW11_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A745TBW11_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
            }
            else
            {
               A745TBW11_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBW11_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
            }
            /* Read saved values. */
            Z741TBW11_SESSION_ID = httpContext.cgiGet( "Z741TBW11_SESSION_ID") ;
            Z742TBW11_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z742TBW11_DATETIME"), 0) ;
            Z743TBW11_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z743TBW11_STUDY_ID"), ".", ",") ;
            Z744TBW11_SUBJECT_ID = (int)(localUtil.ctol( httpContext.cgiGet( "Z744TBW11_SUBJECT_ID"), ".", ",")) ;
            Z745TBW11_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z745TBW11_CRF_ID"), ".", ",")) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV8Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A741TBW11_SESSION_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A741TBW11_SESSION_ID", A741TBW11_SESSION_ID);
               A742TBW11_DATETIME = localUtil.parseDTimeParm( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
               A743TBW11_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
               A744TBW11_SUBJECT_ID = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
               A745TBW11_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
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
                     /* Execute user event: e111C2 */
                     e111C2 ();
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
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1C47( ) ;
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
      disableAttributes1C47( ) ;
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

   public void resetCaption1C0( )
   {
   }

   public void e111C2( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_BC_FLG", AV7W_BC_FLG);
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void S1132( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV8Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm1C47( int GX_JID )
   {
      if ( ( GX_JID == 2 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
         }
         else
         {
         }
      }
      if ( GX_JID == -2 )
      {
         Z741TBW11_SESSION_ID = A741TBW11_SESSION_ID ;
         Z742TBW11_DATETIME = A742TBW11_DATETIME ;
         Z743TBW11_STUDY_ID = A743TBW11_STUDY_ID ;
         Z744TBW11_SUBJECT_ID = A744TBW11_SUBJECT_ID ;
         Z745TBW11_CRF_ID = A745TBW11_CRF_ID ;
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

   public void load1C47( )
   {
      /* Using cursor T001C4 */
      pr_default.execute(2, new Object[] {A741TBW11_SESSION_ID, A742TBW11_DATETIME, new Long(A743TBW11_STUDY_ID), new Integer(A744TBW11_SUBJECT_ID), new Short(A745TBW11_CRF_ID)});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound47 = (short)(1) ;
         zm1C47( -2) ;
      }
      pr_default.close(2);
      onLoadActions1C47( ) ;
   }

   public void onLoadActions1C47( )
   {
      AV8Pgmname = "TBW11_COND_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
   }

   public void checkExtendedTable1C47( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV8Pgmname = "TBW11_COND_WORK" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      if ( ! ( GXutil.nullDate().equals(A742TBW11_DATETIME) || (( A742TBW11_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A742TBW11_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　実行日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors1C47( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1C47( )
   {
      /* Using cursor T001C5 */
      pr_default.execute(3, new Object[] {A741TBW11_SESSION_ID, A742TBW11_DATETIME, new Long(A743TBW11_STUDY_ID), new Integer(A744TBW11_SUBJECT_ID), new Short(A745TBW11_CRF_ID)});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound47 = (short)(1) ;
      }
      else
      {
         RcdFound47 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001C3 */
      pr_default.execute(1, new Object[] {A741TBW11_SESSION_ID, A742TBW11_DATETIME, new Long(A743TBW11_STUDY_ID), new Integer(A744TBW11_SUBJECT_ID), new Short(A745TBW11_CRF_ID)});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1C47( 2) ;
         RcdFound47 = (short)(1) ;
         A741TBW11_SESSION_ID = T001C3_A741TBW11_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A741TBW11_SESSION_ID", A741TBW11_SESSION_ID);
         A742TBW11_DATETIME = T001C3_A742TBW11_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A743TBW11_STUDY_ID = T001C3_A743TBW11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
         A744TBW11_SUBJECT_ID = T001C3_A744TBW11_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
         A745TBW11_CRF_ID = T001C3_A745TBW11_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
         Z741TBW11_SESSION_ID = A741TBW11_SESSION_ID ;
         Z742TBW11_DATETIME = A742TBW11_DATETIME ;
         Z743TBW11_STUDY_ID = A743TBW11_STUDY_ID ;
         Z744TBW11_SUBJECT_ID = A744TBW11_SUBJECT_ID ;
         Z745TBW11_CRF_ID = A745TBW11_CRF_ID ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1C47( ) ;
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound47 = (short)(0) ;
         initializeNonKey1C47( ) ;
         sMode47 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode47 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1C47( ) ;
      if ( RcdFound47 == 0 )
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
      RcdFound47 = (short)(0) ;
      /* Using cursor T001C6 */
      pr_default.execute(4, new Object[] {A741TBW11_SESSION_ID, A741TBW11_SESSION_ID, A742TBW11_DATETIME, A742TBW11_DATETIME, A741TBW11_SESSION_ID, new Long(A743TBW11_STUDY_ID), new Long(A743TBW11_STUDY_ID), A742TBW11_DATETIME, A741TBW11_SESSION_ID, new Integer(A744TBW11_SUBJECT_ID), new Integer(A744TBW11_SUBJECT_ID), new Long(A743TBW11_STUDY_ID), A742TBW11_DATETIME, A741TBW11_SESSION_ID, new Short(A745TBW11_CRF_ID)});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001C6_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001C6_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && T001C6_A742TBW11_DATETIME[0].before( A742TBW11_DATETIME ) || T001C6_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C6_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C6_A743TBW11_STUDY_ID[0] < A743TBW11_STUDY_ID ) || ( T001C6_A743TBW11_STUDY_ID[0] == A743TBW11_STUDY_ID ) && T001C6_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C6_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C6_A744TBW11_SUBJECT_ID[0] < A744TBW11_SUBJECT_ID ) || ( T001C6_A744TBW11_SUBJECT_ID[0] == A744TBW11_SUBJECT_ID ) && ( T001C6_A743TBW11_STUDY_ID[0] == A743TBW11_STUDY_ID ) && T001C6_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C6_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C6_A745TBW11_CRF_ID[0] < A745TBW11_CRF_ID ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001C6_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001C6_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && T001C6_A742TBW11_DATETIME[0].after( A742TBW11_DATETIME ) || T001C6_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C6_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C6_A743TBW11_STUDY_ID[0] > A743TBW11_STUDY_ID ) || ( T001C6_A743TBW11_STUDY_ID[0] == A743TBW11_STUDY_ID ) && T001C6_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C6_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C6_A744TBW11_SUBJECT_ID[0] > A744TBW11_SUBJECT_ID ) || ( T001C6_A744TBW11_SUBJECT_ID[0] == A744TBW11_SUBJECT_ID ) && ( T001C6_A743TBW11_STUDY_ID[0] == A743TBW11_STUDY_ID ) && T001C6_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C6_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C6_A745TBW11_CRF_ID[0] > A745TBW11_CRF_ID ) ) )
         {
            A741TBW11_SESSION_ID = T001C6_A741TBW11_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A741TBW11_SESSION_ID", A741TBW11_SESSION_ID);
            A742TBW11_DATETIME = T001C6_A742TBW11_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A743TBW11_STUDY_ID = T001C6_A743TBW11_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
            A744TBW11_SUBJECT_ID = T001C6_A744TBW11_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
            A745TBW11_CRF_ID = T001C6_A745TBW11_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound47 = (short)(0) ;
      /* Using cursor T001C7 */
      pr_default.execute(5, new Object[] {A741TBW11_SESSION_ID, A741TBW11_SESSION_ID, A742TBW11_DATETIME, A742TBW11_DATETIME, A741TBW11_SESSION_ID, new Long(A743TBW11_STUDY_ID), new Long(A743TBW11_STUDY_ID), A742TBW11_DATETIME, A741TBW11_SESSION_ID, new Integer(A744TBW11_SUBJECT_ID), new Integer(A744TBW11_SUBJECT_ID), new Long(A743TBW11_STUDY_ID), A742TBW11_DATETIME, A741TBW11_SESSION_ID, new Short(A745TBW11_CRF_ID)});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001C7_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) > 0 ) || ( GXutil.strcmp(T001C7_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && T001C7_A742TBW11_DATETIME[0].after( A742TBW11_DATETIME ) || T001C7_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C7_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C7_A743TBW11_STUDY_ID[0] > A743TBW11_STUDY_ID ) || ( T001C7_A743TBW11_STUDY_ID[0] == A743TBW11_STUDY_ID ) && T001C7_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C7_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C7_A744TBW11_SUBJECT_ID[0] > A744TBW11_SUBJECT_ID ) || ( T001C7_A744TBW11_SUBJECT_ID[0] == A744TBW11_SUBJECT_ID ) && ( T001C7_A743TBW11_STUDY_ID[0] == A743TBW11_STUDY_ID ) && T001C7_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C7_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C7_A745TBW11_CRF_ID[0] > A745TBW11_CRF_ID ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001C7_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) < 0 ) || ( GXutil.strcmp(T001C7_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && T001C7_A742TBW11_DATETIME[0].before( A742TBW11_DATETIME ) || T001C7_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C7_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C7_A743TBW11_STUDY_ID[0] < A743TBW11_STUDY_ID ) || ( T001C7_A743TBW11_STUDY_ID[0] == A743TBW11_STUDY_ID ) && T001C7_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C7_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C7_A744TBW11_SUBJECT_ID[0] < A744TBW11_SUBJECT_ID ) || ( T001C7_A744TBW11_SUBJECT_ID[0] == A744TBW11_SUBJECT_ID ) && ( T001C7_A743TBW11_STUDY_ID[0] == A743TBW11_STUDY_ID ) && T001C7_A742TBW11_DATETIME[0].equals( A742TBW11_DATETIME ) && ( GXutil.strcmp(T001C7_A741TBW11_SESSION_ID[0], A741TBW11_SESSION_ID) == 0 ) && ( T001C7_A745TBW11_CRF_ID[0] < A745TBW11_CRF_ID ) ) )
         {
            A741TBW11_SESSION_ID = T001C7_A741TBW11_SESSION_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A741TBW11_SESSION_ID", A741TBW11_SESSION_ID);
            A742TBW11_DATETIME = T001C7_A742TBW11_DATETIME[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A743TBW11_STUDY_ID = T001C7_A743TBW11_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
            A744TBW11_SUBJECT_ID = T001C7_A744TBW11_SUBJECT_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
            A745TBW11_CRF_ID = T001C7_A745TBW11_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
            RcdFound47 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1C47( ) ;
      if ( RcdFound47 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBW11_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW11_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( GXutil.strcmp(A741TBW11_SESSION_ID, Z741TBW11_SESSION_ID) != 0 ) || !( A742TBW11_DATETIME.equals( Z742TBW11_DATETIME ) ) || ( A743TBW11_STUDY_ID != Z743TBW11_STUDY_ID ) || ( A744TBW11_SUBJECT_ID != Z744TBW11_SUBJECT_ID ) || ( A745TBW11_CRF_ID != Z745TBW11_CRF_ID ) )
         {
            A741TBW11_SESSION_ID = Z741TBW11_SESSION_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A741TBW11_SESSION_ID", A741TBW11_SESSION_ID);
            A742TBW11_DATETIME = Z742TBW11_DATETIME ;
            httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
            A743TBW11_STUDY_ID = Z743TBW11_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
            A744TBW11_SUBJECT_ID = Z744TBW11_SUBJECT_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
            A745TBW11_CRF_ID = Z745TBW11_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBW11_SESSION_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBW11_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBW11_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update1C47( ) ;
            GX_FocusControl = edtTBW11_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( GXutil.strcmp(A741TBW11_SESSION_ID, Z741TBW11_SESSION_ID) != 0 ) || !( A742TBW11_DATETIME.equals( Z742TBW11_DATETIME ) ) || ( A743TBW11_STUDY_ID != Z743TBW11_STUDY_ID ) || ( A744TBW11_SUBJECT_ID != Z744TBW11_SUBJECT_ID ) || ( A745TBW11_CRF_ID != Z745TBW11_CRF_ID ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBW11_SESSION_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert1C47( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBW11_SESSION_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBW11_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBW11_SESSION_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1C47( ) ;
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
      if ( ( GXutil.strcmp(A741TBW11_SESSION_ID, Z741TBW11_SESSION_ID) != 0 ) || !( A742TBW11_DATETIME.equals( Z742TBW11_DATETIME ) ) || ( A743TBW11_STUDY_ID != Z743TBW11_STUDY_ID ) || ( A744TBW11_SUBJECT_ID != Z744TBW11_SUBJECT_ID ) || ( A745TBW11_CRF_ID != Z745TBW11_CRF_ID ) )
      {
         A741TBW11_SESSION_ID = Z741TBW11_SESSION_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A741TBW11_SESSION_ID", A741TBW11_SESSION_ID);
         A742TBW11_DATETIME = Z742TBW11_DATETIME ;
         httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A743TBW11_STUDY_ID = Z743TBW11_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
         A744TBW11_SUBJECT_ID = Z744TBW11_SUBJECT_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
         A745TBW11_CRF_ID = Z745TBW11_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBW11_SESSION_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBW11_SESSION_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBW11_SESSION_ID_Internalname ;
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
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBW11_SESSION_ID");
         AnyError = (short)(1) ;
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1C47( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1C47( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_next( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart1C47( ) ;
      if ( RcdFound47 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound47 != 0 )
         {
            scanNext1C47( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      scanEnd1C47( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1C47( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001C2 */
         pr_default.execute(0, new Object[] {A741TBW11_SESSION_ID, A742TBW11_DATETIME, new Long(A743TBW11_STUDY_ID), new Integer(A744TBW11_SUBJECT_ID), new Short(A745TBW11_CRF_ID)});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBW11_COND_WORK"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_default.getStatus(0) == 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBW11_COND_WORK"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1C47( )
   {
      beforeValidate1C47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1C47( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1C47( 0) ;
         checkOptimisticConcurrency1C47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1C47( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1C47( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001C8 */
                  pr_default.execute(6, new Object[] {A741TBW11_SESSION_ID, A742TBW11_DATETIME, new Long(A743TBW11_STUDY_ID), new Integer(A744TBW11_SUBJECT_ID), new Short(A745TBW11_CRF_ID)});
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
                        resetCaption1C0( ) ;
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
            load1C47( ) ;
         }
         endLevel1C47( ) ;
      }
      closeExtendedTableCursors1C47( ) ;
   }

   public void update1C47( )
   {
      beforeValidate1C47( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1C47( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1C47( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1C47( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1C47( ) ;
               if ( AnyError == 0 )
               {
                  /* No attributes to update on table `TBW11_COND_WORK` */
                  deferredUpdate1C47( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption1C0( ) ;
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
         endLevel1C47( ) ;
      }
      closeExtendedTableCursors1C47( ) ;
   }

   public void deferredUpdate1C47( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1C47( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1C47( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1C47( ) ;
         afterConfirm1C47( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1C47( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001C9 */
               pr_default.execute(7, new Object[] {A741TBW11_SESSION_ID, A742TBW11_DATETIME, new Long(A743TBW11_STUDY_ID), new Integer(A744TBW11_SUBJECT_ID), new Short(A745TBW11_CRF_ID)});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound47 == 0 )
                     {
                        initAll1C47( ) ;
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
                     resetCaption1C0( ) ;
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
      sMode47 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1C47( ) ;
      Gx_mode = sMode47 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1C47( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV8Pgmname = "TBW11_COND_WORK" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Pgmname", AV8Pgmname);
      }
   }

   public void endLevel1C47( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1C47( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbw11_cond_work");
         if ( AnyError == 0 )
         {
            confirmValues1C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbw11_cond_work");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1C47( )
   {
      /* Using cursor T001C10 */
      pr_default.execute(8);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A741TBW11_SESSION_ID = T001C10_A741TBW11_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A741TBW11_SESSION_ID", A741TBW11_SESSION_ID);
         A742TBW11_DATETIME = T001C10_A742TBW11_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A743TBW11_STUDY_ID = T001C10_A743TBW11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
         A744TBW11_SUBJECT_ID = T001C10_A744TBW11_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
         A745TBW11_CRF_ID = T001C10_A745TBW11_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1C47( )
   {
      pr_default.readNext(8);
      RcdFound47 = (short)(0) ;
      if ( (pr_default.getStatus(8) != 101) )
      {
         RcdFound47 = (short)(1) ;
         A741TBW11_SESSION_ID = T001C10_A741TBW11_SESSION_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A741TBW11_SESSION_ID", A741TBW11_SESSION_ID);
         A742TBW11_DATETIME = T001C10_A742TBW11_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
         A743TBW11_STUDY_ID = T001C10_A743TBW11_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
         A744TBW11_SUBJECT_ID = T001C10_A744TBW11_SUBJECT_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
         A745TBW11_CRF_ID = T001C10_A745TBW11_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
      }
   }

   public void scanEnd1C47( )
   {
      pr_default.close(8);
   }

   public void afterConfirm1C47( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1C47( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1C47( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1C47( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1C47( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1C47( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1C47( )
   {
      edtTBW11_SESSION_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW11_SESSION_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW11_SESSION_ID_Enabled, 5, 0)));
      edtTBW11_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW11_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW11_DATETIME_Enabled, 5, 0)));
      edtTBW11_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW11_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW11_STUDY_ID_Enabled, 5, 0)));
      edtTBW11_SUBJECT_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW11_SUBJECT_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW11_SUBJECT_ID_Enabled, 5, 0)));
      edtTBW11_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBW11_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBW11_CRF_ID_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1C0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "TBW11_条件ワークテーブル") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbw11_cond_work") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1C47( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z741TBW11_SESSION_ID", GXutil.rtrim( Z741TBW11_SESSION_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z742TBW11_DATETIME", localUtil.ttoc( Z742TBW11_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z743TBW11_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z743TBW11_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z744TBW11_SUBJECT_ID", GXutil.ltrim( localUtil.ntoc( Z744TBW11_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z745TBW11_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z745TBW11_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV8Pgmname));
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

   public void initializeNonKey1C47( )
   {
   }

   public void initAll1C47( )
   {
      A741TBW11_SESSION_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A741TBW11_SESSION_ID", A741TBW11_SESSION_ID);
      A742TBW11_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "A742TBW11_DATETIME", localUtil.ttoc( A742TBW11_DATETIME, 8, 5, 0, 1, "/", ":", " "));
      A743TBW11_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A743TBW11_STUDY_ID", GXutil.ltrim( GXutil.str( A743TBW11_STUDY_ID, 10, 0)));
      A744TBW11_SUBJECT_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A744TBW11_SUBJECT_ID", GXutil.ltrim( GXutil.str( A744TBW11_SUBJECT_ID, 6, 0)));
      A745TBW11_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A745TBW11_CRF_ID", GXutil.ltrim( GXutil.str( A745TBW11_CRF_ID, 4, 0)));
      initializeNonKey1C47( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14571786");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbw11_cond_work.js", "?14571786");
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
      lblTextblocktbw11_session_id_Internalname = "TEXTBLOCKTBW11_SESSION_ID" ;
      edtTBW11_SESSION_ID_Internalname = "TBW11_SESSION_ID" ;
      lblTextblocktbw11_datetime_Internalname = "TEXTBLOCKTBW11_DATETIME" ;
      edtTBW11_DATETIME_Internalname = "TBW11_DATETIME" ;
      lblTextblocktbw11_study_id_Internalname = "TEXTBLOCKTBW11_STUDY_ID" ;
      edtTBW11_STUDY_ID_Internalname = "TBW11_STUDY_ID" ;
      lblTextblocktbw11_subject_id_Internalname = "TEXTBLOCKTBW11_SUBJECT_ID" ;
      edtTBW11_SUBJECT_ID_Internalname = "TBW11_SUBJECT_ID" ;
      lblTextblocktbw11_crf_id_Internalname = "TEXTBLOCKTBW11_CRF_ID" ;
      edtTBW11_CRF_ID_Internalname = "TBW11_CRF_ID" ;
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
      edtTBW11_CRF_ID_Jsonclick = "" ;
      edtTBW11_CRF_ID_Enabled = 1 ;
      edtTBW11_SUBJECT_ID_Jsonclick = "" ;
      edtTBW11_SUBJECT_ID_Enabled = 1 ;
      edtTBW11_STUDY_ID_Jsonclick = "" ;
      edtTBW11_STUDY_ID_Enabled = 1 ;
      edtTBW11_DATETIME_Jsonclick = "" ;
      edtTBW11_DATETIME_Enabled = 1 ;
      edtTBW11_SESSION_ID_Jsonclick = "" ;
      edtTBW11_SESSION_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( AnyError == 0 )
      {
         GX_FocusControl = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbw11_crf_id( String GX_Parm1 ,
                                   java.util.Date GX_Parm2 ,
                                   long GX_Parm3 ,
                                   int GX_Parm4 ,
                                   short GX_Parm5 )
   {
      A741TBW11_SESSION_ID = GX_Parm1 ;
      A742TBW11_DATETIME = GX_Parm2 ;
      A743TBW11_STUDY_ID = GX_Parm3 ;
      A744TBW11_SUBJECT_ID = GX_Parm4 ;
      A745TBW11_CRF_ID = GX_Parm5 ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.rtrim( AV8Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z741TBW11_SESSION_ID));
      isValidOutput.add(localUtil.ttoc( Z742TBW11_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z743TBW11_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z744TBW11_SUBJECT_ID, (byte)(6), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z745TBW11_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( ZV8Pgmname));
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
                  /* Execute user subroutine: S1132 */
                  S1132 ();
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
      lblTextblocktbw11_session_id_Jsonclick = "" ;
      A741TBW11_SESSION_ID = "" ;
      lblTextblocktbw11_datetime_Jsonclick = "" ;
      A742TBW11_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbw11_study_id_Jsonclick = "" ;
      lblTextblocktbw11_subject_id_Jsonclick = "" ;
      lblTextblocktbw11_crf_id_Jsonclick = "" ;
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
      Z741TBW11_SESSION_ID = "" ;
      Z742TBW11_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Gx_mode = "" ;
      AV8Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      T001C4_A741TBW11_SESSION_ID = new String[] {""} ;
      T001C4_A742TBW11_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001C4_A743TBW11_STUDY_ID = new long[1] ;
      T001C4_A744TBW11_SUBJECT_ID = new int[1] ;
      T001C4_A745TBW11_CRF_ID = new short[1] ;
      T001C5_A741TBW11_SESSION_ID = new String[] {""} ;
      T001C5_A742TBW11_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001C5_A743TBW11_STUDY_ID = new long[1] ;
      T001C5_A744TBW11_SUBJECT_ID = new int[1] ;
      T001C5_A745TBW11_CRF_ID = new short[1] ;
      T001C3_A741TBW11_SESSION_ID = new String[] {""} ;
      T001C3_A742TBW11_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001C3_A743TBW11_STUDY_ID = new long[1] ;
      T001C3_A744TBW11_SUBJECT_ID = new int[1] ;
      T001C3_A745TBW11_CRF_ID = new short[1] ;
      sMode47 = "" ;
      T001C6_A741TBW11_SESSION_ID = new String[] {""} ;
      T001C6_A742TBW11_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001C6_A743TBW11_STUDY_ID = new long[1] ;
      T001C6_A744TBW11_SUBJECT_ID = new int[1] ;
      T001C6_A745TBW11_CRF_ID = new short[1] ;
      T001C7_A741TBW11_SESSION_ID = new String[] {""} ;
      T001C7_A742TBW11_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001C7_A743TBW11_STUDY_ID = new long[1] ;
      T001C7_A744TBW11_SUBJECT_ID = new int[1] ;
      T001C7_A745TBW11_CRF_ID = new short[1] ;
      T001C2_A741TBW11_SESSION_ID = new String[] {""} ;
      T001C2_A742TBW11_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001C2_A743TBW11_STUDY_ID = new long[1] ;
      T001C2_A744TBW11_SUBJECT_ID = new int[1] ;
      T001C2_A745TBW11_CRF_ID = new short[1] ;
      T001C10_A741TBW11_SESSION_ID = new String[] {""} ;
      T001C10_A742TBW11_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001C10_A743TBW11_STUDY_ID = new long[1] ;
      T001C10_A744TBW11_SUBJECT_ID = new int[1] ;
      T001C10_A745TBW11_CRF_ID = new short[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char3 = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      ZV8Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbw11_cond_work__default(),
         new Object[] {
             new Object[] {
            T001C2_A741TBW11_SESSION_ID, T001C2_A742TBW11_DATETIME, T001C2_A743TBW11_STUDY_ID, T001C2_A744TBW11_SUBJECT_ID, T001C2_A745TBW11_CRF_ID
            }
            , new Object[] {
            T001C3_A741TBW11_SESSION_ID, T001C3_A742TBW11_DATETIME, T001C3_A743TBW11_STUDY_ID, T001C3_A744TBW11_SUBJECT_ID, T001C3_A745TBW11_CRF_ID
            }
            , new Object[] {
            T001C4_A741TBW11_SESSION_ID, T001C4_A742TBW11_DATETIME, T001C4_A743TBW11_STUDY_ID, T001C4_A744TBW11_SUBJECT_ID, T001C4_A745TBW11_CRF_ID
            }
            , new Object[] {
            T001C5_A741TBW11_SESSION_ID, T001C5_A742TBW11_DATETIME, T001C5_A743TBW11_STUDY_ID, T001C5_A744TBW11_SUBJECT_ID, T001C5_A745TBW11_CRF_ID
            }
            , new Object[] {
            T001C6_A741TBW11_SESSION_ID, T001C6_A742TBW11_DATETIME, T001C6_A743TBW11_STUDY_ID, T001C6_A744TBW11_SUBJECT_ID, T001C6_A745TBW11_CRF_ID
            }
            , new Object[] {
            T001C7_A741TBW11_SESSION_ID, T001C7_A742TBW11_DATETIME, T001C7_A743TBW11_STUDY_ID, T001C7_A744TBW11_SUBJECT_ID, T001C7_A745TBW11_CRF_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001C10_A741TBW11_SESSION_ID, T001C10_A742TBW11_DATETIME, T001C10_A743TBW11_STUDY_ID, T001C10_A744TBW11_SUBJECT_ID, T001C10_A745TBW11_CRF_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV8Pgmname = "TBW11_COND_WORK" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A745TBW11_CRF_ID ;
   private short Z745TBW11_CRF_ID ;
   private short RcdFound47 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBW11_SESSION_ID_Enabled ;
   private int edtTBW11_DATETIME_Enabled ;
   private int edtTBW11_STUDY_ID_Enabled ;
   private int A744TBW11_SUBJECT_ID ;
   private int edtTBW11_SUBJECT_ID_Enabled ;
   private int edtTBW11_CRF_ID_Enabled ;
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
   private int Z744TBW11_SUBJECT_ID ;
   private int GX_JID ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A743TBW11_STUDY_ID ;
   private long Z743TBW11_STUDY_ID ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBW11_SESSION_ID_Internalname ;
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
   private String lblTextblocktbw11_session_id_Internalname ;
   private String lblTextblocktbw11_session_id_Jsonclick ;
   private String edtTBW11_SESSION_ID_Jsonclick ;
   private String lblTextblocktbw11_datetime_Internalname ;
   private String lblTextblocktbw11_datetime_Jsonclick ;
   private String edtTBW11_DATETIME_Internalname ;
   private String edtTBW11_DATETIME_Jsonclick ;
   private String lblTextblocktbw11_study_id_Internalname ;
   private String lblTextblocktbw11_study_id_Jsonclick ;
   private String edtTBW11_STUDY_ID_Internalname ;
   private String edtTBW11_STUDY_ID_Jsonclick ;
   private String lblTextblocktbw11_subject_id_Internalname ;
   private String lblTextblocktbw11_subject_id_Jsonclick ;
   private String edtTBW11_SUBJECT_ID_Internalname ;
   private String edtTBW11_SUBJECT_ID_Jsonclick ;
   private String lblTextblocktbw11_crf_id_Internalname ;
   private String lblTextblocktbw11_crf_id_Jsonclick ;
   private String edtTBW11_CRF_ID_Internalname ;
   private String edtTBW11_CRF_ID_Jsonclick ;
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
   private String Gx_mode ;
   private String AV8Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode47 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char3 ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String ZV8Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A742TBW11_DATETIME ;
   private java.util.Date Z742TBW11_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private String A741TBW11_SESSION_ID ;
   private String Z741TBW11_SESSION_ID ;
   private String AV7W_BC_FLG ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001C4_A741TBW11_SESSION_ID ;
   private java.util.Date[] T001C4_A742TBW11_DATETIME ;
   private long[] T001C4_A743TBW11_STUDY_ID ;
   private int[] T001C4_A744TBW11_SUBJECT_ID ;
   private short[] T001C4_A745TBW11_CRF_ID ;
   private String[] T001C5_A741TBW11_SESSION_ID ;
   private java.util.Date[] T001C5_A742TBW11_DATETIME ;
   private long[] T001C5_A743TBW11_STUDY_ID ;
   private int[] T001C5_A744TBW11_SUBJECT_ID ;
   private short[] T001C5_A745TBW11_CRF_ID ;
   private String[] T001C3_A741TBW11_SESSION_ID ;
   private java.util.Date[] T001C3_A742TBW11_DATETIME ;
   private long[] T001C3_A743TBW11_STUDY_ID ;
   private int[] T001C3_A744TBW11_SUBJECT_ID ;
   private short[] T001C3_A745TBW11_CRF_ID ;
   private String[] T001C6_A741TBW11_SESSION_ID ;
   private java.util.Date[] T001C6_A742TBW11_DATETIME ;
   private long[] T001C6_A743TBW11_STUDY_ID ;
   private int[] T001C6_A744TBW11_SUBJECT_ID ;
   private short[] T001C6_A745TBW11_CRF_ID ;
   private String[] T001C7_A741TBW11_SESSION_ID ;
   private java.util.Date[] T001C7_A742TBW11_DATETIME ;
   private long[] T001C7_A743TBW11_STUDY_ID ;
   private int[] T001C7_A744TBW11_SUBJECT_ID ;
   private short[] T001C7_A745TBW11_CRF_ID ;
   private String[] T001C2_A741TBW11_SESSION_ID ;
   private java.util.Date[] T001C2_A742TBW11_DATETIME ;
   private long[] T001C2_A743TBW11_STUDY_ID ;
   private int[] T001C2_A744TBW11_SUBJECT_ID ;
   private short[] T001C2_A745TBW11_CRF_ID ;
   private String[] T001C10_A741TBW11_SESSION_ID ;
   private java.util.Date[] T001C10_A742TBW11_DATETIME ;
   private long[] T001C10_A743TBW11_STUDY_ID ;
   private int[] T001C10_A744TBW11_SUBJECT_ID ;
   private short[] T001C10_A745TBW11_CRF_ID ;
}

final  class tbw11_cond_work__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001C2", "SELECT `TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID` FROM `TBW11_COND_WORK` WHERE `TBW11_SESSION_ID` = ? AND `TBW11_DATETIME` = ? AND `TBW11_STUDY_ID` = ? AND `TBW11_SUBJECT_ID` = ? AND `TBW11_CRF_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001C3", "SELECT `TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID` FROM `TBW11_COND_WORK` WHERE `TBW11_SESSION_ID` = ? AND `TBW11_DATETIME` = ? AND `TBW11_STUDY_ID` = ? AND `TBW11_SUBJECT_ID` = ? AND `TBW11_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001C4", "SELECT TM1.`TBW11_SESSION_ID`, TM1.`TBW11_DATETIME`, TM1.`TBW11_STUDY_ID`, TM1.`TBW11_SUBJECT_ID`, TM1.`TBW11_CRF_ID` FROM `TBW11_COND_WORK` TM1 WHERE TM1.`TBW11_SESSION_ID` = ? and TM1.`TBW11_DATETIME` = ? and TM1.`TBW11_STUDY_ID` = ? and TM1.`TBW11_SUBJECT_ID` = ? and TM1.`TBW11_CRF_ID` = ? ORDER BY TM1.`TBW11_SESSION_ID`, TM1.`TBW11_DATETIME`, TM1.`TBW11_STUDY_ID`, TM1.`TBW11_SUBJECT_ID`, TM1.`TBW11_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T001C5", "SELECT `TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID` FROM `TBW11_COND_WORK` WHERE `TBW11_SESSION_ID` = ? AND `TBW11_DATETIME` = ? AND `TBW11_STUDY_ID` = ? AND `TBW11_SUBJECT_ID` = ? AND `TBW11_CRF_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001C6", "SELECT `TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID` FROM `TBW11_COND_WORK` WHERE ( `TBW11_SESSION_ID` > ? or `TBW11_SESSION_ID` = ? and `TBW11_DATETIME` > ? or `TBW11_DATETIME` = ? and `TBW11_SESSION_ID` = ? and `TBW11_STUDY_ID` > ? or `TBW11_STUDY_ID` = ? and `TBW11_DATETIME` = ? and `TBW11_SESSION_ID` = ? and `TBW11_SUBJECT_ID` > ? or `TBW11_SUBJECT_ID` = ? and `TBW11_STUDY_ID` = ? and `TBW11_DATETIME` = ? and `TBW11_SESSION_ID` = ? and `TBW11_CRF_ID` > ?) ORDER BY `TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001C7", "SELECT `TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID` FROM `TBW11_COND_WORK` WHERE ( `TBW11_SESSION_ID` < ? or `TBW11_SESSION_ID` = ? and `TBW11_DATETIME` < ? or `TBW11_DATETIME` = ? and `TBW11_SESSION_ID` = ? and `TBW11_STUDY_ID` < ? or `TBW11_STUDY_ID` = ? and `TBW11_DATETIME` = ? and `TBW11_SESSION_ID` = ? and `TBW11_SUBJECT_ID` < ? or `TBW11_SUBJECT_ID` = ? and `TBW11_STUDY_ID` = ? and `TBW11_DATETIME` = ? and `TBW11_SESSION_ID` = ? and `TBW11_CRF_ID` < ?) ORDER BY `TBW11_SESSION_ID` DESC, `TBW11_DATETIME` DESC, `TBW11_STUDY_ID` DESC, `TBW11_SUBJECT_ID` DESC, `TBW11_CRF_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001C8", "INSERT INTO `TBW11_COND_WORK` (`TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID`) VALUES (?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001C9", "DELETE FROM `TBW11_COND_WORK`  WHERE `TBW11_SESSION_ID` = ? AND `TBW11_DATETIME` = ? AND `TBW11_STUDY_ID` = ? AND `TBW11_SUBJECT_ID` = ? AND `TBW11_CRF_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T001C10", "SELECT `TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID` FROM `TBW11_COND_WORK` ORDER BY `TBW11_SESSION_ID`, `TBW11_DATETIME`, `TBW11_STUDY_ID`, `TBW11_SUBJECT_ID`, `TBW11_CRF_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               break;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
               break;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDateTime(2) ;
               ((long[]) buf[2])[0] = rslt.getLong(3) ;
               ((int[]) buf[3])[0] = rslt.getInt(4) ;
               ((short[]) buf[4])[0] = rslt.getShort(5) ;
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
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setDateTime(13, (java.util.Date)parms[12], false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setVarchar(2, (String)parms[1], 50, false);
               stmt.setDateTime(3, (java.util.Date)parms[2], false);
               stmt.setDateTime(4, (java.util.Date)parms[3], false);
               stmt.setVarchar(5, (String)parms[4], 50, false);
               stmt.setLong(6, ((Number) parms[5]).longValue());
               stmt.setLong(7, ((Number) parms[6]).longValue());
               stmt.setDateTime(8, (java.util.Date)parms[7], false);
               stmt.setVarchar(9, (String)parms[8], 50, false);
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setLong(12, ((Number) parms[11]).longValue());
               stmt.setDateTime(13, (java.util.Date)parms[12], false);
               stmt.setVarchar(14, (String)parms[13], 50, false);
               stmt.setShort(15, ((Number) parms[14]).shortValue());
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 50, false);
               stmt.setDateTime(2, (java.util.Date)parms[1], false);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               break;
      }
   }

}

