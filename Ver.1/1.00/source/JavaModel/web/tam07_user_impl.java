/*
               File: tam07_user_impl
        Description: ユーザーマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:53:59.39
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
         A14TAM07_AUTH_CD = httpContext.GetNextPar( ) ;
         n14TAM07_AUTH_CD = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A14TAM07_AUTH_CD", A14TAM07_AUTH_CD);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_9( A14TAM07_AUTH_CD) ;
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
      Form.getMeta().addItem("Description", "ユーザーマスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTAM07_USER_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"ユーザーマスタ"+"</legend>") ;
         wb_table3_27_0A10( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0A10e( boolean wbgen )
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

   public void wb_table3_27_0A10( boolean wbgen )
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
         wb_table4_33_0A10( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0A10e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TAM07_USER.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TAM07_USER.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0A10e( true) ;
      }
      else
      {
         wb_table3_27_0A10e( false) ;
      }
   }

   public void wb_table4_33_0A10( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_user_id_Internalname, "ユーザーID", "", "", lblTextblocktam07_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_USER_ID_Internalname, GXutil.rtrim( A8TAM07_USER_ID), GXutil.rtrim( localUtil.format( A8TAM07_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTAM07_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_user_nm_Internalname, "氏名", "", "", lblTextblocktam07_user_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_USER_NM_Internalname, GXutil.rtrim( A2TAM07_USER_NM), GXutil.rtrim( localUtil.format( A2TAM07_USER_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTAM07_USER_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_USER_NM_Enabled, 0, 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_user_kana_nm_Internalname, "氏名（カナ）", "", "", lblTextblocktam07_user_kana_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A126TAM07_USER_KANA_NM", A126TAM07_USER_KANA_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_USER_KANA_NM_Internalname, GXutil.rtrim( A126TAM07_USER_KANA_NM), GXutil.rtrim( localUtil.format( A126TAM07_USER_KANA_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTAM07_USER_KANA_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_USER_KANA_NM_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_pwd_Internalname, "パスワード", "", "", lblTextblocktam07_pwd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A7TAM07_PWD", A7TAM07_PWD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_PWD_Internalname, GXutil.rtrim( A7TAM07_PWD), GXutil.rtrim( localUtil.format( A7TAM07_PWD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTAM07_PWD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_PWD_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_auth_cd_Internalname, "権限パターン区分", "", "", lblTextblocktam07_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A14TAM07_AUTH_CD", A14TAM07_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_AUTH_CD_Internalname, GXutil.rtrim( A14TAM07_AUTH_CD), GXutil.rtrim( localUtil.format( A14TAM07_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTAM07_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_site_id_Internalname, "施設ID", "", "", lblTextblocktam07_site_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A147TAM07_SITE_ID", A147TAM07_SITE_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_SITE_ID_Internalname, GXutil.rtrim( A147TAM07_SITE_ID), GXutil.rtrim( localUtil.format( A147TAM07_SITE_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTAM07_SITE_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_SITE_ID_Enabled, 0, 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_email_Internalname, "EMAILアドレス", "", "", lblTextblocktam07_email_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A593TAM07_EMAIL", A593TAM07_EMAIL);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTAM07_EMAIL_Internalname, GXutil.rtrim( A593TAM07_EMAIL), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", (short)(0), 1, edtTAM07_EMAIL_Enabled, 0, 80, "chr", 4, "row", StyleString, ClassString, "256", -1, "", true, "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam07_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A16TAM07_DEL_FLG", A16TAM07_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_DEL_FLG_Internalname, GXutil.rtrim( A16TAM07_DEL_FLG), GXutil.rtrim( localUtil.format( A16TAM07_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTAM07_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam07_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A35TAM07_CRT_DATETIME", localUtil.ttoc( A35TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAM07_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_CRT_DATETIME_Internalname, localUtil.format(A35TAM07_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A35TAM07_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(78);\"", "", "", "", "", edtTAM07_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAM07_USER.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM07_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTAM07_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAM07_USER.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam07_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A76TAM07_CRT_USER_ID", A76TAM07_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_CRT_USER_ID_Internalname, GXutil.rtrim( A76TAM07_CRT_USER_ID), GXutil.rtrim( localUtil.format( A76TAM07_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTAM07_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam07_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A36TAM07_CRT_PROG_NM", A36TAM07_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_CRT_PROG_NM_Internalname, GXutil.rtrim( A36TAM07_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A36TAM07_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTAM07_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam07_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A37TAM07_UPD_DATETIME", localUtil.ttoc( A37TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTAM07_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_UPD_DATETIME_Internalname, localUtil.format(A37TAM07_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A37TAM07_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(93);\"", "", "", "", "", edtTAM07_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAM07_USER.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM07_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTAM07_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TAM07_USER.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktam07_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A77TAM07_UPD_USER_ID", A77TAM07_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_UPD_USER_ID_Internalname, GXutil.rtrim( A77TAM07_UPD_USER_ID), GXutil.rtrim( localUtil.format( A77TAM07_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"", "", "", "", "", edtTAM07_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam07_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A38TAM07_UPD_PROG_NM", A38TAM07_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_UPD_PROG_NM_Internalname, GXutil.rtrim( A38TAM07_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A38TAM07_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(103);\"", "", "", "", "", edtTAM07_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam07_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktam07_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A112TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM07_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A112TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTAM07_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A112TAM07_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A112TAM07_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(108);\"", "", "", "", "", edtTAM07_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTAM07_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TAM07_USER.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0A10e( true) ;
      }
      else
      {
         wb_table4_33_0A10e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TAM07_USER.htm");
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
            A8TAM07_USER_ID = httpContext.cgiGet( edtTAM07_USER_ID_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
            A2TAM07_USER_NM = httpContext.cgiGet( edtTAM07_USER_NM_Internalname) ;
            n2TAM07_USER_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
            n2TAM07_USER_NM = ((GXutil.strcmp("", A2TAM07_USER_NM)==0) ? true : false) ;
            A126TAM07_USER_KANA_NM = httpContext.cgiGet( edtTAM07_USER_KANA_NM_Internalname) ;
            n126TAM07_USER_KANA_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A126TAM07_USER_KANA_NM", A126TAM07_USER_KANA_NM);
            n126TAM07_USER_KANA_NM = ((GXutil.strcmp("", A126TAM07_USER_KANA_NM)==0) ? true : false) ;
            A7TAM07_PWD = httpContext.cgiGet( edtTAM07_PWD_Internalname) ;
            n7TAM07_PWD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A7TAM07_PWD", A7TAM07_PWD);
            n7TAM07_PWD = ((GXutil.strcmp("", A7TAM07_PWD)==0) ? true : false) ;
            A14TAM07_AUTH_CD = httpContext.cgiGet( edtTAM07_AUTH_CD_Internalname) ;
            n14TAM07_AUTH_CD = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A14TAM07_AUTH_CD", A14TAM07_AUTH_CD);
            n14TAM07_AUTH_CD = ((GXutil.strcmp("", A14TAM07_AUTH_CD)==0) ? true : false) ;
            A147TAM07_SITE_ID = httpContext.cgiGet( edtTAM07_SITE_ID_Internalname) ;
            n147TAM07_SITE_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A147TAM07_SITE_ID", A147TAM07_SITE_ID);
            n147TAM07_SITE_ID = ((GXutil.strcmp("", A147TAM07_SITE_ID)==0) ? true : false) ;
            A593TAM07_EMAIL = httpContext.cgiGet( edtTAM07_EMAIL_Internalname) ;
            n593TAM07_EMAIL = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A593TAM07_EMAIL", A593TAM07_EMAIL);
            n593TAM07_EMAIL = ((GXutil.strcmp("", A593TAM07_EMAIL)==0) ? true : false) ;
            A16TAM07_DEL_FLG = httpContext.cgiGet( edtTAM07_DEL_FLG_Internalname) ;
            n16TAM07_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A16TAM07_DEL_FLG", A16TAM07_DEL_FLG);
            n16TAM07_DEL_FLG = ((GXutil.strcmp("", A16TAM07_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM07_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TAM07_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM07_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A35TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n35TAM07_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A35TAM07_CRT_DATETIME", localUtil.ttoc( A35TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A35TAM07_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM07_CRT_DATETIME_Internalname)) ;
               n35TAM07_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A35TAM07_CRT_DATETIME", localUtil.ttoc( A35TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n35TAM07_CRT_DATETIME = (GXutil.nullDate().equals(A35TAM07_CRT_DATETIME) ? true : false) ;
            A76TAM07_CRT_USER_ID = httpContext.cgiGet( edtTAM07_CRT_USER_ID_Internalname) ;
            n76TAM07_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A76TAM07_CRT_USER_ID", A76TAM07_CRT_USER_ID);
            n76TAM07_CRT_USER_ID = ((GXutil.strcmp("", A76TAM07_CRT_USER_ID)==0) ? true : false) ;
            A36TAM07_CRT_PROG_NM = httpContext.cgiGet( edtTAM07_CRT_PROG_NM_Internalname) ;
            n36TAM07_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A36TAM07_CRT_PROG_NM", A36TAM07_CRT_PROG_NM);
            n36TAM07_CRT_PROG_NM = ((GXutil.strcmp("", A36TAM07_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM07_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TAM07_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM07_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A37TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n37TAM07_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A37TAM07_UPD_DATETIME", localUtil.ttoc( A37TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A37TAM07_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM07_UPD_DATETIME_Internalname)) ;
               n37TAM07_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A37TAM07_UPD_DATETIME", localUtil.ttoc( A37TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n37TAM07_UPD_DATETIME = (GXutil.nullDate().equals(A37TAM07_UPD_DATETIME) ? true : false) ;
            A77TAM07_UPD_USER_ID = httpContext.cgiGet( edtTAM07_UPD_USER_ID_Internalname) ;
            n77TAM07_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A77TAM07_UPD_USER_ID", A77TAM07_UPD_USER_ID);
            n77TAM07_UPD_USER_ID = ((GXutil.strcmp("", A77TAM07_UPD_USER_ID)==0) ? true : false) ;
            A38TAM07_UPD_PROG_NM = httpContext.cgiGet( edtTAM07_UPD_PROG_NM_Internalname) ;
            n38TAM07_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A38TAM07_UPD_PROG_NM", A38TAM07_UPD_PROG_NM);
            n38TAM07_UPD_PROG_NM = ((GXutil.strcmp("", A38TAM07_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAM07_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAM07_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAM07_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM07_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A112TAM07_UPD_CNT = 0 ;
               n112TAM07_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A112TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)));
            }
            else
            {
               A112TAM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTAM07_UPD_CNT_Internalname), ".", ",") ;
               n112TAM07_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A112TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)));
            }
            n112TAM07_UPD_CNT = ((0==A112TAM07_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z8TAM07_USER_ID = httpContext.cgiGet( "Z8TAM07_USER_ID") ;
            Z35TAM07_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z35TAM07_CRT_DATETIME"), 0) ;
            n35TAM07_CRT_DATETIME = (GXutil.nullDate().equals(A35TAM07_CRT_DATETIME) ? true : false) ;
            Z76TAM07_CRT_USER_ID = httpContext.cgiGet( "Z76TAM07_CRT_USER_ID") ;
            n76TAM07_CRT_USER_ID = ((GXutil.strcmp("", A76TAM07_CRT_USER_ID)==0) ? true : false) ;
            Z37TAM07_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z37TAM07_UPD_DATETIME"), 0) ;
            n37TAM07_UPD_DATETIME = (GXutil.nullDate().equals(A37TAM07_UPD_DATETIME) ? true : false) ;
            Z77TAM07_UPD_USER_ID = httpContext.cgiGet( "Z77TAM07_UPD_USER_ID") ;
            n77TAM07_UPD_USER_ID = ((GXutil.strcmp("", A77TAM07_UPD_USER_ID)==0) ? true : false) ;
            Z112TAM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z112TAM07_UPD_CNT"), ".", ",") ;
            n112TAM07_UPD_CNT = ((0==A112TAM07_UPD_CNT) ? true : false) ;
            Z2TAM07_USER_NM = httpContext.cgiGet( "Z2TAM07_USER_NM") ;
            n2TAM07_USER_NM = ((GXutil.strcmp("", A2TAM07_USER_NM)==0) ? true : false) ;
            Z126TAM07_USER_KANA_NM = httpContext.cgiGet( "Z126TAM07_USER_KANA_NM") ;
            n126TAM07_USER_KANA_NM = ((GXutil.strcmp("", A126TAM07_USER_KANA_NM)==0) ? true : false) ;
            Z7TAM07_PWD = httpContext.cgiGet( "Z7TAM07_PWD") ;
            n7TAM07_PWD = ((GXutil.strcmp("", A7TAM07_PWD)==0) ? true : false) ;
            Z147TAM07_SITE_ID = httpContext.cgiGet( "Z147TAM07_SITE_ID") ;
            n147TAM07_SITE_ID = ((GXutil.strcmp("", A147TAM07_SITE_ID)==0) ? true : false) ;
            Z593TAM07_EMAIL = httpContext.cgiGet( "Z593TAM07_EMAIL") ;
            n593TAM07_EMAIL = ((GXutil.strcmp("", A593TAM07_EMAIL)==0) ? true : false) ;
            Z16TAM07_DEL_FLG = httpContext.cgiGet( "Z16TAM07_DEL_FLG") ;
            n16TAM07_DEL_FLG = ((GXutil.strcmp("", A16TAM07_DEL_FLG)==0) ? true : false) ;
            Z36TAM07_CRT_PROG_NM = httpContext.cgiGet( "Z36TAM07_CRT_PROG_NM") ;
            n36TAM07_CRT_PROG_NM = ((GXutil.strcmp("", A36TAM07_CRT_PROG_NM)==0) ? true : false) ;
            Z38TAM07_UPD_PROG_NM = httpContext.cgiGet( "Z38TAM07_UPD_PROG_NM") ;
            n38TAM07_UPD_PROG_NM = ((GXutil.strcmp("", A38TAM07_UPD_PROG_NM)==0) ? true : false) ;
            Z14TAM07_AUTH_CD = httpContext.cgiGet( "Z14TAM07_AUTH_CD") ;
            n14TAM07_AUTH_CD = ((GXutil.strcmp("", A14TAM07_AUTH_CD)==0) ? true : false) ;
            O112TAM07_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O112TAM07_UPD_CNT"), ".", ",") ;
            n112TAM07_UPD_CNT = ((0==A112TAM07_UPD_CNT) ? true : false) ;
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
               A8TAM07_USER_ID = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
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
         GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      }
   }

   public void e120A2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "ユーザーID:" + A8TAM07_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A2TAM07_USER_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A126TAM07_USER_KANA_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A7TAM07_PWD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A14TAM07_AUTH_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A147TAM07_SITE_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A16TAM07_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A35TAM07_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tam07_user_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A35TAM07_CRT_DATETIME", localUtil.ttoc( A35TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A76TAM07_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A36TAM07_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A37TAM07_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tam07_user_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A37TAM07_UPD_DATETIME", localUtil.ttoc( A37TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A77TAM07_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A38TAM07_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = GXutil.strReplace( AV7W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV7W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void S1167( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
   }

   public void zm0A10( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z35TAM07_CRT_DATETIME = T000A3_A35TAM07_CRT_DATETIME[0] ;
            Z76TAM07_CRT_USER_ID = T000A3_A76TAM07_CRT_USER_ID[0] ;
            Z37TAM07_UPD_DATETIME = T000A3_A37TAM07_UPD_DATETIME[0] ;
            Z77TAM07_UPD_USER_ID = T000A3_A77TAM07_UPD_USER_ID[0] ;
            Z112TAM07_UPD_CNT = T000A3_A112TAM07_UPD_CNT[0] ;
            Z2TAM07_USER_NM = T000A3_A2TAM07_USER_NM[0] ;
            Z126TAM07_USER_KANA_NM = T000A3_A126TAM07_USER_KANA_NM[0] ;
            Z7TAM07_PWD = T000A3_A7TAM07_PWD[0] ;
            Z147TAM07_SITE_ID = T000A3_A147TAM07_SITE_ID[0] ;
            Z593TAM07_EMAIL = T000A3_A593TAM07_EMAIL[0] ;
            Z16TAM07_DEL_FLG = T000A3_A16TAM07_DEL_FLG[0] ;
            Z36TAM07_CRT_PROG_NM = T000A3_A36TAM07_CRT_PROG_NM[0] ;
            Z38TAM07_UPD_PROG_NM = T000A3_A38TAM07_UPD_PROG_NM[0] ;
            Z14TAM07_AUTH_CD = T000A3_A14TAM07_AUTH_CD[0] ;
         }
         else
         {
            Z35TAM07_CRT_DATETIME = A35TAM07_CRT_DATETIME ;
            Z76TAM07_CRT_USER_ID = A76TAM07_CRT_USER_ID ;
            Z37TAM07_UPD_DATETIME = A37TAM07_UPD_DATETIME ;
            Z77TAM07_UPD_USER_ID = A77TAM07_UPD_USER_ID ;
            Z112TAM07_UPD_CNT = A112TAM07_UPD_CNT ;
            Z2TAM07_USER_NM = A2TAM07_USER_NM ;
            Z126TAM07_USER_KANA_NM = A126TAM07_USER_KANA_NM ;
            Z7TAM07_PWD = A7TAM07_PWD ;
            Z147TAM07_SITE_ID = A147TAM07_SITE_ID ;
            Z593TAM07_EMAIL = A593TAM07_EMAIL ;
            Z16TAM07_DEL_FLG = A16TAM07_DEL_FLG ;
            Z36TAM07_CRT_PROG_NM = A36TAM07_CRT_PROG_NM ;
            Z38TAM07_UPD_PROG_NM = A38TAM07_UPD_PROG_NM ;
            Z14TAM07_AUTH_CD = A14TAM07_AUTH_CD ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z8TAM07_USER_ID = A8TAM07_USER_ID ;
         Z35TAM07_CRT_DATETIME = A35TAM07_CRT_DATETIME ;
         Z76TAM07_CRT_USER_ID = A76TAM07_CRT_USER_ID ;
         Z37TAM07_UPD_DATETIME = A37TAM07_UPD_DATETIME ;
         Z77TAM07_UPD_USER_ID = A77TAM07_UPD_USER_ID ;
         Z112TAM07_UPD_CNT = A112TAM07_UPD_CNT ;
         Z2TAM07_USER_NM = A2TAM07_USER_NM ;
         Z126TAM07_USER_KANA_NM = A126TAM07_USER_KANA_NM ;
         Z7TAM07_PWD = A7TAM07_PWD ;
         Z147TAM07_SITE_ID = A147TAM07_SITE_ID ;
         Z593TAM07_EMAIL = A593TAM07_EMAIL ;
         Z16TAM07_DEL_FLG = A16TAM07_DEL_FLG ;
         Z36TAM07_CRT_PROG_NM = A36TAM07_CRT_PROG_NM ;
         Z38TAM07_UPD_PROG_NM = A38TAM07_UPD_PROG_NM ;
         Z14TAM07_AUTH_CD = A14TAM07_AUTH_CD ;
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
      pr_default.execute(3, new Object[] {A8TAM07_USER_ID});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A35TAM07_CRT_DATETIME = T000A5_A35TAM07_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35TAM07_CRT_DATETIME", localUtil.ttoc( A35TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n35TAM07_CRT_DATETIME = T000A5_n35TAM07_CRT_DATETIME[0] ;
         A76TAM07_CRT_USER_ID = T000A5_A76TAM07_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A76TAM07_CRT_USER_ID", A76TAM07_CRT_USER_ID);
         n76TAM07_CRT_USER_ID = T000A5_n76TAM07_CRT_USER_ID[0] ;
         A37TAM07_UPD_DATETIME = T000A5_A37TAM07_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37TAM07_UPD_DATETIME", localUtil.ttoc( A37TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n37TAM07_UPD_DATETIME = T000A5_n37TAM07_UPD_DATETIME[0] ;
         A77TAM07_UPD_USER_ID = T000A5_A77TAM07_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A77TAM07_UPD_USER_ID", A77TAM07_UPD_USER_ID);
         n77TAM07_UPD_USER_ID = T000A5_n77TAM07_UPD_USER_ID[0] ;
         A112TAM07_UPD_CNT = T000A5_A112TAM07_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)));
         n112TAM07_UPD_CNT = T000A5_n112TAM07_UPD_CNT[0] ;
         A2TAM07_USER_NM = T000A5_A2TAM07_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
         n2TAM07_USER_NM = T000A5_n2TAM07_USER_NM[0] ;
         A126TAM07_USER_KANA_NM = T000A5_A126TAM07_USER_KANA_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126TAM07_USER_KANA_NM", A126TAM07_USER_KANA_NM);
         n126TAM07_USER_KANA_NM = T000A5_n126TAM07_USER_KANA_NM[0] ;
         A7TAM07_PWD = T000A5_A7TAM07_PWD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAM07_PWD", A7TAM07_PWD);
         n7TAM07_PWD = T000A5_n7TAM07_PWD[0] ;
         A147TAM07_SITE_ID = T000A5_A147TAM07_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147TAM07_SITE_ID", A147TAM07_SITE_ID);
         n147TAM07_SITE_ID = T000A5_n147TAM07_SITE_ID[0] ;
         A593TAM07_EMAIL = T000A5_A593TAM07_EMAIL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A593TAM07_EMAIL", A593TAM07_EMAIL);
         n593TAM07_EMAIL = T000A5_n593TAM07_EMAIL[0] ;
         A16TAM07_DEL_FLG = T000A5_A16TAM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16TAM07_DEL_FLG", A16TAM07_DEL_FLG);
         n16TAM07_DEL_FLG = T000A5_n16TAM07_DEL_FLG[0] ;
         A36TAM07_CRT_PROG_NM = T000A5_A36TAM07_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A36TAM07_CRT_PROG_NM", A36TAM07_CRT_PROG_NM);
         n36TAM07_CRT_PROG_NM = T000A5_n36TAM07_CRT_PROG_NM[0] ;
         A38TAM07_UPD_PROG_NM = T000A5_A38TAM07_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A38TAM07_UPD_PROG_NM", A38TAM07_UPD_PROG_NM);
         n38TAM07_UPD_PROG_NM = T000A5_n38TAM07_UPD_PROG_NM[0] ;
         A14TAM07_AUTH_CD = T000A5_A14TAM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14TAM07_AUTH_CD", A14TAM07_AUTH_CD);
         n14TAM07_AUTH_CD = T000A5_n14TAM07_AUTH_CD[0] ;
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
      pr_default.execute(2, new Object[] {new Boolean(n14TAM07_AUTH_CD), A14TAM07_AUTH_CD});
      if ( (pr_default.getStatus(2) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A14TAM07_AUTH_CD)==0) ) )
         {
            AnyError14 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'ユーザーマスタ・権限サブタイプ'", "ForeignKeyNotFound", 1, "TAM07_AUTH_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM07_AUTH_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError14 == 0 )
      {
      }
      pr_default.close(2);
      if ( ! ( GXutil.nullDate().equals(A35TAM07_CRT_DATETIME) || (( A35TAM07_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A35TAM07_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A37TAM07_UPD_DATETIME) || (( A37TAM07_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A37TAM07_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0A10( )
   {
      pr_default.close(2);
   }

   public void enableDisable( )
   {
   }

   public void gxload_9( String A14TAM07_AUTH_CD )
   {
      /* Using cursor T000A6 */
      pr_default.execute(4, new Object[] {new Boolean(n14TAM07_AUTH_CD), A14TAM07_AUTH_CD});
      if ( (pr_default.getStatus(4) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A14TAM07_AUTH_CD)==0) ) )
         {
            AnyError14 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'ユーザーマスタ・権限サブタイプ'", "ForeignKeyNotFound", 1, "TAM07_AUTH_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM07_AUTH_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      if ( AnyError14 == 0 )
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

   public void getKey0A10( )
   {
      /* Using cursor T000A7 */
      pr_default.execute(5, new Object[] {A8TAM07_USER_ID});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound10 = (short)(1) ;
      }
      else
      {
         RcdFound10 = (short)(0) ;
      }
      pr_default.close(5);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000A3 */
      pr_default.execute(1, new Object[] {A8TAM07_USER_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0A10( 8) ;
         RcdFound10 = (short)(1) ;
         A8TAM07_USER_ID = T000A3_A8TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
         A35TAM07_CRT_DATETIME = T000A3_A35TAM07_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A35TAM07_CRT_DATETIME", localUtil.ttoc( A35TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n35TAM07_CRT_DATETIME = T000A3_n35TAM07_CRT_DATETIME[0] ;
         A76TAM07_CRT_USER_ID = T000A3_A76TAM07_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A76TAM07_CRT_USER_ID", A76TAM07_CRT_USER_ID);
         n76TAM07_CRT_USER_ID = T000A3_n76TAM07_CRT_USER_ID[0] ;
         A37TAM07_UPD_DATETIME = T000A3_A37TAM07_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A37TAM07_UPD_DATETIME", localUtil.ttoc( A37TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n37TAM07_UPD_DATETIME = T000A3_n37TAM07_UPD_DATETIME[0] ;
         A77TAM07_UPD_USER_ID = T000A3_A77TAM07_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A77TAM07_UPD_USER_ID", A77TAM07_UPD_USER_ID);
         n77TAM07_UPD_USER_ID = T000A3_n77TAM07_UPD_USER_ID[0] ;
         A112TAM07_UPD_CNT = T000A3_A112TAM07_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A112TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)));
         n112TAM07_UPD_CNT = T000A3_n112TAM07_UPD_CNT[0] ;
         A2TAM07_USER_NM = T000A3_A2TAM07_USER_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
         n2TAM07_USER_NM = T000A3_n2TAM07_USER_NM[0] ;
         A126TAM07_USER_KANA_NM = T000A3_A126TAM07_USER_KANA_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A126TAM07_USER_KANA_NM", A126TAM07_USER_KANA_NM);
         n126TAM07_USER_KANA_NM = T000A3_n126TAM07_USER_KANA_NM[0] ;
         A7TAM07_PWD = T000A3_A7TAM07_PWD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A7TAM07_PWD", A7TAM07_PWD);
         n7TAM07_PWD = T000A3_n7TAM07_PWD[0] ;
         A147TAM07_SITE_ID = T000A3_A147TAM07_SITE_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A147TAM07_SITE_ID", A147TAM07_SITE_ID);
         n147TAM07_SITE_ID = T000A3_n147TAM07_SITE_ID[0] ;
         A593TAM07_EMAIL = T000A3_A593TAM07_EMAIL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A593TAM07_EMAIL", A593TAM07_EMAIL);
         n593TAM07_EMAIL = T000A3_n593TAM07_EMAIL[0] ;
         A16TAM07_DEL_FLG = T000A3_A16TAM07_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A16TAM07_DEL_FLG", A16TAM07_DEL_FLG);
         n16TAM07_DEL_FLG = T000A3_n16TAM07_DEL_FLG[0] ;
         A36TAM07_CRT_PROG_NM = T000A3_A36TAM07_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A36TAM07_CRT_PROG_NM", A36TAM07_CRT_PROG_NM);
         n36TAM07_CRT_PROG_NM = T000A3_n36TAM07_CRT_PROG_NM[0] ;
         A38TAM07_UPD_PROG_NM = T000A3_A38TAM07_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A38TAM07_UPD_PROG_NM", A38TAM07_UPD_PROG_NM);
         n38TAM07_UPD_PROG_NM = T000A3_n38TAM07_UPD_PROG_NM[0] ;
         A14TAM07_AUTH_CD = T000A3_A14TAM07_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A14TAM07_AUTH_CD", A14TAM07_AUTH_CD);
         n14TAM07_AUTH_CD = T000A3_n14TAM07_AUTH_CD[0] ;
         O112TAM07_UPD_CNT = A112TAM07_UPD_CNT ;
         n112TAM07_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A112TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)));
         Z8TAM07_USER_ID = A8TAM07_USER_ID ;
         sMode10 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0A10( ) ;
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
      /* Using cursor T000A8 */
      pr_default.execute(6, new Object[] {A8TAM07_USER_ID});
      if ( (pr_default.getStatus(6) != 101) )
      {
         while ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000A8_A8TAM07_USER_ID[0], A8TAM07_USER_ID) < 0 ) ) )
         {
            pr_default.readNext(6);
         }
         if ( (pr_default.getStatus(6) != 101) && ( ( GXutil.strcmp(T000A8_A8TAM07_USER_ID[0], A8TAM07_USER_ID) > 0 ) ) )
         {
            A8TAM07_USER_ID = T000A8_A8TAM07_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(6);
   }

   public void move_previous( )
   {
      RcdFound10 = (short)(0) ;
      /* Using cursor T000A9 */
      pr_default.execute(7, new Object[] {A8TAM07_USER_ID});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000A9_A8TAM07_USER_ID[0], A8TAM07_USER_ID) > 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000A9_A8TAM07_USER_ID[0], A8TAM07_USER_ID) < 0 ) ) )
         {
            A8TAM07_USER_ID = T000A9_A8TAM07_USER_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
            RcdFound10 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0A10( ) ;
      if ( RcdFound10 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAM07_USER_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM07_USER_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A8TAM07_USER_ID, Z8TAM07_USER_ID) != 0 )
         {
            A8TAM07_USER_ID = Z8TAM07_USER_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
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
         if ( GXutil.strcmp(A8TAM07_USER_ID, Z8TAM07_USER_ID) != 0 )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( GXutil.strcmp(A8TAM07_USER_ID, Z8TAM07_USER_ID) != 0 )
      {
         A8TAM07_USER_ID = Z8TAM07_USER_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM07_USER_ID");
         AnyError = (short)(1) ;
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
      scanStart0A10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart0A10( ) ;
      if ( RcdFound10 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(0, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM07_USER"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z35TAM07_CRT_DATETIME.equals( T000A2_A35TAM07_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z76TAM07_CRT_USER_ID, T000A2_A76TAM07_CRT_USER_ID[0]) != 0 ) || !( Z37TAM07_UPD_DATETIME.equals( T000A2_A37TAM07_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z77TAM07_UPD_USER_ID, T000A2_A77TAM07_UPD_USER_ID[0]) != 0 ) || ( Z112TAM07_UPD_CNT != T000A2_A112TAM07_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z2TAM07_USER_NM, T000A2_A2TAM07_USER_NM[0]) != 0 ) || ( GXutil.strcmp(Z126TAM07_USER_KANA_NM, T000A2_A126TAM07_USER_KANA_NM[0]) != 0 ) || ( GXutil.strcmp(Z7TAM07_PWD, T000A2_A7TAM07_PWD[0]) != 0 ) || ( GXutil.strcmp(Z147TAM07_SITE_ID, T000A2_A147TAM07_SITE_ID[0]) != 0 ) || ( GXutil.strcmp(Z593TAM07_EMAIL, T000A2_A593TAM07_EMAIL[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z16TAM07_DEL_FLG, T000A2_A16TAM07_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z36TAM07_CRT_PROG_NM, T000A2_A36TAM07_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z38TAM07_UPD_PROG_NM, T000A2_A38TAM07_UPD_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z14TAM07_AUTH_CD, T000A2_A14TAM07_AUTH_CD[0]) != 0 ) )
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
                  /* Using cursor T000A10 */
                  pr_default.execute(8, new Object[] {A8TAM07_USER_ID, new Boolean(n35TAM07_CRT_DATETIME), A35TAM07_CRT_DATETIME, new Boolean(n76TAM07_CRT_USER_ID), A76TAM07_CRT_USER_ID, new Boolean(n37TAM07_UPD_DATETIME), A37TAM07_UPD_DATETIME, new Boolean(n77TAM07_UPD_USER_ID), A77TAM07_UPD_USER_ID, new Boolean(n112TAM07_UPD_CNT), new Long(A112TAM07_UPD_CNT), new Boolean(n2TAM07_USER_NM), A2TAM07_USER_NM, new Boolean(n126TAM07_USER_KANA_NM), A126TAM07_USER_KANA_NM, new Boolean(n7TAM07_PWD), A7TAM07_PWD, new Boolean(n147TAM07_SITE_ID), A147TAM07_SITE_ID, new Boolean(n593TAM07_EMAIL), A593TAM07_EMAIL, new Boolean(n16TAM07_DEL_FLG), A16TAM07_DEL_FLG, new Boolean(n36TAM07_CRT_PROG_NM), A36TAM07_CRT_PROG_NM, new Boolean(n38TAM07_UPD_PROG_NM), A38TAM07_UPD_PROG_NM, new Boolean(n14TAM07_AUTH_CD), A14TAM07_AUTH_CD});
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
                  /* Using cursor T000A11 */
                  pr_default.execute(9, new Object[] {new Boolean(n35TAM07_CRT_DATETIME), A35TAM07_CRT_DATETIME, new Boolean(n76TAM07_CRT_USER_ID), A76TAM07_CRT_USER_ID, new Boolean(n37TAM07_UPD_DATETIME), A37TAM07_UPD_DATETIME, new Boolean(n77TAM07_UPD_USER_ID), A77TAM07_UPD_USER_ID, new Boolean(n112TAM07_UPD_CNT), new Long(A112TAM07_UPD_CNT), new Boolean(n2TAM07_USER_NM), A2TAM07_USER_NM, new Boolean(n126TAM07_USER_KANA_NM), A126TAM07_USER_KANA_NM, new Boolean(n7TAM07_PWD), A7TAM07_PWD, new Boolean(n147TAM07_SITE_ID), A147TAM07_SITE_ID, new Boolean(n593TAM07_EMAIL), A593TAM07_EMAIL, new Boolean(n16TAM07_DEL_FLG), A16TAM07_DEL_FLG, new Boolean(n36TAM07_CRT_PROG_NM), A36TAM07_CRT_PROG_NM, new Boolean(n38TAM07_UPD_PROG_NM), A38TAM07_UPD_PROG_NM, new Boolean(n14TAM07_AUTH_CD), A14TAM07_AUTH_CD, A8TAM07_USER_ID});
                  if ( (pr_default.getStatus(9) == 103) )
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               /* Using cursor T000A12 */
               pr_default.execute(10, new Object[] {A8TAM07_USER_ID});
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
         /* Using cursor T000A13 */
         pr_default.execute(11, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
         /* Using cursor T000A14 */
         pr_default.execute(12, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T000A15 */
         pr_default.execute(13, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
         /* Using cursor T000A16 */
         pr_default.execute(14, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(14) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(14);
         /* Using cursor T000A17 */
         pr_default.execute(15, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(15) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(15);
         /* Using cursor T000A18 */
         pr_default.execute(16, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(16) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CRF検索ワーク"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(16);
         /* Using cursor T000A19 */
         pr_default.execute(17, new Object[] {A8TAM07_USER_ID});
         if ( (pr_default.getStatus(17) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"試験参加スタッフマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(17);
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
      /* Using cursor T000A20 */
      pr_default.execute(18);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A8TAM07_USER_ID = T000A20_A8TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0A10( )
   {
      pr_default.readNext(18);
      RcdFound10 = (short)(0) ;
      if ( (pr_default.getStatus(18) != 101) )
      {
         RcdFound10 = (short)(1) ;
         A8TAM07_USER_ID = T000A20_A8TAM07_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
      }
   }

   public void scanEnd0A10( )
   {
      pr_default.close(18);
   }

   public void afterConfirm0A10( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0A10( )
   {
      /* Before Insert Rules */
      A35TAM07_CRT_DATETIME = GXutil.now( ) ;
      n35TAM07_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A35TAM07_CRT_DATETIME", localUtil.ttoc( A35TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A76TAM07_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam07_user_impl.this.GXt_char3 = GXv_char4[0] ;
      A76TAM07_CRT_USER_ID = GXt_char3 ;
      n76TAM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A76TAM07_CRT_USER_ID", A76TAM07_CRT_USER_ID);
      A37TAM07_UPD_DATETIME = GXutil.now( ) ;
      n37TAM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A37TAM07_UPD_DATETIME", localUtil.ttoc( A37TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A77TAM07_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam07_user_impl.this.GXt_char3 = GXv_char4[0] ;
      A77TAM07_UPD_USER_ID = GXt_char3 ;
      n77TAM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A77TAM07_UPD_USER_ID", A77TAM07_UPD_USER_ID);
      A112TAM07_UPD_CNT = (long)(O112TAM07_UPD_CNT+1) ;
      n112TAM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A112TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0A10( )
   {
      /* Before Update Rules */
      A37TAM07_UPD_DATETIME = GXutil.now( ) ;
      n37TAM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A37TAM07_UPD_DATETIME", localUtil.ttoc( A37TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A77TAM07_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam07_user_impl.this.GXt_char3 = GXv_char4[0] ;
      A77TAM07_UPD_USER_ID = GXt_char3 ;
      n77TAM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A77TAM07_UPD_USER_ID", A77TAM07_UPD_USER_ID);
      A112TAM07_UPD_CNT = (long)(O112TAM07_UPD_CNT+1) ;
      n112TAM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A112TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)));
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "ユーザーマスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tam07_user") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0A10( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z8TAM07_USER_ID", GXutil.rtrim( Z8TAM07_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z35TAM07_CRT_DATETIME", localUtil.ttoc( Z35TAM07_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z76TAM07_CRT_USER_ID", GXutil.rtrim( Z76TAM07_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z37TAM07_UPD_DATETIME", localUtil.ttoc( Z37TAM07_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z77TAM07_UPD_USER_ID", GXutil.rtrim( Z77TAM07_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z112TAM07_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z112TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z2TAM07_USER_NM", GXutil.rtrim( Z2TAM07_USER_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z126TAM07_USER_KANA_NM", GXutil.rtrim( Z126TAM07_USER_KANA_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z7TAM07_PWD", GXutil.rtrim( Z7TAM07_PWD));
      GxWebStd.gx_hidden_field( httpContext, "Z147TAM07_SITE_ID", GXutil.rtrim( Z147TAM07_SITE_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z593TAM07_EMAIL", GXutil.rtrim( Z593TAM07_EMAIL));
      GxWebStd.gx_hidden_field( httpContext, "Z16TAM07_DEL_FLG", GXutil.rtrim( Z16TAM07_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z36TAM07_CRT_PROG_NM", GXutil.rtrim( Z36TAM07_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z38TAM07_UPD_PROG_NM", GXutil.rtrim( Z38TAM07_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z14TAM07_AUTH_CD", GXutil.rtrim( Z14TAM07_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "O112TAM07_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O112TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0A10( )
   {
      A35TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n35TAM07_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A35TAM07_CRT_DATETIME", localUtil.ttoc( A35TAM07_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n35TAM07_CRT_DATETIME = (GXutil.nullDate().equals(A35TAM07_CRT_DATETIME) ? true : false) ;
      A76TAM07_CRT_USER_ID = "" ;
      n76TAM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A76TAM07_CRT_USER_ID", A76TAM07_CRT_USER_ID);
      n76TAM07_CRT_USER_ID = ((GXutil.strcmp("", A76TAM07_CRT_USER_ID)==0) ? true : false) ;
      A37TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n37TAM07_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A37TAM07_UPD_DATETIME", localUtil.ttoc( A37TAM07_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n37TAM07_UPD_DATETIME = (GXutil.nullDate().equals(A37TAM07_UPD_DATETIME) ? true : false) ;
      A77TAM07_UPD_USER_ID = "" ;
      n77TAM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A77TAM07_UPD_USER_ID", A77TAM07_UPD_USER_ID);
      n77TAM07_UPD_USER_ID = ((GXutil.strcmp("", A77TAM07_UPD_USER_ID)==0) ? true : false) ;
      A112TAM07_UPD_CNT = 0 ;
      n112TAM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A112TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)));
      n112TAM07_UPD_CNT = ((0==A112TAM07_UPD_CNT) ? true : false) ;
      A2TAM07_USER_NM = "" ;
      n2TAM07_USER_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A2TAM07_USER_NM", A2TAM07_USER_NM);
      n2TAM07_USER_NM = ((GXutil.strcmp("", A2TAM07_USER_NM)==0) ? true : false) ;
      A126TAM07_USER_KANA_NM = "" ;
      n126TAM07_USER_KANA_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A126TAM07_USER_KANA_NM", A126TAM07_USER_KANA_NM);
      n126TAM07_USER_KANA_NM = ((GXutil.strcmp("", A126TAM07_USER_KANA_NM)==0) ? true : false) ;
      A7TAM07_PWD = "" ;
      n7TAM07_PWD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A7TAM07_PWD", A7TAM07_PWD);
      n7TAM07_PWD = ((GXutil.strcmp("", A7TAM07_PWD)==0) ? true : false) ;
      A14TAM07_AUTH_CD = "" ;
      n14TAM07_AUTH_CD = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A14TAM07_AUTH_CD", A14TAM07_AUTH_CD);
      n14TAM07_AUTH_CD = ((GXutil.strcmp("", A14TAM07_AUTH_CD)==0) ? true : false) ;
      A147TAM07_SITE_ID = "" ;
      n147TAM07_SITE_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A147TAM07_SITE_ID", A147TAM07_SITE_ID);
      n147TAM07_SITE_ID = ((GXutil.strcmp("", A147TAM07_SITE_ID)==0) ? true : false) ;
      A593TAM07_EMAIL = "" ;
      n593TAM07_EMAIL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A593TAM07_EMAIL", A593TAM07_EMAIL);
      n593TAM07_EMAIL = ((GXutil.strcmp("", A593TAM07_EMAIL)==0) ? true : false) ;
      A16TAM07_DEL_FLG = "" ;
      n16TAM07_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A16TAM07_DEL_FLG", A16TAM07_DEL_FLG);
      n16TAM07_DEL_FLG = ((GXutil.strcmp("", A16TAM07_DEL_FLG)==0) ? true : false) ;
      A36TAM07_CRT_PROG_NM = "" ;
      n36TAM07_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A36TAM07_CRT_PROG_NM", A36TAM07_CRT_PROG_NM);
      n36TAM07_CRT_PROG_NM = ((GXutil.strcmp("", A36TAM07_CRT_PROG_NM)==0) ? true : false) ;
      A38TAM07_UPD_PROG_NM = "" ;
      n38TAM07_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A38TAM07_UPD_PROG_NM", A38TAM07_UPD_PROG_NM);
      n38TAM07_UPD_PROG_NM = ((GXutil.strcmp("", A38TAM07_UPD_PROG_NM)==0) ? true : false) ;
      O112TAM07_UPD_CNT = A112TAM07_UPD_CNT ;
      n112TAM07_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A112TAM07_UPD_CNT", GXutil.ltrim( GXutil.str( A112TAM07_UPD_CNT, 10, 0)));
   }

   public void initAll0A10( )
   {
      A8TAM07_USER_ID = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A8TAM07_USER_ID", A8TAM07_USER_ID);
      initializeNonKey0A10( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1454149");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tam07_user.js", "?1454149");
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
      GXt_char3 = A76TAM07_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam07_user_impl.this.GXt_char3 = GXv_char4[0] ;
      A76TAM07_CRT_USER_ID = GXt_char3 ;
      n76TAM07_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A76TAM07_CRT_USER_ID", A76TAM07_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A76TAM07_CRT_USER_ID))+"\"");
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
      GXt_char3 = A77TAM07_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tam07_user_impl.this.GXt_char3 = GXv_char4[0] ;
      A77TAM07_UPD_USER_ID = GXt_char3 ;
      n77TAM07_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A77TAM07_UPD_USER_ID", A77TAM07_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A77TAM07_UPD_USER_ID))+"\"");
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
                                    String GX_Parm15 )
   {
      A8TAM07_USER_ID = GX_Parm1 ;
      A35TAM07_CRT_DATETIME = GX_Parm2 ;
      n35TAM07_CRT_DATETIME = false ;
      A76TAM07_CRT_USER_ID = GX_Parm3 ;
      n76TAM07_CRT_USER_ID = false ;
      A37TAM07_UPD_DATETIME = GX_Parm4 ;
      n37TAM07_UPD_DATETIME = false ;
      A77TAM07_UPD_USER_ID = GX_Parm5 ;
      n77TAM07_UPD_USER_ID = false ;
      A112TAM07_UPD_CNT = GX_Parm6 ;
      n112TAM07_UPD_CNT = false ;
      A2TAM07_USER_NM = GX_Parm7 ;
      n2TAM07_USER_NM = false ;
      A126TAM07_USER_KANA_NM = GX_Parm8 ;
      n126TAM07_USER_KANA_NM = false ;
      A7TAM07_PWD = GX_Parm9 ;
      n7TAM07_PWD = false ;
      A147TAM07_SITE_ID = GX_Parm10 ;
      n147TAM07_SITE_ID = false ;
      A593TAM07_EMAIL = GX_Parm11 ;
      n593TAM07_EMAIL = false ;
      A16TAM07_DEL_FLG = GX_Parm12 ;
      n16TAM07_DEL_FLG = false ;
      A36TAM07_CRT_PROG_NM = GX_Parm13 ;
      n36TAM07_CRT_PROG_NM = false ;
      A38TAM07_UPD_PROG_NM = GX_Parm14 ;
      n38TAM07_UPD_PROG_NM = false ;
      A14TAM07_AUTH_CD = GX_Parm15 ;
      n14TAM07_AUTH_CD = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A35TAM07_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A76TAM07_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A37TAM07_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A77TAM07_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A112TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A2TAM07_USER_NM));
      isValidOutput.add(GXutil.rtrim( A126TAM07_USER_KANA_NM));
      isValidOutput.add(GXutil.rtrim( A7TAM07_PWD));
      isValidOutput.add(GXutil.rtrim( A14TAM07_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( A147TAM07_SITE_ID));
      isValidOutput.add(GXutil.rtrim( A593TAM07_EMAIL));
      isValidOutput.add(GXutil.rtrim( A16TAM07_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A36TAM07_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A38TAM07_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z8TAM07_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z35TAM07_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z76TAM07_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z37TAM07_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z77TAM07_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z112TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z2TAM07_USER_NM));
      isValidOutput.add(GXutil.rtrim( Z126TAM07_USER_KANA_NM));
      isValidOutput.add(GXutil.rtrim( Z7TAM07_PWD));
      isValidOutput.add(GXutil.rtrim( Z14TAM07_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z147TAM07_SITE_ID));
      isValidOutput.add(GXutil.rtrim( Z593TAM07_EMAIL));
      isValidOutput.add(GXutil.rtrim( Z16TAM07_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z36TAM07_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z38TAM07_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O112TAM07_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tam07_auth_cd( String GX_Parm1 )
   {
      A14TAM07_AUTH_CD = GX_Parm1 ;
      n14TAM07_AUTH_CD = false ;
      /* Using cursor T000A21 */
      pr_default.execute(19, new Object[] {new Boolean(n14TAM07_AUTH_CD), A14TAM07_AUTH_CD});
      if ( (pr_default.getStatus(19) == 101) )
      {
         if ( ! ( (GXutil.strcmp("", A14TAM07_AUTH_CD)==0) ) )
         {
            AnyError14 = 1 ;
            httpContext.GX_msglist.addItem("該当レコードなし'ユーザーマスタ・権限サブタイプ'", "ForeignKeyNotFound", 1, "TAM07_AUTH_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTAM07_AUTH_CD_Internalname ;
         }
      }
      if ( AnyError14 == 0 )
      {
      }
      pr_default.close(19);
      dynload_actions( ) ;
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
      pr_default.close(19);
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
                  /* Execute user subroutine: S1167 */
                  S1167 ();
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
      A14TAM07_AUTH_CD = "" ;
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
      A8TAM07_USER_ID = "" ;
      lblTextblocktam07_user_nm_Jsonclick = "" ;
      A2TAM07_USER_NM = "" ;
      lblTextblocktam07_user_kana_nm_Jsonclick = "" ;
      A126TAM07_USER_KANA_NM = "" ;
      lblTextblocktam07_pwd_Jsonclick = "" ;
      A7TAM07_PWD = "" ;
      lblTextblocktam07_auth_cd_Jsonclick = "" ;
      lblTextblocktam07_site_id_Jsonclick = "" ;
      A147TAM07_SITE_ID = "" ;
      lblTextblocktam07_email_Jsonclick = "" ;
      A593TAM07_EMAIL = "" ;
      lblTextblocktam07_del_flg_Jsonclick = "" ;
      A16TAM07_DEL_FLG = "" ;
      lblTextblocktam07_crt_datetime_Jsonclick = "" ;
      A35TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam07_crt_user_id_Jsonclick = "" ;
      A76TAM07_CRT_USER_ID = "" ;
      lblTextblocktam07_crt_prog_nm_Jsonclick = "" ;
      A36TAM07_CRT_PROG_NM = "" ;
      lblTextblocktam07_upd_datetime_Jsonclick = "" ;
      A37TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam07_upd_user_id_Jsonclick = "" ;
      A77TAM07_UPD_USER_ID = "" ;
      lblTextblocktam07_upd_prog_nm_Jsonclick = "" ;
      A38TAM07_UPD_PROG_NM = "" ;
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
      Z8TAM07_USER_ID = "" ;
      Z35TAM07_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z76TAM07_CRT_USER_ID = "" ;
      Z37TAM07_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z77TAM07_UPD_USER_ID = "" ;
      Z2TAM07_USER_NM = "" ;
      Z126TAM07_USER_KANA_NM = "" ;
      Z7TAM07_PWD = "" ;
      Z147TAM07_SITE_ID = "" ;
      Z593TAM07_EMAIL = "" ;
      Z16TAM07_DEL_FLG = "" ;
      Z36TAM07_CRT_PROG_NM = "" ;
      Z38TAM07_UPD_PROG_NM = "" ;
      Z14TAM07_AUTH_CD = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000A5_A8TAM07_USER_ID = new String[] {""} ;
      T000A5_A35TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A5_n35TAM07_CRT_DATETIME = new boolean[] {false} ;
      T000A5_A76TAM07_CRT_USER_ID = new String[] {""} ;
      T000A5_n76TAM07_CRT_USER_ID = new boolean[] {false} ;
      T000A5_A37TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A5_n37TAM07_UPD_DATETIME = new boolean[] {false} ;
      T000A5_A77TAM07_UPD_USER_ID = new String[] {""} ;
      T000A5_n77TAM07_UPD_USER_ID = new boolean[] {false} ;
      T000A5_A112TAM07_UPD_CNT = new long[1] ;
      T000A5_n112TAM07_UPD_CNT = new boolean[] {false} ;
      T000A5_A2TAM07_USER_NM = new String[] {""} ;
      T000A5_n2TAM07_USER_NM = new boolean[] {false} ;
      T000A5_A126TAM07_USER_KANA_NM = new String[] {""} ;
      T000A5_n126TAM07_USER_KANA_NM = new boolean[] {false} ;
      T000A5_A7TAM07_PWD = new String[] {""} ;
      T000A5_n7TAM07_PWD = new boolean[] {false} ;
      T000A5_A147TAM07_SITE_ID = new String[] {""} ;
      T000A5_n147TAM07_SITE_ID = new boolean[] {false} ;
      T000A5_A593TAM07_EMAIL = new String[] {""} ;
      T000A5_n593TAM07_EMAIL = new boolean[] {false} ;
      T000A5_A16TAM07_DEL_FLG = new String[] {""} ;
      T000A5_n16TAM07_DEL_FLG = new boolean[] {false} ;
      T000A5_A36TAM07_CRT_PROG_NM = new String[] {""} ;
      T000A5_n36TAM07_CRT_PROG_NM = new boolean[] {false} ;
      T000A5_A38TAM07_UPD_PROG_NM = new String[] {""} ;
      T000A5_n38TAM07_UPD_PROG_NM = new boolean[] {false} ;
      T000A5_A14TAM07_AUTH_CD = new String[] {""} ;
      T000A5_n14TAM07_AUTH_CD = new boolean[] {false} ;
      T000A4_A14TAM07_AUTH_CD = new String[] {""} ;
      T000A4_n14TAM07_AUTH_CD = new boolean[] {false} ;
      T000A6_A14TAM07_AUTH_CD = new String[] {""} ;
      T000A6_n14TAM07_AUTH_CD = new boolean[] {false} ;
      T000A7_A8TAM07_USER_ID = new String[] {""} ;
      T000A3_A8TAM07_USER_ID = new String[] {""} ;
      T000A3_A35TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A3_n35TAM07_CRT_DATETIME = new boolean[] {false} ;
      T000A3_A76TAM07_CRT_USER_ID = new String[] {""} ;
      T000A3_n76TAM07_CRT_USER_ID = new boolean[] {false} ;
      T000A3_A37TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A3_n37TAM07_UPD_DATETIME = new boolean[] {false} ;
      T000A3_A77TAM07_UPD_USER_ID = new String[] {""} ;
      T000A3_n77TAM07_UPD_USER_ID = new boolean[] {false} ;
      T000A3_A112TAM07_UPD_CNT = new long[1] ;
      T000A3_n112TAM07_UPD_CNT = new boolean[] {false} ;
      T000A3_A2TAM07_USER_NM = new String[] {""} ;
      T000A3_n2TAM07_USER_NM = new boolean[] {false} ;
      T000A3_A126TAM07_USER_KANA_NM = new String[] {""} ;
      T000A3_n126TAM07_USER_KANA_NM = new boolean[] {false} ;
      T000A3_A7TAM07_PWD = new String[] {""} ;
      T000A3_n7TAM07_PWD = new boolean[] {false} ;
      T000A3_A147TAM07_SITE_ID = new String[] {""} ;
      T000A3_n147TAM07_SITE_ID = new boolean[] {false} ;
      T000A3_A593TAM07_EMAIL = new String[] {""} ;
      T000A3_n593TAM07_EMAIL = new boolean[] {false} ;
      T000A3_A16TAM07_DEL_FLG = new String[] {""} ;
      T000A3_n16TAM07_DEL_FLG = new boolean[] {false} ;
      T000A3_A36TAM07_CRT_PROG_NM = new String[] {""} ;
      T000A3_n36TAM07_CRT_PROG_NM = new boolean[] {false} ;
      T000A3_A38TAM07_UPD_PROG_NM = new String[] {""} ;
      T000A3_n38TAM07_UPD_PROG_NM = new boolean[] {false} ;
      T000A3_A14TAM07_AUTH_CD = new String[] {""} ;
      T000A3_n14TAM07_AUTH_CD = new boolean[] {false} ;
      sMode10 = "" ;
      T000A8_A8TAM07_USER_ID = new String[] {""} ;
      T000A9_A8TAM07_USER_ID = new String[] {""} ;
      T000A2_A8TAM07_USER_ID = new String[] {""} ;
      T000A2_A35TAM07_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A2_n35TAM07_CRT_DATETIME = new boolean[] {false} ;
      T000A2_A76TAM07_CRT_USER_ID = new String[] {""} ;
      T000A2_n76TAM07_CRT_USER_ID = new boolean[] {false} ;
      T000A2_A37TAM07_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000A2_n37TAM07_UPD_DATETIME = new boolean[] {false} ;
      T000A2_A77TAM07_UPD_USER_ID = new String[] {""} ;
      T000A2_n77TAM07_UPD_USER_ID = new boolean[] {false} ;
      T000A2_A112TAM07_UPD_CNT = new long[1] ;
      T000A2_n112TAM07_UPD_CNT = new boolean[] {false} ;
      T000A2_A2TAM07_USER_NM = new String[] {""} ;
      T000A2_n2TAM07_USER_NM = new boolean[] {false} ;
      T000A2_A126TAM07_USER_KANA_NM = new String[] {""} ;
      T000A2_n126TAM07_USER_KANA_NM = new boolean[] {false} ;
      T000A2_A7TAM07_PWD = new String[] {""} ;
      T000A2_n7TAM07_PWD = new boolean[] {false} ;
      T000A2_A147TAM07_SITE_ID = new String[] {""} ;
      T000A2_n147TAM07_SITE_ID = new boolean[] {false} ;
      T000A2_A593TAM07_EMAIL = new String[] {""} ;
      T000A2_n593TAM07_EMAIL = new boolean[] {false} ;
      T000A2_A16TAM07_DEL_FLG = new String[] {""} ;
      T000A2_n16TAM07_DEL_FLG = new boolean[] {false} ;
      T000A2_A36TAM07_CRT_PROG_NM = new String[] {""} ;
      T000A2_n36TAM07_CRT_PROG_NM = new boolean[] {false} ;
      T000A2_A38TAM07_UPD_PROG_NM = new String[] {""} ;
      T000A2_n38TAM07_UPD_PROG_NM = new boolean[] {false} ;
      T000A2_A14TAM07_AUTH_CD = new String[] {""} ;
      T000A2_n14TAM07_AUTH_CD = new boolean[] {false} ;
      T000A13_A625TBW03_SESSION_ID = new String[] {""} ;
      T000A13_A626TBW03_APP_ID = new String[] {""} ;
      T000A13_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T000A13_A628TBW03_STUDY_ID = new long[1] ;
      T000A13_A629TBW03_SUBJECT_ID = new int[1] ;
      T000A13_A630TBW03_CRF_ID = new short[1] ;
      T000A14_A625TBW03_SESSION_ID = new String[] {""} ;
      T000A14_A626TBW03_APP_ID = new String[] {""} ;
      T000A14_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T000A14_A628TBW03_STUDY_ID = new long[1] ;
      T000A14_A629TBW03_SUBJECT_ID = new int[1] ;
      T000A14_A630TBW03_CRF_ID = new short[1] ;
      T000A15_A625TBW03_SESSION_ID = new String[] {""} ;
      T000A15_A626TBW03_APP_ID = new String[] {""} ;
      T000A15_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T000A15_A628TBW03_STUDY_ID = new long[1] ;
      T000A15_A629TBW03_SUBJECT_ID = new int[1] ;
      T000A15_A630TBW03_CRF_ID = new short[1] ;
      T000A16_A625TBW03_SESSION_ID = new String[] {""} ;
      T000A16_A626TBW03_APP_ID = new String[] {""} ;
      T000A16_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T000A16_A628TBW03_STUDY_ID = new long[1] ;
      T000A16_A629TBW03_SUBJECT_ID = new int[1] ;
      T000A16_A630TBW03_CRF_ID = new short[1] ;
      T000A17_A625TBW03_SESSION_ID = new String[] {""} ;
      T000A17_A626TBW03_APP_ID = new String[] {""} ;
      T000A17_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T000A17_A628TBW03_STUDY_ID = new long[1] ;
      T000A17_A629TBW03_SUBJECT_ID = new int[1] ;
      T000A17_A630TBW03_CRF_ID = new short[1] ;
      T000A18_A625TBW03_SESSION_ID = new String[] {""} ;
      T000A18_A626TBW03_APP_ID = new String[] {""} ;
      T000A18_A627TBW03_DISP_DATETIME = new String[] {""} ;
      T000A18_A628TBW03_STUDY_ID = new long[1] ;
      T000A18_A629TBW03_SUBJECT_ID = new int[1] ;
      T000A18_A630TBW03_CRF_ID = new short[1] ;
      T000A19_A207TBM23_STUDY_ID = new long[1] ;
      T000A19_A208TBM23_USER_ID = new String[] {""} ;
      T000A19_A407TBM23_STYDY_AUTH_CD = new String[] {""} ;
      T000A20_A8TAM07_USER_ID = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      T000A21_A14TAM07_AUTH_CD = new String[] {""} ;
      T000A21_n14TAM07_AUTH_CD = new boolean[] {false} ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam07_user__default(),
         new Object[] {
             new Object[] {
            T000A2_A8TAM07_USER_ID, T000A2_A35TAM07_CRT_DATETIME, T000A2_n35TAM07_CRT_DATETIME, T000A2_A76TAM07_CRT_USER_ID, T000A2_n76TAM07_CRT_USER_ID, T000A2_A37TAM07_UPD_DATETIME, T000A2_n37TAM07_UPD_DATETIME, T000A2_A77TAM07_UPD_USER_ID, T000A2_n77TAM07_UPD_USER_ID, T000A2_A112TAM07_UPD_CNT,
            T000A2_n112TAM07_UPD_CNT, T000A2_A2TAM07_USER_NM, T000A2_n2TAM07_USER_NM, T000A2_A126TAM07_USER_KANA_NM, T000A2_n126TAM07_USER_KANA_NM, T000A2_A7TAM07_PWD, T000A2_n7TAM07_PWD, T000A2_A147TAM07_SITE_ID, T000A2_n147TAM07_SITE_ID, T000A2_A593TAM07_EMAIL,
            T000A2_n593TAM07_EMAIL, T000A2_A16TAM07_DEL_FLG, T000A2_n16TAM07_DEL_FLG, T000A2_A36TAM07_CRT_PROG_NM, T000A2_n36TAM07_CRT_PROG_NM, T000A2_A38TAM07_UPD_PROG_NM, T000A2_n38TAM07_UPD_PROG_NM, T000A2_A14TAM07_AUTH_CD, T000A2_n14TAM07_AUTH_CD
            }
            , new Object[] {
            T000A3_A8TAM07_USER_ID, T000A3_A35TAM07_CRT_DATETIME, T000A3_n35TAM07_CRT_DATETIME, T000A3_A76TAM07_CRT_USER_ID, T000A3_n76TAM07_CRT_USER_ID, T000A3_A37TAM07_UPD_DATETIME, T000A3_n37TAM07_UPD_DATETIME, T000A3_A77TAM07_UPD_USER_ID, T000A3_n77TAM07_UPD_USER_ID, T000A3_A112TAM07_UPD_CNT,
            T000A3_n112TAM07_UPD_CNT, T000A3_A2TAM07_USER_NM, T000A3_n2TAM07_USER_NM, T000A3_A126TAM07_USER_KANA_NM, T000A3_n126TAM07_USER_KANA_NM, T000A3_A7TAM07_PWD, T000A3_n7TAM07_PWD, T000A3_A147TAM07_SITE_ID, T000A3_n147TAM07_SITE_ID, T000A3_A593TAM07_EMAIL,
            T000A3_n593TAM07_EMAIL, T000A3_A16TAM07_DEL_FLG, T000A3_n16TAM07_DEL_FLG, T000A3_A36TAM07_CRT_PROG_NM, T000A3_n36TAM07_CRT_PROG_NM, T000A3_A38TAM07_UPD_PROG_NM, T000A3_n38TAM07_UPD_PROG_NM, T000A3_A14TAM07_AUTH_CD, T000A3_n14TAM07_AUTH_CD
            }
            , new Object[] {
            T000A4_A14TAM07_AUTH_CD
            }
            , new Object[] {
            T000A5_A8TAM07_USER_ID, T000A5_A35TAM07_CRT_DATETIME, T000A5_n35TAM07_CRT_DATETIME, T000A5_A76TAM07_CRT_USER_ID, T000A5_n76TAM07_CRT_USER_ID, T000A5_A37TAM07_UPD_DATETIME, T000A5_n37TAM07_UPD_DATETIME, T000A5_A77TAM07_UPD_USER_ID, T000A5_n77TAM07_UPD_USER_ID, T000A5_A112TAM07_UPD_CNT,
            T000A5_n112TAM07_UPD_CNT, T000A5_A2TAM07_USER_NM, T000A5_n2TAM07_USER_NM, T000A5_A126TAM07_USER_KANA_NM, T000A5_n126TAM07_USER_KANA_NM, T000A5_A7TAM07_PWD, T000A5_n7TAM07_PWD, T000A5_A147TAM07_SITE_ID, T000A5_n147TAM07_SITE_ID, T000A5_A593TAM07_EMAIL,
            T000A5_n593TAM07_EMAIL, T000A5_A16TAM07_DEL_FLG, T000A5_n16TAM07_DEL_FLG, T000A5_A36TAM07_CRT_PROG_NM, T000A5_n36TAM07_CRT_PROG_NM, T000A5_A38TAM07_UPD_PROG_NM, T000A5_n38TAM07_UPD_PROG_NM, T000A5_A14TAM07_AUTH_CD, T000A5_n14TAM07_AUTH_CD
            }
            , new Object[] {
            T000A6_A14TAM07_AUTH_CD
            }
            , new Object[] {
            T000A7_A8TAM07_USER_ID
            }
            , new Object[] {
            T000A8_A8TAM07_USER_ID
            }
            , new Object[] {
            T000A9_A8TAM07_USER_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000A13_A625TBW03_SESSION_ID, T000A13_A626TBW03_APP_ID, T000A13_A627TBW03_DISP_DATETIME, T000A13_A628TBW03_STUDY_ID, T000A13_A629TBW03_SUBJECT_ID, T000A13_A630TBW03_CRF_ID
            }
            , new Object[] {
            T000A14_A625TBW03_SESSION_ID, T000A14_A626TBW03_APP_ID, T000A14_A627TBW03_DISP_DATETIME, T000A14_A628TBW03_STUDY_ID, T000A14_A629TBW03_SUBJECT_ID, T000A14_A630TBW03_CRF_ID
            }
            , new Object[] {
            T000A15_A625TBW03_SESSION_ID, T000A15_A626TBW03_APP_ID, T000A15_A627TBW03_DISP_DATETIME, T000A15_A628TBW03_STUDY_ID, T000A15_A629TBW03_SUBJECT_ID, T000A15_A630TBW03_CRF_ID
            }
            , new Object[] {
            T000A16_A625TBW03_SESSION_ID, T000A16_A626TBW03_APP_ID, T000A16_A627TBW03_DISP_DATETIME, T000A16_A628TBW03_STUDY_ID, T000A16_A629TBW03_SUBJECT_ID, T000A16_A630TBW03_CRF_ID
            }
            , new Object[] {
            T000A17_A625TBW03_SESSION_ID, T000A17_A626TBW03_APP_ID, T000A17_A627TBW03_DISP_DATETIME, T000A17_A628TBW03_STUDY_ID, T000A17_A629TBW03_SUBJECT_ID, T000A17_A630TBW03_CRF_ID
            }
            , new Object[] {
            T000A18_A625TBW03_SESSION_ID, T000A18_A626TBW03_APP_ID, T000A18_A627TBW03_DISP_DATETIME, T000A18_A628TBW03_STUDY_ID, T000A18_A629TBW03_SUBJECT_ID, T000A18_A630TBW03_CRF_ID
            }
            , new Object[] {
            T000A19_A207TBM23_STUDY_ID, T000A19_A208TBM23_USER_ID, T000A19_A407TBM23_STYDY_AUTH_CD
            }
            , new Object[] {
            T000A20_A8TAM07_USER_ID
            }
            , new Object[] {
            T000A21_A14TAM07_AUTH_CD
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
   private int AnyError14 ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long A112TAM07_UPD_CNT ;
   private long Z112TAM07_UPD_CNT ;
   private long O112TAM07_UPD_CNT ;
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
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A35TAM07_CRT_DATETIME ;
   private java.util.Date A37TAM07_UPD_DATETIME ;
   private java.util.Date Z35TAM07_CRT_DATETIME ;
   private java.util.Date Z37TAM07_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean n14TAM07_AUTH_CD ;
   private boolean wbErr ;
   private boolean n2TAM07_USER_NM ;
   private boolean n126TAM07_USER_KANA_NM ;
   private boolean n7TAM07_PWD ;
   private boolean n147TAM07_SITE_ID ;
   private boolean n593TAM07_EMAIL ;
   private boolean n16TAM07_DEL_FLG ;
   private boolean n35TAM07_CRT_DATETIME ;
   private boolean n76TAM07_CRT_USER_ID ;
   private boolean n36TAM07_CRT_PROG_NM ;
   private boolean n37TAM07_UPD_DATETIME ;
   private boolean n77TAM07_UPD_USER_ID ;
   private boolean n38TAM07_UPD_PROG_NM ;
   private boolean n112TAM07_UPD_CNT ;
   private boolean Gx_longc ;
   private String A14TAM07_AUTH_CD ;
   private String A8TAM07_USER_ID ;
   private String A2TAM07_USER_NM ;
   private String A126TAM07_USER_KANA_NM ;
   private String A7TAM07_PWD ;
   private String A147TAM07_SITE_ID ;
   private String A593TAM07_EMAIL ;
   private String A16TAM07_DEL_FLG ;
   private String A76TAM07_CRT_USER_ID ;
   private String A36TAM07_CRT_PROG_NM ;
   private String A77TAM07_UPD_USER_ID ;
   private String A38TAM07_UPD_PROG_NM ;
   private String Z8TAM07_USER_ID ;
   private String Z76TAM07_CRT_USER_ID ;
   private String Z77TAM07_UPD_USER_ID ;
   private String Z2TAM07_USER_NM ;
   private String Z126TAM07_USER_KANA_NM ;
   private String Z7TAM07_PWD ;
   private String Z147TAM07_SITE_ID ;
   private String Z593TAM07_EMAIL ;
   private String Z16TAM07_DEL_FLG ;
   private String Z36TAM07_CRT_PROG_NM ;
   private String Z38TAM07_UPD_PROG_NM ;
   private String Z14TAM07_AUTH_CD ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000A5_A8TAM07_USER_ID ;
   private java.util.Date[] T000A5_A35TAM07_CRT_DATETIME ;
   private boolean[] T000A5_n35TAM07_CRT_DATETIME ;
   private String[] T000A5_A76TAM07_CRT_USER_ID ;
   private boolean[] T000A5_n76TAM07_CRT_USER_ID ;
   private java.util.Date[] T000A5_A37TAM07_UPD_DATETIME ;
   private boolean[] T000A5_n37TAM07_UPD_DATETIME ;
   private String[] T000A5_A77TAM07_UPD_USER_ID ;
   private boolean[] T000A5_n77TAM07_UPD_USER_ID ;
   private long[] T000A5_A112TAM07_UPD_CNT ;
   private boolean[] T000A5_n112TAM07_UPD_CNT ;
   private String[] T000A5_A2TAM07_USER_NM ;
   private boolean[] T000A5_n2TAM07_USER_NM ;
   private String[] T000A5_A126TAM07_USER_KANA_NM ;
   private boolean[] T000A5_n126TAM07_USER_KANA_NM ;
   private String[] T000A5_A7TAM07_PWD ;
   private boolean[] T000A5_n7TAM07_PWD ;
   private String[] T000A5_A147TAM07_SITE_ID ;
   private boolean[] T000A5_n147TAM07_SITE_ID ;
   private String[] T000A5_A593TAM07_EMAIL ;
   private boolean[] T000A5_n593TAM07_EMAIL ;
   private String[] T000A5_A16TAM07_DEL_FLG ;
   private boolean[] T000A5_n16TAM07_DEL_FLG ;
   private String[] T000A5_A36TAM07_CRT_PROG_NM ;
   private boolean[] T000A5_n36TAM07_CRT_PROG_NM ;
   private String[] T000A5_A38TAM07_UPD_PROG_NM ;
   private boolean[] T000A5_n38TAM07_UPD_PROG_NM ;
   private String[] T000A5_A14TAM07_AUTH_CD ;
   private boolean[] T000A5_n14TAM07_AUTH_CD ;
   private String[] T000A4_A14TAM07_AUTH_CD ;
   private boolean[] T000A4_n14TAM07_AUTH_CD ;
   private String[] T000A6_A14TAM07_AUTH_CD ;
   private boolean[] T000A6_n14TAM07_AUTH_CD ;
   private String[] T000A7_A8TAM07_USER_ID ;
   private String[] T000A3_A8TAM07_USER_ID ;
   private java.util.Date[] T000A3_A35TAM07_CRT_DATETIME ;
   private boolean[] T000A3_n35TAM07_CRT_DATETIME ;
   private String[] T000A3_A76TAM07_CRT_USER_ID ;
   private boolean[] T000A3_n76TAM07_CRT_USER_ID ;
   private java.util.Date[] T000A3_A37TAM07_UPD_DATETIME ;
   private boolean[] T000A3_n37TAM07_UPD_DATETIME ;
   private String[] T000A3_A77TAM07_UPD_USER_ID ;
   private boolean[] T000A3_n77TAM07_UPD_USER_ID ;
   private long[] T000A3_A112TAM07_UPD_CNT ;
   private boolean[] T000A3_n112TAM07_UPD_CNT ;
   private String[] T000A3_A2TAM07_USER_NM ;
   private boolean[] T000A3_n2TAM07_USER_NM ;
   private String[] T000A3_A126TAM07_USER_KANA_NM ;
   private boolean[] T000A3_n126TAM07_USER_KANA_NM ;
   private String[] T000A3_A7TAM07_PWD ;
   private boolean[] T000A3_n7TAM07_PWD ;
   private String[] T000A3_A147TAM07_SITE_ID ;
   private boolean[] T000A3_n147TAM07_SITE_ID ;
   private String[] T000A3_A593TAM07_EMAIL ;
   private boolean[] T000A3_n593TAM07_EMAIL ;
   private String[] T000A3_A16TAM07_DEL_FLG ;
   private boolean[] T000A3_n16TAM07_DEL_FLG ;
   private String[] T000A3_A36TAM07_CRT_PROG_NM ;
   private boolean[] T000A3_n36TAM07_CRT_PROG_NM ;
   private String[] T000A3_A38TAM07_UPD_PROG_NM ;
   private boolean[] T000A3_n38TAM07_UPD_PROG_NM ;
   private String[] T000A3_A14TAM07_AUTH_CD ;
   private boolean[] T000A3_n14TAM07_AUTH_CD ;
   private String[] T000A8_A8TAM07_USER_ID ;
   private String[] T000A9_A8TAM07_USER_ID ;
   private String[] T000A2_A8TAM07_USER_ID ;
   private java.util.Date[] T000A2_A35TAM07_CRT_DATETIME ;
   private boolean[] T000A2_n35TAM07_CRT_DATETIME ;
   private String[] T000A2_A76TAM07_CRT_USER_ID ;
   private boolean[] T000A2_n76TAM07_CRT_USER_ID ;
   private java.util.Date[] T000A2_A37TAM07_UPD_DATETIME ;
   private boolean[] T000A2_n37TAM07_UPD_DATETIME ;
   private String[] T000A2_A77TAM07_UPD_USER_ID ;
   private boolean[] T000A2_n77TAM07_UPD_USER_ID ;
   private long[] T000A2_A112TAM07_UPD_CNT ;
   private boolean[] T000A2_n112TAM07_UPD_CNT ;
   private String[] T000A2_A2TAM07_USER_NM ;
   private boolean[] T000A2_n2TAM07_USER_NM ;
   private String[] T000A2_A126TAM07_USER_KANA_NM ;
   private boolean[] T000A2_n126TAM07_USER_KANA_NM ;
   private String[] T000A2_A7TAM07_PWD ;
   private boolean[] T000A2_n7TAM07_PWD ;
   private String[] T000A2_A147TAM07_SITE_ID ;
   private boolean[] T000A2_n147TAM07_SITE_ID ;
   private String[] T000A2_A593TAM07_EMAIL ;
   private boolean[] T000A2_n593TAM07_EMAIL ;
   private String[] T000A2_A16TAM07_DEL_FLG ;
   private boolean[] T000A2_n16TAM07_DEL_FLG ;
   private String[] T000A2_A36TAM07_CRT_PROG_NM ;
   private boolean[] T000A2_n36TAM07_CRT_PROG_NM ;
   private String[] T000A2_A38TAM07_UPD_PROG_NM ;
   private boolean[] T000A2_n38TAM07_UPD_PROG_NM ;
   private String[] T000A2_A14TAM07_AUTH_CD ;
   private boolean[] T000A2_n14TAM07_AUTH_CD ;
   private String[] T000A13_A625TBW03_SESSION_ID ;
   private String[] T000A13_A626TBW03_APP_ID ;
   private String[] T000A13_A627TBW03_DISP_DATETIME ;
   private long[] T000A13_A628TBW03_STUDY_ID ;
   private int[] T000A13_A629TBW03_SUBJECT_ID ;
   private short[] T000A13_A630TBW03_CRF_ID ;
   private String[] T000A14_A625TBW03_SESSION_ID ;
   private String[] T000A14_A626TBW03_APP_ID ;
   private String[] T000A14_A627TBW03_DISP_DATETIME ;
   private long[] T000A14_A628TBW03_STUDY_ID ;
   private int[] T000A14_A629TBW03_SUBJECT_ID ;
   private short[] T000A14_A630TBW03_CRF_ID ;
   private String[] T000A15_A625TBW03_SESSION_ID ;
   private String[] T000A15_A626TBW03_APP_ID ;
   private String[] T000A15_A627TBW03_DISP_DATETIME ;
   private long[] T000A15_A628TBW03_STUDY_ID ;
   private int[] T000A15_A629TBW03_SUBJECT_ID ;
   private short[] T000A15_A630TBW03_CRF_ID ;
   private String[] T000A16_A625TBW03_SESSION_ID ;
   private String[] T000A16_A626TBW03_APP_ID ;
   private String[] T000A16_A627TBW03_DISP_DATETIME ;
   private long[] T000A16_A628TBW03_STUDY_ID ;
   private int[] T000A16_A629TBW03_SUBJECT_ID ;
   private short[] T000A16_A630TBW03_CRF_ID ;
   private String[] T000A17_A625TBW03_SESSION_ID ;
   private String[] T000A17_A626TBW03_APP_ID ;
   private String[] T000A17_A627TBW03_DISP_DATETIME ;
   private long[] T000A17_A628TBW03_STUDY_ID ;
   private int[] T000A17_A629TBW03_SUBJECT_ID ;
   private short[] T000A17_A630TBW03_CRF_ID ;
   private String[] T000A18_A625TBW03_SESSION_ID ;
   private String[] T000A18_A626TBW03_APP_ID ;
   private String[] T000A18_A627TBW03_DISP_DATETIME ;
   private long[] T000A18_A628TBW03_STUDY_ID ;
   private int[] T000A18_A629TBW03_SUBJECT_ID ;
   private short[] T000A18_A630TBW03_CRF_ID ;
   private long[] T000A19_A207TBM23_STUDY_ID ;
   private String[] T000A19_A208TBM23_USER_ID ;
   private String[] T000A19_A407TBM23_STYDY_AUTH_CD ;
   private String[] T000A20_A8TAM07_USER_ID ;
   private String[] T000A21_A14TAM07_AUTH_CD ;
   private boolean[] T000A21_n14TAM07_AUTH_CD ;
}

final  class tam07_user__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000A2", "SELECT `TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A3", "SELECT `TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A4", "SELECT `TAM04_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A5", "SELECT TM1.`TAM07_USER_ID`, TM1.`TAM07_CRT_DATETIME`, TM1.`TAM07_CRT_USER_ID`, TM1.`TAM07_UPD_DATETIME`, TM1.`TAM07_UPD_USER_ID`, TM1.`TAM07_UPD_CNT`, TM1.`TAM07_USER_NM`, TM1.`TAM07_USER_KANA_NM`, TM1.`TAM07_PWD`, TM1.`TAM07_SITE_ID`, TM1.`TAM07_EMAIL`, TM1.`TAM07_DEL_FLG`, TM1.`TAM07_CRT_PROG_NM`, TM1.`TAM07_UPD_PROG_NM`, TM1.`TAM07_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM07_USER` TM1 WHERE TM1.`TAM07_USER_ID` = ? ORDER BY TM1.`TAM07_USER_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000A6", "SELECT `TAM04_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A7", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE `TAM07_USER_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000A8", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE ( `TAM07_USER_ID` > ?) ORDER BY `TAM07_USER_ID`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A9", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE ( `TAM07_USER_ID` < ?) ORDER BY `TAM07_USER_ID` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000A10", "INSERT INTO `TAM07_USER` (`TAM07_USER_ID`, `TAM07_CRT_DATETIME`, `TAM07_CRT_USER_ID`, `TAM07_UPD_DATETIME`, `TAM07_UPD_USER_ID`, `TAM07_UPD_CNT`, `TAM07_USER_NM`, `TAM07_USER_KANA_NM`, `TAM07_PWD`, `TAM07_SITE_ID`, `TAM07_EMAIL`, `TAM07_DEL_FLG`, `TAM07_CRT_PROG_NM`, `TAM07_UPD_PROG_NM`, `TAM07_AUTH_CD`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000A11", "UPDATE `TAM07_USER` SET `TAM07_CRT_DATETIME`=?, `TAM07_CRT_USER_ID`=?, `TAM07_UPD_DATETIME`=?, `TAM07_UPD_USER_ID`=?, `TAM07_UPD_CNT`=?, `TAM07_USER_NM`=?, `TAM07_USER_KANA_NM`=?, `TAM07_PWD`=?, `TAM07_SITE_ID`=?, `TAM07_EMAIL`=?, `TAM07_DEL_FLG`=?, `TAM07_CRT_PROG_NM`=?, `TAM07_UPD_PROG_NM`=?, `TAM07_AUTH_CD`=?  WHERE `TAM07_USER_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000A12", "DELETE FROM `TAM07_USER`  WHERE `TAM07_USER_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000A13", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_UPD_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A14", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_CRT_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A15", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_INPUT_END_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A16", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_APPROVAL_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A17", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_UPLOAD_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A18", "SELECT `TBW03_SESSION_ID`, `TBW03_APP_ID`, `TBW03_DISP_DATETIME`, `TBW03_STUDY_ID`, `TBW03_SUBJECT_ID`, `TBW03_CRF_ID` FROM `TBW03_CRF_SEARCH` WHERE `TBW03_LOCK_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A19", "SELECT `TBM23_STUDY_ID`, `TBM23_USER_ID`, `TBM23_STYDY_AUTH_CD` FROM `TBM23_STUDY_STAFF` WHERE `TBM23_USER_ID` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000A20", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` ORDER BY `TAM07_USER_ID` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000A21", "SELECT `TAM04_AUTH_CD` AS TAM07_AUTH_CD FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               break;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
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
               break;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 15 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((long[]) buf[3])[0] = rslt.getLong(4) ;
               ((int[]) buf[4])[0] = rslt.getInt(5) ;
               ((short[]) buf[5])[0] = rslt.getShort(6) ;
               break;
            case 17 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               break;
            case 18 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               break;
            case 19 :
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
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 2 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2, false);
               }
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 4 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2, false);
               }
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 8 :
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
                  stmt.setVarchar(13, (String)parms[24], 40);
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[26], 40);
               }
               if ( ((Boolean) parms[27]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[28], 2);
               }
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
                  stmt.setVarchar(12, (String)parms[23], 40);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[25], 40);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[27], 2);
               }
               stmt.setVarchar(15, (String)parms[28], 128, false);
               break;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 128, false);
               break;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 14 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 17 :
               stmt.setVarchar(1, (String)parms[0], 128);
               break;
            case 19 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 2, false);
               }
               break;
      }
   }

}

