/*
               File: tam08_site_impl
        Description: 施設マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:54:13.48
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam08_site_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TAM08_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatam08_crt_user_id0D12( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TAM08_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatam08_upd_user_id0D12( Gx_mode) ;
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
      Form.getMeta().addItem("Description", "施設マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tam08_site_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam08_site_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam08_site_impl.class ));
   }

   public tam08_site_impl( int remoteHandle ,
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
         wb_table1_2_0D12( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0D12e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0D12( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0D12( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0D12( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0D12e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"施設マスタ"+"</legend>") ;
         wb_table3_27_0D12( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0D12e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0D12e( true) ;
      }
      else
      {
         wb_table1_2_0D12e( false) ;
      }
   }

   public void wb_table3_27_0D12( boolean wbgen )
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
         wb_table4_33_0D12( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0D12e( boolean wbgen )
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
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TAM08_SITE.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TAM08_SITE.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0D12e( true) ;
      }
      else
      {
         wb_table3_27_0D12e( false) ;
      }
   }

   public void wb_table4_33_0D12( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_site_id_Internalname, "施設ID", "", "", lblTextblocktam08_site_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_SITE_ID_Internalname, GXutil.rtrim( A132TAM08_SITE_ID), GXutil.rtrim( localUtil.format( A132TAM08_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTAM08_SITE_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_SITE_ID_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_site_nm_Internalname, "施設名", "", "", lblTextblocktam08_site_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A133TAM08_SITE_NM", A133TAM08_SITE_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_SITE_NM_Internalname, GXutil.rtrim( A133TAM08_SITE_NM), GXutil.rtrim( localUtil.format( A133TAM08_SITE_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTAM08_SITE_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_SITE_NM_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_site_snm_Internalname, "施設名（略称）", "", "", lblTextblocktam08_site_snm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A134TAM08_SITE_SNM", A134TAM08_SITE_SNM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_SITE_SNM_Internalname, GXutil.rtrim( A134TAM08_SITE_SNM), GXutil.rtrim( localUtil.format( A134TAM08_SITE_SNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTAM08_SITE_SNM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_SITE_SNM_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_outer_site_id_Internalname, "外部施設ID", "", "", lblTextblocktam08_outer_site_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A594TAM08_OUTER_SITE_ID", A594TAM08_OUTER_SITE_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_OUTER_SITE_ID_Internalname, GXutil.rtrim( A594TAM08_OUTER_SITE_ID), GXutil.rtrim( localUtil.format( A594TAM08_OUTER_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTAM08_OUTER_SITE_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_OUTER_SITE_ID_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam08_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A139TAM08_DEL_FLG", A139TAM08_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_DEL_FLG_Internalname, GXutil.rtrim( A139TAM08_DEL_FLG), GXutil.rtrim( localUtil.format( A139TAM08_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTAM08_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam08_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A140TAM08_CRT_DATETIME", localUtil.ttoc( A140TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAM08_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_CRT_DATETIME_Internalname, localUtil.format(A140TAM08_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A140TAM08_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(63);\"", "", "", "", "", edtTAM08_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAM08_SITE.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM08_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTAM08_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAM08_SITE.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_crt_user_id_Internalname, "ID", "", "", lblTextblocktam08_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A141TAM08_CRT_USER_ID", A141TAM08_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_CRT_USER_ID_Internalname, GXutil.rtrim( A141TAM08_CRT_USER_ID), GXutil.rtrim( localUtil.format( A141TAM08_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTAM08_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam08_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A142TAM08_CRT_PROG_NM", A142TAM08_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_CRT_PROG_NM_Internalname, GXutil.rtrim( A142TAM08_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A142TAM08_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTAM08_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam08_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A143TAM08_UPD_DATETIME", localUtil.ttoc( A143TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAM08_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_UPD_DATETIME_Internalname, localUtil.format(A143TAM08_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A143TAM08_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(78);\"", "", "", "", "", edtTAM08_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAM08_SITE.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM08_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTAM08_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAM08_SITE.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_upd_user_id_Internalname, "ID", "", "", lblTextblocktam08_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A144TAM08_UPD_USER_ID", A144TAM08_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_UPD_USER_ID_Internalname, GXutil.rtrim( A144TAM08_UPD_USER_ID), GXutil.rtrim( localUtil.format( A144TAM08_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTAM08_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam08_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A145TAM08_UPD_PROG_NM", A145TAM08_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_UPD_PROG_NM_Internalname, GXutil.rtrim( A145TAM08_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A145TAM08_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTAM08_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktam08_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A146TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A146TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTAM08_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A146TAM08_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A146TAM08_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(93);\"", "", "", "", "", edtTAM08_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM08_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0D12e( true) ;
      }
      else
      {
         wb_table4_33_0D12e( false) ;
      }
   }

   public void wb_table2_5_0D12( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM08_SITE.htm");
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
         wb_table2_5_0D12e( true) ;
      }
      else
      {
         wb_table2_5_0D12e( false) ;
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
      /* Execute user event: e110D2 */
      e110D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A132TAM08_SITE_ID = httpContext.cgiGet( edtTAM08_SITE_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
            A133TAM08_SITE_NM = httpContext.cgiGet( edtTAM08_SITE_NM_Internalname) ;
            n133TAM08_SITE_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A133TAM08_SITE_NM", A133TAM08_SITE_NM);
            n133TAM08_SITE_NM = ((GXutil.strcmp("", A133TAM08_SITE_NM)==0) ? true : false) ;
            A134TAM08_SITE_SNM = httpContext.cgiGet( edtTAM08_SITE_SNM_Internalname) ;
            n134TAM08_SITE_SNM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A134TAM08_SITE_SNM", A134TAM08_SITE_SNM);
            n134TAM08_SITE_SNM = ((GXutil.strcmp("", A134TAM08_SITE_SNM)==0) ? true : false) ;
            A594TAM08_OUTER_SITE_ID = httpContext.cgiGet( edtTAM08_OUTER_SITE_ID_Internalname) ;
            n594TAM08_OUTER_SITE_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A594TAM08_OUTER_SITE_ID", A594TAM08_OUTER_SITE_ID);
            n594TAM08_OUTER_SITE_ID = ((GXutil.strcmp("", A594TAM08_OUTER_SITE_ID)==0) ? true : false) ;
            A139TAM08_DEL_FLG = httpContext.cgiGet( edtTAM08_DEL_FLG_Internalname) ;
            n139TAM08_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A139TAM08_DEL_FLG", A139TAM08_DEL_FLG);
            n139TAM08_DEL_FLG = ((GXutil.strcmp("", A139TAM08_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM08_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TAM08_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM08_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A140TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n140TAM08_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A140TAM08_CRT_DATETIME", localUtil.ttoc( A140TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A140TAM08_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM08_CRT_DATETIME_Internalname)) ;
               n140TAM08_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A140TAM08_CRT_DATETIME", localUtil.ttoc( A140TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n140TAM08_CRT_DATETIME = (GXutil.nullDate().equals(A140TAM08_CRT_DATETIME) ? true : false) ;
            A141TAM08_CRT_USER_ID = httpContext.cgiGet( edtTAM08_CRT_USER_ID_Internalname) ;
            n141TAM08_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A141TAM08_CRT_USER_ID", A141TAM08_CRT_USER_ID);
            n141TAM08_CRT_USER_ID = ((GXutil.strcmp("", A141TAM08_CRT_USER_ID)==0) ? true : false) ;
            A142TAM08_CRT_PROG_NM = httpContext.cgiGet( edtTAM08_CRT_PROG_NM_Internalname) ;
            n142TAM08_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A142TAM08_CRT_PROG_NM", A142TAM08_CRT_PROG_NM);
            n142TAM08_CRT_PROG_NM = ((GXutil.strcmp("", A142TAM08_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM08_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TAM08_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM08_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A143TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n143TAM08_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A143TAM08_UPD_DATETIME", localUtil.ttoc( A143TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A143TAM08_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM08_UPD_DATETIME_Internalname)) ;
               n143TAM08_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A143TAM08_UPD_DATETIME", localUtil.ttoc( A143TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n143TAM08_UPD_DATETIME = (GXutil.nullDate().equals(A143TAM08_UPD_DATETIME) ? true : false) ;
            A144TAM08_UPD_USER_ID = httpContext.cgiGet( edtTAM08_UPD_USER_ID_Internalname) ;
            n144TAM08_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A144TAM08_UPD_USER_ID", A144TAM08_UPD_USER_ID);
            n144TAM08_UPD_USER_ID = ((GXutil.strcmp("", A144TAM08_UPD_USER_ID)==0) ? true : false) ;
            A145TAM08_UPD_PROG_NM = httpContext.cgiGet( edtTAM08_UPD_PROG_NM_Internalname) ;
            n145TAM08_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A145TAM08_UPD_PROG_NM", A145TAM08_UPD_PROG_NM);
            n145TAM08_UPD_PROG_NM = ((GXutil.strcmp("", A145TAM08_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAM08_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAM08_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAM08_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM08_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A146TAM08_UPD_CNT = 0 ;
               n146TAM08_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A146TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)));
            }
            else
            {
               A146TAM08_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTAM08_UPD_CNT_Internalname), ".", ",") ;
               n146TAM08_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A146TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)));
            }
            n146TAM08_UPD_CNT = ((0==A146TAM08_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z132TAM08_SITE_ID = httpContext.cgiGet( "Z132TAM08_SITE_ID") ;
            Z140TAM08_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z140TAM08_CRT_DATETIME"), 0) ;
            n140TAM08_CRT_DATETIME = (GXutil.nullDate().equals(A140TAM08_CRT_DATETIME) ? true : false) ;
            Z141TAM08_CRT_USER_ID = httpContext.cgiGet( "Z141TAM08_CRT_USER_ID") ;
            n141TAM08_CRT_USER_ID = ((GXutil.strcmp("", A141TAM08_CRT_USER_ID)==0) ? true : false) ;
            Z143TAM08_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z143TAM08_UPD_DATETIME"), 0) ;
            n143TAM08_UPD_DATETIME = (GXutil.nullDate().equals(A143TAM08_UPD_DATETIME) ? true : false) ;
            Z144TAM08_UPD_USER_ID = httpContext.cgiGet( "Z144TAM08_UPD_USER_ID") ;
            n144TAM08_UPD_USER_ID = ((GXutil.strcmp("", A144TAM08_UPD_USER_ID)==0) ? true : false) ;
            Z146TAM08_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z146TAM08_UPD_CNT"), ".", ",") ;
            n146TAM08_UPD_CNT = ((0==A146TAM08_UPD_CNT) ? true : false) ;
            Z133TAM08_SITE_NM = httpContext.cgiGet( "Z133TAM08_SITE_NM") ;
            n133TAM08_SITE_NM = ((GXutil.strcmp("", A133TAM08_SITE_NM)==0) ? true : false) ;
            Z134TAM08_SITE_SNM = httpContext.cgiGet( "Z134TAM08_SITE_SNM") ;
            n134TAM08_SITE_SNM = ((GXutil.strcmp("", A134TAM08_SITE_SNM)==0) ? true : false) ;
            Z594TAM08_OUTER_SITE_ID = httpContext.cgiGet( "Z594TAM08_OUTER_SITE_ID") ;
            n594TAM08_OUTER_SITE_ID = ((GXutil.strcmp("", A594TAM08_OUTER_SITE_ID)==0) ? true : false) ;
            Z139TAM08_DEL_FLG = httpContext.cgiGet( "Z139TAM08_DEL_FLG") ;
            n139TAM08_DEL_FLG = ((GXutil.strcmp("", A139TAM08_DEL_FLG)==0) ? true : false) ;
            Z142TAM08_CRT_PROG_NM = httpContext.cgiGet( "Z142TAM08_CRT_PROG_NM") ;
            n142TAM08_CRT_PROG_NM = ((GXutil.strcmp("", A142TAM08_CRT_PROG_NM)==0) ? true : false) ;
            Z145TAM08_UPD_PROG_NM = httpContext.cgiGet( "Z145TAM08_UPD_PROG_NM") ;
            n145TAM08_UPD_PROG_NM = ((GXutil.strcmp("", A145TAM08_UPD_PROG_NM)==0) ? true : false) ;
            O146TAM08_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O146TAM08_UPD_CNT"), ".", ",") ;
            n146TAM08_UPD_CNT = ((0==A146TAM08_UPD_CNT) ? true : false) ;
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
               A132TAM08_SITE_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
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
                     /* Execute user event: e110D2 */
                     e110D2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120D2 */
                     e120D2 ();
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
         /* Execute user event: e120D2 */
         e120D2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0D12( ) ;
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
      disableAttributes0D12( ) ;
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

   public void resetCaption0D0( )
   {
   }

   public void e110D2( )
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

   public void e120D2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "施設ID:" + A132TAM08_SITE_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A133TAM08_SITE_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A134TAM08_SITE_SNM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A594TAM08_OUTER_SITE_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A139TAM08_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A140TAM08_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tam08_site_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A140TAM08_CRT_DATETIME", localUtil.ttoc( A140TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A141TAM08_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A142TAM08_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A143TAM08_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tam08_site_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A143TAM08_UPD_DATETIME", localUtil.ttoc( A143TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A144TAM08_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A145TAM08_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0D12( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z140TAM08_CRT_DATETIME = T000D3_A140TAM08_CRT_DATETIME[0] ;
            Z141TAM08_CRT_USER_ID = T000D3_A141TAM08_CRT_USER_ID[0] ;
            Z143TAM08_UPD_DATETIME = T000D3_A143TAM08_UPD_DATETIME[0] ;
            Z144TAM08_UPD_USER_ID = T000D3_A144TAM08_UPD_USER_ID[0] ;
            Z146TAM08_UPD_CNT = T000D3_A146TAM08_UPD_CNT[0] ;
            Z133TAM08_SITE_NM = T000D3_A133TAM08_SITE_NM[0] ;
            Z134TAM08_SITE_SNM = T000D3_A134TAM08_SITE_SNM[0] ;
            Z594TAM08_OUTER_SITE_ID = T000D3_A594TAM08_OUTER_SITE_ID[0] ;
            Z139TAM08_DEL_FLG = T000D3_A139TAM08_DEL_FLG[0] ;
            Z142TAM08_CRT_PROG_NM = T000D3_A142TAM08_CRT_PROG_NM[0] ;
            Z145TAM08_UPD_PROG_NM = T000D3_A145TAM08_UPD_PROG_NM[0] ;
         }
         else
         {
            Z140TAM08_CRT_DATETIME = A140TAM08_CRT_DATETIME ;
            Z141TAM08_CRT_USER_ID = A141TAM08_CRT_USER_ID ;
            Z143TAM08_UPD_DATETIME = A143TAM08_UPD_DATETIME ;
            Z144TAM08_UPD_USER_ID = A144TAM08_UPD_USER_ID ;
            Z146TAM08_UPD_CNT = A146TAM08_UPD_CNT ;
            Z133TAM08_SITE_NM = A133TAM08_SITE_NM ;
            Z134TAM08_SITE_SNM = A134TAM08_SITE_SNM ;
            Z594TAM08_OUTER_SITE_ID = A594TAM08_OUTER_SITE_ID ;
            Z139TAM08_DEL_FLG = A139TAM08_DEL_FLG ;
            Z142TAM08_CRT_PROG_NM = A142TAM08_CRT_PROG_NM ;
            Z145TAM08_UPD_PROG_NM = A145TAM08_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z132TAM08_SITE_ID = A132TAM08_SITE_ID ;
         Z140TAM08_CRT_DATETIME = A140TAM08_CRT_DATETIME ;
         Z141TAM08_CRT_USER_ID = A141TAM08_CRT_USER_ID ;
         Z143TAM08_UPD_DATETIME = A143TAM08_UPD_DATETIME ;
         Z144TAM08_UPD_USER_ID = A144TAM08_UPD_USER_ID ;
         Z146TAM08_UPD_CNT = A146TAM08_UPD_CNT ;
         Z133TAM08_SITE_NM = A133TAM08_SITE_NM ;
         Z134TAM08_SITE_SNM = A134TAM08_SITE_SNM ;
         Z594TAM08_OUTER_SITE_ID = A594TAM08_OUTER_SITE_ID ;
         Z139TAM08_DEL_FLG = A139TAM08_DEL_FLG ;
         Z142TAM08_CRT_PROG_NM = A142TAM08_CRT_PROG_NM ;
         Z145TAM08_UPD_PROG_NM = A145TAM08_UPD_PROG_NM ;
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

   public void load0D12( )
   {
      /* Using cursor T000D4 */
      pr_default.execute(2, new Object[] {A132TAM08_SITE_ID});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A140TAM08_CRT_DATETIME = T000D4_A140TAM08_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A140TAM08_CRT_DATETIME", localUtil.ttoc( A140TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n140TAM08_CRT_DATETIME = T000D4_n140TAM08_CRT_DATETIME[0] ;
         A141TAM08_CRT_USER_ID = T000D4_A141TAM08_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A141TAM08_CRT_USER_ID", A141TAM08_CRT_USER_ID);
         n141TAM08_CRT_USER_ID = T000D4_n141TAM08_CRT_USER_ID[0] ;
         A143TAM08_UPD_DATETIME = T000D4_A143TAM08_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143TAM08_UPD_DATETIME", localUtil.ttoc( A143TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n143TAM08_UPD_DATETIME = T000D4_n143TAM08_UPD_DATETIME[0] ;
         A144TAM08_UPD_USER_ID = T000D4_A144TAM08_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A144TAM08_UPD_USER_ID", A144TAM08_UPD_USER_ID);
         n144TAM08_UPD_USER_ID = T000D4_n144TAM08_UPD_USER_ID[0] ;
         A146TAM08_UPD_CNT = T000D4_A146TAM08_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A146TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)));
         n146TAM08_UPD_CNT = T000D4_n146TAM08_UPD_CNT[0] ;
         A133TAM08_SITE_NM = T000D4_A133TAM08_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A133TAM08_SITE_NM", A133TAM08_SITE_NM);
         n133TAM08_SITE_NM = T000D4_n133TAM08_SITE_NM[0] ;
         A134TAM08_SITE_SNM = T000D4_A134TAM08_SITE_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A134TAM08_SITE_SNM", A134TAM08_SITE_SNM);
         n134TAM08_SITE_SNM = T000D4_n134TAM08_SITE_SNM[0] ;
         A594TAM08_OUTER_SITE_ID = T000D4_A594TAM08_OUTER_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A594TAM08_OUTER_SITE_ID", A594TAM08_OUTER_SITE_ID);
         n594TAM08_OUTER_SITE_ID = T000D4_n594TAM08_OUTER_SITE_ID[0] ;
         A139TAM08_DEL_FLG = T000D4_A139TAM08_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A139TAM08_DEL_FLG", A139TAM08_DEL_FLG);
         n139TAM08_DEL_FLG = T000D4_n139TAM08_DEL_FLG[0] ;
         A142TAM08_CRT_PROG_NM = T000D4_A142TAM08_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A142TAM08_CRT_PROG_NM", A142TAM08_CRT_PROG_NM);
         n142TAM08_CRT_PROG_NM = T000D4_n142TAM08_CRT_PROG_NM[0] ;
         A145TAM08_UPD_PROG_NM = T000D4_A145TAM08_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A145TAM08_UPD_PROG_NM", A145TAM08_UPD_PROG_NM);
         n145TAM08_UPD_PROG_NM = T000D4_n145TAM08_UPD_PROG_NM[0] ;
         zm0D12( -8) ;
      }
      pr_default.close(2);
      onLoadActions0D12( ) ;
   }

   public void onLoadActions0D12( )
   {
      AV9Pgmname = "TAM08_SITE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0D12( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TAM08_SITE" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A140TAM08_CRT_DATETIME) || (( A140TAM08_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A140TAM08_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A143TAM08_UPD_DATETIME) || (( A143TAM08_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A143TAM08_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0D12( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0D12( )
   {
      /* Using cursor T000D5 */
      pr_default.execute(3, new Object[] {A132TAM08_SITE_ID});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound12 = (short)(1) ;
      }
      else
      {
         RcdFound12 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000D3 */
      pr_default.execute(1, new Object[] {A132TAM08_SITE_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0D12( 8) ;
         RcdFound12 = (short)(1) ;
         A132TAM08_SITE_ID = T000D3_A132TAM08_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
         A140TAM08_CRT_DATETIME = T000D3_A140TAM08_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A140TAM08_CRT_DATETIME", localUtil.ttoc( A140TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n140TAM08_CRT_DATETIME = T000D3_n140TAM08_CRT_DATETIME[0] ;
         A141TAM08_CRT_USER_ID = T000D3_A141TAM08_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A141TAM08_CRT_USER_ID", A141TAM08_CRT_USER_ID);
         n141TAM08_CRT_USER_ID = T000D3_n141TAM08_CRT_USER_ID[0] ;
         A143TAM08_UPD_DATETIME = T000D3_A143TAM08_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A143TAM08_UPD_DATETIME", localUtil.ttoc( A143TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n143TAM08_UPD_DATETIME = T000D3_n143TAM08_UPD_DATETIME[0] ;
         A144TAM08_UPD_USER_ID = T000D3_A144TAM08_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A144TAM08_UPD_USER_ID", A144TAM08_UPD_USER_ID);
         n144TAM08_UPD_USER_ID = T000D3_n144TAM08_UPD_USER_ID[0] ;
         A146TAM08_UPD_CNT = T000D3_A146TAM08_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A146TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)));
         n146TAM08_UPD_CNT = T000D3_n146TAM08_UPD_CNT[0] ;
         A133TAM08_SITE_NM = T000D3_A133TAM08_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A133TAM08_SITE_NM", A133TAM08_SITE_NM);
         n133TAM08_SITE_NM = T000D3_n133TAM08_SITE_NM[0] ;
         A134TAM08_SITE_SNM = T000D3_A134TAM08_SITE_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A134TAM08_SITE_SNM", A134TAM08_SITE_SNM);
         n134TAM08_SITE_SNM = T000D3_n134TAM08_SITE_SNM[0] ;
         A594TAM08_OUTER_SITE_ID = T000D3_A594TAM08_OUTER_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A594TAM08_OUTER_SITE_ID", A594TAM08_OUTER_SITE_ID);
         n594TAM08_OUTER_SITE_ID = T000D3_n594TAM08_OUTER_SITE_ID[0] ;
         A139TAM08_DEL_FLG = T000D3_A139TAM08_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A139TAM08_DEL_FLG", A139TAM08_DEL_FLG);
         n139TAM08_DEL_FLG = T000D3_n139TAM08_DEL_FLG[0] ;
         A142TAM08_CRT_PROG_NM = T000D3_A142TAM08_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A142TAM08_CRT_PROG_NM", A142TAM08_CRT_PROG_NM);
         n142TAM08_CRT_PROG_NM = T000D3_n142TAM08_CRT_PROG_NM[0] ;
         A145TAM08_UPD_PROG_NM = T000D3_A145TAM08_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A145TAM08_UPD_PROG_NM", A145TAM08_UPD_PROG_NM);
         n145TAM08_UPD_PROG_NM = T000D3_n145TAM08_UPD_PROG_NM[0] ;
         O146TAM08_UPD_CNT = A146TAM08_UPD_CNT ;
         n146TAM08_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A146TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)));
         Z132TAM08_SITE_ID = A132TAM08_SITE_ID ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0D12( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound12 = (short)(0) ;
         initializeNonKey0D12( ) ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode12 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0D12( ) ;
      if ( RcdFound12 == 0 )
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
      RcdFound12 = (short)(0) ;
      /* Using cursor T000D6 */
      pr_default.execute(4, new Object[] {A132TAM08_SITE_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000D6_A132TAM08_SITE_ID[0], A132TAM08_SITE_ID) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000D6_A132TAM08_SITE_ID[0], A132TAM08_SITE_ID) > 0 ) ) )
         {
            A132TAM08_SITE_ID = T000D6_A132TAM08_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T000D7 */
      pr_default.execute(5, new Object[] {A132TAM08_SITE_ID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000D7_A132TAM08_SITE_ID[0], A132TAM08_SITE_ID) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000D7_A132TAM08_SITE_ID[0], A132TAM08_SITE_ID) < 0 ) ) )
         {
            A132TAM08_SITE_ID = T000D7_A132TAM08_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0D12( ) ;
      if ( RcdFound12 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAM08_SITE_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A132TAM08_SITE_ID, Z132TAM08_SITE_ID) != 0 )
         {
            A132TAM08_SITE_ID = Z132TAM08_SITE_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TAM08_SITE_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update0D12( ) ;
            GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( GXutil.strcmp(A132TAM08_SITE_ID, Z132TAM08_SITE_ID) != 0 )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0D12( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM08_SITE_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0D12( ) ;
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
      if ( GXutil.strcmp(A132TAM08_SITE_ID, Z132TAM08_SITE_ID) != 0 )
      {
         A132TAM08_SITE_ID = Z132TAM08_SITE_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TAM08_SITE_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM08_SITE_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTAM08_SITE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0D12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM08_SITE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0D12( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM08_SITE_NM_Internalname ;
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
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM08_SITE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0D12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound12 != 0 )
         {
            scanNext0D12( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM08_SITE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0D12( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0D12( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000D2 */
         pr_default.execute(0, new Object[] {A132TAM08_SITE_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM08_SITE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z140TAM08_CRT_DATETIME.equals( T000D2_A140TAM08_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z141TAM08_CRT_USER_ID, T000D2_A141TAM08_CRT_USER_ID[0]) != 0 ) || !( Z143TAM08_UPD_DATETIME.equals( T000D2_A143TAM08_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z144TAM08_UPD_USER_ID, T000D2_A144TAM08_UPD_USER_ID[0]) != 0 ) || ( Z146TAM08_UPD_CNT != T000D2_A146TAM08_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z133TAM08_SITE_NM, T000D2_A133TAM08_SITE_NM[0]) != 0 ) || ( GXutil.strcmp(Z134TAM08_SITE_SNM, T000D2_A134TAM08_SITE_SNM[0]) != 0 ) || ( GXutil.strcmp(Z594TAM08_OUTER_SITE_ID, T000D2_A594TAM08_OUTER_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z139TAM08_DEL_FLG, T000D2_A139TAM08_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z142TAM08_CRT_PROG_NM, T000D2_A142TAM08_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z145TAM08_UPD_PROG_NM, T000D2_A145TAM08_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM08_SITE"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0D12( )
   {
      beforeValidate0D12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0D12( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0D12( 0) ;
         checkOptimisticConcurrency0D12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0D12( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0D12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000D8 */
                  pr_default.execute(6, new Object[] {A132TAM08_SITE_ID, new Boolean(n140TAM08_CRT_DATETIME), A140TAM08_CRT_DATETIME, new Boolean(n141TAM08_CRT_USER_ID), A141TAM08_CRT_USER_ID, new Boolean(n143TAM08_UPD_DATETIME), A143TAM08_UPD_DATETIME, new Boolean(n144TAM08_UPD_USER_ID), A144TAM08_UPD_USER_ID, new Boolean(n146TAM08_UPD_CNT), new Long(A146TAM08_UPD_CNT), new Boolean(n133TAM08_SITE_NM), A133TAM08_SITE_NM, new Boolean(n134TAM08_SITE_SNM), A134TAM08_SITE_SNM, new Boolean(n594TAM08_OUTER_SITE_ID), A594TAM08_OUTER_SITE_ID, new Boolean(n139TAM08_DEL_FLG), A139TAM08_DEL_FLG, new Boolean(n142TAM08_CRT_PROG_NM), A142TAM08_CRT_PROG_NM, new Boolean(n145TAM08_UPD_PROG_NM), A145TAM08_UPD_PROG_NM});
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
                        resetCaption0D0( ) ;
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
            load0D12( ) ;
         }
         endLevel0D12( ) ;
      }
      closeExtendedTableCursors0D12( ) ;
   }

   public void update0D12( )
   {
      beforeValidate0D12( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0D12( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0D12( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0D12( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0D12( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000D9 */
                  pr_default.execute(7, new Object[] {new Boolean(n140TAM08_CRT_DATETIME), A140TAM08_CRT_DATETIME, new Boolean(n141TAM08_CRT_USER_ID), A141TAM08_CRT_USER_ID, new Boolean(n143TAM08_UPD_DATETIME), A143TAM08_UPD_DATETIME, new Boolean(n144TAM08_UPD_USER_ID), A144TAM08_UPD_USER_ID, new Boolean(n146TAM08_UPD_CNT), new Long(A146TAM08_UPD_CNT), new Boolean(n133TAM08_SITE_NM), A133TAM08_SITE_NM, new Boolean(n134TAM08_SITE_SNM), A134TAM08_SITE_SNM, new Boolean(n594TAM08_OUTER_SITE_ID), A594TAM08_OUTER_SITE_ID, new Boolean(n139TAM08_DEL_FLG), A139TAM08_DEL_FLG, new Boolean(n142TAM08_CRT_PROG_NM), A142TAM08_CRT_PROG_NM, new Boolean(n145TAM08_UPD_PROG_NM), A145TAM08_UPD_PROG_NM, A132TAM08_SITE_ID});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM08_SITE"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0D12( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption0D0( ) ;
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
         endLevel0D12( ) ;
      }
      closeExtendedTableCursors0D12( ) ;
   }

   public void deferredUpdate0D12( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0D12( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0D12( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0D12( ) ;
         afterConfirm0D12( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0D12( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000D10 */
               pr_default.execute(8, new Object[] {A132TAM08_SITE_ID});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound12 == 0 )
                     {
                        initAll0D12( ) ;
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
                     resetCaption0D0( ) ;
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
      sMode12 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0D12( ) ;
      Gx_mode = sMode12 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0D12( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TAM08_SITE" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000D11 */
         pr_default.execute(9, new Object[] {A132TAM08_SITE_ID});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T000D12 */
         pr_default.execute(10, new Object[] {A132TAM08_SITE_ID});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験実施施設マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
      }
   }

   public void endLevel0D12( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0D12( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tam08_site");
         if ( AnyError == 0 )
         {
            confirmValues0D0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tam08_site");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0D12( )
   {
      /* Using cursor T000D13 */
      pr_default.execute(11);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A132TAM08_SITE_ID = T000D13_A132TAM08_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0D12( )
   {
      pr_default.readNext(11);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A132TAM08_SITE_ID = T000D13_A132TAM08_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
      }
   }

   public void scanEnd0D12( )
   {
      pr_default.close(11);
   }

   public void afterConfirm0D12( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0D12( )
   {
      /* Before Insert Rules */
      A140TAM08_CRT_DATETIME = GXutil.now( ) ;
      n140TAM08_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A140TAM08_CRT_DATETIME", localUtil.ttoc( A140TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A141TAM08_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam08_site_impl.this.GXt_char3 = GXv_char4[0] ;
      A141TAM08_CRT_USER_ID = GXt_char3 ;
      n141TAM08_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A141TAM08_CRT_USER_ID", A141TAM08_CRT_USER_ID);
      A143TAM08_UPD_DATETIME = GXutil.now( ) ;
      n143TAM08_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A143TAM08_UPD_DATETIME", localUtil.ttoc( A143TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A144TAM08_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam08_site_impl.this.GXt_char3 = GXv_char4[0] ;
      A144TAM08_UPD_USER_ID = GXt_char3 ;
      n144TAM08_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A144TAM08_UPD_USER_ID", A144TAM08_UPD_USER_ID);
      A146TAM08_UPD_CNT = (long)(O146TAM08_UPD_CNT+1) ;
      n146TAM08_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A146TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0D12( )
   {
      /* Before Update Rules */
      A143TAM08_UPD_DATETIME = GXutil.now( ) ;
      n143TAM08_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A143TAM08_UPD_DATETIME", localUtil.ttoc( A143TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A144TAM08_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam08_site_impl.this.GXt_char3 = GXv_char4[0] ;
      A144TAM08_UPD_USER_ID = GXt_char3 ;
      n144TAM08_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A144TAM08_UPD_USER_ID", A144TAM08_UPD_USER_ID);
      A146TAM08_UPD_CNT = (long)(O146TAM08_UPD_CNT+1) ;
      n146TAM08_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A146TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0D12( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0D12( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0D12( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0D12( )
   {
      edtTAM08_SITE_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_SITE_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_SITE_ID_Enabled, 5, 0)));
      edtTAM08_SITE_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_SITE_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_SITE_NM_Enabled, 5, 0)));
      edtTAM08_SITE_SNM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_SITE_SNM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_SITE_SNM_Enabled, 5, 0)));
      edtTAM08_OUTER_SITE_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_OUTER_SITE_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_OUTER_SITE_ID_Enabled, 5, 0)));
      edtTAM08_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_DEL_FLG_Enabled, 5, 0)));
      edtTAM08_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM08_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM08_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM08_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM08_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM08_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_UPD_PROG_NM_Enabled, 5, 0)));
      edtTAM08_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM08_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM08_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0D0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "施設マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tam08_site") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0D12( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z132TAM08_SITE_ID", GXutil.rtrim( Z132TAM08_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z140TAM08_CRT_DATETIME", localUtil.ttoc( Z140TAM08_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z141TAM08_CRT_USER_ID", GXutil.rtrim( Z141TAM08_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z143TAM08_UPD_DATETIME", localUtil.ttoc( Z143TAM08_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z144TAM08_UPD_USER_ID", GXutil.rtrim( Z144TAM08_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z146TAM08_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z146TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z133TAM08_SITE_NM", GXutil.rtrim( Z133TAM08_SITE_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z134TAM08_SITE_SNM", GXutil.rtrim( Z134TAM08_SITE_SNM));
      GxWebStd.gx_hidden_field( httpContext, "Z594TAM08_OUTER_SITE_ID", GXutil.rtrim( Z594TAM08_OUTER_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z139TAM08_DEL_FLG", GXutil.rtrim( Z139TAM08_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z142TAM08_CRT_PROG_NM", GXutil.rtrim( Z142TAM08_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z145TAM08_UPD_PROG_NM", GXutil.rtrim( Z145TAM08_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O146TAM08_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O146TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0D12( )
   {
      A140TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n140TAM08_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A140TAM08_CRT_DATETIME", localUtil.ttoc( A140TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n140TAM08_CRT_DATETIME = (GXutil.nullDate().equals(A140TAM08_CRT_DATETIME) ? true : false) ;
      A141TAM08_CRT_USER_ID = "" ;
      n141TAM08_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A141TAM08_CRT_USER_ID", A141TAM08_CRT_USER_ID);
      n141TAM08_CRT_USER_ID = ((GXutil.strcmp("", A141TAM08_CRT_USER_ID)==0) ? true : false) ;
      A143TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n143TAM08_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A143TAM08_UPD_DATETIME", localUtil.ttoc( A143TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n143TAM08_UPD_DATETIME = (GXutil.nullDate().equals(A143TAM08_UPD_DATETIME) ? true : false) ;
      A144TAM08_UPD_USER_ID = "" ;
      n144TAM08_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A144TAM08_UPD_USER_ID", A144TAM08_UPD_USER_ID);
      n144TAM08_UPD_USER_ID = ((GXutil.strcmp("", A144TAM08_UPD_USER_ID)==0) ? true : false) ;
      A146TAM08_UPD_CNT = 0 ;
      n146TAM08_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A146TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)));
      n146TAM08_UPD_CNT = ((0==A146TAM08_UPD_CNT) ? true : false) ;
      A133TAM08_SITE_NM = "" ;
      n133TAM08_SITE_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A133TAM08_SITE_NM", A133TAM08_SITE_NM);
      n133TAM08_SITE_NM = ((GXutil.strcmp("", A133TAM08_SITE_NM)==0) ? true : false) ;
      A134TAM08_SITE_SNM = "" ;
      n134TAM08_SITE_SNM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A134TAM08_SITE_SNM", A134TAM08_SITE_SNM);
      n134TAM08_SITE_SNM = ((GXutil.strcmp("", A134TAM08_SITE_SNM)==0) ? true : false) ;
      A594TAM08_OUTER_SITE_ID = "" ;
      n594TAM08_OUTER_SITE_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A594TAM08_OUTER_SITE_ID", A594TAM08_OUTER_SITE_ID);
      n594TAM08_OUTER_SITE_ID = ((GXutil.strcmp("", A594TAM08_OUTER_SITE_ID)==0) ? true : false) ;
      A139TAM08_DEL_FLG = "" ;
      n139TAM08_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A139TAM08_DEL_FLG", A139TAM08_DEL_FLG);
      n139TAM08_DEL_FLG = ((GXutil.strcmp("", A139TAM08_DEL_FLG)==0) ? true : false) ;
      A142TAM08_CRT_PROG_NM = "" ;
      n142TAM08_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A142TAM08_CRT_PROG_NM", A142TAM08_CRT_PROG_NM);
      n142TAM08_CRT_PROG_NM = ((GXutil.strcmp("", A142TAM08_CRT_PROG_NM)==0) ? true : false) ;
      A145TAM08_UPD_PROG_NM = "" ;
      n145TAM08_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A145TAM08_UPD_PROG_NM", A145TAM08_UPD_PROG_NM);
      n145TAM08_UPD_PROG_NM = ((GXutil.strcmp("", A145TAM08_UPD_PROG_NM)==0) ? true : false) ;
      O146TAM08_UPD_CNT = A146TAM08_UPD_CNT ;
      n146TAM08_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A146TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A146TAM08_UPD_CNT, 10, 0)));
   }

   public void initAll0D12( )
   {
      A132TAM08_SITE_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A132TAM08_SITE_ID", A132TAM08_SITE_ID);
      initializeNonKey0D12( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14541492");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tam08_site.js", "?14541492");
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
      lblTextblocktam08_site_id_Internalname = "TEXTBLOCKTAM08_SITE_ID" ;
      edtTAM08_SITE_ID_Internalname = "TAM08_SITE_ID" ;
      lblTextblocktam08_site_nm_Internalname = "TEXTBLOCKTAM08_SITE_NM" ;
      edtTAM08_SITE_NM_Internalname = "TAM08_SITE_NM" ;
      lblTextblocktam08_site_snm_Internalname = "TEXTBLOCKTAM08_SITE_SNM" ;
      edtTAM08_SITE_SNM_Internalname = "TAM08_SITE_SNM" ;
      lblTextblocktam08_outer_site_id_Internalname = "TEXTBLOCKTAM08_OUTER_SITE_ID" ;
      edtTAM08_OUTER_SITE_ID_Internalname = "TAM08_OUTER_SITE_ID" ;
      lblTextblocktam08_del_flg_Internalname = "TEXTBLOCKTAM08_DEL_FLG" ;
      edtTAM08_DEL_FLG_Internalname = "TAM08_DEL_FLG" ;
      lblTextblocktam08_crt_datetime_Internalname = "TEXTBLOCKTAM08_CRT_DATETIME" ;
      edtTAM08_CRT_DATETIME_Internalname = "TAM08_CRT_DATETIME" ;
      lblTextblocktam08_crt_user_id_Internalname = "TEXTBLOCKTAM08_CRT_USER_ID" ;
      edtTAM08_CRT_USER_ID_Internalname = "TAM08_CRT_USER_ID" ;
      lblTextblocktam08_crt_prog_nm_Internalname = "TEXTBLOCKTAM08_CRT_PROG_NM" ;
      edtTAM08_CRT_PROG_NM_Internalname = "TAM08_CRT_PROG_NM" ;
      lblTextblocktam08_upd_datetime_Internalname = "TEXTBLOCKTAM08_UPD_DATETIME" ;
      edtTAM08_UPD_DATETIME_Internalname = "TAM08_UPD_DATETIME" ;
      lblTextblocktam08_upd_user_id_Internalname = "TEXTBLOCKTAM08_UPD_USER_ID" ;
      edtTAM08_UPD_USER_ID_Internalname = "TAM08_UPD_USER_ID" ;
      lblTextblocktam08_upd_prog_nm_Internalname = "TEXTBLOCKTAM08_UPD_PROG_NM" ;
      edtTAM08_UPD_PROG_NM_Internalname = "TAM08_UPD_PROG_NM" ;
      lblTextblocktam08_upd_cnt_Internalname = "TEXTBLOCKTAM08_UPD_CNT" ;
      edtTAM08_UPD_CNT_Internalname = "TAM08_UPD_CNT" ;
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
      edtTAM08_UPD_CNT_Jsonclick = "" ;
      edtTAM08_UPD_CNT_Enabled = 1 ;
      edtTAM08_UPD_PROG_NM_Jsonclick = "" ;
      edtTAM08_UPD_PROG_NM_Enabled = 1 ;
      edtTAM08_UPD_USER_ID_Jsonclick = "" ;
      edtTAM08_UPD_USER_ID_Enabled = 1 ;
      edtTAM08_UPD_DATETIME_Jsonclick = "" ;
      edtTAM08_UPD_DATETIME_Enabled = 1 ;
      edtTAM08_CRT_PROG_NM_Jsonclick = "" ;
      edtTAM08_CRT_PROG_NM_Enabled = 1 ;
      edtTAM08_CRT_USER_ID_Jsonclick = "" ;
      edtTAM08_CRT_USER_ID_Enabled = 1 ;
      edtTAM08_CRT_DATETIME_Jsonclick = "" ;
      edtTAM08_CRT_DATETIME_Enabled = 1 ;
      edtTAM08_DEL_FLG_Jsonclick = "" ;
      edtTAM08_DEL_FLG_Enabled = 1 ;
      edtTAM08_OUTER_SITE_ID_Jsonclick = "" ;
      edtTAM08_OUTER_SITE_ID_Enabled = 1 ;
      edtTAM08_SITE_SNM_Jsonclick = "" ;
      edtTAM08_SITE_SNM_Enabled = 1 ;
      edtTAM08_SITE_NM_Jsonclick = "" ;
      edtTAM08_SITE_NM_Enabled = 1 ;
      edtTAM08_SITE_ID_Jsonclick = "" ;
      edtTAM08_SITE_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatam08_crt_user_id0D12( String Gx_mode )
   {
      GXt_char3 = A141TAM08_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam08_site_impl.this.GXt_char3 = GXv_char4[0] ;
      A141TAM08_CRT_USER_ID = GXt_char3 ;
      n141TAM08_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A141TAM08_CRT_USER_ID", A141TAM08_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A141TAM08_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatam08_upd_user_id0D12( String Gx_mode )
   {
      GXt_char3 = A144TAM08_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam08_site_impl.this.GXt_char3 = GXv_char4[0] ;
      A144TAM08_UPD_USER_ID = GXt_char3 ;
      n144TAM08_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A144TAM08_UPD_USER_ID", A144TAM08_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A144TAM08_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTAM08_SITE_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tam08_site_id( String GX_Parm1 ,
                                    java.util.Date GX_Parm2 ,
                                    String GX_Parm3 ,
                                    java.util.Date GX_Parm4 ,
                                    String GX_Parm5 ,
                                    long GX_Parm6 ,
                                    String GX_Parm7 ,
                                    String GX_Parm8 ,
                                    String GX_Parm9 ,
                                    String GX_Parm10 ,
                                    String GX_Parm11 ,
                                    String GX_Parm12 )
   {
      A132TAM08_SITE_ID = GX_Parm1 ;
      A140TAM08_CRT_DATETIME = GX_Parm2 ;
      n140TAM08_CRT_DATETIME = false ;
      A141TAM08_CRT_USER_ID = GX_Parm3 ;
      n141TAM08_CRT_USER_ID = false ;
      A143TAM08_UPD_DATETIME = GX_Parm4 ;
      n143TAM08_UPD_DATETIME = false ;
      A144TAM08_UPD_USER_ID = GX_Parm5 ;
      n144TAM08_UPD_USER_ID = false ;
      A146TAM08_UPD_CNT = GX_Parm6 ;
      n146TAM08_UPD_CNT = false ;
      A133TAM08_SITE_NM = GX_Parm7 ;
      n133TAM08_SITE_NM = false ;
      A134TAM08_SITE_SNM = GX_Parm8 ;
      n134TAM08_SITE_SNM = false ;
      A594TAM08_OUTER_SITE_ID = GX_Parm9 ;
      n594TAM08_OUTER_SITE_ID = false ;
      A139TAM08_DEL_FLG = GX_Parm10 ;
      n139TAM08_DEL_FLG = false ;
      A142TAM08_CRT_PROG_NM = GX_Parm11 ;
      n142TAM08_CRT_PROG_NM = false ;
      A145TAM08_UPD_PROG_NM = GX_Parm12 ;
      n145TAM08_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A140TAM08_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A141TAM08_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A143TAM08_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A144TAM08_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A146TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A133TAM08_SITE_NM));
      isValidOutput.add(GXutil.rtrim( A134TAM08_SITE_SNM));
      isValidOutput.add(GXutil.rtrim( A594TAM08_OUTER_SITE_ID));
      isValidOutput.add(GXutil.rtrim( A139TAM08_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A142TAM08_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A145TAM08_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z132TAM08_SITE_ID));
      isValidOutput.add(localUtil.ttoc( Z140TAM08_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z141TAM08_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z143TAM08_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z144TAM08_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z146TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z133TAM08_SITE_NM));
      isValidOutput.add(GXutil.rtrim( Z134TAM08_SITE_SNM));
      isValidOutput.add(GXutil.rtrim( Z594TAM08_OUTER_SITE_ID));
      isValidOutput.add(GXutil.rtrim( Z139TAM08_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z142TAM08_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z145TAM08_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O146TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      lblTextblocktam08_site_id_Jsonclick = "" ;
      A132TAM08_SITE_ID = "" ;
      lblTextblocktam08_site_nm_Jsonclick = "" ;
      A133TAM08_SITE_NM = "" ;
      lblTextblocktam08_site_snm_Jsonclick = "" ;
      A134TAM08_SITE_SNM = "" ;
      lblTextblocktam08_outer_site_id_Jsonclick = "" ;
      A594TAM08_OUTER_SITE_ID = "" ;
      lblTextblocktam08_del_flg_Jsonclick = "" ;
      A139TAM08_DEL_FLG = "" ;
      lblTextblocktam08_crt_datetime_Jsonclick = "" ;
      A140TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam08_crt_user_id_Jsonclick = "" ;
      A141TAM08_CRT_USER_ID = "" ;
      lblTextblocktam08_crt_prog_nm_Jsonclick = "" ;
      A142TAM08_CRT_PROG_NM = "" ;
      lblTextblocktam08_upd_datetime_Jsonclick = "" ;
      A143TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam08_upd_user_id_Jsonclick = "" ;
      A144TAM08_UPD_USER_ID = "" ;
      lblTextblocktam08_upd_prog_nm_Jsonclick = "" ;
      A145TAM08_UPD_PROG_NM = "" ;
      lblTextblocktam08_upd_cnt_Jsonclick = "" ;
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
      Z132TAM08_SITE_ID = "" ;
      Z140TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z141TAM08_CRT_USER_ID = "" ;
      Z143TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z144TAM08_UPD_USER_ID = "" ;
      Z133TAM08_SITE_NM = "" ;
      Z134TAM08_SITE_SNM = "" ;
      Z594TAM08_OUTER_SITE_ID = "" ;
      Z139TAM08_DEL_FLG = "" ;
      Z142TAM08_CRT_PROG_NM = "" ;
      Z145TAM08_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000D4_A132TAM08_SITE_ID = new String[] {""} ;
      T000D4_A140TAM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D4_n140TAM08_CRT_DATETIME = new boolean[] {false} ;
      T000D4_A141TAM08_CRT_USER_ID = new String[] {""} ;
      T000D4_n141TAM08_CRT_USER_ID = new boolean[] {false} ;
      T000D4_A143TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D4_n143TAM08_UPD_DATETIME = new boolean[] {false} ;
      T000D4_A144TAM08_UPD_USER_ID = new String[] {""} ;
      T000D4_n144TAM08_UPD_USER_ID = new boolean[] {false} ;
      T000D4_A146TAM08_UPD_CNT = new long[1] ;
      T000D4_n146TAM08_UPD_CNT = new boolean[] {false} ;
      T000D4_A133TAM08_SITE_NM = new String[] {""} ;
      T000D4_n133TAM08_SITE_NM = new boolean[] {false} ;
      T000D4_A134TAM08_SITE_SNM = new String[] {""} ;
      T000D4_n134TAM08_SITE_SNM = new boolean[] {false} ;
      T000D4_A594TAM08_OUTER_SITE_ID = new String[] {""} ;
      T000D4_n594TAM08_OUTER_SITE_ID = new boolean[] {false} ;
      T000D4_A139TAM08_DEL_FLG = new String[] {""} ;
      T000D4_n139TAM08_DEL_FLG = new boolean[] {false} ;
      T000D4_A142TAM08_CRT_PROG_NM = new String[] {""} ;
      T000D4_n142TAM08_CRT_PROG_NM = new boolean[] {false} ;
      T000D4_A145TAM08_UPD_PROG_NM = new String[] {""} ;
      T000D4_n145TAM08_UPD_PROG_NM = new boolean[] {false} ;
      T000D5_A132TAM08_SITE_ID = new String[] {""} ;
      T000D3_A132TAM08_SITE_ID = new String[] {""} ;
      T000D3_A140TAM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D3_n140TAM08_CRT_DATETIME = new boolean[] {false} ;
      T000D3_A141TAM08_CRT_USER_ID = new String[] {""} ;
      T000D3_n141TAM08_CRT_USER_ID = new boolean[] {false} ;
      T000D3_A143TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D3_n143TAM08_UPD_DATETIME = new boolean[] {false} ;
      T000D3_A144TAM08_UPD_USER_ID = new String[] {""} ;
      T000D3_n144TAM08_UPD_USER_ID = new boolean[] {false} ;
      T000D3_A146TAM08_UPD_CNT = new long[1] ;
      T000D3_n146TAM08_UPD_CNT = new boolean[] {false} ;
      T000D3_A133TAM08_SITE_NM = new String[] {""} ;
      T000D3_n133TAM08_SITE_NM = new boolean[] {false} ;
      T000D3_A134TAM08_SITE_SNM = new String[] {""} ;
      T000D3_n134TAM08_SITE_SNM = new boolean[] {false} ;
      T000D3_A594TAM08_OUTER_SITE_ID = new String[] {""} ;
      T000D3_n594TAM08_OUTER_SITE_ID = new boolean[] {false} ;
      T000D3_A139TAM08_DEL_FLG = new String[] {""} ;
      T000D3_n139TAM08_DEL_FLG = new boolean[] {false} ;
      T000D3_A142TAM08_CRT_PROG_NM = new String[] {""} ;
      T000D3_n142TAM08_CRT_PROG_NM = new boolean[] {false} ;
      T000D3_A145TAM08_UPD_PROG_NM = new String[] {""} ;
      T000D3_n145TAM08_UPD_PROG_NM = new boolean[] {false} ;
      sMode12 = "" ;
      T000D6_A132TAM08_SITE_ID = new String[] {""} ;
      T000D7_A132TAM08_SITE_ID = new String[] {""} ;
      T000D2_A132TAM08_SITE_ID = new String[] {""} ;
      T000D2_A140TAM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D2_n140TAM08_CRT_DATETIME = new boolean[] {false} ;
      T000D2_A141TAM08_CRT_USER_ID = new String[] {""} ;
      T000D2_n141TAM08_CRT_USER_ID = new boolean[] {false} ;
      T000D2_A143TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D2_n143TAM08_UPD_DATETIME = new boolean[] {false} ;
      T000D2_A144TAM08_UPD_USER_ID = new String[] {""} ;
      T000D2_n144TAM08_UPD_USER_ID = new boolean[] {false} ;
      T000D2_A146TAM08_UPD_CNT = new long[1] ;
      T000D2_n146TAM08_UPD_CNT = new boolean[] {false} ;
      T000D2_A133TAM08_SITE_NM = new String[] {""} ;
      T000D2_n133TAM08_SITE_NM = new boolean[] {false} ;
      T000D2_A134TAM08_SITE_SNM = new String[] {""} ;
      T000D2_n134TAM08_SITE_SNM = new boolean[] {false} ;
      T000D2_A594TAM08_OUTER_SITE_ID = new String[] {""} ;
      T000D2_n594TAM08_OUTER_SITE_ID = new boolean[] {false} ;
      T000D2_A139TAM08_DEL_FLG = new String[] {""} ;
      T000D2_n139TAM08_DEL_FLG = new boolean[] {false} ;
      T000D2_A142TAM08_CRT_PROG_NM = new String[] {""} ;
      T000D2_n142TAM08_CRT_PROG_NM = new boolean[] {false} ;
      T000D2_A145TAM08_UPD_PROG_NM = new String[] {""} ;
      T000D2_n145TAM08_UPD_PROG_NM = new boolean[] {false} ;
      T000D11_A625TBW03_SESSION_ID = new String[] {""} ;
      T000D11_A626TBW03_APP_ID = new String[] {""} ;
      T000D11_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T000D11_A628TBW03_STUDY_ID = new long[1] ;
      T000D11_A629TBW03_SUBJECT_ID = new int[1] ;
      T000D11_A630TBW03_CRF_ID = new short[1] ;
      T000D12_A197TBM22_STUDY_ID = new long[1] ;
      T000D12_A198TBM22_SITE_ID = new String[] {""} ;
      T000D13_A132TAM08_SITE_ID = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam08_site__default(),
         new Object[] {
             new Object[] {
            T000D2_A132TAM08_SITE_ID, T000D2_A140TAM08_CRT_DATETIME, T000D2_n140TAM08_CRT_DATETIME, T000D2_A141TAM08_CRT_USER_ID, T000D2_n141TAM08_CRT_USER_ID, T000D2_A143TAM08_UPD_DATETIME, T000D2_n143TAM08_UPD_DATETIME, T000D2_A144TAM08_UPD_USER_ID, T000D2_n144TAM08_UPD_USER_ID, T000D2_A146TAM08_UPD_CNT,
            T000D2_n146TAM08_UPD_CNT, T000D2_A133TAM08_SITE_NM, T000D2_n133TAM08_SITE_NM, T000D2_A134TAM08_SITE_SNM, T000D2_n134TAM08_SITE_SNM, T000D2_A594TAM08_OUTER_SITE_ID, T000D2_n594TAM08_OUTER_SITE_ID, T000D2_A139TAM08_DEL_FLG, T000D2_n139TAM08_DEL_FLG, T000D2_A142TAM08_CRT_PROG_NM,
            T000D2_n142TAM08_CRT_PROG_NM, T000D2_A145TAM08_UPD_PROG_NM, T000D2_n145TAM08_UPD_PROG_NM
            }
            , new Object[] {
            T000D3_A132TAM08_SITE_ID, T000D3_A140TAM08_CRT_DATETIME, T000D3_n140TAM08_CRT_DATETIME, T000D3_A141TAM08_CRT_USER_ID, T000D3_n141TAM08_CRT_USER_ID, T000D3_A143TAM08_UPD_DATETIME, T000D3_n143TAM08_UPD_DATETIME, T000D3_A144TAM08_UPD_USER_ID, T000D3_n144TAM08_UPD_USER_ID, T000D3_A146TAM08_UPD_CNT,
            T000D3_n146TAM08_UPD_CNT, T000D3_A133TAM08_SITE_NM, T000D3_n133TAM08_SITE_NM, T000D3_A134TAM08_SITE_SNM, T000D3_n134TAM08_SITE_SNM, T000D3_A594TAM08_OUTER_SITE_ID, T000D3_n594TAM08_OUTER_SITE_ID, T000D3_A139TAM08_DEL_FLG, T000D3_n139TAM08_DEL_FLG, T000D3_A142TAM08_CRT_PROG_NM,
            T000D3_n142TAM08_CRT_PROG_NM, T000D3_A145TAM08_UPD_PROG_NM, T000D3_n145TAM08_UPD_PROG_NM
            }
            , new Object[] {
            T000D4_A132TAM08_SITE_ID, T000D4_A140TAM08_CRT_DATETIME, T000D4_n140TAM08_CRT_DATETIME, T000D4_A141TAM08_CRT_USER_ID, T000D4_n141TAM08_CRT_USER_ID, T000D4_A143TAM08_UPD_DATETIME, T000D4_n143TAM08_UPD_DATETIME, T000D4_A144TAM08_UPD_USER_ID, T000D4_n144TAM08_UPD_USER_ID, T000D4_A146TAM08_UPD_CNT,
            T000D4_n146TAM08_UPD_CNT, T000D4_A133TAM08_SITE_NM, T000D4_n133TAM08_SITE_NM, T000D4_A134TAM08_SITE_SNM, T000D4_n134TAM08_SITE_SNM, T000D4_A594TAM08_OUTER_SITE_ID, T000D4_n594TAM08_OUTER_SITE_ID, T000D4_A139TAM08_DEL_FLG, T000D4_n139TAM08_DEL_FLG, T000D4_A142TAM08_CRT_PROG_NM,
            T000D4_n142TAM08_CRT_PROG_NM, T000D4_A145TAM08_UPD_PROG_NM, T000D4_n145TAM08_UPD_PROG_NM
            }
            , new Object[] {
            T000D5_A132TAM08_SITE_ID
            }
            , new Object[] {
            T000D6_A132TAM08_SITE_ID
            }
            , new Object[] {
            T000D7_A132TAM08_SITE_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000D11_A625TBW03_SESSION_ID, T000D11_A626TBW03_APP_ID, T000D11_A627TBW03_DISP_DATETIME, T000D11_A628TBW03_STUDY_ID, T000D11_A629TBW03_SUBJECT_ID, T000D11_A630TBW03_CRF_ID
            }
            , new Object[] {
            T000D12_A197TBM22_STUDY_ID, T000D12_A198TBM22_SITE_ID
            }
            , new Object[] {
            T000D13_A132TAM08_SITE_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TAM08_SITE" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound12 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTAM08_SITE_ID_Enabled ;
   private int edtTAM08_SITE_NM_Enabled ;
   private int edtTAM08_SITE_SNM_Enabled ;
   private int edtTAM08_OUTER_SITE_ID_Enabled ;
   private int edtTAM08_DEL_FLG_Enabled ;
   private int edtTAM08_CRT_DATETIME_Enabled ;
   private int edtTAM08_CRT_USER_ID_Enabled ;
   private int edtTAM08_CRT_PROG_NM_Enabled ;
   private int edtTAM08_UPD_DATETIME_Enabled ;
   private int edtTAM08_UPD_USER_ID_Enabled ;
   private int edtTAM08_UPD_PROG_NM_Enabled ;
   private int edtTAM08_UPD_CNT_Enabled ;
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
   private long A146TAM08_UPD_CNT ;
   private long Z146TAM08_UPD_CNT ;
   private long O146TAM08_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTAM08_SITE_ID_Internalname ;
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
   private String lblTextblocktam08_site_id_Internalname ;
   private String lblTextblocktam08_site_id_Jsonclick ;
   private String edtTAM08_SITE_ID_Jsonclick ;
   private String lblTextblocktam08_site_nm_Internalname ;
   private String lblTextblocktam08_site_nm_Jsonclick ;
   private String edtTAM08_SITE_NM_Internalname ;
   private String edtTAM08_SITE_NM_Jsonclick ;
   private String lblTextblocktam08_site_snm_Internalname ;
   private String lblTextblocktam08_site_snm_Jsonclick ;
   private String edtTAM08_SITE_SNM_Internalname ;
   private String edtTAM08_SITE_SNM_Jsonclick ;
   private String lblTextblocktam08_outer_site_id_Internalname ;
   private String lblTextblocktam08_outer_site_id_Jsonclick ;
   private String edtTAM08_OUTER_SITE_ID_Internalname ;
   private String edtTAM08_OUTER_SITE_ID_Jsonclick ;
   private String lblTextblocktam08_del_flg_Internalname ;
   private String lblTextblocktam08_del_flg_Jsonclick ;
   private String edtTAM08_DEL_FLG_Internalname ;
   private String edtTAM08_DEL_FLG_Jsonclick ;
   private String lblTextblocktam08_crt_datetime_Internalname ;
   private String lblTextblocktam08_crt_datetime_Jsonclick ;
   private String edtTAM08_CRT_DATETIME_Internalname ;
   private String edtTAM08_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktam08_crt_user_id_Internalname ;
   private String lblTextblocktam08_crt_user_id_Jsonclick ;
   private String edtTAM08_CRT_USER_ID_Internalname ;
   private String edtTAM08_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktam08_crt_prog_nm_Internalname ;
   private String lblTextblocktam08_crt_prog_nm_Jsonclick ;
   private String edtTAM08_CRT_PROG_NM_Internalname ;
   private String edtTAM08_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktam08_upd_datetime_Internalname ;
   private String lblTextblocktam08_upd_datetime_Jsonclick ;
   private String edtTAM08_UPD_DATETIME_Internalname ;
   private String edtTAM08_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktam08_upd_user_id_Internalname ;
   private String lblTextblocktam08_upd_user_id_Jsonclick ;
   private String edtTAM08_UPD_USER_ID_Internalname ;
   private String edtTAM08_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktam08_upd_prog_nm_Internalname ;
   private String lblTextblocktam08_upd_prog_nm_Jsonclick ;
   private String edtTAM08_UPD_PROG_NM_Internalname ;
   private String edtTAM08_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktam08_upd_cnt_Internalname ;
   private String lblTextblocktam08_upd_cnt_Jsonclick ;
   private String edtTAM08_UPD_CNT_Internalname ;
   private String edtTAM08_UPD_CNT_Jsonclick ;
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
   private String sMode12 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A140TAM08_CRT_DATETIME ;
   private java.util.Date A143TAM08_UPD_DATETIME ;
   private java.util.Date Z140TAM08_CRT_DATETIME ;
   private java.util.Date Z143TAM08_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n133TAM08_SITE_NM ;
   private boolean n134TAM08_SITE_SNM ;
   private boolean n594TAM08_OUTER_SITE_ID ;
   private boolean n139TAM08_DEL_FLG ;
   private boolean n140TAM08_CRT_DATETIME ;
   private boolean n141TAM08_CRT_USER_ID ;
   private boolean n142TAM08_CRT_PROG_NM ;
   private boolean n143TAM08_UPD_DATETIME ;
   private boolean n144TAM08_UPD_USER_ID ;
   private boolean n145TAM08_UPD_PROG_NM ;
   private boolean n146TAM08_UPD_CNT ;
   private boolean Gx_longc ;
   private String A132TAM08_SITE_ID ;
   private String A133TAM08_SITE_NM ;
   private String A134TAM08_SITE_SNM ;
   private String A594TAM08_OUTER_SITE_ID ;
   private String A139TAM08_DEL_FLG ;
   private String A141TAM08_CRT_USER_ID ;
   private String A142TAM08_CRT_PROG_NM ;
   private String A144TAM08_UPD_USER_ID ;
   private String A145TAM08_UPD_PROG_NM ;
   private String Z132TAM08_SITE_ID ;
   private String Z141TAM08_CRT_USER_ID ;
   private String Z144TAM08_UPD_USER_ID ;
   private String Z133TAM08_SITE_NM ;
   private String Z134TAM08_SITE_SNM ;
   private String Z594TAM08_OUTER_SITE_ID ;
   private String Z139TAM08_DEL_FLG ;
   private String Z142TAM08_CRT_PROG_NM ;
   private String Z145TAM08_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000D4_A132TAM08_SITE_ID ;
   private java.util.Date[] T000D4_A140TAM08_CRT_DATETIME ;
   private boolean[] T000D4_n140TAM08_CRT_DATETIME ;
   private String[] T000D4_A141TAM08_CRT_USER_ID ;
   private boolean[] T000D4_n141TAM08_CRT_USER_ID ;
   private java.util.Date[] T000D4_A143TAM08_UPD_DATETIME ;
   private boolean[] T000D4_n143TAM08_UPD_DATETIME ;
   private String[] T000D4_A144TAM08_UPD_USER_ID ;
   private boolean[] T000D4_n144TAM08_UPD_USER_ID ;
   private long[] T000D4_A146TAM08_UPD_CNT ;
   private boolean[] T000D4_n146TAM08_UPD_CNT ;
   private String[] T000D4_A133TAM08_SITE_NM ;
   private boolean[] T000D4_n133TAM08_SITE_NM ;
   private String[] T000D4_A134TAM08_SITE_SNM ;
   private boolean[] T000D4_n134TAM08_SITE_SNM ;
   private String[] T000D4_A594TAM08_OUTER_SITE_ID ;
   private boolean[] T000D4_n594TAM08_OUTER_SITE_ID ;
   private String[] T000D4_A139TAM08_DEL_FLG ;
   private boolean[] T000D4_n139TAM08_DEL_FLG ;
   private String[] T000D4_A142TAM08_CRT_PROG_NM ;
   private boolean[] T000D4_n142TAM08_CRT_PROG_NM ;
   private String[] T000D4_A145TAM08_UPD_PROG_NM ;
   private boolean[] T000D4_n145TAM08_UPD_PROG_NM ;
   private String[] T000D5_A132TAM08_SITE_ID ;
   private String[] T000D3_A132TAM08_SITE_ID ;
   private java.util.Date[] T000D3_A140TAM08_CRT_DATETIME ;
   private boolean[] T000D3_n140TAM08_CRT_DATETIME ;
   private String[] T000D3_A141TAM08_CRT_USER_ID ;
   private boolean[] T000D3_n141TAM08_CRT_USER_ID ;
   private java.util.Date[] T000D3_A143TAM08_UPD_DATETIME ;
   private boolean[] T000D3_n143TAM08_UPD_DATETIME ;
   private String[] T000D3_A144TAM08_UPD_USER_ID ;
   private boolean[] T000D3_n144TAM08_UPD_USER_ID ;
   private long[] T000D3_A146TAM08_UPD_CNT ;
   private boolean[] T000D3_n146TAM08_UPD_CNT ;
   private String[] T000D3_A133TAM08_SITE_NM ;
   private boolean[] T000D3_n133TAM08_SITE_NM ;
   private String[] T000D3_A134TAM08_SITE_SNM ;
   private boolean[] T000D3_n134TAM08_SITE_SNM ;
   private String[] T000D3_A594TAM08_OUTER_SITE_ID ;
   private boolean[] T000D3_n594TAM08_OUTER_SITE_ID ;
   private String[] T000D3_A139TAM08_DEL_FLG ;
   private boolean[] T000D3_n139TAM08_DEL_FLG ;
   private String[] T000D3_A142TAM08_CRT_PROG_NM ;
   private boolean[] T000D3_n142TAM08_CRT_PROG_NM ;
   private String[] T000D3_A145TAM08_UPD_PROG_NM ;
   private boolean[] T000D3_n145TAM08_UPD_PROG_NM ;
   private String[] T000D6_A132TAM08_SITE_ID ;
   private String[] T000D7_A132TAM08_SITE_ID ;
   private String[] T000D2_A132TAM08_SITE_ID ;
   private java.util.Date[] T000D2_A140TAM08_CRT_DATETIME ;
   private boolean[] T000D2_n140TAM08_CRT_DATETIME ;
   private String[] T000D2_A141TAM08_CRT_USER_ID ;
   private boolean[] T000D2_n141TAM08_CRT_USER_ID ;
   private java.util.Date[] T000D2_A143TAM08_UPD_DATETIME ;
   private boolean[] T000D2_n143TAM08_UPD_DATETIME ;
   private String[] T000D2_A144TAM08_UPD_USER_ID ;
   private boolean[] T000D2_n144TAM08_UPD_USER_ID ;
   private long[] T000D2_A146TAM08_UPD_CNT ;
   private boolean[] T000D2_n146TAM08_UPD_CNT ;
   private String[] T000D2_A133TAM08_SITE_NM ;
   private boolean[] T000D2_n133TAM08_SITE_NM ;
   private String[] T000D2_A134TAM08_SITE_SNM ;
   private boolean[] T000D2_n134TAM08_SITE_SNM ;
   private String[] T000D2_A594TAM08_OUTER_SITE_ID ;
   private boolean[] T000D2_n594TAM08_OUTER_SITE_ID ;
   private String[] T000D2_A139TAM08_DEL_FLG ;
   private boolean[] T000D2_n139TAM08_DEL_FLG ;
   private String[] T000D2_A142TAM08_CRT_PROG_NM ;
   private boolean[] T000D2_n142TAM08_CRT_PROG_NM ;
   private String[] T000D2_A145TAM08_UPD_PROG_NM ;
   private boolean[] T000D2_n145TAM08_UPD_PROG_NM ;
   private String[] T000D11_A625TBW03_SESSION_ID ;
   private String[] T000D11_A626TBW03_APP_ID ;
   private String[] T000D11_A627TBW03_DISP_DATETIME ;
   private long[] T000D11_A628TBW03_STUDY_ID ;
   private int[] T000D11_A629TBW03_SUBJECT_ID ;
   private short[] T000D11_A630TBW03_CRF_ID ;
   private long[] T000D12_A197TBM22_STUDY_ID ;
   private String[] T000D12_A198TBM22_SITE_ID ;
   private String[] T000D13_A132TAM08_SITE_ID ;
}

final  class tam08_site__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000D2", "SELECT `TAM08_SITE_ID`, `TAM08_CRT_DATETIME`, `TAM08_CRT_USER_ID`, `TAM08_UPD_DATETIME`, `TAM08_UPD_USER_ID`, `TAM08_UPD_CNT`, `TAM08_SITE_NM`, `TAM08_SITE_SNM`, `TAM08_OUTER_SITE_ID`, `TAM08_DEL_FLG`, `TAM08_CRT_PROG_NM`, `TAM08_UPD_PROG_NM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D3", "SELECT `TAM08_SITE_ID`, `TAM08_CRT_DATETIME`, `TAM08_CRT_USER_ID`, `TAM08_UPD_DATETIME`, `TAM08_UPD_USER_ID`, `TAM08_UPD_CNT`, `TAM08_SITE_NM`, `TAM08_SITE_SNM`, `TAM08_OUTER_SITE_ID`, `TAM08_DEL_FLG`, `TAM08_CRT_PROG_NM`, `TAM08_UPD_PROG_NM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D4", "SELECT TM1.`TAM08_SITE_ID`, TM1.`TAM08_CRT_DATETIME`, TM1.`TAM08_CRT_USER_ID`, TM1.`TAM08_UPD_DATETIME`, TM1.`TAM08_UPD_USER_ID`, TM1.`TAM08_UPD_CNT`, TM1.`TAM08_SITE_NM`, TM1.`TAM08_SITE_SNM`, TM1.`TAM08_OUTER_SITE_ID`, TM1.`TAM08_DEL_FLG`, TM1.`TAM08_CRT_PROG_NM`, TM1.`TAM08_UPD_PROG_NM` FROM `TAM08_SITE` TM1 WHERE TM1.`TAM08_SITE_ID` = ? ORDER BY TM1.`TAM08_SITE_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000D5", "SELECT `TAM08_SITE_ID` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D6", "SELECT `TAM08_SITE_ID` FROM `TAM08_SITE` WHERE ( `TAM08_SITE_ID` > ?) ORDER BY `TAM08_SITE_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000D7", "SELECT `TAM08_SITE_ID` FROM `TAM08_SITE` WHERE ( `TAM08_SITE_ID` < ?) ORDER BY `TAM08_SITE_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000D8", "INSERT INTO `TAM08_SITE` (`TAM08_SITE_ID`, `TAM08_CRT_DATETIME`, `TAM08_CRT_USER_ID`, `TAM08_UPD_DATETIME`, `TAM08_UPD_USER_ID`, `TAM08_UPD_CNT`, `TAM08_SITE_NM`, `TAM08_SITE_SNM`, `TAM08_OUTER_SITE_ID`, `TAM08_DEL_FLG`, `TAM08_CRT_PROG_NM`, `TAM08_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000D9", "UPDATE `TAM08_SITE` SET `TAM08_CRT_DATETIME`=?, `TAM08_CRT_USER_ID`=?, `TAM08_UPD_DATETIME`=?, `TAM08_UPD_USER_ID`=?, `TAM08_UPD_CNT`=?, `TAM08_SITE_NM`=?, `TAM08_SITE_SNM`=?, `TAM08_OUTER_SITE_ID`=?, `TAM08_DEL_FLG`=?, `TAM08_CRT_PROG_NM`=?, `TAM08_UPD_PROG_NM`=?  WHERE `TAM08_SITE_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000D10", "DELETE FROM `TAM08_SITE`  WHERE `TAM08_SITE_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000D11", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_SITE_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000D12", "SELECT `TBM22_STUDY_ID`, `TBM22_SITE_ID` FROM `TBM22_STUDY_SITE` WHERE `TBM22_SITE_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000D13", "SELECT `TAM08_SITE_ID` FROM `TAM08_SITE` ORDER BY `TAM08_SITE_ID` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
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
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               break;
            case 2 :
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
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               break;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               break;
            case 11 :
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
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 6 :
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
                  stmt.setVarchar(8, (String)parms[14], 20);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 20);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 1);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 40);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 50);
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
                  stmt.setVarchar(8, (String)parms[15], 20);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 40);
               }
               stmt.setVarchar(12, (String)parms[22], 20, false);
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               break;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 20);
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 20);
               break;
      }
   }

}

