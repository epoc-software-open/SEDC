/*
               File: tam04_kngn_impl
        Description: 権限パターンマスタ
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:13:47.61
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam04_kngn_impl extends GXWebPanel
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel4"+"_"+"TAM04_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx4asatam04_crt_user_id033( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel6"+"_"+"TAM04_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx6asatam04_upd_user_id033( Gx_mode) ;
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
         Form.getMeta().addItem("description", "権限パターンマスタ", (short)(0)) ;
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

   public tam04_kngn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam04_kngn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam04_kngn_impl.class ));
   }

   public tam04_kngn_impl( int remoteHandle ,
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
         wb_table1_2_033( true) ;
      }
      return  ;
   }

   public void wb_table1_2_033e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm033( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_033( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_033( true) ;
      }
      return  ;
   }

   public void wb_table2_5_033e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "権限パターンマスタ", 1, 0, "px", 0, "px", "Group", "", "HLP_TAM04_KNGN.htm");
         wb_table3_28_033( true) ;
      }
      return  ;
   }

   public void wb_table3_28_033e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_033e( true) ;
      }
      else
      {
         wb_table1_2_033e( false) ;
      }
   }

   public void wb_table3_28_033( boolean wbgen )
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
         wb_table4_34_033( true) ;
      }
      return  ;
   }

   public void wb_table4_34_033e( boolean wbgen )
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
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM04_KNGN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM04_KNGN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_033e( true) ;
      }
      else
      {
         wb_table3_28_033e( false) ;
      }
   }

   public void wb_table4_34_033( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_auth_cd_Internalname, "権限パターン区分", "", "", lblTextblocktam04_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_AUTH_CD_Internalname, GXutil.rtrim( A13TAM04_AUTH_CD), GXutil.rtrim( localUtil.format( A13TAM04_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_auth_nm_Internalname, "権限パターン名", "", "", lblTextblocktam04_auth_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_AUTH_NM_Internalname, GXutil.rtrim( A285TAM04_AUTH_NM), GXutil.rtrim( localUtil.format( A285TAM04_AUTH_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_AUTH_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_AUTH_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_auth_lvl_Internalname, "入力権限レベル", "", "", lblTextblocktam04_auth_lvl_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_AUTH_LVL_Internalname, GXutil.ltrim( localUtil.ntoc( A687TAM04_AUTH_LVL, (byte)(2), (byte)(0), ".", "")), ((edtTAM04_AUTH_LVL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A687TAM04_AUTH_LVL), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A687TAM04_AUTH_LVL), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_AUTH_LVL_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_AUTH_LVL_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam04_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_DEL_FLG_Internalname, GXutil.rtrim( A215TAM04_DEL_FLG), GXutil.rtrim( localUtil.format( A215TAM04_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam04_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAM04_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_CRT_DATETIME_Internalname, localUtil.format(A233TAM04_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A233TAM04_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM04_KNGN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM04_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAM04_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam04_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_CRT_USER_ID_Internalname, GXutil.rtrim( A266TAM04_CRT_USER_ID), GXutil.rtrim( localUtil.format( A266TAM04_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam04_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_CRT_PROG_NM_Internalname, GXutil.rtrim( A234TAM04_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A234TAM04_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam04_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAM04_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_DATETIME_Internalname, localUtil.format(A235TAM04_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A235TAM04_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM04_KNGN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM04_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAM04_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktam04_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_USER_ID_Internalname, GXutil.rtrim( A267TAM04_UPD_USER_ID), GXutil.rtrim( localUtil.format( A267TAM04_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam04_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_PROG_NM_Internalname, GXutil.rtrim( A236TAM04_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A236TAM04_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktam04_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A286TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTAM04_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A286TAM04_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A286TAM04_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TAM04_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_033e( true) ;
      }
      else
      {
         wb_table4_34_033e( false) ;
      }
   }

   public void wb_table2_5_033( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04_KNGN.htm");
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
         wb_table2_5_033e( true) ;
      }
      else
      {
         wb_table2_5_033e( false) ;
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
      /* Execute user event: e11032 */
      e11032 ();
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
            A285TAM04_AUTH_NM = httpContext.cgiGet( edtTAM04_AUTH_NM_Internalname) ;
            n285TAM04_AUTH_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A285TAM04_AUTH_NM", A285TAM04_AUTH_NM);
            n285TAM04_AUTH_NM = ((GXutil.strcmp("", A285TAM04_AUTH_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAM04_AUTH_LVL_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAM04_AUTH_LVL_Internalname), ".", ",") > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAM04_AUTH_LVL");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM04_AUTH_LVL_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A687TAM04_AUTH_LVL = (byte)(0) ;
               n687TAM04_AUTH_LVL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A687TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A687TAM04_AUTH_LVL, 2, 0)));
            }
            else
            {
               A687TAM04_AUTH_LVL = (byte)(localUtil.ctol( httpContext.cgiGet( edtTAM04_AUTH_LVL_Internalname), ".", ",")) ;
               n687TAM04_AUTH_LVL = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A687TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A687TAM04_AUTH_LVL, 2, 0)));
            }
            n687TAM04_AUTH_LVL = ((0==A687TAM04_AUTH_LVL) ? true : false) ;
            A215TAM04_DEL_FLG = httpContext.cgiGet( edtTAM04_DEL_FLG_Internalname) ;
            n215TAM04_DEL_FLG = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A215TAM04_DEL_FLG", A215TAM04_DEL_FLG);
            n215TAM04_DEL_FLG = ((GXutil.strcmp("", A215TAM04_DEL_FLG)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM04_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TAM04_CRT_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM04_CRT_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A233TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n233TAM04_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A233TAM04_CRT_DATETIME", localUtil.ttoc( A233TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A233TAM04_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM04_CRT_DATETIME_Internalname)) ;
               n233TAM04_CRT_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A233TAM04_CRT_DATETIME", localUtil.ttoc( A233TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n233TAM04_CRT_DATETIME = (GXutil.nullDate().equals(A233TAM04_CRT_DATETIME) ? true : false) ;
            A266TAM04_CRT_USER_ID = httpContext.cgiGet( edtTAM04_CRT_USER_ID_Internalname) ;
            n266TAM04_CRT_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A266TAM04_CRT_USER_ID", A266TAM04_CRT_USER_ID);
            n266TAM04_CRT_USER_ID = ((GXutil.strcmp("", A266TAM04_CRT_USER_ID)==0) ? true : false) ;
            A234TAM04_CRT_PROG_NM = httpContext.cgiGet( edtTAM04_CRT_PROG_NM_Internalname) ;
            n234TAM04_CRT_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A234TAM04_CRT_PROG_NM", A234TAM04_CRT_PROG_NM);
            n234TAM04_CRT_PROG_NM = ((GXutil.strcmp("", A234TAM04_CRT_PROG_NM)==0) ? true : false) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM04_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TAM04_UPD_DATETIME");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM04_UPD_DATETIME_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A235TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
               n235TAM04_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            else
            {
               A235TAM04_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM04_UPD_DATETIME_Internalname)) ;
               n235TAM04_UPD_DATETIME = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
            }
            n235TAM04_UPD_DATETIME = (GXutil.nullDate().equals(A235TAM04_UPD_DATETIME) ? true : false) ;
            A267TAM04_UPD_USER_ID = httpContext.cgiGet( edtTAM04_UPD_USER_ID_Internalname) ;
            n267TAM04_UPD_USER_ID = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A267TAM04_UPD_USER_ID", A267TAM04_UPD_USER_ID);
            n267TAM04_UPD_USER_ID = ((GXutil.strcmp("", A267TAM04_UPD_USER_ID)==0) ? true : false) ;
            A236TAM04_UPD_PROG_NM = httpContext.cgiGet( edtTAM04_UPD_PROG_NM_Internalname) ;
            n236TAM04_UPD_PROG_NM = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A236TAM04_UPD_PROG_NM", A236TAM04_UPD_PROG_NM);
            n236TAM04_UPD_PROG_NM = ((GXutil.strcmp("", A236TAM04_UPD_PROG_NM)==0) ? true : false) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAM04_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAM04_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAM04_UPD_CNT");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTAM04_UPD_CNT_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               A286TAM04_UPD_CNT = 0 ;
               n286TAM04_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
            }
            else
            {
               A286TAM04_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTAM04_UPD_CNT_Internalname), ".", ",") ;
               n286TAM04_UPD_CNT = false ;
               httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
            }
            n286TAM04_UPD_CNT = ((0==A286TAM04_UPD_CNT) ? true : false) ;
            /* Read saved values. */
            Z13TAM04_AUTH_CD = httpContext.cgiGet( "Z13TAM04_AUTH_CD") ;
            Z233TAM04_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z233TAM04_CRT_DATETIME"), 0) ;
            n233TAM04_CRT_DATETIME = (GXutil.nullDate().equals(A233TAM04_CRT_DATETIME) ? true : false) ;
            Z266TAM04_CRT_USER_ID = httpContext.cgiGet( "Z266TAM04_CRT_USER_ID") ;
            n266TAM04_CRT_USER_ID = ((GXutil.strcmp("", A266TAM04_CRT_USER_ID)==0) ? true : false) ;
            Z235TAM04_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( "Z235TAM04_UPD_DATETIME"), 0) ;
            n235TAM04_UPD_DATETIME = (GXutil.nullDate().equals(A235TAM04_UPD_DATETIME) ? true : false) ;
            Z267TAM04_UPD_USER_ID = httpContext.cgiGet( "Z267TAM04_UPD_USER_ID") ;
            n267TAM04_UPD_USER_ID = ((GXutil.strcmp("", A267TAM04_UPD_USER_ID)==0) ? true : false) ;
            Z286TAM04_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "Z286TAM04_UPD_CNT"), ".", ",") ;
            n286TAM04_UPD_CNT = ((0==A286TAM04_UPD_CNT) ? true : false) ;
            Z285TAM04_AUTH_NM = httpContext.cgiGet( "Z285TAM04_AUTH_NM") ;
            n285TAM04_AUTH_NM = ((GXutil.strcmp("", A285TAM04_AUTH_NM)==0) ? true : false) ;
            Z687TAM04_AUTH_LVL = (byte)(localUtil.ctol( httpContext.cgiGet( "Z687TAM04_AUTH_LVL"), ".", ",")) ;
            n687TAM04_AUTH_LVL = ((0==A687TAM04_AUTH_LVL) ? true : false) ;
            Z215TAM04_DEL_FLG = httpContext.cgiGet( "Z215TAM04_DEL_FLG") ;
            n215TAM04_DEL_FLG = ((GXutil.strcmp("", A215TAM04_DEL_FLG)==0) ? true : false) ;
            Z234TAM04_CRT_PROG_NM = httpContext.cgiGet( "Z234TAM04_CRT_PROG_NM") ;
            n234TAM04_CRT_PROG_NM = ((GXutil.strcmp("", A234TAM04_CRT_PROG_NM)==0) ? true : false) ;
            Z236TAM04_UPD_PROG_NM = httpContext.cgiGet( "Z236TAM04_UPD_PROG_NM") ;
            n236TAM04_UPD_PROG_NM = ((GXutil.strcmp("", A236TAM04_UPD_PROG_NM)==0) ? true : false) ;
            O286TAM04_UPD_CNT = localUtil.ctol( httpContext.cgiGet( "O286TAM04_UPD_CNT"), ".", ",") ;
            n286TAM04_UPD_CNT = ((0==A286TAM04_UPD_CNT) ? true : false) ;
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
                     /* Execute user event: e11032 */
                     e11032 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e12032 */
                     e12032 ();
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
         /* Execute user event: e12032 */
         e12032 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll033( ) ;
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
      disableAttributes033( ) ;
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

   public void resetCaption030( )
   {
   }

   public void e11032( )
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

   public void e12032( )
   {
      /* After Trn Routine */
      new a804_pc02_log_start(remoteHandle, context).execute( AV12Pgmname) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      AV10W_TXT = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + "権限パターン区分:" + A13TAM04_AUTH_CD + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A285TAM04_AUTH_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A687TAM04_AUTH_LVL, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A215TAM04_DEL_FLG + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A233TAM04_CRT_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam04_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A233TAM04_CRT_DATETIME", localUtil.ttoc( A233TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A266TAM04_CRT_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A234TAM04_CRT_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      GXt_char1 = AV10W_TXT ;
      GXv_char2[0] = GXt_char1 ;
      new a802_pc02_datetime_edit(remoteHandle, context).execute( A235TAM04_UPD_DATETIME, "YYYY/MM/DD HH:MI:SS", GXv_char2) ;
      tam04_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      AV10W_TXT = AV10W_TXT + GXt_char1 + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A267TAM04_UPD_USER_ID + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + A236TAM04_UPD_PROG_NM + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = AV10W_TXT + GXutil.trim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)) + GXutil.chr( (short)(9)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      AV10W_TXT = GXutil.strReplace( AV10W_TXT, GXutil.chr( (short)(13))+GXutil.chr( (short)(10)), "@br@") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
      new a804_pc03_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, AV10W_TXT) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "AV10W_TXT", AV10W_TXT);
   }

   public void zm033( int GX_JID )
   {
      if ( ( GX_JID == 8 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z233TAM04_CRT_DATETIME = T00033_A233TAM04_CRT_DATETIME[0] ;
            Z266TAM04_CRT_USER_ID = T00033_A266TAM04_CRT_USER_ID[0] ;
            Z235TAM04_UPD_DATETIME = T00033_A235TAM04_UPD_DATETIME[0] ;
            Z267TAM04_UPD_USER_ID = T00033_A267TAM04_UPD_USER_ID[0] ;
            Z286TAM04_UPD_CNT = T00033_A286TAM04_UPD_CNT[0] ;
            Z285TAM04_AUTH_NM = T00033_A285TAM04_AUTH_NM[0] ;
            Z687TAM04_AUTH_LVL = T00033_A687TAM04_AUTH_LVL[0] ;
            Z215TAM04_DEL_FLG = T00033_A215TAM04_DEL_FLG[0] ;
            Z234TAM04_CRT_PROG_NM = T00033_A234TAM04_CRT_PROG_NM[0] ;
            Z236TAM04_UPD_PROG_NM = T00033_A236TAM04_UPD_PROG_NM[0] ;
         }
         else
         {
            Z233TAM04_CRT_DATETIME = A233TAM04_CRT_DATETIME ;
            Z266TAM04_CRT_USER_ID = A266TAM04_CRT_USER_ID ;
            Z235TAM04_UPD_DATETIME = A235TAM04_UPD_DATETIME ;
            Z267TAM04_UPD_USER_ID = A267TAM04_UPD_USER_ID ;
            Z286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
            Z285TAM04_AUTH_NM = A285TAM04_AUTH_NM ;
            Z687TAM04_AUTH_LVL = A687TAM04_AUTH_LVL ;
            Z215TAM04_DEL_FLG = A215TAM04_DEL_FLG ;
            Z234TAM04_CRT_PROG_NM = A234TAM04_CRT_PROG_NM ;
            Z236TAM04_UPD_PROG_NM = A236TAM04_UPD_PROG_NM ;
         }
      }
      if ( GX_JID == -8 )
      {
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z233TAM04_CRT_DATETIME = A233TAM04_CRT_DATETIME ;
         Z266TAM04_CRT_USER_ID = A266TAM04_CRT_USER_ID ;
         Z235TAM04_UPD_DATETIME = A235TAM04_UPD_DATETIME ;
         Z267TAM04_UPD_USER_ID = A267TAM04_UPD_USER_ID ;
         Z286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
         Z285TAM04_AUTH_NM = A285TAM04_AUTH_NM ;
         Z687TAM04_AUTH_LVL = A687TAM04_AUTH_LVL ;
         Z215TAM04_DEL_FLG = A215TAM04_DEL_FLG ;
         Z234TAM04_CRT_PROG_NM = A234TAM04_CRT_PROG_NM ;
         Z236TAM04_UPD_PROG_NM = A236TAM04_UPD_PROG_NM ;
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

   public void load033( )
   {
      /* Using cursor T00034 */
      pr_default.execute(2, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(2) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A233TAM04_CRT_DATETIME = T00034_A233TAM04_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A233TAM04_CRT_DATETIME", localUtil.ttoc( A233TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n233TAM04_CRT_DATETIME = T00034_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = T00034_A266TAM04_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266TAM04_CRT_USER_ID", A266TAM04_CRT_USER_ID);
         n266TAM04_CRT_USER_ID = T00034_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = T00034_A235TAM04_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n235TAM04_UPD_DATETIME = T00034_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = T00034_A267TAM04_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A267TAM04_UPD_USER_ID", A267TAM04_UPD_USER_ID);
         n267TAM04_UPD_USER_ID = T00034_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = T00034_A286TAM04_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
         n286TAM04_UPD_CNT = T00034_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = T00034_A285TAM04_AUTH_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A285TAM04_AUTH_NM", A285TAM04_AUTH_NM);
         n285TAM04_AUTH_NM = T00034_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = T00034_A687TAM04_AUTH_LVL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A687TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A687TAM04_AUTH_LVL, 2, 0)));
         n687TAM04_AUTH_LVL = T00034_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = T00034_A215TAM04_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215TAM04_DEL_FLG", A215TAM04_DEL_FLG);
         n215TAM04_DEL_FLG = T00034_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = T00034_A234TAM04_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A234TAM04_CRT_PROG_NM", A234TAM04_CRT_PROG_NM);
         n234TAM04_CRT_PROG_NM = T00034_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = T00034_A236TAM04_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236TAM04_UPD_PROG_NM", A236TAM04_UPD_PROG_NM);
         n236TAM04_UPD_PROG_NM = T00034_n236TAM04_UPD_PROG_NM[0] ;
         zm033( -8) ;
      }
      pr_default.close(2);
      onLoadActions033( ) ;
   }

   public void onLoadActions033( )
   {
      AV12Pgmname = "TAM04_KNGN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
   }

   public void checkExtendedTable033( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV12Pgmname = "TAM04_KNGN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      if ( ! ( GXutil.nullDate().equals(A233TAM04_CRT_DATETIME) || (( A233TAM04_CRT_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A233TAM04_CRT_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　作成日時 は範囲外です", "OutOfRange", 1, "TAM04_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM04_CRT_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( ! ( GXutil.nullDate().equals(A235TAM04_UPD_DATETIME) || (( A235TAM04_UPD_DATETIME.after( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) ) || ( A235TAM04_UPD_DATETIME.equals( localUtil.ymdhmsToT( (short)(1000), (byte)(1), (byte)(1), (byte)(0), (byte)(0), (byte)(0)) ) )) ) )
      {
         httpContext.GX_msglist.addItem("フィールド　更新日時 は範囲外です", "OutOfRange", 1, "TAM04_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM04_UPD_DATETIME_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
   }

   public void closeExtendedTableCursors033( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey033( )
   {
      /* Using cursor T00035 */
      pr_default.execute(3, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(3) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T00033 */
      pr_default.execute(1, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm033( 8) ;
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = T00033_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
         A233TAM04_CRT_DATETIME = T00033_A233TAM04_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A233TAM04_CRT_DATETIME", localUtil.ttoc( A233TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n233TAM04_CRT_DATETIME = T00033_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = T00033_A266TAM04_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266TAM04_CRT_USER_ID", A266TAM04_CRT_USER_ID);
         n266TAM04_CRT_USER_ID = T00033_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = T00033_A235TAM04_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n235TAM04_UPD_DATETIME = T00033_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = T00033_A267TAM04_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A267TAM04_UPD_USER_ID", A267TAM04_UPD_USER_ID);
         n267TAM04_UPD_USER_ID = T00033_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = T00033_A286TAM04_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
         n286TAM04_UPD_CNT = T00033_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = T00033_A285TAM04_AUTH_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A285TAM04_AUTH_NM", A285TAM04_AUTH_NM);
         n285TAM04_AUTH_NM = T00033_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = T00033_A687TAM04_AUTH_LVL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A687TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A687TAM04_AUTH_LVL, 2, 0)));
         n687TAM04_AUTH_LVL = T00033_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = T00033_A215TAM04_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215TAM04_DEL_FLG", A215TAM04_DEL_FLG);
         n215TAM04_DEL_FLG = T00033_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = T00033_A234TAM04_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A234TAM04_CRT_PROG_NM", A234TAM04_CRT_PROG_NM);
         n234TAM04_CRT_PROG_NM = T00033_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = T00033_A236TAM04_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236TAM04_UPD_PROG_NM", A236TAM04_UPD_PROG_NM);
         n236TAM04_UPD_PROG_NM = T00033_n236TAM04_UPD_PROG_NM[0] ;
         O286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
         n286TAM04_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load033( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey033( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey033( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey033( ) ;
      if ( RcdFound3 == 0 )
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
      RcdFound3 = (short)(0) ;
      /* Using cursor T00036 */
      pr_default.execute(4, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         while ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00036_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) < 0 ) ) )
         {
            pr_default.readNext(4);
         }
         if ( (pr_default.getStatus(4) != 101) && ( ( GXutil.strcmp(T00036_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) > 0 ) ) )
         {
            A13TAM04_AUTH_CD = T00036_A13TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(4);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T00037 */
      pr_default.execute(5, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         while ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00037_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) > 0 ) ) )
         {
            pr_default.readNext(5);
         }
         if ( (pr_default.getStatus(5) != 101) && ( ( GXutil.strcmp(T00037_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) < 0 ) ) )
         {
            A13TAM04_AUTH_CD = T00037_A13TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey033( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert033( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound3 == 1 )
         {
            if ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 )
            {
               A13TAM04_AUTH_CD = Z13TAM04_AUTH_CD ;
               httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
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
               update033( ) ;
               GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert033( ) ;
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
                  insert033( ) ;
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
      if ( GXutil.strcmp(A13TAM04_AUTH_CD, Z13TAM04_AUTH_CD) != 0 )
      {
         A13TAM04_AUTH_CD = Z13TAM04_AUTH_CD ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TAM04_AUTH_CD");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTAM04_AUTH_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
      scanStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM04_AUTH_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd033( ) ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM04_AUTH_NM_Internalname ;
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
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM04_AUTH_NM_Internalname ;
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
      scanStart033( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound3 != 0 )
         {
            scanNext033( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM04_AUTH_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd033( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency033( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T00032 */
         pr_default.execute(0, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM04_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z233TAM04_CRT_DATETIME.equals( T00032_A233TAM04_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z266TAM04_CRT_USER_ID, T00032_A266TAM04_CRT_USER_ID[0]) != 0 ) || !( Z235TAM04_UPD_DATETIME.equals( T00032_A235TAM04_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z267TAM04_UPD_USER_ID, T00032_A267TAM04_UPD_USER_ID[0]) != 0 ) || ( Z286TAM04_UPD_CNT != T00032_A286TAM04_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z285TAM04_AUTH_NM, T00032_A285TAM04_AUTH_NM[0]) != 0 ) || ( Z687TAM04_AUTH_LVL != T00032_A687TAM04_AUTH_LVL[0] ) || ( GXutil.strcmp(Z215TAM04_DEL_FLG, T00032_A215TAM04_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z234TAM04_CRT_PROG_NM, T00032_A234TAM04_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z236TAM04_UPD_PROG_NM, T00032_A236TAM04_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM04_KNGN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         zm033( 0) ;
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00038 */
                  pr_default.execute(6, new Object[] {A13TAM04_AUTH_CD, new Boolean(n233TAM04_CRT_DATETIME), A233TAM04_CRT_DATETIME, new Boolean(n266TAM04_CRT_USER_ID), A266TAM04_CRT_USER_ID, new Boolean(n235TAM04_UPD_DATETIME), A235TAM04_UPD_DATETIME, new Boolean(n267TAM04_UPD_USER_ID), A267TAM04_UPD_USER_ID, new Boolean(n286TAM04_UPD_CNT), new Long(A286TAM04_UPD_CNT), new Boolean(n285TAM04_AUTH_NM), A285TAM04_AUTH_NM, new Boolean(n687TAM04_AUTH_LVL), new Byte(A687TAM04_AUTH_LVL), new Boolean(n215TAM04_DEL_FLG), A215TAM04_DEL_FLG, new Boolean(n234TAM04_CRT_PROG_NM), A234TAM04_CRT_PROG_NM, new Boolean(n236TAM04_UPD_PROG_NM), A236TAM04_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM04_KNGN") ;
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
                        resetCaption030( ) ;
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
            load033( ) ;
         }
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void update033( )
   {
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable033( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm033( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate033( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T00039 */
                  pr_default.execute(7, new Object[] {new Boolean(n233TAM04_CRT_DATETIME), A233TAM04_CRT_DATETIME, new Boolean(n266TAM04_CRT_USER_ID), A266TAM04_CRT_USER_ID, new Boolean(n235TAM04_UPD_DATETIME), A235TAM04_UPD_DATETIME, new Boolean(n267TAM04_UPD_USER_ID), A267TAM04_UPD_USER_ID, new Boolean(n286TAM04_UPD_CNT), new Long(A286TAM04_UPD_CNT), new Boolean(n285TAM04_AUTH_NM), A285TAM04_AUTH_NM, new Boolean(n687TAM04_AUTH_LVL), new Byte(A687TAM04_AUTH_LVL), new Boolean(n215TAM04_DEL_FLG), A215TAM04_DEL_FLG, new Boolean(n234TAM04_CRT_PROG_NM), A234TAM04_CRT_PROG_NM, new Boolean(n236TAM04_UPD_PROG_NM), A236TAM04_UPD_PROG_NM, A13TAM04_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM04_KNGN") ;
                  if ( (pr_default.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM04_KNGN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate033( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                        resetCaption030( ) ;
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
         endLevel033( ) ;
      }
      closeExtendedTableCursors033( ) ;
   }

   public void deferredUpdate033( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate033( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency033( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls033( ) ;
         afterConfirm033( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete033( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000310 */
               pr_default.execute(8, new Object[] {A13TAM04_AUTH_CD});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM04_KNGN") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound3 == 0 )
                     {
                        initAll033( ) ;
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
                     resetCaption030( ) ;
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
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel033( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls033( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV12Pgmname = "TAM04_KNGN" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000311 */
         pr_default.execute(9, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(9) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ユーザーマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(9);
         /* Using cursor T000312 */
         pr_default.execute(10, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(10) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"権限別振舞マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(10);
         /* Using cursor T000313 */
         pr_default.execute(11, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(11) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"アプリケーション権限マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(11);
      }
   }

   public void endLevel033( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete033( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tam04_kngn");
         if ( AnyError == 0 )
         {
            confirmValues030( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tam04_kngn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart033( )
   {
      /* Scan By routine */
      /* Using cursor T000314 */
      pr_default.execute(12);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = T000314_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext033( )
   {
      /* Scan next routine */
      pr_default.readNext(12);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(12) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = T000314_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
      }
   }

   public void scanEnd033( )
   {
      pr_default.close(12);
   }

   public void afterConfirm033( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert033( )
   {
      /* Before Insert Rules */
      A233TAM04_CRT_DATETIME = GXutil.now( ) ;
      n233TAM04_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A233TAM04_CRT_DATETIME", localUtil.ttoc( A233TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A266TAM04_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A266TAM04_CRT_USER_ID = GXt_char1 ;
      n266TAM04_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A266TAM04_CRT_USER_ID", A266TAM04_CRT_USER_ID);
      A235TAM04_UPD_DATETIME = GXutil.now( ) ;
      n235TAM04_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A267TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A267TAM04_UPD_USER_ID = GXt_char1 ;
      n267TAM04_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A267TAM04_UPD_USER_ID", A267TAM04_UPD_USER_ID);
      A286TAM04_UPD_CNT = (long)(O286TAM04_UPD_CNT+1) ;
      n286TAM04_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate033( )
   {
      /* Before Update Rules */
      A235TAM04_UPD_DATETIME = GXutil.now( ) ;
      n235TAM04_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A267TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A267TAM04_UPD_USER_ID = GXt_char1 ;
      n267TAM04_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A267TAM04_UPD_USER_ID", A267TAM04_UPD_USER_ID);
      A286TAM04_UPD_CNT = (long)(O286TAM04_UPD_CNT+1) ;
      n286TAM04_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
   }

   public void beforeDelete033( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete033( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate033( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes033( )
   {
      edtTAM04_AUTH_CD_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_AUTH_CD_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_AUTH_CD_Enabled, 5, 0)));
      edtTAM04_AUTH_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_AUTH_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_AUTH_NM_Enabled, 5, 0)));
      edtTAM04_AUTH_LVL_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_AUTH_LVL_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_AUTH_LVL_Enabled, 5, 0)));
      edtTAM04_DEL_FLG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_DEL_FLG_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_DEL_FLG_Enabled, 5, 0)));
      edtTAM04_CRT_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_CRT_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_CRT_DATETIME_Enabled, 5, 0)));
      edtTAM04_CRT_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_CRT_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_CRT_USER_ID_Enabled, 5, 0)));
      edtTAM04_CRT_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_CRT_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_CRT_PROG_NM_Enabled, 5, 0)));
      edtTAM04_UPD_DATETIME_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_UPD_DATETIME_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_UPD_DATETIME_Enabled, 5, 0)));
      edtTAM04_UPD_USER_ID_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_UPD_USER_ID_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_UPD_USER_ID_Enabled, 5, 0)));
      edtTAM04_UPD_PROG_NM_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_UPD_PROG_NM_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_UPD_PROG_NM_Enabled, 5, 0)));
      edtTAM04_UPD_CNT_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTAM04_UPD_CNT_Internalname, "Enabled", GXutil.ltrim( GXutil.str( edtTAM04_UPD_CNT_Enabled, 5, 0)));
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues030( )
   {
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "権限パターンマスタ") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317134946");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tam04_kngn") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm033( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      GxWebStd.gx_hidden_field( httpContext, "Z13TAM04_AUTH_CD", GXutil.rtrim( Z13TAM04_AUTH_CD));
      GxWebStd.gx_hidden_field( httpContext, "Z233TAM04_CRT_DATETIME", localUtil.ttoc( Z233TAM04_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z266TAM04_CRT_USER_ID", GXutil.rtrim( Z266TAM04_CRT_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z235TAM04_UPD_DATETIME", localUtil.ttoc( Z235TAM04_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GxWebStd.gx_hidden_field( httpContext, "Z267TAM04_UPD_USER_ID", GXutil.rtrim( Z267TAM04_UPD_USER_ID));
      GxWebStd.gx_hidden_field( httpContext, "Z286TAM04_UPD_CNT", GXutil.ltrim( localUtil.ntoc( Z286TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z285TAM04_AUTH_NM", GXutil.rtrim( Z285TAM04_AUTH_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z687TAM04_AUTH_LVL", GXutil.ltrim( localUtil.ntoc( Z687TAM04_AUTH_LVL, (byte)(2), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "Z215TAM04_DEL_FLG", GXutil.rtrim( Z215TAM04_DEL_FLG));
      GxWebStd.gx_hidden_field( httpContext, "Z234TAM04_CRT_PROG_NM", GXutil.rtrim( Z234TAM04_CRT_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "Z236TAM04_UPD_PROG_NM", GXutil.rtrim( Z236TAM04_UPD_PROG_NM));
      GxWebStd.gx_hidden_field( httpContext, "O286TAM04_UPD_CNT", GXutil.ltrim( localUtil.ntoc( O286TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      return "TAM04_KNGN" ;
   }

   public String getPgmdesc( )
   {
      return "権限パターンマスタ" ;
   }

   public void initializeNonKey033( )
   {
      A233TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n233TAM04_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A233TAM04_CRT_DATETIME", localUtil.ttoc( A233TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n233TAM04_CRT_DATETIME = (GXutil.nullDate().equals(A233TAM04_CRT_DATETIME) ? true : false) ;
      A266TAM04_CRT_USER_ID = "" ;
      n266TAM04_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A266TAM04_CRT_USER_ID", A266TAM04_CRT_USER_ID);
      n266TAM04_CRT_USER_ID = ((GXutil.strcmp("", A266TAM04_CRT_USER_ID)==0) ? true : false) ;
      A235TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n235TAM04_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      n235TAM04_UPD_DATETIME = (GXutil.nullDate().equals(A235TAM04_UPD_DATETIME) ? true : false) ;
      A267TAM04_UPD_USER_ID = "" ;
      n267TAM04_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A267TAM04_UPD_USER_ID", A267TAM04_UPD_USER_ID);
      n267TAM04_UPD_USER_ID = ((GXutil.strcmp("", A267TAM04_UPD_USER_ID)==0) ? true : false) ;
      A286TAM04_UPD_CNT = 0 ;
      n286TAM04_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
      n286TAM04_UPD_CNT = ((0==A286TAM04_UPD_CNT) ? true : false) ;
      A285TAM04_AUTH_NM = "" ;
      n285TAM04_AUTH_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A285TAM04_AUTH_NM", A285TAM04_AUTH_NM);
      n285TAM04_AUTH_NM = ((GXutil.strcmp("", A285TAM04_AUTH_NM)==0) ? true : false) ;
      A687TAM04_AUTH_LVL = (byte)(0) ;
      n687TAM04_AUTH_LVL = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A687TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A687TAM04_AUTH_LVL, 2, 0)));
      n687TAM04_AUTH_LVL = ((0==A687TAM04_AUTH_LVL) ? true : false) ;
      A215TAM04_DEL_FLG = "" ;
      n215TAM04_DEL_FLG = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A215TAM04_DEL_FLG", A215TAM04_DEL_FLG);
      n215TAM04_DEL_FLG = ((GXutil.strcmp("", A215TAM04_DEL_FLG)==0) ? true : false) ;
      A234TAM04_CRT_PROG_NM = "" ;
      n234TAM04_CRT_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A234TAM04_CRT_PROG_NM", A234TAM04_CRT_PROG_NM);
      n234TAM04_CRT_PROG_NM = ((GXutil.strcmp("", A234TAM04_CRT_PROG_NM)==0) ? true : false) ;
      A236TAM04_UPD_PROG_NM = "" ;
      n236TAM04_UPD_PROG_NM = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A236TAM04_UPD_PROG_NM", A236TAM04_UPD_PROG_NM);
      n236TAM04_UPD_PROG_NM = ((GXutil.strcmp("", A236TAM04_UPD_PROG_NM)==0) ? true : false) ;
      O286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
      n286TAM04_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
   }

   public void initAll033( )
   {
      A13TAM04_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
      initializeNonKey033( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317134952");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tam04_kngn.js", "?20177317134954");
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
      lblTextblocktam04_auth_nm_Internalname = "TEXTBLOCKTAM04_AUTH_NM" ;
      edtTAM04_AUTH_NM_Internalname = "TAM04_AUTH_NM" ;
      lblTextblocktam04_auth_lvl_Internalname = "TEXTBLOCKTAM04_AUTH_LVL" ;
      edtTAM04_AUTH_LVL_Internalname = "TAM04_AUTH_LVL" ;
      lblTextblocktam04_del_flg_Internalname = "TEXTBLOCKTAM04_DEL_FLG" ;
      edtTAM04_DEL_FLG_Internalname = "TAM04_DEL_FLG" ;
      lblTextblocktam04_crt_datetime_Internalname = "TEXTBLOCKTAM04_CRT_DATETIME" ;
      edtTAM04_CRT_DATETIME_Internalname = "TAM04_CRT_DATETIME" ;
      lblTextblocktam04_crt_user_id_Internalname = "TEXTBLOCKTAM04_CRT_USER_ID" ;
      edtTAM04_CRT_USER_ID_Internalname = "TAM04_CRT_USER_ID" ;
      lblTextblocktam04_crt_prog_nm_Internalname = "TEXTBLOCKTAM04_CRT_PROG_NM" ;
      edtTAM04_CRT_PROG_NM_Internalname = "TAM04_CRT_PROG_NM" ;
      lblTextblocktam04_upd_datetime_Internalname = "TEXTBLOCKTAM04_UPD_DATETIME" ;
      edtTAM04_UPD_DATETIME_Internalname = "TAM04_UPD_DATETIME" ;
      lblTextblocktam04_upd_user_id_Internalname = "TEXTBLOCKTAM04_UPD_USER_ID" ;
      edtTAM04_UPD_USER_ID_Internalname = "TAM04_UPD_USER_ID" ;
      lblTextblocktam04_upd_prog_nm_Internalname = "TEXTBLOCKTAM04_UPD_PROG_NM" ;
      edtTAM04_UPD_PROG_NM_Internalname = "TAM04_UPD_PROG_NM" ;
      lblTextblocktam04_upd_cnt_Internalname = "TEXTBLOCKTAM04_UPD_CNT" ;
      edtTAM04_UPD_CNT_Internalname = "TAM04_UPD_CNT" ;
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
      edtTAM04_UPD_CNT_Jsonclick = "" ;
      edtTAM04_UPD_CNT_Enabled = 1 ;
      edtTAM04_UPD_PROG_NM_Jsonclick = "" ;
      edtTAM04_UPD_PROG_NM_Enabled = 1 ;
      edtTAM04_UPD_USER_ID_Jsonclick = "" ;
      edtTAM04_UPD_USER_ID_Enabled = 1 ;
      edtTAM04_UPD_DATETIME_Jsonclick = "" ;
      edtTAM04_UPD_DATETIME_Enabled = 1 ;
      edtTAM04_CRT_PROG_NM_Jsonclick = "" ;
      edtTAM04_CRT_PROG_NM_Enabled = 1 ;
      edtTAM04_CRT_USER_ID_Jsonclick = "" ;
      edtTAM04_CRT_USER_ID_Enabled = 1 ;
      edtTAM04_CRT_DATETIME_Jsonclick = "" ;
      edtTAM04_CRT_DATETIME_Enabled = 1 ;
      edtTAM04_DEL_FLG_Jsonclick = "" ;
      edtTAM04_DEL_FLG_Enabled = 1 ;
      edtTAM04_AUTH_LVL_Jsonclick = "" ;
      edtTAM04_AUTH_LVL_Enabled = 1 ;
      edtTAM04_AUTH_NM_Jsonclick = "" ;
      edtTAM04_AUTH_NM_Enabled = 1 ;
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

   public void gx4asatam04_crt_user_id033( String Gx_mode )
   {
      GXt_char1 = A266TAM04_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A266TAM04_CRT_USER_ID = GXt_char1 ;
      n266TAM04_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A266TAM04_CRT_USER_ID", A266TAM04_CRT_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A266TAM04_CRT_USER_ID))+"\"");
      httpContext.GX_webresponse.addString(")");
      if ( true )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
   }

   public void gx6asatam04_upd_user_id033( String Gx_mode )
   {
      GXt_char1 = A267TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A267TAM04_UPD_USER_ID = GXt_char1 ;
      n267TAM04_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A267TAM04_UPD_USER_ID", A267TAM04_UPD_USER_ID);
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      httpContext.GX_webresponse.addString("new Array( new Array(");
      httpContext.GX_webresponse.addString("\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A267TAM04_UPD_USER_ID))+"\"");
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
      GX_FocusControl = edtTAM04_AUTH_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public void valid_Tam04_auth_cd( String GX_Parm1 ,
                                    java.util.Date GX_Parm2 ,
                                    String GX_Parm3 ,
                                    java.util.Date GX_Parm4 ,
                                    String GX_Parm5 ,
                                    long GX_Parm6 ,
                                    String GX_Parm7 ,
                                    byte GX_Parm8 ,
                                    String GX_Parm9 ,
                                    String GX_Parm10 ,
                                    String GX_Parm11 )
   {
      A13TAM04_AUTH_CD = GX_Parm1 ;
      A233TAM04_CRT_DATETIME = GX_Parm2 ;
      n233TAM04_CRT_DATETIME = false ;
      A266TAM04_CRT_USER_ID = GX_Parm3 ;
      n266TAM04_CRT_USER_ID = false ;
      A235TAM04_UPD_DATETIME = GX_Parm4 ;
      n235TAM04_UPD_DATETIME = false ;
      A267TAM04_UPD_USER_ID = GX_Parm5 ;
      n267TAM04_UPD_USER_ID = false ;
      A286TAM04_UPD_CNT = GX_Parm6 ;
      n286TAM04_UPD_CNT = false ;
      A285TAM04_AUTH_NM = GX_Parm7 ;
      n285TAM04_AUTH_NM = false ;
      A687TAM04_AUTH_LVL = GX_Parm8 ;
      n687TAM04_AUTH_LVL = false ;
      A215TAM04_DEL_FLG = GX_Parm9 ;
      n215TAM04_DEL_FLG = false ;
      A234TAM04_CRT_PROG_NM = GX_Parm10 ;
      n234TAM04_CRT_PROG_NM = false ;
      A236TAM04_UPD_PROG_NM = GX_Parm11 ;
      n236TAM04_UPD_PROG_NM = false ;
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      dynload_actions( ) ;
      if ( AnyError == 1 )
      {
      }
      isValidOutput.add(localUtil.format(A233TAM04_CRT_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A266TAM04_CRT_USER_ID));
      isValidOutput.add(localUtil.format(A235TAM04_UPD_DATETIME, "9999/99/99 99:99:99"));
      isValidOutput.add(GXutil.rtrim( A267TAM04_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A286TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A285TAM04_AUTH_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( A687TAM04_AUTH_LVL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( A215TAM04_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( A234TAM04_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( A236TAM04_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( AV12Pgmname));
      isValidOutput.add(GXutil.rtrim( Gx_mode));
      isValidOutput.add(GXutil.rtrim( Z13TAM04_AUTH_CD));
      isValidOutput.add(localUtil.ttoc( Z233TAM04_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z266TAM04_CRT_USER_ID));
      isValidOutput.add(localUtil.ttoc( Z235TAM04_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      isValidOutput.add(GXutil.rtrim( Z267TAM04_UPD_USER_ID));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z286TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z285TAM04_AUTH_NM));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( Z687TAM04_AUTH_LVL, (byte)(2), (byte)(0), ".", "")));
      isValidOutput.add(GXutil.rtrim( Z215TAM04_DEL_FLG));
      isValidOutput.add(GXutil.rtrim( Z234TAM04_CRT_PROG_NM));
      isValidOutput.add(GXutil.rtrim( Z236TAM04_UPD_PROG_NM));
      isValidOutput.add(GXutil.rtrim( ZV12Pgmname));
      isValidOutput.add(GXutil.ltrim( localUtil.ntoc( O286TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
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
      Z13TAM04_AUTH_CD = "" ;
      Z233TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z266TAM04_CRT_USER_ID = "" ;
      Z235TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z267TAM04_UPD_USER_ID = "" ;
      Z285TAM04_AUTH_NM = "" ;
      Z215TAM04_DEL_FLG = "" ;
      Z234TAM04_CRT_PROG_NM = "" ;
      Z236TAM04_UPD_PROG_NM = "" ;
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
      lblTextblocktam04_auth_cd_Jsonclick = "" ;
      A13TAM04_AUTH_CD = "" ;
      lblTextblocktam04_auth_nm_Jsonclick = "" ;
      A285TAM04_AUTH_NM = "" ;
      lblTextblocktam04_auth_lvl_Jsonclick = "" ;
      lblTextblocktam04_del_flg_Jsonclick = "" ;
      A215TAM04_DEL_FLG = "" ;
      lblTextblocktam04_crt_datetime_Jsonclick = "" ;
      A233TAM04_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam04_crt_user_id_Jsonclick = "" ;
      A266TAM04_CRT_USER_ID = "" ;
      lblTextblocktam04_crt_prog_nm_Jsonclick = "" ;
      A234TAM04_CRT_PROG_NM = "" ;
      lblTextblocktam04_upd_datetime_Jsonclick = "" ;
      A235TAM04_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      lblTextblocktam04_upd_user_id_Jsonclick = "" ;
      A267TAM04_UPD_USER_ID = "" ;
      lblTextblocktam04_upd_prog_nm_Jsonclick = "" ;
      A236TAM04_UPD_PROG_NM = "" ;
      lblTextblocktam04_upd_cnt_Jsonclick = "" ;
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
      T00034_A13TAM04_AUTH_CD = new String[] {""} ;
      T00034_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00034_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      T00034_A266TAM04_CRT_USER_ID = new String[] {""} ;
      T00034_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      T00034_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00034_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      T00034_A267TAM04_UPD_USER_ID = new String[] {""} ;
      T00034_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      T00034_A286TAM04_UPD_CNT = new long[1] ;
      T00034_n286TAM04_UPD_CNT = new boolean[] {false} ;
      T00034_A285TAM04_AUTH_NM = new String[] {""} ;
      T00034_n285TAM04_AUTH_NM = new boolean[] {false} ;
      T00034_A687TAM04_AUTH_LVL = new byte[1] ;
      T00034_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      T00034_A215TAM04_DEL_FLG = new String[] {""} ;
      T00034_n215TAM04_DEL_FLG = new boolean[] {false} ;
      T00034_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      T00034_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      T00034_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      T00034_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      T00035_A13TAM04_AUTH_CD = new String[] {""} ;
      T00033_A13TAM04_AUTH_CD = new String[] {""} ;
      T00033_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00033_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      T00033_A266TAM04_CRT_USER_ID = new String[] {""} ;
      T00033_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      T00033_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00033_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      T00033_A267TAM04_UPD_USER_ID = new String[] {""} ;
      T00033_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      T00033_A286TAM04_UPD_CNT = new long[1] ;
      T00033_n286TAM04_UPD_CNT = new boolean[] {false} ;
      T00033_A285TAM04_AUTH_NM = new String[] {""} ;
      T00033_n285TAM04_AUTH_NM = new boolean[] {false} ;
      T00033_A687TAM04_AUTH_LVL = new byte[1] ;
      T00033_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      T00033_A215TAM04_DEL_FLG = new String[] {""} ;
      T00033_n215TAM04_DEL_FLG = new boolean[] {false} ;
      T00033_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      T00033_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      T00033_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      T00033_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      sMode3 = "" ;
      T00036_A13TAM04_AUTH_CD = new String[] {""} ;
      T00037_A13TAM04_AUTH_CD = new String[] {""} ;
      T00032_A13TAM04_AUTH_CD = new String[] {""} ;
      T00032_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00032_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      T00032_A266TAM04_CRT_USER_ID = new String[] {""} ;
      T00032_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      T00032_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T00032_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      T00032_A267TAM04_UPD_USER_ID = new String[] {""} ;
      T00032_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      T00032_A286TAM04_UPD_CNT = new long[1] ;
      T00032_n286TAM04_UPD_CNT = new boolean[] {false} ;
      T00032_A285TAM04_AUTH_NM = new String[] {""} ;
      T00032_n285TAM04_AUTH_NM = new boolean[] {false} ;
      T00032_A687TAM04_AUTH_LVL = new byte[1] ;
      T00032_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      T00032_A215TAM04_DEL_FLG = new String[] {""} ;
      T00032_n215TAM04_DEL_FLG = new boolean[] {false} ;
      T00032_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      T00032_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      T00032_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      T00032_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      T000311_A55TAM07_USER_ID = new String[] {""} ;
      T000312_A50TBM07_AUTH_CD = new String[] {""} ;
      T000313_A13TAM04_AUTH_CD = new String[] {""} ;
      T000313_A12TAM03_APP_ID = new String[] {""} ;
      T000314_A13TAM04_AUTH_CD = new String[] {""} ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV12Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      pr_default = new DataStoreProvider(context, remoteHandle, new tam04_kngn__default(),
         new Object[] {
             new Object[] {
            T00032_A13TAM04_AUTH_CD, T00032_A233TAM04_CRT_DATETIME, T00032_n233TAM04_CRT_DATETIME, T00032_A266TAM04_CRT_USER_ID, T00032_n266TAM04_CRT_USER_ID, T00032_A235TAM04_UPD_DATETIME, T00032_n235TAM04_UPD_DATETIME, T00032_A267TAM04_UPD_USER_ID, T00032_n267TAM04_UPD_USER_ID, T00032_A286TAM04_UPD_CNT,
            T00032_n286TAM04_UPD_CNT, T00032_A285TAM04_AUTH_NM, T00032_n285TAM04_AUTH_NM, T00032_A687TAM04_AUTH_LVL, T00032_n687TAM04_AUTH_LVL, T00032_A215TAM04_DEL_FLG, T00032_n215TAM04_DEL_FLG, T00032_A234TAM04_CRT_PROG_NM, T00032_n234TAM04_CRT_PROG_NM, T00032_A236TAM04_UPD_PROG_NM,
            T00032_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            T00033_A13TAM04_AUTH_CD, T00033_A233TAM04_CRT_DATETIME, T00033_n233TAM04_CRT_DATETIME, T00033_A266TAM04_CRT_USER_ID, T00033_n266TAM04_CRT_USER_ID, T00033_A235TAM04_UPD_DATETIME, T00033_n235TAM04_UPD_DATETIME, T00033_A267TAM04_UPD_USER_ID, T00033_n267TAM04_UPD_USER_ID, T00033_A286TAM04_UPD_CNT,
            T00033_n286TAM04_UPD_CNT, T00033_A285TAM04_AUTH_NM, T00033_n285TAM04_AUTH_NM, T00033_A687TAM04_AUTH_LVL, T00033_n687TAM04_AUTH_LVL, T00033_A215TAM04_DEL_FLG, T00033_n215TAM04_DEL_FLG, T00033_A234TAM04_CRT_PROG_NM, T00033_n234TAM04_CRT_PROG_NM, T00033_A236TAM04_UPD_PROG_NM,
            T00033_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            T00034_A13TAM04_AUTH_CD, T00034_A233TAM04_CRT_DATETIME, T00034_n233TAM04_CRT_DATETIME, T00034_A266TAM04_CRT_USER_ID, T00034_n266TAM04_CRT_USER_ID, T00034_A235TAM04_UPD_DATETIME, T00034_n235TAM04_UPD_DATETIME, T00034_A267TAM04_UPD_USER_ID, T00034_n267TAM04_UPD_USER_ID, T00034_A286TAM04_UPD_CNT,
            T00034_n286TAM04_UPD_CNT, T00034_A285TAM04_AUTH_NM, T00034_n285TAM04_AUTH_NM, T00034_A687TAM04_AUTH_LVL, T00034_n687TAM04_AUTH_LVL, T00034_A215TAM04_DEL_FLG, T00034_n215TAM04_DEL_FLG, T00034_A234TAM04_CRT_PROG_NM, T00034_n234TAM04_CRT_PROG_NM, T00034_A236TAM04_UPD_PROG_NM,
            T00034_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            T00035_A13TAM04_AUTH_CD
            }
            , new Object[] {
            T00036_A13TAM04_AUTH_CD
            }
            , new Object[] {
            T00037_A13TAM04_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000311_A55TAM07_USER_ID
            }
            , new Object[] {
            T000312_A50TBM07_AUTH_CD
            }
            , new Object[] {
            T000313_A13TAM04_AUTH_CD, T000313_A12TAM03_APP_ID
            }
            , new Object[] {
            T000314_A13TAM04_AUTH_CD
            }
         }
      );
      AV12Pgmname = "TAM04_KNGN" ;
   }

   private byte Z687TAM04_AUTH_LVL ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A687TAM04_AUTH_LVL ;
   private byte Gx_BScreen ;
   private byte wbTemp ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound3 ;
   private int trnEnded ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int edtTAM04_AUTH_CD_Enabled ;
   private int edtTAM04_AUTH_NM_Enabled ;
   private int edtTAM04_AUTH_LVL_Enabled ;
   private int edtTAM04_DEL_FLG_Enabled ;
   private int edtTAM04_CRT_DATETIME_Enabled ;
   private int edtTAM04_CRT_USER_ID_Enabled ;
   private int edtTAM04_CRT_PROG_NM_Enabled ;
   private int edtTAM04_UPD_DATETIME_Enabled ;
   private int edtTAM04_UPD_USER_ID_Enabled ;
   private int edtTAM04_UPD_PROG_NM_Enabled ;
   private int edtTAM04_UPD_CNT_Enabled ;
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
   private long Z286TAM04_UPD_CNT ;
   private long O286TAM04_UPD_CNT ;
   private long A286TAM04_UPD_CNT ;
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
   private String lblTextblocktam04_auth_nm_Internalname ;
   private String lblTextblocktam04_auth_nm_Jsonclick ;
   private String edtTAM04_AUTH_NM_Internalname ;
   private String edtTAM04_AUTH_NM_Jsonclick ;
   private String lblTextblocktam04_auth_lvl_Internalname ;
   private String lblTextblocktam04_auth_lvl_Jsonclick ;
   private String edtTAM04_AUTH_LVL_Internalname ;
   private String edtTAM04_AUTH_LVL_Jsonclick ;
   private String lblTextblocktam04_del_flg_Internalname ;
   private String lblTextblocktam04_del_flg_Jsonclick ;
   private String edtTAM04_DEL_FLG_Internalname ;
   private String edtTAM04_DEL_FLG_Jsonclick ;
   private String lblTextblocktam04_crt_datetime_Internalname ;
   private String lblTextblocktam04_crt_datetime_Jsonclick ;
   private String edtTAM04_CRT_DATETIME_Internalname ;
   private String edtTAM04_CRT_DATETIME_Jsonclick ;
   private String lblTextblocktam04_crt_user_id_Internalname ;
   private String lblTextblocktam04_crt_user_id_Jsonclick ;
   private String edtTAM04_CRT_USER_ID_Internalname ;
   private String edtTAM04_CRT_USER_ID_Jsonclick ;
   private String lblTextblocktam04_crt_prog_nm_Internalname ;
   private String lblTextblocktam04_crt_prog_nm_Jsonclick ;
   private String edtTAM04_CRT_PROG_NM_Internalname ;
   private String edtTAM04_CRT_PROG_NM_Jsonclick ;
   private String lblTextblocktam04_upd_datetime_Internalname ;
   private String lblTextblocktam04_upd_datetime_Jsonclick ;
   private String edtTAM04_UPD_DATETIME_Internalname ;
   private String edtTAM04_UPD_DATETIME_Jsonclick ;
   private String lblTextblocktam04_upd_user_id_Internalname ;
   private String lblTextblocktam04_upd_user_id_Jsonclick ;
   private String edtTAM04_UPD_USER_ID_Internalname ;
   private String edtTAM04_UPD_USER_ID_Jsonclick ;
   private String lblTextblocktam04_upd_prog_nm_Internalname ;
   private String lblTextblocktam04_upd_prog_nm_Jsonclick ;
   private String edtTAM04_UPD_PROG_NM_Internalname ;
   private String edtTAM04_UPD_PROG_NM_Jsonclick ;
   private String lblTextblocktam04_upd_cnt_Internalname ;
   private String lblTextblocktam04_upd_cnt_Jsonclick ;
   private String edtTAM04_UPD_CNT_Internalname ;
   private String edtTAM04_UPD_CNT_Jsonclick ;
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
   private String sMode3 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV12Pgmname ;
   private java.util.Date Z233TAM04_CRT_DATETIME ;
   private java.util.Date Z235TAM04_UPD_DATETIME ;
   private java.util.Date A233TAM04_CRT_DATETIME ;
   private java.util.Date A235TAM04_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n285TAM04_AUTH_NM ;
   private boolean n687TAM04_AUTH_LVL ;
   private boolean n215TAM04_DEL_FLG ;
   private boolean n233TAM04_CRT_DATETIME ;
   private boolean n266TAM04_CRT_USER_ID ;
   private boolean n234TAM04_CRT_PROG_NM ;
   private boolean n235TAM04_UPD_DATETIME ;
   private boolean n267TAM04_UPD_USER_ID ;
   private boolean n236TAM04_UPD_PROG_NM ;
   private boolean n286TAM04_UPD_CNT ;
   private boolean Gx_longc ;
   private boolean toggleJsOutput ;
   private String Z13TAM04_AUTH_CD ;
   private String Z266TAM04_CRT_USER_ID ;
   private String Z267TAM04_UPD_USER_ID ;
   private String Z285TAM04_AUTH_NM ;
   private String Z215TAM04_DEL_FLG ;
   private String Z234TAM04_CRT_PROG_NM ;
   private String Z236TAM04_UPD_PROG_NM ;
   private String A13TAM04_AUTH_CD ;
   private String A285TAM04_AUTH_NM ;
   private String A215TAM04_DEL_FLG ;
   private String A266TAM04_CRT_USER_ID ;
   private String A234TAM04_CRT_PROG_NM ;
   private String A267TAM04_UPD_USER_ID ;
   private String A236TAM04_UPD_PROG_NM ;
   private String AV11W_BC_FLG ;
   private String AV10W_TXT ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T00034_A13TAM04_AUTH_CD ;
   private java.util.Date[] T00034_A233TAM04_CRT_DATETIME ;
   private boolean[] T00034_n233TAM04_CRT_DATETIME ;
   private String[] T00034_A266TAM04_CRT_USER_ID ;
   private boolean[] T00034_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] T00034_A235TAM04_UPD_DATETIME ;
   private boolean[] T00034_n235TAM04_UPD_DATETIME ;
   private String[] T00034_A267TAM04_UPD_USER_ID ;
   private boolean[] T00034_n267TAM04_UPD_USER_ID ;
   private long[] T00034_A286TAM04_UPD_CNT ;
   private boolean[] T00034_n286TAM04_UPD_CNT ;
   private String[] T00034_A285TAM04_AUTH_NM ;
   private boolean[] T00034_n285TAM04_AUTH_NM ;
   private byte[] T00034_A687TAM04_AUTH_LVL ;
   private boolean[] T00034_n687TAM04_AUTH_LVL ;
   private String[] T00034_A215TAM04_DEL_FLG ;
   private boolean[] T00034_n215TAM04_DEL_FLG ;
   private String[] T00034_A234TAM04_CRT_PROG_NM ;
   private boolean[] T00034_n234TAM04_CRT_PROG_NM ;
   private String[] T00034_A236TAM04_UPD_PROG_NM ;
   private boolean[] T00034_n236TAM04_UPD_PROG_NM ;
   private String[] T00035_A13TAM04_AUTH_CD ;
   private String[] T00033_A13TAM04_AUTH_CD ;
   private java.util.Date[] T00033_A233TAM04_CRT_DATETIME ;
   private boolean[] T00033_n233TAM04_CRT_DATETIME ;
   private String[] T00033_A266TAM04_CRT_USER_ID ;
   private boolean[] T00033_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] T00033_A235TAM04_UPD_DATETIME ;
   private boolean[] T00033_n235TAM04_UPD_DATETIME ;
   private String[] T00033_A267TAM04_UPD_USER_ID ;
   private boolean[] T00033_n267TAM04_UPD_USER_ID ;
   private long[] T00033_A286TAM04_UPD_CNT ;
   private boolean[] T00033_n286TAM04_UPD_CNT ;
   private String[] T00033_A285TAM04_AUTH_NM ;
   private boolean[] T00033_n285TAM04_AUTH_NM ;
   private byte[] T00033_A687TAM04_AUTH_LVL ;
   private boolean[] T00033_n687TAM04_AUTH_LVL ;
   private String[] T00033_A215TAM04_DEL_FLG ;
   private boolean[] T00033_n215TAM04_DEL_FLG ;
   private String[] T00033_A234TAM04_CRT_PROG_NM ;
   private boolean[] T00033_n234TAM04_CRT_PROG_NM ;
   private String[] T00033_A236TAM04_UPD_PROG_NM ;
   private boolean[] T00033_n236TAM04_UPD_PROG_NM ;
   private String[] T00036_A13TAM04_AUTH_CD ;
   private String[] T00037_A13TAM04_AUTH_CD ;
   private String[] T00032_A13TAM04_AUTH_CD ;
   private java.util.Date[] T00032_A233TAM04_CRT_DATETIME ;
   private boolean[] T00032_n233TAM04_CRT_DATETIME ;
   private String[] T00032_A266TAM04_CRT_USER_ID ;
   private boolean[] T00032_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] T00032_A235TAM04_UPD_DATETIME ;
   private boolean[] T00032_n235TAM04_UPD_DATETIME ;
   private String[] T00032_A267TAM04_UPD_USER_ID ;
   private boolean[] T00032_n267TAM04_UPD_USER_ID ;
   private long[] T00032_A286TAM04_UPD_CNT ;
   private boolean[] T00032_n286TAM04_UPD_CNT ;
   private String[] T00032_A285TAM04_AUTH_NM ;
   private boolean[] T00032_n285TAM04_AUTH_NM ;
   private byte[] T00032_A687TAM04_AUTH_LVL ;
   private boolean[] T00032_n687TAM04_AUTH_LVL ;
   private String[] T00032_A215TAM04_DEL_FLG ;
   private boolean[] T00032_n215TAM04_DEL_FLG ;
   private String[] T00032_A234TAM04_CRT_PROG_NM ;
   private boolean[] T00032_n234TAM04_CRT_PROG_NM ;
   private String[] T00032_A236TAM04_UPD_PROG_NM ;
   private boolean[] T00032_n236TAM04_UPD_PROG_NM ;
   private String[] T000311_A55TAM07_USER_ID ;
   private String[] T000312_A50TBM07_AUTH_CD ;
   private String[] T000313_A13TAM04_AUTH_CD ;
   private String[] T000313_A12TAM03_APP_ID ;
   private String[] T000314_A13TAM04_AUTH_CD ;
}

final  class tam04_kngn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T00032", "SELECT `TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00033", "SELECT `TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00034", "SELECT TM1.`TAM04_AUTH_CD`, TM1.`TAM04_CRT_DATETIME`, TM1.`TAM04_CRT_USER_ID`, TM1.`TAM04_UPD_DATETIME`, TM1.`TAM04_UPD_USER_ID`, TM1.`TAM04_UPD_CNT`, TM1.`TAM04_AUTH_NM`, TM1.`TAM04_AUTH_LVL`, TM1.`TAM04_DEL_FLG`, TM1.`TAM04_CRT_PROG_NM`, TM1.`TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? ORDER BY TM1.`TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T00035", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T00036", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE ( `TAM04_AUTH_CD` > ?) ORDER BY `TAM04_AUTH_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T00037", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE ( `TAM04_AUTH_CD` < ?) ORDER BY `TAM04_AUTH_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T00038", "INSERT INTO `TAM04_KNGN`(`TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T00039", "UPDATE `TAM04_KNGN` SET `TAM04_CRT_DATETIME`=?, `TAM04_CRT_USER_ID`=?, `TAM04_UPD_DATETIME`=?, `TAM04_UPD_USER_ID`=?, `TAM04_UPD_CNT`=?, `TAM04_AUTH_NM`=?, `TAM04_AUTH_LVL`=?, `TAM04_DEL_FLG`=?, `TAM04_CRT_PROG_NM`=?, `TAM04_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000310", "DELETE FROM `TAM04_KNGN`  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000311", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE `TAM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000312", "SELECT `TBM07_AUTH_CD` FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000313", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000314", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` ORDER BY `TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
            case 10 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 11 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 12 :
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
                  stmt.setVarchar(7, (String)parms[12], 40);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(8, ((Number) parms[14]).byteValue());
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
                  stmt.setVarchar(10, (String)parms[18], 40);
               }
               if ( ((Boolean) parms[19]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(11, (String)parms[20], 40);
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
                  stmt.setVarchar(6, (String)parms[11], 40);
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(7, ((Number) parms[13]).byteValue());
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
                  stmt.setVarchar(9, (String)parms[17], 40);
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[19], 40);
               }
               stmt.setVarchar(11, (String)parms[20], 2, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 9 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 10 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
      }
   }

}

