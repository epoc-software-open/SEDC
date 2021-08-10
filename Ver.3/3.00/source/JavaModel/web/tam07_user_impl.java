/*
               File: tam07_user_impl
        Description: ユーザーマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:18:43.11
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam07_user_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TAM07_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatam07_crt_user_id0A10( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TAM07_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatam07_upd_user_id0A10( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_9") == 0 )
      {
         A56TAM07_AUTH_CD = httpContext.GetNextPar( ) ;
         n56TAM07_AUTH_CD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A56TAM07_AUTH_CD", A56TAM07_AUTH_CD);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A56TAM07_AUTH_CD) ;
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
         Form.getMeta().addItem("description", "ユーザーマスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAM07_USER_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tam07_user_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam07_user_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam07_user_impl.class ));
   }

   public tam07_user_impl( int remoteHandle ,
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
         wb_table1_2_0A10( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0A10e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0A10( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0A10( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0A10( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0A10e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "ユーザーマスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TAM07_USER.htm");
         wb_table3_28_0A10( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0A10e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0A10e( true) ;
      }
      else
      {
         wb_table1_2_0A10e( false) ;
      }
   }

   public void wb_table3_28_0A10( boolean wbgen )
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
         wb_table4_34_0A10( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0A10e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 127,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM07_USER.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM07_USER.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0A10e( true) ;
      }
      else
      {
         wb_table3_28_0A10e( false) ;
      }
   }

   public void wb_table4_34_0A10( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_user_id_Internalname, "ユーザーID", "", "", lblTextblocktam07_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_USER_ID_Internalname, GXutil.rtrim( A55TAM07_USER_ID), GXutil.rtrim( localUtil.format( A55TAM07_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_USER_ID", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_user_nm_Internalname, "氏名", "", "", lblTextblocktam07_user_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_USER_NM_Internalname, GXutil.rtrim( A205TAM07_USER_NM), GXutil.rtrim( localUtil.format( A205TAM07_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_USER_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_USER_NM_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_user_kana_nm_Internalname, "氏名（カナ）", "", "", lblTextblocktam07_user_kana_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_USER_KANA_NM_Internalname, GXutil.rtrim( A313TAM07_USER_KANA_NM), GXutil.rtrim( localUtil.format( A313TAM07_USER_KANA_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_USER_KANA_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_USER_KANA_NM_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_pwd_Internalname, "パスワード", "", "", lblTextblocktam07_pwd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_PWD_Internalname, GXutil.rtrim( A210TAM07_PWD), GXutil.rtrim( localUtil.format( A210TAM07_PWD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_PWD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_PWD_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_auth_cd_Internalname, "権限パターン区分", "", "", lblTextblocktam07_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_AUTH_CD_Internalname, GXutil.rtrim( A56TAM07_AUTH_CD), GXutil.rtrim( localUtil.format( A56TAM07_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_site_id_Internalname, "施設ID", "", "", lblTextblocktam07_site_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_SITE_ID_Internalname, GXutil.rtrim( A333TAM07_SITE_ID), GXutil.rtrim( localUtil.format( A333TAM07_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_SITE_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_SITE_ID_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_email_Internalname, "EMAILアドレス", "", "", lblTextblocktam07_email_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTAM07_EMAIL_Internalname, GXutil.rtrim( A683TAM07_EMAIL), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", (short)(0), 1, edtTAM07_EMAIL_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "", "256", -1, "", "", (byte)(-1), true, "", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_admin_auth_flg_Internalname, "全試験権限付与フラグ", "", "", lblTextblocktam07_admin_auth_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_ADMIN_AUTH_FLG_Internalname, GXutil.rtrim( A996TAM07_ADMIN_AUTH_FLG), GXutil.rtrim( localUtil.format( A996TAM07_ADMIN_AUTH_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_ADMIN_AUTH_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_ADMIN_AUTH_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_nc_flg_Internalname, "NC連携フラグ", "", "", lblTextblocktam07_nc_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_NC_FLG_Internalname, GXutil.rtrim( A997TAM07_NC_FLG), GXutil.rtrim( localUtil.format( A997TAM07_NC_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_NC_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_NC_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_note_Internalname, "備考", "", "", lblTextblocktam07_note_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTAM07_NOTE_Internalname, GXutil.rtrim( A998TAM07_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", (short)(0), 1, edtTAM07_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam07_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_DEL_FLG_Internalname, GXutil.rtrim( A214TAM07_DEL_FLG), GXutil.rtrim( localUtil.format( A214TAM07_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam07_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAM07_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_CRT_DATETIME_Internalname, localUtil.format(A229TAM07_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A229TAM07_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM07_USER.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM07_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAM07_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM07_USER.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam07_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_CRT_USER_ID_Internalname, GXutil.rtrim( A264TAM07_CRT_USER_ID), GXutil.rtrim( localUtil.format( A264TAM07_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam07_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_CRT_PROG_NM_Internalname, GXutil.rtrim( A230TAM07_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A230TAM07_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam07_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAM07_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_UPD_DATETIME_Internalname, localUtil.format(A231TAM07_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A231TAM07_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM07_USER.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM07_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAM07_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM07_USER.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktam07_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_UPD_USER_ID_Internalname, GXutil.rtrim( A265TAM07_UPD_USER_ID), GXutil.rtrim( localUtil.format( A265TAM07_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam07_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_UPD_PROG_NM_Internalname, GXutil.rtrim( A232TAM07_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A232TAM07_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktam07_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A299TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTAM07_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A299TAM07_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A299TAM07_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM07_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM07_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0A10e( true) ;
      }
      else
      {
         wb_table4_34_0A10e( false) ;
      }
   }

   public void wb_table2_5_0A10( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM07_USER.htm");
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
         wb_table2_5_0A10e( true) ;
      }
      else
      {
         wb_table2_5_0A10e( false) ;
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
      /* Execute user event: e110A2 */
      e110A2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A55TAM07_USER_ID = httpContext.cgiGet( edtTAM07_USER_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
            A205TAM07_USER_NM = httpContext.cgiGet( edtTAM07_USER_NM_Internalname) ;
            n205TAM07_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
            n205TAM07_USER_NM = ((GXutil.strcmp("", A205TAM07_USER_NM)==0) ? true : false) ;
            A313TAM07_USER_KANA_NM = httpContext.cgiGet( edtTAM07_USER_KANA_NM_Internalname) ;
            n313TAM07_USER_KANA_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A313TAM07_USER_KANA_NM", A313TAM07_USER_KANA_NM);
            n313TAM07_USER_KANA_NM = ((GXutil.strcmp("", A313TAM07_USER_KANA_NM)==0) ? true : false) ;
            A210TAM07_PWD = httpContext.cgiGet( edtTAM07_PWD_Internalname) ;
            n210TAM07_PWD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A210TAM07_PWD", A210TAM07_PWD);
            n210TAM07_PWD = ((GXutil.strcmp("", A210TAM07_PWD)==0) ? true : false) ;
            A56TAM07_AUTH_CD = httpContext.cgiGet( edtTAM07_AUTH_CD_Internalname) ;
            n56TAM07_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A56TAM07_AUTH_CD", A56TAM07_AUTH_CD);
            n56TAM07_AUTH_CD = ((GXutil.strcmp("", A56TAM07_AUTH_CD)==0) ? true : false) ;
            A333TAM07_SITE_ID = httpContext.cgiGet( edtTAM07_SITE_ID_Internalname) ;
            n333TAM07_SITE_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A333TAM07_SITE_ID", A333TAM07_SITE_ID);
            n333TAM07_SITE_ID = ((GXutil.strcmp("", A333TAM07_SITE_ID)==0) ? true : false) ;
            A683TAM07_EMAIL = httpContext.cgiGet( edtTAM07_EMAIL_Internalname) ;
            n683TAM07_EMAIL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A683TAM07_EMAIL", A683TAM07_EMAIL);
            n683TAM07_EMAIL = ((GXutil.strcmp("", A683TAM07_EMAIL)==0) ? true : false) ;
            A996TAM07_ADMIN_AUTH_FLG = httpContext.cgiGet( edtTAM07_ADMIN_AUTH_FLG_Internalname) ;
            n996TAM07_ADMIN_AUTH_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A996TAM07_ADMIN_AUTH_FLG", A996TAM07_ADMIN_AUTH_FLG);
            n996TAM07_ADMIN_AUTH_FLG = ((GXutil.strcmp("", A996TAM07_ADMIN_AUTH_FLG)==0) ? true : false) ;
            A997TAM07_NC_FLG = httpContext.cgiGet( edtTAM07_NC_FLG_Internalname) ;
            n997TAM07_NC_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A997TAM07_NC_FLG", A997TAM07_NC_FLG);
            n997TAM07_NC_FLG = ((GXutil.strcmp("", A997TAM07_NC_FLG)==0) ? true : false) ;
            A998TAM07_NOTE = httpContext.cgiGet( edtTAM07_NOTE_Internalname) ;
            n998TAM07_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A998TAM07_NOTE", A998TAM07_NOTE);
            n998TAM07_NOTE = ((GXutil.strcmp("", A998TAM07_NOTE)==0) ? true : false) ;
            A214TAM07_DEL_FLG = httpContext.cgiGet( edtTAM07_DEL_FLG_Internalname) ;
            n214TAM07_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A214TAM07_DEL_FLG", A214TAM07_DEL_FLG);
            n214TAM07_DEL_FLG = ((GXutil.strcmp("", A214TAM07_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM07_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TAM07_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM07_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A229TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n229TAM07_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A229TAM07_CRT_DATETIME", localUtil.ttoc( A229TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A229TAM07_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM07_CRT_DATETIME_Internalname)) ;
               n229TAM07_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A229TAM07_CRT_DATETIME", localUtil.ttoc( A229TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n229TAM07_CRT_DATETIME = (GXutil.nullDate().equals(A229TAM07_CRT_DATETIME) ? true : false) ;
            A264TAM07_CRT_USER_ID = httpContext.cgiGet( edtTAM07_CRT_USER_ID_Internalname) ;
            n264TAM07_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A264TAM07_CRT_USER_ID", A264TAM07_CRT_USER_ID);
            n264TAM07_CRT_USER_ID = ((GXutil.strcmp("", A264TAM07_CRT_USER_ID)==0) ? true : false) ;
            A230TAM07_CRT_PROG_NM = httpContext.cgiGet( edtTAM07_CRT_PROG_NM_Internalname) ;
            n230TAM07_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A230TAM07_CRT_PROG_NM", A230TAM07_CRT_PROG_NM);
            n230TAM07_CRT_PROG_NM = ((GXutil.strcmp("", A230TAM07_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM07_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TAM07_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM07_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A231TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n231TAM07_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A231TAM07_UPD_DATETIME", localUtil.ttoc( A231TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A231TAM07_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM07_UPD_DATETIME_Internalname)) ;
               n231TAM07_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A231TAM07_UPD_DATETIME", localUtil.ttoc( A231TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n231TAM07_UPD_DATETIME = (GXutil.nullDate().equals(A231TAM07_UPD_DATETIME) ? true : false) ;
            A265TAM07_UPD_USER_ID = httpContext.cgiGet( edtTAM07_UPD_USER_ID_Internalname) ;
            n265TAM07_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A265TAM07_UPD_USER_ID", A265TAM07_UPD_USER_ID);
            n265TAM07_UPD_USER_ID = ((GXutil.strcmp("", A265TAM07_UPD_USER_ID)==0) ? true : false) ;
            A232TAM07_UPD_PROG_NM = httpContext.cgiGet( edtTAM07_UPD_PROG_NM_Internalname) ;
            n232TAM07_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A232TAM07_UPD_PROG_NM", A232TAM07_UPD_PROG_NM);
            n232TAM07_UPD_PROG_NM = ((GXutil.strcmp("", A232TAM07_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAM07_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAM07_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAM07_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM07_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A299TAM07_UPD_CNT = 0 ;
               n299TAM07_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A299TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)));
            }
            else
            {
               A299TAM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTAM07_UPD_CNT_Internalname), ".", ",") ;
               n299TAM07_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A299TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)));
            }
            n299TAM07_UPD_CNT = ((0==A299TAM07_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z55TAM07_USER_ID = httpContext.cgiGet( "Z55TAM07_USER_ID") ;
            Z229TAM07_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z229TAM07_CRT_DATETIME"), 0) ;
            n229TAM07_CRT_DATETIME = (GXutil.nullDate().equals(A229TAM07_CRT_DATETIME) ? true : false) ;
            Z264TAM07_CRT_USER_ID = httpContext.cgiGet( "Z264TAM07_CRT_USER_ID") ;
            n264TAM07_CRT_USER_ID = ((GXutil.strcmp("", A264TAM07_CRT_USER_ID)==0) ? true : false) ;
            Z231TAM07_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z231TAM07_UPD_DATETIME"), 0) ;
            n231TAM07_UPD_DATETIME = (GXutil.nullDate().equals(A231TAM07_UPD_DATETIME) ? true : false) ;
            Z265TAM07_UPD_USER_ID = httpContext.cgiGet( "Z265TAM07_UPD_USER_ID") ;
            n265TAM07_UPD_USER_ID = ((GXutil.strcmp("", A265TAM07_UPD_USER_ID)==0) ? true : false) ;
            Z299TAM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z299TAM07_UPD_CNT"), ".", ",") ;
            n299TAM07_UPD_CNT = ((0==A299TAM07_UPD_CNT) ? true : false) ;
            Z205TAM07_USER_NM = httpContext.cgiGet( "Z205TAM07_USER_NM") ;
            n205TAM07_USER_NM = ((GXutil.strcmp("", A205TAM07_USER_NM)==0) ? true : false) ;
            Z313TAM07_USER_KANA_NM = httpContext.cgiGet( "Z313TAM07_USER_KANA_NM") ;
            n313TAM07_USER_KANA_NM = ((GXutil.strcmp("", A313TAM07_USER_KANA_NM)==0) ? true : false) ;
            Z210TAM07_PWD = httpContext.cgiGet( "Z210TAM07_PWD") ;
            n210TAM07_PWD = ((GXutil.strcmp("", A210TAM07_PWD)==0) ? true : false) ;
            Z333TAM07_SITE_ID = httpContext.cgiGet( "Z333TAM07_SITE_ID") ;
            n333TAM07_SITE_ID = ((GXutil.strcmp("", A333TAM07_SITE_ID)==0) ? true : false) ;
            Z683TAM07_EMAIL = httpContext.cgiGet( "Z683TAM07_EMAIL") ;
            n683TAM07_EMAIL = ((GXutil.strcmp("", A683TAM07_EMAIL)==0) ? true : false) ;
            Z996TAM07_ADMIN_AUTH_FLG = httpContext.cgiGet( "Z996TAM07_ADMIN_AUTH_FLG") ;
            n996TAM07_ADMIN_AUTH_FLG = ((GXutil.strcmp("", A996TAM07_ADMIN_AUTH_FLG)==0) ? true : false) ;
            Z997TAM07_NC_FLG = httpContext.cgiGet( "Z997TAM07_NC_FLG") ;
            n997TAM07_NC_FLG = ((GXutil.strcmp("", A997TAM07_NC_FLG)==0) ? true : false) ;
            Z998TAM07_NOTE = httpContext.cgiGet( "Z998TAM07_NOTE") ;
            n998TAM07_NOTE = ((GXutil.strcmp("", A998TAM07_NOTE)==0) ? true : false) ;
            Z214TAM07_DEL_FLG = httpContext.cgiGet( "Z214TAM07_DEL_FLG") ;
            n214TAM07_DEL_FLG = ((GXutil.strcmp("", A214TAM07_DEL_FLG)==0) ? true : false) ;
            Z230TAM07_CRT_PROG_NM = httpContext.cgiGet( "Z230TAM07_CRT_PROG_NM") ;
            n230TAM07_CRT_PROG_NM = ((GXutil.strcmp("", A230TAM07_CRT_PROG_NM)==0) ? true : false) ;
            Z232TAM07_UPD_PROG_NM = httpContext.cgiGet( "Z232TAM07_UPD_PROG_NM") ;
            n232TAM07_UPD_PROG_NM = ((GXutil.strcmp("", A232TAM07_UPD_PROG_NM)==0) ? true : false) ;
            Z56TAM07_AUTH_CD = httpContext.cgiGet( "Z56TAM07_AUTH_CD") ;
            n56TAM07_AUTH_CD = ((GXutil.strcmp("", A56TAM07_AUTH_CD)==0) ? true : false) ;
            O299TAM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O299TAM07_UPD_CNT"), ".", ",") ;
            n299TAM07_UPD_CNT = ((0==A299TAM07_UPD_CNT) ? true : false) ;
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
               A55TAM07_USER_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
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
                     /* Execute user event: e110A2 */
                     e110A2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120A2 */
                     e120A2 ();
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
         /* Execute user event: e120A2 */
         e120A2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0A10( ) ;
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
      disableAttributes0A10( ) ;
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

   public void resetCaption0A0( )
   {
   }

   public void e110A2( )
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

   public void e120A2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "ユーザーID:" + A55TAM07_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A205TAM07_USER_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A313TAM07_USER_KANA_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A210TAM07_PWD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A56TAM07_AUTH_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A333TAM07_SITE_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A214TAM07_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A229TAM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam07_user_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A229TAM07_CRT_DATETIME", localUtil.ttoc( A229TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A264TAM07_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A230TAM07_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A231TAM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam07_user_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A231TAM07_UPD_DATETIME", localUtil.ttoc( A231TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A265TAM07_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A232TAM07_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0A10( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z229TAM07_CRT_DATETIME = T000A3_A229TAM07_CRT_DATETIME[0] ;
            Z264TAM07_CRT_USER_ID = T000A3_A264TAM07_CRT_USER_ID[0] ;
            Z231TAM07_UPD_DATETIME = T000A3_A231TAM07_UPD_DATETIME[0] ;
            Z265TAM07_UPD_USER_ID = T000A3_A265TAM07_UPD_USER_ID[0] ;
            Z299TAM07_UPD_CNT = T000A3_A299TAM07_UPD_CNT[0] ;
            Z205TAM07_USER_NM = T000A3_A205TAM07_USER_NM[0] ;
            Z313TAM07_USER_KANA_NM = T000A3_A313TAM07_USER_KANA_NM[0] ;
            Z210TAM07_PWD = T000A3_A210TAM07_PWD[0] ;
            Z333TAM07_SITE_ID = T000A3_A333TAM07_SITE_ID[0] ;
            Z683TAM07_EMAIL = T000A3_A683TAM07_EMAIL[0] ;
            Z996TAM07_ADMIN_AUTH_FLG = T000A3_A996TAM07_ADMIN_AUTH_FLG[0] ;
            Z997TAM07_NC_FLG = T000A3_A997TAM07_NC_FLG[0] ;
            Z998TAM07_NOTE = T000A3_A998TAM07_NOTE[0] ;
            Z214TAM07_DEL_FLG = T000A3_A214TAM07_DEL_FLG[0] ;
            Z230TAM07_CRT_PROG_NM = T000A3_A230TAM07_CRT_PROG_NM[0] ;
            Z232TAM07_UPD_PROG_NM = T000A3_A232TAM07_UPD_PROG_NM[0] ;
            Z56TAM07_AUTH_CD = T000A3_A56TAM07_AUTH_CD[0] ;
         }
         else
         {
            Z229TAM07_CRT_DATETIME = A229TAM07_CRT_DATETIME ;
            Z264TAM07_CRT_USER_ID = A264TAM07_CRT_USER_ID ;
            Z231TAM07_UPD_DATETIME = A231TAM07_UPD_DATETIME ;
            Z265TAM07_UPD_USER_ID = A265TAM07_UPD_USER_ID ;
            Z299TAM07_UPD_CNT = A299TAM07_UPD_CNT ;
            Z205TAM07_USER_NM = A205TAM07_USER_NM ;
            Z313TAM07_USER_KANA_NM = A313TAM07_USER_KANA_NM ;
            Z210TAM07_PWD = A210TAM07_PWD ;
            Z333TAM07_SITE_ID = A333TAM07_SITE_ID ;
            Z683TAM07_EMAIL = A683TAM07_EMAIL ;
            Z996TAM07_ADMIN_AUTH_FLG = A996TAM07_ADMIN_AUTH_FLG ;
            Z997TAM07_NC_FLG = A997TAM07_NC_FLG ;
            Z998TAM07_NOTE = A998TAM07_NOTE ;
            Z214TAM07_DEL_FLG = A214TAM07_DEL_FLG ;
            Z230TAM07_CRT_PROG_NM = A230TAM07_CRT_PROG_NM ;
            Z232TAM07_UPD_PROG_NM = A232TAM07_UPD_PROG_NM ;
            Z56TAM07_AUTH_CD = A56TAM07_AUTH_CD ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z55TAM07_USER_ID = A55TAM07_USER_ID ;
         Z229TAM07_CRT_DATETIME = A229TAM07_CRT_DATETIME ;
         Z264TAM07_CRT_USER_ID = A264TAM07_CRT_USER_ID ;
         Z231TAM07_UPD_DATETIME = A231TAM07_UPD_DATETIME ;
         Z265TAM07_UPD_USER_ID = A265TAM07_UPD_USER_ID ;
         Z299TAM07_UPD_CNT = A299TAM07_UPD_CNT ;
         Z205TAM07_USER_NM = A205TAM07_USER_NM ;
         Z313TAM07_USER_KANA_NM = A313TAM07_USER_KANA_NM ;
         Z210TAM07_PWD = A210TAM07_PWD ;
         Z333TAM07_SITE_ID = A333TAM07_SITE_ID ;
         Z683TAM07_EMAIL = A683TAM07_EMAIL ;
         Z996TAM07_ADMIN_AUTH_FLG = A996TAM07_ADMIN_AUTH_FLG ;
         Z997TAM07_NC_FLG = A997TAM07_NC_FLG ;
         Z998TAM07_NOTE = A998TAM07_NOTE ;
         Z214TAM07_DEL_FLG = A214TAM07_DEL_FLG ;
         Z230TAM07_CRT_PROG_NM = A230TAM07_CRT_PROG_NM ;
         Z232TAM07_UPD_PROG_NM = A232TAM07_UPD_PROG_NM ;
         Z56TAM07_AUTH_CD = A56TAM07_AUTH_CD ;
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

   public void load0A10( )
   {
      /* Using cursor T000A5 */
      pr_default.execute(3, new Object[] {A55TAM07_USER_ID});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A229TAM07_CRT_DATETIME = T000A5_A229TAM07_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A229TAM07_CRT_DATETIME", localUtil.ttoc( A229TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n229TAM07_CRT_DATETIME = T000A5_n229TAM07_CRT_DATETIME[0] ;
         A264TAM07_CRT_USER_ID = T000A5_A264TAM07_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A264TAM07_CRT_USER_ID", A264TAM07_CRT_USER_ID);
         n264TAM07_CRT_USER_ID = T000A5_n264TAM07_CRT_USER_ID[0] ;
         A231TAM07_UPD_DATETIME = T000A5_A231TAM07_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A231TAM07_UPD_DATETIME", localUtil.ttoc( A231TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n231TAM07_UPD_DATETIME = T000A5_n231TAM07_UPD_DATETIME[0] ;
         A265TAM07_UPD_USER_ID = T000A5_A265TAM07_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A265TAM07_UPD_USER_ID", A265TAM07_UPD_USER_ID);
         n265TAM07_UPD_USER_ID = T000A5_n265TAM07_UPD_USER_ID[0] ;
         A299TAM07_UPD_CNT = T000A5_A299TAM07_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A299TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)));
         n299TAM07_UPD_CNT = T000A5_n299TAM07_UPD_CNT[0] ;
         A205TAM07_USER_NM = T000A5_A205TAM07_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
         n205TAM07_USER_NM = T000A5_n205TAM07_USER_NM[0] ;
         A313TAM07_USER_KANA_NM = T000A5_A313TAM07_USER_KANA_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A313TAM07_USER_KANA_NM", A313TAM07_USER_KANA_NM);
         n313TAM07_USER_KANA_NM = T000A5_n313TAM07_USER_KANA_NM[0] ;
         A210TAM07_PWD = T000A5_A210TAM07_PWD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A210TAM07_PWD", A210TAM07_PWD);
         n210TAM07_PWD = T000A5_n210TAM07_PWD[0] ;
         A333TAM07_SITE_ID = T000A5_A333TAM07_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A333TAM07_SITE_ID", A333TAM07_SITE_ID);
         n333TAM07_SITE_ID = T000A5_n333TAM07_SITE_ID[0] ;
         A683TAM07_EMAIL = T000A5_A683TAM07_EMAIL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A683TAM07_EMAIL", A683TAM07_EMAIL);
         n683TAM07_EMAIL = T000A5_n683TAM07_EMAIL[0] ;
         A996TAM07_ADMIN_AUTH_FLG = T000A5_A996TAM07_ADMIN_AUTH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A996TAM07_ADMIN_AUTH_FLG", A996TAM07_ADMIN_AUTH_FLG);
         n996TAM07_ADMIN_AUTH_FLG = T000A5_n996TAM07_ADMIN_AUTH_FLG[0] ;
         A997TAM07_NC_FLG = T000A5_A997TAM07_NC_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A997TAM07_NC_FLG", A997TAM07_NC_FLG);
         n997TAM07_NC_FLG = T000A5_n997TAM07_NC_FLG[0] ;
         A998TAM07_NOTE = T000A5_A998TAM07_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A998TAM07_NOTE", A998TAM07_NOTE);
         n998TAM07_NOTE = T000A5_n998TAM07_NOTE[0] ;
         A214TAM07_DEL_FLG = T000A5_A214TAM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A214TAM07_DEL_FLG", A214TAM07_DEL_FLG);
         n214TAM07_DEL_FLG = T000A5_n214TAM07_DEL_FLG[0] ;
         A230TAM07_CRT_PROG_NM = T000A5_A230TAM07_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A230TAM07_CRT_PROG_NM", A230TAM07_CRT_PROG_NM);
         n230TAM07_CRT_PROG_NM = T000A5_n230TAM07_CRT_PROG_NM[0] ;
         A232TAM07_UPD_PROG_NM = T000A5_A232TAM07_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A232TAM07_UPD_PROG_NM", A232TAM07_UPD_PROG_NM);
         n232TAM07_UPD_PROG_NM = T000A5_n232TAM07_UPD_PROG_NM[0] ;
         A56TAM07_AUTH_CD = T000A5_A56TAM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56TAM07_AUTH_CD", A56TAM07_AUTH_CD);
         n56TAM07_AUTH_CD = T000A5_n56TAM07_AUTH_CD[0] ;
         zm0A10( -8) ;
      }
      pr_default.close(3);
      onLoadActions0A10( ) ;
   }

   public void onLoadActions0A10( )
   {
      AV9Pgmname = "TAM07_USER" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0A10( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TAM07_USER" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      /* Using cursor T000A4 */
      pr_default.execute(2, new Object[] {new Boolean(n56TAM07_AUTH_CD), A56TAM07_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A56TAM07_AUTH_CD)==0) ) )
         {
            httpContext.GX_msglist.addItem("'ユーザーマスタ・権限サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM07_AUTH_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM07_AUTH_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A229TAM07_CRT_DATETIME) || (( A229TAM07_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A229TAM07_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TAM07_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM07_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A231TAM07_UPD_DATETIME) || (( A231TAM07_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A231TAM07_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TAM07_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM07_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors0A10( )
   {
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A56TAM07_AUTH_CD )
   {
      /* Using cursor T000A4 */
      pr_default.execute(2, new Object[] {new Boolean(n56TAM07_AUTH_CD), A56TAM07_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A56TAM07_AUTH_CD)==0) ) )
         {
            httpContext.GX_msglist.addItem("'ユーザーマスタ・権限サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM07_AUTH_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM07_AUTH_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
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

   public void getKey0A10( )
   {
      /* Using cursor T000A6 */
      pr_default.execute(4, new Object[] {A55TAM07_USER_ID});
      if ( (pr_default.getStatus(4) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(4);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000A3 */
      pr_default.execute(1, new Object[] {A55TAM07_USER_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0A10( 8) ;
         RcdFound10 = (short)(1) ;
         A55TAM07_USER_ID = T000A3_A55TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
         A229TAM07_CRT_DATETIME = T000A3_A229TAM07_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A229TAM07_CRT_DATETIME", localUtil.ttoc( A229TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n229TAM07_CRT_DATETIME = T000A3_n229TAM07_CRT_DATETIME[0] ;
         A264TAM07_CRT_USER_ID = T000A3_A264TAM07_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A264TAM07_CRT_USER_ID", A264TAM07_CRT_USER_ID);
         n264TAM07_CRT_USER_ID = T000A3_n264TAM07_CRT_USER_ID[0] ;
         A231TAM07_UPD_DATETIME = T000A3_A231TAM07_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A231TAM07_UPD_DATETIME", localUtil.ttoc( A231TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n231TAM07_UPD_DATETIME = T000A3_n231TAM07_UPD_DATETIME[0] ;
         A265TAM07_UPD_USER_ID = T000A3_A265TAM07_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A265TAM07_UPD_USER_ID", A265TAM07_UPD_USER_ID);
         n265TAM07_UPD_USER_ID = T000A3_n265TAM07_UPD_USER_ID[0] ;
         A299TAM07_UPD_CNT = T000A3_A299TAM07_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A299TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)));
         n299TAM07_UPD_CNT = T000A3_n299TAM07_UPD_CNT[0] ;
         A205TAM07_USER_NM = T000A3_A205TAM07_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
         n205TAM07_USER_NM = T000A3_n205TAM07_USER_NM[0] ;
         A313TAM07_USER_KANA_NM = T000A3_A313TAM07_USER_KANA_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A313TAM07_USER_KANA_NM", A313TAM07_USER_KANA_NM);
         n313TAM07_USER_KANA_NM = T000A3_n313TAM07_USER_KANA_NM[0] ;
         A210TAM07_PWD = T000A3_A210TAM07_PWD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A210TAM07_PWD", A210TAM07_PWD);
         n210TAM07_PWD = T000A3_n210TAM07_PWD[0] ;
         A333TAM07_SITE_ID = T000A3_A333TAM07_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A333TAM07_SITE_ID", A333TAM07_SITE_ID);
         n333TAM07_SITE_ID = T000A3_n333TAM07_SITE_ID[0] ;
         A683TAM07_EMAIL = T000A3_A683TAM07_EMAIL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A683TAM07_EMAIL", A683TAM07_EMAIL);
         n683TAM07_EMAIL = T000A3_n683TAM07_EMAIL[0] ;
         A996TAM07_ADMIN_AUTH_FLG = T000A3_A996TAM07_ADMIN_AUTH_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A996TAM07_ADMIN_AUTH_FLG", A996TAM07_ADMIN_AUTH_FLG);
         n996TAM07_ADMIN_AUTH_FLG = T000A3_n996TAM07_ADMIN_AUTH_FLG[0] ;
         A997TAM07_NC_FLG = T000A3_A997TAM07_NC_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A997TAM07_NC_FLG", A997TAM07_NC_FLG);
         n997TAM07_NC_FLG = T000A3_n997TAM07_NC_FLG[0] ;
         A998TAM07_NOTE = T000A3_A998TAM07_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A998TAM07_NOTE", A998TAM07_NOTE);
         n998TAM07_NOTE = T000A3_n998TAM07_NOTE[0] ;
         A214TAM07_DEL_FLG = T000A3_A214TAM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A214TAM07_DEL_FLG", A214TAM07_DEL_FLG);
         n214TAM07_DEL_FLG = T000A3_n214TAM07_DEL_FLG[0] ;
         A230TAM07_CRT_PROG_NM = T000A3_A230TAM07_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A230TAM07_CRT_PROG_NM", A230TAM07_CRT_PROG_NM);
         n230TAM07_CRT_PROG_NM = T000A3_n230TAM07_CRT_PROG_NM[0] ;
         A232TAM07_UPD_PROG_NM = T000A3_A232TAM07_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A232TAM07_UPD_PROG_NM", A232TAM07_UPD_PROG_NM);
         n232TAM07_UPD_PROG_NM = T000A3_n232TAM07_UPD_PROG_NM[0] ;
         A56TAM07_AUTH_CD = T000A3_A56TAM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A56TAM07_AUTH_CD", A56TAM07_AUTH_CD);
         n56TAM07_AUTH_CD = T000A3_n56TAM07_AUTH_CD[0] ;
         O299TAM07_UPD_CNT = A299TAM07_UPD_CNT ;
         n299TAM07_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A299TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)));
         Z55TAM07_USER_ID = A55TAM07_USER_ID ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0A10( ) ;
         if ( AnyError == 1 )
         {
            RcdFound10 = (short)(0) ;
            initializeNonKey0A10( ) ;
         }
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound10 = (short)(0) ;
         initializeNonKey0A10( ) ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode10 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0A10( ) ;
      if ( RcdFound10 == 0 )
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
      RcdFound10 = (short)(0) ;
      /* Using cursor T000A7 */
      pr_default.execute(5, new Object[] {A55TAM07_USER_ID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000A7_A55TAM07_USER_ID[0], A55TAM07_USER_ID) < 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T000A7_A55TAM07_USER_ID[0], A55TAM07_USER_ID) > 0 ) ) )
         {
            A55TAM07_USER_ID = T000A7_A55TAM07_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T000A8 */
      pr_default.execute(6, new Object[] {A55TAM07_USER_ID});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000A8_A55TAM07_USER_ID[0], A55TAM07_USER_ID) > 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000A8_A55TAM07_USER_ID[0], A55TAM07_USER_ID) < 0 ) ) )
         {
            A55TAM07_USER_ID = T000A8_A55TAM07_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0A10( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTAM07_USER_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0A10( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound10 == 1 )
         {
            if ( GXutil.strcmp(A55TAM07_USER_ID, Z55TAM07_USER_ID) != 0 )
            {
               A55TAM07_USER_ID = Z55TAM07_USER_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TAM07_USER_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM07_USER_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTAM07_USER_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update0A10( ) ;
               GX_FocusControl = edtTAM07_USER_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A55TAM07_USER_ID, Z55TAM07_USER_ID) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTAM07_USER_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0A10( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM07_USER_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTAM07_USER_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTAM07_USER_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert0A10( ) ;
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
      if ( GXutil.strcmp(A55TAM07_USER_ID, Z55TAM07_USER_ID) != 0 )
      {
         A55TAM07_USER_ID = Z55TAM07_USER_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TAM07_USER_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM07_USER_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTAM07_USER_ID_Internalname ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM07_USER_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM07_USER_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTAM07_USER_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart0A10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM07_USER_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0A10( ) ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM07_USER_NM_Internalname ;
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
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM07_USER_NM_Internalname ;
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
      scanStart0A10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound10 != 0 )
         {
            scanNext0A10( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM07_USER_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0A10( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0A10( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000A2 */
         pr_default.execute(0, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM07_USER"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z229TAM07_CRT_DATETIME.equals( T000A2_A229TAM07_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z264TAM07_CRT_USER_ID, T000A2_A264TAM07_CRT_USER_ID[0]) != 0 ) || !( Z231TAM07_UPD_DATETIME.equals( T000A2_A231TAM07_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z265TAM07_UPD_USER_ID, T000A2_A265TAM07_UPD_USER_ID[0]) != 0 ) || ( Z299TAM07_UPD_CNT != T000A2_A299TAM07_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z205TAM07_USER_NM, T000A2_A205TAM07_USER_NM[0]) != 0 ) || ( GXutil.strcmp(Z313TAM07_USER_KANA_NM, T000A2_A313TAM07_USER_KANA_NM[0]) != 0 ) || ( GXutil.strcmp(Z210TAM07_PWD, T000A2_A210TAM07_PWD[0]) != 0 ) || ( GXutil.strcmp(Z333TAM07_SITE_ID, T000A2_A333TAM07_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z683TAM07_EMAIL, T000A2_A683TAM07_EMAIL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z996TAM07_ADMIN_AUTH_FLG, T000A2_A996TAM07_ADMIN_AUTH_FLG[0]) != 0 ) || ( GXutil.strcmp(Z997TAM07_NC_FLG, T000A2_A997TAM07_NC_FLG[0]) != 0 ) || ( GXutil.strcmp(Z998TAM07_NOTE, T000A2_A998TAM07_NOTE[0]) != 0 ) || ( GXutil.strcmp(Z214TAM07_DEL_FLG, T000A2_A214TAM07_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z230TAM07_CRT_PROG_NM, T000A2_A230TAM07_CRT_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z232TAM07_UPD_PROG_NM, T000A2_A232TAM07_UPD_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z56TAM07_AUTH_CD, T000A2_A56TAM07_AUTH_CD[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM07_USER"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0A10( )
   {
      beforeValidate0A10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A10( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0A10( 0) ;
         checkOptimisticConcurrency0A10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A10( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0A10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000A9 */
                  pr_default.execute(7, new Object[] {A55TAM07_USER_ID, new Boolean(n229TAM07_CRT_DATETIME), A229TAM07_CRT_DATETIME, new Boolean(n264TAM07_CRT_USER_ID), A264TAM07_CRT_USER_ID, new Boolean(n231TAM07_UPD_DATETIME), A231TAM07_UPD_DATETIME, new Boolean(n265TAM07_UPD_USER_ID), A265TAM07_UPD_USER_ID, new Boolean(n299TAM07_UPD_CNT), new Long(A299TAM07_UPD_CNT), new Boolean(n205TAM07_USER_NM), A205TAM07_USER_NM, new Boolean(n313TAM07_USER_KANA_NM), A313TAM07_USER_KANA_NM, new Boolean(n210TAM07_PWD), A210TAM07_PWD, new Boolean(n333TAM07_SITE_ID), A333TAM07_SITE_ID, new Boolean(n683TAM07_EMAIL), A683TAM07_EMAIL, new Boolean(n996TAM07_ADMIN_AUTH_FLG), A996TAM07_ADMIN_AUTH_FLG, new Boolean(n997TAM07_NC_FLG), A997TAM07_NC_FLG, new Boolean(n998TAM07_NOTE), A998TAM07_NOTE, new Boolean(n214TAM07_DEL_FLG), A214TAM07_DEL_FLG, new Boolean(n230TAM07_CRT_PROG_NM), A230TAM07_CRT_PROG_NM, new Boolean(n232TAM07_UPD_PROG_NM), A232TAM07_UPD_PROG_NM, new Boolean(n56TAM07_AUTH_CD), A56TAM07_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM07_USER") ;
                  if ( (pr_default.getStatus(7) == 1) )
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
                        resetCaption0A0( ) ;
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
            load0A10( ) ;
         }
         endLevel0A10( ) ;
      }
      closeExtendedTableCursors0A10( ) ;
   }

   public void update0A10( )
   {
      beforeValidate0A10( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0A10( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A10( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0A10( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0A10( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000A10 */
                  pr_default.execute(8, new Object[] {new Boolean(n229TAM07_CRT_DATETIME), A229TAM07_CRT_DATETIME, new Boolean(n264TAM07_CRT_USER_ID), A264TAM07_CRT_USER_ID, new Boolean(n231TAM07_UPD_DATETIME), A231TAM07_UPD_DATETIME, new Boolean(n265TAM07_UPD_USER_ID), A265TAM07_UPD_USER_ID, new Boolean(n299TAM07_UPD_CNT), new Long(A299TAM07_UPD_CNT), new Boolean(n205TAM07_USER_NM), A205TAM07_USER_NM, new Boolean(n313TAM07_USER_KANA_NM), A313TAM07_USER_KANA_NM, new Boolean(n210TAM07_PWD), A210TAM07_PWD, new Boolean(n333TAM07_SITE_ID), A333TAM07_SITE_ID, new Boolean(n683TAM07_EMAIL), A683TAM07_EMAIL, new Boolean(n996TAM07_ADMIN_AUTH_FLG), A996TAM07_ADMIN_AUTH_FLG, new Boolean(n997TAM07_NC_FLG), A997TAM07_NC_FLG, new Boolean(n998TAM07_NOTE), A998TAM07_NOTE, new Boolean(n214TAM07_DEL_FLG), A214TAM07_DEL_FLG, new Boolean(n230TAM07_CRT_PROG_NM), A230TAM07_CRT_PROG_NM, new Boolean(n232TAM07_UPD_PROG_NM), A232TAM07_UPD_PROG_NM, new Boolean(n56TAM07_AUTH_CD), A56TAM07_AUTH_CD, A55TAM07_USER_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM07_USER") ;
                  if ( (pr_default.getStatus(8) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM07_USER"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0A10( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption0A0( ) ;
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
         endLevel0A10( ) ;
      }
      closeExtendedTableCursors0A10( ) ;
   }

   public void deferredUpdate0A10( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0A10( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0A10( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0A10( ) ;
         afterConfirm0A10( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0A10( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000A11 */
               pr_default.execute(9, new Object[] {A55TAM07_USER_ID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM07_USER") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound10 == 0 )
                     {
                        initAll0A10( ) ;
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
                     resetCaption0A0( ) ;
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
      sMode10 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0A10( ) ;
      Gx_mode = sMode10 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0A10( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TAM07_USER" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000A12 */
         pr_default.execute(10, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・更新ユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T000A13 */
         pr_default.execute(11, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・作成ユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T000A14 */
         pr_default.execute(12, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・データ固定ユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T000A15 */
         pr_default.execute(13, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・承認ユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T000A16 */
         pr_default.execute(14, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・アップロードユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T000A17 */
         pr_default.execute(15, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"+" ("+"CRF検索ワーク・ロックユーザーサブタイプ"+")"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T000A18 */
         pr_default.execute(16, new Object[] {A55TAM07_USER_ID});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験参加スタッフマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
      }
   }

   public void endLevel0A10( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0A10( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tam07_user");
         if ( AnyError == 0 )
         {
            confirmValues0A0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tam07_user");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0A10( )
   {
      /* Scan By routine */
      /* Using cursor T000A19 */
      pr_default.execute(17);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A55TAM07_USER_ID = T000A19_A55TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0A10( )
   {
      /* Scan next routine */
      pr_default.readNext(17);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(17) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A55TAM07_USER_ID = T000A19_A55TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
      }
   }

   public void scanEnd0A10( )
   {
      pr_default.close(17);
   }

   public void afterConfirm0A10( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0A10( )
   {
      /* Before Insert Rules */
      A229TAM07_CRT_DATETIME = GXutil.now( ) ;
      n229TAM07_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A229TAM07_CRT_DATETIME", localUtil.ttoc( A229TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A264TAM07_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam07_user_impl.this.GXt_char1 = GXv_char2[0] ;
      A264TAM07_CRT_USER_ID = GXt_char1 ;
      n264TAM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A264TAM07_CRT_USER_ID", A264TAM07_CRT_USER_ID);
      A231TAM07_UPD_DATETIME = GXutil.now( ) ;
      n231TAM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A231TAM07_UPD_DATETIME", localUtil.ttoc( A231TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A265TAM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam07_user_impl.this.GXt_char1 = GXv_char2[0] ;
      A265TAM07_UPD_USER_ID = GXt_char1 ;
      n265TAM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A265TAM07_UPD_USER_ID", A265TAM07_UPD_USER_ID);
      A299TAM07_UPD_CNT = (long)(O299TAM07_UPD_CNT+1) ;
      n299TAM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A299TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0A10( )
   {
      /* Before Update Rules */
      A231TAM07_UPD_DATETIME = GXutil.now( ) ;
      n231TAM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A231TAM07_UPD_DATETIME", localUtil.ttoc( A231TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A265TAM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam07_user_impl.this.GXt_char1 = GXv_char2[0] ;
      A265TAM07_UPD_USER_ID = GXt_char1 ;
      n265TAM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A265TAM07_UPD_USER_ID", A265TAM07_UPD_USER_ID);
      A299TAM07_UPD_CNT = (long)(O299TAM07_UPD_CNT+1) ;
      n299TAM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A299TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0A10( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0A10( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0A10( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0A10( )
   {
      edtTAM07_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_USER_ID_Enabled, 5, 0)));
      edtTAM07_USER_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_USER_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_USER_NM_Enabled, 5, 0)));
      edtTAM07_USER_KANA_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_USER_KANA_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_USER_KANA_NM_Enabled, 5, 0)));
      edtTAM07_PWD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_PWD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_PWD_Enabled, 5, 0)));
      edtTAM07_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_AUTH_CD_Enabled, 5, 0)));
      edtTAM07_SITE_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_SITE_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_SITE_ID_Enabled, 5, 0)));
      edtTAM07_EMAIL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_EMAIL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_EMAIL_Enabled, 5, 0)));
      edtTAM07_ADMIN_AUTH_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_ADMIN_AUTH_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_ADMIN_AUTH_FLG_Enabled, 5, 0)));
      edtTAM07_NC_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_NC_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_NC_FLG_Enabled, 5, 0)));
      edtTAM07_NOTE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_NOTE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_NOTE_Enabled, 5, 0)));
      edtTAM07_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_DEL_FLG_Enabled, 5, 0)));
      edtTAM07_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM07_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM07_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM07_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM07_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM07_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_UPD_PROG_NM_Enabled, 5, 0)));
      edtTAM07_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM07_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM07_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0A0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "ユーザーマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513184484");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tam07_user") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0A10( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z55TAM07_USER_ID", GXutil.rtrim( Z55TAM07_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z229TAM07_CRT_DATETIME", localUtil.ttoc( Z229TAM07_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z264TAM07_CRT_USER_ID", GXutil.rtrim( Z264TAM07_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z231TAM07_UPD_DATETIME", localUtil.ttoc( Z231TAM07_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z265TAM07_UPD_USER_ID", GXutil.rtrim( Z265TAM07_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z299TAM07_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z299TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z205TAM07_USER_NM", GXutil.rtrim( Z205TAM07_USER_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z313TAM07_USER_KANA_NM", GXutil.rtrim( Z313TAM07_USER_KANA_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z210TAM07_PWD", GXutil.rtrim( Z210TAM07_PWD));
      GxWebStd.gx_hidden_field( httpContext, "Z333TAM07_SITE_ID", GXutil.rtrim( Z333TAM07_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z683TAM07_EMAIL", GXutil.rtrim( Z683TAM07_EMAIL));
      GxWebStd.gx_hidden_field( httpContext, "Z996TAM07_ADMIN_AUTH_FLG", GXutil.rtrim( Z996TAM07_ADMIN_AUTH_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z997TAM07_NC_FLG", GXutil.rtrim( Z997TAM07_NC_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z998TAM07_NOTE", GXutil.rtrim( Z998TAM07_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z214TAM07_DEL_FLG", GXutil.rtrim( Z214TAM07_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z230TAM07_CRT_PROG_NM", GXutil.rtrim( Z230TAM07_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z232TAM07_UPD_PROG_NM", GXutil.rtrim( Z232TAM07_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z56TAM07_AUTH_CD", GXutil.rtrim( Z56TAM07_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "O299TAM07_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O299TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TAM07_USER" ;
   }

   public String getPgmdesc( )
   {
      return "ユーザーマスタ" ;
   }

   public void initializeNonKey0A10( )
   {
      A229TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n229TAM07_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A229TAM07_CRT_DATETIME", localUtil.ttoc( A229TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n229TAM07_CRT_DATETIME = (GXutil.nullDate().equals(A229TAM07_CRT_DATETIME) ? true : false) ;
      A264TAM07_CRT_USER_ID = "" ;
      n264TAM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A264TAM07_CRT_USER_ID", A264TAM07_CRT_USER_ID);
      n264TAM07_CRT_USER_ID = ((GXutil.strcmp("", A264TAM07_CRT_USER_ID)==0) ? true : false) ;
      A231TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n231TAM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A231TAM07_UPD_DATETIME", localUtil.ttoc( A231TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n231TAM07_UPD_DATETIME = (GXutil.nullDate().equals(A231TAM07_UPD_DATETIME) ? true : false) ;
      A265TAM07_UPD_USER_ID = "" ;
      n265TAM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A265TAM07_UPD_USER_ID", A265TAM07_UPD_USER_ID);
      n265TAM07_UPD_USER_ID = ((GXutil.strcmp("", A265TAM07_UPD_USER_ID)==0) ? true : false) ;
      A299TAM07_UPD_CNT = 0 ;
      n299TAM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A299TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)));
      n299TAM07_UPD_CNT = ((0==A299TAM07_UPD_CNT) ? true : false) ;
      A205TAM07_USER_NM = "" ;
      n205TAM07_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A205TAM07_USER_NM", A205TAM07_USER_NM);
      n205TAM07_USER_NM = ((GXutil.strcmp("", A205TAM07_USER_NM)==0) ? true : false) ;
      A313TAM07_USER_KANA_NM = "" ;
      n313TAM07_USER_KANA_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A313TAM07_USER_KANA_NM", A313TAM07_USER_KANA_NM);
      n313TAM07_USER_KANA_NM = ((GXutil.strcmp("", A313TAM07_USER_KANA_NM)==0) ? true : false) ;
      A210TAM07_PWD = "" ;
      n210TAM07_PWD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A210TAM07_PWD", A210TAM07_PWD);
      n210TAM07_PWD = ((GXutil.strcmp("", A210TAM07_PWD)==0) ? true : false) ;
      A56TAM07_AUTH_CD = "" ;
      n56TAM07_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A56TAM07_AUTH_CD", A56TAM07_AUTH_CD);
      n56TAM07_AUTH_CD = ((GXutil.strcmp("", A56TAM07_AUTH_CD)==0) ? true : false) ;
      A333TAM07_SITE_ID = "" ;
      n333TAM07_SITE_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A333TAM07_SITE_ID", A333TAM07_SITE_ID);
      n333TAM07_SITE_ID = ((GXutil.strcmp("", A333TAM07_SITE_ID)==0) ? true : false) ;
      A683TAM07_EMAIL = "" ;
      n683TAM07_EMAIL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A683TAM07_EMAIL", A683TAM07_EMAIL);
      n683TAM07_EMAIL = ((GXutil.strcmp("", A683TAM07_EMAIL)==0) ? true : false) ;
      A996TAM07_ADMIN_AUTH_FLG = "" ;
      n996TAM07_ADMIN_AUTH_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A996TAM07_ADMIN_AUTH_FLG", A996TAM07_ADMIN_AUTH_FLG);
      n996TAM07_ADMIN_AUTH_FLG = ((GXutil.strcmp("", A996TAM07_ADMIN_AUTH_FLG)==0) ? true : false) ;
      A997TAM07_NC_FLG = "" ;
      n997TAM07_NC_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A997TAM07_NC_FLG", A997TAM07_NC_FLG);
      n997TAM07_NC_FLG = ((GXutil.strcmp("", A997TAM07_NC_FLG)==0) ? true : false) ;
      A998TAM07_NOTE = "" ;
      n998TAM07_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A998TAM07_NOTE", A998TAM07_NOTE);
      n998TAM07_NOTE = ((GXutil.strcmp("", A998TAM07_NOTE)==0) ? true : false) ;
      A214TAM07_DEL_FLG = "" ;
      n214TAM07_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A214TAM07_DEL_FLG", A214TAM07_DEL_FLG);
      n214TAM07_DEL_FLG = ((GXutil.strcmp("", A214TAM07_DEL_FLG)==0) ? true : false) ;
      A230TAM07_CRT_PROG_NM = "" ;
      n230TAM07_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A230TAM07_CRT_PROG_NM", A230TAM07_CRT_PROG_NM);
      n230TAM07_CRT_PROG_NM = ((GXutil.strcmp("", A230TAM07_CRT_PROG_NM)==0) ? true : false) ;
      A232TAM07_UPD_PROG_NM = "" ;
      n232TAM07_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A232TAM07_UPD_PROG_NM", A232TAM07_UPD_PROG_NM);
      n232TAM07_UPD_PROG_NM = ((GXutil.strcmp("", A232TAM07_UPD_PROG_NM)==0) ? true : false) ;
      O299TAM07_UPD_CNT = A299TAM07_UPD_CNT ;
      n299TAM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A299TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A299TAM07_UPD_CNT, 10, 0)));
   }

   public void initAll0A10( )
   {
      A55TAM07_USER_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A55TAM07_USER_ID", A55TAM07_USER_ID);
      initializeNonKey0A10( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513184490");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tam07_user.js", "?202071513184490");
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
      lblTextblocktam07_user_id_Internalname = "TEXTBLOCKTAM07_USER_ID" ;
      edtTAM07_USER_ID_Internalname = "TAM07_USER_ID" ;
      lblTextblocktam07_user_nm_Internalname = "TEXTBLOCKTAM07_USER_NM" ;
      edtTAM07_USER_NM_Internalname = "TAM07_USER_NM" ;
      lblTextblocktam07_user_kana_nm_Internalname = "TEXTBLOCKTAM07_USER_KANA_NM" ;
      edtTAM07_USER_KANA_NM_Internalname = "TAM07_USER_KANA_NM" ;
      lblTextblocktam07_pwd_Internalname = "TEXTBLOCKTAM07_PWD" ;
      edtTAM07_PWD_Internalname = "TAM07_PWD" ;
      lblTextblocktam07_auth_cd_Internalname = "TEXTBLOCKTAM07_AUTH_CD" ;
      edtTAM07_AUTH_CD_Internalname = "TAM07_AUTH_CD" ;
      lblTextblocktam07_site_id_Internalname = "TEXTBLOCKTAM07_SITE_ID" ;
      edtTAM07_SITE_ID_Internalname = "TAM07_SITE_ID" ;
      lblTextblocktam07_email_Internalname = "TEXTBLOCKTAM07_EMAIL" ;
      edtTAM07_EMAIL_Internalname = "TAM07_EMAIL" ;
      lblTextblocktam07_admin_auth_flg_Internalname = "TEXTBLOCKTAM07_ADMIN_AUTH_FLG" ;
      edtTAM07_ADMIN_AUTH_FLG_Internalname = "TAM07_ADMIN_AUTH_FLG" ;
      lblTextblocktam07_nc_flg_Internalname = "TEXTBLOCKTAM07_NC_FLG" ;
      edtTAM07_NC_FLG_Internalname = "TAM07_NC_FLG" ;
      lblTextblocktam07_note_Internalname = "TEXTBLOCKTAM07_NOTE" ;
      edtTAM07_NOTE_Internalname = "TAM07_NOTE" ;
      lblTextblocktam07_del_flg_Internalname = "TEXTBLOCKTAM07_DEL_FLG" ;
      edtTAM07_DEL_FLG_Internalname = "TAM07_DEL_FLG" ;
      lblTextblocktam07_crt_datetime_Internalname = "TEXTBLOCKTAM07_CRT_DATETIME" ;
      edtTAM07_CRT_DATETIME_Internalname = "TAM07_CRT_DATETIME" ;
      lblTextblocktam07_crt_user_id_Internalname = "TEXTBLOCKTAM07_CRT_USER_ID" ;
      edtTAM07_CRT_USER_ID_Internalname = "TAM07_CRT_USER_ID" ;
      lblTextblocktam07_crt_prog_nm_Internalname = "TEXTBLOCKTAM07_CRT_PROG_NM" ;
      edtTAM07_CRT_PROG_NM_Internalname = "TAM07_CRT_PROG_NM" ;
      lblTextblocktam07_upd_datetime_Internalname = "TEXTBLOCKTAM07_UPD_DATETIME" ;
      edtTAM07_UPD_DATETIME_Internalname = "TAM07_UPD_DATETIME" ;
      lblTextblocktam07_upd_user_id_Internalname = "TEXTBLOCKTAM07_UPD_USER_ID" ;
      edtTAM07_UPD_USER_ID_Internalname = "TAM07_UPD_USER_ID" ;
      lblTextblocktam07_upd_prog_nm_Internalname = "TEXTBLOCKTAM07_UPD_PROG_NM" ;
      edtTAM07_UPD_PROG_NM_Internalname = "TAM07_UPD_PROG_NM" ;
      lblTextblocktam07_upd_cnt_Internalname = "TEXTBLOCKTAM07_UPD_CNT" ;
      edtTAM07_UPD_CNT_Internalname = "TAM07_UPD_CNT" ;
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
      edtTAM07_UPD_CNT_Jsonclick = "" ;
      edtTAM07_UPD_CNT_Enabled = 1 ;
      edtTAM07_UPD_PROG_NM_Jsonclick = "" ;
      edtTAM07_UPD_PROG_NM_Enabled = 1 ;
      edtTAM07_UPD_USER_ID_Jsonclick = "" ;
      edtTAM07_UPD_USER_ID_Enabled = 1 ;
      edtTAM07_UPD_DATETIME_Jsonclick = "" ;
      edtTAM07_UPD_DATETIME_Enabled = 1 ;
      edtTAM07_CRT_PROG_NM_Jsonclick = "" ;
      edtTAM07_CRT_PROG_NM_Enabled = 1 ;
      edtTAM07_CRT_USER_ID_Jsonclick = "" ;
      edtTAM07_CRT_USER_ID_Enabled = 1 ;
      edtTAM07_CRT_DATETIME_Jsonclick = "" ;
      edtTAM07_CRT_DATETIME_Enabled = 1 ;
      edtTAM07_DEL_FLG_Jsonclick = "" ;
      edtTAM07_DEL_FLG_Enabled = 1 ;
      edtTAM07_NOTE_Enabled = 1 ;
      edtTAM07_NC_FLG_Jsonclick = "" ;
      edtTAM07_NC_FLG_Enabled = 1 ;
      edtTAM07_ADMIN_AUTH_FLG_Jsonclick = "" ;
      edtTAM07_ADMIN_AUTH_FLG_Enabled = 1 ;
      edtTAM07_EMAIL_Enabled = 1 ;
      edtTAM07_SITE_ID_Jsonclick = "" ;
      edtTAM07_SITE_ID_Enabled = 1 ;
      edtTAM07_AUTH_CD_Jsonclick = "" ;
      edtTAM07_AUTH_CD_Enabled = 1 ;
      edtTAM07_PWD_Jsonclick = "" ;
      edtTAM07_PWD_Enabled = 1 ;
      edtTAM07_USER_KANA_NM_Jsonclick = "" ;
      edtTAM07_USER_KANA_NM_Enabled = 1 ;
      edtTAM07_USER_NM_Jsonclick = "" ;
      edtTAM07_USER_NM_Enabled = 1 ;
      edtTAM07_USER_ID_Jsonclick = "" ;
      edtTAM07_USER_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatam07_crt_user_id0A10( String Gx_mode )
   {
      GXt_char1 = A264TAM07_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam07_user_impl.this.GXt_char1 = GXv_char2[0] ;
      A264TAM07_CRT_USER_ID = GXt_char1 ;
      n264TAM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A264TAM07_CRT_USER_ID", A264TAM07_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A264TAM07_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatam07_upd_user_id0A10( String Gx_mode )
   {
      GXt_char1 = A265TAM07_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam07_user_impl.this.GXt_char1 = GXv_char2[0] ;
      A265TAM07_UPD_USER_ID = GXt_char1 ;
      n265TAM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A265TAM07_UPD_USER_ID", A265TAM07_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A265TAM07_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTAM07_USER_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tam07_user_id( String GX_Parm1 ,
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
                                    String GX_Parm12 ,
                                    String GX_Parm13 ,
                                    String GX_Parm14 ,
                                    String GX_Parm15 ,
                                    String GX_Parm16 ,
                                    String GX_Parm17 ,
                                    String GX_Parm18 )
   {
      A55TAM07_USER_ID = GX_Parm1 ;
      A229TAM07_CRT_DATETIME = GX_Parm2 ;
      n229TAM07_CRT_DATETIME = false ;
      A264TAM07_CRT_USER_ID = GX_Parm3 ;
      n264TAM07_CRT_USER_ID = false ;
      A231TAM07_UPD_DATETIME = GX_Parm4 ;
      n231TAM07_UPD_DATETIME = false ;
      A265TAM07_UPD_USER_ID = GX_Parm5 ;
      n265TAM07_UPD_USER_ID = false ;
      A299TAM07_UPD_CNT = GX_Parm6 ;
      n299TAM07_UPD_CNT = false ;
      A205TAM07_USER_NM = GX_Parm7 ;
      n205TAM07_USER_NM = false ;
      A313TAM07_USER_KANA_NM = GX_Parm8 ;
      n313TAM07_USER_KANA_NM = false ;
      A210TAM07_PWD = GX_Parm9 ;
      n210TAM07_PWD = false ;
      A333TAM07_SITE_ID = GX_Parm10 ;
      n333TAM07_SITE_ID = false ;
      A683TAM07_EMAIL = GX_Parm11 ;
      n683TAM07_EMAIL = false ;
      A996TAM07_ADMIN_AUTH_FLG = GX_Parm12 ;
      n996TAM07_ADMIN_AUTH_FLG = false ;
      A997TAM07_NC_FLG = GX_Parm13 ;
      n997TAM07_NC_FLG = false ;
      A998TAM07_NOTE = GX_Parm14 ;
      n998TAM07_NOTE = false ;
      A214TAM07_DEL_FLG = GX_Parm15 ;
      n214TAM07_DEL_FLG = false ;
      A230TAM07_CRT_PROG_NM = GX_Parm16 ;
      n230TAM07_CRT_PROG_NM = false ;
      A232TAM07_UPD_PROG_NM = GX_Parm17 ;
      n232TAM07_UPD_PROG_NM = false ;
      A56TAM07_AUTH_CD = GX_Parm18 ;
      n56TAM07_AUTH_CD = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A229TAM07_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A264TAM07_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A231TAM07_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A265TAM07_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A299TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A205TAM07_USER_NM));
      isValidOutput.add(GXutil.rtrim( A313TAM07_USER_KANA_NM));
      isValidOutput.add(GXutil.rtrim( A210TAM07_PWD));
      isValidOutput.add(GXutil.rtrim( A56TAM07_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A333TAM07_SITE_ID));
      isValidOutput.add(GXutil.rtrim( A683TAM07_EMAIL));
      isValidOutput.add(GXutil.rtrim( A996TAM07_ADMIN_AUTH_FLG));
      isValidOutput.add(GXutil.rtrim( A997TAM07_NC_FLG));
      isValidOutput.add(GXutil.rtrim( A998TAM07_NOTE));
      isValidOutput.add(GXutil.rtrim( A214TAM07_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A230TAM07_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A232TAM07_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z55TAM07_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z229TAM07_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z264TAM07_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z231TAM07_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z265TAM07_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z299TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z205TAM07_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z313TAM07_USER_KANA_NM));
      isValidOutput.add(GXutil.rtrim( Z210TAM07_PWD));
      isValidOutput.add(GXutil.rtrim( Z56TAM07_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z333TAM07_SITE_ID));
      isValidOutput.add(GXutil.rtrim( Z683TAM07_EMAIL));
      isValidOutput.add(GXutil.rtrim( Z996TAM07_ADMIN_AUTH_FLG));
      isValidOutput.add(GXutil.rtrim( Z997TAM07_NC_FLG));
      isValidOutput.add(GXutil.rtrim( Z998TAM07_NOTE));
      isValidOutput.add(GXutil.rtrim( Z214TAM07_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z230TAM07_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z232TAM07_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O299TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tam07_auth_cd( String GX_Parm1 )
   {
      A56TAM07_AUTH_CD = GX_Parm1 ;
      n56TAM07_AUTH_CD = false ;
      /* Using cursor T000A20 */
      pr_default.execute(18, new Object[] {new Boolean(n56TAM07_AUTH_CD), A56TAM07_AUTH_CD});
      if ( (pr_default.getStatus(18) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A56TAM07_AUTH_CD)==0) ) )
         {
            httpContext.GX_msglist.addItem("'ユーザーマスタ・権限サブタイプ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM07_AUTH_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM07_AUTH_CD_Internalname ;
         }
      }
      pr_default.close(18);
      dynload_actions( ) ;
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
      pr_default.close(18);
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
      Z55TAM07_USER_ID = "" ;
      Z229TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z264TAM07_CRT_USER_ID = "" ;
      Z231TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z265TAM07_UPD_USER_ID = "" ;
      Z205TAM07_USER_NM = "" ;
      Z313TAM07_USER_KANA_NM = "" ;
      Z210TAM07_PWD = "" ;
      Z333TAM07_SITE_ID = "" ;
      Z683TAM07_EMAIL = "" ;
      Z996TAM07_ADMIN_AUTH_FLG = "" ;
      Z997TAM07_NC_FLG = "" ;
      Z998TAM07_NOTE = "" ;
      Z214TAM07_DEL_FLG = "" ;
      Z230TAM07_CRT_PROG_NM = "" ;
      Z232TAM07_UPD_PROG_NM = "" ;
      Z56TAM07_AUTH_CD = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      A56TAM07_AUTH_CD = "" ;
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
      lblTextblocktam07_user_id_Jsonclick = "" ;
      A55TAM07_USER_ID = "" ;
      lblTextblocktam07_user_nm_Jsonclick = "" ;
      A205TAM07_USER_NM = "" ;
      lblTextblocktam07_user_kana_nm_Jsonclick = "" ;
      A313TAM07_USER_KANA_NM = "" ;
      lblTextblocktam07_pwd_Jsonclick = "" ;
      A210TAM07_PWD = "" ;
      lblTextblocktam07_auth_cd_Jsonclick = "" ;
      lblTextblocktam07_site_id_Jsonclick = "" ;
      A333TAM07_SITE_ID = "" ;
      lblTextblocktam07_email_Jsonclick = "" ;
      A683TAM07_EMAIL = "" ;
      lblTextblocktam07_admin_auth_flg_Jsonclick = "" ;
      A996TAM07_ADMIN_AUTH_FLG = "" ;
      lblTextblocktam07_nc_flg_Jsonclick = "" ;
      A997TAM07_NC_FLG = "" ;
      lblTextblocktam07_note_Jsonclick = "" ;
      A998TAM07_NOTE = "" ;
      lblTextblocktam07_del_flg_Jsonclick = "" ;
      A214TAM07_DEL_FLG = "" ;
      lblTextblocktam07_crt_datetime_Jsonclick = "" ;
      A229TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam07_crt_user_id_Jsonclick = "" ;
      A264TAM07_CRT_USER_ID = "" ;
      lblTextblocktam07_crt_prog_nm_Jsonclick = "" ;
      A230TAM07_CRT_PROG_NM = "" ;
      lblTextblocktam07_upd_datetime_Jsonclick = "" ;
      A231TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam07_upd_user_id_Jsonclick = "" ;
      A265TAM07_UPD_USER_ID = "" ;
      lblTextblocktam07_upd_prog_nm_Jsonclick = "" ;
      A232TAM07_UPD_PROG_NM = "" ;
      lblTextblocktam07_upd_cnt_Jsonclick = "" ;
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
      T000A5_A55TAM07_USER_ID = new String[] {""} ;
      T000A5_A229TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A5_n229TAM07_CRT_DATETIME = new boolean[] {false} ;
      T000A5_A264TAM07_CRT_USER_ID = new String[] {""} ;
      T000A5_n264TAM07_CRT_USER_ID = new boolean[] {false} ;
      T000A5_A231TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A5_n231TAM07_UPD_DATETIME = new boolean[] {false} ;
      T000A5_A265TAM07_UPD_USER_ID = new String[] {""} ;
      T000A5_n265TAM07_UPD_USER_ID = new boolean[] {false} ;
      T000A5_A299TAM07_UPD_CNT = new long[1] ;
      T000A5_n299TAM07_UPD_CNT = new boolean[] {false} ;
      T000A5_A205TAM07_USER_NM = new String[] {""} ;
      T000A5_n205TAM07_USER_NM = new boolean[] {false} ;
      T000A5_A313TAM07_USER_KANA_NM = new String[] {""} ;
      T000A5_n313TAM07_USER_KANA_NM = new boolean[] {false} ;
      T000A5_A210TAM07_PWD = new String[] {""} ;
      T000A5_n210TAM07_PWD = new boolean[] {false} ;
      T000A5_A333TAM07_SITE_ID = new String[] {""} ;
      T000A5_n333TAM07_SITE_ID = new boolean[] {false} ;
      T000A5_A683TAM07_EMAIL = new String[] {""} ;
      T000A5_n683TAM07_EMAIL = new boolean[] {false} ;
      T000A5_A996TAM07_ADMIN_AUTH_FLG = new String[] {""} ;
      T000A5_n996TAM07_ADMIN_AUTH_FLG = new boolean[] {false} ;
      T000A5_A997TAM07_NC_FLG = new String[] {""} ;
      T000A5_n997TAM07_NC_FLG = new boolean[] {false} ;
      T000A5_A998TAM07_NOTE = new String[] {""} ;
      T000A5_n998TAM07_NOTE = new boolean[] {false} ;
      T000A5_A214TAM07_DEL_FLG = new String[] {""} ;
      T000A5_n214TAM07_DEL_FLG = new boolean[] {false} ;
      T000A5_A230TAM07_CRT_PROG_NM = new String[] {""} ;
      T000A5_n230TAM07_CRT_PROG_NM = new boolean[] {false} ;
      T000A5_A232TAM07_UPD_PROG_NM = new String[] {""} ;
      T000A5_n232TAM07_UPD_PROG_NM = new boolean[] {false} ;
      T000A5_A56TAM07_AUTH_CD = new String[] {""} ;
      T000A5_n56TAM07_AUTH_CD = new boolean[] {false} ;
      T000A4_A56TAM07_AUTH_CD = new String[] {""} ;
      T000A4_n56TAM07_AUTH_CD = new boolean[] {false} ;
      T000A6_A55TAM07_USER_ID = new String[] {""} ;
      T000A3_A55TAM07_USER_ID = new String[] {""} ;
      T000A3_A229TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A3_n229TAM07_CRT_DATETIME = new boolean[] {false} ;
      T000A3_A264TAM07_CRT_USER_ID = new String[] {""} ;
      T000A3_n264TAM07_CRT_USER_ID = new boolean[] {false} ;
      T000A3_A231TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A3_n231TAM07_UPD_DATETIME = new boolean[] {false} ;
      T000A3_A265TAM07_UPD_USER_ID = new String[] {""} ;
      T000A3_n265TAM07_UPD_USER_ID = new boolean[] {false} ;
      T000A3_A299TAM07_UPD_CNT = new long[1] ;
      T000A3_n299TAM07_UPD_CNT = new boolean[] {false} ;
      T000A3_A205TAM07_USER_NM = new String[] {""} ;
      T000A3_n205TAM07_USER_NM = new boolean[] {false} ;
      T000A3_A313TAM07_USER_KANA_NM = new String[] {""} ;
      T000A3_n313TAM07_USER_KANA_NM = new boolean[] {false} ;
      T000A3_A210TAM07_PWD = new String[] {""} ;
      T000A3_n210TAM07_PWD = new boolean[] {false} ;
      T000A3_A333TAM07_SITE_ID = new String[] {""} ;
      T000A3_n333TAM07_SITE_ID = new boolean[] {false} ;
      T000A3_A683TAM07_EMAIL = new String[] {""} ;
      T000A3_n683TAM07_EMAIL = new boolean[] {false} ;
      T000A3_A996TAM07_ADMIN_AUTH_FLG = new String[] {""} ;
      T000A3_n996TAM07_ADMIN_AUTH_FLG = new boolean[] {false} ;
      T000A3_A997TAM07_NC_FLG = new String[] {""} ;
      T000A3_n997TAM07_NC_FLG = new boolean[] {false} ;
      T000A3_A998TAM07_NOTE = new String[] {""} ;
      T000A3_n998TAM07_NOTE = new boolean[] {false} ;
      T000A3_A214TAM07_DEL_FLG = new String[] {""} ;
      T000A3_n214TAM07_DEL_FLG = new boolean[] {false} ;
      T000A3_A230TAM07_CRT_PROG_NM = new String[] {""} ;
      T000A3_n230TAM07_CRT_PROG_NM = new boolean[] {false} ;
      T000A3_A232TAM07_UPD_PROG_NM = new String[] {""} ;
      T000A3_n232TAM07_UPD_PROG_NM = new boolean[] {false} ;
      T000A3_A56TAM07_AUTH_CD = new String[] {""} ;
      T000A3_n56TAM07_AUTH_CD = new boolean[] {false} ;
      sMode10 = "" ;
      T000A7_A55TAM07_USER_ID = new String[] {""} ;
      T000A8_A55TAM07_USER_ID = new String[] {""} ;
      T000A2_A55TAM07_USER_ID = new String[] {""} ;
      T000A2_A229TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A2_n229TAM07_CRT_DATETIME = new boolean[] {false} ;
      T000A2_A264TAM07_CRT_USER_ID = new String[] {""} ;
      T000A2_n264TAM07_CRT_USER_ID = new boolean[] {false} ;
      T000A2_A231TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A2_n231TAM07_UPD_DATETIME = new boolean[] {false} ;
      T000A2_A265TAM07_UPD_USER_ID = new String[] {""} ;
      T000A2_n265TAM07_UPD_USER_ID = new boolean[] {false} ;
      T000A2_A299TAM07_UPD_CNT = new long[1] ;
      T000A2_n299TAM07_UPD_CNT = new boolean[] {false} ;
      T000A2_A205TAM07_USER_NM = new String[] {""} ;
      T000A2_n205TAM07_USER_NM = new boolean[] {false} ;
      T000A2_A313TAM07_USER_KANA_NM = new String[] {""} ;
      T000A2_n313TAM07_USER_KANA_NM = new boolean[] {false} ;
      T000A2_A210TAM07_PWD = new String[] {""} ;
      T000A2_n210TAM07_PWD = new boolean[] {false} ;
      T000A2_A333TAM07_SITE_ID = new String[] {""} ;
      T000A2_n333TAM07_SITE_ID = new boolean[] {false} ;
      T000A2_A683TAM07_EMAIL = new String[] {""} ;
      T000A2_n683TAM07_EMAIL = new boolean[] {false} ;
      T000A2_A996TAM07_ADMIN_AUTH_FLG = new String[] {""} ;
      T000A2_n996TAM07_ADMIN_AUTH_FLG = new boolean[] {false} ;
      T000A2_A997TAM07_NC_FLG = new String[] {""} ;
      T000A2_n997TAM07_NC_FLG = new boolean[] {false} ;
      T000A2_A998TAM07_NOTE = new String[] {""} ;
      T000A2_n998TAM07_NOTE = new boolean[] {false} ;
      T000A2_A214TAM07_DEL_FLG = new String[] {""} ;
      T000A2_n214TAM07_DEL_FLG = new boolean[] {false} ;
      T000A2_A230TAM07_CRT_PROG_NM = new String[] {""} ;
      T000A2_n230TAM07_CRT_PROG_NM = new boolean[] {false} ;
      T000A2_A232TAM07_UPD_PROG_NM = new String[] {""} ;
      T000A2_n232TAM07_UPD_PROG_NM = new boolean[] {false} ;
      T000A2_A56TAM07_AUTH_CD = new String[] {""} ;
      T000A2_n56TAM07_AUTH_CD = new boolean[] {false} ;
      T000A12_A110TBW03_SESSION_ID = new String[] {""} ;
      T000A12_A111TBW03_APP_ID = new String[] {""} ;
      T000A12_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T000A12_A113TBW03_STUDY_ID = new long[1] ;
      T000A12_A114TBW03_SUBJECT_ID = new int[1] ;
      T000A12_A115TBW03_CRF_ID = new short[1] ;
      T000A13_A110TBW03_SESSION_ID = new String[] {""} ;
      T000A13_A111TBW03_APP_ID = new String[] {""} ;
      T000A13_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T000A13_A113TBW03_STUDY_ID = new long[1] ;
      T000A13_A114TBW03_SUBJECT_ID = new int[1] ;
      T000A13_A115TBW03_CRF_ID = new short[1] ;
      T000A14_A110TBW03_SESSION_ID = new String[] {""} ;
      T000A14_A111TBW03_APP_ID = new String[] {""} ;
      T000A14_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T000A14_A113TBW03_STUDY_ID = new long[1] ;
      T000A14_A114TBW03_SUBJECT_ID = new int[1] ;
      T000A14_A115TBW03_CRF_ID = new short[1] ;
      T000A15_A110TBW03_SESSION_ID = new String[] {""} ;
      T000A15_A111TBW03_APP_ID = new String[] {""} ;
      T000A15_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T000A15_A113TBW03_STUDY_ID = new long[1] ;
      T000A15_A114TBW03_SUBJECT_ID = new int[1] ;
      T000A15_A115TBW03_CRF_ID = new short[1] ;
      T000A16_A110TBW03_SESSION_ID = new String[] {""} ;
      T000A16_A111TBW03_APP_ID = new String[] {""} ;
      T000A16_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T000A16_A113TBW03_STUDY_ID = new long[1] ;
      T000A16_A114TBW03_SUBJECT_ID = new int[1] ;
      T000A16_A115TBW03_CRF_ID = new short[1] ;
      T000A17_A110TBW03_SESSION_ID = new String[] {""} ;
      T000A17_A111TBW03_APP_ID = new String[] {""} ;
      T000A17_A112TBW03_DISP_DATETIME = new String[] {""} ;
      T000A17_A113TBW03_STUDY_ID = new long[1] ;
      T000A17_A114TBW03_SUBJECT_ID = new int[1] ;
      T000A17_A115TBW03_CRF_ID = new short[1] ;
      T000A18_A107TBM23_STUDY_ID = new long[1] ;
      T000A18_A108TBM23_USER_ID = new String[] {""} ;
      T000A18_A109TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000A19_A55TAM07_USER_ID = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      T000A20_A56TAM07_AUTH_CD = new String[] {""} ;
      T000A20_n56TAM07_AUTH_CD = new boolean[] {false} ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam07_user__default(),
         new Object[] {
             new Object[] {
            T000A2_A55TAM07_USER_ID, T000A2_A229TAM07_CRT_DATETIME, T000A2_n229TAM07_CRT_DATETIME, T000A2_A264TAM07_CRT_USER_ID, T000A2_n264TAM07_CRT_USER_ID, T000A2_A231TAM07_UPD_DATETIME, T000A2_n231TAM07_UPD_DATETIME, T000A2_A265TAM07_UPD_USER_ID, T000A2_n265TAM07_UPD_USER_ID, T000A2_A299TAM07_UPD_CNT,
            T000A2_n299TAM07_UPD_CNT, T000A2_A205TAM07_USER_NM, T000A2_n205TAM07_USER_NM, T000A2_A313TAM07_USER_KANA_NM, T000A2_n313TAM07_USER_KANA_NM, T000A2_A210TAM07_PWD, T000A2_n210TAM07_PWD, T000A2_A333TAM07_SITE_ID, T000A2_n333TAM07_SITE_ID, T000A2_A683TAM07_EMAIL,
            T000A2_n683TAM07_EMAIL, T000A2_A996TAM07_ADMIN_AUTH_FLG, T000A2_n996TAM07_ADMIN_AUTH_FLG, T000A2_A997TAM07_NC_FLG, T000A2_n997TAM07_NC_FLG, T000A2_A998TAM07_NOTE, T000A2_n998TAM07_NOTE, T000A2_A214TAM07_DEL_FLG, T000A2_n214TAM07_DEL_FLG, T000A2_A230TAM07_CRT_PROG_NM,
            T000A2_n230TAM07_CRT_PROG_NM, T000A2_A232TAM07_UPD_PROG_NM, T000A2_n232TAM07_UPD_PROG_NM, T000A2_A56TAM07_AUTH_CD, T000A2_n56TAM07_AUTH_CD
            }
            , new Object[] {
            T000A3_A55TAM07_USER_ID, T000A3_A229TAM07_CRT_DATETIME, T000A3_n229TAM07_CRT_DATETIME, T000A3_A264TAM07_CRT_USER_ID, T000A3_n264TAM07_CRT_USER_ID, T000A3_A231TAM07_UPD_DATETIME, T000A3_n231TAM07_UPD_DATETIME, T000A3_A265TAM07_UPD_USER_ID, T000A3_n265TAM07_UPD_USER_ID, T000A3_A299TAM07_UPD_CNT,
            T000A3_n299TAM07_UPD_CNT, T000A3_A205TAM07_USER_NM, T000A3_n205TAM07_USER_NM, T000A3_A313TAM07_USER_KANA_NM, T000A3_n313TAM07_USER_KANA_NM, T000A3_A210TAM07_PWD, T000A3_n210TAM07_PWD, T000A3_A333TAM07_SITE_ID, T000A3_n333TAM07_SITE_ID, T000A3_A683TAM07_EMAIL,
            T000A3_n683TAM07_EMAIL, T000A3_A996TAM07_ADMIN_AUTH_FLG, T000A3_n996TAM07_ADMIN_AUTH_FLG, T000A3_A997TAM07_NC_FLG, T000A3_n997TAM07_NC_FLG, T000A3_A998TAM07_NOTE, T000A3_n998TAM07_NOTE, T000A3_A214TAM07_DEL_FLG, T000A3_n214TAM07_DEL_FLG, T000A3_A230TAM07_CRT_PROG_NM,
            T000A3_n230TAM07_CRT_PROG_NM, T000A3_A232TAM07_UPD_PROG_NM, T000A3_n232TAM07_UPD_PROG_NM, T000A3_A56TAM07_AUTH_CD, T000A3_n56TAM07_AUTH_CD
            }
            , new Object[] {
            T000A4_A56TAM07_AUTH_CD
            }
            , new Object[] {
            T000A5_A55TAM07_USER_ID, T000A5_A229TAM07_CRT_DATETIME, T000A5_n229TAM07_CRT_DATETIME, T000A5_A264TAM07_CRT_USER_ID, T000A5_n264TAM07_CRT_USER_ID, T000A5_A231TAM07_UPD_DATETIME, T000A5_n231TAM07_UPD_DATETIME, T000A5_A265TAM07_UPD_USER_ID, T000A5_n265TAM07_UPD_USER_ID, T000A5_A299TAM07_UPD_CNT,
            T000A5_n299TAM07_UPD_CNT, T000A5_A205TAM07_USER_NM, T000A5_n205TAM07_USER_NM, T000A5_A313TAM07_USER_KANA_NM, T000A5_n313TAM07_USER_KANA_NM, T000A5_A210TAM07_PWD, T000A5_n210TAM07_PWD, T000A5_A333TAM07_SITE_ID, T000A5_n333TAM07_SITE_ID, T000A5_A683TAM07_EMAIL,
            T000A5_n683TAM07_EMAIL, T000A5_A996TAM07_ADMIN_AUTH_FLG, T000A5_n996TAM07_ADMIN_AUTH_FLG, T000A5_A997TAM07_NC_FLG, T000A5_n997TAM07_NC_FLG, T000A5_A998TAM07_NOTE, T000A5_n998TAM07_NOTE, T000A5_A214TAM07_DEL_FLG, T000A5_n214TAM07_DEL_FLG, T000A5_A230TAM07_CRT_PROG_NM,
            T000A5_n230TAM07_CRT_PROG_NM, T000A5_A232TAM07_UPD_PROG_NM, T000A5_n232TAM07_UPD_PROG_NM, T000A5_A56TAM07_AUTH_CD, T000A5_n56TAM07_AUTH_CD
            }
            , new Object[] {
            T000A6_A55TAM07_USER_ID
            }
            , new Object[] {
            T000A7_A55TAM07_USER_ID
            }
            , new Object[] {
            T000A8_A55TAM07_USER_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000A12_A110TBW03_SESSION_ID, T000A12_A111TBW03_APP_ID, T000A12_A112TBW03_DISP_DATETIME, T000A12_A113TBW03_STUDY_ID, T000A12_A114TBW03_SUBJECT_ID, T000A12_A115TBW03_CRF_ID
            }
            , new Object[] {
            T000A13_A110TBW03_SESSION_ID, T000A13_A111TBW03_APP_ID, T000A13_A112TBW03_DISP_DATETIME, T000A13_A113TBW03_STUDY_ID, T000A13_A114TBW03_SUBJECT_ID, T000A13_A115TBW03_CRF_ID
            }
            , new Object[] {
            T000A14_A110TBW03_SESSION_ID, T000A14_A111TBW03_APP_ID, T000A14_A112TBW03_DISP_DATETIME, T000A14_A113TBW03_STUDY_ID, T000A14_A114TBW03_SUBJECT_ID, T000A14_A115TBW03_CRF_ID
            }
            , new Object[] {
            T000A15_A110TBW03_SESSION_ID, T000A15_A111TBW03_APP_ID, T000A15_A112TBW03_DISP_DATETIME, T000A15_A113TBW03_STUDY_ID, T000A15_A114TBW03_SUBJECT_ID, T000A15_A115TBW03_CRF_ID
            }
            , new Object[] {
            T000A16_A110TBW03_SESSION_ID, T000A16_A111TBW03_APP_ID, T000A16_A112TBW03_DISP_DATETIME, T000A16_A113TBW03_STUDY_ID, T000A16_A114TBW03_SUBJECT_ID, T000A16_A115TBW03_CRF_ID
            }
            , new Object[] {
            T000A17_A110TBW03_SESSION_ID, T000A17_A111TBW03_APP_ID, T000A17_A112TBW03_DISP_DATETIME, T000A17_A113TBW03_STUDY_ID, T000A17_A114TBW03_SUBJECT_ID, T000A17_A115TBW03_CRF_ID
            }
            , new Object[] {
            T000A18_A107TBM23_STUDY_ID, T000A18_A108TBM23_USER_ID, T000A18_A109TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            T000A19_A55TAM07_USER_ID
            }
            , new Object[] {
            T000A20_A56TAM07_AUTH_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TAM07_USER" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound10 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTAM07_USER_ID_Enabled ;
   private int edtTAM07_USER_NM_Enabled ;
   private int edtTAM07_USER_KANA_NM_Enabled ;
   private int edtTAM07_PWD_Enabled ;
   private int edtTAM07_AUTH_CD_Enabled ;
   private int edtTAM07_SITE_ID_Enabled ;
   private int edtTAM07_EMAIL_Enabled ;
   private int edtTAM07_ADMIN_AUTH_FLG_Enabled ;
   private int edtTAM07_NC_FLG_Enabled ;
   private int edtTAM07_NOTE_Enabled ;
   private int edtTAM07_DEL_FLG_Enabled ;
   private int edtTAM07_CRT_DATETIME_Enabled ;
   private int edtTAM07_CRT_USER_ID_Enabled ;
   private int edtTAM07_CRT_PROG_NM_Enabled ;
   private int edtTAM07_UPD_DATETIME_Enabled ;
   private int edtTAM07_UPD_USER_ID_Enabled ;
   private int edtTAM07_UPD_PROG_NM_Enabled ;
   private int edtTAM07_UPD_CNT_Enabled ;
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
   private long Z299TAM07_UPD_CNT ;
   private long O299TAM07_UPD_CNT ;
   private long A299TAM07_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTAM07_USER_ID_Internalname ;
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
   private String lblTextblocktam07_user_id_Internalname ;
   private String lblTextblocktam07_user_id_Jsonclick ;
   private String edtTAM07_USER_ID_Jsonclick ;
   private String lblTextblocktam07_user_nm_Internalname ;
   private String lblTextblocktam07_user_nm_Jsonclick ;
   private String edtTAM07_USER_NM_Internalname ;
   private String edtTAM07_USER_NM_Jsonclick ;
   private String lblTextblocktam07_user_kana_nm_Internalname ;
   private String lblTextblocktam07_user_kana_nm_Jsonclick ;
   private String edtTAM07_USER_KANA_NM_Internalname ;
   private String edtTAM07_USER_KANA_NM_Jsonclick ;
   private String lblTextblocktam07_pwd_Internalname ;
   private String lblTextblocktam07_pwd_Jsonclick ;
   private String edtTAM07_PWD_Internalname ;
   private String edtTAM07_PWD_Jsonclick ;
   private String lblTextblocktam07_auth_cd_Internalname ;
   private String lblTextblocktam07_auth_cd_Jsonclick ;
   private String edtTAM07_AUTH_CD_Internalname ;
   private String edtTAM07_AUTH_CD_Jsonclick ;
   private String lblTextblocktam07_site_id_Internalname ;
   private String lblTextblocktam07_site_id_Jsonclick ;
   private String edtTAM07_SITE_ID_Internalname ;
   private String edtTAM07_SITE_ID_Jsonclick ;
   private String lblTextblocktam07_email_Internalname ;
   private String lblTextblocktam07_email_Jsonclick ;
   private String edtTAM07_EMAIL_Internalname ;
   private String lblTextblocktam07_admin_auth_flg_Internalname ;
   private String lblTextblocktam07_admin_auth_flg_Jsonclick ;
   private String edtTAM07_ADMIN_AUTH_FLG_Internalname ;
   private String edtTAM07_ADMIN_AUTH_FLG_Jsonclick ;
   private String lblTextblocktam07_nc_flg_Internalname ;
   private String lblTextblocktam07_nc_flg_Jsonclick ;
   private String edtTAM07_NC_FLG_Internalname ;
   private String edtTAM07_NC_FLG_Jsonclick ;
   private String lblTextblocktam07_note_Internalname ;
   private String lblTextblocktam07_note_Jsonclick ;
   private String edtTAM07_NOTE_Internalname ;
   private String lblTextblocktam07_del_flg_Internalname ;
   private String lblTextblocktam07_del_flg_Jsonclick ;
   private String edtTAM07_DEL_FLG_Internalname ;
   private String edtTAM07_DEL_FLG_Jsonclick ;
   private String lblTextblocktam07_crt_datetime_Internalname ;
   private String lblTextblocktam07_crt_datetime_Jsonclick ;
   private String edtTAM07_CRT_DATETIME_Internalname ;
   private String edtTAM07_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktam07_crt_user_id_Internalname ;
   private String lblTextblocktam07_crt_user_id_Jsonclick ;
   private String edtTAM07_CRT_USER_ID_Internalname ;
   private String edtTAM07_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktam07_crt_prog_nm_Internalname ;
   private String lblTextblocktam07_crt_prog_nm_Jsonclick ;
   private String edtTAM07_CRT_PROG_NM_Internalname ;
   private String edtTAM07_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktam07_upd_datetime_Internalname ;
   private String lblTextblocktam07_upd_datetime_Jsonclick ;
   private String edtTAM07_UPD_DATETIME_Internalname ;
   private String edtTAM07_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktam07_upd_user_id_Internalname ;
   private String lblTextblocktam07_upd_user_id_Jsonclick ;
   private String edtTAM07_UPD_USER_ID_Internalname ;
   private String edtTAM07_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktam07_upd_prog_nm_Internalname ;
   private String lblTextblocktam07_upd_prog_nm_Jsonclick ;
   private String edtTAM07_UPD_PROG_NM_Internalname ;
   private String edtTAM07_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktam07_upd_cnt_Internalname ;
   private String lblTextblocktam07_upd_cnt_Jsonclick ;
   private String edtTAM07_UPD_CNT_Internalname ;
   private String edtTAM07_UPD_CNT_Jsonclick ;
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
   private String sMode10 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z229TAM07_CRT_DATETIME ;
   private java.util.Date Z231TAM07_UPD_DATETIME ;
   private java.util.Date A229TAM07_CRT_DATETIME ;
   private java.util.Date A231TAM07_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n56TAM07_AUTH_CD ;
   private boolean wbErr ;
   private boolean n205TAM07_USER_NM ;
   private boolean n313TAM07_USER_KANA_NM ;
   private boolean n210TAM07_PWD ;
   private boolean n333TAM07_SITE_ID ;
   private boolean n683TAM07_EMAIL ;
   private boolean n996TAM07_ADMIN_AUTH_FLG ;
   private boolean n997TAM07_NC_FLG ;
   private boolean n998TAM07_NOTE ;
   private boolean n214TAM07_DEL_FLG ;
   private boolean n229TAM07_CRT_DATETIME ;
   private boolean n264TAM07_CRT_USER_ID ;
   private boolean n230TAM07_CRT_PROG_NM ;
   private boolean n231TAM07_UPD_DATETIME ;
   private boolean n265TAM07_UPD_USER_ID ;
   private boolean n232TAM07_UPD_PROG_NM ;
   private boolean n299TAM07_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z55TAM07_USER_ID ;
   private String Z264TAM07_CRT_USER_ID ;
   private String Z265TAM07_UPD_USER_ID ;
   private String Z205TAM07_USER_NM ;
   private String Z313TAM07_USER_KANA_NM ;
   private String Z210TAM07_PWD ;
   private String Z333TAM07_SITE_ID ;
   private String Z683TAM07_EMAIL ;
   private String Z996TAM07_ADMIN_AUTH_FLG ;
   private String Z997TAM07_NC_FLG ;
   private String Z998TAM07_NOTE ;
   private String Z214TAM07_DEL_FLG ;
   private String Z230TAM07_CRT_PROG_NM ;
   private String Z232TAM07_UPD_PROG_NM ;
   private String Z56TAM07_AUTH_CD ;
   private String A56TAM07_AUTH_CD ;
   private String A55TAM07_USER_ID ;
   private String A205TAM07_USER_NM ;
   private String A313TAM07_USER_KANA_NM ;
   private String A210TAM07_PWD ;
   private String A333TAM07_SITE_ID ;
   private String A683TAM07_EMAIL ;
   private String A996TAM07_ADMIN_AUTH_FLG ;
   private String A997TAM07_NC_FLG ;
   private String A998TAM07_NOTE ;
   private String A214TAM07_DEL_FLG ;
   private String A264TAM07_CRT_USER_ID ;
   private String A230TAM07_CRT_PROG_NM ;
   private String A265TAM07_UPD_USER_ID ;
   private String A232TAM07_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000A5_A55TAM07_USER_ID ;
   private java.util.Date[] T000A5_A229TAM07_CRT_DATETIME ;
   private boolean[] T000A5_n229TAM07_CRT_DATETIME ;
   private String[] T000A5_A264TAM07_CRT_USER_ID ;
   private boolean[] T000A5_n264TAM07_CRT_USER_ID ;
   private java.util.Date[] T000A5_A231TAM07_UPD_DATETIME ;
   private boolean[] T000A5_n231TAM07_UPD_DATETIME ;
   private String[] T000A5_A265TAM07_UPD_USER_ID ;
   private boolean[] T000A5_n265TAM07_UPD_USER_ID ;
   private long[] T000A5_A299TAM07_UPD_CNT ;
   private boolean[] T000A5_n299TAM07_UPD_CNT ;
   private String[] T000A5_A205TAM07_USER_NM ;
   private boolean[] T000A5_n205TAM07_USER_NM ;
   private String[] T000A5_A313TAM07_USER_KANA_NM ;
   private boolean[] T000A5_n313TAM07_USER_KANA_NM ;
   private String[] T000A5_A210TAM07_PWD ;
   private boolean[] T000A5_n210TAM07_PWD ;
   private String[] T000A5_A333TAM07_SITE_ID ;
   private boolean[] T000A5_n333TAM07_SITE_ID ;
   private String[] T000A5_A683TAM07_EMAIL ;
   private boolean[] T000A5_n683TAM07_EMAIL ;
   private String[] T000A5_A996TAM07_ADMIN_AUTH_FLG ;
   private boolean[] T000A5_n996TAM07_ADMIN_AUTH_FLG ;
   private String[] T000A5_A997TAM07_NC_FLG ;
   private boolean[] T000A5_n997TAM07_NC_FLG ;
   private String[] T000A5_A998TAM07_NOTE ;
   private boolean[] T000A5_n998TAM07_NOTE ;
   private String[] T000A5_A214TAM07_DEL_FLG ;
   private boolean[] T000A5_n214TAM07_DEL_FLG ;
   private String[] T000A5_A230TAM07_CRT_PROG_NM ;
   private boolean[] T000A5_n230TAM07_CRT_PROG_NM ;
   private String[] T000A5_A232TAM07_UPD_PROG_NM ;
   private boolean[] T000A5_n232TAM07_UPD_PROG_NM ;
   private String[] T000A5_A56TAM07_AUTH_CD ;
   private boolean[] T000A5_n56TAM07_AUTH_CD ;
   private String[] T000A4_A56TAM07_AUTH_CD ;
   private boolean[] T000A4_n56TAM07_AUTH_CD ;
   private String[] T000A6_A55TAM07_USER_ID ;
   private String[] T000A3_A55TAM07_USER_ID ;
   private java.util.Date[] T000A3_A229TAM07_CRT_DATETIME ;
   private boolean[] T000A3_n229TAM07_CRT_DATETIME ;
   private String[] T000A3_A264TAM07_CRT_USER_ID ;
   private boolean[] T000A3_n264TAM07_CRT_USER_ID ;
   private java.util.Date[] T000A3_A231TAM07_UPD_DATETIME ;
   private boolean[] T000A3_n231TAM07_UPD_DATETIME ;
   private String[] T000A3_A265TAM07_UPD_USER_ID ;
   private boolean[] T000A3_n265TAM07_UPD_USER_ID ;
   private long[] T000A3_A299TAM07_UPD_CNT ;
   private boolean[] T000A3_n299TAM07_UPD_CNT ;
   private String[] T000A3_A205TAM07_USER_NM ;
   private boolean[] T000A3_n205TAM07_USER_NM ;
   private String[] T000A3_A313TAM07_USER_KANA_NM ;
   private boolean[] T000A3_n313TAM07_USER_KANA_NM ;
   private String[] T000A3_A210TAM07_PWD ;
   private boolean[] T000A3_n210TAM07_PWD ;
   private String[] T000A3_A333TAM07_SITE_ID ;
   private boolean[] T000A3_n333TAM07_SITE_ID ;
   private String[] T000A3_A683TAM07_EMAIL ;
   private boolean[] T000A3_n683TAM07_EMAIL ;
   private String[] T000A3_A996TAM07_ADMIN_AUTH_FLG ;
   private boolean[] T000A3_n996TAM07_ADMIN_AUTH_FLG ;
   private String[] T000A3_A997TAM07_NC_FLG ;
   private boolean[] T000A3_n997TAM07_NC_FLG ;
   private String[] T000A3_A998TAM07_NOTE ;
   private boolean[] T000A3_n998TAM07_NOTE ;
   private String[] T000A3_A214TAM07_DEL_FLG ;
   private boolean[] T000A3_n214TAM07_DEL_FLG ;
   private String[] T000A3_A230TAM07_CRT_PROG_NM ;
   private boolean[] T000A3_n230TAM07_CRT_PROG_NM ;
   private String[] T000A3_A232TAM07_UPD_PROG_NM ;
   private boolean[] T000A3_n232TAM07_UPD_PROG_NM ;
   private String[] T000A3_A56TAM07_AUTH_CD ;
   private boolean[] T000A3_n56TAM07_AUTH_CD ;
   private String[] T000A7_A55TAM07_USER_ID ;
   private String[] T000A8_A55TAM07_USER_ID ;
   private String[] T000A2_A55TAM07_USER_ID ;
   private java.util.Date[] T000A2_A229TAM07_CRT_DATETIME ;
   private boolean[] T000A2_n229TAM07_CRT_DATETIME ;
   private String[] T000A2_A264TAM07_CRT_USER_ID ;
   private boolean[] T000A2_n264TAM07_CRT_USER_ID ;
   private java.util.Date[] T000A2_A231TAM07_UPD_DATETIME ;
   private boolean[] T000A2_n231TAM07_UPD_DATETIME ;
   private String[] T000A2_A265TAM07_UPD_USER_ID ;
   private boolean[] T000A2_n265TAM07_UPD_USER_ID ;
   private long[] T000A2_A299TAM07_UPD_CNT ;
   private boolean[] T000A2_n299TAM07_UPD_CNT ;
   private String[] T000A2_A205TAM07_USER_NM ;
   private boolean[] T000A2_n205TAM07_USER_NM ;
   private String[] T000A2_A313TAM07_USER_KANA_NM ;
   private boolean[] T000A2_n313TAM07_USER_KANA_NM ;
   private String[] T000A2_A210TAM07_PWD ;
   private boolean[] T000A2_n210TAM07_PWD ;
   private String[] T000A2_A333TAM07_SITE_ID ;
   private boolean[] T000A2_n333TAM07_SITE_ID ;
   private String[] T000A2_A683TAM07_EMAIL ;
   private boolean[] T000A2_n683TAM07_EMAIL ;
   private String[] T000A2_A996TAM07_ADMIN_AUTH_FLG ;
   private boolean[] T000A2_n996TAM07_ADMIN_AUTH_FLG ;
   private String[] T000A2_A997TAM07_NC_FLG ;
   private boolean[] T000A2_n997TAM07_NC_FLG ;
   private String[] T000A2_A998TAM07_NOTE ;
   private boolean[] T000A2_n998TAM07_NOTE ;
   private String[] T000A2_A214TAM07_DEL_FLG ;
   private boolean[] T000A2_n214TAM07_DEL_FLG ;
   private String[] T000A2_A230TAM07_CRT_PROG_NM ;
   private boolean[] T000A2_n230TAM07_CRT_PROG_NM ;
   private String[] T000A2_A232TAM07_UPD_PROG_NM ;
   private boolean[] T000A2_n232TAM07_UPD_PROG_NM ;
   private String[] T000A2_A56TAM07_AUTH_CD ;
   private boolean[] T000A2_n56TAM07_AUTH_CD ;
   private String[] T000A12_A110TBW03_SESSION_ID ;
   private String[] T000A12_A111TBW03_APP_ID ;
   private String[] T000A12_A112TBW03_DISP_DATETIME ;
   private long[] T000A12_A113TBW03_STUDY_ID ;
   private int[] T000A12_A114TBW03_SUBJECT_ID ;
   private short[] T000A12_A115TBW03_CRF_ID ;
   private String[] T000A13_A110TBW03_SESSION_ID ;
   private String[] T000A13_A111TBW03_APP_ID ;
   private String[] T000A13_A112TBW03_DISP_DATETIME ;
   private long[] T000A13_A113TBW03_STUDY_ID ;
   private int[] T000A13_A114TBW03_SUBJECT_ID ;
   private short[] T000A13_A115TBW03_CRF_ID ;
   private String[] T000A14_A110TBW03_SESSION_ID ;
   private String[] T000A14_A111TBW03_APP_ID ;
   private String[] T000A14_A112TBW03_DISP_DATETIME ;
   private long[] T000A14_A113TBW03_STUDY_ID ;
   private int[] T000A14_A114TBW03_SUBJECT_ID ;
   private short[] T000A14_A115TBW03_CRF_ID ;
   private String[] T000A15_A110TBW03_SESSION_ID ;
   private String[] T000A15_A111TBW03_APP_ID ;
   private String[] T000A15_A112TBW03_DISP_DATETIME ;
   private long[] T000A15_A113TBW03_STUDY_ID ;
   private int[] T000A15_A114TBW03_SUBJECT_ID ;
   private short[] T000A15_A115TBW03_CRF_ID ;
   private String[] T000A16_A110TBW03_SESSION_ID ;
   private String[] T000A16_A111TBW03_APP_ID ;
   private String[] T000A16_A112TBW03_DISP_DATETIME ;
   private long[] T000A16_A113TBW03_STUDY_ID ;
   private int[] T000A16_A114TBW03_SUBJECT_ID ;
   private short[] T000A16_A115TBW03_CRF_ID ;
   private String[] T000A17_A110TBW03_SESSION_ID ;
   private String[] T000A17_A111TBW03_APP_ID ;
   private String[] T000A17_A112TBW03_DISP_DATETIME ;
   private long[] T000A17_A113TBW03_STUDY_ID ;
   private int[] T000A17_A114TBW03_SUBJECT_ID ;
   private short[] T000A17_A115TBW03_CRF_ID ;
   private long[] T000A18_A107TBM23_STUDY_ID ;
   private String[] T000A18_A108TBM23_USER_ID ;
   private String[] T000A18_A109TBM23_STYDY_AUTH_CD ;
   private String[] T000A19_A55TAM07_USER_ID ;
   private String[] T000A20_A56TAM07_AUTH_CD ;
   private boolean[] T000A20_n56TAM07_AUTH_CD ;
}

final  class tam07_user__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000A2", "SELECT `TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_ADMIN_AUTH_FLG`, `TAM07_NC_FLG`, `TAM07_NOTE`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A3", "SELECT `TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_ADMIN_AUTH_FLG`, `TAM07_NC_FLG`, `TAM07_NOTE`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A4", "SELECT `TAM04_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A5", "SELECT TM1.`TAM07_USER_ID`, TM1.`TAM07_CRT_DATETIME`, TM1.`TAM07_CRT_USER_ID`, TM1.`TAM07_UPD_DATETIME`, TM1.`TAM07_UPD_USER_ID`, TM1.`TAM07_UPD_CNT`, TM1.`TAM07_USER_NM`, TM1.`TAM07_USER_KANA_NM`, TM1.`TAM07_PWD`, TM1.`TAM07_SITE_ID`, TM1.`TAM07_EMAIL`, TM1.`TAM07_ADMIN_AUTH_FLG`, TM1.`TAM07_NC_FLG`, TM1.`TAM07_NOTE`, TM1.`TAM07_DEL_FLG`, TM1.`TAM07_CRT_PROG_NM`, TM1.`TAM07_UPD_PROG_NM`, TM1.`TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` TM1 WHERE TM1.`TAM07_USER_ID` = ? ORDER BY TM1.`TAM07_USER_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000A6", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A7", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE ( `TAM07_USER_ID` > ?) ORDER BY `TAM07_USER_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A8", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE ( `TAM07_USER_ID` < ?) ORDER BY `TAM07_USER_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000A9", "INSERT INTO `TAM07_USER`(`TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_ADMIN_AUTH_FLG`, `TAM07_NC_FLG`, `TAM07_NOTE`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000A10", "UPDATE `TAM07_USER` SET `TAM07_CRT_DATETIME`=?, `TAM07_CRT_USER_ID`=?, `TAM07_UPD_DATETIME`=?, `TAM07_UPD_USER_ID`=?, `TAM07_UPD_CNT`=?, `TAM07_USER_NM`=?, `TAM07_USER_KANA_NM`=?, `TAM07_PWD`=?, `TAM07_SITE_ID`=?, `TAM07_EMAIL`=?, `TAM07_ADMIN_AUTH_FLG`=?, `TAM07_NC_FLG`=?, `TAM07_NOTE`=?, `TAM07_DEL_FLG`=?, `TAM07_CRT_PROG_NM`=?, `TAM07_UPD_PROG_NM`=?, `TAM07_AUTH_CD`=?  WHERE `TAM07_USER_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000A11", "DELETE FROM `TAM07_USER`  WHERE `TAM07_USER_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000A12", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_UPD_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A13", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_CRT_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A14", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_INPUT_END_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A15", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_APPROVAL_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A16", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_UPLOAD_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A17", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_LOCK_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A18", "SELECT `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A19", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` ORDER BY `TAM07_USER_ID` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000A20", "SELECT `TAM04_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
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
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               return;
            case 16 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               return;
            case 17 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 18 :
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
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2, false);
               }
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
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
                  stmt.setVarchar(7, (String)parms[12], 30);
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
                  stmt.setVarchar(9, (String)parms[16], 128);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 20);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 256);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[22], 1);
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[24], 1);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 1000);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 1);
               }
               if ( ((Boolean) parms[29]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[30], 40);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 40);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 2);
               }
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
                  stmt.setVarchar(6, (String)parms[11], 30);
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
                  stmt.setVarchar(8, (String)parms[15], 128);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 20);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 256);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[21], 1);
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 1000);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 1);
               }
               if ( ((Boolean) parms[28]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[29], 40);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 40);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 2);
               }
               stmt.setVarchar(18, (String)parms[34], 128, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 128);
               return;
            case 18 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2, false);
               }
               return;
      }
   }

}

