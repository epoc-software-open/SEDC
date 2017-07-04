/*
               File: tbm08_auth_inp_lvl_impl
        Description: 権限別入力制御マスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:57:23.60
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
      Form.getMeta().addItem("Description", "権限別入力制御マスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
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
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"権限別入力制御マスタ"+"</legend>") ;
         wb_table3_27_1G51( true) ;
      }
      return  ;
   }

   public void wb_table3_27_1G51e( boolean wbgen )
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

   public void wb_table3_27_1G51( boolean wbgen )
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
         wb_table4_33_1G51( true) ;
      }
      return  ;
   }

   public void wb_table4_33_1G51e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 146,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM08_AUTH_INP_LVL.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 147,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM08_AUTH_INP_LVL.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 148,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_1G51e( true) ;
      }
      else
      {
         wb_table3_27_1G51e( false) ;
      }
   }

   public void wb_table4_33_1G51( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_auth_cd_Internalname, "権限コード", "", "", lblTextblocktbm08_auth_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A849TBM08_AUTH_CD", A849TBM08_AUTH_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_AUTH_CD_Internalname, GXutil.rtrim( A849TBM08_AUTH_CD), GXutil.rtrim( localUtil.format( A849TBM08_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM08_AUTH_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_AUTH_CD_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_michaku_crf_flg_Internalname, "CRF入力可能フラグ(0:不可 1:可）", "", "", lblTextblocktbm08_dm_michaku_crf_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A850TBM08_DM_MICHAKU_CRF_FLG", A850TBM08_DM_MICHAKU_CRF_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_MICHAKU_CRF_FLG_Internalname, GXutil.rtrim( A850TBM08_DM_MICHAKU_CRF_FLG), GXutil.rtrim( localUtil.format( A850TBM08_DM_MICHAKU_CRF_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM08_DM_MICHAKU_CRF_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_DM_MICHAKU_CRF_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_michaku_memo_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_michaku_memo_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A851TBM08_DM_MICHAKU_MEMO_FLG", A851TBM08_DM_MICHAKU_MEMO_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_MICHAKU_MEMO_FLG_Internalname, GXutil.rtrim( A851TBM08_DM_MICHAKU_MEMO_FLG), GXutil.rtrim( localUtil.format( A851TBM08_DM_MICHAKU_MEMO_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM08_DM_MICHAKU_MEMO_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_DM_MICHAKU_MEMO_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_michaku_dm_flg_Internalname, "DM提出可能フラグ（0:不可 1:可）", "", "", lblTextblocktbm08_dm_michaku_dm_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A852TBM08_DM_MICHAKU_DM_FLG", A852TBM08_DM_MICHAKU_DM_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_MICHAKU_DM_FLG_Internalname, GXutil.rtrim( A852TBM08_DM_MICHAKU_DM_FLG), GXutil.rtrim( localUtil.format( A852TBM08_DM_MICHAKU_DM_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM08_DM_MICHAKU_DM_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_DM_MICHAKU_DM_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_arri_crf_flg_Internalname, "CRF入力可能フラグ(0:不可 1:可）", "", "", lblTextblocktbm08_dm_arri_crf_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A853TBM08_DM_ARRI_CRF_FLG", A853TBM08_DM_ARRI_CRF_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_ARRI_CRF_FLG_Internalname, GXutil.rtrim( A853TBM08_DM_ARRI_CRF_FLG), GXutil.rtrim( localUtil.format( A853TBM08_DM_ARRI_CRF_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM08_DM_ARRI_CRF_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_DM_ARRI_CRF_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_arri_memo_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_arri_memo_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A854TBM08_DM_ARRI_MEMO_FLG", A854TBM08_DM_ARRI_MEMO_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_ARRI_MEMO_FLG_Internalname, GXutil.rtrim( A854TBM08_DM_ARRI_MEMO_FLG), GXutil.rtrim( localUtil.format( A854TBM08_DM_ARRI_MEMO_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM08_DM_ARRI_MEMO_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_DM_ARRI_MEMO_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_arri_dm_flg_Internalname, "DM提出可能フラグ（0:不可 1:可）", "", "", lblTextblocktbm08_dm_arri_dm_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A855TBM08_DM_ARRI_DM_FLG", A855TBM08_DM_ARRI_DM_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_ARRI_DM_FLG_Internalname, GXutil.rtrim( A855TBM08_DM_ARRI_DM_FLG), GXutil.rtrim( localUtil.format( A855TBM08_DM_ARRI_DM_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM08_DM_ARRI_DM_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_DM_ARRI_DM_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_kaijo_crf_flg_Internalname, "CRF入力可能フラグ（0:不可 1:可）", "", "", lblTextblocktbm08_dm_kaijo_crf_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A856TBM08_DM_KAIJO_CRF_FLG", A856TBM08_DM_KAIJO_CRF_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_KAIJO_CRF_FLG_Internalname, GXutil.rtrim( A856TBM08_DM_KAIJO_CRF_FLG), GXutil.rtrim( localUtil.format( A856TBM08_DM_KAIJO_CRF_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM08_DM_KAIJO_CRF_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_DM_KAIJO_CRF_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_kaijo_memo_flg_Internalname, "1:可）", "", "", lblTextblocktbm08_dm_kaijo_memo_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A857TBM08_DM_KAIJO_MEMO_FLG", A857TBM08_DM_KAIJO_MEMO_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_KAIJO_MEMO_FLG_Internalname, GXutil.rtrim( A857TBM08_DM_KAIJO_MEMO_FLG), GXutil.rtrim( localUtil.format( A857TBM08_DM_KAIJO_MEMO_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM08_DM_KAIJO_MEMO_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_DM_KAIJO_MEMO_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_dm_kaijo_dm_flg_Internalname, "DM提出可能フラグ（0:不可 1:可）", "", "", lblTextblocktbm08_dm_kaijo_dm_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A858TBM08_DM_KAIJO_DM_FLG", A858TBM08_DM_KAIJO_DM_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DM_KAIJO_DM_FLG_Internalname, GXutil.rtrim( A858TBM08_DM_KAIJO_DM_FLG), GXutil.rtrim( localUtil.format( A858TBM08_DM_KAIJO_DM_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM08_DM_KAIJO_DM_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_DM_KAIJO_DM_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_icon_caption_Internalname, "アイコン文字", "", "", lblTextblocktbm08_icon_caption_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A868TBM08_ICON_CAPTION", A868TBM08_ICON_CAPTION);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_ICON_CAPTION_Internalname, GXutil.rtrim( A868TBM08_ICON_CAPTION), GXutil.rtrim( localUtil.format( A868TBM08_ICON_CAPTION, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM08_ICON_CAPTION_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_ICON_CAPTION_Enabled, 0, 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_icon_r_Internalname, "R", "", "", lblTextblocktbm08_icon_r_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A872TBM08_ICON_R", GXutil.ltrim( GXutil.str( A872TBM08_ICON_R, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_ICON_R_Internalname, GXutil.ltrim( localUtil.ntoc( A872TBM08_ICON_R, (byte)(4), (byte)(0), ".", "")), ((edtTBM08_ICON_R_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A872TBM08_ICON_R), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A872TBM08_ICON_R), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM08_ICON_R_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_ICON_R_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_icon_g_Internalname, "G", "", "", lblTextblocktbm08_icon_g_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A873TBM08_ICON_G", GXutil.ltrim( GXutil.str( A873TBM08_ICON_G, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_ICON_G_Internalname, GXutil.ltrim( localUtil.ntoc( A873TBM08_ICON_G, (byte)(4), (byte)(0), ".", "")), ((edtTBM08_ICON_G_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A873TBM08_ICON_G), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A873TBM08_ICON_G), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(98);\"", "", "", "", "", edtTBM08_ICON_G_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_ICON_G_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_icon_b_Internalname, "B", "", "", lblTextblocktbm08_icon_b_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A874TBM08_ICON_B", GXutil.ltrim( GXutil.str( A874TBM08_ICON_B, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_ICON_B_Internalname, GXutil.ltrim( localUtil.ntoc( A874TBM08_ICON_B, (byte)(4), (byte)(0), ".", "")), ((edtTBM08_ICON_B_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A874TBM08_ICON_B), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A874TBM08_ICON_B), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(103);\"", "", "", "", "", edtTBM08_ICON_B_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_ICON_B_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm08_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A859TBM08_DEL_FLG", A859TBM08_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 108,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_DEL_FLG_Internalname, GXutil.rtrim( A859TBM08_DEL_FLG), GXutil.rtrim( localUtil.format( A859TBM08_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(108);\"", "", "", "", "", edtTBM08_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm08_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A860TBM08_CRT_DATETIME", localUtil.ttoc( A860TBM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM08_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_CRT_DATETIME_Internalname, localUtil.format(A860TBM08_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A860TBM08_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(113);\"", "", "", "", "", edtTBM08_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM08_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM08_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_crt_user_id_Internalname, "ID", "", "", lblTextblocktbm08_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A861TBM08_CRT_USER_ID", A861TBM08_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_CRT_USER_ID_Internalname, GXutil.rtrim( A861TBM08_CRT_USER_ID), GXutil.rtrim( localUtil.format( A861TBM08_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(118);\"", "", "", "", "", edtTBM08_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm08_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A862TBM08_CRT_PROG_NM", A862TBM08_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_CRT_PROG_NM_Internalname, GXutil.rtrim( A862TBM08_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A862TBM08_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(123);\"", "", "", "", "", edtTBM08_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm08_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A863TBM08_UPD_DATETIME", localUtil.ttoc( A863TBM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 128,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM08_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_UPD_DATETIME_Internalname, localUtil.format(A863TBM08_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A863TBM08_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(128);\"", "", "", "", "", edtTBM08_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM08_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM08_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_upd_user_id_Internalname, "ID", "", "", lblTextblocktbm08_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A864TBM08_UPD_USER_ID", A864TBM08_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 133,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_UPD_USER_ID_Internalname, GXutil.rtrim( A864TBM08_UPD_USER_ID), GXutil.rtrim( localUtil.format( A864TBM08_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(133);\"", "", "", "", "", edtTBM08_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm08_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A865TBM08_UPD_PROG_NM", A865TBM08_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 138,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_UPD_PROG_NM_Internalname, GXutil.rtrim( A865TBM08_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A865TBM08_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(138);\"", "", "", "", "", edtTBM08_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm08_upd_count_Internalname, "更新カウント", "", "", lblTextblocktbm08_upd_count_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A866TBM08_UPD_COUNT", GXutil.ltrim( GXutil.str( A866TBM08_UPD_COUNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM08_UPD_COUNT_Internalname, GXutil.ltrim( localUtil.ntoc( A866TBM08_UPD_COUNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM08_UPD_COUNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A866TBM08_UPD_COUNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A866TBM08_UPD_COUNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(143);\"", "", "", "", "", edtTBM08_UPD_COUNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM08_UPD_COUNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM08_AUTH_INP_LVL.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_1G51e( true) ;
      }
      else
      {
         wb_table4_33_1G51e( false) ;
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
         httpContext.writeText( "<div style=\"WHITE-SPACE: nowrap\" class=\"ToolbarMain\">") ;
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 8,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM08_AUTH_INP_LVL.htm");
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
            A849TBM08_AUTH_CD = httpContext.cgiGet( edtTBM08_AUTH_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A849TBM08_AUTH_CD", A849TBM08_AUTH_CD);
            A850TBM08_DM_MICHAKU_CRF_FLG = httpContext.cgiGet( edtTBM08_DM_MICHAKU_CRF_FLG_Internalname) ;
            n850TBM08_DM_MICHAKU_CRF_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A850TBM08_DM_MICHAKU_CRF_FLG", A850TBM08_DM_MICHAKU_CRF_FLG);
            n850TBM08_DM_MICHAKU_CRF_FLG = ((GXutil.strcmp("", A850TBM08_DM_MICHAKU_CRF_FLG)==0) ? true : false) ;
            A851TBM08_DM_MICHAKU_MEMO_FLG = httpContext.cgiGet( edtTBM08_DM_MICHAKU_MEMO_FLG_Internalname) ;
            n851TBM08_DM_MICHAKU_MEMO_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A851TBM08_DM_MICHAKU_MEMO_FLG", A851TBM08_DM_MICHAKU_MEMO_FLG);
            n851TBM08_DM_MICHAKU_MEMO_FLG = ((GXutil.strcmp("", A851TBM08_DM_MICHAKU_MEMO_FLG)==0) ? true : false) ;
            A852TBM08_DM_MICHAKU_DM_FLG = httpContext.cgiGet( edtTBM08_DM_MICHAKU_DM_FLG_Internalname) ;
            n852TBM08_DM_MICHAKU_DM_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A852TBM08_DM_MICHAKU_DM_FLG", A852TBM08_DM_MICHAKU_DM_FLG);
            n852TBM08_DM_MICHAKU_DM_FLG = ((GXutil.strcmp("", A852TBM08_DM_MICHAKU_DM_FLG)==0) ? true : false) ;
            A853TBM08_DM_ARRI_CRF_FLG = httpContext.cgiGet( edtTBM08_DM_ARRI_CRF_FLG_Internalname) ;
            n853TBM08_DM_ARRI_CRF_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A853TBM08_DM_ARRI_CRF_FLG", A853TBM08_DM_ARRI_CRF_FLG);
            n853TBM08_DM_ARRI_CRF_FLG = ((GXutil.strcmp("", A853TBM08_DM_ARRI_CRF_FLG)==0) ? true : false) ;
            A854TBM08_DM_ARRI_MEMO_FLG = httpContext.cgiGet( edtTBM08_DM_ARRI_MEMO_FLG_Internalname) ;
            n854TBM08_DM_ARRI_MEMO_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A854TBM08_DM_ARRI_MEMO_FLG", A854TBM08_DM_ARRI_MEMO_FLG);
            n854TBM08_DM_ARRI_MEMO_FLG = ((GXutil.strcmp("", A854TBM08_DM_ARRI_MEMO_FLG)==0) ? true : false) ;
            A855TBM08_DM_ARRI_DM_FLG = httpContext.cgiGet( edtTBM08_DM_ARRI_DM_FLG_Internalname) ;
            n855TBM08_DM_ARRI_DM_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A855TBM08_DM_ARRI_DM_FLG", A855TBM08_DM_ARRI_DM_FLG);
            n855TBM08_DM_ARRI_DM_FLG = ((GXutil.strcmp("", A855TBM08_DM_ARRI_DM_FLG)==0) ? true : false) ;
            A856TBM08_DM_KAIJO_CRF_FLG = httpContext.cgiGet( edtTBM08_DM_KAIJO_CRF_FLG_Internalname) ;
            n856TBM08_DM_KAIJO_CRF_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A856TBM08_DM_KAIJO_CRF_FLG", A856TBM08_DM_KAIJO_CRF_FLG);
            n856TBM08_DM_KAIJO_CRF_FLG = ((GXutil.strcmp("", A856TBM08_DM_KAIJO_CRF_FLG)==0) ? true : false) ;
            A857TBM08_DM_KAIJO_MEMO_FLG = httpContext.cgiGet( edtTBM08_DM_KAIJO_MEMO_FLG_Internalname) ;
            n857TBM08_DM_KAIJO_MEMO_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A857TBM08_DM_KAIJO_MEMO_FLG", A857TBM08_DM_KAIJO_MEMO_FLG);
            n857TBM08_DM_KAIJO_MEMO_FLG = ((GXutil.strcmp("", A857TBM08_DM_KAIJO_MEMO_FLG)==0) ? true : false) ;
            A858TBM08_DM_KAIJO_DM_FLG = httpContext.cgiGet( edtTBM08_DM_KAIJO_DM_FLG_Internalname) ;
            n858TBM08_DM_KAIJO_DM_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A858TBM08_DM_KAIJO_DM_FLG", A858TBM08_DM_KAIJO_DM_FLG);
            n858TBM08_DM_KAIJO_DM_FLG = ((GXutil.strcmp("", A858TBM08_DM_KAIJO_DM_FLG)==0) ? true : false) ;
            A868TBM08_ICON_CAPTION = httpContext.cgiGet( edtTBM08_ICON_CAPTION_Internalname) ;
            n868TBM08_ICON_CAPTION = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A868TBM08_ICON_CAPTION", A868TBM08_ICON_CAPTION);
            n868TBM08_ICON_CAPTION = ((GXutil.strcmp("", A868TBM08_ICON_CAPTION)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_R_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_R_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM08_ICON_R");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_ICON_R_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A872TBM08_ICON_R = (short)(0) ;
               n872TBM08_ICON_R = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A872TBM08_ICON_R", GXutil.ltrim( GXutil.str( A872TBM08_ICON_R, 4, 0)));
            }
            else
            {
               A872TBM08_ICON_R = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_R_Internalname), ".", ",")) ;
               n872TBM08_ICON_R = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A872TBM08_ICON_R", GXutil.ltrim( GXutil.str( A872TBM08_ICON_R, 4, 0)));
            }
            n872TBM08_ICON_R = ((0==A872TBM08_ICON_R) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_G_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_G_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM08_ICON_G");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_ICON_G_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A873TBM08_ICON_G = (short)(0) ;
               n873TBM08_ICON_G = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A873TBM08_ICON_G", GXutil.ltrim( GXutil.str( A873TBM08_ICON_G, 4, 0)));
            }
            else
            {
               A873TBM08_ICON_G = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_G_Internalname), ".", ",")) ;
               n873TBM08_ICON_G = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A873TBM08_ICON_G", GXutil.ltrim( GXutil.str( A873TBM08_ICON_G, 4, 0)));
            }
            n873TBM08_ICON_G = ((0==A873TBM08_ICON_G) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_B_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_B_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM08_ICON_B");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_ICON_B_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A874TBM08_ICON_B = (short)(0) ;
               n874TBM08_ICON_B = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A874TBM08_ICON_B", GXutil.ltrim( GXutil.str( A874TBM08_ICON_B, 4, 0)));
            }
            else
            {
               A874TBM08_ICON_B = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM08_ICON_B_Internalname), ".", ",")) ;
               n874TBM08_ICON_B = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A874TBM08_ICON_B", GXutil.ltrim( GXutil.str( A874TBM08_ICON_B, 4, 0)));
            }
            n874TBM08_ICON_B = ((0==A874TBM08_ICON_B) ? true : false) ;
            A859TBM08_DEL_FLG = httpContext.cgiGet( edtTBM08_DEL_FLG_Internalname) ;
            n859TBM08_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A859TBM08_DEL_FLG", A859TBM08_DEL_FLG);
            n859TBM08_DEL_FLG = ((GXutil.strcmp("", A859TBM08_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM08_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM08_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A860TBM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n860TBM08_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A860TBM08_CRT_DATETIME", localUtil.ttoc( A860TBM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A860TBM08_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM08_CRT_DATETIME_Internalname)) ;
               n860TBM08_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A860TBM08_CRT_DATETIME", localUtil.ttoc( A860TBM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n860TBM08_CRT_DATETIME = (GXutil.nullDate().equals(A860TBM08_CRT_DATETIME) ? true : false) ;
            A861TBM08_CRT_USER_ID = httpContext.cgiGet( edtTBM08_CRT_USER_ID_Internalname) ;
            n861TBM08_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A861TBM08_CRT_USER_ID", A861TBM08_CRT_USER_ID);
            n861TBM08_CRT_USER_ID = ((GXutil.strcmp("", A861TBM08_CRT_USER_ID)==0) ? true : false) ;
            A862TBM08_CRT_PROG_NM = httpContext.cgiGet( edtTBM08_CRT_PROG_NM_Internalname) ;
            n862TBM08_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A862TBM08_CRT_PROG_NM", A862TBM08_CRT_PROG_NM);
            n862TBM08_CRT_PROG_NM = ((GXutil.strcmp("", A862TBM08_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM08_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM08_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A863TBM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n863TBM08_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A863TBM08_UPD_DATETIME", localUtil.ttoc( A863TBM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A863TBM08_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM08_UPD_DATETIME_Internalname)) ;
               n863TBM08_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A863TBM08_UPD_DATETIME", localUtil.ttoc( A863TBM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n863TBM08_UPD_DATETIME = (GXutil.nullDate().equals(A863TBM08_UPD_DATETIME) ? true : false) ;
            A864TBM08_UPD_USER_ID = httpContext.cgiGet( edtTBM08_UPD_USER_ID_Internalname) ;
            n864TBM08_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A864TBM08_UPD_USER_ID", A864TBM08_UPD_USER_ID);
            n864TBM08_UPD_USER_ID = ((GXutil.strcmp("", A864TBM08_UPD_USER_ID)==0) ? true : false) ;
            A865TBM08_UPD_PROG_NM = httpContext.cgiGet( edtTBM08_UPD_PROG_NM_Internalname) ;
            n865TBM08_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A865TBM08_UPD_PROG_NM", A865TBM08_UPD_PROG_NM);
            n865TBM08_UPD_PROG_NM = ((GXutil.strcmp("", A865TBM08_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_UPD_COUNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM08_UPD_COUNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM08_UPD_COUNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM08_UPD_COUNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A866TBM08_UPD_COUNT = 0 ;
               n866TBM08_UPD_COUNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A866TBM08_UPD_COUNT", GXutil.ltrim( GXutil.str( A866TBM08_UPD_COUNT, 10, 0)));
            }
            else
            {
               A866TBM08_UPD_COUNT = localUtil.ctol( httpContext.cgiGet( edtTBM08_UPD_COUNT_Internalname), ".", ",") ;
               n866TBM08_UPD_COUNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A866TBM08_UPD_COUNT", GXutil.ltrim( GXutil.str( A866TBM08_UPD_COUNT, 10, 0)));
            }
            n866TBM08_UPD_COUNT = ((0==A866TBM08_UPD_COUNT) ? true : false) ;
            /* Read saved values. */
            Z849TBM08_AUTH_CD = httpContext.cgiGet( "Z849TBM08_AUTH_CD") ;
            Z850TBM08_DM_MICHAKU_CRF_FLG = httpContext.cgiGet( "Z850TBM08_DM_MICHAKU_CRF_FLG") ;
            n850TBM08_DM_MICHAKU_CRF_FLG = ((GXutil.strcmp("", A850TBM08_DM_MICHAKU_CRF_FLG)==0) ? true : false) ;
            Z851TBM08_DM_MICHAKU_MEMO_FLG = httpContext.cgiGet( "Z851TBM08_DM_MICHAKU_MEMO_FLG") ;
            n851TBM08_DM_MICHAKU_MEMO_FLG = ((GXutil.strcmp("", A851TBM08_DM_MICHAKU_MEMO_FLG)==0) ? true : false) ;
            Z852TBM08_DM_MICHAKU_DM_FLG = httpContext.cgiGet( "Z852TBM08_DM_MICHAKU_DM_FLG") ;
            n852TBM08_DM_MICHAKU_DM_FLG = ((GXutil.strcmp("", A852TBM08_DM_MICHAKU_DM_FLG)==0) ? true : false) ;
            Z853TBM08_DM_ARRI_CRF_FLG = httpContext.cgiGet( "Z853TBM08_DM_ARRI_CRF_FLG") ;
            n853TBM08_DM_ARRI_CRF_FLG = ((GXutil.strcmp("", A853TBM08_DM_ARRI_CRF_FLG)==0) ? true : false) ;
            Z854TBM08_DM_ARRI_MEMO_FLG = httpContext.cgiGet( "Z854TBM08_DM_ARRI_MEMO_FLG") ;
            n854TBM08_DM_ARRI_MEMO_FLG = ((GXutil.strcmp("", A854TBM08_DM_ARRI_MEMO_FLG)==0) ? true : false) ;
            Z855TBM08_DM_ARRI_DM_FLG = httpContext.cgiGet( "Z855TBM08_DM_ARRI_DM_FLG") ;
            n855TBM08_DM_ARRI_DM_FLG = ((GXutil.strcmp("", A855TBM08_DM_ARRI_DM_FLG)==0) ? true : false) ;
            Z856TBM08_DM_KAIJO_CRF_FLG = httpContext.cgiGet( "Z856TBM08_DM_KAIJO_CRF_FLG") ;
            n856TBM08_DM_KAIJO_CRF_FLG = ((GXutil.strcmp("", A856TBM08_DM_KAIJO_CRF_FLG)==0) ? true : false) ;
            Z857TBM08_DM_KAIJO_MEMO_FLG = httpContext.cgiGet( "Z857TBM08_DM_KAIJO_MEMO_FLG") ;
            n857TBM08_DM_KAIJO_MEMO_FLG = ((GXutil.strcmp("", A857TBM08_DM_KAIJO_MEMO_FLG)==0) ? true : false) ;
            Z858TBM08_DM_KAIJO_DM_FLG = httpContext.cgiGet( "Z858TBM08_DM_KAIJO_DM_FLG") ;
            n858TBM08_DM_KAIJO_DM_FLG = ((GXutil.strcmp("", A858TBM08_DM_KAIJO_DM_FLG)==0) ? true : false) ;
            Z868TBM08_ICON_CAPTION = httpContext.cgiGet( "Z868TBM08_ICON_CAPTION") ;
            n868TBM08_ICON_CAPTION = ((GXutil.strcmp("", A868TBM08_ICON_CAPTION)==0) ? true : false) ;
            Z872TBM08_ICON_R = (short)(localUtil.ctol( httpContext.cgiGet( "Z872TBM08_ICON_R"), ".", ",")) ;
            n872TBM08_ICON_R = ((0==A872TBM08_ICON_R) ? true : false) ;
            Z873TBM08_ICON_G = (short)(localUtil.ctol( httpContext.cgiGet( "Z873TBM08_ICON_G"), ".", ",")) ;
            n873TBM08_ICON_G = ((0==A873TBM08_ICON_G) ? true : false) ;
            Z874TBM08_ICON_B = (short)(localUtil.ctol( httpContext.cgiGet( "Z874TBM08_ICON_B"), ".", ",")) ;
            n874TBM08_ICON_B = ((0==A874TBM08_ICON_B) ? true : false) ;
            Z859TBM08_DEL_FLG = httpContext.cgiGet( "Z859TBM08_DEL_FLG") ;
            n859TBM08_DEL_FLG = ((GXutil.strcmp("", A859TBM08_DEL_FLG)==0) ? true : false) ;
            Z860TBM08_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z860TBM08_CRT_DATETIME"), 0) ;
            n860TBM08_CRT_DATETIME = (GXutil.nullDate().equals(A860TBM08_CRT_DATETIME) ? true : false) ;
            Z861TBM08_CRT_USER_ID = httpContext.cgiGet( "Z861TBM08_CRT_USER_ID") ;
            n861TBM08_CRT_USER_ID = ((GXutil.strcmp("", A861TBM08_CRT_USER_ID)==0) ? true : false) ;
            Z862TBM08_CRT_PROG_NM = httpContext.cgiGet( "Z862TBM08_CRT_PROG_NM") ;
            n862TBM08_CRT_PROG_NM = ((GXutil.strcmp("", A862TBM08_CRT_PROG_NM)==0) ? true : false) ;
            Z863TBM08_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z863TBM08_UPD_DATETIME"), 0) ;
            n863TBM08_UPD_DATETIME = (GXutil.nullDate().equals(A863TBM08_UPD_DATETIME) ? true : false) ;
            Z864TBM08_UPD_USER_ID = httpContext.cgiGet( "Z864TBM08_UPD_USER_ID") ;
            n864TBM08_UPD_USER_ID = ((GXutil.strcmp("", A864TBM08_UPD_USER_ID)==0) ? true : false) ;
            Z865TBM08_UPD_PROG_NM = httpContext.cgiGet( "Z865TBM08_UPD_PROG_NM") ;
            n865TBM08_UPD_PROG_NM = ((GXutil.strcmp("", A865TBM08_UPD_PROG_NM)==0) ? true : false) ;
            Z866TBM08_UPD_COUNT = localUtil.ctol( httpContext.cgiGet( "Z866TBM08_UPD_COUNT"), ".", ",") ;
            n866TBM08_UPD_COUNT = ((0==A866TBM08_UPD_COUNT) ? true : false) ;
            IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
            IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
            Gx_mode = httpContext.cgiGet( "Mode") ;
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
               A849TBM08_AUTH_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A849TBM08_AUTH_CD", A849TBM08_AUTH_CD);
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
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "");
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "");
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
            Z850TBM08_DM_MICHAKU_CRF_FLG = T001G3_A850TBM08_DM_MICHAKU_CRF_FLG[0] ;
            Z851TBM08_DM_MICHAKU_MEMO_FLG = T001G3_A851TBM08_DM_MICHAKU_MEMO_FLG[0] ;
            Z852TBM08_DM_MICHAKU_DM_FLG = T001G3_A852TBM08_DM_MICHAKU_DM_FLG[0] ;
            Z853TBM08_DM_ARRI_CRF_FLG = T001G3_A853TBM08_DM_ARRI_CRF_FLG[0] ;
            Z854TBM08_DM_ARRI_MEMO_FLG = T001G3_A854TBM08_DM_ARRI_MEMO_FLG[0] ;
            Z855TBM08_DM_ARRI_DM_FLG = T001G3_A855TBM08_DM_ARRI_DM_FLG[0] ;
            Z856TBM08_DM_KAIJO_CRF_FLG = T001G3_A856TBM08_DM_KAIJO_CRF_FLG[0] ;
            Z857TBM08_DM_KAIJO_MEMO_FLG = T001G3_A857TBM08_DM_KAIJO_MEMO_FLG[0] ;
            Z858TBM08_DM_KAIJO_DM_FLG = T001G3_A858TBM08_DM_KAIJO_DM_FLG[0] ;
            Z868TBM08_ICON_CAPTION = T001G3_A868TBM08_ICON_CAPTION[0] ;
            Z872TBM08_ICON_R = T001G3_A872TBM08_ICON_R[0] ;
            Z873TBM08_ICON_G = T001G3_A873TBM08_ICON_G[0] ;
            Z874TBM08_ICON_B = T001G3_A874TBM08_ICON_B[0] ;
            Z859TBM08_DEL_FLG = T001G3_A859TBM08_DEL_FLG[0] ;
            Z860TBM08_CRT_DATETIME = T001G3_A860TBM08_CRT_DATETIME[0] ;
            Z861TBM08_CRT_USER_ID = T001G3_A861TBM08_CRT_USER_ID[0] ;
            Z862TBM08_CRT_PROG_NM = T001G3_A862TBM08_CRT_PROG_NM[0] ;
            Z863TBM08_UPD_DATETIME = T001G3_A863TBM08_UPD_DATETIME[0] ;
            Z864TBM08_UPD_USER_ID = T001G3_A864TBM08_UPD_USER_ID[0] ;
            Z865TBM08_UPD_PROG_NM = T001G3_A865TBM08_UPD_PROG_NM[0] ;
            Z866TBM08_UPD_COUNT = T001G3_A866TBM08_UPD_COUNT[0] ;
         }
         else
         {
            Z850TBM08_DM_MICHAKU_CRF_FLG = A850TBM08_DM_MICHAKU_CRF_FLG ;
            Z851TBM08_DM_MICHAKU_MEMO_FLG = A851TBM08_DM_MICHAKU_MEMO_FLG ;
            Z852TBM08_DM_MICHAKU_DM_FLG = A852TBM08_DM_MICHAKU_DM_FLG ;
            Z853TBM08_DM_ARRI_CRF_FLG = A853TBM08_DM_ARRI_CRF_FLG ;
            Z854TBM08_DM_ARRI_MEMO_FLG = A854TBM08_DM_ARRI_MEMO_FLG ;
            Z855TBM08_DM_ARRI_DM_FLG = A855TBM08_DM_ARRI_DM_FLG ;
            Z856TBM08_DM_KAIJO_CRF_FLG = A856TBM08_DM_KAIJO_CRF_FLG ;
            Z857TBM08_DM_KAIJO_MEMO_FLG = A857TBM08_DM_KAIJO_MEMO_FLG ;
            Z858TBM08_DM_KAIJO_DM_FLG = A858TBM08_DM_KAIJO_DM_FLG ;
            Z868TBM08_ICON_CAPTION = A868TBM08_ICON_CAPTION ;
            Z872TBM08_ICON_R = A872TBM08_ICON_R ;
            Z873TBM08_ICON_G = A873TBM08_ICON_G ;
            Z874TBM08_ICON_B = A874TBM08_ICON_B ;
            Z859TBM08_DEL_FLG = A859TBM08_DEL_FLG ;
            Z860TBM08_CRT_DATETIME = A860TBM08_CRT_DATETIME ;
            Z861TBM08_CRT_USER_ID = A861TBM08_CRT_USER_ID ;
            Z862TBM08_CRT_PROG_NM = A862TBM08_CRT_PROG_NM ;
            Z863TBM08_UPD_DATETIME = A863TBM08_UPD_DATETIME ;
            Z864TBM08_UPD_USER_ID = A864TBM08_UPD_USER_ID ;
            Z865TBM08_UPD_PROG_NM = A865TBM08_UPD_PROG_NM ;
            Z866TBM08_UPD_COUNT = A866TBM08_UPD_COUNT ;
         }
      }
      if ( GX_JID == -3 )
      {
         Z849TBM08_AUTH_CD = A849TBM08_AUTH_CD ;
         Z850TBM08_DM_MICHAKU_CRF_FLG = A850TBM08_DM_MICHAKU_CRF_FLG ;
         Z851TBM08_DM_MICHAKU_MEMO_FLG = A851TBM08_DM_MICHAKU_MEMO_FLG ;
         Z852TBM08_DM_MICHAKU_DM_FLG = A852TBM08_DM_MICHAKU_DM_FLG ;
         Z853TBM08_DM_ARRI_CRF_FLG = A853TBM08_DM_ARRI_CRF_FLG ;
         Z854TBM08_DM_ARRI_MEMO_FLG = A854TBM08_DM_ARRI_MEMO_FLG ;
         Z855TBM08_DM_ARRI_DM_FLG = A855TBM08_DM_ARRI_DM_FLG ;
         Z856TBM08_DM_KAIJO_CRF_FLG = A856TBM08_DM_KAIJO_CRF_FLG ;
         Z857TBM08_DM_KAIJO_MEMO_FLG = A857TBM08_DM_KAIJO_MEMO_FLG ;
         Z858TBM08_DM_KAIJO_DM_FLG = A858TBM08_DM_KAIJO_DM_FLG ;
         Z868TBM08_ICON_CAPTION = A868TBM08_ICON_CAPTION ;
         Z872TBM08_ICON_R = A872TBM08_ICON_R ;
         Z873TBM08_ICON_G = A873TBM08_ICON_G ;
         Z874TBM08_ICON_B = A874TBM08_ICON_B ;
         Z859TBM08_DEL_FLG = A859TBM08_DEL_FLG ;
         Z860TBM08_CRT_DATETIME = A860TBM08_CRT_DATETIME ;
         Z861TBM08_CRT_USER_ID = A861TBM08_CRT_USER_ID ;
         Z862TBM08_CRT_PROG_NM = A862TBM08_CRT_PROG_NM ;
         Z863TBM08_UPD_DATETIME = A863TBM08_UPD_DATETIME ;
         Z864TBM08_UPD_USER_ID = A864TBM08_UPD_USER_ID ;
         Z865TBM08_UPD_PROG_NM = A865TBM08_UPD_PROG_NM ;
         Z866TBM08_UPD_COUNT = A866TBM08_UPD_COUNT ;
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
      pr_default.execute(2, new Object[] {A849TBM08_AUTH_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound51 = (short)(1) ;
         A850TBM08_DM_MICHAKU_CRF_FLG = T001G4_A850TBM08_DM_MICHAKU_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A850TBM08_DM_MICHAKU_CRF_FLG", A850TBM08_DM_MICHAKU_CRF_FLG);
         n850TBM08_DM_MICHAKU_CRF_FLG = T001G4_n850TBM08_DM_MICHAKU_CRF_FLG[0] ;
         A851TBM08_DM_MICHAKU_MEMO_FLG = T001G4_A851TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A851TBM08_DM_MICHAKU_MEMO_FLG", A851TBM08_DM_MICHAKU_MEMO_FLG);
         n851TBM08_DM_MICHAKU_MEMO_FLG = T001G4_n851TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         A852TBM08_DM_MICHAKU_DM_FLG = T001G4_A852TBM08_DM_MICHAKU_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A852TBM08_DM_MICHAKU_DM_FLG", A852TBM08_DM_MICHAKU_DM_FLG);
         n852TBM08_DM_MICHAKU_DM_FLG = T001G4_n852TBM08_DM_MICHAKU_DM_FLG[0] ;
         A853TBM08_DM_ARRI_CRF_FLG = T001G4_A853TBM08_DM_ARRI_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A853TBM08_DM_ARRI_CRF_FLG", A853TBM08_DM_ARRI_CRF_FLG);
         n853TBM08_DM_ARRI_CRF_FLG = T001G4_n853TBM08_DM_ARRI_CRF_FLG[0] ;
         A854TBM08_DM_ARRI_MEMO_FLG = T001G4_A854TBM08_DM_ARRI_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A854TBM08_DM_ARRI_MEMO_FLG", A854TBM08_DM_ARRI_MEMO_FLG);
         n854TBM08_DM_ARRI_MEMO_FLG = T001G4_n854TBM08_DM_ARRI_MEMO_FLG[0] ;
         A855TBM08_DM_ARRI_DM_FLG = T001G4_A855TBM08_DM_ARRI_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A855TBM08_DM_ARRI_DM_FLG", A855TBM08_DM_ARRI_DM_FLG);
         n855TBM08_DM_ARRI_DM_FLG = T001G4_n855TBM08_DM_ARRI_DM_FLG[0] ;
         A856TBM08_DM_KAIJO_CRF_FLG = T001G4_A856TBM08_DM_KAIJO_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856TBM08_DM_KAIJO_CRF_FLG", A856TBM08_DM_KAIJO_CRF_FLG);
         n856TBM08_DM_KAIJO_CRF_FLG = T001G4_n856TBM08_DM_KAIJO_CRF_FLG[0] ;
         A857TBM08_DM_KAIJO_MEMO_FLG = T001G4_A857TBM08_DM_KAIJO_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A857TBM08_DM_KAIJO_MEMO_FLG", A857TBM08_DM_KAIJO_MEMO_FLG);
         n857TBM08_DM_KAIJO_MEMO_FLG = T001G4_n857TBM08_DM_KAIJO_MEMO_FLG[0] ;
         A858TBM08_DM_KAIJO_DM_FLG = T001G4_A858TBM08_DM_KAIJO_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A858TBM08_DM_KAIJO_DM_FLG", A858TBM08_DM_KAIJO_DM_FLG);
         n858TBM08_DM_KAIJO_DM_FLG = T001G4_n858TBM08_DM_KAIJO_DM_FLG[0] ;
         A868TBM08_ICON_CAPTION = T001G4_A868TBM08_ICON_CAPTION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A868TBM08_ICON_CAPTION", A868TBM08_ICON_CAPTION);
         n868TBM08_ICON_CAPTION = T001G4_n868TBM08_ICON_CAPTION[0] ;
         A872TBM08_ICON_R = T001G4_A872TBM08_ICON_R[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A872TBM08_ICON_R", GXutil.ltrim( GXutil.str( A872TBM08_ICON_R, 4, 0)));
         n872TBM08_ICON_R = T001G4_n872TBM08_ICON_R[0] ;
         A873TBM08_ICON_G = T001G4_A873TBM08_ICON_G[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A873TBM08_ICON_G", GXutil.ltrim( GXutil.str( A873TBM08_ICON_G, 4, 0)));
         n873TBM08_ICON_G = T001G4_n873TBM08_ICON_G[0] ;
         A874TBM08_ICON_B = T001G4_A874TBM08_ICON_B[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A874TBM08_ICON_B", GXutil.ltrim( GXutil.str( A874TBM08_ICON_B, 4, 0)));
         n874TBM08_ICON_B = T001G4_n874TBM08_ICON_B[0] ;
         A859TBM08_DEL_FLG = T001G4_A859TBM08_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859TBM08_DEL_FLG", A859TBM08_DEL_FLG);
         n859TBM08_DEL_FLG = T001G4_n859TBM08_DEL_FLG[0] ;
         A860TBM08_CRT_DATETIME = T001G4_A860TBM08_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A860TBM08_CRT_DATETIME", localUtil.ttoc( A860TBM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n860TBM08_CRT_DATETIME = T001G4_n860TBM08_CRT_DATETIME[0] ;
         A861TBM08_CRT_USER_ID = T001G4_A861TBM08_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A861TBM08_CRT_USER_ID", A861TBM08_CRT_USER_ID);
         n861TBM08_CRT_USER_ID = T001G4_n861TBM08_CRT_USER_ID[0] ;
         A862TBM08_CRT_PROG_NM = T001G4_A862TBM08_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A862TBM08_CRT_PROG_NM", A862TBM08_CRT_PROG_NM);
         n862TBM08_CRT_PROG_NM = T001G4_n862TBM08_CRT_PROG_NM[0] ;
         A863TBM08_UPD_DATETIME = T001G4_A863TBM08_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A863TBM08_UPD_DATETIME", localUtil.ttoc( A863TBM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n863TBM08_UPD_DATETIME = T001G4_n863TBM08_UPD_DATETIME[0] ;
         A864TBM08_UPD_USER_ID = T001G4_A864TBM08_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864TBM08_UPD_USER_ID", A864TBM08_UPD_USER_ID);
         n864TBM08_UPD_USER_ID = T001G4_n864TBM08_UPD_USER_ID[0] ;
         A865TBM08_UPD_PROG_NM = T001G4_A865TBM08_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A865TBM08_UPD_PROG_NM", A865TBM08_UPD_PROG_NM);
         n865TBM08_UPD_PROG_NM = T001G4_n865TBM08_UPD_PROG_NM[0] ;
         A866TBM08_UPD_COUNT = T001G4_A866TBM08_UPD_COUNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A866TBM08_UPD_COUNT", GXutil.ltrim( GXutil.str( A866TBM08_UPD_COUNT, 10, 0)));
         n866TBM08_UPD_COUNT = T001G4_n866TBM08_UPD_COUNT[0] ;
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
      if ( ! ( GXutil.nullDate().equals(A860TBM08_CRT_DATETIME) || (( A860TBM08_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A860TBM08_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A863TBM08_UPD_DATETIME) || (( A863TBM08_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A863TBM08_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
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
      pr_default.execute(3, new Object[] {A849TBM08_AUTH_CD});
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
      pr_default.execute(1, new Object[] {A849TBM08_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm1G51( 3) ;
         RcdFound51 = (short)(1) ;
         A849TBM08_AUTH_CD = T001G3_A849TBM08_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A849TBM08_AUTH_CD", A849TBM08_AUTH_CD);
         A850TBM08_DM_MICHAKU_CRF_FLG = T001G3_A850TBM08_DM_MICHAKU_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A850TBM08_DM_MICHAKU_CRF_FLG", A850TBM08_DM_MICHAKU_CRF_FLG);
         n850TBM08_DM_MICHAKU_CRF_FLG = T001G3_n850TBM08_DM_MICHAKU_CRF_FLG[0] ;
         A851TBM08_DM_MICHAKU_MEMO_FLG = T001G3_A851TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A851TBM08_DM_MICHAKU_MEMO_FLG", A851TBM08_DM_MICHAKU_MEMO_FLG);
         n851TBM08_DM_MICHAKU_MEMO_FLG = T001G3_n851TBM08_DM_MICHAKU_MEMO_FLG[0] ;
         A852TBM08_DM_MICHAKU_DM_FLG = T001G3_A852TBM08_DM_MICHAKU_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A852TBM08_DM_MICHAKU_DM_FLG", A852TBM08_DM_MICHAKU_DM_FLG);
         n852TBM08_DM_MICHAKU_DM_FLG = T001G3_n852TBM08_DM_MICHAKU_DM_FLG[0] ;
         A853TBM08_DM_ARRI_CRF_FLG = T001G3_A853TBM08_DM_ARRI_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A853TBM08_DM_ARRI_CRF_FLG", A853TBM08_DM_ARRI_CRF_FLG);
         n853TBM08_DM_ARRI_CRF_FLG = T001G3_n853TBM08_DM_ARRI_CRF_FLG[0] ;
         A854TBM08_DM_ARRI_MEMO_FLG = T001G3_A854TBM08_DM_ARRI_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A854TBM08_DM_ARRI_MEMO_FLG", A854TBM08_DM_ARRI_MEMO_FLG);
         n854TBM08_DM_ARRI_MEMO_FLG = T001G3_n854TBM08_DM_ARRI_MEMO_FLG[0] ;
         A855TBM08_DM_ARRI_DM_FLG = T001G3_A855TBM08_DM_ARRI_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A855TBM08_DM_ARRI_DM_FLG", A855TBM08_DM_ARRI_DM_FLG);
         n855TBM08_DM_ARRI_DM_FLG = T001G3_n855TBM08_DM_ARRI_DM_FLG[0] ;
         A856TBM08_DM_KAIJO_CRF_FLG = T001G3_A856TBM08_DM_KAIJO_CRF_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A856TBM08_DM_KAIJO_CRF_FLG", A856TBM08_DM_KAIJO_CRF_FLG);
         n856TBM08_DM_KAIJO_CRF_FLG = T001G3_n856TBM08_DM_KAIJO_CRF_FLG[0] ;
         A857TBM08_DM_KAIJO_MEMO_FLG = T001G3_A857TBM08_DM_KAIJO_MEMO_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A857TBM08_DM_KAIJO_MEMO_FLG", A857TBM08_DM_KAIJO_MEMO_FLG);
         n857TBM08_DM_KAIJO_MEMO_FLG = T001G3_n857TBM08_DM_KAIJO_MEMO_FLG[0] ;
         A858TBM08_DM_KAIJO_DM_FLG = T001G3_A858TBM08_DM_KAIJO_DM_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A858TBM08_DM_KAIJO_DM_FLG", A858TBM08_DM_KAIJO_DM_FLG);
         n858TBM08_DM_KAIJO_DM_FLG = T001G3_n858TBM08_DM_KAIJO_DM_FLG[0] ;
         A868TBM08_ICON_CAPTION = T001G3_A868TBM08_ICON_CAPTION[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A868TBM08_ICON_CAPTION", A868TBM08_ICON_CAPTION);
         n868TBM08_ICON_CAPTION = T001G3_n868TBM08_ICON_CAPTION[0] ;
         A872TBM08_ICON_R = T001G3_A872TBM08_ICON_R[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A872TBM08_ICON_R", GXutil.ltrim( GXutil.str( A872TBM08_ICON_R, 4, 0)));
         n872TBM08_ICON_R = T001G3_n872TBM08_ICON_R[0] ;
         A873TBM08_ICON_G = T001G3_A873TBM08_ICON_G[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A873TBM08_ICON_G", GXutil.ltrim( GXutil.str( A873TBM08_ICON_G, 4, 0)));
         n873TBM08_ICON_G = T001G3_n873TBM08_ICON_G[0] ;
         A874TBM08_ICON_B = T001G3_A874TBM08_ICON_B[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A874TBM08_ICON_B", GXutil.ltrim( GXutil.str( A874TBM08_ICON_B, 4, 0)));
         n874TBM08_ICON_B = T001G3_n874TBM08_ICON_B[0] ;
         A859TBM08_DEL_FLG = T001G3_A859TBM08_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A859TBM08_DEL_FLG", A859TBM08_DEL_FLG);
         n859TBM08_DEL_FLG = T001G3_n859TBM08_DEL_FLG[0] ;
         A860TBM08_CRT_DATETIME = T001G3_A860TBM08_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A860TBM08_CRT_DATETIME", localUtil.ttoc( A860TBM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n860TBM08_CRT_DATETIME = T001G3_n860TBM08_CRT_DATETIME[0] ;
         A861TBM08_CRT_USER_ID = T001G3_A861TBM08_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A861TBM08_CRT_USER_ID", A861TBM08_CRT_USER_ID);
         n861TBM08_CRT_USER_ID = T001G3_n861TBM08_CRT_USER_ID[0] ;
         A862TBM08_CRT_PROG_NM = T001G3_A862TBM08_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A862TBM08_CRT_PROG_NM", A862TBM08_CRT_PROG_NM);
         n862TBM08_CRT_PROG_NM = T001G3_n862TBM08_CRT_PROG_NM[0] ;
         A863TBM08_UPD_DATETIME = T001G3_A863TBM08_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A863TBM08_UPD_DATETIME", localUtil.ttoc( A863TBM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n863TBM08_UPD_DATETIME = T001G3_n863TBM08_UPD_DATETIME[0] ;
         A864TBM08_UPD_USER_ID = T001G3_A864TBM08_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A864TBM08_UPD_USER_ID", A864TBM08_UPD_USER_ID);
         n864TBM08_UPD_USER_ID = T001G3_n864TBM08_UPD_USER_ID[0] ;
         A865TBM08_UPD_PROG_NM = T001G3_A865TBM08_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A865TBM08_UPD_PROG_NM", A865TBM08_UPD_PROG_NM);
         n865TBM08_UPD_PROG_NM = T001G3_n865TBM08_UPD_PROG_NM[0] ;
         A866TBM08_UPD_COUNT = T001G3_A866TBM08_UPD_COUNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A866TBM08_UPD_COUNT", GXutil.ltrim( GXutil.str( A866TBM08_UPD_COUNT, 10, 0)));
         n866TBM08_UPD_COUNT = T001G3_n866TBM08_UPD_COUNT[0] ;
         Z849TBM08_AUTH_CD = A849TBM08_AUTH_CD ;
         sMode51 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load1G51( ) ;
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
      pr_default.execute(4, new Object[] {A849TBM08_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001G6_A849TBM08_AUTH_CD[0], A849TBM08_AUTH_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T001G6_A849TBM08_AUTH_CD[0], A849TBM08_AUTH_CD) > 0 ) ) )
         {
            A849TBM08_AUTH_CD = T001G6_A849TBM08_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A849TBM08_AUTH_CD", A849TBM08_AUTH_CD);
            RcdFound51 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound51 = (short)(0) ;
      /* Using cursor T001G7 */
      pr_default.execute(5, new Object[] {A849TBM08_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001G7_A849TBM08_AUTH_CD[0], A849TBM08_AUTH_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T001G7_A849TBM08_AUTH_CD[0], A849TBM08_AUTH_CD) < 0 ) ) )
         {
            A849TBM08_AUTH_CD = T001G7_A849TBM08_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A849TBM08_AUTH_CD", A849TBM08_AUTH_CD);
            RcdFound51 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey1G51( ) ;
      if ( RcdFound51 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM08_AUTH_CD");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM08_AUTH_CD_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(A849TBM08_AUTH_CD, Z849TBM08_AUTH_CD) != 0 )
         {
            A849TBM08_AUTH_CD = Z849TBM08_AUTH_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A849TBM08_AUTH_CD", A849TBM08_AUTH_CD);
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
         if ( GXutil.strcmp(A849TBM08_AUTH_CD, Z849TBM08_AUTH_CD) != 0 )
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
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( GXutil.strcmp(A849TBM08_AUTH_CD, Z849TBM08_AUTH_CD) != 0 )
      {
         A849TBM08_AUTH_CD = Z849TBM08_AUTH_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A849TBM08_AUTH_CD", A849TBM08_AUTH_CD);
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
      getByPrimaryKey( ) ;
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      getEqualNoModal( ) ;
      if ( RcdFound51 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM08_AUTH_CD");
         AnyError = (short)(1) ;
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
      scanStart1G51( ) ;
      if ( RcdFound51 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_previous( ) ;
      if ( RcdFound51 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      move_next( ) ;
      if ( RcdFound51 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
      scanStart1G51( ) ;
      if ( RcdFound51 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
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
         pr_default.execute(0, new Object[] {A849TBM08_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM08_AUTH_INP_LVL"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || ( GXutil.strcmp(Z850TBM08_DM_MICHAKU_CRF_FLG, T001G2_A850TBM08_DM_MICHAKU_CRF_FLG[0]) != 0 ) || ( GXutil.strcmp(Z851TBM08_DM_MICHAKU_MEMO_FLG, T001G2_A851TBM08_DM_MICHAKU_MEMO_FLG[0]) != 0 ) || ( GXutil.strcmp(Z852TBM08_DM_MICHAKU_DM_FLG, T001G2_A852TBM08_DM_MICHAKU_DM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z853TBM08_DM_ARRI_CRF_FLG, T001G2_A853TBM08_DM_ARRI_CRF_FLG[0]) != 0 ) || ( GXutil.strcmp(Z854TBM08_DM_ARRI_MEMO_FLG, T001G2_A854TBM08_DM_ARRI_MEMO_FLG[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z855TBM08_DM_ARRI_DM_FLG, T001G2_A855TBM08_DM_ARRI_DM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z856TBM08_DM_KAIJO_CRF_FLG, T001G2_A856TBM08_DM_KAIJO_CRF_FLG[0]) != 0 ) || ( GXutil.strcmp(Z857TBM08_DM_KAIJO_MEMO_FLG, T001G2_A857TBM08_DM_KAIJO_MEMO_FLG[0]) != 0 ) || ( GXutil.strcmp(Z858TBM08_DM_KAIJO_DM_FLG, T001G2_A858TBM08_DM_KAIJO_DM_FLG[0]) != 0 ) || ( GXutil.strcmp(Z868TBM08_ICON_CAPTION, T001G2_A868TBM08_ICON_CAPTION[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z872TBM08_ICON_R != T001G2_A872TBM08_ICON_R[0] ) || ( Z873TBM08_ICON_G != T001G2_A873TBM08_ICON_G[0] ) || ( Z874TBM08_ICON_B != T001G2_A874TBM08_ICON_B[0] ) || ( GXutil.strcmp(Z859TBM08_DEL_FLG, T001G2_A859TBM08_DEL_FLG[0]) != 0 ) || !( Z860TBM08_CRT_DATETIME.equals( T001G2_A860TBM08_CRT_DATETIME[0] ) ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z861TBM08_CRT_USER_ID, T001G2_A861TBM08_CRT_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z862TBM08_CRT_PROG_NM, T001G2_A862TBM08_CRT_PROG_NM[0]) != 0 ) || !( Z863TBM08_UPD_DATETIME.equals( T001G2_A863TBM08_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z864TBM08_UPD_USER_ID, T001G2_A864TBM08_UPD_USER_ID[0]) != 0 ) || ( GXutil.strcmp(Z865TBM08_UPD_PROG_NM, T001G2_A865TBM08_UPD_PROG_NM[0]) != 0 ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( Z866TBM08_UPD_COUNT != T001G2_A866TBM08_UPD_COUNT[0] ) )
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
                  pr_default.execute(6, new Object[] {A849TBM08_AUTH_CD, new Boolean(n850TBM08_DM_MICHAKU_CRF_FLG), A850TBM08_DM_MICHAKU_CRF_FLG, new Boolean(n851TBM08_DM_MICHAKU_MEMO_FLG), A851TBM08_DM_MICHAKU_MEMO_FLG, new Boolean(n852TBM08_DM_MICHAKU_DM_FLG), A852TBM08_DM_MICHAKU_DM_FLG, new Boolean(n853TBM08_DM_ARRI_CRF_FLG), A853TBM08_DM_ARRI_CRF_FLG, new Boolean(n854TBM08_DM_ARRI_MEMO_FLG), A854TBM08_DM_ARRI_MEMO_FLG, new Boolean(n855TBM08_DM_ARRI_DM_FLG), A855TBM08_DM_ARRI_DM_FLG, new Boolean(n856TBM08_DM_KAIJO_CRF_FLG), A856TBM08_DM_KAIJO_CRF_FLG, new Boolean(n857TBM08_DM_KAIJO_MEMO_FLG), A857TBM08_DM_KAIJO_MEMO_FLG, new Boolean(n858TBM08_DM_KAIJO_DM_FLG), A858TBM08_DM_KAIJO_DM_FLG, new Boolean(n868TBM08_ICON_CAPTION), A868TBM08_ICON_CAPTION, new Boolean(n872TBM08_ICON_R), new Short(A872TBM08_ICON_R), new Boolean(n873TBM08_ICON_G), new Short(A873TBM08_ICON_G), new Boolean(n874TBM08_ICON_B), new Short(A874TBM08_ICON_B), new Boolean(n859TBM08_DEL_FLG), A859TBM08_DEL_FLG, new Boolean(n860TBM08_CRT_DATETIME), A860TBM08_CRT_DATETIME, new Boolean(n861TBM08_CRT_USER_ID), A861TBM08_CRT_USER_ID, new Boolean(n862TBM08_CRT_PROG_NM), A862TBM08_CRT_PROG_NM, new Boolean(n863TBM08_UPD_DATETIME), A863TBM08_UPD_DATETIME, new Boolean(n864TBM08_UPD_USER_ID), A864TBM08_UPD_USER_ID, new Boolean(n865TBM08_UPD_PROG_NM), A865TBM08_UPD_PROG_NM, new Boolean(n866TBM08_UPD_COUNT), new Long(A866TBM08_UPD_COUNT)});
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
                  pr_default.execute(7, new Object[] {new Boolean(n850TBM08_DM_MICHAKU_CRF_FLG), A850TBM08_DM_MICHAKU_CRF_FLG, new Boolean(n851TBM08_DM_MICHAKU_MEMO_FLG), A851TBM08_DM_MICHAKU_MEMO_FLG, new Boolean(n852TBM08_DM_MICHAKU_DM_FLG), A852TBM08_DM_MICHAKU_DM_FLG, new Boolean(n853TBM08_DM_ARRI_CRF_FLG), A853TBM08_DM_ARRI_CRF_FLG, new Boolean(n854TBM08_DM_ARRI_MEMO_FLG), A854TBM08_DM_ARRI_MEMO_FLG, new Boolean(n855TBM08_DM_ARRI_DM_FLG), A855TBM08_DM_ARRI_DM_FLG, new Boolean(n856TBM08_DM_KAIJO_CRF_FLG), A856TBM08_DM_KAIJO_CRF_FLG, new Boolean(n857TBM08_DM_KAIJO_MEMO_FLG), A857TBM08_DM_KAIJO_MEMO_FLG, new Boolean(n858TBM08_DM_KAIJO_DM_FLG), A858TBM08_DM_KAIJO_DM_FLG, new Boolean(n868TBM08_ICON_CAPTION), A868TBM08_ICON_CAPTION, new Boolean(n872TBM08_ICON_R), new Short(A872TBM08_ICON_R), new Boolean(n873TBM08_ICON_G), new Short(A873TBM08_ICON_G), new Boolean(n874TBM08_ICON_B), new Short(A874TBM08_ICON_B), new Boolean(n859TBM08_DEL_FLG), A859TBM08_DEL_FLG, new Boolean(n860TBM08_CRT_DATETIME), A860TBM08_CRT_DATETIME, new Boolean(n861TBM08_CRT_USER_ID), A861TBM08_CRT_USER_ID, new Boolean(n862TBM08_CRT_PROG_NM), A862TBM08_CRT_PROG_NM, new Boolean(n863TBM08_UPD_DATETIME), A863TBM08_UPD_DATETIME, new Boolean(n864TBM08_UPD_USER_ID), A864TBM08_UPD_USER_ID, new Boolean(n865TBM08_UPD_PROG_NM), A865TBM08_UPD_PROG_NM, new Boolean(n866TBM08_UPD_COUNT), new Long(A866TBM08_UPD_COUNT), A849TBM08_AUTH_CD});
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
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
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
               pr_default.execute(8, new Object[] {A849TBM08_AUTH_CD});
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
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucdeleted"), 0, "");
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
         A849TBM08_AUTH_CD = T001G11_A849TBM08_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A849TBM08_AUTH_CD", A849TBM08_AUTH_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext1G51( )
   {
      pr_default.readNext(9);
      RcdFound51 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound51 = (short)(1) ;
         A849TBM08_AUTH_CD = T001G11_A849TBM08_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A849TBM08_AUTH_CD", A849TBM08_AUTH_CD);
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
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "権限別入力制御マスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm08_auth_inp_lvl") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm1G51( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z849TBM08_AUTH_CD", GXutil.rtrim( Z849TBM08_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z850TBM08_DM_MICHAKU_CRF_FLG", GXutil.rtrim( Z850TBM08_DM_MICHAKU_CRF_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z851TBM08_DM_MICHAKU_MEMO_FLG", GXutil.rtrim( Z851TBM08_DM_MICHAKU_MEMO_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z852TBM08_DM_MICHAKU_DM_FLG", GXutil.rtrim( Z852TBM08_DM_MICHAKU_DM_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z853TBM08_DM_ARRI_CRF_FLG", GXutil.rtrim( Z853TBM08_DM_ARRI_CRF_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z854TBM08_DM_ARRI_MEMO_FLG", GXutil.rtrim( Z854TBM08_DM_ARRI_MEMO_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z855TBM08_DM_ARRI_DM_FLG", GXutil.rtrim( Z855TBM08_DM_ARRI_DM_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z856TBM08_DM_KAIJO_CRF_FLG", GXutil.rtrim( Z856TBM08_DM_KAIJO_CRF_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z857TBM08_DM_KAIJO_MEMO_FLG", GXutil.rtrim( Z857TBM08_DM_KAIJO_MEMO_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z858TBM08_DM_KAIJO_DM_FLG", GXutil.rtrim( Z858TBM08_DM_KAIJO_DM_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z868TBM08_ICON_CAPTION", GXutil.rtrim( Z868TBM08_ICON_CAPTION));
      GxWebStd.gx_hidden_field( httpContext, "Z872TBM08_ICON_R", GXutil.ltrim( localUtil.ntoc( Z872TBM08_ICON_R, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z873TBM08_ICON_G", GXutil.ltrim( localUtil.ntoc( Z873TBM08_ICON_G, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z874TBM08_ICON_B", GXutil.ltrim( localUtil.ntoc( Z874TBM08_ICON_B, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z859TBM08_DEL_FLG", GXutil.rtrim( Z859TBM08_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z860TBM08_CRT_DATETIME", localUtil.ttoc( Z860TBM08_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z861TBM08_CRT_USER_ID", GXutil.rtrim( Z861TBM08_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z862TBM08_CRT_PROG_NM", GXutil.rtrim( Z862TBM08_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z863TBM08_UPD_DATETIME", localUtil.ttoc( Z863TBM08_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z864TBM08_UPD_USER_ID", GXutil.rtrim( Z864TBM08_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z865TBM08_UPD_PROG_NM", GXutil.rtrim( Z865TBM08_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z866TBM08_UPD_COUNT", GXutil.ltrim( localUtil.ntoc( Z866TBM08_UPD_COUNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey1G51( )
   {
      A850TBM08_DM_MICHAKU_CRF_FLG = "" ;
      n850TBM08_DM_MICHAKU_CRF_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A850TBM08_DM_MICHAKU_CRF_FLG", A850TBM08_DM_MICHAKU_CRF_FLG);
      n850TBM08_DM_MICHAKU_CRF_FLG = ((GXutil.strcmp("", A850TBM08_DM_MICHAKU_CRF_FLG)==0) ? true : false) ;
      A851TBM08_DM_MICHAKU_MEMO_FLG = "" ;
      n851TBM08_DM_MICHAKU_MEMO_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A851TBM08_DM_MICHAKU_MEMO_FLG", A851TBM08_DM_MICHAKU_MEMO_FLG);
      n851TBM08_DM_MICHAKU_MEMO_FLG = ((GXutil.strcmp("", A851TBM08_DM_MICHAKU_MEMO_FLG)==0) ? true : false) ;
      A852TBM08_DM_MICHAKU_DM_FLG = "" ;
      n852TBM08_DM_MICHAKU_DM_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A852TBM08_DM_MICHAKU_DM_FLG", A852TBM08_DM_MICHAKU_DM_FLG);
      n852TBM08_DM_MICHAKU_DM_FLG = ((GXutil.strcmp("", A852TBM08_DM_MICHAKU_DM_FLG)==0) ? true : false) ;
      A853TBM08_DM_ARRI_CRF_FLG = "" ;
      n853TBM08_DM_ARRI_CRF_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A853TBM08_DM_ARRI_CRF_FLG", A853TBM08_DM_ARRI_CRF_FLG);
      n853TBM08_DM_ARRI_CRF_FLG = ((GXutil.strcmp("", A853TBM08_DM_ARRI_CRF_FLG)==0) ? true : false) ;
      A854TBM08_DM_ARRI_MEMO_FLG = "" ;
      n854TBM08_DM_ARRI_MEMO_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A854TBM08_DM_ARRI_MEMO_FLG", A854TBM08_DM_ARRI_MEMO_FLG);
      n854TBM08_DM_ARRI_MEMO_FLG = ((GXutil.strcmp("", A854TBM08_DM_ARRI_MEMO_FLG)==0) ? true : false) ;
      A855TBM08_DM_ARRI_DM_FLG = "" ;
      n855TBM08_DM_ARRI_DM_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A855TBM08_DM_ARRI_DM_FLG", A855TBM08_DM_ARRI_DM_FLG);
      n855TBM08_DM_ARRI_DM_FLG = ((GXutil.strcmp("", A855TBM08_DM_ARRI_DM_FLG)==0) ? true : false) ;
      A856TBM08_DM_KAIJO_CRF_FLG = "" ;
      n856TBM08_DM_KAIJO_CRF_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A856TBM08_DM_KAIJO_CRF_FLG", A856TBM08_DM_KAIJO_CRF_FLG);
      n856TBM08_DM_KAIJO_CRF_FLG = ((GXutil.strcmp("", A856TBM08_DM_KAIJO_CRF_FLG)==0) ? true : false) ;
      A857TBM08_DM_KAIJO_MEMO_FLG = "" ;
      n857TBM08_DM_KAIJO_MEMO_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A857TBM08_DM_KAIJO_MEMO_FLG", A857TBM08_DM_KAIJO_MEMO_FLG);
      n857TBM08_DM_KAIJO_MEMO_FLG = ((GXutil.strcmp("", A857TBM08_DM_KAIJO_MEMO_FLG)==0) ? true : false) ;
      A858TBM08_DM_KAIJO_DM_FLG = "" ;
      n858TBM08_DM_KAIJO_DM_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A858TBM08_DM_KAIJO_DM_FLG", A858TBM08_DM_KAIJO_DM_FLG);
      n858TBM08_DM_KAIJO_DM_FLG = ((GXutil.strcmp("", A858TBM08_DM_KAIJO_DM_FLG)==0) ? true : false) ;
      A868TBM08_ICON_CAPTION = "" ;
      n868TBM08_ICON_CAPTION = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A868TBM08_ICON_CAPTION", A868TBM08_ICON_CAPTION);
      n868TBM08_ICON_CAPTION = ((GXutil.strcmp("", A868TBM08_ICON_CAPTION)==0) ? true : false) ;
      A872TBM08_ICON_R = (short)(0) ;
      n872TBM08_ICON_R = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A872TBM08_ICON_R", GXutil.ltrim( GXutil.str( A872TBM08_ICON_R, 4, 0)));
      n872TBM08_ICON_R = ((0==A872TBM08_ICON_R) ? true : false) ;
      A873TBM08_ICON_G = (short)(0) ;
      n873TBM08_ICON_G = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A873TBM08_ICON_G", GXutil.ltrim( GXutil.str( A873TBM08_ICON_G, 4, 0)));
      n873TBM08_ICON_G = ((0==A873TBM08_ICON_G) ? true : false) ;
      A874TBM08_ICON_B = (short)(0) ;
      n874TBM08_ICON_B = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A874TBM08_ICON_B", GXutil.ltrim( GXutil.str( A874TBM08_ICON_B, 4, 0)));
      n874TBM08_ICON_B = ((0==A874TBM08_ICON_B) ? true : false) ;
      A859TBM08_DEL_FLG = "" ;
      n859TBM08_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A859TBM08_DEL_FLG", A859TBM08_DEL_FLG);
      n859TBM08_DEL_FLG = ((GXutil.strcmp("", A859TBM08_DEL_FLG)==0) ? true : false) ;
      A860TBM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n860TBM08_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A860TBM08_CRT_DATETIME", localUtil.ttoc( A860TBM08_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n860TBM08_CRT_DATETIME = (GXutil.nullDate().equals(A860TBM08_CRT_DATETIME) ? true : false) ;
      A861TBM08_CRT_USER_ID = "" ;
      n861TBM08_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A861TBM08_CRT_USER_ID", A861TBM08_CRT_USER_ID);
      n861TBM08_CRT_USER_ID = ((GXutil.strcmp("", A861TBM08_CRT_USER_ID)==0) ? true : false) ;
      A862TBM08_CRT_PROG_NM = "" ;
      n862TBM08_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A862TBM08_CRT_PROG_NM", A862TBM08_CRT_PROG_NM);
      n862TBM08_CRT_PROG_NM = ((GXutil.strcmp("", A862TBM08_CRT_PROG_NM)==0) ? true : false) ;
      A863TBM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n863TBM08_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A863TBM08_UPD_DATETIME", localUtil.ttoc( A863TBM08_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n863TBM08_UPD_DATETIME = (GXutil.nullDate().equals(A863TBM08_UPD_DATETIME) ? true : false) ;
      A864TBM08_UPD_USER_ID = "" ;
      n864TBM08_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A864TBM08_UPD_USER_ID", A864TBM08_UPD_USER_ID);
      n864TBM08_UPD_USER_ID = ((GXutil.strcmp("", A864TBM08_UPD_USER_ID)==0) ? true : false) ;
      A865TBM08_UPD_PROG_NM = "" ;
      n865TBM08_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A865TBM08_UPD_PROG_NM", A865TBM08_UPD_PROG_NM);
      n865TBM08_UPD_PROG_NM = ((GXutil.strcmp("", A865TBM08_UPD_PROG_NM)==0) ? true : false) ;
      A866TBM08_UPD_COUNT = 0 ;
      n866TBM08_UPD_COUNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A866TBM08_UPD_COUNT", GXutil.ltrim( GXutil.str( A866TBM08_UPD_COUNT, 10, 0)));
      n866TBM08_UPD_COUNT = ((0==A866TBM08_UPD_COUNT) ? true : false) ;
   }

   public void initAll1G51( )
   {
      A849TBM08_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A849TBM08_AUTH_CD", A849TBM08_AUTH_CD);
      initializeNonKey1G51( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?14572530");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm08_auth_inp_lvl.js", "?14572530");
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
      A849TBM08_AUTH_CD = GX_Parm1 ;
      A850TBM08_DM_MICHAKU_CRF_FLG = GX_Parm2 ;
      n850TBM08_DM_MICHAKU_CRF_FLG = false ;
      A851TBM08_DM_MICHAKU_MEMO_FLG = GX_Parm3 ;
      n851TBM08_DM_MICHAKU_MEMO_FLG = false ;
      A852TBM08_DM_MICHAKU_DM_FLG = GX_Parm4 ;
      n852TBM08_DM_MICHAKU_DM_FLG = false ;
      A853TBM08_DM_ARRI_CRF_FLG = GX_Parm5 ;
      n853TBM08_DM_ARRI_CRF_FLG = false ;
      A854TBM08_DM_ARRI_MEMO_FLG = GX_Parm6 ;
      n854TBM08_DM_ARRI_MEMO_FLG = false ;
      A855TBM08_DM_ARRI_DM_FLG = GX_Parm7 ;
      n855TBM08_DM_ARRI_DM_FLG = false ;
      A856TBM08_DM_KAIJO_CRF_FLG = GX_Parm8 ;
      n856TBM08_DM_KAIJO_CRF_FLG = false ;
      A857TBM08_DM_KAIJO_MEMO_FLG = GX_Parm9 ;
      n857TBM08_DM_KAIJO_MEMO_FLG = false ;
      A858TBM08_DM_KAIJO_DM_FLG = GX_Parm10 ;
      n858TBM08_DM_KAIJO_DM_FLG = false ;
      A868TBM08_ICON_CAPTION = GX_Parm11 ;
      n868TBM08_ICON_CAPTION = false ;
      A872TBM08_ICON_R = GX_Parm12 ;
      n872TBM08_ICON_R = false ;
      A873TBM08_ICON_G = GX_Parm13 ;
      n873TBM08_ICON_G = false ;
      A874TBM08_ICON_B = GX_Parm14 ;
      n874TBM08_ICON_B = false ;
      A859TBM08_DEL_FLG = GX_Parm15 ;
      n859TBM08_DEL_FLG = false ;
      A860TBM08_CRT_DATETIME = GX_Parm16 ;
      n860TBM08_CRT_DATETIME = false ;
      A861TBM08_CRT_USER_ID = GX_Parm17 ;
      n861TBM08_CRT_USER_ID = false ;
      A862TBM08_CRT_PROG_NM = GX_Parm18 ;
      n862TBM08_CRT_PROG_NM = false ;
      A863TBM08_UPD_DATETIME = GX_Parm19 ;
      n863TBM08_UPD_DATETIME = false ;
      A864TBM08_UPD_USER_ID = GX_Parm20 ;
      n864TBM08_UPD_USER_ID = false ;
      A865TBM08_UPD_PROG_NM = GX_Parm21 ;
      n865TBM08_UPD_PROG_NM = false ;
      A866TBM08_UPD_COUNT = GX_Parm22 ;
      n866TBM08_UPD_COUNT = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(GXutil.rtrim( A850TBM08_DM_MICHAKU_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( A851TBM08_DM_MICHAKU_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( A852TBM08_DM_MICHAKU_DM_FLG));
      isValidOutput.add(GXutil.rtrim( A853TBM08_DM_ARRI_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( A854TBM08_DM_ARRI_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( A855TBM08_DM_ARRI_DM_FLG));
      isValidOutput.add(GXutil.rtrim( A856TBM08_DM_KAIJO_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( A857TBM08_DM_KAIJO_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( A858TBM08_DM_KAIJO_DM_FLG));
      isValidOutput.add(GXutil.rtrim( A868TBM08_ICON_CAPTION));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A872TBM08_ICON_R, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A873TBM08_ICON_G, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A874TBM08_ICON_B, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A859TBM08_DEL_FLG));
      isValidOutput.add(localUtil.format(A860TBM08_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A861TBM08_CRT_USER_ID));
      isValidOutput.add(GXutil.rtrim( A862TBM08_CRT_PROG_NM));
      isValidOutput.add(localUtil.format(A863TBM08_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A864TBM08_UPD_USER_ID));
      isValidOutput.add(GXutil.rtrim( A865TBM08_UPD_PROG_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A866TBM08_UPD_COUNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z849TBM08_AUTH_CD));
      isValidOutput.add(GXutil.rtrim( Z850TBM08_DM_MICHAKU_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( Z851TBM08_DM_MICHAKU_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( Z852TBM08_DM_MICHAKU_DM_FLG));
      isValidOutput.add(GXutil.rtrim( Z853TBM08_DM_ARRI_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( Z854TBM08_DM_ARRI_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( Z855TBM08_DM_ARRI_DM_FLG));
      isValidOutput.add(GXutil.rtrim( Z856TBM08_DM_KAIJO_CRF_FLG));
      isValidOutput.add(GXutil.rtrim( Z857TBM08_DM_KAIJO_MEMO_FLG));
      isValidOutput.add(GXutil.rtrim( Z858TBM08_DM_KAIJO_DM_FLG));
      isValidOutput.add(GXutil.rtrim( Z868TBM08_ICON_CAPTION));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z872TBM08_ICON_R, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z873TBM08_ICON_G, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z874TBM08_ICON_B, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z859TBM08_DEL_FLG));
      isValidOutput.add(localUtil.ttoc( Z860TBM08_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z861TBM08_CRT_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z862TBM08_CRT_PROG_NM));
      isValidOutput.add(localUtil.ttoc( Z863TBM08_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z864TBM08_UPD_USER_ID));
      isValidOutput.add(GXutil.rtrim( Z865TBM08_UPD_PROG_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z866TBM08_UPD_COUNT, (byte)(10), (byte)(0), ".", "")));
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
      lblTextblocktbm08_auth_cd_Jsonclick = "" ;
      A849TBM08_AUTH_CD = "" ;
      lblTextblocktbm08_dm_michaku_crf_flg_Jsonclick = "" ;
      A850TBM08_DM_MICHAKU_CRF_FLG = "" ;
      lblTextblocktbm08_dm_michaku_memo_flg_Jsonclick = "" ;
      A851TBM08_DM_MICHAKU_MEMO_FLG = "" ;
      lblTextblocktbm08_dm_michaku_dm_flg_Jsonclick = "" ;
      A852TBM08_DM_MICHAKU_DM_FLG = "" ;
      lblTextblocktbm08_dm_arri_crf_flg_Jsonclick = "" ;
      A853TBM08_DM_ARRI_CRF_FLG = "" ;
      lblTextblocktbm08_dm_arri_memo_flg_Jsonclick = "" ;
      A854TBM08_DM_ARRI_MEMO_FLG = "" ;
      lblTextblocktbm08_dm_arri_dm_flg_Jsonclick = "" ;
      A855TBM08_DM_ARRI_DM_FLG = "" ;
      lblTextblocktbm08_dm_kaijo_crf_flg_Jsonclick = "" ;
      A856TBM08_DM_KAIJO_CRF_FLG = "" ;
      lblTextblocktbm08_dm_kaijo_memo_flg_Jsonclick = "" ;
      A857TBM08_DM_KAIJO_MEMO_FLG = "" ;
      lblTextblocktbm08_dm_kaijo_dm_flg_Jsonclick = "" ;
      A858TBM08_DM_KAIJO_DM_FLG = "" ;
      lblTextblocktbm08_icon_caption_Jsonclick = "" ;
      A868TBM08_ICON_CAPTION = "" ;
      lblTextblocktbm08_icon_r_Jsonclick = "" ;
      lblTextblocktbm08_icon_g_Jsonclick = "" ;
      lblTextblocktbm08_icon_b_Jsonclick = "" ;
      lblTextblocktbm08_del_flg_Jsonclick = "" ;
      A859TBM08_DEL_FLG = "" ;
      lblTextblocktbm08_crt_datetime_Jsonclick = "" ;
      A860TBM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm08_crt_user_id_Jsonclick = "" ;
      A861TBM08_CRT_USER_ID = "" ;
      lblTextblocktbm08_crt_prog_nm_Jsonclick = "" ;
      A862TBM08_CRT_PROG_NM = "" ;
      lblTextblocktbm08_upd_datetime_Jsonclick = "" ;
      A863TBM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm08_upd_user_id_Jsonclick = "" ;
      A864TBM08_UPD_USER_ID = "" ;
      lblTextblocktbm08_upd_prog_nm_Jsonclick = "" ;
      A865TBM08_UPD_PROG_NM = "" ;
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
      Z849TBM08_AUTH_CD = "" ;
      Z850TBM08_DM_MICHAKU_CRF_FLG = "" ;
      Z851TBM08_DM_MICHAKU_MEMO_FLG = "" ;
      Z852TBM08_DM_MICHAKU_DM_FLG = "" ;
      Z853TBM08_DM_ARRI_CRF_FLG = "" ;
      Z854TBM08_DM_ARRI_MEMO_FLG = "" ;
      Z855TBM08_DM_ARRI_DM_FLG = "" ;
      Z856TBM08_DM_KAIJO_CRF_FLG = "" ;
      Z857TBM08_DM_KAIJO_MEMO_FLG = "" ;
      Z858TBM08_DM_KAIJO_DM_FLG = "" ;
      Z868TBM08_ICON_CAPTION = "" ;
      Z859TBM08_DEL_FLG = "" ;
      Z860TBM08_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z861TBM08_CRT_USER_ID = "" ;
      Z862TBM08_CRT_PROG_NM = "" ;
      Z863TBM08_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z864TBM08_UPD_USER_ID = "" ;
      Z865TBM08_UPD_PROG_NM = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      T001G4_A849TBM08_AUTH_CD = new String[] {""} ;
      T001G4_A850TBM08_DM_MICHAKU_CRF_FLG = new String[] {""} ;
      T001G4_n850TBM08_DM_MICHAKU_CRF_FLG = new boolean[] {false} ;
      T001G4_A851TBM08_DM_MICHAKU_MEMO_FLG = new String[] {""} ;
      T001G4_n851TBM08_DM_MICHAKU_MEMO_FLG = new boolean[] {false} ;
      T001G4_A852TBM08_DM_MICHAKU_DM_FLG = new String[] {""} ;
      T001G4_n852TBM08_DM_MICHAKU_DM_FLG = new boolean[] {false} ;
      T001G4_A853TBM08_DM_ARRI_CRF_FLG = new String[] {""} ;
      T001G4_n853TBM08_DM_ARRI_CRF_FLG = new boolean[] {false} ;
      T001G4_A854TBM08_DM_ARRI_MEMO_FLG = new String[] {""} ;
      T001G4_n854TBM08_DM_ARRI_MEMO_FLG = new boolean[] {false} ;
      T001G4_A855TBM08_DM_ARRI_DM_FLG = new String[] {""} ;
      T001G4_n855TBM08_DM_ARRI_DM_FLG = new boolean[] {false} ;
      T001G4_A856TBM08_DM_KAIJO_CRF_FLG = new String[] {""} ;
      T001G4_n856TBM08_DM_KAIJO_CRF_FLG = new boolean[] {false} ;
      T001G4_A857TBM08_DM_KAIJO_MEMO_FLG = new String[] {""} ;
      T001G4_n857TBM08_DM_KAIJO_MEMO_FLG = new boolean[] {false} ;
      T001G4_A858TBM08_DM_KAIJO_DM_FLG = new String[] {""} ;
      T001G4_n858TBM08_DM_KAIJO_DM_FLG = new boolean[] {false} ;
      T001G4_A868TBM08_ICON_CAPTION = new String[] {""} ;
      T001G4_n868TBM08_ICON_CAPTION = new boolean[] {false} ;
      T001G4_A872TBM08_ICON_R = new short[1] ;
      T001G4_n872TBM08_ICON_R = new boolean[] {false} ;
      T001G4_A873TBM08_ICON_G = new short[1] ;
      T001G4_n873TBM08_ICON_G = new boolean[] {false} ;
      T001G4_A874TBM08_ICON_B = new short[1] ;
      T001G4_n874TBM08_ICON_B = new boolean[] {false} ;
      T001G4_A859TBM08_DEL_FLG = new String[] {""} ;
      T001G4_n859TBM08_DEL_FLG = new boolean[] {false} ;
      T001G4_A860TBM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G4_n860TBM08_CRT_DATETIME = new boolean[] {false} ;
      T001G4_A861TBM08_CRT_USER_ID = new String[] {""} ;
      T001G4_n861TBM08_CRT_USER_ID = new boolean[] {false} ;
      T001G4_A862TBM08_CRT_PROG_NM = new String[] {""} ;
      T001G4_n862TBM08_CRT_PROG_NM = new boolean[] {false} ;
      T001G4_A863TBM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G4_n863TBM08_UPD_DATETIME = new boolean[] {false} ;
      T001G4_A864TBM08_UPD_USER_ID = new String[] {""} ;
      T001G4_n864TBM08_UPD_USER_ID = new boolean[] {false} ;
      T001G4_A865TBM08_UPD_PROG_NM = new String[] {""} ;
      T001G4_n865TBM08_UPD_PROG_NM = new boolean[] {false} ;
      T001G4_A866TBM08_UPD_COUNT = new long[1] ;
      T001G4_n866TBM08_UPD_COUNT = new boolean[] {false} ;
      T001G5_A849TBM08_AUTH_CD = new String[] {""} ;
      T001G3_A849TBM08_AUTH_CD = new String[] {""} ;
      T001G3_A850TBM08_DM_MICHAKU_CRF_FLG = new String[] {""} ;
      T001G3_n850TBM08_DM_MICHAKU_CRF_FLG = new boolean[] {false} ;
      T001G3_A851TBM08_DM_MICHAKU_MEMO_FLG = new String[] {""} ;
      T001G3_n851TBM08_DM_MICHAKU_MEMO_FLG = new boolean[] {false} ;
      T001G3_A852TBM08_DM_MICHAKU_DM_FLG = new String[] {""} ;
      T001G3_n852TBM08_DM_MICHAKU_DM_FLG = new boolean[] {false} ;
      T001G3_A853TBM08_DM_ARRI_CRF_FLG = new String[] {""} ;
      T001G3_n853TBM08_DM_ARRI_CRF_FLG = new boolean[] {false} ;
      T001G3_A854TBM08_DM_ARRI_MEMO_FLG = new String[] {""} ;
      T001G3_n854TBM08_DM_ARRI_MEMO_FLG = new boolean[] {false} ;
      T001G3_A855TBM08_DM_ARRI_DM_FLG = new String[] {""} ;
      T001G3_n855TBM08_DM_ARRI_DM_FLG = new boolean[] {false} ;
      T001G3_A856TBM08_DM_KAIJO_CRF_FLG = new String[] {""} ;
      T001G3_n856TBM08_DM_KAIJO_CRF_FLG = new boolean[] {false} ;
      T001G3_A857TBM08_DM_KAIJO_MEMO_FLG = new String[] {""} ;
      T001G3_n857TBM08_DM_KAIJO_MEMO_FLG = new boolean[] {false} ;
      T001G3_A858TBM08_DM_KAIJO_DM_FLG = new String[] {""} ;
      T001G3_n858TBM08_DM_KAIJO_DM_FLG = new boolean[] {false} ;
      T001G3_A868TBM08_ICON_CAPTION = new String[] {""} ;
      T001G3_n868TBM08_ICON_CAPTION = new boolean[] {false} ;
      T001G3_A872TBM08_ICON_R = new short[1] ;
      T001G3_n872TBM08_ICON_R = new boolean[] {false} ;
      T001G3_A873TBM08_ICON_G = new short[1] ;
      T001G3_n873TBM08_ICON_G = new boolean[] {false} ;
      T001G3_A874TBM08_ICON_B = new short[1] ;
      T001G3_n874TBM08_ICON_B = new boolean[] {false} ;
      T001G3_A859TBM08_DEL_FLG = new String[] {""} ;
      T001G3_n859TBM08_DEL_FLG = new boolean[] {false} ;
      T001G3_A860TBM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G3_n860TBM08_CRT_DATETIME = new boolean[] {false} ;
      T001G3_A861TBM08_CRT_USER_ID = new String[] {""} ;
      T001G3_n861TBM08_CRT_USER_ID = new boolean[] {false} ;
      T001G3_A862TBM08_CRT_PROG_NM = new String[] {""} ;
      T001G3_n862TBM08_CRT_PROG_NM = new boolean[] {false} ;
      T001G3_A863TBM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G3_n863TBM08_UPD_DATETIME = new boolean[] {false} ;
      T001G3_A864TBM08_UPD_USER_ID = new String[] {""} ;
      T001G3_n864TBM08_UPD_USER_ID = new boolean[] {false} ;
      T001G3_A865TBM08_UPD_PROG_NM = new String[] {""} ;
      T001G3_n865TBM08_UPD_PROG_NM = new boolean[] {false} ;
      T001G3_A866TBM08_UPD_COUNT = new long[1] ;
      T001G3_n866TBM08_UPD_COUNT = new boolean[] {false} ;
      sMode51 = "" ;
      T001G6_A849TBM08_AUTH_CD = new String[] {""} ;
      T001G7_A849TBM08_AUTH_CD = new String[] {""} ;
      T001G2_A849TBM08_AUTH_CD = new String[] {""} ;
      T001G2_A850TBM08_DM_MICHAKU_CRF_FLG = new String[] {""} ;
      T001G2_n850TBM08_DM_MICHAKU_CRF_FLG = new boolean[] {false} ;
      T001G2_A851TBM08_DM_MICHAKU_MEMO_FLG = new String[] {""} ;
      T001G2_n851TBM08_DM_MICHAKU_MEMO_FLG = new boolean[] {false} ;
      T001G2_A852TBM08_DM_MICHAKU_DM_FLG = new String[] {""} ;
      T001G2_n852TBM08_DM_MICHAKU_DM_FLG = new boolean[] {false} ;
      T001G2_A853TBM08_DM_ARRI_CRF_FLG = new String[] {""} ;
      T001G2_n853TBM08_DM_ARRI_CRF_FLG = new boolean[] {false} ;
      T001G2_A854TBM08_DM_ARRI_MEMO_FLG = new String[] {""} ;
      T001G2_n854TBM08_DM_ARRI_MEMO_FLG = new boolean[] {false} ;
      T001G2_A855TBM08_DM_ARRI_DM_FLG = new String[] {""} ;
      T001G2_n855TBM08_DM_ARRI_DM_FLG = new boolean[] {false} ;
      T001G2_A856TBM08_DM_KAIJO_CRF_FLG = new String[] {""} ;
      T001G2_n856TBM08_DM_KAIJO_CRF_FLG = new boolean[] {false} ;
      T001G2_A857TBM08_DM_KAIJO_MEMO_FLG = new String[] {""} ;
      T001G2_n857TBM08_DM_KAIJO_MEMO_FLG = new boolean[] {false} ;
      T001G2_A858TBM08_DM_KAIJO_DM_FLG = new String[] {""} ;
      T001G2_n858TBM08_DM_KAIJO_DM_FLG = new boolean[] {false} ;
      T001G2_A868TBM08_ICON_CAPTION = new String[] {""} ;
      T001G2_n868TBM08_ICON_CAPTION = new boolean[] {false} ;
      T001G2_A872TBM08_ICON_R = new short[1] ;
      T001G2_n872TBM08_ICON_R = new boolean[] {false} ;
      T001G2_A873TBM08_ICON_G = new short[1] ;
      T001G2_n873TBM08_ICON_G = new boolean[] {false} ;
      T001G2_A874TBM08_ICON_B = new short[1] ;
      T001G2_n874TBM08_ICON_B = new boolean[] {false} ;
      T001G2_A859TBM08_DEL_FLG = new String[] {""} ;
      T001G2_n859TBM08_DEL_FLG = new boolean[] {false} ;
      T001G2_A860TBM08_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G2_n860TBM08_CRT_DATETIME = new boolean[] {false} ;
      T001G2_A861TBM08_CRT_USER_ID = new String[] {""} ;
      T001G2_n861TBM08_CRT_USER_ID = new boolean[] {false} ;
      T001G2_A862TBM08_CRT_PROG_NM = new String[] {""} ;
      T001G2_n862TBM08_CRT_PROG_NM = new boolean[] {false} ;
      T001G2_A863TBM08_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T001G2_n863TBM08_UPD_DATETIME = new boolean[] {false} ;
      T001G2_A864TBM08_UPD_USER_ID = new String[] {""} ;
      T001G2_n864TBM08_UPD_USER_ID = new boolean[] {false} ;
      T001G2_A865TBM08_UPD_PROG_NM = new String[] {""} ;
      T001G2_n865TBM08_UPD_PROG_NM = new boolean[] {false} ;
      T001G2_A866TBM08_UPD_COUNT = new long[1] ;
      T001G2_n866TBM08_UPD_COUNT = new boolean[] {false} ;
      T001G11_A849TBM08_AUTH_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char3 = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm08_auth_inp_lvl__default(),
         new Object[] {
             new Object[] {
            T001G2_A849TBM08_AUTH_CD, T001G2_A850TBM08_DM_MICHAKU_CRF_FLG, T001G2_n850TBM08_DM_MICHAKU_CRF_FLG, T001G2_A851TBM08_DM_MICHAKU_MEMO_FLG, T001G2_n851TBM08_DM_MICHAKU_MEMO_FLG, T001G2_A852TBM08_DM_MICHAKU_DM_FLG, T001G2_n852TBM08_DM_MICHAKU_DM_FLG, T001G2_A853TBM08_DM_ARRI_CRF_FLG, T001G2_n853TBM08_DM_ARRI_CRF_FLG, T001G2_A854TBM08_DM_ARRI_MEMO_FLG,
            T001G2_n854TBM08_DM_ARRI_MEMO_FLG, T001G2_A855TBM08_DM_ARRI_DM_FLG, T001G2_n855TBM08_DM_ARRI_DM_FLG, T001G2_A856TBM08_DM_KAIJO_CRF_FLG, T001G2_n856TBM08_DM_KAIJO_CRF_FLG, T001G2_A857TBM08_DM_KAIJO_MEMO_FLG, T001G2_n857TBM08_DM_KAIJO_MEMO_FLG, T001G2_A858TBM08_DM_KAIJO_DM_FLG, T001G2_n858TBM08_DM_KAIJO_DM_FLG, T001G2_A868TBM08_ICON_CAPTION,
            T001G2_n868TBM08_ICON_CAPTION, T001G2_A872TBM08_ICON_R, T001G2_n872TBM08_ICON_R, T001G2_A873TBM08_ICON_G, T001G2_n873TBM08_ICON_G, T001G2_A874TBM08_ICON_B, T001G2_n874TBM08_ICON_B, T001G2_A859TBM08_DEL_FLG, T001G2_n859TBM08_DEL_FLG, T001G2_A860TBM08_CRT_DATETIME,
            T001G2_n860TBM08_CRT_DATETIME, T001G2_A861TBM08_CRT_USER_ID, T001G2_n861TBM08_CRT_USER_ID, T001G2_A862TBM08_CRT_PROG_NM, T001G2_n862TBM08_CRT_PROG_NM, T001G2_A863TBM08_UPD_DATETIME, T001G2_n863TBM08_UPD_DATETIME, T001G2_A864TBM08_UPD_USER_ID, T001G2_n864TBM08_UPD_USER_ID, T001G2_A865TBM08_UPD_PROG_NM,
            T001G2_n865TBM08_UPD_PROG_NM, T001G2_A866TBM08_UPD_COUNT, T001G2_n866TBM08_UPD_COUNT
            }
            , new Object[] {
            T001G3_A849TBM08_AUTH_CD, T001G3_A850TBM08_DM_MICHAKU_CRF_FLG, T001G3_n850TBM08_DM_MICHAKU_CRF_FLG, T001G3_A851TBM08_DM_MICHAKU_MEMO_FLG, T001G3_n851TBM08_DM_MICHAKU_MEMO_FLG, T001G3_A852TBM08_DM_MICHAKU_DM_FLG, T001G3_n852TBM08_DM_MICHAKU_DM_FLG, T001G3_A853TBM08_DM_ARRI_CRF_FLG, T001G3_n853TBM08_DM_ARRI_CRF_FLG, T001G3_A854TBM08_DM_ARRI_MEMO_FLG,
            T001G3_n854TBM08_DM_ARRI_MEMO_FLG, T001G3_A855TBM08_DM_ARRI_DM_FLG, T001G3_n855TBM08_DM_ARRI_DM_FLG, T001G3_A856TBM08_DM_KAIJO_CRF_FLG, T001G3_n856TBM08_DM_KAIJO_CRF_FLG, T001G3_A857TBM08_DM_KAIJO_MEMO_FLG, T001G3_n857TBM08_DM_KAIJO_MEMO_FLG, T001G3_A858TBM08_DM_KAIJO_DM_FLG, T001G3_n858TBM08_DM_KAIJO_DM_FLG, T001G3_A868TBM08_ICON_CAPTION,
            T001G3_n868TBM08_ICON_CAPTION, T001G3_A872TBM08_ICON_R, T001G3_n872TBM08_ICON_R, T001G3_A873TBM08_ICON_G, T001G3_n873TBM08_ICON_G, T001G3_A874TBM08_ICON_B, T001G3_n874TBM08_ICON_B, T001G3_A859TBM08_DEL_FLG, T001G3_n859TBM08_DEL_FLG, T001G3_A860TBM08_CRT_DATETIME,
            T001G3_n860TBM08_CRT_DATETIME, T001G3_A861TBM08_CRT_USER_ID, T001G3_n861TBM08_CRT_USER_ID, T001G3_A862TBM08_CRT_PROG_NM, T001G3_n862TBM08_CRT_PROG_NM, T001G3_A863TBM08_UPD_DATETIME, T001G3_n863TBM08_UPD_DATETIME, T001G3_A864TBM08_UPD_USER_ID, T001G3_n864TBM08_UPD_USER_ID, T001G3_A865TBM08_UPD_PROG_NM,
            T001G3_n865TBM08_UPD_PROG_NM, T001G3_A866TBM08_UPD_COUNT, T001G3_n866TBM08_UPD_COUNT
            }
            , new Object[] {
            T001G4_A849TBM08_AUTH_CD, T001G4_A850TBM08_DM_MICHAKU_CRF_FLG, T001G4_n850TBM08_DM_MICHAKU_CRF_FLG, T001G4_A851TBM08_DM_MICHAKU_MEMO_FLG, T001G4_n851TBM08_DM_MICHAKU_MEMO_FLG, T001G4_A852TBM08_DM_MICHAKU_DM_FLG, T001G4_n852TBM08_DM_MICHAKU_DM_FLG, T001G4_A853TBM08_DM_ARRI_CRF_FLG, T001G4_n853TBM08_DM_ARRI_CRF_FLG, T001G4_A854TBM08_DM_ARRI_MEMO_FLG,
            T001G4_n854TBM08_DM_ARRI_MEMO_FLG, T001G4_A855TBM08_DM_ARRI_DM_FLG, T001G4_n855TBM08_DM_ARRI_DM_FLG, T001G4_A856TBM08_DM_KAIJO_CRF_FLG, T001G4_n856TBM08_DM_KAIJO_CRF_FLG, T001G4_A857TBM08_DM_KAIJO_MEMO_FLG, T001G4_n857TBM08_DM_KAIJO_MEMO_FLG, T001G4_A858TBM08_DM_KAIJO_DM_FLG, T001G4_n858TBM08_DM_KAIJO_DM_FLG, T001G4_A868TBM08_ICON_CAPTION,
            T001G4_n868TBM08_ICON_CAPTION, T001G4_A872TBM08_ICON_R, T001G4_n872TBM08_ICON_R, T001G4_A873TBM08_ICON_G, T001G4_n873TBM08_ICON_G, T001G4_A874TBM08_ICON_B, T001G4_n874TBM08_ICON_B, T001G4_A859TBM08_DEL_FLG, T001G4_n859TBM08_DEL_FLG, T001G4_A860TBM08_CRT_DATETIME,
            T001G4_n860TBM08_CRT_DATETIME, T001G4_A861TBM08_CRT_USER_ID, T001G4_n861TBM08_CRT_USER_ID, T001G4_A862TBM08_CRT_PROG_NM, T001G4_n862TBM08_CRT_PROG_NM, T001G4_A863TBM08_UPD_DATETIME, T001G4_n863TBM08_UPD_DATETIME, T001G4_A864TBM08_UPD_USER_ID, T001G4_n864TBM08_UPD_USER_ID, T001G4_A865TBM08_UPD_PROG_NM,
            T001G4_n865TBM08_UPD_PROG_NM, T001G4_A866TBM08_UPD_COUNT, T001G4_n866TBM08_UPD_COUNT
            }
            , new Object[] {
            T001G5_A849TBM08_AUTH_CD
            }
            , new Object[] {
            T001G6_A849TBM08_AUTH_CD
            }
            , new Object[] {
            T001G7_A849TBM08_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T001G11_A849TBM08_AUTH_CD
            }
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A872TBM08_ICON_R ;
   private short A873TBM08_ICON_G ;
   private short A874TBM08_ICON_B ;
   private short Z872TBM08_ICON_R ;
   private short Z873TBM08_ICON_G ;
   private short Z874TBM08_ICON_B ;
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
   private long A866TBM08_UPD_COUNT ;
   private long Z866TBM08_UPD_COUNT ;
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
   private String GXt_char3 ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private java.util.Date A860TBM08_CRT_DATETIME ;
   private java.util.Date A863TBM08_UPD_DATETIME ;
   private java.util.Date Z860TBM08_CRT_DATETIME ;
   private java.util.Date Z863TBM08_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n850TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean n851TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean n852TBM08_DM_MICHAKU_DM_FLG ;
   private boolean n853TBM08_DM_ARRI_CRF_FLG ;
   private boolean n854TBM08_DM_ARRI_MEMO_FLG ;
   private boolean n855TBM08_DM_ARRI_DM_FLG ;
   private boolean n856TBM08_DM_KAIJO_CRF_FLG ;
   private boolean n857TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean n858TBM08_DM_KAIJO_DM_FLG ;
   private boolean n868TBM08_ICON_CAPTION ;
   private boolean n872TBM08_ICON_R ;
   private boolean n873TBM08_ICON_G ;
   private boolean n874TBM08_ICON_B ;
   private boolean n859TBM08_DEL_FLG ;
   private boolean n860TBM08_CRT_DATETIME ;
   private boolean n861TBM08_CRT_USER_ID ;
   private boolean n862TBM08_CRT_PROG_NM ;
   private boolean n863TBM08_UPD_DATETIME ;
   private boolean n864TBM08_UPD_USER_ID ;
   private boolean n865TBM08_UPD_PROG_NM ;
   private boolean n866TBM08_UPD_COUNT ;
   private boolean Gx_longc ;
   private String A849TBM08_AUTH_CD ;
   private String A850TBM08_DM_MICHAKU_CRF_FLG ;
   private String A851TBM08_DM_MICHAKU_MEMO_FLG ;
   private String A852TBM08_DM_MICHAKU_DM_FLG ;
   private String A853TBM08_DM_ARRI_CRF_FLG ;
   private String A854TBM08_DM_ARRI_MEMO_FLG ;
   private String A855TBM08_DM_ARRI_DM_FLG ;
   private String A856TBM08_DM_KAIJO_CRF_FLG ;
   private String A857TBM08_DM_KAIJO_MEMO_FLG ;
   private String A858TBM08_DM_KAIJO_DM_FLG ;
   private String A868TBM08_ICON_CAPTION ;
   private String A859TBM08_DEL_FLG ;
   private String A861TBM08_CRT_USER_ID ;
   private String A862TBM08_CRT_PROG_NM ;
   private String A864TBM08_UPD_USER_ID ;
   private String A865TBM08_UPD_PROG_NM ;
   private String Z849TBM08_AUTH_CD ;
   private String Z850TBM08_DM_MICHAKU_CRF_FLG ;
   private String Z851TBM08_DM_MICHAKU_MEMO_FLG ;
   private String Z852TBM08_DM_MICHAKU_DM_FLG ;
   private String Z853TBM08_DM_ARRI_CRF_FLG ;
   private String Z854TBM08_DM_ARRI_MEMO_FLG ;
   private String Z855TBM08_DM_ARRI_DM_FLG ;
   private String Z856TBM08_DM_KAIJO_CRF_FLG ;
   private String Z857TBM08_DM_KAIJO_MEMO_FLG ;
   private String Z858TBM08_DM_KAIJO_DM_FLG ;
   private String Z868TBM08_ICON_CAPTION ;
   private String Z859TBM08_DEL_FLG ;
   private String Z861TBM08_CRT_USER_ID ;
   private String Z862TBM08_CRT_PROG_NM ;
   private String Z864TBM08_UPD_USER_ID ;
   private String Z865TBM08_UPD_PROG_NM ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T001G4_A849TBM08_AUTH_CD ;
   private String[] T001G4_A850TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean[] T001G4_n850TBM08_DM_MICHAKU_CRF_FLG ;
   private String[] T001G4_A851TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean[] T001G4_n851TBM08_DM_MICHAKU_MEMO_FLG ;
   private String[] T001G4_A852TBM08_DM_MICHAKU_DM_FLG ;
   private boolean[] T001G4_n852TBM08_DM_MICHAKU_DM_FLG ;
   private String[] T001G4_A853TBM08_DM_ARRI_CRF_FLG ;
   private boolean[] T001G4_n853TBM08_DM_ARRI_CRF_FLG ;
   private String[] T001G4_A854TBM08_DM_ARRI_MEMO_FLG ;
   private boolean[] T001G4_n854TBM08_DM_ARRI_MEMO_FLG ;
   private String[] T001G4_A855TBM08_DM_ARRI_DM_FLG ;
   private boolean[] T001G4_n855TBM08_DM_ARRI_DM_FLG ;
   private String[] T001G4_A856TBM08_DM_KAIJO_CRF_FLG ;
   private boolean[] T001G4_n856TBM08_DM_KAIJO_CRF_FLG ;
   private String[] T001G4_A857TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean[] T001G4_n857TBM08_DM_KAIJO_MEMO_FLG ;
   private String[] T001G4_A858TBM08_DM_KAIJO_DM_FLG ;
   private boolean[] T001G4_n858TBM08_DM_KAIJO_DM_FLG ;
   private String[] T001G4_A868TBM08_ICON_CAPTION ;
   private boolean[] T001G4_n868TBM08_ICON_CAPTION ;
   private short[] T001G4_A872TBM08_ICON_R ;
   private boolean[] T001G4_n872TBM08_ICON_R ;
   private short[] T001G4_A873TBM08_ICON_G ;
   private boolean[] T001G4_n873TBM08_ICON_G ;
   private short[] T001G4_A874TBM08_ICON_B ;
   private boolean[] T001G4_n874TBM08_ICON_B ;
   private String[] T001G4_A859TBM08_DEL_FLG ;
   private boolean[] T001G4_n859TBM08_DEL_FLG ;
   private java.util.Date[] T001G4_A860TBM08_CRT_DATETIME ;
   private boolean[] T001G4_n860TBM08_CRT_DATETIME ;
   private String[] T001G4_A861TBM08_CRT_USER_ID ;
   private boolean[] T001G4_n861TBM08_CRT_USER_ID ;
   private String[] T001G4_A862TBM08_CRT_PROG_NM ;
   private boolean[] T001G4_n862TBM08_CRT_PROG_NM ;
   private java.util.Date[] T001G4_A863TBM08_UPD_DATETIME ;
   private boolean[] T001G4_n863TBM08_UPD_DATETIME ;
   private String[] T001G4_A864TBM08_UPD_USER_ID ;
   private boolean[] T001G4_n864TBM08_UPD_USER_ID ;
   private String[] T001G4_A865TBM08_UPD_PROG_NM ;
   private boolean[] T001G4_n865TBM08_UPD_PROG_NM ;
   private long[] T001G4_A866TBM08_UPD_COUNT ;
   private boolean[] T001G4_n866TBM08_UPD_COUNT ;
   private String[] T001G5_A849TBM08_AUTH_CD ;
   private String[] T001G3_A849TBM08_AUTH_CD ;
   private String[] T001G3_A850TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean[] T001G3_n850TBM08_DM_MICHAKU_CRF_FLG ;
   private String[] T001G3_A851TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean[] T001G3_n851TBM08_DM_MICHAKU_MEMO_FLG ;
   private String[] T001G3_A852TBM08_DM_MICHAKU_DM_FLG ;
   private boolean[] T001G3_n852TBM08_DM_MICHAKU_DM_FLG ;
   private String[] T001G3_A853TBM08_DM_ARRI_CRF_FLG ;
   private boolean[] T001G3_n853TBM08_DM_ARRI_CRF_FLG ;
   private String[] T001G3_A854TBM08_DM_ARRI_MEMO_FLG ;
   private boolean[] T001G3_n854TBM08_DM_ARRI_MEMO_FLG ;
   private String[] T001G3_A855TBM08_DM_ARRI_DM_FLG ;
   private boolean[] T001G3_n855TBM08_DM_ARRI_DM_FLG ;
   private String[] T001G3_A856TBM08_DM_KAIJO_CRF_FLG ;
   private boolean[] T001G3_n856TBM08_DM_KAIJO_CRF_FLG ;
   private String[] T001G3_A857TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean[] T001G3_n857TBM08_DM_KAIJO_MEMO_FLG ;
   private String[] T001G3_A858TBM08_DM_KAIJO_DM_FLG ;
   private boolean[] T001G3_n858TBM08_DM_KAIJO_DM_FLG ;
   private String[] T001G3_A868TBM08_ICON_CAPTION ;
   private boolean[] T001G3_n868TBM08_ICON_CAPTION ;
   private short[] T001G3_A872TBM08_ICON_R ;
   private boolean[] T001G3_n872TBM08_ICON_R ;
   private short[] T001G3_A873TBM08_ICON_G ;
   private boolean[] T001G3_n873TBM08_ICON_G ;
   private short[] T001G3_A874TBM08_ICON_B ;
   private boolean[] T001G3_n874TBM08_ICON_B ;
   private String[] T001G3_A859TBM08_DEL_FLG ;
   private boolean[] T001G3_n859TBM08_DEL_FLG ;
   private java.util.Date[] T001G3_A860TBM08_CRT_DATETIME ;
   private boolean[] T001G3_n860TBM08_CRT_DATETIME ;
   private String[] T001G3_A861TBM08_CRT_USER_ID ;
   private boolean[] T001G3_n861TBM08_CRT_USER_ID ;
   private String[] T001G3_A862TBM08_CRT_PROG_NM ;
   private boolean[] T001G3_n862TBM08_CRT_PROG_NM ;
   private java.util.Date[] T001G3_A863TBM08_UPD_DATETIME ;
   private boolean[] T001G3_n863TBM08_UPD_DATETIME ;
   private String[] T001G3_A864TBM08_UPD_USER_ID ;
   private boolean[] T001G3_n864TBM08_UPD_USER_ID ;
   private String[] T001G3_A865TBM08_UPD_PROG_NM ;
   private boolean[] T001G3_n865TBM08_UPD_PROG_NM ;
   private long[] T001G3_A866TBM08_UPD_COUNT ;
   private boolean[] T001G3_n866TBM08_UPD_COUNT ;
   private String[] T001G6_A849TBM08_AUTH_CD ;
   private String[] T001G7_A849TBM08_AUTH_CD ;
   private String[] T001G2_A849TBM08_AUTH_CD ;
   private String[] T001G2_A850TBM08_DM_MICHAKU_CRF_FLG ;
   private boolean[] T001G2_n850TBM08_DM_MICHAKU_CRF_FLG ;
   private String[] T001G2_A851TBM08_DM_MICHAKU_MEMO_FLG ;
   private boolean[] T001G2_n851TBM08_DM_MICHAKU_MEMO_FLG ;
   private String[] T001G2_A852TBM08_DM_MICHAKU_DM_FLG ;
   private boolean[] T001G2_n852TBM08_DM_MICHAKU_DM_FLG ;
   private String[] T001G2_A853TBM08_DM_ARRI_CRF_FLG ;
   private boolean[] T001G2_n853TBM08_DM_ARRI_CRF_FLG ;
   private String[] T001G2_A854TBM08_DM_ARRI_MEMO_FLG ;
   private boolean[] T001G2_n854TBM08_DM_ARRI_MEMO_FLG ;
   private String[] T001G2_A855TBM08_DM_ARRI_DM_FLG ;
   private boolean[] T001G2_n855TBM08_DM_ARRI_DM_FLG ;
   private String[] T001G2_A856TBM08_DM_KAIJO_CRF_FLG ;
   private boolean[] T001G2_n856TBM08_DM_KAIJO_CRF_FLG ;
   private String[] T001G2_A857TBM08_DM_KAIJO_MEMO_FLG ;
   private boolean[] T001G2_n857TBM08_DM_KAIJO_MEMO_FLG ;
   private String[] T001G2_A858TBM08_DM_KAIJO_DM_FLG ;
   private boolean[] T001G2_n858TBM08_DM_KAIJO_DM_FLG ;
   private String[] T001G2_A868TBM08_ICON_CAPTION ;
   private boolean[] T001G2_n868TBM08_ICON_CAPTION ;
   private short[] T001G2_A872TBM08_ICON_R ;
   private boolean[] T001G2_n872TBM08_ICON_R ;
   private short[] T001G2_A873TBM08_ICON_G ;
   private boolean[] T001G2_n873TBM08_ICON_G ;
   private short[] T001G2_A874TBM08_ICON_B ;
   private boolean[] T001G2_n874TBM08_ICON_B ;
   private String[] T001G2_A859TBM08_DEL_FLG ;
   private boolean[] T001G2_n859TBM08_DEL_FLG ;
   private java.util.Date[] T001G2_A860TBM08_CRT_DATETIME ;
   private boolean[] T001G2_n860TBM08_CRT_DATETIME ;
   private String[] T001G2_A861TBM08_CRT_USER_ID ;
   private boolean[] T001G2_n861TBM08_CRT_USER_ID ;
   private String[] T001G2_A862TBM08_CRT_PROG_NM ;
   private boolean[] T001G2_n862TBM08_CRT_PROG_NM ;
   private java.util.Date[] T001G2_A863TBM08_UPD_DATETIME ;
   private boolean[] T001G2_n863TBM08_UPD_DATETIME ;
   private String[] T001G2_A864TBM08_UPD_USER_ID ;
   private boolean[] T001G2_n864TBM08_UPD_USER_ID ;
   private String[] T001G2_A865TBM08_UPD_PROG_NM ;
   private boolean[] T001G2_n865TBM08_UPD_PROG_NM ;
   private long[] T001G2_A866TBM08_UPD_COUNT ;
   private boolean[] T001G2_n866TBM08_UPD_COUNT ;
   private String[] T001G11_A849TBM08_AUTH_CD ;
}

final  class tbm08_auth_inp_lvl__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T001G2", "SELECT `TBM08_AUTH_CD`, `TBM08_DM_MICHAKU_CRF_FLG`, `TBM08_DM_MICHAKU_MEMO_FLG`, `TBM08_DM_MICHAKU_DM_FLG`, `TBM08_DM_ARRI_CRF_FLG`, `TBM08_DM_ARRI_MEMO_FLG`, `TBM08_DM_ARRI_DM_FLG`, `TBM08_DM_KAIJO_CRF_FLG`, `TBM08_DM_KAIJO_MEMO_FLG`, `TBM08_DM_KAIJO_DM_FLG`, `TBM08_ICON_CAPTION`, `TBM08_ICON_R`, `TBM08_ICON_G`, `TBM08_ICON_B`, `TBM08_DEL_FLG`, `TBM08_CRT_DATETIME`, `TBM08_CRT_USER_ID`, `TBM08_CRT_PROG_NM`, `TBM08_UPD_DATETIME`, `TBM08_UPD_USER_ID`, `TBM08_UPD_PROG_NM`, `TBM08_UPD_COUNT` FROM `TBM08_AUTH_INP_LVL` WHERE `TBM08_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001G3", "SELECT `TBM08_AUTH_CD`, `TBM08_DM_MICHAKU_CRF_FLG`, `TBM08_DM_MICHAKU_MEMO_FLG`, `TBM08_DM_MICHAKU_DM_FLG`, `TBM08_DM_ARRI_CRF_FLG`, `TBM08_DM_ARRI_MEMO_FLG`, `TBM08_DM_ARRI_DM_FLG`, `TBM08_DM_KAIJO_CRF_FLG`, `TBM08_DM_KAIJO_MEMO_FLG`, `TBM08_DM_KAIJO_DM_FLG`, `TBM08_ICON_CAPTION`, `TBM08_ICON_R`, `TBM08_ICON_G`, `TBM08_ICON_B`, `TBM08_DEL_FLG`, `TBM08_CRT_DATETIME`, `TBM08_CRT_USER_ID`, `TBM08_CRT_PROG_NM`, `TBM08_UPD_DATETIME`, `TBM08_UPD_USER_ID`, `TBM08_UPD_PROG_NM`, `TBM08_UPD_COUNT` FROM `TBM08_AUTH_INP_LVL` WHERE `TBM08_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001G4", "SELECT TM1.`TBM08_AUTH_CD`, TM1.`TBM08_DM_MICHAKU_CRF_FLG`, TM1.`TBM08_DM_MICHAKU_MEMO_FLG`, TM1.`TBM08_DM_MICHAKU_DM_FLG`, TM1.`TBM08_DM_ARRI_CRF_FLG`, TM1.`TBM08_DM_ARRI_MEMO_FLG`, TM1.`TBM08_DM_ARRI_DM_FLG`, TM1.`TBM08_DM_KAIJO_CRF_FLG`, TM1.`TBM08_DM_KAIJO_MEMO_FLG`, TM1.`TBM08_DM_KAIJO_DM_FLG`, TM1.`TBM08_ICON_CAPTION`, TM1.`TBM08_ICON_R`, TM1.`TBM08_ICON_G`, TM1.`TBM08_ICON_B`, TM1.`TBM08_DEL_FLG`, TM1.`TBM08_CRT_DATETIME`, TM1.`TBM08_CRT_USER_ID`, TM1.`TBM08_CRT_PROG_NM`, TM1.`TBM08_UPD_DATETIME`, TM1.`TBM08_UPD_USER_ID`, TM1.`TBM08_UPD_PROG_NM`, TM1.`TBM08_UPD_COUNT` FROM `TBM08_AUTH_INP_LVL` TM1 WHERE TM1.`TBM08_AUTH_CD` = ? ORDER BY TM1.`TBM08_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T001G5", "SELECT `TBM08_AUTH_CD` FROM `TBM08_AUTH_INP_LVL` WHERE `TBM08_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T001G6", "SELECT `TBM08_AUTH_CD` FROM `TBM08_AUTH_INP_LVL` WHERE ( `TBM08_AUTH_CD` > ?) ORDER BY `TBM08_AUTH_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T001G7", "SELECT `TBM08_AUTH_CD` FROM `TBM08_AUTH_INP_LVL` WHERE ( `TBM08_AUTH_CD` < ?) ORDER BY `TBM08_AUTH_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T001G8", "INSERT INTO `TBM08_AUTH_INP_LVL` (`TBM08_AUTH_CD`, `TBM08_DM_MICHAKU_CRF_FLG`, `TBM08_DM_MICHAKU_MEMO_FLG`, `TBM08_DM_MICHAKU_DM_FLG`, `TBM08_DM_ARRI_CRF_FLG`, `TBM08_DM_ARRI_MEMO_FLG`, `TBM08_DM_ARRI_DM_FLG`, `TBM08_DM_KAIJO_CRF_FLG`, `TBM08_DM_KAIJO_MEMO_FLG`, `TBM08_DM_KAIJO_DM_FLG`, `TBM08_ICON_CAPTION`, `TBM08_ICON_R`, `TBM08_ICON_G`, `TBM08_ICON_B`, `TBM08_DEL_FLG`, `TBM08_CRT_DATETIME`, `TBM08_CRT_USER_ID`, `TBM08_CRT_PROG_NM`, `TBM08_UPD_DATETIME`, `TBM08_UPD_USER_ID`, `TBM08_UPD_PROG_NM`, `TBM08_UPD_COUNT`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T001G9", "UPDATE `TBM08_AUTH_INP_LVL` SET `TBM08_DM_MICHAKU_CRF_FLG`=?, `TBM08_DM_MICHAKU_MEMO_FLG`=?, `TBM08_DM_MICHAKU_DM_FLG`=?, `TBM08_DM_ARRI_CRF_FLG`=?, `TBM08_DM_ARRI_MEMO_FLG`=?, `TBM08_DM_ARRI_DM_FLG`=?, `TBM08_DM_KAIJO_CRF_FLG`=?, `TBM08_DM_KAIJO_MEMO_FLG`=?, `TBM08_DM_KAIJO_DM_FLG`=?, `TBM08_ICON_CAPTION`=?, `TBM08_ICON_R`=?, `TBM08_ICON_G`=?, `TBM08_ICON_B`=?, `TBM08_DEL_FLG`=?, `TBM08_CRT_DATETIME`=?, `TBM08_CRT_USER_ID`=?, `TBM08_CRT_PROG_NM`=?, `TBM08_UPD_DATETIME`=?, `TBM08_UPD_USER_ID`=?, `TBM08_UPD_PROG_NM`=?, `TBM08_UPD_COUNT`=?  WHERE `TBM08_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T001G10", "DELETE FROM `TBM08_AUTH_INP_LVL`  WHERE `TBM08_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T001G11", "SELECT `TBM08_AUTH_CD` FROM `TBM08_AUTH_INP_LVL` ORDER BY `TBM08_AUTH_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               break;
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
               break;
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
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 4 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
            case 5 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
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
               break;
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
               break;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               break;
      }
   }

}

