/*
               File: tam08_site_impl
        Description: 施設マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:2.54
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
      gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
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
      if ( ! httpContext.isSpaRequest( ) )
      {
         Form.getMeta().addItem("generator", "GeneXus Java 10_3_3-92797", (short)(0)) ;
         Form.getMeta().addItem("description", "施設マスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
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
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         validateSpaRequest();
         userMain( ) ;
         if ( ! isFullAjaxMode( ) )
         {
            draw( ) ;
         }
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
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
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "施設マスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TAM08_SITE.htm");
         wb_table3_28_0D12( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0D12e( boolean wbgen )
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

   public void wb_table3_28_0D12( boolean wbgen )
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
         wb_table4_34_0D12( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0D12e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 97,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM08_SITE.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM08_SITE.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0D12e( true) ;
      }
      else
      {
         wb_table3_28_0D12e( false) ;
      }
   }

   public void wb_table4_34_0D12( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable2_Internalname, tblTable2_Internalname, "", "Container", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_site_id_Internalname, "施設ID", "", "", lblTextblocktam08_site_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_SITE_ID_Internalname, GXutil.rtrim( A57TAM08_SITE_ID), GXutil.rtrim( localUtil.format( A57TAM08_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_SITE_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_SITE_ID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_SITE_ID", "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_site_nm_Internalname, "施設名", "", "", lblTextblocktam08_site_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_SITE_NM_Internalname, GXutil.rtrim( A319TAM08_SITE_NM), GXutil.rtrim( localUtil.format( A319TAM08_SITE_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_SITE_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_SITE_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_site_snm_Internalname, "施設名（略称）", "", "", lblTextblocktam08_site_snm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_SITE_SNM_Internalname, GXutil.rtrim( A320TAM08_SITE_SNM), GXutil.rtrim( localUtil.format( A320TAM08_SITE_SNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_SITE_SNM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_SITE_SNM_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_outer_site_id_Internalname, "外部施設ID", "", "", lblTextblocktam08_outer_site_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_OUTER_SITE_ID_Internalname, GXutil.rtrim( A684TAM08_OUTER_SITE_ID), GXutil.rtrim( localUtil.format( A684TAM08_OUTER_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_OUTER_SITE_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_OUTER_SITE_ID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam08_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_DEL_FLG_Internalname, GXutil.rtrim( A325TAM08_DEL_FLG), GXutil.rtrim( localUtil.format( A325TAM08_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam08_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAM08_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_CRT_DATETIME_Internalname, localUtil.format(A326TAM08_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A326TAM08_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM08_SITE.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM08_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAM08_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_crt_user_id_Internalname, "ID", "", "", lblTextblocktam08_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_CRT_USER_ID_Internalname, GXutil.rtrim( A327TAM08_CRT_USER_ID), GXutil.rtrim( localUtil.format( A327TAM08_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam08_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_CRT_PROG_NM_Internalname, GXutil.rtrim( A328TAM08_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A328TAM08_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam08_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAM08_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_UPD_DATETIME_Internalname, localUtil.format(A329TAM08_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A329TAM08_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM08_SITE.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM08_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAM08_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_upd_user_id_Internalname, "ID", "", "", lblTextblocktam08_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_UPD_USER_ID_Internalname, GXutil.rtrim( A330TAM08_UPD_USER_ID), GXutil.rtrim( localUtil.format( A330TAM08_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam08_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_UPD_PROG_NM_Internalname, GXutil.rtrim( A331TAM08_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A331TAM08_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam08_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktam08_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM08_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A332TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTAM08_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A332TAM08_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A332TAM08_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM08_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM08_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TAM08_SITE.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0D12e( true) ;
      }
      else
      {
         wb_table4_34_0D12e( false) ;
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
         /* Div Control */
         GxWebStd.gx_div_start( httpContext, divSectiontoolbar_Internalname, 1, 0, "px", 0, "px", "ToolbarMain", "");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM08_SITE.htm");
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

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
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
            A57TAM08_SITE_ID = httpContext.cgiGet( edtTAM08_SITE_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
            A319TAM08_SITE_NM = httpContext.cgiGet( edtTAM08_SITE_NM_Internalname) ;
            n319TAM08_SITE_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A319TAM08_SITE_NM", A319TAM08_SITE_NM);
            n319TAM08_SITE_NM = ((GXutil.strcmp("", A319TAM08_SITE_NM)==0) ? true : false) ;
            A320TAM08_SITE_SNM = httpContext.cgiGet( edtTAM08_SITE_SNM_Internalname) ;
            n320TAM08_SITE_SNM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A320TAM08_SITE_SNM", A320TAM08_SITE_SNM);
            n320TAM08_SITE_SNM = ((GXutil.strcmp("", A320TAM08_SITE_SNM)==0) ? true : false) ;
            A684TAM08_OUTER_SITE_ID = httpContext.cgiGet( edtTAM08_OUTER_SITE_ID_Internalname) ;
            n684TAM08_OUTER_SITE_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A684TAM08_OUTER_SITE_ID", A684TAM08_OUTER_SITE_ID);
            n684TAM08_OUTER_SITE_ID = ((GXutil.strcmp("", A684TAM08_OUTER_SITE_ID)==0) ? true : false) ;
            A325TAM08_DEL_FLG = httpContext.cgiGet( edtTAM08_DEL_FLG_Internalname) ;
            n325TAM08_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A325TAM08_DEL_FLG", A325TAM08_DEL_FLG);
            n325TAM08_DEL_FLG = ((GXutil.strcmp("", A325TAM08_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM08_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TAM08_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM08_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A326TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n326TAM08_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326TAM08_CRT_DATETIME", localUtil.ttoc( A326TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A326TAM08_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM08_CRT_DATETIME_Internalname)) ;
               n326TAM08_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A326TAM08_CRT_DATETIME", localUtil.ttoc( A326TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n326TAM08_CRT_DATETIME = (GXutil.nullDate().equals(A326TAM08_CRT_DATETIME) ? true : false) ;
            A327TAM08_CRT_USER_ID = httpContext.cgiGet( edtTAM08_CRT_USER_ID_Internalname) ;
            n327TAM08_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A327TAM08_CRT_USER_ID", A327TAM08_CRT_USER_ID);
            n327TAM08_CRT_USER_ID = ((GXutil.strcmp("", A327TAM08_CRT_USER_ID)==0) ? true : false) ;
            A328TAM08_CRT_PROG_NM = httpContext.cgiGet( edtTAM08_CRT_PROG_NM_Internalname) ;
            n328TAM08_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A328TAM08_CRT_PROG_NM", A328TAM08_CRT_PROG_NM);
            n328TAM08_CRT_PROG_NM = ((GXutil.strcmp("", A328TAM08_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM08_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TAM08_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM08_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A329TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n329TAM08_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A329TAM08_UPD_DATETIME", localUtil.ttoc( A329TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A329TAM08_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM08_UPD_DATETIME_Internalname)) ;
               n329TAM08_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A329TAM08_UPD_DATETIME", localUtil.ttoc( A329TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n329TAM08_UPD_DATETIME = (GXutil.nullDate().equals(A329TAM08_UPD_DATETIME) ? true : false) ;
            A330TAM08_UPD_USER_ID = httpContext.cgiGet( edtTAM08_UPD_USER_ID_Internalname) ;
            n330TAM08_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A330TAM08_UPD_USER_ID", A330TAM08_UPD_USER_ID);
            n330TAM08_UPD_USER_ID = ((GXutil.strcmp("", A330TAM08_UPD_USER_ID)==0) ? true : false) ;
            A331TAM08_UPD_PROG_NM = httpContext.cgiGet( edtTAM08_UPD_PROG_NM_Internalname) ;
            n331TAM08_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A331TAM08_UPD_PROG_NM", A331TAM08_UPD_PROG_NM);
            n331TAM08_UPD_PROG_NM = ((GXutil.strcmp("", A331TAM08_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAM08_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAM08_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAM08_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM08_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A332TAM08_UPD_CNT = 0 ;
               n332TAM08_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A332TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A332TAM08_UPD_CNT, 10, 0)));
            }
            else
            {
               A332TAM08_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTAM08_UPD_CNT_Internalname), ".", ",") ;
               n332TAM08_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A332TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A332TAM08_UPD_CNT, 10, 0)));
            }
            n332TAM08_UPD_CNT = ((0==A332TAM08_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z57TAM08_SITE_ID = httpContext.cgiGet( "Z57TAM08_SITE_ID") ;
            Z326TAM08_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z326TAM08_CRT_DATETIME"), 0) ;
            n326TAM08_CRT_DATETIME = (GXutil.nullDate().equals(A326TAM08_CRT_DATETIME) ? true : false) ;
            Z327TAM08_CRT_USER_ID = httpContext.cgiGet( "Z327TAM08_CRT_USER_ID") ;
            n327TAM08_CRT_USER_ID = ((GXutil.strcmp("", A327TAM08_CRT_USER_ID)==0) ? true : false) ;
            Z329TAM08_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z329TAM08_UPD_DATETIME"), 0) ;
            n329TAM08_UPD_DATETIME = (GXutil.nullDate().equals(A329TAM08_UPD_DATETIME) ? true : false) ;
            Z330TAM08_UPD_USER_ID = httpContext.cgiGet( "Z330TAM08_UPD_USER_ID") ;
            n330TAM08_UPD_USER_ID = ((GXutil.strcmp("", A330TAM08_UPD_USER_ID)==0) ? true : false) ;
            Z332TAM08_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z332TAM08_UPD_CNT"), ".", ",") ;
            n332TAM08_UPD_CNT = ((0==A332TAM08_UPD_CNT) ? true : false) ;
            Z319TAM08_SITE_NM = httpContext.cgiGet( "Z319TAM08_SITE_NM") ;
            n319TAM08_SITE_NM = ((GXutil.strcmp("", A319TAM08_SITE_NM)==0) ? true : false) ;
            Z320TAM08_SITE_SNM = httpContext.cgiGet( "Z320TAM08_SITE_SNM") ;
            n320TAM08_SITE_SNM = ((GXutil.strcmp("", A320TAM08_SITE_SNM)==0) ? true : false) ;
            Z684TAM08_OUTER_SITE_ID = httpContext.cgiGet( "Z684TAM08_OUTER_SITE_ID") ;
            n684TAM08_OUTER_SITE_ID = ((GXutil.strcmp("", A684TAM08_OUTER_SITE_ID)==0) ? true : false) ;
            Z325TAM08_DEL_FLG = httpContext.cgiGet( "Z325TAM08_DEL_FLG") ;
            n325TAM08_DEL_FLG = ((GXutil.strcmp("", A325TAM08_DEL_FLG)==0) ? true : false) ;
            Z328TAM08_CRT_PROG_NM = httpContext.cgiGet( "Z328TAM08_CRT_PROG_NM") ;
            n328TAM08_CRT_PROG_NM = ((GXutil.strcmp("", A328TAM08_CRT_PROG_NM)==0) ? true : false) ;
            Z331TAM08_UPD_PROG_NM = httpContext.cgiGet( "Z331TAM08_UPD_PROG_NM") ;
            n331TAM08_UPD_PROG_NM = ((GXutil.strcmp("", A331TAM08_UPD_PROG_NM)==0) ? true : false) ;
            O332TAM08_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O332TAM08_UPD_CNT"), ".", ",") ;
            n332TAM08_UPD_CNT = ((0==A332TAM08_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV9Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = context.getSiteKey( ) ;
            standaloneNotModal( ) ;
         }
         else
         {
            standaloneNotModal( ) ;
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
            {
               Gx_mode = "DSP" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               A57TAM08_SITE_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
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
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e120D2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "施設ID:" + A57TAM08_SITE_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A319TAM08_SITE_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A320TAM08_SITE_SNM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A684TAM08_OUTER_SITE_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A325TAM08_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A326TAM08_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam08_site_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A326TAM08_CRT_DATETIME", localUtil.ttoc( A326TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A327TAM08_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A328TAM08_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A329TAM08_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam08_site_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A329TAM08_UPD_DATETIME", localUtil.ttoc( A329TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A330TAM08_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A331TAM08_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A332TAM08_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm0D12( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z326TAM08_CRT_DATETIME = T000D3_A326TAM08_CRT_DATETIME[0] ;
            Z327TAM08_CRT_USER_ID = T000D3_A327TAM08_CRT_USER_ID[0] ;
            Z329TAM08_UPD_DATETIME = T000D3_A329TAM08_UPD_DATETIME[0] ;
            Z330TAM08_UPD_USER_ID = T000D3_A330TAM08_UPD_USER_ID[0] ;
            Z332TAM08_UPD_CNT = T000D3_A332TAM08_UPD_CNT[0] ;
            Z319TAM08_SITE_NM = T000D3_A319TAM08_SITE_NM[0] ;
            Z320TAM08_SITE_SNM = T000D3_A320TAM08_SITE_SNM[0] ;
            Z684TAM08_OUTER_SITE_ID = T000D3_A684TAM08_OUTER_SITE_ID[0] ;
            Z325TAM08_DEL_FLG = T000D3_A325TAM08_DEL_FLG[0] ;
            Z328TAM08_CRT_PROG_NM = T000D3_A328TAM08_CRT_PROG_NM[0] ;
            Z331TAM08_UPD_PROG_NM = T000D3_A331TAM08_UPD_PROG_NM[0] ;
         }
         else
         {
            Z326TAM08_CRT_DATETIME = A326TAM08_CRT_DATETIME ;
            Z327TAM08_CRT_USER_ID = A327TAM08_CRT_USER_ID ;
            Z329TAM08_UPD_DATETIME = A329TAM08_UPD_DATETIME ;
            Z330TAM08_UPD_USER_ID = A330TAM08_UPD_USER_ID ;
            Z332TAM08_UPD_CNT = A332TAM08_UPD_CNT ;
            Z319TAM08_SITE_NM = A319TAM08_SITE_NM ;
            Z320TAM08_SITE_SNM = A320TAM08_SITE_SNM ;
            Z684TAM08_OUTER_SITE_ID = A684TAM08_OUTER_SITE_ID ;
            Z325TAM08_DEL_FLG = A325TAM08_DEL_FLG ;
            Z328TAM08_CRT_PROG_NM = A328TAM08_CRT_PROG_NM ;
            Z331TAM08_UPD_PROG_NM = A331TAM08_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z57TAM08_SITE_ID = A57TAM08_SITE_ID ;
         Z326TAM08_CRT_DATETIME = A326TAM08_CRT_DATETIME ;
         Z327TAM08_CRT_USER_ID = A327TAM08_CRT_USER_ID ;
         Z329TAM08_UPD_DATETIME = A329TAM08_UPD_DATETIME ;
         Z330TAM08_UPD_USER_ID = A330TAM08_UPD_USER_ID ;
         Z332TAM08_UPD_CNT = A332TAM08_UPD_CNT ;
         Z319TAM08_SITE_NM = A319TAM08_SITE_NM ;
         Z320TAM08_SITE_SNM = A320TAM08_SITE_SNM ;
         Z684TAM08_OUTER_SITE_ID = A684TAM08_OUTER_SITE_ID ;
         Z325TAM08_DEL_FLG = A325TAM08_DEL_FLG ;
         Z328TAM08_CRT_PROG_NM = A328TAM08_CRT_PROG_NM ;
         Z331TAM08_UPD_PROG_NM = A331TAM08_UPD_PROG_NM ;
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
      pr_default.execute(2, new Object[] {A57TAM08_SITE_ID});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A326TAM08_CRT_DATETIME = T000D4_A326TAM08_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326TAM08_CRT_DATETIME", localUtil.ttoc( A326TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n326TAM08_CRT_DATETIME = T000D4_n326TAM08_CRT_DATETIME[0] ;
         A327TAM08_CRT_USER_ID = T000D4_A327TAM08_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327TAM08_CRT_USER_ID", A327TAM08_CRT_USER_ID);
         n327TAM08_CRT_USER_ID = T000D4_n327TAM08_CRT_USER_ID[0] ;
         A329TAM08_UPD_DATETIME = T000D4_A329TAM08_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A329TAM08_UPD_DATETIME", localUtil.ttoc( A329TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n329TAM08_UPD_DATETIME = T000D4_n329TAM08_UPD_DATETIME[0] ;
         A330TAM08_UPD_USER_ID = T000D4_A330TAM08_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A330TAM08_UPD_USER_ID", A330TAM08_UPD_USER_ID);
         n330TAM08_UPD_USER_ID = T000D4_n330TAM08_UPD_USER_ID[0] ;
         A332TAM08_UPD_CNT = T000D4_A332TAM08_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A332TAM08_UPD_CNT, 10, 0)));
         n332TAM08_UPD_CNT = T000D4_n332TAM08_UPD_CNT[0] ;
         A319TAM08_SITE_NM = T000D4_A319TAM08_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A319TAM08_SITE_NM", A319TAM08_SITE_NM);
         n319TAM08_SITE_NM = T000D4_n319TAM08_SITE_NM[0] ;
         A320TAM08_SITE_SNM = T000D4_A320TAM08_SITE_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A320TAM08_SITE_SNM", A320TAM08_SITE_SNM);
         n320TAM08_SITE_SNM = T000D4_n320TAM08_SITE_SNM[0] ;
         A684TAM08_OUTER_SITE_ID = T000D4_A684TAM08_OUTER_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684TAM08_OUTER_SITE_ID", A684TAM08_OUTER_SITE_ID);
         n684TAM08_OUTER_SITE_ID = T000D4_n684TAM08_OUTER_SITE_ID[0] ;
         A325TAM08_DEL_FLG = T000D4_A325TAM08_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A325TAM08_DEL_FLG", A325TAM08_DEL_FLG);
         n325TAM08_DEL_FLG = T000D4_n325TAM08_DEL_FLG[0] ;
         A328TAM08_CRT_PROG_NM = T000D4_A328TAM08_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328TAM08_CRT_PROG_NM", A328TAM08_CRT_PROG_NM);
         n328TAM08_CRT_PROG_NM = T000D4_n328TAM08_CRT_PROG_NM[0] ;
         A331TAM08_UPD_PROG_NM = T000D4_A331TAM08_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A331TAM08_UPD_PROG_NM", A331TAM08_UPD_PROG_NM);
         n331TAM08_UPD_PROG_NM = T000D4_n331TAM08_UPD_PROG_NM[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A326TAM08_CRT_DATETIME) || (( A326TAM08_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A326TAM08_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TAM08_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM08_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A329TAM08_UPD_DATETIME) || (( A329TAM08_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A329TAM08_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TAM08_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM08_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      pr_default.execute(3, new Object[] {A57TAM08_SITE_ID});
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
      pr_default.execute(1, new Object[] {A57TAM08_SITE_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0D12( 8) ;
         RcdFound12 = (short)(1) ;
         A57TAM08_SITE_ID = T000D3_A57TAM08_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
         A326TAM08_CRT_DATETIME = T000D3_A326TAM08_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A326TAM08_CRT_DATETIME", localUtil.ttoc( A326TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n326TAM08_CRT_DATETIME = T000D3_n326TAM08_CRT_DATETIME[0] ;
         A327TAM08_CRT_USER_ID = T000D3_A327TAM08_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A327TAM08_CRT_USER_ID", A327TAM08_CRT_USER_ID);
         n327TAM08_CRT_USER_ID = T000D3_n327TAM08_CRT_USER_ID[0] ;
         A329TAM08_UPD_DATETIME = T000D3_A329TAM08_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A329TAM08_UPD_DATETIME", localUtil.ttoc( A329TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n329TAM08_UPD_DATETIME = T000D3_n329TAM08_UPD_DATETIME[0] ;
         A330TAM08_UPD_USER_ID = T000D3_A330TAM08_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A330TAM08_UPD_USER_ID", A330TAM08_UPD_USER_ID);
         n330TAM08_UPD_USER_ID = T000D3_n330TAM08_UPD_USER_ID[0] ;
         A332TAM08_UPD_CNT = T000D3_A332TAM08_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A332TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A332TAM08_UPD_CNT, 10, 0)));
         n332TAM08_UPD_CNT = T000D3_n332TAM08_UPD_CNT[0] ;
         A319TAM08_SITE_NM = T000D3_A319TAM08_SITE_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A319TAM08_SITE_NM", A319TAM08_SITE_NM);
         n319TAM08_SITE_NM = T000D3_n319TAM08_SITE_NM[0] ;
         A320TAM08_SITE_SNM = T000D3_A320TAM08_SITE_SNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A320TAM08_SITE_SNM", A320TAM08_SITE_SNM);
         n320TAM08_SITE_SNM = T000D3_n320TAM08_SITE_SNM[0] ;
         A684TAM08_OUTER_SITE_ID = T000D3_A684TAM08_OUTER_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A684TAM08_OUTER_SITE_ID", A684TAM08_OUTER_SITE_ID);
         n684TAM08_OUTER_SITE_ID = T000D3_n684TAM08_OUTER_SITE_ID[0] ;
         A325TAM08_DEL_FLG = T000D3_A325TAM08_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A325TAM08_DEL_FLG", A325TAM08_DEL_FLG);
         n325TAM08_DEL_FLG = T000D3_n325TAM08_DEL_FLG[0] ;
         A328TAM08_CRT_PROG_NM = T000D3_A328TAM08_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A328TAM08_CRT_PROG_NM", A328TAM08_CRT_PROG_NM);
         n328TAM08_CRT_PROG_NM = T000D3_n328TAM08_CRT_PROG_NM[0] ;
         A331TAM08_UPD_PROG_NM = T000D3_A331TAM08_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A331TAM08_UPD_PROG_NM", A331TAM08_UPD_PROG_NM);
         n331TAM08_UPD_PROG_NM = T000D3_n331TAM08_UPD_PROG_NM[0] ;
         O332TAM08_UPD_CNT = A332TAM08_UPD_CNT ;
         n332TAM08_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A332TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A332TAM08_UPD_CNT, 10, 0)));
         Z57TAM08_SITE_ID = A57TAM08_SITE_ID ;
         sMode12 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0D12( ) ;
         if ( AnyError == 1 )
         {
            RcdFound12 = (short)(0) ;
            initializeNonKey0D12( ) ;
         }
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
      pr_default.execute(4, new Object[] {A57TAM08_SITE_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000D6_A57TAM08_SITE_ID[0], A57TAM08_SITE_ID) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T000D6_A57TAM08_SITE_ID[0], A57TAM08_SITE_ID) > 0 ) ) )
         {
            A57TAM08_SITE_ID = T000D6_A57TAM08_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound12 = (short)(0) ;
      /* Using cursor T000D7 */
      pr_default.execute(5, new Object[] {A57TAM08_SITE_ID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000D7_A57TAM08_SITE_ID[0], A57TAM08_SITE_ID) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000D7_A57TAM08_SITE_ID[0], A57TAM08_SITE_ID) < 0 ) ) )
         {
            A57TAM08_SITE_ID = T000D7_A57TAM08_SITE_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
            RcdFound12 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0D12( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
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
         if ( RcdFound12 == 1 )
         {
            if ( GXutil.strcmp(A57TAM08_SITE_ID, Z57TAM08_SITE_ID) != 0 )
            {
               A57TAM08_SITE_ID = Z57TAM08_SITE_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
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
            if ( GXutil.strcmp(A57TAM08_SITE_ID, Z57TAM08_SITE_ID) != 0 )
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
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( GXutil.strcmp(A57TAM08_SITE_ID, Z57TAM08_SITE_ID) != 0 )
      {
         A57TAM08_SITE_ID = Z57TAM08_SITE_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
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
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM08_SITE_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM08_SITE_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0D12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_previous( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      move_next( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0D12( ) ;
      if ( RcdFound12 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
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
         pr_default.execute(0, new Object[] {A57TAM08_SITE_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM08_SITE"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z326TAM08_CRT_DATETIME.equals( T000D2_A326TAM08_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z327TAM08_CRT_USER_ID, T000D2_A327TAM08_CRT_USER_ID[0]) != 0 ) || !( Z329TAM08_UPD_DATETIME.equals( T000D2_A329TAM08_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z330TAM08_UPD_USER_ID, T000D2_A330TAM08_UPD_USER_ID[0]) != 0 ) || ( Z332TAM08_UPD_CNT != T000D2_A332TAM08_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z319TAM08_SITE_NM, T000D2_A319TAM08_SITE_NM[0]) != 0 ) || ( GXutil.strcmp(Z320TAM08_SITE_SNM, T000D2_A320TAM08_SITE_SNM[0]) != 0 ) || ( GXutil.strcmp(Z684TAM08_OUTER_SITE_ID, T000D2_A684TAM08_OUTER_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z325TAM08_DEL_FLG, T000D2_A325TAM08_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z328TAM08_CRT_PROG_NM, T000D2_A328TAM08_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z331TAM08_UPD_PROG_NM, T000D2_A331TAM08_UPD_PROG_NM[0]) != 0 ) )
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
                  pr_default.execute(6, new Object[] {A57TAM08_SITE_ID, new Boolean(n326TAM08_CRT_DATETIME), A326TAM08_CRT_DATETIME, new Boolean(n327TAM08_CRT_USER_ID), A327TAM08_CRT_USER_ID, new Boolean(n329TAM08_UPD_DATETIME), A329TAM08_UPD_DATETIME, new Boolean(n330TAM08_UPD_USER_ID), A330TAM08_UPD_USER_ID, new Boolean(n332TAM08_UPD_CNT), new Long(A332TAM08_UPD_CNT), new Boolean(n319TAM08_SITE_NM), A319TAM08_SITE_NM, new Boolean(n320TAM08_SITE_SNM), A320TAM08_SITE_SNM, new Boolean(n684TAM08_OUTER_SITE_ID), A684TAM08_OUTER_SITE_ID, new Boolean(n325TAM08_DEL_FLG), A325TAM08_DEL_FLG, new Boolean(n328TAM08_CRT_PROG_NM), A328TAM08_CRT_PROG_NM, new Boolean(n331TAM08_UPD_PROG_NM), A331TAM08_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM08_SITE") ;
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
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
                  pr_default.execute(7, new Object[] {new Boolean(n326TAM08_CRT_DATETIME), A326TAM08_CRT_DATETIME, new Boolean(n327TAM08_CRT_USER_ID), A327TAM08_CRT_USER_ID, new Boolean(n329TAM08_UPD_DATETIME), A329TAM08_UPD_DATETIME, new Boolean(n330TAM08_UPD_USER_ID), A330TAM08_UPD_USER_ID, new Boolean(n332TAM08_UPD_CNT), new Long(A332TAM08_UPD_CNT), new Boolean(n319TAM08_SITE_NM), A319TAM08_SITE_NM, new Boolean(n320TAM08_SITE_SNM), A320TAM08_SITE_SNM, new Boolean(n684TAM08_OUTER_SITE_ID), A684TAM08_OUTER_SITE_ID, new Boolean(n325TAM08_DEL_FLG), A325TAM08_DEL_FLG, new Boolean(n328TAM08_CRT_PROG_NM), A328TAM08_CRT_PROG_NM, new Boolean(n331TAM08_UPD_PROG_NM), A331TAM08_UPD_PROG_NM, A57TAM08_SITE_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM08_SITE") ;
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
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
               pr_default.execute(8, new Object[] {A57TAM08_SITE_ID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM08_SITE") ;
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "", true);
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
         pr_default.execute(9, new Object[] {A57TAM08_SITE_ID});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T000D12 */
         pr_default.execute(10, new Object[] {A57TAM08_SITE_ID});
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
      /* Scan By routine */
      /* Using cursor T000D13 */
      pr_default.execute(11);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A57TAM08_SITE_ID = T000D13_A57TAM08_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0D12( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound12 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound12 = (short)(1) ;
         A57TAM08_SITE_ID = T000D13_A57TAM08_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
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
      A326TAM08_CRT_DATETIME = GXutil.now( ) ;
      n326TAM08_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326TAM08_CRT_DATETIME", localUtil.ttoc( A326TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A327TAM08_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam08_site_impl.this.GXt_char1 = GXv_char2[0] ;
      A327TAM08_CRT_USER_ID = GXt_char1 ;
      n327TAM08_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A327TAM08_CRT_USER_ID", A327TAM08_CRT_USER_ID);
      A329TAM08_UPD_DATETIME = GXutil.now( ) ;
      n329TAM08_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A329TAM08_UPD_DATETIME", localUtil.ttoc( A329TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A330TAM08_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam08_site_impl.this.GXt_char1 = GXv_char2[0] ;
      A330TAM08_UPD_USER_ID = GXt_char1 ;
      n330TAM08_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A330TAM08_UPD_USER_ID", A330TAM08_UPD_USER_ID);
      A332TAM08_UPD_CNT = (long)(O332TAM08_UPD_CNT+1) ;
      n332TAM08_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A332TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A332TAM08_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0D12( )
   {
      /* Before Update Rules */
      A329TAM08_UPD_DATETIME = GXutil.now( ) ;
      n329TAM08_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A329TAM08_UPD_DATETIME", localUtil.ttoc( A329TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A330TAM08_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam08_site_impl.this.GXt_char1 = GXv_char2[0] ;
      A330TAM08_UPD_USER_ID = GXt_char1 ;
      n330TAM08_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A330TAM08_UPD_USER_ID", A330TAM08_UPD_USER_ID);
      A332TAM08_UPD_CNT = (long)(O332TAM08_UPD_CNT+1) ;
      n332TAM08_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A332TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A332TAM08_UPD_CNT, 10, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "施設マスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?2017731714432");
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("calendar-ja.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.closeHtmlHeader();
      FormProcess = " onkeyup=\"gx.evt.onkeyup(event)\" onkeypress=\"gx.evt.onkeypress(event,true,false)\" onkeydown=\"gx.evt.onkeypress(null,true,false)\"" ;
      httpContext.writeText( "<body") ;
      bodyStyle = "" ;
      bodyStyle = bodyStyle + ";-moz-opacity:0;opacity:0;" ;
      httpContext.writeText( " "+"class=\"Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tam08_site") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0D12( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z57TAM08_SITE_ID", GXutil.rtrim( Z57TAM08_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z326TAM08_CRT_DATETIME", localUtil.ttoc( Z326TAM08_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z327TAM08_CRT_USER_ID", GXutil.rtrim( Z327TAM08_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z329TAM08_UPD_DATETIME", localUtil.ttoc( Z329TAM08_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z330TAM08_UPD_USER_ID", GXutil.rtrim( Z330TAM08_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z332TAM08_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z332TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z319TAM08_SITE_NM", GXutil.rtrim( Z319TAM08_SITE_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z320TAM08_SITE_SNM", GXutil.rtrim( Z320TAM08_SITE_SNM));
      GxWebStd.gx_hidden_field( httpContext, "Z684TAM08_OUTER_SITE_ID", GXutil.rtrim( Z684TAM08_OUTER_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z325TAM08_DEL_FLG", GXutil.rtrim( Z325TAM08_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z328TAM08_CRT_PROG_NM", GXutil.rtrim( Z328TAM08_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z331TAM08_UPD_PROG_NM", GXutil.rtrim( Z331TAM08_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O332TAM08_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O332TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public String getPgmname( )
   {
      return "TAM08_SITE" ;
   }

   public String getPgmdesc( )
   {
      return "施設マスタ" ;
   }

   public void initializeNonKey0D12( )
   {
      A326TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n326TAM08_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A326TAM08_CRT_DATETIME", localUtil.ttoc( A326TAM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n326TAM08_CRT_DATETIME = (GXutil.nullDate().equals(A326TAM08_CRT_DATETIME) ? true : false) ;
      A327TAM08_CRT_USER_ID = "" ;
      n327TAM08_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A327TAM08_CRT_USER_ID", A327TAM08_CRT_USER_ID);
      n327TAM08_CRT_USER_ID = ((GXutil.strcmp("", A327TAM08_CRT_USER_ID)==0) ? true : false) ;
      A329TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n329TAM08_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A329TAM08_UPD_DATETIME", localUtil.ttoc( A329TAM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n329TAM08_UPD_DATETIME = (GXutil.nullDate().equals(A329TAM08_UPD_DATETIME) ? true : false) ;
      A330TAM08_UPD_USER_ID = "" ;
      n330TAM08_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A330TAM08_UPD_USER_ID", A330TAM08_UPD_USER_ID);
      n330TAM08_UPD_USER_ID = ((GXutil.strcmp("", A330TAM08_UPD_USER_ID)==0) ? true : false) ;
      A332TAM08_UPD_CNT = 0 ;
      n332TAM08_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A332TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A332TAM08_UPD_CNT, 10, 0)));
      n332TAM08_UPD_CNT = ((0==A332TAM08_UPD_CNT) ? true : false) ;
      A319TAM08_SITE_NM = "" ;
      n319TAM08_SITE_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A319TAM08_SITE_NM", A319TAM08_SITE_NM);
      n319TAM08_SITE_NM = ((GXutil.strcmp("", A319TAM08_SITE_NM)==0) ? true : false) ;
      A320TAM08_SITE_SNM = "" ;
      n320TAM08_SITE_SNM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A320TAM08_SITE_SNM", A320TAM08_SITE_SNM);
      n320TAM08_SITE_SNM = ((GXutil.strcmp("", A320TAM08_SITE_SNM)==0) ? true : false) ;
      A684TAM08_OUTER_SITE_ID = "" ;
      n684TAM08_OUTER_SITE_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A684TAM08_OUTER_SITE_ID", A684TAM08_OUTER_SITE_ID);
      n684TAM08_OUTER_SITE_ID = ((GXutil.strcmp("", A684TAM08_OUTER_SITE_ID)==0) ? true : false) ;
      A325TAM08_DEL_FLG = "" ;
      n325TAM08_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A325TAM08_DEL_FLG", A325TAM08_DEL_FLG);
      n325TAM08_DEL_FLG = ((GXutil.strcmp("", A325TAM08_DEL_FLG)==0) ? true : false) ;
      A328TAM08_CRT_PROG_NM = "" ;
      n328TAM08_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A328TAM08_CRT_PROG_NM", A328TAM08_CRT_PROG_NM);
      n328TAM08_CRT_PROG_NM = ((GXutil.strcmp("", A328TAM08_CRT_PROG_NM)==0) ? true : false) ;
      A331TAM08_UPD_PROG_NM = "" ;
      n331TAM08_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A331TAM08_UPD_PROG_NM", A331TAM08_UPD_PROG_NM);
      n331TAM08_UPD_PROG_NM = ((GXutil.strcmp("", A331TAM08_UPD_PROG_NM)==0) ? true : false) ;
      O332TAM08_UPD_CNT = A332TAM08_UPD_CNT ;
      n332TAM08_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A332TAM08_UPD_CNT", GXutil.ltrim( GXutil.str( A332TAM08_UPD_CNT, 10, 0)));
   }

   public void initAll0D12( )
   {
      A57TAM08_SITE_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A57TAM08_SITE_ID", A57TAM08_SITE_ID);
      initializeNonKey0D12( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?8960");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122662");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2017731714440");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tam08_site.js", "?2017731714441");
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
      divSectiontoolbar_Internalname = "SECTIONTOOLBAR" ;
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
      GXt_char1 = A327TAM08_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam08_site_impl.this.GXt_char1 = GXv_char2[0] ;
      A327TAM08_CRT_USER_ID = GXt_char1 ;
      n327TAM08_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A327TAM08_CRT_USER_ID", A327TAM08_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A327TAM08_CRT_USER_ID))+"\"");
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
      GXt_char1 = A330TAM08_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam08_site_impl.this.GXt_char1 = GXv_char2[0] ;
      A330TAM08_UPD_USER_ID = GXt_char1 ;
      n330TAM08_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A330TAM08_UPD_USER_ID", A330TAM08_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A330TAM08_UPD_USER_ID))+"\"");
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
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
      A57TAM08_SITE_ID = GX_Parm1 ;
      A326TAM08_CRT_DATETIME = GX_Parm2 ;
      n326TAM08_CRT_DATETIME = false ;
      A327TAM08_CRT_USER_ID = GX_Parm3 ;
      n327TAM08_CRT_USER_ID = false ;
      A329TAM08_UPD_DATETIME = GX_Parm4 ;
      n329TAM08_UPD_DATETIME = false ;
      A330TAM08_UPD_USER_ID = GX_Parm5 ;
      n330TAM08_UPD_USER_ID = false ;
      A332TAM08_UPD_CNT = GX_Parm6 ;
      n332TAM08_UPD_CNT = false ;
      A319TAM08_SITE_NM = GX_Parm7 ;
      n319TAM08_SITE_NM = false ;
      A320TAM08_SITE_SNM = GX_Parm8 ;
      n320TAM08_SITE_SNM = false ;
      A684TAM08_OUTER_SITE_ID = GX_Parm9 ;
      n684TAM08_OUTER_SITE_ID = false ;
      A325TAM08_DEL_FLG = GX_Parm10 ;
      n325TAM08_DEL_FLG = false ;
      A328TAM08_CRT_PROG_NM = GX_Parm11 ;
      n328TAM08_CRT_PROG_NM = false ;
      A331TAM08_UPD_PROG_NM = GX_Parm12 ;
      n331TAM08_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A326TAM08_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A327TAM08_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A329TAM08_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A330TAM08_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A332TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A319TAM08_SITE_NM));
      isValidOutput.add(GXutil.rtrim( A320TAM08_SITE_SNM));
      isValidOutput.add(GXutil.rtrim( A684TAM08_OUTER_SITE_ID));
      isValidOutput.add(GXutil.rtrim( A325TAM08_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A328TAM08_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A331TAM08_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z57TAM08_SITE_ID));
      isValidOutput.add(localUtil.ttoc( Z326TAM08_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z327TAM08_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z329TAM08_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z330TAM08_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z332TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z319TAM08_SITE_NM));
      isValidOutput.add(GXutil.rtrim( Z320TAM08_SITE_SNM));
      isValidOutput.add(GXutil.rtrim( Z684TAM08_OUTER_SITE_ID));
      isValidOutput.add(GXutil.rtrim( Z325TAM08_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z328TAM08_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z331TAM08_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O332TAM08_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   protected boolean isSpaSupported( )
   {
      return false ;
   }

   public void initializeDynEvents( )
   {
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
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
                  /* Execute user subroutine: S112 */
                  S112 ();
                  break;
         }
      }
   }

   public void initialize( )
   {
      sPrefix = "" ;
      Z57TAM08_SITE_ID = "" ;
      Z326TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z327TAM08_CRT_USER_ID = "" ;
      Z329TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z330TAM08_UPD_USER_ID = "" ;
      Z319TAM08_SITE_NM = "" ;
      Z320TAM08_SITE_SNM = "" ;
      Z684TAM08_OUTER_SITE_ID = "" ;
      Z325TAM08_DEL_FLG = "" ;
      Z328TAM08_CRT_PROG_NM = "" ;
      Z331TAM08_UPD_PROG_NM = "" ;
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
      A57TAM08_SITE_ID = "" ;
      lblTextblocktam08_site_nm_Jsonclick = "" ;
      A319TAM08_SITE_NM = "" ;
      lblTextblocktam08_site_snm_Jsonclick = "" ;
      A320TAM08_SITE_SNM = "" ;
      lblTextblocktam08_outer_site_id_Jsonclick = "" ;
      A684TAM08_OUTER_SITE_ID = "" ;
      lblTextblocktam08_del_flg_Jsonclick = "" ;
      A325TAM08_DEL_FLG = "" ;
      lblTextblocktam08_crt_datetime_Jsonclick = "" ;
      A326TAM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam08_crt_user_id_Jsonclick = "" ;
      A327TAM08_CRT_USER_ID = "" ;
      lblTextblocktam08_crt_prog_nm_Jsonclick = "" ;
      A328TAM08_CRT_PROG_NM = "" ;
      lblTextblocktam08_upd_datetime_Jsonclick = "" ;
      A329TAM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam08_upd_user_id_Jsonclick = "" ;
      A330TAM08_UPD_USER_ID = "" ;
      lblTextblocktam08_upd_prog_nm_Jsonclick = "" ;
      A331TAM08_UPD_PROG_NM = "" ;
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
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000D4_A57TAM08_SITE_ID = new String[] {""} ;
      T000D4_A326TAM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D4_n326TAM08_CRT_DATETIME = new boolean[] {false} ;
      T000D4_A327TAM08_CRT_USER_ID = new String[] {""} ;
      T000D4_n327TAM08_CRT_USER_ID = new boolean[] {false} ;
      T000D4_A329TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D4_n329TAM08_UPD_DATETIME = new boolean[] {false} ;
      T000D4_A330TAM08_UPD_USER_ID = new String[] {""} ;
      T000D4_n330TAM08_UPD_USER_ID = new boolean[] {false} ;
      T000D4_A332TAM08_UPD_CNT = new long[1] ;
      T000D4_n332TAM08_UPD_CNT = new boolean[] {false} ;
      T000D4_A319TAM08_SITE_NM = new String[] {""} ;
      T000D4_n319TAM08_SITE_NM = new boolean[] {false} ;
      T000D4_A320TAM08_SITE_SNM = new String[] {""} ;
      T000D4_n320TAM08_SITE_SNM = new boolean[] {false} ;
      T000D4_A684TAM08_OUTER_SITE_ID = new String[] {""} ;
      T000D4_n684TAM08_OUTER_SITE_ID = new boolean[] {false} ;
      T000D4_A325TAM08_DEL_FLG = new String[] {""} ;
      T000D4_n325TAM08_DEL_FLG = new boolean[] {false} ;
      T000D4_A328TAM08_CRT_PROG_NM = new String[] {""} ;
      T000D4_n328TAM08_CRT_PROG_NM = new boolean[] {false} ;
      T000D4_A331TAM08_UPD_PROG_NM = new String[] {""} ;
      T000D4_n331TAM08_UPD_PROG_NM = new boolean[] {false} ;
      T000D5_A57TAM08_SITE_ID = new String[] {""} ;
      T000D3_A57TAM08_SITE_ID = new String[] {""} ;
      T000D3_A326TAM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D3_n326TAM08_CRT_DATETIME = new boolean[] {false} ;
      T000D3_A327TAM08_CRT_USER_ID = new String[] {""} ;
      T000D3_n327TAM08_CRT_USER_ID = new boolean[] {false} ;
      T000D3_A329TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D3_n329TAM08_UPD_DATETIME = new boolean[] {false} ;
      T000D3_A330TAM08_UPD_USER_ID = new String[] {""} ;
      T000D3_n330TAM08_UPD_USER_ID = new boolean[] {false} ;
      T000D3_A332TAM08_UPD_CNT = new long[1] ;
      T000D3_n332TAM08_UPD_CNT = new boolean[] {false} ;
      T000D3_A319TAM08_SITE_NM = new String[] {""} ;
      T000D3_n319TAM08_SITE_NM = new boolean[] {false} ;
      T000D3_A320TAM08_SITE_SNM = new String[] {""} ;
      T000D3_n320TAM08_SITE_SNM = new boolean[] {false} ;
      T000D3_A684TAM08_OUTER_SITE_ID = new String[] {""} ;
      T000D3_n684TAM08_OUTER_SITE_ID = new boolean[] {false} ;
      T000D3_A325TAM08_DEL_FLG = new String[] {""} ;
      T000D3_n325TAM08_DEL_FLG = new boolean[] {false} ;
      T000D3_A328TAM08_CRT_PROG_NM = new String[] {""} ;
      T000D3_n328TAM08_CRT_PROG_NM = new boolean[] {false} ;
      T000D3_A331TAM08_UPD_PROG_NM = new String[] {""} ;
      T000D3_n331TAM08_UPD_PROG_NM = new boolean[] {false} ;
      sMode12 = "" ;
      T000D6_A57TAM08_SITE_ID = new String[] {""} ;
      T000D7_A57TAM08_SITE_ID = new String[] {""} ;
      T000D2_A57TAM08_SITE_ID = new String[] {""} ;
      T000D2_A326TAM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D2_n326TAM08_CRT_DATETIME = new boolean[] {false} ;
      T000D2_A327TAM08_CRT_USER_ID = new String[] {""} ;
      T000D2_n327TAM08_CRT_USER_ID = new boolean[] {false} ;
      T000D2_A329TAM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000D2_n329TAM08_UPD_DATETIME = new boolean[] {false} ;
      T000D2_A330TAM08_UPD_USER_ID = new String[] {""} ;
      T000D2_n330TAM08_UPD_USER_ID = new boolean[] {false} ;
      T000D2_A332TAM08_UPD_CNT = new long[1] ;
      T000D2_n332TAM08_UPD_CNT = new boolean[] {false} ;
      T000D2_A319TAM08_SITE_NM = new String[] {""} ;
      T000D2_n319TAM08_SITE_NM = new boolean[] {false} ;
      T000D2_A320TAM08_SITE_SNM = new String[] {""} ;
      T000D2_n320TAM08_SITE_SNM = new boolean[] {false} ;
      T000D2_A684TAM08_OUTER_SITE_ID = new String[] {""} ;
      T000D2_n684TAM08_OUTER_SITE_ID = new boolean[] {false} ;
      T000D2_A325TAM08_DEL_FLG = new String[] {""} ;
      T000D2_n325TAM08_DEL_FLG = new boolean[] {false} ;
      T000D2_A328TAM08_CRT_PROG_NM = new String[] {""} ;
      T000D2_n328TAM08_CRT_PROG_NM = new boolean[] {false} ;
      T000D2_A331TAM08_UPD_PROG_NM = new String[] {""} ;
      T000D2_n331TAM08_UPD_PROG_NM = new boolean[] {false} ;
      T000D11_A110TBW03_SESSION_ID = new String[] {""} ;
      T000D11_A111TBW03_APP_ID = new String[] {""} ;
      T000D11_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T000D11_A113TBW03_STUDY_ID = new long[1] ;
      T000D11_A114TBW03_SUBJECT_ID = new int[1] ;
      T000D11_A115TBW03_CRF_ID = new short[1] ;
      T000D12_A17TBM22_STUDY_ID = new long[1] ;
      T000D12_A18TBM22_SITE_ID = new String[] {""} ;
      T000D13_A57TAM08_SITE_ID = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam08_site__default(),
         new Object[] {
             new Object[] {
            T000D2_A57TAM08_SITE_ID, T000D2_A326TAM08_CRT_DATETIME, T000D2_n326TAM08_CRT_DATETIME, T000D2_A327TAM08_CRT_USER_ID, T000D2_n327TAM08_CRT_USER_ID, T000D2_A329TAM08_UPD_DATETIME, T000D2_n329TAM08_UPD_DATETIME, T000D2_A330TAM08_UPD_USER_ID, T000D2_n330TAM08_UPD_USER_ID, T000D2_A332TAM08_UPD_CNT,
            T000D2_n332TAM08_UPD_CNT, T000D2_A319TAM08_SITE_NM, T000D2_n319TAM08_SITE_NM, T000D2_A320TAM08_SITE_SNM, T000D2_n320TAM08_SITE_SNM, T000D2_A684TAM08_OUTER_SITE_ID, T000D2_n684TAM08_OUTER_SITE_ID, T000D2_A325TAM08_DEL_FLG, T000D2_n325TAM08_DEL_FLG, T000D2_A328TAM08_CRT_PROG_NM,
            T000D2_n328TAM08_CRT_PROG_NM, T000D2_A331TAM08_UPD_PROG_NM, T000D2_n331TAM08_UPD_PROG_NM
            }
            , new Object[] {
            T000D3_A57TAM08_SITE_ID, T000D3_A326TAM08_CRT_DATETIME, T000D3_n326TAM08_CRT_DATETIME, T000D3_A327TAM08_CRT_USER_ID, T000D3_n327TAM08_CRT_USER_ID, T000D3_A329TAM08_UPD_DATETIME, T000D3_n329TAM08_UPD_DATETIME, T000D3_A330TAM08_UPD_USER_ID, T000D3_n330TAM08_UPD_USER_ID, T000D3_A332TAM08_UPD_CNT,
            T000D3_n332TAM08_UPD_CNT, T000D3_A319TAM08_SITE_NM, T000D3_n319TAM08_SITE_NM, T000D3_A320TAM08_SITE_SNM, T000D3_n320TAM08_SITE_SNM, T000D3_A684TAM08_OUTER_SITE_ID, T000D3_n684TAM08_OUTER_SITE_ID, T000D3_A325TAM08_DEL_FLG, T000D3_n325TAM08_DEL_FLG, T000D3_A328TAM08_CRT_PROG_NM,
            T000D3_n328TAM08_CRT_PROG_NM, T000D3_A331TAM08_UPD_PROG_NM, T000D3_n331TAM08_UPD_PROG_NM
            }
            , new Object[] {
            T000D4_A57TAM08_SITE_ID, T000D4_A326TAM08_CRT_DATETIME, T000D4_n326TAM08_CRT_DATETIME, T000D4_A327TAM08_CRT_USER_ID, T000D4_n327TAM08_CRT_USER_ID, T000D4_A329TAM08_UPD_DATETIME, T000D4_n329TAM08_UPD_DATETIME, T000D4_A330TAM08_UPD_USER_ID, T000D4_n330TAM08_UPD_USER_ID, T000D4_A332TAM08_UPD_CNT,
            T000D4_n332TAM08_UPD_CNT, T000D4_A319TAM08_SITE_NM, T000D4_n319TAM08_SITE_NM, T000D4_A320TAM08_SITE_SNM, T000D4_n320TAM08_SITE_SNM, T000D4_A684TAM08_OUTER_SITE_ID, T000D4_n684TAM08_OUTER_SITE_ID, T000D4_A325TAM08_DEL_FLG, T000D4_n325TAM08_DEL_FLG, T000D4_A328TAM08_CRT_PROG_NM,
            T000D4_n328TAM08_CRT_PROG_NM, T000D4_A331TAM08_UPD_PROG_NM, T000D4_n331TAM08_UPD_PROG_NM
            }
            , new Object[] {
            T000D5_A57TAM08_SITE_ID
            }
            , new Object[] {
            T000D6_A57TAM08_SITE_ID
            }
            , new Object[] {
            T000D7_A57TAM08_SITE_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000D11_A110TBW03_SESSION_ID, T000D11_A111TBW03_APP_ID, T000D11_A112TBW03_DISP_DATETIME, T000D11_A113TBW03_STUDY_ID, T000D11_A114TBW03_SUBJECT_ID, T000D11_A115TBW03_CRF_ID
            }
            , new Object[] {
            T000D12_A17TBM22_STUDY_ID, T000D12_A18TBM22_SITE_ID
            }
            , new Object[] {
            T000D13_A57TAM08_SITE_ID
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
   private long Z332TAM08_UPD_CNT ;
   private long O332TAM08_UPD_CNT ;
   private long A332TAM08_UPD_CNT ;
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
   private String grpGroupdata_Internalname ;
   private String tblTable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
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
   private String divSectiontoolbar_Internalname ;
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
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z326TAM08_CRT_DATETIME ;
   private java.util.Date Z329TAM08_UPD_DATETIME ;
   private java.util.Date A326TAM08_CRT_DATETIME ;
   private java.util.Date A329TAM08_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n319TAM08_SITE_NM ;
   private boolean n320TAM08_SITE_SNM ;
   private boolean n684TAM08_OUTER_SITE_ID ;
   private boolean n325TAM08_DEL_FLG ;
   private boolean n326TAM08_CRT_DATETIME ;
   private boolean n327TAM08_CRT_USER_ID ;
   private boolean n328TAM08_CRT_PROG_NM ;
   private boolean n329TAM08_UPD_DATETIME ;
   private boolean n330TAM08_UPD_USER_ID ;
   private boolean n331TAM08_UPD_PROG_NM ;
   private boolean n332TAM08_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z57TAM08_SITE_ID ;
   private String Z327TAM08_CRT_USER_ID ;
   private String Z330TAM08_UPD_USER_ID ;
   private String Z319TAM08_SITE_NM ;
   private String Z320TAM08_SITE_SNM ;
   private String Z684TAM08_OUTER_SITE_ID ;
   private String Z325TAM08_DEL_FLG ;
   private String Z328TAM08_CRT_PROG_NM ;
   private String Z331TAM08_UPD_PROG_NM ;
   private String A57TAM08_SITE_ID ;
   private String A319TAM08_SITE_NM ;
   private String A320TAM08_SITE_SNM ;
   private String A684TAM08_OUTER_SITE_ID ;
   private String A325TAM08_DEL_FLG ;
   private String A327TAM08_CRT_USER_ID ;
   private String A328TAM08_CRT_PROG_NM ;
   private String A330TAM08_UPD_USER_ID ;
   private String A331TAM08_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000D4_A57TAM08_SITE_ID ;
   private java.util.Date[] T000D4_A326TAM08_CRT_DATETIME ;
   private boolean[] T000D4_n326TAM08_CRT_DATETIME ;
   private String[] T000D4_A327TAM08_CRT_USER_ID ;
   private boolean[] T000D4_n327TAM08_CRT_USER_ID ;
   private java.util.Date[] T000D4_A329TAM08_UPD_DATETIME ;
   private boolean[] T000D4_n329TAM08_UPD_DATETIME ;
   private String[] T000D4_A330TAM08_UPD_USER_ID ;
   private boolean[] T000D4_n330TAM08_UPD_USER_ID ;
   private long[] T000D4_A332TAM08_UPD_CNT ;
   private boolean[] T000D4_n332TAM08_UPD_CNT ;
   private String[] T000D4_A319TAM08_SITE_NM ;
   private boolean[] T000D4_n319TAM08_SITE_NM ;
   private String[] T000D4_A320TAM08_SITE_SNM ;
   private boolean[] T000D4_n320TAM08_SITE_SNM ;
   private String[] T000D4_A684TAM08_OUTER_SITE_ID ;
   private boolean[] T000D4_n684TAM08_OUTER_SITE_ID ;
   private String[] T000D4_A325TAM08_DEL_FLG ;
   private boolean[] T000D4_n325TAM08_DEL_FLG ;
   private String[] T000D4_A328TAM08_CRT_PROG_NM ;
   private boolean[] T000D4_n328TAM08_CRT_PROG_NM ;
   private String[] T000D4_A331TAM08_UPD_PROG_NM ;
   private boolean[] T000D4_n331TAM08_UPD_PROG_NM ;
   private String[] T000D5_A57TAM08_SITE_ID ;
   private String[] T000D3_A57TAM08_SITE_ID ;
   private java.util.Date[] T000D3_A326TAM08_CRT_DATETIME ;
   private boolean[] T000D3_n326TAM08_CRT_DATETIME ;
   private String[] T000D3_A327TAM08_CRT_USER_ID ;
   private boolean[] T000D3_n327TAM08_CRT_USER_ID ;
   private java.util.Date[] T000D3_A329TAM08_UPD_DATETIME ;
   private boolean[] T000D3_n329TAM08_UPD_DATETIME ;
   private String[] T000D3_A330TAM08_UPD_USER_ID ;
   private boolean[] T000D3_n330TAM08_UPD_USER_ID ;
   private long[] T000D3_A332TAM08_UPD_CNT ;
   private boolean[] T000D3_n332TAM08_UPD_CNT ;
   private String[] T000D3_A319TAM08_SITE_NM ;
   private boolean[] T000D3_n319TAM08_SITE_NM ;
   private String[] T000D3_A320TAM08_SITE_SNM ;
   private boolean[] T000D3_n320TAM08_SITE_SNM ;
   private String[] T000D3_A684TAM08_OUTER_SITE_ID ;
   private boolean[] T000D3_n684TAM08_OUTER_SITE_ID ;
   private String[] T000D3_A325TAM08_DEL_FLG ;
   private boolean[] T000D3_n325TAM08_DEL_FLG ;
   private String[] T000D3_A328TAM08_CRT_PROG_NM ;
   private boolean[] T000D3_n328TAM08_CRT_PROG_NM ;
   private String[] T000D3_A331TAM08_UPD_PROG_NM ;
   private boolean[] T000D3_n331TAM08_UPD_PROG_NM ;
   private String[] T000D6_A57TAM08_SITE_ID ;
   private String[] T000D7_A57TAM08_SITE_ID ;
   private String[] T000D2_A57TAM08_SITE_ID ;
   private java.util.Date[] T000D2_A326TAM08_CRT_DATETIME ;
   private boolean[] T000D2_n326TAM08_CRT_DATETIME ;
   private String[] T000D2_A327TAM08_CRT_USER_ID ;
   private boolean[] T000D2_n327TAM08_CRT_USER_ID ;
   private java.util.Date[] T000D2_A329TAM08_UPD_DATETIME ;
   private boolean[] T000D2_n329TAM08_UPD_DATETIME ;
   private String[] T000D2_A330TAM08_UPD_USER_ID ;
   private boolean[] T000D2_n330TAM08_UPD_USER_ID ;
   private long[] T000D2_A332TAM08_UPD_CNT ;
   private boolean[] T000D2_n332TAM08_UPD_CNT ;
   private String[] T000D2_A319TAM08_SITE_NM ;
   private boolean[] T000D2_n319TAM08_SITE_NM ;
   private String[] T000D2_A320TAM08_SITE_SNM ;
   private boolean[] T000D2_n320TAM08_SITE_SNM ;
   private String[] T000D2_A684TAM08_OUTER_SITE_ID ;
   private boolean[] T000D2_n684TAM08_OUTER_SITE_ID ;
   private String[] T000D2_A325TAM08_DEL_FLG ;
   private boolean[] T000D2_n325TAM08_DEL_FLG ;
   private String[] T000D2_A328TAM08_CRT_PROG_NM ;
   private boolean[] T000D2_n328TAM08_CRT_PROG_NM ;
   private String[] T000D2_A331TAM08_UPD_PROG_NM ;
   private boolean[] T000D2_n331TAM08_UPD_PROG_NM ;
   private String[] T000D11_A110TBW03_SESSION_ID ;
   private String[] T000D11_A111TBW03_APP_ID ;
   private String[] T000D11_A112TBW03_DISP_DATETIME ;
   private long[] T000D11_A113TBW03_STUDY_ID ;
   private int[] T000D11_A114TBW03_SUBJECT_ID ;
   private short[] T000D11_A115TBW03_CRF_ID ;
   private long[] T000D12_A17TBM22_STUDY_ID ;
   private String[] T000D12_A18TBM22_SITE_ID ;
   private String[] T000D13_A57TAM08_SITE_ID ;
}

final  class tam08_site__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000D2", "SELECT `TAM08_SITE_ID`, `TAM08_CRT_DATETIME`, `TAM08_CRT_USER_ID`, `TAM08_UPD_DATETIME`, `TAM08_UPD_USER_ID`, `TAM08_UPD_CNT`, `TAM08_SITE_NM`, `TAM08_SITE_SNM`, `TAM08_OUTER_SITE_ID`, `TAM08_DEL_FLG`, `TAM08_CRT_PROG_NM`, `TAM08_UPD_PROG_NM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D3", "SELECT `TAM08_SITE_ID`, `TAM08_CRT_DATETIME`, `TAM08_CRT_USER_ID`, `TAM08_UPD_DATETIME`, `TAM08_UPD_USER_ID`, `TAM08_UPD_CNT`, `TAM08_SITE_NM`, `TAM08_SITE_SNM`, `TAM08_OUTER_SITE_ID`, `TAM08_DEL_FLG`, `TAM08_CRT_PROG_NM`, `TAM08_UPD_PROG_NM` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D4", "SELECT TM1.`TAM08_SITE_ID`, TM1.`TAM08_CRT_DATETIME`, TM1.`TAM08_CRT_USER_ID`, TM1.`TAM08_UPD_DATETIME`, TM1.`TAM08_UPD_USER_ID`, TM1.`TAM08_UPD_CNT`, TM1.`TAM08_SITE_NM`, TM1.`TAM08_SITE_SNM`, TM1.`TAM08_OUTER_SITE_ID`, TM1.`TAM08_DEL_FLG`, TM1.`TAM08_CRT_PROG_NM`, TM1.`TAM08_UPD_PROG_NM` FROM `TAM08_SITE` TM1 WHERE TM1.`TAM08_SITE_ID` = ? ORDER BY TM1.`TAM08_SITE_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000D5", "SELECT `TAM08_SITE_ID` FROM `TAM08_SITE` WHERE `TAM08_SITE_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000D6", "SELECT `TAM08_SITE_ID` FROM `TAM08_SITE` WHERE ( `TAM08_SITE_ID` > ?) ORDER BY `TAM08_SITE_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000D7", "SELECT `TAM08_SITE_ID` FROM `TAM08_SITE` WHERE ( `TAM08_SITE_ID` < ?) ORDER BY `TAM08_SITE_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000D8", "INSERT INTO `TAM08_SITE`(`TAM08_SITE_ID`, `TAM08_CRT_DATETIME`, `TAM08_CRT_USER_ID`, `TAM08_UPD_DATETIME`, `TAM08_UPD_USER_ID`, `TAM08_UPD_CNT`, `TAM08_SITE_NM`, `TAM08_SITE_SNM`, `TAM08_OUTER_SITE_ID`, `TAM08_DEL_FLG`, `TAM08_CRT_PROG_NM`, `TAM08_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000D9", "UPDATE `TAM08_SITE` SET `TAM08_CRT_DATETIME`=?, `TAM08_CRT_USER_ID`=?, `TAM08_UPD_DATETIME`=?, `TAM08_UPD_USER_ID`=?, `TAM08_UPD_CNT`=?, `TAM08_SITE_NM`=?, `TAM08_SITE_SNM`=?, `TAM08_OUTER_SITE_ID`=?, `TAM08_DEL_FLG`=?, `TAM08_CRT_PROG_NM`=?, `TAM08_UPD_PROG_NM`=?  WHERE `TAM08_SITE_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000D10", "DELETE FROM `TAM08_SITE`  WHERE `TAM08_SITE_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000D11", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_SITE_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000D12", "SELECT `TBM22_STUDY_ID`, `TBM22_SITE_ID` FROM `TBM22_STUDY_SITE` WHERE `TBM22_SITE_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000D13", "SELECT `TAM08_SITE_ID` FROM `TAM08_SITE` ORDER BY `TAM08_SITE_ID` ",true, GX_NOMASK, false, this,100,0,false )
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
               return;
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
               return;
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
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 9 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 10 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
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
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
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
               return;
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
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 20, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 20);
               return;
      }
   }

}

