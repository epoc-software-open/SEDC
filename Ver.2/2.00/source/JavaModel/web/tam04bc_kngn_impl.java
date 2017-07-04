/*
               File: tam04bc_kngn_impl
        Description: 権限パターンマスタ（ビジネスコンポーネント）
             Author: GeneXus Java Generator version 10_3_3-92797
       Generated on: July 3, 2017 17:14:7.13
       Program type: Callable routine
          Main DBMS: mysql
*/
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.distributed.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class tam04bc_kngn_impl extends GXWebPanel
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
         gx4asatam04_crt_user_id0C3( Gx_mode) ;
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
         gx6asatam04_upd_user_id0C3( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel11"+"_"+"TAM05_CRT_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx11asatam05_crt_user_id0C9( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxAggSel13"+"_"+"TAM05_UPD_USER_ID") == 0 )
      {
         Gx_mode = httpContext.GetNextPar( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gx13asatam05_upd_user_id0C9( Gx_mode) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxExecAct_"+"gxLoad_17") == 0 )
      {
         A12TAM03_APP_ID = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxload_17( A12TAM03_APP_ID) ;
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
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridtam04bc_kngn_tam05_appli") == 0 )
      {
         nRC_GXsfl_96 = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         nGXsfl_96_idx = (short)(GXutil.lval( httpContext.GetNextPar( ))) ;
         sGXsfl_96_idx = httpContext.GetNextPar( ) ;
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxnrgridtam04bc_kngn_tam05_appli_newrow( nRC_GXsfl_96, nGXsfl_96_idx, sGXsfl_96_idx) ;
         return  ;
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
         Form.getMeta().addItem("description", "権限パターンマスタ（ビジネスコンポーネント）", (short)(0)) ;
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

   public tam04bc_kngn_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public tam04bc_kngn_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tam04bc_kngn_impl.class ));
   }

   public tam04bc_kngn_impl( int remoteHandle ,
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
         wb_table1_2_0C3( true) ;
      }
      return  ;
   }

   public void wb_table1_2_0C3e( boolean wbgen )
   {
      if ( wbgen )
      {
         renderHtmlCloseForm0C3( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void wb_table1_2_0C3( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTablemain_Internalname, tblTablemain_Internalname, "", "TableBorder100x100", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_5_0C3( true) ;
      }
      return  ;
   }

   public void wb_table2_5_0C3e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Control Group */
         GxWebStd.gx_group_start( httpContext, grpGroupdata_Internalname, "権限パターンマスタ（ビジネスコンポーネント）", 1, 0, "px", 0, "px", "Group", "", "HLP_TAM04BC_KNGN.htm");
         wb_table3_28_0C3( true) ;
      }
      return  ;
   }

   public void wb_table3_28_0C3e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_2_0C3e( true) ;
      }
      else
      {
         wb_table1_2_0C3e( false) ;
      }
   }

   public void wb_table3_28_0C3( boolean wbgen )
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
         wb_table4_34_0C3( true) ;
      }
      return  ;
   }

   public void wb_table4_34_0C3e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         ClassString = "BtnEnter" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "実行", bttBtn_enter_Jsonclick, 5, "実行", "", StyleString, ClassString, bttBtn_enter_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM04BC_KNGN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         ClassString = "BtnCancel" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "終了", bttBtn_cancel_Jsonclick, 1, "終了", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM04BC_KNGN.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'',0)\"" ;
         ClassString = "BtnDelete" ;
         StyleString = "" ;
         GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "削除", bttBtn_delete_Jsonclick, 5, "削除", "", StyleString, ClassString, bttBtn_delete_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_28_0C3e( true) ;
      }
      else
      {
         wb_table3_28_0C3e( false) ;
      }
   }

   public void wb_table4_34_0C3( boolean wbgen )
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
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_auth_cd_Internalname, "権限パターン区分", "", "", lblTextblocktam04_auth_cd_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_AUTH_CD_Internalname, GXutil.rtrim( A13TAM04_AUTH_CD), GXutil.rtrim( localUtil.format( A13TAM04_AUTH_CD, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_AUTH_CD_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_AUTH_CD_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_AUTH_CD", "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_auth_nm_Internalname, "権限パターン名", "", "", lblTextblocktam04_auth_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_AUTH_NM_Internalname, GXutil.rtrim( A285TAM04_AUTH_NM), GXutil.rtrim( localUtil.format( A285TAM04_AUTH_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_AUTH_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_AUTH_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_auth_lvl_Internalname, "入力権限レベル", "", "", lblTextblocktam04_auth_lvl_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_AUTH_LVL_Internalname, GXutil.ltrim( localUtil.ntoc( A687TAM04_AUTH_LVL, (byte)(2), (byte)(0), ".", "")), ((edtTAM04_AUTH_LVL_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A687TAM04_AUTH_LVL), "Z9")) : localUtil.format( DecimalUtil.doubleToDec(A687TAM04_AUTH_LVL), "Z9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_AUTH_LVL_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_AUTH_LVL_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_del_flg_Internalname, "削除フラグ", "", "", lblTextblocktam04_del_flg_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_DEL_FLG_Internalname, GXutil.rtrim( A215TAM04_DEL_FLG), GXutil.rtrim( localUtil.format( A215TAM04_DEL_FLG, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_DEL_FLG_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_DEL_FLG_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_FLG", "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_crt_datetime_Internalname, "作成日時", "", "", lblTextblocktam04_crt_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAM04_CRT_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_CRT_DATETIME_Internalname, localUtil.format(A233TAM04_CRT_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A233TAM04_CRT_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_CRT_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_CRT_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM04BC_KNGN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM04_CRT_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAM04_CRT_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_crt_user_id_Internalname, "作成ユーザーID", "", "", lblTextblocktam04_crt_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_CRT_USER_ID_Internalname, GXutil.rtrim( A266TAM04_CRT_USER_ID), GXutil.rtrim( localUtil.format( A266TAM04_CRT_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_CRT_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_CRT_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_crt_prog_nm_Internalname, "作成プログラム名", "", "", lblTextblocktam04_crt_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_CRT_PROG_NM_Internalname, GXutil.rtrim( A234TAM04_CRT_PROG_NM), GXutil.rtrim( localUtil.format( A234TAM04_CRT_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_CRT_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_CRT_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_datetime_Internalname, "更新日時", "", "", lblTextblocktam04_upd_datetime_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtTAM04_UPD_DATETIME_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_DATETIME_Internalname, localUtil.format(A235TAM04_UPD_DATETIME, "9999/99/99 99:99:99"), localUtil.format( A235TAM04_UPD_DATETIME, "9999/99/99 99:99:99"), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_UPD_DATETIME_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_UPD_DATETIME_Enabled, 0, "text", "", 19, "chr", 1, "row", 19, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_Y4MD_HMS", "right", "HLP_TAM04BC_KNGN.htm");
         GxWebStd.gx_bitmap( httpContext, edtTAM04_UPD_DATETIME_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtTAM04_UPD_DATETIME_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         httpContext.writeTextNL( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_user_id_Internalname, "更新ユーザーID", "", "", lblTextblocktam04_upd_user_id_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_USER_ID_Internalname, GXutil.rtrim( A267TAM04_UPD_USER_ID), GXutil.rtrim( localUtil.format( A267TAM04_UPD_USER_ID, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_UPD_USER_ID_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_UPD_USER_ID_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_USER_ID", "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_prog_nm_Internalname, "更新プログラム名", "", "", lblTextblocktam04_upd_prog_nm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 84,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_PROG_NM_Internalname, GXutil.rtrim( A236TAM04_UPD_PROG_NM), GXutil.rtrim( localUtil.format( A236TAM04_UPD_PROG_NM, "")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(84);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_UPD_PROG_NM_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_UPD_PROG_NM_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "D_TS_PG_NM", "left", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"td5\"  style=\"vertical-align:top;width:40px\">") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTextblocktam04_upd_cnt_Internalname, "更新カウント", "", "", lblTextblocktam04_upd_cnt_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         GxWebStd.gx_single_line_edit( httpContext, edtTAM04_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A286TAM04_UPD_CNT, (byte)(10), (byte)(0), ".", "")), ((edtTAM04_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A286TAM04_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A286TAM04_UPD_CNT), "ZZZZZZZZZ9")), TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(89);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTAM04_UPD_CNT_Jsonclick, 0, "Attribute", "", "", "", 1, edtTAM04_UPD_CNT_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "D_NO", "right", "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td colspan=\"2\" >") ;
         httpContext.writeText( "<br>") ;
         wb_table5_92_0C3( true) ;
      }
      return  ;
   }

   public void wb_table5_92_0C3e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "<hr class=\"HRDefault\">") ;
         /*  Grid Control  */
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("GridName", "Gridtam04bc_kngn_tam05_appli");
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Class", "Grid");
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridtam04bc_kngn_tam05_appli_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("CmpContext", "");
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("InMasterPage", "false");
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A12TAM03_APP_ID));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM03_APP_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A288TAM05_KNGN_FLG));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_KNGN_FLG_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A289TAM05_DEL_FLG));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_DEL_FLG_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", localUtil.format(A290TAM05_CRT_DATETIME, "9999/99/99 99:99:99"));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_DATETIME_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A291TAM05_CRT_USER_ID));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_USER_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A292TAM05_CRT_PROG_NM));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", localUtil.format(A293TAM05_UPD_DATETIME, "9999/99/99 99:99:99"));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_DATETIME_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A294TAM05_UPD_USER_ID));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_USER_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.rtrim( A295TAM05_UPD_PROG_NM));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_CNT_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddColumnProperties(Gridtam04bc_kngn_tam05_appliColumn);
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridtam04bc_kngn_tam05_appli_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridtam04bc_kngn_tam05_appli_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridtam04bc_kngn_tam05_appli_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridtam04bc_kngn_tam05_appli_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridtam04bc_kngn_tam05_appli_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridtam04bc_kngn_tam05_appliContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridtam04bc_kngn_tam05_appli_Collapsed, (byte)(1), (byte)(0), ".", "")));
         nGXsfl_96_idx = (short)(0) ;
         if ( ( nKeyPressed == 1 ) && ( AnyError == 0 ) )
         {
            /* Enter key processing. */
            nBlankRcdCount9 = (short)(5) ;
            if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
            {
               /* Display confirmed (stored) records */
               nRcdExists_9 = (short)(1) ;
               scanStart0C9( ) ;
               while ( RcdFound9 != 0 )
               {
                  init_level_properties9( ) ;
                  getByPrimaryKey0C9( ) ;
                  addRow0C9( ) ;
                  scanNext0C9( ) ;
               }
               scanEnd0C9( ) ;
               nBlankRcdCount9 = (short)(5) ;
            }
         }
         else if ( ( nKeyPressed == 3 ) || ( nKeyPressed == 4 ) || ( ( nKeyPressed == 1 ) && ( AnyError != 0 ) ) )
         {
            /* Button check  or addlines. */
            B286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
            n286TAM04_UPD_CNT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
            standaloneNotModal0C9( ) ;
            standaloneModal0C9( ) ;
            sMode9 = Gx_mode ;
            while ( nGXsfl_96_idx < nRC_GXsfl_96 )
            {
               readRow0C9( ) ;
               edtTAM03_APP_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM03_APP_ID_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
               edtTAM05_KNGN_FLG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_KNGN_FLG_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
               edtTAM05_DEL_FLG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_DEL_FLG_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
               edtTAM05_CRT_DATETIME_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_DATETIME_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
               edtTAM05_CRT_USER_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_USER_ID_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
               edtTAM05_CRT_PROG_NM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_PROG_NM_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
               edtTAM05_UPD_DATETIME_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_DATETIME_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
               edtTAM05_UPD_USER_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_USER_ID_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
               edtTAM05_UPD_PROG_NM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_PROG_NM_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
               edtTAM05_UPD_CNT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_CNT_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
               if ( ( nRcdExists_9 == 0 ) && ( GXutil.strcmp(Gx_mode, "INS") != 0 ) )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  standaloneModal0C9( ) ;
               }
               sendRow0C9( ) ;
            }
            Gx_mode = sMode9 ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            A286TAM04_UPD_CNT = B286TAM04_UPD_CNT ;
            n286TAM04_UPD_CNT = false ;
            httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
         }
         else
         {
            /* Get or get-alike key processing. */
            nBlankRcdCount9 = (short)(5) ;
            nRcdExists_9 = (short)(1) ;
            if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
            {
               scanStart0C9( ) ;
               while ( RcdFound9 != 0 )
               {
                  init_level_properties9( ) ;
                  standaloneNotModal0C9( ) ;
                  getByPrimaryKey0C9( ) ;
                  standaloneModal0C9( ) ;
                  addRow0C9( ) ;
                  scanNext0C9( ) ;
               }
               scanEnd0C9( ) ;
            }
         }
         /* Initialize fields for 'new' records and send them. */
         sMode9 = Gx_mode ;
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         initAll0C9( ) ;
         init_level_properties9( ) ;
         B286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
         n286TAM04_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
         standaloneNotModal0C9( ) ;
         standaloneModal0C9( ) ;
         nRcdExists_9 = (short)(0) ;
         nIsMod_9 = (short)(0) ;
         nBlankRcdCount9 = (short)(nBlankRcdUsr9+nBlankRcdCount9) ;
         fRowAdded = 0 ;
         while ( nBlankRcdCount9 > 0 )
         {
            addRow0C9( ) ;
            if ( ( nKeyPressed == 4 ) && ( fRowAdded == 0 ) )
            {
               fRowAdded = 1 ;
               GX_FocusControl = edtTAM03_APP_ID_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            nBlankRcdCount9 = (short)(nBlankRcdCount9-1) ;
         }
         Gx_mode = sMode9 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         A286TAM04_UPD_CNT = B286TAM04_UPD_CNT ;
         n286TAM04_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
         sStyleString = " style=\"display:none;\"" ;
         sStyleString = "" ;
         httpContext.writeText( "<div id=\""+"Gridtam04bc_kngn_tam05_appliContainer"+"Div\" "+sStyleString+">"+"</div>") ;
         httpContext.ajax_rsp_assign_grid("_"+"Gridtam04bc_kngn_tam05_appli", Gridtam04bc_kngn_tam05_appliContainer);
         if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
         {
            GxWebStd.gx_hidden_field( httpContext, "Gridtam04bc_kngn_tam05_appliContainerData", Gridtam04bc_kngn_tam05_appliContainer.ToJavascriptSource());
         }
         if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
         {
            GxWebStd.gx_hidden_field( httpContext, "Gridtam04bc_kngn_tam05_appliContainerData"+"V", Gridtam04bc_kngn_tam05_appliContainer.GridValuesHidden());
         }
         else
         {
            httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridtam04bc_kngn_tam05_appliContainerData"+"V"+"\" value='"+Gridtam04bc_kngn_tam05_appliContainer.GridValuesHidden()+"'>") ;
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_34_0C3e( true) ;
      }
      else
      {
         wb_table4_34_0C3e( false) ;
      }
   }

   public void wb_table5_92_0C3( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         GxWebStd.gx_table_start( httpContext, tblTable3_Internalname, tblTable3_Internalname, "", "Table95", 0, "", "", 1, 2, sStyleString, "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class=\"SubTitle\" >") ;
         /* Text block */
         GxWebStd.gx_label_ctrl( httpContext, lblTitletam05_appli_Internalname, "TAM05_ APPLI", "", "", lblTitletam05_appli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "", 0, "", 1, 1, (short)(0), "HLP_TAM04BC_KNGN.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_92_0C3e( true) ;
      }
      else
      {
         wb_table5_92_0C3e( false) ;
      }
   }

   public void wb_table2_5_0C3( boolean wbgen )
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
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_Internalname, context.getHttpContext().getImagePath( "b9e06284-17ac-4c88-8937-5dbd84ad5d80", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_Visible, 1, "", "最初へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 10,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_first_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_first_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_first_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 11,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_Internalname, context.getHttpContext().getImagePath( "7d212604-db7b-4785-9c0d-5faffe71aa33", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_Visible, 1, "", "前へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 12,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_previous_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_previous_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_previous_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 13,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_Internalname, context.getHttpContext().getImagePath( "1ae947cf-1354-41a9-8d59-d91daebf554f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_Visible, 1, "", "次へ", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 14,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_next_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_next_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_next_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 15,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_Internalname, context.getHttpContext().getImagePath( "29211874-e613-48e5-9011-8017d984217e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_Visible, 1, "", "最後", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_last_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_last_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_last_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ELAST."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_Internalname, context.getHttpContext().getImagePath( "1ca03f75-9947-4d2c-90a4-e8ab9c5cedea", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_Visible, 1, "", "選択", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_select_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_select_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_select_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_Internalname, context.getHttpContext().getImagePath( "2061cf2c-bd33-4433-a13e-34af954142e9", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_Visible, imgBtn_enter2_Enabled, "", "実行", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_enter2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_enter2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_enter2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EENTER."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_Internalname, context.getHttpContext().getImagePath( "0e94ced8-bc34-47ff-9a53-bc683736a686", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_Visible, 1, "", "終了", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_cancel2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_cancel2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 1, imgBtn_cancel2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ImageHandCenter" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_Internalname, context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_Visible, imgBtn_delete2_Enabled, "", "削除", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ImageTop" ;
         StyleString = "" ;
         GxWebStd.gx_bitmap( httpContext, imgBtn_delete2_separator_Internalname, context.getHttpContext().getImagePath( "ea7811ba-4fa2-42da-8591-e6cb10669f1f", "", context.getHttpContext().getTheme( )), "", "", "", context.getHttpContext().getTheme( ), imgBtn_delete2_separator_Visible, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgBtn_delete2_separator_Jsonclick, "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", StyleString, ClassString, "", "", "", ""+TempTags, "", "", 1, false, false, "HLP_TAM04BC_KNGN.htm");
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
         wb_table2_5_0C3e( true) ;
      }
      else
      {
         wb_table2_5_0C3e( false) ;
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
      /* Execute user event: e110C2 */
      e110C2 ();
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
            nRC_GXsfl_96 = (short)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_96"), ".", ",")) ;
            AV12Pgmname = httpContext.cgiGet( "vPGMNAME") ;
            Gx_mode = httpContext.cgiGet( "vMODE") ;
            /* Read subfile selected row values. */
            /* Read hidden variables. */
            GXKey = context.getSiteKey( ) ;
            /* Check if conditions changed and reset current page numbers */
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
                     /* Execute user event: e110C2 */
                     e110C2 ();
                  }
                  else if ( GXutil.strcmp(sEvt, "AFTER TRN") == 0 )
                  {
                     httpContext.wbHandled = (byte)(1) ;
                     dynload_actions( ) ;
                     /* Execute user event: e120C2 */
                     e120C2 ();
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
                  sEvtType = GXutil.right( sEvt, 4) ;
                  sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
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
         /* Execute user event: e120C2 */
         e120C2 ();
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( ( GXutil.strcmp(Gx_mode, "INS") == 0 )  )
         {
            /* Clear variables for new insertion. */
            initAll0C3( ) ;
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
      disableAttributes0C3( ) ;
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

   public void confirm_0C9( )
   {
      nGXsfl_96_idx = (short)(0) ;
      while ( nGXsfl_96_idx < nRC_GXsfl_96 )
      {
         readRow0C9( ) ;
         if ( ( nRcdExists_9 != 0 ) || ( nIsMod_9 != 0 ) )
         {
            getKey0C9( ) ;
            if ( ( nRcdExists_9 == 0 ) && ( nRcdDeleted_9 == 0 ) )
            {
               if ( RcdFound9 == 0 )
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  beforeValidate0C9( ) ;
                  if ( AnyError == 0 )
                  {
                     checkExtendedTable0C9( ) ;
                     closeExtendedTableCursors0C9( ) ;
                     if ( AnyError == 0 )
                     {
                        IsConfirmed = (short)(1) ;
                        httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "TAM03_APP_ID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTAM03_APP_ID_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( RcdFound9 != 0 )
               {
                  if ( nRcdDeleted_9 != 0 )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     getByPrimaryKey0C9( ) ;
                     load0C9( ) ;
                     beforeValidate0C9( ) ;
                     if ( AnyError == 0 )
                     {
                        onDeleteControls0C9( ) ;
                     }
                  }
                  else
                  {
                     if ( nIsMod_9 != 0 )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        beforeValidate0C9( ) ;
                        if ( AnyError == 0 )
                        {
                           checkExtendedTable0C9( ) ;
                           closeExtendedTableCursors0C9( ) ;
                           if ( AnyError == 0 )
                           {
                              IsConfirmed = (short)(1) ;
                              httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrim( GXutil.str( IsConfirmed, 4, 0)));
                           }
                        }
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_9 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM03_APP_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTAM03_APP_ID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTAM03_APP_ID_Internalname, GXutil.rtrim( A12TAM03_APP_ID)) ;
         httpContext.changePostValue( edtTAM05_KNGN_FLG_Internalname, GXutil.rtrim( A288TAM05_KNGN_FLG)) ;
         httpContext.changePostValue( edtTAM05_DEL_FLG_Internalname, GXutil.rtrim( A289TAM05_DEL_FLG)) ;
         httpContext.changePostValue( edtTAM05_CRT_DATETIME_Internalname, localUtil.format(A290TAM05_CRT_DATETIME, "9999/99/99 99:99:99")) ;
         httpContext.changePostValue( edtTAM05_CRT_USER_ID_Internalname, GXutil.rtrim( A291TAM05_CRT_USER_ID)) ;
         httpContext.changePostValue( edtTAM05_CRT_PROG_NM_Internalname, GXutil.rtrim( A292TAM05_CRT_PROG_NM)) ;
         httpContext.changePostValue( edtTAM05_UPD_DATETIME_Internalname, localUtil.format(A293TAM05_UPD_DATETIME, "9999/99/99 99:99:99")) ;
         httpContext.changePostValue( edtTAM05_UPD_USER_ID_Internalname, GXutil.rtrim( A294TAM05_UPD_USER_ID)) ;
         httpContext.changePostValue( edtTAM05_UPD_PROG_NM_Internalname, GXutil.rtrim( A295TAM05_UPD_PROG_NM)) ;
         httpContext.changePostValue( edtTAM05_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12TAM03_APP_ID_"+sGXsfl_96_idx, GXutil.rtrim( Z12TAM03_APP_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z290TAM05_CRT_DATETIME_"+sGXsfl_96_idx, localUtil.ttoc( Z290TAM05_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z291TAM05_CRT_USER_ID_"+sGXsfl_96_idx, GXutil.rtrim( Z291TAM05_CRT_USER_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z293TAM05_UPD_DATETIME_"+sGXsfl_96_idx, localUtil.ttoc( Z293TAM05_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z294TAM05_UPD_USER_ID_"+sGXsfl_96_idx, GXutil.rtrim( Z294TAM05_UPD_USER_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z296TAM05_UPD_CNT_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z288TAM05_KNGN_FLG_"+sGXsfl_96_idx, GXutil.rtrim( Z288TAM05_KNGN_FLG)) ;
         httpContext.changePostValue( "ZT_"+"Z289TAM05_DEL_FLG_"+sGXsfl_96_idx, GXutil.rtrim( Z289TAM05_DEL_FLG)) ;
         httpContext.changePostValue( "ZT_"+"Z292TAM05_CRT_PROG_NM_"+sGXsfl_96_idx, GXutil.rtrim( Z292TAM05_CRT_PROG_NM)) ;
         httpContext.changePostValue( "ZT_"+"Z295TAM05_UPD_PROG_NM_"+sGXsfl_96_idx, GXutil.rtrim( Z295TAM05_UPD_PROG_NM)) ;
         httpContext.changePostValue( "T296TAM05_UPD_CNT_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_9_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_9, (byte)(4), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nRcdExists_9_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_9, (byte)(4), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nIsMod_9_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_9, (byte)(4), (byte)(0), ".", ""))) ;
         if ( nIsMod_9 != 0 )
         {
            httpContext.changePostValue( "TAM03_APP_ID_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM03_APP_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_KNGN_FLG_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_KNGN_FLG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_DEL_FLG_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_DEL_FLG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_DATETIME_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_DATETIME_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_USER_ID_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_USER_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_PROG_NM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_DATETIME_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_DATETIME_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_USER_ID_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_USER_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_PROG_NM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_CNT_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_CNT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
   }

   public void resetCaption0C0( )
   {
   }

   public void e110C2( )
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

   public void e120C2( )
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
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
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
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
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
      new tam04bc_pc01_datalog(remoteHandle, context).execute( AV12Pgmname, Gx_mode, A13TAM04_AUTH_CD) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
   }

   public void S112( )
   {
      /* 'SUB_ERROR' Routine */
      new a804_pc01_syslog(remoteHandle, context).execute( AV12Pgmname, "ERR", GXutil.trim( GXutil.str( context.globals.Gx_dbe, 10, 0))+":"+context.globals.Gx_dbt) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      GXKey = context.getSiteKey( ) ;
      GXEncryptionTmp = "a105_wp01_error"+GXutil.URLEncode(GXutil.rtrim("9")) ;
      httpContext.wjLoc = formatLink("a105_wp01_error") + "?" + com.genexus.util.Encryption.uriencrypt64( GXEncryptionTmp+com.genexus.util.Encryption.checksum( GXEncryptionTmp, 6), GXKey) ;
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void zm0C3( int GX_JID )
   {
      if ( ( GX_JID == 15 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z233TAM04_CRT_DATETIME = T000C6_A233TAM04_CRT_DATETIME[0] ;
            Z266TAM04_CRT_USER_ID = T000C6_A266TAM04_CRT_USER_ID[0] ;
            Z235TAM04_UPD_DATETIME = T000C6_A235TAM04_UPD_DATETIME[0] ;
            Z267TAM04_UPD_USER_ID = T000C6_A267TAM04_UPD_USER_ID[0] ;
            Z286TAM04_UPD_CNT = T000C6_A286TAM04_UPD_CNT[0] ;
            Z285TAM04_AUTH_NM = T000C6_A285TAM04_AUTH_NM[0] ;
            Z687TAM04_AUTH_LVL = T000C6_A687TAM04_AUTH_LVL[0] ;
            Z215TAM04_DEL_FLG = T000C6_A215TAM04_DEL_FLG[0] ;
            Z234TAM04_CRT_PROG_NM = T000C6_A234TAM04_CRT_PROG_NM[0] ;
            Z236TAM04_UPD_PROG_NM = T000C6_A236TAM04_UPD_PROG_NM[0] ;
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
      if ( GX_JID == -15 )
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

   public void load0C3( )
   {
      /* Using cursor T000C7 */
      pr_default.execute(5, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(5) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A233TAM04_CRT_DATETIME = T000C7_A233TAM04_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A233TAM04_CRT_DATETIME", localUtil.ttoc( A233TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n233TAM04_CRT_DATETIME = T000C7_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = T000C7_A266TAM04_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266TAM04_CRT_USER_ID", A266TAM04_CRT_USER_ID);
         n266TAM04_CRT_USER_ID = T000C7_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = T000C7_A235TAM04_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n235TAM04_UPD_DATETIME = T000C7_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = T000C7_A267TAM04_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A267TAM04_UPD_USER_ID", A267TAM04_UPD_USER_ID);
         n267TAM04_UPD_USER_ID = T000C7_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = T000C7_A286TAM04_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
         n286TAM04_UPD_CNT = T000C7_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = T000C7_A285TAM04_AUTH_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A285TAM04_AUTH_NM", A285TAM04_AUTH_NM);
         n285TAM04_AUTH_NM = T000C7_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = T000C7_A687TAM04_AUTH_LVL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A687TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A687TAM04_AUTH_LVL, 2, 0)));
         n687TAM04_AUTH_LVL = T000C7_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = T000C7_A215TAM04_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215TAM04_DEL_FLG", A215TAM04_DEL_FLG);
         n215TAM04_DEL_FLG = T000C7_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = T000C7_A234TAM04_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A234TAM04_CRT_PROG_NM", A234TAM04_CRT_PROG_NM);
         n234TAM04_CRT_PROG_NM = T000C7_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = T000C7_A236TAM04_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236TAM04_UPD_PROG_NM", A236TAM04_UPD_PROG_NM);
         n236TAM04_UPD_PROG_NM = T000C7_n236TAM04_UPD_PROG_NM[0] ;
         zm0C3( -15) ;
      }
      pr_default.close(5);
      onLoadActions0C3( ) ;
   }

   public void onLoadActions0C3( )
   {
      AV12Pgmname = "TAM04BC_KNGN" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
   }

   public void checkExtendedTable0C3( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
      AV12Pgmname = "TAM04BC_KNGN" ;
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

   public void closeExtendedTableCursors0C3( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey0C3( )
   {
      /* Using cursor T000C8 */
      pr_default.execute(6, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(6) != 101) )
      {
         RcdFound3 = (short)(1) ;
      }
      else
      {
         RcdFound3 = (short)(0) ;
      }
      pr_default.close(6);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T000C6 */
      pr_default.execute(4, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(4) != 101) )
      {
         zm0C3( 15) ;
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = T000C6_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
         A233TAM04_CRT_DATETIME = T000C6_A233TAM04_CRT_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A233TAM04_CRT_DATETIME", localUtil.ttoc( A233TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n233TAM04_CRT_DATETIME = T000C6_n233TAM04_CRT_DATETIME[0] ;
         A266TAM04_CRT_USER_ID = T000C6_A266TAM04_CRT_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A266TAM04_CRT_USER_ID", A266TAM04_CRT_USER_ID);
         n266TAM04_CRT_USER_ID = T000C6_n266TAM04_CRT_USER_ID[0] ;
         A235TAM04_UPD_DATETIME = T000C6_A235TAM04_UPD_DATETIME[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
         n235TAM04_UPD_DATETIME = T000C6_n235TAM04_UPD_DATETIME[0] ;
         A267TAM04_UPD_USER_ID = T000C6_A267TAM04_UPD_USER_ID[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A267TAM04_UPD_USER_ID", A267TAM04_UPD_USER_ID);
         n267TAM04_UPD_USER_ID = T000C6_n267TAM04_UPD_USER_ID[0] ;
         A286TAM04_UPD_CNT = T000C6_A286TAM04_UPD_CNT[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
         n286TAM04_UPD_CNT = T000C6_n286TAM04_UPD_CNT[0] ;
         A285TAM04_AUTH_NM = T000C6_A285TAM04_AUTH_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A285TAM04_AUTH_NM", A285TAM04_AUTH_NM);
         n285TAM04_AUTH_NM = T000C6_n285TAM04_AUTH_NM[0] ;
         A687TAM04_AUTH_LVL = T000C6_A687TAM04_AUTH_LVL[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A687TAM04_AUTH_LVL", GXutil.ltrim( GXutil.str( A687TAM04_AUTH_LVL, 2, 0)));
         n687TAM04_AUTH_LVL = T000C6_n687TAM04_AUTH_LVL[0] ;
         A215TAM04_DEL_FLG = T000C6_A215TAM04_DEL_FLG[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A215TAM04_DEL_FLG", A215TAM04_DEL_FLG);
         n215TAM04_DEL_FLG = T000C6_n215TAM04_DEL_FLG[0] ;
         A234TAM04_CRT_PROG_NM = T000C6_A234TAM04_CRT_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A234TAM04_CRT_PROG_NM", A234TAM04_CRT_PROG_NM);
         n234TAM04_CRT_PROG_NM = T000C6_n234TAM04_CRT_PROG_NM[0] ;
         A236TAM04_UPD_PROG_NM = T000C6_A236TAM04_UPD_PROG_NM[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A236TAM04_UPD_PROG_NM", A236TAM04_UPD_PROG_NM);
         n236TAM04_UPD_PROG_NM = T000C6_n236TAM04_UPD_PROG_NM[0] ;
         O286TAM04_UPD_CNT = A286TAM04_UPD_CNT ;
         n286TAM04_UPD_CNT = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load0C3( ) ;
         if ( AnyError == 1 )
         {
            RcdFound3 = (short)(0) ;
            initializeNonKey0C3( ) ;
         }
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound3 = (short)(0) ;
         initializeNonKey0C3( ) ;
         sMode3 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode3 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_default.close(4);
   }

   public void getEqualNoModal( )
   {
      getKey0C3( ) ;
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
      /* Using cursor T000C9 */
      pr_default.execute(7, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(7) != 101) )
      {
         while ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000C9_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) < 0 ) ) )
         {
            pr_default.readNext(7);
         }
         if ( (pr_default.getStatus(7) != 101) && ( ( GXutil.strcmp(T000C9_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) > 0 ) ) )
         {
            A13TAM04_AUTH_CD = T000C9_A13TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(7);
   }

   public void move_previous( )
   {
      RcdFound3 = (short)(0) ;
      /* Using cursor T000C10 */
      pr_default.execute(8, new Object[] {A13TAM04_AUTH_CD});
      if ( (pr_default.getStatus(8) != 101) )
      {
         while ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T000C10_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) > 0 ) ) )
         {
            pr_default.readNext(8);
         }
         if ( (pr_default.getStatus(8) != 101) && ( ( GXutil.strcmp(T000C10_A13TAM04_AUTH_CD[0], A13TAM04_AUTH_CD) < 0 ) ) )
         {
            A13TAM04_AUTH_CD = T000C10_A13TAM04_AUTH_CD[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
            RcdFound3 = (short)(1) ;
         }
      }
      pr_default.close(8);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey0C3( ) ;
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         /* Insert record */
         GX_FocusControl = edtTAM04_AUTH_CD_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert0C3( ) ;
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
               update0C3( ) ;
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
               insert0C3( ) ;
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
                  insert0C3( ) ;
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
      scanStart0C3( ) ;
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
      scanEnd0C3( ) ;
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
      scanStart0C3( ) ;
      if ( RcdFound3 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound3 != 0 )
         {
            scanNext0C3( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTAM04_AUTH_NM_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd0C3( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency0C3( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000C5 */
         pr_default.execute(3, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(3) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM04_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(3) == 101) || !( Z233TAM04_CRT_DATETIME.equals( T000C5_A233TAM04_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z266TAM04_CRT_USER_ID, T000C5_A266TAM04_CRT_USER_ID[0]) != 0 ) || !( Z235TAM04_UPD_DATETIME.equals( T000C5_A235TAM04_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z267TAM04_UPD_USER_ID, T000C5_A267TAM04_UPD_USER_ID[0]) != 0 ) || ( Z286TAM04_UPD_CNT != T000C5_A286TAM04_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z285TAM04_AUTH_NM, T000C5_A285TAM04_AUTH_NM[0]) != 0 ) || ( Z687TAM04_AUTH_LVL != T000C5_A687TAM04_AUTH_LVL[0] ) || ( GXutil.strcmp(Z215TAM04_DEL_FLG, T000C5_A215TAM04_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z234TAM04_CRT_PROG_NM, T000C5_A234TAM04_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z236TAM04_UPD_PROG_NM, T000C5_A236TAM04_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM04_KNGN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0C3( )
   {
      beforeValidate0C3( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C3( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0C3( 0) ;
         checkOptimisticConcurrency0C3( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C3( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0C3( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C11 */
                  pr_default.execute(9, new Object[] {A13TAM04_AUTH_CD, new Boolean(n233TAM04_CRT_DATETIME), A233TAM04_CRT_DATETIME, new Boolean(n266TAM04_CRT_USER_ID), A266TAM04_CRT_USER_ID, new Boolean(n235TAM04_UPD_DATETIME), A235TAM04_UPD_DATETIME, new Boolean(n267TAM04_UPD_USER_ID), A267TAM04_UPD_USER_ID, new Boolean(n286TAM04_UPD_CNT), new Long(A286TAM04_UPD_CNT), new Boolean(n285TAM04_AUTH_NM), A285TAM04_AUTH_NM, new Boolean(n687TAM04_AUTH_LVL), new Byte(A687TAM04_AUTH_LVL), new Boolean(n215TAM04_DEL_FLG), A215TAM04_DEL_FLG, new Boolean(n234TAM04_CRT_PROG_NM), A234TAM04_CRT_PROG_NM, new Boolean(n236TAM04_UPD_PROG_NM), A236TAM04_UPD_PROG_NM});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM04_KNGN") ;
                  if ( (pr_default.getStatus(9) == 1) )
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
                        processLevel0C3( ) ;
                        if ( AnyError == 0 )
                        {
                           /* Save values for previous() function. */
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucadded"), 0, "", true);
                           resetCaption0C0( ) ;
                        }
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
            load0C3( ) ;
         }
         endLevel0C3( ) ;
      }
      closeExtendedTableCursors0C3( ) ;
   }

   public void update0C3( )
   {
      beforeValidate0C3( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C3( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C3( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C3( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0C3( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C12 */
                  pr_default.execute(10, new Object[] {new Boolean(n233TAM04_CRT_DATETIME), A233TAM04_CRT_DATETIME, new Boolean(n266TAM04_CRT_USER_ID), A266TAM04_CRT_USER_ID, new Boolean(n235TAM04_UPD_DATETIME), A235TAM04_UPD_DATETIME, new Boolean(n267TAM04_UPD_USER_ID), A267TAM04_UPD_USER_ID, new Boolean(n286TAM04_UPD_CNT), new Long(A286TAM04_UPD_CNT), new Boolean(n285TAM04_AUTH_NM), A285TAM04_AUTH_NM, new Boolean(n687TAM04_AUTH_LVL), new Byte(A687TAM04_AUTH_LVL), new Boolean(n215TAM04_DEL_FLG), A215TAM04_DEL_FLG, new Boolean(n234TAM04_CRT_PROG_NM), A234TAM04_CRT_PROG_NM, new Boolean(n236TAM04_UPD_PROG_NM), A236TAM04_UPD_PROG_NM, A13TAM04_AUTH_CD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM04_KNGN") ;
                  if ( (pr_default.getStatus(10) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM04_KNGN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0C3( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        processLevel0C3( ) ;
                        if ( AnyError == 0 )
                        {
                           getByPrimaryKey( ) ;
                           httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_sucupdated"), 0, "", true);
                           resetCaption0C0( ) ;
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
         }
         endLevel0C3( ) ;
      }
      closeExtendedTableCursors0C3( ) ;
   }

   public void deferredUpdate0C3( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0C3( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C3( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0C3( ) ;
         afterConfirm0C3( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0C3( ) ;
            if ( AnyError == 0 )
            {
               scanStart0C9( ) ;
               while ( RcdFound9 != 0 )
               {
                  getByPrimaryKey0C9( ) ;
                  delete0C9( ) ;
                  scanNext0C9( ) ;
               }
               scanEnd0C9( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C13 */
                  pr_default.execute(11, new Object[] {A13TAM04_AUTH_CD});
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
                           initAll0C3( ) ;
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
                        resetCaption0C0( ) ;
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
      }
      sMode3 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel0C3( ) ;
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0C3( )
   {
      standaloneModal( ) ;
      if ( AnyError == 0 )
      {
         /* Delete mode formulas */
         AV12Pgmname = "TAM04BC_KNGN" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Pgmname", AV12Pgmname);
      }
      if ( AnyError == 0 )
      {
         /* Using cursor T000C14 */
         pr_default.execute(12, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(12) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"ユーザーマスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(12);
         /* Using cursor T000C15 */
         pr_default.execute(13, new Object[] {A13TAM04_AUTH_CD});
         if ( (pr_default.getStatus(13) != 101) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_del", new Object[] {"権限別振舞マスタ"}), "CannotDeleteReferencedRecord", 1, "");
            AnyError = (short)(1) ;
         }
         pr_default.close(13);
      }
   }

   public void processNestedLevel0C9( )
   {
      nGXsfl_96_idx = (short)(0) ;
      while ( nGXsfl_96_idx < nRC_GXsfl_96 )
      {
         readRow0C9( ) ;
         if ( ( nRcdExists_9 != 0 ) || ( nIsMod_9 != 0 ) )
         {
            standaloneNotModal0C9( ) ;
            getKey0C9( ) ;
            if ( ( nRcdExists_9 == 0 ) && ( nRcdDeleted_9 == 0 ) )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               insert0C9( ) ;
            }
            else
            {
               if ( RcdFound9 != 0 )
               {
                  if ( ( nRcdDeleted_9 != 0 ) && ( nRcdExists_9 != 0 ) )
                  {
                     Gx_mode = "DLT" ;
                     httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     delete0C9( ) ;
                  }
                  else
                  {
                     if ( ( nIsMod_9 != 0 ) && ( nRcdExists_9 != 0 ) )
                     {
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                        update0C9( ) ;
                     }
                  }
               }
               else
               {
                  if ( nRcdDeleted_9 == 0 )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TAM03_APP_ID");
                     AnyError = (short)(1) ;
                     GX_FocusControl = edtTAM03_APP_ID_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
         httpContext.changePostValue( edtTAM03_APP_ID_Internalname, GXutil.rtrim( A12TAM03_APP_ID)) ;
         httpContext.changePostValue( edtTAM05_KNGN_FLG_Internalname, GXutil.rtrim( A288TAM05_KNGN_FLG)) ;
         httpContext.changePostValue( edtTAM05_DEL_FLG_Internalname, GXutil.rtrim( A289TAM05_DEL_FLG)) ;
         httpContext.changePostValue( edtTAM05_CRT_DATETIME_Internalname, localUtil.format(A290TAM05_CRT_DATETIME, "9999/99/99 99:99:99")) ;
         httpContext.changePostValue( edtTAM05_CRT_USER_ID_Internalname, GXutil.rtrim( A291TAM05_CRT_USER_ID)) ;
         httpContext.changePostValue( edtTAM05_CRT_PROG_NM_Internalname, GXutil.rtrim( A292TAM05_CRT_PROG_NM)) ;
         httpContext.changePostValue( edtTAM05_UPD_DATETIME_Internalname, localUtil.format(A293TAM05_UPD_DATETIME, "9999/99/99 99:99:99")) ;
         httpContext.changePostValue( edtTAM05_UPD_USER_ID_Internalname, GXutil.rtrim( A294TAM05_UPD_USER_ID)) ;
         httpContext.changePostValue( edtTAM05_UPD_PROG_NM_Internalname, GXutil.rtrim( A295TAM05_UPD_PROG_NM)) ;
         httpContext.changePostValue( edtTAM05_UPD_CNT_Internalname, GXutil.ltrim( localUtil.ntoc( A296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z12TAM03_APP_ID_"+sGXsfl_96_idx, GXutil.rtrim( Z12TAM03_APP_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z290TAM05_CRT_DATETIME_"+sGXsfl_96_idx, localUtil.ttoc( Z290TAM05_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z291TAM05_CRT_USER_ID_"+sGXsfl_96_idx, GXutil.rtrim( Z291TAM05_CRT_USER_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z293TAM05_UPD_DATETIME_"+sGXsfl_96_idx, localUtil.ttoc( Z293TAM05_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " ")) ;
         httpContext.changePostValue( "ZT_"+"Z294TAM05_UPD_USER_ID_"+sGXsfl_96_idx, GXutil.rtrim( Z294TAM05_UPD_USER_ID)) ;
         httpContext.changePostValue( "ZT_"+"Z296TAM05_UPD_CNT_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( Z296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "ZT_"+"Z288TAM05_KNGN_FLG_"+sGXsfl_96_idx, GXutil.rtrim( Z288TAM05_KNGN_FLG)) ;
         httpContext.changePostValue( "ZT_"+"Z289TAM05_DEL_FLG_"+sGXsfl_96_idx, GXutil.rtrim( Z289TAM05_DEL_FLG)) ;
         httpContext.changePostValue( "ZT_"+"Z292TAM05_CRT_PROG_NM_"+sGXsfl_96_idx, GXutil.rtrim( Z292TAM05_CRT_PROG_NM)) ;
         httpContext.changePostValue( "ZT_"+"Z295TAM05_UPD_PROG_NM_"+sGXsfl_96_idx, GXutil.rtrim( Z295TAM05_UPD_PROG_NM)) ;
         httpContext.changePostValue( "T296TAM05_UPD_CNT_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( O296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nRcdDeleted_9_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_9, (byte)(4), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nRcdExists_9_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nRcdExists_9, (byte)(4), (byte)(0), ".", ""))) ;
         httpContext.changePostValue( "nIsMod_9_"+sGXsfl_96_idx, GXutil.ltrim( localUtil.ntoc( nIsMod_9, (byte)(4), (byte)(0), ".", ""))) ;
         if ( nIsMod_9 != 0 )
         {
            httpContext.changePostValue( "TAM03_APP_ID_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM03_APP_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_KNGN_FLG_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_KNGN_FLG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_DEL_FLG_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_DEL_FLG_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_DATETIME_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_DATETIME_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_USER_ID_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_USER_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_CRT_PROG_NM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_DATETIME_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_DATETIME_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_USER_ID_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_USER_ID_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_PROG_NM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
            httpContext.changePostValue( "TAM05_UPD_CNT_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_CNT_Enabled, (byte)(5), (byte)(0), ".", ""))) ;
         }
      }
      /* Start of After( level) rules */
      /* End of After( level) rules */
      initAll0C9( ) ;
      if ( AnyError != 0 )
      {
      }
      nRcdExists_9 = (short)(0) ;
      nIsMod_9 = (short)(0) ;
      nRcdDeleted_9 = (short)(0) ;
   }

   public void processLevel0C3( )
   {
      /* Save parent mode. */
      sMode3 = Gx_mode ;
      processNestedLevel0C9( ) ;
      if ( AnyError != 0 )
      {
      }
      /* Restore parent mode. */
      Gx_mode = sMode3 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      /* ' Update level parameters */
   }

   public void endLevel0C3( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(3);
      }
      if ( AnyError == 0 )
      {
         beforeComplete0C3( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commit(context, remoteHandle, "DEFAULT", "tam04bc_kngn");
         if ( AnyError == 0 )
         {
            confirmValues0C0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollback(context, remoteHandle, "DEFAULT", "tam04bc_kngn");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0C3( )
   {
      /* Scan By routine */
      /* Using cursor T000C16 */
      pr_default.execute(14);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = T000C16_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0C3( )
   {
      /* Scan next routine */
      pr_default.readNext(14);
      RcdFound3 = (short)(0) ;
      if ( (pr_default.getStatus(14) != 101) )
      {
         RcdFound3 = (short)(1) ;
         A13TAM04_AUTH_CD = T000C16_A13TAM04_AUTH_CD[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
      }
   }

   public void scanEnd0C3( )
   {
      pr_default.close(14);
   }

   public void afterConfirm0C3( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C3( )
   {
      /* Before Insert Rules */
      A233TAM04_CRT_DATETIME = GXutil.now( ) ;
      n233TAM04_CRT_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A233TAM04_CRT_DATETIME", localUtil.ttoc( A233TAM04_CRT_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A266TAM04_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A266TAM04_CRT_USER_ID = GXt_char1 ;
      n266TAM04_CRT_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A266TAM04_CRT_USER_ID", A266TAM04_CRT_USER_ID);
      A235TAM04_UPD_DATETIME = GXutil.now( ) ;
      n235TAM04_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A267TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A267TAM04_UPD_USER_ID = GXt_char1 ;
      n267TAM04_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A267TAM04_UPD_USER_ID", A267TAM04_UPD_USER_ID);
      A286TAM04_UPD_CNT = (long)(O286TAM04_UPD_CNT+1) ;
      n286TAM04_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
   }

   public void beforeUpdate0C3( )
   {
      /* Before Update Rules */
      A235TAM04_UPD_DATETIME = GXutil.now( ) ;
      n235TAM04_UPD_DATETIME = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A235TAM04_UPD_DATETIME", localUtil.ttoc( A235TAM04_UPD_DATETIME, 10, 8, 0, 1, "/", ":", " "));
      GXt_char1 = A267TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A267TAM04_UPD_USER_ID = GXt_char1 ;
      n267TAM04_UPD_USER_ID = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A267TAM04_UPD_USER_ID", A267TAM04_UPD_USER_ID);
      A286TAM04_UPD_CNT = (long)(O286TAM04_UPD_CNT+1) ;
      n286TAM04_UPD_CNT = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A286TAM04_UPD_CNT", GXutil.ltrim( GXutil.str( A286TAM04_UPD_CNT, 10, 0)));
   }

   public void beforeDelete0C3( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0C3( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0C3( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0C3( )
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

   public void zm0C9( int GX_JID )
   {
      if ( ( GX_JID == 16 ) || ( GX_JID == 0 ) )
      {
         if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
         {
            Z290TAM05_CRT_DATETIME = T000C3_A290TAM05_CRT_DATETIME[0] ;
            Z291TAM05_CRT_USER_ID = T000C3_A291TAM05_CRT_USER_ID[0] ;
            Z293TAM05_UPD_DATETIME = T000C3_A293TAM05_UPD_DATETIME[0] ;
            Z294TAM05_UPD_USER_ID = T000C3_A294TAM05_UPD_USER_ID[0] ;
            Z296TAM05_UPD_CNT = T000C3_A296TAM05_UPD_CNT[0] ;
            Z288TAM05_KNGN_FLG = T000C3_A288TAM05_KNGN_FLG[0] ;
            Z289TAM05_DEL_FLG = T000C3_A289TAM05_DEL_FLG[0] ;
            Z292TAM05_CRT_PROG_NM = T000C3_A292TAM05_CRT_PROG_NM[0] ;
            Z295TAM05_UPD_PROG_NM = T000C3_A295TAM05_UPD_PROG_NM[0] ;
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
      if ( GX_JID == -16 )
      {
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z290TAM05_CRT_DATETIME = A290TAM05_CRT_DATETIME ;
         Z291TAM05_CRT_USER_ID = A291TAM05_CRT_USER_ID ;
         Z293TAM05_UPD_DATETIME = A293TAM05_UPD_DATETIME ;
         Z294TAM05_UPD_USER_ID = A294TAM05_UPD_USER_ID ;
         Z296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
         Z288TAM05_KNGN_FLG = A288TAM05_KNGN_FLG ;
         Z289TAM05_DEL_FLG = A289TAM05_DEL_FLG ;
         Z292TAM05_CRT_PROG_NM = A292TAM05_CRT_PROG_NM ;
         Z295TAM05_UPD_PROG_NM = A295TAM05_UPD_PROG_NM ;
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
      }
   }

   public void standaloneNotModal0C9( )
   {
   }

   public void standaloneModal0C9( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         edtTAM03_APP_ID_Enabled = 0 ;
      }
      else
      {
         edtTAM03_APP_ID_Enabled = 1 ;
      }
   }

   public void load0C9( )
   {
      /* Using cursor T000C17 */
      pr_default.execute(15, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(15) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A290TAM05_CRT_DATETIME = T000C17_A290TAM05_CRT_DATETIME[0] ;
         n290TAM05_CRT_DATETIME = T000C17_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = T000C17_A291TAM05_CRT_USER_ID[0] ;
         n291TAM05_CRT_USER_ID = T000C17_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = T000C17_A293TAM05_UPD_DATETIME[0] ;
         n293TAM05_UPD_DATETIME = T000C17_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = T000C17_A294TAM05_UPD_USER_ID[0] ;
         n294TAM05_UPD_USER_ID = T000C17_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = T000C17_A296TAM05_UPD_CNT[0] ;
         n296TAM05_UPD_CNT = T000C17_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = T000C17_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = T000C17_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = T000C17_A289TAM05_DEL_FLG[0] ;
         n289TAM05_DEL_FLG = T000C17_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = T000C17_A292TAM05_CRT_PROG_NM[0] ;
         n292TAM05_CRT_PROG_NM = T000C17_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = T000C17_A295TAM05_UPD_PROG_NM[0] ;
         n295TAM05_UPD_PROG_NM = T000C17_n295TAM05_UPD_PROG_NM[0] ;
         zm0C9( -16) ;
      }
      pr_default.close(15);
      onLoadActions0C9( ) ;
   }

   public void onLoadActions0C9( )
   {
   }

   public void checkExtendedTable0C9( )
   {
      Gx_BScreen = (byte)(1) ;
      standaloneModal0C9( ) ;
      /* Using cursor T000C4 */
      pr_default.execute(2, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem("'アプリケーションマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      pr_default.close(2);
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

   public void closeExtendedTableCursors0C9( )
   {
   }

   public void enableDisable0C9( )
   {
   }

   public void gxload_17( String A12TAM03_APP_ID )
   {
      /* Using cursor T000C4 */
      pr_default.execute(2, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(2) == 101) )
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
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_webresponse.addString(",");
         httpContext.GX_webresponse.addString("101");
      }
      httpContext.GX_webresponse.addString(")");
      pr_default.close(2);
   }

   public void getKey0C9( )
   {
      /* Using cursor T000C18 */
      pr_default.execute(16, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(16) != 101) )
      {
         RcdFound9 = (short)(1) ;
      }
      else
      {
         RcdFound9 = (short)(0) ;
      }
      pr_default.close(16);
   }

   public void getByPrimaryKey0C9( )
   {
      /* Using cursor T000C3 */
      pr_default.execute(1, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
      if ( (pr_default.getStatus(1) != 101) )
      {
         zm0C9( 16) ;
         RcdFound9 = (short)(1) ;
         initializeNonKey0C9( ) ;
         A290TAM05_CRT_DATETIME = T000C3_A290TAM05_CRT_DATETIME[0] ;
         n290TAM05_CRT_DATETIME = T000C3_n290TAM05_CRT_DATETIME[0] ;
         A291TAM05_CRT_USER_ID = T000C3_A291TAM05_CRT_USER_ID[0] ;
         n291TAM05_CRT_USER_ID = T000C3_n291TAM05_CRT_USER_ID[0] ;
         A293TAM05_UPD_DATETIME = T000C3_A293TAM05_UPD_DATETIME[0] ;
         n293TAM05_UPD_DATETIME = T000C3_n293TAM05_UPD_DATETIME[0] ;
         A294TAM05_UPD_USER_ID = T000C3_A294TAM05_UPD_USER_ID[0] ;
         n294TAM05_UPD_USER_ID = T000C3_n294TAM05_UPD_USER_ID[0] ;
         A296TAM05_UPD_CNT = T000C3_A296TAM05_UPD_CNT[0] ;
         n296TAM05_UPD_CNT = T000C3_n296TAM05_UPD_CNT[0] ;
         A288TAM05_KNGN_FLG = T000C3_A288TAM05_KNGN_FLG[0] ;
         n288TAM05_KNGN_FLG = T000C3_n288TAM05_KNGN_FLG[0] ;
         A289TAM05_DEL_FLG = T000C3_A289TAM05_DEL_FLG[0] ;
         n289TAM05_DEL_FLG = T000C3_n289TAM05_DEL_FLG[0] ;
         A292TAM05_CRT_PROG_NM = T000C3_A292TAM05_CRT_PROG_NM[0] ;
         n292TAM05_CRT_PROG_NM = T000C3_n292TAM05_CRT_PROG_NM[0] ;
         A295TAM05_UPD_PROG_NM = T000C3_A295TAM05_UPD_PROG_NM[0] ;
         n295TAM05_UPD_PROG_NM = T000C3_n295TAM05_UPD_PROG_NM[0] ;
         A12TAM03_APP_ID = T000C3_A12TAM03_APP_ID[0] ;
         O296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
         n296TAM05_UPD_CNT = false ;
         Z13TAM04_AUTH_CD = A13TAM04_AUTH_CD ;
         Z12TAM03_APP_ID = A12TAM03_APP_ID ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0C9( ) ;
         load0C9( ) ;
         Gx_mode = sMode9 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound9 = (short)(0) ;
         initializeNonKey0C9( ) ;
         sMode9 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal0C9( ) ;
         Gx_mode = sMode9 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      if ( ( GXutil.strcmp(Gx_mode, "DSP") == 0 ) || ( GXutil.strcmp(Gx_mode, "DLT") == 0 ) )
      {
         disableAttributes0C9( ) ;
      }
      pr_default.close(1);
   }

   public void checkOptimisticConcurrency0C9( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         /* Using cursor T000C2 */
         pr_default.execute(0, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
         if ( (pr_default.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM05_APPLI_KNGN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         Gx_longc = false ;
         if ( (pr_default.getStatus(0) == 101) || !( Z290TAM05_CRT_DATETIME.equals( T000C2_A290TAM05_CRT_DATETIME[0] ) ) || ( GXutil.strcmp(Z291TAM05_CRT_USER_ID, T000C2_A291TAM05_CRT_USER_ID[0]) != 0 ) || !( Z293TAM05_UPD_DATETIME.equals( T000C2_A293TAM05_UPD_DATETIME[0] ) ) || ( GXutil.strcmp(Z294TAM05_UPD_USER_ID, T000C2_A294TAM05_UPD_USER_ID[0]) != 0 ) || ( Z296TAM05_UPD_CNT != T000C2_A296TAM05_UPD_CNT[0] ) )
         {
            Gx_longc = true ;
         }
         if ( Gx_longc || ( GXutil.strcmp(Z288TAM05_KNGN_FLG, T000C2_A288TAM05_KNGN_FLG[0]) != 0 ) || ( GXutil.strcmp(Z289TAM05_DEL_FLG, T000C2_A289TAM05_DEL_FLG[0]) != 0 ) || ( GXutil.strcmp(Z292TAM05_CRT_PROG_NM, T000C2_A292TAM05_CRT_PROG_NM[0]) != 0 ) || ( GXutil.strcmp(Z295TAM05_UPD_PROG_NM, T000C2_A295TAM05_UPD_PROG_NM[0]) != 0 ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TAM05_APPLI_KNGN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert0C9( )
   {
      beforeValidate0C9( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C9( ) ;
      }
      if ( AnyError == 0 )
      {
         zm0C9( 0) ;
         checkOptimisticConcurrency0C9( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C9( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert0C9( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C19 */
                  pr_default.execute(17, new Object[] {A13TAM04_AUTH_CD, new Boolean(n290TAM05_CRT_DATETIME), A290TAM05_CRT_DATETIME, new Boolean(n291TAM05_CRT_USER_ID), A291TAM05_CRT_USER_ID, new Boolean(n293TAM05_UPD_DATETIME), A293TAM05_UPD_DATETIME, new Boolean(n294TAM05_UPD_USER_ID), A294TAM05_UPD_USER_ID, new Boolean(n296TAM05_UPD_CNT), new Long(A296TAM05_UPD_CNT), new Boolean(n288TAM05_KNGN_FLG), A288TAM05_KNGN_FLG, new Boolean(n289TAM05_DEL_FLG), A289TAM05_DEL_FLG, new Boolean(n292TAM05_CRT_PROG_NM), A292TAM05_CRT_PROG_NM, new Boolean(n295TAM05_UPD_PROG_NM), A295TAM05_UPD_PROG_NM, A12TAM03_APP_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
                  if ( (pr_default.getStatus(17) == 1) )
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
            load0C9( ) ;
         }
         endLevel0C9( ) ;
      }
      closeExtendedTableCursors0C9( ) ;
   }

   public void update0C9( )
   {
      beforeValidate0C9( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable0C9( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C9( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm0C9( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate0C9( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T000C20 */
                  pr_default.execute(18, new Object[] {new Boolean(n290TAM05_CRT_DATETIME), A290TAM05_CRT_DATETIME, new Boolean(n291TAM05_CRT_USER_ID), A291TAM05_CRT_USER_ID, new Boolean(n293TAM05_UPD_DATETIME), A293TAM05_UPD_DATETIME, new Boolean(n294TAM05_UPD_USER_ID), A294TAM05_UPD_USER_ID, new Boolean(n296TAM05_UPD_CNT), new Long(A296TAM05_UPD_CNT), new Boolean(n288TAM05_KNGN_FLG), A288TAM05_KNGN_FLG, new Boolean(n289TAM05_DEL_FLG), A289TAM05_DEL_FLG, new Boolean(n292TAM05_CRT_PROG_NM), A292TAM05_CRT_PROG_NM, new Boolean(n295TAM05_UPD_PROG_NM), A295TAM05_UPD_PROG_NM, A13TAM04_AUTH_CD, A12TAM03_APP_ID});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
                  if ( (pr_default.getStatus(18) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TAM05_APPLI_KNGN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate0C9( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey0C9( ) ;
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
         endLevel0C9( ) ;
      }
      closeExtendedTableCursors0C9( ) ;
   }

   public void deferredUpdate0C9( )
   {
   }

   public void delete0C9( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate0C9( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency0C9( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls0C9( ) ;
         afterConfirm0C9( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete0C9( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T000C21 */
               pr_default.execute(19, new Object[] {A13TAM04_AUTH_CD, A12TAM03_APP_ID});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TAM05_APPLI_KNGN") ;
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
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
      endLevel0C9( ) ;
      Gx_mode = sMode9 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls0C9( )
   {
      standaloneModal0C9( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel0C9( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         pr_default.close(0);
      }
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart0C9( )
   {
      /* Scan By routine */
      /* Using cursor T000C22 */
      pr_default.execute(20, new Object[] {A13TAM04_AUTH_CD});
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A12TAM03_APP_ID = T000C22_A12TAM03_APP_ID[0] ;
      }
      /* Load Subordinate Levels */
   }

   public void scanNext0C9( )
   {
      /* Scan next routine */
      pr_default.readNext(20);
      RcdFound9 = (short)(0) ;
      if ( (pr_default.getStatus(20) != 101) )
      {
         RcdFound9 = (short)(1) ;
         A12TAM03_APP_ID = T000C22_A12TAM03_APP_ID[0] ;
      }
   }

   public void scanEnd0C9( )
   {
      pr_default.close(20);
   }

   public void afterConfirm0C9( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert0C9( )
   {
      /* Before Insert Rules */
      A290TAM05_CRT_DATETIME = GXutil.now( ) ;
      n290TAM05_CRT_DATETIME = false ;
      GXt_char1 = A291TAM05_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A291TAM05_CRT_USER_ID = GXt_char1 ;
      n291TAM05_CRT_USER_ID = false ;
      A293TAM05_UPD_DATETIME = GXutil.now( ) ;
      n293TAM05_UPD_DATETIME = false ;
      GXt_char1 = A294TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A294TAM05_UPD_USER_ID = GXt_char1 ;
      n294TAM05_UPD_USER_ID = false ;
      A296TAM05_UPD_CNT = (long)(O296TAM05_UPD_CNT+1) ;
      n296TAM05_UPD_CNT = false ;
   }

   public void beforeUpdate0C9( )
   {
      /* Before Update Rules */
      A293TAM05_UPD_DATETIME = GXutil.now( ) ;
      n293TAM05_UPD_DATETIME = false ;
      GXt_char1 = A294TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A294TAM05_UPD_USER_ID = GXt_char1 ;
      n294TAM05_UPD_USER_ID = false ;
      A296TAM05_UPD_CNT = (long)(O296TAM05_UPD_CNT+1) ;
      n296TAM05_UPD_CNT = false ;
   }

   public void beforeDelete0C9( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete0C9( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate0C9( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes0C9( )
   {
      edtTAM03_APP_ID_Enabled = 0 ;
      edtTAM05_KNGN_FLG_Enabled = 0 ;
      edtTAM05_DEL_FLG_Enabled = 0 ;
      edtTAM05_CRT_DATETIME_Enabled = 0 ;
      edtTAM05_CRT_USER_ID_Enabled = 0 ;
      edtTAM05_CRT_PROG_NM_Enabled = 0 ;
      edtTAM05_UPD_DATETIME_Enabled = 0 ;
      edtTAM05_UPD_USER_ID_Enabled = 0 ;
      edtTAM05_UPD_PROG_NM_Enabled = 0 ;
      edtTAM05_UPD_CNT_Enabled = 0 ;
   }

   public void subsflControlProps_969( )
   {
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_96_idx ;
      edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_96_idx ;
      edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_96_idx ;
      edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_96_idx ;
      edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_96_idx ;
      edtTAM05_CRT_PROG_NM_Internalname = "TAM05_CRT_PROG_NM_"+sGXsfl_96_idx ;
      edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_96_idx ;
      edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_96_idx ;
      edtTAM05_UPD_PROG_NM_Internalname = "TAM05_UPD_PROG_NM_"+sGXsfl_96_idx ;
      edtTAM05_UPD_CNT_Internalname = "TAM05_UPD_CNT_"+sGXsfl_96_idx ;
   }

   public void subsflControlProps_fel_969( )
   {
      edtTAM03_APP_ID_Internalname = "TAM03_APP_ID_"+sGXsfl_96_fel_idx ;
      edtTAM05_KNGN_FLG_Internalname = "TAM05_KNGN_FLG_"+sGXsfl_96_fel_idx ;
      edtTAM05_DEL_FLG_Internalname = "TAM05_DEL_FLG_"+sGXsfl_96_fel_idx ;
      edtTAM05_CRT_DATETIME_Internalname = "TAM05_CRT_DATETIME_"+sGXsfl_96_fel_idx ;
      edtTAM05_CRT_USER_ID_Internalname = "TAM05_CRT_USER_ID_"+sGXsfl_96_fel_idx ;
      edtTAM05_CRT_PROG_NM_Internalname = "TAM05_CRT_PROG_NM_"+sGXsfl_96_fel_idx ;
      edtTAM05_UPD_DATETIME_Internalname = "TAM05_UPD_DATETIME_"+sGXsfl_96_fel_idx ;
      edtTAM05_UPD_USER_ID_Internalname = "TAM05_UPD_USER_ID_"+sGXsfl_96_fel_idx ;
      edtTAM05_UPD_PROG_NM_Internalname = "TAM05_UPD_PROG_NM_"+sGXsfl_96_fel_idx ;
      edtTAM05_UPD_CNT_Internalname = "TAM05_UPD_CNT_"+sGXsfl_96_fel_idx ;
   }

   public void addRow0C9( )
   {
      nGXsfl_96_idx = (short)(nGXsfl_96_idx+1) ;
      sGXsfl_96_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_969( ) ;
      sendRow0C9( ) ;
   }

   public void sendRow0C9( )
   {
      Gridtam04bc_kngn_tam05_appliRow = GXWebRow.GetNew(context) ;
      if ( subGridtam04bc_kngn_tam05_appli_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridtam04bc_kngn_tam05_appli_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridtam04bc_kngn_tam05_appli_Class, "") != 0 )
         {
            subGridtam04bc_kngn_tam05_appli_Linesclass = subGridtam04bc_kngn_tam05_appli_Class+"Odd" ;
         }
      }
      else if ( subGridtam04bc_kngn_tam05_appli_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridtam04bc_kngn_tam05_appli_Backstyle = (byte)(0) ;
         subGridtam04bc_kngn_tam05_appli_Backcolor = subGridtam04bc_kngn_tam05_appli_Allbackcolor ;
         if ( GXutil.strcmp(subGridtam04bc_kngn_tam05_appli_Class, "") != 0 )
         {
            subGridtam04bc_kngn_tam05_appli_Linesclass = subGridtam04bc_kngn_tam05_appli_Class+"Uniform" ;
         }
      }
      else if ( subGridtam04bc_kngn_tam05_appli_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridtam04bc_kngn_tam05_appli_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridtam04bc_kngn_tam05_appli_Class, "") != 0 )
         {
            subGridtam04bc_kngn_tam05_appli_Linesclass = subGridtam04bc_kngn_tam05_appli_Class+"Odd" ;
         }
         subGridtam04bc_kngn_tam05_appli_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGridtam04bc_kngn_tam05_appli_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridtam04bc_kngn_tam05_appli_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_96_idx) % (2))) == 0 )
         {
            subGridtam04bc_kngn_tam05_appli_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridtam04bc_kngn_tam05_appli_Class, "") != 0 )
            {
               subGridtam04bc_kngn_tam05_appli_Linesclass = subGridtam04bc_kngn_tam05_appli_Class+"Even" ;
            }
         }
         else
         {
            subGridtam04bc_kngn_tam05_appli_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGridtam04bc_kngn_tam05_appli_Class, "") != 0 )
            {
               subGridtam04bc_kngn_tam05_appli_Linesclass = subGridtam04bc_kngn_tam05_appli_Class+"Odd" ;
            }
         }
      }
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 97,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM03_APP_ID_Internalname,GXutil.rtrim( A12TAM03_APP_ID),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(97);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM03_APP_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTAM03_APP_ID_Enabled),new Integer(1),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(7),new Integer(0),new Integer(0),new Integer(96),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"","left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_KNGN_FLG_Internalname,GXutil.rtrim( A288TAM05_KNGN_FLG),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(98);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_KNGN_FLG_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTAM05_KNGN_FLG_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(96),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_FLG","left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_DEL_FLG_Internalname,GXutil.rtrim( A289TAM05_DEL_FLG),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(99);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_DEL_FLG_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTAM05_DEL_FLG_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(1),new Integer(0),new Integer(0),new Integer(96),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_FLG","left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 100,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_CRT_DATETIME_Internalname,localUtil.format(A290TAM05_CRT_DATETIME, "9999/99/99 99:99:99"),localUtil.format( A290TAM05_CRT_DATETIME, "9999/99/99 99:99:99"),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(100);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_CRT_DATETIME_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTAM05_CRT_DATETIME_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(96),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_Y4MD_HMS","right"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 101,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_CRT_USER_ID_Internalname,GXutil.rtrim( A291TAM05_CRT_USER_ID),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(101);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_CRT_USER_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTAM05_CRT_USER_ID_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(128),new Integer(0),new Integer(0),new Integer(96),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_TS_USER_ID","left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_CRT_PROG_NM_Internalname,GXutil.rtrim( A292TAM05_CRT_PROG_NM),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(102);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_CRT_PROG_NM_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTAM05_CRT_PROG_NM_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(0),new Integer(96),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_TS_PG_NM","left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_UPD_DATETIME_Internalname,localUtil.format(A293TAM05_UPD_DATETIME, "9999/99/99 99:99:99"),localUtil.format( A293TAM05_UPD_DATETIME, "9999/99/99 99:99:99"),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.date.valid_date(this, 10,'YMD',8,24,'jap',false,0);"+";gx.evt.onblur(103);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_UPD_DATETIME_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTAM05_UPD_DATETIME_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(19),new Integer(0),new Integer(0),new Integer(96),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_Y4MD_HMS","right"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_UPD_USER_ID_Internalname,GXutil.rtrim( A294TAM05_UPD_USER_ID),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(104);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_UPD_USER_ID_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTAM05_UPD_USER_ID_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(128),new Integer(0),new Integer(0),new Integer(96),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_TS_USER_ID","left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 105,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_UPD_PROG_NM_Internalname,GXutil.rtrim( A295TAM05_UPD_PROG_NM),"",TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+""+";gx.evt.onblur(105);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_UPD_PROG_NM_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTAM05_UPD_PROG_NM_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(40),new Integer(0),new Integer(0),new Integer(96),new Integer(1),new Integer(-1),new Integer(-1),new Boolean(true),"D_TS_PG_NM","left"});
      /* Subfile cell */
      /* Single line edit */
      TempTags = " gxoch1=\"gx.fn.setControlValue('nIsMod_9_" + sGXsfl_96_idx + "',1);\"  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_96_idx + "',96)\"" ;
      ROClassString = "Attribute" ;
      Gridtam04bc_kngn_tam05_appliRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTAM05_UPD_CNT_Internalname,GXutil.ltrim( localUtil.ntoc( A296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")),((edtTAM05_UPD_CNT_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A296TAM05_UPD_CNT), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A296TAM05_UPD_CNT), "ZZZZZZZZZ9")),TempTags+" onchange=\"gx.evt.onchange(this)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(106);\"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTAM05_UPD_CNT_Jsonclick,new Integer(0),"Attribute","",ROClassString,"",new Integer(-1),new Integer(edtTAM05_UPD_CNT_Enabled),new Integer(0),"text","",new Integer(0),"px",new Integer(17),"px",new Integer(10),new Integer(0),new Integer(0),new Integer(96),new Integer(1),new Integer(-1),new Integer(0),new Boolean(true),"D_NO","right"});
      httpContext.ajax_sending_grid_row(Gridtam04bc_kngn_tam05_appliRow);
      GXCCtl = "Z12TAM03_APP_ID_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z12TAM03_APP_ID));
      GXCCtl = "Z290TAM05_CRT_DATETIME_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z290TAM05_CRT_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z291TAM05_CRT_USER_ID_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z291TAM05_CRT_USER_ID));
      GXCCtl = "Z293TAM05_UPD_DATETIME_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, localUtil.ttoc( Z293TAM05_UPD_DATETIME, 10, 8, 0, 0, "/", ":", " "));
      GXCCtl = "Z294TAM05_UPD_USER_ID_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z294TAM05_UPD_USER_ID));
      GXCCtl = "Z296TAM05_UPD_CNT_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( Z296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GXCCtl = "Z288TAM05_KNGN_FLG_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z288TAM05_KNGN_FLG));
      GXCCtl = "Z289TAM05_DEL_FLG_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z289TAM05_DEL_FLG));
      GXCCtl = "Z292TAM05_CRT_PROG_NM_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z292TAM05_CRT_PROG_NM));
      GXCCtl = "Z295TAM05_UPD_PROG_NM_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( Z295TAM05_UPD_PROG_NM));
      GXCCtl = "O296TAM05_UPD_CNT_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( O296TAM05_UPD_CNT, (byte)(10), (byte)(0), ".", "")));
      GXCCtl = "nRcdDeleted_9_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdDeleted_9, (byte)(4), (byte)(0), ".", "")));
      GXCCtl = "nRcdExists_9_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nRcdExists_9, (byte)(4), (byte)(0), ".", "")));
      GXCCtl = "nIsMod_9_" + sGXsfl_96_idx ;
      GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( nIsMod_9, (byte)(4), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM03_APP_ID_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM03_APP_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_KNGN_FLG_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_KNGN_FLG_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_DEL_FLG_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_DEL_FLG_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_CRT_DATETIME_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_DATETIME_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_CRT_USER_ID_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_USER_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_CRT_PROG_NM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_CRT_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_UPD_DATETIME_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_DATETIME_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_UPD_USER_ID_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_USER_ID_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_UPD_PROG_NM_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_PROG_NM_Enabled, (byte)(5), (byte)(0), ".", "")));
      GxWebStd.gx_hidden_field( httpContext, "TAM05_UPD_CNT_"+sGXsfl_96_idx+"Enabled", GXutil.ltrim( localUtil.ntoc( edtTAM05_UPD_CNT_Enabled, (byte)(5), (byte)(0), ".", "")));
      httpContext.ajax_sending_grid_row(null);
      Gridtam04bc_kngn_tam05_appliContainer.AddRow(Gridtam04bc_kngn_tam05_appliRow);
   }

   public void readRow0C9( )
   {
      nGXsfl_96_idx = (short)(nGXsfl_96_idx+1) ;
      sGXsfl_96_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_969( ) ;
      edtTAM03_APP_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM03_APP_ID_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
      edtTAM05_KNGN_FLG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_KNGN_FLG_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
      edtTAM05_DEL_FLG_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_DEL_FLG_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
      edtTAM05_CRT_DATETIME_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_DATETIME_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
      edtTAM05_CRT_USER_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_USER_ID_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
      edtTAM05_CRT_PROG_NM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_CRT_PROG_NM_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
      edtTAM05_UPD_DATETIME_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_DATETIME_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
      edtTAM05_UPD_USER_ID_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_USER_ID_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
      edtTAM05_UPD_PROG_NM_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_PROG_NM_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
      edtTAM05_UPD_CNT_Enabled = (int)(localUtil.ctol( httpContext.cgiGet( "TAM05_UPD_CNT_"+sGXsfl_96_idx+"Enabled"), ".", ",")) ;
      A12TAM03_APP_ID = httpContext.cgiGet( edtTAM03_APP_ID_Internalname) ;
      A288TAM05_KNGN_FLG = httpContext.cgiGet( edtTAM05_KNGN_FLG_Internalname) ;
      n288TAM05_KNGN_FLG = false ;
      n288TAM05_KNGN_FLG = ((GXutil.strcmp("", A288TAM05_KNGN_FLG)==0) ? true : false) ;
      A289TAM05_DEL_FLG = httpContext.cgiGet( edtTAM05_DEL_FLG_Internalname) ;
      n289TAM05_DEL_FLG = false ;
      n289TAM05_DEL_FLG = ((GXutil.strcmp("", A289TAM05_DEL_FLG)==0) ? true : false) ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM05_CRT_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TAM05_CRT_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM05_CRT_DATETIME_Internalname ;
         wbErr = true ;
         A290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
         n290TAM05_CRT_DATETIME = false ;
      }
      else
      {
         A290TAM05_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM05_CRT_DATETIME_Internalname)) ;
         n290TAM05_CRT_DATETIME = false ;
      }
      n290TAM05_CRT_DATETIME = (GXutil.nullDate().equals(A290TAM05_CRT_DATETIME) ? true : false) ;
      A291TAM05_CRT_USER_ID = httpContext.cgiGet( edtTAM05_CRT_USER_ID_Internalname) ;
      n291TAM05_CRT_USER_ID = false ;
      n291TAM05_CRT_USER_ID = ((GXutil.strcmp("", A291TAM05_CRT_USER_ID)==0) ? true : false) ;
      A292TAM05_CRT_PROG_NM = httpContext.cgiGet( edtTAM05_CRT_PROG_NM_Internalname) ;
      n292TAM05_CRT_PROG_NM = false ;
      n292TAM05_CRT_PROG_NM = ((GXutil.strcmp("", A292TAM05_CRT_PROG_NM)==0) ? true : false) ;
      if ( localUtil.vcdtime( httpContext.cgiGet( edtTAM05_UPD_DATETIME_Internalname), (byte)(0), (byte)(0)) == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "TAM05_UPD_DATETIME");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM05_UPD_DATETIME_Internalname ;
         wbErr = true ;
         A293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
         n293TAM05_UPD_DATETIME = false ;
      }
      else
      {
         A293TAM05_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( edtTAM05_UPD_DATETIME_Internalname)) ;
         n293TAM05_UPD_DATETIME = false ;
      }
      n293TAM05_UPD_DATETIME = (GXutil.nullDate().equals(A293TAM05_UPD_DATETIME) ? true : false) ;
      A294TAM05_UPD_USER_ID = httpContext.cgiGet( edtTAM05_UPD_USER_ID_Internalname) ;
      n294TAM05_UPD_USER_ID = false ;
      n294TAM05_UPD_USER_ID = ((GXutil.strcmp("", A294TAM05_UPD_USER_ID)==0) ? true : false) ;
      A295TAM05_UPD_PROG_NM = httpContext.cgiGet( edtTAM05_UPD_PROG_NM_Internalname) ;
      n295TAM05_UPD_PROG_NM = false ;
      n295TAM05_UPD_PROG_NM = ((GXutil.strcmp("", A295TAM05_UPD_PROG_NM)==0) ? true : false) ;
      if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTAM05_UPD_CNT_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTAM05_UPD_CNT_Internalname), ".", ",") > 9999999999L ) ) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TAM05_UPD_CNT");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM05_UPD_CNT_Internalname ;
         wbErr = true ;
         A296TAM05_UPD_CNT = 0 ;
         n296TAM05_UPD_CNT = false ;
      }
      else
      {
         A296TAM05_UPD_CNT = localUtil.ctol( httpContext.cgiGet( edtTAM05_UPD_CNT_Internalname), ".", ",") ;
         n296TAM05_UPD_CNT = false ;
      }
      n296TAM05_UPD_CNT = ((0==A296TAM05_UPD_CNT) ? true : false) ;
      GXCCtl = "Z12TAM03_APP_ID_" + sGXsfl_96_idx ;
      Z12TAM03_APP_ID = httpContext.cgiGet( GXCCtl) ;
      GXCCtl = "Z290TAM05_CRT_DATETIME_" + sGXsfl_96_idx ;
      Z290TAM05_CRT_DATETIME = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      n290TAM05_CRT_DATETIME = (GXutil.nullDate().equals(A290TAM05_CRT_DATETIME) ? true : false) ;
      GXCCtl = "Z291TAM05_CRT_USER_ID_" + sGXsfl_96_idx ;
      Z291TAM05_CRT_USER_ID = httpContext.cgiGet( GXCCtl) ;
      n291TAM05_CRT_USER_ID = ((GXutil.strcmp("", A291TAM05_CRT_USER_ID)==0) ? true : false) ;
      GXCCtl = "Z293TAM05_UPD_DATETIME_" + sGXsfl_96_idx ;
      Z293TAM05_UPD_DATETIME = localUtil.ctot( httpContext.cgiGet( GXCCtl), 0) ;
      n293TAM05_UPD_DATETIME = (GXutil.nullDate().equals(A293TAM05_UPD_DATETIME) ? true : false) ;
      GXCCtl = "Z294TAM05_UPD_USER_ID_" + sGXsfl_96_idx ;
      Z294TAM05_UPD_USER_ID = httpContext.cgiGet( GXCCtl) ;
      n294TAM05_UPD_USER_ID = ((GXutil.strcmp("", A294TAM05_UPD_USER_ID)==0) ? true : false) ;
      GXCCtl = "Z296TAM05_UPD_CNT_" + sGXsfl_96_idx ;
      Z296TAM05_UPD_CNT = localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",") ;
      n296TAM05_UPD_CNT = ((0==A296TAM05_UPD_CNT) ? true : false) ;
      GXCCtl = "Z288TAM05_KNGN_FLG_" + sGXsfl_96_idx ;
      Z288TAM05_KNGN_FLG = httpContext.cgiGet( GXCCtl) ;
      n288TAM05_KNGN_FLG = ((GXutil.strcmp("", A288TAM05_KNGN_FLG)==0) ? true : false) ;
      GXCCtl = "Z289TAM05_DEL_FLG_" + sGXsfl_96_idx ;
      Z289TAM05_DEL_FLG = httpContext.cgiGet( GXCCtl) ;
      n289TAM05_DEL_FLG = ((GXutil.strcmp("", A289TAM05_DEL_FLG)==0) ? true : false) ;
      GXCCtl = "Z292TAM05_CRT_PROG_NM_" + sGXsfl_96_idx ;
      Z292TAM05_CRT_PROG_NM = httpContext.cgiGet( GXCCtl) ;
      n292TAM05_CRT_PROG_NM = ((GXutil.strcmp("", A292TAM05_CRT_PROG_NM)==0) ? true : false) ;
      GXCCtl = "Z295TAM05_UPD_PROG_NM_" + sGXsfl_96_idx ;
      Z295TAM05_UPD_PROG_NM = httpContext.cgiGet( GXCCtl) ;
      n295TAM05_UPD_PROG_NM = ((GXutil.strcmp("", A295TAM05_UPD_PROG_NM)==0) ? true : false) ;
      GXCCtl = "O296TAM05_UPD_CNT_" + sGXsfl_96_idx ;
      O296TAM05_UPD_CNT = localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",") ;
      n296TAM05_UPD_CNT = ((0==A296TAM05_UPD_CNT) ? true : false) ;
      GXCCtl = "nRcdDeleted_9_" + sGXsfl_96_idx ;
      nRcdDeleted_9 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",")) ;
      GXCCtl = "nRcdExists_9_" + sGXsfl_96_idx ;
      nRcdExists_9 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",")) ;
      GXCCtl = "nIsMod_9_" + sGXsfl_96_idx ;
      nIsMod_9 = (short)(localUtil.ctol( httpContext.cgiGet( GXCCtl), ".", ",")) ;
   }

   public void assign_properties_default( )
   {
      defedtTAM03_APP_ID_Enabled = edtTAM03_APP_ID_Enabled ;
   }

   public void confirmValues0C0( )
   {
      nGXsfl_96_idx = (short)(0) ;
      sGXsfl_96_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_idx, 4, 0)), (short)(4), "0") ;
      subsflControlProps_969( ) ;
      while ( nGXsfl_96_idx < nRC_GXsfl_96 )
      {
         nGXsfl_96_idx = (short)(nGXsfl_96_idx+1) ;
         sGXsfl_96_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_969( ) ;
         httpContext.changePostValue( "Z12TAM03_APP_ID_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z12TAM03_APP_ID_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z12TAM03_APP_ID_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z290TAM05_CRT_DATETIME_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z290TAM05_CRT_DATETIME_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z290TAM05_CRT_DATETIME_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z291TAM05_CRT_USER_ID_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z291TAM05_CRT_USER_ID_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z291TAM05_CRT_USER_ID_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z293TAM05_UPD_DATETIME_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z293TAM05_UPD_DATETIME_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z293TAM05_UPD_DATETIME_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z294TAM05_UPD_USER_ID_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z294TAM05_UPD_USER_ID_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z294TAM05_UPD_USER_ID_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z296TAM05_UPD_CNT_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z296TAM05_UPD_CNT_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z296TAM05_UPD_CNT_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z288TAM05_KNGN_FLG_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z288TAM05_KNGN_FLG_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z288TAM05_KNGN_FLG_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z289TAM05_DEL_FLG_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z289TAM05_DEL_FLG_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z289TAM05_DEL_FLG_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z292TAM05_CRT_PROG_NM_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z292TAM05_CRT_PROG_NM_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z292TAM05_CRT_PROG_NM_"+sGXsfl_96_idx) ;
         httpContext.changePostValue( "Z295TAM05_UPD_PROG_NM_"+sGXsfl_96_idx, httpContext.cgiGet( "ZT_"+"Z295TAM05_UPD_PROG_NM_"+sGXsfl_96_idx)) ;
         httpContext.deletePostValue( "ZT_"+"Z295TAM05_UPD_PROG_NM_"+sGXsfl_96_idx) ;
      }
      httpContext.changePostValue( "O296TAM05_UPD_CNT", httpContext.cgiGet( "T296TAM05_UPD_CNT")) ;
      httpContext.deletePostValue( "T296TAM05_UPD_CNT") ;
   }

   public void renderHtmlHeaders( )
   {
      GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv());
   }

   public void renderHtmlOpenForm( )
   {
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( "権限パターンマスタ（ビジネスコンポーネント）") ;
      httpContext.writeTextNL( "</title>") ;
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxtimezone.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("gxcfg.js", "?20177317141116");
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" name=\"MAINFORM\" method=\"post\" class=\"Form\" action=\""+formatLink("tam04bc_kngn") +"\">") ;
      GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
   }

   public void renderHtmlCloseForm0C3( )
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
      GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_96", GXutil.ltrim( localUtil.ntoc( nGXsfl_96_idx, (byte)(4), (byte)(0), ".", "")));
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
      return "TAM04BC_KNGN" ;
   }

   public String getPgmdesc( )
   {
      return "権限パターンマスタ（ビジネスコンポーネント）" ;
   }

   public void initializeNonKey0C3( )
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

   public void initAll0C3( )
   {
      A13TAM04_AUTH_CD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "A13TAM04_AUTH_CD", A13TAM04_AUTH_CD);
      initializeNonKey0C3( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void initializeNonKey0C9( )
   {
      A290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n290TAM05_CRT_DATETIME = false ;
      A291TAM05_CRT_USER_ID = "" ;
      n291TAM05_CRT_USER_ID = false ;
      A293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      n293TAM05_UPD_DATETIME = false ;
      A294TAM05_UPD_USER_ID = "" ;
      n294TAM05_UPD_USER_ID = false ;
      A296TAM05_UPD_CNT = 0 ;
      n296TAM05_UPD_CNT = false ;
      A288TAM05_KNGN_FLG = "" ;
      n288TAM05_KNGN_FLG = false ;
      A289TAM05_DEL_FLG = "" ;
      n289TAM05_DEL_FLG = false ;
      A292TAM05_CRT_PROG_NM = "" ;
      n292TAM05_CRT_PROG_NM = false ;
      A295TAM05_UPD_PROG_NM = "" ;
      n295TAM05_UPD_PROG_NM = false ;
      O296TAM05_UPD_CNT = A296TAM05_UPD_CNT ;
      n296TAM05_UPD_CNT = false ;
   }

   public void initAll0C9( )
   {
      A12TAM03_APP_ID = "" ;
      initializeNonKey0C9( ) ;
   }

   public void standaloneModalInsert0C9( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddStyleSheetFile("calendar-system.css", "?8960");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?17122662");
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20177317141127");
         idxLst = (int)(idxLst+1) ;
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.jap.js", "?"+httpContext.getBuildNumber( 92797));
      httpContext.AddJavascriptSource("tam04bc_kngn.js", "?20177317141127");
      /* End function include_jscripts */
   }

   public void init_level_properties9( )
   {
      edtTAM03_APP_ID_Enabled = defedtTAM03_APP_ID_Enabled ;
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
      lblTitletam05_appli_Internalname = "TITLETAM05_APPLI" ;
      tblTable3_Internalname = "TABLE3" ;
      tblTable2_Internalname = "TABLE2" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      tblTable1_Internalname = "TABLE1" ;
      grpGroupdata_Internalname = "GROUPDATA" ;
      tblTablemain_Internalname = "TABLEMAIN" ;
      Form.setInternalname( "FORM" );
      subGridtam04bc_kngn_tam05_appli_Internalname = "GRIDTAM04BC_KNGN_TAM05_APPLI" ;
   }

   public void initialize_properties( )
   {
      init_default_properties( ) ;
      edtTAM05_UPD_CNT_Jsonclick = "" ;
      edtTAM05_UPD_PROG_NM_Jsonclick = "" ;
      edtTAM05_UPD_USER_ID_Jsonclick = "" ;
      edtTAM05_UPD_DATETIME_Jsonclick = "" ;
      edtTAM05_CRT_PROG_NM_Jsonclick = "" ;
      edtTAM05_CRT_USER_ID_Jsonclick = "" ;
      edtTAM05_CRT_DATETIME_Jsonclick = "" ;
      edtTAM05_DEL_FLG_Jsonclick = "" ;
      edtTAM05_KNGN_FLG_Jsonclick = "" ;
      edtTAM03_APP_ID_Jsonclick = "" ;
      subGridtam04bc_kngn_tam05_appli_Class = "Grid" ;
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
      subGridtam04bc_kngn_tam05_appli_Allowcollapsing = (byte)(0) ;
      subGridtam04bc_kngn_tam05_appli_Allowselection = (byte)(0) ;
      edtTAM05_UPD_CNT_Enabled = 1 ;
      edtTAM05_UPD_PROG_NM_Enabled = 1 ;
      edtTAM05_UPD_USER_ID_Enabled = 1 ;
      edtTAM05_UPD_DATETIME_Enabled = 1 ;
      edtTAM05_CRT_PROG_NM_Enabled = 1 ;
      edtTAM05_CRT_USER_ID_Enabled = 1 ;
      edtTAM05_CRT_DATETIME_Enabled = 1 ;
      edtTAM05_DEL_FLG_Enabled = 1 ;
      edtTAM05_KNGN_FLG_Enabled = 1 ;
      edtTAM03_APP_ID_Enabled = 1 ;
      subGridtam04bc_kngn_tam05_appli_Backcolorstyle = (byte)(2) ;
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

   public void gx4asatam04_crt_user_id0C3( String Gx_mode )
   {
      GXt_char1 = A266TAM04_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
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

   public void gx6asatam04_upd_user_id0C3( String Gx_mode )
   {
      GXt_char1 = A267TAM04_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
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

   public void gx11asatam05_crt_user_id0C9( String Gx_mode )
   {
      GXt_char1 = A291TAM05_CRT_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A291TAM05_CRT_USER_ID = GXt_char1 ;
      n291TAM05_CRT_USER_ID = false ;
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

   public void gx13asatam05_upd_user_id0C9( String Gx_mode )
   {
      GXt_char1 = A294TAM05_UPD_USER_ID ;
      GXv_char2[0] = GXt_char1 ;
      new a403_pc01_get_login_user_id(remoteHandle, context).execute( GXv_char2) ;
      tam04bc_kngn_impl.this.GXt_char1 = GXv_char2[0] ;
      A294TAM05_UPD_USER_ID = GXt_char1 ;
      n294TAM05_UPD_USER_ID = false ;
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

   public void gxnrgridtam04bc_kngn_tam05_appli_newrow( short nRC_GXsfl_96 ,
                                                        short nGXsfl_96_idx ,
                                                        String sGXsfl_96_idx )
   {
      GxWebStd.set_html_headers( httpContext, 0, "", "");
      Gx_mode = "INS" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      subsflControlProps_969( ) ;
      while ( nGXsfl_96_idx <= nRC_GXsfl_96 )
      {
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         standaloneNotModal0C9( ) ;
         standaloneModal0C9( ) ;
         dynload_actions( ) ;
         sendRow0C9( ) ;
         nGXsfl_96_idx = (short)(nGXsfl_96_idx+1) ;
         sGXsfl_96_idx = GXutil.padl( GXutil.ltrim( GXutil.str( nGXsfl_96_idx, 4, 0)), (short)(4), "0") ;
         subsflControlProps_969( ) ;
      }
      httpContext.GX_webresponse.addString(Gridtam04bc_kngn_tam05_appliContainer.ToJavascriptSource());
      /* End function gxnrGridtam04bc_kngn_tam05_appli_newrow */
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
      isValidOutput.add(Gridtam04bc_kngn_tam05_appliContainer);
      isValidOutput.add(imgBtn_delete2_Enabled);
      isValidOutput.add(imgBtn_enter2_Enabled);
      isValidOutput.add(httpContext.GX_msglist.ToJavascriptSource());
      httpContext.GX_webresponse.addString(isValidOutput.toJSonString());
      wbTemp = httpContext.setContentType( "application/json") ;
   }

   public void valid_Tam03_app_id( String GX_Parm1 )
   {
      A12TAM03_APP_ID = GX_Parm1 ;
      /* Using cursor T000C23 */
      pr_default.execute(21, new Object[] {A12TAM03_APP_ID});
      if ( (pr_default.getStatus(21) == 101) )
      {
         httpContext.GX_msglist.addItem("'アプリケーションマスタ' の該当レコードはありません。", "ForeignKeyNotFound", 1, "TAM03_APP_ID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTAM03_APP_ID_Internalname ;
      }
      pr_default.close(21);
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
      pr_default.close(21);
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
      Gridtam04bc_kngn_tam05_appliContainer = new com.genexus.webpanels.GXWebGrid(context);
      Gridtam04bc_kngn_tam05_appliColumn = new com.genexus.webpanels.GXWebColumn();
      A288TAM05_KNGN_FLG = "" ;
      A289TAM05_DEL_FLG = "" ;
      A290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A291TAM05_CRT_USER_ID = "" ;
      A292TAM05_CRT_PROG_NM = "" ;
      A293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      A294TAM05_UPD_USER_ID = "" ;
      A295TAM05_UPD_PROG_NM = "" ;
      sMode9 = "" ;
      edtTAM03_APP_ID_Internalname = "" ;
      lblTitletam05_appli_Jsonclick = "" ;
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
      edtTAM05_KNGN_FLG_Internalname = "" ;
      edtTAM05_DEL_FLG_Internalname = "" ;
      edtTAM05_CRT_DATETIME_Internalname = "" ;
      edtTAM05_CRT_USER_ID_Internalname = "" ;
      edtTAM05_CRT_PROG_NM_Internalname = "" ;
      edtTAM05_UPD_DATETIME_Internalname = "" ;
      edtTAM05_UPD_USER_ID_Internalname = "" ;
      edtTAM05_UPD_PROG_NM_Internalname = "" ;
      edtTAM05_UPD_CNT_Internalname = "" ;
      Z12TAM03_APP_ID = "" ;
      Z290TAM05_CRT_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z291TAM05_CRT_USER_ID = "" ;
      Z293TAM05_UPD_DATETIME = GXutil.resetTime( GXutil.nullDate() );
      Z294TAM05_UPD_USER_ID = "" ;
      Z288TAM05_KNGN_FLG = "" ;
      Z289TAM05_DEL_FLG = "" ;
      Z292TAM05_CRT_PROG_NM = "" ;
      Z295TAM05_UPD_PROG_NM = "" ;
      AV11W_BC_FLG = "" ;
      GXEncryptionTmp = "" ;
      AV10W_TXT = "" ;
      T000C7_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C7_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C7_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      T000C7_A266TAM04_CRT_USER_ID = new String[] {""} ;
      T000C7_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      T000C7_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C7_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      T000C7_A267TAM04_UPD_USER_ID = new String[] {""} ;
      T000C7_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      T000C7_A286TAM04_UPD_CNT = new long[1] ;
      T000C7_n286TAM04_UPD_CNT = new boolean[] {false} ;
      T000C7_A285TAM04_AUTH_NM = new String[] {""} ;
      T000C7_n285TAM04_AUTH_NM = new boolean[] {false} ;
      T000C7_A687TAM04_AUTH_LVL = new byte[1] ;
      T000C7_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      T000C7_A215TAM04_DEL_FLG = new String[] {""} ;
      T000C7_n215TAM04_DEL_FLG = new boolean[] {false} ;
      T000C7_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      T000C7_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      T000C7_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      T000C7_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      T000C8_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C6_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C6_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C6_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      T000C6_A266TAM04_CRT_USER_ID = new String[] {""} ;
      T000C6_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      T000C6_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C6_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      T000C6_A267TAM04_UPD_USER_ID = new String[] {""} ;
      T000C6_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      T000C6_A286TAM04_UPD_CNT = new long[1] ;
      T000C6_n286TAM04_UPD_CNT = new boolean[] {false} ;
      T000C6_A285TAM04_AUTH_NM = new String[] {""} ;
      T000C6_n285TAM04_AUTH_NM = new boolean[] {false} ;
      T000C6_A687TAM04_AUTH_LVL = new byte[1] ;
      T000C6_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      T000C6_A215TAM04_DEL_FLG = new String[] {""} ;
      T000C6_n215TAM04_DEL_FLG = new boolean[] {false} ;
      T000C6_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      T000C6_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      T000C6_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      T000C6_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      sMode3 = "" ;
      T000C9_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C10_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C5_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C5_A233TAM04_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C5_n233TAM04_CRT_DATETIME = new boolean[] {false} ;
      T000C5_A266TAM04_CRT_USER_ID = new String[] {""} ;
      T000C5_n266TAM04_CRT_USER_ID = new boolean[] {false} ;
      T000C5_A235TAM04_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C5_n235TAM04_UPD_DATETIME = new boolean[] {false} ;
      T000C5_A267TAM04_UPD_USER_ID = new String[] {""} ;
      T000C5_n267TAM04_UPD_USER_ID = new boolean[] {false} ;
      T000C5_A286TAM04_UPD_CNT = new long[1] ;
      T000C5_n286TAM04_UPD_CNT = new boolean[] {false} ;
      T000C5_A285TAM04_AUTH_NM = new String[] {""} ;
      T000C5_n285TAM04_AUTH_NM = new boolean[] {false} ;
      T000C5_A687TAM04_AUTH_LVL = new byte[1] ;
      T000C5_n687TAM04_AUTH_LVL = new boolean[] {false} ;
      T000C5_A215TAM04_DEL_FLG = new String[] {""} ;
      T000C5_n215TAM04_DEL_FLG = new boolean[] {false} ;
      T000C5_A234TAM04_CRT_PROG_NM = new String[] {""} ;
      T000C5_n234TAM04_CRT_PROG_NM = new boolean[] {false} ;
      T000C5_A236TAM04_UPD_PROG_NM = new String[] {""} ;
      T000C5_n236TAM04_UPD_PROG_NM = new boolean[] {false} ;
      T000C14_A55TAM07_USER_ID = new String[] {""} ;
      T000C15_A50TBM07_AUTH_CD = new String[] {""} ;
      T000C16_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C17_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C17_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C17_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      T000C17_A291TAM05_CRT_USER_ID = new String[] {""} ;
      T000C17_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      T000C17_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C17_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      T000C17_A294TAM05_UPD_USER_ID = new String[] {""} ;
      T000C17_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      T000C17_A296TAM05_UPD_CNT = new long[1] ;
      T000C17_n296TAM05_UPD_CNT = new boolean[] {false} ;
      T000C17_A288TAM05_KNGN_FLG = new String[] {""} ;
      T000C17_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      T000C17_A289TAM05_DEL_FLG = new String[] {""} ;
      T000C17_n289TAM05_DEL_FLG = new boolean[] {false} ;
      T000C17_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      T000C17_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      T000C17_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      T000C17_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      T000C17_A12TAM03_APP_ID = new String[] {""} ;
      T000C4_A12TAM03_APP_ID = new String[] {""} ;
      T000C18_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C18_A12TAM03_APP_ID = new String[] {""} ;
      T000C3_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C3_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C3_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      T000C3_A291TAM05_CRT_USER_ID = new String[] {""} ;
      T000C3_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      T000C3_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C3_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      T000C3_A294TAM05_UPD_USER_ID = new String[] {""} ;
      T000C3_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      T000C3_A296TAM05_UPD_CNT = new long[1] ;
      T000C3_n296TAM05_UPD_CNT = new boolean[] {false} ;
      T000C3_A288TAM05_KNGN_FLG = new String[] {""} ;
      T000C3_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      T000C3_A289TAM05_DEL_FLG = new String[] {""} ;
      T000C3_n289TAM05_DEL_FLG = new boolean[] {false} ;
      T000C3_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      T000C3_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      T000C3_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      T000C3_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      T000C3_A12TAM03_APP_ID = new String[] {""} ;
      T000C2_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C2_A290TAM05_CRT_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C2_n290TAM05_CRT_DATETIME = new boolean[] {false} ;
      T000C2_A291TAM05_CRT_USER_ID = new String[] {""} ;
      T000C2_n291TAM05_CRT_USER_ID = new boolean[] {false} ;
      T000C2_A293TAM05_UPD_DATETIME = new java.util.Date[] {GXutil.nullDate()} ;
      T000C2_n293TAM05_UPD_DATETIME = new boolean[] {false} ;
      T000C2_A294TAM05_UPD_USER_ID = new String[] {""} ;
      T000C2_n294TAM05_UPD_USER_ID = new boolean[] {false} ;
      T000C2_A296TAM05_UPD_CNT = new long[1] ;
      T000C2_n296TAM05_UPD_CNT = new boolean[] {false} ;
      T000C2_A288TAM05_KNGN_FLG = new String[] {""} ;
      T000C2_n288TAM05_KNGN_FLG = new boolean[] {false} ;
      T000C2_A289TAM05_DEL_FLG = new String[] {""} ;
      T000C2_n289TAM05_DEL_FLG = new boolean[] {false} ;
      T000C2_A292TAM05_CRT_PROG_NM = new String[] {""} ;
      T000C2_n292TAM05_CRT_PROG_NM = new boolean[] {false} ;
      T000C2_A295TAM05_UPD_PROG_NM = new String[] {""} ;
      T000C2_n295TAM05_UPD_PROG_NM = new boolean[] {false} ;
      T000C2_A12TAM03_APP_ID = new String[] {""} ;
      T000C22_A13TAM04_AUTH_CD = new String[] {""} ;
      T000C22_A12TAM03_APP_ID = new String[] {""} ;
      Gridtam04bc_kngn_tam05_appliRow = new com.genexus.webpanels.GXWebRow();
      subGridtam04bc_kngn_tam05_appli_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String [1] ;
      ZV12Pgmname = "" ;
      isValidOutput = new com.genexus.GxUnknownObjectCollection();
      T000C23_A12TAM03_APP_ID = new String[] {""} ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new tam04bc_kngn__default(),
         new Object[] {
             new Object[] {
            T000C2_A13TAM04_AUTH_CD, T000C2_A290TAM05_CRT_DATETIME, T000C2_n290TAM05_CRT_DATETIME, T000C2_A291TAM05_CRT_USER_ID, T000C2_n291TAM05_CRT_USER_ID, T000C2_A293TAM05_UPD_DATETIME, T000C2_n293TAM05_UPD_DATETIME, T000C2_A294TAM05_UPD_USER_ID, T000C2_n294TAM05_UPD_USER_ID, T000C2_A296TAM05_UPD_CNT,
            T000C2_n296TAM05_UPD_CNT, T000C2_A288TAM05_KNGN_FLG, T000C2_n288TAM05_KNGN_FLG, T000C2_A289TAM05_DEL_FLG, T000C2_n289TAM05_DEL_FLG, T000C2_A292TAM05_CRT_PROG_NM, T000C2_n292TAM05_CRT_PROG_NM, T000C2_A295TAM05_UPD_PROG_NM, T000C2_n295TAM05_UPD_PROG_NM, T000C2_A12TAM03_APP_ID
            }
            , new Object[] {
            T000C3_A13TAM04_AUTH_CD, T000C3_A290TAM05_CRT_DATETIME, T000C3_n290TAM05_CRT_DATETIME, T000C3_A291TAM05_CRT_USER_ID, T000C3_n291TAM05_CRT_USER_ID, T000C3_A293TAM05_UPD_DATETIME, T000C3_n293TAM05_UPD_DATETIME, T000C3_A294TAM05_UPD_USER_ID, T000C3_n294TAM05_UPD_USER_ID, T000C3_A296TAM05_UPD_CNT,
            T000C3_n296TAM05_UPD_CNT, T000C3_A288TAM05_KNGN_FLG, T000C3_n288TAM05_KNGN_FLG, T000C3_A289TAM05_DEL_FLG, T000C3_n289TAM05_DEL_FLG, T000C3_A292TAM05_CRT_PROG_NM, T000C3_n292TAM05_CRT_PROG_NM, T000C3_A295TAM05_UPD_PROG_NM, T000C3_n295TAM05_UPD_PROG_NM, T000C3_A12TAM03_APP_ID
            }
            , new Object[] {
            T000C4_A12TAM03_APP_ID
            }
            , new Object[] {
            T000C5_A13TAM04_AUTH_CD, T000C5_A233TAM04_CRT_DATETIME, T000C5_n233TAM04_CRT_DATETIME, T000C5_A266TAM04_CRT_USER_ID, T000C5_n266TAM04_CRT_USER_ID, T000C5_A235TAM04_UPD_DATETIME, T000C5_n235TAM04_UPD_DATETIME, T000C5_A267TAM04_UPD_USER_ID, T000C5_n267TAM04_UPD_USER_ID, T000C5_A286TAM04_UPD_CNT,
            T000C5_n286TAM04_UPD_CNT, T000C5_A285TAM04_AUTH_NM, T000C5_n285TAM04_AUTH_NM, T000C5_A687TAM04_AUTH_LVL, T000C5_n687TAM04_AUTH_LVL, T000C5_A215TAM04_DEL_FLG, T000C5_n215TAM04_DEL_FLG, T000C5_A234TAM04_CRT_PROG_NM, T000C5_n234TAM04_CRT_PROG_NM, T000C5_A236TAM04_UPD_PROG_NM,
            T000C5_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            T000C6_A13TAM04_AUTH_CD, T000C6_A233TAM04_CRT_DATETIME, T000C6_n233TAM04_CRT_DATETIME, T000C6_A266TAM04_CRT_USER_ID, T000C6_n266TAM04_CRT_USER_ID, T000C6_A235TAM04_UPD_DATETIME, T000C6_n235TAM04_UPD_DATETIME, T000C6_A267TAM04_UPD_USER_ID, T000C6_n267TAM04_UPD_USER_ID, T000C6_A286TAM04_UPD_CNT,
            T000C6_n286TAM04_UPD_CNT, T000C6_A285TAM04_AUTH_NM, T000C6_n285TAM04_AUTH_NM, T000C6_A687TAM04_AUTH_LVL, T000C6_n687TAM04_AUTH_LVL, T000C6_A215TAM04_DEL_FLG, T000C6_n215TAM04_DEL_FLG, T000C6_A234TAM04_CRT_PROG_NM, T000C6_n234TAM04_CRT_PROG_NM, T000C6_A236TAM04_UPD_PROG_NM,
            T000C6_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            T000C7_A13TAM04_AUTH_CD, T000C7_A233TAM04_CRT_DATETIME, T000C7_n233TAM04_CRT_DATETIME, T000C7_A266TAM04_CRT_USER_ID, T000C7_n266TAM04_CRT_USER_ID, T000C7_A235TAM04_UPD_DATETIME, T000C7_n235TAM04_UPD_DATETIME, T000C7_A267TAM04_UPD_USER_ID, T000C7_n267TAM04_UPD_USER_ID, T000C7_A286TAM04_UPD_CNT,
            T000C7_n286TAM04_UPD_CNT, T000C7_A285TAM04_AUTH_NM, T000C7_n285TAM04_AUTH_NM, T000C7_A687TAM04_AUTH_LVL, T000C7_n687TAM04_AUTH_LVL, T000C7_A215TAM04_DEL_FLG, T000C7_n215TAM04_DEL_FLG, T000C7_A234TAM04_CRT_PROG_NM, T000C7_n234TAM04_CRT_PROG_NM, T000C7_A236TAM04_UPD_PROG_NM,
            T000C7_n236TAM04_UPD_PROG_NM
            }
            , new Object[] {
            T000C8_A13TAM04_AUTH_CD
            }
            , new Object[] {
            T000C9_A13TAM04_AUTH_CD
            }
            , new Object[] {
            T000C10_A13TAM04_AUTH_CD
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000C14_A55TAM07_USER_ID
            }
            , new Object[] {
            T000C15_A50TBM07_AUTH_CD
            }
            , new Object[] {
            T000C16_A13TAM04_AUTH_CD
            }
            , new Object[] {
            T000C17_A13TAM04_AUTH_CD, T000C17_A290TAM05_CRT_DATETIME, T000C17_n290TAM05_CRT_DATETIME, T000C17_A291TAM05_CRT_USER_ID, T000C17_n291TAM05_CRT_USER_ID, T000C17_A293TAM05_UPD_DATETIME, T000C17_n293TAM05_UPD_DATETIME, T000C17_A294TAM05_UPD_USER_ID, T000C17_n294TAM05_UPD_USER_ID, T000C17_A296TAM05_UPD_CNT,
            T000C17_n296TAM05_UPD_CNT, T000C17_A288TAM05_KNGN_FLG, T000C17_n288TAM05_KNGN_FLG, T000C17_A289TAM05_DEL_FLG, T000C17_n289TAM05_DEL_FLG, T000C17_A292TAM05_CRT_PROG_NM, T000C17_n292TAM05_CRT_PROG_NM, T000C17_A295TAM05_UPD_PROG_NM, T000C17_n295TAM05_UPD_PROG_NM, T000C17_A12TAM03_APP_ID
            }
            , new Object[] {
            T000C18_A13TAM04_AUTH_CD, T000C18_A12TAM03_APP_ID
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T000C22_A13TAM04_AUTH_CD, T000C22_A12TAM03_APP_ID
            }
            , new Object[] {
            T000C23_A12TAM03_APP_ID
            }
         }
      );
      pr_default.setErrorHandler(this);
      AV12Pgmname = "TAM04BC_KNGN" ;
   }

   private byte Z687TAM04_AUTH_LVL ;
   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte A687TAM04_AUTH_LVL ;
   private byte subGridtam04bc_kngn_tam05_appli_Backcolorstyle ;
   private byte subGridtam04bc_kngn_tam05_appli_Allowselection ;
   private byte subGridtam04bc_kngn_tam05_appli_Allowhovering ;
   private byte subGridtam04bc_kngn_tam05_appli_Allowcollapsing ;
   private byte subGridtam04bc_kngn_tam05_appli_Collapsed ;
   private byte Gx_BScreen ;
   private byte subGridtam04bc_kngn_tam05_appli_Backstyle ;
   private byte wbTemp ;
   private short nRC_GXsfl_96 ;
   private short nGXsfl_96_idx=1 ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short nBlankRcdCount9 ;
   private short nRcdExists_9 ;
   private short RcdFound9 ;
   private short nIsMod_9 ;
   private short nBlankRcdUsr9 ;
   private short nRcdDeleted_9 ;
   private short RcdFound3 ;
   private short Gx_err ;
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
   private int subGridtam04bc_kngn_tam05_appli_Selectioncolor ;
   private int subGridtam04bc_kngn_tam05_appli_Hoveringcolor ;
   private int fRowAdded ;
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
   private int subGridtam04bc_kngn_tam05_appli_Backcolor ;
   private int subGridtam04bc_kngn_tam05_appli_Allbackcolor ;
   private int defedtTAM03_APP_ID_Enabled ;
   private int idxLst ;
   private int GXActiveErrHndl ;
   private long Z286TAM04_UPD_CNT ;
   private long O286TAM04_UPD_CNT ;
   private long A286TAM04_UPD_CNT ;
   private long A296TAM05_UPD_CNT ;
   private long B286TAM04_UPD_CNT ;
   private long GRIDTAM04BC_KNGN_TAM05_APPLI_nFirstRecordOnPage ;
   private long Z296TAM05_UPD_CNT ;
   private long T296TAM05_UPD_CNT ;
   private long O296TAM05_UPD_CNT ;
   private String sPrefix ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String sGXsfl_96_idx="0001" ;
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
   private String sMode9 ;
   private String edtTAM03_APP_ID_Internalname ;
   private String tblTable3_Internalname ;
   private String lblTitletam05_appli_Internalname ;
   private String lblTitletam05_appli_Jsonclick ;
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
   private String edtTAM05_KNGN_FLG_Internalname ;
   private String edtTAM05_DEL_FLG_Internalname ;
   private String edtTAM05_CRT_DATETIME_Internalname ;
   private String edtTAM05_CRT_USER_ID_Internalname ;
   private String edtTAM05_CRT_PROG_NM_Internalname ;
   private String edtTAM05_UPD_DATETIME_Internalname ;
   private String edtTAM05_UPD_USER_ID_Internalname ;
   private String edtTAM05_UPD_PROG_NM_Internalname ;
   private String edtTAM05_UPD_CNT_Internalname ;
   private String GXEncryptionTmp ;
   private String sMode3 ;
   private String sGXsfl_96_fel_idx="0001" ;
   private String subGridtam04bc_kngn_tam05_appli_Class ;
   private String subGridtam04bc_kngn_tam05_appli_Linesclass ;
   private String ROClassString ;
   private String edtTAM03_APP_ID_Jsonclick ;
   private String edtTAM05_KNGN_FLG_Jsonclick ;
   private String edtTAM05_DEL_FLG_Jsonclick ;
   private String edtTAM05_CRT_DATETIME_Jsonclick ;
   private String edtTAM05_CRT_USER_ID_Jsonclick ;
   private String edtTAM05_CRT_PROG_NM_Jsonclick ;
   private String edtTAM05_UPD_DATETIME_Jsonclick ;
   private String edtTAM05_UPD_USER_ID_Jsonclick ;
   private String edtTAM05_UPD_PROG_NM_Jsonclick ;
   private String edtTAM05_UPD_CNT_Jsonclick ;
   private String GXCCtl ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String subGridtam04bc_kngn_tam05_appli_Internalname ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String ZV12Pgmname ;
   private String Gx_emsg ;
   private java.util.Date Z233TAM04_CRT_DATETIME ;
   private java.util.Date Z235TAM04_UPD_DATETIME ;
   private java.util.Date A233TAM04_CRT_DATETIME ;
   private java.util.Date A235TAM04_UPD_DATETIME ;
   private java.util.Date A290TAM05_CRT_DATETIME ;
   private java.util.Date A293TAM05_UPD_DATETIME ;
   private java.util.Date Z290TAM05_CRT_DATETIME ;
   private java.util.Date Z293TAM05_UPD_DATETIME ;
   private boolean entryPointCalled ;
   private boolean wbErr ;
   private boolean n286TAM04_UPD_CNT ;
   private boolean n285TAM04_AUTH_NM ;
   private boolean n687TAM04_AUTH_LVL ;
   private boolean n215TAM04_DEL_FLG ;
   private boolean n233TAM04_CRT_DATETIME ;
   private boolean n266TAM04_CRT_USER_ID ;
   private boolean n234TAM04_CRT_PROG_NM ;
   private boolean n235TAM04_UPD_DATETIME ;
   private boolean n267TAM04_UPD_USER_ID ;
   private boolean n236TAM04_UPD_PROG_NM ;
   private boolean Gx_longc ;
   private boolean n290TAM05_CRT_DATETIME ;
   private boolean n291TAM05_CRT_USER_ID ;
   private boolean n293TAM05_UPD_DATETIME ;
   private boolean n294TAM05_UPD_USER_ID ;
   private boolean n296TAM05_UPD_CNT ;
   private boolean n288TAM05_KNGN_FLG ;
   private boolean n289TAM05_DEL_FLG ;
   private boolean n292TAM05_CRT_PROG_NM ;
   private boolean n295TAM05_UPD_PROG_NM ;
   private boolean toggleJsOutput ;
   private String Z13TAM04_AUTH_CD ;
   private String Z266TAM04_CRT_USER_ID ;
   private String Z267TAM04_UPD_USER_ID ;
   private String Z285TAM04_AUTH_NM ;
   private String Z215TAM04_DEL_FLG ;
   private String Z234TAM04_CRT_PROG_NM ;
   private String Z236TAM04_UPD_PROG_NM ;
   private String A12TAM03_APP_ID ;
   private String A13TAM04_AUTH_CD ;
   private String A285TAM04_AUTH_NM ;
   private String A215TAM04_DEL_FLG ;
   private String A266TAM04_CRT_USER_ID ;
   private String A234TAM04_CRT_PROG_NM ;
   private String A267TAM04_UPD_USER_ID ;
   private String A236TAM04_UPD_PROG_NM ;
   private String A288TAM05_KNGN_FLG ;
   private String A289TAM05_DEL_FLG ;
   private String A291TAM05_CRT_USER_ID ;
   private String A292TAM05_CRT_PROG_NM ;
   private String A294TAM05_UPD_USER_ID ;
   private String A295TAM05_UPD_PROG_NM ;
   private String Z12TAM03_APP_ID ;
   private String Z291TAM05_CRT_USER_ID ;
   private String Z294TAM05_UPD_USER_ID ;
   private String Z288TAM05_KNGN_FLG ;
   private String Z289TAM05_DEL_FLG ;
   private String Z292TAM05_CRT_PROG_NM ;
   private String Z295TAM05_UPD_PROG_NM ;
   private String AV11W_BC_FLG ;
   private String AV10W_TXT ;
   private com.genexus.webpanels.GXWebGrid Gridtam04bc_kngn_tam05_appliContainer ;
   private com.genexus.webpanels.GXWebRow Gridtam04bc_kngn_tam05_appliRow ;
   private com.genexus.webpanels.GXWebColumn Gridtam04bc_kngn_tam05_appliColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.GxUnknownObjectCollection isValidOutput ;
   private IDataStoreProvider pr_default ;
   private String[] T000C7_A13TAM04_AUTH_CD ;
   private java.util.Date[] T000C7_A233TAM04_CRT_DATETIME ;
   private boolean[] T000C7_n233TAM04_CRT_DATETIME ;
   private String[] T000C7_A266TAM04_CRT_USER_ID ;
   private boolean[] T000C7_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] T000C7_A235TAM04_UPD_DATETIME ;
   private boolean[] T000C7_n235TAM04_UPD_DATETIME ;
   private String[] T000C7_A267TAM04_UPD_USER_ID ;
   private boolean[] T000C7_n267TAM04_UPD_USER_ID ;
   private long[] T000C7_A286TAM04_UPD_CNT ;
   private boolean[] T000C7_n286TAM04_UPD_CNT ;
   private String[] T000C7_A285TAM04_AUTH_NM ;
   private boolean[] T000C7_n285TAM04_AUTH_NM ;
   private byte[] T000C7_A687TAM04_AUTH_LVL ;
   private boolean[] T000C7_n687TAM04_AUTH_LVL ;
   private String[] T000C7_A215TAM04_DEL_FLG ;
   private boolean[] T000C7_n215TAM04_DEL_FLG ;
   private String[] T000C7_A234TAM04_CRT_PROG_NM ;
   private boolean[] T000C7_n234TAM04_CRT_PROG_NM ;
   private String[] T000C7_A236TAM04_UPD_PROG_NM ;
   private boolean[] T000C7_n236TAM04_UPD_PROG_NM ;
   private String[] T000C8_A13TAM04_AUTH_CD ;
   private String[] T000C6_A13TAM04_AUTH_CD ;
   private java.util.Date[] T000C6_A233TAM04_CRT_DATETIME ;
   private boolean[] T000C6_n233TAM04_CRT_DATETIME ;
   private String[] T000C6_A266TAM04_CRT_USER_ID ;
   private boolean[] T000C6_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] T000C6_A235TAM04_UPD_DATETIME ;
   private boolean[] T000C6_n235TAM04_UPD_DATETIME ;
   private String[] T000C6_A267TAM04_UPD_USER_ID ;
   private boolean[] T000C6_n267TAM04_UPD_USER_ID ;
   private long[] T000C6_A286TAM04_UPD_CNT ;
   private boolean[] T000C6_n286TAM04_UPD_CNT ;
   private String[] T000C6_A285TAM04_AUTH_NM ;
   private boolean[] T000C6_n285TAM04_AUTH_NM ;
   private byte[] T000C6_A687TAM04_AUTH_LVL ;
   private boolean[] T000C6_n687TAM04_AUTH_LVL ;
   private String[] T000C6_A215TAM04_DEL_FLG ;
   private boolean[] T000C6_n215TAM04_DEL_FLG ;
   private String[] T000C6_A234TAM04_CRT_PROG_NM ;
   private boolean[] T000C6_n234TAM04_CRT_PROG_NM ;
   private String[] T000C6_A236TAM04_UPD_PROG_NM ;
   private boolean[] T000C6_n236TAM04_UPD_PROG_NM ;
   private String[] T000C9_A13TAM04_AUTH_CD ;
   private String[] T000C10_A13TAM04_AUTH_CD ;
   private String[] T000C5_A13TAM04_AUTH_CD ;
   private java.util.Date[] T000C5_A233TAM04_CRT_DATETIME ;
   private boolean[] T000C5_n233TAM04_CRT_DATETIME ;
   private String[] T000C5_A266TAM04_CRT_USER_ID ;
   private boolean[] T000C5_n266TAM04_CRT_USER_ID ;
   private java.util.Date[] T000C5_A235TAM04_UPD_DATETIME ;
   private boolean[] T000C5_n235TAM04_UPD_DATETIME ;
   private String[] T000C5_A267TAM04_UPD_USER_ID ;
   private boolean[] T000C5_n267TAM04_UPD_USER_ID ;
   private long[] T000C5_A286TAM04_UPD_CNT ;
   private boolean[] T000C5_n286TAM04_UPD_CNT ;
   private String[] T000C5_A285TAM04_AUTH_NM ;
   private boolean[] T000C5_n285TAM04_AUTH_NM ;
   private byte[] T000C5_A687TAM04_AUTH_LVL ;
   private boolean[] T000C5_n687TAM04_AUTH_LVL ;
   private String[] T000C5_A215TAM04_DEL_FLG ;
   private boolean[] T000C5_n215TAM04_DEL_FLG ;
   private String[] T000C5_A234TAM04_CRT_PROG_NM ;
   private boolean[] T000C5_n234TAM04_CRT_PROG_NM ;
   private String[] T000C5_A236TAM04_UPD_PROG_NM ;
   private boolean[] T000C5_n236TAM04_UPD_PROG_NM ;
   private String[] T000C14_A55TAM07_USER_ID ;
   private String[] T000C15_A50TBM07_AUTH_CD ;
   private String[] T000C16_A13TAM04_AUTH_CD ;
   private String[] T000C17_A13TAM04_AUTH_CD ;
   private java.util.Date[] T000C17_A290TAM05_CRT_DATETIME ;
   private boolean[] T000C17_n290TAM05_CRT_DATETIME ;
   private String[] T000C17_A291TAM05_CRT_USER_ID ;
   private boolean[] T000C17_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] T000C17_A293TAM05_UPD_DATETIME ;
   private boolean[] T000C17_n293TAM05_UPD_DATETIME ;
   private String[] T000C17_A294TAM05_UPD_USER_ID ;
   private boolean[] T000C17_n294TAM05_UPD_USER_ID ;
   private long[] T000C17_A296TAM05_UPD_CNT ;
   private boolean[] T000C17_n296TAM05_UPD_CNT ;
   private String[] T000C17_A288TAM05_KNGN_FLG ;
   private boolean[] T000C17_n288TAM05_KNGN_FLG ;
   private String[] T000C17_A289TAM05_DEL_FLG ;
   private boolean[] T000C17_n289TAM05_DEL_FLG ;
   private String[] T000C17_A292TAM05_CRT_PROG_NM ;
   private boolean[] T000C17_n292TAM05_CRT_PROG_NM ;
   private String[] T000C17_A295TAM05_UPD_PROG_NM ;
   private boolean[] T000C17_n295TAM05_UPD_PROG_NM ;
   private String[] T000C17_A12TAM03_APP_ID ;
   private String[] T000C4_A12TAM03_APP_ID ;
   private String[] T000C18_A13TAM04_AUTH_CD ;
   private String[] T000C18_A12TAM03_APP_ID ;
   private String[] T000C3_A13TAM04_AUTH_CD ;
   private java.util.Date[] T000C3_A290TAM05_CRT_DATETIME ;
   private boolean[] T000C3_n290TAM05_CRT_DATETIME ;
   private String[] T000C3_A291TAM05_CRT_USER_ID ;
   private boolean[] T000C3_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] T000C3_A293TAM05_UPD_DATETIME ;
   private boolean[] T000C3_n293TAM05_UPD_DATETIME ;
   private String[] T000C3_A294TAM05_UPD_USER_ID ;
   private boolean[] T000C3_n294TAM05_UPD_USER_ID ;
   private long[] T000C3_A296TAM05_UPD_CNT ;
   private boolean[] T000C3_n296TAM05_UPD_CNT ;
   private String[] T000C3_A288TAM05_KNGN_FLG ;
   private boolean[] T000C3_n288TAM05_KNGN_FLG ;
   private String[] T000C3_A289TAM05_DEL_FLG ;
   private boolean[] T000C3_n289TAM05_DEL_FLG ;
   private String[] T000C3_A292TAM05_CRT_PROG_NM ;
   private boolean[] T000C3_n292TAM05_CRT_PROG_NM ;
   private String[] T000C3_A295TAM05_UPD_PROG_NM ;
   private boolean[] T000C3_n295TAM05_UPD_PROG_NM ;
   private String[] T000C3_A12TAM03_APP_ID ;
   private String[] T000C2_A13TAM04_AUTH_CD ;
   private java.util.Date[] T000C2_A290TAM05_CRT_DATETIME ;
   private boolean[] T000C2_n290TAM05_CRT_DATETIME ;
   private String[] T000C2_A291TAM05_CRT_USER_ID ;
   private boolean[] T000C2_n291TAM05_CRT_USER_ID ;
   private java.util.Date[] T000C2_A293TAM05_UPD_DATETIME ;
   private boolean[] T000C2_n293TAM05_UPD_DATETIME ;
   private String[] T000C2_A294TAM05_UPD_USER_ID ;
   private boolean[] T000C2_n294TAM05_UPD_USER_ID ;
   private long[] T000C2_A296TAM05_UPD_CNT ;
   private boolean[] T000C2_n296TAM05_UPD_CNT ;
   private String[] T000C2_A288TAM05_KNGN_FLG ;
   private boolean[] T000C2_n288TAM05_KNGN_FLG ;
   private String[] T000C2_A289TAM05_DEL_FLG ;
   private boolean[] T000C2_n289TAM05_DEL_FLG ;
   private String[] T000C2_A292TAM05_CRT_PROG_NM ;
   private boolean[] T000C2_n292TAM05_CRT_PROG_NM ;
   private String[] T000C2_A295TAM05_UPD_PROG_NM ;
   private boolean[] T000C2_n295TAM05_UPD_PROG_NM ;
   private String[] T000C2_A12TAM03_APP_ID ;
   private String[] T000C22_A13TAM04_AUTH_CD ;
   private String[] T000C22_A12TAM03_APP_ID ;
   private String[] T000C23_A12TAM03_APP_ID ;
}

final  class tam04bc_kngn__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T000C2", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C3", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C4", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C5", "SELECT `TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C6", "SELECT `TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C7", "SELECT TM1.`TAM04_AUTH_CD`, TM1.`TAM04_CRT_DATETIME`, TM1.`TAM04_CRT_USER_ID`, TM1.`TAM04_UPD_DATETIME`, TM1.`TAM04_UPD_USER_ID`, TM1.`TAM04_UPD_CNT`, TM1.`TAM04_AUTH_NM`, TM1.`TAM04_AUTH_LVL`, TM1.`TAM04_DEL_FLG`, TM1.`TAM04_CRT_PROG_NM`, TM1.`TAM04_UPD_PROG_NM` FROM `TAM04_KNGN` TM1 WHERE TM1.`TAM04_AUTH_CD` = ? ORDER BY TM1.`TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000C8", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE `TAM04_AUTH_CD` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new ForEachCursor("T000C9", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE ( `TAM04_AUTH_CD` > ?) ORDER BY `TAM04_AUTH_CD`  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000C10", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` WHERE ( `TAM04_AUTH_CD` < ?) ORDER BY `TAM04_AUTH_CD` DESC  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new UpdateCursor("T000C11", "INSERT INTO `TAM04_KNGN`(`TAM04_AUTH_CD`, `TAM04_CRT_DATETIME`, `TAM04_CRT_USER_ID`, `TAM04_UPD_DATETIME`, `TAM04_UPD_USER_ID`, `TAM04_UPD_CNT`, `TAM04_AUTH_NM`, `TAM04_AUTH_LVL`, `TAM04_DEL_FLG`, `TAM04_CRT_PROG_NM`, `TAM04_UPD_PROG_NM`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000C12", "UPDATE `TAM04_KNGN` SET `TAM04_CRT_DATETIME`=?, `TAM04_CRT_USER_ID`=?, `TAM04_UPD_DATETIME`=?, `TAM04_UPD_USER_ID`=?, `TAM04_UPD_CNT`=?, `TAM04_AUTH_NM`=?, `TAM04_AUTH_LVL`=?, `TAM04_DEL_FLG`=?, `TAM04_CRT_PROG_NM`=?, `TAM04_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new UpdateCursor("T000C13", "DELETE FROM `TAM04_KNGN`  WHERE `TAM04_AUTH_CD` = ?", GX_NOMASK)
         ,new ForEachCursor("T000C14", "SELECT `TAM07_USER_ID` FROM `TAM07_USER` WHERE `TAM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000C15", "SELECT `TBM07_AUTH_CD` FROM `TBM07_AUTH_BEHAVIOR` WHERE `TBM07_AUTH_CD` = ?  LIMIT 1",true, GX_NOMASK, false, this,1,0,true )
         ,new ForEachCursor("T000C16", "SELECT `TAM04_AUTH_CD` FROM `TAM04_KNGN` ORDER BY `TAM04_AUTH_CD` ",true, GX_NOMASK, false, this,100,0,false )
         ,new ForEachCursor("T000C17", "SELECT `TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? and `TAM03_APP_ID` = ? ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000C18", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
         ,new UpdateCursor("T000C19", "INSERT INTO `TAM05_APPLI_KNGN`(`TAM04_AUTH_CD`, `TAM05_CRT_DATETIME`, `TAM05_CRT_USER_ID`, `TAM05_UPD_DATETIME`, `TAM05_UPD_USER_ID`, `TAM05_UPD_CNT`, `TAM05_KNGN_FLG`, `TAM05_DEL_FLG`, `TAM05_CRT_PROG_NM`, `TAM05_UPD_PROG_NM`, `TAM03_APP_ID`) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T000C20", "UPDATE `TAM05_APPLI_KNGN` SET `TAM05_CRT_DATETIME`=?, `TAM05_CRT_USER_ID`=?, `TAM05_UPD_DATETIME`=?, `TAM05_UPD_USER_ID`=?, `TAM05_UPD_CNT`=?, `TAM05_KNGN_FLG`=?, `TAM05_DEL_FLG`=?, `TAM05_CRT_PROG_NM`=?, `TAM05_UPD_PROG_NM`=?  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new UpdateCursor("T000C21", "DELETE FROM `TAM05_APPLI_KNGN`  WHERE `TAM04_AUTH_CD` = ? AND `TAM03_APP_ID` = ?", GX_NOMASK)
         ,new ForEachCursor("T000C22", "SELECT `TAM04_AUTH_CD`, `TAM03_APP_ID` FROM `TAM05_APPLI_KNGN` WHERE `TAM04_AUTH_CD` = ? ORDER BY `TAM04_AUTH_CD`, `TAM03_APP_ID` ",true, GX_NOMASK, false, this,11,0,false )
         ,new ForEachCursor("T000C23", "SELECT `TAM03_APP_ID` FROM `TAM03_APPLI` WHERE `TAM03_APP_ID` = ? ",true, GX_NOMASK, false, this,1,0,false )
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
               ((byte[]) buf[13])[0] = rslt.getByte(8) ;
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getVarchar(9) ;
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getVarchar(10) ;
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getVarchar(11) ;
               ((boolean[]) buf[20])[0] = rslt.wasNull();
               return;
            case 4 :
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
            case 5 :
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
            case 6 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 12 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 13 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 14 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               return;
            case 15 :
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
               return;
            case 16 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 20 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1) ;
               ((String[]) buf[1])[0] = rslt.getVarchar(2) ;
               return;
            case 21 :
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
               stmt.setVarchar(1, (String)parms[0], 7, false);
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
               return;
            case 7 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 9 :
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
            case 10 :
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
            case 11 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 12 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 13 :
               stmt.setVarchar(1, (String)parms[0], 2);
               return;
            case 15 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 16 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 17 :
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
                  stmt.setVarchar(9, (String)parms[16], 40);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(10, (String)parms[18], 40);
               }
               stmt.setVarchar(11, (String)parms[19], 7, false);
               return;
            case 18 :
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
            case 19 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               stmt.setVarchar(2, (String)parms[1], 7, false);
               return;
            case 20 :
               stmt.setVarchar(1, (String)parms[0], 2, false);
               return;
            case 21 :
               stmt.setVarchar(1, (String)parms[0], 7, false);
               return;
      }
   }

}

