/*
               File: tbm08_auth_inp_lvl_impl
        Description: 権限別入力制御マスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:16:32.70
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm08_auth_inp_lvl_impl extends GXWebPanel
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
         Form.getMeta().addItem("description", "権限別入力制御マスタ", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setDefaultTheme("Style2");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public tbm08_auth_inp_lvl_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm08_auth_inp_lvl_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm08_auth_inp_lvl_impl.class ));
   }

   public tbm08_auth_inp_lvl_impl( int remoteHandle ,
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
         wb_table1_2_1G51( true) ;
      }
      return  ;
   }

   public void wb_table1_2_1G51e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm1G51( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_1G51( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_1G51( true) ;
      }
      return  ;
   }

   public void wb_table2_5_1G51e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "権限別入力制御マスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         wb_table3_28_1G51( true) ;
      }
      return  ;
   }

   public void wb_table3_28_1G51e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_1G51e( true) ;
      }
      else
      {
         wb_table1_2_1G51e( false) ;
      }
   }

   public void wb_table3_28_1G51( boolean wbgen )
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
         wb_table4_34_1G51( true) ;
      }
      return  ;
   }

   public void wb_table4_34_1G51e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM08_AUTH_INP_LVL.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM08_AUTH_INP_LVL.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_1G51e( true) ;
      }
      else
      {
         wb_table3_28_1G51e( false) ;
      }
   }

   public void wb_table4_34_1G51( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_auth_cd_Internalname, "権限コード", "", "", lblTextblocktbm08_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_AUTH_CD_Internalname, GXutil.rtrim( A191TBM08_AUTH_CD), GXutil.rtrim( localUtil.format( A191TBM08_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_michaku_crf_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_michaku_crf_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_MICHAKU_CRF_FLG_Internalname, GXutil.rtrim( A863TBM08_DM_MICHAKU_CRF_FLG), GXutil.rtrim( localUtil.format( A863TBM08_DM_MICHAKU_CRF_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_DM_MICHAKU_CRF_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_DM_MICHAKU_CRF_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_michaku_memo_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_michaku_memo_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_MICHAKU_MEMO_FLG_Internalname, GXutil.rtrim( A864TBM08_DM_MICHAKU_MEMO_FLG), GXutil.rtrim( localUtil.format( A864TBM08_DM_MICHAKU_MEMO_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_DM_MICHAKU_MEMO_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_DM_MICHAKU_MEMO_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_michaku_dm_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_michaku_dm_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_MICHAKU_DM_FLG_Internalname, GXutil.rtrim( A865TBM08_DM_MICHAKU_DM_FLG), GXutil.rtrim( localUtil.format( A865TBM08_DM_MICHAKU_DM_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_DM_MICHAKU_DM_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_DM_MICHAKU_DM_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_arri_crf_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_arri_crf_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_ARRI_CRF_FLG_Internalname, GXutil.rtrim( A866TBM08_DM_ARRI_CRF_FLG), GXutil.rtrim( localUtil.format( A866TBM08_DM_ARRI_CRF_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_DM_ARRI_CRF_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_DM_ARRI_CRF_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_arri_memo_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_arri_memo_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_ARRI_MEMO_FLG_Internalname, GXutil.rtrim( A867TBM08_DM_ARRI_MEMO_FLG), GXutil.rtrim( localUtil.format( A867TBM08_DM_ARRI_MEMO_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_DM_ARRI_MEMO_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_DM_ARRI_MEMO_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_arri_dm_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_arri_dm_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_ARRI_DM_FLG_Internalname, GXutil.rtrim( A868TBM08_DM_ARRI_DM_FLG), GXutil.rtrim( localUtil.format( A868TBM08_DM_ARRI_DM_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_DM_ARRI_DM_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_DM_ARRI_DM_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_kaijo_crf_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_kaijo_crf_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_KAIJO_CRF_FLG_Internalname, GXutil.rtrim( A869TBM08_DM_KAIJO_CRF_FLG), GXutil.rtrim( localUtil.format( A869TBM08_DM_KAIJO_CRF_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_DM_KAIJO_CRF_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_DM_KAIJO_CRF_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_kaijo_memo_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_kaijo_memo_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_KAIJO_MEMO_FLG_Internalname, GXutil.rtrim( A870TBM08_DM_KAIJO_MEMO_FLG), GXutil.rtrim( localUtil.format( A870TBM08_DM_KAIJO_MEMO_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_DM_KAIJO_MEMO_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_DM_KAIJO_MEMO_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_kaijo_dm_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_kaijo_dm_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_KAIJO_DM_FLG_Internalname, GXutil.rtrim( A871TBM08_DM_KAIJO_DM_FLG), GXutil.rtrim( localUtil.format( A871TBM08_DM_KAIJO_DM_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_DM_KAIJO_DM_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_DM_KAIJO_DM_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_icon_caption_Internalname, "アイコン文字", "", "", lblTextblocktbm08_icon_caption_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_ICON_CAPTION_Internalname, GXutil.rtrim( A881TBM08_ICON_CAPTION), GXutil.rtrim( localUtil.format( A881TBM08_ICON_CAPTION, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_ICON_CAPTION_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_ICON_CAPTION_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_icon_r_Internalname, "R", "", "", lblTextblocktbm08_icon_r_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_ICON_R_Internalname, GXutil.ltrim( localUtil.ntoc( A885TBM08_ICON_R, (byte)(4), (byte)(0), ".", "")), ((edtTBM08_ICON_R_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A885TBM08_ICON_R), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A885TBM08_ICON_R), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_ICON_R_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_ICON_R_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_icon_g_Internalname, "G", "", "", lblTextblocktbm08_icon_g_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_ICON_G_Internalname, GXutil.ltrim( localUtil.ntoc( A886TBM08_ICON_G, (byte)(4), (byte)(0), ".", "")), ((edtTBM08_ICON_G_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A886TBM08_ICON_G), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A886TBM08_ICON_G), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_ICON_G_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_ICON_G_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_icon_b_Internalname, "B", "", "", lblTextblocktbm08_icon_b_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_ICON_B_Internalname, GXutil.ltrim( localUtil.ntoc( A887TBM08_ICON_B, (byte)(4), (byte)(0), ".", "")), ((edtTBM08_ICON_B_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A887TBM08_ICON_B), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A887TBM08_ICON_B), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_ICON_B_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_ICON_B_Enabled, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm08_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DEL_FLG_Internalname, GXutil.rtrim( A872TBM08_DEL_FLG), GXutil.rtrim( localUtil.format( A872TBM08_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm08_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM08_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_CRT_DATETIME_Internalname, localUtil.format(A873TBM08_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A873TBM08_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM08_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM08_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_crt_user_id_Internalname, "ID", "", "", lblTextblocktbm08_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_CRT_USER_ID_Internalname, GXutil.rtrim( A874TBM08_CRT_USER_ID), GXutil.rtrim( localUtil.format( A874TBM08_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(119);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm08_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_CRT_PROG_NM_Internalname, GXutil.rtrim( A875TBM08_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A875TBM08_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(124);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm08_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 129,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTBM08_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_UPD_DATETIME_Internalname, localUtil.format(A876TBM08_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A876TBM08_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(129);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM08_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTBM08_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_upd_user_id_Internalname, "ID", "", "", lblTextblocktbm08_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_UPD_USER_ID_Internalname, GXutil.rtrim( A877TBM08_UPD_USER_ID), GXutil.rtrim( localUtil.format( A877TBM08_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(134);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm08_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_UPD_PROG_NM_Internalname, GXutil.rtrim( A878TBM08_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A878TBM08_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_upd_count_Internalname, "更新カウント", "", "", lblTextblocktbm08_upd_count_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_UPD_COUNT_Internalname, GXutil.ltrim( localUtil.ntoc( A879TBM08_UPD_COUNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM08_UPD_COUNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A879TBM08_UPD_COUNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A879TBM08_UPD_COUNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTBM08_UPD_COUNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTBM08_UPD_COUNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_1G51e( true) ;
      }
      else
      {
         wb_table4_34_1G51e( false) ;
      }
   }

   public void wb_table2_5_1G51( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TBM08_AUTH_INP_LVL.htm");
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
         wb_table2_5_1G51e( true) ;
      }
      else
      {
         wb_table2_5_1G51e( false) ;
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
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            A191TBM08_AUTH_CD = httpContext.cgiGet( edtTBM08_AUTH_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A191TBM08_AUTH_CD", A191TBM08_AUTH_CD);
            A863TBM08_DM_MICHAKU_CRF_FLG = httpContext.cgiGet( edtTBM08_DM_MICHAKU_CRF_FLG_Internalname) ;
            n863TBM08_DM_MICHAKU_CRF_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A863TBM08_DM_MICHAKU_CRF_FLG", A863TBM08_DM_MICHAKU_CRF_FLG);
            n863TBM08_DM_MICHAKU_CRF_FLG = ((GXutil.strcmp("", A863TBM08_DM_MICHAKU_CRF_FLG)==0) ? true : false) ;
            A864TBM08_DM_MICHAKU_MEMO_FLG = httpContext.cgiGet( edtTBM08_DM_MICHAKU_MEMO_FLG_Internalname) ;
            n864TBM08_DM_MICHAKU_MEMO_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A864TBM08_DM_MICHAKU_MEMO_FLG", A864TBM08_DM_MICHAKU_MEMO_FLG);
            n864TBM08_DM_MICHAKU_MEMO_FLG = ((GXutil.strcmp("", A864TBM08_DM_MICHAKU_MEMO_FLG)==0) ? true : false) ;
            A865TBM08_DM_MICHAKU_DM_FLG = httpContext.cgiGet( edtTBM08_DM_MICHAKU_DM_FLG_Internalname) ;
            n865TBM08_DM_MICHAKU_DM_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A865TBM08_DM_MICHAKU_DM_FLG", A865TBM08_DM_MICHAKU_DM_FLG);
            n865TBM08_DM_MICHAKU_DM_FLG = ((GXutil.strcmp("", A865TBM08_DM_MICHAKU_DM_FLG)==0) ? true : false) ;
            A866TBM08_DM_ARRI_CRF_FLG = httpContext.cgiGet( edtTBM08_DM_ARRI_CRF_FLG_Internalname) ;
            n866TBM08_DM_ARRI_CRF_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A866TBM08_DM_ARRI_CRF_FLG", A866TBM08_DM_ARRI_CRF_FLG);
            n866TBM08_DM_ARRI_CRF_FLG = ((GXutil.strcmp("", A866TBM08_DM_ARRI_CRF_FLG)==0) ? true : false) ;
            A867TBM08_DM_ARRI_MEMO_FLG = httpContext.cgiGet( edtTBM08_DM_ARRI_MEMO_FLG_Internalname) ;
            n867TBM08_DM_ARRI_MEMO_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A867TBM08_DM_ARRI_MEMO_FLG", A867TBM08_DM_ARRI_MEMO_FLG);
            n867TBM08_DM_ARRI_MEMO_FLG = ((GXutil.strcmp("", A867TBM08_DM_ARRI_MEMO_FLG)==0) ? true : false) ;
            A868TBM08_DM_ARRI_DM_FLG = httpContext.cgiGet( edtTBM08_DM_ARRI_DM_FLG_Internalname) ;
            n868TBM08_DM_ARRI_DM_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A868TBM08_DM_ARRI_DM_FLG", A868TBM08_DM_ARRI_DM_FLG);
            n868TBM08_DM_ARRI_DM_FLG = ((GXutil.strcmp("", A868TBM08_DM_ARRI_DM_FLG)==0) ? true : false) ;
            A869TBM08_DM_KAIJO_CRF_FLG = httpContext.cgiGet( edtTBM08_DM_KAIJO_CRF_FLG_Internalname) ;
            n869TBM08_DM_KAIJO_CRF_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A869TBM08_DM_KAIJO_CRF_FLG", A869TBM08_DM_KAIJO_CRF_FLG);
            n869TBM08_DM_KAIJO_CRF_FLG = ((GXutil.strcmp("", A869TBM08_DM_KAIJO_CRF_FLG)==0) ? true : false) ;
            A870TBM08_DM_KAIJO_MEMO_FLG = httpContext.cgiGet( edtTBM08_DM_KAIJO_MEMO_FLG_Internalname) ;
            n870TBM08_DM_KAIJO_MEMO_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A870TBM08_DM_KAIJO_MEMO_FLG", A870TBM08_DM_KAIJO_MEMO_FLG);
            n870TBM08_DM_KAIJO_MEMO_FLG = ((GXutil.strcmp("", A870TBM08_DM_KAIJO_MEMO_FLG)==0) ? true : false) ;
            A871TBM08_DM_KAIJO_DM_FLG = httpContext.cgiGet( edtTBM08_DM_KAIJO_DM_FLG_Internalname) ;
            n871TBM08_DM_KAIJO_DM_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A871TBM08_DM_KAIJO_DM_FLG", A871TBM08_DM_KAIJO_DM_FLG);
            n871TBM08_DM_KAIJO_DM_FLG = ((GXutil.strcmp("", A871TBM08_DM_KAIJO_DM_FLG)==0) ? true : false) ;
            A881TBM08_ICON_CAPTION = httpContext.cgiGet( edtTBM08_ICON_CAPTION_Internalname) ;
            n881TBM08_ICON_CAPTION = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A881TBM08_ICON_CAPTION", A881TBM08_ICON_CAPTION);
            n881TBM08_ICON_CAPTION = ((GXutil.strcmp("", A881TBM08_ICON_CAPTION)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_R_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_R_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM08_ICON_R");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_ICON_R_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A885TBM08_ICON_R = (short)(0) ;
               n885TBM08_ICON_R = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A885TBM08_ICON_R", GXutil.ltrim( GXutil.str( A885TBM08_ICON_R, 4, 0)));
            }
            else
            {
               A885TBM08_ICON_R = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_R_Internalname), ".", ",")) ;
               n885TBM08_ICON_R = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A885TBM08_ICON_R", GXutil.ltrim( GXutil.str( A885TBM08_ICON_R, 4, 0)));
            }
            n885TBM08_ICON_R = ((0==A885TBM08_ICON_R) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_G_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_G_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM08_ICON_G");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_ICON_G_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A886TBM08_ICON_G = (short)(0) ;
               n886TBM08_ICON_G = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A886TBM08_ICON_G", GXutil.ltrim( GXutil.str( A886TBM08_ICON_G, 4, 0)));
            }
            else
            {
               A886TBM08_ICON_G = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_G_Internalname), ".", ",")) ;
               n886TBM08_ICON_G = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A886TBM08_ICON_G", GXutil.ltrim( GXutil.str( A886TBM08_ICON_G, 4, 0)));
            }
            n886TBM08_ICON_G = ((0==A886TBM08_ICON_G) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_B_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_B_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM08_ICON_B");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_ICON_B_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A887TBM08_ICON_B = (short)(0) ;
               n887TBM08_ICON_B = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A887TBM08_ICON_B", GXutil.ltrim( GXutil.str( A887TBM08_ICON_B, 4, 0)));
            }
            else
            {
               A887TBM08_ICON_B = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_B_Internalname), ".", ",")) ;
               n887TBM08_ICON_B = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A887TBM08_ICON_B", GXutil.ltrim( GXutil.str( A887TBM08_ICON_B, 4, 0)));
            }
            n887TBM08_ICON_B = ((0==A887TBM08_ICON_B) ? true : false) ;
            A872TBM08_DEL_FLG = httpContext.cgiGet( edtTBM08_DEL_FLG_Internalname) ;
            n872TBM08_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A872TBM08_DEL_FLG", A872TBM08_DEL_FLG);
            n872TBM08_DEL_FLG = ((GXutil.strcmp("", A872TBM08_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM08_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM08_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A873TBM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n873TBM08_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A873TBM08_CRT_DATETIME", localUtil.ttoc( A873TBM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A873TBM08_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM08_CRT_DATETIME_Internalname)) ;
               n873TBM08_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A873TBM08_CRT_DATETIME", localUtil.ttoc( A873TBM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n873TBM08_CRT_DATETIME = (GXutil.nullDate().equals(A873TBM08_CRT_DATETIME) ? true : false) ;
            A874TBM08_CRT_USER_ID = httpContext.cgiGet( edtTBM08_CRT_USER_ID_Internalname) ;
            n874TBM08_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A874TBM08_CRT_USER_ID", A874TBM08_CRT_USER_ID);
            n874TBM08_CRT_USER_ID = ((GXutil.strcmp("", A874TBM08_CRT_USER_ID)==0) ? true : false) ;
            A875TBM08_CRT_PROG_NM = httpContext.cgiGet( edtTBM08_CRT_PROG_NM_Internalname) ;
            n875TBM08_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A875TBM08_CRT_PROG_NM", A875TBM08_CRT_PROG_NM);
            n875TBM08_CRT_PROG_NM = ((GXutil.strcmp("", A875TBM08_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM08_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TBM08_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A876TBM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n876TBM08_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A876TBM08_UPD_DATETIME", localUtil.ttoc( A876TBM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A876TBM08_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM08_UPD_DATETIME_Internalname)) ;
               n876TBM08_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A876TBM08_UPD_DATETIME", localUtil.ttoc( A876TBM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n876TBM08_UPD_DATETIME = (GXutil.nullDate().equals(A876TBM08_UPD_DATETIME) ? true : false) ;
            A877TBM08_UPD_USER_ID = httpContext.cgiGet( edtTBM08_UPD_USER_ID_Internalname) ;
            n877TBM08_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A877TBM08_UPD_USER_ID", A877TBM08_UPD_USER_ID);
            n877TBM08_UPD_USER_ID = ((GXutil.strcmp("", A877TBM08_UPD_USER_ID)==0) ? true : false) ;
            A878TBM08_UPD_PROG_NM = httpContext.cgiGet( edtTBM08_UPD_PROG_NM_Internalname) ;
            n878TBM08_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A878TBM08_UPD_PROG_NM", A878TBM08_UPD_PROG_NM);
            n878TBM08_UPD_PROG_NM = ((GXutil.strcmp("", A878TBM08_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_UPD_COUNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_UPD_COUNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM08_UPD_COUNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_UPD_COUNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A879TBM08_UPD_COUNT = 0 ;
               n879TBM08_UPD_COUNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A879TBM08_UPD_COUNT", GXutil.ltrim( GXutil.str( A879TBM08_UPD_COUNT, 10, 0)));
            }
            else
            {
               A879TBM08_UPD_COUNT = localUtil.ctol( httpContext.cgiGet( edtTBM08_UPD_COUNT_Internalname), ".", ",") ;
               n879TBM08_UPD_COUNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A879TBM08_UPD_COUNT", GXutil.ltrim( GXutil.str( A879TBM08_UPD_COUNT, 10, 0)));
            }
            n879TBM08_UPD_COUNT = ((0==A879TBM08_UPD_COUNT) ? true : false) ;
            /* Read saved values. */
            Z191TBM08_AUTH_CD = httpContext.cgiGet( "Z191TBM08_AUTH_CD") ;
            Z863TBM08_DM_MICHAKU_CRF_FLG = httpContext.cgiGet( "Z863TBM08_DM_MICHAKU_CRF_FLG") ;
            n863TBM08_DM_MICHAKU_CRF_FLG = ((GXutil.strcmp("", A863TBM08_DM_MICHAKU_CRF_FLG)==0) ? true : false) ;
            Z864TBM08_DM_MICHAKU_MEMO_FLG = httpContext.cgiGet( "Z864TBM08_DM_MICHAKU_MEMO_FLG") ;
            n864TBM08_DM_MICHAKU_MEMO_FLG = ((GXutil.strcmp("", A864TBM08_DM_MICHAKU_MEMO_FLG)==0) ? true : false) ;
            Z865TBM08_DM_MICHAKU_DM_FLG = httpContext.cgiGet( "Z865TBM08_DM_MICHAKU_DM_FLG") ;
            n865TBM08_DM_MICHAKU_DM_FLG = ((GXutil.strcmp("", A865TBM08_DM_MICHAKU_DM_FLG)==0) ? true : false) ;
            Z866TBM08_DM_ARRI_CRF_FLG = httpContext.cgiGet( "Z866TBM08_DM_ARRI_CRF_FLG") ;
            n866TBM08_DM_ARRI_CRF_FLG = ((GXutil.strcmp("", A866TBM08_DM_ARRI_CRF_FLG)==0) ? true : false) ;
            Z867TBM08_DM_ARRI_MEMO_FLG = httpContext.cgiGet( "Z867TBM08_DM_ARRI_MEMO_FLG") ;
            n867TBM08_DM_ARRI_MEMO_FLG = ((GXutil.strcmp("", A867TBM08_DM_ARRI_MEMO_FLG)==0) ? true : false) ;
            Z868TBM08_DM_ARRI_DM_FLG = httpContext.cgiGet( "Z868TBM08_DM_ARRI_DM_FLG") ;
            n868TBM08_DM_ARRI_DM_FLG = ((GXutil.strcmp("", A868TBM08_DM_ARRI_DM_FLG)==0) ? true : false) ;
            Z869TBM08_DM_KAIJO_CRF_FLG = httpContext.cgiGet( "Z869TBM08_DM_KAIJO_CRF_FLG") ;
            n869TBM08_DM_KAIJO_CRF_FLG = ((GXutil.strcmp("", A869TBM08_DM_KAIJO_CRF_FLG)==0) ? true : false) ;
            Z870TBM08_DM_KAIJO_MEMO_FLG = httpContext.cgiGet( "Z870TBM08_DM_KAIJO_MEMO_FLG") ;
            n870TBM08_DM_KAIJO_MEMO_FLG = ((GXutil.strcmp("", A870TBM08_DM_KAIJO_MEMO_FLG)==0) ? true : false) ;
            Z871TBM08_DM_KAIJO_DM_FLG = httpContext.cgiGet( "Z871TBM08_DM_KAIJO_DM_FLG") ;
            n871TBM08_DM_KAIJO_DM_FLG = ((GXutil.strcmp("", A871TBM08_DM_KAIJO_DM_FLG)==0) ? true : false) ;
            Z881TBM08_ICON_CAPTION = httpContext.cgiGet( "Z881TBM08_ICON_CAPTION") ;
            n881TBM08_ICON_CAPTION = ((GXutil.strcmp("", A881TBM08_ICON_CAPTION)==0) ? true : false) ;
            Z885TBM08_ICON_R = (short)(localUtil.ctol( httpContext.cgiGet( "Z885TBM08_ICON_R"), ".", ",")) ;
            n885TBM08_ICON_R = ((0==A885TBM08_ICON_R) ? true : false) ;
            Z886TBM08_ICON_G = (short)(localUtil.ctol( httpContext.cgiGet( "Z886TBM08_ICON_G"), ".", ",")) ;
            n886TBM08_ICON_G = ((0==A886TBM08_ICON_G) ? true : false) ;
            Z887TBM08_ICON_B = (short)(localUtil.ctol( httpContext.cgiGet( "Z887TBM08_ICON_B"), ".", ",")) ;
            n887TBM08_ICON_B = ((0==A887TBM08_ICON_B) ? true : false) ;
            Z872TBM08_DEL_FLG = httpContext.cgiGet( "Z872TBM08_DEL_FLG") ;
            n872TBM08_DEL_FLG = ((GXutil.strcmp("", A872TBM08_DEL_FLG)==0) ? true : false) ;
            Z873TBM08_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z873TBM08_CRT_DATETIME"), 0) ;
            n873TBM08_CRT_DATETIME = (GXutil.nullDate().equals(A873TBM08_CRT_DATETIME) ? true : false) ;
            Z874TBM08_CRT_USER_ID = httpContext.cgiGet( "Z874TBM08_CRT_USER_ID") ;
            n874TBM08_CRT_USER_ID = ((GXutil.strcmp("", A874TBM08_CRT_USER_ID)==0) ? true : false) ;
            Z875TBM08_CRT_PROG_NM = httpContext.cgiGet( "Z875TBM08_CRT_PROG_NM") ;
            n875TBM08_CRT_PROG_NM = ((GXutil.strcmp("", A875TBM08_CRT_PROG_NM)==0) ? true : false) ;
            Z876TBM08_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z876TBM08_UPD_DATETIME"), 0) ;
            n876TBM08_UPD_DATETIME = (GXutil.nullDate().equals(A876TBM08_UPD_DATETIME) ? true : false) ;
            Z877TBM08_UPD_USER_ID = httpContext.cgiGet( "Z877TBM08_UPD_USER_ID") ;
            n877TBM08_UPD_USER_ID = ((GXutil.strcmp("", A877TBM08_UPD_USER_ID)==0) ? true : false) ;
            Z878TBM08_UPD_PROG_NM = httpContext.cgiGet( "Z878TBM08_UPD_PROG_NM") ;
            n878TBM08_UPD_PROG_NM = ((GXutil.strcmp("", A878TBM08_UPD_PROG_NM)==0) ? true : false) ;
            Z879TBM08_UPD_COUNT = localUtil.ctol( httpContext.cgiGet( "Z879TBM08_UPD_COUNT"), ".", ",") ;
            n879TBM08_UPD_COUNT = ((0==A879TBM08_UPD_COUNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
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
               A191TBM08_AUTH_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A191TBM08_AUTH_CD", A191TBM08_AUTH_CD);
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
                  if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
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
            initAll1G51( ) ;
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
      disableAttributes1G51( ) ;
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

   public void resetCaption1G0( )
   {
   }

   public void zm1G51( int GX_JID )
   {
      if ( ( GX_JID == 3 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z863TBM08_DM_MICHAKU_CRF_FLG = T001G3_A863TBM08_DM_MICHAKU_CRF_FLG[0] ;
            Z864TBM08_DM_MICHAKU_MEMO_FLG = T001G3_A864TBM08_DM_MICHAKU_MEMO_FLG[0] ;
            Z865TBM08_DM_MICHAKU_DM_FLG = T001G3_A865TBM08_DM_MICHAKU_DM_FLG[0] ;
            Z866TBM08_DM_ARRI_CRF_FLG = T001G3_A866TBM08_DM_ARRI_CRF_FLG[0] ;
            Z867TBM08_DM_ARRI_MEMO_FLG = T001G3_A867TBM08_DM_ARRI_MEMO_FLG[0] ;
            Z868TBM08_DM_ARRI_DM_FLG = T001G3_A868TBM08_DM_ARRI_DM_FLG[0] ;
            Z869TBM08_DM_KAIJO_CRF_FLG = T001G3_A869TBM08_DM_KAIJO_CRF_FLG[0] ;
            Z870TBM08_DM_KAIJO_MEMO_FLG = T001G3_A870TBM08_DM_KAIJO_MEMO_FLG[0] ;
            Z871TBM08_DM_KAIJO_DM_FLG = T001G3_A871TBM08_DM_KAIJO_DM_FLG[0] ;
            Z881TBM08_ICON_CAPTION = T001G3_A881TBM08_ICON_CAPTION[0] ;
            Z885TBM08_ICON_R = T001G3_A885TBM08_ICON_R[0] ;
            Z886TBM08_ICON_G = T001G3_A886TBM08_ICON_G[0] ;
            Z887TBM08_ICON_B = T001G3_A887TBM08_ICON_B[0] ;
            Z872TBM08_DEL_FLG = T001G3_A872TBM08_DEL_FLG[0] ;
            Z873TBM08_CRT_DATETIME = T001G3_A873TBM08_CRT_DATETIME[0] ;
            Z874TBM08_CRT_USER_ID = T001G3_A874TBM08_CRT_USER_ID[0] ;
            Z875TBM08_CRT_PROG_NM = T001G3_A875TBM08_CRT_PROG_NM[0] ;
            Z876TBM08_UPD_DATETIME = T001G3_A876TBM08_UPD_DATETIME[0] ;
            Z877TBM08_UPD_USER_ID = T001G3_A877TBM08_UPD_USER_ID[0] ;
            Z878TBM08_UPD_PROG_NM = T001G3_A878TBM08_UPD_PROG_NM[0] ;
            Z879TBM08_UPD_COUNT = T001G3_A879TBM08_UPD_COUNT[0] ;
         }
         else
         {
            Z863TBM08_DM_MICHAKU_CRF_FLG = A863TBM08_DM_MICHAKU_CRF_FLG ;
            Z864TBM08_DM_MICHAKU_MEMO_FLG = A864TBM08_DM_MICHAKU_MEMO_FLG ;
            Z865TBM08_DM_MICHAKU_DM_FLG = A865TBM08_DM_MICHAKU_DM_FLG ;
            Z866TBM08_DM_ARRI_CRF_FLG = A866TBM08_DM_ARRI_CRF_FLG ;
            Z867TBM08_DM_ARRI_MEMO_FLG = A867TBM08_DM_ARRI_MEMO_FLG ;
            Z868TBM08_DM_ARRI_DM_FLG = A868TBM08_DM_ARRI_DM_FLG ;
            Z869TBM08_DM_KAIJO_CRF_FLG = A869TBM08_DM_KAIJO_CRF_FLG ;
            Z870TBM08_DM_KAIJO_MEMO_FLG = A870TBM08_DM_KAIJO_MEMO_FLG ;
            Z871TBM08_DM_KAIJO_DM_FLG = A871TBM08_DM_KAIJO_DM_FLG ;
            Z881TBM08_ICON_CAPTION = A881TBM08_ICON_CAPTION ;
            Z885TBM08_ICON_R = A885TBM08_ICON_R ;
            Z886TBM08_ICON_G = A886TBM08_ICON_G ;
            Z887TBM08_ICON_B = A887TBM08_ICON_B ;
            Z872TBM08_DEL_FLG = A872TBM08_DEL_FLG ;
            Z873TBM08_CRT_DATETIME = A873TBM08_CRT_DATETIME ;
            Z874TBM08_CRT_USER_ID = A874TBM08_CRT_USER_ID ;
            Z875TBM08_CRT_PROG_NM = A875TBM08_CRT_PROG_NM ;
            Z876TBM08_UPD_DATETIME = A876TBM08_UPD_DATETIME ;
            Z877TBM08_UPD_USER_ID = A877TBM08_UPD_USER_ID ;
            Z878TBM08_UPD_PROG_NM = A878TBM08_UPD_PROG_NM ;
            Z879TBM08_UPD_COUNT = A879TBM08_UPD_COUNT ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z191TBM08_AUTH_CD = A191TBM08_AUTH_CD ;
         Z863TBM08_DM_MICHAKU_CRF_FLG = A863TBM08_DM_MICHAKU_CRF_FLG ;
         Z864TBM08_DM_MICHAKU_MEMO_FLG = A864TBM08_DM_MICHAKU_MEMO_FLG ;
         Z865TBM08_DM_MICHAKU_DM_FLG = A865TBM08_DM_MICHAKU_DM_FLG ;
         Z866TBM08_DM_ARRI_CRF_FLG = A866TBM08_DM_ARRI_CRF_FLG ;
         Z867TBM08_DM_ARRI_MEMO_FLG = A867TBM08_DM_ARRI_MEMO_FLG ;
         Z868TBM08_DM_ARRI_DM_FLG = A868TBM08_DM_ARRI_DM_FLG ;
         Z869TBM08_DM_KAIJO_CRF_FLG = A869TBM08_DM_KAIJO_CRF_FLG ;
         Z870TBM08_DM_KAIJO_MEMO_FLG = A870TBM08_DM_KAIJO_MEMO_FLG ;
         Z871TBM08_DM_KAIJO_DM_FLG = A871TBM08_DM_KAIJO_DM_FLG ;
         Z881TBM08_ICON_CAPTION = A881TBM08_ICON_CAPTION ;
         Z885TBM08_ICON_R = A885TBM08_ICON_R ;
         Z886TBM08_ICON_G = A886TBM08_ICON_G ;
         Z887TBM08_ICON_B = A887TBM08_ICON_B ;
         Z872TBM08_DEL_FLG = A872TBM08_DEL_FLG ;
         Z873TBM08_CRT_DATETIME = A873TBM08_CRT_DATETIME ;
         Z874TBM08_CRT_USER_ID = A874TBM08_CRT_USER_ID ;
         Z875TBM08_CRT_PROG_NM = A875TBM08_CRT_PROG_NM ;
         Z876TBM08_UPD_DATETIME = A876TBM08_UPD_DATETIME ;
         Z877TBM08_UPD_USER_ID = A877TBM08_UPD_USER_ID ;
         Z878TBM08_UPD_PROG_NM = A878TBM08_UPD_PROG_NM ;
         Z879TBM08_UPD_COUNT = A879TBM08_UPD_COUNT ;
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

   public void load1G51( )
   {
      /* Using cursor T001G4 */
      pr_default.execute(2, new Object[] {A191TBM08_AUTH_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound51 = (short)(1) ;
         A863TBM08_DM_MICHAKU_CRF_FLG = T001G4_A863TBM08_DM_MICHAKU_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A863TBM08_DM_MICHAKU_CRF_FLG", A863TBM08_DM_MICHAKU_CRF_FLG);
         n863TBM08_DM_MICHAKU_CRF_FLG = T001G4_n863TBM08_DM_MICHAKU_CRF_FLG[0] ;
         A864TBM08_DM_MICHAKU_MEMO_FLG = T001G4_A864TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864TBM08_DM_MICHAKU_MEMO_FLG", A864TBM08_DM_MICHAKU_MEMO_FLG);
         n864TBM08_DM_MICHAKU_MEMO_FLG = T001G4_n864TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         A865TBM08_DM_MICHAKU_DM_FLG = T001G4_A865TBM08_DM_MICHAKU_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A865TBM08_DM_MICHAKU_DM_FLG", A865TBM08_DM_MICHAKU_DM_FLG);
         n865TBM08_DM_MICHAKU_DM_FLG = T001G4_n865TBM08_DM_MICHAKU_DM_FLG[0] ;
         A866TBM08_DM_ARRI_CRF_FLG = T001G4_A866TBM08_DM_ARRI_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A866TBM08_DM_ARRI_CRF_FLG", A866TBM08_DM_ARRI_CRF_FLG);
         n866TBM08_DM_ARRI_CRF_FLG = T001G4_n866TBM08_DM_ARRI_CRF_FLG[0] ;
         A867TBM08_DM_ARRI_MEMO_FLG = T001G4_A867TBM08_DM_ARRI_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A867TBM08_DM_ARRI_MEMO_FLG", A867TBM08_DM_ARRI_MEMO_FLG);
         n867TBM08_DM_ARRI_MEMO_FLG = T001G4_n867TBM08_DM_ARRI_MEMO_FLG[0] ;
         A868TBM08_DM_ARRI_DM_FLG = T001G4_A868TBM08_DM_ARRI_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A868TBM08_DM_ARRI_DM_FLG", A868TBM08_DM_ARRI_DM_FLG);
         n868TBM08_DM_ARRI_DM_FLG = T001G4_n868TBM08_DM_ARRI_DM_FLG[0] ;
         A869TBM08_DM_KAIJO_CRF_FLG = T001G4_A869TBM08_DM_KAIJO_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A869TBM08_DM_KAIJO_CRF_FLG", A869TBM08_DM_KAIJO_CRF_FLG);
         n869TBM08_DM_KAIJO_CRF_FLG = T001G4_n869TBM08_DM_KAIJO_CRF_FLG[0] ;
         A870TBM08_DM_KAIJO_MEMO_FLG = T001G4_A870TBM08_DM_KAIJO_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A870TBM08_DM_KAIJO_MEMO_FLG", A870TBM08_DM_KAIJO_MEMO_FLG);
         n870TBM08_DM_KAIJO_MEMO_FLG = T001G4_n870TBM08_DM_KAIJO_MEMO_FLG[0] ;
         A871TBM08_DM_KAIJO_DM_FLG = T001G4_A871TBM08_DM_KAIJO_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A871TBM08_DM_KAIJO_DM_FLG", A871TBM08_DM_KAIJO_DM_FLG);
         n871TBM08_DM_KAIJO_DM_FLG = T001G4_n871TBM08_DM_KAIJO_DM_FLG[0] ;
         A881TBM08_ICON_CAPTION = T001G4_A881TBM08_ICON_CAPTION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A881TBM08_ICON_CAPTION", A881TBM08_ICON_CAPTION);
         n881TBM08_ICON_CAPTION = T001G4_n881TBM08_ICON_CAPTION[0] ;
         A885TBM08_ICON_R = T001G4_A885TBM08_ICON_R[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A885TBM08_ICON_R", GXutil.ltrim( GXutil.str( A885TBM08_ICON_R, 4, 0)));
         n885TBM08_ICON_R = T001G4_n885TBM08_ICON_R[0] ;
         A886TBM08_ICON_G = T001G4_A886TBM08_ICON_G[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A886TBM08_ICON_G", GXutil.ltrim( GXutil.str( A886TBM08_ICON_G, 4, 0)));
         n886TBM08_ICON_G = T001G4_n886TBM08_ICON_G[0] ;
         A887TBM08_ICON_B = T001G4_A887TBM08_ICON_B[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A887TBM08_ICON_B", GXutil.ltrim( GXutil.str( A887TBM08_ICON_B, 4, 0)));
         n887TBM08_ICON_B = T001G4_n887TBM08_ICON_B[0] ;
         A872TBM08_DEL_FLG = T001G4_A872TBM08_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A872TBM08_DEL_FLG", A872TBM08_DEL_FLG);
         n872TBM08_DEL_FLG = T001G4_n872TBM08_DEL_FLG[0] ;
         A873TBM08_CRT_DATETIME = T001G4_A873TBM08_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A873TBM08_CRT_DATETIME", localUtil.ttoc( A873TBM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n873TBM08_CRT_DATETIME = T001G4_n873TBM08_CRT_DATETIME[0] ;
         A874TBM08_CRT_USER_ID = T001G4_A874TBM08_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A874TBM08_CRT_USER_ID", A874TBM08_CRT_USER_ID);
         n874TBM08_CRT_USER_ID = T001G4_n874TBM08_CRT_USER_ID[0] ;
         A875TBM08_CRT_PROG_NM = T001G4_A875TBM08_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A875TBM08_CRT_PROG_NM", A875TBM08_CRT_PROG_NM);
         n875TBM08_CRT_PROG_NM = T001G4_n875TBM08_CRT_PROG_NM[0] ;
         A876TBM08_UPD_DATETIME = T001G4_A876TBM08_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A876TBM08_UPD_DATETIME", localUtil.ttoc( A876TBM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n876TBM08_UPD_DATETIME = T001G4_n876TBM08_UPD_DATETIME[0] ;
         A877TBM08_UPD_USER_ID = T001G4_A877TBM08_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A877TBM08_UPD_USER_ID", A877TBM08_UPD_USER_ID);
         n877TBM08_UPD_USER_ID = T001G4_n877TBM08_UPD_USER_ID[0] ;
         A878TBM08_UPD_PROG_NM = T001G4_A878TBM08_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A878TBM08_UPD_PROG_NM", A878TBM08_UPD_PROG_NM);
         n878TBM08_UPD_PROG_NM = T001G4_n878TBM08_UPD_PROG_NM[0] ;
         A879TBM08_UPD_COUNT = T001G4_A879TBM08_UPD_COUNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A879TBM08_UPD_COUNT", GXutil.ltrim( GXutil.str( A879TBM08_UPD_COUNT, 10, 0)));
         n879TBM08_UPD_COUNT = T001G4_n879TBM08_UPD_COUNT[0] ;
         zm1G51( -3) ;
      }
      pr_default.close(2);
      onLoadActions1G51( ) ;
   }

   public void onLoadActions1G51( )
   {
   }

   public void checkExtendedTable1G51( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      if ( ! ( GXutil.nullDate().equals(A873TBM08_CRT_DATETIME) || (( A873TBM08_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A873TBM08_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TBM08_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM08_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A876TBM08_UPD_DATETIME) || (( A876TBM08_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A876TBM08_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TBM08_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM08_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors1G51( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey1G51( )
   {
      /* Using cursor T001G5 */
      pr_default.execute(3, new Object[] {A191TBM08_AUTH_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound51 = (short)(1) ;
      }
      else
      {
         RcdFound51 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T001G3 */
      pr_default.execute(1, new Object[] {A191TBM08_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1G51( 3) ;
         RcdFound51 = (short)(1) ;
         A191TBM08_AUTH_CD = T001G3_A191TBM08_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191TBM08_AUTH_CD", A191TBM08_AUTH_CD);
         A863TBM08_DM_MICHAKU_CRF_FLG = T001G3_A863TBM08_DM_MICHAKU_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A863TBM08_DM_MICHAKU_CRF_FLG", A863TBM08_DM_MICHAKU_CRF_FLG);
         n863TBM08_DM_MICHAKU_CRF_FLG = T001G3_n863TBM08_DM_MICHAKU_CRF_FLG[0] ;
         A864TBM08_DM_MICHAKU_MEMO_FLG = T001G3_A864TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864TBM08_DM_MICHAKU_MEMO_FLG", A864TBM08_DM_MICHAKU_MEMO_FLG);
         n864TBM08_DM_MICHAKU_MEMO_FLG = T001G3_n864TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         A865TBM08_DM_MICHAKU_DM_FLG = T001G3_A865TBM08_DM_MICHAKU_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A865TBM08_DM_MICHAKU_DM_FLG", A865TBM08_DM_MICHAKU_DM_FLG);
         n865TBM08_DM_MICHAKU_DM_FLG = T001G3_n865TBM08_DM_MICHAKU_DM_FLG[0] ;
         A866TBM08_DM_ARRI_CRF_FLG = T001G3_A866TBM08_DM_ARRI_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A866TBM08_DM_ARRI_CRF_FLG", A866TBM08_DM_ARRI_CRF_FLG);
         n866TBM08_DM_ARRI_CRF_FLG = T001G3_n866TBM08_DM_ARRI_CRF_FLG[0] ;
         A867TBM08_DM_ARRI_MEMO_FLG = T001G3_A867TBM08_DM_ARRI_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A867TBM08_DM_ARRI_MEMO_FLG", A867TBM08_DM_ARRI_MEMO_FLG);
         n867TBM08_DM_ARRI_MEMO_FLG = T001G3_n867TBM08_DM_ARRI_MEMO_FLG[0] ;
         A868TBM08_DM_ARRI_DM_FLG = T001G3_A868TBM08_DM_ARRI_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A868TBM08_DM_ARRI_DM_FLG", A868TBM08_DM_ARRI_DM_FLG);
         n868TBM08_DM_ARRI_DM_FLG = T001G3_n868TBM08_DM_ARRI_DM_FLG[0] ;
         A869TBM08_DM_KAIJO_CRF_FLG = T001G3_A869TBM08_DM_KAIJO_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A869TBM08_DM_KAIJO_CRF_FLG", A869TBM08_DM_KAIJO_CRF_FLG);
         n869TBM08_DM_KAIJO_CRF_FLG = T001G3_n869TBM08_DM_KAIJO_CRF_FLG[0] ;
         A870TBM08_DM_KAIJO_MEMO_FLG = T001G3_A870TBM08_DM_KAIJO_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A870TBM08_DM_KAIJO_MEMO_FLG", A870TBM08_DM_KAIJO_MEMO_FLG);
         n870TBM08_DM_KAIJO_MEMO_FLG = T001G3_n870TBM08_DM_KAIJO_MEMO_FLG[0] ;
         A871TBM08_DM_KAIJO_DM_FLG = T001G3_A871TBM08_DM_KAIJO_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A871TBM08_DM_KAIJO_DM_FLG", A871TBM08_DM_KAIJO_DM_FLG);
         n871TBM08_DM_KAIJO_DM_FLG = T001G3_n871TBM08_DM_KAIJO_DM_FLG[0] ;
         A881TBM08_ICON_CAPTION = T001G3_A881TBM08_ICON_CAPTION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A881TBM08_ICON_CAPTION", A881TBM08_ICON_CAPTION);
         n881TBM08_ICON_CAPTION = T001G3_n881TBM08_ICON_CAPTION[0] ;
         A885TBM08_ICON_R = T001G3_A885TBM08_ICON_R[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A885TBM08_ICON_R", GXutil.ltrim( GXutil.str( A885TBM08_ICON_R, 4, 0)));
         n885TBM08_ICON_R = T001G3_n885TBM08_ICON_R[0] ;
         A886TBM08_ICON_G = T001G3_A886TBM08_ICON_G[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A886TBM08_ICON_G", GXutil.ltrim( GXutil.str( A886TBM08_ICON_G, 4, 0)));
         n886TBM08_ICON_G = T001G3_n886TBM08_ICON_G[0] ;
         A887TBM08_ICON_B = T001G3_A887TBM08_ICON_B[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A887TBM08_ICON_B", GXutil.ltrim( GXutil.str( A887TBM08_ICON_B, 4, 0)));
         n887TBM08_ICON_B = T001G3_n887TBM08_ICON_B[0] ;
         A872TBM08_DEL_FLG = T001G3_A872TBM08_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A872TBM08_DEL_FLG", A872TBM08_DEL_FLG);
         n872TBM08_DEL_FLG = T001G3_n872TBM08_DEL_FLG[0] ;
         A873TBM08_CRT_DATETIME = T001G3_A873TBM08_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A873TBM08_CRT_DATETIME", localUtil.ttoc( A873TBM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n873TBM08_CRT_DATETIME = T001G3_n873TBM08_CRT_DATETIME[0] ;
         A874TBM08_CRT_USER_ID = T001G3_A874TBM08_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A874TBM08_CRT_USER_ID", A874TBM08_CRT_USER_ID);
         n874TBM08_CRT_USER_ID = T001G3_n874TBM08_CRT_USER_ID[0] ;
         A875TBM08_CRT_PROG_NM = T001G3_A875TBM08_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A875TBM08_CRT_PROG_NM", A875TBM08_CRT_PROG_NM);
         n875TBM08_CRT_PROG_NM = T001G3_n875TBM08_CRT_PROG_NM[0] ;
         A876TBM08_UPD_DATETIME = T001G3_A876TBM08_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A876TBM08_UPD_DATETIME", localUtil.ttoc( A876TBM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n876TBM08_UPD_DATETIME = T001G3_n876TBM08_UPD_DATETIME[0] ;
         A877TBM08_UPD_USER_ID = T001G3_A877TBM08_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A877TBM08_UPD_USER_ID", A877TBM08_UPD_USER_ID);
         n877TBM08_UPD_USER_ID = T001G3_n877TBM08_UPD_USER_ID[0] ;
         A878TBM08_UPD_PROG_NM = T001G3_A878TBM08_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A878TBM08_UPD_PROG_NM", A878TBM08_UPD_PROG_NM);
         n878TBM08_UPD_PROG_NM = T001G3_n878TBM08_UPD_PROG_NM[0] ;
         A879TBM08_UPD_COUNT = T001G3_A879TBM08_UPD_COUNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A879TBM08_UPD_COUNT", GXutil.ltrim( GXutil.str( A879TBM08_UPD_COUNT, 10, 0)));
         n879TBM08_UPD_COUNT = T001G3_n879TBM08_UPD_COUNT[0] ;
         Z191TBM08_AUTH_CD = A191TBM08_AUTH_CD ;
         sMode51 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1G51( ) ;
         if ( AnyError == 1 )
         {
            RcdFound51 = (short)(0) ;
            initializeNonKey1G51( ) ;
         }
         Gx_mode = sMode51 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound51 = (short)(0) ;
         initializeNonKey1G51( ) ;
         sMode51 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode51 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey1G51( ) ;
      if ( RcdFound51 == 0 )
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
      RcdFound51 = (short)(0) ;
      /* Using cursor T001G6 */
      pr_default.execute(4, new Object[] {A191TBM08_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001G6_A191TBM08_AUTH_CD[0], A191TBM08_AUTH_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001G6_A191TBM08_AUTH_CD[0], A191TBM08_AUTH_CD) > 0 ) ) )
         {
            A191TBM08_AUTH_CD = T001G6_A191TBM08_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A191TBM08_AUTH_CD", A191TBM08_AUTH_CD);
            RcdFound51 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound51 = (short)(0) ;
      /* Using cursor T001G7 */
      pr_default.execute(5, new Object[] {A191TBM08_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001G7_A191TBM08_AUTH_CD[0], A191TBM08_AUTH_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001G7_A191TBM08_AUTH_CD[0], A191TBM08_AUTH_CD) < 0 ) ) )
         {
            A191TBM08_AUTH_CD = T001G7_A191TBM08_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A191TBM08_AUTH_CD", A191TBM08_AUTH_CD);
            RcdFound51 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1G51( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert1G51( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound51 == 1 )
         {
            if ( GXutil.strcmp(A191TBM08_AUTH_CD, Z191TBM08_AUTH_CD) != 0 )
            {
               A191TBM08_AUTH_CD = Z191TBM08_AUTH_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A191TBM08_AUTH_CD", A191TBM08_AUTH_CD);
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM08_AUTH_CD");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update1G51( ) ;
               GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A191TBM08_AUTH_CD, Z191TBM08_AUTH_CD) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert1G51( ) ;
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
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM08_AUTH_CD");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert1G51( ) ;
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
      if ( GXutil.strcmp(A191TBM08_AUTH_CD, Z191TBM08_AUTH_CD) != 0 )
      {
         A191TBM08_AUTH_CD = Z191TBM08_AUTH_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A191TBM08_AUTH_CD", A191TBM08_AUTH_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM08_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
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
      if ( RcdFound51 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM08_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTBM08_DM_MICHAKU_CRF_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart1G51( ) ;
      if ( RcdFound51 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM08_DM_MICHAKU_CRF_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1G51( ) ;
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
      if ( RcdFound51 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM08_DM_MICHAKU_CRF_FLG_Internalname ;
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
      if ( RcdFound51 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM08_DM_MICHAKU_CRF_FLG_Internalname ;
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
      scanStart1G51( ) ;
      if ( RcdFound51 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound51 != 0 )
         {
            scanNext1G51( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM08_DM_MICHAKU_CRF_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd1G51( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency1G51( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T001G2 */
         pr_default.execute(0, new Object[] {A191TBM08_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM08_AUTH_INP_LVL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z863TBM08_DM_MICHAKU_CRF_FLG, T001G2_A863TBM08_DM_MICHAKU_CRF_FLG[0]) != 0 ) || ( GXutil.strcmp(Z864TBM08_DM_MICHAKU_MEMO_FLG, T001G2_A864TBM08_DM_MICHAKU_MEMO_FLG[0]) != 0 ) || ( GXutil.strcmp(Z865TBM08_DM_MICHAKU_DM_FLG, T001G2_A865TBM08_DM_MICHAKU_DM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z866TBM08_DM_ARRI_CRF_FLG, T001G2_A866TBM08_DM_ARRI_CRF_FLG[0]) != 0 ) || ( GXutil.strcmp(Z867TBM08_DM_ARRI_MEMO_FLG, T001G2_A867TBM08_DM_ARRI_MEMO_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z868TBM08_DM_ARRI_DM_FLG, T001G2_A868TBM08_DM_ARRI_DM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z869TBM08_DM_KAIJO_CRF_FLG, T001G2_A869TBM08_DM_KAIJO_CRF_FLG[0]) != 0 ) || ( GXutil.strcmp(Z870TBM08_DM_KAIJO_MEMO_FLG, T001G2_A870TBM08_DM_KAIJO_MEMO_FLG[0]) != 0 ) || ( GXutil.strcmp(Z871TBM08_DM_KAIJO_DM_FLG, T001G2_A871TBM08_DM_KAIJO_DM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z881TBM08_ICON_CAPTION, T001G2_A881TBM08_ICON_CAPTION[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z885TBM08_ICON_R != T001G2_A885TBM08_ICON_R[0] ) || ( Z886TBM08_ICON_G != T001G2_A886TBM08_ICON_G[0] ) || ( Z887TBM08_ICON_B != T001G2_A887TBM08_ICON_B[0] ) || ( GXutil.strcmp(Z872TBM08_DEL_FLG, T001G2_A872TBM08_DEL_FLG[0]) != 0 ) || !( Z873TBM08_CRT_DATETIME.equals( T001G2_A873TBM08_CRT_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z874TBM08_CRT_USER_ID, T001G2_A874TBM08_CRT_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z875TBM08_CRT_PROG_NM, T001G2_A875TBM08_CRT_PROG_NM[0]) != 0 ) || !( Z876TBM08_UPD_DATETIME.equals( T001G2_A876TBM08_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z877TBM08_UPD_USER_ID, T001G2_A877TBM08_UPD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z878TBM08_UPD_PROG_NM, T001G2_A878TBM08_UPD_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z879TBM08_UPD_COUNT != T001G2_A879TBM08_UPD_COUNT[0] ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM08_AUTH_INP_LVL"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert1G51( )
   {
      beforeValidate1G51( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G51( ) ;
      }
      if ( AnyError == 0 )
      {
         zm1G51( 0) ;
         checkOptimisticConcurrency1G51( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G51( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert1G51( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001G8 */
                  pr_default.execute(6, new Object[] {A191TBM08_AUTH_CD, new Boolean(n863TBM08_DM_MICHAKU_CRF_FLG), A863TBM08_DM_MICHAKU_CRF_FLG, new Boolean(n864TBM08_DM_MICHAKU_MEMO_FLG), A864TBM08_DM_MICHAKU_MEMO_FLG, new Boolean(n865TBM08_DM_MICHAKU_DM_FLG), A865TBM08_DM_MICHAKU_DM_FLG, new Boolean(n866TBM08_DM_ARRI_CRF_FLG), A866TBM08_DM_ARRI_CRF_FLG, new Boolean(n867TBM08_DM_ARRI_MEMO_FLG), A867TBM08_DM_ARRI_MEMO_FLG, new Boolean(n868TBM08_DM_ARRI_DM_FLG), A868TBM08_DM_ARRI_DM_FLG, new Boolean(n869TBM08_DM_KAIJO_CRF_FLG), A869TBM08_DM_KAIJO_CRF_FLG, new Boolean(n870TBM08_DM_KAIJO_MEMO_FLG), A870TBM08_DM_KAIJO_MEMO_FLG, new Boolean(n871TBM08_DM_KAIJO_DM_FLG), A871TBM08_DM_KAIJO_DM_FLG, new Boolean(n881TBM08_ICON_CAPTION), A881TBM08_ICON_CAPTION, new Boolean(n885TBM08_ICON_R), new Short(A885TBM08_ICON_R), new Boolean(n886TBM08_ICON_G), new Short(A886TBM08_ICON_G), new Boolean(n887TBM08_ICON_B), new Short(A887TBM08_ICON_B), new Boolean(n872TBM08_DEL_FLG), A872TBM08_DEL_FLG, new Boolean(n873TBM08_CRT_DATETIME), A873TBM08_CRT_DATETIME, new Boolean(n874TBM08_CRT_USER_ID), A874TBM08_CRT_USER_ID, new Boolean(n875TBM08_CRT_PROG_NM), A875TBM08_CRT_PROG_NM, new Boolean(n876TBM08_UPD_DATETIME), A876TBM08_UPD_DATETIME, new Boolean(n877TBM08_UPD_USER_ID), A877TBM08_UPD_USER_ID, new Boolean(n878TBM08_UPD_PROG_NM), A878TBM08_UPD_PROG_NM, new Boolean(n879TBM08_UPD_COUNT), new Long(A879TBM08_UPD_COUNT)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM08_AUTH_INP_LVL") ;
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
                        resetCaption1G0( ) ;
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
            load1G51( ) ;
         }
         endLevel1G51( ) ;
      }
      closeExtendedTableCursors1G51( ) ;
   }

   public void update1G51( )
   {
      beforeValidate1G51( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable1G51( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G51( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm1G51( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate1G51( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T001G9 */
                  pr_default.execute(7, new Object[] {new Boolean(n863TBM08_DM_MICHAKU_CRF_FLG), A863TBM08_DM_MICHAKU_CRF_FLG, new Boolean(n864TBM08_DM_MICHAKU_MEMO_FLG), A864TBM08_DM_MICHAKU_MEMO_FLG, new Boolean(n865TBM08_DM_MICHAKU_DM_FLG), A865TBM08_DM_MICHAKU_DM_FLG, new Boolean(n866TBM08_DM_ARRI_CRF_FLG), A866TBM08_DM_ARRI_CRF_FLG, new Boolean(n867TBM08_DM_ARRI_MEMO_FLG), A867TBM08_DM_ARRI_MEMO_FLG, new Boolean(n868TBM08_DM_ARRI_DM_FLG), A868TBM08_DM_ARRI_DM_FLG, new Boolean(n869TBM08_DM_KAIJO_CRF_FLG), A869TBM08_DM_KAIJO_CRF_FLG, new Boolean(n870TBM08_DM_KAIJO_MEMO_FLG), A870TBM08_DM_KAIJO_MEMO_FLG, new Boolean(n871TBM08_DM_KAIJO_DM_FLG), A871TBM08_DM_KAIJO_DM_FLG, new Boolean(n881TBM08_ICON_CAPTION), A881TBM08_ICON_CAPTION, new Boolean(n885TBM08_ICON_R), new Short(A885TBM08_ICON_R), new Boolean(n886TBM08_ICON_G), new Short(A886TBM08_ICON_G), new Boolean(n887TBM08_ICON_B), new Short(A887TBM08_ICON_B), new Boolean(n872TBM08_DEL_FLG), A872TBM08_DEL_FLG, new Boolean(n873TBM08_CRT_DATETIME), A873TBM08_CRT_DATETIME, new Boolean(n874TBM08_CRT_USER_ID), A874TBM08_CRT_USER_ID, new Boolean(n875TBM08_CRT_PROG_NM), A875TBM08_CRT_PROG_NM, new Boolean(n876TBM08_UPD_DATETIME), A876TBM08_UPD_DATETIME, new Boolean(n877TBM08_UPD_USER_ID), A877TBM08_UPD_USER_ID, new Boolean(n878TBM08_UPD_PROG_NM), A878TBM08_UPD_PROG_NM, new Boolean(n879TBM08_UPD_COUNT), new Long(A879TBM08_UPD_COUNT), A191TBM08_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM08_AUTH_INP_LVL") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM08_AUTH_INP_LVL"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate1G51( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption1G0( ) ;
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
         endLevel1G51( ) ;
      }
      closeExtendedTableCursors1G51( ) ;
   }

   public void deferredUpdate1G51( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate1G51( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency1G51( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls1G51( ) ;
         afterConfirm1G51( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete1G51( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T001G10 */
               pr_default.execute(8, new Object[] {A191TBM08_AUTH_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TBM08_AUTH_INP_LVL") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound51 == 0 )
                     {
                        initAll1G51( ) ;
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
                     resetCaption1G0( ) ;
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
      sMode51 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel1G51( ) ;
      Gx_mode = sMode51 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls1G51( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel1G51( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete1G51( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm08_auth_inp_lvl");
         if ( AnyError == 0 )
         {
            confirmValues1G0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm08_auth_inp_lvl");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart1G51( )
   {
      /* Using cursor T001G11 */
      pr_default.execute(9);
      RcdFound51 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound51 = (short)(1) ;
         A191TBM08_AUTH_CD = T001G11_A191TBM08_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191TBM08_AUTH_CD", A191TBM08_AUTH_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G51( )
   {
      /* Scan next routine */
      pr_default.readNext(9);
      RcdFound51 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound51 = (short)(1) ;
         A191TBM08_AUTH_CD = T001G11_A191TBM08_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A191TBM08_AUTH_CD", A191TBM08_AUTH_CD);
      }
   }

   public void scanEnd1G51( )
   {
      pr_default.close(9);
   }

   public void afterConfirm1G51( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert1G51( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate1G51( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete1G51( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete1G51( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate1G51( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes1G51( )
   {
      edtTBM08_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_AUTH_CD_Enabled, 5, 0)));
      edtTBM08_DM_MICHAKU_CRF_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_DM_MICHAKU_CRF_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_DM_MICHAKU_CRF_FLG_Enabled, 5, 0)));
      edtTBM08_DM_MICHAKU_MEMO_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_DM_MICHAKU_MEMO_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_DM_MICHAKU_MEMO_FLG_Enabled, 5, 0)));
      edtTBM08_DM_MICHAKU_DM_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_DM_MICHAKU_DM_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_DM_MICHAKU_DM_FLG_Enabled, 5, 0)));
      edtTBM08_DM_ARRI_CRF_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_DM_ARRI_CRF_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_DM_ARRI_CRF_FLG_Enabled, 5, 0)));
      edtTBM08_DM_ARRI_MEMO_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_DM_ARRI_MEMO_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_DM_ARRI_MEMO_FLG_Enabled, 5, 0)));
      edtTBM08_DM_ARRI_DM_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_DM_ARRI_DM_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_DM_ARRI_DM_FLG_Enabled, 5, 0)));
      edtTBM08_DM_KAIJO_CRF_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_DM_KAIJO_CRF_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_DM_KAIJO_CRF_FLG_Enabled, 5, 0)));
      edtTBM08_DM_KAIJO_MEMO_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_DM_KAIJO_MEMO_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_DM_KAIJO_MEMO_FLG_Enabled, 5, 0)));
      edtTBM08_DM_KAIJO_DM_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_DM_KAIJO_DM_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_DM_KAIJO_DM_FLG_Enabled, 5, 0)));
      edtTBM08_ICON_CAPTION_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_ICON_CAPTION_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_ICON_CAPTION_Enabled, 5, 0)));
      edtTBM08_ICON_R_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_ICON_R_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_ICON_R_Enabled, 5, 0)));
      edtTBM08_ICON_G_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_ICON_G_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_ICON_G_Enabled, 5, 0)));
      edtTBM08_ICON_B_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_ICON_B_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_ICON_B_Enabled, 5, 0)));
      edtTBM08_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_DEL_FLG_Enabled, 5, 0)));
      edtTBM08_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM08_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM08_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM08_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM08_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM08_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM08_UPD_COUNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM08_UPD_COUNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM08_UPD_COUNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues1G0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "権限別入力制御マスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317163450");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tbm08_auth_inp_lvl") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm1G51( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z191TBM08_AUTH_CD", GXutil.rtrim( Z191TBM08_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z863TBM08_DM_MICHAKU_CRF_FLG", GXutil.rtrim( Z863TBM08_DM_MICHAKU_CRF_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z864TBM08_DM_MICHAKU_MEMO_FLG", GXutil.rtrim( Z864TBM08_DM_MICHAKU_MEMO_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z865TBM08_DM_MICHAKU_DM_FLG", GXutil.rtrim( Z865TBM08_DM_MICHAKU_DM_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z866TBM08_DM_ARRI_CRF_FLG", GXutil.rtrim( Z866TBM08_DM_ARRI_CRF_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z867TBM08_DM_ARRI_MEMO_FLG", GXutil.rtrim( Z867TBM08_DM_ARRI_MEMO_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z868TBM08_DM_ARRI_DM_FLG", GXutil.rtrim( Z868TBM08_DM_ARRI_DM_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z869TBM08_DM_KAIJO_CRF_FLG", GXutil.rtrim( Z869TBM08_DM_KAIJO_CRF_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z870TBM08_DM_KAIJO_MEMO_FLG", GXutil.rtrim( Z870TBM08_DM_KAIJO_MEMO_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z871TBM08_DM_KAIJO_DM_FLG", GXutil.rtrim( Z871TBM08_DM_KAIJO_DM_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z881TBM08_ICON_CAPTION", GXutil.rtrim( Z881TBM08_ICON_CAPTION));
      GxWebStd.gx_hidden_field( httpContext, "Z885TBM08_ICON_R", GXutil.ltrim( localUtil.ntoc( Z885TBM08_ICON_R, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z886TBM08_ICON_G", GXutil.ltrim( localUtil.ntoc( Z886TBM08_ICON_G, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z887TBM08_ICON_B", GXutil.ltrim( localUtil.ntoc( Z887TBM08_ICON_B, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z872TBM08_DEL_FLG", GXutil.rtrim( Z872TBM08_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z873TBM08_CRT_DATETIME", localUtil.ttoc( Z873TBM08_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z874TBM08_CRT_USER_ID", GXutil.rtrim( Z874TBM08_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z875TBM08_CRT_PROG_NM", GXutil.rtrim( Z875TBM08_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z876TBM08_UPD_DATETIME", localUtil.ttoc( Z876TBM08_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z877TBM08_UPD_USER_ID", GXutil.rtrim( Z877TBM08_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z878TBM08_UPD_PROG_NM", GXutil.rtrim( Z878TBM08_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z879TBM08_UPD_COUNT", GXutil.ltrim( localUtil.ntoc( Z879TBM08_UPD_COUNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
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
      return "TBM08_AUTH_INP_LVL" ;
   }

   public String getPgmdesc( )
   {
      return "権限別入力制御マスタ" ;
   }

   public void initializeNonKey1G51( )
   {
      A863TBM08_DM_MICHAKU_CRF_FLG = "" ;
      n863TBM08_DM_MICHAKU_CRF_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A863TBM08_DM_MICHAKU_CRF_FLG", A863TBM08_DM_MICHAKU_CRF_FLG);
      n863TBM08_DM_MICHAKU_CRF_FLG = ((GXutil.strcmp("", A863TBM08_DM_MICHAKU_CRF_FLG)==0) ? true : false) ;
      A864TBM08_DM_MICHAKU_MEMO_FLG = "" ;
      n864TBM08_DM_MICHAKU_MEMO_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A864TBM08_DM_MICHAKU_MEMO_FLG", A864TBM08_DM_MICHAKU_MEMO_FLG);
      n864TBM08_DM_MICHAKU_MEMO_FLG = ((GXutil.strcmp("", A864TBM08_DM_MICHAKU_MEMO_FLG)==0) ? true : false) ;
      A865TBM08_DM_MICHAKU_DM_FLG = "" ;
      n865TBM08_DM_MICHAKU_DM_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A865TBM08_DM_MICHAKU_DM_FLG", A865TBM08_DM_MICHAKU_DM_FLG);
      n865TBM08_DM_MICHAKU_DM_FLG = ((GXutil.strcmp("", A865TBM08_DM_MICHAKU_DM_FLG)==0) ? true : false) ;
      A866TBM08_DM_ARRI_CRF_FLG = "" ;
      n866TBM08_DM_ARRI_CRF_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A866TBM08_DM_ARRI_CRF_FLG", A866TBM08_DM_ARRI_CRF_FLG);
      n866TBM08_DM_ARRI_CRF_FLG = ((GXutil.strcmp("", A866TBM08_DM_ARRI_CRF_FLG)==0) ? true : false) ;
      A867TBM08_DM_ARRI_MEMO_FLG = "" ;
      n867TBM08_DM_ARRI_MEMO_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A867TBM08_DM_ARRI_MEMO_FLG", A867TBM08_DM_ARRI_MEMO_FLG);
      n867TBM08_DM_ARRI_MEMO_FLG = ((GXutil.strcmp("", A867TBM08_DM_ARRI_MEMO_FLG)==0) ? true : false) ;
      A868TBM08_DM_ARRI_DM_FLG = "" ;
      n868TBM08_DM_ARRI_DM_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A868TBM08_DM_ARRI_DM_FLG", A868TBM08_DM_ARRI_DM_FLG);
      n868TBM08_DM_ARRI_DM_FLG = ((GXutil.strcmp("", A868TBM08_DM_ARRI_DM_FLG)==0) ? true : false) ;
      A869TBM08_DM_KAIJO_CRF_FLG = "" ;
      n869TBM08_DM_KAIJO_CRF_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A869TBM08_DM_KAIJO_CRF_FLG", A869TBM08_DM_KAIJO_CRF_FLG);
      n869TBM08_DM_KAIJO_CRF_FLG = ((GXutil.strcmp("", A869TBM08_DM_KAIJO_CRF_FLG)==0) ? true : false) ;
      A870TBM08_DM_KAIJO_MEMO_FLG = "" ;
      n870TBM08_DM_KAIJO_MEMO_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A870TBM08_DM_KAIJO_MEMO_FLG", A870TBM08_DM_KAIJO_MEMO_FLG);
      n870TBM08_DM_KAIJO_MEMO_FLG = ((GXutil.strcmp("", A870TBM08_DM_KAIJO_MEMO_FLG)==0) ? true : false) ;
      A871TBM08_DM_KAIJO_DM_FLG = "" ;
      n871TBM08_DM_KAIJO_DM_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A871TBM08_DM_KAIJO_DM_FLG", A871TBM08_DM_KAIJO_DM_FLG);
      n871TBM08_DM_KAIJO_DM_FLG = ((GXutil.strcmp("", A871TBM08_DM_KAIJO_DM_FLG)==0) ? true : false) ;
      A881TBM08_ICON_CAPTION = "" ;
      n881TBM08_ICON_CAPTION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A881TBM08_ICON_CAPTION", A881TBM08_ICON_CAPTION);
      n881TBM08_ICON_CAPTION = ((GXutil.strcmp("", A881TBM08_ICON_CAPTION)==0) ? true : false) ;
      A885TBM08_ICON_R = (short)(0) ;
      n885TBM08_ICON_R = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A885TBM08_ICON_R", GXutil.ltrim( GXutil.str( A885TBM08_ICON_R, 4, 0)));
      n885TBM08_ICON_R = ((0==A885TBM08_ICON_R) ? true : false) ;
      A886TBM08_ICON_G = (short)(0) ;
      n886TBM08_ICON_G = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A886TBM08_ICON_G", GXutil.ltrim( GXutil.str( A886TBM08_ICON_G, 4, 0)));
      n886TBM08_ICON_G = ((0==A886TBM08_ICON_G) ? true : false) ;
      A887TBM08_ICON_B = (short)(0) ;
      n887TBM08_ICON_B = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A887TBM08_ICON_B", GXutil.ltrim( GXutil.str( A887TBM08_ICON_B, 4, 0)));
      n887TBM08_ICON_B = ((0==A887TBM08_ICON_B) ? true : false) ;
      A872TBM08_DEL_FLG = "" ;
      n872TBM08_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A872TBM08_DEL_FLG", A872TBM08_DEL_FLG);
      n872TBM08_DEL_FLG = ((GXutil.strcmp("", A872TBM08_DEL_FLG)==0) ? true : false) ;
      A873TBM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n873TBM08_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A873TBM08_CRT_DATETIME", localUtil.ttoc( A873TBM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n873TBM08_CRT_DATETIME = (GXutil.nullDate().equals(A873TBM08_CRT_DATETIME) ? true : false) ;
      A874TBM08_CRT_USER_ID = "" ;
      n874TBM08_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A874TBM08_CRT_USER_ID", A874TBM08_CRT_USER_ID);
      n874TBM08_CRT_USER_ID = ((GXutil.strcmp("", A874TBM08_CRT_USER_ID)==0) ? true : false) ;
      A875TBM08_CRT_PROG_NM = "" ;
      n875TBM08_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A875TBM08_CRT_PROG_NM", A875TBM08_CRT_PROG_NM);
      n875TBM08_CRT_PROG_NM = ((GXutil.strcmp("", A875TBM08_CRT_PROG_NM)==0) ? true : false) ;
      A876TBM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n876TBM08_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A876TBM08_UPD_DATETIME", localUtil.ttoc( A876TBM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n876TBM08_UPD_DATETIME = (GXutil.nullDate().equals(A876TBM08_UPD_DATETIME) ? true : false) ;
      A877TBM08_UPD_USER_ID = "" ;
      n877TBM08_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A877TBM08_UPD_USER_ID", A877TBM08_UPD_USER_ID);
      n877TBM08_UPD_USER_ID = ((GXutil.strcmp("", A877TBM08_UPD_USER_ID)==0) ? true : false) ;
      A878TBM08_UPD_PROG_NM = "" ;
      n878TBM08_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A878TBM08_UPD_PROG_NM", A878TBM08_UPD_PROG_NM);
      n878TBM08_UPD_PROG_NM = ((GXutil.strcmp("", A878TBM08_UPD_PROG_NM)==0) ? true : false) ;
      A879TBM08_UPD_COUNT = 0 ;
      n879TBM08_UPD_COUNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A879TBM08_UPD_COUNT", GXutil.ltrim( GXutil.str( A879TBM08_UPD_COUNT, 10, 0)));
      n879TBM08_UPD_COUNT = ((0==A879TBM08_UPD_COUNT) ? true : false) ;
   }

   public void initAll1G51( )
   {
      A191TBM08_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A191TBM08_AUTH_CD", A191TBM08_AUTH_CD);
      initializeNonKey1G51( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317163457");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tbm08_auth_inp_lvl.js", "?20177317163457");
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
      lblTextblocktbm08_auth_cd_Internalname = "TEXTBLOCKTBM08_AUTH_CD" ;
      edtTBM08_AUTH_CD_Internalname = "TBM08_AUTH_CD" ;
      lblTextblocktbm08_dm_michaku_crf_flg_Internalname = "TEXTBLOCKTBM08_DM_MICHAKU_CRF_FLG" ;
      edtTBM08_DM_MICHAKU_CRF_FLG_Internalname = "TBM08_DM_MICHAKU_CRF_FLG" ;
      lblTextblocktbm08_dm_michaku_memo_flg_Internalname = "TEXTBLOCKTBM08_DM_MICHAKU_MEMO_FLG" ;
      edtTBM08_DM_MICHAKU_MEMO_FLG_Internalname = "TBM08_DM_MICHAKU_MEMO_FLG" ;
      lblTextblocktbm08_dm_michaku_dm_flg_Internalname = "TEXTBLOCKTBM08_DM_MICHAKU_DM_FLG" ;
      edtTBM08_DM_MICHAKU_DM_FLG_Internalname = "TBM08_DM_MICHAKU_DM_FLG" ;
      lblTextblocktbm08_dm_arri_crf_flg_Internalname = "TEXTBLOCKTBM08_DM_ARRI_CRF_FLG" ;
      edtTBM08_DM_ARRI_CRF_FLG_Internalname = "TBM08_DM_ARRI_CRF_FLG" ;
      lblTextblocktbm08_dm_arri_memo_flg_Internalname = "TEXTBLOCKTBM08_DM_ARRI_MEMO_FLG" ;
      edtTBM08_DM_ARRI_MEMO_FLG_Internalname = "TBM08_DM_ARRI_MEMO_FLG" ;
      lblTextblocktbm08_dm_arri_dm_flg_Internalname = "TEXTBLOCKTBM08_DM_ARRI_DM_FLG" ;
      edtTBM08_DM_ARRI_DM_FLG_Internalname = "TBM08_DM_ARRI_DM_FLG" ;
      lblTextblocktbm08_dm_kaijo_crf_flg_Internalname = "TEXTBLOCKTBM08_DM_KAIJO_CRF_FLG" ;
      edtTBM08_DM_KAIJO_CRF_FLG_Internalname = "TBM08_DM_KAIJO_CRF_FLG" ;
      lblTextblocktbm08_dm_kaijo_memo_flg_Internalname = "TEXTBLOCKTBM08_DM_KAIJO_MEMO_FLG" ;
      edtTBM08_DM_KAIJO_MEMO_FLG_Internalname = "TBM08_DM_KAIJO_MEMO_FLG" ;
      lblTextblocktbm08_dm_kaijo_dm_flg_Internalname = "TEXTBLOCKTBM08_DM_KAIJO_DM_FLG" ;
      edtTBM08_DM_KAIJO_DM_FLG_Internalname = "TBM08_DM_KAIJO_DM_FLG" ;
      lblTextblocktbm08_icon_caption_Internalname = "TEXTBLOCKTBM08_ICON_CAPTION" ;
      edtTBM08_ICON_CAPTION_Internalname = "TBM08_ICON_CAPTION" ;
      lblTextblocktbm08_icon_r_Internalname = "TEXTBLOCKTBM08_ICON_R" ;
      edtTBM08_ICON_R_Internalname = "TBM08_ICON_R" ;
      lblTextblocktbm08_icon_g_Internalname = "TEXTBLOCKTBM08_ICON_G" ;
      edtTBM08_ICON_G_Internalname = "TBM08_ICON_G" ;
      lblTextblocktbm08_icon_b_Internalname = "TEXTBLOCKTBM08_ICON_B" ;
      edtTBM08_ICON_B_Internalname = "TBM08_ICON_B" ;
      lblTextblocktbm08_del_flg_Internalname = "TEXTBLOCKTBM08_DEL_FLG" ;
      edtTBM08_DEL_FLG_Internalname = "TBM08_DEL_FLG" ;
      lblTextblocktbm08_crt_datetime_Internalname = "TEXTBLOCKTBM08_CRT_DATETIME" ;
      edtTBM08_CRT_DATETIME_Internalname = "TBM08_CRT_DATETIME" ;
      lblTextblocktbm08_crt_user_id_Internalname = "TEXTBLOCKTBM08_CRT_USER_ID" ;
      edtTBM08_CRT_USER_ID_Internalname = "TBM08_CRT_USER_ID" ;
      lblTextblocktbm08_crt_prog_nm_Internalname = "TEXTBLOCKTBM08_CRT_PROG_NM" ;
      edtTBM08_CRT_PROG_NM_Internalname = "TBM08_CRT_PROG_NM" ;
      lblTextblocktbm08_upd_datetime_Internalname = "TEXTBLOCKTBM08_UPD_DATETIME" ;
      edtTBM08_UPD_DATETIME_Internalname = "TBM08_UPD_DATETIME" ;
      lblTextblocktbm08_upd_user_id_Internalname = "TEXTBLOCKTBM08_UPD_USER_ID" ;
      edtTBM08_UPD_USER_ID_Internalname = "TBM08_UPD_USER_ID" ;
      lblTextblocktbm08_upd_prog_nm_Internalname = "TEXTBLOCKTBM08_UPD_PROG_NM" ;
      edtTBM08_UPD_PROG_NM_Internalname = "TBM08_UPD_PROG_NM" ;
      lblTextblocktbm08_upd_count_Internalname = "TEXTBLOCKTBM08_UPD_COUNT" ;
      edtTBM08_UPD_COUNT_Internalname = "TBM08_UPD_COUNT" ;
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
      edtTBM08_UPD_COUNT_Jsonclick = "" ;
      edtTBM08_UPD_COUNT_Enabled = 1 ;
      edtTBM08_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM08_UPD_PROG_NM_Enabled = 1 ;
      edtTBM08_UPD_USER_ID_Jsonclick = "" ;
      edtTBM08_UPD_USER_ID_Enabled = 1 ;
      edtTBM08_UPD_DATETIME_Jsonclick = "" ;
      edtTBM08_UPD_DATETIME_Enabled = 1 ;
      edtTBM08_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM08_CRT_PROG_NM_Enabled = 1 ;
      edtTBM08_CRT_USER_ID_Jsonclick = "" ;
      edtTBM08_CRT_USER_ID_Enabled = 1 ;
      edtTBM08_CRT_DATETIME_Jsonclick = "" ;
      edtTBM08_CRT_DATETIME_Enabled = 1 ;
      edtTBM08_DEL_FLG_Jsonclick = "" ;
      edtTBM08_DEL_FLG_Enabled = 1 ;
      edtTBM08_ICON_B_Jsonclick = "" ;
      edtTBM08_ICON_B_Enabled = 1 ;
      edtTBM08_ICON_G_Jsonclick = "" ;
      edtTBM08_ICON_G_Enabled = 1 ;
      edtTBM08_ICON_R_Jsonclick = "" ;
      edtTBM08_ICON_R_Enabled = 1 ;
      edtTBM08_ICON_CAPTION_Jsonclick = "" ;
      edtTBM08_ICON_CAPTION_Enabled = 1 ;
      edtTBM08_DM_KAIJO_DM_FLG_Jsonclick = "" ;
      edtTBM08_DM_KAIJO_DM_FLG_Enabled = 1 ;
      edtTBM08_DM_KAIJO_MEMO_FLG_Jsonclick = "" ;
      edtTBM08_DM_KAIJO_MEMO_FLG_Enabled = 1 ;
      edtTBM08_DM_KAIJO_CRF_FLG_Jsonclick = "" ;
      edtTBM08_DM_KAIJO_CRF_FLG_Enabled = 1 ;
      edtTBM08_DM_ARRI_DM_FLG_Jsonclick = "" ;
      edtTBM08_DM_ARRI_DM_FLG_Enabled = 1 ;
      edtTBM08_DM_ARRI_MEMO_FLG_Jsonclick = "" ;
      edtTBM08_DM_ARRI_MEMO_FLG_Enabled = 1 ;
      edtTBM08_DM_ARRI_CRF_FLG_Jsonclick = "" ;
      edtTBM08_DM_ARRI_CRF_FLG_Enabled = 1 ;
      edtTBM08_DM_MICHAKU_DM_FLG_Jsonclick = "" ;
      edtTBM08_DM_MICHAKU_DM_FLG_Enabled = 1 ;
      edtTBM08_DM_MICHAKU_MEMO_FLG_Jsonclick = "" ;
      edtTBM08_DM_MICHAKU_MEMO_FLG_Enabled = 1 ;
      edtTBM08_DM_MICHAKU_CRF_FLG_Jsonclick = "" ;
      edtTBM08_DM_MICHAKU_CRF_FLG_Enabled = 1 ;
      edtTBM08_AUTH_CD_Jsonclick = "" ;
      edtTBM08_AUTH_CD_Enabled = 1 ;
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
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      getEqualNoModal( ) ;
      GX_FocusControl = edtTBM08_DM_MICHAKU_CRF_FLG_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm08_auth_cd( String GX_Parm1 ,
                                    String GX_Parm2 ,
                                    String GX_Parm3 ,
                                    String GX_Parm4 ,
                                    String GX_Parm5 ,
                                    String GX_Parm6 ,
                                    String GX_Parm7 ,
                                    String GX_Parm8 ,
                                    String GX_Parm9 ,
                                    String GX_Parm10 ,
                                    String GX_Parm11 ,
                                    short GX_Parm12 ,
                                    short GX_Parm13 ,
                                    short GX_Parm14 ,
                                    String GX_Parm15 ,
                                    java.util.Date GX_Parm16 ,
                                    String GX_Parm17 ,
                                    String GX_Parm18 ,
                                    java.util.Date GX_Parm19 ,
                                    String GX_Parm20 ,
                                    String GX_Parm21 ,
                                    long GX_Parm22 )
   {
      A191TBM08_AUTH_CD = GX_Parm1 ;
      A863TBM08_DM_MICHAKU_CRF_FLG = GX_Parm2 ;
      n863TBM08_DM_MICHAKU_CRF_FLG = false ;
      A864TBM08_DM_MICHAKU_MEMO_FLG = GX_Parm3 ;
      n864TBM08_DM_MICHAKU_MEMO_FLG = false ;
      A865TBM08_DM_MICHAKU_DM_FLG = GX_Parm4 ;
      n865TBM08_DM_MICHAKU_DM_FLG = false ;
      A866TBM08_DM_ARRI_CRF_FLG = GX_Parm5 ;
      n866TBM08_DM_ARRI_CRF_FLG = false ;
      A867TBM08_DM_ARRI_MEMO_FLG = GX_Parm6 ;
      n867TBM08_DM_ARRI_MEMO_FLG = false ;
      A868TBM08_DM_ARRI_DM_FLG = GX_Parm7 ;
      n868TBM08_DM_ARRI_DM_FLG = false ;
      A869TBM08_DM_KAIJO_CRF_FLG = GX_Parm8 ;
      n869TBM08_DM_KAIJO_CRF_FLG = false ;
      A870TBM08_DM_KAIJO_MEMO_FLG = GX_Parm9 ;
      n870TBM08_DM_KAIJO_MEMO_FLG = false ;
      A871TBM08_DM_KAIJO_DM_FLG = GX_Parm10 ;
      n871TBM08_DM_KAIJO_DM_FLG = false ;
      A881TBM08_ICON_CAPTION = GX_Parm11 ;
      n881TBM08_ICON_CAPTION = false ;
      A885TBM08_ICON_R = GX_Parm12 ;
      n885TBM08_ICON_R = false ;
      A886TBM08_ICON_G = GX_Parm13 ;
      n886TBM08_ICON_G = false ;
      A887TBM08_ICON_B = GX_Parm14 ;
      n887TBM08_ICON_B = false ;
      A872TBM08_DEL_FLG = GX_Parm15 ;
      n872TBM08_DEL_FLG = false ;
      A873TBM08_CRT_DATETIME = GX_Parm16 ;
      n873TBM08_CRT_DATETIME = false ;
      A874TBM08_CRT_USER_ID = GX_Parm17 ;
      n874TBM08_CRT_USER_ID = false ;
      A875TBM08_CRT_PROG_NM = GX_Parm18 ;
      n875TBM08_CRT_PROG_NM = false ;
      A876TBM08_UPD_DATETIME = GX_Parm19 ;
      n876TBM08_UPD_DATETIME = false ;
      A877TBM08_UPD_USER_ID = GX_Parm20 ;
      n877TBM08_UPD_USER_ID = false ;
      A878TBM08_UPD_PROG_NM = GX_Parm21 ;
      n878TBM08_UPD_PROG_NM = false ;
      A879TBM08_UPD_COUNT = GX_Parm22 ;
      n879TBM08_UPD_COUNT = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.rtrim( A863TBM08_DM_MICHAKU_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( A864TBM08_DM_MICHAKU_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( A865TBM08_DM_MICHAKU_DM_FLG));
      isValidOutput.add(GXutil.rtrim( A866TBM08_DM_ARRI_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( A867TBM08_DM_ARRI_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( A868TBM08_DM_ARRI_DM_FLG));
      isValidOutput.add(GXutil.rtrim( A869TBM08_DM_KAIJO_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( A870TBM08_DM_KAIJO_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( A871TBM08_DM_KAIJO_DM_FLG));
      isValidOutput.add(GXutil.rtrim( A881TBM08_ICON_CAPTION));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A885TBM08_ICON_R, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A886TBM08_ICON_G, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A887TBM08_ICON_B, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A872TBM08_DEL_FLG));
      isValidOutput.add(localUtil.format(A873TBM08_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A874TBM08_CRT_USER_ID));
      isValidOutput.add(GXutil.rtrim( A875TBM08_CRT_PROG_NM));
      isValidOutput.add(localUtil.format(A876TBM08_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A877TBM08_UPD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A878TBM08_UPD_PROG_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A879TBM08_UPD_COUNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z191TBM08_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z863TBM08_DM_MICHAKU_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( Z864TBM08_DM_MICHAKU_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( Z865TBM08_DM_MICHAKU_DM_FLG));
      isValidOutput.add(GXutil.rtrim( Z866TBM08_DM_ARRI_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( Z867TBM08_DM_ARRI_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( Z868TBM08_DM_ARRI_DM_FLG));
      isValidOutput.add(GXutil.rtrim( Z869TBM08_DM_KAIJO_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( Z870TBM08_DM_KAIJO_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( Z871TBM08_DM_KAIJO_DM_FLG));
      isValidOutput.add(GXutil.rtrim( Z881TBM08_ICON_CAPTION));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z885TBM08_ICON_R, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z886TBM08_ICON_G, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z887TBM08_ICON_B, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z872TBM08_DEL_FLG));
      isValidOutput.add(localUtil.ttoc( Z873TBM08_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z874TBM08_CRT_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z875TBM08_CRT_PROG_NM));
      isValidOutput.add(localUtil.ttoc( Z876TBM08_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z877TBM08_UPD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z878TBM08_UPD_PROG_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z879TBM08_UPD_COUNT, (byte)(10), (byte)(0), ".", "")));
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
   public void initialize( )
   {
      sPrefix = "" ;
      Z191TBM08_AUTH_CD = "" ;
      Z863TBM08_DM_MICHAKU_CRF_FLG = "" ;
      Z864TBM08_DM_MICHAKU_MEMO_FLG = "" ;
      Z865TBM08_DM_MICHAKU_DM_FLG = "" ;
      Z866TBM08_DM_ARRI_CRF_FLG = "" ;
      Z867TBM08_DM_ARRI_MEMO_FLG = "" ;
      Z868TBM08_DM_ARRI_DM_FLG = "" ;
      Z869TBM08_DM_KAIJO_CRF_FLG = "" ;
      Z870TBM08_DM_KAIJO_MEMO_FLG = "" ;
      Z871TBM08_DM_KAIJO_DM_FLG = "" ;
      Z881TBM08_ICON_CAPTION = "" ;
      Z872TBM08_DEL_FLG = "" ;
      Z873TBM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z874TBM08_CRT_USER_ID = "" ;
      Z875TBM08_CRT_PROG_NM = "" ;
      Z876TBM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z877TBM08_UPD_USER_ID = "" ;
      Z878TBM08_UPD_PROG_NM = "" ;
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
      lblTextblocktbm08_auth_cd_Jsonclick = "" ;
      A191TBM08_AUTH_CD = "" ;
      lblTextblocktbm08_dm_michaku_crf_flg_Jsonclick = "" ;
      A863TBM08_DM_MICHAKU_CRF_FLG = "" ;
      lblTextblocktbm08_dm_michaku_memo_flg_Jsonclick = "" ;
      A864TBM08_DM_MICHAKU_MEMO_FLG = "" ;
      lblTextblocktbm08_dm_michaku_dm_flg_Jsonclick = "" ;
      A865TBM08_DM_MICHAKU_DM_FLG = "" ;
      lblTextblocktbm08_dm_arri_crf_flg_Jsonclick = "" ;
      A866TBM08_DM_ARRI_CRF_FLG = "" ;
      lblTextblocktbm08_dm_arri_memo_flg_Jsonclick = "" ;
      A867TBM08_DM_ARRI_MEMO_FLG = "" ;
      lblTextblocktbm08_dm_arri_dm_flg_Jsonclick = "" ;
      A868TBM08_DM_ARRI_DM_FLG = "" ;
      lblTextblocktbm08_dm_kaijo_crf_flg_Jsonclick = "" ;
      A869TBM08_DM_KAIJO_CRF_FLG = "" ;
      lblTextblocktbm08_dm_kaijo_memo_flg_Jsonclick = "" ;
      A870TBM08_DM_KAIJO_MEMO_FLG = "" ;
      lblTextblocktbm08_dm_kaijo_dm_flg_Jsonclick = "" ;
      A871TBM08_DM_KAIJO_DM_FLG = "" ;
      lblTextblocktbm08_icon_caption_Jsonclick = "" ;
      A881TBM08_ICON_CAPTION = "" ;
      lblTextblocktbm08_icon_r_Jsonclick = "" ;
      lblTextblocktbm08_icon_g_Jsonclick = "" ;
      lblTextblocktbm08_icon_b_Jsonclick = "" ;
      lblTextblocktbm08_del_flg_Jsonclick = "" ;
      A872TBM08_DEL_FLG = "" ;
      lblTextblocktbm08_crt_datetime_Jsonclick = "" ;
      A873TBM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm08_crt_user_id_Jsonclick = "" ;
      A874TBM08_CRT_USER_ID = "" ;
      lblTextblocktbm08_crt_prog_nm_Jsonclick = "" ;
      A875TBM08_CRT_PROG_NM = "" ;
      lblTextblocktbm08_upd_datetime_Jsonclick = "" ;
      A876TBM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm08_upd_user_id_Jsonclick = "" ;
      A877TBM08_UPD_USER_ID = "" ;
      lblTextblocktbm08_upd_prog_nm_Jsonclick = "" ;
      A878TBM08_UPD_PROG_NM = "" ;
      lblTextblocktbm08_upd_count_Jsonclick = "" ;
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
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T001G4_A191TBM08_AUTH_CD = new String[] {""} ;
      T001G4_A863TBM08_DM_MICHAKU_CRF_FLG = new String[] {""} ;
      T001G4_n863TBM08_DM_MICHAKU_CRF_FLG = new boolean[] {false} ;
      T001G4_A864TBM08_DM_MICHAKU_MEMO_FLG = new String[] {""} ;
      T001G4_n864TBM08_DM_MICHAKU_MEMO_FLG = new boolean[] {false} ;
      T001G4_A865TBM08_DM_MICHAKU_DM_FLG = new String[] {""} ;
      T001G4_n865TBM08_DM_MICHAKU_DM_FLG = new boolean[] {false} ;
      T001G4_A866TBM08_DM_ARRI_CRF_FLG = new String[] {""} ;
      T001G4_n866TBM08_DM_ARRI_CRF_FLG = new boolean[] {false} ;
      T001G4_A867TBM08_DM_ARRI_MEMO_FLG = new String[] {""} ;
      T001G4_n867TBM08_DM_ARRI_MEMO_FLG = new boolean[] {false} ;
      T001G4_A868TBM08_DM_ARRI_DM_FLG = new String[] {""} ;
      T001G4_n868TBM08_DM_ARRI_DM_FLG = new boolean[] {false} ;
      T001G4_A869TBM08_DM_KAIJO_CRF_FLG = new String[] {""} ;
      T001G4_n869TBM08_DM_KAIJO_CRF_FLG = new boolean[] {false} ;
      T001G4_A870TBM08_DM_KAIJO_MEMO_FLG = new String[] {""} ;
      T001G4_n870TBM08_DM_KAIJO_MEMO_FLG = new boolean[] {false} ;
      T001G4_A871TBM08_DM_KAIJO_DM_FLG = new String[] {""} ;
      T001G4_n871TBM08_DM_KAIJO_DM_FLG = new boolean[] {false} ;
      T001G4_A881TBM08_ICON_CAPTION = new String[] {""} ;
      T001G4_n881TBM08_ICON_CAPTION = new boolean[] {false} ;
      T001G4_A885TBM08_ICON_R = new short[1] ;
      T001G4_n885TBM08_ICON_R = new boolean[] {false} ;
      T001G4_A886TBM08_ICON_G = new short[1] ;
      T001G4_n886TBM08_ICON_G = new boolean[] {false} ;
      T001G4_A887TBM08_ICON_B = new short[1] ;
      T001G4_n887TBM08_ICON_B = new boolean[] {false} ;
      T001G4_A872TBM08_DEL_FLG = new String[] {""} ;
      T001G4_n872TBM08_DEL_FLG = new boolean[] {false} ;
      T001G4_A873TBM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G4_n873TBM08_CRT_DATETIME = new boolean[] {false} ;
      T001G4_A874TBM08_CRT_USER_ID = new String[] {""} ;
      T001G4_n874TBM08_CRT_USER_ID = new boolean[] {false} ;
      T001G4_A875TBM08_CRT_PROG_NM = new String[] {""} ;
      T001G4_n875TBM08_CRT_PROG_NM = new boolean[] {false} ;
      T001G4_A876TBM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G4_n876TBM08_UPD_DATETIME = new boolean[] {false} ;
      T001G4_A877TBM08_UPD_USER_ID = new String[] {""} ;
      T001G4_n877TBM08_UPD_USER_ID = new boolean[] {false} ;
      T001G4_A878TBM08_UPD_PROG_NM = new String[] {""} ;
      T001G4_n878TBM08_UPD_PROG_NM = new boolean[] {false} ;
      T001G4_A879TBM08_UPD_COUNT = new long[1] ;
      T001G4_n879TBM08_UPD_COUNT = new boolean[] {false} ;
      T001G5_A191TBM08_AUTH_CD = new String[] {""} ;
      T001G3_A191TBM08_AUTH_CD = new String[] {""} ;
      T001G3_A863TBM08_DM_MICHAKU_CRF_FLG = new String[] {""} ;
      T001G3_n863TBM08_DM_MICHAKU_CRF_FLG = new boolean[] {false} ;
      T001G3_A864TBM08_DM_MICHAKU_MEMO_FLG = new String[] {""} ;
      T001G3_n864TBM08_DM_MICHAKU_MEMO_FLG = new boolean[] {false} ;
      T001G3_A865TBM08_DM_MICHAKU_DM_FLG = new String[] {""} ;
      T001G3_n865TBM08_DM_MICHAKU_DM_FLG = new boolean[] {false} ;
      T001G3_A866TBM08_DM_ARRI_CRF_FLG = new String[] {""} ;
      T001G3_n866TBM08_DM_ARRI_CRF_FLG = new boolean[] {false} ;
      T001G3_A867TBM08_DM_ARRI_MEMO_FLG = new String[] {""} ;
      T001G3_n867TBM08_DM_ARRI_MEMO_FLG = new boolean[] {false} ;
      T001G3_A868TBM08_DM_ARRI_DM_FLG = new String[] {""} ;
      T001G3_n868TBM08_DM_ARRI_DM_FLG = new boolean[] {false} ;
      T001G3_A869TBM08_DM_KAIJO_CRF_FLG = new String[] {""} ;
      T001G3_n869TBM08_DM_KAIJO_CRF_FLG = new boolean[] {false} ;
      T001G3_A870TBM08_DM_KAIJO_MEMO_FLG = new String[] {""} ;
      T001G3_n870TBM08_DM_KAIJO_MEMO_FLG = new boolean[] {false} ;
      T001G3_A871TBM08_DM_KAIJO_DM_FLG = new String[] {""} ;
      T001G3_n871TBM08_DM_KAIJO_DM_FLG = new boolean[] {false} ;
      T001G3_A881TBM08_ICON_CAPTION = new String[] {""} ;
      T001G3_n881TBM08_ICON_CAPTION = new boolean[] {false} ;
      T001G3_A885TBM08_ICON_R = new short[1] ;
      T001G3_n885TBM08_ICON_R = new boolean[] {false} ;
      T001G3_A886TBM08_ICON_G = new short[1] ;
      T001G3_n886TBM08_ICON_G = new boolean[] {false} ;
      T001G3_A887TBM08_ICON_B = new short[1] ;
      T001G3_n887TBM08_ICON_B = new boolean[] {false} ;
      T001G3_A872TBM08_DEL_FLG = new String[] {""} ;
      T001G3_n872TBM08_DEL_FLG = new boolean[] {false} ;
      T001G3_A873TBM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G3_n873TBM08_CRT_DATETIME = new boolean[] {false} ;
      T001G3_A874TBM08_CRT_USER_ID = new String[] {""} ;
      T001G3_n874TBM08_CRT_USER_ID = new boolean[] {false} ;
      T001G3_A875TBM08_CRT_PROG_NM = new String[] {""} ;
      T001G3_n875TBM08_CRT_PROG_NM = new boolean[] {false} ;
      T001G3_A876TBM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G3_n876TBM08_UPD_DATETIME = new boolean[] {false} ;
      T001G3_A877TBM08_UPD_USER_ID = new String[] {""} ;
      T001G3_n877TBM08_UPD_USER_ID = new boolean[] {false} ;
      T001G3_A878TBM08_UPD_PROG_NM = new String[] {""} ;
      T001G3_n878TBM08_UPD_PROG_NM = new boolean[] {false} ;
      T001G3_A879TBM08_UPD_COUNT = new long[1] ;
      T001G3_n879TBM08_UPD_COUNT = new boolean[] {false} ;
      sMode51 = "" ;
      T001G6_A191TBM08_AUTH_CD = new String[] {""} ;
      T001G7_A191TBM08_AUTH_CD = new String[] {""} ;
      T001G2_A191TBM08_AUTH_CD = new String[] {""} ;
      T001G2_A863TBM08_DM_MICHAKU_CRF_FLG = new String[] {""} ;
      T001G2_n863TBM08_DM_MICHAKU_CRF_FLG = new boolean[] {false} ;
      T001G2_A864TBM08_DM_MICHAKU_MEMO_FLG = new String[] {""} ;
      T001G2_n864TBM08_DM_MICHAKU_MEMO_FLG = new boolean[] {false} ;
      T001G2_A865TBM08_DM_MICHAKU_DM_FLG = new String[] {""} ;
      T001G2_n865TBM08_DM_MICHAKU_DM_FLG = new boolean[] {false} ;
      T001G2_A866TBM08_DM_ARRI_CRF_FLG = new String[] {""} ;
      T001G2_n866TBM08_DM_ARRI_CRF_FLG = new boolean[] {false} ;
      T001G2_A867TBM08_DM_ARRI_MEMO_FLG = new String[] {""} ;
      T001G2_n867TBM08_DM_ARRI_MEMO_FLG = new boolean[] {false} ;
      T001G2_A868TBM08_DM_ARRI_DM_FLG = new String[] {""} ;
      T001G2_n868TBM08_DM_ARRI_DM_FLG = new boolean[] {false} ;
      T001G2_A869TBM08_DM_KAIJO_CRF_FLG = new String[] {""} ;
      T001G2_n869TBM08_DM_KAIJO_CRF_FLG = new boolean[] {false} ;
      T001G2_A870TBM08_DM_KAIJO_MEMO_FLG = new String[] {""} ;
      T001G2_n870TBM08_DM_KAIJO_MEMO_FLG = new boolean[] {false} ;
      T001G2_A871TBM08_DM_KAIJO_DM_FLG = new String[] {""} ;
      T001G2_n871TBM08_DM_KAIJO_DM_FLG = new boolean[] {false} ;
      T001G2_A881TBM08_ICON_CAPTION = new String[] {""} ;
      T001G2_n881TBM08_ICON_CAPTION = new boolean[] {false} ;
      T001G2_A885TBM08_ICON_R = new short[1] ;
      T001G2_n885TBM08_ICON_R = new boolean[] {false} ;
      T001G2_A886TBM08_ICON_G = new short[1] ;
      T001G2_n886TBM08_ICON_G = new boolean[] {false} ;
      T001G2_A887TBM08_ICON_B = new short[1] ;
      T001G2_n887TBM08_ICON_B = new boolean[] {false} ;
      T001G2_A872TBM08_DEL_FLG = new String[] {""} ;
      T001G2_n872TBM08_DEL_FLG = new boolean[] {false} ;
      T001G2_A873TBM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G2_n873TBM08_CRT_DATETIME = new boolean[] {false} ;
      T001G2_A874TBM08_CRT_USER_ID = new String[] {""} ;
      T001G2_n874TBM08_CRT_USER_ID = new boolean[] {false} ;
      T001G2_A875TBM08_CRT_PROG_NM = new String[] {""} ;
      T001G2_n875TBM08_CRT_PROG_NM = new boolean[] {false} ;
      T001G2_A876TBM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G2_n876TBM08_UPD_DATETIME = new boolean[] {false} ;
      T001G2_A877TBM08_UPD_USER_ID = new String[] {""} ;
      T001G2_n877TBM08_UPD_USER_ID = new boolean[] {false} ;
      T001G2_A878TBM08_UPD_PROG_NM = new String[] {""} ;
      T001G2_n878TBM08_UPD_PROG_NM = new boolean[] {false} ;
      T001G2_A879TBM08_UPD_COUNT = new long[1] ;
      T001G2_n879TBM08_UPD_COUNT = new boolean[] {false} ;
      T001G11_A191TBM08_AUTH_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm08_auth_inp_lvl__default(),
         new Object[] {
             new Object[] {
            T001G2_A191TBM08_AUTH_CD, T001G2_A863TBM08_DM_MICHAKU_CRF_FLG, T001G2_n863TBM08_DM_MICHAKU_CRF_FLG, T001G2_A864TBM08_DM_MICHAKU_MEMO_FLG, T001G2_n864TBM08_DM_MICHAKU_MEMO_FLG, T001G2_A865TBM08_DM_MICHAKU_DM_FLG, T001G2_n865TBM08_DM_MICHAKU_DM_FLG, T001G2_A866TBM08_DM_ARRI_CRF_FLG, T001G2_n866TBM08_DM_ARRI_CRF_FLG, T001G2_A867TBM08_DM_ARRI_MEMO_FLG,
            T001G2_n867TBM08_DM_ARRI_MEMO_FLG, T001G2_A868TBM08_DM_ARRI_DM_FLG, T001G2_n868TBM08_DM_ARRI_DM_FLG, T001G2_A869TBM08_DM_KAIJO_CRF_FLG, T001G2_n869TBM08_DM_KAIJO_CRF_FLG, T001G2_A870TBM08_DM_KAIJO_MEMO_FLG, T001G2_n870TBM08_DM_KAIJO_MEMO_FLG, T001G2_A871TBM08_DM_KAIJO_DM_FLG, T001G2_n871TBM08_DM_KAIJO_DM_FLG, T001G2_A881TBM08_ICON_CAPTION,
            T001G2_n881TBM08_ICON_CAPTION, T001G2_A885TBM08_ICON_R, T001G2_n885TBM08_ICON_R, T001G2_A886TBM08_ICON_G, T001G2_n886TBM08_ICON_G, T001G2_A887TBM08_ICON_B, T001G2_n887TBM08_ICON_B, T001G2_A872TBM08_DEL_FLG, T001G2_n872TBM08_DEL_FLG, T001G2_A873TBM08_CRT_DATETIME,
            T001G2_n873TBM08_CRT_DATETIME, T001G2_A874TBM08_CRT_USER_ID, T001G2_n874TBM08_CRT_USER_ID, T001G2_A875TBM08_CRT_PROG_NM, T001G2_n875TBM08_CRT_PROG_NM, T001G2_A876TBM08_UPD_DATETIME, T001G2_n876TBM08_UPD_DATETIME, T001G2_A877TBM08_UPD_USER_ID, T001G2_n877TBM08_UPD_USER_ID, T001G2_A878TBM08_UPD_PROG_NM,
            T001G2_n878TBM08_UPD_PROG_NM, T001G2_A879TBM08_UPD_COUNT, T001G2_n879TBM08_UPD_COUNT
            }
            , new Object[] {
            T001G3_A191TBM08_AUTH_CD, T001G3_A863TBM08_DM_MICHAKU_CRF_FLG, T001G3_n863TBM08_DM_MICHAKU_CRF_FLG, T001G3_A864TBM08_DM_MICHAKU_MEMO_FLG, T001G3_n864TBM08_DM_MICHAKU_MEMO_FLG, T001G3_A865TBM08_DM_MICHAKU_DM_FLG, T001G3_n865TBM08_DM_MICHAKU_DM_FLG, T001G3_A866TBM08_DM_ARRI_CRF_FLG, T001G3_n866TBM08_DM_ARRI_CRF_FLG, T001G3_A867TBM08_DM_ARRI_MEMO_FLG,
            T001G3_n867TBM08_DM_ARRI_MEMO_FLG, T001G3_A868TBM08_DM_ARRI_DM_FLG, T001G3_n868TBM08_DM_ARRI_DM_FLG, T001G3_A869TBM08_DM_KAIJO_CRF_FLG, T001G3_n869TBM08_DM_KAIJO_CRF_FLG, T001G3_A870TBM08_DM_KAIJO_MEMO_FLG, T001G3_n870TBM08_DM_KAIJO_MEMO_FLG, T001G3_A871TBM08_DM_KAIJO_DM_FLG, T001G3_n871TBM08_DM_KAIJO_DM_FLG, T001G3_A881TBM08_ICON_CAPTION,
            T001G3_n881TBM08_ICON_CAPTION, T001G3_A885TBM08_ICON_R, T001G3_n885TBM08_ICON_R, T001G3_A886TBM08_ICON_G, T001G3_n886TBM08_ICON_G, T001G3_A887TBM08_ICON_B, T001G3_n887TBM08_ICON_B, T001G3_A872TBM08_DEL_FLG, T001G3_n872TBM08_DEL_FLG, T001G3_A873TBM08_CRT_DATETIME,
            T001G3_n873TBM08_CRT_DATETIME, T001G3_A874TBM08_CRT_USER_ID, T001G3_n874TBM08_CRT_USER_ID, T001G3_A875TBM08_CRT_PROG_NM, T001G3_n875TBM08_CRT_PROG_NM, T001G3_A876TBM08_UPD_DATETIME, T001G3_n876TBM08_UPD_DATETIME, T001G3_A877TBM08_UPD_USER_ID, T001G3_n877TBM08_UPD_USER_ID, T001G3_A878TBM08_UPD_PROG_NM,
            T001G3_n878TBM08_UPD_PROG_NM, T001G3_A879TBM08_UPD_COUNT, T001G3_n879TBM08_UPD_COUNT
            }
            , new Object[] {
            T001G4_A191TBM08_AUTH_CD, T001G4_A863TBM08_DM_MICHAKU_CRF_FLG, T001G4_n863TBM08_DM_MICHAKU_CRF_FLG, T001G4_A864TBM08_DM_MICHAKU_MEMO_FLG, T001G4_n864TBM08_DM_MICHAKU_MEMO_FLG, T001G4_A865TBM08_DM_MICHAKU_DM_FLG, T001G4_n865TBM08_DM_MICHAKU_DM_FLG, T001G4_A866TBM08_DM_ARRI_CRF_FLG, T001G4_n866TBM08_DM_ARRI_CRF_FLG, T001G4_A867TBM08_DM_ARRI_MEMO_FLG,
            T001G4_n867TBM08_DM_ARRI_MEMO_FLG, T001G4_A868TBM08_DM_ARRI_DM_FLG, T001G4_n868TBM08_DM_ARRI_DM_FLG, T001G4_A869TBM08_DM_KAIJO_CRF_FLG, T001G4_n869TBM08_DM_KAIJO_CRF_FLG, T001G4_A870TBM08_DM_KAIJO_MEMO_FLG, T001G4_n870TBM08_DM_KAIJO_MEMO_FLG, T001G4_A871TBM08_DM_KAIJO_DM_FLG, T001G4_n871TBM08_DM_KAIJO_DM_FLG, T001G4_A881TBM08_ICON_CAPTION,
            T001G4_n881TBM08_ICON_CAPTION, T001G4_A885TBM08_ICON_R, T001G4_n885TBM08_ICON_R, T001G4_A886TBM08_ICON_G, T001G4_n886TBM08_ICON_G, T001G4_A887TBM08_ICON_B, T001G4_n887TBM08_ICON_B, T001G4_A872TBM08_DEL_FLG, T001G4_n872TBM08_DEL_FLG, T001G4_A873TBM08_CRT_DATETIME,
            T001G4_n873TBM08_CRT_DATETIME, T001G4_A874TBM08_CRT_USER_ID, T001G4_n874TBM08_CRT_USER_ID, T001G4_A875TBM08_CRT_PROG_NM, T001G4_n875TBM08_CRT_PROG_NM, T001G4_A876TBM08_UPD_DATETIME, T001G4_n876TBM08_UPD_DATETIME, T001G4_A877TBM08_UPD_USER_ID, T001G4_n877TBM08_UPD_USER_ID, T001G4_A878TBM08_UPD_PROG_NM,
            T001G4_n878TBM08_UPD_PROG_NM, T001G4_A879TBM08_UPD_COUNT, T001G4_n879TBM08_UPD_COUNT
            }
            , new Object[] {
            T001G5_A191TBM08_AUTH_CD
            }
            , new Object[] {
            T001G6_A191TBM08_AUTH_CD
            }
            , new Object[] {
            T001G7_A191TBM08_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001G11_A191TBM08_AUTH_CD
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short Z885TBM08_ICON_R ;
   private short Z886TBM08_ICON_G ;
   private short Z887TBM08_ICON_B ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A885TBM08_ICON_R ;
   private short A886TBM08_ICON_G ;
   private short A887TBM08_ICON_B ;
   private short RcdFound51 ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM08_AUTH_CD_Enabled ;
   private int edtTBM08_DM_MICHAKU_CRF_FLG_Enabled ;
   private int edtTBM08_DM_MICHAKU_MEMO_FLG_Enabled ;
   private int edtTBM08_DM_MICHAKU_DM_FLG_Enabled ;
   private int edtTBM08_DM_ARRI_CRF_FLG_Enabled ;
   private int edtTBM08_DM_ARRI_MEMO_FLG_Enabled ;
   private int edtTBM08_DM_ARRI_DM_FLG_Enabled ;
   private int edtTBM08_DM_KAIJO_CRF_FLG_Enabled ;
   private int edtTBM08_DM_KAIJO_MEMO_FLG_Enabled ;
   private int edtTBM08_DM_KAIJO_DM_FLG_Enabled ;
   private int edtTBM08_ICON_CAPTION_Enabled ;
   private int edtTBM08_ICON_R_Enabled ;
   private int edtTBM08_ICON_G_Enabled ;
   private int edtTBM08_ICON_B_Enabled ;
   private int edtTBM08_DEL_FLG_Enabled ;
   private int edtTBM08_CRT_DATETIME_Enabled ;
   private int edtTBM08_CRT_USER_ID_Enabled ;
   private int edtTBM08_CRT_PROG_NM_Enabled ;
   private int edtTBM08_UPD_DATETIME_Enabled ;
   private int edtTBM08_UPD_USER_ID_Enabled ;
   private int edtTBM08_UPD_PROG_NM_Enabled ;
   private int edtTBM08_UPD_COUNT_Enabled ;
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
   private long Z879TBM08_UPD_COUNT ;
   private long A879TBM08_UPD_COUNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM08_AUTH_CD_Internalname ;
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
   private String lblTextblocktbm08_auth_cd_Internalname ;
   private String lblTextblocktbm08_auth_cd_Jsonclick ;
   private String edtTBM08_AUTH_CD_Jsonclick ;
   private String lblTextblocktbm08_dm_michaku_crf_flg_Internalname ;
   private String lblTextblocktbm08_dm_michaku_crf_flg_Jsonclick ;
   private String edtTBM08_DM_MICHAKU_CRF_FLG_Internalname ;
   private String edtTBM08_DM_MICHAKU_CRF_FLG_Jsonclick ;
   private String lblTextblocktbm08_dm_michaku_memo_flg_Internalname ;
   private String lblTextblocktbm08_dm_michaku_memo_flg_Jsonclick ;
   private String edtTBM08_DM_MICHAKU_MEMO_FLG_Internalname ;
   private String edtTBM08_DM_MICHAKU_MEMO_FLG_Jsonclick ;
   private String lblTextblocktbm08_dm_michaku_dm_flg_Internalname ;
   private String lblTextblocktbm08_dm_michaku_dm_flg_Jsonclick ;
   private String edtTBM08_DM_MICHAKU_DM_FLG_Internalname ;
   private String edtTBM08_DM_MICHAKU_DM_FLG_Jsonclick ;
   private String lblTextblocktbm08_dm_arri_crf_flg_Internalname ;
   private String lblTextblocktbm08_dm_arri_crf_flg_Jsonclick ;
   private String edtTBM08_DM_ARRI_CRF_FLG_Internalname ;
   private String edtTBM08_DM_ARRI_CRF_FLG_Jsonclick ;
   private String lblTextblocktbm08_dm_arri_memo_flg_Internalname ;
   private String lblTextblocktbm08_dm_arri_memo_flg_Jsonclick ;
   private String edtTBM08_DM_ARRI_MEMO_FLG_Internalname ;
   private String edtTBM08_DM_ARRI_MEMO_FLG_Jsonclick ;
   private String lblTextblocktbm08_dm_arri_dm_flg_Internalname ;
   private String lblTextblocktbm08_dm_arri_dm_flg_Jsonclick ;
   private String edtTBM08_DM_ARRI_DM_FLG_Internalname ;
   private String edtTBM08_DM_ARRI_DM_FLG_Jsonclick ;
   private String lblTextblocktbm08_dm_kaijo_crf_flg_Internalname ;
   private String lblTextblocktbm08_dm_kaijo_crf_flg_Jsonclick ;
   private String edtTBM08_DM_KAIJO_CRF_FLG_Internalname ;
   private String edtTBM08_DM_KAIJO_CRF_FLG_Jsonclick ;
   private String lblTextblocktbm08_dm_kaijo_memo_flg_Internalname ;
   private String lblTextblocktbm08_dm_kaijo_memo_flg_Jsonclick ;
   private String edtTBM08_DM_KAIJO_MEMO_FLG_Internalname ;
   private String edtTBM08_DM_KAIJO_MEMO_FLG_Jsonclick ;
   private String lblTextblocktbm08_dm_kaijo_dm_flg_Internalname ;
   private String lblTextblocktbm08_dm_kaijo_dm_flg_Jsonclick ;
   private String edtTBM08_DM_KAIJO_DM_FLG_Internalname ;
   private String edtTBM08_DM_KAIJO_DM_FLG_Jsonclick ;
   private String lblTextblocktbm08_icon_caption_Internalname ;
   private String lblTextblocktbm08_icon_caption_Jsonclick ;
   private String edtTBM08_ICON_CAPTION_Internalname ;
   private String edtTBM08_ICON_CAPTION_Jsonclick ;
   private String lblTextblocktbm08_icon_r_Internalname ;
   private String lblTextblocktbm08_icon_r_Jsonclick ;
   private String edtTBM08_ICON_R_Internalname ;
   private String edtTBM08_ICON_R_Jsonclick ;
   private String lblTextblocktbm08_icon_g_Internalname ;
   private String lblTextblocktbm08_icon_g_Jsonclick ;
   private String edtTBM08_ICON_G_Internalname ;
   private String edtTBM08_ICON_G_Jsonclick ;
   private String lblTextblocktbm08_icon_b_Internalname ;
   private String lblTextblocktbm08_icon_b_Jsonclick ;
   private String edtTBM08_ICON_B_Internalname ;
   private String edtTBM08_ICON_B_Jsonclick ;
   private String lblTextblocktbm08_del_flg_Internalname ;
   private String lblTextblocktbm08_del_flg_Jsonclick ;
   private String edtTBM08_DEL_FLG_Internalname ;
   private String edtTBM08_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm08_crt_datetime_Internalname ;
   private String lblTextblocktbm08_crt_datetime_Jsonclick ;
   private String edtTBM08_CRT_DATETIME_Internalname ;
   private String edtTBM08_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm08_crt_user_id_Internalname ;
   private String lblTextblocktbm08_crt_user_id_Jsonclick ;
   private String edtTBM08_CRT_USER_ID_Internalname ;
   private String edtTBM08_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm08_crt_prog_nm_Internalname ;
   private String lblTextblocktbm08_crt_prog_nm_Jsonclick ;
   private String edtTBM08_CRT_PROG_NM_Internalname ;
   private String edtTBM08_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm08_upd_datetime_Internalname ;
   private String lblTextblocktbm08_upd_datetime_Jsonclick ;
   private String edtTBM08_UPD_DATETIME_Internalname ;
   private String edtTBM08_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm08_upd_user_id_Internalname ;
   private String lblTextblocktbm08_upd_user_id_Jsonclick ;
   private String edtTBM08_UPD_USER_ID_Internalname ;
   private String edtTBM08_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm08_upd_prog_nm_Internalname ;
   private String lblTextblocktbm08_upd_prog_nm_Jsonclick ;
   private String edtTBM08_UPD_PROG_NM_Internalname ;
   private String edtTBM08_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm08_upd_count_Internalname ;
   private String lblTextblocktbm08_upd_count_Jsonclick ;
   private String edtTBM08_UPD_COUNT_Internalname ;
   private String edtTBM08_UPD_COUNT_Jsonclick ;
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
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String sMode51 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private java.util.Date Z873TBM08_CRT_DATETIME ;
   private java.util.Date Z876TBM08_UPD_DATETIME ;
   private java.util.Date A873TBM08_CRT_DATETIME ;
   private java.util.Date A876TBM08_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n863TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean n864TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean n865TBM08_DM_MICHAKU_DM_FLG ;
   private boolean n866TBM08_DM_ARRI_CRF_FLG ;
   private boolean n867TBM08_DM_ARRI_MEMO_FLG ;
   private boolean n868TBM08_DM_ARRI_DM_FLG ;
   private boolean n869TBM08_DM_KAIJO_CRF_FLG ;
   private boolean n870TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean n871TBM08_DM_KAIJO_DM_FLG ;
   private boolean n881TBM08_ICON_CAPTION ;
   private boolean n885TBM08_ICON_R ;
   private boolean n886TBM08_ICON_G ;
   private boolean n887TBM08_ICON_B ;
   private boolean n872TBM08_DEL_FLG ;
   private boolean n873TBM08_CRT_DATETIME ;
   private boolean n874TBM08_CRT_USER_ID ;
   private boolean n875TBM08_CRT_PROG_NM ;
   private boolean n876TBM08_UPD_DATETIME ;
   private boolean n877TBM08_UPD_USER_ID ;
   private boolean n878TBM08_UPD_PROG_NM ;
   private boolean n879TBM08_UPD_COUNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z191TBM08_AUTH_CD ;
   private String Z863TBM08_DM_MICHAKU_CRF_FLG ;
   private String Z864TBM08_DM_MICHAKU_MEMO_FLG ;
   private String Z865TBM08_DM_MICHAKU_DM_FLG ;
   private String Z866TBM08_DM_ARRI_CRF_FLG ;
   private String Z867TBM08_DM_ARRI_MEMO_FLG ;
   private String Z868TBM08_DM_ARRI_DM_FLG ;
   private String Z869TBM08_DM_KAIJO_CRF_FLG ;
   private String Z870TBM08_DM_KAIJO_MEMO_FLG ;
   private String Z871TBM08_DM_KAIJO_DM_FLG ;
   private String Z881TBM08_ICON_CAPTION ;
   private String Z872TBM08_DEL_FLG ;
   private String Z874TBM08_CRT_USER_ID ;
   private String Z875TBM08_CRT_PROG_NM ;
   private String Z877TBM08_UPD_USER_ID ;
   private String Z878TBM08_UPD_PROG_NM ;
   private String A191TBM08_AUTH_CD ;
   private String A863TBM08_DM_MICHAKU_CRF_FLG ;
   private String A864TBM08_DM_MICHAKU_MEMO_FLG ;
   private String A865TBM08_DM_MICHAKU_DM_FLG ;
   private String A866TBM08_DM_ARRI_CRF_FLG ;
   private String A867TBM08_DM_ARRI_MEMO_FLG ;
   private String A868TBM08_DM_ARRI_DM_FLG ;
   private String A869TBM08_DM_KAIJO_CRF_FLG ;
   private String A870TBM08_DM_KAIJO_MEMO_FLG ;
   private String A871TBM08_DM_KAIJO_DM_FLG ;
   private String A881TBM08_ICON_CAPTION ;
   private String A872TBM08_DEL_FLG ;
   private String A874TBM08_CRT_USER_ID ;
   private String A875TBM08_CRT_PROG_NM ;
   private String A877TBM08_UPD_USER_ID ;
   private String A878TBM08_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001G4_A191TBM08_AUTH_CD ;
   private String[] T001G4_A863TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean[] T001G4_n863TBM08_DM_MICHAKU_CRF_FLG ;
   private String[] T001G4_A864TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean[] T001G4_n864TBM08_DM_MICHAKU_MEMO_FLG ;
   private String[] T001G4_A865TBM08_DM_MICHAKU_DM_FLG ;
   private boolean[] T001G4_n865TBM08_DM_MICHAKU_DM_FLG ;
   private String[] T001G4_A866TBM08_DM_ARRI_CRF_FLG ;
   private boolean[] T001G4_n866TBM08_DM_ARRI_CRF_FLG ;
   private String[] T001G4_A867TBM08_DM_ARRI_MEMO_FLG ;
   private boolean[] T001G4_n867TBM08_DM_ARRI_MEMO_FLG ;
   private String[] T001G4_A868TBM08_DM_ARRI_DM_FLG ;
   private boolean[] T001G4_n868TBM08_DM_ARRI_DM_FLG ;
   private String[] T001G4_A869TBM08_DM_KAIJO_CRF_FLG ;
   private boolean[] T001G4_n869TBM08_DM_KAIJO_CRF_FLG ;
   private String[] T001G4_A870TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean[] T001G4_n870TBM08_DM_KAIJO_MEMO_FLG ;
   private String[] T001G4_A871TBM08_DM_KAIJO_DM_FLG ;
   private boolean[] T001G4_n871TBM08_DM_KAIJO_DM_FLG ;
   private String[] T001G4_A881TBM08_ICON_CAPTION ;
   private boolean[] T001G4_n881TBM08_ICON_CAPTION ;
   private short[] T001G4_A885TBM08_ICON_R ;
   private boolean[] T001G4_n885TBM08_ICON_R ;
   private short[] T001G4_A886TBM08_ICON_G ;
   private boolean[] T001G4_n886TBM08_ICON_G ;
   private short[] T001G4_A887TBM08_ICON_B ;
   private boolean[] T001G4_n887TBM08_ICON_B ;
   private String[] T001G4_A872TBM08_DEL_FLG ;
   private boolean[] T001G4_n872TBM08_DEL_FLG ;
   private java.util.Date[] T001G4_A873TBM08_CRT_DATETIME ;
   private boolean[] T001G4_n873TBM08_CRT_DATETIME ;
   private String[] T001G4_A874TBM08_CRT_USER_ID ;
   private boolean[] T001G4_n874TBM08_CRT_USER_ID ;
   private String[] T001G4_A875TBM08_CRT_PROG_NM ;
   private boolean[] T001G4_n875TBM08_CRT_PROG_NM ;
   private java.util.Date[] T001G4_A876TBM08_UPD_DATETIME ;
   private boolean[] T001G4_n876TBM08_UPD_DATETIME ;
   private String[] T001G4_A877TBM08_UPD_USER_ID ;
   private boolean[] T001G4_n877TBM08_UPD_USER_ID ;
   private String[] T001G4_A878TBM08_UPD_PROG_NM ;
   private boolean[] T001G4_n878TBM08_UPD_PROG_NM ;
   private long[] T001G4_A879TBM08_UPD_COUNT ;
   private boolean[] T001G4_n879TBM08_UPD_COUNT ;
   private String[] T001G5_A191TBM08_AUTH_CD ;
   private String[] T001G3_A191TBM08_AUTH_CD ;
   private String[] T001G3_A863TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean[] T001G3_n863TBM08_DM_MICHAKU_CRF_FLG ;
   private String[] T001G3_A864TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean[] T001G3_n864TBM08_DM_MICHAKU_MEMO_FLG ;
   private String[] T001G3_A865TBM08_DM_MICHAKU_DM_FLG ;
   private boolean[] T001G3_n865TBM08_DM_MICHAKU_DM_FLG ;
   private String[] T001G3_A866TBM08_DM_ARRI_CRF_FLG ;
   private boolean[] T001G3_n866TBM08_DM_ARRI_CRF_FLG ;
   private String[] T001G3_A867TBM08_DM_ARRI_MEMO_FLG ;
   private boolean[] T001G3_n867TBM08_DM_ARRI_MEMO_FLG ;
   private String[] T001G3_A868TBM08_DM_ARRI_DM_FLG ;
   private boolean[] T001G3_n868TBM08_DM_ARRI_DM_FLG ;
   private String[] T001G3_A869TBM08_DM_KAIJO_CRF_FLG ;
   private boolean[] T001G3_n869TBM08_DM_KAIJO_CRF_FLG ;
   private String[] T001G3_A870TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean[] T001G3_n870TBM08_DM_KAIJO_MEMO_FLG ;
   private String[] T001G3_A871TBM08_DM_KAIJO_DM_FLG ;
   private boolean[] T001G3_n871TBM08_DM_KAIJO_DM_FLG ;
   private String[] T001G3_A881TBM08_ICON_CAPTION ;
   private boolean[] T001G3_n881TBM08_ICON_CAPTION ;
   private short[] T001G3_A885TBM08_ICON_R ;
   private boolean[] T001G3_n885TBM08_ICON_R ;
   private short[] T001G3_A886TBM08_ICON_G ;
   private boolean[] T001G3_n886TBM08_ICON_G ;
   private short[] T001G3_A887TBM08_ICON_B ;
   private boolean[] T001G3_n887TBM08_ICON_B ;
   private String[] T001G3_A872TBM08_DEL_FLG ;
   private boolean[] T001G3_n872TBM08_DEL_FLG ;
   private java.util.Date[] T001G3_A873TBM08_CRT_DATETIME ;
   private boolean[] T001G3_n873TBM08_CRT_DATETIME ;
   private String[] T001G3_A874TBM08_CRT_USER_ID ;
   private boolean[] T001G3_n874TBM08_CRT_USER_ID ;
   private String[] T001G3_A875TBM08_CRT_PROG_NM ;
   private boolean[] T001G3_n875TBM08_CRT_PROG_NM ;
   private java.util.Date[] T001G3_A876TBM08_UPD_DATETIME ;
   private boolean[] T001G3_n876TBM08_UPD_DATETIME ;
   private String[] T001G3_A877TBM08_UPD_USER_ID ;
   private boolean[] T001G3_n877TBM08_UPD_USER_ID ;
   private String[] T001G3_A878TBM08_UPD_PROG_NM ;
   private boolean[] T001G3_n878TBM08_UPD_PROG_NM ;
   private long[] T001G3_A879TBM08_UPD_COUNT ;
   private boolean[] T001G3_n879TBM08_UPD_COUNT ;
   private String[] T001G6_A191TBM08_AUTH_CD ;
   private String[] T001G7_A191TBM08_AUTH_CD ;
   private String[] T001G2_A191TBM08_AUTH_CD ;
   private String[] T001G2_A863TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean[] T001G2_n863TBM08_DM_MICHAKU_CRF_FLG ;
   private String[] T001G2_A864TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean[] T001G2_n864TBM08_DM_MICHAKU_MEMO_FLG ;
   private String[] T001G2_A865TBM08_DM_MICHAKU_DM_FLG ;
   private boolean[] T001G2_n865TBM08_DM_MICHAKU_DM_FLG ;
   private String[] T001G2_A866TBM08_DM_ARRI_CRF_FLG ;
   private boolean[] T001G2_n866TBM08_DM_ARRI_CRF_FLG ;
   private String[] T001G2_A867TBM08_DM_ARRI_MEMO_FLG ;
   private boolean[] T001G2_n867TBM08_DM_ARRI_MEMO_FLG ;
   private String[] T001G2_A868TBM08_DM_ARRI_DM_FLG ;
   private boolean[] T001G2_n868TBM08_DM_ARRI_DM_FLG ;
   private String[] T001G2_A869TBM08_DM_KAIJO_CRF_FLG ;
   private boolean[] T001G2_n869TBM08_DM_KAIJO_CRF_FLG ;
   private String[] T001G2_A870TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean[] T001G2_n870TBM08_DM_KAIJO_MEMO_FLG ;
   private String[] T001G2_A871TBM08_DM_KAIJO_DM_FLG ;
   private boolean[] T001G2_n871TBM08_DM_KAIJO_DM_FLG ;
   private String[] T001G2_A881TBM08_ICON_CAPTION ;
   private boolean[] T001G2_n881TBM08_ICON_CAPTION ;
   private short[] T001G2_A885TBM08_ICON_R ;
   private boolean[] T001G2_n885TBM08_ICON_R ;
   private short[] T001G2_A886TBM08_ICON_G ;
   private boolean[] T001G2_n886TBM08_ICON_G ;
   private short[] T001G2_A887TBM08_ICON_B ;
   private boolean[] T001G2_n887TBM08_ICON_B ;
   private String[] T001G2_A872TBM08_DEL_FLG ;
   private boolean[] T001G2_n872TBM08_DEL_FLG ;
   private java.util.Date[] T001G2_A873TBM08_CRT_DATETIME ;
   private boolean[] T001G2_n873TBM08_CRT_DATETIME ;
   private String[] T001G2_A874TBM08_CRT_USER_ID ;
   private boolean[] T001G2_n874TBM08_CRT_USER_ID ;
   private String[] T001G2_A875TBM08_CRT_PROG_NM ;
   private boolean[] T001G2_n875TBM08_CRT_PROG_NM ;
   private java.util.Date[] T001G2_A876TBM08_UPD_DATETIME ;
   private boolean[] T001G2_n876TBM08_UPD_DATETIME ;
   private String[] T001G2_A877TBM08_UPD_USER_ID ;
   private boolean[] T001G2_n877TBM08_UPD_USER_ID ;
   private String[] T001G2_A878TBM08_UPD_PROG_NM ;
   private boolean[] T001G2_n878TBM08_UPD_PROG_NM ;
   private long[] T001G2_A879TBM08_UPD_COUNT ;
   private boolean[] T001G2_n879TBM08_UPD_COUNT ;
   private String[] T001G11_A191TBM08_AUTH_CD ;
}

final  class tbm08_auth_inp_lvl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001G2", "SELECT `TBM08_AUTH_CD`, `TBM08_DM_MICHAKU_CRF_FLG`, `TBM08_DM_MICHAKU_MEMO_FLG`, `TBM08_DM_MICHAKU_DM_FLG`, `TBM08_DM_ARRI_CRF_FLG`, `TBM08_DM_ARRI_MEMO_FLG`, `TBM08_DM_ARRI_DM_FLG`, `TBM08_DM_KAIJO_CRF_FLG`, `TBM08_DM_KAIJO_MEMO_FLG`, `TBM08_DM_KAIJO_DM_FLG`, `TBM08_ICON_CAPTION`, `TBM08_ICON_R`, `TBM08_ICON_G`, `TBM08_ICON_B`, `TBM08_DEL_FLG`, `TBM08_CRT_DATETIME`, `TBM08_CRT_USER_ID`, `TBM08_CRT_PROG_NM`, `TBM08_UPD_DATETIME`, `TBM08_UPD_USER_ID`, `TBM08_UPD_PROG_NM`, `TBM08_UPD_COUNT` FROM `TBM08_AUTH_INP_LVL` WHERE `TBM08_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001G3", "SELECT `TBM08_AUTH_CD`, `TBM08_DM_MICHAKU_CRF_FLG`, `TBM08_DM_MICHAKU_MEMO_FLG`, `TBM08_DM_MICHAKU_DM_FLG`, `TBM08_DM_ARRI_CRF_FLG`, `TBM08_DM_ARRI_MEMO_FLG`, `TBM08_DM_ARRI_DM_FLG`, `TBM08_DM_KAIJO_CRF_FLG`, `TBM08_DM_KAIJO_MEMO_FLG`, `TBM08_DM_KAIJO_DM_FLG`, `TBM08_ICON_CAPTION`, `TBM08_ICON_R`, `TBM08_ICON_G`, `TBM08_ICON_B`, `TBM08_DEL_FLG`, `TBM08_CRT_DATETIME`, `TBM08_CRT_USER_ID`, `TBM08_CRT_PROG_NM`, `TBM08_UPD_DATETIME`, `TBM08_UPD_USER_ID`, `TBM08_UPD_PROG_NM`, `TBM08_UPD_COUNT` FROM `TBM08_AUTH_INP_LVL` WHERE `TBM08_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001G4", "SELECT TM1.`TBM08_AUTH_CD`, TM1.`TBM08_DM_MICHAKU_CRF_FLG`, TM1.`TBM08_DM_MICHAKU_MEMO_FLG`, TM1.`TBM08_DM_MICHAKU_DM_FLG`, TM1.`TBM08_DM_ARRI_CRF_FLG`, TM1.`TBM08_DM_ARRI_MEMO_FLG`, TM1.`TBM08_DM_ARRI_DM_FLG`, TM1.`TBM08_DM_KAIJO_CRF_FLG`, TM1.`TBM08_DM_KAIJO_MEMO_FLG`, TM1.`TBM08_DM_KAIJO_DM_FLG`, TM1.`TBM08_ICON_CAPTION`, TM1.`TBM08_ICON_R`, TM1.`TBM08_ICON_G`, TM1.`TBM08_ICON_B`, TM1.`TBM08_DEL_FLG`, TM1.`TBM08_CRT_DATETIME`, TM1.`TBM08_CRT_USER_ID`, TM1.`TBM08_CRT_PROG_NM`, TM1.`TBM08_UPD_DATETIME`, TM1.`TBM08_UPD_USER_ID`, TM1.`TBM08_UPD_PROG_NM`, TM1.`TBM08_UPD_COUNT` FROM `TBM08_AUTH_INP_LVL` TM1 WHERE TM1.`TBM08_AUTH_CD` = ? ORDER BY TM1.`TBM08_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T001G5", "SELECT `TBM08_AUTH_CD` FROM `TBM08_AUTH_INP_LVL` WHERE `TBM08_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001G6", "SELECT `TBM08_AUTH_CD` FROM `TBM08_AUTH_INP_LVL` WHERE ( `TBM08_AUTH_CD` > ?) ORDER BY `TBM08_AUTH_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001G7", "SELECT `TBM08_AUTH_CD` FROM `TBM08_AUTH_INP_LVL` WHERE ( `TBM08_AUTH_CD` < ?) ORDER BY `TBM08_AUTH_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001G8", "INSERT INTO `TBM08_AUTH_INP_LVL`(`TBM08_AUTH_CD`, `TBM08_DM_MICHAKU_CRF_FLG`, `TBM08_DM_MICHAKU_MEMO_FLG`, `TBM08_DM_MICHAKU_DM_FLG`, `TBM08_DM_ARRI_CRF_FLG`, `TBM08_DM_ARRI_MEMO_FLG`, `TBM08_DM_ARRI_DM_FLG`, `TBM08_DM_KAIJO_CRF_FLG`, `TBM08_DM_KAIJO_MEMO_FLG`, `TBM08_DM_KAIJO_DM_FLG`, `TBM08_ICON_CAPTION`, `TBM08_ICON_R`, `TBM08_ICON_G`, `TBM08_ICON_B`, `TBM08_DEL_FLG`, `TBM08_CRT_DATETIME`, `TBM08_CRT_USER_ID`, `TBM08_CRT_PROG_NM`, `TBM08_UPD_DATETIME`, `TBM08_UPD_USER_ID`, `TBM08_UPD_PROG_NM`, `TBM08_UPD_COUNT`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001G9", "UPDATE `TBM08_AUTH_INP_LVL` SET `TBM08_DM_MICHAKU_CRF_FLG`=?, `TBM08_DM_MICHAKU_MEMO_FLG`=?, `TBM08_DM_MICHAKU_DM_FLG`=?, `TBM08_DM_ARRI_CRF_FLG`=?, `TBM08_DM_ARRI_MEMO_FLG`=?, `TBM08_DM_ARRI_DM_FLG`=?, `TBM08_DM_KAIJO_CRF_FLG`=?, `TBM08_DM_KAIJO_MEMO_FLG`=?, `TBM08_DM_KAIJO_DM_FLG`=?, `TBM08_ICON_CAPTION`=?, `TBM08_ICON_R`=?, `TBM08_ICON_G`=?, `TBM08_ICON_B`=?, `TBM08_DEL_FLG`=?, `TBM08_CRT_DATETIME`=?, `TBM08_CRT_USER_ID`=?, `TBM08_CRT_PROG_NM`=?, `TBM08_UPD_DATETIME`=?, `TBM08_UPD_USER_ID`=?, `TBM08_UPD_PROG_NM`=?, `TBM08_UPD_COUNT`=?  WHERE `TBM08_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T001G10", "DELETE FROM `TBM08_AUTH_INP_LVL`  WHERE `TBM08_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T001G11", "SELECT `TBM08_AUTH_CD` FROM `TBM08_AUTH_INP_LVL` ORDER BY `TBM08_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
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
               ((short[]) buf[21])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
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
               ((short[]) buf[21])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getVarchar(3) ;
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4) ;
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getVarchar(5) ;
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getVarchar(6) ;
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
               ((short[]) buf[21])[0] = rslt.getShort(12) ;
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((short[]) buf[23])[0] = rslt.getShort(13) ;
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((short[]) buf[25])[0] = rslt.getShort(14) ;
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getVarchar(15) ;
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[29])[0] = rslt.getGXDateTime(16) ;
               ((boolean[]) buf[30])[0] = rslt.wasNull();
               ((String[]) buf[31])[0] = rslt.getVarchar(17) ;
               ((boolean[]) buf[32])[0] = rslt.wasNull();
               ((String[]) buf[33])[0] = rslt.getVarchar(18) ;
               ((boolean[]) buf[34])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[35])[0] = rslt.getGXDateTime(19) ;
               ((boolean[]) buf[36])[0] = rslt.wasNull();
               ((String[]) buf[37])[0] = rslt.getVarchar(20) ;
               ((boolean[]) buf[38])[0] = rslt.wasNull();
               ((String[]) buf[39])[0] = rslt.getVarchar(21) ;
               ((boolean[]) buf[40])[0] = rslt.wasNull();
               ((long[]) buf[41])[0] = rslt.getLong(22) ;
               ((boolean[]) buf[42])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 6 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[2], 1);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[4], 1);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[8], 1);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[10], 1);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(7, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(9, (String)parms[16], 1);
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
                  stmt.setVarchar(11, (String)parms[20], 2);
               }
               if ( ((Boolean) parms[21]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[22]).shortValue());
               }
               if ( ((Boolean) parms[23]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[24]).shortValue());
               }
               if ( ((Boolean) parms[25]).booleanValue() )
               {
                  stmt.setNull( 14 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(14, ((Number) parms[26]).shortValue());
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
                  stmt.setNull( 16 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(16, (java.util.Date)parms[30], false);
               }
               if ( ((Boolean) parms[31]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[32], 128);
               }
               if ( ((Boolean) parms[33]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(18, (String)parms[34], 40);
               }
               if ( ((Boolean) parms[35]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(19, (java.util.Date)parms[36], false);
               }
               if ( ((Boolean) parms[37]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[38], 128);
               }
               if ( ((Boolean) parms[39]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(21, (String)parms[40], 40);
               }
               if ( ((Boolean) parms[41]).booleanValue() )
               {
                  stmt.setNull( 22 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(22, ((Number) parms[42]).longValue());
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(1, (String)parms[1], 1);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(2, (String)parms[3], 1);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 1);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[7], 1);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[9], 1);
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
                  stmt.setVarchar(8, (String)parms[15], 1);
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
                  stmt.setVarchar(10, (String)parms[19], 2);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[21]).shortValue());
               }
               if ( ((Boolean) parms[22]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[23]).shortValue());
               }
               if ( ((Boolean) parms[24]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(13, ((Number) parms[25]).shortValue());
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
                  stmt.setNull( 15 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(15, (java.util.Date)parms[29], false);
               }
               if ( ((Boolean) parms[30]).booleanValue() )
               {
                  stmt.setNull( 16 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(16, (String)parms[31], 128);
               }
               if ( ((Boolean) parms[32]).booleanValue() )
               {
                  stmt.setNull( 17 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(17, (String)parms[33], 40);
               }
               if ( ((Boolean) parms[34]).booleanValue() )
               {
                  stmt.setNull( 18 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(18, (java.util.Date)parms[35], false);
               }
               if ( ((Boolean) parms[36]).booleanValue() )
               {
                  stmt.setNull( 19 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(19, (String)parms[37], 128);
               }
               if ( ((Boolean) parms[38]).booleanValue() )
               {
                  stmt.setNull( 20 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(20, (String)parms[39], 40);
               }
               if ( ((Boolean) parms[40]).booleanValue() )
               {
                  stmt.setNull( 21 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(21, ((Number) parms[41]).longValue());
               }
               stmt.setVarchar(22, (String)parms[42], 2, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
      }
   }

}

