/*
               File: tbm42_study_cdisc_domain_impl
        Description: 試験別CDISCドメインマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:34.72
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm42_study_cdisc_domain_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM42_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm42_crt_user_id1I53( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM42_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm42_upd_user_id1I53( Gx_mode) ;
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
         Form.getMeta().addItem("description", "試験別CDISCドメインマスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm42_study_cdisc_domain_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm42_study_cdisc_domain_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm42_study_cdisc_domain_impl.class ));
   }

   public tbm42_study_cdisc_domain_impl( int remoteHandle ,
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
         wb_table1_2_1I53( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1I53e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1I53( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1I53( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1I53( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1I53e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "試験別CDISCドメインマスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         wb_table3_28_1I53( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1I53e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1I53e( true) ;
      }
      else
      {
         wb_table1_2_1I53e( false) ;
      }
   }

   public void wb_table3_28_1I53( boolean wbgen )
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
         wb_table4_34_1I53( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1I53e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 112,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1I53e( true) ;
      }
      else
      {
         wb_table3_28_1I53e( false) ;
      }
   }

   public void wb_table4_34_1I53( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_study_id_Internalname, "試験ＩＤ", "", "", lblTextblocktbm42_study_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A203TBM42_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM42_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A203TBM42_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A203TBM42_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_STUDY_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_STUDY_ID_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_STUDY_ID", "right", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbm42_dom_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_DOM_CD_Internalname, GXutil.rtrim( A204TBM42_DOM_CD), GXutil.rtrim( localUtil.format( A204TBM42_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_DOM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_DOM_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_CD", "left", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_dom_enm_Internalname, "ドメイン英語名", "", "", lblTextblocktbm42_dom_enm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_DOM_ENM_Internalname, GXutil.rtrim( A905TBM42_DOM_ENM), GXutil.rtrim( localUtil.format( A905TBM42_DOM_ENM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_DOM_ENM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_DOM_ENM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_dom_jnm_Internalname, "ドメイン日本語名", "", "", lblTextblocktbm42_dom_jnm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_DOM_JNM_Internalname, GXutil.rtrim( A906TBM42_DOM_JNM), GXutil.rtrim( localUtil.format( A906TBM42_DOM_JNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_DOM_JNM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_DOM_JNM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_dom_grp_nm_Internalname, "ドメイングループ名", "", "", lblTextblocktbm42_dom_grp_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_DOM_GRP_NM_Internalname, GXutil.rtrim( A907TBM42_DOM_GRP_NM), GXutil.rtrim( localUtil.format( A907TBM42_DOM_GRP_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_DOM_GRP_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_DOM_GRP_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_note_Internalname, "備考", "", "", lblTextblocktbm42_note_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM42_NOTE_Internalname, GXutil.rtrim( A908TBM42_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", (short)(0), 1, edtTBM42_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_order_Internalname, "表示順", "", "", lblTextblocktbm42_order_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A909TBM42_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBM42_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A909TBM42_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A909TBM42_ORDER), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_ORDER_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_ORDER_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm42_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_DEL_FLG_Internalname, GXutil.rtrim( A893TBM42_DEL_FLG), GXutil.rtrim( localUtil.format( A893TBM42_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm42_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM42_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_CRT_DATETIME_Internalname, localUtil.format(A894TBM42_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A894TBM42_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM42_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM42_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_crt_user_id_Internalname, "ID", "", "", lblTextblocktbm42_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_CRT_USER_ID_Internalname, GXutil.rtrim( A895TBM42_CRT_USER_ID), GXutil.rtrim( localUtil.format( A895TBM42_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm42_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_CRT_PROG_NM_Internalname, GXutil.rtrim( A896TBM42_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A896TBM42_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm42_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM42_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_UPD_DATETIME_Internalname, localUtil.format(A897TBM42_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A897TBM42_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM42_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM42_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_upd_user_id_Internalname, "更新ユーザーＩＤ", "", "", lblTextblocktbm42_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_UPD_USER_ID_Internalname, GXutil.rtrim( A898TBM42_UPD_USER_ID), GXutil.rtrim( localUtil.format( A898TBM42_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_upd_prog_nm_Internalname, "更新プログラムＩＤ", "", "", lblTextblocktbm42_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_UPD_PROG_NM_Internalname, GXutil.rtrim( A899TBM42_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A899TBM42_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm42_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm42_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM42_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A900TBM42_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM42_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A900TBM42_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A900TBM42_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM42_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM42_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1I53e( true) ;
      }
      else
      {
         wb_table4_34_1I53e( false) ;
      }
   }

   public void wb_table2_5_1I53( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM42_STUDY_CDISC_DOMAIN.htm");
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
         wb_table2_5_1I53e( true) ;
      }
      else
      {
         wb_table2_5_1I53e( false) ;
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
      /* Execute user event: e111I2 */
      e111I2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM42_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM42_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM42_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A203TBM42_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
            }
            else
            {
               A203TBM42_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM42_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
            }
            A204TBM42_DOM_CD = httpContext.cgiGet( edtTBM42_DOM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
            A905TBM42_DOM_ENM = httpContext.cgiGet( edtTBM42_DOM_ENM_Internalname) ;
            n905TBM42_DOM_ENM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A905TBM42_DOM_ENM", A905TBM42_DOM_ENM);
            n905TBM42_DOM_ENM = ((GXutil.strcmp("", A905TBM42_DOM_ENM)==0) ? true : false) ;
            A906TBM42_DOM_JNM = httpContext.cgiGet( edtTBM42_DOM_JNM_Internalname) ;
            n906TBM42_DOM_JNM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A906TBM42_DOM_JNM", A906TBM42_DOM_JNM);
            n906TBM42_DOM_JNM = ((GXutil.strcmp("", A906TBM42_DOM_JNM)==0) ? true : false) ;
            A907TBM42_DOM_GRP_NM = httpContext.cgiGet( edtTBM42_DOM_GRP_NM_Internalname) ;
            n907TBM42_DOM_GRP_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A907TBM42_DOM_GRP_NM", A907TBM42_DOM_GRP_NM);
            n907TBM42_DOM_GRP_NM = ((GXutil.strcmp("", A907TBM42_DOM_GRP_NM)==0) ? true : false) ;
            A908TBM42_NOTE = httpContext.cgiGet( edtTBM42_NOTE_Internalname) ;
            n908TBM42_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A908TBM42_NOTE", A908TBM42_NOTE);
            n908TBM42_NOTE = ((GXutil.strcmp("", A908TBM42_NOTE)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM42_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM42_ORDER_Internalname), ".", ",") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM42_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM42_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A909TBM42_ORDER = 0 ;
               n909TBM42_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A909TBM42_ORDER", GXutil.ltrim( GXutil.str( A909TBM42_ORDER, 5, 0)));
            }
            else
            {
               A909TBM42_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM42_ORDER_Internalname), ".", ",")) ;
               n909TBM42_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A909TBM42_ORDER", GXutil.ltrim( GXutil.str( A909TBM42_ORDER, 5, 0)));
            }
            n909TBM42_ORDER = ((0==A909TBM42_ORDER) ? true : false) ;
            A893TBM42_DEL_FLG = httpContext.cgiGet( edtTBM42_DEL_FLG_Internalname) ;
            n893TBM42_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A893TBM42_DEL_FLG", A893TBM42_DEL_FLG);
            n893TBM42_DEL_FLG = ((GXutil.strcmp("", A893TBM42_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM42_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM42_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM42_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A894TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n894TBM42_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A894TBM42_CRT_DATETIME", localUtil.ttoc( A894TBM42_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A894TBM42_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM42_CRT_DATETIME_Internalname)) ;
               n894TBM42_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A894TBM42_CRT_DATETIME", localUtil.ttoc( A894TBM42_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n894TBM42_CRT_DATETIME = (GXutil.nullDate().equals(A894TBM42_CRT_DATETIME) ? true : false) ;
            A895TBM42_CRT_USER_ID = httpContext.cgiGet( edtTBM42_CRT_USER_ID_Internalname) ;
            n895TBM42_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A895TBM42_CRT_USER_ID", A895TBM42_CRT_USER_ID);
            n895TBM42_CRT_USER_ID = ((GXutil.strcmp("", A895TBM42_CRT_USER_ID)==0) ? true : false) ;
            A896TBM42_CRT_PROG_NM = httpContext.cgiGet( edtTBM42_CRT_PROG_NM_Internalname) ;
            n896TBM42_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A896TBM42_CRT_PROG_NM", A896TBM42_CRT_PROG_NM);
            n896TBM42_CRT_PROG_NM = ((GXutil.strcmp("", A896TBM42_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM42_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM42_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM42_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A897TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n897TBM42_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A897TBM42_UPD_DATETIME", localUtil.ttoc( A897TBM42_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A897TBM42_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM42_UPD_DATETIME_Internalname)) ;
               n897TBM42_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A897TBM42_UPD_DATETIME", localUtil.ttoc( A897TBM42_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n897TBM42_UPD_DATETIME = (GXutil.nullDate().equals(A897TBM42_UPD_DATETIME) ? true : false) ;
            A898TBM42_UPD_USER_ID = httpContext.cgiGet( edtTBM42_UPD_USER_ID_Internalname) ;
            n898TBM42_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A898TBM42_UPD_USER_ID", A898TBM42_UPD_USER_ID);
            n898TBM42_UPD_USER_ID = ((GXutil.strcmp("", A898TBM42_UPD_USER_ID)==0) ? true : false) ;
            A899TBM42_UPD_PROG_NM = httpContext.cgiGet( edtTBM42_UPD_PROG_NM_Internalname) ;
            n899TBM42_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A899TBM42_UPD_PROG_NM", A899TBM42_UPD_PROG_NM);
            n899TBM42_UPD_PROG_NM = ((GXutil.strcmp("", A899TBM42_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM42_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM42_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM42_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM42_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A900TBM42_UPD_CNT = 0 ;
               n900TBM42_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A900TBM42_UPD_CNT", GXutil.ltrim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)));
            }
            else
            {
               A900TBM42_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM42_UPD_CNT_Internalname), ".", ",") ;
               n900TBM42_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A900TBM42_UPD_CNT", GXutil.ltrim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)));
            }
            n900TBM42_UPD_CNT = ((0==A900TBM42_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z203TBM42_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z203TBM42_STUDY_ID"), ".", ",") ;
            Z204TBM42_DOM_CD = httpContext.cgiGet( "Z204TBM42_DOM_CD") ;
            Z894TBM42_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z894TBM42_CRT_DATETIME"), 0) ;
            n894TBM42_CRT_DATETIME = (GXutil.nullDate().equals(A894TBM42_CRT_DATETIME) ? true : false) ;
            Z895TBM42_CRT_USER_ID = httpContext.cgiGet( "Z895TBM42_CRT_USER_ID") ;
            n895TBM42_CRT_USER_ID = ((GXutil.strcmp("", A895TBM42_CRT_USER_ID)==0) ? true : false) ;
            Z897TBM42_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z897TBM42_UPD_DATETIME"), 0) ;
            n897TBM42_UPD_DATETIME = (GXutil.nullDate().equals(A897TBM42_UPD_DATETIME) ? true : false) ;
            Z898TBM42_UPD_USER_ID = httpContext.cgiGet( "Z898TBM42_UPD_USER_ID") ;
            n898TBM42_UPD_USER_ID = ((GXutil.strcmp("", A898TBM42_UPD_USER_ID)==0) ? true : false) ;
            Z900TBM42_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z900TBM42_UPD_CNT"), ".", ",") ;
            n900TBM42_UPD_CNT = ((0==A900TBM42_UPD_CNT) ? true : false) ;
            Z905TBM42_DOM_ENM = httpContext.cgiGet( "Z905TBM42_DOM_ENM") ;
            n905TBM42_DOM_ENM = ((GXutil.strcmp("", A905TBM42_DOM_ENM)==0) ? true : false) ;
            Z906TBM42_DOM_JNM = httpContext.cgiGet( "Z906TBM42_DOM_JNM") ;
            n906TBM42_DOM_JNM = ((GXutil.strcmp("", A906TBM42_DOM_JNM)==0) ? true : false) ;
            Z907TBM42_DOM_GRP_NM = httpContext.cgiGet( "Z907TBM42_DOM_GRP_NM") ;
            n907TBM42_DOM_GRP_NM = ((GXutil.strcmp("", A907TBM42_DOM_GRP_NM)==0) ? true : false) ;
            Z908TBM42_NOTE = httpContext.cgiGet( "Z908TBM42_NOTE") ;
            n908TBM42_NOTE = ((GXutil.strcmp("", A908TBM42_NOTE)==0) ? true : false) ;
            Z909TBM42_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( "Z909TBM42_ORDER"), ".", ",")) ;
            n909TBM42_ORDER = ((0==A909TBM42_ORDER) ? true : false) ;
            Z893TBM42_DEL_FLG = httpContext.cgiGet( "Z893TBM42_DEL_FLG") ;
            n893TBM42_DEL_FLG = ((GXutil.strcmp("", A893TBM42_DEL_FLG)==0) ? true : false) ;
            Z896TBM42_CRT_PROG_NM = httpContext.cgiGet( "Z896TBM42_CRT_PROG_NM") ;
            n896TBM42_CRT_PROG_NM = ((GXutil.strcmp("", A896TBM42_CRT_PROG_NM)==0) ? true : false) ;
            Z899TBM42_UPD_PROG_NM = httpContext.cgiGet( "Z899TBM42_UPD_PROG_NM") ;
            n899TBM42_UPD_PROG_NM = ((GXutil.strcmp("", A899TBM42_UPD_PROG_NM)==0) ? true : false) ;
            O900TBM42_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O900TBM42_UPD_CNT"), ".", ",") ;
            n900TBM42_UPD_CNT = ((0==A900TBM42_UPD_CNT) ? true : false) ;
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
               A203TBM42_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
               A204TBM42_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
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
                     /* Execute user event: e111I2 */
                     e111I2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e121I2 */
                     e121I2 ();
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
         /* Execute user event: e121I2 */
         e121I2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1I53( ) ;
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
      disableAttributes1I53( ) ;
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

   public void resetCaption1I0( )
   {
   }

   public void e111I2( )
   {
      /* Start Routine */
      AV7W_BC_FLG = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_BC_FLG", AV7W_BC_FLG);
      if ( GXutil.strcmp(AV7W_BC_FLG, "1") != 0 )
      {
         new a804_pc01_syslog(remoteHandle, context).execute( AV9Pgmname, "ERR", "禁止機能") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
         GXKey = context.getSiteKey( ) ;
         GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("8")) ;
         httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
         httpContext.wjLocDisableFrm = (byte)(1) ;
      }
   }

   public void e121I2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV8W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + "ドメインコード:" + A204TBM42_DOM_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + A905TBM42_DOM_ENM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + A906TBM42_DOM_JNM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + A907TBM42_DOM_GRP_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + A908TBM42_NOTE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A909TBM42_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + A893TBM42_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      GXt_char1 = AV8W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A894TBM42_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm42_study_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A894TBM42_CRT_DATETIME", localUtil.ttoc( A894TBM42_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV8W_TXT = AV8W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + A895TBM42_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + A896TBM42_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      GXt_char1 = AV8W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A897TBM42_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm42_study_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A897TBM42_UPD_DATETIME", localUtil.ttoc( A897TBM42_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV8W_TXT = AV8W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + A898TBM42_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + A899TBM42_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = AV8W_TXT + GXutil.trim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      AV8W_TXT = GXutil.strReplace( AV8W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
      new a804_pc03_datalog(remoteHandle, context).execute( AV9Pgmname, Gx_mode, AV8W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "AV8W_TXT", AV8W_TXT);
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

   public void zm1I53( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z894TBM42_CRT_DATETIME = T001I3_A894TBM42_CRT_DATETIME[0] ;
            Z895TBM42_CRT_USER_ID = T001I3_A895TBM42_CRT_USER_ID[0] ;
            Z897TBM42_UPD_DATETIME = T001I3_A897TBM42_UPD_DATETIME[0] ;
            Z898TBM42_UPD_USER_ID = T001I3_A898TBM42_UPD_USER_ID[0] ;
            Z900TBM42_UPD_CNT = T001I3_A900TBM42_UPD_CNT[0] ;
            Z905TBM42_DOM_ENM = T001I3_A905TBM42_DOM_ENM[0] ;
            Z906TBM42_DOM_JNM = T001I3_A906TBM42_DOM_JNM[0] ;
            Z907TBM42_DOM_GRP_NM = T001I3_A907TBM42_DOM_GRP_NM[0] ;
            Z908TBM42_NOTE = T001I3_A908TBM42_NOTE[0] ;
            Z909TBM42_ORDER = T001I3_A909TBM42_ORDER[0] ;
            Z893TBM42_DEL_FLG = T001I3_A893TBM42_DEL_FLG[0] ;
            Z896TBM42_CRT_PROG_NM = T001I3_A896TBM42_CRT_PROG_NM[0] ;
            Z899TBM42_UPD_PROG_NM = T001I3_A899TBM42_UPD_PROG_NM[0] ;
         }
         else
         {
            Z894TBM42_CRT_DATETIME = A894TBM42_CRT_DATETIME ;
            Z895TBM42_CRT_USER_ID = A895TBM42_CRT_USER_ID ;
            Z897TBM42_UPD_DATETIME = A897TBM42_UPD_DATETIME ;
            Z898TBM42_UPD_USER_ID = A898TBM42_UPD_USER_ID ;
            Z900TBM42_UPD_CNT = A900TBM42_UPD_CNT ;
            Z905TBM42_DOM_ENM = A905TBM42_DOM_ENM ;
            Z906TBM42_DOM_JNM = A906TBM42_DOM_JNM ;
            Z907TBM42_DOM_GRP_NM = A907TBM42_DOM_GRP_NM ;
            Z908TBM42_NOTE = A908TBM42_NOTE ;
            Z909TBM42_ORDER = A909TBM42_ORDER ;
            Z893TBM42_DEL_FLG = A893TBM42_DEL_FLG ;
            Z896TBM42_CRT_PROG_NM = A896TBM42_CRT_PROG_NM ;
            Z899TBM42_UPD_PROG_NM = A899TBM42_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z203TBM42_STUDY_ID = A203TBM42_STUDY_ID ;
         Z204TBM42_DOM_CD = A204TBM42_DOM_CD ;
         Z894TBM42_CRT_DATETIME = A894TBM42_CRT_DATETIME ;
         Z895TBM42_CRT_USER_ID = A895TBM42_CRT_USER_ID ;
         Z897TBM42_UPD_DATETIME = A897TBM42_UPD_DATETIME ;
         Z898TBM42_UPD_USER_ID = A898TBM42_UPD_USER_ID ;
         Z900TBM42_UPD_CNT = A900TBM42_UPD_CNT ;
         Z905TBM42_DOM_ENM = A905TBM42_DOM_ENM ;
         Z906TBM42_DOM_JNM = A906TBM42_DOM_JNM ;
         Z907TBM42_DOM_GRP_NM = A907TBM42_DOM_GRP_NM ;
         Z908TBM42_NOTE = A908TBM42_NOTE ;
         Z909TBM42_ORDER = A909TBM42_ORDER ;
         Z893TBM42_DEL_FLG = A893TBM42_DEL_FLG ;
         Z896TBM42_CRT_PROG_NM = A896TBM42_CRT_PROG_NM ;
         Z899TBM42_UPD_PROG_NM = A899TBM42_UPD_PROG_NM ;
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

   public void load1I53( )
   {
      /* Using cursor T001I4 */
      pr_default.execute(2, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound53 = (short)(1) ;
         A894TBM42_CRT_DATETIME = T001I4_A894TBM42_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A894TBM42_CRT_DATETIME", localUtil.ttoc( A894TBM42_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n894TBM42_CRT_DATETIME = T001I4_n894TBM42_CRT_DATETIME[0] ;
         A895TBM42_CRT_USER_ID = T001I4_A895TBM42_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A895TBM42_CRT_USER_ID", A895TBM42_CRT_USER_ID);
         n895TBM42_CRT_USER_ID = T001I4_n895TBM42_CRT_USER_ID[0] ;
         A897TBM42_UPD_DATETIME = T001I4_A897TBM42_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A897TBM42_UPD_DATETIME", localUtil.ttoc( A897TBM42_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n897TBM42_UPD_DATETIME = T001I4_n897TBM42_UPD_DATETIME[0] ;
         A898TBM42_UPD_USER_ID = T001I4_A898TBM42_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898TBM42_UPD_USER_ID", A898TBM42_UPD_USER_ID);
         n898TBM42_UPD_USER_ID = T001I4_n898TBM42_UPD_USER_ID[0] ;
         A900TBM42_UPD_CNT = T001I4_A900TBM42_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A900TBM42_UPD_CNT", GXutil.ltrim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)));
         n900TBM42_UPD_CNT = T001I4_n900TBM42_UPD_CNT[0] ;
         A905TBM42_DOM_ENM = T001I4_A905TBM42_DOM_ENM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A905TBM42_DOM_ENM", A905TBM42_DOM_ENM);
         n905TBM42_DOM_ENM = T001I4_n905TBM42_DOM_ENM[0] ;
         A906TBM42_DOM_JNM = T001I4_A906TBM42_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A906TBM42_DOM_JNM", A906TBM42_DOM_JNM);
         n906TBM42_DOM_JNM = T001I4_n906TBM42_DOM_JNM[0] ;
         A907TBM42_DOM_GRP_NM = T001I4_A907TBM42_DOM_GRP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A907TBM42_DOM_GRP_NM", A907TBM42_DOM_GRP_NM);
         n907TBM42_DOM_GRP_NM = T001I4_n907TBM42_DOM_GRP_NM[0] ;
         A908TBM42_NOTE = T001I4_A908TBM42_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A908TBM42_NOTE", A908TBM42_NOTE);
         n908TBM42_NOTE = T001I4_n908TBM42_NOTE[0] ;
         A909TBM42_ORDER = T001I4_A909TBM42_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A909TBM42_ORDER", GXutil.ltrim( GXutil.str( A909TBM42_ORDER, 5, 0)));
         n909TBM42_ORDER = T001I4_n909TBM42_ORDER[0] ;
         A893TBM42_DEL_FLG = T001I4_A893TBM42_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893TBM42_DEL_FLG", A893TBM42_DEL_FLG);
         n893TBM42_DEL_FLG = T001I4_n893TBM42_DEL_FLG[0] ;
         A896TBM42_CRT_PROG_NM = T001I4_A896TBM42_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A896TBM42_CRT_PROG_NM", A896TBM42_CRT_PROG_NM);
         n896TBM42_CRT_PROG_NM = T001I4_n896TBM42_CRT_PROG_NM[0] ;
         A899TBM42_UPD_PROG_NM = T001I4_A899TBM42_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A899TBM42_UPD_PROG_NM", A899TBM42_UPD_PROG_NM);
         n899TBM42_UPD_PROG_NM = T001I4_n899TBM42_UPD_PROG_NM[0] ;
         zm1I53( -8) ;
      }
      pr_default.close(2);
      onLoadActions1I53( ) ;
   }

   public void onLoadActions1I53( )
   {
      AV9Pgmname = "TBM42_STUDY_CDISC_DOMAIN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable1I53( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM42_STUDY_CDISC_DOMAIN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A894TBM42_CRT_DATETIME) || (( A894TBM42_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A894TBM42_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM42_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM42_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A897TBM42_UPD_DATETIME) || (( A897TBM42_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A897TBM42_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM42_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM42_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1I53( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1I53( )
   {
      /* Using cursor T001I5 */
      pr_default.execute(3, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound53 = (short)(1) ;
      }
      else
      {
         RcdFound53 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001I3 */
      pr_default.execute(1, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1I53( 8) ;
         RcdFound53 = (short)(1) ;
         A203TBM42_STUDY_ID = T001I3_A203TBM42_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
         A204TBM42_DOM_CD = T001I3_A204TBM42_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
         A894TBM42_CRT_DATETIME = T001I3_A894TBM42_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A894TBM42_CRT_DATETIME", localUtil.ttoc( A894TBM42_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n894TBM42_CRT_DATETIME = T001I3_n894TBM42_CRT_DATETIME[0] ;
         A895TBM42_CRT_USER_ID = T001I3_A895TBM42_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A895TBM42_CRT_USER_ID", A895TBM42_CRT_USER_ID);
         n895TBM42_CRT_USER_ID = T001I3_n895TBM42_CRT_USER_ID[0] ;
         A897TBM42_UPD_DATETIME = T001I3_A897TBM42_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A897TBM42_UPD_DATETIME", localUtil.ttoc( A897TBM42_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n897TBM42_UPD_DATETIME = T001I3_n897TBM42_UPD_DATETIME[0] ;
         A898TBM42_UPD_USER_ID = T001I3_A898TBM42_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A898TBM42_UPD_USER_ID", A898TBM42_UPD_USER_ID);
         n898TBM42_UPD_USER_ID = T001I3_n898TBM42_UPD_USER_ID[0] ;
         A900TBM42_UPD_CNT = T001I3_A900TBM42_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A900TBM42_UPD_CNT", GXutil.ltrim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)));
         n900TBM42_UPD_CNT = T001I3_n900TBM42_UPD_CNT[0] ;
         A905TBM42_DOM_ENM = T001I3_A905TBM42_DOM_ENM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A905TBM42_DOM_ENM", A905TBM42_DOM_ENM);
         n905TBM42_DOM_ENM = T001I3_n905TBM42_DOM_ENM[0] ;
         A906TBM42_DOM_JNM = T001I3_A906TBM42_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A906TBM42_DOM_JNM", A906TBM42_DOM_JNM);
         n906TBM42_DOM_JNM = T001I3_n906TBM42_DOM_JNM[0] ;
         A907TBM42_DOM_GRP_NM = T001I3_A907TBM42_DOM_GRP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A907TBM42_DOM_GRP_NM", A907TBM42_DOM_GRP_NM);
         n907TBM42_DOM_GRP_NM = T001I3_n907TBM42_DOM_GRP_NM[0] ;
         A908TBM42_NOTE = T001I3_A908TBM42_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A908TBM42_NOTE", A908TBM42_NOTE);
         n908TBM42_NOTE = T001I3_n908TBM42_NOTE[0] ;
         A909TBM42_ORDER = T001I3_A909TBM42_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A909TBM42_ORDER", GXutil.ltrim( GXutil.str( A909TBM42_ORDER, 5, 0)));
         n909TBM42_ORDER = T001I3_n909TBM42_ORDER[0] ;
         A893TBM42_DEL_FLG = T001I3_A893TBM42_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A893TBM42_DEL_FLG", A893TBM42_DEL_FLG);
         n893TBM42_DEL_FLG = T001I3_n893TBM42_DEL_FLG[0] ;
         A896TBM42_CRT_PROG_NM = T001I3_A896TBM42_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A896TBM42_CRT_PROG_NM", A896TBM42_CRT_PROG_NM);
         n896TBM42_CRT_PROG_NM = T001I3_n896TBM42_CRT_PROG_NM[0] ;
         A899TBM42_UPD_PROG_NM = T001I3_A899TBM42_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A899TBM42_UPD_PROG_NM", A899TBM42_UPD_PROG_NM);
         n899TBM42_UPD_PROG_NM = T001I3_n899TBM42_UPD_PROG_NM[0] ;
         O900TBM42_UPD_CNT = A900TBM42_UPD_CNT ;
         n900TBM42_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A900TBM42_UPD_CNT", GXutil.ltrim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)));
         Z203TBM42_STUDY_ID = A203TBM42_STUDY_ID ;
         Z204TBM42_DOM_CD = A204TBM42_DOM_CD ;
         sMode53 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1I53( ) ;
         if ( AnyError == 1 )
         {
            RcdFound53 = (short)(0) ;
            initializeNonKey1I53( ) ;
         }
         Gx_mode = sMode53 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound53 = (short)(0) ;
         initializeNonKey1I53( ) ;
         sMode53 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode53 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1I53( ) ;
      if ( RcdFound53 == 0 )
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
      RcdFound53 = (short)(0) ;
      /* Using cursor T001I6 */
      pr_default.execute(4, new Object[] {new Long(A203TBM42_STUDY_ID), new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T001I6_A203TBM42_STUDY_ID[0] < A203TBM42_STUDY_ID ) || ( T001I6_A203TBM42_STUDY_ID[0] == A203TBM42_STUDY_ID ) && ( GXutil.strcmp(T001I6_A204TBM42_DOM_CD[0], A204TBM42_DOM_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T001I6_A203TBM42_STUDY_ID[0] > A203TBM42_STUDY_ID ) || ( T001I6_A203TBM42_STUDY_ID[0] == A203TBM42_STUDY_ID ) && ( GXutil.strcmp(T001I6_A204TBM42_DOM_CD[0], A204TBM42_DOM_CD) > 0 ) ) )
         {
            A203TBM42_STUDY_ID = T001I6_A203TBM42_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
            A204TBM42_DOM_CD = T001I6_A204TBM42_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
            RcdFound53 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound53 = (short)(0) ;
      /* Using cursor T001I7 */
      pr_default.execute(5, new Object[] {new Long(A203TBM42_STUDY_ID), new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T001I7_A203TBM42_STUDY_ID[0] > A203TBM42_STUDY_ID ) || ( T001I7_A203TBM42_STUDY_ID[0] == A203TBM42_STUDY_ID ) && ( GXutil.strcmp(T001I7_A204TBM42_DOM_CD[0], A204TBM42_DOM_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T001I7_A203TBM42_STUDY_ID[0] < A203TBM42_STUDY_ID ) || ( T001I7_A203TBM42_STUDY_ID[0] == A203TBM42_STUDY_ID ) && ( GXutil.strcmp(T001I7_A204TBM42_DOM_CD[0], A204TBM42_DOM_CD) < 0 ) ) )
         {
            A203TBM42_STUDY_ID = T001I7_A203TBM42_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
            A204TBM42_DOM_CD = T001I7_A204TBM42_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
            RcdFound53 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1I53( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1I53( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound53 == 1 )
         {
            if ( ( A203TBM42_STUDY_ID != Z203TBM42_STUDY_ID ) || ( GXutil.strcmp(A204TBM42_DOM_CD, Z204TBM42_DOM_CD) != 0 ) )
            {
               A203TBM42_STUDY_ID = Z203TBM42_STUDY_ID ;
               httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
               A204TBM42_DOM_CD = Z204TBM42_DOM_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM42_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1I53( ) ;
               GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( ( A203TBM42_STUDY_ID != Z203TBM42_STUDY_ID ) || ( GXutil.strcmp(A204TBM42_DOM_CD, Z204TBM42_DOM_CD) != 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1I53( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM42_STUDY_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1I53( ) ;
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
      if ( ( A203TBM42_STUDY_ID != Z203TBM42_STUDY_ID ) || ( GXutil.strcmp(A204TBM42_DOM_CD, Z204TBM42_DOM_CD) != 0 ) )
      {
         A203TBM42_STUDY_ID = Z203TBM42_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
         A204TBM42_DOM_CD = Z204TBM42_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM42_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
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
      if ( RcdFound53 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM42_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM42_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM42_DOM_ENM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1I53( ) ;
      if ( RcdFound53 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM42_DOM_ENM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1I53( ) ;
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
      if ( RcdFound53 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM42_DOM_ENM_Internalname ;
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
      if ( RcdFound53 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM42_DOM_ENM_Internalname ;
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
      scanStart1I53( ) ;
      if ( RcdFound53 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound53 != 0 )
         {
            scanNext1I53( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM42_DOM_ENM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1I53( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1I53( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001I2 */
         pr_default.execute(0, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM42_STUDY_CDISC_DOMAIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z894TBM42_CRT_DATETIME.equals( T001I2_A894TBM42_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z895TBM42_CRT_USER_ID, T001I2_A895TBM42_CRT_USER_ID[0]) != 0 ) || !( Z897TBM42_UPD_DATETIME.equals( T001I2_A897TBM42_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z898TBM42_UPD_USER_ID, T001I2_A898TBM42_UPD_USER_ID[0]) != 0 ) || ( Z900TBM42_UPD_CNT != T001I2_A900TBM42_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z905TBM42_DOM_ENM, T001I2_A905TBM42_DOM_ENM[0]) != 0 ) || ( GXutil.strcmp(Z906TBM42_DOM_JNM, T001I2_A906TBM42_DOM_JNM[0]) != 0 ) || ( GXutil.strcmp(Z907TBM42_DOM_GRP_NM, T001I2_A907TBM42_DOM_GRP_NM[0]) != 0 ) || ( GXutil.strcmp(Z908TBM42_NOTE, T001I2_A908TBM42_NOTE[0]) != 0 ) || ( Z909TBM42_ORDER != T001I2_A909TBM42_ORDER[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z893TBM42_DEL_FLG, T001I2_A893TBM42_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z896TBM42_CRT_PROG_NM, T001I2_A896TBM42_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z899TBM42_UPD_PROG_NM, T001I2_A899TBM42_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM42_STUDY_CDISC_DOMAIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1I53( )
   {
      beforeValidate1I53( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I53( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1I53( 0) ;
         checkOptimisticConcurrency1I53( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1I53( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1I53( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001I8 */
                  pr_default.execute(6, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD, new Boolean(n894TBM42_CRT_DATETIME), A894TBM42_CRT_DATETIME, new Boolean(n895TBM42_CRT_USER_ID), A895TBM42_CRT_USER_ID, new Boolean(n897TBM42_UPD_DATETIME), A897TBM42_UPD_DATETIME, new Boolean(n898TBM42_UPD_USER_ID), A898TBM42_UPD_USER_ID, new Boolean(n900TBM42_UPD_CNT), new Long(A900TBM42_UPD_CNT), new Boolean(n905TBM42_DOM_ENM), A905TBM42_DOM_ENM, new Boolean(n906TBM42_DOM_JNM), A906TBM42_DOM_JNM, new Boolean(n907TBM42_DOM_GRP_NM), A907TBM42_DOM_GRP_NM, new Boolean(n908TBM42_NOTE), A908TBM42_NOTE, new Boolean(n909TBM42_ORDER), new Integer(A909TBM42_ORDER), new Boolean(n893TBM42_DEL_FLG), A893TBM42_DEL_FLG, new Boolean(n896TBM42_CRT_PROG_NM), A896TBM42_CRT_PROG_NM, new Boolean(n899TBM42_UPD_PROG_NM), A899TBM42_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM42_STUDY_CDISC_DOMAIN") ;
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
                        resetCaption1I0( ) ;
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
            load1I53( ) ;
         }
         endLevel1I53( ) ;
      }
      closeExtendedTableCursors1I53( ) ;
   }

   public void update1I53( )
   {
      beforeValidate1I53( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1I53( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1I53( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1I53( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1I53( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001I9 */
                  pr_default.execute(7, new Object[] {new Boolean(n894TBM42_CRT_DATETIME), A894TBM42_CRT_DATETIME, new Boolean(n895TBM42_CRT_USER_ID), A895TBM42_CRT_USER_ID, new Boolean(n897TBM42_UPD_DATETIME), A897TBM42_UPD_DATETIME, new Boolean(n898TBM42_UPD_USER_ID), A898TBM42_UPD_USER_ID, new Boolean(n900TBM42_UPD_CNT), new Long(A900TBM42_UPD_CNT), new Boolean(n905TBM42_DOM_ENM), A905TBM42_DOM_ENM, new Boolean(n906TBM42_DOM_JNM), A906TBM42_DOM_JNM, new Boolean(n907TBM42_DOM_GRP_NM), A907TBM42_DOM_GRP_NM, new Boolean(n908TBM42_NOTE), A908TBM42_NOTE, new Boolean(n909TBM42_ORDER), new Integer(A909TBM42_ORDER), new Boolean(n893TBM42_DEL_FLG), A893TBM42_DEL_FLG, new Boolean(n896TBM42_CRT_PROG_NM), A896TBM42_CRT_PROG_NM, new Boolean(n899TBM42_UPD_PROG_NM), A899TBM42_UPD_PROG_NM, new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM42_STUDY_CDISC_DOMAIN") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM42_STUDY_CDISC_DOMAIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1I53( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption1I0( ) ;
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
         endLevel1I53( ) ;
      }
      closeExtendedTableCursors1I53( ) ;
   }

   public void deferredUpdate1I53( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1I53( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1I53( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1I53( ) ;
         afterConfirm1I53( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1I53( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001I10 */
               pr_default.execute(8, new Object[] {new Long(A203TBM42_STUDY_ID), A204TBM42_DOM_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM42_STUDY_CDISC_DOMAIN") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound53 == 0 )
                     {
                        initAll1I53( ) ;
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
                     resetCaption1I0( ) ;
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
      sMode53 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1I53( ) ;
      Gx_mode = sMode53 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1I53( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM42_STUDY_CDISC_DOMAIN" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel1I53( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1I53( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm42_study_cdisc_domain");
         if ( AnyError == 0 )
         {
            confirmValues1I0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm42_study_cdisc_domain");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1I53( )
   {
      /* Scan By routine */
      /* Using cursor T001I11 */
      pr_default.execute(9);
      RcdFound53 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound53 = (short)(1) ;
         A203TBM42_STUDY_ID = T001I11_A203TBM42_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
         A204TBM42_DOM_CD = T001I11_A204TBM42_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1I53( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound53 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound53 = (short)(1) ;
         A203TBM42_STUDY_ID = T001I11_A203TBM42_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
         A204TBM42_DOM_CD = T001I11_A204TBM42_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
      }
   }

   public void scanEnd1I53( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1I53( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1I53( )
   {
      /* Before Insert Rules */
      A894TBM42_CRT_DATETIME = GXutil.now( ) ;
      n894TBM42_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A894TBM42_CRT_DATETIME", localUtil.ttoc( A894TBM42_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A895TBM42_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm42_study_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      A895TBM42_CRT_USER_ID = GXt_char1 ;
      n895TBM42_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A895TBM42_CRT_USER_ID", A895TBM42_CRT_USER_ID);
      A897TBM42_UPD_DATETIME = GXutil.now( ) ;
      n897TBM42_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A897TBM42_UPD_DATETIME", localUtil.ttoc( A897TBM42_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A898TBM42_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm42_study_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      A898TBM42_UPD_USER_ID = GXt_char1 ;
      n898TBM42_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A898TBM42_UPD_USER_ID", A898TBM42_UPD_USER_ID);
      A900TBM42_UPD_CNT = (long)(O900TBM42_UPD_CNT+1) ;
      n900TBM42_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A900TBM42_UPD_CNT", GXutil.ltrim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate1I53( )
   {
      /* Before Update Rules */
      A897TBM42_UPD_DATETIME = GXutil.now( ) ;
      n897TBM42_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A897TBM42_UPD_DATETIME", localUtil.ttoc( A897TBM42_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A898TBM42_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm42_study_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      A898TBM42_UPD_USER_ID = GXt_char1 ;
      n898TBM42_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A898TBM42_UPD_USER_ID", A898TBM42_UPD_USER_ID);
      A900TBM42_UPD_CNT = (long)(O900TBM42_UPD_CNT+1) ;
      n900TBM42_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A900TBM42_UPD_CNT", GXutil.ltrim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)));
   }

   public void beforeDelete1I53( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1I53( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1I53( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1I53( )
   {
      edtTBM42_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_STUDY_ID_Enabled, 5, 0)));
      edtTBM42_DOM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_DOM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_DOM_CD_Enabled, 5, 0)));
      edtTBM42_DOM_ENM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_DOM_ENM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_DOM_ENM_Enabled, 5, 0)));
      edtTBM42_DOM_JNM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_DOM_JNM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_DOM_JNM_Enabled, 5, 0)));
      edtTBM42_DOM_GRP_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_DOM_GRP_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_DOM_GRP_NM_Enabled, 5, 0)));
      edtTBM42_NOTE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_NOTE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_NOTE_Enabled, 5, 0)));
      edtTBM42_ORDER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_ORDER_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_ORDER_Enabled, 5, 0)));
      edtTBM42_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_DEL_FLG_Enabled, 5, 0)));
      edtTBM42_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM42_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM42_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM42_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM42_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM42_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM42_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM42_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM42_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1I0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "試験別CDISCドメインマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317163618");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm42_study_cdisc_domain") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1I53( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z203TBM42_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z203TBM42_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z204TBM42_DOM_CD", GXutil.rtrim( Z204TBM42_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z894TBM42_CRT_DATETIME", localUtil.ttoc( Z894TBM42_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z895TBM42_CRT_USER_ID", GXutil.rtrim( Z895TBM42_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z897TBM42_UPD_DATETIME", localUtil.ttoc( Z897TBM42_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z898TBM42_UPD_USER_ID", GXutil.rtrim( Z898TBM42_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z900TBM42_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z900TBM42_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z905TBM42_DOM_ENM", GXutil.rtrim( Z905TBM42_DOM_ENM));
      GxWebStd.gx_hidden_field( httpContext, "Z906TBM42_DOM_JNM", GXutil.rtrim( Z906TBM42_DOM_JNM));
      GxWebStd.gx_hidden_field( httpContext, "Z907TBM42_DOM_GRP_NM", GXutil.rtrim( Z907TBM42_DOM_GRP_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z908TBM42_NOTE", GXutil.rtrim( Z908TBM42_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z909TBM42_ORDER", GXutil.ltrim( localUtil.ntoc( Z909TBM42_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z893TBM42_DEL_FLG", GXutil.rtrim( Z893TBM42_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z896TBM42_CRT_PROG_NM", GXutil.rtrim( Z896TBM42_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z899TBM42_UPD_PROG_NM", GXutil.rtrim( Z899TBM42_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O900TBM42_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O900TBM42_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM42_STUDY_CDISC_DOMAIN" ;
   }

   public String getPgmdesc( )
   {
      return "試験別CDISCドメインマスタ" ;
   }

   public void initializeNonKey1I53( )
   {
      A894TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n894TBM42_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A894TBM42_CRT_DATETIME", localUtil.ttoc( A894TBM42_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n894TBM42_CRT_DATETIME = (GXutil.nullDate().equals(A894TBM42_CRT_DATETIME) ? true : false) ;
      A895TBM42_CRT_USER_ID = "" ;
      n895TBM42_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A895TBM42_CRT_USER_ID", A895TBM42_CRT_USER_ID);
      n895TBM42_CRT_USER_ID = ((GXutil.strcmp("", A895TBM42_CRT_USER_ID)==0) ? true : false) ;
      A897TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n897TBM42_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A897TBM42_UPD_DATETIME", localUtil.ttoc( A897TBM42_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n897TBM42_UPD_DATETIME = (GXutil.nullDate().equals(A897TBM42_UPD_DATETIME) ? true : false) ;
      A898TBM42_UPD_USER_ID = "" ;
      n898TBM42_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A898TBM42_UPD_USER_ID", A898TBM42_UPD_USER_ID);
      n898TBM42_UPD_USER_ID = ((GXutil.strcmp("", A898TBM42_UPD_USER_ID)==0) ? true : false) ;
      A900TBM42_UPD_CNT = 0 ;
      n900TBM42_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A900TBM42_UPD_CNT", GXutil.ltrim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)));
      n900TBM42_UPD_CNT = ((0==A900TBM42_UPD_CNT) ? true : false) ;
      A905TBM42_DOM_ENM = "" ;
      n905TBM42_DOM_ENM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A905TBM42_DOM_ENM", A905TBM42_DOM_ENM);
      n905TBM42_DOM_ENM = ((GXutil.strcmp("", A905TBM42_DOM_ENM)==0) ? true : false) ;
      A906TBM42_DOM_JNM = "" ;
      n906TBM42_DOM_JNM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A906TBM42_DOM_JNM", A906TBM42_DOM_JNM);
      n906TBM42_DOM_JNM = ((GXutil.strcmp("", A906TBM42_DOM_JNM)==0) ? true : false) ;
      A907TBM42_DOM_GRP_NM = "" ;
      n907TBM42_DOM_GRP_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A907TBM42_DOM_GRP_NM", A907TBM42_DOM_GRP_NM);
      n907TBM42_DOM_GRP_NM = ((GXutil.strcmp("", A907TBM42_DOM_GRP_NM)==0) ? true : false) ;
      A908TBM42_NOTE = "" ;
      n908TBM42_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A908TBM42_NOTE", A908TBM42_NOTE);
      n908TBM42_NOTE = ((GXutil.strcmp("", A908TBM42_NOTE)==0) ? true : false) ;
      A909TBM42_ORDER = 0 ;
      n909TBM42_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A909TBM42_ORDER", GXutil.ltrim( GXutil.str( A909TBM42_ORDER, 5, 0)));
      n909TBM42_ORDER = ((0==A909TBM42_ORDER) ? true : false) ;
      A893TBM42_DEL_FLG = "" ;
      n893TBM42_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A893TBM42_DEL_FLG", A893TBM42_DEL_FLG);
      n893TBM42_DEL_FLG = ((GXutil.strcmp("", A893TBM42_DEL_FLG)==0) ? true : false) ;
      A896TBM42_CRT_PROG_NM = "" ;
      n896TBM42_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A896TBM42_CRT_PROG_NM", A896TBM42_CRT_PROG_NM);
      n896TBM42_CRT_PROG_NM = ((GXutil.strcmp("", A896TBM42_CRT_PROG_NM)==0) ? true : false) ;
      A899TBM42_UPD_PROG_NM = "" ;
      n899TBM42_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A899TBM42_UPD_PROG_NM", A899TBM42_UPD_PROG_NM);
      n899TBM42_UPD_PROG_NM = ((GXutil.strcmp("", A899TBM42_UPD_PROG_NM)==0) ? true : false) ;
      O900TBM42_UPD_CNT = A900TBM42_UPD_CNT ;
      n900TBM42_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A900TBM42_UPD_CNT", GXutil.ltrim( GXutil.str( A900TBM42_UPD_CNT, 10, 0)));
   }

   public void initAll1I53( )
   {
      A203TBM42_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A203TBM42_STUDY_ID", GXutil.ltrim( GXutil.str( A203TBM42_STUDY_ID, 10, 0)));
      A204TBM42_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A204TBM42_DOM_CD", A204TBM42_DOM_CD);
      initializeNonKey1I53( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317163625");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm42_study_cdisc_domain.js", "?20177317163625");
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
      lblTextblocktbm42_study_id_Internalname = "TEXTBLOCKTBM42_STUDY_ID" ;
      edtTBM42_STUDY_ID_Internalname = "TBM42_STUDY_ID" ;
      lblTextblocktbm42_dom_cd_Internalname = "TEXTBLOCKTBM42_DOM_CD" ;
      edtTBM42_DOM_CD_Internalname = "TBM42_DOM_CD" ;
      lblTextblocktbm42_dom_enm_Internalname = "TEXTBLOCKTBM42_DOM_ENM" ;
      edtTBM42_DOM_ENM_Internalname = "TBM42_DOM_ENM" ;
      lblTextblocktbm42_dom_jnm_Internalname = "TEXTBLOCKTBM42_DOM_JNM" ;
      edtTBM42_DOM_JNM_Internalname = "TBM42_DOM_JNM" ;
      lblTextblocktbm42_dom_grp_nm_Internalname = "TEXTBLOCKTBM42_DOM_GRP_NM" ;
      edtTBM42_DOM_GRP_NM_Internalname = "TBM42_DOM_GRP_NM" ;
      lblTextblocktbm42_note_Internalname = "TEXTBLOCKTBM42_NOTE" ;
      edtTBM42_NOTE_Internalname = "TBM42_NOTE" ;
      lblTextblocktbm42_order_Internalname = "TEXTBLOCKTBM42_ORDER" ;
      edtTBM42_ORDER_Internalname = "TBM42_ORDER" ;
      lblTextblocktbm42_del_flg_Internalname = "TEXTBLOCKTBM42_DEL_FLG" ;
      edtTBM42_DEL_FLG_Internalname = "TBM42_DEL_FLG" ;
      lblTextblocktbm42_crt_datetime_Internalname = "TEXTBLOCKTBM42_CRT_DATETIME" ;
      edtTBM42_CRT_DATETIME_Internalname = "TBM42_CRT_DATETIME" ;
      lblTextblocktbm42_crt_user_id_Internalname = "TEXTBLOCKTBM42_CRT_USER_ID" ;
      edtTBM42_CRT_USER_ID_Internalname = "TBM42_CRT_USER_ID" ;
      lblTextblocktbm42_crt_prog_nm_Internalname = "TEXTBLOCKTBM42_CRT_PROG_NM" ;
      edtTBM42_CRT_PROG_NM_Internalname = "TBM42_CRT_PROG_NM" ;
      lblTextblocktbm42_upd_datetime_Internalname = "TEXTBLOCKTBM42_UPD_DATETIME" ;
      edtTBM42_UPD_DATETIME_Internalname = "TBM42_UPD_DATETIME" ;
      lblTextblocktbm42_upd_user_id_Internalname = "TEXTBLOCKTBM42_UPD_USER_ID" ;
      edtTBM42_UPD_USER_ID_Internalname = "TBM42_UPD_USER_ID" ;
      lblTextblocktbm42_upd_prog_nm_Internalname = "TEXTBLOCKTBM42_UPD_PROG_NM" ;
      edtTBM42_UPD_PROG_NM_Internalname = "TBM42_UPD_PROG_NM" ;
      lblTextblocktbm42_upd_cnt_Internalname = "TEXTBLOCKTBM42_UPD_CNT" ;
      edtTBM42_UPD_CNT_Internalname = "TBM42_UPD_CNT" ;
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
      edtTBM42_UPD_CNT_Jsonclick = "" ;
      edtTBM42_UPD_CNT_Enabled = 1 ;
      edtTBM42_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM42_UPD_PROG_NM_Enabled = 1 ;
      edtTBM42_UPD_USER_ID_Jsonclick = "" ;
      edtTBM42_UPD_USER_ID_Enabled = 1 ;
      edtTBM42_UPD_DATETIME_Jsonclick = "" ;
      edtTBM42_UPD_DATETIME_Enabled = 1 ;
      edtTBM42_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM42_CRT_PROG_NM_Enabled = 1 ;
      edtTBM42_CRT_USER_ID_Jsonclick = "" ;
      edtTBM42_CRT_USER_ID_Enabled = 1 ;
      edtTBM42_CRT_DATETIME_Jsonclick = "" ;
      edtTBM42_CRT_DATETIME_Enabled = 1 ;
      edtTBM42_DEL_FLG_Jsonclick = "" ;
      edtTBM42_DEL_FLG_Enabled = 1 ;
      edtTBM42_ORDER_Jsonclick = "" ;
      edtTBM42_ORDER_Enabled = 1 ;
      edtTBM42_NOTE_Enabled = 1 ;
      edtTBM42_DOM_GRP_NM_Jsonclick = "" ;
      edtTBM42_DOM_GRP_NM_Enabled = 1 ;
      edtTBM42_DOM_JNM_Jsonclick = "" ;
      edtTBM42_DOM_JNM_Enabled = 1 ;
      edtTBM42_DOM_ENM_Jsonclick = "" ;
      edtTBM42_DOM_ENM_Enabled = 1 ;
      edtTBM42_DOM_CD_Jsonclick = "" ;
      edtTBM42_DOM_CD_Enabled = 1 ;
      edtTBM42_STUDY_ID_Jsonclick = "" ;
      edtTBM42_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm42_crt_user_id1I53( String Gx_mode )
   {
      GXt_char1 = A895TBM42_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm42_study_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      A895TBM42_CRT_USER_ID = GXt_char1 ;
      n895TBM42_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A895TBM42_CRT_USER_ID", A895TBM42_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A895TBM42_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm42_upd_user_id1I53( String Gx_mode )
   {
      GXt_char1 = A898TBM42_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm42_study_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      A898TBM42_UPD_USER_ID = GXt_char1 ;
      n898TBM42_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A898TBM42_UPD_USER_ID", A898TBM42_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A898TBM42_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM42_DOM_ENM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm42_dom_cd( long GX_Parm1 ,
                                   String GX_Parm2 ,
                                   java.util.Date GX_Parm3 ,
                                   String GX_Parm4 ,
                                   java.util.Date GX_Parm5 ,
                                   String GX_Parm6 ,
                                   long GX_Parm7 ,
                                   String GX_Parm8 ,
                                   String GX_Parm9 ,
                                   String GX_Parm10 ,
                                   String GX_Parm11 ,
                                   int GX_Parm12 ,
                                   String GX_Parm13 ,
                                   String GX_Parm14 ,
                                   String GX_Parm15 )
   {
      A203TBM42_STUDY_ID = GX_Parm1 ;
      A204TBM42_DOM_CD = GX_Parm2 ;
      A894TBM42_CRT_DATETIME = GX_Parm3 ;
      n894TBM42_CRT_DATETIME = false ;
      A895TBM42_CRT_USER_ID = GX_Parm4 ;
      n895TBM42_CRT_USER_ID = false ;
      A897TBM42_UPD_DATETIME = GX_Parm5 ;
      n897TBM42_UPD_DATETIME = false ;
      A898TBM42_UPD_USER_ID = GX_Parm6 ;
      n898TBM42_UPD_USER_ID = false ;
      A900TBM42_UPD_CNT = GX_Parm7 ;
      n900TBM42_UPD_CNT = false ;
      A905TBM42_DOM_ENM = GX_Parm8 ;
      n905TBM42_DOM_ENM = false ;
      A906TBM42_DOM_JNM = GX_Parm9 ;
      n906TBM42_DOM_JNM = false ;
      A907TBM42_DOM_GRP_NM = GX_Parm10 ;
      n907TBM42_DOM_GRP_NM = false ;
      A908TBM42_NOTE = GX_Parm11 ;
      n908TBM42_NOTE = false ;
      A909TBM42_ORDER = GX_Parm12 ;
      n909TBM42_ORDER = false ;
      A893TBM42_DEL_FLG = GX_Parm13 ;
      n893TBM42_DEL_FLG = false ;
      A896TBM42_CRT_PROG_NM = GX_Parm14 ;
      n896TBM42_CRT_PROG_NM = false ;
      A899TBM42_UPD_PROG_NM = GX_Parm15 ;
      n899TBM42_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A894TBM42_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A895TBM42_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A897TBM42_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A898TBM42_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A900TBM42_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A905TBM42_DOM_ENM));
      isValidOutput.add(GXutil.rtrim( A906TBM42_DOM_JNM));
      isValidOutput.add(GXutil.rtrim( A907TBM42_DOM_GRP_NM));
      isValidOutput.add(GXutil.rtrim( A908TBM42_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A909TBM42_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A893TBM42_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A896TBM42_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A899TBM42_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z203TBM42_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z204TBM42_DOM_CD));
      isValidOutput.add(localUtil.ttoc( Z894TBM42_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z895TBM42_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z897TBM42_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z898TBM42_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z900TBM42_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z905TBM42_DOM_ENM));
      isValidOutput.add(GXutil.rtrim( Z906TBM42_DOM_JNM));
      isValidOutput.add(GXutil.rtrim( Z907TBM42_DOM_GRP_NM));
      isValidOutput.add(GXutil.rtrim( Z908TBM42_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z909TBM42_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z893TBM42_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z896TBM42_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z899TBM42_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O900TBM42_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z204TBM42_DOM_CD = "" ;
      Z894TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z895TBM42_CRT_USER_ID = "" ;
      Z897TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z898TBM42_UPD_USER_ID = "" ;
      Z905TBM42_DOM_ENM = "" ;
      Z906TBM42_DOM_JNM = "" ;
      Z907TBM42_DOM_GRP_NM = "" ;
      Z908TBM42_NOTE = "" ;
      Z893TBM42_DEL_FLG = "" ;
      Z896TBM42_CRT_PROG_NM = "" ;
      Z899TBM42_UPD_PROG_NM = "" ;
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
      lblTextblocktbm42_study_id_Jsonclick = "" ;
      lblTextblocktbm42_dom_cd_Jsonclick = "" ;
      A204TBM42_DOM_CD = "" ;
      lblTextblocktbm42_dom_enm_Jsonclick = "" ;
      A905TBM42_DOM_ENM = "" ;
      lblTextblocktbm42_dom_jnm_Jsonclick = "" ;
      A906TBM42_DOM_JNM = "" ;
      lblTextblocktbm42_dom_grp_nm_Jsonclick = "" ;
      A907TBM42_DOM_GRP_NM = "" ;
      lblTextblocktbm42_note_Jsonclick = "" ;
      A908TBM42_NOTE = "" ;
      lblTextblocktbm42_order_Jsonclick = "" ;
      lblTextblocktbm42_del_flg_Jsonclick = "" ;
      A893TBM42_DEL_FLG = "" ;
      lblTextblocktbm42_crt_datetime_Jsonclick = "" ;
      A894TBM42_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm42_crt_user_id_Jsonclick = "" ;
      A895TBM42_CRT_USER_ID = "" ;
      lblTextblocktbm42_crt_prog_nm_Jsonclick = "" ;
      A896TBM42_CRT_PROG_NM = "" ;
      lblTextblocktbm42_upd_datetime_Jsonclick = "" ;
      A897TBM42_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm42_upd_user_id_Jsonclick = "" ;
      A898TBM42_UPD_USER_ID = "" ;
      lblTextblocktbm42_upd_prog_nm_Jsonclick = "" ;
      A899TBM42_UPD_PROG_NM = "" ;
      lblTextblocktbm42_upd_cnt_Jsonclick = "" ;
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
      AV7W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV8W_TXT = "" ;
      T001I4_A203TBM42_STUDY_ID = new long[1] ;
      T001I4_A204TBM42_DOM_CD = new String[] {""} ;
      T001I4_A894TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001I4_n894TBM42_CRT_DATETIME = new boolean[] {false} ;
      T001I4_A895TBM42_CRT_USER_ID = new String[] {""} ;
      T001I4_n895TBM42_CRT_USER_ID = new boolean[] {false} ;
      T001I4_A897TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001I4_n897TBM42_UPD_DATETIME = new boolean[] {false} ;
      T001I4_A898TBM42_UPD_USER_ID = new String[] {""} ;
      T001I4_n898TBM42_UPD_USER_ID = new boolean[] {false} ;
      T001I4_A900TBM42_UPD_CNT = new long[1] ;
      T001I4_n900TBM42_UPD_CNT = new boolean[] {false} ;
      T001I4_A905TBM42_DOM_ENM = new String[] {""} ;
      T001I4_n905TBM42_DOM_ENM = new boolean[] {false} ;
      T001I4_A906TBM42_DOM_JNM = new String[] {""} ;
      T001I4_n906TBM42_DOM_JNM = new boolean[] {false} ;
      T001I4_A907TBM42_DOM_GRP_NM = new String[] {""} ;
      T001I4_n907TBM42_DOM_GRP_NM = new boolean[] {false} ;
      T001I4_A908TBM42_NOTE = new String[] {""} ;
      T001I4_n908TBM42_NOTE = new boolean[] {false} ;
      T001I4_A909TBM42_ORDER = new int[1] ;
      T001I4_n909TBM42_ORDER = new boolean[] {false} ;
      T001I4_A893TBM42_DEL_FLG = new String[] {""} ;
      T001I4_n893TBM42_DEL_FLG = new boolean[] {false} ;
      T001I4_A896TBM42_CRT_PROG_NM = new String[] {""} ;
      T001I4_n896TBM42_CRT_PROG_NM = new boolean[] {false} ;
      T001I4_A899TBM42_UPD_PROG_NM = new String[] {""} ;
      T001I4_n899TBM42_UPD_PROG_NM = new boolean[] {false} ;
      T001I5_A203TBM42_STUDY_ID = new long[1] ;
      T001I5_A204TBM42_DOM_CD = new String[] {""} ;
      T001I3_A203TBM42_STUDY_ID = new long[1] ;
      T001I3_A204TBM42_DOM_CD = new String[] {""} ;
      T001I3_A894TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001I3_n894TBM42_CRT_DATETIME = new boolean[] {false} ;
      T001I3_A895TBM42_CRT_USER_ID = new String[] {""} ;
      T001I3_n895TBM42_CRT_USER_ID = new boolean[] {false} ;
      T001I3_A897TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001I3_n897TBM42_UPD_DATETIME = new boolean[] {false} ;
      T001I3_A898TBM42_UPD_USER_ID = new String[] {""} ;
      T001I3_n898TBM42_UPD_USER_ID = new boolean[] {false} ;
      T001I3_A900TBM42_UPD_CNT = new long[1] ;
      T001I3_n900TBM42_UPD_CNT = new boolean[] {false} ;
      T001I3_A905TBM42_DOM_ENM = new String[] {""} ;
      T001I3_n905TBM42_DOM_ENM = new boolean[] {false} ;
      T001I3_A906TBM42_DOM_JNM = new String[] {""} ;
      T001I3_n906TBM42_DOM_JNM = new boolean[] {false} ;
      T001I3_A907TBM42_DOM_GRP_NM = new String[] {""} ;
      T001I3_n907TBM42_DOM_GRP_NM = new boolean[] {false} ;
      T001I3_A908TBM42_NOTE = new String[] {""} ;
      T001I3_n908TBM42_NOTE = new boolean[] {false} ;
      T001I3_A909TBM42_ORDER = new int[1] ;
      T001I3_n909TBM42_ORDER = new boolean[] {false} ;
      T001I3_A893TBM42_DEL_FLG = new String[] {""} ;
      T001I3_n893TBM42_DEL_FLG = new boolean[] {false} ;
      T001I3_A896TBM42_CRT_PROG_NM = new String[] {""} ;
      T001I3_n896TBM42_CRT_PROG_NM = new boolean[] {false} ;
      T001I3_A899TBM42_UPD_PROG_NM = new String[] {""} ;
      T001I3_n899TBM42_UPD_PROG_NM = new boolean[] {false} ;
      sMode53 = "" ;
      T001I6_A203TBM42_STUDY_ID = new long[1] ;
      T001I6_A204TBM42_DOM_CD = new String[] {""} ;
      T001I7_A203TBM42_STUDY_ID = new long[1] ;
      T001I7_A204TBM42_DOM_CD = new String[] {""} ;
      T001I2_A203TBM42_STUDY_ID = new long[1] ;
      T001I2_A204TBM42_DOM_CD = new String[] {""} ;
      T001I2_A894TBM42_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001I2_n894TBM42_CRT_DATETIME = new boolean[] {false} ;
      T001I2_A895TBM42_CRT_USER_ID = new String[] {""} ;
      T001I2_n895TBM42_CRT_USER_ID = new boolean[] {false} ;
      T001I2_A897TBM42_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001I2_n897TBM42_UPD_DATETIME = new boolean[] {false} ;
      T001I2_A898TBM42_UPD_USER_ID = new String[] {""} ;
      T001I2_n898TBM42_UPD_USER_ID = new boolean[] {false} ;
      T001I2_A900TBM42_UPD_CNT = new long[1] ;
      T001I2_n900TBM42_UPD_CNT = new boolean[] {false} ;
      T001I2_A905TBM42_DOM_ENM = new String[] {""} ;
      T001I2_n905TBM42_DOM_ENM = new boolean[] {false} ;
      T001I2_A906TBM42_DOM_JNM = new String[] {""} ;
      T001I2_n906TBM42_DOM_JNM = new boolean[] {false} ;
      T001I2_A907TBM42_DOM_GRP_NM = new String[] {""} ;
      T001I2_n907TBM42_DOM_GRP_NM = new boolean[] {false} ;
      T001I2_A908TBM42_NOTE = new String[] {""} ;
      T001I2_n908TBM42_NOTE = new boolean[] {false} ;
      T001I2_A909TBM42_ORDER = new int[1] ;
      T001I2_n909TBM42_ORDER = new boolean[] {false} ;
      T001I2_A893TBM42_DEL_FLG = new String[] {""} ;
      T001I2_n893TBM42_DEL_FLG = new boolean[] {false} ;
      T001I2_A896TBM42_CRT_PROG_NM = new String[] {""} ;
      T001I2_n896TBM42_CRT_PROG_NM = new boolean[] {false} ;
      T001I2_A899TBM42_UPD_PROG_NM = new String[] {""} ;
      T001I2_n899TBM42_UPD_PROG_NM = new boolean[] {false} ;
      T001I11_A203TBM42_STUDY_ID = new long[1] ;
      T001I11_A204TBM42_DOM_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm42_study_cdisc_domain__default(),
         new Object[] {
             new Object[] {
            T001I2_A203TBM42_STUDY_ID, T001I2_A204TBM42_DOM_CD, T001I2_A894TBM42_CRT_DATETIME, T001I2_n894TBM42_CRT_DATETIME, T001I2_A895TBM42_CRT_USER_ID, T001I2_n895TBM42_CRT_USER_ID, T001I2_A897TBM42_UPD_DATETIME, T001I2_n897TBM42_UPD_DATETIME, T001I2_A898TBM42_UPD_USER_ID, T001I2_n898TBM42_UPD_USER_ID,
            T001I2_A900TBM42_UPD_CNT, T001I2_n900TBM42_UPD_CNT, T001I2_A905TBM42_DOM_ENM, T001I2_n905TBM42_DOM_ENM, T001I2_A906TBM42_DOM_JNM, T001I2_n906TBM42_DOM_JNM, T001I2_A907TBM42_DOM_GRP_NM, T001I2_n907TBM42_DOM_GRP_NM, T001I2_A908TBM42_NOTE, T001I2_n908TBM42_NOTE,
            T001I2_A909TBM42_ORDER, T001I2_n909TBM42_ORDER, T001I2_A893TBM42_DEL_FLG, T001I2_n893TBM42_DEL_FLG, T001I2_A896TBM42_CRT_PROG_NM, T001I2_n896TBM42_CRT_PROG_NM, T001I2_A899TBM42_UPD_PROG_NM, T001I2_n899TBM42_UPD_PROG_NM
            }
            , new Object[] {
            T001I3_A203TBM42_STUDY_ID, T001I3_A204TBM42_DOM_CD, T001I3_A894TBM42_CRT_DATETIME, T001I3_n894TBM42_CRT_DATETIME, T001I3_A895TBM42_CRT_USER_ID, T001I3_n895TBM42_CRT_USER_ID, T001I3_A897TBM42_UPD_DATETIME, T001I3_n897TBM42_UPD_DATETIME, T001I3_A898TBM42_UPD_USER_ID, T001I3_n898TBM42_UPD_USER_ID,
            T001I3_A900TBM42_UPD_CNT, T001I3_n900TBM42_UPD_CNT, T001I3_A905TBM42_DOM_ENM, T001I3_n905TBM42_DOM_ENM, T001I3_A906TBM42_DOM_JNM, T001I3_n906TBM42_DOM_JNM, T001I3_A907TBM42_DOM_GRP_NM, T001I3_n907TBM42_DOM_GRP_NM, T001I3_A908TBM42_NOTE, T001I3_n908TBM42_NOTE,
            T001I3_A909TBM42_ORDER, T001I3_n909TBM42_ORDER, T001I3_A893TBM42_DEL_FLG, T001I3_n893TBM42_DEL_FLG, T001I3_A896TBM42_CRT_PROG_NM, T001I3_n896TBM42_CRT_PROG_NM, T001I3_A899TBM42_UPD_PROG_NM, T001I3_n899TBM42_UPD_PROG_NM
            }
            , new Object[] {
            T001I4_A203TBM42_STUDY_ID, T001I4_A204TBM42_DOM_CD, T001I4_A894TBM42_CRT_DATETIME, T001I4_n894TBM42_CRT_DATETIME, T001I4_A895TBM42_CRT_USER_ID, T001I4_n895TBM42_CRT_USER_ID, T001I4_A897TBM42_UPD_DATETIME, T001I4_n897TBM42_UPD_DATETIME, T001I4_A898TBM42_UPD_USER_ID, T001I4_n898TBM42_UPD_USER_ID,
            T001I4_A900TBM42_UPD_CNT, T001I4_n900TBM42_UPD_CNT, T001I4_A905TBM42_DOM_ENM, T001I4_n905TBM42_DOM_ENM, T001I4_A906TBM42_DOM_JNM, T001I4_n906TBM42_DOM_JNM, T001I4_A907TBM42_DOM_GRP_NM, T001I4_n907TBM42_DOM_GRP_NM, T001I4_A908TBM42_NOTE, T001I4_n908TBM42_NOTE,
            T001I4_A909TBM42_ORDER, T001I4_n909TBM42_ORDER, T001I4_A893TBM42_DEL_FLG, T001I4_n893TBM42_DEL_FLG, T001I4_A896TBM42_CRT_PROG_NM, T001I4_n896TBM42_CRT_PROG_NM, T001I4_A899TBM42_UPD_PROG_NM, T001I4_n899TBM42_UPD_PROG_NM
            }
            , new Object[] {
            T001I5_A203TBM42_STUDY_ID, T001I5_A204TBM42_DOM_CD
            }
            , new Object[] {
            T001I6_A203TBM42_STUDY_ID, T001I6_A204TBM42_DOM_CD
            }
            , new Object[] {
            T001I7_A203TBM42_STUDY_ID, T001I7_A204TBM42_DOM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001I11_A203TBM42_STUDY_ID, T001I11_A204TBM42_DOM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM42_STUDY_CDISC_DOMAIN" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound53 ;
   private short Gx_err ;
   private int Z909TBM42_ORDER ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM42_STUDY_ID_Enabled ;
   private int edtTBM42_DOM_CD_Enabled ;
   private int edtTBM42_DOM_ENM_Enabled ;
   private int edtTBM42_DOM_JNM_Enabled ;
   private int edtTBM42_DOM_GRP_NM_Enabled ;
   private int edtTBM42_NOTE_Enabled ;
   private int A909TBM42_ORDER ;
   private int edtTBM42_ORDER_Enabled ;
   private int edtTBM42_DEL_FLG_Enabled ;
   private int edtTBM42_CRT_DATETIME_Enabled ;
   private int edtTBM42_CRT_USER_ID_Enabled ;
   private int edtTBM42_CRT_PROG_NM_Enabled ;
   private int edtTBM42_UPD_DATETIME_Enabled ;
   private int edtTBM42_UPD_USER_ID_Enabled ;
   private int edtTBM42_UPD_PROG_NM_Enabled ;
   private int edtTBM42_UPD_CNT_Enabled ;
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
   private long Z203TBM42_STUDY_ID ;
   private long Z900TBM42_UPD_CNT ;
   private long O900TBM42_UPD_CNT ;
   private long A203TBM42_STUDY_ID ;
   private long A900TBM42_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM42_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm42_study_id_Internalname ;
   private String lblTextblocktbm42_study_id_Jsonclick ;
   private String edtTBM42_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm42_dom_cd_Internalname ;
   private String lblTextblocktbm42_dom_cd_Jsonclick ;
   private String edtTBM42_DOM_CD_Internalname ;
   private String edtTBM42_DOM_CD_Jsonclick ;
   private String lblTextblocktbm42_dom_enm_Internalname ;
   private String lblTextblocktbm42_dom_enm_Jsonclick ;
   private String edtTBM42_DOM_ENM_Internalname ;
   private String edtTBM42_DOM_ENM_Jsonclick ;
   private String lblTextblocktbm42_dom_jnm_Internalname ;
   private String lblTextblocktbm42_dom_jnm_Jsonclick ;
   private String edtTBM42_DOM_JNM_Internalname ;
   private String edtTBM42_DOM_JNM_Jsonclick ;
   private String lblTextblocktbm42_dom_grp_nm_Internalname ;
   private String lblTextblocktbm42_dom_grp_nm_Jsonclick ;
   private String edtTBM42_DOM_GRP_NM_Internalname ;
   private String edtTBM42_DOM_GRP_NM_Jsonclick ;
   private String lblTextblocktbm42_note_Internalname ;
   private String lblTextblocktbm42_note_Jsonclick ;
   private String edtTBM42_NOTE_Internalname ;
   private String lblTextblocktbm42_order_Internalname ;
   private String lblTextblocktbm42_order_Jsonclick ;
   private String edtTBM42_ORDER_Internalname ;
   private String edtTBM42_ORDER_Jsonclick ;
   private String lblTextblocktbm42_del_flg_Internalname ;
   private String lblTextblocktbm42_del_flg_Jsonclick ;
   private String edtTBM42_DEL_FLG_Internalname ;
   private String edtTBM42_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm42_crt_datetime_Internalname ;
   private String lblTextblocktbm42_crt_datetime_Jsonclick ;
   private String edtTBM42_CRT_DATETIME_Internalname ;
   private String edtTBM42_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm42_crt_user_id_Internalname ;
   private String lblTextblocktbm42_crt_user_id_Jsonclick ;
   private String edtTBM42_CRT_USER_ID_Internalname ;
   private String edtTBM42_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm42_crt_prog_nm_Internalname ;
   private String lblTextblocktbm42_crt_prog_nm_Jsonclick ;
   private String edtTBM42_CRT_PROG_NM_Internalname ;
   private String edtTBM42_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm42_upd_datetime_Internalname ;
   private String lblTextblocktbm42_upd_datetime_Jsonclick ;
   private String edtTBM42_UPD_DATETIME_Internalname ;
   private String edtTBM42_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm42_upd_user_id_Internalname ;
   private String lblTextblocktbm42_upd_user_id_Jsonclick ;
   private String edtTBM42_UPD_USER_ID_Internalname ;
   private String edtTBM42_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm42_upd_prog_nm_Internalname ;
   private String lblTextblocktbm42_upd_prog_nm_Jsonclick ;
   private String edtTBM42_UPD_PROG_NM_Internalname ;
   private String edtTBM42_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm42_upd_cnt_Internalname ;
   private String lblTextblocktbm42_upd_cnt_Jsonclick ;
   private String edtTBM42_UPD_CNT_Internalname ;
   private String edtTBM42_UPD_CNT_Jsonclick ;
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
   private String sMode53 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z894TBM42_CRT_DATETIME ;
   private java.util.Date Z897TBM42_UPD_DATETIME ;
   private java.util.Date A894TBM42_CRT_DATETIME ;
   private java.util.Date A897TBM42_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n905TBM42_DOM_ENM ;
   private boolean n906TBM42_DOM_JNM ;
   private boolean n907TBM42_DOM_GRP_NM ;
   private boolean n908TBM42_NOTE ;
   private boolean n909TBM42_ORDER ;
   private boolean n893TBM42_DEL_FLG ;
   private boolean n894TBM42_CRT_DATETIME ;
   private boolean n895TBM42_CRT_USER_ID ;
   private boolean n896TBM42_CRT_PROG_NM ;
   private boolean n897TBM42_UPD_DATETIME ;
   private boolean n898TBM42_UPD_USER_ID ;
   private boolean n899TBM42_UPD_PROG_NM ;
   private boolean n900TBM42_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z204TBM42_DOM_CD ;
   private String Z895TBM42_CRT_USER_ID ;
   private String Z898TBM42_UPD_USER_ID ;
   private String Z905TBM42_DOM_ENM ;
   private String Z906TBM42_DOM_JNM ;
   private String Z907TBM42_DOM_GRP_NM ;
   private String Z908TBM42_NOTE ;
   private String Z893TBM42_DEL_FLG ;
   private String Z896TBM42_CRT_PROG_NM ;
   private String Z899TBM42_UPD_PROG_NM ;
   private String A204TBM42_DOM_CD ;
   private String A905TBM42_DOM_ENM ;
   private String A906TBM42_DOM_JNM ;
   private String A907TBM42_DOM_GRP_NM ;
   private String A908TBM42_NOTE ;
   private String A893TBM42_DEL_FLG ;
   private String A895TBM42_CRT_USER_ID ;
   private String A896TBM42_CRT_PROG_NM ;
   private String A898TBM42_UPD_USER_ID ;
   private String A899TBM42_UPD_PROG_NM ;
   private String AV7W_BC_FLG ;
   private String AV8W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T001I4_A203TBM42_STUDY_ID ;
   private String[] T001I4_A204TBM42_DOM_CD ;
   private java.util.Date[] T001I4_A894TBM42_CRT_DATETIME ;
   private boolean[] T001I4_n894TBM42_CRT_DATETIME ;
   private String[] T001I4_A895TBM42_CRT_USER_ID ;
   private boolean[] T001I4_n895TBM42_CRT_USER_ID ;
   private java.util.Date[] T001I4_A897TBM42_UPD_DATETIME ;
   private boolean[] T001I4_n897TBM42_UPD_DATETIME ;
   private String[] T001I4_A898TBM42_UPD_USER_ID ;
   private boolean[] T001I4_n898TBM42_UPD_USER_ID ;
   private long[] T001I4_A900TBM42_UPD_CNT ;
   private boolean[] T001I4_n900TBM42_UPD_CNT ;
   private String[] T001I4_A905TBM42_DOM_ENM ;
   private boolean[] T001I4_n905TBM42_DOM_ENM ;
   private String[] T001I4_A906TBM42_DOM_JNM ;
   private boolean[] T001I4_n906TBM42_DOM_JNM ;
   private String[] T001I4_A907TBM42_DOM_GRP_NM ;
   private boolean[] T001I4_n907TBM42_DOM_GRP_NM ;
   private String[] T001I4_A908TBM42_NOTE ;
   private boolean[] T001I4_n908TBM42_NOTE ;
   private int[] T001I4_A909TBM42_ORDER ;
   private boolean[] T001I4_n909TBM42_ORDER ;
   private String[] T001I4_A893TBM42_DEL_FLG ;
   private boolean[] T001I4_n893TBM42_DEL_FLG ;
   private String[] T001I4_A896TBM42_CRT_PROG_NM ;
   private boolean[] T001I4_n896TBM42_CRT_PROG_NM ;
   private String[] T001I4_A899TBM42_UPD_PROG_NM ;
   private boolean[] T001I4_n899TBM42_UPD_PROG_NM ;
   private long[] T001I5_A203TBM42_STUDY_ID ;
   private String[] T001I5_A204TBM42_DOM_CD ;
   private long[] T001I3_A203TBM42_STUDY_ID ;
   private String[] T001I3_A204TBM42_DOM_CD ;
   private java.util.Date[] T001I3_A894TBM42_CRT_DATETIME ;
   private boolean[] T001I3_n894TBM42_CRT_DATETIME ;
   private String[] T001I3_A895TBM42_CRT_USER_ID ;
   private boolean[] T001I3_n895TBM42_CRT_USER_ID ;
   private java.util.Date[] T001I3_A897TBM42_UPD_DATETIME ;
   private boolean[] T001I3_n897TBM42_UPD_DATETIME ;
   private String[] T001I3_A898TBM42_UPD_USER_ID ;
   private boolean[] T001I3_n898TBM42_UPD_USER_ID ;
   private long[] T001I3_A900TBM42_UPD_CNT ;
   private boolean[] T001I3_n900TBM42_UPD_CNT ;
   private String[] T001I3_A905TBM42_DOM_ENM ;
   private boolean[] T001I3_n905TBM42_DOM_ENM ;
   private String[] T001I3_A906TBM42_DOM_JNM ;
   private boolean[] T001I3_n906TBM42_DOM_JNM ;
   private String[] T001I3_A907TBM42_DOM_GRP_NM ;
   private boolean[] T001I3_n907TBM42_DOM_GRP_NM ;
   private String[] T001I3_A908TBM42_NOTE ;
   private boolean[] T001I3_n908TBM42_NOTE ;
   private int[] T001I3_A909TBM42_ORDER ;
   private boolean[] T001I3_n909TBM42_ORDER ;
   private String[] T001I3_A893TBM42_DEL_FLG ;
   private boolean[] T001I3_n893TBM42_DEL_FLG ;
   private String[] T001I3_A896TBM42_CRT_PROG_NM ;
   private boolean[] T001I3_n896TBM42_CRT_PROG_NM ;
   private String[] T001I3_A899TBM42_UPD_PROG_NM ;
   private boolean[] T001I3_n899TBM42_UPD_PROG_NM ;
   private long[] T001I6_A203TBM42_STUDY_ID ;
   private String[] T001I6_A204TBM42_DOM_CD ;
   private long[] T001I7_A203TBM42_STUDY_ID ;
   private String[] T001I7_A204TBM42_DOM_CD ;
   private long[] T001I2_A203TBM42_STUDY_ID ;
   private String[] T001I2_A204TBM42_DOM_CD ;
   private java.util.Date[] T001I2_A894TBM42_CRT_DATETIME ;
   private boolean[] T001I2_n894TBM42_CRT_DATETIME ;
   private String[] T001I2_A895TBM42_CRT_USER_ID ;
   private boolean[] T001I2_n895TBM42_CRT_USER_ID ;
   private java.util.Date[] T001I2_A897TBM42_UPD_DATETIME ;
   private boolean[] T001I2_n897TBM42_UPD_DATETIME ;
   private String[] T001I2_A898TBM42_UPD_USER_ID ;
   private boolean[] T001I2_n898TBM42_UPD_USER_ID ;
   private long[] T001I2_A900TBM42_UPD_CNT ;
   private boolean[] T001I2_n900TBM42_UPD_CNT ;
   private String[] T001I2_A905TBM42_DOM_ENM ;
   private boolean[] T001I2_n905TBM42_DOM_ENM ;
   private String[] T001I2_A906TBM42_DOM_JNM ;
   private boolean[] T001I2_n906TBM42_DOM_JNM ;
   private String[] T001I2_A907TBM42_DOM_GRP_NM ;
   private boolean[] T001I2_n907TBM42_DOM_GRP_NM ;
   private String[] T001I2_A908TBM42_NOTE ;
   private boolean[] T001I2_n908TBM42_NOTE ;
   private int[] T001I2_A909TBM42_ORDER ;
   private boolean[] T001I2_n909TBM42_ORDER ;
   private String[] T001I2_A893TBM42_DEL_FLG ;
   private boolean[] T001I2_n893TBM42_DEL_FLG ;
   private String[] T001I2_A896TBM42_CRT_PROG_NM ;
   private boolean[] T001I2_n896TBM42_CRT_PROG_NM ;
   private String[] T001I2_A899TBM42_UPD_PROG_NM ;
   private boolean[] T001I2_n899TBM42_UPD_PROG_NM ;
   private long[] T001I11_A203TBM42_STUDY_ID ;
   private String[] T001I11_A204TBM42_DOM_CD ;
}

final  class tbm42_study_cdisc_domain__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001I2", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_CRT_DATETIME`, `TBM42_CRT_USER_ID`, `TBM42_UPD_DATETIME`, `TBM42_UPD_USER_ID`, `TBM42_UPD_CNT`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_ORDER`, `TBM42_DEL_FLG`, `TBM42_CRT_PROG_NM`, `TBM42_UPD_PROG_NM` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001I3", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_CRT_DATETIME`, `TBM42_CRT_USER_ID`, `TBM42_UPD_DATETIME`, `TBM42_UPD_USER_ID`, `TBM42_UPD_CNT`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_ORDER`, `TBM42_DEL_FLG`, `TBM42_CRT_PROG_NM`, `TBM42_UPD_PROG_NM` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001I4", "SELECT TM1.`TBM42_STUDY_ID`, TM1.`TBM42_DOM_CD`, TM1.`TBM42_CRT_DATETIME`, TM1.`TBM42_CRT_USER_ID`, TM1.`TBM42_UPD_DATETIME`, TM1.`TBM42_UPD_USER_ID`, TM1.`TBM42_UPD_CNT`, TM1.`TBM42_DOM_ENM`, TM1.`TBM42_DOM_JNM`, TM1.`TBM42_DOM_GRP_NM`, TM1.`TBM42_NOTE`, TM1.`TBM42_ORDER`, TM1.`TBM42_DEL_FLG`, TM1.`TBM42_CRT_PROG_NM`, TM1.`TBM42_UPD_PROG_NM` FROM `TBM42_STUDY_CDISC_DOMAIN` TM1 WHERE TM1.`TBM42_STUDY_ID` = ? and TM1.`TBM42_DOM_CD` = ? ORDER BY TM1.`TBM42_STUDY_ID`, TM1.`TBM42_DOM_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001I5", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001I6", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE ( `TBM42_STUDY_ID` > ? or `TBM42_STUDY_ID` = ? and `TBM42_DOM_CD` > ?) ORDER BY `TBM42_STUDY_ID`, `TBM42_DOM_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001I7", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD` FROM `TBM42_STUDY_CDISC_DOMAIN` WHERE ( `TBM42_STUDY_ID` < ? or `TBM42_STUDY_ID` = ? and `TBM42_DOM_CD` < ?) ORDER BY `TBM42_STUDY_ID` DESC, `TBM42_DOM_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001I8", "INSERT INTO `TBM42_STUDY_CDISC_DOMAIN`(`TBM42_STUDY_ID`, `TBM42_DOM_CD`, `TBM42_CRT_DATETIME`, `TBM42_CRT_USER_ID`, `TBM42_UPD_DATETIME`, `TBM42_UPD_USER_ID`, `TBM42_UPD_CNT`, `TBM42_DOM_ENM`, `TBM42_DOM_JNM`, `TBM42_DOM_GRP_NM`, `TBM42_NOTE`, `TBM42_ORDER`, `TBM42_DEL_FLG`, `TBM42_CRT_PROG_NM`, `TBM42_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001I9", "UPDATE `TBM42_STUDY_CDISC_DOMAIN` SET `TBM42_CRT_DATETIME`=?, `TBM42_CRT_USER_ID`=?, `TBM42_UPD_DATETIME`=?, `TBM42_UPD_USER_ID`=?, `TBM42_UPD_CNT`=?, `TBM42_DOM_ENM`=?, `TBM42_DOM_JNM`=?, `TBM42_DOM_GRP_NM`=?, `TBM42_NOTE`=?, `TBM42_ORDER`=?, `TBM42_DEL_FLG`=?, `TBM42_CRT_PROG_NM`=?, `TBM42_UPD_PROG_NM`=?  WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T001I10", "DELETE FROM `TBM42_STUDY_CDISC_DOMAIN`  WHERE `TBM42_STUDY_ID` = ? AND `TBM42_DOM_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T001I11", "SELECT `TBM42_STUDY_ID`, `TBM42_DOM_CD` FROM `TBM42_STUDY_CDISC_DOMAIN` ORDER BY `TBM42_STUDY_ID`, `TBM42_DOM_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               ((int[]) buf[20])[0] = rslt.getInt(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               ((int[]) buf[20])[0] = rslt.getInt(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               ((int[]) buf[20])[0] = rslt.getInt(12) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[23])[0] = rslt.wasNull();
               ((String[]) buf[24])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
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
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setVarchar(3, (String)parms[2], 2, false);
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
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
                  stmt.setVarchar(8, (String)parms[13], 50);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[15], 50);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[17], 50);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[19], 1000);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(12, ((Number) parms[21]).intValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[23], 1);
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(14, (String)parms[25], 40);
               }
               if ( ((Boolean) parms[26]).booleanValue() )
               {
                  stmt.setNull( 15 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(15, (String)parms[27], 40);
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
                  stmt.setVarchar(7, (String)parms[13], 50);
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[15], 50);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[17], 1000);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(10, ((Number) parms[19]).intValue());
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
               stmt.setLong(14, ((Number) parms[26]).longValue());
               stmt.setVarchar(15, (String)parms[27], 2, false);
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setVarchar(2, (String)parms[1], 2, false);
               return;
      }
   }

}

