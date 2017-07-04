/*
               File: tbm22_study_site_impl
        Description: 試験実施施設マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:34.52
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm22_study_site_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM22_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm22_crt_user_id0H16( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM22_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm22_upd_user_id0H16( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A197TBM22_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
         httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A197TBM22_STUDY_ID) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A198TBM22_SITE_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A198TBM22_SITE_ID) ;
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
      Form.getMeta().addItem("Description", "試験実施施設マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbm22_study_site_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm22_study_site_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm22_study_site_impl.class ));
   }

   public tbm22_study_site_impl( int remoteHandle ,
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
         wb_table1_2_0H16( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0H16e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0H16( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0H16( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0H16( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0H16e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"試験実施施設マスタ"+"</legend>") ;
         wb_table3_27_0H16( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0H16e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0H16e( true) ;
      }
      else
      {
         wb_table1_2_0H16e( false) ;
      }
   }

   public void wb_table3_27_0H16( boolean wbgen )
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
         wb_table4_33_0H16( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0H16e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM22_STUDY_SITE.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM22_STUDY_SITE.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0H16e( true) ;
      }
      else
      {
         wb_table3_27_0H16e( false) ;
      }
   }

   public void wb_table4_33_0H16( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm22_study_id_Internalname, "試験ID", "", "", lblTextblocktbm22_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM22_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A197TBM22_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM22_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A197TBM22_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A197TBM22_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM22_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM22_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm22_site_id_Internalname, "試験実施施設ID", "", "", lblTextblocktbm22_site_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM22_SITE_ID_Internalname, GXutil.rtrim( A198TBM22_SITE_ID), GXutil.rtrim( localUtil.format( A198TBM22_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM22_SITE_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM22_SITE_ID_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm22_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm22_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A199TBM22_DEL_FLG", A199TBM22_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM22_DEL_FLG_Internalname, GXutil.rtrim( A199TBM22_DEL_FLG), GXutil.rtrim( localUtil.format( A199TBM22_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM22_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM22_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm22_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm22_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A200TBM22_CRT_DATETIME", localUtil.ttoc( A200TBM22_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM22_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM22_CRT_DATETIME_Internalname, localUtil.format(A200TBM22_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A200TBM22_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM22_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM22_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM22_STUDY_SITE.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM22_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM22_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm22_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm22_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A201TBM22_CRT_USER_ID", A201TBM22_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM22_CRT_USER_ID_Internalname, GXutil.rtrim( A201TBM22_CRT_USER_ID), GXutil.rtrim( localUtil.format( A201TBM22_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM22_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM22_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm22_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm22_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A202TBM22_CRT_PROG_NM", A202TBM22_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM22_CRT_PROG_NM_Internalname, GXutil.rtrim( A202TBM22_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A202TBM22_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM22_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM22_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm22_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm22_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A203TBM22_UPD_DATETIME", localUtil.ttoc( A203TBM22_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM22_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM22_UPD_DATETIME_Internalname, localUtil.format(A203TBM22_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A203TBM22_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM22_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM22_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM22_STUDY_SITE.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM22_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM22_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm22_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm22_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A204TBM22_UPD_USER_ID", A204TBM22_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM22_UPD_USER_ID_Internalname, GXutil.rtrim( A204TBM22_UPD_USER_ID), GXutil.rtrim( localUtil.format( A204TBM22_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM22_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM22_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm22_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm22_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A205TBM22_UPD_PROG_NM", A205TBM22_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM22_UPD_PROG_NM_Internalname, GXutil.rtrim( A205TBM22_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A205TBM22_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM22_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM22_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm22_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm22_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A206TBM22_UPD_CNT", GXutil.ltrim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM22_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A206TBM22_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM22_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A206TBM22_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A206TBM22_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM22_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM22_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM22_STUDY_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0H16e( true) ;
      }
      else
      {
         wb_table4_33_0H16e( false) ;
      }
   }

   public void wb_table2_5_0H16( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM22_STUDY_SITE.htm");
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
         wb_table2_5_0H16e( true) ;
      }
      else
      {
         wb_table2_5_0H16e( false) ;
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
      /* Execute user event: e110H2 */
      e110H2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM22_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM22_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM22_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A197TBM22_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
            }
            else
            {
               A197TBM22_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM22_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
            }
            A198TBM22_SITE_ID = httpContext.cgiGet( edtTBM22_SITE_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
            A199TBM22_DEL_FLG = httpContext.cgiGet( edtTBM22_DEL_FLG_Internalname) ;
            n199TBM22_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A199TBM22_DEL_FLG", A199TBM22_DEL_FLG);
            n199TBM22_DEL_FLG = ((GXutil.strcmp("", A199TBM22_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM22_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM22_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM22_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A200TBM22_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n200TBM22_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A200TBM22_CRT_DATETIME", localUtil.ttoc( A200TBM22_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A200TBM22_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM22_CRT_DATETIME_Internalname)) ;
               n200TBM22_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A200TBM22_CRT_DATETIME", localUtil.ttoc( A200TBM22_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n200TBM22_CRT_DATETIME = (GXutil.nullDate().equals(A200TBM22_CRT_DATETIME) ? true : false) ;
            A201TBM22_CRT_USER_ID = httpContext.cgiGet( edtTBM22_CRT_USER_ID_Internalname) ;
            n201TBM22_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A201TBM22_CRT_USER_ID", A201TBM22_CRT_USER_ID);
            n201TBM22_CRT_USER_ID = ((GXutil.strcmp("", A201TBM22_CRT_USER_ID)==0) ? true : false) ;
            A202TBM22_CRT_PROG_NM = httpContext.cgiGet( edtTBM22_CRT_PROG_NM_Internalname) ;
            n202TBM22_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A202TBM22_CRT_PROG_NM", A202TBM22_CRT_PROG_NM);
            n202TBM22_CRT_PROG_NM = ((GXutil.strcmp("", A202TBM22_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM22_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM22_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM22_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A203TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n203TBM22_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A203TBM22_UPD_DATETIME", localUtil.ttoc( A203TBM22_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A203TBM22_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM22_UPD_DATETIME_Internalname)) ;
               n203TBM22_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A203TBM22_UPD_DATETIME", localUtil.ttoc( A203TBM22_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n203TBM22_UPD_DATETIME = (GXutil.nullDate().equals(A203TBM22_UPD_DATETIME) ? true : false) ;
            A204TBM22_UPD_USER_ID = httpContext.cgiGet( edtTBM22_UPD_USER_ID_Internalname) ;
            n204TBM22_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A204TBM22_UPD_USER_ID", A204TBM22_UPD_USER_ID);
            n204TBM22_UPD_USER_ID = ((GXutil.strcmp("", A204TBM22_UPD_USER_ID)==0) ? true : false) ;
            A205TBM22_UPD_PROG_NM = httpContext.cgiGet( edtTBM22_UPD_PROG_NM_Internalname) ;
            n205TBM22_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A205TBM22_UPD_PROG_NM", A205TBM22_UPD_PROG_NM);
            n205TBM22_UPD_PROG_NM = ((GXutil.strcmp("", A205TBM22_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM22_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM22_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM22_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM22_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A206TBM22_UPD_CNT = 0 ;
               n206TBM22_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A206TBM22_UPD_CNT", GXutil.ltrim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)));
            }
            else
            {
               A206TBM22_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM22_UPD_CNT_Internalname), ".", ",") ;
               n206TBM22_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A206TBM22_UPD_CNT", GXutil.ltrim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)));
            }
            n206TBM22_UPD_CNT = ((0==A206TBM22_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z197TBM22_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z197TBM22_STUDY_ID"), ".", ",") ;
            Z198TBM22_SITE_ID = httpContext.cgiGet( "Z198TBM22_SITE_ID") ;
            Z200TBM22_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z200TBM22_CRT_DATETIME"), 0) ;
            n200TBM22_CRT_DATETIME = (GXutil.nullDate().equals(A200TBM22_CRT_DATETIME) ? true : false) ;
            Z201TBM22_CRT_USER_ID = httpContext.cgiGet( "Z201TBM22_CRT_USER_ID") ;
            n201TBM22_CRT_USER_ID = ((GXutil.strcmp("", A201TBM22_CRT_USER_ID)==0) ? true : false) ;
            Z203TBM22_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z203TBM22_UPD_DATETIME"), 0) ;
            n203TBM22_UPD_DATETIME = (GXutil.nullDate().equals(A203TBM22_UPD_DATETIME) ? true : false) ;
            Z204TBM22_UPD_USER_ID = httpContext.cgiGet( "Z204TBM22_UPD_USER_ID") ;
            n204TBM22_UPD_USER_ID = ((GXutil.strcmp("", A204TBM22_UPD_USER_ID)==0) ? true : false) ;
            Z206TBM22_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z206TBM22_UPD_CNT"), ".", ",") ;
            n206TBM22_UPD_CNT = ((0==A206TBM22_UPD_CNT) ? true : false) ;
            Z199TBM22_DEL_FLG = httpContext.cgiGet( "Z199TBM22_DEL_FLG") ;
            n199TBM22_DEL_FLG = ((GXutil.strcmp("", A199TBM22_DEL_FLG)==0) ? true : false) ;
            Z202TBM22_CRT_PROG_NM = httpContext.cgiGet( "Z202TBM22_CRT_PROG_NM") ;
            n202TBM22_CRT_PROG_NM = ((GXutil.strcmp("", A202TBM22_CRT_PROG_NM)==0) ? true : false) ;
            Z205TBM22_UPD_PROG_NM = httpContext.cgiGet( "Z205TBM22_UPD_PROG_NM") ;
            n205TBM22_UPD_PROG_NM = ((GXutil.strcmp("", A205TBM22_UPD_PROG_NM)==0) ? true : false) ;
            O206TBM22_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O206TBM22_UPD_CNT"), ".", ",") ;
            n206TBM22_UPD_CNT = ((0==A206TBM22_UPD_CNT) ? true : false) ;
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
               A197TBM22_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
               A198TBM22_SITE_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
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
                     /* Execute user event: e110H2 */
                     e110H2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120H2 */
                     e120H2 ();
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
         /* Execute user event: e120H2 */
         e120H2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0H16( ) ;
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
      disableAttributes0H16( ) ;
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

   public void resetCaption0H0( )
   {
   }

   public void e110H2( )
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

   public void e120H2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A198TBM22_SITE_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A199TBM22_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A200TBM22_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm22_study_site_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A200TBM22_CRT_DATETIME", localUtil.ttoc( A200TBM22_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A201TBM22_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A202TBM22_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A203TBM22_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm22_study_site_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A203TBM22_UPD_DATETIME", localUtil.ttoc( A203TBM22_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A204TBM22_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A205TBM22_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1163( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0H16( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z200TBM22_CRT_DATETIME = T000H3_A200TBM22_CRT_DATETIME[0] ;
            Z201TBM22_CRT_USER_ID = T000H3_A201TBM22_CRT_USER_ID[0] ;
            Z203TBM22_UPD_DATETIME = T000H3_A203TBM22_UPD_DATETIME[0] ;
            Z204TBM22_UPD_USER_ID = T000H3_A204TBM22_UPD_USER_ID[0] ;
            Z206TBM22_UPD_CNT = T000H3_A206TBM22_UPD_CNT[0] ;
            Z199TBM22_DEL_FLG = T000H3_A199TBM22_DEL_FLG[0] ;
            Z202TBM22_CRT_PROG_NM = T000H3_A202TBM22_CRT_PROG_NM[0] ;
            Z205TBM22_UPD_PROG_NM = T000H3_A205TBM22_UPD_PROG_NM[0] ;
         }
         else
         {
            Z200TBM22_CRT_DATETIME = A200TBM22_CRT_DATETIME ;
            Z201TBM22_CRT_USER_ID = A201TBM22_CRT_USER_ID ;
            Z203TBM22_UPD_DATETIME = A203TBM22_UPD_DATETIME ;
            Z204TBM22_UPD_USER_ID = A204TBM22_UPD_USER_ID ;
            Z206TBM22_UPD_CNT = A206TBM22_UPD_CNT ;
            Z199TBM22_DEL_FLG = A199TBM22_DEL_FLG ;
            Z202TBM22_CRT_PROG_NM = A202TBM22_CRT_PROG_NM ;
            Z205TBM22_UPD_PROG_NM = A205TBM22_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z200TBM22_CRT_DATETIME = A200TBM22_CRT_DATETIME ;
         Z201TBM22_CRT_USER_ID = A201TBM22_CRT_USER_ID ;
         Z203TBM22_UPD_DATETIME = A203TBM22_UPD_DATETIME ;
         Z204TBM22_UPD_USER_ID = A204TBM22_UPD_USER_ID ;
         Z206TBM22_UPD_CNT = A206TBM22_UPD_CNT ;
         Z199TBM22_DEL_FLG = A199TBM22_DEL_FLG ;
         Z202TBM22_CRT_PROG_NM = A202TBM22_CRT_PROG_NM ;
         Z205TBM22_UPD_PROG_NM = A205TBM22_UPD_PROG_NM ;
         Z197TBM22_STUDY_ID = A197TBM22_STUDY_ID ;
         Z198TBM22_SITE_ID = A198TBM22_SITE_ID ;
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

   public void load0H16( )
   {
      /* Using cursor T000H6 */
      pr_default.execute(4, new Object[] {new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound16 = (short)(1) ;
         A200TBM22_CRT_DATETIME = T000H6_A200TBM22_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200TBM22_CRT_DATETIME", localUtil.ttoc( A200TBM22_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n200TBM22_CRT_DATETIME = T000H6_n200TBM22_CRT_DATETIME[0] ;
         A201TBM22_CRT_USER_ID = T000H6_A201TBM22_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A201TBM22_CRT_USER_ID", A201TBM22_CRT_USER_ID);
         n201TBM22_CRT_USER_ID = T000H6_n201TBM22_CRT_USER_ID[0] ;
         A203TBM22_UPD_DATETIME = T000H6_A203TBM22_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203TBM22_UPD_DATETIME", localUtil.ttoc( A203TBM22_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n203TBM22_UPD_DATETIME = T000H6_n203TBM22_UPD_DATETIME[0] ;
         A204TBM22_UPD_USER_ID = T000H6_A204TBM22_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A204TBM22_UPD_USER_ID", A204TBM22_UPD_USER_ID);
         n204TBM22_UPD_USER_ID = T000H6_n204TBM22_UPD_USER_ID[0] ;
         A206TBM22_UPD_CNT = T000H6_A206TBM22_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A206TBM22_UPD_CNT", GXutil.ltrim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)));
         n206TBM22_UPD_CNT = T000H6_n206TBM22_UPD_CNT[0] ;
         A199TBM22_DEL_FLG = T000H6_A199TBM22_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199TBM22_DEL_FLG", A199TBM22_DEL_FLG);
         n199TBM22_DEL_FLG = T000H6_n199TBM22_DEL_FLG[0] ;
         A202TBM22_CRT_PROG_NM = T000H6_A202TBM22_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A202TBM22_CRT_PROG_NM", A202TBM22_CRT_PROG_NM);
         n202TBM22_CRT_PROG_NM = T000H6_n202TBM22_CRT_PROG_NM[0] ;
         A205TBM22_UPD_PROG_NM = T000H6_A205TBM22_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205TBM22_UPD_PROG_NM", A205TBM22_UPD_PROG_NM);
         n205TBM22_UPD_PROG_NM = T000H6_n205TBM22_UPD_PROG_NM[0] ;
         zm0H16( -8) ;
      }
      pr_default.close(4);
      onLoadActions0H16( ) ;
   }

   public void onLoadActions0H16( )
   {
      AV9Pgmname = "TBM22_STUDY_SITE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0H16( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM22_STUDY_SITE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000H4 */
      pr_default.execute(2, new Object[] {new Long(A197TBM22_STUDY_ID)});
      if ( (pr_default.getStatus(2) == 101) )
      {
         AnyError197 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験実施マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError197 == 0 )
      {
      }
      pr_default.close(2);
      /* Using cursor T000H5 */
      pr_default.execute(3, new Object[] {A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         AnyError198 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験実施施設マスタ・施設サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_SITE_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM22_SITE_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError198 == 0 )
      {
      }
      pr_default.close(3);
      if ( ! ( GXutil.nullDate().equals(A200TBM22_CRT_DATETIME) || (( A200TBM22_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A200TBM22_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A203TBM22_UPD_DATETIME) || (( A203TBM22_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A203TBM22_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0H16( )
   {
      pr_default.close(2);
      pr_default.close(3);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( long A197TBM22_STUDY_ID )
   {
      /* Using cursor T000H7 */
      pr_default.execute(5, new Object[] {new Long(A197TBM22_STUDY_ID)});
      if ( (pr_default.getStatus(5) == 101) )
      {
         AnyError197 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験実施マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError197 == 0 )
      {
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(5) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(5);
   }

   public void gxload_10( String A198TBM22_SITE_ID )
   {
      /* Using cursor T000H8 */
      pr_default.execute(6, new Object[] {A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(6) == 101) )
      {
         AnyError198 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験実施施設マスタ・施設サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_SITE_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM22_SITE_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError198 == 0 )
      {
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(6) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(6);
   }

   public void getKey0H16( )
   {
      /* Using cursor T000H9 */
      pr_default.execute(7, new Object[] {new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(7) != 101) )
      {
         RcdFound16 = (short)(1) ;
      }
      else
      {
         RcdFound16 = (short)(0) ;
      }
      pr_default.close(7);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000H3 */
      pr_default.execute(1, new Object[] {new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0H16( 8) ;
         RcdFound16 = (short)(1) ;
         A200TBM22_CRT_DATETIME = T000H3_A200TBM22_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A200TBM22_CRT_DATETIME", localUtil.ttoc( A200TBM22_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n200TBM22_CRT_DATETIME = T000H3_n200TBM22_CRT_DATETIME[0] ;
         A201TBM22_CRT_USER_ID = T000H3_A201TBM22_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A201TBM22_CRT_USER_ID", A201TBM22_CRT_USER_ID);
         n201TBM22_CRT_USER_ID = T000H3_n201TBM22_CRT_USER_ID[0] ;
         A203TBM22_UPD_DATETIME = T000H3_A203TBM22_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203TBM22_UPD_DATETIME", localUtil.ttoc( A203TBM22_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n203TBM22_UPD_DATETIME = T000H3_n203TBM22_UPD_DATETIME[0] ;
         A204TBM22_UPD_USER_ID = T000H3_A204TBM22_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A204TBM22_UPD_USER_ID", A204TBM22_UPD_USER_ID);
         n204TBM22_UPD_USER_ID = T000H3_n204TBM22_UPD_USER_ID[0] ;
         A206TBM22_UPD_CNT = T000H3_A206TBM22_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A206TBM22_UPD_CNT", GXutil.ltrim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)));
         n206TBM22_UPD_CNT = T000H3_n206TBM22_UPD_CNT[0] ;
         A199TBM22_DEL_FLG = T000H3_A199TBM22_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A199TBM22_DEL_FLG", A199TBM22_DEL_FLG);
         n199TBM22_DEL_FLG = T000H3_n199TBM22_DEL_FLG[0] ;
         A202TBM22_CRT_PROG_NM = T000H3_A202TBM22_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A202TBM22_CRT_PROG_NM", A202TBM22_CRT_PROG_NM);
         n202TBM22_CRT_PROG_NM = T000H3_n202TBM22_CRT_PROG_NM[0] ;
         A205TBM22_UPD_PROG_NM = T000H3_A205TBM22_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205TBM22_UPD_PROG_NM", A205TBM22_UPD_PROG_NM);
         n205TBM22_UPD_PROG_NM = T000H3_n205TBM22_UPD_PROG_NM[0] ;
         A197TBM22_STUDY_ID = T000H3_A197TBM22_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
         A198TBM22_SITE_ID = T000H3_A198TBM22_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
         O206TBM22_UPD_CNT = A206TBM22_UPD_CNT ;
         n206TBM22_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A206TBM22_UPD_CNT", GXutil.ltrim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)));
         Z197TBM22_STUDY_ID = A197TBM22_STUDY_ID ;
         Z198TBM22_SITE_ID = A198TBM22_SITE_ID ;
         sMode16 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0H16( ) ;
         Gx_mode = sMode16 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound16 = (short)(0) ;
         initializeNonKey0H16( ) ;
         sMode16 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode16 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0H16( ) ;
      if ( RcdFound16 == 0 )
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
      RcdFound16 = (short)(0) ;
      /* Using cursor T000H10 */
      pr_default.execute(8, new Object[] {new Long(A197TBM22_STUDY_ID), new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( T000H10_A197TBM22_STUDY_ID[0] < A197TBM22_STUDY_ID ) || ( T000H10_A197TBM22_STUDY_ID[0] == A197TBM22_STUDY_ID ) && ( GXutil.strcmp(T000H10_A198TBM22_SITE_ID[0], A198TBM22_SITE_ID) < 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( T000H10_A197TBM22_STUDY_ID[0] > A197TBM22_STUDY_ID ) || ( T000H10_A197TBM22_STUDY_ID[0] == A197TBM22_STUDY_ID ) && ( GXutil.strcmp(T000H10_A198TBM22_SITE_ID[0], A198TBM22_SITE_ID) > 0 ) ) )
         {
            A197TBM22_STUDY_ID = T000H10_A197TBM22_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
            A198TBM22_SITE_ID = T000H10_A198TBM22_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
            RcdFound16 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void move_previous( )
   {
      RcdFound16 = (short)(0) ;
      /* Using cursor T000H11 */
      pr_default.execute(9, new Object[] {new Long(A197TBM22_STUDY_ID), new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(9) != 101) )
      {
         while ( (pr_default.getStatus(9) != 101) && ( ( T000H11_A197TBM22_STUDY_ID[0] > A197TBM22_STUDY_ID ) || ( T000H11_A197TBM22_STUDY_ID[0] == A197TBM22_STUDY_ID ) && ( GXutil.strcmp(T000H11_A198TBM22_SITE_ID[0], A198TBM22_SITE_ID) > 0 ) ) )
         {
            pr_default.readNext(9);
         }
         if ( (pr_default.getStatus(9) != 101) && ( ( T000H11_A197TBM22_STUDY_ID[0] < A197TBM22_STUDY_ID ) || ( T000H11_A197TBM22_STUDY_ID[0] == A197TBM22_STUDY_ID ) && ( GXutil.strcmp(T000H11_A198TBM22_SITE_ID[0], A198TBM22_SITE_ID) < 0 ) ) )
         {
            A197TBM22_STUDY_ID = T000H11_A197TBM22_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
            A198TBM22_SITE_ID = T000H11_A198TBM22_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
            RcdFound16 = (short)(1) ;
         }
      }
      pr_default.close(9);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0H16( ) ;
      if ( RcdFound16 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM22_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A197TBM22_STUDY_ID != Z197TBM22_STUDY_ID ) || ( GXutil.strcmp(A198TBM22_SITE_ID, Z198TBM22_SITE_ID) != 0 ) )
         {
            A197TBM22_STUDY_ID = Z197TBM22_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
            A198TBM22_SITE_ID = Z198TBM22_SITE_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM22_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update0H16( ) ;
            GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A197TBM22_STUDY_ID != Z197TBM22_STUDY_ID ) || ( GXutil.strcmp(A198TBM22_SITE_ID, Z198TBM22_SITE_ID) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0H16( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM22_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0H16( ) ;
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
      if ( ( A197TBM22_STUDY_ID != Z197TBM22_STUDY_ID ) || ( GXutil.strcmp(A198TBM22_SITE_ID, Z198TBM22_SITE_ID) != 0 ) )
      {
         A197TBM22_STUDY_ID = Z197TBM22_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
         A198TBM22_SITE_ID = Z198TBM22_SITE_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM22_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
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
      if ( RcdFound16 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM22_STUDY_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBM22_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0H16( ) ;
      if ( RcdFound16 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM22_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0H16( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound16 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM22_DEL_FLG_Internalname ;
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
      if ( RcdFound16 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM22_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0H16( ) ;
      if ( RcdFound16 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound16 != 0 )
         {
            scanNext0H16( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM22_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0H16( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0H16( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000H2 */
         pr_default.execute(0, new Object[] {new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM22_STUDY_SITE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z200TBM22_CRT_DATETIME.equals( T000H2_A200TBM22_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z201TBM22_CRT_USER_ID, T000H2_A201TBM22_CRT_USER_ID[0]) != 0 ) || !( Z203TBM22_UPD_DATETIME.equals( T000H2_A203TBM22_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z204TBM22_UPD_USER_ID, T000H2_A204TBM22_UPD_USER_ID[0]) != 0 ) || ( Z206TBM22_UPD_CNT != T000H2_A206TBM22_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z199TBM22_DEL_FLG, T000H2_A199TBM22_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z202TBM22_CRT_PROG_NM, T000H2_A202TBM22_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z205TBM22_UPD_PROG_NM, T000H2_A205TBM22_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM22_STUDY_SITE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0H16( )
   {
      beforeValidate0H16( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0H16( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0H16( 0) ;
         checkOptimisticConcurrency0H16( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0H16( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0H16( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000H12 */
                  pr_default.execute(10, new Object[] {new Boolean(n200TBM22_CRT_DATETIME), A200TBM22_CRT_DATETIME, new Boolean(n201TBM22_CRT_USER_ID), A201TBM22_CRT_USER_ID, new Boolean(n203TBM22_UPD_DATETIME), A203TBM22_UPD_DATETIME, new Boolean(n204TBM22_UPD_USER_ID), A204TBM22_UPD_USER_ID, new Boolean(n206TBM22_UPD_CNT), new Long(A206TBM22_UPD_CNT), new Boolean(n199TBM22_DEL_FLG), A199TBM22_DEL_FLG, new Boolean(n202TBM22_CRT_PROG_NM), A202TBM22_CRT_PROG_NM, new Boolean(n205TBM22_UPD_PROG_NM), A205TBM22_UPD_PROG_NM, new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
                  if ( (pr_default.getStatus(10) == 1) )
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
                        resetCaption0H0( ) ;
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
            load0H16( ) ;
         }
         endLevel0H16( ) ;
      }
      closeExtendedTableCursors0H16( ) ;
   }

   public void update0H16( )
   {
      beforeValidate0H16( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0H16( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0H16( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0H16( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0H16( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000H13 */
                  pr_default.execute(11, new Object[] {new Boolean(n200TBM22_CRT_DATETIME), A200TBM22_CRT_DATETIME, new Boolean(n201TBM22_CRT_USER_ID), A201TBM22_CRT_USER_ID, new Boolean(n203TBM22_UPD_DATETIME), A203TBM22_UPD_DATETIME, new Boolean(n204TBM22_UPD_USER_ID), A204TBM22_UPD_USER_ID, new Boolean(n206TBM22_UPD_CNT), new Long(A206TBM22_UPD_CNT), new Boolean(n199TBM22_DEL_FLG), A199TBM22_DEL_FLG, new Boolean(n202TBM22_CRT_PROG_NM), A202TBM22_CRT_PROG_NM, new Boolean(n205TBM22_UPD_PROG_NM), A205TBM22_UPD_PROG_NM, new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
                  if ( (pr_default.getStatus(11) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM22_STUDY_SITE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0H16( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption0H0( ) ;
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
         endLevel0H16( ) ;
      }
      closeExtendedTableCursors0H16( ) ;
   }

   public void deferredUpdate0H16( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0H16( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0H16( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0H16( ) ;
         afterConfirm0H16( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0H16( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000H14 */
               pr_default.execute(12, new Object[] {new Long(A197TBM22_STUDY_ID), A198TBM22_SITE_ID});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound16 == 0 )
                     {
                        initAll0H16( ) ;
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
                     resetCaption0H0( ) ;
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
      sMode16 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0H16( ) ;
      Gx_mode = sMode16 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0H16( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM22_STUDY_SITE" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0H16( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0H16( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm22_study_site");
         if ( AnyError == 0 )
         {
            confirmValues0H0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm22_study_site");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0H16( )
   {
      /* Using cursor T000H15 */
      pr_default.execute(13);
      RcdFound16 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound16 = (short)(1) ;
         A197TBM22_STUDY_ID = T000H15_A197TBM22_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
         A198TBM22_SITE_ID = T000H15_A198TBM22_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0H16( )
   {
      pr_default.readNext(13);
      RcdFound16 = (short)(0) ;
      if ( (pr_default.getStatus(13) != 101) )
      {
         RcdFound16 = (short)(1) ;
         A197TBM22_STUDY_ID = T000H15_A197TBM22_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
         A198TBM22_SITE_ID = T000H15_A198TBM22_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
      }
   }

   public void scanEnd0H16( )
   {
      pr_default.close(13);
   }

   public void afterConfirm0H16( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0H16( )
   {
      /* Before Insert Rules */
      A200TBM22_CRT_DATETIME = GXutil.now( ) ;
      n200TBM22_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A200TBM22_CRT_DATETIME", localUtil.ttoc( A200TBM22_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A201TBM22_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm22_study_site_impl.this.GXt_char3 = GXv_char4[0] ;
      A201TBM22_CRT_USER_ID = GXt_char3 ;
      n201TBM22_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A201TBM22_CRT_USER_ID", A201TBM22_CRT_USER_ID);
      A203TBM22_UPD_DATETIME = GXutil.now( ) ;
      n203TBM22_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A203TBM22_UPD_DATETIME", localUtil.ttoc( A203TBM22_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A204TBM22_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm22_study_site_impl.this.GXt_char3 = GXv_char4[0] ;
      A204TBM22_UPD_USER_ID = GXt_char3 ;
      n204TBM22_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A204TBM22_UPD_USER_ID", A204TBM22_UPD_USER_ID);
      A206TBM22_UPD_CNT = (long)(O206TBM22_UPD_CNT+1) ;
      n206TBM22_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A206TBM22_UPD_CNT", GXutil.ltrim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0H16( )
   {
      /* Before Update Rules */
      A203TBM22_UPD_DATETIME = GXutil.now( ) ;
      n203TBM22_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A203TBM22_UPD_DATETIME", localUtil.ttoc( A203TBM22_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A204TBM22_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm22_study_site_impl.this.GXt_char3 = GXv_char4[0] ;
      A204TBM22_UPD_USER_ID = GXt_char3 ;
      n204TBM22_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A204TBM22_UPD_USER_ID", A204TBM22_UPD_USER_ID);
      A206TBM22_UPD_CNT = (long)(O206TBM22_UPD_CNT+1) ;
      n206TBM22_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A206TBM22_UPD_CNT", GXutil.ltrim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0H16( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0H16( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0H16( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0H16( )
   {
      edtTBM22_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM22_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM22_STUDY_ID_Enabled, 5, 0)));
      edtTBM22_SITE_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM22_SITE_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM22_SITE_ID_Enabled, 5, 0)));
      edtTBM22_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM22_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM22_DEL_FLG_Enabled, 5, 0)));
      edtTBM22_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM22_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM22_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM22_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM22_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM22_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM22_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM22_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM22_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM22_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM22_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM22_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM22_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM22_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM22_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM22_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM22_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM22_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM22_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM22_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM22_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0H0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "試験実施施設マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm22_study_site") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0H16( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z197TBM22_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z197TBM22_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z198TBM22_SITE_ID", GXutil.rtrim( Z198TBM22_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z200TBM22_CRT_DATETIME", localUtil.ttoc( Z200TBM22_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z201TBM22_CRT_USER_ID", GXutil.rtrim( Z201TBM22_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z203TBM22_UPD_DATETIME", localUtil.ttoc( Z203TBM22_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z204TBM22_UPD_USER_ID", GXutil.rtrim( Z204TBM22_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z206TBM22_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z206TBM22_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z199TBM22_DEL_FLG", GXutil.rtrim( Z199TBM22_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z202TBM22_CRT_PROG_NM", GXutil.rtrim( Z202TBM22_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z205TBM22_UPD_PROG_NM", GXutil.rtrim( Z205TBM22_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O206TBM22_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O206TBM22_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0H16( )
   {
      A200TBM22_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n200TBM22_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A200TBM22_CRT_DATETIME", localUtil.ttoc( A200TBM22_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n200TBM22_CRT_DATETIME = (GXutil.nullDate().equals(A200TBM22_CRT_DATETIME) ? true : false) ;
      A201TBM22_CRT_USER_ID = "" ;
      n201TBM22_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A201TBM22_CRT_USER_ID", A201TBM22_CRT_USER_ID);
      n201TBM22_CRT_USER_ID = ((GXutil.strcmp("", A201TBM22_CRT_USER_ID)==0) ? true : false) ;
      A203TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n203TBM22_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A203TBM22_UPD_DATETIME", localUtil.ttoc( A203TBM22_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n203TBM22_UPD_DATETIME = (GXutil.nullDate().equals(A203TBM22_UPD_DATETIME) ? true : false) ;
      A204TBM22_UPD_USER_ID = "" ;
      n204TBM22_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A204TBM22_UPD_USER_ID", A204TBM22_UPD_USER_ID);
      n204TBM22_UPD_USER_ID = ((GXutil.strcmp("", A204TBM22_UPD_USER_ID)==0) ? true : false) ;
      A206TBM22_UPD_CNT = 0 ;
      n206TBM22_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A206TBM22_UPD_CNT", GXutil.ltrim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)));
      n206TBM22_UPD_CNT = ((0==A206TBM22_UPD_CNT) ? true : false) ;
      A199TBM22_DEL_FLG = "" ;
      n199TBM22_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A199TBM22_DEL_FLG", A199TBM22_DEL_FLG);
      n199TBM22_DEL_FLG = ((GXutil.strcmp("", A199TBM22_DEL_FLG)==0) ? true : false) ;
      A202TBM22_CRT_PROG_NM = "" ;
      n202TBM22_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A202TBM22_CRT_PROG_NM", A202TBM22_CRT_PROG_NM);
      n202TBM22_CRT_PROG_NM = ((GXutil.strcmp("", A202TBM22_CRT_PROG_NM)==0) ? true : false) ;
      A205TBM22_UPD_PROG_NM = "" ;
      n205TBM22_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A205TBM22_UPD_PROG_NM", A205TBM22_UPD_PROG_NM);
      n205TBM22_UPD_PROG_NM = ((GXutil.strcmp("", A205TBM22_UPD_PROG_NM)==0) ? true : false) ;
      O206TBM22_UPD_CNT = A206TBM22_UPD_CNT ;
      n206TBM22_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A206TBM22_UPD_CNT", GXutil.ltrim( GXutil.str( A206TBM22_UPD_CNT, 10, 0)));
   }

   public void initAll0H16( )
   {
      A197TBM22_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A197TBM22_STUDY_ID", GXutil.ltrim( GXutil.str( A197TBM22_STUDY_ID, 10, 0)));
      A198TBM22_SITE_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A198TBM22_SITE_ID", A198TBM22_SITE_ID);
      initializeNonKey0H16( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14543591");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm22_study_site.js", "?14543591");
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
      lblTextblocktbm22_study_id_Internalname = "TEXTBLOCKTBM22_STUDY_ID" ;
      edtTBM22_STUDY_ID_Internalname = "TBM22_STUDY_ID" ;
      lblTextblocktbm22_site_id_Internalname = "TEXTBLOCKTBM22_SITE_ID" ;
      edtTBM22_SITE_ID_Internalname = "TBM22_SITE_ID" ;
      lblTextblocktbm22_del_flg_Internalname = "TEXTBLOCKTBM22_DEL_FLG" ;
      edtTBM22_DEL_FLG_Internalname = "TBM22_DEL_FLG" ;
      lblTextblocktbm22_crt_datetime_Internalname = "TEXTBLOCKTBM22_CRT_DATETIME" ;
      edtTBM22_CRT_DATETIME_Internalname = "TBM22_CRT_DATETIME" ;
      lblTextblocktbm22_crt_user_id_Internalname = "TEXTBLOCKTBM22_CRT_USER_ID" ;
      edtTBM22_CRT_USER_ID_Internalname = "TBM22_CRT_USER_ID" ;
      lblTextblocktbm22_crt_prog_nm_Internalname = "TEXTBLOCKTBM22_CRT_PROG_NM" ;
      edtTBM22_CRT_PROG_NM_Internalname = "TBM22_CRT_PROG_NM" ;
      lblTextblocktbm22_upd_datetime_Internalname = "TEXTBLOCKTBM22_UPD_DATETIME" ;
      edtTBM22_UPD_DATETIME_Internalname = "TBM22_UPD_DATETIME" ;
      lblTextblocktbm22_upd_user_id_Internalname = "TEXTBLOCKTBM22_UPD_USER_ID" ;
      edtTBM22_UPD_USER_ID_Internalname = "TBM22_UPD_USER_ID" ;
      lblTextblocktbm22_upd_prog_nm_Internalname = "TEXTBLOCKTBM22_UPD_PROG_NM" ;
      edtTBM22_UPD_PROG_NM_Internalname = "TBM22_UPD_PROG_NM" ;
      lblTextblocktbm22_upd_cnt_Internalname = "TEXTBLOCKTBM22_UPD_CNT" ;
      edtTBM22_UPD_CNT_Internalname = "TBM22_UPD_CNT" ;
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
      edtTBM22_UPD_CNT_Jsonclick = "" ;
      edtTBM22_UPD_CNT_Enabled = 1 ;
      edtTBM22_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM22_UPD_PROG_NM_Enabled = 1 ;
      edtTBM22_UPD_USER_ID_Jsonclick = "" ;
      edtTBM22_UPD_USER_ID_Enabled = 1 ;
      edtTBM22_UPD_DATETIME_Jsonclick = "" ;
      edtTBM22_UPD_DATETIME_Enabled = 1 ;
      edtTBM22_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM22_CRT_PROG_NM_Enabled = 1 ;
      edtTBM22_CRT_USER_ID_Jsonclick = "" ;
      edtTBM22_CRT_USER_ID_Enabled = 1 ;
      edtTBM22_CRT_DATETIME_Jsonclick = "" ;
      edtTBM22_CRT_DATETIME_Enabled = 1 ;
      edtTBM22_DEL_FLG_Jsonclick = "" ;
      edtTBM22_DEL_FLG_Enabled = 1 ;
      edtTBM22_SITE_ID_Jsonclick = "" ;
      edtTBM22_SITE_ID_Enabled = 1 ;
      edtTBM22_STUDY_ID_Jsonclick = "" ;
      edtTBM22_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm22_crt_user_id0H16( String Gx_mode )
   {
      GXt_char3 = A201TBM22_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm22_study_site_impl.this.GXt_char3 = GXv_char4[0] ;
      A201TBM22_CRT_USER_ID = GXt_char3 ;
      n201TBM22_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A201TBM22_CRT_USER_ID", A201TBM22_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A201TBM22_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm22_upd_user_id0H16( String Gx_mode )
   {
      GXt_char3 = A204TBM22_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm22_study_site_impl.this.GXt_char3 = GXv_char4[0] ;
      A204TBM22_UPD_USER_ID = GXt_char3 ;
      n204TBM22_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A204TBM22_UPD_USER_ID", A204TBM22_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A204TBM22_UPD_USER_ID))+"\"");
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
      /* Using cursor T000H16 */
      pr_default.execute(14, new Object[] {new Long(A197TBM22_STUDY_ID)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         AnyError197 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験実施マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError197 == 0 )
      {
      }
      pr_default.close(14);
      /* Using cursor T000H17 */
      pr_default.execute(15, new Object[] {A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(15) == 101) )
      {
         AnyError198 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験実施施設マスタ・施設サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_SITE_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM22_SITE_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError198 == 0 )
      {
      }
      pr_default.close(15);
      GX_FocusControl = edtTBM22_DEL_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm22_study_id( long GX_Parm1 )
   {
      A197TBM22_STUDY_ID = GX_Parm1 ;
      /* Using cursor T000H16 */
      pr_default.execute(14, new Object[] {new Long(A197TBM22_STUDY_ID)});
      if ( (pr_default.getStatus(14) == 101) )
      {
         AnyError197 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験実施マスタ・試験サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM22_STUDY_ID_Internalname ;
      }
      if ( AnyError197 == 0 )
      {
      }
      pr_default.close(14);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tbm22_site_id( long GX_Parm1 ,
                                    String GX_Parm2 ,
                                    java.util.Date GX_Parm3 ,
                                    String GX_Parm4 ,
                                    java.util.Date GX_Parm5 ,
                                    String GX_Parm6 ,
                                    long GX_Parm7 ,
                                    String GX_Parm8 ,
                                    String GX_Parm9 ,
                                    String GX_Parm10 )
   {
      A197TBM22_STUDY_ID = GX_Parm1 ;
      A198TBM22_SITE_ID = GX_Parm2 ;
      A200TBM22_CRT_DATETIME = GX_Parm3 ;
      n200TBM22_CRT_DATETIME = false ;
      A201TBM22_CRT_USER_ID = GX_Parm4 ;
      n201TBM22_CRT_USER_ID = false ;
      A203TBM22_UPD_DATETIME = GX_Parm5 ;
      n203TBM22_UPD_DATETIME = false ;
      A204TBM22_UPD_USER_ID = GX_Parm6 ;
      n204TBM22_UPD_USER_ID = false ;
      A206TBM22_UPD_CNT = GX_Parm7 ;
      n206TBM22_UPD_CNT = false ;
      A199TBM22_DEL_FLG = GX_Parm8 ;
      n199TBM22_DEL_FLG = false ;
      A202TBM22_CRT_PROG_NM = GX_Parm9 ;
      n202TBM22_CRT_PROG_NM = false ;
      A205TBM22_UPD_PROG_NM = GX_Parm10 ;
      n205TBM22_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      /* Using cursor T000H17 */
      pr_default.execute(15, new Object[] {A198TBM22_SITE_ID});
      if ( (pr_default.getStatus(15) == 101) )
      {
         AnyError198 = 1 ;
         httpContext.GX_msglist.addItem("該当レコードなし'試験実施施設マスタ・施設サブタイプ'", "ForeignKeyNotFound", 1, "TBM22_SITE_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM22_SITE_ID_Internalname ;
      }
      if ( AnyError198 == 0 )
      {
      }
      pr_default.close(15);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A200TBM22_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A201TBM22_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A203TBM22_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A204TBM22_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A206TBM22_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A199TBM22_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A202TBM22_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A205TBM22_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z197TBM22_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z198TBM22_SITE_ID));
      isValidOutput.add(localUtil.ttoc( Z200TBM22_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z201TBM22_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z203TBM22_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z204TBM22_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z206TBM22_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z199TBM22_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z202TBM22_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z205TBM22_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O206TBM22_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      pr_default.close(14);
      pr_default.close(15);
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
                  /* Execute user subroutine: S1163 */
                  S1163 ();
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
      A198TBM22_SITE_ID = "" ;
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
      lblTextblocktbm22_study_id_Jsonclick = "" ;
      lblTextblocktbm22_site_id_Jsonclick = "" ;
      lblTextblocktbm22_del_flg_Jsonclick = "" ;
      A199TBM22_DEL_FLG = "" ;
      lblTextblocktbm22_crt_datetime_Jsonclick = "" ;
      A200TBM22_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm22_crt_user_id_Jsonclick = "" ;
      A201TBM22_CRT_USER_ID = "" ;
      lblTextblocktbm22_crt_prog_nm_Jsonclick = "" ;
      A202TBM22_CRT_PROG_NM = "" ;
      lblTextblocktbm22_upd_datetime_Jsonclick = "" ;
      A203TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm22_upd_user_id_Jsonclick = "" ;
      A204TBM22_UPD_USER_ID = "" ;
      lblTextblocktbm22_upd_prog_nm_Jsonclick = "" ;
      A205TBM22_UPD_PROG_NM = "" ;
      lblTextblocktbm22_upd_cnt_Jsonclick = "" ;
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
      Z198TBM22_SITE_ID = "" ;
      Z200TBM22_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z201TBM22_CRT_USER_ID = "" ;
      Z203TBM22_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z204TBM22_UPD_USER_ID = "" ;
      Z199TBM22_DEL_FLG = "" ;
      Z202TBM22_CRT_PROG_NM = "" ;
      Z205TBM22_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000H6_A200TBM22_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000H6_n200TBM22_CRT_DATETIME = new boolean[] {false} ;
      T000H6_A201TBM22_CRT_USER_ID = new String[] {""} ;
      T000H6_n201TBM22_CRT_USER_ID = new boolean[] {false} ;
      T000H6_A203TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000H6_n203TBM22_UPD_DATETIME = new boolean[] {false} ;
      T000H6_A204TBM22_UPD_USER_ID = new String[] {""} ;
      T000H6_n204TBM22_UPD_USER_ID = new boolean[] {false} ;
      T000H6_A206TBM22_UPD_CNT = new long[1] ;
      T000H6_n206TBM22_UPD_CNT = new boolean[] {false} ;
      T000H6_A199TBM22_DEL_FLG = new String[] {""} ;
      T000H6_n199TBM22_DEL_FLG = new boolean[] {false} ;
      T000H6_A202TBM22_CRT_PROG_NM = new String[] {""} ;
      T000H6_n202TBM22_CRT_PROG_NM = new boolean[] {false} ;
      T000H6_A205TBM22_UPD_PROG_NM = new String[] {""} ;
      T000H6_n205TBM22_UPD_PROG_NM = new boolean[] {false} ;
      T000H6_A197TBM22_STUDY_ID = new long[1] ;
      T000H6_A198TBM22_SITE_ID = new String[] {""} ;
      T000H4_A197TBM22_STUDY_ID = new long[1] ;
      T000H5_A198TBM22_SITE_ID = new String[] {""} ;
      T000H7_A197TBM22_STUDY_ID = new long[1] ;
      T000H8_A198TBM22_SITE_ID = new String[] {""} ;
      T000H9_A197TBM22_STUDY_ID = new long[1] ;
      T000H9_A198TBM22_SITE_ID = new String[] {""} ;
      T000H3_A200TBM22_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000H3_n200TBM22_CRT_DATETIME = new boolean[] {false} ;
      T000H3_A201TBM22_CRT_USER_ID = new String[] {""} ;
      T000H3_n201TBM22_CRT_USER_ID = new boolean[] {false} ;
      T000H3_A203TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000H3_n203TBM22_UPD_DATETIME = new boolean[] {false} ;
      T000H3_A204TBM22_UPD_USER_ID = new String[] {""} ;
      T000H3_n204TBM22_UPD_USER_ID = new boolean[] {false} ;
      T000H3_A206TBM22_UPD_CNT = new long[1] ;
      T000H3_n206TBM22_UPD_CNT = new boolean[] {false} ;
      T000H3_A199TBM22_DEL_FLG = new String[] {""} ;
      T000H3_n199TBM22_DEL_FLG = new boolean[] {false} ;
      T000H3_A202TBM22_CRT_PROG_NM = new String[] {""} ;
      T000H3_n202TBM22_CRT_PROG_NM = new boolean[] {false} ;
      T000H3_A205TBM22_UPD_PROG_NM = new String[] {""} ;
      T000H3_n205TBM22_UPD_PROG_NM = new boolean[] {false} ;
      T000H3_A197TBM22_STUDY_ID = new long[1] ;
      T000H3_A198TBM22_SITE_ID = new String[] {""} ;
      sMode16 = "" ;
      T000H10_A197TBM22_STUDY_ID = new long[1] ;
      T000H10_A198TBM22_SITE_ID = new String[] {""} ;
      T000H11_A197TBM22_STUDY_ID = new long[1] ;
      T000H11_A198TBM22_SITE_ID = new String[] {""} ;
      T000H2_A200TBM22_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000H2_n200TBM22_CRT_DATETIME = new boolean[] {false} ;
      T000H2_A201TBM22_CRT_USER_ID = new String[] {""} ;
      T000H2_n201TBM22_CRT_USER_ID = new boolean[] {false} ;
      T000H2_A203TBM22_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000H2_n203TBM22_UPD_DATETIME = new boolean[] {false} ;
      T000H2_A204TBM22_UPD_USER_ID = new String[] {""} ;
      T000H2_n204TBM22_UPD_USER_ID = new boolean[] {false} ;
      T000H2_A206TBM22_UPD_CNT = new long[1] ;
      T000H2_n206TBM22_UPD_CNT = new boolean[] {false} ;
      T000H2_A199TBM22_DEL_FLG = new String[] {""} ;
      T000H2_n199TBM22_DEL_FLG = new boolean[] {false} ;
      T000H2_A202TBM22_CRT_PROG_NM = new String[] {""} ;
      T000H2_n202TBM22_CRT_PROG_NM = new boolean[] {false} ;
      T000H2_A205TBM22_UPD_PROG_NM = new String[] {""} ;
      T000H2_n205TBM22_UPD_PROG_NM = new boolean[] {false} ;
      T000H2_A197TBM22_STUDY_ID = new long[1] ;
      T000H2_A198TBM22_SITE_ID = new String[] {""} ;
      T000H15_A197TBM22_STUDY_ID = new long[1] ;
      T000H15_A198TBM22_SITE_ID = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      T000H16_A197TBM22_STUDY_ID = new long[1] ;
      T000H17_A198TBM22_SITE_ID = new String[] {""} ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm22_study_site__default(),
         new Object[] {
             new Object[] {
            T000H2_A200TBM22_CRT_DATETIME, T000H2_n200TBM22_CRT_DATETIME, T000H2_A201TBM22_CRT_USER_ID, T000H2_n201TBM22_CRT_USER_ID, T000H2_A203TBM22_UPD_DATETIME, T000H2_n203TBM22_UPD_DATETIME, T000H2_A204TBM22_UPD_USER_ID, T000H2_n204TBM22_UPD_USER_ID, T000H2_A206TBM22_UPD_CNT, T000H2_n206TBM22_UPD_CNT,
            T000H2_A199TBM22_DEL_FLG, T000H2_n199TBM22_DEL_FLG, T000H2_A202TBM22_CRT_PROG_NM, T000H2_n202TBM22_CRT_PROG_NM, T000H2_A205TBM22_UPD_PROG_NM, T000H2_n205TBM22_UPD_PROG_NM, T000H2_A197TBM22_STUDY_ID, T000H2_A198TBM22_SITE_ID
            }
            , new Object[] {
            T000H3_A200TBM22_CRT_DATETIME, T000H3_n200TBM22_CRT_DATETIME, T000H3_A201TBM22_CRT_USER_ID, T000H3_n201TBM22_CRT_USER_ID, T000H3_A203TBM22_UPD_DATETIME, T000H3_n203TBM22_UPD_DATETIME, T000H3_A204TBM22_UPD_USER_ID, T000H3_n204TBM22_UPD_USER_ID, T000H3_A206TBM22_UPD_CNT, T000H3_n206TBM22_UPD_CNT,
            T000H3_A199TBM22_DEL_FLG, T000H3_n199TBM22_DEL_FLG, T000H3_A202TBM22_CRT_PROG_NM, T000H3_n202TBM22_CRT_PROG_NM, T000H3_A205TBM22_UPD_PROG_NM, T000H3_n205TBM22_UPD_PROG_NM, T000H3_A197TBM22_STUDY_ID, T000H3_A198TBM22_SITE_ID
            }
            , new Object[] {
            T000H4_A197TBM22_STUDY_ID
            }
            , new Object[] {
            T000H5_A198TBM22_SITE_ID
            }
            , new Object[] {
            T000H6_A200TBM22_CRT_DATETIME, T000H6_n200TBM22_CRT_DATETIME, T000H6_A201TBM22_CRT_USER_ID, T000H6_n201TBM22_CRT_USER_ID, T000H6_A203TBM22_UPD_DATETIME, T000H6_n203TBM22_UPD_DATETIME, T000H6_A204TBM22_UPD_USER_ID, T000H6_n204TBM22_UPD_USER_ID, T000H6_A206TBM22_UPD_CNT, T000H6_n206TBM22_UPD_CNT,
            T000H6_A199TBM22_DEL_FLG, T000H6_n199TBM22_DEL_FLG, T000H6_A202TBM22_CRT_PROG_NM, T000H6_n202TBM22_CRT_PROG_NM, T000H6_A205TBM22_UPD_PROG_NM, T000H6_n205TBM22_UPD_PROG_NM, T000H6_A197TBM22_STUDY_ID, T000H6_A198TBM22_SITE_ID
            }
            , new Object[] {
            T000H7_A197TBM22_STUDY_ID
            }
            , new Object[] {
            T000H8_A198TBM22_SITE_ID
            }
            , new Object[] {
            T000H9_A197TBM22_STUDY_ID, T000H9_A198TBM22_SITE_ID
            }
            , new Object[] {
            T000H10_A197TBM22_STUDY_ID, T000H10_A198TBM22_SITE_ID
            }
            , new Object[] {
            T000H11_A197TBM22_STUDY_ID, T000H11_A198TBM22_SITE_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000H15_A197TBM22_STUDY_ID, T000H15_A198TBM22_SITE_ID
            }
            , new Object[] {
            T000H16_A197TBM22_STUDY_ID
            }
            , new Object[] {
            T000H17_A198TBM22_SITE_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM22_STUDY_SITE" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound16 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM22_STUDY_ID_Enabled ;
   private int edtTBM22_SITE_ID_Enabled ;
   private int edtTBM22_DEL_FLG_Enabled ;
   private int edtTBM22_CRT_DATETIME_Enabled ;
   private int edtTBM22_CRT_USER_ID_Enabled ;
   private int edtTBM22_CRT_PROG_NM_Enabled ;
   private int edtTBM22_UPD_DATETIME_Enabled ;
   private int edtTBM22_UPD_USER_ID_Enabled ;
   private int edtTBM22_UPD_PROG_NM_Enabled ;
   private int edtTBM22_UPD_CNT_Enabled ;
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
   private int AnyError197 ;
   private int AnyError198 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A197TBM22_STUDY_ID ;
   private long A206TBM22_UPD_CNT ;
   private long Z197TBM22_STUDY_ID ;
   private long Z206TBM22_UPD_CNT ;
   private long O206TBM22_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM22_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm22_study_id_Internalname ;
   private String lblTextblocktbm22_study_id_Jsonclick ;
   private String edtTBM22_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm22_site_id_Internalname ;
   private String lblTextblocktbm22_site_id_Jsonclick ;
   private String edtTBM22_SITE_ID_Internalname ;
   private String edtTBM22_SITE_ID_Jsonclick ;
   private String lblTextblocktbm22_del_flg_Internalname ;
   private String lblTextblocktbm22_del_flg_Jsonclick ;
   private String edtTBM22_DEL_FLG_Internalname ;
   private String edtTBM22_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm22_crt_datetime_Internalname ;
   private String lblTextblocktbm22_crt_datetime_Jsonclick ;
   private String edtTBM22_CRT_DATETIME_Internalname ;
   private String edtTBM22_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm22_crt_user_id_Internalname ;
   private String lblTextblocktbm22_crt_user_id_Jsonclick ;
   private String edtTBM22_CRT_USER_ID_Internalname ;
   private String edtTBM22_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm22_crt_prog_nm_Internalname ;
   private String lblTextblocktbm22_crt_prog_nm_Jsonclick ;
   private String edtTBM22_CRT_PROG_NM_Internalname ;
   private String edtTBM22_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm22_upd_datetime_Internalname ;
   private String lblTextblocktbm22_upd_datetime_Jsonclick ;
   private String edtTBM22_UPD_DATETIME_Internalname ;
   private String edtTBM22_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm22_upd_user_id_Internalname ;
   private String lblTextblocktbm22_upd_user_id_Jsonclick ;
   private String edtTBM22_UPD_USER_ID_Internalname ;
   private String edtTBM22_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm22_upd_prog_nm_Internalname ;
   private String lblTextblocktbm22_upd_prog_nm_Jsonclick ;
   private String edtTBM22_UPD_PROG_NM_Internalname ;
   private String edtTBM22_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm22_upd_cnt_Internalname ;
   private String lblTextblocktbm22_upd_cnt_Jsonclick ;
   private String edtTBM22_UPD_CNT_Internalname ;
   private String edtTBM22_UPD_CNT_Jsonclick ;
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
   private String sMode16 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A200TBM22_CRT_DATETIME ;
   private java.util.Date A203TBM22_UPD_DATETIME ;
   private java.util.Date Z200TBM22_CRT_DATETIME ;
   private java.util.Date Z203TBM22_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n199TBM22_DEL_FLG ;
   private boolean n200TBM22_CRT_DATETIME ;
   private boolean n201TBM22_CRT_USER_ID ;
   private boolean n202TBM22_CRT_PROG_NM ;
   private boolean n203TBM22_UPD_DATETIME ;
   private boolean n204TBM22_UPD_USER_ID ;
   private boolean n205TBM22_UPD_PROG_NM ;
   private boolean n206TBM22_UPD_CNT ;
   private boolean Gx_longc ;
   private String A198TBM22_SITE_ID ;
   private String A199TBM22_DEL_FLG ;
   private String A201TBM22_CRT_USER_ID ;
   private String A202TBM22_CRT_PROG_NM ;
   private String A204TBM22_UPD_USER_ID ;
   private String A205TBM22_UPD_PROG_NM ;
   private String Z198TBM22_SITE_ID ;
   private String Z201TBM22_CRT_USER_ID ;
   private String Z204TBM22_UPD_USER_ID ;
   private String Z199TBM22_DEL_FLG ;
   private String Z202TBM22_CRT_PROG_NM ;
   private String Z205TBM22_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T000H6_A200TBM22_CRT_DATETIME ;
   private boolean[] T000H6_n200TBM22_CRT_DATETIME ;
   private String[] T000H6_A201TBM22_CRT_USER_ID ;
   private boolean[] T000H6_n201TBM22_CRT_USER_ID ;
   private java.util.Date[] T000H6_A203TBM22_UPD_DATETIME ;
   private boolean[] T000H6_n203TBM22_UPD_DATETIME ;
   private String[] T000H6_A204TBM22_UPD_USER_ID ;
   private boolean[] T000H6_n204TBM22_UPD_USER_ID ;
   private long[] T000H6_A206TBM22_UPD_CNT ;
   private boolean[] T000H6_n206TBM22_UPD_CNT ;
   private String[] T000H6_A199TBM22_DEL_FLG ;
   private boolean[] T000H6_n199TBM22_DEL_FLG ;
   private String[] T000H6_A202TBM22_CRT_PROG_NM ;
   private boolean[] T000H6_n202TBM22_CRT_PROG_NM ;
   private String[] T000H6_A205TBM22_UPD_PROG_NM ;
   private boolean[] T000H6_n205TBM22_UPD_PROG_NM ;
   private long[] T000H6_A197TBM22_STUDY_ID ;
   private String[] T000H6_A198TBM22_SITE_ID ;
   private long[] T000H4_A197TBM22_STUDY_ID ;
   private String[] T000H5_A198TBM22_SITE_ID ;
   private long[] T000H7_A197TBM22_STUDY_ID ;
   private String[] T000H8_A198TBM22_SITE_ID ;
   private long[] T000H9_A197TBM22_STUDY_ID ;
   private String[] T000H9_A198TBM22_SITE_ID ;
   private java.util.Date[] T000H3_A200TBM22_CRT_DATETIME ;
   private boolean[] T000H3_n200TBM22_CRT_DATETIME ;
   private String[] T000H3_A201TBM22_CRT_USER_ID ;
   private boolean[] T000H3_n201TBM22_CRT_USER_ID ;
   private java.util.Date[] T000H3_A203TBM22_UPD_DATETIME ;
   private boolean[] T000H3_n203TBM22_UPD_DATETIME ;
   private String[] T000H3_A204TBM22_UPD_USER_ID ;
   private boolean[] T000H3_n204TBM22_UPD_USER_ID ;
   private long[] T000H3_A206TBM22_UPD_CNT ;
   private boolean[] T000H3_n206TBM22_UPD_CNT ;
   private String[] T000H3_A199TBM22_DEL_FLG ;
   private boolean[] T000H3_n199TBM22_DEL_FLG ;
   private String[] T000H3_A202TBM22_CRT_PROG_NM ;
   private boolean[] T000H3_n202TBM22_CRT_PROG_NM ;
   private String[] T000H3_A205TBM22_UPD_PROG_NM ;
   private boolean[] T000H3_n205TBM22_UPD_PROG_NM ;
   private long[] T000H3_A197TBM22_STUDY_ID ;
   private String[] T000H3_A198TBM22_SITE_ID ;
   private long[] T000H10_A197TBM22_STUDY_ID ;
   private String[] T000H10_A198TBM22_SITE_ID ;
   private long[] T000H11_A197TBM22_STUDY_ID ;
   private String[] T000H11_A198TBM22_SITE_ID ;
   private java.util.Date[] T000H2_A200TBM22_CRT_DATETIME ;
   private boolean[] T000H2_n200TBM22_CRT_DATETIME ;
   private String[] T000H2_A201TBM22_CRT_USER_ID ;
   private boolean[] T000H2_n201TBM22_CRT_USER_ID ;
   private java.util.Date[] T000H2_A203TBM22_UPD_DATETIME ;
   private boolean[] T000H2_n203TBM22_UPD_DATETIME ;
   private String[] T000H2_A204TBM22_UPD_USER_ID ;
   private boolean[] T000H2_n204TBM22_UPD_USER_ID ;
   private long[] T000H2_A206TBM22_UPD_CNT ;
   private boolean[] T000H2_n206TBM22_UPD_CNT ;
   private String[] T000H2_A199TBM22_DEL_FLG ;
   private boolean[] T000H2_n199TBM22_DEL_FLG ;
   private String[] T000H2_A202TBM22_CRT_PROG_NM ;
   private boolean[] T000H2_n202TBM22_CRT_PROG_NM ;
   private String[] T000H2_A205TBM22_UPD_PROG_NM ;
   private boolean[] T000H2_n205TBM22_UPD_PROG_NM ;
   private long[] T000H2_A197TBM22_STUDY_ID ;
   private String[] T000H2_A198TBM22_SITE_ID ;
   private long[] T000H15_A197TBM22_STUDY_ID ;
   private String[] T000H15_A198TBM22_SITE_ID ;
   private long[] T000H16_A197TBM22_STUDY_ID ;
   private String[] T000H17_A198TBM22_SITE_ID ;
}

final  class tbm22_study_site__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000H2", "SELECT `TBM22_CRT_DATETIME`, `TBM22_CRT_USER_ID`, `TBM22_UPD_DATETIME`, `TBM22_UPD_USER_ID`, `TBM22_UPD_CNT`, `TBM22_DEL_FLG`, `TBM22_CRT_PROG_NM`, `TBM22_UPD_PROG_NM`, `TBM22_STUDY_ID` AS TBM22_STUDY_ID, `TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ? AND `TBM22_SITE_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H3", "SELECT `TBM22_CRT_DATETIME`, `TBM22_CRT_USER_ID`, `TBM22_UPD_DATETIME`, `TBM22_UPD_USER_ID`, `TBM22_UPD_CNT`, `TBM22_DEL_FLG`, `TBM22_CRT_PROG_NM`, `TBM22_UPD_PROG_NM`, `TBM22_STUDY_ID` AS TBM22_STUDY_ID, `TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ? AND `TBM22_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H4", "SELECT `TBM21_STUDY_ID` AS TBM22_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H5", "SELECT `TAM08_SITE_ID` AS TBM22_SITE_ID FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H6", "SELECT TM1.`TBM22_CRT_DATETIME`, TM1.`TBM22_CRT_USER_ID`, TM1.`TBM22_UPD_DATETIME`, TM1.`TBM22_UPD_USER_ID`, TM1.`TBM22_UPD_CNT`, TM1.`TBM22_DEL_FLG`, TM1.`TBM22_CRT_PROG_NM`, TM1.`TBM22_UPD_PROG_NM`, TM1.`TBM22_STUDY_ID` AS TBM22_STUDY_ID, TM1.`TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` TM1 WHERE TM1.`TBM22_STUDY_ID` = ? and TM1.`TBM22_SITE_ID` = ? ORDER BY TM1.`TBM22_STUDY_ID`, TM1.`TBM22_SITE_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000H7", "SELECT `TBM21_STUDY_ID` AS TBM22_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H8", "SELECT `TAM08_SITE_ID` AS TBM22_SITE_ID FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H9", "SELECT `TBM22_STUDY_ID` AS TBM22_STUDY_ID, `TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` WHERE `TBM22_STUDY_ID` = ? AND `TBM22_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H10", "SELECT `TBM22_STUDY_ID` AS TBM22_STUDY_ID, `TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` WHERE ( `TBM22_STUDY_ID` > ? or `TBM22_STUDY_ID` = ? and `TBM22_SITE_ID` > ?) ORDER BY `TBM22_STUDY_ID`, `TBM22_SITE_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000H11", "SELECT `TBM22_STUDY_ID` AS TBM22_STUDY_ID, `TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` WHERE ( `TBM22_STUDY_ID` < ? or `TBM22_STUDY_ID` = ? and `TBM22_SITE_ID` < ?) ORDER BY `TBM22_STUDY_ID` DESC, `TBM22_SITE_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000H12", "INSERT INTO `TBM22_STUDY_SITE` (`TBM22_CRT_DATETIME`, `TBM22_CRT_USER_ID`, `TBM22_UPD_DATETIME`, `TBM22_UPD_USER_ID`, `TBM22_UPD_CNT`, `TBM22_DEL_FLG`, `TBM22_CRT_PROG_NM`, `TBM22_UPD_PROG_NM`, `TBM22_STUDY_ID`, `TBM22_SITE_ID`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000H13", "UPDATE `TBM22_STUDY_SITE` SET `TBM22_CRT_DATETIME`=?, `TBM22_CRT_USER_ID`=?, `TBM22_UPD_DATETIME`=?, `TBM22_UPD_USER_ID`=?, `TBM22_UPD_CNT`=?, `TBM22_DEL_FLG`=?, `TBM22_CRT_PROG_NM`=?, `TBM22_UPD_PROG_NM`=?  WHERE `TBM22_STUDY_ID` = ? AND `TBM22_SITE_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000H14", "DELETE FROM `TBM22_STUDY_SITE`  WHERE `TBM22_STUDY_ID` = ? AND `TBM22_SITE_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000H15", "SELECT `TBM22_STUDY_ID` AS TBM22_STUDY_ID, `TBM22_SITE_ID` AS TBM22_SITE_ID FROM `TBM22_STUDY_SITE` ORDER BY `TBM22_STUDY_ID`, `TBM22_SITE_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000H16", "SELECT `TBM21_STUDY_ID` AS TBM22_STUDY_ID FROM `TBM21_STUDY` WHERE `TBM21_STUDY_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000H17", "SELECT `TAM08_SITE_ID` AS TBM22_SITE_ID FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
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
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 4 :
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
               ((String[]) buf[10])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getVarchar(7) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9) ;
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 7 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 8 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 13 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 14 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               break;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 7 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 20, false);
               break;
            case 9 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 20, false);
               break;
            case 10 :
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
                  stmt.setVarchar(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 40);
               }
               stmt.setLong(9, ((Number) parms[16]).longValue());
               stmt.setVarchar(10, (String)parms[17], 20, false);
               break;
            case 11 :
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
                  stmt.setVarchar(6, (String)parms[11], 1);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[13], 40);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 40);
               }
               stmt.setLong(9, ((Number) parms[16]).longValue());
               stmt.setVarchar(10, (String)parms[17], 20, false);
               break;
            case 12 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 20, false);
               break;
            case 14 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               break;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
      }
   }

}

