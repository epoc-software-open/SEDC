/*
               File: tbm41_crf_ncm_map_impl
        Description: CRF-NetCommonsマッピングマスタ
             Author: GeneXus Java Generator version 10_1_8-58720
       Generated on: July 3, 2017 14:55:6.74
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tbm41_crf_ncm_map_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TBM41_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatbm41_crt_user_id0M21( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TBM41_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatbm41_upd_user_id0M21( Gx_mode) ;
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
      Form.getMeta().addItem("Description", "CRF-NetCommonsマッピングマスタ", (short)(0)) ;
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      GX_FocusControl = edtTBM41_STUDY_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      wbErr = false ;
      httpContext.setTheme("Style2");
   }

   public tbm41_crf_ncm_map_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tbm41_crf_ncm_map_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tbm41_crf_ncm_map_impl.class ));
   }

   public tbm41_crf_ncm_map_impl( int remoteHandle ,
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
         wb_table1_2_0M21( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0M21e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0M21( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0M21( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0M21( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0M21e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         ClassString = "Group" ;
         StyleString = "" ;
         httpContext.writeText( "<fieldset id=\""+grpGroupdata_Internalname+"\""+" style=\"-moz-border-radius:3pt;\""+" class=\""+ClassString+"\">") ;
         httpContext.writeText( "<legend class=\""+ClassString+"Title"+"\">"+"CRF-NetCommonsマッピングマスタ"+"</legend>") ;
         wb_table3_27_0M21( true) ;
      }
      return  ;
   }

   public void wb_table3_27_0M21e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0M21e( true) ;
      }
      else
      {
         wb_table1_2_0M21e( false) ;
      }
   }

   public void wb_table3_27_0M21( boolean wbgen )
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
         wb_table4_33_0M21( true) ;
      }
      return  ;
   }

   public void wb_table4_33_0M21e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 101,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "EENTER.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM41_CRF_NCM_MAP.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "ECANCEL.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM41_CRF_NCM_MAP.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "EDELETE.", TempTags, "", httpContext.getButtonType( ), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_27_0M21e( true) ;
      }
      else
      {
         wb_table3_27_0M21e( false) ;
      }
   }

   public void wb_table4_33_0M21( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_study_id_Internalname, "試験ID", "", "", lblTextblocktbm41_study_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_STUDY_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A259TBM41_STUDY_ID, (byte)(10), (byte)(0), ".", "")), ((edtTBM41_STUDY_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A259TBM41_STUDY_ID), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A259TBM41_STUDY_ID), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(38);\"", "", "", "", "", edtTBM41_STUDY_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_STUDY_ID_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_crf_id_Internalname, "CRFID", "", "", lblTextblocktbm41_crf_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_CRF_ID_Internalname, GXutil.ltrim( localUtil.ntoc( A260TBM41_CRF_ID, (byte)(4), (byte)(0), ".", "")), ((edtTBM41_CRF_ID_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A260TBM41_CRF_ID), "ZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A260TBM41_CRF_ID), "ZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(43);\"", "", "", "", "", edtTBM41_CRF_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_CRF_ID_Enabled, 0, 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_crf_item_grp_div_Internalname, "項目・グループ識別区分", "", "", lblTextblocktbm41_crf_item_grp_div_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A378TBM41_CRF_ITEM_GRP_DIV", A378TBM41_CRF_ITEM_GRP_DIV);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_CRF_ITEM_GRP_DIV_Internalname, GXutil.rtrim( A378TBM41_CRF_ITEM_GRP_DIV), GXutil.rtrim( localUtil.format( A378TBM41_CRF_ITEM_GRP_DIV, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(48);\"", "", "", "", "", edtTBM41_CRF_ITEM_GRP_DIV_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_CRF_ITEM_GRP_DIV_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_crf_item_grp_cd_Internalname, "CRF項目・項目グループコード", "", "", lblTextblocktbm41_crf_item_grp_cd_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A261TBM41_CRF_ITEM_GRP_CD", A261TBM41_CRF_ITEM_GRP_CD);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_CRF_ITEM_GRP_CD_Internalname, GXutil.rtrim( A261TBM41_CRF_ITEM_GRP_CD), GXutil.rtrim( localUtil.format( A261TBM41_CRF_ITEM_GRP_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(53);\"", "", "", "", "", edtTBM41_CRF_ITEM_GRP_CD_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_CRF_ITEM_GRP_CD_Enabled, 0, 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_ncm_metadata_id_Internalname, "NetCommonsメタデータID", "", "", lblTextblocktbm41_ncm_metadata_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A262TBM41_NCM_METADATA_ID", A262TBM41_NCM_METADATA_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_NCM_METADATA_ID_Internalname, GXutil.rtrim( A262TBM41_NCM_METADATA_ID), GXutil.rtrim( localUtil.format( A262TBM41_NCM_METADATA_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(58);\"", "", "", "", "", edtTBM41_NCM_METADATA_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_NCM_METADATA_ID_Enabled, 0, 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktbm41_del_flg_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A263TBM41_DEL_FLG", A263TBM41_DEL_FLG);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_DEL_FLG_Internalname, GXutil.rtrim( A263TBM41_DEL_FLG), GXutil.rtrim( localUtil.format( A263TBM41_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(63);\"", "", "", "", "", edtTBM41_DEL_FLG_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_DEL_FLG_Enabled, 0, 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktbm41_crt_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A264TBM41_CRT_DATETIME", localUtil.ttoc( A264TBM41_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM41_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_CRT_DATETIME_Internalname, localUtil.format(A264TBM41_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A264TBM41_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(68);\"", "", "", "", "", edtTBM41_CRT_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_CRT_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM41_CRF_NCM_MAP.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM41_CRT_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM41_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktbm41_crt_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A265TBM41_CRT_USER_ID", A265TBM41_CRT_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_CRT_USER_ID_Internalname, GXutil.rtrim( A265TBM41_CRT_USER_ID), GXutil.rtrim( localUtil.format( A265TBM41_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(73);\"", "", "", "", "", edtTBM41_CRT_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_CRT_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktbm41_crt_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A266TBM41_CRT_PROG_NM", A266TBM41_CRT_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_CRT_PROG_NM_Internalname, GXutil.rtrim( A266TBM41_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A266TBM41_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(78);\"", "", "", "", "", edtTBM41_CRT_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_CRT_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktbm41_upd_datetime_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A267TBM41_UPD_DATETIME", localUtil.ttoc( A267TBM41_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         httpContext.writeText( "<div id=\""+edtTBM41_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_UPD_DATETIME_Internalname, localUtil.format(A267TBM41_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A267TBM41_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(83);\"", "", "", "", "", edtTBM41_UPD_DATETIME_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_UPD_DATETIME_Enabled, 0, 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM41_CRF_NCM_MAP.htm");
         GxWebStd.gx_bitmap( httpContext, edtTBM41_UPD_DATETIME_Internalname+"_dp_trigger", "calendar-img.gif", "", "", "", "", ((1==0)||(edtTBM41_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;vertical-align:text-bottom", "", "", "", "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktbm41_upd_user_id_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A268TBM41_UPD_USER_ID", A268TBM41_UPD_USER_ID);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_UPD_USER_ID_Internalname, GXutil.rtrim( A268TBM41_UPD_USER_ID), GXutil.rtrim( localUtil.format( A268TBM41_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(88);\"", "", "", "", "", edtTBM41_UPD_USER_ID_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_UPD_USER_ID_Enabled, 0, 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktbm41_upd_prog_nm_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A269TBM41_UPD_PROG_NM", A269TBM41_UPD_PROG_NM);
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_UPD_PROG_NM_Internalname, GXutil.rtrim( A269TBM41_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A269TBM41_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(93);\"", "", "", "", "", edtTBM41_UPD_PROG_NM_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_UPD_PROG_NM_Enabled, 0, 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "left", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td valign=\"top\" class=\"td5\" >") ;
         /* Text block */
         ClassString = "TextBlock" ;
         StyleString = "" ;
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktbm41_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktbm41_upd_cnt_Jsonclick, "", StyleString, ClassString, 0, "", 1, 1, (short)(0), "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         httpContext.ajax_rsp_assign_attri("", false, "A270TBM41_UPD_CNT", GXutil.ltrim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)));
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTBM41_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A270TBM41_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTBM41_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A270TBM41_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A270TBM41_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(98);\"", "", "", "", "", edtTBM41_UPD_CNT_Jsonclick, 0, ClassString, StyleString, "", 1, edtTBM41_UPD_CNT_Enabled, 0, 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), true, "right", "HLP_TBM41_CRF_NCM_MAP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_33_0M21e( true) ;
      }
      else
      {
         wb_table4_33_0M21e( false) ;
      }
   }

   public void wb_table2_5_0M21( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", "Style2"), "", "", "", "Style2", imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 9,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_first_separator_Jsonclick, "EFIRST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", "Style2"), "", "", "", "Style2", imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "EPREVIOUS.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", "Style2"), "", "", "", "Style2", imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_next_separator_Jsonclick, "ENEXT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", "Style2"), "", "", "", "Style2", imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_last_separator_Jsonclick, "ELAST.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", "Style2"), "", "", "", "Style2", imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_select_separator_Jsonclick, "ESELECT.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "EENTER.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "ECANCEL.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", "Style2"), "", "", "", "Style2", imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "", 0, "", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "EDELETE.", StyleString, ClassString, "", ""+TempTags, "", "", "HLP_TBM41_CRF_NCM_MAP.htm");
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
         wb_table2_5_0M21e( true) ;
      }
      else
      {
         wb_table2_5_0M21e( false) ;
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
      /* Execute user event: e110M2 */
      e110M2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( AnyError == 0 )
      {
         if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
         {
            /* Read saved SDTs. */
            /* Read variables values. */
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM41_STUDY_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM41_STUDY_ID_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM41_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM41_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A259TBM41_STUDY_ID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
            }
            else
            {
               A259TBM41_STUDY_ID = localUtil.ctol( httpContext.cgiGet( edtTBM41_STUDY_ID_Internalname), ".", ",") ;
               httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM41_CRF_ID_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM41_CRF_ID_Internalname), ".", ",") > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM41_CRF_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM41_CRF_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A260TBM41_CRF_ID = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
            }
            else
            {
               A260TBM41_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( edtTBM41_CRF_ID_Internalname), ".", ",")) ;
               httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
            }
            A378TBM41_CRF_ITEM_GRP_DIV = httpContext.cgiGet( edtTBM41_CRF_ITEM_GRP_DIV_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A378TBM41_CRF_ITEM_GRP_DIV", A378TBM41_CRF_ITEM_GRP_DIV);
            A261TBM41_CRF_ITEM_GRP_CD = httpContext.cgiGet( edtTBM41_CRF_ITEM_GRP_CD_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, "A261TBM41_CRF_ITEM_GRP_CD", A261TBM41_CRF_ITEM_GRP_CD);
            A262TBM41_NCM_METADATA_ID = httpContext.cgiGet( edtTBM41_NCM_METADATA_ID_Internalname) ;
            n262TBM41_NCM_METADATA_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A262TBM41_NCM_METADATA_ID", A262TBM41_NCM_METADATA_ID);
            n262TBM41_NCM_METADATA_ID = ((GXutil.strcmp("", A262TBM41_NCM_METADATA_ID)==0) ? true : false) ;
            A263TBM41_DEL_FLG = httpContext.cgiGet( edtTBM41_DEL_FLG_Internalname) ;
            n263TBM41_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A263TBM41_DEL_FLG", A263TBM41_DEL_FLG);
            n263TBM41_DEL_FLG = ((GXutil.strcmp("", A263TBM41_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM41_CRT_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"作成日時"}), 1, "TBM41_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM41_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A264TBM41_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n264TBM41_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A264TBM41_CRT_DATETIME", localUtil.ttoc( A264TBM41_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A264TBM41_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM41_CRT_DATETIME_Internalname)) ;
               n264TBM41_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A264TBM41_CRT_DATETIME", localUtil.ttoc( A264TBM41_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n264TBM41_CRT_DATETIME = (GXutil.nullDate().equals(A264TBM41_CRT_DATETIME) ? true : false) ;
            A265TBM41_CRT_USER_ID = httpContext.cgiGet( edtTBM41_CRT_USER_ID_Internalname) ;
            n265TBM41_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A265TBM41_CRT_USER_ID", A265TBM41_CRT_USER_ID);
            n265TBM41_CRT_USER_ID = ((GXutil.strcmp("", A265TBM41_CRT_USER_ID)==0) ? true : false) ;
            A266TBM41_CRT_PROG_NM = httpContext.cgiGet( edtTBM41_CRT_PROG_NM_Internalname) ;
            n266TBM41_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A266TBM41_CRT_PROG_NM", A266TBM41_CRT_PROG_NM);
            n266TBM41_CRT_PROG_NM = ((GXutil.strcmp("", A266TBM41_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTBM41_UPD_DATETIME_Internalname), (byte)(6), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {"更新日時"}), 1, "TBM41_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM41_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A267TBM41_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n267TBM41_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A267TBM41_UPD_DATETIME", localUtil.ttoc( A267TBM41_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A267TBM41_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTBM41_UPD_DATETIME_Internalname)) ;
               n267TBM41_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A267TBM41_UPD_DATETIME", localUtil.ttoc( A267TBM41_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n267TBM41_UPD_DATETIME = (GXutil.nullDate().equals(A267TBM41_UPD_DATETIME) ? true : false) ;
            A268TBM41_UPD_USER_ID = httpContext.cgiGet( edtTBM41_UPD_USER_ID_Internalname) ;
            n268TBM41_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A268TBM41_UPD_USER_ID", A268TBM41_UPD_USER_ID);
            n268TBM41_UPD_USER_ID = ((GXutil.strcmp("", A268TBM41_UPD_USER_ID)==0) ? true : false) ;
            A269TBM41_UPD_PROG_NM = httpContext.cgiGet( edtTBM41_UPD_PROG_NM_Internalname) ;
            n269TBM41_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A269TBM41_UPD_PROG_NM", A269TBM41_UPD_PROG_NM);
            n269TBM41_UPD_PROG_NM = ((GXutil.strcmp("", A269TBM41_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTBM41_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTBM41_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TBM41_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM41_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A270TBM41_UPD_CNT = 0 ;
               n270TBM41_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A270TBM41_UPD_CNT", GXutil.ltrim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)));
            }
            else
            {
               A270TBM41_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTBM41_UPD_CNT_Internalname), ".", ",") ;
               n270TBM41_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A270TBM41_UPD_CNT", GXutil.ltrim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)));
            }
            n270TBM41_UPD_CNT = ((0==A270TBM41_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z259TBM41_STUDY_ID = localUtil.ctol( httpContext.cgiGet( "Z259TBM41_STUDY_ID"), ".", ",") ;
            Z260TBM41_CRF_ID = (short)(localUtil.ctol( httpContext.cgiGet( "Z260TBM41_CRF_ID"), ".", ",")) ;
            Z378TBM41_CRF_ITEM_GRP_DIV = httpContext.cgiGet( "Z378TBM41_CRF_ITEM_GRP_DIV") ;
            Z261TBM41_CRF_ITEM_GRP_CD = httpContext.cgiGet( "Z261TBM41_CRF_ITEM_GRP_CD") ;
            Z264TBM41_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z264TBM41_CRT_DATETIME"), 0) ;
            n264TBM41_CRT_DATETIME = (GXutil.nullDate().equals(A264TBM41_CRT_DATETIME) ? true : false) ;
            Z265TBM41_CRT_USER_ID = httpContext.cgiGet( "Z265TBM41_CRT_USER_ID") ;
            n265TBM41_CRT_USER_ID = ((GXutil.strcmp("", A265TBM41_CRT_USER_ID)==0) ? true : false) ;
            Z267TBM41_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z267TBM41_UPD_DATETIME"), 0) ;
            n267TBM41_UPD_DATETIME = (GXutil.nullDate().equals(A267TBM41_UPD_DATETIME) ? true : false) ;
            Z268TBM41_UPD_USER_ID = httpContext.cgiGet( "Z268TBM41_UPD_USER_ID") ;
            n268TBM41_UPD_USER_ID = ((GXutil.strcmp("", A268TBM41_UPD_USER_ID)==0) ? true : false) ;
            Z270TBM41_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z270TBM41_UPD_CNT"), ".", ",") ;
            n270TBM41_UPD_CNT = ((0==A270TBM41_UPD_CNT) ? true : false) ;
            Z262TBM41_NCM_METADATA_ID = httpContext.cgiGet( "Z262TBM41_NCM_METADATA_ID") ;
            n262TBM41_NCM_METADATA_ID = ((GXutil.strcmp("", A262TBM41_NCM_METADATA_ID)==0) ? true : false) ;
            Z263TBM41_DEL_FLG = httpContext.cgiGet( "Z263TBM41_DEL_FLG") ;
            n263TBM41_DEL_FLG = ((GXutil.strcmp("", A263TBM41_DEL_FLG)==0) ? true : false) ;
            Z266TBM41_CRT_PROG_NM = httpContext.cgiGet( "Z266TBM41_CRT_PROG_NM") ;
            n266TBM41_CRT_PROG_NM = ((GXutil.strcmp("", A266TBM41_CRT_PROG_NM)==0) ? true : false) ;
            Z269TBM41_UPD_PROG_NM = httpContext.cgiGet( "Z269TBM41_UPD_PROG_NM") ;
            n269TBM41_UPD_PROG_NM = ((GXutil.strcmp("", A269TBM41_UPD_PROG_NM)==0) ? true : false) ;
            O270TBM41_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O270TBM41_UPD_CNT"), ".", ",") ;
            n270TBM41_UPD_CNT = ((0==A270TBM41_UPD_CNT) ? true : false) ;
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
               A259TBM41_STUDY_ID = GXutil.lval( httpContext.GetNextPar( )) ;
               httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
               A260TBM41_CRF_ID = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
               A378TBM41_CRF_ITEM_GRP_DIV = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A378TBM41_CRF_ITEM_GRP_DIV", A378TBM41_CRF_ITEM_GRP_DIV);
               A261TBM41_CRF_ITEM_GRP_CD = httpContext.GetNextPar( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "A261TBM41_CRF_ITEM_GRP_CD", A261TBM41_CRF_ITEM_GRP_CD);
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
                     /* Execute user event: e110M2 */
                     e110M2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120M2 */
                     e120M2 ();
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
         /* Execute user event: e120M2 */
         e120M2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0M21( ) ;
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
      disableAttributes0M21( ) ;
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

   public void resetCaption0M0( )
   {
   }

   public void e110M2( )
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

   public void e120M2( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV9Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      AV7W_TXT = "" ;
      AV7W_TXT = AV7W_TXT + "試験ID:" + GXutil.trim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A260TBM41_CRF_ID, 10, 0)) + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A378TBM41_CRF_ITEM_GRP_DIV + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A261TBM41_CRF_ITEM_GRP_CD + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A262TBM41_NCM_METADATA_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A263TBM41_DEL_FLG + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A264TBM41_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm41_crf_ncm_map_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A264TBM41_CRT_DATETIME", localUtil.ttoc( A264TBM41_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A265TBM41_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A266TBM41_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      GXt_char3 = AV7W_TXT ;
      GXv_char4[0] = GXt_char3 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A267TBM41_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char4) ;
      tbm41_crf_ncm_map_impl.this.GXt_char3 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A267TBM41_UPD_DATETIME", localUtil.ttoc( A267TBM41_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV7W_TXT = AV7W_TXT + GXt_char3 + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A268TBM41_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + A269TBM41_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      AV7W_TXT = AV7W_TXT + GXutil.trim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
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

   public void zm0M21( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z264TBM41_CRT_DATETIME = T000M3_A264TBM41_CRT_DATETIME[0] ;
            Z265TBM41_CRT_USER_ID = T000M3_A265TBM41_CRT_USER_ID[0] ;
            Z267TBM41_UPD_DATETIME = T000M3_A267TBM41_UPD_DATETIME[0] ;
            Z268TBM41_UPD_USER_ID = T000M3_A268TBM41_UPD_USER_ID[0] ;
            Z270TBM41_UPD_CNT = T000M3_A270TBM41_UPD_CNT[0] ;
            Z262TBM41_NCM_METADATA_ID = T000M3_A262TBM41_NCM_METADATA_ID[0] ;
            Z263TBM41_DEL_FLG = T000M3_A263TBM41_DEL_FLG[0] ;
            Z266TBM41_CRT_PROG_NM = T000M3_A266TBM41_CRT_PROG_NM[0] ;
            Z269TBM41_UPD_PROG_NM = T000M3_A269TBM41_UPD_PROG_NM[0] ;
         }
         else
         {
            Z264TBM41_CRT_DATETIME = A264TBM41_CRT_DATETIME ;
            Z265TBM41_CRT_USER_ID = A265TBM41_CRT_USER_ID ;
            Z267TBM41_UPD_DATETIME = A267TBM41_UPD_DATETIME ;
            Z268TBM41_UPD_USER_ID = A268TBM41_UPD_USER_ID ;
            Z270TBM41_UPD_CNT = A270TBM41_UPD_CNT ;
            Z262TBM41_NCM_METADATA_ID = A262TBM41_NCM_METADATA_ID ;
            Z263TBM41_DEL_FLG = A263TBM41_DEL_FLG ;
            Z266TBM41_CRT_PROG_NM = A266TBM41_CRT_PROG_NM ;
            Z269TBM41_UPD_PROG_NM = A269TBM41_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z259TBM41_STUDY_ID = A259TBM41_STUDY_ID ;
         Z260TBM41_CRF_ID = A260TBM41_CRF_ID ;
         Z378TBM41_CRF_ITEM_GRP_DIV = A378TBM41_CRF_ITEM_GRP_DIV ;
         Z261TBM41_CRF_ITEM_GRP_CD = A261TBM41_CRF_ITEM_GRP_CD ;
         Z264TBM41_CRT_DATETIME = A264TBM41_CRT_DATETIME ;
         Z265TBM41_CRT_USER_ID = A265TBM41_CRT_USER_ID ;
         Z267TBM41_UPD_DATETIME = A267TBM41_UPD_DATETIME ;
         Z268TBM41_UPD_USER_ID = A268TBM41_UPD_USER_ID ;
         Z270TBM41_UPD_CNT = A270TBM41_UPD_CNT ;
         Z262TBM41_NCM_METADATA_ID = A262TBM41_NCM_METADATA_ID ;
         Z263TBM41_DEL_FLG = A263TBM41_DEL_FLG ;
         Z266TBM41_CRT_PROG_NM = A266TBM41_CRT_PROG_NM ;
         Z269TBM41_UPD_PROG_NM = A269TBM41_UPD_PROG_NM ;
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

   public void load0M21( )
   {
      /* Using cursor T000M4 */
      pr_default.execute(2, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A264TBM41_CRT_DATETIME = T000M4_A264TBM41_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A264TBM41_CRT_DATETIME", localUtil.ttoc( A264TBM41_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n264TBM41_CRT_DATETIME = T000M4_n264TBM41_CRT_DATETIME[0] ;
         A265TBM41_CRT_USER_ID = T000M4_A265TBM41_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A265TBM41_CRT_USER_ID", A265TBM41_CRT_USER_ID);
         n265TBM41_CRT_USER_ID = T000M4_n265TBM41_CRT_USER_ID[0] ;
         A267TBM41_UPD_DATETIME = T000M4_A267TBM41_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A267TBM41_UPD_DATETIME", localUtil.ttoc( A267TBM41_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n267TBM41_UPD_DATETIME = T000M4_n267TBM41_UPD_DATETIME[0] ;
         A268TBM41_UPD_USER_ID = T000M4_A268TBM41_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A268TBM41_UPD_USER_ID", A268TBM41_UPD_USER_ID);
         n268TBM41_UPD_USER_ID = T000M4_n268TBM41_UPD_USER_ID[0] ;
         A270TBM41_UPD_CNT = T000M4_A270TBM41_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A270TBM41_UPD_CNT", GXutil.ltrim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)));
         n270TBM41_UPD_CNT = T000M4_n270TBM41_UPD_CNT[0] ;
         A262TBM41_NCM_METADATA_ID = T000M4_A262TBM41_NCM_METADATA_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A262TBM41_NCM_METADATA_ID", A262TBM41_NCM_METADATA_ID);
         n262TBM41_NCM_METADATA_ID = T000M4_n262TBM41_NCM_METADATA_ID[0] ;
         A263TBM41_DEL_FLG = T000M4_A263TBM41_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A263TBM41_DEL_FLG", A263TBM41_DEL_FLG);
         n263TBM41_DEL_FLG = T000M4_n263TBM41_DEL_FLG[0] ;
         A266TBM41_CRT_PROG_NM = T000M4_A266TBM41_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266TBM41_CRT_PROG_NM", A266TBM41_CRT_PROG_NM);
         n266TBM41_CRT_PROG_NM = T000M4_n266TBM41_CRT_PROG_NM[0] ;
         A269TBM41_UPD_PROG_NM = T000M4_A269TBM41_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A269TBM41_UPD_PROG_NM", A269TBM41_UPD_PROG_NM);
         n269TBM41_UPD_PROG_NM = T000M4_n269TBM41_UPD_PROG_NM[0] ;
         zm0M21( -8) ;
      }
      pr_default.close(2);
      onLoadActions0M21( ) ;
   }

   public void onLoadActions0M21( )
   {
      AV9Pgmname = "TBM41_CRF_NCM_MAP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
   }

   public void checkExtendedTable0M21( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV9Pgmname = "TBM41_CRF_NCM_MAP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      if ( ! ( GXutil.nullDate().equals(A264TBM41_CRT_DATETIME) || (( A264TBM41_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A264TBM41_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
      if ( ! ( GXutil.nullDate().equals(A267TBM41_UPD_DATETIME) || (( A267TBM41_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A267TBM41_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "");
         AnyError = (short)(1) ;
      }
   }

   public void closeExtendedTableCursors0M21( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0M21( )
   {
      /* Using cursor T000M5 */
      pr_default.execute(3, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound21 = (short)(1) ;
      }
      else
      {
         RcdFound21 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000M3 */
      pr_default.execute(1, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0M21( 8) ;
         RcdFound21 = (short)(1) ;
         A259TBM41_STUDY_ID = T000M3_A259TBM41_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
         A260TBM41_CRF_ID = T000M3_A260TBM41_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
         A378TBM41_CRF_ITEM_GRP_DIV = T000M3_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A378TBM41_CRF_ITEM_GRP_DIV", A378TBM41_CRF_ITEM_GRP_DIV);
         A261TBM41_CRF_ITEM_GRP_CD = T000M3_A261TBM41_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A261TBM41_CRF_ITEM_GRP_CD", A261TBM41_CRF_ITEM_GRP_CD);
         A264TBM41_CRT_DATETIME = T000M3_A264TBM41_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A264TBM41_CRT_DATETIME", localUtil.ttoc( A264TBM41_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n264TBM41_CRT_DATETIME = T000M3_n264TBM41_CRT_DATETIME[0] ;
         A265TBM41_CRT_USER_ID = T000M3_A265TBM41_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A265TBM41_CRT_USER_ID", A265TBM41_CRT_USER_ID);
         n265TBM41_CRT_USER_ID = T000M3_n265TBM41_CRT_USER_ID[0] ;
         A267TBM41_UPD_DATETIME = T000M3_A267TBM41_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A267TBM41_UPD_DATETIME", localUtil.ttoc( A267TBM41_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n267TBM41_UPD_DATETIME = T000M3_n267TBM41_UPD_DATETIME[0] ;
         A268TBM41_UPD_USER_ID = T000M3_A268TBM41_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A268TBM41_UPD_USER_ID", A268TBM41_UPD_USER_ID);
         n268TBM41_UPD_USER_ID = T000M3_n268TBM41_UPD_USER_ID[0] ;
         A270TBM41_UPD_CNT = T000M3_A270TBM41_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A270TBM41_UPD_CNT", GXutil.ltrim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)));
         n270TBM41_UPD_CNT = T000M3_n270TBM41_UPD_CNT[0] ;
         A262TBM41_NCM_METADATA_ID = T000M3_A262TBM41_NCM_METADATA_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A262TBM41_NCM_METADATA_ID", A262TBM41_NCM_METADATA_ID);
         n262TBM41_NCM_METADATA_ID = T000M3_n262TBM41_NCM_METADATA_ID[0] ;
         A263TBM41_DEL_FLG = T000M3_A263TBM41_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A263TBM41_DEL_FLG", A263TBM41_DEL_FLG);
         n263TBM41_DEL_FLG = T000M3_n263TBM41_DEL_FLG[0] ;
         A266TBM41_CRT_PROG_NM = T000M3_A266TBM41_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266TBM41_CRT_PROG_NM", A266TBM41_CRT_PROG_NM);
         n266TBM41_CRT_PROG_NM = T000M3_n266TBM41_CRT_PROG_NM[0] ;
         A269TBM41_UPD_PROG_NM = T000M3_A269TBM41_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A269TBM41_UPD_PROG_NM", A269TBM41_UPD_PROG_NM);
         n269TBM41_UPD_PROG_NM = T000M3_n269TBM41_UPD_PROG_NM[0] ;
         O270TBM41_UPD_CNT = A270TBM41_UPD_CNT ;
         n270TBM41_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A270TBM41_UPD_CNT", GXutil.ltrim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)));
         Z259TBM41_STUDY_ID = A259TBM41_STUDY_ID ;
         Z260TBM41_CRF_ID = A260TBM41_CRF_ID ;
         Z378TBM41_CRF_ITEM_GRP_DIV = A378TBM41_CRF_ITEM_GRP_DIV ;
         Z261TBM41_CRF_ITEM_GRP_CD = A261TBM41_CRF_ITEM_GRP_CD ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0M21( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound21 = (short)(0) ;
         initializeNonKey0M21( ) ;
         sMode21 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode21 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey0M21( ) ;
      if ( RcdFound21 == 0 )
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
      RcdFound21 = (short)(0) ;
      /* Using cursor T000M6 */
      pr_default.execute(4, new Object[] {new Long(A259TBM41_STUDY_ID), new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), new Short(A260TBM41_CRF_ID), new Long(A259TBM41_STUDY_ID), A378TBM41_CRF_ITEM_GRP_DIV, A378TBM41_CRF_ITEM_GRP_DIV, new Short(A260TBM41_CRF_ID), new Long(A259TBM41_STUDY_ID), A261TBM41_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( T000M6_A259TBM41_STUDY_ID[0] < A259TBM41_STUDY_ID ) || ( T000M6_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( T000M6_A260TBM41_CRF_ID[0] < A260TBM41_CRF_ID ) || ( T000M6_A260TBM41_CRF_ID[0] == A260TBM41_CRF_ID ) && ( T000M6_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( GXutil.strcmp(T000M6_A378TBM41_CRF_ITEM_GRP_DIV[0], A378TBM41_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T000M6_A378TBM41_CRF_ITEM_GRP_DIV[0], A378TBM41_CRF_ITEM_GRP_DIV) == 0 ) && ( T000M6_A260TBM41_CRF_ID[0] == A260TBM41_CRF_ID ) && ( T000M6_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( GXutil.strcmp(T000M6_A261TBM41_CRF_ITEM_GRP_CD[0], A261TBM41_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( T000M6_A259TBM41_STUDY_ID[0] > A259TBM41_STUDY_ID ) || ( T000M6_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( T000M6_A260TBM41_CRF_ID[0] > A260TBM41_CRF_ID ) || ( T000M6_A260TBM41_CRF_ID[0] == A260TBM41_CRF_ID ) && ( T000M6_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( GXutil.strcmp(T000M6_A378TBM41_CRF_ITEM_GRP_DIV[0], A378TBM41_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T000M6_A378TBM41_CRF_ITEM_GRP_DIV[0], A378TBM41_CRF_ITEM_GRP_DIV) == 0 ) && ( T000M6_A260TBM41_CRF_ID[0] == A260TBM41_CRF_ID ) && ( T000M6_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( GXutil.strcmp(T000M6_A261TBM41_CRF_ITEM_GRP_CD[0], A261TBM41_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            A259TBM41_STUDY_ID = T000M6_A259TBM41_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
            A260TBM41_CRF_ID = T000M6_A260TBM41_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
            A378TBM41_CRF_ITEM_GRP_DIV = T000M6_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A378TBM41_CRF_ITEM_GRP_DIV", A378TBM41_CRF_ITEM_GRP_DIV);
            A261TBM41_CRF_ITEM_GRP_CD = T000M6_A261TBM41_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A261TBM41_CRF_ITEM_GRP_CD", A261TBM41_CRF_ITEM_GRP_CD);
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound21 = (short)(0) ;
      /* Using cursor T000M7 */
      pr_default.execute(5, new Object[] {new Long(A259TBM41_STUDY_ID), new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), new Short(A260TBM41_CRF_ID), new Long(A259TBM41_STUDY_ID), A378TBM41_CRF_ITEM_GRP_DIV, A378TBM41_CRF_ITEM_GRP_DIV, new Short(A260TBM41_CRF_ID), new Long(A259TBM41_STUDY_ID), A261TBM41_CRF_ITEM_GRP_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( T000M7_A259TBM41_STUDY_ID[0] > A259TBM41_STUDY_ID ) || ( T000M7_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( T000M7_A260TBM41_CRF_ID[0] > A260TBM41_CRF_ID ) || ( T000M7_A260TBM41_CRF_ID[0] == A260TBM41_CRF_ID ) && ( T000M7_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( GXutil.strcmp(T000M7_A378TBM41_CRF_ITEM_GRP_DIV[0], A378TBM41_CRF_ITEM_GRP_DIV) > 0 ) || ( GXutil.strcmp(T000M7_A378TBM41_CRF_ITEM_GRP_DIV[0], A378TBM41_CRF_ITEM_GRP_DIV) == 0 ) && ( T000M7_A260TBM41_CRF_ID[0] == A260TBM41_CRF_ID ) && ( T000M7_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( GXutil.strcmp(T000M7_A261TBM41_CRF_ITEM_GRP_CD[0], A261TBM41_CRF_ITEM_GRP_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( T000M7_A259TBM41_STUDY_ID[0] < A259TBM41_STUDY_ID ) || ( T000M7_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( T000M7_A260TBM41_CRF_ID[0] < A260TBM41_CRF_ID ) || ( T000M7_A260TBM41_CRF_ID[0] == A260TBM41_CRF_ID ) && ( T000M7_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( GXutil.strcmp(T000M7_A378TBM41_CRF_ITEM_GRP_DIV[0], A378TBM41_CRF_ITEM_GRP_DIV) < 0 ) || ( GXutil.strcmp(T000M7_A378TBM41_CRF_ITEM_GRP_DIV[0], A378TBM41_CRF_ITEM_GRP_DIV) == 0 ) && ( T000M7_A260TBM41_CRF_ID[0] == A260TBM41_CRF_ID ) && ( T000M7_A259TBM41_STUDY_ID[0] == A259TBM41_STUDY_ID ) && ( GXutil.strcmp(T000M7_A261TBM41_CRF_ITEM_GRP_CD[0], A261TBM41_CRF_ITEM_GRP_CD) < 0 ) ) )
         {
            A259TBM41_STUDY_ID = T000M7_A259TBM41_STUDY_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
            A260TBM41_CRF_ID = T000M7_A260TBM41_CRF_ID[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
            A378TBM41_CRF_ITEM_GRP_DIV = T000M7_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A378TBM41_CRF_ITEM_GRP_DIV", A378TBM41_CRF_ITEM_GRP_DIV);
            A261TBM41_CRF_ITEM_GRP_CD = T000M7_A261TBM41_CRF_ITEM_GRP_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A261TBM41_CRF_ITEM_GRP_CD", A261TBM41_CRF_ITEM_GRP_CD);
            RcdFound21 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0M21( ) ;
      if ( RcdFound21 == 1 )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TBM41_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM41_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( ( A259TBM41_STUDY_ID != Z259TBM41_STUDY_ID ) || ( A260TBM41_CRF_ID != Z260TBM41_CRF_ID ) || ( GXutil.strcmp(A378TBM41_CRF_ITEM_GRP_DIV, Z378TBM41_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A261TBM41_CRF_ITEM_GRP_CD, Z261TBM41_CRF_ITEM_GRP_CD) != 0 ) )
         {
            A259TBM41_STUDY_ID = Z259TBM41_STUDY_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
            A260TBM41_CRF_ID = Z260TBM41_CRF_ID ;
            httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
            A378TBM41_CRF_ITEM_GRP_DIV = Z378TBM41_CRF_ITEM_GRP_DIV ;
            httpContext.ajax_rsp_assign_attri("", false, "A378TBM41_CRF_ITEM_GRP_DIV", A378TBM41_CRF_ITEM_GRP_DIV);
            A261TBM41_CRF_ITEM_GRP_CD = Z261TBM41_CRF_ITEM_GRP_CD ;
            httpContext.ajax_rsp_assign_attri("", false, "A261TBM41_CRF_ITEM_GRP_CD", A261TBM41_CRF_ITEM_GRP_CD);
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TBM41_STUDY_ID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTBM41_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            delete( ) ;
            afterTrn( ) ;
            GX_FocusControl = edtTBM41_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         else
         {
            Gx_mode = "UPD" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Update record */
            update0M21( ) ;
            GX_FocusControl = edtTBM41_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( ( A259TBM41_STUDY_ID != Z259TBM41_STUDY_ID ) || ( A260TBM41_CRF_ID != Z260TBM41_CRF_ID ) || ( GXutil.strcmp(A378TBM41_CRF_ITEM_GRP_DIV, Z378TBM41_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A261TBM41_CRF_ITEM_GRP_CD, Z261TBM41_CRF_ITEM_GRP_CD) != 0 ) )
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            /* Insert record */
            GX_FocusControl = edtTBM41_STUDY_ID_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            insert0M21( ) ;
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
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TBM41_STUDY_ID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTBM41_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTBM41_STUDY_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert0M21( ) ;
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
      if ( ( A259TBM41_STUDY_ID != Z259TBM41_STUDY_ID ) || ( A260TBM41_CRF_ID != Z260TBM41_CRF_ID ) || ( GXutil.strcmp(A378TBM41_CRF_ITEM_GRP_DIV, Z378TBM41_CRF_ITEM_GRP_DIV) != 0 ) || ( GXutil.strcmp(A261TBM41_CRF_ITEM_GRP_CD, Z261TBM41_CRF_ITEM_GRP_CD) != 0 ) )
      {
         A259TBM41_STUDY_ID = Z259TBM41_STUDY_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
         A260TBM41_CRF_ID = Z260TBM41_CRF_ID ;
         httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
         A378TBM41_CRF_ITEM_GRP_DIV = Z378TBM41_CRF_ITEM_GRP_DIV ;
         httpContext.ajax_rsp_assign_attri("", false, "A378TBM41_CRF_ITEM_GRP_DIV", A378TBM41_CRF_ITEM_GRP_DIV);
         A261TBM41_CRF_ITEM_GRP_CD = Z261TBM41_CRF_ITEM_GRP_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A261TBM41_CRF_ITEM_GRP_CD", A261TBM41_CRF_ITEM_GRP_CD);
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TBM41_STUDY_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTBM41_STUDY_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTBM41_STUDY_ID_Internalname ;
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
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TBM41_STUDY_ID");
         AnyError = (short)(1) ;
      }
      GX_FocusControl = edtTBM41_NCM_METADATA_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0M21( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM41_NCM_METADATA_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0M21( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      move_previous( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM41_NCM_METADATA_ID_Internalname ;
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
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM41_NCM_METADATA_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      scanStart0M21( ) ;
      if ( RcdFound21 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "");
      }
      else
      {
         while ( RcdFound21 != 0 )
         {
            scanNext0M21( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTBM41_NCM_METADATA_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0M21( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0M21( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000M2 */
         pr_default.execute(0, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM41_CRF_NCM_MAP"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z264TBM41_CRT_DATETIME.equals( T000M2_A264TBM41_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z265TBM41_CRT_USER_ID, T000M2_A265TBM41_CRT_USER_ID[0]) != 0 ) || !( Z267TBM41_UPD_DATETIME.equals( T000M2_A267TBM41_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z268TBM41_UPD_USER_ID, T000M2_A268TBM41_UPD_USER_ID[0]) != 0 ) || ( Z270TBM41_UPD_CNT != T000M2_A270TBM41_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z262TBM41_NCM_METADATA_ID, T000M2_A262TBM41_NCM_METADATA_ID[0]) != 0 ) || ( GXutil.strcmp(Z263TBM41_DEL_FLG, T000M2_A263TBM41_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z266TBM41_CRT_PROG_NM, T000M2_A266TBM41_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z269TBM41_UPD_PROG_NM, T000M2_A269TBM41_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TBM41_CRF_NCM_MAP"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0M21( )
   {
      beforeValidate0M21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0M21( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0M21( 0) ;
         checkOptimisticConcurrency0M21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0M21( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0M21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000M8 */
                  pr_default.execute(6, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD, new Boolean(n264TBM41_CRT_DATETIME), A264TBM41_CRT_DATETIME, new Boolean(n265TBM41_CRT_USER_ID), A265TBM41_CRT_USER_ID, new Boolean(n267TBM41_UPD_DATETIME), A267TBM41_UPD_DATETIME, new Boolean(n268TBM41_UPD_USER_ID), A268TBM41_UPD_USER_ID, new Boolean(n270TBM41_UPD_CNT), new Long(A270TBM41_UPD_CNT), new Boolean(n262TBM41_NCM_METADATA_ID), A262TBM41_NCM_METADATA_ID, new Boolean(n263TBM41_DEL_FLG), A263TBM41_DEL_FLG, new Boolean(n266TBM41_CRT_PROG_NM), A266TBM41_CRT_PROG_NM, new Boolean(n269TBM41_UPD_PROG_NM), A269TBM41_UPD_PROG_NM});
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
                        resetCaption0M0( ) ;
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
            load0M21( ) ;
         }
         endLevel0M21( ) ;
      }
      closeExtendedTableCursors0M21( ) ;
   }

   public void update0M21( )
   {
      beforeValidate0M21( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0M21( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0M21( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0M21( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0M21( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000M9 */
                  pr_default.execute(7, new Object[] {new Boolean(n264TBM41_CRT_DATETIME), A264TBM41_CRT_DATETIME, new Boolean(n265TBM41_CRT_USER_ID), A265TBM41_CRT_USER_ID, new Boolean(n267TBM41_UPD_DATETIME), A267TBM41_UPD_DATETIME, new Boolean(n268TBM41_UPD_USER_ID), A268TBM41_UPD_USER_ID, new Boolean(n270TBM41_UPD_CNT), new Long(A270TBM41_UPD_CNT), new Boolean(n262TBM41_NCM_METADATA_ID), A262TBM41_NCM_METADATA_ID, new Boolean(n263TBM41_DEL_FLG), A263TBM41_DEL_FLG, new Boolean(n266TBM41_CRT_PROG_NM), A266TBM41_CRT_PROG_NM, new Boolean(n269TBM41_UPD_PROG_NM), A269TBM41_UPD_PROG_NM, new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TBM41_CRF_NCM_MAP"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0M21( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "");
                        resetCaption0M0( ) ;
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
         endLevel0M21( ) ;
      }
      closeExtendedTableCursors0M21( ) ;
   }

   public void deferredUpdate0M21( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0M21( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0M21( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0M21( ) ;
         afterConfirm0M21( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0M21( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000M10 */
               pr_default.execute(8, new Object[] {new Long(A259TBM41_STUDY_ID), new Short(A260TBM41_CRF_ID), A378TBM41_CRF_ITEM_GRP_DIV, A261TBM41_CRF_ITEM_GRP_CD});
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound21 == 0 )
                     {
                        initAll0M21( ) ;
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
                     resetCaption0M0( ) ;
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
      sMode21 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0M21( ) ;
      Gx_mode = sMode21 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0M21( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV9Pgmname = "TBM41_CRF_NCM_MAP" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9Pgmname", AV9Pgmname);
      }
   }

   public void endLevel0M21( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0M21( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tbm41_crf_ncm_map");
         if ( AnyError == 0 )
         {
            confirmValues0M0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tbm41_crf_ncm_map");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0M21( )
   {
      /* Using cursor T000M11 */
      pr_default.execute(9);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A259TBM41_STUDY_ID = T000M11_A259TBM41_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
         A260TBM41_CRF_ID = T000M11_A260TBM41_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
         A378TBM41_CRF_ITEM_GRP_DIV = T000M11_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A378TBM41_CRF_ITEM_GRP_DIV", A378TBM41_CRF_ITEM_GRP_DIV);
         A261TBM41_CRF_ITEM_GRP_CD = T000M11_A261TBM41_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A261TBM41_CRF_ITEM_GRP_CD", A261TBM41_CRF_ITEM_GRP_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0M21( )
   {
      pr_default.readNext(9);
      RcdFound21 = (short)(0) ;
      if ( (pr_default.getStatus(9) != 101) )
      {
         RcdFound21 = (short)(1) ;
         A259TBM41_STUDY_ID = T000M11_A259TBM41_STUDY_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
         A260TBM41_CRF_ID = T000M11_A260TBM41_CRF_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
         A378TBM41_CRF_ITEM_GRP_DIV = T000M11_A378TBM41_CRF_ITEM_GRP_DIV[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A378TBM41_CRF_ITEM_GRP_DIV", A378TBM41_CRF_ITEM_GRP_DIV);
         A261TBM41_CRF_ITEM_GRP_CD = T000M11_A261TBM41_CRF_ITEM_GRP_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A261TBM41_CRF_ITEM_GRP_CD", A261TBM41_CRF_ITEM_GRP_CD);
      }
   }

   public void scanEnd0M21( )
   {
      pr_default.close(9);
   }

   public void afterConfirm0M21( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0M21( )
   {
      /* Before Insert Rules */
      A264TBM41_CRT_DATETIME = GXutil.now( ) ;
      n264TBM41_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A264TBM41_CRT_DATETIME", localUtil.ttoc( A264TBM41_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A265TBM41_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm41_crf_ncm_map_impl.this.GXt_char3 = GXv_char4[0] ;
      A265TBM41_CRT_USER_ID = GXt_char3 ;
      n265TBM41_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A265TBM41_CRT_USER_ID", A265TBM41_CRT_USER_ID);
      A267TBM41_UPD_DATETIME = GXutil.now( ) ;
      n267TBM41_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A267TBM41_UPD_DATETIME", localUtil.ttoc( A267TBM41_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A268TBM41_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm41_crf_ncm_map_impl.this.GXt_char3 = GXv_char4[0] ;
      A268TBM41_UPD_USER_ID = GXt_char3 ;
      n268TBM41_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A268TBM41_UPD_USER_ID", A268TBM41_UPD_USER_ID);
      A270TBM41_UPD_CNT = (long)(O270TBM41_UPD_CNT+1) ;
      n270TBM41_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A270TBM41_UPD_CNT", GXutil.ltrim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0M21( )
   {
      /* Before Update Rules */
      A267TBM41_UPD_DATETIME = GXutil.now( ) ;
      n267TBM41_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A267TBM41_UPD_DATETIME", localUtil.ttoc( A267TBM41_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char3 = A268TBM41_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm41_crf_ncm_map_impl.this.GXt_char3 = GXv_char4[0] ;
      A268TBM41_UPD_USER_ID = GXt_char3 ;
      n268TBM41_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A268TBM41_UPD_USER_ID", A268TBM41_UPD_USER_ID);
      A270TBM41_UPD_CNT = (long)(O270TBM41_UPD_CNT+1) ;
      n270TBM41_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A270TBM41_UPD_CNT", GXutil.ltrim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0M21( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0M21( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0M21( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0M21( )
   {
      edtTBM41_STUDY_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_STUDY_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_STUDY_ID_Enabled, 5, 0)));
      edtTBM41_CRF_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_CRF_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_CRF_ID_Enabled, 5, 0)));
      edtTBM41_CRF_ITEM_GRP_DIV_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_CRF_ITEM_GRP_DIV_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_CRF_ITEM_GRP_DIV_Enabled, 5, 0)));
      edtTBM41_CRF_ITEM_GRP_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_CRF_ITEM_GRP_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_CRF_ITEM_GRP_CD_Enabled, 5, 0)));
      edtTBM41_NCM_METADATA_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_NCM_METADATA_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_NCM_METADATA_ID_Enabled, 5, 0)));
      edtTBM41_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_DEL_FLG_Enabled, 5, 0)));
      edtTBM41_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_CRT_DATETIME_Enabled, 5, 0)));
      edtTBM41_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_CRT_USER_ID_Enabled, 5, 0)));
      edtTBM41_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_CRT_PROG_NM_Enabled, 5, 0)));
      edtTBM41_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_UPD_DATETIME_Enabled, 5, 0)));
      edtTBM41_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_UPD_USER_ID_Enabled, 5, 0)));
      edtTBM41_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_UPD_PROG_NM_Enabled, 5, 0)));
      edtTBM41_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTBM41_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTBM41_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues0M0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), "IE=EmulateIE7");
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeText( "CRF-NetCommonsマッピングマスタ") ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" onsubmit=\"try{return gx.csv.validForm()}catch(e){return true;}\" name=\"MAINFORM\" method=\"post\" action=\""+formatLink("tbm41_crf_ncm_map") +"\" class=\""+"Form"+"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
   }

   public void renderHtmlCloseForm0M21( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z259TBM41_STUDY_ID", GXutil.ltrim( localUtil.ntoc( Z259TBM41_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z260TBM41_CRF_ID", GXutil.ltrim( localUtil.ntoc( Z260TBM41_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z378TBM41_CRF_ITEM_GRP_DIV", GXutil.rtrim( Z378TBM41_CRF_ITEM_GRP_DIV));
      GxWebStd.gx_hidden_field( httpContext, "Z261TBM41_CRF_ITEM_GRP_CD", GXutil.rtrim( Z261TBM41_CRF_ITEM_GRP_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z264TBM41_CRT_DATETIME", localUtil.ttoc( Z264TBM41_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z265TBM41_CRT_USER_ID", GXutil.rtrim( Z265TBM41_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z267TBM41_UPD_DATETIME", localUtil.ttoc( Z267TBM41_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z268TBM41_UPD_USER_ID", GXutil.rtrim( Z268TBM41_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z270TBM41_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z270TBM41_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z262TBM41_NCM_METADATA_ID", GXutil.rtrim( Z262TBM41_NCM_METADATA_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z263TBM41_DEL_FLG", GXutil.rtrim( Z263TBM41_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z266TBM41_CRT_PROG_NM", GXutil.rtrim( Z266TBM41_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z269TBM41_UPD_PROG_NM", GXutil.rtrim( Z269TBM41_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O270TBM41_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O270TBM41_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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

   public void initializeNonKey0M21( )
   {
      A264TBM41_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n264TBM41_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A264TBM41_CRT_DATETIME", localUtil.ttoc( A264TBM41_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n264TBM41_CRT_DATETIME = (GXutil.nullDate().equals(A264TBM41_CRT_DATETIME) ? true : false) ;
      A265TBM41_CRT_USER_ID = "" ;
      n265TBM41_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A265TBM41_CRT_USER_ID", A265TBM41_CRT_USER_ID);
      n265TBM41_CRT_USER_ID = ((GXutil.strcmp("", A265TBM41_CRT_USER_ID)==0) ? true : false) ;
      A267TBM41_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n267TBM41_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A267TBM41_UPD_DATETIME", localUtil.ttoc( A267TBM41_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n267TBM41_UPD_DATETIME = (GXutil.nullDate().equals(A267TBM41_UPD_DATETIME) ? true : false) ;
      A268TBM41_UPD_USER_ID = "" ;
      n268TBM41_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A268TBM41_UPD_USER_ID", A268TBM41_UPD_USER_ID);
      n268TBM41_UPD_USER_ID = ((GXutil.strcmp("", A268TBM41_UPD_USER_ID)==0) ? true : false) ;
      A270TBM41_UPD_CNT = 0 ;
      n270TBM41_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A270TBM41_UPD_CNT", GXutil.ltrim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)));
      n270TBM41_UPD_CNT = ((0==A270TBM41_UPD_CNT) ? true : false) ;
      A262TBM41_NCM_METADATA_ID = "" ;
      n262TBM41_NCM_METADATA_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A262TBM41_NCM_METADATA_ID", A262TBM41_NCM_METADATA_ID);
      n262TBM41_NCM_METADATA_ID = ((GXutil.strcmp("", A262TBM41_NCM_METADATA_ID)==0) ? true : false) ;
      A263TBM41_DEL_FLG = "" ;
      n263TBM41_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A263TBM41_DEL_FLG", A263TBM41_DEL_FLG);
      n263TBM41_DEL_FLG = ((GXutil.strcmp("", A263TBM41_DEL_FLG)==0) ? true : false) ;
      A266TBM41_CRT_PROG_NM = "" ;
      n266TBM41_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A266TBM41_CRT_PROG_NM", A266TBM41_CRT_PROG_NM);
      n266TBM41_CRT_PROG_NM = ((GXutil.strcmp("", A266TBM41_CRT_PROG_NM)==0) ? true : false) ;
      A269TBM41_UPD_PROG_NM = "" ;
      n269TBM41_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A269TBM41_UPD_PROG_NM", A269TBM41_UPD_PROG_NM);
      n269TBM41_UPD_PROG_NM = ((GXutil.strcmp("", A269TBM41_UPD_PROG_NM)==0) ? true : false) ;
      O270TBM41_UPD_CNT = A270TBM41_UPD_CNT ;
      n270TBM41_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A270TBM41_UPD_CNT", GXutil.ltrim( GXutil.str( A270TBM41_UPD_CNT, 10, 0)));
   }

   public void initAll0M21( )
   {
      A259TBM41_STUDY_ID = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A259TBM41_STUDY_ID", GXutil.ltrim( GXutil.str( A259TBM41_STUDY_ID, 10, 0)));
      A260TBM41_CRF_ID = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A260TBM41_CRF_ID", GXutil.ltrim( GXutil.str( A260TBM41_CRF_ID, 4, 0)));
      A378TBM41_CRF_ITEM_GRP_DIV = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A378TBM41_CRF_ITEM_GRP_DIV", A378TBM41_CRF_ITEM_GRP_DIV);
      A261TBM41_CRF_ITEM_GRP_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A261TBM41_CRF_ITEM_GRP_CD", A261TBM41_CRF_ITEM_GRP_CD);
      initializeNonKey0M21( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?1455835");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?58720");
      httpContext.AddJavascriptSource("tbm41_crf_ncm_map.js", "?1455835");
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
      lblTextblocktbm41_study_id_Internalname = "TEXTBLOCKTBM41_STUDY_ID" ;
      edtTBM41_STUDY_ID_Internalname = "TBM41_STUDY_ID" ;
      lblTextblocktbm41_crf_id_Internalname = "TEXTBLOCKTBM41_CRF_ID" ;
      edtTBM41_CRF_ID_Internalname = "TBM41_CRF_ID" ;
      lblTextblocktbm41_crf_item_grp_div_Internalname = "TEXTBLOCKTBM41_CRF_ITEM_GRP_DIV" ;
      edtTBM41_CRF_ITEM_GRP_DIV_Internalname = "TBM41_CRF_ITEM_GRP_DIV" ;
      lblTextblocktbm41_crf_item_grp_cd_Internalname = "TEXTBLOCKTBM41_CRF_ITEM_GRP_CD" ;
      edtTBM41_CRF_ITEM_GRP_CD_Internalname = "TBM41_CRF_ITEM_GRP_CD" ;
      lblTextblocktbm41_ncm_metadata_id_Internalname = "TEXTBLOCKTBM41_NCM_METADATA_ID" ;
      edtTBM41_NCM_METADATA_ID_Internalname = "TBM41_NCM_METADATA_ID" ;
      lblTextblocktbm41_del_flg_Internalname = "TEXTBLOCKTBM41_DEL_FLG" ;
      edtTBM41_DEL_FLG_Internalname = "TBM41_DEL_FLG" ;
      lblTextblocktbm41_crt_datetime_Internalname = "TEXTBLOCKTBM41_CRT_DATETIME" ;
      edtTBM41_CRT_DATETIME_Internalname = "TBM41_CRT_DATETIME" ;
      lblTextblocktbm41_crt_user_id_Internalname = "TEXTBLOCKTBM41_CRT_USER_ID" ;
      edtTBM41_CRT_USER_ID_Internalname = "TBM41_CRT_USER_ID" ;
      lblTextblocktbm41_crt_prog_nm_Internalname = "TEXTBLOCKTBM41_CRT_PROG_NM" ;
      edtTBM41_CRT_PROG_NM_Internalname = "TBM41_CRT_PROG_NM" ;
      lblTextblocktbm41_upd_datetime_Internalname = "TEXTBLOCKTBM41_UPD_DATETIME" ;
      edtTBM41_UPD_DATETIME_Internalname = "TBM41_UPD_DATETIME" ;
      lblTextblocktbm41_upd_user_id_Internalname = "TEXTBLOCKTBM41_UPD_USER_ID" ;
      edtTBM41_UPD_USER_ID_Internalname = "TBM41_UPD_USER_ID" ;
      lblTextblocktbm41_upd_prog_nm_Internalname = "TEXTBLOCKTBM41_UPD_PROG_NM" ;
      edtTBM41_UPD_PROG_NM_Internalname = "TBM41_UPD_PROG_NM" ;
      lblTextblocktbm41_upd_cnt_Internalname = "TEXTBLOCKTBM41_UPD_CNT" ;
      edtTBM41_UPD_CNT_Internalname = "TBM41_UPD_CNT" ;
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
      edtTBM41_UPD_CNT_Jsonclick = "" ;
      edtTBM41_UPD_CNT_Enabled = 1 ;
      edtTBM41_UPD_PROG_NM_Jsonclick = "" ;
      edtTBM41_UPD_PROG_NM_Enabled = 1 ;
      edtTBM41_UPD_USER_ID_Jsonclick = "" ;
      edtTBM41_UPD_USER_ID_Enabled = 1 ;
      edtTBM41_UPD_DATETIME_Jsonclick = "" ;
      edtTBM41_UPD_DATETIME_Enabled = 1 ;
      edtTBM41_CRT_PROG_NM_Jsonclick = "" ;
      edtTBM41_CRT_PROG_NM_Enabled = 1 ;
      edtTBM41_CRT_USER_ID_Jsonclick = "" ;
      edtTBM41_CRT_USER_ID_Enabled = 1 ;
      edtTBM41_CRT_DATETIME_Jsonclick = "" ;
      edtTBM41_CRT_DATETIME_Enabled = 1 ;
      edtTBM41_DEL_FLG_Jsonclick = "" ;
      edtTBM41_DEL_FLG_Enabled = 1 ;
      edtTBM41_NCM_METADATA_ID_Jsonclick = "" ;
      edtTBM41_NCM_METADATA_ID_Enabled = 1 ;
      edtTBM41_CRF_ITEM_GRP_CD_Jsonclick = "" ;
      edtTBM41_CRF_ITEM_GRP_CD_Enabled = 1 ;
      edtTBM41_CRF_ITEM_GRP_DIV_Jsonclick = "" ;
      edtTBM41_CRF_ITEM_GRP_DIV_Enabled = 1 ;
      edtTBM41_CRF_ID_Jsonclick = "" ;
      edtTBM41_CRF_ID_Enabled = 1 ;
      edtTBM41_STUDY_ID_Jsonclick = "" ;
      edtTBM41_STUDY_ID_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gx4asatbm41_crt_user_id0M21( String Gx_mode )
   {
      GXt_char3 = A265TBM41_CRT_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm41_crf_ncm_map_impl.this.GXt_char3 = GXv_char4[0] ;
      A265TBM41_CRT_USER_ID = GXt_char3 ;
      n265TBM41_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A265TBM41_CRT_USER_ID", A265TBM41_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A265TBM41_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatbm41_upd_user_id0M21( String Gx_mode )
   {
      GXt_char3 = A268TBM41_UPD_USER_ID ;
      GXv_char4[0] = GXt_char3 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char4) ;
      tbm41_crf_ncm_map_impl.this.GXt_char3 = GXv_char4[0] ;
      A268TBM41_UPD_USER_ID = GXt_char3 ;
      n268TBM41_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A268TBM41_UPD_USER_ID", A268TBM41_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A268TBM41_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTBM41_NCM_METADATA_ID_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tbm41_crf_item_grp_cd( long GX_Parm1 ,
                                            short GX_Parm2 ,
                                            String GX_Parm3 ,
                                            String GX_Parm4 ,
                                            java.util.Date GX_Parm5 ,
                                            String GX_Parm6 ,
                                            java.util.Date GX_Parm7 ,
                                            String GX_Parm8 ,
                                            long GX_Parm9 ,
                                            String GX_Parm10 ,
                                            String GX_Parm11 ,
                                            String GX_Parm12 ,
                                            String GX_Parm13 )
   {
      A259TBM41_STUDY_ID = GX_Parm1 ;
      A260TBM41_CRF_ID = GX_Parm2 ;
      A378TBM41_CRF_ITEM_GRP_DIV = GX_Parm3 ;
      A261TBM41_CRF_ITEM_GRP_CD = GX_Parm4 ;
      A264TBM41_CRT_DATETIME = GX_Parm5 ;
      n264TBM41_CRT_DATETIME = false ;
      A265TBM41_CRT_USER_ID = GX_Parm6 ;
      n265TBM41_CRT_USER_ID = false ;
      A267TBM41_UPD_DATETIME = GX_Parm7 ;
      n267TBM41_UPD_DATETIME = false ;
      A268TBM41_UPD_USER_ID = GX_Parm8 ;
      n268TBM41_UPD_USER_ID = false ;
      A270TBM41_UPD_CNT = GX_Parm9 ;
      n270TBM41_UPD_CNT = false ;
      A262TBM41_NCM_METADATA_ID = GX_Parm10 ;
      n262TBM41_NCM_METADATA_ID = false ;
      A263TBM41_DEL_FLG = GX_Parm11 ;
      n263TBM41_DEL_FLG = false ;
      A266TBM41_CRT_PROG_NM = GX_Parm12 ;
      n266TBM41_CRT_PROG_NM = false ;
      A269TBM41_UPD_PROG_NM = GX_Parm13 ;
      n269TBM41_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A264TBM41_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A265TBM41_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A267TBM41_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A268TBM41_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A270TBM41_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A262TBM41_NCM_METADATA_ID));
      isValidOutput.add(GXutil.rtrim( A263TBM41_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A266TBM41_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A269TBM41_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV9Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z259TBM41_STUDY_ID, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z260TBM41_CRF_ID, (byte)(4), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z378TBM41_CRF_ITEM_GRP_DIV));
      isValidOutput.add(GXutil.rtrim( Z261TBM41_CRF_ITEM_GRP_CD));
      isValidOutput.add(localUtil.ttoc( Z264TBM41_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z265TBM41_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z267TBM41_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z268TBM41_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z270TBM41_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z262TBM41_NCM_METADATA_ID));
      isValidOutput.add(GXutil.rtrim( Z263TBM41_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z266TBM41_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z269TBM41_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV9Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O270TBM41_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      lblTextblocktbm41_study_id_Jsonclick = "" ;
      lblTextblocktbm41_crf_id_Jsonclick = "" ;
      lblTextblocktbm41_crf_item_grp_div_Jsonclick = "" ;
      A378TBM41_CRF_ITEM_GRP_DIV = "" ;
      lblTextblocktbm41_crf_item_grp_cd_Jsonclick = "" ;
      A261TBM41_CRF_ITEM_GRP_CD = "" ;
      lblTextblocktbm41_ncm_metadata_id_Jsonclick = "" ;
      A262TBM41_NCM_METADATA_ID = "" ;
      lblTextblocktbm41_del_flg_Jsonclick = "" ;
      A263TBM41_DEL_FLG = "" ;
      lblTextblocktbm41_crt_datetime_Jsonclick = "" ;
      A264TBM41_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm41_crt_user_id_Jsonclick = "" ;
      A265TBM41_CRT_USER_ID = "" ;
      lblTextblocktbm41_crt_prog_nm_Jsonclick = "" ;
      A266TBM41_CRT_PROG_NM = "" ;
      lblTextblocktbm41_upd_datetime_Jsonclick = "" ;
      A267TBM41_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktbm41_upd_user_id_Jsonclick = "" ;
      A268TBM41_UPD_USER_ID = "" ;
      lblTextblocktbm41_upd_prog_nm_Jsonclick = "" ;
      A269TBM41_UPD_PROG_NM = "" ;
      lblTextblocktbm41_upd_cnt_Jsonclick = "" ;
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
      Z378TBM41_CRF_ITEM_GRP_DIV = "" ;
      Z261TBM41_CRF_ITEM_GRP_CD = "" ;
      Z264TBM41_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z265TBM41_CRT_USER_ID = "" ;
      Z267TBM41_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z268TBM41_UPD_USER_ID = "" ;
      Z262TBM41_NCM_METADATA_ID = "" ;
      Z263TBM41_DEL_FLG = "" ;
      Z266TBM41_CRT_PROG_NM = "" ;
      Z269TBM41_UPD_PROG_NM = "" ;
      AV9Pgmname = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV8W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV7W_TXT = "" ;
      T000M4_A259TBM41_STUDY_ID = new long[1] ;
      T000M4_A260TBM41_CRF_ID = new short[1] ;
      T000M4_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000M4_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000M4_A264TBM41_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000M4_n264TBM41_CRT_DATETIME = new boolean[] {false} ;
      T000M4_A265TBM41_CRT_USER_ID = new String[] {""} ;
      T000M4_n265TBM41_CRT_USER_ID = new boolean[] {false} ;
      T000M4_A267TBM41_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000M4_n267TBM41_UPD_DATETIME = new boolean[] {false} ;
      T000M4_A268TBM41_UPD_USER_ID = new String[] {""} ;
      T000M4_n268TBM41_UPD_USER_ID = new boolean[] {false} ;
      T000M4_A270TBM41_UPD_CNT = new long[1] ;
      T000M4_n270TBM41_UPD_CNT = new boolean[] {false} ;
      T000M4_A262TBM41_NCM_METADATA_ID = new String[] {""} ;
      T000M4_n262TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      T000M4_A263TBM41_DEL_FLG = new String[] {""} ;
      T000M4_n263TBM41_DEL_FLG = new boolean[] {false} ;
      T000M4_A266TBM41_CRT_PROG_NM = new String[] {""} ;
      T000M4_n266TBM41_CRT_PROG_NM = new boolean[] {false} ;
      T000M4_A269TBM41_UPD_PROG_NM = new String[] {""} ;
      T000M4_n269TBM41_UPD_PROG_NM = new boolean[] {false} ;
      T000M5_A259TBM41_STUDY_ID = new long[1] ;
      T000M5_A260TBM41_CRF_ID = new short[1] ;
      T000M5_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000M5_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000M3_A259TBM41_STUDY_ID = new long[1] ;
      T000M3_A260TBM41_CRF_ID = new short[1] ;
      T000M3_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000M3_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000M3_A264TBM41_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000M3_n264TBM41_CRT_DATETIME = new boolean[] {false} ;
      T000M3_A265TBM41_CRT_USER_ID = new String[] {""} ;
      T000M3_n265TBM41_CRT_USER_ID = new boolean[] {false} ;
      T000M3_A267TBM41_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000M3_n267TBM41_UPD_DATETIME = new boolean[] {false} ;
      T000M3_A268TBM41_UPD_USER_ID = new String[] {""} ;
      T000M3_n268TBM41_UPD_USER_ID = new boolean[] {false} ;
      T000M3_A270TBM41_UPD_CNT = new long[1] ;
      T000M3_n270TBM41_UPD_CNT = new boolean[] {false} ;
      T000M3_A262TBM41_NCM_METADATA_ID = new String[] {""} ;
      T000M3_n262TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      T000M3_A263TBM41_DEL_FLG = new String[] {""} ;
      T000M3_n263TBM41_DEL_FLG = new boolean[] {false} ;
      T000M3_A266TBM41_CRT_PROG_NM = new String[] {""} ;
      T000M3_n266TBM41_CRT_PROG_NM = new boolean[] {false} ;
      T000M3_A269TBM41_UPD_PROG_NM = new String[] {""} ;
      T000M3_n269TBM41_UPD_PROG_NM = new boolean[] {false} ;
      sMode21 = "" ;
      T000M6_A259TBM41_STUDY_ID = new long[1] ;
      T000M6_A260TBM41_CRF_ID = new short[1] ;
      T000M6_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000M6_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000M7_A259TBM41_STUDY_ID = new long[1] ;
      T000M7_A260TBM41_CRF_ID = new short[1] ;
      T000M7_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000M7_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000M2_A259TBM41_STUDY_ID = new long[1] ;
      T000M2_A260TBM41_CRF_ID = new short[1] ;
      T000M2_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000M2_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      T000M2_A264TBM41_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000M2_n264TBM41_CRT_DATETIME = new boolean[] {false} ;
      T000M2_A265TBM41_CRT_USER_ID = new String[] {""} ;
      T000M2_n265TBM41_CRT_USER_ID = new boolean[] {false} ;
      T000M2_A267TBM41_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000M2_n267TBM41_UPD_DATETIME = new boolean[] {false} ;
      T000M2_A268TBM41_UPD_USER_ID = new String[] {""} ;
      T000M2_n268TBM41_UPD_USER_ID = new boolean[] {false} ;
      T000M2_A270TBM41_UPD_CNT = new long[1] ;
      T000M2_n270TBM41_UPD_CNT = new boolean[] {false} ;
      T000M2_A262TBM41_NCM_METADATA_ID = new String[] {""} ;
      T000M2_n262TBM41_NCM_METADATA_ID = new boolean[] {false} ;
      T000M2_A263TBM41_DEL_FLG = new String[] {""} ;
      T000M2_n263TBM41_DEL_FLG = new boolean[] {false} ;
      T000M2_A266TBM41_CRT_PROG_NM = new String[] {""} ;
      T000M2_n266TBM41_CRT_PROG_NM = new boolean[] {false} ;
      T000M2_A269TBM41_UPD_PROG_NM = new String[] {""} ;
      T000M2_n269TBM41_UPD_PROG_NM = new boolean[] {false} ;
      T000M11_A259TBM41_STUDY_ID = new long[1] ;
      T000M11_A260TBM41_CRF_ID = new short[1] ;
      T000M11_A378TBM41_CRF_ITEM_GRP_DIV = new String[] {""} ;
      T000M11_A261TBM41_CRF_ITEM_GRP_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      GXt_char2 = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String [1] ;
      GXt_char3 = "" ;
      ZV9Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tbm41_crf_ncm_map__default(),
         new Object[] {
             new Object[] {
            T000M2_A259TBM41_STUDY_ID, T000M2_A260TBM41_CRF_ID, T000M2_A378TBM41_CRF_ITEM_GRP_DIV, T000M2_A261TBM41_CRF_ITEM_GRP_CD, T000M2_A264TBM41_CRT_DATETIME, T000M2_n264TBM41_CRT_DATETIME, T000M2_A265TBM41_CRT_USER_ID, T000M2_n265TBM41_CRT_USER_ID, T000M2_A267TBM41_UPD_DATETIME, T000M2_n267TBM41_UPD_DATETIME,
            T000M2_A268TBM41_UPD_USER_ID, T000M2_n268TBM41_UPD_USER_ID, T000M2_A270TBM41_UPD_CNT, T000M2_n270TBM41_UPD_CNT, T000M2_A262TBM41_NCM_METADATA_ID, T000M2_n262TBM41_NCM_METADATA_ID, T000M2_A263TBM41_DEL_FLG, T000M2_n263TBM41_DEL_FLG, T000M2_A266TBM41_CRT_PROG_NM, T000M2_n266TBM41_CRT_PROG_NM,
            T000M2_A269TBM41_UPD_PROG_NM, T000M2_n269TBM41_UPD_PROG_NM
            }
            , new Object[] {
            T000M3_A259TBM41_STUDY_ID, T000M3_A260TBM41_CRF_ID, T000M3_A378TBM41_CRF_ITEM_GRP_DIV, T000M3_A261TBM41_CRF_ITEM_GRP_CD, T000M3_A264TBM41_CRT_DATETIME, T000M3_n264TBM41_CRT_DATETIME, T000M3_A265TBM41_CRT_USER_ID, T000M3_n265TBM41_CRT_USER_ID, T000M3_A267TBM41_UPD_DATETIME, T000M3_n267TBM41_UPD_DATETIME,
            T000M3_A268TBM41_UPD_USER_ID, T000M3_n268TBM41_UPD_USER_ID, T000M3_A270TBM41_UPD_CNT, T000M3_n270TBM41_UPD_CNT, T000M3_A262TBM41_NCM_METADATA_ID, T000M3_n262TBM41_NCM_METADATA_ID, T000M3_A263TBM41_DEL_FLG, T000M3_n263TBM41_DEL_FLG, T000M3_A266TBM41_CRT_PROG_NM, T000M3_n266TBM41_CRT_PROG_NM,
            T000M3_A269TBM41_UPD_PROG_NM, T000M3_n269TBM41_UPD_PROG_NM
            }
            , new Object[] {
            T000M4_A259TBM41_STUDY_ID, T000M4_A260TBM41_CRF_ID, T000M4_A378TBM41_CRF_ITEM_GRP_DIV, T000M4_A261TBM41_CRF_ITEM_GRP_CD, T000M4_A264TBM41_CRT_DATETIME, T000M4_n264TBM41_CRT_DATETIME, T000M4_A265TBM41_CRT_USER_ID, T000M4_n265TBM41_CRT_USER_ID, T000M4_A267TBM41_UPD_DATETIME, T000M4_n267TBM41_UPD_DATETIME,
            T000M4_A268TBM41_UPD_USER_ID, T000M4_n268TBM41_UPD_USER_ID, T000M4_A270TBM41_UPD_CNT, T000M4_n270TBM41_UPD_CNT, T000M4_A262TBM41_NCM_METADATA_ID, T000M4_n262TBM41_NCM_METADATA_ID, T000M4_A263TBM41_DEL_FLG, T000M4_n263TBM41_DEL_FLG, T000M4_A266TBM41_CRT_PROG_NM, T000M4_n266TBM41_CRT_PROG_NM,
            T000M4_A269TBM41_UPD_PROG_NM, T000M4_n269TBM41_UPD_PROG_NM
            }
            , new Object[] {
            T000M5_A259TBM41_STUDY_ID, T000M5_A260TBM41_CRF_ID, T000M5_A378TBM41_CRF_ITEM_GRP_DIV, T000M5_A261TBM41_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T000M6_A259TBM41_STUDY_ID, T000M6_A260TBM41_CRF_ID, T000M6_A378TBM41_CRF_ITEM_GRP_DIV, T000M6_A261TBM41_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            T000M7_A259TBM41_STUDY_ID, T000M7_A260TBM41_CRF_ID, T000M7_A378TBM41_CRF_ITEM_GRP_DIV, T000M7_A261TBM41_CRF_ITEM_GRP_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000M11_A259TBM41_STUDY_ID, T000M11_A260TBM41_CRF_ID, T000M11_A378TBM41_CRF_ITEM_GRP_DIV, T000M11_A261TBM41_CRF_ITEM_GRP_CD
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV9Pgmname = "TBM41_CRF_NCM_MAP" ;
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short A260TBM41_CRF_ID ;
   private short Z260TBM41_CRF_ID ;
   private short RcdFound21 ;
   private short Gx_err ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTBM41_STUDY_ID_Enabled ;
   private int edtTBM41_CRF_ID_Enabled ;
   private int edtTBM41_CRF_ITEM_GRP_DIV_Enabled ;
   private int edtTBM41_CRF_ITEM_GRP_CD_Enabled ;
   private int edtTBM41_NCM_METADATA_ID_Enabled ;
   private int edtTBM41_DEL_FLG_Enabled ;
   private int edtTBM41_CRT_DATETIME_Enabled ;
   private int edtTBM41_CRT_USER_ID_Enabled ;
   private int edtTBM41_CRT_PROG_NM_Enabled ;
   private int edtTBM41_UPD_DATETIME_Enabled ;
   private int edtTBM41_UPD_USER_ID_Enabled ;
   private int edtTBM41_UPD_PROG_NM_Enabled ;
   private int edtTBM41_UPD_CNT_Enabled ;
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
   private long A259TBM41_STUDY_ID ;
   private long A270TBM41_UPD_CNT ;
   private long Z259TBM41_STUDY_ID ;
   private long Z270TBM41_UPD_CNT ;
   private long O270TBM41_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTBM41_STUDY_ID_Internalname ;
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
   private String lblTextblocktbm41_study_id_Internalname ;
   private String lblTextblocktbm41_study_id_Jsonclick ;
   private String edtTBM41_STUDY_ID_Jsonclick ;
   private String lblTextblocktbm41_crf_id_Internalname ;
   private String lblTextblocktbm41_crf_id_Jsonclick ;
   private String edtTBM41_CRF_ID_Internalname ;
   private String edtTBM41_CRF_ID_Jsonclick ;
   private String lblTextblocktbm41_crf_item_grp_div_Internalname ;
   private String lblTextblocktbm41_crf_item_grp_div_Jsonclick ;
   private String edtTBM41_CRF_ITEM_GRP_DIV_Internalname ;
   private String edtTBM41_CRF_ITEM_GRP_DIV_Jsonclick ;
   private String lblTextblocktbm41_crf_item_grp_cd_Internalname ;
   private String lblTextblocktbm41_crf_item_grp_cd_Jsonclick ;
   private String edtTBM41_CRF_ITEM_GRP_CD_Internalname ;
   private String edtTBM41_CRF_ITEM_GRP_CD_Jsonclick ;
   private String lblTextblocktbm41_ncm_metadata_id_Internalname ;
   private String lblTextblocktbm41_ncm_metadata_id_Jsonclick ;
   private String edtTBM41_NCM_METADATA_ID_Internalname ;
   private String edtTBM41_NCM_METADATA_ID_Jsonclick ;
   private String lblTextblocktbm41_del_flg_Internalname ;
   private String lblTextblocktbm41_del_flg_Jsonclick ;
   private String edtTBM41_DEL_FLG_Internalname ;
   private String edtTBM41_DEL_FLG_Jsonclick ;
   private String lblTextblocktbm41_crt_datetime_Internalname ;
   private String lblTextblocktbm41_crt_datetime_Jsonclick ;
   private String edtTBM41_CRT_DATETIME_Internalname ;
   private String edtTBM41_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktbm41_crt_user_id_Internalname ;
   private String lblTextblocktbm41_crt_user_id_Jsonclick ;
   private String edtTBM41_CRT_USER_ID_Internalname ;
   private String edtTBM41_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktbm41_crt_prog_nm_Internalname ;
   private String lblTextblocktbm41_crt_prog_nm_Jsonclick ;
   private String edtTBM41_CRT_PROG_NM_Internalname ;
   private String edtTBM41_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktbm41_upd_datetime_Internalname ;
   private String lblTextblocktbm41_upd_datetime_Jsonclick ;
   private String edtTBM41_UPD_DATETIME_Internalname ;
   private String edtTBM41_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktbm41_upd_user_id_Internalname ;
   private String lblTextblocktbm41_upd_user_id_Jsonclick ;
   private String edtTBM41_UPD_USER_ID_Internalname ;
   private String edtTBM41_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktbm41_upd_prog_nm_Internalname ;
   private String lblTextblocktbm41_upd_prog_nm_Jsonclick ;
   private String edtTBM41_UPD_PROG_NM_Internalname ;
   private String edtTBM41_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktbm41_upd_cnt_Internalname ;
   private String lblTextblocktbm41_upd_cnt_Jsonclick ;
   private String edtTBM41_UPD_CNT_Internalname ;
   private String edtTBM41_UPD_CNT_Jsonclick ;
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
   private String sMode21 ;
   private String sDynURL ;
   private String FormProcess ;
   private String GXt_char2 ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXt_char3 ;
   private String ZV9Pgmname ;
   private String Gx_emsg ;
   private java.util.Date A264TBM41_CRT_DATETIME ;
   private java.util.Date A267TBM41_UPD_DATETIME ;
   private java.util.Date Z264TBM41_CRT_DATETIME ;
   private java.util.Date Z267TBM41_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n262TBM41_NCM_METADATA_ID ;
   private boolean n263TBM41_DEL_FLG ;
   private boolean n264TBM41_CRT_DATETIME ;
   private boolean n265TBM41_CRT_USER_ID ;
   private boolean n266TBM41_CRT_PROG_NM ;
   private boolean n267TBM41_UPD_DATETIME ;
   private boolean n268TBM41_UPD_USER_ID ;
   private boolean n269TBM41_UPD_PROG_NM ;
   private boolean n270TBM41_UPD_CNT ;
   private boolean Gx_longc ;
   private String A378TBM41_CRF_ITEM_GRP_DIV ;
   private String A261TBM41_CRF_ITEM_GRP_CD ;
   private String A262TBM41_NCM_METADATA_ID ;
   private String A263TBM41_DEL_FLG ;
   private String A265TBM41_CRT_USER_ID ;
   private String A266TBM41_CRT_PROG_NM ;
   private String A268TBM41_UPD_USER_ID ;
   private String A269TBM41_UPD_PROG_NM ;
   private String Z378TBM41_CRF_ITEM_GRP_DIV ;
   private String Z261TBM41_CRF_ITEM_GRP_CD ;
   private String Z265TBM41_CRT_USER_ID ;
   private String Z268TBM41_UPD_USER_ID ;
   private String Z262TBM41_NCM_METADATA_ID ;
   private String Z263TBM41_DEL_FLG ;
   private String Z266TBM41_CRT_PROG_NM ;
   private String Z269TBM41_UPD_PROG_NM ;
   private String AV8W_BC_FLG ;
   private String AV7W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private long[] T000M4_A259TBM41_STUDY_ID ;
   private short[] T000M4_A260TBM41_CRF_ID ;
   private String[] T000M4_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] T000M4_A261TBM41_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000M4_A264TBM41_CRT_DATETIME ;
   private boolean[] T000M4_n264TBM41_CRT_DATETIME ;
   private String[] T000M4_A265TBM41_CRT_USER_ID ;
   private boolean[] T000M4_n265TBM41_CRT_USER_ID ;
   private java.util.Date[] T000M4_A267TBM41_UPD_DATETIME ;
   private boolean[] T000M4_n267TBM41_UPD_DATETIME ;
   private String[] T000M4_A268TBM41_UPD_USER_ID ;
   private boolean[] T000M4_n268TBM41_UPD_USER_ID ;
   private long[] T000M4_A270TBM41_UPD_CNT ;
   private boolean[] T000M4_n270TBM41_UPD_CNT ;
   private String[] T000M4_A262TBM41_NCM_METADATA_ID ;
   private boolean[] T000M4_n262TBM41_NCM_METADATA_ID ;
   private String[] T000M4_A263TBM41_DEL_FLG ;
   private boolean[] T000M4_n263TBM41_DEL_FLG ;
   private String[] T000M4_A266TBM41_CRT_PROG_NM ;
   private boolean[] T000M4_n266TBM41_CRT_PROG_NM ;
   private String[] T000M4_A269TBM41_UPD_PROG_NM ;
   private boolean[] T000M4_n269TBM41_UPD_PROG_NM ;
   private long[] T000M5_A259TBM41_STUDY_ID ;
   private short[] T000M5_A260TBM41_CRF_ID ;
   private String[] T000M5_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] T000M5_A261TBM41_CRF_ITEM_GRP_CD ;
   private long[] T000M3_A259TBM41_STUDY_ID ;
   private short[] T000M3_A260TBM41_CRF_ID ;
   private String[] T000M3_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] T000M3_A261TBM41_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000M3_A264TBM41_CRT_DATETIME ;
   private boolean[] T000M3_n264TBM41_CRT_DATETIME ;
   private String[] T000M3_A265TBM41_CRT_USER_ID ;
   private boolean[] T000M3_n265TBM41_CRT_USER_ID ;
   private java.util.Date[] T000M3_A267TBM41_UPD_DATETIME ;
   private boolean[] T000M3_n267TBM41_UPD_DATETIME ;
   private String[] T000M3_A268TBM41_UPD_USER_ID ;
   private boolean[] T000M3_n268TBM41_UPD_USER_ID ;
   private long[] T000M3_A270TBM41_UPD_CNT ;
   private boolean[] T000M3_n270TBM41_UPD_CNT ;
   private String[] T000M3_A262TBM41_NCM_METADATA_ID ;
   private boolean[] T000M3_n262TBM41_NCM_METADATA_ID ;
   private String[] T000M3_A263TBM41_DEL_FLG ;
   private boolean[] T000M3_n263TBM41_DEL_FLG ;
   private String[] T000M3_A266TBM41_CRT_PROG_NM ;
   private boolean[] T000M3_n266TBM41_CRT_PROG_NM ;
   private String[] T000M3_A269TBM41_UPD_PROG_NM ;
   private boolean[] T000M3_n269TBM41_UPD_PROG_NM ;
   private long[] T000M6_A259TBM41_STUDY_ID ;
   private short[] T000M6_A260TBM41_CRF_ID ;
   private String[] T000M6_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] T000M6_A261TBM41_CRF_ITEM_GRP_CD ;
   private long[] T000M7_A259TBM41_STUDY_ID ;
   private short[] T000M7_A260TBM41_CRF_ID ;
   private String[] T000M7_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] T000M7_A261TBM41_CRF_ITEM_GRP_CD ;
   private long[] T000M2_A259TBM41_STUDY_ID ;
   private short[] T000M2_A260TBM41_CRF_ID ;
   private String[] T000M2_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] T000M2_A261TBM41_CRF_ITEM_GRP_CD ;
   private java.util.Date[] T000M2_A264TBM41_CRT_DATETIME ;
   private boolean[] T000M2_n264TBM41_CRT_DATETIME ;
   private String[] T000M2_A265TBM41_CRT_USER_ID ;
   private boolean[] T000M2_n265TBM41_CRT_USER_ID ;
   private java.util.Date[] T000M2_A267TBM41_UPD_DATETIME ;
   private boolean[] T000M2_n267TBM41_UPD_DATETIME ;
   private String[] T000M2_A268TBM41_UPD_USER_ID ;
   private boolean[] T000M2_n268TBM41_UPD_USER_ID ;
   private long[] T000M2_A270TBM41_UPD_CNT ;
   private boolean[] T000M2_n270TBM41_UPD_CNT ;
   private String[] T000M2_A262TBM41_NCM_METADATA_ID ;
   private boolean[] T000M2_n262TBM41_NCM_METADATA_ID ;
   private String[] T000M2_A263TBM41_DEL_FLG ;
   private boolean[] T000M2_n263TBM41_DEL_FLG ;
   private String[] T000M2_A266TBM41_CRT_PROG_NM ;
   private boolean[] T000M2_n266TBM41_CRT_PROG_NM ;
   private String[] T000M2_A269TBM41_UPD_PROG_NM ;
   private boolean[] T000M2_n269TBM41_UPD_PROG_NM ;
   private long[] T000M11_A259TBM41_STUDY_ID ;
   private short[] T000M11_A260TBM41_CRF_ID ;
   private String[] T000M11_A378TBM41_CRF_ITEM_GRP_DIV ;
   private String[] T000M11_A261TBM41_CRF_ITEM_GRP_CD ;
}

final  class tbm41_crf_ncm_map__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000M2", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_CRT_DATETIME`, `TBM41_CRT_USER_ID`, `TBM41_UPD_DATETIME`, `TBM41_UPD_USER_ID`, `TBM41_UPD_CNT`, `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRT_PROG_NM`, `TBM41_UPD_PROG_NM` FROM `TBM41_CRF_NCM_MAP` WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000M3", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_CRT_DATETIME`, `TBM41_CRT_USER_ID`, `TBM41_UPD_DATETIME`, `TBM41_UPD_USER_ID`, `TBM41_UPD_CNT`, `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRT_PROG_NM`, `TBM41_UPD_PROG_NM` FROM `TBM41_CRF_NCM_MAP` WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000M4", "SELECT TM1.`TBM41_STUDY_ID`, TM1.`TBM41_CRF_ID`, TM1.`TBM41_CRF_ITEM_GRP_DIV`, TM1.`TBM41_CRF_ITEM_GRP_CD`, TM1.`TBM41_CRT_DATETIME`, TM1.`TBM41_CRT_USER_ID`, TM1.`TBM41_UPD_DATETIME`, TM1.`TBM41_UPD_USER_ID`, TM1.`TBM41_UPD_CNT`, TM1.`TBM41_NCM_METADATA_ID`, TM1.`TBM41_DEL_FLG`, TM1.`TBM41_CRT_PROG_NM`, TM1.`TBM41_UPD_PROG_NM` FROM `TBM41_CRF_NCM_MAP` TM1 WHERE TM1.`TBM41_STUDY_ID` = ? and TM1.`TBM41_CRF_ID` = ? and TM1.`TBM41_CRF_ITEM_GRP_DIV` = ? and TM1.`TBM41_CRF_ITEM_GRP_CD` = ? ORDER BY TM1.`TBM41_STUDY_ID`, TM1.`TBM41_CRF_ID`, TM1.`TBM41_CRF_ITEM_GRP_DIV`, TM1.`TBM41_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
         ,new ForEachCursor("T000M5", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD` FROM `TBM41_CRF_NCM_MAP` WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000M6", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD` FROM `TBM41_CRF_NCM_MAP` WHERE ( `TBM41_STUDY_ID` > ? or `TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` > ? or `TBM41_CRF_ID` = ? and `TBM41_STUDY_ID` = ? and `TBM41_CRF_ITEM_GRP_DIV` > ? or `TBM41_CRF_ITEM_GRP_DIV` = ? and `TBM41_CRF_ID` = ? and `TBM41_STUDY_ID` = ? and `TBM41_CRF_ITEM_GRP_CD` > ?) ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000M7", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD` FROM `TBM41_CRF_NCM_MAP` WHERE ( `TBM41_STUDY_ID` < ? or `TBM41_STUDY_ID` = ? and `TBM41_CRF_ID` < ? or `TBM41_CRF_ID` = ? and `TBM41_STUDY_ID` = ? and `TBM41_CRF_ITEM_GRP_DIV` < ? or `TBM41_CRF_ITEM_GRP_DIV` = ? and `TBM41_CRF_ID` = ? and `TBM41_STUDY_ID` = ? and `TBM41_CRF_ITEM_GRP_CD` < ?) ORDER BY `TBM41_STUDY_ID` DESC, `TBM41_CRF_ID` DESC, `TBM41_CRF_ITEM_GRP_DIV` DESC, `TBM41_CRF_ITEM_GRP_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000M8", "INSERT INTO `TBM41_CRF_NCM_MAP` (`TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD`, `TBM41_CRT_DATETIME`, `TBM41_CRT_USER_ID`, `TBM41_UPD_DATETIME`, `TBM41_UPD_USER_ID`, `TBM41_UPD_CNT`, `TBM41_NCM_METADATA_ID`, `TBM41_DEL_FLG`, `TBM41_CRT_PROG_NM`, `TBM41_UPD_PROG_NM`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000M9", "UPDATE `TBM41_CRF_NCM_MAP` SET `TBM41_CRT_DATETIME`=?, `TBM41_CRT_USER_ID`=?, `TBM41_UPD_DATETIME`=?, `TBM41_UPD_USER_ID`=?, `TBM41_UPD_CNT`=?, `TBM41_NCM_METADATA_ID`=?, `TBM41_DEL_FLG`=?, `TBM41_CRT_PROG_NM`=?, `TBM41_UPD_PROG_NM`=?  WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000M10", "DELETE FROM `TBM41_CRF_NCM_MAP`  WHERE `TBM41_STUDY_ID` = ? AND `TBM41_CRF_ID` = ? AND `TBM41_CRF_ITEM_GRP_DIV` = ? AND `TBM41_CRF_ITEM_GRP_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000M11", "SELECT `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD` FROM `TBM41_CRF_NCM_MAP` ORDER BY `TBM41_STUDY_ID`, `TBM41_CRF_ID`, `TBM41_CRF_ITEM_GRP_DIV`, `TBM41_CRF_ITEM_GRP_CD` ",true, GX_NOMASK, false, this,10,0,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               break;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               break;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5) ;
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(6) ;
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(7) ;
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getVarchar(8) ;
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(9) ;
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(12) ;
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(13) ;
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               break;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
               break;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1) ;
               ((short[]) buf[1])[0] = rslt.getShort(2) ;
               ((String[]) buf[2])[0] = rslt.getVarchar(3) ;
               ((String[]) buf[3])[0] = rslt.getVarchar(4) ;
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
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               break;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setLong(2, ((Number) parms[1]).longValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               stmt.setLong(5, ((Number) parms[4]).longValue());
               stmt.setVarchar(6, (String)parms[5], 1, false);
               stmt.setVarchar(7, (String)parms[6], 1, false);
               stmt.setShort(8, ((Number) parms[7]).shortValue());
               stmt.setLong(9, ((Number) parms[8]).longValue());
               stmt.setVarchar(10, (String)parms[9], 50, false);
               break;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(5, (java.util.Date)parms[5], false);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(6, (String)parms[7], 128);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.TIMESTAMP );
               }
               else
               {
                  stmt.setDateTime(7, (java.util.Date)parms[9], false);
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(8, (String)parms[11], 128);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setLong(9, ((Number) parms[13]).longValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[15], 100);
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[17], 1);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(12, (String)parms[19], 40);
               }
               if ( ((Boolean) parms[20]).booleanValue() )
               {
                  stmt.setNull( 13 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(13, (String)parms[21], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 100);
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
               stmt.setLong(10, ((Number) parms[18]).longValue());
               stmt.setShort(11, ((Number) parms[19]).shortValue());
               stmt.setVarchar(12, (String)parms[20], 1, false);
               stmt.setVarchar(13, (String)parms[21], 50, false);
               break;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               stmt.setVarchar(3, (String)parms[2], 1, false);
               stmt.setVarchar(4, (String)parms[3], 50, false);
               break;
      }
   }

}

