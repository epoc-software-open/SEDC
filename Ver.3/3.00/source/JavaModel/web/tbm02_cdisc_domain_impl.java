/*
               File: tbm02_cdisc_domain_impl
        Description: CDISCドメインマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 15, 2020 13:21:12.82
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm02_cdisc_domain_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM02_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm02_crt_user_id1338( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM02_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm02_upd_user_id1338( Gx_mode) ;
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
         Form.getMeta().addItem("description", "CDISCドメインマスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM02_DOM_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm02_cdisc_domain_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm02_cdisc_domain_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm02_cdisc_domain_impl.class ));
   }

   public tbm02_cdisc_domain_impl( int remoteHandle ,
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
         wb_table1_2_1338( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1338e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1338( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1338( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1338( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1338e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "CDISCドメインマスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM02_CDISC_DOMAIN.htm");
         wb_table3_28_1338( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1338e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1338e( true) ;
      }
      else
      {
         wb_table1_2_1338e( false) ;
      }
   }

   public void wb_table3_28_1338( boolean wbgen )
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
         wb_table4_34_1338( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1338e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM02_CDISC_DOMAIN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM02_CDISC_DOMAIN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1338e( true) ;
      }
      else
      {
         wb_table3_28_1338e( false) ;
      }
   }

   public void wb_table4_34_1338( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_dom_cd_Internalname, "ドメインコード", "", "", lblTextblocktbm02_dom_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_DOM_CD_Internalname, GXutil.rtrim( A49TBM02_DOM_CD), GXutil.rtrim( localUtil.format( A49TBM02_DOM_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_DOM_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_DOM_CD_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_DOM_CD", "left", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_dom_enm_Internalname, "ドメイン英語名", "", "", lblTextblocktbm02_dom_enm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_DOM_ENM_Internalname, GXutil.rtrim( A610TBM02_DOM_ENM), GXutil.rtrim( localUtil.format( A610TBM02_DOM_ENM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_DOM_ENM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_DOM_ENM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_dom_jnm_Internalname, "ドメイン日本語名", "", "", lblTextblocktbm02_dom_jnm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_DOM_JNM_Internalname, GXutil.rtrim( A611TBM02_DOM_JNM), GXutil.rtrim( localUtil.format( A611TBM02_DOM_JNM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_DOM_JNM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_DOM_JNM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_dom_grp_nm_Internalname, "ドメイングループ名", "", "", lblTextblocktbm02_dom_grp_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_DOM_GRP_NM_Internalname, GXutil.rtrim( A612TBM02_DOM_GRP_NM), GXutil.rtrim( localUtil.format( A612TBM02_DOM_GRP_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_DOM_GRP_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_DOM_GRP_NM_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_note_Internalname, "備考", "", "", lblTextblocktbm02_note_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_html_textarea( httpContext, edtTBM02_NOTE_Internalname, GXutil.rtrim( A613TBM02_NOTE), "", TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", (short)(0), 1, edtTBM02_NOTE_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "1000", -1, "", "", (byte)(-1), true, "", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_order_Internalname, "表示順", "", "", lblTextblocktbm02_order_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_ORDER_Internalname, GXutil.ltrim( localUtil.ntoc( A614TBM02_ORDER, (byte)(5), (byte)(0), ".", "")), ((edtTBM02_ORDER_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A614TBM02_ORDER), "ZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A614TBM02_ORDER), "ZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_ORDER_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_ORDER_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm02_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_DEL_FLG_Internalname, GXutil.rtrim( A615TBM02_DEL_FLG), GXutil.rtrim( localUtil.format( A615TBM02_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm02_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM02_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_CRT_DATETIME_Internalname, localUtil.format(A616TBM02_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A616TBM02_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM02_CDISC_DOMAIN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM02_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM02_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_crt_user_id_Internalname, "ID", "", "", lblTextblocktbm02_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_CRT_USER_ID_Internalname, GXutil.rtrim( A617TBM02_CRT_USER_ID), GXutil.rtrim( localUtil.format( A617TBM02_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm02_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_CRT_PROG_NM_Internalname, GXutil.rtrim( A618TBM02_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A618TBM02_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm02_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM02_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_UPD_DATETIME_Internalname, localUtil.format(A619TBM02_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A619TBM02_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM02_CDISC_DOMAIN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM02_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM02_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_upd_user_id_Internalname, "ID", "", "", lblTextblocktbm02_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_UPD_USER_ID_Internalname, GXutil.rtrim( A620TBM02_UPD_USER_ID), GXutil.rtrim( localUtil.format( A620TBM02_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm02_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_UPD_PROG_NM_Internalname, GXutil.rtrim( A621TBM02_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A621TBM02_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm02_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm02_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM02_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A622TBM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM02_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A622TBM02_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A622TBM02_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM02_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM02_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM02_CDISC_DOMAIN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1338e( true) ;
      }
      else
      {
         wb_table4_34_1338e( false) ;
      }
   }

   public void wb_table2_5_1338( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM02_CDISC_DOMAIN.htm");
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
         wb_table2_5_1338e( true) ;
      }
      else
      {
         wb_table2_5_1338e( false) ;
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
      /* Execute user event: e11132 */
      e11132 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A49TBM02_DOM_CD = httpContext.cgiGet( edtTBM02_DOM_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
            A610TBM02_DOM_ENM = httpContext.cgiGet( edtTBM02_DOM_ENM_Internalname) ;
            n610TBM02_DOM_ENM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A610TBM02_DOM_ENM", A610TBM02_DOM_ENM);
            n610TBM02_DOM_ENM = ((GXutil.strcmp("", A610TBM02_DOM_ENM)==0) ? true : false) ;
            A611TBM02_DOM_JNM = httpContext.cgiGet( edtTBM02_DOM_JNM_Internalname) ;
            n611TBM02_DOM_JNM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A611TBM02_DOM_JNM", A611TBM02_DOM_JNM);
            n611TBM02_DOM_JNM = ((GXutil.strcmp("", A611TBM02_DOM_JNM)==0) ? true : false) ;
            A612TBM02_DOM_GRP_NM = httpContext.cgiGet( edtTBM02_DOM_GRP_NM_Internalname) ;
            n612TBM02_DOM_GRP_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A612TBM02_DOM_GRP_NM", A612TBM02_DOM_GRP_NM);
            n612TBM02_DOM_GRP_NM = ((GXutil.strcmp("", A612TBM02_DOM_GRP_NM)==0) ? true : false) ;
            A613TBM02_NOTE = httpContext.cgiGet( edtTBM02_NOTE_Internalname) ;
            n613TBM02_NOTE = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A613TBM02_NOTE", A613TBM02_NOTE);
            n613TBM02_NOTE = ((GXutil.strcmp("", A613TBM02_NOTE)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM02_ORDER_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM02_ORDER_Internalname), ".", ",") > 99999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM02_ORDER");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM02_ORDER_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A614TBM02_ORDER = 0 ;
               n614TBM02_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A614TBM02_ORDER", GXutil.ltrim( GXutil.str( A614TBM02_ORDER, 5, 0)));
            }
            else
            {
               A614TBM02_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( edtTBM02_ORDER_Internalname), ".", ",")) ;
               n614TBM02_ORDER = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A614TBM02_ORDER", GXutil.ltrim( GXutil.str( A614TBM02_ORDER, 5, 0)));
            }
            n614TBM02_ORDER = ((0==A614TBM02_ORDER) ? true : false) ;
            A615TBM02_DEL_FLG = httpContext.cgiGet( edtTBM02_DEL_FLG_Internalname) ;
            n615TBM02_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A615TBM02_DEL_FLG", A615TBM02_DEL_FLG);
            n615TBM02_DEL_FLG = ((GXutil.strcmp("", A615TBM02_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM02_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM02_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM02_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A616TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n616TBM02_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A616TBM02_CRT_DATETIME", localUtil.ttoc( A616TBM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A616TBM02_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM02_CRT_DATETIME_Internalname)) ;
               n616TBM02_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A616TBM02_CRT_DATETIME", localUtil.ttoc( A616TBM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n616TBM02_CRT_DATETIME = (GXutil.nullDate().equals(A616TBM02_CRT_DATETIME) ? true : false) ;
            A617TBM02_CRT_USER_ID = httpContext.cgiGet( edtTBM02_CRT_USER_ID_Internalname) ;
            n617TBM02_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A617TBM02_CRT_USER_ID", A617TBM02_CRT_USER_ID);
            n617TBM02_CRT_USER_ID = ((GXutil.strcmp("", A617TBM02_CRT_USER_ID)==0) ? true : false) ;
            A618TBM02_CRT_PROG_NM = httpContext.cgiGet( edtTBM02_CRT_PROG_NM_Internalname) ;
            n618TBM02_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A618TBM02_CRT_PROG_NM", A618TBM02_CRT_PROG_NM);
            n618TBM02_CRT_PROG_NM = ((GXutil.strcmp("", A618TBM02_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM02_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM02_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM02_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A619TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n619TBM02_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A619TBM02_UPD_DATETIME", localUtil.ttoc( A619TBM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A619TBM02_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM02_UPD_DATETIME_Internalname)) ;
               n619TBM02_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A619TBM02_UPD_DATETIME", localUtil.ttoc( A619TBM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n619TBM02_UPD_DATETIME = (GXutil.nullDate().equals(A619TBM02_UPD_DATETIME) ? true : false) ;
            A620TBM02_UPD_USER_ID = httpContext.cgiGet( edtTBM02_UPD_USER_ID_Internalname) ;
            n620TBM02_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A620TBM02_UPD_USER_ID", A620TBM02_UPD_USER_ID);
            n620TBM02_UPD_USER_ID = ((GXutil.strcmp("", A620TBM02_UPD_USER_ID)==0) ? true : false) ;
            A621TBM02_UPD_PROG_NM = httpContext.cgiGet( edtTBM02_UPD_PROG_NM_Internalname) ;
            n621TBM02_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A621TBM02_UPD_PROG_NM", A621TBM02_UPD_PROG_NM);
            n621TBM02_UPD_PROG_NM = ((GXutil.strcmp("", A621TBM02_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM02_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM02_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM02_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM02_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A622TBM02_UPD_CNT = 0 ;
               n622TBM02_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A622TBM02_UPD_CNT", GXutil.ltrim( GXutil.str( A622TBM02_UPD_CNT, 10, 0)));
            }
            else
            {
               A622TBM02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM02_UPD_CNT_Internalname), ".", ",") ;
               n622TBM02_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A622TBM02_UPD_CNT", GXutil.ltrim( GXutil.str( A622TBM02_UPD_CNT, 10, 0)));
            }
            n622TBM02_UPD_CNT = ((0==A622TBM02_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z49TBM02_DOM_CD = httpContext.cgiGet( "Z49TBM02_DOM_CD") ;
            Z616TBM02_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z616TBM02_CRT_DATETIME"), 0) ;
            n616TBM02_CRT_DATETIME = (GXutil.nullDate().equals(A616TBM02_CRT_DATETIME) ? true : false) ;
            Z617TBM02_CRT_USER_ID = httpContext.cgiGet( "Z617TBM02_CRT_USER_ID") ;
            n617TBM02_CRT_USER_ID = ((GXutil.strcmp("", A617TBM02_CRT_USER_ID)==0) ? true : false) ;
            Z619TBM02_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z619TBM02_UPD_DATETIME"), 0) ;
            n619TBM02_UPD_DATETIME = (GXutil.nullDate().equals(A619TBM02_UPD_DATETIME) ? true : false) ;
            Z620TBM02_UPD_USER_ID = httpContext.cgiGet( "Z620TBM02_UPD_USER_ID") ;
            n620TBM02_UPD_USER_ID = ((GXutil.strcmp("", A620TBM02_UPD_USER_ID)==0) ? true : false) ;
            Z622TBM02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z622TBM02_UPD_CNT"), ".", ",") ;
            n622TBM02_UPD_CNT = ((0==A622TBM02_UPD_CNT) ? true : false) ;
            Z610TBM02_DOM_ENM = httpContext.cgiGet( "Z610TBM02_DOM_ENM") ;
            n610TBM02_DOM_ENM = ((GXutil.strcmp("", A610TBM02_DOM_ENM)==0) ? true : false) ;
            Z611TBM02_DOM_JNM = httpContext.cgiGet( "Z611TBM02_DOM_JNM") ;
            n611TBM02_DOM_JNM = ((GXutil.strcmp("", A611TBM02_DOM_JNM)==0) ? true : false) ;
            Z612TBM02_DOM_GRP_NM = httpContext.cgiGet( "Z612TBM02_DOM_GRP_NM") ;
            n612TBM02_DOM_GRP_NM = ((GXutil.strcmp("", A612TBM02_DOM_GRP_NM)==0) ? true : false) ;
            Z613TBM02_NOTE = httpContext.cgiGet( "Z613TBM02_NOTE") ;
            n613TBM02_NOTE = ((GXutil.strcmp("", A613TBM02_NOTE)==0) ? true : false) ;
            Z614TBM02_ORDER = (int)(localUtil.ctol( httpContext.cgiGet( "Z614TBM02_ORDER"), ".", ",")) ;
            n614TBM02_ORDER = ((0==A614TBM02_ORDER) ? true : false) ;
            Z615TBM02_DEL_FLG = httpContext.cgiGet( "Z615TBM02_DEL_FLG") ;
            n615TBM02_DEL_FLG = ((GXutil.strcmp("", A615TBM02_DEL_FLG)==0) ? true : false) ;
            Z618TBM02_CRT_PROG_NM = httpContext.cgiGet( "Z618TBM02_CRT_PROG_NM") ;
            n618TBM02_CRT_PROG_NM = ((GXutil.strcmp("", A618TBM02_CRT_PROG_NM)==0) ? true : false) ;
            Z621TBM02_UPD_PROG_NM = httpContext.cgiGet( "Z621TBM02_UPD_PROG_NM") ;
            n621TBM02_UPD_PROG_NM = ((GXutil.strcmp("", A621TBM02_UPD_PROG_NM)==0) ? true : false) ;
            O622TBM02_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O622TBM02_UPD_CNT"), ".", ",") ;
            n622TBM02_UPD_CNT = ((0==A622TBM02_UPD_CNT) ? true : false) ;
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
               A49TBM02_DOM_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
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
                     /* Execute user event: e11132 */
                     e11132 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12132 */
                     e12132 ();
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
         /* Execute user event: e12132 */
         e12132 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll1338( ) ;
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
      disableAttributes1338( ) ;
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

   public void resetCaption130( )
   {
   }

   public void e11132( )
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

   public void e12132( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + "ドメインコード:" + A49TBM02_DOM_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A610TBM02_DOM_ENM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A611TBM02_DOM_JNM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A612TBM02_DOM_GRP_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A613TBM02_NOTE + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A614TBM02_ORDER, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A615TBM02_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A616TBM02_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm02_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A616TBM02_CRT_DATETIME", localUtil.ttoc( A616TBM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A617TBM02_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A618TBM02_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      GXt_char1 = AV7W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A619TBM02_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tbm02_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A619TBM02_UPD_DATETIME", localUtil.ttoc( A619TBM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A620TBM02_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + A621TBM02_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7W_TXT", AV7W_TXT);
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A622TBM02_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm1338( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z616TBM02_CRT_DATETIME = T00133_A616TBM02_CRT_DATETIME[0] ;
            Z617TBM02_CRT_USER_ID = T00133_A617TBM02_CRT_USER_ID[0] ;
            Z619TBM02_UPD_DATETIME = T00133_A619TBM02_UPD_DATETIME[0] ;
            Z620TBM02_UPD_USER_ID = T00133_A620TBM02_UPD_USER_ID[0] ;
            Z622TBM02_UPD_CNT = T00133_A622TBM02_UPD_CNT[0] ;
            Z610TBM02_DOM_ENM = T00133_A610TBM02_DOM_ENM[0] ;
            Z611TBM02_DOM_JNM = T00133_A611TBM02_DOM_JNM[0] ;
            Z612TBM02_DOM_GRP_NM = T00133_A612TBM02_DOM_GRP_NM[0] ;
            Z613TBM02_NOTE = T00133_A613TBM02_NOTE[0] ;
            Z614TBM02_ORDER = T00133_A614TBM02_ORDER[0] ;
            Z615TBM02_DEL_FLG = T00133_A615TBM02_DEL_FLG[0] ;
            Z618TBM02_CRT_PROG_NM = T00133_A618TBM02_CRT_PROG_NM[0] ;
            Z621TBM02_UPD_PROG_NM = T00133_A621TBM02_UPD_PROG_NM[0] ;
         }
         else
         {
            Z616TBM02_CRT_DATETIME = A616TBM02_CRT_DATETIME ;
            Z617TBM02_CRT_USER_ID = A617TBM02_CRT_USER_ID ;
            Z619TBM02_UPD_DATETIME = A619TBM02_UPD_DATETIME ;
            Z620TBM02_UPD_USER_ID = A620TBM02_UPD_USER_ID ;
            Z622TBM02_UPD_CNT = A622TBM02_UPD_CNT ;
            Z610TBM02_DOM_ENM = A610TBM02_DOM_ENM ;
            Z611TBM02_DOM_JNM = A611TBM02_DOM_JNM ;
            Z612TBM02_DOM_GRP_NM = A612TBM02_DOM_GRP_NM ;
            Z613TBM02_NOTE = A613TBM02_NOTE ;
            Z614TBM02_ORDER = A614TBM02_ORDER ;
            Z615TBM02_DEL_FLG = A615TBM02_DEL_FLG ;
            Z618TBM02_CRT_PROG_NM = A618TBM02_CRT_PROG_NM ;
            Z621TBM02_UPD_PROG_NM = A621TBM02_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z49TBM02_DOM_CD = A49TBM02_DOM_CD ;
         Z616TBM02_CRT_DATETIME = A616TBM02_CRT_DATETIME ;
         Z617TBM02_CRT_USER_ID = A617TBM02_CRT_USER_ID ;
         Z619TBM02_UPD_DATETIME = A619TBM02_UPD_DATETIME ;
         Z620TBM02_UPD_USER_ID = A620TBM02_UPD_USER_ID ;
         Z622TBM02_UPD_CNT = A622TBM02_UPD_CNT ;
         Z610TBM02_DOM_ENM = A610TBM02_DOM_ENM ;
         Z611TBM02_DOM_JNM = A611TBM02_DOM_JNM ;
         Z612TBM02_DOM_GRP_NM = A612TBM02_DOM_GRP_NM ;
         Z613TBM02_NOTE = A613TBM02_NOTE ;
         Z614TBM02_ORDER = A614TBM02_ORDER ;
         Z615TBM02_DEL_FLG = A615TBM02_DEL_FLG ;
         Z618TBM02_CRT_PROG_NM = A618TBM02_CRT_PROG_NM ;
         Z621TBM02_UPD_PROG_NM = A621TBM02_UPD_PROG_NM ;
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

   public void load1338( )
   {
      /* Using cursor T00134 */
      pr_default.execute(2, new Object[] {A49TBM02_DOM_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A616TBM02_CRT_DATETIME = T00134_A616TBM02_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A616TBM02_CRT_DATETIME", localUtil.ttoc( A616TBM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n616TBM02_CRT_DATETIME = T00134_n616TBM02_CRT_DATETIME[0] ;
         A617TBM02_CRT_USER_ID = T00134_A617TBM02_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A617TBM02_CRT_USER_ID", A617TBM02_CRT_USER_ID);
         n617TBM02_CRT_USER_ID = T00134_n617TBM02_CRT_USER_ID[0] ;
         A619TBM02_UPD_DATETIME = T00134_A619TBM02_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A619TBM02_UPD_DATETIME", localUtil.ttoc( A619TBM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n619TBM02_UPD_DATETIME = T00134_n619TBM02_UPD_DATETIME[0] ;
         A620TBM02_UPD_USER_ID = T00134_A620TBM02_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A620TBM02_UPD_USER_ID", A620TBM02_UPD_USER_ID);
         n620TBM02_UPD_USER_ID = T00134_n620TBM02_UPD_USER_ID[0] ;
         A622TBM02_UPD_CNT = T00134_A622TBM02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A622TBM02_UPD_CNT", GXutil.ltrim( GXutil.str( A622TBM02_UPD_CNT, 10, 0)));
         n622TBM02_UPD_CNT = T00134_n622TBM02_UPD_CNT[0] ;
         A610TBM02_DOM_ENM = T00134_A610TBM02_DOM_ENM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A610TBM02_DOM_ENM", A610TBM02_DOM_ENM);
         n610TBM02_DOM_ENM = T00134_n610TBM02_DOM_ENM[0] ;
         A611TBM02_DOM_JNM = T00134_A611TBM02_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A611TBM02_DOM_JNM", A611TBM02_DOM_JNM);
         n611TBM02_DOM_JNM = T00134_n611TBM02_DOM_JNM[0] ;
         A612TBM02_DOM_GRP_NM = T00134_A612TBM02_DOM_GRP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A612TBM02_DOM_GRP_NM", A612TBM02_DOM_GRP_NM);
         n612TBM02_DOM_GRP_NM = T00134_n612TBM02_DOM_GRP_NM[0] ;
         A613TBM02_NOTE = T00134_A613TBM02_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A613TBM02_NOTE", A613TBM02_NOTE);
         n613TBM02_NOTE = T00134_n613TBM02_NOTE[0] ;
         A614TBM02_ORDER = T00134_A614TBM02_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A614TBM02_ORDER", GXutil.ltrim( GXutil.str( A614TBM02_ORDER, 5, 0)));
         n614TBM02_ORDER = T00134_n614TBM02_ORDER[0] ;
         A615TBM02_DEL_FLG = T00134_A615TBM02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A615TBM02_DEL_FLG", A615TBM02_DEL_FLG);
         n615TBM02_DEL_FLG = T00134_n615TBM02_DEL_FLG[0] ;
         A618TBM02_CRT_PROG_NM = T00134_A618TBM02_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A618TBM02_CRT_PROG_NM", A618TBM02_CRT_PROG_NM);
         n618TBM02_CRT_PROG_NM = T00134_n618TBM02_CRT_PROG_NM[0] ;
         A621TBM02_UPD_PROG_NM = T00134_A621TBM02_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A621TBM02_UPD_PROG_NM", A621TBM02_UPD_PROG_NM);
         n621TBM02_UPD_PROG_NM = T00134_n621TBM02_UPD_PROG_NM[0] ;
         zm1338( -8) ;
      }
      pr_default.close(2);
      onLoadActions1338( ) ;
   }

   public void onLoadActions1338( )
   {
      AV9Pgmname = "TBM02_CDISC_DOMAIN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable1338( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM02_CDISC_DOMAIN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A616TBM02_CRT_DATETIME) || (( A616TBM02_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A616TBM02_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM02_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM02_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A619TBM02_UPD_DATETIME) || (( A619TBM02_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A619TBM02_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM02_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM02_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1338( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1338( )
   {
      /* Using cursor T00135 */
      pr_default.execute(3, new Object[] {A49TBM02_DOM_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound38 = (short)(1) ;
      }
      else
      {
         RcdFound38 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00133 */
      pr_default.execute(1, new Object[] {A49TBM02_DOM_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1338( 8) ;
         RcdFound38 = (short)(1) ;
         A49TBM02_DOM_CD = T00133_A49TBM02_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
         A616TBM02_CRT_DATETIME = T00133_A616TBM02_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A616TBM02_CRT_DATETIME", localUtil.ttoc( A616TBM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n616TBM02_CRT_DATETIME = T00133_n616TBM02_CRT_DATETIME[0] ;
         A617TBM02_CRT_USER_ID = T00133_A617TBM02_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A617TBM02_CRT_USER_ID", A617TBM02_CRT_USER_ID);
         n617TBM02_CRT_USER_ID = T00133_n617TBM02_CRT_USER_ID[0] ;
         A619TBM02_UPD_DATETIME = T00133_A619TBM02_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A619TBM02_UPD_DATETIME", localUtil.ttoc( A619TBM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n619TBM02_UPD_DATETIME = T00133_n619TBM02_UPD_DATETIME[0] ;
         A620TBM02_UPD_USER_ID = T00133_A620TBM02_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A620TBM02_UPD_USER_ID", A620TBM02_UPD_USER_ID);
         n620TBM02_UPD_USER_ID = T00133_n620TBM02_UPD_USER_ID[0] ;
         A622TBM02_UPD_CNT = T00133_A622TBM02_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A622TBM02_UPD_CNT", GXutil.ltrim( GXutil.str( A622TBM02_UPD_CNT, 10, 0)));
         n622TBM02_UPD_CNT = T00133_n622TBM02_UPD_CNT[0] ;
         A610TBM02_DOM_ENM = T00133_A610TBM02_DOM_ENM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A610TBM02_DOM_ENM", A610TBM02_DOM_ENM);
         n610TBM02_DOM_ENM = T00133_n610TBM02_DOM_ENM[0] ;
         A611TBM02_DOM_JNM = T00133_A611TBM02_DOM_JNM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A611TBM02_DOM_JNM", A611TBM02_DOM_JNM);
         n611TBM02_DOM_JNM = T00133_n611TBM02_DOM_JNM[0] ;
         A612TBM02_DOM_GRP_NM = T00133_A612TBM02_DOM_GRP_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A612TBM02_DOM_GRP_NM", A612TBM02_DOM_GRP_NM);
         n612TBM02_DOM_GRP_NM = T00133_n612TBM02_DOM_GRP_NM[0] ;
         A613TBM02_NOTE = T00133_A613TBM02_NOTE[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A613TBM02_NOTE", A613TBM02_NOTE);
         n613TBM02_NOTE = T00133_n613TBM02_NOTE[0] ;
         A614TBM02_ORDER = T00133_A614TBM02_ORDER[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A614TBM02_ORDER", GXutil.ltrim( GXutil.str( A614TBM02_ORDER, 5, 0)));
         n614TBM02_ORDER = T00133_n614TBM02_ORDER[0] ;
         A615TBM02_DEL_FLG = T00133_A615TBM02_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A615TBM02_DEL_FLG", A615TBM02_DEL_FLG);
         n615TBM02_DEL_FLG = T00133_n615TBM02_DEL_FLG[0] ;
         A618TBM02_CRT_PROG_NM = T00133_A618TBM02_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A618TBM02_CRT_PROG_NM", A618TBM02_CRT_PROG_NM);
         n618TBM02_CRT_PROG_NM = T00133_n618TBM02_CRT_PROG_NM[0] ;
         A621TBM02_UPD_PROG_NM = T00133_A621TBM02_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A621TBM02_UPD_PROG_NM", A621TBM02_UPD_PROG_NM);
         n621TBM02_UPD_PROG_NM = T00133_n621TBM02_UPD_PROG_NM[0] ;
         O622TBM02_UPD_CNT = A622TBM02_UPD_CNT ;
         n622TBM02_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A622TBM02_UPD_CNT", GXutil.ltrim( GXutil.str( A622TBM02_UPD_CNT, 10, 0)));
         Z49TBM02_DOM_CD = A49TBM02_DOM_CD ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1338( ) ;
         if ( AnyError == 1 )
         {
            RcdFound38 = (short)(0) ;
            initializeNonKey1338( ) ;
         }
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound38 = (short)(0) ;
         initializeNonKey1338( ) ;
         sMode38 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode38 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1338( ) ;
      if ( RcdFound38 == 0 )
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
      RcdFound38 = (short)(0) ;
      /* Using cursor T00136 */
      pr_default.execute(4, new Object[] {A49TBM02_DOM_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00136_A49TBM02_DOM_CD[0], A49TBM02_DOM_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00136_A49TBM02_DOM_CD[0], A49TBM02_DOM_CD) > 0 ) ) )
         {
            A49TBM02_DOM_CD = T00136_A49TBM02_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound38 = (short)(0) ;
      /* Using cursor T00137 */
      pr_default.execute(5, new Object[] {A49TBM02_DOM_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00137_A49TBM02_DOM_CD[0], A49TBM02_DOM_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00137_A49TBM02_DOM_CD[0], A49TBM02_DOM_CD) < 0 ) ) )
         {
            A49TBM02_DOM_CD = T00137_A49TBM02_DOM_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
            RcdFound38 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1338( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM02_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1338( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound38 == 1 )
         {
            if ( GXutil.strcmp(A49TBM02_DOM_CD, Z49TBM02_DOM_CD) != 0 )
            {
               A49TBM02_DOM_CD = Z49TBM02_DOM_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM02_DOM_CD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM02_DOM_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM02_DOM_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1338( ) ;
               GX_FocusControl = edtTBM02_DOM_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A49TBM02_DOM_CD, Z49TBM02_DOM_CD) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM02_DOM_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1338( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM02_DOM_CD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM02_DOM_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM02_DOM_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1338( ) ;
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
      if ( GXutil.strcmp(A49TBM02_DOM_CD, Z49TBM02_DOM_CD) != 0 )
      {
         A49TBM02_DOM_CD = Z49TBM02_DOM_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM02_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM02_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM02_DOM_CD_Internalname ;
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
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM02_DOM_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM02_DOM_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM02_DOM_ENM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1338( ) ;
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM02_DOM_ENM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1338( ) ;
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
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM02_DOM_ENM_Internalname ;
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
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM02_DOM_ENM_Internalname ;
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
      scanStart1338( ) ;
      if ( RcdFound38 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound38 != 0 )
         {
            scanNext1338( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM02_DOM_ENM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1338( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1338( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00132 */
         pr_default.execute(0, new Object[] {A49TBM02_DOM_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM02_CDISC_DOMAIN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z616TBM02_CRT_DATETIME.equals( T00132_A616TBM02_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z617TBM02_CRT_USER_ID, T00132_A617TBM02_CRT_USER_ID[0]) != 0 ) || !( Z619TBM02_UPD_DATETIME.equals( T00132_A619TBM02_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z620TBM02_UPD_USER_ID, T00132_A620TBM02_UPD_USER_ID[0]) != 0 ) || ( Z622TBM02_UPD_CNT != T00132_A622TBM02_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z610TBM02_DOM_ENM, T00132_A610TBM02_DOM_ENM[0]) != 0 ) || ( GXutil.strcmp(Z611TBM02_DOM_JNM, T00132_A611TBM02_DOM_JNM[0]) != 0 ) || ( GXutil.strcmp(Z612TBM02_DOM_GRP_NM, T00132_A612TBM02_DOM_GRP_NM[0]) != 0 ) || ( GXutil.strcmp(Z613TBM02_NOTE, T00132_A613TBM02_NOTE[0]) != 0 ) || ( Z614TBM02_ORDER != T00132_A614TBM02_ORDER[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z615TBM02_DEL_FLG, T00132_A615TBM02_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z618TBM02_CRT_PROG_NM, T00132_A618TBM02_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z621TBM02_UPD_PROG_NM, T00132_A621TBM02_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM02_CDISC_DOMAIN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1338( )
   {
      beforeValidate1338( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1338( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1338( 0) ;
         checkOptimisticConcurrency1338( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1338( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1338( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00138 */
                  pr_default.execute(6, new Object[] {A49TBM02_DOM_CD, new Boolean(n616TBM02_CRT_DATETIME), A616TBM02_CRT_DATETIME, new Boolean(n617TBM02_CRT_USER_ID), A617TBM02_CRT_USER_ID, new Boolean(n619TBM02_UPD_DATETIME), A619TBM02_UPD_DATETIME, new Boolean(n620TBM02_UPD_USER_ID), A620TBM02_UPD_USER_ID, new Boolean(n622TBM02_UPD_CNT), new Long(A622TBM02_UPD_CNT), new Boolean(n610TBM02_DOM_ENM), A610TBM02_DOM_ENM, new Boolean(n611TBM02_DOM_JNM), A611TBM02_DOM_JNM, new Boolean(n612TBM02_DOM_GRP_NM), A612TBM02_DOM_GRP_NM, new Boolean(n613TBM02_NOTE), A613TBM02_NOTE, new Boolean(n614TBM02_ORDER), new Integer(A614TBM02_ORDER), new Boolean(n615TBM02_DEL_FLG), A615TBM02_DEL_FLG, new Boolean(n618TBM02_CRT_PROG_NM), A618TBM02_CRT_PROG_NM, new Boolean(n621TBM02_UPD_PROG_NM), A621TBM02_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM02_CDISC_DOMAIN") ;
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
                        resetCaption130( ) ;
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
            load1338( ) ;
         }
         endLevel1338( ) ;
      }
      closeExtendedTableCursors1338( ) ;
   }

   public void update1338( )
   {
      beforeValidate1338( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1338( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1338( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1338( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1338( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00139 */
                  pr_default.execute(7, new Object[] {new Boolean(n616TBM02_CRT_DATETIME), A616TBM02_CRT_DATETIME, new Boolean(n617TBM02_CRT_USER_ID), A617TBM02_CRT_USER_ID, new Boolean(n619TBM02_UPD_DATETIME), A619TBM02_UPD_DATETIME, new Boolean(n620TBM02_UPD_USER_ID), A620TBM02_UPD_USER_ID, new Boolean(n622TBM02_UPD_CNT), new Long(A622TBM02_UPD_CNT), new Boolean(n610TBM02_DOM_ENM), A610TBM02_DOM_ENM, new Boolean(n611TBM02_DOM_JNM), A611TBM02_DOM_JNM, new Boolean(n612TBM02_DOM_GRP_NM), A612TBM02_DOM_GRP_NM, new Boolean(n613TBM02_NOTE), A613TBM02_NOTE, new Boolean(n614TBM02_ORDER), new Integer(A614TBM02_ORDER), new Boolean(n615TBM02_DEL_FLG), A615TBM02_DEL_FLG, new Boolean(n618TBM02_CRT_PROG_NM), A618TBM02_CRT_PROG_NM, new Boolean(n621TBM02_UPD_PROG_NM), A621TBM02_UPD_PROG_NM, A49TBM02_DOM_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM02_CDISC_DOMAIN") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM02_CDISC_DOMAIN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1338( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption130( ) ;
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
         endLevel1338( ) ;
      }
      closeExtendedTableCursors1338( ) ;
   }

   public void deferredUpdate1338( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1338( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1338( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1338( ) ;
         afterConfirm1338( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1338( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001310 */
               pr_default.execute(8, new Object[] {A49TBM02_DOM_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM02_CDISC_DOMAIN") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound38 == 0 )
                     {
                        initAll1338( ) ;
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
                     resetCaption130( ) ;
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
      sMode38 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1338( ) ;
      Gx_mode = sMode38 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1338( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM02_CDISC_DOMAIN" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T001311 */
         pr_default.execute(9, new Object[] {A49TBM02_DOM_CD});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"CDISC項目マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
      }
   }

   public void endLevel1338( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1338( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm02_cdisc_domain");
         if ( AnyError == 0 )
         {
            confirmValues130( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm02_cdisc_domain");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1338( )
   {
      /* Scan By routine */
      /* Using cursor T001312 */
      pr_default.execute(10);
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A49TBM02_DOM_CD = T001312_A49TBM02_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1338( )
   {
      /* Scan next routine */
      pr_default.readNext(10);
      RcdFound38 = (short)(0) ;
      if ( (pr_default.getStatus(10) != 101) )
      {
         RcdFound38 = (short)(1) ;
         A49TBM02_DOM_CD = T001312_A49TBM02_DOM_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
      }
   }

   public void scanEnd1338( )
   {
      pr_default.close(10);
   }

   public void afterConfirm1338( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1338( )
   {
      /* Before Insert Rules */
      A616TBM02_CRT_DATETIME = GXutil.now( ) ;
      n616TBM02_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A616TBM02_CRT_DATETIME", localUtil.ttoc( A616TBM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A617TBM02_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm02_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      A617TBM02_CRT_USER_ID = GXt_char1 ;
      n617TBM02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A617TBM02_CRT_USER_ID", A617TBM02_CRT_USER_ID);
      A619TBM02_UPD_DATETIME = GXutil.now( ) ;
      n619TBM02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A619TBM02_UPD_DATETIME", localUtil.ttoc( A619TBM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A620TBM02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm02_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      A620TBM02_UPD_USER_ID = GXt_char1 ;
      n620TBM02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A620TBM02_UPD_USER_ID", A620TBM02_UPD_USER_ID);
      A622TBM02_UPD_CNT = (long)(O622TBM02_UPD_CNT+1) ;
      n622TBM02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A622TBM02_UPD_CNT", GXutil.ltrim( GXutil.str( A622TBM02_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate1338( )
   {
      /* Before Update Rules */
      A619TBM02_UPD_DATETIME = GXutil.now( ) ;
      n619TBM02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A619TBM02_UPD_DATETIME", localUtil.ttoc( A619TBM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A620TBM02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm02_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      A620TBM02_UPD_USER_ID = GXt_char1 ;
      n620TBM02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A620TBM02_UPD_USER_ID", A620TBM02_UPD_USER_ID);
      A622TBM02_UPD_CNT = (long)(O622TBM02_UPD_CNT+1) ;
      n622TBM02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A622TBM02_UPD_CNT", GXutil.ltrim( GXutil.str( A622TBM02_UPD_CNT, 10, 0)));
   }

   public void beforeDelete1338( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1338( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1338( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1338( )
   {
      edtTBM02_DOM_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_DOM_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_DOM_CD_Enabled, 5, 0)));
      edtTBM02_DOM_ENM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_DOM_ENM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_DOM_ENM_Enabled, 5, 0)));
      edtTBM02_DOM_JNM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_DOM_JNM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_DOM_JNM_Enabled, 5, 0)));
      edtTBM02_DOM_GRP_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_DOM_GRP_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_DOM_GRP_NM_Enabled, 5, 0)));
      edtTBM02_NOTE_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_NOTE_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_NOTE_Enabled, 5, 0)));
      edtTBM02_ORDER_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_ORDER_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_ORDER_Enabled, 5, 0)));
      edtTBM02_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_DEL_FLG_Enabled, 5, 0)));
      edtTBM02_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM02_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM02_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM02_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM02_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM02_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM02_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM02_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM02_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues130( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "CDISCドメインマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?202071513211411");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm02_cdisc_domain") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1338( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z49TBM02_DOM_CD", GXutil.rtrim( Z49TBM02_DOM_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z616TBM02_CRT_DATETIME", localUtil.ttoc( Z616TBM02_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z617TBM02_CRT_USER_ID", GXutil.rtrim( Z617TBM02_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z619TBM02_UPD_DATETIME", localUtil.ttoc( Z619TBM02_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z620TBM02_UPD_USER_ID", GXutil.rtrim( Z620TBM02_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z622TBM02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z622TBM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z610TBM02_DOM_ENM", GXutil.rtrim( Z610TBM02_DOM_ENM));
      GxWebStd.gx_hidden_field( httpContext, "Z611TBM02_DOM_JNM", GXutil.rtrim( Z611TBM02_DOM_JNM));
      GxWebStd.gx_hidden_field( httpContext, "Z612TBM02_DOM_GRP_NM", GXutil.rtrim( Z612TBM02_DOM_GRP_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z613TBM02_NOTE", GXutil.rtrim( Z613TBM02_NOTE));
      GxWebStd.gx_hidden_field( httpContext, "Z614TBM02_ORDER", GXutil.ltrim( localUtil.ntoc( Z614TBM02_ORDER, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z615TBM02_DEL_FLG", GXutil.rtrim( Z615TBM02_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z618TBM02_CRT_PROG_NM", GXutil.rtrim( Z618TBM02_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z621TBM02_UPD_PROG_NM", GXutil.rtrim( Z621TBM02_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O622TBM02_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O622TBM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TBM02_CDISC_DOMAIN" ;
   }

   public String getPgmdesc( )
   {
      return "CDISCドメインマスタ" ;
   }

   public void initializeNonKey1338( )
   {
      A616TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n616TBM02_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A616TBM02_CRT_DATETIME", localUtil.ttoc( A616TBM02_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n616TBM02_CRT_DATETIME = (GXutil.nullDate().equals(A616TBM02_CRT_DATETIME) ? true : false) ;
      A617TBM02_CRT_USER_ID = "" ;
      n617TBM02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A617TBM02_CRT_USER_ID", A617TBM02_CRT_USER_ID);
      n617TBM02_CRT_USER_ID = ((GXutil.strcmp("", A617TBM02_CRT_USER_ID)==0) ? true : false) ;
      A619TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n619TBM02_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A619TBM02_UPD_DATETIME", localUtil.ttoc( A619TBM02_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n619TBM02_UPD_DATETIME = (GXutil.nullDate().equals(A619TBM02_UPD_DATETIME) ? true : false) ;
      A620TBM02_UPD_USER_ID = "" ;
      n620TBM02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A620TBM02_UPD_USER_ID", A620TBM02_UPD_USER_ID);
      n620TBM02_UPD_USER_ID = ((GXutil.strcmp("", A620TBM02_UPD_USER_ID)==0) ? true : false) ;
      A622TBM02_UPD_CNT = 0 ;
      n622TBM02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A622TBM02_UPD_CNT", GXutil.ltrim( GXutil.str( A622TBM02_UPD_CNT, 10, 0)));
      n622TBM02_UPD_CNT = ((0==A622TBM02_UPD_CNT) ? true : false) ;
      A610TBM02_DOM_ENM = "" ;
      n610TBM02_DOM_ENM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A610TBM02_DOM_ENM", A610TBM02_DOM_ENM);
      n610TBM02_DOM_ENM = ((GXutil.strcmp("", A610TBM02_DOM_ENM)==0) ? true : false) ;
      A611TBM02_DOM_JNM = "" ;
      n611TBM02_DOM_JNM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A611TBM02_DOM_JNM", A611TBM02_DOM_JNM);
      n611TBM02_DOM_JNM = ((GXutil.strcmp("", A611TBM02_DOM_JNM)==0) ? true : false) ;
      A612TBM02_DOM_GRP_NM = "" ;
      n612TBM02_DOM_GRP_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A612TBM02_DOM_GRP_NM", A612TBM02_DOM_GRP_NM);
      n612TBM02_DOM_GRP_NM = ((GXutil.strcmp("", A612TBM02_DOM_GRP_NM)==0) ? true : false) ;
      A613TBM02_NOTE = "" ;
      n613TBM02_NOTE = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A613TBM02_NOTE", A613TBM02_NOTE);
      n613TBM02_NOTE = ((GXutil.strcmp("", A613TBM02_NOTE)==0) ? true : false) ;
      A614TBM02_ORDER = 0 ;
      n614TBM02_ORDER = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A614TBM02_ORDER", GXutil.ltrim( GXutil.str( A614TBM02_ORDER, 5, 0)));
      n614TBM02_ORDER = ((0==A614TBM02_ORDER) ? true : false) ;
      A615TBM02_DEL_FLG = "" ;
      n615TBM02_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A615TBM02_DEL_FLG", A615TBM02_DEL_FLG);
      n615TBM02_DEL_FLG = ((GXutil.strcmp("", A615TBM02_DEL_FLG)==0) ? true : false) ;
      A618TBM02_CRT_PROG_NM = "" ;
      n618TBM02_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A618TBM02_CRT_PROG_NM", A618TBM02_CRT_PROG_NM);
      n618TBM02_CRT_PROG_NM = ((GXutil.strcmp("", A618TBM02_CRT_PROG_NM)==0) ? true : false) ;
      A621TBM02_UPD_PROG_NM = "" ;
      n621TBM02_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A621TBM02_UPD_PROG_NM", A621TBM02_UPD_PROG_NM);
      n621TBM02_UPD_PROG_NM = ((GXutil.strcmp("", A621TBM02_UPD_PROG_NM)==0) ? true : false) ;
      O622TBM02_UPD_CNT = A622TBM02_UPD_CNT ;
      n622TBM02_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A622TBM02_UPD_CNT", GXutil.ltrim( GXutil.str( A622TBM02_UPD_CNT, 10, 0)));
   }

   public void initAll1338( )
   {
      A49TBM02_DOM_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A49TBM02_DOM_CD", A49TBM02_DOM_CD);
      initializeNonKey1338( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202071513211415");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm02_cdisc_domain.js", "?202071513211415");
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
      lblTextblocktbm02_dom_cd_Internalname = "TEXTBLOCKTBM02_DOM_CD" ;
      edtTBM02_DOM_CD_Internalname = "TBM02_DOM_CD" ;
      lblTextblocktbm02_dom_enm_Internalname = "TEXTBLOCKTBM02_DOM_ENM" ;
      edtTBM02_DOM_ENM_Internalname = "TBM02_DOM_ENM" ;
      lblTextblocktbm02_dom_jnm_Internalname = "TEXTBLOCKTBM02_DOM_JNM" ;
      edtTBM02_DOM_JNM_Internalname = "TBM02_DOM_JNM" ;
      lblTextblocktbm02_dom_grp_nm_Internalname = "TEXTBLOCKTBM02_DOM_GRP_NM" ;
      edtTBM02_DOM_GRP_NM_Internalname = "TBM02_DOM_GRP_NM" ;
      lblTextblocktbm02_note_Internalname = "TEXTBLOCKTBM02_NOTE" ;
      edtTBM02_NOTE_Internalname = "TBM02_NOTE" ;
      lblTextblocktbm02_order_Internalname = "TEXTBLOCKTBM02_ORDER" ;
      edtTBM02_ORDER_Internalname = "TBM02_ORDER" ;
      lblTextblocktbm02_del_flg_Internalname = "TEXTBLOCKTBM02_DEL_FLG" ;
      edtTBM02_DEL_FLG_Internalname = "TBM02_DEL_FLG" ;
      lblTextblocktbm02_crt_datetime_Internalname = "TEXTBLOCKTBM02_CRT_DATETIME" ;
      edtTBM02_CRT_DATETIME_Internalname = "TBM02_CRT_DATETIME" ;
      lblTextblocktbm02_crt_user_id_Internalname = "TEXTBLOCKTBM02_CRT_USER_ID" ;
      edtTBM02_CRT_USER_ID_Internalname = "TBM02_CRT_USER_ID" ;
      lblTextblocktbm02_crt_prog_nm_Internalname = "TEXTBLOCKTBM02_CRT_PROG_NM" ;
      edtTBM02_CRT_PROG_NM_Internalname = "TBM02_CRT_PROG_NM" ;
      lblTextblocktbm02_upd_datetime_Internalname = "TEXTBLOCKTBM02_UPD_DATETIME" ;
      edtTBM02_UPD_DATETIME_Internalname = "TBM02_UPD_DATETIME" ;
      lblTextblocktbm02_upd_user_id_Internalname = "TEXTBLOCKTBM02_UPD_USER_ID" ;
      edtTBM02_UPD_USER_ID_Internalname = "TBM02_UPD_USER_ID" ;
      lblTextblocktbm02_upd_prog_nm_Internalname = "TEXTBLOCKTBM02_UPD_PROG_NM" ;
      edtTBM02_UPD_PROG_NM_Internalname = "TBM02_UPD_PROG_NM" ;
      lblTextblocktbm02_upd_cnt_Internalname = "TEXTBLOCKTBM02_UPD_CNT" ;
      edtTBM02_UPD_CNT_Internalname = "TBM02_UPD_CNT" ;
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
      edtTBM02_UPD_CNT_Jsonclick = "" ;
      edtTBM02_UPD_CNT_Enabled = 1 ;
      edtTBM02_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM02_UPD_PROG_NM_Enabled = 1 ;
      edtTBM02_UPD_USER_ID_Jsonclick = "" ;
      edtTBM02_UPD_USER_ID_Enabled = 1 ;
      edtTBM02_UPD_DATETIME_Jsonclick = "" ;
      edtTBM02_UPD_DATETIME_Enabled = 1 ;
      edtTBM02_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM02_CRT_PROG_NM_Enabled = 1 ;
      edtTBM02_CRT_USER_ID_Jsonclick = "" ;
      edtTBM02_CRT_USER_ID_Enabled = 1 ;
      edtTBM02_CRT_DATETIME_Jsonclick = "" ;
      edtTBM02_CRT_DATETIME_Enabled = 1 ;
      edtTBM02_DEL_FLG_Jsonclick = "" ;
      edtTBM02_DEL_FLG_Enabled = 1 ;
      edtTBM02_ORDER_Jsonclick = "" ;
      edtTBM02_ORDER_Enabled = 1 ;
      edtTBM02_NOTE_Enabled = 1 ;
      edtTBM02_DOM_GRP_NM_Jsonclick = "" ;
      edtTBM02_DOM_GRP_NM_Enabled = 1 ;
      edtTBM02_DOM_JNM_Jsonclick = "" ;
      edtTBM02_DOM_JNM_Enabled = 1 ;
      edtTBM02_DOM_ENM_Jsonclick = "" ;
      edtTBM02_DOM_ENM_Enabled = 1 ;
      edtTBM02_DOM_CD_Jsonclick = "" ;
      edtTBM02_DOM_CD_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm02_crt_user_id1338( String Gx_mode )
   {
      GXt_char1 = A617TBM02_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm02_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      A617TBM02_CRT_USER_ID = GXt_char1 ;
      n617TBM02_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A617TBM02_CRT_USER_ID", A617TBM02_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A617TBM02_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm02_upd_user_id1338( String Gx_mode )
   {
      GXt_char1 = A620TBM02_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tbm02_cdisc_domain_impl.this.GXt_char1 = GXv_char2[0] ;
      A620TBM02_UPD_USER_ID = GXt_char1 ;
      n620TBM02_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A620TBM02_UPD_USER_ID", A620TBM02_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A620TBM02_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM02_DOM_ENM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm02_dom_cd( String GX_Parm1 ,
                                   java.util.Date GX_Parm2 ,
                                   String GX_Parm3 ,
                                   java.util.Date GX_Parm4 ,
                                   String GX_Parm5 ,
                                   long GX_Parm6 ,
                                   String GX_Parm7 ,
                                   String GX_Parm8 ,
                                   String GX_Parm9 ,
                                   String GX_Parm10 ,
                                   int GX_Parm11 ,
                                   String GX_Parm12 ,
                                   String GX_Parm13 ,
                                   String GX_Parm14 )
   {
      A49TBM02_DOM_CD = GX_Parm1 ;
      A616TBM02_CRT_DATETIME = GX_Parm2 ;
      n616TBM02_CRT_DATETIME = false ;
      A617TBM02_CRT_USER_ID = GX_Parm3 ;
      n617TBM02_CRT_USER_ID = false ;
      A619TBM02_UPD_DATETIME = GX_Parm4 ;
      n619TBM02_UPD_DATETIME = false ;
      A620TBM02_UPD_USER_ID = GX_Parm5 ;
      n620TBM02_UPD_USER_ID = false ;
      A622TBM02_UPD_CNT = GX_Parm6 ;
      n622TBM02_UPD_CNT = false ;
      A610TBM02_DOM_ENM = GX_Parm7 ;
      n610TBM02_DOM_ENM = false ;
      A611TBM02_DOM_JNM = GX_Parm8 ;
      n611TBM02_DOM_JNM = false ;
      A612TBM02_DOM_GRP_NM = GX_Parm9 ;
      n612TBM02_DOM_GRP_NM = false ;
      A613TBM02_NOTE = GX_Parm10 ;
      n613TBM02_NOTE = false ;
      A614TBM02_ORDER = GX_Parm11 ;
      n614TBM02_ORDER = false ;
      A615TBM02_DEL_FLG = GX_Parm12 ;
      n615TBM02_DEL_FLG = false ;
      A618TBM02_CRT_PROG_NM = GX_Parm13 ;
      n618TBM02_CRT_PROG_NM = false ;
      A621TBM02_UPD_PROG_NM = GX_Parm14 ;
      n621TBM02_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A616TBM02_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A617TBM02_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A619TBM02_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A620TBM02_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A622TBM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A610TBM02_DOM_ENM));
      isValidOutput.add(GXutil.rtrim( A611TBM02_DOM_JNM));
      isValidOutput.add(GXutil.rtrim( A612TBM02_DOM_GRP_NM));
      isValidOutput.add(GXutil.rtrim( A613TBM02_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A614TBM02_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A615TBM02_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A618TBM02_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A621TBM02_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z49TBM02_DOM_CD));
      isValidOutput.add(localUtil.ttoc( Z616TBM02_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z617TBM02_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z619TBM02_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z620TBM02_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z622TBM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z610TBM02_DOM_ENM));
      isValidOutput.add(GXutil.rtrim( Z611TBM02_DOM_JNM));
      isValidOutput.add(GXutil.rtrim( Z612TBM02_DOM_GRP_NM));
      isValidOutput.add(GXutil.rtrim( Z613TBM02_NOTE));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z614TBM02_ORDER, (byte)(5), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z615TBM02_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z618TBM02_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z621TBM02_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O622TBM02_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z49TBM02_DOM_CD = "" ;
      Z616TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z617TBM02_CRT_USER_ID = "" ;
      Z619TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z620TBM02_UPD_USER_ID = "" ;
      Z610TBM02_DOM_ENM = "" ;
      Z611TBM02_DOM_JNM = "" ;
      Z612TBM02_DOM_GRP_NM = "" ;
      Z613TBM02_NOTE = "" ;
      Z615TBM02_DEL_FLG = "" ;
      Z618TBM02_CRT_PROG_NM = "" ;
      Z621TBM02_UPD_PROG_NM = "" ;
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
      lblTextblocktbm02_dom_cd_Jsonclick = "" ;
      A49TBM02_DOM_CD = "" ;
      lblTextblocktbm02_dom_enm_Jsonclick = "" ;
      A610TBM02_DOM_ENM = "" ;
      lblTextblocktbm02_dom_jnm_Jsonclick = "" ;
      A611TBM02_DOM_JNM = "" ;
      lblTextblocktbm02_dom_grp_nm_Jsonclick = "" ;
      A612TBM02_DOM_GRP_NM = "" ;
      lblTextblocktbm02_note_Jsonclick = "" ;
      A613TBM02_NOTE = "" ;
      lblTextblocktbm02_order_Jsonclick = "" ;
      lblTextblocktbm02_del_flg_Jsonclick = "" ;
      A615TBM02_DEL_FLG = "" ;
      lblTextblocktbm02_crt_datetime_Jsonclick = "" ;
      A616TBM02_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm02_crt_user_id_Jsonclick = "" ;
      A617TBM02_CRT_USER_ID = "" ;
      lblTextblocktbm02_crt_prog_nm_Jsonclick = "" ;
      A618TBM02_CRT_PROG_NM = "" ;
      lblTextblocktbm02_upd_datetime_Jsonclick = "" ;
      A619TBM02_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm02_upd_user_id_Jsonclick = "" ;
      A620TBM02_UPD_USER_ID = "" ;
      lblTextblocktbm02_upd_prog_nm_Jsonclick = "" ;
      A621TBM02_UPD_PROG_NM = "" ;
      lblTextblocktbm02_upd_cnt_Jsonclick = "" ;
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
      T00134_A49TBM02_DOM_CD = new String[] {""} ;
      T00134_A616TBM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00134_n616TBM02_CRT_DATETIME = new boolean[] {false} ;
      T00134_A617TBM02_CRT_USER_ID = new String[] {""} ;
      T00134_n617TBM02_CRT_USER_ID = new boolean[] {false} ;
      T00134_A619TBM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00134_n619TBM02_UPD_DATETIME = new boolean[] {false} ;
      T00134_A620TBM02_UPD_USER_ID = new String[] {""} ;
      T00134_n620TBM02_UPD_USER_ID = new boolean[] {false} ;
      T00134_A622TBM02_UPD_CNT = new long[1] ;
      T00134_n622TBM02_UPD_CNT = new boolean[] {false} ;
      T00134_A610TBM02_DOM_ENM = new String[] {""} ;
      T00134_n610TBM02_DOM_ENM = new boolean[] {false} ;
      T00134_A611TBM02_DOM_JNM = new String[] {""} ;
      T00134_n611TBM02_DOM_JNM = new boolean[] {false} ;
      T00134_A612TBM02_DOM_GRP_NM = new String[] {""} ;
      T00134_n612TBM02_DOM_GRP_NM = new boolean[] {false} ;
      T00134_A613TBM02_NOTE = new String[] {""} ;
      T00134_n613TBM02_NOTE = new boolean[] {false} ;
      T00134_A614TBM02_ORDER = new int[1] ;
      T00134_n614TBM02_ORDER = new boolean[] {false} ;
      T00134_A615TBM02_DEL_FLG = new String[] {""} ;
      T00134_n615TBM02_DEL_FLG = new boolean[] {false} ;
      T00134_A618TBM02_CRT_PROG_NM = new String[] {""} ;
      T00134_n618TBM02_CRT_PROG_NM = new boolean[] {false} ;
      T00134_A621TBM02_UPD_PROG_NM = new String[] {""} ;
      T00134_n621TBM02_UPD_PROG_NM = new boolean[] {false} ;
      T00135_A49TBM02_DOM_CD = new String[] {""} ;
      T00133_A49TBM02_DOM_CD = new String[] {""} ;
      T00133_A616TBM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00133_n616TBM02_CRT_DATETIME = new boolean[] {false} ;
      T00133_A617TBM02_CRT_USER_ID = new String[] {""} ;
      T00133_n617TBM02_CRT_USER_ID = new boolean[] {false} ;
      T00133_A619TBM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00133_n619TBM02_UPD_DATETIME = new boolean[] {false} ;
      T00133_A620TBM02_UPD_USER_ID = new String[] {""} ;
      T00133_n620TBM02_UPD_USER_ID = new boolean[] {false} ;
      T00133_A622TBM02_UPD_CNT = new long[1] ;
      T00133_n622TBM02_UPD_CNT = new boolean[] {false} ;
      T00133_A610TBM02_DOM_ENM = new String[] {""} ;
      T00133_n610TBM02_DOM_ENM = new boolean[] {false} ;
      T00133_A611TBM02_DOM_JNM = new String[] {""} ;
      T00133_n611TBM02_DOM_JNM = new boolean[] {false} ;
      T00133_A612TBM02_DOM_GRP_NM = new String[] {""} ;
      T00133_n612TBM02_DOM_GRP_NM = new boolean[] {false} ;
      T00133_A613TBM02_NOTE = new String[] {""} ;
      T00133_n613TBM02_NOTE = new boolean[] {false} ;
      T00133_A614TBM02_ORDER = new int[1] ;
      T00133_n614TBM02_ORDER = new boolean[] {false} ;
      T00133_A615TBM02_DEL_FLG = new String[] {""} ;
      T00133_n615TBM02_DEL_FLG = new boolean[] {false} ;
      T00133_A618TBM02_CRT_PROG_NM = new String[] {""} ;
      T00133_n618TBM02_CRT_PROG_NM = new boolean[] {false} ;
      T00133_A621TBM02_UPD_PROG_NM = new String[] {""} ;
      T00133_n621TBM02_UPD_PROG_NM = new boolean[] {false} ;
      sMode38 = "" ;
      T00136_A49TBM02_DOM_CD = new String[] {""} ;
      T00137_A49TBM02_DOM_CD = new String[] {""} ;
      T00132_A49TBM02_DOM_CD = new String[] {""} ;
      T00132_A616TBM02_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00132_n616TBM02_CRT_DATETIME = new boolean[] {false} ;
      T00132_A617TBM02_CRT_USER_ID = new String[] {""} ;
      T00132_n617TBM02_CRT_USER_ID = new boolean[] {false} ;
      T00132_A619TBM02_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00132_n619TBM02_UPD_DATETIME = new boolean[] {false} ;
      T00132_A620TBM02_UPD_USER_ID = new String[] {""} ;
      T00132_n620TBM02_UPD_USER_ID = new boolean[] {false} ;
      T00132_A622TBM02_UPD_CNT = new long[1] ;
      T00132_n622TBM02_UPD_CNT = new boolean[] {false} ;
      T00132_A610TBM02_DOM_ENM = new String[] {""} ;
      T00132_n610TBM02_DOM_ENM = new boolean[] {false} ;
      T00132_A611TBM02_DOM_JNM = new String[] {""} ;
      T00132_n611TBM02_DOM_JNM = new boolean[] {false} ;
      T00132_A612TBM02_DOM_GRP_NM = new String[] {""} ;
      T00132_n612TBM02_DOM_GRP_NM = new boolean[] {false} ;
      T00132_A613TBM02_NOTE = new String[] {""} ;
      T00132_n613TBM02_NOTE = new boolean[] {false} ;
      T00132_A614TBM02_ORDER = new int[1] ;
      T00132_n614TBM02_ORDER = new boolean[] {false} ;
      T00132_A615TBM02_DEL_FLG = new String[] {""} ;
      T00132_n615TBM02_DEL_FLG = new boolean[] {false} ;
      T00132_A618TBM02_CRT_PROG_NM = new String[] {""} ;
      T00132_n618TBM02_CRT_PROG_NM = new boolean[] {false} ;
      T00132_A621TBM02_UPD_PROG_NM = new String[] {""} ;
      T00132_n621TBM02_UPD_PROG_NM = new boolean[] {false} ;
      T001311_A59TBM03_DOM_CD = new String[] {""} ;
      T001311_A60TBM03_DOM_VAR_NM = new String[] {""} ;
      T001312_A49TBM02_DOM_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm02_cdisc_domain__default(),
         new Object[] {
             new Object[] {
            T00132_A49TBM02_DOM_CD, T00132_A616TBM02_CRT_DATETIME, T00132_n616TBM02_CRT_DATETIME, T00132_A617TBM02_CRT_USER_ID, T00132_n617TBM02_CRT_USER_ID, T00132_A619TBM02_UPD_DATETIME, T00132_n619TBM02_UPD_DATETIME, T00132_A620TBM02_UPD_USER_ID, T00132_n620TBM02_UPD_USER_ID, T00132_A622TBM02_UPD_CNT,
            T00132_n622TBM02_UPD_CNT, T00132_A610TBM02_DOM_ENM, T00132_n610TBM02_DOM_ENM, T00132_A611TBM02_DOM_JNM, T00132_n611TBM02_DOM_JNM, T00132_A612TBM02_DOM_GRP_NM, T00132_n612TBM02_DOM_GRP_NM, T00132_A613TBM02_NOTE, T00132_n613TBM02_NOTE, T00132_A614TBM02_ORDER,
            T00132_n614TBM02_ORDER, T00132_A615TBM02_DEL_FLG, T00132_n615TBM02_DEL_FLG, T00132_A618TBM02_CRT_PROG_NM, T00132_n618TBM02_CRT_PROG_NM, T00132_A621TBM02_UPD_PROG_NM, T00132_n621TBM02_UPD_PROG_NM
            }
            , new Object[] {
            T00133_A49TBM02_DOM_CD, T00133_A616TBM02_CRT_DATETIME, T00133_n616TBM02_CRT_DATETIME, T00133_A617TBM02_CRT_USER_ID, T00133_n617TBM02_CRT_USER_ID, T00133_A619TBM02_UPD_DATETIME, T00133_n619TBM02_UPD_DATETIME, T00133_A620TBM02_UPD_USER_ID, T00133_n620TBM02_UPD_USER_ID, T00133_A622TBM02_UPD_CNT,
            T00133_n622TBM02_UPD_CNT, T00133_A610TBM02_DOM_ENM, T00133_n610TBM02_DOM_ENM, T00133_A611TBM02_DOM_JNM, T00133_n611TBM02_DOM_JNM, T00133_A612TBM02_DOM_GRP_NM, T00133_n612TBM02_DOM_GRP_NM, T00133_A613TBM02_NOTE, T00133_n613TBM02_NOTE, T00133_A614TBM02_ORDER,
            T00133_n614TBM02_ORDER, T00133_A615TBM02_DEL_FLG, T00133_n615TBM02_DEL_FLG, T00133_A618TBM02_CRT_PROG_NM, T00133_n618TBM02_CRT_PROG_NM, T00133_A621TBM02_UPD_PROG_NM, T00133_n621TBM02_UPD_PROG_NM
            }
            , new Object[] {
            T00134_A49TBM02_DOM_CD, T00134_A616TBM02_CRT_DATETIME, T00134_n616TBM02_CRT_DATETIME, T00134_A617TBM02_CRT_USER_ID, T00134_n617TBM02_CRT_USER_ID, T00134_A619TBM02_UPD_DATETIME, T00134_n619TBM02_UPD_DATETIME, T00134_A620TBM02_UPD_USER_ID, T00134_n620TBM02_UPD_USER_ID, T00134_A622TBM02_UPD_CNT,
            T00134_n622TBM02_UPD_CNT, T00134_A610TBM02_DOM_ENM, T00134_n610TBM02_DOM_ENM, T00134_A611TBM02_DOM_JNM, T00134_n611TBM02_DOM_JNM, T00134_A612TBM02_DOM_GRP_NM, T00134_n612TBM02_DOM_GRP_NM, T00134_A613TBM02_NOTE, T00134_n613TBM02_NOTE, T00134_A614TBM02_ORDER,
            T00134_n614TBM02_ORDER, T00134_A615TBM02_DEL_FLG, T00134_n615TBM02_DEL_FLG, T00134_A618TBM02_CRT_PROG_NM, T00134_n618TBM02_CRT_PROG_NM, T00134_A621TBM02_UPD_PROG_NM, T00134_n621TBM02_UPD_PROG_NM
            }
            , new Object[] {
            T00135_A49TBM02_DOM_CD
            }
            , new Object[] {
            T00136_A49TBM02_DOM_CD
            }
            , new Object[] {
            T00137_A49TBM02_DOM_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001311_A59TBM03_DOM_CD, T001311_A60TBM03_DOM_VAR_NM
            }
            , new Object[] {
            T001312_A49TBM02_DOM_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM02_CDISC_DOMAIN" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound38 ;
   private short Gx_err ;
   private int Z614TBM02_ORDER ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM02_DOM_CD_Enabled ;
   private int edtTBM02_DOM_ENM_Enabled ;
   private int edtTBM02_DOM_JNM_Enabled ;
   private int edtTBM02_DOM_GRP_NM_Enabled ;
   private int edtTBM02_NOTE_Enabled ;
   private int A614TBM02_ORDER ;
   private int edtTBM02_ORDER_Enabled ;
   private int edtTBM02_DEL_FLG_Enabled ;
   private int edtTBM02_CRT_DATETIME_Enabled ;
   private int edtTBM02_CRT_USER_ID_Enabled ;
   private int edtTBM02_CRT_PROG_NM_Enabled ;
   private int edtTBM02_UPD_DATETIME_Enabled ;
   private int edtTBM02_UPD_USER_ID_Enabled ;
   private int edtTBM02_UPD_PROG_NM_Enabled ;
   private int edtTBM02_UPD_CNT_Enabled ;
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
   private long Z622TBM02_UPD_CNT ;
   private long O622TBM02_UPD_CNT ;
   private long A622TBM02_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM02_DOM_CD_Internalname ;
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
   private String lblTextblocktbm02_dom_cd_Internalname ;
   private String lblTextblocktbm02_dom_cd_Jsonclick ;
   private String edtTBM02_DOM_CD_Jsonclick ;
   private String lblTextblocktbm02_dom_enm_Internalname ;
   private String lblTextblocktbm02_dom_enm_Jsonclick ;
   private String edtTBM02_DOM_ENM_Internalname ;
   private String edtTBM02_DOM_ENM_Jsonclick ;
   private String lblTextblocktbm02_dom_jnm_Internalname ;
   private String lblTextblocktbm02_dom_jnm_Jsonclick ;
   private String edtTBM02_DOM_JNM_Internalname ;
   private String edtTBM02_DOM_JNM_Jsonclick ;
   private String lblTextblocktbm02_dom_grp_nm_Internalname ;
   private String lblTextblocktbm02_dom_grp_nm_Jsonclick ;
   private String edtTBM02_DOM_GRP_NM_Internalname ;
   private String edtTBM02_DOM_GRP_NM_Jsonclick ;
   private String lblTextblocktbm02_note_Internalname ;
   private String lblTextblocktbm02_note_Jsonclick ;
   private String edtTBM02_NOTE_Internalname ;
   private String lblTextblocktbm02_order_Internalname ;
   private String lblTextblocktbm02_order_Jsonclick ;
   private String edtTBM02_ORDER_Internalname ;
   private String edtTBM02_ORDER_Jsonclick ;
   private String lblTextblocktbm02_del_flg_Internalname ;
   private String lblTextblocktbm02_del_flg_Jsonclick ;
   private String edtTBM02_DEL_FLG_Internalname ;
   private String edtTBM02_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm02_crt_datetime_Internalname ;
   private String lblTextblocktbm02_crt_datetime_Jsonclick ;
   private String edtTBM02_CRT_DATETIME_Internalname ;
   private String edtTBM02_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm02_crt_user_id_Internalname ;
   private String lblTextblocktbm02_crt_user_id_Jsonclick ;
   private String edtTBM02_CRT_USER_ID_Internalname ;
   private String edtTBM02_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm02_crt_prog_nm_Internalname ;
   private String lblTextblocktbm02_crt_prog_nm_Jsonclick ;
   private String edtTBM02_CRT_PROG_NM_Internalname ;
   private String edtTBM02_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm02_upd_datetime_Internalname ;
   private String lblTextblocktbm02_upd_datetime_Jsonclick ;
   private String edtTBM02_UPD_DATETIME_Internalname ;
   private String edtTBM02_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm02_upd_user_id_Internalname ;
   private String lblTextblocktbm02_upd_user_id_Jsonclick ;
   private String edtTBM02_UPD_USER_ID_Internalname ;
   private String edtTBM02_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm02_upd_prog_nm_Internalname ;
   private String lblTextblocktbm02_upd_prog_nm_Jsonclick ;
   private String edtTBM02_UPD_PROG_NM_Internalname ;
   private String edtTBM02_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm02_upd_cnt_Internalname ;
   private String lblTextblocktbm02_upd_cnt_Jsonclick ;
   private String edtTBM02_UPD_CNT_Internalname ;
   private String edtTBM02_UPD_CNT_Jsonclick ;
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
   private String sMode38 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z616TBM02_CRT_DATETIME ;
   private java.util.Date Z619TBM02_UPD_DATETIME ;
   private java.util.Date A616TBM02_CRT_DATETIME ;
   private java.util.Date A619TBM02_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n610TBM02_DOM_ENM ;
   private boolean n611TBM02_DOM_JNM ;
   private boolean n612TBM02_DOM_GRP_NM ;
   private boolean n613TBM02_NOTE ;
   private boolean n614TBM02_ORDER ;
   private boolean n615TBM02_DEL_FLG ;
   private boolean n616TBM02_CRT_DATETIME ;
   private boolean n617TBM02_CRT_USER_ID ;
   private boolean n618TBM02_CRT_PROG_NM ;
   private boolean n619TBM02_UPD_DATETIME ;
   private boolean n620TBM02_UPD_USER_ID ;
   private boolean n621TBM02_UPD_PROG_NM ;
   private boolean n622TBM02_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z49TBM02_DOM_CD ;
   private String Z617TBM02_CRT_USER_ID ;
   private String Z620TBM02_UPD_USER_ID ;
   private String Z610TBM02_DOM_ENM ;
   private String Z611TBM02_DOM_JNM ;
   private String Z612TBM02_DOM_GRP_NM ;
   private String Z613TBM02_NOTE ;
   private String Z615TBM02_DEL_FLG ;
   private String Z618TBM02_CRT_PROG_NM ;
   private String Z621TBM02_UPD_PROG_NM ;
   private String A49TBM02_DOM_CD ;
   private String A610TBM02_DOM_ENM ;
   private String A611TBM02_DOM_JNM ;
   private String A612TBM02_DOM_GRP_NM ;
   private String A613TBM02_NOTE ;
   private String A615TBM02_DEL_FLG ;
   private String A617TBM02_CRT_USER_ID ;
   private String A618TBM02_CRT_PROG_NM ;
   private String A620TBM02_UPD_USER_ID ;
   private String A621TBM02_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T00134_A49TBM02_DOM_CD ;
   private java.util.Date[] T00134_A616TBM02_CRT_DATETIME ;
   private boolean[] T00134_n616TBM02_CRT_DATETIME ;
   private String[] T00134_A617TBM02_CRT_USER_ID ;
   private boolean[] T00134_n617TBM02_CRT_USER_ID ;
   private java.util.Date[] T00134_A619TBM02_UPD_DATETIME ;
   private boolean[] T00134_n619TBM02_UPD_DATETIME ;
   private String[] T00134_A620TBM02_UPD_USER_ID ;
   private boolean[] T00134_n620TBM02_UPD_USER_ID ;
   private long[] T00134_A622TBM02_UPD_CNT ;
   private boolean[] T00134_n622TBM02_UPD_CNT ;
   private String[] T00134_A610TBM02_DOM_ENM ;
   private boolean[] T00134_n610TBM02_DOM_ENM ;
   private String[] T00134_A611TBM02_DOM_JNM ;
   private boolean[] T00134_n611TBM02_DOM_JNM ;
   private String[] T00134_A612TBM02_DOM_GRP_NM ;
   private boolean[] T00134_n612TBM02_DOM_GRP_NM ;
   private String[] T00134_A613TBM02_NOTE ;
   private boolean[] T00134_n613TBM02_NOTE ;
   private int[] T00134_A614TBM02_ORDER ;
   private boolean[] T00134_n614TBM02_ORDER ;
   private String[] T00134_A615TBM02_DEL_FLG ;
   private boolean[] T00134_n615TBM02_DEL_FLG ;
   private String[] T00134_A618TBM02_CRT_PROG_NM ;
   private boolean[] T00134_n618TBM02_CRT_PROG_NM ;
   private String[] T00134_A621TBM02_UPD_PROG_NM ;
   private boolean[] T00134_n621TBM02_UPD_PROG_NM ;
   private String[] T00135_A49TBM02_DOM_CD ;
   private String[] T00133_A49TBM02_DOM_CD ;
   private java.util.Date[] T00133_A616TBM02_CRT_DATETIME ;
   private boolean[] T00133_n616TBM02_CRT_DATETIME ;
   private String[] T00133_A617TBM02_CRT_USER_ID ;
   private boolean[] T00133_n617TBM02_CRT_USER_ID ;
   private java.util.Date[] T00133_A619TBM02_UPD_DATETIME ;
   private boolean[] T00133_n619TBM02_UPD_DATETIME ;
   private String[] T00133_A620TBM02_UPD_USER_ID ;
   private boolean[] T00133_n620TBM02_UPD_USER_ID ;
   private long[] T00133_A622TBM02_UPD_CNT ;
   private boolean[] T00133_n622TBM02_UPD_CNT ;
   private String[] T00133_A610TBM02_DOM_ENM ;
   private boolean[] T00133_n610TBM02_DOM_ENM ;
   private String[] T00133_A611TBM02_DOM_JNM ;
   private boolean[] T00133_n611TBM02_DOM_JNM ;
   private String[] T00133_A612TBM02_DOM_GRP_NM ;
   private boolean[] T00133_n612TBM02_DOM_GRP_NM ;
   private String[] T00133_A613TBM02_NOTE ;
   private boolean[] T00133_n613TBM02_NOTE ;
   private int[] T00133_A614TBM02_ORDER ;
   private boolean[] T00133_n614TBM02_ORDER ;
   private String[] T00133_A615TBM02_DEL_FLG ;
   private boolean[] T00133_n615TBM02_DEL_FLG ;
   private String[] T00133_A618TBM02_CRT_PROG_NM ;
   private boolean[] T00133_n618TBM02_CRT_PROG_NM ;
   private String[] T00133_A621TBM02_UPD_PROG_NM ;
   private boolean[] T00133_n621TBM02_UPD_PROG_NM ;
   private String[] T00136_A49TBM02_DOM_CD ;
   private String[] T00137_A49TBM02_DOM_CD ;
   private String[] T00132_A49TBM02_DOM_CD ;
   private java.util.Date[] T00132_A616TBM02_CRT_DATETIME ;
   private boolean[] T00132_n616TBM02_CRT_DATETIME ;
   private String[] T00132_A617TBM02_CRT_USER_ID ;
   private boolean[] T00132_n617TBM02_CRT_USER_ID ;
   private java.util.Date[] T00132_A619TBM02_UPD_DATETIME ;
   private boolean[] T00132_n619TBM02_UPD_DATETIME ;
   private String[] T00132_A620TBM02_UPD_USER_ID ;
   private boolean[] T00132_n620TBM02_UPD_USER_ID ;
   private long[] T00132_A622TBM02_UPD_CNT ;
   private boolean[] T00132_n622TBM02_UPD_CNT ;
   private String[] T00132_A610TBM02_DOM_ENM ;
   private boolean[] T00132_n610TBM02_DOM_ENM ;
   private String[] T00132_A611TBM02_DOM_JNM ;
   private boolean[] T00132_n611TBM02_DOM_JNM ;
   private String[] T00132_A612TBM02_DOM_GRP_NM ;
   private boolean[] T00132_n612TBM02_DOM_GRP_NM ;
   private String[] T00132_A613TBM02_NOTE ;
   private boolean[] T00132_n613TBM02_NOTE ;
   private int[] T00132_A614TBM02_ORDER ;
   private boolean[] T00132_n614TBM02_ORDER ;
   private String[] T00132_A615TBM02_DEL_FLG ;
   private boolean[] T00132_n615TBM02_DEL_FLG ;
   private String[] T00132_A618TBM02_CRT_PROG_NM ;
   private boolean[] T00132_n618TBM02_CRT_PROG_NM ;
   private String[] T00132_A621TBM02_UPD_PROG_NM ;
   private boolean[] T00132_n621TBM02_UPD_PROG_NM ;
   private String[] T001311_A59TBM03_DOM_CD ;
   private String[] T001311_A60TBM03_DOM_VAR_NM ;
   private String[] T001312_A49TBM02_DOM_CD ;
}

final  class tbm02_cdisc_domain__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00132", "SELECT `TBM02_DOM_CD`, `TBM02_CRT_DATETIME`, `TBM02_CRT_USER_ID`, `TBM02_UPD_DATETIME`, `TBM02_UPD_USER_ID`, `TBM02_UPD_CNT`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_NOTE`, `TBM02_ORDER`, `TBM02_DEL_FLG`, `TBM02_CRT_PROG_NM`, `TBM02_UPD_PROG_NM` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00133", "SELECT `TBM02_DOM_CD`, `TBM02_CRT_DATETIME`, `TBM02_CRT_USER_ID`, `TBM02_UPD_DATETIME`, `TBM02_UPD_USER_ID`, `TBM02_UPD_CNT`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_NOTE`, `TBM02_ORDER`, `TBM02_DEL_FLG`, `TBM02_CRT_PROG_NM`, `TBM02_UPD_PROG_NM` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00134", "SELECT TM1.`TBM02_DOM_CD`, TM1.`TBM02_CRT_DATETIME`, TM1.`TBM02_CRT_USER_ID`, TM1.`TBM02_UPD_DATETIME`, TM1.`TBM02_UPD_USER_ID`, TM1.`TBM02_UPD_CNT`, TM1.`TBM02_DOM_ENM`, TM1.`TBM02_DOM_JNM`, TM1.`TBM02_DOM_GRP_NM`, TM1.`TBM02_NOTE`, TM1.`TBM02_ORDER`, TM1.`TBM02_DEL_FLG`, TM1.`TBM02_CRT_PROG_NM`, TM1.`TBM02_UPD_PROG_NM` FROM `TBM02_CDISC_DOMAIN` TM1 WHERE TM1.`TBM02_DOM_CD` = ? ORDER BY TM1.`TBM02_DOM_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00135", "SELECT `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` WHERE `TBM02_DOM_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00136", "SELECT `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` WHERE ( `TBM02_DOM_CD` > ?) ORDER BY `TBM02_DOM_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00137", "SELECT `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` WHERE ( `TBM02_DOM_CD` < ?) ORDER BY `TBM02_DOM_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00138", "INSERT INTO `TBM02_CDISC_DOMAIN`(`TBM02_DOM_CD`, `TBM02_CRT_DATETIME`, `TBM02_CRT_USER_ID`, `TBM02_UPD_DATETIME`, `TBM02_UPD_USER_ID`, `TBM02_UPD_CNT`, `TBM02_DOM_ENM`, `TBM02_DOM_JNM`, `TBM02_DOM_GRP_NM`, `TBM02_NOTE`, `TBM02_ORDER`, `TBM02_DEL_FLG`, `TBM02_CRT_PROG_NM`, `TBM02_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00139", "UPDATE `TBM02_CDISC_DOMAIN` SET `TBM02_CRT_DATETIME`=?, `TBM02_CRT_USER_ID`=?, `TBM02_UPD_DATETIME`=?, `TBM02_UPD_USER_ID`=?, `TBM02_UPD_CNT`=?, `TBM02_DOM_ENM`=?, `TBM02_DOM_JNM`=?, `TBM02_DOM_GRP_NM`=?, `TBM02_NOTE`=?, `TBM02_ORDER`=?, `TBM02_DEL_FLG`=?, `TBM02_CRT_PROG_NM`=?, `TBM02_UPD_PROG_NM`=?  WHERE `TBM02_DOM_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T001310", "DELETE FROM `TBM02_CDISC_DOMAIN`  WHERE `TBM02_DOM_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T001311", "SELECT `TBM03_DOM_CD`, `TBM03_DOM_VAR_NM` FROM `TBM03_CDISC_ITEM` WHERE `TBM03_DOM_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001312", "SELECT `TBM02_DOM_CD` FROM `TBM02_CDISC_DOMAIN` ORDER BY `TBM02_DOM_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
               ((int[]) buf[19])[0] = rslt.getInt(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               ((String[]) buf[21])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getVarchar(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
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
               return;
            case 10 :
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
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
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
                  stmt.setVarchar(8, (String)parms[14], 50);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 50);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 1000);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(11, ((Number) parms[20]).intValue());
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
               stmt.setVarchar(14, (String)parms[26], 16, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 16, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 16);
               return;
      }
   }

}

