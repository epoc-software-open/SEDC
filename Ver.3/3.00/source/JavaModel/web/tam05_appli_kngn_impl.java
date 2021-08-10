/*
               File: tam05_appli_kngn_impl
        Description: アプリケーション権限マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:40.1
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam05_appli_kngn_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TAM05_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatam05_crt_user_id099( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TAM05_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatam05_upd_user_id099( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A13TAM04_AUTH_CD = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A13TAM04_AUTH_CD) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_10") == 0 )
      {
         A12TAM03_APP_ID = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_10( A12TAM03_APP_ID) ;
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
         Form.getMeta().addItem("description", "アプリケーション権限マスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tam05_appli_kngn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam05_appli_kngn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam05_appli_kngn_impl.class ));
   }

   public tam05_appli_kngn_impl( int remoteHandle ,
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
         wb_table1_2_099( true) ;
      }
      return  ;
   }

   public void wb_table1_2_099e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm099( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_099( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_099( true) ;
      }
      return  ;
   }

   public void wb_table2_5_099e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "アプリケーション権限マスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TAM05_APPLI_KNGN.htm");
         wb_table3_28_099( true) ;
      }
      return  ;
   }

   public void wb_table3_28_099e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_099e( true) ;
      }
      else
      {
         wb_table1_2_099e( false) ;
      }
   }

   public void wb_table3_28_099( boolean wbgen )
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
         wb_table4_34_099( true) ;
      }
      return  ;
   }

   public void wb_table4_34_099e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 92,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM05_APPLI_KNGN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM05_APPLI_KNGN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_099e( true) ;
      }
      else
      {
         wb_table3_28_099e( false) ;
      }
   }

   public void wb_table4_34_099( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_auth_cd_Internalname, "権限パターン区分", "", "", lblTextblocktam04_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_AUTH_CD_Internalname, GXutil.rtrim( A13TAM04_AUTH_CD), GXutil.rtrim( localUtil.format( A13TAM04_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam03_app_id_Internalname, "アプリケーションID", "", "", lblTextblocktam03_app_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM03_APP_ID_Internalname, GXutil.rtrim( A12TAM03_APP_ID), GXutil.rtrim( localUtil.format( A12TAM03_APP_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM03_APP_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM03_APP_ID_Enabled, 0, "text", "", 7, "chr", 1, "row", 7, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_kngn_flg_Internalname, "権限フラグ", "", "", lblTextblocktam05_kngn_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM05_KNGN_FLG_Internalname, GXutil.rtrim( A288TAM05_KNGN_FLG), GXutil.rtrim( localUtil.format( A288TAM05_KNGN_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM05_KNGN_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM05_KNGN_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam05_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM05_DEL_FLG_Internalname, GXutil.rtrim( A289TAM05_DEL_FLG), GXutil.rtrim( localUtil.format( A289TAM05_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM05_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM05_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam05_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAM05_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM05_CRT_DATETIME_Internalname, localUtil.format(A290TAM05_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A290TAM05_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM05_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM05_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM05_APPLI_KNGN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM05_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAM05_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam05_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM05_CRT_USER_ID_Internalname, GXutil.rtrim( A291TAM05_CRT_USER_ID), GXutil.rtrim( localUtil.format( A291TAM05_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM05_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM05_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam05_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM05_CRT_PROG_NM_Internalname, GXutil.rtrim( A292TAM05_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A292TAM05_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM05_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM05_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam05_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAM05_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM05_UPD_DATETIME_Internalname, localUtil.format(A293TAM05_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A293TAM05_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM05_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM05_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM05_APPLI_KNGN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM05_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAM05_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktam05_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM05_UPD_USER_ID_Internalname, GXutil.rtrim( A294TAM05_UPD_USER_ID), GXutil.rtrim( localUtil.format( A294TAM05_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM05_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM05_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam05_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM05_UPD_PROG_NM_Internalname, GXutil.rtrim( A295TAM05_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A295TAM05_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM05_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM05_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam05_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktam05_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM05_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTAM05_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A296TAM05_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A296TAM05_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM05_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM05_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TAM05_APPLI_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_099e( true) ;
      }
      else
      {
         wb_table4_34_099e( false) ;
      }
   }

   public void wb_table2_5_099( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM05_APPLI_KNGN.htm");
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
         wb_table2_5_099e( true) ;
      }
      else
      {
         wb_table2_5_099e( false) ;
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
      /* Execute user event: e11092 */
      e11092 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A13TAM04_AUTH_CD = httpContext.cgiGet( edtTAM04_AUTH_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
            A12TAM03_APP_ID = httpContext.cgiGet( edtTAM03_APP_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
            A288TAM05_KNGN_FLG = httpContext.cgiGet( edtTAM05_KNGN_FLG_Internalname) ;
            n288TAM05_KNGN_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A288TAM05_KNGN_FLG", A288TAM05_KNGN_FLG);
            n288TAM05_KNGN_FLG = ((GXutil.strcmp("", A288TAM05_KNGN_FLG)==0) ? true : false) ;
            A289TAM05_DEL_FLG = httpContext.cgiGet( edtTAM05_DEL_FLG_Internalname) ;
            n289TAM05_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A289TAM05_DEL_FLG", A289TAM05_DEL_FLG);
            n289TAM05_DEL_FLG = ((GXutil.strcmp("", A289TAM05_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM05_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TAM05_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM05_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n290TAM05_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A290TAM05_CRT_DATETIME", localUtil.ttoc( A290TAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A290TAM05_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM05_CRT_DATETIME_Internalname)) ;
               n290TAM05_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A290TAM05_CRT_DATETIME", localUtil.ttoc( A290TAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n290TAM05_CRT_DATETIME = (GXutil.nullDate().equals(A290TAM05_CRT_DATETIME) ? true : false) ;
            A291TAM05_CRT_USER_ID = httpContext.cgiGet( edtTAM05_CRT_USER_ID_Internalname) ;
            n291TAM05_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A291TAM05_CRT_USER_ID", A291TAM05_CRT_USER_ID);
            n291TAM05_CRT_USER_ID = ((GXutil.strcmp("", A291TAM05_CRT_USER_ID)==0) ? true : false) ;
            A292TAM05_CRT_PROG_NM = httpContext.cgiGet( edtTAM05_CRT_PROG_NM_Internalname) ;
            n292TAM05_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A292TAM05_CRT_PROG_NM", A292TAM05_CRT_PROG_NM);
            n292TAM05_CRT_PROG_NM = ((GXutil.strcmp("", A292TAM05_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM05_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TAM05_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM05_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n293TAM05_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A293TAM05_UPD_DATETIME", localUtil.ttoc( A293TAM05_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A293TAM05_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM05_UPD_DATETIME_Internalname)) ;
               n293TAM05_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A293TAM05_UPD_DATETIME", localUtil.ttoc( A293TAM05_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n293TAM05_UPD_DATETIME = (GXutil.nullDate().equals(A293TAM05_UPD_DATETIME) ? true : false) ;
            A294TAM05_UPD_USER_ID = httpContext.cgiGet( edtTAM05_UPD_USER_ID_Internalname) ;
            n294TAM05_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A294TAM05_UPD_USER_ID", A294TAM05_UPD_USER_ID);
            n294TAM05_UPD_USER_ID = ((GXutil.strcmp("", A294TAM05_UPD_USER_ID)==0) ? true : false) ;
            A295TAM05_UPD_PROG_NM = httpContext.cgiGet( edtTAM05_UPD_PROG_NM_Internalname) ;
            n295TAM05_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A295TAM05_UPD_PROG_NM", A295TAM05_UPD_PROG_NM);
            n295TAM05_UPD_PROG_NM = ((GXutil.strcmp("", A295TAM05_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAM05_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAM05_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAM05_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM05_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A296TAM05_UPD_CNT = 0 ;
               n296TAM05_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A296TAM05_UPD_CNT", GXutil.ltrim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)));
            }
            else
            {
               A296TAM05_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTAM05_UPD_CNT_Internalname), ".", ",") ;
               n296TAM05_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A296TAM05_UPD_CNT", GXutil.ltrim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)));
            }
            n296TAM05_UPD_CNT = ((0==A296TAM05_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z13TAM04_AUTH_CD = httpContext.cgiGet( "Z13TAM04_AUTH_CD") ;
            Z12TAM03_APP_ID = httpContext.cgiGet( "Z12TAM03_APP_ID") ;
            Z290TAM05_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z290TAM05_CRT_DATETIME"), 0) ;
            n290TAM05_CRT_DATETIME = (GXutil.nullDate().equals(A290TAM05_CRT_DATETIME) ? true : false) ;
            Z291TAM05_CRT_USER_ID = httpContext.cgiGet( "Z291TAM05_CRT_USER_ID") ;
            n291TAM05_CRT_USER_ID = ((GXutil.strcmp("", A291TAM05_CRT_USER_ID)==0) ? true : false) ;
            Z293TAM05_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z293TAM05_UPD_DATETIME"), 0) ;
            n293TAM05_UPD_DATETIME = (GXutil.nullDate().equals(A293TAM05_UPD_DATETIME) ? true : false) ;
            Z294TAM05_UPD_USER_ID = httpContext.cgiGet( "Z294TAM05_UPD_USER_ID") ;
            n294TAM05_UPD_USER_ID = ((GXutil.strcmp("", A294TAM05_UPD_USER_ID)==0) ? true : false) ;
            Z296TAM05_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z296TAM05_UPD_CNT"), ".", ",") ;
            n296TAM05_UPD_CNT = ((0==A296TAM05_UPD_CNT) ? true : false) ;
            Z288TAM05_KNGN_FLG = httpContext.cgiGet( "Z288TAM05_KNGN_FLG") ;
            n288TAM05_KNGN_FLG = ((GXutil.strcmp("", A288TAM05_KNGN_FLG)==0) ? true : false) ;
            Z289TAM05_DEL_FLG = httpContext.cgiGet( "Z289TAM05_DEL_FLG") ;
            n289TAM05_DEL_FLG = ((GXutil.strcmp("", A289TAM05_DEL_FLG)==0) ? true : false) ;
            Z292TAM05_CRT_PROG_NM = httpContext.cgiGet( "Z292TAM05_CRT_PROG_NM") ;
            n292TAM05_CRT_PROG_NM = ((GXutil.strcmp("", A292TAM05_CRT_PROG_NM)==0) ? true : false) ;
            Z295TAM05_UPD_PROG_NM = httpContext.cgiGet( "Z295TAM05_UPD_PROG_NM") ;
            n295TAM05_UPD_PROG_NM = ((GXutil.strcmp("", A295TAM05_UPD_PROG_NM)==0) ? true : false) ;
            O296TAM05_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O296TAM05_UPD_CNT"), ".", ",") ;
            n296TAM05_UPD_CNT = ((0==A296TAM05_UPD_CNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
            AV12Pgmname = httpContext.cgiGet( "vPGMNAME") ;
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
               A13TAM04_AUTH_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
               A12TAM03_APP_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
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
                     /* Execute user event: e11092 */
                     e11092 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12092 */
                     e12092 ();
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
         /* Execute user event: e12092 */
         e12092 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll099( ) ;
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
      disableAttributes099( ) ;
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

   public void resetCaption090( )
   {
   }

   public void e11092( )
   {
      /* Start Routine */
      AV11W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11W_BC_FLG", AV11W_BC_FLG);
      if ( GXutil.strcmp(AV11W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV12Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e12092( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV12Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      AV10W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + "権限パターン区分:" + A13TAM04_AUTH_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + "アプリケーションID:" + A12TAM03_APP_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A288TAM05_KNGN_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A289TAM05_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A290TAM05_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam05_appli_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A290TAM05_CRT_DATETIME", localUtil.ttoc( A290TAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A291TAM05_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A292TAM05_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A293TAM05_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam05_appli_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A293TAM05_UPD_DATETIME", localUtil.ttoc( A293TAM05_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A294TAM05_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A295TAM05_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = GXutil.strReplace( AV10W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      new a804_pc03_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, AV10W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
   }

   public void zm099( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z290TAM05_CRT_DATETIME = T00093_A290TAM05_CRT_DATETIME[0] ;
            Z291TAM05_CRT_USER_ID = T00093_A291TAM05_CRT_USER_ID[0] ;
            Z293TAM05_UPD_DATETIME = T00093_A293TAM05_UPD_DATETIME[0] ;
            Z294TAM05_UPD_USER_ID = T00093_A294TAM05_UPD_USER_ID[0] ;
            Z296TAM05_UPD_CNT = T00093_A296TAM05_UPD_CNT[0] ;
            Z288TAM05_KNGN_FLG = T00093_A288TAM05_KNGN_FLG[0] ;
            Z289TAM05_DEL_FLG = T00093_A289TAM05_DEL_FLG[0] ;
            Z292TAM05_CRT_PROG_NM = T00093_A292TAM05_CRT_PROG_NM[0] ;
            Z295TAM05_UPD_PROG_NM = T00093_A295TAM05_UPD_PROG_NM[0] ;
         }
         else
         {
            Z290TAM05_CRT_DATETIME = A290TAM05_CRT_DATETIME ;
            Z291TAM05_CRT_USER_ID = A291TAM05_CRT_USER_ID ;
            Z293TAM05_UPD_DATETIME = A293TAM05_UPD_DATETIME ;
            Z294TAM05_UPD_USER_ID = A294TAM05_UPD_USER_ID ;
            Z296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
            Z288TAM05_KNGN_FLG = A288TAM05_KNGN_FLG ;
            Z289TAM05_DEL_FLG = A289TAM05_DEL_FLG ;
            Z292TAM05_CRT_PROG_NM = A292TAM05_CRT_PROG_NM ;
            Z295TAM05_UPD_PROG_NM = A295TAM05_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z290TAM05_CRT_DATETIME = A290TAM05_CRT_DATETIME ;
         Z291TAM05_CRT_USER_ID = A291TAM05_CRT_USER_ID ;
         Z293TAM05_UPD_DATETIME = A293TAM05_UPD_DATETIME ;
         Z294TAM05_UPD_USER_ID = A294TAM05_UPD_USER_ID ;
         Z296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
         Z288TAM05_KNGN_FLG = A288TAM05_KNGN_FLG ;
         Z289TAM05_DEL_FLG = A289TAM05_DEL_FLG ;
         Z292TAM05_CRT_PROG_NM = A292TAM05_CRT_PROG_NM ;
         Z295TAM05_UPD_PROG_NM = A295TAM05_UPD_PROG_NM ;
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
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

   public void load099( )
   {
      /* Using cursor T00096 */
      pr_default.execute(4, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A290TAM05_CRT_DATETIME = T00096_A290TAM05_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A290TAM05_CRT_DATETIME", localUtil.ttoc( A290TAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n290TAM05_CRT_DATETIME = T00096_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = T00096_A291TAM05_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291TAM05_CRT_USER_ID", A291TAM05_CRT_USER_ID);
         n291TAM05_CRT_USER_ID = T00096_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = T00096_A293TAM05_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A293TAM05_UPD_DATETIME", localUtil.ttoc( A293TAM05_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n293TAM05_UPD_DATETIME = T00096_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = T00096_A294TAM05_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A294TAM05_UPD_USER_ID", A294TAM05_UPD_USER_ID);
         n294TAM05_UPD_USER_ID = T00096_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = T00096_A296TAM05_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A296TAM05_UPD_CNT", GXutil.ltrim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)));
         n296TAM05_UPD_CNT = T00096_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = T00096_A288TAM05_KNGN_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A288TAM05_KNGN_FLG", A288TAM05_KNGN_FLG);
         n288TAM05_KNGN_FLG = T00096_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = T00096_A289TAM05_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A289TAM05_DEL_FLG", A289TAM05_DEL_FLG);
         n289TAM05_DEL_FLG = T00096_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = T00096_A292TAM05_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A292TAM05_CRT_PROG_NM", A292TAM05_CRT_PROG_NM);
         n292TAM05_CRT_PROG_NM = T00096_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = T00096_A295TAM05_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A295TAM05_UPD_PROG_NM", A295TAM05_UPD_PROG_NM);
         n295TAM05_UPD_PROG_NM = T00096_n295TAM05_UPD_PROG_NM[0] ;
         zm099( -8) ;
      }
      pr_default.close(4);
      onLoadActions099( ) ;
   }

   public void onLoadActions099( )
   {
      AV12Pgmname = "TAM05_APPLI_KNGN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
   }

   public void checkExtendedTable099( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV12Pgmname = "TAM05_APPLI_KNGN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      /* Using cursor T00094 */
      pr_default.execute(2, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'権限パターンマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM04_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
      /* Using cursor T00095 */
      pr_default.execute(3, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("'アプリケーションマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(3);
      if ( ! ( GXutil.nullDate().equals(A290TAM05_CRT_DATETIME) || (( A290TAM05_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A290TAM05_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TAM05_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM05_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A293TAM05_UPD_DATETIME) || (( A293TAM05_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A293TAM05_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TAM05_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM05_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors099( )
   {
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A13TAM04_AUTH_CD )
   {
      /* Using cursor T00094 */
      pr_default.execute(2, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'権限パターンマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM04_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(2);
   }

   public void gxload_10( String A12TAM03_APP_ID )
   {
      /* Using cursor T00095 */
      pr_default.execute(3, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_msglist.addItem("'アプリケーションマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("");
      httpContext.GX_webresponse.addString(")");
      if ( (pr_default.getStatus(3) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(3);
   }

   public void getKey099( )
   {
      /* Using cursor T00097 */
      pr_default.execute(5, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00093 */
      pr_default.execute(1, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm099( 8) ;
         RcdFound9 = (short)(1) ;
         A290TAM05_CRT_DATETIME = T00093_A290TAM05_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A290TAM05_CRT_DATETIME", localUtil.ttoc( A290TAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n290TAM05_CRT_DATETIME = T00093_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = T00093_A291TAM05_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A291TAM05_CRT_USER_ID", A291TAM05_CRT_USER_ID);
         n291TAM05_CRT_USER_ID = T00093_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = T00093_A293TAM05_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A293TAM05_UPD_DATETIME", localUtil.ttoc( A293TAM05_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n293TAM05_UPD_DATETIME = T00093_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = T00093_A294TAM05_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A294TAM05_UPD_USER_ID", A294TAM05_UPD_USER_ID);
         n294TAM05_UPD_USER_ID = T00093_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = T00093_A296TAM05_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A296TAM05_UPD_CNT", GXutil.ltrim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)));
         n296TAM05_UPD_CNT = T00093_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = T00093_A288TAM05_KNGN_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A288TAM05_KNGN_FLG", A288TAM05_KNGN_FLG);
         n288TAM05_KNGN_FLG = T00093_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = T00093_A289TAM05_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A289TAM05_DEL_FLG", A289TAM05_DEL_FLG);
         n289TAM05_DEL_FLG = T00093_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = T00093_A292TAM05_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A292TAM05_CRT_PROG_NM", A292TAM05_CRT_PROG_NM);
         n292TAM05_CRT_PROG_NM = T00093_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = T00093_A295TAM05_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A295TAM05_UPD_PROG_NM", A295TAM05_UPD_PROG_NM);
         n295TAM05_UPD_PROG_NM = T00093_n295TAM05_UPD_PROG_NM[0] ;
         A13TAM04_AUTH_CD = T00093_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
         A12TAM03_APP_ID = T00093_A12TAM03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
         O296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
         n296TAM05_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A296TAM05_UPD_CNT", GXutil.ltrim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)));
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load099( ) ;
         if ( AnyError == 1 )
         {
            RcdFound9 = (short)(0) ;
            initializeNonKey099( ) ;
         }
         Gx_mode = sMode9 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound9 = (short)(0) ;
         initializeNonKey099( ) ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode9 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey099( ) ;
      if ( RcdFound9 == 0 )
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
      RcdFound9 = (short)(0) ;
      /* Using cursor T00098 */
      pr_default.execute(6, new Object[] {A13TAM04_AUTH_CD, A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00098_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) < 0 ) || ( GXutil.strcmp(T00098_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) == 0 ) && ( GXutil.strcmp(T00098_A12TAM03_APP_ID[0], A12TAM03_APP_ID) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T00098_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) > 0 ) || ( GXutil.strcmp(T00098_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) == 0 ) && ( GXutil.strcmp(T00098_A12TAM03_APP_ID[0], A12TAM03_APP_ID) > 0 ) ) )
         {
            A13TAM04_AUTH_CD = T00098_A13TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
            A12TAM03_APP_ID = T00098_A12TAM03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
            RcdFound9 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound9 = (short)(0) ;
      /* Using cursor T00099 */
      pr_default.execute(7, new Object[] {A13TAM04_AUTH_CD, A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00099_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) > 0 ) || ( GXutil.strcmp(T00099_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) == 0 ) && ( GXutil.strcmp(T00099_A12TAM03_APP_ID[0], A12TAM03_APP_ID) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T00099_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) < 0 ) || ( GXutil.strcmp(T00099_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) == 0 ) && ( GXutil.strcmp(T00099_A12TAM03_APP_ID[0], A12TAM03_APP_ID) < 0 ) ) )
         {
            A13TAM04_AUTH_CD = T00099_A13TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
            A12TAM03_APP_ID = T00099_A12TAM03_APP_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
            RcdFound9 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey099( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert099( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound9 == 1 )
         {
            if ( ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 ) || ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 ) )
            {
               A13TAM04_AUTH_CD = Z13TAM04_AUTH_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
               A12TAM03_APP_ID = Z12TAM03_APP_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TAM04_AUTH_CD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update099( ) ;
               GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 ) || ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert099( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM04_AUTH_CD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert099( ) ;
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
      if ( ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 ) || ( GXutil.strcmp(A12TAM03_APP_ID, Z12TAM03_APP_ID) != 0 ) )
      {
         A13TAM04_AUTH_CD = Z13TAM04_AUTH_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
         A12TAM03_APP_ID = Z12TAM03_APP_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TAM04_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
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
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM04_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTAM05_KNGN_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart099( ) ;
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM05_KNGN_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd099( ) ;
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
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM05_KNGN_FLG_Internalname ;
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
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM05_KNGN_FLG_Internalname ;
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
      scanStart099( ) ;
      if ( RcdFound9 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound9 != 0 )
         {
            scanNext099( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM05_KNGN_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd099( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency099( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00092 */
         pr_default.execute(0, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM05_APPLI_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z290TAM05_CRT_DATETIME.equals( T00092_A290TAM05_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z291TAM05_CRT_USER_ID, T00092_A291TAM05_CRT_USER_ID[0]) != 0 ) || !( Z293TAM05_UPD_DATETIME.equals( T00092_A293TAM05_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z294TAM05_UPD_USER_ID, T00092_A294TAM05_UPD_USER_ID[0]) != 0 ) || ( Z296TAM05_UPD_CNT != T00092_A296TAM05_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z288TAM05_KNGN_FLG, T00092_A288TAM05_KNGN_FLG[0]) != 0 ) || ( GXutil.strcmp(Z289TAM05_DEL_FLG, T00092_A289TAM05_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z292TAM05_CRT_PROG_NM, T00092_A292TAM05_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z295TAM05_UPD_PROG_NM, T00092_A295TAM05_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM05_APPLI_KNGN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert099( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable099( ) ;
      }
      if ( AnyError == 0 )
      {
         zm099( 0) ;
         checkOptimisticConcurrency099( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm099( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert099( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000910 */
                  pr_default.execute(8, new Object[] {new Boolean(n290TAM05_CRT_DATETIME), A290TAM05_CRT_DATETIME, new Boolean(n291TAM05_CRT_USER_ID), A291TAM05_CRT_USER_ID, new Boolean(n293TAM05_UPD_DATETIME), A293TAM05_UPD_DATETIME, new Boolean(n294TAM05_UPD_USER_ID), A294TAM05_UPD_USER_ID, new Boolean(n296TAM05_UPD_CNT), new Long(A296TAM05_UPD_CNT), new Boolean(n288TAM05_KNGN_FLG), A288TAM05_KNGN_FLG, new Boolean(n289TAM05_DEL_FLG), A289TAM05_DEL_FLG, new Boolean(n292TAM05_CRT_PROG_NM), A292TAM05_CRT_PROG_NM, new Boolean(n295TAM05_UPD_PROG_NM), A295TAM05_UPD_PROG_NM, A13TAM04_AUTH_CD, A12TAM03_APP_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                        resetCaption090( ) ;
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
            load099( ) ;
         }
         endLevel099( ) ;
      }
      closeExtendedTableCursors099( ) ;
   }

   public void update099( )
   {
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable099( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency099( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm099( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate099( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000911 */
                  pr_default.execute(9, new Object[] {new Boolean(n290TAM05_CRT_DATETIME), A290TAM05_CRT_DATETIME, new Boolean(n291TAM05_CRT_USER_ID), A291TAM05_CRT_USER_ID, new Boolean(n293TAM05_UPD_DATETIME), A293TAM05_UPD_DATETIME, new Boolean(n294TAM05_UPD_USER_ID), A294TAM05_UPD_USER_ID, new Boolean(n296TAM05_UPD_CNT), new Long(A296TAM05_UPD_CNT), new Boolean(n288TAM05_KNGN_FLG), A288TAM05_KNGN_FLG, new Boolean(n289TAM05_DEL_FLG), A289TAM05_DEL_FLG, new Boolean(n292TAM05_CRT_PROG_NM), A292TAM05_CRT_PROG_NM, new Boolean(n295TAM05_UPD_PROG_NM), A295TAM05_UPD_PROG_NM, A13TAM04_AUTH_CD, A12TAM03_APP_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
                  if ( (pr_default.getStatus(9) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM05_APPLI_KNGN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate099( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption090( ) ;
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
         endLevel099( ) ;
      }
      closeExtendedTableCursors099( ) ;
   }

   public void deferredUpdate099( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate099( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency099( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls099( ) ;
         afterConfirm099( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete099( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000912 */
               pr_default.execute(10, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound9 == 0 )
                     {
                        initAll099( ) ;
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
                     resetCaption090( ) ;
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
      sMode9 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel099( ) ;
      Gx_mode = sMode9 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls099( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV12Pgmname = "TAM05_APPLI_KNGN" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      }
   }

   public void endLevel099( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete099( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tam05_appli_kngn");
         if ( AnyError == 0 )
         {
            confirmValues090( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tam05_appli_kngn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart099( )
   {
      /* Scan By routine */
      /* Using cursor T000913 */
      pr_default.execute(11);
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A13TAM04_AUTH_CD = T000913_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
         A12TAM03_APP_ID = T000913_A12TAM03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext099( )
   {
      /* Scan next routine */
      pr_default.readNext(11);
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(11) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A13TAM04_AUTH_CD = T000913_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
         A12TAM03_APP_ID = T000913_A12TAM03_APP_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
      }
   }

   public void scanEnd099( )
   {
      pr_default.close(11);
   }

   public void afterConfirm099( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert099( )
   {
      /* Before Insert Rules */
      A290TAM05_CRT_DATETIME = GXutil.now( ) ;
      n290TAM05_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A290TAM05_CRT_DATETIME", localUtil.ttoc( A290TAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A291TAM05_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam05_appli_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A291TAM05_CRT_USER_ID = GXt_char1 ;
      n291TAM05_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A291TAM05_CRT_USER_ID", A291TAM05_CRT_USER_ID);
      A293TAM05_UPD_DATETIME = GXutil.now( ) ;
      n293TAM05_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A293TAM05_UPD_DATETIME", localUtil.ttoc( A293TAM05_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A294TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam05_appli_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A294TAM05_UPD_USER_ID = GXt_char1 ;
      n294TAM05_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A294TAM05_UPD_USER_ID", A294TAM05_UPD_USER_ID);
      A296TAM05_UPD_CNT = (long)(O296TAM05_UPD_CNT+1) ;
      n296TAM05_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A296TAM05_UPD_CNT", GXutil.ltrim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate099( )
   {
      /* Before Update Rules */
      A293TAM05_UPD_DATETIME = GXutil.now( ) ;
      n293TAM05_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A293TAM05_UPD_DATETIME", localUtil.ttoc( A293TAM05_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A294TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam05_appli_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A294TAM05_UPD_USER_ID = GXt_char1 ;
      n294TAM05_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A294TAM05_UPD_USER_ID", A294TAM05_UPD_USER_ID);
      A296TAM05_UPD_CNT = (long)(O296TAM05_UPD_CNT+1) ;
      n296TAM05_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A296TAM05_UPD_CNT", GXutil.ltrim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)));
   }

   public void beforeDelete099( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete099( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate099( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes099( )
   {
      edtTAM04_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_AUTH_CD_Enabled, 5, 0)));
      edtTAM03_APP_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM03_APP_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM03_APP_ID_Enabled, 5, 0)));
      edtTAM05_KNGN_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM05_KNGN_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM05_KNGN_FLG_Enabled, 5, 0)));
      edtTAM05_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM05_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM05_DEL_FLG_Enabled, 5, 0)));
      edtTAM05_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM05_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM05_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM05_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM05_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM05_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM05_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM05_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM05_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM05_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM05_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM05_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM05_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM05_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM05_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM05_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM05_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM05_UPD_PROG_NM_Enabled, 5, 0)));
      edtTAM05_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM05_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM05_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues090( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "アプリケーション権限マスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20207151318419");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tam05_appli_kngn") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm099( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z13TAM04_AUTH_CD", GXutil.rtrim( Z13TAM04_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z12TAM03_APP_ID", GXutil.rtrim( Z12TAM03_APP_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z290TAM05_CRT_DATETIME", localUtil.ttoc( Z290TAM05_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z291TAM05_CRT_USER_ID", GXutil.rtrim( Z291TAM05_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z293TAM05_UPD_DATETIME", localUtil.ttoc( Z293TAM05_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z294TAM05_UPD_USER_ID", GXutil.rtrim( Z294TAM05_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z296TAM05_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z288TAM05_KNGN_FLG", GXutil.rtrim( Z288TAM05_KNGN_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z289TAM05_DEL_FLG", GXutil.rtrim( Z289TAM05_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z292TAM05_CRT_PROG_NM", GXutil.rtrim( Z292TAM05_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z295TAM05_UPD_PROG_NM", GXutil.rtrim( Z295TAM05_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O296TAM05_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
      GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV12Pgmname));
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
      return "TAM05_APPLI_KNGN" ;
   }

   public String getPgmdesc( )
   {
      return "アプリケーション権限マスタ" ;
   }

   public void initializeNonKey099( )
   {
      A290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n290TAM05_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A290TAM05_CRT_DATETIME", localUtil.ttoc( A290TAM05_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n290TAM05_CRT_DATETIME = (GXutil.nullDate().equals(A290TAM05_CRT_DATETIME) ? true : false) ;
      A291TAM05_CRT_USER_ID = "" ;
      n291TAM05_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A291TAM05_CRT_USER_ID", A291TAM05_CRT_USER_ID);
      n291TAM05_CRT_USER_ID = ((GXutil.strcmp("", A291TAM05_CRT_USER_ID)==0) ? true : false) ;
      A293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n293TAM05_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A293TAM05_UPD_DATETIME", localUtil.ttoc( A293TAM05_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n293TAM05_UPD_DATETIME = (GXutil.nullDate().equals(A293TAM05_UPD_DATETIME) ? true : false) ;
      A294TAM05_UPD_USER_ID = "" ;
      n294TAM05_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A294TAM05_UPD_USER_ID", A294TAM05_UPD_USER_ID);
      n294TAM05_UPD_USER_ID = ((GXutil.strcmp("", A294TAM05_UPD_USER_ID)==0) ? true : false) ;
      A296TAM05_UPD_CNT = 0 ;
      n296TAM05_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A296TAM05_UPD_CNT", GXutil.ltrim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)));
      n296TAM05_UPD_CNT = ((0==A296TAM05_UPD_CNT) ? true : false) ;
      A288TAM05_KNGN_FLG = "" ;
      n288TAM05_KNGN_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A288TAM05_KNGN_FLG", A288TAM05_KNGN_FLG);
      n288TAM05_KNGN_FLG = ((GXutil.strcmp("", A288TAM05_KNGN_FLG)==0) ? true : false) ;
      A289TAM05_DEL_FLG = "" ;
      n289TAM05_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A289TAM05_DEL_FLG", A289TAM05_DEL_FLG);
      n289TAM05_DEL_FLG = ((GXutil.strcmp("", A289TAM05_DEL_FLG)==0) ? true : false) ;
      A292TAM05_CRT_PROG_NM = "" ;
      n292TAM05_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A292TAM05_CRT_PROG_NM", A292TAM05_CRT_PROG_NM);
      n292TAM05_CRT_PROG_NM = ((GXutil.strcmp("", A292TAM05_CRT_PROG_NM)==0) ? true : false) ;
      A295TAM05_UPD_PROG_NM = "" ;
      n295TAM05_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A295TAM05_UPD_PROG_NM", A295TAM05_UPD_PROG_NM);
      n295TAM05_UPD_PROG_NM = ((GXutil.strcmp("", A295TAM05_UPD_PROG_NM)==0) ? true : false) ;
      O296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
      n296TAM05_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A296TAM05_UPD_CNT", GXutil.ltrim( GXutil.str( A296TAM05_UPD_CNT, 10, 0)));
   }

   public void initAll099( )
   {
      A13TAM04_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
      A12TAM03_APP_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A12TAM03_APP_ID", A12TAM03_APP_ID);
      initializeNonKey099( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?1830155");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?1316731");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513184114");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tam05_appli_kngn.js", "?202071513184114");
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
      lblTextblocktam04_auth_cd_Internalname = "TEXTBLOCKTAM04_AUTH_CD" ;
      edtTAM04_AUTH_CD_Internalname = "TAM04_AUTH_CD" ;
      lblTextblocktam03_app_id_Internalname = "TEXTBLOCKTAM03_APP_ID" ;
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID" ;
      lblTextblocktam05_kngn_flg_Internalname = "TEXTBLOCKTAM05_KNGN_FLG" ;
      edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG" ;
      lblTextblocktam05_del_flg_Internalname = "TEXTBLOCKTAM05_DEL_FLG" ;
      edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG" ;
      lblTextblocktam05_crt_datetime_Internalname = "TEXTBLOCKTAM05_CRT_DATETIME" ;
      edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME" ;
      lblTextblocktam05_crt_user_id_Internalname = "TEXTBLOCKTAM05_CRT_USER_ID" ;
      edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID" ;
      lblTextblocktam05_crt_prog_nm_Internalname = "TEXTBLOCKTAM05_CRT_PROG_NM" ;
      edtTAM05_CRT_PROG_NM_Internalname = "TAM05_CRT_PROG_NM" ;
      lblTextblocktam05_upd_datetime_Internalname = "TEXTBLOCKTAM05_UPD_DATETIME" ;
      edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME" ;
      lblTextblocktam05_upd_user_id_Internalname = "TEXTBLOCKTAM05_UPD_USER_ID" ;
      edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID" ;
      lblTextblocktam05_upd_prog_nm_Internalname = "TEXTBLOCKTAM05_UPD_PROG_NM" ;
      edtTAM05_UPD_PROG_NM_Internalname = "TAM05_UPD_PROG_NM" ;
      lblTextblocktam05_upd_cnt_Internalname = "TEXTBLOCKTAM05_UPD_CNT" ;
      edtTAM05_UPD_CNT_Internalname = "TAM05_UPD_CNT" ;
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
      edtTAM05_UPD_CNT_Jsonclick = "" ;
      edtTAM05_UPD_CNT_Enabled = 1 ;
      edtTAM05_UPD_PROG_NM_Jsonclick = "" ;
      edtTAM05_UPD_PROG_NM_Enabled = 1 ;
      edtTAM05_UPD_USER_ID_Jsonclick = "" ;
      edtTAM05_UPD_USER_ID_Enabled = 1 ;
      edtTAM05_UPD_DATETIME_Jsonclick = "" ;
      edtTAM05_UPD_DATETIME_Enabled = 1 ;
      edtTAM05_CRT_PROG_NM_Jsonclick = "" ;
      edtTAM05_CRT_PROG_NM_Enabled = 1 ;
      edtTAM05_CRT_USER_ID_Jsonclick = "" ;
      edtTAM05_CRT_USER_ID_Enabled = 1 ;
      edtTAM05_CRT_DATETIME_Jsonclick = "" ;
      edtTAM05_CRT_DATETIME_Enabled = 1 ;
      edtTAM05_DEL_FLG_Jsonclick = "" ;
      edtTAM05_DEL_FLG_Enabled = 1 ;
      edtTAM05_KNGN_FLG_Jsonclick = "" ;
      edtTAM05_KNGN_FLG_Enabled = 1 ;
      edtTAM03_APP_ID_Jsonclick = "" ;
      edtTAM03_APP_ID_Enabled = 1 ;
      edtTAM04_AUTH_CD_Jsonclick = "" ;
      edtTAM04_AUTH_CD_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatam05_crt_user_id099( String Gx_mode )
   {
      GXt_char1 = A291TAM05_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam05_appli_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A291TAM05_CRT_USER_ID = GXt_char1 ;
      n291TAM05_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A291TAM05_CRT_USER_ID", A291TAM05_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A291TAM05_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatam05_upd_user_id099( String Gx_mode )
   {
      GXt_char1 = A294TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam05_appli_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A294TAM05_UPD_USER_ID = GXt_char1 ;
      n294TAM05_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A294TAM05_UPD_USER_ID", A294TAM05_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A294TAM05_UPD_USER_ID))+"\"");
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
      /* Using cursor T000914 */
      pr_default.execute(12, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("'権限パターンマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM04_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(12);
      /* Using cursor T000915 */
      pr_default.execute(13, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("'アプリケーションマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(13);
      GX_FocusControl = edtTAM05_KNGN_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tam04_auth_cd( String GX_Parm1 )
   {
      A13TAM04_AUTH_CD = GX_Parm1 ;
      /* Using cursor T000914 */
      pr_default.execute(12, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(12) == 101) )
      {
         httpContext.GX_msglist.addItem("'権限パターンマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM04_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
      }
      pr_default.close(12);
      dynload_actions( ) ;
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tam03_app_id( String GX_Parm1 ,
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
      A13TAM04_AUTH_CD = GX_Parm1 ;
      A12TAM03_APP_ID = GX_Parm2 ;
      A290TAM05_CRT_DATETIME = GX_Parm3 ;
      n290TAM05_CRT_DATETIME = false ;
      A291TAM05_CRT_USER_ID = GX_Parm4 ;
      n291TAM05_CRT_USER_ID = false ;
      A293TAM05_UPD_DATETIME = GX_Parm5 ;
      n293TAM05_UPD_DATETIME = false ;
      A294TAM05_UPD_USER_ID = GX_Parm6 ;
      n294TAM05_UPD_USER_ID = false ;
      A296TAM05_UPD_CNT = GX_Parm7 ;
      n296TAM05_UPD_CNT = false ;
      A288TAM05_KNGN_FLG = GX_Parm8 ;
      n288TAM05_KNGN_FLG = false ;
      A289TAM05_DEL_FLG = GX_Parm9 ;
      n289TAM05_DEL_FLG = false ;
      A292TAM05_CRT_PROG_NM = GX_Parm10 ;
      n292TAM05_CRT_PROG_NM = false ;
      A295TAM05_UPD_PROG_NM = GX_Parm11 ;
      n295TAM05_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      /* Using cursor T000915 */
      pr_default.execute(13, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(13) == 101) )
      {
         httpContext.GX_msglist.addItem("'アプリケーションマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
      }
      pr_default.close(13);
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A290TAM05_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A291TAM05_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A293TAM05_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A294TAM05_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A288TAM05_KNGN_FLG));
      isValidOutput.add(GXutil.rtrim( A289TAM05_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A292TAM05_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A295TAM05_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV12Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z13TAM04_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z12TAM03_APP_ID));
      isValidOutput.add(localUtil.ttoc( Z290TAM05_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z291TAM05_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z293TAM05_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z294TAM05_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z288TAM05_KNGN_FLG));
      isValidOutput.add(GXutil.rtrim( Z289TAM05_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z292TAM05_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z295TAM05_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV12Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      pr_default.close(12);
      pr_default.close(13);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z13TAM04_AUTH_CD = "" ;
      Z12TAM03_APP_ID = "" ;
      Z290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z291TAM05_CRT_USER_ID = "" ;
      Z293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z294TAM05_UPD_USER_ID = "" ;
      Z288TAM05_KNGN_FLG = "" ;
      Z289TAM05_DEL_FLG = "" ;
      Z292TAM05_CRT_PROG_NM = "" ;
      Z295TAM05_UPD_PROG_NM = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A13TAM04_AUTH_CD = "" ;
      A12TAM03_APP_ID = "" ;
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
      lblTextblocktam04_auth_cd_Jsonclick = "" ;
      lblTextblocktam03_app_id_Jsonclick = "" ;
      lblTextblocktam05_kngn_flg_Jsonclick = "" ;
      A288TAM05_KNGN_FLG = "" ;
      lblTextblocktam05_del_flg_Jsonclick = "" ;
      A289TAM05_DEL_FLG = "" ;
      lblTextblocktam05_crt_datetime_Jsonclick = "" ;
      A290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam05_crt_user_id_Jsonclick = "" ;
      A291TAM05_CRT_USER_ID = "" ;
      lblTextblocktam05_crt_prog_nm_Jsonclick = "" ;
      A292TAM05_CRT_PROG_NM = "" ;
      lblTextblocktam05_upd_datetime_Jsonclick = "" ;
      A293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam05_upd_user_id_Jsonclick = "" ;
      A294TAM05_UPD_USER_ID = "" ;
      lblTextblocktam05_upd_prog_nm_Jsonclick = "" ;
      A295TAM05_UPD_PROG_NM = "" ;
      lblTextblocktam05_upd_cnt_Jsonclick = "" ;
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
      AV12Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV11W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV10W_TXT = "" ;
      T00096_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00096_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      T00096_A291TAM05_CRT_USER_ID = new String[] {""} ;
      T00096_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      T00096_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00096_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      T00096_A294TAM05_UPD_USER_ID = new String[] {""} ;
      T00096_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      T00096_A296TAM05_UPD_CNT = new long[1] ;
      T00096_n296TAM05_UPD_CNT = new boolean[] {false} ;
      T00096_A288TAM05_KNGN_FLG = new String[] {""} ;
      T00096_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      T00096_A289TAM05_DEL_FLG = new String[] {""} ;
      T00096_n289TAM05_DEL_FLG = new boolean[] {false} ;
      T00096_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      T00096_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      T00096_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      T00096_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      T00096_A13TAM04_AUTH_CD = new String[] {""} ;
      T00096_A12TAM03_APP_ID = new String[] {""} ;
      T00094_A13TAM04_AUTH_CD = new String[] {""} ;
      T00095_A12TAM03_APP_ID = new String[] {""} ;
      T00097_A13TAM04_AUTH_CD = new String[] {""} ;
      T00097_A12TAM03_APP_ID = new String[] {""} ;
      T00093_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00093_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      T00093_A291TAM05_CRT_USER_ID = new String[] {""} ;
      T00093_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      T00093_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00093_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      T00093_A294TAM05_UPD_USER_ID = new String[] {""} ;
      T00093_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      T00093_A296TAM05_UPD_CNT = new long[1] ;
      T00093_n296TAM05_UPD_CNT = new boolean[] {false} ;
      T00093_A288TAM05_KNGN_FLG = new String[] {""} ;
      T00093_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      T00093_A289TAM05_DEL_FLG = new String[] {""} ;
      T00093_n289TAM05_DEL_FLG = new boolean[] {false} ;
      T00093_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      T00093_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      T00093_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      T00093_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      T00093_A13TAM04_AUTH_CD = new String[] {""} ;
      T00093_A12TAM03_APP_ID = new String[] {""} ;
      sMode9 = "" ;
      T00098_A13TAM04_AUTH_CD = new String[] {""} ;
      T00098_A12TAM03_APP_ID = new String[] {""} ;
      T00099_A13TAM04_AUTH_CD = new String[] {""} ;
      T00099_A12TAM03_APP_ID = new String[] {""} ;
      T00092_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00092_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      T00092_A291TAM05_CRT_USER_ID = new String[] {""} ;
      T00092_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      T00092_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00092_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      T00092_A294TAM05_UPD_USER_ID = new String[] {""} ;
      T00092_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      T00092_A296TAM05_UPD_CNT = new long[1] ;
      T00092_n296TAM05_UPD_CNT = new boolean[] {false} ;
      T00092_A288TAM05_KNGN_FLG = new String[] {""} ;
      T00092_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      T00092_A289TAM05_DEL_FLG = new String[] {""} ;
      T00092_n289TAM05_DEL_FLG = new boolean[] {false} ;
      T00092_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      T00092_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      T00092_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      T00092_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      T00092_A13TAM04_AUTH_CD = new String[] {""} ;
      T00092_A12TAM03_APP_ID = new String[] {""} ;
      T000913_A13TAM04_AUTH_CD = new String[] {""} ;
      T000913_A12TAM03_APP_ID = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      T000914_A13TAM04_AUTH_CD = new String[] {""} ;
      T000915_A12TAM03_APP_ID = new String[] {""} ;
      ZV12Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new tam05_appli_kngn__default(),
         new Object[] {
             new Object[] {
            T00092_A290TAM05_CRT_DATETIME, T00092_n290TAM05_CRT_DATETIME, T00092_A291TAM05_CRT_USER_ID, T00092_n291TAM05_CRT_USER_ID, T00092_A293TAM05_UPD_DATETIME, T00092_n293TAM05_UPD_DATETIME, T00092_A294TAM05_UPD_USER_ID, T00092_n294TAM05_UPD_USER_ID, T00092_A296TAM05_UPD_CNT, T00092_n296TAM05_UPD_CNT,
            T00092_A288TAM05_KNGN_FLG, T00092_n288TAM05_KNGN_FLG, T00092_A289TAM05_DEL_FLG, T00092_n289TAM05_DEL_FLG, T00092_A292TAM05_CRT_PROG_NM, T00092_n292TAM05_CRT_PROG_NM, T00092_A295TAM05_UPD_PROG_NM, T00092_n295TAM05_UPD_PROG_NM, T00092_A13TAM04_AUTH_CD, T00092_A12TAM03_APP_ID
            }
            , new Object[] {
            T00093_A290TAM05_CRT_DATETIME, T00093_n290TAM05_CRT_DATETIME, T00093_A291TAM05_CRT_USER_ID, T00093_n291TAM05_CRT_USER_ID, T00093_A293TAM05_UPD_DATETIME, T00093_n293TAM05_UPD_DATETIME, T00093_A294TAM05_UPD_USER_ID, T00093_n294TAM05_UPD_USER_ID, T00093_A296TAM05_UPD_CNT, T00093_n296TAM05_UPD_CNT,
            T00093_A288TAM05_KNGN_FLG, T00093_n288TAM05_KNGN_FLG, T00093_A289TAM05_DEL_FLG, T00093_n289TAM05_DEL_FLG, T00093_A292TAM05_CRT_PROG_NM, T00093_n292TAM05_CRT_PROG_NM, T00093_A295TAM05_UPD_PROG_NM, T00093_n295TAM05_UPD_PROG_NM, T00093_A13TAM04_AUTH_CD, T00093_A12TAM03_APP_ID
            }
            , new Object[] {
            T00094_A13TAM04_AUTH_CD
            }
            , new Object[] {
            T00095_A12TAM03_APP_ID
            }
            , new Object[] {
            T00096_A290TAM05_CRT_DATETIME, T00096_n290TAM05_CRT_DATETIME, T00096_A291TAM05_CRT_USER_ID, T00096_n291TAM05_CRT_USER_ID, T00096_A293TAM05_UPD_DATETIME, T00096_n293TAM05_UPD_DATETIME, T00096_A294TAM05_UPD_USER_ID, T00096_n294TAM05_UPD_USER_ID, T00096_A296TAM05_UPD_CNT, T00096_n296TAM05_UPD_CNT,
            T00096_A288TAM05_KNGN_FLG, T00096_n288TAM05_KNGN_FLG, T00096_A289TAM05_DEL_FLG, T00096_n289TAM05_DEL_FLG, T00096_A292TAM05_CRT_PROG_NM, T00096_n292TAM05_CRT_PROG_NM, T00096_A295TAM05_UPD_PROG_NM, T00096_n295TAM05_UPD_PROG_NM, T00096_A13TAM04_AUTH_CD, T00096_A12TAM03_APP_ID
            }
            , new Object[] {
            T00097_A13TAM04_AUTH_CD, T00097_A12TAM03_APP_ID
            }
            , new Object[] {
            T00098_A13TAM04_AUTH_CD, T00098_A12TAM03_APP_ID
            }
            , new Object[] {
            T00099_A13TAM04_AUTH_CD, T00099_A12TAM03_APP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000913_A13TAM04_AUTH_CD, T000913_A12TAM03_APP_ID
            }
            , new Object[] {
            T000914_A13TAM04_AUTH_CD
            }
            , new Object[] {
            T000915_A12TAM03_APP_ID
            }
         }
      );
      AV12Pgmname = "TAM05_APPLI_KNGN" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound9 ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTAM04_AUTH_CD_Enabled ;
   private int edtTAM03_APP_ID_Enabled ;
   private int edtTAM05_KNGN_FLG_Enabled ;
   private int edtTAM05_DEL_FLG_Enabled ;
   private int edtTAM05_CRT_DATETIME_Enabled ;
   private int edtTAM05_CRT_USER_ID_Enabled ;
   private int edtTAM05_CRT_PROG_NM_Enabled ;
   private int edtTAM05_UPD_DATETIME_Enabled ;
   private int edtTAM05_UPD_USER_ID_Enabled ;
   private int edtTAM05_UPD_PROG_NM_Enabled ;
   private int edtTAM05_UPD_CNT_Enabled ;
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
   private long Z296TAM05_UPD_CNT ;
   private long O296TAM05_UPD_CNT ;
   private long A296TAM05_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTAM04_AUTH_CD_Internalname ;
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
   private String lblTextblocktam04_auth_cd_Internalname ;
   private String lblTextblocktam04_auth_cd_Jsonclick ;
   private String edtTAM04_AUTH_CD_Jsonclick ;
   private String lblTextblocktam03_app_id_Internalname ;
   private String lblTextblocktam03_app_id_Jsonclick ;
   private String edtTAM03_APP_ID_Internalname ;
   private String edtTAM03_APP_ID_Jsonclick ;
   private String lblTextblocktam05_kngn_flg_Internalname ;
   private String lblTextblocktam05_kngn_flg_Jsonclick ;
   private String edtTAM05_KNGN_FLG_Internalname ;
   private String edtTAM05_KNGN_FLG_Jsonclick ;
   private String lblTextblocktam05_del_flg_Internalname ;
   private String lblTextblocktam05_del_flg_Jsonclick ;
   private String edtTAM05_DEL_FLG_Internalname ;
   private String edtTAM05_DEL_FLG_Jsonclick ;
   private String lblTextblocktam05_crt_datetime_Internalname ;
   private String lblTextblocktam05_crt_datetime_Jsonclick ;
   private String edtTAM05_CRT_DATETIME_Internalname ;
   private String edtTAM05_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktam05_crt_user_id_Internalname ;
   private String lblTextblocktam05_crt_user_id_Jsonclick ;
   private String edtTAM05_CRT_USER_ID_Internalname ;
   private String edtTAM05_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktam05_crt_prog_nm_Internalname ;
   private String lblTextblocktam05_crt_prog_nm_Jsonclick ;
   private String edtTAM05_CRT_PROG_NM_Internalname ;
   private String edtTAM05_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktam05_upd_datetime_Internalname ;
   private String lblTextblocktam05_upd_datetime_Jsonclick ;
   private String edtTAM05_UPD_DATETIME_Internalname ;
   private String edtTAM05_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktam05_upd_user_id_Internalname ;
   private String lblTextblocktam05_upd_user_id_Jsonclick ;
   private String edtTAM05_UPD_USER_ID_Internalname ;
   private String edtTAM05_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktam05_upd_prog_nm_Internalname ;
   private String lblTextblocktam05_upd_prog_nm_Jsonclick ;
   private String edtTAM05_UPD_PROG_NM_Internalname ;
   private String edtTAM05_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktam05_upd_cnt_Internalname ;
   private String lblTextblocktam05_upd_cnt_Jsonclick ;
   private String edtTAM05_UPD_CNT_Internalname ;
   private String edtTAM05_UPD_CNT_Jsonclick ;
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
   private String AV12Pgmname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXEncryptionTmp ;
   private String sMode9 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV12Pgmname ;
   private java.util.Date Z290TAM05_CRT_DATETIME ;
   private java.util.Date Z293TAM05_UPD_DATETIME ;
   private java.util.Date A290TAM05_CRT_DATETIME ;
   private java.util.Date A293TAM05_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n288TAM05_KNGN_FLG ;
   private boolean n289TAM05_DEL_FLG ;
   private boolean n290TAM05_CRT_DATETIME ;
   private boolean n291TAM05_CRT_USER_ID ;
   private boolean n292TAM05_CRT_PROG_NM ;
   private boolean n293TAM05_UPD_DATETIME ;
   private boolean n294TAM05_UPD_USER_ID ;
   private boolean n295TAM05_UPD_PROG_NM ;
   private boolean n296TAM05_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z13TAM04_AUTH_CD ;
   private String Z12TAM03_APP_ID ;
   private String Z291TAM05_CRT_USER_ID ;
   private String Z294TAM05_UPD_USER_ID ;
   private String Z288TAM05_KNGN_FLG ;
   private String Z289TAM05_DEL_FLG ;
   private String Z292TAM05_CRT_PROG_NM ;
   private String Z295TAM05_UPD_PROG_NM ;
   private String A13TAM04_AUTH_CD ;
   private String A12TAM03_APP_ID ;
   private String A288TAM05_KNGN_FLG ;
   private String A289TAM05_DEL_FLG ;
   private String A291TAM05_CRT_USER_ID ;
   private String A292TAM05_CRT_PROG_NM ;
   private String A294TAM05_UPD_USER_ID ;
   private String A295TAM05_UPD_PROG_NM ;
   private String AV11W_BC_FLG ;
   private String AV10W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] T00096_A290TAM05_CRT_DATETIME ;
   private boolean[] T00096_n290TAM05_CRT_DATETIME ;
   private String[] T00096_A291TAM05_CRT_USER_ID ;
   private boolean[] T00096_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] T00096_A293TAM05_UPD_DATETIME ;
   private boolean[] T00096_n293TAM05_UPD_DATETIME ;
   private String[] T00096_A294TAM05_UPD_USER_ID ;
   private boolean[] T00096_n294TAM05_UPD_USER_ID ;
   private long[] T00096_A296TAM05_UPD_CNT ;
   private boolean[] T00096_n296TAM05_UPD_CNT ;
   private String[] T00096_A288TAM05_KNGN_FLG ;
   private boolean[] T00096_n288TAM05_KNGN_FLG ;
   private String[] T00096_A289TAM05_DEL_FLG ;
   private boolean[] T00096_n289TAM05_DEL_FLG ;
   private String[] T00096_A292TAM05_CRT_PROG_NM ;
   private boolean[] T00096_n292TAM05_CRT_PROG_NM ;
   private String[] T00096_A295TAM05_UPD_PROG_NM ;
   private boolean[] T00096_n295TAM05_UPD_PROG_NM ;
   private String[] T00096_A13TAM04_AUTH_CD ;
   private String[] T00096_A12TAM03_APP_ID ;
   private String[] T00094_A13TAM04_AUTH_CD ;
   private String[] T00095_A12TAM03_APP_ID ;
   private String[] T00097_A13TAM04_AUTH_CD ;
   private String[] T00097_A12TAM03_APP_ID ;
   private java.util.Date[] T00093_A290TAM05_CRT_DATETIME ;
   private boolean[] T00093_n290TAM05_CRT_DATETIME ;
   private String[] T00093_A291TAM05_CRT_USER_ID ;
   private boolean[] T00093_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] T00093_A293TAM05_UPD_DATETIME ;
   private boolean[] T00093_n293TAM05_UPD_DATETIME ;
   private String[] T00093_A294TAM05_UPD_USER_ID ;
   private boolean[] T00093_n294TAM05_UPD_USER_ID ;
   private long[] T00093_A296TAM05_UPD_CNT ;
   private boolean[] T00093_n296TAM05_UPD_CNT ;
   private String[] T00093_A288TAM05_KNGN_FLG ;
   private boolean[] T00093_n288TAM05_KNGN_FLG ;
   private String[] T00093_A289TAM05_DEL_FLG ;
   private boolean[] T00093_n289TAM05_DEL_FLG ;
   private String[] T00093_A292TAM05_CRT_PROG_NM ;
   private boolean[] T00093_n292TAM05_CRT_PROG_NM ;
   private String[] T00093_A295TAM05_UPD_PROG_NM ;
   private boolean[] T00093_n295TAM05_UPD_PROG_NM ;
   private String[] T00093_A13TAM04_AUTH_CD ;
   private String[] T00093_A12TAM03_APP_ID ;
   private String[] T00098_A13TAM04_AUTH_CD ;
   private String[] T00098_A12TAM03_APP_ID ;
   private String[] T00099_A13TAM04_AUTH_CD ;
   private String[] T00099_A12TAM03_APP_ID ;
   private java.util.Date[] T00092_A290TAM05_CRT_DATETIME ;
   private boolean[] T00092_n290TAM05_CRT_DATETIME ;
   private String[] T00092_A291TAM05_CRT_USER_ID ;
   private boolean[] T00092_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] T00092_A293TAM05_UPD_DATETIME ;
   private boolean[] T00092_n293TAM05_UPD_DATETIME ;
   private String[] T00092_A294TAM05_UPD_USER_ID ;
   private boolean[] T00092_n294TAM05_UPD_USER_ID ;
   private long[] T00092_A296TAM05_UPD_CNT ;
   private boolean[] T00092_n296TAM05_UPD_CNT ;
   private String[] T00092_A288TAM05_KNGN_FLG ;
   private boolean[] T00092_n288TAM05_KNGN_FLG ;
   private String[] T00092_A289TAM05_DEL_FLG ;
   private boolean[] T00092_n289TAM05_DEL_FLG ;
   private String[] T00092_A292TAM05_CRT_PROG_NM ;
   private boolean[] T00092_n292TAM05_CRT_PROG_NM ;
   private String[] T00092_A295TAM05_UPD_PROG_NM ;
   private boolean[] T00092_n295TAM05_UPD_PROG_NM ;
   private String[] T00092_A13TAM04_AUTH_CD ;
   private String[] T00092_A12TAM03_APP_ID ;
   private String[] T000913_A13TAM04_AUTH_CD ;
   private String[] T000913_A12TAM03_APP_ID ;
   private String[] T000914_A13TAM04_AUTH_CD ;
   private String[] T000915_A12TAM03_APP_ID ;
}

final  class tam05_appli_kngn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00092", "SELECT `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00093", "SELECT `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00094", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00095", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00096", "SELECT TM1.`TAM05_CRT_DATETIME`, TM1.`TAM05_CRT_USER_ID`, TM1.`TAM05_UPD_DATETIME`, TM1.`TAM05_UPD_USER_ID`, TM1.`TAM05_UPD_CNT`, TM1.`TAM05_KNGN_FLG`, TM1.`TAM05_DEL_FLG`, TM1.`TAM05_CRT_PROG_NM`, TM1.`TAM05_UPD_PROG_NM`, TM1.`TAM04_AUTH_CD`, TM1.`TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? and TM1.`TAM03_APP_ID` = ? ORDER BY TM1.`TAM04_AUTH_CD`, TM1.`TAM03_APP_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00097", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00098", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE ( `TAM04_AUTH_CD` > ? or `TAM04_AUTH_CD` = ? and `TAM03_APP_ID` > ?) ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00099", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE ( `TAM04_AUTH_CD` < ? or `TAM04_AUTH_CD` = ? and `TAM03_APP_ID` < ?) ORDER BY `TAM04_AUTH_CD` DESC, `TAM03_APP_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000910", "INSERT INTO `TAM05_APPLI_KNGN`(`TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM04_AUTH_CD`, `TAM03_APP_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000911", "UPDATE `TAM05_APPLI_KNGN` SET `TAM05_CRT_DATETIME`=?, `TAM05_CRT_USER_ID`=?, `TAM05_UPD_DATETIME`=?, `TAM05_UPD_USER_ID`=?, `TAM05_UPD_CNT`=?, `TAM05_KNGN_FLG`=?, `TAM05_DEL_FLG`=?, `TAM05_CRT_PROG_NM`=?, `TAM05_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000912", "DELETE FROM `TAM05_APPLI_KNGN`  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000913", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000914", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000915", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               return;
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
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
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
               ((String[]) buf[16])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10) ;
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 13 :
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 7, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 2, false);
               stmt.setVarchar(3, (String)parms[2], 7, false);
               return;
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
               stmt.setVarchar(10, (String)parms[18], 2, false);
               stmt.setVarchar(11, (String)parms[19], 7, false);
               return;
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
                  stmt.setVarchar(6, (String)parms[11], 1);
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
               stmt.setVarchar(10, (String)parms[18], 2, false);
               stmt.setVarchar(11, (String)parms[19], 7, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
      }
   }

}

